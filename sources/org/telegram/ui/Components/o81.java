package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import org.telegram.messenger.FileLog;
public final class o81 extends AsyncTask {
    public int f28967a = 0;
    public final r81 f28968b;

    public o81(r81 r81Var) {
        this.f28968b = r81Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Bitmap frameAtTime;
        r81 r81Var = this.f28968b;
        this.f28967a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                frameAtTime = r81Var.f29887r.getFrameAtTime(r81Var.f29890x * this.f28967a * 1000, 2);
            } catch (Exception e) {
                e = e;
            }
            try {
                if (!isCancelled()) {
                    if (frameAtTime != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(r81Var.f29891y, r81Var.E, frameAtTime.getConfig());
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(r81Var.f29891y / frameAtTime.getWidth(), r81Var.E / frameAtTime.getHeight());
                        int width = (int) (frameAtTime.getWidth() * max);
                        int height = (int) (frameAtTime.getHeight() * max);
                        canvas.drawBitmap(frameAtTime, new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight()), new Rect((r81Var.f29891y - width) / 2, (r81Var.E - height) / 2, width, height), (Paint) null);
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
            r81 r81Var = this.f28968b;
            r81Var.v.add(bitmap);
            r81Var.invalidate();
            int i10 = this.f28967a;
            if (i10 < r81Var.F) {
                r81Var.b(i10 + 1);
            } else {
                r81Var.O = true;
            }
        }
    }
}
