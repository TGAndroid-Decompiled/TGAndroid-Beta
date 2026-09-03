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
public final class kq0 extends org.telegram.ui.Components.ql0 {
    public final Context f35575c;
    public final mq0 d;

    public kq0(mq0 mq0Var, Context context) {
        this.d = mq0Var;
        this.f35575c = context;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        mq0 mq0Var = this.d;
        if (mq0Var.G == null) {
            if (TextUtils.isEmpty(mq0Var.v)) {
                if (l1Var.f5777f != 3) {
                    return false;
                }
                return true;
            } else if (l1Var.b() >= mq0Var.f36169f.size()) {
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
            if (mq0Var.f36169f.isEmpty()) {
                if (!TextUtils.isEmpty(mq0Var.v) || mq0Var.f36177n.isEmpty()) {
                    return 0;
                }
                return mq0Var.f36177n.size() + 2;
            }
            return mq0Var.f36169f.size() + (!mq0Var.f36184s ? 1 : 0);
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
        if (mq0Var.f36169f.isEmpty()) {
            if (i10 == mq0Var.f36177n.size()) {
                return 4;
            }
            return 3;
        } else if (i10 < mq0Var.f36169f.size()) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        boolean L1;
        boolean z4;
        mq0 mq0Var = this.d;
        MediaController.AlbumEntry albumEntry = mq0Var.G;
        ArrayList arrayList = mq0Var.f36177n;
        ArrayList arrayList2 = mq0Var.f36165c;
        HashMap hashMap = mq0Var.f36163b;
        int i11 = l1Var.f5777f;
        View view = l1Var.f5774a;
        int i12 = -1;
        int i13 = 0;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
                        if (i10 < arrayList.size()) {
                            n8Var.m(R.drawable.msg_recent, (CharSequence) arrayList.get(i10), false);
                            return;
                        } else {
                            n8Var.m(R.drawable.msg_clear_recent, LocaleController.getString(R.string.ClearRecentHistory), false);
                            return;
                        }
                    }
                    return;
                }
                MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i10);
                org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
                h7Var.setPhotoEntry(photoEntry);
                h7Var.b(hashMap.containsKey(Integer.valueOf(photoEntry.imageId)), false);
                h7Var.setTag(Integer.valueOf(i10));
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
        org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view;
        s5Var.setItemSize(mq0Var.O);
        org.telegram.ui.Components.p9 imageView = s5Var.getImageView();
        s5Var.setTag(Integer.valueOf(i10));
        imageView.q(0, true);
        if (albumEntry != null) {
            MediaController.PhotoEntry photoEntry2 = albumEntry.photos.get(i10);
            if (arrayList2.size() > 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            s5Var.d(photoEntry2, z4, true, false, false);
            if (mq0Var.e) {
                i12 = arrayList2.indexOf(Integer.valueOf(photoEntry2.imageId));
            }
            s5Var.b(i12, hashMap.containsKey(Integer.valueOf(photoEntry2.imageId)), false);
            L1 = PhotoViewer.L1(photoEntry2.path);
        } else {
            MediaController.SearchImage searchImage = (MediaController.SearchImage) mq0Var.f36169f.get(i10);
            s5Var.e(searchImage);
            s5Var.getVideoInfoContainer().setVisibility(4);
            if (mq0Var.e) {
                i12 = arrayList2.indexOf(searchImage.f16643id);
            }
            s5Var.b(i12, hashMap.containsKey(searchImage.f16643id), false);
            L1 = PhotoViewer.L1(searchImage.getPathToAttach());
        }
        imageView.getImageReceiver().setVisible(!L1, true);
        s5Var.getCheckBox().setVisibility((mq0Var.Q != 0 || L1) ? 8 : 8);
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        mq0 mq0Var = this.d;
        boolean z4 = mq0Var.f36179o0;
        int i11 = 0;
        Context context = this.f35575c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        org.telegram.ui.Cells.b3 b3Var = new org.telegram.ui.Cells.b3(context, null);
                        b3Var.setForceDarkTheme(z4);
                        viewGroup3 = b3Var;
                    } else {
                        org.telegram.ui.Cells.n8 n8Var = new org.telegram.ui.Cells.n8(23, context, true);
                        n8Var.setLayoutParams(new f2.w0(-1, -2));
                        viewGroup2 = n8Var;
                        if (z4) {
                            n8Var.f21437a.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, mq0Var.f36185s0, false));
                            n8Var.e.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20141rg, false), PorterDuff.Mode.MULTIPLY));
                            viewGroup2 = n8Var;
                        }
                    }
                } else {
                    viewGroup3 = new org.telegram.ui.Cells.h7(context, 1, null);
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
        org.telegram.ui.Cells.s5 s5Var = new org.telegram.ui.Cells.s5(context, null);
        s5Var.setDelegate(new jq0(this));
        FrameLayout checkFrame = s5Var.getCheckFrame();
        if (mq0Var.Q != 0) {
            i11 = 8;
        }
        checkFrame.setVisibility(i11);
        viewGroup2 = s5Var;
        viewGroup3 = viewGroup2;
        return new f2.l1(viewGroup3);
    }
}
