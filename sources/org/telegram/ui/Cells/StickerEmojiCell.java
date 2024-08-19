package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$DocumentAttribute;
import org.telegram.tgnet.TLRPC$PhotoSize;
import org.telegram.tgnet.TLRPC$TL_documentAttributeSticker;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ListView.RecyclerListViewWithOverlayDraw;
import org.telegram.ui.Components.Premium.PremiumLockIconView;

public class StickerEmojiCell extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, RecyclerListViewWithOverlayDraw.OverlayView {
    private static AccelerateInterpolator interpolator = new AccelerateInterpolator(0.5f);
    private float alpha;
    private boolean changingAlpha;
    private int currentAccount;
    private String currentEmoji;
    private boolean drawInParentView;
    public ImageView editModeIcon;
    private int editModeIconColor;
    private TextView emojiTextView;
    private boolean fromEmojiPanel;
    private ImageReceiver imageView;
    private boolean isPremiumSticker;
    private long lastUpdateTime;
    private Object parentObject;
    private float premiumAlpha;
    private PremiumLockIconView premiumIconView;
    private boolean recent;
    private final Theme.ResourcesProvider resourceProvider;
    private float scale;
    private boolean scaled;
    private boolean showPremiumLock;
    private TLRPC$Document sticker;
    private SendMessagesHelper.ImportingSticker stickerPath;
    private long time;

    public StickerEmojiCell(Context context, boolean z, final Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.alpha = 1.0f;
        this.currentAccount = UserConfig.selectedAccount;
        this.premiumAlpha = 1.0f;
        this.resourceProvider = resourcesProvider;
        this.fromEmojiPanel = z;
        ImageReceiver imageReceiver = new ImageReceiver() {
            @Override
            public boolean setImageBitmapByKey(Drawable drawable, String str, int i, boolean z2, int i2) {
                if ((drawable instanceof BitmapDrawable) && StickerEmojiCell.this.editModeIconColor == 0) {
                    Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                    StickerEmojiCell.this.editModeIconColor = AndroidUtilities.getDominantColor(bitmap);
                    if (StickerEmojiCell.this.editModeIconColor == -1 || StickerEmojiCell.this.editModeIconColor == 0) {
                        StickerEmojiCell.this.editModeIconColor = Theme.getColor(Theme.key_dialogTextGray2, resourcesProvider);
                    }
                    StickerEmojiCell.this.editModeIcon.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(12.0f), StickerEmojiCell.this.editModeIconColor));
                    invalidate();
                }
                return super.setImageBitmapByKey(drawable, str, i, z2, i2);
            }
        };
        this.imageView = imageReceiver;
        imageReceiver.setAspectFit(true);
        this.imageView.setAllowLoadingOnAttachedOnly(true);
        this.imageView.setLayerNum(1);
        TextView textView = new TextView(context);
        this.emojiTextView = textView;
        textView.setTextSize(1, 16.0f);
        new Paint(1).setColor(Theme.getColor(Theme.key_featuredStickers_addButton));
        PremiumLockIconView premiumLockIconView = new PremiumLockIconView(context, PremiumLockIconView.TYPE_STICKERS_PREMIUM_LOCKED);
        this.premiumIconView = premiumLockIconView;
        premiumLockIconView.setImageReceiver(this.imageView);
        this.premiumIconView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        this.premiumIconView.setImageReceiver(this.imageView);
        addView(this.premiumIconView, LayoutHelper.createFrame(24, 24.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.editModeIcon = imageView;
        imageView.setImageResource(R.drawable.mini_more_dots);
        this.editModeIcon.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        this.editModeIcon.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(12.0f), Theme.getColor(Theme.key_dialogTextGray2, resourcesProvider)));
        this.editModeIcon.setAlpha(0.0f);
        addView(this.editModeIcon, LayoutHelper.createFrame(-2, -2, 5));
        setFocusable(true);
    }

    public TLRPC$Document getSticker() {
        return this.sticker;
    }

    public SendMessagesHelper.ImportingSticker getStickerPath() {
        SendMessagesHelper.ImportingSticker importingSticker = this.stickerPath;
        if (importingSticker == null || !importingSticker.validated) {
            return null;
        }
        return importingSticker;
    }

    public String getEmoji() {
        return this.currentEmoji;
    }

    public Object getParentObject() {
        return this.parentObject;
    }

    public boolean isRecent() {
        return this.recent;
    }

    public void setRecent(boolean z) {
        this.recent = z;
    }

    public void setSticker(TLRPC$Document tLRPC$Document, Object obj, boolean z) {
        setSticker(tLRPC$Document, null, obj, null, z, false);
    }

    public void setSticker(SendMessagesHelper.ImportingSticker importingSticker) {
        String str = importingSticker.emoji;
        setSticker(null, importingSticker, null, str, str != null, false);
    }

    public MessageObject.SendAnimationData getSendAnimationData() {
        ImageReceiver imageReceiver = this.imageView;
        if (!imageReceiver.hasNotThumb()) {
            return null;
        }
        MessageObject.SendAnimationData sendAnimationData = new MessageObject.SendAnimationData();
        getLocationInWindow(new int[2]);
        sendAnimationData.x = imageReceiver.getCenterX() + r2[0];
        sendAnimationData.y = imageReceiver.getCenterY() + r2[1];
        sendAnimationData.width = imageReceiver.getImageWidth();
        sendAnimationData.height = imageReceiver.getImageHeight();
        return sendAnimationData;
    }

    public void setSticker(TLRPC$Document tLRPC$Document, SendMessagesHelper.ImportingSticker importingSticker, Object obj, String str, boolean z) {
        setSticker(tLRPC$Document, importingSticker, obj, str, z, false);
    }

    public void disableEditMode(boolean z) {
        if (z) {
            this.editModeIcon.animate().alpha(0.0f).scaleX(0.4f).scaleY(0.4f).setDuration(200L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
        } else {
            this.editModeIcon.setAlpha(0.0f);
        }
    }

    public void enableEditMode(boolean z) {
        if (z) {
            this.editModeIcon.setAlpha(0.0f);
            this.editModeIcon.setScaleX(0.4f);
            this.editModeIcon.setScaleY(0.4f);
            this.editModeIcon.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(200L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
            return;
        }
        this.editModeIcon.setAlpha(1.0f);
        this.editModeIcon.setScaleX(1.0f);
        this.editModeIcon.setScaleY(1.0f);
    }

    public void setSticker(TLRPC$Document tLRPC$Document, SendMessagesHelper.ImportingSticker importingSticker, Object obj, String str, boolean z, boolean z2) {
        boolean z3;
        this.currentEmoji = str;
        this.isPremiumSticker = MessageObject.isPremiumSticker(tLRPC$Document);
        this.drawInParentView = false;
        this.imageView.setColorFilter(null);
        this.editModeIconColor = 0;
        this.editModeIcon.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(12.0f), Theme.getColor(Theme.key_dialogTextGray2)));
        if (z2) {
            enableEditMode(false);
        } else {
            disableEditMode(false);
        }
        if (this.isPremiumSticker) {
            this.premiumIconView.setColor(Theme.getColor(Theme.key_windowBackgroundWhite));
            this.premiumIconView.setWaitingImage();
        }
        if (importingSticker != null) {
            this.stickerPath = importingSticker;
            if (importingSticker.validated) {
                this.imageView.setImage(ImageLocation.getForPath(importingSticker.path), "80_80", null, null, DocumentObject.getSvgRectThumb(Theme.key_dialogBackgroundGray, 1.0f), 0L, importingSticker.animated ? "tgs" : null, 0, 1);
            } else {
                this.imageView.setImage(null, null, null, null, DocumentObject.getSvgRectThumb(Theme.key_dialogBackgroundGray, 1.0f), 0L, importingSticker.animated ? "tgs" : null, 0, 1);
            }
            if (str != null) {
                TextView textView = this.emojiTextView;
                textView.setText(Emoji.replaceEmoji((CharSequence) str, textView.getPaint().getFontMetricsInt(), AndroidUtilities.dp(16.0f), false));
                this.emojiTextView.setVisibility(0);
            } else {
                this.emojiTextView.setVisibility(4);
            }
            z3 = true;
        } else {
            z3 = true;
            if (tLRPC$Document != null) {
                this.sticker = tLRPC$Document;
                this.parentObject = obj;
                TLRPC$PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tLRPC$Document.thumbs, 90);
                boolean z4 = this.fromEmojiPanel;
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tLRPC$Document, z4 ? Theme.key_emptyListPlaceholder : Theme.key_windowBackgroundGray, z4 ? 0.2f : 1.0f, 1.0f, this.resourceProvider);
                String str2 = this.fromEmojiPanel ? "66_66_pcache_compress" : "66_66";
                if (MessageObject.isTextColorEmoji(tLRPC$Document)) {
                    this.imageView.setColorFilter(Theme.getAnimatedEmojiColorFilter(this.resourceProvider));
                }
                if (MessageObject.canAutoplayAnimatedSticker(tLRPC$Document)) {
                    if (this.fromEmojiPanel) {
                        this.drawInParentView = true;
                    }
                    if (svgThumb != null) {
                        this.imageView.setImage(ImageLocation.getForDocument(tLRPC$Document), str2, ImageLocation.getForDocument(closestPhotoSizeWithSize, tLRPC$Document), null, null, null, svgThumb, 0L, null, this.parentObject, 1);
                    } else if (closestPhotoSizeWithSize != null) {
                        this.imageView.setImage(ImageLocation.getForDocument(tLRPC$Document), str2, ImageLocation.getForDocument(closestPhotoSizeWithSize, tLRPC$Document), (String) null, (String) null, this.parentObject, 1);
                    } else {
                        this.imageView.setImage(ImageLocation.getForDocument(tLRPC$Document), str2, null, null, this.parentObject, 1);
                    }
                } else if (svgThumb != null) {
                    if (closestPhotoSizeWithSize != null) {
                        this.imageView.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize, tLRPC$Document), str2, svgThumb, "webp", this.parentObject, 1);
                    } else {
                        this.imageView.setImage(ImageLocation.getForDocument(tLRPC$Document), str2, svgThumb, "webp", this.parentObject, 1);
                    }
                } else if (closestPhotoSizeWithSize != null) {
                    this.imageView.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize, tLRPC$Document), str2, null, "webp", this.parentObject, 1);
                } else {
                    this.imageView.setImage(ImageLocation.getForDocument(tLRPC$Document), str2, null, "webp", this.parentObject, 1);
                }
                if (str != null) {
                    TextView textView2 = this.emojiTextView;
                    textView2.setText(Emoji.replaceEmoji((CharSequence) str, textView2.getPaint().getFontMetricsInt(), AndroidUtilities.dp(16.0f), false));
                    this.emojiTextView.setVisibility(0);
                } else if (z) {
                    int i = 0;
                    while (true) {
                        if (i >= tLRPC$Document.attributes.size()) {
                            break;
                        }
                        TLRPC$DocumentAttribute tLRPC$DocumentAttribute = tLRPC$Document.attributes.get(i);
                        if (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeSticker) {
                            String str3 = tLRPC$DocumentAttribute.alt;
                            if (str3 != null && str3.length() > 0) {
                                TextView textView3 = this.emojiTextView;
                                textView3.setText(Emoji.replaceEmoji((CharSequence) tLRPC$DocumentAttribute.alt, textView3.getPaint().getFontMetricsInt(), AndroidUtilities.dp(16.0f), false));
                            }
                        } else {
                            i++;
                        }
                    }
                    this.emojiTextView.setText(Emoji.replaceEmoji((CharSequence) MediaDataController.getInstance(this.currentAccount).getEmojiForSticker(this.sticker.id), this.emojiTextView.getPaint().getFontMetricsInt(), AndroidUtilities.dp(16.0f), false));
                    this.emojiTextView.setVisibility(0);
                } else {
                    this.emojiTextView.setVisibility(4);
                }
            }
        }
        updatePremiumStatus(false);
        this.imageView.setAlpha(this.alpha * this.premiumAlpha);
        if (this.drawInParentView) {
            this.imageView.setInvalidateAll(z3);
            this.imageView.setParentView((View) getParent());
        } else {
            this.imageView.setParentView(this);
        }
    }

    private void updatePremiumStatus(boolean z) {
        if (this.isPremiumSticker) {
            this.showPremiumLock = true;
        } else {
            this.showPremiumLock = false;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.premiumIconView.getLayoutParams();
        if (!UserConfig.getInstance(this.currentAccount).isPremium()) {
            int dp = AndroidUtilities.dp(24.0f);
            layoutParams.width = dp;
            layoutParams.height = dp;
            layoutParams.gravity = 81;
            layoutParams.rightMargin = 0;
            layoutParams.bottomMargin = AndroidUtilities.dp(8.0f);
            this.premiumIconView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        } else {
            int dp2 = AndroidUtilities.dp(16.0f);
            layoutParams.width = dp2;
            layoutParams.height = dp2;
            layoutParams.gravity = 85;
            layoutParams.bottomMargin = AndroidUtilities.dp(8.0f);
            layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
            this.premiumIconView.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
        }
        this.premiumIconView.setLocked(!UserConfig.getInstance(this.currentAccount).isPremium());
        AndroidUtilities.updateViewVisibilityAnimated(this.premiumIconView, this.showPremiumLock, 0.9f, z);
        invalidate();
    }

    public void disable() {
        this.changingAlpha = true;
        this.alpha = 0.5f;
        this.time = 0L;
        this.imageView.setAlpha(this.premiumAlpha * 0.5f);
        this.imageView.invalidate();
        this.lastUpdateTime = System.currentTimeMillis();
        invalidate();
    }

    public void setScaled(boolean z) {
        this.scaled = z;
        this.lastUpdateTime = System.currentTimeMillis();
        invalidate();
    }

    public boolean isDisabled() {
        return this.changingAlpha;
    }

    public boolean showingBitmap() {
        return this.imageView.hasNotThumb();
    }

    public ImageReceiver getImageView() {
        return this.imageView;
    }

    @Override
    public void invalidate() {
        if (this.drawInParentView && getParent() != null) {
            ((View) getParent()).invalidate();
        }
        this.emojiTextView.invalidate();
        super.invalidate();
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String string = LocaleController.getString(R.string.AttachSticker);
        if (this.sticker != null) {
            int i = 0;
            while (true) {
                if (i >= this.sticker.attributes.size()) {
                    break;
                }
                TLRPC$DocumentAttribute tLRPC$DocumentAttribute = this.sticker.attributes.get(i);
                if (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeSticker) {
                    String str = tLRPC$DocumentAttribute.alt;
                    if (str != null && str.length() > 0) {
                        TextView textView = this.emojiTextView;
                        textView.setText(Emoji.replaceEmoji((CharSequence) tLRPC$DocumentAttribute.alt, textView.getPaint().getFontMetricsInt(), AndroidUtilities.dp(16.0f), false));
                        string = tLRPC$DocumentAttribute.alt + " " + string;
                    }
                } else {
                    i++;
                }
            }
        }
        accessibilityNodeInfo.setContentDescription(string);
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.drawInParentView) {
            this.imageView.setInvalidateAll(true);
            this.imageView.setParentView((View) getParent());
        } else {
            this.imageView.setParentView(this);
        }
        this.imageView.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.imageView.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.currentUserPremiumStatusChanged) {
            updatePremiumStatus(true);
        }
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        if (!this.drawInParentView) {
            drawInternal(this, canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public void preDraw(View view, Canvas canvas) {
        if (this.drawInParentView) {
            drawInternal(view, canvas);
        }
    }

    private void drawInternal(View view, Canvas canvas) {
        boolean z;
        if (this.changingAlpha || (((z = this.scaled) && this.scale != 0.8f) || (!z && this.scale != 1.0f))) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = currentTimeMillis - this.lastUpdateTime;
            this.lastUpdateTime = currentTimeMillis;
            if (this.changingAlpha) {
                long j2 = this.time + j;
                this.time = j2;
                if (j2 > 1050) {
                    this.time = 1050L;
                }
                float interpolation = (interpolator.getInterpolation(((float) this.time) / 150.0f) * 0.5f) + 0.5f;
                this.alpha = interpolation;
                if (interpolation >= 1.0f) {
                    this.changingAlpha = false;
                    this.alpha = 1.0f;
                }
                this.imageView.setAlpha(this.alpha * this.premiumAlpha);
            } else {
                if (this.scaled) {
                    float f = this.scale;
                    if (f != 0.8f) {
                        float f2 = f - (((float) j) / 400.0f);
                        this.scale = f2;
                        if (f2 < 0.8f) {
                            this.scale = 0.8f;
                        }
                    }
                }
                float f3 = this.scale + (((float) j) / 400.0f);
                this.scale = f3;
                if (f3 > 1.0f) {
                    this.scale = 1.0f;
                }
            }
            view.invalidate();
        }
        int min = Math.min(AndroidUtilities.dp(66.0f), Math.min(getMeasuredHeight(), getMeasuredWidth()));
        float measuredWidth = getMeasuredWidth() >> 1;
        float f4 = min;
        float f5 = f4 / 2.0f;
        float measuredHeight = getMeasuredHeight() >> 1;
        this.imageView.setImageCoords(measuredWidth - f5, measuredHeight - f5, f4, f4);
        this.imageView.setAlpha(this.alpha * this.premiumAlpha);
        if (this.scale != 1.0f) {
            canvas.save();
            float f6 = this.scale;
            canvas.scale(f6, f6, measuredWidth, measuredHeight);
            this.imageView.draw(canvas);
            canvas.restore();
            return;
        }
        this.imageView.draw(canvas);
    }
}
