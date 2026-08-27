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

public final class rx0 implements org.telegram.ui.ht {

    public final wx0 f32268a;

    public rx0(wx0 wx0Var) {
        this.f32268a = wx0Var;
    }

    @Override
    public final void A(TLRPC.Document document) {
        wx0 wx0Var = this.f32268a;
        ux0 ux0Var = wx0Var.f34365c;
        if (ux0Var == null) {
            return;
        }
        org.telegram.ui.ActionBar.n2 parentFragment = ux0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.rn) {
            ((org.telegram.ui.rn) parentFragment).bb(document);
            wx0Var.f34365c.setFieldText("");
        }
    }

    @Override
    public final boolean B() {
        return false;
    }

    @Override
    public final boolean C(TLRPC.Document document) {
        if (this.f32268a.f34373y) {
            return false;
        }
        return UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
    }

    @Override
    public final String F(boolean z10) {
        return null;
    }

    @Override
    public final void G(TLRPC.Document document) {
        ux0 ux0Var;
        SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        spannableStringBuilderValueOf.setSpan(new t5(document, (Paint.FontMetricsInt) null), 0, spannableStringBuilderValueOf.length(), 33);
        if (!AndroidUtilities.addToClipboard(spannableStringBuilderValueOf) || (ux0Var = this.f32268a.f34365c) == null) {
            return;
        }
        org.telegram.messenger.rl.m(R.string.EmojiCopied, mc.a0(ux0Var.getParentFragment()));
    }

    @Override
    public final boolean H() {
        return false;
    }

    @Override
    public final boolean I() {
        return false;
    }

    @Override
    public final b70 L(ag.y1 y1Var) {
        return null;
    }

    @Override
    public final boolean N(TLRPC.Document document) {
        return false;
    }

    @Override
    public final Boolean P(TLRPC.Document document) {
        TLRPC.User currentUser;
        if (this.f32268a.A || !UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser()) == null) {
            return null;
        }
        Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(currentUser);
        return Boolean.valueOf(document != null && (emojiStatusDocumentId == null || emojiStatusDocumentId.longValue() != document.f22386id));
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
        ux0 ux0Var = this.f32268a.f34365c;
        if (ux0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.n2 parentFragment = ux0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.rn) {
            return ((org.telegram.ui.rn) parentFragment).c();
        }
        return false;
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
        ux0 ux0Var = this.f32268a.f34365c;
        if (ux0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.n2 parentFragment = ux0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.rn) {
            org.telegram.ui.rn rnVar = (org.telegram.ui.rn) parentFragment;
            if (rnVar.E6()) {
                if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    return true;
                }
                if (rnVar.i() != null && UserObject.isUserSelf(rnVar.i())) {
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
        TLRPC.EmojiStatus tL_emojiStatusEmpty;
        wx0 wx0Var = this.f32268a;
        org.telegram.ui.ActionBar.c6 c6Var = wx0Var.f34364b;
        if (document == null) {
            tL_emojiStatusEmpty = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.f22386id;
            tL_emojiStatusEmpty = tL_emojiStatus;
        }
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        Object tL_emojiStatusEmpty2 = currentUser == null ? new TLRPC.TL_emojiStatusEmpty() : currentUser.emoji_status;
        MessagesController.getInstance(wx0Var.f34363a).updateEmojiStatus(tL_emojiStatusEmpty);
        lg0 lg0Var = new lg0(18, this, tL_emojiStatusEmpty2);
        ux0 ux0Var = wx0Var.f34365c;
        org.telegram.ui.ActionBar.n2 parentFragment = ux0Var == null ? null : ux0Var.getParentFragment();
        if (parentFragment != null) {
            if (document != null) {
                mc.a0(parentFragment).q(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), lg0Var).j();
                return;
            }
            wb wbVar = new wb(wx0Var.getContext(), c6Var);
            wbVar.f34154b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
            wbVar.f34153a.setImageResource(R.drawable.msg_settings_premium);
            cc ccVar = new cc(wx0Var.getContext(), c6Var, true);
            ccVar.f27402a = lg0Var;
            wbVar.setButton(ccVar);
            ec.g(parentFragment, wbVar, 1500).j();
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
    public final void J() {
    }

    @Override
    public final void K() {
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
    public final void E(CharSequence charSequence, String str, org.telegram.ui.df dfVar) {
    }

    @Override
    public final void r(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
    }
}
