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
public final class iq extends org.telegram.ui.ActionBar.h3 {
    public final Drawable f24062b;
    public final fq f24063c;
    public final hq d;
    public final boolean e;
    public int f24064f;
    public final int[] h;
    public final int f24065n;
    public int f24066r;
    public boolean f24067s;
    public org.telegram.ui.eb v;

    public iq(Activity activity, TLRPC.Chat chat) {
        super(1, (Context) activity, (org.telegram.ui.ActionBar.f6) null, false);
        int i10;
        this.h = new int[2];
        this.e = true;
        setApplyBottomPadding(false);
        TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(chat.f17195id);
        if (chatFull != null) {
            i10 = chatFull.ttl_period;
        } else {
            i10 = 0;
        }
        if (i10 == 0) {
            this.f24065n = 0;
            this.f24066r = 0;
        } else if (i10 == 86400) {
            this.f24065n = 1;
            this.f24066r = 1;
        } else if (i10 == 604800) {
            this.f24065n = 2;
            this.f24066r = 2;
        } else {
            this.f24065n = 3;
            this.f24066r = 3;
        }
        Drawable mutate = activity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f24062b = mutate;
        int i11 = org.telegram.ui.ActionBar.j6.f17998h5;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i11), PorterDuff.Mode.MULTIPLY));
        eq eqVar = new eq(this, activity);
        eqVar.setFillViewport(true);
        eqVar.setWillNotDraw(false);
        eqVar.setClipToPadding(false);
        int i12 = this.backgroundPaddingLeft;
        eqVar.setPadding(i12, 0, i12, 0);
        this.containerView = eqVar;
        fq fqVar = new fq(this, activity);
        this.f24063c = fqVar;
        fqVar.setOrientation(1);
        eqVar.addView(fqVar, w7.a6.x(-1, -2, 80));
        setCustomView(fqVar);
        UserConfig.getInstance(this.currentAccount).getClientUserId();
        int i13 = MessagesController.getInstance(this.currentAccount).revokeTimeLimit;
        ?? imageView = new ImageView(activity);
        imageView.setAutoRepeat(false);
        imageView.f(R.raw.utyan_private, 120, 120, null);
        imageView.setPadding(0, AndroidUtilities.dp(20.0f), 0, 0);
        imageView.d();
        fqVar.addView((View) imageView, w7.a6.t(160, 160, 49, 17, 0, 17, 0));
        TextView textView = new TextView(activity);
        org.telegram.messenger.em.j(24.0f, 1, textView);
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f18034j5));
        textView.setText(LocaleController.getString(R.string.AutoDeleteAlertTitle));
        fqVar.addView(textView, w7.a6.t(-2, -2, 49, 17, 18, 17, 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f18179r5));
        textView2.setGravity(1);
        if (ChatObject.isChannel(chat) && !chat.megagroup) {
            textView2.setText(LocaleController.getString(R.string.AutoDeleteAlertChannelInfo));
        } else {
            textView2.setText(LocaleController.getString(R.string.AutoDeleteAlertGroupInfo));
        }
        fqVar.addView(textView2, w7.a6.t(-2, -2, 49, 30, 22, 30, 20));
        ew0 ew0Var = new ew0(activity, null);
        ew0Var.setCallback(new gq(this, eqVar));
        ew0Var.b(this.f24065n, null, LocaleController.getString(R.string.AutoDeleteNever), LocaleController.getString(R.string.AutoDelete24Hours), LocaleController.getString(R.string.AutoDelete7Days), LocaleController.getString(R.string.AutoDelete1Month));
        fqVar.addView(ew0Var, w7.a6.k(0.0f, 8.0f, 0.0f, 0.0f, -1, -2));
        FrameLayout frameLayout = new FrameLayout(activity);
        vq vqVar = new vq(new ColorDrawable(getThemedColor(org.telegram.ui.ActionBar.j6.f17872a7)), org.telegram.ui.ActionBar.j6.V0(activity, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f17892b7));
        vqVar.f28580w = true;
        frameLayout.setBackgroundDrawable(vqVar);
        fqVar.addView(frameLayout, w7.a6.n(-1, -2));
        org.telegram.ui.Cells.f9 f9Var = new org.telegram.ui.Cells.f9(activity, null);
        f9Var.setText(LocaleController.getString(R.string.AutoDeleteInfo));
        frameLayout.addView(f9Var);
        hq hqVar = new hq(activity);
        this.d = hqVar;
        hqVar.setBackgroundColor(getThemedColor(i11));
        hqVar.setText(LocaleController.getString(R.string.AutoDeleteSet));
        hqVar.f23748a.setOnClickListener(new h0(this, 9));
        frameLayout.addView(hqVar);
        p(false);
    }

    public static void m(iq iqVar) {
        float f7;
        View childAt = iqVar.f24063c.getChildAt(0);
        int[] iArr = iqVar.h;
        childAt.getLocationInWindow(iArr);
        int i10 = iArr[1];
        if (iqVar.e) {
            f7 = 6.0f;
        } else {
            f7 = 19.0f;
        }
        int max = Math.max(i10 - AndroidUtilities.dp(f7), 0);
        if (iqVar.f24064f != max) {
            iqVar.f24064f = max;
            iqVar.containerView.invalidate();
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    public final void p(boolean z10) {
        int i10 = this.f24065n;
        int i11 = this.f24066r;
        hq hqVar = this.d;
        if (i10 == i11 && !this.e) {
            if (z10) {
                hqVar.animate().alpha(0.0f).setDuration(180L).start();
                return;
            }
            hqVar.setVisibility(4);
            hqVar.setAlpha(0.0f);
            return;
        }
        hqVar.setVisibility(0);
        if (z10) {
            hqVar.animate().alpha(1.0f).setDuration(180L).start();
        } else {
            hqVar.setAlpha(1.0f);
        }
    }
}
