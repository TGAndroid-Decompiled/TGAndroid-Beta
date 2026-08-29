package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.IUpdateLayout;
public final class c61 extends IUpdateLayout {
    public FrameLayout f27351a;
    public RadialProgress2 f27352b;
    public org.telegram.ui.Cells.v1 f27353c;
    public final Activity d;
    public final ViewGroup f27354e;

    public c61(Activity activity, ViewGroup viewGroup) {
        super(activity, viewGroup);
        this.d = activity;
        this.f27354e = viewGroup;
    }

    @Override
    public final void createUpdateUI(int i10) {
        ViewGroup viewGroup = this.f27354e;
        if (viewGroup != null && this.f27351a == null) {
            Activity activity = this.d;
            FrameLayout frameLayout = new FrameLayout(activity);
            this.f27351a = frameLayout;
            frameLayout.setVisibility(4);
            this.f27351a.setTranslationY(AndroidUtilities.dp(44.0f));
            this.f27351a.setBackground(org.telegram.ui.ActionBar.g6.f0(1090519039, 2, -1));
            viewGroup.addView(this.f27351a, i7.f6.e(-1, 44, 83));
            this.f27351a.setOnClickListener(new jh.y0(this, i10, 13));
            org.telegram.ui.Cells.v1 v1Var = new org.telegram.ui.Cells.v1(this, activity);
            this.f27353c = v1Var;
            v1Var.setTextSize(AndroidUtilities.dp(15.0f));
            this.f27353c.setTypeface(AndroidUtilities.bold());
            this.f27353c.setTextColor(-1);
            this.f27353c.setGravity(17);
            this.f27351a.addView(this.f27353c, i7.f6.g());
            this.f27353c.c(LocaleController.getString(R.string.AppUpdateBeta), false, true);
            RadialProgress2 radialProgress2 = new RadialProgress2(this.f27353c, null);
            this.f27352b = radialProgress2;
            int i11 = org.telegram.ui.ActionBar.g6.Oh;
            radialProgress2.setColors(-1, -1, org.telegram.ui.ActionBar.g6.w0(null, i11, false), org.telegram.ui.ActionBar.g6.w0(null, i11, false));
            this.f27352b.q(0, 0, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f));
            this.f27352b.setCircleRadius(AndroidUtilities.dp(11.0f));
            this.f27352b.setAsMini();
        }
    }

    @Override
    public final void updateAppUpdateViews(int i10, boolean z10) {
        if (this.f27354e != null) {
            if (ApplicationLoader.applicationLoaderInstance.getUpdate() != null) {
                createUpdateUI(i10);
                File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
                if (downloadedUpdateFile != null && downloadedUpdateFile.exists()) {
                    this.f27352b.setIcon(15, true, z10);
                    this.f27353c.c(LocaleController.getString(R.string.AppUpdateNow), z10, true);
                } else if (ApplicationLoader.applicationLoaderInstance.isDownloadingUpdate()) {
                    this.f27352b.setIcon(3, true, z10);
                    this.f27352b.o(ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress(), true);
                    this.f27353c.c(LocaleController.formatString(R.string.AppUpdateDownloading, Integer.valueOf((int) (ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress() * 100.0f))), z10, true);
                } else {
                    this.f27352b.setIcon(2, true, z10);
                    this.f27353c.c(LocaleController.getString(R.string.AppUpdateBeta), z10, true);
                }
                if (this.f27351a.getTag() == null) {
                    this.f27351a.setVisibility(0);
                    this.f27351a.setTag(1);
                    if (z10) {
                        this.f27351a.animate().translationY(0.0f).setInterpolator(jr.f29801g).setListener(null).setDuration(180L).start();
                        return;
                    } else {
                        this.f27351a.setTranslationY(0.0f);
                        return;
                    }
                }
                return;
            }
            FrameLayout frameLayout = this.f27351a;
            if (frameLayout != null && frameLayout.getTag() != null) {
                this.f27351a.setTag(null);
                if (z10) {
                    this.f27351a.animate().translationY(AndroidUtilities.dp(44.0f)).setInterpolator(jr.f29801g).setListener(new p11(this, 5)).setDuration(180L).start();
                    return;
                }
                this.f27351a.setTranslationY(AndroidUtilities.dp(44.0f));
                this.f27351a.setVisibility(4);
            }
        }
    }

    @Override
    public final void updateFileProgress(Object[] objArr) {
        if (this.f27351a != null && this.f27353c != null && ApplicationLoader.applicationLoaderInstance.isDownloadingUpdate()) {
            float downloadingUpdateProgress = ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress();
            this.f27352b.o(downloadingUpdateProgress, true);
            this.f27353c.setText(LocaleController.formatString(R.string.AppUpdateDownloading, Integer.valueOf((int) (downloadingUpdateProgress * 100.0f))));
            this.f27351a.invalidate();
        }
    }
}
