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
public final class jy0 implements org.telegram.ui.st {
    public final oy0 f25466a;

    public jy0(oy0 oy0Var) {
        this.f25466a = oy0Var;
    }

    @Override
    public final boolean A() {
        return false;
    }

    @Override
    public final void B(TLRPC.Document document) {
        oy0 oy0Var = this.f25466a;
        my0 my0Var = oy0Var.f26886c;
        if (my0Var != null) {
            org.telegram.ui.ActionBar.o2 parentFragment = my0Var.getParentFragment();
            if (parentFragment instanceof org.telegram.ui.bo) {
                ((org.telegram.ui.bo) parentFragment).bb(document);
                oy0Var.f26886c.setFieldText("");
            }
        }
    }

    @Override
    public final boolean C() {
        return false;
    }

    @Override
    public final boolean D(TLRPC.Document document) {
        if (this.f25466a.f26895y) {
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
        my0 my0Var;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new x5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (AndroidUtilities.addToClipboard(valueOf) && (my0Var = this.f25466a.f26886c) != null) {
            org.telegram.messenger.wl.o(R.string.EmojiCopied, vc.a0(my0Var.getParentFragment()));
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
        if (this.f25466a.E || !UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser()) == null) {
            return null;
        }
        Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(currentUser);
        if (document != null && (emojiStatusDocumentId == null || emojiStatusDocumentId.longValue() != document.f18127id)) {
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
        my0 my0Var = this.f25466a.f26886c;
        if (my0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.o2 parentFragment = my0Var.getParentFragment();
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
        my0 my0Var = this.f25466a.f26886c;
        if (my0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.o2 parentFragment = my0Var.getParentFragment();
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
        org.telegram.ui.ActionBar.o2 parentFragment;
        oy0 oy0Var = this.f25466a;
        org.telegram.ui.ActionBar.f6 f6Var = oy0Var.f26884b;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.f18127id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        if (currentUser == null) {
            obj = new TLRPC.TL_emojiStatusEmpty();
        } else {
            obj = currentUser.emoji_status;
        }
        MessagesController.getInstance(oy0Var.f26882a).updateEmojiStatus(emojiStatus);
        br0 br0Var = new br0(6, this, obj);
        my0 my0Var = oy0Var.f26886c;
        if (my0Var == null) {
            parentFragment = null;
        } else {
            parentFragment = my0Var.getParentFragment();
        }
        if (parentFragment != null) {
            if (document == null) {
                gc gcVar = new gc(oy0Var.getContext(), f6Var);
                gcVar.f24166b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
                gcVar.f24165a.setImageResource(R.drawable.msg_settings_premium);
                mc mcVar = new mc(oy0Var.getContext(), f6Var, true);
                mcVar.f26122a = br0Var;
                gcVar.setButton(mcVar);
                oc.g(parentFragment, gcVar, 1500).j();
                return;
            }
            vc.a0(parentFragment).q(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), br0Var).j();
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
    public final void G(CharSequence charSequence, String str, org.telegram.ui.pf pfVar) {
    }

    @Override
    public final void s(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void m(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
    }
}
