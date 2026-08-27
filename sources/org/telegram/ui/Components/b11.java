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

public class b11 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public TextPaint A;
    public StaticLayout B;
    public zo C;
    public final n9 D;
    public final int E;
    public up0 F;
    public final int G;
    public int H;
    public float I;
    public org.telegram.ui.un J;
    public boolean K;
    public final ImageReceiver L;
    public y8 M;
    public final org.telegram.ui.ActionBar.d5 N;
    public final org.telegram.ui.ActionBar.d5 O;
    public TLRPC.WallPaper P;
    public long Q;
    public int R;
    public boolean S;

    public final float f26879a;

    public final float f26880b;

    public final float f26881c;
    public final float d;

    public final float f26882e;

    public a11 f26883f;
    public a11 h;

    public float f26884n;

    public final Paint f26885r;

    public final Paint f26886s;
    public final RectF v;

    public final Path f26887w;

    public final org.telegram.ui.ActionBar.c6 f26888x;

    public ValueAnimator f26889y;

    public b11(int i10, int i11, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f26879a = AndroidUtilities.dp(8.0f);
        this.f26880b = AndroidUtilities.dp(6.0f);
        this.f26881c = AndroidUtilities.dp(4.0f);
        this.d = AndroidUtilities.dp(21.0f);
        this.f26882e = AndroidUtilities.dp(41.0f);
        this.f26883f = new a11(this);
        this.f26884n = 1.0f;
        Paint paint = new Paint(1);
        this.f26885r = paint;
        this.f26886s = new Paint(1);
        this.v = new RectF();
        this.f26887w = new Path();
        this.N = new org.telegram.ui.ActionBar.d5(0, true, false, null);
        this.O = new org.telegram.ui.ActionBar.d5(0, false, false, null);
        this.G = i11;
        this.E = i10;
        this.f26888x = c6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.L = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(8.0f));
        setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23143i5, c6Var));
        n9 n9Var = new n9(context);
        this.D = n9Var;
        n9Var.getImageReceiver().setCrossfadeWithOldImage(true);
        n9Var.getImageReceiver().setAllowStartLottieAnimation(false);
        n9Var.getImageReceiver().setAutoRepeat(0);
        if (i11 == 0 || i11 == 3 || i11 == 2) {
            addView(n9Var, h7.z5.d(28, 28.0f, 81, 0.0f, 0.0f, 0.0f, 12.0f));
        } else {
            addView(n9Var, h7.z5.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 12.0f));
        }
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(551805923);
    }

    public static Bitmap e(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        float fMax = Math.max(AndroidUtilities.dp(120.0f) / bitmap.getWidth(), AndroidUtilities.dp(140.0f) / bitmap.getHeight());
        if (bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0 || Math.abs(fMax - 1.0f) < 0.0125f) {
            return bitmap;
        }
        int width = (int) (bitmap.getWidth() * fMax);
        int height = (int) (bitmap.getHeight() * fMax);
        return (height <= 0 || width <= 0) ? bitmap : Bitmap.createScaledBitmap(bitmap, width, height, true);
    }

    public StaticLayout getNoThemeStaticLayout() {
        StaticLayout staticLayout = this.B;
        if (staticLayout != null) {
            return staticLayout;
        }
        TextPaint textPaint = new TextPaint(129);
        this.A = textPaint;
        textPaint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.We, this.f26888x));
        this.A.setTextSize(AndroidUtilities.dp(c()));
        this.A.setTypeface(AndroidUtilities.bold());
        int iDp = AndroidUtilities.dp(52.0f);
        int i10 = this.G;
        if (i10 == 3 || i10 == 4) {
            iDp = AndroidUtilities.dp(77.0f);
        }
        int i11 = iDp;
        String strB = b();
        TextPaint textPaint2 = this.A;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        StaticLayout staticLayoutD = tv0.d(strB, textPaint2, i11, true, i11, 3);
        this.B = staticLayoutD;
        return staticLayoutD;
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
            if (!this.D.getImageReceiver().getLottieAnimation().f31317h0) {
                this.D.getImageReceiver().getLottieAnimation().L(0, true, false);
                this.D.getImageReceiver().getLottieAnimation().start();
            }
            this.D.animate().scaleX(2.0f).scaleY(2.0f).setDuration(300L).setInterpolator(AndroidUtilities.overshootInterpolator).start();
            up0 up0Var = new up0(this, 16);
            this.F = up0Var;
            AndroidUtilities.runOnUIThread(up0Var, 2500L);
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
        a11 a11Var;
        a11 a11Var2;
        if (this.C == null) {
            super.dispatchDraw(canvas);
            return;
        }
        if (this.J != null) {
            canvas.save();
            canvas.clipPath(this.f26887w);
            this.J.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.J.draw(canvas);
            canvas.restore();
        }
        if (this.f26884n != 1.0f && (a11Var2 = this.h) != null) {
            a11Var2.b(canvas, 1.0f);
        }
        float f10 = this.f26884n;
        if (f10 != 0.0f) {
            this.f26883f.b(canvas, f10);
        }
        if (this.f26884n != 1.0f && (a11Var = this.h) != null) {
            a11Var.a(canvas, 1.0f);
        }
        float f11 = this.f26884n;
        if (f11 != 0.0f) {
            this.f26883f.a(canvas, f11);
        }
        float f12 = this.f26884n;
        if (f12 != 1.0f) {
            float f13 = f12 + 0.10666667f;
            this.f26884n = f13;
            if (f13 >= 1.0f) {
                this.f26884n = 1.0f;
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void f(zo zoVar, long j10, boolean z10) {
        TLRPC.TL_theme tL_theme;
        TLRPC.Document document;
        org.telegram.ui.ActionBar.b4 b4Var;
        org.telegram.ui.ActionBar.a4 a4Var;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.b4 b4Var2;
        Drawable nb0Var;
        int i15;
        int i16;
        int i17;
        int i18;
        nb0 nb0Var2;
        org.telegram.ui.un unVar;
        org.telegram.ui.un unVar2;
        boolean z11 = this.C != zoVar;
        int i19 = this.R;
        int i20 = zoVar.f35318c;
        boolean z12 = i19 != i20;
        this.R = i20;
        this.C = zoVar;
        TLRPC.Document documentF = zoVar.f35316a.f();
        org.telegram.ui.ActionBar.b4 b4Var3 = zoVar.f35316a;
        long j11 = 0;
        long giftThemeUser = b4Var3.d instanceof TLRPC.TL_chatThemeUniqueGift ? ChatThemeController.getInstance(b4Var3.f22785g).getGiftThemeUser(((TLRPC.TL_chatThemeUniqueGift) b4Var3.d).gift.slug) : 0L;
        this.Q = giftThemeUser;
        if (j10 == giftThemeUser) {
            this.Q = 0L;
        }
        String str = null;
        if (this.Q != 0) {
            if (this.M == null) {
                this.M = new y8((org.telegram.ui.ActionBar.c6) null);
            }
            TLObject userOrChat = MessagesController.getInstance(this.E).getUserOrChat(this.Q);
            this.M.j(this.E, userOrChat);
            this.L.setForUserOrChat(userOrChat, this.M);
        } else {
            this.L.clearImage();
        }
        if (z11) {
            up0 up0Var = this.F;
            if (up0Var != null) {
                AndroidUtilities.cancelRunOnUIThread(up0Var);
                this.F = null;
            }
            this.D.animate().cancel();
            this.D.setScaleX(1.0f);
            this.D.setScaleY(1.0f);
        }
        if (z11) {
            Drawable svgThumb = documentF != null ? DocumentObject.getSvgThumb(documentF, org.telegram.ui.ActionBar.g6.f23037c7, 0.2f) : null;
            if (svgThumb == null) {
                Emoji.preloadEmoji(zoVar.f35316a.f22783e);
                svgThumb = Emoji.getEmojiDrawable(zoVar.f35316a.f22783e);
            }
            this.D.h(ImageLocation.getForDocument(documentF), "50_50", svgThumb, null);
            zoVar.f35316a.getClass();
            TLRPC.WallPaper wallPaper = this.P;
            if (wallPaper != null) {
                if (this.K && (unVar2 = this.J) != null) {
                    unVar2.g(this);
                }
                org.telegram.ui.un unVar3 = new org.telegram.ui.un(wallPaper, false, true);
                this.J = unVar3;
                unVar3.f43255b = this;
                nb0 nb0Var3 = unVar3.f43258f;
                if (nb0Var3 != null) {
                    nb0Var3.r(this);
                }
                if (this.K) {
                    this.J.f(this);
                }
            } else {
                if (this.K && (unVar = this.J) != null) {
                    unVar.g(this);
                }
                this.J = null;
            }
        }
        this.D.setVisibility((!zoVar.f35316a.m() || this.P == null) ? 0 : 8);
        if (z11 || z12) {
            if (z10) {
                this.f26884n = 0.0f;
                this.h = this.f26883f;
                this.f26883f = new a11(this);
                invalidate();
            } else {
                this.f26884n = 1.0f;
            }
            a11 a11Var = this.f26883f;
            zo zoVar2 = this.C;
            if (zoVar2 == null || (b4Var = zoVar2.f35316a) == null) {
                j11 = 0;
            } else {
                org.telegram.ui.ActionBar.a4 a4Var2 = (org.telegram.ui.ActionBar.a4) b4Var.f22784f.get(zoVar2.f35318c);
                int i21 = a4Var2.h;
                if (this.Q != 0) {
                    i21 = a4Var2.f22718k;
                }
                Paint paint = a11Var.f26595c;
                Paint paint2 = a11Var.f26593a;
                Paint paint3 = a11Var.f26594b;
                paint.setColor(i21);
                paint3.setColor(a4Var2.f22716i);
                int iV0 = this.C.f35316a.m() ? org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, this.f26888x) : a4Var2.f22717j;
                int alpha = paint2.getAlpha();
                paint2.setColor(iV0);
                paint2.setAlpha(alpha);
                zo zoVar3 = this.C;
                of.a aVar = (of.a) zoVar3.f35316a.f22784f.get(zoVar3.f35318c);
                if (aVar != null) {
                    org.telegram.ui.ActionBar.a4 a4Var3 = (org.telegram.ui.ActionBar.a4) aVar;
                    if (a4Var3.a() != 0) {
                        zo zoVar4 = this.C;
                        int i22 = ((org.telegram.ui.ActionBar.a4) zoVar4.f35316a.f22784f.get(zoVar4.f35318c)).d;
                        ArrayList<Integer> arrayList = a4Var3.b(i22).message_colors;
                        if (arrayList.size() > 1) {
                            int[] iArr = new int[arrayList.size()];
                            for (int i23 = 0; i23 != arrayList.size(); i23++) {
                                iArr[i23] = arrayList.get(i23).intValue() | (-16777216);
                            }
                            float fDp = this.f26881c + AndroidUtilities.dp(8.0f);
                            paint3.setShader(new LinearGradient(0.0f, fDp, 0.0f, fDp + this.d, iArr, (float[]) null, Shader.TileMode.CLAMP));
                        } else {
                            paint3.setShader(null);
                        }
                        paint3.setAlpha(255);
                        if (this.C != null) {
                            if (i22 >= 0) {
                                TLRPC.WallPaperSettings wallPaperSettings = a4Var3.b(i22).wallpaper.settings;
                                int i24 = wallPaperSettings.background_color;
                                int i25 = wallPaperSettings.second_background_color;
                                int i26 = wallPaperSettings.third_background_color;
                                i18 = wallPaperSettings.fourth_background_color;
                                i15 = i24;
                                i16 = i25;
                                i17 = i26;
                            } else {
                                i15 = 0;
                                i16 = 0;
                                i17 = 0;
                                i18 = 0;
                            }
                            if (i16 != 0) {
                                nb0Var2 = new nb0(true, i15, i16, i17, i18);
                                this.H = nb0Var2.f();
                            } else {
                                nb0 nb0Var4 = new nb0(true, i15, i15, i15, i15);
                                this.H = -16777216;
                                nb0Var2 = nb0Var4;
                            }
                            this.C.f35317b = nb0Var2;
                        }
                    } else {
                        zo zoVar5 = this.C;
                        a4Var = (org.telegram.ui.ActionBar.a4) zoVar5.f35316a.f22784f.get(zoVar5.f35318c);
                        if (this.C == null) {
                            i10 = a4Var.f22718k;
                            i11 = a4Var.f22719l;
                            i12 = a4Var.f22720m;
                            i13 = a4Var.f22721n;
                            i14 = a4Var.f22722o;
                            if (a4Var.f22710a.k(false) != null) {
                                if (i11 != 0) {
                                    nb0 nb0Var5 = new nb0(i10, i11, i12, i13, true, i14, false);
                                    this.H = nb0Var5.f();
                                    nb0Var = nb0Var5;
                                } else {
                                    nb0 nb0Var6 = new nb0(i10, i10, i10, i10, true, i14, false);
                                    this.H = -16777216;
                                    nb0Var = nb0Var6;
                                }
                            } else if (i10 == 0 && i11 != 0) {
                                nb0Var = new nb0(i10, i11, i12, i13, true, i14, false);
                            } else if (i10 != 0) {
                                nb0Var = new ColorDrawable(i10);
                            } else {
                                f6Var = a4Var.f22710a;
                                if (f6Var != null || (f6Var.L <= 0 && f6Var.f22945c == null)) {
                                    b4Var2 = this.C.f35316a;
                                    if (b4Var2 == null && b4Var2.m()) {
                                        nb0Var = null;
                                    } else {
                                        nb0Var = new nb0(true, -2368069, -9722489, -2762611, -7817084);
                                    }
                                } else {
                                    float fDp2 = AndroidUtilities.dp(112.0f);
                                    float fDp3 = AndroidUtilities.dp(134.0f);
                                    org.telegram.ui.ActionBar.f6 f6Var2 = a4Var.f22710a;
                                    Bitmap scaledBitmap = AndroidUtilities.getScaledBitmap(fDp2, fDp3, f6Var2.f22945c, f6Var2.f22943b, f6Var2.L);
                                    if (scaledBitmap != null) {
                                        BitmapDrawable bitmapDrawable = new BitmapDrawable(scaledBitmap);
                                        bitmapDrawable.setFilterBitmap(true);
                                        nb0Var = bitmapDrawable;
                                    } else {
                                        nb0Var = null;
                                    }
                                }
                            }
                            this.C.f35317b = nb0Var;
                        }
                    }
                } else {
                    zo zoVar6 = this.C;
                    a4Var = (org.telegram.ui.ActionBar.a4) zoVar6.f35316a.f22784f.get(zoVar6.f35318c);
                    if (this.C == null) {
                        i10 = a4Var.f22718k;
                        i11 = a4Var.f22719l;
                        i12 = a4Var.f22720m;
                        i13 = a4Var.f22721n;
                        i14 = a4Var.f22722o;
                        if (a4Var.f22710a.k(false) != null) {
                            if (i11 != 0) {
                                nb0 nb0Var7 = new nb0(i10, i11, i12, i13, true, i14, false);
                                this.H = nb0Var7.f();
                                nb0Var = nb0Var7;
                            } else {
                                nb0 nb0Var8 = new nb0(i10, i10, i10, i10, true, i14, false);
                                this.H = -16777216;
                                nb0Var = nb0Var8;
                            }
                        } else if (i10 == 0) {
                            if (i10 != 0) {
                                nb0Var = new ColorDrawable(i10);
                            } else {
                                f6Var = a4Var.f22710a;
                                if (f6Var != null) {
                                    b4Var2 = this.C.f35316a;
                                    if (b4Var2 == null) {
                                    }
                                    nb0Var = new nb0(true, -2368069, -9722489, -2762611, -7817084);
                                } else {
                                    b4Var2 = this.C.f35316a;
                                    if (b4Var2 == null) {
                                    }
                                    nb0Var = new nb0(true, -2368069, -9722489, -2762611, -7817084);
                                }
                            }
                        } else if (i10 != 0) {
                            nb0Var = new ColorDrawable(i10);
                        } else {
                            f6Var = a4Var.f22710a;
                            if (f6Var != null) {
                                b4Var2 = this.C.f35316a;
                                if (b4Var2 == null) {
                                }
                                nb0Var = new nb0(true, -2368069, -9722489, -2762611, -7817084);
                            } else {
                                b4Var2 = this.C.f35316a;
                                if (b4Var2 == null) {
                                }
                                nb0Var = new nb0(true, -2368069, -9722489, -2762611, -7817084);
                            }
                        }
                        this.C.f35317b = nb0Var;
                    }
                }
                a11Var.d = this.C.f35317b;
                invalidate();
            }
            long jI = zoVar.f35316a.i(this.R);
            if (jI != j11) {
                TLRPC.WallPaper wallPaperK = zoVar.f35316a.k(this.R);
                if (wallPaperK != null) {
                    zoVar.f35316a.p(this.R, new nh.p1(this, jI, zoVar, wallPaperK.settings.intensity));
                }
            } else {
                SparseArray sparseArray = zoVar.f35316a.j(this.R).W;
                org.telegram.ui.ActionBar.e6 e6Var = sparseArray != null ? (org.telegram.ui.ActionBar.e6) sparseArray.get(((org.telegram.ui.ActionBar.a4) zoVar.f35316a.f22784f.get(this.R)).f22713e) : null;
                if (e6Var != null && (tL_theme = e6Var.f22898r) != null && tL_theme.settings.size() > 0) {
                    TLRPC.WallPaper wallPaper2 = e6Var.f22898r.settings.get(0).wallpaper;
                    if (wallPaper2 != null && (document = wallPaper2.document) != null) {
                        ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 120), document);
                        ImageReceiver imageReceiver = new ImageReceiver();
                        imageReceiver.setAllowLoadingOnAttachedOnly(false);
                        imageReceiver.setImage(forDocument, "120_140", null, null, null, 1);
                        imageReceiver.setDelegate(new iq0(this, zoVar, wallPaper2, 1));
                        ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver);
                    }
                } else if (e6Var != null && e6Var.f22898r == null) {
                    int i27 = (int) (e6Var.f22896p * 100.0f);
                    Drawable drawable = zoVar.f35317b;
                    if (drawable instanceof nb0) {
                        nb0 nb0Var9 = (nb0) drawable;
                        nb0Var9.t(nb0Var9.f30939u, i27);
                    }
                    ChatThemeController.chatThemeQueue.postRunnable(new km(this, zoVar, i27, 23));
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
        org.telegram.ui.ActionBar.b4 b4Var4 = this.C.f35316a;
        if (b4Var4 == null || b4Var4.m()) {
            setContentDescription(LocaleController.getString(R.string.ChatNoTheme));
            return;
        }
        of.b bVar = this.C.f35316a.f22782c;
        if (bVar != null && (str = bVar.f19442b) == null) {
            str = bVar.f19441a;
        }
        setContentDescription(str);
    }

    public final void g(boolean z10, boolean z11) {
        if (!z11) {
            ValueAnimator valueAnimator = this.f26889y;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.S = z10;
            this.I = z10 ? 1.0f : 0.0f;
            invalidate();
            return;
        }
        if (this.S != z10) {
            float f10 = this.I;
            ValueAnimator valueAnimator2 = this.f26889y;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f10, z10 ? 1.0f : 0.0f);
            this.f26889y = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new v60(this, 27));
            this.f26889y.addListener(new org.telegram.ui.go(21, this, z10));
            this.f26889y.setDuration(250L);
            this.f26889y.start();
        }
        this.S = z10;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        this.K = true;
        org.telegram.ui.un unVar = this.J;
        if (unVar != null) {
            unVar.f(this);
        }
        this.L.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        this.K = false;
        org.telegram.ui.un unVar = this.J;
        if (unVar != null) {
            unVar.g(this);
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
        int i12 = this.G;
        if (i12 == 1 || i12 == 4) {
            int size = View.MeasureSpec.getSize(i10);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size * 1.2f), 1073741824));
        } else {
            int iDp = AndroidUtilities.dp(i12 == 0 ? 77.0f : 83.0f);
            int size2 = View.MeasureSpec.getSize(i11);
            if (size2 == 0) {
                size2 = (int) (iDp * 1.35f);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iDp, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        n9 n9Var = this.D;
        n9Var.setPivotY(n9Var.getMeasuredHeight());
        n9Var.setPivotX(n9Var.getMeasuredWidth() / 2.0f);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        float f10 = this.f26881c;
        RectF rectF = this.v;
        rectF.set(f10, f10, i10 - f10, i11 - f10);
        Path path = this.f26887w;
        path.reset();
        float f11 = this.f26880b;
        path.addRoundRect(rectF, f11, f11, Path.Direction.CW);
    }

    @Override
    public void setBackgroundColor(int i10) {
        int i11 = org.telegram.ui.ActionBar.g6.f23143i5;
        org.telegram.ui.ActionBar.c6 c6Var = this.f26888x;
        this.f26886s.setColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        TextPaint textPaint = this.A;
        if (textPaint != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.We, c6Var));
        }
        invalidate();
    }

    public void setFallbackWallpaper(TLRPC.WallPaper wallPaper) {
        if (this.P != wallPaper) {
            this.P = wallPaper;
            zo zoVar = this.C;
            if (zoVar != null) {
                this.C = null;
                f(zoVar, 0L, false);
            }
        }
    }
}
