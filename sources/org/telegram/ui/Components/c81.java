package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
public final class c81 extends AsyncTask {
    public int f23271a = 0;
    public final Paint f23272b = new Paint(3);
    public final f81 f23273c;

    public c81(f81 f81Var) {
        this.f23273c = f81Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        f81 f81Var = this.f23273c;
        this.f23271a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                Bitmap frameAtTime = f81Var.f24174y.getFrameAtTime(f81Var.H * this.f23271a * 1000, 2);
                try {
                    if (!isCancelled()) {
                        if (frameAtTime != null) {
                            Bitmap createBitmap = Bitmap.createBitmap(f81Var.I, f81Var.J, frameAtTime.getConfig());
                            Canvas canvas = new Canvas(createBitmap);
                            float max = Math.max(f81Var.I / frameAtTime.getWidth(), f81Var.J / frameAtTime.getHeight());
                            int width = (int) (frameAtTime.getWidth() * max);
                            int height = (int) (frameAtTime.getHeight() * max);
                            Rect rect = new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight());
                            int i10 = f81Var.I;
                            int i11 = f81Var.J;
                            canvas.drawBitmap(frameAtTime, rect, new Rect((i10 - width) / 2, (i11 - height) / 2, (i10 + width) / 2, (i11 + height) / 2), this.f23272b);
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
            f81 f81Var = this.f23273c;
            ArrayList arrayList = f81Var.F;
            ?? obj2 = new Object();
            obj2.f23624a = bitmap;
            arrayList.add(obj2);
            f81Var.invalidate();
            int i10 = this.f23271a;
            if (i10 < f81Var.K) {
                f81Var.d(i10 + 1);
            }
        }
    }
}
