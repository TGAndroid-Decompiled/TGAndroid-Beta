package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a01 extends r71 {
    public final i71[] f33713d2;
    public final ProfileActivity f33714e2;

    public a01(ProfileActivity profileActivity, ProfileActivity profileActivity2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.c6 c6Var, int i11, i71[] i71VarArr) {
        super(profileActivity2, activity, true, num, i10, true, c6Var, i11);
        this.f33714e2 = profileActivity;
        this.f33713d2 = i71VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique != null) {
            i10 = ((org.telegram.ui.ActionBar.m2) this.f33714e2).currentAccount;
            if (zh.n5.y(i10, false).n(tL_starGiftUnique.f19141id) != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final long getDialogId() {
        return this.f33714e2.a();
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
        ProfileActivity profileActivity = this.f33714e2;
        org.telegram.ui.Components.q5[] q5VarArr = profileActivity.G;
        i71[] i71VarArr = this.f33713d2;
        if (tL_starGiftUnique != null) {
            i10 = ((org.telegram.ui.ActionBar.m2) profileActivity).currentAccount;
            TL_stars.SavedStarGift n10 = zh.n5.y(i10, false).n(tL_starGiftUnique.f19141id);
            if (n10 != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                MessagesController.getGlobalMainSettings().edit().putInt("statusgiftpage", MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) + 1).apply();
                Context context = getContext();
                i11 = ((org.telegram.ui.ActionBar.m2) profileActivity).currentAccount;
                i12 = ((org.telegram.ui.ActionBar.m2) profileActivity).currentAccount;
                zh.r3 r3Var = new zh.r3(context, i11, UserConfig.getInstance(i12).getClientUserId(), profileActivity.f32405z0, null);
                r3Var.l2(n10, null);
                r3Var.o2();
                r3Var.show();
                i71 i71Var = i71VarArr[0];
                if (i71Var != null) {
                    profileActivity.B5 = null;
                    i71Var.dismiss();
                    return;
                }
                return;
            }
            TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible2 = new TLRPC.TL_inputEmojiStatusCollectible();
            tL_inputEmojiStatusCollectible2.collectible_id = tL_starGiftUnique.f19141id;
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
            l10 = Long.valueOf(tL_starGiftUnique.f19141id);
        } else {
            l10 = null;
        }
        profileActivity.F = l10;
        MessagesController messagesController = profileActivity.getMessagesController();
        TLRPC.Chat chat = profileActivity.E2;
        if (chat == null) {
            j10 = 0;
        } else {
            j10 = -chat.f18916id;
        }
        messagesController.updateEmojiStatus(j10, tL_inputEmojiStatusCollectible, tL_starGiftUnique);
        for (int i13 = 0; i13 < 2; i13++) {
            org.telegram.ui.Components.q5 q5Var = q5VarArr[i13];
            if (q5Var != null) {
                if (l4 == null && profileActivity.E2 == null) {
                    q5Var.g(profileActivity.Y3(i13), true);
                } else if (l4 != null) {
                    q5Var.j(l4.longValue(), true);
                } else {
                    q5Var.g(null, true);
                }
                org.telegram.ui.Components.q5 q5Var2 = q5VarArr[i13];
                if (tL_starGiftUnique != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                q5Var2.m(z10, true);
            }
        }
        if (l4 != null) {
            org.telegram.ui.Cells.o oVar = profileActivity.f32253d0;
            ?? obj = new Object();
            long longValue = l4.longValue();
            obj.f784g = longValue;
            obj.h = longValue;
            oVar.a(obj);
        }
        profileActivity.X4();
        profileActivity.Z4();
        i71 i71Var2 = i71VarArr[0];
        if (i71Var2 != null) {
            profileActivity.B5 = null;
            i71Var2.dismiss();
        }
    }
}
