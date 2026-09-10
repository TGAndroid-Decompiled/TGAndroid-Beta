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
public final class ix implements org.telegram.ui.rt {
    public final rz f24155a;

    public ix(rz rzVar) {
        this.f24155a = rzVar;
    }

    @Override
    public final void A(TLRPC.Document document) {
        org.telegram.ui.ActionBar.p2 p2Var = this.f24155a.Y1;
        if (p2Var instanceof org.telegram.ui.eo) {
            ((org.telegram.ui.eo) p2Var).bb(document);
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
        ConnectionsManager.getInstance(this.f24155a.f26805c1).sendRequest(tL_stickers_removeStickerFromSet, new z1(this, 4));
    }

    @Override
    public final String E(boolean z10) {
        rz rzVar = this.f24155a;
        if (z10) {
            s4.h0 adapter = rzVar.f26820h0.getAdapter();
            wy wyVar = rzVar.f26826j0;
            if (adapter == wyVar) {
                return wyVar.f28867w;
            }
            return null;
        }
        s4.h0 adapter2 = rzVar.P.getAdapter();
        ry ryVar = rzVar.S;
        if (adapter2 == ryVar) {
            return ryVar.v;
        }
        return null;
    }

    @Override
    public final void G(TLRPC.Document document) {
        wc wcVar;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new y5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (AndroidUtilities.addToClipboard(valueOf)) {
            rz rzVar = this.f24155a;
            org.telegram.ui.ActionBar.p2 p2Var = rzVar.Y1;
            if (p2Var != null) {
                wcVar = wc.a0(p2Var);
            } else {
                wcVar = new wc(rzVar.f26849r, rzVar.Z1);
            }
            org.telegram.messenger.em.o(R.string.EmojiCopied, wcVar);
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
    public final void L() {
        this.f24155a.Y();
    }

    @Override
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        if (inputStickerSet == null) {
            return;
        }
        this.f24155a.f26858t1.d(null, inputStickerSet, false);
    }

    @Override
    public final boolean N(TLRPC.Document document) {
        if (document != null) {
            ArrayList<String> arrayList = Emoji.recentEmoji;
            if (arrayList.contains("animated_" + document.f17201id)) {
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
        return this.f24155a.f26858t1.a();
    }

    @Override
    public final boolean b() {
        return this.f24155a.f26858t1.b();
    }

    @Override
    public final boolean c() {
        return this.f24155a.f26858t1.c();
    }

    @Override
    public final TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override
    public final boolean e(TLRPC.Document document) {
        return this.f24155a.f26858t1.j();
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
        rz rzVar = this.f24155a;
        if (rzVar.Y1 == null && rzVar.f26860u0) {
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
        rz rzVar = this.f24155a;
        org.telegram.ui.ActionBar.p2 p2Var = rzVar.Y1;
        if ((p2Var instanceof org.telegram.ui.eo) && ((org.telegram.ui.eo) p2Var).E6()) {
            if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (((org.telegram.ui.eo) rzVar.Y1).i() != null && UserObject.isUserSelf(((org.telegram.ui.eo) rzVar.Y1).i()))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
        this.f24155a.f26858t1.m(null, document, str, obj, null, z10, i10);
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
        rz rzVar = this.f24155a;
        hy0.o0(rzVar.Y1, MediaDataController.getInstance(rzVar.f26805c1).getStickerSet(inputStickerSet, true), document);
    }

    @Override
    public final boolean o() {
        return false;
    }

    @Override
    public final void p(TLRPC.Document document) {
        if (document != null) {
            Emoji.removeRecentEmoji("animated_" + document.f17201id);
            yx yxVar = this.f24155a.R;
            if (yxVar != null) {
                yxVar.F(false);
            }
        }
    }

    @Override
    public final void r(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
        rz rzVar = this.f24155a;
        sw swVar = rzVar.f26820h0;
        if (swVar.getAdapter() == rzVar.f26837n0) {
            rzVar.f26858t1.v(null, tLObject, null, obj, z10, i10, i11);
        } else if (swVar.getAdapter() == rzVar.f26826j0) {
            rzVar.f26858t1.v(null, tLObject, null, obj, z10, i10, i11);
        }
    }

    @Override
    public final void s() {
        px pxVar = this.f24155a.P;
        if (pxVar != null && pxVar.f22251e3 != null) {
            while (pxVar.f22251e3.size() > 0) {
                ay ayVar = (ay) pxVar.f22251e3.valueAt(0);
                pxVar.f22251e3.removeAt(0);
                if (ayVar != null) {
                    if (ayVar.d.getBackground() instanceof RippleDrawable) {
                        ayVar.d.getBackground().setState(new int[0]);
                    }
                    ayVar.d.setPressed(false);
                }
            }
        }
    }

    @Override
    public final void t(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        Object obj;
        wc wcVar;
        rz rzVar = this.f24155a;
        FrameLayout frameLayout = rzVar.f26849r;
        org.telegram.ui.ActionBar.p2 p2Var = rzVar.Y1;
        org.telegram.ui.ActionBar.f6 f6Var = rzVar.Z1;
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
        MessagesController.getInstance(rzVar.f26805c1).updateEmojiStatus(emojiStatus);
        ee eeVar = new ee(28, this, obj);
        if (document == null) {
            hc hcVar = new hc(rzVar.getContext(), f6Var);
            hcVar.f23574b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
            int i10 = R.drawable.msg_settings_premium;
            ImageView imageView = hcVar.f23573a;
            imageView.setImageResource(i10);
            imageView.setScaleX(0.8f);
            imageView.setScaleY(0.8f);
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18328z9, f6Var), PorterDuff.Mode.MULTIPLY));
            nc ncVar = new nc(rzVar.getContext(), f6Var, true);
            ncVar.f25483a = eeVar;
            hcVar.setButton(ncVar);
            if (p2Var != null) {
                pc.g(p2Var, hcVar, 1500).j();
                return;
            } else {
                pc.f(frameLayout, hcVar, 1500).j();
                return;
            }
        }
        if (p2Var != null) {
            wcVar = wc.a0(p2Var);
        } else {
            wcVar = new wc(frameLayout, f6Var);
        }
        wcVar.q(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), eeVar).j();
    }

    @Override
    public final void v(TLObject tLObject, Object obj) {
        rz rzVar = this.f24155a;
        sw swVar = rzVar.f26820h0;
        if (swVar.getAdapter() != rzVar.f26837n0 && swVar.getAdapter() != rzVar.f26826j0) {
            return;
        }
        rzVar.f26858t1.e(tLObject, obj);
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
    public final void F(CharSequence charSequence, String str, org.telegram.ui.pf pfVar) {
    }
}
