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
public class mb0 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public static final mt0 J;
    public static final mt0 K;
    public static final mt0 L;
    public boolean E;
    public boolean F;
    public boolean G;
    public final org.telegram.ui.ActionBar.e6 H;
    public float I;
    public final RectF f37185a;
    public String f37186b;
    public final Paint f37187c;
    public final TextPaint d;
    public final r1.g f37188e;
    public float f37189f;
    public final r1.g h;
    public float f37190n;
    public final r1.g f37191r;
    public float f37192s;
    public final float f37193w;
    public final float f37194x;
    public EditText f37195y;

    static {
        mt0 mt0Var = new mt0(new e2(24), new e2(25));
        mt0Var.f37378c = 100.0f;
        J = mt0Var;
        mt0 mt0Var2 = new mt0(new e2(26), new e2(27));
        mt0Var2.f37378c = 100.0f;
        K = mt0Var2;
        mt0 mt0Var3 = new mt0(new e2(28), new e2(29));
        mt0Var3.f37378c = 100.0f;
        L = mt0Var3;
    }

    public mb0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f37185a = new RectF();
        this.f37186b = "";
        Paint paint = new Paint(1);
        this.f37187c = paint;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.f37188e = new r1.g(this, J);
        this.h = new r1.g(this, K);
        this.f37191r = new r1.g(this, L);
        float max = Math.max(2, org.telegram.messenger.g0.L(0.5f));
        this.f37193w = max;
        this.f37194x = org.telegram.messenger.g0.L(1.6667f);
        this.H = e6Var;
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
        r1.h hVar = gVar.f55748m;
        if (hVar != null && f11 == ((float) hVar.f55756i)) {
            return;
        }
        gVar.d();
        r1.h hVar2 = new r1.h(f11);
        hVar2.b(500.0f);
        hVar2.a(1.0f);
        hVar2.f55756i = f11;
        gVar.f55748m = hVar2;
        gVar.h();
    }

    private void setColor(int i7) {
        this.f37187c.setColor(i7);
        invalidate();
    }

    public final void a(float f10) {
        d(this.f37191r, f10);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29090q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28978k6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28996l6));
    }

    public final void b(float f10, float f11, boolean z10) {
        if (!z10) {
            this.f37189f = f10;
            this.f37190n = f11;
            if (!this.E) {
                float f12 = this.f37194x;
                float f13 = this.f37193w;
                this.f37187c.setStrokeWidth(((f12 - f13) * f10) + f13);
            }
            f();
            return;
        }
        d(this.f37188e, f10);
        d(this.h, f11);
    }

    public final void c(boolean z10, boolean z11) {
        float f10;
        float f11 = 0.0f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        if (z11) {
            f11 = 1.0f;
        }
        b(f10, f11, true);
    }

    public final void e(EditTextBoldCursor editTextBoldCursor) {
        this.f37195y = editTextBoldCursor;
        invalidate();
    }

    public final void f() {
        float f10;
        int i7 = org.telegram.ui.ActionBar.j6.H6;
        org.telegram.ui.ActionBar.e6 e6Var = this.H;
        int w02 = org.telegram.ui.ActionBar.j6.w0(i7, e6Var);
        int w03 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.I6, e6Var);
        float f11 = 0.0f;
        if (this.E && !this.G) {
            f10 = 0.0f;
        } else {
            f10 = this.f37190n;
        }
        int f12 = i0.a.f(f10, w02, w03);
        int i10 = org.telegram.ui.ActionBar.j6.f29090q7;
        this.d.setColor(i0.a.f(this.f37192s, f12, org.telegram.ui.ActionBar.j6.w0(i10, e6Var)));
        int w04 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28978k6, e6Var);
        int w05 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28996l6, e6Var);
        if (!this.E || this.G) {
            f11 = this.f37189f;
        }
        setColor(i0.a.f(this.f37192s, i0.a.f(f11, w04, w05), org.telegram.ui.ActionBar.j6.w0(i10, e6Var)));
    }

    public EditText getAttachedEditText() {
        return this.f37195y;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        boolean z10;
        float f12;
        float f13;
        float f14;
        super.onDraw(canvas);
        int i7 = org.telegram.ui.ActionBar.j6.H6;
        org.telegram.ui.ActionBar.e6 e6Var = this.H;
        int w02 = org.telegram.ui.ActionBar.j6.w0(i7, e6Var);
        int w03 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.I6, e6Var);
        if (this.E && !this.G) {
            f10 = 0.0f;
        } else {
            f10 = this.f37190n;
        }
        int f15 = i0.a.f(f10, w02, w03);
        int i10 = org.telegram.ui.ActionBar.j6.f29090q7;
        int f16 = i0.a.f(this.f37192s, f15, org.telegram.ui.ActionBar.j6.w0(i10, e6Var));
        TextPaint textPaint = this.d;
        textPaint.setColor(f16);
        int w04 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28978k6, e6Var);
        int w05 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28996l6, e6Var);
        if (this.E && !this.G) {
            f11 = 0.0f;
        } else {
            f11 = this.f37189f;
        }
        int f17 = i0.a.f(this.f37192s, i0.a.f(f11, w04, w05), org.telegram.ui.ActionBar.j6.w0(i10, e6Var));
        Paint paint = this.f37187c;
        paint.setColor(f17);
        float paddingTop = getPaddingTop() + ((textPaint.getTextSize() / 2.0f) - org.telegram.messenger.g0.L(1.75f));
        float textSize = (textPaint.getTextSize() / 2.0f) + (getHeight() / 2.0f);
        EditText editText = this.f37195y;
        if ((editText == null || editText.length() != 0 || !TextUtils.isEmpty(this.f37195y.getHint())) && !this.E && !this.F) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean z11 = z10;
        if (z11) {
            paddingTop = com.google.android.gms.internal.vision.e2.z(1.0f, this.f37190n, textSize - paddingTop, paddingTop);
        }
        float f18 = paddingTop;
        if (z11) {
            f12 = this.I * (1.0f - this.f37190n);
        } else {
            f12 = 0.0f;
        }
        float strokeWidth = paint.getStrokeWidth();
        float f19 = 0.75f;
        if (z11) {
            f19 = com.google.android.gms.internal.vision.e2.z(1.0f, this.f37190n, 0.25f, 0.75f);
        }
        float f20 = f19;
        float measureText = textPaint.measureText(this.f37186b) * f20;
        canvas.save();
        RectF rectF = this.f37185a;
        rectF.set(org.telegram.messenger.g0.L(10.0f) + getPaddingLeft(), getPaddingTop(), (getWidth() - org.telegram.messenger.g0.L(18.0f)) - getPaddingRight(), (strokeWidth * 2.0f) + getPaddingTop());
        canvas.clipRect(rectF, Region.Op.DIFFERENCE);
        rectF.set(getPaddingLeft() + strokeWidth, getPaddingTop() + strokeWidth, (getWidth() - strokeWidth) - getPaddingRight(), (getHeight() - strokeWidth) - getPaddingBottom());
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), paint);
        canvas.restore();
        float L2 = org.telegram.messenger.g0.L(10.0f) + getPaddingLeft();
        float paddingTop2 = getPaddingTop() + strokeWidth;
        float width = ((getWidth() - strokeWidth) - getPaddingRight()) - org.telegram.messenger.g0.L(6.0f);
        float f21 = (measureText / 2.0f) + L2;
        float L3 = ((L2 + measureText) + org.telegram.messenger.g0.L(10.0f)) - f21;
        if (z11) {
            f13 = this.f37190n;
        } else {
            f13 = 1.0f;
        }
        canvas.drawLine((L3 * f13) + f21, paddingTop2, width, paddingTop2, paint);
        float L4 = f21 + org.telegram.messenger.g0.L(4.0f);
        float f22 = L2 - L4;
        if (z11) {
            f14 = this.f37190n;
        } else {
            f14 = 1.0f;
        }
        canvas.drawLine(L2, paddingTop2, (f22 * f14) + L4, paddingTop2, paint);
        canvas.save();
        canvas.scale(f20, f20, org.telegram.messenger.g0.L(18.0f) + getPaddingLeft(), f18);
        canvas.drawText(this.f37186b, org.telegram.messenger.g0.L(14.0f) + getPaddingLeft() + f12, f18, textPaint);
        canvas.restore();
    }

    public void setForceForceUseCenter(boolean z10) {
        this.E = z10;
        this.G = z10;
        invalidate();
    }

    public void setForceUseCenter(boolean z10) {
        this.E = z10;
        invalidate();
    }

    public void setForceUseCenter2(boolean z10) {
        this.F = z10;
    }

    public void setLeftPadding(float f10) {
        this.I = f10;
        invalidate();
    }

    public void setText(String str) {
        this.f37186b = str;
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
