package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
public final class t61 extends AsyncTask {
    public int f39743a = 0;
    public final w61 f39744b;

    public t61(w61 w61Var) {
        this.f39744b = w61Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Bitmap frameAtTime;
        w61 w61Var = this.f39744b;
        this.f39743a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                frameAtTime = w61Var.f41643r.getFrameAtTime(w61Var.f41647y * this.f39743a * 1000, 2);
            } catch (Exception e10) {
                e = e10;
            }
            try {
                if (!isCancelled()) {
                    if (frameAtTime != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(w61Var.E, w61Var.F, frameAtTime.getConfig());
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(w61Var.E / frameAtTime.getWidth(), w61Var.F / frameAtTime.getHeight());
                        int width = (int) (frameAtTime.getWidth() * max);
                        int height = (int) (frameAtTime.getHeight() * max);
                        canvas.drawBitmap(frameAtTime, new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight()), new Rect((w61Var.E - width) / 2, (w61Var.F - height) / 2, width, height), (Paint) null);
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
            w61 w61Var = this.f39744b;
            w61Var.f41645w.add(bitmap);
            w61Var.invalidate();
            int i7 = this.f39743a;
            if (i7 < w61Var.G) {
                w61Var.b(i7 + 1);
            } else {
                w61Var.P = true;
            }
        }
    }
}
