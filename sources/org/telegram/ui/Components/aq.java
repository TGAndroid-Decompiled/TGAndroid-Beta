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
public final class aq extends org.telegram.ui.ActionBar.g3 {
    public final Drawable f23492b;
    public final xp f23493c;
    public final zp d;
    public final boolean e;
    public int f23494f;
    public final int[] h;
    public final int f23495n;
    public int f23496r;
    public boolean f23497s;
    public org.telegram.ui.za v;

    public aq(Activity activity, TLRPC.Chat chat) {
        super(activity, null, false, false);
        int i10;
        this.h = new int[2];
        this.e = true;
        setApplyBottomPadding(false);
        TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(chat.f19184id);
        if (chatFull != null) {
            i10 = chatFull.ttl_period;
        } else {
            i10 = 0;
        }
        if (i10 == 0) {
            this.f23495n = 0;
            this.f23496r = 0;
        } else if (i10 == 86400) {
            this.f23495n = 1;
            this.f23496r = 1;
        } else if (i10 == 604800) {
            this.f23495n = 2;
            this.f23496r = 2;
        } else {
            this.f23495n = 3;
            this.f23496r = 3;
        }
        Drawable mutate = activity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f23492b = mutate;
        int i11 = org.telegram.ui.ActionBar.j6.f19977h5;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i11), PorterDuff.Mode.MULTIPLY));
        wp wpVar = new wp(this, activity);
        wpVar.setFillViewport(true);
        wpVar.setWillNotDraw(false);
        wpVar.setClipToPadding(false);
        int i12 = this.backgroundPaddingLeft;
        wpVar.setPadding(i12, 0, i12, 0);
        this.containerView = wpVar;
        xp xpVar = new xp(this, activity);
        this.f23493c = xpVar;
        xpVar.setOrientation(1);
        wpVar.addView(xpVar, k7.b6.x(-1, -2, 80));
        setCustomView(xpVar);
        UserConfig.getInstance(this.currentAccount).getClientUserId();
        int i13 = MessagesController.getInstance(this.currentAccount).revokeTimeLimit;
        ?? imageView = new ImageView(activity);
        imageView.setAutoRepeat(false);
        imageView.f(R.raw.utyan_private, 120, 120, null);
        imageView.setPadding(0, AndroidUtilities.dp(20.0f), 0, 0);
        imageView.d();
        xpVar.addView((View) imageView, k7.b6.t(160, 160, 49, 17, 0, 17, 0));
        TextView textView = new TextView(activity);
        org.telegram.ui.b.g(24.0f, 1, textView);
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f20012j5));
        textView.setText(LocaleController.getString(R.string.AutoDeleteAlertTitle));
        xpVar.addView(textView, k7.b6.t(-2, -2, 49, 17, 18, 17, 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f20157r5));
        textView2.setGravity(1);
        if (ChatObject.isChannel(chat) && !chat.megagroup) {
            textView2.setText(LocaleController.getString(R.string.AutoDeleteAlertChannelInfo));
        } else {
            textView2.setText(LocaleController.getString(R.string.AutoDeleteAlertGroupInfo));
        }
        xpVar.addView(textView2, k7.b6.t(-2, -2, 49, 30, 22, 30, 20));
        uv0 uv0Var = new uv0(activity, null);
        uv0Var.setCallback(new yp(this, wpVar));
        uv0Var.b(this.f23495n, null, LocaleController.getString(R.string.AutoDeleteNever), LocaleController.getString(R.string.AutoDelete24Hours), LocaleController.getString(R.string.AutoDelete7Days), LocaleController.getString(R.string.AutoDelete1Month));
        xpVar.addView(uv0Var, k7.b6.k(0.0f, 8.0f, 0.0f, 0.0f, -1, -2));
        FrameLayout frameLayout = new FrameLayout(activity);
        nq nqVar = new nq(new ColorDrawable(getThemedColor(org.telegram.ui.ActionBar.j6.f19852a7)), org.telegram.ui.ActionBar.j6.V0(activity, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f19871b7));
        nqVar.f27342w = true;
        frameLayout.setBackgroundDrawable(nqVar);
        xpVar.addView(frameLayout, k7.b6.n(-1, -2));
        org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(activity, null);
        a9Var.setText(LocaleController.getString(R.string.AutoDeleteInfo));
        frameLayout.addView(a9Var);
        zp zpVar = new zp(activity);
        this.d = zpVar;
        zpVar.setBackgroundColor(getThemedColor(i11));
        zpVar.setText(LocaleController.getString(R.string.AutoDeleteSet));
        zpVar.f31424a.setOnClickListener(new g0(this, 9));
        frameLayout.addView(zpVar);
        p(false);
    }

    public static void m(aq aqVar) {
        float f10;
        View childAt = aqVar.f23493c.getChildAt(0);
        int[] iArr = aqVar.h;
        childAt.getLocationInWindow(iArr);
        int i10 = iArr[1];
        if (aqVar.e) {
            f10 = 6.0f;
        } else {
            f10 = 19.0f;
        }
        int max = Math.max(i10 - AndroidUtilities.dp(f10), 0);
        if (aqVar.f23494f != max) {
            aqVar.f23494f = max;
            aqVar.containerView.invalidate();
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    public final void p(boolean z4) {
        int i10 = this.f23495n;
        int i11 = this.f23496r;
        zp zpVar = this.d;
        if (i10 == i11 && !this.e) {
            if (z4) {
                zpVar.animate().alpha(0.0f).setDuration(180L).start();
                return;
            }
            zpVar.setVisibility(4);
            zpVar.setAlpha(0.0f);
            return;
        }
        zpVar.setVisibility(0);
        if (z4) {
            zpVar.animate().alpha(1.0f).setDuration(180L).start();
        } else {
            zpVar.setAlpha(1.0f);
        }
    }
}
