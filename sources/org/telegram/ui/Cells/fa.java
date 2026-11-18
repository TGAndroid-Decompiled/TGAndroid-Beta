package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.view.VelocityTracker;
import org.telegram.messenger.fj;
import org.telegram.messenger.mp;
import org.telegram.messenger.q10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.lc;
public final class fa implements Runnable {
    public final int f30625a;
    public final Object f30626b;
    public final Object f30627c;

    public fa(int i7, Object obj, Object obj2) {
        this.f30625a = i7;
        this.f30626b = obj;
        this.f30627c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f30625a) {
            case 0:
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) this.f30626b;
                TLObject tLObject = (TLObject) this.f30627c;
                ha haVar = themesHorizontalListCell$InnerThemeView.f30346b0;
                if (tLObject instanceof TLRPC.TL_wallPaper) {
                    TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject;
                    String r10 = org.telegram.messenger.w7.r(null, wallPaper.document);
                    if (!haVar.f30793h3.containsKey(r10)) {
                        haVar.f30793h3.put(r10, themesHorizontalListCell$InnerThemeView.f30345b);
                        org.telegram.messenger.w7.G(themesHorizontalListCell$InnerThemeView.f30345b.F).W(wallPaper.document, wallPaper, 1, 1);
                        return;
                    }
                    return;
                }
                themesHorizontalListCell$InnerThemeView.f30345b.f29258f = true;
                return;
            case 1:
                m0 m0Var = (m0) this.f30626b;
                l0 l0Var = (l0) this.f30627c;
                q1 q1Var = m0Var.f31020a;
                l0 l0Var2 = m0Var.F;
                if (l0Var == l0Var2) {
                    l0Var2.f30975n.c(false);
                    l0 l0Var3 = m0Var.F;
                    if (l0Var3.f30969g) {
                        if (q1Var.getDelegate() != null) {
                            q1Var.getDelegate().x2();
                        }
                    } else {
                        TLObject tLObject2 = l0Var3.f30976o;
                        q1 q1Var2 = m0Var.f31020a;
                        if (q1Var2.getDelegate() != null) {
                            q1Var2.getDelegate().B0(q1Var2, tLObject2, true);
                        }
                    }
                }
                m0Var.F = null;
                m0Var.G = null;
                m0Var.B = false;
                m0Var.A = false;
                m0Var.f31041y.c(false);
                VelocityTracker velocityTracker = m0Var.D;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    m0Var.D = null;
                    return;
                }
                return;
            case 2:
                u0 u0Var = (u0) this.f30626b;
                u0Var.f32024g1.g0(u0Var, ((TLRPC.TL_messageActionGiftCode) this.f30627c).slug);
                return;
            case 3:
                final u0 u0Var2 = (u0) this.f30626b;
                final org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) this.f30627c;
                TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
                tL_resolveStarGiftOffer.offer_msg_id = u0Var2.getMessageObject().e1();
                tL_resolveStarGiftOffer.decline = true;
                ConnectionsManager.getInstance(u0Var2.I).sendRequestTyped(tL_resolveStarGiftOffer, new q10() {
                    @Override
                    public final void a(Object obj, Object obj2) {
                        TLRPC.Updates updates = (TLRPC.Updates) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        if (updates != null) {
                            mp.u1(u0.this.I).V3(updates, false);
                        }
                        if (tL_error != null) {
                            org.telegram.messenger.g0.g3(new fa(4, h2Var, tL_error));
                        }
                    }
                });
                return;
            case 4:
                lc.b0((org.telegram.ui.ActionBar.h2) this.f30626b).g0((TLRPC.TL_error) this.f30627c, false);
                return;
            case 5:
                u0 u0Var3 = (u0) this.f30626b;
                fj fjVar = (fj) this.f30627c;
                if (u0Var3.Q0 == fjVar) {
                    u0Var3.j0(fjVar, true);
                    u0Var3.requestLayout();
                    return;
                }
                return;
            case 6:
                ((q1) this.f30626b).Q0.draw((Canvas) this.f30627c);
                return;
            case 7:
                ((q1) this.f30626b).post(new d1((q1) this.f30627c, 7));
                return;
            case 8:
                g8 g8Var = (g8) this.f30626b;
                TLRPC.Document document = (TLRPC.Document) this.f30627c;
                if (g8Var.f30715r.documents.isEmpty()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = g8Var.f30715r;
                    if (tL_messages_stickerSet.set.thumb_document_id == document.f28411id) {
                        tL_messages_stickerSet.documents.add(document);
                        g8Var.d(g8Var.f30715r, g8Var.f30713f, g8Var.f30716s);
                        return;
                    }
                    return;
                }
                return;
            default:
                ((ha) this.f30626b).z1((org.telegram.ui.ActionBar.m6) this.f30627c);
                return;
        }
    }
}
