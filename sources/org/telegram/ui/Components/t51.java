package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import java.util.ArrayList;
public final class t51 extends AsyncTask {
    public int f38305a = 0;
    public final Paint f38306b = new Paint(3);
    public final w51 f38307c;

    public t51(w51 w51Var) {
        this.f38307c = w51Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Bitmap frameAtTime;
        w51 w51Var = this.f38307c;
        this.f38305a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                frameAtTime = w51Var.E.getFrameAtTime(w51Var.I * this.f38305a * 1000, 2);
            } catch (Exception e10) {
                e = e10;
            }
            try {
                if (!isCancelled()) {
                    if (frameAtTime != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(w51Var.J, w51Var.K, frameAtTime.getConfig());
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(w51Var.J / frameAtTime.getWidth(), w51Var.K / frameAtTime.getHeight());
                        int width = (int) (frameAtTime.getWidth() * max);
                        int height = (int) (frameAtTime.getHeight() * max);
                        Rect rect = new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight());
                        int i3 = w51Var.J;
                        int i10 = w51Var.K;
                        canvas.drawBitmap(frameAtTime, rect, new Rect((i3 - width) / 2, (i10 - height) / 2, (i3 + width) / 2, (i10 + height) / 2), this.f38306b);
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
            w51 w51Var = this.f38307c;
            ArrayList arrayList = w51Var.G;
            ?? obj2 = new Object();
            obj2.f38654a = bitmap;
            arrayList.add(obj2);
            w51Var.invalidate();
            int i3 = this.f38305a;
            if (i3 < w51Var.L) {
                w51Var.d(i3 + 1);
            }
        }
    }
}
