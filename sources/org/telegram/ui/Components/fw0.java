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
public final class fw0 extends org.telegram.ui.ActionBar.k3 implements NotificationCenter.NotificationCenterDelegate {
    public final bi.r1 f28300b;
    public final dw0 f28301c;
    public final Drawable d;
    public TextView e;
    public int f28302f;
    public boolean h;
    public final ew0 f28303n;
    public int f28304r;

    public fw0(Context context, ew0 ew0Var, org.telegram.ui.ActionBar.u6 u6Var) {
        super(1, context, u6Var, false);
        NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.liveLocationsChanged);
        this.f28303n = ew0Var;
        fixNavigationBar();
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.d = mutate;
        int i10 = org.telegram.ui.ActionBar.y6.f23428h5;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i10), PorterDuff.Mode.MULTIPLY));
        bh.r rVar = new bh.r(this, context, 23);
        this.containerView = rVar;
        rVar.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i11, 0, i11, 0);
        bi.r1 r1Var = new bi.r1(this, context, 23);
        this.f28300b = r1Var;
        getContext();
        r1Var.setLayoutManager(new s4.c0(1, false));
        dw0 dw0Var = new dw0(this, context);
        this.f28301c = dw0Var;
        r1Var.setAdapter(dw0Var);
        r1Var.setVerticalScrollBarEnabled(false);
        r1Var.setClipToPadding(false);
        r1Var.setEnabled(true);
        org.telegram.ui.ActionBar.f7.m(r1Var, 21, org.telegram.ui.ActionBar.y6.A5, u6Var);
        r1Var.setOnScrollListener(new ml(this, 13));
        r1Var.setOnItemClickListener(new j(this, 13));
        this.containerView.addView(r1Var, kb1.h(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        View view = new View(context);
        view.setBackgroundResource(R.drawable.header_shadow_reverse);
        this.containerView.addView(view, kb1.h(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23357d6, frameLayout, null);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        int i12 = org.telegram.ui.ActionBar.y6.f23458ii;
        org.telegram.ui.ActionBar.f7.V(textView, i12, null);
        textView.setGravity(17);
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.x0(null, i12, false) & 268435455, 0, -1);
        org.telegram.ui.ActionBar.b7 h = org.telegram.ui.ActionBar.f7.h(i12, 15);
        textView.setBackground(g02);
        org.telegram.ui.ActionBar.f7.k(textView, g02, null, h, null);
        textView.setPadding(AndroidUtilities.dp(33.0f), 0, AndroidUtilities.dp(33.0f), 0);
        textView.setText(LocaleController.getString(R.string.Cancel).toUpperCase());
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, kb1.i(-2, -1, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        org.telegram.ui.Cells.y g03 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.x0(null, i12, false) & 268435455, 0, -1);
        org.telegram.ui.ActionBar.b7 h10 = org.telegram.ui.ActionBar.f7.h(i12, 15);
        linearLayout.setBackground(g03);
        org.telegram.ui.ActionBar.f7.k(linearLayout, g03, null, h10, null);
        linearLayout.setPadding(AndroidUtilities.dp(33.0f), 0, AndroidUtilities.dp(33.0f), 0);
        frameLayout.addView(linearLayout, kb1.i(-2, -1, 53));
        TextView textView2 = new TextView(context);
        org.telegram.messenger.wh.j(13.0f, 1, textView2);
        org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.f23514li, null);
        textView2.setGravity(17);
        int dp = AndroidUtilities.dp(11.0f);
        int i13 = org.telegram.ui.ActionBar.y6.f23497ki;
        ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(dp, org.telegram.ui.ActionBar.y6.x0(null, i13, false));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i13);
        textView2.setBackground(c02);
        org.telegram.ui.ActionBar.f7.k(textView2, c02, N, null, null);
        textView2.setMinWidth(AndroidUtilities.dp(23.0f));
        textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(1.0f));
        TextView e = org.telegram.messenger.wh.e(linearLayout, textView2, kb1.x(-2, 23, 16, 0, 0, 10, 0), context);
        e.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.f7.V(e, i12, null);
        e.setGravity(17);
        e.setCompoundDrawablePadding(AndroidUtilities.dp(8.0f));
        e.setText(LocaleController.getString(R.string.Send).toUpperCase());
        e.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(e, kb1.u(-2, -2, 16));
        org.telegram.ui.ActionBar.f7.i(i10, frameLayout, u6Var);
        this.containerView.addView(frameLayout, kb1.i(-1, 48, 83));
        textView.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23599q7, u6Var);
        textView.setText(LocaleController.getString(R.string.StopAllLocationSharings));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final fw0 f27269b;

            {
                this.f27269b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        int i14 = 0;
                        while (true) {
                            fw0 fw0Var = this.f27269b;
                            if (i14 < 4) {
                                fw0Var.getClass();
                                LocationController.getInstance(i14).removeAllLocationSharings();
                                i14++;
                            } else {
                                fw0Var.dismiss();
                                return;
                            }
                        }
                    default:
                        this.f27269b.dismiss();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.f7.V(e, org.telegram.ui.ActionBar.y6.f23540n5, u6Var);
        e.setText(LocaleController.getString(R.string.Close).toUpperCase());
        linearLayout.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        linearLayout.setOnClickListener(new View.OnClickListener(this) {
            public final fw0 f27269b;

            {
                this.f27269b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        int i14 = 0;
                        while (true) {
                            fw0 fw0Var = this.f27269b;
                            if (i14 < 4) {
                                fw0Var.getClass();
                                LocationController.getInstance(i14).removeAllLocationSharings();
                                i14++;
                            } else {
                                fw0Var.dismiss();
                                return;
                            }
                        }
                    default:
                        this.f27269b.dismiss();
                        return;
                }
            }
        });
        textView2.setVisibility(8);
        dw0Var.l();
    }

    public static void m(fw0 fw0Var) {
        bi.r1 r1Var = fw0Var.f28300b;
        if (r1Var.getChildCount() <= 0) {
            int paddingTop = r1Var.getPaddingTop();
            fw0Var.f28302f = paddingTop;
            r1Var.setTopGlowOffset(paddingTop);
            fw0Var.containerView.invalidate();
            return;
        }
        int i10 = 0;
        View childAt = r1Var.getChildAt(0);
        wl0 wl0Var = (wl0) r1Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
        if (top > 0 && wl0Var != null && wl0Var.b() == 0) {
            i10 = top;
        }
        if (fw0Var.f28302f != i10) {
            fw0Var.f28302f = i10;
            r1Var.setTopGlowOffset(i10);
            fw0Var.containerView.invalidate();
        }
    }

    public static LocationController.SharingLocationInfo q(int i10) {
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
                this.f28301c.l();
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
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.f23428h5);
            Drawable drawable = this.d;
            if (drawable != null && themedColor != this.f28304r) {
                this.f28304r = themedColor;
                drawable.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
