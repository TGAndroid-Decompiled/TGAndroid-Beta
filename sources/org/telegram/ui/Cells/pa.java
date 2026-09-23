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
public final class pa implements Runnable {
    public final int f20577a;
    public final Object f20578b;
    public final Object f20579c;

    public pa(int i10, Object obj, Object obj2) {
        this.f20577a = i10;
        this.f20578b = obj;
        this.f20579c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f20577a) {
            case 0:
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) this.f20578b;
                TLObject tLObject = (TLObject) this.f20579c;
                ra raVar = themesHorizontalListCell$InnerThemeView.f19735a0;
                if (tLObject instanceof TLRPC.TL_wallPaper) {
                    TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject;
                    String attachFileName = FileLoader.getAttachFileName(wallPaper.document);
                    if (!raVar.Z2.containsKey(attachFileName)) {
                        raVar.Z2.put(attachFileName, themesHorizontalListCell$InnerThemeView.f19736b);
                        FileLoader.getInstance(themesHorizontalListCell$InnerThemeView.f19736b.E).loadFile(wallPaper.document, wallPaper, 1, 1);
                        return;
                    }
                    return;
                }
                themesHorizontalListCell$InnerThemeView.f19736b.f18690f = true;
                return;
            case 1:
                o0 o0Var = (o0) this.f20578b;
                n0 n0Var = (n0) this.f20579c;
                t1 t1Var = o0Var.f20489a;
                n0 n0Var2 = o0Var.F;
                if (n0Var == n0Var2) {
                    n0Var2.f20429n.c(false);
                    n0 n0Var3 = o0Var.F;
                    if (n0Var3.f20423g) {
                        if (t1Var.getDelegate() != null) {
                            t1Var.getDelegate().x2();
                        }
                    } else {
                        TLObject tLObject2 = n0Var3.f20430o;
                        t1 t1Var2 = o0Var.f20489a;
                        if (t1Var2.getDelegate() != null) {
                            t1Var2.getDelegate().A0(t1Var2, tLObject2, true);
                        }
                    }
                }
                o0Var.F = null;
                o0Var.G = null;
                o0Var.B = false;
                o0Var.A = false;
                o0Var.f20509y.c(false);
                VelocityTracker velocityTracker = o0Var.D;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    o0Var.D = null;
                    return;
                }
                return;
            case 2:
                final w0 w0Var = (w0) this.f20578b;
                final org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f20579c;
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
                            AndroidUtilities.runOnUIThread(new pa(3, n2Var, tL_error));
                        }
                    }
                });
                return;
            case 3:
                xc.a0((org.telegram.ui.ActionBar.n2) this.f20578b).d0((TLRPC.TL_error) this.f20579c, false);
                return;
            case 4:
                w0 w0Var2 = (w0) this.f20578b;
                w0Var2.X0.h2(w0Var2, ((TLRPC.TL_messageActionGiftCode) this.f20579c).slug);
                return;
            case 5:
                ((t1) this.f20578b).O0.draw((Canvas) this.f20579c);
                return;
            case 6:
                ((t1) this.f20578b).post(new b1(8, (t1) this.f20579c));
                return;
            case 7:
                n8 n8Var = (n8) this.f20578b;
                TLRPC.Document document = (TLRPC.Document) this.f20579c;
                if (n8Var.f20475r.documents.isEmpty()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = n8Var.f20475r;
                    if (tL_messages_stickerSet.set.thumb_document_id == document.f18089id) {
                        tL_messages_stickerSet.documents.add(document);
                        n8Var.d(n8Var.f20475r, n8Var.f20473f, n8Var.f20476s);
                        return;
                    }
                    return;
                }
                return;
            default:
                ((ra) this.f20578b).w1((org.telegram.ui.ActionBar.g6) this.f20579c);
                return;
        }
    }
}
