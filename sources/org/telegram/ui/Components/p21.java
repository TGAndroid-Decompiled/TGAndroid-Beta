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
public class p21 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public TextPaint E;
    public StaticLayout F;
    public vp G;
    public final w9 H;
    public final int I;
    public fr0 J;
    public final int K;
    public int L;
    public float M;
    public org.telegram.ui.vn N;
    public boolean O;
    public final ImageReceiver P;
    public h9 Q;
    public final org.telegram.ui.ActionBar.f5 R;
    public final org.telegram.ui.ActionBar.f5 S;
    public TLRPC.WallPaper T;
    public long U;
    public int V;
    public boolean W;
    public final float f29149a;
    public final float f29150b;
    public final float f29151c;
    public final float d;
    public final float e;
    public o21 f29152f;
    public o21 h;
    public float f29153n;
    public final Paint f29154r;
    public final Paint f29155s;
    public final RectF v;
    public final Path f29156w;
    public final org.telegram.ui.ActionBar.d6 f29157x;
    public ValueAnimator f29158y;

    public p21(int i10, int i11, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f29149a = AndroidUtilities.dp(8.0f);
        this.f29150b = AndroidUtilities.dp(6.0f);
        this.f29151c = AndroidUtilities.dp(4.0f);
        this.d = AndroidUtilities.dp(21.0f);
        this.e = AndroidUtilities.dp(41.0f);
        this.f29152f = new o21(this);
        this.f29153n = 1.0f;
        Paint paint = new Paint(1);
        this.f29154r = paint;
        this.f29155s = new Paint(1);
        this.v = new RectF();
        this.f29156w = new Path();
        this.R = new org.telegram.ui.ActionBar.f5(0, true, false, null);
        this.S = new org.telegram.ui.ActionBar.f5(0, false, false, null);
        this.K = i11;
        this.I = i10;
        this.f29157x = d6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.P = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(8.0f));
        setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21081i5, d6Var));
        w9 w9Var = new w9(context);
        this.H = w9Var;
        w9Var.getImageReceiver().setCrossfadeWithOldImage(true);
        w9Var.getImageReceiver().setAllowStartLottieAnimation(false);
        w9Var.getImageReceiver().setAutoRepeat(0);
        if (i11 != 0 && i11 != 3 && i11 != 2) {
            addView(w9Var, w7.z5.a(36.0f, 0.0f, 0.0f, 0.0f, 12.0f, 36, 81));
        } else {
            addView(w9Var, w7.z5.a(28.0f, 0.0f, 0.0f, 0.0f, 12.0f, 28, 81));
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
        textPaint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.We, this.f29157x));
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
        StaticLayout d = dx0.d(b10, textPaint2, true, dp, 3);
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
            if (!this.H.getImageReceiver().getLottieAnimation().f31021k0) {
                this.H.getImageReceiver().getLottieAnimation().N(0, true, false);
                this.H.getImageReceiver().getLottieAnimation().start();
            }
            this.H.animate().scaleX(2.0f).scaleY(2.0f).setDuration(300L).setInterpolator(AndroidUtilities.overshootInterpolator).start();
            fr0 fr0Var = new fr0(this, 16);
            this.J = fr0Var;
            AndroidUtilities.runOnUIThread(fr0Var, 2500L);
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
        o21 o21Var;
        o21 o21Var2;
        if (this.G == null) {
            super.dispatchDraw(canvas);
            return;
        }
        if (this.N != null) {
            canvas.save();
            canvas.clipPath(this.f29156w);
            this.N.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.N.draw(canvas);
            canvas.restore();
        }
        if (this.f29153n != 1.0f && (o21Var2 = this.h) != null) {
            o21Var2.b(canvas, 1.0f);
        }
        float f7 = this.f29153n;
        if (f7 != 0.0f) {
            this.f29152f.b(canvas, f7);
        }
        if (this.f29153n != 1.0f && (o21Var = this.h) != null) {
            o21Var.a(canvas, 1.0f);
        }
        float f10 = this.f29153n;
        if (f10 != 0.0f) {
            this.f29152f.a(canvas, f10);
        }
        float f11 = this.f29153n;
        if (f11 != 1.0f) {
            float f12 = f11 + 0.10666667f;
            this.f29153n = f12;
            if (f12 >= 1.0f) {
                this.f29153n = 1.0f;
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void f(vp vpVar, long j10, boolean z10) {
        boolean z11;
        boolean z12;
        long j11;
        int i10;
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
        wc0 wc0Var;
        String str;
        Drawable drawable;
        org.telegram.ui.vn vnVar;
        org.telegram.ui.vn vnVar2;
        if (this.G != vpVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i16 = this.V;
        int i17 = vpVar.f31898c;
        if (i16 != i17) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.V = i17;
        this.G = vpVar;
        TLRPC.Document e = vpVar.f31896a.e();
        org.telegram.ui.ActionBar.c4 c4Var2 = vpVar.f31896a;
        if (c4Var2.d instanceof TLRPC.TL_chatThemeUniqueGift) {
            j11 = ChatThemeController.getInstance(c4Var2.f20730g).getGiftThemeUser(((TLRPC.TL_chatThemeUniqueGift) c4Var2.d).gift.slug);
        } else {
            j11 = 0;
        }
        this.U = j11;
        if (j10 == j11) {
            this.U = 0L;
        }
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
            fr0 fr0Var = this.J;
            if (fr0Var != null) {
                AndroidUtilities.cancelRunOnUIThread(fr0Var);
                this.J = null;
            }
            this.H.animate().cancel();
            this.H.setScaleX(1.0f);
            this.H.setScaleY(1.0f);
        }
        if (z11) {
            if (e != null) {
                drawable = DocumentObject.getSvgThumb(e, org.telegram.ui.ActionBar.h6.f20975c7, 0.2f);
            } else {
                drawable = null;
            }
            if (drawable == null) {
                Emoji.preloadEmoji(vpVar.f31896a.e);
                drawable = Emoji.getEmojiDrawable(vpVar.f31896a.e);
            }
            this.H.h(ImageLocation.getForDocument(e), "50_50", drawable, null);
            vpVar.f31896a.getClass();
            TLRPC.WallPaper wallPaper = this.T;
            if (wallPaper != null) {
                if (this.O && (vnVar2 = this.N) != null) {
                    vnVar2.g(this);
                }
                org.telegram.ui.vn vnVar3 = new org.telegram.ui.vn(wallPaper, false, true);
                this.N = vnVar3;
                vnVar3.f42255b = this;
                wc0 wc0Var2 = vnVar3.f42257f;
                if (wc0Var2 != null) {
                    wc0Var2.q(this);
                }
                if (this.O) {
                    this.N.f(this);
                }
            } else {
                if (this.O && (vnVar = this.N) != null) {
                    vnVar.g(this);
                }
                this.N = null;
            }
        }
        w9 w9Var = this.H;
        if (vpVar.f31896a.l() && this.T != null) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        w9Var.setVisibility(i10);
        if (z11 || z12) {
            if (z10) {
                this.f29153n = 0.0f;
                this.h = this.f29152f;
                this.f29152f = new o21(this);
                invalidate();
            } else {
                this.f29153n = 1.0f;
            }
            o21 o21Var = this.f29152f;
            vp vpVar2 = this.G;
            if (vpVar2 != null && (c4Var = vpVar2.f31896a) != null) {
                org.telegram.ui.ActionBar.b4 b4Var = (org.telegram.ui.ActionBar.b4) c4Var.f20729f.get(vpVar2.f31898c);
                int i18 = b4Var.h;
                if (this.U != 0) {
                    i18 = b4Var.f20702k;
                }
                Paint paint = o21Var.f28878c;
                Paint paint2 = o21Var.f28876a;
                Paint paint3 = o21Var.f28877b;
                paint.setColor(i18);
                paint3.setColor(b4Var.f20700i);
                if (this.G.f31896a.l()) {
                    i11 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, this.f29157x);
                } else {
                    i11 = b4Var.f20701j;
                }
                int alpha = paint2.getAlpha();
                paint2.setColor(i11);
                paint2.setAlpha(alpha);
                vp vpVar3 = this.G;
                gg.a aVar = (gg.a) vpVar3.f31896a.f20729f.get(vpVar3.f31898c);
                if (aVar != null) {
                    org.telegram.ui.ActionBar.b4 b4Var2 = (org.telegram.ui.ActionBar.b4) aVar;
                    if (b4Var2.a() != 0) {
                        vp vpVar4 = this.G;
                        int i19 = ((org.telegram.ui.ActionBar.b4) vpVar4.f31896a.f20729f.get(vpVar4.f31898c)).d;
                        ArrayList<Integer> arrayList = b4Var2.b(i19).message_colors;
                        if (arrayList.size() > 1) {
                            int[] iArr = new int[arrayList.size()];
                            for (int i20 = 0; i20 != arrayList.size(); i20++) {
                                iArr[i20] = arrayList.get(i20).intValue() | (-16777216);
                            }
                            float dp = this.f29151c + AndroidUtilities.dp(8.0f);
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
                                wc0Var = new wc0(true, i12, i13, i14, i15);
                                this.L = wc0Var.f();
                            } else {
                                wc0 wc0Var3 = new wc0(true, i12, i12, i12, i12);
                                this.L = -16777216;
                                wc0Var = wc0Var3;
                            }
                            this.G.f31897b = wc0Var;
                        }
                        o21Var.d = this.G.f31897b;
                        invalidate();
                    }
                }
                vp vpVar5 = this.G;
                org.telegram.ui.ActionBar.b4 b4Var3 = (org.telegram.ui.ActionBar.b4) vpVar5.f31896a.f20729f.get(vpVar5.f31898c);
                if (this.G != null) {
                    int i24 = b4Var3.f20702k;
                    int i25 = b4Var3.f20703l;
                    int i26 = b4Var3.f20704m;
                    int i27 = b4Var3.f20705n;
                    int i28 = b4Var3.f20706o;
                    if (b4Var3.f20695a.k(false) != null) {
                        if (i25 != 0) {
                            wc0 wc0Var4 = new wc0(i24, i25, i26, i27, true, i28, false);
                            this.L = wc0Var4.f();
                            bitmapDrawable = wc0Var4;
                        } else {
                            Drawable wc0Var5 = new wc0(i24, i24, i24, i24, true, i28, false);
                            this.L = -16777216;
                            bitmapDrawable = wc0Var5;
                        }
                    } else if (i24 != 0 && i25 != 0) {
                        bitmapDrawable = new wc0(i24, i25, i26, i27, true, i28, false);
                    } else if (i24 != 0) {
                        bitmapDrawable = new ColorDrawable(i24);
                    } else {
                        org.telegram.ui.ActionBar.g6 g6Var = b4Var3.f20695a;
                        if (g6Var != null && (g6Var.P > 0 || g6Var.f20888c != null)) {
                            org.telegram.ui.ActionBar.g6 g6Var2 = b4Var3.f20695a;
                            Bitmap scaledBitmap = AndroidUtilities.getScaledBitmap(AndroidUtilities.dp(112.0f), AndroidUtilities.dp(134.0f), g6Var2.f20888c, g6Var2.f20886b, g6Var2.P);
                            if (scaledBitmap != null) {
                                BitmapDrawable bitmapDrawable2 = new BitmapDrawable(scaledBitmap);
                                bitmapDrawable2.setFilterBitmap(true);
                                bitmapDrawable = bitmapDrawable2;
                            }
                            bitmapDrawable = null;
                        } else {
                            org.telegram.ui.ActionBar.c4 c4Var3 = this.G.f31896a;
                            if (c4Var3 == null || !c4Var3.l()) {
                                bitmapDrawable = new wc0(true, -2368069, -9722489, -2762611, -7817084);
                            }
                            bitmapDrawable = null;
                        }
                    }
                    this.G.f31897b = bitmapDrawable;
                }
                o21Var.d = this.G.f31897b;
                invalidate();
            }
            long h = vpVar.f31896a.h(this.V);
            if (h != 0) {
                TLRPC.WallPaper j12 = vpVar.f31896a.j(this.V);
                if (j12 != null) {
                    vpVar.f31896a.o(this.V, new gi.q1(this, h, vpVar, j12.settings.intensity, 4));
                }
            } else {
                SparseArray sparseArray = vpVar.f31896a.i(this.V).f20885a0;
                if (sparseArray != null) {
                    f6Var = (org.telegram.ui.ActionBar.f6) sparseArray.get(((org.telegram.ui.ActionBar.b4) vpVar.f31896a.f20729f.get(this.V)).e);
                } else {
                    f6Var = null;
                }
                if (f6Var != null && (tL_theme = f6Var.f20849r) != null && tL_theme.settings.size() > 0) {
                    TLRPC.WallPaper wallPaper2 = f6Var.f20849r.settings.get(0).wallpaper;
                    if (wallPaper2 != null && (document = wallPaper2.document) != null) {
                        ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 120), document);
                        ImageReceiver imageReceiver = new ImageReceiver();
                        imageReceiver.setAllowLoadingOnAttachedOnly(false);
                        imageReceiver.setImage(forDocument, "120_140", null, null, null, 1);
                        imageReceiver.setDelegate(new ry(this, vpVar, wallPaper2, 4));
                        ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver);
                    }
                } else if (f6Var != null && f6Var.f20849r == null) {
                    int i29 = (int) (f6Var.f20847p * 100.0f);
                    Drawable drawable2 = vpVar.f31897b;
                    if (drawable2 instanceof wc0) {
                        wc0 wc0Var6 = (wc0) drawable2;
                        wc0Var6.s(wc0Var6.f32108u, i29);
                    }
                    ChatThemeController.chatThemeQueue.postRunnable(new org.telegram.ui.i4(this, vpVar, i29, 29));
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
        org.telegram.ui.ActionBar.c4 c4Var4 = this.G.f31896a;
        if (c4Var4 != null && !c4Var4.l()) {
            gg.b bVar = this.G.f31896a.f20728c;
            if (bVar == null) {
                str = null;
            } else {
                str = bVar.f11052b;
                if (str == null) {
                    str = bVar.f11051a;
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
            ValueAnimator valueAnimator = this.f29158y;
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
            ValueAnimator valueAnimator2 = this.f29158y;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            if (z10) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f29158y = ofFloat;
            ofFloat.addUpdateListener(new b80(this, 28));
            this.f29158y.addListener(new org.telegram.ui.ho(21, this, z10));
            this.f29158y.setDuration(250L);
            this.f29158y.start();
        }
        this.W = z10;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        this.O = true;
        org.telegram.ui.vn vnVar = this.N;
        if (vnVar != null) {
            vnVar.f(this);
        }
        this.P.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        this.O = false;
        org.telegram.ui.vn vnVar = this.N;
        if (vnVar != null) {
            vnVar.g(this);
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
        float f7 = this.f29151c;
        RectF rectF = this.v;
        rectF.set(f7, f7, i10 - f7, i11 - f7);
        Path path = this.f29156w;
        path.reset();
        float f10 = this.f29150b;
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
    }

    @Override
    public void setBackgroundColor(int i10) {
        int i11 = org.telegram.ui.ActionBar.h6.f21081i5;
        org.telegram.ui.ActionBar.d6 d6Var = this.f29157x;
        this.f29155s.setColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        TextPaint textPaint = this.E;
        if (textPaint != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.We, d6Var));
        }
        invalidate();
    }

    public void setFallbackWallpaper(TLRPC.WallPaper wallPaper) {
        if (this.T != wallPaper) {
            this.T = wallPaper;
            vp vpVar = this.G;
            if (vpVar != null) {
                this.G = null;
                f(vpVar, 0L, false);
            }
        }
    }
}
