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
public final class iv implements org.telegram.ui.ct {
    public final aw f27360a;

    public iv(aw awVar) {
        this.f27360a = awVar;
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
        aw awVar = this.f27360a;
        org.telegram.ui.ActionBar.n2 n2Var = awVar.f24713c;
        if (n2Var instanceof org.telegram.ui.qn) {
            ((org.telegram.ui.qn) n2Var).fb(document);
        }
        awVar.Z();
        awVar.dismiss();
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
        org.telegram.ui.ActionBar.d6 d6Var;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new a6(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (AndroidUtilities.addToClipboard(valueOf)) {
            aw awVar = this.f27360a;
            viewGroup = ((org.telegram.ui.ActionBar.f3) awVar).containerView;
            d6Var = ((org.telegram.ui.ActionBar.f3) awVar).resourcesProvider;
            org.telegram.messenger.kk.p(R.string.EmojiCopied, new xc((FrameLayout) viewGroup, d6Var));
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
        org.telegram.ui.ActionBar.n2 n2Var = this.f27360a.f24713c;
        if (n2Var instanceof org.telegram.ui.qn) {
            return ((org.telegram.ui.qn) n2Var).c();
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
        aw awVar = this.f27360a;
        org.telegram.ui.ActionBar.n2 n2Var = awVar.f24713c;
        if ((n2Var instanceof org.telegram.ui.qn) && ((org.telegram.ui.qn) n2Var).H6()) {
            if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                if (((org.telegram.ui.qn) awVar.f24713c).i() != null && UserObject.isUserSelf(((org.telegram.ui.qn) awVar.f24713c).i())) {
                    return true;
                }
                return false;
            }
            return true;
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
        int i10;
        ViewGroup viewGroup;
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        org.telegram.ui.ActionBar.d6 d6Var3;
        ViewGroup viewGroup2;
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
        aw awVar = this.f27360a;
        i10 = ((org.telegram.ui.ActionBar.f3) awVar).currentAccount;
        MessagesController.getInstance(i10).updateEmojiStatus(emojiStatus);
        yt ytVar = new yt(1, this, obj);
        if (document != null) {
            viewGroup = ((org.telegram.ui.ActionBar.f3) awVar).containerView;
            d6Var = ((org.telegram.ui.ActionBar.f3) awVar).resourcesProvider;
            new xc((FrameLayout) viewGroup, d6Var).r(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), ytVar).j();
            return;
        }
        Context context = awVar.getContext();
        d6Var2 = ((org.telegram.ui.ActionBar.f3) awVar).resourcesProvider;
        ic icVar = new ic(context, d6Var2);
        icVar.f27194b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
        icVar.f27193a.setImageResource(R.drawable.msg_settings_premium);
        Context context2 = awVar.getContext();
        d6Var3 = ((org.telegram.ui.ActionBar.f3) awVar).resourcesProvider;
        oc ocVar = new oc(context2, d6Var3, true);
        ocVar.f28944a = ytVar;
        icVar.setButton(ocVar);
        viewGroup2 = ((org.telegram.ui.ActionBar.f3) awVar).containerView;
        qc.f((FrameLayout) viewGroup2, icVar, 1500).j();
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
