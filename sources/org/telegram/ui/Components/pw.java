package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.RippleDrawable;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class pw implements org.telegram.ui.ht {

    public final yy f31672a;

    public pw(yy yyVar) {
        this.f31672a = yyVar;
    }

    @Override
    public final void A(TLRPC.Document document) {
        org.telegram.ui.ActionBar.n2 n2Var = this.f31672a.U1;
        if (n2Var instanceof org.telegram.ui.rn) {
            ((org.telegram.ui.rn) n2Var).bb(document);
        }
    }

    @Override
    public final boolean B() {
        return true;
    }

    @Override
    public final boolean C(TLRPC.Document document) {
        return true;
    }

    @Override
    public final void D(TLRPC.Document document) {
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = MediaDataController.getInputStickerSetItem(document, "").document;
        ConnectionsManager.getInstance(this.f31672a.Y0).sendRequest(tL_stickers_removeStickerFromSet, new w1(this, 4));
    }

    @Override
    public final String F(boolean z10) {
        yy yyVar = this.f31672a;
        if (z10) {
            f2.q0 adapter = yyVar.f34987d0.getAdapter();
            cy cyVar = yyVar.f34995f0;
            if (adapter == cyVar) {
                return cyVar.f27568w;
            }
            return null;
        }
        f2.q0 adapter2 = yyVar.L.getAdapter();
        wx wxVar = yyVar.O;
        if (adapter2 == wxVar) {
            return wxVar.v;
        }
        return null;
    }

    @Override
    public final void G(TLRPC.Document document) {
        SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        spannableStringBuilderValueOf.setSpan(new t5(document, (Paint.FontMetricsInt) null), 0, spannableStringBuilderValueOf.length(), 33);
        if (AndroidUtilities.addToClipboard(spannableStringBuilderValueOf)) {
            yy yyVar = this.f31672a;
            org.telegram.ui.ActionBar.n2 n2Var = yyVar.U1;
            org.telegram.messenger.rl.m(R.string.EmojiCopied, n2Var != null ? mc.a0(n2Var) : new mc(yyVar.f35030r, yyVar.V1));
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
    public final void K() {
        this.f31672a.Y();
    }

    @Override
    public final b70 L(ag.y1 y1Var) {
        return null;
    }

    @Override
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        if (inputStickerSet == null) {
            return;
        }
        this.f31672a.f35025p1.d(null, inputStickerSet, false);
    }

    @Override
    public final boolean N(TLRPC.Document document) {
        if (document == null) {
            return false;
        }
        ArrayList<String> arrayList = Emoji.recentEmoji;
        StringBuilder sb2 = new StringBuilder("animated_");
        sb2.append(document.f22386id);
        return arrayList.contains(sb2.toString());
    }

    @Override
    public final Boolean P(TLRPC.Document document) {
        TLRPC.User currentUser;
        if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser()) == null) {
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
        return this.f31672a.f35025p1.a();
    }

    @Override
    public final boolean b() {
        return this.f31672a.f35025p1.b();
    }

    @Override
    public final boolean c() {
        return this.f31672a.f35025p1.c();
    }

    @Override
    public final TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override
    public final boolean e(TLRPC.Document document) {
        return this.f31672a.f35025p1.j();
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
        yy yyVar = this.f31672a;
        return (yyVar.U1 == null && yyVar.f35027q0) ? false : true;
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k(int i10) {
        if (i10 != 2) {
            return true;
        }
        yy yyVar = this.f31672a;
        org.telegram.ui.ActionBar.n2 n2Var = yyVar.U1;
        if ((n2Var instanceof org.telegram.ui.rn) && ((org.telegram.ui.rn) n2Var).E6()) {
            return UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (((org.telegram.ui.rn) yyVar.U1).i() != null && UserObject.isUserSelf(((org.telegram.ui.rn) yyVar.U1).i()));
        }
        return false;
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
        this.f31672a.f35025p1.m(null, document, str, obj, null, z10, i10);
    }

    @Override
    public final void n(TLRPC.Document document) {
        for (int i10 = 0; i10 < document.attributes.size(); i10++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) && (inputStickerSet = documentAttribute.stickerset) != null) {
                yy yyVar = this.f31672a;
                ex0.o0(yyVar.U1, MediaDataController.getInstance(yyVar.Y0).getStickerSet(inputStickerSet, true), document);
            }
        }
        TLRPC.InputStickerSet inputStickerSet = null;
        yy yyVar2 = this.f31672a;
        ex0.o0(yyVar2.U1, MediaDataController.getInstance(yyVar2.Y0).getStickerSet(inputStickerSet, true), document);
    }

    @Override
    public final boolean o() {
        return false;
    }

    @Override
    public final void p(TLRPC.Document document) {
        if (document != null) {
            Emoji.removeRecentEmoji("animated_" + document.f22386id);
            gx gxVar = this.f31672a.N;
            if (gxVar != null) {
                gxVar.F(false);
            }
        }
    }

    @Override
    public final void r(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
        yy yyVar = this.f31672a;
        yv yvVar = yyVar.f34987d0;
        if (yvVar.getAdapter() == yyVar.f35007j0) {
            yyVar.f35025p1.v(null, tLObject, null, obj, z10, i10, i11);
        } else if (yvVar.getAdapter() == yyVar.f34995f0) {
            yyVar.f35025p1.v(null, tLObject, null, obj, z10, i10, i11);
        }
    }

    @Override
    public final void s() {
        ww wwVar = this.f31672a.L;
        if (wwVar == null || wwVar.a3 == null) {
            return;
        }
        while (wwVar.a3.size() > 0) {
            ix ixVar = (ix) wwVar.a3.valueAt(0);
            wwVar.a3.removeAt(0);
            if (ixVar != null) {
                if (ixVar.d.getBackground() instanceof RippleDrawable) {
                    ixVar.d.getBackground().setState(new int[0]);
                }
                ixVar.d.setPressed(false);
            }
        }
    }

    @Override
    public final void t(TLRPC.Document document) {
        TLRPC.EmojiStatus tL_emojiStatusEmpty;
        yy yyVar = this.f31672a;
        FrameLayout frameLayout = yyVar.f35030r;
        org.telegram.ui.ActionBar.n2 n2Var = yyVar.U1;
        org.telegram.ui.ActionBar.c6 c6Var = yyVar.V1;
        if (document == null) {
            tL_emojiStatusEmpty = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.f22386id;
            tL_emojiStatusEmpty = tL_emojiStatus;
        }
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        Object tL_emojiStatusEmpty2 = currentUser == null ? new TLRPC.TL_emojiStatusEmpty() : currentUser.emoji_status;
        MessagesController.getInstance(yyVar.Y0).updateEmojiStatus(tL_emojiStatusEmpty);
        xq xqVar = new xq(7, this, tL_emojiStatusEmpty2);
        if (document != null) {
            (n2Var != null ? mc.a0(n2Var) : new mc(frameLayout, c6Var)).q(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), xqVar).j();
            return;
        }
        wb wbVar = new wb(yyVar.getContext(), c6Var);
        wbVar.f34154b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
        int i10 = R.drawable.msg_settings_premium;
        ImageView imageView = wbVar.f34153a;
        imageView.setImageResource(i10);
        imageView.setScaleX(0.8f);
        imageView.setScaleY(0.8f);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23444z9, c6Var), PorterDuff.Mode.MULTIPLY));
        cc ccVar = new cc(yyVar.getContext(), c6Var, true);
        ccVar.f27402a = xqVar;
        wbVar.setButton(ccVar);
        if (n2Var != null) {
            ec.g(n2Var, wbVar, 1500).j();
        } else {
            ec.f(frameLayout, wbVar, 1500).j();
        }
    }

    @Override
    public final void v(TLObject tLObject, Object obj) {
        yy yyVar = this.f31672a;
        yv yvVar = yyVar.f34987d0;
        if (yvVar.getAdapter() == yyVar.f35007j0 || yvVar.getAdapter() == yyVar.f34995f0) {
            yyVar.f35025p1.e(tLObject, obj);
        }
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
    public final void J() {
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
    public final void q() {
    }

    @Override
    public final void x(String str) {
    }

    @Override
    public final void u(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override
    public final void E(CharSequence charSequence, String str, org.telegram.ui.df dfVar) {
    }
}
