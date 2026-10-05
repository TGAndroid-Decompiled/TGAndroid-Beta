package org.telegram.ui;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
public final class g7 implements ViewTreeObserver.OnPreDrawListener {
    public final int f36533a;
    public final Object f36534b;

    public g7(Object obj, int i10) {
        this.f36533a = i10;
        this.f36534b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f36533a) {
            case 0:
                v7 v7Var = (v7) this.f36534b;
                FrameLayout frameLayout = v7Var.f41619b;
                if (!v7Var.f41627x) {
                    float max = Math.max(0.0f, v7Var.f41626w - v7Var.getY());
                    if (frameLayout.getTranslationY() != max) {
                        frameLayout.setTranslationY(max);
                    }
                }
                return true;
            case 1:
                yn ynVar = (yn) this.f36534b;
                nj njVar = ynVar.Y0;
                if (njVar != null) {
                    njVar.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return ynVar.s8();
            case 2:
                ((ci.r6) this.f36534b).invalidate();
                return true;
            case 3:
                View view = ((v70) this.f36534b).fragmentView;
                if (view != null) {
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                    int rotation = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (rotation != 3 && rotation != 1) {
                        ((v70) this.f36534b).f41633f.setOrientation(1);
                    } else {
                        ((v70) this.f36534b).f41633f.setOrientation(0);
                    }
                    View view2 = ((v70) this.f36534b).fragmentView;
                    view2.setPadding(view2.getPaddingLeft(), 0, ((v70) this.f36534b).fragmentView.getPaddingRight(), ((v70) this.f36534b).fragmentView.getPaddingBottom());
                }
                return true;
            case 4:
                fq0 fq0Var = (fq0) this.f36534b;
                if (fq0Var.getParentActivity() != null) {
                    int rotation2 = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    fq0Var.f36378f = 2;
                    if (!AndroidUtilities.isTablet() && (rotation2 == 3 || rotation2 == 1)) {
                        fq0Var.f36378f = 4;
                    }
                    fq0Var.f36379n.l();
                }
                org.telegram.ui.Components.zl0 zl0Var = ((fq0) this.f36534b).h;
                if (zl0Var != null) {
                    zl0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            case 5:
                PhotoViewer photoViewer = (PhotoViewer) this.f36534b;
                photoViewer.f34076w3.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = photoViewer.f34086x3;
                if (imageView != null) {
                    if (photoViewer.J3) {
                        AndroidUtilities.runOnUIThread(new Runnable(this) {
                            public final g7 f36409b;

                            {
                                this.f36409b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        PhotoViewer photoViewer2 = (PhotoViewer) this.f36409b.f36534b;
                                        photoViewer2.f34086x3.setVisibility(4);
                                        photoViewer2.f34086x3.setImageDrawable(null);
                                        Bitmap bitmap = photoViewer2.C3;
                                        if (bitmap != null) {
                                            bitmap.recycle();
                                            photoViewer2.C3 = null;
                                            return;
                                        }
                                        return;
                                    default:
                                        PhotoViewer photoViewer3 = (PhotoViewer) this.f36409b.f36534b;
                                        if (photoViewer3.J3) {
                                            photoViewer3.S0();
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, 300L);
                    } else {
                        imageView.setVisibility(4);
                        photoViewer.f34086x3.setImageDrawable(null);
                        Bitmap bitmap = photoViewer.C3;
                        if (bitmap != null) {
                            bitmap.recycle();
                            photoViewer.C3 = null;
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final g7 f36409b;

                    {
                        this.f36409b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                PhotoViewer photoViewer2 = (PhotoViewer) this.f36409b.f36534b;
                                photoViewer2.f34086x3.setVisibility(4);
                                photoViewer2.f34086x3.setImageDrawable(null);
                                Bitmap bitmap2 = photoViewer2.C3;
                                if (bitmap2 != null) {
                                    bitmap2.recycle();
                                    photoViewer2.C3 = null;
                                    return;
                                }
                                return;
                            default:
                                PhotoViewer photoViewer3 = (PhotoViewer) this.f36409b.f36534b;
                                if (photoViewer3.J3) {
                                    photoViewer3.S0();
                                    return;
                                }
                                return;
                        }
                    }
                });
                photoViewer.G3 = 0;
                return true;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) this.f36534b;
                if (profileActivity.fragmentView != null) {
                    profileActivity.A3();
                    profileActivity.k4(true);
                    profileActivity.fragmentView.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            default:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f36534b;
                int[][] iArr = WallpapersListActivity.f34613i0;
                if (wallpapersListActivity.getParentActivity() != null) {
                    int rotation3 = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (AndroidUtilities.isTablet()) {
                        wallpapersListActivity.P = 3;
                    } else if (rotation3 != 3 && rotation3 != 1) {
                        wallpapersListActivity.P = 3;
                    } else {
                        wallpapersListActivity.P = 5;
                    }
                    wallpapersListActivity.C0();
                }
                org.telegram.ui.Components.zl0 zl0Var2 = ((WallpapersListActivity) this.f36534b).F;
                if (zl0Var2 != null) {
                    zl0Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
        }
    }
}
