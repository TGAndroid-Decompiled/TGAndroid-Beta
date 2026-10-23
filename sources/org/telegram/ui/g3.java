package org.telegram.ui;

import android.graphics.Bitmap;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class g3 extends cu0 {
    public final int[] f37474a = new int[2];
    public final List f37475b;
    public final k4 f37476c;

    public g3(k4 k4Var, List list) {
        this.f37476c = k4Var;
        this.f37475b = list;
    }

    @Override
    public final void D() {
        this.f37476c.n();
    }

    @Override
    public final mu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        if (i10 >= 0) {
            List list = this.f37475b;
            if (i10 < list.size()) {
                k4 k4Var = this.f37476c;
                int[] iArr = this.f37474a;
                ImageReceiver d02 = d0(k4Var.f38805u0[0].f39752b, (TL_iv.PageBlock) list.get(i10), iArr);
                if (d02 != null) {
                    mu0 mu0Var = new mu0();
                    mu0Var.f39693b = iArr[0];
                    mu0Var.f39694c = iArr[1];
                    mu0Var.d = k4Var.f38805u0[0].f39752b;
                    mu0Var.f39692a = d02;
                    mu0Var.e = d02.getBitmapSafe();
                    mu0Var.h = d02.getRoundRadius(true);
                    mu0Var.f39698j = k4Var.J0;
                    return mu0Var;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void Y(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g3.Y(int):void");
    }

    public final ImageReceiver d0(ViewGroup viewGroup, TL_iv.PageBlock pageBlock, int[] iArr) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            ImageReceiver e02 = e0(viewGroup.getChildAt(i10), pageBlock, iArr);
            if (e02 != null) {
                return e02;
            }
        }
        return null;
    }

    public final ImageReceiver e0(View view, TL_iv.PageBlock pageBlock, int[] iArr) {
        org.telegram.ui.Components.wl0 wl0Var;
        ImageReceiver e02;
        ImageReceiver e03;
        VideoPlayerHolderBase videoPlayerHolderBase;
        if (view instanceof e2) {
            e2 e2Var = (e2) view;
            if (e2Var.N == pageBlock) {
                view.getLocationInWindow(iArr);
                return e2Var.e;
            }
            return null;
        } else if (view instanceof y2) {
            y2 y2Var = (y2) view;
            ImageReceiver imageReceiver = y2Var.e;
            TextureView textureView = y2Var.f43697n;
            if (y2Var.L == pageBlock) {
                view.getLocationInWindow(iArr);
                k4 k4Var = this.f37476c;
                if (y2Var == k4Var.f37237x && (videoPlayerHolderBase = k4Var.f37236w) != null && videoPlayerHolderBase.firstFrameRendered && textureView.getSurfaceTexture() != null) {
                    if (Build.VERSION.SDK_INT >= 24) {
                        Surface surface = new Surface(textureView.getSurfaceTexture());
                        Bitmap createBitmap = Bitmap.createBitmap(textureView.getMeasuredWidth(), textureView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                        AndroidUtilities.getBitmapFromSurface(surface, createBitmap);
                        surface.release();
                        imageReceiver.setImageBitmap(createBitmap);
                    } else {
                        imageReceiver.setImageBitmap(textureView.getBitmap());
                    }
                    int i10 = y2.V;
                    textureView.setAlpha(0.0f);
                }
                return imageReceiver;
            }
            return null;
        } else if (view instanceof l1) {
            ImageReceiver d02 = d0(((l1) view).f39098a, pageBlock, iArr);
            if (d02 != null) {
                return d02;
            }
            return null;
        } else if (view instanceof r2) {
            ImageReceiver d03 = d0(((r2) view).f40969b, pageBlock, iArr);
            if (d03 != null) {
                return d03;
            }
            return null;
        } else if (view instanceof z1) {
            org.telegram.ui.Components.wl0 wl0Var2 = ((z1) view).d;
            if (wl0Var2 != null && (e03 = e0(wl0Var2.f46343a, pageBlock, iArr)) != null) {
                return e03;
            }
            return null;
        } else if ((view instanceof c2) && (wl0Var = ((c2) view).d) != null && (e02 = e0(wl0Var.f46343a, pageBlock, iArr)) != null) {
            return e02;
        } else {
            return null;
        }
    }
}
