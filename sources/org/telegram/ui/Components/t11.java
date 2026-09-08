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
public class t11 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public TextPaint E;
    public StaticLayout F;
    public kp G;
    public final x9 H;
    public final int I;
    public jq0 J;
    public final int K;
    public int L;
    public float M;
    public org.telegram.ui.go N;
    public boolean O;
    public final ImageReceiver P;
    public i9 Q;
    public final org.telegram.ui.ActionBar.f5 R;
    public final org.telegram.ui.ActionBar.f5 S;
    public TLRPC.WallPaper T;
    public long U;
    public int V;
    public boolean W;
    public final float f30525a;
    public final float f30526b;
    public final float f30527c;
    public final float d;
    public final float f30528e;
    public s11 f30529f;
    public s11 h;
    public float f30530n;
    public final Paint f30531r;
    public final Paint f30532s;
    public final RectF v;
    public final Path f30533w;
    public final org.telegram.ui.ActionBar.f6 f30534x;
    public ValueAnimator f30535y;

    public t11(int i10, int i11, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f30525a = AndroidUtilities.dp(8.0f);
        this.f30526b = AndroidUtilities.dp(6.0f);
        this.f30527c = AndroidUtilities.dp(4.0f);
        this.d = AndroidUtilities.dp(21.0f);
        this.f30528e = AndroidUtilities.dp(41.0f);
        this.f30529f = new s11(this);
        this.f30530n = 1.0f;
        Paint paint = new Paint(1);
        this.f30531r = paint;
        this.f30532s = new Paint(1);
        this.v = new RectF();
        this.f30533w = new Path();
        this.R = new org.telegram.ui.ActionBar.f5(0, true, false, null);
        this.S = new org.telegram.ui.ActionBar.f5(0, false, false, null);
        this.K = i11;
        this.I = i10;
        this.f30534x = f6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.P = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(8.0f));
        setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20779i5, f6Var));
        x9 x9Var = new x9(context);
        this.H = x9Var;
        x9Var.getImageReceiver().setCrossfadeWithOldImage(true);
        x9Var.getImageReceiver().setAllowStartLottieAnimation(false);
        x9Var.getImageReceiver().setAutoRepeat(0);
        if (i11 != 0 && i11 != 3 && i11 != 2) {
            addView(x9Var, w7.x5.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 12.0f));
        } else {
            addView(x9Var, w7.x5.d(28, 28.0f, 81, 0.0f, 0.0f, 0.0f, 12.0f));
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
        textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.We, this.f30534x));
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
        StaticLayout d = iw0.d(b10, textPaint2, i11, true, i11, 3);
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
            if (!this.H.getImageReceiver().getLottieAnimation().f32593l0) {
                this.H.getImageReceiver().getLottieAnimation().L(0, true, false);
                this.H.getImageReceiver().getLottieAnimation().start();
            }
            this.H.animate().scaleX(2.0f).scaleY(2.0f).setDuration(300L).setInterpolator(AndroidUtilities.overshootInterpolator).start();
            jq0 jq0Var = new jq0(this, 16);
            this.J = jq0Var;
            AndroidUtilities.runOnUIThread(jq0Var, 2500L);
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
        s11 s11Var;
        s11 s11Var2;
        if (this.G == null) {
            super.dispatchDraw(canvas);
            return;
        }
        if (this.N != null) {
            canvas.save();
            canvas.clipPath(this.f30533w);
            this.N.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.N.draw(canvas);
            canvas.restore();
        }
        if (this.f30530n != 1.0f && (s11Var2 = this.h) != null) {
            s11Var2.b(canvas, 1.0f);
        }
        float f7 = this.f30530n;
        if (f7 != 0.0f) {
            this.f30529f.b(canvas, f7);
        }
        if (this.f30530n != 1.0f && (s11Var = this.h) != null) {
            s11Var.a(canvas, 1.0f);
        }
        float f10 = this.f30530n;
        if (f10 != 0.0f) {
            this.f30529f.a(canvas, f10);
        }
        float f11 = this.f30530n;
        if (f11 != 1.0f) {
            float f12 = f11 + 0.10666667f;
            this.f30530n = f12;
            if (f12 >= 1.0f) {
                this.f30530n = 1.0f;
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void f(kp kpVar, long j3, boolean z10) {
        boolean z11;
        boolean z12;
        long j10;
        int i10;
        long j11;
        org.telegram.ui.ActionBar.h6 h6Var;
        TLRPC.TL_theme tL_theme;
        TLRPC.Document document;
        org.telegram.ui.ActionBar.d4 d4Var;
        int i11;
        BitmapDrawable bitmapDrawable;
        int i12;
        int i13;
        int i14;
        int i15;
        dc0 dc0Var;
        Drawable drawable;
        org.telegram.ui.go goVar;
        org.telegram.ui.go goVar2;
        if (this.G != kpVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i16 = this.V;
        int i17 = kpVar.f27911c;
        if (i16 != i17) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.V = i17;
        this.G = kpVar;
        TLRPC.Document f7 = kpVar.f27909a.f();
        org.telegram.ui.ActionBar.d4 d4Var2 = kpVar.f27909a;
        if (d4Var2.d instanceof TLRPC.TL_chatThemeUniqueGift) {
            j10 = ChatThemeController.getInstance(d4Var2.f20393g).getGiftThemeUser(((TLRPC.TL_chatThemeUniqueGift) d4Var2.d).gift.slug);
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
                this.Q = new i9((org.telegram.ui.ActionBar.f6) null);
            }
            TLObject userOrChat = MessagesController.getInstance(this.I).getUserOrChat(this.U);
            this.Q.j(this.I, userOrChat);
            this.P.setForUserOrChat(userOrChat, this.Q);
        } else {
            this.P.clearImage();
        }
        if (z11) {
            jq0 jq0Var = this.J;
            if (jq0Var != null) {
                AndroidUtilities.cancelRunOnUIThread(jq0Var);
                this.J = null;
            }
            this.H.animate().cancel();
            this.H.setScaleX(1.0f);
            this.H.setScaleY(1.0f);
        }
        if (z11) {
            if (f7 != null) {
                drawable = DocumentObject.getSvgThumb(f7, org.telegram.ui.ActionBar.j6.f20673c7, 0.2f);
            } else {
                drawable = null;
            }
            if (drawable == null) {
                Emoji.preloadEmoji(kpVar.f27909a.f20391e);
                drawable = Emoji.getEmojiDrawable(kpVar.f27909a.f20391e);
            }
            this.H.h(ImageLocation.getForDocument(f7), "50_50", drawable, null);
            kpVar.f27909a.getClass();
            TLRPC.WallPaper wallPaper = this.T;
            if (wallPaper != null) {
                if (this.O && (goVar2 = this.N) != null) {
                    goVar2.g(this);
                }
                org.telegram.ui.go goVar3 = new org.telegram.ui.go(wallPaper, false, true);
                this.N = goVar3;
                goVar3.f36752b = this;
                dc0 dc0Var2 = goVar3.f36755f;
                if (dc0Var2 != null) {
                    dc0Var2.r(this);
                }
                if (this.O) {
                    this.N.f(this);
                }
            } else {
                if (this.O && (goVar = this.N) != null) {
                    goVar.g(this);
                }
                this.N = null;
            }
        }
        x9 x9Var = this.H;
        if (kpVar.f27909a.m() && this.T != null) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        x9Var.setVisibility(i10);
        if (z11 || z12) {
            if (z10) {
                this.f30530n = 0.0f;
                this.h = this.f30529f;
                this.f30529f = new s11(this);
                invalidate();
            } else {
                this.f30530n = 1.0f;
            }
            s11 s11Var = this.f30529f;
            kp kpVar2 = this.G;
            if (kpVar2 == null || (d4Var = kpVar2.f27909a) == null) {
                j11 = 0;
            } else {
                org.telegram.ui.ActionBar.c4 c4Var = (org.telegram.ui.ActionBar.c4) d4Var.f20392f.get(kpVar2.f27911c);
                int i18 = c4Var.h;
                if (this.U != 0) {
                    i18 = c4Var.f20351k;
                }
                Paint paint = s11Var.f30193c;
                Paint paint2 = s11Var.f30191a;
                Paint paint3 = s11Var.f30192b;
                paint.setColor(i18);
                paint3.setColor(c4Var.f20349i);
                if (this.G.f27909a.m()) {
                    i11 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, this.f30534x);
                } else {
                    i11 = c4Var.f20350j;
                }
                int alpha = paint2.getAlpha();
                paint2.setColor(i11);
                paint2.setAlpha(alpha);
                kp kpVar3 = this.G;
                gg.a aVar = (gg.a) kpVar3.f27909a.f20392f.get(kpVar3.f27911c);
                if (aVar != null) {
                    org.telegram.ui.ActionBar.c4 c4Var2 = (org.telegram.ui.ActionBar.c4) aVar;
                    if (c4Var2.a() != 0) {
                        kp kpVar4 = this.G;
                        int i19 = ((org.telegram.ui.ActionBar.c4) kpVar4.f27909a.f20392f.get(kpVar4.f27911c)).d;
                        ArrayList<Integer> arrayList = c4Var2.b(i19).message_colors;
                        if (arrayList.size() > 1) {
                            int[] iArr = new int[arrayList.size()];
                            for (int i20 = 0; i20 != arrayList.size(); i20++) {
                                iArr[i20] = arrayList.get(i20).intValue() | (-16777216);
                            }
                            float dp = this.f30527c + AndroidUtilities.dp(8.0f);
                            paint3.setShader(new LinearGradient(0.0f, dp, 0.0f, dp + this.d, iArr, (float[]) null, Shader.TileMode.CLAMP));
                        } else {
                            paint3.setShader(null);
                        }
                        paint3.setAlpha(255);
                        if (this.G != null) {
                            if (i19 >= 0) {
                                TLRPC.WallPaperSettings wallPaperSettings = c4Var2.b(i19).wallpaper.settings;
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
                                dc0Var = new dc0(true, i12, i13, i14, i15);
                                this.L = dc0Var.f();
                            } else {
                                dc0 dc0Var3 = new dc0(true, i12, i12, i12, i12);
                                this.L = -16777216;
                                dc0Var = dc0Var3;
                            }
                            this.G.f27910b = dc0Var;
                        }
                        j11 = 0;
                        s11Var.d = this.G.f27910b;
                        invalidate();
                    }
                }
                kp kpVar5 = this.G;
                org.telegram.ui.ActionBar.c4 c4Var3 = (org.telegram.ui.ActionBar.c4) kpVar5.f27909a.f20392f.get(kpVar5.f27911c);
                if (this.G != null) {
                    int i24 = c4Var3.f20351k;
                    int i25 = c4Var3.f20352l;
                    int i26 = c4Var3.f20353m;
                    int i27 = c4Var3.f20354n;
                    int i28 = c4Var3.f20355o;
                    j11 = 0;
                    if (c4Var3.f20343a.k(false) != null) {
                        if (i25 != 0) {
                            dc0 dc0Var4 = new dc0(i24, i25, i26, i27, true, i28, false);
                            this.L = dc0Var4.f();
                            bitmapDrawable = dc0Var4;
                        } else {
                            Drawable dc0Var5 = new dc0(i24, i24, i24, i24, true, i28, false);
                            this.L = -16777216;
                            bitmapDrawable = dc0Var5;
                        }
                    } else if (i24 != 0 && i25 != 0) {
                        bitmapDrawable = new dc0(i24, i25, i26, i27, true, i28, false);
                    } else if (i24 != 0) {
                        bitmapDrawable = new ColorDrawable(i24);
                    } else {
                        org.telegram.ui.ActionBar.i6 i6Var = c4Var3.f20343a;
                        if (i6Var != null && (i6Var.P > 0 || i6Var.f20571c != null)) {
                            org.telegram.ui.ActionBar.i6 i6Var2 = c4Var3.f20343a;
                            Bitmap scaledBitmap = AndroidUtilities.getScaledBitmap(AndroidUtilities.dp(112.0f), AndroidUtilities.dp(134.0f), i6Var2.f20571c, i6Var2.f20569b, i6Var2.P);
                            if (scaledBitmap != null) {
                                BitmapDrawable bitmapDrawable2 = new BitmapDrawable(scaledBitmap);
                                bitmapDrawable2.setFilterBitmap(true);
                                bitmapDrawable = bitmapDrawable2;
                            }
                            bitmapDrawable = null;
                        } else {
                            org.telegram.ui.ActionBar.d4 d4Var3 = this.G.f27909a;
                            if (d4Var3 == null || !d4Var3.m()) {
                                bitmapDrawable = new dc0(true, -2368069, -9722489, -2762611, -7817084);
                            }
                            bitmapDrawable = null;
                        }
                    }
                    this.G.f27910b = bitmapDrawable;
                    s11Var.d = this.G.f27910b;
                    invalidate();
                }
                j11 = 0;
                s11Var.d = this.G.f27910b;
                invalidate();
            }
            long i29 = kpVar.f27909a.i(this.V);
            if (i29 != j11) {
                TLRPC.WallPaper k10 = kpVar.f27909a.k(this.V);
                if (k10 != null) {
                    kpVar.f27909a.p(this.V, new fi.u1(this, i29, kpVar, k10.settings.intensity));
                }
            } else {
                SparseArray sparseArray = kpVar.f27909a.j(this.V).f20568a0;
                if (sparseArray != null) {
                    h6Var = (org.telegram.ui.ActionBar.h6) sparseArray.get(((org.telegram.ui.ActionBar.c4) kpVar.f27909a.f20392f.get(this.V)).f20346e);
                } else {
                    h6Var = null;
                }
                if (h6Var != null && (tL_theme = h6Var.f20532r) != null && tL_theme.settings.size() > 0) {
                    TLRPC.WallPaper wallPaper2 = h6Var.f20532r.settings.get(0).wallpaper;
                    if (wallPaper2 != null && (document = wallPaper2.document) != null) {
                        ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 120), document);
                        ImageReceiver imageReceiver = new ImageReceiver();
                        imageReceiver.setAllowLoadingOnAttachedOnly(false);
                        imageReceiver.setImage(forDocument, "120_140", null, null, null, 1);
                        imageReceiver.setDelegate(new s50(this, kpVar, wallPaper2, 2));
                        ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver);
                    }
                } else if (h6Var != null && h6Var.f20532r == null) {
                    int i30 = (int) (h6Var.f20530p * 100.0f);
                    Drawable drawable2 = kpVar.f27910b;
                    if (drawable2 instanceof dc0) {
                        dc0 dc0Var6 = (dc0) drawable2;
                        dc0Var6.t(dc0Var6.f25390u, i30);
                    }
                    ChatThemeController.chatThemeQueue.postRunnable(new org.telegram.ui.dm(this, kpVar, i30, 24));
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
                this.H.getImageReceiver().getLottieAnimation().L(0, false, false);
            }
        }
        org.telegram.ui.ActionBar.d4 d4Var4 = this.G.f27909a;
        if (d4Var4 != null && !d4Var4.m()) {
            gg.b bVar = this.G.f27909a.f20390c;
            if (bVar != null && (str = bVar.f10673b) == null) {
                str = bVar.f10672a;
            }
            setContentDescription(str);
            return;
        }
        setContentDescription(LocaleController.getString(R.string.ChatNoTheme));
    }

    public final void g(boolean z10, boolean z11) {
        float f7 = 0.0f;
        if (!z11) {
            ValueAnimator valueAnimator = this.f30535y;
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
            ValueAnimator valueAnimator2 = this.f30535y;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            if (z10) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f30535y = ofFloat;
            ofFloat.addUpdateListener(new h70(this, 27));
            this.f30535y.addListener(new org.telegram.ui.to(21, this, z10));
            this.f30535y.setDuration(250L);
            this.f30535y.start();
        }
        this.W = z10;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        this.O = true;
        org.telegram.ui.go goVar = this.N;
        if (goVar != null) {
            goVar.f(this);
        }
        this.P.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        this.O = false;
        org.telegram.ui.go goVar = this.N;
        if (goVar != null) {
            goVar.g(this);
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
        x9 x9Var = this.H;
        x9Var.setPivotY(x9Var.getMeasuredHeight());
        x9Var.setPivotX(x9Var.getMeasuredWidth() / 2.0f);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        float f7 = this.f30527c;
        RectF rectF = this.v;
        rectF.set(f7, f7, i10 - f7, i11 - f7);
        Path path = this.f30533w;
        path.reset();
        float f10 = this.f30526b;
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
    }

    @Override
    public void setBackgroundColor(int i10) {
        int i11 = org.telegram.ui.ActionBar.j6.f20779i5;
        org.telegram.ui.ActionBar.f6 f6Var = this.f30534x;
        this.f30532s.setColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        TextPaint textPaint = this.E;
        if (textPaint != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.We, f6Var));
        }
        invalidate();
    }

    public void setFallbackWallpaper(TLRPC.WallPaper wallPaper) {
        if (this.T != wallPaper) {
            this.T = wallPaper;
            kp kpVar = this.G;
            if (kpVar != null) {
                this.G = null;
                f(kpVar, 0L, false);
            }
        }
    }
}
