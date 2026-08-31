package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import org.telegram.messenger.FileLog;
public final class w71 extends AsyncTask {
    public int f32667a = 0;
    public final z71 f32668b;

    public w71(z71 z71Var) {
        this.f32668b = z71Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Bitmap frameAtTime;
        z71 z71Var = this.f32668b;
        this.f32667a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                frameAtTime = z71Var.f33785r.getFrameAtTime(z71Var.f33788x * this.f32667a * 1000, 2);
            } catch (Exception e6) {
                e = e6;
            }
            try {
                if (!isCancelled()) {
                    if (frameAtTime != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(z71Var.f33789y, z71Var.B, frameAtTime.getConfig());
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(z71Var.f33789y / frameAtTime.getWidth(), z71Var.B / frameAtTime.getHeight());
                        int width = (int) (frameAtTime.getWidth() * max);
                        int height = (int) (frameAtTime.getHeight() * max);
                        canvas.drawBitmap(frameAtTime, new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight()), new Rect((z71Var.f33789y - width) / 2, (z71Var.B - height) / 2, width, height), (Paint) null);
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
            z71 z71Var = this.f32668b;
            z71Var.v.add(bitmap);
            z71Var.invalidate();
            int i10 = this.f32667a;
            if (i10 < z71Var.C) {
                z71Var.b(i10 + 1);
            } else {
                z71Var.L = true;
            }
        }
    }
}
