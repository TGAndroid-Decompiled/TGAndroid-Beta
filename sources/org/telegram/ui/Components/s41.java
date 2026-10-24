package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class s41 implements View.OnClickListener {
    public final int f30441a;
    public final KeyEvent.Callback f30442b;
    public final Object f30443c;
    public final Object d;

    public s41(KeyEvent.Callback callback, Object obj, Object obj2, int i10) {
        this.f30441a = i10;
        this.f30442b = callback;
        this.f30443c = obj;
        this.d = obj2;
    }

    @Override
    public final void onClick(View view) {
        View view2;
        String string;
        int i10 = this.f30441a;
        Object obj = this.d;
        Object obj2 = this.f30443c;
        KeyEvent.Callback callback = this.f30442b;
        switch (i10) {
            case 0:
                v41 v41Var = (v41) callback;
                LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) obj;
                x41 x41Var = v41Var.f31321n;
                Runnable runnable = ((Runnable[]) obj2)[0];
                if (runnable != null) {
                    runnable.run();
                }
                String str = x41Var.v;
                w41 w41Var = x41Var.N;
                if (!TextUtils.equals(str, localeInfo.pluralLangCode)) {
                    View view3 = w41Var.d;
                    if (view3 == x41Var.E || view3 == x41Var.f32516r) {
                        x41Var.f32518w = x41Var.v;
                    }
                    t41 t41Var = v41Var.e;
                    String str2 = localeInfo.pluralLangCode;
                    x41Var.v = str2;
                    t41Var.setText(x41.J(x41.N(str2, null, null)));
                    if (x41Var.h != null) {
                        view2 = x41Var.f32515n;
                    } else {
                        view2 = x41Var.f32520y;
                    }
                    w41Var.D(view2);
                    x41.R(x41Var.v);
                    x41Var.V();
                    return;
                }
                return;
            case 1:
                org.telegram.ui.sk skVar = (org.telegram.ui.sk) callback;
                TranslateController translateController = (TranslateController) obj2;
                org.telegram.ui.ActionBar.m1 m1Var = (org.telegram.ui.ActionBar.m1) obj;
                long j10 = skVar.f29145b;
                translateController.setHideTranslateDialog(j10, true);
                TLRPC.Chat chat = MessagesController.getInstance(skVar.f29144a).getChat(Long.valueOf(-j10));
                if (chat != null && ChatObject.isChannelAndNotMegaGroup(chat)) {
                    string = LocaleController.getString(R.string.TranslationBarHiddenForChannel);
                } else if (chat != null) {
                    string = LocaleController.getString(R.string.TranslationBarHiddenForGroup);
                } else {
                    string = LocaleController.getString(R.string.TranslationBarHiddenForChat);
                }
                vc.a0(skVar.f29146c).J(R.raw.msg_translate, AndroidUtilities.replaceTags(string), LocaleController.getString(R.string.UndoNoCaps), new jo0(18, skVar, translateController)).j();
                m1Var.d(true);
                return;
            case 2:
                org.telegram.ui.it0 it0Var = (org.telegram.ui.it0) callback;
                Context context = (Context) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (it0Var.L1) {
                    qg.y yVar = new qg.y(context, it0Var.Q1);
                    yVar.m(it0Var.K1.f45065a, 2);
                    yVar.f45129n = new rg.v(it0Var, bitmap);
                    yVar.h = new rg.m(it0Var, 1);
                    yVar.show();
                    return;
                }
                Runnable runnable2 = it0Var.U1;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 3:
                ((yg.h) callback).a(view, (HashSet) obj2, (Runnable) obj);
                return;
            case 4:
                new yh.m((Context) obj2, null, null, (GiftAuctionController.Auction) obj).show();
                ((yh.e) callback).dismiss();
                return;
            case 5:
                yh.m.R((yh.m) callback, (boolean[]) obj2, (org.telegram.ui.ActionBar.g6) obj);
                return;
            case 6:
                yh.v.R((yh.v) callback, (Context) obj2, (org.telegram.ui.ActionBar.g6) obj);
                return;
            case 7:
                yh.v.P((yh.v) callback, (boolean[]) obj2, (org.telegram.ui.ActionBar.g6) obj);
                return;
            default:
                yh.l2 l2Var = (yh.l2) callback;
                ((h80) obj2).u();
                ms0 ms0Var = l2Var.f50824a;
                yh.d2 d2Var = new yh.d2(l2Var, (TL_stars.SavedStarGift) obj, 0);
                HashMap hashMap = yh.p2.U;
                ms0Var.h(null, d2Var);
                return;
        }
    }
}
