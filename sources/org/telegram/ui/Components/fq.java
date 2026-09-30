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
public final class fq extends org.telegram.ui.ActionBar.e3 {
    public final Drawable f24328b;
    public final cq f24329c;
    public final eq d;
    public final boolean e;
    public int f24330f;
    public final int[] h;
    public final int f24331n;
    public int f24332r;
    public boolean f24333s;
    public org.telegram.ui.cb v;

    public fq(Activity activity, TLRPC.Chat chat) {
        super(1, (Context) activity, (org.telegram.ui.ActionBar.d6) null, false);
        int i10;
        this.h = new int[2];
        this.e = true;
        setApplyBottomPadding(false);
        TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(chat.f18352id);
        if (chatFull != null) {
            i10 = chatFull.ttl_period;
        } else {
            i10 = 0;
        }
        if (i10 == 0) {
            this.f24331n = 0;
            this.f24332r = 0;
        } else if (i10 == 86400) {
            this.f24331n = 1;
            this.f24332r = 1;
        } else if (i10 == 604800) {
            this.f24331n = 2;
            this.f24332r = 2;
        } else {
            this.f24331n = 3;
            this.f24332r = 3;
        }
        Drawable mutate = activity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f24328b = mutate;
        int i11 = org.telegram.ui.ActionBar.h6.f19146h5;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i11), PorterDuff.Mode.MULTIPLY));
        bq bqVar = new bq(this, activity);
        bqVar.setFillViewport(true);
        bqVar.setWillNotDraw(false);
        bqVar.setClipToPadding(false);
        int i12 = this.backgroundPaddingLeft;
        bqVar.setPadding(i12, 0, i12, 0);
        this.containerView = bqVar;
        cq cqVar = new cq(this, activity);
        this.f24329c = cqVar;
        cqVar.setOrientation(1);
        bqVar.addView(cqVar, w7.y5.x(-1, -2, 80));
        setCustomView(cqVar);
        UserConfig.getInstance(this.currentAccount).getClientUserId();
        int i13 = MessagesController.getInstance(this.currentAccount).revokeTimeLimit;
        ?? imageView = new ImageView(activity);
        imageView.setAutoRepeat(false);
        imageView.f(R.raw.utyan_private, 120, 120, null);
        imageView.setPadding(0, AndroidUtilities.dp(20.0f), 0, 0);
        imageView.d();
        cqVar.addView((View) imageView, w7.y5.t(160, 160, 49, 17, 0, 17, 0));
        TextView textView = new TextView(activity);
        org.telegram.messenger.ok.k(24.0f, 1, textView);
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f19182j5));
        textView.setText(LocaleController.getString(R.string.AutoDeleteAlertTitle));
        cqVar.addView(textView, w7.y5.t(-2, -2, 49, 17, 18, 17, 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f19332r5));
        textView2.setGravity(1);
        if (ChatObject.isChannel(chat) && !chat.megagroup) {
            textView2.setText(LocaleController.getString(R.string.AutoDeleteAlertChannelInfo));
        } else {
            textView2.setText(LocaleController.getString(R.string.AutoDeleteAlertGroupInfo));
        }
        cqVar.addView(textView2, w7.y5.t(-2, -2, 49, 30, 22, 30, 20));
        hw0 hw0Var = new hw0(activity, null);
        hw0Var.setCallback(new dq(this, bqVar));
        hw0Var.b(this.f24331n, null, LocaleController.getString(R.string.AutoDeleteNever), LocaleController.getString(R.string.AutoDelete24Hours), LocaleController.getString(R.string.AutoDelete7Days), LocaleController.getString(R.string.AutoDelete1Month));
        cqVar.addView(hw0Var, w7.y5.k(0.0f, 8.0f, 0.0f, 0.0f, -1, -2));
        FrameLayout frameLayout = new FrameLayout(activity);
        sq sqVar = new sq(new ColorDrawable(getThemedColor(org.telegram.ui.ActionBar.h6.f19020a7)), org.telegram.ui.ActionBar.h6.V0(activity, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.f19040b7));
        sqVar.f28328w = true;
        frameLayout.setBackgroundDrawable(sqVar);
        cqVar.addView(frameLayout, w7.y5.n(-1, -2));
        org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(activity, null);
        e9Var.setText(LocaleController.getString(R.string.AutoDeleteInfo));
        frameLayout.addView(e9Var);
        eq eqVar = new eq(activity);
        this.d = eqVar;
        eqVar.setBackgroundColor(getThemedColor(i11));
        eqVar.setText(LocaleController.getString(R.string.AutoDeleteSet));
        eqVar.f24033a.setOnClickListener(new f0(this, 9));
        frameLayout.addView(eqVar);
        p(false);
    }

    public static void m(fq fqVar) {
        float f7;
        View childAt = fqVar.f24329c.getChildAt(0);
        int[] iArr = fqVar.h;
        childAt.getLocationInWindow(iArr);
        int i10 = iArr[1];
        if (fqVar.e) {
            f7 = 6.0f;
        } else {
            f7 = 19.0f;
        }
        int max = Math.max(i10 - AndroidUtilities.dp(f7), 0);
        if (fqVar.f24330f != max) {
            fqVar.f24330f = max;
            fqVar.containerView.invalidate();
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    public final void p(boolean z10) {
        int i10 = this.f24331n;
        int i11 = this.f24332r;
        eq eqVar = this.d;
        if (i10 == i11 && !this.e) {
            if (z10) {
                eqVar.animate().alpha(0.0f).setDuration(180L).start();
                return;
            }
            eqVar.setVisibility(4);
            eqVar.setAlpha(0.0f);
            return;
        }
        eqVar.setVisibility(0);
        if (z10) {
            eqVar.animate().alpha(1.0f).setDuration(180L).start();
        } else {
            eqVar.setAlpha(1.0f);
        }
    }
}
