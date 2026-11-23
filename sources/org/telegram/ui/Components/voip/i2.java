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
import org.telegram.ui.Components.ik;
import org.telegram.ui.Components.me;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ac1;
import org.telegram.ui.hc1;
public final class i2 implements wi.l {
    public static i2 h;
    public wi.n f41022a;
    public m f41023b;
    public long f41024c;
    public boolean d;
    public final ik f41025e = new ik(this, 25);
    public boolean f41026f;

    public static void g() {
        boolean z10;
        ?? r52;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z11 = true;
        if (hc1.f48294m1 == null && h2.d() == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        h2 h2Var = null;
        if (sharedInstance != null && z10) {
            if (h == null) {
                h = new i2();
            }
            i2 i2Var = h;
            wi.n nVar = i2Var.f41022a;
            if (nVar == null || !nVar.d()) {
                i2Var.f41022a = l2.i.d().k(i2Var);
            }
            wi.n nVar2 = i2Var.f41022a;
            if (nVar2.f59999c == 2) {
                nVar2.c();
                return;
            }
            if (hc1.f48294m1 == null) {
                h2Var = h2.d();
            }
            wi.n nVar3 = i2Var.f41022a;
            if (h2Var != null) {
                r52 = 1;
            } else {
                r52 = 0;
            }
            if (h2Var == null || !h2Var.f41003e) {
                z11 = false;
            }
            int i7 = nVar3.f59999c;
            if (i7 != 3) {
                nVar3.f60001f = r52;
                nVar3.f60002g = z11;
                if (i7 == 2) {
                    nVar3.d = r52;
                } else {
                    nVar3.f59999c = r52;
                }
                nVar3.f59998b.f();
            }
            i2Var.f41022a.c();
            return;
        }
        i2 i2Var2 = h;
        if (i2Var2 != null) {
            h = null;
            wi.n nVar4 = i2Var2.f41022a;
            if (nVar4 != null) {
                i2Var2.f41022a = null;
                nVar4.f();
            }
        }
    }

    @Override
    public final void B(View view) {
        m mVar;
        hc1 hc1Var = hc1.f48294m1;
        if (hc1Var != null && (mVar = this.f41023b) == view && !this.f41026f) {
            this.f41026f = true;
            mVar.getClass();
            mVar.f41138r = SystemClock.elapsedRealtime();
            mVar.b();
            hc1Var.f48321k1 = this.f41023b.f41132a;
            hc1Var.l1 = true;
            hc1Var.y();
            try {
                ((WindowManager) hc1Var.f48298b.getSystemService("window")).removeView(hc1Var.f48333u0);
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }

    @Override
    public final void D(SurfaceTexture surfaceTexture) {
        surfaceTexture.release();
    }

    @Override
    public final View E() {
        return null;
    }

    @Override
    public final boolean G() {
        hc1 hc1Var = hc1.f48294m1;
        if (hc1Var != null && hc1Var.f48304d0.isAttachedToWindow()) {
            return true;
        }
        return false;
    }

    @Override
    public final int J() {
        int i7;
        if (!m.a(VoIPService.getSharedInstance())) {
            return 1;
        }
        m2 a10 = a();
        if (a10 != null && (i7 = a10.rotatedFrameWidth) > 0) {
            return i7;
        }
        return 9;
    }

    @Override
    public final boolean N() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && !sharedInstance.isHangingUp() && sharedInstance.getCallState() != 11 && sharedInstance.getCallState() != 10) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean O() {
        return false;
    }

    @Override
    public final e2.c1 Q() {
        return null;
    }

    @Override
    public final boolean S() {
        return false;
    }

    @Override
    public final void U() {
        this.f41022a = null;
        if (h == this) {
            h = null;
        }
        hc1 hc1Var = hc1.f48294m1;
        if (hc1Var != null) {
            hc1Var.G0 = true;
            hc1Var.f48304d0.d.release();
            hc1Var.f48307e0.d.release();
            hc1Var.f48302c0.release();
            hc1Var.c();
            hc1Var.f48333u0.d();
            hc1.f48294m1 = null;
            g();
        }
        h2.b();
    }

    @Override
    public final boolean V(boolean z10, float f10, en0 en0Var) {
        return false;
    }

    @Override
    public final void X(View view) {
        boolean z10;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.getVideoState(false) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        g.f40969a = z10;
        m mVar = (m) view;
        this.f41023b = mVar;
        mVar.b();
        this.f41024c = g.c();
        this.d = m.a(VoIPService.getSharedInstance());
        ik ikVar = this.f41025e;
        org.telegram.messenger.g0.r(ikVar);
        org.telegram.messenger.g0.h3(ikVar, 500L);
        this.f41026f = false;
        if (hc1.f48294m1 == null && h2.d() != null) {
            h2 d = h2.d();
            n2 n2Var = this.f41023b.f41132a;
            d.getClass();
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            if (sharedInstance2 != null) {
                sharedInstance2.setSinks(d.f41006r.d, n2Var.d);
            }
            try {
                d.f41002c.removeView(d.f41000a);
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }

    public final m2 a() {
        n2 n2Var;
        m mVar = this.f41023b;
        if (mVar != null) {
            m2 m2Var = mVar.f41132a.d;
            if (m2Var.rotatedFrameWidth > 0) {
                return m2Var;
            }
        }
        hc1 hc1Var = hc1.f48294m1;
        if (hc1Var != null && (n2Var = hc1Var.f48304d0) != null) {
            return n2Var.d;
        }
        h2 d = h2.d();
        if (d != null) {
            return d.f41007s.d;
        }
        return null;
    }

    @Override
    public final int a0() {
        int i7;
        if (!m.a(VoIPService.getSharedInstance())) {
            return 1;
        }
        m2 a10 = a();
        if (a10 != null && (i7 = a10.rotatedFrameHeight) > 0) {
            return i7;
        }
        return 16;
    }

    @Override
    public final float b0() {
        return 0.0f;
    }

    @Override
    public final void d(View view) {
        g.f40969a = false;
        org.telegram.messenger.g0.r(this.f41025e);
        this.f41023b = null;
        hc1 hc1Var = hc1.f48294m1;
        if (hc1Var != null) {
            try {
                if (hc1Var.f48333u0.getParent() == null) {
                    ac1 ac1Var = hc1Var.f48333u0;
                    ac1Var.getClass();
                    ((WindowManager) hc1Var.f48298b.getSystemService("window")).addView(ac1Var, r2.a());
                }
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            hc1Var.l1 = false;
            hc1Var.f48321k1 = null;
            hc1Var.y();
            hc1Var.f48333u0.invalidate();
        } else if (h2.d() != null) {
            h2 d = h2.d();
            ai.g0 g0Var = d.f41000a;
            try {
                if (g0Var.getParent() == null) {
                    d.f41002c.addView(g0Var, d.d);
                }
            } catch (Exception e11) {
                a8.g(e11, true);
            }
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                sharedInstance.setSinks(d.f41006r.d, d.f41007s.d);
            }
        }
    }

    @Override
    public final int e() {
        return 10;
    }

    @Override
    public final long getDuration() {
        return 0L;
    }

    @Override
    public final boolean h() {
        return true;
    }

    @Override
    public final void h0(int i7, ArrayList arrayList) {
        g.a(i7, arrayList, false);
    }

    @Override
    public final long l() {
        return 0L;
    }

    @Override
    public final boolean o0() {
        return true;
    }

    @Override
    public final boolean p() {
        return true;
    }

    @Override
    public final void p0(int i7) {
        g.b(i7, false);
        org.telegram.messenger.g0.h3(new me(21), 300L);
    }

    @Override
    public final boolean s() {
        return false;
    }

    @Override
    public final void u(Rect rect) {
        rect.setEmpty();
    }

    @Override
    public final View v(LaunchActivity launchActivity) {
        return new m(launchActivity);
    }

    @Override
    public final void w(View view) {
        org.telegram.messenger.g0.r(this.f41025e);
        if (this.f41023b == view) {
            this.f41023b = null;
        }
        m mVar = (m) view;
        mVar.f41136f.b();
        mVar.f41132a.d.release();
    }

    @Override
    public final void L(float f10) {
    }

    @Override
    public final void c(long j3) {
    }

    @Override
    public final void i(wi.o oVar) {
    }

    @Override
    public final void H() {
    }

    @Override
    public final void Z() {
    }

    @Override
    public final void b() {
    }

    @Override
    public final void f() {
    }

    @Override
    public final void j0(Canvas canvas, int i7, int i10) {
    }
}
