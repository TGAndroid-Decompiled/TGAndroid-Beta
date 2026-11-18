package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import java.util.ArrayList;
public final class m61 extends AsyncTask {
    public int f37403a = 0;
    public final Paint f37404b = new Paint(3);
    public final p61 f37405c;

    public m61(p61 p61Var) {
        this.f37405c = p61Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Bitmap frameAtTime;
        p61 p61Var = this.f37405c;
        this.f37403a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                frameAtTime = p61Var.E.getFrameAtTime(p61Var.I * this.f37403a * 1000, 2);
            } catch (Exception e10) {
                e = e10;
            }
            try {
                if (!isCancelled()) {
                    if (frameAtTime != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(p61Var.J, p61Var.K, frameAtTime.getConfig());
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(p61Var.J / frameAtTime.getWidth(), p61Var.K / frameAtTime.getHeight());
                        int width = (int) (frameAtTime.getWidth() * max);
                        int height = (int) (frameAtTime.getHeight() * max);
                        Rect rect = new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight());
                        int i7 = p61Var.J;
                        int i10 = p61Var.K;
                        canvas.drawBitmap(frameAtTime, rect, new Rect((i7 - width) / 2, (i10 - height) / 2, (i7 + width) / 2, (i10 + height) / 2), this.f37404b);
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
            p61 p61Var = this.f37405c;
            ArrayList arrayList = p61Var.G;
            ?? obj2 = new Object();
            obj2.f37745a = bitmap;
            arrayList.add(obj2);
            p61Var.invalidate();
            int i7 = this.f37403a;
            if (i7 < p61Var.L) {
                p61Var.d(i7 + 1);
            }
        }
    }
}
