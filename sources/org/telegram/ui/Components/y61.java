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
public final class y61 extends IUpdateLayout {
    public FrameLayout f30518a;
    public RadialProgress2 f30519b;
    public org.telegram.ui.Cells.x1 f30520c;
    public final Activity d;
    public final ViewGroup e;

    public y61(Activity activity, ViewGroup viewGroup) {
        super(activity, viewGroup);
        this.d = activity;
        this.e = viewGroup;
    }

    @Override
    public final void createUpdateUI(int i10) {
        ViewGroup viewGroup = this.e;
        if (viewGroup != null && this.f30518a == null) {
            Activity activity = this.d;
            FrameLayout frameLayout = new FrameLayout(activity);
            this.f30518a = frameLayout;
            frameLayout.setVisibility(4);
            this.f30518a.setTranslationY(AndroidUtilities.dp(44.0f));
            this.f30518a.setBackground(org.telegram.ui.ActionBar.h6.f0(1090519039, 2, -1));
            viewGroup.addView(this.f30518a, w7.y5.e(-1, 44, 83));
            this.f30518a.setOnClickListener(new ci.n4(this, i10, 14));
            org.telegram.ui.Cells.x1 x1Var = new org.telegram.ui.Cells.x1(this, activity);
            this.f30520c = x1Var;
            x1Var.setTextSize(AndroidUtilities.dp(15.0f));
            this.f30520c.setTypeface(AndroidUtilities.bold());
            this.f30520c.setTextColor(-1);
            this.f30520c.setGravity(17);
            this.f30518a.addView(this.f30520c, w7.y5.g());
            this.f30520c.c(LocaleController.getString(R.string.AppUpdateBeta), false, true);
            RadialProgress2 radialProgress2 = new RadialProgress2(this.f30520c, null);
            this.f30519b = radialProgress2;
            int i11 = org.telegram.ui.ActionBar.h6.Oh;
            radialProgress2.setColors(-1, -1, org.telegram.ui.ActionBar.h6.w0(null, i11, false), org.telegram.ui.ActionBar.h6.w0(null, i11, false));
            this.f30519b.q(0, 0, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f));
            this.f30519b.setCircleRadius(AndroidUtilities.dp(11.0f));
            this.f30519b.setAsMini();
        }
    }

    @Override
    public final void updateAppUpdateViews(int i10, boolean z10) {
        if (this.e != null) {
            if (ApplicationLoader.applicationLoaderInstance.getUpdate() != null) {
                createUpdateUI(i10);
                File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
                if (downloadedUpdateFile != null && downloadedUpdateFile.exists()) {
                    this.f30519b.setIcon(15, true, z10);
                    this.f30520c.c(LocaleController.getString(R.string.AppUpdateNow), z10, true);
                } else if (ApplicationLoader.applicationLoaderInstance.isDownloadingUpdate()) {
                    this.f30519b.setIcon(3, true, z10);
                    this.f30519b.o(ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress(), true);
                    this.f30520c.c(LocaleController.formatString(R.string.AppUpdateDownloading, Integer.valueOf((int) (ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress() * 100.0f))), z10, true);
                } else {
                    this.f30519b.setIcon(2, true, z10);
                    this.f30520c.c(LocaleController.getString(R.string.AppUpdateBeta), z10, true);
                }
                if (this.f30518a.getTag() == null) {
                    this.f30518a.setVisibility(0);
                    this.f30518a.setTag(1);
                    if (z10) {
                        this.f30518a.animate().translationY(0.0f).setInterpolator(rr.f28031g).setListener(null).setDuration(180L).start();
                        return;
                    } else {
                        this.f30518a.setTranslationY(0.0f);
                        return;
                    }
                }
                return;
            }
            FrameLayout frameLayout = this.f30518a;
            if (frameLayout != null && frameLayout.getTag() != null) {
                this.f30518a.setTag(null);
                if (z10) {
                    this.f30518a.animate().translationY(AndroidUtilities.dp(44.0f)).setInterpolator(rr.f28031g).setListener(new fd0(this, 28)).setDuration(180L).start();
                    return;
                }
                this.f30518a.setTranslationY(AndroidUtilities.dp(44.0f));
                this.f30518a.setVisibility(4);
            }
        }
    }

    @Override
    public final void updateFileProgress(Object[] objArr) {
        if (this.f30518a != null && this.f30520c != null && ApplicationLoader.applicationLoaderInstance.isDownloadingUpdate()) {
            float downloadingUpdateProgress = ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress();
            this.f30519b.o(downloadingUpdateProgress, true);
            this.f30520c.setText(LocaleController.formatString(R.string.AppUpdateDownloading, Integer.valueOf((int) (downloadingUpdateProgress * 100.0f))));
            this.f30518a.invalidate();
        }
    }
}
