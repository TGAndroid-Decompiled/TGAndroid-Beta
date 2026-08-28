package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class gd0 implements View.OnClickListener {
    public final int f28760a;
    public final Object f28761b;
    public final Object f28762c;
    public final Object d;

    public gd0(Object obj, Object obj2, Object obj3, int i9) {
        this.f28760a = i9;
        this.f28761b = obj;
        this.f28762c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        View view2;
        String string;
        boolean z10;
        switch (this.f28760a) {
            case 0:
                hd0.n((hd0) this.f28761b, (TLRPC.ChatFull) this.f28762c, (org.telegram.ui.k60) this.d);
                return;
            case 1:
                re0 re0Var = (re0) this.f28761b;
                Context context = (Context) this.f28762c;
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) this.d;
                if (re0Var.h == null) {
                    kh.u3 u3Var = new kh.u3(context, b6Var, LocaleController.getString(R.string.VideoChooseCover), re0Var.f32150f);
                    re0Var.h = u3Var;
                    u3Var.setOnDismissListener(new ib0(re0Var, 8));
                    re0Var.h.f16141f = re0Var.f32151n;
                }
                re0Var.h.show();
                return;
            case 2:
                x21 x21Var = (x21) this.f28761b;
                LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) this.d;
                z21 z21Var = x21Var.h;
                Runnable runnable = ((Runnable[]) this.f28762c)[0];
                if (runnable != null) {
                    runnable.run();
                }
                String str = z21Var.v;
                y21 y21Var = z21Var.E;
                if (!TextUtils.equals(str, localeInfo.pluralLangCode)) {
                    View view3 = y21Var.d;
                    if (view3 == z21Var.A || view3 == z21Var.f35173r) {
                        z21Var.f35175w = z21Var.v;
                    }
                    v21 v21Var = x21Var.f34499e;
                    String str2 = localeInfo.pluralLangCode;
                    z21Var.v = str2;
                    v21Var.setText(z21.y(z21.D(str2, null, null)));
                    if (z21Var.h != null) {
                        view2 = z21Var.f35172n;
                    } else {
                        view2 = z21Var.f35177y;
                    }
                    y21Var.D(view2);
                    z21.H(z21Var.v);
                    z21Var.L();
                    return;
                }
                return;
            case 3:
                org.telegram.ui.nk nkVar = (org.telegram.ui.nk) this.f28761b;
                TranslateController translateController = (TranslateController) this.f28762c;
                org.telegram.ui.ActionBar.o1 o1Var = (org.telegram.ui.ActionBar.o1) this.d;
                long j10 = nkVar.f31533b;
                translateController.setHideTranslateDialog(j10, true);
                TLRPC.Chat chat = MessagesController.getInstance(nkVar.f31532a).getChat(Long.valueOf(-j10));
                if (chat != null && ChatObject.isChannelAndNotMegaGroup(chat)) {
                    string = LocaleController.getString(R.string.TranslationBarHiddenForChannel);
                } else if (chat != null) {
                    string = LocaleController.getString(R.string.TranslationBarHiddenForGroup);
                } else {
                    string = LocaleController.getString(R.string.TranslationBarHiddenForChat);
                }
                oc.a0(nkVar.f31534c).J(R.raw.msg_translate, AndroidUtilities.replaceTags(string), LocaleController.getString(R.string.UndoNoCaps), new jg0(25, nkVar, translateController)).j();
                o1Var.d(true);
                return;
            case 4:
                pf.f fVar = (pf.f) this.f28761b;
                x60 F = x60.F(((org.telegram.ui.qn) this.f28762c).getLayoutContainer(), (org.telegram.ui.ActionBar.b6) this.d, fVar.f45619n);
                F.c(R.drawable.msg_cancel, LocaleController.getString(R.string.BizBotRemove), new pf.e(fVar, 1), true);
                F.E();
                if (fVar.f45623x != null) {
                    F.c(R.drawable.msg_settings, LocaleController.getString(R.string.BizBotManage), new pf.e(fVar, 2), false);
                }
                F.a0(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f));
                F.f34580s = 0;
                F.Z();
                return;
            case 5:
                pf.g0.R((pf.g0) this.f28761b, (TL_account.TL_connectedBot) this.f28762c, (qd) this.d);
                return;
            case 6:
                ph.a aVar = (ph.a) this.f28761b;
                Utilities.Callback callback = (Utilities.Callback) this.f28762c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                boolean z11 = aVar.U;
                if (chat2 != null && !ChatObject.canAddChatToCommunity(chat2)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                aVar.O(callback, z11, z10);
                return;
            case 7:
                ((m.t3) this.f28761b).c();
                ((qh.s5) this.f28762c).D((qh.k0) this.d);
                return;
            default:
                org.telegram.ui.xs0 xs0Var = (org.telegram.ui.xs0) this.f28761b;
                Context context2 = (Context) this.f28762c;
                Bitmap bitmap = (Bitmap) this.d;
                if (xs0Var.H1) {
                    xf.x xVar = new xf.x(context2, xs0Var.M1);
                    xVar.m(xs0Var.G1.f49333a, 2);
                    xVar.f49412n = new yf.u(xs0Var, bitmap);
                    xVar.h = new yf.m(xs0Var, 1);
                    xVar.show();
                    return;
                }
                Runnable runnable2 = xs0Var.Q1;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
