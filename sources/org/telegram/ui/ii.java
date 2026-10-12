package org.telegram.ui;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
public final class ii implements ViewTreeObserver.OnPreDrawListener {
    public final int f38911a;
    public final Object f38912b;

    public ii(Object obj, int i10) {
        this.f38911a = i10;
        this.f38912b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f38911a) {
            case 0:
                eo eoVar = (eo) this.f38912b;
                uj ujVar = eoVar.f37190a1;
                if (ujVar != null) {
                    ujVar.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return eoVar.w8();
            case 1:
                ((ci.r6) this.f38912b).invalidate();
                return true;
            case 2:
                View view = ((x70) this.f38912b).fragmentView;
                if (view != null) {
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                    int rotation = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (rotation != 3 && rotation != 1) {
                        ((x70) this.f38912b).f43785f.setOrientation(1);
                    } else {
                        ((x70) this.f38912b).f43785f.setOrientation(0);
                    }
                    View view2 = ((x70) this.f38912b).fragmentView;
                    view2.setPadding(view2.getPaddingLeft(), 0, ((x70) this.f38912b).fragmentView.getPaddingRight(), ((x70) this.f38912b).fragmentView.getPaddingBottom());
                }
                return true;
            case 3:
                mq0 mq0Var = (mq0) this.f38912b;
                if (mq0Var.getParentActivity() != null) {
                    int rotation2 = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    mq0Var.f40111f = 2;
                    if (!AndroidUtilities.isTablet() && (rotation2 == 3 || rotation2 == 1)) {
                        mq0Var.f40111f = 4;
                    }
                    mq0Var.f40112n.l();
                }
                org.telegram.ui.Components.wm0 wm0Var = ((mq0) this.f38912b).h;
                if (wm0Var != null) {
                    wm0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) this.f38912b;
                photoViewer.f33903w3.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = photoViewer.f33913x3;
                if (imageView != null) {
                    if (photoViewer.J3) {
                        AndroidUtilities.runOnUIThread(new Runnable(this) {
                            public final ii f40477b;

                            {
                                this.f40477b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        PhotoViewer photoViewer2 = (PhotoViewer) this.f40477b.f38912b;
                                        photoViewer2.f33913x3.setVisibility(4);
                                        photoViewer2.f33913x3.setImageDrawable(null);
                                        Bitmap bitmap = photoViewer2.C3;
                                        if (bitmap != null) {
                                            bitmap.recycle();
                                            photoViewer2.C3 = null;
                                            return;
                                        }
                                        return;
                                    default:
                                        PhotoViewer photoViewer3 = (PhotoViewer) this.f40477b.f38912b;
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
                        photoViewer.f33913x3.setImageDrawable(null);
                        Bitmap bitmap = photoViewer.C3;
                        if (bitmap != null) {
                            bitmap.recycle();
                            photoViewer.C3 = null;
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final ii f40477b;

                    {
                        this.f40477b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                PhotoViewer photoViewer2 = (PhotoViewer) this.f40477b.f38912b;
                                photoViewer2.f33913x3.setVisibility(4);
                                photoViewer2.f33913x3.setImageDrawable(null);
                                Bitmap bitmap2 = photoViewer2.C3;
                                if (bitmap2 != null) {
                                    bitmap2.recycle();
                                    photoViewer2.C3 = null;
                                    return;
                                }
                                return;
                            default:
                                PhotoViewer photoViewer3 = (PhotoViewer) this.f40477b.f38912b;
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
                ProfileActivity profileActivity = (ProfileActivity) this.f38912b;
                if (profileActivity.fragmentView != null) {
                    profileActivity.A3();
                    profileActivity.k4(true);
                    profileActivity.fragmentView.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            default:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f38912b;
                int[][] iArr = WallpapersListActivity.f35608k0;
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
                org.telegram.ui.Components.wm0 wm0Var2 = ((WallpapersListActivity) this.f38912b).H;
                if (wm0Var2 != null) {
                    wm0Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
        }
    }
}
