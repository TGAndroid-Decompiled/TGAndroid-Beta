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
public final class h3 extends zu0 {
    public final int[] f36381a = new int[2];
    public final List f36382b;
    public final k4 f36383c;

    public h3(k4 k4Var, List list) {
        this.f36383c = k4Var;
        this.f36382b = list;
    }

    @Override
    public final void D() {
        this.f36383c.n();
    }

    @Override
    public final jv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        if (i10 >= 0) {
            List list = this.f36382b;
            if (i10 < list.size()) {
                k4 k4Var = this.f36383c;
                int[] iArr = this.f36381a;
                ImageReceiver d02 = d0(k4Var.f37278u0[0].f38529b, (TL_iv.PageBlock) list.get(i10), iArr);
                if (d02 != null) {
                    jv0 jv0Var = new jv0();
                    jv0Var.f37146b = iArr[0];
                    jv0Var.f37147c = iArr[1];
                    jv0Var.d = k4Var.f37278u0[0].f38529b;
                    jv0Var.f37145a = d02;
                    jv0Var.e = d02.getBitmapSafe();
                    jv0Var.h = d02.getRoundRadius(true);
                    jv0Var.f37151j = k4Var.I0;
                    return jv0Var;
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
        org.telegram.ui.Components.wl0 wl0Var;
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
            TextureView textureView = z2Var.f42136n;
            if (z2Var.L == pageBlock) {
                view.getLocationInWindow(iArr);
                k4 k4Var = this.f36383c;
                if (z2Var == k4Var.f42182x && (videoPlayerHolderBase = k4Var.f42181w) != null && videoPlayerHolderBase.firstFrameRendered && textureView.getSurfaceTexture() != null) {
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
            ImageReceiver d02 = d0(((m1) view).f37881a, pageBlock, iArr);
            if (d02 != null) {
                return d02;
            }
            return null;
        } else if (view instanceof s2) {
            ImageReceiver d03 = d0(((s2) view).f39655a, pageBlock, iArr);
            if (d03 != null) {
                return d03;
            }
            return null;
        } else if (view instanceof a2) {
            org.telegram.ui.Components.wl0 wl0Var2 = ((a2) view).d;
            if (wl0Var2 != null && (e03 = e0(wl0Var2.f44838a, pageBlock, iArr)) != null) {
                return e03;
            }
            return null;
        } else if ((view instanceof d2) && (wl0Var = ((d2) view).d) != null && (e02 = e0(wl0Var.f44838a, pageBlock, iArr)) != null) {
            return e02;
        } else {
            return null;
        }
    }
}
