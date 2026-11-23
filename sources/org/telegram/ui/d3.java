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
public final class d3 extends oq0 {
    public final int[] f46938a = new int[2];
    public final List f46939b;
    public final g4 f46940c;

    public d3(g4 g4Var, List list) {
        this.f46940c = g4Var;
        this.f46939b = list;
    }

    @Override
    public final void D() {
        this.f46940c.l();
    }

    @Override
    public final wq0 E(org.telegram.messenger.fj fjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        if (i7 >= 0) {
            List list = this.f46939b;
            if (i7 < list.size()) {
                g4 g4Var = this.f46940c;
                int[] iArr = this.f46938a;
                ImageReceiver d02 = d0(g4Var.f48084v0[0].f49288b, (TL_iv.PageBlock) list.get(i7), iArr);
                if (d02 != null) {
                    wq0 wq0Var = new wq0();
                    wq0Var.f53727b = iArr[0];
                    wq0Var.f53728c = iArr[1];
                    wq0Var.d = g4Var.f48084v0[0].f49288b;
                    wq0Var.f53726a = d02;
                    wq0Var.f53729e = d02.p();
                    wq0Var.h = d02.F();
                    wq0Var.f53733j = g4Var.K0;
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
        org.telegram.ui.Components.mj0 mj0Var;
        ImageReceiver e02;
        ImageReceiver e03;
        VideoPlayerHolderBase videoPlayerHolderBase;
        if (view instanceof a2) {
            a2 a2Var = (a2) view;
            if (a2Var.O == pageBlock) {
                view.getLocationInWindow(iArr);
                return a2Var.f45560e;
            }
            return null;
        } else if (view instanceof v2) {
            v2 v2Var = (v2) view;
            ImageReceiver imageReceiver = v2Var.f52788e;
            TextureView textureView = v2Var.f52790n;
            if (v2Var.M == pageBlock) {
                view.getLocationInWindow(iArr);
                g4 g4Var = this.f46940c;
                if (v2Var == g4Var.f50848y && (videoPlayerHolderBase = g4Var.f50847x) != null && videoPlayerHolderBase.firstFrameRendered && textureView.getSurfaceTexture() != null) {
                    if (Build.VERSION.SDK_INT >= 24) {
                        Surface surface = new Surface(textureView.getSurfaceTexture());
                        Bitmap createBitmap = Bitmap.createBitmap(textureView.getMeasuredWidth(), textureView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                        org.telegram.messenger.g0.y0(surface, createBitmap);
                        surface.release();
                        imageReceiver.w0(createBitmap);
                    } else {
                        imageReceiver.w0(textureView.getBitmap());
                    }
                    int i7 = v2.W;
                    textureView.setAlpha(0.0f);
                }
                return imageReceiver;
            }
            return null;
        } else if (view instanceof h1) {
            ImageReceiver d02 = d0(((h1) view).f48394a, pageBlock, iArr);
            if (d02 != null) {
                return d02;
            }
            return null;
        } else if (view instanceof o2) {
            ImageReceiver d03 = d0(((o2) view).f50480b, pageBlock, iArr);
            if (d03 != null) {
                return d03;
            }
            return null;
        } else if (view instanceof v1) {
            org.telegram.ui.Components.mj0 mj0Var2 = ((v1) view).d;
            if (mj0Var2 != null && (e03 = e0(mj0Var2.f59245a, pageBlock, iArr)) != null) {
                return e03;
            }
            return null;
        } else if ((view instanceof y1) && (mj0Var = ((y1) view).d) != null && (e02 = e0(mj0Var.f59245a, pageBlock, iArr)) != null) {
            return e02;
        } else {
            return null;
        }
    }
}
