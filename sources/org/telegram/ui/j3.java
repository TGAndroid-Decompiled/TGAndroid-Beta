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
public final class j3 extends pt0 {
    public final int[] f39418a = new int[2];
    public final List f39419b;
    public final m4 f39420c;

    public j3(m4 m4Var, List list) {
        this.f39420c = m4Var;
        this.f39419b = list;
    }

    @Override
    public final void D() {
        this.f39420c.n();
    }

    @Override
    public final zt0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        if (i10 >= 0) {
            List list = this.f39419b;
            if (i10 < list.size()) {
                m4 m4Var = this.f39420c;
                int[] iArr = this.f39418a;
                ImageReceiver c02 = c0(m4Var.f40404q0[0].f41513b, (TL_iv.PageBlock) list.get(i10), iArr);
                if (c02 != null) {
                    zt0 zt0Var = new zt0();
                    zt0Var.f45317b = iArr[0];
                    zt0Var.f45318c = iArr[1];
                    zt0Var.d = m4Var.f40404q0[0].f41513b;
                    zt0Var.f45316a = c02;
                    zt0Var.f45319e = c02.getBitmapSafe();
                    zt0Var.h = c02.getRoundRadius(true);
                    zt0Var.f45323j = m4Var.E0;
                    return zt0Var;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void X(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j3.X(int):void");
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
        org.telegram.ui.Components.vk0 vk0Var;
        ImageReceiver d02;
        ImageReceiver d03;
        VideoPlayerHolderBase videoPlayerHolderBase;
        if (view instanceof g2) {
            g2 g2Var = (g2) view;
            if (g2Var.J == pageBlock) {
                view.getLocationInWindow(iArr);
                return g2Var.f38434e;
            }
            return null;
        } else if (view instanceof b3) {
            b3 b3Var = (b3) view;
            ImageReceiver imageReceiver = b3Var.f36665e;
            TextureView textureView = b3Var.f36667n;
            if (b3Var.H == pageBlock) {
                view.getLocationInWindow(iArr);
                m4 m4Var = this.f39420c;
                if (b3Var == m4Var.f37388x && (videoPlayerHolderBase = m4Var.f37387w) != null && videoPlayerHolderBase.firstFrameRendered && textureView.getSurfaceTexture() != null) {
                    if (Build.VERSION.SDK_INT >= 24) {
                        Surface surface = new Surface(textureView.getSurfaceTexture());
                        Bitmap createBitmap = Bitmap.createBitmap(textureView.getMeasuredWidth(), textureView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                        AndroidUtilities.getBitmapFromSurface(surface, createBitmap);
                        surface.release();
                        imageReceiver.setImageBitmap(createBitmap);
                    } else {
                        imageReceiver.setImageBitmap(textureView.getBitmap());
                    }
                    int i10 = b3.R;
                    textureView.setAlpha(0.0f);
                }
                return imageReceiver;
            }
            return null;
        } else if (view instanceof n1) {
            ImageReceiver c02 = c0(((n1) view).f40675a, pageBlock, iArr);
            if (c02 != null) {
                return c02;
            }
            return null;
        } else if (view instanceof u2) {
            ImageReceiver c03 = c0(((u2) view).f43135a, pageBlock, iArr);
            if (c03 != null) {
                return c03;
            }
            return null;
        } else if (view instanceof b2) {
            org.telegram.ui.Components.vk0 vk0Var2 = ((b2) view).d;
            if (vk0Var2 != null && (d03 = d0(vk0Var2.f6432a, pageBlock, iArr)) != null) {
                return d03;
            }
            return null;
        } else if ((view instanceof e2) && (vk0Var = ((e2) view).d) != null && (d02 = d0(vk0Var.f6432a, pageBlock, iArr)) != null) {
            return d02;
        } else {
            return null;
        }
    }
}
