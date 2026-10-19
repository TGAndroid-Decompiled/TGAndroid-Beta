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
public final class cz0 implements org.telegram.ui.ct {
    public final hz0 f25368a;

    public cz0(hz0 hz0Var) {
        this.f25368a = hz0Var;
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
        hz0 hz0Var = this.f25368a;
        fz0 fz0Var = hz0Var.f26952c;
        if (fz0Var != null) {
            org.telegram.ui.ActionBar.n2 parentFragment = fz0Var.getParentFragment();
            if (parentFragment instanceof org.telegram.ui.qn) {
                ((org.telegram.ui.qn) parentFragment).fb(document);
                hz0Var.f26952c.setFieldText("");
            }
        }
    }

    @Override
    public final boolean D() {
        return false;
    }

    @Override
    public final boolean E(TLRPC.Document document) {
        if (this.f25368a.f26961y) {
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
        fz0 fz0Var;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new a6(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (AndroidUtilities.addToClipboard(valueOf) && (fz0Var = this.f25368a.f26952c) != null) {
            org.telegram.messenger.kk.p(R.string.EmojiCopied, xc.a0(fz0Var.getParentFragment()));
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
        if (this.f25368a.E || !UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser()) == null) {
            return null;
        }
        Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(currentUser);
        if (document != null && (emojiStatusDocumentId == null || emojiStatusDocumentId.longValue() != document.f20279id)) {
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
        fz0 fz0Var = this.f25368a.f26952c;
        if (fz0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.n2 parentFragment = fz0Var.getParentFragment();
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
    public final boolean k(int i10) {
        fz0 fz0Var = this.f25368a.f26952c;
        if (fz0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.n2 parentFragment = fz0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.qn) {
            org.telegram.ui.qn qnVar = (org.telegram.ui.qn) parentFragment;
            if (qnVar.H6()) {
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
    public final i80 u(ah.v vVar) {
        return null;
    }

    @Override
    public final void v(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        Object obj;
        org.telegram.ui.ActionBar.n2 parentFragment;
        hz0 hz0Var = this.f25368a;
        org.telegram.ui.ActionBar.d6 d6Var = hz0Var.f26950b;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.f20279id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        if (currentUser == null) {
            obj = new TLRPC.TL_emojiStatusEmpty();
        } else {
            obj = currentUser.emoji_status;
        }
        MessagesController.getInstance(hz0Var.f26948a).updateEmojiStatus(emojiStatus);
        go0 go0Var = new go0(12, this, obj);
        fz0 fz0Var = hz0Var.f26952c;
        if (fz0Var == null) {
            parentFragment = null;
        } else {
            parentFragment = fz0Var.getParentFragment();
        }
        if (parentFragment != null) {
            if (document == null) {
                ic icVar = new ic(hz0Var.getContext(), d6Var);
                icVar.f27194b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
                icVar.f27193a.setImageResource(R.drawable.msg_settings_premium);
                oc ocVar = new oc(hz0Var.getContext(), d6Var, true);
                ocVar.f28944a = go0Var;
                icVar.setButton(ocVar);
                qc.g(parentFragment, icVar, 1500).j();
                return;
            }
            xc.a0(parentFragment).r(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), go0Var).j();
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
    public final void t(CharSequence charSequence, String str, qy qyVar) {
    }

    @Override
    public final void r(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
    }
}
