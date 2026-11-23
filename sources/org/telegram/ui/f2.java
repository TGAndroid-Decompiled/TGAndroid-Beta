package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class f2 extends View implements org.telegram.ui.Cells.h9, c3 {
    public final p50 f47663a;
    public final e4 f47664b;
    public z2 f47665c;
    public z2 d;
    public int f47666e;
    public int f47667f;
    public int h;
    public TL_iv.pageBlockPullquote f47668n;

    public f2(Context context, p50 p50Var, e4 e4Var) {
        super(context);
        this.f47663a = p50Var;
        this.f47664b = e4Var;
    }

    @Override
    public int getBoundLeft() {
        int i7;
        z2 z2Var = this.f47665c;
        if (z2Var != null) {
            i7 = Math.min(Integer.MAX_VALUE, z2Var.k() + z2Var.f54496s);
        } else {
            i7 = Integer.MAX_VALUE;
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null) {
            i7 = Math.min(i7, z2Var2.k() + z2Var2.f54496s);
        }
        if (i7 == Integer.MAX_VALUE) {
            return -1;
        }
        this.f47663a.getClass();
        return i7 - org.telegram.messenger.g0.L(18);
    }

    @Override
    public int getBoundRight() {
        int i7;
        z2 z2Var = this.f47665c;
        if (z2Var != null) {
            i7 = Math.max(Integer.MIN_VALUE, z2Var.l() + z2Var.f54496s);
        } else {
            i7 = Integer.MIN_VALUE;
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null) {
            i7 = Math.max(i7, z2Var2.l() + z2Var2.f54496s);
        }
        if (i7 == Integer.MIN_VALUE) {
            return -1;
        }
        this.f47663a.getClass();
        return org.telegram.messenger.g0.L(18) + i7;
    }

    @Override
    public int getLastLineBoundRight() {
        int m10;
        int L;
        z2 z2Var = this.d;
        p50 p50Var = this.f47663a;
        if (z2Var != null) {
            m10 = z2Var.m() + z2Var.f54496s;
            p50Var.getClass();
            L = org.telegram.messenger.g0.L(18);
        } else {
            z2 z2Var2 = this.f47665c;
            if (z2Var2 != null) {
                m10 = z2Var2.m() + z2Var2.f54496s;
                p50Var.getClass();
                L = org.telegram.messenger.g0.L(18);
            } else {
                return -1;
            }
        }
        return L + m10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.m10.a(this);
    }

    @Override
    public final void k(ArrayList arrayList) {
        z2 z2Var = this.f47665c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null) {
            arrayList.add(z2Var2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.f47665c;
        if (z2Var != null) {
            z2Var.i(this);
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null) {
            z2Var2.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.f47665c;
        if (z2Var != null) {
            z2Var.f(this);
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null) {
            z2Var2.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f47668n != null) {
            z2 z2Var = this.f47665c;
            p50 p50Var = this.f47663a;
            int i7 = 0;
            if (z2Var != null) {
                canvas.save();
                canvas.translate(this.f47667f, this.h);
                g4.t(p50Var, canvas, this, 0);
                this.f47665c.d(canvas, this);
                canvas.restore();
                i7 = 1;
            }
            if (this.d != null) {
                canvas.save();
                canvas.translate(this.f47667f, this.f47666e);
                g4.t(p50Var, canvas, this, i7);
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
        z2 z2Var = this.f47665c;
        e4 e4Var = this.f47664b;
        p50 p50Var = this.f47663a;
        if (z2Var != null && (h7 = g4.h(p50Var, e4Var, z2Var)) != null) {
            spannableStringBuilder.append(h7);
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null && (h = g4.h(p50Var, e4Var, z2Var2)) != null) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append((CharSequence) ", ");
            }
            spannableStringBuilder.append(h);
        }
        if (spannableStringBuilder.length() == 0) {
            return;
        }
        spannableStringBuilder.append((CharSequence) ", ").append((CharSequence) org.telegram.messenger.gd.N0(2131754858, null));
        accessibilityNodeInfo.setText(spannableStringBuilder);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        int size = View.MeasureSpec.getSize(i7);
        p50 p50Var = this.f47663a;
        p50Var.getClass();
        this.f47667f = org.telegram.messenger.g0.L(18);
        p50Var.getClass();
        float f10 = 8;
        this.h = org.telegram.messenger.g0.L(f10);
        TL_iv.pageBlockPullquote pageblockpullquote = this.f47668n;
        if (pageblockpullquote != null) {
            TL_iv.RichText richText = pageblockpullquote.text;
            p50 p50Var2 = this.f47663a;
            p50Var2.getClass();
            float f11 = 36;
            z2 o4 = g4.o(p50Var2, this, null, richText, size - org.telegram.messenger.g0.L(f11), this.h, this.f47668n, this.f47664b);
            this.f47665c = o4;
            if (o4 != null) {
                p50Var.getClass();
                i12 = this.f47665c.d.getHeight() + org.telegram.messenger.g0.L(f10);
                z2 z2Var = this.f47665c;
                z2Var.f54496s = this.f47667f;
                z2Var.f54497w = this.h;
            } else {
                i12 = 0;
            }
            i11 = i12;
            this.f47666e = org.telegram.messenger.g0.L(2.0f) + i11;
            TL_iv.RichText richText2 = this.f47668n.caption;
            p50 p50Var3 = this.f47663a;
            p50Var3.getClass();
            z2 o10 = g4.o(p50Var3, this, null, richText2, size - org.telegram.messenger.g0.L(f11), this.f47666e, this.f47668n, this.f47664b);
            this.d = o10;
            if (o10 != null) {
                p50Var.getClass();
                i11 += this.d.d.getHeight() + org.telegram.messenger.g0.L(f10);
                z2 z2Var2 = this.d;
                z2Var2.f54496s = this.f47667f;
                z2Var2.f54497w = this.f47666e;
            }
            if (i11 != 0) {
                p50Var.getClass();
                i11 += org.telegram.messenger.g0.L(f10);
            }
        } else {
            i11 = 1;
        }
        setMeasuredDimension(size, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!g4.j(this.f47663a, this.f47664b, motionEvent, this, this.f47665c, this.f47667f, this.h)) {
            if (!g4.j(this.f47663a, this.f47664b, motionEvent, this, this.d, this.f47667f, this.f47666e) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockPullquote pageblockpullquote) {
        this.f47668n = pageblockpullquote;
        requestLayout();
    }
}
