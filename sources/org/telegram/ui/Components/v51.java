package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import java.util.ArrayList;
public final class v51 extends AsyncTask {
    public int f38869a = 0;
    public final Paint f38870b = new Paint(3);
    public final y51 f38871c;

    public v51(y51 y51Var) {
        this.f38871c = y51Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Bitmap frameAtTime;
        y51 y51Var = this.f38871c;
        this.f38869a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                frameAtTime = y51Var.D.getFrameAtTime(y51Var.H * this.f38869a * 1000, 2);
            } catch (Exception e10) {
                e = e10;
            }
            try {
                if (!isCancelled()) {
                    if (frameAtTime != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(y51Var.I, y51Var.J, frameAtTime.getConfig());
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(y51Var.I / frameAtTime.getWidth(), y51Var.J / frameAtTime.getHeight());
                        int width = (int) (frameAtTime.getWidth() * max);
                        int height = (int) (frameAtTime.getHeight() * max);
                        Rect rect = new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight());
                        int i7 = y51Var.I;
                        int i10 = y51Var.J;
                        canvas.drawBitmap(frameAtTime, rect, new Rect((i7 - width) / 2, (i10 - height) / 2, (i7 + width) / 2, (i10 + height) / 2), this.f38870b);
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
            y51 y51Var = this.f38871c;
            ArrayList arrayList = y51Var.F;
            ?? obj2 = new Object();
            obj2.f39860a = bitmap;
            arrayList.add(obj2);
            y51Var.invalidate();
            int i7 = this.f38869a;
            if (i7 < y51Var.K) {
                y51Var.d(i7 + 1);
            }
        }
    }
}
