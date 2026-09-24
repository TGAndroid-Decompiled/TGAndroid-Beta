package org.telegram.tgnet;

import ai.da;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import ci.c4;
import ci.e4;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.bd;
import org.telegram.ui.Components.e0;
import org.telegram.ui.Components.y;
import org.telegram.ui.n81;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;
import org.telegram.ui.web.b1;
import org.telegram.ui.web.g0;
import w7.y5;
import xh.h4;
import yh.a0;
import yh.w0;
import yh.x3;
public final class e implements Utilities.Callback2 {
    public final int f18492a;
    public final Object f18493b;
    public final Object f18494c;
    public final Object d;

    public e(Object obj, Object obj2, Object obj3, int i10) {
        this.f18492a = i10;
        this.f18493b = obj;
        this.f18494c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        bd bdVar;
        bd bdVar2;
        switch (this.f18492a) {
            case 0:
                ((ConnectionsManager) this.f18493b).lambda$sendRequestTypedAndProcessUpdates$5((Executor) this.f18494c, (Utilities.Callback2) this.d, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                e0.W((e0) this.f18493b, (nf.e) this.f18494c, (TL_aicompose.TL_aiComposeTone) this.d);
                return;
            case 2:
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                org.telegram.ui.Components.q.S((org.telegram.ui.Components.q) this.f18493b, (d6) this.f18494c, (TL_aicompose.AiComposeTone) this.d, (TLRPC.TL_error) obj2);
                return;
            case 3:
                TLRPC.Bool bool3 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                y.P((y) this.f18493b, (nf.e) this.f18494c, (a2) this.d);
                return;
            case 4:
                b1 b1Var = (b1) this.f18493b;
                da daVar = (da) this.f18494c;
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) this.d;
                String str = (String) obj;
                ArrayList arrayList = (ArrayList) obj2;
                if (TextUtils.isEmpty(str)) {
                    b1Var.y(daVar, "prepared_message_sent", null);
                    g0 g0Var = b1Var.f38986c;
                    if (g0Var != null) {
                        g0Var.c();
                    }
                    AndroidUtilities.runOnUIThread(new n81(28, botWebViewContainer$BotWebViewProxy, arrayList), 500L);
                    return;
                }
                b1Var.y(daVar, "prepared_message_failed", b1.B(str, "error"));
                return;
            case 5:
                xh.v vVar = (xh.v) this.f18493b;
                e4[] e4VarArr = (e4[]) this.f18494c;
                FrameLayout frameLayout = (FrameLayout) this.d;
                View view = (View) obj;
                CharSequence charSequence = (CharSequence) obj2;
                e4 e4Var = e4VarArr[0];
                if (e4Var != null) {
                    e4Var.e(true);
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
                e4 e4Var2 = new e4(vVar.getContext(), 3);
                e4VarArr[0] = e4Var2;
                e4Var2.p(true);
                e4Var2.k(11.0f, 8.0f, 11.0f, 7.0f);
                e4Var2.q(10.0f);
                e4Var2.s(replaceTags);
                e4Var2.f4615l0 = new c4(e4Var2, 1);
                e4Var2.setTranslationY((-AndroidUtilities.dp(100.0f)) + y3);
                e4Var2.h = AndroidUtilities.dp(300.0f);
                e4Var2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                e4Var2.m(0.0f, x10 - AndroidUtilities.dp(4.0f));
                frameLayout.addView(e4Var2, y5.e(-1, 100, 55));
                e4Var2.u();
                return;
            case 6:
                h4 h4Var = (h4) this.f18493b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.d;
                String str2 = (String) obj2;
                ((nf.e) this.f18494c).b();
                if (((Boolean) obj).booleanValue()) {
                    w0 w0Var = h4Var.f46159f0;
                    if (w0Var != null) {
                        w0Var.run(tL_starGiftUnique);
                    }
                    h4Var.dismiss();
                    return;
                }
                return;
            case 7:
                a0.R((a0) this.f18493b, (nf.e) this.f18494c, (a2) this.d, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                x3 x3Var = (x3) this.f18493b;
                e4[] e4VarArr2 = (e4[]) this.f18494c;
                FrameLayout frameLayout2 = (FrameLayout) this.d;
                View view2 = (View) obj;
                CharSequence charSequence2 = (CharSequence) obj2;
                e4 e4Var3 = e4VarArr2[0];
                if (e4Var3 != null) {
                    e4Var3.e(true);
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
                e4 e4Var4 = new e4(x3Var.getContext(), 3);
                e4VarArr2[0] = e4Var4;
                e4Var4.p(true);
                e4Var4.k(11.0f, 8.0f, 11.0f, 7.0f);
                e4Var4.q(10.0f);
                e4Var4.s(replaceTags2);
                e4Var4.f4615l0 = new c4(e4Var4, 3);
                e4Var4.setTranslationY((-AndroidUtilities.dp(100.0f)) + y10);
                e4Var4.h = AndroidUtilities.dp(300.0f);
                e4Var4.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                e4Var4.m(0.0f, x11 - AndroidUtilities.dp(4.0f));
                frameLayout2.addView(e4Var4, y5.e(-1, 100, 55));
                e4Var4.u();
                return;
        }
    }
}
