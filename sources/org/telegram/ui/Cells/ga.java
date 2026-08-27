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
import org.telegram.ui.Components.mc;

public final class ga implements Runnable {

    public final int f24405a;

    public final Object f24406b;

    public final Object f24407c;

    public ga(int i10, Object obj, Object obj2) {
        this.f24405a = i10;
        this.f24406b = obj;
        this.f24407c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f24405a) {
            case 0:
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) this.f24406b;
                TLObject tLObject = (TLObject) this.f24407c;
                ia iaVar = themesHorizontalListCell$InnerThemeView.T;
                if (!(tLObject instanceof TLRPC.TL_wallPaper)) {
                    themesHorizontalListCell$InnerThemeView.f24036b.f22950f = true;
                } else {
                    TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject;
                    String attachFileName = FileLoader.getAttachFileName(wallPaper.document);
                    if (!iaVar.V2.containsKey(attachFileName)) {
                        iaVar.V2.put(attachFileName, themesHorizontalListCell$InnerThemeView.f24036b);
                        FileLoader.getInstance(themesHorizontalListCell$InnerThemeView.f24036b.A).loadFile(wallPaper.document, wallPaper, 1, 1);
                    }
                }
                break;
            case 1:
                o0 o0Var = (o0) this.f24406b;
                n0 n0Var = (n0) this.f24407c;
                s1 s1Var = o0Var.f24747a;
                n0 n0Var2 = o0Var.F;
                if (n0Var == n0Var2) {
                    n0Var2.f24713n.c(false);
                    n0 n0Var3 = o0Var.F;
                    if (!n0Var3.f24707g) {
                        TLObject tLObject2 = n0Var3.f24714o;
                        s1 s1Var2 = o0Var.f24747a;
                        if (s1Var2.getDelegate() != null) {
                            s1Var2.getDelegate().E0(s1Var2, tLObject2, true);
                        }
                    } else if (s1Var.getDelegate() != null) {
                        s1Var.getDelegate().m2();
                    }
                }
                o0Var.F = null;
                o0Var.G = null;
                o0Var.B = false;
                o0Var.A = false;
                o0Var.f24768y.c(false);
                VelocityTracker velocityTracker = o0Var.D;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    o0Var.D = null;
                }
                break;
            case 2:
                final v0 v0Var = (v0) this.f24406b;
                final org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f24407c;
                TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
                tL_resolveStarGiftOffer.offer_msg_id = v0Var.getMessageObject().getId();
                tL_resolveStarGiftOffer.decline = true;
                ConnectionsManager.getInstance(v0Var.D).sendRequestTyped(tL_resolveStarGiftOffer, new Utilities.Callback2() {
                    @Override
                    public final void run(Object obj, Object obj2) {
                        TLRPC.Updates updates = (TLRPC.Updates) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        if (updates != null) {
                            MessagesController.getInstance(v0Var.D).processUpdates(updates, false);
                        }
                        if (tL_error != null) {
                            AndroidUtilities.runOnUIThread(new ga(3, n2Var, tL_error));
                        }
                    }
                });
                break;
            case 3:
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.f24406b;
                mc.a0(n2Var2).d0((TLRPC.TL_error) this.f24407c, false);
                break;
            case 4:
                v0 v0Var2 = (v0) this.f24406b;
                v0Var2.T0.T1(v0Var2, ((TLRPC.TL_messageActionGiftCode) this.f24407c).slug);
                break;
            case 5:
                s1 s1Var3 = (s1) this.f24406b;
                s1Var3.K0.draw((Canvas) this.f24407c);
                break;
            case 6:
                ((s1) this.f24406b).post(new a1(8, (s1) this.f24407c));
                break;
            case 7:
                h8 h8Var = (h8) this.f24406b;
                TLRPC.Document document = (TLRPC.Document) this.f24407c;
                if (h8Var.f24458r.documents.isEmpty()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = h8Var.f24458r;
                    if (tL_messages_stickerSet.set.thumb_document_id == document.f22386id) {
                        tL_messages_stickerSet.documents.add(document);
                        h8Var.d(h8Var.f24458r, h8Var.f24456f, h8Var.f24459s);
                    }
                }
                break;
            default:
                ((ia) this.f24406b).w1((org.telegram.ui.ActionBar.f6) this.f24407c);
                break;
        }
    }
}
