package org.telegram.ui;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
public final class ei implements ViewTreeObserver.OnPreDrawListener {
    public final int f37306a;
    public final Object f37307b;

    public ei(Object obj, int i10) {
        this.f37306a = i10;
        this.f37307b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f37306a) {
            case 0:
                zn znVar = (zn) this.f37307b;
                qj qjVar = znVar.f44746a1;
                if (qjVar != null) {
                    qjVar.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return znVar.w8();
            case 1:
                ((ci.r6) this.f37307b).invalidate();
                return true;
            case 2:
                View view = ((v70) this.f37307b).fragmentView;
                if (view != null) {
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                    int rotation = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (rotation != 3 && rotation != 1) {
                        ((v70) this.f37307b).f42715f.setOrientation(1);
                    } else {
                        ((v70) this.f37307b).f42715f.setOrientation(0);
                    }
                    View view2 = ((v70) this.f37307b).fragmentView;
                    view2.setPadding(view2.getPaddingLeft(), 0, ((v70) this.f37307b).fragmentView.getPaddingRight(), ((v70) this.f37307b).fragmentView.getPaddingBottom());
                }
                return true;
            case 3:
                kq0 kq0Var = (kq0) this.f37307b;
                if (kq0Var.getParentActivity() != null) {
                    int rotation2 = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    kq0Var.f39377f = 2;
                    if (!AndroidUtilities.isTablet() && (rotation2 == 3 || rotation2 == 1)) {
                        kq0Var.f39377f = 4;
                    }
                    kq0Var.f39378n.l();
                }
                org.telegram.ui.Components.rm0 rm0Var = ((kq0) this.f37307b).h;
                if (rm0Var != null) {
                    rm0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) this.f37307b;
                photoViewer.f34104w3.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = photoViewer.f34114x3;
                if (imageView != null) {
                    if (photoViewer.J3) {
                        AndroidUtilities.runOnUIThread(new Runnable(this) {
                            public final ei f39724b;

                            {
                                this.f39724b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        PhotoViewer photoViewer2 = (PhotoViewer) this.f39724b.f37307b;
                                        photoViewer2.f34114x3.setVisibility(4);
                                        photoViewer2.f34114x3.setImageDrawable(null);
                                        Bitmap bitmap = photoViewer2.C3;
                                        if (bitmap != null) {
                                            bitmap.recycle();
                                            photoViewer2.C3 = null;
                                            return;
                                        }
                                        return;
                                    default:
                                        PhotoViewer photoViewer3 = (PhotoViewer) this.f39724b.f37307b;
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
                        photoViewer.f34114x3.setImageDrawable(null);
                        Bitmap bitmap = photoViewer.C3;
                        if (bitmap != null) {
                            bitmap.recycle();
                            photoViewer.C3 = null;
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final ei f39724b;

                    {
                        this.f39724b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                PhotoViewer photoViewer2 = (PhotoViewer) this.f39724b.f37307b;
                                photoViewer2.f34114x3.setVisibility(4);
                                photoViewer2.f34114x3.setImageDrawable(null);
                                Bitmap bitmap2 = photoViewer2.C3;
                                if (bitmap2 != null) {
                                    bitmap2.recycle();
                                    photoViewer2.C3 = null;
                                    return;
                                }
                                return;
                            default:
                                PhotoViewer photoViewer3 = (PhotoViewer) this.f39724b.f37307b;
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
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.f37307b;
                if (profileActivity.fragmentView != null) {
                    profileActivity.A3();
                    profileActivity.k4(true);
                    profileActivity.fragmentView.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            default:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f37307b;
                int[][] iArr = WallpapersListActivity.f35805k0;
                if (wallpapersListActivity.getParentActivity() != null) {
                    int rotation3 = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (AndroidUtilities.isTablet()) {
                        wallpapersListActivity.R = 3;
                    } else if (rotation3 != 3 && rotation3 != 1) {
                        wallpapersListActivity.R = 3;
                    } else {
                        wallpapersListActivity.R = 5;
                    }
                    wallpapersListActivity.C0();
                }
                org.telegram.ui.Components.rm0 rm0Var2 = ((WallpapersListActivity) this.f37307b).H;
                if (rm0Var2 != null) {
                    rm0Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
        }
    }
}
