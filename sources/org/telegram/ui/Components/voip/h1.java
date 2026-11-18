package org.telegram.ui.Components.voip;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import java.nio.ByteBuffer;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.fc;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.b9;
import org.webrtc.JavaI420Buffer;
import org.webrtc.VideoFrame;
public final class h1 {
    public final ImageReceiver f40900a;
    public VideoFrame f40901b;

    public h1() {
        TLRPC.Chat chat;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.f40900a = imageReceiver;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            chat = sharedInstance.getChat();
        } else {
            chat = null;
        }
        b9 b9Var = new b9((i6) null);
        if (chat != null) {
            sharedInstance.getAccount();
            b9Var.q(chat);
            imageReceiver.d = sharedInstance.getAccount();
        }
        imageReceiver.J0(60);
        imageReceiver.f22642h1 = new org.telegram.ui.ActionBar.p(this, 8);
        imageReceiver.P();
        imageReceiver.q0(chat != null ? fc.a(1, chat) : null, "100_100", b9Var, null, chat, 0);
        a();
    }

    public final void a() {
        ByteBuffer byteBuffer;
        Bitmap createBitmap = Bitmap.createBitmap(640, 360, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(-14999773);
        ImageReceiver imageReceiver = this.f40900a;
        imageReceiver.y0(260.0f, 120.0f, 120.0f, 120.0f);
        imageReceiver.h(canvas, null);
        int width = createBitmap.getWidth();
        int height = createBitmap.getHeight();
        int[] iArr = new int[width * height];
        createBitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        JavaI420Buffer allocate = JavaI420Buffer.allocate(width, height);
        ByteBuffer dataY = allocate.getDataY();
        ByteBuffer dataU = allocate.getDataU();
        ByteBuffer dataV = allocate.getDataV();
        int strideY = allocate.getStrideY();
        int strideU = allocate.getStrideU();
        int strideV = allocate.getStrideV();
        for (int i7 = 0; i7 < height; i7++) {
            int i10 = 0;
            while (i10 < width) {
                int i11 = iArr[(i7 * width) + i10];
                Bitmap bitmap = createBitmap;
                int i12 = (i11 >> 16) & 255;
                int i13 = (i11 >> 8) & 255;
                int i14 = i11 & 255;
                int[] iArr2 = iArr;
                int i15 = width;
                dataY.put((i7 * strideY) + i10, (byte) (((((i14 * 25) + ((i13 * 129) + (i12 * 66))) + 128) >> 8) + 16));
                if ((i7 & 1) == 0 && (i10 & 1) == 0) {
                    int i16 = i7 >> 1;
                    int i17 = i10 >> 1;
                    byteBuffer = dataY;
                    dataU.put((i16 * strideU) + i17, (byte) (((((i14 * 112) + ((i12 * (-38)) - (i13 * 74))) + 128) >> 8) + 128));
                    dataV.put((i16 * strideV) + i17, (byte) ((((((i12 * 112) - (i13 * 94)) - (i14 * 18)) + 128) >> 8) + 128));
                } else {
                    byteBuffer = dataY;
                }
                i10++;
                createBitmap = bitmap;
                iArr = iArr2;
                width = i15;
                dataY = byteBuffer;
            }
        }
        VideoFrame videoFrame = new VideoFrame(allocate, 0, 0L);
        createBitmap.recycle();
        VideoFrame videoFrame2 = this.f40901b;
        if (videoFrame2 != null) {
            videoFrame2.release();
        }
        this.f40901b = videoFrame;
    }
}
