package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class px extends g71 {
    public final x61[] f36711d2;
    public final uy f36712e2;

    public px(uy uyVar, uy uyVar2, Activity activity, Integer num, org.telegram.ui.ActionBar.e6 e6Var, x61[] x61VarArr) {
        super(uyVar2, activity, true, num, 0, e6Var);
        this.f36712e2 = uyVar;
        this.f36711d2 = x61VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique != null) {
            i10 = ((org.telegram.ui.ActionBar.n2) this.f36712e2).currentAccount;
            if (yh.v5.y(i10, false).n(tL_starGiftUnique.f18338id) != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
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
        org.telegram.ui.ActionBar.e6 e6Var;
        x61[] x61VarArr = this.f36711d2;
        uy uyVar = this.f36712e2;
        if (l4 == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            if (tL_starGiftUnique != null) {
                i10 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
                TL_stars.SavedStarGift n10 = yh.v5.y(i10, false).n(tL_starGiftUnique.f18338id);
                if (n10 != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                    MessagesController.getGlobalMainSettings().edit().putInt("statusgiftpage", MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) + 1).apply();
                    Context context = getContext();
                    i11 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
                    i12 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
                    long clientUserId = UserConfig.getInstance(i12).getClientUserId();
                    e6Var = ((org.telegram.ui.ActionBar.n2) uyVar).resourceProvider;
                    yh.a4 a4Var = new yh.a4(context, i11, clientUserId, e6Var, null);
                    a4Var.j2(n10, null);
                    a4Var.m2();
                    a4Var.show();
                    x61 x61Var = x61VarArr[0];
                    if (x61Var != null) {
                        uyVar.M0 = null;
                        x61Var.dismiss();
                        return;
                    }
                    return;
                }
                TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
                tL_inputEmojiStatusCollectible.collectible_id = tL_starGiftUnique.f18338id;
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
        uyVar.getMessagesController().updateEmojiStatus(emojiStatus, tL_starGiftUnique);
        if (l4 != null) {
            org.telegram.ui.Cells.o oVar = uyVar.E3;
            ?? obj = new Object();
            long longValue = l4.longValue();
            obj.f49128g = longValue;
            obj.h = longValue;
            oVar.a(obj);
        }
        x61 x61Var2 = x61VarArr[0];
        if (x61Var2 != null) {
            uyVar.M0 = null;
            x61Var2.dismiss();
        }
    }
}
