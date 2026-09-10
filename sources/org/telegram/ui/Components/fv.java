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
public final class fv implements org.telegram.ui.rt {
    public final wv f23086a;

    public fv(wv wvVar) {
        this.f23086a = wvVar;
    }

    @Override
    public final void A(TLRPC.Document document) {
        wv wvVar = this.f23086a;
        org.telegram.ui.ActionBar.p2 p2Var = wvVar.f28842c;
        if (p2Var instanceof org.telegram.ui.eo) {
            ((org.telegram.ui.eo) p2Var).bb(document);
        }
        wvVar.Y();
        wvVar.dismiss();
    }

    @Override
    public final boolean B() {
        return false;
    }

    @Override
    public final boolean C(TLRPC.Document document) {
        if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() && MessageObject.isAnimatedEmoji(document)) {
            return true;
        }
        return false;
    }

    @Override
    public final String E(boolean z10) {
        return null;
    }

    @Override
    public final void G(TLRPC.Document document) {
        ViewGroup viewGroup;
        org.telegram.ui.ActionBar.f6 f6Var;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new y5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (AndroidUtilities.addToClipboard(valueOf)) {
            wv wvVar = this.f23086a;
            viewGroup = ((org.telegram.ui.ActionBar.h3) wvVar).containerView;
            f6Var = ((org.telegram.ui.ActionBar.h3) wvVar).resourcesProvider;
            org.telegram.messenger.em.o(R.string.EmojiCopied, new wc((FrameLayout) viewGroup, f6Var));
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
    public final w70 K(bi.n7 n7Var) {
        return null;
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
        if (document != null && (emojiStatusDocumentId == null || emojiStatusDocumentId.longValue() != document.f17201id)) {
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
        org.telegram.ui.ActionBar.p2 p2Var = this.f23086a.f28842c;
        if (p2Var instanceof org.telegram.ui.eo) {
            return ((org.telegram.ui.eo) p2Var).c();
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
        wv wvVar = this.f23086a;
        org.telegram.ui.ActionBar.p2 p2Var = wvVar.f28842c;
        if ((p2Var instanceof org.telegram.ui.eo) && ((org.telegram.ui.eo) p2Var).E6()) {
            if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                if (((org.telegram.ui.eo) wvVar.f28842c).i() != null && UserObject.isUserSelf(((org.telegram.ui.eo) wvVar.f28842c).i())) {
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
    public final void t(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        Object obj;
        int i10;
        ViewGroup viewGroup;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        ViewGroup viewGroup2;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.f17201id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        if (currentUser == null) {
            obj = new TLRPC.TL_emojiStatusEmpty();
        } else {
            obj = currentUser.emoji_status;
        }
        wv wvVar = this.f23086a;
        i10 = ((org.telegram.ui.ActionBar.h3) wvVar).currentAccount;
        MessagesController.getInstance(i10).updateEmojiStatus(emojiStatus);
        ee eeVar = new ee(27, this, obj);
        if (document != null) {
            viewGroup = ((org.telegram.ui.ActionBar.h3) wvVar).containerView;
            f6Var = ((org.telegram.ui.ActionBar.h3) wvVar).resourcesProvider;
            new wc((FrameLayout) viewGroup, f6Var).q(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), eeVar).j();
            return;
        }
        Context context = wvVar.getContext();
        f6Var2 = ((org.telegram.ui.ActionBar.h3) wvVar).resourcesProvider;
        hc hcVar = new hc(context, f6Var2);
        hcVar.f23574b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
        hcVar.f23573a.setImageResource(R.drawable.msg_settings_premium);
        Context context2 = wvVar.getContext();
        f6Var3 = ((org.telegram.ui.ActionBar.h3) wvVar).resourcesProvider;
        nc ncVar = new nc(context2, f6Var3, true);
        ncVar.f25483a = eeVar;
        hcVar.setButton(ncVar);
        viewGroup2 = ((org.telegram.ui.ActionBar.h3) wvVar).containerView;
        pc.f((FrameLayout) viewGroup2, hcVar, 1500).j();
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
    public final void F(CharSequence charSequence, String str, org.telegram.ui.pf pfVar) {
    }

    @Override
    public final void r(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
    }
}
