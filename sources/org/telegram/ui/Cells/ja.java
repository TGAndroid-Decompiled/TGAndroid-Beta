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
public final class ja implements Runnable {
    public final int f23032a;
    public final Object f23033b;
    public final Object f23034c;

    public ja(int i10, Object obj, Object obj2) {
        this.f23032a = i10;
        this.f23033b = obj;
        this.f23034c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f23032a) {
            case 0:
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) this.f23033b;
                TLObject tLObject = (TLObject) this.f23034c;
                la laVar = themesHorizontalListCell$InnerThemeView.U;
                if (tLObject instanceof TLRPC.TL_wallPaper) {
                    TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject;
                    String attachFileName = FileLoader.getAttachFileName(wallPaper.document);
                    if (!laVar.W2.containsKey(attachFileName)) {
                        laVar.W2.put(attachFileName, themesHorizontalListCell$InnerThemeView.f22519b);
                        FileLoader.getInstance(themesHorizontalListCell$InnerThemeView.f22519b.B).loadFile(wallPaper.document, wallPaper, 1, 1);
                        return;
                    }
                    return;
                }
                themesHorizontalListCell$InnerThemeView.f22519b.f21512f = true;
                return;
            case 1:
                o0 o0Var = (o0) this.f23033b;
                n0 n0Var = (n0) this.f23034c;
                t1 t1Var = o0Var.f23248a;
                n0 n0Var2 = o0Var.F;
                if (n0Var == n0Var2) {
                    n0Var2.f23200n.c(false);
                    n0 n0Var3 = o0Var.F;
                    if (n0Var3.f23194g) {
                        if (t1Var.getDelegate() != null) {
                            t1Var.getDelegate().G2();
                        }
                    } else {
                        TLObject tLObject2 = n0Var3.f23201o;
                        t1 t1Var2 = o0Var.f23248a;
                        if (t1Var2.getDelegate() != null) {
                            t1Var2.getDelegate().F0(t1Var2, tLObject2, true);
                        }
                    }
                }
                o0Var.F = null;
                o0Var.G = null;
                o0Var.B = false;
                o0Var.A = false;
                o0Var.f23269y.c(false);
                VelocityTracker velocityTracker = o0Var.D;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    o0Var.D = null;
                    return;
                }
                return;
            case 2:
                final v0 v0Var = (v0) this.f23033b;
                final org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.f23034c;
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
                            AndroidUtilities.runOnUIThread(new ja(3, p2Var, tL_error));
                        }
                    }
                });
                return;
            case 3:
                qc.a0((org.telegram.ui.ActionBar.p2) this.f23033b).d0((TLRPC.TL_error) this.f23034c, false);
                return;
            case 4:
                v0 v0Var2 = (v0) this.f23033b;
                v0Var2.U0.r2(v0Var2, ((TLRPC.TL_messageActionGiftCode) this.f23034c).slug);
                return;
            case 5:
                ((t1) this.f23033b).L0.draw((Canvas) this.f23034c);
                return;
            case 6:
                ((t1) this.f23033b).post(new a1(8, (t1) this.f23034c));
                return;
            case 7:
                k8 k8Var = (k8) this.f23033b;
                TLRPC.Document document = (TLRPC.Document) this.f23034c;
                if (k8Var.f23077r.documents.isEmpty()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = k8Var.f23077r;
                    if (tL_messages_stickerSet.set.thumb_document_id == document.f20849id) {
                        tL_messages_stickerSet.documents.add(document);
                        k8Var.d(k8Var.f23077r, k8Var.f23075f, k8Var.f23078s);
                        return;
                    }
                    return;
                }
                return;
            default:
                ((la) this.f23033b).w1((org.telegram.ui.ActionBar.j6) this.f23034c);
                return;
        }
    }
}
