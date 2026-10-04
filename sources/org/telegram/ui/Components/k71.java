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
    public FrameLayout f27977a;
    public RadialProgress2 f27978b;
    public org.telegram.ui.Cells.x1 f27979c;
    public final Activity d;
    public final ViewGroup f27980e;

    public k71(Activity activity, ViewGroup viewGroup) {
        super(activity, viewGroup);
        this.d = activity;
        this.f27980e = viewGroup;
    }

    @Override
    public final void createUpdateUI(int i10) {
        ViewGroup viewGroup = this.f27980e;
        if (viewGroup != null && this.f27977a == null) {
            Activity activity = this.d;
            FrameLayout frameLayout = new FrameLayout(activity);
            this.f27977a = frameLayout;
            frameLayout.setVisibility(4);
            this.f27977a.setTranslationY(AndroidUtilities.dp(44.0f));
            this.f27977a.setBackground(org.telegram.ui.ActionBar.i6.f0(1090519039, 2, -1));
            viewGroup.addView(this.f27977a, w7.z5.e(-1, 44, 83));
            this.f27977a.setOnClickListener(new ci.n4(this, i10, 14));
            org.telegram.ui.Cells.x1 x1Var = new org.telegram.ui.Cells.x1(this, activity);
            this.f27979c = x1Var;
            x1Var.setTextSize(AndroidUtilities.dp(15.0f));
            this.f27979c.setTypeface(AndroidUtilities.bold());
            this.f27979c.setTextColor(-1);
            this.f27979c.setGravity(17);
            this.f27977a.addView(this.f27979c, w7.z5.g());
            this.f27979c.c(LocaleController.getString(R.string.AppUpdateBeta), false, true);
            RadialProgress2 radialProgress2 = new RadialProgress2(this.f27979c, null);
            this.f27978b = radialProgress2;
            int i11 = org.telegram.ui.ActionBar.i6.Oh;
            radialProgress2.setColors(-1, -1, org.telegram.ui.ActionBar.i6.w0(null, i11, false), org.telegram.ui.ActionBar.i6.w0(null, i11, false));
            this.f27978b.q(0, 0, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f));
            this.f27978b.setCircleRadius(AndroidUtilities.dp(11.0f));
            this.f27978b.setAsMini();
        }
    }

    @Override
    public final void updateAppUpdateViews(int i10, boolean z10) {
        if (this.f27980e != null) {
            if (ApplicationLoader.applicationLoaderInstance.getUpdate() != null) {
                createUpdateUI(i10);
                File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
                if (downloadedUpdateFile != null && downloadedUpdateFile.exists()) {
                    this.f27978b.setIcon(15, true, z10);
                    this.f27979c.c(LocaleController.getString(R.string.AppUpdateNow), z10, true);
                } else if (ApplicationLoader.applicationLoaderInstance.isDownloadingUpdate()) {
                    this.f27978b.setIcon(3, true, z10);
                    this.f27978b.o(ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress(), true);
                    this.f27979c.c(LocaleController.formatString(R.string.AppUpdateDownloading, Integer.valueOf((int) (ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress() * 100.0f))), z10, true);
                } else {
                    this.f27978b.setIcon(2, true, z10);
                    this.f27979c.c(LocaleController.getString(R.string.AppUpdateBeta), z10, true);
                }
                if (this.f27977a.getTag() == null) {
                    this.f27977a.setVisibility(0);
                    this.f27977a.setTag(1);
                    if (z10) {
                        this.f27977a.animate().translationY(0.0f).setInterpolator(tr.f31141g).setListener(null).setDuration(180L).start();
                        return;
                    } else {
                        this.f27977a.setTranslationY(0.0f);
                        return;
                    }
                }
                return;
            }
            FrameLayout frameLayout = this.f27977a;
            if (frameLayout != null && frameLayout.getTag() != null) {
                this.f27977a.setTag(null);
                if (z10) {
                    this.f27977a.animate().translationY(AndroidUtilities.dp(44.0f)).setInterpolator(tr.f31141g).setListener(new hd0(this, 28)).setDuration(180L).start();
                    return;
                }
                this.f27977a.setTranslationY(AndroidUtilities.dp(44.0f));
                this.f27977a.setVisibility(4);
            }
        }
    }

    @Override
    public final void updateFileProgress(Object[] objArr) {
        if (this.f27977a != null && this.f27979c != null && ApplicationLoader.applicationLoaderInstance.isDownloadingUpdate()) {
            float downloadingUpdateProgress = ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress();
            this.f27978b.o(downloadingUpdateProgress, true);
            this.f27979c.setText(LocaleController.formatString(R.string.AppUpdateDownloading, Integer.valueOf((int) (downloadingUpdateProgress * 100.0f))));
            this.f27977a.invalidate();
        }
    }
}
