package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import org.telegram.messenger.FileLog;
public final class i71 extends AsyncTask {
    public int f29335a = 0;
    public final l71 f29336b;

    public i71(l71 l71Var) {
        this.f29336b = l71Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Bitmap frameAtTime;
        l71 l71Var = this.f29336b;
        this.f29335a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                frameAtTime = l71Var.f30254r.getFrameAtTime(l71Var.f30257x * this.f29335a * 1000, 2);
            } catch (Exception e10) {
                e = e10;
            }
            try {
                if (!isCancelled()) {
                    if (frameAtTime != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(l71Var.f30258y, l71Var.A, frameAtTime.getConfig());
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(l71Var.f30258y / frameAtTime.getWidth(), l71Var.A / frameAtTime.getHeight());
                        int width = (int) (frameAtTime.getWidth() * max);
                        int height = (int) (frameAtTime.getHeight() * max);
                        canvas.drawBitmap(frameAtTime, new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight()), new Rect((l71Var.f30258y - width) / 2, (l71Var.A - height) / 2, width, height), (Paint) null);
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
            l71 l71Var = this.f29336b;
            l71Var.v.add(bitmap);
            l71Var.invalidate();
            int i10 = this.f29335a;
            if (i10 < l71Var.B) {
                l71Var.b(i10 + 1);
            } else {
                l71Var.K = true;
            }
        }
    }
}
