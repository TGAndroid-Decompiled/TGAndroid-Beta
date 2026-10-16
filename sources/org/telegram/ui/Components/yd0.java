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
public class yd0 extends FrameLayout {
    public static final hw0 I;
    public static final hw0 J;
    public static final hw0 K;
    public boolean E;
    public boolean F;
    public final org.telegram.ui.ActionBar.c6 G;
    public float H;
    public final RectF f31223a;
    public String f31224b;
    public final Paint f31225c;
    public final TextPaint d;
    public final o1.k e;
    public float f31226f;
    public final o1.k h;
    public float f31227n;
    public final o1.k f31228r;
    public float f31229s;
    public final float v;
    public final float f31230w;
    public EditText f31231x;
    public boolean f31232y;

    static {
        hw0 hw0Var = new hw0(new n2(17), new n2(18));
        hw0Var.f25423c = 100.0f;
        I = hw0Var;
        hw0 hw0Var2 = new hw0(new n2(19), new n2(20));
        hw0Var2.f25423c = 100.0f;
        J = hw0Var2;
        hw0 hw0Var3 = new hw0(new n2(21), new n2(22));
        hw0Var3.f25423c = 100.0f;
        K = hw0Var3;
    }

    public yd0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f31223a = new RectF();
        this.f31224b = "";
        Paint paint = new Paint(1);
        this.f31225c = paint;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.e = new o1.k(this, I);
        this.h = new o1.k(this, J);
        this.f31228r = new o1.k(this, K);
        float max = Math.max(2, AndroidUtilities.dp(0.5f));
        this.v = max;
        this.f31230w = AndroidUtilities.dp(1.6667f);
        this.G = c6Var;
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
        o1.l lVar = kVar.f16161u;
        if (lVar != null && f10 == ((float) lVar.f16167i)) {
            return;
        }
        kVar.c();
        o1.l lVar2 = new o1.l(f10);
        lVar2.b(500.0f);
        lVar2.a(1.0f);
        lVar2.f16167i = f10;
        kVar.f16161u = lVar2;
        kVar.h();
    }

    private void setColor(int i10) {
        this.f31225c.setColor(i10);
        invalidate();
    }

    public final void a(float f7) {
        d(this.f31228r, f7);
    }

    public final void b(float f7, float f10, boolean z10) {
        if (!z10) {
            this.f31226f = f7;
            this.f31227n = f10;
            if (!this.f31232y) {
                float f11 = this.f31230w;
                float f12 = this.v;
                this.f31225c.setStrokeWidth(((f11 - f12) * f7) + f12);
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
        this.f31231x = editTextBoldCursor;
        invalidate();
    }

    public final void f() {
        float f7;
        int i10 = org.telegram.ui.ActionBar.g6.H6;
        org.telegram.ui.ActionBar.c6 c6Var = this.G;
        int w02 = org.telegram.ui.ActionBar.g6.w0(i10, c6Var);
        int w03 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.I6, c6Var);
        float f10 = 0.0f;
        if (this.f31232y && !this.F) {
            f7 = 0.0f;
        } else {
            f7 = this.f31227n;
        }
        int d = i0.a.d(f7, w02, w03);
        int i11 = org.telegram.ui.ActionBar.g6.f19839q7;
        this.d.setColor(i0.a.d(this.f31229s, d, org.telegram.ui.ActionBar.g6.w0(i11, c6Var)));
        int w04 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19728k6, c6Var);
        int w05 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19745l6, c6Var);
        if (!this.f31232y || this.F) {
            f10 = this.f31226f;
        }
        setColor(i0.a.d(this.f31229s, i0.a.d(f10, w04, w05), org.telegram.ui.ActionBar.g6.w0(i11, c6Var)));
    }

    public EditText getAttachedEditText() {
        return this.f31231x;
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
        EditText editText = this.f31231x;
        if ((editText == null || editText.length() != 0 || !TextUtils.isEmpty(this.f31231x.getHint())) && !this.f31232y && !this.E) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean z11 = z10;
        if (z11) {
            paddingTop = com.google.android.gms.internal.play_billing.k3.y(1.0f, this.f31227n, textSize - paddingTop, paddingTop);
        }
        float f12 = paddingTop;
        if (z11) {
            f7 = (1.0f - this.f31227n) * this.H;
        } else {
            f7 = 0.0f;
        }
        float f13 = f7;
        Paint paint = this.f31225c;
        float strokeWidth = paint.getStrokeWidth();
        float f14 = 0.75f;
        if (z11) {
            f14 = com.google.android.gms.internal.play_billing.k3.y(1.0f, this.f31227n, 0.25f, 0.75f);
        }
        float f15 = f14;
        float measureText = textPaint.measureText(this.f31224b) * f15;
        canvas.save();
        RectF rectF = this.f31223a;
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
            f10 = this.f31227n;
        } else {
            f10 = 1.0f;
        }
        canvas.drawLine((dp2 * f10) + f16, paddingTop2, width, paddingTop2, paint);
        float dp3 = f16 + AndroidUtilities.dp(4.0f);
        float f17 = dp - dp3;
        if (z11) {
            f11 = this.f31227n;
        } else {
            f11 = 1.0f;
        }
        canvas.drawLine(dp, paddingTop2, (f17 * f11) + dp3, paddingTop2, paint);
        canvas.save();
        canvas.scale(f15, f15, AndroidUtilities.dp(18.0f) + getPaddingLeft(), f12);
        canvas.drawText(this.f31224b, AndroidUtilities.dp(14.0f) + getPaddingLeft() + f13, f12, textPaint);
        canvas.restore();
    }

    public void setForceForceUseCenter(boolean z10) {
        this.f31232y = z10;
        this.F = z10;
        invalidate();
    }

    public void setForceUseCenter(boolean z10) {
        this.f31232y = z10;
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
        this.f31224b = str;
        invalidate();
    }
}
