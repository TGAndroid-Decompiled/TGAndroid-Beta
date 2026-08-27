package org.telegram.ui;

import android.graphics.Bitmap;
import android.os.Build;
import android.view.Surface;
import android.view.SurfaceView;
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

public final class j3 extends st0 {

    public final int[] f39244a = new int[2];

    public final List f39245b;

    public final m4 f39246c;

    public j3(m4 m4Var, List list) {
        this.f39246c = m4Var;
        this.f39245b = list;
    }

    @Override
    public final void D() {
        this.f39246c.n();
    }

    @Override
    public final cu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        if (i10 < 0) {
            return null;
        }
        List list = this.f39245b;
        if (i10 >= list.size()) {
            return null;
        }
        m4 m4Var = this.f39246c;
        lh.w wVar = m4Var.f40347q0[0].f41496b;
        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) list.get(i10);
        int[] iArr = this.f39244a;
        ImageReceiver imageReceiverC0 = c0(wVar, pageBlock, iArr);
        if (imageReceiverC0 == null) {
            return null;
        }
        cu0 cu0Var = new cu0();
        cu0Var.f37154b = iArr[0];
        cu0Var.f37155c = iArr[1];
        cu0Var.d = m4Var.f40347q0[0].f41496b;
        cu0Var.f37153a = imageReceiverC0;
        cu0Var.f37156e = imageReceiverC0.getBitmapSafe();
        cu0Var.h = imageReceiverC0.getRoundRadius(true);
        cu0Var.f37160j = m4Var.E0;
        return cu0Var;
    }

    @Override
    public final void X(int i10) {
        TL_iv.PageBlock pageBlock;
        Bitmap bitmap;
        Bitmap bitmap2;
        b3 b3Var = null;
        if (i10 >= 0) {
            List list = this.f39245b;
            if (i10 < list.size()) {
                pageBlock = (TL_iv.PageBlock) list.get(i10);
            } else {
                pageBlock = null;
            }
        } else {
            pageBlock = null;
        }
        org.telegram.ui.Components.m61 m61Var = PhotoViewer.t1().B2;
        TextureView textureView = PhotoViewer.t1().f35794x2;
        SurfaceView surfaceView = PhotoViewer.t1().f35803y2;
        m4 m4Var = this.f39246c;
        q3[] q3VarArr = m4Var.f40347q0;
        a0.h hVar = m4Var.f37294y;
        lh.w wVar = q3VarArr[0].f41496b;
        int childCount = wVar.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = wVar.getChildAt(i11);
            if (childAt instanceof b3) {
                b3 b3Var2 = (b3) childAt;
                if (b3Var2.H == pageBlock) {
                    b3Var = b3Var2;
                    break;
                }
            }
        }
        if (b3Var != null && m61Var != null && textureView != null) {
            long j10 = b3Var.H.video_id;
            c3 c3Var = new c3();
            c3Var.f36926a = m61Var.o();
            if (textureView.getSurfaceTexture() != null) {
                if (Build.VERSION.SDK_INT >= 24) {
                    Surface surface = new Surface(textureView.getSurfaceTexture());
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(textureView.getMeasuredWidth(), textureView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    AndroidUtilities.getBitmapFromSurface(surface, bitmapCreateBitmap);
                    surface.release();
                    c3Var.f36927b = bitmapCreateBitmap;
                } else {
                    c3Var.f36927b = textureView.getBitmap();
                }
            }
            b3Var.c(c3Var);
            hVar.k(c3Var, j10);
            int i12 = b3.R;
            b3Var.f36687n.setAlpha(0.0f);
            c3 c3Var2 = b3Var.I;
            if (c3Var2 != null && (bitmap2 = c3Var2.f36927b) != null) {
                b3Var.f36685e.setImageBitmap(bitmap2);
            }
        }
        if (b3Var != null && m61Var != null && surfaceView != null) {
            long j11 = b3Var.H.video_id;
            c3 c3Var3 = new c3();
            c3Var3.f36926a = m61Var.o();
            if (Build.VERSION.SDK_INT >= 24) {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(surfaceView.getMeasuredWidth(), surfaceView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                AndroidUtilities.getBitmapFromSurface(surfaceView, bitmapCreateBitmap2);
                c3Var3.f36927b = bitmapCreateBitmap2;
            }
            b3Var.c(c3Var3);
            hVar.k(c3Var3, j11);
            int i13 = b3.R;
            b3Var.f36687n.setAlpha(0.0f);
            c3 c3Var4 = b3Var.I;
            if (c3Var4 != null && (bitmap = c3Var4.f36927b) != null) {
                b3Var.f36685e.setImageBitmap(bitmap);
            }
        }
        m4Var.n();
    }

    public final ImageReceiver c0(ViewGroup viewGroup, TL_iv.PageBlock pageBlock, int[] iArr) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            ImageReceiver imageReceiverD0 = d0(viewGroup.getChildAt(i10), pageBlock, iArr);
            if (imageReceiverD0 != null) {
                return imageReceiverD0;
            }
        }
        return null;
    }

    public final ImageReceiver d0(View view, TL_iv.PageBlock pageBlock, int[] iArr) {
        org.telegram.ui.Components.lk0 lk0Var;
        ImageReceiver imageReceiverD0;
        ImageReceiver imageReceiverD1;
        VideoPlayerHolderBase videoPlayerHolderBase;
        if (view instanceof g2) {
            g2 g2Var = (g2) view;
            if (g2Var.J != pageBlock) {
                return null;
            }
            view.getLocationInWindow(iArr);
            return g2Var.f38277e;
        }
        if (view instanceof b3) {
            b3 b3Var = (b3) view;
            ImageReceiver imageReceiver = b3Var.f36685e;
            TextureView textureView = b3Var.f36687n;
            if (b3Var.H != pageBlock) {
                return null;
            }
            view.getLocationInWindow(iArr);
            m4 m4Var = this.f39246c;
            if (b3Var == m4Var.f37293x && (videoPlayerHolderBase = m4Var.f37292w) != null && videoPlayerHolderBase.firstFrameRendered && textureView.getSurfaceTexture() != null) {
                if (Build.VERSION.SDK_INT >= 24) {
                    Surface surface = new Surface(textureView.getSurfaceTexture());
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(textureView.getMeasuredWidth(), textureView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    AndroidUtilities.getBitmapFromSurface(surface, bitmapCreateBitmap);
                    surface.release();
                    imageReceiver.setImageBitmap(bitmapCreateBitmap);
                } else {
                    imageReceiver.setImageBitmap(textureView.getBitmap());
                }
                int i10 = b3.R;
                textureView.setAlpha(0.0f);
            }
            return imageReceiver;
        }
        if (view instanceof n1) {
            ImageReceiver imageReceiverC0 = c0(((n1) view).f40627a, pageBlock, iArr);
            if (imageReceiverC0 != null) {
                return imageReceiverC0;
            }
            return null;
        }
        if (view instanceof u2) {
            ImageReceiver imageReceiverC1 = c0(((u2) view).f43068a, pageBlock, iArr);
            if (imageReceiverC1 != null) {
                return imageReceiverC1;
            }
            return null;
        }
        if (view instanceof b2) {
            org.telegram.ui.Components.lk0 lk0Var2 = ((b2) view).d;
            if (lk0Var2 == null || (imageReceiverD1 = d0(lk0Var2.f5789a, pageBlock, iArr)) == null) {
                return null;
            }
            return imageReceiverD1;
        }
        if (!(view instanceof e2) || (lk0Var = ((e2) view).d) == null || (imageReceiverD0 = d0(lk0Var.f5789a, pageBlock, iArr)) == null) {
            return null;
        }
        return imageReceiverD0;
    }
}
