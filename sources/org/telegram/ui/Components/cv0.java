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
public final class cv0 extends org.telegram.ui.ActionBar.g3 implements NotificationCenter.NotificationCenterDelegate {
    public final lh.e1 f24062b;
    public final av0 f24063c;
    public final Drawable d;
    public TextView e;
    public int f24064f;
    public boolean h;
    public final bv0 f24065n;

    public cv0(Context context, bv0 bv0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var, false, false);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.liveLocationsChanged);
        this.f24065n = bv0Var;
        fixNavigationBar();
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.d = mutate;
        int i10 = org.telegram.ui.ActionBar.j6.f19977h5;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i10), PorterDuff.Mode.MULTIPLY));
        dg.u2 u2Var = new dg.u2(this, context, 25);
        this.containerView = u2Var;
        u2Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i11, 0, i11, 0);
        lh.e1 e1Var = new lh.e1(this, context, 20);
        this.f24062b = e1Var;
        getContext();
        e1Var.setLayoutManager(new f2.i0(1, false));
        av0 av0Var = new av0(this, context);
        this.f24063c = av0Var;
        e1Var.setAdapter(av0Var);
        e1Var.setVerticalScrollBarEnabled(false);
        e1Var.setClipToPadding(false);
        e1Var.setEnabled(true);
        e1Var.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.j6.A5));
        e1Var.setOnScrollListener(new lb0(this, 5));
        e1Var.setOnItemClickListener(new k(this, 13));
        this.containerView.addView(e1Var, k7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        View view = new View(context);
        view.setBackgroundResource(R.drawable.header_shadow_reverse);
        this.containerView.addView(view, k7.b6.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        int i12 = org.telegram.ui.ActionBar.j6.ii;
        org.telegram.ui.yh.t(i12, null, false, textView, 17);
        textView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i12, false) & 268435455, 0, -1));
        textView.setPadding(AndroidUtilities.dp(33.0f), 0, AndroidUtilities.dp(33.0f), 0);
        textView.setText(LocaleController.getString(R.string.Cancel).toUpperCase());
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, k7.b6.e(-2, -1, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i12, false) & 268435455, 0, -1));
        linearLayout.setPadding(AndroidUtilities.dp(33.0f), 0, AndroidUtilities.dp(33.0f), 0);
        frameLayout.addView(linearLayout, k7.b6.e(-2, -1, 53));
        TextView textView2 = new TextView(context);
        org.telegram.ui.b.g(13.0f, 1, textView2);
        org.telegram.ui.yh.t(org.telegram.ui.ActionBar.j6.li, null, false, textView2, 17);
        textView2.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(11.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ki, false)));
        textView2.setMinWidth(AndroidUtilities.dp(23.0f));
        textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(1.0f));
        TextView j10 = org.telegram.ui.yh.j(linearLayout, textView2, k7.b6.t(-2, 23, 16, 0, 0, 10, 0), context);
        j10.setTextSize(1, 14.0f);
        org.telegram.ui.yh.t(i12, null, false, j10, 17);
        j10.setCompoundDrawablePadding(AndroidUtilities.dp(8.0f));
        j10.setText(LocaleController.getString(R.string.Send).toUpperCase());
        j10.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(j10, k7.b6.q(-2, -2, 16));
        frameLayout.setBackgroundColor(getThemedColor(i10));
        this.containerView.addView(frameLayout, k7.b6.e(-1, 48, 83));
        textView.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f20141q7));
        textView.setText(LocaleController.getString(R.string.StopAllLocationSharings));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final cv0 f31443b;

            {
                this.f31443b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        int i13 = 0;
                        while (true) {
                            cv0 cv0Var = this.f31443b;
                            if (i13 < 4) {
                                cv0Var.getClass();
                                LocationController.getInstance(i13).removeAllLocationSharings();
                                i13++;
                            } else {
                                cv0Var.dismiss();
                                return;
                            }
                        }
                    default:
                        this.f31443b.dismiss();
                        return;
                }
            }
        });
        j10.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f20084n5));
        j10.setText(LocaleController.getString(R.string.Close).toUpperCase());
        linearLayout.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        linearLayout.setOnClickListener(new View.OnClickListener(this) {
            public final cv0 f31443b;

            {
                this.f31443b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        int i13 = 0;
                        while (true) {
                            cv0 cv0Var = this.f31443b;
                            if (i13 < 4) {
                                cv0Var.getClass();
                                LocationController.getInstance(i13).removeAllLocationSharings();
                                i13++;
                            } else {
                                cv0Var.dismiss();
                                return;
                            }
                        }
                    default:
                        this.f31443b.dismiss();
                        return;
                }
            }
        });
        textView2.setVisibility(8);
        av0Var.l();
    }

    public static void m(cv0 cv0Var) {
        lh.e1 e1Var = cv0Var.f24062b;
        if (e1Var.getChildCount() <= 0) {
            int paddingTop = e1Var.getPaddingTop();
            cv0Var.f24064f = paddingTop;
            e1Var.setTopGlowOffset(paddingTop);
            cv0Var.containerView.invalidate();
            return;
        }
        int i10 = 0;
        View childAt = e1Var.getChildAt(0);
        el0 el0Var = (el0) e1Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
        if (top > 0 && el0Var != null && el0Var.b() == 0) {
            i10 = top;
        }
        if (cv0Var.f24064f != i10) {
            cv0Var.f24064f = i10;
            e1Var.setTopGlowOffset(i10);
            cv0Var.containerView.invalidate();
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
                this.f24063c.l();
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.liveLocationsChanged);
    }
}
