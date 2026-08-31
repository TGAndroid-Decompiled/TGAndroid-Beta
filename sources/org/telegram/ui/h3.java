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
public final class h3 extends au0 {
    public final int[] f37316a = new int[2];
    public final List f37317b;
    public final l4 f37318c;

    public h3(l4 l4Var, List list) {
        this.f37318c = l4Var;
        this.f37317b = list;
    }

    @Override
    public final void D() {
        this.f37318c.n();
    }

    @Override
    public final lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        if (i10 >= 0) {
            List list = this.f37317b;
            if (i10 < list.size()) {
                l4 l4Var = this.f37318c;
                int[] iArr = this.f37316a;
                ImageReceiver c02 = c0(l4Var.f38619r0[0].f39904b, (TL_iv.PageBlock) list.get(i10), iArr);
                if (c02 != null) {
                    lu0 lu0Var = new lu0();
                    lu0Var.f38865b = iArr[0];
                    lu0Var.f38866c = iArr[1];
                    lu0Var.d = l4Var.f38619r0[0].f39904b;
                    lu0Var.f38864a = c02;
                    lu0Var.f38867e = c02.getBitmapSafe();
                    lu0Var.h = c02.getRoundRadius(true);
                    lu0Var.f38871j = l4Var.F0;
                    return lu0Var;
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
        org.telegram.ui.Components.fl0 fl0Var;
        ImageReceiver d02;
        ImageReceiver d03;
        VideoPlayerHolderBase videoPlayerHolderBase;
        if (view instanceof e2) {
            e2 e2Var = (e2) view;
            if (e2Var.K == pageBlock) {
                view.getLocationInWindow(iArr);
                return e2Var.f36374e;
            }
            return null;
        } else if (view instanceof z2) {
            z2 z2Var = (z2) view;
            ImageReceiver imageReceiver = z2Var.f43786e;
            TextureView textureView = z2Var.f43788n;
            if (z2Var.I == pageBlock) {
                view.getLocationInWindow(iArr);
                l4 l4Var = this.f37318c;
                if (z2Var == l4Var.f39617x && (videoPlayerHolderBase = l4Var.f39616w) != null && videoPlayerHolderBase.firstFrameRendered && textureView.getSurfaceTexture() != null) {
                    if (Build.VERSION.SDK_INT >= 24) {
                        Surface surface = new Surface(textureView.getSurfaceTexture());
                        Bitmap createBitmap = Bitmap.createBitmap(textureView.getMeasuredWidth(), textureView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                        AndroidUtilities.getBitmapFromSurface(surface, createBitmap);
                        surface.release();
                        imageReceiver.setImageBitmap(createBitmap);
                    } else {
                        imageReceiver.setImageBitmap(textureView.getBitmap());
                    }
                    int i10 = z2.S;
                    textureView.setAlpha(0.0f);
                }
                return imageReceiver;
            }
            return null;
        } else if (view instanceof l1) {
            ImageReceiver c02 = c0(((l1) view).f38547a, pageBlock, iArr);
            if (c02 != null) {
                return c02;
            }
            return null;
        } else if (view instanceof s2) {
            ImageReceiver c03 = c0(((s2) view).f41107a, pageBlock, iArr);
            if (c03 != null) {
                return c03;
            }
            return null;
        } else if (view instanceof z1) {
            org.telegram.ui.Components.fl0 fl0Var2 = ((z1) view).d;
            if (fl0Var2 != null && (d03 = d0(fl0Var2.f5875a, pageBlock, iArr)) != null) {
                return d03;
            }
            return null;
        } else if ((view instanceof c2) && (fl0Var = ((c2) view).d) != null && (d02 = d0(fl0Var.f5875a, pageBlock, iArr)) != null) {
            return d02;
        } else {
            return null;
        }
    }
}
