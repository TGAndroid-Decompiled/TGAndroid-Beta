package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
public final class f61 extends AsyncTask {
    public int f33596a = 0;
    public final i61 f33597b;

    public f61(i61 i61Var) {
        this.f33597b = i61Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Bitmap frameAtTime;
        i61 i61Var = this.f33597b;
        this.f33596a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                frameAtTime = i61Var.f34617r.getFrameAtTime(i61Var.f34621y * this.f33596a * 1000, 2);
            } catch (Exception e10) {
                e = e10;
            }
            try {
                if (!isCancelled()) {
                    if (frameAtTime != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(i61Var.D, i61Var.E, frameAtTime.getConfig());
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(i61Var.D / frameAtTime.getWidth(), i61Var.E / frameAtTime.getHeight());
                        int width = (int) (frameAtTime.getWidth() * max);
                        int height = (int) (frameAtTime.getHeight() * max);
                        canvas.drawBitmap(frameAtTime, new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight()), new Rect((i61Var.D - width) / 2, (i61Var.E - height) / 2, width, height), (Paint) null);
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
            i61 i61Var = this.f33597b;
            i61Var.f34619w.add(bitmap);
            i61Var.invalidate();
            int i7 = this.f33596a;
            if (i7 < i61Var.F) {
                i61Var.b(i7 + 1);
            } else {
                i61Var.O = true;
            }
        }
    }
}
