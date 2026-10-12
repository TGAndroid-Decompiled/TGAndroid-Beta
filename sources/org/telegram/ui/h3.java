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
public final class h3 extends av0 {
    public final int[] f36591a = new int[2];
    public final List f36592b;
    public final k4 f36593c;

    public h3(k4 k4Var, List list) {
        this.f36593c = k4Var;
        this.f36592b = list;
    }

    @Override
    public final void D() {
        this.f36593c.n();
    }

    @Override
    public final kv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        if (i10 >= 0) {
            List list = this.f36592b;
            if (i10 < list.size()) {
                k4 k4Var = this.f36593c;
                int[] iArr = this.f36591a;
                ImageReceiver c02 = c0(k4Var.f37557u0[0].f38847b, (TL_iv.PageBlock) list.get(i10), iArr);
                if (c02 != null) {
                    kv0 kv0Var = new kv0();
                    kv0Var.f37752b = iArr[0];
                    kv0Var.f37753c = iArr[1];
                    kv0Var.d = k4Var.f37557u0[0].f38847b;
                    kv0Var.f37751a = c02;
                    kv0Var.e = c02.getBitmapSafe();
                    kv0Var.h = c02.getRoundRadius(true);
                    kv0Var.f37757j = k4Var.I0;
                    return kv0Var;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void X(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.h3.X(int):void");
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
        org.telegram.ui.Components.wl0 wl0Var;
        ImageReceiver d02;
        ImageReceiver d03;
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
            TextureView textureView = z2Var.f42462n;
            if (z2Var.L == pageBlock) {
                view.getLocationInWindow(iArr);
                k4 k4Var = this.f36593c;
                if (z2Var == k4Var.f42508x && (videoPlayerHolderBase = k4Var.f42507w) != null && videoPlayerHolderBase.firstFrameRendered && textureView.getSurfaceTexture() != null) {
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
            ImageReceiver c02 = c0(((m1) view).f38134a, pageBlock, iArr);
            if (c02 != null) {
                return c02;
            }
            return null;
        } else if (view instanceof s2) {
            ImageReceiver c03 = c0(((s2) view).f39931a, pageBlock, iArr);
            if (c03 != null) {
                return c03;
            }
            return null;
        } else if (view instanceof a2) {
            org.telegram.ui.Components.wl0 wl0Var2 = ((a2) view).d;
            if (wl0Var2 != null && (d03 = d0(wl0Var2.f44838a, pageBlock, iArr)) != null) {
                return d03;
            }
            return null;
        } else if ((view instanceof d2) && (wl0Var = ((d2) view).d) != null && (d02 = d0(wl0Var.f44838a, pageBlock, iArr)) != null) {
            return d02;
        } else {
            return null;
        }
    }
}
