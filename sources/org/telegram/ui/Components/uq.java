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
public final class uq extends org.telegram.ui.ActionBar.e3 {
    public final Drawable f31237b;
    public final rq f31238c;
    public final tq d;
    public final boolean f31239e;
    public int f31240f;
    public final int[] h;
    public final int f31241n;
    public int f31242r;
    public boolean f31243s;
    public org.telegram.ui.gb v;

    public uq(Activity activity, TLRPC.Chat chat) {
        super(1, (Context) activity, (org.telegram.ui.ActionBar.c6) null, false);
        int i10;
        this.h = new int[2];
        this.f31239e = true;
        setApplyBottomPadding(false);
        TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(chat.f19803id);
        if (chatFull != null) {
            i10 = chatFull.ttl_period;
        } else {
            i10 = 0;
        }
        if (i10 == 0) {
            this.f31241n = 0;
            this.f31242r = 0;
        } else if (i10 == 86400) {
            this.f31241n = 1;
            this.f31242r = 1;
        } else if (i10 == 604800) {
            this.f31241n = 2;
            this.f31242r = 2;
        } else {
            this.f31241n = 3;
            this.f31242r = 3;
        }
        Drawable mutate = activity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f31237b = mutate;
        int i11 = org.telegram.ui.ActionBar.h6.f20631h5;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i11), PorterDuff.Mode.MULTIPLY));
        qq qqVar = new qq(this, activity);
        qqVar.setFillViewport(true);
        qqVar.setWillNotDraw(false);
        qqVar.setClipToPadding(false);
        int i12 = this.backgroundPaddingLeft;
        qqVar.setPadding(i12, 0, i12, 0);
        this.containerView = qqVar;
        rq rqVar = new rq(this, activity);
        this.f31238c = rqVar;
        rqVar.setOrientation(1);
        qqVar.addView(rqVar, w7.w5.x(-1, -2, 80));
        setCustomView(rqVar);
        UserConfig.getInstance(this.currentAccount).getClientUserId();
        int i13 = MessagesController.getInstance(this.currentAccount).revokeTimeLimit;
        ?? imageView = new ImageView(activity);
        imageView.setAutoRepeat(false);
        imageView.f(R.raw.utyan_private, 120, 120, null);
        imageView.setPadding(0, AndroidUtilities.dp(20.0f), 0, 0);
        imageView.d();
        rqVar.addView((View) imageView, w7.w5.t(160, 160, 49, 17, 0, 17, 0));
        TextView textView = new TextView(activity);
        org.telegram.messenger.am.k(24.0f, 1, textView);
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20668j5));
        textView.setText(LocaleController.getString(R.string.AutoDeleteAlertTitle));
        rqVar.addView(textView, w7.w5.t(-2, -2, 49, 17, 18, 17, 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20818r5));
        textView2.setGravity(1);
        if (ChatObject.isChannel(chat) && !chat.megagroup) {
            textView2.setText(LocaleController.getString(R.string.AutoDeleteAlertChannelInfo));
        } else {
            textView2.setText(LocaleController.getString(R.string.AutoDeleteAlertGroupInfo));
        }
        rqVar.addView(textView2, w7.w5.t(-2, -2, 49, 30, 22, 30, 20));
        cx0 cx0Var = new cx0(activity, null);
        cx0Var.setCallback(new sq(this, qqVar));
        cx0Var.b(this.f31241n, null, LocaleController.getString(R.string.AutoDeleteNever), LocaleController.getString(R.string.AutoDelete24Hours), LocaleController.getString(R.string.AutoDelete7Days), LocaleController.getString(R.string.AutoDelete1Month));
        rqVar.addView(cx0Var, w7.w5.k(0.0f, 8.0f, 0.0f, 0.0f, -1, -2));
        FrameLayout frameLayout = new FrameLayout(activity);
        hr hrVar = new hr(new ColorDrawable(getThemedColor(org.telegram.ui.ActionBar.h6.f20504a7)), org.telegram.ui.ActionBar.h6.W0(activity, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.f20524b7));
        hrVar.f26883w = true;
        frameLayout.setBackgroundDrawable(hrVar);
        rqVar.addView(frameLayout, w7.w5.n(-1, -2));
        org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(activity, null);
        e9Var.setText(LocaleController.getString(R.string.AutoDeleteInfo));
        frameLayout.addView(e9Var);
        tq tqVar = new tq(activity);
        this.d = tqVar;
        tqVar.setBackgroundColor(getThemedColor(i11));
        tqVar.setText(LocaleController.getString(R.string.AutoDeleteSet));
        tqVar.f30946a.setOnClickListener(new f0(this, 8));
        frameLayout.addView(tqVar);
        r(false);
    }

    public static void o(uq uqVar) {
        float f7;
        View childAt = uqVar.f31238c.getChildAt(0);
        int[] iArr = uqVar.h;
        childAt.getLocationInWindow(iArr);
        int i10 = iArr[1];
        if (uqVar.f31239e) {
            f7 = 6.0f;
        } else {
            f7 = 19.0f;
        }
        int max = Math.max(i10 - AndroidUtilities.dp(f7), 0);
        if (uqVar.f31240f != max) {
            uqVar.f31240f = max;
            uqVar.containerView.invalidate();
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    public final void r(boolean z10) {
        int i10 = this.f31241n;
        int i11 = this.f31242r;
        tq tqVar = this.d;
        if (i10 == i11 && !this.f31239e) {
            if (z10) {
                tqVar.animate().alpha(0.0f).setDuration(180L).start();
                return;
            }
            tqVar.setVisibility(4);
            tqVar.setAlpha(0.0f);
            return;
        }
        tqVar.setVisibility(0);
        if (z10) {
            tqVar.animate().alpha(1.0f).setDuration(180L).start();
        } else {
            tqVar.setAlpha(1.0f);
        }
    }
}
