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
public final class dq extends org.telegram.ui.ActionBar.e3 {
    public final Drawable f23710b;
    public final aq f23711c;
    public final cq d;
    public final boolean e;
    public int f23712f;
    public final int[] h;
    public final int f23713n;
    public int f23714r;
    public boolean f23715s;
    public org.telegram.ui.cb v;

    public dq(Activity activity, TLRPC.Chat chat) {
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
            this.f23713n = 0;
            this.f23714r = 0;
        } else if (i10 == 86400) {
            this.f23713n = 1;
            this.f23714r = 1;
        } else if (i10 == 604800) {
            this.f23713n = 2;
            this.f23714r = 2;
        } else {
            this.f23713n = 3;
            this.f23714r = 3;
        }
        Drawable mutate = activity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f23710b = mutate;
        int i11 = org.telegram.ui.ActionBar.h6.f19129h5;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i11), PorterDuff.Mode.MULTIPLY));
        zp zpVar = new zp(this, activity);
        zpVar.setFillViewport(true);
        zpVar.setWillNotDraw(false);
        zpVar.setClipToPadding(false);
        int i12 = this.backgroundPaddingLeft;
        zpVar.setPadding(i12, 0, i12, 0);
        this.containerView = zpVar;
        aq aqVar = new aq(this, activity);
        this.f23711c = aqVar;
        aqVar.setOrientation(1);
        zpVar.addView(aqVar, w7.y5.x(-1, -2, 80));
        setCustomView(aqVar);
        UserConfig.getInstance(this.currentAccount).getClientUserId();
        int i13 = MessagesController.getInstance(this.currentAccount).revokeTimeLimit;
        ?? imageView = new ImageView(activity);
        imageView.setAutoRepeat(false);
        imageView.f(R.raw.utyan_private, 120, 120, null);
        imageView.setPadding(0, AndroidUtilities.dp(20.0f), 0, 0);
        imageView.d();
        aqVar.addView((View) imageView, w7.y5.t(160, 160, 49, 17, 0, 17, 0));
        TextView textView = new TextView(activity);
        org.telegram.messenger.ok.k(24.0f, 1, textView);
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f19165j5));
        textView.setText(LocaleController.getString(R.string.AutoDeleteAlertTitle));
        aqVar.addView(textView, w7.y5.t(-2, -2, 49, 17, 18, 17, 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f19315r5));
        textView2.setGravity(1);
        if (ChatObject.isChannel(chat) && !chat.megagroup) {
            textView2.setText(LocaleController.getString(R.string.AutoDeleteAlertChannelInfo));
        } else {
            textView2.setText(LocaleController.getString(R.string.AutoDeleteAlertGroupInfo));
        }
        aqVar.addView(textView2, w7.y5.t(-2, -2, 49, 30, 22, 30, 20));
        ew0 ew0Var = new ew0(activity, null);
        ew0Var.setCallback(new bq(this, zpVar));
        ew0Var.b(this.f23713n, null, LocaleController.getString(R.string.AutoDeleteNever), LocaleController.getString(R.string.AutoDelete24Hours), LocaleController.getString(R.string.AutoDelete7Days), LocaleController.getString(R.string.AutoDelete1Month));
        aqVar.addView(ew0Var, w7.y5.k(0.0f, 8.0f, 0.0f, 0.0f, -1, -2));
        FrameLayout frameLayout = new FrameLayout(activity);
        qq qqVar = new qq(new ColorDrawable(getThemedColor(org.telegram.ui.ActionBar.h6.f19003a7)), org.telegram.ui.ActionBar.h6.V0(activity, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.f19023b7));
        qqVar.f27739w = true;
        frameLayout.setBackgroundDrawable(qqVar);
        aqVar.addView(frameLayout, w7.y5.n(-1, -2));
        org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(activity, null);
        e9Var.setText(LocaleController.getString(R.string.AutoDeleteInfo));
        frameLayout.addView(e9Var);
        cq cqVar = new cq(activity);
        this.d = cqVar;
        cqVar.setBackgroundColor(getThemedColor(i11));
        cqVar.setText(LocaleController.getString(R.string.AutoDeleteSet));
        cqVar.f23374a.setOnClickListener(new f0(this, 9));
        frameLayout.addView(cqVar);
        p(false);
    }

    public static void m(dq dqVar) {
        float f7;
        View childAt = dqVar.f23711c.getChildAt(0);
        int[] iArr = dqVar.h;
        childAt.getLocationInWindow(iArr);
        int i10 = iArr[1];
        if (dqVar.e) {
            f7 = 6.0f;
        } else {
            f7 = 19.0f;
        }
        int max = Math.max(i10 - AndroidUtilities.dp(f7), 0);
        if (dqVar.f23712f != max) {
            dqVar.f23712f = max;
            dqVar.containerView.invalidate();
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    public final void p(boolean z10) {
        int i10 = this.f23713n;
        int i11 = this.f23714r;
        cq cqVar = this.d;
        if (i10 == i11 && !this.e) {
            if (z10) {
                cqVar.animate().alpha(0.0f).setDuration(180L).start();
                return;
            }
            cqVar.setVisibility(4);
            cqVar.setAlpha(0.0f);
            return;
        }
        cqVar.setVisibility(0);
        if (z10) {
            cqVar.animate().alpha(1.0f).setDuration(180L).start();
        } else {
            cqVar.setAlpha(1.0f);
        }
    }
}
