package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class kx extends q61 {
    public final g61[] a2;
    public final oy f35829b2;

    public kx(oy oyVar, oy oyVar2, Activity activity, Integer num, org.telegram.ui.ActionBar.f6 f6Var, g61[] g61VarArr) {
        super(oyVar2, activity, true, num, 0, f6Var);
        this.f35829b2 = oyVar;
        this.a2 = g61VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique != null) {
            i10 = ((org.telegram.ui.ActionBar.p2) this.f35829b2).currentAccount;
            if (lh.t7.y(i10, false).n(tL_starGiftUnique.f19409id) != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        TLRPC.TL_emojiStatus tL_emojiStatus;
        TLRPC.EmojiStatus emojiStatus;
        int i10;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.f6 f6Var;
        g61[] g61VarArr = this.a2;
        oy oyVar = this.f35829b2;
        if (l10 == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            if (tL_starGiftUnique != null) {
                i10 = ((org.telegram.ui.ActionBar.p2) oyVar).currentAccount;
                TL_stars.SavedStarGift n10 = lh.t7.y(i10, false).n(tL_starGiftUnique.f19409id);
                if (n10 != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                    MessagesController.getGlobalMainSettings().edit().putInt("statusgiftpage", MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) + 1).apply();
                    Context context = getContext();
                    i11 = ((org.telegram.ui.ActionBar.p2) oyVar).currentAccount;
                    i12 = ((org.telegram.ui.ActionBar.p2) oyVar).currentAccount;
                    long clientUserId = UserConfig.getInstance(i12).getClientUserId();
                    f6Var = ((org.telegram.ui.ActionBar.p2) oyVar).resourceProvider;
                    lh.g5 g5Var = new lh.g5(context, i11, clientUserId, f6Var, null);
                    g5Var.j2(n10, null);
                    g5Var.m2();
                    g5Var.show();
                    g61 g61Var = g61VarArr[0];
                    if (g61Var != null) {
                        oyVar.J0 = null;
                        g61Var.dismiss();
                        return;
                    }
                    return;
                }
                TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
                tL_inputEmojiStatusCollectible.collectible_id = tL_starGiftUnique.f19409id;
                tL_emojiStatus = tL_inputEmojiStatusCollectible;
                if (num != null) {
                    tL_inputEmojiStatusCollectible.flags |= 1;
                    tL_inputEmojiStatusCollectible.until = num.intValue();
                    tL_emojiStatus = tL_inputEmojiStatusCollectible;
                }
            } else {
                TLRPC.TL_emojiStatus tL_emojiStatus2 = new TLRPC.TL_emojiStatus();
                tL_emojiStatus2.document_id = l10.longValue();
                tL_emojiStatus = tL_emojiStatus2;
                if (num != null) {
                    tL_emojiStatus2.flags |= 1;
                    tL_emojiStatus2.until = num.intValue();
                    tL_emojiStatus = tL_emojiStatus2;
                }
            }
            emojiStatus = tL_emojiStatus;
        }
        oyVar.getMessagesController().updateEmojiStatus(emojiStatus, tL_starGiftUnique);
        if (l10 != null) {
            org.telegram.ui.Cells.o oVar = oyVar.B3;
            ?? obj = new Object();
            long longValue = l10.longValue();
            obj.f14108g = longValue;
            obj.h = longValue;
            oVar.a(obj);
        }
        g61 g61Var2 = g61VarArr[0];
        if (g61Var2 != null) {
            oyVar.J0 = null;
            g61Var2.dismiss();
        }
    }
}
