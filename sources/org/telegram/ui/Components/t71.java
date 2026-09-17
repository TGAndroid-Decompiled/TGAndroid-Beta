package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import org.telegram.messenger.FileLog;
public final class t71 extends AsyncTask {
    public int f28030a = 0;
    public final w71 f28031b;

    public t71(w71 w71Var) {
        this.f28031b = w71Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Bitmap frameAtTime;
        w71 w71Var = this.f28031b;
        this.f28030a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                frameAtTime = w71Var.f29588r.getFrameAtTime(w71Var.f29591x * this.f28030a * 1000, 2);
            } catch (Exception e) {
                e = e;
            }
            try {
                if (!isCancelled()) {
                    if (frameAtTime != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(w71Var.f29592y, w71Var.E, frameAtTime.getConfig());
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(w71Var.f29592y / frameAtTime.getWidth(), w71Var.E / frameAtTime.getHeight());
                        int width = (int) (frameAtTime.getWidth() * max);
                        int height = (int) (frameAtTime.getHeight() * max);
                        canvas.drawBitmap(frameAtTime, new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight()), new Rect((w71Var.f29592y - width) / 2, (w71Var.E - height) / 2, width, height), (Paint) null);
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
            w71 w71Var = this.f28031b;
            w71Var.v.add(bitmap);
            w71Var.invalidate();
            int i10 = this.f28030a;
            if (i10 < w71Var.F) {
                w71Var.b(i10 + 1);
            } else {
                w71Var.O = true;
            }
        }
    }
}
