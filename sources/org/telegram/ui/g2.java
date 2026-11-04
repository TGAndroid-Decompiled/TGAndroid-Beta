package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class g2 extends View implements org.telegram.ui.Cells.g9, d3 {
    public final i50 f45495a;
    public final g4 f45496b;
    public a3 f45497c;
    public a3 d;
    public int f45498e;
    public int f45499f;
    public int h;
    public TL_iv.pageBlockPullquote f45500n;

    public g2(Context context, i50 i50Var, g4 g4Var) {
        super(context);
        this.f45495a = i50Var;
        this.f45496b = g4Var;
    }

    @Override
    public int getBoundLeft() {
        int i3;
        a3 a3Var = this.f45497c;
        if (a3Var != null) {
            i3 = Math.min(Integer.MAX_VALUE, a3Var.k() + a3Var.f43579s);
        } else {
            i3 = Integer.MAX_VALUE;
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            i3 = Math.min(i3, a3Var2.k() + a3Var2.f43579s);
        }
        if (i3 == Integer.MAX_VALUE) {
            return -1;
        }
        this.f45495a.getClass();
        return i3 - org.telegram.messenger.g0.L(18);
    }

    @Override
    public int getBoundRight() {
        int i3;
        a3 a3Var = this.f45497c;
        if (a3Var != null) {
            i3 = Math.max(Integer.MIN_VALUE, a3Var.l() + a3Var.f43579s);
        } else {
            i3 = Integer.MIN_VALUE;
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            i3 = Math.max(i3, a3Var2.l() + a3Var2.f43579s);
        }
        if (i3 == Integer.MIN_VALUE) {
            return -1;
        }
        this.f45495a.getClass();
        return org.telegram.messenger.g0.L(18) + i3;
    }

    @Override
    public int getLastLineBoundRight() {
        int m10;
        int L;
        a3 a3Var = this.d;
        i50 i50Var = this.f45495a;
        if (a3Var != null) {
            m10 = a3Var.m() + a3Var.f43579s;
            i50Var.getClass();
            L = org.telegram.messenger.g0.L(18);
        } else {
            a3 a3Var2 = this.f45497c;
            if (a3Var2 != null) {
                m10 = a3Var2.m() + a3Var2.f43579s;
                i50Var.getClass();
                L = org.telegram.messenger.g0.L(18);
            } else {
                return -1;
            }
        }
        return L + m10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.camera.q.a(this);
    }

    @Override
    public final void k(ArrayList arrayList) {
        a3 a3Var = this.f45497c;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            arrayList.add(a3Var2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f45497c;
        if (a3Var != null) {
            a3Var.i(this);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            a3Var2.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.f45497c;
        if (a3Var != null) {
            a3Var.f(this);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            a3Var2.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f45500n != null) {
            a3 a3Var = this.f45497c;
            i50 i50Var = this.f45495a;
            int i3 = 0;
            if (a3Var != null) {
                canvas.save();
                canvas.translate(this.f45499f, this.h);
                i4.t(i50Var, canvas, this, 0);
                this.f45497c.d(canvas, this);
                canvas.restore();
                i3 = 1;
            }
            if (this.d != null) {
                canvas.save();
                canvas.translate(this.f45499f, this.f45498e);
                i4.t(i50Var, canvas, this, i3);
                this.d.d(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence h;
        CharSequence h7;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        a3 a3Var = this.f45497c;
        g4 g4Var = this.f45496b;
        i50 i50Var = this.f45495a;
        if (a3Var != null && (h7 = i4.h(i50Var, g4Var, a3Var)) != null) {
            spannableStringBuilder.append(h7);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null && (h = i4.h(i50Var, g4Var, a3Var2)) != null) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append((CharSequence) ", ");
            }
            spannableStringBuilder.append(h);
        }
        if (spannableStringBuilder.length() == 0) {
            return;
        }
        spannableStringBuilder.append((CharSequence) ", ").append((CharSequence) org.telegram.messenger.bd.M0(2131754859, null));
        accessibilityNodeInfo.setText(spannableStringBuilder);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int i11;
        int i12;
        int size = View.MeasureSpec.getSize(i3);
        i50 i50Var = this.f45495a;
        i50Var.getClass();
        this.f45499f = org.telegram.messenger.g0.L(18);
        i50Var.getClass();
        float f10 = 8;
        this.h = org.telegram.messenger.g0.L(f10);
        TL_iv.pageBlockPullquote pageblockpullquote = this.f45500n;
        if (pageblockpullquote != null) {
            TL_iv.RichText richText = pageblockpullquote.text;
            i50 i50Var2 = this.f45495a;
            i50Var2.getClass();
            float f11 = 36;
            a3 o10 = i4.o(i50Var2, this, null, richText, size - org.telegram.messenger.g0.L(f11), this.h, this.f45500n, this.f45496b);
            this.f45497c = o10;
            if (o10 != null) {
                i50Var.getClass();
                i12 = this.f45497c.d.getHeight() + org.telegram.messenger.g0.L(f10);
                a3 a3Var = this.f45497c;
                a3Var.f43579s = this.f45499f;
                a3Var.f43580w = this.h;
            } else {
                i12 = 0;
            }
            i11 = i12;
            this.f45498e = org.telegram.messenger.g0.L(2.0f) + i11;
            TL_iv.RichText richText2 = this.f45500n.caption;
            i50 i50Var3 = this.f45495a;
            i50Var3.getClass();
            a3 o11 = i4.o(i50Var3, this, null, richText2, size - org.telegram.messenger.g0.L(f11), this.f45498e, this.f45500n, this.f45496b);
            this.d = o11;
            if (o11 != null) {
                i50Var.getClass();
                i11 += this.d.d.getHeight() + org.telegram.messenger.g0.L(f10);
                a3 a3Var2 = this.d;
                a3Var2.f43579s = this.f45499f;
                a3Var2.f43580w = this.f45498e;
            }
            if (i11 != 0) {
                i50Var.getClass();
                i11 += org.telegram.messenger.g0.L(f10);
            }
        } else {
            i11 = 1;
        }
        setMeasuredDimension(size, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!i4.j(this.f45495a, this.f45496b, motionEvent, this, this.f45497c, this.f45499f, this.h)) {
            if (!i4.j(this.f45495a, this.f45496b, motionEvent, this, this.d, this.f45499f, this.f45498e) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockPullquote pageblockpullquote) {
        this.f45500n = pageblockpullquote;
        requestLayout();
    }
}
