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
public final class c0 implements org.telegram.ui.ActionBar.q1, rj0, qb0, rb0, te.d, org.telegram.messenger.kc, a5, r0.m, wh.a, t0.e, sj0, CameraController.VideoTakeCallback, org.telegram.ui.Cells.q5, fi.b9, org.telegram.ui.ActionBar.l0, org.telegram.ui.ActionBar.e1, org.telegram.messenger.w10 {
    public final int f33950a;
    public final Object f33951b;

    public c0(Object obj, int i7) {
        this.f33950a = i7;
        this.f33951b = obj;
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
        int i10 = this.f33950a;
    }

    @Override
    public void O(int i7, int i10, boolean z10) {
        int i11;
        j8 j8Var = (j8) this.f33951b;
        int i12 = i7 * 60;
        if (i7 == 0) {
            i11 = 71;
        } else {
            i11 = 70;
        }
        j8Var.R0(i12, i11);
    }

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(l1Var, false);
        bb bbVar = ((cb) this.f33951b).f34139a;
        if (bbVar != null) {
            bbVar.setPadding(I0.f15917a, I0.f15918b, I0.f15919c, I0.d);
        }
        view.requestLayout();
        return r0.l1.f56302b;
    }

    @Override
    public void V(ImageReceiver imageReceiver) {
        int i7 = this.f33950a;
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public boolean c(int i7, View view) {
        Object O;
        mk mkVar = (mk) this.f33951b;
        v4.i0 adapter = mkVar.f37534r.getAdapter();
        ek ekVar = mkVar.f37536w;
        if (adapter == ekVar) {
            O = ekVar.E(i7);
        } else {
            lk lkVar = mkVar.E;
            O = lkVar.O(lkVar.S(i7), lkVar.Q(i7));
        }
        return mkVar.U(view, O);
    }

    @Override
    public boolean d(qf qfVar, int i7, Bundle bundle) {
        mg mgVar = (mg) this.f33951b;
        ChatActivityEnterView chatActivityEnterView = mgVar.f37508f2;
        if (chatActivityEnterView.f32695p7) {
            return true;
        }
        int i10 = n0.a.f21076a;
        if (Build.VERSION.SDK_INT >= 25 && (i7 & 1) != 0) {
            try {
                ((t0.h) qfVar.f38895b).e();
            } catch (Exception unused) {
                return false;
            }
        }
        t0.h hVar = (t0.h) qfVar.f38895b;
        if (!hVar.getDescription().hasMimeType("image/gif") && !org.telegram.messenger.az.x0(hVar.c(), null)) {
            mgVar.J(hVar.c(), hVar.getDescription().getMimeType(0));
            return true;
        } else if (chatActivityEnterView.c()) {
            c5.J(chatActivityEnterView.E3, chatActivityEnterView.F3.a(), new h2(8, mgVar, qfVar), chatActivityEnterView.M4);
            return true;
        } else {
            mgVar.L(qfVar, true, 0, 0);
            return true;
        }
    }

    @Override
    public void e(long j3, int i7, fi.e3 e3Var) {
        e3Var.run();
    }

    @Override
    public void f(float r9, float r10, int r11, android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c0.f(float, float, int, android.view.View):void");
    }

    @Override
    public void g(int i7) {
        ArrayList arrayList;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        String str;
        Context context;
        switch (this.f33950a) {
            case 25:
                lq lqVar = ((mq) this.f33951b).f37599a;
                boolean z10 = true;
                if (i7 != 1 && i7 != 2) {
                    if (i7 == 3) {
                        lqVar.b();
                        return;
                    }
                    return;
                }
                if (i7 != 2) {
                    z10 = false;
                }
                lqVar.a(z10);
                return;
            default:
                ev evVar = (ev) this.f33951b;
                org.telegram.ui.ActionBar.g2 g2Var = evVar.n1;
                qu quVar = evVar.f34992p1;
                if (quVar != null && (arrayList = quVar.f34304b) != null && !arrayList.isEmpty()) {
                    TLRPC.StickerSet stickerSet = ((TLRPC.TL_messages_stickerSet) quVar.f34304b.get(0)).set;
                    if (stickerSet != null && stickerSet.emojis) {
                        str = "https://" + org.telegram.messenger.np.u1(evVar.f30173a).X2 + "/addemoji/" + tL_messages_stickerSet.set.short_name;
                    } else {
                        str = "https://" + org.telegram.messenger.np.u1(evVar.f30173a).X2 + "/addstickers/" + tL_messages_stickerSet.set.short_name;
                    }
                    String str2 = str;
                    if (i7 == 1) {
                        if (g2Var != null) {
                            context = g2Var.getParentActivity();
                        } else {
                            context = null;
                        }
                        if (context == null) {
                            context = evVar.getContext();
                        }
                        tu tuVar = new tu(evVar, context, str2, str2, evVar.J0);
                        if (g2Var != null) {
                            g2Var.showDialog(tuVar);
                            return;
                        } else {
                            tuVar.show();
                            return;
                        }
                    } else if (i7 == 2) {
                        try {
                            org.telegram.messenger.g0.g(str2);
                            new lc((FrameLayout) evVar.f30176b, evVar.J0).k(false).j();
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
        switch (this.f33950a) {
            case 0:
                i0 i0Var = (i0) this.f33951b;
                vf.b h = t1Var.h(-1, true, true);
                h.d();
                TL_aicompose.deleteTone deletetone = new TL_aicompose.deleteTone();
                deletetone.tone = TL_aicompose.InputAiComposeTone.from(i0Var.f36061f2);
                ConnectionsManager.getInstance(i0Var.f30173a).sendRequestTyped(deletetone, new d3.b(1), new bi.h0(i0Var, h, t1Var, 8));
                return;
            case 2:
                ((org.telegram.messenger.camera.i) this.f33951b).run();
                return;
            case 3:
                ((bi.c4) this.f33951b).run();
                return;
            case 4:
                ((bg.m0) this.f33951b).run();
                return;
            case 5:
                ((a2) this.f33951b).run();
                return;
            case 6:
                ((ur) this.f33951b).run();
                return;
            case 7:
                ((s2) this.f33951b).run();
                return;
            case 16:
                ((ig) this.f33951b).f36245a.V0.r();
                return;
            case 18:
                ((mf) this.f33951b).run();
                org.telegram.messenger.np.g1().edit().putBoolean("trimvoicehint", false).apply();
                return;
            case 22:
                ((tn) this.f33951b).f37519b.dismiss();
                return;
            case 23:
                ((ym) this.f33951b).f42455a.F.r();
                return;
            default:
                ((wt) this.f33951b).f41891a.d.r();
                return;
        }
    }

    @Override
    public void i(int i7) {
        x2 x2Var = (x2) this.f33951b;
        if (i7 == 0) {
            x2Var.run();
        }
    }

    @Override
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) ((k.a) this.f33951b).f18090b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && g1Var != null && g1Var.isShowing()) {
            g1Var.d(true);
        }
    }

    @Override
    public boolean k(long j3, int i7, int i10, int i11, fi.c9 c9Var) {
        yn ynVar = (yn) ((org.telegram.ui.Cells.l6) this.f33951b).T;
        ImageReceiver imageReceiver = ynVar.f38835a;
        c9Var.f11861c = imageReceiver;
        c9Var.f11868l = imageReceiver;
        org.telegram.ui.Cells.l6 l6Var = ynVar.H;
        c9Var.f11869m = l6Var;
        boolean z10 = l6Var.f11953w;
        yn ynVar2 = ynVar.L.f34234e;
        c9Var.f11859a = ynVar2;
        c9Var.f11867k = ynVar2.getAlpha();
        c9Var.h = 0.0f;
        c9Var.f11865i = org.telegram.messenger.g0.f24046q.y;
        c9Var.f11864g = (View) ynVar.getParent();
        return true;
    }

    @Override
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        TLRPC.StickerSet stickerSet;
        long j3;
        boolean z10;
        boolean z11;
        sx sxVar = (sx) this.f33951b;
        o41 o41Var = (o41) obj;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        ox oxVar = sxVar.f39709c;
        ty tyVar = sxVar.G;
        Object obj3 = o41Var.H;
        if (obj3 instanceof TLRPC.StickerSetCovered) {
            mx mxVar = (mx) o41Var.I;
            long j10 = sxVar.d;
            stickerSet = ((TLRPC.StickerSetCovered) obj3).set;
            long j11 = stickerSet.f28461id;
            if (j10 == j11) {
                sxVar.d = 0L;
                stickerSet = null;
            } else {
                sxVar.d = j11;
                sxVar.f39711f = mxVar.d;
                sxVar.f39710e = stickerSet;
            }
        } else {
            if (obj3 instanceof TLRPC.TL_messages_stickerSet) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj3;
                long j12 = sxVar.d;
                TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
                long j13 = stickerSet2.f28461id;
                if (j12 == j13) {
                    sxVar.d = 0L;
                } else {
                    sxVar.d = j13;
                    sxVar.f39711f = tL_messages_stickerSet.documents;
                    sxVar.f39710e = stickerSet2;
                    stickerSet = stickerSet2;
                }
            }
            stickerSet = null;
        }
        int childCount = oxVar.getChildCount();
        boolean z12 = false;
        for (int i7 = 0; i7 < childCount; i7++) {
            ph.b bVar = (ph.b) oxVar.getChildAt(i7);
            if (bVar != view) {
                bVar.a(false, true);
            }
        }
        if (sxVar.d != 0 && sxVar.f39711f.size() < sxVar.f39710e.count) {
            org.telegram.messenger.si d02 = org.telegram.messenger.si.d0(tyVar.f40091d1);
            TLRPC.StickerSet stickerSet3 = sxVar.f39710e;
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            j3 = 0;
            tL_inputStickerSetID.f28454id = stickerSet3.f28461id;
            tL_inputStickerSetID.access_hash = stickerSet3.access_hash;
            TLRPC.TL_messages_stickerSet o02 = d02.o0(tL_inputStickerSetID, false);
            if (o02 != null) {
                sxVar.f39711f = o02.documents;
            }
        } else {
            j3 = 0;
        }
        TLObject tLObject = (TLObject) o41Var.H;
        TLRPC.Document document = null;
        TLRPC.StickerSet stickerSet4 = stickerSet;
        ph.a aVar = tyVar.M;
        te.a aVar2 = tyVar.f40082b;
        ArrayList arrayList = sxVar.f39711f;
        if (arrayList != null && !arrayList.isEmpty()) {
            document = (TLRPC.Document) sxVar.f39711f.get(0);
        }
        TLRPC.Document document2 = document;
        if (aVar2.f57700e > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        tyVar.K(aVar, tLObject, stickerSet4, document2, true, z10);
        ph.b bVar2 = (ph.b) view;
        if (sxVar.d != j3) {
            z11 = true;
        } else {
            z11 = false;
        }
        bVar2.a(z11, true);
        if (sxVar.d != j3) {
            z12 = true;
        }
        aVar2.a(z12, true);
        sxVar.f();
        tyVar.W.b();
        if (sxVar.d != j3) {
            oxVar.L1(view);
        }
    }

    @Override
    public void m(Canvas canvas, int i7) {
        ((lb) this.f33951b).dispatchDrawImplBlur(canvas, i7);
    }

    @Override
    public void m0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        int i7 = this.f33950a;
        Object obj = this.f33951b;
        switch (i7) {
            case 11:
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.addUpdateListener(new x((v6) obj, 2));
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
        f6 f6Var = (f6) this.f33951b;
        f6Var.b();
        f6Var.f();
    }

    @Override
    public void n(tb0 tb0Var, int i7) {
        org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) this.f33951b;
        try {
            if (i7 == 0) {
                x3Var.setText(org.telegram.messenger.hd.N0(2131751422, null));
            } else {
                x3Var.setText(org.telegram.messenger.hd.N0(2131745344, null));
            }
        } catch (Exception unused) {
        }
    }

    @Override
    public void onFinishVideoRecording(String str, long j3) {
        int i7;
        int i10;
        org.telegram.messenger.ff ffVar;
        xl xlVar = (xl) this.f33951b;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = xlVar.f42165e;
        ui uiVar = chatAttachAlertPhotoLayout.f37519b;
        if (xlVar.f42162a != null && !uiVar.Q1 && chatAttachAlertPhotoLayout.Q != null) {
            ChatAttachAlertPhotoLayout.f32798r1 = false;
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
                    int i12 = ChatAttachAlertPhotoLayout.f32802v1;
                    ChatAttachAlertPhotoLayout.f32802v1 = i12 - 1;
                    ffVar = new org.telegram.messenger.ff(i12, xlVar.f42162a.getAbsolutePath(), 0, true, i11, i10);
                    ffVar.E = (int) (((float) j3) / 1000.0f);
                    ffVar.f28060c = str;
                    if (uiVar.O2 != 0) {
                        org.telegram.messenger.xe xeVar = new org.telegram.messenger.xe();
                        ffVar.A = xeVar;
                        xeVar.f27882l = true;
                        xeVar.f27888u = false;
                        xeVar.v = 1.0f;
                    }
                    chatAttachAlertPhotoLayout.m0(ffVar, false, false);
                }
            } catch (Exception unused2) {
                i7 = 0;
            }
            int i112 = i7;
            int i122 = ChatAttachAlertPhotoLayout.f32802v1;
            ChatAttachAlertPhotoLayout.f32802v1 = i122 - 1;
            ffVar = new org.telegram.messenger.ff(i122, xlVar.f42162a.getAbsolutePath(), 0, true, i112, i10);
            ffVar.E = (int) (((float) j3) / 1000.0f);
            ffVar.f28060c = str;
            if (uiVar.O2 != 0 && chatAttachAlertPhotoLayout.Q.isFrontface()) {
                org.telegram.messenger.xe xeVar2 = new org.telegram.messenger.xe();
                ffVar.A = xeVar2;
                xeVar2.f27882l = true;
                xeVar2.f27888u = false;
                xeVar2.v = 1.0f;
            }
            chatAttachAlertPhotoLayout.m0(ffVar, false, false);
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
