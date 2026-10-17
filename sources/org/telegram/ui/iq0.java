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
public final class iq0 extends org.telegram.ui.Components.hm0 {
    public final Context f37957c;
    public final kq0 d;

    public iq0(kq0 kq0Var, Context context) {
        this.d = kq0Var;
        this.f37957c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        kq0 kq0Var = this.d;
        if (kq0Var.J == null) {
            if (TextUtils.isEmpty(kq0Var.v)) {
                if (b1Var.f45941f != 3) {
                    return false;
                }
                return true;
            } else if (b1Var.b() >= kq0Var.f38645f.size()) {
                return false;
            } else {
                return true;
            }
        }
        return true;
    }

    @Override
    public final int h() {
        kq0 kq0Var = this.d;
        MediaController.AlbumEntry albumEntry = kq0Var.J;
        if (albumEntry == null) {
            if (kq0Var.f38645f.isEmpty()) {
                if (!TextUtils.isEmpty(kq0Var.v) || kq0Var.f38653n.isEmpty()) {
                    return 0;
                }
                return kq0Var.f38653n.size() + 2;
            }
            return kq0Var.f38645f.size() + (!kq0Var.f38660s ? 1 : 0);
        }
        return albumEntry.photos.size();
    }

    @Override
    public final long i(int i10) {
        return i10;
    }

    @Override
    public final int j(int i10) {
        kq0 kq0Var = this.d;
        if (kq0Var.Y) {
            return 2;
        }
        if (kq0Var.J != null) {
            return 0;
        }
        if (kq0Var.f38645f.isEmpty()) {
            if (i10 == kq0Var.f38653n.size()) {
                return 4;
            }
            return 3;
        } else if (i10 < kq0Var.f38645f.size()) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        boolean M1;
        boolean z10;
        kq0 kq0Var = this.d;
        MediaController.AlbumEntry albumEntry = kq0Var.J;
        ArrayList arrayList = kq0Var.f38653n;
        ArrayList arrayList2 = kq0Var.f38641c;
        HashMap hashMap = kq0Var.f38639b;
        int i11 = b1Var.f45941f;
        View view = b1Var.f45938a;
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
                layoutParams.height = kq0Var.R;
                view.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view;
        s5Var.setItemSize(kq0Var.R);
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
            if (kq0Var.e) {
                i12 = arrayList2.indexOf(Integer.valueOf(photoEntry2.imageId));
            }
            s5Var.b(i12, hashMap.containsKey(Integer.valueOf(photoEntry2.imageId)), false);
            M1 = PhotoViewer.M1(photoEntry2.path);
        } else {
            MediaController.SearchImage searchImage = (MediaController.SearchImage) kq0Var.f38645f.get(i10);
            s5Var.e(searchImage);
            s5Var.getVideoInfoContainer().setVisibility(4);
            if (kq0Var.e) {
                i12 = arrayList2.indexOf(searchImage.f17789id);
            }
            s5Var.b(i12, hashMap.containsKey(searchImage.f17789id), false);
            M1 = PhotoViewer.M1(searchImage.getPathToAttach());
        }
        imageView.getImageReceiver().setVisible(!M1, true);
        s5Var.getCheckBox().setVisibility((kq0Var.T != 0 || M1) ? 8 : 8);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        kq0 kq0Var = this.d;
        boolean z10 = kq0Var.f38659r0;
        int i11 = 0;
        Context context = this.f37957c;
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
                            q8Var.f22781a.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, kq0Var.f38664v0, false));
                            q8Var.e.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21253rg, false), PorterDuff.Mode.MULTIPLY));
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
                frameLayout.addView(radialProgressView, w7.z5.d(-1.0f, -1));
                viewGroup3 = frameLayout;
            }
            return new s4.b1(viewGroup3);
        }
        org.telegram.ui.Cells.s5 s5Var = new org.telegram.ui.Cells.s5(context, null);
        s5Var.setDelegate(new hq0(this));
        FrameLayout checkFrame = s5Var.getCheckFrame();
        if (kq0Var.T != 0) {
            i11 = 8;
        }
        checkFrame.setVisibility(i11);
        viewGroup2 = s5Var;
        viewGroup3 = viewGroup2;
        return new s4.b1(viewGroup3);
    }
}
