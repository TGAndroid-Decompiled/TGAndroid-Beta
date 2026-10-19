package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
public final class j81 extends AsyncTask {
    public int f27450a = 0;
    public final Paint f27451b = new Paint(3);
    public final m81 f27452c;

    public j81(m81 m81Var) {
        this.f27452c = m81Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Bitmap frameAtTime;
        m81 m81Var = this.f27452c;
        this.f27450a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                frameAtTime = m81Var.f28480y.getFrameAtTime(m81Var.H * this.f27450a * 1000, 2);
            } catch (Exception e) {
                e = e;
            }
            try {
                if (!isCancelled()) {
                    if (frameAtTime != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(m81Var.I, m81Var.J, frameAtTime.getConfig());
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(m81Var.I / frameAtTime.getWidth(), m81Var.J / frameAtTime.getHeight());
                        int width = (int) (frameAtTime.getWidth() * max);
                        int height = (int) (frameAtTime.getHeight() * max);
                        Rect rect = new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight());
                        int i10 = m81Var.I;
                        int i11 = m81Var.J;
                        canvas.drawBitmap(frameAtTime, rect, new Rect((i10 - width) / 2, (i11 - height) / 2, (i10 + width) / 2, (i11 + height) / 2), this.f27451b);
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
            m81 m81Var = this.f27452c;
            ArrayList arrayList = m81Var.F;
            ?? obj2 = new Object();
            obj2.f27778a = bitmap;
            arrayList.add(obj2);
            m81Var.invalidate();
            int i10 = this.f27450a;
            if (i10 < m81Var.K) {
                m81Var.d(i10 + 1);
            }
        }
    }
}
