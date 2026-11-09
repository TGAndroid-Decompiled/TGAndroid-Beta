package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import java.util.ArrayList;
public final class b61 extends AsyncTask {
    public int f32112a = 0;
    public final Paint f32113b = new Paint(3);
    public final e61 f32114c;

    public b61(e61 e61Var) {
        this.f32114c = e61Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Bitmap frameAtTime;
        e61 e61Var = this.f32114c;
        this.f32112a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                frameAtTime = e61Var.D.getFrameAtTime(e61Var.H * this.f32112a * 1000, 2);
            } catch (Exception e10) {
                e = e10;
            }
            try {
                if (!isCancelled()) {
                    if (frameAtTime != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(e61Var.I, e61Var.J, frameAtTime.getConfig());
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(e61Var.I / frameAtTime.getWidth(), e61Var.J / frameAtTime.getHeight());
                        int width = (int) (frameAtTime.getWidth() * max);
                        int height = (int) (frameAtTime.getHeight() * max);
                        Rect rect = new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight());
                        int i7 = e61Var.I;
                        int i10 = e61Var.J;
                        canvas.drawBitmap(frameAtTime, rect, new Rect((i7 - width) / 2, (i10 - height) / 2, (i7 + width) / 2, (i10 + height) / 2), this.f32113b);
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
            e61 e61Var = this.f32114c;
            ArrayList arrayList = e61Var.F;
            ?? obj2 = new Object();
            obj2.f32550a = bitmap;
            arrayList.add(obj2);
            e61Var.invalidate();
            int i7 = this.f32112a;
            if (i7 < e61Var.K) {
                e61Var.d(i7 + 1);
            }
        }
    }
}
