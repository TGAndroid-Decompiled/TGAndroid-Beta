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
public final class k61 extends IUpdateLayout {
    public FrameLayout f25525a;
    public RadialProgress2 f25526b;
    public org.telegram.ui.Cells.w1 f25527c;
    public final Activity d;
    public final ViewGroup e;

    public k61(Activity activity, ViewGroup viewGroup) {
        super(activity, viewGroup);
        this.d = activity;
        this.e = viewGroup;
    }

    @Override
    public final void createUpdateUI(int i10) {
        ViewGroup viewGroup = this.e;
        if (viewGroup != null && this.f25525a == null) {
            Activity activity = this.d;
            FrameLayout frameLayout = new FrameLayout(activity);
            this.f25525a = frameLayout;
            frameLayout.setVisibility(4);
            this.f25525a.setTranslationY(AndroidUtilities.dp(44.0f));
            this.f25525a.setBackground(org.telegram.ui.ActionBar.h6.f0(1090519039, 2, -1));
            viewGroup.addView(this.f25525a, w7.x5.e(-1, 44, 83));
            this.f25525a.setOnClickListener(new ci.n4(this, i10, 14));
            org.telegram.ui.Cells.w1 w1Var = new org.telegram.ui.Cells.w1(this, activity);
            this.f25527c = w1Var;
            w1Var.setTextSize(AndroidUtilities.dp(15.0f));
            this.f25527c.setTypeface(AndroidUtilities.bold());
            this.f25527c.setTextColor(-1);
            this.f25527c.setGravity(17);
            this.f25525a.addView(this.f25527c, w7.x5.g());
            this.f25527c.c(LocaleController.getString(R.string.AppUpdateBeta), false, true);
            RadialProgress2 radialProgress2 = new RadialProgress2(this.f25527c, null);
            this.f25526b = radialProgress2;
            int i11 = org.telegram.ui.ActionBar.h6.Oh;
            radialProgress2.setColors(-1, -1, org.telegram.ui.ActionBar.h6.w0(null, i11, false), org.telegram.ui.ActionBar.h6.w0(null, i11, false));
            this.f25526b.q(0, 0, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f));
            this.f25526b.setCircleRadius(AndroidUtilities.dp(11.0f));
            this.f25526b.setAsMini();
        }
    }

    @Override
    public final void updateAppUpdateViews(int i10, boolean z10) {
        if (this.e != null) {
            if (ApplicationLoader.applicationLoaderInstance.getUpdate() != null) {
                createUpdateUI(i10);
                File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
                if (downloadedUpdateFile != null && downloadedUpdateFile.exists()) {
                    this.f25526b.setIcon(15, true, z10);
                    this.f25527c.c(LocaleController.getString(R.string.AppUpdateNow), z10, true);
                } else if (ApplicationLoader.applicationLoaderInstance.isDownloadingUpdate()) {
                    this.f25526b.setIcon(3, true, z10);
                    this.f25526b.o(ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress(), true);
                    this.f25527c.c(LocaleController.formatString(R.string.AppUpdateDownloading, Integer.valueOf((int) (ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress() * 100.0f))), z10, true);
                } else {
                    this.f25526b.setIcon(2, true, z10);
                    this.f25527c.c(LocaleController.getString(R.string.AppUpdateBeta), z10, true);
                }
                if (this.f25525a.getTag() == null) {
                    this.f25525a.setVisibility(0);
                    this.f25525a.setTag(1);
                    if (z10) {
                        this.f25525a.animate().translationY(0.0f).setInterpolator(rr.f27702g).setListener(null).setDuration(180L).start();
                        return;
                    } else {
                        this.f25525a.setTranslationY(0.0f);
                        return;
                    }
                }
                return;
            }
            FrameLayout frameLayout = this.f25525a;
            if (frameLayout != null && frameLayout.getTag() != null) {
                this.f25525a.setTag(null);
                if (z10) {
                    this.f25525a.animate().translationY(AndroidUtilities.dp(44.0f)).setInterpolator(rr.f27702g).setListener(new jd0(this, 27)).setDuration(180L).start();
                    return;
                }
                this.f25525a.setTranslationY(AndroidUtilities.dp(44.0f));
                this.f25525a.setVisibility(4);
            }
        }
    }

    @Override
    public final void updateFileProgress(Object[] objArr) {
        if (this.f25525a != null && this.f25527c != null && ApplicationLoader.applicationLoaderInstance.isDownloadingUpdate()) {
            float downloadingUpdateProgress = ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress();
            this.f25526b.o(downloadingUpdateProgress, true);
            this.f25527c.setText(LocaleController.formatString(R.string.AppUpdateDownloading, Integer.valueOf((int) (downloadingUpdateProgress * 100.0f))));
            this.f25525a.invalidate();
        }
    }
}
