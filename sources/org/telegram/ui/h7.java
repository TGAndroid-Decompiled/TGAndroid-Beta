package org.telegram.ui;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
public final class h7 implements ViewTreeObserver.OnPreDrawListener {
    public final int f34147a;
    public final Object f34148b;

    public h7(Object obj, int i10) {
        this.f34147a = i10;
        this.f34148b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f34147a) {
            case 0:
                v7 v7Var = (v7) this.f34148b;
                FrameLayout frameLayout = v7Var.f38464b;
                if (!v7Var.f38471x) {
                    float max = Math.max(0.0f, v7Var.f38470w - v7Var.getY());
                    if (frameLayout.getTranslationY() != max) {
                        frameLayout.setTranslationY(max);
                    }
                }
                return true;
            case 1:
                xn xnVar = (xn) this.f34148b;
                oj ojVar = xnVar.f39690a1;
                if (ojVar != null) {
                    ojVar.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return xnVar.s8();
            case 2:
                ((ci.r6) this.f34148b).invalidate();
                return true;
            case 3:
                View view = ((u70) this.f34148b).fragmentView;
                if (view != null) {
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                    int rotation = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (rotation != 3 && rotation != 1) {
                        ((u70) this.f34148b).f38141f.setOrientation(1);
                    } else {
                        ((u70) this.f34148b).f38141f.setOrientation(0);
                    }
                    View view2 = ((u70) this.f34148b).fragmentView;
                    view2.setPadding(view2.getPaddingLeft(), 0, ((u70) this.f34148b).fragmentView.getPaddingRight(), ((u70) this.f34148b).fragmentView.getPaddingBottom());
                }
                return true;
            case 4:
                fq0 fq0Var = (fq0) this.f34148b;
                if (fq0Var.getParentActivity() != null) {
                    int rotation2 = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    fq0Var.f33610f = 2;
                    if (!AndroidUtilities.isTablet() && (rotation2 == 3 || rotation2 == 1)) {
                        fq0Var.f33610f = 4;
                    }
                    fq0Var.f33611n.l();
                }
                org.telegram.ui.Components.yl0 yl0Var = ((fq0) this.f34148b).h;
                if (yl0Var != null) {
                    yl0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            case 5:
                PhotoViewer photoViewer = (PhotoViewer) this.f34148b;
                photoViewer.f31387w3.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = photoViewer.f31397x3;
                if (imageView != null) {
                    if (photoViewer.J3) {
                        AndroidUtilities.runOnUIThread(new Runnable(this) {
                            public final h7 f33635b;

                            {
                                this.f33635b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        PhotoViewer photoViewer2 = (PhotoViewer) this.f33635b.f34148b;
                                        photoViewer2.f31397x3.setVisibility(4);
                                        photoViewer2.f31397x3.setImageDrawable(null);
                                        Bitmap bitmap = photoViewer2.C3;
                                        if (bitmap != null) {
                                            bitmap.recycle();
                                            photoViewer2.C3 = null;
                                            return;
                                        }
                                        return;
                                    default:
                                        PhotoViewer photoViewer3 = (PhotoViewer) this.f33635b.f34148b;
                                        if (photoViewer3.J3) {
                                            photoViewer3.S0();
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, 300L);
                    } else {
                        imageView.setVisibility(4);
                        photoViewer.f31397x3.setImageDrawable(null);
                        Bitmap bitmap = photoViewer.C3;
                        if (bitmap != null) {
                            bitmap.recycle();
                            photoViewer.C3 = null;
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final h7 f33635b;

                    {
                        this.f33635b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                PhotoViewer photoViewer2 = (PhotoViewer) this.f33635b.f34148b;
                                photoViewer2.f31397x3.setVisibility(4);
                                photoViewer2.f31397x3.setImageDrawable(null);
                                Bitmap bitmap2 = photoViewer2.C3;
                                if (bitmap2 != null) {
                                    bitmap2.recycle();
                                    photoViewer2.C3 = null;
                                    return;
                                }
                                return;
                            default:
                                PhotoViewer photoViewer3 = (PhotoViewer) this.f33635b.f34148b;
                                if (photoViewer3.J3) {
                                    photoViewer3.S0();
                                    return;
                                }
                                return;
                        }
                    }
                });
                photoViewer.G3 = 0;
                return true;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) this.f34148b;
                if (profileActivity.fragmentView != null) {
                    profileActivity.A3();
                    profileActivity.k4(true);
                    profileActivity.fragmentView.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            default:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f34148b;
                int[][] iArr = WallpapersListActivity.f31906i0;
                if (wallpapersListActivity.getParentActivity() != null) {
                    int rotation3 = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (AndroidUtilities.isTablet()) {
                        wallpapersListActivity.P = 3;
                    } else if (rotation3 != 3 && rotation3 != 1) {
                        wallpapersListActivity.P = 3;
                    } else {
                        wallpapersListActivity.P = 5;
                    }
                    wallpapersListActivity.C0();
                }
                org.telegram.ui.Components.yl0 yl0Var2 = ((WallpapersListActivity) this.f34148b).F;
                if (yl0Var2 != null) {
                    yl0Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
        }
    }
}
