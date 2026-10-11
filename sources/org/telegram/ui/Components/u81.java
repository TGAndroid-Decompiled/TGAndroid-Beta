package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
public final class u81 extends AsyncTask {
    public int f31477a = 0;
    public final Paint f31478b = new Paint(3);
    public final x81 f31479c;

    public u81(x81 x81Var) {
        this.f31479c = x81Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Bitmap frameAtTime;
        x81 x81Var = this.f31479c;
        this.f31477a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                frameAtTime = x81Var.f32905y.getFrameAtTime(x81Var.H * this.f31477a * 1000, 2);
            } catch (Exception e7) {
                e = e7;
            }
            try {
                if (!isCancelled()) {
                    if (frameAtTime != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(x81Var.I, x81Var.J, frameAtTime.getConfig());
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(x81Var.I / frameAtTime.getWidth(), x81Var.J / frameAtTime.getHeight());
                        int width = (int) (frameAtTime.getWidth() * max);
                        int height = (int) (frameAtTime.getHeight() * max);
                        Rect rect = new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight());
                        int i10 = x81Var.I;
                        int i11 = x81Var.J;
                        canvas.drawBitmap(frameAtTime, rect, new Rect((i10 - width) / 2, (i11 - height) / 2, (i10 + width) / 2, (i11 + height) / 2), this.f31478b);
                        frameAtTime.recycle();
                        return createBitmap;
                    }
                    return frameAtTime;
                }
            } catch (Exception e10) {
                e = e10;
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
            x81 x81Var = this.f31479c;
            ArrayList arrayList = x81Var.F;
            ?? obj2 = new Object();
            obj2.f31830a = bitmap;
            arrayList.add(obj2);
            x81Var.invalidate();
            int i10 = this.f31477a;
            if (i10 < x81Var.K) {
                x81Var.d(i10 + 1);
            }
        }
    }
}
