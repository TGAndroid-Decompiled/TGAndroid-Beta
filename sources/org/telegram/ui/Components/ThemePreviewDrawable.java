package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.ui.ActionBar.MessageDrawable;
import org.telegram.ui.ActionBar.Theme;

public class ThemePreviewDrawable extends BitmapDrawable {
    private DocumentObject.ThemeDocument themeDocument;

    public ThemePreviewDrawable(File file, DocumentObject.ThemeDocument themeDocument) {
        super(createPreview(file, themeDocument));
        this.themeDocument = themeDocument;
    }

    private static Bitmap createPreview(File file, DocumentObject.ThemeDocument themeDocument) {
        int i;
        int i2;
        BitmapDrawable bitmapDrawableCreateDitheredGradientBitmapDrawable;
        MotionBackgroundDrawable motionBackgroundDrawable;
        boolean z;
        Bitmap bitmap;
        Bitmap bitmapDecodeFile;
        int i3;
        new RectF();
        Paint paint = new Paint();
        Bitmap bitmapCreateBitmap = Bitmaps.createBitmap(560, 678, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        SparseIntArray themeFileValues = Theme.getThemeFileValues(null, themeDocument.baseTheme.assetName, null);
        final SparseIntArray sparseIntArrayClone = themeFileValues.clone();
        themeDocument.accent.fillAccentColors(themeFileValues, sparseIntArrayClone);
        int previewColor = Theme.getPreviewColor(sparseIntArrayClone, Theme.key_actionBarDefault);
        int previewColor2 = Theme.getPreviewColor(sparseIntArrayClone, Theme.key_actionBarDefaultIcon);
        int previewColor3 = Theme.getPreviewColor(sparseIntArrayClone, Theme.key_chat_messagePanelBackground);
        int previewColor4 = Theme.getPreviewColor(sparseIntArrayClone, Theme.key_chat_messagePanelIcons);
        int previewColor5 = Theme.getPreviewColor(sparseIntArrayClone, Theme.key_chat_inBubble);
        int previewColor6 = Theme.getPreviewColor(sparseIntArrayClone, Theme.key_chat_outBubble);
        int i4 = sparseIntArrayClone.get(Theme.key_chat_wallpaper);
        int i5 = sparseIntArrayClone.get(Theme.key_chat_wallpaper_gradient_to1);
        int i6 = sparseIntArrayClone.get(Theme.key_chat_wallpaper_gradient_to2);
        int i7 = sparseIntArrayClone.get(Theme.key_chat_wallpaper_gradient_to3);
        int i8 = sparseIntArrayClone.get(Theme.key_chat_wallpaper_gradient_rotation);
        Drawable drawableMutate = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.preview_back).mutate();
        Theme.setDrawableColor(drawableMutate, previewColor2);
        Drawable drawableMutate2 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.preview_dots).mutate();
        Theme.setDrawableColor(drawableMutate2, previewColor2);
        Drawable drawableMutate3 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.preview_smile).mutate();
        Theme.setDrawableColor(drawableMutate3, previewColor4);
        Drawable drawableMutate4 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.preview_mic).mutate();
        Theme.setDrawableColor(drawableMutate4, previewColor4);
        int i9 = 2;
        MessageDrawable[] messageDrawableArr = new MessageDrawable[2];
        int i10 = 0;
        while (true) {
            if (i10 >= i9) {
                break;
            }
            Drawable drawable = drawableMutate;
            int i11 = previewColor5;
            MessageDrawable messageDrawable = new MessageDrawable(2, i10 == 1, false) {
                @Override
                protected int getColor(int i12) {
                    return sparseIntArrayClone.get(i12);
                }

                @Override
                protected int getCurrentColor(int i12) {
                    return sparseIntArrayClone.get(i12);
                }
            };
            messageDrawableArr[i10] = messageDrawable;
            Theme.setDrawableColor(messageDrawable, i10 == 1 ? previewColor6 : i11);
            i10++;
            previewColor5 = i11;
            drawableMutate = drawable;
            i9 = 2;
        }
        Drawable drawable2 = drawableMutate;
        if (i6 != 0) {
            i = i4;
            i2 = i5;
            motionBackgroundDrawable = new MotionBackgroundDrawable(i4, i5, i6, i7, true);
            bitmapDrawableCreateDitheredGradientBitmapDrawable = null;
        } else {
            i = i4;
            i2 = i5;
            bitmapDrawableCreateDitheredGradientBitmapDrawable = BackgroundGradientDrawable.createDitheredGradientBitmapDrawable(i8, new int[]{i, i2}, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight() - 120);
            motionBackgroundDrawable = null;
        }
        int patternColor = AndroidUtilities.getPatternColor(AndroidUtilities.getAverageColor(i, i2));
        if (bitmapDrawableCreateDitheredGradientBitmapDrawable != null) {
            z = false;
            bitmapDrawableCreateDitheredGradientBitmapDrawable.setBounds(0, 120, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight() - 120);
            bitmapDrawableCreateDitheredGradientBitmapDrawable.draw(canvas);
        } else {
            z = false;
        }
        if (file != null) {
            if ("application/x-tgwallpattern".equals(themeDocument.mime_type)) {
                bitmapDecodeFile = SvgHelper.getBitmap(file, 560, 678, z);
            } else {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 1;
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(file.getAbsolutePath(), options);
                float f = options.outWidth;
                float f2 = options.outHeight;
                float f3 = 560;
                float f4 = 678;
                float fMin = Math.min(f / f3, f2 / f4);
                if (fMin < 1.2f) {
                    fMin = 1.0f;
                }
                options.inJustDecodeBounds = false;
                if (fMin > 1.0f && (f > f3 || f2 > f4)) {
                    int i12 = 1;
                    while (true) {
                        i3 = i12 * 2;
                        if (i12 * 4 >= fMin) {
                            break;
                        }
                        i12 = i3;
                    }
                    options.inSampleSize = i3;
                } else {
                    options.inSampleSize = (int) fMin;
                }
                bitmapDecodeFile = BitmapFactory.decodeFile(file.getAbsolutePath(), options);
            }
            bitmap = bitmapDecodeFile;
            if (bitmap != null) {
                if (motionBackgroundDrawable != null) {
                    motionBackgroundDrawable.setPatternBitmap((int) (themeDocument.accent.patternIntensity * 100.0f), bitmap);
                    motionBackgroundDrawable.setBounds(0, 120, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight() - 120);
                    motionBackgroundDrawable.draw(canvas);
                } else {
                    Paint paint2 = new Paint(2);
                    if (themeDocument.accent.patternIntensity >= 0.0f) {
                        paint2.setColorFilter(new PorterDuffColorFilter(patternColor, PorterDuff.Mode.SRC_IN));
                    }
                    paint2.setAlpha(255);
                    float fMax = Math.max(560 / bitmap.getWidth(), 678 / bitmap.getHeight());
                    int width = (int) (bitmap.getWidth() * fMax);
                    int height = (678 - ((int) (bitmap.getHeight() * fMax))) / 2;
                    canvas.save();
                    canvas.translate((560 - width) / 2, height);
                    canvas.scale(fMax, fMax);
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
                    canvas.restore();
                }
            }
        } else {
            bitmap = null;
        }
        if (bitmap == null && motionBackgroundDrawable != null) {
            motionBackgroundDrawable.setBounds(0, 120, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight() - 120);
            motionBackgroundDrawable.draw(canvas);
        }
        paint.setColor(previewColor);
        canvas.drawRect(0.0f, 0.0f, bitmapCreateBitmap.getWidth(), 120.0f, paint);
        if (drawable2 != null) {
            int intrinsicHeight = (120 - drawable2.getIntrinsicHeight()) / 2;
            drawable2.setBounds(13, intrinsicHeight, drawable2.getIntrinsicWidth() + 13, drawable2.getIntrinsicHeight() + intrinsicHeight);
            drawable2.draw(canvas);
        }
        if (drawableMutate2 != null) {
            int width2 = (bitmapCreateBitmap.getWidth() - drawableMutate2.getIntrinsicWidth()) - 10;
            int intrinsicHeight2 = (120 - drawableMutate2.getIntrinsicHeight()) / 2;
            drawableMutate2.setBounds(width2, intrinsicHeight2, drawableMutate2.getIntrinsicWidth() + width2, drawableMutate2.getIntrinsicHeight() + intrinsicHeight2);
            drawableMutate2.draw(canvas);
        }
        messageDrawableArr[1].setBounds(161, 216, bitmapCreateBitmap.getWidth() - 20, 308);
        messageDrawableArr[1].setTop(0, 560, 522, false, false);
        messageDrawableArr[1].draw(canvas);
        messageDrawableArr[1].setBounds(161, 430, bitmapCreateBitmap.getWidth() - 20, 522);
        messageDrawableArr[1].setTop(430, 560, 522, false, false);
        messageDrawableArr[1].draw(canvas);
        messageDrawableArr[0].setBounds(20, 323, 399, 415);
        messageDrawableArr[0].setTop(323, 560, 522, false, false);
        messageDrawableArr[0].draw(canvas);
        paint.setColor(previewColor3);
        canvas.drawRect(0.0f, bitmapCreateBitmap.getHeight() - 120, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), paint);
        if (drawableMutate3 != null) {
            int height2 = (bitmapCreateBitmap.getHeight() - 120) + ((120 - drawableMutate3.getIntrinsicHeight()) / 2);
            drawableMutate3.setBounds(22, height2, drawableMutate3.getIntrinsicWidth() + 22, drawableMutate3.getIntrinsicHeight() + height2);
            drawableMutate3.draw(canvas);
        }
        if (drawableMutate4 != null) {
            int width3 = (bitmapCreateBitmap.getWidth() - drawableMutate4.getIntrinsicWidth()) - 22;
            int height3 = (bitmapCreateBitmap.getHeight() - 120) + ((120 - drawableMutate4.getIntrinsicHeight()) / 2);
            drawableMutate4.setBounds(width3, height3, drawableMutate4.getIntrinsicWidth() + width3, drawableMutate4.getIntrinsicHeight() + height3);
            drawableMutate4.draw(canvas);
        }
        return bitmapCreateBitmap;
    }
}
