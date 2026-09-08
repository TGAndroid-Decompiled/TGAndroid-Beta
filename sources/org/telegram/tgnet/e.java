package org.telegram.tgnet;

import android.text.Layout;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import bi.k9;
import di.d4;
import di.f4;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.bd;
import org.telegram.ui.Components.f0;
import org.telegram.ui.Components.z;
import org.telegram.ui.w81;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;
import org.telegram.ui.web.d1;
import org.telegram.ui.web.i0;
import w7.x5;
import zh.a0;
import zh.w0;
import zh.w3;
public final class e implements Utilities.Callback2 {
    public final int f20068a;
    public final Object f20069b;
    public final Object f20070c;
    public final Object d;

    public e(Object obj, Object obj2, Object obj3, int i10) {
        this.f20068a = i10;
        this.f20069b = obj;
        this.f20070c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        bd bdVar;
        bd bdVar2;
        switch (this.f20068a) {
            case 0:
                ((ConnectionsManager) this.f20069b).lambda$sendRequestTypedAndProcessUpdates$5((Executor) this.f20070c, (Utilities.Callback2) this.d, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                f0.W((f0) this.f20069b, (of.e) this.f20070c, (TL_aicompose.TL_aiComposeTone) this.d);
                return;
            case 2:
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                org.telegram.ui.Components.r.S((org.telegram.ui.Components.r) this.f20069b, (f6) this.f20070c, (TL_aicompose.AiComposeTone) this.d, (TLRPC.TL_error) obj2);
                return;
            case 3:
                TLRPC.Bool bool3 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                z.P((z) this.f20069b, (of.e) this.f20070c, (b2) this.d);
                return;
            case 4:
                d1 d1Var = (d1) this.f20069b;
                k9 k9Var = (k9) this.f20070c;
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) this.d;
                String str = (String) obj;
                ArrayList arrayList = (ArrayList) obj2;
                if (TextUtils.isEmpty(str)) {
                    d1Var.y(k9Var, "prepared_message_sent", null);
                    i0 i0Var = d1Var.f42066c;
                    if (i0Var != null) {
                        i0Var.c();
                    }
                    AndroidUtilities.runOnUIThread(new w81(28, botWebViewContainer$BotWebViewProxy, arrayList), 500L);
                    return;
                }
                d1Var.y(k9Var, "prepared_message_failed", d1.B(str, "error"));
                return;
            case 5:
                yh.v vVar = (yh.v) this.f20069b;
                f4[] f4VarArr = (f4[]) this.f20070c;
                FrameLayout frameLayout = (FrameLayout) this.d;
                View view = (View) obj;
                CharSequence charSequence = (CharSequence) obj2;
                f4 f4Var = f4VarArr[0];
                if (f4Var != null) {
                    f4Var.e(true);
                }
                CharSequence replaceTags = AndroidUtilities.replaceTags(charSequence);
                float x10 = ((View) ((View) view.getParent()).getParent()).getX() + ((View) view.getParent()).getX() + view.getX();
                float y3 = ((View) ((View) view.getParent()).getParent()).getY() + ((View) view.getParent()).getY() + view.getY();
                if (view instanceof ad) {
                    Layout layout = ((ad) view).getLayout();
                    CharSequence text = layout.getText();
                    if (text instanceof Spanned) {
                        Spanned spanned = (Spanned) text;
                        bd[] bdVarArr = (bd[]) spanned.getSpans(0, text.length(), bd.class);
                        if (bdVarArr.length > 0 && (bdVar = bdVarArr[0]) != null) {
                            int spanStart = spanned.getSpanStart(bdVar);
                            x10 += layout.getPrimaryHorizontal(spanStart) + (bdVarArr[0].a() / 2);
                            y3 += layout.getLineTop(layout.getLineForOffset(spanStart));
                        }
                    }
                }
                f4 f4Var2 = new f4(vVar.getContext(), 3);
                f4VarArr[0] = f4Var2;
                f4Var2.p(true);
                f4Var2.k(11.0f, 8.0f, 11.0f, 7.0f);
                f4Var2.q(10.0f);
                f4Var2.s(replaceTags);
                f4Var2.f7238l0 = new d4(f4Var2, 1);
                f4Var2.setTranslationY((-AndroidUtilities.dp(100.0f)) + y3);
                f4Var2.h = AndroidUtilities.dp(300.0f);
                f4Var2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                f4Var2.m(0.0f, x10 - AndroidUtilities.dp(4.0f));
                frameLayout.addView(f4Var2, x5.e(-1, 100, 55));
                f4Var2.u();
                return;
            case 6:
                yh.f4 f4Var3 = (yh.f4) this.f20069b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.d;
                String str2 = (String) obj2;
                ((of.e) this.f20070c).b();
                if (((Boolean) obj).booleanValue()) {
                    w0 w0Var = f4Var3.f50310f0;
                    if (w0Var != null) {
                        w0Var.run(tL_starGiftUnique);
                    }
                    f4Var3.dismiss();
                    return;
                }
                return;
            case 7:
                a0.R((a0) this.f20069b, (of.e) this.f20070c, (b2) this.d, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                w3 w3Var = (w3) this.f20069b;
                f4[] f4VarArr2 = (f4[]) this.f20070c;
                FrameLayout frameLayout2 = (FrameLayout) this.d;
                View view2 = (View) obj;
                CharSequence charSequence2 = (CharSequence) obj2;
                f4 f4Var4 = f4VarArr2[0];
                if (f4Var4 != null) {
                    f4Var4.e(true);
                }
                CharSequence replaceTags2 = AndroidUtilities.replaceTags(charSequence2);
                float x11 = ((View) ((View) view2.getParent()).getParent()).getX() + ((View) view2.getParent()).getX() + view2.getX();
                float y10 = ((View) ((View) view2.getParent()).getParent()).getY() + ((View) view2.getParent()).getY() + view2.getY();
                if (view2 instanceof ad) {
                    Layout layout2 = ((ad) view2).getLayout();
                    CharSequence text2 = layout2.getText();
                    if (text2 instanceof Spanned) {
                        Spanned spanned2 = (Spanned) text2;
                        bd[] bdVarArr2 = (bd[]) spanned2.getSpans(0, text2.length(), bd.class);
                        if (bdVarArr2.length > 0 && (bdVar2 = bdVarArr2[0]) != null) {
                            int spanStart2 = spanned2.getSpanStart(bdVar2);
                            x11 += layout2.getPrimaryHorizontal(spanStart2) + (bdVarArr2[0].a() / 2);
                            y10 += layout2.getLineTop(layout2.getLineForOffset(spanStart2));
                        }
                    }
                }
                f4 f4Var5 = new f4(w3Var.getContext(), 3);
                f4VarArr2[0] = f4Var5;
                f4Var5.p(true);
                f4Var5.k(11.0f, 8.0f, 11.0f, 7.0f);
                f4Var5.q(10.0f);
                f4Var5.s(replaceTags2);
                f4Var5.f7238l0 = new d4(f4Var5, 3);
                f4Var5.setTranslationY((-AndroidUtilities.dp(100.0f)) + y10);
                f4Var5.h = AndroidUtilities.dp(300.0f);
                f4Var5.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                f4Var5.m(0.0f, x11 - AndroidUtilities.dp(4.0f));
                frameLayout2.addView(f4Var5, x5.e(-1, 100, 55));
                f4Var5.u();
                return;
        }
    }
}
