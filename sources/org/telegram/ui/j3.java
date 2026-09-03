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
public final class j3 extends fu0 {
    public final int[] f35071a = new int[2];
    public final List f35072b;
    public final n4 f35073c;

    public j3(n4 n4Var, List list) {
        this.f35073c = n4Var;
        this.f35072b = list;
    }

    @Override
    public final void D() {
        this.f35073c.n();
    }

    @Override
    public final qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        if (i10 >= 0) {
            List list = this.f35072b;
            if (i10 < list.size()) {
                n4 n4Var = this.f35073c;
                int[] iArr = this.f35071a;
                ImageReceiver c02 = c0(n4Var.f36375r0[0].f37684b, (TL_iv.PageBlock) list.get(i10), iArr);
                if (c02 != null) {
                    qu0 qu0Var = new qu0();
                    qu0Var.f37488b = iArr[0];
                    qu0Var.f37489c = iArr[1];
                    qu0Var.d = n4Var.f36375r0[0].f37684b;
                    qu0Var.f37487a = c02;
                    qu0Var.e = c02.getBitmapSafe();
                    qu0Var.h = c02.getRoundRadius(true);
                    qu0Var.f37493j = n4Var.F0;
                    return qu0Var;
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
        org.telegram.ui.Components.dl0 dl0Var;
        ImageReceiver d02;
        ImageReceiver d03;
        VideoPlayerHolderBase videoPlayerHolderBase;
        if (view instanceof g2) {
            g2 g2Var = (g2) view;
            if (g2Var.K == pageBlock) {
                view.getLocationInWindow(iArr);
                return g2Var.e;
            }
            return null;
        } else if (view instanceof b3) {
            b3 b3Var = (b3) view;
            ImageReceiver imageReceiver = b3Var.e;
            TextureView textureView = b3Var.f32713n;
            if (b3Var.I == pageBlock) {
                view.getLocationInWindow(iArr);
                n4 n4Var = this.f35073c;
                if (b3Var == n4Var.f36988x && (videoPlayerHolderBase = n4Var.f36987w) != null && videoPlayerHolderBase.firstFrameRendered && textureView.getSurfaceTexture() != null) {
                    if (Build.VERSION.SDK_INT >= 24) {
                        Surface surface = new Surface(textureView.getSurfaceTexture());
                        Bitmap createBitmap = Bitmap.createBitmap(textureView.getMeasuredWidth(), textureView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                        AndroidUtilities.getBitmapFromSurface(surface, createBitmap);
                        surface.release();
                        imageReceiver.setImageBitmap(createBitmap);
                    } else {
                        imageReceiver.setImageBitmap(textureView.getBitmap());
                    }
                    int i10 = b3.S;
                    textureView.setAlpha(0.0f);
                }
                return imageReceiver;
            }
            return null;
        } else if (view instanceof n1) {
            ImageReceiver c02 = c0(((n1) view).f36299a, pageBlock, iArr);
            if (c02 != null) {
                return c02;
            }
            return null;
        } else if (view instanceof u2) {
            ImageReceiver c03 = c0(((u2) view).f38663a, pageBlock, iArr);
            if (c03 != null) {
                return c03;
            }
            return null;
        } else if (view instanceof b2) {
            org.telegram.ui.Components.dl0 dl0Var2 = ((b2) view).d;
            if (dl0Var2 != null && (d03 = d0(dl0Var2.f5774a, pageBlock, iArr)) != null) {
                return d03;
            }
            return null;
        } else if ((view instanceof e2) && (dl0Var = ((e2) view).d) != null && (d02 = d0(dl0Var.f5774a, pageBlock, iArr)) != null) {
            return d02;
        } else {
            return null;
        }
    }
}
