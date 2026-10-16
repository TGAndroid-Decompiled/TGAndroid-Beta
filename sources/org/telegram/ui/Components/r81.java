package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
public final class r81 extends AsyncTask {
    public int f28467a = 0;
    public final Paint f28468b = new Paint(3);
    public final u81 f28469c;

    public r81(u81 u81Var) {
        this.f28469c = u81Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Bitmap frameAtTime;
        u81 u81Var = this.f28469c;
        this.f28467a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                frameAtTime = u81Var.f29292y.getFrameAtTime(u81Var.H * this.f28467a * 1000, 2);
            } catch (Exception e) {
                e = e;
            }
            try {
                if (!isCancelled()) {
                    if (frameAtTime != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(u81Var.I, u81Var.J, frameAtTime.getConfig());
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(u81Var.I / frameAtTime.getWidth(), u81Var.J / frameAtTime.getHeight());
                        int width = (int) (frameAtTime.getWidth() * max);
                        int height = (int) (frameAtTime.getHeight() * max);
                        Rect rect = new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight());
                        int i10 = u81Var.I;
                        int i11 = u81Var.J;
                        canvas.drawBitmap(frameAtTime, rect, new Rect((i10 - width) / 2, (i11 - height) / 2, (i10 + width) / 2, (i11 + height) / 2), this.f28468b);
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
            u81 u81Var = this.f28469c;
            ArrayList arrayList = u81Var.F;
            ?? obj2 = new Object();
            obj2.f28765a = bitmap;
            arrayList.add(obj2);
            u81Var.invalidate();
            int i10 = this.f28467a;
            if (i10 < u81Var.K) {
                u81Var.d(i10 + 1);
            }
        }
    }
}
