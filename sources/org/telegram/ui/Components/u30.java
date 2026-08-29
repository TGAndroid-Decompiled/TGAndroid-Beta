package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class u30 extends xa {
    public final LinearLayout T;
    public k51 U;

    public u30(Activity activity, org.telegram.ui.ActionBar.c6 c6Var, TLRPC.User user, TLObject tLObject, org.telegram.ui.tp tpVar) {
        super(activity, null, false, false, false, false, false, 1, c6Var);
        fixNavigationBar();
        LinearLayout linearLayout = new LinearLayout(activity);
        this.T = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(activity);
        org.telegram.ui.iz0 P = P(activity, AndroidUtilities.dp(60.0f), user);
        org.telegram.ui.iz0 P2 = P(activity, AndroidUtilities.dp(60.0f), tLObject);
        ImageView imageView = new ImageView(activity);
        imageView.setImageResource(R.drawable.msg_arrow_avatar);
        imageView.setColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23450z6, c6Var));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.setClipChildren(false);
        linearLayout2.addView(P, i7.f6.n(60, 60));
        linearLayout2.addView(imageView, i7.f6.t(24, 24, 16, 7, 0, 7, 0));
        linearLayout2.addView(P2, i7.f6.n(60, 60));
        frameLayout.addView(linearLayout2, i7.f6.e(-2, -2, 17));
        linearLayout.addView(frameLayout, i7.f6.t(-1, -2, 1, 0, 23, 0, 19));
        TextView textView = new TextView(activity);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.GuardBotReplaceTitle));
        textView.setTextSize(1, 20.0f);
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        linearLayout.addView(textView, i7.f6.t(-1, -2, 17, 20, 0, 20, 6));
        String shortName = DialogObject.getShortName(user);
        String shortName2 = DialogObject.getShortName(tLObject);
        TextView textView2 = new TextView(activity);
        textView2.setGravity(17);
        textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GuardBotReplaceMessage, shortName, shortName2)));
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        textView2.setLineSpacing(AndroidUtilities.dp(2.66f), 1.0f);
        linearLayout.addView(textView2, i7.f6.t(-1, -2, 17, 24, 0, 24, 29));
        nh.d dVar = new nh.d(activity, c6Var, true);
        dVar.e();
        dVar.g(LocaleController.formatString(R.string.GuardBotReplaceUseNew, shortName2), false, true);
        dVar.setOnClickListener(new t2(24, this, tpVar));
        linearLayout.addView(dVar, i7.f6.k(14.0f, 0.0f, 14.0f, 10.0f, -1, 48));
        nh.d dVar2 = new nh.d(activity, c6Var, true);
        dVar2.e();
        dVar2.d();
        dVar2.g(LocaleController.formatString(R.string.GuardBotReplaceKeepCurrent, shortName), false, true);
        dVar2.setOnClickListener(new h0(this, 24));
        linearLayout.addView(dVar2, i7.f6.k(14.0f, 0.0f, 14.0f, 14.0f, -1, 48));
        jl0 jl0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        jl0Var.setPadding(i11, 0, i11, 0);
        this.U.N(false);
    }

    public static org.telegram.ui.iz0 P(Context context, int i10, TLObject tLObject) {
        org.telegram.ui.iz0 iz0Var = new org.telegram.ui.iz0(context);
        iz0Var.setRoundRadius(i10 / 2);
        e9 e9Var = new e9((org.telegram.ui.ActionBar.c6) null);
        e9Var.p(tLObject);
        iz0Var.setImageDrawable(e9Var);
        iz0Var.setLayoutParams(new FrameLayout.LayoutParams(i10, i10));
        return iz0Var;
    }

    @Override
    public final il0 v(jl0 jl0Var) {
        k51 k51Var = new k51(this.d, getContext(), this.currentAccount, 0, true, new d(this, 14), this.resourcesProvider);
        this.U = k51Var;
        k51Var.f29939r = false;
        return k51Var;
    }

    @Override
    public final CharSequence y() {
        return "";
    }
}
