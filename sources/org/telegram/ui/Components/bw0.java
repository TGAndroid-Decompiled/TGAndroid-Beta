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
public final class bw0 extends org.telegram.ui.ActionBar.e3 implements NotificationCenter.NotificationCenterDelegate {
    public final bi.o0 f23561b;
    public final zv0 f23562c;
    public final Drawable d;
    public TextView e;
    public int f23563f;
    public boolean h;
    public final aw0 f23564n;

    public bw0(Context context, aw0 aw0Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(1, context, c6Var, false);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.liveLocationsChanged);
        this.f23564n = aw0Var;
        fixNavigationBar();
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.d = mutate;
        int i10 = org.telegram.ui.ActionBar.g6.f19672h5;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i10), PorterDuff.Mode.MULTIPLY));
        ah.x xVar = new ah.x(this, context, 20);
        this.containerView = xVar;
        xVar.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i11, 0, i11, 0);
        bi.o0 o0Var = new bi.o0(this, context, 22);
        this.f23561b = o0Var;
        getContext();
        o0Var.setLayoutManager(new s4.b0(1, false));
        zv0 zv0Var = new zv0(this, context);
        this.f23562c = zv0Var;
        o0Var.setAdapter(zv0Var);
        o0Var.setVerticalScrollBarEnabled(false);
        o0Var.setClipToPadding(false);
        o0Var.setEnabled(true);
        o0Var.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.g6.A5));
        o0Var.setOnScrollListener(new kc0(this, 5));
        o0Var.setOnItemClickListener(new j(this, 13));
        this.containerView.addView(o0Var, w7.z5.a(-1.0f, 0.0f, 0.0f, 0.0f, 48.0f, -1, 51));
        View view = new View(context);
        view.setBackgroundResource(R.drawable.header_shadow_reverse);
        this.containerView.addView(view, w7.z5.a(3.0f, 0.0f, 0.0f, 0.0f, 48.0f, -1, 83));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19601d6, false));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        int i12 = org.telegram.ui.ActionBar.g6.f19700ii;
        com.google.android.gms.internal.play_billing.k3.o(i12, null, false, textView, 17);
        textView.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.x0(null, i12, false) & 268435455, 0, -1));
        textView.setPadding(AndroidUtilities.dp(33.0f), 0, AndroidUtilities.dp(33.0f), 0);
        textView.setText(LocaleController.getString(R.string.Cancel).toUpperCase());
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, w7.z5.e(-2, -1, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.x0(null, i12, false) & 268435455, 0, -1));
        linearLayout.setPadding(AndroidUtilities.dp(33.0f), 0, AndroidUtilities.dp(33.0f), 0);
        frameLayout.addView(linearLayout, w7.z5.e(-2, -1, 53));
        TextView textView2 = new TextView(context);
        org.telegram.messenger.sk.k(13.0f, 1, textView2);
        com.google.android.gms.internal.play_billing.k3.o(org.telegram.ui.ActionBar.g6.f19757li, null, false, textView2, 17);
        textView2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(11.0f), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19739ki, false)));
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
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f19839q7));
        textView.setText(LocaleController.getString(R.string.StopAllLocationSharings));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final bw0 f31366b;

            {
                this.f31366b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        int i14 = 0;
                        while (true) {
                            bw0 bw0Var = this.f31366b;
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
                        this.f31366b.dismiss();
                        return;
                }
            }
        });
        i13.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f19783n5));
        i13.setText(LocaleController.getString(R.string.Close).toUpperCase());
        linearLayout.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        linearLayout.setOnClickListener(new View.OnClickListener(this) {
            public final bw0 f31366b;

            {
                this.f31366b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        int i14 = 0;
                        while (true) {
                            bw0 bw0Var = this.f31366b;
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
                        this.f31366b.dismiss();
                        return;
                }
            }
        });
        textView2.setVisibility(8);
        zv0Var.l();
    }

    public static void n(bw0 bw0Var) {
        bi.o0 o0Var = bw0Var.f23561b;
        if (o0Var.getChildCount() <= 0) {
            int paddingTop = o0Var.getPaddingTop();
            bw0Var.f23563f = paddingTop;
            o0Var.setTopGlowOffset(paddingTop);
            bw0Var.containerView.invalidate();
            return;
        }
        int i10 = 0;
        View childAt = o0Var.getChildAt(0);
        wl0 wl0Var = (wl0) o0Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
        if (top > 0 && wl0Var != null && wl0Var.b() == 0) {
            i10 = top;
        }
        if (bw0Var.f23563f != i10) {
            bw0Var.f23563f = i10;
            o0Var.setTopGlowOffset(i10);
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
                this.f23562c.l();
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.liveLocationsChanged);
    }
}
