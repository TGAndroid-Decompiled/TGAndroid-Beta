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
public class gb0 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public static final kt0 J;
    public static final kt0 K;
    public static final kt0 L;
    public boolean E;
    public boolean F;
    public boolean G;
    public final org.telegram.ui.ActionBar.e6 H;
    public float I;
    public final RectF f34032a;
    public String f34033b;
    public final Paint f34034c;
    public final TextPaint d;
    public final q1.g f34035e;
    public float f34036f;
    public final q1.g h;
    public float f34037n;
    public final q1.g f34038r;
    public float f34039s;
    public final float f34040w;
    public final float f34041x;
    public EditText f34042y;

    static {
        kt0 kt0Var = new kt0(new a3(17), new a3(18));
        kt0Var.f35485c = 100.0f;
        J = kt0Var;
        kt0 kt0Var2 = new kt0(new a3(19), new a3(20));
        kt0Var2.f35485c = 100.0f;
        K = kt0Var2;
        kt0 kt0Var3 = new kt0(new a3(21), new a3(22));
        kt0Var3.f35485c = 100.0f;
        L = kt0Var3;
    }

    public gb0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f34032a = new RectF();
        this.f34033b = "";
        Paint paint = new Paint(1);
        this.f34034c = paint;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.f34035e = new q1.g(this, J);
        this.h = new q1.g(this, K);
        this.f34038r = new q1.g(this, L);
        float max = Math.max(2, org.telegram.messenger.g0.L(0.5f));
        this.f34040w = max;
        this.f34041x = org.telegram.messenger.g0.L(1.6667f);
        this.H = e6Var;
        setWillNotDraw(false);
        textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(max);
        f();
        setPadding(0, org.telegram.messenger.g0.L(6.0f), 0, 0);
    }

    public static void d(q1.g gVar, float f10) {
        float f11 = f10 * 100.0f;
        q1.h hVar = gVar.f53653m;
        if (hVar != null && f11 == ((float) hVar.f53661i)) {
            return;
        }
        gVar.d();
        q1.h hVar2 = new q1.h(f11);
        hVar2.b(500.0f);
        hVar2.a(1.0f);
        hVar2.f53661i = f11;
        gVar.f53653m = hVar2;
        gVar.h();
    }

    private void setColor(int i3) {
        this.f34034c.setColor(i3);
        invalidate();
    }

    public final void a(float f10) {
        d(this.f34038r, f10);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28122q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28007k6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28026l6));
    }

    public final void b(float f10, float f11, boolean z10) {
        if (!z10) {
            this.f34036f = f10;
            this.f34037n = f11;
            if (!this.E) {
                float f12 = this.f34041x;
                float f13 = this.f34040w;
                this.f34034c.setStrokeWidth(((f12 - f13) * f10) + f13);
            }
            f();
            return;
        }
        d(this.f34035e, f10);
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
        this.f34042y = editTextBoldCursor;
        invalidate();
    }

    public final void f() {
        float f10;
        int i3 = org.telegram.ui.ActionBar.k6.H6;
        org.telegram.ui.ActionBar.e6 e6Var = this.H;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i3, e6Var);
        int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.I6, e6Var);
        float f11 = 0.0f;
        if (this.E && !this.G) {
            f10 = 0.0f;
        } else {
            f10 = this.f34037n;
        }
        int f12 = i0.a.f(f10, w02, w03);
        int i10 = org.telegram.ui.ActionBar.k6.f28122q7;
        this.d.setColor(i0.a.f(this.f34039s, f12, org.telegram.ui.ActionBar.k6.w0(i10, e6Var)));
        int w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28007k6, e6Var);
        int w05 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28026l6, e6Var);
        if (!this.E || this.G) {
            f11 = this.f34036f;
        }
        setColor(i0.a.f(this.f34039s, i0.a.f(f11, w04, w05), org.telegram.ui.ActionBar.k6.w0(i10, e6Var)));
    }

    public EditText getAttachedEditText() {
        return this.f34042y;
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
        int i3 = org.telegram.ui.ActionBar.k6.H6;
        org.telegram.ui.ActionBar.e6 e6Var = this.H;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i3, e6Var);
        int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.I6, e6Var);
        if (this.E && !this.G) {
            f10 = 0.0f;
        } else {
            f10 = this.f34037n;
        }
        int f15 = i0.a.f(f10, w02, w03);
        int i10 = org.telegram.ui.ActionBar.k6.f28122q7;
        int f16 = i0.a.f(this.f34039s, f15, org.telegram.ui.ActionBar.k6.w0(i10, e6Var));
        TextPaint textPaint = this.d;
        textPaint.setColor(f16);
        int w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28007k6, e6Var);
        int w05 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28026l6, e6Var);
        if (this.E && !this.G) {
            f11 = 0.0f;
        } else {
            f11 = this.f34036f;
        }
        int f17 = i0.a.f(this.f34039s, i0.a.f(f11, w04, w05), org.telegram.ui.ActionBar.k6.w0(i10, e6Var));
        Paint paint = this.f34034c;
        paint.setColor(f17);
        float paddingTop = getPaddingTop() + ((textPaint.getTextSize() / 2.0f) - org.telegram.messenger.g0.L(1.75f));
        float textSize = (textPaint.getTextSize() / 2.0f) + (getHeight() / 2.0f);
        EditText editText = this.f34042y;
        if ((editText == null || editText.length() != 0 || !TextUtils.isEmpty(this.f34042y.getHint())) && !this.E && !this.F) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean z11 = z10;
        if (z11) {
            paddingTop = com.google.android.recaptcha.internal.a.y(1.0f, this.f34037n, textSize - paddingTop, paddingTop);
        }
        float f18 = paddingTop;
        if (z11) {
            f12 = this.I * (1.0f - this.f34037n);
        } else {
            f12 = 0.0f;
        }
        float strokeWidth = paint.getStrokeWidth();
        float f19 = 0.75f;
        if (z11) {
            f19 = com.google.android.recaptcha.internal.a.y(1.0f, this.f34037n, 0.25f, 0.75f);
        }
        float f20 = f19;
        float measureText = textPaint.measureText(this.f34033b) * f20;
        canvas.save();
        RectF rectF = this.f34032a;
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
            f13 = this.f34037n;
        } else {
            f13 = 1.0f;
        }
        canvas.drawLine((L3 * f13) + f21, paddingTop2, width, paddingTop2, paint);
        float L4 = f21 + org.telegram.messenger.g0.L(4.0f);
        float f22 = L2 - L4;
        if (z11) {
            f14 = this.f34037n;
        } else {
            f14 = 1.0f;
        }
        canvas.drawLine(L2, paddingTop2, (f22 * f14) + L4, paddingTop2, paint);
        canvas.save();
        canvas.scale(f20, f20, org.telegram.messenger.g0.L(18.0f) + getPaddingLeft(), f18);
        canvas.drawText(this.f34033b, org.telegram.messenger.g0.L(14.0f) + getPaddingLeft() + f12, f18, textPaint);
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
        this.f34033b = str;
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
