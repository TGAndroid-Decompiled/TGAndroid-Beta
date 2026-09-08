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
public final class l61 extends IUpdateLayout {
    public FrameLayout f28095a;
    public RadialProgress2 f28096b;
    public org.telegram.ui.Cells.w1 f28097c;
    public final Activity d;
    public final ViewGroup f28098e;

    public l61(Activity activity, ViewGroup viewGroup) {
        super(activity, viewGroup);
        this.d = activity;
        this.f28098e = viewGroup;
    }

    @Override
    public final void createUpdateUI(int i10) {
        ViewGroup viewGroup = this.f28098e;
        if (viewGroup != null && this.f28095a == null) {
            Activity activity = this.d;
            FrameLayout frameLayout = new FrameLayout(activity);
            this.f28095a = frameLayout;
            frameLayout.setVisibility(4);
            this.f28095a.setTranslationY(AndroidUtilities.dp(44.0f));
            this.f28095a.setBackground(org.telegram.ui.ActionBar.j6.f0(1090519039, 2, -1));
            viewGroup.addView(this.f28095a, w7.x5.e(-1, 44, 83));
            this.f28095a.setOnClickListener(new di.o4(this, i10, 14));
            org.telegram.ui.Cells.w1 w1Var = new org.telegram.ui.Cells.w1(this, activity);
            this.f28097c = w1Var;
            w1Var.setTextSize(AndroidUtilities.dp(15.0f));
            this.f28097c.setTypeface(AndroidUtilities.bold());
            this.f28097c.setTextColor(-1);
            this.f28097c.setGravity(17);
            this.f28095a.addView(this.f28097c, w7.x5.g());
            this.f28097c.c(LocaleController.getString(R.string.AppUpdateBeta), false, true);
            RadialProgress2 radialProgress2 = new RadialProgress2(this.f28097c, null);
            this.f28096b = radialProgress2;
            int i11 = org.telegram.ui.ActionBar.j6.Oh;
            radialProgress2.setColors(-1, -1, org.telegram.ui.ActionBar.j6.w0(null, i11, false), org.telegram.ui.ActionBar.j6.w0(null, i11, false));
            this.f28096b.q(0, 0, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f));
            this.f28096b.setCircleRadius(AndroidUtilities.dp(11.0f));
            this.f28096b.setAsMini();
        }
    }

    @Override
    public final void updateAppUpdateViews(int i10, boolean z10) {
        if (this.f28098e != null) {
            if (ApplicationLoader.applicationLoaderInstance.getUpdate() != null) {
                createUpdateUI(i10);
                File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
                if (downloadedUpdateFile != null && downloadedUpdateFile.exists()) {
                    this.f28096b.setIcon(15, true, z10);
                    this.f28097c.c(LocaleController.getString(R.string.AppUpdateNow), z10, true);
                } else if (ApplicationLoader.applicationLoaderInstance.isDownloadingUpdate()) {
                    this.f28096b.setIcon(3, true, z10);
                    this.f28096b.o(ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress(), true);
                    this.f28097c.c(LocaleController.formatString(R.string.AppUpdateDownloading, Integer.valueOf((int) (ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress() * 100.0f))), z10, true);
                } else {
                    this.f28096b.setIcon(2, true, z10);
                    this.f28097c.c(LocaleController.getString(R.string.AppUpdateBeta), z10, true);
                }
                if (this.f28095a.getTag() == null) {
                    this.f28095a.setVisibility(0);
                    this.f28095a.setTag(1);
                    if (z10) {
                        this.f28095a.animate().translationY(0.0f).setInterpolator(pr.f29494g).setListener(null).setDuration(180L).start();
                        return;
                    } else {
                        this.f28095a.setTranslationY(0.0f);
                        return;
                    }
                }
                return;
            }
            FrameLayout frameLayout = this.f28095a;
            if (frameLayout != null && frameLayout.getTag() != null) {
                this.f28095a.setTag(null);
                if (z10) {
                    this.f28095a.animate().translationY(AndroidUtilities.dp(44.0f)).setInterpolator(pr.f29494g).setListener(new k61(this, 0)).setDuration(180L).start();
                    return;
                }
                this.f28095a.setTranslationY(AndroidUtilities.dp(44.0f));
                this.f28095a.setVisibility(4);
            }
        }
    }

    @Override
    public final void updateFileProgress(Object[] objArr) {
        if (this.f28095a != null && this.f28097c != null && ApplicationLoader.applicationLoaderInstance.isDownloadingUpdate()) {
            float downloadingUpdateProgress = ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress();
            this.f28096b.o(downloadingUpdateProgress, true);
            this.f28097c.setText(LocaleController.formatString(R.string.AppUpdateDownloading, Integer.valueOf((int) (downloadingUpdateProgress * 100.0f))));
            this.f28095a.invalidate();
        }
    }
}
