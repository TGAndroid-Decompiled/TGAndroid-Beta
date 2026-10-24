package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.PorterDuff;
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
public final class jx implements org.telegram.ui.ft {
    public final rz f27809a;

    public jx(rz rzVar) {
        this.f27809a = rzVar;
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
        org.telegram.ui.ActionBar.o2 o2Var = this.f27809a.Y1;
        if (o2Var instanceof org.telegram.ui.sn) {
            ((org.telegram.ui.sn) o2Var).gb(document);
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
        ConnectionsManager.getInstance(this.f27809a.f30310c1).sendRequest(tL_stickers_removeStickerFromSet, new x1(this, 4));
    }

    @Override
    public final String G(boolean z10) {
        rz rzVar = this.f27809a;
        if (z10) {
            s4.g0 adapter = rzVar.f30325h0.getAdapter();
            wy wyVar = rzVar.f30331j0;
            if (adapter == wyVar) {
                return wyVar.f32438w;
            }
            return null;
        }
        s4.g0 adapter2 = rzVar.P.getAdapter();
        ry ryVar = rzVar.S;
        if (adapter2 == ryVar) {
            return ryVar.v;
        }
        return null;
    }

    @Override
    public final void H(TLRPC.Document document) {
        vc vcVar;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new y5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (AndroidUtilities.addToClipboard(valueOf)) {
            rz rzVar = this.f27809a;
            org.telegram.ui.ActionBar.o2 o2Var = rzVar.Y1;
            if (o2Var != null) {
                vcVar = vc.a0(o2Var);
            } else {
                vcVar = new vc(rzVar.f30354r, rzVar.Z1);
            }
            org.telegram.messenger.tl.p(R.string.EmojiCopied, vcVar);
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
        this.f27809a.W();
    }

    @Override
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        if (inputStickerSet == null) {
            return;
        }
        this.f27809a.f30363t1.d(null, inputStickerSet, false);
    }

    @Override
    public final boolean N(TLRPC.Document document) {
        if (document != null) {
            ArrayList<String> arrayList = Emoji.recentEmoji;
            if (arrayList.contains("animated_" + document.f20350id)) {
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
        if (document != null && (emojiStatusDocumentId == null || emojiStatusDocumentId.longValue() != document.f20350id)) {
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
        return this.f27809a.f30363t1.a();
    }

    @Override
    public final boolean b() {
        return this.f27809a.f30363t1.b();
    }

    @Override
    public final boolean c() {
        return this.f27809a.f30363t1.c();
    }

    @Override
    public final TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override
    public final boolean e(TLRPC.Document document) {
        return this.f27809a.f30363t1.j();
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
        rz rzVar = this.f27809a;
        if (rzVar.Y1 == null && rzVar.f30365u0) {
            return false;
        }
        return true;
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
        rz rzVar = this.f27809a;
        org.telegram.ui.ActionBar.o2 o2Var = rzVar.Y1;
        if ((o2Var instanceof org.telegram.ui.sn) && ((org.telegram.ui.sn) o2Var).H6()) {
            if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (((org.telegram.ui.sn) rzVar.Y1).i() != null && UserObject.isUserSelf(((org.telegram.ui.sn) rzVar.Y1).i()))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
        this.f27809a.f30363t1.m(null, document, str, obj, null, z10, i10);
    }

    @Override
    public final void n(TLRPC.Document document) {
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
        rz rzVar = this.f27809a;
        sy0.q0(rzVar.Y1, MediaDataController.getInstance(rzVar.f30310c1).getStickerSet(inputStickerSet, true), document);
    }

    @Override
    public final boolean o() {
        return false;
    }

    @Override
    public final void p(TLRPC.Document document) {
        if (document != null) {
            Emoji.removeRecentEmoji("animated_" + document.f20350id);
            yx yxVar = this.f27809a.R;
            if (yxVar != null) {
                yxVar.F(false);
            }
        }
    }

    @Override
    public final void r(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
        rz rzVar = this.f27809a;
        sw swVar = rzVar.f30325h0;
        if (swVar.getAdapter() == rzVar.f30342n0) {
            rzVar.f30363t1.v(null, tLObject, null, obj, z10, i10, i11);
        } else if (swVar.getAdapter() == rzVar.f30331j0) {
            rzVar.f30363t1.v(null, tLObject, null, obj, z10, i10, i11);
        }
    }

    @Override
    public final void s() {
        cy cyVar = this.f27809a.P;
        if (cyVar != null && cyVar.f25487f3 != null) {
            while (cyVar.f25487f3.size() > 0) {
                ay ayVar = (ay) cyVar.f25487f3.valueAt(0);
                cyVar.f25487f3.removeAt(0);
                if (ayVar != null) {
                    View view = ayVar.d;
                    if (view != null && (view.getBackground() instanceof RippleDrawable)) {
                        ayVar.d.getBackground().setState(new int[0]);
                    }
                    View view2 = ayVar.d;
                    if (view2 != null) {
                        view2.setPressed(false);
                    }
                }
            }
        }
    }

    @Override
    public final h80 u(ah.v vVar) {
        return null;
    }

    @Override
    public final void v(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        Object obj;
        vc vcVar;
        rz rzVar = this.f27809a;
        FrameLayout frameLayout = rzVar.f30354r;
        org.telegram.ui.ActionBar.o2 o2Var = rzVar.Y1;
        org.telegram.ui.ActionBar.g6 g6Var = rzVar.Z1;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.f20350id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        if (currentUser == null) {
            obj = new TLRPC.TL_emojiStatusEmpty();
        } else {
            obj = currentUser.emoji_status;
        }
        MessagesController.getInstance(rzVar.f30310c1).updateEmojiStatus(emojiStatus);
        wt wtVar = new wt(2, this, obj);
        if (document == null) {
            gc gcVar = new gc(rzVar.getContext(), g6Var);
            gcVar.f26619b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
            int i10 = R.drawable.msg_settings_premium;
            ImageView imageView = gcVar.f26618a;
            imageView.setImageResource(i10);
            imageView.setScaleX(0.8f);
            imageView.setScaleY(0.8f);
            org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.f21592z9, g6Var, PorterDuff.Mode.MULTIPLY);
            mc mcVar = new mc(rzVar.getContext(), g6Var, true);
            mcVar.f28574b = wtVar;
            gcVar.setButton(mcVar);
            if (o2Var != null) {
                oc.g(o2Var, gcVar, 1500).j();
                return;
            } else {
                oc.f(frameLayout, gcVar, 1500).j();
                return;
            }
        }
        if (o2Var != null) {
            vcVar = vc.a0(o2Var);
        } else {
            vcVar = new vc(frameLayout, g6Var);
        }
        vcVar.r(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), wtVar).j();
    }

    @Override
    public final void x(TLObject tLObject, Object obj) {
        rz rzVar = this.f27809a;
        sw swVar = rzVar.f30325h0;
        if (swVar.getAdapter() != rzVar.f30342n0 && swVar.getAdapter() != rzVar.f30331j0) {
            return;
        }
        rzVar.f30363t1.e(tLObject, obj);
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
    public final void i(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override
    public final void m(String str) {
    }

    @Override
    public final void q() {
    }

    @Override
    public final void z(String str) {
    }

    @Override
    public final void w(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override
    public final void t(CharSequence charSequence, String str, oy oyVar) {
    }
}
