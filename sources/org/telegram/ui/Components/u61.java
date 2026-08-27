package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;

public final class u61 extends AsyncTask {

    public int f32993a = 0;

    public final Paint f32994b = new Paint(3);

    public final x61 f32995c;

    public u61(x61 x61Var) {
        this.f32995c = x61Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        x61 x61Var = this.f32995c;
        this.f32993a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                Bitmap frameAtTime = x61Var.f34525y.getFrameAtTime(x61Var.D * ((long) this.f32993a) * 1000, 2);
                try {
                    if (!isCancelled()) {
                        if (frameAtTime == null) {
                            return frameAtTime;
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(x61Var.E, x61Var.F, frameAtTime.getConfig());
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        float fMax = Math.max(x61Var.E / frameAtTime.getWidth(), x61Var.F / frameAtTime.getHeight());
                        int width = (int) (frameAtTime.getWidth() * fMax);
                        int height = (int) (frameAtTime.getHeight() * fMax);
                        Rect rect = new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight());
                        int i10 = x61Var.E;
                        int i11 = x61Var.F;
                        canvas.drawBitmap(frameAtTime, rect, new Rect((i10 - width) / 2, (i11 - height) / 2, (i10 + width) / 2, (i11 + height) / 2), this.f32994b);
                        frameAtTime.recycle();
                        return bitmapCreateBitmap;
                    }
                } catch (Exception e9) {
                    e = e9;
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
        if (isCancelled()) {
            return;
        }
        x61 x61Var = this.f32995c;
        ArrayList arrayList = x61Var.B;
        v61 v61Var = new v61();
        v61Var.f33280a = bitmap;
        arrayList.add(v61Var);
        x61Var.invalidate();
        int i10 = this.f32993a;
        if (i10 < x61Var.G) {
            x61Var.d(i10 + 1);
        }
    }
}
