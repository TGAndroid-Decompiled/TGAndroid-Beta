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
public class ld0 extends FrameLayout {
    public static final vv0 I;
    public static final vv0 J;
    public static final vv0 K;
    public boolean E;
    public boolean F;
    public final org.telegram.ui.ActionBar.d6 G;
    public float H;
    public final RectF f25974a;
    public String f25975b;
    public final Paint f25976c;
    public final TextPaint d;
    public final o1.k e;
    public float f25977f;
    public final o1.k h;
    public float f25978n;
    public final o1.k f25979r;
    public float f25980s;
    public final float v;
    public final float f25981w;
    public EditText f25982x;
    public boolean f25983y;

    static {
        vv0 vv0Var = new vv0(new ha0(2), new ha0(3));
        vv0Var.f29749c = 100.0f;
        I = vv0Var;
        vv0 vv0Var2 = new vv0(new ha0(4), new ha0(5));
        vv0Var2.f29749c = 100.0f;
        J = vv0Var2;
        vv0 vv0Var3 = new vv0(new ha0(6), new ha0(7));
        vv0Var3.f29749c = 100.0f;
        K = vv0Var3;
    }

    public ld0(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f25974a = new RectF();
        this.f25975b = "";
        Paint paint = new Paint(1);
        this.f25976c = paint;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.e = new o1.k(this, I);
        this.h = new o1.k(this, J);
        this.f25979r = new o1.k(this, K);
        float max = Math.max(2, AndroidUtilities.dp(0.5f));
        this.v = max;
        this.f25981w = AndroidUtilities.dp(1.6667f);
        this.G = d6Var;
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
        o1.l lVar = kVar.f15534u;
        if (lVar != null && f10 == ((float) lVar.f15540i)) {
            return;
        }
        kVar.c();
        o1.l lVar2 = new o1.l(f10);
        lVar2.b(500.0f);
        lVar2.a(1.0f);
        lVar2.f15540i = f10;
        kVar.f15534u = lVar2;
        kVar.f();
    }

    private void setColor(int i10) {
        this.f25976c.setColor(i10);
        invalidate();
    }

    public final void a(float f7) {
        d(this.f25979r, f7);
    }

    public final void b(float f7, float f10, boolean z10) {
        if (!z10) {
            this.f25977f = f7;
            this.f25978n = f10;
            if (!this.f25983y) {
                float f11 = this.f25981w;
                float f12 = this.v;
                this.f25976c.setStrokeWidth(((f11 - f12) * f7) + f12);
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
        this.f25982x = editTextBoldCursor;
        invalidate();
    }

    public final void f() {
        float f7;
        int i10 = org.telegram.ui.ActionBar.h6.H6;
        org.telegram.ui.ActionBar.d6 d6Var = this.G;
        int v02 = org.telegram.ui.ActionBar.h6.v0(i10, d6Var);
        int v03 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.I6, d6Var);
        float f10 = 0.0f;
        if (this.f25983y && !this.F) {
            f7 = 0.0f;
        } else {
            f7 = this.f25978n;
        }
        int d = i0.a.d(f7, v02, v03);
        int i11 = org.telegram.ui.ActionBar.h6.f19299q7;
        this.d.setColor(i0.a.d(this.f25980s, d, org.telegram.ui.ActionBar.h6.v0(i11, d6Var)));
        int v04 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19187k6, d6Var);
        int v05 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19205l6, d6Var);
        if (!this.f25983y || this.F) {
            f10 = this.f25977f;
        }
        setColor(i0.a.d(this.f25980s, i0.a.d(f10, v04, v05), org.telegram.ui.ActionBar.h6.v0(i11, d6Var)));
    }

    public EditText getAttachedEditText() {
        return this.f25982x;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10;
        float f7;
        float f10;
        float f11;
        float f12;
        super.onDraw(canvas);
        TextPaint textPaint = this.d;
        float paddingTop = getPaddingTop() + ((textPaint.getTextSize() / 2.0f) - AndroidUtilities.dp(1.75f));
        float textSize = (textPaint.getTextSize() / 2.0f) + (getHeight() / 2.0f);
        EditText editText = this.f25982x;
        if ((editText == null || editText.length() != 0 || !TextUtils.isEmpty(this.f25982x.getHint())) && !this.f25983y && !this.E) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            paddingTop = com.google.android.gms.internal.vision.e2.z(1.0f, this.f25978n, textSize - paddingTop, paddingTop);
        }
        float f13 = paddingTop;
        if (z10) {
            f7 = (1.0f - this.f25978n) * this.H;
        } else {
            f7 = 0.0f;
        }
        Paint paint = this.f25976c;
        float strokeWidth = paint.getStrokeWidth();
        if (z10) {
            f10 = com.google.android.gms.internal.vision.e2.z(1.0f, this.f25978n, 0.25f, 0.75f);
        } else {
            f10 = 0.75f;
        }
        float measureText = textPaint.measureText(this.f25975b) * f10;
        canvas.save();
        RectF rectF = this.f25974a;
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
            f11 = this.f25978n;
        } else {
            f11 = 1.0f;
        }
        canvas.drawLine((dp2 * f11) + f14, paddingTop2, width, paddingTop2, paint);
        float dp3 = f14 + AndroidUtilities.dp(4.0f);
        float f15 = dp - dp3;
        if (z10) {
            f12 = this.f25978n;
        } else {
            f12 = 1.0f;
        }
        canvas.drawLine(dp, paddingTop2, (f15 * f12) + dp3, paddingTop2, paint);
        canvas.save();
        canvas.scale(f10, f10, AndroidUtilities.dp(18.0f) + getPaddingLeft(), f13);
        canvas.drawText(this.f25975b, AndroidUtilities.dp(14.0f) + getPaddingLeft() + f7, f13, textPaint);
        canvas.restore();
    }

    public void setForceForceUseCenter(boolean z10) {
        this.f25983y = z10;
        this.F = z10;
        invalidate();
    }

    public void setForceUseCenter(boolean z10) {
        this.f25983y = z10;
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
        this.f25975b = str;
        invalidate();
    }
}
