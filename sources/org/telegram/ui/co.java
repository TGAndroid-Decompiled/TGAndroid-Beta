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
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class co extends Drawable {
    public final boolean f36710a;
    public View f36711b;
    public int f36712c = 255;
    public final float d;
    public final ai.m4 f36713e;
    public final org.telegram.ui.Components.cd0 f36714f;
    public final TLRPC.WallPaper f36715g;
    public boolean h;
    public boolean f36716i;
    public final ArrayList f36717j;

    public co(TLRPC.WallPaper wallPaper, boolean z10, boolean z11) {
        TLRPC.WallPaperSettings wallPaperSettings;
        String o9;
        TLRPC.WallPaperSettings wallPaperSettings2;
        ai.m4 m4Var = new ai.m4(this, 3);
        this.f36713e = m4Var;
        this.f36717j = new ArrayList();
        m4Var.setInvalidateAll(true);
        boolean z12 = wallPaper.pattern;
        this.f36715g = wallPaper;
        this.f36710a = z10;
        if (z10 && ((wallPaper.document != null || wallPaper.uploadingImage != null) && !z12 && (wallPaperSettings2 = wallPaper.settings) != null)) {
            this.d = wallPaperSettings2.intensity / 100.0f;
        }
        if ((z12 || wallPaper.document == null) && (wallPaperSettings = wallPaper.settings) != null && wallPaperSettings.second_background_color != 0 && wallPaperSettings.third_background_color != 0) {
            org.telegram.ui.Components.cd0 cd0Var = new org.telegram.ui.Components.cd0();
            this.f36714f = cd0Var;
            TLRPC.WallPaperSettings wallPaperSettings3 = wallPaper.settings;
            cd0Var.n(wallPaperSettings3.background_color, wallPaperSettings3.second_background_color, wallPaperSettings3.third_background_color, wallPaperSettings3.fourth_background_color);
            int i10 = UserConfig.selectedAccount;
            long j3 = wallPaper.f20190id;
            pc pcVar = new pc(14, this, wallPaper);
            int[] iArr = org.telegram.ui.ActionBar.c4.h;
            boolean z13 = wallPaper.pattern;
            ChatThemeController.getInstance(i10).loadWallpaperBitmap(j3, z13 ? 1 : 0, new org.telegram.ui.ActionBar.a4(pcVar, wallPaper, z13 ? 1 : 0, i10, j3));
            return;
        }
        Point point = AndroidUtilities.displaySize;
        int min = Math.min(point.x, point.y);
        Point point2 = AndroidUtilities.displaySize;
        int max = Math.max(point2.x, point2.y);
        if (z11) {
            o9 = "150_150_wallpaper";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append((int) (min / AndroidUtilities.density));
            sb2.append("_");
            o9 = a1.g.o((int) (max / AndroidUtilities.density), "_wallpaper", sb2);
        }
        StringBuilder v = a1.g.v(o9);
        v.append(wallPaper.f20190id);
        StringBuilder v9 = a1.g.v(v.toString());
        v9.append(e(wallPaper.settings));
        String sb3 = v9.toString();
        Drawable b10 = b(wallPaper);
        String str = wallPaper.uploadingImage;
        if (str != null) {
            m4Var.setImage(ImageLocation.getForPath(str), sb3, b10, null, wallPaper, 1);
            return;
        }
        TLRPC.Document document = wallPaper.document;
        if (document != null) {
            m4Var.setImage(ImageLocation.getForDocument(document), sb3, b10, null, wallPaper, 1);
        } else {
            m4Var.setImageBitmap(b10);
        }
    }

    public static BitmapDrawable a(Drawable drawable) {
        Bitmap createBitmap = Bitmap.createBitmap(20, 20, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, 20, 20);
        drawable.draw(canvas);
        return new BitmapDrawable(createBitmap);
    }

    public static Drawable b(TLRPC.WallPaper wallPaper) {
        BitmapDrawable a2;
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
        int i10 = 0;
        if (wallPaper.document != null) {
            a2 = null;
            while (i10 < wallPaper.document.thumbs.size()) {
                if (wallPaper.document.thumbs.get(i10) instanceof TLRPC.TL_photoStrippedSize) {
                    a2 = new BitmapDrawable(ImageLoader.getStrippedPhotoBitmap(wallPaper.document.thumbs.get(i10).bytes, "b"));
                }
                i10++;
            }
        } else {
            TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
            if (wallPaperSettings != null && wallPaperSettings.intensity >= 0) {
                if (wallPaperSettings.second_background_color == 0) {
                    a2 = a(new ColorDrawable(i0.a.k(wallPaper.settings.background_color, 255)));
                } else if (wallPaperSettings.third_background_color == 0) {
                    a2 = a(new GradientDrawable(org.telegram.ui.Components.x9.d(wallPaper.settings.rotation), new int[]{i0.a.k(wallPaperSettings.background_color, 255), i0.a.k(wallPaper.settings.second_background_color, 255)}));
                } else {
                    int k10 = i0.a.k(wallPaperSettings.background_color, 255);
                    int k11 = i0.a.k(wallPaper.settings.second_background_color, 255);
                    int k12 = i0.a.k(wallPaper.settings.third_background_color, 255);
                    int i11 = wallPaper.settings.fourth_background_color;
                    if (i11 != 0) {
                        i10 = i0.a.k(i11, 255);
                    }
                    org.telegram.ui.Components.cd0 cd0Var = new org.telegram.ui.Components.cd0();
                    cd0Var.n(k10, k11, k12, i10);
                    a2 = new BitmapDrawable(cd0Var.f25341k);
                }
            } else {
                a2 = a(new ColorDrawable(-16777216));
            }
        }
        wallPaper.thumbDrawable = a2;
        return a2;
    }

    public static co d(Drawable drawable, TLRPC.WallPaper wallPaper, boolean z10) {
        TLRPC.WallPaperSettings wallPaperSettings;
        TLRPC.WallPaperSettings wallPaperSettings2;
        if (drawable instanceof co) {
            co coVar = (co) drawable;
            boolean z11 = coVar.f36710a;
            TLRPC.WallPaper wallPaper2 = coVar.f36715g;
            String str = wallPaper.uploadingImage;
            if (str == null ? !(wallPaper.f20190id != wallPaper2.f20190id || !TextUtils.equals(e(wallPaper.settings), e(wallPaper2.settings)) || (wallPaper.document != null && !wallPaper.pattern && (wallPaperSettings = wallPaper.settings) != null && wallPaperSettings.intensity > 0 && z11 != z10)) : !(!str.equals(wallPaper2.uploadingImage) || ((wallPaperSettings2 = wallPaper.settings) != null && wallPaper2.settings != null && wallPaperSettings2.intensity > 0 && z11 != z10))) {
                return coVar;
            }
        }
        return new co(wallPaper, z10, false);
    }

    public static String e(TLRPC.WallPaperSettings wallPaperSettings) {
        if (wallPaperSettings == null) {
            return "";
        }
        return String.valueOf(Objects.hash(Boolean.valueOf(wallPaperSettings.blur), Boolean.valueOf(wallPaperSettings.motion), Integer.valueOf(wallPaperSettings.intensity), Integer.valueOf(wallPaperSettings.background_color), Integer.valueOf(wallPaperSettings.second_background_color), Integer.valueOf(wallPaperSettings.third_background_color), Integer.valueOf(wallPaperSettings.fourth_background_color)));
    }

    public final Drawable c(boolean z10) {
        org.telegram.ui.Components.cd0 cd0Var = this.f36714f;
        if (cd0Var != null) {
            return cd0Var;
        }
        ai.m4 m4Var = this.f36713e;
        if (z10 && m4Var.getStaticThumb() != null) {
            return m4Var.getStaticThumb();
        }
        if (m4Var.getThumb() != null) {
            return m4Var.getThumb();
        }
        if (m4Var.getDrawable() != null) {
            return m4Var.getDrawable();
        }
        return m4Var.getStaticThumb();
    }

    @Override
    public final void draw(Canvas canvas) {
        org.telegram.ui.Components.cd0 cd0Var = this.f36714f;
        if (cd0Var != null) {
            cd0Var.setBounds(getBounds());
            cd0Var.setAlpha(this.f36712c);
            cd0Var.draw(canvas);
            return;
        }
        ai.m4 m4Var = this.f36713e;
        boolean hasImageLoaded = m4Var.hasImageLoaded();
        float f7 = this.d;
        boolean z10 = true;
        if (hasImageLoaded && m4Var.getCurrentAlpha() == 1.0f) {
            if (!this.h) {
                this.h = true;
                m4Var.setColorFilter(new PorterDuffColorFilter(i0.a.k(-16777216, (int) (f7 * 255.0f)), PorterDuff.Mode.DARKEN));
            }
            z10 = false;
        }
        m4Var.setImageCoords(getBounds());
        m4Var.setAlpha(this.f36712c / 255.0f);
        m4Var.draw(canvas);
        if (z10 && f7 != 0.0f) {
            canvas.drawColor(i0.a.k(-16777216, (int) (f7 * 255.0f)));
        }
    }

    public final void f(View view) {
        ArrayList arrayList = this.f36717j;
        if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
        int size = arrayList.size();
        ai.m4 m4Var = this.f36713e;
        if (size > 0 && !this.f36716i) {
            this.f36716i = true;
            m4Var.onAttachedToWindow();
        } else if (arrayList.size() <= 0 && this.f36716i) {
            this.f36716i = false;
            m4Var.onDetachedFromWindow();
        }
        org.telegram.ui.Components.cd0 cd0Var = this.f36714f;
        if (cd0Var != null) {
            cd0Var.k();
        }
    }

    public final void g(View view) {
        ArrayList arrayList = this.f36717j;
        if (!arrayList.contains(view)) {
            arrayList.remove(view);
        }
        int size = arrayList.size();
        ai.m4 m4Var = this.f36713e;
        if (size > 0 && !this.f36716i) {
            this.f36716i = true;
            m4Var.onAttachedToWindow();
        } else if (arrayList.size() <= 0 && this.f36716i) {
            this.f36716i = false;
            m4Var.onDetachedFromWindow();
        }
        org.telegram.ui.Components.cd0 cd0Var = this.f36714f;
        if (cd0Var != null) {
            cd0Var.l();
        }
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i10) {
        if (this.f36712c != i10) {
            this.f36712c = i10;
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
