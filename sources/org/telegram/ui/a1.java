package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class a1 extends View implements org.telegram.ui.Cells.g9, d3 {
    public final i50 f43552a;
    public final g4 f43553b;
    public a3 f43554c;
    public a3 d;
    public int f43555e;
    public int f43556f;
    public int h;
    public TL_iv.pageBlockBlockquote f43557n;

    public a1(Context context, i50 i50Var, g4 g4Var) {
        super(context);
        this.f43552a = i50Var;
        this.f43553b = g4Var;
    }

    @Override
    public int getBoundLeft() {
        int i3;
        i50 i50Var = this.f43552a;
        i50Var.getClass();
        float f10 = 18;
        int L = org.telegram.messenger.g0.L(f10);
        a3 a3Var = this.f43554c;
        if (a3Var != null) {
            i3 = Math.min(Integer.MAX_VALUE, (a3Var.k() + a3Var.f43579s) - L);
        } else {
            i3 = Integer.MAX_VALUE;
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            i3 = Math.min(i3, (a3Var2.k() + a3Var2.f43579s) - L);
        }
        if (i3 == Integer.MAX_VALUE) {
            return -1;
        }
        i50Var.getClass();
        return i3 - org.telegram.messenger.g0.L(f10);
    }

    @Override
    public int getBoundRight() {
        int i3;
        i50 i50Var = this.f43552a;
        i50Var.getClass();
        float f10 = 18;
        int L = org.telegram.messenger.g0.L(f10);
        a3 a3Var = this.f43554c;
        if (a3Var != null) {
            i3 = Math.max(Integer.MIN_VALUE, a3Var.l() + a3Var.f43579s + L);
        } else {
            i3 = Integer.MIN_VALUE;
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            i3 = Math.max(i3, a3Var2.l() + a3Var2.f43579s + L);
        }
        if (i3 == Integer.MIN_VALUE) {
            return -1;
        }
        i50Var.getClass();
        return org.telegram.messenger.g0.L(f10) + i3;
    }

    @Override
    public int getLastLineBoundRight() {
        int m10;
        int L;
        a3 a3Var = this.d;
        i50 i50Var = this.f43552a;
        if (a3Var != null) {
            m10 = a3Var.m() + a3Var.f43579s;
            i50Var.getClass();
            L = org.telegram.messenger.g0.L(18);
        } else {
            a3 a3Var2 = this.f43554c;
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
        a3 a3Var = this.f43554c;
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
        a3 a3Var = this.f43554c;
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
        a3 a3Var = this.f43554c;
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
        if (this.f43557n == null) {
            return;
        }
        a3 a3Var = this.f43554c;
        i50 i50Var = this.f43552a;
        int i3 = 0;
        if (a3Var != null) {
            canvas.save();
            canvas.translate(this.f43556f, this.h);
            i4.t(i50Var, canvas, this, 0);
            this.f43554c.d(canvas, this);
            canvas.restore();
            i3 = 1;
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.f43556f, this.f43555e);
            i4.t(i50Var, canvas, this, i3);
            this.d.d(canvas, this);
            canvas.restore();
        }
        g4 g4Var = this.f43553b;
        if (g4Var != null && g4Var.H) {
            int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(20.0f);
            canvas.drawRect(measuredWidth, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(2.0f) + measuredWidth, getMeasuredHeight() - org.telegram.messenger.g0.L(6.0f), i4.f46069s1);
        } else {
            i50Var.getClass();
            i50Var.getClass();
            canvas.drawRect(org.telegram.messenger.g0.L((this.f43557n.level * 14) + 18), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L((this.f43557n.level * 14) + 20), getMeasuredHeight() - org.telegram.messenger.g0.L(6.0f), i4.f46069s1);
        }
        i4.s(canvas, i50Var, this.f43557n, getMeasuredHeight());
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
        a3 a3Var = this.f43554c;
        g4 g4Var = this.f43553b;
        i50 i50Var = this.f43552a;
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
        spannableStringBuilder.append((CharSequence) ", ").append((CharSequence) org.telegram.messenger.bd.M0(2131754873, null));
        accessibilityNodeInfo.setText(spannableStringBuilder);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int i11;
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i3);
        i50 i50Var = this.f43552a;
        i50Var.getClass();
        float f10 = 8;
        this.h = org.telegram.messenger.g0.L(f10);
        if (this.f43557n != null) {
            i50Var.getClass();
            int L = size - org.telegram.messenger.g0.L(50);
            if (this.f43557n.level > 0) {
                L -= org.telegram.messenger.g0.L(i12 * 14);
            }
            int i14 = L;
            TL_iv.pageBlockBlockquote pageblockblockquote = this.f43557n;
            a3 o10 = i4.o(this.f43552a, this, null, pageblockblockquote.text, i14, this.h, pageblockblockquote, this.f43553b);
            this.f43554c = o10;
            if (o10 != null) {
                i50Var.getClass();
                i13 = this.f43554c.d.getHeight() + org.telegram.messenger.g0.L(f10);
            } else {
                i13 = 0;
            }
            i11 = i13;
            int i15 = this.f43557n.level;
            g4 g4Var = this.f43553b;
            if (i15 > 0) {
                if (g4Var != null && g4Var.H) {
                    this.f43556f = org.telegram.messenger.g0.L((i15 * 14) + 14);
                } else {
                    int L2 = org.telegram.messenger.g0.L(i15 * 14);
                    i50Var.getClass();
                    this.f43556f = org.telegram.messenger.g0.L(32) + L2;
                }
            } else if (g4Var != null && g4Var.H) {
                this.f43556f = org.telegram.messenger.g0.L(14.0f);
            } else {
                i50Var.getClass();
                this.f43556f = org.telegram.messenger.g0.L(32);
            }
            i50Var.getClass();
            int L3 = org.telegram.messenger.g0.L(f10) + i11;
            this.f43555e = L3;
            TL_iv.pageBlockBlockquote pageblockblockquote2 = this.f43557n;
            a3 o11 = i4.o(this.f43552a, this, null, pageblockblockquote2.caption, i14, L3, pageblockblockquote2, this.f43553b);
            this.d = o11;
            if (o11 != null) {
                i50Var.getClass();
                i11 += this.d.d.getHeight() + org.telegram.messenger.g0.L(f10);
            }
            if (i11 != 0) {
                i50Var.getClass();
                i11 += org.telegram.messenger.g0.L(f10);
            }
            a3 a3Var = this.f43554c;
            if (a3Var != null) {
                a3Var.f43579s = this.f43556f;
                a3Var.f43580w = this.h;
            }
            a3 a3Var2 = this.d;
            if (a3Var2 != null) {
                a3Var2.f43579s = this.f43556f;
                a3Var2.f43580w = this.f43555e;
            }
        } else {
            i11 = 1;
        }
        setMeasuredDimension(size, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!i4.j(this.f43552a, this.f43553b, motionEvent, this, this.f43554c, this.f43556f, this.h)) {
            if (!i4.j(this.f43552a, this.f43553b, motionEvent, this, this.d, this.f43556f, this.f43555e) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockBlockquote pageblockblockquote) {
        this.f43557n = pageblockblockquote;
        requestLayout();
    }
}
