package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import org.telegram.messenger.FileLog;
public final class w61 extends AsyncTask {
    public int f34123a = 0;
    public final z61 f34124b;

    public w61(z61 z61Var) {
        this.f34124b = z61Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Bitmap frameAtTime;
        z61 z61Var = this.f34124b;
        this.f34123a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                frameAtTime = z61Var.f35211r.getFrameAtTime(z61Var.f35214x * this.f34123a * 1000, 2);
            } catch (Exception e10) {
                e = e10;
            }
            try {
                if (!isCancelled()) {
                    if (frameAtTime != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(z61Var.f35215y, z61Var.A, frameAtTime.getConfig());
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(z61Var.f35215y / frameAtTime.getWidth(), z61Var.A / frameAtTime.getHeight());
                        int width = (int) (frameAtTime.getWidth() * max);
                        int height = (int) (frameAtTime.getHeight() * max);
                        canvas.drawBitmap(frameAtTime, new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight()), new Rect((z61Var.f35215y - width) / 2, (z61Var.A - height) / 2, width, height), (Paint) null);
                        frameAtTime.recycle();
                        return createBitmap;
                    }
                    return frameAtTime;
                }
            } catch (Exception e11) {
                e = e11;
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
            z61 z61Var = this.f34124b;
            z61Var.v.add(bitmap);
            z61Var.invalidate();
            int i9 = this.f34123a;
            if (i9 < z61Var.B) {
                z61Var.b(i9 + 1);
            } else {
                z61Var.K = true;
            }
        }
    }
}
