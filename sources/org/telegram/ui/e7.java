package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class e7 implements ViewTreeObserver.OnPreDrawListener {
    public final int f45179a;
    public final Object f45180b;

    public e7(Object obj, int i7) {
        this.f45179a = i7;
        this.f45180b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f45179a) {
            case 0:
                t7 t7Var = (t7) this.f45180b;
                FrameLayout frameLayout = t7Var.f50153c;
                if (!t7Var.D) {
                    float max = Math.max(0.0f, t7Var.f50161y - t7Var.getY());
                    if (frameLayout.getTranslationY() != max) {
                        frameLayout.setTranslationY(max);
                    }
                }
                return true;
            case 1:
                ((fi.p5) this.f45180b).invalidate();
                return true;
            case 2:
                View view = ((s50) this.f45180b).fragmentView;
                if (view != null) {
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                    int rotation = ((WindowManager) org.telegram.messenger.t0.f25570b.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (rotation != 3 && rotation != 1) {
                        ((s50) this.f45180b).f49674f.setOrientation(1);
                    } else {
                        ((s50) this.f45180b).f49674f.setOrientation(0);
                    }
                    View view2 = ((s50) this.f45180b).fragmentView;
                    view2.setPadding(view2.getPaddingLeft(), 0, ((s50) this.f45180b).fragmentView.getPaddingRight(), ((s50) this.f45180b).fragmentView.getPaddingBottom());
                }
                return true;
            case 3:
                pm0 pm0Var = (pm0) this.f45180b;
                if (pm0Var.getParentActivity() != null) {
                    int rotation2 = ((WindowManager) org.telegram.messenger.t0.f25570b.getSystemService("window")).getDefaultDisplay().getRotation();
                    pm0Var.f48797f = 2;
                    if (!org.telegram.messenger.g0.Q1() && (rotation2 == 3 || rotation2 == 1)) {
                        pm0Var.f48797f = 4;
                    }
                    pm0Var.f48798n.f();
                }
                org.telegram.ui.Components.pj0 pj0Var = ((pm0) this.f45180b).h;
                if (pj0Var != null) {
                    pj0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) this.f45180b;
                photoViewer.f41533v3.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = photoViewer.f41543w3;
                if (imageView != null) {
                    if (photoViewer.I3) {
                        org.telegram.messenger.g0.i3(new Runnable(this) {
                            public final e7 f46409b;

                            {
                                this.f46409b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        PhotoViewer photoViewer2 = (PhotoViewer) this.f46409b.f45180b;
                                        photoViewer2.f41543w3.setVisibility(4);
                                        photoViewer2.f41543w3.setImageDrawable(null);
                                        Bitmap bitmap = photoViewer2.B3;
                                        if (bitmap != null) {
                                            bitmap.recycle();
                                            photoViewer2.B3 = null;
                                            return;
                                        }
                                        return;
                                    default:
                                        PhotoViewer photoViewer3 = (PhotoViewer) this.f46409b.f45180b;
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
                        photoViewer.f41543w3.setImageDrawable(null);
                        Bitmap bitmap = photoViewer.B3;
                        if (bitmap != null) {
                            bitmap.recycle();
                            photoViewer.B3 = null;
                        }
                    }
                }
                org.telegram.messenger.g0.h3(new Runnable(this) {
                    public final e7 f46409b;

                    {
                        this.f46409b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                PhotoViewer photoViewer2 = (PhotoViewer) this.f46409b.f45180b;
                                photoViewer2.f41543w3.setVisibility(4);
                                photoViewer2.f41543w3.setImageDrawable(null);
                                Bitmap bitmap2 = photoViewer2.B3;
                                if (bitmap2 != null) {
                                    bitmap2.recycle();
                                    photoViewer2.B3 = null;
                                    return;
                                }
                                return;
                            default:
                                PhotoViewer photoViewer3 = (PhotoViewer) this.f46409b.f45180b;
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
                ProfileActivity profileActivity = (ProfileActivity) this.f45180b;
                if (profileActivity.fragmentView != null) {
                    RectF rectF = ProfileActivity.V6;
                    profileActivity.O3();
                    profileActivity.B4(true);
                    profileActivity.fragmentView.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            default:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f45180b;
                if (wallpapersListActivity.getParentActivity() != null) {
                    int rotation3 = ((WindowManager) org.telegram.messenger.t0.f25570b.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (org.telegram.messenger.g0.Q1()) {
                        wallpapersListActivity.N = 3;
                    } else if (rotation3 != 3 && rotation3 != 1) {
                        wallpapersListActivity.N = 3;
                    } else {
                        wallpapersListActivity.N = 5;
                    }
                    wallpapersListActivity.H0();
                }
                org.telegram.ui.Components.pj0 pj0Var2 = ((WallpapersListActivity) this.f45180b).F;
                if (pj0Var2 != null) {
                    pj0Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
        }
    }
}
