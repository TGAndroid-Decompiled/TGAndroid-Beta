package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import java.util.ArrayList;
public final class q61 extends AsyncTask {
    public int f38718a = 0;
    public final Paint f38719b = new Paint(3);
    public final t61 f38720c;

    public q61(t61 t61Var) {
        this.f38720c = t61Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Bitmap frameAtTime;
        t61 t61Var = this.f38720c;
        this.f38718a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                frameAtTime = t61Var.E.getFrameAtTime(t61Var.I * this.f38718a * 1000, 2);
            } catch (Exception e10) {
                e = e10;
            }
            try {
                if (!isCancelled()) {
                    if (frameAtTime != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(t61Var.J, t61Var.K, frameAtTime.getConfig());
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(t61Var.J / frameAtTime.getWidth(), t61Var.K / frameAtTime.getHeight());
                        int width = (int) (frameAtTime.getWidth() * max);
                        int height = (int) (frameAtTime.getHeight() * max);
                        Rect rect = new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight());
                        int i7 = t61Var.J;
                        int i10 = t61Var.K;
                        canvas.drawBitmap(frameAtTime, rect, new Rect((i7 - width) / 2, (i10 - height) / 2, (i7 + width) / 2, (i10 + height) / 2), this.f38719b);
                        frameAtTime.recycle();
                        return createBitmap;
                    }
                    return frameAtTime;
                }
            } catch (Exception e11) {
                e = e11;
                bitmap = frameAtTime;
                org.telegram.messenger.a8.g(e, true);
                return bitmap;
            }
        }
        return null;
    }

    @Override
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (!isCancelled()) {
            t61 t61Var = this.f38720c;
            ArrayList arrayList = t61Var.G;
            ?? obj2 = new Object();
            obj2.f39224a = bitmap;
            arrayList.add(obj2);
            t61Var.invalidate();
            int i7 = this.f38718a;
            if (i7 < t61Var.L) {
                t61Var.d(i7 + 1);
            }
        }
    }
}
