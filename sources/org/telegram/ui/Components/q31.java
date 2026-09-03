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
    public final int f30278a;
    public final Object f30279b;
    public final Object f30280c;
    public final Object d;

    public q31(Object obj, Object obj2, Object obj3, int i10) {
        this.f30278a = i10;
        this.f30279b = obj;
        this.f30280c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        View view2;
        String string;
        qh.m mVar;
        String formatPluralString;
        im imVar;
        boolean z4;
        switch (this.f30278a) {
            case 0:
                t31 t31Var = (t31) this.f30279b;
                LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) this.d;
                v31 v31Var = t31Var.h;
                Runnable runnable = ((Runnable[]) this.f30280c)[0];
                if (runnable != null) {
                    runnable.run();
                }
                String str = v31Var.v;
                u31 u31Var = v31Var.F;
                if (!TextUtils.equals(str, localeInfo.pluralLangCode)) {
                    View view3 = u31Var.d;
                    if (view3 == v31Var.B || view3 == v31Var.f31783r) {
                        v31Var.f31785w = v31Var.v;
                    }
                    r31 r31Var = t31Var.f31266e;
                    String str2 = localeInfo.pluralLangCode;
                    v31Var.v = str2;
                    r31Var.setText(v31.y(v31.D(str2, null, null)));
                    if (v31Var.h != null) {
                        view2 = v31Var.f31782n;
                    } else {
                        view2 = v31Var.f31787y;
                    }
                    u31Var.D(view2);
                    v31.H(v31Var.v);
                    v31Var.M();
                    return;
                }
                return;
            case 1:
                org.telegram.ui.wk wkVar = (org.telegram.ui.wk) this.f30279b;
                TranslateController translateController = (TranslateController) this.f30280c;
                org.telegram.ui.ActionBar.p1 p1Var = (org.telegram.ui.ActionBar.p1) this.d;
                long j10 = wkVar.f28617b;
                translateController.setHideTranslateDialog(j10, true);
                TLRPC.Chat chat = MessagesController.getInstance(wkVar.f28616a).getChat(Long.valueOf(-j10));
                if (chat != null && ChatObject.isChannelAndNotMegaGroup(chat)) {
                    string = LocaleController.getString(R.string.TranslationBarHiddenForChannel);
                } else if (chat != null) {
                    string = LocaleController.getString(R.string.TranslationBarHiddenForGroup);
                } else {
                    string = LocaleController.getString(R.string.TranslationBarHiddenForChat);
                }
                qc.a0(wkVar.f28618c).J(R.raw.msg_translate, AndroidUtilities.replaceTags(string), LocaleController.getString(R.string.UndoNoCaps), new b90(29, wkVar, translateController)).j();
                p1Var.d(true);
                return;
            case 2:
                qh.q9 q9Var = (qh.q9) this.f30279b;
                FrameLayout frameLayout = (FrameLayout) this.f30280c;
                oh.b bVar = (oh.b) this.d;
                q70 q70Var = q9Var.S0;
                if (q70Var == null || !q70Var.D()) {
                    qh.m mVar2 = new qh.m(q9Var, 0);
                    boolean isPremium = UserConfig.getInstance(q9Var.R).isPremium();
                    if (isPremium) {
                        mVar = null;
                    } else {
                        mVar = new qh.m(q9Var, 1);
                    }
                    q70 F = q70.F(frameLayout, bVar, q9Var.Q0);
                    q9Var.S0 = F;
                    F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString("StoryPeriodHint"));
                    q9Var.S0.k();
                    int i10 = 0;
                    while (true) {
                        int[] iArr = qh.p.N1;
                        if (i10 < 4) {
                            int i11 = iArr[i10];
                            q70 q70Var2 = q9Var.S0;
                            if (i11 == Integer.MAX_VALUE) {
                                formatPluralString = LocaleController.getString("StoryPeriodKeep");
                            } else {
                                formatPluralString = LocaleController.formatPluralString("Hours", i11 / 3600, new Object[0]);
                            }
                            String str3 = formatPluralString;
                            int i12 = org.telegram.ui.ActionBar.k6.E8;
                            q70Var2.b(0, null, str3, i12, i12, new im(mVar2, i11, 27));
                            if (!isPremium && i11 != 86400 && i11 != Integer.MAX_VALUE) {
                                imVar = new im(mVar, i11, 28);
                            } else {
                                imVar = null;
                            }
                            q70Var2.M(imVar);
                            if (q9Var.U0 == i10) {
                                q9Var.S0.L();
                            }
                            i10++;
                        } else {
                            q70 q70Var3 = q9Var.S0;
                            q70Var3.f30333s = 0;
                            q70Var3.Z();
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            case 3:
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.f30280c;
                qh.w2 w2Var = (qh.w2) this.d;
                qh.z2 z2Var = ((qh.u2) this.f30279b).f46164c;
                ArrayList arrayList = z2Var.f46394e0;
                if (arrayList.contains(photoEntry)) {
                    arrayList.remove(photoEntry);
                } else if (arrayList.size() + 1 > z2Var.O) {
                    int i13 = -z2Var.K;
                    z2Var.K = i13;
                    AndroidUtilities.shakeViewSpring(w2Var, i13);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    return;
                } else {
                    arrayList.add(photoEntry);
                }
                AndroidUtilities.updateVisibleRows(z2Var.d);
                z2Var.j();
                return;
            case 4:
                qh.e9 e9Var = (qh.e9) this.f30279b;
                Context context = (Context) this.f30280c;
                dg.e1 e1Var = (dg.e1) this.d;
                if (e9Var.f44968y1) {
                    dg.e0 e0Var = new dg.e0(context, e9Var.D1);
                    e9Var.Q1 = e0Var;
                    e0Var.m(e9Var.f44966x1.f4524a, 2);
                    e0Var.f4506n = new qh.h4(e9Var, e1Var);
                    e0Var.h = new hg.m0(5, e9Var, e1Var);
                    e0Var.show();
                    return;
                }
                Runnable runnable2 = e9Var.H1;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 5:
                vf.e eVar = (vf.e) this.f30279b;
                q70 F2 = q70.F(((org.telegram.ui.xn) this.f30280c).getLayoutContainer(), (org.telegram.ui.ActionBar.g6) this.d, eVar.f49063n);
                F2.c(R.drawable.msg_cancel, LocaleController.getString(R.string.BizBotRemove), new vf.d(eVar, 1), true);
                F2.E();
                if (eVar.f49067x != null) {
                    F2.c(R.drawable.msg_settings, LocaleController.getString(R.string.BizBotManage), new vf.d(eVar, 2), false);
                }
                F2.a0(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f));
                F2.f30333s = 0;
                F2.Z();
                return;
            case 6:
                vf.e0.S((vf.e0) this.f30279b, (TL_account.TL_connectedBot) this.f30280c, (im) this.d);
                return;
            case 7:
                vh.a aVar = (vh.a) this.f30279b;
                Utilities.Callback callback = (Utilities.Callback) this.f30280c;
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
                ((m.r3) this.f30279b).c();
                ((wh.v5) this.f30280c).D((wh.l0) this.d);
                return;
        }
    }
}
