package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class d7 implements ViewTreeObserver.OnPreDrawListener {
    public final int f46850a;
    public final Object f46851b;

    public d7(Object obj, int i7) {
        this.f46850a = i7;
        this.f46851b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f46850a) {
            case 0:
                s7 s7Var = (s7) this.f46851b;
                FrameLayout frameLayout = s7Var.f51919c;
                if (!s7Var.E) {
                    float max = Math.max(0.0f, s7Var.f51927y - s7Var.getY());
                    if (frameLayout.getTranslationY() != max) {
                        frameLayout.setTranslationY(max);
                    }
                }
                return true;
            case 1:
                ((hi.m5) this.f46851b).invalidate();
                return true;
            case 2:
                View view = ((q50) this.f46851b).fragmentView;
                if (view != null) {
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                    int rotation = ((WindowManager) org.telegram.messenger.t0.f26915b.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (rotation != 3 && rotation != 1) {
                        ((q50) this.f46851b).f51106f.setOrientation(1);
                    } else {
                        ((q50) this.f46851b).f51106f.setOrientation(0);
                    }
                    View view2 = ((q50) this.f46851b).fragmentView;
                    view2.setPadding(view2.getPaddingLeft(), 0, ((q50) this.f46851b).fragmentView.getPaddingRight(), ((q50) this.f46851b).fragmentView.getPaddingBottom());
                }
                return true;
            case 3:
                qm0 qm0Var = (qm0) this.f46851b;
                if (qm0Var.getParentActivity() != null) {
                    int rotation2 = ((WindowManager) org.telegram.messenger.t0.f26915b.getSystemService("window")).getDefaultDisplay().getRotation();
                    qm0Var.f51289f = 2;
                    if (!org.telegram.messenger.g0.Q1() && (rotation2 == 3 || rotation2 == 1)) {
                        qm0Var.f51289f = 4;
                    }
                    qm0Var.f51290n.f();
                }
                org.telegram.ui.Components.ck0 ck0Var = ((qm0) this.f46851b).h;
                if (ck0Var != null) {
                    ck0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) this.f46851b;
                photoViewer.f43359w3.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = photoViewer.f43369x3;
                if (imageView != null) {
                    if (photoViewer.J3) {
                        org.telegram.messenger.g0.h3(new Runnable(this) {
                            public final d7 f47779b;

                            {
                                this.f47779b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        PhotoViewer photoViewer2 = (PhotoViewer) this.f47779b.f46851b;
                                        photoViewer2.f43369x3.setVisibility(4);
                                        photoViewer2.f43369x3.setImageDrawable(null);
                                        Bitmap bitmap = photoViewer2.C3;
                                        if (bitmap != null) {
                                            bitmap.recycle();
                                            photoViewer2.C3 = null;
                                            return;
                                        }
                                        return;
                                    default:
                                        PhotoViewer photoViewer3 = (PhotoViewer) this.f47779b.f46851b;
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
                        photoViewer.f43369x3.setImageDrawable(null);
                        Bitmap bitmap = photoViewer.C3;
                        if (bitmap != null) {
                            bitmap.recycle();
                            photoViewer.C3 = null;
                        }
                    }
                }
                org.telegram.messenger.g0.g3(new Runnable(this) {
                    public final d7 f47779b;

                    {
                        this.f47779b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                PhotoViewer photoViewer2 = (PhotoViewer) this.f47779b.f46851b;
                                photoViewer2.f43369x3.setVisibility(4);
                                photoViewer2.f43369x3.setImageDrawable(null);
                                Bitmap bitmap2 = photoViewer2.C3;
                                if (bitmap2 != null) {
                                    bitmap2.recycle();
                                    photoViewer2.C3 = null;
                                    return;
                                }
                                return;
                            default:
                                PhotoViewer photoViewer3 = (PhotoViewer) this.f47779b.f46851b;
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
                ProfileActivity profileActivity = (ProfileActivity) this.f46851b;
                if (profileActivity.fragmentView != null) {
                    RectF rectF = ProfileActivity.Z6;
                    profileActivity.O3();
                    profileActivity.B4(true);
                    profileActivity.fragmentView.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            default:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f46851b;
                if (wallpapersListActivity.getParentActivity() != null) {
                    int rotation3 = ((WindowManager) org.telegram.messenger.t0.f26915b.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (org.telegram.messenger.g0.Q1()) {
                        wallpapersListActivity.O = 3;
                    } else if (rotation3 != 3 && rotation3 != 1) {
                        wallpapersListActivity.O = 3;
                    } else {
                        wallpapersListActivity.O = 5;
                    }
                    wallpapersListActivity.H0();
                }
                org.telegram.ui.Components.ck0 ck0Var2 = ((WallpapersListActivity) this.f46851b).G;
                if (ck0Var2 != null) {
                    ck0Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
        }
    }
}
