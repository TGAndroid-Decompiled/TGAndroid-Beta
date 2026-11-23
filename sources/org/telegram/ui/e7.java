package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class e7 implements ViewTreeObserver.OnPreDrawListener {
    public final int f47461a;
    public final Object f47462b;

    public e7(Object obj, int i7) {
        this.f47461a = i7;
        this.f47462b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f47461a) {
            case 0:
                t7 t7Var = (t7) this.f47462b;
                FrameLayout frameLayout = t7Var.f52276c;
                if (!t7Var.E) {
                    float max = Math.max(0.0f, t7Var.f52284y - t7Var.getY());
                    if (frameLayout.getTranslationY() != max) {
                        frameLayout.setTranslationY(max);
                    }
                }
                return true;
            case 1:
                ((hi.w5) this.f47462b).invalidate();
                return true;
            case 2:
                View view = ((q50) this.f47462b).fragmentView;
                if (view != null) {
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                    int rotation = ((WindowManager) org.telegram.messenger.t0.f27013b.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (rotation != 3 && rotation != 1) {
                        ((q50) this.f47462b).f51326f.setOrientation(1);
                    } else {
                        ((q50) this.f47462b).f51326f.setOrientation(0);
                    }
                    View view2 = ((q50) this.f47462b).fragmentView;
                    view2.setPadding(view2.getPaddingLeft(), 0, ((q50) this.f47462b).fragmentView.getPaddingRight(), ((q50) this.f47462b).fragmentView.getPaddingBottom());
                }
                return true;
            case 3:
                om0 om0Var = (om0) this.f47462b;
                if (om0Var.getParentActivity() != null) {
                    int rotation2 = ((WindowManager) org.telegram.messenger.t0.f27013b.getSystemService("window")).getDefaultDisplay().getRotation();
                    om0Var.f50721f = 2;
                    if (!org.telegram.messenger.g0.Q1() && (rotation2 == 3 || rotation2 == 1)) {
                        om0Var.f50721f = 4;
                    }
                    om0Var.f50722n.f();
                }
                org.telegram.ui.Components.ek0 ek0Var = ((om0) this.f47462b).h;
                if (ek0Var != null) {
                    ek0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) this.f47462b;
                photoViewer.f43485w3.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = photoViewer.f43495x3;
                if (imageView != null) {
                    if (photoViewer.J3) {
                        org.telegram.messenger.g0.h3(new Runnable(this) {
                            public final e7 f47946b;

                            {
                                this.f47946b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        PhotoViewer photoViewer2 = (PhotoViewer) this.f47946b.f47462b;
                                        photoViewer2.f43495x3.setVisibility(4);
                                        photoViewer2.f43495x3.setImageDrawable(null);
                                        Bitmap bitmap = photoViewer2.C3;
                                        if (bitmap != null) {
                                            bitmap.recycle();
                                            photoViewer2.C3 = null;
                                            return;
                                        }
                                        return;
                                    default:
                                        PhotoViewer photoViewer3 = (PhotoViewer) this.f47946b.f47462b;
                                        if (photoViewer3.J3) {
                                            photoViewer3.M0();
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, 300L);
                    } else {
                        imageView.setVisibility(4);
                        photoViewer.f43495x3.setImageDrawable(null);
                        Bitmap bitmap = photoViewer.C3;
                        if (bitmap != null) {
                            bitmap.recycle();
                            photoViewer.C3 = null;
                        }
                    }
                }
                org.telegram.messenger.g0.g3(new Runnable(this) {
                    public final e7 f47946b;

                    {
                        this.f47946b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                PhotoViewer photoViewer2 = (PhotoViewer) this.f47946b.f47462b;
                                photoViewer2.f43495x3.setVisibility(4);
                                photoViewer2.f43495x3.setImageDrawable(null);
                                Bitmap bitmap2 = photoViewer2.C3;
                                if (bitmap2 != null) {
                                    bitmap2.recycle();
                                    photoViewer2.C3 = null;
                                    return;
                                }
                                return;
                            default:
                                PhotoViewer photoViewer3 = (PhotoViewer) this.f47946b.f47462b;
                                if (photoViewer3.J3) {
                                    photoViewer3.M0();
                                    return;
                                }
                                return;
                        }
                    }
                });
                photoViewer.G3 = 0;
                return true;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.f47462b;
                if (profileActivity.fragmentView != null) {
                    RectF rectF = ProfileActivity.Z6;
                    profileActivity.O3();
                    profileActivity.B4(true);
                    profileActivity.fragmentView.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            default:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f47462b;
                if (wallpapersListActivity.getParentActivity() != null) {
                    int rotation3 = ((WindowManager) org.telegram.messenger.t0.f27013b.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (org.telegram.messenger.g0.Q1()) {
                        wallpapersListActivity.O = 3;
                    } else if (rotation3 != 3 && rotation3 != 1) {
                        wallpapersListActivity.O = 3;
                    } else {
                        wallpapersListActivity.O = 5;
                    }
                    wallpapersListActivity.H0();
                }
                org.telegram.ui.Components.ek0 ek0Var2 = ((WallpapersListActivity) this.f47462b).G;
                if (ek0Var2 != null) {
                    ek0Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
        }
    }
}
