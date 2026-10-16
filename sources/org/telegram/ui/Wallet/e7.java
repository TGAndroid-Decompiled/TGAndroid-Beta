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
import org.telegram.messenger.sk;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.z9;
import org.telegram.ui.bs0;
import org.telegram.ui.wg1;
public final class e7 implements View.OnClickListener {
    public final int f32875a = 0;
    public final Object f32876b;
    public final org.telegram.ui.ActionBar.c6 f32877c;
    public final Object d;
    public final Object e;

    public e7(Context context, org.telegram.ui.ActionBar.c6 c6Var, Runnable runnable, org.telegram.ui.ActionBar.e3 e3Var) {
        this.d = context;
        this.f32877c = c6Var;
        this.f32876b = runnable;
        this.e = e3Var;
    }

    @Override
    public final void onClick(View view) {
        float f7;
        int i10 = this.f32875a;
        org.telegram.ui.ActionBar.c6 c6Var = this.f32877c;
        Object obj = this.e;
        Object obj2 = this.f32876b;
        Object obj3 = this.d;
        switch (i10) {
            case 0:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context) obj3, 0, c6Var);
                String string = LocaleController.getString(R.string.WalletDeleteWalletTitle);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
                a2Var.R = string;
                a2Var.T = LocaleController.getString(R.string.WalletDeleteWalletInfo);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new bs0(25, (Runnable) obj2, (org.telegram.ui.ActionBar.e3) obj));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
            case 1:
                n7 n7Var = (n7) obj3;
                Runnable runnable = (Runnable) obj2;
                Runnable runnable2 = (Runnable) obj;
                org.telegram.ui.ActionBar.c6 c6Var2 = n7Var.f33255a;
                if (!TextUtils.isEmpty(n7Var.f33260r) && n7Var.f33259n != null) {
                    org.telegram.ui.ActionBar.a2[] a2VarArr = new org.telegram.ui.ActionBar.a2[1];
                    LinearLayout linearLayout = new LinearLayout(n7Var.getContext());
                    linearLayout.setOrientation(1);
                    linearLayout.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                    TLRPC.User user = n7Var.f33259n;
                    if (user != null) {
                        String forcedFirstName = UserObject.getForcedFirstName(user);
                        LinearLayout linearLayout2 = new LinearLayout(n7Var.getContext());
                        linearLayout2.setOrientation(0);
                        f7 = 4.0f;
                        linearLayout2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                        z9 z9Var = new z9(n7Var.getContext());
                        z9Var.setRoundRadius(AndroidUtilities.dp(15.0f));
                        k9 k9Var = new k9((org.telegram.ui.ActionBar.c6) null);
                        k9Var.r(n7Var.f33259n);
                        z9Var.e(n7Var.f33259n, k9Var);
                        linearLayout2.addView(z9Var, w7.z5.q(30, 30, 16));
                        TextView textView = new TextView(n7Var.getContext());
                        int i11 = org.telegram.ui.ActionBar.g6.G6;
                        sk.o(i11, c6Var2, textView, 1, 20.0f);
                        textView.setText(LocaleController.formatString(R.string.WalletUserWallet, forcedFirstName));
                        textView.setTypeface(AndroidUtilities.bold());
                        textView.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                        linearLayout2.addView(textView, w7.z5.t(-1, -2, 16, 9, 0, 0, 0));
                        linearLayout.addView(linearLayout2, w7.z5.q(-1, -2, 55));
                        da0 da0Var = new da0(n7Var.getContext(), null);
                        da0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var2));
                        da0Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19660gc, c6Var2));
                        da0Var.setTextSize(1, 16.0f);
                        da0Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                        da0Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.WalletAddressLinkedToUser, UserObject.getUserName(n7Var.f33259n)), new wg1(24, a2VarArr, runnable)));
                        linearLayout.addView(da0Var, w7.z5.t(-1, -2, 55, 0, 14, 0, 0));
                    } else {
                        f7 = 4.0f;
                    }
                    FrameLayout frameLayout = new FrameLayout(n7Var.getContext());
                    frameLayout.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
                    TextView textView2 = new TextView(n7Var.getContext());
                    textView2.setTextSize(1, 14.0f);
                    textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, c6Var));
                    textView2.setText(a7.X(n7Var.f33260r));
                    textView2.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(12.0f));
                    textView2.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
                    int i12 = org.telegram.ui.ActionBar.g6.f19543a7;
                    textView2.setBackground(org.telegram.ui.ActionBar.g6.a0(org.telegram.ui.ActionBar.g6.w0(i12, c6Var2), org.telegram.ui.ActionBar.g6.v(org.telegram.ui.ActionBar.g6.w0(i12, c6Var2), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19690i6, c6Var2)), 10, 10));
                    textView2.setGravity(17);
                    frameLayout.addView(textView2, w7.z5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 7));
                    linearLayout.addView(frameLayout, w7.z5.t(-1, -2, 55, 0, 14, 0, 0));
                    w7.b6.b(textView2, 0.02f, 1.2f);
                    textView2.setOnClickListener(new m1(n7Var, a2VarArr, runnable2, 2));
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(n7Var.getContext(), 0, c6Var);
                    alertDialog$Builder2.n(linearLayout);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                    a2VarArr[0] = alertDialog$Builder2.o();
                    return;
                }
                return;
            default:
                di.d dVar = (di.d) obj3;
                z6 z6Var = (z6) obj2;
                j2 j2Var = (j2) obj;
                if (!dVar.N) {
                    dVar.setLoading(true);
                    z6Var.run(new p(dVar, j2Var, c6Var, 9));
                    return;
                }
                return;
        }
    }

    public e7(di.d dVar, z6 z6Var, j2 j2Var, org.telegram.ui.ActionBar.c6 c6Var) {
        this.d = dVar;
        this.f32876b = z6Var;
        this.e = j2Var;
        this.f32877c = c6Var;
    }

    public e7(n7 n7Var, Runnable runnable, org.telegram.ui.ActionBar.c6 c6Var, Runnable runnable2) {
        this.d = n7Var;
        this.f32876b = runnable;
        this.f32877c = c6Var;
        this.e = runnable2;
    }
}
