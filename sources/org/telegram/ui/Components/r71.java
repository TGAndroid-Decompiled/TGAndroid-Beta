package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
public final class r71 extends AsyncTask {
    public int f30685a = 0;
    public final Paint f30686b = new Paint(3);
    public final u71 f30687c;

    public r71(u71 u71Var) {
        this.f30687c = u71Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        u71 u71Var = this.f30687c;
        this.f30685a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                Bitmap frameAtTime = u71Var.f31545y.getFrameAtTime(u71Var.E * this.f30685a * 1000, 2);
                try {
                    if (!isCancelled()) {
                        if (frameAtTime != null) {
                            Bitmap createBitmap = Bitmap.createBitmap(u71Var.F, u71Var.G, frameAtTime.getConfig());
                            Canvas canvas = new Canvas(createBitmap);
                            float max = Math.max(u71Var.F / frameAtTime.getWidth(), u71Var.G / frameAtTime.getHeight());
                            int width = (int) (frameAtTime.getWidth() * max);
                            int height = (int) (frameAtTime.getHeight() * max);
                            Rect rect = new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight());
                            int i10 = u71Var.F;
                            int i11 = u71Var.G;
                            canvas.drawBitmap(frameAtTime, rect, new Rect((i10 - width) / 2, (i11 - height) / 2, (i10 + width) / 2, (i11 + height) / 2), this.f30686b);
                            frameAtTime.recycle();
                            return createBitmap;
                        }
                        return frameAtTime;
                    }
                } catch (Exception e6) {
                    e = e6;
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
            u71 u71Var = this.f30687c;
            ArrayList arrayList = u71Var.C;
            ?? obj2 = new Object();
            obj2.f30998a = bitmap;
            arrayList.add(obj2);
            u71Var.invalidate();
            int i10 = this.f30685a;
            if (i10 < u71Var.H) {
                u71Var.d(i10 + 1);
            }
        }
    }
}
