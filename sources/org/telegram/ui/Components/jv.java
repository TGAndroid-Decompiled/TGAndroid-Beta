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
public final class jv implements org.telegram.ui.dt {
    public final aw f29726a;

    public jv(aw awVar) {
        this.f29726a = awVar;
    }

    @Override
    public final boolean A() {
        return false;
    }

    @Override
    public final void B(TLRPC.Document document) {
        aw awVar = this.f29726a;
        org.telegram.ui.ActionBar.r2 r2Var = awVar.f26626c;
        if (r2Var instanceof org.telegram.ui.un) {
            ((org.telegram.ui.un) r2Var).lb(document);
        }
        awVar.i0();
        awVar.dismiss();
    }

    @Override
    public final boolean C() {
        return false;
    }

    @Override
    public final boolean D(TLRPC.Document document) {
        if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() && MessageObject.isAnimatedEmoji(document)) {
            return true;
        }
        return false;
    }

    @Override
    public final String F(boolean z10) {
        return null;
    }

    @Override
    public final void G(TLRPC.Document document) {
        ViewGroup viewGroup;
        org.telegram.ui.ActionBar.u6 u6Var;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new c6(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (AndroidUtilities.addToClipboard(valueOf)) {
            aw awVar = this.f29726a;
            viewGroup = ((org.telegram.ui.ActionBar.k3) awVar).containerView;
            u6Var = ((org.telegram.ui.ActionBar.k3) awVar).resourcesProvider;
            org.telegram.messenger.vh.m(R.string.EmojiCopied, new wc((FrameLayout) viewGroup, u6Var));
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
        if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || !MessageObject.isAnimatedEmoji(document) || (currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser()) == null) {
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
        org.telegram.ui.ActionBar.r2 r2Var = this.f29726a.f26626c;
        if (r2Var instanceof org.telegram.ui.un) {
            return ((org.telegram.ui.un) r2Var).c();
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
    public final k80 i(bh.p pVar) {
        return null;
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final boolean l(int i10) {
        aw awVar = this.f29726a;
        org.telegram.ui.ActionBar.r2 r2Var = awVar.f26626c;
        if ((r2Var instanceof org.telegram.ui.un) && ((org.telegram.ui.un) r2Var).J6()) {
            if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                if (((org.telegram.ui.un) awVar.f26626c).i() != null && UserObject.isUserSelf(((org.telegram.ui.un) awVar.f26626c).i())) {
                    return true;
                }
                return false;
            }
            return true;
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
        int i10;
        ViewGroup viewGroup;
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.ActionBar.u6 u6Var2;
        org.telegram.ui.ActionBar.u6 u6Var3;
        ViewGroup viewGroup2;
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
        aw awVar = this.f29726a;
        i10 = ((org.telegram.ui.ActionBar.k3) awVar).currentAccount;
        MessagesController.getInstance(i10).updateEmojiStatus(emojiStatus);
        so soVar = new so(11, this, obj);
        if (document != null) {
            viewGroup = ((org.telegram.ui.ActionBar.k3) awVar).containerView;
            u6Var = ((org.telegram.ui.ActionBar.k3) awVar).resourcesProvider;
            new wc((FrameLayout) viewGroup, u6Var).r(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), soVar).j();
            return;
        }
        Context context = awVar.getContext();
        u6Var2 = ((org.telegram.ui.ActionBar.k3) awVar).resourcesProvider;
        ic icVar = new ic(context, u6Var2);
        icVar.f29276b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
        icVar.f29275a.setImageResource(R.drawable.msg_settings_premium);
        Context context2 = awVar.getContext();
        u6Var3 = ((org.telegram.ui.ActionBar.k3) awVar).resourcesProvider;
        oc ocVar = new oc(context2, u6Var3, true);
        ocVar.f31255b = soVar;
        icVar.setButton(ocVar);
        viewGroup2 = ((org.telegram.ui.ActionBar.k3) awVar).containerView;
        qc.f((FrameLayout) viewGroup2, icVar, 1500).j();
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
