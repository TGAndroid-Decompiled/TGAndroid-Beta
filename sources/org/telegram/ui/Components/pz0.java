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
public final class pz0 implements org.telegram.ui.ft {
    public final uz0 f31730a;

    public pz0(uz0 uz0Var) {
        this.f31730a = uz0Var;
    }

    @Override
    public final boolean A() {
        return false;
    }

    @Override
    public final void B(TLRPC.Document document) {
        uz0 uz0Var = this.f31730a;
        sz0 sz0Var = uz0Var.f33489c;
        if (sz0Var != null) {
            org.telegram.ui.ActionBar.r2 parentFragment = sz0Var.getParentFragment();
            if (parentFragment instanceof org.telegram.ui.wn) {
                ((org.telegram.ui.wn) parentFragment).pb(document);
                uz0Var.f33489c.setFieldText("");
            }
        }
    }

    @Override
    public final boolean C() {
        return false;
    }

    @Override
    public final boolean D(TLRPC.Document document) {
        if (this.f31730a.f33500y) {
            return false;
        }
        return UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
    }

    @Override
    public final String F(boolean z10) {
        return null;
    }

    @Override
    public final void G(TLRPC.Document document) {
        sz0 sz0Var;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new c6(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (AndroidUtilities.addToClipboard(valueOf) && (sz0Var = this.f31730a.f33489c) != null) {
            org.telegram.messenger.wh.m(R.string.EmojiCopied, wc.b0(sz0Var.getParentFragment()));
        }
    }

    @Override
    public final boolean H() {
        return false;
    }

    @Override
    public final boolean I() {
        return false;
    }

    @Override
    public final boolean M(TLRPC.Document document) {
        return false;
    }

    @Override
    public final Boolean P(TLRPC.Document document) {
        TLRPC.User currentUser;
        boolean z10;
        if (this.f31730a.E || !UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser()) == null) {
            return null;
        }
        Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(currentUser);
        if (document != null && (emojiStatusDocumentId == null || emojiStatusDocumentId.longValue() != document.f22034id)) {
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
        sz0 sz0Var = this.f31730a.f33489c;
        if (sz0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.r2 parentFragment = sz0Var.getParentFragment();
        if (!(parentFragment instanceof org.telegram.ui.wn)) {
            return false;
        }
        return ((org.telegram.ui.wn) parentFragment).c();
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
    public final l80 i(bh.p pVar) {
        return null;
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final boolean l(int i10) {
        sz0 sz0Var = this.f31730a.f33489c;
        if (sz0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.r2 parentFragment = sz0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.wn) {
            org.telegram.ui.wn wnVar = (org.telegram.ui.wn) parentFragment;
            if (wnVar.L6()) {
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    if (wnVar.i() != null && UserObject.isUserSelf(wnVar.i())) {
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
        org.telegram.ui.ActionBar.r2 parentFragment;
        uz0 uz0Var = this.f31730a;
        org.telegram.ui.ActionBar.u6 u6Var = uz0Var.f33487b;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.f22034id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        if (currentUser == null) {
            obj = new TLRPC.TL_emojiStatusEmpty();
        } else {
            obj = currentUser.emoji_status;
        }
        MessagesController.getInstance(uz0Var.f33485a).updateEmojiStatus(emojiStatus);
        u90 u90Var = new u90(23, this, obj);
        sz0 sz0Var = uz0Var.f33489c;
        if (sz0Var == null) {
            parentFragment = null;
        } else {
            parentFragment = sz0Var.getParentFragment();
        }
        if (parentFragment != null) {
            if (document == null) {
                ic icVar = new ic(uz0Var.getContext(), u6Var);
                icVar.f29300b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
                icVar.f29299a.setImageResource(R.drawable.msg_settings_premium);
                oc ocVar = new oc(uz0Var.getContext(), u6Var, true);
                ocVar.f31259b = u90Var;
                icVar.setButton(ocVar);
                qc.g(parentFragment, icVar, 1500).j();
                return;
            }
            wc.b0(parentFragment).r(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), u90Var).j();
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
    public final void J() {
    }

    @Override
    public final void K() {
    }

    @Override
    public final void r() {
    }

    @Override
    public final void t() {
    }

    @Override
    public final void E(TLRPC.Document document) {
    }

    @Override
    public final void N(String str) {
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
    public final void y(String str) {
    }

    @Override
    public final void L(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override
    public final void v(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override
    public final void w(TLObject tLObject, Object obj) {
    }

    @Override
    public final void O(CharSequence charSequence, String str, oy oyVar) {
    }

    @Override
    public final void s(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void m(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
    }
}
