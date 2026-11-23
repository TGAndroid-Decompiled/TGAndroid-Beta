package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.tl.TL_iv;
public final class o2 extends FrameLayout implements org.telegram.ui.Cells.h9, org.telegram.ui.ActionBar.c6 {
    public final g4 E;
    public int f50479a;
    public final j2 f50480b;
    public final m2 f50481c;
    public final n2 d;
    public TL_iv.pageBlockSlideshow f50482e;
    public z2 f50483f;
    public z2 h;
    public final int f50484n;
    public int f50485r;
    public int f50486s;
    public float f50487w;
    public int f50488x;
    public final e4 f50489y;

    public o2(g4 g4Var, Context context, e4 e4Var) {
        super(context);
        this.E = g4Var;
        this.f50484n = org.telegram.messenger.g0.L(18.0f);
        this.f50489y = e4Var;
        if (g4.D1 == null) {
            Paint paint = new Paint(1);
            g4.D1 = paint;
            paint.setColor(-1);
        }
        j2 j2Var = new j2(this, context);
        this.f50480b = j2Var;
        j2Var.b(new k2(this, 0));
        m2 m2Var = new m2(this);
        this.f50481c = m2Var;
        j2Var.setAdapter(m2Var);
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29451d6, false);
        this.f50479a = x02;
        org.telegram.messenger.g0.A3(j2Var, x02);
        addView(j2Var);
        n2 n2Var = new n2(this, context);
        this.d = n2Var;
        addView(n2Var);
        setWillNotDraw(false);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29451d6));
    }

    @Override
    public final void k(ArrayList arrayList) {
        z2 z2Var = this.f50483f;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
        z2 z2Var2 = this.h;
        if (z2Var2 != null) {
            arrayList.add(z2Var2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.f50483f;
        if (z2Var != null) {
            z2Var.i(this);
        }
        z2 z2Var2 = this.h;
        if (z2Var2 != null) {
            z2Var2.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.f50483f;
        if (z2Var != null) {
            z2Var.f(this);
        }
        z2 z2Var2 = this.h;
        if (z2Var2 != null) {
            z2Var2.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f50482e != null) {
            z2 z2Var = this.f50483f;
            g4 g4Var = this.E;
            int i7 = this.f50484n;
            int i10 = 0;
            if (z2Var != null) {
                canvas.save();
                canvas.translate(i7, this.f50485r);
                g4.t(g4Var, canvas, this, 0);
                this.f50483f.d(canvas, this);
                canvas.restore();
                i10 = 1;
            }
            if (this.h != null) {
                canvas.save();
                canvas.translate(i7, this.f50485r + this.f50486s);
                g4.t(g4Var, canvas, this, i10);
                this.h.d(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(org.telegram.messenger.gd.N0(2131754855, null));
        if (this.f50483f != null) {
            sb2.append(", ");
            sb2.append(this.f50483f.d.getText());
        }
        if (this.h != null) {
            sb2.append(", ");
            sb2.append(this.h.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int L = org.telegram.messenger.g0.L(8.0f);
        j2 j2Var = this.f50480b;
        j2Var.layout(0, L, j2Var.getMeasuredWidth(), j2Var.getMeasuredHeight() + org.telegram.messenger.g0.L(8.0f));
        int bottom = j2Var.getBottom() - org.telegram.messenger.g0.L(23.0f);
        n2 n2Var = this.d;
        n2Var.layout(0, bottom, n2Var.getMeasuredWidth(), n2Var.getMeasuredHeight() + bottom);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i7);
        if (this.f50482e != null) {
            int L = org.telegram.messenger.g0.L(310.0f);
            this.f50480b.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(L, 1073741824));
            this.f50482e.items.size();
            this.d.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(10.0f), 1073741824));
            int L2 = size - org.telegram.messenger.g0.L(36.0f);
            int L3 = org.telegram.messenger.g0.L(16.0f) + L;
            this.f50485r = L3;
            TL_iv.pageBlockSlideshow pageblockslideshow = this.f50482e;
            TL_iv.RichText richText = pageblockslideshow.caption.text;
            HashSet hashSet = g4.f48040d1;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            g4 g4Var = this.E;
            z2 n10 = g4.n(g4Var, this, null, richText, L2, L3, pageblockslideshow, alignment, 0, this.f50489y);
            this.f50483f = n10;
            int i12 = this.f50484n;
            if (n10 != null) {
                int height = this.f50483f.d.getHeight() + org.telegram.messenger.g0.L(4.0f);
                this.f50486s = height;
                L = org.telegram.messenger.f3.C(4.0f, height, L);
                z2 z2Var = this.f50483f;
                z2Var.f54496s = i12;
                z2Var.f54497w = this.f50485r;
            } else {
                this.f50486s = 0;
            }
            TL_iv.pageBlockSlideshow pageblockslideshow2 = this.f50482e;
            TL_iv.RichText richText2 = pageblockslideshow2.caption.credit;
            if (this.f50489y.H) {
                alignment = org.telegram.ui.Components.yu0.a();
            }
            z2 n11 = g4.n(g4Var, this, null, richText2, L2, 0, pageblockslideshow2, alignment, 0, this.f50489y);
            this.h = n11;
            if (n11 != null) {
                L += this.h.d.getHeight() + org.telegram.messenger.g0.L(4.0f);
                z2 z2Var2 = this.h;
                z2Var2.f54496s = i12;
                z2Var2.f54497w = this.f50485r + this.f50486s;
            }
            i11 = org.telegram.messenger.g0.L(16.0f) + L;
        } else {
            i11 = 1;
        }
        setMeasuredDimension(size, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        z2 z2Var = this.f50483f;
        int i7 = this.f50484n;
        int i10 = this.f50485r;
        g4 g4Var = this.E;
        if (!g4.j(g4Var, this.f50489y, motionEvent, this, z2Var, i7, i10)) {
            if (!g4.j(g4Var, this.f50489y, motionEvent, this, this.h, this.f50484n, this.f50485r + this.f50486s) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void updateColors() {
        j2 j2Var = this.f50480b;
        if (j2Var != null) {
            try {
                int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29451d6, false);
                if (x02 != this.f50479a) {
                    this.f50479a = x02;
                    org.telegram.messenger.g0.A3(j2Var, x02);
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }
}
