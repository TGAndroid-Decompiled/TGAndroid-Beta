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
public final class m41 implements View.OnClickListener {
    public final int f28391a;
    public final KeyEvent.Callback f28392b;
    public final Object f28393c;
    public final Object d;

    public m41(KeyEvent.Callback callback, Object obj, Object obj2, int i10) {
        this.f28391a = i10;
        this.f28392b = callback;
        this.f28393c = obj;
        this.d = obj2;
    }

    @Override
    public final void onClick(View view) {
        View view2;
        String string;
        int i10 = this.f28391a;
        Object obj = this.d;
        Object obj2 = this.f28393c;
        KeyEvent.Callback callback = this.f28392b;
        switch (i10) {
            case 0:
                p41 p41Var = (p41) callback;
                LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) obj;
                r41 r41Var = p41Var.f29174n;
                Runnable runnable = ((Runnable[]) obj2)[0];
                if (runnable != null) {
                    runnable.run();
                }
                String str = r41Var.v;
                q41 q41Var = r41Var.I;
                if (!TextUtils.equals(str, localeInfo.pluralLangCode)) {
                    View view3 = q41Var.d;
                    if (view3 == r41Var.E || view3 == r41Var.f29823r) {
                        r41Var.f29825w = r41Var.v;
                    }
                    n41 n41Var = p41Var.e;
                    String str2 = localeInfo.pluralLangCode;
                    r41Var.v = str2;
                    n41Var.setText(r41.A(r41.F(str2, null, null)));
                    if (r41Var.h != null) {
                        view2 = r41Var.f29822n;
                    } else {
                        view2 = r41Var.f29827y;
                    }
                    q41Var.D(view2);
                    r41.J(r41Var.v);
                    r41Var.N();
                    return;
                }
                return;
            case 1:
                org.telegram.ui.tk tkVar = (org.telegram.ui.tk) callback;
                TranslateController translateController = (TranslateController) obj2;
                org.telegram.ui.ActionBar.m1 m1Var = (org.telegram.ui.ActionBar.m1) obj;
                long j10 = tkVar.f27077b;
                translateController.setHideTranslateDialog(j10, true);
                TLRPC.Chat chat = MessagesController.getInstance(tkVar.f27076a).getChat(Long.valueOf(-j10));
                if (chat != null && ChatObject.isChannelAndNotMegaGroup(chat)) {
                    string = LocaleController.getString(R.string.TranslationBarHiddenForChannel);
                } else if (chat != null) {
                    string = LocaleController.getString(R.string.TranslationBarHiddenForGroup);
                } else {
                    string = LocaleController.getString(R.string.TranslationBarHiddenForChat);
                }
                xc.a0(tkVar.f27078c).J(R.raw.msg_translate, AndroidUtilities.replaceTags(string), LocaleController.getString(R.string.UndoNoCaps), new go0(18, tkVar, translateController)).j();
                m1Var.d(true);
                return;
            case 2:
                org.telegram.ui.it0 it0Var = (org.telegram.ui.it0) callback;
                Context context = (Context) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (it0Var.L1) {
                    qg.y yVar = new qg.y(context, it0Var.Q1);
                    yVar.n(it0Var.K1.f44667a, 2);
                    yVar.f44731n = new rg.u(it0Var, bitmap);
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
                new yh.n((Context) obj2, null, null, (GiftAuctionController.Auction) obj).show();
                ((yh.e) callback).dismiss();
                return;
            case 5:
                yh.n.S((yh.n) callback, (boolean[]) obj2, (org.telegram.ui.ActionBar.d6) obj);
                return;
            case 6:
                yh.w.S((yh.w) callback, (Context) obj2, (org.telegram.ui.ActionBar.d6) obj);
                return;
            case 7:
                yh.w.Q((yh.w) callback, (boolean[]) obj2, (org.telegram.ui.ActionBar.d6) obj);
                return;
            default:
                yh.m2 m2Var = (yh.m2) callback;
                ((i80) obj2).u();
                is0 is0Var = m2Var.f50394a;
                yh.e2 e2Var = new yh.e2(m2Var, (TL_stars.SavedStarGift) obj, 0);
                HashMap hashMap = yh.q2.T;
                is0Var.h(null, e2Var);
                return;
        }
    }
}
