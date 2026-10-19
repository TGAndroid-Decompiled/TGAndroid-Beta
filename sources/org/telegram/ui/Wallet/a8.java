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
import org.telegram.messenger.lk;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.x90;
import org.telegram.ui.en0;
public final class a8 implements View.OnClickListener {
    public final int f33996a = 0;
    public final Object f33997b;
    public final org.telegram.ui.ActionBar.d6 f33998c;
    public final Object d;
    public final Object e;

    public a8(Context context, org.telegram.ui.ActionBar.d6 d6Var, Runnable runnable, org.telegram.ui.ActionBar.f3 f3Var) {
        this.d = context;
        this.f33998c = d6Var;
        this.f33997b = runnable;
        this.e = f3Var;
    }

    @Override
    public final void onClick(View view) {
        float f7;
        int i10 = this.f33996a;
        org.telegram.ui.ActionBar.d6 d6Var = this.f33998c;
        Object obj = this.e;
        Object obj2 = this.f33997b;
        Object obj3 = this.d;
        switch (i10) {
            case 0:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context) obj3, 0, d6Var);
                String string = LocaleController.getString(R.string.WalletDeleteWalletTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20604a;
                b2Var.R = string;
                b2Var.T = LocaleController.getString(R.string.WalletDeleteWalletInfo);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new en0(27, (Runnable) obj2, (org.telegram.ui.ActionBar.f3) obj));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
            case 1:
                k8 k8Var = (k8) obj3;
                Runnable runnable = (Runnable) obj2;
                Runnable runnable2 = (Runnable) obj;
                org.telegram.ui.ActionBar.d6 d6Var2 = k8Var.f34426a;
                if (!TextUtils.isEmpty(k8Var.f34431r) && k8Var.f34430n != null) {
                    org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
                    LinearLayout linearLayout = new LinearLayout(k8Var.getContext());
                    linearLayout.setOrientation(1);
                    linearLayout.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                    TLRPC.User user = k8Var.f34430n;
                    if (user != null) {
                        String forcedFirstName = UserObject.getForcedFirstName(user);
                        LinearLayout linearLayout2 = new LinearLayout(k8Var.getContext());
                        linearLayout2.setOrientation(0);
                        f7 = 4.0f;
                        linearLayout2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(k8Var.getContext());
                        w9Var.setRoundRadius(AndroidUtilities.dp(15.0f));
                        org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
                        h9Var.r(k8Var.f34430n);
                        w9Var.e(k8Var.f34430n, h9Var);
                        linearLayout2.addView(w9Var, w7.z5.q(30, 30, 16));
                        TextView textView = new TextView(k8Var.getContext());
                        int i11 = org.telegram.ui.ActionBar.h6.G6;
                        lk.o(i11, d6Var2, textView, 1, 20.0f);
                        textView.setText(LocaleController.formatString(R.string.WalletUserWallet, forcedFirstName));
                        textView.setTypeface(AndroidUtilities.bold());
                        textView.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                        linearLayout2.addView(textView, w7.z5.t(-1, -2, 16, 9, 0, 0, 0));
                        linearLayout.addView(linearLayout2, w7.z5.q(-1, -2, 55));
                        x90 x90Var = new x90(k8Var.getContext(), null);
                        x90Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var2));
                        x90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21048gc, d6Var2));
                        x90Var.setTextSize(1, 16.0f);
                        x90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                        x90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.WalletAddressLinkedToUser, UserObject.getUserName(k8Var.f34430n)), new z3(15, b2VarArr, runnable)));
                        linearLayout.addView(x90Var, w7.z5.t(-1, -2, 55, 0, 14, 0, 0));
                    } else {
                        f7 = 4.0f;
                    }
                    FrameLayout frameLayout = new FrameLayout(k8Var.getContext());
                    frameLayout.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
                    TextView textView2 = new TextView(k8Var.getContext());
                    textView2.setTextSize(1, 14.0f);
                    textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var));
                    textView2.setText(w7.X(k8Var.f34431r));
                    textView2.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(12.0f));
                    textView2.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
                    int i12 = org.telegram.ui.ActionBar.h6.f20931a7;
                    textView2.setBackground(org.telegram.ui.ActionBar.h6.a0(org.telegram.ui.ActionBar.h6.w0(i12, d6Var2), org.telegram.ui.ActionBar.h6.v(org.telegram.ui.ActionBar.h6.w0(i12, d6Var2), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21078i6, d6Var2)), 10, 10));
                    textView2.setGravity(17);
                    frameLayout.addView(textView2, w7.z5.d(-1, -2.0f, 7, 0.0f, 0.0f, 0.0f, 0.0f));
                    linearLayout.addView(frameLayout, w7.z5.t(-1, -2, 55, 0, 14, 0, 0));
                    w7.b6.b(textView2, 0.02f, 1.2f);
                    textView2.setOnClickListener(new n1(k8Var, b2VarArr, runnable2, 3));
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(k8Var.getContext(), 0, d6Var);
                    alertDialog$Builder2.n(linearLayout);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                    b2VarArr[0] = alertDialog$Builder2.o();
                    return;
                }
                return;
            default:
                ei.d dVar = (ei.d) obj3;
                x xVar = (x) obj2;
                k2 k2Var = (k2) obj;
                if (!dVar.N) {
                    dVar.setLoading(true);
                    xVar.run(new p(dVar, k2Var, d6Var, 9));
                    return;
                }
                return;
        }
    }

    public a8(ei.d dVar, x xVar, k2 k2Var, org.telegram.ui.ActionBar.d6 d6Var) {
        this.d = dVar;
        this.f33997b = xVar;
        this.e = k2Var;
        this.f33998c = d6Var;
    }

    public a8(k8 k8Var, Runnable runnable, org.telegram.ui.ActionBar.d6 d6Var, Runnable runnable2) {
        this.d = k8Var;
        this.f33997b = runnable;
        this.f33998c = d6Var;
        this.e = runnable2;
    }
}
