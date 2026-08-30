package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
public final class q71 extends AsyncTask {
    public int f28080a = 0;
    public final Paint f28081b = new Paint(3);
    public final t71 f28082c;

    public q71(t71 t71Var) {
        this.f28082c = t71Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        t71 t71Var = this.f28082c;
        this.f28080a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                Bitmap frameAtTime = t71Var.f28929y.getFrameAtTime(t71Var.E * this.f28080a * 1000, 2);
                try {
                    if (!isCancelled()) {
                        if (frameAtTime != null) {
                            Bitmap createBitmap = Bitmap.createBitmap(t71Var.F, t71Var.G, frameAtTime.getConfig());
                            Canvas canvas = new Canvas(createBitmap);
                            float max = Math.max(t71Var.F / frameAtTime.getWidth(), t71Var.G / frameAtTime.getHeight());
                            int width = (int) (frameAtTime.getWidth() * max);
                            int height = (int) (frameAtTime.getHeight() * max);
                            Rect rect = new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight());
                            int i10 = t71Var.F;
                            int i11 = t71Var.G;
                            canvas.drawBitmap(frameAtTime, rect, new Rect((i10 - width) / 2, (i11 - height) / 2, (i10 + width) / 2, (i11 + height) / 2), this.f28081b);
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
            } catch (Exception e6) {
                e = e6;
            }
        }
        return null;
    }

    @Override
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (!isCancelled()) {
            t71 t71Var = this.f28082c;
            ArrayList arrayList = t71Var.C;
            ?? obj2 = new Object();
            obj2.f28408a = bitmap;
            arrayList.add(obj2);
            t71Var.invalidate();
            int i10 = this.f28080a;
            if (i10 < t71Var.H) {
                t71Var.d(i10 + 1);
            }
        }
    }
}
