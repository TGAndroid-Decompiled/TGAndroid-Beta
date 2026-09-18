package org.telegram.ui;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
public final class f7 implements ViewTreeObserver.OnPreDrawListener {
    public final int f33454a;
    public final Object f33455b;

    public f7(Object obj, int i10) {
        this.f33454a = i10;
        this.f33455b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f33454a) {
            case 0:
                t7 t7Var = (t7) this.f33455b;
                FrameLayout frameLayout = t7Var.f37587b;
                if (!t7Var.f37594x) {
                    float max = Math.max(0.0f, t7Var.f37593w - t7Var.getY());
                    if (frameLayout.getTranslationY() != max) {
                        frameLayout.setTranslationY(max);
                    }
                }
                return true;
            case 1:
                zn znVar = (zn) this.f33455b;
                oj ojVar = znVar.f40201a1;
                if (ojVar != null) {
                    ojVar.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return znVar.s8();
            case 2:
                ((ci.s6) this.f33455b).invalidate();
                return true;
            case 3:
                View view = ((w70) this.f33455b).fragmentView;
                if (view != null) {
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                    int rotation = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (rotation != 3 && rotation != 1) {
                        ((w70) this.f33455b).f38710f.setOrientation(1);
                    } else {
                        ((w70) this.f33455b).f38710f.setOrientation(0);
                    }
                    View view2 = ((w70) this.f33455b).fragmentView;
                    view2.setPadding(view2.getPaddingLeft(), 0, ((w70) this.f33455b).fragmentView.getPaddingRight(), ((w70) this.f33455b).fragmentView.getPaddingBottom());
                }
                return true;
            case 4:
                lq0 lq0Var = (lq0) this.f33455b;
                if (lq0Var.getParentActivity() != null) {
                    int rotation2 = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    lq0Var.f35434f = 2;
                    if (!AndroidUtilities.isTablet() && (rotation2 == 3 || rotation2 == 1)) {
                        lq0Var.f35434f = 4;
                    }
                    lq0Var.f35435n.l();
                }
                org.telegram.ui.Components.wl0 wl0Var = ((lq0) this.f33455b).h;
                if (wl0Var != null) {
                    wl0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            case 5:
                PhotoViewer photoViewer = (PhotoViewer) this.f33455b;
                photoViewer.f31343w3.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = photoViewer.f31353x3;
                if (imageView != null) {
                    if (photoViewer.J3) {
                        AndroidUtilities.runOnUIThread(new Runnable(this) {
                            public final f7 f35176b;

                            {
                                this.f35176b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        PhotoViewer photoViewer2 = (PhotoViewer) this.f35176b.f33455b;
                                        photoViewer2.f31353x3.setVisibility(4);
                                        photoViewer2.f31353x3.setImageDrawable(null);
                                        Bitmap bitmap = photoViewer2.C3;
                                        if (bitmap != null) {
                                            bitmap.recycle();
                                            photoViewer2.C3 = null;
                                            return;
                                        }
                                        return;
                                    default:
                                        PhotoViewer photoViewer3 = (PhotoViewer) this.f35176b.f33455b;
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
                        photoViewer.f31353x3.setImageDrawable(null);
                        Bitmap bitmap = photoViewer.C3;
                        if (bitmap != null) {
                            bitmap.recycle();
                            photoViewer.C3 = null;
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final f7 f35176b;

                    {
                        this.f35176b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                PhotoViewer photoViewer2 = (PhotoViewer) this.f35176b.f33455b;
                                photoViewer2.f31353x3.setVisibility(4);
                                photoViewer2.f31353x3.setImageDrawable(null);
                                Bitmap bitmap2 = photoViewer2.C3;
                                if (bitmap2 != null) {
                                    bitmap2.recycle();
                                    photoViewer2.C3 = null;
                                    return;
                                }
                                return;
                            default:
                                PhotoViewer photoViewer3 = (PhotoViewer) this.f35176b.f33455b;
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
                ProfileActivity profileActivity = (ProfileActivity) this.f33455b;
                if (profileActivity.fragmentView != null) {
                    profileActivity.A3();
                    profileActivity.k4(true);
                    profileActivity.fragmentView.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            default:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f33455b;
                int[][] iArr = WallpapersListActivity.f31862i0;
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
                org.telegram.ui.Components.wl0 wl0Var2 = ((WallpapersListActivity) this.f33455b).F;
                if (wl0Var2 != null) {
                    wl0Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
        }
    }
}
