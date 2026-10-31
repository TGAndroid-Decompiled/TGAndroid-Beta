package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
public final class g71 extends AsyncTask {
    public int f26279a = 0;
    public final j71 f26280b;

    public g71(j71 j71Var) {
        this.f26280b = j71Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Bitmap frameAtTime;
        j71 j71Var = this.f26280b;
        this.f26279a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                frameAtTime = j71Var.f27248r.getFrameAtTime(j71Var.f27252y * this.f26279a * 1000, 2);
            } catch (Exception e) {
                e = e;
            }
            try {
                if (!isCancelled()) {
                    if (frameAtTime != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(j71Var.D, j71Var.E, frameAtTime.getConfig());
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(j71Var.D / frameAtTime.getWidth(), j71Var.E / frameAtTime.getHeight());
                        int width = (int) (frameAtTime.getWidth() * max);
                        int height = (int) (frameAtTime.getHeight() * max);
                        canvas.drawBitmap(frameAtTime, new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight()), new Rect((j71Var.D - width) / 2, (j71Var.E - height) / 2, width, height), (Paint) null);
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
            j71 j71Var = this.f26280b;
            j71Var.f27250w.add(bitmap);
            j71Var.invalidate();
            int i10 = this.f26279a;
            if (i10 < j71Var.F) {
                j71Var.b(i10 + 1);
            } else {
                j71Var.O = true;
            }
        }
    }
}
