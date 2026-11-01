package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class e7 implements ViewTreeObserver.OnPreDrawListener {
    public final int f36760a;
    public final Object f36761b;

    public e7(Object obj, int i10) {
        this.f36760a = i10;
        this.f36761b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f36760a) {
            case 0:
                t7 t7Var = (t7) this.f36761b;
                FrameLayout frameLayout = t7Var.f41558c;
                if (!t7Var.D) {
                    float max = Math.max(0.0f, t7Var.f41565y - t7Var.getY());
                    if (frameLayout.getTranslationY() != max) {
                        frameLayout.setTranslationY(max);
                    }
                }
                return true;
            case 1:
                ((kg.f0) this.f36761b).invalidate();
                return true;
            case 2:
                View view = ((m60) this.f36761b).fragmentView;
                if (view != null) {
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                    int rotation = ((WindowManager) org.telegram.messenger.w0.f18945b.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (rotation != 3 && rotation != 1) {
                        ((m60) this.f36761b).f39443f.setOrientation(1);
                    } else {
                        ((m60) this.f36761b).f39443f.setOrientation(0);
                    }
                    View view2 = ((m60) this.f36761b).fragmentView;
                    view2.setPadding(view2.getPaddingLeft(), 0, ((m60) this.f36761b).fragmentView.getPaddingRight(), ((m60) this.f36761b).fragmentView.getPaddingBottom());
                }
                return true;
            case 3:
                wn0 wn0Var = (wn0) this.f36761b;
                if (wn0Var.getParentActivity() != null) {
                    int rotation2 = ((WindowManager) org.telegram.messenger.w0.f18945b.getSystemService("window")).getDefaultDisplay().getRotation();
                    wn0Var.f43134f = 2;
                    if (!org.telegram.messenger.i0.Q1() && (rotation2 == 3 || rotation2 == 1)) {
                        wn0Var.f43134f = 4;
                    }
                    wn0Var.f43135n.f();
                }
                org.telegram.ui.Components.uk0 uk0Var = ((wn0) this.f36761b).h;
                if (uk0Var != null) {
                    uk0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) this.f36761b;
                photoViewer.f33640w3.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = photoViewer.f33650x3;
                if (imageView != null) {
                    if (photoViewer.J3) {
                        org.telegram.messenger.i0.h3(new Runnable(this) {
                            public final e7 f40260b;

                            {
                                this.f40260b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        PhotoViewer photoViewer2 = (PhotoViewer) this.f40260b.f36761b;
                                        photoViewer2.f33650x3.setVisibility(4);
                                        photoViewer2.f33650x3.setImageDrawable(null);
                                        Bitmap bitmap = photoViewer2.C3;
                                        if (bitmap != null) {
                                            bitmap.recycle();
                                            photoViewer2.C3 = null;
                                            return;
                                        }
                                        return;
                                    default:
                                        PhotoViewer photoViewer3 = (PhotoViewer) this.f40260b.f36761b;
                                        if (photoViewer3.J3) {
                                            photoViewer3.T0();
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, 300L);
                    } else {
                        imageView.setVisibility(4);
                        photoViewer.f33650x3.setImageDrawable(null);
                        Bitmap bitmap = photoViewer.C3;
                        if (bitmap != null) {
                            bitmap.recycle();
                            photoViewer.C3 = null;
                        }
                    }
                }
                org.telegram.messenger.i0.g3(new Runnable(this) {
                    public final e7 f40260b;

                    {
                        this.f40260b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                PhotoViewer photoViewer2 = (PhotoViewer) this.f40260b.f36761b;
                                photoViewer2.f33650x3.setVisibility(4);
                                photoViewer2.f33650x3.setImageDrawable(null);
                                Bitmap bitmap2 = photoViewer2.C3;
                                if (bitmap2 != null) {
                                    bitmap2.recycle();
                                    photoViewer2.C3 = null;
                                    return;
                                }
                                return;
                            default:
                                PhotoViewer photoViewer3 = (PhotoViewer) this.f40260b.f36761b;
                                if (photoViewer3.J3) {
                                    photoViewer3.T0();
                                    return;
                                }
                                return;
                        }
                    }
                });
                photoViewer.G3 = 0;
                return true;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.f36761b;
                if (profileActivity.fragmentView != null) {
                    RectF rectF = ProfileActivity.S6;
                    profileActivity.O3();
                    profileActivity.y4(true);
                    profileActivity.fragmentView.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            default:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f36761b;
                if (wallpapersListActivity.getParentActivity() != null) {
                    int rotation3 = ((WindowManager) org.telegram.messenger.w0.f18945b.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (org.telegram.messenger.i0.Q1()) {
                        wallpapersListActivity.N = 3;
                    } else if (rotation3 != 3 && rotation3 != 1) {
                        wallpapersListActivity.N = 3;
                    } else {
                        wallpapersListActivity.N = 5;
                    }
                    wallpapersListActivity.H0();
                }
                org.telegram.ui.Components.uk0 uk0Var2 = ((WallpapersListActivity) this.f36761b).F;
                if (uk0Var2 != null) {
                    uk0Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
        }
    }
}
