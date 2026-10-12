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
public final class lw0 extends org.telegram.ui.ActionBar.e3 implements NotificationCenter.NotificationCenterDelegate {
    public final ai.w0 f28297b;
    public final jw0 f28298c;
    public final Drawable d;
    public TextView f28299e;
    public int f28300f;
    public boolean h;
    public final kw0 f28301n;

    public lw0(Context context, kw0 kw0Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(1, context, c6Var, false);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.liveLocationsChanged);
        this.f28301n = kw0Var;
        fixNavigationBar();
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.d = mutate;
        int i10 = org.telegram.ui.ActionBar.h6.f20631h5;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i10), PorterDuff.Mode.MULTIPLY));
        ai.f0 f0Var = new ai.f0(this, context, 20);
        this.containerView = f0Var;
        f0Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i11, 0, i11, 0);
        ai.w0 w0Var = new ai.w0(this, context, 22);
        this.f28297b = w0Var;
        getContext();
        w0Var.setLayoutManager(new s4.d0(1, false));
        jw0 jw0Var = new jw0(this, context);
        this.f28298c = jw0Var;
        w0Var.setAdapter(jw0Var);
        w0Var.setVerticalScrollBarEnabled(false);
        w0Var.setClipToPadding(false);
        w0Var.setEnabled(true);
        w0Var.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.h6.A5));
        w0Var.setOnScrollListener(new qh0(this, 4));
        w0Var.setOnItemClickListener(new j(this, 13));
        this.containerView.addView(w0Var, w7.w5.a(-1.0f, 0.0f, 0.0f, 0.0f, 48.0f, -1, 51));
        View view = new View(context);
        view.setBackgroundResource(R.drawable.header_shadow_reverse);
        this.containerView.addView(view, w7.w5.a(3.0f, 0.0f, 0.0f, 0.0f, 48.0f, -1, 83));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20560d6, false));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        int i12 = org.telegram.ui.ActionBar.h6.f20662ii;
        com.google.android.gms.internal.vision.e2.p(i12, null, false, textView, 17);
        textView.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.x0(null, i12, false) & 268435455, 0, -1));
        textView.setPadding(AndroidUtilities.dp(33.0f), 0, AndroidUtilities.dp(33.0f), 0);
        textView.setText(LocaleController.getString(R.string.Cancel).toUpperCase());
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, w7.w5.e(-2, -1, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.x0(null, i12, false) & 268435455, 0, -1));
        linearLayout.setPadding(AndroidUtilities.dp(33.0f), 0, AndroidUtilities.dp(33.0f), 0);
        frameLayout.addView(linearLayout, w7.w5.e(-2, -1, 53));
        TextView textView2 = new TextView(context);
        org.telegram.messenger.am.k(13.0f, 1, textView2);
        com.google.android.gms.internal.vision.e2.p(org.telegram.ui.ActionBar.h6.f20718li, null, false, textView2, 17);
        textView2.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(11.0f), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20700ki, false)));
        textView2.setMinWidth(AndroidUtilities.dp(23.0f));
        textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(1.0f));
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView2, w7.w5.t(-2, 23, 16, 0, 0, 10, 0), context);
        h.setTextSize(1, 14.0f);
        com.google.android.gms.internal.vision.e2.p(i12, null, false, h, 17);
        h.setCompoundDrawablePadding(AndroidUtilities.dp(8.0f));
        h.setText(LocaleController.getString(R.string.Send).toUpperCase());
        h.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(h, w7.w5.q(-2, -2, 16));
        frameLayout.setBackgroundColor(getThemedColor(i10));
        this.containerView.addView(frameLayout, w7.w5.e(-1, 48, 83));
        textView.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20800q7));
        textView.setText(LocaleController.getString(R.string.StopAllLocationSharings));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final lw0 f27293b;

            {
                this.f27293b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        int i13 = 0;
                        while (true) {
                            lw0 lw0Var = this.f27293b;
                            if (i13 < 4) {
                                lw0Var.getClass();
                                LocationController.getInstance(i13).removeAllLocationSharings();
                                i13++;
                            } else {
                                lw0Var.dismiss();
                                return;
                            }
                        }
                    default:
                        this.f27293b.dismiss();
                        return;
                }
            }
        });
        h.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20744n5));
        h.setText(LocaleController.getString(R.string.Close).toUpperCase());
        linearLayout.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        linearLayout.setOnClickListener(new View.OnClickListener(this) {
            public final lw0 f27293b;

            {
                this.f27293b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        int i13 = 0;
                        while (true) {
                            lw0 lw0Var = this.f27293b;
                            if (i13 < 4) {
                                lw0Var.getClass();
                                LocationController.getInstance(i13).removeAllLocationSharings();
                                i13++;
                            } else {
                                lw0Var.dismiss();
                                return;
                            }
                        }
                    default:
                        this.f27293b.dismiss();
                        return;
                }
            }
        });
        textView2.setVisibility(8);
        jw0Var.l();
    }

    public static void o(lw0 lw0Var) {
        ai.w0 w0Var = lw0Var.f28297b;
        if (w0Var.getChildCount() <= 0) {
            int paddingTop = w0Var.getPaddingTop();
            lw0Var.f28300f = paddingTop;
            w0Var.setTopGlowOffset(paddingTop);
            lw0Var.containerView.invalidate();
            return;
        }
        int i10 = 0;
        View childAt = w0Var.getChildAt(0);
        gm0 gm0Var = (gm0) w0Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
        if (top > 0 && gm0Var != null && gm0Var.b() == 0) {
            i10 = top;
        }
        if (lw0Var.f28300f != i10) {
            lw0Var.f28300f = i10;
            w0Var.setTopGlowOffset(i10);
            lw0Var.containerView.invalidate();
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
                this.f28298c.l();
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.liveLocationsChanged);
    }
}
