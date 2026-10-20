package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
public final class k81 extends AsyncTask {
    public int f27812a = 0;
    public final Paint f27813b = new Paint(3);
    public final n81 f27814c;

    public k81(n81 n81Var) {
        this.f27814c = n81Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Bitmap frameAtTime;
        n81 n81Var = this.f27814c;
        this.f27812a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                frameAtTime = n81Var.f28723y.getFrameAtTime(n81Var.H * this.f27812a * 1000, 2);
            } catch (Exception e) {
                e = e;
            }
            try {
                if (!isCancelled()) {
                    if (frameAtTime != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(n81Var.I, n81Var.J, frameAtTime.getConfig());
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(n81Var.I / frameAtTime.getWidth(), n81Var.J / frameAtTime.getHeight());
                        int width = (int) (frameAtTime.getWidth() * max);
                        int height = (int) (frameAtTime.getHeight() * max);
                        Rect rect = new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight());
                        int i10 = n81Var.I;
                        int i11 = n81Var.J;
                        canvas.drawBitmap(frameAtTime, rect, new Rect((i10 - width) / 2, (i11 - height) / 2, (i10 + width) / 2, (i11 + height) / 2), this.f27813b);
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
            n81 n81Var = this.f27814c;
            ArrayList arrayList = n81Var.F;
            ?? obj2 = new Object();
            obj2.f28114a = bitmap;
            arrayList.add(obj2);
            n81Var.invalidate();
            int i10 = this.f27812a;
            if (i10 < n81Var.K) {
                n81Var.d(i10 + 1);
            }
        }
    }
}
