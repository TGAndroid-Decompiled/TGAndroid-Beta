package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
public final class n71 extends AsyncTask {
    public int f26366a = 0;
    public final Paint f26367b = new Paint(3);
    public final q71 f26368c;

    public n71(q71 q71Var) {
        this.f26368c = q71Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        q71 q71Var = this.f26368c;
        this.f26366a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                Bitmap frameAtTime = q71Var.f27266y.getFrameAtTime(q71Var.H * this.f26366a * 1000, 2);
                try {
                    if (!isCancelled()) {
                        if (frameAtTime != null) {
                            Bitmap createBitmap = Bitmap.createBitmap(q71Var.I, q71Var.J, frameAtTime.getConfig());
                            Canvas canvas = new Canvas(createBitmap);
                            float max = Math.max(q71Var.I / frameAtTime.getWidth(), q71Var.J / frameAtTime.getHeight());
                            int width = (int) (frameAtTime.getWidth() * max);
                            int height = (int) (frameAtTime.getHeight() * max);
                            Rect rect = new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight());
                            int i10 = q71Var.I;
                            int i11 = q71Var.J;
                            canvas.drawBitmap(frameAtTime, rect, new Rect((i10 - width) / 2, (i11 - height) / 2, (i10 + width) / 2, (i11 + height) / 2), this.f26367b);
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
            q71 q71Var = this.f26368c;
            ArrayList arrayList = q71Var.F;
            ?? obj2 = new Object();
            obj2.f26676a = bitmap;
            arrayList.add(obj2);
            q71Var.invalidate();
            int i10 = this.f26366a;
            if (i10 < q71Var.K) {
                q71Var.d(i10 + 1);
            }
        }
    }
}
