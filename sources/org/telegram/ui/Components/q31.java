package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class q31 implements View.OnClickListener {
    public final int f28049a;
    public final Object f28050b;
    public final Object f28051c;
    public final Object d;

    public q31(Object obj, Object obj2, Object obj3, int i10) {
        this.f28049a = i10;
        this.f28050b = obj;
        this.f28051c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        View view2;
        String string;
        ph.m mVar;
        String formatPluralString;
        hm hmVar;
        boolean z4;
        switch (this.f28049a) {
            case 0:
                t31 t31Var = (t31) this.f28050b;
                LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) this.d;
                v31 v31Var = t31Var.h;
                Runnable runnable = ((Runnable[]) this.f28051c)[0];
                if (runnable != null) {
                    runnable.run();
                }
                String str = v31Var.v;
                u31 u31Var = v31Var.F;
                if (!TextUtils.equals(str, localeInfo.pluralLangCode)) {
                    View view3 = u31Var.d;
                    if (view3 == v31Var.B || view3 == v31Var.f29356r) {
                        v31Var.f29358w = v31Var.v;
                    }
                    r31 r31Var = t31Var.e;
                    String str2 = localeInfo.pluralLangCode;
                    v31Var.v = str2;
                    r31Var.setText(v31.y(v31.D(str2, null, null)));
                    if (v31Var.h != null) {
                        view2 = v31Var.f29355n;
                    } else {
                        view2 = v31Var.f29360y;
                    }
                    u31Var.D(view2);
                    v31.H(v31Var.v);
                    v31Var.M();
                    return;
                }
                return;
            case 1:
                org.telegram.ui.wk wkVar = (org.telegram.ui.wk) this.f28050b;
                TranslateController translateController = (TranslateController) this.f28051c;
                org.telegram.ui.ActionBar.p1 p1Var = (org.telegram.ui.ActionBar.p1) this.d;
                long j10 = wkVar.f26936b;
                translateController.setHideTranslateDialog(j10, true);
                TLRPC.Chat chat = MessagesController.getInstance(wkVar.f26935a).getChat(Long.valueOf(-j10));
                if (chat != null && ChatObject.isChannelAndNotMegaGroup(chat)) {
                    string = LocaleController.getString(R.string.TranslationBarHiddenForChannel);
                } else if (chat != null) {
                    string = LocaleController.getString(R.string.TranslationBarHiddenForGroup);
                } else {
                    string = LocaleController.getString(R.string.TranslationBarHiddenForChat);
                }
                qc.a0(wkVar.f26937c).J(R.raw.msg_translate, AndroidUtilities.replaceTags(string), LocaleController.getString(R.string.UndoNoCaps), new k41(1, wkVar, translateController)).j();
                p1Var.d(true);
                return;
            case 2:
                ph.t9 t9Var = (ph.t9) this.f28050b;
                FrameLayout frameLayout = (FrameLayout) this.f28051c;
                nh.b bVar = (nh.b) this.d;
                o70 o70Var = t9Var.S0;
                if (o70Var == null || !o70Var.D()) {
                    ph.m mVar2 = new ph.m(t9Var, 0);
                    boolean isPremium = UserConfig.getInstance(t9Var.R).isPremium();
                    if (isPremium) {
                        mVar = null;
                    } else {
                        mVar = new ph.m(t9Var, 1);
                    }
                    o70 F = o70.F(frameLayout, bVar, t9Var.Q0);
                    t9Var.S0 = F;
                    F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString("StoryPeriodHint"));
                    t9Var.S0.k();
                    int i10 = 0;
                    while (true) {
                        int[] iArr = ph.p.N1;
                        if (i10 < 4) {
                            int i11 = iArr[i10];
                            o70 o70Var2 = t9Var.S0;
                            if (i11 == Integer.MAX_VALUE) {
                                formatPluralString = LocaleController.getString("StoryPeriodKeep");
                            } else {
                                formatPluralString = LocaleController.formatPluralString("Hours", i11 / 3600, new Object[0]);
                            }
                            String str3 = formatPluralString;
                            int i12 = org.telegram.ui.ActionBar.j6.E8;
                            o70Var2.b(0, null, str3, i12, i12, new hm(mVar2, i11, 26));
                            if (!isPremium && i11 != 86400 && i11 != Integer.MAX_VALUE) {
                                hmVar = new hm(mVar, i11, 27);
                            } else {
                                hmVar = null;
                            }
                            o70Var2.M(hmVar);
                            if (t9Var.U0 == i10) {
                                t9Var.S0.L();
                            }
                            i10++;
                        } else {
                            o70 o70Var3 = t9Var.S0;
                            o70Var3.f27489s = 0;
                            o70Var3.Z();
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            case 3:
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.f28051c;
                ph.x2 x2Var = (ph.x2) this.d;
                ph.a3 a3Var = ((ph.v2) this.f28050b).f42474c;
                ArrayList arrayList = a3Var.f41261e0;
                if (arrayList.contains(photoEntry)) {
                    arrayList.remove(photoEntry);
                } else if (arrayList.size() + 1 > a3Var.O) {
                    int i13 = -a3Var.K;
                    a3Var.K = i13;
                    AndroidUtilities.shakeViewSpring(x2Var, i13);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    return;
                } else {
                    arrayList.add(photoEntry);
                }
                AndroidUtilities.updateVisibleRows(a3Var.d);
                a3Var.j();
                return;
            case 4:
                ph.h9 h9Var = (ph.h9) this.f28050b;
                Context context = (Context) this.f28051c;
                cg.f1 f1Var = (cg.f1) this.d;
                if (h9Var.f41372y1) {
                    cg.e0 e0Var = new cg.e0(context, h9Var.D1);
                    h9Var.Q1 = e0Var;
                    e0Var.m(h9Var.f41370x1.f2401a, 2);
                    e0Var.f2363n = new ph.i4(h9Var, f1Var);
                    e0Var.h = new gg.m0(5, h9Var, f1Var);
                    e0Var.show();
                    return;
                }
                Runnable runnable2 = h9Var.H1;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 5:
                uf.e eVar = (uf.e) this.f28050b;
                o70 F2 = o70.F(((org.telegram.ui.xn) this.f28051c).getLayoutContainer(), (org.telegram.ui.ActionBar.f6) this.d, eVar.f45285n);
                F2.c(R.drawable.msg_cancel, LocaleController.getString(R.string.BizBotRemove), new uf.d(eVar, 1), true);
                F2.E();
                if (eVar.f45289x != null) {
                    F2.c(R.drawable.msg_settings, LocaleController.getString(R.string.BizBotManage), new uf.d(eVar, 2), false);
                }
                F2.a0(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f));
                F2.f27489s = 0;
                F2.Z();
                return;
            case 6:
                uf.e0.S((uf.e0) this.f28050b, (TL_account.TL_connectedBot) this.f28051c, (hm) this.d);
                return;
            case 7:
                uh.a aVar = (uh.a) this.f28050b;
                Utilities.Callback callback = (Utilities.Callback) this.f28051c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                boolean z10 = aVar.V;
                if (chat2 != null && !ChatObject.canAddChatToCommunity(chat2)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                aVar.P(callback, z10, z4);
                return;
            default:
                ((m.s3) this.f28050b).c();
                ((vh.v5) this.f28051c).D((vh.k0) this.d);
                return;
        }
    }
}
