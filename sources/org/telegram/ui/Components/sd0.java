package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Region;
import android.text.TextPaint;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public class sd0 extends FrameLayout {
    public static final dw0 I;
    public static final dw0 J;
    public static final dw0 K;
    public boolean E;
    public boolean F;
    public final org.telegram.ui.ActionBar.d6 G;
    public float H;
    public final RectF f30232a;
    public String f30233b;
    public final Paint f30234c;
    public final TextPaint d;
    public final o1.k e;
    public float f30235f;
    public final o1.k h;
    public float f30236n;
    public final o1.k f30237r;
    public float f30238s;
    public final float v;
    public final float f30239w;
    public EditText f30240x;
    public boolean f30241y;

    static {
        dw0 dw0Var = new dw0(new k2(19), new k2(20));
        dw0Var.f25661c = 100.0f;
        I = dw0Var;
        dw0 dw0Var2 = new dw0(new k2(21), new k2(22));
        dw0Var2.f25661c = 100.0f;
        J = dw0Var2;
        dw0 dw0Var3 = new dw0(new k2(23), new k2(24));
        dw0Var3.f25661c = 100.0f;
        K = dw0Var3;
    }

    public sd0(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f30232a = new RectF();
        this.f30233b = "";
        Paint paint = new Paint(1);
        this.f30234c = paint;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.e = new o1.k(this, I);
        this.h = new o1.k(this, J);
        this.f30237r = new o1.k(this, K);
        float max = Math.max(2, AndroidUtilities.dp(0.5f));
        this.v = max;
        this.f30239w = AndroidUtilities.dp(1.6667f);
        this.G = d6Var;
        setWillNotDraw(false);
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(max);
        f();
        setPadding(0, AndroidUtilities.dp(6.0f), 0, 0);
    }

    public static void d(o1.k kVar, float f7) {
        float f10 = f7 * 100.0f;
        o1.l lVar = kVar.f17561u;
        if (lVar != null && f10 == ((float) lVar.f17567i)) {
            return;
        }
        kVar.c();
        o1.l lVar2 = new o1.l(f10);
        lVar2.b(500.0f);
        lVar2.a(1.0f);
        lVar2.f17567i = f10;
        kVar.f17561u = lVar2;
        kVar.h();
    }

    private void setColor(int i10) {
        this.f30234c.setColor(i10);
        invalidate();
    }

    public final void a(float f7) {
        d(this.f30237r, f7);
    }

    public final void b(float f7, float f10, boolean z10) {
        if (!z10) {
            this.f30235f = f7;
            this.f30236n = f10;
            if (!this.f30241y) {
                float f11 = this.f30239w;
                float f12 = this.v;
                this.f30234c.setStrokeWidth(((f11 - f12) * f7) + f12);
            }
            f();
            return;
        }
        d(this.e, f7);
        d(this.h, f10);
    }

    public final void c(boolean z10, boolean z11) {
        float f7;
        float f10 = 0.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        if (z11) {
            f10 = 1.0f;
        }
        b(f7, f10, true);
    }

    public final void e(EditTextBoldCursor editTextBoldCursor) {
        this.f30240x = editTextBoldCursor;
        invalidate();
    }

    public final void f() {
        float f7;
        int i10 = org.telegram.ui.ActionBar.h6.H6;
        org.telegram.ui.ActionBar.d6 d6Var = this.G;
        int w02 = org.telegram.ui.ActionBar.h6.w0(i10, d6Var);
        int w03 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.I6, d6Var);
        float f10 = 0.0f;
        if (this.f30241y && !this.F) {
            f7 = 0.0f;
        } else {
            f7 = this.f30236n;
        }
        int f11 = i0.a.f(f7, w02, w03);
        int i11 = org.telegram.ui.ActionBar.h6.f21227q7;
        this.d.setColor(i0.a.f(this.f30238s, f11, org.telegram.ui.ActionBar.h6.w0(i11, d6Var)));
        int w04 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21116k6, d6Var);
        int w05 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21133l6, d6Var);
        if (!this.f30241y || this.F) {
            f10 = this.f30235f;
        }
        setColor(i0.a.f(this.f30238s, i0.a.f(f10, w04, w05), org.telegram.ui.ActionBar.h6.w0(i11, d6Var)));
    }

    public EditText getAttachedEditText() {
        return this.f30240x;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10;
        float f7;
        float f10;
        float f11;
        super.onDraw(canvas);
        TextPaint textPaint = this.d;
        float paddingTop = getPaddingTop() + ((textPaint.getTextSize() / 2.0f) - AndroidUtilities.dp(1.75f));
        float textSize = (textPaint.getTextSize() / 2.0f) + (getHeight() / 2.0f);
        EditText editText = this.f30240x;
        if ((editText == null || editText.length() != 0 || !TextUtils.isEmpty(this.f30240x.getHint())) && !this.f30241y && !this.E) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean z11 = z10;
        if (z11) {
            paddingTop = com.google.android.gms.internal.play_billing.k3.y(1.0f, this.f30236n, textSize - paddingTop, paddingTop);
        }
        float f12 = paddingTop;
        if (z11) {
            f7 = (1.0f - this.f30236n) * this.H;
        } else {
            f7 = 0.0f;
        }
        float f13 = f7;
        Paint paint = this.f30234c;
        float strokeWidth = paint.getStrokeWidth();
        float f14 = 0.75f;
        if (z11) {
            f14 = com.google.android.gms.internal.play_billing.k3.y(1.0f, this.f30236n, 0.25f, 0.75f);
        }
        float f15 = f14;
        float measureText = textPaint.measureText(this.f30233b) * f15;
        canvas.save();
        RectF rectF = this.f30232a;
        rectF.set(AndroidUtilities.dp(10.0f) + getPaddingLeft(), getPaddingTop(), (getWidth() - AndroidUtilities.dp(18.0f)) - getPaddingRight(), (strokeWidth * 2.0f) + getPaddingTop());
        canvas.clipRect(rectF, Region.Op.DIFFERENCE);
        rectF.set(getPaddingLeft() + strokeWidth, getPaddingTop() + strokeWidth, (getWidth() - strokeWidth) - getPaddingRight(), (getHeight() - strokeWidth) - getPaddingBottom());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
        canvas.restore();
        float dp = AndroidUtilities.dp(10.0f) + getPaddingLeft();
        float paddingTop2 = getPaddingTop() + strokeWidth;
        float width = ((getWidth() - strokeWidth) - getPaddingRight()) - AndroidUtilities.dp(6.0f);
        float f16 = (measureText / 2.0f) + dp;
        float dp2 = ((dp + measureText) + AndroidUtilities.dp(10.0f)) - f16;
        if (z11) {
            f10 = this.f30236n;
        } else {
            f10 = 1.0f;
        }
        canvas.drawLine((dp2 * f10) + f16, paddingTop2, width, paddingTop2, paint);
        float dp3 = f16 + AndroidUtilities.dp(4.0f);
        float f17 = dp - dp3;
        if (z11) {
            f11 = this.f30236n;
        } else {
            f11 = 1.0f;
        }
        canvas.drawLine(dp, paddingTop2, (f17 * f11) + dp3, paddingTop2, paint);
        canvas.save();
        canvas.scale(f15, f15, AndroidUtilities.dp(18.0f) + getPaddingLeft(), f12);
        canvas.drawText(this.f30233b, AndroidUtilities.dp(14.0f) + getPaddingLeft() + f13, f12, textPaint);
        canvas.restore();
    }

    public void setForceForceUseCenter(boolean z10) {
        this.f30241y = z10;
        this.F = z10;
        invalidate();
    }

    public void setForceUseCenter(boolean z10) {
        this.f30241y = z10;
        invalidate();
    }

    public void setForceUseCenter2(boolean z10) {
        this.E = z10;
    }

    public void setLeftPadding(float f7) {
        this.H = f7;
        invalidate();
    }

    public void setText(String str) {
        this.f30233b = str;
        invalidate();
    }
}
