package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class nc0 extends org.telegram.ui.Components.jw0 implements r0.m {
    public final int f39419w0 = 1;
    public final b2.u0 f39420x0;
    public boolean f39421y0;
    public final org.telegram.ui.ActionBar.n2 f39422z0;

    public nc0(org.telegram.ui.Wallet.l5 l5Var, Context context) {
        super(context, null);
        this.f39422z0 = l5Var;
        this.f39420x0 = new Object();
    }

    @Override
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        fc0 fc0Var;
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        org.telegram.ui.Components.im0 currentListView;
        int max;
        org.telegram.ui.Components.a71 t02;
        org.telegram.ui.Wallet.h5 h5Var;
        switch (this.f39419w0) {
            case 0:
                pc0 pc0Var = (pc0) this.f39422z0;
                if (viewGroup == pc0Var.U && (fc0Var = pc0Var.K0) != null && fc0Var.isAttachedToWindow()) {
                    kVar = ((org.telegram.ui.ActionBar.n2) pc0Var).actionBar;
                    boolean z10 = kVar.f21493n0;
                    int top = pc0Var.K0.getTop();
                    boolean z11 = false;
                    if (i11 < 0) {
                        if (top <= 0 && (currentListView = pc0Var.K0.getCurrentListView()) != null) {
                            int L0 = ((s4.b0) currentListView.getLayoutManager()).L0();
                            int i14 = -1;
                            if (L0 != -1) {
                                s4.b1 K = currentListView.K(L0);
                                if (K != null) {
                                    i14 = K.f45938a.getTop();
                                }
                                int paddingTop = currentListView.getPaddingTop();
                                if (i14 != paddingTop || L0 != 0) {
                                    if (L0 != 0) {
                                        max = i11;
                                    } else {
                                        max = Math.max(i11, i14 - paddingTop);
                                    }
                                    iArr[1] = max;
                                    currentListView.scrollBy(0, i11);
                                    z11 = true;
                                }
                            }
                        }
                        if (z10) {
                            if (!z11 && top < 0) {
                                iArr[1] = i11 - Math.max(top, i11);
                                return;
                            } else {
                                iArr[1] = i11;
                                return;
                            }
                        }
                        return;
                    } else if (z10) {
                        org.telegram.ui.Components.im0 currentListView2 = pc0Var.K0.getCurrentListView();
                        iArr[1] = i11;
                        if (top > 0) {
                            iArr[1] = 0;
                        }
                        if (currentListView2 != null && (i13 = iArr[1]) > 0) {
                            currentListView2.scrollBy(0, i13);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                org.telegram.ui.Wallet.l5 l5Var = (org.telegram.ui.Wallet.l5) this.f39422z0;
                if (!this.f39421y0 && (t02 = l5Var.t0()) != null) {
                    if (i11 != 0 && i12 == 0 && ((viewGroup == l5Var.f31190a || viewGroup == t02) && (h5Var = l5Var.f34499r0) != null && h5Var.f34263f)) {
                        h5Var.d = true;
                    }
                    if (viewGroup == l5Var.f31190a && i11 < 0 && a0()) {
                        iArr[1] = d0(t02, i11) + iArr[1];
                        return;
                    } else if (viewGroup == t02 && i11 > 0) {
                        iArr[1] = d0(l5Var.f31190a, i11) + iArr[1];
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public void L(Canvas canvas, ArrayList arrayList) {
        switch (this.f39419w0) {
            case 0:
                pc0 pc0Var = (pc0) this.f39422z0;
                if (pc0Var.K0 != null) {
                    canvas.save();
                    canvas.translate(0.0f, pc0Var.U.getY());
                    pc0Var.K0.Q(canvas, arrayList);
                    canvas.restore();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void Z() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        org.telegram.ui.Wallet.h5 h5Var = ((org.telegram.ui.Wallet.l5) this.f39422z0).f34499r0;
        if (h5Var != null) {
            h5Var.e(obtain);
        }
        super.dispatchTouchEvent(obtain);
        obtain.recycle();
    }

    public boolean a0() {
        org.telegram.ui.Wallet.l5 l5Var = (org.telegram.ui.Wallet.l5) this.f39422z0;
        ai.r rVar = l5Var.f34495o0;
        if (rVar != null && (rVar.getParent() instanceof View) && ((View) l5Var.f34495o0.getParent()).getTop() <= l5Var.f31190a.getPaddingTop()) {
            return true;
        }
        return false;
    }

    @Override
    public final void b(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
        switch (this.f39419w0) {
            case 0:
                return;
            default:
                i(viewGroup, i10, i11, i12, i13, i14, new int[2]);
                return;
        }
    }

    public int d0(org.telegram.ui.Components.a71 a71Var, int i10) {
        int[] iArr = {0};
        org.telegram.ui.Components.kv kvVar = new org.telegram.ui.Components.kv(iArr, 15);
        this.f39421y0 = true;
        a71Var.j(kvVar);
        try {
            a71Var.scrollBy(0, i10);
            ArrayList arrayList = a71Var.f3633w0;
            if (arrayList != null) {
                arrayList.remove(kvVar);
            }
            this.f39421y0 = false;
            return iArr[0];
        } catch (Throwable th2) {
            ArrayList arrayList2 = a71Var.f3633w0;
            if (arrayList2 != null) {
                arrayList2.remove(kvVar);
            }
            this.f39421y0 = false;
            throw th2;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Wallet.h5 h5Var;
        boolean z10;
        boolean z11;
        boolean z12;
        float f7;
        float f10;
        boolean z13;
        org.telegram.ui.Wallet.v7 v7Var;
        float f11;
        boolean z14;
        boolean z15;
        int i10;
        long j10;
        boolean z16;
        org.telegram.ui.Wallet.v7 v7Var2;
        switch (this.f39419w0) {
            case 1:
                org.telegram.ui.Wallet.l5 l5Var = (org.telegram.ui.Wallet.l5) this.f39422z0;
                org.telegram.ui.Wallet.w7 w7Var = l5Var.f34491k0;
                char c10 = 1;
                if (w7Var != null) {
                    org.telegram.ui.Wallet.o7 o7Var = w7Var.f35093w1;
                    LinkedHashMap linkedHashMap = w7Var.f35055f;
                    org.telegram.ui.Wallet.o7 o7Var2 = w7Var.f35090v1;
                    boolean z17 = false;
                    if (!w7Var.f35045b) {
                        if (!w7Var.V0 && !w7Var.f35071n0 && w7Var.C()) {
                            if (w7Var.f35050c1) {
                                w7Var.h0();
                            }
                            int actionMasked = motionEvent.getActionMasked();
                            int i11 = 2;
                            if (actionMasked == 0) {
                                w7Var.removeCallbacks(o7Var2);
                                w7Var.removeCallbacks(o7Var);
                                w7Var.f35058g0 = null;
                                w7Var.f35064j0 = false;
                                w7Var.f35062i0 = false;
                                w7Var.f35060h0 = false;
                                w7Var.f35068l0 = false;
                                w7Var.f35066k0 = false;
                                w7Var.f35077q0 = motionEvent.getPointerId(0);
                                float x10 = motionEvent.getX();
                                float y3 = motionEvent.getY();
                                float[] fArr = {x10, y3};
                                w7Var.f35082s.mapPoints(fArr);
                                for (org.telegram.ui.Wallet.v7 v7Var3 : linkedHashMap.values()) {
                                    boolean z18 = z17;
                                    if (v7Var3.H == i11) {
                                        if (Utilities.dist(fArr[z18 ? 1 : 0], fArr[c10], v7Var3.e.f34937a, v7Var3.f35000f.f34937a) < w7Var.W() * v7Var3.h.f34937a * 0.48f && ((v7Var2 = w7Var.f35058g0) == null || v7Var3.I > v7Var2.I)) {
                                            w7Var.f35058g0 = v7Var3;
                                        }
                                        z17 = z18 ? 1 : 0;
                                        c10 = 1;
                                        i11 = 2;
                                    } else {
                                        z17 = z18 ? 1 : 0;
                                    }
                                }
                                z10 = z17;
                                org.telegram.ui.Wallet.v7 v7Var4 = w7Var.f35058g0;
                                if (v7Var4 != null) {
                                    z15 = true;
                                } else {
                                    z15 = z10;
                                }
                                w7Var.f35075p0 = z15;
                                if (v7Var4 == null) {
                                    Iterator it = linkedHashMap.values().iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            org.telegram.ui.Wallet.v7 v7Var5 = (org.telegram.ui.Wallet.v7) it.next();
                                            RectF b02 = w7Var.b0(v7Var5);
                                            if (b02 != null && b02.contains(x10, y3)) {
                                                if (org.telegram.ui.Wallet.w7.b(v7Var5)) {
                                                    if (Math.abs(x10 - b02.centerX()) < b02.width() * 0.35f && Math.abs(y3 - b02.centerY()) < b02.height() * 0.35f) {
                                                        z16 = true;
                                                    } else {
                                                        z16 = z10;
                                                    }
                                                    w7Var.m0 = z16;
                                                    w7Var.f35058g0 = v7Var5;
                                                }
                                            }
                                        }
                                    }
                                }
                                org.telegram.ui.Wallet.v7 v7Var6 = w7Var.f35058g0;
                                if (v7Var6 != null && ((i10 = v7Var6.H) == 0 || i10 == 2)) {
                                    w7Var.f35083s0 = x10;
                                    w7Var.f35085t0 = y3;
                                    SystemClock.uptimeMillis();
                                    org.telegram.ui.Wallet.v7 v7Var7 = w7Var.f35058g0;
                                    w7Var.F0 = v7Var7.H;
                                    w7Var.B0 = v7Var7.e.f34938b;
                                    w7Var.C0 = v7Var7.f35000f.f34938b;
                                    w7Var.E0 = v7Var7.f35002i.f34938b;
                                    w7Var.D0 = v7Var7.h.f34938b;
                                    VelocityTracker velocityTracker = w7Var.J0;
                                    if (velocityTracker != null) {
                                        velocityTracker.recycle();
                                    }
                                    VelocityTracker obtain = VelocityTracker.obtain();
                                    w7Var.J0 = obtain;
                                    obtain.addMovement(motionEvent);
                                    if (w7Var.f35075p0) {
                                        j10 = 450;
                                    } else {
                                        j10 = 500;
                                    }
                                    w7Var.postDelayed(o7Var2, j10);
                                    if (w7Var.f35075p0) {
                                        w7Var.f35066k0 = true;
                                        w7Var.getParent().requestDisallowInterceptTouchEvent(true);
                                        w7Var.h0();
                                        z17 = true;
                                    } else {
                                        w7Var.f35068l0 = true;
                                        w7Var.postDelayed(o7Var, 170L);
                                    }
                                } else {
                                    w7Var.f35058g0 = null;
                                }
                                z17 = z10;
                            } else {
                                z10 = false;
                                if (w7Var.f35066k0 || w7Var.f35068l0) {
                                    VelocityTracker velocityTracker2 = w7Var.J0;
                                    if (velocityTracker2 != null) {
                                        velocityTracker2.addMovement(motionEvent);
                                    }
                                    int findPointerIndex = motionEvent.findPointerIndex(w7Var.f35077q0);
                                    if (actionMasked == 6 && motionEvent.getPointerId(motionEvent.getActionIndex()) == w7Var.f35077q0) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (findPointerIndex < 0) {
                                        if (w7Var.f35068l0) {
                                            w7Var.a();
                                        } else {
                                            w7Var.x(0.0f, 0.0f, true);
                                        }
                                    } else {
                                        float x11 = motionEvent.getX(findPointerIndex);
                                        float y10 = motionEvent.getY(findPointerIndex);
                                        if (w7Var.f35068l0) {
                                            if (actionMasked == 2 && Utilities.dist(x11, y10, w7Var.f35083s0, w7Var.f35085t0) > ViewConfiguration.get(w7Var.getContext()).getScaledTouchSlop()) {
                                                if (w7Var.m0 && w7Var.f35058g0.H == 0) {
                                                    w7Var.f35068l0 = false;
                                                    w7Var.f35066k0 = true;
                                                    w7Var.removeCallbacks(o7Var);
                                                    ((nc0) w7Var.d.f17035b).Z();
                                                    w7Var.getParent().requestDisallowInterceptTouchEvent(true);
                                                    w7Var.Y(w7Var.f35058g0, x11, y10);
                                                    w7Var.q(w7Var.f35058g0, x11, y10);
                                                    w7Var.h0();
                                                } else {
                                                    w7Var.a();
                                                }
                                            } else if (actionMasked == 1 || actionMasked == 3 || z11) {
                                                w7Var.a();
                                            }
                                            z17 = false;
                                        } else {
                                            if (actionMasked == 2 && (v7Var = w7Var.f35058g0) != null) {
                                                if (w7Var.f35062i0) {
                                                    org.telegram.ui.Wallet.u7 u7Var = v7Var.e;
                                                    org.telegram.ui.Wallet.u7 u7Var2 = v7Var.h;
                                                    float[] P = w7Var.P(u7Var.f34937a, v7Var.f35000f.f34937a);
                                                    float dist = Utilities.dist(x11, y10, P[0], P[1]);
                                                    if (Float.isNaN(w7Var.f35100z0)) {
                                                        w7Var.f35100z0 = dist;
                                                        w7Var.A0 = u7Var2.f34938b;
                                                    }
                                                    if (Math.abs(dist - w7Var.f35100z0) > AndroidUtilities.dp(5.0f)) {
                                                        org.telegram.ui.Wallet.u7 u7Var3 = v7Var.f35010q;
                                                        f11 = 5.0f;
                                                        u7Var3.d = 700.0f;
                                                        u7Var3.e = 1.0f;
                                                        u7Var3.f34938b = 1.0f;
                                                    } else {
                                                        f11 = 5.0f;
                                                    }
                                                    float dp = AndroidUtilities.dp(32.0f) / w7Var.W();
                                                    u7Var2.d = 900.0f;
                                                    u7Var2.e = 1.0f;
                                                    u7Var2.f34938b = Math.max(dp, Math.min(1.1f, ((1.1f - dp) * ((dist - w7Var.f35100z0) / AndroidUtilities.dp(110.0f))) + w7Var.A0));
                                                    if (dist < AndroidUtilities.dp(14.0f)) {
                                                        w7Var.f35092w0 = Float.NaN;
                                                        z12 = false;
                                                    } else {
                                                        z12 = false;
                                                        float degrees = (float) Math.toDegrees(Math.atan2(y10 - P[1], x11 - P[0]));
                                                        if (!Float.isNaN(w7Var.f35092w0)) {
                                                            w7Var.f35095x0 = org.telegram.ui.Wallet.w7.c(degrees - w7Var.f35092w0) + w7Var.f35095x0;
                                                        }
                                                        w7Var.f35092w0 = degrees;
                                                        float f12 = w7Var.f35098y0 + w7Var.f35095x0;
                                                        float round = Math.round(f12 / 90.0f) * 90;
                                                        if (Math.abs(f12 - round) < f11) {
                                                            z14 = true;
                                                        } else {
                                                            z14 = false;
                                                        }
                                                        if (z14 && !w7Var.G0) {
                                                            w7Var.performHapticFeedback(4);
                                                        }
                                                        w7Var.G0 = z14;
                                                        org.telegram.ui.Wallet.u7 u7Var4 = v7Var.f35002i;
                                                        u7Var4.d = 900.0f;
                                                        u7Var4.e = 0.95f;
                                                        if (z14) {
                                                            f12 = round;
                                                        }
                                                        u7Var4.f34938b = f12;
                                                    }
                                                } else {
                                                    z12 = false;
                                                    if (Utilities.dist(x11, y10, w7Var.f35083s0, w7Var.f35085t0) > ViewConfiguration.get(w7Var.getContext()).getScaledTouchSlop()) {
                                                        w7Var.removeCallbacks(o7Var2);
                                                        if (!w7Var.f35060h0 && (w7Var.f35075p0 || w7Var.f35058g0.H == 0)) {
                                                            w7Var.Y(w7Var.f35058g0, x11, y10);
                                                        }
                                                        if (w7Var.f35060h0) {
                                                            w7Var.q(w7Var.f35058g0, x11, y10);
                                                        }
                                                    }
                                                }
                                                w7Var.h0();
                                            } else {
                                                z12 = false;
                                            }
                                            if (actionMasked == 1 || actionMasked == 3 || z11) {
                                                VelocityTracker velocityTracker3 = w7Var.J0;
                                                if (velocityTracker3 != null) {
                                                    velocityTracker3.computeCurrentVelocity(1000);
                                                    f10 = w7Var.J0.getXVelocity(w7Var.f35077q0);
                                                    f7 = w7Var.J0.getYVelocity(w7Var.f35077q0);
                                                } else {
                                                    f7 = 0.0f;
                                                    f10 = 0.0f;
                                                }
                                                if (actionMasked == 3) {
                                                    z13 = true;
                                                } else {
                                                    z13 = z12;
                                                }
                                                w7Var.x(f10, f7, z13);
                                            }
                                        }
                                    }
                                    z17 = true;
                                }
                                z17 = z10;
                            }
                        } else {
                            z17 = w7Var.f35066k0;
                        }
                    }
                    if (z17) {
                        return true;
                    }
                }
                org.telegram.ui.Wallet.h5 h5Var2 = l5Var.f34499r0;
                if (h5Var2 != null) {
                    h5Var2.e(motionEvent);
                }
                boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getActionMasked() == 1 && (h5Var = l5Var.f34499r0) != null) {
                    org.telegram.ui.Wallet.n nVar = h5Var.f34265i;
                    org.telegram.ui.Components.u61 u61Var = h5Var.f34262c;
                    if (u61Var != null) {
                        u61Var.removeCallbacks(nVar);
                        h5Var.f34262c.post(nVar);
                    }
                }
                return dispatchTouchEvent;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f39419w0) {
            case 0:
                boolean drawChild = super.drawChild(canvas, view, j10);
                pc0 pc0Var = (pc0) this.f39422z0;
                kVar = ((org.telegram.ui.ActionBar.n2) pc0Var).actionBar;
                if (view == kVar) {
                    d5Var = ((org.telegram.ui.ActionBar.n2) pc0Var).parentLayout;
                    if (d5Var != null) {
                        d5Var2 = ((org.telegram.ui.ActionBar.n2) pc0Var).parentLayout;
                        kVar2 = ((org.telegram.ui.ActionBar.n2) pc0Var).actionBar;
                        ((ActionBarLayout) d5Var2).q(canvas, kVar2.getMeasuredHeight());
                    }
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public int getNestedScrollAxes() {
        switch (this.f39419w0) {
            case 1:
                return this.f39420x0.b();
            default:
                return super.getNestedScrollAxes();
        }
    }

    @Override
    public final void i(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        fc0 fc0Var;
        org.telegram.ui.Components.a71 t02;
        switch (this.f39419w0) {
            case 0:
                pc0 pc0Var = (pc0) this.f39422z0;
                try {
                    if (viewGroup == pc0Var.U && (fc0Var = pc0Var.K0) != null && fc0Var.isAttachedToWindow()) {
                        org.telegram.ui.Components.im0 currentListView = pc0Var.K0.getCurrentListView();
                        int top = pc0Var.K0.getTop();
                        if (currentListView != null && top == 0) {
                            iArr[1] = i13;
                            currentListView.scrollBy(0, i13);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    AndroidUtilities.runOnUIThread(new fz(this, 18));
                    return;
                }
            default:
                org.telegram.ui.Wallet.l5 l5Var = (org.telegram.ui.Wallet.l5) this.f39422z0;
                if (!this.f39421y0 && i13 != 0 && (t02 = l5Var.t0()) != null) {
                    if (viewGroup == l5Var.f31190a && a0()) {
                        iArr[1] = d0(t02, i13) + iArr[1];
                        return;
                    } else if (viewGroup == t02 && i13 < 0) {
                        iArr[1] = d0(l5Var.f31190a, i13) + iArr[1];
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public final void n(int i10, View view) {
        switch (this.f39419w0) {
            case 0:
                this.f39420x0.f4056a = 0;
                return;
            default:
                b2.u0 u0Var = this.f39420x0;
                if (i10 == 1) {
                    u0Var.f4057b = 0;
                } else {
                    u0Var.f4056a = 0;
                }
                org.telegram.ui.Wallet.h5 h5Var = ((org.telegram.ui.Wallet.l5) this.f39422z0).f34499r0;
                if (h5Var != null) {
                    org.telegram.ui.Wallet.n nVar = h5Var.f34265i;
                    org.telegram.ui.Components.u61 u61Var = h5Var.f34262c;
                    if (u61Var != null) {
                        u61Var.removeCallbacks(nVar);
                        h5Var.f34262c.post(nVar);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f39419w0) {
            case 0:
                pc0 pc0Var = (pc0) this.f39422z0;
                super.onLayout(z10, i10, i11, i12, i13);
                if (z10) {
                    pc0Var.j0(this.f39421y0);
                    this.f39421y0 = false;
                    return;
                }
                pc0Var.z0(true);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f39419w0) {
            case 1:
                int size = (int) (View.MeasureSpec.getSize(i11) * 0.75f);
                org.telegram.ui.Wallet.l5 l5Var = (org.telegram.ui.Wallet.l5) this.f39422z0;
                if (l5Var.f34493n != size) {
                    l5Var.f34493n = size;
                    org.telegram.ui.Wallet.y4 y4Var = l5Var.d;
                    if (y4Var != null) {
                        y4Var.requestLayout();
                    }
                    org.telegram.ui.Wallet.v4 v4Var = l5Var.e;
                    if (v4Var != null) {
                        v4Var.requestLayout();
                    }
                }
                super.onMeasure(i10, i11);
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public boolean onNestedPreFling(View view, float f7, float f10) {
        org.telegram.ui.Wallet.h5 h5Var;
        switch (this.f39419w0) {
            case 1:
                org.telegram.ui.Wallet.l5 l5Var = (org.telegram.ui.Wallet.l5) this.f39422z0;
                if (view == l5Var.t0() && (h5Var = l5Var.f34499r0) != null) {
                    return h5Var.a((int) f7, (int) f10);
                }
                return false;
            default:
                return super.onNestedPreFling(view, f7, f10);
        }
    }

    @Override
    public void onStopNestedScroll(View view) {
        switch (this.f39419w0) {
            case 0:
                return;
            default:
                super.onStopNestedScroll(view);
                return;
        }
    }

    @Override
    public final boolean p(View view, View view2, int i10, int i11) {
        switch (this.f39419w0) {
            case 0:
                if (((pc0) this.f39422z0).K0 != null && i10 == 2) {
                    return true;
                }
                return false;
            default:
                if ((i10 & 2) != 0) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final void s(View view, View view2, int i10, int i11) {
        switch (this.f39419w0) {
            case 0:
                this.f39420x0.f4056a = i10;
                return;
            default:
                b2.u0 u0Var = this.f39420x0;
                if (i11 == 1) {
                    u0Var.f4057b = i10;
                    return;
                } else {
                    u0Var.f4056a = i10;
                    return;
                }
        }
    }

    public nc0(pc0 pc0Var, Context context) {
        super(context, null);
        this.f39422z0 = pc0Var;
        this.f39421y0 = true;
        this.f39420x0 = new Object();
    }

    private final void c0(View view) {
    }

    private final void b0(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
