package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class ps0 extends c5.c {
    public final PhotoViewer h;

    public ps0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.h = photoViewer;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.h.O8) {
            return;
        }
        super.draw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        PhotoViewer photoViewer = this.h;
        if (view == photoViewer.A3 && photoViewer.f35602c4) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        PhotoViewer photoViewer = this.h;
        ImageView imageView = photoViewer.f35755t3;
        if (imageView != null) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.width = getMeasuredWidth();
            layoutParams.height = getMeasuredHeight();
        }
        TextureView textureView = photoViewer.f35790x2;
        if (textureView instanceof org.telegram.ui.Components.y51) {
            textureView.setPivotX(textureView.getMeasuredWidth() / 2);
            photoViewer.A2.setPivotX(photoViewer.f35790x2.getMeasuredWidth() / 2);
        } else {
            if (textureView != null) {
                textureView.setPivotX(0.0f);
            }
            SurfaceView surfaceView = photoViewer.f35800y2;
            if (surfaceView != null) {
                surfaceView.setPivotX(0.0f);
            }
            photoViewer.A2.setPivotX(0.0f);
        }
        photoViewer.y0();
    }
}
