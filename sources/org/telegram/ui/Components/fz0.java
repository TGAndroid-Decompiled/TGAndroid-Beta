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
public final class fz0 implements org.telegram.ui.ft {
    public final kz0 f26446a;

    public fz0(kz0 kz0Var) {
        this.f26446a = kz0Var;
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
        kz0 kz0Var = this.f26446a;
        iz0 iz0Var = kz0Var.f28109c;
        if (iz0Var != null) {
            org.telegram.ui.ActionBar.o2 parentFragment = iz0Var.getParentFragment();
            if (parentFragment instanceof org.telegram.ui.sn) {
                ((org.telegram.ui.sn) parentFragment).gb(document);
                kz0Var.f28109c.setFieldText("");
            }
        }
    }

    @Override
    public final boolean D() {
        return false;
    }

    @Override
    public final boolean E(TLRPC.Document document) {
        if (this.f26446a.f28120y) {
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
        iz0 iz0Var;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new y5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (AndroidUtilities.addToClipboard(valueOf) && (iz0Var = this.f26446a.f28109c) != null) {
            org.telegram.messenger.tl.p(R.string.EmojiCopied, vc.a0(iz0Var.getParentFragment()));
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
        if (this.f26446a.E || !UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser()) == null) {
            return null;
        }
        Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(currentUser);
        if (document != null && (emojiStatusDocumentId == null || emojiStatusDocumentId.longValue() != document.f20350id)) {
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
        iz0 iz0Var = this.f26446a.f28109c;
        if (iz0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.o2 parentFragment = iz0Var.getParentFragment();
        if (!(parentFragment instanceof org.telegram.ui.sn)) {
            return false;
        }
        return ((org.telegram.ui.sn) parentFragment).c();
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
        iz0 iz0Var = this.f26446a.f28109c;
        if (iz0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.o2 parentFragment = iz0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.sn) {
            org.telegram.ui.sn snVar = (org.telegram.ui.sn) parentFragment;
            if (snVar.H6()) {
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    if (snVar.i() != null && UserObject.isUserSelf(snVar.i())) {
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
    public final h80 u(ah.v vVar) {
        return null;
    }

    @Override
    public final void v(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        Object obj;
        org.telegram.ui.ActionBar.o2 parentFragment;
        kz0 kz0Var = this.f26446a;
        org.telegram.ui.ActionBar.g6 g6Var = kz0Var.f28107b;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.f20350id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        if (currentUser == null) {
            obj = new TLRPC.TL_emojiStatusEmpty();
        } else {
            obj = currentUser.emoji_status;
        }
        MessagesController.getInstance(kz0Var.f28105a).updateEmojiStatus(emojiStatus);
        jo0 jo0Var = new jo0(12, this, obj);
        iz0 iz0Var = kz0Var.f28109c;
        if (iz0Var == null) {
            parentFragment = null;
        } else {
            parentFragment = iz0Var.getParentFragment();
        }
        if (parentFragment != null) {
            if (document == null) {
                gc gcVar = new gc(kz0Var.getContext(), g6Var);
                gcVar.f26619b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
                gcVar.f26618a.setImageResource(R.drawable.msg_settings_premium);
                mc mcVar = new mc(kz0Var.getContext(), g6Var, true);
                mcVar.f28574b = jo0Var;
                gcVar.setButton(mcVar);
                oc.g(parentFragment, gcVar, 1500).j();
                return;
            }
            vc.a0(parentFragment).r(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), jo0Var).j();
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
    public final void t(CharSequence charSequence, String str, oy oyVar) {
    }

    @Override
    public final void r(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
    }
}
