package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.view.VelocityTracker;
import org.telegram.messenger.np;
import org.telegram.messenger.s10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.cc;
public final class ea implements Runnable {
    public final int f30192a;
    public final Object f30193b;
    public final Object f30194c;

    public ea(int i7, Object obj, Object obj2) {
        this.f30192a = i7;
        this.f30193b = obj;
        this.f30194c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f30192a) {
            case 0:
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) this.f30193b;
                TLObject tLObject = (TLObject) this.f30194c;
                ga gaVar = themesHorizontalListCell$InnerThemeView.f29969b0;
                if (tLObject instanceof TLRPC.TL_wallPaper) {
                    TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject;
                    String r10 = org.telegram.messenger.w7.r(null, wallPaper.document);
                    if (!gaVar.f30339h3.containsKey(r10)) {
                        gaVar.f30339h3.put(r10, themesHorizontalListCell$InnerThemeView.f29968b);
                        org.telegram.messenger.w7.G(themesHorizontalListCell$InnerThemeView.f29968b.F).W(wallPaper.document, wallPaper, 1, 1);
                        return;
                    }
                    return;
                }
                themesHorizontalListCell$InnerThemeView.f29968b.f28707f = true;
                return;
            case 1:
                l0 l0Var = (l0) this.f30193b;
                k0 k0Var = (k0) this.f30194c;
                q1 q1Var = l0Var.f30583a;
                k0 k0Var2 = l0Var.F;
                if (k0Var == k0Var2) {
                    k0Var2.f30538n.c(false);
                    k0 k0Var3 = l0Var.F;
                    if (k0Var3.f30532g) {
                        if (q1Var.getDelegate() != null) {
                            q1Var.getDelegate().x2();
                        }
                    } else {
                        TLObject tLObject2 = k0Var3.f30539o;
                        q1 q1Var2 = l0Var.f30583a;
                        if (q1Var2.getDelegate() != null) {
                            q1Var2.getDelegate().B0(q1Var2, tLObject2, true);
                        }
                    }
                }
                l0Var.F = null;
                l0Var.G = null;
                l0Var.B = false;
                l0Var.A = false;
                l0Var.f30604y.c(false);
                VelocityTracker velocityTracker = l0Var.D;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    l0Var.D = null;
                    return;
                }
                return;
            case 2:
                t0 t0Var = (t0) this.f30193b;
                t0Var.f31465g1.k0(t0Var, ((TLRPC.TL_messageActionGiftCode) this.f30194c).slug);
                return;
            case 3:
                final t0 t0Var2 = (t0) this.f30193b;
                final org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.f30194c;
                TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
                tL_resolveStarGiftOffer.offer_msg_id = t0Var2.getMessageObject().e1();
                tL_resolveStarGiftOffer.decline = true;
                ConnectionsManager.getInstance(t0Var2.I).sendRequestTyped(tL_resolveStarGiftOffer, new s10() {
                    @Override
                    public final void a(Object obj, Object obj2) {
                        TLRPC.Updates updates = (TLRPC.Updates) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        if (updates != null) {
                            np.s1(t0.this.I).O3(updates, false);
                        }
                        if (tL_error != null) {
                            org.telegram.messenger.g0.h3(new ea(4, e2Var, tL_error));
                        }
                    }
                });
                return;
            case 4:
                cc.a0((org.telegram.ui.ActionBar.e2) this.f30193b).f0((TLRPC.TL_error) this.f30194c, false);
                return;
            case 5:
                ((q1) this.f30193b).Q0.draw((Canvas) this.f30194c);
                return;
            case 6:
                ((q1) this.f30193b).post(new d1((q1) this.f30194c, 7));
                return;
            case 7:
                f8 f8Var = (f8) this.f30193b;
                TLRPC.Document document = (TLRPC.Document) this.f30194c;
                if (f8Var.f30300r.documents.isEmpty()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = f8Var.f30300r;
                    if (tL_messages_stickerSet.set.thumb_document_id == document.f28057id) {
                        tL_messages_stickerSet.documents.add(document);
                        f8Var.d(f8Var.f30300r, f8Var.f30298f, f8Var.f30301s);
                        return;
                    }
                    return;
                }
                return;
            default:
                ((ga) this.f30193b).z1((org.telegram.ui.ActionBar.i6) this.f30194c);
                return;
        }
    }
}
