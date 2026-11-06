package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.SystemClock;
import android.view.View;
import c8.ic;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.ij;
import org.telegram.messenger.r3;
import org.telegram.messenger.s3;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.l10;
import org.telegram.ui.Components.p10;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.c40;
import org.telegram.ui.z10;
public final class e0 implements ti.m {
    public static e0 f39109e;
    public ti.o f39110a;
    public a0 f39111b;
    public float f39112c;
    public String d;

    public static ArrayList a(long j3, r3 r3Var) {
        z10 z10Var;
        ArrayList arrayList = r3Var.f25204f;
        ArrayList arrayList2 = new ArrayList();
        c40 c40Var = c40.f44540u5;
        s3 s3Var = null;
        if (c40Var != null && (z10Var = c40Var.R3) != null && z10Var.f39237b) {
            s3Var = z10Var.f39242e;
        }
        if (s3Var != null && d(r3Var, s3Var, j3)) {
            arrayList2.add(s3Var);
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            s3 s3Var2 = (s3) arrayList.get(i7);
            if (s3Var2 != s3Var && d(r3Var, s3Var2, j3)) {
                arrayList2.add(s3Var2);
            }
        }
        return arrayList2;
    }

    public static boolean d(r3 r3Var, s3 s3Var, long j3) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo;
        if (s3Var != r3Var.f25222z && (groupCallParticipant = s3Var.f25405a) != null && !groupCallParticipant.self) {
            long C1 = ij.C1(groupCallParticipant.peer);
            if (C1 != j3 && r3Var.d.f(C1) != null) {
                if (s3Var.f25406b) {
                    tL_groupCallParticipantVideo = s3Var.f25405a.presentation;
                } else {
                    tL_groupCallParticipantVideo = s3Var.f25405a.video;
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
        boolean z9 = s3Var.f25406b;
        TLRPC.GroupCallParticipant groupCallParticipant = s3Var.f25405a;
        if (z9) {
            return groupCallParticipant.presentationEndpoint;
        }
        return groupCallParticipant.videoEndpoint;
    }

    public static void k() {
        ti.o oVar;
        ?? r42;
        e0 e0Var = f39109e;
        if (e0Var != null && (oVar = e0Var.f39110a) != null && oVar.d()) {
            p10 p10Var = p10.f36729e0;
            ti.o oVar2 = f39109e.f39110a;
            boolean z9 = false;
            if (p10Var != null) {
                r42 = 1;
            } else {
                r42 = 0;
            }
            if (p10Var != null && p10Var.f36741r) {
                z9 = true;
            }
            int i7 = oVar2.f56033c;
            if (i7 != 3) {
                oVar2.f56035f = r42;
                oVar2.f56036g = z9;
                if (i7 == 2) {
                    oVar2.d = r42;
                } else {
                    oVar2.f56033c = r42;
                }
                oVar2.f56032b.f();
            }
        }
    }

    public static void m() {
        float f10;
        g1.o();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        r3 r3Var = null;
        if (sharedInstance != null && sharedInstance.groupCall != null && !sharedInstance.isHangingUp()) {
            if (f39109e == null) {
                ?? obj = new Object();
                obj.f39112c = 1.0f;
                f39109e = obj;
            }
            ti.o oVar = f39109e.f39110a;
            if (oVar == null || !oVar.d()) {
                f39109e.f39110a = l2.i.d().k(f39109e);
                k();
            }
            e0 e0Var = f39109e;
            if (e0Var.f39111b == null) {
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null) {
                    r3Var = sharedInstance3.groupCall;
                }
                if (sharedInstance2 != null && r3Var != null) {
                    ArrayList a10 = a(sharedInstance2.getSelfId(), r3Var);
                    int max = Math.max(1, a10.size());
                    float[] fArr = new float[max];
                    float[] fArr2 = new float[max];
                    Arrays.fill(fArr2, 1.0f);
                    StringBuilder sb2 = new StringBuilder();
                    for (int i7 = 0; i7 < a10.size(); i7++) {
                        s3 s3Var = (s3) a10.get(i7);
                        float f11 = s3Var.f25407c;
                        if (f11 <= 0.0f) {
                            f11 = 0.0f;
                        }
                        fArr[i7] = f11;
                        if (s3Var.f25406b) {
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
                    if (!sb3.equals(e0Var.d)) {
                        e0Var.d = sb3;
                        e0Var.f39112c = ic.a(fArr, fArr2, 0.45f, 2.35f, null, 0.0f).f56021a;
                    }
                }
            }
            f39109e.f39110a.c();
            return;
        }
        e0 e0Var2 = f39109e;
        if (e0Var2 != null) {
            f39109e = null;
            ti.o oVar2 = e0Var2.f39110a;
            if (oVar2 != null) {
                e0Var2.f39110a = null;
                oVar2.f();
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
    public final boolean E() {
        if (c40.f44540u5 != null && c40.f44541v5) {
            return true;
        }
        return false;
    }

    @Override
    public final int I() {
        float f10;
        a0 a0Var = this.f39111b;
        if (a0Var != null) {
            f10 = a0Var.f39025n;
        } else {
            f10 = this.f39112c;
        }
        return Math.round(f10 * 1000.0f);
    }

    @Override
    public final boolean K() {
        r3 r3Var;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        VoIPService sharedInstance2 = VoIPService.getSharedInstance();
        if (sharedInstance2 != null) {
            r3Var = sharedInstance2.groupCall;
        } else {
            r3Var = null;
        }
        if (sharedInstance != null && r3Var != null && !sharedInstance.isHangingUp() && !r3Var.j()) {
            TLRPC.GroupCall groupCall = r3Var.f25201b;
            if (groupCall == null || !groupCall.rtmp_stream) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean L() {
        return false;
    }

    @Override
    public final e2.c1 M() {
        return null;
    }

    @Override
    public final boolean P() {
        return true;
    }

    @Override
    public final void Q() {
        this.f39110a = null;
        c40 c40Var = c40.f44540u5;
        if (c40Var != null && c40Var.getWindow() != null) {
            c40Var.getWindow().getDecorView().setVisibility(0);
        }
        org.telegram.messenger.g0.h3(new l10(9));
    }

    @Override
    public final boolean R(boolean z9, float f10, qm0 qm0Var) {
        return false;
    }

    @Override
    public final void S(View view) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z9 = false;
        if (sharedInstance != null && sharedInstance.getVideoState(false) != 0) {
            z9 = true;
        }
        g.f39158a = z9;
        this.f39111b = (a0) view;
        c40 c40Var = c40.f44540u5;
        if (c40Var != null) {
            c40Var.x1();
            if (c40Var.getWindow() != null) {
                c40Var.getWindow().getDecorView().setVisibility(4);
            }
        }
        a0 a0Var = this.f39111b;
        if (!a0Var.f39028w) {
            a0Var.f39028w = true;
            a0Var.f39029x = SystemClock.elapsedRealtime();
            VoIPService.getSharedInstance();
            a0Var.G = g.c();
            a0Var.f39024f.a();
            a0Var.j(true);
            org.telegram.messenger.g0.i3(a0Var.I, 250L);
        }
        p10.k(view.getContext());
    }

    @Override
    public final int U() {
        return 1000;
    }

    @Override
    public final float V() {
        return 0.0f;
    }

    @Override
    public final void Z(int i7, ArrayList arrayList) {
        g.a(i7, arrayList, true);
    }

    @Override
    public final void e(View view) {
        g.f39158a = false;
        ((a0) view).i();
        a0 a0Var = this.f39111b;
        if (a0Var == view) {
            this.f39112c = a0Var.f39025n;
            this.f39111b = null;
        }
        c40 c40Var = c40.f44540u5;
        if (c40Var != null) {
            if (c40Var.getWindow() != null) {
                c40Var.getWindow().getDecorView().setVisibility(0);
            }
            c40Var.y1();
        }
        p10.k(view.getContext());
    }

    @Override
    public final boolean e0() {
        return true;
    }

    @Override
    public final void f0(int i7) {
        g.b(i7, true);
        org.telegram.messenger.g0.i3(new l10(9), 300L);
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
    public final int j() {
        return 10;
    }

    @Override
    public final long l() {
        return 0L;
    }

    @Override
    public final boolean r() {
        return true;
    }

    @Override
    public final boolean u() {
        return false;
    }

    @Override
    public final void v(Rect rect) {
        rect.setEmpty();
    }

    @Override
    public final View x(LaunchActivity launchActivity) {
        return new a0(this, launchActivity);
    }

    @Override
    public final void y(View view) {
        ((a0) view).i();
        if (this.f39111b == view) {
            this.f39111b = null;
        }
    }

    @Override
    public final void B(View view) {
    }

    @Override
    public final void J(float f10) {
    }

    @Override
    public final void c(long j3) {
    }

    @Override
    public final void g(ti.q qVar) {
    }

    @Override
    public final void F() {
    }

    @Override
    public final void T() {
    }

    @Override
    public final void b() {
    }

    @Override
    public final void f() {
    }

    @Override
    public final void c0(Canvas canvas, int i7, int i10) {
    }
}
