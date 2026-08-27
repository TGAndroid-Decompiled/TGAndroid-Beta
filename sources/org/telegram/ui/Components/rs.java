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

public final class rs extends org.telegram.ui.ActionBar.e3 {
    public static void m(rs rsVar) {
        rsVar.dismiss();
        DownloadController.getInstance(rsVar.currentAccount).clearRecentDownloadedFiles();
    }

    public static void n(Activity activity, org.telegram.ui.ActionBar.n2 n2Var) {
        if (n2Var == null || activity == null) {
            return;
        }
        final rs rsVar = new rs(activity, false);
        rsVar.setApplyBottomPadding(false);
        rsVar.setApplyTopPadding(false);
        int i10 = org.telegram.ui.ActionBar.g6.f23053d6;
        rsVar.fixNavigationBar(rsVar.getThemedColor(i10));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.addView(linearLayout);
        ImageView imageView = new ImageView(activity);
        imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(rsVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23144i6), 1, -1));
        imageView.setColorFilter(rsVar.getThemedColor(org.telegram.ui.ActionBar.g6.Ji));
        imageView.setImageResource(R.drawable.ic_layer_close);
        final int i11 = 0;
        imageView.setOnClickListener(new View.OnClickListener(rsVar) {

            public final rs f31968b;

            {
                this.f31968b = rsVar;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.f31968b.dismiss();
                        break;
                    default:
                        rs.m(this.f31968b);
                        break;
                }
            }
        });
        int iDp = AndroidUtilities.dp(8.0f);
        imageView.setPadding(iDp, iDp, iDp, iDp);
        frameLayout.addView(imageView, h7.z5.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
        jw0 jw0Var = new jw0(activity, rsVar.currentAccount);
        jw0Var.setStickerNum(9);
        jw0Var.getImageReceiver().setAutoRepeat(1);
        linearLayout.addView(jw0Var, h7.z5.t(110, 110, 1, 0, 26, 0, 0));
        TextView textView = new TextView(activity);
        textView.setGravity(1);
        int i12 = org.telegram.ui.ActionBar.g6.f23161j5;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        textView.setTextSize(1, 20.0f);
        textView.setText(LocaleController.getString(R.string.DownloadedFiles));
        linearLayout.addView(textView, h7.z5.d(-1, -2.0f, 0, 21.0f, 20.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(activity);
        textView2.setGravity(1);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
        textView2.setText(LocaleController.formatString("DownloadedFilesMessage", R.string.DownloadedFilesMessage, new Object[0]));
        linearLayout.addView(textView2, h7.z5.d(-1, -2.0f, 0, 28.0f, 7.0f, 28.0f, 0.0f));
        TextView textView3 = new TextView(activity);
        textView3.setGravity(17);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView3.setEllipsize(truncateAt);
        textView3.setSingleLine(true);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setText(LocaleController.getString(R.string.ManageDeviceStorage));
        textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
        int iDp2 = AndroidUtilities.dp(8.0f);
        int i13 = org.telegram.ui.ActionBar.g6.Oh;
        int iW0 = org.telegram.ui.ActionBar.g6.w0(null, i13, false);
        int iK = i0.b.k(org.telegram.ui.ActionBar.g6.w0(null, i10, false), 120);
        textView3.setBackground(org.telegram.ui.ActionBar.g6.i0(iDp2, iDp2, iDp2, iDp2, iW0, iK, iK));
        linearLayout.addView(textView3, h7.z5.d(-1, 48.0f, 0, 14.0f, 28.0f, 14.0f, 6.0f));
        TextView textView4 = new TextView(activity);
        textView4.setGravity(17);
        textView4.setEllipsize(truncateAt);
        textView4.setSingleLine(true);
        textView4.setTextSize(1, 14.0f);
        textView4.setTypeface(AndroidUtilities.bold());
        textView4.setText(LocaleController.getString(R.string.ClearDownloadsList));
        textView4.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        int iDp3 = AndroidUtilities.dp(8.0f);
        int iK2 = i0.b.k(org.telegram.ui.ActionBar.g6.w0(null, i13, false), 120);
        textView4.setBackground(org.telegram.ui.ActionBar.g6.i0(iDp3, iDp3, iDp3, iDp3, 0, iK2, iK2));
        textView4.setLetterSpacing(0.025f);
        linearLayout.addView(textView4, h7.z5.d(-1, 48.0f, 0, 14.0f, 0.0f, 14.0f, 6.0f));
        NestedScrollView nestedScrollView = new NestedScrollView(activity, null);
        nestedScrollView.addView(frameLayout);
        rsVar.setCustomView(nestedScrollView);
        textView3.setOnClickListener(new q2(18, rsVar, n2Var));
        final int i14 = 1;
        textView4.setOnClickListener(new View.OnClickListener(rsVar) {

            public final rs f31968b;

            {
                this.f31968b = rsVar;
            }

            @Override
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        this.f31968b.dismiss();
                        break;
                    default:
                        rs.m(this.f31968b);
                        break;
                }
            }
        });
        rsVar.show();
    }
}
