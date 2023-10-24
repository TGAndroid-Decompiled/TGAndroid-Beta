package org.telegram.ui.Stories;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextPaint;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RLottieDrawable;
@SuppressLint({"ViewConstructor"})
public class StoriesIntro extends FrameLayout {
    private int current;
    private final ArrayList<StoriesIntroItemView> items;
    private int prev;
    private final Runnable startItemAnimationRunnable;
    private ValueAnimator valueAnimator;

    public void lambda$new$0() {
        updateCurrentAnimatedItem();
        startAnimation(true);
    }

    public StoriesIntro(Context context, final View view) {
        super(context);
        this.prev = -1;
        this.current = 0;
        this.startItemAnimationRunnable = new Runnable() {
            @Override
            public final void run() {
                StoriesIntro.this.lambda$new$0();
            }
        };
        ImageView imageView = new ImageView(context);
        addView(imageView, -1, -1);
        View view2 = new View(context);
        view2.setBackgroundColor(1677721600);
        addView(view2, -1, -1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f));
        linearLayout.setGravity(1);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        textView.setText(LocaleController.getString("StoriesIntroHeader", R.string.StoriesIntroHeader));
        textView.setTextSize(1, 20.0f);
        linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2));
        final TextView textView2 = new TextView(context);
        textView2.setTextColor(-1761607681);
        textView2.setText(LocaleController.getString("StoriesIntroSubHeader", R.string.StoriesIntroSubHeader));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        linearLayout.addView(textView2, LayoutHelper.createLinear(-2, -2, 68.0f, 8.0f, 68.0f, 36.0f));
        ArrayList<StoriesIntroItemView> arrayList = new ArrayList<>(4);
        this.items = arrayList;
        arrayList.add(new StoriesIntroItemView(context, R.raw.stories_intro_go_forward, LocaleController.getString("StoriesIntroGoForwardHeader", R.string.StoriesIntroGoForwardHeader), LocaleController.getString("StoriesIntroGoForwardSubHeader", R.string.StoriesIntroGoForwardSubHeader)));
        arrayList.add(new StoriesIntroItemView(context, R.raw.stories_intro_pause, LocaleController.getString("StoriesIntroPauseAndSeekHeader", R.string.StoriesIntroPauseAndSeekHeader), LocaleController.getString("StoriesIntroPauseAndSeekSubHeader", R.string.StoriesIntroPauseAndSeekSubHeader)));
        arrayList.add(new StoriesIntroItemView(context, R.raw.stories_intro_go_back, LocaleController.getString("StoriesIntroGoBackHeader", R.string.StoriesIntroGoBackHeader), LocaleController.getString("StoriesIntroGoBackSubHeader", R.string.StoriesIntroGoBackSubHeader)));
        arrayList.add(new StoriesIntroItemView(context, R.raw.stories_intro_go_to_next, LocaleController.getString("StoriesIntroGoToNextAuthorHeader", R.string.StoriesIntroGoToNextAuthorHeader), LocaleController.getString("StoriesIntroGoToNextAuthorSubHeader", R.string.StoriesIntroGoToNextAuthorSubHeader)));
        int measuredWidth = view.getMeasuredWidth() - AndroidUtilities.dp(100.0f);
        Iterator<StoriesIntroItemView> it = arrayList.iterator();
        while (it.hasNext()) {
            int requiredWidth = it.next().getRequiredWidth();
            if (requiredWidth > measuredWidth) {
                measuredWidth = requiredWidth;
            }
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(AndroidUtilities.dp(8.0f) + measuredWidth > view.getMeasuredWidth() ? view.getMeasuredWidth() - AndroidUtilities.dp(8.0f) : measuredWidth, AndroidUtilities.dp(64.0f));
        layoutParams.setMargins(0, AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f));
        Iterator<StoriesIntroItemView> it2 = this.items.iterator();
        while (it2.hasNext()) {
            linearLayout.addView(it2.next(), layoutParams);
        }
        final TextView textView3 = new TextView(context);
        textView3.setTextColor(-1);
        textView3.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        textView3.setText(LocaleController.getString("StoriesIntroDismiss", R.string.StoriesIntroDismiss));
        textView3.setTextSize(1, 14.0f);
        linearLayout.addView(textView3, LayoutHelper.createLinear(-2, -2, 0.0f, 73.0f, 0.0f, 0.0f));
        addView(linearLayout, LayoutHelper.createFrame(-1, -2, 17));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getContext().getResources(), AndroidUtilities.makeBlurBitmap(view, 12.0f, 10));
        bitmapDrawable.setColorFilter(new PorterDuffColorFilter(-587202560, PorterDuff.Mode.DST_OVER));
        imageView.setImageDrawable(bitmapDrawable);
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                int[] iArr = new int[2];
                textView3.getLocationOnScreen(iArr);
                if (iArr[1] + AndroidUtilities.dp(24.0f) > view.getMeasuredHeight()) {
                    textView3.setLayoutParams(LayoutHelper.createLinear(-2, -2, 0.0f, 13.0f, 0.0f, 0.0f));
                    textView2.setLayoutParams(LayoutHelper.createLinear(-2, -2, 68.0f, 8.0f, 68.0f, 13.0f));
                    StoriesIntro.this.requestLayout();
                }
                StoriesIntro.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        });
    }

    public void startAnimation(boolean z) {
        ValueAnimator valueAnimator = this.valueAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.valueAnimator = ofFloat;
        if (z) {
            ofFloat.setStartDelay(50L);
        }
        this.valueAnimator.setDuration(350L);
        this.valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        this.valueAnimator.getCurrentPlayTime();
        this.valueAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                ((StoriesIntroItemView) StoriesIntro.this.items.get(StoriesIntro.this.current)).startIconAnimation();
            }
        });
        this.valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                StoriesIntro.this.lambda$startAnimation$1(valueAnimator2);
            }
        });
        this.valueAnimator.start();
        AndroidUtilities.runOnUIThread(this.startItemAnimationRunnable, this.items.get(this.current).getLottieAnimationDuration() + 100);
    }

    public void lambda$startAnimation$1(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.items.get(this.current).setProgress(floatValue);
        int i = this.prev;
        if (i != -1) {
            this.items.get(i).setProgress(1.0f - floatValue);
        }
    }

    public void stopAnimation() {
        AndroidUtilities.cancelRunOnUIThread(this.startItemAnimationRunnable);
        ValueAnimator valueAnimator = this.valueAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.valueAnimator = null;
        }
        int i = this.prev;
        if (i != -1) {
            this.items.get(i).stopAnimation();
        }
        this.items.get(this.current).stopAnimation();
        updateCurrentAnimatedItem();
    }

    private void updateCurrentAnimatedItem() {
        int i = this.current + 1;
        this.current = i;
        if (i >= this.items.size()) {
            this.current = 0;
        }
        int i2 = this.prev + 1;
        this.prev = i2;
        if (i2 >= this.items.size()) {
            this.prev = 0;
        }
    }

    @SuppressLint({"ViewConstructor"})
    public static class StoriesIntroItemView extends View {
        private final Paint backgroundPaint;
        private final String header;
        private final TextPaint headerTextPaint;
        private final RLottieDrawable lottieDrawable;
        private float progress;
        private final RectF rectF;
        private final String subHeader;
        private final TextPaint subHeaderTextPaint;
        private final Rect textBounds;

        public StoriesIntroItemView(Context context, int i, String str, String str2) {
            super(context);
            this.textBounds = new Rect();
            this.header = str;
            this.subHeader = str2;
            RLottieDrawable rLottieDrawable = new RLottieDrawable(i, "" + i, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), true, null);
            this.lottieDrawable = rLottieDrawable;
            rLottieDrawable.setAutoRepeat(1);
            rLottieDrawable.setMasterParent(this);
            Paint paint = new Paint(1);
            this.backgroundPaint = paint;
            paint.setColor(383310040);
            TextPaint textPaint = new TextPaint(1);
            this.headerTextPaint = textPaint;
            textPaint.setColor(-1);
            textPaint.setTextSize(TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics()));
            textPaint.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            TextPaint textPaint2 = new TextPaint(1);
            this.subHeaderTextPaint = textPaint2;
            textPaint2.setColor(-1761607681);
            textPaint2.setTextSize(TypedValue.applyDimension(1, 14.0f, getResources().getDisplayMetrics()));
            this.rectF = new RectF();
        }

        public int getRequiredWidth() {
            TextPaint textPaint = this.headerTextPaint;
            String str = this.header;
            textPaint.getTextBounds(str, 0, str.length(), this.textBounds);
            int width = this.textBounds.width();
            TextPaint textPaint2 = this.subHeaderTextPaint;
            String str2 = this.subHeader;
            textPaint2.getTextBounds(str2, 0, str2.length(), this.textBounds);
            return AndroidUtilities.dp(88.0f) + AndroidUtilities.dp(8.0f) + Math.max(width, this.textBounds.width());
        }

        public long getLottieAnimationDuration() {
            return this.lottieDrawable.getDuration() * 2;
        }

        public void stopAnimation() {
            this.lottieDrawable.setCurrentFrame(0);
            this.lottieDrawable.stop();
            this.progress = 0.0f;
            invalidate();
        }

        public void startIconAnimation() {
            this.lottieDrawable.setAutoRepeatCount(2);
            this.lottieDrawable.start();
        }

        public void setProgress(float f) {
            this.progress = f;
            invalidate();
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int dp = AndroidUtilities.dp(40.0f);
            int dp2 = AndroidUtilities.dp(36.0f);
            int i3 = dp2 / 2;
            int i4 = dp - i3;
            int measuredHeight = (getMeasuredHeight() / 2) - i3;
            this.lottieDrawable.setBounds(i4, measuredHeight, i4 + dp2, dp2 + measuredHeight);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            int dp = AndroidUtilities.dp(40.0f);
            int dp2 = (int) (AndroidUtilities.dp(36.0f) + (AndroidUtilities.dp(8.0f) * this.progress));
            int i = dp2 / 2;
            int i2 = dp - i;
            int measuredHeight = (getMeasuredHeight() / 2) - i;
            this.lottieDrawable.setBounds(i2, measuredHeight, i2 + dp2, dp2 + measuredHeight);
            this.lottieDrawable.draw(canvas);
            if (this.progress > 0.0f) {
                float dpf2 = AndroidUtilities.dpf2(4.0f) * (1.0f - this.progress);
                float f = dpf2 * 2.0f;
                this.rectF.set(dpf2, dpf2, getMeasuredWidth() - f, getMeasuredHeight() - f);
                this.backgroundPaint.setAlpha((int) (this.progress * 30.0f));
                canvas.drawRoundRect(this.rectF, AndroidUtilities.dpf2(12.0f), AndroidUtilities.dpf2(12.0f), this.backgroundPaint);
                canvas.save();
                float f2 = this.progress;
                canvas.scale((f2 * 0.05f) + 1.0f, (f2 * 0.05f) + 1.0f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
            }
            canvas.drawText(this.header, AndroidUtilities.dpf2(80.0f), (getMeasuredHeight() / 2.0f) - AndroidUtilities.dpf2(4.0f), this.headerTextPaint);
            canvas.drawText(this.subHeader, AndroidUtilities.dpf2(80.0f), (getMeasuredHeight() / 2.0f) + AndroidUtilities.dpf2(18.0f), this.subHeaderTextPaint);
            if (this.progress > 0.0f) {
                canvas.restore();
            }
        }
    }
}
