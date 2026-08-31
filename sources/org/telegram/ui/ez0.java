package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ez0 extends r61 {
    public final i61[] a2;
    public final ProfileActivity f36711b2;

    public ez0(ProfileActivity profileActivity, ProfileActivity profileActivity2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.g6 g6Var, int i11, i61[] i61VarArr) {
        super(profileActivity2, activity, true, num, i10, true, g6Var, i11);
        this.f36711b2 = profileActivity;
        this.a2 = i61VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique != null) {
            i10 = ((org.telegram.ui.ActionBar.p2) this.f36711b2).currentAccount;
            if (mh.t7.y(i10, false).n(tL_starGiftUnique.f21070id) != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final long getDialogId() {
        return this.f36711b2.a();
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible;
        Long l11;
        long j10;
        boolean z4;
        int i10;
        int i11;
        int i12;
        ProfileActivity profileActivity = this.f36711b2;
        org.telegram.ui.Components.j5[] j5VarArr = profileActivity.D;
        i61[] i61VarArr = this.a2;
        if (tL_starGiftUnique != null) {
            i10 = ((org.telegram.ui.ActionBar.p2) profileActivity).currentAccount;
            TL_stars.SavedStarGift n10 = mh.t7.y(i10, false).n(tL_starGiftUnique.f21070id);
            if (n10 != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                MessagesController.getGlobalMainSettings().edit().putInt("statusgiftpage", MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) + 1).apply();
                Context context = getContext();
                i11 = ((org.telegram.ui.ActionBar.p2) profileActivity).currentAccount;
                i12 = ((org.telegram.ui.ActionBar.p2) profileActivity).currentAccount;
                mh.g5 g5Var = new mh.g5(context, i11, UserConfig.getInstance(i12).getClientUserId(), profileActivity.f34714w0, null);
                g5Var.j2(n10, null);
                g5Var.m2();
                g5Var.show();
                i61 i61Var = i61VarArr[0];
                if (i61Var != null) {
                    profileActivity.f34733y5 = null;
                    i61Var.dismiss();
                    return;
                }
                return;
            }
            TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible2 = new TLRPC.TL_inputEmojiStatusCollectible();
            tL_inputEmojiStatusCollectible2.collectible_id = tL_starGiftUnique.f21070id;
            tL_inputEmojiStatusCollectible = tL_inputEmojiStatusCollectible2;
            if (num != null) {
                tL_inputEmojiStatusCollectible2.flags |= 1;
                tL_inputEmojiStatusCollectible2.until = num.intValue();
                tL_inputEmojiStatusCollectible = tL_inputEmojiStatusCollectible2;
            }
        } else if (l10 == null) {
            tL_inputEmojiStatusCollectible = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = l10.longValue();
            tL_inputEmojiStatusCollectible = tL_emojiStatus;
            if (num != null) {
                tL_emojiStatus.flags |= 1;
                tL_emojiStatus.until = num.intValue();
                tL_inputEmojiStatusCollectible = tL_emojiStatus;
            }
        }
        if (tL_starGiftUnique != null) {
            l11 = Long.valueOf(tL_starGiftUnique.f21070id);
        } else {
            l11 = null;
        }
        profileActivity.C = l11;
        MessagesController messagesController = profileActivity.getMessagesController();
        TLRPC.Chat chat = profileActivity.B2;
        if (chat == null) {
            j10 = 0;
        } else {
            j10 = -chat.f20843id;
        }
        messagesController.updateEmojiStatus(j10, tL_inputEmojiStatusCollectible, tL_starGiftUnique);
        for (int i13 = 0; i13 < 2; i13++) {
            org.telegram.ui.Components.j5 j5Var = j5VarArr[i13];
            if (j5Var != null) {
                if (l10 == null && profileActivity.B2 == null) {
                    j5Var.g(profileActivity.Y3(i13), true);
                } else if (l10 != null) {
                    j5Var.j(l10.longValue(), true);
                } else {
                    j5Var.g(null, true);
                }
                org.telegram.ui.Components.j5 j5Var2 = j5VarArr[i13];
                if (tL_starGiftUnique != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                j5Var2.m(z4, true);
            }
        }
        if (l10 != null) {
            org.telegram.ui.Cells.o oVar = profileActivity.f34561a0;
            ?? obj = new Object();
            long longValue = l10.longValue();
            obj.f16179g = longValue;
            obj.h = longValue;
            oVar.a(obj);
        }
        profileActivity.X4();
        profileActivity.Z4();
        i61 i61Var2 = i61VarArr[0];
        if (i61Var2 != null) {
            profileActivity.f34733y5 = null;
            i61Var2.dismiss();
        }
    }
}
