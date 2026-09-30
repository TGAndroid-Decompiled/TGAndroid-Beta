package org.telegram.ui;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
public final class bi implements ViewTreeObserver.OnPreDrawListener {
    public final int f32430a;
    public final Object f32431b;

    public bi(Object obj, int i10) {
        this.f32430a = i10;
        this.f32431b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f32430a) {
            case 0:
                wn wnVar = (wn) this.f32431b;
                mj mjVar = wnVar.f39409a1;
                if (mjVar != null) {
                    mjVar.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return wnVar.s8();
            case 1:
                ((ci.r6) this.f32431b).invalidate();
                return true;
            case 2:
                View view = ((r70) this.f32431b).fragmentView;
                if (view != null) {
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                    int rotation = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (rotation != 3 && rotation != 1) {
                        ((r70) this.f32431b).f37200f.setOrientation(1);
                    } else {
                        ((r70) this.f32431b).f37200f.setOrientation(0);
                    }
                    View view2 = ((r70) this.f32431b).fragmentView;
                    view2.setPadding(view2.getPaddingLeft(), 0, ((r70) this.f32431b).fragmentView.getPaddingRight(), ((r70) this.f32431b).fragmentView.getPaddingBottom());
                }
                return true;
            case 3:
                cq0 cq0Var = (cq0) this.f32431b;
                if (cq0Var.getParentActivity() != null) {
                    int rotation2 = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    cq0Var.f32774f = 2;
                    if (!AndroidUtilities.isTablet() && (rotation2 == 3 || rotation2 == 1)) {
                        cq0Var.f32774f = 4;
                    }
                    cq0Var.f32775n.l();
                }
                org.telegram.ui.Components.yl0 yl0Var = ((cq0) this.f32431b).h;
                if (yl0Var != null) {
                    yl0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) this.f32431b;
                photoViewer.f31387w3.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = photoViewer.f31397x3;
                if (imageView != null) {
                    if (photoViewer.J3) {
                        AndroidUtilities.runOnUIThread(new Runnable(this) {
                            public final bi f32798b;

                            {
                                this.f32798b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        PhotoViewer photoViewer2 = (PhotoViewer) this.f32798b.f32431b;
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
                                        PhotoViewer photoViewer3 = (PhotoViewer) this.f32798b.f32431b;
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
                    public final bi f32798b;

                    {
                        this.f32798b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                PhotoViewer photoViewer2 = (PhotoViewer) this.f32798b.f32431b;
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
                                PhotoViewer photoViewer3 = (PhotoViewer) this.f32798b.f32431b;
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
                ProfileActivity profileActivity = (ProfileActivity) this.f32431b;
                if (profileActivity.fragmentView != null) {
                    profileActivity.A3();
                    profileActivity.k4(true);
                    profileActivity.fragmentView.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            default:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f32431b;
                int[][] iArr = WallpapersListActivity.f31906k0;
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
                org.telegram.ui.Components.yl0 yl0Var2 = ((WallpapersListActivity) this.f32431b).H;
                if (yl0Var2 != null) {
                    yl0Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
        }
    }
}
