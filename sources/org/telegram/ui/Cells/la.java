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
import org.telegram.ui.Components.zc;
public final class la implements Runnable {
    public final int f21493a;
    public final Object f21494b;
    public final Object f21495c;

    public la(int i10, Object obj, Object obj2) {
        this.f21493a = i10;
        this.f21494b = obj;
        this.f21495c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f21493a) {
            case 0:
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) this.f21494b;
                TLObject tLObject = (TLObject) this.f21495c;
                na naVar = themesHorizontalListCell$InnerThemeView.f20878a0;
                if (tLObject instanceof TLRPC.TL_wallPaper) {
                    TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject;
                    String attachFileName = FileLoader.getAttachFileName(wallPaper.document);
                    if (!naVar.X2.containsKey(attachFileName)) {
                        naVar.X2.put(attachFileName, themesHorizontalListCell$InnerThemeView.f20879b);
                        FileLoader.getInstance(themesHorizontalListCell$InnerThemeView.f20879b.E).loadFile(wallPaper.document, wallPaper, 1, 1);
                        return;
                    }
                    return;
                }
                themesHorizontalListCell$InnerThemeView.f20879b.f19799f = true;
                return;
            case 1:
                p0 p0Var = (p0) this.f21494b;
                o0 o0Var = (o0) this.f21495c;
                u1 u1Var = p0Var.f21649a;
                o0 o0Var2 = p0Var.F;
                if (o0Var == o0Var2) {
                    o0Var2.f21613n.c(false);
                    o0 o0Var3 = p0Var.F;
                    if (o0Var3.f21607g) {
                        if (u1Var.getDelegate() != null) {
                            u1Var.getDelegate().n2();
                        }
                    } else {
                        TLObject tLObject2 = o0Var3.f21614o;
                        u1 u1Var2 = p0Var.f21649a;
                        if (u1Var2.getDelegate() != null) {
                            u1Var2.getDelegate().z0(u1Var2, tLObject2, true);
                        }
                    }
                }
                p0Var.F = null;
                p0Var.G = null;
                p0Var.B = false;
                p0Var.A = false;
                p0Var.f21669y.c(false);
                VelocityTracker velocityTracker = p0Var.D;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    p0Var.D = null;
                    return;
                }
                return;
            case 2:
                x0 x0Var = (x0) this.f21494b;
                x0Var.f22675f1.X1(x0Var, ((TLRPC.TL_messageActionGiftCode) this.f21495c).slug);
                return;
            case 3:
                final x0 x0Var2 = (x0) this.f21494b;
                final org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.f21495c;
                TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
                tL_resolveStarGiftOffer.offer_msg_id = x0Var2.getMessageObject().getId();
                tL_resolveStarGiftOffer.decline = true;
                ConnectionsManager.getInstance(x0Var2.H).sendRequestTyped(tL_resolveStarGiftOffer, new Utilities.Callback2() {
                    @Override
                    public final void run(Object obj, Object obj2) {
                        TLRPC.Updates updates = (TLRPC.Updates) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        if (updates != null) {
                            MessagesController.getInstance(x0.this.H).lambda$processUpdates$377(updates, false);
                        }
                        if (tL_error != null) {
                            AndroidUtilities.runOnUIThread(new la(4, m2Var, tL_error));
                        }
                    }
                });
                return;
            case 4:
                zc.a0((org.telegram.ui.ActionBar.m2) this.f21494b).f0((TLRPC.TL_error) this.f21495c, false);
                return;
            case 5:
                ((u1) this.f21494b).O0.draw((Canvas) this.f21495c);
                return;
            case 6:
                ((u1) this.f21494b).post(new c1(8, (u1) this.f21495c));
                return;
            case 7:
                m8 m8Var = (m8) this.f21494b;
                TLRPC.Document document = (TLRPC.Document) this.f21495c;
                if (m8Var.f21525r.documents.isEmpty()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = m8Var.f21525r;
                    if (tL_messages_stickerSet.set.thumb_document_id == document.f19222id) {
                        tL_messages_stickerSet.documents.add(document);
                        m8Var.d(m8Var.f21525r, m8Var.f21523f, m8Var.f21526s);
                        return;
                    }
                    return;
                }
                return;
            default:
                ((na) this.f21494b).x1((org.telegram.ui.ActionBar.f6) this.f21495c);
                return;
        }
    }
}
