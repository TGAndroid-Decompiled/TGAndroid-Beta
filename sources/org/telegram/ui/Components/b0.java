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
public final class b0 implements org.telegram.ui.ActionBar.r1, pj0, pb0, qb0, te.d, org.telegram.messenger.jc, z4, r0.m, wh.a, t0.e, qj0, CameraController.VideoTakeCallback, org.telegram.ui.Cells.q5, fi.b9, org.telegram.ui.ActionBar.m0, org.telegram.ui.ActionBar.f1, org.telegram.messenger.v10 {
    public final int f33498a;
    public final Object f33499b;

    public b0(Object obj, int i7) {
        this.f33498a = i7;
        this.f33499b = obj;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public boolean D(float f10) {
        return false;
    }

    @Override
    public void G0(int i7, Drawable drawable) {
        int i10 = this.f33498a;
    }

    @Override
    public void O(int i7, int i10, boolean z10) {
        int i11;
        k8 k8Var = (k8) this.f33499b;
        int i12 = i7 * 60;
        if (i7 == 0) {
            i11 = 71;
        } else {
            i11 = 70;
        }
        k8Var.R0(i12, i11);
    }

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(l1Var, false);
        bb bbVar = ((cb) this.f33499b).f33958a;
        if (bbVar != null) {
            bbVar.setPadding(I0.f15889a, I0.f15890b, I0.f15891c, I0.d);
        }
        view.requestLayout();
        return r0.l1.f56257b;
    }

    @Override
    public void V(ImageReceiver imageReceiver) {
        int i7 = this.f33498a;
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public boolean c(int i7, View view) {
        Object O;
        kk kkVar = (kk) this.f33499b;
        v4.i0 adapter = kkVar.f36781r.getAdapter();
        ck ckVar = kkVar.f36783w;
        if (adapter == ckVar) {
            O = ckVar.E(i7);
        } else {
            jk jkVar = kkVar.E;
            O = jkVar.O(jkVar.S(i7), jkVar.Q(i7));
        }
        return kkVar.U(view, O);
    }

    @Override
    public boolean d(of ofVar, int i7, Bundle bundle) {
        jg jgVar = (jg) this.f33499b;
        ChatActivityEnterView chatActivityEnterView = jgVar.f36431f2;
        if (chatActivityEnterView.f32627k7) {
            return true;
        }
        int i10 = n0.a.f21045a;
        if (Build.VERSION.SDK_INT >= 25 && (i7 & 1) != 0) {
            try {
                ((t0.h) ofVar.f38076b).e();
            } catch (Exception unused) {
                return false;
            }
        }
        t0.h hVar = (t0.h) ofVar.f38076b;
        if (!hVar.getDescription().hasMimeType("image/gif") && !org.telegram.messenger.zy.x0(hVar.c(), null)) {
            jgVar.J(hVar.c(), hVar.getDescription().getMimeType(0));
            return true;
        } else if (chatActivityEnterView.c()) {
            b5.J(chatActivityEnterView.C3, chatActivityEnterView.D3.a(), new g2(8, jgVar, ofVar), chatActivityEnterView.K4);
            return true;
        } else {
            jgVar.L(ofVar, true, 0, 0);
            return true;
        }
    }

    @Override
    public void e(long j3, int i7, fi.e3 e3Var) {
        e3Var.run();
    }

    @Override
    public void f(float r9, float r10, int r11, android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b0.f(float, float, int, android.view.View):void");
    }

    @Override
    public void g(int i7) {
        ArrayList arrayList;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        String str;
        Context context;
        switch (this.f33498a) {
            case 25:
                jq jqVar = ((kq) this.f33499b).f36845a;
                boolean z10 = true;
                if (i7 != 1 && i7 != 2) {
                    if (i7 == 3) {
                        jqVar.b();
                        return;
                    }
                    return;
                }
                if (i7 != 2) {
                    z10 = false;
                }
                jqVar.a(z10);
                return;
            default:
                bv bvVar = (bv) this.f33499b;
                org.telegram.ui.ActionBar.h2 h2Var = bvVar.n1;
                nu nuVar = bvVar.f33786p1;
                if (nuVar != null && (arrayList = nuVar.f42946b) != null && !arrayList.isEmpty()) {
                    TLRPC.StickerSet stickerSet = ((TLRPC.TL_messages_stickerSet) nuVar.f42946b.get(0)).set;
                    if (stickerSet != null && stickerSet.emojis) {
                        str = "https://" + org.telegram.messenger.mp.u1(bvVar.f30187a).X2 + "/addemoji/" + tL_messages_stickerSet.set.short_name;
                    } else {
                        str = "https://" + org.telegram.messenger.mp.u1(bvVar.f30187a).X2 + "/addstickers/" + tL_messages_stickerSet.set.short_name;
                    }
                    String str2 = str;
                    if (i7 == 1) {
                        if (h2Var != null) {
                            context = h2Var.getParentActivity();
                        } else {
                            context = null;
                        }
                        if (context == null) {
                            context = bvVar.getContext();
                        }
                        qu quVar = new qu(bvVar, context, str2, str2, bvVar.J0);
                        if (h2Var != null) {
                            h2Var.showDialog(quVar);
                            return;
                        } else {
                            quVar.show();
                            return;
                        }
                    } else if (i7 == 2) {
                        try {
                            org.telegram.messenger.g0.g(str2);
                            new lc((FrameLayout) bvVar.f30190b, bvVar.J0).k(false).j();
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
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f33498a) {
            case 0:
                h0 h0Var = (h0) this.f33499b;
                vf.b h = u1Var.h(-1, true, true);
                h.d();
                TL_aicompose.deleteTone deletetone = new TL_aicompose.deleteTone();
                deletetone.tone = TL_aicompose.InputAiComposeTone.from(h0Var.f35676f2);
                ConnectionsManager.getInstance(h0Var.f30187a).sendRequestTyped(deletetone, new d3.b(1), new bi.h0(h0Var, h, u1Var, 8));
                return;
            case 2:
                ((org.telegram.messenger.camera.i) this.f33499b).run();
                return;
            case 3:
                ((bi.y3) this.f33499b).run();
                return;
            case 4:
                ((bg.m0) this.f33499b).run();
                return;
            case 5:
                ((z1) this.f33499b).run();
                return;
            case 6:
                ((sr) this.f33499b).run();
                return;
            case 7:
                ((r2) this.f33499b).run();
                return;
            case 16:
                ((fg) this.f33499b).f35077a.V0.r();
                return;
            case 18:
                ((mg) this.f33499b).run();
                org.telegram.messenger.mp.g1().edit().putBoolean("trimvoicehint", false).apply();
                return;
            case 22:
                ((rn) this.f33499b).f36766b.dismiss();
                return;
            case 23:
                ((wm) this.f33499b).f41737a.F.r();
                return;
            default:
                ((ut) this.f33499b).f40413a.d.r();
                return;
        }
    }

    @Override
    public void i(int i7) {
        w2 w2Var = (w2) this.f33499b;
        if (i7 == 0) {
            w2Var.run();
        }
    }

    @Override
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.h1 h1Var = (org.telegram.ui.ActionBar.h1) ((k.a) this.f33499b).f18056b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && h1Var != null && h1Var.isShowing()) {
            h1Var.d(true);
        }
    }

    @Override
    public boolean k(long j3, int i7, int i10, int i11, fi.c9 c9Var) {
        wn wnVar = (wn) ((org.telegram.ui.Cells.l6) this.f33499b).T;
        ImageReceiver imageReceiver = wnVar.f38742a;
        c9Var.f11818c = imageReceiver;
        c9Var.f11825l = imageReceiver;
        org.telegram.ui.Cells.l6 l6Var = wnVar.H;
        c9Var.f11826m = l6Var;
        boolean z10 = l6Var.f11908w;
        wn wnVar2 = wnVar.L.f33381e;
        c9Var.f11816a = wnVar2;
        c9Var.f11824k = wnVar2.getAlpha();
        c9Var.h = 0.0f;
        c9Var.f11822i = org.telegram.messenger.g0.f24118q.y;
        c9Var.f11821g = (View) wnVar.getParent();
        return true;
    }

    @Override
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        TLRPC.StickerSet stickerSet;
        long j3;
        boolean z10;
        boolean z11;
        qx qxVar = (qx) this.f33499b;
        l41 l41Var = (l41) obj;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        mx mxVar = qxVar.f38925c;
        ry ryVar = qxVar.G;
        Object obj3 = l41Var.H;
        if (obj3 instanceof TLRPC.StickerSetCovered) {
            kx kxVar = (kx) l41Var.I;
            long j10 = qxVar.d;
            stickerSet = ((TLRPC.StickerSetCovered) obj3).set;
            long j11 = stickerSet.f28430id;
            if (j10 == j11) {
                qxVar.d = 0L;
                stickerSet = null;
            } else {
                qxVar.d = j11;
                qxVar.f38927f = kxVar.d;
                qxVar.f38926e = stickerSet;
            }
        } else {
            if (obj3 instanceof TLRPC.TL_messages_stickerSet) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj3;
                long j12 = qxVar.d;
                TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
                long j13 = stickerSet2.f28430id;
                if (j12 == j13) {
                    qxVar.d = 0L;
                } else {
                    qxVar.d = j13;
                    qxVar.f38927f = tL_messages_stickerSet.documents;
                    qxVar.f38926e = stickerSet2;
                    stickerSet = stickerSet2;
                }
            }
            stickerSet = null;
        }
        int childCount = mxVar.getChildCount();
        boolean z12 = false;
        for (int i7 = 0; i7 < childCount; i7++) {
            ph.b bVar = (ph.b) mxVar.getChildAt(i7);
            if (bVar != view) {
                bVar.a(false, true);
            }
        }
        if (qxVar.d != 0 && qxVar.f38927f.size() < qxVar.f38926e.count) {
            org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(ryVar.f39345d1);
            TLRPC.StickerSet stickerSet3 = qxVar.f38926e;
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            j3 = 0;
            tL_inputStickerSetID.f28423id = stickerSet3.f28430id;
            tL_inputStickerSetID.access_hash = stickerSet3.access_hash;
            TLRPC.TL_messages_stickerSet o02 = d02.o0(tL_inputStickerSetID, false);
            if (o02 != null) {
                qxVar.f38927f = o02.documents;
            }
        } else {
            j3 = 0;
        }
        TLObject tLObject = (TLObject) l41Var.H;
        TLRPC.Document document = null;
        TLRPC.StickerSet stickerSet4 = stickerSet;
        ph.a aVar = ryVar.M;
        te.a aVar2 = ryVar.f39336b;
        ArrayList arrayList = qxVar.f38927f;
        if (arrayList != null && !arrayList.isEmpty()) {
            document = (TLRPC.Document) qxVar.f38927f.get(0);
        }
        TLRPC.Document document2 = document;
        if (aVar2.f57657e > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        ryVar.K(aVar, tLObject, stickerSet4, document2, true, z10);
        ph.b bVar2 = (ph.b) view;
        if (qxVar.d != j3) {
            z11 = true;
        } else {
            z11 = false;
        }
        bVar2.a(z11, true);
        if (qxVar.d != j3) {
            z12 = true;
        }
        aVar2.a(z12, true);
        qxVar.f();
        ryVar.W.b();
        if (qxVar.d != j3) {
            mxVar.L1(view);
        }
    }

    @Override
    public void m(Canvas canvas, int i7) {
        ((lb) this.f33499b).dispatchDrawImplBlur(canvas, i7);
    }

    @Override
    public void m0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        int i7 = this.f33498a;
        Object obj = this.f33499b;
        switch (i7) {
            case 11:
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.addUpdateListener(new w((u6) obj, 2));
                duration.start();
                return;
            default:
                q9 q9Var = (q9) obj;
                if (z10 && !z11) {
                    q9Var.a();
                    return;
                }
                return;
        }
    }

    @Override
    public void m1() {
        e6 e6Var = (e6) this.f33499b;
        e6Var.b();
        e6Var.f();
    }

    @Override
    public void n(sb0 sb0Var, int i7) {
        org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) this.f33499b;
        try {
            if (i7 == 0) {
                x3Var.setText(org.telegram.messenger.gd.M0(2131751423, null));
            } else {
                x3Var.setText(org.telegram.messenger.gd.M0(2131745345, null));
            }
        } catch (Exception unused) {
        }
    }

    @Override
    public void onFinishVideoRecording(String str, long j3) {
        int i7;
        int i10;
        org.telegram.messenger.ef efVar;
        vl vlVar = (vl) this.f33499b;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = vlVar.f40702e;
        si siVar = chatAttachAlertPhotoLayout.f36766b;
        if (vlVar.f40699a != null && !siVar.Q1 && chatAttachAlertPhotoLayout.Q != null) {
            ChatAttachAlertPhotoLayout.f32762r1 = false;
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
                    int i12 = ChatAttachAlertPhotoLayout.f32766v1;
                    ChatAttachAlertPhotoLayout.f32766v1 = i12 - 1;
                    efVar = new org.telegram.messenger.ef(i12, vlVar.f40699a.getAbsolutePath(), 0, true, i11, i10);
                    efVar.E = (int) (((float) j3) / 1000.0f);
                    efVar.f27848c = str;
                    if (siVar.O2 != 0) {
                        org.telegram.messenger.we weVar = new org.telegram.messenger.we();
                        efVar.A = weVar;
                        weVar.f27682l = true;
                        weVar.f27688u = false;
                        weVar.v = 1.0f;
                    }
                    chatAttachAlertPhotoLayout.m0(efVar, false, false);
                }
            } catch (Exception unused2) {
                i7 = 0;
            }
            int i112 = i7;
            int i122 = ChatAttachAlertPhotoLayout.f32766v1;
            ChatAttachAlertPhotoLayout.f32766v1 = i122 - 1;
            efVar = new org.telegram.messenger.ef(i122, vlVar.f40699a.getAbsolutePath(), 0, true, i112, i10);
            efVar.E = (int) (((float) j3) / 1000.0f);
            efVar.f27848c = str;
            if (siVar.O2 != 0 && chatAttachAlertPhotoLayout.Q.isFrontface()) {
                org.telegram.messenger.we weVar2 = new org.telegram.messenger.we();
                efVar.A = weVar2;
                weVar2.f27682l = true;
                weVar2.f27688u = false;
                weVar2.v = 1.0f;
            }
            chatAttachAlertPhotoLayout.m0(efVar, false, false);
        }
    }

    private final void q(ImageReceiver imageReceiver) {
    }

    private final void r(ImageReceiver imageReceiver) {
    }

    @Override
    public void b(boolean z10) {
    }

    @Override
    public void x(boolean z10) {
    }

    @Override
    public void H() {
    }

    @Override
    public void a() {
    }

    private final void o(int i7, Drawable drawable) {
    }

    private final void p(int i7, Drawable drawable) {
    }

    @Override
    public void s0(View view, float f10, float f11) {
    }
}
