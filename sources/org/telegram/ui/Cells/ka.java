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
public final class ka implements Runnable {
    public final int f22520a;
    public final Object f22521b;
    public final Object f22522c;

    public ka(int i10, Object obj, Object obj2) {
        this.f22520a = i10;
        this.f22521b = obj;
        this.f22522c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f22520a) {
            case 0:
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) this.f22521b;
                TLObject tLObject = (TLObject) this.f22522c;
                ma maVar = themesHorizontalListCell$InnerThemeView.f21945a0;
                if (tLObject instanceof TLRPC.TL_wallPaper) {
                    TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject;
                    String attachFileName = FileLoader.getAttachFileName(wallPaper.document);
                    if (!maVar.X2.containsKey(attachFileName)) {
                        maVar.X2.put(attachFileName, themesHorizontalListCell$InnerThemeView.f21946b);
                        FileLoader.getInstance(themesHorizontalListCell$InnerThemeView.f21946b.E).loadFile(wallPaper.document, wallPaper, 1, 1);
                        return;
                    }
                    return;
                }
                themesHorizontalListCell$InnerThemeView.f21946b.f20893f = true;
                return;
            case 1:
                o0 o0Var = (o0) this.f22521b;
                n0 n0Var = (n0) this.f22522c;
                u1 u1Var = o0Var.f22678a;
                n0 n0Var2 = o0Var.F;
                if (n0Var == n0Var2) {
                    n0Var2.f22638n.c(false);
                    n0 n0Var3 = o0Var.F;
                    if (n0Var3.f22632g) {
                        if (u1Var.getDelegate() != null) {
                            u1Var.getDelegate().n2();
                        }
                    } else {
                        TLObject tLObject2 = n0Var3.f22639o;
                        u1 u1Var2 = o0Var.f22678a;
                        if (u1Var2.getDelegate() != null) {
                            u1Var2.getDelegate().z0(u1Var2, tLObject2, true);
                        }
                    }
                }
                o0Var.F = null;
                o0Var.G = null;
                o0Var.B = false;
                o0Var.A = false;
                o0Var.f22698y.c(false);
                VelocityTracker velocityTracker = o0Var.D;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    o0Var.D = null;
                    return;
                }
                return;
            case 2:
                w0 w0Var = (w0) this.f22521b;
                w0Var.f23701f1.X1(w0Var, ((TLRPC.TL_messageActionGiftCode) this.f22522c).slug);
                return;
            case 3:
                final w0 w0Var2 = (w0) this.f22521b;
                final org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f22522c;
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
                            AndroidUtilities.runOnUIThread(new ka(4, n2Var, tL_error));
                        }
                    }
                });
                return;
            case 4:
                xc.a0((org.telegram.ui.ActionBar.n2) this.f22521b).f0((TLRPC.TL_error) this.f22522c, false);
                return;
            case 5:
                ((u1) this.f22521b).O0.draw((Canvas) this.f22522c);
                return;
            case 6:
                ((u1) this.f22521b).post(new b1(8, (u1) this.f22522c));
                return;
            case 7:
                l8 l8Var = (l8) this.f22521b;
                TLRPC.Document document = (TLRPC.Document) this.f22522c;
                if (l8Var.f22548r.documents.isEmpty()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = l8Var.f22548r;
                    if (tL_messages_stickerSet.set.thumb_document_id == document.f20286id) {
                        tL_messages_stickerSet.documents.add(document);
                        l8Var.d(l8Var.f22548r, l8Var.f22546f, l8Var.f22549s);
                        return;
                    }
                    return;
                }
                return;
            default:
                ((ma) this.f22521b).x1((org.telegram.ui.ActionBar.g6) this.f22522c);
                return;
        }
    }
}
