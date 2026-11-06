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
public final class h1 extends FrameLayout implements org.telegram.ui.Cells.h9 {
    public final bi.q1 f46181a;
    public final e1 f46182b;
    public z2 f46183c;
    public z2 d;
    public int f46184e;
    public int f46185f;
    public int h;
    public int f46186n;
    public boolean f46187r;
    public TL_iv.pageBlockCollage f46188s;
    public final g1 f46189w;
    public final e4 f46190x;
    public final g4 f46191y;

    public h1(g4 g4Var, Context context, e4 e4Var) {
        super(context);
        this.f46191y = g4Var;
        this.f46189w = new g1(this);
        this.f46190x = e4Var;
        bi.q1 q1Var = new bi.q1(6, context, this);
        this.f46181a = q1Var;
        q1Var.i(new b1(this));
        c1 c1Var = new c1(this);
        c1Var.O = new d1(this);
        q1Var.setLayoutManager(c1Var);
        e1 e1Var = new e1(this);
        this.f46182b = e1Var;
        q1Var.setAdapter(e1Var);
        addView(q1Var, c8.ha.c(-2.0f, -1));
        setWillNotDraw(false);
    }

    @Override
    public final void k(ArrayList arrayList) {
        z2 z2Var = this.f46183c;
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
        z2 z2Var = this.f46183c;
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
        z2 z2Var = this.f46183c;
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
        if (this.f46188s != null) {
            z2 z2Var = this.f46183c;
            g4 g4Var = this.f46191y;
            int i7 = 0;
            if (z2Var != null) {
                canvas.save();
                canvas.translate(this.f46185f, this.h);
                g4.t(g4Var, canvas, this, 0);
                this.f46183c.d(canvas, this);
                canvas.restore();
                i7 = 1;
            }
            if (this.d != null) {
                canvas.save();
                canvas.translate(this.f46185f, this.h + this.f46186n);
                g4.t(g4Var, canvas, this, i7);
                this.d.d(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(org.telegram.messenger.hd.M0(2131754895, null));
        if (this.f46183c != null) {
            sb2.append(", ");
            sb2.append(this.f46183c.d.getText());
        }
        if (this.d != null) {
            sb2.append(", ");
            sb2.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13 = this.f46184e;
        int L = org.telegram.messenger.g0.L(8.0f);
        int i14 = this.f46184e;
        bi.q1 q1Var = this.f46181a;
        q1Var.layout(i13, L, q1Var.getMeasuredWidth() + i14, org.telegram.messenger.g0.L(8.0f) + q1Var.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        h1 h1Var;
        int L;
        int i11;
        int i12 = 1;
        this.f46187r = true;
        int size = View.MeasureSpec.getSize(i7);
        TL_iv.pageBlockCollage pageblockcollage = this.f46188s;
        if (pageblockcollage != null) {
            int i13 = pageblockcollage.level;
            if (i13 > 0) {
                int L2 = org.telegram.messenger.g0.L(18.0f) + org.telegram.messenger.g0.L(i13 * 14);
                this.f46184e = L2;
                this.f46185f = L2;
                i11 = org.telegram.messenger.camera.q.w(18.0f, L2, size);
                L = i11;
            } else {
                this.f46184e = 0;
                this.f46185f = org.telegram.messenger.g0.L(18.0f);
                L = size - org.telegram.messenger.g0.L(36.0f);
                i11 = size;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            bi.q1 q1Var = this.f46181a;
            q1Var.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredHeight = q1Var.getMeasuredHeight();
            int L3 = org.telegram.messenger.g0.L(8.0f) + measuredHeight;
            this.h = L3;
            TL_iv.pageBlockCollage pageblockcollage2 = this.f46188s;
            TL_iv.RichText richText = pageblockcollage2.caption.text;
            HashSet hashSet = g4.f45800c1;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            g4 g4Var = this.f46191y;
            h1Var = this;
            z2 n10 = g4.n(g4Var, h1Var, null, richText, L, L3, pageblockcollage2, alignment, 0, this.f46190x);
            h1Var.f46183c = n10;
            if (n10 != null) {
                int height = h1Var.f46183c.d.getHeight() + org.telegram.messenger.g0.L(4.0f);
                h1Var.f46186n = height;
                measuredHeight = org.telegram.messenger.k5.C(4.0f, height, measuredHeight);
                z2 z2Var = h1Var.f46183c;
                z2Var.f52443s = h1Var.f46185f;
                z2Var.f52444w = h1Var.h;
            } else {
                h1Var.f46186n = 0;
            }
            TL_iv.pageBlockCollage pageblockcollage3 = h1Var.f46188s;
            TL_iv.RichText richText2 = pageblockcollage3.caption.credit;
            if (h1Var.f46190x.G) {
                alignment = org.telegram.ui.Components.mu0.a();
            }
            z2 n11 = g4.n(g4Var, h1Var, null, richText2, L, 0, pageblockcollage3, alignment, 0, h1Var.f46190x);
            h1Var.d = n11;
            if (n11 != null) {
                measuredHeight += h1Var.d.d.getHeight() + org.telegram.messenger.g0.L(4.0f);
                z2 z2Var2 = h1Var.d;
                z2Var2.f52443s = h1Var.f46185f;
                z2Var2.f52444w = h1Var.h + h1Var.f46186n;
            }
            int L4 = org.telegram.messenger.g0.L(16.0f) + measuredHeight;
            TL_iv.pageBlockCollage pageblockcollage4 = h1Var.f46188s;
            if (pageblockcollage4.level > 0 && !pageblockcollage4.bottom) {
                i12 = org.telegram.messenger.g0.L(8.0f) + L4;
            } else {
                i12 = L4;
            }
        } else {
            h1Var = this;
        }
        setMeasuredDimension(size, i12);
        h1Var.f46187r = false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        z2 z2Var = this.f46183c;
        int i7 = this.f46185f;
        int i10 = this.h;
        g4 g4Var = this.f46191y;
        if (!g4.j(g4Var, this.f46190x, motionEvent, this, z2Var, i7, i10)) {
            if (!g4.j(g4Var, this.f46190x, motionEvent, this, this.d, this.f46185f, this.h + this.f46186n) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }
}
