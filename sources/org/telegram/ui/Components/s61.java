package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
public final class s61 extends AsyncTask {
    public int f32383a = 0;
    public final Paint f32384b = new Paint(3);
    public final v61 f32385c;

    public s61(v61 v61Var) {
        this.f32385c = v61Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        v61 v61Var = this.f32385c;
        this.f32383a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                Bitmap frameAtTime = v61Var.f33293y.getFrameAtTime(v61Var.D * this.f32383a * 1000, 2);
                try {
                    if (!isCancelled()) {
                        if (frameAtTime != null) {
                            Bitmap createBitmap = Bitmap.createBitmap(v61Var.E, v61Var.F, frameAtTime.getConfig());
                            Canvas canvas = new Canvas(createBitmap);
                            float max = Math.max(v61Var.E / frameAtTime.getWidth(), v61Var.F / frameAtTime.getHeight());
                            int width = (int) (frameAtTime.getWidth() * max);
                            int height = (int) (frameAtTime.getHeight() * max);
                            Rect rect = new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight());
                            int i9 = v61Var.E;
                            int i10 = v61Var.F;
                            canvas.drawBitmap(frameAtTime, rect, new Rect((i9 - width) / 2, (i10 - height) / 2, (i9 + width) / 2, (i10 + height) / 2), this.f32384b);
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
            } catch (Exception e11) {
                e = e11;
            }
        }
        return null;
    }

    @Override
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (!isCancelled()) {
            v61 v61Var = this.f32385c;
            ArrayList arrayList = v61Var.B;
            ?? obj2 = new Object();
            obj2.f32634a = bitmap;
            arrayList.add(obj2);
            v61Var.invalidate();
            int i9 = this.f32383a;
            if (i9 < v61Var.G) {
                v61Var.d(i9 + 1);
            }
        }
    }
}
