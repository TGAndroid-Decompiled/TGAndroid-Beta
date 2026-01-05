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
import java.io.IOException;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.ui.ActionBar.Theme;

public class ThemePreviewDrawable extends BitmapDrawable {
    private DocumentObject.ThemeDocument themeDocument;

    public ThemePreviewDrawable(File file, DocumentObject.ThemeDocument themeDocument) {
        super(createPreview(file, themeDocument));
        this.themeDocument = themeDocument;
    }

    private static Bitmap createPreview(File file, DocumentObject.ThemeDocument themeDocument) throws IOException {
        BitmapDrawable bitmapDrawableCreateDitheredGradientBitmapDrawable;
        MotionBackgroundDrawable motionBackgroundDrawable;
        boolean z;
        Bitmap bitmap;
        Bitmap bitmapDecodeFile;
        int i;
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
        int i2 = sparseIntArrayClone.get(Theme.key_chat_wallpaper);
        int i3 = sparseIntArrayClone.get(Theme.key_chat_wallpaper_gradient_to1);
        int i4 = sparseIntArrayClone.get(Theme.key_chat_wallpaper_gradient_to2);
        int i5 = sparseIntArrayClone.get(Theme.key_chat_wallpaper_gradient_to3);
        int i6 = sparseIntArrayClone.get(Theme.key_chat_wallpaper_gradient_rotation);
        Drawable drawableMutate = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.preview_back).mutate();
        Theme.setDrawableColor(drawableMutate, previewColor2);
        Drawable drawableMutate2 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.preview_dots).mutate();
        Theme.setDrawableColor(drawableMutate2, previewColor2);
        Drawable drawableMutate3 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.preview_smile).mutate();
        Theme.setDrawableColor(drawableMutate3, previewColor4);
        Drawable drawableMutate4 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.preview_mic).mutate();
        Theme.setDrawableColor(drawableMutate4, previewColor4);
        Theme.MessageDrawable[] messageDrawableArr = new Theme.MessageDrawable[2];
        int i7 = 0;
        while (i7 < 2) {
            Drawable drawable = drawableMutate4;
            Drawable drawable2 = drawableMutate;
            Drawable drawable3 = drawableMutate2;
            Theme.MessageDrawable messageDrawable = new Theme.MessageDrawable(2, i7 == 1, false) {
                @Override
                protected int getColor(int i8) {
                    return sparseIntArrayClone.get(i8);
                }

                @Override
                protected int getCurrentColor(int i8) {
                    return sparseIntArrayClone.get(i8);
                }
            };
            messageDrawableArr[i7] = messageDrawable;
            Theme.setDrawableColor(messageDrawable, i7 == 1 ? previewColor6 : previewColor5);
            i7++;
            drawableMutate4 = drawable;
            drawableMutate2 = drawable3;
            drawableMutate = drawable2;
        }
        Drawable drawable4 = drawableMutate4;
        Drawable drawable5 = drawableMutate;
        Drawable drawable6 = drawableMutate2;
        if (i4 != 0) {
            motionBackgroundDrawable = new MotionBackgroundDrawable(i2, i3, i4, i5, true);
            bitmapDrawableCreateDitheredGradientBitmapDrawable = null;
        } else {
            bitmapDrawableCreateDitheredGradientBitmapDrawable = BackgroundGradientDrawable.createDitheredGradientBitmapDrawable(i6, new int[]{i2, i3}, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight() - 120);
            motionBackgroundDrawable = null;
        }
        int patternColor = AndroidUtilities.getPatternColor(AndroidUtilities.getAverageColor(i2, i3));
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
                    int i8 = 1;
                    while (true) {
                        i = i8 * 2;
                        if (i8 * 4 >= fMin) {
                            break;
                        }
                        i8 = i;
                    }
                    options.inSampleSize = i;
                } else {
                    options.inSampleSize = (int) fMin;
                }
                bitmapDecodeFile = BitmapFactory.decodeFile(file.getAbsolutePath(), options);
            }
            if (bitmapDecodeFile != null) {
                if (motionBackgroundDrawable != null) {
                    motionBackgroundDrawable.setPatternBitmap((int) (themeDocument.accent.patternIntensity * 100.0f), bitmapDecodeFile);
                    motionBackgroundDrawable.setBounds(0, 120, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight() - 120);
                    motionBackgroundDrawable.draw(canvas);
                } else {
                    Paint paint2 = new Paint(2);
                    if (themeDocument.accent.patternIntensity >= 0.0f) {
                        paint2.setColorFilter(new PorterDuffColorFilter(patternColor, PorterDuff.Mode.SRC_IN));
                    }
                    paint2.setAlpha(255);
                    float fMax = Math.max(560 / bitmapDecodeFile.getWidth(), 678 / bitmapDecodeFile.getHeight());
                    int width = (int) (bitmapDecodeFile.getWidth() * fMax);
                    canvas.save();
                    canvas.translate((560 - width) / 2, (678 - ((int) (bitmapDecodeFile.getHeight() * fMax))) / 2);
                    canvas.scale(fMax, fMax);
                    canvas.drawBitmap(bitmapDecodeFile, 0.0f, 0.0f, paint2);
                    canvas.restore();
                }
            }
            bitmap = bitmapDecodeFile;
        } else {
            bitmap = null;
        }
        if (bitmap == null && motionBackgroundDrawable != null) {
            motionBackgroundDrawable.setBounds(0, 120, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight() - 120);
            motionBackgroundDrawable.draw(canvas);
        }
        paint.setColor(previewColor);
        canvas.drawRect(0.0f, 0.0f, bitmapCreateBitmap.getWidth(), 120.0f, paint);
        if (drawable5 != null) {
            int intrinsicHeight = (120 - drawable5.getIntrinsicHeight()) / 2;
            drawable5.setBounds(13, intrinsicHeight, drawable5.getIntrinsicWidth() + 13, drawable5.getIntrinsicHeight() + intrinsicHeight);
            drawable5.draw(canvas);
        }
        if (drawable6 != null) {
            int width2 = (bitmapCreateBitmap.getWidth() - drawable6.getIntrinsicWidth()) - 10;
            int intrinsicHeight2 = (120 - drawable6.getIntrinsicHeight()) / 2;
            drawable6.setBounds(width2, intrinsicHeight2, drawable6.getIntrinsicWidth() + width2, drawable6.getIntrinsicHeight() + intrinsicHeight2);
            drawable6.draw(canvas);
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
            int height = (bitmapCreateBitmap.getHeight() - 120) + ((120 - drawableMutate3.getIntrinsicHeight()) / 2);
            drawableMutate3.setBounds(22, height, drawableMutate3.getIntrinsicWidth() + 22, drawableMutate3.getIntrinsicHeight() + height);
            drawableMutate3.draw(canvas);
        }
        if (drawable4 != null) {
            int width3 = (bitmapCreateBitmap.getWidth() - drawable4.getIntrinsicWidth()) - 22;
            int height2 = (bitmapCreateBitmap.getHeight() - 120) + ((120 - drawable4.getIntrinsicHeight()) / 2);
            drawable4.setBounds(width3, height2, drawable4.getIntrinsicWidth() + width3, drawable4.getIntrinsicHeight() + height2);
            drawable4.draw(canvas);
        }
        return bitmapCreateBitmap;
    }
}
