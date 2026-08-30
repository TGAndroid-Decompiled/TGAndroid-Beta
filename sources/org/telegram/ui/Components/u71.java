package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import org.telegram.messenger.FileLog;
public final class u71 extends AsyncTask {
    public int f29119a = 0;
    public final x71 f29120b;

    public u71(x71 x71Var) {
        this.f29120b = x71Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Bitmap frameAtTime;
        x71 x71Var = this.f29120b;
        this.f29119a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                frameAtTime = x71Var.f30597r.getFrameAtTime(x71Var.f30600x * this.f29119a * 1000, 2);
            } catch (Exception e) {
                e = e;
            }
            try {
                if (!isCancelled()) {
                    if (frameAtTime != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(x71Var.f30601y, x71Var.B, frameAtTime.getConfig());
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(x71Var.f30601y / frameAtTime.getWidth(), x71Var.B / frameAtTime.getHeight());
                        int width = (int) (frameAtTime.getWidth() * max);
                        int height = (int) (frameAtTime.getHeight() * max);
                        canvas.drawBitmap(frameAtTime, new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight()), new Rect((x71Var.f30601y - width) / 2, (x71Var.B - height) / 2, width, height), (Paint) null);
                        frameAtTime.recycle();
                        return createBitmap;
                    }
                    return frameAtTime;
                }
            } catch (Exception e6) {
                e = e6;
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
            x71 x71Var = this.f29120b;
            x71Var.v.add(bitmap);
            x71Var.invalidate();
            int i10 = this.f29119a;
            if (i10 < x71Var.C) {
                x71Var.b(i10 + 1);
            } else {
                x71Var.L = true;
            }
        }
    }
}
