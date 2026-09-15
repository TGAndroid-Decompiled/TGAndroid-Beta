package org.telegram.ui;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
public final class ei implements ViewTreeObserver.OnPreDrawListener {
    public final int f33344a;
    public final Object f33345b;

    public ei(Object obj, int i10) {
        this.f33344a = i10;
        this.f33345b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f33344a) {
            case 0:
                bo boVar = (bo) this.f33345b;
                pj pjVar = boVar.f32237a1;
                if (pjVar != null) {
                    pjVar.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return boVar.s8();
            case 1:
                ((ci.s6) this.f33345b).invalidate();
                return true;
            case 2:
                View view = ((w70) this.f33345b).fragmentView;
                if (view != null) {
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                    int rotation = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (rotation != 3 && rotation != 1) {
                        ((w70) this.f33345b).f38789f.setOrientation(1);
                    } else {
                        ((w70) this.f33345b).f38789f.setOrientation(0);
                    }
                    View view2 = ((w70) this.f33345b).fragmentView;
                    view2.setPadding(view2.getPaddingLeft(), 0, ((w70) this.f33345b).fragmentView.getPaddingRight(), ((w70) this.f33345b).fragmentView.getPaddingBottom());
                }
                return true;
            case 3:
                jq0 jq0Var = (jq0) this.f33345b;
                if (jq0Var.getParentActivity() != null) {
                    int rotation2 = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    jq0Var.f34954f = 2;
                    if (!AndroidUtilities.isTablet() && (rotation2 == 3 || rotation2 == 1)) {
                        jq0Var.f34954f = 4;
                    }
                    jq0Var.f34955n.l();
                }
                org.telegram.ui.Components.ll0 ll0Var = ((jq0) this.f33345b).h;
                if (ll0Var != null) {
                    ll0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) this.f33345b;
                photoViewer.f31098w3.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = photoViewer.f31108x3;
                if (imageView != null) {
                    if (photoViewer.J3) {
                        AndroidUtilities.runOnUIThread(new Runnable(this) {
                            public final ei f35269b;

                            {
                                this.f35269b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        PhotoViewer photoViewer2 = (PhotoViewer) this.f35269b.f33345b;
                                        photoViewer2.f31108x3.setVisibility(4);
                                        photoViewer2.f31108x3.setImageDrawable(null);
                                        Bitmap bitmap = photoViewer2.C3;
                                        if (bitmap != null) {
                                            bitmap.recycle();
                                            photoViewer2.C3 = null;
                                            return;
                                        }
                                        return;
                                    default:
                                        PhotoViewer photoViewer3 = (PhotoViewer) this.f35269b.f33345b;
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
                        photoViewer.f31108x3.setImageDrawable(null);
                        Bitmap bitmap = photoViewer.C3;
                        if (bitmap != null) {
                            bitmap.recycle();
                            photoViewer.C3 = null;
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final ei f35269b;

                    {
                        this.f35269b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                PhotoViewer photoViewer2 = (PhotoViewer) this.f35269b.f33345b;
                                photoViewer2.f31108x3.setVisibility(4);
                                photoViewer2.f31108x3.setImageDrawable(null);
                                Bitmap bitmap2 = photoViewer2.C3;
                                if (bitmap2 != null) {
                                    bitmap2.recycle();
                                    photoViewer2.C3 = null;
                                    return;
                                }
                                return;
                            default:
                                PhotoViewer photoViewer3 = (PhotoViewer) this.f35269b.f33345b;
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
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.f33345b;
                if (profileActivity.fragmentView != null) {
                    profileActivity.A3();
                    profileActivity.k4(true);
                    profileActivity.fragmentView.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            default:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f33345b;
                int[][] iArr = WallpapersListActivity.f31618j0;
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
                org.telegram.ui.Components.ll0 ll0Var2 = ((WallpapersListActivity) this.f33345b).F;
                if (ll0Var2 != null) {
                    ll0Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
        }
    }
}
