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
public final class wv0 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public final ai.u1 f32222b;
    public final uv0 f32223c;
    public final Drawable d;
    public TextView e;
    public int f32224f;
    public boolean h;
    public final vv0 f32225n;

    public wv0(Context context, vv0 vv0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(1, context, d6Var, false);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.liveLocationsChanged);
        this.f32225n = vv0Var;
        fixNavigationBar();
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.d = mutate;
        int i10 = org.telegram.ui.ActionBar.h6.f21057h5;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i10), PorterDuff.Mode.MULTIPLY));
        ah.x xVar = new ah.x(this, context, 23);
        this.containerView = xVar;
        xVar.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i11, 0, i11, 0);
        ai.u1 u1Var = new ai.u1(this, context, 23);
        this.f32222b = u1Var;
        getContext();
        u1Var.setLayoutManager(new s4.b0(1, false));
        uv0 uv0Var = new uv0(this, context);
        this.f32223c = uv0Var;
        u1Var.setAdapter(uv0Var);
        u1Var.setVerticalScrollBarEnabled(false);
        u1Var.setClipToPadding(false);
        u1Var.setEnabled(true);
        u1Var.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.h6.A5));
        u1Var.setOnScrollListener(new kv(this, 9));
        u1Var.setOnItemClickListener(new j(this, 13));
        this.containerView.addView(u1Var, w7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        View view = new View(context);
        view.setBackgroundResource(R.drawable.header_shadow_reverse);
        this.containerView.addView(view, w7.z5.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20986d6, false));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        int i12 = org.telegram.ui.ActionBar.h6.f21085ii;
        com.google.android.gms.internal.play_billing.k3.o(i12, null, false, textView, 17);
        textView.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.x0(null, i12, false) & 268435455, 0, -1));
        textView.setPadding(AndroidUtilities.dp(33.0f), 0, AndroidUtilities.dp(33.0f), 0);
        textView.setText(LocaleController.getString(R.string.Cancel).toUpperCase());
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, w7.z5.e(-2, -1, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.x0(null, i12, false) & 268435455, 0, -1));
        linearLayout.setPadding(AndroidUtilities.dp(33.0f), 0, AndroidUtilities.dp(33.0f), 0);
        frameLayout.addView(linearLayout, w7.z5.e(-2, -1, 53));
        TextView textView2 = new TextView(context);
        org.telegram.messenger.lk.k(13.0f, 1, textView2);
        com.google.android.gms.internal.play_billing.k3.o(org.telegram.ui.ActionBar.h6.f21142li, null, false, textView2, 17);
        textView2.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(11.0f), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21124ki, false)));
        textView2.setMinWidth(AndroidUtilities.dp(23.0f));
        textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(1.0f));
        TextView i13 = com.google.android.gms.internal.play_billing.k3.i(linearLayout, textView2, w7.z5.t(-2, 23, 16, 0, 0, 10, 0), context);
        i13.setTextSize(1, 14.0f);
        com.google.android.gms.internal.play_billing.k3.o(i12, null, false, i13, 17);
        i13.setCompoundDrawablePadding(AndroidUtilities.dp(8.0f));
        i13.setText(LocaleController.getString(R.string.Send).toUpperCase());
        i13.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(i13, w7.z5.q(-2, -2, 16));
        frameLayout.setBackgroundColor(getThemedColor(i10));
        this.containerView.addView(frameLayout, w7.z5.e(-1, 48, 83));
        textView.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21224q7));
        textView.setText(LocaleController.getString(R.string.StopAllLocationSharings));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final wv0 f30719b;

            {
                this.f30719b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        int i14 = 0;
                        while (true) {
                            wv0 wv0Var = this.f30719b;
                            if (i14 < 4) {
                                wv0Var.getClass();
                                LocationController.getInstance(i14).removeAllLocationSharings();
                                i14++;
                            } else {
                                wv0Var.dismiss();
                                return;
                            }
                        }
                    default:
                        this.f30719b.dismiss();
                        return;
                }
            }
        });
        i13.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21168n5));
        i13.setText(LocaleController.getString(R.string.Close).toUpperCase());
        linearLayout.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        linearLayout.setOnClickListener(new View.OnClickListener(this) {
            public final wv0 f30719b;

            {
                this.f30719b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        int i14 = 0;
                        while (true) {
                            wv0 wv0Var = this.f30719b;
                            if (i14 < 4) {
                                wv0Var.getClass();
                                LocationController.getInstance(i14).removeAllLocationSharings();
                                i14++;
                            } else {
                                wv0Var.dismiss();
                                return;
                            }
                        }
                    default:
                        this.f30719b.dismiss();
                        return;
                }
            }
        });
        textView2.setVisibility(8);
        uv0Var.l();
    }

    public static void n(wv0 wv0Var) {
        ai.u1 u1Var = wv0Var.f32222b;
        if (u1Var.getChildCount() <= 0) {
            int paddingTop = u1Var.getPaddingTop();
            wv0Var.f32224f = paddingTop;
            u1Var.setTopGlowOffset(paddingTop);
            wv0Var.containerView.invalidate();
            return;
        }
        int i10 = 0;
        View childAt = u1Var.getChildAt(0);
        sl0 sl0Var = (sl0) u1Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
        if (top > 0 && sl0Var != null && sl0Var.b() == 0) {
            i10 = top;
        }
        if (wv0Var.f32224f != i10) {
            wv0Var.f32224f = i10;
            u1Var.setTopGlowOffset(i10);
            wv0Var.containerView.invalidate();
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
                this.f32223c.l();
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.liveLocationsChanged);
    }
}
