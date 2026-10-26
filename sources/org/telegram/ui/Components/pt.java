package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class pt extends org.telegram.ui.ActionBar.k3 {
    public static void m(pt ptVar) {
        ptVar.dismiss();
        DownloadController.getInstance(ptVar.currentAccount).clearRecentDownloadedFiles();
    }

    public static void n(Activity activity, org.telegram.ui.ActionBar.r2 r2Var) {
        if (r2Var != null && activity != null) {
            final ?? k3Var = new org.telegram.ui.ActionBar.k3(activity, false);
            k3Var.setApplyBottomPadding(false);
            k3Var.setApplyTopPadding(false);
            int i10 = org.telegram.ui.ActionBar.y6.f23356d6;
            k3Var.fixNavigationBarKey(i10);
            LinearLayout linearLayout = new LinearLayout(activity);
            linearLayout.setOrientation(1);
            FrameLayout frameLayout = new FrameLayout(activity);
            frameLayout.addView(linearLayout);
            ImageView imageView = new ImageView(activity);
            imageView.setBackground(org.telegram.ui.ActionBar.y6.g0(k3Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23448i6), 1, -1));
            org.telegram.ui.ActionBar.f7.t(imageView, org.telegram.ui.ActionBar.y6.Ji, k3Var.resourcesProvider, PorterDuff.Mode.SRC_ATOP);
            imageView.setImageResource(R.drawable.ic_layer_close);
            imageView.setOnClickListener(new View.OnClickListener(k3Var) {
                public final pt f31378b;

                {
                    this.f31378b = k3Var;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f31378b.dismiss();
                            return;
                        default:
                            pt.m(this.f31378b);
                            return;
                    }
                }
            });
            int dp = AndroidUtilities.dp(8.0f);
            imageView.setPadding(dp, dp, dp, dp);
            frameLayout.addView(imageView, gb1.h(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
            fy0 fy0Var = new fy0(activity, k3Var.currentAccount);
            fy0Var.setStickerNum(9);
            fy0Var.getImageReceiver().setAutoRepeat(1);
            linearLayout.addView(fy0Var, gb1.x(110, 110, 1, 0, 26, 0, 0));
            TextView textView = new TextView(activity);
            textView.setGravity(1);
            int i11 = org.telegram.ui.ActionBar.y6.f23464j5;
            org.telegram.ui.ActionBar.f7.V(textView, i11, null);
            textView.setTextSize(1, 20.0f);
            textView.setText(LocaleController.getString(R.string.DownloadedFiles));
            linearLayout.addView(textView, gb1.h(-1, -2.0f, 0, 21.0f, 20.0f, 21.0f, 0.0f));
            TextView textView2 = new TextView(activity);
            textView2.setGravity(1);
            textView2.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.f7.V(textView2, i11, null);
            textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
            textView2.setText(LocaleController.formatString("DownloadedFilesMessage", R.string.DownloadedFilesMessage, new Object[0]));
            linearLayout.addView(textView2, gb1.h(-1, -2.0f, 0, 28.0f, 7.0f, 28.0f, 0.0f));
            TextView textView3 = new TextView(activity);
            textView3.setGravity(17);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView3.setEllipsize(truncateAt);
            textView3.setSingleLine(true);
            textView3.setTextSize(1, 14.0f);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setText(LocaleController.getString(R.string.ManageDeviceStorage));
            org.telegram.ui.ActionBar.f7.V(textView3, org.telegram.ui.ActionBar.y6.Sh, null);
            int dp2 = AndroidUtilities.dp(8.0f);
            int i12 = org.telegram.ui.ActionBar.y6.Oh;
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, i12, false);
            int o10 = i0.a.o(org.telegram.ui.ActionBar.y6.x0(null, i10, false), 120);
            org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.y6.j0(dp2, dp2, dp2, dp2, x02, o10, o10);
            org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i12);
            org.telegram.ui.ActionBar.b7 h = org.telegram.ui.ActionBar.f7.h(i10, 120);
            textView3.setBackground(j02);
            org.telegram.ui.ActionBar.f7.k(textView3, j02, N, h, null);
            linearLayout.addView(textView3, gb1.h(-1, 48.0f, 0, 14.0f, 28.0f, 14.0f, 6.0f));
            TextView textView4 = new TextView(activity);
            textView4.setGravity(17);
            textView4.setEllipsize(truncateAt);
            textView4.setSingleLine(true);
            textView4.setTextSize(1, 14.0f);
            textView4.setTypeface(AndroidUtilities.bold());
            textView4.setText(LocaleController.getString(R.string.ClearDownloadsList));
            org.telegram.ui.ActionBar.f7.V(textView4, i12, null);
            int dp3 = AndroidUtilities.dp(8.0f);
            int o11 = i0.a.o(org.telegram.ui.ActionBar.y6.x0(null, i12, false), 120);
            org.telegram.ui.Cells.y j03 = org.telegram.ui.ActionBar.y6.j0(dp3, dp3, dp3, dp3, 0, o11, o11);
            org.telegram.ui.ActionBar.b7 h10 = org.telegram.ui.ActionBar.f7.h(i12, 120);
            textView4.setBackground(j03);
            org.telegram.ui.ActionBar.f7.k(textView4, j03, null, h10, null);
            textView4.setLetterSpacing(0.025f);
            linearLayout.addView(textView4, gb1.h(-1, 48.0f, 0, 14.0f, 0.0f, 14.0f, 6.0f));
            NestedScrollView nestedScrollView = new NestedScrollView(activity);
            nestedScrollView.addView(frameLayout);
            k3Var.setCustomView(nestedScrollView);
            textView3.setOnClickListener(new ga(12, k3Var, r2Var));
            textView4.setOnClickListener(new View.OnClickListener(k3Var) {
                public final pt f31378b;

                {
                    this.f31378b = k3Var;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f31378b.dismiss();
                            return;
                        default:
                            pt.m(this.f31378b);
                            return;
                    }
                }
            });
            k3Var.show();
        }
    }
}
