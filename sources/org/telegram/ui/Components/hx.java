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
public final class hx implements org.telegram.ui.lt {
    public final nz f24958a;

    public hx(nz nzVar) {
        this.f24958a = nzVar;
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
        org.telegram.ui.ActionBar.m2 m2Var = this.f24958a.Y1;
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
        ConnectionsManager.getInstance(this.f24958a.f26818c1).sendRequest(tL_stickers_removeStickerFromSet, new y1(this, 4));
    }

    @Override
    public final String G(boolean z10) {
        nz nzVar = this.f24958a;
        if (z10) {
            s4.h0 adapter = nzVar.f26833h0.getAdapter();
            sy syVar = nzVar.f26839j0;
            if (adapter == syVar) {
                return syVar.f28367w;
            }
            return null;
        }
        s4.h0 adapter2 = nzVar.P.getAdapter();
        ny nyVar = nzVar.S;
        if (adapter2 == nyVar) {
            return nyVar.v;
        }
        return null;
    }

    @Override
    public final void H(TLRPC.Document document) {
        yc ycVar;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new z5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (AndroidUtilities.addToClipboard(valueOf)) {
            nz nzVar = this.f24958a;
            org.telegram.ui.ActionBar.m2 m2Var = nzVar.Y1;
            if (m2Var != null) {
                ycVar = yc.a0(m2Var);
            } else {
                ycVar = new yc(nzVar.f26862r, nzVar.Z1);
            }
            org.telegram.messenger.ok.o(R.string.EmojiCopied, ycVar);
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
        this.f24958a.W();
    }

    @Override
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        if (inputStickerSet == null) {
            return;
        }
        this.f24958a.f26871t1.d(null, inputStickerSet, false);
    }

    @Override
    public final boolean N(TLRPC.Document document) {
        if (document != null) {
            ArrayList<String> arrayList = Emoji.recentEmoji;
            if (arrayList.contains("animated_" + document.f18358id)) {
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
        if (document != null && (emojiStatusDocumentId == null || emojiStatusDocumentId.longValue() != document.f18358id)) {
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
        return this.f24958a.f26871t1.a();
    }

    @Override
    public final boolean b() {
        return this.f24958a.f26871t1.b();
    }

    @Override
    public final boolean c() {
        return this.f24958a.f26871t1.c();
    }

    @Override
    public final TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override
    public final boolean e(TLRPC.Document document) {
        return this.f24958a.f26871t1.j();
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
        nz nzVar = this.f24958a;
        if (nzVar.Y1 == null && nzVar.f26873u0) {
            return false;
        }
        return true;
    }

    @Override
    public final b80 j(ci.m6 m6Var) {
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
        nz nzVar = this.f24958a;
        org.telegram.ui.ActionBar.m2 m2Var = nzVar.Y1;
        if ((m2Var instanceof org.telegram.ui.wn) && ((org.telegram.ui.wn) m2Var).E6()) {
            if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (((org.telegram.ui.wn) nzVar.Y1).i() != null && UserObject.isUserSelf(((org.telegram.ui.wn) nzVar.Y1).i()))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void n(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
        this.f24958a.f26871t1.m(null, document, str, obj, null, z10, i10);
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
        nz nzVar = this.f24958a;
        iy0.o0(nzVar.Y1, MediaDataController.getInstance(nzVar.f26818c1).getStickerSet(inputStickerSet, true), document);
    }

    @Override
    public final boolean q() {
        return false;
    }

    @Override
    public final void r(TLRPC.Document document) {
        if (document != null) {
            Emoji.removeRecentEmoji("animated_" + document.f18358id);
            wx wxVar = this.f24958a.R;
            if (wxVar != null) {
                wxVar.F(false);
            }
        }
    }

    @Override
    public final void t(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
        nz nzVar = this.f24958a;
        pw pwVar = nzVar.f26833h0;
        if (pwVar.getAdapter() == nzVar.f26850n0) {
            nzVar.f26871t1.v(null, tLObject, null, obj, z10, i10, i11);
        } else if (pwVar.getAdapter() == nzVar.f26839j0) {
            nzVar.f26871t1.v(null, tLObject, null, obj, z10, i10, i11);
        }
    }

    @Override
    public final void u() {
        zx zxVar = this.f24958a.P;
        if (zxVar != null && zxVar.f31084l3 != null) {
            while (zxVar.f31084l3.size() > 0) {
                yx yxVar = (yx) zxVar.f31084l3.valueAt(0);
                zxVar.f31084l3.removeAt(0);
                if (yxVar != null) {
                    View view = yxVar.d;
                    if (view != null && (view.getBackground() instanceof RippleDrawable)) {
                        yxVar.d.getBackground().setState(new int[0]);
                    }
                    View view2 = yxVar.d;
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
        yc ycVar;
        nz nzVar = this.f24958a;
        FrameLayout frameLayout = nzVar.f26862r;
        org.telegram.ui.ActionBar.m2 m2Var = nzVar.Y1;
        org.telegram.ui.ActionBar.d6 d6Var = nzVar.Z1;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.f18358id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        if (currentUser == null) {
            obj = new TLRPC.TL_emojiStatusEmpty();
        } else {
            obj = currentUser.emoji_status;
        }
        MessagesController.getInstance(nzVar.f26818c1).updateEmojiStatus(emojiStatus);
        xw xwVar = new xw(0, this, obj);
        if (document == null) {
            jc jcVar = new jc(nzVar.getContext(), d6Var);
            jcVar.f25401b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
            int i10 = R.drawable.msg_settings_premium;
            ImageView imageView = jcVar.f25400a;
            imageView.setImageResource(i10);
            imageView.setScaleX(0.8f);
            imageView.setScaleY(0.8f);
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19481z9, d6Var), PorterDuff.Mode.MULTIPLY));
            pc pcVar = new pc(nzVar.getContext(), d6Var, true);
            pcVar.f27306a = xwVar;
            jcVar.setButton(pcVar);
            if (m2Var != null) {
                rc.g(m2Var, jcVar, 1500).j();
                return;
            } else {
                rc.f(frameLayout, jcVar, 1500).j();
                return;
            }
        }
        if (m2Var != null) {
            ycVar = yc.a0(m2Var);
        } else {
            ycVar = new yc(frameLayout, d6Var);
        }
        ycVar.q(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), xwVar).j();
    }

    @Override
    public final void x(TLObject tLObject, Object obj) {
        nz nzVar = this.f24958a;
        pw pwVar = nzVar.f26833h0;
        if (pwVar.getAdapter() != nzVar.f26850n0 && pwVar.getAdapter() != nzVar.f26839j0) {
            return;
        }
        nzVar.f26871t1.e(tLObject, obj);
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
