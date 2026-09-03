package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import org.telegram.messenger.FileLog;
public final class v71 extends AsyncTask {
    public int f31816a = 0;
    public final y71 f31817b;

    public v71(y71 y71Var) {
        this.f31817b = y71Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Bitmap frameAtTime;
        y71 y71Var = this.f31817b;
        this.f31816a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                frameAtTime = y71Var.f33408r.getFrameAtTime(y71Var.f33411x * this.f31816a * 1000, 2);
            } catch (Exception e6) {
                e = e6;
            }
            try {
                if (!isCancelled()) {
                    if (frameAtTime != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(y71Var.f33412y, y71Var.B, frameAtTime.getConfig());
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(y71Var.f33412y / frameAtTime.getWidth(), y71Var.B / frameAtTime.getHeight());
                        int width = (int) (frameAtTime.getWidth() * max);
                        int height = (int) (frameAtTime.getHeight() * max);
                        canvas.drawBitmap(frameAtTime, new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight()), new Rect((y71Var.f33412y - width) / 2, (y71Var.B - height) / 2, width, height), (Paint) null);
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
            y71 y71Var = this.f31817b;
            y71Var.v.add(bitmap);
            y71Var.invalidate();
            int i10 = this.f31816a;
            if (i10 < y71Var.C) {
                y71Var.b(i10 + 1);
            } else {
                y71Var.L = true;
            }
        }
    }
}
