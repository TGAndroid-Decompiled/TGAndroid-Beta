package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SvgHelper;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;

public final class StickerTabView extends FrameLayout {
    public static int indexPointer;
    public float dragOffset;
    public ValueAnimator dragOffsetAnimator;
    public boolean expanded;
    public boolean hasSavedLeft;
    public final ImageView iconView;
    public final BackupImageView imageView;
    public final int index;
    public boolean inited;
    public boolean isChatSticker;
    public float lastLeft;
    public boolean roundImage;
    public SvgHelper.SvgDrawable svgThumb;
    public final ArticleViewer.AnonymousClass9 textView;
    public float textWidth;
    public final int type;
    public final View visibleView;

    public final class AnonymousClass2 implements ValueAnimator.AnimatorUpdateListener {
        public final int $r8$classId;
        public final FrameLayout this$0;
        public final View val$parent;

        public AnonymousClass2(FrameLayout frameLayout, View view, int i) {
            this.$r8$classId = i;
            this.this$0 = frameLayout;
            this.val$parent = view;
        }

        @Override
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            switch (this.$r8$classId) {
                case 0:
                    float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    StickerTabView stickerTabView = (StickerTabView) this.this$0;
                    stickerTabView.dragOffset = fFloatValue;
                    stickerTabView.invalidate();
                    ((ScrollSlidingTabStrip) this.val$parent).invalidate();
                    break;
                default:
                    ((ViewPagerFixed) this.this$0).setTranslationX(this.val$parent, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                    break;
            }
        }
    }

    public StickerTabView(Context context, int i) {
        super(context);
        this.type = i;
        int i2 = indexPointer;
        indexPointer = i2 + 1;
        this.index = i2;
        if (i == 2) {
            BackupImageView backupImageView = new BackupImageView(getContext());
            this.imageView = backupImageView;
            backupImageView.setLayerNum(1);
            backupImageView.setAspectFit(false);
            backupImageView.setRoundRadius(AndroidUtilities.dp(6.0f));
            addView(backupImageView, LayoutHelper.createFrame(26, 26, 17));
            this.visibleView = backupImageView;
        } else if (i == 1) {
            ImageView imageView = new ImageView(context);
            this.iconView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            addView(imageView, LayoutHelper.createFrame(24, 24, 17));
            this.visibleView = imageView;
        } else {
            BackupImageView backupImageView2 = new BackupImageView(getContext());
            this.imageView = backupImageView2;
            backupImageView2.setLayerNum(1);
            backupImageView2.setAspectFit(true);
            backupImageView2.setRoundRadius(AndroidUtilities.dp(6.0f));
            addView(backupImageView2, LayoutHelper.createFrame(26, 26, 17));
            this.visibleView = backupImageView2;
        }
        ArticleViewer.AnonymousClass9 anonymousClass9 = new ArticleViewer.AnonymousClass9(context, 13);
        this.textView = anonymousClass9;
        anonymousClass9.addOnLayoutChangeListener(new ItemOptions$$ExternalSyntheticLambda13(this, 2));
        anonymousClass9.setLines(1);
        anonymousClass9.setEllipsize(TextUtils.TruncateAt.END);
        anonymousClass9.setTextSize(1, 11.0f);
        anonymousClass9.setGravity(1);
        anonymousClass9.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
        addView(anonymousClass9, LayoutHelper.createFrame(-1, -2.0f, 81, 8.0f, 0.0f, 8.0f, 10.0f));
        anonymousClass9.setVisibility(8);
    }

    public float getTextWidth() {
        return this.textWidth;
    }

    public void setExpanded(boolean z) {
        int i = this.type;
        if (i == 2) {
            return;
        }
        this.expanded = z;
        float f = i == 1 ? 24.0f : 26.0f;
        float f2 = i == 1 ? 38.0f : 44.0f;
        View view = this.visibleView;
        view.getLayoutParams().width = AndroidUtilities.dp(z ? f2 : f);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (z) {
            f = f2;
        }
        layoutParams.height = AndroidUtilities.dp(f);
        this.textView.setVisibility(z ? 0 : 8);
        if (i == 1 || !this.roundImage) {
            return;
        }
        this.imageView.setRoundRadius(AndroidUtilities.dp(view.getLayoutParams().width / 2.0f));
    }

    public final void updateExpandProgress(float f) {
        int i = this.type;
        if (i == 2) {
            return;
        }
        boolean z = this.expanded;
        View view = this.visibleView;
        if (!z) {
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            return;
        }
        float f2 = i == 1 ? 24.0f : 26.0f;
        float f3 = i == 1 ? 38.0f : 44.0f;
        float fDp = AndroidUtilities.dp(33.0f - f2) / 2.0f;
        float fDp2 = AndroidUtilities.dp(36.0f - f2) / 2.0f;
        int i2 = ScrollSlidingTabStrip.$r8$clinit;
        float fDp3 = AndroidUtilities.dp(64.0f - f3) / 2.0f;
        float f4 = 1.0f - f;
        view.setTranslationY(((fDp2 - (AndroidUtilities.dp(86.0f - f3) / 2.0f)) * f4) - (AndroidUtilities.dp(8.0f) * f));
        view.setTranslationX((fDp - fDp3) * f4);
        float fMax = Math.max(0.0f, (f - 0.5f) / 0.5f);
        ArticleViewer.AnonymousClass9 anonymousClass9 = this.textView;
        anonymousClass9.setAlpha(fMax);
        anonymousClass9.setTranslationY((-AndroidUtilities.dp(40.0f)) * f4);
        anonymousClass9.setTranslationX((-AndroidUtilities.dp(12.0f)) * f4);
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        float f5 = ((f2 / f3) * f4) + f;
        view.setScaleX(f5);
        view.setScaleY(f5);
    }
}
