package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
public final class q81 extends AsyncTask {
    public int f28550a = 0;
    public final Paint f28551b = new Paint(3);
    public final t81 f28552c;

    public q81(t81 t81Var) {
        this.f28552c = t81Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Bitmap frameAtTime;
        t81 t81Var = this.f28552c;
        this.f28550a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                frameAtTime = t81Var.f29310y.getFrameAtTime(t81Var.H * this.f28550a * 1000, 2);
            } catch (Exception e) {
                e = e;
            }
            try {
                if (!isCancelled()) {
                    if (frameAtTime != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(t81Var.I, t81Var.J, frameAtTime.getConfig());
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(t81Var.I / frameAtTime.getWidth(), t81Var.J / frameAtTime.getHeight());
                        int width = (int) (frameAtTime.getWidth() * max);
                        int height = (int) (frameAtTime.getHeight() * max);
                        Rect rect = new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight());
                        int i10 = t81Var.I;
                        int i11 = t81Var.J;
                        canvas.drawBitmap(frameAtTime, rect, new Rect((i10 - width) / 2, (i11 - height) / 2, (i10 + width) / 2, (i11 + height) / 2), this.f28551b);
                        frameAtTime.recycle();
                        return createBitmap;
                    }
                    return frameAtTime;
                }
            } catch (Exception e7) {
                e = e7;
                bitmap = frameAtTime;
                FileLog.e(e);
                return bitmap;
            }
        }
        return null;
    }

    @Override
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (!isCancelled()) {
            t81 t81Var = this.f28552c;
            ArrayList arrayList = t81Var.F;
            ?? obj2 = new Object();
            obj2.f28775a = bitmap;
            arrayList.add(obj2);
            t81Var.invalidate();
            int i10 = this.f28550a;
            if (i10 < t81Var.K) {
                t81Var.d(i10 + 1);
            }
        }
    }
}
