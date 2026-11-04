package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
public final class x51 extends AsyncTask {
    public int f40241a = 0;
    public final a61 f40242b;

    public x51(a61 a61Var) {
        this.f40242b = a61Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Bitmap frameAtTime;
        a61 a61Var = this.f40242b;
        this.f40241a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                frameAtTime = a61Var.f31739r.getFrameAtTime(a61Var.f31743y * this.f40241a * 1000, 2);
            } catch (Exception e10) {
                e = e10;
            }
            try {
                if (!isCancelled()) {
                    if (frameAtTime != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(a61Var.E, a61Var.F, frameAtTime.getConfig());
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(a61Var.E / frameAtTime.getWidth(), a61Var.F / frameAtTime.getHeight());
                        int width = (int) (frameAtTime.getWidth() * max);
                        int height = (int) (frameAtTime.getHeight() * max);
                        canvas.drawBitmap(frameAtTime, new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight()), new Rect((a61Var.E - width) / 2, (a61Var.F - height) / 2, width, height), (Paint) null);
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
            a61 a61Var = this.f40242b;
            a61Var.f31741w.add(bitmap);
            a61Var.invalidate();
            int i3 = this.f40241a;
            if (i3 < a61Var.G) {
                a61Var.b(i3 + 1);
            } else {
                a61Var.P = true;
            }
        }
    }
}
