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
public final class f3 extends ou0 {
    public final int[] f36162a = new int[2];
    public final List f36163b;
    public final i4 f36164c;

    public f3(i4 i4Var, List list) {
        this.f36164c = i4Var;
        this.f36163b = list;
    }

    @Override
    public final void D() {
        this.f36164c.n();
    }

    @Override
    public final yu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        if (i10 >= 0) {
            List list = this.f36163b;
            if (i10 < list.size()) {
                i4 i4Var = this.f36164c;
                int[] iArr = this.f36162a;
                ImageReceiver c02 = c0(i4Var.f37274u0[0].f38393b, (TL_iv.PageBlock) list.get(i10), iArr);
                if (c02 != null) {
                    yu0 yu0Var = new yu0();
                    yu0Var.f43620b = iArr[0];
                    yu0Var.f43621c = iArr[1];
                    yu0Var.d = i4Var.f37274u0[0].f38393b;
                    yu0Var.f43619a = c02;
                    yu0Var.f43622e = c02.getBitmapSafe();
                    yu0Var.h = c02.getRoundRadius(true);
                    yu0Var.f43626j = i4Var.I0;
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
        org.telegram.ui.Components.il0 il0Var;
        ImageReceiver d02;
        ImageReceiver d03;
        VideoPlayerHolderBase videoPlayerHolderBase;
        if (view instanceof d2) {
            d2 d2Var = (d2) view;
            if (d2Var.N == pageBlock) {
                view.getLocationInWindow(iArr);
                return d2Var.f35613e;
            }
            return null;
        } else if (view instanceof x2) {
            x2 x2Var = (x2) view;
            ImageReceiver imageReceiver = x2Var.f42712e;
            TextureView textureView = x2Var.f42714n;
            if (x2Var.L == pageBlock) {
                view.getLocationInWindow(iArr);
                i4 i4Var = this.f36164c;
                if (x2Var == i4Var.f40710x && (videoPlayerHolderBase = i4Var.f40709w) != null && videoPlayerHolderBase.firstFrameRendered && textureView.getSurfaceTexture() != null) {
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
            ImageReceiver c02 = c0(((k1) view).f37797a, pageBlock, iArr);
            if (c02 != null) {
                return c02;
            }
            return null;
        } else if (view instanceof q2) {
            ImageReceiver c03 = c0(((q2) view).f39577a, pageBlock, iArr);
            if (c03 != null) {
                return c03;
            }
            return null;
        } else if (view instanceof y1) {
            org.telegram.ui.Components.il0 il0Var2 = ((y1) view).d;
            if (il0Var2 != null && (d03 = d0(il0Var2.f46523a, pageBlock, iArr)) != null) {
                return d03;
            }
            return null;
        } else if ((view instanceof b2) && (il0Var = ((b2) view).d) != null && (d02 = d0(il0Var.f46523a, pageBlock, iArr)) != null) {
            return d02;
        } else {
            return null;
        }
    }
}
