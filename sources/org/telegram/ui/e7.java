package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class e7 implements ViewTreeObserver.OnPreDrawListener {
    public final int f46576a;
    public final Object f46577b;

    public e7(Object obj, int i7) {
        this.f46576a = i7;
        this.f46577b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f46576a) {
            case 0:
                t7 t7Var = (t7) this.f46577b;
                FrameLayout frameLayout = t7Var.f51399c;
                if (!t7Var.E) {
                    float max = Math.max(0.0f, t7Var.f51407y - t7Var.getY());
                    if (frameLayout.getTranslationY() != max) {
                        frameLayout.setTranslationY(max);
                    }
                }
                return true;
            case 1:
                ((hi.n5) this.f46577b).invalidate();
                return true;
            case 2:
                View view = ((o50) this.f46577b).fragmentView;
                if (view != null) {
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                    int rotation = ((WindowManager) org.telegram.messenger.t0.f26609b.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (rotation != 3 && rotation != 1) {
                        ((o50) this.f46577b).f49804f.setOrientation(1);
                    } else {
                        ((o50) this.f46577b).f49804f.setOrientation(0);
                    }
                    View view2 = ((o50) this.f46577b).fragmentView;
                    view2.setPadding(view2.getPaddingLeft(), 0, ((o50) this.f46577b).fragmentView.getPaddingRight(), ((o50) this.f46577b).fragmentView.getPaddingBottom());
                }
                return true;
            case 3:
                om0 om0Var = (om0) this.f46577b;
                if (om0Var.getParentActivity() != null) {
                    int rotation2 = ((WindowManager) org.telegram.messenger.t0.f26609b.getSystemService("window")).getDefaultDisplay().getRotation();
                    om0Var.f49998f = 2;
                    if (!org.telegram.messenger.g0.Q1() && (rotation2 == 3 || rotation2 == 1)) {
                        om0Var.f49998f = 4;
                    }
                    om0Var.f49999n.f();
                }
                org.telegram.ui.Components.uj0 uj0Var = ((om0) this.f46577b).h;
                if (uj0Var != null) {
                    uj0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) this.f46577b;
                photoViewer.f42914w3.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = photoViewer.f42924x3;
                if (imageView != null) {
                    if (photoViewer.J3) {
                        org.telegram.messenger.g0.i3(new Runnable(this) {
                            public final e7 f46441b;

                            {
                                this.f46441b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        PhotoViewer photoViewer2 = (PhotoViewer) this.f46441b.f46577b;
                                        photoViewer2.f42924x3.setVisibility(4);
                                        photoViewer2.f42924x3.setImageDrawable(null);
                                        Bitmap bitmap = photoViewer2.C3;
                                        if (bitmap != null) {
                                            bitmap.recycle();
                                            photoViewer2.C3 = null;
                                            return;
                                        }
                                        return;
                                    default:
                                        PhotoViewer photoViewer3 = (PhotoViewer) this.f46441b.f46577b;
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
                        photoViewer.f42924x3.setImageDrawable(null);
                        Bitmap bitmap = photoViewer.C3;
                        if (bitmap != null) {
                            bitmap.recycle();
                            photoViewer.C3 = null;
                        }
                    }
                }
                org.telegram.messenger.g0.h3(new Runnable(this) {
                    public final e7 f46441b;

                    {
                        this.f46441b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                PhotoViewer photoViewer2 = (PhotoViewer) this.f46441b.f46577b;
                                photoViewer2.f42924x3.setVisibility(4);
                                photoViewer2.f42924x3.setImageDrawable(null);
                                Bitmap bitmap2 = photoViewer2.C3;
                                if (bitmap2 != null) {
                                    bitmap2.recycle();
                                    photoViewer2.C3 = null;
                                    return;
                                }
                                return;
                            default:
                                PhotoViewer photoViewer3 = (PhotoViewer) this.f46441b.f46577b;
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
                ProfileActivity profileActivity = (ProfileActivity) this.f46577b;
                if (profileActivity.fragmentView != null) {
                    RectF rectF = ProfileActivity.X6;
                    profileActivity.N3();
                    profileActivity.A4(true);
                    profileActivity.fragmentView.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            default:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f46577b;
                if (wallpapersListActivity.getParentActivity() != null) {
                    int rotation3 = ((WindowManager) org.telegram.messenger.t0.f26609b.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (org.telegram.messenger.g0.Q1()) {
                        wallpapersListActivity.O = 3;
                    } else if (rotation3 != 3 && rotation3 != 1) {
                        wallpapersListActivity.O = 3;
                    } else {
                        wallpapersListActivity.O = 5;
                    }
                    wallpapersListActivity.H0();
                }
                org.telegram.ui.Components.uj0 uj0Var2 = ((WallpapersListActivity) this.f46577b).G;
                if (uj0Var2 != null) {
                    uj0Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
        }
    }
}
