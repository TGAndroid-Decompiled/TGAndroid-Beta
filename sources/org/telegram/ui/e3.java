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
public final class e3 extends tu0 {
    public final int[] f33204a = new int[2];
    public final List f33205b;
    public final h4 f33206c;

    public e3(h4 h4Var, List list) {
        this.f33206c = h4Var;
        this.f33205b = list;
    }

    @Override
    public final void D() {
        this.f33206c.n();
    }

    @Override
    public final dv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        if (i10 >= 0) {
            List list = this.f33205b;
            if (i10 < list.size()) {
                h4 h4Var = this.f33206c;
                int[] iArr = this.f33204a;
                ImageReceiver c02 = c0(h4Var.f34114u0[0].f35287b, (TL_iv.PageBlock) list.get(i10), iArr);
                if (c02 != null) {
                    dv0 dv0Var = new dv0();
                    dv0Var.f33144b = iArr[0];
                    dv0Var.f33145c = iArr[1];
                    dv0Var.d = h4Var.f34114u0[0].f35287b;
                    dv0Var.f33143a = c02;
                    dv0Var.e = c02.getBitmapSafe();
                    dv0Var.h = c02.getRoundRadius(true);
                    dv0Var.f33149j = h4Var.I0;
                    return dv0Var;
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
        org.telegram.ui.Components.fl0 fl0Var;
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
            TextureView textureView = w2Var.f38660n;
            if (w2Var.L == pageBlock) {
                view.getLocationInWindow(iArr);
                h4 h4Var = this.f33206c;
                if (w2Var == h4Var.f37987x && (videoPlayerHolderBase = h4Var.f37986w) != null && videoPlayerHolderBase.firstFrameRendered && textureView.getSurfaceTexture() != null) {
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
            ImageReceiver c02 = c0(((j1) view).f34722a, pageBlock, iArr);
            if (c02 != null) {
                return c02;
            }
            return null;
        } else if (view instanceof p2) {
            ImageReceiver c03 = c0(((p2) view).f36425a, pageBlock, iArr);
            if (c03 != null) {
                return c03;
            }
            return null;
        } else if (view instanceof x1) {
            org.telegram.ui.Components.fl0 fl0Var2 = ((x1) view).d;
            if (fl0Var2 != null && (d03 = d0(fl0Var2.f42974a, pageBlock, iArr)) != null) {
                return d03;
            }
            return null;
        } else if ((view instanceof a2) && (fl0Var = ((a2) view).d) != null && (d02 = d0(fl0Var.f42974a, pageBlock, iArr)) != null) {
            return d02;
        } else {
            return null;
        }
    }
}
