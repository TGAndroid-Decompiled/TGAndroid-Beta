package org.telegram.ui.Components;

import android.app.Activity;
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
public final class wp extends org.telegram.ui.ActionBar.f3 {
    public final Drawable f34473b;
    public final tp f34474c;
    public final vp d;
    public final boolean f34475e;
    public int f34476f;
    public final int[] h;
    public final int f34477n;
    public int f34478r;
    public boolean f34479s;
    public org.telegram.ui.va v;

    public wp(Activity activity, TLRPC.Chat chat) {
        super(activity, null, false, false);
        int i10;
        this.h = new int[2];
        this.f34475e = true;
        setApplyBottomPadding(false);
        TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(chat.f22392id);
        if (chatFull != null) {
            i10 = chatFull.ttl_period;
        } else {
            i10 = 0;
        }
        if (i10 == 0) {
            this.f34477n = 0;
            this.f34478r = 0;
        } else if (i10 == 86400) {
            this.f34477n = 1;
            this.f34478r = 1;
        } else if (i10 == 604800) {
            this.f34477n = 2;
            this.f34478r = 2;
        } else {
            this.f34477n = 3;
            this.f34478r = 3;
        }
        Drawable mutate = activity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f34473b = mutate;
        int i11 = org.telegram.ui.ActionBar.g6.f23133h5;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i11), PorterDuff.Mode.MULTIPLY));
        sp spVar = new sp(this, activity);
        spVar.setFillViewport(true);
        spVar.setWillNotDraw(false);
        spVar.setClipToPadding(false);
        int i12 = this.backgroundPaddingLeft;
        spVar.setPadding(i12, 0, i12, 0);
        this.containerView = spVar;
        tp tpVar = new tp(this, activity);
        this.f34474c = tpVar;
        tpVar.setOrientation(1);
        spVar.addView(tpVar, i7.f6.x(-1, -2, 80));
        setCustomView(tpVar);
        UserConfig.getInstance(this.currentAccount).getClientUserId();
        int i13 = MessagesController.getInstance(this.currentAccount).revokeTimeLimit;
        ?? imageView = new ImageView(activity);
        imageView.setAutoRepeat(false);
        imageView.f(R.raw.utyan_private, 120, 120, null);
        imageView.setPadding(0, AndroidUtilities.dp(20.0f), 0, 0);
        imageView.d();
        tpVar.addView((View) imageView, i7.f6.t(160, 160, 49, 17, 0, 17, 0));
        TextView textView = new TextView(activity);
        org.telegram.ui.b.g(24.0f, 1, textView);
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23169j5));
        textView.setText(LocaleController.getString(R.string.AutoDeleteAlertTitle));
        tpVar.addView(textView, i7.f6.t(-2, -2, 49, 17, 18, 17, 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23310r5));
        textView2.setGravity(1);
        if (ChatObject.isChannel(chat) && !chat.megagroup) {
            textView2.setText(LocaleController.getString(R.string.AutoDeleteAlertChannelInfo));
        } else {
            textView2.setText(LocaleController.getString(R.string.AutoDeleteAlertGroupInfo));
        }
        tpVar.addView(textView2, i7.f6.t(-2, -2, 49, 30, 22, 30, 20));
        lv0 lv0Var = new lv0(activity, null);
        lv0Var.setCallback(new up(this, spVar));
        lv0Var.b(this.f34477n, null, LocaleController.getString(R.string.AutoDeleteNever), LocaleController.getString(R.string.AutoDelete24Hours), LocaleController.getString(R.string.AutoDelete7Days), LocaleController.getString(R.string.AutoDelete1Month));
        tpVar.addView(lv0Var, i7.f6.k(0.0f, 8.0f, 0.0f, 0.0f, -1, -2));
        FrameLayout frameLayout = new FrameLayout(activity);
        jq jqVar = new jq(new ColorDrawable(getThemedColor(org.telegram.ui.ActionBar.g6.f23009a7)), org.telegram.ui.ActionBar.g6.V0(activity, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f23028b7));
        jqVar.f29792w = true;
        frameLayout.setBackgroundDrawable(jqVar);
        tpVar.addView(frameLayout, i7.f6.n(-1, -2));
        org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(activity, null);
        y8Var.setText(LocaleController.getString(R.string.AutoDeleteInfo));
        frameLayout.addView(y8Var);
        vp vpVar = new vp(activity);
        this.d = vpVar;
        vpVar.setBackgroundColor(getThemedColor(i11));
        vpVar.setText(LocaleController.getString(R.string.AutoDeleteSet));
        vpVar.f34162a.setOnClickListener(new h0(this, 9));
        frameLayout.addView(vpVar);
        p(false);
    }

    public static void m(wp wpVar) {
        float f9;
        View childAt = wpVar.f34474c.getChildAt(0);
        int[] iArr = wpVar.h;
        childAt.getLocationInWindow(iArr);
        int i10 = iArr[1];
        if (wpVar.f34475e) {
            f9 = 6.0f;
        } else {
            f9 = 19.0f;
        }
        int max = Math.max(i10 - AndroidUtilities.dp(f9), 0);
        if (wpVar.f34476f != max) {
            wpVar.f34476f = max;
            wpVar.containerView.invalidate();
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    public final void p(boolean z10) {
        int i10 = this.f34477n;
        int i11 = this.f34478r;
        vp vpVar = this.d;
        if (i10 == i11 && !this.f34475e) {
            if (z10) {
                vpVar.animate().alpha(0.0f).setDuration(180L).start();
                return;
            }
            vpVar.setVisibility(4);
            vpVar.setAlpha(0.0f);
            return;
        }
        vpVar.setVisibility(0);
        if (z10) {
            vpVar.animate().alpha(1.0f).setDuration(180L).start();
        } else {
            vpVar.setAlpha(1.0f);
        }
    }
}
