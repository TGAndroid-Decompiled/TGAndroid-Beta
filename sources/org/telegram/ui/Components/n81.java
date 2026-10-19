package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import org.telegram.messenger.FileLog;
public final class n81 extends AsyncTask {
    public int f28694a = 0;
    public final q81 f28695b;

    public n81(q81 q81Var) {
        this.f28695b = q81Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Bitmap frameAtTime;
        q81 q81Var = this.f28695b;
        this.f28694a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                frameAtTime = q81Var.f29552r.getFrameAtTime(q81Var.f29555x * this.f28694a * 1000, 2);
            } catch (Exception e) {
                e = e;
            }
            try {
                if (!isCancelled()) {
                    if (frameAtTime != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(q81Var.f29556y, q81Var.E, frameAtTime.getConfig());
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(q81Var.f29556y / frameAtTime.getWidth(), q81Var.E / frameAtTime.getHeight());
                        int width = (int) (frameAtTime.getWidth() * max);
                        int height = (int) (frameAtTime.getHeight() * max);
                        canvas.drawBitmap(frameAtTime, new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight()), new Rect((q81Var.f29556y - width) / 2, (q81Var.E - height) / 2, width, height), (Paint) null);
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
            q81 q81Var = this.f28695b;
            q81Var.v.add(bitmap);
            q81Var.invalidate();
            int i10 = this.f28694a;
            if (i10 < q81Var.F) {
                q81Var.b(i10 + 1);
            } else {
                q81Var.O = true;
            }
        }
    }
}
