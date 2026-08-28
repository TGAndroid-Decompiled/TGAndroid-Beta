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
public class a11 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public TextPaint A;
    public StaticLayout B;
    public bp C;
    public final o9 D;
    public final int E;
    public tp0 F;
    public final int G;
    public int H;
    public float I;
    public org.telegram.ui.tn J;
    public boolean K;
    public final ImageReceiver L;
    public z8 M;
    public final org.telegram.ui.ActionBar.d5 N;
    public final org.telegram.ui.ActionBar.d5 O;
    public TLRPC.WallPaper P;
    public long Q;
    public int R;
    public boolean S;
    public final float f26619a;
    public final float f26620b;
    public final float f26621c;
    public final float d;
    public final float f26622e;
    public z01 f26623f;
    public z01 h;
    public float f26624n;
    public final Paint f26625r;
    public final Paint f26626s;
    public final RectF v;
    public final Path f26627w;
    public final org.telegram.ui.ActionBar.b6 f26628x;
    public ValueAnimator f26629y;

    public a11(int i9, int i10, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f26619a = AndroidUtilities.dp(8.0f);
        this.f26620b = AndroidUtilities.dp(6.0f);
        this.f26621c = AndroidUtilities.dp(4.0f);
        this.d = AndroidUtilities.dp(21.0f);
        this.f26622e = AndroidUtilities.dp(41.0f);
        this.f26623f = new z01(this);
        this.f26624n = 1.0f;
        Paint paint = new Paint(1);
        this.f26625r = paint;
        this.f26626s = new Paint(1);
        this.v = new RectF();
        this.f26627w = new Path();
        this.N = new org.telegram.ui.ActionBar.d5(0, true, false, null);
        this.O = new org.telegram.ui.ActionBar.d5(0, false, false, null);
        this.G = i10;
        this.E = i9;
        this.f26628x = b6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.L = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(8.0f));
        setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23091i5, b6Var));
        o9 o9Var = new o9(context);
        this.D = o9Var;
        o9Var.getImageReceiver().setCrossfadeWithOldImage(true);
        o9Var.getImageReceiver().setAllowStartLottieAnimation(false);
        o9Var.getImageReceiver().setAutoRepeat(0);
        if (i10 != 0 && i10 != 3 && i10 != 2) {
            addView(o9Var, g7.e6.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 12.0f));
        } else {
            addView(o9Var, g7.e6.d(28, 28.0f, 81, 0.0f, 0.0f, 0.0f, 12.0f));
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
        textPaint.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.We, this.f26628x));
        this.A.setTextSize(AndroidUtilities.dp(c()));
        this.A.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(52.0f);
        int i9 = this.G;
        if (i9 == 3 || i9 == 4) {
            dp = AndroidUtilities.dp(77.0f);
        }
        int i10 = dp;
        String b10 = b();
        TextPaint textPaint2 = this.A;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        StaticLayout d = rv0.d(b10, textPaint2, i10, true, i10, 3);
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
            if (!this.D.getImageReceiver().getLottieAnimation().f30852h0) {
                this.D.getImageReceiver().getLottieAnimation().L(0, true, false);
                this.D.getImageReceiver().getLottieAnimation().start();
            }
            this.D.animate().scaleX(2.0f).scaleY(2.0f).setDuration(300L).setInterpolator(AndroidUtilities.overshootInterpolator).start();
            tp0 tp0Var = new tp0(this, 16);
            this.F = tp0Var;
            AndroidUtilities.runOnUIThread(tp0Var, 2500L);
        }
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.emojiLoaded) {
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        z01 z01Var;
        z01 z01Var2;
        if (this.C == null) {
            super.dispatchDraw(canvas);
            return;
        }
        if (this.J != null) {
            canvas.save();
            canvas.clipPath(this.f26627w);
            this.J.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.J.draw(canvas);
            canvas.restore();
        }
        if (this.f26624n != 1.0f && (z01Var2 = this.h) != null) {
            z01Var2.b(canvas, 1.0f);
        }
        float f10 = this.f26624n;
        if (f10 != 0.0f) {
            this.f26623f.b(canvas, f10);
        }
        if (this.f26624n != 1.0f && (z01Var = this.h) != null) {
            z01Var.a(canvas, 1.0f);
        }
        float f11 = this.f26624n;
        if (f11 != 0.0f) {
            this.f26623f.a(canvas, f11);
        }
        float f12 = this.f26624n;
        if (f12 != 1.0f) {
            float f13 = f12 + 0.10666667f;
            this.f26624n = f13;
            if (f13 >= 1.0f) {
                this.f26624n = 1.0f;
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void f(bp bpVar, long j10, boolean z10) {
        boolean z11;
        boolean z12;
        long j11;
        int i9;
        long j12;
        org.telegram.ui.ActionBar.d6 d6Var;
        TLRPC.TL_theme tL_theme;
        TLRPC.Document document;
        org.telegram.ui.ActionBar.b4 b4Var;
        int i10;
        BitmapDrawable bitmapDrawable;
        int i11;
        int i12;
        int i13;
        int i14;
        jb0 jb0Var;
        Drawable drawable;
        org.telegram.ui.tn tnVar;
        org.telegram.ui.tn tnVar2;
        if (this.C != bpVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i15 = this.R;
        int i16 = bpVar.f27263c;
        if (i15 != i16) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.R = i16;
        this.C = bpVar;
        TLRPC.Document f10 = bpVar.f27261a.f();
        org.telegram.ui.ActionBar.b4 b4Var2 = bpVar.f27261a;
        if (b4Var2.d instanceof TLRPC.TL_chatThemeUniqueGift) {
            j11 = ChatThemeController.getInstance(b4Var2.f22753g).getGiftThemeUser(((TLRPC.TL_chatThemeUniqueGift) b4Var2.d).gift.slug);
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
                this.M = new z8((org.telegram.ui.ActionBar.b6) null);
            }
            TLObject userOrChat = MessagesController.getInstance(this.E).getUserOrChat(this.Q);
            this.M.j(this.E, userOrChat);
            this.L.setForUserOrChat(userOrChat, this.M);
        } else {
            this.L.clearImage();
        }
        if (z11) {
            tp0 tp0Var = this.F;
            if (tp0Var != null) {
                AndroidUtilities.cancelRunOnUIThread(tp0Var);
                this.F = null;
            }
            this.D.animate().cancel();
            this.D.setScaleX(1.0f);
            this.D.setScaleY(1.0f);
        }
        if (z11) {
            if (f10 != null) {
                drawable = DocumentObject.getSvgThumb(f10, org.telegram.ui.ActionBar.f6.f22984c7, 0.2f);
            } else {
                drawable = null;
            }
            if (drawable == null) {
                Emoji.preloadEmoji(bpVar.f27261a.f22751e);
                drawable = Emoji.getEmojiDrawable(bpVar.f27261a.f22751e);
            }
            this.D.h(ImageLocation.getForDocument(f10), "50_50", drawable, null);
            bpVar.f27261a.getClass();
            TLRPC.WallPaper wallPaper = this.P;
            if (wallPaper != null) {
                if (this.K && (tnVar2 = this.J) != null) {
                    tnVar2.g(this);
                }
                org.telegram.ui.tn tnVar3 = new org.telegram.ui.tn(wallPaper, false, true);
                this.J = tnVar3;
                tnVar3.f43035b = this;
                jb0 jb0Var2 = tnVar3.f43038f;
                if (jb0Var2 != null) {
                    jb0Var2.r(this);
                }
                if (this.K) {
                    this.J.f(this);
                }
            } else {
                if (this.K && (tnVar = this.J) != null) {
                    tnVar.g(this);
                }
                this.J = null;
            }
        }
        o9 o9Var = this.D;
        if (bpVar.f27261a.m() && this.P != null) {
            i9 = 8;
        } else {
            i9 = 0;
        }
        o9Var.setVisibility(i9);
        if (z11 || z12) {
            if (z10) {
                this.f26624n = 0.0f;
                this.h = this.f26623f;
                this.f26623f = new z01(this);
                invalidate();
            } else {
                this.f26624n = 1.0f;
            }
            z01 z01Var = this.f26623f;
            bp bpVar2 = this.C;
            if (bpVar2 == null || (b4Var = bpVar2.f27261a) == null) {
                j12 = 0;
            } else {
                org.telegram.ui.ActionBar.a4 a4Var = (org.telegram.ui.ActionBar.a4) b4Var.f22752f.get(bpVar2.f27263c);
                int i17 = a4Var.h;
                if (this.Q != 0) {
                    i17 = a4Var.f22722k;
                }
                Paint paint = z01Var.f35145c;
                Paint paint2 = z01Var.f35143a;
                Paint paint3 = z01Var.f35144b;
                paint.setColor(i17);
                paint3.setColor(a4Var.f22720i);
                if (this.C.f27261a.m()) {
                    i10 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, this.f26628x);
                } else {
                    i10 = a4Var.f22721j;
                }
                int alpha = paint2.getAlpha();
                paint2.setColor(i10);
                paint2.setAlpha(alpha);
                bp bpVar3 = this.C;
                nf.a aVar = (nf.a) bpVar3.f27261a.f22752f.get(bpVar3.f27263c);
                if (aVar != null) {
                    org.telegram.ui.ActionBar.a4 a4Var2 = (org.telegram.ui.ActionBar.a4) aVar;
                    if (a4Var2.a() != 0) {
                        bp bpVar4 = this.C;
                        int i18 = ((org.telegram.ui.ActionBar.a4) bpVar4.f27261a.f22752f.get(bpVar4.f27263c)).d;
                        ArrayList<Integer> arrayList = a4Var2.b(i18).message_colors;
                        if (arrayList.size() > 1) {
                            int[] iArr = new int[arrayList.size()];
                            for (int i19 = 0; i19 != arrayList.size(); i19++) {
                                iArr[i19] = arrayList.get(i19).intValue() | (-16777216);
                            }
                            float dp = this.f26621c + AndroidUtilities.dp(8.0f);
                            paint3.setShader(new LinearGradient(0.0f, dp, 0.0f, dp + this.d, iArr, (float[]) null, Shader.TileMode.CLAMP));
                        } else {
                            paint3.setShader(null);
                        }
                        paint3.setAlpha(255);
                        if (this.C != null) {
                            if (i18 >= 0) {
                                TLRPC.WallPaperSettings wallPaperSettings = a4Var2.b(i18).wallpaper.settings;
                                int i20 = wallPaperSettings.background_color;
                                int i21 = wallPaperSettings.second_background_color;
                                int i22 = wallPaperSettings.third_background_color;
                                i14 = wallPaperSettings.fourth_background_color;
                                i11 = i20;
                                i12 = i21;
                                i13 = i22;
                            } else {
                                i11 = 0;
                                i12 = 0;
                                i13 = 0;
                                i14 = 0;
                            }
                            if (i12 != 0) {
                                jb0Var = new jb0(true, i11, i12, i13, i14);
                                this.H = jb0Var.f();
                            } else {
                                jb0 jb0Var3 = new jb0(true, i11, i11, i11, i11);
                                this.H = -16777216;
                                jb0Var = jb0Var3;
                            }
                            this.C.f27262b = jb0Var;
                        }
                        j12 = 0;
                        z01Var.d = this.C.f27262b;
                        invalidate();
                    }
                }
                bp bpVar5 = this.C;
                org.telegram.ui.ActionBar.a4 a4Var3 = (org.telegram.ui.ActionBar.a4) bpVar5.f27261a.f22752f.get(bpVar5.f27263c);
                if (this.C != null) {
                    int i23 = a4Var3.f22722k;
                    int i24 = a4Var3.f22723l;
                    int i25 = a4Var3.f22724m;
                    int i26 = a4Var3.f22725n;
                    int i27 = a4Var3.f22726o;
                    j12 = 0;
                    if (a4Var3.f22714a.k(false) != null) {
                        if (i24 != 0) {
                            jb0 jb0Var4 = new jb0(i23, i24, i25, i26, true, i27, false);
                            this.H = jb0Var4.f();
                            bitmapDrawable = jb0Var4;
                        } else {
                            Drawable jb0Var5 = new jb0(i23, i23, i23, i23, true, i27, false);
                            this.H = -16777216;
                            bitmapDrawable = jb0Var5;
                        }
                    } else if (i23 != 0 && i24 != 0) {
                        bitmapDrawable = new jb0(i23, i24, i25, i26, true, i27, false);
                    } else if (i23 != 0) {
                        bitmapDrawable = new ColorDrawable(i23);
                    } else {
                        org.telegram.ui.ActionBar.e6 e6Var = a4Var3.f22714a;
                        if (e6Var != null && (e6Var.L > 0 || e6Var.f22910c != null)) {
                            org.telegram.ui.ActionBar.e6 e6Var2 = a4Var3.f22714a;
                            Bitmap scaledBitmap = AndroidUtilities.getScaledBitmap(AndroidUtilities.dp(112.0f), AndroidUtilities.dp(134.0f), e6Var2.f22910c, e6Var2.f22908b, e6Var2.L);
                            if (scaledBitmap != null) {
                                BitmapDrawable bitmapDrawable2 = new BitmapDrawable(scaledBitmap);
                                bitmapDrawable2.setFilterBitmap(true);
                                bitmapDrawable = bitmapDrawable2;
                            }
                            bitmapDrawable = null;
                        } else {
                            org.telegram.ui.ActionBar.b4 b4Var3 = this.C.f27261a;
                            if (b4Var3 == null || !b4Var3.m()) {
                                bitmapDrawable = new jb0(true, -2368069, -9722489, -2762611, -7817084);
                            }
                            bitmapDrawable = null;
                        }
                    }
                    this.C.f27262b = bitmapDrawable;
                    z01Var.d = this.C.f27262b;
                    invalidate();
                }
                j12 = 0;
                z01Var.d = this.C.f27262b;
                invalidate();
            }
            long i28 = bpVar.f27261a.i(this.R);
            if (i28 != j12) {
                TLRPC.WallPaper k10 = bpVar.f27261a.k(this.R);
                if (k10 != null) {
                    bpVar.f27261a.p(this.R, new mh.q1(this, i28, bpVar, k10.settings.intensity));
                }
            } else {
                SparseArray sparseArray = bpVar.f27261a.j(this.R).W;
                if (sparseArray != null) {
                    d6Var = (org.telegram.ui.ActionBar.d6) sparseArray.get(((org.telegram.ui.ActionBar.a4) bpVar.f27261a.f22752f.get(this.R)).f22717e);
                } else {
                    d6Var = null;
                }
                if (d6Var != null && (tL_theme = d6Var.f22881r) != null && tL_theme.settings.size() > 0) {
                    TLRPC.WallPaper wallPaper2 = d6Var.f22881r.settings.get(0).wallpaper;
                    if (wallPaper2 != null && (document = wallPaper2.document) != null) {
                        ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 120), document);
                        ImageReceiver imageReceiver = new ImageReceiver();
                        imageReceiver.setAllowLoadingOnAttachedOnly(false);
                        imageReceiver.setImage(forDocument, "120_140", null, null, null, 1);
                        imageReceiver.setDelegate(new hq0(this, bpVar, wallPaper2, 1));
                        ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver);
                    }
                } else if (d6Var != null && d6Var.f22881r == null) {
                    int i29 = (int) (d6Var.f22879p * 100.0f);
                    Drawable drawable2 = bpVar.f27262b;
                    if (drawable2 instanceof jb0) {
                        jb0 jb0Var6 = (jb0) drawable2;
                        jb0Var6.t(jb0Var6.f29708u, i29);
                    }
                    ChatThemeController.chatThemeQueue.postRunnable(new org.telegram.ui.rl(this, bpVar, i29, 24));
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
        org.telegram.ui.ActionBar.b4 b4Var4 = this.C.f27261a;
        if (b4Var4 != null && !b4Var4.m()) {
            nf.b bVar = this.C.f27261a.f22750c;
            if (bVar != null && (str = bVar.f18593b) == null) {
                str = bVar.f18592a;
            }
            setContentDescription(str);
            return;
        }
        setContentDescription(LocaleController.getString(R.string.ChatNoTheme));
    }

    public final void g(boolean z10, boolean z11) {
        float f10 = 0.0f;
        if (!z11) {
            ValueAnimator valueAnimator = this.f26629y;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.S = z10;
            if (z10) {
                f10 = 1.0f;
            }
            this.I = f10;
            invalidate();
            return;
        }
        if (this.S != z10) {
            float f11 = this.I;
            ValueAnimator valueAnimator2 = this.f26629y;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            if (z10) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f26629y = ofFloat;
            ofFloat.addUpdateListener(new q60(this, 27));
            this.f26629y.addListener(new u9(20, this, z10));
            this.f26629y.setDuration(250L);
            this.f26629y.start();
        }
        this.S = z10;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        this.K = true;
        org.telegram.ui.tn tnVar = this.J;
        if (tnVar != null) {
            tnVar.f(this);
        }
        this.L.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        this.K = false;
        org.telegram.ui.tn tnVar = this.J;
        if (tnVar != null) {
            tnVar.g(this);
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
    public final void onMeasure(int i9, int i10) {
        float f10;
        int i11 = this.G;
        if (i11 != 1 && i11 != 4) {
            if (i11 == 0) {
                f10 = 77.0f;
            } else {
                f10 = 83.0f;
            }
            int dp = AndroidUtilities.dp(f10);
            int size = View.MeasureSpec.getSize(i10);
            if (size == 0) {
                size = (int) (dp * 1.35f);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(dp, 1073741824), View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        } else {
            int size2 = View.MeasureSpec.getSize(i9);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size2, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 1.2f), 1073741824));
        }
        o9 o9Var = this.D;
        o9Var.setPivotY(o9Var.getMeasuredHeight());
        o9Var.setPivotX(o9Var.getMeasuredWidth() / 2.0f);
    }

    @Override
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        if (i9 == i11 && i10 == i12) {
            return;
        }
        float f10 = this.f26621c;
        RectF rectF = this.v;
        rectF.set(f10, f10, i9 - f10, i10 - f10);
        Path path = this.f26627w;
        path.reset();
        float f11 = this.f26620b;
        path.addRoundRect(rectF, f11, f11, Path.Direction.CW);
    }

    @Override
    public void setBackgroundColor(int i9) {
        int i10 = org.telegram.ui.ActionBar.f6.f23091i5;
        org.telegram.ui.ActionBar.b6 b6Var = this.f26628x;
        this.f26626s.setColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        TextPaint textPaint = this.A;
        if (textPaint != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.We, b6Var));
        }
        invalidate();
    }

    public void setFallbackWallpaper(TLRPC.WallPaper wallPaper) {
        if (this.P != wallPaper) {
            this.P = wallPaper;
            bp bpVar = this.C;
            if (bpVar != null) {
                this.C = null;
                f(bpVar, 0L, false);
            }
        }
    }
}
