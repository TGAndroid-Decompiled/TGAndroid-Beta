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
public class jd0 extends FrameLayout {
    public static final tv0 I;
    public static final tv0 J;
    public static final tv0 K;
    public boolean E;
    public boolean F;
    public final org.telegram.ui.ActionBar.d6 G;
    public float H;
    public final RectF f25395a;
    public String f25396b;
    public final Paint f25397c;
    public final TextPaint d;
    public final o1.k e;
    public float f25398f;
    public final o1.k h;
    public float f25399n;
    public final o1.k f25400r;
    public float f25401s;
    public final float v;
    public final float f25402w;
    public EditText f25403x;
    public boolean f25404y;

    static {
        tv0 tv0Var = new tv0(new fa0(2), new fa0(3));
        tv0Var.f28635c = 100.0f;
        I = tv0Var;
        tv0 tv0Var2 = new tv0(new fa0(4), new fa0(5));
        tv0Var2.f28635c = 100.0f;
        J = tv0Var2;
        tv0 tv0Var3 = new tv0(new fa0(6), new fa0(7));
        tv0Var3.f28635c = 100.0f;
        K = tv0Var3;
    }

    public jd0(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f25395a = new RectF();
        this.f25396b = "";
        Paint paint = new Paint(1);
        this.f25397c = paint;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.e = new o1.k(this, I);
        this.h = new o1.k(this, J);
        this.f25400r = new o1.k(this, K);
        float max = Math.max(2, AndroidUtilities.dp(0.5f));
        this.v = max;
        this.f25402w = AndroidUtilities.dp(1.6667f);
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
        o1.l lVar = kVar.f15533u;
        if (lVar != null && f10 == ((float) lVar.f15539i)) {
            return;
        }
        kVar.c();
        o1.l lVar2 = new o1.l(f10);
        lVar2.b(500.0f);
        lVar2.a(1.0f);
        lVar2.f15539i = f10;
        kVar.f15533u = lVar2;
        kVar.f();
    }

    private void setColor(int i10) {
        this.f25397c.setColor(i10);
        invalidate();
    }

    public final void a(float f7) {
        d(this.f25400r, f7);
    }

    public final void b(float f7, float f10, boolean z10) {
        if (!z10) {
            this.f25398f = f7;
            this.f25399n = f10;
            if (!this.f25404y) {
                float f11 = this.f25402w;
                float f12 = this.v;
                this.f25397c.setStrokeWidth(((f11 - f12) * f7) + f12);
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
        this.f25403x = editTextBoldCursor;
        invalidate();
    }

    public final void f() {
        float f7;
        int i10 = org.telegram.ui.ActionBar.h6.H6;
        org.telegram.ui.ActionBar.d6 d6Var = this.G;
        int v02 = org.telegram.ui.ActionBar.h6.v0(i10, d6Var);
        int v03 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.I6, d6Var);
        float f10 = 0.0f;
        if (this.f25404y && !this.F) {
            f7 = 0.0f;
        } else {
            f7 = this.f25399n;
        }
        int d = i0.a.d(f7, v02, v03);
        int i11 = org.telegram.ui.ActionBar.h6.f19299q7;
        this.d.setColor(i0.a.d(this.f25401s, d, org.telegram.ui.ActionBar.h6.v0(i11, d6Var)));
        int v04 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19187k6, d6Var);
        int v05 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19205l6, d6Var);
        if (!this.f25404y || this.F) {
            f10 = this.f25398f;
        }
        setColor(i0.a.d(this.f25401s, i0.a.d(f10, v04, v05), org.telegram.ui.ActionBar.h6.v0(i11, d6Var)));
    }

    public EditText getAttachedEditText() {
        return this.f25403x;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10;
        float f7;
        float f10;
        float f11;
        float f12;
        super.onDraw(canvas);
        TextPaint textPaint = this.d;
        float paddingTop = getPaddingTop() + ((textPaint.getTextSize() / 2.0f) - AndroidUtilities.dp(1.75f));
        float textSize = (textPaint.getTextSize() / 2.0f) + (getHeight() / 2.0f);
        EditText editText = this.f25403x;
        if ((editText == null || editText.length() != 0 || !TextUtils.isEmpty(this.f25403x.getHint())) && !this.f25404y && !this.E) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            paddingTop = com.google.android.gms.internal.vision.e2.z(1.0f, this.f25399n, textSize - paddingTop, paddingTop);
        }
        float f13 = paddingTop;
        if (z10) {
            f7 = (1.0f - this.f25399n) * this.H;
        } else {
            f7 = 0.0f;
        }
        Paint paint = this.f25397c;
        float strokeWidth = paint.getStrokeWidth();
        if (z10) {
            f10 = com.google.android.gms.internal.vision.e2.z(1.0f, this.f25399n, 0.25f, 0.75f);
        } else {
            f10 = 0.75f;
        }
        float measureText = textPaint.measureText(this.f25396b) * f10;
        canvas.save();
        RectF rectF = this.f25395a;
        rectF.set(AndroidUtilities.dp(10.0f) + getPaddingLeft(), getPaddingTop(), (getWidth() - AndroidUtilities.dp(18.0f)) - getPaddingRight(), (strokeWidth * 2.0f) + getPaddingTop());
        canvas.clipRect(rectF, Region.Op.DIFFERENCE);
        rectF.set(getPaddingLeft() + strokeWidth, getPaddingTop() + strokeWidth, (getWidth() - strokeWidth) - getPaddingRight(), (getHeight() - strokeWidth) - getPaddingBottom());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
        canvas.restore();
        float dp = AndroidUtilities.dp(10.0f) + getPaddingLeft();
        float paddingTop2 = getPaddingTop() + strokeWidth;
        float width = ((getWidth() - strokeWidth) - getPaddingRight()) - AndroidUtilities.dp(6.0f);
        float f14 = (measureText / 2.0f) + dp;
        float dp2 = ((dp + measureText) + AndroidUtilities.dp(10.0f)) - f14;
        if (z10) {
            f11 = this.f25399n;
        } else {
            f11 = 1.0f;
        }
        canvas.drawLine((dp2 * f11) + f14, paddingTop2, width, paddingTop2, paint);
        float dp3 = f14 + AndroidUtilities.dp(4.0f);
        float f15 = dp - dp3;
        if (z10) {
            f12 = this.f25399n;
        } else {
            f12 = 1.0f;
        }
        canvas.drawLine(dp, paddingTop2, (f15 * f12) + dp3, paddingTop2, paint);
        canvas.save();
        canvas.scale(f10, f10, AndroidUtilities.dp(18.0f) + getPaddingLeft(), f13);
        canvas.drawText(this.f25396b, AndroidUtilities.dp(14.0f) + getPaddingLeft() + f7, f13, textPaint);
        canvas.restore();
    }

    public void setForceForceUseCenter(boolean z10) {
        this.f25404y = z10;
        this.F = z10;
        invalidate();
    }

    public void setForceUseCenter(boolean z10) {
        this.f25404y = z10;
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
        this.f25396b = str;
        invalidate();
    }
}
