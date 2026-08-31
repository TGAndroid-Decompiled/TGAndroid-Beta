package org.telegram.ui;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
public final class ai implements ViewTreeObserver.OnPreDrawListener {
    public final int f35187a;
    public final Object f35188b;

    public ai(Object obj, int i10) {
        this.f35187a = i10;
        this.f35188b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f35187a) {
            case 0:
                xn xnVar = (xn) this.f35188b;
                lj ljVar = xnVar.X0;
                if (ljVar != null) {
                    ljVar.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return xnVar.s8();
            case 1:
                ((fg.i0) this.f35188b).invalidate();
                return true;
            case 2:
                View view = ((p70) this.f35188b).fragmentView;
                if (view != null) {
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                    int rotation = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (rotation != 3 && rotation != 1) {
                        ((p70) this.f35188b).f39937f.setOrientation(1);
                    } else {
                        ((p70) this.f35188b).f39937f.setOrientation(0);
                    }
                    View view2 = ((p70) this.f35188b).fragmentView;
                    view2.setPadding(view2.getPaddingLeft(), 0, ((p70) this.f35188b).fragmentView.getPaddingRight(), ((p70) this.f35188b).fragmentView.getPaddingBottom());
                }
                return true;
            case 3:
                rp0 rp0Var = (rp0) this.f35188b;
                if (rp0Var.getParentActivity() != null) {
                    int rotation2 = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    rp0Var.f41028f = 2;
                    if (!AndroidUtilities.isTablet() && (rotation2 == 3 || rotation2 == 1)) {
                        rp0Var.f41028f = 4;
                    }
                    rp0Var.f41029n.l();
                }
                org.telegram.ui.Components.tl0 tl0Var = ((rp0) this.f35188b).h;
                if (tl0Var != null) {
                    tl0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) this.f35188b;
                photoViewer.f34396t3.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = photoViewer.f34404u3;
                if (imageView != null) {
                    if (photoViewer.G3) {
                        AndroidUtilities.runOnUIThread(new Runnable(this) {
                            public final ai f41052b;

                            {
                                this.f41052b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        PhotoViewer photoViewer2 = (PhotoViewer) this.f41052b.f35188b;
                                        photoViewer2.f34404u3.setVisibility(4);
                                        photoViewer2.f34404u3.setImageDrawable(null);
                                        Bitmap bitmap = photoViewer2.f34452z3;
                                        if (bitmap != null) {
                                            bitmap.recycle();
                                            photoViewer2.f34452z3 = null;
                                            return;
                                        }
                                        return;
                                    default:
                                        PhotoViewer photoViewer3 = (PhotoViewer) this.f41052b.f35188b;
                                        if (photoViewer3.G3) {
                                            photoViewer3.S0();
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, 300L);
                    } else {
                        imageView.setVisibility(4);
                        photoViewer.f34404u3.setImageDrawable(null);
                        Bitmap bitmap = photoViewer.f34452z3;
                        if (bitmap != null) {
                            bitmap.recycle();
                            photoViewer.f34452z3 = null;
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final ai f41052b;

                    {
                        this.f41052b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                PhotoViewer photoViewer2 = (PhotoViewer) this.f41052b.f35188b;
                                photoViewer2.f34404u3.setVisibility(4);
                                photoViewer2.f34404u3.setImageDrawable(null);
                                Bitmap bitmap2 = photoViewer2.f34452z3;
                                if (bitmap2 != null) {
                                    bitmap2.recycle();
                                    photoViewer2.f34452z3 = null;
                                    return;
                                }
                                return;
                            default:
                                PhotoViewer photoViewer3 = (PhotoViewer) this.f41052b.f35188b;
                                if (photoViewer3.G3) {
                                    photoViewer3.S0();
                                    return;
                                }
                                return;
                        }
                    }
                });
                photoViewer.D3 = 0;
                return true;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.f35188b;
                if (profileActivity.fragmentView != null) {
                    profileActivity.A3();
                    profileActivity.k4(true);
                    profileActivity.fragmentView.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            default:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f35188b;
                int[][] iArr = WallpapersListActivity.f34941h0;
                if (wallpapersListActivity.getParentActivity() != null) {
                    int rotation3 = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (AndroidUtilities.isTablet()) {
                        wallpapersListActivity.O = 3;
                    } else if (rotation3 != 3 && rotation3 != 1) {
                        wallpapersListActivity.O = 3;
                    } else {
                        wallpapersListActivity.O = 5;
                    }
                    wallpapersListActivity.C0();
                }
                org.telegram.ui.Components.tl0 tl0Var2 = ((WallpapersListActivity) this.f35188b).E;
                if (tl0Var2 != null) {
                    tl0Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
        }
    }
}
