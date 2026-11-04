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
public final class e3 extends eq0 {
    public final int[] f44863a = new int[2];
    public final List f44864b;
    public final i4 f44865c;

    public e3(i4 i4Var, List list) {
        this.f44865c = i4Var;
        this.f44864b = list;
    }

    @Override
    public final void D() {
        this.f44865c.l();
    }

    @Override
    public final mq0 E(org.telegram.messenger.zi ziVar, TLRPC.FileLocation fileLocation, int i3, boolean z10, boolean z11) {
        if (i3 >= 0) {
            List list = this.f44864b;
            if (i3 < list.size()) {
                i4 i4Var = this.f44865c;
                int[] iArr = this.f44863a;
                ImageReceiver d02 = d0(i4Var.f46100v0[0].f47083b, (TL_iv.PageBlock) list.get(i3), iArr);
                if (d02 != null) {
                    mq0 mq0Var = new mq0();
                    mq0Var.f47752b = iArr[0];
                    mq0Var.f47753c = iArr[1];
                    mq0Var.d = i4Var.f46100v0[0].f47083b;
                    mq0Var.f47751a = d02;
                    mq0Var.f47754e = d02.p();
                    mq0Var.h = d02.E();
                    mq0Var.f47758j = i4Var.K0;
                    return mq0Var;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void Y(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.e3.Y(int):void");
    }

    public final ImageReceiver d0(ViewGroup viewGroup, TL_iv.PageBlock pageBlock, int[] iArr) {
        int childCount = viewGroup.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ImageReceiver e02 = e0(viewGroup.getChildAt(i3), pageBlock, iArr);
            if (e02 != null) {
                return e02;
            }
        }
        return null;
    }

    public final ImageReceiver e0(View view, TL_iv.PageBlock pageBlock, int[] iArr) {
        org.telegram.ui.Components.bj0 bj0Var;
        ImageReceiver e02;
        ImageReceiver e03;
        VideoPlayerHolderBase videoPlayerHolderBase;
        if (view instanceof b2) {
            b2 b2Var = (b2) view;
            if (b2Var.O == pageBlock) {
                view.getLocationInWindow(iArr);
                return b2Var.f43893e;
            }
            return null;
        } else if (view instanceof w2) {
            w2 w2Var = (w2) view;
            ImageReceiver imageReceiver = w2Var.f50671e;
            TextureView textureView = w2Var.f50673n;
            if (w2Var.M == pageBlock) {
                view.getLocationInWindow(iArr);
                i4 i4Var = this.f44865c;
                if (w2Var == i4Var.f46120y && (videoPlayerHolderBase = i4Var.f46119x) != null && videoPlayerHolderBase.firstFrameRendered && textureView.getSurfaceTexture() != null) {
                    if (Build.VERSION.SDK_INT >= 24) {
                        Surface surface = new Surface(textureView.getSurfaceTexture());
                        Bitmap createBitmap = Bitmap.createBitmap(textureView.getMeasuredWidth(), textureView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                        org.telegram.messenger.g0.y0(surface, createBitmap);
                        surface.release();
                        imageReceiver.v0(createBitmap);
                    } else {
                        imageReceiver.v0(textureView.getBitmap());
                    }
                    int i3 = w2.W;
                    textureView.setAlpha(0.0f);
                }
                return imageReceiver;
            }
            return null;
        } else if (view instanceof i1) {
            ImageReceiver d02 = d0(((i1) view).f46023a, pageBlock, iArr);
            if (d02 != null) {
                return d02;
            }
            return null;
        } else if (view instanceof p2) {
            ImageReceiver d03 = d0(((p2) view).f48412b, pageBlock, iArr);
            if (d03 != null) {
                return d03;
            }
            return null;
        } else if (view instanceof w1) {
            org.telegram.ui.Components.bj0 bj0Var2 = ((w1) view).d;
            if (bj0Var2 != null && (e03 = e0(bj0Var2.f55540a, pageBlock, iArr)) != null) {
                return e03;
            }
            return null;
        } else if ((view instanceof z1) && (bj0Var = ((z1) view).d) != null && (e02 = e0(bj0Var.f55540a, pageBlock, iArr)) != null) {
            return e02;
        } else {
            return null;
        }
    }
}
