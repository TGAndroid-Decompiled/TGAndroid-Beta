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
public final class kq0 extends org.telegram.ui.Components.rl0 {
    public final Context f38401c;
    public final mq0 d;

    public kq0(mq0 mq0Var, Context context) {
        this.d = mq0Var;
        this.f38401c = context;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        mq0 mq0Var = this.d;
        if (mq0Var.G == null) {
            if (TextUtils.isEmpty(mq0Var.v)) {
                if (m1Var.f5879f != 3) {
                    return false;
                }
                return true;
            } else if (m1Var.b() >= mq0Var.f39040f.size()) {
                return false;
            } else {
                return true;
            }
        }
        return true;
    }

    @Override
    public final int h() {
        mq0 mq0Var = this.d;
        MediaController.AlbumEntry albumEntry = mq0Var.G;
        if (albumEntry == null) {
            if (mq0Var.f39040f.isEmpty()) {
                if (!TextUtils.isEmpty(mq0Var.v) || mq0Var.f39048n.isEmpty()) {
                    return 0;
                }
                return mq0Var.f39048n.size() + 2;
            }
            return mq0Var.f39040f.size() + (!mq0Var.f39055s ? 1 : 0);
        }
        return albumEntry.photos.size();
    }

    @Override
    public final long i(int i10) {
        return i10;
    }

    @Override
    public final int j(int i10) {
        mq0 mq0Var = this.d;
        if (mq0Var.V) {
            return 2;
        }
        if (mq0Var.G != null) {
            return 0;
        }
        if (mq0Var.f39040f.isEmpty()) {
            if (i10 == mq0Var.f39048n.size()) {
                return 4;
            }
            return 3;
        } else if (i10 < mq0Var.f39040f.size()) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        boolean L1;
        boolean z4;
        mq0 mq0Var = this.d;
        MediaController.AlbumEntry albumEntry = mq0Var.G;
        ArrayList arrayList = mq0Var.f39048n;
        ArrayList arrayList2 = mq0Var.f39035c;
        HashMap hashMap = mq0Var.f39033b;
        int i11 = m1Var.f5879f;
        View view = m1Var.f5875a;
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
                layoutParams.height = mq0Var.O;
                view.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
        t5Var.setItemSize(mq0Var.O);
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
            if (mq0Var.f39038e) {
                i12 = arrayList2.indexOf(Integer.valueOf(photoEntry2.imageId));
            }
            t5Var.b(i12, hashMap.containsKey(Integer.valueOf(photoEntry2.imageId)), false);
            L1 = PhotoViewer.L1(photoEntry2.path);
        } else {
            MediaController.SearchImage searchImage = (MediaController.SearchImage) mq0Var.f39040f.get(i10);
            t5Var.e(searchImage);
            t5Var.getVideoInfoContainer().setVisibility(4);
            if (mq0Var.f39038e) {
                i12 = arrayList2.indexOf(searchImage.f18051id);
            }
            t5Var.b(i12, hashMap.containsKey(searchImage.f18051id), false);
            L1 = PhotoViewer.L1(searchImage.getPathToAttach());
        }
        imageView.getImageReceiver().setVisible(!L1, true);
        t5Var.getCheckBox().setVisibility((mq0Var.Q != 0 || L1) ? 8 : 8);
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        mq0 mq0Var = this.d;
        boolean z4 = mq0Var.f39050o0;
        int i11 = 0;
        Context context = this.f38401c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        org.telegram.ui.Cells.c3 c3Var = new org.telegram.ui.Cells.c3(context, null);
                        c3Var.setForceDarkTheme(z4);
                        viewGroup3 = c3Var;
                    } else {
                        org.telegram.ui.Cells.o8 o8Var = new org.telegram.ui.Cells.o8(23, context, true);
                        o8Var.setLayoutParams(new f2.x0(-1, -2));
                        viewGroup2 = o8Var;
                        if (z4) {
                            o8Var.f23312a.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, mq0Var.f39056s0, false));
                            o8Var.f23315e.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21922rg, false), PorterDuff.Mode.MULTIPLY));
                            viewGroup2 = o8Var;
                        }
                    }
                } else {
                    viewGroup3 = new org.telegram.ui.Cells.i7(context, 1, null);
                }
            } else {
                ViewGroup frameLayout = new FrameLayout(context);
                frameLayout.setLayoutParams(new f2.x0(-1, -2));
                RadialProgressView radialProgressView = new RadialProgressView(context, null);
                radialProgressView.setProgressColor(-11371101);
                frameLayout.addView(radialProgressView, k7.c6.c(-1.0f, -1));
                viewGroup3 = frameLayout;
            }
            return new f2.m1(viewGroup3);
        }
        org.telegram.ui.Cells.t5 t5Var = new org.telegram.ui.Cells.t5(context, null);
        t5Var.setDelegate(new jq0(this));
        FrameLayout checkFrame = t5Var.getCheckFrame();
        if (mq0Var.Q != 0) {
            i11 = 8;
        }
        checkFrame.setVisibility(i11);
        viewGroup2 = t5Var;
        viewGroup3 = viewGroup2;
        return new f2.m1(viewGroup3);
    }
}
