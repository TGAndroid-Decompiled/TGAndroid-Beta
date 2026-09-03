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
public final class zp extends org.telegram.ui.ActionBar.g3 {
    public final Drawable f31447b;
    public final wp f31448c;
    public final yp d;
    public final boolean e;
    public int f31449f;
    public final int[] h;
    public final int f31450n;
    public int f31451r;
    public boolean f31452s;
    public org.telegram.ui.bb v;

    public zp(Activity activity, TLRPC.Chat chat) {
        super(activity, null, false, false);
        int i10;
        this.h = new int[2];
        this.e = true;
        setApplyBottomPadding(false);
        TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(chat.f19159id);
        if (chatFull != null) {
            i10 = chatFull.ttl_period;
        } else {
            i10 = 0;
        }
        if (i10 == 0) {
            this.f31450n = 0;
            this.f31451r = 0;
        } else if (i10 == 86400) {
            this.f31450n = 1;
            this.f31451r = 1;
        } else if (i10 == 604800) {
            this.f31450n = 2;
            this.f31451r = 2;
        } else {
            this.f31450n = 3;
            this.f31451r = 3;
        }
        Drawable mutate = activity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f31447b = mutate;
        int i11 = org.telegram.ui.ActionBar.j6.f19952h5;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i11), PorterDuff.Mode.MULTIPLY));
        vp vpVar = new vp(this, activity);
        vpVar.setFillViewport(true);
        vpVar.setWillNotDraw(false);
        vpVar.setClipToPadding(false);
        int i12 = this.backgroundPaddingLeft;
        vpVar.setPadding(i12, 0, i12, 0);
        this.containerView = vpVar;
        wp wpVar = new wp(this, activity);
        this.f31448c = wpVar;
        wpVar.setOrientation(1);
        vpVar.addView(wpVar, k7.b6.x(-1, -2, 80));
        setCustomView(wpVar);
        UserConfig.getInstance(this.currentAccount).getClientUserId();
        int i13 = MessagesController.getInstance(this.currentAccount).revokeTimeLimit;
        ?? imageView = new ImageView(activity);
        imageView.setAutoRepeat(false);
        imageView.f(R.raw.utyan_private, 120, 120, null);
        imageView.setPadding(0, AndroidUtilities.dp(20.0f), 0, 0);
        imageView.d();
        wpVar.addView((View) imageView, k7.b6.t(160, 160, 49, 17, 0, 17, 0));
        TextView textView = new TextView(activity);
        org.telegram.ui.b.g(24.0f, 1, textView);
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f19987j5));
        textView.setText(LocaleController.getString(R.string.AutoDeleteAlertTitle));
        wpVar.addView(textView, k7.b6.t(-2, -2, 49, 17, 18, 17, 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f20131r5));
        textView2.setGravity(1);
        if (ChatObject.isChannel(chat) && !chat.megagroup) {
            textView2.setText(LocaleController.getString(R.string.AutoDeleteAlertChannelInfo));
        } else {
            textView2.setText(LocaleController.getString(R.string.AutoDeleteAlertGroupInfo));
        }
        wpVar.addView(textView2, k7.b6.t(-2, -2, 49, 30, 22, 30, 20));
        uv0 uv0Var = new uv0(activity, null);
        uv0Var.setCallback(new xp(this, vpVar));
        uv0Var.b(this.f31450n, null, LocaleController.getString(R.string.AutoDeleteNever), LocaleController.getString(R.string.AutoDelete24Hours), LocaleController.getString(R.string.AutoDelete7Days), LocaleController.getString(R.string.AutoDelete1Month));
        wpVar.addView(uv0Var, k7.b6.k(0.0f, 8.0f, 0.0f, 0.0f, -1, -2));
        FrameLayout frameLayout = new FrameLayout(activity);
        mq mqVar = new mq(new ColorDrawable(getThemedColor(org.telegram.ui.ActionBar.j6.f19827a7)), org.telegram.ui.ActionBar.j6.V0(activity, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f19846b7));
        mqVar.f27116w = true;
        frameLayout.setBackgroundDrawable(mqVar);
        wpVar.addView(frameLayout, k7.b6.n(-1, -2));
        org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(activity, null);
        z8Var.setText(LocaleController.getString(R.string.AutoDeleteInfo));
        frameLayout.addView(z8Var);
        yp ypVar = new yp(activity);
        this.d = ypVar;
        ypVar.setBackgroundColor(getThemedColor(i11));
        ypVar.setText(LocaleController.getString(R.string.AutoDeleteSet));
        ypVar.f31095a.setOnClickListener(new g0(this, 9));
        frameLayout.addView(ypVar);
        p(false);
    }

    public static void m(zp zpVar) {
        float f10;
        View childAt = zpVar.f31448c.getChildAt(0);
        int[] iArr = zpVar.h;
        childAt.getLocationInWindow(iArr);
        int i10 = iArr[1];
        if (zpVar.e) {
            f10 = 6.0f;
        } else {
            f10 = 19.0f;
        }
        int max = Math.max(i10 - AndroidUtilities.dp(f10), 0);
        if (zpVar.f31449f != max) {
            zpVar.f31449f = max;
            zpVar.containerView.invalidate();
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    public final void p(boolean z4) {
        int i10 = this.f31450n;
        int i11 = this.f31451r;
        yp ypVar = this.d;
        if (i10 == i11 && !this.e) {
            if (z4) {
                ypVar.animate().alpha(0.0f).setDuration(180L).start();
                return;
            }
            ypVar.setVisibility(4);
            ypVar.setAlpha(0.0f);
            return;
        }
        ypVar.setVisibility(0);
        if (z4) {
            ypVar.animate().alpha(1.0f).setDuration(180L).start();
        } else {
            ypVar.setAlpha(1.0f);
        }
    }
}
