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
public final class uy0 implements org.telegram.ui.rt {
    public final zy0 f27765a;

    public uy0(zy0 zy0Var) {
        this.f27765a = zy0Var;
    }

    @Override
    public final void A(TLRPC.Document document) {
        zy0 zy0Var = this.f27765a;
        xy0 xy0Var = zy0Var.f29832c;
        if (xy0Var != null) {
            org.telegram.ui.ActionBar.p2 parentFragment = xy0Var.getParentFragment();
            if (parentFragment instanceof org.telegram.ui.eo) {
                ((org.telegram.ui.eo) parentFragment).bb(document);
                zy0Var.f29832c.setFieldText("");
            }
        }
    }

    @Override
    public final boolean B() {
        return false;
    }

    @Override
    public final boolean C(TLRPC.Document document) {
        if (this.f27765a.f29841y) {
            return false;
        }
        return UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
    }

    @Override
    public final String E(boolean z10) {
        return null;
    }

    @Override
    public final void G(TLRPC.Document document) {
        xy0 xy0Var;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new y5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (AndroidUtilities.addToClipboard(valueOf) && (xy0Var = this.f27765a.f29832c) != null) {
            org.telegram.messenger.em.o(R.string.EmojiCopied, wc.a0(xy0Var.getParentFragment()));
        }
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
    public final w70 K(bi.n7 n7Var) {
        return null;
    }

    @Override
    public final boolean N(TLRPC.Document document) {
        return false;
    }

    @Override
    public final Boolean P(TLRPC.Document document) {
        TLRPC.User currentUser;
        boolean z10;
        if (this.f27765a.E || !UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser()) == null) {
            return null;
        }
        Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(currentUser);
        if (document != null && (emojiStatusDocumentId == null || emojiStatusDocumentId.longValue() != document.f17201id)) {
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
        xy0 xy0Var = this.f27765a.f29832c;
        if (xy0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.p2 parentFragment = xy0Var.getParentFragment();
        if (!(parentFragment instanceof org.telegram.ui.eo)) {
            return false;
        }
        return ((org.telegram.ui.eo) parentFragment).c();
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
        xy0 xy0Var = this.f27765a.f29832c;
        if (xy0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.p2 parentFragment = xy0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.eo) {
            org.telegram.ui.eo eoVar = (org.telegram.ui.eo) parentFragment;
            if (eoVar.E6()) {
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    if (eoVar.i() != null && UserObject.isUserSelf(eoVar.i())) {
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
        org.telegram.ui.ActionBar.p2 parentFragment;
        zy0 zy0Var = this.f27765a;
        org.telegram.ui.ActionBar.f6 f6Var = zy0Var.f29830b;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.f17201id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        if (currentUser == null) {
            obj = new TLRPC.TL_emojiStatusEmpty();
        } else {
            obj = currentUser.emoji_status;
        }
        MessagesController.getInstance(zy0Var.f29828a).updateEmojiStatus(emojiStatus);
        yo0 yo0Var = new yo0(9, this, obj);
        xy0 xy0Var = zy0Var.f29832c;
        if (xy0Var == null) {
            parentFragment = null;
        } else {
            parentFragment = xy0Var.getParentFragment();
        }
        if (parentFragment != null) {
            if (document == null) {
                hc hcVar = new hc(zy0Var.getContext(), f6Var);
                hcVar.f23574b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
                hcVar.f23573a.setImageResource(R.drawable.msg_settings_premium);
                nc ncVar = new nc(zy0Var.getContext(), f6Var, true);
                ncVar.f25483a = yo0Var;
                hcVar.setButton(ncVar);
                pc.g(parentFragment, hcVar, 1500).j();
                return;
            }
            wc.a0(parentFragment).q(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), yo0Var).j();
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
    public final void F(CharSequence charSequence, String str, org.telegram.ui.pf pfVar) {
    }

    @Override
    public final void r(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
    }
}
