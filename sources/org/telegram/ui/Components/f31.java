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
public class f31 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public TextPaint E;
    public StaticLayout F;
    public dq G;
    public final y9 H;
    public final int I;
    public ur0 J;
    public final int K;
    public int L;
    public float M;
    public org.telegram.ui.ho N;
    public boolean O;
    public final ImageReceiver P;
    public j9 Q;
    public final org.telegram.ui.ActionBar.d5 R;
    public final org.telegram.ui.ActionBar.d5 S;
    public TLRPC.WallPaper T;
    public long U;
    public int V;
    public boolean W;
    public final float f25872a;
    public final float f25873b;
    public final float f25874c;
    public final float d;
    public final float f25875e;
    public e31 f25876f;
    public e31 h;
    public float f25877n;
    public final Paint f25878r;
    public final Paint f25879s;
    public final RectF v;
    public final Path f25880w;
    public final org.telegram.ui.ActionBar.c6 f25881x;
    public ValueAnimator f25882y;

    public f31(int i10, int i11, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f25872a = AndroidUtilities.dp(8.0f);
        this.f25873b = AndroidUtilities.dp(6.0f);
        this.f25874c = AndroidUtilities.dp(4.0f);
        this.d = AndroidUtilities.dp(21.0f);
        this.f25875e = AndroidUtilities.dp(41.0f);
        this.f25876f = new e31(this);
        this.f25877n = 1.0f;
        Paint paint = new Paint(1);
        this.f25878r = paint;
        this.f25879s = new Paint(1);
        this.v = new RectF();
        this.f25880w = new Path();
        this.R = new org.telegram.ui.ActionBar.d5(0, true, false, null);
        this.S = new org.telegram.ui.ActionBar.d5(0, false, false, null);
        this.K = i11;
        this.I = i10;
        this.f25881x = c6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.P = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(8.0f));
        setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20649i5, c6Var));
        y9 y9Var = new y9(context);
        this.H = y9Var;
        y9Var.getImageReceiver().setCrossfadeWithOldImage(true);
        y9Var.getImageReceiver().setAllowStartLottieAnimation(false);
        y9Var.getImageReceiver().setAutoRepeat(0);
        if (i11 != 0 && i11 != 3 && i11 != 2) {
            addView(y9Var, w7.w5.a(36.0f, 0.0f, 0.0f, 0.0f, 12.0f, 36, 81));
        } else {
            addView(y9Var, w7.w5.a(28.0f, 0.0f, 0.0f, 0.0f, 12.0f, 28, 81));
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
        textPaint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.We, this.f25881x));
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
        StaticLayout d = sx0.d(b10, textPaint2, true, dp, 3);
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
            if (!this.H.getImageReceiver().getLottieAnimation().f26115k0) {
                this.H.getImageReceiver().getLottieAnimation().N(0, true, false);
                this.H.getImageReceiver().getLottieAnimation().start();
            }
            this.H.animate().scaleX(2.0f).scaleY(2.0f).setDuration(300L).setInterpolator(AndroidUtilities.overshootInterpolator).start();
            ur0 ur0Var = new ur0(this, 17);
            this.J = ur0Var;
            AndroidUtilities.runOnUIThread(ur0Var, 2500L);
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
        e31 e31Var;
        e31 e31Var2;
        if (this.G == null) {
            super.dispatchDraw(canvas);
            return;
        }
        if (this.N != null) {
            canvas.save();
            canvas.clipPath(this.f25880w);
            this.N.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.N.draw(canvas);
            canvas.restore();
        }
        if (this.f25877n != 1.0f && (e31Var2 = this.h) != null) {
            e31Var2.b(canvas, 1.0f);
        }
        float f7 = this.f25877n;
        if (f7 != 0.0f) {
            this.f25876f.b(canvas, f7);
        }
        if (this.f25877n != 1.0f && (e31Var = this.h) != null) {
            e31Var.a(canvas, 1.0f);
        }
        float f10 = this.f25877n;
        if (f10 != 0.0f) {
            this.f25876f.a(canvas, f10);
        }
        float f11 = this.f25877n;
        if (f11 != 1.0f) {
            float f12 = f11 + 0.10666667f;
            this.f25877n = f12;
            if (f12 >= 1.0f) {
                this.f25877n = 1.0f;
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void f(dq dqVar, long j3, boolean z10) {
        boolean z11;
        boolean z12;
        long j10;
        int i10;
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
        gd0 gd0Var;
        String str;
        Drawable drawable;
        org.telegram.ui.ho hoVar;
        org.telegram.ui.ho hoVar2;
        if (this.G != dqVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i16 = this.V;
        int i17 = dqVar.f25448c;
        if (i16 != i17) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.V = i17;
        this.G = dqVar;
        TLRPC.Document f7 = dqVar.f25446a.f();
        org.telegram.ui.ActionBar.b4 b4Var2 = dqVar.f25446a;
        if (b4Var2.d instanceof TLRPC.TL_chatThemeUniqueGift) {
            j10 = ChatThemeController.getInstance(b4Var2.f20244g).getGiftThemeUser(((TLRPC.TL_chatThemeUniqueGift) b4Var2.d).gift.slug);
        } else {
            j10 = 0;
        }
        this.U = j10;
        if (j3 == j10) {
            this.U = 0L;
        }
        if (this.U != 0) {
            if (this.Q == null) {
                this.Q = new j9((org.telegram.ui.ActionBar.c6) null);
            }
            TLObject userOrChat = MessagesController.getInstance(this.I).getUserOrChat(this.U);
            this.Q.j(this.I, userOrChat);
            this.P.setForUserOrChat(userOrChat, this.Q);
        } else {
            this.P.clearImage();
        }
        if (z11) {
            ur0 ur0Var = this.J;
            if (ur0Var != null) {
                AndroidUtilities.cancelRunOnUIThread(ur0Var);
                this.J = null;
            }
            this.H.animate().cancel();
            this.H.setScaleX(1.0f);
            this.H.setScaleY(1.0f);
        }
        if (z11) {
            if (f7 != null) {
                drawable = DocumentObject.getSvgThumb(f7, org.telegram.ui.ActionBar.h6.f20543c7, 0.2f);
            } else {
                drawable = null;
            }
            if (drawable == null) {
                Emoji.preloadEmoji(dqVar.f25446a.f20242e);
                drawable = Emoji.getEmojiDrawable(dqVar.f25446a.f20242e);
            }
            this.H.h(ImageLocation.getForDocument(f7), "50_50", drawable, null);
            dqVar.f25446a.getClass();
            TLRPC.WallPaper wallPaper = this.T;
            if (wallPaper != null) {
                if (this.O && (hoVar2 = this.N) != null) {
                    hoVar2.g(this);
                }
                org.telegram.ui.ho hoVar3 = new org.telegram.ui.ho(wallPaper, false, true);
                this.N = hoVar3;
                hoVar3.f38474b = this;
                gd0 gd0Var2 = hoVar3.f38477f;
                if (gd0Var2 != null) {
                    gd0Var2.r(this);
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
        y9 y9Var = this.H;
        if (dqVar.f25446a.m() && this.T != null) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        y9Var.setVisibility(i10);
        if (z11 || z12) {
            if (z10) {
                this.f25877n = 0.0f;
                this.h = this.f25876f;
                this.f25876f = new e31(this);
                invalidate();
            } else {
                this.f25877n = 1.0f;
            }
            e31 e31Var = this.f25876f;
            dq dqVar2 = this.G;
            if (dqVar2 != null && (b4Var = dqVar2.f25446a) != null) {
                org.telegram.ui.ActionBar.a4 a4Var = (org.telegram.ui.ActionBar.a4) b4Var.f20243f.get(dqVar2.f25448c);
                int i18 = a4Var.h;
                if (this.U != 0) {
                    i18 = a4Var.f20198k;
                }
                Paint paint = e31Var.f25580c;
                Paint paint2 = e31Var.f25578a;
                Paint paint3 = e31Var.f25579b;
                paint.setColor(i18);
                paint3.setColor(a4Var.f20196i);
                if (this.G.f25446a.m()) {
                    i11 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, this.f25881x);
                } else {
                    i11 = a4Var.f20197j;
                }
                int alpha = paint2.getAlpha();
                paint2.setColor(i11);
                paint2.setAlpha(alpha);
                dq dqVar3 = this.G;
                fg.a aVar = (fg.a) dqVar3.f25446a.f20243f.get(dqVar3.f25448c);
                if (aVar != null) {
                    org.telegram.ui.ActionBar.a4 a4Var2 = (org.telegram.ui.ActionBar.a4) aVar;
                    if (a4Var2.a() != 0) {
                        dq dqVar4 = this.G;
                        int i19 = ((org.telegram.ui.ActionBar.a4) dqVar4.f25446a.f20243f.get(dqVar4.f25448c)).d;
                        ArrayList<Integer> arrayList = a4Var2.b(i19).message_colors;
                        if (arrayList.size() > 1) {
                            int[] iArr = new int[arrayList.size()];
                            for (int i20 = 0; i20 != arrayList.size(); i20++) {
                                iArr[i20] = arrayList.get(i20).intValue() | (-16777216);
                            }
                            float dp = this.f25874c + AndroidUtilities.dp(8.0f);
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
                                gd0Var = new gd0(true, i12, i13, i14, i15);
                                this.L = gd0Var.f();
                            } else {
                                gd0 gd0Var3 = new gd0(true, i12, i12, i12, i12);
                                this.L = -16777216;
                                gd0Var = gd0Var3;
                            }
                            this.G.f25447b = gd0Var;
                        }
                        e31Var.d = this.G.f25447b;
                        invalidate();
                    }
                }
                dq dqVar5 = this.G;
                org.telegram.ui.ActionBar.a4 a4Var3 = (org.telegram.ui.ActionBar.a4) dqVar5.f25446a.f20243f.get(dqVar5.f25448c);
                if (this.G != null) {
                    int i24 = a4Var3.f20198k;
                    int i25 = a4Var3.f20199l;
                    int i26 = a4Var3.f20200m;
                    int i27 = a4Var3.f20201n;
                    int i28 = a4Var3.f20202o;
                    if (a4Var3.f20190a.k(false) != null) {
                        if (i25 != 0) {
                            gd0 gd0Var4 = new gd0(i24, i25, i26, i27, true, i28, false);
                            this.L = gd0Var4.f();
                            bitmapDrawable = gd0Var4;
                        } else {
                            Drawable gd0Var5 = new gd0(i24, i24, i24, i24, true, i28, false);
                            this.L = -16777216;
                            bitmapDrawable = gd0Var5;
                        }
                    } else if (i24 != 0 && i25 != 0) {
                        bitmapDrawable = new gd0(i24, i25, i26, i27, true, i28, false);
                    } else if (i24 != 0) {
                        bitmapDrawable = new ColorDrawable(i24);
                    } else {
                        org.telegram.ui.ActionBar.g6 g6Var = a4Var3.f20190a;
                        if (g6Var != null && (g6Var.P > 0 || g6Var.f20432c != null)) {
                            org.telegram.ui.ActionBar.g6 g6Var2 = a4Var3.f20190a;
                            Bitmap scaledBitmap = AndroidUtilities.getScaledBitmap(AndroidUtilities.dp(112.0f), AndroidUtilities.dp(134.0f), g6Var2.f20432c, g6Var2.f20430b, g6Var2.P);
                            if (scaledBitmap != null) {
                                BitmapDrawable bitmapDrawable2 = new BitmapDrawable(scaledBitmap);
                                bitmapDrawable2.setFilterBitmap(true);
                                bitmapDrawable = bitmapDrawable2;
                            }
                            bitmapDrawable = null;
                        } else {
                            org.telegram.ui.ActionBar.b4 b4Var3 = this.G.f25446a;
                            if (b4Var3 == null || !b4Var3.m()) {
                                bitmapDrawable = new gd0(true, -2368069, -9722489, -2762611, -7817084);
                            }
                            bitmapDrawable = null;
                        }
                    }
                    this.G.f25447b = bitmapDrawable;
                }
                e31Var.d = this.G.f25447b;
                invalidate();
            }
            long i29 = dqVar.f25446a.i(this.V);
            if (i29 != 0) {
                TLRPC.WallPaper k10 = dqVar.f25446a.k(this.V);
                if (k10 != null) {
                    dqVar.f25446a.p(this.V, new ei.u1(this, i29, dqVar, k10.settings.intensity, 4));
                }
            } else {
                SparseArray sparseArray = dqVar.f25446a.j(this.V).f20429a0;
                if (sparseArray != null) {
                    e6Var = (org.telegram.ui.ActionBar.e6) sparseArray.get(((org.telegram.ui.ActionBar.a4) dqVar.f25446a.f20243f.get(this.V)).f20193e);
                } else {
                    e6Var = null;
                }
                if (e6Var != null && (tL_theme = e6Var.f20364r) != null && tL_theme.settings.size() > 0) {
                    TLRPC.WallPaper wallPaper2 = e6Var.f20364r.settings.get(0).wallpaper;
                    if (wallPaper2 != null && (document = wallPaper2.document) != null) {
                        ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 120), document);
                        ImageReceiver imageReceiver = new ImageReceiver();
                        imageReceiver.setAllowLoadingOnAttachedOnly(false);
                        imageReceiver.setImage(forDocument, "120_140", null, null, null, 1);
                        imageReceiver.setDelegate(new uz(this, dqVar, wallPaper2, 3));
                        ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver);
                    }
                } else if (e6Var != null && e6Var.f20364r == null) {
                    int i30 = (int) (e6Var.f20362p * 100.0f);
                    Drawable drawable2 = dqVar.f25447b;
                    if (drawable2 instanceof gd0) {
                        gd0 gd0Var6 = (gd0) drawable2;
                        gd0Var6.t(gd0Var6.f26417u, i30);
                    }
                    ChatThemeController.chatThemeQueue.postRunnable(new bl(this, dqVar, i30, 24));
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
        org.telegram.ui.ActionBar.b4 b4Var4 = this.G.f25446a;
        if (b4Var4 != null && !b4Var4.m()) {
            fg.b bVar = this.G.f25446a.f20241c;
            if (bVar == null) {
                str = null;
            } else {
                str = bVar.f9924b;
                if (str == null) {
                    str = bVar.f9923a;
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
            ValueAnimator valueAnimator = this.f25882y;
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
            ValueAnimator valueAnimator2 = this.f25882y;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            if (z10) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f25882y = ofFloat;
            ofFloat.addUpdateListener(new m80(this, 28));
            this.f25882y.addListener(new ea(20, this, z10));
            this.f25882y.setDuration(250L);
            this.f25882y.start();
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
        float f7 = this.f25874c;
        RectF rectF = this.v;
        rectF.set(f7, f7, i10 - f7, i11 - f7);
        Path path = this.f25880w;
        path.reset();
        float f10 = this.f25873b;
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
    }

    @Override
    public void setBackgroundColor(int i10) {
        int i11 = org.telegram.ui.ActionBar.h6.f20649i5;
        org.telegram.ui.ActionBar.c6 c6Var = this.f25881x;
        this.f25879s.setColor(org.telegram.ui.ActionBar.h6.w0(i11, c6Var));
        TextPaint textPaint = this.E;
        if (textPaint != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.We, c6Var));
        }
        invalidate();
    }

    public void setFallbackWallpaper(TLRPC.WallPaper wallPaper) {
        if (this.T != wallPaper) {
            this.T = wallPaper;
            dq dqVar = this.G;
            if (dqVar != null) {
                this.G = null;
                f(dqVar, 0L, false);
            }
        }
    }
}
