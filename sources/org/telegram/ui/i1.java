package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.tl.TL_iv;
public final class i1 extends FrameLayout implements org.telegram.ui.Cells.g9 {
    public final ci.j1 f46023a;
    public final f1 f46024b;
    public a3 f46025c;
    public a3 d;
    public int f46026e;
    public int f46027f;
    public int h;
    public int f46028n;
    public boolean f46029r;
    public TL_iv.pageBlockCollage f46030s;
    public final h1 f46031w;
    public final g4 f46032x;
    public final i4 f46033y;

    public i1(i4 i4Var, Context context, g4 g4Var) {
        super(context);
        this.f46033y = i4Var;
        this.f46031w = new h1(this);
        this.f46032x = g4Var;
        ci.j1 j1Var = new ci.j1(6, context, this);
        this.f46023a = j1Var;
        j1Var.i(new c1(this));
        d1 d1Var = new d1(this);
        d1Var.O = new e1(this);
        j1Var.setLayoutManager(d1Var);
        f1 f1Var = new f1(this);
        this.f46024b = f1Var;
        j1Var.setAdapter(f1Var);
        addView(j1Var, b8.mf.c(-2.0f, -1));
        setWillNotDraw(false);
    }

    @Override
    public final void k(ArrayList arrayList) {
        a3 a3Var = this.f46025c;
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
        a3 a3Var = this.f46025c;
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
        a3 a3Var = this.f46025c;
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
        if (this.f46030s != null) {
            a3 a3Var = this.f46025c;
            i4 i4Var = this.f46033y;
            int i3 = 0;
            if (a3Var != null) {
                canvas.save();
                canvas.translate(this.f46027f, this.h);
                i4.t(i4Var, canvas, this, 0);
                this.f46025c.d(canvas, this);
                canvas.restore();
                i3 = 1;
            }
            if (this.d != null) {
                canvas.save();
                canvas.translate(this.f46027f, this.h + this.f46028n);
                i4.t(i4Var, canvas, this, i3);
                this.d.d(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(org.telegram.messenger.bd.M0(2131754895, null));
        if (this.f46025c != null) {
            sb2.append(", ");
            sb2.append(this.f46025c.d.getText());
        }
        if (this.d != null) {
            sb2.append(", ");
            sb2.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13 = this.f46026e;
        int L = org.telegram.messenger.g0.L(8.0f);
        int i14 = this.f46026e;
        ci.j1 j1Var = this.f46023a;
        j1Var.layout(i13, L, j1Var.getMeasuredWidth() + i14, org.telegram.messenger.g0.L(8.0f) + j1Var.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        i1 i1Var;
        int L;
        int i11;
        int i12 = 1;
        this.f46029r = true;
        int size = View.MeasureSpec.getSize(i3);
        TL_iv.pageBlockCollage pageblockcollage = this.f46030s;
        if (pageblockcollage != null) {
            int i13 = pageblockcollage.level;
            if (i13 > 0) {
                int L2 = org.telegram.messenger.g0.L(18.0f) + org.telegram.messenger.g0.L(i13 * 14);
                this.f46026e = L2;
                this.f46027f = L2;
                i11 = org.telegram.messenger.camera.q.w(18.0f, L2, size);
                L = i11;
            } else {
                this.f46026e = 0;
                this.f46027f = org.telegram.messenger.g0.L(18.0f);
                L = size - org.telegram.messenger.g0.L(36.0f);
                i11 = size;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            ci.j1 j1Var = this.f46023a;
            j1Var.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredHeight = j1Var.getMeasuredHeight();
            int L3 = org.telegram.messenger.g0.L(8.0f) + measuredHeight;
            this.h = L3;
            TL_iv.pageBlockCollage pageblockcollage2 = this.f46030s;
            TL_iv.RichText richText = pageblockcollage2.caption.text;
            HashSet hashSet = i4.f46056d1;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            i4 i4Var = this.f46033y;
            i1Var = this;
            a3 n4 = i4.n(i4Var, i1Var, null, richText, L, L3, pageblockcollage2, alignment, 0, this.f46032x);
            i1Var.f46025c = n4;
            if (n4 != null) {
                int height = i1Var.f46025c.d.getHeight() + org.telegram.messenger.g0.L(4.0f);
                i1Var.f46028n = height;
                measuredHeight = org.telegram.messenger.k5.C(4.0f, height, measuredHeight);
                a3 a3Var = i1Var.f46025c;
                a3Var.f43579s = i1Var.f46027f;
                a3Var.f43580w = i1Var.h;
            } else {
                i1Var.f46028n = 0;
            }
            TL_iv.pageBlockCollage pageblockcollage3 = i1Var.f46030s;
            TL_iv.RichText richText2 = pageblockcollage3.caption.credit;
            if (i1Var.f46032x.H) {
                alignment = org.telegram.ui.Components.lu0.a();
            }
            a3 n10 = i4.n(i4Var, i1Var, null, richText2, L, 0, pageblockcollage3, alignment, 0, i1Var.f46032x);
            i1Var.d = n10;
            if (n10 != null) {
                measuredHeight += i1Var.d.d.getHeight() + org.telegram.messenger.g0.L(4.0f);
                a3 a3Var2 = i1Var.d;
                a3Var2.f43579s = i1Var.f46027f;
                a3Var2.f43580w = i1Var.h + i1Var.f46028n;
            }
            int L4 = org.telegram.messenger.g0.L(16.0f) + measuredHeight;
            TL_iv.pageBlockCollage pageblockcollage4 = i1Var.f46030s;
            if (pageblockcollage4.level > 0 && !pageblockcollage4.bottom) {
                i12 = org.telegram.messenger.g0.L(8.0f) + L4;
            } else {
                i12 = L4;
            }
        } else {
            i1Var = this;
        }
        setMeasuredDimension(size, i12);
        i1Var.f46029r = false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a3 a3Var = this.f46025c;
        int i3 = this.f46027f;
        int i10 = this.h;
        i4 i4Var = this.f46033y;
        if (!i4.j(i4Var, this.f46032x, motionEvent, this, a3Var, i3, i10)) {
            if (!i4.j(i4Var, this.f46032x, motionEvent, this, this.d, this.f46027f, this.h + this.f46028n) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }
}
