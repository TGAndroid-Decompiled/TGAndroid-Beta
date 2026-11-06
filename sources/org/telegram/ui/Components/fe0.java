package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.MediaController;
import org.telegram.ui.PhotoViewer;
public final class fe0 extends org.telegram.ui.j4 {
    public final int h;
    public final Object f33528n;

    public fe0(int i7, Context context, Object obj) {
        super(context);
        this.h = i7;
        this.f33528n = obj;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.h) {
            case 2:
                Drawable[] drawableArr = PhotoViewer.Y8;
                ((PhotoViewer) this.f33528n).getClass();
                super.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.messenger.ij ijVar;
        switch (this.h) {
            case 0:
                boolean drawChild = super.drawChild(canvas, view, j3);
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f33528n;
                if (view == pipRoundVideoView.f31424c && (ijVar = MediaController.B().f21292u0) != null) {
                    pipRoundVideoView.E.set(org.telegram.messenger.g0.N(1.5f), org.telegram.messenger.g0.N(1.5f), getMeasuredWidth() - org.telegram.messenger.g0.N(1.5f), getMeasuredHeight() - org.telegram.messenger.g0.N(1.5f));
                    canvas.drawArc(pipRoundVideoView.E, -90.0f, ijVar.f23204b0 * 360.0f, false, org.telegram.ui.ActionBar.k6.f27974k2);
                }
                return drawChild;
            case 1:
            default:
                return super.drawChild(canvas, view, j3);
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) this.f33528n;
                if (view == photoViewer.D3 && photoViewer.f41394f4) {
                    return true;
                }
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.h) {
            case 1:
                super.onMeasure(i7, i10);
                l71 l71Var = (l71) this.f33528n;
                if (l71Var.f35561f != null) {
                    ViewGroup.LayoutParams layoutParams = l71Var.d.getLayoutParams();
                    layoutParams.width = getMeasuredWidth();
                    layoutParams.height = getMeasuredHeight();
                    ImageView imageView = l71Var.f35559e;
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
                super.onMeasure(i7, i10);
                PhotoViewer photoViewer = (PhotoViewer) this.f33528n;
                ImageView imageView2 = photoViewer.f41541w3;
                if (imageView2 != null) {
                    ViewGroup.LayoutParams layoutParams3 = imageView2.getLayoutParams();
                    layoutParams3.width = getMeasuredWidth();
                    layoutParams3.height = getMeasuredHeight();
                }
                TextureView textureView = photoViewer.B2;
                if (textureView instanceof h51) {
                    textureView.setPivotX(textureView.getMeasuredWidth() / 2);
                    photoViewer.E2.setPivotX(photoViewer.B2.getMeasuredWidth() / 2);
                } else {
                    if (textureView != null) {
                        textureView.setPivotX(0.0f);
                    }
                    SurfaceView surfaceView = photoViewer.C2;
                    if (surfaceView != null) {
                        surfaceView.setPivotX(0.0f);
                    }
                    photoViewer.E2.setPivotX(0.0f);
                }
                photoViewer.s0();
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }
}
