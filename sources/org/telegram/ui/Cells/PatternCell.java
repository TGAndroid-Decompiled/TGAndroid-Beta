package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BackgroundGradientDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.MotionBackgroundDrawable;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.ThemePreviewActivity;
import org.telegram.ui.iv.RichEditor;

public final class PatternCell extends BackupImageView implements DownloadController.FileDownloadProgressListener {
    public final int TAG;
    public MotionBackgroundDrawable backgroundDrawable;
    public final Paint backgroundPaint;
    public final int currentAccount;
    public int currentBackgroundColor;
    public int currentGradientAngle;
    public int currentGradientColor1;
    public int currentGradientColor2;
    public int currentGradientColor3;
    public TLRPC.TL_wallPaper currentPattern;
    public final ThemePreviewActivity.PatternsAdapter.AnonymousClass1 delegate;
    public LinearGradient gradientShader;
    public final int maxWallpaperSize;
    public final RadialProgress2 radialProgress;
    public final RectF rect;

    public PatternCell(Context context, int i, ThemePreviewActivity.PatternsAdapter.AnonymousClass1 anonymousClass1) {
        super(context);
        this.rect = new RectF();
        int i2 = UserConfig.selectedAccount;
        this.currentAccount = i2;
        setRoundRadius(AndroidUtilities.dp(6.0f));
        this.maxWallpaperSize = i;
        this.delegate = anonymousClass1;
        RadialProgress2 radialProgress2 = new RadialProgress2(null, this);
        this.radialProgress = radialProgress2;
        radialProgress2.setProgressRect(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
        this.backgroundPaint = new Paint(3);
        this.TAG = DownloadController.getInstance(i2).generateObserverTag();
        setOutlineProvider(new RichEditor.AnonymousClass5(3));
        setClipToOutline(true);
    }

    @Override
    public int getObserverTag() {
        return this.TAG;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        updateSelected$1(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int defaultAccentColor;
        int i;
        ThemePreviewActivity themePreviewActivity;
        int defaultAccentColor2;
        int i2;
        int i3;
        ThemePreviewActivity themePreviewActivity2;
        int defaultAccentColor3;
        int i4;
        int i5;
        ThemePreviewActivity themePreviewActivity3;
        int defaultAccentColor4;
        int i6;
        int i7;
        ThemePreviewActivity themePreviewActivity4;
        int i8;
        int i9;
        MotionBackgroundDrawable motionBackgroundDrawable;
        Paint paint;
        RadialProgress2 radialProgress2;
        MotionBackgroundDrawable motionBackgroundDrawable2;
        ThemePreviewActivity.PatternsAdapter.AnonymousClass1 anonymousClass1 = this.delegate;
        float f = ThemePreviewActivity.PatternsAdapter.this.this$0.currentIntensity;
        this.imageReceiver.setBlendMode(null);
        ThemePreviewActivity.PatternsAdapter patternsAdapter = ThemePreviewActivity.PatternsAdapter.this;
        ThemePreviewActivity themePreviewActivity5 = patternsAdapter.this$0;
        if (themePreviewActivity5.screenType != 2) {
            defaultAccentColor = Theme.getDefaultAccentColor(Theme.key_chat_wallpaper);
            int i10 = (int) patternsAdapter.this$0.accent.backgroundOverrideColor;
            if (i10 != 0) {
                i = i10;
            }
            themePreviewActivity = patternsAdapter.this$0;
            if (themePreviewActivity.screenType == 2) {
                defaultAccentColor2 = Theme.getDefaultAccentColor(Theme.key_chat_wallpaper_gradient_to1);
                i2 = (int) patternsAdapter.this$0.accent.backgroundGradientOverrideColor1;
                if (i2 != 0) {
                    i3 = i2;
                }
                themePreviewActivity2 = patternsAdapter.this$0;
                if (themePreviewActivity2.screenType == 2) {
                    defaultAccentColor3 = Theme.getDefaultAccentColor(Theme.key_chat_wallpaper_gradient_to2);
                    i4 = (int) patternsAdapter.this$0.accent.backgroundGradientOverrideColor2;
                    if (i4 != 0) {
                        i5 = i4;
                    }
                    themePreviewActivity3 = patternsAdapter.this$0;
                    if (themePreviewActivity3.screenType == 2) {
                        defaultAccentColor4 = Theme.getDefaultAccentColor(Theme.key_chat_wallpaper_gradient_to3);
                        i6 = (int) patternsAdapter.this$0.accent.backgroundGradientOverrideColor3;
                        if (i6 != 0) {
                            i7 = i6;
                        }
                        themePreviewActivity4 = patternsAdapter.this$0;
                        if (themePreviewActivity4.screenType == 2) {
                            i8 = themePreviewActivity4.backgroundRotation;
                        } else {
                            i8 = themePreviewActivity4.accent.backgroundRotation;
                        }
                        i9 = themePreviewActivity4.checkColor;
                        if (i3 != 0) {
                            this.gradientShader = null;
                            this.backgroundDrawable = null;
                            this.imageReceiver.setGradientBitmap(null);
                        } else if (this.gradientShader != null || i != this.currentBackgroundColor || i3 != this.currentGradientColor1 || i5 != this.currentGradientColor2 || i7 != this.currentGradientColor3 || i8 != this.currentGradientAngle) {
                            this.currentBackgroundColor = i;
                            this.currentGradientColor1 = i3;
                            this.currentGradientColor2 = i5;
                            this.currentGradientColor3 = i7;
                            this.currentGradientAngle = i8;
                            if (i5 != 0) {
                                this.gradientShader = null;
                                motionBackgroundDrawable2 = this.backgroundDrawable;
                                if (motionBackgroundDrawable2 != null) {
                                    motionBackgroundDrawable2.setColors(i, i3, i5, i7, 0, false);
                                } else {
                                    MotionBackgroundDrawable motionBackgroundDrawable3 = new MotionBackgroundDrawable(i, i3, i5, i7, true, 0, false);
                                    this.backgroundDrawable = motionBackgroundDrawable3;
                                    motionBackgroundDrawable3.setRoundRadius(AndroidUtilities.dp(6.0f));
                                    this.backgroundDrawable.setParentView(this);
                                }
                                if (f < 0.0f) {
                                    this.imageReceiver.setGradientBitmap(this.backgroundDrawable.currentBitmap);
                                } else {
                                    this.imageReceiver.setGradientBitmap(null);
                                    if (Build.VERSION.SDK_INT >= 29) {
                                        this.imageReceiver.setBlendMode(BlendMode.SOFT_LIGHT);
                                    } else {
                                        this.imageReceiver.setColorFilter(new PorterDuffColorFilter(patternsAdapter.this$0.patternColor, PorterDuff.Mode.SRC_IN));
                                    }
                                }
                            } else {
                                Rect gradientPoints = BackgroundGradientDrawable.getGradientPoints(BackgroundGradientDrawable.getGradientOrientation(i8), getMeasuredWidth(), getMeasuredHeight());
                                this.gradientShader = new LinearGradient(gradientPoints.left, gradientPoints.top, gradientPoints.right, gradientPoints.bottom, new int[]{i, i3}, (float[]) null, Shader.TileMode.CLAMP);
                                this.backgroundDrawable = null;
                                this.imageReceiver.setGradientBitmap(null);
                            }
                        }
                        motionBackgroundDrawable = this.backgroundDrawable;
                        if (motionBackgroundDrawable != null) {
                            motionBackgroundDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                            this.backgroundDrawable.draw(canvas);
                        } else {
                            paint = this.backgroundPaint;
                            paint.setShader(this.gradientShader);
                            if (this.gradientShader == null) {
                                paint.setColor(i);
                            }
                            RectF rectF = this.rect;
                            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
                        }
                        super.onDraw(canvas);
                        radialProgress2 = this.radialProgress;
                        if (radialProgress2.mediaActionDrawable.nextIcon != 4) {
                            radialProgress2.setColors(i9, i9, -1, -1);
                            radialProgress2.draw(canvas);
                        }
                    }
                    defaultAccentColor4 = themePreviewActivity3.backgroundGradientColor3;
                    i7 = defaultAccentColor4;
                    themePreviewActivity4 = patternsAdapter.this$0;
                    if (themePreviewActivity4.screenType == 2) {
                        i8 = themePreviewActivity4.backgroundRotation;
                    } else {
                        i8 = themePreviewActivity4.accent.backgroundRotation;
                    }
                    i9 = themePreviewActivity4.checkColor;
                    if (i3 != 0) {
                        this.gradientShader = null;
                        this.backgroundDrawable = null;
                        this.imageReceiver.setGradientBitmap(null);
                    } else if (this.gradientShader != null) {
                        this.currentBackgroundColor = i;
                        this.currentGradientColor1 = i3;
                        this.currentGradientColor2 = i5;
                        this.currentGradientColor3 = i7;
                        this.currentGradientAngle = i8;
                        if (i5 != 0) {
                            this.gradientShader = null;
                            motionBackgroundDrawable2 = this.backgroundDrawable;
                            if (motionBackgroundDrawable2 != null) {
                                motionBackgroundDrawable2.setColors(i, i3, i5, i7, 0, false);
                            } else {
                                MotionBackgroundDrawable motionBackgroundDrawable4 = new MotionBackgroundDrawable(i, i3, i5, i7, true, 0, false);
                                this.backgroundDrawable = motionBackgroundDrawable4;
                                motionBackgroundDrawable4.setRoundRadius(AndroidUtilities.dp(6.0f));
                                this.backgroundDrawable.setParentView(this);
                            }
                            if (f < 0.0f) {
                                this.imageReceiver.setGradientBitmap(this.backgroundDrawable.currentBitmap);
                            } else {
                                this.imageReceiver.setGradientBitmap(null);
                                if (Build.VERSION.SDK_INT >= 29) {
                                    this.imageReceiver.setBlendMode(BlendMode.SOFT_LIGHT);
                                } else {
                                    this.imageReceiver.setColorFilter(new PorterDuffColorFilter(patternsAdapter.this$0.patternColor, PorterDuff.Mode.SRC_IN));
                                }
                            }
                        } else {
                            Rect gradientPoints2 = BackgroundGradientDrawable.getGradientPoints(BackgroundGradientDrawable.getGradientOrientation(i8), getMeasuredWidth(), getMeasuredHeight());
                            this.gradientShader = new LinearGradient(gradientPoints2.left, gradientPoints2.top, gradientPoints2.right, gradientPoints2.bottom, new int[]{i, i3}, (float[]) null, Shader.TileMode.CLAMP);
                            this.backgroundDrawable = null;
                            this.imageReceiver.setGradientBitmap(null);
                        }
                    } else {
                        this.currentBackgroundColor = i;
                        this.currentGradientColor1 = i3;
                        this.currentGradientColor2 = i5;
                        this.currentGradientColor3 = i7;
                        this.currentGradientAngle = i8;
                        if (i5 != 0) {
                            this.gradientShader = null;
                            motionBackgroundDrawable2 = this.backgroundDrawable;
                            if (motionBackgroundDrawable2 != null) {
                                motionBackgroundDrawable2.setColors(i, i3, i5, i7, 0, false);
                            } else {
                                MotionBackgroundDrawable motionBackgroundDrawable5 = new MotionBackgroundDrawable(i, i3, i5, i7, true, 0, false);
                                this.backgroundDrawable = motionBackgroundDrawable5;
                                motionBackgroundDrawable5.setRoundRadius(AndroidUtilities.dp(6.0f));
                                this.backgroundDrawable.setParentView(this);
                            }
                            if (f < 0.0f) {
                                this.imageReceiver.setGradientBitmap(this.backgroundDrawable.currentBitmap);
                            } else {
                                this.imageReceiver.setGradientBitmap(null);
                                if (Build.VERSION.SDK_INT >= 29) {
                                    this.imageReceiver.setBlendMode(BlendMode.SOFT_LIGHT);
                                } else {
                                    this.imageReceiver.setColorFilter(new PorterDuffColorFilter(patternsAdapter.this$0.patternColor, PorterDuff.Mode.SRC_IN));
                                }
                            }
                        } else {
                            Rect gradientPoints3 = BackgroundGradientDrawable.getGradientPoints(BackgroundGradientDrawable.getGradientOrientation(i8), getMeasuredWidth(), getMeasuredHeight());
                            this.gradientShader = new LinearGradient(gradientPoints3.left, gradientPoints3.top, gradientPoints3.right, gradientPoints3.bottom, new int[]{i, i3}, (float[]) null, Shader.TileMode.CLAMP);
                            this.backgroundDrawable = null;
                            this.imageReceiver.setGradientBitmap(null);
                        }
                    }
                    motionBackgroundDrawable = this.backgroundDrawable;
                    if (motionBackgroundDrawable != null) {
                        motionBackgroundDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                        this.backgroundDrawable.draw(canvas);
                    } else {
                        paint = this.backgroundPaint;
                        paint.setShader(this.gradientShader);
                        if (this.gradientShader == null) {
                            paint.setColor(i);
                        }
                        RectF rectF2 = this.rect;
                        rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
                    }
                    super.onDraw(canvas);
                    radialProgress2 = this.radialProgress;
                    if (radialProgress2.mediaActionDrawable.nextIcon != 4) {
                        radialProgress2.setColors(i9, i9, -1, -1);
                        radialProgress2.draw(canvas);
                    }
                }
                defaultAccentColor3 = themePreviewActivity2.backgroundGradientColor2;
                i5 = defaultAccentColor3;
                themePreviewActivity3 = patternsAdapter.this$0;
                if (themePreviewActivity3.screenType == 2) {
                    defaultAccentColor4 = Theme.getDefaultAccentColor(Theme.key_chat_wallpaper_gradient_to3);
                    i6 = (int) patternsAdapter.this$0.accent.backgroundGradientOverrideColor3;
                    if (i6 != 0) {
                        i7 = i6;
                    }
                    themePreviewActivity4 = patternsAdapter.this$0;
                    if (themePreviewActivity4.screenType == 2) {
                        i8 = themePreviewActivity4.backgroundRotation;
                    } else {
                        i8 = themePreviewActivity4.accent.backgroundRotation;
                    }
                    i9 = themePreviewActivity4.checkColor;
                    if (i3 != 0) {
                        this.gradientShader = null;
                        this.backgroundDrawable = null;
                        this.imageReceiver.setGradientBitmap(null);
                    } else if (this.gradientShader != null) {
                        this.currentBackgroundColor = i;
                        this.currentGradientColor1 = i3;
                        this.currentGradientColor2 = i5;
                        this.currentGradientColor3 = i7;
                        this.currentGradientAngle = i8;
                        if (i5 != 0) {
                            this.gradientShader = null;
                            motionBackgroundDrawable2 = this.backgroundDrawable;
                            if (motionBackgroundDrawable2 != null) {
                                motionBackgroundDrawable2.setColors(i, i3, i5, i7, 0, false);
                            } else {
                                MotionBackgroundDrawable motionBackgroundDrawable6 = new MotionBackgroundDrawable(i, i3, i5, i7, true, 0, false);
                                this.backgroundDrawable = motionBackgroundDrawable6;
                                motionBackgroundDrawable6.setRoundRadius(AndroidUtilities.dp(6.0f));
                                this.backgroundDrawable.setParentView(this);
                            }
                            if (f < 0.0f) {
                                this.imageReceiver.setGradientBitmap(this.backgroundDrawable.currentBitmap);
                            } else {
                                this.imageReceiver.setGradientBitmap(null);
                                if (Build.VERSION.SDK_INT >= 29) {
                                    this.imageReceiver.setBlendMode(BlendMode.SOFT_LIGHT);
                                } else {
                                    this.imageReceiver.setColorFilter(new PorterDuffColorFilter(patternsAdapter.this$0.patternColor, PorterDuff.Mode.SRC_IN));
                                }
                            }
                        } else {
                            Rect gradientPoints4 = BackgroundGradientDrawable.getGradientPoints(BackgroundGradientDrawable.getGradientOrientation(i8), getMeasuredWidth(), getMeasuredHeight());
                            this.gradientShader = new LinearGradient(gradientPoints4.left, gradientPoints4.top, gradientPoints4.right, gradientPoints4.bottom, new int[]{i, i3}, (float[]) null, Shader.TileMode.CLAMP);
                            this.backgroundDrawable = null;
                            this.imageReceiver.setGradientBitmap(null);
                        }
                    } else {
                        this.currentBackgroundColor = i;
                        this.currentGradientColor1 = i3;
                        this.currentGradientColor2 = i5;
                        this.currentGradientColor3 = i7;
                        this.currentGradientAngle = i8;
                        if (i5 != 0) {
                            this.gradientShader = null;
                            motionBackgroundDrawable2 = this.backgroundDrawable;
                            if (motionBackgroundDrawable2 != null) {
                                motionBackgroundDrawable2.setColors(i, i3, i5, i7, 0, false);
                            } else {
                                MotionBackgroundDrawable motionBackgroundDrawable7 = new MotionBackgroundDrawable(i, i3, i5, i7, true, 0, false);
                                this.backgroundDrawable = motionBackgroundDrawable7;
                                motionBackgroundDrawable7.setRoundRadius(AndroidUtilities.dp(6.0f));
                                this.backgroundDrawable.setParentView(this);
                            }
                            if (f < 0.0f) {
                                this.imageReceiver.setGradientBitmap(this.backgroundDrawable.currentBitmap);
                            } else {
                                this.imageReceiver.setGradientBitmap(null);
                                if (Build.VERSION.SDK_INT >= 29) {
                                    this.imageReceiver.setBlendMode(BlendMode.SOFT_LIGHT);
                                } else {
                                    this.imageReceiver.setColorFilter(new PorterDuffColorFilter(patternsAdapter.this$0.patternColor, PorterDuff.Mode.SRC_IN));
                                }
                            }
                        } else {
                            Rect gradientPoints5 = BackgroundGradientDrawable.getGradientPoints(BackgroundGradientDrawable.getGradientOrientation(i8), getMeasuredWidth(), getMeasuredHeight());
                            this.gradientShader = new LinearGradient(gradientPoints5.left, gradientPoints5.top, gradientPoints5.right, gradientPoints5.bottom, new int[]{i, i3}, (float[]) null, Shader.TileMode.CLAMP);
                            this.backgroundDrawable = null;
                            this.imageReceiver.setGradientBitmap(null);
                        }
                    }
                    motionBackgroundDrawable = this.backgroundDrawable;
                    if (motionBackgroundDrawable != null) {
                        motionBackgroundDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                        this.backgroundDrawable.draw(canvas);
                    } else {
                        paint = this.backgroundPaint;
                        paint.setShader(this.gradientShader);
                        if (this.gradientShader == null) {
                            paint.setColor(i);
                        }
                        RectF rectF3 = this.rect;
                        rectF3.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                        canvas.drawRoundRect(rectF3, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
                    }
                    super.onDraw(canvas);
                    radialProgress2 = this.radialProgress;
                    if (radialProgress2.mediaActionDrawable.nextIcon != 4) {
                        radialProgress2.setColors(i9, i9, -1, -1);
                        radialProgress2.draw(canvas);
                    }
                }
                defaultAccentColor4 = themePreviewActivity3.backgroundGradientColor3;
                i7 = defaultAccentColor4;
                themePreviewActivity4 = patternsAdapter.this$0;
                if (themePreviewActivity4.screenType == 2) {
                    i8 = themePreviewActivity4.backgroundRotation;
                } else {
                    i8 = themePreviewActivity4.accent.backgroundRotation;
                }
                i9 = themePreviewActivity4.checkColor;
                if (i3 != 0) {
                    this.gradientShader = null;
                    this.backgroundDrawable = null;
                    this.imageReceiver.setGradientBitmap(null);
                } else if (this.gradientShader != null) {
                    this.currentBackgroundColor = i;
                    this.currentGradientColor1 = i3;
                    this.currentGradientColor2 = i5;
                    this.currentGradientColor3 = i7;
                    this.currentGradientAngle = i8;
                    if (i5 != 0) {
                        this.gradientShader = null;
                        motionBackgroundDrawable2 = this.backgroundDrawable;
                        if (motionBackgroundDrawable2 != null) {
                            motionBackgroundDrawable2.setColors(i, i3, i5, i7, 0, false);
                        } else {
                            MotionBackgroundDrawable motionBackgroundDrawable8 = new MotionBackgroundDrawable(i, i3, i5, i7, true, 0, false);
                            this.backgroundDrawable = motionBackgroundDrawable8;
                            motionBackgroundDrawable8.setRoundRadius(AndroidUtilities.dp(6.0f));
                            this.backgroundDrawable.setParentView(this);
                        }
                        if (f < 0.0f) {
                            this.imageReceiver.setGradientBitmap(this.backgroundDrawable.currentBitmap);
                        } else {
                            this.imageReceiver.setGradientBitmap(null);
                            if (Build.VERSION.SDK_INT >= 29) {
                                this.imageReceiver.setBlendMode(BlendMode.SOFT_LIGHT);
                            } else {
                                this.imageReceiver.setColorFilter(new PorterDuffColorFilter(patternsAdapter.this$0.patternColor, PorterDuff.Mode.SRC_IN));
                            }
                        }
                    } else {
                        Rect gradientPoints6 = BackgroundGradientDrawable.getGradientPoints(BackgroundGradientDrawable.getGradientOrientation(i8), getMeasuredWidth(), getMeasuredHeight());
                        this.gradientShader = new LinearGradient(gradientPoints6.left, gradientPoints6.top, gradientPoints6.right, gradientPoints6.bottom, new int[]{i, i3}, (float[]) null, Shader.TileMode.CLAMP);
                        this.backgroundDrawable = null;
                        this.imageReceiver.setGradientBitmap(null);
                    }
                } else {
                    this.currentBackgroundColor = i;
                    this.currentGradientColor1 = i3;
                    this.currentGradientColor2 = i5;
                    this.currentGradientColor3 = i7;
                    this.currentGradientAngle = i8;
                    if (i5 != 0) {
                        this.gradientShader = null;
                        motionBackgroundDrawable2 = this.backgroundDrawable;
                        if (motionBackgroundDrawable2 != null) {
                            motionBackgroundDrawable2.setColors(i, i3, i5, i7, 0, false);
                        } else {
                            MotionBackgroundDrawable motionBackgroundDrawable9 = new MotionBackgroundDrawable(i, i3, i5, i7, true, 0, false);
                            this.backgroundDrawable = motionBackgroundDrawable9;
                            motionBackgroundDrawable9.setRoundRadius(AndroidUtilities.dp(6.0f));
                            this.backgroundDrawable.setParentView(this);
                        }
                        if (f < 0.0f) {
                            this.imageReceiver.setGradientBitmap(this.backgroundDrawable.currentBitmap);
                        } else {
                            this.imageReceiver.setGradientBitmap(null);
                            if (Build.VERSION.SDK_INT >= 29) {
                                this.imageReceiver.setBlendMode(BlendMode.SOFT_LIGHT);
                            } else {
                                this.imageReceiver.setColorFilter(new PorterDuffColorFilter(patternsAdapter.this$0.patternColor, PorterDuff.Mode.SRC_IN));
                            }
                        }
                    } else {
                        Rect gradientPoints7 = BackgroundGradientDrawable.getGradientPoints(BackgroundGradientDrawable.getGradientOrientation(i8), getMeasuredWidth(), getMeasuredHeight());
                        this.gradientShader = new LinearGradient(gradientPoints7.left, gradientPoints7.top, gradientPoints7.right, gradientPoints7.bottom, new int[]{i, i3}, (float[]) null, Shader.TileMode.CLAMP);
                        this.backgroundDrawable = null;
                        this.imageReceiver.setGradientBitmap(null);
                    }
                }
                motionBackgroundDrawable = this.backgroundDrawable;
                if (motionBackgroundDrawable != null) {
                    motionBackgroundDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    this.backgroundDrawable.draw(canvas);
                } else {
                    paint = this.backgroundPaint;
                    paint.setShader(this.gradientShader);
                    if (this.gradientShader == null) {
                        paint.setColor(i);
                    }
                    RectF rectF4 = this.rect;
                    rectF4.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    canvas.drawRoundRect(rectF4, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
                }
                super.onDraw(canvas);
                radialProgress2 = this.radialProgress;
                if (radialProgress2.mediaActionDrawable.nextIcon != 4) {
                    radialProgress2.setColors(i9, i9, -1, -1);
                    radialProgress2.draw(canvas);
                }
            }
            defaultAccentColor2 = themePreviewActivity.backgroundGradientColor1;
            i3 = defaultAccentColor2;
            themePreviewActivity2 = patternsAdapter.this$0;
            if (themePreviewActivity2.screenType == 2) {
                defaultAccentColor3 = Theme.getDefaultAccentColor(Theme.key_chat_wallpaper_gradient_to2);
                i4 = (int) patternsAdapter.this$0.accent.backgroundGradientOverrideColor2;
                if (i4 != 0) {
                    i5 = i4;
                }
                themePreviewActivity3 = patternsAdapter.this$0;
                if (themePreviewActivity3.screenType == 2) {
                    defaultAccentColor4 = Theme.getDefaultAccentColor(Theme.key_chat_wallpaper_gradient_to3);
                    i6 = (int) patternsAdapter.this$0.accent.backgroundGradientOverrideColor3;
                    if (i6 != 0) {
                        i7 = i6;
                    }
                    themePreviewActivity4 = patternsAdapter.this$0;
                    if (themePreviewActivity4.screenType == 2) {
                        i8 = themePreviewActivity4.backgroundRotation;
                    } else {
                        i8 = themePreviewActivity4.accent.backgroundRotation;
                    }
                    i9 = themePreviewActivity4.checkColor;
                    if (i3 != 0) {
                        this.gradientShader = null;
                        this.backgroundDrawable = null;
                        this.imageReceiver.setGradientBitmap(null);
                    } else if (this.gradientShader != null) {
                        this.currentBackgroundColor = i;
                        this.currentGradientColor1 = i3;
                        this.currentGradientColor2 = i5;
                        this.currentGradientColor3 = i7;
                        this.currentGradientAngle = i8;
                        if (i5 != 0) {
                            this.gradientShader = null;
                            motionBackgroundDrawable2 = this.backgroundDrawable;
                            if (motionBackgroundDrawable2 != null) {
                                motionBackgroundDrawable2.setColors(i, i3, i5, i7, 0, false);
                            } else {
                                MotionBackgroundDrawable motionBackgroundDrawable10 = new MotionBackgroundDrawable(i, i3, i5, i7, true, 0, false);
                                this.backgroundDrawable = motionBackgroundDrawable10;
                                motionBackgroundDrawable10.setRoundRadius(AndroidUtilities.dp(6.0f));
                                this.backgroundDrawable.setParentView(this);
                            }
                            if (f < 0.0f) {
                                this.imageReceiver.setGradientBitmap(this.backgroundDrawable.currentBitmap);
                            } else {
                                this.imageReceiver.setGradientBitmap(null);
                                if (Build.VERSION.SDK_INT >= 29) {
                                    this.imageReceiver.setBlendMode(BlendMode.SOFT_LIGHT);
                                } else {
                                    this.imageReceiver.setColorFilter(new PorterDuffColorFilter(patternsAdapter.this$0.patternColor, PorterDuff.Mode.SRC_IN));
                                }
                            }
                        } else {
                            Rect gradientPoints8 = BackgroundGradientDrawable.getGradientPoints(BackgroundGradientDrawable.getGradientOrientation(i8), getMeasuredWidth(), getMeasuredHeight());
                            this.gradientShader = new LinearGradient(gradientPoints8.left, gradientPoints8.top, gradientPoints8.right, gradientPoints8.bottom, new int[]{i, i3}, (float[]) null, Shader.TileMode.CLAMP);
                            this.backgroundDrawable = null;
                            this.imageReceiver.setGradientBitmap(null);
                        }
                    } else {
                        this.currentBackgroundColor = i;
                        this.currentGradientColor1 = i3;
                        this.currentGradientColor2 = i5;
                        this.currentGradientColor3 = i7;
                        this.currentGradientAngle = i8;
                        if (i5 != 0) {
                            this.gradientShader = null;
                            motionBackgroundDrawable2 = this.backgroundDrawable;
                            if (motionBackgroundDrawable2 != null) {
                                motionBackgroundDrawable2.setColors(i, i3, i5, i7, 0, false);
                            } else {
                                MotionBackgroundDrawable motionBackgroundDrawable11 = new MotionBackgroundDrawable(i, i3, i5, i7, true, 0, false);
                                this.backgroundDrawable = motionBackgroundDrawable11;
                                motionBackgroundDrawable11.setRoundRadius(AndroidUtilities.dp(6.0f));
                                this.backgroundDrawable.setParentView(this);
                            }
                            if (f < 0.0f) {
                                this.imageReceiver.setGradientBitmap(this.backgroundDrawable.currentBitmap);
                            } else {
                                this.imageReceiver.setGradientBitmap(null);
                                if (Build.VERSION.SDK_INT >= 29) {
                                    this.imageReceiver.setBlendMode(BlendMode.SOFT_LIGHT);
                                } else {
                                    this.imageReceiver.setColorFilter(new PorterDuffColorFilter(patternsAdapter.this$0.patternColor, PorterDuff.Mode.SRC_IN));
                                }
                            }
                        } else {
                            Rect gradientPoints9 = BackgroundGradientDrawable.getGradientPoints(BackgroundGradientDrawable.getGradientOrientation(i8), getMeasuredWidth(), getMeasuredHeight());
                            this.gradientShader = new LinearGradient(gradientPoints9.left, gradientPoints9.top, gradientPoints9.right, gradientPoints9.bottom, new int[]{i, i3}, (float[]) null, Shader.TileMode.CLAMP);
                            this.backgroundDrawable = null;
                            this.imageReceiver.setGradientBitmap(null);
                        }
                    }
                    motionBackgroundDrawable = this.backgroundDrawable;
                    if (motionBackgroundDrawable != null) {
                        motionBackgroundDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                        this.backgroundDrawable.draw(canvas);
                    } else {
                        paint = this.backgroundPaint;
                        paint.setShader(this.gradientShader);
                        if (this.gradientShader == null) {
                            paint.setColor(i);
                        }
                        RectF rectF5 = this.rect;
                        rectF5.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                        canvas.drawRoundRect(rectF5, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
                    }
                    super.onDraw(canvas);
                    radialProgress2 = this.radialProgress;
                    if (radialProgress2.mediaActionDrawable.nextIcon != 4) {
                        radialProgress2.setColors(i9, i9, -1, -1);
                        radialProgress2.draw(canvas);
                    }
                }
                defaultAccentColor4 = themePreviewActivity3.backgroundGradientColor3;
                i7 = defaultAccentColor4;
                themePreviewActivity4 = patternsAdapter.this$0;
                if (themePreviewActivity4.screenType == 2) {
                    i8 = themePreviewActivity4.backgroundRotation;
                } else {
                    i8 = themePreviewActivity4.accent.backgroundRotation;
                }
                i9 = themePreviewActivity4.checkColor;
                if (i3 != 0) {
                    this.gradientShader = null;
                    this.backgroundDrawable = null;
                    this.imageReceiver.setGradientBitmap(null);
                } else if (this.gradientShader != null) {
                    this.currentBackgroundColor = i;
                    this.currentGradientColor1 = i3;
                    this.currentGradientColor2 = i5;
                    this.currentGradientColor3 = i7;
                    this.currentGradientAngle = i8;
                    if (i5 != 0) {
                        this.gradientShader = null;
                        motionBackgroundDrawable2 = this.backgroundDrawable;
                        if (motionBackgroundDrawable2 != null) {
                            motionBackgroundDrawable2.setColors(i, i3, i5, i7, 0, false);
                        } else {
                            MotionBackgroundDrawable motionBackgroundDrawable12 = new MotionBackgroundDrawable(i, i3, i5, i7, true, 0, false);
                            this.backgroundDrawable = motionBackgroundDrawable12;
                            motionBackgroundDrawable12.setRoundRadius(AndroidUtilities.dp(6.0f));
                            this.backgroundDrawable.setParentView(this);
                        }
                        if (f < 0.0f) {
                            this.imageReceiver.setGradientBitmap(this.backgroundDrawable.currentBitmap);
                        } else {
                            this.imageReceiver.setGradientBitmap(null);
                            if (Build.VERSION.SDK_INT >= 29) {
                                this.imageReceiver.setBlendMode(BlendMode.SOFT_LIGHT);
                            } else {
                                this.imageReceiver.setColorFilter(new PorterDuffColorFilter(patternsAdapter.this$0.patternColor, PorterDuff.Mode.SRC_IN));
                            }
                        }
                    } else {
                        Rect gradientPoints10 = BackgroundGradientDrawable.getGradientPoints(BackgroundGradientDrawable.getGradientOrientation(i8), getMeasuredWidth(), getMeasuredHeight());
                        this.gradientShader = new LinearGradient(gradientPoints10.left, gradientPoints10.top, gradientPoints10.right, gradientPoints10.bottom, new int[]{i, i3}, (float[]) null, Shader.TileMode.CLAMP);
                        this.backgroundDrawable = null;
                        this.imageReceiver.setGradientBitmap(null);
                    }
                } else {
                    this.currentBackgroundColor = i;
                    this.currentGradientColor1 = i3;
                    this.currentGradientColor2 = i5;
                    this.currentGradientColor3 = i7;
                    this.currentGradientAngle = i8;
                    if (i5 != 0) {
                        this.gradientShader = null;
                        motionBackgroundDrawable2 = this.backgroundDrawable;
                        if (motionBackgroundDrawable2 != null) {
                            motionBackgroundDrawable2.setColors(i, i3, i5, i7, 0, false);
                        } else {
                            MotionBackgroundDrawable motionBackgroundDrawable13 = new MotionBackgroundDrawable(i, i3, i5, i7, true, 0, false);
                            this.backgroundDrawable = motionBackgroundDrawable13;
                            motionBackgroundDrawable13.setRoundRadius(AndroidUtilities.dp(6.0f));
                            this.backgroundDrawable.setParentView(this);
                        }
                        if (f < 0.0f) {
                            this.imageReceiver.setGradientBitmap(this.backgroundDrawable.currentBitmap);
                        } else {
                            this.imageReceiver.setGradientBitmap(null);
                            if (Build.VERSION.SDK_INT >= 29) {
                                this.imageReceiver.setBlendMode(BlendMode.SOFT_LIGHT);
                            } else {
                                this.imageReceiver.setColorFilter(new PorterDuffColorFilter(patternsAdapter.this$0.patternColor, PorterDuff.Mode.SRC_IN));
                            }
                        }
                    } else {
                        Rect gradientPoints11 = BackgroundGradientDrawable.getGradientPoints(BackgroundGradientDrawable.getGradientOrientation(i8), getMeasuredWidth(), getMeasuredHeight());
                        this.gradientShader = new LinearGradient(gradientPoints11.left, gradientPoints11.top, gradientPoints11.right, gradientPoints11.bottom, new int[]{i, i3}, (float[]) null, Shader.TileMode.CLAMP);
                        this.backgroundDrawable = null;
                        this.imageReceiver.setGradientBitmap(null);
                    }
                }
                motionBackgroundDrawable = this.backgroundDrawable;
                if (motionBackgroundDrawable != null) {
                    motionBackgroundDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    this.backgroundDrawable.draw(canvas);
                } else {
                    paint = this.backgroundPaint;
                    paint.setShader(this.gradientShader);
                    if (this.gradientShader == null) {
                        paint.setColor(i);
                    }
                    RectF rectF6 = this.rect;
                    rectF6.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    canvas.drawRoundRect(rectF6, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
                }
                super.onDraw(canvas);
                radialProgress2 = this.radialProgress;
                if (radialProgress2.mediaActionDrawable.nextIcon != 4) {
                    radialProgress2.setColors(i9, i9, -1, -1);
                    radialProgress2.draw(canvas);
                }
            }
            defaultAccentColor3 = themePreviewActivity2.backgroundGradientColor2;
            i5 = defaultAccentColor3;
            themePreviewActivity3 = patternsAdapter.this$0;
            if (themePreviewActivity3.screenType == 2) {
                defaultAccentColor4 = Theme.getDefaultAccentColor(Theme.key_chat_wallpaper_gradient_to3);
                i6 = (int) patternsAdapter.this$0.accent.backgroundGradientOverrideColor3;
                if (i6 != 0) {
                    i7 = i6;
                }
                themePreviewActivity4 = patternsAdapter.this$0;
                if (themePreviewActivity4.screenType == 2) {
                    i8 = themePreviewActivity4.backgroundRotation;
                } else {
                    i8 = themePreviewActivity4.accent.backgroundRotation;
                }
                i9 = themePreviewActivity4.checkColor;
                if (i3 != 0) {
                    this.gradientShader = null;
                    this.backgroundDrawable = null;
                    this.imageReceiver.setGradientBitmap(null);
                } else if (this.gradientShader != null) {
                    this.currentBackgroundColor = i;
                    this.currentGradientColor1 = i3;
                    this.currentGradientColor2 = i5;
                    this.currentGradientColor3 = i7;
                    this.currentGradientAngle = i8;
                    if (i5 != 0) {
                        this.gradientShader = null;
                        motionBackgroundDrawable2 = this.backgroundDrawable;
                        if (motionBackgroundDrawable2 != null) {
                            motionBackgroundDrawable2.setColors(i, i3, i5, i7, 0, false);
                        } else {
                            MotionBackgroundDrawable motionBackgroundDrawable14 = new MotionBackgroundDrawable(i, i3, i5, i7, true, 0, false);
                            this.backgroundDrawable = motionBackgroundDrawable14;
                            motionBackgroundDrawable14.setRoundRadius(AndroidUtilities.dp(6.0f));
                            this.backgroundDrawable.setParentView(this);
                        }
                        if (f < 0.0f) {
                            this.imageReceiver.setGradientBitmap(this.backgroundDrawable.currentBitmap);
                        } else {
                            this.imageReceiver.setGradientBitmap(null);
                            if (Build.VERSION.SDK_INT >= 29) {
                                this.imageReceiver.setBlendMode(BlendMode.SOFT_LIGHT);
                            } else {
                                this.imageReceiver.setColorFilter(new PorterDuffColorFilter(patternsAdapter.this$0.patternColor, PorterDuff.Mode.SRC_IN));
                            }
                        }
                    } else {
                        Rect gradientPoints12 = BackgroundGradientDrawable.getGradientPoints(BackgroundGradientDrawable.getGradientOrientation(i8), getMeasuredWidth(), getMeasuredHeight());
                        this.gradientShader = new LinearGradient(gradientPoints12.left, gradientPoints12.top, gradientPoints12.right, gradientPoints12.bottom, new int[]{i, i3}, (float[]) null, Shader.TileMode.CLAMP);
                        this.backgroundDrawable = null;
                        this.imageReceiver.setGradientBitmap(null);
                    }
                } else {
                    this.currentBackgroundColor = i;
                    this.currentGradientColor1 = i3;
                    this.currentGradientColor2 = i5;
                    this.currentGradientColor3 = i7;
                    this.currentGradientAngle = i8;
                    if (i5 != 0) {
                        this.gradientShader = null;
                        motionBackgroundDrawable2 = this.backgroundDrawable;
                        if (motionBackgroundDrawable2 != null) {
                            motionBackgroundDrawable2.setColors(i, i3, i5, i7, 0, false);
                        } else {
                            MotionBackgroundDrawable motionBackgroundDrawable15 = new MotionBackgroundDrawable(i, i3, i5, i7, true, 0, false);
                            this.backgroundDrawable = motionBackgroundDrawable15;
                            motionBackgroundDrawable15.setRoundRadius(AndroidUtilities.dp(6.0f));
                            this.backgroundDrawable.setParentView(this);
                        }
                        if (f < 0.0f) {
                            this.imageReceiver.setGradientBitmap(this.backgroundDrawable.currentBitmap);
                        } else {
                            this.imageReceiver.setGradientBitmap(null);
                            if (Build.VERSION.SDK_INT >= 29) {
                                this.imageReceiver.setBlendMode(BlendMode.SOFT_LIGHT);
                            } else {
                                this.imageReceiver.setColorFilter(new PorterDuffColorFilter(patternsAdapter.this$0.patternColor, PorterDuff.Mode.SRC_IN));
                            }
                        }
                    } else {
                        Rect gradientPoints13 = BackgroundGradientDrawable.getGradientPoints(BackgroundGradientDrawable.getGradientOrientation(i8), getMeasuredWidth(), getMeasuredHeight());
                        this.gradientShader = new LinearGradient(gradientPoints13.left, gradientPoints13.top, gradientPoints13.right, gradientPoints13.bottom, new int[]{i, i3}, (float[]) null, Shader.TileMode.CLAMP);
                        this.backgroundDrawable = null;
                        this.imageReceiver.setGradientBitmap(null);
                    }
                }
                motionBackgroundDrawable = this.backgroundDrawable;
                if (motionBackgroundDrawable != null) {
                    motionBackgroundDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    this.backgroundDrawable.draw(canvas);
                } else {
                    paint = this.backgroundPaint;
                    paint.setShader(this.gradientShader);
                    if (this.gradientShader == null) {
                        paint.setColor(i);
                    }
                    RectF rectF7 = this.rect;
                    rectF7.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    canvas.drawRoundRect(rectF7, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
                }
                super.onDraw(canvas);
                radialProgress2 = this.radialProgress;
                if (radialProgress2.mediaActionDrawable.nextIcon != 4) {
                    radialProgress2.setColors(i9, i9, -1, -1);
                    radialProgress2.draw(canvas);
                }
            }
            defaultAccentColor4 = themePreviewActivity3.backgroundGradientColor3;
            i7 = defaultAccentColor4;
            themePreviewActivity4 = patternsAdapter.this$0;
            if (themePreviewActivity4.screenType == 2) {
                i8 = themePreviewActivity4.backgroundRotation;
            } else {
                i8 = themePreviewActivity4.accent.backgroundRotation;
            }
            i9 = themePreviewActivity4.checkColor;
            if (i3 != 0) {
                this.gradientShader = null;
                this.backgroundDrawable = null;
                this.imageReceiver.setGradientBitmap(null);
            } else if (this.gradientShader != null) {
                this.currentBackgroundColor = i;
                this.currentGradientColor1 = i3;
                this.currentGradientColor2 = i5;
                this.currentGradientColor3 = i7;
                this.currentGradientAngle = i8;
                if (i5 != 0) {
                    this.gradientShader = null;
                    motionBackgroundDrawable2 = this.backgroundDrawable;
                    if (motionBackgroundDrawable2 != null) {
                        motionBackgroundDrawable2.setColors(i, i3, i5, i7, 0, false);
                    } else {
                        MotionBackgroundDrawable motionBackgroundDrawable16 = new MotionBackgroundDrawable(i, i3, i5, i7, true, 0, false);
                        this.backgroundDrawable = motionBackgroundDrawable16;
                        motionBackgroundDrawable16.setRoundRadius(AndroidUtilities.dp(6.0f));
                        this.backgroundDrawable.setParentView(this);
                    }
                    if (f < 0.0f) {
                        this.imageReceiver.setGradientBitmap(this.backgroundDrawable.currentBitmap);
                    } else {
                        this.imageReceiver.setGradientBitmap(null);
                        if (Build.VERSION.SDK_INT >= 29) {
                            this.imageReceiver.setBlendMode(BlendMode.SOFT_LIGHT);
                        } else {
                            this.imageReceiver.setColorFilter(new PorterDuffColorFilter(patternsAdapter.this$0.patternColor, PorterDuff.Mode.SRC_IN));
                        }
                    }
                } else {
                    Rect gradientPoints14 = BackgroundGradientDrawable.getGradientPoints(BackgroundGradientDrawable.getGradientOrientation(i8), getMeasuredWidth(), getMeasuredHeight());
                    this.gradientShader = new LinearGradient(gradientPoints14.left, gradientPoints14.top, gradientPoints14.right, gradientPoints14.bottom, new int[]{i, i3}, (float[]) null, Shader.TileMode.CLAMP);
                    this.backgroundDrawable = null;
                    this.imageReceiver.setGradientBitmap(null);
                }
            } else {
                this.currentBackgroundColor = i;
                this.currentGradientColor1 = i3;
                this.currentGradientColor2 = i5;
                this.currentGradientColor3 = i7;
                this.currentGradientAngle = i8;
                if (i5 != 0) {
                    this.gradientShader = null;
                    motionBackgroundDrawable2 = this.backgroundDrawable;
                    if (motionBackgroundDrawable2 != null) {
                        motionBackgroundDrawable2.setColors(i, i3, i5, i7, 0, false);
                    } else {
                        MotionBackgroundDrawable motionBackgroundDrawable17 = new MotionBackgroundDrawable(i, i3, i5, i7, true, 0, false);
                        this.backgroundDrawable = motionBackgroundDrawable17;
                        motionBackgroundDrawable17.setRoundRadius(AndroidUtilities.dp(6.0f));
                        this.backgroundDrawable.setParentView(this);
                    }
                    if (f < 0.0f) {
                        this.imageReceiver.setGradientBitmap(this.backgroundDrawable.currentBitmap);
                    } else {
                        this.imageReceiver.setGradientBitmap(null);
                        if (Build.VERSION.SDK_INT >= 29) {
                            this.imageReceiver.setBlendMode(BlendMode.SOFT_LIGHT);
                        } else {
                            this.imageReceiver.setColorFilter(new PorterDuffColorFilter(patternsAdapter.this$0.patternColor, PorterDuff.Mode.SRC_IN));
                        }
                    }
                } else {
                    Rect gradientPoints15 = BackgroundGradientDrawable.getGradientPoints(BackgroundGradientDrawable.getGradientOrientation(i8), getMeasuredWidth(), getMeasuredHeight());
                    this.gradientShader = new LinearGradient(gradientPoints15.left, gradientPoints15.top, gradientPoints15.right, gradientPoints15.bottom, new int[]{i, i3}, (float[]) null, Shader.TileMode.CLAMP);
                    this.backgroundDrawable = null;
                    this.imageReceiver.setGradientBitmap(null);
                }
            }
            motionBackgroundDrawable = this.backgroundDrawable;
            if (motionBackgroundDrawable != null) {
                motionBackgroundDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                this.backgroundDrawable.draw(canvas);
            } else {
                paint = this.backgroundPaint;
                paint.setShader(this.gradientShader);
                if (this.gradientShader == null) {
                    paint.setColor(i);
                }
                RectF rectF8 = this.rect;
                rectF8.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF8, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
            }
            super.onDraw(canvas);
            radialProgress2 = this.radialProgress;
            if (radialProgress2.mediaActionDrawable.nextIcon != 4) {
                radialProgress2.setColors(i9, i9, -1, -1);
                radialProgress2.draw(canvas);
            }
        }
        defaultAccentColor = themePreviewActivity5.backgroundColor;
        i = defaultAccentColor;
        themePreviewActivity = patternsAdapter.this$0;
        if (themePreviewActivity.screenType == 2) {
            defaultAccentColor2 = Theme.getDefaultAccentColor(Theme.key_chat_wallpaper_gradient_to1);
            i2 = (int) patternsAdapter.this$0.accent.backgroundGradientOverrideColor1;
            if (i2 != 0) {
                i3 = i2;
            }
            themePreviewActivity2 = patternsAdapter.this$0;
            if (themePreviewActivity2.screenType == 2) {
                defaultAccentColor3 = Theme.getDefaultAccentColor(Theme.key_chat_wallpaper_gradient_to2);
                i4 = (int) patternsAdapter.this$0.accent.backgroundGradientOverrideColor2;
                if (i4 != 0) {
                    i5 = i4;
                }
                themePreviewActivity3 = patternsAdapter.this$0;
                if (themePreviewActivity3.screenType == 2) {
                    defaultAccentColor4 = Theme.getDefaultAccentColor(Theme.key_chat_wallpaper_gradient_to3);
                    i6 = (int) patternsAdapter.this$0.accent.backgroundGradientOverrideColor3;
                    if (i6 != 0) {
                        i7 = i6;
                    }
                    themePreviewActivity4 = patternsAdapter.this$0;
                    if (themePreviewActivity4.screenType == 2) {
                        i8 = themePreviewActivity4.backgroundRotation;
                    } else {
                        i8 = themePreviewActivity4.accent.backgroundRotation;
                    }
                    i9 = themePreviewActivity4.checkColor;
                    if (i3 != 0) {
                        this.gradientShader = null;
                        this.backgroundDrawable = null;
                        this.imageReceiver.setGradientBitmap(null);
                    } else if (this.gradientShader != null) {
                        this.currentBackgroundColor = i;
                        this.currentGradientColor1 = i3;
                        this.currentGradientColor2 = i5;
                        this.currentGradientColor3 = i7;
                        this.currentGradientAngle = i8;
                        if (i5 != 0) {
                            this.gradientShader = null;
                            motionBackgroundDrawable2 = this.backgroundDrawable;
                            if (motionBackgroundDrawable2 != null) {
                                motionBackgroundDrawable2.setColors(i, i3, i5, i7, 0, false);
                            } else {
                                MotionBackgroundDrawable motionBackgroundDrawable18 = new MotionBackgroundDrawable(i, i3, i5, i7, true, 0, false);
                                this.backgroundDrawable = motionBackgroundDrawable18;
                                motionBackgroundDrawable18.setRoundRadius(AndroidUtilities.dp(6.0f));
                                this.backgroundDrawable.setParentView(this);
                            }
                            if (f < 0.0f) {
                                this.imageReceiver.setGradientBitmap(this.backgroundDrawable.currentBitmap);
                            } else {
                                this.imageReceiver.setGradientBitmap(null);
                                if (Build.VERSION.SDK_INT >= 29) {
                                    this.imageReceiver.setBlendMode(BlendMode.SOFT_LIGHT);
                                } else {
                                    this.imageReceiver.setColorFilter(new PorterDuffColorFilter(patternsAdapter.this$0.patternColor, PorterDuff.Mode.SRC_IN));
                                }
                            }
                        } else {
                            Rect gradientPoints16 = BackgroundGradientDrawable.getGradientPoints(BackgroundGradientDrawable.getGradientOrientation(i8), getMeasuredWidth(), getMeasuredHeight());
                            this.gradientShader = new LinearGradient(gradientPoints16.left, gradientPoints16.top, gradientPoints16.right, gradientPoints16.bottom, new int[]{i, i3}, (float[]) null, Shader.TileMode.CLAMP);
                            this.backgroundDrawable = null;
                            this.imageReceiver.setGradientBitmap(null);
                        }
                    } else {
                        this.currentBackgroundColor = i;
                        this.currentGradientColor1 = i3;
                        this.currentGradientColor2 = i5;
                        this.currentGradientColor3 = i7;
                        this.currentGradientAngle = i8;
                        if (i5 != 0) {
                            this.gradientShader = null;
                            motionBackgroundDrawable2 = this.backgroundDrawable;
                            if (motionBackgroundDrawable2 != null) {
                                motionBackgroundDrawable2.setColors(i, i3, i5, i7, 0, false);
                            } else {
                                MotionBackgroundDrawable motionBackgroundDrawable19 = new MotionBackgroundDrawable(i, i3, i5, i7, true, 0, false);
                                this.backgroundDrawable = motionBackgroundDrawable19;
                                motionBackgroundDrawable19.setRoundRadius(AndroidUtilities.dp(6.0f));
                                this.backgroundDrawable.setParentView(this);
                            }
                            if (f < 0.0f) {
                                this.imageReceiver.setGradientBitmap(this.backgroundDrawable.currentBitmap);
                            } else {
                                this.imageReceiver.setGradientBitmap(null);
                                if (Build.VERSION.SDK_INT >= 29) {
                                    this.imageReceiver.setBlendMode(BlendMode.SOFT_LIGHT);
                                } else {
                                    this.imageReceiver.setColorFilter(new PorterDuffColorFilter(patternsAdapter.this$0.patternColor, PorterDuff.Mode.SRC_IN));
                                }
                            }
                        } else {
                            Rect gradientPoints17 = BackgroundGradientDrawable.getGradientPoints(BackgroundGradientDrawable.getGradientOrientation(i8), getMeasuredWidth(), getMeasuredHeight());
                            this.gradientShader = new LinearGradient(gradientPoints17.left, gradientPoints17.top, gradientPoints17.right, gradientPoints17.bottom, new int[]{i, i3}, (float[]) null, Shader.TileMode.CLAMP);
                            this.backgroundDrawable = null;
                            this.imageReceiver.setGradientBitmap(null);
                        }
                    }
                    motionBackgroundDrawable = this.backgroundDrawable;
                    if (motionBackgroundDrawable != null) {
                        motionBackgroundDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                        this.backgroundDrawable.draw(canvas);
                    } else {
                        paint = this.backgroundPaint;
                        paint.setShader(this.gradientShader);
                        if (this.gradientShader == null) {
                            paint.setColor(i);
                        }
                        RectF rectF9 = this.rect;
                        rectF9.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                        canvas.drawRoundRect(rectF9, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
                    }
                    super.onDraw(canvas);
                    radialProgress2 = this.radialProgress;
                    if (radialProgress2.mediaActionDrawable.nextIcon != 4) {
                        radialProgress2.setColors(i9, i9, -1, -1);
                        radialProgress2.draw(canvas);
                    }
                }
                defaultAccentColor4 = themePreviewActivity3.backgroundGradientColor3;
                i7 = defaultAccentColor4;
                themePreviewActivity4 = patternsAdapter.this$0;
                if (themePreviewActivity4.screenType == 2) {
                    i8 = themePreviewActivity4.backgroundRotation;
                } else {
                    i8 = themePreviewActivity4.accent.backgroundRotation;
                }
                i9 = themePreviewActivity4.checkColor;
                if (i3 != 0) {
                    this.gradientShader = null;
                    this.backgroundDrawable = null;
                    this.imageReceiver.setGradientBitmap(null);
                } else if (this.gradientShader != null) {
                    this.currentBackgroundColor = i;
                    this.currentGradientColor1 = i3;
                    this.currentGradientColor2 = i5;
                    this.currentGradientColor3 = i7;
                    this.currentGradientAngle = i8;
                    if (i5 != 0) {
                        this.gradientShader = null;
                        motionBackgroundDrawable2 = this.backgroundDrawable;
                        if (motionBackgroundDrawable2 != null) {
                            motionBackgroundDrawable2.setColors(i, i3, i5, i7, 0, false);
                        } else {
                            MotionBackgroundDrawable motionBackgroundDrawable110 = new MotionBackgroundDrawable(i, i3, i5, i7, true, 0, false);
                            this.backgroundDrawable = motionBackgroundDrawable110;
                            motionBackgroundDrawable110.setRoundRadius(AndroidUtilities.dp(6.0f));
                            this.backgroundDrawable.setParentView(this);
                        }
                        if (f < 0.0f) {
                            this.imageReceiver.setGradientBitmap(this.backgroundDrawable.currentBitmap);
                        } else {
                            this.imageReceiver.setGradientBitmap(null);
                            if (Build.VERSION.SDK_INT >= 29) {
                                this.imageReceiver.setBlendMode(BlendMode.SOFT_LIGHT);
                            } else {
                                this.imageReceiver.setColorFilter(new PorterDuffColorFilter(patternsAdapter.this$0.patternColor, PorterDuff.Mode.SRC_IN));
                            }
                        }
                    } else {
                        Rect gradientPoints18 = BackgroundGradientDrawable.getGradientPoints(BackgroundGradientDrawable.getGradientOrientation(i8), getMeasuredWidth(), getMeasuredHeight());
                        this.gradientShader = new LinearGradient(gradientPoints18.left, gradientPoints18.top, gradientPoints18.right, gradientPoints18.bottom, new int[]{i, i3}, (float[]) null, Shader.TileMode.CLAMP);
                        this.backgroundDrawable = null;
                        this.imageReceiver.setGradientBitmap(null);
                    }
                } else {
                    this.currentBackgroundColor = i;
                    this.currentGradientColor1 = i3;
                    this.currentGradientColor2 = i5;
                    this.currentGradientColor3 = i7;
                    this.currentGradientAngle = i8;
                    if (i5 != 0) {
                        this.gradientShader = null;
                        motionBackgroundDrawable2 = this.backgroundDrawable;
                        if (motionBackgroundDrawable2 != null) {
                            motionBackgroundDrawable2.setColors(i, i3, i5, i7, 0, false);
                        } else {
                            MotionBackgroundDrawable motionBackgroundDrawable111 = new MotionBackgroundDrawable(i, i3, i5, i7, true, 0, false);
                            this.backgroundDrawable = motionBackgroundDrawable111;
                            motionBackgroundDrawable111.setRoundRadius(AndroidUtilities.dp(6.0f));
                            this.backgroundDrawable.setParentView(this);
                        }
                        if (f < 0.0f) {
                            this.imageReceiver.setGradientBitmap(this.backgroundDrawable.currentBitmap);
                        } else {
                            this.imageReceiver.setGradientBitmap(null);
                            if (Build.VERSION.SDK_INT >= 29) {
                                this.imageReceiver.setBlendMode(BlendMode.SOFT_LIGHT);
                            } else {
                                this.imageReceiver.setColorFilter(new PorterDuffColorFilter(patternsAdapter.this$0.patternColor, PorterDuff.Mode.SRC_IN));
                            }
                        }
                    } else {
                        Rect gradientPoints19 = BackgroundGradientDrawable.getGradientPoints(BackgroundGradientDrawable.getGradientOrientation(i8), getMeasuredWidth(), getMeasuredHeight());
                        this.gradientShader = new LinearGradient(gradientPoints19.left, gradientPoints19.top, gradientPoints19.right, gradientPoints19.bottom, new int[]{i, i3}, (float[]) null, Shader.TileMode.CLAMP);
                        this.backgroundDrawable = null;
                        this.imageReceiver.setGradientBitmap(null);
                    }
                }
                motionBackgroundDrawable = this.backgroundDrawable;
                if (motionBackgroundDrawable != null) {
                    motionBackgroundDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    this.backgroundDrawable.draw(canvas);
                } else {
                    paint = this.backgroundPaint;
                    paint.setShader(this.gradientShader);
                    if (this.gradientShader == null) {
                        paint.setColor(i);
                    }
                    RectF rectF10 = this.rect;
                    rectF10.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    canvas.drawRoundRect(rectF10, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
                }
                super.onDraw(canvas);
                radialProgress2 = this.radialProgress;
                if (radialProgress2.mediaActionDrawable.nextIcon != 4) {
                    radialProgress2.setColors(i9, i9, -1, -1);
                    radialProgress2.draw(canvas);
                }
            }
            defaultAccentColor3 = themePreviewActivity2.backgroundGradientColor2;
            i5 = defaultAccentColor3;
            themePreviewActivity3 = patternsAdapter.this$0;
            if (themePreviewActivity3.screenType == 2) {
                defaultAccentColor4 = Theme.getDefaultAccentColor(Theme.key_chat_wallpaper_gradient_to3);
                i6 = (int) patternsAdapter.this$0.accent.backgroundGradientOverrideColor3;
                if (i6 != 0) {
                    i7 = i6;
                }
                themePreviewActivity4 = patternsAdapter.this$0;
                if (themePreviewActivity4.screenType == 2) {
                    i8 = themePreviewActivity4.backgroundRotation;
                } else {
                    i8 = themePreviewActivity4.accent.backgroundRotation;
                }
                i9 = themePreviewActivity4.checkColor;
                if (i3 != 0) {
                    this.gradientShader = null;
                    this.backgroundDrawable = null;
                    this.imageReceiver.setGradientBitmap(null);
                } else if (this.gradientShader != null) {
                    this.currentBackgroundColor = i;
                    this.currentGradientColor1 = i3;
                    this.currentGradientColor2 = i5;
                    this.currentGradientColor3 = i7;
                    this.currentGradientAngle = i8;
                    if (i5 != 0) {
                        this.gradientShader = null;
                        motionBackgroundDrawable2 = this.backgroundDrawable;
                        if (motionBackgroundDrawable2 != null) {
                            motionBackgroundDrawable2.setColors(i, i3, i5, i7, 0, false);
                        } else {
                            MotionBackgroundDrawable motionBackgroundDrawable112 = new MotionBackgroundDrawable(i, i3, i5, i7, true, 0, false);
                            this.backgroundDrawable = motionBackgroundDrawable112;
                            motionBackgroundDrawable112.setRoundRadius(AndroidUtilities.dp(6.0f));
                            this.backgroundDrawable.setParentView(this);
                        }
                        if (f < 0.0f) {
                            this.imageReceiver.setGradientBitmap(this.backgroundDrawable.currentBitmap);
                        } else {
                            this.imageReceiver.setGradientBitmap(null);
                            if (Build.VERSION.SDK_INT >= 29) {
                                this.imageReceiver.setBlendMode(BlendMode.SOFT_LIGHT);
                            } else {
                                this.imageReceiver.setColorFilter(new PorterDuffColorFilter(patternsAdapter.this$0.patternColor, PorterDuff.Mode.SRC_IN));
                            }
                        }
                    } else {
                        Rect gradientPoints110 = BackgroundGradientDrawable.getGradientPoints(BackgroundGradientDrawable.getGradientOrientation(i8), getMeasuredWidth(), getMeasuredHeight());
                        this.gradientShader = new LinearGradient(gradientPoints110.left, gradientPoints110.top, gradientPoints110.right, gradientPoints110.bottom, new int[]{i, i3}, (float[]) null, Shader.TileMode.CLAMP);
                        this.backgroundDrawable = null;
                        this.imageReceiver.setGradientBitmap(null);
                    }
                } else {
                    this.currentBackgroundColor = i;
                    this.currentGradientColor1 = i3;
                    this.currentGradientColor2 = i5;
                    this.currentGradientColor3 = i7;
                    this.currentGradientAngle = i8;
                    if (i5 != 0) {
                        this.gradientShader = null;
                        motionBackgroundDrawable2 = this.backgroundDrawable;
                        if (motionBackgroundDrawable2 != null) {
                            motionBackgroundDrawable2.setColors(i, i3, i5, i7, 0, false);
                        } else {
                            MotionBackgroundDrawable motionBackgroundDrawable113 = new MotionBackgroundDrawable(i, i3, i5, i7, true, 0, false);
                            this.backgroundDrawable = motionBackgroundDrawable113;
                            motionBackgroundDrawable113.setRoundRadius(AndroidUtilities.dp(6.0f));
                            this.backgroundDrawable.setParentView(this);
                        }
                        if (f < 0.0f) {
                            this.imageReceiver.setGradientBitmap(this.backgroundDrawable.currentBitmap);
                        } else {
                            this.imageReceiver.setGradientBitmap(null);
                            if (Build.VERSION.SDK_INT >= 29) {
                                this.imageReceiver.setBlendMode(BlendMode.SOFT_LIGHT);
                            } else {
                                this.imageReceiver.setColorFilter(new PorterDuffColorFilter(patternsAdapter.this$0.patternColor, PorterDuff.Mode.SRC_IN));
                            }
                        }
                    } else {
                        Rect gradientPoints111 = BackgroundGradientDrawable.getGradientPoints(BackgroundGradientDrawable.getGradientOrientation(i8), getMeasuredWidth(), getMeasuredHeight());
                        this.gradientShader = new LinearGradient(gradientPoints111.left, gradientPoints111.top, gradientPoints111.right, gradientPoints111.bottom, new int[]{i, i3}, (float[]) null, Shader.TileMode.CLAMP);
                        this.backgroundDrawable = null;
                        this.imageReceiver.setGradientBitmap(null);
                    }
                }
                motionBackgroundDrawable = this.backgroundDrawable;
                if (motionBackgroundDrawable != null) {
                    motionBackgroundDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    this.backgroundDrawable.draw(canvas);
                } else {
                    paint = this.backgroundPaint;
                    paint.setShader(this.gradientShader);
                    if (this.gradientShader == null) {
                        paint.setColor(i);
                    }
                    RectF rectF11 = this.rect;
                    rectF11.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    canvas.drawRoundRect(rectF11, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
                }
                super.onDraw(canvas);
                radialProgress2 = this.radialProgress;
                if (radialProgress2.mediaActionDrawable.nextIcon != 4) {
                    radialProgress2.setColors(i9, i9, -1, -1);
                    radialProgress2.draw(canvas);
                }
            }
            defaultAccentColor4 = themePreviewActivity3.backgroundGradientColor3;
            i7 = defaultAccentColor4;
            themePreviewActivity4 = patternsAdapter.this$0;
            if (themePreviewActivity4.screenType == 2) {
                i8 = themePreviewActivity4.backgroundRotation;
            } else {
                i8 = themePreviewActivity4.accent.backgroundRotation;
            }
            i9 = themePreviewActivity4.checkColor;
            if (i3 != 0) {
                this.gradientShader = null;
                this.backgroundDrawable = null;
                this.imageReceiver.setGradientBitmap(null);
            } else if (this.gradientShader != null) {
                this.currentBackgroundColor = i;
                this.currentGradientColor1 = i3;
                this.currentGradientColor2 = i5;
                this.currentGradientColor3 = i7;
                this.currentGradientAngle = i8;
                if (i5 != 0) {
                    this.gradientShader = null;
                    motionBackgroundDrawable2 = this.backgroundDrawable;
                    if (motionBackgroundDrawable2 != null) {
                        motionBackgroundDrawable2.setColors(i, i3, i5, i7, 0, false);
                    } else {
                        MotionBackgroundDrawable motionBackgroundDrawable114 = new MotionBackgroundDrawable(i, i3, i5, i7, true, 0, false);
                        this.backgroundDrawable = motionBackgroundDrawable114;
                        motionBackgroundDrawable114.setRoundRadius(AndroidUtilities.dp(6.0f));
                        this.backgroundDrawable.setParentView(this);
                    }
                    if (f < 0.0f) {
                        this.imageReceiver.setGradientBitmap(this.backgroundDrawable.currentBitmap);
                    } else {
                        this.imageReceiver.setGradientBitmap(null);
                        if (Build.VERSION.SDK_INT >= 29) {
                            this.imageReceiver.setBlendMode(BlendMode.SOFT_LIGHT);
                        } else {
                            this.imageReceiver.setColorFilter(new PorterDuffColorFilter(patternsAdapter.this$0.patternColor, PorterDuff.Mode.SRC_IN));
                        }
                    }
                } else {
                    Rect gradientPoints112 = BackgroundGradientDrawable.getGradientPoints(BackgroundGradientDrawable.getGradientOrientation(i8), getMeasuredWidth(), getMeasuredHeight());
                    this.gradientShader = new LinearGradient(gradientPoints112.left, gradientPoints112.top, gradientPoints112.right, gradientPoints112.bottom, new int[]{i, i3}, (float[]) null, Shader.TileMode.CLAMP);
                    this.backgroundDrawable = null;
                    this.imageReceiver.setGradientBitmap(null);
                }
            } else {
                this.currentBackgroundColor = i;
                this.currentGradientColor1 = i3;
                this.currentGradientColor2 = i5;
                this.currentGradientColor3 = i7;
                this.currentGradientAngle = i8;
                if (i5 != 0) {
                    this.gradientShader = null;
                    motionBackgroundDrawable2 = this.backgroundDrawable;
                    if (motionBackgroundDrawable2 != null) {
                        motionBackgroundDrawable2.setColors(i, i3, i5, i7, 0, false);
                    } else {
                        MotionBackgroundDrawable motionBackgroundDrawable115 = new MotionBackgroundDrawable(i, i3, i5, i7, true, 0, false);
                        this.backgroundDrawable = motionBackgroundDrawable115;
                        motionBackgroundDrawable115.setRoundRadius(AndroidUtilities.dp(6.0f));
                        this.backgroundDrawable.setParentView(this);
                    }
                    if (f < 0.0f) {
                        this.imageReceiver.setGradientBitmap(this.backgroundDrawable.currentBitmap);
                    } else {
                        this.imageReceiver.setGradientBitmap(null);
                        if (Build.VERSION.SDK_INT >= 29) {
                            this.imageReceiver.setBlendMode(BlendMode.SOFT_LIGHT);
                        } else {
                            this.imageReceiver.setColorFilter(new PorterDuffColorFilter(patternsAdapter.this$0.patternColor, PorterDuff.Mode.SRC_IN));
                        }
                    }
                } else {
                    Rect gradientPoints113 = BackgroundGradientDrawable.getGradientPoints(BackgroundGradientDrawable.getGradientOrientation(i8), getMeasuredWidth(), getMeasuredHeight());
                    this.gradientShader = new LinearGradient(gradientPoints113.left, gradientPoints113.top, gradientPoints113.right, gradientPoints113.bottom, new int[]{i, i3}, (float[]) null, Shader.TileMode.CLAMP);
                    this.backgroundDrawable = null;
                    this.imageReceiver.setGradientBitmap(null);
                }
            }
            motionBackgroundDrawable = this.backgroundDrawable;
            if (motionBackgroundDrawable != null) {
                motionBackgroundDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                this.backgroundDrawable.draw(canvas);
            } else {
                paint = this.backgroundPaint;
                paint.setShader(this.gradientShader);
                if (this.gradientShader == null) {
                    paint.setColor(i);
                }
                RectF rectF12 = this.rect;
                rectF12.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF12, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
            }
            super.onDraw(canvas);
            radialProgress2 = this.radialProgress;
            if (radialProgress2.mediaActionDrawable.nextIcon != 4) {
                radialProgress2.setColors(i9, i9, -1, -1);
                radialProgress2.draw(canvas);
            }
        }
        defaultAccentColor2 = themePreviewActivity.backgroundGradientColor1;
        i3 = defaultAccentColor2;
        themePreviewActivity2 = patternsAdapter.this$0;
        if (themePreviewActivity2.screenType == 2) {
            defaultAccentColor3 = Theme.getDefaultAccentColor(Theme.key_chat_wallpaper_gradient_to2);
            i4 = (int) patternsAdapter.this$0.accent.backgroundGradientOverrideColor2;
            if (i4 != 0) {
                i5 = i4;
            }
            themePreviewActivity3 = patternsAdapter.this$0;
            if (themePreviewActivity3.screenType == 2) {
                defaultAccentColor4 = Theme.getDefaultAccentColor(Theme.key_chat_wallpaper_gradient_to3);
                i6 = (int) patternsAdapter.this$0.accent.backgroundGradientOverrideColor3;
                if (i6 != 0) {
                    i7 = i6;
                }
                themePreviewActivity4 = patternsAdapter.this$0;
                if (themePreviewActivity4.screenType == 2) {
                    i8 = themePreviewActivity4.backgroundRotation;
                } else {
                    i8 = themePreviewActivity4.accent.backgroundRotation;
                }
                i9 = themePreviewActivity4.checkColor;
                if (i3 != 0) {
                    this.gradientShader = null;
                    this.backgroundDrawable = null;
                    this.imageReceiver.setGradientBitmap(null);
                } else if (this.gradientShader != null) {
                    this.currentBackgroundColor = i;
                    this.currentGradientColor1 = i3;
                    this.currentGradientColor2 = i5;
                    this.currentGradientColor3 = i7;
                    this.currentGradientAngle = i8;
                    if (i5 != 0) {
                        this.gradientShader = null;
                        motionBackgroundDrawable2 = this.backgroundDrawable;
                        if (motionBackgroundDrawable2 != null) {
                            motionBackgroundDrawable2.setColors(i, i3, i5, i7, 0, false);
                        } else {
                            MotionBackgroundDrawable motionBackgroundDrawable116 = new MotionBackgroundDrawable(i, i3, i5, i7, true, 0, false);
                            this.backgroundDrawable = motionBackgroundDrawable116;
                            motionBackgroundDrawable116.setRoundRadius(AndroidUtilities.dp(6.0f));
                            this.backgroundDrawable.setParentView(this);
                        }
                        if (f < 0.0f) {
                            this.imageReceiver.setGradientBitmap(this.backgroundDrawable.currentBitmap);
                        } else {
                            this.imageReceiver.setGradientBitmap(null);
                            if (Build.VERSION.SDK_INT >= 29) {
                                this.imageReceiver.setBlendMode(BlendMode.SOFT_LIGHT);
                            } else {
                                this.imageReceiver.setColorFilter(new PorterDuffColorFilter(patternsAdapter.this$0.patternColor, PorterDuff.Mode.SRC_IN));
                            }
                        }
                    } else {
                        Rect gradientPoints114 = BackgroundGradientDrawable.getGradientPoints(BackgroundGradientDrawable.getGradientOrientation(i8), getMeasuredWidth(), getMeasuredHeight());
                        this.gradientShader = new LinearGradient(gradientPoints114.left, gradientPoints114.top, gradientPoints114.right, gradientPoints114.bottom, new int[]{i, i3}, (float[]) null, Shader.TileMode.CLAMP);
                        this.backgroundDrawable = null;
                        this.imageReceiver.setGradientBitmap(null);
                    }
                } else {
                    this.currentBackgroundColor = i;
                    this.currentGradientColor1 = i3;
                    this.currentGradientColor2 = i5;
                    this.currentGradientColor3 = i7;
                    this.currentGradientAngle = i8;
                    if (i5 != 0) {
                        this.gradientShader = null;
                        motionBackgroundDrawable2 = this.backgroundDrawable;
                        if (motionBackgroundDrawable2 != null) {
                            motionBackgroundDrawable2.setColors(i, i3, i5, i7, 0, false);
                        } else {
                            MotionBackgroundDrawable motionBackgroundDrawable117 = new MotionBackgroundDrawable(i, i3, i5, i7, true, 0, false);
                            this.backgroundDrawable = motionBackgroundDrawable117;
                            motionBackgroundDrawable117.setRoundRadius(AndroidUtilities.dp(6.0f));
                            this.backgroundDrawable.setParentView(this);
                        }
                        if (f < 0.0f) {
                            this.imageReceiver.setGradientBitmap(this.backgroundDrawable.currentBitmap);
                        } else {
                            this.imageReceiver.setGradientBitmap(null);
                            if (Build.VERSION.SDK_INT >= 29) {
                                this.imageReceiver.setBlendMode(BlendMode.SOFT_LIGHT);
                            } else {
                                this.imageReceiver.setColorFilter(new PorterDuffColorFilter(patternsAdapter.this$0.patternColor, PorterDuff.Mode.SRC_IN));
                            }
                        }
                    } else {
                        Rect gradientPoints115 = BackgroundGradientDrawable.getGradientPoints(BackgroundGradientDrawable.getGradientOrientation(i8), getMeasuredWidth(), getMeasuredHeight());
                        this.gradientShader = new LinearGradient(gradientPoints115.left, gradientPoints115.top, gradientPoints115.right, gradientPoints115.bottom, new int[]{i, i3}, (float[]) null, Shader.TileMode.CLAMP);
                        this.backgroundDrawable = null;
                        this.imageReceiver.setGradientBitmap(null);
                    }
                }
                motionBackgroundDrawable = this.backgroundDrawable;
                if (motionBackgroundDrawable != null) {
                    motionBackgroundDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    this.backgroundDrawable.draw(canvas);
                } else {
                    paint = this.backgroundPaint;
                    paint.setShader(this.gradientShader);
                    if (this.gradientShader == null) {
                        paint.setColor(i);
                    }
                    RectF rectF13 = this.rect;
                    rectF13.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    canvas.drawRoundRect(rectF13, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
                }
                super.onDraw(canvas);
                radialProgress2 = this.radialProgress;
                if (radialProgress2.mediaActionDrawable.nextIcon != 4) {
                    radialProgress2.setColors(i9, i9, -1, -1);
                    radialProgress2.draw(canvas);
                }
            }
            defaultAccentColor4 = themePreviewActivity3.backgroundGradientColor3;
            i7 = defaultAccentColor4;
            themePreviewActivity4 = patternsAdapter.this$0;
            if (themePreviewActivity4.screenType == 2) {
                i8 = themePreviewActivity4.backgroundRotation;
            } else {
                i8 = themePreviewActivity4.accent.backgroundRotation;
            }
            i9 = themePreviewActivity4.checkColor;
            if (i3 != 0) {
                this.gradientShader = null;
                this.backgroundDrawable = null;
                this.imageReceiver.setGradientBitmap(null);
            } else if (this.gradientShader != null) {
                this.currentBackgroundColor = i;
                this.currentGradientColor1 = i3;
                this.currentGradientColor2 = i5;
                this.currentGradientColor3 = i7;
                this.currentGradientAngle = i8;
                if (i5 != 0) {
                    this.gradientShader = null;
                    motionBackgroundDrawable2 = this.backgroundDrawable;
                    if (motionBackgroundDrawable2 != null) {
                        motionBackgroundDrawable2.setColors(i, i3, i5, i7, 0, false);
                    } else {
                        MotionBackgroundDrawable motionBackgroundDrawable118 = new MotionBackgroundDrawable(i, i3, i5, i7, true, 0, false);
                        this.backgroundDrawable = motionBackgroundDrawable118;
                        motionBackgroundDrawable118.setRoundRadius(AndroidUtilities.dp(6.0f));
                        this.backgroundDrawable.setParentView(this);
                    }
                    if (f < 0.0f) {
                        this.imageReceiver.setGradientBitmap(this.backgroundDrawable.currentBitmap);
                    } else {
                        this.imageReceiver.setGradientBitmap(null);
                        if (Build.VERSION.SDK_INT >= 29) {
                            this.imageReceiver.setBlendMode(BlendMode.SOFT_LIGHT);
                        } else {
                            this.imageReceiver.setColorFilter(new PorterDuffColorFilter(patternsAdapter.this$0.patternColor, PorterDuff.Mode.SRC_IN));
                        }
                    }
                } else {
                    Rect gradientPoints116 = BackgroundGradientDrawable.getGradientPoints(BackgroundGradientDrawable.getGradientOrientation(i8), getMeasuredWidth(), getMeasuredHeight());
                    this.gradientShader = new LinearGradient(gradientPoints116.left, gradientPoints116.top, gradientPoints116.right, gradientPoints116.bottom, new int[]{i, i3}, (float[]) null, Shader.TileMode.CLAMP);
                    this.backgroundDrawable = null;
                    this.imageReceiver.setGradientBitmap(null);
                }
            } else {
                this.currentBackgroundColor = i;
                this.currentGradientColor1 = i3;
                this.currentGradientColor2 = i5;
                this.currentGradientColor3 = i7;
                this.currentGradientAngle = i8;
                if (i5 != 0) {
                    this.gradientShader = null;
                    motionBackgroundDrawable2 = this.backgroundDrawable;
                    if (motionBackgroundDrawable2 != null) {
                        motionBackgroundDrawable2.setColors(i, i3, i5, i7, 0, false);
                    } else {
                        MotionBackgroundDrawable motionBackgroundDrawable119 = new MotionBackgroundDrawable(i, i3, i5, i7, true, 0, false);
                        this.backgroundDrawable = motionBackgroundDrawable119;
                        motionBackgroundDrawable119.setRoundRadius(AndroidUtilities.dp(6.0f));
                        this.backgroundDrawable.setParentView(this);
                    }
                    if (f < 0.0f) {
                        this.imageReceiver.setGradientBitmap(this.backgroundDrawable.currentBitmap);
                    } else {
                        this.imageReceiver.setGradientBitmap(null);
                        if (Build.VERSION.SDK_INT >= 29) {
                            this.imageReceiver.setBlendMode(BlendMode.SOFT_LIGHT);
                        } else {
                            this.imageReceiver.setColorFilter(new PorterDuffColorFilter(patternsAdapter.this$0.patternColor, PorterDuff.Mode.SRC_IN));
                        }
                    }
                } else {
                    Rect gradientPoints117 = BackgroundGradientDrawable.getGradientPoints(BackgroundGradientDrawable.getGradientOrientation(i8), getMeasuredWidth(), getMeasuredHeight());
                    this.gradientShader = new LinearGradient(gradientPoints117.left, gradientPoints117.top, gradientPoints117.right, gradientPoints117.bottom, new int[]{i, i3}, (float[]) null, Shader.TileMode.CLAMP);
                    this.backgroundDrawable = null;
                    this.imageReceiver.setGradientBitmap(null);
                }
            }
            motionBackgroundDrawable = this.backgroundDrawable;
            if (motionBackgroundDrawable != null) {
                motionBackgroundDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                this.backgroundDrawable.draw(canvas);
            } else {
                paint = this.backgroundPaint;
                paint.setShader(this.gradientShader);
                if (this.gradientShader == null) {
                    paint.setColor(i);
                }
                RectF rectF14 = this.rect;
                rectF14.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF14, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
            }
            super.onDraw(canvas);
            radialProgress2 = this.radialProgress;
            if (radialProgress2.mediaActionDrawable.nextIcon != 4) {
                radialProgress2.setColors(i9, i9, -1, -1);
                radialProgress2.draw(canvas);
            }
        }
        defaultAccentColor3 = themePreviewActivity2.backgroundGradientColor2;
        i5 = defaultAccentColor3;
        themePreviewActivity3 = patternsAdapter.this$0;
        if (themePreviewActivity3.screenType == 2) {
            defaultAccentColor4 = Theme.getDefaultAccentColor(Theme.key_chat_wallpaper_gradient_to3);
            i6 = (int) patternsAdapter.this$0.accent.backgroundGradientOverrideColor3;
            if (i6 != 0) {
                i7 = i6;
            }
            themePreviewActivity4 = patternsAdapter.this$0;
            if (themePreviewActivity4.screenType == 2) {
                i8 = themePreviewActivity4.backgroundRotation;
            } else {
                i8 = themePreviewActivity4.accent.backgroundRotation;
            }
            i9 = themePreviewActivity4.checkColor;
            if (i3 != 0) {
                this.gradientShader = null;
                this.backgroundDrawable = null;
                this.imageReceiver.setGradientBitmap(null);
            } else if (this.gradientShader != null) {
                this.currentBackgroundColor = i;
                this.currentGradientColor1 = i3;
                this.currentGradientColor2 = i5;
                this.currentGradientColor3 = i7;
                this.currentGradientAngle = i8;
                if (i5 != 0) {
                    this.gradientShader = null;
                    motionBackgroundDrawable2 = this.backgroundDrawable;
                    if (motionBackgroundDrawable2 != null) {
                        motionBackgroundDrawable2.setColors(i, i3, i5, i7, 0, false);
                    } else {
                        MotionBackgroundDrawable motionBackgroundDrawable1110 = new MotionBackgroundDrawable(i, i3, i5, i7, true, 0, false);
                        this.backgroundDrawable = motionBackgroundDrawable1110;
                        motionBackgroundDrawable1110.setRoundRadius(AndroidUtilities.dp(6.0f));
                        this.backgroundDrawable.setParentView(this);
                    }
                    if (f < 0.0f) {
                        this.imageReceiver.setGradientBitmap(this.backgroundDrawable.currentBitmap);
                    } else {
                        this.imageReceiver.setGradientBitmap(null);
                        if (Build.VERSION.SDK_INT >= 29) {
                            this.imageReceiver.setBlendMode(BlendMode.SOFT_LIGHT);
                        } else {
                            this.imageReceiver.setColorFilter(new PorterDuffColorFilter(patternsAdapter.this$0.patternColor, PorterDuff.Mode.SRC_IN));
                        }
                    }
                } else {
                    Rect gradientPoints118 = BackgroundGradientDrawable.getGradientPoints(BackgroundGradientDrawable.getGradientOrientation(i8), getMeasuredWidth(), getMeasuredHeight());
                    this.gradientShader = new LinearGradient(gradientPoints118.left, gradientPoints118.top, gradientPoints118.right, gradientPoints118.bottom, new int[]{i, i3}, (float[]) null, Shader.TileMode.CLAMP);
                    this.backgroundDrawable = null;
                    this.imageReceiver.setGradientBitmap(null);
                }
            } else {
                this.currentBackgroundColor = i;
                this.currentGradientColor1 = i3;
                this.currentGradientColor2 = i5;
                this.currentGradientColor3 = i7;
                this.currentGradientAngle = i8;
                if (i5 != 0) {
                    this.gradientShader = null;
                    motionBackgroundDrawable2 = this.backgroundDrawable;
                    if (motionBackgroundDrawable2 != null) {
                        motionBackgroundDrawable2.setColors(i, i3, i5, i7, 0, false);
                    } else {
                        MotionBackgroundDrawable motionBackgroundDrawable1111 = new MotionBackgroundDrawable(i, i3, i5, i7, true, 0, false);
                        this.backgroundDrawable = motionBackgroundDrawable1111;
                        motionBackgroundDrawable1111.setRoundRadius(AndroidUtilities.dp(6.0f));
                        this.backgroundDrawable.setParentView(this);
                    }
                    if (f < 0.0f) {
                        this.imageReceiver.setGradientBitmap(this.backgroundDrawable.currentBitmap);
                    } else {
                        this.imageReceiver.setGradientBitmap(null);
                        if (Build.VERSION.SDK_INT >= 29) {
                            this.imageReceiver.setBlendMode(BlendMode.SOFT_LIGHT);
                        } else {
                            this.imageReceiver.setColorFilter(new PorterDuffColorFilter(patternsAdapter.this$0.patternColor, PorterDuff.Mode.SRC_IN));
                        }
                    }
                } else {
                    Rect gradientPoints119 = BackgroundGradientDrawable.getGradientPoints(BackgroundGradientDrawable.getGradientOrientation(i8), getMeasuredWidth(), getMeasuredHeight());
                    this.gradientShader = new LinearGradient(gradientPoints119.left, gradientPoints119.top, gradientPoints119.right, gradientPoints119.bottom, new int[]{i, i3}, (float[]) null, Shader.TileMode.CLAMP);
                    this.backgroundDrawable = null;
                    this.imageReceiver.setGradientBitmap(null);
                }
            }
            motionBackgroundDrawable = this.backgroundDrawable;
            if (motionBackgroundDrawable != null) {
                motionBackgroundDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                this.backgroundDrawable.draw(canvas);
            } else {
                paint = this.backgroundPaint;
                paint.setShader(this.gradientShader);
                if (this.gradientShader == null) {
                    paint.setColor(i);
                }
                RectF rectF15 = this.rect;
                rectF15.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF15, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
            }
            super.onDraw(canvas);
            radialProgress2 = this.radialProgress;
            if (radialProgress2.mediaActionDrawable.nextIcon != 4) {
                radialProgress2.setColors(i9, i9, -1, -1);
                radialProgress2.draw(canvas);
            }
        }
        defaultAccentColor4 = themePreviewActivity3.backgroundGradientColor3;
        i7 = defaultAccentColor4;
        themePreviewActivity4 = patternsAdapter.this$0;
        if (themePreviewActivity4.screenType == 2) {
            i8 = themePreviewActivity4.backgroundRotation;
        } else {
            i8 = themePreviewActivity4.accent.backgroundRotation;
        }
        i9 = themePreviewActivity4.checkColor;
        if (i3 != 0) {
            this.gradientShader = null;
            this.backgroundDrawable = null;
            this.imageReceiver.setGradientBitmap(null);
        } else if (this.gradientShader != null) {
            this.currentBackgroundColor = i;
            this.currentGradientColor1 = i3;
            this.currentGradientColor2 = i5;
            this.currentGradientColor3 = i7;
            this.currentGradientAngle = i8;
            if (i5 != 0) {
                this.gradientShader = null;
                motionBackgroundDrawable2 = this.backgroundDrawable;
                if (motionBackgroundDrawable2 != null) {
                    motionBackgroundDrawable2.setColors(i, i3, i5, i7, 0, false);
                } else {
                    MotionBackgroundDrawable motionBackgroundDrawable1112 = new MotionBackgroundDrawable(i, i3, i5, i7, true, 0, false);
                    this.backgroundDrawable = motionBackgroundDrawable1112;
                    motionBackgroundDrawable1112.setRoundRadius(AndroidUtilities.dp(6.0f));
                    this.backgroundDrawable.setParentView(this);
                }
                if (f < 0.0f) {
                    this.imageReceiver.setGradientBitmap(this.backgroundDrawable.currentBitmap);
                } else {
                    this.imageReceiver.setGradientBitmap(null);
                    if (Build.VERSION.SDK_INT >= 29) {
                        this.imageReceiver.setBlendMode(BlendMode.SOFT_LIGHT);
                    } else {
                        this.imageReceiver.setColorFilter(new PorterDuffColorFilter(patternsAdapter.this$0.patternColor, PorterDuff.Mode.SRC_IN));
                    }
                }
            } else {
                Rect gradientPoints1110 = BackgroundGradientDrawable.getGradientPoints(BackgroundGradientDrawable.getGradientOrientation(i8), getMeasuredWidth(), getMeasuredHeight());
                this.gradientShader = new LinearGradient(gradientPoints1110.left, gradientPoints1110.top, gradientPoints1110.right, gradientPoints1110.bottom, new int[]{i, i3}, (float[]) null, Shader.TileMode.CLAMP);
                this.backgroundDrawable = null;
                this.imageReceiver.setGradientBitmap(null);
            }
        } else {
            this.currentBackgroundColor = i;
            this.currentGradientColor1 = i3;
            this.currentGradientColor2 = i5;
            this.currentGradientColor3 = i7;
            this.currentGradientAngle = i8;
            if (i5 != 0) {
                this.gradientShader = null;
                motionBackgroundDrawable2 = this.backgroundDrawable;
                if (motionBackgroundDrawable2 != null) {
                    motionBackgroundDrawable2.setColors(i, i3, i5, i7, 0, false);
                } else {
                    MotionBackgroundDrawable motionBackgroundDrawable1113 = new MotionBackgroundDrawable(i, i3, i5, i7, true, 0, false);
                    this.backgroundDrawable = motionBackgroundDrawable1113;
                    motionBackgroundDrawable1113.setRoundRadius(AndroidUtilities.dp(6.0f));
                    this.backgroundDrawable.setParentView(this);
                }
                if (f < 0.0f) {
                    this.imageReceiver.setGradientBitmap(this.backgroundDrawable.currentBitmap);
                } else {
                    this.imageReceiver.setGradientBitmap(null);
                    if (Build.VERSION.SDK_INT >= 29) {
                        this.imageReceiver.setBlendMode(BlendMode.SOFT_LIGHT);
                    } else {
                        this.imageReceiver.setColorFilter(new PorterDuffColorFilter(patternsAdapter.this$0.patternColor, PorterDuff.Mode.SRC_IN));
                    }
                }
            } else {
                Rect gradientPoints1111 = BackgroundGradientDrawable.getGradientPoints(BackgroundGradientDrawable.getGradientOrientation(i8), getMeasuredWidth(), getMeasuredHeight());
                this.gradientShader = new LinearGradient(gradientPoints1111.left, gradientPoints1111.top, gradientPoints1111.right, gradientPoints1111.bottom, new int[]{i, i3}, (float[]) null, Shader.TileMode.CLAMP);
                this.backgroundDrawable = null;
                this.imageReceiver.setGradientBitmap(null);
            }
        }
        motionBackgroundDrawable = this.backgroundDrawable;
        if (motionBackgroundDrawable != null) {
            motionBackgroundDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.backgroundDrawable.draw(canvas);
        } else {
            paint = this.backgroundPaint;
            paint.setShader(this.gradientShader);
            if (this.gradientShader == null) {
                paint.setColor(i);
            }
            RectF rectF16 = this.rect;
            rectF16.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            canvas.drawRoundRect(rectF16, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
        }
        super.onDraw(canvas);
        radialProgress2 = this.radialProgress;
        if (radialProgress2.mediaActionDrawable.nextIcon != 4) {
            radialProgress2.setColors(i9, i9, -1, -1);
            radialProgress2.draw(canvas);
        }
    }

    @Override
    public final void onFailedDownload(String str, boolean z) {
        TLRPC.TL_wallPaper tL_wallPaper = ThemePreviewActivity.PatternsAdapter.this.this$0.selectedPattern;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.currentPattern;
        if (!(tL_wallPaper2 == null && tL_wallPaper == null) && (tL_wallPaper == null || tL_wallPaper2 == null || tL_wallPaper2.id != tL_wallPaper.id)) {
            return;
        }
        if (z) {
            this.radialProgress.setIcon(4, false, true);
        } else {
            updateButtonState(tL_wallPaper2, true, z);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(AndroidUtilities.dp(100.0f), AndroidUtilities.dp(100.0f));
    }

    @Override
    public final void onProgressDownload(String str, long j, long j2) {
        float fMin = Math.min(1.0f, j / j2);
        RadialProgress2 radialProgress2 = this.radialProgress;
        radialProgress2.setProgress(fMin, true);
        TLRPC.TL_wallPaper tL_wallPaper = ThemePreviewActivity.PatternsAdapter.this.this$0.selectedPattern;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.currentPattern;
        if ((!(tL_wallPaper2 == null && tL_wallPaper == null) && (tL_wallPaper == null || tL_wallPaper2 == null || tL_wallPaper2.id != tL_wallPaper.id)) || radialProgress2.mediaActionDrawable.nextIcon == 10) {
            return;
        }
        updateButtonState(tL_wallPaper2, false, true);
    }

    @Override
    public final void onProgressUpload(String str, long j, long j2, boolean z) {
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.radialProgress.setProgress(1.0f, true);
        TLRPC.TL_wallPaper tL_wallPaper = ThemePreviewActivity.PatternsAdapter.this.this$0.selectedPattern;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.currentPattern;
        if (!(tL_wallPaper2 == null && tL_wallPaper == null) && (tL_wallPaper == null || tL_wallPaper2 == null || tL_wallPaper2.id != tL_wallPaper.id)) {
            return;
        }
        updateButtonState(tL_wallPaper2, false, true);
    }

    public void setPattern(TLRPC.TL_wallPaper tL_wallPaper) {
        this.currentPattern = tL_wallPaper;
        if (tL_wallPaper != null) {
            this.imageReceiver.setImage(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(tL_wallPaper.document.thumbs, AndroidUtilities.dp(100.0f)), tL_wallPaper.document), "100_100", null, null, null, 0L, "png", tL_wallPaper, 1);
            onNewImageSet();
        } else {
            setImageDrawable(null);
        }
        updateSelected$1(false);
    }

    public final void updateButtonState(Object obj, boolean z, boolean z2) {
        File httpFilePath;
        String name;
        boolean z3 = obj instanceof TLRPC.TL_wallPaper;
        RadialProgress2 radialProgress2 = this.radialProgress;
        if (!z3 && !(obj instanceof MediaController.SearchImage)) {
            radialProgress2.setIcon(6, z, z2);
            return;
        }
        int i = this.currentAccount;
        if (z3) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
            name = FileLoader.getAttachFileName(tL_wallPaper.document);
            if (TextUtils.isEmpty(name)) {
                return;
            } else {
                httpFilePath = FileLoader.getInstance(i).getPathToAttach(tL_wallPaper.document, true);
            }
        } else {
            MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
            TLRPC.Photo photo = searchImage.photo;
            if (photo != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, this.maxWallpaperSize, true);
                File pathToAttach = FileLoader.getInstance(i).getPathToAttach(closestPhotoSizeWithSize, true);
                name = FileLoader.getAttachFileName(closestPhotoSizeWithSize);
                httpFilePath = pathToAttach;
            } else {
                httpFilePath = ImageLoader.getHttpFilePath(searchImage.imageUrl, "jpg");
                name = httpFilePath.getName();
            }
            if (TextUtils.isEmpty(name)) {
                return;
            }
        }
        if (httpFilePath.exists()) {
            DownloadController.getInstance(i).removeLoadingFileObserver(this);
            radialProgress2.setProgress(1.0f, z2);
            radialProgress2.setIcon(6, z, z2);
            return;
        }
        DownloadController.getInstance(i).addLoadingFileObserver(name, null, this);
        FileLoader.getInstance(i).isLoadingFile(name);
        Float fileProgress = ImageLoader.getInstance().getFileProgress(name);
        if (fileProgress != null) {
            radialProgress2.setProgress(fileProgress.floatValue(), z2);
        } else {
            radialProgress2.setProgress(0.0f, z2);
        }
        radialProgress2.setIcon(10, z, z2);
    }

    public final void updateSelected$1(boolean z) {
        TLRPC.TL_wallPaper tL_wallPaper = ThemePreviewActivity.PatternsAdapter.this.this$0.selectedPattern;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.currentPattern;
        if (!(tL_wallPaper2 == null && tL_wallPaper == null) && (tL_wallPaper == null || tL_wallPaper2 == null || tL_wallPaper2.id != tL_wallPaper.id)) {
            this.radialProgress.setIcon(4, false, z);
        } else {
            updateButtonState(tL_wallPaper, false, z);
        }
        invalidate();
    }
}
