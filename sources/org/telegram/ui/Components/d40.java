package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
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
public final class d40 extends za {
    public final LinearLayout X;
    public a71 Y;

    public d40(Activity activity, org.telegram.ui.ActionBar.g6 g6Var, TLRPC.User user, TLObject tLObject, org.telegram.ui.tp tpVar) {
        super(activity, null, false, false, 1, g6Var);
        fixNavigationBar();
        LinearLayout linearLayout = new LinearLayout(activity);
        this.X = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(activity);
        org.telegram.ui.rz0 P = P(activity, AndroidUtilities.dp(60.0f), user);
        org.telegram.ui.rz0 P2 = P(activity, AndroidUtilities.dp(60.0f), tLObject);
        ImageView imageView = new ImageView(activity);
        imageView.setImageResource(R.drawable.msg_arrow_avatar);
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.f21589z6, g6Var, PorterDuff.Mode.SRC_ATOP);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.setClipChildren(false);
        linearLayout2.addView(P, w7.z5.n(60, 60));
        linearLayout2.addView(imageView, w7.z5.t(24, 24, 16, 7, 0, 7, 0));
        linearLayout2.addView(P2, w7.z5.n(60, 60));
        frameLayout.addView(linearLayout2, w7.z5.e(-2, -2, 17));
        linearLayout.addView(frameLayout, w7.z5.t(-1, -2, 1, 0, 23, 0, 19));
        TextView textView = new TextView(activity);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        org.telegram.messenger.tl.n(R.string.GuardBotReplaceTitle, textView, 1, 20.0f);
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.W(textView, i10, g6Var);
        linearLayout.addView(textView, w7.z5.t(-1, -2, 17, 20, 0, 20, 6));
        String shortName = DialogObject.getShortName(user);
        String shortName2 = DialogObject.getShortName(tLObject);
        TextView textView2 = new TextView(activity);
        textView2.setGravity(17);
        textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GuardBotReplaceMessage, shortName, shortName2)));
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.W(textView2, i10, g6Var);
        textView2.setLineSpacing(AndroidUtilities.dp(2.66f), 1.0f);
        linearLayout.addView(textView2, w7.z5.t(-1, -2, 17, 24, 0, 24, 29));
        ei.d dVar = new ei.d(activity, g6Var, true);
        dVar.f();
        dVar.i(LocaleController.formatString(R.string.GuardBotReplaceUseNew, shortName2), false, true);
        dVar.setOnClickListener(new aa(17, this, tpVar));
        linearLayout.addView(dVar, w7.z5.k(14.0f, 0.0f, 14.0f, 10.0f, -1, 48));
        ei.d dVar2 = new ei.d(activity, g6Var, true);
        dVar2.f();
        dVar2.e();
        dVar2.i(LocaleController.formatString(R.string.GuardBotReplaceKeepCurrent, shortName), false, true);
        dVar2.setOnClickListener(new f0(this, 23));
        linearLayout.addView(dVar2, w7.z5.k(14.0f, 0.0f, 14.0f, 14.0f, -1, 48));
        lm0 lm0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        lm0Var.setPadding(i11, 0, i11, 0);
        this.Y.N(false);
    }

    public static org.telegram.ui.rz0 P(Context context, int i10, TLObject tLObject) {
        org.telegram.ui.rz0 rz0Var = new org.telegram.ui.rz0(context);
        rz0Var.setRoundRadius(i10 / 2);
        f9 f9Var = new f9((org.telegram.ui.ActionBar.g6) null);
        f9Var.p(tLObject);
        rz0Var.setImageDrawable(f9Var);
        rz0Var.setLayoutParams(new FrameLayout.LayoutParams(i10, i10));
        return rz0Var;
    }

    @Override
    public final km0 w(lm0 lm0Var) {
        a71 a71Var = new a71(this.d, getContext(), this.currentAccount, 0, true, new d(this, 14), this.resourcesProvider);
        this.Y = a71Var;
        a71Var.f24646r = false;
        return a71Var;
    }

    @Override
    public final CharSequence z() {
        return "";
    }
}
