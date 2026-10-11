package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.view.VelocityTracker;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.ad;
public final class la implements Runnable {
    public final int f22423a;
    public final Object f22424b;
    public final Object f22425c;

    public la(int i10, Object obj, Object obj2) {
        this.f22423a = i10;
        this.f22424b = obj;
        this.f22425c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f22423a) {
            case 0:
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) this.f22424b;
                TLObject tLObject = (TLObject) this.f22425c;
                na naVar = themesHorizontalListCell$InnerThemeView.f21754a0;
                if (tLObject instanceof TLRPC.TL_wallPaper) {
                    TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject;
                    String attachFileName = FileLoader.getAttachFileName(wallPaper.document);
                    if (!naVar.X2.containsKey(attachFileName)) {
                        naVar.X2.put(attachFileName, themesHorizontalListCell$InnerThemeView.f21755b);
                        FileLoader.getInstance(themesHorizontalListCell$InnerThemeView.f21755b.E).loadFile(wallPaper.document, wallPaper, 1, 1);
                        return;
                    }
                    return;
                }
                themesHorizontalListCell$InnerThemeView.f21755b.f20664f = true;
                return;
            case 1:
                o0 o0Var = (o0) this.f22424b;
                n0 n0Var = (n0) this.f22425c;
                u1 u1Var = o0Var.f22554a;
                n0 n0Var2 = o0Var.F;
                if (n0Var == n0Var2) {
                    n0Var2.f22488n.c(false);
                    n0 n0Var3 = o0Var.F;
                    if (n0Var3.f22482g) {
                        if (u1Var.getDelegate() != null) {
                            u1Var.getDelegate().C2();
                        }
                    } else {
                        TLObject tLObject2 = n0Var3.f22489o;
                        u1 u1Var2 = o0Var.f22554a;
                        if (u1Var2.getDelegate() != null) {
                            u1Var2.getDelegate().G0(u1Var2, tLObject2, true);
                        }
                    }
                }
                o0Var.F = null;
                o0Var.G = null;
                o0Var.B = false;
                o0Var.A = false;
                o0Var.f22575y.c(false);
                VelocityTracker velocityTracker = o0Var.D;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    o0Var.D = null;
                    return;
                }
                return;
            case 2:
                w0 w0Var = (w0) this.f22424b;
                w0Var.f23588f1.n2(w0Var, ((TLRPC.TL_messageActionGiftCode) this.f22425c).slug);
                return;
            case 3:
                final w0 w0Var2 = (w0) this.f22424b;
                final org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.f22425c;
                TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
                tL_resolveStarGiftOffer.offer_msg_id = w0Var2.getMessageObject().getId();
                tL_resolveStarGiftOffer.decline = true;
                ConnectionsManager.getInstance(w0Var2.H).sendRequestTyped(tL_resolveStarGiftOffer, new Utilities.Callback2() {
                    @Override
                    public final void run(Object obj, Object obj2) {
                        TLRPC.Updates updates = (TLRPC.Updates) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        if (updates != null) {
                            MessagesController.getInstance(w0.this.H).lambda$processUpdates$377(updates, false);
                        }
                        if (tL_error != null) {
                            AndroidUtilities.runOnUIThread(new la(4, m2Var, tL_error));
                        }
                    }
                });
                return;
            case 4:
                ad.a0((org.telegram.ui.ActionBar.m2) this.f22424b).f0((TLRPC.TL_error) this.f22425c, false);
                return;
            case 5:
                ((u1) this.f22424b).O0.draw((Canvas) this.f22425c);
                return;
            case 6:
                ((u1) this.f22424b).post(new b1(8, (u1) this.f22425c));
                return;
            case 7:
                m8 m8Var = (m8) this.f22424b;
                TLRPC.Document document = (TLRPC.Document) this.f22425c;
                if (m8Var.f22461r.documents.isEmpty()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = m8Var.f22461r;
                    if (tL_messages_stickerSet.set.thumb_document_id == document.f20038id) {
                        tL_messages_stickerSet.documents.add(document);
                        m8Var.d(m8Var.f22461r, m8Var.f22459f, m8Var.f22462s);
                        return;
                    }
                    return;
                }
                return;
            default:
                ((na) this.f22424b).x1((org.telegram.ui.ActionBar.g6) this.f22425c);
                return;
        }
    }
}
