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
public final class f3 extends mu0 {
    public final int[] f33083a = new int[2];
    public final List f33084b;
    public final i4 f33085c;

    public f3(i4 i4Var, List list) {
        this.f33085c = i4Var;
        this.f33084b = list;
    }

    @Override
    public final void D() {
        this.f33085c.n();
    }

    @Override
    public final wu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        if (i10 >= 0) {
            List list = this.f33084b;
            if (i10 < list.size()) {
                i4 i4Var = this.f33085c;
                int[] iArr = this.f33083a;
                ImageReceiver c02 = c0(i4Var.f34021u0[0].f35130b, (TL_iv.PageBlock) list.get(i10), iArr);
                if (c02 != null) {
                    wu0 wu0Var = new wu0();
                    wu0Var.f39095b = iArr[0];
                    wu0Var.f39096c = iArr[1];
                    wu0Var.d = i4Var.f34021u0[0].f35130b;
                    wu0Var.f39094a = c02;
                    wu0Var.e = c02.getBitmapSafe();
                    wu0Var.h = c02.getRoundRadius(true);
                    wu0Var.f39100j = i4Var.I0;
                    return wu0Var;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void X(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.f3.X(int):void");
    }

    public final ImageReceiver c0(ViewGroup viewGroup, TL_iv.PageBlock pageBlock, int[] iArr) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            ImageReceiver d02 = d0(viewGroup.getChildAt(i10), pageBlock, iArr);
            if (d02 != null) {
                return d02;
            }
        }
        return null;
    }

    public final ImageReceiver d0(View view, TL_iv.PageBlock pageBlock, int[] iArr) {
        org.telegram.ui.Components.wk0 wk0Var;
        ImageReceiver d02;
        ImageReceiver d03;
        VideoPlayerHolderBase videoPlayerHolderBase;
        if (view instanceof d2) {
            d2 d2Var = (d2) view;
            if (d2Var.N == pageBlock) {
                view.getLocationInWindow(iArr);
                return d2Var.e;
            }
            return null;
        } else if (view instanceof x2) {
            x2 x2Var = (x2) view;
            ImageReceiver imageReceiver = x2Var.e;
            TextureView textureView = x2Var.f39160n;
            if (x2Var.L == pageBlock) {
                view.getLocationInWindow(iArr);
                i4 i4Var = this.f33085c;
                if (x2Var == i4Var.f36717x && (videoPlayerHolderBase = i4Var.f36716w) != null && videoPlayerHolderBase.firstFrameRendered && textureView.getSurfaceTexture() != null) {
                    if (Build.VERSION.SDK_INT >= 24) {
                        Surface surface = new Surface(textureView.getSurfaceTexture());
                        Bitmap createBitmap = Bitmap.createBitmap(textureView.getMeasuredWidth(), textureView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                        AndroidUtilities.getBitmapFromSurface(surface, createBitmap);
                        surface.release();
                        imageReceiver.setImageBitmap(createBitmap);
                    } else {
                        imageReceiver.setImageBitmap(textureView.getBitmap());
                    }
                    int i10 = x2.V;
                    textureView.setAlpha(0.0f);
                }
                return imageReceiver;
            }
            return null;
        } else if (view instanceof k1) {
            ImageReceiver c02 = c0(((k1) view).f34541a, pageBlock, iArr);
            if (c02 != null) {
                return c02;
            }
            return null;
        } else if (view instanceof q2) {
            ImageReceiver c03 = c0(((q2) view).f36243a, pageBlock, iArr);
            if (c03 != null) {
                return c03;
            }
            return null;
        } else if (view instanceof y1) {
            org.telegram.ui.Components.wk0 wk0Var2 = ((y1) view).d;
            if (wk0Var2 != null && (d03 = d0(wk0Var2.f42627a, pageBlock, iArr)) != null) {
                return d03;
            }
            return null;
        } else if ((view instanceof b2) && (wk0Var = ((b2) view).d) != null && (d02 = d0(wk0Var.f42627a, pageBlock, iArr)) != null) {
            return d02;
        } else {
            return null;
        }
    }
}
