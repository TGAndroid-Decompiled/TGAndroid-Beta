package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class e7 implements ViewTreeObserver.OnPreDrawListener {
    public final int f45309a;
    public final Object f45310b;

    public e7(Object obj, int i7) {
        this.f45309a = i7;
        this.f45310b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f45309a) {
            case 0:
                t7 t7Var = (t7) this.f45310b;
                FrameLayout frameLayout = t7Var.f50100c;
                if (!t7Var.D) {
                    float max = Math.max(0.0f, t7Var.f50108y - t7Var.getY());
                    if (frameLayout.getTranslationY() != max) {
                        frameLayout.setTranslationY(max);
                    }
                }
                return true;
            case 1:
                ((fi.p5) this.f45310b).invalidate();
                return true;
            case 2:
                View view = ((r50) this.f45310b).fragmentView;
                if (view != null) {
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                    int rotation = ((WindowManager) org.telegram.messenger.t0.f25566b.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (rotation != 3 && rotation != 1) {
                        ((r50) this.f45310b).f49282f.setOrientation(1);
                    } else {
                        ((r50) this.f45310b).f49282f.setOrientation(0);
                    }
                    View view2 = ((r50) this.f45310b).fragmentView;
                    view2.setPadding(view2.getPaddingLeft(), 0, ((r50) this.f45310b).fragmentView.getPaddingRight(), ((r50) this.f45310b).fragmentView.getPaddingBottom());
                }
                return true;
            case 3:
                om0 om0Var = (om0) this.f45310b;
                if (om0Var.getParentActivity() != null) {
                    int rotation2 = ((WindowManager) org.telegram.messenger.t0.f25566b.getSystemService("window")).getDefaultDisplay().getRotation();
                    om0Var.f48479f = 2;
                    if (!org.telegram.messenger.g0.Q1() && (rotation2 == 3 || rotation2 == 1)) {
                        om0Var.f48479f = 4;
                    }
                    om0Var.f48480n.f();
                }
                org.telegram.ui.Components.qj0 qj0Var = ((om0) this.f45310b).h;
                if (qj0Var != null) {
                    qj0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) this.f45310b;
                photoViewer.f41542v3.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = photoViewer.f41552w3;
                if (imageView != null) {
                    if (photoViewer.I3) {
                        org.telegram.messenger.g0.i3(new Runnable(this) {
                            public final e7 f46054b;

                            {
                                this.f46054b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        PhotoViewer photoViewer2 = (PhotoViewer) this.f46054b.f45310b;
                                        photoViewer2.f41552w3.setVisibility(4);
                                        photoViewer2.f41552w3.setImageDrawable(null);
                                        Bitmap bitmap = photoViewer2.B3;
                                        if (bitmap != null) {
                                            bitmap.recycle();
                                            photoViewer2.B3 = null;
                                            return;
                                        }
                                        return;
                                    default:
                                        PhotoViewer photoViewer3 = (PhotoViewer) this.f46054b.f45310b;
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
                        photoViewer.f41552w3.setImageDrawable(null);
                        Bitmap bitmap = photoViewer.B3;
                        if (bitmap != null) {
                            bitmap.recycle();
                            photoViewer.B3 = null;
                        }
                    }
                }
                org.telegram.messenger.g0.h3(new Runnable(this) {
                    public final e7 f46054b;

                    {
                        this.f46054b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                PhotoViewer photoViewer2 = (PhotoViewer) this.f46054b.f45310b;
                                photoViewer2.f41552w3.setVisibility(4);
                                photoViewer2.f41552w3.setImageDrawable(null);
                                Bitmap bitmap2 = photoViewer2.B3;
                                if (bitmap2 != null) {
                                    bitmap2.recycle();
                                    photoViewer2.B3 = null;
                                    return;
                                }
                                return;
                            default:
                                PhotoViewer photoViewer3 = (PhotoViewer) this.f46054b.f45310b;
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
                ProfileActivity profileActivity = (ProfileActivity) this.f45310b;
                if (profileActivity.fragmentView != null) {
                    RectF rectF = ProfileActivity.V6;
                    profileActivity.O3();
                    profileActivity.B4(true);
                    profileActivity.fragmentView.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            default:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f45310b;
                if (wallpapersListActivity.getParentActivity() != null) {
                    int rotation3 = ((WindowManager) org.telegram.messenger.t0.f25566b.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (org.telegram.messenger.g0.Q1()) {
                        wallpapersListActivity.N = 3;
                    } else if (rotation3 != 3 && rotation3 != 1) {
                        wallpapersListActivity.N = 3;
                    } else {
                        wallpapersListActivity.N = 5;
                    }
                    wallpapersListActivity.H0();
                }
                org.telegram.ui.Components.qj0 qj0Var2 = ((WallpapersListActivity) this.f45310b).F;
                if (qj0Var2 != null) {
                    qj0Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
        }
    }
}
