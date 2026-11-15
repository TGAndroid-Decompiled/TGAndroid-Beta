package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import java.util.ArrayList;
public final class b61 extends AsyncTask {
    public int f33210a = 0;
    public final Paint f33211b = new Paint(3);
    public final e61 f33212c;

    public b61(e61 e61Var) {
        this.f33212c = e61Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Bitmap frameAtTime;
        e61 e61Var = this.f33212c;
        this.f33210a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                frameAtTime = e61Var.E.getFrameAtTime(e61Var.I * this.f33210a * 1000, 2);
            } catch (Exception e10) {
                e = e10;
            }
            try {
                if (!isCancelled()) {
                    if (frameAtTime != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(e61Var.J, e61Var.K, frameAtTime.getConfig());
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(e61Var.J / frameAtTime.getWidth(), e61Var.K / frameAtTime.getHeight());
                        int width = (int) (frameAtTime.getWidth() * max);
                        int height = (int) (frameAtTime.getHeight() * max);
                        Rect rect = new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight());
                        int i7 = e61Var.J;
                        int i10 = e61Var.K;
                        canvas.drawBitmap(frameAtTime, rect, new Rect((i7 - width) / 2, (i10 - height) / 2, (i7 + width) / 2, (i10 + height) / 2), this.f33211b);
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
            e61 e61Var = this.f33212c;
            ArrayList arrayList = e61Var.G;
            ?? obj2 = new Object();
            obj2.f33516a = bitmap;
            arrayList.add(obj2);
            e61Var.invalidate();
            int i7 = this.f33210a;
            if (i7 < e61Var.L) {
                e61Var.d(i7 + 1);
            }
        }
    }
}
