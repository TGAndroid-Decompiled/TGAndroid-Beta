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
public final class i71 extends IUpdateLayout {
    public FrameLayout f27152a;
    public RadialProgress2 f27153b;
    public org.telegram.ui.Cells.x1 f27154c;
    public final Activity d;
    public final ViewGroup e;

    public i71(Activity activity, ViewGroup viewGroup) {
        super(activity, viewGroup);
        this.d = activity;
        this.e = viewGroup;
    }

    @Override
    public final void createUpdateUI(int i10) {
        ViewGroup viewGroup = this.e;
        if (viewGroup != null && this.f27152a == null) {
            Activity activity = this.d;
            FrameLayout frameLayout = new FrameLayout(activity);
            this.f27152a = frameLayout;
            frameLayout.setVisibility(4);
            this.f27152a.setTranslationY(AndroidUtilities.dp(44.0f));
            this.f27152a.setBackground(org.telegram.ui.ActionBar.h6.g0(1090519039, 2, -1));
            viewGroup.addView(this.f27152a, w7.z5.e(-1, 44, 83));
            this.f27152a.setOnClickListener(new ai.n1(this, i10, 16));
            org.telegram.ui.Cells.x1 x1Var = new org.telegram.ui.Cells.x1(this, activity);
            this.f27154c = x1Var;
            x1Var.setTextSize(AndroidUtilities.dp(15.0f));
            this.f27154c.setTypeface(AndroidUtilities.bold());
            this.f27154c.setTextColor(-1);
            this.f27154c.setGravity(17);
            this.f27152a.addView(this.f27154c, w7.z5.g());
            this.f27154c.c(LocaleController.getString(R.string.AppUpdateBeta), false, true);
            RadialProgress2 radialProgress2 = new RadialProgress2(this.f27154c, null);
            this.f27153b = radialProgress2;
            int i11 = org.telegram.ui.ActionBar.h6.Oh;
            radialProgress2.setColors(-1, -1, org.telegram.ui.ActionBar.h6.x0(null, i11, false), org.telegram.ui.ActionBar.h6.x0(null, i11, false));
            this.f27153b.q(0, 0, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f));
            this.f27153b.setCircleRadius(AndroidUtilities.dp(11.0f));
            this.f27153b.setAsMini();
        }
    }

    @Override
    public final void updateAppUpdateViews(int i10, boolean z10) {
        if (this.e != null) {
            if (ApplicationLoader.applicationLoaderInstance.getUpdate() != null) {
                createUpdateUI(i10);
                File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
                if (downloadedUpdateFile != null && downloadedUpdateFile.exists()) {
                    this.f27153b.setIcon(15, true, z10);
                    this.f27154c.c(LocaleController.getString(R.string.AppUpdateNow), z10, true);
                } else if (ApplicationLoader.applicationLoaderInstance.isDownloadingUpdate()) {
                    this.f27153b.setIcon(3, true, z10);
                    this.f27153b.o(ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress(), true);
                    this.f27154c.c(LocaleController.formatString(R.string.AppUpdateDownloading, Integer.valueOf((int) (ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress() * 100.0f))), z10, true);
                } else {
                    this.f27153b.setIcon(2, true, z10);
                    this.f27154c.c(LocaleController.getString(R.string.AppUpdateBeta), z10, true);
                }
                if (this.f27152a.getTag() == null) {
                    this.f27152a.setVisibility(0);
                    this.f27152a.setTag(1);
                    if (z10) {
                        this.f27152a.animate().translationY(0.0f).setInterpolator(bs.f25026g).setListener(null).setDuration(180L).start();
                        return;
                    } else {
                        this.f27152a.setTranslationY(0.0f);
                        return;
                    }
                }
                return;
            }
            FrameLayout frameLayout = this.f27152a;
            if (frameLayout != null && frameLayout.getTag() != null) {
                this.f27152a.setTag(null);
                if (z10) {
                    this.f27152a.animate().translationY(AndroidUtilities.dp(44.0f)).setInterpolator(bs.f25026g).setListener(new p31(this, 3)).setDuration(180L).start();
                    return;
                }
                this.f27152a.setTranslationY(AndroidUtilities.dp(44.0f));
                this.f27152a.setVisibility(4);
            }
        }
    }

    @Override
    public final void updateFileProgress(Object[] objArr) {
        if (this.f27152a != null && this.f27154c != null && ApplicationLoader.applicationLoaderInstance.isDownloadingUpdate()) {
            float downloadingUpdateProgress = ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress();
            this.f27153b.o(downloadingUpdateProgress, true);
            this.f27154c.setText(LocaleController.formatString(R.string.AppUpdateDownloading, Integer.valueOf((int) (downloadingUpdateProgress * 100.0f))));
            this.f27152a.invalidate();
        }
    }
}
