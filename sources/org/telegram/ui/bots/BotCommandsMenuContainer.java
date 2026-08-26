package org.telegram.ui.bots;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import com.google.zxing.qrcode.decoder.Version;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.ContentPreviewViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.SettingsActivity;
import org.telegram.ui.Stories.recorder.EmojiBottomSheet;
import org.telegram.ui.WebviewActivity;

public abstract class BotCommandsMenuContainer extends FrameLayout {
    public BlurredBackgroundDrawable backgroundDrawable;
    public float containerY;
    public ObjectAnimator currentAnimation;
    public boolean dismissed;
    public boolean entering;
    public final AnonymousClass1 listView;
    public final Version.ECB nestedScrollingParentHelper;
    public float scrollYOffset;
    public final Paint topBackground;

    public final class AnonymousClass1 extends RecyclerListView {
        public final int $r8$classId;
        public final FrameLayout this$0;

        public AnonymousClass1(FrameLayout frameLayout, Context context, int i) {
            super(context, null);
            this.$r8$classId = i;
            this.this$0 = frameLayout;
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            switch (this.$r8$classId) {
                case 0:
                    ChatActivityEnterView.AnonymousClass47 anonymousClass47 = (ChatActivityEnterView.AnonymousClass47) this.this$0;
                    if (anonymousClass47.listView.getLayoutManager() == null || anonymousClass47.listView.getAdapter() == null || anonymousClass47.listView.getAdapter().getItemCount() == 0) {
                        super.dispatchDraw(canvas);
                    } else {
                        float fDp = anonymousClass47.scrollYOffset - AndroidUtilities.dp(8.0f);
                        anonymousClass47.containerY = fDp - AndroidUtilities.dp(16.0f);
                        BlurredBackgroundDrawable blurredBackgroundDrawable = anonymousClass47.backgroundDrawable;
                        if (blurredBackgroundDrawable != null) {
                            blurredBackgroundDrawable.draw(canvas);
                        }
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set((getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(12.0f), fDp - AndroidUtilities.dp(4.0f), (getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(12.0f), fDp);
                        canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), anonymousClass47.topBackground);
                        super.dispatchDraw(canvas);
                    }
                    break;
                default:
                    super.dispatchDraw(canvas);
                    break;
            }
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            switch (this.$r8$classId) {
                case 1:
                    ContentPreviewViewer contentPreviewViewer = ContentPreviewViewer.getInstance();
                    EmojiBottomSheet.GifPage gifPage = (EmojiBottomSheet.GifPage) this.this$0;
                    return super.onInterceptTouchEvent(motionEvent) || contentPreviewViewer.onInterceptTouchEvent(motionEvent, gifPage.listView, gifPage.previewDelegate, this.resourcesProvider);
                default:
                    return super.onInterceptTouchEvent(motionEvent);
            }
        }
    }

    public BotCommandsMenuContainer(Context context) {
        super(context);
        this.currentAnimation = null;
        Paint paint = new Paint(1);
        this.topBackground = paint;
        this.dismissed = true;
        this.nestedScrollingParentHelper = new Version.ECB();
        ChatActivityEnterView.AnonymousClass47 anonymousClass47 = (ChatActivityEnterView.AnonymousClass47) this;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(anonymousClass47, context, 0);
        this.listView = anonymousClass1;
        anonymousClass1.setOverScrollMode(2);
        anonymousClass1.setClipToPadding(false);
        anonymousClass1.setClipToOutline(true);
        anonymousClass1.addOnScrollListener(new SettingsActivity.AnonymousClass5(anonymousClass47, 21));
        addView(anonymousClass1);
        paint.setColor(Theme.getColor(null, Theme.key_sheet_scrollUp, false));
        BlurredBackgroundDrawable blurredBackgroundDrawable = this.backgroundDrawable;
        if (blurredBackgroundDrawable != null) {
            blurredBackgroundDrawable.updateColors();
        }
        invalidate();
        setClipChildren(false);
    }

    public final void cancelCurrentAnimation() {
        ObjectAnimator objectAnimator = this.currentAnimation;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.currentAnimation.cancel();
            this.currentAnimation = null;
        }
    }

    public final void checkBackgroundBounds() {
        BlurredBackgroundDrawable blurredBackgroundDrawable = this.backgroundDrawable;
        if (blurredBackgroundDrawable != null) {
            blurredBackgroundDrawable.setBounds(0, ((int) this.scrollYOffset) - AndroidUtilities.dp(25.0f), getMeasuredWidth(), AndroidUtilities.dp(5.0f) + getMeasuredHeight());
            AnonymousClass1 anonymousClass1 = this.listView;
            anonymousClass1.invalidateOutline();
            anonymousClass1.invalidate();
        }
    }

    public final float clipBottom() {
        if (this.dismissed) {
            return 0.0f;
        }
        return Math.max(0.0f, getMeasuredHeight() - (this.listView.getTranslationY() + this.containerY));
    }

    public final void dismiss() {
        if (this.dismissed) {
            return;
        }
        this.dismissed = true;
        cancelCurrentAnimation();
        AnonymousClass1 anonymousClass1 = this.listView;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(anonymousClass1, (Property<AnonymousClass1, Float>) FrameLayout.TRANSLATION_Y, anonymousClass1.getTranslationY(), (getMeasuredHeight() - this.scrollYOffset) + AndroidUtilities.dp(40.0f));
        this.currentAnimation = objectAnimatorOfFloat;
        objectAnimatorOfFloat.addListener(new WebviewActivity.AnonymousClass3.AnonymousClass1(this, 12));
        this.currentAnimation.setDuration(150L);
        this.currentAnimation.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.currentAnimation.start();
        BotCommandsMenuView botCommandsMenuView = ChatActivityEnterView.this.botCommandsMenuButton;
        if (botCommandsMenuView != null) {
            botCommandsMenuView.setOpened(false);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= this.scrollYOffset - AndroidUtilities.dp(24.0f)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    public RecyclerListView getListView() {
        return this.listView;
    }

    @Override
    public int getNestedScrollAxes() {
        Version.ECB ecb = this.nestedScrollingParentHelper;
        return ecb.dataCodewords | ecb.count;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.entering && !this.dismissed) {
            AnonymousClass1 anonymousClass1 = this.listView;
            anonymousClass1.setTranslationY(AndroidUtilities.dp(16.0f) + (anonymousClass1.getMeasuredHeight() - anonymousClass1.getPaddingTop()));
            playEnterAnim(true);
            this.entering = false;
        }
        checkBackgroundBounds();
    }

    @Override
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    @Override
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (this.dismissed) {
            return;
        }
        cancelCurrentAnimation();
        AnonymousClass1 anonymousClass1 = this.listView;
        float translationY = anonymousClass1.getTranslationY();
        if (translationY <= 0.0f || i2 <= 0) {
            return;
        }
        float f = translationY - i2;
        iArr[1] = i2;
        anonymousClass1.setTranslationY(f >= 0.0f ? f : 0.0f);
        invalidate();
    }

    @Override
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        if (this.dismissed) {
            return;
        }
        cancelCurrentAnimation();
        if (i4 != 0) {
            AnonymousClass1 anonymousClass1 = this.listView;
            float translationY = anonymousClass1.getTranslationY() - i4;
            if (translationY < 0.0f) {
                translationY = 0.0f;
            }
            anonymousClass1.setTranslationY(translationY);
            invalidate();
        }
    }

    @Override
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.nestedScrollingParentHelper.count = i;
        if (this.dismissed) {
            return;
        }
        cancelCurrentAnimation();
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return !this.dismissed && i == 2;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        this.nestedScrollingParentHelper.count = 0;
        boolean z = this.dismissed;
        if (z || z) {
            return;
        }
        if (this.listView.getTranslationY() > AndroidUtilities.dp(16.0f)) {
            dismiss();
        } else {
            playEnterAnim(false);
        }
    }

    public final void playEnterAnim(boolean z) {
        if (this.dismissed) {
            return;
        }
        AnonymousClass1 anonymousClass1 = this.listView;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(anonymousClass1, (Property<AnonymousClass1, Float>) FrameLayout.TRANSLATION_Y, anonymousClass1.getTranslationY(), 0.0f);
        this.currentAnimation = objectAnimatorOfFloat;
        if (z) {
            objectAnimatorOfFloat.setDuration(320L);
            this.currentAnimation.setInterpolator(new OvershootInterpolator(0.8f));
        } else {
            objectAnimatorOfFloat.setDuration(150L);
            this.currentAnimation.setInterpolator(CubicBezierInterpolator.DEFAULT);
        }
        this.currentAnimation.start();
    }

    public void setBackgroundDrawable(BlurredBackgroundDrawable blurredBackgroundDrawable) {
        this.backgroundDrawable = blurredBackgroundDrawable;
        blurredBackgroundDrawable.setRadius(AndroidUtilities.dp(22.0f));
        this.backgroundDrawable.setPadding(AndroidUtilities.dp(5.0f));
        if (blurredBackgroundDrawable.viewOutlineProvider == null) {
            blurredBackgroundDrawable.viewOutlineProvider = new PremiumPreviewFragment.AnonymousClass3(blurredBackgroundDrawable, 5);
        }
        this.listView.setOutlineProvider(blurredBackgroundDrawable.viewOutlineProvider);
    }
}
