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

public final class ThemePreviewDrawable extends BitmapDrawable {
    public ThemePreviewDrawable(File file, DocumentObject.ThemeDocument themeDocument) {
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
        int i4 = Theme.key_actionBarDefault;
        int iIndexOfKey = sparseIntArrayClone.indexOfKey(i4);
        int iValueAt = iIndexOfKey >= 0 ? sparseIntArrayClone.valueAt(iIndexOfKey) : Theme.defaultColors[i4];
        int i5 = Theme.key_actionBarDefaultIcon;
        int iIndexOfKey2 = sparseIntArrayClone.indexOfKey(i5);
        int iValueAt2 = iIndexOfKey2 >= 0 ? sparseIntArrayClone.valueAt(iIndexOfKey2) : Theme.defaultColors[i5];
        int i6 = Theme.key_chat_messagePanelBackground;
        int iIndexOfKey3 = sparseIntArrayClone.indexOfKey(i6);
        int iValueAt3 = iIndexOfKey3 >= 0 ? sparseIntArrayClone.valueAt(iIndexOfKey3) : Theme.defaultColors[i6];
        int i7 = Theme.key_chat_messagePanelIcons;
        int iIndexOfKey4 = sparseIntArrayClone.indexOfKey(i7);
        int iValueAt4 = iIndexOfKey4 >= 0 ? sparseIntArrayClone.valueAt(iIndexOfKey4) : Theme.defaultColors[i7];
        int i8 = Theme.key_chat_inBubble;
        int iIndexOfKey5 = sparseIntArrayClone.indexOfKey(i8);
        int iValueAt5 = iIndexOfKey5 >= 0 ? sparseIntArrayClone.valueAt(iIndexOfKey5) : Theme.defaultColors[i8];
        int i9 = Theme.key_chat_outBubble;
        int iIndexOfKey6 = sparseIntArrayClone.indexOfKey(i9);
        int iValueAt6 = iIndexOfKey6 >= 0 ? sparseIntArrayClone.valueAt(iIndexOfKey6) : Theme.defaultColors[i9];
        int i10 = sparseIntArrayClone.get(Theme.key_chat_wallpaper);
        int i11 = sparseIntArrayClone.get(Theme.key_chat_wallpaper_gradient_to1);
        int i12 = sparseIntArrayClone.get(Theme.key_chat_wallpaper_gradient_to2);
        int i13 = sparseIntArrayClone.get(Theme.key_chat_wallpaper_gradient_to3);
        int i14 = sparseIntArrayClone.get(Theme.key_chat_wallpaper_gradient_rotation);
        Drawable drawableMutate = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.preview_back).mutate();
        Theme.setDrawableColor(iValueAt2, drawableMutate);
        Drawable drawableMutate2 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.preview_dots).mutate();
        Theme.setDrawableColor(iValueAt2, drawableMutate2);
        Drawable drawableMutate3 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.preview_smile).mutate();
        Theme.setDrawableColor(iValueAt4, drawableMutate3);
        Drawable drawableMutate4 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.preview_mic).mutate();
        Theme.setDrawableColor(iValueAt4, drawableMutate4);
        MessageDrawable[] messageDrawableArr = new MessageDrawable[2];
        int i15 = iValueAt5;
        int i16 = 0;
        while (i16 < 2) {
            Drawable drawable = drawableMutate4;
            MessageDrawable messageDrawable = new MessageDrawable(i16 == 1) {
                @Override
                public final int getColor(int i17) {
                    return sparseIntArrayClone.get(i17);
                }

                @Override
                public final int getCurrentColor(int i17) {
                    return sparseIntArrayClone.get(i17);
                }
            };
            messageDrawableArr[i16] = messageDrawable;
            Theme.setDrawableColor(i16 == 1 ? iValueAt6 : i15, messageDrawable);
            i16++;
            drawableMutate4 = drawable;
        }
        Drawable drawable2 = drawableMutate4;
        if (i12 != 0) {
            i = i10;
            i2 = i11;
            motionBackgroundDrawable = new MotionBackgroundDrawable(i10, i11, i12, i13, true, 0, false);
            bitmapDrawableCreateDitheredGradientBitmapDrawable = null;
        } else {
            i = i10;
            i2 = i11;
            bitmapDrawableCreateDitheredGradientBitmapDrawable = BackgroundGradientDrawable.createDitheredGradientBitmapDrawable(i14, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight() - 120, new int[]{i, i2});
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
                float f4 = f / f3;
                float f5 = 678;
                float fMin = Math.min(f4, f2 / f5);
                fMin = fMin < 1.2f ? 1.0f : fMin;
                options.inJustDecodeBounds = false;
                if (fMin <= 1.0f || (f <= f3 && f2 <= f5)) {
                    options.inSampleSize = (int) fMin;
                } else {
                    int i17 = 1;
                    while (true) {
                        i3 = i17 * 2;
                        if (i17 * 4 >= fMin) {
                            break;
                        } else {
                            i17 = i3;
                        }
                    }
                    options.inSampleSize = i3;
                }
                bitmapDecodeFile = BitmapFactory.decodeFile(file.getAbsolutePath(), options);
            }
            bitmap = bitmapDecodeFile;
            if (bitmap != null) {
                if (motionBackgroundDrawable != null) {
                    motionBackgroundDrawable.setPatternBitmap(bitmap, (int) (themeDocument.accent.patternIntensity * 100.0f));
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
        paint.setColor(iValueAt);
        canvas.drawRect(0.0f, 0.0f, bitmapCreateBitmap.getWidth(), 120.0f, paint);
        if (drawableMutate != null) {
            int intrinsicHeight = (120 - drawableMutate.getIntrinsicHeight()) / 2;
            drawableMutate.setBounds(13, intrinsicHeight, drawableMutate.getIntrinsicWidth() + 13, drawableMutate.getIntrinsicHeight() + intrinsicHeight);
            drawableMutate.draw(canvas);
        }
        if (drawableMutate2 != null) {
            int width2 = (bitmapCreateBitmap.getWidth() - drawableMutate2.getIntrinsicWidth()) - 10;
            int intrinsicHeight2 = (120 - drawableMutate2.getIntrinsicHeight()) / 2;
            drawableMutate2.setBounds(width2, intrinsicHeight2, drawableMutate2.getIntrinsicWidth() + width2, drawableMutate2.getIntrinsicHeight() + intrinsicHeight2);
            drawableMutate2.draw(canvas);
        }
        messageDrawableArr[1].setBounds(161, 216, bitmapCreateBitmap.getWidth() - 20, 308);
        messageDrawableArr[1].setTop(0, 560, 522);
        messageDrawableArr[1].draw(canvas);
        messageDrawableArr[1].setBounds(161, 430, bitmapCreateBitmap.getWidth() - 20, 522);
        messageDrawableArr[1].setTop(430, 560, 522);
        messageDrawableArr[1].draw(canvas);
        messageDrawableArr[0].setBounds(20, 323, 399, 415);
        messageDrawableArr[0].setTop(323, 560, 522);
        messageDrawableArr[0].draw(canvas);
        paint.setColor(iValueAt3);
        canvas.drawRect(0.0f, bitmapCreateBitmap.getHeight() - 120, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), paint);
        if (drawableMutate3 != null) {
            int intrinsicHeight3 = ((120 - drawableMutate3.getIntrinsicHeight()) / 2) + (bitmapCreateBitmap.getHeight() - 120);
            drawableMutate3.setBounds(22, intrinsicHeight3, drawableMutate3.getIntrinsicWidth() + 22, drawableMutate3.getIntrinsicHeight() + intrinsicHeight3);
            drawableMutate3.draw(canvas);
        }
        if (drawable2 != null) {
            int width3 = (bitmapCreateBitmap.getWidth() - drawable2.getIntrinsicWidth()) - 22;
            int intrinsicHeight4 = ((120 - drawable2.getIntrinsicHeight()) / 2) + (bitmapCreateBitmap.getHeight() - 120);
            drawable2.setBounds(width3, intrinsicHeight4, drawable2.getIntrinsicWidth() + width3, drawable2.getIntrinsicHeight() + intrinsicHeight4);
            drawable2.draw(canvas);
        }
        super(bitmapCreateBitmap);
    }
}
