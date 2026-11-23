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
public final class te0 extends org.telegram.ui.j4 {
    public final int h;
    public final Object f39912n;

    public te0(int i7, Context context, Object obj) {
        super(context);
        this.h = i7;
        this.f39912n = obj;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.h) {
            case 2:
                Drawable[] drawableArr = PhotoViewer.f43272f9;
                ((PhotoViewer) this.f39912n).getClass();
                super.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.messenger.fj fjVar;
        switch (this.h) {
            case 0:
                boolean drawChild = super.drawChild(canvas, view, j3);
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f39912n;
                if (view == pipRoundVideoView.f33103c && (fjVar = MediaController.B().f22838v0) != null) {
                    pipRoundVideoView.F.set(org.telegram.messenger.g0.N(1.5f), org.telegram.messenger.g0.N(1.5f), getMeasuredWidth() - org.telegram.messenger.g0.N(1.5f), getMeasuredHeight() - org.telegram.messenger.g0.N(1.5f));
                    canvas.drawArc(pipRoundVideoView.F, -90.0f, fjVar.f24033b0 * 360.0f, false, org.telegram.ui.ActionBar.n6.f29576k2);
                }
                return drawChild;
            case 1:
            default:
                return super.drawChild(canvas, view, j3);
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) this.f39912n;
                if (view == photoViewer.E3 && photoViewer.f43347g4) {
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
                a81 a81Var = (a81) this.f39912n;
                if (a81Var.f33406f != null) {
                    ViewGroup.LayoutParams layoutParams = a81Var.d.getLayoutParams();
                    layoutParams.width = getMeasuredWidth();
                    layoutParams.height = getMeasuredHeight();
                    ImageView imageView = a81Var.f33404e;
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
                PhotoViewer photoViewer = (PhotoViewer) this.f39912n;
                ImageView imageView2 = photoViewer.f43495x3;
                if (imageView2 != null) {
                    ViewGroup.LayoutParams layoutParams3 = imageView2.getLayoutParams();
                    layoutParams3.width = getMeasuredWidth();
                    layoutParams3.height = getMeasuredHeight();
                }
                TextureView textureView = photoViewer.C2;
                if (textureView instanceof x51) {
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
                photoViewer.s0();
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }
}
