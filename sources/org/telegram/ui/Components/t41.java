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
public final class t41 implements View.OnClickListener {
    public final int f30636a;
    public final KeyEvent.Callback f30637b;
    public final Object f30638c;
    public final Object d;

    public t41(KeyEvent.Callback callback, Object obj, Object obj2, int i10) {
        this.f30636a = i10;
        this.f30637b = callback;
        this.f30638c = obj;
        this.d = obj2;
    }

    @Override
    public final void onClick(View view) {
        View view2;
        String string;
        int i10 = this.f30636a;
        Object obj = this.d;
        Object obj2 = this.f30638c;
        KeyEvent.Callback callback = this.f30637b;
        switch (i10) {
            case 0:
                w41 w41Var = (w41) callback;
                LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) obj;
                y41 y41Var = w41Var.f32157n;
                Runnable runnable = ((Runnable[]) obj2)[0];
                if (runnable != null) {
                    runnable.run();
                }
                String str = y41Var.v;
                x41 x41Var = y41Var.N;
                if (!TextUtils.equals(str, localeInfo.pluralLangCode)) {
                    View view3 = x41Var.d;
                    if (view3 == y41Var.E || view3 == y41Var.f32811r) {
                        y41Var.f32813w = y41Var.v;
                    }
                    u41 u41Var = w41Var.e;
                    String str2 = localeInfo.pluralLangCode;
                    y41Var.v = str2;
                    u41Var.setText(y41.J(y41.N(str2, null, null)));
                    if (y41Var.h != null) {
                        view2 = y41Var.f32810n;
                    } else {
                        view2 = y41Var.f32815y;
                    }
                    x41Var.D(view2);
                    y41.R(y41Var.v);
                    y41Var.V();
                    return;
                }
                return;
            case 1:
                org.telegram.ui.sk skVar = (org.telegram.ui.sk) callback;
                TranslateController translateController = (TranslateController) obj2;
                org.telegram.ui.ActionBar.m1 m1Var = (org.telegram.ui.ActionBar.m1) obj;
                long j10 = skVar.f29426b;
                translateController.setHideTranslateDialog(j10, true);
                TLRPC.Chat chat = MessagesController.getInstance(skVar.f29425a).getChat(Long.valueOf(-j10));
                if (chat != null && ChatObject.isChannelAndNotMegaGroup(chat)) {
                    string = LocaleController.getString(R.string.TranslationBarHiddenForChannel);
                } else if (chat != null) {
                    string = LocaleController.getString(R.string.TranslationBarHiddenForGroup);
                } else {
                    string = LocaleController.getString(R.string.TranslationBarHiddenForChat);
                }
                xc.a0(skVar.f29427c).J(R.raw.msg_translate, AndroidUtilities.replaceTags(string), LocaleController.getString(R.string.UndoNoCaps), new ko0(18, skVar, translateController)).j();
                m1Var.d(true);
                return;
            case 2:
                org.telegram.ui.jt0 jt0Var = (org.telegram.ui.jt0) callback;
                Context context = (Context) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (jt0Var.L1) {
                    qg.y yVar = new qg.y(context, jt0Var.Q1);
                    yVar.m(jt0Var.K1.f45066a, 2);
                    yVar.f45130n = new rg.v(jt0Var, bitmap);
                    yVar.h = new rg.m(jt0Var, 1);
                    yVar.show();
                    return;
                }
                Runnable runnable2 = jt0Var.U1;
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
                ((j80) obj2).u();
                ns0 ns0Var = l2Var.f50825a;
                yh.d2 d2Var = new yh.d2(l2Var, (TL_stars.SavedStarGift) obj, 0);
                HashMap hashMap = yh.p2.U;
                ns0Var.h(null, d2Var);
                return;
        }
    }
}
