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
public final class q40 extends db {
    public final LinearLayout X;
    public h71 Y;

    public q40(Activity activity, org.telegram.ui.ActionBar.c6 c6Var, TLRPC.User user, TLObject tLObject, org.telegram.ui.gq gqVar) {
        super(activity, null, false, false, 1, c6Var);
        fixNavigationBar();
        LinearLayout linearLayout = new LinearLayout(activity);
        this.X = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(activity);
        org.telegram.ui.n01 Q = Q(activity, AndroidUtilities.dp(60.0f), user);
        org.telegram.ui.n01 Q2 = Q(activity, AndroidUtilities.dp(60.0f), tLObject);
        ImageView imageView = new ImageView(activity);
        imageView.setImageResource(R.drawable.msg_arrow_avatar);
        imageView.setColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20963z6, c6Var));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.setClipChildren(false);
        linearLayout2.addView(Q, w7.w5.n(60, 60));
        linearLayout2.addView(imageView, w7.w5.t(24, 24, 16, 7, 0, 7, 0));
        linearLayout2.addView(Q2, w7.w5.n(60, 60));
        frameLayout.addView(linearLayout2, w7.w5.e(-2, -2, 17));
        linearLayout.addView(frameLayout, w7.w5.t(-1, -2, 1, 0, 23, 0, 19));
        TextView textView = new TextView(activity);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        org.telegram.messenger.am.j(20.0f, R.string.GuardBotReplaceTitle, 1, textView);
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(i10, c6Var));
        linearLayout.addView(textView, w7.w5.t(-1, -2, 17, 20, 0, 20, 6));
        String shortName = DialogObject.getShortName(user);
        String shortName2 = DialogObject.getShortName(tLObject);
        TextView textView2 = new TextView(activity);
        textView2.setGravity(17);
        textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GuardBotReplaceMessage, shortName, shortName2)));
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(i10, c6Var));
        textView2.setLineSpacing(AndroidUtilities.dp(2.66f), 1.0f);
        linearLayout.addView(textView2, w7.w5.t(-1, -2, 17, 24, 0, 24, 29));
        ci.d dVar = new ci.d(activity, c6Var, true);
        dVar.e();
        dVar.g(LocaleController.formatString(R.string.GuardBotReplaceUseNew, shortName2), false, true);
        dVar.setOnClickListener(new wt(6, this, gqVar));
        linearLayout.addView(dVar, w7.w5.k(14.0f, 0.0f, 14.0f, 10.0f, -1, 48));
        ci.d dVar2 = new ci.d(activity, c6Var, true);
        dVar2.e();
        dVar2.d();
        dVar2.g(LocaleController.formatString(R.string.GuardBotReplaceKeepCurrent, shortName), false, true);
        dVar2.setOnClickListener(new f0(this, 23));
        linearLayout.addView(dVar2, w7.w5.k(14.0f, 0.0f, 14.0f, 14.0f, -1, 48));
        wm0 wm0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        wm0Var.setPadding(i11, 0, i11, 0);
        this.Y.N(false);
    }

    public static org.telegram.ui.n01 Q(Context context, int i10, TLObject tLObject) {
        org.telegram.ui.n01 n01Var = new org.telegram.ui.n01(context);
        n01Var.setRoundRadius(i10 / 2);
        j9 j9Var = new j9((org.telegram.ui.ActionBar.c6) null);
        j9Var.p(tLObject);
        n01Var.setImageDrawable(j9Var);
        n01Var.setLayoutParams(new FrameLayout.LayoutParams(i10, i10));
        return n01Var;
    }

    @Override
    public final CharSequence A() {
        return "";
    }

    @Override
    public final vm0 x(wm0 wm0Var) {
        h71 h71Var = new h71(this.d, getContext(), this.currentAccount, 0, true, new d(this, 14), this.resourcesProvider);
        this.Y = h71Var;
        h71Var.f26675r = false;
        return h71Var;
    }
}
