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
public final class oz0 implements org.telegram.ui.dt {
    public final tz0 f31394a;

    public oz0(tz0 tz0Var) {
        this.f31394a = tz0Var;
    }

    @Override
    public final boolean A() {
        return false;
    }

    @Override
    public final void B(TLRPC.Document document) {
        tz0 tz0Var = this.f31394a;
        rz0 rz0Var = tz0Var.f33173c;
        if (rz0Var != null) {
            org.telegram.ui.ActionBar.r2 parentFragment = rz0Var.getParentFragment();
            if (parentFragment instanceof org.telegram.ui.un) {
                ((org.telegram.ui.un) parentFragment).lb(document);
                tz0Var.f33173c.setFieldText("");
            }
        }
    }

    @Override
    public final boolean C() {
        return false;
    }

    @Override
    public final boolean D(TLRPC.Document document) {
        if (this.f31394a.f33184y) {
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
        rz0 rz0Var;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new c6(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (AndroidUtilities.addToClipboard(valueOf) && (rz0Var = this.f31394a.f33173c) != null) {
            org.telegram.messenger.vh.m(R.string.EmojiCopied, wc.b0(rz0Var.getParentFragment()));
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
        if (this.f31394a.E || !UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser()) == null) {
            return null;
        }
        Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(currentUser);
        if (document != null && (emojiStatusDocumentId == null || emojiStatusDocumentId.longValue() != document.f22033id)) {
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
        rz0 rz0Var = this.f31394a.f33173c;
        if (rz0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.r2 parentFragment = rz0Var.getParentFragment();
        if (!(parentFragment instanceof org.telegram.ui.un)) {
            return false;
        }
        return ((org.telegram.ui.un) parentFragment).c();
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
    public final k80 i(bh.p pVar) {
        return null;
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final boolean l(int i10) {
        rz0 rz0Var = this.f31394a.f33173c;
        if (rz0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.r2 parentFragment = rz0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.un) {
            org.telegram.ui.un unVar = (org.telegram.ui.un) parentFragment;
            if (unVar.J6()) {
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    if (unVar.i() != null && UserObject.isUserSelf(unVar.i())) {
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
        tz0 tz0Var = this.f31394a;
        org.telegram.ui.ActionBar.u6 u6Var = tz0Var.f33171b;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.f22033id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        if (currentUser == null) {
            obj = new TLRPC.TL_emojiStatusEmpty();
        } else {
            obj = currentUser.emoji_status;
        }
        MessagesController.getInstance(tz0Var.f33169a).updateEmojiStatus(emojiStatus);
        t90 t90Var = new t90(23, this, obj);
        rz0 rz0Var = tz0Var.f33173c;
        if (rz0Var == null) {
            parentFragment = null;
        } else {
            parentFragment = rz0Var.getParentFragment();
        }
        if (parentFragment != null) {
            if (document == null) {
                ic icVar = new ic(tz0Var.getContext(), u6Var);
                icVar.f29274b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
                icVar.f29273a.setImageResource(R.drawable.msg_settings_premium);
                oc ocVar = new oc(tz0Var.getContext(), u6Var, true);
                ocVar.f31253b = t90Var;
                icVar.setButton(ocVar);
                qc.g(parentFragment, icVar, 1500).j();
                return;
            }
            wc.b0(parentFragment).r(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), t90Var).j();
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
