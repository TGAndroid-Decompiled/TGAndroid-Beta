package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.RippleDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
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
public final class px implements org.telegram.ui.vt {
    public final wz f28440a;

    public px(wz wzVar) {
        this.f28440a = wzVar;
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
        org.telegram.ui.ActionBar.m2 m2Var = this.f28440a.Y1;
        if (m2Var instanceof org.telegram.ui.fo) {
            ((org.telegram.ui.fo) m2Var).fb(document);
        }
    }

    @Override
    public final boolean D() {
        return true;
    }

    @Override
    public final boolean E(TLRPC.Document document) {
        return true;
    }

    @Override
    public final void F(TLRPC.Document document) {
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = MediaDataController.getInputStickerSetItem(document, "").document;
        ConnectionsManager.getInstance(this.f28440a.f31014c1).sendRequest(tL_stickers_removeStickerFromSet, new y1(this, 4));
    }

    @Override
    public final String G(boolean z10) {
        wz wzVar = this.f28440a;
        if (z10) {
            s4.g0 adapter = wzVar.f31029h0.getAdapter();
            az azVar = wzVar.f31035j0;
            if (adapter == azVar) {
                return azVar.f23644w;
            }
            return null;
        }
        s4.g0 adapter2 = wzVar.P.getAdapter();
        vy vyVar = wzVar.S;
        if (adapter2 == vyVar) {
            return vyVar.v;
        }
        return null;
    }

    @Override
    public final void H(TLRPC.Document document) {
        zc zcVar;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new b6(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (AndroidUtilities.addToClipboard(valueOf)) {
            wz wzVar = this.f28440a;
            org.telegram.ui.ActionBar.m2 m2Var = wzVar.Y1;
            if (m2Var != null) {
                zcVar = zc.a0(m2Var);
            } else {
                zcVar = new zc(wzVar.f31058r, wzVar.Z1);
            }
            org.telegram.messenger.yh.o(R.string.EmojiCopied, zcVar);
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
    public final void L() {
        this.f28440a.W();
    }

    @Override
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        if (inputStickerSet == null) {
            return;
        }
        this.f28440a.f31067t1.d(null, inputStickerSet, false);
    }

    @Override
    public final boolean N(TLRPC.Document document) {
        if (document != null) {
            ArrayList<String> arrayList = Emoji.recentEmoji;
            if (arrayList.contains("animated_" + document.f19222id)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final Boolean P(TLRPC.Document document) {
        TLRPC.User currentUser;
        boolean z10;
        if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser()) == null) {
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
        return this.f28440a.f31067t1.a();
    }

    @Override
    public final boolean b() {
        return this.f28440a.f31067t1.b();
    }

    @Override
    public final boolean c() {
        return this.f28440a.f31067t1.c();
    }

    @Override
    public final TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override
    public final boolean e(TLRPC.Document document) {
        return this.f28440a.f31067t1.j();
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
        wz wzVar = this.f28440a;
        if (wzVar.Y1 == null && wzVar.f31069u0) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final boolean l(int i10) {
        if (i10 != 2) {
            return true;
        }
        wz wzVar = this.f28440a;
        org.telegram.ui.ActionBar.m2 m2Var = wzVar.Y1;
        if ((m2Var instanceof org.telegram.ui.fo) && ((org.telegram.ui.fo) m2Var).H6()) {
            if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (((org.telegram.ui.fo) wzVar.Y1).i() != null && UserObject.isUserSelf(((org.telegram.ui.fo) wzVar.Y1).i()))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void m(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
        this.f28440a.f31067t1.m(null, document, str, obj, null, z10, i10);
    }

    @Override
    public final void o(TLRPC.Document document) {
        TLRPC.InputStickerSet inputStickerSet;
        int i10 = 0;
        while (true) {
            if (i10 < document.attributes.size()) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) && (inputStickerSet = documentAttribute.stickerset) != null) {
                    break;
                }
                i10++;
            } else {
                inputStickerSet = null;
                break;
            }
        }
        wz wzVar = this.f28440a;
        ty0.p0(wzVar.Y1, MediaDataController.getInstance(wzVar.f31014c1).getStickerSet(inputStickerSet, true), document);
    }

    @Override
    public final boolean p() {
        return false;
    }

    @Override
    public final void q(TLRPC.Document document) {
        if (document != null) {
            Emoji.removeRecentEmoji("animated_" + document.f19222id);
            fy fyVar = this.f28440a.R;
            if (fyVar != null) {
                fyVar.F(false);
            }
        }
    }

    @Override
    public final void s(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
        wz wzVar = this.f28440a;
        yw ywVar = wzVar.f31029h0;
        if (ywVar.getAdapter() == wzVar.f31046n0) {
            wzVar.f31067t1.v(null, tLObject, null, obj, z10, i10, i11);
        } else if (ywVar.getAdapter() == wzVar.f31035j0) {
            wzVar.f31067t1.v(null, tLObject, null, obj, z10, i10, i11);
        }
    }

    @Override
    public final void t() {
        iy iyVar = this.f28440a.P;
        if (iyVar != null && iyVar.f26122c3 != null) {
            while (iyVar.f26122c3.size() > 0) {
                hy hyVar = (hy) iyVar.f26122c3.valueAt(0);
                iyVar.f26122c3.removeAt(0);
                if (hyVar != null) {
                    View view = hyVar.d;
                    if (view != null && (view.getBackground() instanceof RippleDrawable)) {
                        hyVar.d.getBackground().setState(new int[0]);
                    }
                    View view2 = hyVar.d;
                    if (view2 != null) {
                        view2.setPressed(false);
                    }
                }
            }
        }
    }

    @Override
    public final m80 u(ah.v vVar) {
        return null;
    }

    @Override
    public final void v(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        Object obj;
        zc zcVar;
        wz wzVar = this.f28440a;
        FrameLayout frameLayout = wzVar.f31058r;
        org.telegram.ui.ActionBar.m2 m2Var = wzVar.Y1;
        org.telegram.ui.ActionBar.c6 c6Var = wzVar.Z1;
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
        MessagesController.getInstance(wzVar.f31014c1).updateEmojiStatus(emojiStatus);
        sk skVar = new sk(18, this, obj);
        if (document == null) {
            kc kcVar = new kc(wzVar.getContext(), c6Var);
            kcVar.f26665b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
            int i10 = R.drawable.msg_settings_premium;
            ImageView imageView = kcVar.f26664a;
            imageView.setImageResource(i10);
            imageView.setScaleX(0.8f);
            imageView.setScaleY(0.8f);
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20308z9, c6Var), PorterDuff.Mode.MULTIPLY));
            qc qcVar = new qc(wzVar.getContext(), c6Var, true);
            qcVar.f28576a = skVar;
            kcVar.setButton(qcVar);
            if (m2Var != null) {
                sc.g(m2Var, kcVar, 1500).j();
                return;
            } else {
                sc.f(frameLayout, kcVar, 1500).j();
                return;
            }
        }
        if (m2Var != null) {
            zcVar = zc.a0(m2Var);
        } else {
            zcVar = new zc(frameLayout, c6Var);
        }
        zcVar.q(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), skVar).j();
    }

    @Override
    public final void x(TLObject tLObject, Object obj) {
        wz wzVar = this.f28440a;
        yw ywVar = wzVar.f31029h0;
        if (ywVar.getAdapter() != wzVar.f31046n0 && ywVar.getAdapter() != wzVar.f31035j0) {
            return;
        }
        wzVar.f31067t1.e(tLObject, obj);
    }

    @Override
    public final boolean y() {
        return true;
    }

    @Override
    public final void K() {
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
    public final void r() {
    }

    @Override
    public final void z(String str) {
    }

    @Override
    public final void w(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override
    public final void f(CharSequence charSequence, String str, org.telegram.ui.mt mtVar) {
    }
}
