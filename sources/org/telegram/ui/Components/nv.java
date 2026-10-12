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
public final class nv implements org.telegram.ui.vt {
    public final ew f27719a;

    public nv(ew ewVar) {
        this.f27719a = ewVar;
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
        ew ewVar = this.f27719a;
        org.telegram.ui.ActionBar.m2 m2Var = ewVar.f24803c;
        if (m2Var instanceof org.telegram.ui.fo) {
            ((org.telegram.ui.fo) m2Var).fb(document);
        }
        ewVar.Z();
        ewVar.dismiss();
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
        org.telegram.ui.ActionBar.c6 c6Var;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new b6(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (AndroidUtilities.addToClipboard(valueOf)) {
            ew ewVar = this.f27719a;
            viewGroup = ((org.telegram.ui.ActionBar.e3) ewVar).containerView;
            c6Var = ((org.telegram.ui.ActionBar.e3) ewVar).resourcesProvider;
            org.telegram.messenger.yh.o(R.string.EmojiCopied, new zc((FrameLayout) viewGroup, c6Var));
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
        if (document != null && (emojiStatusDocumentId == null || emojiStatusDocumentId.longValue() != document.f19222id)) {
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
        org.telegram.ui.ActionBar.m2 m2Var = this.f27719a.f24803c;
        if (m2Var instanceof org.telegram.ui.fo) {
            return ((org.telegram.ui.fo) m2Var).c();
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
    public final boolean k() {
        return false;
    }

    @Override
    public final boolean l(int i10) {
        ew ewVar = this.f27719a;
        org.telegram.ui.ActionBar.m2 m2Var = ewVar.f24803c;
        if ((m2Var instanceof org.telegram.ui.fo) && ((org.telegram.ui.fo) m2Var).H6()) {
            if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                if (((org.telegram.ui.fo) ewVar.f24803c).i() != null && UserObject.isUserSelf(((org.telegram.ui.fo) ewVar.f24803c).i())) {
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
    public final m80 u(ah.v vVar) {
        return null;
    }

    @Override
    public final void v(TLRPC.Document document) {
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
            tL_emojiStatus.document_id = document.f19222id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        if (currentUser == null) {
            obj = new TLRPC.TL_emojiStatusEmpty();
        } else {
            obj = currentUser.emoji_status;
        }
        ew ewVar = this.f27719a;
        i10 = ((org.telegram.ui.ActionBar.e3) ewVar).currentAccount;
        MessagesController.getInstance(i10).updateEmojiStatus(emojiStatus);
        sk skVar = new sk(17, this, obj);
        if (document != null) {
            viewGroup = ((org.telegram.ui.ActionBar.e3) ewVar).containerView;
            c6Var = ((org.telegram.ui.ActionBar.e3) ewVar).resourcesProvider;
            new zc((FrameLayout) viewGroup, c6Var).q(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), skVar).j();
            return;
        }
        Context context = ewVar.getContext();
        c6Var2 = ((org.telegram.ui.ActionBar.e3) ewVar).resourcesProvider;
        kc kcVar = new kc(context, c6Var2);
        kcVar.f26665b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
        kcVar.f26664a.setImageResource(R.drawable.msg_settings_premium);
        Context context2 = ewVar.getContext();
        c6Var3 = ((org.telegram.ui.ActionBar.e3) ewVar).resourcesProvider;
        qc qcVar = new qc(context2, c6Var3, true);
        qcVar.f28576a = skVar;
        kcVar.setButton(qcVar);
        viewGroup2 = ((org.telegram.ui.ActionBar.e3) ewVar).containerView;
        sc.f((FrameLayout) viewGroup2, kcVar, 1500).j();
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
    public final void f(CharSequence charSequence, String str, org.telegram.ui.mt mtVar) {
    }

    @Override
    public final void s(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void m(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
    }
}
