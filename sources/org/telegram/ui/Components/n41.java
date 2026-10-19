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
public final class n41 implements View.OnClickListener {
    public final int f28674a;
    public final KeyEvent.Callback f28675b;
    public final Object f28676c;
    public final Object d;

    public n41(KeyEvent.Callback callback, Object obj, Object obj2, int i10) {
        this.f28674a = i10;
        this.f28675b = callback;
        this.f28676c = obj;
        this.d = obj2;
    }

    @Override
    public final void onClick(View view) {
        View view2;
        String string;
        int i10 = this.f28674a;
        Object obj = this.d;
        Object obj2 = this.f28676c;
        KeyEvent.Callback callback = this.f28675b;
        switch (i10) {
            case 0:
                q41 q41Var = (q41) callback;
                LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) obj;
                s41 s41Var = q41Var.f29518n;
                Runnable runnable = ((Runnable[]) obj2)[0];
                if (runnable != null) {
                    runnable.run();
                }
                String str = s41Var.v;
                r41 r41Var = s41Var.I;
                if (!TextUtils.equals(str, localeInfo.pluralLangCode)) {
                    View view3 = r41Var.d;
                    if (view3 == s41Var.E || view3 == s41Var.f30175r) {
                        s41Var.f30177w = s41Var.v;
                    }
                    o41 o41Var = q41Var.e;
                    String str2 = localeInfo.pluralLangCode;
                    s41Var.v = str2;
                    o41Var.setText(s41.A(s41.E(str2, null, null)));
                    if (s41Var.h != null) {
                        view2 = s41Var.f30174n;
                    } else {
                        view2 = s41Var.f30179y;
                    }
                    r41Var.D(view2);
                    s41.J(s41Var.v);
                    s41Var.N();
                    return;
                }
                return;
            case 1:
                org.telegram.ui.rk rkVar = (org.telegram.ui.rk) callback;
                TranslateController translateController = (TranslateController) obj2;
                org.telegram.ui.ActionBar.m1 m1Var = (org.telegram.ui.ActionBar.m1) obj;
                long j10 = rkVar.f27423b;
                translateController.setHideTranslateDialog(j10, true);
                TLRPC.Chat chat = MessagesController.getInstance(rkVar.f27422a).getChat(Long.valueOf(-j10));
                if (chat != null && ChatObject.isChannelAndNotMegaGroup(chat)) {
                    string = LocaleController.getString(R.string.TranslationBarHiddenForChannel);
                } else if (chat != null) {
                    string = LocaleController.getString(R.string.TranslationBarHiddenForGroup);
                } else {
                    string = LocaleController.getString(R.string.TranslationBarHiddenForChat);
                }
                xc.a0(rkVar.f27424c).J(R.raw.msg_translate, AndroidUtilities.replaceTags(string), LocaleController.getString(R.string.UndoNoCaps), new go0(18, rkVar, translateController)).j();
                m1Var.d(true);
                return;
            case 2:
                org.telegram.ui.gt0 gt0Var = (org.telegram.ui.gt0) callback;
                Context context = (Context) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (gt0Var.L1) {
                    qg.y yVar = new qg.y(context, gt0Var.Q1);
                    yVar.n(gt0Var.K1.f44649a, 2);
                    yVar.f44701n = new rg.u(gt0Var, bitmap);
                    yVar.h = new rg.m(gt0Var, 1);
                    yVar.show();
                    return;
                }
                Runnable runnable2 = gt0Var.U1;
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
                yh.m.S((yh.m) callback, (boolean[]) obj2, (org.telegram.ui.ActionBar.d6) obj);
                return;
            case 6:
                yh.v.S((yh.v) callback, (Context) obj2, (org.telegram.ui.ActionBar.d6) obj);
                return;
            case 7:
                yh.v.Q((yh.v) callback, (boolean[]) obj2, (org.telegram.ui.ActionBar.d6) obj);
                return;
            default:
                yh.l2 l2Var = (yh.l2) callback;
                ((i80) obj2).u();
                js0 js0Var = l2Var.f50360a;
                yh.d2 d2Var = new yh.d2(l2Var, (TL_stars.SavedStarGift) obj, 0);
                HashMap hashMap = yh.p2.T;
                js0Var.h(null, d2Var);
                return;
        }
    }
}
