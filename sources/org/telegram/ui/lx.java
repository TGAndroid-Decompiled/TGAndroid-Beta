package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class lx extends c71 {
    public final t61[] f35468d2;
    public final ty f35469e2;

    public lx(ty tyVar, ty tyVar2, Activity activity, Integer num, org.telegram.ui.ActionBar.e6 e6Var, t61[] t61VarArr) {
        super(tyVar2, activity, true, num, 0, e6Var);
        this.f35469e2 = tyVar;
        this.f35468d2 = t61VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique != null) {
            i10 = ((org.telegram.ui.ActionBar.o2) this.f35469e2).currentAccount;
            if (yh.s5.y(i10, false).n(tL_starGiftUnique.f18554id) != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
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
        t61[] t61VarArr = this.f35468d2;
        ty tyVar = this.f35469e2;
        if (l4 == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            if (tL_starGiftUnique != null) {
                i10 = ((org.telegram.ui.ActionBar.o2) tyVar).currentAccount;
                TL_stars.SavedStarGift n10 = yh.s5.y(i10, false).n(tL_starGiftUnique.f18554id);
                if (n10 != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                    MessagesController.getGlobalMainSettings().edit().putInt("statusgiftpage", MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) + 1).apply();
                    Context context = getContext();
                    i11 = ((org.telegram.ui.ActionBar.o2) tyVar).currentAccount;
                    i12 = ((org.telegram.ui.ActionBar.o2) tyVar).currentAccount;
                    long clientUserId = UserConfig.getInstance(i12).getClientUserId();
                    e6Var = ((org.telegram.ui.ActionBar.o2) tyVar).resourceProvider;
                    yh.x3 x3Var = new yh.x3(context, i11, clientUserId, e6Var, null);
                    x3Var.j2(n10, null);
                    x3Var.m2();
                    x3Var.show();
                    t61 t61Var = t61VarArr[0];
                    if (t61Var != null) {
                        tyVar.M0 = null;
                        t61Var.dismiss();
                        return;
                    }
                    return;
                }
                TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
                tL_inputEmojiStatusCollectible.collectible_id = tL_starGiftUnique.f18554id;
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
            obj.f49445g = longValue;
            obj.h = longValue;
            oVar.a(obj);
        }
        t61 t61Var2 = t61VarArr[0];
        if (t61Var2 != null) {
            tyVar.M0 = null;
            t61Var2.dismiss();
        }
    }
}
