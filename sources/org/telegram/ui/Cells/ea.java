package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.view.VelocityTracker;
import org.telegram.messenger.j20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.cc;
public final class ea implements Runnable {
    public final int f21874a;
    public final Object f21875b;
    public final Object f21876c;

    public ea(int i10, Object obj, Object obj2) {
        this.f21874a = i10;
        this.f21875b = obj;
        this.f21876c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f21874a) {
            case 0:
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) this.f21875b;
                TLObject tLObject = (TLObject) this.f21876c;
                ga gaVar = themesHorizontalListCell$InnerThemeView.f21643a0;
                if (tLObject instanceof TLRPC.TL_wallPaper) {
                    TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject;
                    String r10 = org.telegram.messenger.b8.r(null, wallPaper.document);
                    if (!gaVar.f21938g3.containsKey(r10)) {
                        gaVar.f21938g3.put(r10, themesHorizontalListCell$InnerThemeView.f21644b);
                        org.telegram.messenger.b8.G(themesHorizontalListCell$InnerThemeView.f21644b.E).X(wallPaper.document, wallPaper, 1, 1);
                        return;
                    }
                    return;
                }
                themesHorizontalListCell$InnerThemeView.f21644b.f20809f = true;
                return;
            case 1:
                l0 l0Var = (l0) this.f21875b;
                k0 k0Var = (k0) this.f21876c;
                q1 q1Var = l0Var.f22204a;
                k0 k0Var2 = l0Var.F;
                if (k0Var == k0Var2) {
                    k0Var2.f22113n.c(false);
                    k0 k0Var3 = l0Var.F;
                    if (k0Var3.f22107g) {
                        if (q1Var.getDelegate() != null) {
                            q1Var.getDelegate().e2();
                        }
                    } else {
                        TLObject tLObject2 = k0Var3.f22114o;
                        q1 q1Var2 = l0Var.f22204a;
                        if (q1Var2.getDelegate() != null) {
                            q1Var2.getDelegate().z0(q1Var2, tLObject2, true);
                        }
                    }
                }
                l0Var.F = null;
                l0Var.G = null;
                l0Var.B = false;
                l0Var.A = false;
                l0Var.f22224y.c(false);
                VelocityTracker velocityTracker = l0Var.D;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    l0Var.D = null;
                    return;
                }
                return;
            case 2:
                s0 s0Var = (s0) this.f21875b;
                s0Var.f22907f1.e1(s0Var, ((TLRPC.TL_messageActionGiftCode) this.f21876c).slug);
                return;
            case 3:
                final s0 s0Var2 = (s0) this.f21875b;
                final org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.f21876c;
                TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
                tL_resolveStarGiftOffer.offer_msg_id = s0Var2.getMessageObject().f1();
                tL_resolveStarGiftOffer.decline = true;
                ConnectionsManager.getInstance(s0Var2.H).sendRequestTyped(tL_resolveStarGiftOffer, new j20() {
                    @Override
                    public final void a(Object obj, Object obj2) {
                        TLRPC.Updates updates = (TLRPC.Updates) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        if (updates != null) {
                            vp.r1(s0.this.H).L3(updates, false);
                        }
                        if (tL_error != null) {
                            org.telegram.messenger.i0.g3(new ea(4, k2Var, tL_error));
                        }
                    }
                });
                return;
            case 4:
                cc.a0((org.telegram.ui.ActionBar.k2) this.f21875b).f0((TLRPC.TL_error) this.f21876c, false);
                return;
            case 5:
                ((q1) this.f21875b).P0.draw((Canvas) this.f21876c);
                return;
            case 6:
                ((q1) this.f21875b).post(new b1((q1) this.f21876c, 7));
                return;
            case 7:
                k8 k8Var = (k8) this.f21875b;
                TLRPC.Document document = (TLRPC.Document) this.f21876c;
                if (k8Var.f22181r.documents.isEmpty()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = k8Var.f22181r;
                    if (tL_messages_stickerSet.set.thumb_document_id == document.f19799id) {
                        tL_messages_stickerSet.documents.add(document);
                        k8Var.d(k8Var.f22181r, k8Var.f22179f, k8Var.f22182s);
                        return;
                    }
                    return;
                }
                return;
            default:
                ((ga) this.f21875b).z1((org.telegram.ui.ActionBar.s6) this.f21876c);
                return;
        }
    }
}
