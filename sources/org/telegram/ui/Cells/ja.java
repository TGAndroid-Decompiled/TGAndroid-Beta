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
    public final int f23034a;
    public final Object f23035b;
    public final Object f23036c;

    public ja(int i10, Object obj, Object obj2) {
        this.f23034a = i10;
        this.f23035b = obj;
        this.f23036c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f23034a) {
            case 0:
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) this.f23035b;
                TLObject tLObject = (TLObject) this.f23036c;
                la laVar = themesHorizontalListCell$InnerThemeView.U;
                if (tLObject instanceof TLRPC.TL_wallPaper) {
                    TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject;
                    String attachFileName = FileLoader.getAttachFileName(wallPaper.document);
                    if (!laVar.W2.containsKey(attachFileName)) {
                        laVar.W2.put(attachFileName, themesHorizontalListCell$InnerThemeView.f22521b);
                        FileLoader.getInstance(themesHorizontalListCell$InnerThemeView.f22521b.B).loadFile(wallPaper.document, wallPaper, 1, 1);
                        return;
                    }
                    return;
                }
                themesHorizontalListCell$InnerThemeView.f22521b.f21514f = true;
                return;
            case 1:
                o0 o0Var = (o0) this.f23035b;
                n0 n0Var = (n0) this.f23036c;
                t1 t1Var = o0Var.f23250a;
                n0 n0Var2 = o0Var.F;
                if (n0Var == n0Var2) {
                    n0Var2.f23202n.c(false);
                    n0 n0Var3 = o0Var.F;
                    if (n0Var3.f23196g) {
                        if (t1Var.getDelegate() != null) {
                            t1Var.getDelegate().G2();
                        }
                    } else {
                        TLObject tLObject2 = n0Var3.f23203o;
                        t1 t1Var2 = o0Var.f23250a;
                        if (t1Var2.getDelegate() != null) {
                            t1Var2.getDelegate().F0(t1Var2, tLObject2, true);
                        }
                    }
                }
                o0Var.F = null;
                o0Var.G = null;
                o0Var.B = false;
                o0Var.A = false;
                o0Var.f23271y.c(false);
                VelocityTracker velocityTracker = o0Var.D;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    o0Var.D = null;
                    return;
                }
                return;
            case 2:
                final v0 v0Var = (v0) this.f23035b;
                final org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.f23036c;
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
                qc.a0((org.telegram.ui.ActionBar.p2) this.f23035b).d0((TLRPC.TL_error) this.f23036c, false);
                return;
            case 4:
                v0 v0Var2 = (v0) this.f23035b;
                v0Var2.U0.r2(v0Var2, ((TLRPC.TL_messageActionGiftCode) this.f23036c).slug);
                return;
            case 5:
                ((t1) this.f23035b).L0.draw((Canvas) this.f23036c);
                return;
            case 6:
                ((t1) this.f23035b).post(new a1(8, (t1) this.f23036c));
                return;
            case 7:
                k8 k8Var = (k8) this.f23035b;
                TLRPC.Document document = (TLRPC.Document) this.f23036c;
                if (k8Var.f23079r.documents.isEmpty()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = k8Var.f23079r;
                    if (tL_messages_stickerSet.set.thumb_document_id == document.f20851id) {
                        tL_messages_stickerSet.documents.add(document);
                        k8Var.d(k8Var.f23079r, k8Var.f23077f, k8Var.f23080s);
                        return;
                    }
                    return;
                }
                return;
            default:
                ((la) this.f23035b).v1((org.telegram.ui.ActionBar.j6) this.f23036c);
                return;
        }
    }
}
