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
public class yb0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public static final xt0 J;
    public static final xt0 K;
    public static final xt0 L;
    public boolean E;
    public boolean F;
    public boolean G;
    public final org.telegram.ui.ActionBar.h6 H;
    public float I;
    public final RectF f42375a;
    public String f42376b;
    public final Paint f42377c;
    public final TextPaint d;
    public final r1.g f42378e;
    public float f42379f;
    public final r1.g h;
    public float f42380n;
    public final r1.g f42381r;
    public float f42382s;
    public final float f42383w;
    public final float f42384x;
    public EditText f42385y;

    static {
        xt0 xt0Var = new xt0(new l2(25), new l2(26));
        xt0Var.f42217c = 100.0f;
        J = xt0Var;
        xt0 xt0Var2 = new xt0(new l2(27), new l2(28));
        xt0Var2.f42217c = 100.0f;
        K = xt0Var2;
        xt0 xt0Var3 = new xt0(new l2(29), new xb0(0));
        xt0Var3.f42217c = 100.0f;
        L = xt0Var3;
    }

    public yb0(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f42375a = new RectF();
        this.f42376b = "";
        Paint paint = new Paint(1);
        this.f42377c = paint;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.f42378e = new r1.g(this, J);
        this.h = new r1.g(this, K);
        this.f42381r = new r1.g(this, L);
        float max = Math.max(2, org.telegram.messenger.g0.L(0.5f));
        this.f42383w = max;
        this.f42384x = org.telegram.messenger.g0.L(1.6667f);
        this.H = h6Var;
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
        r1.h hVar = gVar.f56368m;
        if (hVar != null && f11 == ((float) hVar.f56376i)) {
            return;
        }
        gVar.d();
        r1.h hVar2 = new r1.h(f11);
        hVar2.b(500.0f);
        hVar2.a(1.0f);
        hVar2.f56376i = f11;
        gVar.f56368m = hVar2;
        gVar.h();
    }

    private void setColor(int i7) {
        this.f42377c.setColor(i7);
        invalidate();
    }

    public final void a(float f10) {
        d(this.f42381r, f10);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29622q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29510k6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29528l6));
    }

    public final void b(float f10, float f11, boolean z10) {
        if (!z10) {
            this.f42379f = f10;
            this.f42380n = f11;
            if (!this.E) {
                float f12 = this.f42384x;
                float f13 = this.f42383w;
                this.f42377c.setStrokeWidth(((f12 - f13) * f10) + f13);
            }
            f();
            return;
        }
        d(this.f42378e, f10);
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
        this.f42385y = editTextBoldCursor;
        invalidate();
    }

    public final void f() {
        float f10;
        int i7 = org.telegram.ui.ActionBar.m6.H6;
        org.telegram.ui.ActionBar.h6 h6Var = this.H;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
        int w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.I6, h6Var);
        float f11 = 0.0f;
        if (this.E && !this.G) {
            f10 = 0.0f;
        } else {
            f10 = this.f42380n;
        }
        int f12 = i0.a.f(f10, w02, w03);
        int i10 = org.telegram.ui.ActionBar.m6.f29622q7;
        this.d.setColor(i0.a.f(this.f42382s, f12, org.telegram.ui.ActionBar.m6.w0(i10, h6Var)));
        int w04 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29510k6, h6Var);
        int w05 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29528l6, h6Var);
        if (!this.E || this.G) {
            f11 = this.f42379f;
        }
        setColor(i0.a.f(this.f42382s, i0.a.f(f11, w04, w05), org.telegram.ui.ActionBar.m6.w0(i10, h6Var)));
    }

    public EditText getAttachedEditText() {
        return this.f42385y;
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
        int i7 = org.telegram.ui.ActionBar.m6.H6;
        org.telegram.ui.ActionBar.h6 h6Var = this.H;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
        int w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.I6, h6Var);
        if (this.E && !this.G) {
            f10 = 0.0f;
        } else {
            f10 = this.f42380n;
        }
        int f15 = i0.a.f(f10, w02, w03);
        int i10 = org.telegram.ui.ActionBar.m6.f29622q7;
        int f16 = i0.a.f(this.f42382s, f15, org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
        TextPaint textPaint = this.d;
        textPaint.setColor(f16);
        int w04 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29510k6, h6Var);
        int w05 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29528l6, h6Var);
        if (this.E && !this.G) {
            f11 = 0.0f;
        } else {
            f11 = this.f42379f;
        }
        int f17 = i0.a.f(this.f42382s, i0.a.f(f11, w04, w05), org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
        Paint paint = this.f42377c;
        paint.setColor(f17);
        float paddingTop = getPaddingTop() + ((textPaint.getTextSize() / 2.0f) - org.telegram.messenger.g0.L(1.75f));
        float textSize = (textPaint.getTextSize() / 2.0f) + (getHeight() / 2.0f);
        EditText editText = this.f42385y;
        if ((editText == null || editText.length() != 0 || !TextUtils.isEmpty(this.f42385y.getHint())) && !this.E && !this.F) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean z11 = z10;
        if (z11) {
            paddingTop = com.google.android.gms.internal.vision.e2.z(1.0f, this.f42380n, textSize - paddingTop, paddingTop);
        }
        float f18 = paddingTop;
        if (z11) {
            f12 = this.I * (1.0f - this.f42380n);
        } else {
            f12 = 0.0f;
        }
        float strokeWidth = paint.getStrokeWidth();
        float f19 = 0.75f;
        if (z11) {
            f19 = com.google.android.gms.internal.vision.e2.z(1.0f, this.f42380n, 0.25f, 0.75f);
        }
        float f20 = f19;
        float measureText = textPaint.measureText(this.f42376b) * f20;
        canvas.save();
        RectF rectF = this.f42375a;
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
            f13 = this.f42380n;
        } else {
            f13 = 1.0f;
        }
        canvas.drawLine((L3 * f13) + f21, paddingTop2, width, paddingTop2, paint);
        float L4 = f21 + org.telegram.messenger.g0.L(4.0f);
        float f22 = L2 - L4;
        if (z11) {
            f14 = this.f42380n;
        } else {
            f14 = 1.0f;
        }
        canvas.drawLine(L2, paddingTop2, (f22 * f14) + L4, paddingTop2, paint);
        canvas.save();
        canvas.scale(f20, f20, org.telegram.messenger.g0.L(18.0f) + getPaddingLeft(), f18);
        canvas.drawText(this.f42376b, org.telegram.messenger.g0.L(14.0f) + getPaddingLeft() + f12, f18, textPaint);
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
        this.f42376b = str;
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
