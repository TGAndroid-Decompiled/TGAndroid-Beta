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
public final class y71 extends IUpdateLayout {
    public FrameLayout f34966a;
    public RadialProgress2 f34967b;
    public org.telegram.ui.Cells.v1 f34968c;
    public final Activity d;
    public final ViewGroup e;

    public y71(Activity activity, ViewGroup viewGroup) {
        super(activity, viewGroup);
        this.d = activity;
        this.e = viewGroup;
    }

    @Override
    public final void createUpdateUI(int i10) {
        ViewGroup viewGroup = this.e;
        if (viewGroup != null && this.f34966a == null) {
            Activity activity = this.d;
            FrameLayout frameLayout = new FrameLayout(activity);
            this.f34966a = frameLayout;
            frameLayout.setVisibility(4);
            this.f34966a.setTranslationY(AndroidUtilities.dp(44.0f));
            this.f34966a.setBackground(org.telegram.ui.ActionBar.y6.g0(1090519039, 2, -1));
            viewGroup.addView(this.f34966a, gb1.i(-1, 44, 83));
            this.f34966a.setOnClickListener(new ai.w(this, i10, 20));
            org.telegram.ui.Cells.v1 v1Var = new org.telegram.ui.Cells.v1(this, activity);
            this.f34968c = v1Var;
            v1Var.setTextSize(AndroidUtilities.dp(15.0f));
            this.f34968c.setTypeface(AndroidUtilities.bold());
            this.f34968c.setTextColor(-1);
            this.f34968c.setGravity(17);
            this.f34966a.addView(this.f34968c, gb1.k());
            this.f34968c.c(LocaleController.getString(R.string.AppUpdateBeta), false, true);
            RadialProgress2 radialProgress2 = new RadialProgress2(this.f34968c, null);
            this.f34967b = radialProgress2;
            int i11 = org.telegram.ui.ActionBar.y6.Oh;
            radialProgress2.setColors(-1, -1, org.telegram.ui.ActionBar.y6.x0(null, i11, false), org.telegram.ui.ActionBar.y6.x0(null, i11, false));
            this.f34967b.r(0, 0, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f));
            this.f34967b.setCircleRadius(AndroidUtilities.dp(11.0f));
            this.f34967b.setAsMini();
        }
    }

    @Override
    public final void updateAppUpdateViews(int i10, boolean z10) {
        if (this.e != null) {
            if (ApplicationLoader.applicationLoaderInstance.getUpdate() != null) {
                createUpdateUI(i10);
                File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
                if (downloadedUpdateFile != null && downloadedUpdateFile.exists()) {
                    this.f34967b.setIcon(15, true, z10);
                    this.f34968c.c(LocaleController.getString(R.string.AppUpdateNow), z10, true);
                } else if (ApplicationLoader.applicationLoaderInstance.isDownloadingUpdate()) {
                    this.f34967b.setIcon(3, true, z10);
                    this.f34967b.p(ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress(), true);
                    this.f34968c.c(LocaleController.formatString(R.string.AppUpdateDownloading, Integer.valueOf((int) (ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress() * 100.0f))), z10, true);
                } else {
                    this.f34967b.setIcon(2, true, z10);
                    this.f34968c.c(LocaleController.getString(R.string.AppUpdateBeta), z10, true);
                }
                if (this.f34966a.getTag() == null) {
                    this.f34966a.setVisibility(0);
                    this.f34966a.setTag(1);
                    if (z10) {
                        this.f34966a.animate().translationY(0.0f).setInterpolator(ds.f27585g).setListener(null).setDuration(180L).start();
                        return;
                    } else {
                        this.f34966a.setTranslationY(0.0f);
                        return;
                    }
                }
                return;
            }
            FrameLayout frameLayout = this.f34966a;
            if (frameLayout != null && frameLayout.getTag() != null) {
                this.f34966a.setTag(null);
                if (z10) {
                    this.f34966a.animate().translationY(AndroidUtilities.dp(44.0f)).setInterpolator(ds.f27585g).setListener(new h31(this, 5)).setDuration(180L).start();
                    return;
                }
                this.f34966a.setTranslationY(AndroidUtilities.dp(44.0f));
                this.f34966a.setVisibility(4);
            }
        }
    }

    @Override
    public final void updateFileProgress(Object[] objArr) {
        if (this.f34966a != null && this.f34968c != null && ApplicationLoader.applicationLoaderInstance.isDownloadingUpdate()) {
            float downloadingUpdateProgress = ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress();
            this.f34967b.p(downloadingUpdateProgress, true);
            this.f34968c.setText(LocaleController.formatString(R.string.AppUpdateDownloading, Integer.valueOf((int) (downloadingUpdateProgress * 100.0f))));
            this.f34966a.invalidate();
        }
    }
}
