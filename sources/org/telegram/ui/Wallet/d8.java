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
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.x90;
import org.telegram.ui.fr0;
public final class d8 implements View.OnClickListener {
    public final int f34139a = 0;
    public final Object f34140b;
    public final org.telegram.ui.ActionBar.d6 f34141c;
    public final Object d;
    public final Object e;

    public d8(Context context, org.telegram.ui.ActionBar.d6 d6Var, Runnable runnable, org.telegram.ui.ActionBar.f3 f3Var) {
        this.d = context;
        this.f34141c = d6Var;
        this.f34140b = runnable;
        this.e = f3Var;
    }

    @Override
    public final void onClick(View view) {
        float f7;
        int i10 = this.f34139a;
        org.telegram.ui.ActionBar.d6 d6Var = this.f34141c;
        Object obj = this.e;
        Object obj2 = this.f34140b;
        Object obj3 = this.d;
        switch (i10) {
            case 0:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context) obj3, 0, d6Var);
                String string = LocaleController.getString(R.string.WalletDeleteWalletTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20601a;
                b2Var.R = string;
                b2Var.T = LocaleController.getString(R.string.WalletDeleteWalletInfo);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new fr0(26, (Runnable) obj2, (org.telegram.ui.ActionBar.f3) obj));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
            case 1:
                n8 n8Var = (n8) obj3;
                Runnable runnable = (Runnable) obj2;
                Runnable runnable2 = (Runnable) obj;
                org.telegram.ui.ActionBar.d6 d6Var2 = n8Var.f34644a;
                if (!TextUtils.isEmpty(n8Var.f34649r) && n8Var.f34648n != null) {
                    org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
                    LinearLayout linearLayout = new LinearLayout(n8Var.getContext());
                    linearLayout.setOrientation(1);
                    linearLayout.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                    TLRPC.User user = n8Var.f34648n;
                    if (user != null) {
                        String forcedFirstName = UserObject.getForcedFirstName(user);
                        LinearLayout linearLayout2 = new LinearLayout(n8Var.getContext());
                        linearLayout2.setOrientation(0);
                        f7 = 4.0f;
                        linearLayout2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(n8Var.getContext());
                        w9Var.setRoundRadius(AndroidUtilities.dp(15.0f));
                        org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
                        h9Var.r(n8Var.f34648n);
                        w9Var.e(n8Var.f34648n, h9Var);
                        linearLayout2.addView(w9Var, w7.z5.q(30, 30, 16));
                        TextView textView = new TextView(n8Var.getContext());
                        int i11 = org.telegram.ui.ActionBar.h6.G6;
                        wh.o(i11, d6Var2, textView, 1, 20.0f);
                        textView.setText(LocaleController.formatString(R.string.WalletUserWallet, forcedFirstName));
                        textView.setTypeface(AndroidUtilities.bold());
                        textView.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                        linearLayout2.addView(textView, w7.z5.t(-1, -2, 16, 9, 0, 0, 0));
                        linearLayout.addView(linearLayout2, w7.z5.q(-1, -2, 55));
                        x90 x90Var = new x90(n8Var.getContext(), null);
                        x90Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var2));
                        x90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21045gc, d6Var2));
                        x90Var.setTextSize(1, 16.0f);
                        x90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                        x90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.WalletAddressLinkedToUser, UserObject.getUserName(n8Var.f34648n)), new t3(15, b2VarArr, runnable)));
                        linearLayout.addView(x90Var, w7.z5.t(-1, -2, 55, 0, 14, 0, 0));
                    } else {
                        f7 = 4.0f;
                    }
                    FrameLayout frameLayout = new FrameLayout(n8Var.getContext());
                    frameLayout.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
                    TextView textView2 = new TextView(n8Var.getContext());
                    textView2.setTextSize(1, 14.0f);
                    textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var));
                    textView2.setText(z7.X(n8Var.f34649r));
                    textView2.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(12.0f));
                    textView2.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
                    int i12 = org.telegram.ui.ActionBar.h6.f20928a7;
                    textView2.setBackground(org.telegram.ui.ActionBar.h6.a0(org.telegram.ui.ActionBar.h6.w0(i12, d6Var2), org.telegram.ui.ActionBar.h6.v(org.telegram.ui.ActionBar.h6.w0(i12, d6Var2), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21075i6, d6Var2)), 10, 10));
                    textView2.setGravity(17);
                    frameLayout.addView(textView2, w7.z5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 7));
                    linearLayout.addView(frameLayout, w7.z5.t(-1, -2, 55, 0, 14, 0, 0));
                    w7.b6.b(textView2, 0.02f, 1.2f);
                    textView2.setOnClickListener(new n1(n8Var, b2VarArr, runnable2, 3));
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(n8Var.getContext(), 0, d6Var);
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

    public d8(ei.d dVar, x xVar, k2 k2Var, org.telegram.ui.ActionBar.d6 d6Var) {
        this.d = dVar;
        this.f34140b = xVar;
        this.e = k2Var;
        this.f34141c = d6Var;
    }

    public d8(n8 n8Var, Runnable runnable, org.telegram.ui.ActionBar.d6 d6Var, Runnable runnable2) {
        this.d = n8Var;
        this.f34140b = runnable;
        this.f34141c = d6Var;
        this.e = runnable2;
    }
}
