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
import org.telegram.ui.Components.ih;
import org.telegram.ui.Components.um0;
import org.telegram.ui.Components.zj;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ec1;
import org.telegram.ui.xb1;
public final class j2 implements wi.l {
    public static j2 h;
    public wi.n f40679a;
    public m f40680b;
    public long f40681c;
    public boolean d;
    public final zj f40682e = new zj(this, 25);
    public boolean f40683f;

    public static void g() {
        boolean z10;
        ?? r52;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z11 = true;
        if (ec1.f46670m1 == null && i2.d() == null) {
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
            wi.n nVar = j2Var.f40679a;
            if (nVar == null || !nVar.d()) {
                j2Var.f40679a = l2.i.d().k(j2Var);
            }
            wi.n nVar2 = j2Var.f40679a;
            if (nVar2.f59424c == 2) {
                nVar2.c();
                return;
            }
            if (ec1.f46670m1 == null) {
                i2Var = i2.d();
            }
            wi.n nVar3 = j2Var.f40679a;
            if (i2Var != null) {
                r52 = 1;
            } else {
                r52 = 0;
            }
            if (i2Var == null || !i2Var.f40660e) {
                z11 = false;
            }
            int i7 = nVar3.f59424c;
            if (i7 != 3) {
                nVar3.f59426f = r52;
                nVar3.f59427g = z11;
                if (i7 == 2) {
                    nVar3.d = r52;
                } else {
                    nVar3.f59424c = r52;
                }
                nVar3.f59423b.f();
            }
            j2Var.f40679a.c();
            return;
        }
        j2 j2Var2 = h;
        if (j2Var2 != null) {
            h = null;
            wi.n nVar4 = j2Var2.f40679a;
            if (nVar4 != null) {
                j2Var2.f40679a = null;
                nVar4.f();
            }
        }
    }

    @Override
    public final void A(View view) {
        m mVar;
        ec1 ec1Var = ec1.f46670m1;
        if (ec1Var != null && (mVar = this.f40680b) == view && !this.f40683f) {
            this.f40683f = true;
            mVar.getClass();
            mVar.f40775r = SystemClock.elapsedRealtime();
            mVar.b();
            ec1Var.f46697k1 = this.f40680b.f40769a;
            ec1Var.l1 = true;
            ec1Var.y();
            try {
                ((WindowManager) ec1Var.f46674b.getSystemService("window")).removeView(ec1Var.f46709u0);
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }

    @Override
    public final void C(SurfaceTexture surfaceTexture) {
        surfaceTexture.release();
    }

    @Override
    public final View D() {
        return null;
    }

    @Override
    public final boolean F() {
        ec1 ec1Var = ec1.f46670m1;
        if (ec1Var != null && ec1Var.f46680d0.isAttachedToWindow()) {
            return true;
        }
        return false;
    }

    @Override
    public final int L() {
        int i7;
        if (!m.a(VoIPService.getSharedInstance())) {
            return 1;
        }
        n2 e10 = e();
        if (e10 != null && (i7 = e10.rotatedFrameWidth) > 0) {
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
    public final boolean P() {
        return false;
    }

    @Override
    public final e2.c1 R() {
        return null;
    }

    @Override
    public final boolean T() {
        return false;
    }

    @Override
    public final void V() {
        this.f40679a = null;
        if (h == this) {
            h = null;
        }
        ec1 ec1Var = ec1.f46670m1;
        if (ec1Var != null) {
            ec1Var.G0 = true;
            ec1Var.f46680d0.d.release();
            ec1Var.f46683e0.d.release();
            ec1Var.f46678c0.release();
            ec1Var.c();
            ec1Var.f46709u0.d();
            ec1.f46670m1 = null;
            g();
        }
        i2.b();
    }

    @Override
    public final boolean X(boolean z10, float f10, um0 um0Var) {
        return false;
    }

    @Override
    public final void Y(View view) {
        boolean z10;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.getVideoState(false) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        g.f40617a = z10;
        m mVar = (m) view;
        this.f40680b = mVar;
        mVar.b();
        this.f40681c = g.c();
        this.d = m.a(VoIPService.getSharedInstance());
        zj zjVar = this.f40682e;
        org.telegram.messenger.g0.r(zjVar);
        org.telegram.messenger.g0.i3(zjVar, 500L);
        this.f40683f = false;
        if (ec1.f46670m1 == null && i2.d() != null) {
            i2 d = i2.d();
            o2 o2Var = this.f40680b.f40769a;
            d.getClass();
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            if (sharedInstance2 != null) {
                sharedInstance2.setSinks(d.f40663r.d, o2Var.d);
            }
            try {
                d.f40659c.removeView(d.f40657a);
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }

    @Override
    public final void a(View view) {
        g.f40617a = false;
        org.telegram.messenger.g0.r(this.f40682e);
        this.f40680b = null;
        ec1 ec1Var = ec1.f46670m1;
        if (ec1Var != null) {
            try {
                if (ec1Var.f46709u0.getParent() == null) {
                    xb1 xb1Var = ec1Var.f46709u0;
                    xb1Var.getClass();
                    ((WindowManager) ec1Var.f46674b.getSystemService("window")).addView(xb1Var, s2.a());
                }
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            ec1Var.l1 = false;
            ec1Var.f46697k1 = null;
            ec1Var.y();
            ec1Var.f46709u0.invalidate();
        } else if (i2.d() != null) {
            i2 d = i2.d();
            ai.k0 k0Var = d.f40657a;
            try {
                if (k0Var.getParent() == null) {
                    d.f40659c.addView(k0Var, d.d);
                }
            } catch (Exception e11) {
                a8.g(e11, true);
            }
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                sharedInstance.setSinks(d.f40663r.d, d.f40664s.d);
            }
        }
    }

    @Override
    public final int b0() {
        int i7;
        if (!m.a(VoIPService.getSharedInstance())) {
            return 1;
        }
        n2 e10 = e();
        if (e10 != null && (i7 = e10.rotatedFrameHeight) > 0) {
            return i7;
        }
        return 16;
    }

    @Override
    public final float c0() {
        return 0.0f;
    }

    @Override
    public final int d() {
        return 10;
    }

    public final n2 e() {
        o2 o2Var;
        m mVar = this.f40680b;
        if (mVar != null) {
            n2 n2Var = mVar.f40769a.d;
            if (n2Var.rotatedFrameWidth > 0) {
                return n2Var;
            }
        }
        ec1 ec1Var = ec1.f46670m1;
        if (ec1Var != null && (o2Var = ec1Var.f46680d0) != null) {
            return o2Var.d;
        }
        i2 d = i2.d();
        if (d != null) {
            return d.f40664s.d;
        }
        return null;
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
    public final void j0(int i7, ArrayList arrayList) {
        g.a(i7, arrayList, false);
    }

    @Override
    public final long l() {
        return 0L;
    }

    @Override
    public final boolean p() {
        return true;
    }

    @Override
    public final boolean q() {
        return false;
    }

    @Override
    public final boolean t0() {
        return true;
    }

    @Override
    public final void u(Rect rect) {
        rect.setEmpty();
    }

    @Override
    public final void u0(int i7) {
        g.b(i7, false);
        org.telegram.messenger.g0.i3(new ih(19), 300L);
    }

    @Override
    public final View w(LaunchActivity launchActivity) {
        return new m(launchActivity);
    }

    @Override
    public final void x(View view) {
        org.telegram.messenger.g0.r(this.f40682e);
        if (this.f40680b == view) {
            this.f40680b = null;
        }
        m mVar = (m) view;
        mVar.f40773f.b();
        mVar.f40769a.d.release();
    }

    @Override
    public final void M(float f10) {
    }

    @Override
    public final void c(long j3) {
    }

    @Override
    public final void j(wi.o oVar) {
    }

    @Override
    public final void G() {
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
    public final void o0(Canvas canvas, int i7, int i10) {
    }
}
