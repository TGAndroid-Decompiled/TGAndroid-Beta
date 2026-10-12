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
public final class fr0 extends org.telegram.ui.Components.lm0 {
    public final Context f36218c;
    public final hr0 d;

    public fr0(hr0 hr0Var, Context context) {
        this.d = hr0Var;
        this.f36218c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        hr0 hr0Var = this.d;
        if (hr0Var.J == null) {
            if (TextUtils.isEmpty(hr0Var.v)) {
                if (b1Var.f44841f != 3) {
                    return false;
                }
                return true;
            } else if (b1Var.b() >= hr0Var.f36921f.size()) {
                return false;
            } else {
                return true;
            }
        }
        return true;
    }

    @Override
    public final int h() {
        hr0 hr0Var = this.d;
        MediaController.AlbumEntry albumEntry = hr0Var.J;
        if (albumEntry == null) {
            if (hr0Var.f36921f.isEmpty()) {
                if (!TextUtils.isEmpty(hr0Var.v) || hr0Var.f36929n.isEmpty()) {
                    return 0;
                }
                return hr0Var.f36929n.size() + 2;
            }
            return hr0Var.f36921f.size() + (!hr0Var.f36936s ? 1 : 0);
        }
        return albumEntry.photos.size();
    }

    @Override
    public final long i(int i10) {
        return i10;
    }

    @Override
    public final int j(int i10) {
        hr0 hr0Var = this.d;
        if (hr0Var.Y) {
            return 2;
        }
        if (hr0Var.J != null) {
            return 0;
        }
        if (hr0Var.f36921f.isEmpty()) {
            if (i10 == hr0Var.f36929n.size()) {
                return 4;
            }
            return 3;
        } else if (i10 < hr0Var.f36921f.size()) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        boolean M1;
        boolean z10;
        hr0 hr0Var = this.d;
        MediaController.AlbumEntry albumEntry = hr0Var.J;
        ArrayList arrayList = hr0Var.f36929n;
        ArrayList arrayList2 = hr0Var.f36917c;
        HashMap hashMap = hr0Var.f36915b;
        int i11 = b1Var.f44841f;
        View view = b1Var.f44838a;
        int i12 = -1;
        int i13 = 0;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                        if (i10 < arrayList.size()) {
                            r8Var.m(R.drawable.msg_recent, (CharSequence) arrayList.get(i10), false);
                            return;
                        } else {
                            r8Var.m(R.drawable.msg_clear_recent, LocaleController.getString(R.string.ClearRecentHistory), false);
                            return;
                        }
                    }
                    return;
                }
                MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i10);
                org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
                k7Var.setPhotoEntry(photoEntry);
                k7Var.b(hashMap.containsKey(Integer.valueOf(photoEntry.imageId)), false);
                k7Var.setTag(Integer.valueOf(i10));
                return;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -1;
                layoutParams.height = hr0Var.R;
                view.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
        t5Var.setItemSize(hr0Var.R);
        org.telegram.ui.Components.z9 imageView = t5Var.getImageView();
        t5Var.setTag(Integer.valueOf(i10));
        imageView.q(0, true);
        if (albumEntry != null) {
            MediaController.PhotoEntry photoEntry2 = albumEntry.photos.get(i10);
            if (arrayList2.size() > 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            t5Var.d(photoEntry2, z10, true, false, false);
            if (hr0Var.e) {
                i12 = arrayList2.indexOf(Integer.valueOf(photoEntry2.imageId));
            }
            t5Var.b(i12, hashMap.containsKey(Integer.valueOf(photoEntry2.imageId)), false);
            M1 = PhotoViewer.M1(photoEntry2.path);
        } else {
            MediaController.SearchImage searchImage = (MediaController.SearchImage) hr0Var.f36921f.get(i10);
            t5Var.e(searchImage);
            t5Var.getVideoInfoContainer().setVisibility(4);
            if (hr0Var.e) {
                i12 = arrayList2.indexOf(searchImage.f16702id);
            }
            t5Var.b(i12, hashMap.containsKey(searchImage.f16702id), false);
            M1 = PhotoViewer.M1(searchImage.getPathToAttach());
        }
        imageView.getImageReceiver().setVisible(!M1, true);
        t5Var.getCheckBox().setVisibility((hr0Var.T != 0 || M1) ? 8 : 8);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        hr0 hr0Var = this.d;
        boolean z10 = hr0Var.f36935r0;
        int i11 = 0;
        Context context = this.f36218c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        org.telegram.ui.Cells.d3 d3Var = new org.telegram.ui.Cells.d3(context, null);
                        d3Var.setForceDarkTheme(z10);
                        viewGroup3 = d3Var;
                    } else {
                        org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(23, context, true);
                        r8Var.setLayoutParams(new s4.o0(-1, -2));
                        viewGroup2 = r8Var;
                        if (z10) {
                            r8Var.f21759a.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, hr0Var.f36940v0, false));
                            r8Var.e.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20168rg, false), PorterDuff.Mode.MULTIPLY));
                            viewGroup2 = r8Var;
                        }
                    }
                } else {
                    viewGroup3 = new org.telegram.ui.Cells.k7(context, 1, null);
                }
            } else {
                ViewGroup frameLayout = new FrameLayout(context);
                frameLayout.setLayoutParams(new s4.o0(-1, -2));
                RadialProgressView radialProgressView = new RadialProgressView(context, null);
                radialProgressView.setProgressColor(-11371101);
                frameLayout.addView(radialProgressView, w7.a6.d(-1.0f, -1));
                viewGroup3 = frameLayout;
            }
            return new s4.b1(viewGroup3);
        }
        org.telegram.ui.Cells.t5 t5Var = new org.telegram.ui.Cells.t5(context, null);
        t5Var.setDelegate(new er0(this));
        FrameLayout checkFrame = t5Var.getCheckFrame();
        if (hr0Var.T != 0) {
            i11 = 8;
        }
        checkFrame.setVisibility(i11);
        viewGroup2 = t5Var;
        viewGroup3 = viewGroup2;
        return new s4.b1(viewGroup3);
    }
}
