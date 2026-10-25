package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
public final class a91 extends AsyncTask {
    public int f26436a = 0;
    public final Paint f26437b = new Paint(3);
    public final d91 f26438c;

    public a91(d91 d91Var) {
        this.f26438c = d91Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Bitmap frameAtTime;
        d91 d91Var = this.f26438c;
        this.f26436a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                frameAtTime = d91Var.f27454y.getFrameAtTime(d91Var.H * this.f26436a * 1000, 2);
            } catch (Exception e) {
                e = e;
            }
            try {
                if (!isCancelled()) {
                    if (frameAtTime != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(d91Var.I, d91Var.J, frameAtTime.getConfig());
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(d91Var.I / frameAtTime.getWidth(), d91Var.J / frameAtTime.getHeight());
                        int width = (int) (frameAtTime.getWidth() * max);
                        int height = (int) (frameAtTime.getHeight() * max);
                        Rect rect = new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight());
                        int i10 = d91Var.I;
                        int i11 = d91Var.J;
                        canvas.drawBitmap(frameAtTime, rect, new Rect((i10 - width) / 2, (i11 - height) / 2, (i10 + width) / 2, (i11 + height) / 2), this.f26437b);
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
            d91 d91Var = this.f26438c;
            ArrayList arrayList = d91Var.F;
            ?? obj2 = new Object();
            obj2.f26792a = bitmap;
            arrayList.add(obj2);
            d91Var.invalidate();
            int i10 = this.f26436a;
            if (i10 < d91Var.K) {
                d91Var.d(i10 + 1);
            }
        }
    }
}
