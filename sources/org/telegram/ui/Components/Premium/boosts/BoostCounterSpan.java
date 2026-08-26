package org.telegram.ui.Components.Premium.boosts;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import android.util.Pair;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.CubicBezierInterpolator;

public final class BoostCounterSpan extends ReplacementSpan {
    public final Drawable boostProfileBadge;
    public final Drawable boostProfileBadge2;
    public final AnimatedTextView.AnimatedTextDrawable countText;
    public final int currentCount;
    public boolean isRtl;
    public boolean margin;
    public final TextPaint namePaint;

    public BoostCounterSpan(ChatMessageCell chatMessageCell, TextPaint textPaint, int i) {
        this.namePaint = textPaint;
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(false, false, true, false);
        this.countText = animatedTextDrawable;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        animatedTextDrawable.moveAmplitude = 0.3f;
        animatedTextDrawable.animateDuration = 250L;
        animatedTextDrawable.animateWave = 1.0f;
        animatedTextDrawable.animateInterpolator = cubicBezierInterpolator;
        animatedTextDrawable.setCallback(chatMessageCell);
        animatedTextDrawable.setTextSize(AndroidUtilities.dp(11.5f));
        animatedTextDrawable.textPaint.setTypeface(AndroidUtilities.bold());
        animatedTextDrawable.setText("", true, true);
        animatedTextDrawable.gravity = 17;
        Drawable drawableMutate = chatMessageCell.getContext().getDrawable(R.drawable.mini_boost_profile_badge).mutate();
        this.boostProfileBadge = drawableMutate;
        Drawable drawableMutate2 = chatMessageCell.getContext().getDrawable(R.drawable.mini_boost_profile_badge2).mutate();
        this.boostProfileBadge2 = drawableMutate2;
        drawableMutate.setBounds(0, 0, drawableMutate.getIntrinsicWidth(), drawableMutate.getIntrinsicHeight());
        drawableMutate2.setBounds(0, 0, drawableMutate2.getIntrinsicWidth(), drawableMutate2.getIntrinsicHeight());
        this.currentCount = i;
        animatedTextDrawable.setText(i > 1 ? String.valueOf(i) : "", false, true);
    }

    public static Pair create(ChatMessageCell chatMessageCell, TextPaint textPaint, int i) {
        SpannableString spannableString = new SpannableString("d");
        BoostCounterSpan boostCounterSpan = new BoostCounterSpan(chatMessageCell, textPaint, i);
        spannableString.setSpan(boostCounterSpan, 0, 1, 33);
        return new Pair(spannableString, boostCounterSpan);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        TextPaint textPaint = this.namePaint;
        int color = textPaint.getColor();
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.countText;
        int color2 = animatedTextDrawable.textPaint.getColor();
        Drawable drawable = this.boostProfileBadge2;
        Drawable drawable2 = this.boostProfileBadge;
        if (color != color2) {
            int color3 = textPaint.getColor();
            animatedTextDrawable.textPaint.setColor(color3);
            animatedTextDrawable.alpha = Color.alpha(color3);
            int color4 = animatedTextDrawable.textPaint.getColor();
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable2.setColorFilter(new PorterDuffColorFilter(color4, mode));
            drawable.setColorFilter(new PorterDuffColorFilter(animatedTextDrawable.textPaint.getColor(), mode));
        }
        canvas.save();
        canvas.translate(f + ((!this.margin || this.isRtl) ? 0 : AndroidUtilities.dp(8.0f)), -AndroidUtilities.dp(0.2f));
        if (this.currentCount == 1) {
            canvas.translate(AndroidUtilities.dp(1.5f), 0.0f);
            drawable2.draw(canvas);
        } else {
            drawable.draw(canvas);
        }
        canvas.translate(AndroidUtilities.dp(16.0f), 0.0f);
        Rect rect = AndroidUtilities.rectTmp2;
        rect.set(0, 0, (int) animatedTextDrawable.getCurrentWidth(), (int) animatedTextDrawable.currentHeight);
        animatedTextDrawable.setBounds(rect);
        animatedTextDrawable.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return getWidth();
    }

    public final int getWidth() {
        float fDp = AndroidUtilities.dp((this.margin ? 8 : 0) + 16);
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.countText;
        return (int) (Math.max(animatedTextDrawable.currentWidth, animatedTextDrawable.oldWidth) + fDp);
    }
}
