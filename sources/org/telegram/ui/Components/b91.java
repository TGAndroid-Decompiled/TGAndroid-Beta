package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
public final class b91 extends AsyncTask {
    public int f26765a = 0;
    public final Paint f26766b = new Paint(3);
    public final e91 f26767c;

    public b91(e91 e91Var) {
        this.f26767c = e91Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Bitmap frameAtTime;
        e91 e91Var = this.f26767c;
        this.f26765a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                frameAtTime = e91Var.f27770y.getFrameAtTime(e91Var.H * this.f26765a * 1000, 2);
            } catch (Exception e) {
                e = e;
            }
            try {
                if (!isCancelled()) {
                    if (frameAtTime != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(e91Var.I, e91Var.J, frameAtTime.getConfig());
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(e91Var.I / frameAtTime.getWidth(), e91Var.J / frameAtTime.getHeight());
                        int width = (int) (frameAtTime.getWidth() * max);
                        int height = (int) (frameAtTime.getHeight() * max);
                        Rect rect = new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight());
                        int i10 = e91Var.I;
                        int i11 = e91Var.J;
                        canvas.drawBitmap(frameAtTime, rect, new Rect((i10 - width) / 2, (i11 - height) / 2, (i10 + width) / 2, (i11 + height) / 2), this.f26766b);
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
            e91 e91Var = this.f26767c;
            ArrayList arrayList = e91Var.F;
            ?? obj2 = new Object();
            obj2.f27108a = bitmap;
            arrayList.add(obj2);
            e91Var.invalidate();
            int i10 = this.f26765a;
            if (i10 < e91Var.K) {
                e91Var.d(i10 + 1);
            }
        }
    }
}
