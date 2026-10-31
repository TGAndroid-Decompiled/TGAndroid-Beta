package org.telegram.ui;

import android.graphics.Bitmap;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class d3 extends yr0 {
    public final int[] f36601a = new int[2];
    public final List f36602b;
    public final h4 f36603c;

    public d3(h4 h4Var, List list) {
        this.f36603c = h4Var;
        this.f36602b = list;
    }

    @Override
    public final void D() {
        this.f36603c.l();
    }

    @Override
    public final gs0 E(org.telegram.messenger.jj jjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        if (i10 >= 0) {
            List list = this.f36602b;
            if (i10 < list.size()) {
                h4 h4Var = this.f36603c;
                int[] iArr = this.f36601a;
                ImageReceiver d02 = d0(h4Var.f37746u0[0].f39038b, (TL_iv.PageBlock) list.get(i10), iArr);
                if (d02 != null) {
                    gs0 gs0Var = new gs0();
                    gs0Var.f37628b = iArr[0];
                    gs0Var.f37629c = iArr[1];
                    gs0Var.d = h4Var.f37746u0[0].f39038b;
                    gs0Var.f37627a = d02;
                    gs0Var.e = d02.p();
                    gs0Var.h = d02.E();
                    gs0Var.f37633j = h4Var.J0;
                    return gs0Var;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void Y(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.d3.Y(int):void");
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
        org.telegram.ui.Components.ck0 ck0Var;
        ImageReceiver e02;
        ImageReceiver e03;
        VideoPlayerHolderBase videoPlayerHolderBase;
        if (view instanceof b2) {
            b2 b2Var = (b2) view;
            if (b2Var.N == pageBlock) {
                view.getLocationInWindow(iArr);
                return b2Var.e;
            }
            return null;
        } else if (view instanceof v2) {
            v2 v2Var = (v2) view;
            ImageReceiver imageReceiver = v2Var.e;
            TextureView textureView = v2Var.f42576n;
            if (v2Var.L == pageBlock) {
                view.getLocationInWindow(iArr);
                h4 h4Var = this.f36603c;
                if (v2Var == h4Var.f39489y && (videoPlayerHolderBase = h4Var.f39488x) != null && videoPlayerHolderBase.firstFrameRendered && textureView.getSurfaceTexture() != null) {
                    if (Build.VERSION.SDK_INT >= 24) {
                        Surface surface = new Surface(textureView.getSurfaceTexture());
                        Bitmap createBitmap = Bitmap.createBitmap(textureView.getMeasuredWidth(), textureView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                        org.telegram.messenger.i0.y0(surface, createBitmap);
                        surface.release();
                        imageReceiver.v0(createBitmap);
                    } else {
                        imageReceiver.v0(textureView.getBitmap());
                    }
                    int i10 = v2.V;
                    textureView.setAlpha(0.0f);
                }
                return imageReceiver;
            }
            return null;
        } else if (view instanceof j1) {
            ImageReceiver d02 = d0(((j1) view).f38404a, pageBlock, iArr);
            if (d02 != null) {
                return d02;
            }
            return null;
        } else if (view instanceof o2) {
            ImageReceiver d03 = d0(((o2) view).f40108b, pageBlock, iArr);
            if (d03 != null) {
                return d03;
            }
            return null;
        } else if (view instanceof w1) {
            org.telegram.ui.Components.ck0 ck0Var2 = ((w1) view).d;
            if (ck0Var2 != null && (e03 = e0(ck0Var2.f47898a, pageBlock, iArr)) != null) {
                return e03;
            }
            return null;
        } else if ((view instanceof z1) && (ck0Var = ((z1) view).d) != null && (e02 = e0(ck0Var.f47898a, pageBlock, iArr)) != null) {
            return e02;
        } else {
            return null;
        }
    }
}
