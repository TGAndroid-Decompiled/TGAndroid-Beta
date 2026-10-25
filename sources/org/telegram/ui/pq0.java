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
public final class pq0 extends org.telegram.ui.Components.lm0 {
    public final Context f42641c;
    public final rq0 d;

    public pq0(rq0 rq0Var, Context context) {
        this.d = rq0Var;
        this.f42641c = context;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        rq0 rq0Var = this.d;
        if (rq0Var.J == null) {
            if (TextUtils.isEmpty(rq0Var.v)) {
                if (e1Var.f47738f != 3) {
                    return false;
                }
                return true;
            } else if (e1Var.b() >= rq0Var.f43247f.size()) {
                return false;
            } else {
                return true;
            }
        }
        return true;
    }

    @Override
    public final int h() {
        rq0 rq0Var = this.d;
        MediaController.AlbumEntry albumEntry = rq0Var.J;
        if (albumEntry == null) {
            if (rq0Var.f43247f.isEmpty()) {
                if (!TextUtils.isEmpty(rq0Var.v) || rq0Var.f43255n.isEmpty()) {
                    return 0;
                }
                return rq0Var.f43255n.size() + 2;
            }
            return rq0Var.f43247f.size() + (!rq0Var.f43262s ? 1 : 0);
        }
        return albumEntry.photos.size();
    }

    @Override
    public final long i(int i10) {
        return i10;
    }

    @Override
    public final int j(int i10) {
        rq0 rq0Var = this.d;
        if (rq0Var.Y) {
            return 2;
        }
        if (rq0Var.J != null) {
            return 0;
        }
        if (rq0Var.f43247f.isEmpty()) {
            if (i10 == rq0Var.f43255n.size()) {
                return 4;
            }
            return 3;
        } else if (i10 < rq0Var.f43247f.size()) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        boolean O1;
        boolean z10;
        rq0 rq0Var = this.d;
        MediaController.AlbumEntry albumEntry = rq0Var.J;
        ArrayList arrayList = rq0Var.f43255n;
        ArrayList arrayList2 = rq0Var.f43243c;
        HashMap hashMap = rq0Var.f43241b;
        int i11 = e1Var.f47738f;
        View view = e1Var.f47735a;
        int i12 = -1;
        int i13 = 0;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
                        if (i10 < arrayList.size()) {
                            v8Var.o(R.drawable.msg_recent, (CharSequence) arrayList.get(i10), false);
                            return;
                        } else {
                            v8Var.o(R.drawable.msg_clear_recent, LocaleController.getString(R.string.ClearRecentHistory), false);
                            return;
                        }
                    }
                    return;
                }
                MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i10);
                org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
                o7Var.setPhotoEntry(photoEntry);
                o7Var.b(hashMap.containsKey(Integer.valueOf(photoEntry.imageId)), false);
                o7Var.setTag(Integer.valueOf(i10));
                return;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -1;
                layoutParams.height = rq0Var.R;
                view.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.x5 x5Var = (org.telegram.ui.Cells.x5) view;
        x5Var.setItemSize(rq0Var.R);
        org.telegram.ui.Components.y9 imageView = x5Var.getImageView();
        x5Var.setTag(Integer.valueOf(i10));
        imageView.q(0, true);
        if (albumEntry != null) {
            MediaController.PhotoEntry photoEntry2 = albumEntry.photos.get(i10);
            if (arrayList2.size() > 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            x5Var.d(photoEntry2, z10, true, false, false);
            if (rq0Var.e) {
                i12 = arrayList2.indexOf(Integer.valueOf(photoEntry2.imageId));
            }
            x5Var.b(i12, hashMap.containsKey(Integer.valueOf(photoEntry2.imageId)), false);
            O1 = PhotoViewer.O1(photoEntry2.path);
        } else {
            MediaController.SearchImage searchImage = (MediaController.SearchImage) rq0Var.f43247f.get(i10);
            x5Var.e(searchImage);
            x5Var.getVideoInfoContainer().setVisibility(4);
            if (rq0Var.e) {
                i12 = arrayList2.indexOf(searchImage.f19543id);
            }
            x5Var.b(i12, hashMap.containsKey(searchImage.f19543id), false);
            O1 = PhotoViewer.O1(searchImage.getPathToAttach());
        }
        imageView.getImageReceiver().setVisible(!O1, true);
        x5Var.getCheckBox().setVisibility((rq0Var.T != 0 || O1) ? 8 : 8);
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        int i11;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        rq0 rq0Var = this.d;
        boolean z10 = rq0Var.f43261r0;
        Context context = this.f42641c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        org.telegram.ui.Cells.a3 a3Var = new org.telegram.ui.Cells.a3(context, null);
                        a3Var.setForceDarkTheme(z10);
                        viewGroup3 = a3Var;
                    } else {
                        org.telegram.ui.Cells.v8 v8Var = new org.telegram.ui.Cells.v8(23, context, true);
                        v8Var.setLayoutParams(new s4.q0(-1, -2));
                        viewGroup2 = v8Var;
                        if (z10) {
                            org.telegram.ui.ActionBar.f7.Y(v8Var.f25591a, rq0Var.f43266v0, null);
                            org.telegram.ui.ActionBar.f7.t(v8Var.e, org.telegram.ui.ActionBar.y6.f23622rg, null, PorterDuff.Mode.MULTIPLY);
                            viewGroup2 = v8Var;
                        }
                    }
                } else {
                    viewGroup3 = new org.telegram.ui.Cells.o7(context, 1, null);
                }
            } else {
                ViewGroup frameLayout = new FrameLayout(context);
                frameLayout.setLayoutParams(new s4.q0(-1, -2));
                RadialProgressView radialProgressView = new RadialProgressView(context, null);
                radialProgressView.setProgressColor(-11371101);
                frameLayout.addView(radialProgressView, org.telegram.ui.Components.gb1.g(-1.0f, -1));
                viewGroup3 = frameLayout;
            }
            return new s4.e1(viewGroup3);
        }
        org.telegram.ui.Cells.x5 x5Var = new org.telegram.ui.Cells.x5(context, null);
        x5Var.setDelegate(new oq0(this));
        FrameLayout checkFrame = x5Var.getCheckFrame();
        if (rq0Var.T != 0) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        checkFrame.setVisibility(i11);
        viewGroup2 = x5Var;
        viewGroup3 = viewGroup2;
        return new s4.e1(viewGroup3);
    }
}
