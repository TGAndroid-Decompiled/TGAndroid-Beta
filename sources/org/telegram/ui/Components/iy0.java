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
public final class iy0 implements org.telegram.ui.qt {
    public final ny0 f25168a;

    public iy0(ny0 ny0Var) {
        this.f25168a = ny0Var;
    }

    @Override
    public final boolean A() {
        return false;
    }

    @Override
    public final void B(TLRPC.Document document) {
        ny0 ny0Var = this.f25168a;
        ly0 ly0Var = ny0Var.f26618c;
        if (ly0Var != null) {
            org.telegram.ui.ActionBar.n2 parentFragment = ly0Var.getParentFragment();
            if (parentFragment instanceof org.telegram.ui.bo) {
                ((org.telegram.ui.bo) parentFragment).bb(document);
                ny0Var.f26618c.setFieldText("");
            }
        }
    }

    @Override
    public final boolean C() {
        return false;
    }

    @Override
    public final boolean D(TLRPC.Document document) {
        if (this.f25168a.f26627y) {
            return false;
        }
        return UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
    }

    @Override
    public final String F(boolean z10) {
        return null;
    }

    @Override
    public final void H(TLRPC.Document document) {
        ly0 ly0Var;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new x5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (AndroidUtilities.addToClipboard(valueOf) && (ly0Var = this.f25168a.f26618c) != null) {
            org.telegram.messenger.wl.o(R.string.EmojiCopied, vc.a0(ly0Var.getParentFragment()));
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
        if (this.f25168a.E || !UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser()) == null) {
            return null;
        }
        Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(currentUser);
        if (document != null && (emojiStatusDocumentId == null || emojiStatusDocumentId.longValue() != document.f18118id)) {
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
        ly0 ly0Var = this.f25168a.f26618c;
        if (ly0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.n2 parentFragment = ly0Var.getParentFragment();
        if (!(parentFragment instanceof org.telegram.ui.bo)) {
            return false;
        }
        return ((org.telegram.ui.bo) parentFragment).c();
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
    public final n70 i(ci.n6 n6Var) {
        return null;
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final boolean l(int i10) {
        ly0 ly0Var = this.f25168a.f26618c;
        if (ly0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.n2 parentFragment = ly0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.bo) {
            org.telegram.ui.bo boVar = (org.telegram.ui.bo) parentFragment;
            if (boVar.E6()) {
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    if (boVar.i() != null && UserObject.isUserSelf(boVar.i())) {
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
        org.telegram.ui.ActionBar.n2 parentFragment;
        ny0 ny0Var = this.f25168a;
        org.telegram.ui.ActionBar.e6 e6Var = ny0Var.f26616b;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.f18118id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        if (currentUser == null) {
            obj = new TLRPC.TL_emojiStatusEmpty();
        } else {
            obj = currentUser.emoji_status;
        }
        MessagesController.getInstance(ny0Var.f26614a).updateEmojiStatus(emojiStatus);
        ar0 ar0Var = new ar0(6, this, obj);
        ly0 ly0Var = ny0Var.f26618c;
        if (ly0Var == null) {
            parentFragment = null;
        } else {
            parentFragment = ly0Var.getParentFragment();
        }
        if (parentFragment != null) {
            if (document == null) {
                gc gcVar = new gc(ny0Var.getContext(), e6Var);
                gcVar.f24297b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
                gcVar.f24296a.setImageResource(R.drawable.msg_settings_premium);
                mc mcVar = new mc(ny0Var.getContext(), e6Var, true);
                mcVar.f26137a = ar0Var;
                gcVar.setButton(mcVar);
                oc.g(parentFragment, gcVar, 1500).j();
                return;
            }
            vc.a0(parentFragment).q(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), ar0Var).j();
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
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override
    public final void v(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override
    public final void w(TLObject tLObject, Object obj) {
    }

    @Override
    public final void G(CharSequence charSequence, String str, org.telegram.ui.nf nfVar) {
    }

    @Override
    public final void s(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void m(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
    }
}
