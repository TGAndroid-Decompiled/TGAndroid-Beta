package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class mq extends org.telegram.ui.ActionBar.f3 {
    public final Drawable f28575b;
    public final jq f28576c;
    public final lq d;
    public final boolean e;
    public int f28577f;
    public final int[] h;
    public final int f28578n;
    public int f28579r;
    public boolean f28580s;
    public org.telegram.ui.fb v;

    public mq(Activity activity, TLRPC.Chat chat) {
        super(1, (Context) activity, (org.telegram.ui.ActionBar.d6) null, false);
        int i10;
        this.h = new int[2];
        this.e = true;
        setApplyBottomPadding(false);
        TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(chat.f20279id);
        if (chatFull != null) {
            i10 = chatFull.ttl_period;
        } else {
            i10 = 0;
        }
        if (i10 == 0) {
            this.f28578n = 0;
            this.f28579r = 0;
        } else if (i10 == 86400) {
            this.f28578n = 1;
            this.f28579r = 1;
        } else if (i10 == 604800) {
            this.f28578n = 2;
            this.f28579r = 2;
        } else {
            this.f28578n = 3;
            this.f28579r = 3;
        }
        Drawable mutate = activity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f28575b = mutate;
        int i11 = org.telegram.ui.ActionBar.h6.f21064h5;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i11), PorterDuff.Mode.MULTIPLY));
        iq iqVar = new iq(this, activity);
        iqVar.setFillViewport(true);
        iqVar.setWillNotDraw(false);
        iqVar.setClipToPadding(false);
        int i12 = this.backgroundPaddingLeft;
        iqVar.setPadding(i12, 0, i12, 0);
        this.containerView = iqVar;
        jq jqVar = new jq(this, activity);
        this.f28576c = jqVar;
        jqVar.setOrientation(1);
        iqVar.addView(jqVar, w7.z5.x(-1, -2, 80));
        setCustomView(jqVar);
        UserConfig.getInstance(this.currentAccount).getClientUserId();
        int i13 = MessagesController.getInstance(this.currentAccount).revokeTimeLimit;
        ?? imageView = new ImageView(activity);
        imageView.setAutoRepeat(false);
        imageView.f(R.raw.utyan_private, 120, 120, null);
        imageView.setPadding(0, AndroidUtilities.dp(20.0f), 0, 0);
        imageView.d();
        jqVar.addView((View) imageView, w7.z5.t(160, 160, 49, 17, 0, 17, 0));
        TextView textView = new TextView(activity);
        org.telegram.messenger.kk.k(24.0f, 1, textView);
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21099j5));
        textView.setText(LocaleController.getString(R.string.AutoDeleteAlertTitle));
        jqVar.addView(textView, w7.z5.t(-2, -2, 49, 17, 18, 17, 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21249r5));
        textView2.setGravity(1);
        if (ChatObject.isChannel(chat) && !chat.megagroup) {
            textView2.setText(LocaleController.getString(R.string.AutoDeleteAlertChannelInfo));
        } else {
            textView2.setText(LocaleController.getString(R.string.AutoDeleteAlertGroupInfo));
        }
        jqVar.addView(textView2, w7.z5.t(-2, -2, 49, 30, 22, 30, 20));
        nw0 nw0Var = new nw0(activity, null);
        nw0Var.setCallback(new kq(this, iqVar));
        nw0Var.b(this.f28578n, null, LocaleController.getString(R.string.AutoDeleteNever), LocaleController.getString(R.string.AutoDelete24Hours), LocaleController.getString(R.string.AutoDelete7Days), LocaleController.getString(R.string.AutoDelete1Month));
        jqVar.addView(nw0Var, w7.z5.k(0.0f, 8.0f, 0.0f, 0.0f, -1, -2));
        FrameLayout frameLayout = new FrameLayout(activity);
        zq zqVar = new zq(new ColorDrawable(getThemedColor(org.telegram.ui.ActionBar.h6.f20935a7)), org.telegram.ui.ActionBar.h6.W0(activity, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.f20955b7));
        zqVar.f33006w = true;
        frameLayout.setBackgroundDrawable(zqVar);
        jqVar.addView(frameLayout, w7.z5.n(-1, -2));
        org.telegram.ui.Cells.d9 d9Var = new org.telegram.ui.Cells.d9(activity, null);
        d9Var.setText(LocaleController.getString(R.string.AutoDeleteInfo));
        frameLayout.addView(d9Var);
        lq lqVar = new lq(activity);
        this.d = lqVar;
        lqVar.setBackgroundColor(getThemedColor(i11));
        lqVar.setText(LocaleController.getString(R.string.AutoDeleteSet));
        lqVar.f28305a.setOnClickListener(new f0(this, 8));
        frameLayout.addView(lqVar);
        q(false);
    }

    public static void n(mq mqVar) {
        float f7;
        View childAt = mqVar.f28576c.getChildAt(0);
        int[] iArr = mqVar.h;
        childAt.getLocationInWindow(iArr);
        int i10 = iArr[1];
        if (mqVar.e) {
            f7 = 6.0f;
        } else {
            f7 = 19.0f;
        }
        int max = Math.max(i10 - AndroidUtilities.dp(f7), 0);
        if (mqVar.f28577f != max) {
            mqVar.f28577f = max;
            mqVar.containerView.invalidate();
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    public final void q(boolean z10) {
        int i10 = this.f28578n;
        int i11 = this.f28579r;
        lq lqVar = this.d;
        if (i10 == i11 && !this.e) {
            if (z10) {
                lqVar.animate().alpha(0.0f).setDuration(180L).start();
                return;
            }
            lqVar.setVisibility(4);
            lqVar.setAlpha(0.0f);
            return;
        }
        lqVar.setVisibility(0);
        if (z10) {
            lqVar.animate().alpha(1.0f).setDuration(180L).start();
        } else {
            lqVar.setAlpha(1.0f);
        }
    }
}
