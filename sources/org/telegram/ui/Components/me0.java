package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;

public final class me0 extends View {

    public int f30656a;

    public boolean f30657b;

    public boolean f30658c;
    public float d;

    public yj0 f30659e;

    public Paint f30660f;
    public Paint h;

    public Paint f30661n;

    public TextPaint f30662r;

    public Path f30663s;
    public le0 v;

    public re0 f30664w;

    public final void a(int i10, MotionEvent motionEvent) {
        se0 se0Var;
        float x8 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (i10 == 1) {
            if (this.f30656a != 0) {
                return;
            }
            yj0 yj0Var = this.f30659e;
            this.f30656a = (int) Math.floor(com.google.android.recaptcha.internal.a.A(x8, yj0Var.f34911a, yj0Var.f34913c / 5.0f, 1.0f));
            return;
        }
        if (i10 != 2) {
            if ((i10 == 3 || i10 == 4 || i10 == 5) && this.f30656a != 0) {
                this.f30656a = 0;
                return;
            }
            return;
        }
        float fMin = Math.min(2.0f, (this.d - y10) / 8.0f);
        re0 re0Var = this.f30664w;
        int i11 = re0Var.f32147f;
        if (i11 == 0) {
            se0Var = re0Var.f32143a;
        } else if (i11 == 1) {
            se0Var = re0Var.f32144b;
        } else if (i11 != 2) {
            se0Var = i11 != 3 ? null : re0Var.d;
        } else {
            se0Var = re0Var.f32145c;
        }
        int i12 = this.f30656a;
        if (i12 == 1) {
            se0Var.f32408a = Math.max(0.0f, Math.min(100.0f, se0Var.f32408a + fMin));
        } else if (i12 == 2) {
            se0Var.f32409b = Math.max(0.0f, Math.min(100.0f, se0Var.f32409b + fMin));
        } else if (i12 == 3) {
            se0Var.f32410c = Math.max(0.0f, Math.min(100.0f, se0Var.f32410c + fMin));
        } else if (i12 == 4) {
            se0Var.d = Math.max(0.0f, Math.min(100.0f, se0Var.d + fMin));
        } else if (i12 == 5) {
            se0Var.f32411e = Math.max(0.0f, Math.min(100.0f, se0Var.f32411e + fMin));
        }
        invalidate();
        le0 le0Var = this.v;
        if (le0Var != null) {
            ve0 ve0Var = ((ne0) le0Var).f30963a;
            ve0Var.g();
            jz jzVar = ve0Var.f33390h0;
            if (jzVar != null) {
                jzVar.e(false, false, false);
            }
        }
        this.d = y10;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        se0 se0Var;
        String str;
        TextPaint textPaint = this.f30662r;
        Path path = this.f30663s;
        Paint paint = this.f30661n;
        re0 re0Var = this.f30664w;
        yj0 yj0Var = this.f30659e;
        float f10 = yj0Var.f34913c / 5.0f;
        for (int i10 = 0; i10 < 4; i10++) {
            float f11 = yj0Var.f34911a;
            float f12 = i10 * f10;
            float f13 = f11 + f10 + f12;
            float f14 = yj0Var.f34912b;
            canvas.drawLine(f13, f14, f12 + f11 + f10, f14 + yj0Var.d, this.f30660f);
        }
        float f15 = yj0Var.f34911a;
        float f16 = yj0Var.f34912b;
        canvas.drawLine(f15, f16 + yj0Var.d, f15 + yj0Var.f34913c, f16, this.h);
        int i11 = re0Var.f32147f;
        int i12 = 3;
        int i13 = 2;
        if (i11 == 0) {
            paint.setColor(-1);
            se0Var = re0Var.f32143a;
        } else if (i11 == 1) {
            paint.setColor(-1229492);
            se0Var = re0Var.f32144b;
        } else if (i11 == 2) {
            paint.setColor(-15667555);
            se0Var = re0Var.f32145c;
        } else if (i11 != 3) {
            se0Var = null;
        } else {
            paint.setColor(-13404165);
            se0Var = re0Var.d;
        }
        int i14 = 0;
        while (i14 < 5) {
            if (i14 == 0) {
                str = String.format(Locale.US, "%.2f", Float.valueOf(se0Var.f32408a / 100.0f));
            } else if (i14 == 1) {
                str = String.format(Locale.US, "%.2f", Float.valueOf(se0Var.f32409b / 100.0f));
            } else if (i14 == i13) {
                str = String.format(Locale.US, "%.2f", Float.valueOf(se0Var.f32410c / 100.0f));
            } else if (i14 != i12) {
                str = i14 != 4 ? "" : String.format(Locale.US, "%.2f", Float.valueOf(se0Var.f32411e / 100.0f));
            } else {
                str = String.format(Locale.US, "%.2f", Float.valueOf(se0Var.d / 100.0f));
            }
            canvas.drawText(str, (i14 * f10) + com.google.android.recaptcha.internal.a.A(f10, textPaint.measureText(str), 2.0f, yj0Var.f34911a), (yj0Var.f34912b + yj0Var.d) - AndroidUtilities.dp(4.0f), textPaint);
            i14++;
            i12 = 3;
            i13 = 2;
        }
        float[] fArrA = se0Var.a();
        invalidate();
        path.reset();
        for (int i15 = 0; i15 < fArrA.length / 2; i15++) {
            if (i15 == 0) {
                int i16 = i15 * 2;
                path.moveTo((fArrA[i16] * yj0Var.f34913c) + yj0Var.f34911a, ((1.0f - fArrA[i16 + 1]) * yj0Var.d) + yj0Var.f34912b);
            } else {
                int i17 = i15 * 2;
                path.lineTo((fArrA[i17] * yj0Var.f34913c) + yj0Var.f34911a, ((1.0f - fArrA[i17 + 1]) * yj0Var.d) + yj0Var.f34912b);
            }
        }
        canvas.drawPath(path, paint);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.me0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(le0 le0Var) {
        this.v = le0Var;
    }
}
