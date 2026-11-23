package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.SystemClock;
import android.view.View;
import c8.md;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.gj;
import org.telegram.messenger.t3;
import org.telegram.messenger.u3;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.c20;
import org.telegram.ui.Components.fn0;
import org.telegram.ui.Components.me;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.b20;
import org.telegram.ui.f40;
public final class e0 implements wi.l {
    public static e0 f40986e;
    public wi.n f40987a;
    public a0 f40988b;
    public float f40989c;
    public String d;

    public static ArrayList a(long j3, t3 t3Var) {
        b20 b20Var;
        ArrayList arrayList = t3Var.f26953f;
        ArrayList arrayList2 = new ArrayList();
        f40 f40Var = f40.C5;
        u3 u3Var = null;
        if (f40Var != null && (b20Var = f40Var.Z3) != null && b20Var.f41109b) {
            u3Var = b20Var.f41114e;
        }
        if (u3Var != null && g(t3Var, u3Var, j3)) {
            arrayList2.add(u3Var);
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            u3 u3Var2 = (u3) arrayList.get(i7);
            if (u3Var2 != u3Var && g(t3Var, u3Var2, j3)) {
                arrayList2.add(u3Var2);
            }
        }
        return arrayList2;
    }

    public static boolean g(t3 t3Var, u3 u3Var, long j3) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo;
        if (u3Var != t3Var.f26971z && (groupCallParticipant = u3Var.f27155a) != null && !groupCallParticipant.self) {
            long B1 = gj.B1(groupCallParticipant.peer);
            if (B1 != j3 && t3Var.d.f(B1) != null) {
                if (u3Var.f27156b) {
                    tL_groupCallParticipantVideo = u3Var.f27155a.presentation;
                } else {
                    tL_groupCallParticipantVideo = u3Var.f27155a.video;
                }
                if (tL_groupCallParticipantVideo != null && j(u3Var) != null) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static String j(u3 u3Var) {
        boolean z10 = u3Var.f27156b;
        TLRPC.GroupCallParticipant groupCallParticipant = u3Var.f27155a;
        if (z10) {
            return groupCallParticipant.presentationEndpoint;
        }
        return groupCallParticipant.videoEndpoint;
    }

    public static void k() {
        wi.n nVar;
        ?? r42;
        e0 e0Var = f40986e;
        if (e0Var != null && (nVar = e0Var.f40987a) != null && nVar.d()) {
            c20 c20Var = c20.f33981f0;
            wi.n nVar2 = f40986e.f40987a;
            boolean z10 = false;
            if (c20Var != null) {
                r42 = 1;
            } else {
                r42 = 0;
            }
            if (c20Var != null && c20Var.f33994r) {
                z10 = true;
            }
            int i7 = nVar2.f60034c;
            if (i7 != 3) {
                nVar2.f60036f = r42;
                nVar2.f60037g = z10;
                if (i7 == 2) {
                    nVar2.d = r42;
                } else {
                    nVar2.f60034c = r42;
                }
                nVar2.f60033b.f();
            }
        }
    }

    public static void m() {
        float f10;
        j1.o();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        t3 t3Var = null;
        if (sharedInstance != null && sharedInstance.groupCall != null && !sharedInstance.isHangingUp()) {
            if (f40986e == null) {
                ?? obj = new Object();
                obj.f40989c = 1.0f;
                f40986e = obj;
            }
            wi.n nVar = f40986e.f40987a;
            if (nVar == null || !nVar.d()) {
                f40986e.f40987a = l2.i.d().k(f40986e);
                k();
            }
            e0 e0Var = f40986e;
            if (e0Var.f40988b == null) {
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null) {
                    t3Var = sharedInstance3.groupCall;
                }
                if (sharedInstance2 != null && t3Var != null) {
                    ArrayList a10 = a(sharedInstance2.getSelfId(), t3Var);
                    int max = Math.max(1, a10.size());
                    float[] fArr = new float[max];
                    float[] fArr2 = new float[max];
                    Arrays.fill(fArr2, 1.0f);
                    StringBuilder sb2 = new StringBuilder();
                    for (int i7 = 0; i7 < a10.size(); i7++) {
                        u3 u3Var = (u3) a10.get(i7);
                        float f11 = u3Var.f27157c;
                        if (f11 <= 0.0f) {
                            f11 = 0.0f;
                        }
                        fArr[i7] = f11;
                        if (u3Var.f27156b) {
                            f10 = 2.0f;
                        } else {
                            f10 = 1.0f;
                        }
                        fArr2[i7] = f10;
                        sb2.append(j(u3Var));
                        sb2.append(':');
                        sb2.append(Math.round(fArr[i7] * 100.0f));
                        sb2.append(';');
                    }
                    String sb3 = sb2.toString();
                    if (!sb3.equals(e0Var.d)) {
                        e0Var.d = sb3;
                        e0Var.f40989c = md.a(fArr, fArr2, 0.45f, 2.35f, null, 0.0f).f60022a;
                    }
                }
            }
            f40986e.f40987a.c();
            return;
        }
        e0 e0Var2 = f40986e;
        if (e0Var2 != null) {
            f40986e = null;
            wi.n nVar2 = e0Var2.f40987a;
            if (nVar2 != null) {
                e0Var2.f40987a = null;
                nVar2.f();
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
        if (f40.C5 != null && f40.D5) {
            return true;
        }
        return false;
    }

    @Override
    public final int J() {
        float f10;
        a0 a0Var = this.f40988b;
        if (a0Var != null) {
            f10 = a0Var.f40891n;
        } else {
            f10 = this.f40989c;
        }
        return Math.round(f10 * 1000.0f);
    }

    @Override
    public final boolean N() {
        t3 t3Var;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        VoIPService sharedInstance2 = VoIPService.getSharedInstance();
        if (sharedInstance2 != null) {
            t3Var = sharedInstance2.groupCall;
        } else {
            t3Var = null;
        }
        if (sharedInstance != null && t3Var != null && !sharedInstance.isHangingUp() && !t3Var.j()) {
            TLRPC.GroupCall groupCall = t3Var.f26950b;
            if (groupCall == null || !groupCall.rtmp_stream) {
                return true;
            }
            return false;
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
        return true;
    }

    @Override
    public final void U() {
        this.f40987a = null;
        f40 f40Var = f40.C5;
        if (f40Var != null && f40Var.getWindow() != null) {
            f40Var.getWindow().getDecorView().setVisibility(0);
        }
        org.telegram.messenger.g0.g3(new me(17));
    }

    @Override
    public final boolean V(boolean z10, float f10, fn0 fn0Var) {
        return false;
    }

    @Override
    public final void X(View view) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z10 = false;
        if (sharedInstance != null && sharedInstance.getVideoState(false) != 0) {
            z10 = true;
        }
        g.f41007a = z10;
        this.f40988b = (a0) view;
        f40 f40Var = f40.C5;
        if (f40Var != null) {
            f40Var.y1();
            if (f40Var.getWindow() != null) {
                f40Var.getWindow().getDecorView().setVisibility(4);
            }
        }
        a0 a0Var = this.f40988b;
        if (!a0Var.f40894w) {
            a0Var.f40894w = true;
            a0Var.f40895x = SystemClock.elapsedRealtime();
            VoIPService.getSharedInstance();
            a0Var.H = g.c();
            a0Var.f40890f.a();
            a0Var.j(true);
            org.telegram.messenger.g0.h3(a0Var.J, 250L);
        }
        c20.k(view.getContext());
    }

    @Override
    public final int a0() {
        return 1000;
    }

    @Override
    public final float b0() {
        return 0.0f;
    }

    @Override
    public final void d(View view) {
        g.f41007a = false;
        ((a0) view).i();
        a0 a0Var = this.f40988b;
        if (a0Var == view) {
            this.f40989c = a0Var.f40891n;
            this.f40988b = null;
        }
        f40 f40Var = f40.C5;
        if (f40Var != null) {
            if (f40Var.getWindow() != null) {
                f40Var.getWindow().getDecorView().setVisibility(0);
            }
            f40Var.z1();
        }
        c20.k(view.getContext());
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
        g.a(i7, arrayList, true);
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
        g.b(i7, true);
        org.telegram.messenger.g0.h3(new me(17), 300L);
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
        return new a0(this, launchActivity);
    }

    @Override
    public final void w(View view) {
        ((a0) view).i();
        if (this.f40988b == view) {
            this.f40988b = null;
        }
    }

    @Override
    public final void B(View view) {
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
