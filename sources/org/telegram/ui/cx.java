package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

public final class cx extends a61 {
    public final r51[] Z1;
    public final gy a2;

    public cx(gy gyVar, gy gyVar2, Activity activity, Integer num, org.telegram.ui.ActionBar.c6 c6Var, r51[] r51VarArr) {
        super(gyVar2, activity, true, num, 0, c6Var);
        this.a2 = gyVar;
        this.Z1 = r51VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        return tL_starGiftUnique == null || hh.u7.y(((org.telegram.ui.ActionBar.n2) this.a2).currentAccount, false).n(tL_starGiftUnique.f22607id) == null || MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) >= 2;
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        TLRPC.TL_emojiStatus tL_emojiStatus;
        TLRPC.EmojiStatus emojiStatus;
        TLRPC.EmojiStatus tL_emojiStatusEmpty;
        r51[] r51VarArr = this.Z1;
        gy gyVar = this.a2;
        if (l10 == null) {
            tL_emojiStatusEmpty = new TLRPC.TL_emojiStatusEmpty();
        } else {
            if (tL_starGiftUnique != null) {
                TL_stars.SavedStarGift savedStarGiftN = hh.u7.y(((org.telegram.ui.ActionBar.n2) gyVar).currentAccount, false).n(tL_starGiftUnique.f22607id);
                if (savedStarGiftN != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                    MessagesController.getGlobalMainSettings().edit().putInt("statusgiftpage", MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) + 1).apply();
                    hh.i5 i5Var = new hh.i5(getContext(), ((org.telegram.ui.ActionBar.n2) gyVar).currentAccount, UserConfig.getInstance(((org.telegram.ui.ActionBar.n2) gyVar).currentAccount).getClientUserId(), ((org.telegram.ui.ActionBar.n2) gyVar).resourceProvider, null);
                    i5Var.j2(savedStarGiftN, null);
                    i5Var.m2();
                    i5Var.show();
                    r51 r51Var = r51VarArr[0];
                    if (r51Var != null) {
                        gyVar.I0 = null;
                        r51Var.dismiss();
                        return;
                    }
                    return;
                }
                TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
                tL_inputEmojiStatusCollectible.collectible_id = tL_starGiftUnique.f22607id;
                emojiStatus = tL_inputEmojiStatusCollectible;
                if (num != null) {
                    tL_inputEmojiStatusCollectible.flags |= 1;
                    tL_inputEmojiStatusCollectible.until = num.intValue();
                    emojiStatus = tL_inputEmojiStatusCollectible;
                }
            } else {
                tL_emojiStatus = new TLRPC.TL_emojiStatus();
                tL_emojiStatus.document_id = l10.longValue();
                if (num != null) {
                    emojiStatus = tL_emojiStatus;
                    tL_emojiStatus.flags |= 1;
                    tL_emojiStatus.until = num.intValue();
                    emojiStatus = tL_emojiStatus;
                }
            }
            emojiStatus = tL_emojiStatus;
            tL_emojiStatusEmpty = emojiStatus;
        }
        gyVar.getMessagesController().updateEmojiStatus(tL_emojiStatusEmpty, tL_starGiftUnique);
        if (l10 != null) {
            org.telegram.ui.Cells.o oVar = gyVar.A3;
            ig.q0 q0Var = new ig.q0();
            long jLongValue = l10.longValue();
            q0Var.f11413g = jLongValue;
            q0Var.h = jLongValue;
            oVar.a(q0Var);
        }
        r51 r51Var2 = r51VarArr[0];
        if (r51Var2 != null) {
            gyVar.I0 = null;
            r51Var2.dismiss();
        }
    }
}
