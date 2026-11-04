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
import org.telegram.ui.ActionBar.d4;
public final class a2 extends View {
    public StaticLayout f39220a;
    public final RectF f39221b;
    public final Paint f39222c;
    public final Paint d;
    public String f39223e;
    public final TextPaint f39224f;
    public int h;
    public boolean f39225n;
    public final Drawable f39226r;
    public final d4 f39227s;

    public a2(Activity activity) {
        super(activity);
        this.f39221b = new RectF();
        Paint paint = new Paint(1);
        this.f39222c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        TextPaint textPaint = new TextPaint(1);
        this.f39224f = textPaint;
        this.h = 4;
        this.f39225n = false;
        this.f39227s = new d4(this, 14);
        textPaint.setTextSize(org.telegram.messenger.g0.L(15.0f));
        textPaint.setColor(-1);
        paint.setColor(i0.a.o(-1, 229));
        paint2.setColor(i0.a.o(-1, 102));
        Drawable drawable = activity.getDrawable(2131230918);
        this.f39226r = drawable;
        drawable.setBounds(0, 0, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
    }

    public final void a() {
        d4 d4Var = this.f39227s;
        removeCallbacks(d4Var);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        String g02 = org.telegram.messenger.g0.g0((int) (sharedInstance.getCallDuration() / 1000), true, false);
        String str = this.f39223e;
        if (str == null || !str.equals(g02)) {
            this.f39223e = g02;
            if (this.f39220a == null) {
                requestLayout();
            }
            String str2 = this.f39223e;
            TextPaint textPaint = this.f39224f;
            this.f39220a = new StaticLayout(str2, textPaint, (int) textPaint.measureText(str2), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        postDelayed(d4Var, 300L);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L;
        Paint paint;
        StaticLayout staticLayout = this.f39220a;
        int i3 = 0;
        if (staticLayout == null) {
            L = 0;
        } else {
            L = org.telegram.messenger.g0.L(21.0f) + staticLayout.getWidth();
        }
        canvas.save();
        canvas.translate((getMeasuredWidth() - L) / 2.0f, 0.0f);
        canvas.save();
        if (this.f39225n) {
            canvas.translate(-org.telegram.messenger.g0.L(7.0f), -org.telegram.messenger.g0.L(3.0f));
            this.f39226r.draw(canvas);
        } else {
            canvas.translate(0.0f, (getMeasuredHeight() - org.telegram.messenger.g0.L(11.0f)) / 2.0f);
            while (i3 < 4) {
                int i10 = i3 + 1;
                if (i10 > this.h) {
                    paint = this.d;
                } else {
                    paint = this.f39222c;
                }
                float f10 = i3;
                float N = org.telegram.messenger.g0.N(2.75f);
                RectF rectF = this.f39221b;
                rectF.set(org.telegram.messenger.g0.N(4.16f) * f10, org.telegram.messenger.g0.N(2.75f) * (3 - i3), N + (org.telegram.messenger.g0.N(4.16f) * f10), org.telegram.messenger.g0.L(11.0f));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.N(0.7f), org.telegram.messenger.g0.N(0.7f), paint);
                i3 = i10;
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
    public final void onMeasure(int i3, int i10) {
        StaticLayout staticLayout = this.f39220a;
        if (staticLayout != null) {
            setMeasuredDimension(View.MeasureSpec.getSize(i3), staticLayout.getHeight());
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(i3), org.telegram.messenger.g0.L(15.0f));
        }
    }

    public void setSignalBarCount(int i3) {
        this.h = i3;
        invalidate();
    }

    @Override
    public void setVisibility(int i3) {
        if (getVisibility() != i3) {
            if (i3 == 0) {
                this.f39223e = "00:00";
                String str = this.f39223e;
                TextPaint textPaint = this.f39224f;
                this.f39220a = new StaticLayout(str, textPaint, (int) textPaint.measureText(str), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                a();
            } else {
                this.f39223e = null;
                this.f39220a = null;
            }
        }
        super.setVisibility(i3);
    }
}
