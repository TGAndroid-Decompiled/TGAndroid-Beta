package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class nx extends j71 {
    public final a71[] f40400d2;
    public final sy f40401e2;

    public nx(sy syVar, sy syVar2, Activity activity, Integer num, org.telegram.ui.ActionBar.d6 d6Var, a71[] a71VarArr) {
        super(syVar2, activity, true, num, 0, d6Var);
        this.f40401e2 = syVar;
        this.f40400d2 = a71VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique != null) {
            i10 = ((org.telegram.ui.ActionBar.m2) this.f40401e2).currentAccount;
            if (yh.n5.y(i10, false).n(tL_starGiftUnique.f20295id) != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
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
        a71[] a71VarArr = this.f40400d2;
        sy syVar = this.f40401e2;
        if (l4 == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            if (tL_starGiftUnique != null) {
                i10 = ((org.telegram.ui.ActionBar.m2) syVar).currentAccount;
                TL_stars.SavedStarGift n10 = yh.n5.y(i10, false).n(tL_starGiftUnique.f20295id);
                if (n10 != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                    MessagesController.getGlobalMainSettings().edit().putInt("statusgiftpage", MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) + 1).apply();
                    Context context = getContext();
                    i11 = ((org.telegram.ui.ActionBar.m2) syVar).currentAccount;
                    i12 = ((org.telegram.ui.ActionBar.m2) syVar).currentAccount;
                    long clientUserId = UserConfig.getInstance(i12).getClientUserId();
                    d6Var = ((org.telegram.ui.ActionBar.m2) syVar).resourceProvider;
                    yh.s3 s3Var = new yh.s3(context, i11, clientUserId, d6Var, null);
                    s3Var.l2(n10, null);
                    s3Var.o2();
                    s3Var.show();
                    a71 a71Var = a71VarArr[0];
                    if (a71Var != null) {
                        syVar.M0 = null;
                        a71Var.dismiss();
                        return;
                    }
                    return;
                }
                TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
                tL_inputEmojiStatusCollectible.collectible_id = tL_starGiftUnique.f20295id;
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
        syVar.getMessagesController().updateEmojiStatus(emojiStatus, tL_starGiftUnique);
        if (l4 != null) {
            org.telegram.ui.Cells.o oVar = syVar.E3;
            ?? obj = new Object();
            long longValue = l4.longValue();
            obj.f54739g = longValue;
            obj.h = longValue;
            oVar.a(obj);
        }
        a71 a71Var2 = a71VarArr[0];
        if (a71Var2 != null) {
            syVar.M0 = null;
            a71Var2.dismiss();
        }
    }
}
