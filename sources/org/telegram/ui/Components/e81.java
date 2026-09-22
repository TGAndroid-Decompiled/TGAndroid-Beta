package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
public final class e81 extends AsyncTask {
    public int f23886a = 0;
    public final Paint f23887b = new Paint(3);
    public final h81 f23888c;

    public e81(h81 h81Var) {
        this.f23888c = h81Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        h81 h81Var = this.f23888c;
        this.f23886a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                Bitmap frameAtTime = h81Var.f24735y.getFrameAtTime(h81Var.H * this.f23886a * 1000, 2);
                try {
                    if (!isCancelled()) {
                        if (frameAtTime != null) {
                            Bitmap createBitmap = Bitmap.createBitmap(h81Var.I, h81Var.J, frameAtTime.getConfig());
                            Canvas canvas = new Canvas(createBitmap);
                            float max = Math.max(h81Var.I / frameAtTime.getWidth(), h81Var.J / frameAtTime.getHeight());
                            int width = (int) (frameAtTime.getWidth() * max);
                            int height = (int) (frameAtTime.getHeight() * max);
                            Rect rect = new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight());
                            int i10 = h81Var.I;
                            int i11 = h81Var.J;
                            canvas.drawBitmap(frameAtTime, rect, new Rect((i10 - width) / 2, (i11 - height) / 2, (i10 + width) / 2, (i11 + height) / 2), this.f23887b);
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
            h81 h81Var = this.f23888c;
            ArrayList arrayList = h81Var.F;
            ?? obj2 = new Object();
            obj2.f24132a = bitmap;
            arrayList.add(obj2);
            h81Var.invalidate();
            int i10 = this.f23886a;
            if (i10 < h81Var.K) {
                h81Var.d(i10 + 1);
            }
        }
    }
}
