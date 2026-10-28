package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.PorterDuff;
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
public final class lx implements org.telegram.ui.ft {
    public final sz f30311a;

    public lx(sz szVar) {
        this.f30311a = szVar;
    }

    @Override
    public final boolean A() {
        return false;
    }

    @Override
    public final void B(TLRPC.Document document) {
        org.telegram.ui.ActionBar.r2 r2Var = this.f30311a.Y1;
        if (r2Var instanceof org.telegram.ui.wn) {
            ((org.telegram.ui.wn) r2Var).pb(document);
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
        ConnectionsManager.getInstance(this.f30311a.f32713c1).sendRequest(tL_stickers_removeStickerFromSet, new b2(this, 4));
    }

    @Override
    public final String F(boolean z10) {
        sz szVar = this.f30311a;
        if (z10) {
            s4.h0 adapter = szVar.f32728h0.getAdapter();
            xy xyVar = szVar.f32734j0;
            if (adapter == xyVar) {
                return xyVar.f34880w;
            }
            return null;
        }
        s4.h0 adapter2 = szVar.P.getAdapter();
        sy syVar = szVar.S;
        if (adapter2 == syVar) {
            return syVar.v;
        }
        return null;
    }

    @Override
    public final void G(TLRPC.Document document) {
        wc wcVar;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new c6(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (AndroidUtilities.addToClipboard(valueOf)) {
            sz szVar = this.f30311a;
            org.telegram.ui.ActionBar.r2 r2Var = szVar.Y1;
            if (r2Var != null) {
                wcVar = wc.b0(r2Var);
            } else {
                wcVar = new wc(szVar.f32757r, szVar.Z1);
            }
            org.telegram.messenger.wh.m(R.string.EmojiCopied, wcVar);
        }
    }

    @Override
    public final boolean H() {
        return false;
    }

    @Override
    public final boolean I() {
        return false;
    }

    @Override
    public final void K() {
        this.f30311a.X();
    }

    @Override
    public final void L(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        if (inputStickerSet == null) {
            return;
        }
        this.f30311a.f32766t1.d(null, inputStickerSet, false);
    }

    @Override
    public final boolean M(TLRPC.Document document) {
        if (document != null) {
            ArrayList<String> arrayList = Emoji.recentEmoji;
            if (arrayList.contains("animated_" + document.f22034id)) {
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
        if (document != null && (emojiStatusDocumentId == null || emojiStatusDocumentId.longValue() != document.f22034id)) {
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
        return this.f30311a.f32766t1.a();
    }

    @Override
    public final boolean b() {
        return this.f30311a.f32766t1.b();
    }

    @Override
    public final boolean c() {
        return this.f30311a.f32766t1.c();
    }

    @Override
    public final TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override
    public final boolean e(TLRPC.Document document) {
        return this.f30311a.f32766t1.j();
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
        sz szVar = this.f30311a;
        if (szVar.Y1 == null && szVar.f32768u0) {
            return false;
        }
        return true;
    }

    @Override
    public final l80 i(bh.p pVar) {
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
        sz szVar = this.f30311a;
        org.telegram.ui.ActionBar.r2 r2Var = szVar.Y1;
        if ((r2Var instanceof org.telegram.ui.wn) && ((org.telegram.ui.wn) r2Var).L6()) {
            if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (((org.telegram.ui.wn) szVar.Y1).i() != null && UserObject.isUserSelf(((org.telegram.ui.wn) szVar.Y1).i()))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void m(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
        this.f30311a.f32766t1.m(null, document, str, obj, null, z10, i10);
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
        sz szVar = this.f30311a;
        dz0.q0(szVar.Y1, MediaDataController.getInstance(szVar.f32713c1).getStickerSet(inputStickerSet, true), document);
    }

    @Override
    public final boolean p() {
        return false;
    }

    @Override
    public final void q(TLRPC.Document document) {
        if (document != null) {
            Emoji.removeRecentEmoji("animated_" + document.f22034id);
            zx zxVar = this.f30311a.R;
            if (zxVar != null) {
                zxVar.F(false);
            }
        }
    }

    @Override
    public final void s(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
        sz szVar = this.f30311a;
        uw uwVar = szVar.f32728h0;
        if (uwVar.getAdapter() == szVar.f32745n0) {
            szVar.f32766t1.v(null, tLObject, null, obj, z10, i10, i11);
        } else if (uwVar.getAdapter() == szVar.f32734j0) {
            szVar.f32766t1.v(null, tLObject, null, obj, z10, i10, i11);
        }
    }

    @Override
    public final void t() {
        dy dyVar = this.f30311a.P;
        if (dyVar != null && dyVar.f27571m3 != null) {
            while (dyVar.f27571m3.size() > 0) {
                cy cyVar = (cy) dyVar.f27571m3.valueAt(0);
                dyVar.f27571m3.removeAt(0);
                if (cyVar != null) {
                    View view = cyVar.d;
                    if (view != null && (view.getBackground() instanceof RippleDrawable)) {
                        cyVar.d.getBackground().setState(new int[0]);
                    }
                    View view2 = cyVar.d;
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
        wc wcVar;
        sz szVar = this.f30311a;
        FrameLayout frameLayout = szVar.f32757r;
        org.telegram.ui.ActionBar.r2 r2Var = szVar.Y1;
        org.telegram.ui.ActionBar.u6 u6Var = szVar.Z1;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.f22034id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        if (currentUser == null) {
            obj = new TLRPC.TL_emojiStatusEmpty();
        } else {
            obj = currentUser.emoji_status;
        }
        MessagesController.getInstance(szVar.f32713c1).updateEmojiStatus(emojiStatus);
        so soVar = new so(12, this, obj);
        if (document == null) {
            ic icVar = new ic(szVar.getContext(), u6Var);
            icVar.f29300b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
            int i10 = R.drawable.msg_settings_premium;
            ImageView imageView = icVar.f29299a;
            imageView.setImageResource(i10);
            imageView.setScaleX(0.8f);
            imageView.setScaleY(0.8f);
            org.telegram.ui.ActionBar.f7.t(imageView, org.telegram.ui.ActionBar.y6.f23771z9, u6Var, PorterDuff.Mode.MULTIPLY);
            oc ocVar = new oc(szVar.getContext(), u6Var, true);
            ocVar.f31259b = soVar;
            icVar.setButton(ocVar);
            if (r2Var != null) {
                qc.g(r2Var, icVar, 1500).j();
                return;
            } else {
                qc.f(frameLayout, icVar, 1500).j();
                return;
            }
        }
        if (r2Var != null) {
            wcVar = wc.b0(r2Var);
        } else {
            wcVar = new wc(frameLayout, u6Var);
        }
        wcVar.r(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), soVar).j();
    }

    @Override
    public final void w(TLObject tLObject, Object obj) {
        sz szVar = this.f30311a;
        uw uwVar = szVar.f32728h0;
        if (uwVar.getAdapter() != szVar.f32745n0 && uwVar.getAdapter() != szVar.f32734j0) {
            return;
        }
        szVar.f32766t1.e(tLObject, obj);
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
    public final void J() {
    }

    @Override
    public final void r() {
    }

    @Override
    public final void N(String str) {
    }

    @Override
    public final void j(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override
    public final void n(String str) {
    }

    @Override
    public final void y(String str) {
    }

    @Override
    public final void v(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override
    public final void O(CharSequence charSequence, String str, oy oyVar) {
    }
}
