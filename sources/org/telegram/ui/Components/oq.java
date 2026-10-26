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
public final class oq extends org.telegram.ui.ActionBar.k3 {
    public int E;
    public final Drawable f31355b;
    public final ArrayList f31356c;
    public final lq d;
    public final nq e;
    public final boolean f31357f;
    public int h;
    public final int[] f31358n;
    public final int f31359r;
    public int f31360s;
    public boolean v;
    public org.telegram.ui.eb f31361w;
    public int f31362x;
    public int f31363y;

    public oq(Activity activity, TLRPC.Chat chat) {
        super(1, (Context) activity, (org.telegram.ui.ActionBar.u6) null, false);
        int i10;
        ArrayList arrayList = new ArrayList();
        this.f31356c = arrayList;
        this.f31358n = new int[2];
        this.f31357f = true;
        setApplyBottomPadding(false);
        TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(chat.f22027id);
        if (chatFull != null) {
            i10 = chatFull.ttl_period;
        } else {
            i10 = 0;
        }
        if (i10 == 0) {
            this.f31359r = 0;
            this.f31360s = 0;
        } else if (i10 == 86400) {
            this.f31359r = 1;
            this.f31360s = 1;
        } else if (i10 == 604800) {
            this.f31359r = 2;
            this.f31360s = 2;
        } else {
            this.f31359r = 3;
            this.f31360s = 3;
        }
        Drawable mutate = activity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f31355b = mutate;
        int i11 = org.telegram.ui.ActionBar.y6.f23427h5;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i11), PorterDuff.Mode.MULTIPLY));
        kq kqVar = new kq(this, activity);
        kqVar.setFillViewport(true);
        kqVar.setWillNotDraw(false);
        kqVar.setClipToPadding(false);
        int i12 = this.backgroundPaddingLeft;
        kqVar.setPadding(i12, 0, i12, 0);
        this.containerView = kqVar;
        lq lqVar = new lq(this, activity);
        this.d = lqVar;
        lqVar.setOrientation(1);
        kqVar.addView(lqVar, gb1.B(-1, -2, 80));
        setCustomView(lqVar);
        UserConfig.getInstance(this.currentAccount).getClientUserId();
        int i13 = MessagesController.getInstance(this.currentAccount).revokeTimeLimit;
        ?? imageView = new ImageView(activity);
        imageView.setAutoRepeat(false);
        imageView.f(R.raw.utyan_private, 120, 120, null);
        imageView.setPadding(0, AndroidUtilities.dp(20.0f), 0, 0);
        imageView.d();
        lqVar.addView((View) imageView, gb1.x(160, 160, 49, 17, 0, 17, 0));
        TextView textView = new TextView(activity);
        org.telegram.messenger.vh.j(24.0f, 1, textView);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23464j5, null);
        textView.setText(LocaleController.getString(R.string.AutoDeleteAlertTitle));
        lqVar.addView(textView, gb1.x(-2, -2, 49, 17, 18, 17, 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.f23614r5, null);
        textView2.setGravity(1);
        if (ChatObject.isChannel(chat) && !chat.megagroup) {
            textView2.setText(LocaleController.getString(R.string.AutoDeleteAlertChannelInfo));
        } else {
            textView2.setText(LocaleController.getString(R.string.AutoDeleteAlertGroupInfo));
        }
        lqVar.addView(textView2, gb1.x(-2, -2, 49, 30, 22, 30, 20));
        zw0 zw0Var = new zw0(activity, null);
        zw0Var.setCallback(new mq(this, kqVar));
        zw0Var.b(this.f31359r, null, LocaleController.getString(R.string.AutoDeleteNever), LocaleController.getString(R.string.AutoDelete24Hours), LocaleController.getString(R.string.AutoDelete7Days), LocaleController.getString(R.string.AutoDelete1Month));
        lqVar.addView(zw0Var, gb1.o(0.0f, 8.0f, 0.0f, 0.0f, -1, -2));
        FrameLayout frameLayout = new FrameLayout(activity);
        ar arVar = new ar(new ColorDrawable(getThemedColor(org.telegram.ui.ActionBar.y6.f23299a7)), org.telegram.ui.ActionBar.y6.X0(activity, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.y6.f23318b7));
        arVar.f26599w = true;
        frameLayout.setBackgroundDrawable(arVar);
        arrayList.add(arVar);
        lqVar.addView(frameLayout, gb1.r(-1, -2));
        org.telegram.ui.Cells.i9 i9Var = new org.telegram.ui.Cells.i9(activity, null);
        i9Var.setText(LocaleController.getString(R.string.AutoDeleteInfo));
        frameLayout.addView(i9Var);
        nq nqVar = new nq(activity);
        this.e = nqVar;
        org.telegram.ui.ActionBar.f7.i(i11, nqVar, null);
        nqVar.setText(LocaleController.getString(R.string.AutoDeleteSet));
        nqVar.f31062a.setOnClickListener(new f0(this, 8));
        frameLayout.addView(nqVar);
        p(false);
    }

    public static void m(oq oqVar) {
        float f7;
        View childAt = oqVar.d.getChildAt(0);
        int[] iArr = oqVar.f31358n;
        childAt.getLocationInWindow(iArr);
        int i10 = iArr[1];
        if (oqVar.f31357f) {
            f7 = 6.0f;
        } else {
            f7 = 19.0f;
        }
        int max = Math.max(i10 - AndroidUtilities.dp(f7), 0);
        if (oqVar.h != max) {
            oqVar.h = max;
            oqVar.containerView.invalidate();
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void onThemeColorsChanged() {
        Drawable drawable;
        ArrayList arrayList = this.f31356c;
        try {
            super.onThemeColorsChanged();
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.f23299a7);
            int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.y6.f23318b7);
            if (themedColor == this.f31363y) {
                if (themedColor2 != this.E) {
                }
                int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.y6.f23427h5);
                drawable = this.f31355b;
                if (drawable == null && themedColor3 != this.f31362x) {
                    this.f31362x = themedColor3;
                    drawable.setColorFilter(new PorterDuffColorFilter(themedColor3, PorterDuff.Mode.MULTIPLY));
                    return;
                }
            }
            this.f31363y = themedColor;
            this.E = themedColor2;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ar arVar = (ar) arrayList.get(i10);
                org.telegram.ui.ActionBar.y6.y1(arVar, themedColor, false);
                if (arVar.f26593b != null) {
                    org.telegram.ui.ActionBar.y6.y1(arVar, themedColor2, true);
                }
                arVar.invalidateSelf();
            }
            int themedColor32 = getThemedColor(org.telegram.ui.ActionBar.y6.f23427h5);
            drawable = this.f31355b;
            if (drawable == null) {
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void p(boolean z10) {
        int i10 = this.f31359r;
        int i11 = this.f31360s;
        nq nqVar = this.e;
        if (i10 == i11 && !this.f31357f) {
            if (z10) {
                nqVar.animate().alpha(0.0f).setDuration(180L).start();
                return;
            }
            nqVar.setVisibility(4);
            nqVar.setAlpha(0.0f);
            return;
        }
        nqVar.setVisibility(0);
        if (z10) {
            nqVar.animate().alpha(1.0f).setDuration(180L).start();
        } else {
            nqVar.setAlpha(1.0f);
        }
    }
}
