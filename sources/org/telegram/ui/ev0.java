package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ev0 extends n11 {
    public final e11[] f46926f2;
    public final ProfileActivity f46927g2;

    public ev0(ProfileActivity profileActivity, ProfileActivity profileActivity2, Activity activity, Integer num, int i7, org.telegram.ui.ActionBar.e6 e6Var, int i10, e11[] e11VarArr) {
        super(profileActivity2, activity, true, num, i7, true, e6Var, i10);
        this.f46927g2 = profileActivity;
        this.f46926f2 = e11VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i7;
        if (tL_starGiftUnique != null) {
            i7 = ((org.telegram.ui.ActionBar.e2) this.f46927g2).currentAccount;
            if (di.v8.y(i7, false).n(tL_starGiftUnique.f28280id) != null && org.telegram.messenger.np.e1().getInt("statusgiftpage", 0) < 2) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final long getDialogId() {
        return this.f46927g2.a();
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
        e11[] e11VarArr = this.f46926f2;
        ProfileActivity profileActivity = this.f46927g2;
        if (tL_starGiftUnique != null) {
            i7 = ((org.telegram.ui.ActionBar.e2) profileActivity).currentAccount;
            TL_stars.SavedStarGift n10 = di.v8.y(i7, false).n(tL_starGiftUnique.f28280id);
            if (n10 != null && org.telegram.messenger.np.e1().getInt("statusgiftpage", 0) < 2) {
                org.telegram.messenger.np.e1().edit().putInt("statusgiftpage", org.telegram.messenger.np.e1().getInt("statusgiftpage", 0) + 1).apply();
                Context context = getContext();
                i10 = ((org.telegram.ui.ActionBar.e2) profileActivity).currentAccount;
                i11 = ((org.telegram.ui.ActionBar.e2) profileActivity).currentAccount;
                di.c6 c6Var = new di.c6(context, i10, org.telegram.messenger.m10.i(i11).e(), profileActivity.A0, null);
                c6Var.k2(n10, null);
                c6Var.o2();
                c6Var.show();
                e11 e11Var = e11VarArr[0];
                if (e11Var != null) {
                    profileActivity.R5 = null;
                    e11Var.dismiss();
                    return;
                }
                return;
            }
            TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible2 = new TLRPC.TL_inputEmojiStatusCollectible();
            tL_inputEmojiStatusCollectible2.collectible_id = tL_starGiftUnique.f28280id;
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
            l11 = Long.valueOf(tL_starGiftUnique.f28280id);
        } else {
            l11 = null;
        }
        profileActivity.F = l11;
        org.telegram.messenger.np messagesController = profileActivity.getMessagesController();
        TLRPC.Chat chat = profileActivity.F2;
        if (chat == null) {
            j3 = 0;
        } else {
            j3 = -chat.f28051id;
        }
        messagesController.h5(j3, tL_inputEmojiStatusCollectible, tL_starGiftUnique);
        org.telegram.ui.Components.e5 e5Var = profileActivity.G;
        if (e5Var != null) {
            if (l10 == null && profileActivity.F2 == null) {
                e5Var.g(profileActivity.n4(), true);
            } else if (l10 != null) {
                e5Var.j(l10.longValue(), true);
            } else {
                e5Var.g(null, true);
            }
            org.telegram.ui.Components.e5 e5Var2 = profileActivity.G;
            if (tL_starGiftUnique != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            e5Var2.m(z10, true);
        }
        if (l10 != null) {
            org.telegram.ui.Cells.o oVar = profileActivity.f43093e0;
            ?? obj = new Object();
            long longValue = l10.longValue();
            obj.f5189g = longValue;
            obj.h = longValue;
            oVar.a(obj);
        }
        profileActivity.u5();
        profileActivity.w5();
        e11 e11Var2 = e11VarArr[0];
        if (e11Var2 != null) {
            profileActivity.R5 = null;
            e11Var2.dismiss();
        }
    }
}
