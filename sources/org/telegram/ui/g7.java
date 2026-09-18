package org.telegram.ui;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
public final class g7 implements ViewTreeObserver.OnPreDrawListener {
    public final int f33869a;
    public final Object f33870b;

    public g7(Object obj, int i10) {
        this.f33869a = i10;
        this.f33870b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f33869a) {
            case 0:
                u7 u7Var = (u7) this.f33870b;
                FrameLayout frameLayout = u7Var.f37954b;
                if (!u7Var.f37961x) {
                    float max = Math.max(0.0f, u7Var.f37960w - u7Var.getY());
                    if (frameLayout.getTranslationY() != max) {
                        frameLayout.setTranslationY(max);
                    }
                }
                return true;
            case 1:
                bo boVar = (bo) this.f33870b;
                qj qjVar = boVar.f32219a1;
                if (qjVar != null) {
                    qjVar.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return boVar.s8();
            case 2:
                ((ci.s6) this.f33870b).invalidate();
                return true;
            case 3:
                View view = ((y70) this.f33870b).fragmentView;
                if (view != null) {
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                    int rotation = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (rotation != 3 && rotation != 1) {
                        ((y70) this.f33870b).f39808f.setOrientation(1);
                    } else {
                        ((y70) this.f33870b).f39808f.setOrientation(0);
                    }
                    View view2 = ((y70) this.f33870b).fragmentView;
                    view2.setPadding(view2.getPaddingLeft(), 0, ((y70) this.f33870b).fragmentView.getPaddingRight(), ((y70) this.f33870b).fragmentView.getPaddingBottom());
                }
                return true;
            case 4:
                lq0 lq0Var = (lq0) this.f33870b;
                if (lq0Var.getParentActivity() != null) {
                    int rotation2 = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    lq0Var.f35608f = 2;
                    if (!AndroidUtilities.isTablet() && (rotation2 == 3 || rotation2 == 1)) {
                        lq0Var.f35608f = 4;
                    }
                    lq0Var.f35609n.l();
                }
                org.telegram.ui.Components.ml0 ml0Var = ((lq0) this.f33870b).h;
                if (ml0Var != null) {
                    ml0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            case 5:
                PhotoViewer photoViewer = (PhotoViewer) this.f33870b;
                photoViewer.f31116w3.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = photoViewer.f31126x3;
                if (imageView != null) {
                    if (photoViewer.J3) {
                        AndroidUtilities.runOnUIThread(new Runnable(this) {
                            public final g7 f35893b;

                            {
                                this.f35893b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        PhotoViewer photoViewer2 = (PhotoViewer) this.f35893b.f33870b;
                                        photoViewer2.f31126x3.setVisibility(4);
                                        photoViewer2.f31126x3.setImageDrawable(null);
                                        Bitmap bitmap = photoViewer2.C3;
                                        if (bitmap != null) {
                                            bitmap.recycle();
                                            photoViewer2.C3 = null;
                                            return;
                                        }
                                        return;
                                    default:
                                        PhotoViewer photoViewer3 = (PhotoViewer) this.f35893b.f33870b;
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
                        photoViewer.f31126x3.setImageDrawable(null);
                        Bitmap bitmap = photoViewer.C3;
                        if (bitmap != null) {
                            bitmap.recycle();
                            photoViewer.C3 = null;
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final g7 f35893b;

                    {
                        this.f35893b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                PhotoViewer photoViewer2 = (PhotoViewer) this.f35893b.f33870b;
                                photoViewer2.f31126x3.setVisibility(4);
                                photoViewer2.f31126x3.setImageDrawable(null);
                                Bitmap bitmap2 = photoViewer2.C3;
                                if (bitmap2 != null) {
                                    bitmap2.recycle();
                                    photoViewer2.C3 = null;
                                    return;
                                }
                                return;
                            default:
                                PhotoViewer photoViewer3 = (PhotoViewer) this.f35893b.f33870b;
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
                ProfileActivity profileActivity = (ProfileActivity) this.f33870b;
                if (profileActivity.fragmentView != null) {
                    profileActivity.A3();
                    profileActivity.k4(true);
                    profileActivity.fragmentView.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            default:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f33870b;
                int[][] iArr = WallpapersListActivity.f31635i0;
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
                org.telegram.ui.Components.ml0 ml0Var2 = ((WallpapersListActivity) this.f33870b).F;
                if (ml0Var2 != null) {
                    ml0Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
        }
    }
}
