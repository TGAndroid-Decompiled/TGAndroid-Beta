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
public final class xs extends org.telegram.ui.ActionBar.f3 {
    public static void m(xs xsVar) {
        xsVar.dismiss();
        DownloadController.getInstance(xsVar.currentAccount).clearRecentDownloadedFiles();
    }

    public static void n(Activity activity, org.telegram.ui.ActionBar.o2 o2Var) {
        if (o2Var != null && activity != null) {
            final ?? f3Var = new org.telegram.ui.ActionBar.f3(activity, false);
            f3Var.setApplyBottomPadding(false);
            f3Var.setApplyTopPadding(false);
            int i10 = org.telegram.ui.ActionBar.g6.f23062d6;
            f3Var.fixNavigationBar(f3Var.getThemedColor(i10));
            LinearLayout linearLayout = new LinearLayout(activity);
            linearLayout.setOrientation(1);
            FrameLayout frameLayout = new FrameLayout(activity);
            frameLayout.addView(linearLayout);
            ImageView imageView = new ImageView(activity);
            imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(f3Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23152i6), 1, -1));
            imageView.setColorFilter(f3Var.getThemedColor(org.telegram.ui.ActionBar.g6.Ji));
            imageView.setImageResource(R.drawable.ic_layer_close);
            imageView.setOnClickListener(new View.OnClickListener(f3Var) {
                public final xs f34487b;

                {
                    this.f34487b = f3Var;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f34487b.dismiss();
                            return;
                        default:
                            xs.m(this.f34487b);
                            return;
                    }
                }
            });
            int dp = AndroidUtilities.dp(8.0f);
            imageView.setPadding(dp, dp, dp, dp);
            frameLayout.addView(imageView, i7.f6.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
            rw0 rw0Var = new rw0(activity, f3Var.currentAccount);
            rw0Var.setStickerNum(9);
            rw0Var.getImageReceiver().setAutoRepeat(1);
            linearLayout.addView(rw0Var, i7.f6.t(110, 110, 1, 0, 26, 0, 0));
            TextView textView = new TextView(activity);
            textView.setGravity(1);
            int i11 = org.telegram.ui.ActionBar.g6.f23169j5;
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
            textView.setTextSize(1, 20.0f);
            textView.setText(LocaleController.getString(R.string.DownloadedFiles));
            linearLayout.addView(textView, i7.f6.d(-1, -2.0f, 0, 21.0f, 20.0f, 21.0f, 0.0f));
            TextView textView2 = new TextView(activity);
            textView2.setGravity(1);
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
            textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
            textView2.setText(LocaleController.formatString("DownloadedFilesMessage", R.string.DownloadedFilesMessage, new Object[0]));
            linearLayout.addView(textView2, i7.f6.d(-1, -2.0f, 0, 28.0f, 7.0f, 28.0f, 0.0f));
            TextView textView3 = new TextView(activity);
            textView3.setGravity(17);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView3.setEllipsize(truncateAt);
            textView3.setSingleLine(true);
            textView3.setTextSize(1, 14.0f);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setText(LocaleController.getString(R.string.ManageDeviceStorage));
            textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
            int dp2 = AndroidUtilities.dp(8.0f);
            int i12 = org.telegram.ui.ActionBar.g6.Oh;
            int w02 = org.telegram.ui.ActionBar.g6.w0(null, i12, false);
            int k9 = i0.a.k(org.telegram.ui.ActionBar.g6.w0(null, i10, false), 120);
            textView3.setBackground(org.telegram.ui.ActionBar.g6.i0(dp2, dp2, dp2, dp2, w02, k9, k9));
            linearLayout.addView(textView3, i7.f6.d(-1, 48.0f, 0, 14.0f, 28.0f, 14.0f, 6.0f));
            TextView textView4 = new TextView(activity);
            textView4.setGravity(17);
            textView4.setEllipsize(truncateAt);
            textView4.setSingleLine(true);
            textView4.setTextSize(1, 14.0f);
            textView4.setTypeface(AndroidUtilities.bold());
            textView4.setText(LocaleController.getString(R.string.ClearDownloadsList));
            textView4.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
            int dp3 = AndroidUtilities.dp(8.0f);
            int k10 = i0.a.k(org.telegram.ui.ActionBar.g6.w0(null, i12, false), 120);
            textView4.setBackground(org.telegram.ui.ActionBar.g6.i0(dp3, dp3, dp3, dp3, 0, k10, k10));
            textView4.setLetterSpacing(0.025f);
            linearLayout.addView(textView4, i7.f6.d(-1, 48.0f, 0, 14.0f, 0.0f, 14.0f, 6.0f));
            NestedScrollView nestedScrollView = new NestedScrollView(activity);
            nestedScrollView.addView(frameLayout);
            f3Var.setCustomView(nestedScrollView);
            textView3.setOnClickListener(new t2(18, f3Var, o2Var));
            textView4.setOnClickListener(new View.OnClickListener(f3Var) {
                public final xs f34487b;

                {
                    this.f34487b = f3Var;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f34487b.dismiss();
                            return;
                        default:
                            xs.m(this.f34487b);
                            return;
                    }
                }
            });
            f3Var.show();
        }
    }
}
