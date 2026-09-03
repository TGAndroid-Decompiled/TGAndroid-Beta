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
public final class ax implements org.telegram.ui.pt {
    public final kz f23494a;

    public ax(kz kzVar) {
        this.f23494a = kzVar;
    }

    @Override
    public final boolean B() {
        return false;
    }

    @Override
    public final void C(TLRPC.Document document) {
        org.telegram.ui.ActionBar.p2 p2Var = this.f23494a.V1;
        if (p2Var instanceof org.telegram.ui.zn) {
            ((org.telegram.ui.zn) p2Var).bb(document);
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
        ConnectionsManager.getInstance(this.f23494a.Z0).sendRequest(tL_stickers_removeStickerFromSet, new y1(this, 4));
    }

    @Override
    public final String G(boolean z4) {
        kz kzVar = this.f23494a;
        if (z4) {
            f2.o0 adapter = kzVar.f26435e0.getAdapter();
            oy oyVar = kzVar.f26442g0;
            if (adapter == oyVar) {
                return oyVar.f27687w;
            }
            return null;
        }
        f2.o0 adapter2 = kzVar.M.getAdapter();
        jy jyVar = kzVar.P;
        if (adapter2 == jyVar) {
            return jyVar.v;
        }
        return null;
    }

    @Override
    public final void H(TLRPC.Document document) {
        qc qcVar;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new u5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (AndroidUtilities.addToClipboard(valueOf)) {
            kz kzVar = this.f23494a;
            org.telegram.ui.ActionBar.p2 p2Var = kzVar.V1;
            if (p2Var != null) {
                qcVar = qc.a0(p2Var);
            } else {
                qcVar = new qc(kzVar.f26474r, kzVar.W1);
            }
            org.telegram.ui.b.m(R.string.EmojiCopied, qcVar);
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
        this.f23494a.Y();
    }

    @Override
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z4) {
        if (inputStickerSet == null) {
            return;
        }
        this.f23494a.f26472q1.d(null, inputStickerSet, false);
    }

    @Override
    public final boolean N(TLRPC.Document document) {
        if (document != null) {
            ArrayList<String> arrayList = Emoji.recentEmoji;
            if (arrayList.contains("animated_" + document.f19165id)) {
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
        if (document != null && (emojiStatusDocumentId == null || emojiStatusDocumentId.longValue() != document.f19165id)) {
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
        return this.f23494a.f26472q1.a();
    }

    @Override
    public final boolean b() {
        return this.f23494a.f26472q1.b();
    }

    @Override
    public final boolean c() {
        return this.f23494a.f26472q1.c();
    }

    @Override
    public final p70 d(ah.e eVar) {
        return null;
    }

    @Override
    public final TLRPC.TL_messageMediaPoll e() {
        return null;
    }

    @Override
    public final boolean f(TLRPC.Document document) {
        return this.f23494a.f26472q1.j();
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
        kz kzVar = this.f23494a;
        if (kzVar.V1 == null && kzVar.f26475r0) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final boolean l(int i10) {
        if (i10 != 2) {
            return true;
        }
        kz kzVar = this.f23494a;
        org.telegram.ui.ActionBar.p2 p2Var = kzVar.V1;
        if ((p2Var instanceof org.telegram.ui.zn) && ((org.telegram.ui.zn) p2Var).E6()) {
            if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (((org.telegram.ui.zn) kzVar.V1).i() != null && UserObject.isUserSelf(((org.telegram.ui.zn) kzVar.V1).i()))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void m(TLRPC.Document document, String str, Object obj, boolean z4, int i10, int i11) {
        this.f23494a.f26472q1.m(null, document, str, obj, null, z4, i10);
    }

    @Override
    public final void o(TLRPC.Document document) {
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
        kz kzVar = this.f23494a;
        xx0.o0(kzVar.V1, MediaDataController.getInstance(kzVar.Z0).getStickerSet(inputStickerSet, true), document);
    }

    @Override
    public final boolean p() {
        return false;
    }

    @Override
    public final void q(TLRPC.Document document) {
        if (document != null) {
            Emoji.removeRecentEmoji("animated_" + document.f19165id);
            rx rxVar = this.f23494a.O;
            if (rxVar != null) {
                rxVar.F(false);
            }
        }
    }

    @Override
    public final void s(int i10, int i11, Object obj, TLObject tLObject, boolean z4) {
        kz kzVar = this.f23494a;
        jw jwVar = kzVar.f26435e0;
        if (jwVar.getAdapter() == kzVar.f26454k0) {
            kzVar.f26472q1.v(null, tLObject, null, obj, z4, i10, i11);
        } else if (jwVar.getAdapter() == kzVar.f26442g0) {
            kzVar.f26472q1.v(null, tLObject, null, obj, z4, i10, i11);
        }
    }

    @Override
    public final void t() {
        ix ixVar = this.f23494a.M;
        if (ixVar != null && ixVar.f29316b3 != null) {
            while (ixVar.f29316b3.size() > 0) {
                tx txVar = (tx) ixVar.f29316b3.valueAt(0);
                ixVar.f29316b3.removeAt(0);
                if (txVar != null) {
                    if (txVar.d.getBackground() instanceof RippleDrawable) {
                        txVar.d.getBackground().setState(new int[0]);
                    }
                    txVar.d.setPressed(false);
                }
            }
        }
    }

    @Override
    public final void u(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        Object obj;
        qc qcVar;
        kz kzVar = this.f23494a;
        FrameLayout frameLayout = kzVar.f26474r;
        org.telegram.ui.ActionBar.p2 p2Var = kzVar.V1;
        org.telegram.ui.ActionBar.f6 f6Var = kzVar.W1;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.f19165id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        if (currentUser == null) {
            obj = new TLRPC.TL_emojiStatusEmpty();
        } else {
            obj = currentUser.emoji_status;
        }
        MessagesController.getInstance(kzVar.Z0).updateEmojiStatus(emojiStatus);
        em emVar = new em(12, this, obj);
        if (document == null) {
            ac acVar = new ac(kzVar.getContext(), f6Var);
            acVar.f23359b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
            int i10 = R.drawable.msg_settings_premium;
            ImageView imageView = acVar.f23358a;
            imageView.setImageResource(i10);
            imageView.setScaleX(0.8f);
            imageView.setScaleY(0.8f);
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20276z9, f6Var), PorterDuff.Mode.MULTIPLY));
            gc gcVar = new gc(kzVar.getContext(), f6Var, true);
            gcVar.f25112a = emVar;
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
            qcVar = new qc(frameLayout, f6Var);
        }
        qcVar.q(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), emVar).j();
    }

    @Override
    public final void w(TLObject tLObject, Object obj) {
        kz kzVar = this.f23494a;
        jw jwVar = kzVar.f26435e0;
        if (jwVar.getAdapter() != kzVar.f26454k0 && jwVar.getAdapter() != kzVar.f26442g0) {
            return;
        }
        kzVar.f26472q1.e(tLObject, obj);
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
    public final void j(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override
    public final void n(String str) {
    }

    @Override
    public final void r() {
    }

    @Override
    public final void y(String str) {
    }

    @Override
    public final void v(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override
    public final void A(CharSequence charSequence, String str, vk vkVar) {
    }
}
