package org.telegram.ui.Stories;

import android.animation.ValueAnimator;
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
import androidx.recyclerview.widget.DiffUtil;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Charts.BaseChartView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.bots.BotSensors$1$$ExternalSyntheticLambda0;
import org.telegram.ui.iv.RichMediaCell$$ExternalSyntheticLambda1;

public final class StoriesIntro extends FrameLayout {
    public int current;
    public final ArrayList items;
    public int prev;
    public final BotSensors$1$$ExternalSyntheticLambda0 startItemAnimationRunnable;
    public ValueAnimator valueAnimator;

    public final class StoriesIntroItemView extends View {
        public final Paint backgroundPaint;
        public final String header;
        public final TextPaint headerTextPaint;
        public final RLottieDrawable lottieDrawable;
        public float progress;
        public final RectF rectF;
        public final String subHeader;
        public final TextPaint subHeaderTextPaint;
        public final Rect textBounds;

        public StoriesIntroItemView(Context context, int i, String str, String str2) {
            super(context);
            this.textBounds = new Rect();
            this.header = str;
            this.subHeader = str2;
            RLottieDrawable rLottieDrawable = new RLottieDrawable(i, DiffUtil.m(i, ""), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), true, null);
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
            textPaint.setTypeface(AndroidUtilities.bold());
            TextPaint textPaint2 = new TextPaint(1);
            this.subHeaderTextPaint = textPaint2;
            textPaint2.setColor(-1761607681);
            textPaint2.setTextSize(TypedValue.applyDimension(1, 14.0f, getResources().getDisplayMetrics()));
            this.rectF = new RectF();
        }

        @Override
        public final void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            int iDp = AndroidUtilities.dp(40.0f);
            int measuredHeight = getMeasuredHeight() / 2;
            int iDp2 = (int) ((AndroidUtilities.dp(8.0f) * this.progress) + AndroidUtilities.dp(36.0f));
            int i = iDp2 / 2;
            int i2 = iDp - i;
            int i3 = measuredHeight - i;
            RLottieDrawable rLottieDrawable = this.lottieDrawable;
            rLottieDrawable.setBounds(i2, i3, i2 + iDp2, iDp2 + i3);
            rLottieDrawable.draw(canvas);
            if (this.progress > 0.0f) {
                float fDpf2 = (1.0f - this.progress) * AndroidUtilities.dpf2(4.0f);
                RectF rectF = this.rectF;
                float f = fDpf2 * 2.0f;
                rectF.set(fDpf2, fDpf2, getMeasuredWidth() - f, getMeasuredHeight() - f);
                Paint paint = this.backgroundPaint;
                paint.setAlpha((int) (this.progress * 30.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(12.0f), AndroidUtilities.dpf2(12.0f), paint);
                canvas.save();
                float f2 = (this.progress * 0.05f) + 1.0f;
                canvas.scale(f2, f2, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
            }
            canvas.drawText(this.header, AndroidUtilities.dpf2(80.0f), (getMeasuredHeight() / 2.0f) - AndroidUtilities.dpf2(4.0f), this.headerTextPaint);
            canvas.drawText(this.subHeader, AndroidUtilities.dpf2(80.0f), AndroidUtilities.dpf2(18.0f) + (getMeasuredHeight() / 2.0f), this.subHeaderTextPaint);
            if (this.progress > 0.0f) {
                canvas.restore();
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int iDp = AndroidUtilities.dp(40.0f);
            int measuredHeight = getMeasuredHeight() / 2;
            int iDp2 = AndroidUtilities.dp(36.0f);
            int i3 = iDp2 / 2;
            int i4 = iDp - i3;
            int i5 = measuredHeight - i3;
            this.lottieDrawable.setBounds(i4, i5, i4 + iDp2, iDp2 + i5);
        }
    }

    public StoriesIntro(Context context, final StoryViewer.AnonymousClass2 anonymousClass2) {
        super(context);
        this.prev = -1;
        int i = 0;
        this.current = 0;
        this.startItemAnimationRunnable = new BotSensors$1$$ExternalSyntheticLambda0(this, 3);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        addView(imageView, -1, -1);
        View view = new View(context);
        view.setBackgroundColor(1677721600);
        addView(view, -1, -1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f));
        linearLayout.setGravity(1);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.StoriesIntroHeader));
        textView.setTextSize(1, 20.0f);
        linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2));
        final TextView textView2 = new TextView(context);
        textView2.setTextColor(-1761607681);
        textView2.setText(LocaleController.getString(R.string.StoriesIntroSubHeader));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        linearLayout.addView(textView2, LayoutHelper.createLinear(-2, -2, 68.0f, 8.0f, 68.0f, 36.0f));
        ArrayList arrayList = new ArrayList(4);
        this.items = arrayList;
        arrayList.add(new StoriesIntroItemView(context, R.raw.stories_intro_go_forward, LocaleController.getString(R.string.StoriesIntroGoForwardHeader), LocaleController.getString(R.string.StoriesIntroGoForwardSubHeader)));
        arrayList.add(new StoriesIntroItemView(context, R.raw.stories_intro_pause, LocaleController.getString(R.string.StoriesIntroPauseAndSeekHeader), LocaleController.getString(R.string.StoriesIntroPauseAndSeekSubHeader)));
        arrayList.add(new StoriesIntroItemView(context, R.raw.stories_intro_go_back, LocaleController.getString(R.string.StoriesIntroGoBackHeader), LocaleController.getString(R.string.StoriesIntroGoBackSubHeader)));
        arrayList.add(new StoriesIntroItemView(context, R.raw.stories_intro_go_to_next, LocaleController.getString(R.string.StoriesIntroGoToNextAuthorHeader), LocaleController.getString(R.string.StoriesIntroGoToNextAuthorSubHeader)));
        int measuredWidth = anonymousClass2.getMeasuredWidth() - AndroidUtilities.dp(100.0f);
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            StoriesIntroItemView storiesIntroItemView = (StoriesIntroItemView) obj;
            TextPaint textPaint = storiesIntroItemView.headerTextPaint;
            String str = storiesIntroItemView.header;
            int length = str.length();
            Rect rect = storiesIntroItemView.textBounds;
            textPaint.getTextBounds(str, 0, length, rect);
            int iWidth = rect.width();
            TextPaint textPaint2 = storiesIntroItemView.subHeaderTextPaint;
            String str2 = storiesIntroItemView.subHeader;
            textPaint2.getTextBounds(str2, 0, str2.length(), rect);
            int iMax = Math.max(iWidth, rect.width()) + AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(88.0f);
            if (iMax > measuredWidth) {
                measuredWidth = iMax;
            }
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(AndroidUtilities.dp(8.0f) + measuredWidth > anonymousClass2.getMeasuredWidth() ? anonymousClass2.getMeasuredWidth() - AndroidUtilities.dp(8.0f) : measuredWidth, AndroidUtilities.dp(64.0f));
        layoutParams.setMargins(0, AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f));
        ArrayList arrayList2 = this.items;
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj2 = arrayList2.get(i);
            i++;
            linearLayout.addView((StoriesIntroItemView) obj2, layoutParams);
        }
        final TextView textView3 = new TextView(context);
        textView3.setTextColor(-1);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setText(LocaleController.getString(R.string.StoriesIntroDismiss));
        textView3.setTextSize(1, 14.0f);
        linearLayout.addView(textView3, LayoutHelper.createLinear(-2, -2, 0.0f, 73.0f, 0.0f, 0.0f));
        addView(linearLayout, LayoutHelper.createFrame(-1, -2, 17));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getContext().getResources(), AndroidUtilities.makeBlurBitmap(anonymousClass2, 12.0f, 10));
        bitmapDrawable.setColorFilter(new PorterDuffColorFilter(-587202560, PorterDuff.Mode.DST_OVER));
        imageView.setImageDrawable(bitmapDrawable);
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public final void onGlobalLayout() {
                int[] iArr = new int[2];
                TextView textView4 = textView3;
                textView4.getLocationOnScreen(iArr);
                int iDp = AndroidUtilities.dp(24.0f) + iArr[1];
                int measuredHeight = anonymousClass2.getMeasuredHeight();
                StoriesIntro storiesIntro = StoriesIntro.this;
                if (iDp > measuredHeight) {
                    textView4.setLayoutParams(LayoutHelper.createLinear(-2, -2, 0.0f, 13.0f, 0.0f, 0.0f));
                    textView2.setLayoutParams(LayoutHelper.createLinear(-2, -2, 68.0f, 8.0f, 68.0f, 13.0f));
                    storiesIntro.requestLayout();
                }
                storiesIntro.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        });
    }

    public final void startAnimation(boolean z) {
        ValueAnimator valueAnimator = this.valueAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.valueAnimator = valueAnimatorOfFloat;
        if (z) {
            valueAnimatorOfFloat.setStartDelay(50L);
        }
        this.valueAnimator.setDuration(350L);
        this.valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        this.valueAnimator.getCurrentPlayTime();
        this.valueAnimator.addListener(new BaseChartView.AnonymousClass4(this, 25));
        this.valueAnimator.addUpdateListener(new RichMediaCell$$ExternalSyntheticLambda1(this, 14));
        this.valueAnimator.start();
        AndroidUtilities.runOnUIThread(this.startItemAnimationRunnable, (((StoriesIntroItemView) this.items.get(this.current)).lottieDrawable.getDuration() * 2) + 100);
    }

    public final void stopAnimation() {
        AndroidUtilities.cancelRunOnUIThread(this.startItemAnimationRunnable);
        ValueAnimator valueAnimator = this.valueAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.valueAnimator = null;
        }
        int i = this.prev;
        ArrayList arrayList = this.items;
        if (i != -1) {
            StoriesIntroItemView storiesIntroItemView = (StoriesIntroItemView) arrayList.get(i);
            storiesIntroItemView.lottieDrawable.setCurrentFrame(0);
            storiesIntroItemView.lottieDrawable.stop();
            storiesIntroItemView.progress = 0.0f;
            storiesIntroItemView.invalidate();
        }
        StoriesIntroItemView storiesIntroItemView2 = (StoriesIntroItemView) arrayList.get(this.current);
        storiesIntroItemView2.lottieDrawable.setCurrentFrame(0);
        storiesIntroItemView2.lottieDrawable.stop();
        storiesIntroItemView2.progress = 0.0f;
        storiesIntroItemView2.invalidate();
        int i2 = this.current + 1;
        this.current = i2;
        if (i2 >= arrayList.size()) {
            this.current = 0;
        }
        int i3 = this.prev + 1;
        this.prev = i3;
        if (i3 >= arrayList.size()) {
            this.prev = 0;
        }
    }
}
