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
public class i21 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public TextPaint E;
    public StaticLayout F;
    public rp G;
    public final w9 H;
    public final int I;
    public uq0 J;
    public final int K;
    public int L;
    public float M;
    public org.telegram.ui.ho N;
    public boolean O;
    public final ImageReceiver P;
    public g9 Q;
    public final org.telegram.ui.ActionBar.h5 R;
    public final org.telegram.ui.ActionBar.h5 S;
    public TLRPC.WallPaper T;
    public long U;
    public int V;
    public boolean W;
    public final float f23875a;
    public final float f23876b;
    public final float f23877c;
    public final float d;
    public final float e;
    public h21 f23878f;
    public h21 h;
    public float f23879n;
    public final Paint f23880r;
    public final Paint f23881s;
    public final RectF v;
    public final Path f23882w;
    public final org.telegram.ui.ActionBar.f6 f23883x;
    public ValueAnimator f23884y;

    public i21(int i10, int i11, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f23875a = AndroidUtilities.dp(8.0f);
        this.f23876b = AndroidUtilities.dp(6.0f);
        this.f23877c = AndroidUtilities.dp(4.0f);
        this.d = AndroidUtilities.dp(21.0f);
        this.e = AndroidUtilities.dp(41.0f);
        this.f23878f = new h21(this);
        this.f23879n = 1.0f;
        Paint paint = new Paint(1);
        this.f23880r = paint;
        this.f23881s = new Paint(1);
        this.v = new RectF();
        this.f23882w = new Path();
        this.R = new org.telegram.ui.ActionBar.h5(0, true, false, null);
        this.S = new org.telegram.ui.ActionBar.h5(0, false, false, null);
        this.K = i11;
        this.I = i10;
        this.f23883x = f6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.P = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(8.0f));
        setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18016i5, f6Var));
        w9 w9Var = new w9(context);
        this.H = w9Var;
        w9Var.getImageReceiver().setCrossfadeWithOldImage(true);
        w9Var.getImageReceiver().setAllowStartLottieAnimation(false);
        w9Var.getImageReceiver().setAutoRepeat(0);
        if (i11 != 0 && i11 != 3 && i11 != 2) {
            addView(w9Var, w7.a6.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 12.0f));
        } else {
            addView(w9Var, w7.a6.d(28, 28.0f, 81, 0.0f, 0.0f, 0.0f, 12.0f));
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
        textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.We, this.f23883x));
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
        StaticLayout d = uw0.d(b10, textPaint2, i11, true, i11, 3);
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
            if (!this.H.getImageReceiver().getLottieAnimation().f23660l0) {
                this.H.getImageReceiver().getLottieAnimation().N(0, true, false);
                this.H.getImageReceiver().getLottieAnimation().start();
            }
            this.H.animate().scaleX(2.0f).scaleY(2.0f).setDuration(300L).setInterpolator(AndroidUtilities.overshootInterpolator).start();
            uq0 uq0Var = new uq0(this, 16);
            this.J = uq0Var;
            AndroidUtilities.runOnUIThread(uq0Var, 2500L);
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
        h21 h21Var;
        h21 h21Var2;
        if (this.G == null) {
            super.dispatchDraw(canvas);
            return;
        }
        if (this.N != null) {
            canvas.save();
            canvas.clipPath(this.f23882w);
            this.N.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.N.draw(canvas);
            canvas.restore();
        }
        if (this.f23879n != 1.0f && (h21Var2 = this.h) != null) {
            h21Var2.b(canvas, 1.0f);
        }
        float f7 = this.f23879n;
        if (f7 != 0.0f) {
            this.f23878f.b(canvas, f7);
        }
        if (this.f23879n != 1.0f && (h21Var = this.h) != null) {
            h21Var.a(canvas, 1.0f);
        }
        float f10 = this.f23879n;
        if (f10 != 0.0f) {
            this.f23878f.a(canvas, f10);
        }
        float f11 = this.f23879n;
        if (f11 != 1.0f) {
            float f12 = f11 + 0.10666667f;
            this.f23879n = f12;
            if (f12 >= 1.0f) {
                this.f23879n = 1.0f;
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void f(rp rpVar, long j3, boolean z10) {
        boolean z11;
        boolean z12;
        long j10;
        int i10;
        long j11;
        org.telegram.ui.ActionBar.h6 h6Var;
        TLRPC.TL_theme tL_theme;
        TLRPC.Document document;
        org.telegram.ui.ActionBar.f4 f4Var;
        int i11;
        BitmapDrawable bitmapDrawable;
        int i12;
        int i13;
        int i14;
        int i15;
        lc0 lc0Var;
        Drawable drawable;
        org.telegram.ui.ho hoVar;
        org.telegram.ui.ho hoVar2;
        if (this.G != rpVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i16 = this.V;
        int i17 = rpVar.f26735c;
        if (i16 != i17) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.V = i17;
        this.G = rpVar;
        TLRPC.Document f7 = rpVar.f26733a.f();
        org.telegram.ui.ActionBar.f4 f4Var2 = rpVar.f26733a;
        if (f4Var2.d instanceof TLRPC.TL_chatThemeUniqueGift) {
            j10 = ChatThemeController.getInstance(f4Var2.f17718g).getGiftThemeUser(((TLRPC.TL_chatThemeUniqueGift) f4Var2.d).gift.slug);
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
                this.Q = new g9((org.telegram.ui.ActionBar.f6) null);
            }
            TLObject userOrChat = MessagesController.getInstance(this.I).getUserOrChat(this.U);
            this.Q.j(this.I, userOrChat);
            this.P.setForUserOrChat(userOrChat, this.Q);
        } else {
            this.P.clearImage();
        }
        if (z11) {
            uq0 uq0Var = this.J;
            if (uq0Var != null) {
                AndroidUtilities.cancelRunOnUIThread(uq0Var);
                this.J = null;
            }
            this.H.animate().cancel();
            this.H.setScaleX(1.0f);
            this.H.setScaleY(1.0f);
        }
        if (z11) {
            if (f7 != null) {
                drawable = DocumentObject.getSvgThumb(f7, org.telegram.ui.ActionBar.j6.f17911c7, 0.2f);
            } else {
                drawable = null;
            }
            if (drawable == null) {
                Emoji.preloadEmoji(rpVar.f26733a.e);
                drawable = Emoji.getEmojiDrawable(rpVar.f26733a.e);
            }
            this.H.h(ImageLocation.getForDocument(f7), "50_50", drawable, null);
            rpVar.f26733a.getClass();
            TLRPC.WallPaper wallPaper = this.T;
            if (wallPaper != null) {
                if (this.O && (hoVar2 = this.N) != null) {
                    hoVar2.g(this);
                }
                org.telegram.ui.ho hoVar3 = new org.telegram.ui.ho(wallPaper, false, true);
                this.N = hoVar3;
                hoVar3.f33424b = this;
                lc0 lc0Var2 = hoVar3.f33426f;
                if (lc0Var2 != null) {
                    lc0Var2.r(this);
                }
                if (this.O) {
                    this.N.f(this);
                }
            } else {
                if (this.O && (hoVar = this.N) != null) {
                    hoVar.g(this);
                }
                this.N = null;
            }
        }
        w9 w9Var = this.H;
        if (rpVar.f26733a.m() && this.T != null) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        w9Var.setVisibility(i10);
        if (z11 || z12) {
            if (z10) {
                this.f23879n = 0.0f;
                this.h = this.f23878f;
                this.f23878f = new h21(this);
                invalidate();
            } else {
                this.f23879n = 1.0f;
            }
            h21 h21Var = this.f23878f;
            rp rpVar2 = this.G;
            if (rpVar2 == null || (f4Var = rpVar2.f26733a) == null) {
                j11 = 0;
            } else {
                org.telegram.ui.ActionBar.e4 e4Var = (org.telegram.ui.ActionBar.e4) f4Var.f17717f.get(rpVar2.f26735c);
                int i18 = e4Var.h;
                if (this.U != 0) {
                    i18 = e4Var.f17677k;
                }
                Paint paint = h21Var.f23505c;
                Paint paint2 = h21Var.f23503a;
                Paint paint3 = h21Var.f23504b;
                paint.setColor(i18);
                paint3.setColor(e4Var.f17675i);
                if (this.G.f26733a.m()) {
                    i11 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, this.f23883x);
                } else {
                    i11 = e4Var.f17676j;
                }
                int alpha = paint2.getAlpha();
                paint2.setColor(i11);
                paint2.setAlpha(alpha);
                rp rpVar3 = this.G;
                eg.a aVar = (eg.a) rpVar3.f26733a.f17717f.get(rpVar3.f26735c);
                if (aVar != null) {
                    org.telegram.ui.ActionBar.e4 e4Var2 = (org.telegram.ui.ActionBar.e4) aVar;
                    if (e4Var2.a() != 0) {
                        rp rpVar4 = this.G;
                        int i19 = ((org.telegram.ui.ActionBar.e4) rpVar4.f26733a.f17717f.get(rpVar4.f26735c)).d;
                        ArrayList<Integer> arrayList = e4Var2.b(i19).message_colors;
                        if (arrayList.size() > 1) {
                            int[] iArr = new int[arrayList.size()];
                            for (int i20 = 0; i20 != arrayList.size(); i20++) {
                                iArr[i20] = arrayList.get(i20).intValue() | (-16777216);
                            }
                            float dp = this.f23877c + AndroidUtilities.dp(8.0f);
                            paint3.setShader(new LinearGradient(0.0f, dp, 0.0f, dp + this.d, iArr, (float[]) null, Shader.TileMode.CLAMP));
                        } else {
                            paint3.setShader(null);
                        }
                        paint3.setAlpha(255);
                        if (this.G != null) {
                            if (i19 >= 0) {
                                TLRPC.WallPaperSettings wallPaperSettings = e4Var2.b(i19).wallpaper.settings;
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
                                lc0Var = new lc0(true, i12, i13, i14, i15);
                                this.L = lc0Var.f();
                            } else {
                                lc0 lc0Var3 = new lc0(true, i12, i12, i12, i12);
                                this.L = -16777216;
                                lc0Var = lc0Var3;
                            }
                            this.G.f26734b = lc0Var;
                        }
                        j11 = 0;
                        h21Var.d = this.G.f26734b;
                        invalidate();
                    }
                }
                rp rpVar5 = this.G;
                org.telegram.ui.ActionBar.e4 e4Var3 = (org.telegram.ui.ActionBar.e4) rpVar5.f26733a.f17717f.get(rpVar5.f26735c);
                if (this.G != null) {
                    int i24 = e4Var3.f17677k;
                    int i25 = e4Var3.f17678l;
                    int i26 = e4Var3.f17679m;
                    int i27 = e4Var3.f17680n;
                    int i28 = e4Var3.f17681o;
                    j11 = 0;
                    if (e4Var3.f17670a.k(false) != null) {
                        if (i25 != 0) {
                            lc0 lc0Var4 = new lc0(i24, i25, i26, i27, true, i28, false);
                            this.L = lc0Var4.f();
                            bitmapDrawable = lc0Var4;
                        } else {
                            Drawable lc0Var5 = new lc0(i24, i24, i24, i24, true, i28, false);
                            this.L = -16777216;
                            bitmapDrawable = lc0Var5;
                        }
                    } else if (i24 != 0 && i25 != 0) {
                        bitmapDrawable = new lc0(i24, i25, i26, i27, true, i28, false);
                    } else if (i24 != 0) {
                        bitmapDrawable = new ColorDrawable(i24);
                    } else {
                        org.telegram.ui.ActionBar.i6 i6Var = e4Var3.f17670a;
                        if (i6Var != null && (i6Var.P > 0 || i6Var.f17838c != null)) {
                            org.telegram.ui.ActionBar.i6 i6Var2 = e4Var3.f17670a;
                            Bitmap scaledBitmap = AndroidUtilities.getScaledBitmap(AndroidUtilities.dp(112.0f), AndroidUtilities.dp(134.0f), i6Var2.f17838c, i6Var2.f17836b, i6Var2.P);
                            if (scaledBitmap != null) {
                                BitmapDrawable bitmapDrawable2 = new BitmapDrawable(scaledBitmap);
                                bitmapDrawable2.setFilterBitmap(true);
                                bitmapDrawable = bitmapDrawable2;
                            }
                            bitmapDrawable = null;
                        } else {
                            org.telegram.ui.ActionBar.f4 f4Var3 = this.G.f26733a;
                            if (f4Var3 == null || !f4Var3.m()) {
                                bitmapDrawable = new lc0(true, -2368069, -9722489, -2762611, -7817084);
                            }
                            bitmapDrawable = null;
                        }
                    }
                    this.G.f26734b = bitmapDrawable;
                    h21Var.d = this.G.f26734b;
                    invalidate();
                }
                j11 = 0;
                h21Var.d = this.G.f26734b;
                invalidate();
            }
            long i29 = rpVar.f26733a.i(this.V);
            if (i29 != j11) {
                TLRPC.WallPaper k10 = rpVar.f26733a.k(this.V);
                if (k10 != null) {
                    rpVar.f26733a.p(this.V, new di.x1(this, i29, rpVar, k10.settings.intensity));
                }
            } else {
                SparseArray sparseArray = rpVar.f26733a.j(this.V).f17835a0;
                if (sparseArray != null) {
                    h6Var = (org.telegram.ui.ActionBar.h6) sparseArray.get(((org.telegram.ui.ActionBar.e4) rpVar.f26733a.f17717f.get(this.V)).e);
                } else {
                    h6Var = null;
                }
                if (h6Var != null && (tL_theme = h6Var.f17806r) != null && tL_theme.settings.size() > 0) {
                    TLRPC.WallPaper wallPaper2 = h6Var.f17806r.settings.get(0).wallpaper;
                    if (wallPaper2 != null && (document = wallPaper2.document) != null) {
                        ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 120), document);
                        ImageReceiver imageReceiver = new ImageReceiver();
                        imageReceiver.setAllowLoadingOnAttachedOnly(false);
                        imageReceiver.setImage(forDocument, "120_140", null, null, null, 1);
                        imageReceiver.setDelegate(new f21(this, rpVar, wallPaper2, 0));
                        ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver);
                    }
                } else if (h6Var != null && h6Var.f17806r == null) {
                    int i30 = (int) (h6Var.f17804p * 100.0f);
                    Drawable drawable2 = rpVar.f26734b;
                    if (drawable2 instanceof lc0) {
                        lc0 lc0Var6 = (lc0) drawable2;
                        lc0Var6.t(lc0Var6.f24959u, i30);
                    }
                    ChatThemeController.chatThemeQueue.postRunnable(new my(this, rpVar, i30, 21));
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
        org.telegram.ui.ActionBar.f4 f4Var4 = this.G.f26733a;
        if (f4Var4 != null && !f4Var4.m()) {
            eg.b bVar = this.G.f26733a.f17716c;
            if (bVar != null && (str = bVar.f7511b) == null) {
                str = bVar.f7510a;
            }
            setContentDescription(str);
            return;
        }
        setContentDescription(LocaleController.getString(R.string.ChatNoTheme));
    }

    public final void g(boolean z10, boolean z11) {
        float f7 = 0.0f;
        if (!z11) {
            ValueAnimator valueAnimator = this.f23884y;
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
            ValueAnimator valueAnimator2 = this.f23884y;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            if (z10) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f23884y = ofFloat;
            ofFloat.addUpdateListener(new q70(this, 27));
            this.f23884y.addListener(new yo(16, this, z10));
            this.f23884y.setDuration(250L);
            this.f23884y.start();
        }
        this.W = z10;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        this.O = true;
        org.telegram.ui.ho hoVar = this.N;
        if (hoVar != null) {
            hoVar.f(this);
        }
        this.P.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        this.O = false;
        org.telegram.ui.ho hoVar = this.N;
        if (hoVar != null) {
            hoVar.g(this);
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
        float f7 = this.f23877c;
        RectF rectF = this.v;
        rectF.set(f7, f7, i10 - f7, i11 - f7);
        Path path = this.f23882w;
        path.reset();
        float f10 = this.f23876b;
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
    }

    @Override
    public void setBackgroundColor(int i10) {
        int i11 = org.telegram.ui.ActionBar.j6.f18016i5;
        org.telegram.ui.ActionBar.f6 f6Var = this.f23883x;
        this.f23881s.setColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        TextPaint textPaint = this.E;
        if (textPaint != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.We, f6Var));
        }
        invalidate();
    }

    public void setFallbackWallpaper(TLRPC.WallPaper wallPaper) {
        if (this.T != wallPaper) {
            this.T = wallPaper;
            rp rpVar = this.G;
            if (rpVar != null) {
                this.G = null;
                f(rpVar, 0L, false);
            }
        }
    }
}
