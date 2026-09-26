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
    public np G;
    public final w9 H;
    public final int I;
    public xq0 J;
    public final int K;
    public int L;
    public float M;
    public org.telegram.ui.zn N;
    public boolean O;
    public final ImageReceiver P;
    public h9 Q;
    public final org.telegram.ui.ActionBar.d5 R;
    public final org.telegram.ui.ActionBar.d5 S;
    public TLRPC.WallPaper T;
    public long U;
    public int V;
    public boolean W;
    public final float f24961a;
    public final float f24962b;
    public final float f24963c;
    public final float d;
    public final float e;
    public h21 f24964f;
    public h21 h;
    public float f24965n;
    public final Paint f24966r;
    public final Paint f24967s;
    public final RectF v;
    public final Path f24968w;
    public final org.telegram.ui.ActionBar.d6 f24969x;
    public ValueAnimator f24970y;

    public i21(int i10, int i11, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f24961a = AndroidUtilities.dp(8.0f);
        this.f24962b = AndroidUtilities.dp(6.0f);
        this.f24963c = AndroidUtilities.dp(4.0f);
        this.d = AndroidUtilities.dp(21.0f);
        this.e = AndroidUtilities.dp(41.0f);
        this.f24964f = new h21(this);
        this.f24965n = 1.0f;
        Paint paint = new Paint(1);
        this.f24966r = paint;
        this.f24967s = new Paint(1);
        this.v = new RectF();
        this.f24968w = new Path();
        this.R = new org.telegram.ui.ActionBar.d5(0, true, false, null);
        this.S = new org.telegram.ui.ActionBar.d5(0, false, false, null);
        this.K = i11;
        this.I = i10;
        this.f24969x = d6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.P = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(8.0f));
        setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19147i5, d6Var));
        w9 w9Var = new w9(context);
        this.H = w9Var;
        w9Var.getImageReceiver().setCrossfadeWithOldImage(true);
        w9Var.getImageReceiver().setAllowStartLottieAnimation(false);
        w9Var.getImageReceiver().setAutoRepeat(0);
        if (i11 != 0 && i11 != 3 && i11 != 2) {
            addView(w9Var, w7.y5.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 12.0f));
        } else {
            addView(w9Var, w7.y5.d(28, 28.0f, 81, 0.0f, 0.0f, 0.0f, 12.0f));
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
        textPaint.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.We, this.f24969x));
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
        StaticLayout d = vw0.d(b10, textPaint2, i11, true, i11, 3);
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
            if (!this.H.getImageReceiver().getLottieAnimation().f25435k0) {
                this.H.getImageReceiver().getLottieAnimation().N(0, true, false);
                this.H.getImageReceiver().getLottieAnimation().start();
            }
            this.H.animate().scaleX(2.0f).scaleY(2.0f).setDuration(300L).setInterpolator(AndroidUtilities.overshootInterpolator).start();
            xq0 xq0Var = new xq0(this, 17);
            this.J = xq0Var;
            AndroidUtilities.runOnUIThread(xq0Var, 2500L);
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
            canvas.clipPath(this.f24968w);
            this.N.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.N.draw(canvas);
            canvas.restore();
        }
        if (this.f24965n != 1.0f && (h21Var2 = this.h) != null) {
            h21Var2.b(canvas, 1.0f);
        }
        float f7 = this.f24965n;
        if (f7 != 0.0f) {
            this.f24964f.b(canvas, f7);
        }
        if (this.f24965n != 1.0f && (h21Var = this.h) != null) {
            h21Var.a(canvas, 1.0f);
        }
        float f10 = this.f24965n;
        if (f10 != 0.0f) {
            this.f24964f.a(canvas, f10);
        }
        float f11 = this.f24965n;
        if (f11 != 1.0f) {
            float f12 = f11 + 0.10666667f;
            this.f24965n = f12;
            if (f12 >= 1.0f) {
                this.f24965n = 1.0f;
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void f(np npVar, long j3, boolean z10) {
        boolean z11;
        boolean z12;
        long j10;
        int i10;
        long j11;
        org.telegram.ui.ActionBar.f6 f6Var;
        TLRPC.TL_theme tL_theme;
        TLRPC.Document document;
        org.telegram.ui.ActionBar.b4 b4Var;
        int i11;
        BitmapDrawable bitmapDrawable;
        int i12;
        int i13;
        int i14;
        int i15;
        nc0 nc0Var;
        Drawable drawable;
        org.telegram.ui.zn znVar;
        org.telegram.ui.zn znVar2;
        if (this.G != npVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i16 = this.V;
        int i17 = npVar.f26862c;
        if (i16 != i17) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.V = i17;
        this.G = npVar;
        TLRPC.Document f7 = npVar.f26860a.f();
        org.telegram.ui.ActionBar.b4 b4Var2 = npVar.f26860a;
        if (b4Var2.d instanceof TLRPC.TL_chatThemeUniqueGift) {
            j10 = ChatThemeController.getInstance(b4Var2.f18760g).getGiftThemeUser(((TLRPC.TL_chatThemeUniqueGift) b4Var2.d).gift.slug);
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
            xq0 xq0Var = this.J;
            if (xq0Var != null) {
                AndroidUtilities.cancelRunOnUIThread(xq0Var);
                this.J = null;
            }
            this.H.animate().cancel();
            this.H.setScaleX(1.0f);
            this.H.setScaleY(1.0f);
        }
        if (z11) {
            if (f7 != null) {
                drawable = DocumentObject.getSvgThumb(f7, org.telegram.ui.ActionBar.h6.f19042c7, 0.2f);
            } else {
                drawable = null;
            }
            if (drawable == null) {
                Emoji.preloadEmoji(npVar.f26860a.e);
                drawable = Emoji.getEmojiDrawable(npVar.f26860a.e);
            }
            this.H.h(ImageLocation.getForDocument(f7), "50_50", drawable, null);
            npVar.f26860a.getClass();
            TLRPC.WallPaper wallPaper = this.T;
            if (wallPaper != null) {
                if (this.O && (znVar2 = this.N) != null) {
                    znVar2.g(this);
                }
                org.telegram.ui.zn znVar3 = new org.telegram.ui.zn(wallPaper, false, true);
                this.N = znVar3;
                znVar3.f40541b = this;
                nc0 nc0Var2 = znVar3.f40543f;
                if (nc0Var2 != null) {
                    nc0Var2.r(this);
                }
                if (this.O) {
                    this.N.f(this);
                }
            } else {
                if (this.O && (znVar = this.N) != null) {
                    znVar.g(this);
                }
                this.N = null;
            }
        }
        w9 w9Var = this.H;
        if (npVar.f26860a.m() && this.T != null) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        w9Var.setVisibility(i10);
        if (z11 || z12) {
            if (z10) {
                this.f24965n = 0.0f;
                this.h = this.f24964f;
                this.f24964f = new h21(this);
                invalidate();
            } else {
                this.f24965n = 1.0f;
            }
            h21 h21Var = this.f24964f;
            np npVar2 = this.G;
            if (npVar2 == null || (b4Var = npVar2.f26860a) == null) {
                j11 = 0;
            } else {
                org.telegram.ui.ActionBar.a4 a4Var = (org.telegram.ui.ActionBar.a4) b4Var.f18759f.get(npVar2.f26862c);
                int i18 = a4Var.h;
                if (this.U != 0) {
                    i18 = a4Var.f18716k;
                }
                Paint paint = h21Var.f24650c;
                Paint paint2 = h21Var.f24648a;
                Paint paint3 = h21Var.f24649b;
                paint.setColor(i18);
                paint3.setColor(a4Var.f18714i);
                if (this.G.f26860a.m()) {
                    i11 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Oh, this.f24969x);
                } else {
                    i11 = a4Var.f18715j;
                }
                int alpha = paint2.getAlpha();
                paint2.setColor(i11);
                paint2.setAlpha(alpha);
                np npVar3 = this.G;
                fg.a aVar = (fg.a) npVar3.f26860a.f18759f.get(npVar3.f26862c);
                if (aVar != null) {
                    org.telegram.ui.ActionBar.a4 a4Var2 = (org.telegram.ui.ActionBar.a4) aVar;
                    if (a4Var2.a() != 0) {
                        np npVar4 = this.G;
                        int i19 = ((org.telegram.ui.ActionBar.a4) npVar4.f26860a.f18759f.get(npVar4.f26862c)).d;
                        ArrayList<Integer> arrayList = a4Var2.b(i19).message_colors;
                        if (arrayList.size() > 1) {
                            int[] iArr = new int[arrayList.size()];
                            for (int i20 = 0; i20 != arrayList.size(); i20++) {
                                iArr[i20] = arrayList.get(i20).intValue() | (-16777216);
                            }
                            float dp = this.f24963c + AndroidUtilities.dp(8.0f);
                            paint3.setShader(new LinearGradient(0.0f, dp, 0.0f, dp + this.d, iArr, (float[]) null, Shader.TileMode.CLAMP));
                        } else {
                            paint3.setShader(null);
                        }
                        paint3.setAlpha(255);
                        if (this.G != null) {
                            if (i19 >= 0) {
                                TLRPC.WallPaperSettings wallPaperSettings = a4Var2.b(i19).wallpaper.settings;
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
                                nc0Var = new nc0(true, i12, i13, i14, i15);
                                this.L = nc0Var.f();
                            } else {
                                nc0 nc0Var3 = new nc0(true, i12, i12, i12, i12);
                                this.L = -16777216;
                                nc0Var = nc0Var3;
                            }
                            this.G.f26861b = nc0Var;
                        }
                        j11 = 0;
                        h21Var.d = this.G.f26861b;
                        invalidate();
                    }
                }
                np npVar5 = this.G;
                org.telegram.ui.ActionBar.a4 a4Var3 = (org.telegram.ui.ActionBar.a4) npVar5.f26860a.f18759f.get(npVar5.f26862c);
                if (this.G != null) {
                    int i24 = a4Var3.f18716k;
                    int i25 = a4Var3.f18717l;
                    int i26 = a4Var3.f18718m;
                    int i27 = a4Var3.f18719n;
                    int i28 = a4Var3.f18720o;
                    j11 = 0;
                    if (a4Var3.f18709a.k(false) != null) {
                        if (i25 != 0) {
                            nc0 nc0Var4 = new nc0(i24, i25, i26, i27, true, i28, false);
                            this.L = nc0Var4.f();
                            bitmapDrawable = nc0Var4;
                        } else {
                            Drawable nc0Var5 = new nc0(i24, i24, i24, i24, true, i28, false);
                            this.L = -16777216;
                            bitmapDrawable = nc0Var5;
                        }
                    } else if (i24 != 0 && i25 != 0) {
                        bitmapDrawable = new nc0(i24, i25, i26, i27, true, i28, false);
                    } else if (i24 != 0) {
                        bitmapDrawable = new ColorDrawable(i24);
                    } else {
                        org.telegram.ui.ActionBar.g6 g6Var = a4Var3.f18709a;
                        if (g6Var != null && (g6Var.P > 0 || g6Var.f18936c != null)) {
                            org.telegram.ui.ActionBar.g6 g6Var2 = a4Var3.f18709a;
                            Bitmap scaledBitmap = AndroidUtilities.getScaledBitmap(AndroidUtilities.dp(112.0f), AndroidUtilities.dp(134.0f), g6Var2.f18936c, g6Var2.f18934b, g6Var2.P);
                            if (scaledBitmap != null) {
                                BitmapDrawable bitmapDrawable2 = new BitmapDrawable(scaledBitmap);
                                bitmapDrawable2.setFilterBitmap(true);
                                bitmapDrawable = bitmapDrawable2;
                            }
                            bitmapDrawable = null;
                        } else {
                            org.telegram.ui.ActionBar.b4 b4Var3 = this.G.f26860a;
                            if (b4Var3 == null || !b4Var3.m()) {
                                bitmapDrawable = new nc0(true, -2368069, -9722489, -2762611, -7817084);
                            }
                            bitmapDrawable = null;
                        }
                    }
                    this.G.f26861b = bitmapDrawable;
                    h21Var.d = this.G.f26861b;
                    invalidate();
                }
                j11 = 0;
                h21Var.d = this.G.f26861b;
                invalidate();
            }
            long i29 = npVar.f26860a.i(this.V);
            if (i29 != j11) {
                TLRPC.WallPaper k10 = npVar.f26860a.k(this.V);
                if (k10 != null) {
                    npVar.f26860a.p(this.V, new ei.u1(this, i29, npVar, k10.settings.intensity));
                }
            } else {
                SparseArray sparseArray = npVar.f26860a.j(this.V).f18933a0;
                if (sparseArray != null) {
                    f6Var = (org.telegram.ui.ActionBar.f6) sparseArray.get(((org.telegram.ui.ActionBar.a4) npVar.f26860a.f18759f.get(this.V)).e);
                } else {
                    f6Var = null;
                }
                if (f6Var != null && (tL_theme = f6Var.f18899r) != null && tL_theme.settings.size() > 0) {
                    TLRPC.WallPaper wallPaper2 = f6Var.f18899r.settings.get(0).wallpaper;
                    if (wallPaper2 != null && (document = wallPaper2.document) != null) {
                        ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 120), document);
                        ImageReceiver imageReceiver = new ImageReceiver();
                        imageReceiver.setAllowLoadingOnAttachedOnly(false);
                        imageReceiver.setImage(forDocument, "120_140", null, null, null, 1);
                        imageReceiver.setDelegate(new t50(this, npVar, wallPaper2, 2));
                        ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver);
                    }
                } else if (f6Var != null && f6Var.f18899r == null) {
                    int i30 = (int) (f6Var.f18897p * 100.0f);
                    Drawable drawable2 = npVar.f26861b;
                    if (drawable2 instanceof nc0) {
                        nc0 nc0Var6 = (nc0) drawable2;
                        nc0Var6.t(nc0Var6.f26773u, i30);
                    }
                    ChatThemeController.chatThemeQueue.postRunnable(new ym(this, npVar, i30, 23));
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
        org.telegram.ui.ActionBar.b4 b4Var4 = this.G.f26860a;
        if (b4Var4 != null && !b4Var4.m()) {
            fg.b bVar = this.G.f26860a.f18758c;
            if (bVar != null && (str = bVar.f9049b) == null) {
                str = bVar.f9048a;
            }
            setContentDescription(str);
            return;
        }
        setContentDescription(LocaleController.getString(R.string.ChatNoTheme));
    }

    public final void g(boolean z10, boolean z11) {
        float f7 = 0.0f;
        if (!z11) {
            ValueAnimator valueAnimator = this.f24970y;
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
            ValueAnimator valueAnimator2 = this.f24970y;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            if (z10) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f24970y = ofFloat;
            ofFloat.addUpdateListener(new t70(this, 27));
            this.f24970y.addListener(new ca(20, this, z10));
            this.f24970y.setDuration(250L);
            this.f24970y.start();
        }
        this.W = z10;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        this.O = true;
        org.telegram.ui.zn znVar = this.N;
        if (znVar != null) {
            znVar.f(this);
        }
        this.P.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        this.O = false;
        org.telegram.ui.zn znVar = this.N;
        if (znVar != null) {
            znVar.g(this);
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
        float f7 = this.f24963c;
        RectF rectF = this.v;
        rectF.set(f7, f7, i10 - f7, i11 - f7);
        Path path = this.f24968w;
        path.reset();
        float f10 = this.f24962b;
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
    }

    @Override
    public void setBackgroundColor(int i10) {
        int i11 = org.telegram.ui.ActionBar.h6.f19147i5;
        org.telegram.ui.ActionBar.d6 d6Var = this.f24969x;
        this.f24967s.setColor(org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
        TextPaint textPaint = this.E;
        if (textPaint != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.We, d6Var));
        }
        invalidate();
    }

    public void setFallbackWallpaper(TLRPC.WallPaper wallPaper) {
        if (this.T != wallPaper) {
            this.T = wallPaper;
            np npVar = this.G;
            if (npVar != null) {
                this.G = null;
                f(npVar, 0L, false);
            }
        }
    }
}
