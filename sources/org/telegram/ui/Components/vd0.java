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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public class vd0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public static final hw0 I;
    public static final hw0 J;
    public static final hw0 K;
    public boolean E;
    public boolean F;
    public final org.telegram.ui.ActionBar.g6 G;
    public float H;
    public final RectF f31422a;
    public String f31423b;
    public final Paint f31424c;
    public final TextPaint d;
    public final o1.k e;
    public float f31425f;
    public final o1.k h;
    public float f31426n;
    public final o1.k f31427r;
    public float f31428s;
    public final float v;
    public final float f31429w;
    public EditText f31430x;
    public boolean f31431y;

    static {
        hw0 hw0Var = new hw0(new e2(25), new e2(26));
        hw0Var.f27066c = 100.0f;
        I = hw0Var;
        hw0 hw0Var2 = new hw0(new e2(27), new e2(28));
        hw0Var2.f27066c = 100.0f;
        J = hw0Var2;
        hw0 hw0Var3 = new hw0(new e2(29), new ud0(0));
        hw0Var3.f27066c = 100.0f;
        K = hw0Var3;
    }

    public vd0(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f31422a = new RectF();
        this.f31423b = "";
        Paint paint = new Paint(1);
        this.f31424c = paint;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.e = new o1.k(this, I);
        this.h = new o1.k(this, J);
        this.f31427r = new o1.k(this, K);
        float max = Math.max(2, AndroidUtilities.dp(0.5f));
        this.v = max;
        this.f31429w = AndroidUtilities.dp(1.6667f);
        this.G = g6Var;
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
        o1.l lVar = kVar.f17622u;
        if (lVar != null && f10 == ((float) lVar.f17628i)) {
            return;
        }
        kVar.c();
        o1.l lVar2 = new o1.l(f10);
        lVar2.b(500.0f);
        lVar2.a(1.0f);
        lVar2.f17628i = f10;
        kVar.f17622u = lVar2;
        kVar.h();
    }

    private void setColor(int i10) {
        this.f31424c.setColor(i10);
        invalidate();
    }

    public final void a(float f7) {
        d(this.f31427r, f7);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21421q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21310k6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21327l6));
    }

    public final void b(float f7, float f10, boolean z10) {
        if (!z10) {
            this.f31425f = f7;
            this.f31426n = f10;
            if (!this.f31431y) {
                float f11 = this.f31429w;
                float f12 = this.v;
                this.f31424c.setStrokeWidth(((f11 - f12) * f7) + f12);
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
        this.f31430x = editTextBoldCursor;
        invalidate();
    }

    public final void f() {
        float f7;
        int i10 = org.telegram.ui.ActionBar.k6.H6;
        org.telegram.ui.ActionBar.g6 g6Var = this.G;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i10, g6Var);
        int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.I6, g6Var);
        float f10 = 0.0f;
        if (this.f31431y && !this.F) {
            f7 = 0.0f;
        } else {
            f7 = this.f31426n;
        }
        int f11 = i0.a.f(f7, w02, w03);
        int i11 = org.telegram.ui.ActionBar.k6.f21421q7;
        this.d.setColor(i0.a.f(this.f31428s, f11, org.telegram.ui.ActionBar.k6.w0(i11, g6Var)));
        int w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21310k6, g6Var);
        int w05 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21327l6, g6Var);
        if (!this.f31431y || this.F) {
            f10 = this.f31425f;
        }
        setColor(i0.a.f(this.f31428s, i0.a.f(f10, w04, w05), org.telegram.ui.ActionBar.k6.w0(i11, g6Var)));
    }

    public EditText getAttachedEditText() {
        return this.f31430x;
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
        int i10 = org.telegram.ui.ActionBar.k6.H6;
        org.telegram.ui.ActionBar.g6 g6Var = this.G;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i10, g6Var);
        int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.I6, g6Var);
        if (this.f31431y && !this.F) {
            f7 = 0.0f;
        } else {
            f7 = this.f31426n;
        }
        int f14 = i0.a.f(f7, w02, w03);
        int i11 = org.telegram.ui.ActionBar.k6.f21421q7;
        int f15 = i0.a.f(this.f31428s, f14, org.telegram.ui.ActionBar.k6.w0(i11, g6Var));
        TextPaint textPaint = this.d;
        textPaint.setColor(f15);
        int w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21310k6, g6Var);
        int w05 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21327l6, g6Var);
        if (this.f31431y && !this.F) {
            f10 = 0.0f;
        } else {
            f10 = this.f31425f;
        }
        int f16 = i0.a.f(this.f31428s, i0.a.f(f10, w04, w05), org.telegram.ui.ActionBar.k6.w0(i11, g6Var));
        Paint paint = this.f31424c;
        paint.setColor(f16);
        float paddingTop = getPaddingTop() + ((textPaint.getTextSize() / 2.0f) - AndroidUtilities.dp(1.75f));
        float textSize = (textPaint.getTextSize() / 2.0f) + (getHeight() / 2.0f);
        EditText editText = this.f31430x;
        if ((editText == null || editText.length() != 0 || !TextUtils.isEmpty(this.f31430x.getHint())) && !this.f31431y && !this.E) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean z11 = z10;
        if (z11) {
            paddingTop = com.google.android.gms.internal.play_billing.k3.y(1.0f, this.f31426n, textSize - paddingTop, paddingTop);
        }
        float f17 = paddingTop;
        if (z11) {
            f11 = this.H * (1.0f - this.f31426n);
        } else {
            f11 = 0.0f;
        }
        float strokeWidth = paint.getStrokeWidth();
        float f18 = 0.75f;
        if (z11) {
            f18 = com.google.android.gms.internal.play_billing.k3.y(1.0f, this.f31426n, 0.25f, 0.75f);
        }
        float f19 = f18;
        float measureText = textPaint.measureText(this.f31423b) * f19;
        canvas.save();
        RectF rectF = this.f31422a;
        rectF.set(AndroidUtilities.dp(10.0f) + getPaddingLeft(), getPaddingTop(), (getWidth() - AndroidUtilities.dp(18.0f)) - getPaddingRight(), (strokeWidth * 2.0f) + getPaddingTop());
        canvas.clipRect(rectF, Region.Op.DIFFERENCE);
        rectF.set(getPaddingLeft() + strokeWidth, getPaddingTop() + strokeWidth, (getWidth() - strokeWidth) - getPaddingRight(), (getHeight() - strokeWidth) - getPaddingBottom());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
        canvas.restore();
        float dp = AndroidUtilities.dp(10.0f) + getPaddingLeft();
        float paddingTop2 = getPaddingTop() + strokeWidth;
        float width = ((getWidth() - strokeWidth) - getPaddingRight()) - AndroidUtilities.dp(6.0f);
        float f20 = (measureText / 2.0f) + dp;
        float dp2 = ((dp + measureText) + AndroidUtilities.dp(10.0f)) - f20;
        if (z11) {
            f12 = this.f31426n;
        } else {
            f12 = 1.0f;
        }
        canvas.drawLine((dp2 * f12) + f20, paddingTop2, width, paddingTop2, paint);
        float dp3 = f20 + AndroidUtilities.dp(4.0f);
        float f21 = dp - dp3;
        if (z11) {
            f13 = this.f31426n;
        } else {
            f13 = 1.0f;
        }
        canvas.drawLine(dp, paddingTop2, (f21 * f13) + dp3, paddingTop2, paint);
        canvas.save();
        canvas.scale(f19, f19, AndroidUtilities.dp(18.0f) + getPaddingLeft(), f17);
        canvas.drawText(this.f31423b, AndroidUtilities.dp(14.0f) + getPaddingLeft() + f11, f17, textPaint);
        canvas.restore();
    }

    public void setForceForceUseCenter(boolean z10) {
        this.f31431y = z10;
        this.F = z10;
        invalidate();
    }

    public void setForceUseCenter(boolean z10) {
        this.f31431y = z10;
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
        this.f31423b = str;
        invalidate();
    }

    public void updateColors() {
        try {
            f();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
