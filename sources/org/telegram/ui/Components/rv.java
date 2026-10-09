package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.FrameLayout;
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
public final class rv implements org.telegram.ui.pt {
    public final iw f30516a;

    public rv(iw iwVar) {
        this.f30516a = iwVar;
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
        iw iwVar = this.f30516a;
        org.telegram.ui.ActionBar.n2 n2Var = iwVar.f27496c;
        if (n2Var instanceof org.telegram.ui.zn) {
            ((org.telegram.ui.zn) n2Var).fb(document);
        }
        iwVar.Z();
        iwVar.dismiss();
    }

    @Override
    public final boolean D() {
        return false;
    }

    @Override
    public final boolean E(TLRPC.Document document) {
        if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() && MessageObject.isAnimatedEmoji(document)) {
            return true;
        }
        return false;
    }

    @Override
    public final String G(boolean z10) {
        return null;
    }

    @Override
    public final void H(TLRPC.Document document) {
        ViewGroup viewGroup;
        org.telegram.ui.ActionBar.e6 e6Var;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new b6(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (AndroidUtilities.addToClipboard(valueOf)) {
            iw iwVar = this.f30516a;
            viewGroup = ((org.telegram.ui.ActionBar.f3) iwVar).containerView;
            e6Var = ((org.telegram.ui.ActionBar.f3) iwVar).resourcesProvider;
            org.telegram.messenger.bi.p(R.string.EmojiCopied, new ad((FrameLayout) viewGroup, e6Var));
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
        if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || !MessageObject.isAnimatedEmoji(document) || (currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser()) == null) {
            return null;
        }
        Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(currentUser);
        if (document != null && (emojiStatusDocumentId == null || emojiStatusDocumentId.longValue() != document.f20044id)) {
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
        org.telegram.ui.ActionBar.n2 n2Var = this.f30516a.f27496c;
        if (n2Var instanceof org.telegram.ui.zn) {
            return ((org.telegram.ui.zn) n2Var).c();
        }
        return false;
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
    public final p80 j(ci.m6 m6Var) {
        return null;
    }

    @Override
    public final boolean l() {
        return false;
    }

    @Override
    public final boolean m(int i10) {
        iw iwVar = this.f30516a;
        org.telegram.ui.ActionBar.n2 n2Var = iwVar.f27496c;
        if ((n2Var instanceof org.telegram.ui.zn) && ((org.telegram.ui.zn) n2Var).H6()) {
            if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                if (((org.telegram.ui.zn) iwVar.f27496c).i() != null && UserObject.isUserSelf(((org.telegram.ui.zn) iwVar.f27496c).i())) {
                    return true;
                }
                return false;
            }
            return true;
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
        int i10;
        ViewGroup viewGroup;
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        org.telegram.ui.ActionBar.e6 e6Var3;
        ViewGroup viewGroup2;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.f20044id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        if (currentUser == null) {
            obj = new TLRPC.TL_emojiStatusEmpty();
        } else {
            obj = currentUser.emoji_status;
        }
        iw iwVar = this.f30516a;
        i10 = ((org.telegram.ui.ActionBar.f3) iwVar).currentAccount;
        MessagesController.getInstance(i10).updateEmojiStatus(emojiStatus);
        zr zrVar = new zr(6, this, obj);
        if (document != null) {
            viewGroup = ((org.telegram.ui.ActionBar.f3) iwVar).containerView;
            e6Var = ((org.telegram.ui.ActionBar.f3) iwVar).resourcesProvider;
            new ad((FrameLayout) viewGroup, e6Var).q(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), zrVar).j();
            return;
        }
        Context context = iwVar.getContext();
        e6Var2 = ((org.telegram.ui.ActionBar.f3) iwVar).resourcesProvider;
        lc lcVar = new lc(context, e6Var2);
        lcVar.f28419b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
        lcVar.f28418a.setImageResource(R.drawable.msg_settings_premium);
        Context context2 = iwVar.getContext();
        e6Var3 = ((org.telegram.ui.ActionBar.f3) iwVar).resourcesProvider;
        rc rcVar = new rc(context2, e6Var3, true);
        rcVar.f30421a = zrVar;
        lcVar.setButton(rcVar);
        viewGroup2 = ((org.telegram.ui.ActionBar.f3) iwVar).containerView;
        tc.f((FrameLayout) viewGroup2, lcVar, 1500).j();
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
