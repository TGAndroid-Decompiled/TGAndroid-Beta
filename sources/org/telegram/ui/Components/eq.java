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
public final class eq extends org.telegram.ui.ActionBar.e3 {
    public final Drawable f24032b;
    public final bq f24033c;
    public final dq d;
    public final boolean e;
    public int f24034f;
    public final int[] h;
    public final int f24035n;
    public int f24036r;
    public boolean f24037s;
    public org.telegram.ui.cb v;

    public eq(Activity activity, TLRPC.Chat chat) {
        super(1, (Context) activity, (org.telegram.ui.ActionBar.d6) null, false);
        int i10;
        this.h = new int[2];
        this.e = true;
        setApplyBottomPadding(false);
        TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(chat.f18335id);
        if (chatFull != null) {
            i10 = chatFull.ttl_period;
        } else {
            i10 = 0;
        }
        if (i10 == 0) {
            this.f24035n = 0;
            this.f24036r = 0;
        } else if (i10 == 86400) {
            this.f24035n = 1;
            this.f24036r = 1;
        } else if (i10 == 604800) {
            this.f24035n = 2;
            this.f24036r = 2;
        } else {
            this.f24035n = 3;
            this.f24036r = 3;
        }
        Drawable mutate = activity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f24032b = mutate;
        int i11 = org.telegram.ui.ActionBar.h6.f19129h5;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i11), PorterDuff.Mode.MULTIPLY));
        aq aqVar = new aq(this, activity);
        aqVar.setFillViewport(true);
        aqVar.setWillNotDraw(false);
        aqVar.setClipToPadding(false);
        int i12 = this.backgroundPaddingLeft;
        aqVar.setPadding(i12, 0, i12, 0);
        this.containerView = aqVar;
        bq bqVar = new bq(this, activity);
        this.f24033c = bqVar;
        bqVar.setOrientation(1);
        aqVar.addView(bqVar, w7.y5.x(-1, -2, 80));
        setCustomView(bqVar);
        UserConfig.getInstance(this.currentAccount).getClientUserId();
        int i13 = MessagesController.getInstance(this.currentAccount).revokeTimeLimit;
        ?? imageView = new ImageView(activity);
        imageView.setAutoRepeat(false);
        imageView.f(R.raw.utyan_private, 120, 120, null);
        imageView.setPadding(0, AndroidUtilities.dp(20.0f), 0, 0);
        imageView.d();
        bqVar.addView((View) imageView, w7.y5.t(160, 160, 49, 17, 0, 17, 0));
        TextView textView = new TextView(activity);
        org.telegram.messenger.ok.k(24.0f, 1, textView);
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f19165j5));
        textView.setText(LocaleController.getString(R.string.AutoDeleteAlertTitle));
        bqVar.addView(textView, w7.y5.t(-2, -2, 49, 17, 18, 17, 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f19315r5));
        textView2.setGravity(1);
        if (ChatObject.isChannel(chat) && !chat.megagroup) {
            textView2.setText(LocaleController.getString(R.string.AutoDeleteAlertChannelInfo));
        } else {
            textView2.setText(LocaleController.getString(R.string.AutoDeleteAlertGroupInfo));
        }
        bqVar.addView(textView2, w7.y5.t(-2, -2, 49, 30, 22, 30, 20));
        fw0 fw0Var = new fw0(activity, null);
        fw0Var.setCallback(new cq(this, aqVar));
        fw0Var.b(this.f24035n, null, LocaleController.getString(R.string.AutoDeleteNever), LocaleController.getString(R.string.AutoDelete24Hours), LocaleController.getString(R.string.AutoDelete7Days), LocaleController.getString(R.string.AutoDelete1Month));
        bqVar.addView(fw0Var, w7.y5.k(0.0f, 8.0f, 0.0f, 0.0f, -1, -2));
        FrameLayout frameLayout = new FrameLayout(activity);
        rq rqVar = new rq(new ColorDrawable(getThemedColor(org.telegram.ui.ActionBar.h6.f19003a7)), org.telegram.ui.ActionBar.h6.V0(activity, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.f19023b7));
        rqVar.f28035w = true;
        frameLayout.setBackgroundDrawable(rqVar);
        bqVar.addView(frameLayout, w7.y5.n(-1, -2));
        org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(activity, null);
        e9Var.setText(LocaleController.getString(R.string.AutoDeleteInfo));
        frameLayout.addView(e9Var);
        dq dqVar = new dq(activity);
        this.d = dqVar;
        dqVar.setBackgroundColor(getThemedColor(i11));
        dqVar.setText(LocaleController.getString(R.string.AutoDeleteSet));
        dqVar.f23732a.setOnClickListener(new f0(this, 9));
        frameLayout.addView(dqVar);
        p(false);
    }

    public static void m(eq eqVar) {
        float f7;
        View childAt = eqVar.f24033c.getChildAt(0);
        int[] iArr = eqVar.h;
        childAt.getLocationInWindow(iArr);
        int i10 = iArr[1];
        if (eqVar.e) {
            f7 = 6.0f;
        } else {
            f7 = 19.0f;
        }
        int max = Math.max(i10 - AndroidUtilities.dp(f7), 0);
        if (eqVar.f24034f != max) {
            eqVar.f24034f = max;
            eqVar.containerView.invalidate();
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    public final void p(boolean z10) {
        int i10 = this.f24035n;
        int i11 = this.f24036r;
        dq dqVar = this.d;
        if (i10 == i11 && !this.e) {
            if (z10) {
                dqVar.animate().alpha(0.0f).setDuration(180L).start();
                return;
            }
            dqVar.setVisibility(4);
            dqVar.setAlpha(0.0f);
            return;
        }
        dqVar.setVisibility(0);
        if (z10) {
            dqVar.animate().alpha(1.0f).setDuration(180L).start();
        } else {
            dqVar.setAlpha(1.0f);
        }
    }
}
