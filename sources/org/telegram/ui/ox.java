package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ox extends k71 {
    public final b71[] f40612d2;
    public final ty f40613e2;

    public ox(ty tyVar, ty tyVar2, Activity activity, Integer num, org.telegram.ui.ActionBar.e6 e6Var, b71[] b71VarArr) {
        super(tyVar2, activity, true, num, 0, e6Var);
        this.f40613e2 = tyVar;
        this.f40612d2 = b71VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique != null) {
            i10 = ((org.telegram.ui.ActionBar.n2) this.f40613e2).currentAccount;
            if (yh.m5.y(i10, false).n(tL_starGiftUnique.f20265id) != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
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
        b71[] b71VarArr = this.f40612d2;
        ty tyVar = this.f40613e2;
        if (l4 == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            if (tL_starGiftUnique != null) {
                i10 = ((org.telegram.ui.ActionBar.n2) tyVar).currentAccount;
                TL_stars.SavedStarGift n10 = yh.m5.y(i10, false).n(tL_starGiftUnique.f20265id);
                if (n10 != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                    MessagesController.getGlobalMainSettings().edit().putInt("statusgiftpage", MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) + 1).apply();
                    Context context = getContext();
                    i11 = ((org.telegram.ui.ActionBar.n2) tyVar).currentAccount;
                    i12 = ((org.telegram.ui.ActionBar.n2) tyVar).currentAccount;
                    long clientUserId = UserConfig.getInstance(i12).getClientUserId();
                    e6Var = ((org.telegram.ui.ActionBar.n2) tyVar).resourceProvider;
                    yh.s3 s3Var = new yh.s3(context, i11, clientUserId, e6Var, null);
                    s3Var.l2(n10, null);
                    s3Var.o2();
                    s3Var.show();
                    b71 b71Var = b71VarArr[0];
                    if (b71Var != null) {
                        tyVar.M0 = null;
                        b71Var.dismiss();
                        return;
                    }
                    return;
                }
                TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
                tL_inputEmojiStatusCollectible.collectible_id = tL_starGiftUnique.f20265id;
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
        tyVar.getMessagesController().updateEmojiStatus(emojiStatus, tL_starGiftUnique);
        if (l4 != null) {
            org.telegram.ui.Cells.o oVar = tyVar.E3;
            ?? obj = new Object();
            long longValue = l4.longValue();
            obj.f54616g = longValue;
            obj.h = longValue;
            oVar.a(obj);
        }
        b71 b71Var2 = b71VarArr[0];
        if (b71Var2 != null) {
            tyVar.M0 = null;
            b71Var2.dismiss();
        }
    }
}
