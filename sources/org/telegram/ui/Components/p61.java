package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import java.util.ArrayList;
public final class p61 extends AsyncTask {
    public int f38518a = 0;
    public final Paint f38519b = new Paint(3);
    public final s61 f38520c;

    public p61(s61 s61Var) {
        this.f38520c = s61Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Bitmap frameAtTime;
        s61 s61Var = this.f38520c;
        this.f38518a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                frameAtTime = s61Var.E.getFrameAtTime(s61Var.I * this.f38518a * 1000, 2);
            } catch (Exception e10) {
                e = e10;
            }
            try {
                if (!isCancelled()) {
                    if (frameAtTime != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(s61Var.J, s61Var.K, frameAtTime.getConfig());
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(s61Var.J / frameAtTime.getWidth(), s61Var.K / frameAtTime.getHeight());
                        int width = (int) (frameAtTime.getWidth() * max);
                        int height = (int) (frameAtTime.getHeight() * max);
                        Rect rect = new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight());
                        int i7 = s61Var.J;
                        int i10 = s61Var.K;
                        canvas.drawBitmap(frameAtTime, rect, new Rect((i7 - width) / 2, (i10 - height) / 2, (i7 + width) / 2, (i10 + height) / 2), this.f38519b);
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
            s61 s61Var = this.f38520c;
            ArrayList arrayList = s61Var.G;
            ?? obj2 = new Object();
            obj2.f38803a = bitmap;
            arrayList.add(obj2);
            s61Var.invalidate();
            int i7 = this.f38518a;
            if (i7 < s61Var.L) {
                s61Var.d(i7 + 1);
            }
        }
    }
}
