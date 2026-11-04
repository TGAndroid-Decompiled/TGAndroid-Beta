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
public final class t implements org.telegram.ui.ActionBar.p1, gj0, ya0, za0, ab0, qe.d, org.telegram.messenger.ec, r4, r0.m, xh.a, t0.e, hj0, CameraController.VideoTakeCallback, org.telegram.ui.Cells.o5, ei.n9, org.telegram.ui.ActionBar.l0, org.telegram.ui.ActionBar.d1 {
    public final int f38209a;
    public final Object f38210b;

    public t(Object obj, int i3) {
        this.f38209a = i3;
        this.f38210b = obj;
    }

    @Override
    public void D(ImageReceiver imageReceiver) {
        int i3 = this.f38209a;
    }

    @Override
    public void F0(int i3, Drawable drawable) {
        int i10 = this.f38209a;
    }

    @Override
    public void L(int i3, int i10, boolean z10) {
        int i11;
        d8 d8Var = (d8) this.f38210b;
        int i12 = i3 * 60;
        if (i3 == 0) {
            i11 = 71;
        } else {
            i11 = 70;
        }
        d8Var.W0(i12, i11);
    }

    @Override
    public r0.k1 R0(View view, r0.k1 k1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        va vaVar = ((wa) this.f38210b).f39976a;
        if (vaVar != null) {
            vaVar.setPadding(I0.f14495a, I0.f14496b, I0.f14497c, I0.d);
        }
        view.requestLayout();
        return r0.k1.f54025b;
    }

    @Override
    public void b(float r9, float r10, int r11, android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t.b(float, float, int, android.view.View):void");
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public void d(int i3) {
        m2 m2Var = (m2) this.f38210b;
        if (i3 == 0) {
            m2Var.run();
        }
    }

    @Override
    public String e(int i3) {
        return ((String[]) this.f38210b)[i3];
    }

    @Override
    public boolean f(int i3, View view) {
        Object O;
        uj ujVar = (uj) this.f38210b;
        u4.h0 adapter = ujVar.f38770r.getAdapter();
        nj njVar = ujVar.f38772w;
        if (adapter == njVar) {
            O = njVar.E(i3);
        } else {
            tj tjVar = ujVar.E;
            O = tjVar.O(tjVar.S(i3), tjVar.Q(i3));
        }
        return ujVar.T(view, O);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.f38209a) {
            case 0:
                z zVar = (z) this.f38210b;
                sf.b h = s1Var.h(-1, true, true);
                h.d();
                TL_aicompose.deleteTone deletetone = new TL_aicompose.deleteTone();
                deletetone.tone = TL_aicompose.InputAiComposeTone.from(zVar.c2);
                ConnectionsManager.getInstance(zVar.f28583a).sendRequestTyped(deletetone, new c3.b(1), new ai.n0(zVar, h, s1Var, 7));
                return;
            case 2:
                ((o4.b1) this.f38210b).run();
                return;
            case 3:
                ((ci.e3) this.f38210b).run();
                return;
            case 4:
                ((cg.k0) this.f38210b).run();
                return;
            case 5:
                ((q1) this.f38210b).run();
                return;
            case 6:
                ((er) this.f38210b).run();
                return;
            case 8:
                ((h2) this.f38210b).run();
                return;
            case 17:
                ((nf) this.f38210b).f36497a.V0.r();
                return;
            case 19:
                ((org.telegram.ui.lo) this.f38210b).run();
                org.telegram.messenger.hp.e1().edit().putBoolean("trimvoicehint", false).apply();
                return;
            case 23:
                ((an) this.f38210b).f38416b.dismiss();
                return;
            case 24:
                ((gm) this.f38210b).f34151a.F.r();
                return;
            default:
                ((gt) this.f38210b).f34185a.d.r();
                return;
        }
    }

    @Override
    public void h(Canvas canvas, int i3) {
        ((fb) this.f38210b).dispatchDrawImplBlur(canvas, i3);
    }

    @Override
    public void i(int i3) {
        ArrayList arrayList;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        String str;
        Context context;
        switch (this.f38209a) {
            case 26:
                up upVar = ((vp) this.f38210b).f39749a;
                boolean z10 = true;
                if (i3 != 1 && i3 != 2) {
                    if (i3 == 3) {
                        upVar.b();
                        return;
                    }
                    return;
                }
                if (i3 != 2) {
                    z10 = false;
                }
                upVar.a(z10);
                return;
            default:
                pu puVar = (pu) this.f38210b;
                org.telegram.ui.ActionBar.d2 d2Var = puVar.k1;
                bu buVar = puVar.m1;
                if (buVar != null && (arrayList = buVar.f36622b) != null && !arrayList.isEmpty()) {
                    TLRPC.StickerSet stickerSet = ((TLRPC.TL_messages_stickerSet) buVar.f36622b.get(0)).set;
                    if (stickerSet != null && stickerSet.emojis) {
                        str = "https://" + org.telegram.messenger.hp.s1(puVar.f28583a).V2 + "/addemoji/" + tL_messages_stickerSet.set.short_name;
                    } else {
                        str = "https://" + org.telegram.messenger.hp.s1(puVar.f28583a).V2 + "/addstickers/" + tL_messages_stickerSet.set.short_name;
                    }
                    String str2 = str;
                    if (i3 == 1) {
                        if (d2Var != null) {
                            context = d2Var.getParentActivity();
                        } else {
                            context = null;
                        }
                        if (context == null) {
                            context = puVar.getContext();
                        }
                        eu euVar = new eu(puVar, context, str2, str2, puVar.J0);
                        if (d2Var != null) {
                            d2Var.showDialog(euVar);
                            return;
                        } else {
                            euVar.show();
                            return;
                        }
                    } else if (i3 == 2) {
                        try {
                            org.telegram.messenger.g0.g(str2);
                            new fc((FrameLayout) puVar.f28586b, puVar.J0).k(false).j();
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
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
    public boolean j(long j10, int i3, int i10, int i11, ei.o9 o9Var) {
        fn fnVar = (fn) ((org.telegram.ui.Cells.j6) this.f38210b).T;
        ImageReceiver imageReceiver = fnVar.f35342a;
        o9Var.f10728c = imageReceiver;
        o9Var.f10735l = imageReceiver;
        org.telegram.ui.Cells.j6 j6Var = fnVar.H;
        o9Var.f10736m = j6Var;
        boolean z10 = j6Var.f10715w;
        fn fnVar2 = fnVar.L.f35127e;
        o9Var.f10726a = fnVar2;
        o9Var.f10734k = fnVar2.getAlpha();
        o9Var.h = 0.0f;
        o9Var.f10732i = org.telegram.messenger.g0.f22608q.y;
        o9Var.f10731g = (View) fnVar.getParent();
        return true;
    }

    @Override
    public void k(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) ((k.a) this.f38210b).f16385b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && f1Var != null && f1Var.isShowing()) {
            f1Var.d(true);
        }
    }

    @Override
    public void l(cb0 cb0Var, int i3) {
        org.telegram.ui.Cells.w3 w3Var = (org.telegram.ui.Cells.w3) this.f38210b;
        try {
            if (i3 == 0) {
                w3Var.setText(org.telegram.messenger.bd.M0(2131751435, null));
            } else {
                w3Var.setText(org.telegram.messenger.bd.M0(2131745550, null));
            }
        } catch (Exception unused) {
        }
    }

    @Override
    public void l0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        int i3 = this.f38209a;
        Object obj = this.f38210b;
        switch (i3) {
            case 12:
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.addUpdateListener(new c6((o6) obj, 1));
                duration.start();
                return;
            default:
                k9 k9Var = (k9) obj;
                if (z10 && !z11) {
                    k9Var.a();
                    return;
                }
                return;
        }
    }

    @Override
    public boolean m(y00 y00Var, int i3, Bundle bundle) {
        tf tfVar = (tf) this.f38210b;
        ChatActivityEnterView chatActivityEnterView = tfVar.f38406a2;
        if (chatActivityEnterView.f31184q5) {
            return true;
        }
        int i10 = n0.a.f20106a;
        if (Build.VERSION.SDK_INT >= 25 && (i3 & 1) != 0) {
            try {
                ((t0.h) y00Var.f40562a).b();
            } catch (Exception unused) {
                return false;
            }
        }
        t0.h hVar = (t0.h) y00Var.f40562a;
        if (!hVar.getDescription().hasMimeType("image/gif") && !org.telegram.messenger.yy.x0(hVar.a(), null)) {
            tfVar.I(hVar.a(), hVar.getDescription().getMimeType(0));
            return true;
        } else if (chatActivityEnterView.c()) {
            t4.L(chatActivityEnterView.P2, chatActivityEnterView.Q2.a(), new org.telegram.ui.jo(15, tfVar, y00Var), chatActivityEnterView.X3);
            return true;
        } else {
            tfVar.K(y00Var, true, 0, 0);
            return true;
        }
    }

    @Override
    public void onFinishVideoRecording(String str, long j10) {
        int i3;
        int i10;
        org.telegram.messenger.ye yeVar;
        gl glVar = (gl) this.f38210b;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = glVar.f34149e;
        bi biVar = chatAttachAlertPhotoLayout.f38416b;
        if (glVar.f34146a != null && !biVar.N1 && chatAttachAlertPhotoLayout.Q != null) {
            ChatAttachAlertPhotoLayout.f31258r1 = false;
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(new File(str).getAbsolutePath(), options);
                i3 = options.outWidth;
                try {
                    i10 = options.outHeight;
                } catch (Exception unused) {
                    i10 = 0;
                    int i11 = i3;
                    int i12 = ChatAttachAlertPhotoLayout.f31262v1;
                    ChatAttachAlertPhotoLayout.f31262v1 = i12 - 1;
                    yeVar = new org.telegram.messenger.ye(i12, glVar.f34146a.getAbsolutePath(), 0, true, i11, i10);
                    yeVar.E = (int) (((float) j10) / 1000.0f);
                    yeVar.f25311c = str;
                    if (biVar.L2 != 0) {
                        org.telegram.messenger.re reVar = new org.telegram.messenger.re();
                        yeVar.A = reVar;
                        reVar.f25118l = true;
                        reVar.f25124u = false;
                        reVar.v = 1.0f;
                    }
                    chatAttachAlertPhotoLayout.m0(yeVar, false, false);
                }
            } catch (Exception unused2) {
                i3 = 0;
            }
            int i112 = i3;
            int i122 = ChatAttachAlertPhotoLayout.f31262v1;
            ChatAttachAlertPhotoLayout.f31262v1 = i122 - 1;
            yeVar = new org.telegram.messenger.ye(i122, glVar.f34146a.getAbsolutePath(), 0, true, i112, i10);
            yeVar.E = (int) (((float) j10) / 1000.0f);
            yeVar.f25311c = str;
            if (biVar.L2 != 0 && chatAttachAlertPhotoLayout.Q.isFrontface()) {
                org.telegram.messenger.re reVar2 = new org.telegram.messenger.re();
                yeVar.A = reVar2;
                reVar2.f25118l = true;
                reVar2.f25124u = false;
                reVar2.v = 1.0f;
            }
            chatAttachAlertPhotoLayout.m0(yeVar, false, false);
        }
    }

    @Override
    public void r(long j10, int i3, ei.o3 o3Var) {
        o3Var.run();
    }

    @Override
    public void s1() {
        w5 w5Var = (w5) this.f38210b;
        w5Var.b();
        w5Var.e();
    }

    @Override
    public boolean t() {
        return false;
    }

    @Override
    public boolean x(float f10) {
        return false;
    }

    private final void q(ImageReceiver imageReceiver) {
    }

    private final void s(ImageReceiver imageReceiver) {
    }

    @Override
    public void c(boolean z10) {
    }

    @Override
    public void o(boolean z10) {
    }

    @Override
    public void G() {
    }

    @Override
    public void a() {
    }

    private final void n(int i3, Drawable drawable) {
    }

    private final void p(int i3, Drawable drawable) {
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
