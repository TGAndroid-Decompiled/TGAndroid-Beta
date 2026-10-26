package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import org.telegram.messenger.FileLog;
public final class e91 extends AsyncTask {
    public int f27772a = 0;
    public final h91 f27773b;

    public e91(h91 h91Var) {
        this.f27773b = h91Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Bitmap frameAtTime;
        h91 h91Var = this.f27773b;
        this.f27772a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                frameAtTime = h91Var.f28885r.getFrameAtTime(h91Var.f28888x * this.f27772a * 1000, 2);
            } catch (Exception e) {
                e = e;
            }
            try {
                if (!isCancelled()) {
                    if (frameAtTime != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(h91Var.f28889y, h91Var.E, frameAtTime.getConfig());
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(h91Var.f28889y / frameAtTime.getWidth(), h91Var.E / frameAtTime.getHeight());
                        int width = (int) (frameAtTime.getWidth() * max);
                        int height = (int) (frameAtTime.getHeight() * max);
                        canvas.drawBitmap(frameAtTime, new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight()), new Rect((h91Var.f28889y - width) / 2, (h91Var.E - height) / 2, width, height), (Paint) null);
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
            h91 h91Var = this.f27773b;
            h91Var.v.add(bitmap);
            h91Var.invalidate();
            int i10 = this.f27772a;
            if (i10 < h91Var.F) {
                h91Var.b(i10 + 1);
            } else {
                h91Var.O = true;
            }
        }
    }
}
