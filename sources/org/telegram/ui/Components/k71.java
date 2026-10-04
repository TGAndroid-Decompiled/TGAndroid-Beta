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
public final class k71 extends IUpdateLayout {
    public FrameLayout f27978a;
    public RadialProgress2 f27979b;
    public org.telegram.ui.Cells.x1 f27980c;
    public final Activity d;
    public final ViewGroup f27981e;

    public k71(Activity activity, ViewGroup viewGroup) {
        super(activity, viewGroup);
        this.d = activity;
        this.f27981e = viewGroup;
    }

    @Override
    public final void createUpdateUI(int i10) {
        ViewGroup viewGroup = this.f27981e;
        if (viewGroup != null && this.f27978a == null) {
            Activity activity = this.d;
            FrameLayout frameLayout = new FrameLayout(activity);
            this.f27978a = frameLayout;
            frameLayout.setVisibility(4);
            this.f27978a.setTranslationY(AndroidUtilities.dp(44.0f));
            this.f27978a.setBackground(org.telegram.ui.ActionBar.i6.f0(1090519039, 2, -1));
            viewGroup.addView(this.f27978a, w7.z5.e(-1, 44, 83));
            this.f27978a.setOnClickListener(new ci.n4(this, i10, 14));
            org.telegram.ui.Cells.x1 x1Var = new org.telegram.ui.Cells.x1(this, activity);
            this.f27980c = x1Var;
            x1Var.setTextSize(AndroidUtilities.dp(15.0f));
            this.f27980c.setTypeface(AndroidUtilities.bold());
            this.f27980c.setTextColor(-1);
            this.f27980c.setGravity(17);
            this.f27978a.addView(this.f27980c, w7.z5.g());
            this.f27980c.c(LocaleController.getString(R.string.AppUpdateBeta), false, true);
            RadialProgress2 radialProgress2 = new RadialProgress2(this.f27980c, null);
            this.f27979b = radialProgress2;
            int i11 = org.telegram.ui.ActionBar.i6.Oh;
            radialProgress2.setColors(-1, -1, org.telegram.ui.ActionBar.i6.w0(null, i11, false), org.telegram.ui.ActionBar.i6.w0(null, i11, false));
            this.f27979b.q(0, 0, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f));
            this.f27979b.setCircleRadius(AndroidUtilities.dp(11.0f));
            this.f27979b.setAsMini();
        }
    }

    @Override
    public final void updateAppUpdateViews(int i10, boolean z10) {
        if (this.f27981e != null) {
            if (ApplicationLoader.applicationLoaderInstance.getUpdate() != null) {
                createUpdateUI(i10);
                File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
                if (downloadedUpdateFile != null && downloadedUpdateFile.exists()) {
                    this.f27979b.setIcon(15, true, z10);
                    this.f27980c.c(LocaleController.getString(R.string.AppUpdateNow), z10, true);
                } else if (ApplicationLoader.applicationLoaderInstance.isDownloadingUpdate()) {
                    this.f27979b.setIcon(3, true, z10);
                    this.f27979b.o(ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress(), true);
                    this.f27980c.c(LocaleController.formatString(R.string.AppUpdateDownloading, Integer.valueOf((int) (ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress() * 100.0f))), z10, true);
                } else {
                    this.f27979b.setIcon(2, true, z10);
                    this.f27980c.c(LocaleController.getString(R.string.AppUpdateBeta), z10, true);
                }
                if (this.f27978a.getTag() == null) {
                    this.f27978a.setVisibility(0);
                    this.f27978a.setTag(1);
                    if (z10) {
                        this.f27978a.animate().translationY(0.0f).setInterpolator(tr.f31142g).setListener(null).setDuration(180L).start();
                        return;
                    } else {
                        this.f27978a.setTranslationY(0.0f);
                        return;
                    }
                }
                return;
            }
            FrameLayout frameLayout = this.f27978a;
            if (frameLayout != null && frameLayout.getTag() != null) {
                this.f27978a.setTag(null);
                if (z10) {
                    this.f27978a.animate().translationY(AndroidUtilities.dp(44.0f)).setInterpolator(tr.f31142g).setListener(new hd0(this, 28)).setDuration(180L).start();
                    return;
                }
                this.f27978a.setTranslationY(AndroidUtilities.dp(44.0f));
                this.f27978a.setVisibility(4);
            }
        }
    }

    @Override
    public final void updateFileProgress(Object[] objArr) {
        if (this.f27978a != null && this.f27980c != null && ApplicationLoader.applicationLoaderInstance.isDownloadingUpdate()) {
            float downloadingUpdateProgress = ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress();
            this.f27979b.o(downloadingUpdateProgress, true);
            this.f27980c.setText(LocaleController.formatString(R.string.AppUpdateDownloading, Integer.valueOf((int) (downloadingUpdateProgress * 100.0f))));
            this.f27978a.invalidate();
        }
    }
}
