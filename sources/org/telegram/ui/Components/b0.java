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
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
public final class b0 implements org.telegram.ui.ActionBar.q1, rj0, nb0, ob0, te.d, org.telegram.messenger.jc, z4, r0.m, wh.a, t0.e, sj0, CameraController.VideoTakeCallback, org.telegram.ui.Cells.p5, fi.b9, org.telegram.ui.ActionBar.l0, org.telegram.ui.ActionBar.e1, org.telegram.messenger.u10 {
    public final int f33589a;
    public final Object f33590b;

    public b0(Object obj, int i7) {
        this.f33589a = i7;
        this.f33590b = obj;
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public boolean H(float f10) {
        return false;
    }

    @Override
    public void I(int i7, int i10, boolean z10) {
        int i11;
        i8 i8Var = (i8) this.f33590b;
        int i12 = i7 * 60;
        if (i7 == 0) {
            i11 = 71;
        } else {
            i11 = 70;
        }
        i8Var.B0(i12, i11);
    }

    @Override
    public void J(int i7, Drawable drawable) {
        int i10 = this.f33589a;
    }

    @Override
    public boolean U0(View view) {
        return false;
    }

    @Override
    public boolean b(int i7, View view) {
        Object O;
        kk kkVar = (kk) this.f33590b;
        v4.i0 adapter = kkVar.f36766r.getAdapter();
        dk dkVar = kkVar.f36768w;
        if (adapter == dkVar) {
            O = dkVar.E(i7);
        } else {
            jk jkVar = kkVar.E;
            O = jkVar.O(jkVar.S(i7), jkVar.Q(i7));
        }
        return kkVar.U(view, O);
    }

    @Override
    public void d(long j3, int i7, fi.e3 e3Var) {
        e3Var.run();
    }

    @Override
    public boolean e(org.telegram.ui.Cells.aa aaVar, int i7, Bundle bundle) {
        lg lgVar = (lg) this.f33590b;
        ChatActivityEnterView chatActivityEnterView = lgVar.f37124f2;
        if (chatActivityEnterView.f32759p7) {
            return true;
        }
        int i10 = n0.a.f21138a;
        if (Build.VERSION.SDK_INT >= 25 && (i7 & 1) != 0) {
            try {
                ((t0.h) aaVar.f30491b).e();
            } catch (Exception unused) {
                return false;
            }
        }
        t0.h hVar = (t0.h) aaVar.f30491b;
        if (!hVar.getDescription().hasMimeType("image/gif") && !org.telegram.messenger.zy.x0(hVar.b(), null)) {
            lgVar.J(hVar.b(), hVar.getDescription().getMimeType(0));
            return true;
        } else if (chatActivityEnterView.c()) {
            b5.J(chatActivityEnterView.E3, chatActivityEnterView.F3.a(), new g2(8, lgVar, aaVar), chatActivityEnterView.M4);
            return true;
        } else {
            lgVar.L(aaVar, true, 0, 0);
            return true;
        }
    }

    @Override
    public void f(int i7) {
        w2 w2Var = (w2) this.f33590b;
        if (i7 == 0) {
            w2Var.run();
        }
    }

    @Override
    public void g(float r9, float r10, int r11, android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b0.g(float, float, int, android.view.View):void");
    }

    @Override
    public void h(int i7) {
        ArrayList arrayList;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        String str;
        Context context;
        switch (this.f33589a) {
            case 25:
                iq iqVar = ((jq) this.f33590b).f36479a;
                boolean z10 = true;
                if (i7 != 1 && i7 != 2) {
                    if (i7 == 3) {
                        iqVar.b();
                        return;
                    }
                    return;
                }
                if (i7 != 2) {
                    z10 = false;
                }
                iqVar.a(z10);
                return;
            default:
                bv bvVar = (bv) this.f33590b;
                org.telegram.ui.ActionBar.g2 g2Var = bvVar.n1;
                nu nuVar = bvVar.f33818p1;
                if (nuVar != null && (arrayList = nuVar.f43043b) != null && !arrayList.isEmpty()) {
                    TLRPC.StickerSet stickerSet = ((TLRPC.TL_messages_stickerSet) nuVar.f43043b.get(0)).set;
                    if (stickerSet != null && stickerSet.emojis) {
                        str = "https://" + org.telegram.messenger.mp.u1(bvVar.f30223a).X2 + "/addemoji/" + tL_messages_stickerSet.set.short_name;
                    } else {
                        str = "https://" + org.telegram.messenger.mp.u1(bvVar.f30223a).X2 + "/addstickers/" + tL_messages_stickerSet.set.short_name;
                    }
                    String str2 = str;
                    if (i7 == 1) {
                        if (g2Var != null) {
                            context = g2Var.getParentActivity();
                        } else {
                            context = null;
                        }
                        if (context == null) {
                            context = bvVar.getContext();
                        }
                        qu quVar = new qu(bvVar, context, str2, str2, bvVar.J0);
                        if (g2Var != null) {
                            g2Var.showDialog(quVar);
                            return;
                        } else {
                            quVar.show();
                            return;
                        }
                    } else if (i7 == 2) {
                        try {
                            org.telegram.messenger.g0.g(str2);
                            new kc((FrameLayout) bvVar.f30226b, bvVar.J0).k(false).j();
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
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f33589a) {
            case 0:
                h0 h0Var = (h0) this.f33590b;
                vf.b h = t1Var.h(-1, true, true);
                h.d();
                TL_aicompose.deleteTone deletetone = new TL_aicompose.deleteTone();
                deletetone.tone = TL_aicompose.InputAiComposeTone.from(h0Var.f35586f2);
                ConnectionsManager.getInstance(h0Var.f30223a).sendRequestTyped(deletetone, new d3.b(1), new bi.h0(h0Var, h, t1Var, 8));
                return;
            case 2:
                ((oi.h) this.f33590b).run();
                return;
            case 3:
                ((bi.e4) this.f33590b).run();
                return;
            case 4:
                ((bg.m0) this.f33590b).run();
                return;
            case 5:
                ((z1) this.f33590b).run();
                return;
            case 6:
                ((rr) this.f33590b).run();
                return;
            case 7:
                ((r2) this.f33590b).run();
                return;
            case 16:
                ((hg) this.f33590b).f35730a.V0.r();
                return;
            case 18:
                ((xd) this.f33590b).run();
                org.telegram.messenger.mp.g1().edit().putBoolean("trimvoicehint", false).apply();
                return;
            case 22:
                ((qn) this.f33590b).f37135b.dismiss();
                return;
            case 23:
                ((wm) this.f33590b).f41683a.F.r();
                return;
            default:
                ((ut) this.f33590b).f40468a.d.r();
                return;
        }
    }

    @Override
    public void j(Canvas canvas, int i7) {
        ((kb) this.f33590b).dispatchDrawImplBlur(canvas, i7);
    }

    @Override
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        TLRPC.StickerSet stickerSet;
        long j3;
        boolean z10;
        boolean z11;
        px pxVar = (px) this.f33590b;
        n41 n41Var = (n41) obj;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        lx lxVar = pxVar.f38601c;
        qy qyVar = pxVar.G;
        Object obj3 = n41Var.H;
        if (obj3 instanceof TLRPC.StickerSetCovered) {
            jx jxVar = (jx) n41Var.I;
            long j10 = pxVar.d;
            stickerSet = ((TLRPC.StickerSetCovered) obj3).set;
            long j11 = stickerSet.f28519id;
            if (j10 == j11) {
                pxVar.d = 0L;
                stickerSet = null;
            } else {
                pxVar.d = j11;
                pxVar.f38603f = jxVar.d;
                pxVar.f38602e = stickerSet;
            }
        } else {
            if (obj3 instanceof TLRPC.TL_messages_stickerSet) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj3;
                long j12 = pxVar.d;
                TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
                long j13 = stickerSet2.f28519id;
                if (j12 == j13) {
                    pxVar.d = 0L;
                } else {
                    pxVar.d = j13;
                    pxVar.f38603f = tL_messages_stickerSet.documents;
                    pxVar.f38602e = stickerSet2;
                    stickerSet = stickerSet2;
                }
            }
            stickerSet = null;
        }
        int childCount = lxVar.getChildCount();
        boolean z12 = false;
        for (int i7 = 0; i7 < childCount; i7++) {
            ph.b bVar = (ph.b) lxVar.getChildAt(i7);
            if (bVar != view) {
                bVar.a(false, true);
            }
        }
        if (pxVar.d != 0 && pxVar.f38603f.size() < pxVar.f38602e.count) {
            org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(qyVar.f39047d1);
            TLRPC.StickerSet stickerSet3 = pxVar.f38602e;
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            j3 = 0;
            tL_inputStickerSetID.f28512id = stickerSet3.f28519id;
            tL_inputStickerSetID.access_hash = stickerSet3.access_hash;
            TLRPC.TL_messages_stickerSet o02 = d02.o0(tL_inputStickerSetID, false);
            if (o02 != null) {
                pxVar.f38603f = o02.documents;
            }
        } else {
            j3 = 0;
        }
        TLObject tLObject = (TLObject) n41Var.H;
        TLRPC.Document document = null;
        TLRPC.StickerSet stickerSet4 = stickerSet;
        ph.a aVar = qyVar.M;
        te.a aVar2 = qyVar.f39038b;
        ArrayList arrayList = pxVar.f38603f;
        if (arrayList != null && !arrayList.isEmpty()) {
            document = (TLRPC.Document) pxVar.f38603f.get(0);
        }
        TLRPC.Document document2 = document;
        if (aVar2.f57779e > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        qyVar.J(aVar, tLObject, stickerSet4, document2, true, z10);
        ph.b bVar2 = (ph.b) view;
        if (pxVar.d != j3) {
            z11 = true;
        } else {
            z11 = false;
        }
        bVar2.a(z11, true);
        if (pxVar.d != j3) {
            z12 = true;
        }
        aVar2.a(z12, true);
        pxVar.f();
        qyVar.W.b();
        if (pxVar.d != j3) {
            lxVar.L1(view);
        }
    }

    @Override
    public boolean l(long j3, int i7, int i10, int i11, fi.c9 c9Var) {
        vn vnVar = (vn) ((org.telegram.ui.Cells.k6) this.f33590b).T;
        ImageReceiver imageReceiver = vnVar.f38429a;
        c9Var.f11823c = imageReceiver;
        c9Var.f11830l = imageReceiver;
        org.telegram.ui.Cells.k6 k6Var = vnVar.H;
        c9Var.f11831m = k6Var;
        boolean z10 = k6Var.f11915w;
        vn vnVar2 = vnVar.L.f42934e;
        c9Var.f11821a = vnVar2;
        c9Var.f11829k = vnVar2.getAlpha();
        c9Var.h = 0.0f;
        c9Var.f11827i = org.telegram.messenger.g0.f24226q.y;
        c9Var.f11826g = (View) vnVar.getParent();
        return true;
    }

    @Override
    public r0.l1 l1(View view, r0.l1 l1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(l1Var, false);
        ab abVar = ((bb) this.f33590b).f33724a;
        if (abVar != null) {
            abVar.setPadding(I0.f15978a, I0.f15979b, I0.f15980c, I0.d);
        }
        view.requestLayout();
        return r0.l1.f56380b;
    }

    @Override
    public void m(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) ((k.a) this.f33590b).f18155b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && g1Var != null && g1Var.isShowing()) {
            g1Var.d(true);
        }
    }

    @Override
    public void o(qb0 qb0Var, int i7) {
        org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) this.f33590b;
        try {
            if (i7 == 0) {
                x3Var.setText(org.telegram.messenger.gd.N0(2131751422, null));
            } else {
                x3Var.setText(org.telegram.messenger.gd.N0(2131745344, null));
            }
        } catch (Exception unused) {
        }
    }

    @Override
    public void onFinishVideoRecording(String str, long j3) {
        int i7;
        int i10;
        org.telegram.messenger.ef efVar;
        vl vlVar = (vl) this.f33590b;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = vlVar.f40735e;
        ti tiVar = chatAttachAlertPhotoLayout.f37135b;
        if (vlVar.f40732a != null && !tiVar.Q1 && chatAttachAlertPhotoLayout.Q != null) {
            ChatAttachAlertPhotoLayout.f32862r1 = false;
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
                    int i12 = ChatAttachAlertPhotoLayout.f32866v1;
                    ChatAttachAlertPhotoLayout.f32866v1 = i12 - 1;
                    efVar = new org.telegram.messenger.ef(i12, vlVar.f40732a.getAbsolutePath(), 0, true, i11, i10);
                    efVar.E = (int) (((float) j3) / 1000.0f);
                    efVar.f27964c = str;
                    if (tiVar.O2 != 0) {
                        org.telegram.messenger.we weVar = new org.telegram.messenger.we();
                        efVar.A = weVar;
                        weVar.f27776l = true;
                        weVar.f27782u = false;
                        weVar.v = 1.0f;
                    }
                    chatAttachAlertPhotoLayout.m0(efVar, false, false);
                }
            } catch (Exception unused2) {
                i7 = 0;
            }
            int i112 = i7;
            int i122 = ChatAttachAlertPhotoLayout.f32866v1;
            ChatAttachAlertPhotoLayout.f32866v1 = i122 - 1;
            efVar = new org.telegram.messenger.ef(i122, vlVar.f40732a.getAbsolutePath(), 0, true, i112, i10);
            efVar.E = (int) (((float) j3) / 1000.0f);
            efVar.f27964c = str;
            if (tiVar.O2 != 0 && chatAttachAlertPhotoLayout.Q.isFrontface()) {
                org.telegram.messenger.we weVar2 = new org.telegram.messenger.we();
                efVar.A = weVar2;
                weVar2.f27776l = true;
                weVar2.f27782u = false;
                weVar2.v = 1.0f;
            }
            chatAttachAlertPhotoLayout.m0(efVar, false, false);
        }
    }

    @Override
    public void r(ImageReceiver imageReceiver) {
        int i7 = this.f33589a;
    }

    @Override
    public void y(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        int i7 = this.f33589a;
        Object obj = this.f33590b;
        switch (i7) {
            case 11:
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.addUpdateListener(new w((u6) obj, 2));
                duration.start();
                return;
            default:
                p9 p9Var = (p9) obj;
                if (z10 && !z11) {
                    p9Var.a();
                    return;
                }
                return;
        }
    }

    @Override
    public void y1() {
        e6 e6Var = (e6) this.f33590b;
        e6Var.b();
        e6Var.f();
    }

    private final void q(ImageReceiver imageReceiver) {
    }

    private final void s(ImageReceiver imageReceiver) {
    }

    @Override
    public void E(boolean z10) {
    }

    @Override
    public void c(boolean z10) {
    }

    @Override
    public void K() {
    }

    @Override
    public void a() {
    }

    private final void n(int i7, Drawable drawable) {
    }

    private final void p(int i7, Drawable drawable) {
    }

    @Override
    public void f0(View view, float f10, float f11) {
    }
}
