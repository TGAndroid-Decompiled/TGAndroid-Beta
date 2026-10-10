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
import org.telegram.messenger.bi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.fa0;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.y9;
import org.telegram.ui.ii1;
import org.telegram.ui.ls0;
public final class f7 implements View.OnClickListener {
    public final int f34967a = 0;
    public final Object f34968b;
    public final org.telegram.ui.ActionBar.e6 f34969c;
    public final Object d;
    public final Object f34970e;

    public f7(Context context, org.telegram.ui.ActionBar.e6 e6Var, Runnable runnable, org.telegram.ui.ActionBar.f3 f3Var) {
        this.d = context;
        this.f34969c = e6Var;
        this.f34968b = runnable;
        this.f34970e = f3Var;
    }

    @Override
    public final void onClick(View view) {
        float f7;
        int i10 = this.f34967a;
        org.telegram.ui.ActionBar.e6 e6Var = this.f34969c;
        Object obj = this.f34970e;
        Object obj2 = this.f34968b;
        Object obj3 = this.d;
        switch (i10) {
            case 0:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context) obj3, 0, e6Var);
                String string = LocaleController.getString(R.string.WalletDeleteWalletTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20378a;
                b2Var.R = string;
                b2Var.T = LocaleController.getString(R.string.WalletDeleteWalletInfo);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ls0(23, (Runnable) obj2, (org.telegram.ui.ActionBar.f3) obj));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
            case 1:
                o7 o7Var = (o7) obj3;
                Runnable runnable = (Runnable) obj2;
                Runnable runnable2 = (Runnable) obj;
                org.telegram.ui.ActionBar.e6 e6Var2 = o7Var.f35395a;
                if (!TextUtils.isEmpty(o7Var.f35401r) && o7Var.f35400n != null) {
                    org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
                    LinearLayout linearLayout = new LinearLayout(o7Var.getContext());
                    linearLayout.setOrientation(1);
                    linearLayout.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                    TLRPC.User user = o7Var.f35400n;
                    if (user != null) {
                        String forcedFirstName = UserObject.getForcedFirstName(user);
                        LinearLayout linearLayout2 = new LinearLayout(o7Var.getContext());
                        linearLayout2.setOrientation(0);
                        f7 = 4.0f;
                        linearLayout2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                        y9 y9Var = new y9(o7Var.getContext());
                        y9Var.setRoundRadius(AndroidUtilities.dp(15.0f));
                        j9 j9Var = new j9((org.telegram.ui.ActionBar.e6) null);
                        j9Var.r(o7Var.f35400n);
                        y9Var.e(o7Var.f35400n, j9Var);
                        linearLayout2.addView(y9Var, w7.x5.q(30, 30, 16));
                        TextView textView = new TextView(o7Var.getContext());
                        int i11 = org.telegram.ui.ActionBar.i6.G6;
                        bi.o(i11, e6Var2, textView, 1, 20.0f);
                        textView.setText(LocaleController.formatString(R.string.WalletUserWallet, forcedFirstName));
                        textView.setTypeface(AndroidUtilities.bold());
                        textView.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                        linearLayout2.addView(textView, w7.x5.t(-1, -2, 16, 9, 0, 0, 0));
                        linearLayout.addView(linearLayout2, w7.x5.q(-1, -2, 55));
                        fa0 fa0Var = new fa0(o7Var.getContext(), null);
                        fa0Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var2));
                        fa0Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.gc, e6Var2));
                        fa0Var.setTextSize(1, 16.0f);
                        fa0Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                        fa0Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.WalletAddressLinkedToUser, UserObject.getUserName(o7Var.f35400n)), new ii1(18, b2VarArr, runnable)));
                        linearLayout.addView(fa0Var, w7.x5.t(-1, -2, 55, 0, 14, 0, 0));
                    } else {
                        f7 = 4.0f;
                    }
                    FrameLayout frameLayout = new FrameLayout(o7Var.getContext());
                    frameLayout.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
                    TextView textView2 = new TextView(o7Var.getContext());
                    textView2.setTextSize(1, 14.0f);
                    textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var));
                    textView2.setText(b7.X(o7Var.f35401r));
                    textView2.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(12.0f));
                    textView2.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
                    int i12 = org.telegram.ui.ActionBar.i6.f20745a7;
                    textView2.setBackground(org.telegram.ui.ActionBar.i6.a0(org.telegram.ui.ActionBar.i6.w0(i12, e6Var2), org.telegram.ui.ActionBar.i6.v(org.telegram.ui.ActionBar.i6.w0(i12, e6Var2), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20892i6, e6Var2)), 10, 10));
                    textView2.setGravity(17);
                    frameLayout.addView(textView2, w7.x5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 7));
                    linearLayout.addView(frameLayout, w7.x5.t(-1, -2, 55, 0, 14, 0, 0));
                    w7.z5.b(textView2, 0.02f, 1.2f);
                    textView2.setOnClickListener(new m1(o7Var, b2VarArr, runnable2, 2));
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(o7Var.getContext(), 0, e6Var);
                    alertDialog$Builder2.n(linearLayout);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                    b2VarArr[0] = alertDialog$Builder2.o();
                    return;
                }
                return;
            default:
                ci.d dVar = (ci.d) obj3;
                a7 a7Var = (a7) obj2;
                j2 j2Var = (j2) obj;
                if (!dVar.N) {
                    dVar.setLoading(true);
                    a7Var.run(new p(dVar, j2Var, e6Var, 9));
                    return;
                }
                return;
        }
    }

    public f7(ci.d dVar, a7 a7Var, j2 j2Var, org.telegram.ui.ActionBar.e6 e6Var) {
        this.d = dVar;
        this.f34968b = a7Var;
        this.f34970e = j2Var;
        this.f34969c = e6Var;
    }

    public f7(o7 o7Var, Runnable runnable, org.telegram.ui.ActionBar.e6 e6Var, Runnable runnable2) {
        this.d = o7Var;
        this.f34968b = runnable;
        this.f34969c = e6Var;
        this.f34970e = runnable2;
    }
}
