package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import java.io.File;
import java.io.FileOutputStream;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;
public final class uo0 implements Runnable {
    public final int f31229a;
    public final Object f31230b;
    public final Object f31231c;
    public final Object d;
    public final Object f31232e;

    public uo0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f31229a = i10;
        this.f31230b = obj;
        this.f31231c = obj2;
        this.d = obj3;
        this.f31232e = obj4;
    }

    private final void a() {
        PhotoViewer photoViewer = (PhotoViewer) this.f31230b;
        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.d;
        String str = (String) this.f31232e;
        Drawable[] drawableArr = PhotoViewer.U8;
        Bitmap decodeFile = BitmapFactory.decodeFile(((MediaController.PhotoEntry) this.f31231c).path);
        if (decodeFile == null) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.kr0(photoViewer, 10));
            return;
        }
        int[] iArr = new int[11];
        AnimatedFileNative.d(photoEntry.path, iArr, 0L);
        int max = Math.max(iArr[1], photoEntry.width);
        int max2 = Math.max(iArr[2], photoEntry.height);
        if ((iArr[8] / 90) % 2 == 1) {
            max2 = max;
            max = max2;
        }
        float f7 = max;
        float f10 = max2;
        float max3 = Math.max(decodeFile.getWidth() / f7, decodeFile.getHeight() / f10);
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap createBitmap = Bitmap.createBitmap((int) (f7 * max3), (int) (f10 * max3), config);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        canvas.translate(createBitmap.getWidth() / 2, createBitmap.getHeight() / 2);
        float max4 = Math.max(createBitmap.getWidth() / decodeFile.getWidth(), createBitmap.getHeight() / decodeFile.getHeight());
        canvas.scale(max4, max4);
        canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2, (-decodeFile.getHeight()) / 2, paint);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
            createBitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
            fileOutputStream.close();
            Bitmap createBitmap2 = Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), config);
            Canvas canvas2 = new Canvas(createBitmap2);
            canvas2.translate(createBitmap2.getWidth() / 2.0f, createBitmap2.getHeight() / 2.0f);
            float max5 = Math.max(createBitmap2.getWidth() / createBitmap.getWidth(), createBitmap2.getHeight() / createBitmap.getHeight());
            canvas2.scale(max5, max5);
            canvas2.drawBitmap(createBitmap, (-createBitmap.getWidth()) / 2.0f, (-createBitmap.getHeight()) / 2.0f, paint);
            AndroidUtilities.runOnUIThread(new uo0(photoViewer, photoEntry, str, createBitmap2, 29));
        } catch (Exception e7) {
            FileLog.e(e7);
            AndroidUtilities.runOnUIThread(new org.telegram.ui.kr0(photoViewer, 11));
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.uo0.run():void");
    }

    public uo0(h41 h41Var, s80 s80Var, MessagesController messagesController, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f31229a = 5;
        this.f31230b = h41Var;
        this.f31232e = s80Var;
        this.f31231c = messagesController;
        this.d = tL_forumTopic;
    }
}
