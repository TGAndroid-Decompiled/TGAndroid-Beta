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
public final class l61 extends IUpdateLayout {
    public FrameLayout f25841a;
    public RadialProgress2 f25842b;
    public org.telegram.ui.Cells.w1 f25843c;
    public final Activity d;
    public final ViewGroup e;

    public l61(Activity activity, ViewGroup viewGroup) {
        super(activity, viewGroup);
        this.d = activity;
        this.e = viewGroup;
    }

    @Override
    public final void createUpdateUI(int i10) {
        ViewGroup viewGroup = this.e;
        if (viewGroup != null && this.f25841a == null) {
            Activity activity = this.d;
            FrameLayout frameLayout = new FrameLayout(activity);
            this.f25841a = frameLayout;
            frameLayout.setVisibility(4);
            this.f25841a.setTranslationY(AndroidUtilities.dp(44.0f));
            this.f25841a.setBackground(org.telegram.ui.ActionBar.i6.f0(1090519039, 2, -1));
            viewGroup.addView(this.f25841a, w7.x5.e(-1, 44, 83));
            this.f25841a.setOnClickListener(new ci.o4(this, i10, 14));
            org.telegram.ui.Cells.w1 w1Var = new org.telegram.ui.Cells.w1(this, activity);
            this.f25843c = w1Var;
            w1Var.setTextSize(AndroidUtilities.dp(15.0f));
            this.f25843c.setTypeface(AndroidUtilities.bold());
            this.f25843c.setTextColor(-1);
            this.f25843c.setGravity(17);
            this.f25841a.addView(this.f25843c, w7.x5.g());
            this.f25843c.c(LocaleController.getString(R.string.AppUpdateBeta), false, true);
            RadialProgress2 radialProgress2 = new RadialProgress2(this.f25843c, null);
            this.f25842b = radialProgress2;
            int i11 = org.telegram.ui.ActionBar.i6.Oh;
            radialProgress2.setColors(-1, -1, org.telegram.ui.ActionBar.i6.w0(null, i11, false), org.telegram.ui.ActionBar.i6.w0(null, i11, false));
            this.f25842b.q(0, 0, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f));
            this.f25842b.setCircleRadius(AndroidUtilities.dp(11.0f));
            this.f25842b.setAsMini();
        }
    }

    @Override
    public final void updateAppUpdateViews(int i10, boolean z10) {
        if (this.e != null) {
            if (ApplicationLoader.applicationLoaderInstance.getUpdate() != null) {
                createUpdateUI(i10);
                File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
                if (downloadedUpdateFile != null && downloadedUpdateFile.exists()) {
                    this.f25842b.setIcon(15, true, z10);
                    this.f25843c.c(LocaleController.getString(R.string.AppUpdateNow), z10, true);
                } else if (ApplicationLoader.applicationLoaderInstance.isDownloadingUpdate()) {
                    this.f25842b.setIcon(3, true, z10);
                    this.f25842b.o(ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress(), true);
                    this.f25843c.c(LocaleController.formatString(R.string.AppUpdateDownloading, Integer.valueOf((int) (ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress() * 100.0f))), z10, true);
                } else {
                    this.f25842b.setIcon(2, true, z10);
                    this.f25843c.c(LocaleController.getString(R.string.AppUpdateBeta), z10, true);
                }
                if (this.f25841a.getTag() == null) {
                    this.f25841a.setVisibility(0);
                    this.f25841a.setTag(1);
                    if (z10) {
                        this.f25841a.animate().translationY(0.0f).setInterpolator(qr.f27424g).setListener(null).setDuration(180L).start();
                        return;
                    } else {
                        this.f25841a.setTranslationY(0.0f);
                        return;
                    }
                }
                return;
            }
            FrameLayout frameLayout = this.f25841a;
            if (frameLayout != null && frameLayout.getTag() != null) {
                this.f25841a.setTag(null);
                if (z10) {
                    this.f25841a.animate().translationY(AndroidUtilities.dp(44.0f)).setInterpolator(qr.f27424g).setListener(new jd0(this, 27)).setDuration(180L).start();
                    return;
                }
                this.f25841a.setTranslationY(AndroidUtilities.dp(44.0f));
                this.f25841a.setVisibility(4);
            }
        }
    }

    @Override
    public final void updateFileProgress(Object[] objArr) {
        if (this.f25841a != null && this.f25843c != null && ApplicationLoader.applicationLoaderInstance.isDownloadingUpdate()) {
            float downloadingUpdateProgress = ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress();
            this.f25842b.o(downloadingUpdateProgress, true);
            this.f25843c.setText(LocaleController.formatString(R.string.AppUpdateDownloading, Integer.valueOf((int) (downloadingUpdateProgress * 100.0f))));
            this.f25841a.invalidate();
        }
    }
}
