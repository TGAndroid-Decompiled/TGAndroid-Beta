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
public final class wx implements org.telegram.ui.st {
    public final d00 f32575a;

    public wx(d00 d00Var) {
        this.f32575a = d00Var;
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
        org.telegram.ui.ActionBar.m2 m2Var = this.f32575a.Y1;
        if (m2Var instanceof org.telegram.ui.eo) {
            ((org.telegram.ui.eo) m2Var).fb(document);
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
        ConnectionsManager.getInstance(this.f32575a.f25072c1).sendRequest(tL_stickers_removeStickerFromSet, new y1(this, 4));
    }

    @Override
    public final String G(boolean z10) {
        d00 d00Var = this.f32575a;
        if (z10) {
            s4.i0 adapter = d00Var.f25088h0.getAdapter();
            hz hzVar = d00Var.f25094j0;
            if (adapter == hzVar) {
                return hzVar.f26979w;
            }
            return null;
        }
        s4.i0 adapter2 = d00Var.P.getAdapter();
        cz czVar = d00Var.S;
        if (adapter2 == czVar) {
            return czVar.v;
        }
        return null;
    }

    @Override
    public final void H(TLRPC.Document document) {
        zc zcVar;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new b6(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (AndroidUtilities.addToClipboard(valueOf)) {
            d00 d00Var = this.f32575a;
            org.telegram.ui.ActionBar.m2 m2Var = d00Var.Y1;
            if (m2Var != null) {
                zcVar = zc.a0(m2Var);
            } else {
                zcVar = new zc(d00Var.f25117r, d00Var.Z1);
            }
            org.telegram.messenger.am.p(R.string.EmojiCopied, zcVar);
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
        this.f32575a.W();
    }

    @Override
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        if (inputStickerSet == null) {
            return;
        }
        this.f32575a.f25126t1.d(null, inputStickerSet, false);
    }

    @Override
    public final boolean N(TLRPC.Document document) {
        if (document != null) {
            ArrayList<String> arrayList = Emoji.recentEmoji;
            if (arrayList.contains("animated_" + document.f19809id)) {
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
        if (document != null && (emojiStatusDocumentId == null || emojiStatusDocumentId.longValue() != document.f19809id)) {
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
        return this.f32575a.f25126t1.a();
    }

    @Override
    public final boolean b() {
        return this.f32575a.f25126t1.b();
    }

    @Override
    public final boolean c() {
        return this.f32575a.f25126t1.c();
    }

    @Override
    public final TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override
    public final boolean e(TLRPC.Document document) {
        return this.f32575a.f25126t1.j();
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
        d00 d00Var = this.f32575a;
        if (d00Var.Y1 == null && d00Var.f25128u0) {
            return false;
        }
        return true;
    }

    @Override
    public final s80 j(ci.m6 m6Var) {
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
        d00 d00Var = this.f32575a;
        org.telegram.ui.ActionBar.m2 m2Var = d00Var.Y1;
        if ((m2Var instanceof org.telegram.ui.eo) && ((org.telegram.ui.eo) m2Var).H6()) {
            if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (((org.telegram.ui.eo) d00Var.Y1).i() != null && UserObject.isUserSelf(((org.telegram.ui.eo) d00Var.Y1).i()))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void n(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
        this.f32575a.f25126t1.m(null, document, str, obj, null, z10, i10);
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
        d00 d00Var = this.f32575a;
        dz0.p0(d00Var.Y1, MediaDataController.getInstance(d00Var.f25072c1).getStickerSet(inputStickerSet, true), document);
    }

    @Override
    public final boolean q() {
        return false;
    }

    @Override
    public final void r(TLRPC.Document document) {
        if (document != null) {
            Emoji.removeRecentEmoji("animated_" + document.f19809id);
            my myVar = this.f32575a.R;
            if (myVar != null) {
                myVar.F(false);
            }
        }
    }

    @Override
    public final void t(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
        d00 d00Var = this.f32575a;
        fx fxVar = d00Var.f25088h0;
        if (fxVar.getAdapter() == d00Var.f25105n0) {
            d00Var.f25126t1.v(null, tLObject, null, obj, z10, i10, i11);
        } else if (fxVar.getAdapter() == d00Var.f25094j0) {
            d00Var.f25126t1.v(null, tLObject, null, obj, z10, i10, i11);
        }
    }

    @Override
    public final void u() {
        py pyVar = this.f32575a.P;
        if (pyVar != null && pyVar.f29589c3 != null) {
            while (pyVar.f29589c3.size() > 0) {
                oy oyVar = (oy) pyVar.f29589c3.valueAt(0);
                pyVar.f29589c3.removeAt(0);
                if (oyVar != null) {
                    View view = oyVar.d;
                    if (view != null && (view.getBackground() instanceof RippleDrawable)) {
                        oyVar.d.getBackground().setState(new int[0]);
                    }
                    View view2 = oyVar.d;
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
        zc zcVar;
        d00 d00Var = this.f32575a;
        FrameLayout frameLayout = d00Var.f25117r;
        org.telegram.ui.ActionBar.m2 m2Var = d00Var.Y1;
        org.telegram.ui.ActionBar.c6 c6Var = d00Var.Z1;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.f19809id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        if (currentUser == null) {
            obj = new TLRPC.TL_emojiStatusEmpty();
        } else {
            obj = currentUser.emoji_status;
        }
        MessagesController.getInstance(d00Var.f25072c1).updateEmojiStatus(emojiStatus);
        jt jtVar = new jt(5, this, obj);
        if (document == null) {
            kc kcVar = new kc(d00Var.getContext(), c6Var);
            kcVar.f27821b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
            int i10 = R.drawable.msg_settings_premium;
            ImageView imageView = kcVar.f27820a;
            imageView.setImageResource(i10);
            imageView.setScaleX(0.8f);
            imageView.setScaleY(0.8f);
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20967z9, c6Var), PorterDuff.Mode.MULTIPLY));
            qc qcVar = new qc(d00Var.getContext(), c6Var, true);
            qcVar.f29794a = jtVar;
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
        zcVar.q(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), jtVar).j();
    }

    @Override
    public final void x(TLObject tLObject, Object obj) {
        d00 d00Var = this.f32575a;
        fx fxVar = d00Var.f25088h0;
        if (fxVar.getAdapter() != d00Var.f25105n0 && fxVar.getAdapter() != d00Var.f25094j0) {
            return;
        }
        d00Var.f25126t1.e(tLObject, obj);
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
    public final void f(CharSequence charSequence, String str, org.telegram.ui.jt jtVar) {
    }
}
