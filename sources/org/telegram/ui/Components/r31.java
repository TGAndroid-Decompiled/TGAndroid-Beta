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
public final class r31 implements View.OnClickListener {
    public final int f30583a;
    public final Object f30584b;
    public final Object f30585c;
    public final Object d;

    public r31(Object obj, Object obj2, Object obj3, int i10) {
        this.f30583a = i10;
        this.f30584b = obj;
        this.f30585c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        View view2;
        String string;
        qh.m mVar;
        String formatPluralString;
        jm jmVar;
        boolean z4;
        switch (this.f30583a) {
            case 0:
                u31 u31Var = (u31) this.f30584b;
                LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) this.d;
                w31 w31Var = u31Var.h;
                Runnable runnable = ((Runnable[]) this.f30585c)[0];
                if (runnable != null) {
                    runnable.run();
                }
                String str = w31Var.v;
                v31 v31Var = w31Var.F;
                if (!TextUtils.equals(str, localeInfo.pluralLangCode)) {
                    View view3 = v31Var.d;
                    if (view3 == w31Var.B || view3 == w31Var.f32635r) {
                        w31Var.f32637w = w31Var.v;
                    }
                    s31 s31Var = u31Var.f31546e;
                    String str2 = localeInfo.pluralLangCode;
                    w31Var.v = str2;
                    s31Var.setText(w31.y(w31.D(str2, null, null)));
                    if (w31Var.h != null) {
                        view2 = w31Var.f32634n;
                    } else {
                        view2 = w31Var.f32639y;
                    }
                    v31Var.D(view2);
                    w31.H(w31Var.v);
                    w31Var.M();
                    return;
                }
                return;
            case 1:
                org.telegram.ui.wk wkVar = (org.telegram.ui.wk) this.f30584b;
                TranslateController translateController = (TranslateController) this.f30585c;
                org.telegram.ui.ActionBar.p1 p1Var = (org.telegram.ui.ActionBar.p1) this.d;
                long j10 = wkVar.f29397b;
                translateController.setHideTranslateDialog(j10, true);
                TLRPC.Chat chat = MessagesController.getInstance(wkVar.f29396a).getChat(Long.valueOf(-j10));
                if (chat != null && ChatObject.isChannelAndNotMegaGroup(chat)) {
                    string = LocaleController.getString(R.string.TranslationBarHiddenForChannel);
                } else if (chat != null) {
                    string = LocaleController.getString(R.string.TranslationBarHiddenForGroup);
                } else {
                    string = LocaleController.getString(R.string.TranslationBarHiddenForChat);
                }
                qc.a0(wkVar.f29398c).J(R.raw.msg_translate, AndroidUtilities.replaceTags(string), LocaleController.getString(R.string.UndoNoCaps), new l41(0, wkVar, translateController)).j();
                p1Var.d(true);
                return;
            case 2:
                qh.r9 r9Var = (qh.r9) this.f30584b;
                FrameLayout frameLayout = (FrameLayout) this.f30585c;
                oh.b bVar = (oh.b) this.d;
                q70 q70Var = r9Var.S0;
                if (q70Var == null || !q70Var.D()) {
                    qh.m mVar2 = new qh.m(r9Var, 0);
                    boolean isPremium = UserConfig.getInstance(r9Var.R).isPremium();
                    if (isPremium) {
                        mVar = null;
                    } else {
                        mVar = new qh.m(r9Var, 1);
                    }
                    q70 F = q70.F(frameLayout, bVar, r9Var.Q0);
                    r9Var.S0 = F;
                    F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString("StoryPeriodHint"));
                    r9Var.S0.k();
                    int i10 = 0;
                    while (true) {
                        int[] iArr = qh.p.N1;
                        if (i10 < 4) {
                            int i11 = iArr[i10];
                            q70 q70Var2 = r9Var.S0;
                            if (i11 == Integer.MAX_VALUE) {
                                formatPluralString = LocaleController.getString("StoryPeriodKeep");
                            } else {
                                formatPluralString = LocaleController.formatPluralString("Hours", i11 / 3600, new Object[0]);
                            }
                            String str3 = formatPluralString;
                            int i12 = org.telegram.ui.ActionBar.k6.E8;
                            q70Var2.b(0, null, str3, i12, i12, new jm(mVar2, i11, 27));
                            if (!isPremium && i11 != 86400 && i11 != Integer.MAX_VALUE) {
                                jmVar = new jm(mVar, i11, 28);
                            } else {
                                jmVar = null;
                            }
                            q70Var2.M(jmVar);
                            if (r9Var.U0 == i10) {
                                r9Var.S0.L();
                            }
                            i10++;
                        } else {
                            q70 q70Var3 = r9Var.S0;
                            q70Var3.f30329s = 0;
                            q70Var3.Z();
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            case 3:
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.f30585c;
                qh.x2 x2Var = (qh.x2) this.d;
                qh.a3 a3Var = ((qh.v2) this.f30584b).f46188c;
                ArrayList arrayList = a3Var.f44899e0;
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
                qh.f9 f9Var = (qh.f9) this.f30584b;
                Context context = (Context) this.f30585c;
                dg.e1 e1Var = (dg.e1) this.d;
                if (f9Var.f44991y1) {
                    dg.e0 e0Var = new dg.e0(context, f9Var.D1);
                    f9Var.Q1 = e0Var;
                    e0Var.m(f9Var.f44989x1.f4524a, 2);
                    e0Var.f4506n = new qh.i4(f9Var, e1Var);
                    e0Var.h = new hg.m0(5, f9Var, e1Var);
                    e0Var.show();
                    return;
                }
                Runnable runnable2 = f9Var.H1;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 5:
                vf.e eVar = (vf.e) this.f30584b;
                q70 F2 = q70.F(((org.telegram.ui.xn) this.f30585c).getLayoutContainer(), (org.telegram.ui.ActionBar.g6) this.d, eVar.f49027n);
                F2.c(R.drawable.msg_cancel, LocaleController.getString(R.string.BizBotRemove), new vf.d(eVar, 1), true);
                F2.E();
                if (eVar.f49031x != null) {
                    F2.c(R.drawable.msg_settings, LocaleController.getString(R.string.BizBotManage), new vf.d(eVar, 2), false);
                }
                F2.a0(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f));
                F2.f30329s = 0;
                F2.Z();
                return;
            case 6:
                vf.f0.S((vf.f0) this.f30584b, (TL_account.TL_connectedBot) this.f30585c, (jm) this.d);
                return;
            case 7:
                vh.a aVar = (vh.a) this.f30584b;
                Utilities.Callback callback = (Utilities.Callback) this.f30585c;
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
                ((m.r3) this.f30584b).c();
                ((wh.v5) this.f30585c).D((wh.l0) this.d);
                return;
        }
    }
}
