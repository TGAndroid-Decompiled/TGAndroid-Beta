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
public final class ex implements org.telegram.ui.nt {
    public final lz f23755a;

    public ex(lz lzVar) {
        this.f23755a = lzVar;
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
        org.telegram.ui.ActionBar.n2 n2Var = this.f23755a.Y1;
        if (n2Var instanceof org.telegram.ui.xn) {
            ((org.telegram.ui.xn) n2Var).bb(document);
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
        ConnectionsManager.getInstance(this.f23755a.f25968c1).sendRequest(tL_stickers_removeStickerFromSet, new y1(this, 4));
    }

    @Override
    public final String G(boolean z10) {
        lz lzVar = this.f23755a;
        if (z10) {
            s4.h0 adapter = lzVar.f25983h0.getAdapter();
            qy qyVar = lzVar.f25989j0;
            if (adapter == qyVar) {
                return qyVar.f27485w;
            }
            return null;
        }
        s4.h0 adapter2 = lzVar.P.getAdapter();
        ky kyVar = lzVar.S;
        if (adapter2 == kyVar) {
            return kyVar.v;
        }
        return null;
    }

    @Override
    public final void H(TLRPC.Document document) {
        xc xcVar;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new z5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (AndroidUtilities.addToClipboard(valueOf)) {
            lz lzVar = this.f23755a;
            org.telegram.ui.ActionBar.n2 n2Var = lzVar.Y1;
            if (n2Var != null) {
                xcVar = xc.a0(n2Var);
            } else {
                xcVar = new xc(lzVar.f26012r, lzVar.Z1);
            }
            org.telegram.messenger.ul.p(R.string.EmojiCopied, xcVar);
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
        this.f23755a.W();
    }

    @Override
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        if (inputStickerSet == null) {
            return;
        }
        this.f23755a.f26021t1.d(null, inputStickerSet, false);
    }

    @Override
    public final boolean N(TLRPC.Document document) {
        if (document != null) {
            ArrayList<String> arrayList = Emoji.recentEmoji;
            if (arrayList.contains("animated_" + document.f18089id)) {
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
        if (document != null && (emojiStatusDocumentId == null || emojiStatusDocumentId.longValue() != document.f18089id)) {
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
        return this.f23755a.f26021t1.a();
    }

    @Override
    public final boolean b() {
        return this.f23755a.f26021t1.b();
    }

    @Override
    public final boolean c() {
        return this.f23755a.f26021t1.c();
    }

    @Override
    public final TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override
    public final boolean e(TLRPC.Document document) {
        return this.f23755a.f26021t1.j();
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
        lz lzVar = this.f23755a;
        if (lzVar.Y1 == null && lzVar.f26023u0) {
            return false;
        }
        return true;
    }

    @Override
    public final o70 j(ci.m6 m6Var) {
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
        lz lzVar = this.f23755a;
        org.telegram.ui.ActionBar.n2 n2Var = lzVar.Y1;
        if ((n2Var instanceof org.telegram.ui.xn) && ((org.telegram.ui.xn) n2Var).E6()) {
            if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (((org.telegram.ui.xn) lzVar.Y1).i() != null && UserObject.isUserSelf(((org.telegram.ui.xn) lzVar.Y1).i()))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void n(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
        this.f23755a.f26021t1.m(null, document, str, obj, null, z10, i10);
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
        lz lzVar = this.f23755a;
        ux0.o0(lzVar.Y1, MediaDataController.getInstance(lzVar.f25968c1).getStickerSet(inputStickerSet, true), document);
    }

    @Override
    public final boolean q() {
        return false;
    }

    @Override
    public final void r(TLRPC.Document document) {
        if (document != null) {
            Emoji.removeRecentEmoji("animated_" + document.f18089id);
            tx txVar = this.f23755a.R;
            if (txVar != null) {
                txVar.F(false);
            }
        }
    }

    @Override
    public final void t(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
        lz lzVar = this.f23755a;
        nw nwVar = lzVar.f25983h0;
        if (nwVar.getAdapter() == lzVar.f26000n0) {
            lzVar.f26021t1.v(null, tLObject, null, obj, z10, i10, i11);
        } else if (nwVar.getAdapter() == lzVar.f25989j0) {
            lzVar.f26021t1.v(null, tLObject, null, obj, z10, i10, i11);
        }
    }

    @Override
    public final void u() {
        wx wxVar = this.f23755a.P;
        if (wxVar != null && wxVar.f29829e3 != null) {
            while (wxVar.f29829e3.size() > 0) {
                vx vxVar = (vx) wxVar.f29829e3.valueAt(0);
                wxVar.f29829e3.removeAt(0);
                if (vxVar != null) {
                    View view = vxVar.d;
                    if (view != null && (view.getBackground() instanceof RippleDrawable)) {
                        vxVar.d.getBackground().setState(new int[0]);
                    }
                    View view2 = vxVar.d;
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
        xc xcVar;
        lz lzVar = this.f23755a;
        FrameLayout frameLayout = lzVar.f26012r;
        org.telegram.ui.ActionBar.n2 n2Var = lzVar.Y1;
        org.telegram.ui.ActionBar.d6 d6Var = lzVar.Z1;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.f18089id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        if (currentUser == null) {
            obj = new TLRPC.TL_emojiStatusEmpty();
        } else {
            obj = currentUser.emoji_status;
        }
        MessagesController.getInstance(lzVar.f25968c1).updateEmojiStatus(emojiStatus);
        ph phVar = new ph(25, this, obj);
        if (document == null) {
            ic icVar = new ic(lzVar.getContext(), d6Var);
            icVar.f24940b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
            int i10 = R.drawable.msg_settings_premium;
            ImageView imageView = icVar.f24939a;
            imageView.setImageResource(i10);
            imageView.setScaleX(0.8f);
            imageView.setScaleY(0.8f);
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19192z9, d6Var), PorterDuff.Mode.MULTIPLY));
            oc ocVar = new oc(lzVar.getContext(), d6Var, true);
            ocVar.f26716a = phVar;
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
            xcVar = xc.a0(n2Var);
        } else {
            xcVar = new xc(frameLayout, d6Var);
        }
        xcVar.q(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), phVar).j();
    }

    @Override
    public final void x(TLObject tLObject, Object obj) {
        lz lzVar = this.f23755a;
        nw nwVar = lzVar.f25983h0;
        if (nwVar.getAdapter() != lzVar.f26000n0 && nwVar.getAdapter() != lzVar.f25989j0) {
            return;
        }
        lzVar.f26021t1.e(tLObject, obj);
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
    public final void f(CharSequence charSequence, String str, org.telegram.ui.dt dtVar) {
    }
}
