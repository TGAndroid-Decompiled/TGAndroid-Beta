package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import org.telegram.messenger.FileLog;

public final class y61 extends AsyncTask {

    public int f34828a = 0;

    public final b71 f34829b;

    public y61(b71 b71Var) {
        this.f34829b = b71Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        b71 b71Var = this.f34829b;
        this.f34828a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                Bitmap frameAtTime = b71Var.f27005r.getFrameAtTime(b71Var.f27008x * ((long) this.f34828a) * 1000, 2);
                try {
                    if (!isCancelled()) {
                        if (frameAtTime == null) {
                            return frameAtTime;
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(b71Var.f27009y, b71Var.A, frameAtTime.getConfig());
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        float fMax = Math.max(b71Var.f27009y / frameAtTime.getWidth(), b71Var.A / frameAtTime.getHeight());
                        int width = (int) (frameAtTime.getWidth() * fMax);
                        int height = (int) (frameAtTime.getHeight() * fMax);
                        canvas.drawBitmap(frameAtTime, new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight()), new Rect((b71Var.f27009y - width) / 2, (b71Var.A - height) / 2, width, height), (Paint) null);
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
        b71 b71Var = this.f34829b;
        b71Var.v.add(bitmap);
        b71Var.invalidate();
        int i10 = this.f34828a;
        if (i10 < b71Var.B) {
            b71Var.b(i10 + 1);
        } else {
            b71Var.K = true;
        }
    }
}
