package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.view.VelocityTracker;
import org.telegram.messenger.hp;
import org.telegram.messenger.n10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.fc;
public final class ea implements Runnable {
    public final int f29136a;
    public final Object f29137b;
    public final Object f29138c;

    public ea(int i3, Object obj, Object obj2) {
        this.f29136a = i3;
        this.f29137b = obj;
        this.f29138c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f29136a) {
            case 0:
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) this.f29137b;
                TLObject tLObject = (TLObject) this.f29138c;
                ga gaVar = themesHorizontalListCell$InnerThemeView.f28913b0;
                if (tLObject instanceof TLRPC.TL_wallPaper) {
                    TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject;
                    String r5 = org.telegram.messenger.w7.r(null, wallPaper.document);
                    if (!gaVar.f29280h3.containsKey(r5)) {
                        gaVar.f29280h3.put(r5, themesHorizontalListCell$InnerThemeView.f28912b);
                        org.telegram.messenger.w7.G(themesHorizontalListCell$InnerThemeView.f28912b.F).X(wallPaper.document, wallPaper, 1, 1);
                        return;
                    }
                    return;
                }
                themesHorizontalListCell$InnerThemeView.f28912b.f27684f = true;
                return;
            case 1:
                l0 l0Var = (l0) this.f29137b;
                k0 k0Var = (k0) this.f29138c;
                q1 q1Var = l0Var.f29522a;
                k0 k0Var2 = l0Var.F;
                if (k0Var == k0Var2) {
                    k0Var2.f29477n.c(false);
                    k0 k0Var3 = l0Var.F;
                    if (k0Var3.f29471g) {
                        if (q1Var.getDelegate() != null) {
                            q1Var.getDelegate().o2();
                        }
                    } else {
                        TLObject tLObject2 = k0Var3.f29478o;
                        q1 q1Var2 = l0Var.f29522a;
                        if (q1Var2.getDelegate() != null) {
                            q1Var2.getDelegate().A0(q1Var2, tLObject2, true);
                        }
                    }
                }
                l0Var.F = null;
                l0Var.G = null;
                l0Var.B = false;
                l0Var.A = false;
                l0Var.f29543y.c(false);
                VelocityTracker velocityTracker = l0Var.D;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    l0Var.D = null;
                    return;
                }
                return;
            case 2:
                t0 t0Var = (t0) this.f29137b;
                t0Var.f30389g1.q0(t0Var, ((TLRPC.TL_messageActionGiftCode) this.f29138c).slug);
                return;
            case 3:
                final t0 t0Var2 = (t0) this.f29137b;
                final org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.f29138c;
                TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
                tL_resolveStarGiftOffer.offer_msg_id = t0Var2.getMessageObject().f1();
                tL_resolveStarGiftOffer.decline = true;
                ConnectionsManager.getInstance(t0Var2.I).sendRequestTyped(tL_resolveStarGiftOffer, new n10() {
                    @Override
                    public final void a(Object obj, Object obj2) {
                        TLRPC.Updates updates = (TLRPC.Updates) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        if (updates != null) {
                            hp.s1(t0.this.I).O3(updates, false);
                        }
                        if (tL_error != null) {
                            org.telegram.messenger.g0.h3(new ea(4, d2Var, tL_error));
                        }
                    }
                });
                return;
            case 4:
                fc.a0((org.telegram.ui.ActionBar.d2) this.f29137b).f0((TLRPC.TL_error) this.f29138c, false);
                return;
            case 5:
                ((q1) this.f29137b).Q0.draw((Canvas) this.f29138c);
                return;
            case 6:
                ((q1) this.f29137b).post(new c1((q1) this.f29138c, 7));
                return;
            case 7:
                f8 f8Var = (f8) this.f29137b;
                TLRPC.Document document = (TLRPC.Document) this.f29138c;
                if (f8Var.f29241r.documents.isEmpty()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = f8Var.f29241r;
                    if (tL_messages_stickerSet.set.thumb_document_id == document.f27007id) {
                        tL_messages_stickerSet.documents.add(document);
                        f8Var.d(f8Var.f29241r, f8Var.f29239f, f8Var.f29242s);
                        return;
                    }
                    return;
                }
                return;
            default:
                ((ga) this.f29137b).z1((org.telegram.ui.ActionBar.j6) this.f29138c);
                return;
        }
    }
}
