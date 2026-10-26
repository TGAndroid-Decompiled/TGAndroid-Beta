package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ez0 extends c61 {
    public final t51[] f39221e2;
    public final ProfileActivity f39222f2;

    public ez0(ProfileActivity profileActivity, ProfileActivity profileActivity2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.u6 u6Var, int i11, t51[] t51VarArr) {
        super(profileActivity2, activity, true, num, i10, true, u6Var, i11);
        this.f39222f2 = profileActivity;
        this.f39221e2 = t51VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique != null) {
            i10 = ((org.telegram.ui.ActionBar.r2) this.f39222f2).currentAccount;
            if (bi.ca.y(i10, false).n(tL_starGiftUnique.f22256id) != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final long getDialogId() {
        return this.f39222f2.a();
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
        t51[] t51VarArr = this.f39221e2;
        ProfileActivity profileActivity = this.f39222f2;
        if (tL_starGiftUnique != null) {
            i10 = ((org.telegram.ui.ActionBar.r2) profileActivity).currentAccount;
            TL_stars.SavedStarGift n10 = bi.ca.y(i10, false).n(tL_starGiftUnique.f22256id);
            if (n10 != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                MessagesController.getGlobalMainSettings().edit().putInt("statusgiftpage", MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) + 1).apply();
                Context context = getContext();
                i11 = ((org.telegram.ui.ActionBar.r2) profileActivity).currentAccount;
                i12 = ((org.telegram.ui.ActionBar.r2) profileActivity).currentAccount;
                bi.h7 h7Var = new bi.h7(context, i11, UserConfig.getInstance(i12).getClientUserId(), profileActivity.f36126z0, null);
                h7Var.L2(n10, null);
                h7Var.P2();
                h7Var.show();
                t51 t51Var = t51VarArr[0];
                if (t51Var != null) {
                    profileActivity.H5 = null;
                    t51Var.dismiss();
                    return;
                }
                return;
            }
            TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible2 = new TLRPC.TL_inputEmojiStatusCollectible();
            tL_inputEmojiStatusCollectible2.collectible_id = tL_starGiftUnique.f22256id;
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
            l10 = Long.valueOf(tL_starGiftUnique.f22256id);
        } else {
            l10 = null;
        }
        profileActivity.E = l10;
        MessagesController messagesController = profileActivity.getMessagesController();
        TLRPC.Chat chat = profileActivity.E2;
        if (chat == null) {
            j10 = 0;
        } else {
            j10 = -chat.f22027id;
        }
        messagesController.updateEmojiStatus(j10, tL_inputEmojiStatusCollectible, tL_starGiftUnique);
        org.telegram.ui.Components.r5 r5Var = profileActivity.F;
        if (r5Var != null) {
            if (l4 == null && profileActivity.E2 == null) {
                r5Var.g(profileActivity.g4(), true);
            } else if (l4 != null) {
                r5Var.j(l4.longValue(), true);
            } else {
                r5Var.g(null, true);
            }
            org.telegram.ui.Components.r5 r5Var2 = profileActivity.F;
            if (tL_starGiftUnique != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            r5Var2.m(z10, true);
        }
        if (l4 != null) {
            org.telegram.ui.Cells.o oVar = profileActivity.f35971d0;
            ?? obj = new Object();
            long longValue = l4.longValue();
            obj.f4209g = longValue;
            obj.h = longValue;
            oVar.a(obj);
        }
        profileActivity.j5();
        profileActivity.l5();
        t51 t51Var2 = t51VarArr[0];
        if (t51Var2 != null) {
            profileActivity.H5 = null;
            t51Var2.dismiss();
        }
    }
}
