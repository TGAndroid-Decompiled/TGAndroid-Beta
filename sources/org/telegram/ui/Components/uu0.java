package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class uu0 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public final jh.e1 f33318b;
    public final su0 f33319c;
    public final Drawable d;
    public TextView f33320e;
    public int f33321f;
    public boolean h;
    public final tu0 f33322n;

    public uu0(Context context, tu0 tu0Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, false, false);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.liveLocationsChanged);
        this.f33322n = tu0Var;
        fixNavigationBar();
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.d = mutate;
        int i10 = org.telegram.ui.ActionBar.g6.f23133h5;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i10), PorterDuff.Mode.MULTIPLY));
        bg.x2 x2Var = new bg.x2(this, context, 27);
        this.containerView = x2Var;
        x2Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i11, 0, i11, 0);
        jh.e1 e1Var = new jh.e1(this, context, 21);
        this.f33318b = e1Var;
        getContext();
        e1Var.setLayoutManager(new f2.j0(1, false));
        su0 su0Var = new su0(this, context);
        this.f33319c = su0Var;
        e1Var.setAdapter(su0Var);
        e1Var.setVerticalScrollBarEnabled(false);
        e1Var.setClipToPadding(false);
        e1Var.setEnabled(true);
        e1Var.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.g6.A5));
        e1Var.setOnScrollListener(new h00(this, 7));
        e1Var.setOnItemClickListener(new k(this, 13));
        this.containerView.addView(e1Var, i7.f6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        View view = new View(context);
        view.setBackgroundResource(R.drawable.header_shadow_reverse);
        this.containerView.addView(view, i7.f6.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        int i12 = org.telegram.ui.ActionBar.g6.ii;
        org.telegram.ui.th.s(i12, null, false, textView, 17);
        textView.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, i12, false) & 268435455, 0, -1));
        textView.setPadding(AndroidUtilities.dp(33.0f), 0, AndroidUtilities.dp(33.0f), 0);
        textView.setText(LocaleController.getString(R.string.Cancel).toUpperCase());
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, i7.f6.e(-2, -1, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, i12, false) & 268435455, 0, -1));
        linearLayout.setPadding(AndroidUtilities.dp(33.0f), 0, AndroidUtilities.dp(33.0f), 0);
        frameLayout.addView(linearLayout, i7.f6.e(-2, -1, 53));
        TextView textView2 = new TextView(context);
        org.telegram.ui.b.g(13.0f, 1, textView2);
        org.telegram.ui.th.s(org.telegram.ui.ActionBar.g6.li, null, false, textView2, 17);
        textView2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(11.0f), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.ki, false)));
        textView2.setMinWidth(AndroidUtilities.dp(23.0f));
        textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(1.0f));
        TextView i13 = org.telegram.ui.th.i(linearLayout, textView2, i7.f6.t(-2, 23, 16, 0, 0, 10, 0), context);
        i13.setTextSize(1, 14.0f);
        org.telegram.ui.th.s(i12, null, false, i13, 17);
        i13.setCompoundDrawablePadding(AndroidUtilities.dp(8.0f));
        i13.setText(LocaleController.getString(R.string.Send).toUpperCase());
        i13.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(i13, i7.f6.q(-2, -2, 16));
        frameLayout.setBackgroundColor(getThemedColor(i10));
        this.containerView.addView(frameLayout, i7.f6.e(-1, 48, 83));
        textView.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23295q7));
        textView.setText(LocaleController.getString(R.string.StopAllLocationSharings));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final uu0 f32387b;

            {
                this.f32387b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        int i14 = 0;
                        while (true) {
                            uu0 uu0Var = this.f32387b;
                            if (i14 < 4) {
                                uu0Var.getClass();
                                LocationController.getInstance(i14).removeAllLocationSharings();
                                i14++;
                            } else {
                                uu0Var.dismiss();
                                return;
                            }
                        }
                    default:
                        this.f32387b.dismiss();
                        return;
                }
            }
        });
        i13.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23240n5));
        i13.setText(LocaleController.getString(R.string.Close).toUpperCase());
        linearLayout.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        linearLayout.setOnClickListener(new View.OnClickListener(this) {
            public final uu0 f32387b;

            {
                this.f32387b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        int i14 = 0;
                        while (true) {
                            uu0 uu0Var = this.f32387b;
                            if (i14 < 4) {
                                uu0Var.getClass();
                                LocationController.getInstance(i14).removeAllLocationSharings();
                                i14++;
                            } else {
                                uu0Var.dismiss();
                                return;
                            }
                        }
                    default:
                        this.f32387b.dismiss();
                        return;
                }
            }
        });
        textView2.setVisibility(8);
        su0Var.l();
    }

    public static void m(uu0 uu0Var) {
        jh.e1 e1Var = uu0Var.f33318b;
        if (e1Var.getChildCount() <= 0) {
            int paddingTop = e1Var.getPaddingTop();
            uu0Var.f33321f = paddingTop;
            e1Var.setTopGlowOffset(paddingTop);
            uu0Var.containerView.invalidate();
            return;
        }
        int i10 = 0;
        View childAt = e1Var.getChildAt(0);
        vk0 vk0Var = (vk0) e1Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
        if (top > 0 && vk0Var != null && vk0Var.b() == 0) {
            i10 = top;
        }
        if (uu0Var.f33321f != i10) {
            uu0Var.f33321f = i10;
            e1Var.setTopGlowOffset(i10);
            uu0Var.containerView.invalidate();
        }
    }

    public static LocationController.SharingLocationInfo p(int i10) {
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
                this.f33319c.l();
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.liveLocationsChanged);
    }
}
