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
public final class px0 implements org.telegram.ui.ft {
    public final ux0 f31769a;

    public px0(ux0 ux0Var) {
        this.f31769a = ux0Var;
    }

    @Override
    public final boolean A() {
        return false;
    }

    @Override
    public final void B(TLRPC.Document document) {
        ux0 ux0Var = this.f31769a;
        sx0 sx0Var = ux0Var.f33160c;
        if (sx0Var != null) {
            org.telegram.ui.ActionBar.o2 parentFragment = sx0Var.getParentFragment();
            if (parentFragment instanceof org.telegram.ui.qn) {
                ((org.telegram.ui.qn) parentFragment).bb(document);
                ux0Var.f33160c.setFieldText("");
            }
        }
    }

    @Override
    public final boolean C() {
        return false;
    }

    @Override
    public final boolean D(TLRPC.Document document) {
        if (this.f31769a.f33168y) {
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
        sx0 sx0Var;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new t5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (AndroidUtilities.addToClipboard(valueOf) && (sx0Var = this.f31769a.f33160c) != null) {
            org.telegram.messenger.ll.o(R.string.EmojiCopied, oc.a0(sx0Var.getParentFragment()));
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
        if (this.f31769a.A || !UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser()) == null) {
            return null;
        }
        Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(currentUser);
        if (document != null && (emojiStatusDocumentId == null || emojiStatusDocumentId.longValue() != document.f22386id)) {
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
        sx0 sx0Var = this.f31769a.f33160c;
        if (sx0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.o2 parentFragment = sx0Var.getParentFragment();
        if (!(parentFragment instanceof org.telegram.ui.qn)) {
            return false;
        }
        return ((org.telegram.ui.qn) parentFragment).c();
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
    public final boolean k(int i9) {
        sx0 sx0Var = this.f31769a.f33160c;
        if (sx0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.o2 parentFragment = sx0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.qn) {
            org.telegram.ui.qn qnVar = (org.telegram.ui.qn) parentFragment;
            if (qnVar.E6()) {
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    if (qnVar.i() != null && UserObject.isUserSelf(qnVar.i())) {
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
    public final x60 r(fh.v vVar) {
        return null;
    }

    @Override
    public final void u(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        Object obj;
        org.telegram.ui.ActionBar.o2 parentFragment;
        ux0 ux0Var = this.f31769a;
        org.telegram.ui.ActionBar.b6 b6Var = ux0Var.f33159b;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.f22386id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        if (currentUser == null) {
            obj = new TLRPC.TL_emojiStatusEmpty();
        } else {
            obj = currentUser.emoji_status;
        }
        MessagesController.getInstance(ux0Var.f33158a).updateEmojiStatus(emojiStatus);
        jg0 jg0Var = new jg0(18, this, obj);
        sx0 sx0Var = ux0Var.f33160c;
        if (sx0Var == null) {
            parentFragment = null;
        } else {
            parentFragment = sx0Var.getParentFragment();
        }
        if (parentFragment != null) {
            if (document == null) {
                yb ybVar = new yb(ux0Var.getContext(), b6Var);
                ybVar.f34916b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
                ybVar.f34915a.setImageResource(R.drawable.msg_settings_premium);
                ec ecVar = new ec(ux0Var.getContext(), b6Var, true);
                ecVar.f27999a = jg0Var;
                ybVar.setButton(ecVar);
                gc.g(parentFragment, ybVar, 1500).j();
                return;
            }
            oc.a0(parentFragment).q(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), jg0Var).j();
        }
    }

    @Override
    public final boolean x() {
        return true;
    }

    @Override
    public final MessageObject z() {
        return null;
    }

    @Override
    public final void E(TLRPC.Document document) {
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
    public final void t() {
    }

    @Override
    public final void y(String str) {
    }

    @Override
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override
    public final void v(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override
    public final void w(TLObject tLObject, Object obj) {
    }

    @Override
    public final void F(CharSequence charSequence, String str, org.telegram.ui.df dfVar) {
    }

    @Override
    public final void s(int i9, int i10, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i9, int i10) {
    }
}
