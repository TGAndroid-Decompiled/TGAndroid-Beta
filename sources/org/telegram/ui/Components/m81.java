package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
public final class m81 extends AsyncTask {
    public int f28629a = 0;
    public final Paint f28630b = new Paint(3);
    public final p81 f28631c;

    public m81(p81 p81Var) {
        this.f28631c = p81Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        p81 p81Var = this.f28631c;
        this.f28629a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                Bitmap frameAtTime = p81Var.f29664y.getFrameAtTime(p81Var.H * this.f28629a * 1000, 2);
                try {
                    if (!isCancelled()) {
                        if (frameAtTime != null) {
                            Bitmap createBitmap = Bitmap.createBitmap(p81Var.I, p81Var.J, frameAtTime.getConfig());
                            Canvas canvas = new Canvas(createBitmap);
                            float max = Math.max(p81Var.I / frameAtTime.getWidth(), p81Var.J / frameAtTime.getHeight());
                            int width = (int) (frameAtTime.getWidth() * max);
                            int height = (int) (frameAtTime.getHeight() * max);
                            Rect rect = new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight());
                            int i10 = p81Var.I;
                            int i11 = p81Var.J;
                            canvas.drawBitmap(frameAtTime, rect, new Rect((i10 - width) / 2, (i11 - height) / 2, (i10 + width) / 2, (i11 + height) / 2), this.f28630b);
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
            } catch (Exception e10) {
                e = e10;
            }
        }
        return null;
    }

    @Override
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (!isCancelled()) {
            p81 p81Var = this.f28631c;
            ArrayList arrayList = p81Var.F;
            ?? obj2 = new Object();
            obj2.f28995a = bitmap;
            arrayList.add(obj2);
            p81Var.invalidate();
            int i10 = this.f28629a;
            if (i10 < p81Var.K) {
                p81Var.d(i10 + 1);
            }
        }
    }
}
