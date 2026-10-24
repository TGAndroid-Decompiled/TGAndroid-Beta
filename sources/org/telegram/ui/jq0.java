package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
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
public final class jq0 extends org.telegram.ui.Components.km0 {
    public final Context f38615c;
    public final lq0 d;

    public jq0(lq0 lq0Var, Context context) {
        this.d = lq0Var;
        this.f38615c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        lq0 lq0Var = this.d;
        if (lq0Var.J == null) {
            if (TextUtils.isEmpty(lq0Var.v)) {
                if (b1Var.f46345f != 3) {
                    return false;
                }
                return true;
            } else if (b1Var.b() >= lq0Var.f39341f.size()) {
                return false;
            } else {
                return true;
            }
        }
        return true;
    }

    @Override
    public final int h() {
        lq0 lq0Var = this.d;
        MediaController.AlbumEntry albumEntry = lq0Var.J;
        if (albumEntry == null) {
            if (lq0Var.f39341f.isEmpty()) {
                if (!TextUtils.isEmpty(lq0Var.v) || lq0Var.f39349n.isEmpty()) {
                    return 0;
                }
                return lq0Var.f39349n.size() + 2;
            }
            return lq0Var.f39341f.size() + (!lq0Var.f39356s ? 1 : 0);
        }
        return albumEntry.photos.size();
    }

    @Override
    public final long i(int i10) {
        return i10;
    }

    @Override
    public final int j(int i10) {
        lq0 lq0Var = this.d;
        if (lq0Var.Y) {
            return 2;
        }
        if (lq0Var.J != null) {
            return 0;
        }
        if (lq0Var.f39341f.isEmpty()) {
            if (i10 == lq0Var.f39349n.size()) {
                return 4;
            }
            return 3;
        } else if (i10 < lq0Var.f39341f.size()) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        boolean O1;
        boolean z10;
        lq0 lq0Var = this.d;
        MediaController.AlbumEntry albumEntry = lq0Var.J;
        ArrayList arrayList = lq0Var.f39349n;
        ArrayList arrayList2 = lq0Var.f39337c;
        HashMap hashMap = lq0Var.f39335b;
        int i11 = b1Var.f46345f;
        View view = b1Var.f46342a;
        int i12 = -1;
        int i13 = 0;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                        if (i10 < arrayList.size()) {
                            r8Var.o(R.drawable.msg_recent, (CharSequence) arrayList.get(i10), false);
                            return;
                        } else {
                            r8Var.o(R.drawable.msg_clear_recent, LocaleController.getString(R.string.ClearRecentHistory), false);
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
                layoutParams.height = lq0Var.R;
                view.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view;
        s5Var.setItemSize(lq0Var.R);
        org.telegram.ui.Components.u9 imageView = s5Var.getImageView();
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
            if (lq0Var.e) {
                i12 = arrayList2.indexOf(Integer.valueOf(photoEntry2.imageId));
            }
            s5Var.b(i12, hashMap.containsKey(Integer.valueOf(photoEntry2.imageId)), false);
            O1 = PhotoViewer.O1(photoEntry2.path);
        } else {
            MediaController.SearchImage searchImage = (MediaController.SearchImage) lq0Var.f39341f.get(i10);
            s5Var.e(searchImage);
            s5Var.getVideoInfoContainer().setVisibility(4);
            if (lq0Var.e) {
                i12 = arrayList2.indexOf(searchImage.f17856id);
            }
            s5Var.b(i12, hashMap.containsKey(searchImage.f17856id), false);
            O1 = PhotoViewer.O1(searchImage.getPathToAttach());
        }
        imageView.getImageReceiver().setVisible(!O1, true);
        s5Var.getCheckBox().setVisibility((lq0Var.T != 0 || O1) ? 8 : 8);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        int i11;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        lq0 lq0Var = this.d;
        boolean z10 = lq0Var.f39355r0;
        Context context = this.f38615c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        org.telegram.ui.Cells.b3 b3Var = new org.telegram.ui.Cells.b3(context, null);
                        b3Var.setForceDarkTheme(z10);
                        viewGroup3 = b3Var;
                    } else {
                        org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(23, context, true);
                        r8Var.setLayoutParams(new s4.o0(-1, -2));
                        viewGroup2 = r8Var;
                        if (z10) {
                            org.telegram.ui.ActionBar.r6.Z(r8Var.f23109a, lq0Var.f39360v0, null);
                            org.telegram.ui.ActionBar.r6.t(r8Var.e, org.telegram.ui.ActionBar.k6.f21451rg, null, PorterDuff.Mode.MULTIPLY);
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
                frameLayout.addView(radialProgressView, w7.z5.c(-1.0f, -1));
                viewGroup3 = frameLayout;
            }
            return new s4.b1(viewGroup3);
        }
        org.telegram.ui.Cells.s5 s5Var = new org.telegram.ui.Cells.s5(context, null);
        s5Var.setDelegate(new iq0(this));
        FrameLayout checkFrame = s5Var.getCheckFrame();
        if (lq0Var.T != 0) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        checkFrame.setVisibility(i11);
        viewGroup2 = s5Var;
        viewGroup3 = viewGroup2;
        return new s4.b1(viewGroup3);
    }
}
