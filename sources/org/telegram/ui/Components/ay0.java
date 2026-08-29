package org.telegram.ui.Components;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ay0 implements org.telegram.ui.ft {
    public final fy0 f26912a;

    public ay0(fy0 fy0Var) {
        this.f26912a = fy0Var;
    }

    @Override
    public final void A(TLRPC.Document document) {
        fy0 fy0Var = this.f26912a;
        dy0 dy0Var = fy0Var.f28565c;
        if (dy0Var != null) {
            org.telegram.ui.ActionBar.o2 parentFragment = dy0Var.getParentFragment();
            if (parentFragment instanceof org.telegram.ui.tn) {
                ((org.telegram.ui.tn) parentFragment).bb(document);
                fy0Var.f28565c.setFieldText("");
            }
        }
    }

    @Override
    public final boolean B() {
        return false;
    }

    @Override
    public final boolean C(TLRPC.Document document) {
        if (this.f26912a.f28573y) {
            return false;
        }
        return UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
    }

    @Override
    public final String E(boolean z10) {
        return null;
    }

    @Override
    public final j70 G(bg.d1 d1Var) {
        return null;
    }

    @Override
    public final void H(TLRPC.Document document) {
        dy0 dy0Var;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new y5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (AndroidUtilities.addToClipboard(valueOf) && (dy0Var = this.f26912a.f28565c) != null) {
            org.telegram.ui.b.n(R.string.EmojiCopied, tc.a0(dy0Var.getParentFragment()));
        }
    }

    @Override
    public final boolean I() {
        return false;
    }

    @Override
    public final boolean J() {
        return false;
    }

    @Override
    public final boolean N(TLRPC.Document document) {
        return false;
    }

    @Override
    public final Boolean P(TLRPC.Document document) {
        TLRPC.User currentUser;
        boolean z10;
        if (this.f26912a.A || !UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser()) == null) {
            return null;
        }
        Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(currentUser);
        if (document != null && (emojiStatusDocumentId == null || emojiStatusDocumentId.longValue() != document.f22398id)) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    @Override
    public final boolean Q() {
        return true;
    }

    @Override
    public final long a() {
        return 0L;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final boolean c() {
        dy0 dy0Var = this.f26912a.f28565c;
        if (dy0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.o2 parentFragment = dy0Var.getParentFragment();
        if (!(parentFragment instanceof org.telegram.ui.tn)) {
            return false;
        }
        return ((org.telegram.ui.tn) parentFragment).c();
    }

    @Override
    public final TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override
    public final boolean e(TLRPC.Document document) {
        return false;
    }

    @Override
    public final boolean f() {
        return false;
    }

    @Override
    public final TLRPC.PollAnswer g() {
        return null;
    }

    @Override
    public final boolean h() {
        return true;
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k(int i10) {
        dy0 dy0Var = this.f26912a.f28565c;
        if (dy0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.o2 parentFragment = dy0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.tn) {
            org.telegram.ui.tn tnVar = (org.telegram.ui.tn) parentFragment;
            if (tnVar.E6()) {
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    if (tnVar.i() != null && UserObject.isUserSelf(tnVar.i())) {
                        return true;
                    }
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final boolean o() {
        return false;
    }

    @Override
    public final void t(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        Object obj;
        org.telegram.ui.ActionBar.o2 parentFragment;
        fy0 fy0Var = this.f26912a;
        org.telegram.ui.ActionBar.c6 c6Var = fy0Var.f28564b;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.f22398id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        if (currentUser == null) {
            obj = new TLRPC.TL_emojiStatusEmpty();
        } else {
            obj = currentUser.emoji_status;
        }
        MessagesController.getInstance(fy0Var.f28563a).updateEmojiStatus(emojiStatus);
        ii0 ii0Var = new ii0(15, this, obj);
        dy0 dy0Var = fy0Var.f28565c;
        if (dy0Var == null) {
            parentFragment = null;
        } else {
            parentFragment = dy0Var.getParentFragment();
        }
        if (parentFragment != null) {
            if (document == null) {
                ec ecVar = new ec(fy0Var.getContext(), c6Var);
                ecVar.f28000b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
                ecVar.f27999a.setImageResource(R.drawable.msg_settings_premium);
                kc kcVar = new kc(fy0Var.getContext(), c6Var, true);
                kcVar.f30007a = ii0Var;
                ecVar.setButton(kcVar);
                mc.g(parentFragment, ecVar, 1500).j();
                return;
            }
            tc.a0(parentFragment).q(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), ii0Var).j();
        }
    }

    @Override
    public final boolean w() {
        return true;
    }

    @Override
    public final MessageObject y() {
        return null;
    }

    @Override
    public final boolean z() {
        return false;
    }

    @Override
    public final void D(TLRPC.Document document) {
    }

    @Override
    public final void K() {
    }

    @Override
    public final void L() {
    }

    @Override
    public final void O(String str) {
    }

    @Override
    public final void i(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override
    public final void m(String str) {
    }

    @Override
    public final void n(TLRPC.Document document) {
    }

    @Override
    public final void p(TLRPC.Document document) {
    }

    @Override
    public final void q() {
    }

    @Override
    public final void s() {
    }

    @Override
    public final void x(String str) {
    }

    @Override
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override
    public final void u(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override
    public final void v(TLObject tLObject, Object obj) {
    }

    @Override
    public final void F(CharSequence charSequence, String str, org.telegram.ui.tm tmVar) {
    }

    @Override
    public final void r(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
    }
}
