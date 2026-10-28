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
    public final int f24784a;
    public final Object f24785b;
    public final Object f24786c;

    public pa(int i10, Object obj, Object obj2) {
        this.f24784a = i10;
        this.f24785b = obj;
        this.f24786c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f24784a) {
            case 0:
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) this.f24785b;
                TLObject tLObject = (TLObject) this.f24786c;
                ra raVar = themesHorizontalListCell$InnerThemeView.f23826a0;
                if (tLObject instanceof TLRPC.TL_wallPaper) {
                    TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject;
                    String attachFileName = FileLoader.getAttachFileName(wallPaper.document);
                    if (!raVar.f25003h3.containsKey(attachFileName)) {
                        raVar.f25003h3.put(attachFileName, themesHorizontalListCell$InnerThemeView.f23827b);
                        FileLoader.getInstance(themesHorizontalListCell$InnerThemeView.f23827b.E).loadFile(wallPaper.document, wallPaper, 1, 1);
                        return;
                    }
                    return;
                }
                themesHorizontalListCell$InnerThemeView.f23827b.f23260f = true;
                return;
            case 1:
                n0 n0Var = (n0) this.f24785b;
                m0 m0Var = (m0) this.f24786c;
                s1 s1Var = n0Var.f24500a;
                m0 m0Var2 = n0Var.F;
                if (m0Var == m0Var2) {
                    m0Var2.f24418n.c(false);
                    m0 m0Var3 = n0Var.F;
                    if (m0Var3.f24412g) {
                        if (s1Var.getDelegate() != null) {
                            s1Var.getDelegate().Z1();
                        }
                    } else {
                        TLObject tLObject2 = m0Var3.f24419o;
                        s1 s1Var2 = n0Var.f24500a;
                        if (s1Var2.getDelegate() != null) {
                            s1Var2.getDelegate().t0(s1Var2, tLObject2, true);
                        }
                    }
                }
                n0Var.F = null;
                n0Var.G = null;
                n0Var.B = false;
                n0Var.A = false;
                n0Var.f24520y.c(false);
                VelocityTracker velocityTracker = n0Var.D;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    n0Var.D = null;
                    return;
                }
                return;
            case 2:
                v0 v0Var = (v0) this.f24785b;
                v0Var.f25518f1.H0(v0Var, ((TLRPC.TL_messageActionGiftCode) this.f24786c).slug);
                return;
            case 3:
                final v0 v0Var2 = (v0) this.f24785b;
                final org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) this.f24786c;
                TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
                tL_resolveStarGiftOffer.offer_msg_id = v0Var2.getMessageObject().getId();
                tL_resolveStarGiftOffer.decline = true;
                ConnectionsManager.getInstance(v0Var2.H).sendRequestTyped(tL_resolveStarGiftOffer, new Utilities.Callback2() {
                    @Override
                    public final void run(Object obj, Object obj2) {
                        TLRPC.Updates updates = (TLRPC.Updates) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        if (updates != null) {
                            MessagesController.getInstance(v0.this.H).lambda$processUpdates$379(updates, false);
                        }
                        if (tL_error != null) {
                            AndroidUtilities.runOnUIThread(new pa(4, r2Var, tL_error));
                        }
                    }
                });
                return;
            case 4:
                wc.b0((org.telegram.ui.ActionBar.r2) this.f24785b).g0((TLRPC.TL_error) this.f24786c, false);
                return;
            case 5:
                ((s1) this.f24785b).O0.draw((Canvas) this.f24786c);
                return;
            case 6:
                ((s1) this.f24785b).post(new a1(8, (s1) this.f24786c));
                return;
            case 7:
                p8 p8Var = (p8) this.f24785b;
                TLRPC.Document document = (TLRPC.Document) this.f24786c;
                if (p8Var.f24777r.documents.isEmpty()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = p8Var.f24777r;
                    if (tL_messages_stickerSet.set.thumb_document_id == document.f22034id) {
                        tL_messages_stickerSet.documents.add(document);
                        p8Var.d(p8Var.f24777r, p8Var.f24775f, p8Var.f24778s);
                        return;
                    }
                    return;
                }
                return;
            default:
                ((ra) this.f24785b).C1((org.telegram.ui.ActionBar.x6) this.f24786c);
                return;
        }
    }
}
