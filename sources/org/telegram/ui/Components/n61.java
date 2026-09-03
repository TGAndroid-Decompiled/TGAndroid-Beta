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
public final class n61 extends IUpdateLayout {
    public FrameLayout f27201a;
    public RadialProgress2 f27202b;
    public org.telegram.ui.Cells.v1 f27203c;
    public final Activity d;
    public final ViewGroup e;

    public n61(Activity activity, ViewGroup viewGroup) {
        super(activity, viewGroup);
        this.d = activity;
        this.e = viewGroup;
    }

    @Override
    public final void createUpdateUI(int i10) {
        ViewGroup viewGroup = this.e;
        if (viewGroup != null && this.f27201a == null) {
            Activity activity = this.d;
            FrameLayout frameLayout = new FrameLayout(activity);
            this.f27201a = frameLayout;
            frameLayout.setVisibility(4);
            this.f27201a.setTranslationY(AndroidUtilities.dp(44.0f));
            this.f27201a.setBackground(org.telegram.ui.ActionBar.j6.f0(1090519039, 2, -1));
            viewGroup.addView(this.f27201a, k7.b6.e(-1, 44, 83));
            this.f27201a.setOnClickListener(new lh.y0(this, i10, 11));
            org.telegram.ui.Cells.v1 v1Var = new org.telegram.ui.Cells.v1(this, activity);
            this.f27203c = v1Var;
            v1Var.setTextSize(AndroidUtilities.dp(15.0f));
            this.f27203c.setTypeface(AndroidUtilities.bold());
            this.f27203c.setTextColor(-1);
            this.f27203c.setGravity(17);
            this.f27201a.addView(this.f27203c, k7.b6.g());
            this.f27203c.c(LocaleController.getString(R.string.AppUpdateBeta), false, true);
            RadialProgress2 radialProgress2 = new RadialProgress2(this.f27203c, null);
            this.f27202b = radialProgress2;
            int i11 = org.telegram.ui.ActionBar.j6.Oh;
            radialProgress2.setColors(-1, -1, org.telegram.ui.ActionBar.j6.w0(null, i11, false), org.telegram.ui.ActionBar.j6.w0(null, i11, false));
            this.f27202b.q(0, 0, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f));
            this.f27202b.setCircleRadius(AndroidUtilities.dp(11.0f));
            this.f27202b.setAsMini();
        }
    }

    @Override
    public final void updateAppUpdateViews(int i10, boolean z4) {
        if (this.e != null) {
            if (ApplicationLoader.applicationLoaderInstance.getUpdate() != null) {
                createUpdateUI(i10);
                File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
                if (downloadedUpdateFile != null && downloadedUpdateFile.exists()) {
                    this.f27202b.setIcon(15, true, z4);
                    this.f27203c.c(LocaleController.getString(R.string.AppUpdateNow), z4, true);
                } else if (ApplicationLoader.applicationLoaderInstance.isDownloadingUpdate()) {
                    this.f27202b.setIcon(3, true, z4);
                    this.f27202b.o(ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress(), true);
                    this.f27203c.c(LocaleController.formatString(R.string.AppUpdateDownloading, Integer.valueOf((int) (ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress() * 100.0f))), z4, true);
                } else {
                    this.f27202b.setIcon(2, true, z4);
                    this.f27203c.c(LocaleController.getString(R.string.AppUpdateBeta), z4, true);
                }
                if (this.f27201a.getTag() == null) {
                    this.f27201a.setVisibility(0);
                    this.f27201a.setTag(1);
                    if (z4) {
                        this.f27201a.animate().translationY(0.0f).setInterpolator(mr.f27123g).setListener(null).setDuration(180L).start();
                        return;
                    } else {
                        this.f27201a.setTranslationY(0.0f);
                        return;
                    }
                }
                return;
            }
            FrameLayout frameLayout = this.f27201a;
            if (frameLayout != null && frameLayout.getTag() != null) {
                this.f27201a.setTag(null);
                if (z4) {
                    this.f27201a.animate().translationY(AndroidUtilities.dp(44.0f)).setInterpolator(mr.f27123g).setListener(new od0(this, 26)).setDuration(180L).start();
                    return;
                }
                this.f27201a.setTranslationY(AndroidUtilities.dp(44.0f));
                this.f27201a.setVisibility(4);
            }
        }
    }

    @Override
    public final void updateFileProgress(Object[] objArr) {
        if (this.f27201a != null && this.f27203c != null && ApplicationLoader.applicationLoaderInstance.isDownloadingUpdate()) {
            float downloadingUpdateProgress = ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress();
            this.f27202b.o(downloadingUpdateProgress, true);
            this.f27203c.setText(LocaleController.formatString(R.string.AppUpdateDownloading, Integer.valueOf((int) (downloadingUpdateProgress * 100.0f))));
            this.f27201a.invalidate();
        }
    }
}
