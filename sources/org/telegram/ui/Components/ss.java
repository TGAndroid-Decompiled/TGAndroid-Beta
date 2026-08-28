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
public final class ss extends org.telegram.ui.ActionBar.f3 {
    public static void m(ss ssVar) {
        ssVar.dismiss();
        DownloadController.getInstance(ssVar.currentAccount).clearRecentDownloadedFiles();
    }

    public static void n(Activity activity, org.telegram.ui.ActionBar.o2 o2Var) {
        if (o2Var != null && activity != null) {
            final ?? f3Var = new org.telegram.ui.ActionBar.f3(activity, false);
            f3Var.setApplyBottomPadding(false);
            f3Var.setApplyTopPadding(false);
            int i9 = org.telegram.ui.ActionBar.f6.f23001d6;
            f3Var.fixNavigationBar(f3Var.getThemedColor(i9));
            LinearLayout linearLayout = new LinearLayout(activity);
            linearLayout.setOrientation(1);
            FrameLayout frameLayout = new FrameLayout(activity);
            frameLayout.addView(linearLayout);
            ImageView imageView = new ImageView(activity);
            imageView.setBackground(org.telegram.ui.ActionBar.f6.f0(f3Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23092i6), 1, -1));
            imageView.setColorFilter(f3Var.getThemedColor(org.telegram.ui.ActionBar.f6.Ji));
            imageView.setImageResource(R.drawable.ic_layer_close);
            imageView.setOnClickListener(new View.OnClickListener(f3Var) {
                public final ss f32281b;

                {
                    this.f32281b = f3Var;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f32281b.dismiss();
                            return;
                        default:
                            ss.m(this.f32281b);
                            return;
                    }
                }
            });
            int dp = AndroidUtilities.dp(8.0f);
            imageView.setPadding(dp, dp, dp, dp);
            frameLayout.addView(imageView, g7.e6.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
            hw0 hw0Var = new hw0(activity, f3Var.currentAccount);
            hw0Var.setStickerNum(9);
            hw0Var.getImageReceiver().setAutoRepeat(1);
            linearLayout.addView(hw0Var, g7.e6.t(110, 110, 1, 0, 26, 0, 0));
            TextView textView = new TextView(activity);
            textView.setGravity(1);
            int i10 = org.telegram.ui.ActionBar.f6.f23108j5;
            textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
            textView.setTextSize(1, 20.0f);
            textView.setText(LocaleController.getString(R.string.DownloadedFiles));
            linearLayout.addView(textView, g7.e6.d(-1, -2.0f, 0, 21.0f, 20.0f, 21.0f, 0.0f));
            TextView textView2 = new TextView(activity);
            textView2.setGravity(1);
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
            textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
            textView2.setText(LocaleController.formatString("DownloadedFilesMessage", R.string.DownloadedFilesMessage, new Object[0]));
            linearLayout.addView(textView2, g7.e6.d(-1, -2.0f, 0, 28.0f, 7.0f, 28.0f, 0.0f));
            TextView textView3 = new TextView(activity);
            textView3.setGravity(17);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView3.setEllipsize(truncateAt);
            textView3.setSingleLine(true);
            textView3.setTextSize(1, 14.0f);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setText(LocaleController.getString(R.string.ManageDeviceStorage));
            textView3.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sh, false));
            int dp2 = AndroidUtilities.dp(8.0f);
            int i11 = org.telegram.ui.ActionBar.f6.Oh;
            int w02 = org.telegram.ui.ActionBar.f6.w0(null, i11, false);
            int k10 = i0.a.k(org.telegram.ui.ActionBar.f6.w0(null, i9, false), 120);
            textView3.setBackground(org.telegram.ui.ActionBar.f6.i0(dp2, dp2, dp2, dp2, w02, k10, k10));
            linearLayout.addView(textView3, g7.e6.d(-1, 48.0f, 0, 14.0f, 28.0f, 14.0f, 6.0f));
            TextView textView4 = new TextView(activity);
            textView4.setGravity(17);
            textView4.setEllipsize(truncateAt);
            textView4.setSingleLine(true);
            textView4.setTextSize(1, 14.0f);
            textView4.setTypeface(AndroidUtilities.bold());
            textView4.setText(LocaleController.getString(R.string.ClearDownloadsList));
            textView4.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
            int dp3 = AndroidUtilities.dp(8.0f);
            int k11 = i0.a.k(org.telegram.ui.ActionBar.f6.w0(null, i11, false), 120);
            textView4.setBackground(org.telegram.ui.ActionBar.f6.i0(dp3, dp3, dp3, dp3, 0, k11, k11));
            textView4.setLetterSpacing(0.025f);
            linearLayout.addView(textView4, g7.e6.d(-1, 48.0f, 0, 14.0f, 0.0f, 14.0f, 6.0f));
            NestedScrollView nestedScrollView = new NestedScrollView(activity);
            nestedScrollView.addView(frameLayout);
            f3Var.setCustomView(nestedScrollView);
            textView3.setOnClickListener(new s2(17, f3Var, o2Var));
            textView4.setOnClickListener(new View.OnClickListener(f3Var) {
                public final ss f32281b;

                {
                    this.f32281b = f3Var;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f32281b.dismiss();
                            return;
                        default:
                            ss.m(this.f32281b);
                            return;
                    }
                }
            });
            f3Var.show();
        }
    }
}
