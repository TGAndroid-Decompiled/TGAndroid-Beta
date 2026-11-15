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
public final class h1 extends FrameLayout implements org.telegram.ui.Cells.g9 {
    public final di.c1 f47571a;
    public final e1 f47572b;
    public z2 f47573c;
    public z2 d;
    public int f47574e;
    public int f47575f;
    public int h;
    public int f47576n;
    public boolean f47577r;
    public TL_iv.pageBlockCollage f47578s;
    public final g1 f47579w;
    public final e4 f47580x;
    public final g4 f47581y;

    public h1(g4 g4Var, Context context, e4 e4Var) {
        super(context);
        this.f47581y = g4Var;
        this.f47579w = new g1(this);
        this.f47580x = e4Var;
        di.c1 c1Var = new di.c1(6, context, this);
        this.f47571a = c1Var;
        c1Var.i(new b1(this));
        c1 c1Var2 = new c1(this);
        c1Var2.O = new d1(this);
        c1Var.setLayoutManager(c1Var2);
        e1 e1Var = new e1(this);
        this.f47572b = e1Var;
        c1Var.setAdapter(e1Var);
        addView(c1Var, c8.ja.c(-2.0f, -1));
        setWillNotDraw(false);
    }

    @Override
    public final void k(ArrayList arrayList) {
        z2 z2Var = this.f47573c;
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
        z2 z2Var = this.f47573c;
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
        z2 z2Var = this.f47573c;
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
        if (this.f47578s != null) {
            z2 z2Var = this.f47573c;
            g4 g4Var = this.f47581y;
            int i7 = 0;
            if (z2Var != null) {
                canvas.save();
                canvas.translate(this.f47575f, this.h);
                g4.t(g4Var, canvas, this, 0);
                this.f47573c.d(canvas, this);
                canvas.restore();
                i7 = 1;
            }
            if (this.d != null) {
                canvas.save();
                canvas.translate(this.f47575f, this.h + this.f47576n);
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
        if (this.f47573c != null) {
            sb2.append(", ");
            sb2.append(this.f47573c.d.getText());
        }
        if (this.d != null) {
            sb2.append(", ");
            sb2.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13 = this.f47574e;
        int L = org.telegram.messenger.g0.L(8.0f);
        int i14 = this.f47574e;
        di.c1 c1Var = this.f47571a;
        c1Var.layout(i13, L, c1Var.getMeasuredWidth() + i14, org.telegram.messenger.g0.L(8.0f) + c1Var.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        h1 h1Var;
        int L;
        int i11;
        int i12 = 1;
        this.f47577r = true;
        int size = View.MeasureSpec.getSize(i7);
        TL_iv.pageBlockCollage pageblockcollage = this.f47578s;
        if (pageblockcollage != null) {
            int i13 = pageblockcollage.level;
            if (i13 > 0) {
                int L2 = org.telegram.messenger.g0.L(18.0f) + org.telegram.messenger.g0.L(i13 * 14);
                this.f47574e = L2;
                this.f47575f = L2;
                i11 = org.telegram.messenger.i20.w(18.0f, L2, size);
                L = i11;
            } else {
                this.f47574e = 0;
                this.f47575f = org.telegram.messenger.g0.L(18.0f);
                L = size - org.telegram.messenger.g0.L(36.0f);
                i11 = size;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            di.c1 c1Var = this.f47571a;
            c1Var.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredHeight = c1Var.getMeasuredHeight();
            int L3 = org.telegram.messenger.g0.L(8.0f) + measuredHeight;
            this.h = L3;
            TL_iv.pageBlockCollage pageblockcollage2 = this.f47578s;
            TL_iv.RichText richText = pageblockcollage2.caption.text;
            HashSet hashSet = g4.f47292d1;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            g4 g4Var = this.f47581y;
            h1Var = this;
            z2 n10 = g4.n(g4Var, h1Var, null, richText, L, L3, pageblockcollage2, alignment, 0, this.f47580x);
            h1Var.f47573c = n10;
            if (n10 != null) {
                int height = h1Var.f47573c.d.getHeight() + org.telegram.messenger.g0.L(4.0f);
                h1Var.f47576n = height;
                measuredHeight = org.telegram.messenger.k5.C(4.0f, height, measuredHeight);
                z2 z2Var = h1Var.f47573c;
                z2Var.f53812s = h1Var.f47575f;
                z2Var.f53813w = h1Var.h;
            } else {
                h1Var.f47576n = 0;
            }
            TL_iv.pageBlockCollage pageblockcollage3 = h1Var.f47578s;
            TL_iv.RichText richText2 = pageblockcollage3.caption.credit;
            if (h1Var.f47580x.H) {
                alignment = org.telegram.ui.Components.ou0.a();
            }
            z2 n11 = g4.n(g4Var, h1Var, null, richText2, L, 0, pageblockcollage3, alignment, 0, h1Var.f47580x);
            h1Var.d = n11;
            if (n11 != null) {
                measuredHeight += h1Var.d.d.getHeight() + org.telegram.messenger.g0.L(4.0f);
                z2 z2Var2 = h1Var.d;
                z2Var2.f53812s = h1Var.f47575f;
                z2Var2.f53813w = h1Var.h + h1Var.f47576n;
            }
            int L4 = org.telegram.messenger.g0.L(16.0f) + measuredHeight;
            TL_iv.pageBlockCollage pageblockcollage4 = h1Var.f47578s;
            if (pageblockcollage4.level > 0 && !pageblockcollage4.bottom) {
                i12 = org.telegram.messenger.g0.L(8.0f) + L4;
            } else {
                i12 = L4;
            }
        } else {
            h1Var = this;
        }
        setMeasuredDimension(size, i12);
        h1Var.f47577r = false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        z2 z2Var = this.f47573c;
        int i7 = this.f47575f;
        int i10 = this.h;
        g4 g4Var = this.f47581y;
        if (!g4.j(g4Var, this.f47580x, motionEvent, this, z2Var, i7, i10)) {
            if (!g4.j(g4Var, this.f47580x, motionEvent, this, this.d, this.f47575f, this.h + this.f47576n) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }
}
