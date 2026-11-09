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
    public final q50 f45560a;
    public final e4 f45561b;
    public z2 f45562c;
    public z2 d;
    public int f45563e;
    public int f45564f;
    public int h;
    public TL_iv.pageBlockPullquote f45565n;

    public f2(Context context, q50 q50Var, e4 e4Var) {
        super(context);
        this.f45560a = q50Var;
        this.f45561b = e4Var;
    }

    @Override
    public int getBoundLeft() {
        int i7;
        z2 z2Var = this.f45562c;
        if (z2Var != null) {
            i7 = Math.min(Integer.MAX_VALUE, z2Var.k() + z2Var.f52397s);
        } else {
            i7 = Integer.MAX_VALUE;
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null) {
            i7 = Math.min(i7, z2Var2.k() + z2Var2.f52397s);
        }
        if (i7 == Integer.MAX_VALUE) {
            return -1;
        }
        this.f45560a.getClass();
        return i7 - org.telegram.messenger.g0.L(18);
    }

    @Override
    public int getBoundRight() {
        int i7;
        z2 z2Var = this.f45562c;
        if (z2Var != null) {
            i7 = Math.max(Integer.MIN_VALUE, z2Var.l() + z2Var.f52397s);
        } else {
            i7 = Integer.MIN_VALUE;
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null) {
            i7 = Math.max(i7, z2Var2.l() + z2Var2.f52397s);
        }
        if (i7 == Integer.MIN_VALUE) {
            return -1;
        }
        this.f45560a.getClass();
        return org.telegram.messenger.g0.L(18) + i7;
    }

    @Override
    public int getLastLineBoundRight() {
        int m10;
        int L;
        z2 z2Var = this.d;
        q50 q50Var = this.f45560a;
        if (z2Var != null) {
            m10 = z2Var.m() + z2Var.f52397s;
            q50Var.getClass();
            L = org.telegram.messenger.g0.L(18);
        } else {
            z2 z2Var2 = this.f45562c;
            if (z2Var2 != null) {
                m10 = z2Var2.m() + z2Var2.f52397s;
                q50Var.getClass();
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
        z2 z2Var = this.f45562c;
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
        z2 z2Var = this.f45562c;
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
        z2 z2Var = this.f45562c;
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
        if (this.f45565n != null) {
            z2 z2Var = this.f45562c;
            q50 q50Var = this.f45560a;
            int i7 = 0;
            if (z2Var != null) {
                canvas.save();
                canvas.translate(this.f45564f, this.h);
                g4.t(q50Var, canvas, this, 0);
                this.f45562c.d(canvas, this);
                canvas.restore();
                i7 = 1;
            }
            if (this.d != null) {
                canvas.save();
                canvas.translate(this.f45564f, this.f45563e);
                g4.t(q50Var, canvas, this, i7);
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
        z2 z2Var = this.f45562c;
        e4 e4Var = this.f45561b;
        q50 q50Var = this.f45560a;
        if (z2Var != null && (h7 = g4.h(q50Var, e4Var, z2Var)) != null) {
            spannableStringBuilder.append(h7);
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null && (h = g4.h(q50Var, e4Var, z2Var2)) != null) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append((CharSequence) ", ");
            }
            spannableStringBuilder.append(h);
        }
        if (spannableStringBuilder.length() == 0) {
            return;
        }
        spannableStringBuilder.append((CharSequence) ", ").append((CharSequence) org.telegram.messenger.id.M0(2131754859, null));
        accessibilityNodeInfo.setText(spannableStringBuilder);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        int size = View.MeasureSpec.getSize(i7);
        q50 q50Var = this.f45560a;
        q50Var.getClass();
        this.f45564f = org.telegram.messenger.g0.L(18);
        q50Var.getClass();
        float f10 = 8;
        this.h = org.telegram.messenger.g0.L(f10);
        TL_iv.pageBlockPullquote pageblockpullquote = this.f45565n;
        if (pageblockpullquote != null) {
            TL_iv.RichText richText = pageblockpullquote.text;
            q50 q50Var2 = this.f45560a;
            q50Var2.getClass();
            float f11 = 36;
            z2 o4 = g4.o(q50Var2, this, null, richText, size - org.telegram.messenger.g0.L(f11), this.h, this.f45565n, this.f45561b);
            this.f45562c = o4;
            if (o4 != null) {
                q50Var.getClass();
                i12 = this.f45562c.d.getHeight() + org.telegram.messenger.g0.L(f10);
                z2 z2Var = this.f45562c;
                z2Var.f52397s = this.f45564f;
                z2Var.f52398w = this.h;
            } else {
                i12 = 0;
            }
            i11 = i12;
            this.f45563e = org.telegram.messenger.g0.L(2.0f) + i11;
            TL_iv.RichText richText2 = this.f45565n.caption;
            q50 q50Var3 = this.f45560a;
            q50Var3.getClass();
            z2 o10 = g4.o(q50Var3, this, null, richText2, size - org.telegram.messenger.g0.L(f11), this.f45563e, this.f45565n, this.f45561b);
            this.d = o10;
            if (o10 != null) {
                q50Var.getClass();
                i11 += this.d.d.getHeight() + org.telegram.messenger.g0.L(f10);
                z2 z2Var2 = this.d;
                z2Var2.f52397s = this.f45564f;
                z2Var2.f52398w = this.f45563e;
            }
            if (i11 != 0) {
                q50Var.getClass();
                i11 += org.telegram.messenger.g0.L(f10);
            }
        } else {
            i11 = 1;
        }
        setMeasuredDimension(size, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!g4.j(this.f45560a, this.f45561b, motionEvent, this, this.f45562c, this.f45564f, this.h)) {
            if (!g4.j(this.f45560a, this.f45561b, motionEvent, this, this.d, this.f45564f, this.f45563e) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockPullquote pageblockpullquote) {
        this.f45565n = pageblockpullquote;
        requestLayout();
    }
}
