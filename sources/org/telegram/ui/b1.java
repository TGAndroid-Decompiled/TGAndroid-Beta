package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class b1 extends View implements org.telegram.ui.Cells.j9, c3 {
    public final m60 f35927a;
    public final f4 f35928b;
    public z2 f35929c;
    public z2 d;
    public int e;
    public int f35930f;
    public int h;
    public TL_iv.pageBlockBlockquote f35931n;

    public b1(Context context, m60 m60Var, f4 f4Var) {
        super(context);
        this.f35927a = m60Var;
        this.f35928b = f4Var;
    }

    @Override
    public int getBoundLeft() {
        int i10;
        m60 m60Var = this.f35927a;
        m60Var.getClass();
        float f7 = 18;
        int L = org.telegram.messenger.i0.L(f7);
        z2 z2Var = this.f35929c;
        if (z2Var != null) {
            i10 = Math.min(Integer.MAX_VALUE, (z2Var.k() + z2Var.f43990s) - L);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null) {
            i10 = Math.min(i10, (z2Var2.k() + z2Var2.f43990s) - L);
        }
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        m60Var.getClass();
        return i10 - org.telegram.messenger.i0.L(f7);
    }

    @Override
    public int getBoundRight() {
        int i10;
        m60 m60Var = this.f35927a;
        m60Var.getClass();
        float f7 = 18;
        int L = org.telegram.messenger.i0.L(f7);
        z2 z2Var = this.f35929c;
        if (z2Var != null) {
            i10 = Math.max(Integer.MIN_VALUE, z2Var.l() + z2Var.f43990s + L);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null) {
            i10 = Math.max(i10, z2Var2.l() + z2Var2.f43990s + L);
        }
        if (i10 == Integer.MIN_VALUE) {
            return -1;
        }
        m60Var.getClass();
        return org.telegram.messenger.i0.L(f7) + i10;
    }

    @Override
    public int getLastLineBoundRight() {
        int m10;
        int L;
        z2 z2Var = this.d;
        m60 m60Var = this.f35927a;
        if (z2Var != null) {
            m10 = z2Var.m() + z2Var.f43990s;
            m60Var.getClass();
            L = org.telegram.messenger.i0.L(18);
        } else {
            z2 z2Var2 = this.f35929c;
            if (z2Var2 != null) {
                m10 = z2Var2.m() + z2Var2.f43990s;
                m60Var.getClass();
                L = org.telegram.messenger.i0.L(18);
            } else {
                return -1;
            }
        }
        return L + m10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.z20.a(this);
    }

    @Override
    public final void h(ArrayList arrayList) {
        z2 z2Var = this.f35929c;
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
        z2 z2Var = this.f35929c;
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
        z2 z2Var = this.f35929c;
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
        if (this.f35931n == null) {
            return;
        }
        z2 z2Var = this.f35929c;
        m60 m60Var = this.f35927a;
        int i10 = 0;
        if (z2Var != null) {
            canvas.save();
            canvas.translate(this.f35930f, this.h);
            h4.t(m60Var, canvas, this, 0);
            this.f35929c.d(canvas, this);
            canvas.restore();
            i10 = 1;
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.f35930f, this.e);
            h4.t(m60Var, canvas, this, i10);
            this.d.d(canvas, this);
            canvas.restore();
        }
        f4 f4Var = this.f35928b;
        if (f4Var != null && f4Var.G) {
            int measuredWidth = getMeasuredWidth() - org.telegram.messenger.i0.L(20.0f);
            canvas.drawRect(measuredWidth, org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(2.0f) + measuredWidth, getMeasuredHeight() - org.telegram.messenger.i0.L(6.0f), h4.f37716r1);
        } else {
            m60Var.getClass();
            m60Var.getClass();
            canvas.drawRect(org.telegram.messenger.i0.L((this.f35931n.level * 14) + 18), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L((this.f35931n.level * 14) + 20), getMeasuredHeight() - org.telegram.messenger.i0.L(6.0f), h4.f37716r1);
        }
        h4.s(canvas, m60Var, this.f35931n, getMeasuredHeight());
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
        z2 z2Var = this.f35929c;
        f4 f4Var = this.f35928b;
        m60 m60Var = this.f35927a;
        if (z2Var != null && (h10 = h4.h(m60Var, f4Var, z2Var)) != null) {
            spannableStringBuilder.append(h10);
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null && (h = h4.h(m60Var, f4Var, z2Var2)) != null) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append((CharSequence) ", ");
            }
            spannableStringBuilder.append(h);
        }
        if (spannableStringBuilder.length() == 0) {
            return;
        }
        spannableStringBuilder.append((CharSequence) ", ").append((CharSequence) org.telegram.messenger.cd.L0(2131754873, null));
        accessibilityNodeInfo.setText(spannableStringBuilder);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int size = View.MeasureSpec.getSize(i10);
        m60 m60Var = this.f35927a;
        m60Var.getClass();
        float f7 = 8;
        this.h = org.telegram.messenger.i0.L(f7);
        if (this.f35931n != null) {
            m60Var.getClass();
            int L = size - org.telegram.messenger.i0.L(50);
            if (this.f35931n.level > 0) {
                L -= org.telegram.messenger.i0.L(i13 * 14);
            }
            int i15 = L;
            TL_iv.pageBlockBlockquote pageblockblockquote = this.f35931n;
            z2 o10 = h4.o(this.f35927a, this, null, pageblockblockquote.text, i15, this.h, pageblockblockquote, this.f35928b);
            this.f35929c = o10;
            if (o10 != null) {
                m60Var.getClass();
                i14 = this.f35929c.d.getHeight() + org.telegram.messenger.i0.L(f7);
            } else {
                i14 = 0;
            }
            i12 = i14;
            int i16 = this.f35931n.level;
            f4 f4Var = this.f35928b;
            if (i16 > 0) {
                if (f4Var != null && f4Var.G) {
                    this.f35930f = org.telegram.messenger.i0.L((i16 * 14) + 14);
                } else {
                    int L2 = org.telegram.messenger.i0.L(i16 * 14);
                    m60Var.getClass();
                    this.f35930f = org.telegram.messenger.i0.L(32) + L2;
                }
            } else if (f4Var != null && f4Var.G) {
                this.f35930f = org.telegram.messenger.i0.L(14.0f);
            } else {
                m60Var.getClass();
                this.f35930f = org.telegram.messenger.i0.L(32);
            }
            m60Var.getClass();
            int L3 = org.telegram.messenger.i0.L(f7) + i12;
            this.e = L3;
            TL_iv.pageBlockBlockquote pageblockblockquote2 = this.f35931n;
            z2 o11 = h4.o(this.f35927a, this, null, pageblockblockquote2.caption, i15, L3, pageblockblockquote2, this.f35928b);
            this.d = o11;
            if (o11 != null) {
                m60Var.getClass();
                i12 += this.d.d.getHeight() + org.telegram.messenger.i0.L(f7);
            }
            if (i12 != 0) {
                m60Var.getClass();
                i12 += org.telegram.messenger.i0.L(f7);
            }
            z2 z2Var = this.f35929c;
            if (z2Var != null) {
                z2Var.f43990s = this.f35930f;
                z2Var.f43991w = this.h;
            }
            z2 z2Var2 = this.d;
            if (z2Var2 != null) {
                z2Var2.f43990s = this.f35930f;
                z2Var2.f43991w = this.e;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!h4.j(this.f35927a, this.f35928b, motionEvent, this, this.f35929c, this.f35930f, this.h)) {
            if (!h4.j(this.f35927a, this.f35928b, motionEvent, this, this.d, this.f35930f, this.e) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockBlockquote pageblockblockquote) {
        this.f35931n = pageblockblockquote;
        requestLayout();
    }
}
