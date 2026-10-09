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
public final class jz0 implements org.telegram.ui.pt {
    public final oz0 f27807a;

    public jz0(oz0 oz0Var) {
        this.f27807a = oz0Var;
    }

    @Override
    public final MessageObject A() {
        return null;
    }

    @Override
    public final boolean B() {
        return false;
    }

    @Override
    public final void C(TLRPC.Document document) {
        oz0 oz0Var = this.f27807a;
        mz0 mz0Var = oz0Var.f29605c;
        if (mz0Var != null) {
            org.telegram.ui.ActionBar.n2 parentFragment = mz0Var.getParentFragment();
            if (parentFragment instanceof org.telegram.ui.zn) {
                ((org.telegram.ui.zn) parentFragment).fb(document);
                oz0Var.f29605c.setFieldText("");
            }
        }
    }

    @Override
    public final boolean D() {
        return false;
    }

    @Override
    public final boolean E(TLRPC.Document document) {
        if (this.f27807a.f29615y) {
            return false;
        }
        return UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
    }

    @Override
    public final String G(boolean z10) {
        return null;
    }

    @Override
    public final void H(TLRPC.Document document) {
        mz0 mz0Var;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new b6(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (AndroidUtilities.addToClipboard(valueOf) && (mz0Var = this.f27807a.f29605c) != null) {
            org.telegram.messenger.bi.p(R.string.EmojiCopied, ad.a0(mz0Var.getParentFragment()));
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
        if (this.f27807a.E || !UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser()) == null) {
            return null;
        }
        Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(currentUser);
        if (document != null && (emojiStatusDocumentId == null || emojiStatusDocumentId.longValue() != document.f20044id)) {
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
        mz0 mz0Var = this.f27807a.f29605c;
        if (mz0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.n2 parentFragment = mz0Var.getParentFragment();
        if (!(parentFragment instanceof org.telegram.ui.zn)) {
            return false;
        }
        return ((org.telegram.ui.zn) parentFragment).c();
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
    public final boolean g() {
        return false;
    }

    @Override
    public final TLRPC.PollAnswer h() {
        return null;
    }

    @Override
    public final boolean i() {
        return true;
    }

    @Override
    public final p80 j(ci.m6 m6Var) {
        return null;
    }

    @Override
    public final boolean l() {
        return false;
    }

    @Override
    public final boolean m(int i10) {
        mz0 mz0Var = this.f27807a.f29605c;
        if (mz0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.n2 parentFragment = mz0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.zn) {
            org.telegram.ui.zn znVar = (org.telegram.ui.zn) parentFragment;
            if (znVar.H6()) {
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    if (znVar.i() != null && UserObject.isUserSelf(znVar.i())) {
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
    public final boolean q() {
        return false;
    }

    @Override
    public final void v(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        Object obj;
        org.telegram.ui.ActionBar.n2 parentFragment;
        oz0 oz0Var = this.f27807a;
        org.telegram.ui.ActionBar.e6 e6Var = oz0Var.f29603b;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.f20044id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        if (currentUser == null) {
            obj = new TLRPC.TL_emojiStatusEmpty();
        } else {
            obj = currentUser.emoji_status;
        }
        MessagesController.getInstance(oz0Var.f29601a).updateEmojiStatus(emojiStatus);
        ci0 ci0Var = new ci0(18, this, obj);
        mz0 mz0Var = oz0Var.f29605c;
        if (mz0Var == null) {
            parentFragment = null;
        } else {
            parentFragment = mz0Var.getParentFragment();
        }
        if (parentFragment != null) {
            if (document == null) {
                lc lcVar = new lc(oz0Var.getContext(), e6Var);
                lcVar.f28419b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
                lcVar.f28418a.setImageResource(R.drawable.msg_settings_premium);
                rc rcVar = new rc(oz0Var.getContext(), e6Var, true);
                rcVar.f30421a = ci0Var;
                lcVar.setButton(rcVar);
                tc.g(parentFragment, lcVar, 1500).j();
                return;
            }
            ad.a0(parentFragment).q(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), ci0Var).j();
        }
    }

    @Override
    public final boolean y() {
        return true;
    }

    @Override
    public final void F(TLRPC.Document document) {
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
    public final void k(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override
    public final void o(String str) {
    }

    @Override
    public final void p(TLRPC.Document document) {
    }

    @Override
    public final void r(TLRPC.Document document) {
    }

    @Override
    public final void s() {
    }

    @Override
    public final void u() {
    }

    @Override
    public final void z(String str) {
    }

    @Override
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override
    public final void w(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override
    public final void x(TLObject tLObject, Object obj) {
    }

    @Override
    public final void f(CharSequence charSequence, String str, org.telegram.ui.ft ftVar) {
    }

    @Override
    public final void t(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void n(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
    }
}
