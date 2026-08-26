package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.style.ReplacementSpan;
import android.view.View;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.RichMessageLayout$$ExternalSyntheticOutline1;
import org.telegram.messenger.RichMessageLayout$MediaCell$$ExternalSyntheticOutline0;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.web.WebInstantView;

public class TextPaintImageReceiverSpan extends ReplacementSpan {
    private boolean alignTop;
    private boolean baselineMode;
    private int depth;
    private int height;
    private ImageReceiver imageReceiver;
    private int width;

    public TextPaintImageReceiverSpan(View view, TLRPC.Document document, Object obj, int i, int i2, boolean z, boolean z2) {
        Locale locale = Locale.US;
        String str = i + "_" + i2 + "_i";
        this.width = i;
        this.height = i2;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.imageReceiver = imageReceiver;
        imageReceiver.setInvalidateAll(true);
        if (z2) {
            this.imageReceiver.setDelegate(new ShareAlert$$ExternalSyntheticLambda26(11));
        }
        this.imageReceiver.setImage(ImageLocation.getForDocument(document), str, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), str, -1L, null, obj, 1);
        this.alignTop = z;
    }

    public static void lambda$new$0(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        if (imageReceiver.canInvertBitmap()) {
            imageReceiver.setColorFilter(new ColorMatrixColorFilter(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, -1.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, -1.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
        }
    }

    public static void lambda$new$1(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        if (imageReceiver.canInvertBitmap()) {
            imageReceiver.setColorFilter(new ColorMatrixColorFilter(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, -1.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, -1.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
        }
    }

    public static void lambda$new$2() {
    }

    @Override
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        canvas.save();
        if (this.baselineMode) {
            int i6 = this.height;
            this.imageReceiver.setImageCoords((int) f, i4 - (i6 - this.depth), this.width, i6);
        } else if (this.alignTop) {
            this.imageReceiver.setImageCoords((int) f, i3 - 1, this.width, this.height);
        } else {
            int iM = RichMessageLayout$$ExternalSyntheticOutline1.m(4.0f, i5, i3);
            ImageReceiver imageReceiver = this.imageReceiver;
            float f2 = (int) f;
            int i7 = this.height;
            imageReceiver.setImageCoords(f2, RichMessageLayout$MediaCell$$ExternalSyntheticOutline0.m(iM, i7, 2, i3), this.width, i7);
        }
        this.imageReceiver.draw(canvas);
        canvas.restore();
    }

    @Override
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            if (this.baselineMode) {
                int i3 = this.height;
                int i4 = this.depth;
                int i5 = -(i3 - i4);
                fontMetricsInt.ascent = i5;
                fontMetricsInt.top = i5;
                fontMetricsInt.descent = i4;
                fontMetricsInt.bottom = i4;
            } else if (this.alignTop) {
                int iDp = (fontMetricsInt.descent - fontMetricsInt.ascent) - AndroidUtilities.dp(4.0f);
                int i6 = this.height - iDp;
                fontMetricsInt.descent = i6;
                fontMetricsInt.bottom = i6;
                int i7 = 0 - iDp;
                fontMetricsInt.ascent = i7;
                fontMetricsInt.top = i7;
            } else {
                int iDp2 = ((-this.height) / 2) - AndroidUtilities.dp(4.0f);
                fontMetricsInt.ascent = iDp2;
                fontMetricsInt.top = iDp2;
                int i8 = this.height;
                int iDp3 = (i8 - (i8 / 2)) - AndroidUtilities.dp(4.0f);
                fontMetricsInt.descent = iDp3;
                fontMetricsInt.bottom = iDp3;
            }
        }
        return this.width;
    }

    public TextPaintImageReceiverSpan(View view, WebInstantView.WebPhoto webPhoto, Object obj, int i, int i2, boolean z, boolean z2) {
        WebInstantView webInstantView;
        this.width = i;
        this.height = i2;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.imageReceiver = imageReceiver;
        imageReceiver.setInvalidateAll(true);
        if (z2) {
            this.imageReceiver.setDelegate(new ShareAlert$$ExternalSyntheticLambda26(10));
        }
        ImageReceiver imageReceiver2 = this.imageReceiver;
        UndoView$$ExternalSyntheticLambda7 undoView$$ExternalSyntheticLambda7 = new UndoView$$ExternalSyntheticLambda7(21);
        HashMap map = WebInstantView.instants;
        if (webPhoto != null && (webInstantView = webPhoto.instantView) != null) {
            webInstantView.loadPhotoInternal(webPhoto, imageReceiver2, undoView$$ExternalSyntheticLambda7);
        }
        this.alignTop = z;
    }

    public TextPaintImageReceiverSpan(View view, Bitmap bitmap, int i, int i2, boolean z, int i3) {
        this.width = i;
        this.height = i2;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.imageReceiver = imageReceiver;
        imageReceiver.setInvalidateAll(true);
        this.imageReceiver.setImageBitmap(bitmap);
        this.imageReceiver.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN));
        this.alignTop = z;
    }

    public TextPaintImageReceiverSpan(View view, Bitmap bitmap, int i, int i2, int i3, int i4) {
        this.width = i;
        this.height = i2;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.imageReceiver = imageReceiver;
        imageReceiver.setInvalidateAll(true);
        this.imageReceiver.setImageBitmap(bitmap);
        this.imageReceiver.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN));
        this.depth = i4;
        this.baselineMode = true;
    }
}
