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
public final class w30 extends ab {
    public final LinearLayout X;
    public k61 Y;

    public w30(Activity activity, org.telegram.ui.ActionBar.f6 f6Var, TLRPC.User user, TLObject tLObject, org.telegram.ui.dq dqVar) {
        super(activity, null, false, false, 1, f6Var);
        fixNavigationBar();
        LinearLayout linearLayout = new LinearLayout(activity);
        this.X = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(activity);
        org.telegram.ui.m01 P = P(activity, AndroidUtilities.dp(60.0f), user);
        org.telegram.ui.m01 P2 = P(activity, AndroidUtilities.dp(60.0f), tLObject);
        ImageView imageView = new ImageView(activity);
        imageView.setImageResource(R.drawable.msg_arrow_avatar);
        imageView.setColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19496z6, f6Var));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.setClipChildren(false);
        linearLayout2.addView(P, w7.y5.n(60, 60));
        linearLayout2.addView(imageView, w7.y5.t(24, 24, 16, 7, 0, 7, 0));
        linearLayout2.addView(P2, w7.y5.n(60, 60));
        frameLayout.addView(linearLayout2, w7.y5.e(-2, -2, 17));
        linearLayout.addView(frameLayout, w7.y5.t(-1, -2, 1, 0, 23, 0, 19));
        TextView textView = new TextView(activity);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.GuardBotReplaceTitle));
        textView.setTextSize(1, 20.0f);
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        linearLayout.addView(textView, w7.y5.t(-1, -2, 17, 20, 0, 20, 6));
        String shortName = DialogObject.getShortName(user);
        String shortName2 = DialogObject.getShortName(tLObject);
        TextView textView2 = new TextView(activity);
        textView2.setGravity(17);
        textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GuardBotReplaceMessage, shortName, shortName2)));
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        textView2.setLineSpacing(AndroidUtilities.dp(2.66f), 1.0f);
        linearLayout.addView(textView2, w7.y5.t(-1, -2, 17, 24, 0, 24, 29));
        ci.d dVar = new ci.d(activity, f6Var, true);
        dVar.e();
        dVar.g(LocaleController.formatString(R.string.GuardBotReplaceUseNew, shortName2), false, true);
        dVar.setOnClickListener(new dt(6, this, dqVar));
        linearLayout.addView(dVar, w7.y5.k(14.0f, 0.0f, 14.0f, 10.0f, -1, 48));
        ci.d dVar2 = new ci.d(activity, f6Var, true);
        dVar2.e();
        dVar2.d();
        dVar2.g(LocaleController.formatString(R.string.GuardBotReplaceKeepCurrent, shortName), false, true);
        dVar2.setOnClickListener(new f0(this, 24));
        linearLayout.addView(dVar2, w7.y5.k(14.0f, 0.0f, 14.0f, 14.0f, -1, 48));
        vl0 vl0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        vl0Var.setPadding(i11, 0, i11, 0);
        this.Y.N(false);
    }

    public static org.telegram.ui.m01 P(Context context, int i10, TLObject tLObject) {
        org.telegram.ui.m01 m01Var = new org.telegram.ui.m01(context);
        m01Var.setRoundRadius(i10 / 2);
        g9 g9Var = new g9((org.telegram.ui.ActionBar.f6) null);
        g9Var.p(tLObject);
        m01Var.setImageDrawable(g9Var);
        m01Var.setLayoutParams(new FrameLayout.LayoutParams(i10, i10));
        return m01Var;
    }

    @Override
    public final ul0 v(vl0 vl0Var) {
        k61 k61Var = new k61(this.d, getContext(), this.currentAccount, 0, true, new d(this, 14), this.resourcesProvider);
        this.Y = k61Var;
        k61Var.f25678r = false;
        return k61Var;
    }

    @Override
    public final CharSequence y() {
        return "";
    }
}
