package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.fx0;
import org.telegram.ui.Components.gx0;
import org.telegram.ui.Components.mx0;
import org.telegram.ui.Components.nx0;
import org.telegram.ui.tg0;
import org.telegram.ui.vg0;
public final class yu extends fu implements mx0 {
    public final TL_iv.pageBlockTable W;
    public final nx0 X;
    public final ArrayList Y;
    public final org.telegram.ui.Cells.t9[] Z;
    public final jv f26746a0;
    public final int f26747b0;
    public final ArrayList f26748c0;
    public final int f26749d0;
    public final int f26750e0;
    public int f26751f0;
    public int f26752g0;
    public final int f26753h0;
    public int f26754i0;
    public Paint f26755j0;
    public Paint f26756k0;
    public Paint f26757l0;
    public Paint m0;
    public float f26758n0;
    public int f26759o0;
    public boolean f26760p0;
    public jv f26761q0;
    public float f26762r0;
    public float f26763s0;
    public boolean f26764t0;
    public int f26765u0;
    public int f26766v0;
    public int f26767w0;
    public VelocityTracker f26768x0;
    public OverScroller f26769y0;
    public final m.f3 f26770z0;

    public yu(kv kvVar, Rect rect, int i7, TL_iv.pageBlockTable pageblocktable) {
        super(kvVar, rect, i7);
        float f10;
        int i10;
        int i11;
        int max;
        this.Y = new ArrayList();
        this.f26748c0 = new ArrayList();
        this.f26770z0 = new m.f3(this, 12);
        Rect rect2 = this.f22470b;
        rect2.top = g0.L(10.0f) + rect2.top;
        this.W = pageblocktable;
        this.f26749d0 = this.f22471c;
        nx0 nx0Var = new nx0(t0.f25566b, this, null);
        this.X = nx0Var;
        nx0Var.setOrientation(0);
        nx0Var.setRowOrderPreserved(true);
        nx0Var.setDrawLines(pageblocktable.bordered);
        nx0Var.setStriped(pageblocktable.striped);
        nx0Var.setRtl(kvVar.I());
        nx0Var.setFillWidth(false);
        nx0Var.setBalancedColumns(true);
        if (pageblocktable.compact) {
            int L = g0.L(5.0f);
            int L2 = g0.L(5.0f);
            int L3 = g0.L(5.0f);
            if (nx0Var.f36528w != L || nx0Var.f36526r != L2 || nx0Var.f36527s != L3) {
                nx0Var.f36528w = L;
                nx0Var.f36526r = L2;
                nx0Var.f36527s = L3;
                nx0Var.requestLayout();
            }
        }
        if (pageblocktable.compact) {
            f10 = 18.0f;
        } else {
            f10 = 36.0f;
        }
        nx0Var.setMinimumCellHeight(g0.L(f10));
        if (!pageblocktable.rows.isEmpty()) {
            TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(0);
            i10 = 0;
            for (int i12 = 0; i12 < pagetablerow.cells.size(); i12++) {
                int i13 = pagetablerow.cells.get(i12).colspan;
                if (i13 == 0) {
                    i13 = 1;
                }
                i10 += i13;
            }
        } else {
            i10 = 0;
        }
        for (int i14 = 0; i14 < pageblocktable.rows.size(); i14++) {
            TL_iv.pageTableRow pagetablerow2 = pageblocktable.rows.get(i14);
            int i15 = 0;
            for (int i16 = 0; i16 < pagetablerow2.cells.size(); i16++) {
                TL_iv.pageTableCell pagetablecell = pagetablerow2.cells.get(i16);
                int i17 = pagetablecell.colspan;
                i17 = i17 == 0 ? 1 : i17;
                int i18 = pagetablecell.rowspan;
                i18 = i18 == 0 ? 1 : i18;
                if (pagetablecell.text != null) {
                    this.X.b(pagetablecell, i15, i14, i17);
                } else {
                    this.X.a(i15, i14, i17, i18);
                }
                i15 += i17;
            }
        }
        this.X.setColumnCount(i10);
        this.X.measure(View.MeasureSpec.makeMeasureSpec(this.f22471c, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth = this.X.getMeasuredWidth();
        this.f26752g0 = this.X.getMeasuredHeight();
        this.f26753h0 = Math.max(0, measuredWidth - this.f26749d0);
        TL_iv.RichText richText = pageblocktable.title;
        if (richText != null && !(richText instanceof TL_iv.textEmpty) && !TextUtils.isEmpty(kv.x(richText))) {
            jv jvVar = new jv(kvVar, kvVar.l(pageblocktable.title, kv.R(0, 15)), this.f26749d0, Layout.Alignment.ALIGN_CENTER);
            this.f26746a0 = jvVar;
            jvVar.f23610r = true;
            this.f26747b0 = g0.L(9.0f) + jvVar.f23605b.getHeight();
        } else {
            this.f26746a0 = null;
            this.f26747b0 = 0;
        }
        jv jvVar2 = this.f26746a0;
        if (jvVar2 != null) {
            i11 = jvVar2.r();
        } else {
            i11 = 0;
        }
        if (kvVar.D()) {
            max = Math.max(0, this.f26749d0);
        } else {
            max = Math.max(0, Math.min(this.f26749d0, Math.max(measuredWidth, i11)));
        }
        this.f26750e0 = max;
        this.f26751f0 = max;
        for (int i19 = 0; i19 < this.X.getChildCount(); i19++) {
            gx0 d = this.X.d(i19);
            fx0 fx0Var = d.f34071b;
            if (fx0Var instanceof jv) {
                this.Y.add((jv) fx0Var);
                this.f26748c0.add(new xu(d));
            }
        }
        ArrayList arrayList = new ArrayList();
        jv jvVar3 = this.f26746a0;
        if (jvVar3 != null) {
            arrayList.add(jvVar3);
        }
        arrayList.addAll(this.Y);
        this.Z = (org.telegram.ui.Cells.t9[]) arrayList.toArray(new org.telegram.ui.Cells.t9[0]);
    }

    @Override
    public final int I() {
        Rect rect = this.f22470b;
        return g0.L(10.0f) + rect.top + this.f26747b0 + this.f26752g0 + rect.bottom;
    }

    @Override
    public final int J() {
        return K();
    }

    @Override
    public final int K() {
        Rect rect = this.f22470b;
        return rect.left + this.f26750e0 + rect.right;
    }

    @Override
    public final org.telegram.ui.Cells.t9[] L() {
        return this.Z;
    }

    @Override
    public final boolean Q() {
        if (!this.f26760p0) {
            OverScroller overScroller = this.f26769y0;
            if (overScroller == null || overScroller.isFinished()) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void T() {
        jv jvVar = this.f26746a0;
        if (jvVar != null) {
            jvVar.i(this.V);
        }
        ArrayList arrayList = this.Y;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((jv) obj).i(this.V);
        }
    }

    @Override
    public final void V() {
        jv jvVar = this.f26746a0;
        if (jvVar != null) {
            jvVar.f(this.V);
        }
        ArrayList arrayList = this.Y;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((jv) obj).f(this.V);
        }
    }

    @Override
    public final void W(Canvas canvas) {
        int i7;
        int i10;
        jv jvVar = this.f26746a0;
        if (jvVar != null) {
            canvas.save();
            canvas.translate(j0(), 0.0f);
            jvVar.d(canvas, jvVar.S);
            canvas.restore();
        }
        canvas.save();
        canvas.translate(0.0f, this.f26747b0);
        kv kvVar = this.f22469a;
        int i11 = kvVar.S;
        h6.m mVar = kvVar.f23785z;
        Rect rect = this.f22470b;
        canvas.saveLayerAlpha(-i11, 0.0f, ((kvVar.C + kvVar.T) - rect.left) - rect.right, this.f26752g0, 255, 31);
        canvas.save();
        canvas.translate(-this.f26754i0, 0.0f);
        nx0 nx0Var = this.X;
        int childCount = nx0Var.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            nx0Var.d(i12).a(canvas, this.V, true);
        }
        canvas.restore();
        RectF rectF = g0.P;
        rectF.set(-kvVar.S, 0.0f, g0.L(12.0f) + i7, this.f26752g0);
        mVar.m(canvas, rectF, 0, 1.0f);
        rectF.set(i10 - g0.L(12.0f), 0.0f, ((kvVar.C + kvVar.T) - rect.left) - rect.right, this.f26752g0);
        mVar.m(canvas, rectF, 2, 1.0f);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int i7;
        int i10;
        View view;
        int actionMasked = motionEvent.getActionMasked();
        int i11 = this.f26753h0;
        gx0 gx0Var = null;
        int i12 = 0;
        if (actionMasked == 0) {
            if (this.f26765u0 == 0 && (view = this.V) != null) {
                ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
                this.f26765u0 = viewConfiguration.getScaledTouchSlop();
                this.f26766v0 = viewConfiguration.getScaledMinimumFlingVelocity();
                this.f26767w0 = viewConfiguration.getScaledMaximumFlingVelocity();
            }
            if (this.f26769y0 == null && this.V != null) {
                this.f26769y0 = new OverScroller(this.V.getContext());
            }
            OverScroller overScroller = this.f26769y0;
            if (overScroller != null && !overScroller.isFinished()) {
                this.f26769y0.forceFinished(true);
            }
            this.f26758n0 = motionEvent.getX();
            motionEvent.getY();
            this.f26759o0 = this.f26754i0;
            this.f26760p0 = false;
            VelocityTracker velocityTracker2 = this.f26768x0;
            if (velocityTracker2 == null) {
                this.f26768x0 = VelocityTracker.obtain();
            } else {
                velocityTracker2.clear();
            }
            this.f26768x0.addMovement(motionEvent);
            this.f26761q0 = null;
            this.f26764t0 = false;
            int i13 = this.f26747b0;
            jv jvVar = this.f26746a0;
            if (jvVar != null && motionEvent.getY() < i13) {
                float j02 = j0();
                motionEvent.offsetLocation(-j02, 0.0f);
                boolean t6 = jvVar.t(motionEvent);
                motionEvent.offsetLocation(j02, 0.0f);
                if (t6) {
                    this.f26761q0 = jvVar;
                    this.f26762r0 = j02;
                    this.f26763s0 = 0.0f;
                    this.f26764t0 = true;
                }
            }
            if (!this.f26764t0) {
                float x10 = motionEvent.getX();
                float f10 = x10 + this.f26754i0;
                float y10 = motionEvent.getY() - i13;
                nx0 nx0Var = this.X;
                int childCount = nx0Var.getChildCount();
                int i14 = 0;
                while (true) {
                    if (i14 >= childCount) {
                        break;
                    }
                    gx0 d = nx0Var.d(i14);
                    if (d.f34071b instanceof jv) {
                        if (f10 >= d.f34083p && f10 < i7 + d.f34078k) {
                            if (y10 >= d.f34084q && y10 < i10 + d.f34079l) {
                                gx0Var = d;
                                break;
                            }
                        }
                    }
                    i14++;
                }
                if (gx0Var != null) {
                    this.f26761q0 = (jv) gx0Var.f34071b;
                    this.f26762r0 = gx0Var.b() - this.f26754i0;
                    this.f26763s0 = gx0Var.c() + i13;
                    this.f26761q0.R.set(gx0Var.f34083p - gx0Var.b(), gx0Var.f34084q - gx0Var.c(), (gx0Var.f34083p + gx0Var.f34078k) - gx0Var.b(), (gx0Var.f34084q + gx0Var.f34079l) - gx0Var.c());
                    motionEvent.offsetLocation(-this.f26762r0, -this.f26763s0);
                    this.f26764t0 = this.f26761q0.t(motionEvent);
                    motionEvent.offsetLocation(this.f26762r0, this.f26763s0);
                }
            }
            if (this.f26764t0 || i11 > 0) {
                return true;
            }
            return false;
        }
        if (actionMasked == 2) {
            VelocityTracker velocityTracker3 = this.f26768x0;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
            }
            float x11 = motionEvent.getX() - this.f26758n0;
            if (!this.f26760p0 && i11 > 0 && Math.abs(x11) > this.f26765u0) {
                this.f26760p0 = true;
                a0(true);
                if (this.f26764t0 && this.f26761q0 != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.setAction(3);
                    obtain.offsetLocation(-this.f26762r0, -this.f26763s0);
                    this.f26761q0.t(obtain);
                    obtain.recycle();
                    this.f26764t0 = false;
                }
            }
            if (this.f26760p0) {
                int i15 = (int) (this.f26759o0 - x11);
                if (i15 >= 0) {
                    i12 = i15;
                }
                if (i12 <= i11) {
                    i11 = i12;
                }
                if (i11 != this.f26754i0) {
                    this.f26754i0 = i11;
                    Z(this.S, this.T, this.U);
                    View view2 = this.V;
                    if (view2 != null) {
                        view2.invalidate();
                        return true;
                    }
                }
            } else {
                return this.f26764t0;
            }
        } else {
            if (actionMasked == 1 || actionMasked == 3) {
                boolean z9 = this.f26760p0;
                this.f26760p0 = false;
                if (z9) {
                    a0(false);
                    if (actionMasked == 1 && (velocityTracker = this.f26768x0) != null && this.f26769y0 != null && this.V != null) {
                        velocityTracker.addMovement(motionEvent);
                        this.f26768x0.computeCurrentVelocity(1000, this.f26767w0);
                        float f11 = -this.f26768x0.getXVelocity();
                        if (Math.abs(f11) > this.f26766v0) {
                            this.f26769y0.fling(this.f26754i0, 0, (int) f11, 0, 0, this.f26753h0, 0, 0);
                            this.V.postOnAnimation(this.f26770z0);
                        }
                    }
                }
                if (!z9 && this.f26764t0 && this.f26761q0 != null) {
                    motionEvent.offsetLocation(-this.f26762r0, -this.f26763s0);
                    this.f26761q0.t(motionEvent);
                    motionEvent.offsetLocation(this.f26762r0, this.f26763s0);
                }
                boolean z10 = this.f26764t0;
                this.f26764t0 = false;
                this.f26761q0 = null;
                VelocityTracker velocityTracker4 = this.f26768x0;
                if (velocityTracker4 != null) {
                    velocityTracker4.recycle();
                    this.f26768x0 = null;
                }
                if (z9 || z10) {
                }
            }
            return false;
        }
        return true;
    }

    @Override
    public final void Z(int i7, int i10, int i11) {
        this.S = i7;
        this.T = i10;
        this.U = i11;
        jv jvVar = this.f26746a0;
        if (jvVar != null) {
            jvVar.f23606c = (j0() + i7) - jvVar.n();
            jvVar.d = i10;
            jvVar.f23607e = i11;
        }
        nx0 nx0Var = this.X;
        int childCount = nx0Var.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            gx0 d = nx0Var.d(i12);
            fx0 fx0Var = d.f34071b;
            if (fx0Var instanceof jv) {
                jv jvVar2 = (jv) fx0Var;
                jvVar2.f23606c = ((d.b() + i7) - this.f26754i0) - jvVar2.n();
                jvVar2.d = d.c() + this.f26747b0 + i10;
                jvVar2.f23607e = i11;
            }
        }
    }

    @Override
    public final fx0 c(TL_iv.pageTableCell pagetablecell, int i7) {
        Layout.Alignment alignment;
        if (pagetablecell == null) {
            return null;
        }
        int R = kv.R(0, 14);
        TL_iv.RichText richText = pagetablecell.text;
        kv kvVar = this.f22469a;
        SpannableStringBuilder l10 = kvVar.l(richText, R);
        if (pagetablecell.align_right) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else if (pagetablecell.align_center) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        }
        jv jvVar = new jv(kvVar, l10, i7, alignment);
        jvVar.f23610r = true;
        return jvVar;
    }

    @Override
    public final Paint getHeaderPaint() {
        i0();
        return this.f26757l0;
    }

    @Override
    public final Paint getLinePaint() {
        i0();
        return this.f26755j0;
    }

    @Override
    public final Paint getStripPaint() {
        i0();
        return this.m0;
    }

    public final void i0() {
        int i7;
        int i10;
        if (this.f26755j0 == null) {
            Paint paint = new Paint(1);
            this.f26755j0 = paint;
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            this.f26755j0.setStrokeWidth(g0.N(0.66f));
            Paint paint2 = new Paint();
            this.f26756k0 = paint2;
            paint2.setStyle(style);
            this.f26756k0.setStrokeWidth(g0.N(0.66f));
            this.f26757l0 = new Paint();
            this.m0 = new Paint();
        }
        kv kvVar = this.f22469a;
        if (kvVar.E()) {
            i7 = org.telegram.ui.ActionBar.l6.il;
        } else {
            i7 = org.telegram.ui.ActionBar.l6.hl;
        }
        int w02 = org.telegram.ui.ActionBar.l6.w0(i7, kvVar.D);
        this.f26755j0.setColor(w02);
        this.f26756k0.setColor(w02);
        Paint paint3 = this.f26757l0;
        if (kvVar.E()) {
            i10 = org.telegram.ui.ActionBar.l6.gl;
        } else {
            i10 = org.telegram.ui.ActionBar.l6.fl;
        }
        paint3.setColor(org.telegram.ui.ActionBar.l6.w0(i10, kvVar.D));
        this.m0.setColor(167772160);
    }

    public final int j0() {
        jv jvVar = this.f26746a0;
        if (jvVar == null) {
            return 0;
        }
        int i7 = this.f26751f0;
        int i10 = jvVar.h;
        int i11 = jvVar.f23608f;
        return Math.round(((i7 - (i10 - i11)) / 2.0f) - i11);
    }

    @Override
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        StaticLayout staticLayout;
        fu.l(spannableStringBuilder, this.f26746a0, null);
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.Y;
            if (i7 < arrayList.size()) {
                jv jvVar = (jv) arrayList.get(i7);
                if (jvVar != null && (staticLayout = jvVar.f23605b) != null && !TextUtils.isEmpty(staticLayout.getText())) {
                    if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
                        spannableStringBuilder.append(", ");
                    }
                    spannableStringBuilder.append(staticLayout.getText());
                }
                i7++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void p(ArrayList arrayList) {
        ArrayList arrayList2 = this.f26748c0;
        if (arrayList2.isEmpty()) {
            arrayList.add(this);
        } else {
            arrayList.addAll(arrayList2);
        }
    }

    @Override
    public final boolean s(Canvas canvas, ColorFilter colorFilter) {
        boolean z9;
        boolean z10;
        int i7;
        int i10;
        gx0 d;
        jv jvVar;
        org.telegram.ui.Components.n5 n5Var;
        nx0 nx0Var;
        int i11;
        int i12;
        h6.m mVar;
        int i13;
        org.telegram.ui.Components.n5 n5Var2;
        canvas.save();
        Rect rect = this.f22470b;
        canvas.translate(rect.left, rect.top);
        jv jvVar2 = this.f26746a0;
        if (jvVar2 != null && (n5Var2 = jvVar2.E) != null && !n5Var2.f36250a.isEmpty()) {
            canvas.save();
            canvas.translate(j0(), 0.0f);
            org.telegram.ui.Components.r5.drawAnimatedEmojis(canvas, jvVar2.f23605b, jvVar2.E, 0.0f, jvVar2.f23613x, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
            canvas.restore();
            z9 = true;
        } else {
            z9 = false;
        }
        canvas.translate(0.0f, this.f26747b0);
        ArrayList arrayList = this.Y;
        int size = arrayList.size();
        int i14 = 0;
        while (true) {
            if (i14 < size) {
                org.telegram.ui.Components.n5 n5Var3 = ((jv) arrayList.get(i14)).E;
                if (n5Var3 != null && !n5Var3.f36250a.isEmpty()) {
                    kv kvVar = this.f22469a;
                    int i15 = kvVar.S;
                    h6.m mVar2 = kvVar.f23785z;
                    int saveLayerAlpha = canvas.saveLayerAlpha(-i15, 0.0f, ((kvVar.C + kvVar.T) - rect.left) - rect.right, this.f26752g0, 255, 31);
                    canvas.save();
                    canvas.translate(-this.f26754i0, 0.0f);
                    nx0 nx0Var2 = this.X;
                    int childCount = nx0Var2.getChildCount();
                    int i16 = 0;
                    while (i16 < childCount) {
                        fx0 fx0Var = nx0Var2.d(i16).f34071b;
                        if (!(fx0Var instanceof jv) || (n5Var = (jvVar = (jv) fx0Var).E) == null || n5Var.f36250a.isEmpty()) {
                            i13 = saveLayerAlpha;
                            nx0Var = nx0Var2;
                            i11 = childCount;
                            i12 = i16;
                            mVar = mVar2;
                        } else {
                            canvas.save();
                            canvas.translate(d.b(), d.c());
                            nx0Var = nx0Var2;
                            i11 = childCount;
                            i12 = i16;
                            mVar = mVar2;
                            i13 = saveLayerAlpha;
                            org.telegram.ui.Components.r5.drawAnimatedEmojis(canvas, jvVar.f23605b, jvVar.E, 0.0f, jvVar.f23613x, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
                            canvas.restore();
                        }
                        i16 = i12 + 1;
                        mVar2 = mVar;
                        nx0Var2 = nx0Var;
                        childCount = i11;
                        saveLayerAlpha = i13;
                    }
                    int i17 = saveLayerAlpha;
                    h6.m mVar3 = mVar2;
                    canvas.restore();
                    RectF rectF = g0.P;
                    rectF.set(-kvVar.S, 0.0f, g0.L(12.0f) + i7, this.f26752g0);
                    mVar3.m(canvas, rectF, 0, 1.0f);
                    rectF.set(i10 - g0.L(12.0f), 0.0f, ((kvVar.C + kvVar.T) - rect.left) - rect.right, this.f26752g0);
                    mVar3.m(canvas, rectF, 2, 1.0f);
                    canvas.restoreToCount(i17);
                    z10 = true;
                } else {
                    i14++;
                }
            } else {
                z10 = z9;
                break;
            }
        }
        canvas.restore();
        return z10;
    }

    @Override
    public final void t(Canvas canvas) {
        int i7;
        int i10;
        xu xuVar;
        float f10;
        int i11;
        nx0 nx0Var;
        int i12;
        int i13;
        int i14;
        float f11;
        vg0 vg0Var = this.K;
        if (vg0Var != null && vg0Var.h) {
            ArrayList arrayList = this.f26748c0;
            if (!arrayList.isEmpty() && vg0Var.d((tg0) arrayList.get(0)) >= 0) {
                float c10 = vg0Var.c((tg0) arrayList.get(0));
                float f12 = 0.0f;
                if (c10 <= 0.0f) {
                    return;
                }
                canvas.save();
                Rect rect = this.f22470b;
                canvas.translate(rect.left, rect.top);
                jv jvVar = this.f26746a0;
                if (jvVar != null) {
                    canvas.save();
                    canvas.translate(j0(), 0.0f);
                    jvVar.d(canvas, jvVar.S);
                    canvas.restore();
                }
                canvas.translate(0.0f, this.f26747b0);
                kv kvVar = this.f22469a;
                int i15 = kvVar.S;
                h6.m mVar = kvVar.f23785z;
                float f13 = 255.0f;
                int saveLayerAlpha = canvas.saveLayerAlpha(-i15, 0.0f, ((kvVar.C + kvVar.T) - rect.left) - rect.right, this.f26752g0, (int) (c10 * 255.0f), 31);
                canvas.save();
                canvas.translate(-this.f26754i0, 0.0f);
                nx0 nx0Var2 = this.X;
                int childCount = nx0Var2.getChildCount();
                int i16 = 0;
                int i17 = 0;
                while (i16 < childCount) {
                    float f14 = f13;
                    gx0 d = nx0Var2.d(i16);
                    if (i17 < arrayList.size() && ((xu) arrayList.get(i17)).f26526a == d) {
                        xuVar = (xu) arrayList.get(i17);
                        i17++;
                    } else {
                        xuVar = null;
                    }
                    int i18 = i17;
                    if (xuVar == null) {
                        d.a(canvas, this.V, true);
                    } else if (!vg0Var.i(xuVar)) {
                        d.a(canvas, this.V, false);
                    } else {
                        if (vg0Var.g(xuVar)) {
                            d.a(canvas, this.V, false);
                            if (d.f34071b instanceof jv) {
                                canvas.save();
                                f10 = f12;
                                canvas.translate(d.b(), d.c());
                                jv jvVar2 = (jv) d.f34071b;
                                if (vg0Var.g(xuVar)) {
                                    i14 = vg0Var.f50681e;
                                } else {
                                    i14 = -1;
                                }
                                if (vg0Var.g(xuVar)) {
                                    f11 = vg0Var.f50682f;
                                } else {
                                    f11 = f10;
                                }
                                jvVar2.m(canvas, i14, f11);
                                canvas.restore();
                            } else {
                                f10 = f12;
                            }
                        } else {
                            f10 = f12;
                            float c11 = vg0Var.c(xuVar);
                            if (c11 >= 1.0f) {
                                d.a(canvas, this.V, true);
                            } else {
                                if (c11 > f10 && d.f34071b != null) {
                                    d.a(canvas, this.V, false);
                                    canvas.save();
                                    canvas.translate(d.b(), d.c());
                                    nx0Var = nx0Var2;
                                    i13 = i16;
                                    i11 = saveLayerAlpha;
                                    i12 = childCount;
                                    int saveLayerAlpha2 = canvas.saveLayerAlpha(0.0f, 0.0f, d.f34078k, d.f34079l, (int) (c11 * f14), 31);
                                    d.f34071b.d(canvas, this.V);
                                    canvas.restoreToCount(saveLayerAlpha2);
                                    canvas.restore();
                                } else {
                                    i11 = saveLayerAlpha;
                                    nx0Var = nx0Var2;
                                    i12 = childCount;
                                    i13 = i16;
                                    d.a(canvas, this.V, false);
                                }
                                i16 = i13 + 1;
                                saveLayerAlpha = i11;
                                f13 = f14;
                                i17 = i18;
                                f12 = f10;
                                childCount = i12;
                                nx0Var2 = nx0Var;
                            }
                        }
                        i11 = saveLayerAlpha;
                        nx0Var = nx0Var2;
                        i12 = childCount;
                        i13 = i16;
                        i16 = i13 + 1;
                        saveLayerAlpha = i11;
                        f13 = f14;
                        i17 = i18;
                        f12 = f10;
                        childCount = i12;
                        nx0Var2 = nx0Var;
                    }
                    nx0Var = nx0Var2;
                    i12 = childCount;
                    i13 = i16;
                    f10 = f12;
                    i11 = saveLayerAlpha;
                    i16 = i13 + 1;
                    saveLayerAlpha = i11;
                    f13 = f14;
                    i17 = i18;
                    f12 = f10;
                    childCount = i12;
                    nx0Var2 = nx0Var;
                }
                float f15 = f12;
                int i19 = saveLayerAlpha;
                canvas.restore();
                RectF rectF = g0.P;
                rectF.set(-kvVar.S, f15, g0.L(12.0f) + i7, this.f26752g0);
                mVar.m(canvas, rectF, 0, 1.0f);
                rectF.set(i10 - g0.L(12.0f), 0.0f, ((kvVar.C + kvVar.T) - rect.left) - rect.right, this.f26752g0);
                mVar.m(canvas, rectF, 2, 1.0f);
                canvas.restoreToCount(i19);
                canvas.restore();
                return;
            }
        }
        q(canvas);
    }

    @Override
    public final boolean u(CharacterStyle characterStyle, int i7, wt wtVar) {
        gx0 d;
        jv jvVar;
        Rect rect = this.f22470b;
        jv jvVar2 = this.f26746a0;
        if (jvVar2 != null && jvVar2.o(characterStyle, wtVar)) {
            wtVar.f26374e = (j0() + rect.left) - jvVar2.n();
            wtVar.f26375f = i7 + rect.top;
            return true;
        }
        nx0 nx0Var = this.X;
        int childCount = nx0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            fx0 fx0Var = nx0Var.d(i10).f34071b;
            if (fx0Var instanceof jv) {
                if (((jv) fx0Var).o(characterStyle, wtVar)) {
                    wtVar.f26374e = ((d.b() + rect.left) - this.f26754i0) - jvVar.n();
                    wtVar.f26375f = d.c() + i7 + rect.top + this.f26747b0;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void g(fx0 fx0Var, int i7) {
    }
}
