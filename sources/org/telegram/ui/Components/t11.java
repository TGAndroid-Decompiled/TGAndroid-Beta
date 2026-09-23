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
    public mp G;
    public final w9 H;
    public final int I;
    public jq0 J;
    public final int K;
    public int L;
    public float M;
    public org.telegram.ui.ao N;
    public boolean O;
    public final ImageReceiver P;
    public h9 Q;
    public final org.telegram.ui.ActionBar.e5 R;
    public final org.telegram.ui.ActionBar.e5 S;
    public TLRPC.WallPaper T;
    public long U;
    public int V;
    public boolean W;
    public final float f28059a;
    public final float f28060b;
    public final float f28061c;
    public final float d;
    public final float e;
    public s11 f28062f;
    public s11 h;
    public float f28063n;
    public final Paint f28064r;
    public final Paint f28065s;
    public final RectF v;
    public final Path f28066w;
    public final org.telegram.ui.ActionBar.d6 f28067x;
    public ValueAnimator f28068y;

    public t11(int i10, int i11, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f28059a = AndroidUtilities.dp(8.0f);
        this.f28060b = AndroidUtilities.dp(6.0f);
        this.f28061c = AndroidUtilities.dp(4.0f);
        this.d = AndroidUtilities.dp(21.0f);
        this.e = AndroidUtilities.dp(41.0f);
        this.f28062f = new s11(this);
        this.f28063n = 1.0f;
        Paint paint = new Paint(1);
        this.f28064r = paint;
        this.f28065s = new Paint(1);
        this.v = new RectF();
        this.f28066w = new Path();
        this.R = new org.telegram.ui.ActionBar.e5(0, true, false, null);
        this.S = new org.telegram.ui.ActionBar.e5(0, false, false, null);
        this.K = i11;
        this.I = i10;
        this.f28067x = d6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.P = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(8.0f));
        setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18877i5, d6Var));
        w9 w9Var = new w9(context);
        this.H = w9Var;
        w9Var.getImageReceiver().setCrossfadeWithOldImage(true);
        w9Var.getImageReceiver().setAllowStartLottieAnimation(false);
        w9Var.getImageReceiver().setAutoRepeat(0);
        if (i11 != 0 && i11 != 3 && i11 != 2) {
            addView(w9Var, w7.x5.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 12.0f));
        } else {
            addView(w9Var, w7.x5.d(28, 28.0f, 81, 0.0f, 0.0f, 0.0f, 12.0f));
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
        textPaint.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.We, this.f28067x));
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
        StaticLayout d = jw0.d(b10, textPaint2, i11, true, i11, 3);
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
            if (!this.H.getImageReceiver().getLottieAnimation().f30271k0) {
                this.H.getImageReceiver().getLottieAnimation().N(0, true, false);
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
            canvas.clipPath(this.f28066w);
            this.N.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.N.draw(canvas);
            canvas.restore();
        }
        if (this.f28063n != 1.0f && (s11Var2 = this.h) != null) {
            s11Var2.b(canvas, 1.0f);
        }
        float f7 = this.f28063n;
        if (f7 != 0.0f) {
            this.f28062f.b(canvas, f7);
        }
        if (this.f28063n != 1.0f && (s11Var = this.h) != null) {
            s11Var.a(canvas, 1.0f);
        }
        float f10 = this.f28063n;
        if (f10 != 0.0f) {
            this.f28062f.a(canvas, f10);
        }
        float f11 = this.f28063n;
        if (f11 != 1.0f) {
            float f12 = f11 + 0.10666667f;
            this.f28063n = f12;
            if (f12 >= 1.0f) {
                this.f28063n = 1.0f;
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void f(mp mpVar, long j3, boolean z10) {
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
        bc0 bc0Var;
        Drawable drawable;
        org.telegram.ui.ao aoVar;
        org.telegram.ui.ao aoVar2;
        if (this.G != mpVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i16 = this.V;
        int i17 = mpVar.f26255c;
        if (i16 != i17) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.V = i17;
        this.G = mpVar;
        TLRPC.Document f7 = mpVar.f26253a.f();
        org.telegram.ui.ActionBar.c4 c4Var2 = mpVar.f26253a;
        if (c4Var2.d instanceof TLRPC.TL_chatThemeUniqueGift) {
            j10 = ChatThemeController.getInstance(c4Var2.f18537g).getGiftThemeUser(((TLRPC.TL_chatThemeUniqueGift) c4Var2.d).gift.slug);
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
                drawable = DocumentObject.getSvgThumb(f7, org.telegram.ui.ActionBar.h6.f18772c7, 0.2f);
            } else {
                drawable = null;
            }
            if (drawable == null) {
                Emoji.preloadEmoji(mpVar.f26253a.e);
                drawable = Emoji.getEmojiDrawable(mpVar.f26253a.e);
            }
            this.H.h(ImageLocation.getForDocument(f7), "50_50", drawable, null);
            mpVar.f26253a.getClass();
            TLRPC.WallPaper wallPaper = this.T;
            if (wallPaper != null) {
                if (this.O && (aoVar2 = this.N) != null) {
                    aoVar2.g(this);
                }
                org.telegram.ui.ao aoVar3 = new org.telegram.ui.ao(wallPaper, false, true);
                this.N = aoVar3;
                aoVar3.f31838b = this;
                bc0 bc0Var2 = aoVar3.f31840f;
                if (bc0Var2 != null) {
                    bc0Var2.r(this);
                }
                if (this.O) {
                    this.N.f(this);
                }
            } else {
                if (this.O && (aoVar = this.N) != null) {
                    aoVar.g(this);
                }
                this.N = null;
            }
        }
        w9 w9Var = this.H;
        if (mpVar.f26253a.m() && this.T != null) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        w9Var.setVisibility(i10);
        if (z11 || z12) {
            if (z10) {
                this.f28063n = 0.0f;
                this.h = this.f28062f;
                this.f28062f = new s11(this);
                invalidate();
            } else {
                this.f28063n = 1.0f;
            }
            s11 s11Var = this.f28062f;
            mp mpVar2 = this.G;
            if (mpVar2 == null || (c4Var = mpVar2.f26253a) == null) {
                j11 = 0;
            } else {
                org.telegram.ui.ActionBar.b4 b4Var = (org.telegram.ui.ActionBar.b4) c4Var.f18536f.get(mpVar2.f26255c);
                int i18 = b4Var.h;
                if (this.U != 0) {
                    i18 = b4Var.f18493k;
                }
                Paint paint = s11Var.f27784c;
                Paint paint2 = s11Var.f27782a;
                Paint paint3 = s11Var.f27783b;
                paint.setColor(i18);
                paint3.setColor(b4Var.f18491i);
                if (this.G.f26253a.m()) {
                    i11 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Oh, this.f28067x);
                } else {
                    i11 = b4Var.f18492j;
                }
                int alpha = paint2.getAlpha();
                paint2.setColor(i11);
                paint2.setAlpha(alpha);
                mp mpVar3 = this.G;
                fg.a aVar = (fg.a) mpVar3.f26253a.f18536f.get(mpVar3.f26255c);
                if (aVar != null) {
                    org.telegram.ui.ActionBar.b4 b4Var2 = (org.telegram.ui.ActionBar.b4) aVar;
                    if (b4Var2.a() != 0) {
                        mp mpVar4 = this.G;
                        int i19 = ((org.telegram.ui.ActionBar.b4) mpVar4.f26253a.f18536f.get(mpVar4.f26255c)).d;
                        ArrayList<Integer> arrayList = b4Var2.b(i19).message_colors;
                        if (arrayList.size() > 1) {
                            int[] iArr = new int[arrayList.size()];
                            for (int i20 = 0; i20 != arrayList.size(); i20++) {
                                iArr[i20] = arrayList.get(i20).intValue() | (-16777216);
                            }
                            float dp = this.f28061c + AndroidUtilities.dp(8.0f);
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
                                bc0Var = new bc0(true, i12, i13, i14, i15);
                                this.L = bc0Var.f();
                            } else {
                                bc0 bc0Var3 = new bc0(true, i12, i12, i12, i12);
                                this.L = -16777216;
                                bc0Var = bc0Var3;
                            }
                            this.G.f26254b = bc0Var;
                        }
                        j11 = 0;
                        s11Var.d = this.G.f26254b;
                        invalidate();
                    }
                }
                mp mpVar5 = this.G;
                org.telegram.ui.ActionBar.b4 b4Var3 = (org.telegram.ui.ActionBar.b4) mpVar5.f26253a.f18536f.get(mpVar5.f26255c);
                if (this.G != null) {
                    int i24 = b4Var3.f18493k;
                    int i25 = b4Var3.f18494l;
                    int i26 = b4Var3.f18495m;
                    int i27 = b4Var3.f18496n;
                    int i28 = b4Var3.f18497o;
                    j11 = 0;
                    if (b4Var3.f18486a.k(false) != null) {
                        if (i25 != 0) {
                            bc0 bc0Var4 = new bc0(i24, i25, i26, i27, true, i28, false);
                            this.L = bc0Var4.f();
                            bitmapDrawable = bc0Var4;
                        } else {
                            Drawable bc0Var5 = new bc0(i24, i24, i24, i24, true, i28, false);
                            this.L = -16777216;
                            bitmapDrawable = bc0Var5;
                        }
                    } else if (i24 != 0 && i25 != 0) {
                        bitmapDrawable = new bc0(i24, i25, i26, i27, true, i28, false);
                    } else if (i24 != 0) {
                        bitmapDrawable = new ColorDrawable(i24);
                    } else {
                        org.telegram.ui.ActionBar.g6 g6Var = b4Var3.f18486a;
                        if (g6Var != null && (g6Var.P > 0 || g6Var.f18686c != null)) {
                            org.telegram.ui.ActionBar.g6 g6Var2 = b4Var3.f18486a;
                            Bitmap scaledBitmap = AndroidUtilities.getScaledBitmap(AndroidUtilities.dp(112.0f), AndroidUtilities.dp(134.0f), g6Var2.f18686c, g6Var2.f18684b, g6Var2.P);
                            if (scaledBitmap != null) {
                                BitmapDrawable bitmapDrawable2 = new BitmapDrawable(scaledBitmap);
                                bitmapDrawable2.setFilterBitmap(true);
                                bitmapDrawable = bitmapDrawable2;
                            }
                            bitmapDrawable = null;
                        } else {
                            org.telegram.ui.ActionBar.c4 c4Var3 = this.G.f26253a;
                            if (c4Var3 == null || !c4Var3.m()) {
                                bitmapDrawable = new bc0(true, -2368069, -9722489, -2762611, -7817084);
                            }
                            bitmapDrawable = null;
                        }
                    }
                    this.G.f26254b = bitmapDrawable;
                    s11Var.d = this.G.f26254b;
                    invalidate();
                }
                j11 = 0;
                s11Var.d = this.G.f26254b;
                invalidate();
            }
            long i29 = mpVar.f26253a.i(this.V);
            if (i29 != j11) {
                TLRPC.WallPaper k10 = mpVar.f26253a.k(this.V);
                if (k10 != null) {
                    mpVar.f26253a.p(this.V, new ei.u1(this, i29, mpVar, k10.settings.intensity));
                }
            } else {
                SparseArray sparseArray = mpVar.f26253a.j(this.V).f18683a0;
                if (sparseArray != null) {
                    f6Var = (org.telegram.ui.ActionBar.f6) sparseArray.get(((org.telegram.ui.ActionBar.b4) mpVar.f26253a.f18536f.get(this.V)).e);
                } else {
                    f6Var = null;
                }
                if (f6Var != null && (tL_theme = f6Var.f18650r) != null && tL_theme.settings.size() > 0) {
                    TLRPC.WallPaper wallPaper2 = f6Var.f18650r.settings.get(0).wallpaper;
                    if (wallPaper2 != null && (document = wallPaper2.document) != null) {
                        ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 120), document);
                        ImageReceiver imageReceiver = new ImageReceiver();
                        imageReceiver.setAllowLoadingOnAttachedOnly(false);
                        imageReceiver.setImage(forDocument, "120_140", null, null, null, 1);
                        imageReceiver.setDelegate(new t50(this, mpVar, wallPaper2, 2));
                        ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver);
                    }
                } else if (f6Var != null && f6Var.f18650r == null) {
                    int i30 = (int) (f6Var.f18648p * 100.0f);
                    Drawable drawable2 = mpVar.f26254b;
                    if (drawable2 instanceof bc0) {
                        bc0 bc0Var6 = (bc0) drawable2;
                        bc0Var6.t(bc0Var6.f22696u, i30);
                    }
                    ChatThemeController.chatThemeQueue.postRunnable(new xm(this, mpVar, i30, 23));
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
        org.telegram.ui.ActionBar.c4 c4Var4 = this.G.f26253a;
        if (c4Var4 != null && !c4Var4.m()) {
            fg.b bVar = this.G.f26253a.f18535c;
            if (bVar != null && (str = bVar.f9050b) == null) {
                str = bVar.f9049a;
            }
            setContentDescription(str);
            return;
        }
        setContentDescription(LocaleController.getString(R.string.ChatNoTheme));
    }

    public final void g(boolean z10, boolean z11) {
        float f7 = 0.0f;
        if (!z11) {
            ValueAnimator valueAnimator = this.f28068y;
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
            ValueAnimator valueAnimator2 = this.f28068y;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            if (z10) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f28068y = ofFloat;
            ofFloat.addUpdateListener(new i70(this, 27));
            this.f28068y.addListener(new ca(20, this, z10));
            this.f28068y.setDuration(250L);
            this.f28068y.start();
        }
        this.W = z10;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        this.O = true;
        org.telegram.ui.ao aoVar = this.N;
        if (aoVar != null) {
            aoVar.f(this);
        }
        this.P.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        this.O = false;
        org.telegram.ui.ao aoVar = this.N;
        if (aoVar != null) {
            aoVar.g(this);
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
        float f7 = this.f28061c;
        RectF rectF = this.v;
        rectF.set(f7, f7, i10 - f7, i11 - f7);
        Path path = this.f28066w;
        path.reset();
        float f10 = this.f28060b;
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
    }

    @Override
    public void setBackgroundColor(int i10) {
        int i11 = org.telegram.ui.ActionBar.h6.f18877i5;
        org.telegram.ui.ActionBar.d6 d6Var = this.f28067x;
        this.f28065s.setColor(org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
        TextPaint textPaint = this.E;
        if (textPaint != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.We, d6Var));
        }
        invalidate();
    }

    public void setFallbackWallpaper(TLRPC.WallPaper wallPaper) {
        if (this.T != wallPaper) {
            this.T = wallPaper;
            mp mpVar = this.G;
            if (mpVar != null) {
                this.G = null;
                f(mpVar, 0L, false);
            }
        }
    }
}
