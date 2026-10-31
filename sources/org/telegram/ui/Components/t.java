package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
public final class t implements org.telegram.ui.ActionBar.u1, hk0, wb0, xb0, yb0, fe.g, org.telegram.messenger.mc, q4, r0.m, mh.a, t0.e, ik0, CameraController.VideoTakeCallback, org.telegram.ui.Cells.t5, th.k7, org.telegram.ui.ActionBar.o0, org.telegram.ui.ActionBar.i1 {
    public final int f30388a;
    public final Object f30389b;

    public t(Object obj, int i10) {
        this.f30388a = i10;
        this.f30389b = obj;
    }

    @Override
    public void K(int i10, int i11, boolean z10) {
        int i12;
        a8 a8Var = (a8) this.f30389b;
        int i13 = i10 * 60;
        if (i10 == 0) {
            i12 = 71;
        } else {
            i12 = 70;
        }
        a8Var.Y0(i13, i12);
    }

    @Override
    public r0.j1 R0(View view, r0.j1 j1Var) {
        i0.c I0 = org.telegram.messenger.i0.I0(j1Var, false);
        qa qaVar = ((ra) this.f30389b).f29889a;
        if (qaVar != null) {
            qaVar.setPadding(I0.f7765a, I0.f7766b, I0.f7767c, I0.d);
        }
        view.requestLayout();
        return r0.j1.f46131b;
    }

    @Override
    public void b(float r9, float r10, int r11, android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t.b(float, float, int, android.view.View):void");
    }

    @Override
    public void d(long j10, int i10, th.i2 i2Var) {
        i2Var.run();
    }

    @Override
    public String e(int i10) {
        return ((String[]) this.f30389b)[i10];
    }

    @Override
    public boolean f(int i10, View view) {
        Object O;
        xj xjVar = (xj) this.f30389b;
        s4.g0 adapter = xjVar.f32487r.getAdapter();
        pj pjVar = xjVar.f32489w;
        if (adapter == pjVar) {
            O = pjVar.E(i10);
        } else {
            wj wjVar = xjVar.D;
            O = wjVar.O(wjVar.S(i10), wjVar.Q(i10));
        }
        return xjVar.S(view, O);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f30388a) {
            case 0:
                z zVar = (z) this.f30389b;
                gf.e h = x1Var.h(-1, true, true);
                h.d();
                TL_aicompose.deleteTone deletetone = new TL_aicompose.deleteTone();
                deletetone.tone = TL_aicompose.InputAiComposeTone.from(zVar.f32853b2);
                ConnectionsManager.getInstance(zVar.f21583a).sendRequestTyped(deletetone, new a3.b(1), new org.telegram.tgnet.e(zVar, h, x1Var, 3));
                return;
            case 2:
                ((org.telegram.ui.fp) this.f30389b).run();
                return;
            case 3:
                ((bi.e) this.f30389b).run();
                return;
            case 4:
                ((m4.a1) this.f30389b).run();
                return;
            case 5:
                ((q1) this.f30389b).run();
                return;
            case 6:
                ((or) this.f30389b).run();
                return;
            case 8:
                ((k2) this.f30389b).run();
                return;
            case 17:
                ((lf) this.f30389b).f28100a.U0.r();
                return;
            case 19:
                ((cd) this.f30389b).run();
                org.telegram.messenger.vp.d1().edit().putBoolean("trimvoicehint", false).apply();
                return;
            case 23:
                ((jn) this.f30389b).f30947b.dismiss();
                return;
            case 24:
                ((pm) this.f30389b).f29383a.E.r();
                return;
            default:
                ((ut) this.f30389b).f31037a.d.r();
                return;
        }
    }

    @Override
    public boolean h1(View view) {
        return false;
    }

    @Override
    public void i(int i10) {
        p2 p2Var = (p2) this.f30389b;
        if (i10 == 0) {
            p2Var.run();
        }
    }

    @Override
    public void j(ImageReceiver imageReceiver) {
        int i10 = this.f30388a;
    }

    @Override
    public void k(int i10) {
        ArrayList arrayList;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        String str;
        Context context;
        switch (this.f30388a) {
            case 26:
                bq bqVar = ((cq) this.f30389b).f25134a;
                boolean z10 = true;
                if (i10 != 1 && i10 != 2) {
                    if (i10 == 3) {
                        bqVar.b();
                        return;
                    }
                    return;
                }
                if (i10 != 2) {
                    z10 = false;
                }
                bqVar.a(z10);
                return;
            default:
                cv cvVar = (cv) this.f30389b;
                org.telegram.ui.ActionBar.k2 k2Var = cvVar.f25162j1;
                ou ouVar = cvVar.l1;
                if (ouVar != null && (arrayList = ouVar.f24465b) != null && !arrayList.isEmpty()) {
                    TLRPC.StickerSet stickerSet = ((TLRPC.TL_messages_stickerSet) ouVar.f24465b.get(0)).set;
                    if (stickerSet != null && stickerSet.emojis) {
                        str = "https://" + org.telegram.messenger.vp.r1(cvVar.f21583a).U2 + "/addemoji/" + tL_messages_stickerSet.set.short_name;
                    } else {
                        str = "https://" + org.telegram.messenger.vp.r1(cvVar.f21583a).U2 + "/addstickers/" + tL_messages_stickerSet.set.short_name;
                    }
                    String str2 = str;
                    if (i10 == 1) {
                        if (k2Var != null) {
                            context = k2Var.getParentActivity();
                        } else {
                            context = null;
                        }
                        if (context == null) {
                            context = cvVar.getContext();
                        }
                        ru ruVar = new ru(cvVar, context, str2, str2, cvVar.I0);
                        if (k2Var != null) {
                            k2Var.showDialog(ruVar);
                            return;
                        } else {
                            ruVar.show();
                            return;
                        }
                    } else if (i10 == 2) {
                        try {
                            org.telegram.messenger.i0.g(str2);
                            new cc((FrameLayout) cvVar.f21586b, cvVar.I0).k(false).j();
                            return;
                        } catch (Exception e) {
                            org.telegram.messenger.f8.g(e, true);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public boolean l() {
        return false;
    }

    @Override
    public boolean m(float f7) {
        return false;
    }

    @Override
    public void o(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        int i10 = this.f30388a;
        Object obj = this.f30389b;
        switch (i10) {
            case 12:
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.addUpdateListener(new a6((m6) obj, 1));
                duration.start();
                return;
            default:
                g9 g9Var = (g9) obj;
                if (z10 && !z11) {
                    g9Var.a();
                    return;
                }
                return;
        }
    }

    @Override
    public void onFinishVideoRecording(String str, long j10) {
        int i10;
        int i11;
        org.telegram.messenger.ef efVar;
        nl nlVar = (nl) this.f30389b;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = nlVar.e;
        bi biVar = chatAttachAlertPhotoLayout.f30947b;
        if (nlVar.f28814a != null && !biVar.M1 && chatAttachAlertPhotoLayout.P != null) {
            ChatAttachAlertPhotoLayout.f23845q1 = false;
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(new File(str).getAbsolutePath(), options);
                i10 = options.outWidth;
                try {
                    i11 = options.outHeight;
                } catch (Exception unused) {
                    i11 = 0;
                    int i12 = i10;
                    int i13 = ChatAttachAlertPhotoLayout.f23849u1;
                    ChatAttachAlertPhotoLayout.f23849u1 = i13 - 1;
                    efVar = new org.telegram.messenger.ef(i13, nlVar.f28814a.getAbsolutePath(), 0, true, i12, i11);
                    efVar.E = (int) (((float) j10) / 1000.0f);
                    efVar.f19508c = str;
                    if (biVar.K2 != 0) {
                        org.telegram.messenger.ye yeVar = new org.telegram.messenger.ye();
                        efVar.A = yeVar;
                        yeVar.f19371l = true;
                        yeVar.f19377u = false;
                        yeVar.v = 1.0f;
                    }
                    chatAttachAlertPhotoLayout.k0(efVar, false, false);
                }
            } catch (Exception unused2) {
                i10 = 0;
            }
            int i122 = i10;
            int i132 = ChatAttachAlertPhotoLayout.f23849u1;
            ChatAttachAlertPhotoLayout.f23849u1 = i132 - 1;
            efVar = new org.telegram.messenger.ef(i132, nlVar.f28814a.getAbsolutePath(), 0, true, i122, i11);
            efVar.E = (int) (((float) j10) / 1000.0f);
            efVar.f19508c = str;
            if (biVar.K2 != 0 && chatAttachAlertPhotoLayout.P.isFrontface()) {
                org.telegram.messenger.ye yeVar2 = new org.telegram.messenger.ye();
                efVar.A = yeVar2;
                yeVar2.f19371l = true;
                yeVar2.f19377u = false;
                yeVar2.v = 1.0f;
            }
            chatAttachAlertPhotoLayout.k0(efVar, false, false);
        }
    }

    @Override
    public boolean p(m2.t tVar, int i10, Bundle bundle) {
        rf rfVar = (rf) this.f30389b;
        ChatActivityEnterView chatActivityEnterView = rfVar.Z1;
        if (chatActivityEnterView.p5) {
            return true;
        }
        int i11 = n0.a.f13399a;
        if (Build.VERSION.SDK_INT >= 25 && (i10 & 1) != 0) {
            try {
                ((t0.h) tVar.f12684b).c();
            } catch (Exception unused) {
                return false;
            }
        }
        t0.h hVar = (t0.h) tVar.f12684b;
        if (!hVar.getDescription().hasMimeType("image/gif") && !org.telegram.messenger.qz.x0(hVar.a(), null)) {
            rfVar.I(hVar.a(), hVar.getDescription().getMimeType(0));
            return true;
        } else if (chatActivityEnterView.c()) {
            s4.L(chatActivityEnterView.O2, chatActivityEnterView.P2.a(), new f2(5, rfVar, tVar), chatActivityEnterView.W3);
            return true;
        } else {
            rfVar.K(tVar, true, 0, 0);
            return true;
        }
    }

    @Override
    public void q(int i10, Drawable drawable) {
        int i11 = this.f30388a;
    }

    @Override
    public void r(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.k1 k1Var = (org.telegram.ui.ActionBar.k1) ((k.a) this.f30389b).f10473b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && k1Var != null && k1Var.isShowing()) {
            k1Var.d(true);
        }
    }

    @Override
    public void s(Canvas canvas, int i10) {
        ((bb) this.f30389b).dispatchDrawImplBlur(canvas, i10);
    }

    @Override
    public void t(ac0 ac0Var, int i10) {
        org.telegram.ui.Cells.y3 y3Var = (org.telegram.ui.Cells.y3) this.f30389b;
        try {
            if (i10 == 0) {
                y3Var.setText(org.telegram.messenger.cd.L0(2131751435, null));
            } else {
                y3Var.setText(org.telegram.messenger.cd.L0(2131745557, null));
            }
        } catch (Exception unused) {
        }
    }

    @Override
    public boolean v(long j10, int i10, int i11, int i12, th.l7 l7Var) {
        on onVar = (on) ((org.telegram.ui.Cells.o6) this.f30389b).T;
        ImageReceiver imageReceiver = onVar.f26292a;
        l7Var.f49185c = imageReceiver;
        l7Var.f49191l = imageReceiver;
        org.telegram.ui.Cells.o6 o6Var = onVar.G;
        l7Var.f49192m = o6Var;
        boolean z10 = o6Var.f49483w;
        on onVar2 = onVar.K.e;
        l7Var.f49183a = onVar2;
        l7Var.f49190k = onVar2.getAlpha();
        l7Var.h = 0.0f;
        l7Var.f49188i = org.telegram.messenger.i0.f16026q.y;
        l7Var.f49187g = (View) onVar.getParent();
        return true;
    }

    @Override
    public void z() {
        v5 v5Var = (v5) this.f30389b;
        v5Var.b();
        v5Var.e();
    }

    private final void x(ImageReceiver imageReceiver) {
    }

    private final void y(ImageReceiver imageReceiver) {
    }

    @Override
    public void c(boolean z10) {
    }

    @Override
    public void g(boolean z10) {
    }

    @Override
    public void a() {
    }

    @Override
    public void n() {
    }

    private final void u(int i10, Drawable drawable) {
    }

    private final void w(int i10, Drawable drawable) {
    }

    @Override
    public void q0(View view, float f7, float f10) {
    }
}
