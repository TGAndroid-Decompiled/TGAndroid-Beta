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
public final class r71 extends IUpdateLayout {
    public FrameLayout f30411a;
    public RadialProgress2 f30412b;
    public org.telegram.ui.Cells.x1 f30413c;
    public final Activity d;
    public final ViewGroup f30414e;

    public r71(Activity activity, ViewGroup viewGroup) {
        super(activity, viewGroup);
        this.d = activity;
        this.f30414e = viewGroup;
    }

    @Override
    public final void createUpdateUI(int i10) {
        ViewGroup viewGroup = this.f30414e;
        if (viewGroup != null && this.f30411a == null) {
            Activity activity = this.d;
            FrameLayout frameLayout = new FrameLayout(activity);
            this.f30411a = frameLayout;
            frameLayout.setVisibility(4);
            this.f30411a.setTranslationY(AndroidUtilities.dp(44.0f));
            this.f30411a.setBackground(org.telegram.ui.ActionBar.i6.g0(1090519039, 2, -1));
            viewGroup.addView(this.f30411a, w7.x5.e(-1, 44, 83));
            this.f30411a.setOnClickListener(new ci.m4(this, i10, 14));
            org.telegram.ui.Cells.x1 x1Var = new org.telegram.ui.Cells.x1(this, activity);
            this.f30413c = x1Var;
            x1Var.setTextSize(AndroidUtilities.dp(15.0f));
            this.f30413c.setTypeface(AndroidUtilities.bold());
            this.f30413c.setTextColor(-1);
            this.f30413c.setGravity(17);
            this.f30411a.addView(this.f30413c, w7.x5.g());
            this.f30413c.c(LocaleController.getString(R.string.AppUpdateBeta), false, true);
            RadialProgress2 radialProgress2 = new RadialProgress2(this.f30413c, null);
            this.f30412b = radialProgress2;
            int i11 = org.telegram.ui.ActionBar.i6.Oh;
            radialProgress2.setColors(-1, -1, org.telegram.ui.ActionBar.i6.x0(null, i11, false), org.telegram.ui.ActionBar.i6.x0(null, i11, false));
            this.f30412b.q(0, 0, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f));
            this.f30412b.setCircleRadius(AndroidUtilities.dp(11.0f));
            this.f30412b.setAsMini();
        }
    }

    @Override
    public final void updateAppUpdateViews(int i10, boolean z10) {
        if (this.f30414e != null) {
            if (ApplicationLoader.applicationLoaderInstance.getUpdate() != null) {
                createUpdateUI(i10);
                File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
                if (downloadedUpdateFile != null && downloadedUpdateFile.exists()) {
                    this.f30412b.setIcon(15, true, z10);
                    this.f30413c.c(LocaleController.getString(R.string.AppUpdateNow), z10, true);
                } else if (ApplicationLoader.applicationLoaderInstance.isDownloadingUpdate()) {
                    this.f30412b.setIcon(3, true, z10);
                    this.f30412b.o(ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress(), true);
                    this.f30413c.c(LocaleController.formatString(R.string.AppUpdateDownloading, Integer.valueOf((int) (ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress() * 100.0f))), z10, true);
                } else {
                    this.f30412b.setIcon(2, true, z10);
                    this.f30413c.c(LocaleController.getString(R.string.AppUpdateBeta), z10, true);
                }
                if (this.f30411a.getTag() == null) {
                    this.f30411a.setVisibility(0);
                    this.f30411a.setTag(1);
                    if (z10) {
                        this.f30411a.animate().translationY(0.0f).setInterpolator(is.f27444g).setListener(null).setDuration(180L).start();
                        return;
                    } else {
                        this.f30411a.setTranslationY(0.0f);
                        return;
                    }
                }
                return;
            }
            FrameLayout frameLayout = this.f30411a;
            if (frameLayout != null && frameLayout.getTag() != null) {
                this.f30411a.setTag(null);
                if (z10) {
                    this.f30411a.animate().translationY(AndroidUtilities.dp(44.0f)).setInterpolator(is.f27444g).setListener(new wd0(this, 28)).setDuration(180L).start();
                    return;
                }
                this.f30411a.setTranslationY(AndroidUtilities.dp(44.0f));
                this.f30411a.setVisibility(4);
            }
        }
    }

    @Override
    public final void updateFileProgress(Object[] objArr) {
        if (this.f30411a != null && this.f30413c != null && ApplicationLoader.applicationLoaderInstance.isDownloadingUpdate()) {
            float downloadingUpdateProgress = ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress();
            this.f30412b.o(downloadingUpdateProgress, true);
            this.f30413c.setText(LocaleController.formatString(R.string.AppUpdateDownloading, Integer.valueOf((int) (downloadingUpdateProgress * 100.0f))));
            this.f30411a.invalidate();
        }
    }
}
