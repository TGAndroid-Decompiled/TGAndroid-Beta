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
public final class m61 extends IUpdateLayout {
    public FrameLayout f26089a;
    public RadialProgress2 f26090b;
    public org.telegram.ui.Cells.w1 f26091c;
    public final Activity d;
    public final ViewGroup e;

    public m61(Activity activity, ViewGroup viewGroup) {
        super(activity, viewGroup);
        this.d = activity;
        this.e = viewGroup;
    }

    @Override
    public final void createUpdateUI(int i10) {
        ViewGroup viewGroup = this.e;
        if (viewGroup != null && this.f26089a == null) {
            Activity activity = this.d;
            FrameLayout frameLayout = new FrameLayout(activity);
            this.f26089a = frameLayout;
            frameLayout.setVisibility(4);
            this.f26089a.setTranslationY(AndroidUtilities.dp(44.0f));
            this.f26089a.setBackground(org.telegram.ui.ActionBar.j6.f0(1090519039, 2, -1));
            viewGroup.addView(this.f26089a, w7.x5.e(-1, 44, 83));
            this.f26089a.setOnClickListener(new ci.o4(this, i10, 14));
            org.telegram.ui.Cells.w1 w1Var = new org.telegram.ui.Cells.w1(this, activity);
            this.f26091c = w1Var;
            w1Var.setTextSize(AndroidUtilities.dp(15.0f));
            this.f26091c.setTypeface(AndroidUtilities.bold());
            this.f26091c.setTextColor(-1);
            this.f26091c.setGravity(17);
            this.f26089a.addView(this.f26091c, w7.x5.g());
            this.f26091c.c(LocaleController.getString(R.string.AppUpdateBeta), false, true);
            RadialProgress2 radialProgress2 = new RadialProgress2(this.f26091c, null);
            this.f26090b = radialProgress2;
            int i11 = org.telegram.ui.ActionBar.j6.Oh;
            radialProgress2.setColors(-1, -1, org.telegram.ui.ActionBar.j6.w0(null, i11, false), org.telegram.ui.ActionBar.j6.w0(null, i11, false));
            this.f26090b.q(0, 0, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f));
            this.f26090b.setCircleRadius(AndroidUtilities.dp(11.0f));
            this.f26090b.setAsMini();
        }
    }

    @Override
    public final void updateAppUpdateViews(int i10, boolean z10) {
        if (this.e != null) {
            if (ApplicationLoader.applicationLoaderInstance.getUpdate() != null) {
                createUpdateUI(i10);
                File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
                if (downloadedUpdateFile != null && downloadedUpdateFile.exists()) {
                    this.f26090b.setIcon(15, true, z10);
                    this.f26091c.c(LocaleController.getString(R.string.AppUpdateNow), z10, true);
                } else if (ApplicationLoader.applicationLoaderInstance.isDownloadingUpdate()) {
                    this.f26090b.setIcon(3, true, z10);
                    this.f26090b.o(ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress(), true);
                    this.f26091c.c(LocaleController.formatString(R.string.AppUpdateDownloading, Integer.valueOf((int) (ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress() * 100.0f))), z10, true);
                } else {
                    this.f26090b.setIcon(2, true, z10);
                    this.f26091c.c(LocaleController.getString(R.string.AppUpdateBeta), z10, true);
                }
                if (this.f26089a.getTag() == null) {
                    this.f26089a.setVisibility(0);
                    this.f26089a.setTag(1);
                    if (z10) {
                        this.f26089a.animate().translationY(0.0f).setInterpolator(qr.f27381g).setListener(null).setDuration(180L).start();
                        return;
                    } else {
                        this.f26089a.setTranslationY(0.0f);
                        return;
                    }
                }
                return;
            }
            FrameLayout frameLayout = this.f26089a;
            if (frameLayout != null && frameLayout.getTag() != null) {
                this.f26089a.setTag(null);
                if (z10) {
                    this.f26089a.animate().translationY(AndroidUtilities.dp(44.0f)).setInterpolator(qr.f27381g).setListener(new jd0(this, 27)).setDuration(180L).start();
                    return;
                }
                this.f26089a.setTranslationY(AndroidUtilities.dp(44.0f));
                this.f26089a.setVisibility(4);
            }
        }
    }

    @Override
    public final void updateFileProgress(Object[] objArr) {
        if (this.f26089a != null && this.f26091c != null && ApplicationLoader.applicationLoaderInstance.isDownloadingUpdate()) {
            float downloadingUpdateProgress = ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress();
            this.f26090b.o(downloadingUpdateProgress, true);
            this.f26091c.setText(LocaleController.formatString(R.string.AppUpdateDownloading, Integer.valueOf((int) (downloadingUpdateProgress * 100.0f))));
            this.f26089a.invalidate();
        }
    }
}
