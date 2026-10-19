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
public final class lx implements org.telegram.ui.ct {
    public final tz f28325a;

    public lx(tz tzVar) {
        this.f28325a = tzVar;
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
        org.telegram.ui.ActionBar.n2 n2Var = this.f28325a.Y1;
        if (n2Var instanceof org.telegram.ui.qn) {
            ((org.telegram.ui.qn) n2Var).fb(document);
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
        ConnectionsManager.getInstance(this.f28325a.f30768c1).sendRequest(tL_stickers_removeStickerFromSet, new y1(this, 4));
    }

    @Override
    public final String G(boolean z10) {
        tz tzVar = this.f28325a;
        if (z10) {
            s4.g0 adapter = tzVar.f30783h0.getAdapter();
            yy yyVar = tzVar.f30789j0;
            if (adapter == yyVar) {
                return yyVar.f32772w;
            }
            return null;
        }
        s4.g0 adapter2 = tzVar.P.getAdapter();
        ty tyVar = tzVar.S;
        if (adapter2 == tyVar) {
            return tyVar.v;
        }
        return null;
    }

    @Override
    public final void H(TLRPC.Document document) {
        xc xcVar;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new a6(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (AndroidUtilities.addToClipboard(valueOf)) {
            tz tzVar = this.f28325a;
            org.telegram.ui.ActionBar.n2 n2Var = tzVar.Y1;
            if (n2Var != null) {
                xcVar = xc.a0(n2Var);
            } else {
                xcVar = new xc(tzVar.f30812r, tzVar.Z1);
            }
            org.telegram.messenger.kk.p(R.string.EmojiCopied, xcVar);
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
        this.f28325a.W();
    }

    @Override
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        if (inputStickerSet == null) {
            return;
        }
        this.f28325a.f30821t1.d(null, inputStickerSet, false);
    }

    @Override
    public final boolean N(TLRPC.Document document) {
        if (document != null) {
            ArrayList<String> arrayList = Emoji.recentEmoji;
            if (arrayList.contains("animated_" + document.f20279id)) {
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
        if (document != null && (emojiStatusDocumentId == null || emojiStatusDocumentId.longValue() != document.f20279id)) {
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
        return this.f28325a.f30821t1.a();
    }

    @Override
    public final boolean b() {
        return this.f28325a.f30821t1.b();
    }

    @Override
    public final boolean c() {
        return this.f28325a.f30821t1.c();
    }

    @Override
    public final TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override
    public final boolean e(TLRPC.Document document) {
        return this.f28325a.f30821t1.j();
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
        tz tzVar = this.f28325a;
        if (tzVar.Y1 == null && tzVar.f30823u0) {
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
        tz tzVar = this.f28325a;
        org.telegram.ui.ActionBar.n2 n2Var = tzVar.Y1;
        if ((n2Var instanceof org.telegram.ui.qn) && ((org.telegram.ui.qn) n2Var).H6()) {
            if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (((org.telegram.ui.qn) tzVar.Y1).i() != null && UserObject.isUserSelf(((org.telegram.ui.qn) tzVar.Y1).i()))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
        this.f28325a.f30821t1.m(null, document, str, obj, null, z10, i10);
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
        tz tzVar = this.f28325a;
        py0.p0(tzVar.Y1, MediaDataController.getInstance(tzVar.f30768c1).getStickerSet(inputStickerSet, true), document);
    }

    @Override
    public final boolean o() {
        return false;
    }

    @Override
    public final void p(TLRPC.Document document) {
        if (document != null) {
            Emoji.removeRecentEmoji("animated_" + document.f20279id);
            ay ayVar = this.f28325a.R;
            if (ayVar != null) {
                ayVar.F(false);
            }
        }
    }

    @Override
    public final void r(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
        tz tzVar = this.f28325a;
        uw uwVar = tzVar.f30783h0;
        if (uwVar.getAdapter() == tzVar.f30800n0) {
            tzVar.f30821t1.v(null, tLObject, null, obj, z10, i10, i11);
        } else if (uwVar.getAdapter() == tzVar.f30789j0) {
            tzVar.f30821t1.v(null, tLObject, null, obj, z10, i10, i11);
        }
    }

    @Override
    public final void s() {
        ey eyVar = this.f28325a.P;
        if (eyVar != null && eyVar.f26044c3 != null) {
            while (eyVar.f26044c3.size() > 0) {
                dy dyVar = (dy) eyVar.f26044c3.valueAt(0);
                eyVar.f26044c3.removeAt(0);
                if (dyVar != null) {
                    View view = dyVar.d;
                    if (view != null && (view.getBackground() instanceof RippleDrawable)) {
                        dyVar.d.getBackground().setState(new int[0]);
                    }
                    View view2 = dyVar.d;
                    if (view2 != null) {
                        view2.setPressed(false);
                    }
                }
            }
        }
    }

    @Override
    public final i80 u(ah.v vVar) {
        return null;
    }

    @Override
    public final void v(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        Object obj;
        xc xcVar;
        tz tzVar = this.f28325a;
        FrameLayout frameLayout = tzVar.f30812r;
        org.telegram.ui.ActionBar.n2 n2Var = tzVar.Y1;
        org.telegram.ui.ActionBar.d6 d6Var = tzVar.Z1;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.f20279id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        if (currentUser == null) {
            obj = new TLRPC.TL_emojiStatusEmpty();
        } else {
            obj = currentUser.emoji_status;
        }
        MessagesController.getInstance(tzVar.f30768c1).updateEmojiStatus(emojiStatus);
        yt ytVar = new yt(2, this, obj);
        if (document == null) {
            ic icVar = new ic(tzVar.getContext(), d6Var);
            icVar.f27194b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
            int i10 = R.drawable.msg_settings_premium;
            ImageView imageView = icVar.f27193a;
            imageView.setImageResource(i10);
            imageView.setScaleX(0.8f);
            imageView.setScaleY(0.8f);
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21395z9, d6Var), PorterDuff.Mode.MULTIPLY));
            oc ocVar = new oc(tzVar.getContext(), d6Var, true);
            ocVar.f28944a = ytVar;
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
        xcVar.r(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), ytVar).j();
    }

    @Override
    public final void x(TLObject tLObject, Object obj) {
        tz tzVar = this.f28325a;
        uw uwVar = tzVar.f30783h0;
        if (uwVar.getAdapter() != tzVar.f30800n0 && uwVar.getAdapter() != tzVar.f30789j0) {
            return;
        }
        tzVar.f30821t1.e(tLObject, obj);
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
    public final void i(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override
    public final void m(String str) {
    }

    @Override
    public final void q() {
    }

    @Override
    public final void z(String str) {
    }

    @Override
    public final void w(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override
    public final void t(CharSequence charSequence, String str, qy qyVar) {
    }
}
