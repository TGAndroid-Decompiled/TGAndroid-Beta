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
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class mq extends org.telegram.ui.ActionBar.h3 {
    public int E;
    public final Drawable f28737b;
    public final ArrayList f28738c;
    public final jq d;
    public final lq e;
    public final boolean f28739f;
    public int h;
    public final int[] f28740n;
    public final int f28741r;
    public int f28742s;
    public boolean v;
    public org.telegram.ui.db f28743w;
    public int f28744x;
    public int f28745y;

    public mq(Activity activity, TLRPC.Chat chat) {
        super(1, (Context) activity, (org.telegram.ui.ActionBar.g6) null, false);
        int i10;
        ArrayList arrayList = new ArrayList();
        this.f28738c = arrayList;
        this.f28740n = new int[2];
        this.f28739f = true;
        setApplyBottomPadding(false);
        TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(chat.f20343id);
        if (chatFull != null) {
            i10 = chatFull.ttl_period;
        } else {
            i10 = 0;
        }
        if (i10 == 0) {
            this.f28741r = 0;
            this.f28742s = 0;
        } else if (i10 == 86400) {
            this.f28741r = 1;
            this.f28742s = 1;
        } else if (i10 == 604800) {
            this.f28741r = 2;
            this.f28742s = 2;
        } else {
            this.f28741r = 3;
            this.f28742s = 3;
        }
        Drawable mutate = activity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f28737b = mutate;
        int i11 = org.telegram.ui.ActionBar.k6.f21254h5;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i11), PorterDuff.Mode.MULTIPLY));
        iq iqVar = new iq(this, activity);
        iqVar.setFillViewport(true);
        iqVar.setWillNotDraw(false);
        iqVar.setClipToPadding(false);
        int i12 = this.backgroundPaddingLeft;
        iqVar.setPadding(i12, 0, i12, 0);
        this.containerView = iqVar;
        jq jqVar = new jq(this, activity);
        this.d = jqVar;
        jqVar.setOrientation(1);
        iqVar.addView(jqVar, w7.z5.x(-1, -2, 80));
        setCustomView(jqVar);
        UserConfig.getInstance(this.currentAccount).getClientUserId();
        int i13 = MessagesController.getInstance(this.currentAccount).revokeTimeLimit;
        ?? imageView = new ImageView(activity);
        imageView.setAutoRepeat(false);
        imageView.f(R.raw.utyan_private, 120, 120, null);
        imageView.setPadding(0, AndroidUtilities.dp(20.0f), 0, 0);
        imageView.d();
        jqVar.addView((View) imageView, w7.z5.t(160, 160, 49, 17, 0, 17, 0));
        TextView textView = new TextView(activity);
        org.telegram.messenger.sl.k(24.0f, 1, textView);
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21289j5, null);
        textView.setText(LocaleController.getString(R.string.AutoDeleteAlertTitle));
        jqVar.addView(textView, w7.z5.t(-2, -2, 49, 17, 18, 17, 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.f21439r5, null);
        textView2.setGravity(1);
        if (ChatObject.isChannel(chat) && !chat.megagroup) {
            textView2.setText(LocaleController.getString(R.string.AutoDeleteAlertChannelInfo));
        } else {
            textView2.setText(LocaleController.getString(R.string.AutoDeleteAlertGroupInfo));
        }
        jqVar.addView(textView2, w7.z5.t(-2, -2, 49, 30, 22, 30, 20));
        sw0 sw0Var = new sw0(activity, null);
        sw0Var.setCallback(new kq(this, iqVar));
        sw0Var.b(this.f28741r, null, LocaleController.getString(R.string.AutoDeleteNever), LocaleController.getString(R.string.AutoDelete24Hours), LocaleController.getString(R.string.AutoDelete7Days), LocaleController.getString(R.string.AutoDelete1Month));
        jqVar.addView(sw0Var, w7.z5.k(0.0f, 8.0f, 0.0f, 0.0f, -1, -2));
        FrameLayout frameLayout = new FrameLayout(activity);
        yq yqVar = new yq(new ColorDrawable(getThemedColor(org.telegram.ui.ActionBar.k6.f21125a7)), org.telegram.ui.ActionBar.k6.X0(activity, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.f21145b7));
        yqVar.f33019w = true;
        frameLayout.setBackgroundDrawable(yqVar);
        arrayList.add(yqVar);
        jqVar.addView(frameLayout, w7.z5.n(-1, -2));
        org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(activity, null);
        e9Var.setText(LocaleController.getString(R.string.AutoDeleteInfo));
        frameLayout.addView(e9Var);
        lq lqVar = new lq(activity);
        this.e = lqVar;
        org.telegram.ui.ActionBar.r6.i(i11, lqVar, null);
        lqVar.setText(LocaleController.getString(R.string.AutoDeleteSet));
        lqVar.f28408a.setOnClickListener(new f0(this, 8));
        frameLayout.addView(lqVar);
        q(false);
    }

    public static void m(mq mqVar) {
        float f7;
        View childAt = mqVar.d.getChildAt(0);
        int[] iArr = mqVar.f28740n;
        childAt.getLocationInWindow(iArr);
        int i10 = iArr[1];
        if (mqVar.f28739f) {
            f7 = 6.0f;
        } else {
            f7 = 19.0f;
        }
        int max = Math.max(i10 - AndroidUtilities.dp(f7), 0);
        if (mqVar.h != max) {
            mqVar.h = max;
            mqVar.containerView.invalidate();
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void onThemeColorsChanged() {
        Drawable drawable;
        ArrayList arrayList = this.f28738c;
        try {
            super.onThemeColorsChanged();
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f21125a7);
            int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.k6.f21145b7);
            if (themedColor == this.f28745y) {
                if (themedColor2 != this.E) {
                }
                int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.k6.f21254h5);
                drawable = this.f28737b;
                if (drawable == null && themedColor3 != this.f28744x) {
                    this.f28744x = themedColor3;
                    drawable.setColorFilter(new PorterDuffColorFilter(themedColor3, PorterDuff.Mode.MULTIPLY));
                    return;
                }
            }
            this.f28745y = themedColor;
            this.E = themedColor2;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                yq yqVar = (yq) arrayList.get(i10);
                org.telegram.ui.ActionBar.k6.y1(yqVar, themedColor, false);
                if (yqVar.f33013b != null) {
                    org.telegram.ui.ActionBar.k6.y1(yqVar, themedColor2, true);
                }
                yqVar.invalidateSelf();
            }
            int themedColor32 = getThemedColor(org.telegram.ui.ActionBar.k6.f21254h5);
            drawable = this.f28737b;
            if (drawable == null) {
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void q(boolean z10) {
        int i10 = this.f28741r;
        int i11 = this.f28742s;
        lq lqVar = this.e;
        if (i10 == i11 && !this.f28739f) {
            if (z10) {
                lqVar.animate().alpha(0.0f).setDuration(180L).start();
                return;
            }
            lqVar.setVisibility(4);
            lqVar.setAlpha(0.0f);
            return;
        }
        lqVar.setVisibility(0);
        if (z10) {
            lqVar.animate().alpha(1.0f).setDuration(180L).start();
        } else {
            lqVar.setAlpha(1.0f);
        }
    }
}
