package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
public final class t81 extends AsyncTask {
    public int f31088a = 0;
    public final Paint f31089b = new Paint(3);
    public final w81 f31090c;

    public t81(w81 w81Var) {
        this.f31090c = w81Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Bitmap frameAtTime;
        w81 w81Var = this.f31090c;
        this.f31088a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                frameAtTime = w81Var.f32583y.getFrameAtTime(w81Var.H * this.f31088a * 1000, 2);
            } catch (Exception e7) {
                e = e7;
            }
            try {
                if (!isCancelled()) {
                    if (frameAtTime != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(w81Var.I, w81Var.J, frameAtTime.getConfig());
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(w81Var.I / frameAtTime.getWidth(), w81Var.J / frameAtTime.getHeight());
                        int width = (int) (frameAtTime.getWidth() * max);
                        int height = (int) (frameAtTime.getHeight() * max);
                        Rect rect = new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight());
                        int i10 = w81Var.I;
                        int i11 = w81Var.J;
                        canvas.drawBitmap(frameAtTime, rect, new Rect((i10 - width) / 2, (i11 - height) / 2, (i10 + width) / 2, (i11 + height) / 2), this.f31089b);
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
            w81 w81Var = this.f31090c;
            ArrayList arrayList = w81Var.F;
            ?? obj2 = new Object();
            obj2.f31395a = bitmap;
            arrayList.add(obj2);
            w81Var.invalidate();
            int i10 = this.f31088a;
            if (i10 < w81Var.K) {
                w81Var.d(i10 + 1);
            }
        }
    }
}
