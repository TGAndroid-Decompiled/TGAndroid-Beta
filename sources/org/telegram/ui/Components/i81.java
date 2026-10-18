package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
public final class i81 extends AsyncTask {
    public int f27148a = 0;
    public final Paint f27149b = new Paint(3);
    public final l81 f27150c;

    public i81(l81 l81Var) {
        this.f27150c = l81Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Bitmap frameAtTime;
        l81 l81Var = this.f27150c;
        this.f27148a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                frameAtTime = l81Var.f28184y.getFrameAtTime(l81Var.H * this.f27148a * 1000, 2);
            } catch (Exception e) {
                e = e;
            }
            try {
                if (!isCancelled()) {
                    if (frameAtTime != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(l81Var.I, l81Var.J, frameAtTime.getConfig());
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(l81Var.I / frameAtTime.getWidth(), l81Var.J / frameAtTime.getHeight());
                        int width = (int) (frameAtTime.getWidth() * max);
                        int height = (int) (frameAtTime.getHeight() * max);
                        Rect rect = new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight());
                        int i10 = l81Var.I;
                        int i11 = l81Var.J;
                        canvas.drawBitmap(frameAtTime, rect, new Rect((i10 - width) / 2, (i11 - height) / 2, (i10 + width) / 2, (i11 + height) / 2), this.f27149b);
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
            l81 l81Var = this.f27150c;
            ArrayList arrayList = l81Var.F;
            ?? obj2 = new Object();
            obj2.f27454a = bitmap;
            arrayList.add(obj2);
            l81Var.invalidate();
            int i10 = this.f27148a;
            if (i10 < l81Var.K) {
                l81Var.d(i10 + 1);
            }
        }
    }
}
