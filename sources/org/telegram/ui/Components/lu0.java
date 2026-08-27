package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

public final class lu0 extends org.telegram.ui.ActionBar.e3 implements NotificationCenter.NotificationCenterDelegate {

    public final hh.f1 f30466b;

    public final ju0 f30467c;
    public final Drawable d;

    public TextView f30468e;

    public int f30469f;
    public boolean h;

    public final ku0 f30470n;

    public lu0(Context context, ku0 ku0Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, false, false);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.liveLocationsChanged);
        this.f30470n = ku0Var;
        fixNavigationBar();
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.d = drawableMutate;
        int i10 = org.telegram.ui.ActionBar.g6.f23124h5;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i10), PorterDuff.Mode.MULTIPLY));
        ag.p1 p1Var = new ag.p1(this, context, 25);
        this.containerView = p1Var;
        p1Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i11, 0, i11, 0);
        hh.f1 f1Var = new hh.f1(this, context, 22);
        this.f30466b = f1Var;
        getContext();
        f1Var.setLayoutManager(new f2.k0(1, false));
        ju0 ju0Var = new ju0(this, context);
        this.f30467c = ju0Var;
        f1Var.setAdapter(ju0Var);
        f1Var.setVerticalScrollBarEnabled(false);
        f1Var.setClipToPadding(false);
        f1Var.setEnabled(true);
        f1Var.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.g6.A5));
        f1Var.setOnScrollListener(new xm(this, 12));
        f1Var.setOnItemClickListener(new j(this, 13));
        this.containerView.addView(f1Var, h7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        View view = new View(context);
        view.setBackgroundResource(R.drawable.header_shadow_reverse);
        this.containerView.addView(view, h7.z5.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
        ef0 ef0Var = new ef0(context);
        ef0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        int i12 = org.telegram.ui.ActionBar.g6.ii;
        org.telegram.ui.Cells.pa.s(i12, null, false, textView, 17);
        textView.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, i12, false) & 268435455, 0, -1));
        textView.setPadding(AndroidUtilities.dp(33.0f), 0, AndroidUtilities.dp(33.0f), 0);
        textView.setText(LocaleController.getString(R.string.Cancel).toUpperCase());
        textView.setTypeface(AndroidUtilities.bold());
        ef0Var.addView(textView, h7.z5.e(-2, -1, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, i12, false) & 268435455, 0, -1));
        linearLayout.setPadding(AndroidUtilities.dp(33.0f), 0, AndroidUtilities.dp(33.0f), 0);
        ef0Var.addView(linearLayout, h7.z5.e(-2, -1, 53));
        TextView textView2 = new TextView(context);
        org.telegram.messenger.rl.h(13.0f, 1, textView2);
        org.telegram.ui.Cells.pa.s(org.telegram.ui.ActionBar.g6.li, null, false, textView2, 17);
        textView2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(11.0f), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.ki, false)));
        textView2.setMinWidth(AndroidUtilities.dp(23.0f));
        textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(1.0f));
        TextView textViewI = org.telegram.ui.Cells.pa.i(linearLayout, textView2, h7.z5.t(-2, 23, 16, 0, 0, 10, 0), context);
        textViewI.setTextSize(1, 14.0f);
        org.telegram.ui.Cells.pa.s(i12, null, false, textViewI, 17);
        textViewI.setCompoundDrawablePadding(AndroidUtilities.dp(8.0f));
        textViewI.setText(LocaleController.getString(R.string.Send).toUpperCase());
        textViewI.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textViewI, h7.z5.q(-2, -2, 16));
        ef0Var.setBackgroundColor(getThemedColor(i10));
        this.containerView.addView(ef0Var, h7.z5.e(-1, 48, 83));
        textView.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23284q7));
        textView.setText(LocaleController.getString(R.string.StopAllLocationSharings));
        final int i13 = 0;
        textView.setOnClickListener(new View.OnClickListener(this) {

            public final lu0 f29488b;

            {
                this.f29488b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        int i14 = 0;
                        while (true) {
                            lu0 lu0Var = this.f29488b;
                            if (i14 >= 4) {
                                lu0Var.dismiss();
                            } else {
                                lu0Var.getClass();
                                LocationController.getInstance(i14).removeAllLocationSharings();
                                i14++;
                            }
                            break;
                        }
                        break;
                    default:
                        this.f29488b.dismiss();
                        break;
                }
            }
        });
        textViewI.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23233n5));
        textViewI.setText(LocaleController.getString(R.string.Close).toUpperCase());
        linearLayout.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        final int i14 = 1;
        linearLayout.setOnClickListener(new View.OnClickListener(this) {

            public final lu0 f29488b;

            {
                this.f29488b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        int i15 = 0;
                        while (true) {
                            lu0 lu0Var = this.f29488b;
                            if (i15 >= 4) {
                                lu0Var.dismiss();
                            } else {
                                lu0Var.getClass();
                                LocationController.getInstance(i15).removeAllLocationSharings();
                                i15++;
                            }
                            break;
                        }
                        break;
                    default:
                        this.f29488b.dismiss();
                        break;
                }
            }
        });
        textView2.setVisibility(8);
        ju0Var.l();
    }

    public static void m(lu0 lu0Var) {
        hh.f1 f1Var = lu0Var.f30466b;
        if (f1Var.getChildCount() <= 0) {
            int paddingTop = f1Var.getPaddingTop();
            lu0Var.f30469f = paddingTop;
            f1Var.setTopGlowOffset(paddingTop);
            lu0Var.containerView.invalidate();
            return;
        }
        int i10 = 0;
        View childAt = f1Var.getChildAt(0);
        lk0 lk0Var = (lk0) f1Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
        if (top > 0 && lk0Var != null && lk0Var.b() == 0) {
            i10 = top;
        }
        if (lu0Var.f30469f != i10) {
            lu0Var.f30469f = i10;
            f1Var.setTopGlowOffset(i10);
            lu0Var.containerView.invalidate();
        }
    }

    public static LocationController.SharingLocationInfo q(int i10) {
        for (int i11 = 0; i11 < 4; i11++) {
            ArrayList<LocationController.SharingLocationInfo> arrayList = LocationController.getInstance(i11).sharingLocationsUI;
            if (i10 < arrayList.size()) {
                return arrayList.get(i10);
            }
            i10 -= arrayList.size();
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
                this.f30467c.l();
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.liveLocationsChanged);
    }
}
