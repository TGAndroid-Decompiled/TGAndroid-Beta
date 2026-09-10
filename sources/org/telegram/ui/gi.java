package org.telegram.ui;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
public final class gi implements ViewTreeObserver.OnPreDrawListener {
    public final int f33106a;
    public final Object f33107b;

    public gi(Object obj, int i10) {
        this.f33106a = i10;
        this.f33107b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f33106a) {
            case 0:
                eo eoVar = (eo) this.f33107b;
                rj rjVar = eoVar.f32256a1;
                if (rjVar != null) {
                    rjVar.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return eoVar.s8();
            case 1:
                ((bi.s7) this.f33107b).invalidate();
                return true;
            case 2:
                View view = ((v70) this.f33107b).fragmentView;
                if (view != null) {
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                    int rotation = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (rotation != 3 && rotation != 1) {
                        ((v70) this.f33107b).f37431f.setOrientation(1);
                    } else {
                        ((v70) this.f33107b).f37431f.setOrientation(0);
                    }
                    View view2 = ((v70) this.f33107b).fragmentView;
                    view2.setPadding(view2.getPaddingLeft(), 0, ((v70) this.f33107b).fragmentView.getPaddingRight(), ((v70) this.f33107b).fragmentView.getPaddingBottom());
                }
                return true;
            case 3:
                kq0 kq0Var = (kq0) this.f33107b;
                if (kq0Var.getParentActivity() != null) {
                    int rotation2 = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    kq0Var.f34441f = 2;
                    if (!AndroidUtilities.isTablet() && (rotation2 == 3 || rotation2 == 1)) {
                        kq0Var.f34441f = 4;
                    }
                    kq0Var.f34442n.l();
                }
                org.telegram.ui.Components.vl0 vl0Var = ((kq0) this.f33107b).h;
                if (vl0Var != null) {
                    vl0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) this.f33107b;
                photoViewer.f30211w3.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = photoViewer.f30221x3;
                if (imageView != null) {
                    if (photoViewer.J3) {
                        AndroidUtilities.runOnUIThread(new Runnable(this) {
                            public final gi f34462b;

                            {
                                this.f34462b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        PhotoViewer photoViewer2 = (PhotoViewer) this.f34462b.f33107b;
                                        photoViewer2.f30221x3.setVisibility(4);
                                        photoViewer2.f30221x3.setImageDrawable(null);
                                        Bitmap bitmap = photoViewer2.C3;
                                        if (bitmap != null) {
                                            bitmap.recycle();
                                            photoViewer2.C3 = null;
                                            return;
                                        }
                                        return;
                                    default:
                                        PhotoViewer photoViewer3 = (PhotoViewer) this.f34462b.f33107b;
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
                        photoViewer.f30221x3.setImageDrawable(null);
                        Bitmap bitmap = photoViewer.C3;
                        if (bitmap != null) {
                            bitmap.recycle();
                            photoViewer.C3 = null;
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final gi f34462b;

                    {
                        this.f34462b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                PhotoViewer photoViewer2 = (PhotoViewer) this.f34462b.f33107b;
                                photoViewer2.f30221x3.setVisibility(4);
                                photoViewer2.f30221x3.setImageDrawable(null);
                                Bitmap bitmap2 = photoViewer2.C3;
                                if (bitmap2 != null) {
                                    bitmap2.recycle();
                                    photoViewer2.C3 = null;
                                    return;
                                }
                                return;
                            default:
                                PhotoViewer photoViewer3 = (PhotoViewer) this.f34462b.f33107b;
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
                ProfileActivity profileActivity = (ProfileActivity) this.f33107b;
                if (profileActivity.fragmentView != null) {
                    profileActivity.A3();
                    profileActivity.k4(true);
                    profileActivity.fragmentView.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            default:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f33107b;
                int[][] iArr = WallpapersListActivity.f30730k0;
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
                org.telegram.ui.Components.vl0 vl0Var2 = ((WallpapersListActivity) this.f33107b).H;
                if (vl0Var2 != null) {
                    vl0Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
        }
    }
}
