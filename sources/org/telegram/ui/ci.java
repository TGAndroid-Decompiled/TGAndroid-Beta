package org.telegram.ui;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
public final class ci implements ViewTreeObserver.OnPreDrawListener {
    public final int f33159a;
    public final Object f33160b;

    public ci(Object obj, int i10) {
        this.f33159a = i10;
        this.f33160b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f33159a) {
            case 0:
                zn znVar = (zn) this.f33160b;
                nj njVar = znVar.X0;
                if (njVar != null) {
                    njVar.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return znVar.s8();
            case 1:
                ((eg.i0) this.f33160b).invalidate();
                return true;
            case 2:
                View view = ((q70) this.f33160b).fragmentView;
                if (view != null) {
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                    int rotation = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (rotation != 3 && rotation != 1) {
                        ((q70) this.f33160b).f37325f.setOrientation(1);
                    } else {
                        ((q70) this.f33160b).f37325f.setOrientation(0);
                    }
                    View view2 = ((q70) this.f33160b).fragmentView;
                    view2.setPadding(view2.getPaddingLeft(), 0, ((q70) this.f33160b).fragmentView.getPaddingRight(), ((q70) this.f33160b).fragmentView.getPaddingBottom());
                }
                return true;
            case 3:
                wp0 wp0Var = (wp0) this.f33160b;
                if (wp0Var.getParentActivity() != null) {
                    int rotation2 = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    wp0Var.f39750f = 2;
                    if (!AndroidUtilities.isTablet() && (rotation2 == 3 || rotation2 == 1)) {
                        wp0Var.f39750f = 4;
                    }
                    wp0Var.f39751n.l();
                }
                org.telegram.ui.Components.rl0 rl0Var = ((wp0) this.f33160b).h;
                if (rl0Var != null) {
                    rl0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) this.f33160b;
                photoViewer.f31844t3.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = photoViewer.f31852u3;
                if (imageView != null) {
                    if (photoViewer.G3) {
                        AndroidUtilities.runOnUIThread(new Runnable(this) {
                            public final ci f39772b;

                            {
                                this.f39772b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        PhotoViewer photoViewer2 = (PhotoViewer) this.f39772b.f33160b;
                                        photoViewer2.f31852u3.setVisibility(4);
                                        photoViewer2.f31852u3.setImageDrawable(null);
                                        Bitmap bitmap = photoViewer2.f31900z3;
                                        if (bitmap != null) {
                                            bitmap.recycle();
                                            photoViewer2.f31900z3 = null;
                                            return;
                                        }
                                        return;
                                    default:
                                        PhotoViewer photoViewer3 = (PhotoViewer) this.f39772b.f33160b;
                                        if (photoViewer3.G3) {
                                            photoViewer3.S0();
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, 300L);
                    } else {
                        imageView.setVisibility(4);
                        photoViewer.f31852u3.setImageDrawable(null);
                        Bitmap bitmap = photoViewer.f31900z3;
                        if (bitmap != null) {
                            bitmap.recycle();
                            photoViewer.f31900z3 = null;
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final ci f39772b;

                    {
                        this.f39772b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                PhotoViewer photoViewer2 = (PhotoViewer) this.f39772b.f33160b;
                                photoViewer2.f31852u3.setVisibility(4);
                                photoViewer2.f31852u3.setImageDrawable(null);
                                Bitmap bitmap2 = photoViewer2.f31900z3;
                                if (bitmap2 != null) {
                                    bitmap2.recycle();
                                    photoViewer2.f31900z3 = null;
                                    return;
                                }
                                return;
                            default:
                                PhotoViewer photoViewer3 = (PhotoViewer) this.f39772b.f33160b;
                                if (photoViewer3.G3) {
                                    photoViewer3.S0();
                                    return;
                                }
                                return;
                        }
                    }
                });
                photoViewer.D3 = 0;
                return true;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.f33160b;
                if (profileActivity.fragmentView != null) {
                    profileActivity.A3();
                    profileActivity.k4(true);
                    profileActivity.fragmentView.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            default:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f33160b;
                int[][] iArr = WallpapersListActivity.f32371h0;
                if (wallpapersListActivity.getParentActivity() != null) {
                    int rotation3 = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (AndroidUtilities.isTablet()) {
                        wallpapersListActivity.O = 3;
                    } else if (rotation3 != 3 && rotation3 != 1) {
                        wallpapersListActivity.O = 3;
                    } else {
                        wallpapersListActivity.O = 5;
                    }
                    wallpapersListActivity.C0();
                }
                org.telegram.ui.Components.rl0 rl0Var2 = ((WallpapersListActivity) this.f33160b).E;
                if (rl0Var2 != null) {
                    rl0Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
        }
    }
}
