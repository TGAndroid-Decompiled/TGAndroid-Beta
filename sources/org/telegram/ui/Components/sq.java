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
public final class sq extends org.telegram.ui.ActionBar.e3 {
    public final Drawable f30907b;
    public final pq f30908c;
    public final rq d;
    public final boolean f30909e;
    public int f30910f;
    public final int[] h;
    public final int f30911n;
    public int f30912r;
    public boolean f30913s;
    public org.telegram.ui.cb v;

    public sq(Activity activity, TLRPC.Chat chat) {
        super(1, (Context) activity, (org.telegram.ui.ActionBar.d6) null, false);
        int i10;
        this.h = new int[2];
        this.f30909e = true;
        setApplyBottomPadding(false);
        TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(chat.f20068id);
        if (chatFull != null) {
            i10 = chatFull.ttl_period;
        } else {
            i10 = 0;
        }
        if (i10 == 0) {
            this.f30911n = 0;
            this.f30912r = 0;
        } else if (i10 == 86400) {
            this.f30911n = 1;
            this.f30912r = 1;
        } else if (i10 == 604800) {
            this.f30911n = 2;
            this.f30912r = 2;
        } else {
            this.f30911n = 3;
            this.f30912r = 3;
        }
        Drawable mutate = activity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f30907b = mutate;
        int i11 = org.telegram.ui.ActionBar.h6.f20893h5;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i11), PorterDuff.Mode.MULTIPLY));
        oq oqVar = new oq(this, activity);
        oqVar.setFillViewport(true);
        oqVar.setWillNotDraw(false);
        oqVar.setClipToPadding(false);
        int i12 = this.backgroundPaddingLeft;
        oqVar.setPadding(i12, 0, i12, 0);
        this.containerView = oqVar;
        pq pqVar = new pq(this, activity);
        this.f30908c = pqVar;
        pqVar.setOrientation(1);
        oqVar.addView(pqVar, w7.x5.x(-1, -2, 80));
        setCustomView(pqVar);
        UserConfig.getInstance(this.currentAccount).getClientUserId();
        int i13 = MessagesController.getInstance(this.currentAccount).revokeTimeLimit;
        ?? imageView = new ImageView(activity);
        imageView.setAutoRepeat(false);
        imageView.f(R.raw.utyan_private, 120, 120, null);
        imageView.setPadding(0, AndroidUtilities.dp(20.0f), 0, 0);
        imageView.d();
        pqVar.addView((View) imageView, w7.x5.t(160, 160, 49, 17, 0, 17, 0));
        TextView textView = new TextView(activity);
        org.telegram.messenger.ai.k(24.0f, 1, textView);
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20930j5));
        textView.setText(LocaleController.getString(R.string.AutoDeleteAlertTitle));
        pqVar.addView(textView, w7.x5.t(-2, -2, 49, 17, 18, 17, 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21080r5));
        textView2.setGravity(1);
        if (ChatObject.isChannel(chat) && !chat.megagroup) {
            textView2.setText(LocaleController.getString(R.string.AutoDeleteAlertChannelInfo));
        } else {
            textView2.setText(LocaleController.getString(R.string.AutoDeleteAlertGroupInfo));
        }
        pqVar.addView(textView2, w7.x5.t(-2, -2, 49, 30, 22, 30, 20));
        xw0 xw0Var = new xw0(activity, null);
        xw0Var.setCallback(new qq(this, oqVar));
        xw0Var.b(this.f30911n, null, LocaleController.getString(R.string.AutoDeleteNever), LocaleController.getString(R.string.AutoDelete24Hours), LocaleController.getString(R.string.AutoDelete7Days), LocaleController.getString(R.string.AutoDelete1Month));
        pqVar.addView(xw0Var, w7.x5.k(0.0f, 8.0f, 0.0f, 0.0f, -1, -2));
        FrameLayout frameLayout = new FrameLayout(activity);
        fr frVar = new fr(new ColorDrawable(getThemedColor(org.telegram.ui.ActionBar.h6.f20766a7)), org.telegram.ui.ActionBar.h6.W0(activity, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.f20786b7));
        frVar.f26552w = true;
        frameLayout.setBackgroundDrawable(frVar);
        pqVar.addView(frameLayout, w7.x5.n(-1, -2));
        org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(activity, null);
        e9Var.setText(LocaleController.getString(R.string.AutoDeleteInfo));
        frameLayout.addView(e9Var);
        rq rqVar = new rq(activity);
        this.d = rqVar;
        rqVar.setBackgroundColor(getThemedColor(i11));
        rqVar.setText(LocaleController.getString(R.string.AutoDeleteSet));
        rqVar.f30606a.setOnClickListener(new f0(this, 8));
        frameLayout.addView(rqVar);
        r(false);
    }

    public static void o(sq sqVar) {
        float f7;
        View childAt = sqVar.f30908c.getChildAt(0);
        int[] iArr = sqVar.h;
        childAt.getLocationInWindow(iArr);
        int i10 = iArr[1];
        if (sqVar.f30909e) {
            f7 = 6.0f;
        } else {
            f7 = 19.0f;
        }
        int max = Math.max(i10 - AndroidUtilities.dp(f7), 0);
        if (sqVar.f30910f != max) {
            sqVar.f30910f = max;
            sqVar.containerView.invalidate();
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    public final void r(boolean z10) {
        int i10 = this.f30911n;
        int i11 = this.f30912r;
        rq rqVar = this.d;
        if (i10 == i11 && !this.f30909e) {
            if (z10) {
                rqVar.animate().alpha(0.0f).setDuration(180L).start();
                return;
            }
            rqVar.setVisibility(4);
            rqVar.setAlpha(0.0f);
            return;
        }
        rqVar.setVisibility(0);
        if (z10) {
            rqVar.animate().alpha(1.0f).setDuration(180L).start();
        } else {
            rqVar.setAlpha(1.0f);
        }
    }
}
