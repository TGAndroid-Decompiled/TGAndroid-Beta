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
import org.telegram.ui.Components.xc;
public final class oa implements Runnable {
    public final int f20797a;
    public final Object f20798b;
    public final Object f20799c;

    public oa(int i10, Object obj, Object obj2) {
        this.f20797a = i10;
        this.f20798b = obj;
        this.f20799c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f20797a) {
            case 0:
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) this.f20798b;
                TLObject tLObject = (TLObject) this.f20799c;
                qa qaVar = themesHorizontalListCell$InnerThemeView.f20000a0;
                if (tLObject instanceof TLRPC.TL_wallPaper) {
                    TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject;
                    String attachFileName = FileLoader.getAttachFileName(wallPaper.document);
                    if (!qaVar.Z2.containsKey(attachFileName)) {
                        qaVar.Z2.put(attachFileName, themesHorizontalListCell$InnerThemeView.f20001b);
                        FileLoader.getInstance(themesHorizontalListCell$InnerThemeView.f20001b.E).loadFile(wallPaper.document, wallPaper, 1, 1);
                        return;
                    }
                    return;
                }
                themesHorizontalListCell$InnerThemeView.f20001b.f18996f = true;
                return;
            case 1:
                o0 o0Var = (o0) this.f20798b;
                n0 n0Var = (n0) this.f20799c;
                u1 u1Var = o0Var.f20732a;
                n0 n0Var2 = o0Var.F;
                if (n0Var == n0Var2) {
                    n0Var2.f20690n.c(false);
                    n0 n0Var3 = o0Var.F;
                    if (n0Var3.f20684g) {
                        if (u1Var.getDelegate() != null) {
                            u1Var.getDelegate().x2();
                        }
                    } else {
                        TLObject tLObject2 = n0Var3.f20691o;
                        u1 u1Var2 = o0Var.f20732a;
                        if (u1Var2.getDelegate() != null) {
                            u1Var2.getDelegate().B0(u1Var2, tLObject2, true);
                        }
                    }
                }
                o0Var.F = null;
                o0Var.G = null;
                o0Var.B = false;
                o0Var.A = false;
                o0Var.f20752y.c(false);
                VelocityTracker velocityTracker = o0Var.D;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    o0Var.D = null;
                    return;
                }
                return;
            case 2:
                final w0 w0Var = (w0) this.f20798b;
                final org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f20799c;
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
                xc.a0((org.telegram.ui.ActionBar.n2) this.f20798b).d0((TLRPC.TL_error) this.f20799c, false);
                return;
            case 4:
                w0 w0Var2 = (w0) this.f20798b;
                w0Var2.X0.h2(w0Var2, ((TLRPC.TL_messageActionGiftCode) this.f20799c).slug);
                return;
            case 5:
                ((u1) this.f20798b).O0.draw((Canvas) this.f20799c);
                return;
            case 6:
                ((u1) this.f20798b).post(new b1(8, (u1) this.f20799c));
                return;
            case 7:
                n8 n8Var = (n8) this.f20798b;
                TLRPC.Document document = (TLRPC.Document) this.f20799c;
                if (n8Var.f20719r.documents.isEmpty()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = n8Var.f20719r;
                    if (tL_messages_stickerSet.set.thumb_document_id == document.f18349id) {
                        tL_messages_stickerSet.documents.add(document);
                        n8Var.d(n8Var.f20719r, n8Var.f20717f, n8Var.f20720s);
                        return;
                    }
                    return;
                }
                return;
            default:
                ((qa) this.f20798b).x1((org.telegram.ui.ActionBar.i6) this.f20799c);
                return;
        }
    }
}
