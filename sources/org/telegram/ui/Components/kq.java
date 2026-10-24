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
public final class kq extends org.telegram.ui.ActionBar.h3 {
    public int E;
    public final Drawable f28065b;
    public final ArrayList f28066c;
    public final hq d;
    public final jq e;
    public final boolean f28067f;
    public int h;
    public final int[] f28068n;
    public final int f28069r;
    public int f28070s;
    public boolean v;
    public org.telegram.ui.db f28071w;
    public int f28072x;
    public int f28073y;

    public kq(Activity activity, TLRPC.Chat chat) {
        super(1, (Context) activity, (org.telegram.ui.ActionBar.g6) null, false);
        int i10;
        ArrayList arrayList = new ArrayList();
        this.f28066c = arrayList;
        this.f28068n = new int[2];
        this.f28067f = true;
        setApplyBottomPadding(false);
        TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(chat.f20344id);
        if (chatFull != null) {
            i10 = chatFull.ttl_period;
        } else {
            i10 = 0;
        }
        if (i10 == 0) {
            this.f28069r = 0;
            this.f28070s = 0;
        } else if (i10 == 86400) {
            this.f28069r = 1;
            this.f28070s = 1;
        } else if (i10 == 604800) {
            this.f28069r = 2;
            this.f28070s = 2;
        } else {
            this.f28069r = 3;
            this.f28070s = 3;
        }
        Drawable mutate = activity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f28065b = mutate;
        int i11 = org.telegram.ui.ActionBar.k6.f21255h5;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i11), PorterDuff.Mode.MULTIPLY));
        gq gqVar = new gq(this, activity);
        gqVar.setFillViewport(true);
        gqVar.setWillNotDraw(false);
        gqVar.setClipToPadding(false);
        int i12 = this.backgroundPaddingLeft;
        gqVar.setPadding(i12, 0, i12, 0);
        this.containerView = gqVar;
        hq hqVar = new hq(this, activity);
        this.d = hqVar;
        hqVar.setOrientation(1);
        gqVar.addView(hqVar, w7.z5.x(-1, -2, 80));
        setCustomView(hqVar);
        UserConfig.getInstance(this.currentAccount).getClientUserId();
        int i13 = MessagesController.getInstance(this.currentAccount).revokeTimeLimit;
        ?? imageView = new ImageView(activity);
        imageView.setAutoRepeat(false);
        imageView.f(R.raw.utyan_private, 120, 120, null);
        imageView.setPadding(0, AndroidUtilities.dp(20.0f), 0, 0);
        imageView.d();
        hqVar.addView((View) imageView, w7.z5.t(160, 160, 49, 17, 0, 17, 0));
        TextView textView = new TextView(activity);
        org.telegram.messenger.tl.k(24.0f, 1, textView);
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21290j5, null);
        textView.setText(LocaleController.getString(R.string.AutoDeleteAlertTitle));
        hqVar.addView(textView, w7.z5.t(-2, -2, 49, 17, 18, 17, 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.f21440r5, null);
        textView2.setGravity(1);
        if (ChatObject.isChannel(chat) && !chat.megagroup) {
            textView2.setText(LocaleController.getString(R.string.AutoDeleteAlertChannelInfo));
        } else {
            textView2.setText(LocaleController.getString(R.string.AutoDeleteAlertGroupInfo));
        }
        hqVar.addView(textView2, w7.z5.t(-2, -2, 49, 30, 22, 30, 20));
        rw0 rw0Var = new rw0(activity, null);
        rw0Var.setCallback(new iq(this, gqVar));
        rw0Var.b(this.f28069r, null, LocaleController.getString(R.string.AutoDeleteNever), LocaleController.getString(R.string.AutoDelete24Hours), LocaleController.getString(R.string.AutoDelete7Days), LocaleController.getString(R.string.AutoDelete1Month));
        hqVar.addView(rw0Var, w7.z5.k(0.0f, 8.0f, 0.0f, 0.0f, -1, -2));
        FrameLayout frameLayout = new FrameLayout(activity);
        wq wqVar = new wq(new ColorDrawable(getThemedColor(org.telegram.ui.ActionBar.k6.f21126a7)), org.telegram.ui.ActionBar.k6.X0(activity, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.f21146b7));
        wqVar.f32329w = true;
        frameLayout.setBackgroundDrawable(wqVar);
        arrayList.add(wqVar);
        hqVar.addView(frameLayout, w7.z5.n(-1, -2));
        org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(activity, null);
        e9Var.setText(LocaleController.getString(R.string.AutoDeleteInfo));
        frameLayout.addView(e9Var);
        jq jqVar = new jq(activity);
        this.e = jqVar;
        org.telegram.ui.ActionBar.r6.i(i11, jqVar, null);
        jqVar.setText(LocaleController.getString(R.string.AutoDeleteSet));
        jqVar.f27785a.setOnClickListener(new f0(this, 8));
        frameLayout.addView(jqVar);
        q(false);
    }

    public static void m(kq kqVar) {
        float f7;
        View childAt = kqVar.d.getChildAt(0);
        int[] iArr = kqVar.f28068n;
        childAt.getLocationInWindow(iArr);
        int i10 = iArr[1];
        if (kqVar.f28067f) {
            f7 = 6.0f;
        } else {
            f7 = 19.0f;
        }
        int max = Math.max(i10 - AndroidUtilities.dp(f7), 0);
        if (kqVar.h != max) {
            kqVar.h = max;
            kqVar.containerView.invalidate();
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void onThemeColorsChanged() {
        Drawable drawable;
        ArrayList arrayList = this.f28066c;
        try {
            super.onThemeColorsChanged();
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f21126a7);
            int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.k6.f21146b7);
            if (themedColor == this.f28073y) {
                if (themedColor2 != this.E) {
                }
                int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.k6.f21255h5);
                drawable = this.f28065b;
                if (drawable == null && themedColor3 != this.f28072x) {
                    this.f28072x = themedColor3;
                    drawable.setColorFilter(new PorterDuffColorFilter(themedColor3, PorterDuff.Mode.MULTIPLY));
                    return;
                }
            }
            this.f28073y = themedColor;
            this.E = themedColor2;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                wq wqVar = (wq) arrayList.get(i10);
                org.telegram.ui.ActionBar.k6.y1(wqVar, themedColor, false);
                if (wqVar.f32323b != null) {
                    org.telegram.ui.ActionBar.k6.y1(wqVar, themedColor2, true);
                }
                wqVar.invalidateSelf();
            }
            int themedColor32 = getThemedColor(org.telegram.ui.ActionBar.k6.f21255h5);
            drawable = this.f28065b;
            if (drawable == null) {
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void q(boolean z10) {
        int i10 = this.f28069r;
        int i11 = this.f28070s;
        jq jqVar = this.e;
        if (i10 == i11 && !this.f28067f) {
            if (z10) {
                jqVar.animate().alpha(0.0f).setDuration(180L).start();
                return;
            }
            jqVar.setVisibility(4);
            jqVar.setAlpha(0.0f);
            return;
        }
        jqVar.setVisibility(0);
        if (z10) {
            jqVar.animate().alpha(1.0f).setDuration(180L).start();
        } else {
            jqVar.setAlpha(1.0f);
        }
    }
}
