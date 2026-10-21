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
public final class o41 implements View.OnClickListener {
    public final int f28944a;
    public final KeyEvent.Callback f28945b;
    public final Object f28946c;
    public final Object d;

    public o41(KeyEvent.Callback callback, Object obj, Object obj2, int i10) {
        this.f28944a = i10;
        this.f28945b = callback;
        this.f28946c = obj;
        this.d = obj2;
    }

    @Override
    public final void onClick(View view) {
        View view2;
        String string;
        int i10 = this.f28944a;
        Object obj = this.d;
        Object obj2 = this.f28946c;
        KeyEvent.Callback callback = this.f28945b;
        switch (i10) {
            case 0:
                r41 r41Var = (r41) callback;
                LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) obj;
                t41 t41Var = r41Var.f29824n;
                Runnable runnable = ((Runnable[]) obj2)[0];
                if (runnable != null) {
                    runnable.run();
                }
                String str = t41Var.v;
                s41 s41Var = t41Var.I;
                if (!TextUtils.equals(str, localeInfo.pluralLangCode)) {
                    View view3 = s41Var.d;
                    if (view3 == t41Var.E || view3 == t41Var.f30433r) {
                        t41Var.f30435w = t41Var.v;
                    }
                    p41 p41Var = r41Var.e;
                    String str2 = localeInfo.pluralLangCode;
                    t41Var.v = str2;
                    p41Var.setText(t41.A(t41.E(str2, null, null)));
                    if (t41Var.h != null) {
                        view2 = t41Var.f30432n;
                    } else {
                        view2 = t41Var.f30437y;
                    }
                    s41Var.D(view2);
                    t41.J(t41Var.v);
                    t41Var.N();
                    return;
                }
                return;
            case 1:
                org.telegram.ui.rk rkVar = (org.telegram.ui.rk) callback;
                TranslateController translateController = (TranslateController) obj2;
                org.telegram.ui.ActionBar.m1 m1Var = (org.telegram.ui.ActionBar.m1) obj;
                long j10 = rkVar.f27756b;
                translateController.setHideTranslateDialog(j10, true);
                TLRPC.Chat chat = MessagesController.getInstance(rkVar.f27755a).getChat(Long.valueOf(-j10));
                if (chat != null && ChatObject.isChannelAndNotMegaGroup(chat)) {
                    string = LocaleController.getString(R.string.TranslationBarHiddenForChannel);
                } else if (chat != null) {
                    string = LocaleController.getString(R.string.TranslationBarHiddenForGroup);
                } else {
                    string = LocaleController.getString(R.string.TranslationBarHiddenForChat);
                }
                xc.a0(rkVar.f27757c).J(R.raw.msg_translate, AndroidUtilities.replaceTags(string), LocaleController.getString(R.string.UndoNoCaps), new ho0(18, rkVar, translateController)).j();
                m1Var.d(true);
                return;
            case 2:
                org.telegram.ui.gt0 gt0Var = (org.telegram.ui.gt0) callback;
                Context context = (Context) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (gt0Var.L1) {
                    qg.y yVar = new qg.y(context, gt0Var.Q1);
                    yVar.n(gt0Var.K1.f44657a, 2);
                    yVar.f44709n = new rg.u(gt0Var, bitmap);
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
                ks0 ks0Var = l2Var.f50365a;
                yh.d2 d2Var = new yh.d2(l2Var, (TL_stars.SavedStarGift) obj, 0);
                HashMap hashMap = yh.p2.T;
                ks0Var.h(null, d2Var);
                return;
        }
    }
}
