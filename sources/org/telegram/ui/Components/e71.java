package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
public final class e71 extends AsyncTask {
    public int f27941a = 0;
    public final Paint f27942b = new Paint(3);
    public final h71 f27943c;

    public e71(h71 h71Var) {
        this.f27943c = h71Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        h71 h71Var = this.f27943c;
        this.f27941a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                Bitmap frameAtTime = h71Var.f29108y.getFrameAtTime(h71Var.D * this.f27941a * 1000, 2);
                try {
                    if (!isCancelled()) {
                        if (frameAtTime != null) {
                            Bitmap createBitmap = Bitmap.createBitmap(h71Var.E, h71Var.F, frameAtTime.getConfig());
                            Canvas canvas = new Canvas(createBitmap);
                            float max = Math.max(h71Var.E / frameAtTime.getWidth(), h71Var.F / frameAtTime.getHeight());
                            int width = (int) (frameAtTime.getWidth() * max);
                            int height = (int) (frameAtTime.getHeight() * max);
                            Rect rect = new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight());
                            int i10 = h71Var.E;
                            int i11 = h71Var.F;
                            canvas.drawBitmap(frameAtTime, rect, new Rect((i10 - width) / 2, (i11 - height) / 2, (i10 + width) / 2, (i11 + height) / 2), this.f27942b);
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
            h71 h71Var = this.f27943c;
            ArrayList arrayList = h71Var.B;
            ?? obj2 = new Object();
            obj2.f28343a = bitmap;
            arrayList.add(obj2);
            h71Var.invalidate();
            int i10 = this.f27941a;
            if (i10 < h71Var.G) {
                h71Var.d(i10 + 1);
            }
        }
    }
}
