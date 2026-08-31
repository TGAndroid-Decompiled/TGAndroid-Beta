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
public final class my0 implements org.telegram.ui.ot {
    public final ry0 f29262a;

    public my0(ry0 ry0Var) {
        this.f29262a = ry0Var;
    }

    @Override
    public final boolean A() {
        return false;
    }

    @Override
    public final void B(TLRPC.Document document) {
        ry0 ry0Var = this.f29262a;
        py0 py0Var = ry0Var.f30900c;
        if (py0Var != null) {
            org.telegram.ui.ActionBar.p2 parentFragment = py0Var.getParentFragment();
            if (parentFragment instanceof org.telegram.ui.xn) {
                ((org.telegram.ui.xn) parentFragment).bb(document);
                ry0Var.f30900c.setFieldText("");
            }
        }
    }

    @Override
    public final boolean C() {
        return false;
    }

    @Override
    public final boolean D(TLRPC.Document document) {
        if (this.f29262a.f30908y) {
            return false;
        }
        return UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
    }

    @Override
    public final String F(boolean z4) {
        return null;
    }

    @Override
    public final void G(TLRPC.Document document) {
        py0 py0Var;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new u5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (AndroidUtilities.addToClipboard(valueOf) && (py0Var = this.f29262a.f30900c) != null) {
            org.telegram.ui.b.m(R.string.EmojiCopied, qc.a0(py0Var.getParentFragment()));
        }
    }

    @Override
    public final boolean H() {
        return false;
    }

    @Override
    public final q70 I(ag.l lVar) {
        return null;
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
        if (this.f29262a.B || !UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser()) == null) {
            return null;
        }
        Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(currentUser);
        if (document != null && (emojiStatusDocumentId == null || emojiStatusDocumentId.longValue() != document.f20849id)) {
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
        py0 py0Var = this.f29262a.f30900c;
        if (py0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.p2 parentFragment = py0Var.getParentFragment();
        if (!(parentFragment instanceof org.telegram.ui.xn)) {
            return false;
        }
        return ((org.telegram.ui.xn) parentFragment).c();
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
        py0 py0Var = this.f29262a.f30900c;
        if (py0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.p2 parentFragment = py0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.xn) {
            org.telegram.ui.xn xnVar = (org.telegram.ui.xn) parentFragment;
            if (xnVar.E6()) {
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    if (xnVar.i() != null && UserObject.isUserSelf(xnVar.i())) {
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
        ry0 ry0Var = this.f29262a;
        org.telegram.ui.ActionBar.g6 g6Var = ry0Var.f30899b;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.f20849id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        if (currentUser == null) {
            obj = new TLRPC.TL_emojiStatusEmpty();
        } else {
            obj = currentUser.emoji_status;
        }
        MessagesController.getInstance(ry0Var.f30897a).updateEmojiStatus(emojiStatus);
        a90 a90Var = new a90(23, this, obj);
        py0 py0Var = ry0Var.f30900c;
        if (py0Var == null) {
            parentFragment = null;
        } else {
            parentFragment = py0Var.getParentFragment();
        }
        if (parentFragment != null) {
            if (document == null) {
                ac acVar = new ac(ry0Var.getContext(), g6Var);
                acVar.f25219b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
                acVar.f25218a.setImageResource(R.drawable.msg_settings_premium);
                gc gcVar = new gc(ry0Var.getContext(), g6Var, true);
                gcVar.f27161a = a90Var;
                acVar.setButton(gcVar);
                ic.g(parentFragment, acVar, 1500).j();
                return;
            }
            qc.a0(parentFragment).q(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), a90Var).j();
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
    public final void s() {
    }

    @Override
    public final void x(String str) {
    }

    @Override
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z4) {
    }

    @Override
    public final void u(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override
    public final void v(TLObject tLObject, Object obj) {
    }

    @Override
    public final void z(CharSequence charSequence, String str, xk xkVar) {
    }

    @Override
    public final void r(int i10, int i11, Object obj, TLObject tLObject, boolean z4) {
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z4, int i10, int i11) {
    }
}
