package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.LaunchActivity;
public final class bn0 extends RichMessageLayout.RichBlock implements tb1 {
    public static final AtomicInteger M = new AtomicInteger();
    public static Paint N;
    public static Drawable O;
    public String E;
    public ic1 F;
    public org.telegram.ui.Cells.da[] G;
    public boolean H;
    public long I;
    public boolean J;
    public final RectF K;
    public boolean L;
    public final TL_iv.pageBlockEmbed f26866a;
    public nb1 f26867b;
    public final boolean f26868c;
    public int d;
    public final Path e;
    public final float[] f26869f;
    public final int h;
    public ub1 f26870n;
    public boolean f26871r;
    public long f26872s;
    public boolean v;
    public final xa0 f26873w;
    public int f26874x;
    public int f26875y;

    public bn0(RichMessageLayout richMessageLayout, Rect rect, int i10, TL_iv.pageBlockEmbed pageblockembed, boolean z10) {
        super(richMessageLayout, rect, i10);
        bn0 bn0Var;
        this.e = new Path();
        this.f26869f = new float[8];
        this.h = M.incrementAndGet();
        this.f26873w = new xa0(this, 22);
        this.K = new RectF();
        this.f26866a = pageblockembed;
        this.f26868c = z10;
        this.f26867b = jb1.i(pageblockembed.url);
        this.f26874x = m();
        String k10 = jb1.k(pageblockembed.url, this.f26867b, u());
        this.E = k10;
        if (k10.equals("placeholder") || this.E.startsWith("cache of width")) {
            AndroidUtilities.runOnUIThread(new bi.u8(pageblockembed.url, u(), richMessageLayout.isOut(), 5));
        }
        String str = pageblockembed.url;
        ConcurrentHashMap concurrentHashMap = jb1.f29624a;
        gb1 gb1Var = (gb1) concurrentHashMap.get(str);
        if (gb1Var == null) {
            bn0Var = null;
        } else {
            bn0Var = gb1Var.f28527t;
        }
        if (bn0Var != null && bn0Var != this && bn0Var.f26874x != this.f26874x) {
            o(bn0Var.f26874x, "new layout, width " + Math.round(bn0Var.u() / AndroidUtilities.density) + " -> " + Math.round(u() / AndroidUtilities.density), bn0Var.E, false);
        }
        gb1 gb1Var2 = (gb1) concurrentHashMap.get(pageblockembed.url);
        if (gb1Var2 != null) {
            gb1Var2.f28527t = this;
        }
    }

    public static int l() {
        int i10;
        int i11 = SharedConfig.bubbleRadius;
        if (i11 >= 15) {
            i10 = AndroidUtilities.dp(2.0f);
        } else if (i11 >= 11) {
            i10 = AndroidUtilities.dp(1.0f);
        } else {
            i10 = 0;
        }
        return (AndroidUtilities.dp(9.0f) + i10) - AndroidUtilities.dp(2.0f);
    }

    @Override
    public final void b() {
        org.telegram.ui.Cells.s1 cell = this.root.getCell();
        if (cell != null && cell.Jc != null) {
            try {
                cell.performHapticFeedback(0);
            } catch (Exception unused) {
            }
            cell.Jc.j0(cell, cell.f25103g1, cell.f25116h1);
        }
    }

    @Override
    public final void c(String str) {
        View view = this.view;
        if (view != null && Build.VERSION.SDK_INT >= 24) {
            an0.a(view, str);
        }
    }

    @Override
    public final void d() {
        ac1 l4;
        ic1 ic1Var;
        nb1 nb1Var = this.f26867b;
        if (nb1Var == null) {
            l4 = null;
        } else {
            l4 = nb1Var.l();
        }
        if (l4 == null) {
            ic1Var = null;
        } else {
            ic1Var = l4.f26508f;
        }
        if (ic1Var != this.F) {
            this.F = ic1Var;
            if (ic1Var == null) {
                this.G = null;
            } else {
                ArrayList arrayList = ic1Var.f29315a;
                this.G = new org.telegram.ui.Cells.da[arrayList.size()];
                int i10 = 0;
                while (true) {
                    org.telegram.ui.Cells.da[] daVarArr = this.G;
                    if (i10 >= daVarArr.length) {
                        break;
                    }
                    daVarArr[i10] = new li.a0(this, (gc1) arrayList.get(i10));
                    i10++;
                }
            }
            this.root.reposition();
        }
        View view = this.view;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final void e() {
        ac1 ac1Var;
        xa0 xa0Var = this.f26873w;
        AndroidUtilities.cancelRunOnUIThread(xa0Var);
        if (!this.v) {
            dc1 dc1Var = this.f26867b.f30841f;
            if (dc1Var != null && (ac1Var = dc1Var.E) != null && (ac1Var.f26509g || dc1Var.f27414w)) {
                this.v = true;
                this.f26872s = SystemClock.uptimeMillis();
                if (m() != this.f26874x) {
                    r("on screen, loaded", true);
                    return;
                }
                return;
            }
            AndroidUtilities.runOnUIThread(xa0Var, 1500L);
        } else if (SystemClock.uptimeMillis() - this.f26872s < 1500) {
            AndroidUtilities.runOnUIThread(xa0Var, 200L);
        } else if (m() != this.f26874x) {
            r("on screen", true);
        }
    }

    @Override
    public final int getHeight() {
        Rect rect = this.padding;
        return rect.top + this.f26874x + rect.bottom;
    }

    @Override
    public final org.telegram.ui.Cells.da[] getText() {
        return this.G;
    }

    @Override
    public final boolean isHorizontallyDragging() {
        ub1 ub1Var = this.f26870n;
        if (ub1Var != null && this.f26871r && ub1Var.f33353w && (ub1Var.K & 3) != 2) {
            if (ub1Var.f33356z || ub1Var.n()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean k() {
        gb1 gb1Var;
        boolean z10;
        String str = this.f26866a.url;
        nb1 nb1Var = this.f26867b;
        if (nb1Var != null) {
            ConcurrentHashMap concurrentHashMap = jb1.f29624a;
            if (nb1Var.f30843i > 0) {
                return nb1Var.f30846l;
            }
        }
        hb1 hb1Var = null;
        if (jb1.m(str)) {
            gb1Var = (gb1) jb1.f29624a.get(str);
        } else {
            gb1Var = null;
        }
        if (gb1Var != null) {
            hb1Var = (hb1) jb1.f29625b.get(gb1Var.a());
        }
        if (hb1Var != null) {
            synchronized (hb1Var) {
                if (!hb1Var.f28950a.isEmpty() && ((int[]) hb1Var.f28950a.get(0)).length > 2) {
                    if (((int[]) hb1Var.f28950a.get(0))[2] != 0) {
                        z10 = true;
                    }
                }
                z10 = false;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public final int m() {
        return jb1.d(this.f26866a.url, this.f26867b, u());
    }

    public final View n() {
        return this.view;
    }

    public final void o(int i10, String str, String str2, boolean z10) {
        long j10;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        if (!BuildVars.LOGS_ENABLED) {
            return;
        }
        long j11 = -1;
        if (this.f26871r) {
            j10 = SystemClock.uptimeMillis() - this.f26872s;
        } else {
            j10 = -1;
        }
        ub1 ub1Var = this.f26870n;
        if (ub1Var != null && ub1Var.f33350s != 0) {
            j11 = SystemClock.uptimeMillis() - ub1Var.f33350s;
        }
        StringBuilder sb2 = new StringBuilder("widget height ");
        sb2.append(this.f26866a.url.substring(10));
        sb2.append(": ");
        sb2.append(str);
        sb2.append(", ");
        sb2.append(Math.round(i10 / AndroidUtilities.density));
        sb2.append(" (");
        sb2.append(str2);
        sb2.append(") -> ");
        sb2.append(Math.round(this.f26874x / AndroidUtilities.density));
        sb2.append(" (");
        sb2.append(this.E);
        sb2.append("), width ");
        sb2.append(Math.round(u() / AndroidUtilities.density));
        String str9 = "";
        if (!z10) {
            str3 = "";
        } else {
            str3 = ", animated";
        }
        sb2.append(str3);
        if (this.view != null) {
            str4 = ", on screen";
        } else {
            str4 = ", off screen";
        }
        sb2.append(str4);
        if (j10 >= 0) {
            str5 = b10.i(j10, ", running ", " ms");
        } else {
            str5 = ", not running";
        }
        sb2.append(str5);
        if (this.f26867b != null) {
            StringBuilder sb3 = new StringBuilder(", session ");
            sb3.append(this.f26867b.f30851q);
            if (this.f26867b.f30842g == null) {
                str7 = "";
            } else {
                str7 = " (snapshot)";
            }
            sb3.append(str7);
            dc1 dc1Var = this.f26867b.f30841f;
            if (dc1Var != null && dc1Var.f27417z) {
                str8 = "";
            } else {
                str8 = ", scripts held";
            }
            sb3.append(str8);
            str6 = sb3.toString();
        } else {
            str6 = ", no widget yet";
        }
        sb2.append(str6);
        if (j11 >= 0 && j11 < 5000) {
            str9 = b10.i(j11, ", touched ", " ms ago");
        }
        ic.a.w(str9, sb2);
    }

    @Override
    public final void onAttachedToWindow() {
        nb1 nb1Var = this.f26867b;
        TL_iv.pageBlockEmbed pageblockembed = this.f26866a;
        if (nb1Var == null) {
            this.f26867b = jb1.i(pageblockembed.url);
        }
        if (this.f26867b == null) {
            return;
        }
        if (this.f26870n == null) {
            this.f26870n = new ub1(this, AndroidUtilities.density);
        }
        gb1 gb1Var = (gb1) jb1.f29624a.get(pageblockembed.url);
        if (gb1Var != null) {
            ArrayList arrayList = gb1Var.f28528u;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            boolean z10 = false;
            if (jb1.o(arrayList) != this) {
                ub1 ub1Var = this.f26870n;
                nb1 nb1Var2 = this.f26867b;
                ub1Var.q();
                ub1Var.f33347p = nb1Var2;
                if (nb1Var2 != null) {
                    z10 = true;
                }
                ub1Var.f33349r = z10;
                return;
            }
            bn0 bn0Var = gb1Var.v;
            gb1Var.v = this;
            if (bn0Var != null && bn0Var != this && bn0Var.f26871r && bn0Var.f26870n != null) {
                bn0Var.t();
                ub1 ub1Var2 = bn0Var.f26870n;
                nb1 nb1Var3 = bn0Var.f26867b;
                ub1Var2.q();
                ub1Var2.f33347p = nb1Var3;
                if (nb1Var3 != null) {
                    z10 = true;
                }
                ub1Var2.f33349r = z10;
                View view = bn0Var.view;
                if (view != null) {
                    view.invalidate();
                }
            }
        }
        s();
    }

    @Override
    public final void onDetachedFromWindow() {
        ub1 ub1Var;
        if (this.f26870n != null) {
            t();
            this.f26870n.q();
            gb1 gb1Var = (gb1) jb1.f29624a.get(this.f26866a.url);
            if (gb1Var != null) {
                ArrayList arrayList = gb1Var.f28528u;
                arrayList.remove(this);
                if (gb1Var.v == this) {
                    bn0 o10 = jb1.o(arrayList);
                    gb1Var.v = o10;
                    if (o10 != null && !o10.f26871r && o10.view != null && (ub1Var = o10.f26870n) != null && o10.f26867b != null) {
                        ub1Var.q();
                        o10.s();
                        o10.view.invalidate();
                    }
                }
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.u6 u6Var;
        int max;
        org.telegram.ui.Cells.r1 r1Var;
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        int i10;
        View view;
        org.telegram.ui.ActionBar.u6 u6Var2;
        if (this.f26870n == null) {
            return;
        }
        int i11 = this.d;
        org.telegram.ui.Cells.s1 cell = this.root.getCell();
        gb1 gb1Var = null;
        if (cell != null) {
            u6Var = cell.getResourcesProvider();
        } else {
            u6Var = null;
        }
        if (i11 != ec1.e(u6Var, this.root.isOut())) {
            org.telegram.ui.Cells.s1 cell2 = this.root.getCell();
            if (cell2 != null) {
                u6Var2 = cell2.getResourcesProvider();
            } else {
                u6Var2 = null;
            }
            this.d = ec1.e(u6Var2, this.root.isOut());
            this.f26867b.o(ec1.a(u6Var2, this.root.isOut()));
        }
        if (isInQuote()) {
            max = 0;
        } else {
            max = Math.max(0, Math.min(l(), this.root.padLeft - AndroidUtilities.dp(2.0f)));
        }
        this.f26875y = max;
        int u10 = u();
        float f14 = this.f26874x;
        if (this.I != 0 && this.root.getCell() != null) {
            r1Var = this.root.getCell().getTransitionParams();
        } else {
            r1Var = null;
        }
        if (r1Var != null && r1Var.f24943w0) {
            this.J = true;
            f10 = r1Var.f24889j0 + 0.0f;
            f14 += r1Var.f24884i0;
            if (k()) {
                f7 = r1Var.f24884i0;
            } else {
                f7 = r1Var.f24889j0;
            }
        } else {
            if (r1Var != null && (this.J || SystemClock.uptimeMillis() - this.I > 250)) {
                this.I = 0L;
                this.J = false;
            }
            f7 = 0.0f;
            f10 = 0.0f;
        }
        if (k()) {
            f7 += this.f26874x - m();
        }
        canvas.save();
        canvas.translate(-this.f26875y, 0.0f);
        this.e.rewind();
        boolean z10 = this.f26868c;
        int i12 = SharedConfig.bubbleRadius;
        if (i12 > 2) {
            i12 -= 2;
        }
        int dp = AndroidUtilities.dp(i12);
        int min = Math.min(AndroidUtilities.dp(3.0f), dp);
        if (z10 && !this.root.hasNameOffset() && (this.root.isOut() || !this.root.isPinnedTop())) {
            f11 = dp;
        } else {
            f11 = min;
        }
        if (z10 && (!this.root.isOut() || !this.root.isPinnedTop())) {
            f12 = dp;
        } else {
            f12 = min;
        }
        float[] fArr = this.f26869f;
        fArr[1] = f11;
        fArr[0] = f11;
        fArr[3] = f12;
        fArr[2] = f12;
        float f15 = min;
        fArr[7] = f15;
        fArr[6] = f15;
        fArr[5] = f15;
        fArr[4] = f15;
        RectF rectF = AndroidUtilities.rectTmp;
        float f16 = u10;
        rectF.set(0.0f, f10, f16, f14);
        this.e.addRoundRect(rectF, this.f26869f, Path.Direction.CW);
        canvas.clipPath(this.e);
        canvas.translate(0.0f, f7);
        if (this.f26870n.b(canvas, u10) && (view = this.view) != null) {
            view.postInvalidateOnAnimation();
        }
        canvas.restore();
        String str = this.f26866a.url;
        if (jb1.m(str)) {
            gb1Var = (gb1) jb1.f29624a.get(str);
        }
        if (gb1Var != null && gb1Var.f28516i) {
            if (N == null) {
                N = new Paint(1);
                Drawable mutate = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.msg_language).mutate();
                O = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            }
            float dp2 = AndroidUtilities.dp(10.0f);
            float dp3 = AndroidUtilities.dp(7.0f);
            if (LocaleController.isRTL) {
                f13 = dp3 + dp2;
            } else {
                f13 = (f16 - dp3) - dp2;
            }
            float max2 = Math.max(0.0f, f10) + dp3 + dp2;
            this.K.set(f13 - dp2, max2 - dp2, f13 + dp2, max2 + dp2);
            canvas.save();
            canvas.translate(-this.f26875y, 0.0f);
            Paint paint = N;
            if (this.L) {
                i10 = 1929379840;
            } else {
                i10 = 1291845632;
            }
            paint.setColor(i10);
            canvas.drawCircle(f13, max2, dp2, N);
            float dp4 = AndroidUtilities.dp(14.0f) / 2.0f;
            O.setBounds((int) (f13 - dp4), (int) (max2 - dp4), (int) (f13 + dp4), (int) (max2 + dp4));
            O.draw(canvas);
            canvas.restore();
            return;
        }
        this.K.setEmpty();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        gb1 gb1Var;
        if (this.f26870n != null && this.f26871r) {
            String str = this.f26866a.url;
            if (jb1.m(str)) {
                gb1Var = (gb1) jb1.f29624a.get(str);
            } else {
                gb1Var = null;
            }
            if (gb1Var == null || !gb1Var.f28518k) {
                motionEvent.offsetLocation(this.f26875y, 0.0f);
                try {
                    if (p(motionEvent)) {
                        motionEvent.offsetLocation(-this.f26875y, 0.0f);
                        return true;
                    }
                    return this.f26870n.m(motionEvent);
                } finally {
                    motionEvent.offsetLocation(-this.f26875y, 0.0f);
                }
            }
            return false;
        }
        return false;
    }

    public final boolean p(MotionEvent motionEvent) {
        View view;
        int actionMasked = motionEvent.getActionMasked();
        boolean z10 = false;
        if (actionMasked == 0) {
            float dp = AndroidUtilities.dp(6.0f);
            RectF rectF = this.K;
            if (!rectF.isEmpty() && motionEvent.getX() >= rectF.left - dp && motionEvent.getX() <= rectF.right + dp && motionEvent.getY() >= rectF.top - dp && motionEvent.getY() <= rectF.bottom + dp) {
                z10 = true;
            }
            this.L = z10;
            if (z10 && (view = this.view) != null) {
                view.invalidate();
            }
            return this.L;
        } else if (!this.L) {
            return false;
        } else {
            if (actionMasked == 1 || actionMasked == 3) {
                this.L = false;
                View view2 = this.view;
                if (view2 != null) {
                    view2.invalidate();
                }
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if (actionMasked == 1 && U != null) {
                    org.telegram.messenger.t.q(R.string.WidgetNetworkMarker, wc.b0(U), R.raw.info, 36);
                }
            }
            return true;
        }
    }

    public final void q(String str) {
        if (this.view != null) {
            nb1 nb1Var = this.f26867b;
            if ((nb1Var == null || nb1Var.f30843i <= 0) && m() != this.f26874x) {
                r("on screen: ".concat(str), false);
                return;
            }
            return;
        }
        int m10 = m();
        int i10 = this.f26874x;
        if (m10 == i10) {
            return;
        }
        String str2 = this.E;
        this.f26874x = m10;
        this.E = jb1.k(this.f26866a.url, this.f26867b, u());
        o(i10, "away: ".concat(str), str2, false);
        this.root.reposition();
        MessageObject messageObject = this.root.messageObject;
        if (messageObject != null) {
            messageObject.forceUpdate = true;
        }
        this.H = true;
    }

    public final void r(String str, boolean z10) {
        boolean z11;
        int m10 = m();
        int i10 = this.f26874x;
        boolean z12 = false;
        if (m10 != i10) {
            z11 = true;
        } else {
            z11 = false;
        }
        String str2 = this.E;
        this.f26874x = m10;
        this.E = jb1.k(this.f26866a.url, this.f26867b, u());
        if (z11) {
            o(i10, str, str2, z10);
        }
        if (z11) {
            this.root.reposition();
        }
        if (z11 && z10) {
            this.I = SystemClock.uptimeMillis();
            this.J = false;
        }
        RichMessageLayout richMessageLayout = this.root;
        MessageObject messageObject = richMessageLayout.messageObject;
        if (messageObject != null) {
            messageObject.forceUpdate = true;
        }
        org.telegram.ui.Cells.s1 cell = richMessageLayout.getCell();
        org.telegram.ui.Cells.j1 delegate = this.root.getDelegate();
        View view = this.view;
        if (view != null && cell != null && delegate != null) {
            if (z11 && !k() && (cell.getParent() instanceof RecyclerView)) {
                View view2 = (View) cell.getParent();
                if (cell.getBottom() > view2.getPaddingTop() && cell.getTop() < view2.getHeight() - view2.getPaddingBottom()) {
                    z12 = true;
                }
            }
            if (z10) {
                delegate.l1(cell, z12, z12);
            } else {
                delegate.y0(cell, z12, z12);
            }
        } else if (view != null) {
            view.requestLayout();
        }
    }

    public final void s() {
        boolean z10;
        org.telegram.ui.ActionBar.u6 u6Var;
        MessageObject messageObject;
        ac1 ac1Var;
        boolean z11 = true;
        this.f26871r = true;
        this.f26872s = SystemClock.uptimeMillis();
        dc1 dc1Var = this.f26867b.f30841f;
        if (dc1Var != null && (ac1Var = dc1Var.E) != null && (ac1Var.f26509g || dc1Var.f27414w)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.v = z10;
        this.f26867b.q(u());
        org.telegram.ui.Cells.s1 cell = this.root.getCell();
        if (cell != null) {
            u6Var = cell.getResourcesProvider();
        } else {
            u6Var = null;
        }
        this.d = ec1.e(u6Var, this.root.isOut());
        this.f26867b.o(ec1.a(u6Var, this.root.isOut()));
        ub1 ub1Var = this.f26870n;
        nb1 nb1Var = this.f26867b;
        if (ub1Var.f33347p != nb1Var) {
            ub1Var.q();
            ub1Var.f33347p = nb1Var;
            if (nb1Var != null) {
                nb1Var.h = ub1Var;
                nb1Var.p(ub1Var.f33348q);
            }
        }
        this.f26870n.p(true);
        gb1 gb1Var = (gb1) jb1.f29624a.get(this.f26866a.url);
        if (gb1Var != null) {
            gb1Var.f28527t = this;
        }
        jb1.r(this.f26867b);
        if (!this.H || (messageObject = this.root.messageObject) == null || !messageObject.forceUpdate) {
            z11 = false;
        }
        this.H = false;
        if (!z11 && m() == this.f26874x) {
            return;
        }
        AndroidUtilities.runOnUIThread(new d60(1, this, z11));
    }

    public final void t() {
        if (this.f26871r) {
            this.f26871r = false;
            AndroidUtilities.cancelRunOnUIThread(this.f26873w);
            this.f26870n.p(false);
            this.f26870n.q();
            nb1 nb1Var = this.f26867b;
            if (nb1Var != null) {
                jb1.q(nb1Var);
            }
        }
    }

    public final int u() {
        return (l() * 2) + this.maxWidth;
    }
}
