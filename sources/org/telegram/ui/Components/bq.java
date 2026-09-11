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
public final class bq extends org.telegram.ui.ActionBar.f3 {
    public final Drawable f24781b;
    public final yp f24782c;
    public final aq d;
    public final boolean f24783e;
    public int f24784f;
    public final int[] h;
    public final int f24785n;
    public int f24786r;
    public boolean f24787s;
    public org.telegram.ui.cb v;

    public bq(Activity activity, TLRPC.Chat chat) {
        super(1, (Context) activity, (org.telegram.ui.ActionBar.f6) null, false);
        int i10;
        this.h = new int[2];
        this.f24783e = true;
        setApplyBottomPadding(false);
        TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(chat.f19869id);
        if (chatFull != null) {
            i10 = chatFull.ttl_period;
        } else {
            i10 = 0;
        }
        if (i10 == 0) {
            this.f24785n = 0;
            this.f24786r = 0;
        } else if (i10 == 86400) {
            this.f24785n = 1;
            this.f24786r = 1;
        } else if (i10 == 604800) {
            this.f24785n = 2;
            this.f24786r = 2;
        } else {
            this.f24785n = 3;
            this.f24786r = 3;
        }
        Drawable mutate = activity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f24781b = mutate;
        int i11 = org.telegram.ui.ActionBar.j6.f20734h5;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i11), PorterDuff.Mode.MULTIPLY));
        xp xpVar = new xp(this, activity);
        xpVar.setFillViewport(true);
        xpVar.setWillNotDraw(false);
        xpVar.setClipToPadding(false);
        int i12 = this.backgroundPaddingLeft;
        xpVar.setPadding(i12, 0, i12, 0);
        this.containerView = xpVar;
        yp ypVar = new yp(this, activity);
        this.f24782c = ypVar;
        ypVar.setOrientation(1);
        xpVar.addView(ypVar, w7.x5.x(-1, -2, 80));
        setCustomView(ypVar);
        UserConfig.getInstance(this.currentAccount).getClientUserId();
        int i13 = MessagesController.getInstance(this.currentAccount).revokeTimeLimit;
        ?? imageView = new ImageView(activity);
        imageView.setAutoRepeat(false);
        imageView.f(R.raw.utyan_private, 120, 120, null);
        imageView.setPadding(0, AndroidUtilities.dp(20.0f), 0, 0);
        imageView.d();
        ypVar.addView((View) imageView, w7.x5.t(160, 160, 49, 17, 0, 17, 0));
        TextView textView = new TextView(activity);
        org.telegram.messenger.vl.j(24.0f, 1, textView);
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f20770j5));
        textView.setText(LocaleController.getString(R.string.AutoDeleteAlertTitle));
        ypVar.addView(textView, w7.x5.t(-2, -2, 49, 17, 18, 17, 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f20915r5));
        textView2.setGravity(1);
        if (ChatObject.isChannel(chat) && !chat.megagroup) {
            textView2.setText(LocaleController.getString(R.string.AutoDeleteAlertChannelInfo));
        } else {
            textView2.setText(LocaleController.getString(R.string.AutoDeleteAlertGroupInfo));
        }
        ypVar.addView(textView2, w7.x5.t(-2, -2, 49, 30, 22, 30, 20));
        sv0 sv0Var = new sv0(activity, null);
        sv0Var.setCallback(new zp(this, xpVar));
        sv0Var.b(this.f24785n, null, LocaleController.getString(R.string.AutoDeleteNever), LocaleController.getString(R.string.AutoDelete24Hours), LocaleController.getString(R.string.AutoDelete7Days), LocaleController.getString(R.string.AutoDelete1Month));
        ypVar.addView(sv0Var, w7.x5.k(0.0f, 8.0f, 0.0f, 0.0f, -1, -2));
        FrameLayout frameLayout = new FrameLayout(activity);
        oq oqVar = new oq(new ColorDrawable(getThemedColor(org.telegram.ui.ActionBar.j6.f20607a7)), org.telegram.ui.ActionBar.j6.V0(activity, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f20627b7));
        oqVar.f29167w = true;
        frameLayout.setBackgroundDrawable(oqVar);
        ypVar.addView(frameLayout, w7.x5.n(-1, -2));
        org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(activity, null);
        e9Var.setText(LocaleController.getString(R.string.AutoDeleteInfo));
        frameLayout.addView(e9Var);
        aq aqVar = new aq(activity);
        this.d = aqVar;
        aqVar.setBackgroundColor(getThemedColor(i11));
        aqVar.setText(LocaleController.getString(R.string.AutoDeleteSet));
        aqVar.f24439a.setOnClickListener(new g0(this, 9));
        frameLayout.addView(aqVar);
        p(false);
    }

    public static void m(bq bqVar) {
        float f7;
        View childAt = bqVar.f24782c.getChildAt(0);
        int[] iArr = bqVar.h;
        childAt.getLocationInWindow(iArr);
        int i10 = iArr[1];
        if (bqVar.f24783e) {
            f7 = 6.0f;
        } else {
            f7 = 19.0f;
        }
        int max = Math.max(i10 - AndroidUtilities.dp(f7), 0);
        if (bqVar.f24784f != max) {
            bqVar.f24784f = max;
            bqVar.containerView.invalidate();
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    public final void p(boolean z10) {
        int i10 = this.f24785n;
        int i11 = this.f24786r;
        aq aqVar = this.d;
        if (i10 == i11 && !this.f24783e) {
            if (z10) {
                aqVar.animate().alpha(0.0f).setDuration(180L).start();
                return;
            }
            aqVar.setVisibility(4);
            aqVar.setAlpha(0.0f);
            return;
        }
        aqVar.setVisibility(0);
        if (z10) {
            aqVar.animate().alpha(1.0f).setDuration(180L).start();
        } else {
            aqVar.setAlpha(1.0f);
        }
    }
}
