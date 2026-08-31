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
public final class a40 extends sa {
    public final LinearLayout U;
    public x51 V;

    public a40(Activity activity, org.telegram.ui.ActionBar.g6 g6Var, TLRPC.User user, TLObject tLObject, org.telegram.ui.aq aqVar) {
        super(activity, null, false, false, false, false, false, 1, g6Var);
        fixNavigationBar();
        LinearLayout linearLayout = new LinearLayout(activity);
        this.U = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(activity);
        org.telegram.ui.vz0 P = P(activity, AndroidUtilities.dp(60.0f), user);
        org.telegram.ui.vz0 P2 = P(activity, AndroidUtilities.dp(60.0f), tLObject);
        ImageView imageView = new ImageView(activity);
        imageView.setImageResource(R.drawable.msg_arrow_avatar);
        imageView.setColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f22053z6, g6Var));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.setClipChildren(false);
        linearLayout2.addView(P, k7.c6.n(60, 60));
        linearLayout2.addView(imageView, k7.c6.t(24, 24, 16, 7, 0, 7, 0));
        linearLayout2.addView(P2, k7.c6.n(60, 60));
        frameLayout.addView(linearLayout2, k7.c6.e(-2, -2, 17));
        linearLayout.addView(frameLayout, k7.c6.t(-1, -2, 1, 0, 23, 0, 19));
        TextView textView = new TextView(activity);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.GuardBotReplaceTitle));
        textView.setTextSize(1, 20.0f);
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
        linearLayout.addView(textView, k7.c6.t(-1, -2, 17, 20, 0, 20, 6));
        String shortName = DialogObject.getShortName(user);
        String shortName2 = DialogObject.getShortName(tLObject);
        TextView textView2 = new TextView(activity);
        textView2.setGravity(17);
        textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GuardBotReplaceMessage, shortName, shortName2)));
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
        textView2.setLineSpacing(AndroidUtilities.dp(2.66f), 1.0f);
        linearLayout.addView(textView2, k7.c6.t(-1, -2, 17, 24, 0, 24, 29));
        qh.d dVar = new qh.d(activity, g6Var, true);
        dVar.e();
        dVar.g(LocaleController.formatString(R.string.GuardBotReplaceUseNew, shortName2), false, true);
        dVar.setOnClickListener(new w2(21, this, aqVar));
        linearLayout.addView(dVar, k7.c6.k(14.0f, 0.0f, 14.0f, 10.0f, -1, 48));
        qh.d dVar2 = new qh.d(activity, g6Var, true);
        dVar2.e();
        dVar2.d();
        dVar2.g(LocaleController.formatString(R.string.GuardBotReplaceKeepCurrent, shortName), false, true);
        dVar2.setOnClickListener(new g0(this, 24));
        linearLayout.addView(dVar2, k7.c6.k(14.0f, 0.0f, 14.0f, 14.0f, -1, 48));
        tl0 tl0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        tl0Var.setPadding(i11, 0, i11, 0);
        this.V.N(false);
    }

    public static org.telegram.ui.vz0 P(Context context, int i10, TLObject tLObject) {
        org.telegram.ui.vz0 vz0Var = new org.telegram.ui.vz0(context);
        vz0Var.setRoundRadius(i10 / 2);
        z8 z8Var = new z8((org.telegram.ui.ActionBar.g6) null);
        z8Var.p(tLObject);
        vz0Var.setImageDrawable(z8Var);
        vz0Var.setLayoutParams(new FrameLayout.LayoutParams(i10, i10));
        return vz0Var;
    }

    @Override
    public final sl0 v(tl0 tl0Var) {
        x51 x51Var = new x51(this.d, getContext(), this.currentAccount, 0, true, new d(this, 14), this.resourcesProvider);
        this.V = x51Var;
        x51Var.f32957r = false;
        return x51Var;
    }

    @Override
    public final CharSequence y() {
        return "";
    }
}
