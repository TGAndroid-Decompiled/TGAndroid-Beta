package org.telegram.ui;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
public final class i7 implements ViewTreeObserver.OnPreDrawListener {
    public final int f40059a;
    public final Object f40060b;

    public i7(Object obj, int i10) {
        this.f40059a = i10;
        this.f40060b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f40059a) {
            case 0:
                x7 x7Var = (x7) this.f40060b;
                FrameLayout frameLayout = x7Var.f45610c;
                if (!x7Var.f45617y) {
                    float max = Math.max(0.0f, x7Var.f45616x - x7Var.getY());
                    if (frameLayout.getTranslationY() != max) {
                        frameLayout.setTranslationY(max);
                    }
                }
                return true;
            case 1:
                ((fi.f6) this.f40060b).invalidate();
                return true;
            case 2:
                View view = ((k70) this.f40060b).fragmentView;
                if (view != null) {
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                    int rotation = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (rotation != 3 && rotation != 1) {
                        ((k70) this.f40060b).f40673f.setOrientation(1);
                    } else {
                        ((k70) this.f40060b).f40673f.setOrientation(0);
                    }
                    View view2 = ((k70) this.f40060b).fragmentView;
                    view2.setPadding(view2.getPaddingLeft(), 0, ((k70) this.f40060b).fragmentView.getPaddingRight(), ((k70) this.f40060b).fragmentView.getPaddingBottom());
                }
                return true;
            case 3:
                org.telegram.ui.Components.s71 s71Var = (org.telegram.ui.Components.s71) this.f40060b;
                s71Var.getViewTreeObserver().removeOnPreDrawListener(this);
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < s71Var.getChildCount(); i10++) {
                    arrayList.add(s71Var.getChildAt(i10));
                }
                Collections.sort(arrayList, new dv(4));
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    View view3 = (View) arrayList.get(i11);
                    view3.animate().cancel();
                    view3.setAlpha(0.0f);
                    view3.setTranslationY(AndroidUtilities.dp(24.0f));
                    view3.animate().alpha(1.0f).translationY(0.0f).setStartDelay(i11 * 40).setDuration(360L).setInterpolator(org.telegram.ui.Components.ds.h).start();
                }
                return true;
            case 4:
                cq0 cq0Var = (cq0) this.f40060b;
                if (cq0Var.getParentActivity() != null) {
                    int rotation2 = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    cq0Var.f38435f = 2;
                    if (!AndroidUtilities.isTablet() && (rotation2 == 3 || rotation2 == 1)) {
                        cq0Var.f38435f = 4;
                    }
                    cq0Var.f38436n.l();
                }
                org.telegram.ui.Components.nm0 nm0Var = ((cq0) this.f40060b).h;
                if (nm0Var != null) {
                    nm0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            case 5:
                PhotoViewer photoViewer = (PhotoViewer) this.f40060b;
                photoViewer.f35833w3.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = photoViewer.f35843x3;
                if (imageView != null) {
                    if (photoViewer.J3) {
                        AndroidUtilities.runOnUIThread(new Runnable(this) {
                            public final i7 f46359b;

                            {
                                this.f46359b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        PhotoViewer photoViewer2 = (PhotoViewer) this.f46359b.f40060b;
                                        photoViewer2.f35843x3.setVisibility(4);
                                        photoViewer2.f35843x3.setImageDrawable(null);
                                        Bitmap bitmap = photoViewer2.C3;
                                        if (bitmap != null) {
                                            bitmap.recycle();
                                            photoViewer2.C3 = null;
                                            return;
                                        }
                                        return;
                                    default:
                                        PhotoViewer photoViewer3 = (PhotoViewer) this.f46359b.f40060b;
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
                        photoViewer.f35843x3.setImageDrawable(null);
                        Bitmap bitmap = photoViewer.C3;
                        if (bitmap != null) {
                            bitmap.recycle();
                            photoViewer.C3 = null;
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final i7 f46359b;

                    {
                        this.f46359b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                PhotoViewer photoViewer2 = (PhotoViewer) this.f46359b.f40060b;
                                photoViewer2.f35843x3.setVisibility(4);
                                photoViewer2.f35843x3.setImageDrawable(null);
                                Bitmap bitmap2 = photoViewer2.C3;
                                if (bitmap2 != null) {
                                    bitmap2.recycle();
                                    photoViewer2.C3 = null;
                                    return;
                                }
                                return;
                            default:
                                PhotoViewer photoViewer3 = (PhotoViewer) this.f46359b.f40060b;
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
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) this.f40060b;
                if (profileActivity.fragmentView != null) {
                    int i12 = ProfileActivity.R6;
                    profileActivity.I3();
                    profileActivity.r4(true);
                    profileActivity.fragmentView.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            default:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f40060b;
                int[][] iArr = WallpapersListActivity.f37606g0;
                if (wallpapersListActivity.getParentActivity() != null) {
                    int rotation3 = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (AndroidUtilities.isTablet()) {
                        wallpapersListActivity.N = 3;
                    } else if (rotation3 != 3 && rotation3 != 1) {
                        wallpapersListActivity.N = 3;
                    } else {
                        wallpapersListActivity.N = 5;
                    }
                    wallpapersListActivity.D0();
                }
                org.telegram.ui.Components.nm0 nm0Var2 = ((WallpapersListActivity) this.f40060b).F;
                if (nm0Var2 != null) {
                    nm0Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
        }
    }
}
