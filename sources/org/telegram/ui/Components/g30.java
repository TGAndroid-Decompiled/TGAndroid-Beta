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
public final class g30 extends sa {
    public final LinearLayout T;
    public z41 U;

    public g30(Activity activity, org.telegram.ui.ActionBar.b6 b6Var, TLRPC.User user, TLObject tLObject, org.telegram.ui.qp qpVar) {
        super(activity, null, false, false, false, false, false, 1, b6Var);
        fixNavigationBar();
        LinearLayout linearLayout = new LinearLayout(activity);
        this.T = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(activity);
        org.telegram.ui.iz0 O = O(activity, AndroidUtilities.dp(60.0f), user);
        org.telegram.ui.iz0 O2 = O(activity, AndroidUtilities.dp(60.0f), tLObject);
        ImageView imageView = new ImageView(activity);
        imageView.setImageResource(R.drawable.msg_arrow_avatar);
        imageView.setColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23386z6, b6Var));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.setClipChildren(false);
        linearLayout2.addView(O, g7.e6.n(60, 60));
        linearLayout2.addView(imageView, g7.e6.t(24, 24, 16, 7, 0, 7, 0));
        linearLayout2.addView(O2, g7.e6.n(60, 60));
        frameLayout.addView(linearLayout2, g7.e6.e(-2, -2, 17));
        linearLayout.addView(frameLayout, g7.e6.t(-1, -2, 1, 0, 23, 0, 19));
        TextView textView = new TextView(activity);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.GuardBotReplaceTitle));
        textView.setTextSize(1, 20.0f);
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        linearLayout.addView(textView, g7.e6.t(-1, -2, 17, 20, 0, 20, 6));
        String shortName = DialogObject.getShortName(user);
        String shortName2 = DialogObject.getShortName(tLObject);
        TextView textView2 = new TextView(activity);
        textView2.setGravity(17);
        textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GuardBotReplaceMessage, shortName, shortName2)));
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        textView2.setLineSpacing(AndroidUtilities.dp(2.66f), 1.0f);
        linearLayout.addView(textView2, g7.e6.t(-1, -2, 17, 24, 0, 24, 29));
        kh.d dVar = new kh.d(activity, b6Var, true);
        dVar.e();
        dVar.g(LocaleController.formatString(R.string.GuardBotReplaceUseNew, shortName2), false, true);
        dVar.setOnClickListener(new s2(23, this, qpVar));
        linearLayout.addView(dVar, g7.e6.k(14.0f, 0.0f, 14.0f, 10.0f, -1, 48));
        kh.d dVar2 = new kh.d(activity, b6Var, true);
        dVar2.e();
        dVar2.d();
        dVar2.g(LocaleController.formatString(R.string.GuardBotReplaceKeepCurrent, shortName), false, true);
        dVar2.setOnClickListener(new f0(this, 24));
        linearLayout.addView(dVar2, g7.e6.k(14.0f, 0.0f, 14.0f, 14.0f, -1, 48));
        wk0 wk0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        wk0Var.setPadding(i10, 0, i10, 0);
        this.U.N(false);
    }

    public static org.telegram.ui.iz0 O(Context context, int i9, TLObject tLObject) {
        org.telegram.ui.iz0 iz0Var = new org.telegram.ui.iz0(context);
        iz0Var.setRoundRadius(i9 / 2);
        z8 z8Var = new z8((org.telegram.ui.ActionBar.b6) null);
        z8Var.p(tLObject);
        iz0Var.setImageDrawable(z8Var);
        iz0Var.setLayoutParams(new FrameLayout.LayoutParams(i9, i9));
        return iz0Var;
    }

    @Override
    public final vk0 v(wk0 wk0Var) {
        z41 z41Var = new z41(this.d, getContext(), this.currentAccount, 0, true, new d(this, 14), this.resourcesProvider);
        this.U = z41Var;
        z41Var.f35188r = false;
        return z41Var;
    }

    @Override
    public final CharSequence y() {
        return "";
    }
}
