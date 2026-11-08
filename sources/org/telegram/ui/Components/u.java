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
public final class u implements org.telegram.ui.ActionBar.r1, cj0, db0, eb0, fb0, te.d, org.telegram.messenger.lc, t4, r0.m, wh.a, t0.e, dj0, CameraController.VideoTakeCallback, org.telegram.ui.Cells.o5, di.l9, org.telegram.ui.ActionBar.m0, org.telegram.ui.ActionBar.e1 {
    public final int f38468a;
    public final Object f38469b;

    public u(Object obj, int i7) {
        this.f38468a = i7;
        this.f38469b = obj;
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
        f8 f8Var = (f8) this.f38469b;
        int i12 = i7 * 60;
        if (i7 == 0) {
            i11 = 71;
        } else {
            i11 = 70;
        }
        f8Var.X0(i12, i11);
    }

    @Override
    public void O(ImageReceiver imageReceiver) {
        int i7 = this.f38468a;
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        wa waVar = ((xa) this.f38469b).f40275a;
        if (waVar != null) {
            waVar.setPadding(I0.f15120a, I0.f15121b, I0.f15122c, I0.d);
        }
        view.requestLayout();
        return r0.k1.f54201b;
    }

    @Override
    public void Y0() {
        y5 y5Var = (y5) this.f38469b;
        y5Var.b();
        y5Var.e();
    }

    @Override
    public boolean c(int i7, View view) {
        Object O;
        vj vjVar = (vj) this.f38469b;
        v4.g0 adapter = vjVar.f39020r.getAdapter();
        oj ojVar = vjVar.f39022w;
        if (adapter == ojVar) {
            O = ojVar.E(i7);
        } else {
            uj ujVar = vjVar.D;
            O = ujVar.O(ujVar.S(i7), ujVar.Q(i7));
        }
        return vjVar.T(view, O);
    }

    @Override
    public void d(int i7) {
        p2 p2Var = (p2) this.f38469b;
        if (i7 == 0) {
            p2Var.run();
        }
    }

    @Override
    public void e(long j3, int i7, di.l3 l3Var) {
        l3Var.run();
    }

    @Override
    public void f(float r9, float r10, int r11, android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.u.f(float, float, int, android.view.View):void");
    }

    @Override
    public void f0(ImageReceiver imageReceiver, boolean z9, boolean z10, boolean z11) {
        int i7 = this.f38468a;
        Object obj = this.f38469b;
        switch (i7) {
            case 12:
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.addUpdateListener(new e6((q6) obj, 1));
                duration.start();
                return;
            default:
                l9 l9Var = (l9) obj;
                if (z9 && !z10) {
                    l9Var.a();
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
        switch (this.f38468a) {
            case 0:
                a0 a0Var = (a0) this.f38469b;
                vf.b h = u1Var.h(-1, true, true);
                h.d();
                TL_aicompose.deleteTone deletetone = new TL_aicompose.deleteTone();
                deletetone.tone = TL_aicompose.InputAiComposeTone.from(a0Var.f31620b2);
                ConnectionsManager.getInstance(a0Var.f28616a).sendRequestTyped(deletetone, new d3.b(1), new bi.t0(a0Var, h, u1Var, 5));
                return;
            case 2:
                ((org.telegram.ui.m6) this.f38469b).run();
                return;
            case 3:
                ((bi.r3) this.f38469b).run();
                return;
            case 4:
                ((bg.l0) this.f38469b).run();
                return;
            case 5:
                ((r1) this.f38469b).run();
                return;
            case 6:
                ((er) this.f38469b).run();
                return;
            case 8:
                ((j2) this.f38469b).run();
                return;
            case 17:
                ((pf) this.f38469b).f36916a.U0.r();
                return;
            case 19:
                ((f) this.f38469b).run();
                org.telegram.messenger.qp.e1().edit().putBoolean("trimvoicehint", false).apply();
                return;
            case 23:
                ((bn) this.f38469b).f39004b.dismiss();
                return;
            case 24:
                ((hm) this.f38469b).f34294a.E.r();
                return;
            default:
                ((jt) this.f38469b).f35091a.d.r();
                return;
        }
    }

    @Override
    public String h(int i7) {
        return ((String[]) this.f38469b)[i7];
    }

    @Override
    public void i(int i7) {
        ArrayList arrayList;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        String str;
        Context context;
        switch (this.f38468a) {
            case 26:
                up upVar = ((vp) this.f38469b).f39683a;
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
                ru ruVar = (ru) this.f38469b;
                org.telegram.ui.ActionBar.f2 f2Var = ruVar.f37776j1;
                du duVar = ruVar.l1;
                if (duVar != null && (arrayList = duVar.f37102b) != null && !arrayList.isEmpty()) {
                    TLRPC.StickerSet stickerSet = ((TLRPC.TL_messages_stickerSet) duVar.f37102b.get(0)).set;
                    if (stickerSet != null && stickerSet.emojis) {
                        str = "https://" + org.telegram.messenger.qp.s1(ruVar.f28616a).U2 + "/addemoji/" + tL_messages_stickerSet.set.short_name;
                    } else {
                        str = "https://" + org.telegram.messenger.qp.s1(ruVar.f28616a).U2 + "/addstickers/" + tL_messages_stickerSet.set.short_name;
                    }
                    String str2 = str;
                    if (i7 == 1) {
                        if (f2Var != null) {
                            context = f2Var.getParentActivity();
                        } else {
                            context = null;
                        }
                        if (context == null) {
                            context = ruVar.getContext();
                        }
                        gu guVar = new gu(ruVar, context, str2, str2, ruVar.I0);
                        if (f2Var != null) {
                            f2Var.showDialog(guVar);
                            return;
                        } else {
                            guVar.show();
                            return;
                        }
                    } else if (i7 == 2) {
                        try {
                            org.telegram.messenger.g0.g(str2);
                            new hc((FrameLayout) ruVar.f28619b, ruVar.I0).k(false).j();
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
        org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) ((k.a) this.f38469b).f17106b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && g1Var != null && g1Var.isShowing()) {
            g1Var.d(true);
        }
    }

    @Override
    public boolean k(rt rtVar, int i7, Bundle bundle) {
        vf vfVar = (vf) this.f38469b;
        ChatActivityEnterView chatActivityEnterView = vfVar.Z1;
        if (chatActivityEnterView.f31108p5) {
            return true;
        }
        int i10 = n0.a.f20117a;
        if (Build.VERSION.SDK_INT >= 25 && (i7 & 1) != 0) {
            try {
                ((t0.h) rtVar.f37758b).e();
            } catch (Exception unused) {
                return false;
            }
        }
        t0.h hVar = (t0.h) rtVar.f37758b;
        if (!hVar.getDescription().hasMimeType("image/gif") && !org.telegram.messenger.gz.x0(hVar.c(), null)) {
            vfVar.I(hVar.c(), hVar.getDescription().getMimeType(0));
            return true;
        } else if (chatActivityEnterView.c()) {
            v4.J(chatActivityEnterView.O2, chatActivityEnterView.P2.a(), new f2(5, vfVar, rtVar), chatActivityEnterView.W3);
            return true;
        } else {
            vfVar.K(rtVar, true, 0, 0);
            return true;
        }
    }

    @Override
    public void m(Canvas canvas, int i7) {
        ((gb) this.f38469b).dispatchDrawImplBlur(canvas, i7);
    }

    @Override
    public void n(hb0 hb0Var, int i7) {
        org.telegram.ui.Cells.w3 w3Var = (org.telegram.ui.Cells.w3) this.f38469b;
        try {
            if (i7 == 0) {
                w3Var.setText(org.telegram.messenger.id.M0(2131751435, null));
            } else {
                w3Var.setText(org.telegram.messenger.id.M0(2131745543, null));
            }
        } catch (Exception unused) {
        }
    }

    @Override
    public boolean o(long j3, int i7, int i10, int i11, di.m9 m9Var) {
        gn gnVar = (gn) ((org.telegram.ui.Cells.k6) this.f38469b).T;
        ImageReceiver imageReceiver = gnVar.f35600a;
        m9Var.f9364c = imageReceiver;
        m9Var.f9371l = imageReceiver;
        org.telegram.ui.Cells.k6 k6Var = gnVar.G;
        m9Var.f9372m = k6Var;
        boolean z9 = k6Var.f9427w;
        gn gnVar2 = gnVar.K.f35367e;
        m9Var.f9362a = gnVar2;
        m9Var.f9370k = gnVar2.getAlpha();
        m9Var.h = 0.0f;
        m9Var.f9368i = org.telegram.messenger.g0.f22563q.y;
        m9Var.f9367g = (View) gnVar.getParent();
        return true;
    }

    @Override
    public void onFinishVideoRecording(String str, long j3) {
        int i7;
        int i10;
        org.telegram.messenger.gf gfVar;
        hl hlVar = (hl) this.f38469b;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = hlVar.f34290e;
        di diVar = chatAttachAlertPhotoLayout.f39004b;
        if (hlVar.f34287a != null && !diVar.M1 && chatAttachAlertPhotoLayout.P != null) {
            ChatAttachAlertPhotoLayout.f31188q1 = false;
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
                    int i12 = ChatAttachAlertPhotoLayout.f31192u1;
                    ChatAttachAlertPhotoLayout.f31192u1 = i12 - 1;
                    gfVar = new org.telegram.messenger.gf(i12, hlVar.f34287a.getAbsolutePath(), 0, true, i11, i10);
                    gfVar.E = (int) (((float) j3) / 1000.0f);
                    gfVar.f26846c = str;
                    if (diVar.K2 != 0) {
                        org.telegram.messenger.ye yeVar = new org.telegram.messenger.ye();
                        gfVar.A = yeVar;
                        yeVar.f26643l = true;
                        yeVar.f26649u = false;
                        yeVar.v = 1.0f;
                    }
                    chatAttachAlertPhotoLayout.m0(gfVar, false, false);
                }
            } catch (Exception unused2) {
                i7 = 0;
            }
            int i112 = i7;
            int i122 = ChatAttachAlertPhotoLayout.f31192u1;
            ChatAttachAlertPhotoLayout.f31192u1 = i122 - 1;
            gfVar = new org.telegram.messenger.gf(i122, hlVar.f34287a.getAbsolutePath(), 0, true, i112, i10);
            gfVar.E = (int) (((float) j3) / 1000.0f);
            gfVar.f26846c = str;
            if (diVar.K2 != 0 && chatAttachAlertPhotoLayout.P.isFrontface()) {
                org.telegram.messenger.ye yeVar2 = new org.telegram.messenger.ye();
                gfVar.A = yeVar2;
                yeVar2.f26643l = true;
                yeVar2.f26649u = false;
                yeVar2.v = 1.0f;
            }
            chatAttachAlertPhotoLayout.m0(gfVar, false, false);
        }
    }

    @Override
    public void t0(int i7, Drawable drawable) {
        int i10 = this.f38468a;
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
