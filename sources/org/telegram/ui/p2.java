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
public final class p2 extends FrameLayout implements org.telegram.ui.Cells.g9, org.telegram.ui.ActionBar.z5 {
    public final i4 E;
    public int f48411a;
    public final k2 f48412b;
    public final n2 f48413c;
    public final o2 d;
    public TL_iv.pageBlockSlideshow f48414e;
    public a3 f48415f;
    public a3 h;
    public final int f48416n;
    public int f48417r;
    public int f48418s;
    public float f48419w;
    public int f48420x;
    public final g4 f48421y;

    public p2(i4 i4Var, Context context, g4 g4Var) {
        super(context);
        this.E = i4Var;
        this.f48416n = org.telegram.messenger.g0.L(18.0f);
        this.f48421y = g4Var;
        if (i4.D1 == null) {
            Paint paint = new Paint(1);
            i4.D1 = paint;
            paint.setColor(-1);
        }
        k2 k2Var = new k2(this, context);
        this.f48412b = k2Var;
        k2Var.b(new l2(this, 0));
        n2 n2Var = new n2(this);
        this.f48413c = n2Var;
        k2Var.setAdapter(n2Var);
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27878d6, false);
        this.f48411a = x02;
        org.telegram.messenger.g0.C3(k2Var, x02);
        addView(k2Var);
        o2 o2Var = new o2(this, context);
        this.d = o2Var;
        addView(o2Var);
        setWillNotDraw(false);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27878d6));
    }

    @Override
    public final void k(ArrayList arrayList) {
        a3 a3Var = this.f48415f;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
        a3 a3Var2 = this.h;
        if (a3Var2 != null) {
            arrayList.add(a3Var2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f48415f;
        if (a3Var != null) {
            a3Var.i(this);
        }
        a3 a3Var2 = this.h;
        if (a3Var2 != null) {
            a3Var2.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.f48415f;
        if (a3Var != null) {
            a3Var.f(this);
        }
        a3 a3Var2 = this.h;
        if (a3Var2 != null) {
            a3Var2.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f48414e != null) {
            a3 a3Var = this.f48415f;
            i4 i4Var = this.E;
            int i3 = this.f48416n;
            int i10 = 0;
            if (a3Var != null) {
                canvas.save();
                canvas.translate(i3, this.f48417r);
                i4.t(i4Var, canvas, this, 0);
                this.f48415f.d(canvas, this);
                canvas.restore();
                i10 = 1;
            }
            if (this.h != null) {
                canvas.save();
                canvas.translate(i3, this.f48417r + this.f48418s);
                i4.t(i4Var, canvas, this, i10);
                this.h.d(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(org.telegram.messenger.bd.M0(2131754856, null));
        if (this.f48415f != null) {
            sb2.append(", ");
            sb2.append(this.f48415f.d.getText());
        }
        if (this.h != null) {
            sb2.append(", ");
            sb2.append(this.h.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int L = org.telegram.messenger.g0.L(8.0f);
        k2 k2Var = this.f48412b;
        k2Var.layout(0, L, k2Var.getMeasuredWidth(), k2Var.getMeasuredHeight() + org.telegram.messenger.g0.L(8.0f));
        int bottom = k2Var.getBottom() - org.telegram.messenger.g0.L(23.0f);
        o2 o2Var = this.d;
        o2Var.layout(0, bottom, o2Var.getMeasuredWidth(), o2Var.getMeasuredHeight() + bottom);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i3);
        if (this.f48414e != null) {
            int L = org.telegram.messenger.g0.L(310.0f);
            this.f48412b.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(L, 1073741824));
            this.f48414e.items.size();
            this.d.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(10.0f), 1073741824));
            int L2 = size - org.telegram.messenger.g0.L(36.0f);
            int L3 = org.telegram.messenger.g0.L(16.0f) + L;
            this.f48417r = L3;
            TL_iv.pageBlockSlideshow pageblockslideshow = this.f48414e;
            TL_iv.RichText richText = pageblockslideshow.caption.text;
            HashSet hashSet = i4.f46056d1;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            i4 i4Var = this.E;
            a3 n4 = i4.n(i4Var, this, null, richText, L2, L3, pageblockslideshow, alignment, 0, this.f48421y);
            this.f48415f = n4;
            int i12 = this.f48416n;
            if (n4 != null) {
                int height = this.f48415f.d.getHeight() + org.telegram.messenger.g0.L(4.0f);
                this.f48418s = height;
                L = org.telegram.messenger.k5.C(4.0f, height, L);
                a3 a3Var = this.f48415f;
                a3Var.f43579s = i12;
                a3Var.f43580w = this.f48417r;
            } else {
                this.f48418s = 0;
            }
            TL_iv.pageBlockSlideshow pageblockslideshow2 = this.f48414e;
            TL_iv.RichText richText2 = pageblockslideshow2.caption.credit;
            if (this.f48421y.H) {
                alignment = org.telegram.ui.Components.lu0.a();
            }
            a3 n10 = i4.n(i4Var, this, null, richText2, L2, 0, pageblockslideshow2, alignment, 0, this.f48421y);
            this.h = n10;
            if (n10 != null) {
                L += this.h.d.getHeight() + org.telegram.messenger.g0.L(4.0f);
                a3 a3Var2 = this.h;
                a3Var2.f43579s = i12;
                a3Var2.f43580w = this.f48417r + this.f48418s;
            }
            i11 = org.telegram.messenger.g0.L(16.0f) + L;
        } else {
            i11 = 1;
        }
        setMeasuredDimension(size, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a3 a3Var = this.f48415f;
        int i3 = this.f48416n;
        int i10 = this.f48417r;
        i4 i4Var = this.E;
        if (!i4.j(i4Var, this.f48421y, motionEvent, this, a3Var, i3, i10)) {
            if (!i4.j(i4Var, this.f48421y, motionEvent, this, this.h, this.f48416n, this.f48417r + this.f48418s) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void updateColors() {
        k2 k2Var = this.f48412b;
        if (k2Var != null) {
            try {
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27878d6, false);
                if (x02 != this.f48411a) {
                    this.f48411a = x02;
                    org.telegram.messenger.g0.C3(k2Var, x02);
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }
}
