package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.m5;
public final class l2 extends View {
    public StaticLayout f39353a;
    public final RectF f39354b;
    public final Paint f39355c;
    public final Paint d;
    public String f39356e;
    public final TextPaint f39357f;
    public int h;
    public boolean f39358n;
    public final Drawable f39359r;
    public final m5 f39360s;

    public l2(Activity activity) {
        super(activity);
        this.f39354b = new RectF();
        Paint paint = new Paint(1);
        this.f39355c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        TextPaint textPaint = new TextPaint(1);
        this.f39357f = textPaint;
        this.h = 4;
        this.f39358n = false;
        this.f39360s = new m5(this, 9);
        textPaint.setTextSize(org.telegram.messenger.g0.L(15.0f));
        textPaint.setColor(-1);
        paint.setColor(i0.a.o(-1, 229));
        paint2.setColor(i0.a.o(-1, 102));
        Drawable drawable = activity.getDrawable(2131230918);
        this.f39359r = drawable;
        drawable.setBounds(0, 0, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
    }

    public final void a() {
        m5 m5Var = this.f39360s;
        removeCallbacks(m5Var);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        String g02 = org.telegram.messenger.g0.g0((int) (sharedInstance.getCallDuration() / 1000), true, false);
        String str = this.f39356e;
        if (str == null || !str.equals(g02)) {
            this.f39356e = g02;
            if (this.f39353a == null) {
                requestLayout();
            }
            String str2 = this.f39356e;
            TextPaint textPaint = this.f39357f;
            this.f39353a = new StaticLayout(str2, textPaint, (int) textPaint.measureText(str2), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        postDelayed(m5Var, 300L);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L;
        Paint paint;
        StaticLayout staticLayout = this.f39353a;
        int i7 = 0;
        if (staticLayout == null) {
            L = 0;
        } else {
            L = org.telegram.messenger.g0.L(21.0f) + staticLayout.getWidth();
        }
        canvas.save();
        canvas.translate((getMeasuredWidth() - L) / 2.0f, 0.0f);
        canvas.save();
        if (this.f39358n) {
            canvas.translate(-org.telegram.messenger.g0.L(7.0f), -org.telegram.messenger.g0.L(3.0f));
            this.f39359r.draw(canvas);
        } else {
            canvas.translate(0.0f, (getMeasuredHeight() - org.telegram.messenger.g0.L(11.0f)) / 2.0f);
            while (i7 < 4) {
                int i10 = i7 + 1;
                if (i10 > this.h) {
                    paint = this.d;
                } else {
                    paint = this.f39355c;
                }
                float f10 = i7;
                float N = org.telegram.messenger.g0.N(2.75f);
                RectF rectF = this.f39354b;
                rectF.set(org.telegram.messenger.g0.N(4.16f) * f10, org.telegram.messenger.g0.N(2.75f) * (3 - i7), N + (org.telegram.messenger.g0.N(4.16f) * f10), org.telegram.messenger.g0.L(11.0f));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.N(0.7f), org.telegram.messenger.g0.N(0.7f), paint);
                i7 = i10;
            }
        }
        canvas.restore();
        if (staticLayout != null) {
            canvas.translate(org.telegram.messenger.g0.L(21.0f), 0.0f);
            staticLayout.draw(canvas);
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        StaticLayout staticLayout = this.f39353a;
        if (staticLayout != null) {
            setMeasuredDimension(View.MeasureSpec.getSize(i7), staticLayout.getHeight());
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(15.0f));
        }
    }

    public void setSignalBarCount(int i7) {
        this.h = i7;
        invalidate();
    }

    @Override
    public void setVisibility(int i7) {
        if (getVisibility() != i7) {
            if (i7 == 0) {
                this.f39356e = "00:00";
                String str = this.f39356e;
                TextPaint textPaint = this.f39357f;
                this.f39353a = new StaticLayout(str, textPaint, (int) textPaint.measureText(str), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                a();
            } else {
                this.f39356e = null;
                this.f39353a = null;
            }
        }
        super.setVisibility(i7);
    }
}
