package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import org.telegram.messenger.FileLog;
public final class z81 extends AsyncTask {
    public int f33448a = 0;
    public final c91 f33449b;

    public z81(c91 c91Var) {
        this.f33449b = c91Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Bitmap frameAtTime;
        c91 c91Var = this.f33449b;
        this.f33448a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                frameAtTime = c91Var.f25160r.getFrameAtTime(c91Var.f25163x * this.f33448a * 1000, 2);
            } catch (Exception e7) {
                e = e7;
            }
            try {
                if (!isCancelled()) {
                    if (frameAtTime != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(c91Var.f25164y, c91Var.E, frameAtTime.getConfig());
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(c91Var.f25164y / frameAtTime.getWidth(), c91Var.E / frameAtTime.getHeight());
                        int width = (int) (frameAtTime.getWidth() * max);
                        int height = (int) (frameAtTime.getHeight() * max);
                        canvas.drawBitmap(frameAtTime, new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight()), new Rect((c91Var.f25164y - width) / 2, (c91Var.E - height) / 2, width, height), (Paint) null);
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
            c91 c91Var = this.f33449b;
            c91Var.v.add(bitmap);
            c91Var.invalidate();
            int i10 = this.f33448a;
            if (i10 < c91Var.F) {
                c91Var.b(i10 + 1);
            } else {
                c91Var.O = true;
            }
        }
    }
}
