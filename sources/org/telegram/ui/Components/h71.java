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
public final class h71 extends IUpdateLayout {
    public FrameLayout f26796a;
    public RadialProgress2 f26797b;
    public org.telegram.ui.Cells.x1 f26798c;
    public final Activity d;
    public final ViewGroup e;

    public h71(Activity activity, ViewGroup viewGroup) {
        super(activity, viewGroup);
        this.d = activity;
        this.e = viewGroup;
    }

    @Override
    public final void createUpdateUI(int i10) {
        ViewGroup viewGroup = this.e;
        if (viewGroup != null && this.f26796a == null) {
            Activity activity = this.d;
            FrameLayout frameLayout = new FrameLayout(activity);
            this.f26796a = frameLayout;
            frameLayout.setVisibility(4);
            this.f26796a.setTranslationY(AndroidUtilities.dp(44.0f));
            this.f26796a.setBackground(org.telegram.ui.ActionBar.h6.g0(1090519039, 2, -1));
            viewGroup.addView(this.f26796a, w7.z5.e(-1, 44, 83));
            this.f26796a.setOnClickListener(new ai.n1(this, i10, 16));
            org.telegram.ui.Cells.x1 x1Var = new org.telegram.ui.Cells.x1(this, activity);
            this.f26798c = x1Var;
            x1Var.setTextSize(AndroidUtilities.dp(15.0f));
            this.f26798c.setTypeface(AndroidUtilities.bold());
            this.f26798c.setTextColor(-1);
            this.f26798c.setGravity(17);
            this.f26796a.addView(this.f26798c, w7.z5.g());
            this.f26798c.c(LocaleController.getString(R.string.AppUpdateBeta), false, true);
            RadialProgress2 radialProgress2 = new RadialProgress2(this.f26798c, null);
            this.f26797b = radialProgress2;
            int i11 = org.telegram.ui.ActionBar.h6.Oh;
            radialProgress2.setColors(-1, -1, org.telegram.ui.ActionBar.h6.x0(null, i11, false), org.telegram.ui.ActionBar.h6.x0(null, i11, false));
            this.f26797b.q(0, 0, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f));
            this.f26797b.setCircleRadius(AndroidUtilities.dp(11.0f));
            this.f26797b.setAsMini();
        }
    }

    @Override
    public final void updateAppUpdateViews(int i10, boolean z10) {
        if (this.e != null) {
            if (ApplicationLoader.applicationLoaderInstance.getUpdate() != null) {
                createUpdateUI(i10);
                File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
                if (downloadedUpdateFile != null && downloadedUpdateFile.exists()) {
                    this.f26797b.setIcon(15, true, z10);
                    this.f26798c.c(LocaleController.getString(R.string.AppUpdateNow), z10, true);
                } else if (ApplicationLoader.applicationLoaderInstance.isDownloadingUpdate()) {
                    this.f26797b.setIcon(3, true, z10);
                    this.f26797b.o(ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress(), true);
                    this.f26798c.c(LocaleController.formatString(R.string.AppUpdateDownloading, Integer.valueOf((int) (ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress() * 100.0f))), z10, true);
                } else {
                    this.f26797b.setIcon(2, true, z10);
                    this.f26798c.c(LocaleController.getString(R.string.AppUpdateBeta), z10, true);
                }
                if (this.f26796a.getTag() == null) {
                    this.f26796a.setVisibility(0);
                    this.f26796a.setTag(1);
                    if (z10) {
                        this.f26796a.animate().translationY(0.0f).setInterpolator(bs.f25015g).setListener(null).setDuration(180L).start();
                        return;
                    } else {
                        this.f26796a.setTranslationY(0.0f);
                        return;
                    }
                }
                return;
            }
            FrameLayout frameLayout = this.f26796a;
            if (frameLayout != null && frameLayout.getTag() != null) {
                this.f26796a.setTag(null);
                if (z10) {
                    this.f26796a.animate().translationY(AndroidUtilities.dp(44.0f)).setInterpolator(bs.f25015g).setListener(new o31(this, 3)).setDuration(180L).start();
                    return;
                }
                this.f26796a.setTranslationY(AndroidUtilities.dp(44.0f));
                this.f26796a.setVisibility(4);
            }
        }
    }

    @Override
    public final void updateFileProgress(Object[] objArr) {
        if (this.f26796a != null && this.f26798c != null && ApplicationLoader.applicationLoaderInstance.isDownloadingUpdate()) {
            float downloadingUpdateProgress = ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress();
            this.f26797b.o(downloadingUpdateProgress, true);
            this.f26798c.setText(LocaleController.formatString(R.string.AppUpdateDownloading, Integer.valueOf((int) (downloadingUpdateProgress * 100.0f))));
            this.f26796a.invalidate();
        }
    }
}
