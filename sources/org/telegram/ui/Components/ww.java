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
public final class ww implements org.telegram.ui.ft {
    public final fz f34500a;

    public ww(fz fzVar) {
        this.f34500a = fzVar;
    }

    @Override
    public final void A(TLRPC.Document document) {
        org.telegram.ui.ActionBar.o2 o2Var = this.f34500a.U1;
        if (o2Var instanceof org.telegram.ui.tn) {
            ((org.telegram.ui.tn) o2Var).bb(document);
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
        ConnectionsManager.getInstance(this.f34500a.Y0).sendRequest(tL_stickers_removeStickerFromSet, new a2(this, 4));
    }

    @Override
    public final String E(boolean z10) {
        fz fzVar = this.f34500a;
        if (z10) {
            f2.p0 adapter = fzVar.f28585d0.getAdapter();
            jy jyVar = fzVar.f28593f0;
            if (adapter == jyVar) {
                return jyVar.f29851w;
            }
            return null;
        }
        f2.p0 adapter2 = fzVar.L.getAdapter();
        ey eyVar = fzVar.O;
        if (adapter2 == eyVar) {
            return eyVar.v;
        }
        return null;
    }

    @Override
    public final j70 G(bg.d1 d1Var) {
        return null;
    }

    @Override
    public final void H(TLRPC.Document document) {
        tc tcVar;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new y5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (AndroidUtilities.addToClipboard(valueOf)) {
            fz fzVar = this.f34500a;
            org.telegram.ui.ActionBar.o2 o2Var = fzVar.U1;
            if (o2Var != null) {
                tcVar = tc.a0(o2Var);
            } else {
                tcVar = new tc(fzVar.f28628r, fzVar.V1);
            }
            org.telegram.ui.b.n(R.string.EmojiCopied, tcVar);
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
        this.f34500a.Y();
    }

    @Override
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        if (inputStickerSet == null) {
            return;
        }
        this.f34500a.f28623p1.d(null, inputStickerSet, false);
    }

    @Override
    public final boolean N(TLRPC.Document document) {
        if (document != null) {
            ArrayList<String> arrayList = Emoji.recentEmoji;
            if (arrayList.contains("animated_" + document.f22398id)) {
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
        return this.f34500a.f28623p1.a();
    }

    @Override
    public final boolean b() {
        return this.f34500a.f28623p1.b();
    }

    @Override
    public final boolean c() {
        return this.f34500a.f28623p1.c();
    }

    @Override
    public final TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override
    public final boolean e(TLRPC.Document document) {
        return this.f34500a.f28623p1.j();
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
        fz fzVar = this.f34500a;
        if (fzVar.U1 == null && fzVar.f28625q0) {
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
        fz fzVar = this.f34500a;
        org.telegram.ui.ActionBar.o2 o2Var = fzVar.U1;
        if ((o2Var instanceof org.telegram.ui.tn) && ((org.telegram.ui.tn) o2Var).E6()) {
            if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (((org.telegram.ui.tn) fzVar.U1).i() != null && UserObject.isUserSelf(((org.telegram.ui.tn) fzVar.U1).i()))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
        this.f34500a.f28623p1.m(null, document, str, obj, null, z10, i10);
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
        fz fzVar = this.f34500a;
        nx0.o0(fzVar.U1, MediaDataController.getInstance(fzVar.Y0).getStickerSet(inputStickerSet, true), document);
    }

    @Override
    public final boolean o() {
        return false;
    }

    @Override
    public final void p(TLRPC.Document document) {
        if (document != null) {
            Emoji.removeRecentEmoji("animated_" + document.f22398id);
            nx nxVar = this.f34500a.N;
            if (nxVar != null) {
                nxVar.F(false);
            }
        }
    }

    @Override
    public final void r(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
        fz fzVar = this.f34500a;
        fw fwVar = fzVar.f28585d0;
        if (fwVar.getAdapter() == fzVar.f28605j0) {
            fzVar.f28623p1.v(null, tLObject, null, obj, z10, i10, i11);
        } else if (fwVar.getAdapter() == fzVar.f28593f0) {
            fzVar.f28623p1.v(null, tLObject, null, obj, z10, i10, i11);
        }
    }

    @Override
    public final void s() {
        dx dxVar = this.f34500a.L;
        if (dxVar != null && dxVar.f32130a3 != null) {
            while (dxVar.f32130a3.size() > 0) {
                px pxVar = (px) dxVar.f32130a3.valueAt(0);
                dxVar.f32130a3.removeAt(0);
                if (pxVar != null) {
                    if (pxVar.d.getBackground() instanceof RippleDrawable) {
                        pxVar.d.getBackground().setState(new int[0]);
                    }
                    pxVar.d.setPressed(false);
                }
            }
        }
    }

    @Override
    public final void t(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        Object obj;
        tc tcVar;
        fz fzVar = this.f34500a;
        FrameLayout frameLayout = fzVar.f28628r;
        org.telegram.ui.ActionBar.o2 o2Var = fzVar.U1;
        org.telegram.ui.ActionBar.c6 c6Var = fzVar.V1;
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
        MessagesController.getInstance(fzVar.Y0).updateEmojiStatus(emojiStatus);
        gt gtVar = new gt(4, this, obj);
        if (document == null) {
            ec ecVar = new ec(fzVar.getContext(), c6Var);
            ecVar.f28000b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
            int i10 = R.drawable.msg_settings_premium;
            ImageView imageView = ecVar.f27999a;
            imageView.setImageResource(i10);
            imageView.setScaleX(0.8f);
            imageView.setScaleY(0.8f);
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23453z9, c6Var), PorterDuff.Mode.MULTIPLY));
            kc kcVar = new kc(fzVar.getContext(), c6Var, true);
            kcVar.f30007a = gtVar;
            ecVar.setButton(kcVar);
            if (o2Var != null) {
                mc.g(o2Var, ecVar, 1500).j();
                return;
            } else {
                mc.f(frameLayout, ecVar, 1500).j();
                return;
            }
        }
        if (o2Var != null) {
            tcVar = tc.a0(o2Var);
        } else {
            tcVar = new tc(frameLayout, c6Var);
        }
        tcVar.q(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), gtVar).j();
    }

    @Override
    public final void v(TLObject tLObject, Object obj) {
        fz fzVar = this.f34500a;
        fw fwVar = fzVar.f28585d0;
        if (fwVar.getAdapter() != fzVar.f28605j0 && fwVar.getAdapter() != fzVar.f28593f0) {
            return;
        }
        fzVar.f28623p1.e(tLObject, obj);
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
    public final void x(String str) {
    }

    @Override
    public final void u(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override
    public final void F(CharSequence charSequence, String str, org.telegram.ui.tm tmVar) {
    }
}
