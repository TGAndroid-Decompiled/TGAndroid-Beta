package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import java.util.ArrayList;
public final class d71 extends AsyncTask {
    public int f25432a = 0;
    public final Paint f25433b = new Paint(3);
    public final g71 f25434c;

    public d71(g71 g71Var) {
        this.f25434c = g71Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Bitmap frameAtTime;
        g71 g71Var = this.f25434c;
        this.f25432a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                frameAtTime = g71Var.D.getFrameAtTime(g71Var.H * this.f25432a * 1000, 2);
            } catch (Exception e) {
                e = e;
            }
            try {
                if (!isCancelled()) {
                    if (frameAtTime != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(g71Var.I, g71Var.J, frameAtTime.getConfig());
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(g71Var.I / frameAtTime.getWidth(), g71Var.J / frameAtTime.getHeight());
                        int width = (int) (frameAtTime.getWidth() * max);
                        int height = (int) (frameAtTime.getHeight() * max);
                        Rect rect = new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight());
                        int i10 = g71Var.I;
                        int i11 = g71Var.J;
                        canvas.drawBitmap(frameAtTime, rect, new Rect((i10 - width) / 2, (i11 - height) / 2, (i10 + width) / 2, (i11 + height) / 2), this.f25433b);
                        frameAtTime.recycle();
                        return createBitmap;
                    }
                    return frameAtTime;
                }
            } catch (Exception e7) {
                e = e7;
                bitmap = frameAtTime;
                org.telegram.messenger.f8.g(e, true);
                return bitmap;
            }
        }
        return null;
    }

    @Override
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (!isCancelled()) {
            g71 g71Var = this.f25434c;
            ArrayList arrayList = g71Var.F;
            ?? obj2 = new Object();
            obj2.f25770a = bitmap;
            arrayList.add(obj2);
            g71Var.invalidate();
            int i10 = this.f25432a;
            if (i10 < g71Var.K) {
                g71Var.d(i10 + 1);
            }
        }
    }
}
