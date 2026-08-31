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
public final class cq extends org.telegram.ui.ActionBar.h3 {
    public final Drawable f26069b;
    public final zp f26070c;
    public final bq d;
    public final boolean f26071e;
    public int f26072f;
    public final int[] h;
    public final int f26073n;
    public int f26074r;
    public boolean f26075s;
    public org.telegram.ui.za v;

    public cq(Activity activity, TLRPC.Chat chat) {
        super(activity, null, false, false);
        int i10;
        this.h = new int[2];
        this.f26071e = true;
        setApplyBottomPadding(false);
        TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(chat.f20843id);
        if (chatFull != null) {
            i10 = chatFull.ttl_period;
        } else {
            i10 = 0;
        }
        if (i10 == 0) {
            this.f26073n = 0;
            this.f26074r = 0;
        } else if (i10 == 86400) {
            this.f26073n = 1;
            this.f26074r = 1;
        } else if (i10 == 604800) {
            this.f26073n = 2;
            this.f26074r = 2;
        } else {
            this.f26073n = 3;
            this.f26074r = 3;
        }
        Drawable mutate = activity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f26069b = mutate;
        int i11 = org.telegram.ui.ActionBar.k6.f21731h5;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i11), PorterDuff.Mode.MULTIPLY));
        yp ypVar = new yp(this, activity);
        ypVar.setFillViewport(true);
        ypVar.setWillNotDraw(false);
        ypVar.setClipToPadding(false);
        int i12 = this.backgroundPaddingLeft;
        ypVar.setPadding(i12, 0, i12, 0);
        this.containerView = ypVar;
        zp zpVar = new zp(this, activity);
        this.f26070c = zpVar;
        zpVar.setOrientation(1);
        ypVar.addView(zpVar, k7.c6.x(-1, -2, 80));
        setCustomView(zpVar);
        UserConfig.getInstance(this.currentAccount).getClientUserId();
        int i13 = MessagesController.getInstance(this.currentAccount).revokeTimeLimit;
        ?? imageView = new ImageView(activity);
        imageView.setAutoRepeat(false);
        imageView.f(R.raw.utyan_private, 120, 120, null);
        imageView.setPadding(0, AndroidUtilities.dp(20.0f), 0, 0);
        imageView.d();
        zpVar.addView((View) imageView, k7.c6.t(160, 160, 49, 17, 0, 17, 0));
        TextView textView = new TextView(activity);
        org.telegram.ui.b.g(24.0f, 1, textView);
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21766j5));
        textView.setText(LocaleController.getString(R.string.AutoDeleteAlertTitle));
        zpVar.addView(textView, k7.c6.t(-2, -2, 49, 17, 18, 17, 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21911r5));
        textView2.setGravity(1);
        if (ChatObject.isChannel(chat) && !chat.megagroup) {
            textView2.setText(LocaleController.getString(R.string.AutoDeleteAlertChannelInfo));
        } else {
            textView2.setText(LocaleController.getString(R.string.AutoDeleteAlertGroupInfo));
        }
        zpVar.addView(textView2, k7.c6.t(-2, -2, 49, 30, 22, 30, 20));
        vv0 vv0Var = new vv0(activity, null);
        vv0Var.setCallback(new aq(this, ypVar));
        vv0Var.b(this.f26073n, null, LocaleController.getString(R.string.AutoDeleteNever), LocaleController.getString(R.string.AutoDelete24Hours), LocaleController.getString(R.string.AutoDelete7Days), LocaleController.getString(R.string.AutoDelete1Month));
        zpVar.addView(vv0Var, k7.c6.k(0.0f, 8.0f, 0.0f, 0.0f, -1, -2));
        FrameLayout frameLayout = new FrameLayout(activity);
        pq pqVar = new pq(new ColorDrawable(getThemedColor(org.telegram.ui.ActionBar.k6.f21605a7)), org.telegram.ui.ActionBar.k6.V0(activity, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.f21624b7));
        pqVar.f30173w = true;
        frameLayout.setBackgroundDrawable(pqVar);
        zpVar.addView(frameLayout, k7.c6.n(-1, -2));
        org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(activity, null);
        a9Var.setText(LocaleController.getString(R.string.AutoDeleteInfo));
        frameLayout.addView(a9Var);
        bq bqVar = new bq(activity);
        this.d = bqVar;
        bqVar.setBackgroundColor(getThemedColor(i11));
        bqVar.setText(LocaleController.getString(R.string.AutoDeleteSet));
        bqVar.f25701a.setOnClickListener(new g0(this, 9));
        frameLayout.addView(bqVar);
        p(false);
    }

    public static void m(cq cqVar) {
        float f10;
        View childAt = cqVar.f26070c.getChildAt(0);
        int[] iArr = cqVar.h;
        childAt.getLocationInWindow(iArr);
        int i10 = iArr[1];
        if (cqVar.f26071e) {
            f10 = 6.0f;
        } else {
            f10 = 19.0f;
        }
        int max = Math.max(i10 - AndroidUtilities.dp(f10), 0);
        if (cqVar.f26072f != max) {
            cqVar.f26072f = max;
            cqVar.containerView.invalidate();
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    public final void p(boolean z4) {
        int i10 = this.f26073n;
        int i11 = this.f26074r;
        bq bqVar = this.d;
        if (i10 == i11 && !this.f26071e) {
            if (z4) {
                bqVar.animate().alpha(0.0f).setDuration(180L).start();
                return;
            }
            bqVar.setVisibility(4);
            bqVar.setAlpha(0.0f);
            return;
        }
        bqVar.setVisibility(0);
        if (z4) {
            bqVar.animate().alpha(1.0f).setDuration(180L).start();
        } else {
            bqVar.setAlpha(1.0f);
        }
    }
}
