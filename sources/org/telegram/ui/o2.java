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
public final class o2 extends FrameLayout implements org.telegram.ui.Cells.h9, org.telegram.ui.ActionBar.b6 {
    public final g4 D;
    public int f48293a;
    public final j2 f48294b;
    public final m2 f48295c;
    public final n2 d;
    public TL_iv.pageBlockSlideshow f48296e;
    public z2 f48297f;
    public z2 h;
    public final int f48298n;
    public int f48299r;
    public int f48300s;
    public float f48301w;
    public int f48302x;
    public final e4 f48303y;

    public o2(g4 g4Var, Context context, e4 e4Var) {
        super(context);
        this.D = g4Var;
        this.f48298n = org.telegram.messenger.g0.L(18.0f);
        this.f48303y = e4Var;
        if (g4.C1 == null) {
            Paint paint = new Paint(1);
            g4.C1 = paint;
            paint.setColor(-1);
        }
        j2 j2Var = new j2(this, context);
        this.f48294b = j2Var;
        j2Var.b(new k2(this, 0));
        m2 m2Var = new m2(this);
        this.f48295c = m2Var;
        j2Var.setAdapter(m2Var);
        int x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27865d6, false);
        this.f48293a = x02;
        org.telegram.messenger.g0.C3(j2Var, x02);
        addView(j2Var);
        n2 n2Var = new n2(this, context);
        this.d = n2Var;
        addView(n2Var);
        setWillNotDraw(false);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27865d6));
    }

    @Override
    public final void k(ArrayList arrayList) {
        z2 z2Var = this.f48297f;
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
        z2 z2Var = this.f48297f;
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
        z2 z2Var = this.f48297f;
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
        if (this.f48296e != null) {
            z2 z2Var = this.f48297f;
            g4 g4Var = this.D;
            int i7 = this.f48298n;
            int i10 = 0;
            if (z2Var != null) {
                canvas.save();
                canvas.translate(i7, this.f48299r);
                g4.t(g4Var, canvas, this, 0);
                this.f48297f.d(canvas, this);
                canvas.restore();
                i10 = 1;
            }
            if (this.h != null) {
                canvas.save();
                canvas.translate(i7, this.f48299r + this.f48300s);
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
        StringBuilder sb2 = new StringBuilder(org.telegram.messenger.id.M0(2131754856, null));
        if (this.f48297f != null) {
            sb2.append(", ");
            sb2.append(this.f48297f.d.getText());
        }
        if (this.h != null) {
            sb2.append(", ");
            sb2.append(this.h.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int L = org.telegram.messenger.g0.L(8.0f);
        j2 j2Var = this.f48294b;
        j2Var.layout(0, L, j2Var.getMeasuredWidth(), j2Var.getMeasuredHeight() + org.telegram.messenger.g0.L(8.0f));
        int bottom = j2Var.getBottom() - org.telegram.messenger.g0.L(23.0f);
        n2 n2Var = this.d;
        n2Var.layout(0, bottom, n2Var.getMeasuredWidth(), n2Var.getMeasuredHeight() + bottom);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i7);
        if (this.f48296e != null) {
            int L = org.telegram.messenger.g0.L(310.0f);
            this.f48294b.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(L, 1073741824));
            this.f48296e.items.size();
            this.d.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(10.0f), 1073741824));
            int L2 = size - org.telegram.messenger.g0.L(36.0f);
            int L3 = org.telegram.messenger.g0.L(16.0f) + L;
            this.f48299r = L3;
            TL_iv.pageBlockSlideshow pageblockslideshow = this.f48296e;
            TL_iv.RichText richText = pageblockslideshow.caption.text;
            HashSet hashSet = g4.f45859c1;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            g4 g4Var = this.D;
            z2 n10 = g4.n(g4Var, this, null, richText, L2, L3, pageblockslideshow, alignment, 0, this.f48303y);
            this.f48297f = n10;
            int i12 = this.f48298n;
            if (n10 != null) {
                int height = this.f48297f.d.getHeight() + org.telegram.messenger.g0.L(4.0f);
                this.f48300s = height;
                L = org.telegram.messenger.k5.C(4.0f, height, L);
                z2 z2Var = this.f48297f;
                z2Var.f52397s = i12;
                z2Var.f52398w = this.f48299r;
            } else {
                this.f48300s = 0;
            }
            TL_iv.pageBlockSlideshow pageblockslideshow2 = this.f48296e;
            TL_iv.RichText richText2 = pageblockslideshow2.caption.credit;
            if (this.f48303y.G) {
                alignment = org.telegram.ui.Components.ou0.a();
            }
            z2 n11 = g4.n(g4Var, this, null, richText2, L2, 0, pageblockslideshow2, alignment, 0, this.f48303y);
            this.h = n11;
            if (n11 != null) {
                L += this.h.d.getHeight() + org.telegram.messenger.g0.L(4.0f);
                z2 z2Var2 = this.h;
                z2Var2.f52397s = i12;
                z2Var2.f52398w = this.f48299r + this.f48300s;
            }
            i11 = org.telegram.messenger.g0.L(16.0f) + L;
        } else {
            i11 = 1;
        }
        setMeasuredDimension(size, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        z2 z2Var = this.f48297f;
        int i7 = this.f48298n;
        int i10 = this.f48299r;
        g4 g4Var = this.D;
        if (!g4.j(g4Var, this.f48303y, motionEvent, this, z2Var, i7, i10)) {
            if (!g4.j(g4Var, this.f48303y, motionEvent, this, this.h, this.f48298n, this.f48299r + this.f48300s) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void updateColors() {
        j2 j2Var = this.f48294b;
        if (j2Var != null) {
            try {
                int x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27865d6, false);
                if (x02 != this.f48293a) {
                    this.f48293a = x02;
                    org.telegram.messenger.g0.C3(j2Var, x02);
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }
}
