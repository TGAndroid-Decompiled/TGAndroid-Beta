package org.telegram.ui;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
public final class ei implements ViewTreeObserver.OnPreDrawListener {
    public final int f36085a;
    public final Object f36086b;

    public ei(Object obj, int i10) {
        this.f36085a = i10;
        this.f36086b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f36085a) {
            case 0:
                co coVar = (co) this.f36086b;
                pj pjVar = coVar.f35186a1;
                if (pjVar != null) {
                    pjVar.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return coVar.s8();
            case 1:
                ((di.r6) this.f36086b).invalidate();
                return true;
            case 2:
                View view = ((w70) this.f36086b).fragmentView;
                if (view != null) {
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                    int rotation = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (rotation != 3 && rotation != 1) {
                        ((w70) this.f36086b).f41786f.setOrientation(1);
                    } else {
                        ((w70) this.f36086b).f41786f.setOrientation(0);
                    }
                    View view2 = ((w70) this.f36086b).fragmentView;
                    view2.setPadding(view2.getPaddingLeft(), 0, ((w70) this.f36086b).fragmentView.getPaddingRight(), ((w70) this.f36086b).fragmentView.getPaddingBottom());
                }
                return true;
            case 3:
                kq0 kq0Var = (kq0) this.f36086b;
                if (kq0Var.getParentActivity() != null) {
                    int rotation2 = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    kq0Var.f38108f = 2;
                    if (!AndroidUtilities.isTablet() && (rotation2 == 3 || rotation2 == 1)) {
                        kq0Var.f38108f = 4;
                    }
                    kq0Var.f38109n.l();
                }
                org.telegram.ui.Components.ll0 ll0Var = ((kq0) this.f36086b).h;
                if (ll0Var != null) {
                    ll0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) this.f36086b;
                photoViewer.f33711w3.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = photoViewer.f33721x3;
                if (imageView != null) {
                    if (photoViewer.J3) {
                        AndroidUtilities.runOnUIThread(new Runnable(this) {
                            public final ei f37845b;

                            {
                                this.f37845b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        PhotoViewer photoViewer2 = (PhotoViewer) this.f37845b.f36086b;
                                        photoViewer2.f33721x3.setVisibility(4);
                                        photoViewer2.f33721x3.setImageDrawable(null);
                                        Bitmap bitmap = photoViewer2.C3;
                                        if (bitmap != null) {
                                            bitmap.recycle();
                                            photoViewer2.C3 = null;
                                            return;
                                        }
                                        return;
                                    default:
                                        PhotoViewer photoViewer3 = (PhotoViewer) this.f37845b.f36086b;
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
                        photoViewer.f33721x3.setImageDrawable(null);
                        Bitmap bitmap = photoViewer.C3;
                        if (bitmap != null) {
                            bitmap.recycle();
                            photoViewer.C3 = null;
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final ei f37845b;

                    {
                        this.f37845b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                PhotoViewer photoViewer2 = (PhotoViewer) this.f37845b.f36086b;
                                photoViewer2.f33721x3.setVisibility(4);
                                photoViewer2.f33721x3.setImageDrawable(null);
                                Bitmap bitmap2 = photoViewer2.C3;
                                if (bitmap2 != null) {
                                    bitmap2.recycle();
                                    photoViewer2.C3 = null;
                                    return;
                                }
                                return;
                            default:
                                PhotoViewer photoViewer3 = (PhotoViewer) this.f37845b.f36086b;
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
                ProfileActivity profileActivity = (ProfileActivity) this.f36086b;
                if (profileActivity.fragmentView != null) {
                    profileActivity.A3();
                    profileActivity.k4(true);
                    profileActivity.fragmentView.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            default:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f36086b;
                int[][] iArr = WallpapersListActivity.f34248k0;
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
                org.telegram.ui.Components.ll0 ll0Var2 = ((WallpapersListActivity) this.f36086b).H;
                if (ll0Var2 != null) {
                    ll0Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
        }
    }
}
