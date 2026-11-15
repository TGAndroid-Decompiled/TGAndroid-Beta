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
public final class s implements org.telegram.ui.ActionBar.q1, hj0, eb0, fb0, gb0, te.d, org.telegram.messenger.kc, r4, r0.m, wh.a, t0.e, ij0, CameraController.VideoTakeCallback, org.telegram.ui.Cells.o5, fi.e9, org.telegram.ui.ActionBar.l0, org.telegram.ui.ActionBar.e1 {
    public final int f39115a;
    public final Object f39116b;

    public s(Object obj, int i7) {
        this.f39115a = i7;
        this.f39116b = obj;
    }

    @Override
    public void A(ImageReceiver imageReceiver) {
        int i7 = this.f39115a;
    }

    @Override
    public void I(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        int i7 = this.f39115a;
        Object obj = this.f39116b;
        switch (i7) {
            case 12:
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.addUpdateListener(new c6((o6) obj, 1));
                duration.start();
                return;
            default:
                i9 i9Var = (i9) obj;
                if (z10 && !z11) {
                    i9Var.a();
                    return;
                }
                return;
        }
    }

    @Override
    public void L(int i7, int i10, boolean z10) {
        int i11;
        c8 c8Var = (c8) this.f39116b;
        int i12 = i7 * 60;
        if (i7 == 0) {
            i11 = 71;
        } else {
            i11 = 70;
        }
        c8Var.R0(i12, i11);
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        i0.c I0 = org.telegram.messenger.g0.I0(k1Var, false);
        sa saVar = ((ta) this.f39116b).f39616a;
        if (saVar != null) {
            saVar.setPadding(I0.f15574a, I0.f15575b, I0.f15576c, I0.d);
        }
        view.requestLayout();
        return r0.k1.f55681b;
    }

    @Override
    public void O(int i7, Drawable drawable) {
        int i10 = this.f39115a;
    }

    @Override
    public boolean b(int i7, View view) {
        Object O;
        dk dkVar = (dk) this.f39116b;
        v4.h0 adapter = dkVar.f33952r.getAdapter();
        vj vjVar = dkVar.f33954w;
        if (adapter == vjVar) {
            O = vjVar.E(i7);
        } else {
            ck ckVar = dkVar.E;
            O = ckVar.O(ckVar.S(i7), ckVar.Q(i7));
        }
        return dkVar.U(view, O);
    }

    @Override
    public void b0() {
        w5 w5Var = (w5) this.f39116b;
        w5Var.b();
        w5Var.e();
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void d(long j3, int i7, fi.g3 g3Var) {
        g3Var.run();
    }

    @Override
    public String e(int i7) {
        return ((String[]) this.f39116b)[i7];
    }

    @Override
    public void f(float r9, float r10, int r11, android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s.f(float, float, int, android.view.View):void");
    }

    @Override
    public void g(int i7) {
        ArrayList arrayList;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        String str;
        Context context;
        switch (this.f39115a) {
            case 26:
                cq cqVar = ((dq) this.f39116b).f34017a;
                boolean z10 = true;
                if (i7 != 1 && i7 != 2) {
                    if (i7 == 3) {
                        cqVar.b();
                        return;
                    }
                    return;
                }
                if (i7 != 2) {
                    z10 = false;
                }
                cqVar.a(z10);
                return;
            default:
                wu wuVar = (wu) this.f39116b;
                org.telegram.ui.ActionBar.e2 e2Var = wuVar.n1;
                iu iuVar = wuVar.f41451p1;
                if (iuVar != null && (arrayList = iuVar.f40161b) != null && !arrayList.isEmpty()) {
                    TLRPC.StickerSet stickerSet = ((TLRPC.TL_messages_stickerSet) iuVar.f40161b.get(0)).set;
                    if (stickerSet != null && stickerSet.emojis) {
                        str = "https://" + org.telegram.messenger.np.s1(wuVar.f29679a).V2 + "/addemoji/" + tL_messages_stickerSet.set.short_name;
                    } else {
                        str = "https://" + org.telegram.messenger.np.s1(wuVar.f29679a).V2 + "/addstickers/" + tL_messages_stickerSet.set.short_name;
                    }
                    String str2 = str;
                    if (i7 == 1) {
                        if (e2Var != null) {
                            context = e2Var.getParentActivity();
                        } else {
                            context = null;
                        }
                        if (context == null) {
                            context = wuVar.getContext();
                        }
                        lu luVar = new lu(wuVar, context, str2, str2, wuVar.J0);
                        if (e2Var != null) {
                            e2Var.showDialog(luVar);
                            return;
                        } else {
                            luVar.show();
                            return;
                        }
                    } else if (i7 == 2) {
                        try {
                            org.telegram.messenger.g0.g(str2);
                            new cc((FrameLayout) wuVar.f29682b, wuVar.J0).k(false).j();
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
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f39115a) {
            case 0:
                y yVar = (y) this.f39116b;
                vf.b h = t1Var.h(-1, true, true);
                h.d();
                TL_aicompose.deleteTone deletetone = new TL_aicompose.deleteTone();
                deletetone.tone = TL_aicompose.InputAiComposeTone.from(yVar.f41814f2);
                ConnectionsManager.getInstance(yVar.f29679a).sendRequestTyped(deletetone, new d3.b(1), new bi.h0(yVar, h, t1Var, 7));
                return;
            case 2:
                ((org.telegram.ui.ActionBar.l5) this.f39116b).run();
                return;
            case 3:
                ((di.x2) this.f39116b).run();
                return;
            case 4:
                ((bg.l0) this.f39116b).run();
                return;
            case 5:
                ((p1) this.f39116b).run();
                return;
            case 6:
                ((lr) this.f39116b).run();
                return;
            case 8:
                ((i2) this.f39116b).run();
                return;
            case 17:
                ((wf) this.f39116b).f41334a.V0.r();
                return;
            case 19:
                ((od) this.f39116b).run();
                org.telegram.messenger.np.e1().edit().putBoolean("trimvoicehint", false).apply();
                return;
            case 23:
                ((jn) this.f39116b).f33609b.dismiss();
                return;
            case 24:
                ((pm) this.f39116b).f38331a.F.r();
                return;
            default:
                ((pt) this.f39116b).f38408a.d.r();
                return;
        }
    }

    @Override
    public void i(int i7) {
        o2 o2Var = (o2) this.f39116b;
        if (i7 == 0) {
            o2Var.run();
        }
    }

    @Override
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) ((k.a) this.f39116b).f17664b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && g1Var != null && g1Var.isShowing()) {
            g1Var.d(true);
        }
    }

    @Override
    public void k(Canvas canvas, int i7) {
        ((cb) this.f39116b).dispatchDrawImplBlur(canvas, i7);
    }

    @Override
    public boolean l(long j3, int i7, int i10, int i11, fi.f9 f9Var) {
        on onVar = (on) ((org.telegram.ui.Cells.j6) this.f39116b).T;
        ImageReceiver imageReceiver = onVar.f35499a;
        f9Var.f11712c = imageReceiver;
        f9Var.f11719l = imageReceiver;
        org.telegram.ui.Cells.j6 j6Var = onVar.H;
        f9Var.f11720m = j6Var;
        boolean z10 = j6Var.f11797w;
        on onVar2 = onVar.L.f39351e;
        f9Var.f11710a = onVar2;
        f9Var.f11718k = onVar2.getAlpha();
        f9Var.h = 0.0f;
        f9Var.f11716i = org.telegram.messenger.g0.f23611q.y;
        f9Var.f11715g = (View) onVar.getParent();
        return true;
    }

    @Override
    public void m(ib0 ib0Var, int i7) {
        org.telegram.ui.Cells.w3 w3Var = (org.telegram.ui.Cells.w3) this.f39116b;
        try {
            if (i7 == 0) {
                w3Var.setText(org.telegram.messenger.hd.M0(2131751434, null));
            } else {
                w3Var.setText(org.telegram.messenger.hd.M0(2131745540, null));
            }
        } catch (Exception unused) {
        }
    }

    @Override
    public boolean o(ff ffVar, int i7, Bundle bundle) {
        bg bgVar = (bg) this.f39116b;
        ChatActivityEnterView chatActivityEnterView = bgVar.f33278f2;
        if (chatActivityEnterView.K6) {
            return true;
        }
        int i10 = n0.a.f20684a;
        if (Build.VERSION.SDK_INT >= 25 && (i7 & 1) != 0) {
            try {
                ((t0.h) ffVar.f34590b).e();
            } catch (Exception unused) {
                return false;
            }
        }
        t0.h hVar = (t0.h) ffVar.f34590b;
        if (!hVar.getDescription().hasMimeType("image/gif") && !org.telegram.messenger.ez.x0(hVar.c(), null)) {
            bgVar.J(hVar.c(), hVar.getDescription().getMimeType(0));
            return true;
        } else if (chatActivityEnterView.c()) {
            t4.J(chatActivityEnterView.f32311w3, chatActivityEnterView.f32319x3.a(), new f1(9, bgVar, ffVar), chatActivityEnterView.E4);
            return true;
        } else {
            bgVar.L(ffVar, true, 0, 0);
            return true;
        }
    }

    @Override
    public void onFinishVideoRecording(String str, long j3) {
        int i7;
        int i10;
        org.telegram.messenger.ff ffVar;
        ol olVar = (ol) this.f39116b;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = olVar.f38019e;
        ki kiVar = chatAttachAlertPhotoLayout.f33609b;
        if (olVar.f38016a != null && !kiVar.Q1 && chatAttachAlertPhotoLayout.Q != null) {
            ChatAttachAlertPhotoLayout.f32365r1 = false;
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
                    int i12 = ChatAttachAlertPhotoLayout.f32369v1;
                    ChatAttachAlertPhotoLayout.f32369v1 = i12 - 1;
                    ffVar = new org.telegram.messenger.ff(i12, olVar.f38016a.getAbsolutePath(), 0, true, i11, i10);
                    ffVar.E = (int) (((float) j3) / 1000.0f);
                    ffVar.f27711c = str;
                    if (kiVar.O2 != 0) {
                        org.telegram.messenger.xe xeVar = new org.telegram.messenger.xe();
                        ffVar.A = xeVar;
                        xeVar.f27497l = true;
                        xeVar.f27503u = false;
                        xeVar.v = 1.0f;
                    }
                    chatAttachAlertPhotoLayout.m0(ffVar, false, false);
                }
            } catch (Exception unused2) {
                i7 = 0;
            }
            int i112 = i7;
            int i122 = ChatAttachAlertPhotoLayout.f32369v1;
            ChatAttachAlertPhotoLayout.f32369v1 = i122 - 1;
            ffVar = new org.telegram.messenger.ff(i122, olVar.f38016a.getAbsolutePath(), 0, true, i112, i10);
            ffVar.E = (int) (((float) j3) / 1000.0f);
            ffVar.f27711c = str;
            if (kiVar.O2 != 0 && chatAttachAlertPhotoLayout.Q.isFrontface()) {
                org.telegram.messenger.xe xeVar2 = new org.telegram.messenger.xe();
                ffVar.A = xeVar2;
                xeVar2.f27497l = true;
                xeVar2.f27503u = false;
                xeVar2.v = 1.0f;
            }
            chatAttachAlertPhotoLayout.m0(ffVar, false, false);
        }
    }

    @Override
    public boolean q() {
        return false;
    }

    @Override
    public boolean s(float f10) {
        return false;
    }

    private final void t(ImageReceiver imageReceiver) {
    }

    private final void u(ImageReceiver imageReceiver) {
    }

    @Override
    public void c(boolean z10) {
    }

    @Override
    public void n(boolean z10) {
    }

    @Override
    public void a() {
    }

    @Override
    public void v() {
    }

    private final void p(int i7, Drawable drawable) {
    }

    private final void r(int i7, Drawable drawable) {
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
