package org.telegram.ui.Components;

import android.app.Activity;
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
public final class nt extends org.telegram.ui.ActionBar.f3 {
    public static void n(nt ntVar) {
        ntVar.dismiss();
        DownloadController.getInstance(ntVar.currentAccount).clearRecentDownloadedFiles();
    }

    public static void o(Activity activity, org.telegram.ui.ActionBar.n2 n2Var) {
        if (n2Var != null && activity != null) {
            final ?? f3Var = new org.telegram.ui.ActionBar.f3(activity, false);
            f3Var.setApplyBottomPadding(false);
            f3Var.setApplyTopPadding(false);
            int i10 = org.telegram.ui.ActionBar.h6.f20993d6;
            f3Var.fixNavigationBar(f3Var.getThemedColor(i10));
            LinearLayout linearLayout = new LinearLayout(activity);
            linearLayout.setOrientation(1);
            FrameLayout frameLayout = new FrameLayout(activity);
            frameLayout.addView(linearLayout);
            ImageView imageView = new ImageView(activity);
            imageView.setBackground(org.telegram.ui.ActionBar.h6.g0(f3Var.getThemedColor(org.telegram.ui.ActionBar.h6.f21082i6), 1, -1));
            imageView.setColorFilter(f3Var.getThemedColor(org.telegram.ui.ActionBar.h6.Ji));
            imageView.setImageResource(R.drawable.ic_layer_close);
            imageView.setOnClickListener(new View.OnClickListener(f3Var) {
                public final nt f28601b;

                {
                    this.f28601b = f3Var;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f28601b.dismiss();
                            return;
                        default:
                            nt.n(this.f28601b);
                            return;
                    }
                }
            });
            int dp = AndroidUtilities.dp(8.0f);
            imageView.setPadding(dp, dp, dp, dp);
            frameLayout.addView(imageView, w7.z5.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
            ux0 ux0Var = new ux0(activity, f3Var.currentAccount);
            ux0Var.setStickerNum(9);
            ux0Var.getImageReceiver().setAutoRepeat(1);
            linearLayout.addView(ux0Var, w7.z5.t(110, 110, 1, 0, 26, 0, 0));
            TextView textView = new TextView(activity);
            textView.setGravity(1);
            int i11 = org.telegram.ui.ActionBar.h6.f21099j5;
            textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
            textView.setTextSize(1, 20.0f);
            textView.setText(LocaleController.getString(R.string.DownloadedFiles));
            linearLayout.addView(textView, w7.z5.d(-1, -2.0f, 0, 21.0f, 20.0f, 21.0f, 0.0f));
            TextView textView2 = new TextView(activity);
            textView2.setGravity(1);
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
            textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
            textView2.setText(LocaleController.formatString("DownloadedFilesMessage", R.string.DownloadedFilesMessage, new Object[0]));
            linearLayout.addView(textView2, w7.z5.d(-1, -2.0f, 0, 28.0f, 7.0f, 28.0f, 0.0f));
            TextView textView3 = new TextView(activity);
            textView3.setGravity(17);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView3.setEllipsize(truncateAt);
            textView3.setSingleLine(true);
            textView3.setTextSize(1, 14.0f);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setText(LocaleController.getString(R.string.ManageDeviceStorage));
            textView3.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Sh, false));
            int dp2 = AndroidUtilities.dp(8.0f);
            int i12 = org.telegram.ui.ActionBar.h6.Oh;
            int x02 = org.telegram.ui.ActionBar.h6.x0(null, i12, false);
            int o10 = i0.a.o(org.telegram.ui.ActionBar.h6.x0(null, i10, false), 120);
            textView3.setBackground(org.telegram.ui.ActionBar.h6.j0(dp2, dp2, dp2, dp2, x02, o10, o10));
            linearLayout.addView(textView3, w7.z5.d(-1, 48.0f, 0, 14.0f, 28.0f, 14.0f, 6.0f));
            TextView textView4 = new TextView(activity);
            textView4.setGravity(17);
            textView4.setEllipsize(truncateAt);
            textView4.setSingleLine(true);
            textView4.setTextSize(1, 14.0f);
            textView4.setTypeface(AndroidUtilities.bold());
            textView4.setText(LocaleController.getString(R.string.ClearDownloadsList));
            textView4.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
            int dp3 = AndroidUtilities.dp(8.0f);
            int o11 = i0.a.o(org.telegram.ui.ActionBar.h6.x0(null, i12, false), 120);
            textView4.setBackground(org.telegram.ui.ActionBar.h6.j0(dp3, dp3, dp3, dp3, 0, o11, o11));
            textView4.setLetterSpacing(0.025f);
            linearLayout.addView(textView4, w7.z5.d(-1, 48.0f, 0, 14.0f, 0.0f, 14.0f, 6.0f));
            NestedScrollView nestedScrollView = new NestedScrollView(activity);
            nestedScrollView.addView(frameLayout);
            f3Var.setCustomView(nestedScrollView);
            textView3.setOnClickListener(new ca(10, f3Var, n2Var));
            textView4.setOnClickListener(new View.OnClickListener(f3Var) {
                public final nt f28601b;

                {
                    this.f28601b = f3Var;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f28601b.dismiss();
                            return;
                        default:
                            nt.n(this.f28601b);
                            return;
                    }
                }
            });
            f3Var.show();
        }
    }
}
