package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.view.VelocityTracker;
import org.telegram.messenger.mp;
import org.telegram.messenger.q10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.lc;
public final class ga implements Runnable {
    public final int f30684a;
    public final Object f30685b;
    public final Object f30686c;

    public ga(int i7, Object obj, Object obj2) {
        this.f30684a = i7;
        this.f30685b = obj;
        this.f30686c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f30684a) {
            case 0:
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) this.f30685b;
                TLObject tLObject = (TLObject) this.f30686c;
                ia iaVar = themesHorizontalListCell$InnerThemeView.f30344b0;
                if (tLObject instanceof TLRPC.TL_wallPaper) {
                    TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject;
                    String r10 = org.telegram.messenger.w7.r(null, wallPaper.document);
                    if (!iaVar.f30841h3.containsKey(r10)) {
                        iaVar.f30841h3.put(r10, themesHorizontalListCell$InnerThemeView.f30343b);
                        org.telegram.messenger.w7.G(themesHorizontalListCell$InnerThemeView.f30343b.F).W(wallPaper.document, wallPaper, 1, 1);
                        return;
                    }
                    return;
                }
                themesHorizontalListCell$InnerThemeView.f30343b.f29256f = true;
                return;
            case 1:
                m0 m0Var = (m0) this.f30685b;
                l0 l0Var = (l0) this.f30686c;
                r1 r1Var = m0Var.f31027a;
                l0 l0Var2 = m0Var.F;
                if (l0Var == l0Var2) {
                    l0Var2.f30963n.c(false);
                    l0 l0Var3 = m0Var.F;
                    if (l0Var3.f30957g) {
                        if (r1Var.getDelegate() != null) {
                            r1Var.getDelegate().x2();
                        }
                    } else {
                        TLObject tLObject2 = l0Var3.f30964o;
                        r1 r1Var2 = m0Var.f31027a;
                        if (r1Var2.getDelegate() != null) {
                            r1Var2.getDelegate().B0(r1Var2, tLObject2, true);
                        }
                    }
                }
                m0Var.F = null;
                m0Var.G = null;
                m0Var.B = false;
                m0Var.A = false;
                m0Var.f31048y.c(false);
                VelocityTracker velocityTracker = m0Var.D;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    m0Var.D = null;
                    return;
                }
                return;
            case 2:
                v0 v0Var = (v0) this.f30685b;
                v0Var.f32083g1.g0(v0Var, ((TLRPC.TL_messageActionGiftCode) this.f30686c).slug);
                return;
            case 3:
                final v0 v0Var2 = (v0) this.f30685b;
                final org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) this.f30686c;
                TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
                tL_resolveStarGiftOffer.offer_msg_id = v0Var2.getMessageObject().e1();
                tL_resolveStarGiftOffer.decline = true;
                ConnectionsManager.getInstance(v0Var2.I).sendRequestTyped(tL_resolveStarGiftOffer, new q10() {
                    @Override
                    public final void a(Object obj, Object obj2) {
                        TLRPC.Updates updates = (TLRPC.Updates) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        if (updates != null) {
                            mp.u1(v0.this.I).V3(updates, false);
                        }
                        if (tL_error != null) {
                            org.telegram.messenger.g0.g3(new ga(4, h2Var, tL_error));
                        }
                    }
                });
                return;
            case 4:
                lc.b0((org.telegram.ui.ActionBar.h2) this.f30685b).g0((TLRPC.TL_error) this.f30686c, false);
                return;
            case 5:
                ((r1) this.f30685b).Q0.draw((Canvas) this.f30686c);
                return;
            case 6:
                ((r1) this.f30685b).post(new e1((r1) this.f30686c, 7));
                return;
            case 7:
                h8 h8Var = (h8) this.f30685b;
                TLRPC.Document document = (TLRPC.Document) this.f30686c;
                if (h8Var.f30764r.documents.isEmpty()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = h8Var.f30764r;
                    if (tL_messages_stickerSet.set.thumb_document_id == document.f28409id) {
                        tL_messages_stickerSet.documents.add(document);
                        h8Var.d(h8Var.f30764r, h8Var.f30762f, h8Var.f30765s);
                        return;
                    }
                    return;
                }
                return;
            default:
                ((ia) this.f30685b).z1((org.telegram.ui.ActionBar.m6) this.f30686c);
                return;
        }
    }
}
