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
public final class dx implements org.telegram.ui.qt {
    public final kz f25473a;

    public dx(kz kzVar) {
        this.f25473a = kzVar;
    }

    @Override
    public final boolean A() {
        return false;
    }

    @Override
    public final void B(TLRPC.Document document) {
        org.telegram.ui.ActionBar.n2 n2Var = this.f25473a.Y1;
        if (n2Var instanceof org.telegram.ui.co) {
            ((org.telegram.ui.co) n2Var).bb(document);
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
        ConnectionsManager.getInstance(this.f25473a.f27932c1).sendRequest(tL_stickers_removeStickerFromSet, new y1(this, 4));
    }

    @Override
    public final String F(boolean z10) {
        kz kzVar = this.f25473a;
        if (z10) {
            s4.h0 adapter = kzVar.f27948h0.getAdapter();
            py pyVar = kzVar.f27954j0;
            if (adapter == pyVar) {
                return pyVar.f29517w;
            }
            return null;
        }
        s4.h0 adapter2 = kzVar.P.getAdapter();
        ky kyVar = kzVar.S;
        if (adapter2 == kyVar) {
            return kyVar.v;
        }
        return null;
    }

    @Override
    public final void H(TLRPC.Document document) {
        yc ycVar;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new z5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (AndroidUtilities.addToClipboard(valueOf)) {
            kz kzVar = this.f25473a;
            org.telegram.ui.ActionBar.n2 n2Var = kzVar.Y1;
            if (n2Var != null) {
                ycVar = yc.a0(n2Var);
            } else {
                ycVar = new yc(kzVar.f27977r, kzVar.Z1);
            }
            org.telegram.messenger.vl.o(R.string.EmojiCopied, ycVar);
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
        this.f25473a.Y();
    }

    @Override
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        if (inputStickerSet == null) {
            return;
        }
        this.f25473a.f27986t1.d(null, inputStickerSet, false);
    }

    @Override
    public final boolean N(TLRPC.Document document) {
        if (document != null) {
            ArrayList<String> arrayList = Emoji.recentEmoji;
            if (arrayList.contains("animated_" + document.f19875id)) {
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
        if (document != null && (emojiStatusDocumentId == null || emojiStatusDocumentId.longValue() != document.f19875id)) {
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
        return this.f25473a.f27986t1.a();
    }

    @Override
    public final boolean b() {
        return this.f25473a.f27986t1.b();
    }

    @Override
    public final boolean c() {
        return this.f25473a.f27986t1.c();
    }

    @Override
    public final TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override
    public final boolean e(TLRPC.Document document) {
        return this.f25473a.f27986t1.j();
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
        kz kzVar = this.f25473a;
        if (kzVar.Y1 == null && kzVar.f27988u0) {
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
        kz kzVar = this.f25473a;
        org.telegram.ui.ActionBar.n2 n2Var = kzVar.Y1;
        if ((n2Var instanceof org.telegram.ui.co) && ((org.telegram.ui.co) n2Var).E6()) {
            if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (((org.telegram.ui.co) kzVar.Y1).i() != null && UserObject.isUserSelf(((org.telegram.ui.co) kzVar.Y1).i()))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
        this.f25473a.f27986t1.m(null, document, str, obj, null, z10, i10);
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
        kz kzVar = this.f25473a;
        ux0.o0(kzVar.Y1, MediaDataController.getInstance(kzVar.f27932c1).getStickerSet(inputStickerSet, true), document);
    }

    @Override
    public final boolean o() {
        return false;
    }

    @Override
    public final void p(TLRPC.Document document) {
        if (document != null) {
            Emoji.removeRecentEmoji("animated_" + document.f19875id);
            tx txVar = this.f25473a.R;
            if (txVar != null) {
                txVar.F(false);
            }
        }
    }

    @Override
    public final void r(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
        kz kzVar = this.f25473a;
        nw nwVar = kzVar.f27948h0;
        if (nwVar.getAdapter() == kzVar.f27965n0) {
            kzVar.f27986t1.v(null, tLObject, null, obj, z10, i10, i11);
        } else if (nwVar.getAdapter() == kzVar.f27954j0) {
            kzVar.f27986t1.v(null, tLObject, null, obj, z10, i10, i11);
        }
    }

    @Override
    public final void s() {
        kx kxVar = this.f25473a.P;
        if (kxVar != null && kxVar.f32362e3 != null) {
            while (kxVar.f32362e3.size() > 0) {
                vx vxVar = (vx) kxVar.f32362e3.valueAt(0);
                kxVar.f32362e3.removeAt(0);
                if (vxVar != null) {
                    if (vxVar.d.getBackground() instanceof RippleDrawable) {
                        vxVar.d.getBackground().setState(new int[0]);
                    }
                    vxVar.d.setPressed(false);
                }
            }
        }
    }

    @Override
    public final n70 t(ah.w wVar) {
        return null;
    }

    @Override
    public final void u(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        Object obj;
        yc ycVar;
        kz kzVar = this.f25473a;
        FrameLayout frameLayout = kzVar.f27977r;
        org.telegram.ui.ActionBar.n2 n2Var = kzVar.Y1;
        org.telegram.ui.ActionBar.f6 f6Var = kzVar.Z1;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.f19875id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        if (currentUser == null) {
            obj = new TLRPC.TL_emojiStatusEmpty();
        } else {
            obj = currentUser.emoji_status;
        }
        MessagesController.getInstance(kzVar.f27932c1).updateEmojiStatus(emojiStatus);
        zu zuVar = new zu(1, this, obj);
        if (document == null) {
            ic icVar = new ic(kzVar.getContext(), f6Var);
            icVar.f27070b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
            int i10 = R.drawable.msg_settings_premium;
            ImageView imageView = icVar.f27069a;
            imageView.setImageResource(i10);
            imageView.setScaleX(0.8f);
            imageView.setScaleY(0.8f);
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f21064z9, f6Var), PorterDuff.Mode.MULTIPLY));
            oc ocVar = new oc(kzVar.getContext(), f6Var, true);
            ocVar.f29029a = zuVar;
            icVar.setButton(ocVar);
            if (n2Var != null) {
                qc.g(n2Var, icVar, 1500).j();
                return;
            } else {
                qc.f(frameLayout, icVar, 1500).j();
                return;
            }
        }
        if (n2Var != null) {
            ycVar = yc.a0(n2Var);
        } else {
            ycVar = new yc(frameLayout, f6Var);
        }
        ycVar.q(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), zuVar).j();
    }

    @Override
    public final void w(TLObject tLObject, Object obj) {
        kz kzVar = this.f25473a;
        nw nwVar = kzVar.f27948h0;
        if (nwVar.getAdapter() != kzVar.f27965n0 && nwVar.getAdapter() != kzVar.f27954j0) {
            return;
        }
        kzVar.f27986t1.e(tLObject, obj);
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
    public final void G(CharSequence charSequence, String str, org.telegram.ui.nf nfVar) {
    }
}
