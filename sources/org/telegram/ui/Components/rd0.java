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
public class rd0 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public static final pw0 I;
    public static final pw0 J;
    public static final pw0 K;
    public boolean E;
    public boolean F;
    public final org.telegram.ui.ActionBar.u6 G;
    public float H;
    public final RectF f32227a;
    public String f32228b;
    public final Paint f32229c;
    public final TextPaint d;
    public final o1.j e;
    public float f32230f;
    public final o1.j h;
    public float f32231n;
    public final o1.j f32232r;
    public float f32233s;
    public final float v;
    public final float f32234w;
    public EditText f32235x;
    public boolean f32236y;

    static {
        pw0 pw0Var = new pw0(new f2(28), new f2(29));
        pw0Var.f31728c = 100.0f;
        I = pw0Var;
        pw0 pw0Var2 = new pw0(new qd0(0), new qd0(1));
        pw0Var2.f31728c = 100.0f;
        J = pw0Var2;
        pw0 pw0Var3 = new pw0(new qd0(2), new qd0(3));
        pw0Var3.f31728c = 100.0f;
        K = pw0Var3;
    }

    public rd0(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f32227a = new RectF();
        this.f32228b = "";
        Paint paint = new Paint(1);
        this.f32229c = paint;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.e = new o1.j(this, I);
        this.h = new o1.j(this, J);
        this.f32232r = new o1.j(this, K);
        float max = Math.max(2, AndroidUtilities.dp(0.5f));
        this.v = max;
        this.f32234w = AndroidUtilities.dp(1.6667f);
        this.G = u6Var;
        setWillNotDraw(false);
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(max);
        f();
        setPadding(0, AndroidUtilities.dp(6.0f), 0, 0);
    }

    public static void d(o1.j jVar, float f7) {
        float f10 = f7 * 100.0f;
        o1.k kVar = jVar.f18969u;
        if (kVar != null && f10 == ((float) kVar.f18975i)) {
            return;
        }
        jVar.c();
        o1.k kVar2 = new o1.k(f10);
        kVar2.b(500.0f);
        kVar2.a(1.0f);
        kVar2.f18975i = f10;
        jVar.f18969u = kVar2;
        jVar.h();
    }

    private void setColor(int i10) {
        this.f32229c.setColor(i10);
        invalidate();
    }

    public final void a(float f7) {
        d(this.f32232r, f7);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23596q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23482k6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23500l6));
    }

    public final void b(float f7, float f10, boolean z10) {
        if (!z10) {
            this.f32230f = f7;
            this.f32231n = f10;
            if (!this.f32236y) {
                float f11 = this.f32234w;
                float f12 = this.v;
                this.f32229c.setStrokeWidth(((f11 - f12) * f7) + f12);
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
        this.f32235x = editTextBoldCursor;
        invalidate();
    }

    public final void f() {
        float f7;
        int i10 = org.telegram.ui.ActionBar.y6.H6;
        org.telegram.ui.ActionBar.u6 u6Var = this.G;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i10, u6Var);
        int w03 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.I6, u6Var);
        float f10 = 0.0f;
        if (this.f32236y && !this.F) {
            f7 = 0.0f;
        } else {
            f7 = this.f32231n;
        }
        int f11 = i0.a.f(f7, w02, w03);
        int i11 = org.telegram.ui.ActionBar.y6.f23596q7;
        this.d.setColor(i0.a.f(this.f32233s, f11, org.telegram.ui.ActionBar.y6.w0(i11, u6Var)));
        int w04 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23482k6, u6Var);
        int w05 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23500l6, u6Var);
        if (!this.f32236y || this.F) {
            f10 = this.f32230f;
        }
        setColor(i0.a.f(this.f32233s, i0.a.f(f10, w04, w05), org.telegram.ui.ActionBar.y6.w0(i11, u6Var)));
    }

    public EditText getAttachedEditText() {
        return this.f32235x;
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
        int i10 = org.telegram.ui.ActionBar.y6.H6;
        org.telegram.ui.ActionBar.u6 u6Var = this.G;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i10, u6Var);
        int w03 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.I6, u6Var);
        if (this.f32236y && !this.F) {
            f7 = 0.0f;
        } else {
            f7 = this.f32231n;
        }
        int f14 = i0.a.f(f7, w02, w03);
        int i11 = org.telegram.ui.ActionBar.y6.f23596q7;
        int f15 = i0.a.f(this.f32233s, f14, org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
        TextPaint textPaint = this.d;
        textPaint.setColor(f15);
        int w04 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23482k6, u6Var);
        int w05 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23500l6, u6Var);
        if (this.f32236y && !this.F) {
            f10 = 0.0f;
        } else {
            f10 = this.f32230f;
        }
        int f16 = i0.a.f(this.f32233s, i0.a.f(f10, w04, w05), org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
        Paint paint = this.f32229c;
        paint.setColor(f16);
        float paddingTop = getPaddingTop() + ((textPaint.getTextSize() / 2.0f) - AndroidUtilities.dp(1.75f));
        float textSize = (textPaint.getTextSize() / 2.0f) + (getHeight() / 2.0f);
        EditText editText = this.f32235x;
        if ((editText == null || editText.length() != 0 || !TextUtils.isEmpty(this.f32235x.getHint())) && !this.f32236y && !this.E) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean z11 = z10;
        if (z11) {
            paddingTop = c3.h0.z(1.0f, this.f32231n, textSize - paddingTop, paddingTop);
        }
        float f17 = paddingTop;
        if (z11) {
            f11 = this.H * (1.0f - this.f32231n);
        } else {
            f11 = 0.0f;
        }
        float strokeWidth = paint.getStrokeWidth();
        float f18 = 0.75f;
        if (z11) {
            f18 = c3.h0.z(1.0f, this.f32231n, 0.25f, 0.75f);
        }
        float f19 = f18;
        float measureText = textPaint.measureText(this.f32228b) * f19;
        canvas.save();
        RectF rectF = this.f32227a;
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
            f12 = this.f32231n;
        } else {
            f12 = 1.0f;
        }
        canvas.drawLine((dp2 * f12) + f20, paddingTop2, width, paddingTop2, paint);
        float dp3 = f20 + AndroidUtilities.dp(4.0f);
        float f21 = dp - dp3;
        if (z11) {
            f13 = this.f32231n;
        } else {
            f13 = 1.0f;
        }
        canvas.drawLine(dp, paddingTop2, (f21 * f13) + dp3, paddingTop2, paint);
        canvas.save();
        canvas.scale(f19, f19, AndroidUtilities.dp(18.0f) + getPaddingLeft(), f17);
        canvas.drawText(this.f32228b, AndroidUtilities.dp(14.0f) + getPaddingLeft() + f11, f17, textPaint);
        canvas.restore();
    }

    public void setForceForceUseCenter(boolean z10) {
        this.f32236y = z10;
        this.F = z10;
        invalidate();
    }

    public void setForceUseCenter(boolean z10) {
        this.f32236y = z10;
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
        this.f32228b = str;
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
