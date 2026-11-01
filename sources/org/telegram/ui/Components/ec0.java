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
public class ec0 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public static final pu0 I;
    public static final pu0 J;
    public static final pu0 K;
    public boolean D;
    public boolean E;
    public boolean F;
    public final org.telegram.ui.ActionBar.p6 G;
    public float H;
    public final RectF f25783a;
    public String f25784b;
    public final Paint f25785c;
    public final TextPaint d;
    public final o1.j e;
    public float f25786f;
    public final o1.j h;
    public float f25787n;
    public final o1.j f25788r;
    public float f25789s;
    public final float f25790w;
    public final float f25791x;
    public EditText f25792y;

    static {
        pu0 pu0Var = new pu0(new au(3), new au(4));
        pu0Var.f29554c = 100.0f;
        I = pu0Var;
        pu0 pu0Var2 = new pu0(new au(5), new au(6));
        pu0Var2.f29554c = 100.0f;
        J = pu0Var2;
        pu0 pu0Var3 = new pu0(new au(7), new au(8));
        pu0Var3.f29554c = 100.0f;
        K = pu0Var3;
    }

    public ec0(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f25783a = new RectF();
        this.f25784b = "";
        Paint paint = new Paint(1);
        this.f25785c = paint;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.e = new o1.j(this, I);
        this.h = new o1.j(this, J);
        this.f25788r = new o1.j(this, K);
        float max = Math.max(2, org.telegram.messenger.i0.L(0.5f));
        this.f25790w = max;
        this.f25791x = org.telegram.messenger.i0.L(1.6667f);
        this.G = p6Var;
        setWillNotDraw(false);
        textPaint.setTextSize(org.telegram.messenger.i0.L(16.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(max);
        f();
        setPadding(0, org.telegram.messenger.i0.L(6.0f), 0, 0);
    }

    public static void d(o1.j jVar, float f7) {
        float f10 = f7 * 100.0f;
        o1.k kVar = jVar.f13958m;
        if (kVar != null && f10 == ((float) kVar.f13965i)) {
            return;
        }
        jVar.d();
        o1.k kVar2 = new o1.k(f10);
        kVar2.b(500.0f);
        kVar2.a(1.0f);
        kVar2.f13965i = f10;
        jVar.f13958m = kVar2;
        jVar.h();
    }

    private void setColor(int i10) {
        this.f25785c.setColor(i10);
        invalidate();
    }

    public final void a(float f7) {
        d(this.f25788r, f7);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21171q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21059k6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21077l6));
    }

    public final void b(float f7, float f10, boolean z10) {
        if (!z10) {
            this.f25786f = f7;
            this.f25787n = f10;
            if (!this.D) {
                float f11 = this.f25791x;
                float f12 = this.f25790w;
                this.f25785c.setStrokeWidth(((f11 - f12) * f7) + f12);
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
        this.f25792y = editTextBoldCursor;
        invalidate();
    }

    public final void f() {
        float f7;
        int i10 = org.telegram.ui.ActionBar.t6.H6;
        org.telegram.ui.ActionBar.p6 p6Var = this.G;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
        int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.I6, p6Var);
        float f10 = 0.0f;
        if (this.D && !this.F) {
            f7 = 0.0f;
        } else {
            f7 = this.f25787n;
        }
        int f11 = i0.b.f(f7, w02, w03);
        int i11 = org.telegram.ui.ActionBar.t6.f21171q7;
        this.d.setColor(i0.b.f(this.f25789s, f11, org.telegram.ui.ActionBar.t6.w0(i11, p6Var)));
        int w04 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21059k6, p6Var);
        int w05 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21077l6, p6Var);
        if (!this.D || this.F) {
            f10 = this.f25786f;
        }
        setColor(i0.b.f(this.f25789s, i0.b.f(f10, w04, w05), org.telegram.ui.ActionBar.t6.w0(i11, p6Var)));
    }

    public EditText getAttachedEditText() {
        return this.f25792y;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        float f10;
        boolean z10;
        float f11;
        float f12;
        float f13;
        super.onDraw(canvas);
        int i10 = org.telegram.ui.ActionBar.t6.H6;
        org.telegram.ui.ActionBar.p6 p6Var = this.G;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
        int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.I6, p6Var);
        if (this.D && !this.F) {
            f7 = 0.0f;
        } else {
            f7 = this.f25787n;
        }
        int f14 = i0.b.f(f7, w02, w03);
        int i11 = org.telegram.ui.ActionBar.t6.f21171q7;
        int f15 = i0.b.f(this.f25789s, f14, org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
        TextPaint textPaint = this.d;
        textPaint.setColor(f15);
        int w04 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21059k6, p6Var);
        int w05 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21077l6, p6Var);
        if (this.D && !this.F) {
            f10 = 0.0f;
        } else {
            f10 = this.f25786f;
        }
        int f16 = i0.b.f(this.f25789s, i0.b.f(f10, w04, w05), org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
        Paint paint = this.f25785c;
        paint.setColor(f16);
        float paddingTop = getPaddingTop() + ((textPaint.getTextSize() / 2.0f) - org.telegram.messenger.i0.L(1.75f));
        float textSize = (textPaint.getTextSize() / 2.0f) + (getHeight() / 2.0f);
        EditText editText = this.f25792y;
        if ((editText == null || editText.length() != 0 || !TextUtils.isEmpty(this.f25792y.getHint())) && !this.D && !this.E) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean z11 = z10;
        if (z11) {
            paddingTop = c3.i0.z(1.0f, this.f25787n, textSize - paddingTop, paddingTop);
        }
        float f17 = paddingTop;
        if (z11) {
            f11 = this.H * (1.0f - this.f25787n);
        } else {
            f11 = 0.0f;
        }
        float strokeWidth = paint.getStrokeWidth();
        float f18 = 0.75f;
        if (z11) {
            f18 = c3.i0.z(1.0f, this.f25787n, 0.25f, 0.75f);
        }
        float f19 = f18;
        float measureText = textPaint.measureText(this.f25784b) * f19;
        canvas.save();
        RectF rectF = this.f25783a;
        rectF.set(org.telegram.messenger.i0.L(10.0f) + getPaddingLeft(), getPaddingTop(), (getWidth() - org.telegram.messenger.i0.L(18.0f)) - getPaddingRight(), (strokeWidth * 2.0f) + getPaddingTop());
        canvas.clipRect(rectF, Region.Op.DIFFERENCE);
        rectF.set(getPaddingLeft() + strokeWidth, getPaddingTop() + strokeWidth, (getWidth() - strokeWidth) - getPaddingRight(), (getHeight() - strokeWidth) - getPaddingBottom());
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), paint);
        canvas.restore();
        float L = org.telegram.messenger.i0.L(10.0f) + getPaddingLeft();
        float paddingTop2 = getPaddingTop() + strokeWidth;
        float width = ((getWidth() - strokeWidth) - getPaddingRight()) - org.telegram.messenger.i0.L(6.0f);
        float f20 = (measureText / 2.0f) + L;
        float L2 = ((L + measureText) + org.telegram.messenger.i0.L(10.0f)) - f20;
        if (z11) {
            f12 = this.f25787n;
        } else {
            f12 = 1.0f;
        }
        canvas.drawLine((L2 * f12) + f20, paddingTop2, width, paddingTop2, paint);
        float L3 = f20 + org.telegram.messenger.i0.L(4.0f);
        float f21 = L - L3;
        if (z11) {
            f13 = this.f25787n;
        } else {
            f13 = 1.0f;
        }
        canvas.drawLine(L, paddingTop2, (f21 * f13) + L3, paddingTop2, paint);
        canvas.save();
        canvas.scale(f19, f19, org.telegram.messenger.i0.L(18.0f) + getPaddingLeft(), f17);
        canvas.drawText(this.f25784b, org.telegram.messenger.i0.L(14.0f) + getPaddingLeft() + f11, f17, textPaint);
        canvas.restore();
    }

    public void setForceForceUseCenter(boolean z10) {
        this.D = z10;
        this.F = z10;
        invalidate();
    }

    public void setForceUseCenter(boolean z10) {
        this.D = z10;
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
        this.f25784b = str;
        invalidate();
    }

    public void updateColors() {
        try {
            f();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
