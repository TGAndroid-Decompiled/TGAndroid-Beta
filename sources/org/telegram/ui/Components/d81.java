package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
public final class d81 extends AsyncTask {
    public int f23592a = 0;
    public final Paint f23593b = new Paint(3);
    public final g81 f23594c;

    public d81(g81 g81Var) {
        this.f23594c = g81Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        g81 g81Var = this.f23594c;
        this.f23592a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                Bitmap frameAtTime = g81Var.f24464y.getFrameAtTime(g81Var.H * this.f23592a * 1000, 2);
                try {
                    if (!isCancelled()) {
                        if (frameAtTime != null) {
                            Bitmap createBitmap = Bitmap.createBitmap(g81Var.I, g81Var.J, frameAtTime.getConfig());
                            Canvas canvas = new Canvas(createBitmap);
                            float max = Math.max(g81Var.I / frameAtTime.getWidth(), g81Var.J / frameAtTime.getHeight());
                            int width = (int) (frameAtTime.getWidth() * max);
                            int height = (int) (frameAtTime.getHeight() * max);
                            Rect rect = new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight());
                            int i10 = g81Var.I;
                            int i11 = g81Var.J;
                            canvas.drawBitmap(frameAtTime, rect, new Rect((i10 - width) / 2, (i11 - height) / 2, (i10 + width) / 2, (i11 + height) / 2), this.f23593b);
                            frameAtTime.recycle();
                            return createBitmap;
                        }
                        return frameAtTime;
                    }
                } catch (Exception e) {
                    e = e;
                    bitmap = frameAtTime;
                    FileLog.e(e);
                    return bitmap;
                }
            } catch (Exception e7) {
                e = e7;
            }
        }
        return null;
    }

    @Override
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (!isCancelled()) {
            g81 g81Var = this.f23594c;
            ArrayList arrayList = g81Var.F;
            ?? obj2 = new Object();
            obj2.f23950a = bitmap;
            arrayList.add(obj2);
            g81Var.invalidate();
            int i10 = this.f23592a;
            if (i10 < g81Var.K) {
                g81Var.d(i10 + 1);
            }
        }
    }
}
