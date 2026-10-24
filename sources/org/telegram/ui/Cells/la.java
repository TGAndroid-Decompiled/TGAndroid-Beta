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
public final class la implements Runnable {
    public final int f22697a;
    public final Object f22698b;
    public final Object f22699c;

    public la(int i10, Object obj, Object obj2) {
        this.f22697a = i10;
        this.f22698b = obj;
        this.f22699c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f22697a) {
            case 0:
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) this.f22698b;
                TLObject tLObject = (TLObject) this.f22699c;
                na naVar = themesHorizontalListCell$InnerThemeView.f22060a0;
                if (tLObject instanceof TLRPC.TL_wallPaper) {
                    TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject;
                    String attachFileName = FileLoader.getAttachFileName(wallPaper.document);
                    if (!naVar.f22820a3.containsKey(attachFileName)) {
                        naVar.f22820a3.put(attachFileName, themesHorizontalListCell$InnerThemeView.f22061b);
                        FileLoader.getInstance(themesHorizontalListCell$InnerThemeView.f22061b.E).loadFile(wallPaper.document, wallPaper, 1, 1);
                        return;
                    }
                    return;
                }
                themesHorizontalListCell$InnerThemeView.f22061b.f21028f = true;
                return;
            case 1:
                n0 n0Var = (n0) this.f22698b;
                m0 m0Var = (m0) this.f22699c;
                t1 t1Var = n0Var.f22745a;
                m0 m0Var2 = n0Var.F;
                if (m0Var == m0Var2) {
                    m0Var2.f22714n.c(false);
                    m0 m0Var3 = n0Var.F;
                    if (m0Var3.f22708g) {
                        if (t1Var.getDelegate() != null) {
                            t1Var.getDelegate().n2();
                        }
                    } else {
                        TLObject tLObject2 = m0Var3.f22715o;
                        t1 t1Var2 = n0Var.f22745a;
                        if (t1Var2.getDelegate() != null) {
                            t1Var2.getDelegate().z0(t1Var2, tLObject2, true);
                        }
                    }
                }
                n0Var.F = null;
                n0Var.G = null;
                n0Var.B = false;
                n0Var.A = false;
                n0Var.f22765y.c(false);
                VelocityTracker velocityTracker = n0Var.D;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    n0Var.D = null;
                    return;
                }
                return;
            case 2:
                v0 v0Var = (v0) this.f22698b;
                v0Var.f23772f1.X1(v0Var, ((TLRPC.TL_messageActionGiftCode) this.f22699c).slug);
                return;
            case 3:
                final v0 v0Var2 = (v0) this.f22698b;
                final org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f22699c;
                TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
                tL_resolveStarGiftOffer.offer_msg_id = v0Var2.getMessageObject().getId();
                tL_resolveStarGiftOffer.decline = true;
                ConnectionsManager.getInstance(v0Var2.H).sendRequestTyped(tL_resolveStarGiftOffer, new Utilities.Callback2() {
                    @Override
                    public final void run(Object obj, Object obj2) {
                        TLRPC.Updates updates = (TLRPC.Updates) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        if (updates != null) {
                            MessagesController.getInstance(v0.this.H).lambda$processUpdates$377(updates, false);
                        }
                        if (tL_error != null) {
                            AndroidUtilities.runOnUIThread(new la(4, o2Var, tL_error));
                        }
                    }
                });
                return;
            case 4:
                vc.a0((org.telegram.ui.ActionBar.o2) this.f22698b).f0((TLRPC.TL_error) this.f22699c, false);
                return;
            case 5:
                ((t1) this.f22698b).O0.draw((Canvas) this.f22699c);
                return;
            case 6:
                ((t1) this.f22698b).post(new a1(8, (t1) this.f22699c));
                return;
            case 7:
                l8 l8Var = (l8) this.f22698b;
                TLRPC.Document document = (TLRPC.Document) this.f22699c;
                if (l8Var.f22690r.documents.isEmpty()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = l8Var.f22690r;
                    if (tL_messages_stickerSet.set.thumb_document_id == document.f20350id) {
                        tL_messages_stickerSet.documents.add(document);
                        l8Var.d(l8Var.f22690r, l8Var.f22688f, l8Var.f22691s);
                        return;
                    }
                    return;
                }
                return;
            default:
                ((na) this.f22698b).C1((org.telegram.ui.ActionBar.j6) this.f22699c);
                return;
        }
    }
}
