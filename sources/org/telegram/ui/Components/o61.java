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
public final class o61 extends IUpdateLayout {
    public FrameLayout f29674a;
    public RadialProgress2 f29675b;
    public org.telegram.ui.Cells.w1 f29676c;
    public final Activity d;
    public final ViewGroup f29677e;

    public o61(Activity activity, ViewGroup viewGroup) {
        super(activity, viewGroup);
        this.d = activity;
        this.f29677e = viewGroup;
    }

    @Override
    public final void createUpdateUI(int i10) {
        ViewGroup viewGroup = this.f29677e;
        if (viewGroup != null && this.f29674a == null) {
            Activity activity = this.d;
            FrameLayout frameLayout = new FrameLayout(activity);
            this.f29674a = frameLayout;
            frameLayout.setVisibility(4);
            this.f29674a.setTranslationY(AndroidUtilities.dp(44.0f));
            this.f29674a.setBackground(org.telegram.ui.ActionBar.k6.f0(1090519039, 2, -1));
            viewGroup.addView(this.f29674a, k7.c6.e(-1, 44, 83));
            this.f29674a.setOnClickListener(new mh.x0(this, i10, 11));
            org.telegram.ui.Cells.w1 w1Var = new org.telegram.ui.Cells.w1(this, activity);
            this.f29676c = w1Var;
            w1Var.setTextSize(AndroidUtilities.dp(15.0f));
            this.f29676c.setTypeface(AndroidUtilities.bold());
            this.f29676c.setTextColor(-1);
            this.f29676c.setGravity(17);
            this.f29674a.addView(this.f29676c, k7.c6.g());
            this.f29676c.c(LocaleController.getString(R.string.AppUpdateBeta), false, true);
            RadialProgress2 radialProgress2 = new RadialProgress2(this.f29676c, null);
            this.f29675b = radialProgress2;
            int i11 = org.telegram.ui.ActionBar.k6.Oh;
            radialProgress2.setColors(-1, -1, org.telegram.ui.ActionBar.k6.w0(null, i11, false), org.telegram.ui.ActionBar.k6.w0(null, i11, false));
            this.f29675b.q(0, 0, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f));
            this.f29675b.setCircleRadius(AndroidUtilities.dp(11.0f));
            this.f29675b.setAsMini();
        }
    }

    @Override
    public final void updateAppUpdateViews(int i10, boolean z4) {
        if (this.f29677e != null) {
            if (ApplicationLoader.applicationLoaderInstance.getUpdate() != null) {
                createUpdateUI(i10);
                File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
                if (downloadedUpdateFile != null && downloadedUpdateFile.exists()) {
                    this.f29675b.setIcon(15, true, z4);
                    this.f29676c.c(LocaleController.getString(R.string.AppUpdateNow), z4, true);
                } else if (ApplicationLoader.applicationLoaderInstance.isDownloadingUpdate()) {
                    this.f29675b.setIcon(3, true, z4);
                    this.f29675b.o(ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress(), true);
                    this.f29676c.c(LocaleController.formatString(R.string.AppUpdateDownloading, Integer.valueOf((int) (ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress() * 100.0f))), z4, true);
                } else {
                    this.f29675b.setIcon(2, true, z4);
                    this.f29676c.c(LocaleController.getString(R.string.AppUpdateBeta), z4, true);
                }
                if (this.f29674a.getTag() == null) {
                    this.f29674a.setVisibility(0);
                    this.f29674a.setTag(1);
                    if (z4) {
                        this.f29674a.animate().translationY(0.0f).setInterpolator(pr.f30169g).setListener(null).setDuration(180L).start();
                        return;
                    } else {
                        this.f29674a.setTranslationY(0.0f);
                        return;
                    }
                }
                return;
            }
            FrameLayout frameLayout = this.f29674a;
            if (frameLayout != null && frameLayout.getTag() != null) {
                this.f29674a.setTag(null);
                if (z4) {
                    this.f29674a.animate().translationY(AndroidUtilities.dp(44.0f)).setInterpolator(pr.f30169g).setListener(new pd0(this, 26)).setDuration(180L).start();
                    return;
                }
                this.f29674a.setTranslationY(AndroidUtilities.dp(44.0f));
                this.f29674a.setVisibility(4);
            }
        }
    }

    @Override
    public final void updateFileProgress(Object[] objArr) {
        if (this.f29674a != null && this.f29676c != null && ApplicationLoader.applicationLoaderInstance.isDownloadingUpdate()) {
            float downloadingUpdateProgress = ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress();
            this.f29675b.o(downloadingUpdateProgress, true);
            this.f29676c.setText(LocaleController.formatString(R.string.AppUpdateDownloading, Integer.valueOf((int) (downloadingUpdateProgress * 100.0f))));
            this.f29674a.invalidate();
        }
    }
}
