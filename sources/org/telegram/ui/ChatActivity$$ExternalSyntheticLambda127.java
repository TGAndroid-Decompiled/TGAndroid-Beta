package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceBitmap;
import org.telegram.ui.Components.blur3.utils.Blur3Utils;

public final class ChatActivity$$ExternalSyntheticLambda127 implements Utilities.Callback2 {
    public final int $r8$classId;
    public final ChatActivity f$0;

    public ChatActivity$$ExternalSyntheticLambda127(ChatActivity chatActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivity;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$createTopicsTabs$98((Integer) obj, (Boolean) obj2);
                break;
            case 1:
                this.f$0.lambda$createTopicsTabs$99((Long) obj, (Boolean) obj2);
                break;
            case 2:
                ChatActivity chatActivity = this.f$0;
                BlurredBackgroundSourceBitmap blurredBackgroundSourceBitmap = chatActivity.scrimBlur3SourceBitmap;
                blurredBackgroundSourceBitmap.setBitmap((Bitmap) obj2);
                Blur3Utils.checkBitmapSourceMatrixScale(blurredBackgroundSourceBitmap, chatActivity.fragmentView);
                chatActivity.scrimBlur3Factory.invalidateAllLinkedViews();
                break;
            default:
                ChatActivity chatActivity2 = this.f$0;
                chatActivity2.scrimBlurBitmap = (Bitmap) obj;
                Paint paint = new Paint(1);
                chatActivity2.scrimBlurBitmapPaint = paint;
                Bitmap bitmap = chatActivity2.scrimBlurBitmap;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                chatActivity2.scrimBlurBitmapShader = bitmapShader;
                paint.setShader(bitmapShader);
                chatActivity2.scrimBlurMatrix = new Matrix();
                BlurredBackgroundSourceBitmap blurredBackgroundSourceBitmap2 = chatActivity2.scrimBlur3SourceBitmap;
                blurredBackgroundSourceBitmap2.setBitmap((Bitmap) obj2);
                Blur3Utils.checkBitmapSourceMatrixScale(blurredBackgroundSourceBitmap2, chatActivity2.fragmentView);
                chatActivity2.scrimBlur3Factory.invalidateAllLinkedViews();
                break;
        }
    }
}
