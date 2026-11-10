package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.view.VelocityTracker;
import org.telegram.messenger.qp;
import org.telegram.messenger.v10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.gc;
public final class ea implements Runnable {
    public final int f29097a;
    public final Object f29098b;
    public final Object f29099c;

    public ea(int i7, Object obj, Object obj2) {
        this.f29097a = i7;
        this.f29098b = obj;
        this.f29099c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f29097a) {
            case 0:
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) this.f29098b;
                TLObject tLObject = (TLObject) this.f29099c;
                ga gaVar = themesHorizontalListCell$InnerThemeView.f28868a0;
                if (tLObject instanceof TLRPC.TL_wallPaper) {
                    TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject;
                    String r10 = org.telegram.messenger.w7.r(null, wallPaper.document);
                    if (!gaVar.f29233g3.containsKey(r10)) {
                        gaVar.f29233g3.put(r10, themesHorizontalListCell$InnerThemeView.f28869b);
                        org.telegram.messenger.w7.G(themesHorizontalListCell$InnerThemeView.f28869b.E).W(wallPaper.document, wallPaper, 1, 1);
                        return;
                    }
                    return;
                }
                themesHorizontalListCell$InnerThemeView.f28869b.f27774f = true;
                return;
            case 1:
                l0 l0Var = (l0) this.f29098b;
                k0 k0Var = (k0) this.f29099c;
                q1 q1Var = l0Var.f29480a;
                k0 k0Var2 = l0Var.F;
                if (k0Var == k0Var2) {
                    k0Var2.f29418n.c(false);
                    k0 k0Var3 = l0Var.F;
                    if (k0Var3.f29412g) {
                        if (q1Var.getDelegate() != null) {
                            q1Var.getDelegate().i2();
                        }
                    } else {
                        TLObject tLObject2 = k0Var3.f29419o;
                        q1 q1Var2 = l0Var.f29480a;
                        if (q1Var2.getDelegate() != null) {
                            q1Var2.getDelegate().A0(q1Var2, tLObject2, true);
                        }
                    }
                }
                l0Var.F = null;
                l0Var.G = null;
                l0Var.B = false;
                l0Var.A = false;
                l0Var.f29501y.c(false);
                VelocityTracker velocityTracker = l0Var.D;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    l0Var.D = null;
                    return;
                }
                return;
            case 2:
                t0 t0Var = (t0) this.f29098b;
                t0Var.f30327f1.c0(t0Var, ((TLRPC.TL_messageActionGiftCode) this.f29099c).slug);
                return;
            case 3:
                final t0 t0Var2 = (t0) this.f29098b;
                final org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.f29099c;
                TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
                tL_resolveStarGiftOffer.offer_msg_id = t0Var2.getMessageObject().e1();
                tL_resolveStarGiftOffer.decline = true;
                ConnectionsManager.getInstance(t0Var2.H).sendRequestTyped(tL_resolveStarGiftOffer, new v10() {
                    @Override
                    public final void a(Object obj, Object obj2) {
                        TLRPC.Updates updates = (TLRPC.Updates) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        if (updates != null) {
                            qp.s1(t0.this.H).O3(updates, false);
                        }
                        if (tL_error != null) {
                            org.telegram.messenger.g0.h3(new ea(4, f2Var, tL_error));
                        }
                    }
                });
                return;
            case 4:
                gc.a0((org.telegram.ui.ActionBar.f2) this.f29098b).f0((TLRPC.TL_error) this.f29099c, false);
                return;
            case 5:
                ((q1) this.f29098b).P0.draw((Canvas) this.f29099c);
                return;
            case 6:
                ((q1) this.f29098b).post(new c1((q1) this.f29099c, 7));
                return;
            case 7:
                g8 g8Var = (g8) this.f29098b;
                TLRPC.Document document = (TLRPC.Document) this.f29099c;
                if (g8Var.f29222r.documents.isEmpty()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = g8Var.f29222r;
                    if (tL_messages_stickerSet.set.thumb_document_id == document.f26966id) {
                        tL_messages_stickerSet.documents.add(document);
                        g8Var.d(g8Var.f29222r, g8Var.f29220f, g8Var.f29223s);
                        return;
                    }
                    return;
                }
                return;
            default:
                ((ga) this.f29098b).z1((org.telegram.ui.ActionBar.l6) this.f29099c);
                return;
        }
    }
}
