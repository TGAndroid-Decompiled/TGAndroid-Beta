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
public class vb0 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public static final wt0 J;
    public static final wt0 K;
    public static final wt0 L;
    public boolean E;
    public boolean F;
    public boolean G;
    public final org.telegram.ui.ActionBar.i6 H;
    public float I;
    public final RectF f40622a;
    public String f40623b;
    public final Paint f40624c;
    public final TextPaint d;
    public final r1.g f40625e;
    public float f40626f;
    public final r1.g h;
    public float f40627n;
    public final r1.g f40628r;
    public float f40629s;
    public final float f40630w;
    public final float f40631x;
    public EditText f40632y;

    static {
        wt0 wt0Var = new wt0(new k2(25), new k2(26));
        wt0Var.f41732c = 100.0f;
        J = wt0Var;
        wt0 wt0Var2 = new wt0(new k2(27), new k2(28));
        wt0Var2.f41732c = 100.0f;
        K = wt0Var2;
        wt0 wt0Var3 = new wt0(new k2(29), new ub0(0));
        wt0Var3.f41732c = 100.0f;
        L = wt0Var3;
    }

    public vb0(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f40622a = new RectF();
        this.f40623b = "";
        Paint paint = new Paint(1);
        this.f40624c = paint;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.f40625e = new r1.g(this, J);
        this.h = new r1.g(this, K);
        this.f40628r = new r1.g(this, L);
        float max = Math.max(2, org.telegram.messenger.g0.L(0.5f));
        this.f40630w = max;
        this.f40631x = org.telegram.messenger.g0.L(1.6667f);
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
        r1.h hVar = gVar.f56446m;
        if (hVar != null && f11 == ((float) hVar.f56454i)) {
            return;
        }
        gVar.d();
        r1.h hVar2 = new r1.h(f11);
        hVar2.b(500.0f);
        hVar2.a(1.0f);
        hVar2.f56454i = f11;
        gVar.f56446m = hVar2;
        gVar.h();
    }

    private void setColor(int i7) {
        this.f40624c.setColor(i7);
        invalidate();
    }

    public final void a(float f10) {
        d(this.f40628r, f10);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29692q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29580k6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29598l6));
    }

    public final void b(float f10, float f11, boolean z10) {
        if (!z10) {
            this.f40626f = f10;
            this.f40627n = f11;
            if (!this.E) {
                float f12 = this.f40631x;
                float f13 = this.f40630w;
                this.f40624c.setStrokeWidth(((f12 - f13) * f10) + f13);
            }
            f();
            return;
        }
        d(this.f40625e, f10);
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
        this.f40632y = editTextBoldCursor;
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
            f10 = this.f40627n;
        }
        int f12 = i0.a.f(f10, w02, w03);
        int i10 = org.telegram.ui.ActionBar.n6.f29692q7;
        this.d.setColor(i0.a.f(this.f40629s, f12, org.telegram.ui.ActionBar.n6.w0(i10, i6Var)));
        int w04 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29580k6, i6Var);
        int w05 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29598l6, i6Var);
        if (!this.E || this.G) {
            f11 = this.f40626f;
        }
        setColor(i0.a.f(this.f40629s, i0.a.f(f11, w04, w05), org.telegram.ui.ActionBar.n6.w0(i10, i6Var)));
    }

    public EditText getAttachedEditText() {
        return this.f40632y;
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
            f10 = this.f40627n;
        }
        int f15 = i0.a.f(f10, w02, w03);
        int i10 = org.telegram.ui.ActionBar.n6.f29692q7;
        int f16 = i0.a.f(this.f40629s, f15, org.telegram.ui.ActionBar.n6.w0(i10, i6Var));
        TextPaint textPaint = this.d;
        textPaint.setColor(f16);
        int w04 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29580k6, i6Var);
        int w05 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29598l6, i6Var);
        if (this.E && !this.G) {
            f11 = 0.0f;
        } else {
            f11 = this.f40626f;
        }
        int f17 = i0.a.f(this.f40629s, i0.a.f(f11, w04, w05), org.telegram.ui.ActionBar.n6.w0(i10, i6Var));
        Paint paint = this.f40624c;
        paint.setColor(f17);
        float paddingTop = getPaddingTop() + ((textPaint.getTextSize() / 2.0f) - org.telegram.messenger.g0.L(1.75f));
        float textSize = (textPaint.getTextSize() / 2.0f) + (getHeight() / 2.0f);
        EditText editText = this.f40632y;
        if ((editText == null || editText.length() != 0 || !TextUtils.isEmpty(this.f40632y.getHint())) && !this.E && !this.F) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean z11 = z10;
        if (z11) {
            paddingTop = com.google.android.gms.internal.vision.e2.z(1.0f, this.f40627n, textSize - paddingTop, paddingTop);
        }
        float f18 = paddingTop;
        if (z11) {
            f12 = this.I * (1.0f - this.f40627n);
        } else {
            f12 = 0.0f;
        }
        float strokeWidth = paint.getStrokeWidth();
        float f19 = 0.75f;
        if (z11) {
            f19 = com.google.android.gms.internal.vision.e2.z(1.0f, this.f40627n, 0.25f, 0.75f);
        }
        float f20 = f19;
        float measureText = textPaint.measureText(this.f40623b) * f20;
        canvas.save();
        RectF rectF = this.f40622a;
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
            f13 = this.f40627n;
        } else {
            f13 = 1.0f;
        }
        canvas.drawLine((L3 * f13) + f21, paddingTop2, width, paddingTop2, paint);
        float L4 = f21 + org.telegram.messenger.g0.L(4.0f);
        float f22 = L2 - L4;
        if (z11) {
            f14 = this.f40627n;
        } else {
            f14 = 1.0f;
        }
        canvas.drawLine(L2, paddingTop2, (f22 * f14) + L4, paddingTop2, paint);
        canvas.save();
        canvas.scale(f20, f20, org.telegram.messenger.g0.L(18.0f) + getPaddingLeft(), f18);
        canvas.drawText(this.f40623b, org.telegram.messenger.g0.L(14.0f) + getPaddingLeft() + f12, f18, textPaint);
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
        this.f40623b = str;
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
