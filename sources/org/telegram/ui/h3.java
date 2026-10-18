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
public final class h3 extends bu0 {
    public final int[] f37391a = new int[2];
    public final List f37392b;
    public final l4 f37393c;

    public h3(l4 l4Var, List list) {
        this.f37393c = l4Var;
        this.f37392b = list;
    }

    @Override
    public final void D() {
        this.f37393c.n();
    }

    @Override
    public final lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        if (i10 >= 0) {
            List list = this.f37392b;
            if (i10 < list.size()) {
                l4 l4Var = this.f37393c;
                int[] iArr = this.f37391a;
                ImageReceiver d02 = d0(l4Var.f38725u0[0].f39646b, (TL_iv.PageBlock) list.get(i10), iArr);
                if (d02 != null) {
                    lu0 lu0Var = new lu0();
                    lu0Var.f38918b = iArr[0];
                    lu0Var.f38919c = iArr[1];
                    lu0Var.d = l4Var.f38725u0[0].f39646b;
                    lu0Var.f38917a = d02;
                    lu0Var.e = d02.getBitmapSafe();
                    lu0Var.h = d02.getRoundRadius(true);
                    lu0Var.f38923j = l4Var.I0;
                    return lu0Var;
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
        org.telegram.ui.Components.sl0 sl0Var;
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
            TextureView textureView = z2Var.f43511n;
            if (z2Var.L == pageBlock) {
                view.getLocationInWindow(iArr);
                l4 l4Var = this.f37393c;
                if (z2Var == l4Var.f36085x && (videoPlayerHolderBase = l4Var.f36084w) != null && videoPlayerHolderBase.firstFrameRendered && textureView.getSurfaceTexture() != null) {
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
            ImageReceiver d02 = d0(((m1) view).f38953a, pageBlock, iArr);
            if (d02 != null) {
                return d02;
            }
            return null;
        } else if (view instanceof s2) {
            ImageReceiver d03 = d0(((s2) view).f40846a, pageBlock, iArr);
            if (d03 != null) {
                return d03;
            }
            return null;
        } else if (view instanceof a2) {
            org.telegram.ui.Components.sl0 sl0Var2 = ((a2) view).d;
            if (sl0Var2 != null && (e03 = e0(sl0Var2.f45910a, pageBlock, iArr)) != null) {
                return e03;
            }
            return null;
        } else if ((view instanceof d2) && (sl0Var = ((d2) view).d) != null && (e02 = e0(sl0Var.f45910a, pageBlock, iArr)) != null) {
            return e02;
        } else {
            return null;
        }
    }
}
