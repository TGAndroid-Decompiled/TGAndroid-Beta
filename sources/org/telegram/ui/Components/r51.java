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

public final class r51 extends IUpdateLayout {

    public FrameLayout f32088a;

    public RadialProgress2 f32089b;

    public org.telegram.ui.Cells.v1 f32090c;
    public final Activity d;

    public final ViewGroup f32091e;

    public r51(Activity activity, ViewGroup viewGroup) {
        super(activity, viewGroup);
        this.d = activity;
        this.f32091e = viewGroup;
    }

    @Override
    public final void createUpdateUI(int i10) {
        ViewGroup viewGroup = this.f32091e;
        if (viewGroup == null || this.f32088a != null) {
            return;
        }
        Activity activity = this.d;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f32088a = frameLayout;
        frameLayout.setVisibility(4);
        this.f32088a.setTranslationY(AndroidUtilities.dp(44.0f));
        this.f32088a.setBackground(org.telegram.ui.ActionBar.g6.f0(1090519039, 2, -1));
        viewGroup.addView(this.f32088a, h7.z5.e(-1, 44, 83));
        this.f32088a.setOnClickListener(new hh.z0(this, i10, 13));
        org.telegram.ui.Cells.v1 v1Var = new org.telegram.ui.Cells.v1(this, activity);
        this.f32090c = v1Var;
        v1Var.setTextSize(AndroidUtilities.dp(15.0f));
        this.f32090c.setTypeface(AndroidUtilities.bold());
        this.f32090c.setTextColor(-1);
        this.f32090c.setGravity(17);
        this.f32088a.addView(this.f32090c, h7.z5.g());
        this.f32090c.c(LocaleController.getString(R.string.AppUpdateBeta), false, true);
        RadialProgress2 radialProgress2 = new RadialProgress2(this.f32090c, null);
        this.f32089b = radialProgress2;
        int i11 = org.telegram.ui.ActionBar.g6.Oh;
        radialProgress2.setColors(-1, -1, org.telegram.ui.ActionBar.g6.w0(null, i11, false), org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        this.f32089b.q(0, 0, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f));
        this.f32089b.setCircleRadius(AndroidUtilities.dp(11.0f));
        this.f32089b.setAsMini();
    }

    @Override
    public final void updateAppUpdateViews(int i10, boolean z10) {
        if (this.f32091e == null) {
            return;
        }
        if (ApplicationLoader.applicationLoaderInstance.getUpdate() == null) {
            FrameLayout frameLayout = this.f32088a;
            if (frameLayout == null || frameLayout.getTag() == null) {
                return;
            }
            this.f32088a.setTag(null);
            if (z10) {
                this.f32088a.animate().translationY(AndroidUtilities.dp(44.0f)).setInterpolator(er.f28123g).setListener(new f11(this, 5)).setDuration(180L).start();
                return;
            } else {
                this.f32088a.setTranslationY(AndroidUtilities.dp(44.0f));
                this.f32088a.setVisibility(4);
                return;
            }
        }
        createUpdateUI(i10);
        File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
        if (downloadedUpdateFile != null && downloadedUpdateFile.exists()) {
            this.f32089b.setIcon(15, true, z10);
            this.f32090c.c(LocaleController.getString(R.string.AppUpdateNow), z10, true);
        } else if (ApplicationLoader.applicationLoaderInstance.isDownloadingUpdate()) {
            this.f32089b.setIcon(3, true, z10);
            this.f32089b.o(ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress(), true);
            this.f32090c.c(LocaleController.formatString(R.string.AppUpdateDownloading, Integer.valueOf((int) (ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress() * 100.0f))), z10, true);
        } else {
            this.f32089b.setIcon(2, true, z10);
            this.f32090c.c(LocaleController.getString(R.string.AppUpdateBeta), z10, true);
        }
        if (this.f32088a.getTag() != null) {
            return;
        }
        this.f32088a.setVisibility(0);
        this.f32088a.setTag(1);
        if (z10) {
            this.f32088a.animate().translationY(0.0f).setInterpolator(er.f28123g).setListener(null).setDuration(180L).start();
        } else {
            this.f32088a.setTranslationY(0.0f);
        }
    }

    @Override
    public final void updateFileProgress(Object[] objArr) {
        if (this.f32088a == null || this.f32090c == null || !ApplicationLoader.applicationLoaderInstance.isDownloadingUpdate()) {
            return;
        }
        float downloadingUpdateProgress = ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress();
        this.f32089b.o(downloadingUpdateProgress, true);
        this.f32090c.setText(LocaleController.formatString(R.string.AppUpdateDownloading, Integer.valueOf((int) (downloadingUpdateProgress * 100.0f))));
        this.f32088a.invalidate();
    }
}
