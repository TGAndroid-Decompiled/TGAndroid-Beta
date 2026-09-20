package org.telegram.tgnet;

import ai.da;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import ci.d4;
import ci.f4;
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
import org.telegram.ui.Components.e0;
import org.telegram.ui.Components.y;
import org.telegram.ui.Components.zc;
import org.telegram.ui.w81;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;
import org.telegram.ui.web.d1;
import org.telegram.ui.web.h0;
import w7.y5;
import xh.h4;
import yh.a0;
import yh.w0;
import yh.y3;
public final class e implements Utilities.Callback2 {
    public final int f18499a;
    public final Object f18500b;
    public final Object f18501c;
    public final Object d;

    public e(Object obj, Object obj2, Object obj3, int i10) {
        this.f18499a = i10;
        this.f18500b = obj;
        this.f18501c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        ad adVar;
        ad adVar2;
        switch (this.f18499a) {
            case 0:
                ((ConnectionsManager) this.f18500b).lambda$sendRequestTypedAndProcessUpdates$5((Executor) this.f18501c, (Utilities.Callback2) this.d, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                e0.W((e0) this.f18500b, (nf.e) this.f18501c, (TL_aicompose.TL_aiComposeTone) this.d);
                return;
            case 2:
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                org.telegram.ui.Components.q.S((org.telegram.ui.Components.q) this.f18500b, (f6) this.f18501c, (TL_aicompose.AiComposeTone) this.d, (TLRPC.TL_error) obj2);
                return;
            case 3:
                TLRPC.Bool bool3 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                y.P((y) this.f18500b, (nf.e) this.f18501c, (b2) this.d);
                return;
            case 4:
                d1 d1Var = (d1) this.f18500b;
                da daVar = (da) this.f18501c;
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) this.d;
                String str = (String) obj;
                ArrayList arrayList = (ArrayList) obj2;
                if (TextUtils.isEmpty(str)) {
                    d1Var.y(daVar, "prepared_message_sent", null);
                    h0 h0Var = d1Var.f38855c;
                    if (h0Var != null) {
                        h0Var.c();
                    }
                    AndroidUtilities.runOnUIThread(new w81(28, botWebViewContainer$BotWebViewProxy, arrayList), 500L);
                    return;
                }
                d1Var.y(daVar, "prepared_message_failed", d1.B(str, "error"));
                return;
            case 5:
                xh.v vVar = (xh.v) this.f18500b;
                f4[] f4VarArr = (f4[]) this.f18501c;
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
                if (view instanceof zc) {
                    Layout layout = ((zc) view).getLayout();
                    CharSequence text = layout.getText();
                    if (text instanceof Spanned) {
                        Spanned spanned = (Spanned) text;
                        ad[] adVarArr = (ad[]) spanned.getSpans(0, text.length(), ad.class);
                        if (adVarArr.length > 0 && (adVar = adVarArr[0]) != null) {
                            int spanStart = spanned.getSpanStart(adVar);
                            x10 += layout.getPrimaryHorizontal(spanStart) + (adVarArr[0].a() / 2);
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
                f4Var2.f4639l0 = new d4(f4Var2, 1);
                f4Var2.setTranslationY((-AndroidUtilities.dp(100.0f)) + y3);
                f4Var2.h = AndroidUtilities.dp(300.0f);
                f4Var2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                f4Var2.m(0.0f, x10 - AndroidUtilities.dp(4.0f));
                frameLayout.addView(f4Var2, y5.e(-1, 100, 55));
                f4Var2.u();
                return;
            case 6:
                h4 h4Var = (h4) this.f18500b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.d;
                String str2 = (String) obj2;
                ((nf.e) this.f18501c).b();
                if (((Boolean) obj).booleanValue()) {
                    w0 w0Var = h4Var.f46193f0;
                    if (w0Var != null) {
                        w0Var.run(tL_starGiftUnique);
                    }
                    h4Var.dismiss();
                    return;
                }
                return;
            case 7:
                a0.R((a0) this.f18500b, (nf.e) this.f18501c, (b2) this.d, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                y3 y3Var = (y3) this.f18500b;
                f4[] f4VarArr2 = (f4[]) this.f18501c;
                FrameLayout frameLayout2 = (FrameLayout) this.d;
                View view2 = (View) obj;
                CharSequence charSequence2 = (CharSequence) obj2;
                f4 f4Var3 = f4VarArr2[0];
                if (f4Var3 != null) {
                    f4Var3.e(true);
                }
                CharSequence replaceTags2 = AndroidUtilities.replaceTags(charSequence2);
                float x11 = ((View) ((View) view2.getParent()).getParent()).getX() + ((View) view2.getParent()).getX() + view2.getX();
                float y10 = ((View) ((View) view2.getParent()).getParent()).getY() + ((View) view2.getParent()).getY() + view2.getY();
                if (view2 instanceof zc) {
                    Layout layout2 = ((zc) view2).getLayout();
                    CharSequence text2 = layout2.getText();
                    if (text2 instanceof Spanned) {
                        Spanned spanned2 = (Spanned) text2;
                        ad[] adVarArr2 = (ad[]) spanned2.getSpans(0, text2.length(), ad.class);
                        if (adVarArr2.length > 0 && (adVar2 = adVarArr2[0]) != null) {
                            int spanStart2 = spanned2.getSpanStart(adVar2);
                            x11 += layout2.getPrimaryHorizontal(spanStart2) + (adVarArr2[0].a() / 2);
                            y10 += layout2.getLineTop(layout2.getLineForOffset(spanStart2));
                        }
                    }
                }
                f4 f4Var4 = new f4(y3Var.getContext(), 3);
                f4VarArr2[0] = f4Var4;
                f4Var4.p(true);
                f4Var4.k(11.0f, 8.0f, 11.0f, 7.0f);
                f4Var4.q(10.0f);
                f4Var4.s(replaceTags2);
                f4Var4.f4639l0 = new d4(f4Var4, 3);
                f4Var4.setTranslationY((-AndroidUtilities.dp(100.0f)) + y10);
                f4Var4.h = AndroidUtilities.dp(300.0f);
                f4Var4.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                f4Var4.m(0.0f, x11 - AndroidUtilities.dp(4.0f));
                frameLayout2.addView(f4Var4, y5.e(-1, 100, 55));
                f4Var4.u();
                return;
        }
    }
}
