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
public final class su implements org.telegram.ui.ft {
    public final jv f32719a;

    public su(jv jvVar) {
        this.f32719a = jvVar;
    }

    @Override
    public final void A(TLRPC.Document document) {
        jv jvVar = this.f32719a;
        org.telegram.ui.ActionBar.o2 o2Var = jvVar.f29824c;
        if (o2Var instanceof org.telegram.ui.tn) {
            ((org.telegram.ui.tn) o2Var).bb(document);
        }
        jvVar.Y();
        jvVar.dismiss();
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
    public final j70 G(bg.d1 d1Var) {
        return null;
    }

    @Override
    public final void H(TLRPC.Document document) {
        ViewGroup viewGroup;
        org.telegram.ui.ActionBar.c6 c6Var;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new y5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (AndroidUtilities.addToClipboard(valueOf)) {
            jv jvVar = this.f32719a;
            viewGroup = ((org.telegram.ui.ActionBar.f3) jvVar).containerView;
            c6Var = ((org.telegram.ui.ActionBar.f3) jvVar).resourcesProvider;
            org.telegram.ui.b.n(R.string.EmojiCopied, new tc((FrameLayout) viewGroup, c6Var));
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
        if (document != null && (emojiStatusDocumentId == null || emojiStatusDocumentId.longValue() != document.f22398id)) {
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
        org.telegram.ui.ActionBar.o2 o2Var = this.f32719a.f29824c;
        if (o2Var instanceof org.telegram.ui.tn) {
            return ((org.telegram.ui.tn) o2Var).c();
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
        jv jvVar = this.f32719a;
        org.telegram.ui.ActionBar.o2 o2Var = jvVar.f29824c;
        if ((o2Var instanceof org.telegram.ui.tn) && ((org.telegram.ui.tn) o2Var).E6()) {
            if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                if (((org.telegram.ui.tn) jvVar.f29824c).i() != null && UserObject.isUserSelf(((org.telegram.ui.tn) jvVar.f29824c).i())) {
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
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        org.telegram.ui.ActionBar.c6 c6Var3;
        ViewGroup viewGroup2;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.f22398id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        if (currentUser == null) {
            obj = new TLRPC.TL_emojiStatusEmpty();
        } else {
            obj = currentUser.emoji_status;
        }
        jv jvVar = this.f32719a;
        i10 = ((org.telegram.ui.ActionBar.f3) jvVar).currentAccount;
        MessagesController.getInstance(i10).updateEmojiStatus(emojiStatus);
        gt gtVar = new gt(3, this, obj);
        if (document != null) {
            viewGroup = ((org.telegram.ui.ActionBar.f3) jvVar).containerView;
            c6Var = ((org.telegram.ui.ActionBar.f3) jvVar).resourcesProvider;
            new tc((FrameLayout) viewGroup, c6Var).q(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), gtVar).j();
            return;
        }
        Context context = jvVar.getContext();
        c6Var2 = ((org.telegram.ui.ActionBar.f3) jvVar).resourcesProvider;
        ec ecVar = new ec(context, c6Var2);
        ecVar.f28000b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
        ecVar.f27999a.setImageResource(R.drawable.msg_settings_premium);
        Context context2 = jvVar.getContext();
        c6Var3 = ((org.telegram.ui.ActionBar.f3) jvVar).resourcesProvider;
        kc kcVar = new kc(context2, c6Var3, true);
        kcVar.f30007a = gtVar;
        ecVar.setButton(kcVar);
        viewGroup2 = ((org.telegram.ui.ActionBar.f3) jvVar).containerView;
        mc.f((FrameLayout) viewGroup2, ecVar, 1500).j();
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
    public final void F(CharSequence charSequence, String str, org.telegram.ui.tm tmVar) {
    }

    @Override
    public final void r(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
    }
}
