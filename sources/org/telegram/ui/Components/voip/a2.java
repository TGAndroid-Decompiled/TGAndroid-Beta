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
import org.telegram.ui.ActionBar.w5;
public final class a2 extends View {
    public StaticLayout f31376a;
    public final RectF f31377b;
    public final Paint f31378c;
    public final Paint d;
    public String e;
    public final TextPaint f31379f;
    public int h;
    public boolean f31380n;
    public final Drawable f31381r;
    public final w5 f31382s;

    public a2(Activity activity) {
        super(activity);
        this.f31377b = new RectF();
        Paint paint = new Paint(1);
        this.f31378c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        TextPaint textPaint = new TextPaint(1);
        this.f31379f = textPaint;
        this.h = 4;
        this.f31380n = false;
        this.f31382s = new w5(this, 10);
        textPaint.setTextSize(org.telegram.messenger.i0.L(15.0f));
        textPaint.setColor(-1);
        paint.setColor(i0.b.o(-1, 229));
        paint2.setColor(i0.b.o(-1, 102));
        Drawable drawable = activity.getDrawable(2131230918);
        this.f31381r = drawable;
        drawable.setBounds(0, 0, org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(24.0f));
    }

    public final void a() {
        w5 w5Var = this.f31382s;
        removeCallbacks(w5Var);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        String g02 = org.telegram.messenger.i0.g0((int) (sharedInstance.getCallDuration() / 1000), true, false);
        String str = this.e;
        if (str == null || !str.equals(g02)) {
            this.e = g02;
            if (this.f31376a == null) {
                requestLayout();
            }
            String str2 = this.e;
            TextPaint textPaint = this.f31379f;
            this.f31376a = new StaticLayout(str2, textPaint, (int) textPaint.measureText(str2), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        postDelayed(w5Var, 300L);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L;
        Paint paint;
        StaticLayout staticLayout = this.f31376a;
        int i10 = 0;
        if (staticLayout == null) {
            L = 0;
        } else {
            L = org.telegram.messenger.i0.L(21.0f) + staticLayout.getWidth();
        }
        canvas.save();
        canvas.translate((getMeasuredWidth() - L) / 2.0f, 0.0f);
        canvas.save();
        if (this.f31380n) {
            canvas.translate(-org.telegram.messenger.i0.L(7.0f), -org.telegram.messenger.i0.L(3.0f));
            this.f31381r.draw(canvas);
        } else {
            canvas.translate(0.0f, (getMeasuredHeight() - org.telegram.messenger.i0.L(11.0f)) / 2.0f);
            while (i10 < 4) {
                int i11 = i10 + 1;
                if (i11 > this.h) {
                    paint = this.d;
                } else {
                    paint = this.f31378c;
                }
                float f7 = i10;
                float N = org.telegram.messenger.i0.N(2.75f);
                RectF rectF = this.f31377b;
                rectF.set(org.telegram.messenger.i0.N(4.16f) * f7, org.telegram.messenger.i0.N(2.75f) * (3 - i10), N + (org.telegram.messenger.i0.N(4.16f) * f7), org.telegram.messenger.i0.L(11.0f));
                canvas.drawRoundRect(rectF, org.telegram.messenger.i0.N(0.7f), org.telegram.messenger.i0.N(0.7f), paint);
                i10 = i11;
            }
        }
        canvas.restore();
        if (staticLayout != null) {
            canvas.translate(org.telegram.messenger.i0.L(21.0f), 0.0f);
            staticLayout.draw(canvas);
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        StaticLayout staticLayout = this.f31376a;
        if (staticLayout != null) {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), staticLayout.getHeight());
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.i0.L(15.0f));
        }
    }

    public void setSignalBarCount(int i10) {
        this.h = i10;
        invalidate();
    }

    @Override
    public void setVisibility(int i10) {
        if (getVisibility() != i10) {
            if (i10 == 0) {
                this.e = "00:00";
                String str = this.e;
                TextPaint textPaint = this.f31379f;
                this.f31376a = new StaticLayout(str, textPaint, (int) textPaint.measureText(str), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                a();
            } else {
                this.e = null;
                this.f31376a = null;
            }
        }
        super.setVisibility(i10);
    }
}
