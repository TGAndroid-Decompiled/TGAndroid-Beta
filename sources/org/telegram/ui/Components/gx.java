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
public final class gx implements org.telegram.ui.lt {
    public final mz f24595a;

    public gx(mz mzVar) {
        this.f24595a = mzVar;
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
        org.telegram.ui.ActionBar.m2 m2Var = this.f24595a.Y1;
        if (m2Var instanceof org.telegram.ui.wn) {
            ((org.telegram.ui.wn) m2Var).bb(document);
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
        ConnectionsManager.getInstance(this.f24595a.f26548c1).sendRequest(tL_stickers_removeStickerFromSet, new y1(this, 4));
    }

    @Override
    public final String G(boolean z10) {
        mz mzVar = this.f24595a;
        if (z10) {
            s4.h0 adapter = mzVar.f26563h0.getAdapter();
            ry ryVar = mzVar.f26569j0;
            if (adapter == ryVar) {
                return ryVar.f28085w;
            }
            return null;
        }
        s4.h0 adapter2 = mzVar.P.getAdapter();
        my myVar = mzVar.S;
        if (adapter2 == myVar) {
            return myVar.v;
        }
        return null;
    }

    @Override
    public final void H(TLRPC.Document document) {
        xc xcVar;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new z5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (AndroidUtilities.addToClipboard(valueOf)) {
            mz mzVar = this.f24595a;
            org.telegram.ui.ActionBar.m2 m2Var = mzVar.Y1;
            if (m2Var != null) {
                xcVar = xc.a0(m2Var);
            } else {
                xcVar = new xc(mzVar.f26592r, mzVar.Z1);
            }
            org.telegram.messenger.ok.o(R.string.EmojiCopied, xcVar);
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
        this.f24595a.W();
    }

    @Override
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        if (inputStickerSet == null) {
            return;
        }
        this.f24595a.f26601t1.d(null, inputStickerSet, false);
    }

    @Override
    public final boolean N(TLRPC.Document document) {
        if (document != null) {
            ArrayList<String> arrayList = Emoji.recentEmoji;
            if (arrayList.contains("animated_" + document.f18341id)) {
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
        if (document != null && (emojiStatusDocumentId == null || emojiStatusDocumentId.longValue() != document.f18341id)) {
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
        return this.f24595a.f26601t1.a();
    }

    @Override
    public final boolean b() {
        return this.f24595a.f26601t1.b();
    }

    @Override
    public final boolean c() {
        return this.f24595a.f26601t1.c();
    }

    @Override
    public final TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override
    public final boolean e(TLRPC.Document document) {
        return this.f24595a.f26601t1.j();
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
        mz mzVar = this.f24595a;
        if (mzVar.Y1 == null && mzVar.f26603u0) {
            return false;
        }
        return true;
    }

    @Override
    public final z70 j(ci.m6 m6Var) {
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
        mz mzVar = this.f24595a;
        org.telegram.ui.ActionBar.m2 m2Var = mzVar.Y1;
        if ((m2Var instanceof org.telegram.ui.wn) && ((org.telegram.ui.wn) m2Var).E6()) {
            if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (((org.telegram.ui.wn) mzVar.Y1).i() != null && UserObject.isUserSelf(((org.telegram.ui.wn) mzVar.Y1).i()))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void n(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
        this.f24595a.f26601t1.m(null, document, str, obj, null, z10, i10);
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
        mz mzVar = this.f24595a;
        gy0.o0(mzVar.Y1, MediaDataController.getInstance(mzVar.f26548c1).getStickerSet(inputStickerSet, true), document);
    }

    @Override
    public final boolean q() {
        return false;
    }

    @Override
    public final void r(TLRPC.Document document) {
        if (document != null) {
            Emoji.removeRecentEmoji("animated_" + document.f18341id);
            vx vxVar = this.f24595a.R;
            if (vxVar != null) {
                vxVar.F(false);
            }
        }
    }

    @Override
    public final void t(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
        mz mzVar = this.f24595a;
        ow owVar = mzVar.f26563h0;
        if (owVar.getAdapter() == mzVar.f26580n0) {
            mzVar.f26601t1.v(null, tLObject, null, obj, z10, i10, i11);
        } else if (owVar.getAdapter() == mzVar.f26569j0) {
            mzVar.f26601t1.v(null, tLObject, null, obj, z10, i10, i11);
        }
    }

    @Override
    public final void u() {
        yx yxVar = this.f24595a.P;
        if (yxVar != null && yxVar.f30721e3 != null) {
            while (yxVar.f30721e3.size() > 0) {
                xx xxVar = (xx) yxVar.f30721e3.valueAt(0);
                yxVar.f30721e3.removeAt(0);
                if (xxVar != null) {
                    View view = xxVar.d;
                    if (view != null && (view.getBackground() instanceof RippleDrawable)) {
                        xxVar.d.getBackground().setState(new int[0]);
                    }
                    View view2 = xxVar.d;
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
        mz mzVar = this.f24595a;
        FrameLayout frameLayout = mzVar.f26592r;
        org.telegram.ui.ActionBar.m2 m2Var = mzVar.Y1;
        org.telegram.ui.ActionBar.d6 d6Var = mzVar.Z1;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.f18341id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        if (currentUser == null) {
            obj = new TLRPC.TL_emojiStatusEmpty();
        } else {
            obj = currentUser.emoji_status;
        }
        MessagesController.getInstance(mzVar.f26548c1).updateEmojiStatus(emojiStatus);
        ww wwVar = new ww(0, this, obj);
        if (document == null) {
            ic icVar = new ic(mzVar.getContext(), d6Var);
            icVar.f25047b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
            int i10 = R.drawable.msg_settings_premium;
            ImageView imageView = icVar.f25046a;
            imageView.setImageResource(i10);
            imageView.setScaleX(0.8f);
            imageView.setScaleY(0.8f);
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19464z9, d6Var), PorterDuff.Mode.MULTIPLY));
            oc ocVar = new oc(mzVar.getContext(), d6Var, true);
            ocVar.f27028a = wwVar;
            icVar.setButton(ocVar);
            if (m2Var != null) {
                qc.g(m2Var, icVar, 1500).j();
                return;
            } else {
                qc.f(frameLayout, icVar, 1500).j();
                return;
            }
        }
        if (m2Var != null) {
            xcVar = xc.a0(m2Var);
        } else {
            xcVar = new xc(frameLayout, d6Var);
        }
        xcVar.q(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), wwVar).j();
    }

    @Override
    public final void x(TLObject tLObject, Object obj) {
        mz mzVar = this.f24595a;
        ow owVar = mzVar.f26563h0;
        if (owVar.getAdapter() != mzVar.f26580n0 && owVar.getAdapter() != mzVar.f26569j0) {
            return;
        }
        mzVar.f26601t1.e(tLObject, obj);
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
    public final void f(CharSequence charSequence, String str, org.telegram.ui.bt btVar) {
    }
}
