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
public final class ly0 implements org.telegram.ui.pt {
    public final qy0 f26894a;

    public ly0(qy0 qy0Var) {
        this.f26894a = qy0Var;
    }

    @Override
    public final boolean B() {
        return false;
    }

    @Override
    public final void C(TLRPC.Document document) {
        qy0 qy0Var = this.f26894a;
        oy0 oy0Var = qy0Var.f28320c;
        if (oy0Var != null) {
            org.telegram.ui.ActionBar.p2 parentFragment = oy0Var.getParentFragment();
            if (parentFragment instanceof org.telegram.ui.zn) {
                ((org.telegram.ui.zn) parentFragment).bb(document);
                qy0Var.f28320c.setFieldText("");
            }
        }
    }

    @Override
    public final boolean D() {
        return false;
    }

    @Override
    public final boolean E(TLRPC.Document document) {
        if (this.f26894a.f28327y) {
            return false;
        }
        return UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
    }

    @Override
    public final String G(boolean z4) {
        return null;
    }

    @Override
    public final void H(TLRPC.Document document) {
        oy0 oy0Var;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new u5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (AndroidUtilities.addToClipboard(valueOf) && (oy0Var = this.f26894a.f28320c) != null) {
            org.telegram.ui.b.m(R.string.EmojiCopied, qc.a0(oy0Var.getParentFragment()));
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
        boolean z4;
        if (this.f26894a.B || !UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser()) == null) {
            return null;
        }
        Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(currentUser);
        if (document != null && (emojiStatusDocumentId == null || emojiStatusDocumentId.longValue() != document.f19165id)) {
            z4 = true;
        } else {
            z4 = false;
        }
        return Boolean.valueOf(z4);
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
        oy0 oy0Var = this.f26894a.f28320c;
        if (oy0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.p2 parentFragment = oy0Var.getParentFragment();
        if (!(parentFragment instanceof org.telegram.ui.zn)) {
            return false;
        }
        return ((org.telegram.ui.zn) parentFragment).c();
    }

    @Override
    public final p70 d(ah.e eVar) {
        return null;
    }

    @Override
    public final TLRPC.TL_messageMediaPoll e() {
        return null;
    }

    @Override
    public final boolean f(TLRPC.Document document) {
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
    public final boolean k() {
        return false;
    }

    @Override
    public final boolean l(int i10) {
        oy0 oy0Var = this.f26894a.f28320c;
        if (oy0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.p2 parentFragment = oy0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.zn) {
            org.telegram.ui.zn znVar = (org.telegram.ui.zn) parentFragment;
            if (znVar.E6()) {
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
    public final boolean p() {
        return false;
    }

    @Override
    public final void u(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        Object obj;
        org.telegram.ui.ActionBar.p2 parentFragment;
        qy0 qy0Var = this.f26894a;
        org.telegram.ui.ActionBar.f6 f6Var = qy0Var.f28319b;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.f19165id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        if (currentUser == null) {
            obj = new TLRPC.TL_emojiStatusEmpty();
        } else {
            obj = currentUser.emoji_status;
        }
        MessagesController.getInstance(qy0Var.f28317a).updateEmojiStatus(emojiStatus);
        z80 z80Var = new z80(23, this, obj);
        oy0 oy0Var = qy0Var.f28320c;
        if (oy0Var == null) {
            parentFragment = null;
        } else {
            parentFragment = oy0Var.getParentFragment();
        }
        if (parentFragment != null) {
            if (document == null) {
                ac acVar = new ac(qy0Var.getContext(), f6Var);
                acVar.f23359b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
                acVar.f23358a.setImageResource(R.drawable.msg_settings_premium);
                gc gcVar = new gc(qy0Var.getContext(), f6Var, true);
                gcVar.f25112a = z80Var;
                acVar.setButton(gcVar);
                ic.g(parentFragment, acVar, 1500).j();
                return;
            }
            qc.a0(parentFragment).q(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), z80Var).j();
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
    public final void j(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override
    public final void n(String str) {
    }

    @Override
    public final void o(TLRPC.Document document) {
    }

    @Override
    public final void q(TLRPC.Document document) {
    }

    @Override
    public final void r() {
    }

    @Override
    public final void t() {
    }

    @Override
    public final void y(String str) {
    }

    @Override
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z4) {
    }

    @Override
    public final void v(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override
    public final void w(TLObject tLObject, Object obj) {
    }

    @Override
    public final void A(CharSequence charSequence, String str, vk vkVar) {
    }

    @Override
    public final void s(int i10, int i11, Object obj, TLObject tLObject, boolean z4) {
    }

    @Override
    public final void m(TLRPC.Document document, String str, Object obj, boolean z4, int i10, int i11) {
    }
}
