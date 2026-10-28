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
public final class b51 implements View.OnClickListener {
    public final int f26735a;
    public final KeyEvent.Callback f26736b;
    public final Object f26737c;
    public final Object d;

    public b51(KeyEvent.Callback callback, Object obj, Object obj2, int i10) {
        this.f26735a = i10;
        this.f26736b = callback;
        this.f26737c = obj;
        this.d = obj2;
    }

    @Override
    public final void onClick(View view) {
        View view2;
        String string;
        int i10 = this.f26735a;
        Object obj = this.d;
        Object obj2 = this.f26737c;
        KeyEvent.Callback callback = this.f26736b;
        switch (i10) {
            case 0:
                e51 e51Var = (e51) callback;
                LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) obj;
                g51 g51Var = e51Var.f27720n;
                Runnable runnable = ((Runnable[]) obj2)[0];
                if (runnable != null) {
                    runnable.run();
                }
                String str = g51Var.v;
                f51 f51Var = g51Var.N;
                if (!TextUtils.equals(str, localeInfo.pluralLangCode)) {
                    View view3 = f51Var.d;
                    if (view3 == g51Var.E || view3 == g51Var.f28402r) {
                        g51Var.f28404w = g51Var.v;
                    }
                    c51 c51Var = e51Var.e;
                    String str2 = localeInfo.pluralLangCode;
                    g51Var.v = str2;
                    c51Var.setText(g51.J(g51.N(str2, null, null)));
                    if (g51Var.h != null) {
                        view2 = g51Var.f28401n;
                    } else {
                        view2 = g51Var.f28406y;
                    }
                    f51Var.D(view2);
                    g51.R(g51Var.v);
                    g51Var.V();
                    return;
                }
                return;
            case 1:
                org.telegram.ui.vk vkVar = (org.telegram.ui.vk) callback;
                TranslateController translateController = (TranslateController) obj2;
                org.telegram.ui.ActionBar.o1 o1Var = (org.telegram.ui.ActionBar.o1) obj;
                long j10 = vkVar.f34967b;
                translateController.setHideTranslateDialog(j10, true);
                TLRPC.Chat chat = MessagesController.getInstance(vkVar.f34966a).getChat(Long.valueOf(-j10));
                if (chat != null && ChatObject.isChannelAndNotMegaGroup(chat)) {
                    string = LocaleController.getString(R.string.TranslationBarHiddenForChannel);
                } else if (chat != null) {
                    string = LocaleController.getString(R.string.TranslationBarHiddenForGroup);
                } else {
                    string = LocaleController.getString(R.string.TranslationBarHiddenForChat);
                }
                wc.b0(vkVar.f34968c).J(R.raw.msg_translate, AndroidUtilities.replaceTags(string), LocaleController.getString(R.string.UndoNoCaps), new u90(29, vkVar, translateController)).j();
                o1Var.d(true);
                return;
            case 2:
                org.telegram.ui.pt0 pt0Var = (org.telegram.ui.pt0) callback;
                Context context = (Context) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (pt0Var.A1) {
                    rg.y yVar = new rg.y(context, pt0Var.F1);
                    yVar.m(pt0Var.f48395z1.f47560a, 2);
                    yVar.f47632n = new sg.v(pt0Var, bitmap);
                    yVar.h = new sg.m(pt0Var, 1);
                    yVar.show();
                    return;
                }
                Runnable runnable2 = pt0Var.J1;
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
                ((l80) obj2).u();
                ws0 ws0Var = m2Var.f53201a;
                zh.e2 e2Var = new zh.e2(m2Var, (TL_stars.SavedStarGift) obj, 0);
                HashMap hashMap = zh.r2.V;
                ws0Var.h(null, e2Var);
                return;
        }
    }
}
