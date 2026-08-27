package org.telegram.ui.Components;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.SparseIntArray;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.Utilities;

public final class z01 extends BitmapDrawable {
    public z01(File file, DocumentObject.ThemeDocument themeDocument) {
        int i10;
        int i11;
        BitmapDrawable bitmapDrawable;
        nb0 nb0Var;
        boolean z10;
        Bitmap bitmap;
        Bitmap bitmapDecodeFile;
        int i12;
        new RectF();
        Paint paint = new Paint();
        Bitmap bitmapCreateBitmap = Bitmaps.createBitmap(560, 678, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        SparseIntArray sparseIntArrayQ0 = org.telegram.ui.ActionBar.g6.Q0(null, themeDocument.baseTheme.d, null);
        SparseIntArray sparseIntArrayClone = sparseIntArrayQ0.clone();
        themeDocument.accent.c(sparseIntArrayQ0, sparseIntArrayClone);
        int iF0 = org.telegram.ui.ActionBar.g6.F0(sparseIntArrayClone, org.telegram.ui.ActionBar.g6.f23322s8);
        int iF1 = org.telegram.ui.ActionBar.g6.F0(sparseIntArrayClone, org.telegram.ui.ActionBar.g6.f23375v8);
        int iF2 = org.telegram.ui.ActionBar.g6.F0(sparseIntArrayClone, org.telegram.ui.ActionBar.g6.Sd);
        int iF3 = org.telegram.ui.ActionBar.g6.F0(sparseIntArrayClone, org.telegram.ui.ActionBar.g6.Xd);
        int iF4 = org.telegram.ui.ActionBar.g6.F0(sparseIntArrayClone, org.telegram.ui.ActionBar.g6.f23305ra);
        int iF5 = org.telegram.ui.ActionBar.g6.F0(sparseIntArrayClone, org.telegram.ui.ActionBar.g6.Aa);
        int i13 = sparseIntArrayClone.get(org.telegram.ui.ActionBar.g6.Nd);
        int i14 = sparseIntArrayClone.get(org.telegram.ui.ActionBar.g6.Od);
        int i15 = sparseIntArrayClone.get(org.telegram.ui.ActionBar.g6.Pd);
        int i16 = sparseIntArrayClone.get(org.telegram.ui.ActionBar.g6.Qd);
        int i17 = sparseIntArrayClone.get(org.telegram.ui.ActionBar.g6.Rd);
        Drawable drawableMutate = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.preview_back).mutate();
        org.telegram.ui.ActionBar.g6.w1(iF1, drawableMutate);
        Drawable drawableMutate2 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.preview_dots).mutate();
        org.telegram.ui.ActionBar.g6.w1(iF1, drawableMutate2);
        Drawable drawableMutate3 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.preview_smile).mutate();
        org.telegram.ui.ActionBar.g6.w1(iF3, drawableMutate3);
        Drawable drawableMutate4 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.preview_mic).mutate();
        org.telegram.ui.ActionBar.g6.w1(iF3, drawableMutate4);
        org.telegram.ui.ActionBar.d5[] d5VarArr = new org.telegram.ui.ActionBar.d5[2];
        int i18 = 0;
        while (i18 < 2) {
            Drawable drawable = drawableMutate4;
            y01 y01Var = new y01(i18 == 1, sparseIntArrayClone);
            d5VarArr[i18] = y01Var;
            org.telegram.ui.ActionBar.g6.w1(i18 == 1 ? iF5 : iF4, y01Var);
            i18++;
            drawableMutate4 = drawable;
        }
        Drawable drawable2 = drawableMutate4;
        if (i15 != 0) {
            i10 = i13;
            i11 = i14;
            nb0Var = new nb0(true, i13, i14, i15, i16);
            bitmapDrawable = null;
        } else {
            i10 = i13;
            i11 = i14;
            int width = bitmapCreateBitmap.getWidth();
            int height = bitmapCreateBitmap.getHeight() - 120;
            GradientDrawable.Orientation orientationD = m9.d(i17);
            Resources resources = ApplicationLoader.applicationContext.getResources();
            Rect rectE = m9.e(orientationD, width, height);
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Utilities.drawDitheredGradient(bitmapCreateBitmap2, new int[]{i10, i11}, rectE.left, rectE.top, rectE.right, rectE.bottom);
            bitmapDrawable = new BitmapDrawable(resources, bitmapCreateBitmap2);
            nb0Var = null;
        }
        int patternColor = AndroidUtilities.getPatternColor(AndroidUtilities.getAverageColor(i10, i11));
        if (bitmapDrawable != null) {
            z10 = false;
            bitmapDrawable.setBounds(0, 120, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight() - 120);
            bitmapDrawable.draw(canvas);
        } else {
            z10 = false;
        }
        if (file != null) {
            if ("application/x-tgwallpattern".equals(themeDocument.mime_type)) {
                bitmapDecodeFile = SvgHelper.getBitmap(file, 560, 678, z10);
            } else {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 1;
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(file.getAbsolutePath(), options);
                float f10 = options.outWidth;
                float f11 = options.outHeight;
                float f12 = 560;
                float f13 = 678;
                float fMin = Math.min(f10 / f12, f11 / f13);
                fMin = fMin < 1.2f ? 1.0f : fMin;
                options.inJustDecodeBounds = false;
                if (fMin <= 1.0f || (f10 <= f12 && f11 <= f13)) {
                    options.inSampleSize = (int) fMin;
                } else {
                    int i19 = 1;
                    while (true) {
                        i12 = i19 * 2;
                        if (i19 * 4 >= fMin) {
                            break;
                        } else {
                            i19 = i12;
                        }
                    }
                    options.inSampleSize = i12;
                }
                bitmapDecodeFile = BitmapFactory.decodeFile(file.getAbsolutePath(), options);
            }
            bitmap = bitmapDecodeFile;
            if (bitmap != null) {
                if (nb0Var != null) {
                    nb0Var.t(bitmap, (int) (themeDocument.accent.f22896p * 100.0f));
                    nb0Var.setBounds(0, 120, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight() - 120);
                    nb0Var.draw(canvas);
                } else {
                    Paint paint2 = new Paint(2);
                    if (themeDocument.accent.f22896p >= 0.0f) {
                        paint2.setColorFilter(new PorterDuffColorFilter(patternColor, PorterDuff.Mode.SRC_IN));
                    }
                    paint2.setAlpha(255);
                    float fMax = Math.max(560 / bitmap.getWidth(), 678 / bitmap.getHeight());
                    int width2 = (int) (bitmap.getWidth() * fMax);
                    int height2 = (678 - ((int) (bitmap.getHeight() * fMax))) / 2;
                    canvas.save();
                    canvas.translate((560 - width2) / 2, height2);
                    canvas.scale(fMax, fMax);
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
                    canvas.restore();
                }
            }
        } else {
            bitmap = null;
        }
        if (bitmap == null && nb0Var != null) {
            nb0Var.setBounds(0, 120, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight() - 120);
            nb0Var.draw(canvas);
        }
        paint.setColor(iF0);
        canvas.drawRect(0.0f, 0.0f, bitmapCreateBitmap.getWidth(), 120.0f, paint);
        if (drawableMutate != null) {
            int intrinsicHeight = (120 - drawableMutate.getIntrinsicHeight()) / 2;
            drawableMutate.setBounds(13, intrinsicHeight, drawableMutate.getIntrinsicWidth() + 13, drawableMutate.getIntrinsicHeight() + intrinsicHeight);
            drawableMutate.draw(canvas);
        }
        if (drawableMutate2 != null) {
            int width3 = (bitmapCreateBitmap.getWidth() - drawableMutate2.getIntrinsicWidth()) - 10;
            int intrinsicHeight2 = (120 - drawableMutate2.getIntrinsicHeight()) / 2;
            drawableMutate2.setBounds(width3, intrinsicHeight2, drawableMutate2.getIntrinsicWidth() + width3, drawableMutate2.getIntrinsicHeight() + intrinsicHeight2);
            drawableMutate2.draw(canvas);
        }
        d5VarArr[1].setBounds(161, 216, bitmapCreateBitmap.getWidth() - 20, 308);
        d5VarArr[1].n(0, 560, 522);
        d5VarArr[1].draw(canvas);
        d5VarArr[1].setBounds(161, 430, bitmapCreateBitmap.getWidth() - 20, 522);
        d5VarArr[1].n(430, 560, 522);
        d5VarArr[1].draw(canvas);
        d5VarArr[0].setBounds(20, 323, 399, 415);
        d5VarArr[0].n(323, 560, 522);
        d5VarArr[0].draw(canvas);
        paint.setColor(iF2);
        canvas.drawRect(0.0f, bitmapCreateBitmap.getHeight() - 120, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), paint);
        if (drawableMutate3 != null) {
            int intrinsicHeight3 = ((120 - drawableMutate3.getIntrinsicHeight()) / 2) + (bitmapCreateBitmap.getHeight() - 120);
            drawableMutate3.setBounds(22, intrinsicHeight3, drawableMutate3.getIntrinsicWidth() + 22, drawableMutate3.getIntrinsicHeight() + intrinsicHeight3);
            drawableMutate3.draw(canvas);
        }
        if (drawable2 != null) {
            int width4 = (bitmapCreateBitmap.getWidth() - drawable2.getIntrinsicWidth()) - 22;
            int intrinsicHeight4 = ((120 - drawable2.getIntrinsicHeight()) / 2) + (bitmapCreateBitmap.getHeight() - 120);
            drawable2.setBounds(width4, intrinsicHeight4, drawable2.getIntrinsicWidth() + width4, drawable2.getIntrinsicHeight() + intrinsicHeight4);
            drawable2.draw(canvas);
        }
        super(bitmapCreateBitmap);
    }
}
