package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import org.telegram.messenger.FileLog;
public final class f81 extends AsyncTask {
    public int f22935a = 0;
    public final i81 f22936b;

    public f81(i81 i81Var) {
        this.f22936b = i81Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Bitmap frameAtTime;
        i81 i81Var = this.f22936b;
        this.f22935a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                frameAtTime = i81Var.f23930r.getFrameAtTime(i81Var.f23933x * this.f22935a * 1000, 2);
            } catch (Exception e) {
                e = e;
            }
            try {
                if (!isCancelled()) {
                    if (frameAtTime != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(i81Var.f23934y, i81Var.E, frameAtTime.getConfig());
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(i81Var.f23934y / frameAtTime.getWidth(), i81Var.E / frameAtTime.getHeight());
                        int width = (int) (frameAtTime.getWidth() * max);
                        int height = (int) (frameAtTime.getHeight() * max);
                        canvas.drawBitmap(frameAtTime, new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight()), new Rect((i81Var.f23934y - width) / 2, (i81Var.E - height) / 2, width, height), (Paint) null);
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
            i81 i81Var = this.f22936b;
            i81Var.v.add(bitmap);
            i81Var.invalidate();
            int i10 = this.f22935a;
            if (i10 < i81Var.F) {
                i81Var.b(i10 + 1);
            } else {
                i81Var.O = true;
            }
        }
    }
}
