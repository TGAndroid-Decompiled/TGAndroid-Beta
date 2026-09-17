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
public final class dx implements org.telegram.ui.st {
    public final kz f23397a;

    public dx(kz kzVar) {
        this.f23397a = kzVar;
    }

    @Override
    public final boolean A() {
        return false;
    }

    @Override
    public final void B(TLRPC.Document document) {
        org.telegram.ui.ActionBar.o2 o2Var = this.f23397a.Y1;
        if (o2Var instanceof org.telegram.ui.bo) {
            ((org.telegram.ui.bo) o2Var).bb(document);
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
        ConnectionsManager.getInstance(this.f23397a.f25713c1).sendRequest(tL_stickers_removeStickerFromSet, new x1(this, 4));
    }

    @Override
    public final String F(boolean z10) {
        kz kzVar = this.f23397a;
        if (z10) {
            s4.h0 adapter = kzVar.f25728h0.getAdapter();
            py pyVar = kzVar.f25734j0;
            if (adapter == pyVar) {
                return pyVar.f27156w;
            }
            return null;
        }
        s4.h0 adapter2 = kzVar.P.getAdapter();
        jy jyVar = kzVar.S;
        if (adapter2 == jyVar) {
            return jyVar.v;
        }
        return null;
    }

    @Override
    public final void H(TLRPC.Document document) {
        vc vcVar;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new x5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (AndroidUtilities.addToClipboard(valueOf)) {
            kz kzVar = this.f23397a;
            org.telegram.ui.ActionBar.o2 o2Var = kzVar.Y1;
            if (o2Var != null) {
                vcVar = vc.a0(o2Var);
            } else {
                vcVar = new vc(kzVar.f25757r, kzVar.Z1);
            }
            org.telegram.messenger.wl.o(R.string.EmojiCopied, vcVar);
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
        this.f23397a.X();
    }

    @Override
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        if (inputStickerSet == null) {
            return;
        }
        this.f23397a.f25766t1.d(null, inputStickerSet, false);
    }

    @Override
    public final boolean N(TLRPC.Document document) {
        if (document != null) {
            ArrayList<String> arrayList = Emoji.recentEmoji;
            if (arrayList.contains("animated_" + document.f18127id)) {
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
        if (document != null && (emojiStatusDocumentId == null || emojiStatusDocumentId.longValue() != document.f18127id)) {
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
        return this.f23397a.f25766t1.a();
    }

    @Override
    public final boolean b() {
        return this.f23397a.f25766t1.b();
    }

    @Override
    public final boolean c() {
        return this.f23397a.f25766t1.c();
    }

    @Override
    public final TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override
    public final boolean e(TLRPC.Document document) {
        return this.f23397a.f25766t1.j();
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
        kz kzVar = this.f23397a;
        if (kzVar.Y1 == null && kzVar.f25768u0) {
            return false;
        }
        return true;
    }

    @Override
    public final n70 i(ci.n6 n6Var) {
        return null;
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
        kz kzVar = this.f23397a;
        org.telegram.ui.ActionBar.o2 o2Var = kzVar.Y1;
        if ((o2Var instanceof org.telegram.ui.bo) && ((org.telegram.ui.bo) o2Var).E6()) {
            if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (((org.telegram.ui.bo) kzVar.Y1).i() != null && UserObject.isUserSelf(((org.telegram.ui.bo) kzVar.Y1).i()))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void m(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
        this.f23397a.f25766t1.m(null, document, str, obj, null, z10, i10);
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
        kz kzVar = this.f23397a;
        wx0.o0(kzVar.Y1, MediaDataController.getInstance(kzVar.f25713c1).getStickerSet(inputStickerSet, true), document);
    }

    @Override
    public final boolean p() {
        return false;
    }

    @Override
    public final void q(TLRPC.Document document) {
        if (document != null) {
            Emoji.removeRecentEmoji("animated_" + document.f18127id);
            sx sxVar = this.f23397a.R;
            if (sxVar != null) {
                sxVar.F(false);
            }
        }
    }

    @Override
    public final void s(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
        kz kzVar = this.f23397a;
        mw mwVar = kzVar.f25728h0;
        if (mwVar.getAdapter() == kzVar.f25745n0) {
            kzVar.f25766t1.v(null, tLObject, null, obj, z10, i10, i11);
        } else if (mwVar.getAdapter() == kzVar.f25734j0) {
            kzVar.f25766t1.v(null, tLObject, null, obj, z10, i10, i11);
        }
    }

    @Override
    public final void t() {
        vx vxVar = this.f23397a.P;
        if (vxVar != null && vxVar.f29422e3 != null) {
            while (vxVar.f29422e3.size() > 0) {
                ux uxVar = (ux) vxVar.f29422e3.valueAt(0);
                vxVar.f29422e3.removeAt(0);
                if (uxVar != null) {
                    View view = uxVar.d;
                    if (view != null && (view.getBackground() instanceof RippleDrawable)) {
                        uxVar.d.getBackground().setState(new int[0]);
                    }
                    View view2 = uxVar.d;
                    if (view2 != null) {
                        view2.setPressed(false);
                    }
                }
            }
        }
    }

    @Override
    public final void u(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        Object obj;
        vc vcVar;
        kz kzVar = this.f23397a;
        FrameLayout frameLayout = kzVar.f25757r;
        org.telegram.ui.ActionBar.o2 o2Var = kzVar.Y1;
        org.telegram.ui.ActionBar.f6 f6Var = kzVar.Z1;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.f18127id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        if (currentUser == null) {
            obj = new TLRPC.TL_emojiStatusEmpty();
        } else {
            obj = currentUser.emoji_status;
        }
        MessagesController.getInstance(kzVar.f25713c1).updateEmojiStatus(emojiStatus);
        oh ohVar = new oh(25, this, obj);
        if (document == null) {
            gc gcVar = new gc(kzVar.getContext(), f6Var);
            gcVar.f24166b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
            int i10 = R.drawable.msg_settings_premium;
            ImageView imageView = gcVar.f24165a;
            imageView.setImageResource(i10);
            imageView.setScaleX(0.8f);
            imageView.setScaleY(0.8f);
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19266z9, f6Var), PorterDuff.Mode.MULTIPLY));
            mc mcVar = new mc(kzVar.getContext(), f6Var, true);
            mcVar.f26122a = ohVar;
            gcVar.setButton(mcVar);
            if (o2Var != null) {
                oc.g(o2Var, gcVar, 1500).j();
                return;
            } else {
                oc.f(frameLayout, gcVar, 1500).j();
                return;
            }
        }
        if (o2Var != null) {
            vcVar = vc.a0(o2Var);
        } else {
            vcVar = new vc(frameLayout, f6Var);
        }
        vcVar.q(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), ohVar).j();
    }

    @Override
    public final void w(TLObject tLObject, Object obj) {
        kz kzVar = this.f23397a;
        mw mwVar = kzVar.f25728h0;
        if (mwVar.getAdapter() != kzVar.f25745n0 && mwVar.getAdapter() != kzVar.f25734j0) {
            return;
        }
        kzVar.f25766t1.e(tLObject, obj);
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
    public final void G(CharSequence charSequence, String str, org.telegram.ui.pf pfVar) {
    }
}
