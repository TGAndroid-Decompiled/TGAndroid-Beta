package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class pw0 extends g31 {
    public final x21[] f40628e2;
    public final ProfileActivity f40629f2;

    public pw0(ProfileActivity profileActivity, ProfileActivity profileActivity2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.p6 p6Var, int i11, x21[] x21VarArr) {
        super(profileActivity2, activity, true, num, i10, true, p6Var, i11);
        this.f40629f2 = profileActivity;
        this.f40628e2 = x21VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique != null) {
            i10 = ((org.telegram.ui.ActionBar.k2) this.f40629f2).currentAccount;
            if (rh.e6.y(i10, false).n(tL_starGiftUnique.f20022id) != null && org.telegram.messenger.wp.d1().getInt("statusgiftpage", 0) < 2) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final long getDialogId() {
        return this.f40629f2.a();
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
        x21[] x21VarArr = this.f40628e2;
        ProfileActivity profileActivity = this.f40629f2;
        if (tL_starGiftUnique != null) {
            i10 = ((org.telegram.ui.ActionBar.k2) profileActivity).currentAccount;
            TL_stars.SavedStarGift n10 = rh.e6.y(i10, false).n(tL_starGiftUnique.f20022id);
            if (n10 != null && org.telegram.messenger.wp.d1().getInt("statusgiftpage", 0) < 2) {
                org.telegram.messenger.wp.d1().edit().putInt("statusgiftpage", org.telegram.messenger.wp.d1().getInt("statusgiftpage", 0) + 1).apply();
                Context context = getContext();
                i11 = ((org.telegram.ui.ActionBar.k2) profileActivity).currentAccount;
                i12 = ((org.telegram.ui.ActionBar.k2) profileActivity).currentAccount;
                rh.e4 e4Var = new rh.e4(context, i11, org.telegram.messenger.e20.i(i12).e(), profileActivity.f33957z0, null);
                e4Var.j2(n10, null);
                e4Var.n2();
                e4Var.show();
                x21 x21Var = x21VarArr[0];
                if (x21Var != null) {
                    profileActivity.N5 = null;
                    x21Var.dismiss();
                    return;
                }
                return;
            }
            TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible2 = new TLRPC.TL_inputEmojiStatusCollectible();
            tL_inputEmojiStatusCollectible2.collectible_id = tL_starGiftUnique.f20022id;
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
            l10 = Long.valueOf(tL_starGiftUnique.f20022id);
        } else {
            l10 = null;
        }
        profileActivity.E = l10;
        org.telegram.messenger.wp messagesController = profileActivity.getMessagesController();
        TLRPC.Chat chat = profileActivity.D2;
        if (chat == null) {
            j10 = 0;
        } else {
            j10 = -chat.f19794id;
        }
        messagesController.d5(j10, tL_inputEmojiStatusCollectible, tL_starGiftUnique);
        org.telegram.ui.Components.d5 d5Var = profileActivity.F;
        if (d5Var != null) {
            if (l4 == null && profileActivity.D2 == null) {
                d5Var.g(profileActivity.o4(), true);
            } else if (l4 != null) {
                d5Var.j(l4.longValue(), true);
            } else {
                d5Var.g(null, true);
            }
            org.telegram.ui.Components.d5 d5Var2 = profileActivity.F;
            if (tL_starGiftUnique != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            d5Var2.m(z10, true);
        }
        if (l4 != null) {
            org.telegram.ui.Cells.n nVar = profileActivity.f33802d0;
            ?? obj = new Object();
            long longValue = l4.longValue();
            obj.f48446g = longValue;
            obj.h = longValue;
            nVar.a(obj);
        }
        profileActivity.s5();
        profileActivity.u5();
        x21 x21Var2 = x21VarArr[0];
        if (x21Var2 != null) {
            profileActivity.N5 = null;
            x21Var2.dismiss();
        }
    }
}
