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
public final class h3 extends zt0 {
    public final int[] f37474a = new int[2];
    public final List f37475b;
    public final l4 f37476c;

    public h3(l4 l4Var, List list) {
        this.f37476c = l4Var;
        this.f37475b = list;
    }

    @Override
    public final void D() {
        this.f37476c.n();
    }

    @Override
    public final ju0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        if (i10 >= 0) {
            List list = this.f37475b;
            if (i10 < list.size()) {
                l4 l4Var = this.f37476c;
                int[] iArr = this.f37474a;
                ImageReceiver d02 = d0(l4Var.f38778u0[0].f39753b, (TL_iv.PageBlock) list.get(i10), iArr);
                if (d02 != null) {
                    ju0 ju0Var = new ju0();
                    ju0Var.f38351b = iArr[0];
                    ju0Var.f38352c = iArr[1];
                    ju0Var.d = l4Var.f38778u0[0].f39753b;
                    ju0Var.f38350a = d02;
                    ju0Var.e = d02.getBitmapSafe();
                    ju0Var.h = d02.getRoundRadius(true);
                    ju0Var.f38356j = l4Var.I0;
                    return ju0Var;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void Y(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.h3.Y(int):void");
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
        org.telegram.ui.Components.tl0 tl0Var;
        ImageReceiver e02;
        ImageReceiver e03;
        VideoPlayerHolderBase videoPlayerHolderBase;
        if (view instanceof f2) {
            f2 f2Var = (f2) view;
            if (f2Var.N == pageBlock) {
                view.getLocationInWindow(iArr);
                return f2Var.e;
            }
            return null;
        } else if (view instanceof z2) {
            z2 z2Var = (z2) view;
            ImageReceiver imageReceiver = z2Var.e;
            TextureView textureView = z2Var.f43612n;
            if (z2Var.L == pageBlock) {
                view.getLocationInWindow(iArr);
                l4 l4Var = this.f37476c;
                if (z2Var == l4Var.f35529x && (videoPlayerHolderBase = l4Var.f35528w) != null && videoPlayerHolderBase.firstFrameRendered && textureView.getSurfaceTexture() != null) {
                    if (Build.VERSION.SDK_INT >= 24) {
                        Surface surface = new Surface(textureView.getSurfaceTexture());
                        Bitmap createBitmap = Bitmap.createBitmap(textureView.getMeasuredWidth(), textureView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                        AndroidUtilities.getBitmapFromSurface(surface, createBitmap);
                        surface.release();
                        imageReceiver.setImageBitmap(createBitmap);
                    } else {
                        imageReceiver.setImageBitmap(textureView.getBitmap());
                    }
                    int i10 = z2.V;
                    textureView.setAlpha(0.0f);
                }
                return imageReceiver;
            }
            return null;
        } else if (view instanceof m1) {
            ImageReceiver d02 = d0(((m1) view).f39083a, pageBlock, iArr);
            if (d02 != null) {
                return d02;
            }
            return null;
        } else if (view instanceof s2) {
            ImageReceiver d03 = d0(((s2) view).f41325a, pageBlock, iArr);
            if (d03 != null) {
                return d03;
            }
            return null;
        } else if (view instanceof a2) {
            org.telegram.ui.Components.tl0 tl0Var2 = ((a2) view).d;
            if (tl0Var2 != null && (e03 = e0(tl0Var2.f45917a, pageBlock, iArr)) != null) {
                return e03;
            }
            return null;
        } else if ((view instanceof d2) && (tl0Var = ((d2) view).d) != null && (e02 = e0(tl0Var.f45917a, pageBlock, iArr)) != null) {
            return e02;
        } else {
            return null;
        }
    }
}
