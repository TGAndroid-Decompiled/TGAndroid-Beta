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
public final class af0 extends org.telegram.ui.k4 {
    public final int h;
    public final Object f24390n;

    public af0(Object obj, Context context, int i10) {
        super(context);
        this.h = i10;
        this.f24390n = obj;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.h) {
            case 2:
                if (!((PhotoViewer) this.f24390n).T8) {
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
        org.telegram.messenger.kj kjVar;
        switch (this.h) {
            case 0:
                boolean drawChild = super.drawChild(canvas, view, j10);
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f24390n;
                if (view == pipRoundVideoView.f24079c && (kjVar = MediaController.B().f14483u0) != null) {
                    pipRoundVideoView.E.set(org.telegram.messenger.i0.N(1.5f), org.telegram.messenger.i0.N(1.5f), getMeasuredWidth() - org.telegram.messenger.i0.N(1.5f), getMeasuredHeight() - org.telegram.messenger.i0.N(1.5f));
                    canvas.drawArc(pipRoundVideoView.E, -90.0f, kjVar.f16652b0 * 360.0f, false, org.telegram.ui.ActionBar.t6.f21055k2);
                }
                return drawChild;
            case 1:
            default:
                return super.drawChild(canvas, view, j10);
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) this.f24390n;
                if (view == photoViewer.E3 && photoViewer.f33498g4) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.h) {
            case 1:
                super.onMeasure(i10, i11);
                n81 n81Var = (n81) this.f24390n;
                if (n81Var.f28733f != null) {
                    ViewGroup.LayoutParams layoutParams = n81Var.d.getLayoutParams();
                    layoutParams.width = getMeasuredWidth();
                    layoutParams.height = getMeasuredHeight();
                    ImageView imageView = n81Var.e;
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
                super.onMeasure(i10, i11);
                PhotoViewer photoViewer = (PhotoViewer) this.f24390n;
                ImageView imageView2 = photoViewer.f33650x3;
                if (imageView2 != null) {
                    ViewGroup.LayoutParams layoutParams3 = imageView2.getLayoutParams();
                    layoutParams3.width = getMeasuredWidth();
                    layoutParams3.height = getMeasuredHeight();
                }
                TextureView textureView = photoViewer.B2;
                if (textureView instanceof l61) {
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
                photoViewer.A0();
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }
}
