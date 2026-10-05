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
public final class fq extends org.telegram.ui.ActionBar.f3 {
    public final Drawable f26556b;
    public final cq f26557c;
    public final eq d;
    public final boolean f26558e;
    public int f26559f;
    public final int[] h;
    public final int f26560n;
    public int f26561r;
    public boolean f26562s;
    public org.telegram.ui.eb v;

    public fq(Activity activity, TLRPC.Chat chat) {
        super(1, (Context) activity, (org.telegram.ui.ActionBar.d6) null, false);
        int i10;
        this.h = new int[2];
        this.f26558e = true;
        setApplyBottomPadding(false);
        TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(chat.f20047id);
        if (chatFull != null) {
            i10 = chatFull.ttl_period;
        } else {
            i10 = 0;
        }
        if (i10 == 0) {
            this.f26560n = 0;
            this.f26561r = 0;
        } else if (i10 == 86400) {
            this.f26560n = 1;
            this.f26561r = 1;
        } else if (i10 == 604800) {
            this.f26560n = 2;
            this.f26561r = 2;
        } else {
            this.f26560n = 3;
            this.f26561r = 3;
        }
        Drawable mutate = activity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f26556b = mutate;
        int i11 = org.telegram.ui.ActionBar.i6.f20899h5;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i11), PorterDuff.Mode.MULTIPLY));
        bq bqVar = new bq(this, activity);
        bqVar.setFillViewport(true);
        bqVar.setWillNotDraw(false);
        bqVar.setClipToPadding(false);
        int i12 = this.backgroundPaddingLeft;
        bqVar.setPadding(i12, 0, i12, 0);
        this.containerView = bqVar;
        cq cqVar = new cq(this, activity);
        this.f26557c = cqVar;
        cqVar.setOrientation(1);
        bqVar.addView(cqVar, w7.z5.x(-1, -2, 80));
        setCustomView(cqVar);
        UserConfig.getInstance(this.currentAccount).getClientUserId();
        int i13 = MessagesController.getInstance(this.currentAccount).revokeTimeLimit;
        ?? imageView = new ImageView(activity);
        imageView.setAutoRepeat(false);
        imageView.f(R.raw.utyan_private, 120, 120, null);
        imageView.setPadding(0, AndroidUtilities.dp(20.0f), 0, 0);
        imageView.d();
        cqVar.addView((View) imageView, w7.z5.t(160, 160, 49, 17, 0, 17, 0));
        TextView textView = new TextView(activity);
        org.telegram.messenger.bi.j(24.0f, 1, textView);
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.f20935j5));
        textView.setText(LocaleController.getString(R.string.AutoDeleteAlertTitle));
        cqVar.addView(textView, w7.z5.t(-2, -2, 49, 17, 18, 17, 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.f21086r5));
        textView2.setGravity(1);
        if (ChatObject.isChannel(chat) && !chat.megagroup) {
            textView2.setText(LocaleController.getString(R.string.AutoDeleteAlertChannelInfo));
        } else {
            textView2.setText(LocaleController.getString(R.string.AutoDeleteAlertGroupInfo));
        }
        cqVar.addView(textView2, w7.z5.t(-2, -2, 49, 30, 22, 30, 20));
        qw0 qw0Var = new qw0(activity, null);
        qw0Var.setCallback(new dq(this, bqVar));
        qw0Var.b(this.f26560n, null, LocaleController.getString(R.string.AutoDeleteNever), LocaleController.getString(R.string.AutoDelete24Hours), LocaleController.getString(R.string.AutoDelete7Days), LocaleController.getString(R.string.AutoDelete1Month));
        cqVar.addView(qw0Var, w7.z5.k(0.0f, 8.0f, 0.0f, 0.0f, -1, -2));
        FrameLayout frameLayout = new FrameLayout(activity);
        sq sqVar = new sq(new ColorDrawable(getThemedColor(org.telegram.ui.ActionBar.i6.f20771a7)), org.telegram.ui.ActionBar.i6.V0(activity, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.i6.f20791b7));
        sqVar.f30931w = true;
        frameLayout.setBackgroundDrawable(sqVar);
        cqVar.addView(frameLayout, w7.z5.n(-1, -2));
        org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(activity, null);
        e9Var.setText(LocaleController.getString(R.string.AutoDeleteInfo));
        frameLayout.addView(e9Var);
        eq eqVar = new eq(activity);
        this.d = eqVar;
        eqVar.setBackgroundColor(getThemedColor(i11));
        eqVar.setText(LocaleController.getString(R.string.AutoDeleteSet));
        eqVar.f26197a.setOnClickListener(new f0(this, 9));
        frameLayout.addView(eqVar);
        p(false);
    }

    public static void m(fq fqVar) {
        float f7;
        View childAt = fqVar.f26557c.getChildAt(0);
        int[] iArr = fqVar.h;
        childAt.getLocationInWindow(iArr);
        int i10 = iArr[1];
        if (fqVar.f26558e) {
            f7 = 6.0f;
        } else {
            f7 = 19.0f;
        }
        int max = Math.max(i10 - AndroidUtilities.dp(f7), 0);
        if (fqVar.f26559f != max) {
            fqVar.f26559f = max;
            fqVar.containerView.invalidate();
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    public final void p(boolean z10) {
        int i10 = this.f26560n;
        int i11 = this.f26561r;
        eq eqVar = this.d;
        if (i10 == i11 && !this.f26558e) {
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
