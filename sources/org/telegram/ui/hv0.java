package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class hv0 extends r11 {
    public final i11[] f48502f2;
    public final ProfileActivity f48503g2;

    public hv0(ProfileActivity profileActivity, ProfileActivity profileActivity2, Activity activity, Integer num, int i7, org.telegram.ui.ActionBar.h6 h6Var, int i10, i11[] i11VarArr) {
        super(profileActivity2, activity, true, num, i7, true, h6Var, i10);
        this.f48503g2 = profileActivity;
        this.f48502f2 = i11VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i7;
        if (tL_starGiftUnique != null) {
            i7 = ((org.telegram.ui.ActionBar.g2) this.f48503g2).currentAccount;
            if (di.y8.y(i7, false).n(tL_starGiftUnique.f28627id) != null && org.telegram.messenger.np.g1().getInt("statusgiftpage", 0) < 2) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final long getDialogId() {
        return this.f48503g2.a();
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible;
        Long l11;
        long j3;
        boolean z10;
        int i7;
        int i10;
        int i11;
        i11[] i11VarArr = this.f48502f2;
        ProfileActivity profileActivity = this.f48503g2;
        if (tL_starGiftUnique != null) {
            i7 = ((org.telegram.ui.ActionBar.g2) profileActivity).currentAccount;
            TL_stars.SavedStarGift n10 = di.y8.y(i7, false).n(tL_starGiftUnique.f28627id);
            if (n10 != null && org.telegram.messenger.np.g1().getInt("statusgiftpage", 0) < 2) {
                org.telegram.messenger.np.g1().edit().putInt("statusgiftpage", org.telegram.messenger.np.g1().getInt("statusgiftpage", 0) + 1).apply();
                Context context = getContext();
                i10 = ((org.telegram.ui.ActionBar.g2) profileActivity).currentAccount;
                i11 = ((org.telegram.ui.ActionBar.g2) profileActivity).currentAccount;
                di.f6 f6Var = new di.f6(context, i10, org.telegram.messenger.k10.i(i11).e(), profileActivity.A0, null);
                f6Var.w2(n10, null);
                f6Var.A2();
                f6Var.show();
                i11 i11Var = i11VarArr[0];
                if (i11Var != null) {
                    profileActivity.T5 = null;
                    i11Var.dismiss();
                    return;
                }
                return;
            }
            TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible2 = new TLRPC.TL_inputEmojiStatusCollectible();
            tL_inputEmojiStatusCollectible2.collectible_id = tL_starGiftUnique.f28627id;
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
            l11 = Long.valueOf(tL_starGiftUnique.f28627id);
        } else {
            l11 = null;
        }
        profileActivity.F = l11;
        org.telegram.messenger.np messagesController = profileActivity.getMessagesController();
        TLRPC.Chat chat = profileActivity.F2;
        if (chat == null) {
            j3 = 0;
        } else {
            j3 = -chat.f28398id;
        }
        messagesController.s5(j3, tL_inputEmojiStatusCollectible, tL_starGiftUnique);
        org.telegram.ui.Components.n5 n5Var = profileActivity.G;
        if (n5Var != null) {
            if (l10 == null && profileActivity.F2 == null) {
                n5Var.g(profileActivity.o4(), true);
            } else if (l10 != null) {
                n5Var.j(l10.longValue(), true);
            } else {
                n5Var.g(null, true);
            }
            org.telegram.ui.Components.n5 n5Var2 = profileActivity.G;
            if (tL_starGiftUnique != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            n5Var2.m(z10, true);
        }
        if (l10 != null) {
            org.telegram.ui.Cells.o oVar = profileActivity.f43549e0;
            ?? obj = new Object();
            long longValue = l10.longValue();
            obj.f5471g = longValue;
            obj.h = longValue;
            oVar.a(obj);
        }
        profileActivity.v5();
        profileActivity.x5();
        i11 i11Var2 = i11VarArr[0];
        if (i11Var2 != null) {
            profileActivity.T5 = null;
            i11Var2.dismiss();
        }
    }
}
