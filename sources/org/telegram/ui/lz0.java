package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class lz0 extends a71 {
    public final r61[] f35420d2;
    public final ProfileActivity f35421e2;

    public lz0(ProfileActivity profileActivity, ProfileActivity profileActivity2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.d6 d6Var, int i11, r61[] r61VarArr) {
        super(profileActivity2, activity, true, num, i10, true, d6Var, i11);
        this.f35421e2 = profileActivity;
        this.f35420d2 = r61VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique != null) {
            i10 = ((org.telegram.ui.ActionBar.m2) this.f35421e2).currentAccount;
            if (yh.t5.y(i10, false).n(tL_starGiftUnique.f18546id) != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final long getDialogId() {
        return this.f35421e2.a();
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible;
        Long l10;
        long j3;
        boolean z10;
        int i10;
        int i11;
        int i12;
        ProfileActivity profileActivity = this.f35421e2;
        org.telegram.ui.Components.o5[] o5VarArr = profileActivity.G;
        r61[] r61VarArr = this.f35420d2;
        if (tL_starGiftUnique != null) {
            i10 = ((org.telegram.ui.ActionBar.m2) profileActivity).currentAccount;
            TL_stars.SavedStarGift n10 = yh.t5.y(i10, false).n(tL_starGiftUnique.f18546id);
            if (n10 != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                MessagesController.getGlobalMainSettings().edit().putInt("statusgiftpage", MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) + 1).apply();
                Context context = getContext();
                i11 = ((org.telegram.ui.ActionBar.m2) profileActivity).currentAccount;
                i12 = ((org.telegram.ui.ActionBar.m2) profileActivity).currentAccount;
                yh.x3 x3Var = new yh.x3(context, i11, UserConfig.getInstance(i12).getClientUserId(), profileActivity.f31684z0, null);
                x3Var.j2(n10, null);
                x3Var.m2();
                x3Var.show();
                r61 r61Var = r61VarArr[0];
                if (r61Var != null) {
                    profileActivity.B5 = null;
                    r61Var.dismiss();
                    return;
                }
                return;
            }
            TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible2 = new TLRPC.TL_inputEmojiStatusCollectible();
            tL_inputEmojiStatusCollectible2.collectible_id = tL_starGiftUnique.f18546id;
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
            l10 = Long.valueOf(tL_starGiftUnique.f18546id);
        } else {
            l10 = null;
        }
        profileActivity.F = l10;
        MessagesController messagesController = profileActivity.getMessagesController();
        TLRPC.Chat chat = profileActivity.E2;
        if (chat == null) {
            j3 = 0;
        } else {
            j3 = -chat.f18321id;
        }
        messagesController.updateEmojiStatus(j3, tL_inputEmojiStatusCollectible, tL_starGiftUnique);
        for (int i13 = 0; i13 < 2; i13++) {
            org.telegram.ui.Components.o5 o5Var = o5VarArr[i13];
            if (o5Var != null) {
                if (l4 == null && profileActivity.E2 == null) {
                    o5Var.g(profileActivity.Y3(i13), true);
                } else if (l4 != null) {
                    o5Var.j(l4.longValue(), true);
                } else {
                    o5Var.g(null, true);
                }
                org.telegram.ui.Components.o5 o5Var2 = o5VarArr[i13];
                if (tL_starGiftUnique != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                o5Var2.m(z10, true);
            }
        }
        if (l4 != null) {
            org.telegram.ui.Cells.o oVar = profileActivity.f31533d0;
            ?? obj = new Object();
            long longValue = l4.longValue();
            obj.f49386g = longValue;
            obj.h = longValue;
            oVar.a(obj);
        }
        profileActivity.X4();
        profileActivity.Z4();
        r61 r61Var2 = r61VarArr[0];
        if (r61Var2 != null) {
            profileActivity.B5 = null;
            r61Var2.dismiss();
        }
    }
}
