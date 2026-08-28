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
public final class pw implements org.telegram.ui.ft {
    public final wy f31767a;

    public pw(wy wyVar) {
        this.f31767a = wyVar;
    }

    @Override
    public final boolean A() {
        return false;
    }

    @Override
    public final void B(TLRPC.Document document) {
        org.telegram.ui.ActionBar.o2 o2Var = this.f31767a.U1;
        if (o2Var instanceof org.telegram.ui.qn) {
            ((org.telegram.ui.qn) o2Var).bb(document);
        }
    }

    @Override
    public final boolean C() {
        return true;
    }

    @Override
    public final boolean D(TLRPC.Document document) {
        return true;
    }

    @Override
    public final void E(TLRPC.Document document) {
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = MediaDataController.getInputStickerSetItem(document, "").document;
        ConnectionsManager.getInstance(this.f31767a.Y0).sendRequest(tL_stickers_removeStickerFromSet, new w1(this, 4));
    }

    @Override
    public final String G(boolean z10) {
        wy wyVar = this.f31767a;
        if (z10) {
            f2.r0 adapter = wyVar.f34394d0.getAdapter();
            ay ayVar = wyVar.f34402f0;
            if (adapter == ayVar) {
                return ayVar.f26923w;
            }
            return null;
        }
        f2.r0 adapter2 = wyVar.L.getAdapter();
        vx vxVar = wyVar.O;
        if (adapter2 == vxVar) {
            return vxVar.v;
        }
        return null;
    }

    @Override
    public final void H(TLRPC.Document document) {
        oc ocVar;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new t5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (AndroidUtilities.addToClipboard(valueOf)) {
            wy wyVar = this.f31767a;
            org.telegram.ui.ActionBar.o2 o2Var = wyVar.U1;
            if (o2Var != null) {
                ocVar = oc.a0(o2Var);
            } else {
                ocVar = new oc(wyVar.f34437r, wyVar.V1);
            }
            org.telegram.messenger.ll.o(R.string.EmojiCopied, ocVar);
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
        this.f31767a.X();
    }

    @Override
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        if (inputStickerSet == null) {
            return;
        }
        this.f31767a.f34432p1.d(null, inputStickerSet, false);
    }

    @Override
    public final boolean N(TLRPC.Document document) {
        if (document != null) {
            ArrayList<String> arrayList = Emoji.recentEmoji;
            if (arrayList.contains("animated_" + document.f22386id)) {
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
        if (document != null && (emojiStatusDocumentId == null || emojiStatusDocumentId.longValue() != document.f22386id)) {
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
        return this.f31767a.f34432p1.a();
    }

    @Override
    public final boolean b() {
        return this.f31767a.f34432p1.b();
    }

    @Override
    public final boolean c() {
        return this.f31767a.f34432p1.c();
    }

    @Override
    public final TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override
    public final boolean e(TLRPC.Document document) {
        return this.f31767a.f34432p1.j();
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
        wy wyVar = this.f31767a;
        if (wyVar.U1 == null && wyVar.f34434q0) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k(int i9) {
        if (i9 != 2) {
            return true;
        }
        wy wyVar = this.f31767a;
        org.telegram.ui.ActionBar.o2 o2Var = wyVar.U1;
        if ((o2Var instanceof org.telegram.ui.qn) && ((org.telegram.ui.qn) o2Var).E6()) {
            if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (((org.telegram.ui.qn) wyVar.U1).i() != null && UserObject.isUserSelf(((org.telegram.ui.qn) wyVar.U1).i()))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i9, int i10) {
        this.f31767a.f34432p1.m(null, document, str, obj, null, z10, i9);
    }

    @Override
    public final void n(TLRPC.Document document) {
        TLRPC.InputStickerSet inputStickerSet;
        int i9 = 0;
        while (true) {
            if (i9 < document.attributes.size()) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i9);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) && (inputStickerSet = documentAttribute.stickerset) != null) {
                    break;
                }
                i9++;
            } else {
                inputStickerSet = null;
                break;
            }
        }
        wy wyVar = this.f31767a;
        cx0.n0(wyVar.U1, MediaDataController.getInstance(wyVar.Y0).getStickerSet(inputStickerSet, true), document);
    }

    @Override
    public final boolean o() {
        return false;
    }

    @Override
    public final void p(TLRPC.Document document) {
        if (document != null) {
            Emoji.removeRecentEmoji("animated_" + document.f22386id);
            fx fxVar = this.f31767a.N;
            if (fxVar != null) {
                fxVar.F(false);
            }
        }
    }

    @Override
    public final x60 r(fh.v vVar) {
        return null;
    }

    @Override
    public final void s(int i9, int i10, Object obj, TLObject tLObject, boolean z10) {
        wy wyVar = this.f31767a;
        zv zvVar = wyVar.f34394d0;
        if (zvVar.getAdapter() == wyVar.f34414j0) {
            wyVar.f34432p1.v(null, tLObject, null, obj, z10, i9, i10);
        } else if (zvVar.getAdapter() == wyVar.f34402f0) {
            wyVar.f34432p1.v(null, tLObject, null, obj, z10, i9, i10);
        }
    }

    @Override
    public final void t() {
        ww wwVar = this.f31767a.L;
        if (wwVar != null && wwVar.a3 != null) {
            while (wwVar.a3.size() > 0) {
                hx hxVar = (hx) wwVar.a3.valueAt(0);
                wwVar.a3.removeAt(0);
                if (hxVar != null) {
                    if (hxVar.d.getBackground() instanceof RippleDrawable) {
                        hxVar.d.getBackground().setState(new int[0]);
                    }
                    hxVar.d.setPressed(false);
                }
            }
        }
    }

    @Override
    public final void u(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        Object obj;
        oc ocVar;
        wy wyVar = this.f31767a;
        FrameLayout frameLayout = wyVar.f34437r;
        org.telegram.ui.ActionBar.o2 o2Var = wyVar.U1;
        org.telegram.ui.ActionBar.b6 b6Var = wyVar.V1;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.f22386id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        if (currentUser == null) {
            obj = new TLRPC.TL_emojiStatusEmpty();
        } else {
            obj = currentUser.emoji_status;
        }
        MessagesController.getInstance(wyVar.Y0).updateEmojiStatus(emojiStatus);
        zq zqVar = new zq(7, this, obj);
        if (document == null) {
            yb ybVar = new yb(wyVar.getContext(), b6Var);
            ybVar.f34916b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
            int i9 = R.drawable.msg_settings_premium;
            ImageView imageView = ybVar.f34915a;
            imageView.setImageResource(i9);
            imageView.setScaleX(0.8f);
            imageView.setScaleY(0.8f);
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23389z9, b6Var), PorterDuff.Mode.MULTIPLY));
            ec ecVar = new ec(wyVar.getContext(), b6Var, true);
            ecVar.f27999a = zqVar;
            ybVar.setButton(ecVar);
            if (o2Var != null) {
                gc.g(o2Var, ybVar, 1500).j();
                return;
            } else {
                gc.f(frameLayout, ybVar, 1500).j();
                return;
            }
        }
        if (o2Var != null) {
            ocVar = oc.a0(o2Var);
        } else {
            ocVar = new oc(frameLayout, b6Var);
        }
        ocVar.q(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), zqVar).j();
    }

    @Override
    public final void w(TLObject tLObject, Object obj) {
        wy wyVar = this.f31767a;
        zv zvVar = wyVar.f34394d0;
        if (zvVar.getAdapter() != wyVar.f34414j0 && zvVar.getAdapter() != wyVar.f34402f0) {
            return;
        }
        wyVar.f34432p1.e(tLObject, obj);
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
    public final void y(String str) {
    }

    @Override
    public final void v(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override
    public final void F(CharSequence charSequence, String str, org.telegram.ui.df dfVar) {
    }
}
