package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import java.util.ArrayList;
public final class a61 extends AsyncTask {
    public int f31721a = 0;
    public final Paint f31722b = new Paint(3);
    public final d61 f31723c;

    public a61(d61 d61Var) {
        this.f31723c = d61Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Bitmap frameAtTime;
        d61 d61Var = this.f31723c;
        this.f31721a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                frameAtTime = d61Var.D.getFrameAtTime(d61Var.H * this.f31721a * 1000, 2);
            } catch (Exception e10) {
                e = e10;
            }
            try {
                if (!isCancelled()) {
                    if (frameAtTime != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(d61Var.I, d61Var.J, frameAtTime.getConfig());
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(d61Var.I / frameAtTime.getWidth(), d61Var.J / frameAtTime.getHeight());
                        int width = (int) (frameAtTime.getWidth() * max);
                        int height = (int) (frameAtTime.getHeight() * max);
                        Rect rect = new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight());
                        int i7 = d61Var.I;
                        int i10 = d61Var.J;
                        canvas.drawBitmap(frameAtTime, rect, new Rect((i7 - width) / 2, (i10 - height) / 2, (i7 + width) / 2, (i10 + height) / 2), this.f31722b);
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
            d61 d61Var = this.f31723c;
            ArrayList arrayList = d61Var.F;
            ?? obj2 = new Object();
            obj2.f32126a = bitmap;
            arrayList.add(obj2);
            d61Var.invalidate();
            int i7 = this.f31721a;
            if (i7 < d61Var.K) {
                d61Var.d(i7 + 1);
            }
        }
    }
}
