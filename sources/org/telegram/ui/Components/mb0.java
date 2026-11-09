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
public class mb0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public static final nt0 I;
    public static final nt0 J;
    public static final nt0 K;
    public boolean D;
    public boolean E;
    public boolean F;
    public final org.telegram.ui.ActionBar.g6 G;
    public float H;
    public final RectF f36047a;
    public String f36048b;
    public final Paint f36049c;
    public final TextPaint d;
    public final r1.g f36050e;
    public float f36051f;
    public final r1.g h;
    public float f36052n;
    public final r1.g f36053r;
    public float f36054s;
    public final float f36055w;
    public final float f36056x;
    public EditText f36057y;

    static {
        nt0 nt0Var = new nt0(new k2(20), new k2(21));
        nt0Var.f36500c = 100.0f;
        I = nt0Var;
        nt0 nt0Var2 = new nt0(new k2(22), new k2(23));
        nt0Var2.f36500c = 100.0f;
        J = nt0Var2;
        nt0 nt0Var3 = new nt0(new k2(24), new k2(25));
        nt0Var3.f36500c = 100.0f;
        K = nt0Var3;
    }

    public mb0(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f36047a = new RectF();
        this.f36048b = "";
        Paint paint = new Paint(1);
        this.f36049c = paint;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.f36050e = new r1.g(this, I);
        this.h = new r1.g(this, J);
        this.f36053r = new r1.g(this, K);
        float max = Math.max(2, org.telegram.messenger.g0.L(0.5f));
        this.f36055w = max;
        this.f36056x = org.telegram.messenger.g0.L(1.6667f);
        this.G = g6Var;
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
        r1.h hVar = gVar.f54280m;
        if (hVar != null && f11 == ((float) hVar.f54288i)) {
            return;
        }
        gVar.d();
        r1.h hVar2 = new r1.h(f11);
        hVar2.b(500.0f);
        hVar2.a(1.0f);
        hVar2.f54288i = f11;
        gVar.f54280m = hVar2;
        gVar.h();
    }

    private void setColor(int i7) {
        this.f36049c.setColor(i7);
        invalidate();
    }

    public final void a(float f10) {
        d(this.f36053r, f10);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28106q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27994k6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28012l6));
    }

    public final void b(float f10, float f11, boolean z9) {
        if (!z9) {
            this.f36051f = f10;
            this.f36052n = f11;
            if (!this.D) {
                float f12 = this.f36056x;
                float f13 = this.f36055w;
                this.f36049c.setStrokeWidth(((f12 - f13) * f10) + f13);
            }
            f();
            return;
        }
        d(this.f36050e, f10);
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
        this.f36057y = editTextBoldCursor;
        invalidate();
    }

    public final void f() {
        float f10;
        int i7 = org.telegram.ui.ActionBar.l6.H6;
        org.telegram.ui.ActionBar.g6 g6Var = this.G;
        int w02 = org.telegram.ui.ActionBar.l6.w0(i7, g6Var);
        int w03 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.I6, g6Var);
        float f11 = 0.0f;
        if (this.D && !this.F) {
            f10 = 0.0f;
        } else {
            f10 = this.f36052n;
        }
        int f12 = i0.a.f(f10, w02, w03);
        int i10 = org.telegram.ui.ActionBar.l6.f28106q7;
        this.d.setColor(i0.a.f(this.f36054s, f12, org.telegram.ui.ActionBar.l6.w0(i10, g6Var)));
        int w04 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27994k6, g6Var);
        int w05 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28012l6, g6Var);
        if (!this.D || this.F) {
            f11 = this.f36051f;
        }
        setColor(i0.a.f(this.f36054s, i0.a.f(f11, w04, w05), org.telegram.ui.ActionBar.l6.w0(i10, g6Var)));
    }

    public EditText getAttachedEditText() {
        return this.f36057y;
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
        int i7 = org.telegram.ui.ActionBar.l6.H6;
        org.telegram.ui.ActionBar.g6 g6Var = this.G;
        int w02 = org.telegram.ui.ActionBar.l6.w0(i7, g6Var);
        int w03 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.I6, g6Var);
        if (this.D && !this.F) {
            f10 = 0.0f;
        } else {
            f10 = this.f36052n;
        }
        int f15 = i0.a.f(f10, w02, w03);
        int i10 = org.telegram.ui.ActionBar.l6.f28106q7;
        int f16 = i0.a.f(this.f36054s, f15, org.telegram.ui.ActionBar.l6.w0(i10, g6Var));
        TextPaint textPaint = this.d;
        textPaint.setColor(f16);
        int w04 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27994k6, g6Var);
        int w05 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28012l6, g6Var);
        if (this.D && !this.F) {
            f11 = 0.0f;
        } else {
            f11 = this.f36051f;
        }
        int f17 = i0.a.f(this.f36054s, i0.a.f(f11, w04, w05), org.telegram.ui.ActionBar.l6.w0(i10, g6Var));
        Paint paint = this.f36049c;
        paint.setColor(f17);
        float paddingTop = getPaddingTop() + ((textPaint.getTextSize() / 2.0f) - org.telegram.messenger.g0.L(1.75f));
        float textSize = (textPaint.getTextSize() / 2.0f) + (getHeight() / 2.0f);
        EditText editText = this.f36057y;
        if ((editText == null || editText.length() != 0 || !TextUtils.isEmpty(this.f36057y.getHint())) && !this.D && !this.E) {
            z9 = false;
        } else {
            z9 = true;
        }
        boolean z10 = z9;
        if (z10) {
            paddingTop = com.google.android.recaptcha.internal.a.z(1.0f, this.f36052n, textSize - paddingTop, paddingTop);
        }
        float f18 = paddingTop;
        if (z10) {
            f12 = this.H * (1.0f - this.f36052n);
        } else {
            f12 = 0.0f;
        }
        float strokeWidth = paint.getStrokeWidth();
        float f19 = 0.75f;
        if (z10) {
            f19 = com.google.android.recaptcha.internal.a.z(1.0f, this.f36052n, 0.25f, 0.75f);
        }
        float f20 = f19;
        float measureText = textPaint.measureText(this.f36048b) * f20;
        canvas.save();
        RectF rectF = this.f36047a;
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
            f13 = this.f36052n;
        } else {
            f13 = 1.0f;
        }
        canvas.drawLine((L2 * f13) + f21, paddingTop2, width, paddingTop2, paint);
        float L3 = f21 + org.telegram.messenger.g0.L(4.0f);
        float f22 = L - L3;
        if (z10) {
            f14 = this.f36052n;
        } else {
            f14 = 1.0f;
        }
        canvas.drawLine(L, paddingTop2, (f22 * f14) + L3, paddingTop2, paint);
        canvas.save();
        canvas.scale(f20, f20, org.telegram.messenger.g0.L(18.0f) + getPaddingLeft(), f18);
        canvas.drawText(this.f36048b, org.telegram.messenger.g0.L(14.0f) + getPaddingLeft() + f12, f18, textPaint);
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
        this.f36048b = str;
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
