package org.telegram.tgnet;

import android.text.Layout;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import bi.n9;
import di.b4;
import di.d4;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.bd;
import org.telegram.ui.Components.cd;
import org.telegram.ui.Components.e0;
import org.telegram.ui.Components.y;
import org.telegram.ui.Wallet.t8;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;
import org.telegram.ui.web.b1;
import org.telegram.ui.web.h0;
import w7.a6;
import yh.f4;
import zh.r3;
import zh.v0;
import zh.z;
public final class e implements Utilities.Callback2 {
    public final int f19387a;
    public final Object f19388b;
    public final Object f19389c;
    public final Object d;

    public e(Object obj, Object obj2, Object obj3, int i10) {
        this.f19387a = i10;
        this.f19388b = obj;
        this.f19389c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        cd cdVar;
        cd cdVar2;
        switch (this.f19387a) {
            case 0:
                ((ConnectionsManager) this.f19388b).lambda$sendRequestTypedAndProcessUpdates$5((Executor) this.f19389c, (Utilities.Callback2) this.d, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                e0.X((e0) this.f19388b, (pf.c) this.f19389c, (TL_aicompose.TL_aiComposeTone) this.d);
                return;
            case 2:
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                org.telegram.ui.Components.q.T((org.telegram.ui.Components.q) this.f19388b, (c6) this.f19389c, (TL_aicompose.AiComposeTone) this.d, (TLRPC.TL_error) obj2);
                return;
            case 3:
                TLRPC.Bool bool3 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                y.Q((y) this.f19388b, (pf.c) this.f19389c, (a2) this.d);
                return;
            case 4:
                b1 b1Var = (b1) this.f19388b;
                n9 n9Var = (n9) this.f19389c;
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) this.d;
                String str = (String) obj;
                ArrayList arrayList = (ArrayList) obj2;
                if (TextUtils.isEmpty(str)) {
                    b1Var.x(n9Var, "prepared_message_sent", null);
                    h0 h0Var = b1Var.f41286c;
                    if (h0Var != null) {
                        h0Var.c();
                    }
                    AndroidUtilities.runOnUIThread(new t8(6, botWebViewContainer$BotWebViewProxy, arrayList), 500L);
                    return;
                }
                b1Var.x(n9Var, "prepared_message_failed", b1.A(str, "error"));
                return;
            case 5:
                yh.w wVar = (yh.w) this.f19388b;
                d4[] d4VarArr = (d4[]) this.f19389c;
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
                if (view instanceof bd) {
                    Layout layout = ((bd) view).getLayout();
                    CharSequence text = layout.getText();
                    if (text instanceof Spanned) {
                        Spanned spanned = (Spanned) text;
                        cd[] cdVarArr = (cd[]) spanned.getSpans(0, text.length(), cd.class);
                        if (cdVarArr.length > 0 && (cdVar = cdVarArr[0]) != null) {
                            int spanStart = spanned.getSpanStart(cdVar);
                            x10 += layout.getPrimaryHorizontal(spanStart) + (cdVarArr[0].a() / 2);
                            y3 += layout.getLineTop(layout.getLineForOffset(spanStart));
                        }
                    }
                }
                d4 d4Var2 = new d4(wVar.getContext(), 3);
                d4VarArr[0] = d4Var2;
                d4Var2.p(true);
                d4Var2.k(11.0f, 8.0f, 11.0f, 7.0f);
                d4Var2.q(10.0f);
                d4Var2.s(replaceTags);
                d4Var2.f6801l0 = new b4(d4Var2, 1);
                d4Var2.setTranslationY((-AndroidUtilities.dp(100.0f)) + y3);
                d4Var2.h = AndroidUtilities.dp(300.0f);
                d4Var2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                d4Var2.m(0.0f, x10 - AndroidUtilities.dp(4.0f));
                frameLayout.addView(d4Var2, a6.e(-1, 100, 55));
                d4Var2.u();
                return;
            case 6:
                f4 f4Var = (f4) this.f19388b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.d;
                String str2 = (String) obj2;
                ((pf.c) this.f19389c).b();
                if (((Boolean) obj).booleanValue()) {
                    v0 v0Var = f4Var.f48868f0;
                    if (v0Var != null) {
                        v0Var.run(tL_starGiftUnique);
                    }
                    f4Var.dismiss();
                    return;
                }
                return;
            case 7:
                z.S((z) this.f19388b, (pf.c) this.f19389c, (a2) this.d, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                r3 r3Var = (r3) this.f19388b;
                d4[] d4VarArr2 = (d4[]) this.f19389c;
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
                if (view2 instanceof bd) {
                    Layout layout2 = ((bd) view2).getLayout();
                    CharSequence text2 = layout2.getText();
                    if (text2 instanceof Spanned) {
                        Spanned spanned2 = (Spanned) text2;
                        cd[] cdVarArr2 = (cd[]) spanned2.getSpans(0, text2.length(), cd.class);
                        if (cdVarArr2.length > 0 && (cdVar2 = cdVarArr2[0]) != null) {
                            int spanStart2 = spanned2.getSpanStart(cdVar2);
                            x11 += layout2.getPrimaryHorizontal(spanStart2) + (cdVarArr2[0].a() / 2);
                            y10 += layout2.getLineTop(layout2.getLineForOffset(spanStart2));
                        }
                    }
                }
                d4 d4Var4 = new d4(r3Var.getContext(), 3);
                d4VarArr2[0] = d4Var4;
                d4Var4.p(true);
                d4Var4.k(11.0f, 8.0f, 11.0f, 7.0f);
                d4Var4.q(10.0f);
                d4Var4.s(replaceTags2);
                d4Var4.f6801l0 = new b4(d4Var4, 3);
                d4Var4.setTranslationY((-AndroidUtilities.dp(100.0f)) + y10);
                d4Var4.h = AndroidUtilities.dp(300.0f);
                d4Var4.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                d4Var4.m(0.0f, x11 - AndroidUtilities.dp(4.0f));
                frameLayout2.addView(d4Var4, a6.e(-1, 100, 55));
                d4Var4.u();
                return;
        }
    }
}
