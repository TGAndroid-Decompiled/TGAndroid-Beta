package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline2;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$MediaCell$$ExternalSyntheticOutline0;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.CallLogActivity$$ExternalSyntheticLambda38;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.PremiumButtonView;
import org.telegram.ui.Components.ProgressButton;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;

public final class FeaturedStickerSetCell2 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final ProgressButton addButton;
    public boolean bindedObserver;
    public final int currentAccount;
    public AnimatorSet currentAnimation;
    public final TextView delButton;
    public boolean forceInstalled;
    public final BackupImageView imageView;
    public boolean isInstalled;
    public boolean isLocked;
    public boolean needDivider;
    public TLRPC.StickerSetCovered stickersSet;
    public final TextView textView;
    public final PremiumButtonView unlockButton;
    public final TextView valueTextView;
    public Long waitingForStickerSetId;

    public final class Factory extends UItem.UItemFactory {
        public static final int $r8$clinit = 0;

        static {
            UItem.UItemFactory.setup(new Factory());
        }

        @Override
        public final void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
            FeaturedStickerSetCell2 featuredStickerSetCell2 = (FeaturedStickerSetCell2) view;
            featuredStickerSetCell2.setStickersSet((TLRPC.StickerSetCovered) uItem.object, z, uItem.locked, false);
            featuredStickerSetCell2.addButton.setDrawProgress(uItem.locked, false);
            featuredStickerSetCell2.setAddOnClickListener(uItem.clickCallback);
        }

        @Override
        public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
            return new FeaturedStickerSetCell2(context, resourcesProvider);
        }
    }

    public FeaturedStickerSetCell2(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.currentAccount = UserConfig.selectedAccount;
        TextView textView = new TextView(context);
        this.textView = textView;
        ArticleViewer.IBlock.CC.m(textView, Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false), 16.0f, 1, true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        boolean z = LocaleController.isRTL;
        addView(textView, LayoutHelper.createFrame(-2, -2.0f, z ? 5 : 3, z ? 22.0f : 71.0f, 10.0f, z ? 71.0f : 22.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.valueTextView = textView2;
        ArticleViewer.IBlock.CC.m(textView2, Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText2, false), 13.0f, 1, true);
        textView2.setEllipsize(truncateAt);
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
        progressButton.setText(LocaleController.getString(R.string.Add));
        progressButton.setTextColor(Theme.getColor(null, Theme.key_featuredStickers_buttonText, false));
        addView(progressButton, LayoutHelper.createFrameRelatively(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.delButton = textView3;
        textView3.setGravity(17);
        FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline2.m(14.0f, Theme.getColor(null, Theme.key_featuredStickers_removeButtonText, false), 1, textView3);
        textView3.setText(LocaleController.getString(R.string.StickersRemove));
        addView(textView3, LayoutHelper.createFrameRelatively(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f));
        PremiumButtonView premiumButtonView = new PremiumButtonView(AndroidUtilities.dp(4.0f), context, resourcesProvider, false);
        this.unlockButton = premiumButtonView;
        premiumButtonView.setIcon(R.raw.unlock_icon);
        premiumButtonView.setButton(LocaleController.getString(R.string.Unlock), new CallLogActivity$$ExternalSyntheticLambda38(this, 22), false);
        premiumButtonView.setVisibility(8);
        try {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) premiumButtonView.getIconView().getLayoutParams();
            marginLayoutParams.leftMargin = AndroidUtilities.dp(1.0f);
            marginLayoutParams.topMargin = AndroidUtilities.dp(1.0f);
            int iDp = AndroidUtilities.dp(20.0f);
            marginLayoutParams.height = iDp;
            marginLayoutParams.width = iDp;
            ((ViewGroup.MarginLayoutParams) premiumButtonView.getTextView().getLayoutParams()).leftMargin = AndroidUtilities.dp(3.0f);
            premiumButtonView.getChildAt(0).setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        } catch (Exception unused) {
        }
        addView(this.unlockButton, LayoutHelper.createFrameRelatively(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 10.0f, 0.0f));
        this.addButton.setProgressColor(Theme.getColor(null, Theme.key_featuredStickers_buttonProgress, false));
        ProgressButton progressButton2 = this.addButton;
        int color = Theme.getColor(null, Theme.key_featuredStickers_addButton, false);
        Theme.getColor(null, Theme.key_featuredStickers_addButtonPressed, false);
        progressButton2.setBackgroundRoundRect(14.0f, color);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.groupStickersDidLoad) {
            long jLongValue = ((Long) objArr[0]).longValue();
            Long l = this.waitingForStickerSetId;
            if (l == null || l.longValue() != jLongValue) {
                return;
            }
            this.waitingForStickerSetId = null;
            TLRPC.TL_stickerSetNoCovered tL_stickerSetNoCovered = new TLRPC.TL_stickerSetNoCovered();
            tL_stickerSetNoCovered.set = ((TLRPC.TL_messages_stickerSet) objArr[1]).set;
            setStickersSet(tL_stickerSetNoCovered, this.needDivider, this.forceInstalled, true);
        }
    }

    public BackupImageView getImageView() {
        return this.imageView;
    }

    public TLRPC.StickerSetCovered getStickerSet() {
        return this.stickersSet;
    }

    public TextView getTextView() {
        return this.textView;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.bindedObserver) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.groupStickersDidLoad);
            this.bindedObserver = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.needDivider) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(71.0f), getHeight() - 1, getWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(71.0f) : 0), getHeight() - 1, Theme.dividerPaint);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.needDivider ? 1 : 0), 1073741824));
        int measuredWidth = this.addButton.getMeasuredWidth();
        TextView textView = this.delButton;
        int measuredWidth2 = textView.getMeasuredWidth();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        if (measuredWidth2 < measuredWidth) {
            layoutParams.rightMargin = RichMessageLayout$MediaCell$$ExternalSyntheticOutline0.m(measuredWidth, measuredWidth2, 2, AndroidUtilities.dp(14.0f));
        } else {
            layoutParams.rightMargin = AndroidUtilities.dp(14.0f);
        }
        measureChildWithMargins(this.textView, i, measuredWidth, i2, 0);
    }

    public void setAddOnClickListener(View.OnClickListener onClickListener) {
        this.addButton.setOnClickListener(onClickListener);
        this.delButton.setOnClickListener(onClickListener);
    }

    public final void setStickersSet(TLRPC.StickerSetCovered stickerSetCovered, boolean z, boolean z2, boolean z3) {
        char c;
        TLRPC.StickerSet stickerSet;
        ArrayList<TLRPC.Document> arrayList;
        TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
        AnimatorSet animatorSet = this.currentAnimation;
        TLRPC.Document document = null;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.currentAnimation = null;
        }
        this.needDivider = z;
        this.stickersSet = stickerSetCovered2;
        setWillNotDraw(!z);
        TextView textView = this.textView;
        textView.setText(this.stickersSet.set.title);
        textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        TextView textView2 = this.valueTextView;
        TLRPC.StickerSet stickerSet2 = stickerSetCovered2.set;
        textView2.setText(LocaleController.formatPluralString(stickerSet2.emojis ? "EmojiCount" : "Stickers", stickerSet2.count, new Object[0]));
        boolean z4 = stickerSetCovered2 instanceof TLRPC.TL_stickerSetNoCovered;
        int i = this.currentAccount;
        if (!z4 || (stickerSet = stickerSetCovered2.set) == null) {
            TLRPC.Document document2 = stickerSetCovered2.cover;
            if (document2 != null) {
                document = document2;
            } else if (!stickerSetCovered2.covers.isEmpty()) {
                document = stickerSetCovered2.covers.get(0);
                if (stickerSetCovered2.set != null) {
                    for (int i2 = 0; i2 < stickerSetCovered2.covers.size(); i2++) {
                        if (stickerSetCovered2.covers.get(i2).id == stickerSetCovered2.set.thumb_document_id) {
                            document = stickerSetCovered2.covers.get(i2);
                            break;
                        }
                    }
                }
            } else if (stickerSetCovered2 instanceof TLRPC.TL_stickerSetFullCovered) {
                TLRPC.TL_stickerSetFullCovered tL_stickerSetFullCovered = (TLRPC.TL_stickerSetFullCovered) stickerSetCovered2;
                if (!tL_stickerSetFullCovered.documents.isEmpty()) {
                    ArrayList<TLRPC.Document> arrayList2 = tL_stickerSetFullCovered.documents;
                    document = arrayList2.get(0);
                    for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                        if (arrayList2.get(i3).id == stickerSetCovered2.set.thumb_document_id) {
                            document = arrayList2.get(i3);
                            break;
                        }
                    }
                }
            }
        } else {
            this.waitingForStickerSetId = Long.valueOf(stickerSet.id);
            if (!this.bindedObserver) {
                NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.groupStickersDidLoad);
                this.bindedObserver = true;
            }
            TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered2.set), Integer.valueOf(stickerSetCovered2.set.hash), false);
            if (stickerSet3 != null && (arrayList = stickerSet3.documents) != null && !arrayList.isEmpty()) {
                document = stickerSet3.documents.get(0);
                for (int i4 = 0; i4 < stickerSet3.documents.size(); i4++) {
                    if (stickerSet3.documents.get(i4).id == stickerSetCovered2.set.thumb_document_id) {
                        document = stickerSet3.documents.get(i4);
                        break;
                    }
                }
            }
        }
        BackupImageView backupImageView = this.imageView;
        if (document == null) {
            c = 4;
            stickerSetCovered2 = stickerSetCovered;
            backupImageView.setImage(null, null, null, null, null, "webp", 0, stickerSetCovered2);
        } else if (MessageObject.canAutoplayAnimatedSticker(document)) {
            TLObject closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(stickerSetCovered2.set.thumbs, 90);
            if (closestPhotoSizeWithSize == null) {
                closestPhotoSizeWithSize = document;
            }
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(stickerSetCovered2.set.thumbs, Theme.key_windowBackgroundGray, 1.0f);
            boolean z5 = closestPhotoSizeWithSize instanceof TLRPC.Document;
            ImageLocation forDocument = z5 ? ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document) : ImageLocation.getForSticker((TLRPC.PhotoSize) closestPhotoSizeWithSize, document, stickerSetCovered2.set.thumb_version);
            if (!z5 || (!MessageObject.isAnimatedStickerDocument(document, true) && !MessageObject.isVideoSticker(document))) {
                ImageLocation imageLocation = forDocument;
                c = 4;
                if (imageLocation == null || imageLocation.imageType != 1) {
                    stickerSetCovered2 = stickerSetCovered;
                    backupImageView.setImage(imageLocation, "50_50", null, null, svgThumb, "webp", 0, stickerSetCovered2);
                } else {
                    stickerSetCovered2 = stickerSetCovered;
                    backupImageView.setImage(imageLocation, "50_50", null, null, svgThumb, "tgs", 0, stickerSetCovered2);
                }
            } else if (svgThumb != null) {
                backupImageView.setImage$1(ImageLocation.getForDocument(document), "50_50", svgThumb, stickerSetCovered2);
                c = 4;
            } else {
                c = 4;
                backupImageView.setImage(ImageLocation.getForDocument(document), "50_50", forDocument, null, null, null, 0, stickerSetCovered2);
                stickerSetCovered2 = stickerSetCovered;
            }
        } else {
            c = 4;
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            if (closestPhotoSizeWithSize2 != null) {
                stickerSetCovered2 = stickerSetCovered;
                backupImageView.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize2, document), "50_50", null, null, null, "webp", 0, stickerSetCovered2);
            } else {
                stickerSetCovered2 = stickerSetCovered;
                backupImageView.setImage(ImageLocation.getForDocument(document), "50_50", null, null, null, "webp", 0, stickerSetCovered2);
            }
        }
        ProgressButton progressButton = this.addButton;
        progressButton.setVisibility(0);
        this.forceInstalled = z2;
        this.isInstalled = z2 || MediaDataController.getInstance(i).isStickerPackInstalled(stickerSetCovered2.set.id);
        boolean z6 = !UserConfig.getInstance(i).isPremium() && MessageObject.isPremiumEmojiPack(stickerSetCovered2);
        this.isLocked = z6;
        PremiumButtonView premiumButtonView = this.unlockButton;
        TextView textView3 = this.delButton;
        if (!z3) {
            if (z6) {
                premiumButtonView.setVisibility(0);
                premiumButtonView.setAlpha(1.0f);
                premiumButtonView.setScaleX(1.0f);
                premiumButtonView.setScaleY(1.0f);
                progressButton.setVisibility(4);
                progressButton.setAlpha(0.0f);
                progressButton.setScaleX(0.0f);
                progressButton.setScaleY(0.0f);
                textView3.setVisibility(4);
                textView3.setAlpha(0.0f);
                textView3.setScaleX(0.0f);
                textView3.setScaleY(0.0f);
                return;
            }
            premiumButtonView.setVisibility(8);
            premiumButtonView.setAlpha(0.0f);
            premiumButtonView.setScaleX(0.0f);
            premiumButtonView.setScaleY(0.0f);
            if (this.isInstalled) {
                textView3.setVisibility(0);
                textView3.setAlpha(1.0f);
                textView3.setScaleX(1.0f);
                textView3.setScaleY(1.0f);
                progressButton.setVisibility(4);
                progressButton.setAlpha(0.0f);
                progressButton.setScaleX(0.0f);
                progressButton.setScaleY(0.0f);
                return;
            }
            progressButton.setVisibility(0);
            progressButton.setAlpha(1.0f);
            progressButton.setScaleX(1.0f);
            progressButton.setScaleY(1.0f);
            textView3.setVisibility(4);
            textView3.setAlpha(0.0f);
            textView3.setScaleX(0.0f);
            textView3.setScaleY(0.0f);
            return;
        }
        if (z6) {
            premiumButtonView.setVisibility(0);
            textView3.setVisibility(0);
            progressButton.setVisibility(0);
        } else {
            premiumButtonView.setVisibility(0);
            if (this.isInstalled) {
                textView3.setVisibility(0);
            } else {
                progressButton.setVisibility(0);
            }
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.currentAnimation = animatorSet2;
        animatorSet2.setDuration(250L);
        AnimatorSet animatorSet3 = this.currentAnimation;
        float[] fArr = {(!this.isInstalled || this.isLocked) ? 0.0f : 1.0f};
        Property property = View.ALPHA;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property, fArr);
        float[] fArr2 = {(!this.isInstalled || this.isLocked) ? 0.0f : 1.0f};
        Property property2 = View.SCALE_X;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property2, fArr2);
        float[] fArr3 = {(!this.isInstalled || this.isLocked) ? 0.0f : 1.0f};
        Property property3 = View.SCALE_Y;
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property3, fArr3);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(progressButton, (Property<ProgressButton, Float>) property, (this.isInstalled || this.isLocked) ? 0.0f : 1.0f);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(progressButton, (Property<ProgressButton, Float>) property2, (this.isInstalled || this.isLocked) ? 0.0f : 1.0f);
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(premiumButtonView, (Property<PremiumButtonView, Float>) property3, !this.isLocked ? 0.0f : 1.0f);
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(premiumButtonView, (Property<PremiumButtonView, Float>) property2, !this.isLocked ? 0.0f : 1.0f);
        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(premiumButtonView, (Property<PremiumButtonView, Float>) property3, !this.isLocked ? 0.0f : 1.0f);
        Animator[] animatorArr = new Animator[8];
        animatorArr[0] = objectAnimatorOfFloat;
        animatorArr[1] = objectAnimatorOfFloat2;
        animatorArr[2] = objectAnimatorOfFloat3;
        animatorArr[3] = objectAnimatorOfFloat4;
        animatorArr[c] = objectAnimatorOfFloat5;
        animatorArr[5] = objectAnimatorOfFloat6;
        animatorArr[6] = objectAnimatorOfFloat7;
        animatorArr[7] = objectAnimatorOfFloat8;
        animatorSet3.playTogether(animatorArr);
        this.currentAnimation.addListener(new AnimatorListenerAdapter() {
            @Override
            public final void onAnimationEnd(Animator animator) {
                FeaturedStickerSetCell2 featuredStickerSetCell2 = FeaturedStickerSetCell2.this;
                boolean z7 = featuredStickerSetCell2.isLocked;
                ProgressButton progressButton2 = featuredStickerSetCell2.addButton;
                if (z7) {
                    progressButton2.setVisibility(4);
                    featuredStickerSetCell2.delButton.setVisibility(4);
                    featuredStickerSetCell2.unlockButton.setVisibility(0);
                } else {
                    if (featuredStickerSetCell2.isInstalled) {
                        progressButton2.setVisibility(4);
                    } else {
                        featuredStickerSetCell2.delButton.setVisibility(4);
                    }
                    featuredStickerSetCell2.unlockButton.setVisibility(8);
                }
            }
        });
        this.currentAnimation.setInterpolator(new OvershootInterpolator(1.02f));
        this.currentAnimation.start();
    }
}
