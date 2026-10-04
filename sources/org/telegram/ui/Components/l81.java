package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
public final class l81 extends AsyncTask {
    public int f28311a = 0;
    public final Paint f28312b = new Paint(3);
    public final o81 f28313c;

    public l81(o81 o81Var) {
        this.f28313c = o81Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        o81 o81Var = this.f28313c;
        this.f28311a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                Bitmap frameAtTime = o81Var.f29303y.getFrameAtTime(o81Var.H * this.f28311a * 1000, 2);
                try {
                    if (!isCancelled()) {
                        if (frameAtTime != null) {
                            Bitmap createBitmap = Bitmap.createBitmap(o81Var.I, o81Var.J, frameAtTime.getConfig());
                            Canvas canvas = new Canvas(createBitmap);
                            float max = Math.max(o81Var.I / frameAtTime.getWidth(), o81Var.J / frameAtTime.getHeight());
                            int width = (int) (frameAtTime.getWidth() * max);
                            int height = (int) (frameAtTime.getHeight() * max);
                            Rect rect = new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight());
                            int i10 = o81Var.I;
                            int i11 = o81Var.J;
                            canvas.drawBitmap(frameAtTime, rect, new Rect((i10 - width) / 2, (i11 - height) / 2, (i10 + width) / 2, (i11 + height) / 2), this.f28312b);
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
            o81 o81Var = this.f28313c;
            ArrayList arrayList = o81Var.F;
            ?? obj2 = new Object();
            obj2.f28552a = bitmap;
            arrayList.add(obj2);
            o81Var.invalidate();
            int i10 = this.f28311a;
            if (i10 < o81Var.K) {
                o81Var.d(i10 + 1);
            }
        }
    }
}
