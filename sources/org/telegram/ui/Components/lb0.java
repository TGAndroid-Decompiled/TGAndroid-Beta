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
import java.util.HashSet;
public class lb0 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public static final lt0 I;
    public static final lt0 J;
    public static final lt0 K;
    public boolean D;
    public boolean E;
    public boolean F;
    public final org.telegram.ui.ActionBar.f6 G;
    public float H;
    public final RectF f35590a;
    public String f35591b;
    public final Paint f35592c;
    public final TextPaint d;
    public final r1.g f35593e;
    public float f35594f;
    public final r1.g h;
    public float f35595n;
    public final r1.g f35596r;
    public float f35597s;
    public final float f35598w;
    public final float f35599x;
    public EditText f35600y;

    static {
        lt0 lt0Var = new lt0(new k2(20), new k2(21));
        lt0Var.f35743c = 100.0f;
        I = lt0Var;
        lt0 lt0Var2 = new lt0(new k2(22), new k2(23));
        lt0Var2.f35743c = 100.0f;
        J = lt0Var2;
        lt0 lt0Var3 = new lt0(new k2(24), new k2(25));
        lt0Var3.f35743c = 100.0f;
        K = lt0Var3;
    }

    public lb0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f35590a = new RectF();
        this.f35591b = "";
        Paint paint = new Paint(1);
        this.f35592c = paint;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.f35593e = new r1.g(this, I);
        this.h = new r1.g(this, J);
        this.f35596r = new r1.g(this, K);
        float max = Math.max(2, org.telegram.messenger.g0.L(0.5f));
        this.f35598w = max;
        this.f35599x = org.telegram.messenger.g0.L(1.6667f);
        this.G = f6Var;
        setWillNotDraw(false);
        textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(max);
        f();
        setPadding(0, org.telegram.messenger.g0.L(6.0f), 0, 0);
    }

    public static void d(r1.g gVar, float f10) {
        float f11 = f10 * 100.0f;
        r1.h hVar = gVar.f54175m;
        if (hVar != null && f11 == ((float) hVar.f54183i)) {
            return;
        }
        gVar.d();
        r1.h hVar2 = new r1.h(f11);
        hVar2.b(500.0f);
        hVar2.a(1.0f);
        hVar2.f54183i = f11;
        gVar.f54175m = hVar2;
        gVar.h();
    }

    private void setColor(int i7) {
        this.f35592c.setColor(i7);
        invalidate();
    }

    public final void a(float f10) {
        d(this.f35596r, f10);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28089q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27977k6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27995l6));
    }

    public final void b(float f10, float f11, boolean z9) {
        if (!z9) {
            this.f35594f = f10;
            this.f35595n = f11;
            if (!this.D) {
                float f12 = this.f35599x;
                float f13 = this.f35598w;
                this.f35592c.setStrokeWidth(((f12 - f13) * f10) + f13);
            }
            f();
            return;
        }
        d(this.f35593e, f10);
        d(this.h, f11);
    }

    public final void c(boolean z9, boolean z10) {
        float f10;
        float f11 = 0.0f;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        if (z10) {
            f11 = 1.0f;
        }
        b(f10, f11, true);
    }

    public final void e(EditTextBoldCursor editTextBoldCursor) {
        this.f35600y = editTextBoldCursor;
        invalidate();
    }

    public final void f() {
        float f10;
        int i7 = org.telegram.ui.ActionBar.k6.H6;
        org.telegram.ui.ActionBar.f6 f6Var = this.G;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i7, f6Var);
        int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.I6, f6Var);
        float f11 = 0.0f;
        if (this.D && !this.F) {
            f10 = 0.0f;
        } else {
            f10 = this.f35595n;
        }
        int f12 = i0.a.f(f10, w02, w03);
        int i10 = org.telegram.ui.ActionBar.k6.f28089q7;
        this.d.setColor(i0.a.f(this.f35597s, f12, org.telegram.ui.ActionBar.k6.w0(i10, f6Var)));
        int w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27977k6, f6Var);
        int w05 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27995l6, f6Var);
        if (!this.D || this.F) {
            f11 = this.f35594f;
        }
        setColor(i0.a.f(this.f35597s, i0.a.f(f11, w04, w05), org.telegram.ui.ActionBar.k6.w0(i10, f6Var)));
    }

    public EditText getAttachedEditText() {
        return this.f35600y;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        boolean z9;
        float f12;
        float f13;
        float f14;
        super.onDraw(canvas);
        int i7 = org.telegram.ui.ActionBar.k6.H6;
        org.telegram.ui.ActionBar.f6 f6Var = this.G;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i7, f6Var);
        int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.I6, f6Var);
        if (this.D && !this.F) {
            f10 = 0.0f;
        } else {
            f10 = this.f35595n;
        }
        int f15 = i0.a.f(f10, w02, w03);
        int i10 = org.telegram.ui.ActionBar.k6.f28089q7;
        int f16 = i0.a.f(this.f35597s, f15, org.telegram.ui.ActionBar.k6.w0(i10, f6Var));
        TextPaint textPaint = this.d;
        textPaint.setColor(f16);
        int w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27977k6, f6Var);
        int w05 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27995l6, f6Var);
        if (this.D && !this.F) {
            f11 = 0.0f;
        } else {
            f11 = this.f35594f;
        }
        int f17 = i0.a.f(this.f35597s, i0.a.f(f11, w04, w05), org.telegram.ui.ActionBar.k6.w0(i10, f6Var));
        Paint paint = this.f35592c;
        paint.setColor(f17);
        float paddingTop = getPaddingTop() + ((textPaint.getTextSize() / 2.0f) - org.telegram.messenger.g0.L(1.75f));
        float textSize = (textPaint.getTextSize() / 2.0f) + (getHeight() / 2.0f);
        EditText editText = this.f35600y;
        if ((editText == null || editText.length() != 0 || !TextUtils.isEmpty(this.f35600y.getHint())) && !this.D && !this.E) {
            z9 = false;
        } else {
            z9 = true;
        }
        boolean z10 = z9;
        if (z10) {
            paddingTop = com.google.android.recaptcha.internal.a.z(1.0f, this.f35595n, textSize - paddingTop, paddingTop);
        }
        float f18 = paddingTop;
        if (z10) {
            f12 = this.H * (1.0f - this.f35595n);
        } else {
            f12 = 0.0f;
        }
        float strokeWidth = paint.getStrokeWidth();
        float f19 = 0.75f;
        if (z10) {
            f19 = com.google.android.recaptcha.internal.a.z(1.0f, this.f35595n, 0.25f, 0.75f);
        }
        float f20 = f19;
        float measureText = textPaint.measureText(this.f35591b) * f20;
        canvas.save();
        RectF rectF = this.f35590a;
        rectF.set(org.telegram.messenger.g0.L(10.0f) + getPaddingLeft(), getPaddingTop(), (getWidth() - org.telegram.messenger.g0.L(18.0f)) - getPaddingRight(), (strokeWidth * 2.0f) + getPaddingTop());
        canvas.clipRect(rectF, Region.Op.DIFFERENCE);
        rectF.set(getPaddingLeft() + strokeWidth, getPaddingTop() + strokeWidth, (getWidth() - strokeWidth) - getPaddingRight(), (getHeight() - strokeWidth) - getPaddingBottom());
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), paint);
        canvas.restore();
        float L = org.telegram.messenger.g0.L(10.0f) + getPaddingLeft();
        float paddingTop2 = getPaddingTop() + strokeWidth;
        float width = ((getWidth() - strokeWidth) - getPaddingRight()) - org.telegram.messenger.g0.L(6.0f);
        float f21 = (measureText / 2.0f) + L;
        float L2 = ((L + measureText) + org.telegram.messenger.g0.L(10.0f)) - f21;
        if (z10) {
            f13 = this.f35595n;
        } else {
            f13 = 1.0f;
        }
        canvas.drawLine((L2 * f13) + f21, paddingTop2, width, paddingTop2, paint);
        float L3 = f21 + org.telegram.messenger.g0.L(4.0f);
        float f22 = L - L3;
        if (z10) {
            f14 = this.f35595n;
        } else {
            f14 = 1.0f;
        }
        canvas.drawLine(L, paddingTop2, (f22 * f14) + L3, paddingTop2, paint);
        canvas.save();
        canvas.scale(f20, f20, org.telegram.messenger.g0.L(18.0f) + getPaddingLeft(), f18);
        canvas.drawText(this.f35591b, org.telegram.messenger.g0.L(14.0f) + getPaddingLeft() + f12, f18, textPaint);
        canvas.restore();
    }

    public void setForceForceUseCenter(boolean z9) {
        this.D = z9;
        this.F = z9;
        invalidate();
    }

    public void setForceUseCenter(boolean z9) {
        this.D = z9;
        invalidate();
    }

    public void setForceUseCenter2(boolean z9) {
        this.E = z9;
    }

    public void setLeftPadding(float f10) {
        this.H = f10;
        invalidate();
    }

    public void setText(String str) {
        this.f35591b = str;
        invalidate();
    }

    public void updateColors() {
        try {
            f();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
