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
public class l11 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public TextPaint A;
    public StaticLayout B;
    public fp C;
    public final t9 D;
    public final int E;
    public fq0 F;
    public final int G;
    public int H;
    public float I;
    public org.telegram.ui.wn J;
    public boolean K;
    public final ImageReceiver L;
    public e9 M;
    public final org.telegram.ui.ActionBar.d5 N;
    public final org.telegram.ui.ActionBar.d5 O;
    public TLRPC.WallPaper P;
    public long Q;
    public int R;
    public boolean S;
    public final float f30190a;
    public final float f30191b;
    public final float f30192c;
    public final float d;
    public final float f30193e;
    public k11 f30194f;
    public k11 h;
    public float f30195n;
    public final Paint f30196r;
    public final Paint f30197s;
    public final RectF v;
    public final Path f30198w;
    public final org.telegram.ui.ActionBar.c6 f30199x;
    public ValueAnimator f30200y;

    public l11(int i10, int i11, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f30190a = AndroidUtilities.dp(8.0f);
        this.f30191b = AndroidUtilities.dp(6.0f);
        this.f30192c = AndroidUtilities.dp(4.0f);
        this.d = AndroidUtilities.dp(21.0f);
        this.f30193e = AndroidUtilities.dp(41.0f);
        this.f30194f = new k11(this);
        this.f30195n = 1.0f;
        Paint paint = new Paint(1);
        this.f30196r = paint;
        this.f30197s = new Paint(1);
        this.v = new RectF();
        this.f30198w = new Path();
        this.N = new org.telegram.ui.ActionBar.d5(0, true, false, null);
        this.O = new org.telegram.ui.ActionBar.d5(0, false, false, null);
        this.G = i11;
        this.E = i10;
        this.f30199x = c6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.L = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(8.0f));
        setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23151i5, c6Var));
        t9 t9Var = new t9(context);
        this.D = t9Var;
        t9Var.getImageReceiver().setCrossfadeWithOldImage(true);
        t9Var.getImageReceiver().setAllowStartLottieAnimation(false);
        t9Var.getImageReceiver().setAutoRepeat(0);
        if (i11 != 0 && i11 != 3 && i11 != 2) {
            addView(t9Var, i7.f6.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 12.0f));
        } else {
            addView(t9Var, i7.f6.d(28, 28.0f, 81, 0.0f, 0.0f, 0.0f, 12.0f));
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
        StaticLayout staticLayout = this.B;
        if (staticLayout != null) {
            return staticLayout;
        }
        TextPaint textPaint = new TextPaint(129);
        this.A = textPaint;
        textPaint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.We, this.f30199x));
        this.A.setTextSize(AndroidUtilities.dp(c()));
        this.A.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(52.0f);
        int i10 = this.G;
        if (i10 == 3 || i10 == 4) {
            dp = AndroidUtilities.dp(77.0f);
        }
        int i11 = dp;
        String b10 = b();
        TextPaint textPaint2 = this.A;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        StaticLayout d = bw0.d(b10, textPaint2, i11, true, i11, 3);
        this.B = d;
        return d;
    }

    public String b() {
        return LocaleController.getString(R.string.ChatNoTheme);
    }

    public int c() {
        return 14;
    }

    public final void d() {
        if (this.D.getImageReceiver().getLottieAnimation() != null) {
            AndroidUtilities.cancelRunOnUIThread(this.F);
            this.D.setVisibility(0);
            if (!this.D.getImageReceiver().getLottieAnimation().f34742h0) {
                this.D.getImageReceiver().getLottieAnimation().L(0, true, false);
                this.D.getImageReceiver().getLottieAnimation().start();
            }
            this.D.animate().scaleX(2.0f).scaleY(2.0f).setDuration(300L).setInterpolator(AndroidUtilities.overshootInterpolator).start();
            fq0 fq0Var = new fq0(this, 16);
            this.F = fq0Var;
            AndroidUtilities.runOnUIThread(fq0Var, 2500L);
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
        k11 k11Var;
        k11 k11Var2;
        if (this.C == null) {
            super.dispatchDraw(canvas);
            return;
        }
        if (this.J != null) {
            canvas.save();
            canvas.clipPath(this.f30198w);
            this.J.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.J.draw(canvas);
            canvas.restore();
        }
        if (this.f30195n != 1.0f && (k11Var2 = this.h) != null) {
            k11Var2.b(canvas, 1.0f);
        }
        float f9 = this.f30195n;
        if (f9 != 0.0f) {
            this.f30194f.b(canvas, f9);
        }
        if (this.f30195n != 1.0f && (k11Var = this.h) != null) {
            k11Var.a(canvas, 1.0f);
        }
        float f10 = this.f30195n;
        if (f10 != 0.0f) {
            this.f30194f.a(canvas, f10);
        }
        float f11 = this.f30195n;
        if (f11 != 1.0f) {
            float f12 = f11 + 0.10666667f;
            this.f30195n = f12;
            if (f12 >= 1.0f) {
                this.f30195n = 1.0f;
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void f(fp fpVar, long j10, boolean z10) {
        boolean z11;
        boolean z12;
        long j11;
        int i10;
        long j12;
        org.telegram.ui.ActionBar.e6 e6Var;
        TLRPC.TL_theme tL_theme;
        TLRPC.Document document;
        org.telegram.ui.ActionBar.b4 b4Var;
        int i11;
        BitmapDrawable bitmapDrawable;
        int i12;
        int i13;
        int i14;
        int i15;
        yb0 yb0Var;
        Drawable drawable;
        org.telegram.ui.wn wnVar;
        org.telegram.ui.wn wnVar2;
        if (this.C != fpVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i16 = this.R;
        int i17 = fpVar.f28514c;
        if (i16 != i17) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.R = i17;
        this.C = fpVar;
        TLRPC.Document f9 = fpVar.f28512a.f();
        org.telegram.ui.ActionBar.b4 b4Var2 = fpVar.f28512a;
        if (b4Var2.d instanceof TLRPC.TL_chatThemeUniqueGift) {
            j11 = ChatThemeController.getInstance(b4Var2.f22767g).getGiftThemeUser(((TLRPC.TL_chatThemeUniqueGift) b4Var2.d).gift.slug);
        } else {
            j11 = 0;
        }
        this.Q = j11;
        if (j10 == j11) {
            this.Q = 0L;
        }
        String str = null;
        if (this.Q != 0) {
            if (this.M == null) {
                this.M = new e9((org.telegram.ui.ActionBar.c6) null);
            }
            TLObject userOrChat = MessagesController.getInstance(this.E).getUserOrChat(this.Q);
            this.M.j(this.E, userOrChat);
            this.L.setForUserOrChat(userOrChat, this.M);
        } else {
            this.L.clearImage();
        }
        if (z11) {
            fq0 fq0Var = this.F;
            if (fq0Var != null) {
                AndroidUtilities.cancelRunOnUIThread(fq0Var);
                this.F = null;
            }
            this.D.animate().cancel();
            this.D.setScaleX(1.0f);
            this.D.setScaleY(1.0f);
        }
        if (z11) {
            if (f9 != null) {
                drawable = DocumentObject.getSvgThumb(f9, org.telegram.ui.ActionBar.g6.f23045c7, 0.2f);
            } else {
                drawable = null;
            }
            if (drawable == null) {
                Emoji.preloadEmoji(fpVar.f28512a.f22765e);
                drawable = Emoji.getEmojiDrawable(fpVar.f28512a.f22765e);
            }
            this.D.h(ImageLocation.getForDocument(f9), "50_50", drawable, null);
            fpVar.f28512a.getClass();
            TLRPC.WallPaper wallPaper = this.P;
            if (wallPaper != null) {
                if (this.K && (wnVar2 = this.J) != null) {
                    wnVar2.g(this);
                }
                org.telegram.ui.wn wnVar3 = new org.telegram.ui.wn(wallPaper, false, true);
                this.J = wnVar3;
                wnVar3.f44330b = this;
                yb0 yb0Var2 = wnVar3.f44333f;
                if (yb0Var2 != null) {
                    yb0Var2.r(this);
                }
                if (this.K) {
                    this.J.f(this);
                }
            } else {
                if (this.K && (wnVar = this.J) != null) {
                    wnVar.g(this);
                }
                this.J = null;
            }
        }
        t9 t9Var = this.D;
        if (fpVar.f28512a.m() && this.P != null) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        t9Var.setVisibility(i10);
        if (z11 || z12) {
            if (z10) {
                this.f30195n = 0.0f;
                this.h = this.f30194f;
                this.f30194f = new k11(this);
                invalidate();
            } else {
                this.f30195n = 1.0f;
            }
            k11 k11Var = this.f30194f;
            fp fpVar2 = this.C;
            if (fpVar2 == null || (b4Var = fpVar2.f28512a) == null) {
                j12 = 0;
            } else {
                org.telegram.ui.ActionBar.a4 a4Var = (org.telegram.ui.ActionBar.a4) b4Var.f22766f.get(fpVar2.f28514c);
                int i18 = a4Var.h;
                if (this.Q != 0) {
                    i18 = a4Var.f22738k;
                }
                Paint paint = k11Var.f29886c;
                Paint paint2 = k11Var.f29884a;
                Paint paint3 = k11Var.f29885b;
                paint.setColor(i18);
                paint3.setColor(a4Var.f22736i);
                if (this.C.f28512a.m()) {
                    i11 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, this.f30199x);
                } else {
                    i11 = a4Var.f22737j;
                }
                int alpha = paint2.getAlpha();
                paint2.setColor(i11);
                paint2.setAlpha(alpha);
                fp fpVar3 = this.C;
                qf.a aVar = (qf.a) fpVar3.f28512a.f22766f.get(fpVar3.f28514c);
                if (aVar != null) {
                    org.telegram.ui.ActionBar.a4 a4Var2 = (org.telegram.ui.ActionBar.a4) aVar;
                    if (a4Var2.a() != 0) {
                        fp fpVar4 = this.C;
                        int i19 = ((org.telegram.ui.ActionBar.a4) fpVar4.f28512a.f22766f.get(fpVar4.f28514c)).d;
                        ArrayList<Integer> arrayList = a4Var2.b(i19).message_colors;
                        if (arrayList.size() > 1) {
                            int[] iArr = new int[arrayList.size()];
                            for (int i20 = 0; i20 != arrayList.size(); i20++) {
                                iArr[i20] = arrayList.get(i20).intValue() | (-16777216);
                            }
                            float dp = this.f30192c + AndroidUtilities.dp(8.0f);
                            paint3.setShader(new LinearGradient(0.0f, dp, 0.0f, dp + this.d, iArr, (float[]) null, Shader.TileMode.CLAMP));
                        } else {
                            paint3.setShader(null);
                        }
                        paint3.setAlpha(255);
                        if (this.C != null) {
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
                                yb0Var = new yb0(true, i12, i13, i14, i15);
                                this.H = yb0Var.f();
                            } else {
                                yb0 yb0Var3 = new yb0(true, i12, i12, i12, i12);
                                this.H = -16777216;
                                yb0Var = yb0Var3;
                            }
                            this.C.f28513b = yb0Var;
                        }
                        j12 = 0;
                        k11Var.d = this.C.f28513b;
                        invalidate();
                    }
                }
                fp fpVar5 = this.C;
                org.telegram.ui.ActionBar.a4 a4Var3 = (org.telegram.ui.ActionBar.a4) fpVar5.f28512a.f22766f.get(fpVar5.f28514c);
                if (this.C != null) {
                    int i24 = a4Var3.f22738k;
                    int i25 = a4Var3.f22739l;
                    int i26 = a4Var3.f22740m;
                    int i27 = a4Var3.f22741n;
                    int i28 = a4Var3.f22742o;
                    j12 = 0;
                    if (a4Var3.f22730a.k(false) != null) {
                        if (i25 != 0) {
                            yb0 yb0Var4 = new yb0(i24, i25, i26, i27, true, i28, false);
                            this.H = yb0Var4.f();
                            bitmapDrawable = yb0Var4;
                        } else {
                            Drawable yb0Var5 = new yb0(i24, i24, i24, i24, true, i28, false);
                            this.H = -16777216;
                            bitmapDrawable = yb0Var5;
                        }
                    } else if (i24 != 0 && i25 != 0) {
                        bitmapDrawable = new yb0(i24, i25, i26, i27, true, i28, false);
                    } else if (i24 != 0) {
                        bitmapDrawable = new ColorDrawable(i24);
                    } else {
                        org.telegram.ui.ActionBar.f6 f6Var = a4Var3.f22730a;
                        if (f6Var != null && (f6Var.L > 0 || f6Var.f22945c != null)) {
                            org.telegram.ui.ActionBar.f6 f6Var2 = a4Var3.f22730a;
                            Bitmap scaledBitmap = AndroidUtilities.getScaledBitmap(AndroidUtilities.dp(112.0f), AndroidUtilities.dp(134.0f), f6Var2.f22945c, f6Var2.f22943b, f6Var2.L);
                            if (scaledBitmap != null) {
                                BitmapDrawable bitmapDrawable2 = new BitmapDrawable(scaledBitmap);
                                bitmapDrawable2.setFilterBitmap(true);
                                bitmapDrawable = bitmapDrawable2;
                            }
                            bitmapDrawable = null;
                        } else {
                            org.telegram.ui.ActionBar.b4 b4Var3 = this.C.f28512a;
                            if (b4Var3 == null || !b4Var3.m()) {
                                bitmapDrawable = new yb0(true, -2368069, -9722489, -2762611, -7817084);
                            }
                            bitmapDrawable = null;
                        }
                    }
                    this.C.f28513b = bitmapDrawable;
                    k11Var.d = this.C.f28513b;
                    invalidate();
                }
                j12 = 0;
                k11Var.d = this.C.f28513b;
                invalidate();
            }
            long i29 = fpVar.f28512a.i(this.R);
            if (i29 != j12) {
                TLRPC.WallPaper k9 = fpVar.f28512a.k(this.R);
                if (k9 != null) {
                    fpVar.f28512a.p(this.R, new u1(this, i29, fpVar, k9.settings.intensity));
                }
            } else {
                SparseArray sparseArray = fpVar.f28512a.j(this.R).W;
                if (sparseArray != null) {
                    e6Var = (org.telegram.ui.ActionBar.e6) sparseArray.get(((org.telegram.ui.ActionBar.a4) fpVar.f28512a.f22766f.get(this.R)).f22733e);
                } else {
                    e6Var = null;
                }
                if (e6Var != null && (tL_theme = e6Var.f22917r) != null && tL_theme.settings.size() > 0) {
                    TLRPC.WallPaper wallPaper2 = e6Var.f22917r.settings.get(0).wallpaper;
                    if (wallPaper2 != null && (document = wallPaper2.document) != null) {
                        ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 120), document);
                        ImageReceiver imageReceiver = new ImageReceiver();
                        imageReceiver.setAllowLoadingOnAttachedOnly(false);
                        imageReceiver.setImage(forDocument, "120_140", null, null, null, 1);
                        imageReceiver.setDelegate(new androidx.car.app.utils.a(this, fpVar, wallPaper2, 29));
                        ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver);
                    }
                } else if (e6Var != null && e6Var.f22917r == null) {
                    int i30 = (int) (e6Var.f22915p * 100.0f);
                    Drawable drawable2 = fpVar.f28513b;
                    if (drawable2 instanceof yb0) {
                        yb0 yb0Var6 = (yb0) drawable2;
                        yb0Var6.t(yb0Var6.f35036u, i30);
                    }
                    ChatThemeController.chatThemeQueue.postRunnable(new rm(this, fpVar, i30, 23));
                }
            }
        }
        if (!z10) {
            this.D.animate().cancel();
            this.D.setScaleX(1.0f);
            this.D.setScaleY(1.0f);
            AndroidUtilities.cancelRunOnUIThread(this.F);
            if (this.D.getImageReceiver().getLottieAnimation() != null) {
                this.D.getImageReceiver().getLottieAnimation().stop();
                this.D.getImageReceiver().getLottieAnimation().L(0, false, false);
            }
        }
        org.telegram.ui.ActionBar.b4 b4Var4 = this.C.f28512a;
        if (b4Var4 != null && !b4Var4.m()) {
            qf.b bVar = this.C.f28512a.f22764c;
            if (bVar != null && (str = bVar.f46660b) == null) {
                str = bVar.f46659a;
            }
            setContentDescription(str);
            return;
        }
        setContentDescription(LocaleController.getString(R.string.ChatNoTheme));
    }

    public final void g(boolean z10, boolean z11) {
        float f9 = 0.0f;
        if (!z11) {
            ValueAnimator valueAnimator = this.f30200y;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.S = z10;
            if (z10) {
                f9 = 1.0f;
            }
            this.I = f9;
            invalidate();
            return;
        }
        if (this.S != z10) {
            float f10 = this.I;
            ValueAnimator valueAnimator2 = this.f30200y;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            if (z10) {
                f9 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f9);
            this.f30200y = ofFloat;
            ofFloat.addUpdateListener(new d70(this, 27));
            this.f30200y.addListener(new z9(20, this, z10));
            this.f30200y.setDuration(250L);
            this.f30200y.start();
        }
        this.S = z10;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        this.K = true;
        org.telegram.ui.wn wnVar = this.J;
        if (wnVar != null) {
            wnVar.f(this);
        }
        this.L.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        this.K = false;
        org.telegram.ui.wn wnVar = this.J;
        if (wnVar != null) {
            wnVar.g(this);
        }
        this.L.onDetachedFromWindow();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setSelected(this.S);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f9;
        int i12 = this.G;
        if (i12 != 1 && i12 != 4) {
            if (i12 == 0) {
                f9 = 77.0f;
            } else {
                f9 = 83.0f;
            }
            int dp = AndroidUtilities.dp(f9);
            int size = View.MeasureSpec.getSize(i11);
            if (size == 0) {
                size = (int) (dp * 1.35f);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(dp, 1073741824), View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        } else {
            int size2 = View.MeasureSpec.getSize(i10);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size2, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 1.2f), 1073741824));
        }
        t9 t9Var = this.D;
        t9Var.setPivotY(t9Var.getMeasuredHeight());
        t9Var.setPivotX(t9Var.getMeasuredWidth() / 2.0f);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        float f9 = this.f30192c;
        RectF rectF = this.v;
        rectF.set(f9, f9, i10 - f9, i11 - f9);
        Path path = this.f30198w;
        path.reset();
        float f10 = this.f30191b;
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
    }

    @Override
    public void setBackgroundColor(int i10) {
        int i11 = org.telegram.ui.ActionBar.g6.f23151i5;
        org.telegram.ui.ActionBar.c6 c6Var = this.f30199x;
        this.f30197s.setColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        TextPaint textPaint = this.A;
        if (textPaint != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.We, c6Var));
        }
        invalidate();
    }

    public void setFallbackWallpaper(TLRPC.WallPaper wallPaper) {
        if (this.P != wallPaper) {
            this.P = wallPaper;
            fp fpVar = this.C;
            if (fpVar != null) {
                this.C = null;
                f(fpVar, 0L, false);
            }
        }
    }
}
