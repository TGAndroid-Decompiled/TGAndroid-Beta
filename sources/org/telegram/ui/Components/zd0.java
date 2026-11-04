package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.MediaController;
import org.telegram.ui.PhotoViewer;
public final class zd0 extends org.telegram.ui.l4 {
    public final int h;
    public final Object f41029n;

    public zd0(int i3, Context context, Object obj) {
        super(context);
        this.h = i3;
        this.f41029n = obj;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.h) {
            case 2:
                if (!((PhotoViewer) this.f41029n).U8) {
                    super.draw(canvas);
                    return;
                }
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.messenger.zi ziVar;
        switch (this.h) {
            case 0:
                boolean drawChild = super.drawChild(canvas, view, j10);
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f41029n;
                if (view == pipRoundVideoView.f31499c && (ziVar = MediaController.B().f21348v0) != null) {
                    pipRoundVideoView.F.set(org.telegram.messenger.g0.N(1.5f), org.telegram.messenger.g0.N(1.5f), getMeasuredWidth() - org.telegram.messenger.g0.N(1.5f), getMeasuredHeight() - org.telegram.messenger.g0.N(1.5f));
                    canvas.drawArc(pipRoundVideoView.F, -90.0f, ziVar.f26828b0 * 360.0f, false, org.telegram.ui.ActionBar.k6.f28003k2);
                }
                return drawChild;
            case 1:
            default:
                return super.drawChild(canvas, view, j10);
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) this.f41029n;
                if (view == photoViewer.F3 && photoViewer.f41441h4) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onMeasure(int i3, int i10) {
        switch (this.h) {
            case 1:
                super.onMeasure(i3, i10);
                d71 d71Var = (d71) this.f41029n;
                if (d71Var.f33005f != null) {
                    ViewGroup.LayoutParams layoutParams = d71Var.d.getLayoutParams();
                    layoutParams.width = getMeasuredWidth();
                    layoutParams.height = getMeasuredHeight();
                    ImageView imageView = d71Var.f33003e;
                    if (imageView != null) {
                        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                        layoutParams2.width = getMeasuredWidth();
                        layoutParams2.height = getMeasuredHeight();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                super.onMeasure(i3, i10);
                PhotoViewer photoViewer = (PhotoViewer) this.f41029n;
                ImageView imageView2 = photoViewer.f41591y3;
                if (imageView2 != null) {
                    ViewGroup.LayoutParams layoutParams3 = imageView2.getLayoutParams();
                    layoutParams3.width = getMeasuredWidth();
                    layoutParams3.height = getMeasuredHeight();
                }
                TextureView textureView = photoViewer.C2;
                if (textureView instanceof b51) {
                    textureView.setPivotX(textureView.getMeasuredWidth() / 2);
                    photoViewer.F2.setPivotX(photoViewer.C2.getMeasuredWidth() / 2);
                } else {
                    if (textureView != null) {
                        textureView.setPivotX(0.0f);
                    }
                    SurfaceView surfaceView = photoViewer.D2;
                    if (surfaceView != null) {
                        surfaceView.setPivotX(0.0f);
                    }
                    photoViewer.F2.setPivotX(0.0f);
                }
                photoViewer.A0();
                return;
            default:
                super.onMeasure(i3, i10);
                return;
        }
    }
}
