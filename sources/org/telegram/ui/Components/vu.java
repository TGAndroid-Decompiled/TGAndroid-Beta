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
public final class vu implements org.telegram.ui.nt {
    public final mv f30088a;

    public vu(mv mvVar) {
        this.f30088a = mvVar;
    }

    @Override
    public final boolean B() {
        return false;
    }

    @Override
    public final void C(TLRPC.Document document) {
        mv mvVar = this.f30088a;
        org.telegram.ui.ActionBar.p2 p2Var = mvVar.f27124c;
        if (p2Var instanceof org.telegram.ui.xn) {
            ((org.telegram.ui.xn) p2Var).bb(document);
        }
        mvVar.Y();
        mvVar.dismiss();
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
    public final String G(boolean z4) {
        return null;
    }

    @Override
    public final void H(TLRPC.Document document) {
        ViewGroup viewGroup;
        org.telegram.ui.ActionBar.f6 f6Var;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new u5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (AndroidUtilities.addToClipboard(valueOf)) {
            mv mvVar = this.f30088a;
            viewGroup = ((org.telegram.ui.ActionBar.g3) mvVar).containerView;
            f6Var = ((org.telegram.ui.ActionBar.g3) mvVar).resourcesProvider;
            org.telegram.ui.b.m(R.string.EmojiCopied, new qc((FrameLayout) viewGroup, f6Var));
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
        boolean z4;
        if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || !MessageObject.isAnimatedEmoji(document) || (currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser()) == null) {
            return null;
        }
        Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(currentUser);
        if (document != null && (emojiStatusDocumentId == null || emojiStatusDocumentId.longValue() != document.f19190id)) {
            z4 = true;
        } else {
            z4 = false;
        }
        return Boolean.valueOf(z4);
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
        org.telegram.ui.ActionBar.p2 p2Var = this.f30088a.f27124c;
        if (p2Var instanceof org.telegram.ui.xn) {
            return ((org.telegram.ui.xn) p2Var).c();
        }
        return false;
    }

    @Override
    public final o70 d(ah.d dVar) {
        return null;
    }

    @Override
    public final TLRPC.TL_messageMediaPoll e() {
        return null;
    }

    @Override
    public final boolean f(TLRPC.Document document) {
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
    public final boolean k() {
        return false;
    }

    @Override
    public final boolean l(int i10) {
        mv mvVar = this.f30088a;
        org.telegram.ui.ActionBar.p2 p2Var = mvVar.f27124c;
        if ((p2Var instanceof org.telegram.ui.xn) && ((org.telegram.ui.xn) p2Var).E6()) {
            if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                if (((org.telegram.ui.xn) mvVar.f27124c).i() != null && UserObject.isUserSelf(((org.telegram.ui.xn) mvVar.f27124c).i())) {
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
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        ViewGroup viewGroup2;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.f19190id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        if (currentUser == null) {
            obj = new TLRPC.TL_emojiStatusEmpty();
        } else {
            obj = currentUser.emoji_status;
        }
        mv mvVar = this.f30088a;
        i10 = ((org.telegram.ui.ActionBar.g3) mvVar).currentAccount;
        MessagesController.getInstance(i10).updateEmojiStatus(emojiStatus);
        il ilVar = new il(12, this, obj);
        if (document != null) {
            viewGroup = ((org.telegram.ui.ActionBar.g3) mvVar).containerView;
            f6Var = ((org.telegram.ui.ActionBar.g3) mvVar).resourcesProvider;
            new qc((FrameLayout) viewGroup, f6Var).q(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), ilVar).j();
            return;
        }
        Context context = mvVar.getContext();
        f6Var2 = ((org.telegram.ui.ActionBar.g3) mvVar).resourcesProvider;
        ac acVar = new ac(context, f6Var2);
        acVar.f23342b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
        acVar.f23341a.setImageResource(R.drawable.msg_settings_premium);
        Context context2 = mvVar.getContext();
        f6Var3 = ((org.telegram.ui.ActionBar.g3) mvVar).resourcesProvider;
        gc gcVar = new gc(context2, f6Var3, true);
        gcVar.f25097a = ilVar;
        acVar.setButton(gcVar);
        viewGroup2 = ((org.telegram.ui.ActionBar.g3) mvVar).containerView;
        ic.f((FrameLayout) viewGroup2, acVar, 1500).j();
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
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z4) {
    }

    @Override
    public final void v(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override
    public final void w(TLObject tLObject, Object obj) {
    }

    @Override
    public final void A(CharSequence charSequence, String str, vk vkVar) {
    }

    @Override
    public final void s(int i10, int i11, Object obj, TLObject tLObject, boolean z4) {
    }

    @Override
    public final void m(TLRPC.Document document, String str, Object obj, boolean z4, int i10, int i11) {
    }
}
