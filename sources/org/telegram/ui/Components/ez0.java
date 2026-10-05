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
public final class ez0 implements org.telegram.ui.pt {
    public final jz0 f26231a;

    public ez0(jz0 jz0Var) {
        this.f26231a = jz0Var;
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
        jz0 jz0Var = this.f26231a;
        hz0 hz0Var = jz0Var.f28002c;
        if (hz0Var != null) {
            org.telegram.ui.ActionBar.n2 parentFragment = hz0Var.getParentFragment();
            if (parentFragment instanceof org.telegram.ui.yn) {
                ((org.telegram.ui.yn) parentFragment).ab(document);
                jz0Var.f28002c.setFieldText("");
            }
        }
    }

    @Override
    public final boolean D() {
        return false;
    }

    @Override
    public final boolean E(TLRPC.Document document) {
        if (this.f26231a.f28012y) {
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
        hz0 hz0Var;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new z5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (AndroidUtilities.addToClipboard(valueOf) && (hz0Var = this.f26231a.f28002c) != null) {
            org.telegram.messenger.bi.n(R.string.EmojiCopied, yc.a0(hz0Var.getParentFragment()));
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
        if (this.f26231a.E || !UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser()) == null) {
            return null;
        }
        Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(currentUser);
        if (document != null && (emojiStatusDocumentId == null || emojiStatusDocumentId.longValue() != document.f20053id)) {
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
        hz0 hz0Var = this.f26231a.f28002c;
        if (hz0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.n2 parentFragment = hz0Var.getParentFragment();
        if (!(parentFragment instanceof org.telegram.ui.yn)) {
            return false;
        }
        return ((org.telegram.ui.yn) parentFragment).c();
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
    public final b80 j(ci.m6 m6Var) {
        return null;
    }

    @Override
    public final boolean l() {
        return false;
    }

    @Override
    public final boolean m(int i10) {
        hz0 hz0Var = this.f26231a.f28002c;
        if (hz0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.n2 parentFragment = hz0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.yn) {
            org.telegram.ui.yn ynVar = (org.telegram.ui.yn) parentFragment;
            if (ynVar.E6()) {
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    if (ynVar.i() != null && UserObject.isUserSelf(ynVar.i())) {
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
        jz0 jz0Var = this.f26231a;
        org.telegram.ui.ActionBar.d6 d6Var = jz0Var.f28000b;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.f20053id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        if (currentUser == null) {
            obj = new TLRPC.TL_emojiStatusEmpty();
        } else {
            obj = currentUser.emoji_status;
        }
        MessagesController.getInstance(jz0Var.f27998a).updateEmojiStatus(emojiStatus);
        vo0 vo0Var = new vo0(10, this, obj);
        hz0 hz0Var = jz0Var.f28002c;
        if (hz0Var == null) {
            parentFragment = null;
        } else {
            parentFragment = hz0Var.getParentFragment();
        }
        if (parentFragment != null) {
            if (document == null) {
                jc jcVar = new jc(jz0Var.getContext(), d6Var);
                jcVar.f27793b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
                jcVar.f27792a.setImageResource(R.drawable.msg_settings_premium);
                pc pcVar = new pc(jz0Var.getContext(), d6Var, true);
                pcVar.f29693a = vo0Var;
                jcVar.setButton(pcVar);
                rc.g(parentFragment, jcVar, 1500).j();
                return;
            }
            yc.a0(parentFragment).q(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), vo0Var).j();
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
