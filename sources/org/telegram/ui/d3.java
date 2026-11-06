package org.telegram.ui;

import android.graphics.Bitmap;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class d3 extends nq0 {
    public final int[] f44940a = new int[2];
    public final List f44941b;
    public final g4 f44942c;

    public d3(g4 g4Var, List list) {
        this.f44942c = g4Var;
        this.f44941b = list;
    }

    @Override
    public final void D() {
        this.f44942c.l();
    }

    @Override
    public final wq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        if (i7 >= 0) {
            List list = this.f44941b;
            if (i7 < list.size()) {
                g4 g4Var = this.f44942c;
                int[] iArr = this.f44940a;
                ImageReceiver d02 = d0(g4Var.f45843u0[0].f47088b, (TL_iv.PageBlock) list.get(i7), iArr);
                if (d02 != null) {
                    wq0 wq0Var = new wq0();
                    wq0Var.f51479b = iArr[0];
                    wq0Var.f51480c = iArr[1];
                    wq0Var.d = g4Var.f45843u0[0].f47088b;
                    wq0Var.f51478a = d02;
                    wq0Var.f51481e = d02.p();
                    wq0Var.h = d02.E();
                    wq0Var.f51485j = g4Var.J0;
                    return wq0Var;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void Y(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.d3.Y(int):void");
    }

    public final ImageReceiver d0(ViewGroup viewGroup, TL_iv.PageBlock pageBlock, int[] iArr) {
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            ImageReceiver e02 = e0(viewGroup.getChildAt(i7), pageBlock, iArr);
            if (e02 != null) {
                return e02;
            }
        }
        return null;
    }

    public final ImageReceiver e0(View view, TL_iv.PageBlock pageBlock, int[] iArr) {
        org.telegram.ui.Components.xi0 xi0Var;
        ImageReceiver e02;
        ImageReceiver e03;
        VideoPlayerHolderBase videoPlayerHolderBase;
        if (view instanceof a2) {
            a2 a2Var = (a2) view;
            if (a2Var.N == pageBlock) {
                view.getLocationInWindow(iArr);
                return a2Var.f43544e;
            }
            return null;
        } else if (view instanceof v2) {
            v2 v2Var = (v2) view;
            ImageReceiver imageReceiver = v2Var.f50559e;
            TextureView textureView = v2Var.f50561n;
            if (v2Var.L == pageBlock) {
                view.getLocationInWindow(iArr);
                g4 g4Var = this.f44942c;
                if (v2Var == g4Var.f48277y && (videoPlayerHolderBase = g4Var.f48276x) != null && videoPlayerHolderBase.firstFrameRendered && textureView.getSurfaceTexture() != null) {
                    if (Build.VERSION.SDK_INT >= 24) {
                        Surface surface = new Surface(textureView.getSurfaceTexture());
                        Bitmap createBitmap = Bitmap.createBitmap(textureView.getMeasuredWidth(), textureView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                        org.telegram.messenger.g0.y0(surface, createBitmap);
                        surface.release();
                        imageReceiver.v0(createBitmap);
                    } else {
                        imageReceiver.v0(textureView.getBitmap());
                    }
                    int i7 = v2.V;
                    textureView.setAlpha(0.0f);
                }
                return imageReceiver;
            }
            return null;
        } else if (view instanceof h1) {
            ImageReceiver d02 = d0(((h1) view).f46181a, pageBlock, iArr);
            if (d02 != null) {
                return d02;
            }
            return null;
        } else if (view instanceof o2) {
            ImageReceiver d03 = d0(((o2) view).f48211b, pageBlock, iArr);
            if (d03 != null) {
                return d03;
            }
            return null;
        } else if (view instanceof v1) {
            org.telegram.ui.Components.xi0 xi0Var2 = ((v1) view).d;
            if (xi0Var2 != null && (e03 = e0(xi0Var2.f56952a, pageBlock, iArr)) != null) {
                return e03;
            }
            return null;
        } else if ((view instanceof y1) && (xi0Var = ((y1) view).d) != null && (e02 = e0(xi0Var.f56952a, pageBlock, iArr)) != null) {
            return e02;
        } else {
            return null;
        }
    }
}
