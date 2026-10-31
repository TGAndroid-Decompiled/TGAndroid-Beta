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
public final class j1 extends FrameLayout implements org.telegram.ui.Cells.j9 {
    public final ag.b1 f38404a;
    public final g1 f38405b;
    public z2 f38406c;
    public z2 d;
    public int e;
    public int f38407f;
    public int h;
    public int f38408n;
    public boolean f38409r;
    public TL_iv.pageBlockCollage f38410s;
    public final i1 f38411w;
    public final f4 f38412x;
    public final h4 f38413y;

    public j1(h4 h4Var, Context context, f4 f4Var) {
        super(context);
        this.f38413y = h4Var;
        this.f38411w = new i1(this);
        this.f38412x = f4Var;
        ag.b1 b1Var = new ag.b1(this, context, 1);
        this.f38404a = b1Var;
        b1Var.i(new d1(this));
        e1 e1Var = new e1(this);
        e1Var.O = new f1(this);
        b1Var.setLayoutManager(e1Var);
        g1 g1Var = new g1(this);
        this.f38405b = g1Var;
        b1Var.setAdapter(g1Var);
        addView(b1Var, w7.b6.c(-2.0f, -1));
        setWillNotDraw(false);
    }

    @Override
    public final void h(ArrayList arrayList) {
        z2 z2Var = this.f38406c;
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
        z2 z2Var = this.f38406c;
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
        z2 z2Var = this.f38406c;
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
        if (this.f38410s != null) {
            z2 z2Var = this.f38406c;
            h4 h4Var = this.f38413y;
            int i10 = 0;
            if (z2Var != null) {
                canvas.save();
                canvas.translate(this.f38407f, this.h);
                h4.t(h4Var, canvas, this, 0);
                this.f38406c.d(canvas, this);
                canvas.restore();
                i10 = 1;
            }
            if (this.d != null) {
                canvas.save();
                canvas.translate(this.f38407f, this.h + this.f38408n);
                h4.t(h4Var, canvas, this, i10);
                this.d.d(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(org.telegram.messenger.cd.L0(2131754895, null));
        if (this.f38406c != null) {
            sb2.append(", ");
            sb2.append(this.f38406c.d.getText());
        }
        if (this.d != null) {
            sb2.append(", ");
            sb2.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = this.e;
        int L = org.telegram.messenger.i0.L(8.0f);
        int i15 = this.e;
        ag.b1 b1Var = this.f38404a;
        b1Var.layout(i14, L, b1Var.getMeasuredWidth() + i15, org.telegram.messenger.i0.L(8.0f) + b1Var.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        j1 j1Var;
        int L;
        int i12;
        int i13 = 1;
        this.f38409r = true;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockCollage pageblockcollage = this.f38410s;
        if (pageblockcollage != null) {
            int i14 = pageblockcollage.level;
            if (i14 > 0) {
                int L2 = org.telegram.messenger.i0.L(18.0f) + org.telegram.messenger.i0.L(i14 * 14);
                this.e = L2;
                this.f38407f = L2;
                i12 = org.telegram.messenger.z20.w(18.0f, L2, size);
                L = i12;
            } else {
                this.e = 0;
                this.f38407f = org.telegram.messenger.i0.L(18.0f);
                L = size - org.telegram.messenger.i0.L(36.0f);
                i12 = size;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            ag.b1 b1Var = this.f38404a;
            b1Var.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredHeight = b1Var.getMeasuredHeight();
            int L3 = org.telegram.messenger.i0.L(8.0f) + measuredHeight;
            this.h = L3;
            TL_iv.pageBlockCollage pageblockcollage2 = this.f38410s;
            TL_iv.RichText richText = pageblockcollage2.caption.text;
            HashSet hashSet = h4.f37702c1;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            h4 h4Var = this.f38413y;
            j1Var = this;
            z2 n10 = h4.n(h4Var, j1Var, null, richText, L, L3, pageblockcollage2, alignment, 0, this.f38412x);
            j1Var.f38406c = n10;
            if (n10 != null) {
                int height = j1Var.f38406c.d.getHeight() + org.telegram.messenger.i0.L(4.0f);
                j1Var.f38408n = height;
                measuredHeight = org.telegram.messenger.m5.C(4.0f, height, measuredHeight);
                z2 z2Var = j1Var.f38406c;
                z2Var.f43990s = j1Var.f38407f;
                z2Var.f43991w = j1Var.h;
            } else {
                j1Var.f38408n = 0;
            }
            TL_iv.pageBlockCollage pageblockcollage3 = j1Var.f38410s;
            TL_iv.RichText richText2 = pageblockcollage3.caption.credit;
            if (j1Var.f38412x.G) {
                alignment = org.telegram.ui.Components.ov0.a();
            }
            z2 n11 = h4.n(h4Var, j1Var, null, richText2, L, 0, pageblockcollage3, alignment, 0, j1Var.f38412x);
            j1Var.d = n11;
            if (n11 != null) {
                measuredHeight += j1Var.d.d.getHeight() + org.telegram.messenger.i0.L(4.0f);
                z2 z2Var2 = j1Var.d;
                z2Var2.f43990s = j1Var.f38407f;
                z2Var2.f43991w = j1Var.h + j1Var.f38408n;
            }
            int L4 = org.telegram.messenger.i0.L(16.0f) + measuredHeight;
            TL_iv.pageBlockCollage pageblockcollage4 = j1Var.f38410s;
            if (pageblockcollage4.level > 0 && !pageblockcollage4.bottom) {
                i13 = org.telegram.messenger.i0.L(8.0f) + L4;
            } else {
                i13 = L4;
            }
        } else {
            j1Var = this;
        }
        setMeasuredDimension(size, i13);
        j1Var.f38409r = false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        z2 z2Var = this.f38406c;
        int i10 = this.f38407f;
        int i11 = this.h;
        h4 h4Var = this.f38413y;
        if (!h4.j(h4Var, this.f38412x, motionEvent, this, z2Var, i10, i11)) {
            if (!h4.j(h4Var, this.f38412x, motionEvent, this, this.d, this.f38407f, this.h + this.f38408n) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }
}
