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
import org.telegram.ui.Components.oc;
public final class ka implements Runnable {
    public final int f24629a;
    public final Object f24630b;
    public final Object f24631c;

    public ka(int i9, Object obj, Object obj2) {
        this.f24629a = i9;
        this.f24630b = obj;
        this.f24631c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f24629a) {
            case 0:
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) this.f24630b;
                TLObject tLObject = (TLObject) this.f24631c;
                ma maVar = themesHorizontalListCell$InnerThemeView.T;
                if (tLObject instanceof TLRPC.TL_wallPaper) {
                    TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject;
                    String attachFileName = FileLoader.getAttachFileName(wallPaper.document);
                    if (!maVar.V2.containsKey(attachFileName)) {
                        maVar.V2.put(attachFileName, themesHorizontalListCell$InnerThemeView.f24029b);
                        FileLoader.getInstance(themesHorizontalListCell$InnerThemeView.f24029b.A).loadFile(wallPaper.document, wallPaper, 1, 1);
                        return;
                    }
                    return;
                }
                themesHorizontalListCell$InnerThemeView.f24029b.f22915f = true;
                return;
            case 1:
                o0 o0Var = (o0) this.f24630b;
                n0 n0Var = (n0) this.f24631c;
                t1 t1Var = o0Var.f24787a;
                n0 n0Var2 = o0Var.F;
                if (n0Var == n0Var2) {
                    n0Var2.f24741n.c(false);
                    n0 n0Var3 = o0Var.F;
                    if (n0Var3.f24735g) {
                        if (t1Var.getDelegate() != null) {
                            t1Var.getDelegate().o2();
                        }
                    } else {
                        TLObject tLObject2 = n0Var3.f24742o;
                        t1 t1Var2 = o0Var.f24787a;
                        if (t1Var2.getDelegate() != null) {
                            t1Var2.getDelegate().D0(t1Var2, tLObject2, true);
                        }
                    }
                }
                o0Var.F = null;
                o0Var.G = null;
                o0Var.B = false;
                o0Var.A = false;
                o0Var.f24808y.c(false);
                VelocityTracker velocityTracker = o0Var.D;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    o0Var.D = null;
                    return;
                }
                return;
            case 2:
                final w0 w0Var = (w0) this.f24630b;
                final org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f24631c;
                TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
                tL_resolveStarGiftOffer.offer_msg_id = w0Var.getMessageObject().getId();
                tL_resolveStarGiftOffer.decline = true;
                ConnectionsManager.getInstance(w0Var.D).sendRequestTyped(tL_resolveStarGiftOffer, new Utilities.Callback2() {
                    @Override
                    public final void run(Object obj, Object obj2) {
                        TLRPC.Updates updates = (TLRPC.Updates) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        if (updates != null) {
                            MessagesController.getInstance(w0.this.D).processUpdates(updates, false);
                        }
                        if (tL_error != null) {
                            AndroidUtilities.runOnUIThread(new ka(3, o2Var, tL_error));
                        }
                    }
                });
                return;
            case 3:
                oc.a0((org.telegram.ui.ActionBar.o2) this.f24630b).d0((TLRPC.TL_error) this.f24631c, false);
                return;
            case 4:
                w0 w0Var2 = (w0) this.f24630b;
                w0Var2.T0.N1(w0Var2, ((TLRPC.TL_messageActionGiftCode) this.f24631c).slug);
                return;
            case 5:
                ((t1) this.f24630b).K0.draw((Canvas) this.f24631c);
                return;
            case 6:
                ((t1) this.f24630b).post(new b1(8, (t1) this.f24631c));
                return;
            case 7:
                k8 k8Var = (k8) this.f24630b;
                TLRPC.Document document = (TLRPC.Document) this.f24631c;
                if (k8Var.f24622r.documents.isEmpty()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = k8Var.f24622r;
                    if (tL_messages_stickerSet.set.thumb_document_id == document.f22386id) {
                        tL_messages_stickerSet.documents.add(document);
                        k8Var.d(k8Var.f24622r, k8Var.f24620f, k8Var.f24623s);
                        return;
                    }
                    return;
                }
                return;
            default:
                ((ma) this.f24630b).w1((org.telegram.ui.ActionBar.e6) this.f24631c);
                return;
        }
    }
}
