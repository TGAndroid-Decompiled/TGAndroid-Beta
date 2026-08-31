package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
public final class s71 extends AsyncTask {
    public int f31001a = 0;
    public final Paint f31002b = new Paint(3);
    public final v71 f31003c;

    public s71(v71 v71Var) {
        this.f31003c = v71Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        v71 v71Var = this.f31003c;
        this.f31001a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                Bitmap frameAtTime = v71Var.f31840y.getFrameAtTime(v71Var.E * this.f31001a * 1000, 2);
                try {
                    if (!isCancelled()) {
                        if (frameAtTime != null) {
                            Bitmap createBitmap = Bitmap.createBitmap(v71Var.F, v71Var.G, frameAtTime.getConfig());
                            Canvas canvas = new Canvas(createBitmap);
                            float max = Math.max(v71Var.F / frameAtTime.getWidth(), v71Var.G / frameAtTime.getHeight());
                            int width = (int) (frameAtTime.getWidth() * max);
                            int height = (int) (frameAtTime.getHeight() * max);
                            Rect rect = new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight());
                            int i10 = v71Var.F;
                            int i11 = v71Var.G;
                            canvas.drawBitmap(frameAtTime, rect, new Rect((i10 - width) / 2, (i11 - height) / 2, (i10 + width) / 2, (i11 + height) / 2), this.f31002b);
                            frameAtTime.recycle();
                            return createBitmap;
                        }
                        return frameAtTime;
                    }
                } catch (Exception e6) {
                    e = e6;
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
            v71 v71Var = this.f31003c;
            ArrayList arrayList = v71Var.C;
            ?? obj2 = new Object();
            obj2.f31284a = bitmap;
            arrayList.add(obj2);
            v71Var.invalidate();
            int i10 = this.f31001a;
            if (i10 < v71Var.H) {
                v71Var.d(i10 + 1);
            }
        }
    }
}
