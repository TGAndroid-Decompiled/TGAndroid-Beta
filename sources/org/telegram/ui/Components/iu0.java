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
public final class iu0 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public final gh.f1 f29524b;
    public final gu0 f29525c;
    public final Drawable d;
    public TextView f29526e;
    public int f29527f;
    public boolean h;
    public final hu0 f29528n;

    public iu0(Context context, hu0 hu0Var, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var, false, false);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.liveLocationsChanged);
        this.f29528n = hu0Var;
        fixNavigationBar();
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.d = mutate;
        int i9 = org.telegram.ui.ActionBar.f6.f23072h5;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i9), PorterDuff.Mode.MULTIPLY));
        fh.d2 d2Var = new fh.d2(this, context, 22);
        this.containerView = d2Var;
        d2Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i10 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i10, 0, i10, 0);
        gh.f1 f1Var = new gh.f1(this, context, 22);
        this.f29524b = f1Var;
        getContext();
        f1Var.setLayoutManager(new f2.m0(1, false));
        gu0 gu0Var = new gu0(this, context);
        this.f29525c = gu0Var;
        f1Var.setAdapter(gu0Var);
        f1Var.setVerticalScrollBarEnabled(false);
        f1Var.setClipToPadding(false);
        f1Var.setEnabled(true);
        f1Var.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.f6.A5));
        f1Var.setOnScrollListener(new kn(this, 11));
        f1Var.setOnItemClickListener(new j(this, 13));
        this.containerView.addView(f1Var, g7.e6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        View view = new View(context);
        view.setBackgroundResource(R.drawable.header_shadow_reverse);
        this.containerView.addView(view, g7.e6.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        int i11 = org.telegram.ui.ActionBar.f6.ii;
        j3.r0.w(i11, null, false, textView, 17);
        textView.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, i11, false) & 268435455, 0, -1));
        textView.setPadding(AndroidUtilities.dp(33.0f), 0, AndroidUtilities.dp(33.0f), 0);
        textView.setText(LocaleController.getString(R.string.Cancel).toUpperCase());
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, g7.e6.e(-2, -1, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, i11, false) & 268435455, 0, -1));
        linearLayout.setPadding(AndroidUtilities.dp(33.0f), 0, AndroidUtilities.dp(33.0f), 0);
        frameLayout.addView(linearLayout, g7.e6.e(-2, -1, 53));
        TextView textView2 = new TextView(context);
        org.telegram.messenger.ll.k(13.0f, 1, textView2);
        j3.r0.w(org.telegram.ui.ActionBar.f6.li, null, false, textView2, 17);
        textView2.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(11.0f), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.ki, false)));
        textView2.setMinWidth(AndroidUtilities.dp(23.0f));
        textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(1.0f));
        TextView h = j3.r0.h(linearLayout, textView2, g7.e6.t(-2, 23, 16, 0, 0, 10, 0), context);
        h.setTextSize(1, 14.0f);
        j3.r0.w(i11, null, false, h, 17);
        h.setCompoundDrawablePadding(AndroidUtilities.dp(8.0f));
        h.setText(LocaleController.getString(R.string.Send).toUpperCase());
        h.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(h, g7.e6.q(-2, -2, 16));
        frameLayout.setBackgroundColor(getThemedColor(i9));
        this.containerView.addView(frameLayout, g7.e6.e(-1, 48, 83));
        textView.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.f23230q7));
        textView.setText(LocaleController.getString(R.string.StopAllLocationSharings));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final iu0 f28570b;

            {
                this.f28570b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        int i12 = 0;
                        while (true) {
                            iu0 iu0Var = this.f28570b;
                            if (i12 < 4) {
                                iu0Var.getClass();
                                LocationController.getInstance(i12).removeAllLocationSharings();
                                i12++;
                            } else {
                                iu0Var.dismiss();
                                return;
                            }
                        }
                    default:
                        this.f28570b.dismiss();
                        return;
                }
            }
        });
        h.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.f23178n5));
        h.setText(LocaleController.getString(R.string.Close).toUpperCase());
        linearLayout.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        linearLayout.setOnClickListener(new View.OnClickListener(this) {
            public final iu0 f28570b;

            {
                this.f28570b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        int i12 = 0;
                        while (true) {
                            iu0 iu0Var = this.f28570b;
                            if (i12 < 4) {
                                iu0Var.getClass();
                                LocationController.getInstance(i12).removeAllLocationSharings();
                                i12++;
                            } else {
                                iu0Var.dismiss();
                                return;
                            }
                        }
                    default:
                        this.f28570b.dismiss();
                        return;
                }
            }
        });
        textView2.setVisibility(8);
        gu0Var.l();
    }

    public static void m(iu0 iu0Var) {
        gh.f1 f1Var = iu0Var.f29524b;
        if (f1Var.getChildCount() <= 0) {
            int paddingTop = f1Var.getPaddingTop();
            iu0Var.f29527f = paddingTop;
            f1Var.setTopGlowOffset(paddingTop);
            iu0Var.containerView.invalidate();
            return;
        }
        int i9 = 0;
        View childAt = f1Var.getChildAt(0);
        ik0 ik0Var = (ik0) f1Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
        if (top > 0 && ik0Var != null && ik0Var.b() == 0) {
            i9 = top;
        }
        if (iu0Var.f29527f != i9) {
            iu0Var.f29527f = i9;
            f1Var.setTopGlowOffset(i9);
            iu0Var.containerView.invalidate();
        }
    }

    public static LocationController.SharingLocationInfo p(int i9) {
        for (int i10 = 0; i10 < 4; i10++) {
            ArrayList<LocationController.SharingLocationInfo> arrayList = LocationController.getInstance(i10).sharingLocationsUI;
            if (i9 >= arrayList.size()) {
                i9 -= arrayList.size();
            } else {
                return arrayList.get(i9);
            }
        }
        return null;
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.liveLocationsChanged) {
            if (LocationController.getLocationsCount() == 0) {
                dismiss();
            } else {
                this.f29525c.l();
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.liveLocationsChanged);
    }
}
