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
public class a31 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public TextPaint E;
    public StaticLayout F;
    public bq G;
    public final y9 H;
    public final int I;
    public pr0 J;
    public final int K;
    public int L;
    public float M;
    public org.telegram.ui.co N;
    public boolean O;
    public final ImageReceiver P;
    public j9 Q;
    public final org.telegram.ui.ActionBar.f5 R;
    public final org.telegram.ui.ActionBar.f5 S;
    public TLRPC.WallPaper T;
    public long U;
    public int V;
    public boolean W;
    public final float f24454a;
    public final float f24455b;
    public final float f24456c;
    public final float d;
    public final float f24457e;
    public z21 f24458f;
    public z21 h;
    public float f24459n;
    public final Paint f24460r;
    public final Paint f24461s;
    public final RectF v;
    public final Path f24462w;
    public final org.telegram.ui.ActionBar.e6 f24463x;
    public ValueAnimator f24464y;

    public a31(int i10, int i11, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f24454a = AndroidUtilities.dp(8.0f);
        this.f24455b = AndroidUtilities.dp(6.0f);
        this.f24456c = AndroidUtilities.dp(4.0f);
        this.d = AndroidUtilities.dp(21.0f);
        this.f24457e = AndroidUtilities.dp(41.0f);
        this.f24458f = new z21(this);
        this.f24459n = 1.0f;
        Paint paint = new Paint(1);
        this.f24460r = paint;
        this.f24461s = new Paint(1);
        this.v = new RectF();
        this.f24462w = new Path();
        this.R = new org.telegram.ui.ActionBar.f5(0, true, false, null);
        this.S = new org.telegram.ui.ActionBar.f5(0, false, false, null);
        this.K = i11;
        this.I = i10;
        this.f24463x = e6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.P = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(8.0f));
        setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20891i5, e6Var));
        y9 y9Var = new y9(context);
        this.H = y9Var;
        y9Var.getImageReceiver().setCrossfadeWithOldImage(true);
        y9Var.getImageReceiver().setAllowStartLottieAnimation(false);
        y9Var.getImageReceiver().setAutoRepeat(0);
        if (i11 != 0 && i11 != 3 && i11 != 2) {
            addView(y9Var, w7.x5.a(36.0f, 0.0f, 0.0f, 0.0f, 12.0f, 36, 81));
        } else {
            addView(y9Var, w7.x5.a(28.0f, 0.0f, 0.0f, 0.0f, 12.0f, 28, 81));
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
        textPaint.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.We, this.f24463x));
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
        StaticLayout d = nx0.d(b10, textPaint2, true, dp, 3);
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
            if (!this.H.getImageReceiver().getLottieAnimation().f25740k0) {
                this.H.getImageReceiver().getLottieAnimation().N(0, true, false);
                this.H.getImageReceiver().getLottieAnimation().start();
            }
            this.H.animate().scaleX(2.0f).scaleY(2.0f).setDuration(300L).setInterpolator(AndroidUtilities.overshootInterpolator).start();
            pr0 pr0Var = new pr0(this, 16);
            this.J = pr0Var;
            AndroidUtilities.runOnUIThread(pr0Var, 2500L);
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
        z21 z21Var;
        z21 z21Var2;
        if (this.G == null) {
            super.dispatchDraw(canvas);
            return;
        }
        if (this.N != null) {
            canvas.save();
            canvas.clipPath(this.f24462w);
            this.N.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.N.draw(canvas);
            canvas.restore();
        }
        if (this.f24459n != 1.0f && (z21Var2 = this.h) != null) {
            z21Var2.b(canvas, 1.0f);
        }
        float f7 = this.f24459n;
        if (f7 != 0.0f) {
            this.f24458f.b(canvas, f7);
        }
        if (this.f24459n != 1.0f && (z21Var = this.h) != null) {
            z21Var.a(canvas, 1.0f);
        }
        float f10 = this.f24459n;
        if (f10 != 0.0f) {
            this.f24458f.a(canvas, f10);
        }
        float f11 = this.f24459n;
        if (f11 != 1.0f) {
            float f12 = f11 + 0.10666667f;
            this.f24459n = f12;
            if (f12 >= 1.0f) {
                this.f24459n = 1.0f;
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void f(bq bqVar, long j3, boolean z10) {
        boolean z11;
        boolean z12;
        long j10;
        int i10;
        org.telegram.ui.ActionBar.g6 g6Var;
        TLRPC.TL_theme tL_theme;
        TLRPC.Document document;
        org.telegram.ui.ActionBar.c4 c4Var;
        int i11;
        BitmapDrawable dd0Var;
        int i12;
        int i13;
        int i14;
        int i15;
        dd0 dd0Var2;
        String str;
        Drawable drawable;
        org.telegram.ui.co coVar;
        org.telegram.ui.co coVar2;
        if (this.G != bqVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i16 = this.V;
        int i17 = bqVar.f25021c;
        if (i16 != i17) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.V = i17;
        this.G = bqVar;
        TLRPC.Document f7 = bqVar.f25019a.f();
        org.telegram.ui.ActionBar.c4 c4Var2 = bqVar.f25019a;
        if (c4Var2.d instanceof TLRPC.TL_chatThemeUniqueGift) {
            j10 = ChatThemeController.getInstance(c4Var2.f20514g).getGiftThemeUser(((TLRPC.TL_chatThemeUniqueGift) c4Var2.d).gift.slug);
        } else {
            j10 = 0;
        }
        this.U = j10;
        if (j3 == j10) {
            this.U = 0L;
        }
        if (this.U != 0) {
            if (this.Q == null) {
                this.Q = new j9((org.telegram.ui.ActionBar.e6) null);
            }
            TLObject userOrChat = MessagesController.getInstance(this.I).getUserOrChat(this.U);
            this.Q.j(this.I, userOrChat);
            this.P.setForUserOrChat(userOrChat, this.Q);
        } else {
            this.P.clearImage();
        }
        if (z11) {
            pr0 pr0Var = this.J;
            if (pr0Var != null) {
                AndroidUtilities.cancelRunOnUIThread(pr0Var);
                this.J = null;
            }
            this.H.animate().cancel();
            this.H.setScaleX(1.0f);
            this.H.setScaleY(1.0f);
        }
        if (z11) {
            if (f7 != null) {
                drawable = DocumentObject.getSvgThumb(f7, org.telegram.ui.ActionBar.i6.f20785c7, 0.2f);
            } else {
                drawable = null;
            }
            if (drawable == null) {
                Emoji.preloadEmoji(bqVar.f25019a.f20512e);
                drawable = Emoji.getEmojiDrawable(bqVar.f25019a.f20512e);
            }
            this.H.h(ImageLocation.getForDocument(f7), "50_50", drawable, null);
            bqVar.f25019a.getClass();
            TLRPC.WallPaper wallPaper = this.T;
            if (wallPaper != null) {
                if (this.O && (coVar2 = this.N) != null) {
                    coVar2.g(this);
                }
                org.telegram.ui.co coVar3 = new org.telegram.ui.co(wallPaper, false, true);
                this.N = coVar3;
                coVar3.f36755b = this;
                dd0 dd0Var3 = coVar3.f36758f;
                if (dd0Var3 != null) {
                    dd0Var3.r(this);
                }
                if (this.O) {
                    this.N.f(this);
                }
            } else {
                if (this.O && (coVar = this.N) != null) {
                    coVar.g(this);
                }
                this.N = null;
            }
        }
        y9 y9Var = this.H;
        if (bqVar.f25019a.m() && this.T != null) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        y9Var.setVisibility(i10);
        if (z11 || z12) {
            if (z10) {
                this.f24459n = 0.0f;
                this.h = this.f24458f;
                this.f24458f = new z21(this);
                invalidate();
            } else {
                this.f24459n = 1.0f;
            }
            z21 z21Var = this.f24458f;
            bq bqVar2 = this.G;
            if (bqVar2 != null && (c4Var = bqVar2.f25019a) != null) {
                org.telegram.ui.ActionBar.b4 b4Var = (org.telegram.ui.ActionBar.b4) c4Var.f20513f.get(bqVar2.f25021c);
                int i18 = b4Var.h;
                if (this.U != 0) {
                    i18 = b4Var.f20459k;
                }
                Paint paint = z21Var.f33497c;
                Paint paint2 = z21Var.f33495a;
                Paint paint3 = z21Var.f33496b;
                paint.setColor(i18);
                paint3.setColor(b4Var.f20457i);
                if (this.G.f25019a.m()) {
                    i11 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Oh, this.f24463x);
                } else {
                    i11 = b4Var.f20458j;
                }
                int alpha = paint2.getAlpha();
                paint2.setColor(i11);
                paint2.setAlpha(alpha);
                bq bqVar3 = this.G;
                fg.a aVar = (fg.a) bqVar3.f25019a.f20513f.get(bqVar3.f25021c);
                if (aVar != null) {
                    org.telegram.ui.ActionBar.b4 b4Var2 = (org.telegram.ui.ActionBar.b4) aVar;
                    if (b4Var2.a() != 0) {
                        bq bqVar4 = this.G;
                        int i19 = ((org.telegram.ui.ActionBar.b4) bqVar4.f25019a.f20513f.get(bqVar4.f25021c)).d;
                        ArrayList<Integer> arrayList = b4Var2.b(i19).message_colors;
                        if (arrayList.size() > 1) {
                            int[] iArr = new int[arrayList.size()];
                            for (int i20 = 0; i20 != arrayList.size(); i20++) {
                                iArr[i20] = arrayList.get(i20).intValue() | (-16777216);
                            }
                            float dp = this.f24456c + AndroidUtilities.dp(8.0f);
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
                                dd0Var2 = new dd0(true, i12, i13, i14, i15);
                                this.L = dd0Var2.f();
                            } else {
                                int i24 = i12;
                                dd0 dd0Var4 = new dd0(true, i12, i24, i24, i12);
                                this.L = -16777216;
                                dd0Var2 = dd0Var4;
                            }
                            this.G.f25020b = dd0Var2;
                        }
                        z21Var.d = this.G.f25020b;
                        invalidate();
                    }
                }
                bq bqVar5 = this.G;
                org.telegram.ui.ActionBar.b4 b4Var3 = (org.telegram.ui.ActionBar.b4) bqVar5.f25019a.f20513f.get(bqVar5.f25021c);
                if (this.G != null) {
                    int i25 = b4Var3.f20459k;
                    int i26 = b4Var3.f20460l;
                    int i27 = b4Var3.f20461m;
                    int i28 = b4Var3.f20462n;
                    int i29 = b4Var3.f20463o;
                    if (b4Var3.f20451a.k(false) != null) {
                        if (i26 != 0) {
                            dd0 dd0Var5 = new dd0(i25, i26, i27, i28, true, i29, false);
                            this.L = dd0Var5.f();
                            dd0Var = dd0Var5;
                        } else {
                            Drawable dd0Var6 = new dd0(i25, i25, i25, i25, true, i29, false);
                            this.L = -16777216;
                            dd0Var = dd0Var6;
                        }
                    } else if (i25 != 0 && i26 != 0) {
                        dd0Var = new dd0(i25, i26, i27, i28, true, i29, false);
                    } else if (i25 != 0) {
                        dd0Var = new ColorDrawable(i25);
                    } else {
                        org.telegram.ui.ActionBar.h6 h6Var = b4Var3.f20451a;
                        if (h6Var != null && (h6Var.P > 0 || h6Var.f20711c != null)) {
                            org.telegram.ui.ActionBar.h6 h6Var2 = b4Var3.f20451a;
                            Bitmap scaledBitmap = AndroidUtilities.getScaledBitmap(AndroidUtilities.dp(112.0f), AndroidUtilities.dp(134.0f), h6Var2.f20711c, h6Var2.f20709b, h6Var2.P);
                            if (scaledBitmap != null) {
                                BitmapDrawable bitmapDrawable = new BitmapDrawable(scaledBitmap);
                                bitmapDrawable.setFilterBitmap(true);
                                dd0Var = bitmapDrawable;
                            }
                            dd0Var = null;
                        } else {
                            org.telegram.ui.ActionBar.c4 c4Var3 = this.G.f25019a;
                            if (c4Var3 == null || !c4Var3.m()) {
                                dd0Var = new dd0(true, -2368069, -9722489, -2762611, -7817084);
                            }
                            dd0Var = null;
                        }
                    }
                    this.G.f25020b = dd0Var;
                }
                z21Var.d = this.G.f25020b;
                invalidate();
            }
            long i30 = bqVar.f25019a.i(this.V);
            if (i30 != 0) {
                TLRPC.WallPaper k10 = bqVar.f25019a.k(this.V);
                if (k10 != null) {
                    bqVar.f25019a.p(this.V, new ei.u1(this, i30, bqVar, k10.settings.intensity));
                }
            } else {
                SparseArray sparseArray = bqVar.f25019a.j(this.V).f20708a0;
                if (sparseArray != null) {
                    g6Var = (org.telegram.ui.ActionBar.g6) sparseArray.get(((org.telegram.ui.ActionBar.b4) bqVar.f25019a.f20513f.get(this.V)).f20454e);
                } else {
                    g6Var = null;
                }
                if (g6Var != null && (tL_theme = g6Var.f20672r) != null && tL_theme.settings.size() > 0) {
                    TLRPC.WallPaper wallPaper2 = g6Var.f20672r.settings.get(0).wallpaper;
                    if (wallPaper2 != null && (document = wallPaper2.document) != null) {
                        ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 120), document);
                        ImageReceiver imageReceiver = new ImageReceiver();
                        imageReceiver.setAllowLoadingOnAttachedOnly(false);
                        imageReceiver.setImage(forDocument, "120_140", null, null, null, 1);
                        imageReceiver.setDelegate(new sz(this, bqVar, wallPaper2, 3));
                        ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver);
                    }
                } else if (g6Var != null && g6Var.f20672r == null) {
                    int i31 = (int) (g6Var.f20670p * 100.0f);
                    Drawable drawable2 = bqVar.f25020b;
                    if (drawable2 instanceof dd0) {
                        dd0 dd0Var7 = (dd0) drawable2;
                        dd0Var7.t(dd0Var7.f25676u, i31);
                    }
                    ChatThemeController.chatThemeQueue.postRunnable(new zk(this, bqVar, i31, 24));
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
        org.telegram.ui.ActionBar.c4 c4Var4 = this.G.f25019a;
        if (c4Var4 != null && !c4Var4.m()) {
            fg.b bVar = this.G.f25019a.f20511c;
            if (bVar == null) {
                str = null;
            } else {
                str = bVar.f9926b;
                if (str == null) {
                    str = bVar.f9925a;
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
            ValueAnimator valueAnimator = this.f24464y;
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
            ValueAnimator valueAnimator2 = this.f24464y;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            if (z10) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f24464y = ofFloat;
            ofFloat.addUpdateListener(new k80(this, 28));
            this.f24464y.addListener(new fa(20, this, z10));
            this.f24464y.setDuration(250L);
            this.f24464y.start();
        }
        this.W = z10;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        this.O = true;
        org.telegram.ui.co coVar = this.N;
        if (coVar != null) {
            coVar.f(this);
        }
        this.P.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        this.O = false;
        org.telegram.ui.co coVar = this.N;
        if (coVar != null) {
            coVar.g(this);
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
        float f7 = this.f24456c;
        RectF rectF = this.v;
        rectF.set(f7, f7, i10 - f7, i11 - f7);
        Path path = this.f24462w;
        path.reset();
        float f10 = this.f24455b;
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
    }

    @Override
    public void setBackgroundColor(int i10) {
        int i11 = org.telegram.ui.ActionBar.i6.f20891i5;
        org.telegram.ui.ActionBar.e6 e6Var = this.f24463x;
        this.f24461s.setColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
        TextPaint textPaint = this.E;
        if (textPaint != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.We, e6Var));
        }
        invalidate();
    }

    public void setFallbackWallpaper(TLRPC.WallPaper wallPaper) {
        if (this.T != wallPaper) {
            this.T = wallPaper;
            bq bqVar = this.G;
            if (bqVar != null) {
                this.G = null;
                f(bqVar, 0L, false);
            }
        }
    }
}
