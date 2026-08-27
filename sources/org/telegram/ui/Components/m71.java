package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;

public final class m71 extends View {

    public l71 f30609a;

    public int f30610b;

    public final RectF f30611c;
    public CharSequence d;

    public pz0 f30612e;

    public boolean f30613f;
    public io0 h;

    public final y5 f30614n;

    public final o71 f30615r;

    public m71(o71 o71Var, Context context) {
        super(context);
        this.f30615r = o71Var;
        this.f30611c = new RectF();
        this.f30614n = new y5(this, 360L, er.h);
    }

    @Override
    public int getId() {
        return this.f30609a.f30318a;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        float f10;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int iDp;
        Canvas canvas2;
        int i17;
        int i18;
        o71 o71Var = this.f30615r;
        TextPaint textPaint = o71Var.d;
        TextPaint textPaint2 = o71Var.f31211e;
        Paint paint = o71Var.f31213f;
        org.telegram.ui.ActionBar.c6 c6Var = o71Var.f31214f0;
        TextPaint textPaint3 = o71Var.f31208c;
        canvas.save();
        float fE = this.f30614n.e(this.f30613f);
        if (fE > 0.0f) {
            if (this.h == null) {
                this.h = new io0(this);
            }
            canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
            this.h.a(canvas, fE);
            canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
        }
        int i19 = this.f30609a.f30318a;
        if (i19 != Integer.MAX_VALUE) {
            int i20 = o71.f31203o0;
        }
        int i21 = o71Var.I;
        if (i21 != -1) {
            i11 = o71Var.C;
            i10 = i21;
        } else {
            i10 = o71Var.C;
            i11 = o71Var.f31210d0;
        }
        if (i19 == i10) {
            i12 = o71Var.M;
            f10 = 0.0f;
            i13 = o71Var.N;
            i14 = org.telegram.ui.ActionBar.g6.T9;
            i15 = org.telegram.ui.ActionBar.g6.U9;
        } else {
            f10 = 0.0f;
            i12 = o71Var.N;
            i13 = o71Var.M;
            i14 = org.telegram.ui.ActionBar.g6.U9;
            i15 = org.telegram.ui.ActionBar.g6.T9;
        }
        if (o71Var.A == 9) {
            textPaint3.setColor(org.telegram.ui.ActionBar.g6.v0(o71Var.N, c6Var));
        } else if ((o71Var.F || i21 != -1) && (i19 == i10 || i19 == i11)) {
            textPaint3.setColor(i0.b.d(o71Var.G, org.telegram.ui.ActionBar.g6.v0(i13, c6Var), org.telegram.ui.ActionBar.g6.v0(i12, c6Var)));
        } else {
            textPaint3.setColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
        }
        this.f30609a.getClass();
        if (this.f30609a.f30318a == Integer.MAX_VALUE) {
            i16 = 0;
        } else if (o71Var.f31221n) {
            float fDp = AndroidUtilities.dp(20.0f);
            int i22 = o71.f31203o0;
            i16 = (int) ((fDp * f10) + 0);
        } else {
            int i23 = o71.f31203o0;
            i16 = 0;
        }
        int i24 = this.f30609a.f30320c;
        if (i16 != 0) {
            int i25 = o71.f31203o0;
            iDp = AndroidUtilities.dp(f10) + i16;
        } else {
            iDp = 0;
        }
        this.f30610b = i24 + iDp;
        int measuredWidth = (getMeasuredWidth() - this.f30610b) / 2;
        CharSequence charSequence = this.f30609a.f30319b;
        if ((charSequence == null && this.d != null) || !TextUtils.equals(charSequence, this.d)) {
            l71 l71Var = this.f30609a;
            CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(l71Var.f30319b, textPaint3.getFontMetricsInt(), false);
            l71Var.f30319b = charSequenceReplaceEmoji;
            this.d = charSequenceReplaceEmoji;
            pz0 pz0Var = this.f30612e;
            if (pz0Var != null) {
                t5.release(pz0Var.f31702j, pz0Var.f31703k);
            }
            pz0 pz0Var2 = new pz0(this.d, textPaint3.getTextSize() / AndroidUtilities.density, textPaint3.getTypeface());
            pz0Var2.s(this);
            this.f30612e = pz0Var2;
        }
        pz0 pz0Var3 = this.f30612e;
        if (pz0Var3 != null) {
            pz0Var3.f31708p = AndroidUtilities.dp(400.0f);
            i17 = measuredWidth;
            pz0Var3.c(measuredWidth, getMeasuredHeight() / 2, 1.0f, textPaint3.getColor(), canvas);
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            i17 = measuredWidth;
        }
        if (this.f30609a.f30318a != Integer.MAX_VALUE) {
            if (o71Var.f31221n) {
                textPaint.setColor(org.telegram.ui.ActionBar.g6.v0(o71Var.P, c6Var));
                if (org.telegram.ui.ActionBar.g6.c1(i14) && org.telegram.ui.ActionBar.g6.c1(i15)) {
                    int iV0 = org.telegram.ui.ActionBar.g6.v0(i14, c6Var);
                    if ((o71Var.F || o71Var.H != -1) && ((i18 = this.f30609a.f30318a) == i10 || i18 == i11)) {
                        paint.setColor(i0.b.d(o71Var.G, org.telegram.ui.ActionBar.g6.v0(i15, c6Var), iV0));
                    } else {
                        paint.setColor(iV0);
                    }
                } else {
                    paint.setColor(textPaint3.getColor());
                }
                int iDp2 = AndroidUtilities.dp(6.0f) + i17 + this.f30609a.f30320c;
                int iX = org.telegram.messenger.rl.x(20.0f, getMeasuredHeight(), 2);
                if (this.f30609a.f30318a == Integer.MAX_VALUE) {
                    paint.setAlpha(255);
                } else if (o71Var.f31221n) {
                    int i26 = o71.f31203o0;
                    paint.setAlpha((int) 0.0f);
                } else {
                    int i27 = o71.f31203o0;
                    paint.setAlpha(255);
                }
                float fDp2 = AndroidUtilities.dp(20.0f) + iX;
                RectF rectF = this.f30611c;
                rectF.set(iDp2, iX, iDp2 + i16, fDp2);
                float f11 = AndroidUtilities.density * 11.5f;
                canvas2.drawRoundRect(rectF, f11, f11, paint);
                if (this.f30609a.f30318a != Integer.MAX_VALUE) {
                    if (o71Var.f31221n) {
                        textPaint2.setColor(textPaint.getColor());
                        int i28 = o71.f31203o0;
                        textPaint2.setAlpha((int) 0.0f);
                        float fDp3 = AndroidUtilities.dp(3.0f);
                        canvas2.drawLine(rectF.centerX() - fDp3, rectF.centerY() - fDp3, rectF.centerX() + fDp3, rectF.centerY() + fDp3, textPaint2);
                        canvas.drawLine(rectF.centerX() - fDp3, rectF.centerY() + fDp3, rectF.centerX() + fDp3, rectF.centerY() - fDp3, textPaint2);
                    } else {
                        int i29 = o71.f31203o0;
                    }
                }
            } else {
                int i30 = o71.f31203o0;
            }
        }
        if (this.f30609a.f30318a != Integer.MAX_VALUE) {
            int i31 = o71.f31203o0;
        }
        canvas.restore();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        l71 l71Var = this.f30609a;
        accessibilityNodeInfo.setSelected((l71Var == null || (i10 = this.f30615r.C) == -1 || l71Var.f30318a != i10) ? false : true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        l71 l71Var = this.f30609a;
        o71 o71Var = this.f30615r;
        setMeasuredDimension(AndroidUtilities.dp(o71Var.f31223r * 2) + l71Var.a(o71Var.f31208c) + o71Var.E, View.MeasureSpec.getSize(i11));
    }

    public void setReordering(boolean z10) {
        if (this.f30613f == z10) {
            return;
        }
        this.f30613f = z10;
        invalidate();
    }
}
