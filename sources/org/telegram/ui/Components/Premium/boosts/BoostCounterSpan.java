package org.telegram.ui.Components.Premium.boosts;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import android.util.Pair;
import android.view.View;
import androidx.core.content.ContextCompat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.CubicBezierInterpolator;
public class BoostCounterSpan extends ReplacementSpan {
    private final Drawable boostProfileBadge;
    private final Drawable boostProfileBadge2;
    private final AnimatedTextView.AnimatedTextDrawable countText;
    private int currentCount;
    public boolean isRtl;
    private final TextPaint namePaint;

    public static Pair<SpannableString, BoostCounterSpan> create(View view, TextPaint textPaint, int i) {
        SpannableString spannableString = new SpannableString("d");
        BoostCounterSpan boostCounterSpan = new BoostCounterSpan(view, textPaint, i);
        spannableString.setSpan(boostCounterSpan, 0, 1, 33);
        return new Pair<>(spannableString, boostCounterSpan);
    }

    public BoostCounterSpan(View view, TextPaint textPaint, int i) {
        this.namePaint = textPaint;
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(false, false, true);
        this.countText = animatedTextDrawable;
        animatedTextDrawable.setAnimationProperties(0.3f, 0L, 250L, CubicBezierInterpolator.EASE_OUT_QUINT);
        animatedTextDrawable.setCallback(view);
        animatedTextDrawable.setTextSize(AndroidUtilities.dp(11.5f));
        animatedTextDrawable.setTypeface(AndroidUtilities.bold());
        animatedTextDrawable.setText("");
        animatedTextDrawable.setGravity(17);
        Drawable mutate = ContextCompat.getDrawable(view.getContext(), R.drawable.mini_boost_profile_badge).mutate();
        this.boostProfileBadge = mutate;
        Drawable mutate2 = ContextCompat.getDrawable(view.getContext(), R.drawable.mini_boost_profile_badge2).mutate();
        this.boostProfileBadge2 = mutate2;
        mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
        mutate2.setBounds(0, 0, mutate2.getIntrinsicWidth(), mutate2.getIntrinsicHeight());
        setCount(i, false);
    }

    public void setCount(int i, boolean z) {
        this.currentCount = i;
        this.countText.setText(i <= 1 ? "" : String.valueOf(i), z);
    }

    @Override
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return getWidth();
    }

    public int getWidth() {
        return (int) (AndroidUtilities.dp(16.0f) + this.countText.getWidth());
    }

    @Override
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (this.namePaint.getColor() != this.countText.getTextColor()) {
            this.countText.setTextColor(this.namePaint.getColor());
            this.boostProfileBadge.setColorFilter(new PorterDuffColorFilter(this.countText.getTextColor(), PorterDuff.Mode.MULTIPLY));
            this.boostProfileBadge2.setColorFilter(new PorterDuffColorFilter(this.countText.getTextColor(), PorterDuff.Mode.MULTIPLY));
        }
        canvas.save();
        canvas.translate(f, -AndroidUtilities.dp(0.2f));
        if (this.currentCount == 1) {
            canvas.translate(AndroidUtilities.dp(1.5f), 0.0f);
            this.boostProfileBadge.draw(canvas);
        } else {
            this.boostProfileBadge2.draw(canvas);
        }
        canvas.translate(AndroidUtilities.dp(16.0f), 0.0f);
        Rect rect = AndroidUtilities.rectTmp2;
        rect.set(0, 0, (int) this.countText.getCurrentWidth(), (int) this.countText.getHeight());
        this.countText.setBounds(rect);
        this.countText.draw(canvas);
        canvas.restore();
    }
}
