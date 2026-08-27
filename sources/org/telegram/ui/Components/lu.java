package org.telegram.ui.Components;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
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

public final class lu implements org.telegram.ui.ht {

    public final cv f30465a;

    public lu(cv cvVar) {
        this.f30465a = cvVar;
    }

    @Override
    public final void A(TLRPC.Document document) {
        cv cvVar = this.f30465a;
        org.telegram.ui.ActionBar.n2 n2Var = cvVar.f27548c;
        if (n2Var instanceof org.telegram.ui.rn) {
            ((org.telegram.ui.rn) n2Var).bb(document);
        }
        cvVar.Y();
        cvVar.dismiss();
    }

    @Override
    public final boolean B() {
        return false;
    }

    @Override
    public final boolean C(TLRPC.Document document) {
        return UserConfig.getInstance(UserConfig.selectedAccount).isPremium() && MessageObject.isAnimatedEmoji(document);
    }

    @Override
    public final String F(boolean z10) {
        return null;
    }

    @Override
    public final void G(TLRPC.Document document) {
        SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        spannableStringBuilderValueOf.setSpan(new t5(document, (Paint.FontMetricsInt) null), 0, spannableStringBuilderValueOf.length(), 33);
        if (AndroidUtilities.addToClipboard(spannableStringBuilderValueOf)) {
            cv cvVar = this.f30465a;
            org.telegram.messenger.rl.m(R.string.EmojiCopied, new mc((FrameLayout) ((org.telegram.ui.ActionBar.e3) cvVar).containerView, ((org.telegram.ui.ActionBar.e3) cvVar).resourcesProvider));
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
    public final b70 L(ag.y1 y1Var) {
        return null;
    }

    @Override
    public final boolean N(TLRPC.Document document) {
        return false;
    }

    @Override
    public final Boolean P(TLRPC.Document document) {
        TLRPC.User currentUser;
        if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || !MessageObject.isAnimatedEmoji(document) || (currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser()) == null) {
            return null;
        }
        Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(currentUser);
        return Boolean.valueOf(document != null && (emojiStatusDocumentId == null || emojiStatusDocumentId.longValue() != document.f22386id));
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
        org.telegram.ui.ActionBar.n2 n2Var = this.f30465a.f27548c;
        if (n2Var instanceof org.telegram.ui.rn) {
            return ((org.telegram.ui.rn) n2Var).c();
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
        cv cvVar = this.f30465a;
        org.telegram.ui.ActionBar.n2 n2Var = cvVar.f27548c;
        if (!(n2Var instanceof org.telegram.ui.rn) || !((org.telegram.ui.rn) n2Var).E6()) {
            return false;
        }
        if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
            return true;
        }
        return ((org.telegram.ui.rn) cvVar.f27548c).i() != null && UserObject.isUserSelf(((org.telegram.ui.rn) cvVar.f27548c).i());
    }

    @Override
    public final boolean o() {
        return false;
    }

    @Override
    public final void t(TLRPC.Document document) {
        TLRPC.EmojiStatus tL_emojiStatusEmpty;
        if (document == null) {
            tL_emojiStatusEmpty = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.f22386id;
            tL_emojiStatusEmpty = tL_emojiStatus;
        }
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        Object tL_emojiStatusEmpty2 = currentUser == null ? new TLRPC.TL_emojiStatusEmpty() : currentUser.emoji_status;
        cv cvVar = this.f30465a;
        MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) cvVar).currentAccount).updateEmojiStatus(tL_emojiStatusEmpty);
        xq xqVar = new xq(6, this, tL_emojiStatusEmpty2);
        if (document != null) {
            new mc((FrameLayout) ((org.telegram.ui.ActionBar.e3) cvVar).containerView, ((org.telegram.ui.ActionBar.e3) cvVar).resourcesProvider).q(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), xqVar).j();
            return;
        }
        wb wbVar = new wb(cvVar.getContext(), ((org.telegram.ui.ActionBar.e3) cvVar).resourcesProvider);
        wbVar.f34154b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
        wbVar.f34153a.setImageResource(R.drawable.msg_settings_premium);
        cc ccVar = new cc(cvVar.getContext(), ((org.telegram.ui.ActionBar.e3) cvVar).resourcesProvider, true);
        ccVar.f27402a = xqVar;
        wbVar.setButton(ccVar);
        ec.f((FrameLayout) ((org.telegram.ui.ActionBar.e3) cvVar).containerView, wbVar, 1500).j();
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
    public final boolean z() {
        return false;
    }

    @Override
    public final void D(TLRPC.Document document) {
    }

    @Override
    public final void J() {
    }

    @Override
    public final void K() {
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
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override
    public final void u(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override
    public final void v(TLObject tLObject, Object obj) {
    }

    @Override
    public final void E(CharSequence charSequence, String str, org.telegram.ui.df dfVar) {
    }

    @Override
    public final void r(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
    }
}
