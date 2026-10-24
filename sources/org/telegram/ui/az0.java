package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class az0 extends a61 {
    public final r51[] f35869e2;
    public final ProfileActivity f35870f2;

    public az0(ProfileActivity profileActivity, ProfileActivity profileActivity2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.g6 g6Var, int i11, r51[] r51VarArr) {
        super(profileActivity2, activity, true, num, i10, true, g6Var, i11);
        this.f35870f2 = profileActivity;
        this.f35869e2 = r51VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique != null) {
            i10 = ((org.telegram.ui.ActionBar.o2) this.f35870f2).currentAccount;
            if (ai.ha.y(i10, false).n(tL_starGiftUnique.f20568id) != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final long getDialogId() {
        return this.f35870f2.a();
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible;
        Long l10;
        long j10;
        boolean z10;
        int i10;
        int i11;
        int i12;
        ProfileActivity profileActivity = this.f35870f2;
        org.telegram.ui.Components.n5[] n5VarArr = profileActivity.G;
        r51[] r51VarArr = this.f35869e2;
        if (tL_starGiftUnique != null) {
            i10 = ((org.telegram.ui.ActionBar.o2) profileActivity).currentAccount;
            TL_stars.SavedStarGift n10 = ai.ha.y(i10, false).n(tL_starGiftUnique.f20568id);
            if (n10 != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                MessagesController.getGlobalMainSettings().edit().putInt("statusgiftpage", MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) + 1).apply();
                Context context = getContext();
                i11 = ((org.telegram.ui.ActionBar.o2) profileActivity).currentAccount;
                i12 = ((org.telegram.ui.ActionBar.o2) profileActivity).currentAccount;
                ai.l7 l7Var = new ai.l7(context, i11, UserConfig.getInstance(i12).getClientUserId(), profileActivity.A0, null);
                l7Var.L2(n10, null);
                l7Var.P2();
                l7Var.show();
                r51 r51Var = r51VarArr[0];
                if (r51Var != null) {
                    profileActivity.D5 = null;
                    r51Var.dismiss();
                    return;
                }
                return;
            }
            TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible2 = new TLRPC.TL_inputEmojiStatusCollectible();
            tL_inputEmojiStatusCollectible2.collectible_id = tL_starGiftUnique.f20568id;
            tL_inputEmojiStatusCollectible = tL_inputEmojiStatusCollectible2;
            if (num != null) {
                tL_inputEmojiStatusCollectible2.flags |= 1;
                tL_inputEmojiStatusCollectible2.until = num.intValue();
                tL_inputEmojiStatusCollectible = tL_inputEmojiStatusCollectible2;
            }
        } else if (l4 == null) {
            tL_inputEmojiStatusCollectible = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = l4.longValue();
            tL_inputEmojiStatusCollectible = tL_emojiStatus;
            if (num != null) {
                tL_emojiStatus.flags |= 1;
                tL_emojiStatus.until = num.intValue();
                tL_inputEmojiStatusCollectible = tL_emojiStatus;
            }
        }
        if (tL_starGiftUnique != null) {
            l10 = Long.valueOf(tL_starGiftUnique.f20568id);
        } else {
            l10 = null;
        }
        profileActivity.F = l10;
        MessagesController messagesController = profileActivity.getMessagesController();
        TLRPC.Chat chat = profileActivity.F2;
        if (chat == null) {
            j10 = 0;
        } else {
            j10 = -chat.f20344id;
        }
        messagesController.updateEmojiStatus(j10, tL_inputEmojiStatusCollectible, tL_starGiftUnique);
        for (int i13 = 0; i13 < 2; i13++) {
            org.telegram.ui.Components.n5 n5Var = n5VarArr[i13];
            if (n5Var != null) {
                if (l4 == null && profileActivity.F2 == null) {
                    n5Var.g(profileActivity.a4(i13), true);
                } else if (l4 != null) {
                    n5Var.j(l4.longValue(), true);
                } else {
                    n5Var.g(null, true);
                }
                org.telegram.ui.Components.n5 n5Var2 = n5VarArr[i13];
                if (tL_starGiftUnique != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                n5Var2.m(z10, true);
            }
        }
        if (l4 != null) {
            org.telegram.ui.Cells.o oVar = profileActivity.f33914e0;
            ?? obj = new Object();
            long longValue = l4.longValue();
            obj.f785g = longValue;
            obj.h = longValue;
            oVar.a(obj);
        }
        profileActivity.b5();
        profileActivity.d5();
        r51 r51Var2 = r51VarArr[0];
        if (r51Var2 != null) {
            profileActivity.D5 = null;
            r51Var2.dismiss();
        }
    }
}
