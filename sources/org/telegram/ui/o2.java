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
public final class o2 extends FrameLayout implements org.telegram.ui.Cells.j9, org.telegram.ui.ActionBar.k6 {
    public final h4 D;
    public int f40107a;
    public final j2 f40108b;
    public final m2 f40109c;
    public final n2 d;
    public TL_iv.pageBlockSlideshow e;
    public z2 f40110f;
    public z2 h;
    public final int f40111n;
    public int f40112r;
    public int f40113s;
    public float f40114w;
    public int f40115x;
    public final f4 f40116y;

    public o2(h4 h4Var, Context context, f4 f4Var) {
        super(context);
        this.D = h4Var;
        this.f40111n = org.telegram.messenger.i0.L(18.0f);
        this.f40116y = f4Var;
        if (h4.C1 == null) {
            Paint paint = new Paint(1);
            h4.C1 = paint;
            paint.setColor(-1);
        }
        j2 j2Var = new j2(this, context);
        this.f40108b = j2Var;
        j2Var.b(new k2(this, 0));
        m2 m2Var = new m2(this);
        this.f40109c = m2Var;
        j2Var.setAdapter(m2Var);
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20929d6, false);
        this.f40107a = x02;
        org.telegram.messenger.i0.B3(j2Var, x02);
        addView(j2Var);
        n2 n2Var = new n2(this, context);
        this.d = n2Var;
        addView(n2Var);
        setWillNotDraw(false);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20929d6));
    }

    @Override
    public final void h(ArrayList arrayList) {
        z2 z2Var = this.f40110f;
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
        z2 z2Var = this.f40110f;
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
        z2 z2Var = this.f40110f;
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
        if (this.e != null) {
            z2 z2Var = this.f40110f;
            h4 h4Var = this.D;
            int i10 = this.f40111n;
            int i11 = 0;
            if (z2Var != null) {
                canvas.save();
                canvas.translate(i10, this.f40112r);
                h4.t(h4Var, canvas, this, 0);
                this.f40110f.d(canvas, this);
                canvas.restore();
                i11 = 1;
            }
            if (this.h != null) {
                canvas.save();
                canvas.translate(i10, this.f40112r + this.f40113s);
                h4.t(h4Var, canvas, this, i11);
                this.h.d(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(org.telegram.messenger.cd.L0(2131754856, null));
        if (this.f40110f != null) {
            sb2.append(", ");
            sb2.append(this.f40110f.d.getText());
        }
        if (this.h != null) {
            sb2.append(", ");
            sb2.append(this.h.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int L = org.telegram.messenger.i0.L(8.0f);
        j2 j2Var = this.f40108b;
        j2Var.layout(0, L, j2Var.getMeasuredWidth(), j2Var.getMeasuredHeight() + org.telegram.messenger.i0.L(8.0f));
        int bottom = j2Var.getBottom() - org.telegram.messenger.i0.L(23.0f);
        n2 n2Var = this.d;
        n2Var.layout(0, bottom, n2Var.getMeasuredWidth(), n2Var.getMeasuredHeight() + bottom);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        if (this.e != null) {
            int L = org.telegram.messenger.i0.L(310.0f);
            this.f40108b.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(L, 1073741824));
            this.e.items.size();
            this.d.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(10.0f), 1073741824));
            int L2 = size - org.telegram.messenger.i0.L(36.0f);
            int L3 = org.telegram.messenger.i0.L(16.0f) + L;
            this.f40112r = L3;
            TL_iv.pageBlockSlideshow pageblockslideshow = this.e;
            TL_iv.RichText richText = pageblockslideshow.caption.text;
            HashSet hashSet = h4.f37702c1;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            h4 h4Var = this.D;
            z2 n10 = h4.n(h4Var, this, null, richText, L2, L3, pageblockslideshow, alignment, 0, this.f40116y);
            this.f40110f = n10;
            int i13 = this.f40111n;
            if (n10 != null) {
                int height = this.f40110f.d.getHeight() + org.telegram.messenger.i0.L(4.0f);
                this.f40113s = height;
                L = org.telegram.messenger.m5.C(4.0f, height, L);
                z2 z2Var = this.f40110f;
                z2Var.f43990s = i13;
                z2Var.f43991w = this.f40112r;
            } else {
                this.f40113s = 0;
            }
            TL_iv.pageBlockSlideshow pageblockslideshow2 = this.e;
            TL_iv.RichText richText2 = pageblockslideshow2.caption.credit;
            if (this.f40116y.G) {
                alignment = org.telegram.ui.Components.ov0.a();
            }
            z2 n11 = h4.n(h4Var, this, null, richText2, L2, 0, pageblockslideshow2, alignment, 0, this.f40116y);
            this.h = n11;
            if (n11 != null) {
                L += this.h.d.getHeight() + org.telegram.messenger.i0.L(4.0f);
                z2 z2Var2 = this.h;
                z2Var2.f43990s = i13;
                z2Var2.f43991w = this.f40112r + this.f40113s;
            }
            i12 = org.telegram.messenger.i0.L(16.0f) + L;
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        z2 z2Var = this.f40110f;
        int i10 = this.f40111n;
        int i11 = this.f40112r;
        h4 h4Var = this.D;
        if (!h4.j(h4Var, this.f40116y, motionEvent, this, z2Var, i10, i11)) {
            if (!h4.j(h4Var, this.f40116y, motionEvent, this, this.h, this.f40111n, this.f40112r + this.f40113s) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void updateColors() {
        j2 j2Var = this.f40108b;
        if (j2Var != null) {
            try {
                int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20929d6, false);
                if (x02 != this.f40107a) {
                    this.f40107a = x02;
                    org.telegram.messenger.i0.B3(j2Var, x02);
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
    }
}
