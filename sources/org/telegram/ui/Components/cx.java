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
public final class cx implements org.telegram.ui.ot {
    public final mz f26104a;

    public cx(mz mzVar) {
        this.f26104a = mzVar;
    }

    @Override
    public final boolean A() {
        return false;
    }

    @Override
    public final void B(TLRPC.Document document) {
        org.telegram.ui.ActionBar.p2 p2Var = this.f26104a.V1;
        if (p2Var instanceof org.telegram.ui.xn) {
            ((org.telegram.ui.xn) p2Var).bb(document);
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
        ConnectionsManager.getInstance(this.f26104a.Z0).sendRequest(tL_stickers_removeStickerFromSet, new y1(this, 4));
    }

    @Override
    public final String F(boolean z4) {
        mz mzVar = this.f26104a;
        if (z4) {
            f2.p0 adapter = mzVar.f29278e0.getAdapter();
            qy qyVar = mzVar.f29285g0;
            if (adapter == qyVar) {
                return qyVar.f30526w;
            }
            return null;
        }
        f2.p0 adapter2 = mzVar.M.getAdapter();
        ly lyVar = mzVar.P;
        if (adapter2 == lyVar) {
            return lyVar.v;
        }
        return null;
    }

    @Override
    public final void G(TLRPC.Document document) {
        qc qcVar;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new u5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (AndroidUtilities.addToClipboard(valueOf)) {
            mz mzVar = this.f26104a;
            org.telegram.ui.ActionBar.p2 p2Var = mzVar.V1;
            if (p2Var != null) {
                qcVar = qc.a0(p2Var);
            } else {
                qcVar = new qc(mzVar.f29317r, mzVar.W1);
            }
            org.telegram.ui.b.m(R.string.EmojiCopied, qcVar);
        }
    }

    @Override
    public final boolean H() {
        return false;
    }

    @Override
    public final q70 I(ag.l lVar) {
        return null;
    }

    @Override
    public final boolean J() {
        return false;
    }

    @Override
    public final void L() {
        this.f26104a.Y();
    }

    @Override
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z4) {
        if (inputStickerSet == null) {
            return;
        }
        this.f26104a.f29315q1.d(null, inputStickerSet, false);
    }

    @Override
    public final boolean N(TLRPC.Document document) {
        if (document != null) {
            ArrayList<String> arrayList = Emoji.recentEmoji;
            if (arrayList.contains("animated_" + document.f20849id)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final Boolean P(TLRPC.Document document) {
        TLRPC.User currentUser;
        boolean z4;
        if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser()) == null) {
            return null;
        }
        Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(currentUser);
        if (document != null && (emojiStatusDocumentId == null || emojiStatusDocumentId.longValue() != document.f20849id)) {
            z4 = true;
        } else {
            z4 = false;
        }
        return Boolean.valueOf(z4);
    }

    @Override
    public final boolean Q() {
        return true;
    }

    @Override
    public final long a() {
        return this.f26104a.f29315q1.a();
    }

    @Override
    public final boolean b() {
        return this.f26104a.f29315q1.b();
    }

    @Override
    public final boolean c() {
        return this.f26104a.f29315q1.c();
    }

    @Override
    public final TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override
    public final boolean e(TLRPC.Document document) {
        return this.f26104a.f29315q1.j();
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
        mz mzVar = this.f26104a;
        if (mzVar.V1 == null && mzVar.f29318r0) {
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
        mz mzVar = this.f26104a;
        org.telegram.ui.ActionBar.p2 p2Var = mzVar.V1;
        if ((p2Var instanceof org.telegram.ui.xn) && ((org.telegram.ui.xn) p2Var).E6()) {
            if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (((org.telegram.ui.xn) mzVar.V1).i() != null && UserObject.isUserSelf(((org.telegram.ui.xn) mzVar.V1).i()))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z4, int i10, int i11) {
        this.f26104a.f29315q1.m(null, document, str, obj, null, z4, i10);
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
        mz mzVar = this.f26104a;
        yx0.o0(mzVar.V1, MediaDataController.getInstance(mzVar.Z0).getStickerSet(inputStickerSet, true), document);
    }

    @Override
    public final boolean o() {
        return false;
    }

    @Override
    public final void p(TLRPC.Document document) {
        if (document != null) {
            Emoji.removeRecentEmoji("animated_" + document.f20849id);
            tx txVar = this.f26104a.O;
            if (txVar != null) {
                txVar.F(false);
            }
        }
    }

    @Override
    public final void r(int i10, int i11, Object obj, TLObject tLObject, boolean z4) {
        mz mzVar = this.f26104a;
        lw lwVar = mzVar.f29278e0;
        if (lwVar.getAdapter() == mzVar.f29297k0) {
            mzVar.f29315q1.v(null, tLObject, null, obj, z4, i10, i11);
        } else if (lwVar.getAdapter() == mzVar.f29285g0) {
            mzVar.f29315q1.v(null, tLObject, null, obj, z4, i10, i11);
        }
    }

    @Override
    public final void s() {
        kx kxVar = this.f26104a.M;
        if (kxVar != null && kxVar.f32864b3 != null) {
            while (kxVar.f32864b3.size() > 0) {
                vx vxVar = (vx) kxVar.f32864b3.valueAt(0);
                kxVar.f32864b3.removeAt(0);
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
    public final void t(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        Object obj;
        qc qcVar;
        mz mzVar = this.f26104a;
        FrameLayout frameLayout = mzVar.f29317r;
        org.telegram.ui.ActionBar.p2 p2Var = mzVar.V1;
        org.telegram.ui.ActionBar.g6 g6Var = mzVar.W1;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.f20849id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        if (currentUser == null) {
            obj = new TLRPC.TL_emojiStatusEmpty();
        } else {
            obj = currentUser.emoji_status;
        }
        MessagesController.getInstance(mzVar.Z0).updateEmojiStatus(emojiStatus);
        gm gmVar = new gm(12, this, obj);
        if (document == null) {
            ac acVar = new ac(mzVar.getContext(), g6Var);
            acVar.f25219b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
            int i10 = R.drawable.msg_settings_premium;
            ImageView imageView = acVar.f25218a;
            imageView.setImageResource(i10);
            imageView.setScaleX(0.8f);
            imageView.setScaleY(0.8f);
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f22056z9, g6Var), PorterDuff.Mode.MULTIPLY));
            gc gcVar = new gc(mzVar.getContext(), g6Var, true);
            gcVar.f27161a = gmVar;
            acVar.setButton(gcVar);
            if (p2Var != null) {
                ic.g(p2Var, acVar, 1500).j();
                return;
            } else {
                ic.f(frameLayout, acVar, 1500).j();
                return;
            }
        }
        if (p2Var != null) {
            qcVar = qc.a0(p2Var);
        } else {
            qcVar = new qc(frameLayout, g6Var);
        }
        qcVar.q(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), gmVar).j();
    }

    @Override
    public final void v(TLObject tLObject, Object obj) {
        mz mzVar = this.f26104a;
        lw lwVar = mzVar.f29278e0;
        if (lwVar.getAdapter() != mzVar.f29297k0 && lwVar.getAdapter() != mzVar.f29285g0) {
            return;
        }
        mzVar.f29315q1.e(tLObject, obj);
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
    public final void z(CharSequence charSequence, String str, xk xkVar) {
    }
}
