package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
public final class p71 extends AsyncTask {
    public int f26958a = 0;
    public final Paint f26959b = new Paint(3);
    public final s71 f26960c;

    public p71(s71 s71Var) {
        this.f26960c = s71Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        s71 s71Var = this.f26960c;
        this.f26958a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                Bitmap frameAtTime = s71Var.f27804y.getFrameAtTime(s71Var.H * this.f26958a * 1000, 2);
                try {
                    if (!isCancelled()) {
                        if (frameAtTime != null) {
                            Bitmap createBitmap = Bitmap.createBitmap(s71Var.I, s71Var.J, frameAtTime.getConfig());
                            Canvas canvas = new Canvas(createBitmap);
                            float max = Math.max(s71Var.I / frameAtTime.getWidth(), s71Var.J / frameAtTime.getHeight());
                            int width = (int) (frameAtTime.getWidth() * max);
                            int height = (int) (frameAtTime.getHeight() * max);
                            Rect rect = new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight());
                            int i10 = s71Var.I;
                            int i11 = s71Var.J;
                            canvas.drawBitmap(frameAtTime, rect, new Rect((i10 - width) / 2, (i11 - height) / 2, (i10 + width) / 2, (i11 + height) / 2), this.f26959b);
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
            s71 s71Var = this.f26960c;
            ArrayList arrayList = s71Var.F;
            ?? obj2 = new Object();
            obj2.f27239a = bitmap;
            arrayList.add(obj2);
            s71Var.invalidate();
            int i10 = this.f26958a;
            if (i10 < s71Var.K) {
                s71Var.d(i10 + 1);
            }
        }
    }
}
