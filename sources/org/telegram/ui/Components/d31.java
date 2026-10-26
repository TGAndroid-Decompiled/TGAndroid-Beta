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
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public class d31 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.p6 {
    public TextPaint E;
    public StaticLayout F;
    public xp G;
    public final y9 H;
    public final int I;
    public mp0 J;
    public final int K;
    public int L;
    public float M;
    public org.telegram.ui.xn N;
    public boolean O;
    public final ImageReceiver P;
    public j9 Q;
    public final org.telegram.ui.ActionBar.l5 R;
    public final org.telegram.ui.ActionBar.l5 S;
    public TLRPC.WallPaper T;
    public long U;
    public int V;
    public boolean W;
    public final float f27371a;
    public final float f27372b;
    public final float f27373c;
    public final float d;
    public final float e;
    public c31 f27374f;
    public c31 h;
    public float f27375n;
    public final Paint f27376r;
    public final Paint f27377s;
    public final RectF v;
    public final Path f27378w;
    public final org.telegram.ui.ActionBar.u6 f27379x;
    public ValueAnimator f27380y;

    public d31(int i10, int i11, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f27371a = AndroidUtilities.dp(8.0f);
        this.f27372b = AndroidUtilities.dp(6.0f);
        this.f27373c = AndroidUtilities.dp(4.0f);
        this.d = AndroidUtilities.dp(21.0f);
        this.e = AndroidUtilities.dp(41.0f);
        this.f27374f = new c31(this);
        this.f27375n = 1.0f;
        Paint paint = new Paint(1);
        this.f27376r = paint;
        this.f27377s = new Paint(1);
        this.v = new RectF();
        this.f27378w = new Path();
        this.R = new org.telegram.ui.ActionBar.l5(0, true, false, null);
        this.S = new org.telegram.ui.ActionBar.l5(0, false, false, null);
        this.K = i11;
        this.I = i10;
        this.f27379x = u6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.P = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(8.0f));
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23447i5, this, u6Var);
        y9 y9Var = new y9(context);
        this.H = y9Var;
        y9Var.getImageReceiver().setCrossfadeWithOldImage(true);
        y9Var.getImageReceiver().setAllowStartLottieAnimation(false);
        y9Var.getImageReceiver().setAutoRepeat(0);
        if (i11 != 0 && i11 != 3 && i11 != 2) {
            addView(y9Var, gb1.h(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 12.0f));
        } else {
            addView(y9Var, gb1.h(28, 28.0f, 81, 0.0f, 0.0f, 0.0f, 12.0f));
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
        textPaint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.We, this.f27379x));
        this.E.setTextSize(AndroidUtilities.dp(c()));
        this.E.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(52.0f);
        int i10 = this.K;
        if (i10 == 3 || i10 == 4) {
            dp = AndroidUtilities.dp(77.0f);
        }
        String b10 = b();
        TextPaint textPaint2 = this.E;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        StaticLayout d = px0.d(b10, textPaint2, true, dp, 3);
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
            if (!this.H.getImageReceiver().getLottieAnimation().f34749k0) {
                this.H.getImageReceiver().getLottieAnimation().N(0, true, false);
                this.H.getImageReceiver().getLottieAnimation().start();
            }
            this.H.animate().scaleX(2.0f).scaleY(2.0f).setDuration(300L).setInterpolator(AndroidUtilities.overshootInterpolator).start();
            mp0 mp0Var = new mp0(this, 22);
            this.J = mp0Var;
            AndroidUtilities.runOnUIThread(mp0Var, 2500L);
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
        c31 c31Var;
        c31 c31Var2;
        if (this.G == null) {
            super.dispatchDraw(canvas);
            return;
        }
        if (this.N != null) {
            canvas.save();
            canvas.clipPath(this.f27378w);
            this.N.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.N.draw(canvas);
            canvas.restore();
        }
        if (this.f27375n != 1.0f && (c31Var2 = this.h) != null) {
            c31Var2.b(canvas, 1.0f);
        }
        float f7 = this.f27375n;
        if (f7 != 0.0f) {
            this.f27374f.b(canvas, f7);
        }
        if (this.f27375n != 1.0f && (c31Var = this.h) != null) {
            c31Var.a(canvas, 1.0f);
        }
        float f10 = this.f27375n;
        if (f10 != 0.0f) {
            this.f27374f.a(canvas, f10);
        }
        float f11 = this.f27375n;
        if (f11 != 1.0f) {
            float f12 = f11 + 0.10666667f;
            this.f27375n = f12;
            if (f12 >= 1.0f) {
                this.f27375n = 1.0f;
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void f(xp xpVar, long j10, boolean z10) {
        boolean z11;
        boolean z12;
        long j11;
        int i10;
        org.telegram.ui.ActionBar.w6 w6Var;
        TLRPC.TL_theme tL_theme;
        TLRPC.Document document;
        org.telegram.ui.ActionBar.h4 h4Var;
        int i11;
        BitmapDrawable uc0Var;
        int i12;
        int i13;
        int i14;
        int i15;
        uc0 uc0Var2;
        String str;
        Drawable drawable;
        org.telegram.ui.xn xnVar;
        org.telegram.ui.xn xnVar2;
        if (this.G != xpVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i16 = this.V;
        int i17 = xpVar.f34795c;
        if (i16 != i17) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.V = i17;
        this.G = xpVar;
        TLRPC.Document e = xpVar.f34793a.e();
        org.telegram.ui.ActionBar.h4 h4Var2 = xpVar.f34793a;
        if (h4Var2.d instanceof TLRPC.TL_chatThemeUniqueGift) {
            j11 = ChatThemeController.getInstance(h4Var2.f22686g).getGiftThemeUser(((TLRPC.TL_chatThemeUniqueGift) h4Var2.d).gift.slug);
        } else {
            j11 = 0;
        }
        this.U = j11;
        if (j10 == j11) {
            this.U = 0L;
        }
        if (this.U != 0) {
            if (this.Q == null) {
                this.Q = new j9((org.telegram.ui.ActionBar.u6) null);
            }
            TLObject userOrChat = MessagesController.getInstance(this.I).getUserOrChat(this.U);
            this.Q.j(this.I, userOrChat);
            this.P.setForUserOrChat(userOrChat, this.Q);
        } else {
            this.P.clearImage();
        }
        if (z11) {
            mp0 mp0Var = this.J;
            if (mp0Var != null) {
                AndroidUtilities.cancelRunOnUIThread(mp0Var);
                this.J = null;
            }
            this.H.animate().cancel();
            this.H.setScaleX(1.0f);
            this.H.setScaleY(1.0f);
        }
        if (z11) {
            if (e != null) {
                drawable = DocumentObject.getSvgThumb(e, org.telegram.ui.ActionBar.y6.f23338c7, 0.2f);
            } else {
                drawable = null;
            }
            if (drawable == null) {
                Emoji.preloadEmoji(xpVar.f34793a.e);
                drawable = Emoji.getEmojiDrawable(xpVar.f34793a.e);
            }
            this.H.h(ImageLocation.getForDocument(e), "50_50", drawable, null);
            xpVar.f34793a.getClass();
            TLRPC.WallPaper wallPaper = this.T;
            if (wallPaper != null) {
                if (this.O && (xnVar2 = this.N) != null) {
                    xnVar2.g(this);
                }
                org.telegram.ui.xn xnVar3 = new org.telegram.ui.xn(wallPaper, false, true);
                this.N = xnVar3;
                xnVar3.f45811b = this;
                uc0 uc0Var3 = xnVar3.f45813f;
                if (uc0Var3 != null) {
                    uc0Var3.q(this);
                }
                if (this.O) {
                    this.N.f(this);
                }
            } else {
                if (this.O && (xnVar = this.N) != null) {
                    xnVar.g(this);
                }
                this.N = null;
            }
        }
        y9 y9Var = this.H;
        if (xpVar.f34793a.l() && this.T != null) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        y9Var.setVisibility(i10);
        if (z11 || z12) {
            if (z10) {
                this.f27375n = 0.0f;
                this.h = this.f27374f;
                this.f27374f = new c31(this);
                invalidate();
            } else {
                this.f27375n = 1.0f;
            }
            c31 c31Var = this.f27374f;
            xp xpVar2 = this.G;
            if (xpVar2 != null && (h4Var = xpVar2.f34793a) != null) {
                org.telegram.ui.ActionBar.g4 g4Var = (org.telegram.ui.ActionBar.g4) h4Var.f22685f.get(xpVar2.f34795c);
                int i18 = g4Var.h;
                if (this.U != 0) {
                    i18 = g4Var.f22657k;
                }
                Paint paint = c31Var.f27052c;
                Paint paint2 = c31Var.f27050a;
                Paint paint3 = c31Var.f27051b;
                paint.setColor(i18);
                paint3.setColor(g4Var.f22655i);
                if (this.G.f34793a.l()) {
                    i11 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, this.f27379x);
                } else {
                    i11 = g4Var.f22656j;
                }
                int alpha = paint2.getAlpha();
                paint2.setColor(i11);
                paint2.setAlpha(alpha);
                xp xpVar3 = this.G;
                hg.a aVar = (hg.a) xpVar3.f34793a.f22685f.get(xpVar3.f34795c);
                if (aVar != null) {
                    org.telegram.ui.ActionBar.g4 g4Var2 = (org.telegram.ui.ActionBar.g4) aVar;
                    if (g4Var2.a() != 0) {
                        xp xpVar4 = this.G;
                        int i19 = ((org.telegram.ui.ActionBar.g4) xpVar4.f34793a.f22685f.get(xpVar4.f34795c)).d;
                        ArrayList<Integer> arrayList = g4Var2.b(i19).message_colors;
                        if (arrayList.size() > 1) {
                            int[] iArr = new int[arrayList.size()];
                            for (int i20 = 0; i20 != arrayList.size(); i20++) {
                                iArr[i20] = arrayList.get(i20).intValue() | (-16777216);
                            }
                            float dp = this.f27373c + AndroidUtilities.dp(8.0f);
                            paint3.setShader(new LinearGradient(0.0f, dp, 0.0f, dp + this.d, iArr, (float[]) null, Shader.TileMode.CLAMP));
                        } else {
                            paint3.setShader(null);
                        }
                        paint3.setAlpha(255);
                        if (this.G != null) {
                            if (i19 >= 0) {
                                TLRPC.WallPaperSettings wallPaperSettings = g4Var2.b(i19).wallpaper.settings;
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
                                uc0Var2 = new uc0(true, i12, i13, i14, i15);
                                this.L = uc0Var2.f();
                            } else {
                                int i24 = i12;
                                uc0 uc0Var4 = new uc0(true, i12, i24, i24, i12);
                                this.L = -16777216;
                                uc0Var2 = uc0Var4;
                            }
                            this.G.f34794b = uc0Var2;
                        }
                        c31Var.d = this.G.f34794b;
                        invalidate();
                    }
                }
                xp xpVar5 = this.G;
                org.telegram.ui.ActionBar.g4 g4Var3 = (org.telegram.ui.ActionBar.g4) xpVar5.f34793a.f22685f.get(xpVar5.f34795c);
                if (this.G != null) {
                    int i25 = g4Var3.f22657k;
                    int i26 = g4Var3.f22658l;
                    int i27 = g4Var3.f22659m;
                    int i28 = g4Var3.f22660n;
                    int i29 = g4Var3.f22661o;
                    if (g4Var3.f22650a.k(false) != null) {
                        if (i26 != 0) {
                            uc0 uc0Var5 = new uc0(i25, i26, i27, i28, true, i29, false);
                            this.L = uc0Var5.f();
                            uc0Var = uc0Var5;
                        } else {
                            Drawable uc0Var6 = new uc0(i25, i25, i25, i25, true, i29, false);
                            this.L = -16777216;
                            uc0Var = uc0Var6;
                        }
                    } else if (i25 != 0 && i26 != 0) {
                        uc0Var = new uc0(i25, i26, i27, i28, true, i29, false);
                    } else if (i25 != 0) {
                        uc0Var = new ColorDrawable(i25);
                    } else {
                        org.telegram.ui.ActionBar.x6 x6Var = g4Var3.f22650a;
                        if (x6Var != null && (x6Var.P > 0 || x6Var.f23255c != null)) {
                            org.telegram.ui.ActionBar.x6 x6Var2 = g4Var3.f22650a;
                            Bitmap scaledBitmap = AndroidUtilities.getScaledBitmap(AndroidUtilities.dp(112.0f), AndroidUtilities.dp(134.0f), x6Var2.f23255c, x6Var2.f23253b, x6Var2.P);
                            if (scaledBitmap != null) {
                                BitmapDrawable bitmapDrawable = new BitmapDrawable(scaledBitmap);
                                bitmapDrawable.setFilterBitmap(true);
                                uc0Var = bitmapDrawable;
                            }
                            uc0Var = null;
                        } else {
                            org.telegram.ui.ActionBar.h4 h4Var3 = this.G.f34793a;
                            if (h4Var3 == null || !h4Var3.l()) {
                                uc0Var = new uc0(true, -2368069, -9722489, -2762611, -7817084);
                            }
                            uc0Var = null;
                        }
                    }
                    this.G.f34794b = uc0Var;
                }
                c31Var.d = this.G.f34794b;
                invalidate();
            }
            long h = xpVar.f34793a.h(this.V);
            if (h != 0) {
                TLRPC.WallPaper j12 = xpVar.f34793a.j(this.V);
                if (j12 != null) {
                    xpVar.f34793a.o(this.V, new s1(this, h, xpVar, j12.settings.intensity));
                }
            } else {
                SparseArray sparseArray = xpVar.f34793a.i(this.V).f23252a0;
                if (sparseArray != null) {
                    w6Var = (org.telegram.ui.ActionBar.w6) sparseArray.get(((org.telegram.ui.ActionBar.g4) xpVar.f34793a.f22685f.get(this.V)).e);
                } else {
                    w6Var = null;
                }
                if (w6Var != null && (tL_theme = w6Var.f23229r) != null && tL_theme.settings.size() > 0) {
                    TLRPC.WallPaper wallPaper2 = w6Var.f23229r.settings.get(0).wallpaper;
                    if (wallPaper2 != null && (document = wallPaper2.document) != null) {
                        ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 120), document);
                        ImageReceiver imageReceiver = new ImageReceiver();
                        imageReceiver.setAllowLoadingOnAttachedOnly(false);
                        imageReceiver.setImage(forDocument, "120_140", null, null, null, 1);
                        imageReceiver.setDelegate(new qy(this, xpVar, wallPaper2, 4));
                        ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver);
                    }
                } else if (w6Var != null && w6Var.f23229r == null) {
                    int i30 = (int) (w6Var.f23227p * 100.0f);
                    Drawable drawable2 = xpVar.f34794b;
                    if (drawable2 instanceof uc0) {
                        uc0 uc0Var7 = (uc0) drawable2;
                        uc0Var7.s(uc0Var7.f33374u, i30);
                    }
                    ChatThemeController.chatThemeQueue.postRunnable(new org.telegram.ui.g4(this, xpVar, i30, 27));
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
        org.telegram.ui.ActionBar.h4 h4Var4 = this.G.f34793a;
        if (h4Var4 != null && !h4Var4.l()) {
            hg.b bVar = this.G.f34793a.f22684c;
            if (bVar == null) {
                str = null;
            } else {
                str = bVar.f12830b;
                if (str == null) {
                    str = bVar.f12829a;
                }
            }
            setContentDescription(str);
            return;
        }
        setContentDescription(LocaleController.getString(R.string.ChatNoTheme));
    }

    public final void g(boolean z10, boolean z11) {
        float f7 = 0.0f;
        if (!z11) {
            ValueAnimator valueAnimator = this.f27380y;
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
            ValueAnimator valueAnimator2 = this.f27380y;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            if (z10) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f27380y = ofFloat;
            ofFloat.addUpdateListener(new e80(this, 27));
            this.f27380y.addListener(new org.telegram.ui.jo(21, this, z10));
            this.f27380y.setDuration(250L);
            this.f27380y.start();
        }
        this.W = z10;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        this.O = true;
        org.telegram.ui.xn xnVar = this.N;
        if (xnVar != null) {
            xnVar.f(this);
        }
        this.P.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        this.O = false;
        org.telegram.ui.xn xnVar = this.N;
        if (xnVar != null) {
            xnVar.g(this);
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
        y9 y9Var = this.H;
        y9Var.setPivotY(y9Var.getMeasuredHeight());
        y9Var.setPivotX(y9Var.getMeasuredWidth() / 2.0f);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        float f7 = this.f27373c;
        RectF rectF = this.v;
        rectF.set(f7, f7, i10 - f7, i11 - f7);
        Path path = this.f27378w;
        path.reset();
        float f10 = this.f27372b;
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
    }

    @Override
    public void setBackgroundColor(int i10) {
        int i11 = org.telegram.ui.ActionBar.y6.f23447i5;
        org.telegram.ui.ActionBar.u6 u6Var = this.f27379x;
        this.f27377s.setColor(org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
        TextPaint textPaint = this.E;
        if (textPaint != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.We, u6Var));
        }
        invalidate();
    }

    public void setFallbackWallpaper(TLRPC.WallPaper wallPaper) {
        if (this.T != wallPaper) {
            this.T = wallPaper;
            xp xpVar = this.G;
            if (xpVar != null) {
                this.G = null;
                f(xpVar, 0L, false);
            }
        }
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.u6 u6Var = this.f27379x;
        try {
            this.f27377s.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23447i5, u6Var));
            TextPaint textPaint = this.E;
            if (textPaint != null) {
                textPaint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.We, u6Var));
            }
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
