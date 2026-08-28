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
public final class sp extends org.telegram.ui.ActionBar.f3 {
    public final Drawable f32533b;
    public final pp f32534c;
    public final rp d;
    public final boolean f32535e;
    public int f32536f;
    public final int[] h;
    public final int f32537n;
    public int f32538r;
    public boolean f32539s;
    public org.telegram.ui.wa v;

    public sp(Activity activity, TLRPC.Chat chat) {
        super(activity, null, false, false);
        int i9;
        this.h = new int[2];
        this.f32535e = true;
        setApplyBottomPadding(false);
        TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(chat.f22380id);
        if (chatFull != null) {
            i9 = chatFull.ttl_period;
        } else {
            i9 = 0;
        }
        if (i9 == 0) {
            this.f32537n = 0;
            this.f32538r = 0;
        } else if (i9 == 86400) {
            this.f32537n = 1;
            this.f32538r = 1;
        } else if (i9 == 604800) {
            this.f32537n = 2;
            this.f32538r = 2;
        } else {
            this.f32537n = 3;
            this.f32538r = 3;
        }
        Drawable mutate = activity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f32533b = mutate;
        int i10 = org.telegram.ui.ActionBar.f6.f23072h5;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i10), PorterDuff.Mode.MULTIPLY));
        op opVar = new op(this, activity);
        opVar.setFillViewport(true);
        opVar.setWillNotDraw(false);
        opVar.setClipToPadding(false);
        int i11 = this.backgroundPaddingLeft;
        opVar.setPadding(i11, 0, i11, 0);
        this.containerView = opVar;
        pp ppVar = new pp(this, activity);
        this.f32534c = ppVar;
        ppVar.setOrientation(1);
        opVar.addView(ppVar, g7.e6.x(-1, -2, 80));
        setCustomView(ppVar);
        UserConfig.getInstance(this.currentAccount).getClientUserId();
        int i12 = MessagesController.getInstance(this.currentAccount).revokeTimeLimit;
        ?? imageView = new ImageView(activity);
        imageView.setAutoRepeat(false);
        imageView.f(R.raw.utyan_private, 120, 120, null);
        imageView.setPadding(0, AndroidUtilities.dp(20.0f), 0, 0);
        imageView.d();
        ppVar.addView((View) imageView, g7.e6.t(160, 160, 49, 17, 0, 17, 0));
        TextView textView = new TextView(activity);
        org.telegram.messenger.ll.k(24.0f, 1, textView);
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.f23108j5));
        textView.setText(LocaleController.getString(R.string.AutoDeleteAlertTitle));
        ppVar.addView(textView, g7.e6.t(-2, -2, 49, 17, 18, 17, 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.f23247r5));
        textView2.setGravity(1);
        if (ChatObject.isChannel(chat) && !chat.megagroup) {
            textView2.setText(LocaleController.getString(R.string.AutoDeleteAlertChannelInfo));
        } else {
            textView2.setText(LocaleController.getString(R.string.AutoDeleteAlertGroupInfo));
        }
        ppVar.addView(textView2, g7.e6.t(-2, -2, 49, 30, 22, 30, 20));
        bv0 bv0Var = new bv0(activity, null);
        bv0Var.setCallback(new qp(this, opVar));
        bv0Var.b(this.f32537n, null, LocaleController.getString(R.string.AutoDeleteNever), LocaleController.getString(R.string.AutoDelete24Hours), LocaleController.getString(R.string.AutoDelete7Days), LocaleController.getString(R.string.AutoDelete1Month));
        ppVar.addView(bv0Var, g7.e6.k(0.0f, 8.0f, 0.0f, 0.0f, -1, -2));
        FrameLayout frameLayout = new FrameLayout(activity);
        fq fqVar = new fq(new ColorDrawable(getThemedColor(org.telegram.ui.ActionBar.f6.f22947a7)), org.telegram.ui.ActionBar.f6.V0(activity, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.f6.f22966b7));
        fqVar.f28550w = true;
        frameLayout.setBackgroundDrawable(fqVar);
        ppVar.addView(frameLayout, g7.e6.n(-1, -2));
        org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(activity, null);
        b9Var.setText(LocaleController.getString(R.string.AutoDeleteInfo));
        frameLayout.addView(b9Var);
        rp rpVar = new rp(activity);
        this.d = rpVar;
        rpVar.setBackgroundColor(getThemedColor(i10));
        rpVar.setText(LocaleController.getString(R.string.AutoDeleteSet));
        rpVar.f32239a.setOnClickListener(new f0(this, 9));
        frameLayout.addView(rpVar);
        p(false);
    }

    public static void m(sp spVar) {
        float f10;
        View childAt = spVar.f32534c.getChildAt(0);
        int[] iArr = spVar.h;
        childAt.getLocationInWindow(iArr);
        int i9 = iArr[1];
        if (spVar.f32535e) {
            f10 = 6.0f;
        } else {
            f10 = 19.0f;
        }
        int max = Math.max(i9 - AndroidUtilities.dp(f10), 0);
        if (spVar.f32536f != max) {
            spVar.f32536f = max;
            spVar.containerView.invalidate();
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    public final void p(boolean z10) {
        int i9 = this.f32537n;
        int i10 = this.f32538r;
        rp rpVar = this.d;
        if (i9 == i10 && !this.f32535e) {
            if (z10) {
                rpVar.animate().alpha(0.0f).setDuration(180L).start();
                return;
            }
            rpVar.setVisibility(4);
            rpVar.setAlpha(0.0f);
            return;
        }
        rpVar.setVisibility(0);
        if (z10) {
            rpVar.animate().alpha(1.0f).setDuration(180L).start();
        } else {
            rpVar.setAlpha(1.0f);
        }
    }
}
