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
public final class hy0 implements org.telegram.ui.qt {
    public final my0 f26890a;

    public hy0(my0 my0Var) {
        this.f26890a = my0Var;
    }

    @Override
    public final boolean A() {
        return false;
    }

    @Override
    public final void B(TLRPC.Document document) {
        my0 my0Var = this.f26890a;
        ky0 ky0Var = my0Var.f28559c;
        if (ky0Var != null) {
            org.telegram.ui.ActionBar.n2 parentFragment = ky0Var.getParentFragment();
            if (parentFragment instanceof org.telegram.ui.co) {
                ((org.telegram.ui.co) parentFragment).bb(document);
                my0Var.f28559c.setFieldText("");
            }
        }
    }

    @Override
    public final boolean C() {
        return false;
    }

    @Override
    public final boolean D(TLRPC.Document document) {
        if (this.f26890a.f28569y) {
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
        ky0 ky0Var;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new z5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (AndroidUtilities.addToClipboard(valueOf) && (ky0Var = this.f26890a.f28559c) != null) {
            org.telegram.messenger.wl.o(R.string.EmojiCopied, yc.a0(ky0Var.getParentFragment()));
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
        if (this.f26890a.E || !UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser()) == null) {
            return null;
        }
        Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(currentUser);
        if (document != null && (emojiStatusDocumentId == null || emojiStatusDocumentId.longValue() != document.f19875id)) {
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
        ky0 ky0Var = this.f26890a.f28559c;
        if (ky0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.n2 parentFragment = ky0Var.getParentFragment();
        if (!(parentFragment instanceof org.telegram.ui.co)) {
            return false;
        }
        return ((org.telegram.ui.co) parentFragment).c();
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
        ky0 ky0Var = this.f26890a.f28559c;
        if (ky0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.n2 parentFragment = ky0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.co) {
            org.telegram.ui.co coVar = (org.telegram.ui.co) parentFragment;
            if (coVar.E6()) {
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    if (coVar.i() != null && UserObject.isUserSelf(coVar.i())) {
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
    public final n70 t(ah.w wVar) {
        return null;
    }

    @Override
    public final void u(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        Object obj;
        org.telegram.ui.ActionBar.n2 parentFragment;
        my0 my0Var = this.f26890a;
        org.telegram.ui.ActionBar.f6 f6Var = my0Var.f28557b;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.f19875id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        if (currentUser == null) {
            obj = new TLRPC.TL_emojiStatusEmpty();
        } else {
            obj = currentUser.emoji_status;
        }
        MessagesController.getInstance(my0Var.f28555a).updateEmojiStatus(emojiStatus);
        jn0 jn0Var = new jn0(12, this, obj);
        ky0 ky0Var = my0Var.f28559c;
        if (ky0Var == null) {
            parentFragment = null;
        } else {
            parentFragment = ky0Var.getParentFragment();
        }
        if (parentFragment != null) {
            if (document == null) {
                ic icVar = new ic(my0Var.getContext(), f6Var);
                icVar.f27070b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
                icVar.f27069a.setImageResource(R.drawable.msg_settings_premium);
                oc ocVar = new oc(my0Var.getContext(), f6Var, true);
                ocVar.f29029a = jn0Var;
                icVar.setButton(ocVar);
                qc.g(parentFragment, icVar, 1500).j();
                return;
            }
            yc.a0(parentFragment).q(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), jn0Var).j();
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
    public final void s() {
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
    public final void r(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
    }
}
