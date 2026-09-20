package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.RadialProgressView;
public final class ar0 extends org.telegram.ui.Components.ul0 {
    public final Context f32149c;
    public final cr0 d;

    public ar0(cr0 cr0Var, Context context) {
        this.d = cr0Var;
        this.f32149c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        cr0 cr0Var = this.d;
        if (cr0Var.J == null) {
            if (TextUtils.isEmpty(cr0Var.v)) {
                if (c1Var.f42977f != 3) {
                    return false;
                }
                return true;
            } else if (c1Var.b() >= cr0Var.f32840f.size()) {
                return false;
            } else {
                return true;
            }
        }
        return true;
    }

    @Override
    public final int h() {
        cr0 cr0Var = this.d;
        MediaController.AlbumEntry albumEntry = cr0Var.J;
        if (albumEntry == null) {
            if (cr0Var.f32840f.isEmpty()) {
                if (!TextUtils.isEmpty(cr0Var.v) || cr0Var.f32848n.isEmpty()) {
                    return 0;
                }
                return cr0Var.f32848n.size() + 2;
            }
            return cr0Var.f32840f.size() + (!cr0Var.f32855s ? 1 : 0);
        }
        return albumEntry.photos.size();
    }

    @Override
    public final long i(int i10) {
        return i10;
    }

    @Override
    public final int j(int i10) {
        cr0 cr0Var = this.d;
        if (cr0Var.Y) {
            return 2;
        }
        if (cr0Var.J != null) {
            return 0;
        }
        if (cr0Var.f32840f.isEmpty()) {
            if (i10 == cr0Var.f32848n.size()) {
                return 4;
            }
            return 3;
        } else if (i10 < cr0Var.f32840f.size()) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean L1;
        boolean z10;
        cr0 cr0Var = this.d;
        MediaController.AlbumEntry albumEntry = cr0Var.J;
        ArrayList arrayList = cr0Var.f32848n;
        ArrayList arrayList2 = cr0Var.f32836c;
        HashMap hashMap = cr0Var.f32834b;
        int i11 = c1Var.f42977f;
        View view = c1Var.f42974a;
        int i12 = -1;
        int i13 = 0;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                        if (i10 < arrayList.size()) {
                            s8Var.m(R.drawable.msg_recent, (CharSequence) arrayList.get(i10), false);
                            return;
                        } else {
                            s8Var.m(R.drawable.msg_clear_recent, LocaleController.getString(R.string.ClearRecentHistory), false);
                            return;
                        }
                    }
                    return;
                }
                MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i10);
                org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) view;
                l7Var.setPhotoEntry(photoEntry);
                l7Var.b(hashMap.containsKey(Integer.valueOf(photoEntry.imageId)), false);
                l7Var.setTag(Integer.valueOf(i10));
                return;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -1;
                layoutParams.height = cr0Var.R;
                view.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) view;
        u5Var.setItemSize(cr0Var.R);
        org.telegram.ui.Components.v9 imageView = u5Var.getImageView();
        u5Var.setTag(Integer.valueOf(i10));
        imageView.q(0, true);
        if (albumEntry != null) {
            MediaController.PhotoEntry photoEntry2 = albumEntry.photos.get(i10);
            if (arrayList2.size() > 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            u5Var.d(photoEntry2, z10, true, false, false);
            if (cr0Var.e) {
                i12 = arrayList2.indexOf(Integer.valueOf(photoEntry2.imageId));
            }
            u5Var.b(i12, hashMap.containsKey(Integer.valueOf(photoEntry2.imageId)), false);
            L1 = PhotoViewer.L1(photoEntry2.path);
        } else {
            MediaController.SearchImage searchImage = (MediaController.SearchImage) cr0Var.f32840f.get(i10);
            u5Var.e(searchImage);
            u5Var.getVideoInfoContainer().setVisibility(4);
            if (cr0Var.e) {
                i12 = arrayList2.indexOf(searchImage.f15816id);
            }
            u5Var.b(i12, hashMap.containsKey(searchImage.f15816id), false);
            L1 = PhotoViewer.L1(searchImage.getPathToAttach());
        }
        imageView.getImageReceiver().setVisible(!L1, true);
        u5Var.getCheckBox().setVisibility((cr0Var.T != 0 || L1) ? 8 : 8);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        cr0 cr0Var = this.d;
        boolean z10 = cr0Var.f32854r0;
        int i11 = 0;
        Context context = this.f32149c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        org.telegram.ui.Cells.d3 d3Var = new org.telegram.ui.Cells.d3(context, null);
                        d3Var.setForceDarkTheme(z10);
                        viewGroup3 = d3Var;
                    } else {
                        org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(23, context, true);
                        s8Var.setLayoutParams(new s4.p0(-1, -2));
                        viewGroup2 = s8Var;
                        if (z10) {
                            s8Var.f21060a.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, cr0Var.f32859v0, false));
                            s8Var.e.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19361rg, false), PorterDuff.Mode.MULTIPLY));
                            viewGroup2 = s8Var;
                        }
                    }
                } else {
                    viewGroup3 = new org.telegram.ui.Cells.l7(context, 1, null);
                }
            } else {
                ViewGroup frameLayout = new FrameLayout(context);
                frameLayout.setLayoutParams(new s4.p0(-1, -2));
                RadialProgressView radialProgressView = new RadialProgressView(context, null);
                radialProgressView.setProgressColor(-11371101);
                frameLayout.addView(radialProgressView, w7.y5.c(-1.0f, -1));
                viewGroup3 = frameLayout;
            }
            return new s4.c1(viewGroup3);
        }
        org.telegram.ui.Cells.u5 u5Var = new org.telegram.ui.Cells.u5(context, null);
        u5Var.setDelegate(new zq0(this));
        FrameLayout checkFrame = u5Var.getCheckFrame();
        if (cr0Var.T != 0) {
            i11 = 8;
        }
        checkFrame.setVisibility(i11);
        viewGroup2 = u5Var;
        viewGroup3 = viewGroup2;
        return new s4.c1(viewGroup3);
    }
}
