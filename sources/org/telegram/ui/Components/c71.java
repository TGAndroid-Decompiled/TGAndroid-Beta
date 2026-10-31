package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import java.util.ArrayList;
public final class c71 extends AsyncTask {
    public int f25017a = 0;
    public final Paint f25018b = new Paint(3);
    public final f71 f25019c;

    public c71(f71 f71Var) {
        this.f25019c = f71Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Bitmap frameAtTime;
        f71 f71Var = this.f25019c;
        this.f25017a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                frameAtTime = f71Var.D.getFrameAtTime(f71Var.H * this.f25017a * 1000, 2);
            } catch (Exception e) {
                e = e;
            }
            try {
                if (!isCancelled()) {
                    if (frameAtTime != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(f71Var.I, f71Var.J, frameAtTime.getConfig());
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(f71Var.I / frameAtTime.getWidth(), f71Var.J / frameAtTime.getHeight());
                        int width = (int) (frameAtTime.getWidth() * max);
                        int height = (int) (frameAtTime.getHeight() * max);
                        Rect rect = new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight());
                        int i10 = f71Var.I;
                        int i11 = f71Var.J;
                        canvas.drawBitmap(frameAtTime, rect, new Rect((i10 - width) / 2, (i11 - height) / 2, (i10 + width) / 2, (i11 + height) / 2), this.f25018b);
                        frameAtTime.recycle();
                        return createBitmap;
                    }
                    return frameAtTime;
                }
            } catch (Exception e7) {
                e = e7;
                bitmap = frameAtTime;
                org.telegram.messenger.f8.g(e, true);
                return bitmap;
            }
        }
        return null;
    }

    @Override
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (!isCancelled()) {
            f71 f71Var = this.f25019c;
            ArrayList arrayList = f71Var.F;
            ?? obj2 = new Object();
            obj2.f25360a = bitmap;
            arrayList.add(obj2);
            f71Var.invalidate();
            int i10 = this.f25017a;
            if (i10 < f71Var.K) {
                f71Var.d(i10 + 1);
            }
        }
    }
}
