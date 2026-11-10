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
public final class t implements org.telegram.ui.ActionBar.r1, cj0, db0, eb0, fb0, te.d, org.telegram.messenger.lc, s4, r0.m, wh.a, t0.e, dj0, CameraController.VideoTakeCallback, org.telegram.ui.Cells.o5, di.m9, org.telegram.ui.ActionBar.m0, org.telegram.ui.ActionBar.e1 {
    public final int f38110a;
    public final Object f38111b;

    public t(Object obj, int i7) {
        this.f38110a = i7;
        this.f38111b = obj;
    }

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public boolean B(float f10) {
        return false;
    }

    @Override
    public void L(int i7, int i10, boolean z9) {
        int i11;
        e8 e8Var = (e8) this.f38111b;
        int i12 = i7 * 60;
        if (i7 == 0) {
            i11 = 71;
        } else {
            i11 = 70;
        }
        e8Var.X0(i12, i11);
    }

    @Override
    public void O(ImageReceiver imageReceiver) {
        int i7 = this.f38110a;
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        va vaVar = ((wa) this.f38111b).f39935a;
        if (vaVar != null) {
            vaVar.setPadding(I0.f15122a, I0.f15123b, I0.f15124c, I0.d);
        }
        view.requestLayout();
        return r0.k1.f54212b;
    }

    @Override
    public void Y0() {
        x5 x5Var = (x5) this.f38111b;
        x5Var.b();
        x5Var.e();
    }

    @Override
    public boolean c(int i7, View view) {
        Object O;
        uj ujVar = (uj) this.f38111b;
        v4.g0 adapter = ujVar.f38698r.getAdapter();
        nj njVar = ujVar.f38700w;
        if (adapter == njVar) {
            O = njVar.E(i7);
        } else {
            tj tjVar = ujVar.D;
            O = tjVar.O(tjVar.S(i7), tjVar.Q(i7));
        }
        return ujVar.T(view, O);
    }

    @Override
    public void d(int i7) {
        o2 o2Var = (o2) this.f38111b;
        if (i7 == 0) {
            o2Var.run();
        }
    }

    @Override
    public void e(long j3, int i7, di.l3 l3Var) {
        l3Var.run();
    }

    @Override
    public void f(float r9, float r10, int r11, android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t.f(float, float, int, android.view.View):void");
    }

    @Override
    public void f0(ImageReceiver imageReceiver, boolean z9, boolean z10, boolean z11) {
        int i7 = this.f38110a;
        Object obj = this.f38111b;
        switch (i7) {
            case 12:
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.addUpdateListener(new d6((p6) obj, 1));
                duration.start();
                return;
            default:
                k9 k9Var = (k9) obj;
                if (z9 && !z10) {
                    k9Var.a();
                    return;
                }
                return;
        }
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f38110a) {
            case 0:
                z zVar = (z) this.f38111b;
                vf.b h = u1Var.h(-1, true, true);
                h.d();
                TL_aicompose.deleteTone deletetone = new TL_aicompose.deleteTone();
                deletetone.tone = TL_aicompose.InputAiComposeTone.from(zVar.f40781e2);
                ConnectionsManager.getInstance(zVar.f28669a).sendRequestTyped(deletetone, new d3.b(1), new bi.t0(zVar, h, u1Var, 5));
                return;
            case 2:
                ((org.telegram.ui.m6) this.f38111b).run();
                return;
            case 3:
                ((bi.r3) this.f38111b).run();
                return;
            case 4:
                ((bg.l0) this.f38111b).run();
                return;
            case 5:
                ((q1) this.f38111b).run();
                return;
            case 6:
                ((dr) this.f38111b).run();
                return;
            case 8:
                ((i2) this.f38111b).run();
                return;
            case 17:
                ((of) this.f38111b).f36599a.U0.r();
                return;
            case 19:
                ((org.telegram.ui.fq) this.f38111b).run();
                org.telegram.messenger.qp.e1().edit().putBoolean("trimvoicehint", false).apply();
                return;
            case 23:
                ((an) this.f38111b).f38656b.dismiss();
                return;
            case 24:
                ((gm) this.f38111b).f33935a.E.r();
                return;
            default:
                ((ht) this.f38111b).f34459a.d.r();
                return;
        }
    }

    @Override
    public String h(int i7) {
        return ((String[]) this.f38111b)[i7];
    }

    @Override
    public void i(int i7) {
        ArrayList arrayList;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        String str;
        Context context;
        switch (this.f38110a) {
            case 26:
                up upVar = ((vp) this.f38111b).f39694a;
                boolean z9 = true;
                if (i7 != 1 && i7 != 2) {
                    if (i7 == 3) {
                        upVar.b();
                        return;
                    }
                    return;
                }
                if (i7 != 2) {
                    z9 = false;
                }
                upVar.a(z9);
                return;
            default:
                qu quVar = (qu) this.f38111b;
                org.telegram.ui.ActionBar.f2 f2Var = quVar.f37396m1;
                cu cuVar = quVar.f37397o1;
                if (cuVar != null && (arrayList = cuVar.f36690b) != null && !arrayList.isEmpty()) {
                    TLRPC.StickerSet stickerSet = ((TLRPC.TL_messages_stickerSet) cuVar.f36690b.get(0)).set;
                    if (stickerSet != null && stickerSet.emojis) {
                        str = "https://" + org.telegram.messenger.qp.s1(quVar.f28669a).U2 + "/addemoji/" + tL_messages_stickerSet.set.short_name;
                    } else {
                        str = "https://" + org.telegram.messenger.qp.s1(quVar.f28669a).U2 + "/addstickers/" + tL_messages_stickerSet.set.short_name;
                    }
                    String str2 = str;
                    if (i7 == 1) {
                        if (f2Var != null) {
                            context = f2Var.getParentActivity();
                        } else {
                            context = null;
                        }
                        if (context == null) {
                            context = quVar.getContext();
                        }
                        fu fuVar = new fu(quVar, context, str2, str2, quVar.I0);
                        if (f2Var != null) {
                            f2Var.showDialog(fuVar);
                            return;
                        } else {
                            fuVar.show();
                            return;
                        }
                    } else if (i7 == 2) {
                        try {
                            org.telegram.messenger.g0.g(str2);
                            new gc((FrameLayout) quVar.f28672b, quVar.I0).k(false).j();
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
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) ((k.a) this.f38111b).f17106b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && g1Var != null && g1Var.isShowing()) {
            g1Var.d(true);
        }
    }

    @Override
    public boolean k(qt qtVar, int i7, Bundle bundle) {
        uf ufVar = (uf) this.f38111b;
        ChatActivityEnterView chatActivityEnterView = ufVar.Z1;
        if (chatActivityEnterView.f31124p5) {
            return true;
        }
        int i10 = n0.a.f20122a;
        if (Build.VERSION.SDK_INT >= 25 && (i7 & 1) != 0) {
            try {
                ((t0.h) qtVar.f37395b).e();
            } catch (Exception unused) {
                return false;
            }
        }
        t0.h hVar = (t0.h) qtVar.f37395b;
        if (!hVar.getDescription().hasMimeType("image/gif") && !org.telegram.messenger.gz.x0(hVar.c(), null)) {
            ufVar.I(hVar.c(), hVar.getDescription().getMimeType(0));
            return true;
        } else if (chatActivityEnterView.c()) {
            u4.J(chatActivityEnterView.O2, chatActivityEnterView.P2.a(), new e2(5, ufVar, qtVar), chatActivityEnterView.W3);
            return true;
        } else {
            ufVar.K(qtVar, true, 0, 0);
            return true;
        }
    }

    @Override
    public void m(Canvas canvas, int i7) {
        ((fb) this.f38111b).dispatchDrawImplBlur(canvas, i7);
    }

    @Override
    public void n(hb0 hb0Var, int i7) {
        org.telegram.ui.Cells.w3 w3Var = (org.telegram.ui.Cells.w3) this.f38111b;
        try {
            if (i7 == 0) {
                w3Var.setText(org.telegram.messenger.id.M0(2131751434, null));
            } else {
                w3Var.setText(org.telegram.messenger.id.M0(2131745540, null));
            }
        } catch (Exception unused) {
        }
    }

    @Override
    public boolean o(long j3, int i7, int i10, int i11, di.n9 n9Var) {
        fn fnVar = (fn) ((org.telegram.ui.Cells.k6) this.f38111b).T;
        ImageReceiver imageReceiver = fnVar.f35249a;
        n9Var.f9410c = imageReceiver;
        n9Var.f9417l = imageReceiver;
        org.telegram.ui.Cells.k6 k6Var = fnVar.G;
        n9Var.f9418m = k6Var;
        boolean z9 = k6Var.f9465w;
        fn fnVar2 = fnVar.K.f34997e;
        n9Var.f9408a = fnVar2;
        n9Var.f9416k = fnVar2.getAlpha();
        n9Var.h = 0.0f;
        n9Var.f9414i = org.telegram.messenger.g0.f22567q.y;
        n9Var.f9413g = (View) fnVar.getParent();
        return true;
    }

    @Override
    public void onFinishVideoRecording(String str, long j3) {
        int i7;
        int i10;
        org.telegram.messenger.gf gfVar;
        gl glVar = (gl) this.f38111b;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = glVar.f33932e;
        ci ciVar = chatAttachAlertPhotoLayout.f38656b;
        if (glVar.f33929a != null && !ciVar.P1 && chatAttachAlertPhotoLayout.P != null) {
            ChatAttachAlertPhotoLayout.f31204q1 = false;
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(new File(str).getAbsolutePath(), options);
                i7 = options.outWidth;
                try {
                    i10 = options.outHeight;
                } catch (Exception unused) {
                    i10 = 0;
                    int i11 = i7;
                    int i12 = ChatAttachAlertPhotoLayout.f31208u1;
                    ChatAttachAlertPhotoLayout.f31208u1 = i12 - 1;
                    gfVar = new org.telegram.messenger.gf(i12, glVar.f33929a.getAbsolutePath(), 0, true, i11, i10);
                    gfVar.E = (int) (((float) j3) / 1000.0f);
                    gfVar.f26850c = str;
                    if (ciVar.N2 != 0) {
                        org.telegram.messenger.ye yeVar = new org.telegram.messenger.ye();
                        gfVar.A = yeVar;
                        yeVar.f26647l = true;
                        yeVar.f26653u = false;
                        yeVar.v = 1.0f;
                    }
                    chatAttachAlertPhotoLayout.m0(gfVar, false, false);
                }
            } catch (Exception unused2) {
                i7 = 0;
            }
            int i112 = i7;
            int i122 = ChatAttachAlertPhotoLayout.f31208u1;
            ChatAttachAlertPhotoLayout.f31208u1 = i122 - 1;
            gfVar = new org.telegram.messenger.gf(i122, glVar.f33929a.getAbsolutePath(), 0, true, i112, i10);
            gfVar.E = (int) (((float) j3) / 1000.0f);
            gfVar.f26850c = str;
            if (ciVar.N2 != 0 && chatAttachAlertPhotoLayout.P.isFrontface()) {
                org.telegram.messenger.ye yeVar2 = new org.telegram.messenger.ye();
                gfVar.A = yeVar2;
                yeVar2.f26647l = true;
                yeVar2.f26653u = false;
                yeVar2.v = 1.0f;
            }
            chatAttachAlertPhotoLayout.m0(gfVar, false, false);
        }
    }

    @Override
    public void t0(int i7, Drawable drawable) {
        int i10 = this.f38110a;
    }

    private final void r(ImageReceiver imageReceiver) {
    }

    private final void s(ImageReceiver imageReceiver) {
    }

    @Override
    public void b(boolean z9) {
    }

    @Override
    public void l(boolean z9) {
    }

    @Override
    public void D() {
    }

    @Override
    public void a() {
    }

    private final void p(int i7, Drawable drawable) {
    }

    private final void q(int i7, Drawable drawable) {
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
