package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$PhotoSize;
import org.telegram.tgnet.TLRPC$StickerSet;
import org.telegram.tgnet.TLRPC$StickerSetCovered;
import org.telegram.tgnet.TLRPC$TL_messages_stickerSet;
import org.telegram.tgnet.TLRPC$TL_stickerSetFullCovered;
import org.telegram.tgnet.TLRPC$TL_stickerSetNoCovered;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.PremiumButtonView;
import org.telegram.ui.Components.ProgressButton;
import org.telegram.ui.Components.RecyclerListView;

public class FeaturedStickerSetCell2 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    private final ProgressButton addButton;
    private boolean bindedObserver;
    private final int currentAccount;
    private AnimatorSet currentAnimation;
    private final TextView delButton;
    private boolean forceInstalled;
    private final BackupImageView imageView;
    private boolean isInstalled;
    private boolean isLocked;
    private boolean needDivider;
    private final Theme.ResourcesProvider resourcesProvider;
    private TLRPC$StickerSetCovered stickersSet;
    private final TextView textView;
    private final PremiumButtonView unlockButton;
    private boolean unread;
    private final TextView valueTextView;
    private Long waitingForStickerSetId;

    protected void onPremiumButtonClick() {
    }

    public FeaturedStickerSetCell2(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.currentAccount = UserConfig.selectedAccount;
        this.resourcesProvider = resourcesProvider;
        TextView textView = new TextView(context);
        this.textView = textView;
        textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
        textView.setTextSize(1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        boolean z = LocaleController.isRTL;
        addView(textView, LayoutHelper.createFrame(-2, -2.0f, z ? 5 : 3, z ? 22.0f : 71.0f, 10.0f, z ? 71.0f : 22.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.valueTextView = textView2;
        textView2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2));
        textView2.setTextSize(1, 13.0f);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        boolean z2 = LocaleController.isRTL;
        addView(textView2, LayoutHelper.createFrame(-2, -2.0f, z2 ? 5 : 3, z2 ? 100.0f : 71.0f, 35.0f, z2 ? 71.0f : 100.0f, 0.0f));
        BackupImageView backupImageView = new BackupImageView(context);
        this.imageView = backupImageView;
        backupImageView.setAspectFit(true);
        backupImageView.setLayerNum(1);
        boolean z3 = LocaleController.isRTL;
        addView(backupImageView, LayoutHelper.createFrame(48, 48.0f, (z3 ? 5 : 3) | 48, z3 ? 0.0f : 12.0f, 8.0f, z3 ? 12.0f : 0.0f, 0.0f));
        ProgressButton progressButton = new ProgressButton(context);
        this.addButton = progressButton;
        progressButton.setText(LocaleController.getString("Add", R.string.Add));
        progressButton.setTextColor(Theme.getColor(Theme.key_featuredStickers_buttonText));
        addView(progressButton, LayoutHelper.createFrameRelatively(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.delButton = textView3;
        textView3.setGravity(17);
        textView3.setTextColor(Theme.getColor(Theme.key_featuredStickers_removeButtonText));
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setText(LocaleController.getString("StickersRemove", R.string.StickersRemove));
        addView(textView3, LayoutHelper.createFrameRelatively(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f));
        PremiumButtonView premiumButtonView = new PremiumButtonView(context, AndroidUtilities.dp(4.0f), false, resourcesProvider);
        this.unlockButton = premiumButtonView;
        premiumButtonView.setIcon(R.raw.unlock_icon);
        premiumButtonView.setButton(LocaleController.getString("Unlock", R.string.Unlock), new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                FeaturedStickerSetCell2.this.lambda$new$0(view);
            }
        });
        premiumButtonView.setVisibility(8);
        try {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) premiumButtonView.getIconView().getLayoutParams();
            marginLayoutParams.leftMargin = AndroidUtilities.dp(1.0f);
            marginLayoutParams.topMargin = AndroidUtilities.dp(1.0f);
            int dp = AndroidUtilities.dp(20.0f);
            marginLayoutParams.height = dp;
            marginLayoutParams.width = dp;
            ((ViewGroup.MarginLayoutParams) premiumButtonView.getTextView().getLayoutParams()).leftMargin = AndroidUtilities.dp(3.0f);
            premiumButtonView.getChildAt(0).setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        } catch (Exception unused) {
        }
        addView(this.unlockButton, LayoutHelper.createFrameRelatively(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 10.0f, 0.0f));
        updateColors();
    }

    public void lambda$new$0(View view) {
        onPremiumButtonClick();
    }

    public TextView getTextView() {
        return this.textView;
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.needDivider ? 1 : 0), 1073741824));
        int measuredWidth = this.addButton.getMeasuredWidth();
        int measuredWidth2 = this.delButton.getMeasuredWidth();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.delButton.getLayoutParams();
        if (measuredWidth2 < measuredWidth) {
            layoutParams.rightMargin = AndroidUtilities.dp(14.0f) + ((measuredWidth - measuredWidth2) / 2);
        } else {
            layoutParams.rightMargin = AndroidUtilities.dp(14.0f);
        }
        measureChildWithMargins(this.textView, i, measuredWidth, i2, 0);
    }

    public void setStickersSet(TLRPC$StickerSetCovered tLRPC$StickerSetCovered, boolean z, boolean z2, boolean z3, boolean z4) {
        ImageLocation forSticker;
        TLRPC$StickerSet tLRPC$StickerSet;
        ArrayList<TLRPC$Document> arrayList;
        AnimatorSet animatorSet = this.currentAnimation;
        TLRPC$Document tLRPC$Document = null;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.currentAnimation = null;
        }
        this.needDivider = z;
        this.stickersSet = tLRPC$StickerSetCovered;
        setWillNotDraw(!z);
        this.textView.setText(this.stickersSet.set.title);
        this.unread = z2;
        if (z2) {
            Drawable drawable = new Drawable(this) {
                Paint paint = new Paint(1);

                @Override
                public int getOpacity() {
                    return -2;
                }

                @Override
                public void setAlpha(int i) {
                }

                @Override
                public void setColorFilter(ColorFilter colorFilter) {
                }

                @Override
                public void draw(Canvas canvas) {
                    this.paint.setColor(-12277526);
                    canvas.drawCircle(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(3.0f), this.paint);
                }

                @Override
                public int getIntrinsicWidth() {
                    return AndroidUtilities.dp(12.0f);
                }

                @Override
                public int getIntrinsicHeight() {
                    return AndroidUtilities.dp(8.0f);
                }
            };
            TextView textView = this.textView;
            boolean z5 = LocaleController.isRTL;
            Drawable drawable2 = z5 ? null : drawable;
            if (!z5) {
                drawable = null;
            }
            textView.setCompoundDrawablesWithIntrinsicBounds(drawable2, (Drawable) null, drawable, (Drawable) null);
        } else {
            this.textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
        TextView textView2 = this.valueTextView;
        TLRPC$StickerSet tLRPC$StickerSet2 = tLRPC$StickerSetCovered.set;
        textView2.setText(LocaleController.formatPluralString(tLRPC$StickerSet2.emojis ? "EmojiCount" : "Stickers", tLRPC$StickerSet2.count, new Object[0]));
        if ((tLRPC$StickerSetCovered instanceof TLRPC$TL_stickerSetNoCovered) && (tLRPC$StickerSet = tLRPC$StickerSetCovered.set) != null) {
            this.waitingForStickerSetId = Long.valueOf(tLRPC$StickerSet.id);
            if (!this.bindedObserver) {
                NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.groupStickersDidLoad);
                this.bindedObserver = true;
            }
            TLRPC$TL_messages_stickerSet stickerSet = MediaDataController.getInstance(this.currentAccount).getStickerSet(MediaDataController.getInputStickerSet(tLRPC$StickerSetCovered.set), Integer.valueOf(tLRPC$StickerSetCovered.set.hash), false);
            if (stickerSet != null && (arrayList = stickerSet.documents) != null && !arrayList.isEmpty()) {
                tLRPC$Document = stickerSet.documents.get(0);
                int i = 0;
                while (true) {
                    if (i >= stickerSet.documents.size()) {
                        break;
                    }
                    if (stickerSet.documents.get(i).id == tLRPC$StickerSetCovered.set.thumb_document_id) {
                        tLRPC$Document = stickerSet.documents.get(i);
                        break;
                    }
                    i++;
                }
            }
        } else {
            TLRPC$Document tLRPC$Document2 = tLRPC$StickerSetCovered.cover;
            if (tLRPC$Document2 == null) {
                if (!tLRPC$StickerSetCovered.covers.isEmpty()) {
                    tLRPC$Document = tLRPC$StickerSetCovered.covers.get(0);
                    if (tLRPC$StickerSetCovered.set != null) {
                        for (int i2 = 0; i2 < tLRPC$StickerSetCovered.covers.size(); i2++) {
                            if (tLRPC$StickerSetCovered.covers.get(i2).id == tLRPC$StickerSetCovered.set.thumb_document_id) {
                                tLRPC$Document2 = tLRPC$StickerSetCovered.covers.get(i2);
                            }
                        }
                    }
                } else if (tLRPC$StickerSetCovered instanceof TLRPC$TL_stickerSetFullCovered) {
                    TLRPC$TL_stickerSetFullCovered tLRPC$TL_stickerSetFullCovered = (TLRPC$TL_stickerSetFullCovered) tLRPC$StickerSetCovered;
                    if (!tLRPC$TL_stickerSetFullCovered.documents.isEmpty()) {
                        ArrayList<TLRPC$Document> arrayList2 = tLRPC$TL_stickerSetFullCovered.documents;
                        TLRPC$Document tLRPC$Document3 = arrayList2.get(0);
                        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                            if (arrayList2.get(i3).id == tLRPC$StickerSetCovered.set.thumb_document_id) {
                                tLRPC$Document2 = arrayList2.get(i3);
                            }
                        }
                        tLRPC$Document = tLRPC$Document3;
                    }
                }
            }
            tLRPC$Document = tLRPC$Document2;
            break;
        }
        if (tLRPC$Document != null) {
            if (MessageObject.canAutoplayAnimatedSticker(tLRPC$Document)) {
                TLObject closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tLRPC$StickerSetCovered.set.thumbs, 90);
                if (closestPhotoSizeWithSize == null) {
                    closestPhotoSizeWithSize = tLRPC$Document;
                }
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tLRPC$StickerSetCovered.set.thumbs, Theme.key_windowBackgroundGray, 1.0f);
                boolean z6 = closestPhotoSizeWithSize instanceof TLRPC$Document;
                if (z6) {
                    forSticker = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(tLRPC$Document.thumbs, 90), tLRPC$Document);
                } else {
                    forSticker = ImageLocation.getForSticker((TLRPC$PhotoSize) closestPhotoSizeWithSize, tLRPC$Document, tLRPC$StickerSetCovered.set.thumb_version);
                }
                ImageLocation imageLocation = forSticker;
                if (z6 && (MessageObject.isAnimatedStickerDocument(tLRPC$Document, true) || MessageObject.isVideoSticker(tLRPC$Document))) {
                    if (svgThumb != null) {
                        this.imageView.setImage(ImageLocation.getForDocument(tLRPC$Document), "50_50", svgThumb, 0, tLRPC$StickerSetCovered);
                    } else {
                        this.imageView.setImage(ImageLocation.getForDocument(tLRPC$Document), "50_50", imageLocation, (String) null, 0, tLRPC$StickerSetCovered);
                    }
                } else if (imageLocation != null && imageLocation.imageType == 1) {
                    this.imageView.setImage(imageLocation, "50_50", "tgs", svgThumb, tLRPC$StickerSetCovered);
                } else {
                    this.imageView.setImage(imageLocation, "50_50", "webp", svgThumb, tLRPC$StickerSetCovered);
                }
            } else {
                TLRPC$PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(tLRPC$Document.thumbs, 90);
                if (closestPhotoSizeWithSize2 != null) {
                    this.imageView.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize2, tLRPC$Document), "50_50", "webp", (Drawable) null, tLRPC$StickerSetCovered);
                } else {
                    this.imageView.setImage(ImageLocation.getForDocument(tLRPC$Document), "50_50", "webp", (Drawable) null, tLRPC$StickerSetCovered);
                }
            }
        } else {
            this.imageView.setImage((ImageLocation) null, (String) null, "webp", (Drawable) null, tLRPC$StickerSetCovered);
        }
        this.addButton.setVisibility(0);
        this.forceInstalled = z3;
        this.isInstalled = z3 || MediaDataController.getInstance(this.currentAccount).isStickerPackInstalled(tLRPC$StickerSetCovered.set.id);
        boolean z7 = !UserConfig.getInstance(this.currentAccount).isPremium() && MessageObject.isPremiumEmojiPack(tLRPC$StickerSetCovered);
        this.isLocked = z7;
        if (!z4) {
            if (z7) {
                this.unlockButton.setVisibility(0);
                this.unlockButton.setAlpha(1.0f);
                this.unlockButton.setScaleX(1.0f);
                this.unlockButton.setScaleY(1.0f);
                this.addButton.setVisibility(4);
                this.addButton.setAlpha(0.0f);
                this.addButton.setScaleX(0.0f);
                this.addButton.setScaleY(0.0f);
                this.delButton.setVisibility(4);
                this.delButton.setAlpha(0.0f);
                this.delButton.setScaleX(0.0f);
                this.delButton.setScaleY(0.0f);
                return;
            }
            this.unlockButton.setVisibility(8);
            this.unlockButton.setAlpha(0.0f);
            this.unlockButton.setScaleX(0.0f);
            this.unlockButton.setScaleY(0.0f);
            if (this.isInstalled) {
                this.delButton.setVisibility(0);
                this.delButton.setAlpha(1.0f);
                this.delButton.setScaleX(1.0f);
                this.delButton.setScaleY(1.0f);
                this.addButton.setVisibility(4);
                this.addButton.setAlpha(0.0f);
                this.addButton.setScaleX(0.0f);
                this.addButton.setScaleY(0.0f);
                return;
            }
            this.addButton.setVisibility(0);
            this.addButton.setAlpha(1.0f);
            this.addButton.setScaleX(1.0f);
            this.addButton.setScaleY(1.0f);
            this.delButton.setVisibility(4);
            this.delButton.setAlpha(0.0f);
            this.delButton.setScaleX(0.0f);
            this.delButton.setScaleY(0.0f);
            return;
        }
        if (z7) {
            this.unlockButton.setVisibility(0);
            this.delButton.setVisibility(0);
            this.addButton.setVisibility(0);
        } else {
            this.unlockButton.setVisibility(0);
            if (this.isInstalled) {
                this.delButton.setVisibility(0);
            } else {
                this.addButton.setVisibility(0);
            }
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.currentAnimation = animatorSet2;
        animatorSet2.setDuration(250L);
        AnimatorSet animatorSet3 = this.currentAnimation;
        Animator[] animatorArr = new Animator[8];
        TextView textView3 = this.delButton;
        Property property = View.ALPHA;
        float[] fArr = new float[1];
        fArr[0] = (!this.isInstalled || this.isLocked) ? 0.0f : 1.0f;
        animatorArr[0] = ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property, fArr);
        TextView textView4 = this.delButton;
        Property property2 = View.SCALE_X;
        float[] fArr2 = new float[1];
        fArr2[0] = (!this.isInstalled || this.isLocked) ? 0.0f : 1.0f;
        animatorArr[1] = ObjectAnimator.ofFloat(textView4, (Property<TextView, Float>) property2, fArr2);
        TextView textView5 = this.delButton;
        Property property3 = View.SCALE_Y;
        float[] fArr3 = new float[1];
        fArr3[0] = (!this.isInstalled || this.isLocked) ? 0.0f : 1.0f;
        animatorArr[2] = ObjectAnimator.ofFloat(textView5, (Property<TextView, Float>) property3, fArr3);
        ProgressButton progressButton = this.addButton;
        Property property4 = View.ALPHA;
        float[] fArr4 = new float[1];
        fArr4[0] = (this.isInstalled || this.isLocked) ? 0.0f : 1.0f;
        animatorArr[3] = ObjectAnimator.ofFloat(progressButton, (Property<ProgressButton, Float>) property4, fArr4);
        ProgressButton progressButton2 = this.addButton;
        Property property5 = View.SCALE_X;
        float[] fArr5 = new float[1];
        fArr5[0] = (this.isInstalled || this.isLocked) ? 0.0f : 1.0f;
        animatorArr[4] = ObjectAnimator.ofFloat(progressButton2, (Property<ProgressButton, Float>) property5, fArr5);
        PremiumButtonView premiumButtonView = this.unlockButton;
        Property property6 = View.SCALE_Y;
        float[] fArr6 = new float[1];
        fArr6[0] = !this.isLocked ? 0.0f : 1.0f;
        animatorArr[5] = ObjectAnimator.ofFloat(premiumButtonView, (Property<PremiumButtonView, Float>) property6, fArr6);
        PremiumButtonView premiumButtonView2 = this.unlockButton;
        Property property7 = View.SCALE_X;
        float[] fArr7 = new float[1];
        fArr7[0] = !this.isLocked ? 0.0f : 1.0f;
        animatorArr[6] = ObjectAnimator.ofFloat(premiumButtonView2, (Property<PremiumButtonView, Float>) property7, fArr7);
        PremiumButtonView premiumButtonView3 = this.unlockButton;
        Property property8 = View.SCALE_Y;
        float[] fArr8 = new float[1];
        fArr8[0] = this.isLocked ? 1.0f : 0.0f;
        animatorArr[7] = ObjectAnimator.ofFloat(premiumButtonView3, (Property<PremiumButtonView, Float>) property8, fArr8);
        animatorSet3.playTogether(animatorArr);
        this.currentAnimation.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                if (FeaturedStickerSetCell2.this.isLocked) {
                    FeaturedStickerSetCell2.this.addButton.setVisibility(4);
                    FeaturedStickerSetCell2.this.delButton.setVisibility(4);
                    FeaturedStickerSetCell2.this.unlockButton.setVisibility(0);
                } else {
                    if (FeaturedStickerSetCell2.this.isInstalled) {
                        FeaturedStickerSetCell2.this.addButton.setVisibility(4);
                    } else {
                        FeaturedStickerSetCell2.this.delButton.setVisibility(4);
                    }
                    FeaturedStickerSetCell2.this.unlockButton.setVisibility(8);
                }
            }
        });
        this.currentAnimation.setInterpolator(new OvershootInterpolator(1.02f));
        this.currentAnimation.start();
    }

    public TLRPC$StickerSetCovered getStickerSet() {
        return this.stickersSet;
    }

    public void setAddOnClickListener(View.OnClickListener onClickListener) {
        this.addButton.setOnClickListener(onClickListener);
        this.delButton.setOnClickListener(onClickListener);
    }

    public void setDrawProgress(boolean z, boolean z2) {
        this.addButton.setDrawProgress(z, z2);
    }

    public boolean isInstalled() {
        return this.isInstalled;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (this.needDivider) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(71.0f), getHeight() - 1, getWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(71.0f) : 0), getHeight() - 1, Theme.dividerPaint);
        }
    }

    public BackupImageView getImageView() {
        return this.imageView;
    }

    public void updateColors() {
        this.addButton.setProgressColor(Theme.getColor(Theme.key_featuredStickers_buttonProgress));
        this.addButton.setBackgroundRoundRect(Theme.getColor(Theme.key_featuredStickers_addButton), Theme.getColor(Theme.key_featuredStickers_addButtonPressed));
    }

    public static void createThemeDescriptions(List<ThemeDescription> list, RecyclerListView recyclerListView, ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate) {
        list.add(new ThemeDescription(recyclerListView, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{FeaturedStickerSetCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlackText));
        list.add(new ThemeDescription(recyclerListView, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{FeaturedStickerSetCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayText2));
        list.add(new ThemeDescription(recyclerListView, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{FeaturedStickerSetCell.class}, new String[]{"addButton"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_featuredStickers_buttonText));
        list.add(new ThemeDescription(recyclerListView, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{FeaturedStickerSetCell.class}, new String[]{"delButton"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_featuredStickers_removeButtonText));
        list.add(new ThemeDescription(recyclerListView, 0, new Class[]{FeaturedStickerSetCell.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        list.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_featuredStickers_buttonProgress));
        list.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_featuredStickers_addButtonPressed));
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.bindedObserver) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.groupStickersDidLoad);
            this.bindedObserver = false;
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.groupStickersDidLoad) {
            long longValue = ((Long) objArr[0]).longValue();
            Long l = this.waitingForStickerSetId;
            if (l == null || l.longValue() != longValue) {
                return;
            }
            this.waitingForStickerSetId = null;
            TLRPC$TL_stickerSetNoCovered tLRPC$TL_stickerSetNoCovered = new TLRPC$TL_stickerSetNoCovered();
            tLRPC$TL_stickerSetNoCovered.set = ((TLRPC$TL_messages_stickerSet) objArr[1]).set;
            setStickersSet(tLRPC$TL_stickerSetNoCovered, this.needDivider, this.unread, this.forceInstalled, true);
        }
    }
}
