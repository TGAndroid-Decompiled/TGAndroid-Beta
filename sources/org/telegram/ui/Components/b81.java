package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
public final class b81 extends AsyncTask {
    public int f21754a = 0;
    public final Paint f21755b = new Paint(3);
    public final e81 f21756c;

    public b81(e81 e81Var) {
        this.f21756c = e81Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        e81 e81Var = this.f21756c;
        this.f21754a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                Bitmap frameAtTime = e81Var.f22630y.getFrameAtTime(e81Var.H * this.f21754a * 1000, 2);
                try {
                    if (!isCancelled()) {
                        if (frameAtTime != null) {
                            Bitmap createBitmap = Bitmap.createBitmap(e81Var.I, e81Var.J, frameAtTime.getConfig());
                            Canvas canvas = new Canvas(createBitmap);
                            float max = Math.max(e81Var.I / frameAtTime.getWidth(), e81Var.J / frameAtTime.getHeight());
                            int width = (int) (frameAtTime.getWidth() * max);
                            int height = (int) (frameAtTime.getHeight() * max);
                            Rect rect = new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight());
                            int i10 = e81Var.I;
                            int i11 = e81Var.J;
                            canvas.drawBitmap(frameAtTime, rect, new Rect((i10 - width) / 2, (i11 - height) / 2, (i10 + width) / 2, (i11 + height) / 2), this.f21755b);
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
            e81 e81Var = this.f21756c;
            ArrayList arrayList = e81Var.F;
            ?? obj2 = new Object();
            obj2.f22042a = bitmap;
            arrayList.add(obj2);
            e81Var.invalidate();
            int i10 = this.f21754a;
            if (i10 < e81Var.K) {
                e81Var.d(i10 + 1);
            }
        }
    }
}
