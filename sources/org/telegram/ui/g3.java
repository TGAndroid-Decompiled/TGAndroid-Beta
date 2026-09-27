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
public final class g3 extends ou0 {
    public final int[] f33710a = new int[2];
    public final List f33711b;
    public final j4 f33712c;

    public g3(j4 j4Var, List list) {
        this.f33712c = j4Var;
        this.f33711b = list;
    }

    @Override
    public final void D() {
        this.f33712c.n();
    }

    @Override
    public final yu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        if (i10 >= 0) {
            List list = this.f33711b;
            if (i10 < list.size()) {
                j4 j4Var = this.f33712c;
                int[] iArr = this.f33710a;
                ImageReceiver c02 = c0(j4Var.f34627u0[0].f35795b, (TL_iv.PageBlock) list.get(i10), iArr);
                if (c02 != null) {
                    yu0 yu0Var = new yu0();
                    yu0Var.f40326b = iArr[0];
                    yu0Var.f40327c = iArr[1];
                    yu0Var.d = j4Var.f34627u0[0].f35795b;
                    yu0Var.f40325a = c02;
                    yu0Var.e = c02.getBitmapSafe();
                    yu0Var.h = c02.getRoundRadius(true);
                    yu0Var.f40331j = j4Var.I0;
                    return yu0Var;
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
        org.telegram.ui.Components.il0 il0Var;
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
            TextureView textureView = y2Var.f40103n;
            if (y2Var.L == pageBlock) {
                view.getLocationInWindow(iArr);
                j4 j4Var = this.f33712c;
                if (y2Var == j4Var.f37327x && (videoPlayerHolderBase = j4Var.f37326w) != null && videoPlayerHolderBase.firstFrameRendered && textureView.getSurfaceTexture() != null) {
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
            ImageReceiver c02 = c0(((l1) view).f35217a, pageBlock, iArr);
            if (c02 != null) {
                return c02;
            }
            return null;
        } else if (view instanceof r2) {
            ImageReceiver c03 = c0(((r2) view).f36950a, pageBlock, iArr);
            if (c03 != null) {
                return c03;
            }
            return null;
        } else if (view instanceof z1) {
            org.telegram.ui.Components.il0 il0Var2 = ((z1) view).d;
            if (il0Var2 != null && (d03 = d0(il0Var2.f43005a, pageBlock, iArr)) != null) {
                return d03;
            }
            return null;
        } else if ((view instanceof c2) && (il0Var = ((c2) view).d) != null && (d02 = d0(il0Var.f43005a, pageBlock, iArr)) != null) {
            return d02;
        } else {
            return null;
        }
    }
}
