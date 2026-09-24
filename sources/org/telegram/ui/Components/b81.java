package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
public final class b81 extends AsyncTask {
    public int f22917a = 0;
    public final Paint f22918b = new Paint(3);
    public final e81 f22919c;

    public b81(e81 e81Var) {
        this.f22919c = e81Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        e81 e81Var = this.f22919c;
        this.f22917a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                Bitmap frameAtTime = e81Var.f23848y.getFrameAtTime(e81Var.H * this.f22917a * 1000, 2);
                try {
                    if (!isCancelled()) {
                        if (frameAtTime != null) {
                            Bitmap createBitmap = Bitmap.createBitmap(e81Var.I, e81Var.J, frameAtTime.getConfig());
                            Canvas canvas = new Canvas(createBitmap);
                            float max = Math.max(e81Var.I / frameAtTime.getWidth(), e81Var.J / frameAtTime.getHeight());
                            int width = (int) (frameAtTime.getWidth() * max);
                            int height = (int) (frameAtTime.getHeight() * max);
                            Rect rect = new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight());
                            int i10 = e81Var.I;
                            int i11 = e81Var.J;
                            canvas.drawBitmap(frameAtTime, rect, new Rect((i10 - width) / 2, (i11 - height) / 2, (i10 + width) / 2, (i11 + height) / 2), this.f22918b);
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
            e81 e81Var = this.f22919c;
            ArrayList arrayList = e81Var.F;
            ?? obj2 = new Object();
            obj2.f23251a = bitmap;
            arrayList.add(obj2);
            e81Var.invalidate();
            int i10 = this.f22917a;
            if (i10 < e81Var.K) {
                e81Var.d(i10 + 1);
            }
        }
    }
}
