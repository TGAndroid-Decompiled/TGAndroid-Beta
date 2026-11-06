package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class e7 implements ViewTreeObserver.OnPreDrawListener {
    public final int f45216a;
    public final Object f45217b;

    public e7(Object obj, int i7) {
        this.f45216a = i7;
        this.f45217b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f45216a) {
            case 0:
                t7 t7Var = (t7) this.f45217b;
                FrameLayout frameLayout = t7Var.f49965c;
                if (!t7Var.D) {
                    float max = Math.max(0.0f, t7Var.f49973y - t7Var.getY());
                    if (frameLayout.getTranslationY() != max) {
                        frameLayout.setTranslationY(max);
                    }
                }
                return true;
            case 1:
                ((fi.p5) this.f45217b).invalidate();
                return true;
            case 2:
                View view = ((p50) this.f45217b).fragmentView;
                if (view != null) {
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                    int rotation = ((WindowManager) org.telegram.messenger.t0.f25563b.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (rotation != 3 && rotation != 1) {
                        ((p50) this.f45217b).f48649f.setOrientation(1);
                    } else {
                        ((p50) this.f45217b).f48649f.setOrientation(0);
                    }
                    View view2 = ((p50) this.f45217b).fragmentView;
                    view2.setPadding(view2.getPaddingLeft(), 0, ((p50) this.f45217b).fragmentView.getPaddingRight(), ((p50) this.f45217b).fragmentView.getPaddingBottom());
                }
                return true;
            case 3:
                mm0 mm0Var = (mm0) this.f45217b;
                if (mm0Var.getParentActivity() != null) {
                    int rotation2 = ((WindowManager) org.telegram.messenger.t0.f25563b.getSystemService("window")).getDefaultDisplay().getRotation();
                    mm0Var.f47838f = 2;
                    if (!org.telegram.messenger.g0.Q1() && (rotation2 == 3 || rotation2 == 1)) {
                        mm0Var.f47838f = 4;
                    }
                    mm0Var.f47839n.f();
                }
                org.telegram.ui.Components.pj0 pj0Var = ((mm0) this.f45217b).h;
                if (pj0Var != null) {
                    pj0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) this.f45217b;
                photoViewer.f41531v3.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = photoViewer.f41541w3;
                if (imageView != null) {
                    if (photoViewer.I3) {
                        org.telegram.messenger.g0.i3(new Runnable(this) {
                            public final e7 f45395b;

                            {
                                this.f45395b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        PhotoViewer photoViewer2 = (PhotoViewer) this.f45395b.f45217b;
                                        photoViewer2.f41541w3.setVisibility(4);
                                        photoViewer2.f41541w3.setImageDrawable(null);
                                        Bitmap bitmap = photoViewer2.B3;
                                        if (bitmap != null) {
                                            bitmap.recycle();
                                            photoViewer2.B3 = null;
                                            return;
                                        }
                                        return;
                                    default:
                                        PhotoViewer photoViewer3 = (PhotoViewer) this.f45395b.f45217b;
                                        if (photoViewer3.I3) {
                                            photoViewer3.M0();
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, 300L);
                    } else {
                        imageView.setVisibility(4);
                        photoViewer.f41541w3.setImageDrawable(null);
                        Bitmap bitmap = photoViewer.B3;
                        if (bitmap != null) {
                            bitmap.recycle();
                            photoViewer.B3 = null;
                        }
                    }
                }
                org.telegram.messenger.g0.h3(new Runnable(this) {
                    public final e7 f45395b;

                    {
                        this.f45395b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                PhotoViewer photoViewer2 = (PhotoViewer) this.f45395b.f45217b;
                                photoViewer2.f41541w3.setVisibility(4);
                                photoViewer2.f41541w3.setImageDrawable(null);
                                Bitmap bitmap2 = photoViewer2.B3;
                                if (bitmap2 != null) {
                                    bitmap2.recycle();
                                    photoViewer2.B3 = null;
                                    return;
                                }
                                return;
                            default:
                                PhotoViewer photoViewer3 = (PhotoViewer) this.f45395b.f45217b;
                                if (photoViewer3.I3) {
                                    photoViewer3.M0();
                                    return;
                                }
                                return;
                        }
                    }
                });
                photoViewer.F3 = 0;
                return true;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.f45217b;
                if (profileActivity.fragmentView != null) {
                    RectF rectF = ProfileActivity.S6;
                    profileActivity.O3();
                    profileActivity.y4(true);
                    profileActivity.fragmentView.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            default:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f45217b;
                if (wallpapersListActivity.getParentActivity() != null) {
                    int rotation3 = ((WindowManager) org.telegram.messenger.t0.f25563b.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (org.telegram.messenger.g0.Q1()) {
                        wallpapersListActivity.N = 3;
                    } else if (rotation3 != 3 && rotation3 != 1) {
                        wallpapersListActivity.N = 3;
                    } else {
                        wallpapersListActivity.N = 5;
                    }
                    wallpapersListActivity.H0();
                }
                org.telegram.ui.Components.pj0 pj0Var2 = ((WallpapersListActivity) this.f45217b).F;
                if (pj0Var2 != null) {
                    pj0Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
        }
    }
}
