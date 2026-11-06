package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import java.util.ArrayList;
public final class z51 extends AsyncTask {
    public int f40875a = 0;
    public final Paint f40876b = new Paint(3);
    public final c61 f40877c;

    public z51(c61 c61Var) {
        this.f40877c = c61Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Bitmap frameAtTime;
        c61 c61Var = this.f40877c;
        this.f40875a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                frameAtTime = c61Var.D.getFrameAtTime(c61Var.H * this.f40875a * 1000, 2);
            } catch (Exception e10) {
                e = e10;
            }
            try {
                if (!isCancelled()) {
                    if (frameAtTime != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(c61Var.I, c61Var.J, frameAtTime.getConfig());
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(c61Var.I / frameAtTime.getWidth(), c61Var.J / frameAtTime.getHeight());
                        int width = (int) (frameAtTime.getWidth() * max);
                        int height = (int) (frameAtTime.getHeight() * max);
                        Rect rect = new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight());
                        int i7 = c61Var.I;
                        int i10 = c61Var.J;
                        canvas.drawBitmap(frameAtTime, rect, new Rect((i7 - width) / 2, (i10 - height) / 2, (i7 + width) / 2, (i10 + height) / 2), this.f40876b);
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
            c61 c61Var = this.f40877c;
            ArrayList arrayList = c61Var.F;
            ?? obj2 = new Object();
            obj2.f31708a = bitmap;
            arrayList.add(obj2);
            c61Var.invalidate();
            int i7 = this.f40875a;
            if (i7 < c61Var.K) {
                c61Var.d(i7 + 1);
            }
        }
    }
}
