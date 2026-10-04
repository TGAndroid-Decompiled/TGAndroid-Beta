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
    public FrameLayout f27983a;
    public RadialProgress2 f27984b;
    public org.telegram.ui.Cells.x1 f27985c;
    public final Activity d;
    public final ViewGroup f27986e;

    public k71(Activity activity, ViewGroup viewGroup) {
        super(activity, viewGroup);
        this.d = activity;
        this.f27986e = viewGroup;
    }

    @Override
    public final void createUpdateUI(int i10) {
        ViewGroup viewGroup = this.f27986e;
        if (viewGroup != null && this.f27983a == null) {
            Activity activity = this.d;
            FrameLayout frameLayout = new FrameLayout(activity);
            this.f27983a = frameLayout;
            frameLayout.setVisibility(4);
            this.f27983a.setTranslationY(AndroidUtilities.dp(44.0f));
            this.f27983a.setBackground(org.telegram.ui.ActionBar.i6.f0(1090519039, 2, -1));
            viewGroup.addView(this.f27983a, w7.z5.e(-1, 44, 83));
            this.f27983a.setOnClickListener(new ci.n4(this, i10, 14));
            org.telegram.ui.Cells.x1 x1Var = new org.telegram.ui.Cells.x1(this, activity);
            this.f27985c = x1Var;
            x1Var.setTextSize(AndroidUtilities.dp(15.0f));
            this.f27985c.setTypeface(AndroidUtilities.bold());
            this.f27985c.setTextColor(-1);
            this.f27985c.setGravity(17);
            this.f27983a.addView(this.f27985c, w7.z5.g());
            this.f27985c.c(LocaleController.getString(R.string.AppUpdateBeta), false, true);
            RadialProgress2 radialProgress2 = new RadialProgress2(this.f27985c, null);
            this.f27984b = radialProgress2;
            int i11 = org.telegram.ui.ActionBar.i6.Oh;
            radialProgress2.setColors(-1, -1, org.telegram.ui.ActionBar.i6.w0(null, i11, false), org.telegram.ui.ActionBar.i6.w0(null, i11, false));
            this.f27984b.q(0, 0, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f));
            this.f27984b.setCircleRadius(AndroidUtilities.dp(11.0f));
            this.f27984b.setAsMini();
        }
    }

    @Override
    public final void updateAppUpdateViews(int i10, boolean z10) {
        if (this.f27986e != null) {
            if (ApplicationLoader.applicationLoaderInstance.getUpdate() != null) {
                createUpdateUI(i10);
                File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
                if (downloadedUpdateFile != null && downloadedUpdateFile.exists()) {
                    this.f27984b.setIcon(15, true, z10);
                    this.f27985c.c(LocaleController.getString(R.string.AppUpdateNow), z10, true);
                } else if (ApplicationLoader.applicationLoaderInstance.isDownloadingUpdate()) {
                    this.f27984b.setIcon(3, true, z10);
                    this.f27984b.o(ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress(), true);
                    this.f27985c.c(LocaleController.formatString(R.string.AppUpdateDownloading, Integer.valueOf((int) (ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress() * 100.0f))), z10, true);
                } else {
                    this.f27984b.setIcon(2, true, z10);
                    this.f27985c.c(LocaleController.getString(R.string.AppUpdateBeta), z10, true);
                }
                if (this.f27983a.getTag() == null) {
                    this.f27983a.setVisibility(0);
                    this.f27983a.setTag(1);
                    if (z10) {
                        this.f27983a.animate().translationY(0.0f).setInterpolator(tr.f31148g).setListener(null).setDuration(180L).start();
                        return;
                    } else {
                        this.f27983a.setTranslationY(0.0f);
                        return;
                    }
                }
                return;
            }
            FrameLayout frameLayout = this.f27983a;
            if (frameLayout != null && frameLayout.getTag() != null) {
                this.f27983a.setTag(null);
                if (z10) {
                    this.f27983a.animate().translationY(AndroidUtilities.dp(44.0f)).setInterpolator(tr.f31148g).setListener(new hd0(this, 28)).setDuration(180L).start();
                    return;
                }
                this.f27983a.setTranslationY(AndroidUtilities.dp(44.0f));
                this.f27983a.setVisibility(4);
            }
        }
    }

    @Override
    public final void updateFileProgress(Object[] objArr) {
        if (this.f27983a != null && this.f27985c != null && ApplicationLoader.applicationLoaderInstance.isDownloadingUpdate()) {
            float downloadingUpdateProgress = ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress();
            this.f27984b.o(downloadingUpdateProgress, true);
            this.f27985c.setText(LocaleController.formatString(R.string.AppUpdateDownloading, Integer.valueOf((int) (downloadingUpdateProgress * 100.0f))));
            this.f27983a.invalidate();
        }
    }
}
