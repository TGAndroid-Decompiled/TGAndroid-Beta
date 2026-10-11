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
import org.telegram.messenger.ai;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.fa0;
import org.telegram.ui.Components.y9;
import org.telegram.ui.js0;
public final class g7 implements View.OnClickListener {
    public final int f34996a = 0;
    public final Object f34997b;
    public final org.telegram.ui.ActionBar.d6 f34998c;
    public final Object d;
    public final Object f34999e;

    public g7(Context context, org.telegram.ui.ActionBar.d6 d6Var, Runnable runnable, org.telegram.ui.ActionBar.e3 e3Var) {
        this.d = context;
        this.f34998c = d6Var;
        this.f34997b = runnable;
        this.f34999e = e3Var;
    }

    @Override
    public final void onClick(View view) {
        float f7;
        int i10 = this.f34996a;
        org.telegram.ui.ActionBar.d6 d6Var = this.f34998c;
        Object obj = this.f34999e;
        Object obj2 = this.f34997b;
        Object obj3 = this.d;
        switch (i10) {
            case 0:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context) obj3, 0, d6Var);
                String string = LocaleController.getString(R.string.WalletDeleteWalletTitle);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20368a;
                a2Var.R = string;
                a2Var.T = LocaleController.getString(R.string.WalletDeleteWalletInfo);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new js0(24, (Runnable) obj2, (org.telegram.ui.ActionBar.e3) obj));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
            case 1:
                p7 p7Var = (p7) obj3;
                Runnable runnable = (Runnable) obj2;
                Runnable runnable2 = (Runnable) obj;
                org.telegram.ui.ActionBar.d6 d6Var2 = p7Var.f35425a;
                if (!TextUtils.isEmpty(p7Var.f35431r) && p7Var.f35430n != null) {
                    org.telegram.ui.ActionBar.a2[] a2VarArr = new org.telegram.ui.ActionBar.a2[1];
                    LinearLayout linearLayout = new LinearLayout(p7Var.getContext());
                    linearLayout.setOrientation(1);
                    linearLayout.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                    TLRPC.User user = p7Var.f35430n;
                    if (user != null) {
                        String forcedFirstName = UserObject.getForcedFirstName(user);
                        f7 = 4.0f;
                        LinearLayout linearLayout2 = new LinearLayout(p7Var.getContext());
                        linearLayout2.setOrientation(0);
                        linearLayout2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                        y9 y9Var = new y9(p7Var.getContext());
                        y9Var.setRoundRadius(AndroidUtilities.dp(15.0f));
                        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.d6) null);
                        j9Var.r(p7Var.f35430n);
                        y9Var.e(p7Var.f35430n, j9Var);
                        linearLayout2.addView(y9Var, w7.x5.q(30, 30, 16));
                        TextView textView = new TextView(p7Var.getContext());
                        int i11 = org.telegram.ui.ActionBar.h6.G6;
                        ai.o(i11, d6Var2, textView, 1, 20.0f);
                        textView.setText(LocaleController.formatString(R.string.WalletUserWallet, forcedFirstName));
                        textView.setTypeface(AndroidUtilities.bold());
                        textView.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                        linearLayout2.addView(textView, w7.x5.t(-1, -2, 16, 9, 0, 0, 0));
                        linearLayout.addView(linearLayout2, w7.x5.q(-1, -2, 55));
                        fa0 fa0Var = new fa0(p7Var.getContext(), null);
                        fa0Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var2));
                        fa0Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.gc, d6Var2));
                        fa0Var.setTextSize(1, 16.0f);
                        fa0Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                        fa0Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.WalletAddressLinkedToUser, UserObject.getUserName(p7Var.f35430n)), new i(17, a2VarArr, runnable)));
                        linearLayout.addView(fa0Var, w7.x5.t(-1, -2, 55, 0, 14, 0, 0));
                    } else {
                        f7 = 4.0f;
                    }
                    FrameLayout frameLayout = new FrameLayout(p7Var.getContext());
                    frameLayout.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
                    TextView textView2 = new TextView(p7Var.getContext());
                    textView2.setTextSize(1, 14.0f);
                    textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var));
                    textView2.setText(c7.X(p7Var.f35431r));
                    textView2.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(12.0f));
                    textView2.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
                    int i12 = org.telegram.ui.ActionBar.h6.f20730a7;
                    textView2.setBackground(org.telegram.ui.ActionBar.h6.a0(org.telegram.ui.ActionBar.h6.w0(i12, d6Var2), org.telegram.ui.ActionBar.h6.v(org.telegram.ui.ActionBar.h6.w0(i12, d6Var2), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20877i6, d6Var2)), 10, 10));
                    textView2.setGravity(17);
                    frameLayout.addView(textView2, w7.x5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 7));
                    linearLayout.addView(frameLayout, w7.x5.t(-1, -2, 55, 0, 14, 0, 0));
                    w7.z5.b(textView2, 0.02f, 1.2f);
                    textView2.setOnClickListener(new n1(p7Var, a2VarArr, runnable2, 2));
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(p7Var.getContext(), 0, d6Var);
                    alertDialog$Builder2.n(linearLayout);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                    a2VarArr[0] = alertDialog$Builder2.o();
                    return;
                }
                return;
            default:
                ci.d dVar = (ci.d) obj3;
                b7 b7Var = (b7) obj2;
                k2 k2Var = (k2) obj;
                if (!dVar.N) {
                    dVar.setLoading(true);
                    b7Var.run(new q(dVar, k2Var, d6Var, 9));
                    return;
                }
                return;
        }
    }

    public g7(ci.d dVar, b7 b7Var, k2 k2Var, org.telegram.ui.ActionBar.d6 d6Var) {
        this.d = dVar;
        this.f34997b = b7Var;
        this.f34999e = k2Var;
        this.f34998c = d6Var;
    }

    public g7(p7 p7Var, Runnable runnable, org.telegram.ui.ActionBar.d6 d6Var, Runnable runnable2) {
        this.d = p7Var;
        this.f34997b = runnable;
        this.f34998c = d6Var;
        this.f34999e = runnable2;
    }
}
