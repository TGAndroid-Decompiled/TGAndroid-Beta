package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class bw0 extends org.telegram.ui.ActionBar.h3 implements NotificationCenter.NotificationCenterDelegate {
    public final ai.u1 f25159b;
    public final zv0 f25160c;
    public final Drawable d;
    public TextView e;
    public int f25161f;
    public boolean h;
    public final aw0 f25162n;
    public int f25163r;

    public bw0(Context context, aw0 aw0Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(1, context, g6Var, false);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.liveLocationsChanged);
        this.f25162n = aw0Var;
        fixNavigationBar();
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.d = mutate;
        int i10 = org.telegram.ui.ActionBar.k6.f21254h5;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i10), PorterDuff.Mode.MULTIPLY));
        ah.x xVar = new ah.x(this, context, 22);
        this.containerView = xVar;
        xVar.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i11, 0, i11, 0);
        ai.u1 u1Var = new ai.u1(this, context, 23);
        this.f25159b = u1Var;
        getContext();
        u1Var.setLayoutManager(new s4.b0(1, false));
        zv0 zv0Var = new zv0(this, context);
        this.f25160c = zv0Var;
        u1Var.setAdapter(zv0Var);
        u1Var.setVerticalScrollBarEnabled(false);
        u1Var.setClipToPadding(false);
        u1Var.setEnabled(true);
        org.telegram.ui.ActionBar.r6.m(u1Var, 21, org.telegram.ui.ActionBar.k6.A5, g6Var);
        u1Var.setOnScrollListener(new kv(this, 9));
        u1Var.setOnItemClickListener(new j(this, 13));
        this.containerView.addView(u1Var, w7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        View view = new View(context);
        view.setBackgroundResource(R.drawable.header_shadow_reverse);
        this.containerView.addView(view, w7.z5.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21183d6, frameLayout, null);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        int i12 = org.telegram.ui.ActionBar.k6.f21282ii;
        org.telegram.ui.ActionBar.r6.W(textView, i12, null);
        textView.setGravity(17);
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.x0(null, i12, false) & 268435455, 0, -1);
        org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i12, 15);
        textView.setBackground(g02);
        org.telegram.ui.ActionBar.r6.k(textView, g02, null, h, null);
        textView.setPadding(AndroidUtilities.dp(33.0f), 0, AndroidUtilities.dp(33.0f), 0);
        textView.setText(LocaleController.getString(R.string.Cancel).toUpperCase());
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, w7.z5.e(-2, -1, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        org.telegram.ui.Cells.y g03 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.x0(null, i12, false) & 268435455, 0, -1);
        org.telegram.ui.ActionBar.n6 h10 = org.telegram.ui.ActionBar.r6.h(i12, 15);
        linearLayout.setBackground(g03);
        org.telegram.ui.ActionBar.r6.k(linearLayout, g03, null, h10, null);
        linearLayout.setPadding(AndroidUtilities.dp(33.0f), 0, AndroidUtilities.dp(33.0f), 0);
        frameLayout.addView(linearLayout, w7.z5.e(-2, -1, 53));
        TextView textView2 = new TextView(context);
        org.telegram.messenger.sl.k(13.0f, 1, textView2);
        org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.f21339li, null);
        textView2.setGravity(17);
        int dp = AndroidUtilities.dp(11.0f);
        int i13 = org.telegram.ui.ActionBar.k6.f21321ki;
        ShapeDrawable c02 = org.telegram.ui.ActionBar.k6.c0(dp, org.telegram.ui.ActionBar.k6.x0(null, i13, false));
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i13);
        textView2.setBackground(c02);
        org.telegram.ui.ActionBar.r6.k(textView2, c02, O, null, null);
        textView2.setMinWidth(AndroidUtilities.dp(23.0f));
        textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(1.0f));
        TextView f7 = org.telegram.messenger.sl.f(linearLayout, textView2, w7.z5.t(-2, 23, 16, 0, 0, 10, 0), context);
        f7.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.W(f7, i12, null);
        f7.setGravity(17);
        f7.setCompoundDrawablePadding(AndroidUtilities.dp(8.0f));
        f7.setText(LocaleController.getString(R.string.Send).toUpperCase());
        f7.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(f7, w7.z5.q(-2, -2, 16));
        org.telegram.ui.ActionBar.r6.i(i10, frameLayout, g6Var);
        this.containerView.addView(frameLayout, w7.z5.e(-1, 48, 83));
        textView.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21421q7, g6Var);
        textView.setText(LocaleController.getString(R.string.StopAllLocationSharings));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final bw0 f33044b;

            {
                this.f33044b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        int i14 = 0;
                        while (true) {
                            bw0 bw0Var = this.f33044b;
                            if (i14 < 4) {
                                bw0Var.getClass();
                                LocationController.getInstance(i14).removeAllLocationSharings();
                                i14++;
                            } else {
                                bw0Var.dismiss();
                                return;
                            }
                        }
                    default:
                        this.f33044b.dismiss();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.r6.W(f7, org.telegram.ui.ActionBar.k6.f21365n5, g6Var);
        f7.setText(LocaleController.getString(R.string.Close).toUpperCase());
        linearLayout.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        linearLayout.setOnClickListener(new View.OnClickListener(this) {
            public final bw0 f33044b;

            {
                this.f33044b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        int i14 = 0;
                        while (true) {
                            bw0 bw0Var = this.f33044b;
                            if (i14 < 4) {
                                bw0Var.getClass();
                                LocationController.getInstance(i14).removeAllLocationSharings();
                                i14++;
                            } else {
                                bw0Var.dismiss();
                                return;
                            }
                        }
                    default:
                        this.f33044b.dismiss();
                        return;
                }
            }
        });
        textView2.setVisibility(8);
        zv0Var.l();
    }

    public static void m(bw0 bw0Var) {
        ai.u1 u1Var = bw0Var.f25159b;
        if (u1Var.getChildCount() <= 0) {
            int paddingTop = u1Var.getPaddingTop();
            bw0Var.f25161f = paddingTop;
            u1Var.setTopGlowOffset(paddingTop);
            bw0Var.containerView.invalidate();
            return;
        }
        int i10 = 0;
        View childAt = u1Var.getChildAt(0);
        wl0 wl0Var = (wl0) u1Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
        if (top > 0 && wl0Var != null && wl0Var.b() == 0) {
            i10 = top;
        }
        if (bw0Var.f25161f != i10) {
            bw0Var.f25161f = i10;
            u1Var.setTopGlowOffset(i10);
            bw0Var.containerView.invalidate();
        }
    }

    public static LocationController.SharingLocationInfo r(int i10) {
        for (int i11 = 0; i11 < 4; i11++) {
            ArrayList<LocationController.SharingLocationInfo> arrayList = LocationController.getInstance(i11).sharingLocationsUI;
            if (i10 >= arrayList.size()) {
                i10 -= arrayList.size();
            } else {
                return arrayList.get(i10);
            }
        }
        return null;
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.liveLocationsChanged) {
            if (LocationController.getLocationsCount() == 0) {
                dismiss();
            } else {
                this.f25160c.l();
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.liveLocationsChanged);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f21254h5);
            Drawable drawable = this.d;
            if (drawable != null && themedColor != this.f25163r) {
                this.f25163r = themedColor;
                drawable.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
