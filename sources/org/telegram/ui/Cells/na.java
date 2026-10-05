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
    public final int f22566a;
    public final Object f22567b;
    public final Object f22568c;

    public na(int i10, Object obj, Object obj2) {
        this.f22566a = i10;
        this.f22567b = obj;
        this.f22568c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f22566a) {
            case 0:
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) this.f22567b;
                TLObject tLObject = (TLObject) this.f22568c;
                pa paVar = themesHorizontalListCell$InnerThemeView.f21765a0;
                if (tLObject instanceof TLRPC.TL_wallPaper) {
                    TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject;
                    String attachFileName = FileLoader.getAttachFileName(wallPaper.document);
                    if (!paVar.f22670g3.containsKey(attachFileName)) {
                        paVar.f22670g3.put(attachFileName, themesHorizontalListCell$InnerThemeView.f21766b);
                        FileLoader.getInstance(themesHorizontalListCell$InnerThemeView.f21766b.E).loadFile(wallPaper.document, wallPaper, 1, 1);
                        return;
                    }
                    return;
                }
                themesHorizontalListCell$InnerThemeView.f21766b.f20706f = true;
                return;
            case 1:
                o0 o0Var = (o0) this.f22567b;
                n0 n0Var = (n0) this.f22568c;
                u1 u1Var = o0Var.f22575a;
                n0 n0Var2 = o0Var.F;
                if (n0Var == n0Var2) {
                    n0Var2.f22511n.c(false);
                    n0 n0Var3 = o0Var.F;
                    if (n0Var3.f22505g) {
                        if (u1Var.getDelegate() != null) {
                            u1Var.getDelegate().x2();
                        }
                    } else {
                        TLObject tLObject2 = n0Var3.f22512o;
                        u1 u1Var2 = o0Var.f22575a;
                        if (u1Var2.getDelegate() != null) {
                            u1Var2.getDelegate().A0(u1Var2, tLObject2, true);
                        }
                    }
                }
                o0Var.F = null;
                o0Var.G = null;
                o0Var.B = false;
                o0Var.A = false;
                o0Var.f22596y.c(false);
                VelocityTracker velocityTracker = o0Var.D;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    o0Var.D = null;
                    return;
                }
                return;
            case 2:
                final w0 w0Var = (w0) this.f22567b;
                final org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f22568c;
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
                yc.a0((org.telegram.ui.ActionBar.n2) this.f22567b).d0((TLRPC.TL_error) this.f22568c, false);
                return;
            case 4:
                w0 w0Var2 = (w0) this.f22567b;
                w0Var2.X0.h2(w0Var2, ((TLRPC.TL_messageActionGiftCode) this.f22568c).slug);
                return;
            case 5:
                ((u1) this.f22567b).O0.draw((Canvas) this.f22568c);
                return;
            case 6:
                ((u1) this.f22567b).post(new b1(8, (u1) this.f22568c));
                return;
            case 7:
                m8 m8Var = (m8) this.f22567b;
                TLRPC.Document document = (TLRPC.Document) this.f22568c;
                if (m8Var.f22485r.documents.isEmpty()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = m8Var.f22485r;
                    if (tL_messages_stickerSet.set.thumb_document_id == document.f20053id) {
                        tL_messages_stickerSet.documents.add(document);
                        m8Var.d(m8Var.f22485r, m8Var.f22483f, m8Var.f22486s);
                        return;
                    }
                    return;
                }
                return;
            default:
                ((pa) this.f22567b).x1((org.telegram.ui.ActionBar.h6) this.f22568c);
                return;
        }
    }
}
