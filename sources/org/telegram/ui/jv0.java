package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class jv0 extends t11 {
    public final k11[] f47082e2;
    public final ProfileActivity f47083f2;

    public jv0(ProfileActivity profileActivity, ProfileActivity profileActivity2, Activity activity, Integer num, int i7, org.telegram.ui.ActionBar.h6 h6Var, int i10, k11[] k11VarArr) {
        super(profileActivity2, activity, true, num, i7, true, h6Var, i10);
        this.f47083f2 = profileActivity;
        this.f47082e2 = k11VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i7;
        if (tL_starGiftUnique != null) {
            i7 = ((org.telegram.ui.ActionBar.f2) this.f47083f2).currentAccount;
            if (bi.ea.y(i7, false).n(tL_starGiftUnique.f27189id) != null && org.telegram.messenger.qp.e1().getInt("statusgiftpage", 0) < 2) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final long getDialogId() {
        return this.f47083f2.a();
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible;
        Long l11;
        long j3;
        boolean z9;
        int i7;
        int i10;
        int i11;
        k11[] k11VarArr = this.f47082e2;
        ProfileActivity profileActivity = this.f47083f2;
        if (tL_starGiftUnique != null) {
            i7 = ((org.telegram.ui.ActionBar.f2) profileActivity).currentAccount;
            TL_stars.SavedStarGift n10 = bi.ea.y(i7, false).n(tL_starGiftUnique.f27189id);
            if (n10 != null && org.telegram.messenger.qp.e1().getInt("statusgiftpage", 0) < 2) {
                org.telegram.messenger.qp.e1().edit().putInt("statusgiftpage", org.telegram.messenger.qp.e1().getInt("statusgiftpage", 0) + 1).apply();
                Context context = getContext();
                i10 = ((org.telegram.ui.ActionBar.f2) profileActivity).currentAccount;
                i11 = ((org.telegram.ui.ActionBar.f2) profileActivity).currentAccount;
                bi.k7 k7Var = new bi.k7(context, i10, org.telegram.messenger.p10.i(i11).e(), profileActivity.f41867z0, null);
                k7Var.i2(n10, null);
                k7Var.n2();
                k7Var.show();
                k11 k11Var = k11VarArr[0];
                if (k11Var != null) {
                    profileActivity.P5 = null;
                    k11Var.dismiss();
                    return;
                }
                return;
            }
            TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible2 = new TLRPC.TL_inputEmojiStatusCollectible();
            tL_inputEmojiStatusCollectible2.collectible_id = tL_starGiftUnique.f27189id;
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
            l11 = Long.valueOf(tL_starGiftUnique.f27189id);
        } else {
            l11 = null;
        }
        profileActivity.E = l11;
        org.telegram.messenger.qp messagesController = profileActivity.getMessagesController();
        TLRPC.Chat chat = profileActivity.D2;
        if (chat == null) {
            j3 = 0;
        } else {
            j3 = -chat.f26960id;
        }
        messagesController.g5(j3, tL_inputEmojiStatusCollectible, tL_starGiftUnique);
        org.telegram.ui.Components.f5 f5Var = profileActivity.F;
        if (f5Var != null) {
            if (l10 == null && profileActivity.D2 == null) {
                f5Var.g(profileActivity.o4(), true);
            } else if (l10 != null) {
                f5Var.j(l10.longValue(), true);
            } else {
                f5Var.g(null, true);
            }
            org.telegram.ui.Components.f5 f5Var2 = profileActivity.F;
            if (tL_starGiftUnique != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            f5Var2.m(z9, true);
        }
        if (l10 != null) {
            org.telegram.ui.Cells.o oVar = profileActivity.f41713d0;
            ?? obj = new Object();
            long longValue = l10.longValue();
            obj.f6360g = longValue;
            obj.h = longValue;
            oVar.a(obj);
        }
        profileActivity.v5();
        profileActivity.x5();
        k11 k11Var2 = k11VarArr[0];
        if (k11Var2 != null) {
            profileActivity.P5 = null;
            k11Var2.dismiss();
        }
    }
}
