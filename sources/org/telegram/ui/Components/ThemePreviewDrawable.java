package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.ui.ActionBar.Theme;
public class ThemePreviewDrawable extends BitmapDrawable {
    public ThemePreviewDrawable(File file, DocumentObject.ThemeDocument themeDocument) {
        super(createPreview(file, themeDocument));
    }

    private static Bitmap createPreview(File file, DocumentObject.ThemeDocument themeDocument) {
        boolean z;
        Drawable createDitheredGradientBitmapDrawable;
        MotionBackgroundDrawable motionBackgroundDrawable;
        int patternColor;
        boolean z2;
        Bitmap bitmap;
        Bitmap decodeFile;
        new RectF();
        Paint paint = new Paint();
        Bitmap createBitmap = Bitmaps.createBitmap(560, 678, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        HashMap<String, Integer> themeFileValues = Theme.getThemeFileValues(null, themeDocument.baseTheme.assetName, null);
        final HashMap<String, Integer> hashMap = new HashMap<>(themeFileValues);
        themeDocument.accent.fillAccentColors(themeFileValues, hashMap);
        int previewColor = Theme.getPreviewColor(hashMap, "actionBarDefault");
        int previewColor2 = Theme.getPreviewColor(hashMap, "actionBarDefaultIcon");
        int previewColor3 = Theme.getPreviewColor(hashMap, "chat_messagePanelBackground");
        int previewColor4 = Theme.getPreviewColor(hashMap, "chat_messagePanelIcons");
        int previewColor5 = Theme.getPreviewColor(hashMap, "chat_inBubble");
        int previewColor6 = Theme.getPreviewColor(hashMap, "chat_outBubble");
        Integer num = hashMap.get("chat_wallpaper");
        Integer num2 = hashMap.get("chat_wallpaper_gradient_to");
        Integer num3 = hashMap.get("key_chat_wallpaper_gradient_to2");
        Integer num4 = hashMap.get("key_chat_wallpaper_gradient_to3");
        Integer num5 = hashMap.get("chat_wallpaper_gradient_rotation");
        if (num5 == null) {
            num5 = 45;
        }
        Drawable mutate = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.preview_back).mutate();
        Theme.setDrawableColor(mutate, previewColor2);
        Drawable mutate2 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.preview_dots).mutate();
        Theme.setDrawableColor(mutate2, previewColor2);
        Drawable mutate3 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.preview_smile).mutate();
        Theme.setDrawableColor(mutate3, previewColor4);
        Drawable mutate4 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.preview_mic).mutate();
        Theme.setDrawableColor(mutate4, previewColor4);
        Theme.MessageDrawable[] messageDrawableArr = new Theme.MessageDrawable[2];
        int i = 0;
        while (i < 2) {
            Drawable drawable = mutate2;
            Paint paint2 = paint;
            int i2 = previewColor;
            messageDrawableArr[i] = new Theme.MessageDrawable(2, i == 1, false) {
                @Override
                protected int getColor(String str) {
                    Integer num6 = (Integer) hashMap.get(str);
                    if (num6 == null) {
                        return Theme.getColor(str);
                    }
                    return num6.intValue();
                }

                @Override
                protected Integer getCurrentColor(String str) {
                    return (Integer) hashMap.get(str);
                }
            };
            Theme.setDrawableColor(messageDrawableArr[i], i == 1 ? previewColor6 : previewColor5);
            i++;
            mutate2 = drawable;
            paint = paint2;
            previewColor = i2;
        }
        Paint paint3 = paint;
        int i3 = previewColor;
        Drawable drawable2 = mutate2;
        if (num != null) {
            if (num2 == null) {
                createDitheredGradientBitmapDrawable = new ColorDrawable(num.intValue());
                patternColor = AndroidUtilities.getPatternColor(num.intValue());
                motionBackgroundDrawable = null;
            } else {
                if (num3.intValue() != 0) {
                    motionBackgroundDrawable = new MotionBackgroundDrawable(num.intValue(), num2.intValue(), num3.intValue(), num4.intValue(), true);
                    createDitheredGradientBitmapDrawable = null;
                } else {
                    createDitheredGradientBitmapDrawable = BackgroundGradientDrawable.createDitheredGradientBitmapDrawable(num5.intValue(), new int[]{num.intValue(), num2.intValue()}, createBitmap.getWidth(), createBitmap.getHeight() - 120);
                    motionBackgroundDrawable = null;
                }
                patternColor = AndroidUtilities.getPatternColor(AndroidUtilities.getAverageColor(num.intValue(), num2.intValue()));
            }
            if (createDitheredGradientBitmapDrawable != null) {
                z2 = false;
                createDitheredGradientBitmapDrawable.setBounds(0, 120, createBitmap.getWidth(), createBitmap.getHeight() - 120);
                createDitheredGradientBitmapDrawable.draw(canvas);
            } else {
                z2 = false;
            }
            if (file != null) {
                if ("application/x-tgwallpattern".equals(themeDocument.mime_type)) {
                    decodeFile = SvgHelper.getBitmap(file, 560, 678, z2);
                } else {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inSampleSize = 1;
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(file.getAbsolutePath(), options);
                    float f = options.outWidth;
                    float f2 = options.outHeight;
                    float min = Math.min(f / 560, f2 / 678);
                    if (min < 1.2f) {
                        min = 1.0f;
                    }
                    options.inJustDecodeBounds = false;
                    if (min > 1.0f && (f > 560 || f2 > 678)) {
                        int i4 = 1;
                        do {
                            i4 *= 2;
                        } while (i4 * 2 < min);
                        options.inSampleSize = i4;
                    } else {
                        options.inSampleSize = (int) min;
                    }
                    decodeFile = BitmapFactory.decodeFile(file.getAbsolutePath(), options);
                }
                bitmap = decodeFile;
                if (bitmap != null) {
                    if (motionBackgroundDrawable != null) {
                        motionBackgroundDrawable.setPatternBitmap((int) (themeDocument.accent.patternIntensity * 100.0f), bitmap);
                        motionBackgroundDrawable.setBounds(0, 120, createBitmap.getWidth(), createBitmap.getHeight() - 120);
                        motionBackgroundDrawable.draw(canvas);
                    } else {
                        Paint paint4 = new Paint(2);
                        if (themeDocument.accent.patternIntensity >= 0.0f) {
                            paint4.setColorFilter(new PorterDuffColorFilter(patternColor, PorterDuff.Mode.SRC_IN));
                        }
                        paint4.setAlpha(255);
                        float max = Math.max(560 / bitmap.getWidth(), 678 / bitmap.getHeight());
                        canvas.save();
                        canvas.translate((560 - ((int) (bitmap.getWidth() * max))) / 2, (678 - ((int) (bitmap.getHeight() * max))) / 2);
                        canvas.scale(max, max);
                        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint4);
                        canvas.restore();
                    }
                }
            } else {
                bitmap = null;
            }
            if (bitmap == null && motionBackgroundDrawable != null) {
                motionBackgroundDrawable.setBounds(0, 120, createBitmap.getWidth(), createBitmap.getHeight() - 120);
                motionBackgroundDrawable.draw(canvas);
            }
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            Drawable createDefaultWallpaper = Theme.createDefaultWallpaper(createBitmap.getWidth(), createBitmap.getHeight() - 120);
            createDefaultWallpaper.setBounds(0, 120, createBitmap.getWidth(), createBitmap.getHeight() - 120);
            createDefaultWallpaper.draw(canvas);
        }
        paint3.setColor(i3);
        canvas.drawRect(0.0f, 0.0f, createBitmap.getWidth(), 120.0f, paint3);
        if (mutate != null) {
            int intrinsicHeight = (120 - mutate.getIntrinsicHeight()) / 2;
            mutate.setBounds(13, intrinsicHeight, mutate.getIntrinsicWidth() + 13, mutate.getIntrinsicHeight() + intrinsicHeight);
            mutate.draw(canvas);
        }
        if (drawable2 != null) {
            int width = (createBitmap.getWidth() - drawable2.getIntrinsicWidth()) - 10;
            int intrinsicHeight2 = (120 - drawable2.getIntrinsicHeight()) / 2;
            drawable2.setBounds(width, intrinsicHeight2, drawable2.getIntrinsicWidth() + width, drawable2.getIntrinsicHeight() + intrinsicHeight2);
            drawable2.draw(canvas);
        }
        messageDrawableArr[1].setBounds(161, 216, createBitmap.getWidth() - 20, 308);
        messageDrawableArr[1].setTop(0, 560, 522, false, false);
        messageDrawableArr[1].draw(canvas);
        messageDrawableArr[1].setBounds(161, 430, createBitmap.getWidth() - 20, 522);
        messageDrawableArr[1].setTop(430, 560, 522, false, false);
        messageDrawableArr[1].draw(canvas);
        messageDrawableArr[0].setBounds(20, 323, 399, 415);
        messageDrawableArr[0].setTop(323, 560, 522, false, false);
        messageDrawableArr[0].draw(canvas);
        paint3.setColor(previewColor3);
        canvas.drawRect(0.0f, createBitmap.getHeight() - 120, createBitmap.getWidth(), createBitmap.getHeight(), paint3);
        if (mutate3 != null) {
            int height = (createBitmap.getHeight() - 120) + ((120 - mutate3.getIntrinsicHeight()) / 2);
            mutate3.setBounds(22, height, mutate3.getIntrinsicWidth() + 22, mutate3.getIntrinsicHeight() + height);
            mutate3.draw(canvas);
        }
        if (mutate4 != null) {
            int width2 = (createBitmap.getWidth() - mutate4.getIntrinsicWidth()) - 22;
            int height2 = (createBitmap.getHeight() - 120) + ((120 - mutate4.getIntrinsicHeight()) / 2);
            mutate4.setBounds(width2, height2, mutate4.getIntrinsicWidth() + width2, mutate4.getIntrinsicHeight() + height2);
            mutate4.draw(canvas);
        }
        return createBitmap;
    }
}
