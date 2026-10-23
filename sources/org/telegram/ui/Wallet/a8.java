package org.telegram.ui.Wallet;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.y90;
import org.telegram.ui.ql0;
public final class a8 implements View.OnClickListener {
    public final int f34299a;
    public final org.telegram.ui.ActionBar.g6 f34300b;
    public final Object f34301c;
    public final Object d;
    public final Object e;

    public a8(ei.d dVar, w wVar, j2 j2Var, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f34299a = 2;
        this.d = dVar;
        this.f34301c = wVar;
        this.e = j2Var;
        this.f34300b = g6Var;
    }

    @Override
    public final void onClick(View view) {
        float f7;
        int i10 = this.f34299a;
        org.telegram.ui.ActionBar.g6 g6Var = this.f34300b;
        Object obj = this.e;
        Object obj2 = this.f34301c;
        Object obj3 = this.d;
        switch (i10) {
            case 0:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context) obj3, 0, g6Var);
                String string = LocaleController.getString(R.string.WalletDeleteWalletTitle);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
                c2Var.R = string;
                c2Var.T = LocaleController.getString(R.string.WalletDeleteWalletInfo);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ql0(29, (Runnable) obj2, (org.telegram.ui.ActionBar.h3) obj));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                return;
            case 1:
                l8 l8Var = (l8) obj3;
                Runnable runnable = (Runnable) obj2;
                Runnable runnable2 = (Runnable) obj;
                org.telegram.ui.ActionBar.g6 g6Var2 = l8Var.f34780a;
                if (!TextUtils.isEmpty(l8Var.f34786s) && l8Var.f34785r != null) {
                    org.telegram.ui.ActionBar.c2[] c2VarArr = new org.telegram.ui.ActionBar.c2[1];
                    LinearLayout linearLayout = new LinearLayout(l8Var.getContext());
                    linearLayout.setOrientation(1);
                    linearLayout.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                    TLRPC.User user = l8Var.f34785r;
                    if (user != null) {
                        String forcedFirstName = UserObject.getForcedFirstName(user);
                        LinearLayout linearLayout2 = new LinearLayout(l8Var.getContext());
                        linearLayout2.setOrientation(0);
                        f7 = 4.0f;
                        linearLayout2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(l8Var.getContext());
                        w9Var.setRoundRadius(AndroidUtilities.dp(15.0f));
                        org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.g6) null);
                        h9Var.r(l8Var.f34785r);
                        w9Var.e(l8Var.f34785r, h9Var);
                        linearLayout2.addView(w9Var, w7.z5.q(30, 30, 16));
                        TextView textView = new TextView(l8Var.getContext());
                        int i11 = org.telegram.ui.ActionBar.k6.G6;
                        org.telegram.ui.ActionBar.r6.W(textView, i11, g6Var);
                        textView.setTextSize(1, 20.0f);
                        textView.setText(LocaleController.formatString(R.string.WalletUserWallet, forcedFirstName));
                        textView.setTypeface(AndroidUtilities.bold());
                        textView.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                        linearLayout2.addView(textView, w7.z5.t(-1, -2, 16, 9, 0, 0, 0));
                        linearLayout.addView(linearLayout2, w7.z5.q(-1, -2, 55));
                        y90 y90Var = new y90(l8Var.getContext(), null);
                        org.telegram.ui.ActionBar.r6.W(y90Var, i11, g6Var);
                        org.telegram.ui.ActionBar.r6.I(y90Var, org.telegram.ui.ActionBar.k6.f21242gc, g6Var);
                        y90Var.setTextSize(1, 16.0f);
                        y90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                        y90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.WalletAddressLinkedToUser, UserObject.getUserName(l8Var.f34785r)), new y3(15, c2VarArr, runnable)));
                        linearLayout.addView(y90Var, w7.z5.t(-1, -2, 55, 0, 14, 0, 0));
                    } else {
                        f7 = 4.0f;
                    }
                    FrameLayout frameLayout = new FrameLayout(l8Var.getContext());
                    frameLayout.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
                    TextView textView2 = new TextView(l8Var.getContext());
                    textView2.setTextSize(1, 14.0f);
                    org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.G6, g6Var);
                    textView2.setText(w7.X(l8Var.f34786s));
                    textView2.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(12.0f));
                    textView2.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
                    int i12 = org.telegram.ui.ActionBar.k6.f21125a7;
                    int w02 = org.telegram.ui.ActionBar.k6.w0(i12, g6Var2);
                    int w03 = org.telegram.ui.ActionBar.k6.w0(i12, g6Var2);
                    int i13 = org.telegram.ui.ActionBar.k6.f21272i6;
                    org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.k6.a0(w02, org.telegram.ui.ActionBar.k6.v(w03, org.telegram.ui.ActionBar.k6.w0(i13, g6Var2)), 10, 10);
                    org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i12);
                    org.telegram.ui.ActionBar.n6 q6 = org.telegram.ui.ActionBar.r6.q(i12, i13);
                    textView2.setBackground(a02);
                    org.telegram.ui.ActionBar.r6.k(textView2, a02, O, q6, g6Var);
                    textView2.setGravity(17);
                    frameLayout.addView(textView2, w7.z5.d(-1, -2.0f, 7, 0.0f, 0.0f, 0.0f, 0.0f));
                    linearLayout.addView(frameLayout, w7.z5.t(-1, -2, 55, 0, 14, 0, 0));
                    w7.b6.b(textView2, 0.02f, 1.2f);
                    textView2.setOnClickListener(new m1(l8Var, c2VarArr, runnable2, 3));
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(l8Var.getContext(), 0, g6Var);
                    alertDialog$Builder2.o(linearLayout);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                    c2VarArr[0] = alertDialog$Builder2.p();
                    return;
                }
                return;
            default:
                ei.d dVar = (ei.d) obj3;
                w wVar = (w) obj2;
                j2 j2Var = (j2) obj;
                if (!dVar.Q) {
                    dVar.setLoading(true);
                    wVar.run(new o(dVar, j2Var, g6Var, 9));
                    return;
                }
                return;
        }
    }

    public a8(Object obj, org.telegram.ui.ActionBar.g6 g6Var, Runnable runnable, Object obj2, int i10) {
        this.f34299a = i10;
        this.d = obj;
        this.f34300b = g6Var;
        this.f34301c = runnable;
        this.e = obj2;
    }
}
