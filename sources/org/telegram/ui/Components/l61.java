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
    public FrameLayout f28069a;
    public RadialProgress2 f28070b;
    public org.telegram.ui.Cells.w1 f28071c;
    public final Activity d;
    public final ViewGroup f28072e;

    public l61(Activity activity, ViewGroup viewGroup) {
        super(activity, viewGroup);
        this.d = activity;
        this.f28072e = viewGroup;
    }

    @Override
    public final void createUpdateUI(int i10) {
        ViewGroup viewGroup = this.f28072e;
        if (viewGroup != null && this.f28069a == null) {
            Activity activity = this.d;
            FrameLayout frameLayout = new FrameLayout(activity);
            this.f28069a = frameLayout;
            frameLayout.setVisibility(4);
            this.f28069a.setTranslationY(AndroidUtilities.dp(44.0f));
            this.f28069a.setBackground(org.telegram.ui.ActionBar.j6.f0(1090519039, 2, -1));
            viewGroup.addView(this.f28069a, w7.x5.e(-1, 44, 83));
            this.f28069a.setOnClickListener(new di.o4(this, i10, 14));
            org.telegram.ui.Cells.w1 w1Var = new org.telegram.ui.Cells.w1(this, activity);
            this.f28071c = w1Var;
            w1Var.setTextSize(AndroidUtilities.dp(15.0f));
            this.f28071c.setTypeface(AndroidUtilities.bold());
            this.f28071c.setTextColor(-1);
            this.f28071c.setGravity(17);
            this.f28069a.addView(this.f28071c, w7.x5.g());
            this.f28071c.c(LocaleController.getString(R.string.AppUpdateBeta), false, true);
            RadialProgress2 radialProgress2 = new RadialProgress2(this.f28071c, null);
            this.f28070b = radialProgress2;
            int i11 = org.telegram.ui.ActionBar.j6.Oh;
            radialProgress2.setColors(-1, -1, org.telegram.ui.ActionBar.j6.w0(null, i11, false), org.telegram.ui.ActionBar.j6.w0(null, i11, false));
            this.f28070b.q(0, 0, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f));
            this.f28070b.setCircleRadius(AndroidUtilities.dp(11.0f));
            this.f28070b.setAsMini();
        }
    }

    @Override
    public final void updateAppUpdateViews(int i10, boolean z10) {
        if (this.f28072e != null) {
            if (ApplicationLoader.applicationLoaderInstance.getUpdate() != null) {
                createUpdateUI(i10);
                File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
                if (downloadedUpdateFile != null && downloadedUpdateFile.exists()) {
                    this.f28070b.setIcon(15, true, z10);
                    this.f28071c.c(LocaleController.getString(R.string.AppUpdateNow), z10, true);
                } else if (ApplicationLoader.applicationLoaderInstance.isDownloadingUpdate()) {
                    this.f28070b.setIcon(3, true, z10);
                    this.f28070b.o(ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress(), true);
                    this.f28071c.c(LocaleController.formatString(R.string.AppUpdateDownloading, Integer.valueOf((int) (ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress() * 100.0f))), z10, true);
                } else {
                    this.f28070b.setIcon(2, true, z10);
                    this.f28071c.c(LocaleController.getString(R.string.AppUpdateBeta), z10, true);
                }
                if (this.f28069a.getTag() == null) {
                    this.f28069a.setVisibility(0);
                    this.f28069a.setTag(1);
                    if (z10) {
                        this.f28069a.animate().translationY(0.0f).setInterpolator(pr.f29468g).setListener(null).setDuration(180L).start();
                        return;
                    } else {
                        this.f28069a.setTranslationY(0.0f);
                        return;
                    }
                }
                return;
            }
            FrameLayout frameLayout = this.f28069a;
            if (frameLayout != null && frameLayout.getTag() != null) {
                this.f28069a.setTag(null);
                if (z10) {
                    this.f28069a.animate().translationY(AndroidUtilities.dp(44.0f)).setInterpolator(pr.f29468g).setListener(new k61(this, 0)).setDuration(180L).start();
                    return;
                }
                this.f28069a.setTranslationY(AndroidUtilities.dp(44.0f));
                this.f28069a.setVisibility(4);
            }
        }
    }

    @Override
    public final void updateFileProgress(Object[] objArr) {
        if (this.f28069a != null && this.f28071c != null && ApplicationLoader.applicationLoaderInstance.isDownloadingUpdate()) {
            float downloadingUpdateProgress = ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress();
            this.f28070b.o(downloadingUpdateProgress, true);
            this.f28071c.setText(LocaleController.formatString(R.string.AppUpdateDownloading, Integer.valueOf((int) (downloadingUpdateProgress * 100.0f))));
            this.f28069a.invalidate();
        }
    }
}
