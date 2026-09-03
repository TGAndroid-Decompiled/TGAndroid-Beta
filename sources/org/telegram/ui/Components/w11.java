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
public class w11 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public TextPaint B;
    public StaticLayout C;
    public ip D;
    public final p9 E;
    public final int F;
    public nq0 G;
    public final int H;
    public int I;
    public float J;
    public org.telegram.ui.co K;
    public boolean L;
    public final ImageReceiver M;
    public z8 N;
    public final org.telegram.ui.ActionBar.g5 O;
    public final org.telegram.ui.ActionBar.g5 P;
    public TLRPC.WallPaper Q;
    public long R;
    public int S;
    public boolean T;
    public final float f30106a;
    public final float f30107b;
    public final float f30108c;
    public final float d;
    public final float e;
    public v11 f30109f;
    public v11 h;
    public float f30110n;
    public final Paint f30111r;
    public final Paint f30112s;
    public final RectF v;
    public final Path f30113w;
    public final org.telegram.ui.ActionBar.f6 f30114x;
    public ValueAnimator f30115y;

    public w11(int i10, int i11, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f30106a = AndroidUtilities.dp(8.0f);
        this.f30107b = AndroidUtilities.dp(6.0f);
        this.f30108c = AndroidUtilities.dp(4.0f);
        this.d = AndroidUtilities.dp(21.0f);
        this.e = AndroidUtilities.dp(41.0f);
        this.f30109f = new v11(this);
        this.f30110n = 1.0f;
        Paint paint = new Paint(1);
        this.f30111r = paint;
        this.f30112s = new Paint(1);
        this.v = new RectF();
        this.f30113w = new Path();
        this.O = new org.telegram.ui.ActionBar.g5(0, true, false, null);
        this.P = new org.telegram.ui.ActionBar.g5(0, false, false, null);
        this.H = i11;
        this.F = i10;
        this.f30114x = f6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.M = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(8.0f));
        setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19970i5, f6Var));
        p9 p9Var = new p9(context);
        this.E = p9Var;
        p9Var.getImageReceiver().setCrossfadeWithOldImage(true);
        p9Var.getImageReceiver().setAllowStartLottieAnimation(false);
        p9Var.getImageReceiver().setAutoRepeat(0);
        if (i11 != 0 && i11 != 3 && i11 != 2) {
            addView(p9Var, k7.b6.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 12.0f));
        } else {
            addView(p9Var, k7.b6.d(28, 28.0f, 81, 0.0f, 0.0f, 0.0f, 12.0f));
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
        StaticLayout staticLayout = this.C;
        if (staticLayout != null) {
            return staticLayout;
        }
        TextPaint textPaint = new TextPaint(129);
        this.B = textPaint;
        textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.We, this.f30114x));
        this.B.setTextSize(AndroidUtilities.dp(c()));
        this.B.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(52.0f);
        int i10 = this.H;
        if (i10 == 3 || i10 == 4) {
            dp = AndroidUtilities.dp(77.0f);
        }
        int i11 = dp;
        String b10 = b();
        TextPaint textPaint2 = this.B;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        StaticLayout d = kw0.d(b10, textPaint2, i11, true, i11, 3);
        this.C = d;
        return d;
    }

    public String b() {
        return LocaleController.getString(R.string.ChatNoTheme);
    }

    public int c() {
        return 14;
    }

    public final void d() {
        if (this.E.getImageReceiver().getLottieAnimation() != null) {
            AndroidUtilities.cancelRunOnUIThread(this.G);
            this.E.setVisibility(0);
            if (!this.E.getImageReceiver().getLottieAnimation().f25164i0) {
                this.E.getImageReceiver().getLottieAnimation().L(0, true, false);
                this.E.getImageReceiver().getLottieAnimation().start();
            }
            this.E.animate().scaleX(2.0f).scaleY(2.0f).setDuration(300L).setInterpolator(AndroidUtilities.overshootInterpolator).start();
            nq0 nq0Var = new nq0(this, 16);
            this.G = nq0Var;
            AndroidUtilities.runOnUIThread(nq0Var, 2500L);
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
        v11 v11Var;
        v11 v11Var2;
        if (this.D == null) {
            super.dispatchDraw(canvas);
            return;
        }
        if (this.K != null) {
            canvas.save();
            canvas.clipPath(this.f30113w);
            this.K.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.K.draw(canvas);
            canvas.restore();
        }
        if (this.f30110n != 1.0f && (v11Var2 = this.h) != null) {
            v11Var2.b(canvas, 1.0f);
        }
        float f10 = this.f30110n;
        if (f10 != 0.0f) {
            this.f30109f.b(canvas, f10);
        }
        if (this.f30110n != 1.0f && (v11Var = this.h) != null) {
            v11Var.a(canvas, 1.0f);
        }
        float f11 = this.f30110n;
        if (f11 != 0.0f) {
            this.f30109f.a(canvas, f11);
        }
        float f12 = this.f30110n;
        if (f12 != 1.0f) {
            float f13 = f12 + 0.10666667f;
            this.f30110n = f13;
            if (f13 >= 1.0f) {
                this.f30110n = 1.0f;
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void f(ip ipVar, long j10, boolean z4) {
        boolean z10;
        boolean z11;
        long j11;
        int i10;
        long j12;
        org.telegram.ui.ActionBar.h6 h6Var;
        TLRPC.TL_theme tL_theme;
        TLRPC.Document document;
        org.telegram.ui.ActionBar.e4 e4Var;
        int i11;
        BitmapDrawable bitmapDrawable;
        int i12;
        int i13;
        int i14;
        int i15;
        ec0 ec0Var;
        Drawable drawable;
        org.telegram.ui.co coVar;
        org.telegram.ui.co coVar2;
        if (this.D != ipVar) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i16 = this.S;
        int i17 = ipVar.f25751c;
        if (i16 != i17) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.S = i17;
        this.D = ipVar;
        TLRPC.Document f10 = ipVar.f25749a.f();
        org.telegram.ui.ActionBar.e4 e4Var2 = ipVar.f25749a;
        if (e4Var2.d instanceof TLRPC.TL_chatThemeUniqueGift) {
            j11 = ChatThemeController.getInstance(e4Var2.f19642g).getGiftThemeUser(((TLRPC.TL_chatThemeUniqueGift) e4Var2.d).gift.slug);
        } else {
            j11 = 0;
        }
        this.R = j11;
        if (j10 == j11) {
            this.R = 0L;
        }
        String str = null;
        if (this.R != 0) {
            if (this.N == null) {
                this.N = new z8((org.telegram.ui.ActionBar.f6) null);
            }
            TLObject userOrChat = MessagesController.getInstance(this.F).getUserOrChat(this.R);
            this.N.j(this.F, userOrChat);
            this.M.setForUserOrChat(userOrChat, this.N);
        } else {
            this.M.clearImage();
        }
        if (z10) {
            nq0 nq0Var = this.G;
            if (nq0Var != null) {
                AndroidUtilities.cancelRunOnUIThread(nq0Var);
                this.G = null;
            }
            this.E.animate().cancel();
            this.E.setScaleX(1.0f);
            this.E.setScaleY(1.0f);
        }
        if (z10) {
            if (f10 != null) {
                drawable = DocumentObject.getSvgThumb(f10, org.telegram.ui.ActionBar.j6.f19864c7, 0.2f);
            } else {
                drawable = null;
            }
            if (drawable == null) {
                Emoji.preloadEmoji(ipVar.f25749a.e);
                drawable = Emoji.getEmojiDrawable(ipVar.f25749a.e);
            }
            this.E.h(ImageLocation.getForDocument(f10), "50_50", drawable, null);
            ipVar.f25749a.getClass();
            TLRPC.WallPaper wallPaper = this.Q;
            if (wallPaper != null) {
                if (this.L && (coVar2 = this.K) != null) {
                    coVar2.g(this);
                }
                org.telegram.ui.co coVar3 = new org.telegram.ui.co(wallPaper, false, true);
                this.K = coVar3;
                coVar3.f33197b = this;
                ec0 ec0Var2 = coVar3.f33199f;
                if (ec0Var2 != null) {
                    ec0Var2.r(this);
                }
                if (this.L) {
                    this.K.f(this);
                }
            } else {
                if (this.L && (coVar = this.K) != null) {
                    coVar.g(this);
                }
                this.K = null;
            }
        }
        p9 p9Var = this.E;
        if (ipVar.f25749a.m() && this.Q != null) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        p9Var.setVisibility(i10);
        if (z10 || z11) {
            if (z4) {
                this.f30110n = 0.0f;
                this.h = this.f30109f;
                this.f30109f = new v11(this);
                invalidate();
            } else {
                this.f30110n = 1.0f;
            }
            v11 v11Var = this.f30109f;
            ip ipVar2 = this.D;
            if (ipVar2 == null || (e4Var = ipVar2.f25749a) == null) {
                j12 = 0;
            } else {
                org.telegram.ui.ActionBar.d4 d4Var = (org.telegram.ui.ActionBar.d4) e4Var.f19641f.get(ipVar2.f25751c);
                int i18 = d4Var.h;
                if (this.R != 0) {
                    i18 = d4Var.f19603k;
                }
                Paint paint = v11Var.f29348c;
                Paint paint2 = v11Var.f29346a;
                Paint paint3 = v11Var.f29347b;
                paint.setColor(i18);
                paint3.setColor(d4Var.f19601i);
                if (this.D.f25749a.m()) {
                    i11 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, this.f30114x);
                } else {
                    i11 = d4Var.f19602j;
                }
                int alpha = paint2.getAlpha();
                paint2.setColor(i11);
                paint2.setAlpha(alpha);
                ip ipVar3 = this.D;
                sf.a aVar = (sf.a) ipVar3.f25749a.f19641f.get(ipVar3.f25751c);
                if (aVar != null) {
                    org.telegram.ui.ActionBar.d4 d4Var2 = (org.telegram.ui.ActionBar.d4) aVar;
                    if (d4Var2.a() != 0) {
                        ip ipVar4 = this.D;
                        int i19 = ((org.telegram.ui.ActionBar.d4) ipVar4.f25749a.f19641f.get(ipVar4.f25751c)).d;
                        ArrayList<Integer> arrayList = d4Var2.b(i19).message_colors;
                        if (arrayList.size() > 1) {
                            int[] iArr = new int[arrayList.size()];
                            for (int i20 = 0; i20 != arrayList.size(); i20++) {
                                iArr[i20] = arrayList.get(i20).intValue() | (-16777216);
                            }
                            float dp = this.f30108c + AndroidUtilities.dp(8.0f);
                            paint3.setShader(new LinearGradient(0.0f, dp, 0.0f, dp + this.d, iArr, (float[]) null, Shader.TileMode.CLAMP));
                        } else {
                            paint3.setShader(null);
                        }
                        paint3.setAlpha(255);
                        if (this.D != null) {
                            if (i19 >= 0) {
                                TLRPC.WallPaperSettings wallPaperSettings = d4Var2.b(i19).wallpaper.settings;
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
                                ec0Var = new ec0(true, i12, i13, i14, i15);
                                this.I = ec0Var.f();
                            } else {
                                ec0 ec0Var3 = new ec0(true, i12, i12, i12, i12);
                                this.I = -16777216;
                                ec0Var = ec0Var3;
                            }
                            this.D.f25750b = ec0Var;
                        }
                        j12 = 0;
                        v11Var.d = this.D.f25750b;
                        invalidate();
                    }
                }
                ip ipVar5 = this.D;
                org.telegram.ui.ActionBar.d4 d4Var3 = (org.telegram.ui.ActionBar.d4) ipVar5.f25749a.f19641f.get(ipVar5.f25751c);
                if (this.D != null) {
                    int i24 = d4Var3.f19603k;
                    int i25 = d4Var3.f19604l;
                    int i26 = d4Var3.f19605m;
                    int i27 = d4Var3.f19606n;
                    int i28 = d4Var3.f19607o;
                    j12 = 0;
                    if (d4Var3.f19596a.k(false) != null) {
                        if (i25 != 0) {
                            ec0 ec0Var4 = new ec0(i24, i25, i26, i27, true, i28, false);
                            this.I = ec0Var4.f();
                            bitmapDrawable = ec0Var4;
                        } else {
                            Drawable ec0Var5 = new ec0(i24, i24, i24, i24, true, i28, false);
                            this.I = -16777216;
                            bitmapDrawable = ec0Var5;
                        }
                    } else if (i24 != 0 && i25 != 0) {
                        bitmapDrawable = new ec0(i24, i25, i26, i27, true, i28, false);
                    } else if (i24 != 0) {
                        bitmapDrawable = new ColorDrawable(i24);
                    } else {
                        org.telegram.ui.ActionBar.i6 i6Var = d4Var3.f19596a;
                        if (i6Var != null && (i6Var.M > 0 || i6Var.f19784c != null)) {
                            org.telegram.ui.ActionBar.i6 i6Var2 = d4Var3.f19596a;
                            Bitmap scaledBitmap = AndroidUtilities.getScaledBitmap(AndroidUtilities.dp(112.0f), AndroidUtilities.dp(134.0f), i6Var2.f19784c, i6Var2.f19782b, i6Var2.M);
                            if (scaledBitmap != null) {
                                BitmapDrawable bitmapDrawable2 = new BitmapDrawable(scaledBitmap);
                                bitmapDrawable2.setFilterBitmap(true);
                                bitmapDrawable = bitmapDrawable2;
                            }
                            bitmapDrawable = null;
                        } else {
                            org.telegram.ui.ActionBar.e4 e4Var3 = this.D.f25749a;
                            if (e4Var3 == null || !e4Var3.m()) {
                                bitmapDrawable = new ec0(true, -2368069, -9722489, -2762611, -7817084);
                            }
                            bitmapDrawable = null;
                        }
                    }
                    this.D.f25750b = bitmapDrawable;
                    v11Var.d = this.D.f25750b;
                    invalidate();
                }
                j12 = 0;
                v11Var.d = this.D.f25750b;
                invalidate();
            }
            long i29 = ipVar.f25749a.i(this.S);
            if (i29 != j12) {
                TLRPC.WallPaper k10 = ipVar.f25749a.k(this.S);
                if (k10 != null) {
                    ipVar.f25749a.p(this.S, new s1(this, i29, ipVar, k10.settings.intensity));
                }
            } else {
                SparseArray sparseArray = ipVar.f25749a.j(this.S).X;
                if (sparseArray != null) {
                    h6Var = (org.telegram.ui.ActionBar.h6) sparseArray.get(((org.telegram.ui.ActionBar.d4) ipVar.f25749a.f19641f.get(this.S)).e);
                } else {
                    h6Var = null;
                }
                if (h6Var != null && (tL_theme = h6Var.f19750r) != null && tL_theme.settings.size() > 0) {
                    TLRPC.WallPaper wallPaper2 = h6Var.f19750r.settings.get(0).wallpaper;
                    if (wallPaper2 != null && (document = wallPaper2.document) != null) {
                        ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 120), document);
                        ImageReceiver imageReceiver = new ImageReceiver();
                        imageReceiver.setAllowLoadingOnAttachedOnly(false);
                        imageReceiver.setImage(forDocument, "120_140", null, null, null, 1);
                        imageReceiver.setDelegate(new androidx.car.app.utils.a(this, ipVar, wallPaper2, 27));
                        ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver);
                    }
                } else if (h6Var != null && h6Var.f19750r == null) {
                    int i30 = (int) (h6Var.f19748p * 100.0f);
                    Drawable drawable2 = ipVar.f25750b;
                    if (drawable2 instanceof ec0) {
                        ec0 ec0Var6 = (ec0) drawable2;
                        ec0Var6.t(ec0Var6.f24590u, i30);
                    }
                    ChatThemeController.chatThemeQueue.postRunnable(new ey(this, ipVar, i30, 21));
                }
            }
        }
        if (!z4) {
            this.E.animate().cancel();
            this.E.setScaleX(1.0f);
            this.E.setScaleY(1.0f);
            AndroidUtilities.cancelRunOnUIThread(this.G);
            if (this.E.getImageReceiver().getLottieAnimation() != null) {
                this.E.getImageReceiver().getLottieAnimation().stop();
                this.E.getImageReceiver().getLottieAnimation().L(0, false, false);
            }
        }
        org.telegram.ui.ActionBar.e4 e4Var4 = this.D.f25749a;
        if (e4Var4 != null && !e4Var4.m()) {
            sf.b bVar = this.D.f25749a.f19640c;
            if (bVar != null && (str = bVar.f44368b) == null) {
                str = bVar.f44367a;
            }
            setContentDescription(str);
            return;
        }
        setContentDescription(LocaleController.getString(R.string.ChatNoTheme));
    }

    public final void g(boolean z4, boolean z10) {
        float f10 = 0.0f;
        if (!z10) {
            ValueAnimator valueAnimator = this.f30115y;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.T = z4;
            if (z4) {
                f10 = 1.0f;
            }
            this.J = f10;
            invalidate();
            return;
        }
        if (this.T != z4) {
            float f11 = this.J;
            ValueAnimator valueAnimator2 = this.f30115y;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            if (z4) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f30115y = ofFloat;
            ofFloat.addUpdateListener(new j70(this, 27));
            this.f30115y.addListener(new m00(12, this, z4));
            this.f30115y.setDuration(250L);
            this.f30115y.start();
        }
        this.T = z4;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        this.L = true;
        org.telegram.ui.co coVar = this.K;
        if (coVar != null) {
            coVar.f(this);
        }
        this.M.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        this.L = false;
        org.telegram.ui.co coVar = this.K;
        if (coVar != null) {
            coVar.g(this);
        }
        this.M.onDetachedFromWindow();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setSelected(this.T);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f10;
        int i12 = this.H;
        if (i12 != 1 && i12 != 4) {
            if (i12 == 0) {
                f10 = 77.0f;
            } else {
                f10 = 83.0f;
            }
            int dp = AndroidUtilities.dp(f10);
            int size = View.MeasureSpec.getSize(i11);
            if (size == 0) {
                size = (int) (dp * 1.35f);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(dp, 1073741824), View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        } else {
            int size2 = View.MeasureSpec.getSize(i10);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size2, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 1.2f), 1073741824));
        }
        p9 p9Var = this.E;
        p9Var.setPivotY(p9Var.getMeasuredHeight());
        p9Var.setPivotX(p9Var.getMeasuredWidth() / 2.0f);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        float f10 = this.f30108c;
        RectF rectF = this.v;
        rectF.set(f10, f10, i10 - f10, i11 - f10);
        Path path = this.f30113w;
        path.reset();
        float f11 = this.f30107b;
        path.addRoundRect(rectF, f11, f11, Path.Direction.CW);
    }

    @Override
    public void setBackgroundColor(int i10) {
        int i11 = org.telegram.ui.ActionBar.j6.f19970i5;
        org.telegram.ui.ActionBar.f6 f6Var = this.f30114x;
        this.f30112s.setColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        TextPaint textPaint = this.B;
        if (textPaint != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.We, f6Var));
        }
        invalidate();
    }

    public void setFallbackWallpaper(TLRPC.WallPaper wallPaper) {
        if (this.Q != wallPaper) {
            this.Q = wallPaper;
            ip ipVar = this.D;
            if (ipVar != null) {
                this.D = null;
                f(ipVar, 0L, false);
            }
        }
    }
}
