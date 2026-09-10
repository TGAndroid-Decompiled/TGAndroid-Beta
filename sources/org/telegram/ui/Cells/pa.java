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
import org.telegram.ui.Components.wc;
public final class pa implements Runnable {
    public final int f19695a;
    public final Object f19696b;
    public final Object f19697c;

    public pa(int i10, Object obj, Object obj2) {
        this.f19695a = i10;
        this.f19696b = obj;
        this.f19697c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f19695a) {
            case 0:
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) this.f19696b;
                TLObject tLObject = (TLObject) this.f19697c;
                ra raVar = themesHorizontalListCell$InnerThemeView.f18852a0;
                if (tLObject instanceof TLRPC.TL_wallPaper) {
                    TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject;
                    String attachFileName = FileLoader.getAttachFileName(wallPaper.document);
                    if (!raVar.Z2.containsKey(attachFileName)) {
                        raVar.Z2.put(attachFileName, themesHorizontalListCell$InnerThemeView.f18853b);
                        FileLoader.getInstance(themesHorizontalListCell$InnerThemeView.f18853b.E).loadFile(wallPaper.document, wallPaper, 1, 1);
                        return;
                    }
                    return;
                }
                themesHorizontalListCell$InnerThemeView.f18853b.f17842f = true;
                return;
            case 1:
                o0 o0Var = (o0) this.f19696b;
                n0 n0Var = (n0) this.f19697c;
                t1 t1Var = o0Var.f19590a;
                n0 n0Var2 = o0Var.F;
                if (n0Var == n0Var2) {
                    n0Var2.f19553n.c(false);
                    n0 n0Var3 = o0Var.F;
                    if (n0Var3.f19547g) {
                        if (t1Var.getDelegate() != null) {
                            t1Var.getDelegate().v2();
                        }
                    } else {
                        TLObject tLObject2 = n0Var3.f19554o;
                        t1 t1Var2 = o0Var.f19590a;
                        if (t1Var2.getDelegate() != null) {
                            t1Var2.getDelegate().B0(t1Var2, tLObject2, true);
                        }
                    }
                }
                o0Var.F = null;
                o0Var.G = null;
                o0Var.B = false;
                o0Var.A = false;
                o0Var.f19610y.c(false);
                VelocityTracker velocityTracker = o0Var.D;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    o0Var.D = null;
                    return;
                }
                return;
            case 2:
                final w0 w0Var = (w0) this.f19696b;
                final org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.f19697c;
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
                            AndroidUtilities.runOnUIThread(new pa(3, p2Var, tL_error));
                        }
                    }
                });
                return;
            case 3:
                wc.a0((org.telegram.ui.ActionBar.p2) this.f19696b).d0((TLRPC.TL_error) this.f19697c, false);
                return;
            case 4:
                w0 w0Var2 = (w0) this.f19696b;
                w0Var2.X0.f2(w0Var2, ((TLRPC.TL_messageActionGiftCode) this.f19697c).slug);
                return;
            case 5:
                ((t1) this.f19696b).O0.draw((Canvas) this.f19697c);
                return;
            case 6:
                ((t1) this.f19696b).post(new b1(8, (t1) this.f19697c));
                return;
            case 7:
                n8 n8Var = (n8) this.f19696b;
                TLRPC.Document document = (TLRPC.Document) this.f19697c;
                if (n8Var.f19577r.documents.isEmpty()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = n8Var.f19577r;
                    if (tL_messages_stickerSet.set.thumb_document_id == document.f17201id) {
                        tL_messages_stickerSet.documents.add(document);
                        n8Var.d(n8Var.f19577r, n8Var.f19575f, n8Var.f19578s);
                        return;
                    }
                    return;
                }
                return;
            default:
                ((ra) this.f19696b).v1((org.telegram.ui.ActionBar.i6) this.f19697c);
                return;
        }
    }
}
