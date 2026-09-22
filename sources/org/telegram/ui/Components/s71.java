package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import org.telegram.messenger.FileLog;
public final class s71 extends AsyncTask {
    public int f27792a = 0;
    public final v71 f27793b;

    public s71(v71 v71Var) {
        this.f27793b = v71Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Bitmap frameAtTime;
        v71 v71Var = this.f27793b;
        this.f27792a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                frameAtTime = v71Var.f28646r.getFrameAtTime(v71Var.f28649x * this.f27792a * 1000, 2);
            } catch (Exception e) {
                e = e;
            }
            try {
                if (!isCancelled()) {
                    if (frameAtTime != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(v71Var.f28650y, v71Var.E, frameAtTime.getConfig());
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(v71Var.f28650y / frameAtTime.getWidth(), v71Var.E / frameAtTime.getHeight());
                        int width = (int) (frameAtTime.getWidth() * max);
                        int height = (int) (frameAtTime.getHeight() * max);
                        canvas.drawBitmap(frameAtTime, new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight()), new Rect((v71Var.f28650y - width) / 2, (v71Var.E - height) / 2, width, height), (Paint) null);
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
            v71 v71Var = this.f27793b;
            v71Var.v.add(bitmap);
            v71Var.invalidate();
            int i10 = this.f27792a;
            if (i10 < v71Var.F) {
                v71Var.b(i10 + 1);
            } else {
                v71Var.O = true;
            }
        }
    }
}
