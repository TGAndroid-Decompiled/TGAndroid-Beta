package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import org.telegram.messenger.FileLog;
public final class h81 extends AsyncTask {
    public int f24725a = 0;
    public final k81 f24726b;

    public h81(k81 k81Var) {
        this.f24726b = k81Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Bitmap frameAtTime;
        k81 k81Var = this.f24726b;
        this.f24725a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                frameAtTime = k81Var.f25646r.getFrameAtTime(k81Var.f25649x * this.f24725a * 1000, 2);
            } catch (Exception e) {
                e = e;
            }
            try {
                if (!isCancelled()) {
                    if (frameAtTime != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(k81Var.f25650y, k81Var.E, frameAtTime.getConfig());
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(k81Var.f25650y / frameAtTime.getWidth(), k81Var.E / frameAtTime.getHeight());
                        int width = (int) (frameAtTime.getWidth() * max);
                        int height = (int) (frameAtTime.getHeight() * max);
                        canvas.drawBitmap(frameAtTime, new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight()), new Rect((k81Var.f25650y - width) / 2, (k81Var.E - height) / 2, width, height), (Paint) null);
                        frameAtTime.recycle();
                        return createBitmap;
                    }
                    return frameAtTime;
                }
            } catch (Exception e7) {
                e = e7;
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
            k81 k81Var = this.f24726b;
            k81Var.v.add(bitmap);
            k81Var.invalidate();
            int i10 = this.f24725a;
            if (i10 < k81Var.F) {
                k81Var.b(i10 + 1);
            } else {
                k81Var.O = true;
            }
        }
    }
}
