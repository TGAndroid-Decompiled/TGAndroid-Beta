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
public final class h40 extends bb {
    public final LinearLayout X;
    public j71 Y;

    public h40(Activity activity, org.telegram.ui.ActionBar.u6 u6Var, TLRPC.User user, TLObject tLObject, org.telegram.ui.xp xpVar) {
        super(activity, null, false, false, 1, u6Var);
        fixNavigationBar();
        LinearLayout linearLayout = new LinearLayout(activity);
        this.X = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(activity);
        org.telegram.ui.wz0 P = P(activity, AndroidUtilities.dp(60.0f), user);
        org.telegram.ui.wz0 P2 = P(activity, AndroidUtilities.dp(60.0f), tLObject);
        ImageView imageView = new ImageView(activity);
        imageView.setImageResource(R.drawable.msg_arrow_avatar);
        org.telegram.ui.ActionBar.f7.t(imageView, org.telegram.ui.ActionBar.y6.f23767z6, u6Var, PorterDuff.Mode.SRC_ATOP);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.setClipChildren(false);
        linearLayout2.addView(P, gb1.r(60, 60));
        linearLayout2.addView(imageView, gb1.x(24, 24, 16, 7, 0, 7, 0));
        linearLayout2.addView(P2, gb1.r(60, 60));
        frameLayout.addView(linearLayout2, gb1.i(-2, -2, 17));
        linearLayout.addView(frameLayout, gb1.x(-1, -2, 1, 0, 23, 0, 19));
        TextView textView = new TextView(activity);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        org.telegram.ui.d3.o(R.string.GuardBotReplaceTitle, textView, 1, 20.0f);
        int i10 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.f7.V(textView, i10, u6Var);
        linearLayout.addView(textView, gb1.x(-1, -2, 17, 20, 0, 20, 6));
        String shortName = DialogObject.getShortName(user);
        String shortName2 = DialogObject.getShortName(tLObject);
        TextView textView2 = new TextView(activity);
        textView2.setGravity(17);
        textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GuardBotReplaceMessage, shortName, shortName2)));
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.f7.V(textView2, i10, u6Var);
        textView2.setLineSpacing(AndroidUtilities.dp(2.66f), 1.0f);
        linearLayout.addView(textView2, gb1.x(-1, -2, 17, 24, 0, 24, 29));
        fi.d dVar = new fi.d(activity, u6Var, true);
        dVar.f();
        dVar.i(LocaleController.formatString(R.string.GuardBotReplaceUseNew, shortName2), false, true);
        dVar.setOnClickListener(new ga(18, this, xpVar));
        linearLayout.addView(dVar, gb1.o(14.0f, 0.0f, 14.0f, 10.0f, -1, 48));
        fi.d dVar2 = new fi.d(activity, u6Var, true);
        dVar2.f();
        dVar2.e();
        dVar2.i(LocaleController.formatString(R.string.GuardBotReplaceKeepCurrent, shortName), false, true);
        dVar2.setOnClickListener(new f0(this, 23));
        linearLayout.addView(dVar2, gb1.o(14.0f, 0.0f, 14.0f, 14.0f, -1, 48));
        mm0 mm0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i11, 0, i11, 0);
        this.Y.O(false);
    }

    public static org.telegram.ui.wz0 P(Context context, int i10, TLObject tLObject) {
        org.telegram.ui.wz0 wz0Var = new org.telegram.ui.wz0(context);
        wz0Var.setRoundRadius(i10 / 2);
        j9 j9Var = new j9((org.telegram.ui.ActionBar.u6) null);
        j9Var.p(tLObject);
        wz0Var.setImageDrawable(j9Var);
        wz0Var.setLayoutParams(new FrameLayout.LayoutParams(i10, i10));
        return wz0Var;
    }

    @Override
    public final lm0 v(mm0 mm0Var) {
        j71 j71Var = new j71(this.d, getContext(), this.currentAccount, 0, true, new d(this, 14), this.resourcesProvider);
        this.Y = j71Var;
        j71Var.f29507r = false;
        return j71Var;
    }

    @Override
    public final CharSequence y() {
        return "";
    }
}
