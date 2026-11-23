package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.SystemClock;
import android.view.View;
import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.en0;
import org.telegram.ui.Components.ne;
import org.telegram.ui.Components.rc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fc1;
import org.telegram.ui.yb1;
public final class j2 implements wi.l {
    public static j2 h;
    public wi.n f40955a;
    public m f40956b;
    public long f40957c;
    public boolean d;
    public final rc f40958e = new rc(this, 28);
    public boolean f40959f;

    public static void d() {
        boolean z10;
        ?? r52;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z11 = true;
        if (fc1.f47751m1 == null && i2.d() == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        i2 i2Var = null;
        if (sharedInstance != null && z10) {
            if (h == null) {
                h = new j2();
            }
            j2 j2Var = h;
            wi.n nVar = j2Var.f40955a;
            if (nVar == null || !nVar.d()) {
                j2Var.f40955a = l2.j.d().j(j2Var);
            }
            wi.n nVar2 = j2Var.f40955a;
            if (nVar2.f60117c == 2) {
                nVar2.c();
                return;
            }
            if (fc1.f47751m1 == null) {
                i2Var = i2.d();
            }
            wi.n nVar3 = j2Var.f40955a;
            if (i2Var != null) {
                r52 = 1;
            } else {
                r52 = 0;
            }
            if (i2Var == null || !i2Var.f40936e) {
                z11 = false;
            }
            int i7 = nVar3.f60117c;
            if (i7 != 3) {
                nVar3.f60119f = r52;
                nVar3.f60120g = z11;
                if (i7 == 2) {
                    nVar3.d = r52;
                } else {
                    nVar3.f60117c = r52;
                }
                nVar3.f60116b.f();
            }
            j2Var.f40955a.c();
            return;
        }
        j2 j2Var2 = h;
        if (j2Var2 != null) {
            h = null;
            wi.n nVar4 = j2Var2.f40955a;
            if (nVar4 != null) {
                j2Var2.f40955a = null;
                nVar4.f();
            }
        }
    }

    @Override
    public final boolean A1(boolean z10, float f10, en0 en0Var) {
        return false;
    }

    @Override
    public final void B0(View view) {
        m mVar;
        fc1 fc1Var = fc1.f47751m1;
        if (fc1Var != null && (mVar = this.f40956b) == view && !this.f40959f) {
            this.f40959f = true;
            mVar.getClass();
            mVar.f41051r = SystemClock.elapsedRealtime();
            mVar.b();
            fc1Var.f47778k1 = this.f40956b.f41045a;
            fc1Var.l1 = true;
            fc1Var.y();
            try {
                ((WindowManager) fc1Var.f47755b.getSystemService("window")).removeView(fc1Var.f47790u0);
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }

    @Override
    public final boolean C2() {
        return true;
    }

    @Override
    public final void D1(View view) {
        boolean z10;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.getVideoState(false) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        g.f40893a = z10;
        m mVar = (m) view;
        this.f40956b = mVar;
        mVar.b();
        this.f40957c = g.c();
        this.d = m.a(VoIPService.getSharedInstance());
        rc rcVar = this.f40958e;
        org.telegram.messenger.g0.r(rcVar);
        org.telegram.messenger.g0.h3(rcVar, 500L);
        this.f40959f = false;
        if (fc1.f47751m1 == null && i2.d() != null) {
            i2 d = i2.d();
            o2 o2Var = this.f40956b.f41045a;
            d.getClass();
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            if (sharedInstance2 != null) {
                sharedInstance2.setSinks(d.f40939r.d, o2Var.d);
            }
            try {
                d.f40935c.removeView(d.f40933a);
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }

    @Override
    public final void D2(int i7) {
        g.b(i7, false);
        org.telegram.messenger.g0.h3(new ne(21), 300L);
    }

    @Override
    public final void E0(SurfaceTexture surfaceTexture) {
        surfaceTexture.release();
    }

    @Override
    public final View K0() {
        return null;
    }

    @Override
    public final boolean O0() {
        fc1 fc1Var = fc1.f47751m1;
        if (fc1Var != null && fc1Var.f47761d0.isAttachedToWindow()) {
            return true;
        }
        return false;
    }

    @Override
    public final int V1() {
        int i7;
        if (!m.a(VoIPService.getSharedInstance())) {
            return 1;
        }
        n2 a10 = a();
        if (a10 != null && (i7 = a10.rotatedFrameHeight) > 0) {
            return i7;
        }
        return 16;
    }

    public final n2 a() {
        o2 o2Var;
        m mVar = this.f40956b;
        if (mVar != null) {
            n2 n2Var = mVar.f41045a.d;
            if (n2Var.rotatedFrameWidth > 0) {
                return n2Var;
            }
        }
        fc1 fc1Var = fc1.f47751m1;
        if (fc1Var != null && (o2Var = fc1Var.f47761d0) != null) {
            return o2Var.d;
        }
        i2 d = i2.d();
        if (d != null) {
            return d.f40940s.d;
        }
        return null;
    }

    @Override
    public final int b1() {
        int i7;
        if (!m.a(VoIPService.getSharedInstance())) {
            return 1;
        }
        n2 a10 = a();
        if (a10 != null && (i7 = a10.rotatedFrameWidth) > 0) {
            return i7;
        }
        return 9;
    }

    @Override
    public final float d2() {
        return 0.0f;
    }

    @Override
    public final boolean f0() {
        return true;
    }

    @Override
    public final long getDuration() {
        return 0L;
    }

    @Override
    public final boolean h1() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && !sharedInstance.isHangingUp() && sharedInstance.getCallState() != 11 && sharedInstance.getCallState() != 10) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean i1() {
        return false;
    }

    @Override
    public final boolean j() {
        return true;
    }

    @Override
    public final void l(View view) {
        g.f40893a = false;
        org.telegram.messenger.g0.r(this.f40958e);
        this.f40956b = null;
        fc1 fc1Var = fc1.f47751m1;
        if (fc1Var != null) {
            try {
                if (fc1Var.f47790u0.getParent() == null) {
                    yb1 yb1Var = fc1Var.f47790u0;
                    yb1Var.getClass();
                    ((WindowManager) fc1Var.f47755b.getSystemService("window")).addView(yb1Var, s2.a());
                }
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            fc1Var.l1 = false;
            fc1Var.f47778k1 = null;
            fc1Var.y();
            fc1Var.f47790u0.invalidate();
        } else if (i2.d() != null) {
            i2 d = i2.d();
            ai.h0 h0Var = d.f40933a;
            try {
                if (h0Var.getParent() == null) {
                    d.f40935c.addView(h0Var, d.d);
                }
            } catch (Exception e11) {
                a8.g(e11, true);
            }
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                sharedInstance.setSinks(d.f40939r.d, d.f40940s.d);
            }
        }
    }

    @Override
    public final boolean l0() {
        return false;
    }

    @Override
    public final long n() {
        return 0L;
    }

    @Override
    public final e2.c1 n1() {
        return null;
    }

    @Override
    public final void n2(int i7, ArrayList arrayList) {
        g.a(i7, arrayList, false);
    }

    @Override
    public final boolean o1() {
        return false;
    }

    @Override
    public final void v1() {
        this.f40955a = null;
        if (h == this) {
            h = null;
        }
        fc1 fc1Var = fc1.f47751m1;
        if (fc1Var != null) {
            fc1Var.G0 = true;
            fc1Var.f47761d0.d.release();
            fc1Var.f47764e0.d.release();
            fc1Var.f47759c0.release();
            fc1Var.c();
            fc1Var.f47790u0.d();
            fc1.f47751m1 = null;
            d();
        }
        i2.b();
    }

    @Override
    public final void w0(Rect rect) {
        rect.setEmpty();
    }

    @Override
    public final int y() {
        return 10;
    }

    @Override
    public final View y0(LaunchActivity launchActivity) {
        return new m(launchActivity);
    }

    @Override
    public final void z0(View view) {
        org.telegram.messenger.g0.r(this.f40958e);
        if (this.f40956b == view) {
            this.f40956b = null;
        }
        m mVar = (m) view;
        mVar.f41049f.b();
        mVar.f41045a.d.release();
    }

    @Override
    public final void I(wi.o oVar) {
    }

    @Override
    public final void c(long j3) {
    }

    @Override
    public final void d1(float f10) {
    }

    @Override
    public final void P1() {
    }

    @Override
    public final void T0() {
    }

    @Override
    public final void b() {
    }

    @Override
    public final void f() {
    }

    @Override
    public final void t2(Canvas canvas, int i7, int i10) {
    }
}
