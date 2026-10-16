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
public class w21 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public TextPaint E;
    public StaticLayout F;
    public yp G;
    public final z9 H;
    public final int I;
    public kr0 J;
    public final int K;
    public int L;
    public float M;
    public org.telegram.ui.io N;
    public boolean O;
    public final ImageReceiver P;
    public k9 Q;
    public final org.telegram.ui.ActionBar.d5 R;
    public final org.telegram.ui.ActionBar.d5 S;
    public TLRPC.WallPaper T;
    public long U;
    public int V;
    public boolean W;
    public final float f30449a;
    public final float f30450b;
    public final float f30451c;
    public final float d;
    public final float e;
    public v21 f30452f;
    public v21 h;
    public float f30453n;
    public final Paint f30454r;
    public final Paint f30455s;
    public final RectF v;
    public final Path f30456w;
    public final org.telegram.ui.ActionBar.c6 f30457x;
    public ValueAnimator f30458y;

    public w21(int i10, int i11, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f30449a = AndroidUtilities.dp(8.0f);
        this.f30450b = AndroidUtilities.dp(6.0f);
        this.f30451c = AndroidUtilities.dp(4.0f);
        this.d = AndroidUtilities.dp(21.0f);
        this.e = AndroidUtilities.dp(41.0f);
        this.f30452f = new v21(this);
        this.f30453n = 1.0f;
        Paint paint = new Paint(1);
        this.f30454r = paint;
        this.f30455s = new Paint(1);
        this.v = new RectF();
        this.f30456w = new Path();
        this.R = new org.telegram.ui.ActionBar.d5(0, true, false, null);
        this.S = new org.telegram.ui.ActionBar.d5(0, false, false, null);
        this.K = i11;
        this.I = i10;
        this.f30457x = c6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.P = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(8.0f));
        setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19689i5, c6Var));
        z9 z9Var = new z9(context);
        this.H = z9Var;
        z9Var.getImageReceiver().setCrossfadeWithOldImage(true);
        z9Var.getImageReceiver().setAllowStartLottieAnimation(false);
        z9Var.getImageReceiver().setAutoRepeat(0);
        if (i11 != 0 && i11 != 3 && i11 != 2) {
            addView(z9Var, w7.z5.a(36.0f, 0.0f, 0.0f, 0.0f, 12.0f, 36, 81));
        } else {
            addView(z9Var, w7.z5.a(28.0f, 0.0f, 0.0f, 0.0f, 12.0f, 28, 81));
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
        textPaint.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.We, this.f30457x));
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
        StaticLayout d = ix0.d(b10, textPaint2, true, dp, 3);
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
            if (!this.H.getImageReceiver().getLottieAnimation().f31298k0) {
                this.H.getImageReceiver().getLottieAnimation().N(0, true, false);
                this.H.getImageReceiver().getLottieAnimation().start();
            }
            this.H.animate().scaleX(2.0f).scaleY(2.0f).setDuration(300L).setInterpolator(AndroidUtilities.overshootInterpolator).start();
            kr0 kr0Var = new kr0(this, 17);
            this.J = kr0Var;
            AndroidUtilities.runOnUIThread(kr0Var, 2500L);
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
        v21 v21Var;
        v21 v21Var2;
        if (this.G == null) {
            super.dispatchDraw(canvas);
            return;
        }
        if (this.N != null) {
            canvas.save();
            canvas.clipPath(this.f30456w);
            this.N.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.N.draw(canvas);
            canvas.restore();
        }
        if (this.f30453n != 1.0f && (v21Var2 = this.h) != null) {
            v21Var2.b(canvas, 1.0f);
        }
        float f7 = this.f30453n;
        if (f7 != 0.0f) {
            this.f30452f.b(canvas, f7);
        }
        if (this.f30453n != 1.0f && (v21Var = this.h) != null) {
            v21Var.a(canvas, 1.0f);
        }
        float f10 = this.f30453n;
        if (f10 != 0.0f) {
            this.f30452f.a(canvas, f10);
        }
        float f11 = this.f30453n;
        if (f11 != 1.0f) {
            float f12 = f11 + 0.10666667f;
            this.f30453n = f12;
            if (f12 >= 1.0f) {
                this.f30453n = 1.0f;
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void f(yp ypVar, long j10, boolean z10) {
        boolean z11;
        boolean z12;
        long j11;
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
        cd0 cd0Var;
        String str;
        Drawable drawable;
        org.telegram.ui.io ioVar;
        org.telegram.ui.io ioVar2;
        if (this.G != ypVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i16 = this.V;
        int i17 = ypVar.f31347c;
        if (i16 != i17) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.V = i17;
        this.G = ypVar;
        TLRPC.Document f7 = ypVar.f31345a.f();
        org.telegram.ui.ActionBar.b4 b4Var2 = ypVar.f31345a;
        if (b4Var2.d instanceof TLRPC.TL_chatThemeUniqueGift) {
            j11 = ChatThemeController.getInstance(b4Var2.f19346g).getGiftThemeUser(((TLRPC.TL_chatThemeUniqueGift) b4Var2.d).gift.slug);
        } else {
            j11 = 0;
        }
        this.U = j11;
        if (j10 == j11) {
            this.U = 0L;
        }
        if (this.U != 0) {
            if (this.Q == null) {
                this.Q = new k9((org.telegram.ui.ActionBar.c6) null);
            }
            TLObject userOrChat = MessagesController.getInstance(this.I).getUserOrChat(this.U);
            this.Q.j(this.I, userOrChat);
            this.P.setForUserOrChat(userOrChat, this.Q);
        } else {
            this.P.clearImage();
        }
        if (z11) {
            kr0 kr0Var = this.J;
            if (kr0Var != null) {
                AndroidUtilities.cancelRunOnUIThread(kr0Var);
                this.J = null;
            }
            this.H.animate().cancel();
            this.H.setScaleX(1.0f);
            this.H.setScaleY(1.0f);
        }
        if (z11) {
            if (f7 != null) {
                drawable = DocumentObject.getSvgThumb(f7, org.telegram.ui.ActionBar.g6.f19583c7, 0.2f);
            } else {
                drawable = null;
            }
            if (drawable == null) {
                Emoji.preloadEmoji(ypVar.f31345a.e);
                drawable = Emoji.getEmojiDrawable(ypVar.f31345a.e);
            }
            this.H.h(ImageLocation.getForDocument(f7), "50_50", drawable, null);
            ypVar.f31345a.getClass();
            TLRPC.WallPaper wallPaper = this.T;
            if (wallPaper != null) {
                if (this.O && (ioVar2 = this.N) != null) {
                    ioVar2.g(this);
                }
                org.telegram.ui.io ioVar3 = new org.telegram.ui.io(wallPaper, false, true);
                this.N = ioVar3;
                ioVar3.f36841b = this;
                cd0 cd0Var2 = ioVar3.f36843f;
                if (cd0Var2 != null) {
                    cd0Var2.r(this);
                }
                if (this.O) {
                    this.N.f(this);
                }
            } else {
                if (this.O && (ioVar = this.N) != null) {
                    ioVar.g(this);
                }
                this.N = null;
            }
        }
        z9 z9Var = this.H;
        if (ypVar.f31345a.m() && this.T != null) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        z9Var.setVisibility(i10);
        if (z11 || z12) {
            if (z10) {
                this.f30453n = 0.0f;
                this.h = this.f30452f;
                this.f30452f = new v21(this);
                invalidate();
            } else {
                this.f30453n = 1.0f;
            }
            v21 v21Var = this.f30452f;
            yp ypVar2 = this.G;
            if (ypVar2 != null && (b4Var = ypVar2.f31345a) != null) {
                org.telegram.ui.ActionBar.a4 a4Var = (org.telegram.ui.ActionBar.a4) b4Var.f19345f.get(ypVar2.f31347c);
                int i18 = a4Var.h;
                if (this.U != 0) {
                    i18 = a4Var.f19303k;
                }
                Paint paint = v21Var.f29542c;
                Paint paint2 = v21Var.f29540a;
                Paint paint3 = v21Var.f29541b;
                paint.setColor(i18);
                paint3.setColor(a4Var.f19301i);
                if (this.G.f31345a.m()) {
                    i11 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, this.f30457x);
                } else {
                    i11 = a4Var.f19302j;
                }
                int alpha = paint2.getAlpha();
                paint2.setColor(i11);
                paint2.setAlpha(alpha);
                yp ypVar3 = this.G;
                gg.a aVar = (gg.a) ypVar3.f31345a.f19345f.get(ypVar3.f31347c);
                if (aVar != null) {
                    org.telegram.ui.ActionBar.a4 a4Var2 = (org.telegram.ui.ActionBar.a4) aVar;
                    if (a4Var2.a() != 0) {
                        yp ypVar4 = this.G;
                        int i19 = ((org.telegram.ui.ActionBar.a4) ypVar4.f31345a.f19345f.get(ypVar4.f31347c)).d;
                        ArrayList<Integer> arrayList = a4Var2.b(i19).message_colors;
                        if (arrayList.size() > 1) {
                            int[] iArr = new int[arrayList.size()];
                            for (int i20 = 0; i20 != arrayList.size(); i20++) {
                                iArr[i20] = arrayList.get(i20).intValue() | (-16777216);
                            }
                            float dp = this.f30451c + AndroidUtilities.dp(8.0f);
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
                                cd0Var = new cd0(true, i12, i13, i14, i15);
                                this.L = cd0Var.f();
                            } else {
                                cd0 cd0Var3 = new cd0(true, i12, i12, i12, i12);
                                this.L = -16777216;
                                cd0Var = cd0Var3;
                            }
                            this.G.f31346b = cd0Var;
                        }
                        v21Var.d = this.G.f31346b;
                        invalidate();
                    }
                }
                yp ypVar5 = this.G;
                org.telegram.ui.ActionBar.a4 a4Var3 = (org.telegram.ui.ActionBar.a4) ypVar5.f31345a.f19345f.get(ypVar5.f31347c);
                if (this.G != null) {
                    int i24 = a4Var3.f19303k;
                    int i25 = a4Var3.f19304l;
                    int i26 = a4Var3.f19305m;
                    int i27 = a4Var3.f19306n;
                    int i28 = a4Var3.f19307o;
                    if (a4Var3.f19296a.k(false) != null) {
                        if (i25 != 0) {
                            cd0 cd0Var4 = new cd0(i24, i25, i26, i27, true, i28, false);
                            this.L = cd0Var4.f();
                            bitmapDrawable = cd0Var4;
                        } else {
                            Drawable cd0Var5 = new cd0(i24, i24, i24, i24, true, i28, false);
                            this.L = -16777216;
                            bitmapDrawable = cd0Var5;
                        }
                    } else if (i24 != 0 && i25 != 0) {
                        bitmapDrawable = new cd0(i24, i25, i26, i27, true, i28, false);
                    } else if (i24 != 0) {
                        bitmapDrawable = new ColorDrawable(i24);
                    } else {
                        org.telegram.ui.ActionBar.f6 f6Var = a4Var3.f19296a;
                        if (f6Var != null && (f6Var.P > 0 || f6Var.f19495c != null)) {
                            org.telegram.ui.ActionBar.f6 f6Var2 = a4Var3.f19296a;
                            Bitmap scaledBitmap = AndroidUtilities.getScaledBitmap(AndroidUtilities.dp(112.0f), AndroidUtilities.dp(134.0f), f6Var2.f19495c, f6Var2.f19493b, f6Var2.P);
                            if (scaledBitmap != null) {
                                BitmapDrawable bitmapDrawable2 = new BitmapDrawable(scaledBitmap);
                                bitmapDrawable2.setFilterBitmap(true);
                                bitmapDrawable = bitmapDrawable2;
                            }
                            bitmapDrawable = null;
                        } else {
                            org.telegram.ui.ActionBar.b4 b4Var3 = this.G.f31345a;
                            if (b4Var3 == null || !b4Var3.m()) {
                                bitmapDrawable = new cd0(true, -2368069, -9722489, -2762611, -7817084);
                            }
                            bitmapDrawable = null;
                        }
                    }
                    this.G.f31346b = bitmapDrawable;
                }
                v21Var.d = this.G.f31346b;
                invalidate();
            }
            long i29 = ypVar.f31345a.i(this.V);
            if (i29 != 0) {
                TLRPC.WallPaper k10 = ypVar.f31345a.k(this.V);
                if (k10 != null) {
                    ypVar.f31345a.p(this.V, new fi.t1(this, i29, ypVar, k10.settings.intensity, 4));
                }
            } else {
                SparseArray sparseArray = ypVar.f31345a.j(this.V).f19492a0;
                if (sparseArray != null) {
                    e6Var = (org.telegram.ui.ActionBar.e6) sparseArray.get(((org.telegram.ui.ActionBar.a4) ypVar.f31345a.f19345f.get(this.V)).e);
                } else {
                    e6Var = null;
                }
                if (e6Var != null && (tL_theme = e6Var.f19459r) != null && tL_theme.settings.size() > 0) {
                    TLRPC.WallPaper wallPaper2 = e6Var.f19459r.settings.get(0).wallpaper;
                    if (wallPaper2 != null && (document = wallPaper2.document) != null) {
                        ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 120), document);
                        ImageReceiver imageReceiver = new ImageReceiver();
                        imageReceiver.setAllowLoadingOnAttachedOnly(false);
                        imageReceiver.setImage(forDocument, "120_140", null, null, null, 1);
                        imageReceiver.setDelegate(new nz(this, ypVar, wallPaper2, 3));
                        ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver);
                    }
                } else if (e6Var != null && e6Var.f19459r == null) {
                    int i30 = (int) (e6Var.f19457p * 100.0f);
                    Drawable drawable2 = ypVar.f31346b;
                    if (drawable2 instanceof cd0) {
                        cd0 cd0Var6 = (cd0) drawable2;
                        cd0Var6.t(cd0Var6.f23710u, i30);
                    }
                    ChatThemeController.chatThemeQueue.postRunnable(new org.telegram.ui.gm(this, ypVar, i30, 25));
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
        org.telegram.ui.ActionBar.b4 b4Var4 = this.G.f31345a;
        if (b4Var4 != null && !b4Var4.m()) {
            gg.b bVar = this.G.f31345a.f19344c;
            if (bVar == null) {
                str = null;
            } else {
                str = bVar.f10146b;
                if (str == null) {
                    str = bVar.f10145a;
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
            ValueAnimator valueAnimator = this.f30458y;
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
            ValueAnimator valueAnimator2 = this.f30458y;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            if (z10) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f30458y = ofFloat;
            ofFloat.addUpdateListener(new f80(this, 28));
            this.f30458y.addListener(new org.telegram.ui.vo(21, this, z10));
            this.f30458y.setDuration(250L);
            this.f30458y.start();
        }
        this.W = z10;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        this.O = true;
        org.telegram.ui.io ioVar = this.N;
        if (ioVar != null) {
            ioVar.f(this);
        }
        this.P.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        this.O = false;
        org.telegram.ui.io ioVar = this.N;
        if (ioVar != null) {
            ioVar.g(this);
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
        z9 z9Var = this.H;
        z9Var.setPivotY(z9Var.getMeasuredHeight());
        z9Var.setPivotX(z9Var.getMeasuredWidth() / 2.0f);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        float f7 = this.f30451c;
        RectF rectF = this.v;
        rectF.set(f7, f7, i10 - f7, i11 - f7);
        Path path = this.f30456w;
        path.reset();
        float f10 = this.f30450b;
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
    }

    @Override
    public void setBackgroundColor(int i10) {
        int i11 = org.telegram.ui.ActionBar.g6.f19689i5;
        org.telegram.ui.ActionBar.c6 c6Var = this.f30457x;
        this.f30455s.setColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
        TextPaint textPaint = this.E;
        if (textPaint != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.We, c6Var));
        }
        invalidate();
    }

    public void setFallbackWallpaper(TLRPC.WallPaper wallPaper) {
        if (this.T != wallPaper) {
            this.T = wallPaper;
            yp ypVar = this.G;
            if (ypVar != null) {
                this.G = null;
                f(ypVar, 0L, false);
            }
        }
    }
}
