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
public final class ux implements org.telegram.ui.pt {
    public final b00 f31657a;

    public ux(b00 b00Var) {
        this.f31657a = b00Var;
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
        org.telegram.ui.ActionBar.n2 n2Var = this.f31657a.Y1;
        if (n2Var instanceof org.telegram.ui.zn) {
            ((org.telegram.ui.zn) n2Var).fb(document);
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
        ConnectionsManager.getInstance(this.f31657a.f24689c1).sendRequest(tL_stickers_removeStickerFromSet, new y1(this, 4));
    }

    @Override
    public final String G(boolean z10) {
        b00 b00Var = this.f31657a;
        if (z10) {
            s4.i0 adapter = b00Var.f24705h0.getAdapter();
            fz fzVar = b00Var.f24711j0;
            if (adapter == fzVar) {
                return fzVar.f26542w;
            }
            return null;
        }
        s4.i0 adapter2 = b00Var.P.getAdapter();
        az azVar = b00Var.S;
        if (adapter2 == azVar) {
            return azVar.v;
        }
        return null;
    }

    @Override
    public final void H(TLRPC.Document document) {
        ad adVar;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new b6(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (AndroidUtilities.addToClipboard(valueOf)) {
            b00 b00Var = this.f31657a;
            org.telegram.ui.ActionBar.n2 n2Var = b00Var.Y1;
            if (n2Var != null) {
                adVar = ad.a0(n2Var);
            } else {
                adVar = new ad(b00Var.f24734r, b00Var.Z1);
            }
            org.telegram.messenger.bi.p(R.string.EmojiCopied, adVar);
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
        this.f31657a.W();
    }

    @Override
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        if (inputStickerSet == null) {
            return;
        }
        this.f31657a.f24743t1.d(null, inputStickerSet, false);
    }

    @Override
    public final boolean N(TLRPC.Document document) {
        if (document != null) {
            ArrayList<String> arrayList = Emoji.recentEmoji;
            if (arrayList.contains("animated_" + document.f20048id)) {
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
        if (document != null && (emojiStatusDocumentId == null || emojiStatusDocumentId.longValue() != document.f20048id)) {
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
        return this.f31657a.f24743t1.a();
    }

    @Override
    public final boolean b() {
        return this.f31657a.f24743t1.b();
    }

    @Override
    public final boolean c() {
        return this.f31657a.f24743t1.c();
    }

    @Override
    public final TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override
    public final boolean e(TLRPC.Document document) {
        return this.f31657a.f24743t1.j();
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
        b00 b00Var = this.f31657a;
        if (b00Var.Y1 == null && b00Var.f24745u0) {
            return false;
        }
        return true;
    }

    @Override
    public final q80 j(ci.m6 m6Var) {
        return null;
    }

    @Override
    public final boolean l() {
        return false;
    }

    @Override
    public final boolean m(int i10) {
        if (i10 != 2) {
            return true;
        }
        b00 b00Var = this.f31657a;
        org.telegram.ui.ActionBar.n2 n2Var = b00Var.Y1;
        if ((n2Var instanceof org.telegram.ui.zn) && ((org.telegram.ui.zn) n2Var).H6()) {
            if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (((org.telegram.ui.zn) b00Var.Y1).i() != null && UserObject.isUserSelf(((org.telegram.ui.zn) b00Var.Y1).i()))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void n(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
        this.f31657a.f24743t1.m(null, document, str, obj, null, z10, i10);
    }

    @Override
    public final void p(TLRPC.Document document) {
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
        b00 b00Var = this.f31657a;
        yy0.p0(b00Var.Y1, MediaDataController.getInstance(b00Var.f24689c1).getStickerSet(inputStickerSet, true), document);
    }

    @Override
    public final boolean q() {
        return false;
    }

    @Override
    public final void r(TLRPC.Document document) {
        if (document != null) {
            Emoji.removeRecentEmoji("animated_" + document.f20048id);
            ky kyVar = this.f31657a.R;
            if (kyVar != null) {
                kyVar.F(false);
            }
        }
    }

    @Override
    public final void t(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
        b00 b00Var = this.f31657a;
        dx dxVar = b00Var.f24705h0;
        if (dxVar.getAdapter() == b00Var.f24722n0) {
            b00Var.f24743t1.v(null, tLObject, null, obj, z10, i10, i11);
        } else if (dxVar.getAdapter() == b00Var.f24711j0) {
            b00Var.f24743t1.v(null, tLObject, null, obj, z10, i10, i11);
        }
    }

    @Override
    public final void u() {
        ny nyVar = this.f31657a.P;
        if (nyVar != null && nyVar.f29266c3 != null) {
            while (nyVar.f29266c3.size() > 0) {
                my myVar = (my) nyVar.f29266c3.valueAt(0);
                nyVar.f29266c3.removeAt(0);
                if (myVar != null) {
                    View view = myVar.d;
                    if (view != null && (view.getBackground() instanceof RippleDrawable)) {
                        myVar.d.getBackground().setState(new int[0]);
                    }
                    View view2 = myVar.d;
                    if (view2 != null) {
                        view2.setPressed(false);
                    }
                }
            }
        }
    }

    @Override
    public final void v(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        Object obj;
        ad adVar;
        b00 b00Var = this.f31657a;
        FrameLayout frameLayout = b00Var.f24734r;
        org.telegram.ui.ActionBar.n2 n2Var = b00Var.Y1;
        org.telegram.ui.ActionBar.e6 e6Var = b00Var.Z1;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.f20048id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        if (currentUser == null) {
            obj = new TLRPC.TL_emojiStatusEmpty();
        } else {
            obj = currentUser.emoji_status;
        }
        MessagesController.getInstance(b00Var.f24689c1).updateEmojiStatus(emojiStatus);
        as asVar = new as(7, this, obj);
        if (document == null) {
            lc lcVar = new lc(b00Var.getContext(), e6Var);
            lcVar.f28301b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
            int i10 = R.drawable.msg_settings_premium;
            ImageView imageView = lcVar.f28300a;
            imageView.setImageResource(i10);
            imageView.setScaleX(0.8f);
            imageView.setScaleY(0.8f);
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21206z9, e6Var), PorterDuff.Mode.MULTIPLY));
            rc rcVar = new rc(b00Var.getContext(), e6Var, true);
            rcVar.f30443a = asVar;
            lcVar.setButton(rcVar);
            if (n2Var != null) {
                tc.g(n2Var, lcVar, 1500).j();
                return;
            } else {
                tc.f(frameLayout, lcVar, 1500).j();
                return;
            }
        }
        if (n2Var != null) {
            adVar = ad.a0(n2Var);
        } else {
            adVar = new ad(frameLayout, e6Var);
        }
        adVar.q(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), asVar).j();
    }

    @Override
    public final void x(TLObject tLObject, Object obj) {
        b00 b00Var = this.f31657a;
        dx dxVar = b00Var.f24705h0;
        if (dxVar.getAdapter() != b00Var.f24722n0 && dxVar.getAdapter() != b00Var.f24711j0) {
            return;
        }
        b00Var.f24743t1.e(tLObject, obj);
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
    public final void k(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override
    public final void o(String str) {
    }

    @Override
    public final void s() {
    }

    @Override
    public final void z(String str) {
    }

    @Override
    public final void w(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override
    public final void f(CharSequence charSequence, String str, org.telegram.ui.ft ftVar) {
    }
}
