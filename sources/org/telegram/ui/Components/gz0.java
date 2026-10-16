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
public final class gz0 implements org.telegram.ui.vt {
    public final lz0 f25127a;

    public gz0(lz0 lz0Var) {
        this.f25127a = lz0Var;
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
        lz0 lz0Var = this.f25127a;
        jz0 jz0Var = lz0Var.f26851c;
        if (jz0Var != null) {
            org.telegram.ui.ActionBar.m2 parentFragment = jz0Var.getParentFragment();
            if (parentFragment instanceof org.telegram.ui.fo) {
                ((org.telegram.ui.fo) parentFragment).fb(document);
                lz0Var.f26851c.setFieldText("");
            }
        }
    }

    @Override
    public final boolean D() {
        return false;
    }

    @Override
    public final boolean E(TLRPC.Document document) {
        if (this.f25127a.f26860y) {
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
        jz0 jz0Var;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new b6(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (AndroidUtilities.addToClipboard(valueOf) && (jz0Var = this.f25127a.f26851c) != null) {
            org.telegram.messenger.sk.p(R.string.EmojiCopied, zc.a0(jz0Var.getParentFragment()));
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
        if (this.f25127a.E || !UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser()) == null) {
            return null;
        }
        Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(currentUser);
        if (document != null && (emojiStatusDocumentId == null || emojiStatusDocumentId.longValue() != document.f18922id)) {
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
        jz0 jz0Var = this.f25127a.f26851c;
        if (jz0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.m2 parentFragment = jz0Var.getParentFragment();
        if (!(parentFragment instanceof org.telegram.ui.fo)) {
            return false;
        }
        return ((org.telegram.ui.fo) parentFragment).c();
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
    public final boolean k() {
        return false;
    }

    @Override
    public final boolean l(int i10) {
        jz0 jz0Var = this.f25127a.f26851c;
        if (jz0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.m2 parentFragment = jz0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.fo) {
            org.telegram.ui.fo foVar = (org.telegram.ui.fo) parentFragment;
            if (foVar.H6()) {
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    if (foVar.i() != null && UserObject.isUserSelf(foVar.i())) {
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
    public final l80 u(ah.v vVar) {
        return null;
    }

    @Override
    public final void v(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        Object obj;
        org.telegram.ui.ActionBar.m2 parentFragment;
        lz0 lz0Var = this.f25127a;
        org.telegram.ui.ActionBar.c6 c6Var = lz0Var.f26849b;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.f18922id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        if (currentUser == null) {
            obj = new TLRPC.TL_emojiStatusEmpty();
        } else {
            obj = currentUser.emoji_status;
        }
        MessagesController.getInstance(lz0Var.f26847a).updateEmojiStatus(emojiStatus);
        g90 g90Var = new g90(24, this, obj);
        jz0 jz0Var = lz0Var.f26851c;
        if (jz0Var == null) {
            parentFragment = null;
        } else {
            parentFragment = jz0Var.getParentFragment();
        }
        if (parentFragment != null) {
            if (document == null) {
                kc kcVar = new kc(lz0Var.getContext(), c6Var);
                kcVar.f26348b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
                kcVar.f26347a.setImageResource(R.drawable.msg_settings_premium);
                qc qcVar = new qc(lz0Var.getContext(), c6Var, true);
                qcVar.f28266a = g90Var;
                kcVar.setButton(qcVar);
                sc.g(parentFragment, kcVar, 1500).j();
                return;
            }
            zc.a0(parentFragment).q(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), g90Var).j();
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
    public final void f(CharSequence charSequence, String str, org.telegram.ui.mt mtVar) {
    }

    @Override
    public final void s(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void m(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
    }
}
