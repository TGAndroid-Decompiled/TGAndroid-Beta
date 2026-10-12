package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
public final class z81 extends AsyncTask {
    public int f33293a = 0;
    public final Paint f33294b = new Paint(3);
    public final c91 f33295c;

    public z81(c91 c91Var) {
        this.f33295c = c91Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Bitmap frameAtTime;
        c91 c91Var = this.f33295c;
        this.f33293a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                frameAtTime = c91Var.f24890y.getFrameAtTime(c91Var.H * this.f33293a * 1000, 2);
            } catch (Exception e7) {
                e = e7;
            }
            try {
                if (!isCancelled()) {
                    if (frameAtTime != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(c91Var.I, c91Var.J, frameAtTime.getConfig());
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(c91Var.I / frameAtTime.getWidth(), c91Var.J / frameAtTime.getHeight());
                        int width = (int) (frameAtTime.getWidth() * max);
                        int height = (int) (frameAtTime.getHeight() * max);
                        Rect rect = new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight());
                        int i10 = c91Var.I;
                        int i11 = c91Var.J;
                        canvas.drawBitmap(frameAtTime, rect, new Rect((i10 - width) / 2, (i11 - height) / 2, (i10 + width) / 2, (i11 + height) / 2), this.f33294b);
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
            c91 c91Var = this.f33295c;
            ArrayList arrayList = c91Var.F;
            ?? obj2 = new Object();
            obj2.f24263a = bitmap;
            arrayList.add(obj2);
            c91Var.invalidate();
            int i10 = this.f33293a;
            if (i10 < c91Var.K) {
                c91Var.d(i10 + 1);
            }
        }
    }
}
