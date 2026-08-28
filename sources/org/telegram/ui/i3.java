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
public final class i3 extends rt0 {
    public final int[] f38997a = new int[2];
    public final List f38998b;
    public final l4 f38999c;

    public i3(l4 l4Var, List list) {
        this.f38999c = l4Var;
        this.f38998b = list;
    }

    @Override
    public final void D() {
        this.f38999c.n();
    }

    @Override
    public final bu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i9, boolean z10, boolean z11) {
        if (i9 >= 0) {
            List list = this.f38998b;
            if (i9 < list.size()) {
                l4 l4Var = this.f38999c;
                int[] iArr = this.f38997a;
                ImageReceiver c02 = c0(l4Var.f40026q0[0].f41320b, (TL_iv.PageBlock) list.get(i9), iArr);
                if (c02 != null) {
                    bu0 bu0Var = new bu0();
                    bu0Var.f36979b = iArr[0];
                    bu0Var.f36980c = iArr[1];
                    bu0Var.d = l4Var.f40026q0[0].f41320b;
                    bu0Var.f36978a = c02;
                    bu0Var.f36981e = c02.getBitmapSafe();
                    bu0Var.h = c02.getRoundRadius(true);
                    bu0Var.f36985j = l4Var.E0;
                    return bu0Var;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void X(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.i3.X(int):void");
    }

    public final ImageReceiver c0(ViewGroup viewGroup, TL_iv.PageBlock pageBlock, int[] iArr) {
        int childCount = viewGroup.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            ImageReceiver d02 = d0(viewGroup.getChildAt(i9), pageBlock, iArr);
            if (d02 != null) {
                return d02;
            }
        }
        return null;
    }

    public final ImageReceiver d0(View view, TL_iv.PageBlock pageBlock, int[] iArr) {
        org.telegram.ui.Components.ik0 ik0Var;
        ImageReceiver d02;
        ImageReceiver d03;
        VideoPlayerHolderBase videoPlayerHolderBase;
        if (view instanceof f2) {
            f2 f2Var = (f2) view;
            if (f2Var.J == pageBlock) {
                view.getLocationInWindow(iArr);
                return f2Var.f38113e;
            }
            return null;
        } else if (view instanceof a3) {
            a3 a3Var = (a3) view;
            ImageReceiver imageReceiver = a3Var.f36348e;
            TextureView textureView = a3Var.f36350n;
            if (a3Var.H == pageBlock) {
                view.getLocationInWindow(iArr);
                l4 l4Var = this.f38999c;
                if (a3Var == l4Var.f36382x && (videoPlayerHolderBase = l4Var.f36381w) != null && videoPlayerHolderBase.firstFrameRendered && textureView.getSurfaceTexture() != null) {
                    if (Build.VERSION.SDK_INT >= 24) {
                        Surface surface = new Surface(textureView.getSurfaceTexture());
                        Bitmap createBitmap = Bitmap.createBitmap(textureView.getMeasuredWidth(), textureView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                        AndroidUtilities.getBitmapFromSurface(surface, createBitmap);
                        surface.release();
                        imageReceiver.setImageBitmap(createBitmap);
                    } else {
                        imageReceiver.setImageBitmap(textureView.getBitmap());
                    }
                    int i9 = a3.R;
                    textureView.setAlpha(0.0f);
                }
                return imageReceiver;
            }
            return null;
        } else if (view instanceof m1) {
            ImageReceiver c02 = c0(((m1) view).f40284a, pageBlock, iArr);
            if (c02 != null) {
                return c02;
            }
            return null;
        } else if (view instanceof t2) {
            ImageReceiver c03 = c0(((t2) view).f42811a, pageBlock, iArr);
            if (c03 != null) {
                return c03;
            }
            return null;
        } else if (view instanceof a2) {
            org.telegram.ui.Components.ik0 ik0Var2 = ((a2) view).d;
            if (ik0Var2 != null && (d03 = d0(ik0Var2.f5501a, pageBlock, iArr)) != null) {
                return d03;
            }
            return null;
        } else if ((view instanceof d2) && (ik0Var = ((d2) view).d) != null && (d02 = d0(ik0Var.f5501a, pageBlock, iArr)) != null) {
            return d02;
        } else {
            return null;
        }
    }
}
