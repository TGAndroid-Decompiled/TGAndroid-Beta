package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
public final class u61 extends AsyncTask {
    public int f40287a = 0;
    public final x61 f40288b;

    public u61(x61 x61Var) {
        this.f40288b = x61Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Bitmap frameAtTime;
        x61 x61Var = this.f40288b;
        this.f40287a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                frameAtTime = x61Var.f41907r.getFrameAtTime(x61Var.f41911y * this.f40287a * 1000, 2);
            } catch (Exception e10) {
                e = e10;
            }
            try {
                if (!isCancelled()) {
                    if (frameAtTime != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(x61Var.E, x61Var.F, frameAtTime.getConfig());
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(x61Var.E / frameAtTime.getWidth(), x61Var.F / frameAtTime.getHeight());
                        int width = (int) (frameAtTime.getWidth() * max);
                        int height = (int) (frameAtTime.getHeight() * max);
                        canvas.drawBitmap(frameAtTime, new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight()), new Rect((x61Var.E - width) / 2, (x61Var.F - height) / 2, width, height), (Paint) null);
                        frameAtTime.recycle();
                        return createBitmap;
                    }
                    return frameAtTime;
                }
            } catch (Exception e11) {
                e = e11;
                bitmap = frameAtTime;
                org.telegram.messenger.a8.g(e, true);
                return bitmap;
            }
        }
        return null;
    }

    @Override
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (!isCancelled()) {
            x61 x61Var = this.f40288b;
            x61Var.f41909w.add(bitmap);
            x61Var.invalidate();
            int i7 = this.f40287a;
            if (i7 < x61Var.G) {
                x61Var.b(i7 + 1);
            } else {
                x61Var.P = true;
            }
        }
    }
}
