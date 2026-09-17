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
public final class e3 extends vu0 {
    public final int[] f33270a = new int[2];
    public final List f33271b;
    public final h4 f33272c;

    public e3(h4 h4Var, List list) {
        this.f33272c = h4Var;
        this.f33271b = list;
    }

    @Override
    public final void D() {
        this.f33272c.n();
    }

    @Override
    public final fv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        if (i10 >= 0) {
            List list = this.f33271b;
            if (i10 < list.size()) {
                h4 h4Var = this.f33272c;
                int[] iArr = this.f33270a;
                ImageReceiver c02 = c0(h4Var.f34168u0[0].f35430b, (TL_iv.PageBlock) list.get(i10), iArr);
                if (c02 != null) {
                    fv0 fv0Var = new fv0();
                    fv0Var.f33764b = iArr[0];
                    fv0Var.f33765c = iArr[1];
                    fv0Var.d = h4Var.f34168u0[0].f35430b;
                    fv0Var.f33763a = c02;
                    fv0Var.e = c02.getBitmapSafe();
                    fv0Var.h = c02.getRoundRadius(true);
                    fv0Var.f33769j = h4Var.I0;
                    return fv0Var;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void X(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.e3.X(int):void");
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
            TextureView textureView = w2Var.f38552n;
            if (w2Var.L == pageBlock) {
                view.getLocationInWindow(iArr);
                h4 h4Var = this.f33272c;
                if (w2Var == h4Var.f38588x && (videoPlayerHolderBase = h4Var.f38587w) != null && videoPlayerHolderBase.firstFrameRendered && textureView.getSurfaceTexture() != null) {
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
            ImageReceiver c02 = c0(((j1) view).f34744a, pageBlock, iArr);
            if (c02 != null) {
                return c02;
            }
            return null;
        } else if (view instanceof p2) {
            ImageReceiver c03 = c0(((p2) view).f36492a, pageBlock, iArr);
            if (c03 != null) {
                return c03;
            }
            return null;
        } else if (view instanceof x1) {
            org.telegram.ui.Components.wk0 wk0Var2 = ((x1) view).d;
            if (wk0Var2 != null && (d03 = d0(wk0Var2.f42697a, pageBlock, iArr)) != null) {
                return d03;
            }
            return null;
        } else if ((view instanceof a2) && (wk0Var = ((a2) view).d) != null && (d02 = d0(wk0Var.f42697a, pageBlock, iArr)) != null) {
            return d02;
        } else {
            return null;
        }
    }
}
