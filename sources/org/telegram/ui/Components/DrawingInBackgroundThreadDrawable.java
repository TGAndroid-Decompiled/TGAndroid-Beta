package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.android.billingclient.api.zzbv;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.Theme;

public abstract class DrawingInBackgroundThreadDrawable implements NotificationCenter.NotificationCenterDelegate {
    public static zzbv queuePool;
    public boolean attachedToWindow;
    public Bitmap backgroundBitmap;
    public Canvas backgroundCanvas;
    public final DispatchQueue backgroundQueue;
    public Bitmap bitmap;
    public Canvas bitmapCanvas;
    public final AnonymousClass1 bitmapCreateTask;
    public boolean bitmapUpdating;
    public int currentOpenedLayerFlags;
    public boolean error;
    public int frameGuid;
    public int height;
    public int lastFrameId;
    public boolean needSwapBitmaps;
    public boolean paused;
    public boolean reset;
    public final int threadIndex;
    public final AnonymousClass1 uiFrameRunnable;
    public int width;
    public int currentLayerNum = 1;
    public final Paint paint = new Paint(1);

    public DrawingInBackgroundThreadDrawable() {
        final int i = 0;
        this.bitmapCreateTask = new Runnable(this) {
            public final DrawingInBackgroundThreadDrawable this$0;

            {
                this.this$0 = this;
            }

            @Override
            public final void run() {
                switch (i) {
                    case 0:
                        DrawingInBackgroundThreadDrawable drawingInBackgroundThreadDrawable = this.this$0;
                        try {
                            int i2 = drawingInBackgroundThreadDrawable.height;
                            Bitmap bitmap = drawingInBackgroundThreadDrawable.backgroundBitmap;
                            if (bitmap == null || bitmap.getWidth() != drawingInBackgroundThreadDrawable.width || drawingInBackgroundThreadDrawable.backgroundBitmap.getHeight() != i2) {
                                Bitmap bitmap2 = drawingInBackgroundThreadDrawable.backgroundBitmap;
                                if (bitmap2 != null) {
                                    bitmap2.recycle();
                                }
                                drawingInBackgroundThreadDrawable.backgroundBitmap = Bitmap.createBitmap(drawingInBackgroundThreadDrawable.width, i2, Bitmap.Config.ARGB_8888);
                                drawingInBackgroundThreadDrawable.backgroundCanvas = new Canvas(drawingInBackgroundThreadDrawable.backgroundBitmap);
                            }
                            drawingInBackgroundThreadDrawable.backgroundBitmap.eraseColor(0);
                            drawingInBackgroundThreadDrawable.backgroundCanvas.save();
                            drawingInBackgroundThreadDrawable.backgroundCanvas.translate(0.0f, 0);
                            drawingInBackgroundThreadDrawable.drawInBackground(drawingInBackgroundThreadDrawable.backgroundCanvas);
                            drawingInBackgroundThreadDrawable.backgroundCanvas.restore();
                            drawingInBackgroundThreadDrawable.backgroundBitmap.prepareToDraw();
                        } catch (Exception e) {
                            FileLog.e(e);
                            drawingInBackgroundThreadDrawable.error = true;
                        }
                        AndroidUtilities.runOnUIThread(drawingInBackgroundThreadDrawable.uiFrameRunnable);
                        break;
                    default:
                        DrawingInBackgroundThreadDrawable drawingInBackgroundThreadDrawable2 = this.this$0;
                        drawingInBackgroundThreadDrawable2.bitmapUpdating = false;
                        drawingInBackgroundThreadDrawable2.onFrameReady();
                        if (!drawingInBackgroundThreadDrawable2.attachedToWindow) {
                            ArrayList arrayList = new ArrayList();
                            Bitmap bitmap3 = drawingInBackgroundThreadDrawable2.bitmap;
                            if (bitmap3 != null) {
                                arrayList.add(bitmap3);
                            }
                            Bitmap bitmap4 = drawingInBackgroundThreadDrawable2.backgroundBitmap;
                            if (bitmap4 != null) {
                                arrayList.add(bitmap4);
                            }
                            drawingInBackgroundThreadDrawable2.bitmap = null;
                            drawingInBackgroundThreadDrawable2.backgroundBitmap = null;
                            drawingInBackgroundThreadDrawable2.backgroundCanvas = null;
                            drawingInBackgroundThreadDrawable2.bitmapCanvas = null;
                            AndroidUtilities.recycleBitmaps(arrayList);
                            break;
                        } else if (drawingInBackgroundThreadDrawable2.frameGuid == drawingInBackgroundThreadDrawable2.lastFrameId) {
                            drawingInBackgroundThreadDrawable2.needSwapBitmaps = true;
                            break;
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.uiFrameRunnable = new Runnable(this) {
            public final DrawingInBackgroundThreadDrawable this$0;

            {
                this.this$0 = this;
            }

            @Override
            public final void run() {
                switch (i2) {
                    case 0:
                        DrawingInBackgroundThreadDrawable drawingInBackgroundThreadDrawable = this.this$0;
                        try {
                            int i3 = drawingInBackgroundThreadDrawable.height;
                            Bitmap bitmap = drawingInBackgroundThreadDrawable.backgroundBitmap;
                            if (bitmap == null || bitmap.getWidth() != drawingInBackgroundThreadDrawable.width || drawingInBackgroundThreadDrawable.backgroundBitmap.getHeight() != i3) {
                                Bitmap bitmap2 = drawingInBackgroundThreadDrawable.backgroundBitmap;
                                if (bitmap2 != null) {
                                    bitmap2.recycle();
                                }
                                drawingInBackgroundThreadDrawable.backgroundBitmap = Bitmap.createBitmap(drawingInBackgroundThreadDrawable.width, i3, Bitmap.Config.ARGB_8888);
                                drawingInBackgroundThreadDrawable.backgroundCanvas = new Canvas(drawingInBackgroundThreadDrawable.backgroundBitmap);
                            }
                            drawingInBackgroundThreadDrawable.backgroundBitmap.eraseColor(0);
                            drawingInBackgroundThreadDrawable.backgroundCanvas.save();
                            drawingInBackgroundThreadDrawable.backgroundCanvas.translate(0.0f, 0);
                            drawingInBackgroundThreadDrawable.drawInBackground(drawingInBackgroundThreadDrawable.backgroundCanvas);
                            drawingInBackgroundThreadDrawable.backgroundCanvas.restore();
                            drawingInBackgroundThreadDrawable.backgroundBitmap.prepareToDraw();
                        } catch (Exception e) {
                            FileLog.e(e);
                            drawingInBackgroundThreadDrawable.error = true;
                        }
                        AndroidUtilities.runOnUIThread(drawingInBackgroundThreadDrawable.uiFrameRunnable);
                        break;
                    default:
                        DrawingInBackgroundThreadDrawable drawingInBackgroundThreadDrawable2 = this.this$0;
                        drawingInBackgroundThreadDrawable2.bitmapUpdating = false;
                        drawingInBackgroundThreadDrawable2.onFrameReady();
                        if (!drawingInBackgroundThreadDrawable2.attachedToWindow) {
                            ArrayList arrayList = new ArrayList();
                            Bitmap bitmap3 = drawingInBackgroundThreadDrawable2.bitmap;
                            if (bitmap3 != null) {
                                arrayList.add(bitmap3);
                            }
                            Bitmap bitmap4 = drawingInBackgroundThreadDrawable2.backgroundBitmap;
                            if (bitmap4 != null) {
                                arrayList.add(bitmap4);
                            }
                            drawingInBackgroundThreadDrawable2.bitmap = null;
                            drawingInBackgroundThreadDrawable2.backgroundBitmap = null;
                            drawingInBackgroundThreadDrawable2.backgroundCanvas = null;
                            drawingInBackgroundThreadDrawable2.bitmapCanvas = null;
                            AndroidUtilities.recycleBitmaps(arrayList);
                            break;
                        } else if (drawingInBackgroundThreadDrawable2.frameGuid == drawingInBackgroundThreadDrawable2.lastFrameId) {
                            drawingInBackgroundThreadDrawable2.needSwapBitmaps = true;
                            break;
                        }
                        break;
                }
            }
        };
        if (queuePool == null) {
            queuePool = new zzbv(12, (byte) 0);
        }
        zzbv zzbvVar = queuePool;
        int i3 = zzbvVar.zzb + 1;
        zzbvVar.zzb = i3;
        if (i3 > 1) {
            zzbvVar.zzb = 0;
        }
        int i4 = zzbvVar.zzb;
        DispatchQueue[] dispatchQueueArr = (DispatchQueue[]) zzbvVar.zza;
        DispatchQueue dispatchQueue = dispatchQueueArr[i4];
        if (dispatchQueue == null) {
            dispatchQueue = new DispatchQueue("draw_background_queue_" + zzbvVar.zzb);
            dispatchQueueArr[i4] = dispatchQueue;
        }
        this.backgroundQueue = dispatchQueue;
        this.threadIndex = queuePool.zzb;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3;
        if (i == NotificationCenter.stopAllHeavyOperations) {
            Integer num = (Integer) objArr[0];
            if (this.currentLayerNum < num.intValue()) {
                if (num.intValue() != 512 || SharedConfig.getDevicePerformanceClass() < 2) {
                    int iIntValue = num.intValue() | this.currentOpenedLayerFlags;
                    this.currentOpenedLayerFlags = iIntValue;
                    if (iIntValue == 0 || this.paused) {
                        return;
                    }
                    this.paused = true;
                    return;
                }
                return;
            }
            return;
        }
        if (i == NotificationCenter.startAllHeavyOperations) {
            Integer num2 = (Integer) objArr[0];
            if (this.currentLayerNum >= num2.intValue() || (i3 = this.currentOpenedLayerFlags) == 0) {
                return;
            }
            int i4 = (~num2.intValue()) & i3;
            this.currentOpenedLayerFlags = i4;
            if (i4 == 0 && this.paused) {
                this.paused = false;
            }
        }
    }

    public void draw(Canvas canvas, long j, int i, int i2, float f) {
        if (this.error) {
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                canvas.drawRect(0.0f, 0.0f, i, i2, Theme.DEBUG_RED);
                return;
            }
            return;
        }
        this.height = i2;
        this.width = i;
        if (this.needSwapBitmaps) {
            this.needSwapBitmaps = false;
            Bitmap bitmap = this.bitmap;
            Canvas canvas2 = this.bitmapCanvas;
            this.bitmap = this.backgroundBitmap;
            this.bitmapCanvas = this.backgroundCanvas;
            this.backgroundBitmap = bitmap;
            this.backgroundCanvas = canvas2;
        }
        Bitmap bitmap2 = this.bitmap;
        if (bitmap2 == null || this.reset) {
            this.reset = false;
            if (bitmap2 != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.bitmap);
                AndroidUtilities.recycleBitmaps(arrayList);
                this.bitmap = null;
            }
            int i3 = this.height;
            Bitmap bitmap3 = this.bitmap;
            if (bitmap3 != null && bitmap3.getHeight() == i3 && this.bitmap.getWidth() == this.width) {
                this.bitmap.eraseColor(0);
            } else {
                this.bitmap = Bitmap.createBitmap(this.width, i3, Bitmap.Config.ARGB_8888);
                this.bitmapCanvas = new Canvas(this.bitmap);
            }
            this.bitmapCanvas.save();
            this.bitmapCanvas.translate(0.0f, 0);
            drawInUiThread(this.bitmapCanvas, f);
            this.bitmapCanvas.restore();
        }
        if (!this.bitmapUpdating && !this.paused) {
            this.bitmapUpdating = true;
            prepareDraw(j);
            this.lastFrameId = this.frameGuid;
            this.backgroundQueue.postRunnable(this.bitmapCreateTask);
        }
        Bitmap bitmap4 = this.bitmap;
        if (bitmap4 != null) {
            Paint paint = this.paint;
            paint.setAlpha((int) (f * 255.0f));
            canvas.save();
            canvas.translate(0.0f, 0);
            drawBitmap(canvas, bitmap4, paint);
            canvas.restore();
        }
    }

    public void drawBitmap(Canvas canvas, Bitmap bitmap, Paint paint) {
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
    }

    public abstract void drawInBackground(Canvas canvas);

    public abstract void drawInUiThread(Canvas canvas, float f);

    public final void onAttachToWindow() {
        if (this.attachedToWindow) {
            return;
        }
        this.attachedToWindow = true;
        this.error = false;
        int currentHeavyOperationFlags = NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & (~this.currentLayerNum);
        this.currentOpenedLayerFlags = currentHeavyOperationFlags;
        if (currentHeavyOperationFlags == 0 && this.paused) {
            this.paused = false;
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.stopAllHeavyOperations);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.startAllHeavyOperations);
    }

    public final void onDetachFromWindow() {
        if (this.attachedToWindow) {
            if (!this.bitmapUpdating) {
                ArrayList arrayList = new ArrayList();
                Bitmap bitmap = this.bitmap;
                if (bitmap != null) {
                    arrayList.add(bitmap);
                }
                Bitmap bitmap2 = this.backgroundBitmap;
                if (bitmap2 != null) {
                    arrayList.add(bitmap2);
                }
                this.bitmap = null;
                this.backgroundBitmap = null;
                this.backgroundCanvas = null;
                this.bitmapCanvas = null;
                AndroidUtilities.recycleBitmaps(arrayList);
            }
            this.attachedToWindow = false;
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.stopAllHeavyOperations);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.startAllHeavyOperations);
        }
    }

    public abstract void onFrameReady();

    public abstract void prepareDraw(long j);

    public final void reset() {
        this.reset = true;
        this.frameGuid++;
        if (this.bitmap != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.bitmap);
            this.bitmap = null;
            AndroidUtilities.recycleBitmaps(arrayList);
        }
    }
}
