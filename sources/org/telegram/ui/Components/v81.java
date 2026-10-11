package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
public final class v81 extends AsyncTask {
    public int f31705a = 0;
    public final Paint f31706b = new Paint(3);
    public final y81 f31707c;

    public v81(y81 y81Var) {
        this.f31707c = y81Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Bitmap frameAtTime;
        y81 y81Var = this.f31707c;
        this.f31705a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                frameAtTime = y81Var.f33129y.getFrameAtTime(y81Var.H * this.f31705a * 1000, 2);
            } catch (Exception e7) {
                e = e7;
            }
            try {
                if (!isCancelled()) {
                    if (frameAtTime != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(y81Var.I, y81Var.J, frameAtTime.getConfig());
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(y81Var.I / frameAtTime.getWidth(), y81Var.J / frameAtTime.getHeight());
                        int width = (int) (frameAtTime.getWidth() * max);
                        int height = (int) (frameAtTime.getHeight() * max);
                        Rect rect = new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight());
                        int i10 = y81Var.I;
                        int i11 = y81Var.J;
                        canvas.drawBitmap(frameAtTime, rect, new Rect((i10 - width) / 2, (i11 - height) / 2, (i10 + width) / 2, (i11 + height) / 2), this.f31706b);
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
            y81 y81Var = this.f31707c;
            ArrayList arrayList = y81Var.F;
            ?? obj2 = new Object();
            obj2.f32593a = bitmap;
            arrayList.add(obj2);
            y81Var.invalidate();
            int i10 = this.f31705a;
            if (i10 < y81Var.K) {
                y81Var.d(i10 + 1);
            }
        }
    }
}
