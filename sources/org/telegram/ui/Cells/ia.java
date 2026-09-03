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
import org.telegram.ui.Components.qc;
public final class ia implements Runnable {
    public final int f21196a;
    public final Object f21197b;
    public final Object f21198c;

    public ia(int i10, Object obj, Object obj2) {
        this.f21196a = i10;
        this.f21197b = obj;
        this.f21198c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f21196a) {
            case 0:
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) this.f21197b;
                TLObject tLObject = (TLObject) this.f21198c;
                ka kaVar = themesHorizontalListCell$InnerThemeView.U;
                if (tLObject instanceof TLRPC.TL_wallPaper) {
                    TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject;
                    String attachFileName = FileLoader.getAttachFileName(wallPaper.document);
                    if (!kaVar.W2.containsKey(attachFileName)) {
                        kaVar.W2.put(attachFileName, themesHorizontalListCell$InnerThemeView.f20775b);
                        FileLoader.getInstance(themesHorizontalListCell$InnerThemeView.f20775b.B).loadFile(wallPaper.document, wallPaper, 1, 1);
                        return;
                    }
                    return;
                }
                themesHorizontalListCell$InnerThemeView.f20775b.f19788f = true;
                return;
            case 1:
                o0 o0Var = (o0) this.f21197b;
                n0 n0Var = (n0) this.f21198c;
                s1 s1Var = o0Var.f21455a;
                n0 n0Var2 = o0Var.F;
                if (n0Var == n0Var2) {
                    n0Var2.f21399n.c(false);
                    n0 n0Var3 = o0Var.F;
                    if (n0Var3.f21393g) {
                        if (s1Var.getDelegate() != null) {
                            s1Var.getDelegate().B2();
                        }
                    } else {
                        TLObject tLObject2 = n0Var3.f21400o;
                        s1 s1Var2 = o0Var.f21455a;
                        if (s1Var2.getDelegate() != null) {
                            s1Var2.getDelegate().F0(s1Var2, tLObject2, true);
                        }
                    }
                }
                o0Var.F = null;
                o0Var.G = null;
                o0Var.B = false;
                o0Var.A = false;
                o0Var.f21475y.c(false);
                VelocityTracker velocityTracker = o0Var.D;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    o0Var.D = null;
                    return;
                }
                return;
            case 2:
                final v0 v0Var = (v0) this.f21197b;
                final org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.f21198c;
                TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
                tL_resolveStarGiftOffer.offer_msg_id = v0Var.getMessageObject().getId();
                tL_resolveStarGiftOffer.decline = true;
                ConnectionsManager.getInstance(v0Var.E).sendRequestTyped(tL_resolveStarGiftOffer, new Utilities.Callback2() {
                    @Override
                    public final void run(Object obj, Object obj2) {
                        TLRPC.Updates updates = (TLRPC.Updates) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        if (updates != null) {
                            MessagesController.getInstance(v0.this.E).processUpdates(updates, false);
                        }
                        if (tL_error != null) {
                            AndroidUtilities.runOnUIThread(new ia(3, p2Var, tL_error));
                        }
                    }
                });
                return;
            case 3:
                qc.a0((org.telegram.ui.ActionBar.p2) this.f21197b).d0((TLRPC.TL_error) this.f21198c, false);
                return;
            case 4:
                v0 v0Var2 = (v0) this.f21197b;
                v0Var2.U0.m2(v0Var2, ((TLRPC.TL_messageActionGiftCode) this.f21198c).slug);
                return;
            case 5:
                ((s1) this.f21197b).L0.draw((Canvas) this.f21198c);
                return;
            case 6:
                ((s1) this.f21197b).post(new a1(8, (s1) this.f21198c));
                return;
            case 7:
                j8 j8Var = (j8) this.f21197b;
                TLRPC.Document document = (TLRPC.Document) this.f21198c;
                if (j8Var.f21241r.documents.isEmpty()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = j8Var.f21241r;
                    if (tL_messages_stickerSet.set.thumb_document_id == document.f19165id) {
                        tL_messages_stickerSet.documents.add(document);
                        j8Var.d(j8Var.f21241r, j8Var.f21239f, j8Var.f21242s);
                        return;
                    }
                    return;
                }
                return;
            default:
                ((ka) this.f21197b).v1((org.telegram.ui.ActionBar.i6) this.f21198c);
                return;
        }
    }
}
