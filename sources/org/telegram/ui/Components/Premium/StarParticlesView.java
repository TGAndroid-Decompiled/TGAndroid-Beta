package org.telegram.ui.Components.Premium;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DiffUtil;
import com.google.android.gms.internal.mlkit_vision_label.zzcw;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.DialogCell$$ExternalSyntheticLambda6;
import org.telegram.ui.GLIconSettingsView;

public class StarParticlesView extends View {
    public LinearGradient clipGradient;
    public Matrix clipGradientMatrix;
    public Paint clipGradientPaint;
    public Drawable drawable;
    public boolean isLiteModeParticlesAllowed;
    public DialogCell$$ExternalSyntheticLambda6 powerSaverCallback;
    public int size;

    public class Drawable {
        public final int count;
        public boolean distributionAlgorithm;
        public Utilities.CallbackReturn getPaint;
        public int lastColor;
        public Matrix[] matrices;
        public boolean paused;
        public long pausedTime;
        public float[][] points;
        public int[] pointsCount;
        public long prevTime;
        public Theme.ResourcesProvider resourcesProvider;
        public float[] rotationAngles;
        public boolean startFromCenter;
        public boolean useGradient;
        public boolean useRotate;
        public boolean useScale;
        public final RectF rect = new RectF();
        public final RectF rect2 = new RectF();
        public final RectF excludeRect = new RectF();
        public Bitmap[] stars = new Bitmap[3];
        public boolean[] svg = new boolean[3];
        public boolean[] flip = new boolean[3];
        public final Paint paint = new Paint();
        public float excludeRadius = 0.0f;
        public float centerOffsetY = 0.0f;
        public final ArrayList particles = new ArrayList();
        public float speedScale = 1.0f;
        public int size1 = 14;
        public int size2 = 12;
        public int size3 = 10;
        public float k1 = 0.85f;
        public float k2 = 0.85f;
        public float k3 = 0.9f;
        public long minLifeTime = 2000;
        public int randLifeTime = 1000;
        public final float dt = 1000.0f / AndroidUtilities.screenRefreshRate;
        public boolean checkBounds = false;
        public boolean checkTime = true;
        public boolean isCircle = true;
        public boolean useBlur = false;
        public boolean forceMaxAlpha = false;
        public boolean roundEffect = true;
        public int type = -1;
        public int colorKey = Theme.key_premiumStartSmallStarsColor;
        public int lastParticleI = 0;

        public final class Particle {
            public int alpha;
            public float drawingX;
            public float drawingY;
            public float flipProgress;
            public final int i;
            public float inProgress;
            public long lifeTime;
            public float randomRotate;
            public int starIndex;
            public float vecX;
            public float vecY;
            public float x;
            public float x2;
            public float y;
            public float y2;
            public float scale = 1.0f;
            public boolean first = true;

            public Particle() {
                int i = Drawable.this.lastParticleI;
                Drawable.this.lastParticleI = i + 1;
                this.i = i;
            }

            public final void draw(Canvas canvas, long j, float f) {
                float fClamp;
                Drawable drawable = Drawable.this;
                if (drawable.useRotate) {
                    int[] iArr = drawable.pointsCount;
                    int i = this.starIndex;
                    int i2 = iArr[i];
                    float[] fArr = drawable.points[i];
                    int i3 = i2 * 2;
                    this.drawingX = fArr[i3];
                    this.drawingY = fArr[i3 + 1];
                    iArr[i] = i2 + 1;
                } else {
                    this.drawingX = this.x;
                    this.drawingY = this.y;
                }
                RectF rectF = drawable.excludeRect;
                boolean zIsEmpty = rectF.isEmpty();
                float f2 = drawable.dt;
                if (zIsEmpty || !rectF.contains(this.drawingX, this.drawingY)) {
                    canvas.save();
                    canvas.translate(this.drawingX, this.drawingY);
                    float f3 = this.randomRotate;
                    if (f3 != 0.0f) {
                        canvas.rotate(f3, drawable.stars[this.starIndex].getWidth() / 2.0f, drawable.stars[this.starIndex].getHeight() / 2.0f);
                    }
                    if (drawable.checkTime) {
                        long j2 = this.lifeTime - j;
                        if (j2 < 200) {
                            fClamp = Utilities.clamp(1.0f - (j2 / 150.0f), 1.0f, 0.0f);
                        } else {
                            fClamp = 0.0f;
                        }
                    } else {
                        fClamp = 0.0f;
                    }
                    float f4 = this.inProgress;
                    if (f4 < 1.0f || GLIconSettingsView.smallStarsSize != 1.0f) {
                        float interpolation = AndroidUtilities.overshootInterpolator.getInterpolation(f4) * GLIconSettingsView.smallStarsSize;
                        canvas.scale(interpolation, interpolation, 0.0f, 0.0f);
                    }
                    if (drawable.flip[this.starIndex]) {
                        float fMin = (Math.min(drawable.speedScale, 3.5f) * (f2 / 1000.0f)) + this.flipProgress;
                        this.flipProgress = fMin;
                        canvas.scale((float) Math.cos(((double) fMin) * 3.141592653589793d), 1.0f, 0.0f, 0.0f);
                    }
                    Utilities.CallbackReturn callbackReturn = drawable.getPaint;
                    Paint paint = callbackReturn != null ? (Paint) callbackReturn.run(Integer.valueOf(this.i)) : drawable.paint;
                    float f5 = 1.0f - fClamp;
                    paint.setAlpha((int) (this.alpha * f5 * f));
                    Bitmap bitmap = drawable.stars[this.starIndex];
                    if (drawable.useScale) {
                        float f6 = this.scale * f5 * f * this.inProgress;
                        canvas.scale(f6, f6);
                    }
                    canvas.drawBitmap(bitmap, -(bitmap.getWidth() >> 1), -(bitmap.getHeight() >> 1), paint);
                    canvas.restore();
                }
                if (drawable.paused) {
                    return;
                }
                float fDp = (f2 / 660.0f) * AndroidUtilities.dp(4.0f);
                float fMin2 = drawable.flip[this.starIndex] ? Math.min(drawable.speedScale, 3.5f) * 4.0f * fDp : fDp * drawable.speedScale;
                this.x = (this.vecX * fMin2) + this.x;
                this.y = (this.vecY * fMin2) + this.y;
                float f7 = this.inProgress;
                if (f7 != 1.0f) {
                    float f8 = (f2 / 200.0f) + f7;
                    this.inProgress = f8;
                    if (f8 > 1.0f) {
                        this.inProgress = 1.0f;
                    }
                }
            }

            public final void genPosition(long j) {
                float f;
                float f2;
                float fDp;
                int i;
                float f3;
                float f4;
                Drawable drawable = Drawable.this;
                if (drawable.type == 28) {
                    float fNextFloat = Utilities.fastRandom.nextFloat();
                    if (fNextFloat < 0.13f) {
                        this.starIndex = 0;
                    } else {
                        this.starIndex = (int) Math.floor((fNextFloat * (drawable.stars.length - 2)) + 1.0f);
                    }
                } else {
                    this.starIndex = Math.abs(Utilities.fastRandom.nextInt() % drawable.stars.length);
                }
                this.lifeTime = j + drawable.minLifeTime + ((long) Utilities.fastRandom.nextInt(drawable.randLifeTime * (drawable.flip[this.starIndex] ? 3 : 1)));
                this.randomRotate = 0.0f;
                if (drawable.useScale) {
                    this.scale = (Utilities.fastRandom.nextFloat() * 0.6f) + 0.4f;
                }
                boolean z = drawable.distributionAlgorithm;
                RectF rectF = drawable.rect;
                if (z) {
                    float fAbs = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
                    float fAbs2 = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
                    float f5 = 0.0f;
                    for (int i2 = 0; i2 < 10; i2++) {
                        float fAbs3 = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
                        float fAbs4 = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
                        float f6 = 2.1474836E9f;
                        int i3 = 0;
                        while (true) {
                            ArrayList arrayList = drawable.particles;
                            if (i3 >= arrayList.size()) {
                                break;
                            }
                            if (drawable.startFromCenter) {
                                f3 = ((Particle) arrayList.get(i3)).x2 - fAbs3;
                                f4 = ((Particle) arrayList.get(i3)).y2;
                            } else {
                                f3 = ((Particle) arrayList.get(i3)).x - fAbs3;
                                f4 = ((Particle) arrayList.get(i3)).y;
                            }
                            float f7 = f4 - fAbs4;
                            float f8 = (f7 * f7) + (f3 * f3);
                            if (f8 < f6) {
                                f6 = f8;
                            }
                            i3++;
                        }
                        if (f6 > f5) {
                            f5 = f6;
                            fAbs = fAbs3;
                            fAbs2 = fAbs4;
                        }
                    }
                    f = 0.6f;
                    f2 = 0.0f;
                    this.x = fAbs;
                    this.y = fAbs2;
                } else {
                    f = 0.6f;
                    f2 = 0.0f;
                    if (drawable.isCircle) {
                        float fM = zzcw.m(Utilities.fastRandom, 1000) / 1000.0f;
                        float fWidth = rectF.width();
                        float f9 = drawable.excludeRadius;
                        float fM2 = DiffUtil.m(fWidth, f9, fM, f9);
                        float fM3 = zzcw.m(Utilities.fastRandom, 360);
                        if (!drawable.flip[this.starIndex] || this.first) {
                            fDp = 0.0f;
                        } else {
                            fM2 = Math.min(fM2, AndroidUtilities.dp(10.0f));
                            fDp = AndroidUtilities.dp(30.0f) + 0.0f;
                        }
                        double d = fM2;
                        double d2 = fM3;
                        this.x = rectF.centerX() + 0.0f + ((float) (Math.sin(Math.toRadians(d2)) * d));
                        this.y = rectF.centerY() + fDp + drawable.centerOffsetY + ((float) (Math.cos(Math.toRadians(d2)) * d));
                    } else {
                        this.x = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
                        this.y = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
                    }
                }
                if (drawable.flip[this.starIndex]) {
                    this.flipProgress = Math.abs(Utilities.fastRandom.nextFloat() * 2.0f);
                }
                double radians = drawable.flip[this.starIndex] ? Math.toRadians(280.0f - (Utilities.fastRandom.nextFloat() * 200.0f)) : drawable.startFromCenter ? Utilities.fastRandom.nextDouble() * 3.141592653589793d * 2.0d : Math.atan2(this.y - (rectF.centerY() + drawable.centerOffsetY), this.x - (rectF.centerX() + f2));
                this.vecX = (float) Math.cos(radians);
                this.vecY = (float) Math.sin(radians);
                if (drawable.svg[this.starIndex]) {
                    this.alpha = (int) (((Utilities.fastRandom.nextInt(50) + 50) / 100.0f) * 120.0f);
                } else {
                    this.alpha = (int) (((Utilities.fastRandom.nextInt(50) + 50) / 100.0f) * 255.0f);
                }
                int i4 = drawable.type;
                if ((i4 == 6 && ((i = this.starIndex) == 1 || i == 2)) || i4 == 9 || i4 == 3 || i4 == 7 || i4 == 24 || i4 == 11 || i4 == 22 || i4 == 4) {
                    this.randomRotate = (int) (((Utilities.fastRandom.nextInt() % 100) / 100.0f) * 45.0f);
                }
                if (drawable.type != 101) {
                    this.inProgress = 0.0f;
                }
                if (drawable.startFromCenter) {
                    float fMin = (Math.min(rectF.width(), rectF.height()) * ((Utilities.fastRandom.nextFloat() * 1.2f) + f)) / 2.0f;
                    float fCos = (((float) Math.cos(radians)) * fMin) + rectF.centerX() + 0.0f;
                    this.x = fCos;
                    this.x2 = fCos;
                    float fSin = (((float) Math.sin(radians)) * fMin) + rectF.centerY() + drawable.centerOffsetY;
                    this.y = fSin;
                    this.y2 = fSin;
                }
                this.first = false;
            }
        }

        public Drawable(int i) {
            this.count = i;
            this.distributionAlgorithm = i < 50;
        }

        public final void generateBitmaps() {
            int i;
            int iDp;
            int i2;
            Bitmap bitmapCreateBitmap;
            Canvas canvas;
            Path path;
            Paint paint;
            int i3;
            Canvas canvas2;
            int i4;
            Paint mainGradientPaint;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12 = 6;
            int i13 = 3;
            int i14 = 43;
            if (this.type == 43) {
                if (this.stars.length != 6) {
                    this.stars = new Bitmap[6];
                }
                if (this.svg.length != 6) {
                    this.svg = new boolean[6];
                }
                if (this.flip.length != 6) {
                    this.flip = new boolean[6];
                }
                i = 6;
            } else {
                i = 3;
            }
            int i15 = 0;
            int i16 = 0;
            while (i16 < i) {
                float f = this.k1;
                if (i16 == 0) {
                    iDp = AndroidUtilities.dp(this.size1);
                } else if (i16 == 1) {
                    f = this.k2;
                    iDp = AndroidUtilities.dp(this.size2);
                } else {
                    f = this.k3;
                    iDp = AndroidUtilities.dp(this.size3);
                }
                int i17 = iDp;
                int i18 = this.type;
                if (i18 == 9) {
                    if (i16 == 0) {
                        i11 = R.raw.premium_object_folder;
                    } else {
                        i11 = i16 == 1 ? R.raw.premium_object_bubble : R.raw.premium_object_settings;
                    }
                    this.stars[i16] = SvgHelper.getBitmap(i11, i17, i17, ColorUtils.setAlphaComponent(Theme.getColor(this.colorKey, this.resourcesProvider), 30));
                    this.svg[i16] = true;
                } else if (i18 == 27) {
                    if (i16 == 0) {
                        i10 = R.raw.filled_messages_paid;
                    } else {
                        i10 = i16 == 1 ? R.raw.filled_crown_on : R.raw.premium_object_star2;
                    }
                    this.stars[i16] = SvgHelper.getBitmap(i10, i17, i17, ColorUtils.setAlphaComponent(Theme.getColor(this.colorKey, this.resourcesProvider), 30));
                    this.svg[i16] = true;
                } else if (i18 == 11 || i18 == 4) {
                    if (i16 == 0) {
                        i2 = R.raw.premium_object_smile1;
                    } else {
                        i2 = i16 == 1 ? R.raw.premium_object_smile2 : R.raw.premium_object_like;
                    }
                    this.stars[i16] = SvgHelper.getBitmap(i2, i17, i17, ColorUtils.setAlphaComponent(Theme.getColor(this.colorKey, this.resourcesProvider), 30));
                    this.svg[i16] = true;
                } else if (i18 == 22) {
                    if (i16 == 0) {
                        i9 = R.raw.premium_object_user;
                    } else {
                        i9 = i16 == 1 ? R.raw.cache_photos : R.raw.cache_profile_photos;
                    }
                    this.stars[i16] = SvgHelper.getBitmap(i9, i17, i17, ColorUtils.setAlphaComponent(Theme.getColor(this.colorKey, this.resourcesProvider), 30));
                    this.svg[i16] = true;
                } else if (i18 == i13) {
                    if (i16 == 0) {
                        i8 = R.raw.premium_object_adsbubble;
                    } else {
                        i8 = i16 == 1 ? R.raw.premium_object_like : R.raw.premium_object_noads;
                    }
                    this.stars[i16] = SvgHelper.getBitmap(i8, i17, i17, ColorUtils.setAlphaComponent(Theme.getColor(this.colorKey, this.resourcesProvider), 30));
                    this.svg[i16] = true;
                } else if (i18 == 7) {
                    if (i16 == 0) {
                        i7 = R.raw.premium_object_video2;
                    } else {
                        i7 = i16 == 1 ? R.raw.premium_object_video : R.raw.premium_object_user;
                    }
                    this.stars[i16] = SvgHelper.getBitmap(i7, i17, i17, ColorUtils.setAlphaComponent(Theme.getColor(this.colorKey, this.resourcesProvider), 30));
                    this.svg[i16] = true;
                } else if (i18 == i14) {
                    if (i16 == 0) {
                        i6 = R.raw.premium_object_list;
                    } else if (i16 == 1) {
                        i6 = R.raw.premium_object_math;
                    } else if (i16 == 2) {
                        i6 = R.raw.premium_object_table;
                    } else if (i16 == i13) {
                        i6 = R.raw.premium_object_superscript;
                    } else {
                        i6 = i16 == 4 ? R.raw.premium_object_bold : R.raw.premium_object_code;
                    }
                    this.stars[i16] = SvgHelper.getBitmap(i6, i17, i17, ColorUtils.setAlphaComponent(Theme.getColor(this.colorKey, this.resourcesProvider), 30));
                    this.svg[i16] = true;
                } else if (i18 == 1001) {
                    this.stars[i16] = SvgHelper.getBitmap(R.raw.premium_object_fire, i17, i17, ColorUtils.setAlphaComponent(Theme.getColor(this.colorKey, this.resourcesProvider), 30));
                    this.svg[i16] = true;
                } else if (i18 == 1002) {
                    this.stars[i16] = SvgHelper.getBitmap(R.raw.premium_object_star2, i17, i17, ColorUtils.setAlphaComponent(Theme.getColor(this.colorKey, this.resourcesProvider), 30));
                    this.svg[i16] = true;
                } else if (i18 == 24) {
                    if (i16 == 0) {
                        i5 = R.raw.premium_object_tag;
                    } else {
                        i5 = i16 == 1 ? R.raw.premium_object_check : R.raw.premium_object_star;
                    }
                    this.stars[i16] = SvgHelper.getBitmap(i5, i17, i17, ColorUtils.setAlphaComponent(Theme.getColor(this.colorKey, this.resourcesProvider), 30));
                    this.svg[i16] = true;
                } else if (i18 == 28) {
                    if (i16 == 0) {
                        this.stars[i16] = SvgHelper.getBitmap(R.raw.filled_premium_dollar, i17, i17, ColorUtils.setAlphaComponent(Theme.getColor(this.colorKey, this.resourcesProvider), 255));
                        this.flip[i16] = true;
                    } else {
                        bitmapCreateBitmap = Bitmap.createBitmap(i17, i17, Bitmap.Config.ARGB_8888);
                        this.stars[i16] = bitmapCreateBitmap;
                        canvas = new Canvas(bitmapCreateBitmap);
                        if (this.type == i12 || !(i16 == 1 || i16 == 2)) {
                            path = new Path();
                            float f2 = i17 >> 1;
                            int i19 = (int) (f * f2);
                            path.moveTo(0.0f, f2);
                            float f3 = i19;
                            path.lineTo(f3, f3);
                            path.lineTo(f2, 0.0f);
                            float f4 = i17 - i19;
                            path.lineTo(f4, f3);
                            float f5 = i17;
                            path.lineTo(f5, f2);
                            path.lineTo(f4, f4);
                            path.lineTo(f2, f5);
                            path.lineTo(f3, f4);
                            path.lineTo(0.0f, f2);
                            path.close();
                            paint = new Paint();
                            if (this.useGradient) {
                                if (i17 >= AndroidUtilities.dp(10.0f)) {
                                    canvas2 = canvas;
                                    i3 = 2;
                                    i4 = 255;
                                    PremiumGradient.getInstance().mainGradient.gradientMatrix(0, i17 * (-2), 0, i17, 0.0f, i17);
                                } else {
                                    canvas2 = canvas;
                                    i4 = 255;
                                    i3 = 2;
                                    PremiumGradient.getInstance().mainGradient.gradientMatrix(0, i17 * (-4), 0, i17, 0.0f, i17);
                                }
                                mainGradientPaint = PremiumGradient.getInstance().getMainGradientPaint();
                                if (this.roundEffect) {
                                    mainGradientPaint.setPathEffect(new CornerPathEffect(AndroidUtilities.dpf2(this.size1 / 5.0f)));
                                }
                                if (this.forceMaxAlpha) {
                                    mainGradientPaint.setAlpha(i4);
                                } else if (this.useBlur) {
                                    mainGradientPaint.setAlpha(60);
                                } else {
                                    mainGradientPaint.setAlpha(120);
                                }
                                canvas2.drawPath(path, mainGradientPaint);
                                mainGradientPaint.setPathEffect(null);
                                mainGradientPaint.setAlpha(i4);
                            } else {
                                bitmapCreateBitmap = bitmapCreateBitmap;
                                i3 = 2;
                                paint.setColor(getPathColor());
                                if (this.roundEffect) {
                                    paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dpf2(this.size1 / 5.0f)));
                                }
                                canvas.drawPath(path, paint);
                            }
                            if (this.useBlur) {
                                Utilities.stackBlurBitmap(bitmapCreateBitmap, i3);
                            }
                        } else {
                            android.graphics.drawable.Drawable drawable = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_liststar);
                            drawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(this.colorKey, this.resourcesProvider), PorterDuff.Mode.MULTIPLY));
                            drawable.setBounds(i15, i15, i17, i17);
                            drawable.draw(canvas);
                        }
                    }
                } else if (i18 == 105 && i16 == 0) {
                    this.stars[i16] = SvgHelper.getBitmap(R.raw.premium_object_star2, i17, i17, getPathColor());
                } else {
                    bitmapCreateBitmap = Bitmap.createBitmap(i17, i17, Bitmap.Config.ARGB_8888);
                    this.stars[i16] = bitmapCreateBitmap;
                    canvas = new Canvas(bitmapCreateBitmap);
                    if (this.type == i12) {
                        path = new Path();
                        float f6 = i17 >> 1;
                        int i110 = (int) (f * f6);
                        path.moveTo(0.0f, f6);
                        float f7 = i110;
                        path.lineTo(f7, f7);
                        path.lineTo(f6, 0.0f);
                        float f8 = i17 - i110;
                        path.lineTo(f8, f7);
                        float f9 = i17;
                        path.lineTo(f9, f6);
                        path.lineTo(f8, f8);
                        path.lineTo(f6, f9);
                        path.lineTo(f7, f8);
                        path.lineTo(0.0f, f6);
                        path.close();
                        paint = new Paint();
                        if (this.useGradient) {
                            if (i17 >= AndroidUtilities.dp(10.0f)) {
                                canvas2 = canvas;
                                i3 = 2;
                                i4 = 255;
                                PremiumGradient.getInstance().mainGradient.gradientMatrix(0, i17 * (-2), 0, i17, 0.0f, i17);
                            } else {
                                canvas2 = canvas;
                                i4 = 255;
                                i3 = 2;
                                PremiumGradient.getInstance().mainGradient.gradientMatrix(0, i17 * (-4), 0, i17, 0.0f, i17);
                            }
                            mainGradientPaint = PremiumGradient.getInstance().getMainGradientPaint();
                            if (this.roundEffect) {
                                mainGradientPaint.setPathEffect(new CornerPathEffect(AndroidUtilities.dpf2(this.size1 / 5.0f)));
                            }
                            if (this.forceMaxAlpha) {
                                mainGradientPaint.setAlpha(i4);
                            } else if (this.useBlur) {
                                mainGradientPaint.setAlpha(60);
                            } else {
                                mainGradientPaint.setAlpha(120);
                            }
                            canvas2.drawPath(path, mainGradientPaint);
                            mainGradientPaint.setPathEffect(null);
                            mainGradientPaint.setAlpha(i4);
                        } else {
                            bitmapCreateBitmap = bitmapCreateBitmap;
                            i3 = 2;
                            paint.setColor(getPathColor());
                            if (this.roundEffect) {
                                paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dpf2(this.size1 / 5.0f)));
                            }
                            canvas.drawPath(path, paint);
                        }
                        if (this.useBlur) {
                            Utilities.stackBlurBitmap(bitmapCreateBitmap, i3);
                        }
                    } else {
                        path = new Path();
                        float f10 = i17 >> 1;
                        int i111 = (int) (f * f10);
                        path.moveTo(0.0f, f10);
                        float f11 = i111;
                        path.lineTo(f11, f11);
                        path.lineTo(f10, 0.0f);
                        float f12 = i17 - i111;
                        path.lineTo(f12, f11);
                        float f13 = i17;
                        path.lineTo(f13, f10);
                        path.lineTo(f12, f12);
                        path.lineTo(f10, f13);
                        path.lineTo(f11, f12);
                        path.lineTo(0.0f, f10);
                        path.close();
                        paint = new Paint();
                        if (this.useGradient) {
                            if (i17 >= AndroidUtilities.dp(10.0f)) {
                                canvas2 = canvas;
                                i3 = 2;
                                i4 = 255;
                                PremiumGradient.getInstance().mainGradient.gradientMatrix(0, i17 * (-2), 0, i17, 0.0f, i17);
                            } else {
                                canvas2 = canvas;
                                i4 = 255;
                                i3 = 2;
                                PremiumGradient.getInstance().mainGradient.gradientMatrix(0, i17 * (-4), 0, i17, 0.0f, i17);
                            }
                            mainGradientPaint = PremiumGradient.getInstance().getMainGradientPaint();
                            if (this.roundEffect) {
                                mainGradientPaint.setPathEffect(new CornerPathEffect(AndroidUtilities.dpf2(this.size1 / 5.0f)));
                            }
                            if (this.forceMaxAlpha) {
                                mainGradientPaint.setAlpha(i4);
                            } else if (this.useBlur) {
                                mainGradientPaint.setAlpha(60);
                            } else {
                                mainGradientPaint.setAlpha(120);
                            }
                            canvas2.drawPath(path, mainGradientPaint);
                            mainGradientPaint.setPathEffect(null);
                            mainGradientPaint.setAlpha(i4);
                        } else {
                            bitmapCreateBitmap = bitmapCreateBitmap;
                            i3 = 2;
                            paint.setColor(getPathColor());
                            if (this.roundEffect) {
                                paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dpf2(this.size1 / 5.0f)));
                            }
                            canvas.drawPath(path, paint);
                        }
                        if (this.useBlur) {
                            Utilities.stackBlurBitmap(bitmapCreateBitmap, i3);
                        }
                    }
                }
                i16++;
                i12 = 6;
                i13 = 3;
                i14 = 43;
                i15 = 0;
            }
        }

        public int getPathColor() {
            return this.type == 100 ? ColorUtils.setAlphaComponent(Theme.getColor(this.colorKey, this.resourcesProvider), 200) : Theme.getColor(this.colorKey, this.resourcesProvider);
        }

        public final void init() {
            generateBitmaps();
            boolean z = this.useRotate;
            int i = this.count;
            if (z) {
                int length = this.stars.length;
                this.matrices = new Matrix[length];
                this.points = new float[length][];
                this.pointsCount = new int[length];
                this.rotationAngles = new float[length];
                for (int i2 = 0; i2 < length; i2++) {
                    this.matrices[i2] = new Matrix();
                    this.points[i2] = new float[i * 2];
                }
            }
            ArrayList arrayList = this.particles;
            if (arrayList.isEmpty()) {
                for (int i3 = 0; i3 < i; i3++) {
                    arrayList.add(new Particle());
                }
            }
        }

        public final void onDraw(Canvas canvas) {
            onDraw(canvas, 1.0f);
        }

        public final void resetPositions() {
            long jCurrentTimeMillis = System.currentTimeMillis();
            int i = 0;
            while (true) {
                ArrayList arrayList = this.particles;
                if (i >= arrayList.size()) {
                    return;
                }
                ((Particle) arrayList.get(i)).genPosition(jCurrentTimeMillis);
                i++;
            }
        }

        public final void onDraw(Canvas canvas, float f) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = jCurrentTimeMillis - this.prevTime;
            long j2 = 4;
            if (j < 4) {
                j = j2;
            } else {
                j2 = 50;
                if (j > 50) {
                    j = j2;
                }
            }
            boolean z = this.useRotate;
            ArrayList arrayList = this.particles;
            if (z) {
                RectF rectF = this.rect;
                float fCenterX = rectF.centerX() + 0.0f;
                float fCenterY = rectF.centerY() + this.centerOffsetY;
                int i = 0;
                while (true) {
                    Matrix[] matrixArr = this.matrices;
                    if (i >= matrixArr.length) {
                        break;
                    }
                    float[] fArr = this.rotationAngles;
                    float f2 = ((j / ((i * 10000.0f) + 40000.0f)) * 360.0f) + fArr[i];
                    fArr[i] = f2;
                    matrixArr[i].setRotate(f2, fCenterX, fCenterY);
                    this.pointsCount[i] = 0;
                    i++;
                }
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    Particle particle = (Particle) arrayList.get(i2);
                    Drawable drawable = Drawable.this;
                    int[] iArr = drawable.pointsCount;
                    int i3 = particle.starIndex;
                    int i4 = iArr[i3];
                    float[] fArr2 = drawable.points[i3];
                    int i5 = i4 * 2;
                    fArr2[i5] = particle.x;
                    fArr2[i5 + 1] = particle.y;
                    iArr[i3] = i4 + 1;
                }
                int i6 = 0;
                while (true) {
                    Matrix[] matrixArr2 = this.matrices;
                    if (i6 >= matrixArr2.length) {
                        break;
                    }
                    Matrix matrix = matrixArr2[i6];
                    float[] fArr3 = this.points[i6];
                    matrix.mapPoints(fArr3, 0, fArr3, 0, this.pointsCount[i6]);
                    this.pointsCount[i6] = 0;
                    i6++;
                }
            }
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                Particle particle2 = (Particle) arrayList.get(i7);
                if (this.paused) {
                    particle2.draw(canvas, this.pausedTime, f);
                } else {
                    particle2.draw(canvas, jCurrentTimeMillis, f);
                }
                if (this.checkTime && jCurrentTimeMillis > particle2.lifeTime) {
                    particle2.genPosition(jCurrentTimeMillis);
                }
                if (this.checkBounds && !this.rect2.contains(particle2.drawingX, particle2.drawingY)) {
                    particle2.genPosition(jCurrentTimeMillis);
                }
            }
            this.prevTime = jCurrentTimeMillis;
        }
    }

    public StarParticlesView(Context context) {
        super(context);
        int i = SharedConfig.getDevicePerformanceClass() == 2 ? 200 : SharedConfig.getDevicePerformanceClass() == 1 ? 100 : 50;
        this.isLiteModeParticlesAllowed = true;
        this.drawable = new Drawable(i);
        configure();
    }

    public void configure() {
        Drawable drawable = this.drawable;
        drawable.type = 100;
        drawable.roundEffect = true;
        drawable.useRotate = true;
        drawable.useBlur = true;
        drawable.checkBounds = true;
        drawable.size1 = 4;
        drawable.k3 = 0.98f;
        drawable.k2 = 0.98f;
        drawable.k1 = 0.98f;
        drawable.init();
    }

    public int getStarsRectWidth() {
        return AndroidUtilities.dp(140.0f);
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        DialogCell$$ExternalSyntheticLambda6 dialogCell$$ExternalSyntheticLambda6 = new DialogCell$$ExternalSyntheticLambda6(this, 27);
        this.powerSaverCallback = dialogCell$$ExternalSyntheticLambda6;
        LiteMode.addOnPowerSaverAppliedListener(dialogCell$$ExternalSyntheticLambda6);
        boolean zIsEnabled = LiteMode.isEnabled(131072);
        if (this.isLiteModeParticlesAllowed != zIsEnabled) {
            this.isLiteModeParticlesAllowed = zIsEnabled;
            invalidate();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        DialogCell$$ExternalSyntheticLambda6 dialogCell$$ExternalSyntheticLambda6 = this.powerSaverCallback;
        if (dialogCell$$ExternalSyntheticLambda6 != null) {
            LiteMode.removeOnPowerSaverAppliedListener(dialogCell$$ExternalSyntheticLambda6);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        if (this.isLiteModeParticlesAllowed) {
            if (this.clipGradientPaint != null) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
            }
            this.drawable.onDraw(canvas2, 1.0f);
            if (this.clipGradientPaint != null) {
                canvas2.save();
                this.clipGradientMatrix.reset();
                this.clipGradientMatrix.postTranslate(0.0f, (getHeight() + 1) - AndroidUtilities.dp(12.0f));
                this.clipGradient.setLocalMatrix(this.clipGradientMatrix);
                canvas2.drawRect(0.0f, getHeight() - AndroidUtilities.dp(12.0f), getWidth(), getHeight(), this.clipGradientPaint);
                this.clipGradientMatrix.reset();
                this.clipGradientMatrix.postRotate(180.0f);
                this.clipGradientMatrix.postTranslate(0.0f, AndroidUtilities.dp(12.0f));
                this.clipGradient.setLocalMatrix(this.clipGradientMatrix);
                canvas2.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(12.0f), this.clipGradientPaint);
                canvas2.restore();
                canvas2.restore();
            }
            if (this.drawable.paused) {
                return;
            }
            invalidate();
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
        this.drawable.rect.set(0.0f, 0.0f, getStarsRectWidth(), AndroidUtilities.dp(140.0f));
        this.drawable.rect.offset((getMeasuredWidth() - this.drawable.rect.width()) / 2.0f, (getMeasuredHeight() - this.drawable.rect.height()) / 2.0f);
        this.drawable.rect2.set(-AndroidUtilities.dp(15.0f), -AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f) + getMeasuredWidth(), AndroidUtilities.dp(15.0f) + getMeasuredHeight());
        if (this.size != measuredHeight) {
            this.size = measuredHeight;
            this.drawable.resetPositions();
        }
    }

    public final void setClipWithGradient() {
        Paint paint = new Paint(1);
        this.clipGradientPaint = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(12.0f), new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.clipGradient = linearGradient;
        this.clipGradientPaint.setShader(linearGradient);
        this.clipGradientMatrix = new Matrix();
    }

    public void setPaused(boolean z) {
        Drawable drawable = this.drawable;
        if (z == drawable.paused) {
            return;
        }
        drawable.paused = z;
        if (z) {
            drawable.pausedTime = System.currentTimeMillis();
            return;
        }
        for (int i = 0; i < this.drawable.particles.size(); i++) {
            Drawable.Particle particle = (Drawable.Particle) this.drawable.particles.get(i);
            particle.lifeTime = (System.currentTimeMillis() - this.drawable.pausedTime) + particle.lifeTime;
        }
        invalidate();
    }
}
