package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class f7 implements ViewTreeObserver.OnPreDrawListener {
    public final int f45171a;
    public final Object f45172b;

    public f7(Object obj, int i3) {
        this.f45171a = i3;
        this.f45172b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f45171a) {
            case 0:
                u7 u7Var = (u7) this.f45172b;
                FrameLayout frameLayout = u7Var.f49998c;
                if (!u7Var.E) {
                    float max = Math.max(0.0f, u7Var.f50006y - u7Var.getY());
                    if (frameLayout.getTranslationY() != max) {
                        frameLayout.setTranslationY(max);
                    }
                }
                return true;
            case 1:
                ((gi.n5) this.f45172b).invalidate();
                return true;
            case 2:
                View view = ((j50) this.f45172b).fragmentView;
                if (view != null) {
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                    int rotation = ((WindowManager) org.telegram.messenger.t0.f25457b.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (rotation != 3 && rotation != 1) {
                        ((j50) this.f45172b).f46502f.setOrientation(1);
                    } else {
                        ((j50) this.f45172b).f46502f.setOrientation(0);
                    }
                    View view2 = ((j50) this.f45172b).fragmentView;
                    view2.setPadding(view2.getPaddingLeft(), 0, ((j50) this.f45172b).fragmentView.getPaddingRight(), ((j50) this.f45172b).fragmentView.getPaddingBottom());
                }
                return true;
            case 3:
                hm0 hm0Var = (hm0) this.f45172b;
                if (hm0Var.getParentActivity() != null) {
                    int rotation2 = ((WindowManager) org.telegram.messenger.t0.f25457b.getSystemService("window")).getDefaultDisplay().getRotation();
                    hm0Var.f45939f = 2;
                    if (!org.telegram.messenger.g0.Q1() && (rotation2 == 3 || rotation2 == 1)) {
                        hm0Var.f45939f = 4;
                    }
                    hm0Var.f45940n.f();
                }
                org.telegram.ui.Components.tj0 tj0Var = ((hm0) this.f45172b).h;
                if (tj0Var != null) {
                    tj0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) this.f45172b;
                photoViewer.f41581x3.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = photoViewer.f41591y3;
                if (imageView != null) {
                    if (photoViewer.K3) {
                        org.telegram.messenger.g0.i3(new Runnable(this) {
                            public final f7 f50577b;

                            {
                                this.f50577b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        PhotoViewer photoViewer2 = (PhotoViewer) this.f50577b.f45172b;
                                        photoViewer2.f41591y3.setVisibility(4);
                                        photoViewer2.f41591y3.setImageDrawable(null);
                                        Bitmap bitmap = photoViewer2.D3;
                                        if (bitmap != null) {
                                            bitmap.recycle();
                                            photoViewer2.D3 = null;
                                            return;
                                        }
                                        return;
                                    default:
                                        PhotoViewer photoViewer3 = (PhotoViewer) this.f50577b.f45172b;
                                        if (photoViewer3.K3) {
                                            photoViewer3.T0();
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, 300L);
                    } else {
                        imageView.setVisibility(4);
                        photoViewer.f41591y3.setImageDrawable(null);
                        Bitmap bitmap = photoViewer.D3;
                        if (bitmap != null) {
                            bitmap.recycle();
                            photoViewer.D3 = null;
                        }
                    }
                }
                org.telegram.messenger.g0.h3(new Runnable(this) {
                    public final f7 f50577b;

                    {
                        this.f50577b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                PhotoViewer photoViewer2 = (PhotoViewer) this.f50577b.f45172b;
                                photoViewer2.f41591y3.setVisibility(4);
                                photoViewer2.f41591y3.setImageDrawable(null);
                                Bitmap bitmap2 = photoViewer2.D3;
                                if (bitmap2 != null) {
                                    bitmap2.recycle();
                                    photoViewer2.D3 = null;
                                    return;
                                }
                                return;
                            default:
                                PhotoViewer photoViewer3 = (PhotoViewer) this.f50577b.f45172b;
                                if (photoViewer3.K3) {
                                    photoViewer3.T0();
                                    return;
                                }
                                return;
                        }
                    }
                });
                photoViewer.H3 = 0;
                return true;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.f45172b;
                if (profileActivity.fragmentView != null) {
                    RectF rectF = ProfileActivity.T6;
                    profileActivity.O3();
                    profileActivity.y4(true);
                    profileActivity.fragmentView.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            default:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f45172b;
                if (wallpapersListActivity.getParentActivity() != null) {
                    int rotation3 = ((WindowManager) org.telegram.messenger.t0.f25457b.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (org.telegram.messenger.g0.Q1()) {
                        wallpapersListActivity.O = 3;
                    } else if (rotation3 != 3 && rotation3 != 1) {
                        wallpapersListActivity.O = 3;
                    } else {
                        wallpapersListActivity.O = 5;
                    }
                    wallpapersListActivity.H0();
                }
                org.telegram.ui.Components.tj0 tj0Var2 = ((WallpapersListActivity) this.f45172b).G;
                if (tj0Var2 != null) {
                    tj0Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
        }
    }
}
