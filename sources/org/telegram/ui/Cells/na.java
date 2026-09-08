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
import org.telegram.ui.Components.yc;
public final class na implements Runnable {
    public final int f22398a;
    public final Object f22399b;
    public final Object f22400c;

    public na(int i10, Object obj, Object obj2) {
        this.f22398a = i10;
        this.f22399b = obj;
        this.f22400c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f22398a) {
            case 0:
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) this.f22399b;
                TLObject tLObject = (TLObject) this.f22400c;
                pa paVar = themesHorizontalListCell$InnerThemeView.f21606a0;
                if (tLObject instanceof TLRPC.TL_wallPaper) {
                    TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject;
                    String attachFileName = FileLoader.getAttachFileName(wallPaper.document);
                    if (!paVar.Z2.containsKey(attachFileName)) {
                        paVar.Z2.put(attachFileName, themesHorizontalListCell$InnerThemeView.f21607b);
                        FileLoader.getInstance(themesHorizontalListCell$InnerThemeView.f21607b.E).loadFile(wallPaper.document, wallPaper, 1, 1);
                        return;
                    }
                    return;
                }
                themesHorizontalListCell$InnerThemeView.f21607b.f20576f = true;
                return;
            case 1:
                o0 o0Var = (o0) this.f22399b;
                n0 n0Var = (n0) this.f22400c;
                t1 t1Var = o0Var.f22407a;
                n0 n0Var2 = o0Var.F;
                if (n0Var == n0Var2) {
                    n0Var2.f22353n.c(false);
                    n0 n0Var3 = o0Var.F;
                    if (n0Var3.f22347g) {
                        if (t1Var.getDelegate() != null) {
                            t1Var.getDelegate().o2();
                        }
                    } else {
                        TLObject tLObject2 = n0Var3.f22354o;
                        t1 t1Var2 = o0Var.f22407a;
                        if (t1Var2.getDelegate() != null) {
                            t1Var2.getDelegate().x0(t1Var2, tLObject2, true);
                        }
                    }
                }
                o0Var.F = null;
                o0Var.G = null;
                o0Var.B = false;
                o0Var.A = false;
                o0Var.f22428y.c(false);
                VelocityTracker velocityTracker = o0Var.D;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    o0Var.D = null;
                    return;
                }
                return;
            case 2:
                final w0 w0Var = (w0) this.f22399b;
                final org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f22400c;
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
                            AndroidUtilities.runOnUIThread(new na(3, n2Var, tL_error));
                        }
                    }
                });
                return;
            case 3:
                yc.a0((org.telegram.ui.ActionBar.n2) this.f22399b).d0((TLRPC.TL_error) this.f22400c, false);
                return;
            case 4:
                w0 w0Var2 = (w0) this.f22399b;
                w0Var2.X0.Z1(w0Var2, ((TLRPC.TL_messageActionGiftCode) this.f22400c).slug);
                return;
            case 5:
                ((t1) this.f22399b).O0.draw((Canvas) this.f22400c);
                return;
            case 6:
                ((t1) this.f22399b).post(new b1(8, (t1) this.f22400c));
                return;
            case 7:
                m8 m8Var = (m8) this.f22399b;
                TLRPC.Document document = (TLRPC.Document) this.f22400c;
                if (m8Var.f22327r.documents.isEmpty()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = m8Var.f22327r;
                    if (tL_messages_stickerSet.set.thumb_document_id == document.f19902id) {
                        tL_messages_stickerSet.documents.add(document);
                        m8Var.d(m8Var.f22327r, m8Var.f22325f, m8Var.f22328s);
                        return;
                    }
                    return;
                }
                return;
            default:
                ((pa) this.f22399b).v1((org.telegram.ui.ActionBar.i6) this.f22400c);
                return;
        }
    }
}
