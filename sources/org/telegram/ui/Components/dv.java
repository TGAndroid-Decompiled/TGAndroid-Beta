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
public final class dv implements org.telegram.ui.ot {
    public final uv f23733a;

    public dv(uv uvVar) {
        this.f23733a = uvVar;
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
        uv uvVar = this.f23733a;
        org.telegram.ui.ActionBar.o2 o2Var = uvVar.f28944c;
        if (o2Var instanceof org.telegram.ui.xn) {
            ((org.telegram.ui.xn) o2Var).bb(document);
        }
        uvVar.Y();
        uvVar.dismiss();
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
        valueOf.setSpan(new z5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (AndroidUtilities.addToClipboard(valueOf)) {
            uv uvVar = this.f23733a;
            viewGroup = ((org.telegram.ui.ActionBar.g3) uvVar).containerView;
            e6Var = ((org.telegram.ui.ActionBar.g3) uvVar).resourcesProvider;
            org.telegram.messenger.qk.o(R.string.EmojiCopied, new xc((FrameLayout) viewGroup, e6Var));
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
        if (document != null && (emojiStatusDocumentId == null || emojiStatusDocumentId.longValue() != document.f18335id)) {
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
        org.telegram.ui.ActionBar.o2 o2Var = this.f23733a.f28944c;
        if (o2Var instanceof org.telegram.ui.xn) {
            return ((org.telegram.ui.xn) o2Var).c();
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
    public final a80 j(ci.m6 m6Var) {
        return null;
    }

    @Override
    public final boolean l() {
        return false;
    }

    @Override
    public final boolean m(int i10) {
        uv uvVar = this.f23733a;
        org.telegram.ui.ActionBar.o2 o2Var = uvVar.f28944c;
        if ((o2Var instanceof org.telegram.ui.xn) && ((org.telegram.ui.xn) o2Var).E6()) {
            if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                if (((org.telegram.ui.xn) uvVar.f28944c).i() != null && UserObject.isUserSelf(((org.telegram.ui.xn) uvVar.f28944c).i())) {
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
            tL_emojiStatus.document_id = document.f18335id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        if (currentUser == null) {
            obj = new TLRPC.TL_emojiStatusEmpty();
        } else {
            obj = currentUser.emoji_status;
        }
        uv uvVar = this.f23733a;
        i10 = ((org.telegram.ui.ActionBar.g3) uvVar).currentAccount;
        MessagesController.getInstance(i10).updateEmojiStatus(emojiStatus);
        fe feVar = new fe(26, this, obj);
        if (document != null) {
            viewGroup = ((org.telegram.ui.ActionBar.g3) uvVar).containerView;
            e6Var = ((org.telegram.ui.ActionBar.g3) uvVar).resourcesProvider;
            new xc((FrameLayout) viewGroup, e6Var).q(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), feVar).j();
            return;
        }
        Context context = uvVar.getContext();
        e6Var2 = ((org.telegram.ui.ActionBar.g3) uvVar).resourcesProvider;
        ic icVar = new ic(context, e6Var2);
        icVar.f25084b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
        icVar.f25083a.setImageResource(R.drawable.msg_settings_premium);
        Context context2 = uvVar.getContext();
        e6Var3 = ((org.telegram.ui.ActionBar.g3) uvVar).resourcesProvider;
        oc ocVar = new oc(context2, e6Var3, true);
        ocVar.f27063a = feVar;
        icVar.setButton(ocVar);
        viewGroup2 = ((org.telegram.ui.ActionBar.g3) uvVar).containerView;
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
    public final void f(CharSequence charSequence, String str, org.telegram.ui.et etVar) {
    }

    @Override
    public final void t(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void n(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
    }
}
