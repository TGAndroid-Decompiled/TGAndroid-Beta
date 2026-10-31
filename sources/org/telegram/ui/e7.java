package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class e7 implements ViewTreeObserver.OnPreDrawListener {
    public final int f36966a;
    public final Object f36967b;

    public e7(Object obj, int i10) {
        this.f36966a = i10;
        this.f36967b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f36966a) {
            case 0:
                t7 t7Var = (t7) this.f36967b;
                FrameLayout frameLayout = t7Var.f41749c;
                if (!t7Var.D) {
                    float max = Math.max(0.0f, t7Var.f41756y - t7Var.getY());
                    if (frameLayout.getTranslationY() != max) {
                        frameLayout.setTranslationY(max);
                    }
                }
                return true;
            case 1:
                ((kg.f0) this.f36967b).invalidate();
                return true;
            case 2:
                View view = ((n60) this.f36967b).fragmentView;
                if (view != null) {
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                    int rotation = ((WindowManager) org.telegram.messenger.w0.f19025b.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (rotation != 3 && rotation != 1) {
                        ((n60) this.f36967b).f39838f.setOrientation(1);
                    } else {
                        ((n60) this.f36967b).f39838f.setOrientation(0);
                    }
                    View view2 = ((n60) this.f36967b).fragmentView;
                    view2.setPadding(view2.getPaddingLeft(), 0, ((n60) this.f36967b).fragmentView.getPaddingRight(), ((n60) this.f36967b).fragmentView.getPaddingBottom());
                }
                return true;
            case 3:
                yn0 yn0Var = (yn0) this.f36967b;
                if (yn0Var.getParentActivity() != null) {
                    int rotation2 = ((WindowManager) org.telegram.messenger.w0.f19025b.getSystemService("window")).getDefaultDisplay().getRotation();
                    yn0Var.f43867f = 2;
                    if (!org.telegram.messenger.i0.Q1() && (rotation2 == 3 || rotation2 == 1)) {
                        yn0Var.f43867f = 4;
                    }
                    yn0Var.f43868n.f();
                }
                org.telegram.ui.Components.tk0 tk0Var = ((yn0) this.f36967b).h;
                if (tk0Var != null) {
                    tk0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) this.f36967b;
                photoViewer.f33633w3.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = photoViewer.f33643x3;
                if (imageView != null) {
                    if (photoViewer.J3) {
                        org.telegram.messenger.i0.h3(new Runnable(this) {
                            public final e7 f40779b;

                            {
                                this.f40779b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        PhotoViewer photoViewer2 = (PhotoViewer) this.f40779b.f36967b;
                                        photoViewer2.f33643x3.setVisibility(4);
                                        photoViewer2.f33643x3.setImageDrawable(null);
                                        Bitmap bitmap = photoViewer2.C3;
                                        if (bitmap != null) {
                                            bitmap.recycle();
                                            photoViewer2.C3 = null;
                                            return;
                                        }
                                        return;
                                    default:
                                        PhotoViewer photoViewer3 = (PhotoViewer) this.f40779b.f36967b;
                                        if (photoViewer3.J3) {
                                            photoViewer3.T0();
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, 300L);
                    } else {
                        imageView.setVisibility(4);
                        photoViewer.f33643x3.setImageDrawable(null);
                        Bitmap bitmap = photoViewer.C3;
                        if (bitmap != null) {
                            bitmap.recycle();
                            photoViewer.C3 = null;
                        }
                    }
                }
                org.telegram.messenger.i0.g3(new Runnable(this) {
                    public final e7 f40779b;

                    {
                        this.f40779b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                PhotoViewer photoViewer2 = (PhotoViewer) this.f40779b.f36967b;
                                photoViewer2.f33643x3.setVisibility(4);
                                photoViewer2.f33643x3.setImageDrawable(null);
                                Bitmap bitmap2 = photoViewer2.C3;
                                if (bitmap2 != null) {
                                    bitmap2.recycle();
                                    photoViewer2.C3 = null;
                                    return;
                                }
                                return;
                            default:
                                PhotoViewer photoViewer3 = (PhotoViewer) this.f40779b.f36967b;
                                if (photoViewer3.J3) {
                                    photoViewer3.T0();
                                    return;
                                }
                                return;
                        }
                    }
                });
                photoViewer.G3 = 0;
                return true;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.f36967b;
                if (profileActivity.fragmentView != null) {
                    RectF rectF = ProfileActivity.R6;
                    profileActivity.N3();
                    profileActivity.x4(true);
                    profileActivity.fragmentView.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            default:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f36967b;
                if (wallpapersListActivity.getParentActivity() != null) {
                    int rotation3 = ((WindowManager) org.telegram.messenger.w0.f19025b.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (org.telegram.messenger.i0.Q1()) {
                        wallpapersListActivity.N = 3;
                    } else if (rotation3 != 3 && rotation3 != 1) {
                        wallpapersListActivity.N = 3;
                    } else {
                        wallpapersListActivity.N = 5;
                    }
                    wallpapersListActivity.G0();
                }
                org.telegram.ui.Components.tk0 tk0Var2 = ((WallpapersListActivity) this.f36967b).F;
                if (tk0Var2 != null) {
                    tk0Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
        }
    }
}
