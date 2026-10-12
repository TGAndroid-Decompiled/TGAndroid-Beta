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
public final class v71 extends IUpdateLayout {
    public FrameLayout f31450a;
    public RadialProgress2 f31451b;
    public org.telegram.ui.Cells.x1 f31452c;
    public final Activity d;
    public final ViewGroup f31453e;

    public v71(Activity activity, ViewGroup viewGroup) {
        super(activity, viewGroup);
        this.d = activity;
        this.f31453e = viewGroup;
    }

    @Override
    public final void createUpdateUI(int i10) {
        ViewGroup viewGroup = this.f31453e;
        if (viewGroup != null && this.f31450a == null) {
            Activity activity = this.d;
            FrameLayout frameLayout = new FrameLayout(activity);
            this.f31450a = frameLayout;
            frameLayout.setVisibility(4);
            this.f31450a.setTranslationY(AndroidUtilities.dp(44.0f));
            this.f31450a.setBackground(org.telegram.ui.ActionBar.h6.g0(1090519039, 2, -1));
            viewGroup.addView(this.f31450a, w7.w5.e(-1, 44, 83));
            this.f31450a.setOnClickListener(new ci.m4(this, i10, 14));
            org.telegram.ui.Cells.x1 x1Var = new org.telegram.ui.Cells.x1(this, activity);
            this.f31452c = x1Var;
            x1Var.setTextSize(AndroidUtilities.dp(15.0f));
            this.f31452c.setTypeface(AndroidUtilities.bold());
            this.f31452c.setTextColor(-1);
            this.f31452c.setGravity(17);
            this.f31450a.addView(this.f31452c, w7.w5.g());
            this.f31452c.c(LocaleController.getString(R.string.AppUpdateBeta), false, true);
            RadialProgress2 radialProgress2 = new RadialProgress2(this.f31452c, null);
            this.f31451b = radialProgress2;
            int i11 = org.telegram.ui.ActionBar.h6.Oh;
            radialProgress2.setColors(-1, -1, org.telegram.ui.ActionBar.h6.x0(null, i11, false), org.telegram.ui.ActionBar.h6.x0(null, i11, false));
            this.f31451b.q(0, 0, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f));
            this.f31451b.setCircleRadius(AndroidUtilities.dp(11.0f));
            this.f31451b.setAsMini();
        }
    }

    @Override
    public final void updateAppUpdateViews(int i10, boolean z10) {
        if (this.f31453e != null) {
            if (ApplicationLoader.applicationLoaderInstance.getUpdate() != null) {
                createUpdateUI(i10);
                File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
                if (downloadedUpdateFile != null && downloadedUpdateFile.exists()) {
                    this.f31451b.setIcon(15, true, z10);
                    this.f31452c.c(LocaleController.getString(R.string.AppUpdateNow), z10, true);
                } else if (ApplicationLoader.applicationLoaderInstance.isDownloadingUpdate()) {
                    this.f31451b.setIcon(3, true, z10);
                    this.f31451b.o(ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress(), true);
                    this.f31452c.c(LocaleController.formatString(R.string.AppUpdateDownloading, Integer.valueOf((int) (ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress() * 100.0f))), z10, true);
                } else {
                    this.f31451b.setIcon(2, true, z10);
                    this.f31452c.c(LocaleController.getString(R.string.AppUpdateBeta), z10, true);
                }
                if (this.f31450a.getTag() == null) {
                    this.f31450a.setVisibility(0);
                    this.f31450a.setTag(1);
                    if (z10) {
                        this.f31450a.animate().translationY(0.0f).setInterpolator(js.f27635g).setListener(null).setDuration(180L).start();
                        return;
                    } else {
                        this.f31450a.setTranslationY(0.0f);
                        return;
                    }
                }
                return;
            }
            FrameLayout frameLayout = this.f31450a;
            if (frameLayout != null && frameLayout.getTag() != null) {
                this.f31450a.setTag(null);
                if (z10) {
                    this.f31450a.animate().translationY(AndroidUtilities.dp(44.0f)).setInterpolator(js.f27635g).setListener(new zd0(this, 28)).setDuration(180L).start();
                    return;
                }
                this.f31450a.setTranslationY(AndroidUtilities.dp(44.0f));
                this.f31450a.setVisibility(4);
            }
        }
    }

    @Override
    public final void updateFileProgress(Object[] objArr) {
        if (this.f31450a != null && this.f31452c != null && ApplicationLoader.applicationLoaderInstance.isDownloadingUpdate()) {
            float downloadingUpdateProgress = ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress();
            this.f31451b.o(downloadingUpdateProgress, true);
            this.f31452c.setText(LocaleController.formatString(R.string.AppUpdateDownloading, Integer.valueOf((int) (downloadingUpdateProgress * 100.0f))));
            this.f31450a.invalidate();
        }
    }
}
