package org.telegram.tgnet;

import ai.ea;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import ci.b4;
import ci.d4;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.cd;
import org.telegram.ui.Components.dd;
import org.telegram.ui.Components.e0;
import org.telegram.ui.Components.y;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;
import org.telegram.ui.web.b1;
import org.telegram.ui.web.g0;
import w7.x5;
import xh.h4;
import xh.x;
import yh.s3;
import yh.v0;
public final class e implements Utilities.Callback2 {
    public final int f20240a;
    public final Object f20241b;
    public final Object f20242c;
    public final Object d;

    public e(Object obj, Object obj2, Object obj3, int i10) {
        this.f20240a = i10;
        this.f20241b = obj;
        this.f20242c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        dd ddVar;
        dd ddVar2;
        switch (this.f20240a) {
            case 0:
                ((ConnectionsManager) this.f20241b).lambda$sendRequestTypedAndProcessUpdates$5((Executor) this.f20242c, (Utilities.Callback2) this.d, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                e0.X((e0) this.f20241b, (of.e) this.f20242c, (TL_aicompose.TL_aiComposeTone) this.d);
                return;
            case 2:
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                org.telegram.ui.Components.q.T((org.telegram.ui.Components.q) this.f20241b, (d6) this.f20242c, (TL_aicompose.AiComposeTone) this.d, (TLRPC.TL_error) obj2);
                return;
            case 3:
                TLRPC.Bool bool3 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                y.Q((y) this.f20241b, (of.e) this.f20242c, (a2) this.d);
                return;
            case 4:
                b1 b1Var = (b1) this.f20241b;
                ea eaVar = (ea) this.f20242c;
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) this.d;
                String str = (String) obj;
                ArrayList arrayList = (ArrayList) obj2;
                if (TextUtils.isEmpty(str)) {
                    b1Var.x(eaVar, "prepared_message_sent", null);
                    g0 g0Var = b1Var.f43464c;
                    if (g0Var != null) {
                        g0Var.c();
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.i(24, botWebViewContainer$BotWebViewProxy, arrayList), 500L);
                    return;
                }
                b1Var.x(eaVar, "prepared_message_failed", b1.A(str, "error"));
                return;
            case 5:
                x xVar = (x) this.f20241b;
                d4[] d4VarArr = (d4[]) this.f20242c;
                FrameLayout frameLayout = (FrameLayout) this.d;
                View view = (View) obj;
                CharSequence charSequence = (CharSequence) obj2;
                d4 d4Var = d4VarArr[0];
                if (d4Var != null) {
                    d4Var.e(true);
                }
                CharSequence replaceTags = AndroidUtilities.replaceTags(charSequence);
                float x10 = ((View) ((View) view.getParent()).getParent()).getX() + ((View) view.getParent()).getX() + view.getX();
                float y3 = ((View) ((View) view.getParent()).getParent()).getY() + ((View) view.getParent()).getY() + view.getY();
                if (view instanceof cd) {
                    Layout layout = ((cd) view).getLayout();
                    CharSequence text = layout.getText();
                    if (text instanceof Spanned) {
                        Spanned spanned = (Spanned) text;
                        dd[] ddVarArr = (dd[]) spanned.getSpans(0, text.length(), dd.class);
                        if (ddVarArr.length > 0 && (ddVar = ddVarArr[0]) != null) {
                            int spanStart = spanned.getSpanStart(ddVar);
                            x10 += layout.getPrimaryHorizontal(spanStart) + (ddVarArr[0].a() / 2);
                            y3 += layout.getLineTop(layout.getLineForOffset(spanStart));
                        }
                    }
                }
                d4 d4Var2 = new d4(xVar.getContext(), 3);
                d4VarArr[0] = d4Var2;
                d4Var2.p(true);
                d4Var2.k(11.0f, 8.0f, 11.0f, 7.0f);
                d4Var2.q(10.0f);
                d4Var2.s(replaceTags);
                d4Var2.f4917l0 = new b4(d4Var2, 1);
                d4Var2.setTranslationY((-AndroidUtilities.dp(100.0f)) + y3);
                d4Var2.h = AndroidUtilities.dp(300.0f);
                d4Var2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                d4Var2.m(0.0f, x10 - AndroidUtilities.dp(4.0f));
                frameLayout.addView(d4Var2, x5.e(-1, 100, 55));
                d4Var2.u();
                return;
            case 6:
                h4 h4Var = (h4) this.f20241b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.d;
                String str2 = (String) obj2;
                ((of.e) this.f20242c).b();
                if (((Boolean) obj).booleanValue()) {
                    v0 v0Var = h4Var.f51394f0;
                    if (v0Var != null) {
                        v0Var.run(tL_starGiftUnique);
                    }
                    h4Var.dismiss();
                    return;
                }
                return;
            case 7:
                yh.y.S((yh.y) this.f20241b, (of.e) this.f20242c, (a2) this.d, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                s3 s3Var = (s3) this.f20241b;
                d4[] d4VarArr2 = (d4[]) this.f20242c;
                FrameLayout frameLayout2 = (FrameLayout) this.d;
                View view2 = (View) obj;
                CharSequence charSequence2 = (CharSequence) obj2;
                d4 d4Var3 = d4VarArr2[0];
                if (d4Var3 != null) {
                    d4Var3.e(true);
                }
                CharSequence replaceTags2 = AndroidUtilities.replaceTags(charSequence2);
                float x11 = ((View) ((View) view2.getParent()).getParent()).getX() + ((View) view2.getParent()).getX() + view2.getX();
                float y10 = ((View) ((View) view2.getParent()).getParent()).getY() + ((View) view2.getParent()).getY() + view2.getY();
                if (view2 instanceof cd) {
                    Layout layout2 = ((cd) view2).getLayout();
                    CharSequence text2 = layout2.getText();
                    if (text2 instanceof Spanned) {
                        Spanned spanned2 = (Spanned) text2;
                        dd[] ddVarArr2 = (dd[]) spanned2.getSpans(0, text2.length(), dd.class);
                        if (ddVarArr2.length > 0 && (ddVar2 = ddVarArr2[0]) != null) {
                            int spanStart2 = spanned2.getSpanStart(ddVar2);
                            x11 += layout2.getPrimaryHorizontal(spanStart2) + (ddVarArr2[0].a() / 2);
                            y10 += layout2.getLineTop(layout2.getLineForOffset(spanStart2));
                        }
                    }
                }
                d4 d4Var4 = new d4(s3Var.getContext(), 3);
                d4VarArr2[0] = d4Var4;
                d4Var4.p(true);
                d4Var4.k(11.0f, 8.0f, 11.0f, 7.0f);
                d4Var4.q(10.0f);
                d4Var4.s(replaceTags2);
                d4Var4.f4917l0 = new b4(d4Var4, 3);
                d4Var4.setTranslationY((-AndroidUtilities.dp(100.0f)) + y10);
                d4Var4.h = AndroidUtilities.dp(300.0f);
                d4Var4.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                d4Var4.m(0.0f, x11 - AndroidUtilities.dp(4.0f));
                frameLayout2.addView(d4Var4, x5.e(-1, 100, 55));
                d4Var4.u();
                return;
        }
    }
}
