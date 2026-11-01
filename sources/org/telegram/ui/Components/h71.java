package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
public final class h71 extends AsyncTask {
    public int f26703a = 0;
    public final k71 f26704b;

    public h71(k71 k71Var) {
        this.f26704b = k71Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Bitmap frameAtTime;
        k71 k71Var = this.f26704b;
        this.f26703a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                frameAtTime = k71Var.f27763r.getFrameAtTime(k71Var.f27767y * this.f26703a * 1000, 2);
            } catch (Exception e) {
                e = e;
            }
            try {
                if (!isCancelled()) {
                    if (frameAtTime != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(k71Var.D, k71Var.E, frameAtTime.getConfig());
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(k71Var.D / frameAtTime.getWidth(), k71Var.E / frameAtTime.getHeight());
                        int width = (int) (frameAtTime.getWidth() * max);
                        int height = (int) (frameAtTime.getHeight() * max);
                        canvas.drawBitmap(frameAtTime, new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight()), new Rect((k71Var.D - width) / 2, (k71Var.E - height) / 2, width, height), (Paint) null);
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
            k71 k71Var = this.f26704b;
            k71Var.f27765w.add(bitmap);
            k71Var.invalidate();
            int i10 = this.f26703a;
            if (i10 < k71Var.F) {
                k71Var.b(i10 + 1);
            } else {
                k71Var.O = true;
            }
        }
    }
}
