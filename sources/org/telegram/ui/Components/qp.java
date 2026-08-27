package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

public final class qp extends org.telegram.ui.ActionBar.e3 {

    public final Drawable f31953b;

    public final np f31954c;
    public final pp d;

    public final boolean f31955e;

    public int f31956f;
    public final int[] h;

    public final int f31957n;

    public int f31958r;

    public boolean f31959s;
    public org.telegram.ui.xa v;

    public qp(Activity activity, TLRPC.Chat chat) {
        super(activity, null, false, false);
        this.h = new int[2];
        this.f31955e = true;
        setApplyBottomPadding(false);
        TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(chat.f22380id);
        int i10 = chatFull != null ? chatFull.ttl_period : 0;
        if (i10 == 0) {
            this.f31957n = 0;
            this.f31958r = 0;
        } else if (i10 == 86400) {
            this.f31957n = 1;
            this.f31958r = 1;
        } else if (i10 == 604800) {
            this.f31957n = 2;
            this.f31958r = 2;
        } else {
            this.f31957n = 3;
            this.f31958r = 3;
        }
        Drawable drawableMutate = activity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f31953b = drawableMutate;
        int i11 = org.telegram.ui.ActionBar.g6.f23124h5;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i11), PorterDuff.Mode.MULTIPLY));
        mp mpVar = new mp(this, activity);
        mpVar.setFillViewport(true);
        mpVar.setWillNotDraw(false);
        mpVar.setClipToPadding(false);
        int i12 = this.backgroundPaddingLeft;
        mpVar.setPadding(i12, 0, i12, 0);
        this.containerView = mpVar;
        np npVar = new np(this, activity);
        this.f31954c = npVar;
        npVar.setOrientation(1);
        mpVar.addView(npVar, h7.z5.x(-1, -2, 80));
        setCustomView(npVar);
        UserConfig.getInstance(this.currentAccount).getClientUserId();
        int i13 = MessagesController.getInstance(this.currentAccount).revokeTimeLimit;
        ri0 ri0Var = new ri0(activity);
        ri0Var.setAutoRepeat(false);
        ri0Var.f(R.raw.utyan_private, 120, 120, null);
        ri0Var.setPadding(0, AndroidUtilities.dp(20.0f), 0, 0);
        ri0Var.d();
        npVar.addView(ri0Var, h7.z5.t(160, 160, 49, 17, 0, 17, 0));
        TextView textView = new TextView(activity);
        org.telegram.messenger.rl.h(24.0f, 1, textView);
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23161j5));
        textView.setText(LocaleController.getString(R.string.AutoDeleteAlertTitle));
        npVar.addView(textView, h7.z5.t(-2, -2, 49, 17, 18, 17, 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23300r5));
        textView2.setGravity(1);
        if (!ChatObject.isChannel(chat) || chat.megagroup) {
            textView2.setText(LocaleController.getString(R.string.AutoDeleteAlertGroupInfo));
        } else {
            textView2.setText(LocaleController.getString(R.string.AutoDeleteAlertChannelInfo));
        }
        npVar.addView(textView2, h7.z5.t(-2, -2, 49, 30, 22, 30, 20));
        dv0 dv0Var = new dv0(activity, null);
        dv0Var.setCallback(new op(this, mpVar));
        dv0Var.b(this.f31957n, null, LocaleController.getString(R.string.AutoDeleteNever), LocaleController.getString(R.string.AutoDelete24Hours), LocaleController.getString(R.string.AutoDelete7Days), LocaleController.getString(R.string.AutoDelete1Month));
        npVar.addView(dv0Var, h7.z5.k(0.0f, 8.0f, 0.0f, 0.0f, -1, -2));
        FrameLayout frameLayout = new FrameLayout(activity);
        dq dqVar = new dq(new ColorDrawable(getThemedColor(org.telegram.ui.ActionBar.g6.f22999a7)), org.telegram.ui.ActionBar.g6.V0(activity, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f23018b7));
        dqVar.f27828w = true;
        frameLayout.setBackgroundDrawable(dqVar);
        npVar.addView(frameLayout, h7.z5.n(-1, -2));
        org.telegram.ui.Cells.x8 x8Var = new org.telegram.ui.Cells.x8(activity, null);
        x8Var.setText(LocaleController.getString(R.string.AutoDeleteInfo));
        frameLayout.addView(x8Var);
        pp ppVar = new pp(activity);
        this.d = ppVar;
        ppVar.setBackgroundColor(getThemedColor(i11));
        ppVar.setText(LocaleController.getString(R.string.AutoDeleteSet));
        ppVar.f31645a.setOnClickListener(new f0(this, 9));
        frameLayout.addView(ppVar);
        q(false);
    }

    public static void m(qp qpVar) {
        View childAt = qpVar.f31954c.getChildAt(0);
        int[] iArr = qpVar.h;
        childAt.getLocationInWindow(iArr);
        int iMax = Math.max(iArr[1] - AndroidUtilities.dp(qpVar.f31955e ? 6.0f : 19.0f), 0);
        if (qpVar.f31956f != iMax) {
            qpVar.f31956f = iMax;
            qpVar.containerView.invalidate();
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    public final void q(boolean z10) {
        int i10 = this.f31957n;
        int i11 = this.f31958r;
        pp ppVar = this.d;
        if (i10 != i11 || this.f31955e) {
            ppVar.setVisibility(0);
            if (z10) {
                ppVar.animate().alpha(1.0f).setDuration(180L).start();
                return;
            } else {
                ppVar.setAlpha(1.0f);
                return;
            }
        }
        if (z10) {
            ppVar.animate().alpha(0.0f).setDuration(180L).start();
        } else {
            ppVar.setVisibility(4);
            ppVar.setAlpha(0.0f);
        }
    }
}
