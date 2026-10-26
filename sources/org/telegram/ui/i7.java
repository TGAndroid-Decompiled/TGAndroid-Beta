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
    public final int f40159a;
    public final Object f40160b;

    public i7(Object obj, int i10) {
        this.f40159a = i10;
        this.f40160b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f40159a) {
            case 0:
                x7 x7Var = (x7) this.f40160b;
                FrameLayout frameLayout = x7Var.f45680c;
                if (!x7Var.f45687y) {
                    float max = Math.max(0.0f, x7Var.f45686x - x7Var.getY());
                    if (frameLayout.getTranslationY() != max) {
                        frameLayout.setTranslationY(max);
                    }
                }
                return true;
            case 1:
                un unVar = (un) this.f40160b;
                ij ijVar = unVar.f44330m1;
                if (ijVar != null) {
                    ijVar.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return unVar.A8();
            case 2:
                ((fi.f6) this.f40160b).invalidate();
                return true;
            case 3:
                View view = ((i70) this.f40160b).fragmentView;
                if (view != null) {
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                    int rotation = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (rotation != 3 && rotation != 1) {
                        ((i70) this.f40160b).f40164f.setOrientation(1);
                    } else {
                        ((i70) this.f40160b).f40164f.setOrientation(0);
                    }
                    View view2 = ((i70) this.f40160b).fragmentView;
                    view2.setPadding(view2.getPaddingLeft(), 0, ((i70) this.f40160b).fragmentView.getPaddingRight(), ((i70) this.f40160b).fragmentView.getPaddingBottom());
                }
                return true;
            case 4:
                org.telegram.ui.Components.r71 r71Var = (org.telegram.ui.Components.r71) this.f40160b;
                r71Var.getViewTreeObserver().removeOnPreDrawListener(this);
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < r71Var.getChildCount(); i10++) {
                    arrayList.add(r71Var.getChildAt(i10));
                }
                Collections.sort(arrayList, new bv(4));
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    View view3 = (View) arrayList.get(i11);
                    view3.animate().cancel();
                    view3.setAlpha(0.0f);
                    view3.setTranslationY(AndroidUtilities.dp(24.0f));
                    view3.animate().alpha(1.0f).translationY(0.0f).setStartDelay(i11 * 40).setDuration(360L).setInterpolator(org.telegram.ui.Components.ds.h).start();
                }
                return true;
            case 5:
                aq0 aq0Var = (aq0) this.f40160b;
                if (aq0Var.getParentActivity() != null) {
                    int rotation2 = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    aq0Var.f37878f = 2;
                    if (!AndroidUtilities.isTablet() && (rotation2 == 3 || rotation2 == 1)) {
                        aq0Var.f37878f = 4;
                    }
                    aq0Var.f37879n.l();
                }
                org.telegram.ui.Components.mm0 mm0Var = ((aq0) this.f40160b).h;
                if (mm0Var != null) {
                    mm0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            case 6:
                PhotoViewer photoViewer = (PhotoViewer) this.f40160b;
                photoViewer.f35809w3.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = photoViewer.f35819x3;
                if (imageView != null) {
                    if (photoViewer.J3) {
                        AndroidUtilities.runOnUIThread(new Runnable(this) {
                            public final i7 f45855b;

                            {
                                this.f45855b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        PhotoViewer photoViewer2 = (PhotoViewer) this.f45855b.f40160b;
                                        photoViewer2.f35819x3.setVisibility(4);
                                        photoViewer2.f35819x3.setImageDrawable(null);
                                        Bitmap bitmap = photoViewer2.C3;
                                        if (bitmap != null) {
                                            bitmap.recycle();
                                            photoViewer2.C3 = null;
                                            return;
                                        }
                                        return;
                                    default:
                                        PhotoViewer photoViewer3 = (PhotoViewer) this.f45855b.f40160b;
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
                        photoViewer.f35819x3.setImageDrawable(null);
                        Bitmap bitmap = photoViewer.C3;
                        if (bitmap != null) {
                            bitmap.recycle();
                            photoViewer.C3 = null;
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final i7 f45855b;

                    {
                        this.f45855b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                PhotoViewer photoViewer2 = (PhotoViewer) this.f45855b.f40160b;
                                photoViewer2.f35819x3.setVisibility(4);
                                photoViewer2.f35819x3.setImageDrawable(null);
                                Bitmap bitmap2 = photoViewer2.C3;
                                if (bitmap2 != null) {
                                    bitmap2.recycle();
                                    photoViewer2.C3 = null;
                                    return;
                                }
                                return;
                            default:
                                PhotoViewer photoViewer3 = (PhotoViewer) this.f45855b.f40160b;
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
            case 7:
                ProfileActivity profileActivity = (ProfileActivity) this.f40160b;
                if (profileActivity.fragmentView != null) {
                    int i12 = ProfileActivity.R6;
                    profileActivity.I3();
                    profileActivity.r4(true);
                    profileActivity.fragmentView.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            default:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f40160b;
                int[][] iArr = WallpapersListActivity.f37582g0;
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
                org.telegram.ui.Components.mm0 mm0Var2 = ((WallpapersListActivity) this.f40160b).F;
                if (mm0Var2 != null) {
                    mm0Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
        }
    }
}
