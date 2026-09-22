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
import org.telegram.ui.Components.vc;
public final class oa implements Runnable {
    public final int f20570a;
    public final Object f20571b;
    public final Object f20572c;

    public oa(int i10, Object obj, Object obj2) {
        this.f20570a = i10;
        this.f20571b = obj;
        this.f20572c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f20570a) {
            case 0:
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) this.f20571b;
                TLObject tLObject = (TLObject) this.f20572c;
                qa qaVar = themesHorizontalListCell$InnerThemeView.f19762a0;
                if (tLObject instanceof TLRPC.TL_wallPaper) {
                    TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject;
                    String attachFileName = FileLoader.getAttachFileName(wallPaper.document);
                    if (!qaVar.Z2.containsKey(attachFileName)) {
                        qaVar.Z2.put(attachFileName, themesHorizontalListCell$InnerThemeView.f19763b);
                        FileLoader.getInstance(themesHorizontalListCell$InnerThemeView.f19763b.E).loadFile(wallPaper.document, wallPaper, 1, 1);
                        return;
                    }
                    return;
                }
                themesHorizontalListCell$InnerThemeView.f19763b.f18735f = true;
                return;
            case 1:
                o0 o0Var = (o0) this.f20571b;
                n0 n0Var = (n0) this.f20572c;
                t1 t1Var = o0Var.f20501a;
                n0 n0Var2 = o0Var.F;
                if (n0Var == n0Var2) {
                    n0Var2.f20450n.c(false);
                    n0 n0Var3 = o0Var.F;
                    if (n0Var3.f20444g) {
                        if (t1Var.getDelegate() != null) {
                            t1Var.getDelegate().x2();
                        }
                    } else {
                        TLObject tLObject2 = n0Var3.f20451o;
                        t1 t1Var2 = o0Var.f20501a;
                        if (t1Var2.getDelegate() != null) {
                            t1Var2.getDelegate().A0(t1Var2, tLObject2, true);
                        }
                    }
                }
                o0Var.F = null;
                o0Var.G = null;
                o0Var.B = false;
                o0Var.A = false;
                o0Var.f20521y.c(false);
                VelocityTracker velocityTracker = o0Var.D;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    o0Var.D = null;
                    return;
                }
                return;
            case 2:
                final w0 w0Var = (w0) this.f20571b;
                final org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f20572c;
                TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
                tL_resolveStarGiftOffer.offer_msg_id = w0Var.getMessageObject().getId();
                tL_resolveStarGiftOffer.decline = true;
                ConnectionsManager.getInstance(w0Var.H).sendRequestTyped(tL_resolveStarGiftOffer, new Utilities.Callback2() {
                    @Override
                    public final void run(Object obj, Object obj2) {
                        TLRPC.Updates updates = (TLRPC.Updates) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        if (updates != null) {
                            MessagesController.getInstance(w0.this.H).processUpdates(updates, false);
                        }
                        if (tL_error != null) {
                            AndroidUtilities.runOnUIThread(new oa(3, n2Var, tL_error));
                        }
                    }
                });
                return;
            case 3:
                vc.a0((org.telegram.ui.ActionBar.n2) this.f20571b).d0((TLRPC.TL_error) this.f20572c, false);
                return;
            case 4:
                w0 w0Var2 = (w0) this.f20571b;
                w0Var2.X0.h2(w0Var2, ((TLRPC.TL_messageActionGiftCode) this.f20572c).slug);
                return;
            case 5:
                ((t1) this.f20571b).O0.draw((Canvas) this.f20572c);
                return;
            case 6:
                ((t1) this.f20571b).post(new b1(8, (t1) this.f20572c));
                return;
            case 7:
                m8 m8Var = (m8) this.f20571b;
                TLRPC.Document document = (TLRPC.Document) this.f20572c;
                if (m8Var.f20425r.documents.isEmpty()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = m8Var.f20425r;
                    if (tL_messages_stickerSet.set.thumb_document_id == document.f18115id) {
                        tL_messages_stickerSet.documents.add(document);
                        m8Var.d(m8Var.f20425r, m8Var.f20423f, m8Var.f20426s);
                        return;
                    }
                    return;
                }
                return;
            default:
                ((qa) this.f20571b).w1((org.telegram.ui.ActionBar.h6) this.f20572c);
                return;
        }
    }
}
