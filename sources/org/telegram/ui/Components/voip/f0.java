package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.SystemClock;
import android.view.View;
import c8.jd;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.gj;
import org.telegram.messenger.r3;
import org.telegram.messenger.s3;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ih;
import org.telegram.ui.Components.s10;
import org.telegram.ui.Components.um0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.c40;
import org.telegram.ui.y10;
public final class f0 implements wi.l {
    public static f0 f40606e;
    public wi.n f40607a;
    public b0 f40608b;
    public float f40609c;
    public String d;

    public static ArrayList e(long j3, r3 r3Var) {
        y10 y10Var;
        ArrayList arrayList = r3Var.f26219f;
        ArrayList arrayList2 = new ArrayList();
        c40 c40Var = c40.C5;
        s3 s3Var = null;
        if (c40Var != null && (y10Var = c40Var.Z3) != null && y10Var.f40727b) {
            s3Var = y10Var.f40732e;
        }
        if (s3Var != null && g(r3Var, s3Var, j3)) {
            arrayList2.add(s3Var);
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            s3 s3Var2 = (s3) arrayList.get(i7);
            if (s3Var2 != s3Var && g(r3Var, s3Var2, j3)) {
                arrayList2.add(s3Var2);
            }
        }
        return arrayList2;
    }

    public static boolean g(r3 r3Var, s3 s3Var, long j3) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo;
        if (s3Var != r3Var.f26237z && (groupCallParticipant = s3Var.f26403a) != null && !groupCallParticipant.self) {
            long B1 = gj.B1(groupCallParticipant.peer);
            if (B1 != j3 && r3Var.d.f(B1) != null) {
                if (s3Var.f26404b) {
                    tL_groupCallParticipantVideo = s3Var.f26403a.presentation;
                } else {
                    tL_groupCallParticipantVideo = s3Var.f26403a.video;
                }
                if (tL_groupCallParticipantVideo != null && i(s3Var) != null) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static String i(s3 s3Var) {
        boolean z10 = s3Var.f26404b;
        TLRPC.GroupCallParticipant groupCallParticipant = s3Var.f26403a;
        if (z10) {
            return groupCallParticipant.presentationEndpoint;
        }
        return groupCallParticipant.videoEndpoint;
    }

    public static void k() {
        wi.n nVar;
        ?? r42;
        f0 f0Var = f40606e;
        if (f0Var != null && (nVar = f0Var.f40607a) != null && nVar.d()) {
            s10 s10Var = s10.f39139f0;
            wi.n nVar2 = f40606e.f40607a;
            boolean z10 = false;
            if (s10Var != null) {
                r42 = 1;
            } else {
                r42 = 0;
            }
            if (s10Var != null && s10Var.f39152r) {
                z10 = true;
            }
            int i7 = nVar2.f59424c;
            if (i7 != 3) {
                nVar2.f59426f = r42;
                nVar2.f59427g = z10;
                if (i7 == 2) {
                    nVar2.d = r42;
                } else {
                    nVar2.f59424c = r42;
                }
                nVar2.f59423b.f();
            }
        }
    }

    public static void m() {
        float f10;
        k1.o();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        r3 r3Var = null;
        if (sharedInstance != null && sharedInstance.groupCall != null && !sharedInstance.isHangingUp()) {
            if (f40606e == null) {
                ?? obj = new Object();
                obj.f40609c = 1.0f;
                f40606e = obj;
            }
            wi.n nVar = f40606e.f40607a;
            if (nVar == null || !nVar.d()) {
                f40606e.f40607a = l2.i.d().k(f40606e);
                k();
            }
            f0 f0Var = f40606e;
            if (f0Var.f40608b == null) {
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null) {
                    r3Var = sharedInstance3.groupCall;
                }
                if (sharedInstance2 != null && r3Var != null) {
                    ArrayList e10 = e(sharedInstance2.getSelfId(), r3Var);
                    int max = Math.max(1, e10.size());
                    float[] fArr = new float[max];
                    float[] fArr2 = new float[max];
                    Arrays.fill(fArr2, 1.0f);
                    StringBuilder sb2 = new StringBuilder();
                    for (int i7 = 0; i7 < e10.size(); i7++) {
                        s3 s3Var = (s3) e10.get(i7);
                        float f11 = s3Var.f26405c;
                        if (f11 <= 0.0f) {
                            f11 = 0.0f;
                        }
                        fArr[i7] = f11;
                        if (s3Var.f26404b) {
                            f10 = 2.0f;
                        } else {
                            f10 = 1.0f;
                        }
                        fArr2[i7] = f10;
                        sb2.append(i(s3Var));
                        sb2.append(':');
                        sb2.append(Math.round(fArr[i7] * 100.0f));
                        sb2.append(';');
                    }
                    String sb3 = sb2.toString();
                    if (!sb3.equals(f0Var.d)) {
                        f0Var.d = sb3;
                        f0Var.f40609c = jd.a(fArr, fArr2, 0.45f, 2.35f, null, 0.0f).f59412a;
                    }
                }
            }
            f40606e.f40607a.c();
            return;
        }
        f0 f0Var2 = f40606e;
        if (f0Var2 != null) {
            f40606e = null;
            wi.n nVar2 = f0Var2.f40607a;
            if (nVar2 != null) {
                f0Var2.f40607a = null;
                nVar2.f();
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
        if (c40.C5 != null && c40.D5) {
            return true;
        }
        return false;
    }

    @Override
    public final int L() {
        float f10;
        b0 b0Var = this.f40608b;
        if (b0Var != null) {
            f10 = b0Var.f40510n;
        } else {
            f10 = this.f40609c;
        }
        return Math.round(f10 * 1000.0f);
    }

    @Override
    public final boolean N() {
        r3 r3Var;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        VoIPService sharedInstance2 = VoIPService.getSharedInstance();
        if (sharedInstance2 != null) {
            r3Var = sharedInstance2.groupCall;
        } else {
            r3Var = null;
        }
        if (sharedInstance != null && r3Var != null && !sharedInstance.isHangingUp() && !r3Var.j()) {
            TLRPC.GroupCall groupCall = r3Var.f26216b;
            if (groupCall == null || !groupCall.rtmp_stream) {
                return true;
            }
            return false;
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
        return true;
    }

    @Override
    public final void V() {
        this.f40607a = null;
        c40 c40Var = c40.C5;
        if (c40Var != null && c40Var.getWindow() != null) {
            c40Var.getWindow().getDecorView().setVisibility(0);
        }
        org.telegram.messenger.g0.h3(new ih(15));
    }

    @Override
    public final boolean X(boolean z10, float f10, um0 um0Var) {
        return false;
    }

    @Override
    public final void Y(View view) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z10 = false;
        if (sharedInstance != null && sharedInstance.getVideoState(false) != 0) {
            z10 = true;
        }
        g.f40617a = z10;
        this.f40608b = (b0) view;
        c40 c40Var = c40.C5;
        if (c40Var != null) {
            c40Var.x1();
            if (c40Var.getWindow() != null) {
                c40Var.getWindow().getDecorView().setVisibility(4);
            }
        }
        b0 b0Var = this.f40608b;
        if (!b0Var.f40513w) {
            b0Var.f40513w = true;
            b0Var.f40514x = SystemClock.elapsedRealtime();
            VoIPService.getSharedInstance();
            b0Var.H = g.c();
            b0Var.f40509f.a();
            b0Var.j(true);
            org.telegram.messenger.g0.i3(b0Var.J, 250L);
        }
        s10.k(view.getContext());
    }

    @Override
    public final void a(View view) {
        g.f40617a = false;
        ((b0) view).i();
        b0 b0Var = this.f40608b;
        if (b0Var == view) {
            this.f40609c = b0Var.f40510n;
            this.f40608b = null;
        }
        c40 c40Var = c40.C5;
        if (c40Var != null) {
            if (c40Var.getWindow() != null) {
                c40Var.getWindow().getDecorView().setVisibility(0);
            }
            c40Var.y1();
        }
        s10.k(view.getContext());
    }

    @Override
    public final int b0() {
        return 1000;
    }

    @Override
    public final float c0() {
        return 0.0f;
    }

    @Override
    public final int d() {
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
    public final void j0(int i7, ArrayList arrayList) {
        g.a(i7, arrayList, true);
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
        g.b(i7, true);
        org.telegram.messenger.g0.i3(new ih(15), 300L);
    }

    @Override
    public final View w(LaunchActivity launchActivity) {
        return new b0(this, launchActivity);
    }

    @Override
    public final void x(View view) {
        ((b0) view).i();
        if (this.f40608b == view) {
            this.f40608b = null;
        }
    }

    @Override
    public final void A(View view) {
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
