package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.core.graphics.ColorUtils;
import com.google.android.exoplayer2.util.Log;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.EmojiThemes;
import org.telegram.ui.ActionBar.EmojiThemes$$ExternalSyntheticLambda1;
import org.telegram.ui.Components.BackgroundGradientDrawable;
import org.telegram.ui.Components.MotionBackgroundDrawable;

public final class ChatBackgroundDrawable extends Drawable {
    public int alpha = 255;
    public boolean attached;
    public final ArrayList attachedViews;
    public boolean colorFilterSetted;
    public final float dimAmount;
    public final PhotoViewer.AnonymousClass11 imageReceiver;
    public final MotionBackgroundDrawable motionBackgroundDrawable;
    public View parent;
    public final boolean themeIsDark;
    public final TLRPC.WallPaper wallpaper;

    public ChatBackgroundDrawable(TLRPC.WallPaper wallPaper, boolean z, boolean z2) {
        TLRPC.WallPaperSettings wallPaperSettings;
        String strM;
        TLRPC.WallPaperSettings wallPaperSettings2;
        PhotoViewer.AnonymousClass11 anonymousClass11 = new PhotoViewer.AnonymousClass11(this, 3);
        this.imageReceiver = anonymousClass11;
        this.attachedViews = new ArrayList();
        anonymousClass11.setInvalidateAll(true);
        boolean z3 = wallPaper.pattern;
        this.wallpaper = wallPaper;
        this.themeIsDark = z;
        if (z && ((wallPaper.document != null || wallPaper.uploadingImage != null) && !z3 && (wallPaperSettings2 = wallPaper.settings) != null)) {
            this.dimAmount = wallPaperSettings2.intensity / 100.0f;
        }
        if ((z3 || wallPaper.document == null) && (wallPaperSettings = wallPaper.settings) != null && wallPaperSettings.second_background_color != 0 && wallPaperSettings.third_background_color != 0) {
            MotionBackgroundDrawable motionBackgroundDrawable = new MotionBackgroundDrawable();
            this.motionBackgroundDrawable = motionBackgroundDrawable;
            TLRPC.WallPaperSettings wallPaperSettings3 = wallPaper.settings;
            motionBackgroundDrawable.setColors(wallPaperSettings3.background_color, wallPaperSettings3.second_background_color, wallPaperSettings3.third_background_color, wallPaperSettings3.fourth_background_color, 0, true);
            int i = UserConfig.selectedAccount;
            long j = wallPaper.id;
            ArticleViewer$$ExternalSyntheticLambda21 articleViewer$$ExternalSyntheticLambda21 = new ArticleViewer$$ExternalSyntheticLambda21(20, this, wallPaper);
            int[] iArr = EmojiThemes.previewColorKeys;
            boolean z4 = wallPaper.pattern;
            ChatThemeController.getInstance(i).loadWallpaperBitmap(j, z4 ? 1 : 0, new EmojiThemes$$ExternalSyntheticLambda1(articleViewer$$ExternalSyntheticLambda21, wallPaper, z4 ? 1 : 0, i, j));
            return;
        }
        Point point = AndroidUtilities.displaySize;
        int iMin = Math.min(point.x, point.y);
        Point point2 = AndroidUtilities.displaySize;
        int iMax = Math.max(point2.x, point2.y);
        if (z2) {
            strM = "150_150_wallpaper";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append((int) (iMin / AndroidUtilities.density));
            sb.append("_");
            strM = SurfaceContainer$$ExternalSyntheticOutline0.m((int) (iMax / AndroidUtilities.density), "_wallpaper", sb);
        }
        StringBuilder sbM = Log.m(strM);
        sbM.append(wallPaper.id);
        StringBuilder sbM2 = Log.m(sbM.toString());
        sbM2.append(hash(wallPaper.settings));
        String string = sbM2.toString();
        Drawable drawableCreateThumb = createThumb(wallPaper);
        String str = wallPaper.uploadingImage;
        if (str != null) {
            anonymousClass11.setImage(ImageLocation.getForPath(str), string, drawableCreateThumb, null, wallPaper, 1);
            return;
        }
        TLRPC.Document document = wallPaper.document;
        if (document != null) {
            anonymousClass11.setImage(ImageLocation.getForDocument(document), string, drawableCreateThumb, null, wallPaper, 1);
        } else {
            anonymousClass11.setImageBitmap(drawableCreateThumb);
        }
    }

    public static Drawable createThumb(TLRPC.WallPaper wallPaper) {
        BitmapDrawable bitmapDrawable;
        Drawable drawable = wallPaper.thumbDrawable;
        if (drawable != null) {
            return drawable;
        }
        if (wallPaper.stripedThumb != null) {
            return new BitmapDrawable(wallPaper.stripedThumb);
        }
        if (wallPaper.pattern && wallPaper.settings == null) {
            return new ColorDrawable(-16777216);
        }
        if (wallPaper.document != null) {
            bitmapDrawable = null;
            for (int i = 0; i < wallPaper.document.thumbs.size(); i++) {
                if (wallPaper.document.thumbs.get(i) instanceof TLRPC.TL_photoStrippedSize) {
                    bitmapDrawable = new BitmapDrawable(ImageLoader.getStrippedPhotoBitmap(wallPaper.document.thumbs.get(i).bytes, "b"));
                }
            }
        } else {
            TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
            if (wallPaperSettings == null || wallPaperSettings.intensity < 0) {
                ColorDrawable colorDrawable = new ColorDrawable(-16777216);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(20, 20, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                colorDrawable.setBounds(0, 0, 20, 20);
                colorDrawable.draw(canvas);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            } else if (wallPaperSettings.second_background_color == 0) {
                ColorDrawable colorDrawable2 = new ColorDrawable(ColorUtils.setAlphaComponent(wallPaper.settings.background_color, 255));
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(20, 20, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                colorDrawable2.setBounds(0, 0, 20, 20);
                colorDrawable2.draw(canvas2);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap2);
            } else if (wallPaperSettings.third_background_color == 0) {
                GradientDrawable gradientDrawable = new GradientDrawable(BackgroundGradientDrawable.getGradientOrientation(wallPaper.settings.rotation), new int[]{ColorUtils.setAlphaComponent(wallPaperSettings.background_color, 255), ColorUtils.setAlphaComponent(wallPaper.settings.second_background_color, 255)});
                Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(20, 20, Bitmap.Config.ARGB_8888);
                Canvas canvas3 = new Canvas(bitmapCreateBitmap3);
                gradientDrawable.setBounds(0, 0, 20, 20);
                gradientDrawable.draw(canvas3);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap3);
            } else {
                int alphaComponent = ColorUtils.setAlphaComponent(wallPaperSettings.background_color, 255);
                int alphaComponent2 = ColorUtils.setAlphaComponent(wallPaper.settings.second_background_color, 255);
                int alphaComponent3 = ColorUtils.setAlphaComponent(wallPaper.settings.third_background_color, 255);
                int i2 = wallPaper.settings.fourth_background_color;
                int alphaComponent4 = i2 == 0 ? 0 : ColorUtils.setAlphaComponent(i2, 255);
                MotionBackgroundDrawable motionBackgroundDrawable = new MotionBackgroundDrawable();
                motionBackgroundDrawable.setColors(alphaComponent, alphaComponent2, alphaComponent3, alphaComponent4, 0, true);
                bitmapDrawable = new BitmapDrawable(motionBackgroundDrawable.currentBitmap);
            }
        }
        wallPaper.thumbDrawable = bitmapDrawable;
        return bitmapDrawable;
    }

    public static ChatBackgroundDrawable getOrCreate(Drawable drawable, TLRPC.WallPaper wallPaper, boolean z) {
        TLRPC.WallPaperSettings wallPaperSettings;
        TLRPC.WallPaperSettings wallPaperSettings2;
        if (drawable instanceof ChatBackgroundDrawable) {
            ChatBackgroundDrawable chatBackgroundDrawable = (ChatBackgroundDrawable) drawable;
            String str = wallPaper.uploadingImage;
            if (str != null) {
                if (str.equals(chatBackgroundDrawable.wallpaper.uploadingImage) && ((wallPaperSettings2 = wallPaper.settings) == null || chatBackgroundDrawable.wallpaper.settings == null || wallPaperSettings2.intensity <= 0 || chatBackgroundDrawable.themeIsDark == z)) {
                    return chatBackgroundDrawable;
                }
            } else if (wallPaper.id == chatBackgroundDrawable.wallpaper.id && TextUtils.equals(hash(wallPaper.settings), hash(chatBackgroundDrawable.wallpaper.settings)) && (wallPaper.document == null || wallPaper.pattern || (wallPaperSettings = wallPaper.settings) == null || wallPaperSettings.intensity <= 0 || chatBackgroundDrawable.themeIsDark == z)) {
                return chatBackgroundDrawable;
            }
        }
        return new ChatBackgroundDrawable(wallPaper, z, false);
    }

    public static String hash(TLRPC.WallPaperSettings wallPaperSettings) {
        return wallPaperSettings == null ? "" : String.valueOf(Objects.hash(Boolean.valueOf(wallPaperSettings.blur), Boolean.valueOf(wallPaperSettings.motion), Integer.valueOf(wallPaperSettings.intensity), Integer.valueOf(wallPaperSettings.background_color), Integer.valueOf(wallPaperSettings.second_background_color), Integer.valueOf(wallPaperSettings.third_background_color), Integer.valueOf(wallPaperSettings.fourth_background_color)));
    }

    @Override
    public final void draw(Canvas canvas) {
        MotionBackgroundDrawable motionBackgroundDrawable = this.motionBackgroundDrawable;
        if (motionBackgroundDrawable != null) {
            motionBackgroundDrawable.setBounds(getBounds());
            motionBackgroundDrawable.setAlpha(this.alpha);
            motionBackgroundDrawable.draw(canvas);
            return;
        }
        PhotoViewer.AnonymousClass11 anonymousClass11 = this.imageReceiver;
        boolean zHasImageLoaded = anonymousClass11.hasImageLoaded();
        float f = this.dimAmount;
        boolean z = true;
        if (zHasImageLoaded && anonymousClass11.getCurrentAlpha() == 1.0f) {
            if (!this.colorFilterSetted) {
                this.colorFilterSetted = true;
                anonymousClass11.setColorFilter(new PorterDuffColorFilter(ColorUtils.setAlphaComponent(-16777216, (int) (f * 255.0f)), PorterDuff.Mode.DARKEN));
            }
            z = false;
        }
        anonymousClass11.setImageCoords(getBounds());
        anonymousClass11.setAlpha(this.alpha / 255.0f);
        anonymousClass11.draw(canvas);
        if (!z || f == 0.0f) {
            return;
        }
        canvas.drawColor(ColorUtils.setAlphaComponent(-16777216, (int) (f * 255.0f)));
    }

    public final Drawable getDrawable(boolean z) {
        MotionBackgroundDrawable motionBackgroundDrawable = this.motionBackgroundDrawable;
        if (motionBackgroundDrawable != null) {
            return motionBackgroundDrawable;
        }
        PhotoViewer.AnonymousClass11 anonymousClass11 = this.imageReceiver;
        if (z && anonymousClass11.getStaticThumb() != null) {
            return anonymousClass11.getStaticThumb();
        }
        if (anonymousClass11.getThumb() != null) {
            return anonymousClass11.getThumb();
        }
        return anonymousClass11.getDrawable() != null ? anonymousClass11.getDrawable() : anonymousClass11.getStaticThumb();
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    public final void onAttachedToWindow(View view) {
        ArrayList arrayList = this.attachedViews;
        if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
        int size = arrayList.size();
        PhotoViewer.AnonymousClass11 anonymousClass11 = this.imageReceiver;
        if (size > 0 && !this.attached) {
            this.attached = true;
            anonymousClass11.onAttachedToWindow();
        } else if (arrayList.size() <= 0 && this.attached) {
            this.attached = false;
            anonymousClass11.onDetachedFromWindow();
        }
        MotionBackgroundDrawable motionBackgroundDrawable = this.motionBackgroundDrawable;
        if (motionBackgroundDrawable != null) {
            motionBackgroundDrawable.isAttached = true;
            ImageReceiver imageReceiver = motionBackgroundDrawable.giftImageReceiver;
            if (imageReceiver != null) {
                imageReceiver.onAttachedToWindow();
            }
        }
    }

    public final void onDetachedFromWindow(View view) {
        ArrayList arrayList = this.attachedViews;
        if (!arrayList.contains(view)) {
            arrayList.remove(view);
        }
        int size = arrayList.size();
        PhotoViewer.AnonymousClass11 anonymousClass11 = this.imageReceiver;
        if (size > 0 && !this.attached) {
            this.attached = true;
            anonymousClass11.onAttachedToWindow();
        } else if (arrayList.size() <= 0 && this.attached) {
            this.attached = false;
            anonymousClass11.onDetachedFromWindow();
        }
        MotionBackgroundDrawable motionBackgroundDrawable = this.motionBackgroundDrawable;
        if (motionBackgroundDrawable != null) {
            motionBackgroundDrawable.isAttached = false;
            ImageReceiver imageReceiver = motionBackgroundDrawable.giftImageReceiver;
            if (imageReceiver != null) {
                imageReceiver.onDetachedFromWindow();
            }
        }
    }

    @Override
    public final void setAlpha(int i) {
        if (this.alpha != i) {
            this.alpha = i;
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
