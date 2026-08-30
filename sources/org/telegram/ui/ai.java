package org.telegram.ui;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
public final class ai implements ViewTreeObserver.OnPreDrawListener {
    public final int f32593a;
    public final Object f32594b;

    public ai(Object obj, int i10) {
        this.f32593a = i10;
        this.f32594b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f32593a) {
            case 0:
                xn xnVar = (xn) this.f32594b;
                lj ljVar = xnVar.X0;
                if (ljVar != null) {
                    ljVar.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return xnVar.s8();
            case 1:
                ((eg.i0) this.f32594b).invalidate();
                return true;
            case 2:
                View view = ((o70) this.f32594b).fragmentView;
                if (view != null) {
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                    int rotation = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (rotation != 3 && rotation != 1) {
                        ((o70) this.f32594b).f36805f.setOrientation(1);
                    } else {
                        ((o70) this.f32594b).f36805f.setOrientation(0);
                    }
                    View view2 = ((o70) this.f32594b).fragmentView;
                    view2.setPadding(view2.getPaddingLeft(), 0, ((o70) this.f32594b).fragmentView.getPaddingRight(), ((o70) this.f32594b).fragmentView.getPaddingBottom());
                }
                return true;
            case 3:
                pp0 pp0Var = (pp0) this.f32594b;
                if (pp0Var.getParentActivity() != null) {
                    int rotation2 = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    pp0Var.f37430f = 2;
                    if (!AndroidUtilities.isTablet() && (rotation2 == 3 || rotation2 == 1)) {
                        pp0Var.f37430f = 4;
                    }
                    pp0Var.f37431n.l();
                }
                org.telegram.ui.Components.sl0 sl0Var = ((pp0) this.f32594b).h;
                if (sl0Var != null) {
                    sl0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) this.f32594b;
                photoViewer.f31870t3.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = photoViewer.f31878u3;
                if (imageView != null) {
                    if (photoViewer.G3) {
                        AndroidUtilities.runOnUIThread(new Runnable(this) {
                            public final ai f37539b;

                            {
                                this.f37539b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        PhotoViewer photoViewer2 = (PhotoViewer) this.f37539b.f32594b;
                                        photoViewer2.f31878u3.setVisibility(4);
                                        photoViewer2.f31878u3.setImageDrawable(null);
                                        Bitmap bitmap = photoViewer2.f31926z3;
                                        if (bitmap != null) {
                                            bitmap.recycle();
                                            photoViewer2.f31926z3 = null;
                                            return;
                                        }
                                        return;
                                    default:
                                        PhotoViewer photoViewer3 = (PhotoViewer) this.f37539b.f32594b;
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
                        photoViewer.f31878u3.setImageDrawable(null);
                        Bitmap bitmap = photoViewer.f31926z3;
                        if (bitmap != null) {
                            bitmap.recycle();
                            photoViewer.f31926z3 = null;
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final ai f37539b;

                    {
                        this.f37539b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                PhotoViewer photoViewer2 = (PhotoViewer) this.f37539b.f32594b;
                                photoViewer2.f31878u3.setVisibility(4);
                                photoViewer2.f31878u3.setImageDrawable(null);
                                Bitmap bitmap2 = photoViewer2.f31926z3;
                                if (bitmap2 != null) {
                                    bitmap2.recycle();
                                    photoViewer2.f31926z3 = null;
                                    return;
                                }
                                return;
                            default:
                                PhotoViewer photoViewer3 = (PhotoViewer) this.f37539b.f32594b;
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
                ProfileActivity profileActivity = (ProfileActivity) this.f32594b;
                if (profileActivity.fragmentView != null) {
                    profileActivity.A3();
                    profileActivity.k4(true);
                    profileActivity.fragmentView.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            default:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f32594b;
                int[][] iArr = WallpapersListActivity.f32397h0;
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
                org.telegram.ui.Components.sl0 sl0Var2 = ((WallpapersListActivity) this.f32594b).E;
                if (sl0Var2 != null) {
                    sl0Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
        }
    }
}
