package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public class t21 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public TextPaint E;
    public StaticLayout F;
    public op G;
    public final w9 H;
    public final int I;
    public gq0 J;
    public final int K;
    public int L;
    public float M;
    public org.telegram.ui.bo N;
    public boolean O;
    public final ImageReceiver P;
    public h9 Q;
    public final org.telegram.ui.ActionBar.e5 R;
    public final org.telegram.ui.ActionBar.e5 S;
    public TLRPC.WallPaper T;
    public long U;
    public int V;
    public boolean W;
    public final float f31038a;
    public final float f31039b;
    public final float f31040c;
    public final float d;
    public final float f31041e;
    public s21 f31042f;
    public s21 h;
    public float f31043n;
    public final Paint f31044r;
    public final Paint f31045s;
    public final RectF v;
    public final Path f31046w;
    public final org.telegram.ui.ActionBar.d6 f31047x;
    public ValueAnimator f31048y;

    public t21(int i10, int i11, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f31038a = AndroidUtilities.dp(8.0f);
        this.f31039b = AndroidUtilities.dp(6.0f);
        this.f31040c = AndroidUtilities.dp(4.0f);
        this.d = AndroidUtilities.dp(21.0f);
        this.f31041e = AndroidUtilities.dp(41.0f);
        this.f31042f = new s21(this);
        this.f31043n = 1.0f;
        Paint paint = new Paint(1);
        this.f31044r = paint;
        this.f31045s = new Paint(1);
        this.v = new RectF();
        this.f31046w = new Path();
        this.R = new org.telegram.ui.ActionBar.e5(0, true, false, null);
        this.S = new org.telegram.ui.ActionBar.e5(0, false, false, null);
        this.K = i11;
        this.I = i10;
        this.f31047x = d6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.P = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(8.0f));
        setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20917i5, d6Var));
        w9 w9Var = new w9(context);
        this.H = w9Var;
        w9Var.getImageReceiver().setCrossfadeWithOldImage(true);
        w9Var.getImageReceiver().setAllowStartLottieAnimation(false);
        w9Var.getImageReceiver().setAutoRepeat(0);
        if (i11 != 0 && i11 != 3 && i11 != 2) {
            addView(w9Var, w7.z5.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 12.0f));
        } else {
            addView(w9Var, w7.z5.d(28, 28.0f, 81, 0.0f, 0.0f, 0.0f, 12.0f));
        }
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(551805923);
    }

    public static Bitmap e(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        float max = Math.max(AndroidUtilities.dp(120.0f) / bitmap.getWidth(), AndroidUtilities.dp(140.0f) / bitmap.getHeight());
        if (bitmap.getWidth() > 0 && bitmap.getHeight() > 0 && Math.abs(max - 1.0f) >= 0.0125f) {
            int width = (int) (bitmap.getWidth() * max);
            int height = (int) (bitmap.getHeight() * max);
            if (height > 0 && width > 0) {
                return Bitmap.createScaledBitmap(bitmap, width, height, true);
            }
            return bitmap;
        }
        return bitmap;
    }

    public StaticLayout getNoThemeStaticLayout() {
        StaticLayout staticLayout = this.F;
        if (staticLayout != null) {
            return staticLayout;
        }
        TextPaint textPaint = new TextPaint(129);
        this.E = textPaint;
        textPaint.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.We, this.f31047x));
        this.E.setTextSize(AndroidUtilities.dp(c()));
        this.E.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(52.0f);
        int i10 = this.K;
        if (i10 == 3 || i10 == 4) {
            dp = AndroidUtilities.dp(77.0f);
        }
        int i11 = dp;
        String b10 = b();
        TextPaint textPaint2 = this.E;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        StaticLayout d = gx0.d(b10, textPaint2, i11, true, i11, 3);
        this.F = d;
        return d;
    }

    public String b() {
        return LocaleController.getString(R.string.ChatNoTheme);
    }

    public int c() {
        return 14;
    }

    public final void d() {
        if (this.H.getImageReceiver().getLottieAnimation() != null) {
            AndroidUtilities.cancelRunOnUIThread(this.J);
            this.H.setVisibility(0);
            if (!this.H.getImageReceiver().getLottieAnimation().f28224k0) {
                this.H.getImageReceiver().getLottieAnimation().N(0, true, false);
                this.H.getImageReceiver().getLottieAnimation().start();
            }
            this.H.animate().scaleX(2.0f).scaleY(2.0f).setDuration(300L).setInterpolator(AndroidUtilities.overshootInterpolator).start();
            gq0 gq0Var = new gq0(this, 19);
            this.J = gq0Var;
            AndroidUtilities.runOnUIThread(gq0Var, 2500L);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        s21 s21Var;
        s21 s21Var2;
        if (this.G == null) {
            super.dispatchDraw(canvas);
            return;
        }
        if (this.N != null) {
            canvas.save();
            canvas.clipPath(this.f31046w);
            this.N.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.N.draw(canvas);
            canvas.restore();
        }
        if (this.f31043n != 1.0f && (s21Var2 = this.h) != null) {
            s21Var2.b(canvas, 1.0f);
        }
        float f7 = this.f31043n;
        if (f7 != 0.0f) {
            this.f31042f.b(canvas, f7);
        }
        if (this.f31043n != 1.0f && (s21Var = this.h) != null) {
            s21Var.a(canvas, 1.0f);
        }
        float f10 = this.f31043n;
        if (f10 != 0.0f) {
            this.f31042f.a(canvas, f10);
        }
        float f11 = this.f31043n;
        if (f11 != 1.0f) {
            float f12 = f11 + 0.10666667f;
            this.f31043n = f12;
            if (f12 >= 1.0f) {
                this.f31043n = 1.0f;
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void f(op opVar, long j3, boolean z10) {
        boolean z11;
        boolean z12;
        long j10;
        int i10;
        long j11;
        org.telegram.ui.ActionBar.f6 f6Var;
        TLRPC.TL_theme tL_theme;
        TLRPC.Document document;
        org.telegram.ui.ActionBar.c4 c4Var;
        int i11;
        BitmapDrawable bitmapDrawable;
        int i12;
        int i13;
        int i14;
        int i15;
        pc0 pc0Var;
        Drawable drawable;
        org.telegram.ui.bo boVar;
        org.telegram.ui.bo boVar2;
        if (this.G != opVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i16 = this.V;
        int i17 = opVar.f29530c;
        if (i16 != i17) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.V = i17;
        this.G = opVar;
        TLRPC.Document f7 = opVar.f29528a.f();
        org.telegram.ui.ActionBar.c4 c4Var2 = opVar.f29528a;
        if (c4Var2.d instanceof TLRPC.TL_chatThemeUniqueGift) {
            j10 = ChatThemeController.getInstance(c4Var2.f20514g).getGiftThemeUser(((TLRPC.TL_chatThemeUniqueGift) c4Var2.d).gift.slug);
        } else {
            j10 = 0;
        }
        this.U = j10;
        if (j3 == j10) {
            this.U = 0L;
        }
        String str = null;
        if (this.U != 0) {
            if (this.Q == null) {
                this.Q = new h9((org.telegram.ui.ActionBar.d6) null);
            }
            TLObject userOrChat = MessagesController.getInstance(this.I).getUserOrChat(this.U);
            this.Q.j(this.I, userOrChat);
            this.P.setForUserOrChat(userOrChat, this.Q);
        } else {
            this.P.clearImage();
        }
        if (z11) {
            gq0 gq0Var = this.J;
            if (gq0Var != null) {
                AndroidUtilities.cancelRunOnUIThread(gq0Var);
                this.J = null;
            }
            this.H.animate().cancel();
            this.H.setScaleX(1.0f);
            this.H.setScaleY(1.0f);
        }
        if (z11) {
            if (f7 != null) {
                drawable = DocumentObject.getSvgThumb(f7, org.telegram.ui.ActionBar.i6.f20810c7, 0.2f);
            } else {
                drawable = null;
            }
            if (drawable == null) {
                Emoji.preloadEmoji(opVar.f29528a.f20512e);
                drawable = Emoji.getEmojiDrawable(opVar.f29528a.f20512e);
            }
            this.H.h(ImageLocation.getForDocument(f7), "50_50", drawable, null);
            opVar.f29528a.getClass();
            TLRPC.WallPaper wallPaper = this.T;
            if (wallPaper != null) {
                if (this.O && (boVar2 = this.N) != null) {
                    boVar2.g(this);
                }
                org.telegram.ui.bo boVar3 = new org.telegram.ui.bo(wallPaper, false, true);
                this.N = boVar3;
                boVar3.f35179b = this;
                pc0 pc0Var2 = boVar3.f35182f;
                if (pc0Var2 != null) {
                    pc0Var2.r(this);
                }
                if (this.O) {
                    this.N.f(this);
                }
            } else {
                if (this.O && (boVar = this.N) != null) {
                    boVar.g(this);
                }
                this.N = null;
            }
        }
        w9 w9Var = this.H;
        if (opVar.f29528a.m() && this.T != null) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        w9Var.setVisibility(i10);
        if (z11 || z12) {
            if (z10) {
                this.f31043n = 0.0f;
                this.h = this.f31042f;
                this.f31042f = new s21(this);
                invalidate();
            } else {
                this.f31043n = 1.0f;
            }
            s21 s21Var = this.f31042f;
            op opVar2 = this.G;
            if (opVar2 == null || (c4Var = opVar2.f29528a) == null) {
                j11 = 0;
            } else {
                org.telegram.ui.ActionBar.b4 b4Var = (org.telegram.ui.ActionBar.b4) c4Var.f20513f.get(opVar2.f29530c);
                int i18 = b4Var.h;
                if (this.U != 0) {
                    i18 = b4Var.f20467k;
                }
                Paint paint = s21Var.f30671c;
                Paint paint2 = s21Var.f30669a;
                Paint paint3 = s21Var.f30670b;
                paint.setColor(i18);
                paint3.setColor(b4Var.f20465i);
                if (this.G.f29528a.m()) {
                    i11 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Oh, this.f31047x);
                } else {
                    i11 = b4Var.f20466j;
                }
                int alpha = paint2.getAlpha();
                paint2.setColor(i11);
                paint2.setAlpha(alpha);
                op opVar3 = this.G;
                fg.a aVar = (fg.a) opVar3.f29528a.f20513f.get(opVar3.f29530c);
                if (aVar != null) {
                    org.telegram.ui.ActionBar.b4 b4Var2 = (org.telegram.ui.ActionBar.b4) aVar;
                    if (b4Var2.a() != 0) {
                        op opVar4 = this.G;
                        int i19 = ((org.telegram.ui.ActionBar.b4) opVar4.f29528a.f20513f.get(opVar4.f29530c)).d;
                        ArrayList<Integer> arrayList = b4Var2.b(i19).message_colors;
                        if (arrayList.size() > 1) {
                            int[] iArr = new int[arrayList.size()];
                            for (int i20 = 0; i20 != arrayList.size(); i20++) {
                                iArr[i20] = arrayList.get(i20).intValue() | (-16777216);
                            }
                            float dp = this.f31040c + AndroidUtilities.dp(8.0f);
                            paint3.setShader(new LinearGradient(0.0f, dp, 0.0f, dp + this.d, iArr, (float[]) null, Shader.TileMode.CLAMP));
                        } else {
                            paint3.setShader(null);
                        }
                        paint3.setAlpha(255);
                        if (this.G != null) {
                            if (i19 >= 0) {
                                TLRPC.WallPaperSettings wallPaperSettings = b4Var2.b(i19).wallpaper.settings;
                                int i21 = wallPaperSettings.background_color;
                                int i22 = wallPaperSettings.second_background_color;
                                int i23 = wallPaperSettings.third_background_color;
                                i15 = wallPaperSettings.fourth_background_color;
                                i12 = i21;
                                i13 = i22;
                                i14 = i23;
                            } else {
                                i12 = 0;
                                i13 = 0;
                                i14 = 0;
                                i15 = 0;
                            }
                            if (i13 != 0) {
                                pc0Var = new pc0(true, i12, i13, i14, i15);
                                this.L = pc0Var.f();
                            } else {
                                pc0 pc0Var3 = new pc0(true, i12, i12, i12, i12);
                                this.L = -16777216;
                                pc0Var = pc0Var3;
                            }
                            this.G.f29529b = pc0Var;
                        }
                        j11 = 0;
                        s21Var.d = this.G.f29529b;
                        invalidate();
                    }
                }
                op opVar5 = this.G;
                org.telegram.ui.ActionBar.b4 b4Var3 = (org.telegram.ui.ActionBar.b4) opVar5.f29528a.f20513f.get(opVar5.f29530c);
                if (this.G != null) {
                    int i24 = b4Var3.f20467k;
                    int i25 = b4Var3.f20468l;
                    int i26 = b4Var3.f20469m;
                    int i27 = b4Var3.f20470n;
                    int i28 = b4Var3.f20471o;
                    j11 = 0;
                    if (b4Var3.f20459a.k(false) != null) {
                        if (i25 != 0) {
                            pc0 pc0Var4 = new pc0(i24, i25, i26, i27, true, i28, false);
                            this.L = pc0Var4.f();
                            bitmapDrawable = pc0Var4;
                        } else {
                            Drawable pc0Var5 = new pc0(i24, i24, i24, i24, true, i28, false);
                            this.L = -16777216;
                            bitmapDrawable = pc0Var5;
                        }
                    } else if (i24 != 0 && i25 != 0) {
                        bitmapDrawable = new pc0(i24, i25, i26, i27, true, i28, false);
                    } else if (i24 != 0) {
                        bitmapDrawable = new ColorDrawable(i24);
                    } else {
                        org.telegram.ui.ActionBar.h6 h6Var = b4Var3.f20459a;
                        if (h6Var != null && (h6Var.P > 0 || h6Var.f20701c != null)) {
                            org.telegram.ui.ActionBar.h6 h6Var2 = b4Var3.f20459a;
                            Bitmap scaledBitmap = AndroidUtilities.getScaledBitmap(AndroidUtilities.dp(112.0f), AndroidUtilities.dp(134.0f), h6Var2.f20701c, h6Var2.f20699b, h6Var2.P);
                            if (scaledBitmap != null) {
                                BitmapDrawable bitmapDrawable2 = new BitmapDrawable(scaledBitmap);
                                bitmapDrawable2.setFilterBitmap(true);
                                bitmapDrawable = bitmapDrawable2;
                            }
                            bitmapDrawable = null;
                        } else {
                            org.telegram.ui.ActionBar.c4 c4Var3 = this.G.f29528a;
                            if (c4Var3 == null || !c4Var3.m()) {
                                bitmapDrawable = new pc0(true, -2368069, -9722489, -2762611, -7817084);
                            }
                            bitmapDrawable = null;
                        }
                    }
                    this.G.f29529b = bitmapDrawable;
                    s21Var.d = this.G.f29529b;
                    invalidate();
                }
                j11 = 0;
                s21Var.d = this.G.f29529b;
                invalidate();
            }
            long i29 = opVar.f29528a.i(this.V);
            if (i29 != j11) {
                TLRPC.WallPaper k10 = opVar.f29528a.k(this.V);
                if (k10 != null) {
                    opVar.f29528a.p(this.V, new ei.v1(this, i29, opVar, k10.settings.intensity));
                }
            } else {
                SparseArray sparseArray = opVar.f29528a.j(this.V).f20698a0;
                if (sparseArray != null) {
                    f6Var = (org.telegram.ui.ActionBar.f6) sparseArray.get(((org.telegram.ui.ActionBar.b4) opVar.f29528a.f20513f.get(this.V)).f20462e);
                } else {
                    f6Var = null;
                }
                if (f6Var != null && (tL_theme = f6Var.f20635r) != null && tL_theme.settings.size() > 0) {
                    TLRPC.WallPaper wallPaper2 = f6Var.f20635r.settings.get(0).wallpaper;
                    if (wallPaper2 != null && (document = wallPaper2.document) != null) {
                        ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 120), document);
                        ImageReceiver imageReceiver = new ImageReceiver();
                        imageReceiver.setAllowLoadingOnAttachedOnly(false);
                        imageReceiver.setImage(forDocument, "120_140", null, null, null, 1);
                        imageReceiver.setDelegate(new v50(this, opVar, wallPaper2, 2));
                        ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver);
                    }
                } else if (f6Var != null && f6Var.f20635r == null) {
                    int i30 = (int) (f6Var.f20633p * 100.0f);
                    Drawable drawable2 = opVar.f29529b;
                    if (drawable2 instanceof pc0) {
                        pc0 pc0Var6 = (pc0) drawable2;
                        pc0Var6.t(pc0Var6.f29721u, i30);
                    }
                    ChatThemeController.chatThemeQueue.postRunnable(new zm(this, opVar, i30, 23));
                }
            }
        }
        if (!z10) {
            this.H.animate().cancel();
            this.H.setScaleX(1.0f);
            this.H.setScaleY(1.0f);
            AndroidUtilities.cancelRunOnUIThread(this.J);
            if (this.H.getImageReceiver().getLottieAnimation() != null) {
                this.H.getImageReceiver().getLottieAnimation().stop();
                this.H.getImageReceiver().getLottieAnimation().N(0, false, false);
            }
        }
        org.telegram.ui.ActionBar.c4 c4Var4 = this.G.f29528a;
        if (c4Var4 != null && !c4Var4.m()) {
            fg.b bVar = this.G.f29528a.f20511c;
            if (bVar != null && (str = bVar.f9850b) == null) {
                str = bVar.f9849a;
            }
            setContentDescription(str);
            return;
        }
        setContentDescription(LocaleController.getString(R.string.ChatNoTheme));
    }

    public final void g(boolean z10, boolean z11) {
        float f7 = 0.0f;
        if (!z11) {
            ValueAnimator valueAnimator = this.f31048y;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.W = z10;
            if (z10) {
                f7 = 1.0f;
            }
            this.M = f7;
            invalidate();
            return;
        }
        if (this.W != z10) {
            float f10 = this.M;
            ValueAnimator valueAnimator2 = this.f31048y;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            if (z10) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f31048y = ofFloat;
            ofFloat.addUpdateListener(new v70(this, 27));
            this.f31048y.addListener(new da(20, this, z10));
            this.f31048y.setDuration(250L);
            this.f31048y.start();
        }
        this.W = z10;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        this.O = true;
        org.telegram.ui.bo boVar = this.N;
        if (boVar != null) {
            boVar.f(this);
        }
        this.P.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        this.O = false;
        org.telegram.ui.bo boVar = this.N;
        if (boVar != null) {
            boVar.g(this);
        }
        this.P.onDetachedFromWindow();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setSelected(this.W);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int i12 = this.K;
        if (i12 != 1 && i12 != 4) {
            if (i12 == 0) {
                f7 = 77.0f;
            } else {
                f7 = 83.0f;
            }
            int dp = AndroidUtilities.dp(f7);
            int size = View.MeasureSpec.getSize(i11);
            if (size == 0) {
                size = (int) (dp * 1.35f);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(dp, 1073741824), View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        } else {
            int size2 = View.MeasureSpec.getSize(i10);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size2, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 1.2f), 1073741824));
        }
        w9 w9Var = this.H;
        w9Var.setPivotY(w9Var.getMeasuredHeight());
        w9Var.setPivotX(w9Var.getMeasuredWidth() / 2.0f);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        float f7 = this.f31040c;
        RectF rectF = this.v;
        rectF.set(f7, f7, i10 - f7, i11 - f7);
        Path path = this.f31046w;
        path.reset();
        float f10 = this.f31039b;
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
    }

    @Override
    public void setBackgroundColor(int i10) {
        int i11 = org.telegram.ui.ActionBar.i6.f20917i5;
        org.telegram.ui.ActionBar.d6 d6Var = this.f31047x;
        this.f31045s.setColor(org.telegram.ui.ActionBar.i6.v0(i11, d6Var));
        TextPaint textPaint = this.E;
        if (textPaint != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.We, d6Var));
        }
        invalidate();
    }

    public void setFallbackWallpaper(TLRPC.WallPaper wallPaper) {
        if (this.T != wallPaper) {
            this.T = wallPaper;
            op opVar = this.G;
            if (opVar != null) {
                this.G = null;
                f(opVar, 0L, false);
            }
        }
    }
}
