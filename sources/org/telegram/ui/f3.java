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
public final class f3 extends iu0 {
    public final int[] f39142a = new int[2];
    public final List f39143b;
    public final j4 f39144c;

    public f3(j4 j4Var, List list) {
        this.f39144c = j4Var;
        this.f39143b = list;
    }

    @Override
    public final void D() {
        this.f39144c.n();
    }

    @Override
    public final su0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        if (i10 >= 0) {
            List list = this.f39143b;
            if (i10 < list.size()) {
                j4 j4Var = this.f39144c;
                int[] iArr = this.f39142a;
                ImageReceiver d02 = d0(j4Var.f40414u0[0].f41312b, (TL_iv.PageBlock) list.get(i10), iArr);
                if (d02 != null) {
                    su0 su0Var = new su0();
                    su0Var.f43407b = iArr[0];
                    su0Var.f43408c = iArr[1];
                    su0Var.d = j4Var.f40414u0[0].f41312b;
                    su0Var.f43406a = d02;
                    su0Var.e = d02.getBitmapSafe();
                    su0Var.h = d02.getRoundRadius(true);
                    su0Var.f43412j = j4Var.J0;
                    return su0Var;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void Y(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.f3.Y(int):void");
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
        if (view instanceof c2) {
            c2 c2Var = (c2) view;
            if (c2Var.N == pageBlock) {
                view.getLocationInWindow(iArr);
                return c2Var.e;
            }
            return null;
        } else if (view instanceof w2) {
            w2 w2Var = (w2) view;
            ImageReceiver imageReceiver = w2Var.e;
            TextureView textureView = w2Var.f44492n;
            if (w2Var.L == pageBlock) {
                view.getLocationInWindow(iArr);
                j4 j4Var = this.f39144c;
                if (w2Var == j4Var.f40456x && (videoPlayerHolderBase = j4Var.f40455w) != null && videoPlayerHolderBase.firstFrameRendered && textureView.getSurfaceTexture() != null) {
                    if (Build.VERSION.SDK_INT >= 24) {
                        Surface surface = new Surface(textureView.getSurfaceTexture());
                        Bitmap createBitmap = Bitmap.createBitmap(textureView.getMeasuredWidth(), textureView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                        AndroidUtilities.getBitmapFromSurface(surface, createBitmap);
                        surface.release();
                        imageReceiver.setImageBitmap(createBitmap);
                    } else {
                        imageReceiver.setImageBitmap(textureView.getBitmap());
                    }
                    int i10 = w2.V;
                    textureView.setAlpha(0.0f);
                }
                return imageReceiver;
            }
            return null;
        } else if (view instanceof j1) {
            ImageReceiver d02 = d0(((j1) view).f40310a, pageBlock, iArr);
            if (d02 != null) {
                return d02;
            }
            return null;
        } else if (view instanceof p2) {
            ImageReceiver d03 = d0(((p2) view).f42276b, pageBlock, iArr);
            if (d03 != null) {
                return d03;
            }
            return null;
        } else if (view instanceof x1) {
            org.telegram.ui.Components.wl0 wl0Var2 = ((x1) view).d;
            if (wl0Var2 != null && (e03 = e0(wl0Var2.f47773a, pageBlock, iArr)) != null) {
                return e03;
            }
            return null;
        } else if ((view instanceof a2) && (wl0Var = ((a2) view).d) != null && (e02 = e0(wl0Var.f47773a, pageBlock, iArr)) != null) {
            return e02;
        } else {
            return null;
        }
    }
}
