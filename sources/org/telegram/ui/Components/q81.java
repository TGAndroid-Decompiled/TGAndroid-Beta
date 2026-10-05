package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import org.telegram.messenger.FileLog;
public final class q81 extends AsyncTask {
    public int f29982a = 0;
    public final t81 f29983b;

    public q81(t81 t81Var) {
        this.f29983b = t81Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Bitmap frameAtTime;
        t81 t81Var = this.f29983b;
        this.f29982a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                frameAtTime = t81Var.f31084r.getFrameAtTime(t81Var.f31087x * this.f29982a * 1000, 2);
            } catch (Exception e7) {
                e = e7;
            }
            try {
                if (!isCancelled()) {
                    if (frameAtTime != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(t81Var.f31088y, t81Var.E, frameAtTime.getConfig());
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(t81Var.f31088y / frameAtTime.getWidth(), t81Var.E / frameAtTime.getHeight());
                        int width = (int) (frameAtTime.getWidth() * max);
                        int height = (int) (frameAtTime.getHeight() * max);
                        canvas.drawBitmap(frameAtTime, new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight()), new Rect((t81Var.f31088y - width) / 2, (t81Var.E - height) / 2, width, height), (Paint) null);
                        frameAtTime.recycle();
                        return createBitmap;
                    }
                    return frameAtTime;
                }
            } catch (Exception e10) {
                e = e10;
                bitmap = frameAtTime;
                FileLog.e(e);
                return bitmap;
            }
        }
        return null;
    }

    @Override
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (!isCancelled()) {
            t81 t81Var = this.f29983b;
            t81Var.v.add(bitmap);
            t81Var.invalidate();
            int i10 = this.f29982a;
            if (i10 < t81Var.F) {
                t81Var.b(i10 + 1);
            } else {
                t81Var.O = true;
            }
        }
    }
}
