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
public class td0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public static final gw0 I;
    public static final gw0 J;
    public static final gw0 K;
    public boolean E;
    public boolean F;
    public final org.telegram.ui.ActionBar.g6 G;
    public float H;
    public final RectF f30796a;
    public String f30797b;
    public final Paint f30798c;
    public final TextPaint d;
    public final o1.k e;
    public float f30799f;
    public final o1.k h;
    public float f30800n;
    public final o1.k f30801r;
    public float f30802s;
    public final float v;
    public final float f30803w;
    public EditText f30804x;
    public boolean f30805y;

    static {
        gw0 gw0Var = new gw0(new d2(25), new d2(26));
        gw0Var.f26806c = 100.0f;
        I = gw0Var;
        gw0 gw0Var2 = new gw0(new d2(27), new d2(28));
        gw0Var2.f26806c = 100.0f;
        J = gw0Var2;
        gw0 gw0Var3 = new gw0(new d2(29), new sd0(0));
        gw0Var3.f26806c = 100.0f;
        K = gw0Var3;
    }

    public td0(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f30796a = new RectF();
        this.f30797b = "";
        Paint paint = new Paint(1);
        this.f30798c = paint;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.e = new o1.k(this, I);
        this.h = new o1.k(this, J);
        this.f30801r = new o1.k(this, K);
        float max = Math.max(2, AndroidUtilities.dp(0.5f));
        this.v = max;
        this.f30803w = AndroidUtilities.dp(1.6667f);
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
        this.f30798c.setColor(i10);
        invalidate();
    }

    public final void a(float f7) {
        d(this.f30801r, f7);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21422q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21311k6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21328l6));
    }

    public final void b(float f7, float f10, boolean z10) {
        if (!z10) {
            this.f30799f = f7;
            this.f30800n = f10;
            if (!this.f30805y) {
                float f11 = this.f30803w;
                float f12 = this.v;
                this.f30798c.setStrokeWidth(((f11 - f12) * f7) + f12);
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
        this.f30804x = editTextBoldCursor;
        invalidate();
    }

    public final void f() {
        float f7;
        int i10 = org.telegram.ui.ActionBar.k6.H6;
        org.telegram.ui.ActionBar.g6 g6Var = this.G;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i10, g6Var);
        int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.I6, g6Var);
        float f10 = 0.0f;
        if (this.f30805y && !this.F) {
            f7 = 0.0f;
        } else {
            f7 = this.f30800n;
        }
        int f11 = i0.a.f(f7, w02, w03);
        int i11 = org.telegram.ui.ActionBar.k6.f21422q7;
        this.d.setColor(i0.a.f(this.f30802s, f11, org.telegram.ui.ActionBar.k6.w0(i11, g6Var)));
        int w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21311k6, g6Var);
        int w05 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21328l6, g6Var);
        if (!this.f30805y || this.F) {
            f10 = this.f30799f;
        }
        setColor(i0.a.f(this.f30802s, i0.a.f(f10, w04, w05), org.telegram.ui.ActionBar.k6.w0(i11, g6Var)));
    }

    public EditText getAttachedEditText() {
        return this.f30804x;
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
        if (this.f30805y && !this.F) {
            f7 = 0.0f;
        } else {
            f7 = this.f30800n;
        }
        int f14 = i0.a.f(f7, w02, w03);
        int i11 = org.telegram.ui.ActionBar.k6.f21422q7;
        int f15 = i0.a.f(this.f30802s, f14, org.telegram.ui.ActionBar.k6.w0(i11, g6Var));
        TextPaint textPaint = this.d;
        textPaint.setColor(f15);
        int w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21311k6, g6Var);
        int w05 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21328l6, g6Var);
        if (this.f30805y && !this.F) {
            f10 = 0.0f;
        } else {
            f10 = this.f30799f;
        }
        int f16 = i0.a.f(this.f30802s, i0.a.f(f10, w04, w05), org.telegram.ui.ActionBar.k6.w0(i11, g6Var));
        Paint paint = this.f30798c;
        paint.setColor(f16);
        float paddingTop = getPaddingTop() + ((textPaint.getTextSize() / 2.0f) - AndroidUtilities.dp(1.75f));
        float textSize = (textPaint.getTextSize() / 2.0f) + (getHeight() / 2.0f);
        EditText editText = this.f30804x;
        if ((editText == null || editText.length() != 0 || !TextUtils.isEmpty(this.f30804x.getHint())) && !this.f30805y && !this.E) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean z11 = z10;
        if (z11) {
            paddingTop = com.google.android.gms.internal.play_billing.k3.y(1.0f, this.f30800n, textSize - paddingTop, paddingTop);
        }
        float f17 = paddingTop;
        if (z11) {
            f11 = this.H * (1.0f - this.f30800n);
        } else {
            f11 = 0.0f;
        }
        float strokeWidth = paint.getStrokeWidth();
        float f18 = 0.75f;
        if (z11) {
            f18 = com.google.android.gms.internal.play_billing.k3.y(1.0f, this.f30800n, 0.25f, 0.75f);
        }
        float f19 = f18;
        float measureText = textPaint.measureText(this.f30797b) * f19;
        canvas.save();
        RectF rectF = this.f30796a;
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
            f12 = this.f30800n;
        } else {
            f12 = 1.0f;
        }
        canvas.drawLine((dp2 * f12) + f20, paddingTop2, width, paddingTop2, paint);
        float dp3 = f20 + AndroidUtilities.dp(4.0f);
        float f21 = dp - dp3;
        if (z11) {
            f13 = this.f30800n;
        } else {
            f13 = 1.0f;
        }
        canvas.drawLine(dp, paddingTop2, (f21 * f13) + dp3, paddingTop2, paint);
        canvas.save();
        canvas.scale(f19, f19, AndroidUtilities.dp(18.0f) + getPaddingLeft(), f17);
        canvas.drawText(this.f30797b, AndroidUtilities.dp(14.0f) + getPaddingLeft() + f11, f17, textPaint);
        canvas.restore();
    }

    public void setForceForceUseCenter(boolean z10) {
        this.f30805y = z10;
        this.F = z10;
        invalidate();
    }

    public void setForceUseCenter(boolean z10) {
        this.f30805y = z10;
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
        this.f30797b = str;
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
