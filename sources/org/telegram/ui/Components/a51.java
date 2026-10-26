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
public final class a51 implements View.OnClickListener {
    public final int f26414a;
    public final KeyEvent.Callback f26415b;
    public final Object f26416c;
    public final Object d;

    public a51(KeyEvent.Callback callback, Object obj, Object obj2, int i10) {
        this.f26414a = i10;
        this.f26415b = callback;
        this.f26416c = obj;
        this.d = obj2;
    }

    @Override
    public final void onClick(View view) {
        View view2;
        String string;
        int i10 = this.f26414a;
        Object obj = this.d;
        Object obj2 = this.f26416c;
        KeyEvent.Callback callback = this.f26415b;
        switch (i10) {
            case 0:
                d51 d51Var = (d51) callback;
                LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) obj;
                f51 f51Var = d51Var.f27404n;
                Runnable runnable = ((Runnable[]) obj2)[0];
                if (runnable != null) {
                    runnable.run();
                }
                String str = f51Var.v;
                e51 e51Var = f51Var.N;
                if (!TextUtils.equals(str, localeInfo.pluralLangCode)) {
                    View view3 = e51Var.d;
                    if (view3 == f51Var.E || view3 == f51Var.f28064r) {
                        f51Var.f28066w = f51Var.v;
                    }
                    b51 b51Var = d51Var.e;
                    String str2 = localeInfo.pluralLangCode;
                    f51Var.v = str2;
                    b51Var.setText(f51.J(f51.N(str2, null, null)));
                    if (f51Var.h != null) {
                        view2 = f51Var.f28063n;
                    } else {
                        view2 = f51Var.f28068y;
                    }
                    e51Var.D(view2);
                    f51.R(f51Var.v);
                    f51Var.V();
                    return;
                }
                return;
            case 1:
                org.telegram.ui.tk tkVar = (org.telegram.ui.tk) callback;
                TranslateController translateController = (TranslateController) obj2;
                org.telegram.ui.ActionBar.o1 o1Var = (org.telegram.ui.ActionBar.o1) obj;
                long j10 = tkVar.f34633b;
                translateController.setHideTranslateDialog(j10, true);
                TLRPC.Chat chat = MessagesController.getInstance(tkVar.f34632a).getChat(Long.valueOf(-j10));
                if (chat != null && ChatObject.isChannelAndNotMegaGroup(chat)) {
                    string = LocaleController.getString(R.string.TranslationBarHiddenForChannel);
                } else if (chat != null) {
                    string = LocaleController.getString(R.string.TranslationBarHiddenForGroup);
                } else {
                    string = LocaleController.getString(R.string.TranslationBarHiddenForChat);
                }
                wc.b0(tkVar.f34634c).J(R.raw.msg_translate, AndroidUtilities.replaceTags(string), LocaleController.getString(R.string.UndoNoCaps), new t90(29, tkVar, translateController)).j();
                o1Var.d(true);
                return;
            case 2:
                org.telegram.ui.nt0 nt0Var = (org.telegram.ui.nt0) callback;
                Context context = (Context) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (nt0Var.A1) {
                    rg.y yVar = new rg.y(context, nt0Var.F1);
                    yVar.m(nt0Var.f48369z1.f47525a, 2);
                    yVar.f47597n = new sg.w(nt0Var, bitmap);
                    yVar.h = new sg.m(nt0Var, 1);
                    yVar.show();
                    return;
                }
                Runnable runnable2 = nt0Var.J1;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 3:
                ((zg.i) callback).a(view, (HashSet) obj2, (Runnable) obj);
                return;
            case 4:
                new zh.m((Context) obj2, null, null, (GiftAuctionController.Auction) obj).show();
                ((zh.e) callback).dismiss();
                return;
            case 5:
                zh.m.R((zh.m) callback, (boolean[]) obj2, (org.telegram.ui.ActionBar.u6) obj);
                return;
            case 6:
                zh.v.R((zh.v) callback, (Context) obj2, (org.telegram.ui.ActionBar.u6) obj);
                return;
            case 7:
                zh.v.P((zh.v) callback, (boolean[]) obj2, (org.telegram.ui.ActionBar.u6) obj);
                return;
            default:
                zh.m2 m2Var = (zh.m2) callback;
                ((k80) obj2).u();
                vs0 vs0Var = m2Var.f53143a;
                zh.e2 e2Var = new zh.e2(m2Var, (TL_stars.SavedStarGift) obj, 0);
                HashMap hashMap = zh.r2.V;
                vs0Var.h(null, e2Var);
                return;
        }
    }
}
