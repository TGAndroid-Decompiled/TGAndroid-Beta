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
public final class r71 extends IUpdateLayout {
    public FrameLayout f30445a;
    public RadialProgress2 f30446b;
    public org.telegram.ui.Cells.x1 f30447c;
    public final Activity d;
    public final ViewGroup f30448e;

    public r71(Activity activity, ViewGroup viewGroup) {
        super(activity, viewGroup);
        this.d = activity;
        this.f30448e = viewGroup;
    }

    @Override
    public final void createUpdateUI(int i10) {
        ViewGroup viewGroup = this.f30448e;
        if (viewGroup != null && this.f30445a == null) {
            Activity activity = this.d;
            FrameLayout frameLayout = new FrameLayout(activity);
            this.f30445a = frameLayout;
            frameLayout.setVisibility(4);
            this.f30445a.setTranslationY(AndroidUtilities.dp(44.0f));
            this.f30445a.setBackground(org.telegram.ui.ActionBar.h6.g0(1090519039, 2, -1));
            viewGroup.addView(this.f30445a, w7.x5.e(-1, 44, 83));
            this.f30445a.setOnClickListener(new ci.m4(this, i10, 14));
            org.telegram.ui.Cells.x1 x1Var = new org.telegram.ui.Cells.x1(this, activity);
            this.f30447c = x1Var;
            x1Var.setTextSize(AndroidUtilities.dp(15.0f));
            this.f30447c.setTypeface(AndroidUtilities.bold());
            this.f30447c.setTextColor(-1);
            this.f30447c.setGravity(17);
            this.f30445a.addView(this.f30447c, w7.x5.g());
            this.f30447c.c(LocaleController.getString(R.string.AppUpdateBeta), false, true);
            RadialProgress2 radialProgress2 = new RadialProgress2(this.f30447c, null);
            this.f30446b = radialProgress2;
            int i11 = org.telegram.ui.ActionBar.h6.Oh;
            radialProgress2.setColors(-1, -1, org.telegram.ui.ActionBar.h6.x0(null, i11, false), org.telegram.ui.ActionBar.h6.x0(null, i11, false));
            this.f30446b.q(0, 0, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f));
            this.f30446b.setCircleRadius(AndroidUtilities.dp(11.0f));
            this.f30446b.setAsMini();
        }
    }

    @Override
    public final void updateAppUpdateViews(int i10, boolean z10) {
        if (this.f30448e != null) {
            if (ApplicationLoader.applicationLoaderInstance.getUpdate() != null) {
                createUpdateUI(i10);
                File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
                if (downloadedUpdateFile != null && downloadedUpdateFile.exists()) {
                    this.f30446b.setIcon(15, true, z10);
                    this.f30447c.c(LocaleController.getString(R.string.AppUpdateNow), z10, true);
                } else if (ApplicationLoader.applicationLoaderInstance.isDownloadingUpdate()) {
                    this.f30446b.setIcon(3, true, z10);
                    this.f30446b.o(ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress(), true);
                    this.f30447c.c(LocaleController.formatString(R.string.AppUpdateDownloading, Integer.valueOf((int) (ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress() * 100.0f))), z10, true);
                } else {
                    this.f30446b.setIcon(2, true, z10);
                    this.f30447c.c(LocaleController.getString(R.string.AppUpdateBeta), z10, true);
                }
                if (this.f30445a.getTag() == null) {
                    this.f30445a.setVisibility(0);
                    this.f30445a.setTag(1);
                    if (z10) {
                        this.f30445a.animate().translationY(0.0f).setInterpolator(is.f27501g).setListener(null).setDuration(180L).start();
                        return;
                    } else {
                        this.f30445a.setTranslationY(0.0f);
                        return;
                    }
                }
                return;
            }
            FrameLayout frameLayout = this.f30445a;
            if (frameLayout != null && frameLayout.getTag() != null) {
                this.f30445a.setTag(null);
                if (z10) {
                    this.f30445a.animate().translationY(AndroidUtilities.dp(44.0f)).setInterpolator(is.f27501g).setListener(new vd0(this, 28)).setDuration(180L).start();
                    return;
                }
                this.f30445a.setTranslationY(AndroidUtilities.dp(44.0f));
                this.f30445a.setVisibility(4);
            }
        }
    }

    @Override
    public final void updateFileProgress(Object[] objArr) {
        if (this.f30445a != null && this.f30447c != null && ApplicationLoader.applicationLoaderInstance.isDownloadingUpdate()) {
            float downloadingUpdateProgress = ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress();
            this.f30446b.o(downloadingUpdateProgress, true);
            this.f30447c.setText(LocaleController.formatString(R.string.AppUpdateDownloading, Integer.valueOf((int) (downloadingUpdateProgress * 100.0f))));
            this.f30445a.invalidate();
        }
    }
}
