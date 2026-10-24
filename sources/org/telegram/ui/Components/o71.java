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
public final class o71 extends IUpdateLayout {
    public FrameLayout f29164a;
    public RadialProgress2 f29165b;
    public org.telegram.ui.Cells.w1 f29166c;
    public final Activity d;
    public final ViewGroup e;

    public o71(Activity activity, ViewGroup viewGroup) {
        super(activity, viewGroup);
        this.d = activity;
        this.e = viewGroup;
    }

    @Override
    public final void createUpdateUI(int i10) {
        ViewGroup viewGroup = this.e;
        if (viewGroup != null && this.f29164a == null) {
            Activity activity = this.d;
            FrameLayout frameLayout = new FrameLayout(activity);
            this.f29164a = frameLayout;
            frameLayout.setVisibility(4);
            this.f29164a.setTranslationY(AndroidUtilities.dp(44.0f));
            this.f29164a.setBackground(org.telegram.ui.ActionBar.k6.g0(1090519039, 2, -1));
            viewGroup.addView(this.f29164a, w7.z5.e(-1, 44, 83));
            this.f29164a.setOnClickListener(new ai.n1(this, i10, 16));
            org.telegram.ui.Cells.w1 w1Var = new org.telegram.ui.Cells.w1(this, activity);
            this.f29166c = w1Var;
            w1Var.setTextSize(AndroidUtilities.dp(15.0f));
            this.f29166c.setTypeface(AndroidUtilities.bold());
            this.f29166c.setTextColor(-1);
            this.f29166c.setGravity(17);
            this.f29164a.addView(this.f29166c, w7.z5.g());
            this.f29166c.c(LocaleController.getString(R.string.AppUpdateBeta), false, true);
            RadialProgress2 radialProgress2 = new RadialProgress2(this.f29166c, null);
            this.f29165b = radialProgress2;
            int i11 = org.telegram.ui.ActionBar.k6.Oh;
            radialProgress2.setColors(-1, -1, org.telegram.ui.ActionBar.k6.x0(null, i11, false), org.telegram.ui.ActionBar.k6.x0(null, i11, false));
            this.f29165b.r(0, 0, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f));
            this.f29165b.setCircleRadius(AndroidUtilities.dp(11.0f));
            this.f29165b.setAsMini();
        }
    }

    @Override
    public final void updateAppUpdateViews(int i10, boolean z10) {
        if (this.e != null) {
            if (ApplicationLoader.applicationLoaderInstance.getUpdate() != null) {
                createUpdateUI(i10);
                File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
                if (downloadedUpdateFile != null && downloadedUpdateFile.exists()) {
                    this.f29165b.setIcon(15, true, z10);
                    this.f29166c.c(LocaleController.getString(R.string.AppUpdateNow), z10, true);
                } else if (ApplicationLoader.applicationLoaderInstance.isDownloadingUpdate()) {
                    this.f29165b.setIcon(3, true, z10);
                    this.f29165b.p(ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress(), true);
                    this.f29166c.c(LocaleController.formatString(R.string.AppUpdateDownloading, Integer.valueOf((int) (ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress() * 100.0f))), z10, true);
                } else {
                    this.f29165b.setIcon(2, true, z10);
                    this.f29166c.c(LocaleController.getString(R.string.AppUpdateBeta), z10, true);
                }
                if (this.f29164a.getTag() == null) {
                    this.f29164a.setVisibility(0);
                    this.f29164a.setTag(1);
                    if (z10) {
                        this.f29164a.animate().translationY(0.0f).setInterpolator(zr.f33338g).setListener(null).setDuration(180L).start();
                        return;
                    } else {
                        this.f29164a.setTranslationY(0.0f);
                        return;
                    }
                }
                return;
            }
            FrameLayout frameLayout = this.f29164a;
            if (frameLayout != null && frameLayout.getTag() != null) {
                this.f29164a.setTag(null);
                if (z10) {
                    this.f29164a.animate().translationY(AndroidUtilities.dp(44.0f)).setInterpolator(zr.f33338g).setListener(new o31(this, 4)).setDuration(180L).start();
                    return;
                }
                this.f29164a.setTranslationY(AndroidUtilities.dp(44.0f));
                this.f29164a.setVisibility(4);
            }
        }
    }

    @Override
    public final void updateFileProgress(Object[] objArr) {
        if (this.f29164a != null && this.f29166c != null && ApplicationLoader.applicationLoaderInstance.isDownloadingUpdate()) {
            float downloadingUpdateProgress = ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress();
            this.f29165b.p(downloadingUpdateProgress, true);
            this.f29166c.setText(LocaleController.formatString(R.string.AppUpdateDownloading, Integer.valueOf((int) (downloadingUpdateProgress * 100.0f))));
            this.f29164a.invalidate();
        }
    }
}
