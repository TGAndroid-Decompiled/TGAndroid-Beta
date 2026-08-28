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
public final class p51 extends IUpdateLayout {
    public FrameLayout f31549a;
    public RadialProgress2 f31550b;
    public org.telegram.ui.Cells.w1 f31551c;
    public final Activity d;
    public final ViewGroup f31552e;

    public p51(Activity activity, ViewGroup viewGroup) {
        super(activity, viewGroup);
        this.d = activity;
        this.f31552e = viewGroup;
    }

    @Override
    public final void createUpdateUI(int i9) {
        ViewGroup viewGroup = this.f31552e;
        if (viewGroup != null && this.f31549a == null) {
            Activity activity = this.d;
            FrameLayout frameLayout = new FrameLayout(activity);
            this.f31549a = frameLayout;
            frameLayout.setVisibility(4);
            this.f31549a.setTranslationY(AndroidUtilities.dp(44.0f));
            this.f31549a.setBackground(org.telegram.ui.ActionBar.f6.f0(1090519039, 2, -1));
            viewGroup.addView(this.f31549a, g7.e6.e(-1, 44, 83));
            this.f31549a.setOnClickListener(new gh.z0(this, i9, 13));
            org.telegram.ui.Cells.w1 w1Var = new org.telegram.ui.Cells.w1(this, activity);
            this.f31551c = w1Var;
            w1Var.setTextSize(AndroidUtilities.dp(15.0f));
            this.f31551c.setTypeface(AndroidUtilities.bold());
            this.f31551c.setTextColor(-1);
            this.f31551c.setGravity(17);
            this.f31549a.addView(this.f31551c, g7.e6.g());
            this.f31551c.c(LocaleController.getString(R.string.AppUpdateBeta), false, true);
            RadialProgress2 radialProgress2 = new RadialProgress2(this.f31551c, null);
            this.f31550b = radialProgress2;
            int i10 = org.telegram.ui.ActionBar.f6.Oh;
            radialProgress2.setColors(-1, -1, org.telegram.ui.ActionBar.f6.w0(null, i10, false), org.telegram.ui.ActionBar.f6.w0(null, i10, false));
            this.f31550b.q(0, 0, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f));
            this.f31550b.setCircleRadius(AndroidUtilities.dp(11.0f));
            this.f31550b.setAsMini();
        }
    }

    @Override
    public final void updateAppUpdateViews(int i9, boolean z10) {
        if (this.f31552e != null) {
            if (ApplicationLoader.applicationLoaderInstance.getUpdate() != null) {
                createUpdateUI(i9);
                File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
                if (downloadedUpdateFile != null && downloadedUpdateFile.exists()) {
                    this.f31550b.setIcon(15, true, z10);
                    this.f31551c.c(LocaleController.getString(R.string.AppUpdateNow), z10, true);
                } else if (ApplicationLoader.applicationLoaderInstance.isDownloadingUpdate()) {
                    this.f31550b.setIcon(3, true, z10);
                    this.f31550b.o(ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress(), true);
                    this.f31551c.c(LocaleController.formatString(R.string.AppUpdateDownloading, Integer.valueOf((int) (ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress() * 100.0f))), z10, true);
                } else {
                    this.f31550b.setIcon(2, true, z10);
                    this.f31551c.c(LocaleController.getString(R.string.AppUpdateBeta), z10, true);
                }
                if (this.f31549a.getTag() == null) {
                    this.f31549a.setVisibility(0);
                    this.f31549a.setTag(1);
                    if (z10) {
                        this.f31549a.animate().translationY(0.0f).setInterpolator(gr.f28845g).setListener(null).setDuration(180L).start();
                        return;
                    } else {
                        this.f31549a.setTranslationY(0.0f);
                        return;
                    }
                }
                return;
            }
            FrameLayout frameLayout = this.f31549a;
            if (frameLayout != null && frameLayout.getTag() != null) {
                this.f31549a.setTag(null);
                if (z10) {
                    this.f31549a.animate().translationY(AndroidUtilities.dp(44.0f)).setInterpolator(gr.f28845g).setListener(new y11(this, 3)).setDuration(180L).start();
                    return;
                }
                this.f31549a.setTranslationY(AndroidUtilities.dp(44.0f));
                this.f31549a.setVisibility(4);
            }
        }
    }

    @Override
    public final void updateFileProgress(Object[] objArr) {
        if (this.f31549a != null && this.f31551c != null && ApplicationLoader.applicationLoaderInstance.isDownloadingUpdate()) {
            float downloadingUpdateProgress = ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress();
            this.f31550b.o(downloadingUpdateProgress, true);
            this.f31551c.setText(LocaleController.formatString(R.string.AppUpdateDownloading, Integer.valueOf((int) (downloadingUpdateProgress * 100.0f))));
            this.f31549a.invalidate();
        }
    }
}
