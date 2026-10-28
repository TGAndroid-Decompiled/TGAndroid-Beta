package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import org.telegram.messenger.FileLog;
public final class f91 extends AsyncTask {
    public int f28063a = 0;
    public final i91 f28064b;

    public f91(i91 i91Var) {
        this.f28064b = i91Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Bitmap frameAtTime;
        i91 i91Var = this.f28064b;
        this.f28063a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                frameAtTime = i91Var.f29270r.getFrameAtTime(i91Var.f29273x * this.f28063a * 1000, 2);
            } catch (Exception e) {
                e = e;
            }
            try {
                if (!isCancelled()) {
                    if (frameAtTime != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(i91Var.f29274y, i91Var.E, frameAtTime.getConfig());
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(i91Var.f29274y / frameAtTime.getWidth(), i91Var.E / frameAtTime.getHeight());
                        int width = (int) (frameAtTime.getWidth() * max);
                        int height = (int) (frameAtTime.getHeight() * max);
                        canvas.drawBitmap(frameAtTime, new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight()), new Rect((i91Var.f29274y - width) / 2, (i91Var.E - height) / 2, width, height), (Paint) null);
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
            i91 i91Var = this.f28064b;
            i91Var.v.add(bitmap);
            i91Var.invalidate();
            int i10 = this.f28063a;
            if (i10 < i91Var.F) {
                i91Var.b(i10 + 1);
            } else {
                i91Var.O = true;
            }
        }
    }
}
