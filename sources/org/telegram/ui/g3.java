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
public final class g3 extends tu0 {
    public final int[] f32980a = new int[2];
    public final List f32981b;
    public final j4 f32982c;

    public g3(j4 j4Var, List list) {
        this.f32982c = j4Var;
        this.f32981b = list;
    }

    @Override
    public final void D() {
        this.f32982c.n();
    }

    @Override
    public final ev0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        if (i10 >= 0) {
            List list = this.f32981b;
            if (i10 < list.size()) {
                j4 j4Var = this.f32982c;
                int[] iArr = this.f32980a;
                ImageReceiver c02 = c0(j4Var.f33920u0[0].f35102b, (TL_iv.PageBlock) list.get(i10), iArr);
                if (c02 != null) {
                    ev0 ev0Var = new ev0();
                    ev0Var.f32617b = iArr[0];
                    ev0Var.f32618c = iArr[1];
                    ev0Var.d = j4Var.f33920u0[0].f35102b;
                    ev0Var.f32616a = c02;
                    ev0Var.e = c02.getBitmapSafe();
                    ev0Var.h = c02.getRoundRadius(true);
                    ev0Var.f32622j = j4Var.I0;
                    return ev0Var;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void X(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g3.X(int):void");
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
            if (e2Var.N == pageBlock) {
                view.getLocationInWindow(iArr);
                return e2Var.e;
            }
            return null;
        } else if (view instanceof y2) {
            y2 y2Var = (y2) view;
            ImageReceiver imageReceiver = y2Var.e;
            TextureView textureView = y2Var.f38878n;
            if (y2Var.L == pageBlock) {
                view.getLocationInWindow(iArr);
                j4 j4Var = this.f32982c;
                if (y2Var == j4Var.f36862x && (videoPlayerHolderBase = j4Var.f36861w) != null && videoPlayerHolderBase.firstFrameRendered && textureView.getSurfaceTexture() != null) {
                    if (Build.VERSION.SDK_INT >= 24) {
                        Surface surface = new Surface(textureView.getSurfaceTexture());
                        Bitmap createBitmap = Bitmap.createBitmap(textureView.getMeasuredWidth(), textureView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                        AndroidUtilities.getBitmapFromSurface(surface, createBitmap);
                        surface.release();
                        imageReceiver.setImageBitmap(createBitmap);
                    } else {
                        imageReceiver.setImageBitmap(textureView.getBitmap());
                    }
                    int i10 = y2.V;
                    textureView.setAlpha(0.0f);
                }
                return imageReceiver;
            }
            return null;
        } else if (view instanceof l1) {
            ImageReceiver c02 = c0(((l1) view).f34501a, pageBlock, iArr);
            if (c02 != null) {
                return c02;
            }
            return null;
        } else if (view instanceof r2) {
            ImageReceiver c03 = c0(((r2) view).f36171a, pageBlock, iArr);
            if (c03 != null) {
                return c03;
            }
            return null;
        } else if (view instanceof z1) {
            org.telegram.ui.Components.fl0 fl0Var2 = ((z1) view).d;
            if (fl0Var2 != null && (d03 = d0(fl0Var2.f41610a, pageBlock, iArr)) != null) {
                return d03;
            }
            return null;
        } else if ((view instanceof c2) && (fl0Var = ((c2) view).d) != null && (d02 = d0(fl0Var.f41610a, pageBlock, iArr)) != null) {
            return d02;
        } else {
            return null;
        }
    }
}
