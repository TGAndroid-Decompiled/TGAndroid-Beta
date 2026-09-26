package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class lx extends a71 {
    public final r61[] f35426d2;
    public final qy f35427e2;

    public lx(qy qyVar, qy qyVar2, Activity activity, Integer num, org.telegram.ui.ActionBar.d6 d6Var, r61[] r61VarArr) {
        super(qyVar2, activity, true, num, 0, d6Var);
        this.f35427e2 = qyVar;
        this.f35426d2 = r61VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique != null) {
            i10 = ((org.telegram.ui.ActionBar.m2) this.f35427e2).currentAccount;
            if (yh.s5.y(i10, false).n(tL_starGiftUnique.f18560id) != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        TLRPC.TL_emojiStatus tL_emojiStatus;
        TLRPC.EmojiStatus emojiStatus;
        int i10;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.d6 d6Var;
        r61[] r61VarArr = this.f35426d2;
        qy qyVar = this.f35427e2;
        if (l4 == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            if (tL_starGiftUnique != null) {
                i10 = ((org.telegram.ui.ActionBar.m2) qyVar).currentAccount;
                TL_stars.SavedStarGift n10 = yh.s5.y(i10, false).n(tL_starGiftUnique.f18560id);
                if (n10 != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                    MessagesController.getGlobalMainSettings().edit().putInt("statusgiftpage", MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) + 1).apply();
                    Context context = getContext();
                    i11 = ((org.telegram.ui.ActionBar.m2) qyVar).currentAccount;
                    i12 = ((org.telegram.ui.ActionBar.m2) qyVar).currentAccount;
                    long clientUserId = UserConfig.getInstance(i12).getClientUserId();
                    d6Var = ((org.telegram.ui.ActionBar.m2) qyVar).resourceProvider;
                    yh.x3 x3Var = new yh.x3(context, i11, clientUserId, d6Var, null);
                    x3Var.j2(n10, null);
                    x3Var.m2();
                    x3Var.show();
                    r61 r61Var = r61VarArr[0];
                    if (r61Var != null) {
                        qyVar.M0 = null;
                        r61Var.dismiss();
                        return;
                    }
                    return;
                }
                TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
                tL_inputEmojiStatusCollectible.collectible_id = tL_starGiftUnique.f18560id;
                tL_emojiStatus = tL_inputEmojiStatusCollectible;
                if (num != null) {
                    tL_inputEmojiStatusCollectible.flags |= 1;
                    tL_inputEmojiStatusCollectible.until = num.intValue();
                    tL_emojiStatus = tL_inputEmojiStatusCollectible;
                }
            } else {
                TLRPC.TL_emojiStatus tL_emojiStatus2 = new TLRPC.TL_emojiStatus();
                tL_emojiStatus2.document_id = l4.longValue();
                tL_emojiStatus = tL_emojiStatus2;
                if (num != null) {
                    tL_emojiStatus2.flags |= 1;
                    tL_emojiStatus2.until = num.intValue();
                    tL_emojiStatus = tL_emojiStatus2;
                }
            }
            emojiStatus = tL_emojiStatus;
        }
        qyVar.getMessagesController().updateEmojiStatus(emojiStatus, tL_starGiftUnique);
        if (l4 != null) {
            org.telegram.ui.Cells.o oVar = qyVar.E3;
            ?? obj = new Object();
            long longValue = l4.longValue();
            obj.f49396g = longValue;
            obj.h = longValue;
            oVar.a(obj);
        }
        r61 r61Var2 = r61VarArr[0];
        if (r61Var2 != null) {
            qyVar.M0 = null;
            r61Var2.dismiss();
        }
    }
}
