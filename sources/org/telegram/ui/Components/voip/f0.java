package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.SystemClock;
import android.view.View;
import c8.nd;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.fj;
import org.telegram.messenger.t3;
import org.telegram.messenger.u3;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.en0;
import org.telegram.ui.Components.ne;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.a20;
import org.telegram.ui.e40;
public final class f0 implements wi.l {
    public static f0 f40882e;
    public wi.n f40883a;
    public b0 f40884b;
    public float f40885c;
    public String d;

    public static ArrayList a(long j3, t3 t3Var) {
        a20 a20Var;
        ArrayList arrayList = t3Var.f27037f;
        ArrayList arrayList2 = new ArrayList();
        e40 e40Var = e40.C5;
        u3 u3Var = null;
        if (e40Var != null && (a20Var = e40Var.Z3) != null && a20Var.f41003b) {
            u3Var = a20Var.f41008e;
        }
        if (u3Var != null && d(t3Var, u3Var, j3)) {
            arrayList2.add(u3Var);
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            u3 u3Var2 = (u3) arrayList.get(i7);
            if (u3Var2 != u3Var && d(t3Var, u3Var2, j3)) {
                arrayList2.add(u3Var2);
            }
        }
        return arrayList2;
    }

    public static boolean d(t3 t3Var, u3 u3Var, long j3) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo;
        if (u3Var != t3Var.f27055z && (groupCallParticipant = u3Var.f27215a) != null && !groupCallParticipant.self) {
            long B1 = fj.B1(groupCallParticipant.peer);
            if (B1 != j3 && t3Var.d.f(B1) != null) {
                if (u3Var.f27216b) {
                    tL_groupCallParticipantVideo = u3Var.f27215a.presentation;
                } else {
                    tL_groupCallParticipantVideo = u3Var.f27215a.video;
                }
                if (tL_groupCallParticipantVideo != null && e(u3Var) != null) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static String e(u3 u3Var) {
        boolean z10 = u3Var.f27216b;
        TLRPC.GroupCallParticipant groupCallParticipant = u3Var.f27215a;
        if (z10) {
            return groupCallParticipant.presentationEndpoint;
        }
        return groupCallParticipant.videoEndpoint;
    }

    public static void g() {
        wi.n nVar;
        ?? r42;
        f0 f0Var = f40882e;
        if (f0Var != null && (nVar = f0Var.f40883a) != null && nVar.d()) {
            org.telegram.ui.Components.a20 a20Var = org.telegram.ui.Components.a20.f33323f0;
            wi.n nVar2 = f40882e.f40883a;
            boolean z10 = false;
            if (a20Var != null) {
                r42 = 1;
            } else {
                r42 = 0;
            }
            if (a20Var != null && a20Var.f33336r) {
                z10 = true;
            }
            int i7 = nVar2.f60117c;
            if (i7 != 3) {
                nVar2.f60119f = r42;
                nVar2.f60120g = z10;
                if (i7 == 2) {
                    nVar2.d = r42;
                } else {
                    nVar2.f60117c = r42;
                }
                nVar2.f60116b.f();
            }
        }
    }

    public static void h() {
        float f10;
        k1.k();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        t3 t3Var = null;
        if (sharedInstance != null && sharedInstance.groupCall != null && !sharedInstance.isHangingUp()) {
            if (f40882e == null) {
                ?? obj = new Object();
                obj.f40885c = 1.0f;
                f40882e = obj;
            }
            wi.n nVar = f40882e.f40883a;
            if (nVar == null || !nVar.d()) {
                f40882e.f40883a = l2.j.d().j(f40882e);
                g();
            }
            f0 f0Var = f40882e;
            if (f0Var.f40884b == null) {
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
                        float f11 = u3Var.f27217c;
                        if (f11 <= 0.0f) {
                            f11 = 0.0f;
                        }
                        fArr[i7] = f11;
                        if (u3Var.f27216b) {
                            f10 = 2.0f;
                        } else {
                            f10 = 1.0f;
                        }
                        fArr2[i7] = f10;
                        sb2.append(e(u3Var));
                        sb2.append(':');
                        sb2.append(Math.round(fArr[i7] * 100.0f));
                        sb2.append(';');
                    }
                    String sb3 = sb2.toString();
                    if (!sb3.equals(f0Var.d)) {
                        f0Var.d = sb3;
                        f0Var.f40885c = nd.a(fArr, fArr2, 0.45f, 2.35f, null, 0.0f).f60105a;
                    }
                }
            }
            f40882e.f40883a.c();
            return;
        }
        f0 f0Var2 = f40882e;
        if (f0Var2 != null) {
            f40882e = null;
            wi.n nVar2 = f0Var2.f40883a;
            if (nVar2 != null) {
                f0Var2.f40883a = null;
                nVar2.f();
            }
        }
    }

    @Override
    public final boolean A1(boolean z10, float f10, en0 en0Var) {
        return false;
    }

    @Override
    public final boolean C2() {
        return true;
    }

    @Override
    public final void D1(View view) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z10 = false;
        if (sharedInstance != null && sharedInstance.getVideoState(false) != 0) {
            z10 = true;
        }
        g.f40893a = z10;
        this.f40884b = (b0) view;
        e40 e40Var = e40.C5;
        if (e40Var != null) {
            e40Var.y1();
            if (e40Var.getWindow() != null) {
                e40Var.getWindow().getDecorView().setVisibility(4);
            }
        }
        b0 b0Var = this.f40884b;
        if (!b0Var.f40789w) {
            b0Var.f40789w = true;
            b0Var.f40790x = SystemClock.elapsedRealtime();
            VoIPService.getSharedInstance();
            b0Var.H = g.c();
            b0Var.f40785f.a();
            b0Var.j(true);
            org.telegram.messenger.g0.h3(b0Var.J, 250L);
        }
        org.telegram.ui.Components.a20.k(view.getContext());
    }

    @Override
    public final void D2(int i7) {
        g.b(i7, true);
        org.telegram.messenger.g0.h3(new ne(17), 300L);
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
        if (e40.C5 != null && e40.D5) {
            return true;
        }
        return false;
    }

    @Override
    public final int V1() {
        return 1000;
    }

    @Override
    public final int b1() {
        float f10;
        b0 b0Var = this.f40884b;
        if (b0Var != null) {
            f10 = b0Var.f40786n;
        } else {
            f10 = this.f40885c;
        }
        return Math.round(f10 * 1000.0f);
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
        t3 t3Var;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        VoIPService sharedInstance2 = VoIPService.getSharedInstance();
        if (sharedInstance2 != null) {
            t3Var = sharedInstance2.groupCall;
        } else {
            t3Var = null;
        }
        if (sharedInstance != null && t3Var != null && !sharedInstance.isHangingUp() && !t3Var.j()) {
            TLRPC.GroupCall groupCall = t3Var.f27034b;
            if (groupCall == null || !groupCall.rtmp_stream) {
                return true;
            }
            return false;
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
        ((b0) view).i();
        b0 b0Var = this.f40884b;
        if (b0Var == view) {
            this.f40885c = b0Var.f40786n;
            this.f40884b = null;
        }
        e40 e40Var = e40.C5;
        if (e40Var != null) {
            if (e40Var.getWindow() != null) {
                e40Var.getWindow().getDecorView().setVisibility(0);
            }
            e40Var.z1();
        }
        org.telegram.ui.Components.a20.k(view.getContext());
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
        g.a(i7, arrayList, true);
    }

    @Override
    public final boolean o1() {
        return true;
    }

    @Override
    public final void v1() {
        this.f40883a = null;
        e40 e40Var = e40.C5;
        if (e40Var != null && e40Var.getWindow() != null) {
            e40Var.getWindow().getDecorView().setVisibility(0);
        }
        org.telegram.messenger.g0.g3(new ne(17));
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
        return new b0(this, launchActivity);
    }

    @Override
    public final void z0(View view) {
        ((b0) view).i();
        if (this.f40884b == view) {
            this.f40884b = null;
        }
    }

    @Override
    public final void B0(View view) {
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
