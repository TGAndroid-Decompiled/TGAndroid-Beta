package org.telegram.ui;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
public final class bi implements ViewTreeObserver.OnPreDrawListener {
    public final int f32122a;
    public final Object f32123b;

    public bi(Object obj, int i10) {
        this.f32122a = i10;
        this.f32123b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f32122a) {
            case 0:
                xn xnVar = (xn) this.f32123b;
                mj mjVar = xnVar.f39310a1;
                if (mjVar != null) {
                    mjVar.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return xnVar.s8();
            case 1:
                ((ci.r6) this.f32123b).invalidate();
                return true;
            case 2:
                View view = ((t70) this.f32123b).fragmentView;
                if (view != null) {
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                    int rotation = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (rotation != 3 && rotation != 1) {
                        ((t70) this.f32123b).f37548f.setOrientation(1);
                    } else {
                        ((t70) this.f32123b).f37548f.setOrientation(0);
                    }
                    View view2 = ((t70) this.f32123b).fragmentView;
                    view2.setPadding(view2.getPaddingLeft(), 0, ((t70) this.f32123b).fragmentView.getPaddingRight(), ((t70) this.f32123b).fragmentView.getPaddingBottom());
                }
                return true;
            case 3:
                dq0 dq0Var = (dq0) this.f32123b;
                if (dq0Var.getParentActivity() != null) {
                    int rotation2 = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    dq0Var.f32698f = 2;
                    if (!AndroidUtilities.isTablet() && (rotation2 == 3 || rotation2 == 1)) {
                        dq0Var.f32698f = 4;
                    }
                    dq0Var.f32699n.l();
                }
                org.telegram.ui.Components.ml0 ml0Var = ((dq0) this.f32123b).h;
                if (ml0Var != null) {
                    ml0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) this.f32123b;
                photoViewer.f31070w3.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = photoViewer.f31080x3;
                if (imageView != null) {
                    if (photoViewer.J3) {
                        AndroidUtilities.runOnUIThread(new Runnable(this) {
                            public final bi f32722b;

                            {
                                this.f32722b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        PhotoViewer photoViewer2 = (PhotoViewer) this.f32722b.f32123b;
                                        photoViewer2.f31080x3.setVisibility(4);
                                        photoViewer2.f31080x3.setImageDrawable(null);
                                        Bitmap bitmap = photoViewer2.C3;
                                        if (bitmap != null) {
                                            bitmap.recycle();
                                            photoViewer2.C3 = null;
                                            return;
                                        }
                                        return;
                                    default:
                                        PhotoViewer photoViewer3 = (PhotoViewer) this.f32722b.f32123b;
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
                        photoViewer.f31080x3.setImageDrawable(null);
                        Bitmap bitmap = photoViewer.C3;
                        if (bitmap != null) {
                            bitmap.recycle();
                            photoViewer.C3 = null;
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final bi f32722b;

                    {
                        this.f32722b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                PhotoViewer photoViewer2 = (PhotoViewer) this.f32722b.f32123b;
                                photoViewer2.f31080x3.setVisibility(4);
                                photoViewer2.f31080x3.setImageDrawable(null);
                                Bitmap bitmap2 = photoViewer2.C3;
                                if (bitmap2 != null) {
                                    bitmap2.recycle();
                                    photoViewer2.C3 = null;
                                    return;
                                }
                                return;
                            default:
                                PhotoViewer photoViewer3 = (PhotoViewer) this.f32722b.f32123b;
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
                ProfileActivity profileActivity = (ProfileActivity) this.f32123b;
                if (profileActivity.fragmentView != null) {
                    profileActivity.A3();
                    profileActivity.k4(true);
                    profileActivity.fragmentView.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            default:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f32123b;
                int[][] iArr = WallpapersListActivity.f31589k0;
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
                org.telegram.ui.Components.ml0 ml0Var2 = ((WallpapersListActivity) this.f32123b).H;
                if (ml0Var2 != null) {
                    ml0Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
        }
    }
}
