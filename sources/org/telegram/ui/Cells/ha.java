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
import org.telegram.ui.Components.tc;
public final class ha implements Runnable {
    public final int f24466a;
    public final Object f24467b;
    public final Object f24468c;

    public ha(int i10, Object obj, Object obj2) {
        this.f24466a = i10;
        this.f24467b = obj;
        this.f24468c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f24466a) {
            case 0:
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) this.f24467b;
                TLObject tLObject = (TLObject) this.f24468c;
                ja jaVar = themesHorizontalListCell$InnerThemeView.T;
                if (tLObject instanceof TLRPC.TL_wallPaper) {
                    TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject;
                    String attachFileName = FileLoader.getAttachFileName(wallPaper.document);
                    if (!jaVar.V2.containsKey(attachFileName)) {
                        jaVar.V2.put(attachFileName, themesHorizontalListCell$InnerThemeView.f24049b);
                        FileLoader.getInstance(themesHorizontalListCell$InnerThemeView.f24049b.A).loadFile(wallPaper.document, wallPaper, 1, 1);
                        return;
                    }
                    return;
                }
                themesHorizontalListCell$InnerThemeView.f24049b.f22950f = true;
                return;
            case 1:
                o0 o0Var = (o0) this.f24467b;
                n0 n0Var = (n0) this.f24468c;
                s1 s1Var = o0Var.f24767a;
                n0 n0Var2 = o0Var.F;
                if (n0Var == n0Var2) {
                    n0Var2.f24740n.c(false);
                    n0 n0Var3 = o0Var.F;
                    if (n0Var3.f24734g) {
                        if (s1Var.getDelegate() != null) {
                            s1Var.getDelegate().w2();
                        }
                    } else {
                        TLObject tLObject2 = n0Var3.f24741o;
                        s1 s1Var2 = o0Var.f24767a;
                        if (s1Var2.getDelegate() != null) {
                            s1Var2.getDelegate().A0(s1Var2, tLObject2, true);
                        }
                    }
                }
                o0Var.F = null;
                o0Var.G = null;
                o0Var.B = false;
                o0Var.A = false;
                o0Var.f24788y.c(false);
                VelocityTracker velocityTracker = o0Var.D;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    o0Var.D = null;
                    return;
                }
                return;
            case 2:
                final v0 v0Var = (v0) this.f24467b;
                final org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f24468c;
                TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
                tL_resolveStarGiftOffer.offer_msg_id = v0Var.getMessageObject().getId();
                tL_resolveStarGiftOffer.decline = true;
                ConnectionsManager.getInstance(v0Var.D).sendRequestTyped(tL_resolveStarGiftOffer, new Utilities.Callback2() {
                    @Override
                    public final void run(Object obj, Object obj2) {
                        TLRPC.Updates updates = (TLRPC.Updates) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        if (updates != null) {
                            MessagesController.getInstance(v0.this.D).processUpdates(updates, false);
                        }
                        if (tL_error != null) {
                            AndroidUtilities.runOnUIThread(new ha(3, o2Var, tL_error));
                        }
                    }
                });
                return;
            case 3:
                tc.a0((org.telegram.ui.ActionBar.o2) this.f24467b).d0((TLRPC.TL_error) this.f24468c, false);
                return;
            case 4:
                v0 v0Var2 = (v0) this.f24467b;
                v0Var2.T0.h2(v0Var2, ((TLRPC.TL_messageActionGiftCode) this.f24468c).slug);
                return;
            case 5:
                ((s1) this.f24467b).K0.draw((Canvas) this.f24468c);
                return;
            case 6:
                ((s1) this.f24467b).post(new a1(8, (s1) this.f24468c));
                return;
            case 7:
                i8 i8Var = (i8) this.f24467b;
                TLRPC.Document document = (TLRPC.Document) this.f24468c;
                if (i8Var.f24508r.documents.isEmpty()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = i8Var.f24508r;
                    if (tL_messages_stickerSet.set.thumb_document_id == document.f22398id) {
                        tL_messages_stickerSet.documents.add(document);
                        i8Var.d(i8Var.f24508r, i8Var.f24506f, i8Var.f24509s);
                        return;
                    }
                    return;
                }
                return;
            default:
                ((ja) this.f24467b).w1((org.telegram.ui.ActionBar.f6) this.f24468c);
                return;
        }
    }
}
