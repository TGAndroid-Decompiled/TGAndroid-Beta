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
public final class l71 extends IUpdateLayout {
    public FrameLayout f28391a;
    public RadialProgress2 f28392b;
    public org.telegram.ui.Cells.x1 f28393c;
    public final Activity d;
    public final ViewGroup f28394e;

    public l71(Activity activity, ViewGroup viewGroup) {
        super(activity, viewGroup);
        this.d = activity;
        this.f28394e = viewGroup;
    }

    @Override
    public final void createUpdateUI(int i10) {
        ViewGroup viewGroup = this.f28394e;
        if (viewGroup != null && this.f28391a == null) {
            Activity activity = this.d;
            FrameLayout frameLayout = new FrameLayout(activity);
            this.f28391a = frameLayout;
            frameLayout.setVisibility(4);
            this.f28391a.setTranslationY(AndroidUtilities.dp(44.0f));
            this.f28391a.setBackground(org.telegram.ui.ActionBar.i6.f0(1090519039, 2, -1));
            viewGroup.addView(this.f28391a, w7.z5.e(-1, 44, 83));
            this.f28391a.setOnClickListener(new ci.n4(this, i10, 14));
            org.telegram.ui.Cells.x1 x1Var = new org.telegram.ui.Cells.x1(this, activity);
            this.f28393c = x1Var;
            x1Var.setTextSize(AndroidUtilities.dp(15.0f));
            this.f28393c.setTypeface(AndroidUtilities.bold());
            this.f28393c.setTextColor(-1);
            this.f28393c.setGravity(17);
            this.f28391a.addView(this.f28393c, w7.z5.g());
            this.f28393c.c(LocaleController.getString(R.string.AppUpdateBeta), false, true);
            RadialProgress2 radialProgress2 = new RadialProgress2(this.f28393c, null);
            this.f28392b = radialProgress2;
            int i11 = org.telegram.ui.ActionBar.i6.Oh;
            radialProgress2.setColors(-1, -1, org.telegram.ui.ActionBar.i6.w0(null, i11, false), org.telegram.ui.ActionBar.i6.w0(null, i11, false));
            this.f28392b.q(0, 0, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f));
            this.f28392b.setCircleRadius(AndroidUtilities.dp(11.0f));
            this.f28392b.setAsMini();
        }
    }

    @Override
    public final void updateAppUpdateViews(int i10, boolean z10) {
        if (this.f28394e != null) {
            if (ApplicationLoader.applicationLoaderInstance.getUpdate() != null) {
                createUpdateUI(i10);
                File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
                if (downloadedUpdateFile != null && downloadedUpdateFile.exists()) {
                    this.f28392b.setIcon(15, true, z10);
                    this.f28393c.c(LocaleController.getString(R.string.AppUpdateNow), z10, true);
                } else if (ApplicationLoader.applicationLoaderInstance.isDownloadingUpdate()) {
                    this.f28392b.setIcon(3, true, z10);
                    this.f28392b.o(ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress(), true);
                    this.f28393c.c(LocaleController.formatString(R.string.AppUpdateDownloading, Integer.valueOf((int) (ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress() * 100.0f))), z10, true);
                } else {
                    this.f28392b.setIcon(2, true, z10);
                    this.f28393c.c(LocaleController.getString(R.string.AppUpdateBeta), z10, true);
                }
                if (this.f28391a.getTag() == null) {
                    this.f28391a.setVisibility(0);
                    this.f28391a.setTag(1);
                    if (z10) {
                        this.f28391a.animate().translationY(0.0f).setInterpolator(tr.f31216g).setListener(null).setDuration(180L).start();
                        return;
                    } else {
                        this.f28391a.setTranslationY(0.0f);
                        return;
                    }
                }
                return;
            }
            FrameLayout frameLayout = this.f28391a;
            if (frameLayout != null && frameLayout.getTag() != null) {
                this.f28391a.setTag(null);
                if (z10) {
                    this.f28391a.animate().translationY(AndroidUtilities.dp(44.0f)).setInterpolator(tr.f31216g).setListener(new hd0(this, 28)).setDuration(180L).start();
                    return;
                }
                this.f28391a.setTranslationY(AndroidUtilities.dp(44.0f));
                this.f28391a.setVisibility(4);
            }
        }
    }

    @Override
    public final void updateFileProgress(Object[] objArr) {
        if (this.f28391a != null && this.f28393c != null && ApplicationLoader.applicationLoaderInstance.isDownloadingUpdate()) {
            float downloadingUpdateProgress = ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress();
            this.f28392b.o(downloadingUpdateProgress, true);
            this.f28393c.setText(LocaleController.formatString(R.string.AppUpdateDownloading, Integer.valueOf((int) (downloadingUpdateProgress * 100.0f))));
            this.f28391a.invalidate();
        }
    }
}
