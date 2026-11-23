package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.view.VelocityTracker;
import org.telegram.messenger.mp;
import org.telegram.messenger.p10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.kc;
public final class ha implements Runnable {
    public final int f30857a;
    public final Object f30858b;
    public final Object f30859c;

    public ha(int i7, Object obj, Object obj2) {
        this.f30857a = i7;
        this.f30858b = obj;
        this.f30859c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f30857a) {
            case 0:
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) this.f30858b;
                TLObject tLObject = (TLObject) this.f30859c;
                ja jaVar = themesHorizontalListCell$InnerThemeView.f30434b0;
                if (tLObject instanceof TLRPC.TL_wallPaper) {
                    TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject;
                    String r10 = org.telegram.messenger.w7.r(null, wallPaper.document);
                    if (!jaVar.f30985h3.containsKey(r10)) {
                        jaVar.f30985h3.put(r10, themesHorizontalListCell$InnerThemeView.f30433b);
                        org.telegram.messenger.w7.G(themesHorizontalListCell$InnerThemeView.f30433b.F).W(wallPaper.document, wallPaper, 1, 1);
                        return;
                    }
                    return;
                }
                themesHorizontalListCell$InnerThemeView.f30433b.f29329f = true;
                return;
            case 1:
                m0 m0Var = (m0) this.f30858b;
                l0 l0Var = (l0) this.f30859c;
                r1 r1Var = m0Var.f31103a;
                l0 l0Var2 = m0Var.F;
                if (l0Var == l0Var2) {
                    l0Var2.f31059n.c(false);
                    l0 l0Var3 = m0Var.F;
                    if (l0Var3.f31053g) {
                        if (r1Var.getDelegate() != null) {
                            r1Var.getDelegate().z2();
                        }
                    } else {
                        TLObject tLObject2 = l0Var3.f31060o;
                        r1 r1Var2 = m0Var.f31103a;
                        if (r1Var2.getDelegate() != null) {
                            r1Var2.getDelegate().I0(r1Var2, tLObject2, true);
                        }
                    }
                }
                m0Var.F = null;
                m0Var.G = null;
                m0Var.B = false;
                m0Var.A = false;
                m0Var.f31124y.c(false);
                VelocityTracker velocityTracker = m0Var.D;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    m0Var.D = null;
                    return;
                }
                return;
            case 2:
                v0 v0Var = (v0) this.f30858b;
                v0Var.f32163g1.V(v0Var, ((TLRPC.TL_messageActionGiftCode) this.f30859c).slug);
                return;
            case 3:
                final v0 v0Var2 = (v0) this.f30858b;
                final org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.f30859c;
                TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
                tL_resolveStarGiftOffer.offer_msg_id = v0Var2.getMessageObject().e1();
                tL_resolveStarGiftOffer.decline = true;
                ConnectionsManager.getInstance(v0Var2.I).sendRequestTyped(tL_resolveStarGiftOffer, new p10() {
                    @Override
                    public final void a(Object obj, Object obj2) {
                        TLRPC.Updates updates = (TLRPC.Updates) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        if (updates != null) {
                            mp.u1(v0.this.I).V3(updates, false);
                        }
                        if (tL_error != null) {
                            org.telegram.messenger.g0.g3(new ha(4, g2Var, tL_error));
                        }
                    }
                });
                return;
            case 4:
                kc.b0((org.telegram.ui.ActionBar.g2) this.f30858b).g0((TLRPC.TL_error) this.f30859c, false);
                return;
            case 5:
                ((r1) this.f30858b).Q0.draw((Canvas) this.f30859c);
                return;
            case 6:
                ((r1) this.f30858b).post(new e1((r1) this.f30859c, 7));
                return;
            case 7:
                g8 g8Var = (g8) this.f30858b;
                TLRPC.Document document = (TLRPC.Document) this.f30859c;
                if (g8Var.f30821r.documents.isEmpty()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = g8Var.f30821r;
                    if (tL_messages_stickerSet.set.thumb_document_id == document.f28498id) {
                        tL_messages_stickerSet.documents.add(document);
                        g8Var.d(g8Var.f30821r, g8Var.f30819f, g8Var.f30822s);
                        return;
                    }
                    return;
                }
                return;
            default:
                ((ja) this.f30858b).z1((org.telegram.ui.ActionBar.m6) this.f30859c);
                return;
        }
    }
}
