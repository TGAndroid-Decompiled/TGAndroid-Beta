package org.telegram.ui;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
public final class ii implements ViewTreeObserver.OnPreDrawListener {
    public final int f38913a;
    public final Object f38914b;

    public ii(Object obj, int i10) {
        this.f38913a = i10;
        this.f38914b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f38913a) {
            case 0:
                eo eoVar = (eo) this.f38914b;
                uj ujVar = eoVar.f37195a1;
                if (ujVar != null) {
                    ujVar.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return eoVar.w8();
            case 1:
                ((ci.r6) this.f38914b).invalidate();
                return true;
            case 2:
                View view = ((x70) this.f38914b).fragmentView;
                if (view != null) {
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                    int rotation = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (rotation != 3 && rotation != 1) {
                        ((x70) this.f38914b).f43790f.setOrientation(1);
                    } else {
                        ((x70) this.f38914b).f43790f.setOrientation(0);
                    }
                    View view2 = ((x70) this.f38914b).fragmentView;
                    view2.setPadding(view2.getPaddingLeft(), 0, ((x70) this.f38914b).fragmentView.getPaddingRight(), ((x70) this.f38914b).fragmentView.getPaddingBottom());
                }
                return true;
            case 3:
                mq0 mq0Var = (mq0) this.f38914b;
                if (mq0Var.getParentActivity() != null) {
                    int rotation2 = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    mq0Var.f40114f = 2;
                    if (!AndroidUtilities.isTablet() && (rotation2 == 3 || rotation2 == 1)) {
                        mq0Var.f40114f = 4;
                    }
                    mq0Var.f40115n.l();
                }
                org.telegram.ui.Components.wm0 wm0Var = ((mq0) this.f38914b).h;
                if (wm0Var != null) {
                    wm0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) this.f38914b;
                photoViewer.f33905w3.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = photoViewer.f33915x3;
                if (imageView != null) {
                    if (photoViewer.J3) {
                        AndroidUtilities.runOnUIThread(new Runnable(this) {
                            public final ii f40480b;

                            {
                                this.f40480b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        PhotoViewer photoViewer2 = (PhotoViewer) this.f40480b.f38914b;
                                        photoViewer2.f33915x3.setVisibility(4);
                                        photoViewer2.f33915x3.setImageDrawable(null);
                                        Bitmap bitmap = photoViewer2.C3;
                                        if (bitmap != null) {
                                            bitmap.recycle();
                                            photoViewer2.C3 = null;
                                            return;
                                        }
                                        return;
                                    default:
                                        PhotoViewer photoViewer3 = (PhotoViewer) this.f40480b.f38914b;
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
                        photoViewer.f33915x3.setImageDrawable(null);
                        Bitmap bitmap = photoViewer.C3;
                        if (bitmap != null) {
                            bitmap.recycle();
                            photoViewer.C3 = null;
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final ii f40480b;

                    {
                        this.f40480b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                PhotoViewer photoViewer2 = (PhotoViewer) this.f40480b.f38914b;
                                photoViewer2.f33915x3.setVisibility(4);
                                photoViewer2.f33915x3.setImageDrawable(null);
                                Bitmap bitmap2 = photoViewer2.C3;
                                if (bitmap2 != null) {
                                    bitmap2.recycle();
                                    photoViewer2.C3 = null;
                                    return;
                                }
                                return;
                            default:
                                PhotoViewer photoViewer3 = (PhotoViewer) this.f40480b.f38914b;
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
                ProfileActivity profileActivity = (ProfileActivity) this.f38914b;
                if (profileActivity.fragmentView != null) {
                    profileActivity.A3();
                    profileActivity.k4(true);
                    profileActivity.fragmentView.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            default:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f38914b;
                int[][] iArr = WallpapersListActivity.f35610k0;
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
                org.telegram.ui.Components.wm0 wm0Var2 = ((WallpapersListActivity) this.f38914b).H;
                if (wm0Var2 != null) {
                    wm0Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
        }
    }
}
