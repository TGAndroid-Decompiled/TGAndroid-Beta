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
public final class ix implements org.telegram.ui.pt {
    public final nz f27510a;

    public ix(nz nzVar) {
        this.f27510a = nzVar;
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
        org.telegram.ui.ActionBar.n2 n2Var = this.f27510a.Y1;
        if (n2Var instanceof org.telegram.ui.yn) {
            ((org.telegram.ui.yn) n2Var).ab(document);
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
        ConnectionsManager.getInstance(this.f27510a.f29092c1).sendRequest(tL_stickers_removeStickerFromSet, new y1(this, 4));
    }

    @Override
    public final String G(boolean z10) {
        nz nzVar = this.f27510a;
        if (z10) {
            s4.h0 adapter = nzVar.f29108h0.getAdapter();
            sy syVar = nzVar.f29114j0;
            if (adapter == syVar) {
                return syVar.f30896w;
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
            nz nzVar = this.f27510a;
            org.telegram.ui.ActionBar.n2 n2Var = nzVar.Y1;
            if (n2Var != null) {
                ycVar = yc.a0(n2Var);
            } else {
                ycVar = new yc(nzVar.f29137r, nzVar.Z1);
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
        this.f27510a.U();
    }

    @Override
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        if (inputStickerSet == null) {
            return;
        }
        this.f27510a.f29146t1.d(null, inputStickerSet, false);
    }

    @Override
    public final boolean N(TLRPC.Document document) {
        if (document != null) {
            ArrayList<String> arrayList = Emoji.recentEmoji;
            if (arrayList.contains("animated_" + document.f20044id)) {
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
        if (document != null && (emojiStatusDocumentId == null || emojiStatusDocumentId.longValue() != document.f20044id)) {
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
        return this.f27510a.f29146t1.a();
    }

    @Override
    public final boolean b() {
        return this.f27510a.f29146t1.b();
    }

    @Override
    public final boolean c() {
        return this.f27510a.f29146t1.c();
    }

    @Override
    public final TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override
    public final boolean e(TLRPC.Document document) {
        return this.f27510a.f29146t1.j();
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
        nz nzVar = this.f27510a;
        if (nzVar.Y1 == null && nzVar.f29148u0) {
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
        nz nzVar = this.f27510a;
        org.telegram.ui.ActionBar.n2 n2Var = nzVar.Y1;
        if ((n2Var instanceof org.telegram.ui.yn) && ((org.telegram.ui.yn) n2Var).E6()) {
            if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (((org.telegram.ui.yn) nzVar.Y1).i() != null && UserObject.isUserSelf(((org.telegram.ui.yn) nzVar.Y1).i()))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void n(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
        this.f27510a.f29146t1.m(null, document, str, obj, null, z10, i10);
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
        nz nzVar = this.f27510a;
        qy0.o0(nzVar.Y1, MediaDataController.getInstance(nzVar.f29092c1).getStickerSet(inputStickerSet, true), document);
    }

    @Override
    public final boolean q() {
        return false;
    }

    @Override
    public final void r(TLRPC.Document document) {
        if (document != null) {
            Emoji.removeRecentEmoji("animated_" + document.f20044id);
            wx wxVar = this.f27510a.R;
            if (wxVar != null) {
                wxVar.F(false);
            }
        }
    }

    @Override
    public final void t(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
        nz nzVar = this.f27510a;
        qw qwVar = nzVar.f29108h0;
        if (qwVar.getAdapter() == nzVar.f29125n0) {
            nzVar.f29146t1.v(null, tLObject, null, obj, z10, i10, i11);
        } else if (qwVar.getAdapter() == nzVar.f29114j0) {
            nzVar.f29146t1.v(null, tLObject, null, obj, z10, i10, i11);
        }
    }

    @Override
    public final void u() {
        zx zxVar = this.f27510a.P;
        if (zxVar != null && zxVar.f33673l3 != null) {
            while (zxVar.f33673l3.size() > 0) {
                yx yxVar = (yx) zxVar.f33673l3.valueAt(0);
                zxVar.f33673l3.removeAt(0);
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
        nz nzVar = this.f27510a;
        FrameLayout frameLayout = nzVar.f29137r;
        org.telegram.ui.ActionBar.n2 n2Var = nzVar.Y1;
        org.telegram.ui.ActionBar.d6 d6Var = nzVar.Z1;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.f20044id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        if (currentUser == null) {
            obj = new TLRPC.TL_emojiStatusEmpty();
        } else {
            obj = currentUser.emoji_status;
        }
        MessagesController.getInstance(nzVar.f29092c1).updateEmojiStatus(emojiStatus);
        be beVar = new be(29, this, obj);
        if (document == null) {
            jc jcVar = new jc(nzVar.getContext(), d6Var);
            jcVar.f27721b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
            int i10 = R.drawable.msg_settings_premium;
            ImageView imageView = jcVar.f27720a;
            imageView.setImageResource(i10);
            imageView.setScaleX(0.8f);
            imageView.setScaleY(0.8f);
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21227z9, d6Var), PorterDuff.Mode.MULTIPLY));
            pc pcVar = new pc(nzVar.getContext(), d6Var, true);
            pcVar.f29595a = beVar;
            jcVar.setButton(pcVar);
            if (n2Var != null) {
                rc.g(n2Var, jcVar, 1500).j();
                return;
            } else {
                rc.f(frameLayout, jcVar, 1500).j();
                return;
            }
        }
        if (n2Var != null) {
            ycVar = yc.a0(n2Var);
        } else {
            ycVar = new yc(frameLayout, d6Var);
        }
        ycVar.q(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), beVar).j();
    }

    @Override
    public final void x(TLObject tLObject, Object obj) {
        nz nzVar = this.f27510a;
        qw qwVar = nzVar.f29108h0;
        if (qwVar.getAdapter() != nzVar.f29125n0 && qwVar.getAdapter() != nzVar.f29114j0) {
            return;
        }
        nzVar.f29146t1.e(tLObject, obj);
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
