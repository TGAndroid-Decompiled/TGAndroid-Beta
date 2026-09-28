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
public final class a71 extends IUpdateLayout {
    public FrameLayout f22567a;
    public RadialProgress2 f22568b;
    public org.telegram.ui.Cells.x1 f22569c;
    public final Activity d;
    public final ViewGroup e;

    public a71(Activity activity, ViewGroup viewGroup) {
        super(activity, viewGroup);
        this.d = activity;
        this.e = viewGroup;
    }

    @Override
    public final void createUpdateUI(int i10) {
        ViewGroup viewGroup = this.e;
        if (viewGroup != null && this.f22567a == null) {
            Activity activity = this.d;
            FrameLayout frameLayout = new FrameLayout(activity);
            this.f22567a = frameLayout;
            frameLayout.setVisibility(4);
            this.f22567a.setTranslationY(AndroidUtilities.dp(44.0f));
            this.f22567a.setBackground(org.telegram.ui.ActionBar.h6.f0(1090519039, 2, -1));
            viewGroup.addView(this.f22567a, w7.y5.e(-1, 44, 83));
            this.f22567a.setOnClickListener(new ci.n4(this, i10, 14));
            org.telegram.ui.Cells.x1 x1Var = new org.telegram.ui.Cells.x1(this, activity);
            this.f22569c = x1Var;
            x1Var.setTextSize(AndroidUtilities.dp(15.0f));
            this.f22569c.setTypeface(AndroidUtilities.bold());
            this.f22569c.setTextColor(-1);
            this.f22569c.setGravity(17);
            this.f22567a.addView(this.f22569c, w7.y5.g());
            this.f22569c.c(LocaleController.getString(R.string.AppUpdateBeta), false, true);
            RadialProgress2 radialProgress2 = new RadialProgress2(this.f22569c, null);
            this.f22568b = radialProgress2;
            int i11 = org.telegram.ui.ActionBar.h6.Oh;
            radialProgress2.setColors(-1, -1, org.telegram.ui.ActionBar.h6.w0(null, i11, false), org.telegram.ui.ActionBar.h6.w0(null, i11, false));
            this.f22568b.q(0, 0, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f));
            this.f22568b.setCircleRadius(AndroidUtilities.dp(11.0f));
            this.f22568b.setAsMini();
        }
    }

    @Override
    public final void updateAppUpdateViews(int i10, boolean z10) {
        if (this.e != null) {
            if (ApplicationLoader.applicationLoaderInstance.getUpdate() != null) {
                createUpdateUI(i10);
                File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
                if (downloadedUpdateFile != null && downloadedUpdateFile.exists()) {
                    this.f22568b.setIcon(15, true, z10);
                    this.f22569c.c(LocaleController.getString(R.string.AppUpdateNow), z10, true);
                } else if (ApplicationLoader.applicationLoaderInstance.isDownloadingUpdate()) {
                    this.f22568b.setIcon(3, true, z10);
                    this.f22568b.o(ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress(), true);
                    this.f22569c.c(LocaleController.formatString(R.string.AppUpdateDownloading, Integer.valueOf((int) (ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress() * 100.0f))), z10, true);
                } else {
                    this.f22568b.setIcon(2, true, z10);
                    this.f22569c.c(LocaleController.getString(R.string.AppUpdateBeta), z10, true);
                }
                if (this.f22567a.getTag() == null) {
                    this.f22567a.setVisibility(0);
                    this.f22567a.setTag(1);
                    if (z10) {
                        this.f22567a.animate().translationY(0.0f).setInterpolator(sr.f28349g).setListener(null).setDuration(180L).start();
                        return;
                    } else {
                        this.f22567a.setTranslationY(0.0f);
                        return;
                    }
                }
                return;
            }
            FrameLayout frameLayout = this.f22567a;
            if (frameLayout != null && frameLayout.getTag() != null) {
                this.f22567a.setTag(null);
                if (z10) {
                    this.f22567a.animate().translationY(AndroidUtilities.dp(44.0f)).setInterpolator(sr.f28349g).setListener(new hd0(this, 28)).setDuration(180L).start();
                    return;
                }
                this.f22567a.setTranslationY(AndroidUtilities.dp(44.0f));
                this.f22567a.setVisibility(4);
            }
        }
    }

    @Override
    public final void updateFileProgress(Object[] objArr) {
        if (this.f22567a != null && this.f22569c != null && ApplicationLoader.applicationLoaderInstance.isDownloadingUpdate()) {
            float downloadingUpdateProgress = ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress();
            this.f22568b.o(downloadingUpdateProgress, true);
            this.f22569c.setText(LocaleController.formatString(R.string.AppUpdateDownloading, Integer.valueOf((int) (downloadingUpdateProgress * 100.0f))));
            this.f22567a.invalidate();
        }
    }
}
