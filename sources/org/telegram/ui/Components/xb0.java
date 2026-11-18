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
public class xb0 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public static final ut0 J;
    public static final ut0 K;
    public static final ut0 L;
    public boolean E;
    public boolean F;
    public boolean G;
    public final org.telegram.ui.ActionBar.i6 H;
    public float I;
    public final RectF f41962a;
    public String f41963b;
    public final Paint f41964c;
    public final TextPaint d;
    public final r1.g f41965e;
    public float f41966f;
    public final r1.g h;
    public float f41967n;
    public final r1.g f41968r;
    public float f41969s;
    public final float f41970w;
    public final float f41971x;
    public EditText f41972y;

    static {
        ut0 ut0Var = new ut0(new k2(25), new k2(26));
        ut0Var.f40416c = 100.0f;
        J = ut0Var;
        ut0 ut0Var2 = new ut0(new k2(27), new k2(28));
        ut0Var2.f40416c = 100.0f;
        K = ut0Var2;
        ut0 ut0Var3 = new ut0(new k2(29), new wb0(0));
        ut0Var3.f40416c = 100.0f;
        L = ut0Var3;
    }

    public xb0(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f41962a = new RectF();
        this.f41963b = "";
        Paint paint = new Paint(1);
        this.f41964c = paint;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.f41965e = new r1.g(this, J);
        this.h = new r1.g(this, K);
        this.f41968r = new r1.g(this, L);
        float max = Math.max(2, org.telegram.messenger.g0.L(0.5f));
        this.f41970w = max;
        this.f41971x = org.telegram.messenger.g0.L(1.6667f);
        this.H = i6Var;
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
        r1.h hVar = gVar.f56323m;
        if (hVar != null && f11 == ((float) hVar.f56331i)) {
            return;
        }
        gVar.d();
        r1.h hVar2 = new r1.h(f11);
        hVar2.b(500.0f);
        hVar2.a(1.0f);
        hVar2.f56331i = f11;
        gVar.f56323m = hVar2;
        gVar.h();
    }

    private void setColor(int i7) {
        this.f41964c.setColor(i7);
        invalidate();
    }

    public final void a(float f10) {
        d(this.f41968r, f10);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29637q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29525k6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29543l6));
    }

    public final void b(float f10, float f11, boolean z10) {
        if (!z10) {
            this.f41966f = f10;
            this.f41967n = f11;
            if (!this.E) {
                float f12 = this.f41971x;
                float f13 = this.f41970w;
                this.f41964c.setStrokeWidth(((f12 - f13) * f10) + f13);
            }
            f();
            return;
        }
        d(this.f41965e, f10);
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
        this.f41972y = editTextBoldCursor;
        invalidate();
    }

    public final void f() {
        float f10;
        int i7 = org.telegram.ui.ActionBar.n6.H6;
        org.telegram.ui.ActionBar.i6 i6Var = this.H;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i7, i6Var);
        int w03 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.I6, i6Var);
        float f11 = 0.0f;
        if (this.E && !this.G) {
            f10 = 0.0f;
        } else {
            f10 = this.f41967n;
        }
        int f12 = i0.a.f(f10, w02, w03);
        int i10 = org.telegram.ui.ActionBar.n6.f29637q7;
        this.d.setColor(i0.a.f(this.f41969s, f12, org.telegram.ui.ActionBar.n6.w0(i10, i6Var)));
        int w04 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29525k6, i6Var);
        int w05 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29543l6, i6Var);
        if (!this.E || this.G) {
            f11 = this.f41966f;
        }
        setColor(i0.a.f(this.f41969s, i0.a.f(f11, w04, w05), org.telegram.ui.ActionBar.n6.w0(i10, i6Var)));
    }

    public EditText getAttachedEditText() {
        return this.f41972y;
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
        int i7 = org.telegram.ui.ActionBar.n6.H6;
        org.telegram.ui.ActionBar.i6 i6Var = this.H;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i7, i6Var);
        int w03 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.I6, i6Var);
        if (this.E && !this.G) {
            f10 = 0.0f;
        } else {
            f10 = this.f41967n;
        }
        int f15 = i0.a.f(f10, w02, w03);
        int i10 = org.telegram.ui.ActionBar.n6.f29637q7;
        int f16 = i0.a.f(this.f41969s, f15, org.telegram.ui.ActionBar.n6.w0(i10, i6Var));
        TextPaint textPaint = this.d;
        textPaint.setColor(f16);
        int w04 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29525k6, i6Var);
        int w05 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29543l6, i6Var);
        if (this.E && !this.G) {
            f11 = 0.0f;
        } else {
            f11 = this.f41966f;
        }
        int f17 = i0.a.f(this.f41969s, i0.a.f(f11, w04, w05), org.telegram.ui.ActionBar.n6.w0(i10, i6Var));
        Paint paint = this.f41964c;
        paint.setColor(f17);
        float paddingTop = getPaddingTop() + ((textPaint.getTextSize() / 2.0f) - org.telegram.messenger.g0.L(1.75f));
        float textSize = (textPaint.getTextSize() / 2.0f) + (getHeight() / 2.0f);
        EditText editText = this.f41972y;
        if ((editText == null || editText.length() != 0 || !TextUtils.isEmpty(this.f41972y.getHint())) && !this.E && !this.F) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean z11 = z10;
        if (z11) {
            paddingTop = com.google.android.gms.internal.vision.e2.z(1.0f, this.f41967n, textSize - paddingTop, paddingTop);
        }
        float f18 = paddingTop;
        if (z11) {
            f12 = this.I * (1.0f - this.f41967n);
        } else {
            f12 = 0.0f;
        }
        float strokeWidth = paint.getStrokeWidth();
        float f19 = 0.75f;
        if (z11) {
            f19 = com.google.android.gms.internal.vision.e2.z(1.0f, this.f41967n, 0.25f, 0.75f);
        }
        float f20 = f19;
        float measureText = textPaint.measureText(this.f41963b) * f20;
        canvas.save();
        RectF rectF = this.f41962a;
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
            f13 = this.f41967n;
        } else {
            f13 = 1.0f;
        }
        canvas.drawLine((L3 * f13) + f21, paddingTop2, width, paddingTop2, paint);
        float L4 = f21 + org.telegram.messenger.g0.L(4.0f);
        float f22 = L2 - L4;
        if (z11) {
            f14 = this.f41967n;
        } else {
            f14 = 1.0f;
        }
        canvas.drawLine(L2, paddingTop2, (f22 * f14) + L4, paddingTop2, paint);
        canvas.save();
        canvas.scale(f20, f20, org.telegram.messenger.g0.L(18.0f) + getPaddingLeft(), f18);
        canvas.drawText(this.f41963b, org.telegram.messenger.g0.L(14.0f) + getPaddingLeft() + f12, f18, textPaint);
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
        this.f41963b = str;
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
