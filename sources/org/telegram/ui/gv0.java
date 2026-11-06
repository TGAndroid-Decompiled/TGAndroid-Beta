package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class gv0 extends q11 {
    public final h11[] f46118e2;
    public final ProfileActivity f46119f2;

    public gv0(ProfileActivity profileActivity, ProfileActivity profileActivity2, Activity activity, Integer num, int i7, org.telegram.ui.ActionBar.f6 f6Var, int i10, h11[] h11VarArr) {
        super(profileActivity2, activity, true, num, i7, true, f6Var, i10);
        this.f46119f2 = profileActivity;
        this.f46118e2 = h11VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i7;
        if (tL_starGiftUnique != null) {
            i7 = ((org.telegram.ui.ActionBar.f2) this.f46119f2).currentAccount;
            if (bi.ea.y(i7, false).n(tL_starGiftUnique.f27182id) != null && org.telegram.messenger.qp.e1().getInt("statusgiftpage", 0) < 2) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final long getDialogId() {
        return this.f46119f2.a();
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
        h11[] h11VarArr = this.f46118e2;
        ProfileActivity profileActivity = this.f46119f2;
        if (tL_starGiftUnique != null) {
            i7 = ((org.telegram.ui.ActionBar.f2) profileActivity).currentAccount;
            TL_stars.SavedStarGift n10 = bi.ea.y(i7, false).n(tL_starGiftUnique.f27182id);
            if (n10 != null && org.telegram.messenger.qp.e1().getInt("statusgiftpage", 0) < 2) {
                org.telegram.messenger.qp.e1().edit().putInt("statusgiftpage", org.telegram.messenger.qp.e1().getInt("statusgiftpage", 0) + 1).apply();
                Context context = getContext();
                i10 = ((org.telegram.ui.ActionBar.f2) profileActivity).currentAccount;
                i11 = ((org.telegram.ui.ActionBar.f2) profileActivity).currentAccount;
                bi.k7 k7Var = new bi.k7(context, i10, org.telegram.messenger.p10.i(i11).e(), profileActivity.f41865z0, null);
                k7Var.j2(n10, null);
                k7Var.n2();
                k7Var.show();
                h11 h11Var = h11VarArr[0];
                if (h11Var != null) {
                    profileActivity.N5 = null;
                    h11Var.dismiss();
                    return;
                }
                return;
            }
            TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible2 = new TLRPC.TL_inputEmojiStatusCollectible();
            tL_inputEmojiStatusCollectible2.collectible_id = tL_starGiftUnique.f27182id;
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
            l11 = Long.valueOf(tL_starGiftUnique.f27182id);
        } else {
            l11 = null;
        }
        profileActivity.E = l11;
        org.telegram.messenger.qp messagesController = profileActivity.getMessagesController();
        TLRPC.Chat chat = profileActivity.D2;
        if (chat == null) {
            j3 = 0;
        } else {
            j3 = -chat.f26953id;
        }
        messagesController.g5(j3, tL_inputEmojiStatusCollectible, tL_starGiftUnique);
        org.telegram.ui.Components.g5 g5Var = profileActivity.F;
        if (g5Var != null) {
            if (l10 == null && profileActivity.D2 == null) {
                g5Var.g(profileActivity.o4(), true);
            } else if (l10 != null) {
                g5Var.j(l10.longValue(), true);
            } else {
                g5Var.g(null, true);
            }
            org.telegram.ui.Components.g5 g5Var2 = profileActivity.F;
            if (tL_starGiftUnique != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            g5Var2.m(z9, true);
        }
        if (l10 != null) {
            org.telegram.ui.Cells.o oVar = profileActivity.f41711d0;
            ?? obj = new Object();
            long longValue = l10.longValue();
            obj.f6357g = longValue;
            obj.h = longValue;
            oVar.a(obj);
        }
        profileActivity.s5();
        profileActivity.u5();
        h11 h11Var2 = h11VarArr[0];
        if (h11Var2 != null) {
            profileActivity.N5 = null;
            h11Var2.dismiss();
        }
    }
}
