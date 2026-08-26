package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
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
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ListView.RecyclerListViewWithOverlayDraw;
import org.telegram.ui.Components.Premium.PremiumLockIconView;

public class StickerEmojiCell extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, RecyclerListViewWithOverlayDraw.OverlayView {
    public static final AccelerateInterpolator interpolator = new AccelerateInterpolator(0.5f);
    public float alpha;
    public boolean changingAlpha;
    public final int currentAccount;
    public String currentEmoji;
    public boolean drawInParentView;
    public final ImageView editModeIcon;
    public int editModeIconColor;
    public final TextView emojiTextView;
    public final boolean fromEmojiPanel;
    public final AnonymousClass1 imageView;
    public boolean isPremiumSticker;
    public long lastUpdateTime;
    public Object parentObject;
    public final float premiumAlpha;
    public final PremiumLockIconView premiumIconView;
    public boolean recent;
    public final Theme.ResourcesProvider resourceProvider;
    public float scale;
    public boolean scaled;
    public boolean showPremiumLock;
    public TLRPC.Document sticker;
    public SendMessagesHelper.ImportingSticker stickerPath;
    public long time;

    public StickerEmojiCell(Context context, final Theme.ResourcesProvider resourcesProvider, boolean z) {
        super(context);
        this.alpha = 1.0f;
        this.currentAccount = UserConfig.selectedAccount;
        this.premiumAlpha = 1.0f;
        this.resourceProvider = resourcesProvider;
        this.fromEmojiPanel = z;
        ?? r3 = new ImageReceiver() {
            @Override
            public final boolean setImageBitmapByKey(Drawable drawable, String str, int i, boolean z2, int i2) {
                if (drawable instanceof BitmapDrawable) {
                    StickerEmojiCell stickerEmojiCell = StickerEmojiCell.this;
                    if (stickerEmojiCell.editModeIconColor == 0) {
                        stickerEmojiCell.editModeIconColor = AndroidUtilities.getDominantColor(((BitmapDrawable) drawable).getBitmap());
                        int i3 = stickerEmojiCell.editModeIconColor;
                        if (i3 == -1 || i3 == 0) {
                            stickerEmojiCell.editModeIconColor = Theme.getColor(Theme.key_dialogTextGray2, resourcesProvider);
                        }
                        stickerEmojiCell.editModeIcon.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(12.0f), stickerEmojiCell.editModeIconColor));
                        invalidate();
                    }
                }
                return super.setImageBitmapByKey(drawable, str, i, z2, i2);
            }
        };
        this.imageView = r3;
        r3.setAspectFit(true);
        r3.setAllowLoadingOnAttachedOnly(true);
        r3.setLayerNum(1);
        TextView textView = new TextView(context);
        this.emojiTextView = textView;
        textView.setTextSize(1, 16.0f);
        new Paint(1).setColor(Theme.getColor(null, Theme.key_featuredStickers_addButton, false));
        PremiumLockIconView premiumLockIconView = new PremiumLockIconView(context, 1, null);
        this.premiumIconView = premiumLockIconView;
        premiumLockIconView.setImageReceiver(r3);
        premiumLockIconView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        premiumLockIconView.setImageReceiver(r3);
        addView(premiumLockIconView, LayoutHelper.createFrame(24, 24.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.editModeIcon = imageView;
        imageView.setImageResource(R.drawable.mini_more_dots);
        imageView.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        imageView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(12.0f), Theme.getColor(Theme.key_dialogTextGray2, resourcesProvider)));
        imageView.setAlpha(0.0f);
        addView(imageView, LayoutHelper.createFrame(-2, -2, 5));
        setFocusable(true);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.currentUserPremiumStatusChanged) {
            updatePremiumStatus(true);
        }
    }

    public final void disableEditMode(boolean z) {
        ImageView imageView = this.editModeIcon;
        if (z) {
            imageView.animate().alpha(0.0f).scaleX(0.4f).scaleY(0.4f).setDuration(200L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
        } else {
            imageView.setAlpha(0.0f);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (!this.drawInParentView) {
            drawInternal(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    public final void drawInternal(Canvas canvas, ViewGroup viewGroup) {
        float f;
        boolean z;
        boolean z2 = this.changingAlpha;
        float f2 = this.premiumAlpha;
        AnonymousClass1 anonymousClass1 = this.imageView;
        if (z2 || (((z = this.scaled) && this.scale != 0.8f) || (!z && this.scale != 1.0f))) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = jCurrentTimeMillis - this.lastUpdateTime;
            this.lastUpdateTime = jCurrentTimeMillis;
            if (this.changingAlpha) {
                long j2 = this.time + j;
                this.time = j2;
                if (j2 > 1050) {
                    this.time = 1050L;
                }
                float interpolation = (interpolator.getInterpolation(this.time / 150.0f) * 0.5f) + 0.5f;
                this.alpha = interpolation;
                if (interpolation >= 1.0f) {
                    this.changingAlpha = false;
                    this.alpha = 1.0f;
                }
                anonymousClass1.setAlpha(this.alpha * f2);
            } else if (this.scaled) {
                float f3 = this.scale;
                if (f3 != 0.8f) {
                    float f4 = f3 - (j / 400.0f);
                    this.scale = f4;
                    if (f4 < 0.8f) {
                        this.scale = 0.8f;
                    }
                } else {
                    f = (j / 400.0f) + this.scale;
                    this.scale = f;
                    if (f > 1.0f) {
                        this.scale = 1.0f;
                    }
                }
            } else {
                f = (j / 400.0f) + this.scale;
                this.scale = f;
                if (f > 1.0f) {
                    this.scale = 1.0f;
                }
            }
            viewGroup.invalidate();
        }
        int iMin = Math.min(AndroidUtilities.dp(66.0f), Math.min(getMeasuredHeight(), getMeasuredWidth()));
        float measuredWidth = getMeasuredWidth() >> 1;
        float f5 = iMin;
        float f6 = f5 / 2.0f;
        float measuredHeight = getMeasuredHeight() >> 1;
        anonymousClass1.setImageCoords(measuredWidth - f6, measuredHeight - f6, f5, f5);
        anonymousClass1.setAlpha(this.alpha * f2);
        if (this.scale == 1.0f) {
            anonymousClass1.draw(canvas);
            return;
        }
        canvas.save();
        float f7 = this.scale;
        canvas.scale(f7, f7, measuredWidth, measuredHeight);
        anonymousClass1.draw(canvas);
        canvas.restore();
    }

    public final void enableEditMode(boolean z) {
        ImageView imageView = this.editModeIcon;
        if (!z) {
            imageView.setAlpha(1.0f);
            imageView.setScaleX(1.0f);
            imageView.setScaleY(1.0f);
        } else {
            imageView.setAlpha(0.0f);
            imageView.setScaleX(0.4f);
            imageView.setScaleY(0.4f);
            imageView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(200L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
        }
    }

    public String getEmoji() {
        return this.currentEmoji;
    }

    public ImageReceiver getImageView() {
        return this.imageView;
    }

    public Object getParentObject() {
        return this.parentObject;
    }

    public MessageObject.SendAnimationData getSendAnimationData() {
        AnonymousClass1 anonymousClass1 = this.imageView;
        if (!anonymousClass1.hasNotThumb()) {
            return null;
        }
        MessageObject.SendAnimationData sendAnimationData = new MessageObject.SendAnimationData();
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        sendAnimationData.x = anonymousClass1.getCenterX() + iArr[0];
        sendAnimationData.y = anonymousClass1.getCenterY() + iArr[1];
        sendAnimationData.width = anonymousClass1.getImageWidth();
        sendAnimationData.height = anonymousClass1.getImageHeight();
        return sendAnimationData;
    }

    public TLRPC.Document getSticker() {
        return this.sticker;
    }

    public SendMessagesHelper.ImportingSticker getStickerPath() {
        SendMessagesHelper.ImportingSticker importingSticker = this.stickerPath;
        if (importingSticker == null || !importingSticker.validated) {
            return null;
        }
        return importingSticker;
    }

    @Override
    public final void invalidate() {
        if (this.drawInParentView && getParent() != null) {
            ((View) getParent()).invalidate();
        }
        this.emojiTextView.invalidate();
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        boolean z = this.drawInParentView;
        AnonymousClass1 anonymousClass1 = this.imageView;
        if (z) {
            anonymousClass1.setInvalidateAll(true);
            anonymousClass1.setParentView((View) getParent());
        } else {
            anonymousClass1.setParentView(this);
        }
        anonymousClass1.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String string = LocaleController.getString(R.string.AttachSticker);
        if (this.sticker != null) {
            for (int i = 0; i < this.sticker.attributes.size(); i++) {
                TLRPC.DocumentAttribute documentAttribute = this.sticker.attributes.get(i);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                    String str = documentAttribute.alt;
                    if (str == null || str.length() <= 0) {
                        break;
                        break;
                    }
                    TextView textView = this.emojiTextView;
                    textView.setText(Emoji.replaceEmoji(documentAttribute.alt, textView.getPaint().getFontMetricsInt(), false));
                    string = SurfaceContainer$$ExternalSyntheticOutline0.m(documentAttribute.alt, " ", string, new StringBuilder());
                    break;
                }
            }
        }
        accessibilityNodeInfo.setContentDescription(string);
        accessibilityNodeInfo.setEnabled(true);
    }

    public void setRecent(boolean z) {
        this.recent = z;
    }

    public void setScaled(boolean z) {
        this.scaled = z;
        this.lastUpdateTime = System.currentTimeMillis();
        invalidate();
    }

    public void setSticker(SendMessagesHelper.ImportingSticker importingSticker) {
        String str = importingSticker.emoji;
        setSticker(null, importingSticker, null, str, str != null, false);
    }

    public final void updatePremiumStatus(boolean z) {
        if (this.isPremiumSticker) {
            this.showPremiumLock = true;
        } else {
            this.showPremiumLock = false;
        }
        PremiumLockIconView premiumLockIconView = this.premiumIconView;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) premiumLockIconView.getLayoutParams();
        int i = this.currentAccount;
        if (UserConfig.getInstance(i).isPremium()) {
            int iDp = AndroidUtilities.dp(16.0f);
            layoutParams.width = iDp;
            layoutParams.height = iDp;
            layoutParams.gravity = 85;
            layoutParams.bottomMargin = AndroidUtilities.dp(8.0f);
            layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
            premiumLockIconView.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
        } else {
            int iDp2 = AndroidUtilities.dp(24.0f);
            layoutParams.width = iDp2;
            layoutParams.height = iDp2;
            layoutParams.gravity = 81;
            layoutParams.rightMargin = 0;
            layoutParams.bottomMargin = AndroidUtilities.dp(8.0f);
            premiumLockIconView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        }
        premiumLockIconView.setLocked(!UserConfig.getInstance(i).isPremium());
        AndroidUtilities.updateViewVisibilityAnimated(premiumLockIconView, this.showPremiumLock, 0.9f, z);
        invalidate();
    }

    public final void setSticker(TLRPC.Document document, SendMessagesHelper.ImportingSticker importingSticker, Object obj, String str, boolean z, boolean z2) {
        AnonymousClass1 anonymousClass1;
        AnonymousClass1 anonymousClass2;
        TextView textView;
        int i;
        this.currentEmoji = str;
        this.isPremiumSticker = MessageObject.isPremiumSticker(document);
        this.drawInParentView = false;
        AnonymousClass1 anonymousClass3 = this.imageView;
        anonymousClass3.setColorFilter(null);
        this.editModeIconColor = 0;
        this.editModeIcon.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(12.0f), Theme.getColor(null, Theme.key_dialogTextGray2, false)));
        if (z2) {
            enableEditMode(false);
        } else {
            disableEditMode(false);
        }
        if (this.isPremiumSticker) {
            PremiumLockIconView premiumLockIconView = this.premiumIconView;
            premiumLockIconView.setColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
            premiumLockIconView.waitingImage = true;
            premiumLockIconView.wasDrawn = false;
            premiumLockIconView.invalidate();
        }
        TextView textView2 = this.emojiTextView;
        if (importingSticker != null) {
            this.stickerPath = importingSticker;
            if (importingSticker.validated) {
                i = 4;
                textView = textView2;
                anonymousClass2 = anonymousClass3;
                setImage(ImageLocation.getForPath(importingSticker.path), "80_80", null, null, DocumentObject.getSvgRectThumb(Theme.key_dialogBackgroundGray, 1.0f), 0L, importingSticker.animated ? "tgs" : null, 0, 1);
            } else {
                anonymousClass2 = anonymousClass3;
                textView = textView2;
                i = 4;
                setImage(null, null, null, null, DocumentObject.getSvgRectThumb(Theme.key_dialogBackgroundGray, 1.0f), 0L, importingSticker.animated ? "tgs" : null, 0, 1);
            }
            if (str != null) {
                TextView textView3 = textView;
                textView3.setText(Emoji.replaceEmoji(str, textView.getPaint().getFontMetricsInt(), false));
                textView3.setVisibility(0);
            } else {
                textView.setVisibility(i);
            }
            anonymousClass1 = anonymousClass2;
        } else {
            anonymousClass1 = anonymousClass3;
            if (document != null) {
                this.sticker = document;
                this.parentObject = obj;
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                boolean z3 = this.fromEmojiPanel;
                int i2 = z3 ? Theme.key_emptyListPlaceholder : Theme.key_windowBackgroundGray;
                float f = z3 ? 0.2f : 1.0f;
                Theme.ResourcesProvider resourcesProvider = this.resourceProvider;
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, i2, f, 1.0f, resourcesProvider);
                String str2 = z3 ? "66_66_pcache_compress" : "66_66";
                if (MessageObject.isTextColorEmoji(document)) {
                    anonymousClass1.setColorFilter(resourcesProvider != null ? resourcesProvider.getAnimatedEmojiColorFilter() : Theme.chat_animatedEmojiTextColorFilter);
                }
                if (MessageObject.canAutoplayAnimatedSticker(document)) {
                    if (z3) {
                        this.drawInParentView = true;
                    }
                    if (svgThumb != null) {
                        setImage(ImageLocation.getForDocument(document), str2, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, null, null, svgThumb, 0L, null, this.parentObject, 1);
                    } else if (closestPhotoSizeWithSize != null) {
                        setImage(ImageLocation.getForDocument(document), str2, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), (String) null, (String) null, this.parentObject, 1);
                    } else {
                        setImage(ImageLocation.getForDocument(document), str2, null, null, this.parentObject, 1);
                    }
                } else if (svgThumb != null) {
                    if (closestPhotoSizeWithSize != null) {
                        setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize, document), str2, svgThumb, "webp", this.parentObject, 1);
                    } else {
                        setImage(ImageLocation.getForDocument(document), str2, svgThumb, "webp", this.parentObject, 1);
                    }
                } else if (closestPhotoSizeWithSize != null) {
                    setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize, document), str2, null, "webp", this.parentObject, 1);
                } else {
                    setImage(ImageLocation.getForDocument(document), str2, null, "webp", this.parentObject, 1);
                }
                if (str != null) {
                    textView2.setText(Emoji.replaceEmoji(str, textView2.getPaint().getFontMetricsInt(), false));
                    textView2.setVisibility(0);
                } else if (z) {
                    int i3 = 0;
                    while (true) {
                        if (i3 < document.attributes.size()) {
                            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i3);
                            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                                String str3 = documentAttribute.alt;
                                if (str3 != null && str3.length() > 0) {
                                    textView2.setText(Emoji.replaceEmoji(documentAttribute.alt, textView2.getPaint().getFontMetricsInt(), false));
                                    break;
                                }
                                break;
                            }
                            i3++;
                        }
                        textView2.setText(Emoji.replaceEmoji(MediaDataController.getInstance(this.currentAccount).getEmojiForSticker(this.sticker.id), textView2.getPaint().getFontMetricsInt(), false));
                        break;
                    }
                    textView2.setVisibility(0);
                } else {
                    textView2.setVisibility(4);
                }
            }
        }
        updatePremiumStatus(false);
        anonymousClass1.setAlpha(this.alpha * this.premiumAlpha);
        if (!this.drawInParentView) {
            anonymousClass1.setParentView(this);
        } else {
            anonymousClass1.setInvalidateAll(true);
            anonymousClass1.setParentView((View) getParent());
        }
    }
}
