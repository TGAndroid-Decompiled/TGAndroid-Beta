package org.telegram.ui;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
public final class ii implements ViewTreeObserver.OnPreDrawListener {
    public final int f36816a;
    public final Object f36817b;

    public ii(Object obj, int i10) {
        this.f36816a = i10;
        this.f36817b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f36816a) {
            case 0:
                fo foVar = (fo) this.f36817b;
                uj ujVar = foVar.f35573a1;
                if (ujVar != null) {
                    ujVar.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return foVar.w8();
            case 1:
                ((di.p6) this.f36817b).invalidate();
                return true;
            case 2:
                View view = ((a80) this.f36817b).fragmentView;
                if (view != null) {
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                    int rotation = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (rotation != 3 && rotation != 1) {
                        ((a80) this.f36817b).f33780f.setOrientation(1);
                    } else {
                        ((a80) this.f36817b).f33780f.setOrientation(0);
                    }
                    View view2 = ((a80) this.f36817b).fragmentView;
                    view2.setPadding(view2.getPaddingLeft(), 0, ((a80) this.f36817b).fragmentView.getPaddingRight(), ((a80) this.f36817b).fragmentView.getPaddingBottom());
                }
                return true;
            case 3:
                oq0 oq0Var = (oq0) this.f36817b;
                if (oq0Var.getParentActivity() != null) {
                    int rotation2 = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    oq0Var.f38731f = 2;
                    if (!AndroidUtilities.isTablet() && (rotation2 == 3 || rotation2 == 1)) {
                        oq0Var.f38731f = 4;
                    }
                    oq0Var.f38732n.l();
                }
                org.telegram.ui.Components.mm0 mm0Var = ((oq0) this.f36817b).h;
                if (mm0Var != null) {
                    mm0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) this.f36817b;
                photoViewer.f32091w3.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = photoViewer.f32101x3;
                if (imageView != null) {
                    if (photoViewer.J3) {
                        AndroidUtilities.runOnUIThread(new Runnable(this) {
                            public final ii f39218b;

                            {
                                this.f39218b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        PhotoViewer photoViewer2 = (PhotoViewer) this.f39218b.f36817b;
                                        photoViewer2.f32101x3.setVisibility(4);
                                        photoViewer2.f32101x3.setImageDrawable(null);
                                        Bitmap bitmap = photoViewer2.C3;
                                        if (bitmap != null) {
                                            bitmap.recycle();
                                            photoViewer2.C3 = null;
                                            return;
                                        }
                                        return;
                                    default:
                                        PhotoViewer photoViewer3 = (PhotoViewer) this.f39218b.f36817b;
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
                        photoViewer.f32101x3.setImageDrawable(null);
                        Bitmap bitmap = photoViewer.C3;
                        if (bitmap != null) {
                            bitmap.recycle();
                            photoViewer.C3 = null;
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final ii f39218b;

                    {
                        this.f39218b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                PhotoViewer photoViewer2 = (PhotoViewer) this.f39218b.f36817b;
                                photoViewer2.f32101x3.setVisibility(4);
                                photoViewer2.f32101x3.setImageDrawable(null);
                                Bitmap bitmap2 = photoViewer2.C3;
                                if (bitmap2 != null) {
                                    bitmap2.recycle();
                                    photoViewer2.C3 = null;
                                    return;
                                }
                                return;
                            default:
                                PhotoViewer photoViewer3 = (PhotoViewer) this.f39218b.f36817b;
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
                ProfileActivity profileActivity = (ProfileActivity) this.f36817b;
                if (profileActivity.fragmentView != null) {
                    profileActivity.A3();
                    profileActivity.k4(true);
                    profileActivity.fragmentView.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            default:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f36817b;
                int[][] iArr = WallpapersListActivity.f33674k0;
                if (wallpapersListActivity.getParentActivity() != null) {
                    int rotation3 = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (AndroidUtilities.isTablet()) {
                        wallpapersListActivity.R = 3;
                    } else if (rotation3 != 3 && rotation3 != 1) {
                        wallpapersListActivity.R = 3;
                    } else {
                        wallpapersListActivity.R = 5;
                    }
                    wallpapersListActivity.C0();
                }
                org.telegram.ui.Components.mm0 mm0Var2 = ((WallpapersListActivity) this.f36817b).H;
                if (mm0Var2 != null) {
                    mm0Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
        }
    }
}
