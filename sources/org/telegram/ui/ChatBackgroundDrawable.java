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
import androidx.core.graphics.ColorUtils;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.wallpaper.WallpaperBitmapHolder;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.EmojiThemes;
import org.telegram.ui.Components.BackgroundGradientDrawable;
import org.telegram.ui.Components.MotionBackgroundDrawable;

public class ChatBackgroundDrawable extends Drawable {
    private boolean attached;
    private boolean colorFilterSetted;
    float dimAmount;
    boolean isPattern;
    MotionBackgroundDrawable motionBackgroundDrawable;
    View parent;
    private final boolean themeIsDark;
    final TLRPC.WallPaper wallpaper;
    int alpha = 255;
    ImageReceiver imageReceiver = new ImageReceiver() {
        @Override
        public void invalidate() {
            View view = ChatBackgroundDrawable.this.parent;
            if (view != null) {
                view.invalidate();
            }
        }
    };
    private final ArrayList attachedViews = new ArrayList();

    @Override
    public int getOpacity() {
        return 0;
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public static Drawable getOrCreate(Drawable drawable, TLRPC.WallPaper wallPaper, boolean z) {
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

    public void setParent(View view) {
        this.parent = view;
        MotionBackgroundDrawable motionBackgroundDrawable = this.motionBackgroundDrawable;
        if (motionBackgroundDrawable != null) {
            motionBackgroundDrawable.setParentView(view);
        }
    }

    public ChatBackgroundDrawable(final TLRPC.WallPaper wallPaper, boolean z, boolean z2) {
        TLRPC.WallPaperSettings wallPaperSettings;
        String str;
        TLRPC.WallPaperSettings wallPaperSettings2;
        this.imageReceiver.setInvalidateAll(true);
        boolean z3 = wallPaper.pattern;
        this.isPattern = z3;
        this.wallpaper = wallPaper;
        this.themeIsDark = z;
        if (z && ((wallPaper.document != null || wallPaper.uploadingImage != null) && !z3 && (wallPaperSettings2 = wallPaper.settings) != null)) {
            this.dimAmount = wallPaperSettings2.intensity / 100.0f;
        }
        if ((z3 || wallPaper.document == null) && (wallPaperSettings = wallPaper.settings) != null && wallPaperSettings.second_background_color != 0 && wallPaperSettings.third_background_color != 0) {
            MotionBackgroundDrawable motionBackgroundDrawable = new MotionBackgroundDrawable();
            this.motionBackgroundDrawable = motionBackgroundDrawable;
            TLRPC.WallPaperSettings wallPaperSettings3 = wallPaper.settings;
            motionBackgroundDrawable.setColors(wallPaperSettings3.background_color, wallPaperSettings3.second_background_color, wallPaperSettings3.third_background_color, wallPaperSettings3.fourth_background_color);
            EmojiThemes.loadWallpaperImage(UserConfig.selectedAccount, wallPaper.id, wallPaper, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    this.f$0.lambda$new$0(wallPaper, (WallpaperBitmapHolder) obj);
                }
            });
            return;
        }
        Point point = AndroidUtilities.displaySize;
        int iMin = Math.min(point.x, point.y);
        Point point2 = AndroidUtilities.displaySize;
        int iMax = Math.max(point2.x, point2.y);
        if (z2) {
            str = "150_150_wallpaper";
        } else {
            str = ((int) (iMin / AndroidUtilities.density)) + "_" + ((int) (iMax / AndroidUtilities.density)) + "_wallpaper";
        }
        String str2 = (str + wallPaper.id) + hash(wallPaper.settings);
        Drawable drawableCreateThumb = createThumb(wallPaper);
        String str3 = wallPaper.uploadingImage;
        if (str3 != null) {
            this.imageReceiver.setImage(ImageLocation.getForPath(str3), str2, drawableCreateThumb, null, wallPaper, 1);
            return;
        }
        TLRPC.Document document = wallPaper.document;
        if (document != null) {
            this.imageReceiver.setImage(ImageLocation.getForDocument(document), str2, drawableCreateThumb, null, wallPaper, 1);
        } else {
            this.imageReceiver.setImageBitmap(drawableCreateThumb);
        }
    }

    public void lambda$new$0(TLRPC.WallPaper wallPaper, WallpaperBitmapHolder wallpaperBitmapHolder) {
        this.motionBackgroundDrawable.setPatternBitmap(wallPaper.settings.intensity, wallpaperBitmapHolder.bitmap);
        View view = this.parent;
        if (view != null) {
            view.invalidate();
        }
    }

    public static Drawable createThumb(TLRPC.WallPaper wallPaper) {
        Drawable drawableBitmapDrawableOf;
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
            drawableBitmapDrawableOf = null;
            for (int alphaComponent = 0; alphaComponent < wallPaper.document.thumbs.size(); alphaComponent++) {
                if (wallPaper.document.thumbs.get(alphaComponent) instanceof TLRPC.TL_photoStrippedSize) {
                    drawableBitmapDrawableOf = new BitmapDrawable(ImageLoader.getStrippedPhotoBitmap(wallPaper.document.thumbs.get(alphaComponent).bytes, "b"));
                }
            }
        } else {
            TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
            if (wallPaperSettings == null || wallPaperSettings.intensity < 0) {
                drawableBitmapDrawableOf = bitmapDrawableOf(new ColorDrawable(-16777216));
            } else if (wallPaperSettings.second_background_color == 0) {
                drawableBitmapDrawableOf = bitmapDrawableOf(new ColorDrawable(ColorUtils.setAlphaComponent(wallPaper.settings.background_color, 255)));
            } else if (wallPaperSettings.third_background_color == 0) {
                drawableBitmapDrawableOf = bitmapDrawableOf(new GradientDrawable(BackgroundGradientDrawable.getGradientOrientation(wallPaper.settings.rotation), new int[]{ColorUtils.setAlphaComponent(wallPaperSettings.background_color, 255), ColorUtils.setAlphaComponent(wallPaper.settings.second_background_color, 255)}));
            } else {
                int alphaComponent2 = ColorUtils.setAlphaComponent(wallPaperSettings.background_color, 255);
                int alphaComponent3 = ColorUtils.setAlphaComponent(wallPaper.settings.second_background_color, 255);
                int alphaComponent4 = ColorUtils.setAlphaComponent(wallPaper.settings.third_background_color, 255);
                int i = wallPaper.settings.fourth_background_color;
                alphaComponent = i != 0 ? ColorUtils.setAlphaComponent(i, 255) : 0;
                MotionBackgroundDrawable motionBackgroundDrawable = new MotionBackgroundDrawable();
                motionBackgroundDrawable.setColors(alphaComponent2, alphaComponent3, alphaComponent4, alphaComponent);
                drawableBitmapDrawableOf = new BitmapDrawable(motionBackgroundDrawable.getBitmap());
            }
        }
        wallPaper.thumbDrawable = drawableBitmapDrawableOf;
        return drawableBitmapDrawableOf;
    }

    private static Drawable bitmapDrawableOf(Drawable drawable) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(20, 20, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, 20, 20);
        drawable.draw(canvas);
        return new BitmapDrawable(bitmapCreateBitmap);
    }

    @Override
    public void draw(Canvas canvas) {
        MotionBackgroundDrawable motionBackgroundDrawable = this.motionBackgroundDrawable;
        if (motionBackgroundDrawable != null) {
            motionBackgroundDrawable.setBounds(getBounds());
            this.motionBackgroundDrawable.setAlpha(this.alpha);
            this.motionBackgroundDrawable.draw(canvas);
            return;
        }
        boolean z = true;
        if (this.imageReceiver.hasImageLoaded() && this.imageReceiver.getCurrentAlpha() == 1.0f) {
            if (!this.colorFilterSetted) {
                this.colorFilterSetted = true;
                this.imageReceiver.setColorFilter(new PorterDuffColorFilter(ColorUtils.setAlphaComponent(-16777216, (int) (this.dimAmount * 255.0f)), PorterDuff.Mode.DARKEN));
            }
            z = false;
        }
        this.imageReceiver.setImageCoords(getBounds());
        this.imageReceiver.setAlpha(this.alpha / 255.0f);
        this.imageReceiver.draw(canvas);
        if (z) {
            float f = this.dimAmount;
            if (f != 0.0f) {
                canvas.drawColor(ColorUtils.setAlphaComponent(-16777216, (int) (f * 255.0f)));
            }
        }
    }

    public float getDimAmount() {
        if (this.motionBackgroundDrawable == null) {
            return this.dimAmount;
        }
        return 0.0f;
    }

    @Override
    public void setAlpha(int i) {
        if (this.alpha != i) {
            this.alpha = i;
            invalidateSelf();
        }
    }

    private boolean isAttached() {
        return this.attachedViews.size() > 0;
    }

    public void onAttachedToWindow(View view) {
        if (!this.attachedViews.contains(view)) {
            this.attachedViews.add(view);
        }
        if (isAttached() && !this.attached) {
            this.attached = true;
            this.imageReceiver.onAttachedToWindow();
        } else if (!isAttached() && this.attached) {
            this.attached = false;
            this.imageReceiver.onDetachedFromWindow();
        }
        MotionBackgroundDrawable motionBackgroundDrawable = this.motionBackgroundDrawable;
        if (motionBackgroundDrawable != null) {
            motionBackgroundDrawable.onAttachedToWindow();
        }
    }

    public void onDetachedFromWindow(View view) {
        if (!this.attachedViews.contains(view)) {
            this.attachedViews.remove(view);
        }
        if (isAttached() && !this.attached) {
            this.attached = true;
            this.imageReceiver.onAttachedToWindow();
        } else if (!isAttached() && this.attached) {
            this.attached = false;
            this.imageReceiver.onDetachedFromWindow();
        }
        MotionBackgroundDrawable motionBackgroundDrawable = this.motionBackgroundDrawable;
        if (motionBackgroundDrawable != null) {
            motionBackgroundDrawable.onDetachedFromWindow();
        }
    }

    public Drawable getDrawable(boolean z) {
        MotionBackgroundDrawable motionBackgroundDrawable = this.motionBackgroundDrawable;
        if (motionBackgroundDrawable != null) {
            return motionBackgroundDrawable;
        }
        if (z && this.imageReceiver.getStaticThumb() != null) {
            return this.imageReceiver.getStaticThumb();
        }
        if (this.imageReceiver.getThumb() != null) {
            return this.imageReceiver.getThumb();
        }
        if (this.imageReceiver.getDrawable() != null) {
            return this.imageReceiver.getDrawable();
        }
        return this.imageReceiver.getStaticThumb();
    }

    public static String hash(TLRPC.WallPaperSettings wallPaperSettings) {
        return wallPaperSettings == null ? "" : String.valueOf(Objects.hash(Boolean.valueOf(wallPaperSettings.blur), Boolean.valueOf(wallPaperSettings.motion), Integer.valueOf(wallPaperSettings.intensity), Integer.valueOf(wallPaperSettings.background_color), Integer.valueOf(wallPaperSettings.second_background_color), Integer.valueOf(wallPaperSettings.third_background_color), Integer.valueOf(wallPaperSettings.fourth_background_color)));
    }
}
