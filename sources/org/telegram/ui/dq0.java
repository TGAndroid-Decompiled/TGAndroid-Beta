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
public final class dq0 extends org.telegram.ui.Components.rl0 {
    public final Context f33787c;
    public final fq0 d;

    public dq0(fq0 fq0Var, Context context) {
        this.d = fq0Var;
        this.f33787c = context;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        fq0 fq0Var = this.d;
        if (fq0Var.G == null) {
            if (TextUtils.isEmpty(fq0Var.v)) {
                if (l1Var.f5788f != 3) {
                    return false;
                }
                return true;
            } else if (l1Var.b() >= fq0Var.f34321f.size()) {
                return false;
            } else {
                return true;
            }
        }
        return true;
    }

    @Override
    public final int h() {
        fq0 fq0Var = this.d;
        MediaController.AlbumEntry albumEntry = fq0Var.G;
        if (albumEntry == null) {
            if (fq0Var.f34321f.isEmpty()) {
                if (!TextUtils.isEmpty(fq0Var.v) || fq0Var.f34329n.isEmpty()) {
                    return 0;
                }
                return fq0Var.f34329n.size() + 2;
            }
            return fq0Var.f34321f.size() + (!fq0Var.f34336s ? 1 : 0);
        }
        return albumEntry.photos.size();
    }

    @Override
    public final long i(int i10) {
        return i10;
    }

    @Override
    public final int j(int i10) {
        fq0 fq0Var = this.d;
        if (fq0Var.V) {
            return 2;
        }
        if (fq0Var.G != null) {
            return 0;
        }
        if (fq0Var.f34321f.isEmpty()) {
            if (i10 == fq0Var.f34329n.size()) {
                return 4;
            }
            return 3;
        } else if (i10 < fq0Var.f34321f.size()) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        boolean L1;
        boolean z4;
        fq0 fq0Var = this.d;
        MediaController.AlbumEntry albumEntry = fq0Var.G;
        ArrayList arrayList = fq0Var.f34329n;
        ArrayList arrayList2 = fq0Var.f34317c;
        HashMap hashMap = fq0Var.f34315b;
        int i11 = l1Var.f5788f;
        View view = l1Var.f5785a;
        int i12 = -1;
        int i13 = 0;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view;
                        if (i10 < arrayList.size()) {
                            o8Var.m(R.drawable.msg_recent, (CharSequence) arrayList.get(i10), false);
                            return;
                        } else {
                            o8Var.m(R.drawable.msg_clear_recent, LocaleController.getString(R.string.ClearRecentHistory), false);
                            return;
                        }
                    }
                    return;
                }
                MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i10);
                org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
                i7Var.setPhotoEntry(photoEntry);
                i7Var.b(hashMap.containsKey(Integer.valueOf(photoEntry.imageId)), false);
                i7Var.setTag(Integer.valueOf(i10));
                return;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -1;
                layoutParams.height = fq0Var.O;
                view.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
        t5Var.setItemSize(fq0Var.O);
        org.telegram.ui.Components.p9 imageView = t5Var.getImageView();
        t5Var.setTag(Integer.valueOf(i10));
        imageView.q(0, true);
        if (albumEntry != null) {
            MediaController.PhotoEntry photoEntry2 = albumEntry.photos.get(i10);
            if (arrayList2.size() > 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            t5Var.d(photoEntry2, z4, true, false, false);
            if (fq0Var.e) {
                i12 = arrayList2.indexOf(Integer.valueOf(photoEntry2.imageId));
            }
            t5Var.b(i12, hashMap.containsKey(Integer.valueOf(photoEntry2.imageId)), false);
            L1 = PhotoViewer.L1(photoEntry2.path);
        } else {
            MediaController.SearchImage searchImage = (MediaController.SearchImage) fq0Var.f34321f.get(i10);
            t5Var.e(searchImage);
            t5Var.getVideoInfoContainer().setVisibility(4);
            if (fq0Var.e) {
                i12 = arrayList2.indexOf(searchImage.f16663id);
            }
            t5Var.b(i12, hashMap.containsKey(searchImage.f16663id), false);
            L1 = PhotoViewer.L1(searchImage.getPathToAttach());
        }
        imageView.getImageReceiver().setVisible(!L1, true);
        t5Var.getCheckBox().setVisibility((fq0Var.Q != 0 || L1) ? 8 : 8);
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        fq0 fq0Var = this.d;
        boolean z4 = fq0Var.f34331o0;
        int i11 = 0;
        Context context = this.f33787c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        org.telegram.ui.Cells.c3 c3Var = new org.telegram.ui.Cells.c3(context, null);
                        c3Var.setForceDarkTheme(z4);
                        viewGroup3 = c3Var;
                    } else {
                        org.telegram.ui.Cells.o8 o8Var = new org.telegram.ui.Cells.o8(23, context, true);
                        o8Var.setLayoutParams(new f2.w0(-1, -2));
                        viewGroup2 = o8Var;
                        if (z4) {
                            o8Var.f21527a.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, fq0Var.f34337s0, false));
                            o8Var.e.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20166rg, false), PorterDuff.Mode.MULTIPLY));
                            viewGroup2 = o8Var;
                        }
                    }
                } else {
                    viewGroup3 = new org.telegram.ui.Cells.i7(context, 1, null);
                }
            } else {
                ViewGroup frameLayout = new FrameLayout(context);
                frameLayout.setLayoutParams(new f2.w0(-1, -2));
                RadialProgressView radialProgressView = new RadialProgressView(context, null);
                radialProgressView.setProgressColor(-11371101);
                frameLayout.addView(radialProgressView, k7.b6.c(-1.0f, -1));
                viewGroup3 = frameLayout;
            }
            return new f2.l1(viewGroup3);
        }
        org.telegram.ui.Cells.t5 t5Var = new org.telegram.ui.Cells.t5(context, null);
        t5Var.setDelegate(new cq0(this));
        FrameLayout checkFrame = t5Var.getCheckFrame();
        if (fq0Var.Q != 0) {
            i11 = 8;
        }
        checkFrame.setVisibility(i11);
        viewGroup2 = t5Var;
        viewGroup3 = viewGroup2;
        return new f2.l1(viewGroup3);
    }
}
