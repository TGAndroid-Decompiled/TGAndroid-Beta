package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
public final class o71 extends AsyncTask {
    public int f29022a = 0;
    public final Paint f29023b = new Paint(3);
    public final r71 f29024c;

    public o71(r71 r71Var) {
        this.f29024c = r71Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        r71 r71Var = this.f29024c;
        this.f29022a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                Bitmap frameAtTime = r71Var.f30011y.getFrameAtTime(r71Var.H * this.f29022a * 1000, 2);
                try {
                    if (!isCancelled()) {
                        if (frameAtTime != null) {
                            Bitmap createBitmap = Bitmap.createBitmap(r71Var.I, r71Var.J, frameAtTime.getConfig());
                            Canvas canvas = new Canvas(createBitmap);
                            float max = Math.max(r71Var.I / frameAtTime.getWidth(), r71Var.J / frameAtTime.getHeight());
                            int width = (int) (frameAtTime.getWidth() * max);
                            int height = (int) (frameAtTime.getHeight() * max);
                            Rect rect = new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight());
                            int i10 = r71Var.I;
                            int i11 = r71Var.J;
                            canvas.drawBitmap(frameAtTime, rect, new Rect((i10 - width) / 2, (i11 - height) / 2, (i10 + width) / 2, (i11 + height) / 2), this.f29023b);
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
            } catch (Exception e10) {
                e = e10;
            }
        }
        return null;
    }

    @Override
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (!isCancelled()) {
            r71 r71Var = this.f29024c;
            ArrayList arrayList = r71Var.F;
            ?? obj2 = new Object();
            obj2.f29341a = bitmap;
            arrayList.add(obj2);
            r71Var.invalidate();
            int i10 = this.f29022a;
            if (i10 < r71Var.K) {
                r71Var.d(i10 + 1);
            }
        }
    }
}
