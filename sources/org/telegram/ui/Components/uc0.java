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
import org.telegram.messenger.AndroidUtilities;
public class uc0 extends FrameLayout {
    public static final av0 E;
    public static final av0 F;
    public static final av0 G;
    public boolean A;
    public boolean B;
    public final org.telegram.ui.ActionBar.c6 C;
    public float D;
    public final RectF f33194a;
    public String f33195b;
    public final Paint f33196c;
    public final TextPaint d;
    public final o1.k f33197e;
    public float f33198f;
    public final o1.k h;
    public float f33199n;
    public final o1.k f33200r;
    public float f33201s;
    public final float v;
    public final float f33202w;
    public EditText f33203x;
    public boolean f33204y;

    static {
        av0 av0Var = new av0(new r2(13), new r2(14));
        av0Var.f26899c = 100.0f;
        E = av0Var;
        av0 av0Var2 = new av0(new r2(15), new r2(16));
        av0Var2.f26899c = 100.0f;
        F = av0Var2;
        av0 av0Var3 = new av0(new r2(17), new r2(18));
        av0Var3.f26899c = 100.0f;
        G = av0Var3;
    }

    public uc0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f33194a = new RectF();
        this.f33195b = "";
        Paint paint = new Paint(1);
        this.f33196c = paint;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.f33197e = new o1.k(this, E);
        this.h = new o1.k(this, F);
        this.f33200r = new o1.k(this, G);
        float max = Math.max(2, AndroidUtilities.dp(0.5f));
        this.v = max;
        this.f33202w = AndroidUtilities.dp(1.6667f);
        this.C = c6Var;
        setWillNotDraw(false);
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(max);
        f();
        setPadding(0, AndroidUtilities.dp(6.0f), 0, 0);
    }

    public static void d(o1.k kVar, float f9) {
        float f10 = f9 * 100.0f;
        o1.l lVar = kVar.f19045u;
        if (lVar != null && f10 == ((float) lVar.f19052i)) {
            return;
        }
        kVar.c();
        o1.l lVar2 = new o1.l(f10);
        lVar2.b(500.0f);
        lVar2.a(1.0f);
        lVar2.f19052i = f10;
        kVar.f19045u = lVar2;
        kVar.f();
    }

    private void setColor(int i10) {
        this.f33196c.setColor(i10);
        invalidate();
    }

    public final void a(float f9) {
        d(this.f33200r, f9);
    }

    public final void b(float f9, float f10, boolean z10) {
        if (!z10) {
            this.f33198f = f9;
            this.f33199n = f10;
            if (!this.f33204y) {
                float f11 = this.f33202w;
                float f12 = this.v;
                this.f33196c.setStrokeWidth(((f11 - f12) * f9) + f12);
            }
            f();
            return;
        }
        d(this.f33197e, f9);
        d(this.h, f10);
    }

    public final void c(boolean z10, boolean z11) {
        float f9;
        float f10 = 0.0f;
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        if (z11) {
            f10 = 1.0f;
        }
        b(f9, f10, true);
    }

    public final void e(EditTextBoldCursor editTextBoldCursor) {
        this.f33203x = editTextBoldCursor;
        invalidate();
    }

    public final void f() {
        float f9;
        int i10 = org.telegram.ui.ActionBar.g6.H6;
        org.telegram.ui.ActionBar.c6 c6Var = this.C;
        int v02 = org.telegram.ui.ActionBar.g6.v0(i10, c6Var);
        int v03 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.I6, c6Var);
        float f10 = 0.0f;
        if (this.f33204y && !this.B) {
            f9 = 0.0f;
        } else {
            f9 = this.f33199n;
        }
        int d = i0.a.d(f9, v02, v03);
        int i11 = org.telegram.ui.ActionBar.g6.f23295q7;
        this.d.setColor(i0.a.d(this.f33201s, d, org.telegram.ui.ActionBar.g6.v0(i11, c6Var)));
        int v04 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23189k6, c6Var);
        int v05 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23206l6, c6Var);
        if (!this.f33204y || this.B) {
            f10 = this.f33198f;
        }
        setColor(i0.a.d(this.f33201s, i0.a.d(f10, v04, v05), org.telegram.ui.ActionBar.g6.v0(i11, c6Var)));
    }

    public EditText getAttachedEditText() {
        return this.f33203x;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10;
        float f9;
        float f10;
        float f11;
        float f12;
        super.onDraw(canvas);
        TextPaint textPaint = this.d;
        float paddingTop = getPaddingTop() + ((textPaint.getTextSize() / 2.0f) - AndroidUtilities.dp(1.75f));
        float textSize = (textPaint.getTextSize() / 2.0f) + (getHeight() / 2.0f);
        EditText editText = this.f33203x;
        if ((editText == null || editText.length() != 0 || !TextUtils.isEmpty(this.f33203x.getHint())) && !this.f33204y && !this.A) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            paddingTop = com.google.android.recaptcha.internal.a.z(1.0f, this.f33199n, textSize - paddingTop, paddingTop);
        }
        float f13 = paddingTop;
        if (z10) {
            f9 = (1.0f - this.f33199n) * this.D;
        } else {
            f9 = 0.0f;
        }
        Paint paint = this.f33196c;
        float strokeWidth = paint.getStrokeWidth();
        if (z10) {
            f10 = com.google.android.recaptcha.internal.a.z(1.0f, this.f33199n, 0.25f, 0.75f);
        } else {
            f10 = 0.75f;
        }
        float measureText = textPaint.measureText(this.f33195b) * f10;
        canvas.save();
        RectF rectF = this.f33194a;
        rectF.set(AndroidUtilities.dp(10.0f) + getPaddingLeft(), getPaddingTop(), (getWidth() - AndroidUtilities.dp(18.0f)) - getPaddingRight(), (strokeWidth * 2.0f) + getPaddingTop());
        canvas.clipRect(rectF, Region.Op.DIFFERENCE);
        rectF.set(getPaddingLeft() + strokeWidth, getPaddingTop() + strokeWidth, (getWidth() - strokeWidth) - getPaddingRight(), (getHeight() - strokeWidth) - getPaddingBottom());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
        canvas.restore();
        float dp = AndroidUtilities.dp(10.0f) + getPaddingLeft();
        float paddingTop2 = getPaddingTop() + strokeWidth;
        float width = ((getWidth() - strokeWidth) - getPaddingRight()) - AndroidUtilities.dp(6.0f);
        float f14 = (measureText / 2.0f) + dp;
        float dp2 = ((dp + measureText) + AndroidUtilities.dp(10.0f)) - f14;
        if (z10) {
            f11 = this.f33199n;
        } else {
            f11 = 1.0f;
        }
        canvas.drawLine((dp2 * f11) + f14, paddingTop2, width, paddingTop2, paint);
        float dp3 = f14 + AndroidUtilities.dp(4.0f);
        float f15 = dp - dp3;
        if (z10) {
            f12 = this.f33199n;
        } else {
            f12 = 1.0f;
        }
        canvas.drawLine(dp, paddingTop2, (f15 * f12) + dp3, paddingTop2, paint);
        canvas.save();
        canvas.scale(f10, f10, AndroidUtilities.dp(18.0f) + getPaddingLeft(), f13);
        canvas.drawText(this.f33195b, AndroidUtilities.dp(14.0f) + getPaddingLeft() + f9, f13, textPaint);
        canvas.restore();
    }

    public void setForceForceUseCenter(boolean z10) {
        this.f33204y = z10;
        this.B = z10;
        invalidate();
    }

    public void setForceUseCenter(boolean z10) {
        this.f33204y = z10;
        invalidate();
    }

    public void setForceUseCenter2(boolean z10) {
        this.A = z10;
    }

    public void setLeftPadding(float f9) {
        this.D = f9;
        invalidate();
    }

    public void setText(String str) {
        this.f33195b = str;
        invalidate();
    }
}
