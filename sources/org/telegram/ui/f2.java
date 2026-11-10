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
    public final r50 f45486a;
    public final e4 f45487b;
    public z2 f45488c;
    public z2 d;
    public int f45489e;
    public int f45490f;
    public int h;
    public TL_iv.pageBlockPullquote f45491n;

    public f2(Context context, r50 r50Var, e4 e4Var) {
        super(context);
        this.f45486a = r50Var;
        this.f45487b = e4Var;
    }

    @Override
    public int getBoundLeft() {
        int i7;
        z2 z2Var = this.f45488c;
        if (z2Var != null) {
            i7 = Math.min(Integer.MAX_VALUE, z2Var.k() + z2Var.f52183s);
        } else {
            i7 = Integer.MAX_VALUE;
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null) {
            i7 = Math.min(i7, z2Var2.k() + z2Var2.f52183s);
        }
        if (i7 == Integer.MAX_VALUE) {
            return -1;
        }
        this.f45486a.getClass();
        return i7 - org.telegram.messenger.g0.L(18);
    }

    @Override
    public int getBoundRight() {
        int i7;
        z2 z2Var = this.f45488c;
        if (z2Var != null) {
            i7 = Math.max(Integer.MIN_VALUE, z2Var.l() + z2Var.f52183s);
        } else {
            i7 = Integer.MIN_VALUE;
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null) {
            i7 = Math.max(i7, z2Var2.l() + z2Var2.f52183s);
        }
        if (i7 == Integer.MIN_VALUE) {
            return -1;
        }
        this.f45486a.getClass();
        return org.telegram.messenger.g0.L(18) + i7;
    }

    @Override
    public int getLastLineBoundRight() {
        int m10;
        int L;
        z2 z2Var = this.d;
        r50 r50Var = this.f45486a;
        if (z2Var != null) {
            m10 = z2Var.m() + z2Var.f52183s;
            r50Var.getClass();
            L = org.telegram.messenger.g0.L(18);
        } else {
            z2 z2Var2 = this.f45488c;
            if (z2Var2 != null) {
                m10 = z2Var2.m() + z2Var2.f52183s;
                r50Var.getClass();
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
        z2 z2Var = this.f45488c;
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
        z2 z2Var = this.f45488c;
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
        z2 z2Var = this.f45488c;
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
        if (this.f45491n != null) {
            z2 z2Var = this.f45488c;
            r50 r50Var = this.f45486a;
            int i7 = 0;
            if (z2Var != null) {
                canvas.save();
                canvas.translate(this.f45490f, this.h);
                g4.t(r50Var, canvas, this, 0);
                this.f45488c.d(canvas, this);
                canvas.restore();
                i7 = 1;
            }
            if (this.d != null) {
                canvas.save();
                canvas.translate(this.f45490f, this.f45489e);
                g4.t(r50Var, canvas, this, i7);
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
        z2 z2Var = this.f45488c;
        e4 e4Var = this.f45487b;
        r50 r50Var = this.f45486a;
        if (z2Var != null && (h7 = g4.h(r50Var, e4Var, z2Var)) != null) {
            spannableStringBuilder.append(h7);
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null && (h = g4.h(r50Var, e4Var, z2Var2)) != null) {
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
        r50 r50Var = this.f45486a;
        r50Var.getClass();
        this.f45490f = org.telegram.messenger.g0.L(18);
        r50Var.getClass();
        float f10 = 8;
        this.h = org.telegram.messenger.g0.L(f10);
        TL_iv.pageBlockPullquote pageblockpullquote = this.f45491n;
        if (pageblockpullquote != null) {
            TL_iv.RichText richText = pageblockpullquote.text;
            r50 r50Var2 = this.f45486a;
            r50Var2.getClass();
            float f11 = 36;
            z2 o4 = g4.o(r50Var2, this, null, richText, size - org.telegram.messenger.g0.L(f11), this.h, this.f45491n, this.f45487b);
            this.f45488c = o4;
            if (o4 != null) {
                r50Var.getClass();
                i12 = this.f45488c.d.getHeight() + org.telegram.messenger.g0.L(f10);
                z2 z2Var = this.f45488c;
                z2Var.f52183s = this.f45490f;
                z2Var.f52184w = this.h;
            } else {
                i12 = 0;
            }
            i11 = i12;
            this.f45489e = org.telegram.messenger.g0.L(2.0f) + i11;
            TL_iv.RichText richText2 = this.f45491n.caption;
            r50 r50Var3 = this.f45486a;
            r50Var3.getClass();
            z2 o10 = g4.o(r50Var3, this, null, richText2, size - org.telegram.messenger.g0.L(f11), this.f45489e, this.f45491n, this.f45487b);
            this.d = o10;
            if (o10 != null) {
                r50Var.getClass();
                i11 += this.d.d.getHeight() + org.telegram.messenger.g0.L(f10);
                z2 z2Var2 = this.d;
                z2Var2.f52183s = this.f45490f;
                z2Var2.f52184w = this.f45489e;
            }
            if (i11 != 0) {
                r50Var.getClass();
                i11 += org.telegram.messenger.g0.L(f10);
            }
        } else {
            i11 = 1;
        }
        setMeasuredDimension(size, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!g4.j(this.f45486a, this.f45487b, motionEvent, this, this.f45488c, this.f45490f, this.h)) {
            if (!g4.j(this.f45486a, this.f45487b, motionEvent, this, this.d, this.f45490f, this.f45489e) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockPullquote pageblockpullquote) {
        this.f45491n = pageblockpullquote;
        requestLayout();
    }
}
