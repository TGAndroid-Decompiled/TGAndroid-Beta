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
public final class hq0 extends org.telegram.ui.Components.hm0 {
    public final Context f37708c;
    public final jq0 d;

    public hq0(jq0 jq0Var, Context context) {
        this.d = jq0Var;
        this.f37708c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        jq0 jq0Var = this.d;
        if (jq0Var.J == null) {
            if (TextUtils.isEmpty(jq0Var.v)) {
                if (b1Var.f45915f != 3) {
                    return false;
                }
                return true;
            } else if (b1Var.b() >= jq0Var.f38302f.size()) {
                return false;
            } else {
                return true;
            }
        }
        return true;
    }

    @Override
    public final int h() {
        jq0 jq0Var = this.d;
        MediaController.AlbumEntry albumEntry = jq0Var.J;
        if (albumEntry == null) {
            if (jq0Var.f38302f.isEmpty()) {
                if (!TextUtils.isEmpty(jq0Var.v) || jq0Var.f38310n.isEmpty()) {
                    return 0;
                }
                return jq0Var.f38310n.size() + 2;
            }
            return jq0Var.f38302f.size() + (!jq0Var.f38317s ? 1 : 0);
        }
        return albumEntry.photos.size();
    }

    @Override
    public final long i(int i10) {
        return i10;
    }

    @Override
    public final int j(int i10) {
        jq0 jq0Var = this.d;
        if (jq0Var.Y) {
            return 2;
        }
        if (jq0Var.J != null) {
            return 0;
        }
        if (jq0Var.f38302f.isEmpty()) {
            if (i10 == jq0Var.f38310n.size()) {
                return 4;
            }
            return 3;
        } else if (i10 < jq0Var.f38302f.size()) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        boolean M1;
        boolean z10;
        jq0 jq0Var = this.d;
        MediaController.AlbumEntry albumEntry = jq0Var.J;
        ArrayList arrayList = jq0Var.f38310n;
        ArrayList arrayList2 = jq0Var.f38298c;
        HashMap hashMap = jq0Var.f38296b;
        int i11 = b1Var.f45915f;
        View view = b1Var.f45912a;
        int i12 = -1;
        int i13 = 0;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                        if (i10 < arrayList.size()) {
                            q8Var.m(R.drawable.msg_recent, (CharSequence) arrayList.get(i10), false);
                            return;
                        } else {
                            q8Var.m(R.drawable.msg_clear_recent, LocaleController.getString(R.string.ClearRecentHistory), false);
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
                layoutParams.height = jq0Var.R;
                view.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view;
        s5Var.setItemSize(jq0Var.R);
        org.telegram.ui.Components.w9 imageView = s5Var.getImageView();
        s5Var.setTag(Integer.valueOf(i10));
        imageView.q(0, true);
        if (albumEntry != null) {
            MediaController.PhotoEntry photoEntry2 = albumEntry.photos.get(i10);
            if (arrayList2.size() > 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            s5Var.d(photoEntry2, z10, true, false, false);
            if (jq0Var.e) {
                i12 = arrayList2.indexOf(Integer.valueOf(photoEntry2.imageId));
            }
            s5Var.b(i12, hashMap.containsKey(Integer.valueOf(photoEntry2.imageId)), false);
            M1 = PhotoViewer.M1(photoEntry2.path);
        } else {
            MediaController.SearchImage searchImage = (MediaController.SearchImage) jq0Var.f38302f.get(i10);
            s5Var.e(searchImage);
            s5Var.getVideoInfoContainer().setVisibility(4);
            if (jq0Var.e) {
                i12 = arrayList2.indexOf(searchImage.f17793id);
            }
            s5Var.b(i12, hashMap.containsKey(searchImage.f17793id), false);
            M1 = PhotoViewer.M1(searchImage.getPathToAttach());
        }
        imageView.getImageReceiver().setVisible(!M1, true);
        s5Var.getCheckBox().setVisibility((jq0Var.T != 0 || M1) ? 8 : 8);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        jq0 jq0Var = this.d;
        boolean z10 = jq0Var.f38316r0;
        int i11 = 0;
        Context context = this.f37708c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        org.telegram.ui.Cells.c3 c3Var = new org.telegram.ui.Cells.c3(context, null);
                        c3Var.setForceDarkTheme(z10);
                        viewGroup3 = c3Var;
                    } else {
                        org.telegram.ui.Cells.q8 q8Var = new org.telegram.ui.Cells.q8(23, context, true);
                        q8Var.setLayoutParams(new s4.o0(-1, -2));
                        viewGroup2 = q8Var;
                        if (z10) {
                            q8Var.f22779a.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, jq0Var.f38321v0, false));
                            q8Var.e.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21254rg, false), PorterDuff.Mode.MULTIPLY));
                            viewGroup2 = q8Var;
                        }
                    }
                } else {
                    viewGroup3 = new org.telegram.ui.Cells.i7(context, 1, null);
                }
            } else {
                ViewGroup frameLayout = new FrameLayout(context);
                frameLayout.setLayoutParams(new s4.o0(-1, -2));
                RadialProgressView radialProgressView = new RadialProgressView(context, null);
                radialProgressView.setProgressColor(-11371101);
                frameLayout.addView(radialProgressView, w7.z5.c(-1.0f, -1));
                viewGroup3 = frameLayout;
            }
            return new s4.b1(viewGroup3);
        }
        org.telegram.ui.Cells.s5 s5Var = new org.telegram.ui.Cells.s5(context, null);
        s5Var.setDelegate(new gq0(this));
        FrameLayout checkFrame = s5Var.getCheckFrame();
        if (jq0Var.T != 0) {
            i11 = 8;
        }
        checkFrame.setVisibility(i11);
        viewGroup2 = s5Var;
        viewGroup3 = viewGroup2;
        return new s4.b1(viewGroup3);
    }
}
