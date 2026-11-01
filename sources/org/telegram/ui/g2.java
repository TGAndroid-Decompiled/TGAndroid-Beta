package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class g2 extends View implements org.telegram.ui.Cells.j9, c3 {
    public final l60 f37273a;
    public final f4 f37274b;
    public z2 f37275c;
    public z2 d;
    public int e;
    public int f37276f;
    public int h;
    public TL_iv.pageBlockPullquote f37277n;

    public g2(Context context, l60 l60Var, f4 f4Var) {
        super(context);
        this.f37273a = l60Var;
        this.f37274b = f4Var;
    }

    @Override
    public int getBoundLeft() {
        int i10;
        z2 z2Var = this.f37275c;
        if (z2Var != null) {
            i10 = Math.min(Integer.MAX_VALUE, z2Var.k() + z2Var.f43793s);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null) {
            i10 = Math.min(i10, z2Var2.k() + z2Var2.f43793s);
        }
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        this.f37273a.getClass();
        return i10 - org.telegram.messenger.i0.L(18);
    }

    @Override
    public int getBoundRight() {
        int i10;
        z2 z2Var = this.f37275c;
        if (z2Var != null) {
            i10 = Math.max(Integer.MIN_VALUE, z2Var.l() + z2Var.f43793s);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null) {
            i10 = Math.max(i10, z2Var2.l() + z2Var2.f43793s);
        }
        if (i10 == Integer.MIN_VALUE) {
            return -1;
        }
        this.f37273a.getClass();
        return org.telegram.messenger.i0.L(18) + i10;
    }

    @Override
    public int getLastLineBoundRight() {
        int m10;
        int L;
        z2 z2Var = this.d;
        l60 l60Var = this.f37273a;
        if (z2Var != null) {
            m10 = z2Var.m() + z2Var.f43793s;
            l60Var.getClass();
            L = org.telegram.messenger.i0.L(18);
        } else {
            z2 z2Var2 = this.f37275c;
            if (z2Var2 != null) {
                m10 = z2Var2.m() + z2Var2.f43793s;
                l60Var.getClass();
                L = org.telegram.messenger.i0.L(18);
            } else {
                return -1;
            }
        }
        return L + m10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.a30.a(this);
    }

    @Override
    public final void h(ArrayList arrayList) {
        z2 z2Var = this.f37275c;
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
        z2 z2Var = this.f37275c;
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
        z2 z2Var = this.f37275c;
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
        if (this.f37277n != null) {
            z2 z2Var = this.f37275c;
            l60 l60Var = this.f37273a;
            int i10 = 0;
            if (z2Var != null) {
                canvas.save();
                canvas.translate(this.f37276f, this.h);
                h4.t(l60Var, canvas, this, 0);
                this.f37275c.d(canvas, this);
                canvas.restore();
                i10 = 1;
            }
            if (this.d != null) {
                canvas.save();
                canvas.translate(this.f37276f, this.e);
                h4.t(l60Var, canvas, this, i10);
                this.d.d(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence h;
        CharSequence h10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        z2 z2Var = this.f37275c;
        f4 f4Var = this.f37274b;
        l60 l60Var = this.f37273a;
        if (z2Var != null && (h10 = h4.h(l60Var, f4Var, z2Var)) != null) {
            spannableStringBuilder.append(h10);
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null && (h = h4.h(l60Var, f4Var, z2Var2)) != null) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append((CharSequence) ", ");
            }
            spannableStringBuilder.append(h);
        }
        if (spannableStringBuilder.length() == 0) {
            return;
        }
        spannableStringBuilder.append((CharSequence) ", ").append((CharSequence) org.telegram.messenger.dd.L0(2131754859, null));
        accessibilityNodeInfo.setText(spannableStringBuilder);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i10);
        l60 l60Var = this.f37273a;
        l60Var.getClass();
        this.f37276f = org.telegram.messenger.i0.L(18);
        l60Var.getClass();
        float f7 = 8;
        this.h = org.telegram.messenger.i0.L(f7);
        TL_iv.pageBlockPullquote pageblockpullquote = this.f37277n;
        if (pageblockpullquote != null) {
            TL_iv.RichText richText = pageblockpullquote.text;
            l60 l60Var2 = this.f37273a;
            l60Var2.getClass();
            float f10 = 36;
            z2 o10 = h4.o(l60Var2, this, null, richText, size - org.telegram.messenger.i0.L(f10), this.h, this.f37277n, this.f37274b);
            this.f37275c = o10;
            if (o10 != null) {
                l60Var.getClass();
                i13 = this.f37275c.d.getHeight() + org.telegram.messenger.i0.L(f7);
                z2 z2Var = this.f37275c;
                z2Var.f43793s = this.f37276f;
                z2Var.f43794w = this.h;
            } else {
                i13 = 0;
            }
            i12 = i13;
            this.e = org.telegram.messenger.i0.L(2.0f) + i12;
            TL_iv.RichText richText2 = this.f37277n.caption;
            l60 l60Var3 = this.f37273a;
            l60Var3.getClass();
            z2 o11 = h4.o(l60Var3, this, null, richText2, size - org.telegram.messenger.i0.L(f10), this.e, this.f37277n, this.f37274b);
            this.d = o11;
            if (o11 != null) {
                l60Var.getClass();
                i12 += this.d.d.getHeight() + org.telegram.messenger.i0.L(f7);
                z2 z2Var2 = this.d;
                z2Var2.f43793s = this.f37276f;
                z2Var2.f43794w = this.e;
            }
            if (i12 != 0) {
                l60Var.getClass();
                i12 += org.telegram.messenger.i0.L(f7);
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!h4.j(this.f37273a, this.f37274b, motionEvent, this, this.f37275c, this.f37276f, this.h)) {
            if (!h4.j(this.f37273a, this.f37274b, motionEvent, this, this.d, this.f37276f, this.e) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockPullquote pageblockpullquote) {
        this.f37277n = pageblockpullquote;
        requestLayout();
    }
}
