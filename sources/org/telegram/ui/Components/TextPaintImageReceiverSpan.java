package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
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
import org.telegram.messenger.RichMessageLayout$$ExternalSyntheticOutline2;
import org.telegram.messenger.RichMessageLayout$MediaCell$$ExternalSyntheticOutline0;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ContactsActivity$$ExternalSyntheticLambda18;
import org.telegram.ui.QrActivity$5$$ExternalSyntheticLambda1;
import org.telegram.ui.web.WebInstantView;

public final class TextPaintImageReceiverSpan extends ReplacementSpan {
    public static final int $r8$clinit = 0;
    public final boolean baselineMode;
    public final int depth;
    public final int height;
    public final ImageReceiver imageReceiver;
    public final int width;

    public TextPaintImageReceiverSpan(View view, TLRPC.Document document, TLRPC.WebPage webPage, int i, int i2, boolean z) {
        Locale locale = Locale.US;
        String str = i + "_" + i2 + "_i";
        this.width = i;
        this.height = i2;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.imageReceiver = imageReceiver;
        imageReceiver.setInvalidateAll(true);
        if (z) {
            imageReceiver.setDelegate(new ContactsActivity$$ExternalSyntheticLambda18(6));
        }
        imageReceiver.setImage(ImageLocation.getForDocument(document), str, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), str, -1L, null, webPage, 1);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        canvas.save();
        ImageReceiver imageReceiver = this.imageReceiver;
        boolean z = this.baselineMode;
        int i6 = this.width;
        int i7 = this.height;
        if (z) {
            imageReceiver.setImageCoords((int) f, i4 - (i7 - this.depth), i6, i7);
        } else {
            imageReceiver.setImageCoords((int) f, RichMessageLayout$MediaCell$$ExternalSyntheticOutline0.m(RichMessageLayout$$ExternalSyntheticOutline2.m(i5, 4.0f, i3), i7, 2, i3), i6, i7);
        }
        imageReceiver.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            boolean z = this.baselineMode;
            int i3 = this.height;
            if (z) {
                int i4 = this.depth;
                int i5 = -(i3 - i4);
                fontMetricsInt.ascent = i5;
                fontMetricsInt.top = i5;
                fontMetricsInt.descent = i4;
                fontMetricsInt.bottom = i4;
            } else {
                int iDp = ((-i3) / 2) - AndroidUtilities.dp(4.0f);
                fontMetricsInt.ascent = iDp;
                fontMetricsInt.top = iDp;
                int iDp2 = (i3 - (i3 / 2)) - AndroidUtilities.dp(4.0f);
                fontMetricsInt.descent = iDp2;
                fontMetricsInt.bottom = iDp2;
            }
        }
        return this.width;
    }

    public TextPaintImageReceiverSpan(View view, WebInstantView.WebPhoto webPhoto, int i, int i2) {
        WebInstantView webInstantView;
        this.width = i;
        this.height = i2;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.imageReceiver = imageReceiver;
        imageReceiver.setInvalidateAll(true);
        QrActivity$5$$ExternalSyntheticLambda1 qrActivity$5$$ExternalSyntheticLambda1 = new QrActivity$5$$ExternalSyntheticLambda1(5);
        HashMap map = WebInstantView.instants;
        if (webPhoto == null || (webInstantView = webPhoto.instantView) == null) {
            return;
        }
        webInstantView.loadPhotoInternal(webPhoto, imageReceiver, qrActivity$5$$ExternalSyntheticLambda1);
    }

    public TextPaintImageReceiverSpan(View view, Bitmap bitmap, int i, int i2, int i3, int i4) {
        this.width = i;
        this.height = i2;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.imageReceiver = imageReceiver;
        imageReceiver.setInvalidateAll(true);
        imageReceiver.setImageBitmap(bitmap);
        imageReceiver.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN));
        this.depth = i4;
        this.baselineMode = true;
    }
}
