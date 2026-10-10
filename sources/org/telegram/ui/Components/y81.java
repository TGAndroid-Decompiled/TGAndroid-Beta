package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import org.telegram.messenger.FileLog;
public final class y81 extends AsyncTask {
    public int f33133a = 0;
    public final b91 f33134b;

    public y81(b91 b91Var) {
        this.f33134b = b91Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Bitmap frameAtTime;
        b91 b91Var = this.f33134b;
        this.f33133a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                frameAtTime = b91Var.f24899r.getFrameAtTime(b91Var.f24902x * this.f33133a * 1000, 2);
            } catch (Exception e7) {
                e = e7;
            }
            try {
                if (!isCancelled()) {
                    if (frameAtTime != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(b91Var.f24903y, b91Var.E, frameAtTime.getConfig());
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(b91Var.f24903y / frameAtTime.getWidth(), b91Var.E / frameAtTime.getHeight());
                        int width = (int) (frameAtTime.getWidth() * max);
                        int height = (int) (frameAtTime.getHeight() * max);
                        canvas.drawBitmap(frameAtTime, new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight()), new Rect((b91Var.f24903y - width) / 2, (b91Var.E - height) / 2, width, height), (Paint) null);
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
            b91 b91Var = this.f33134b;
            b91Var.v.add(bitmap);
            b91Var.invalidate();
            int i10 = this.f33133a;
            if (i10 < b91Var.F) {
                b91Var.b(i10 + 1);
            } else {
                b91Var.O = true;
            }
        }
    }
}
