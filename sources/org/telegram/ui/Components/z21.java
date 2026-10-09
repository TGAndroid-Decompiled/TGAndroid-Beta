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
public class z21 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public TextPaint E;
    public StaticLayout F;
    public bq G;
    public final y9 H;
    public final int I;
    public or0 J;
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
    public final float f33441a;
    public final float f33442b;
    public final float f33443c;
    public final float d;
    public final float f33444e;
    public y21 f33445f;
    public y21 h;
    public float f33446n;
    public final Paint f33447r;
    public final Paint f33448s;
    public final RectF v;
    public final Path f33449w;
    public final org.telegram.ui.ActionBar.e6 f33450x;
    public ValueAnimator f33451y;

    public z21(int i10, int i11, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f33441a = AndroidUtilities.dp(8.0f);
        this.f33442b = AndroidUtilities.dp(6.0f);
        this.f33443c = AndroidUtilities.dp(4.0f);
        this.d = AndroidUtilities.dp(21.0f);
        this.f33444e = AndroidUtilities.dp(41.0f);
        this.f33445f = new y21(this);
        this.f33446n = 1.0f;
        Paint paint = new Paint(1);
        this.f33447r = paint;
        this.f33448s = new Paint(1);
        this.v = new RectF();
        this.f33449w = new Path();
        this.R = new org.telegram.ui.ActionBar.f5(0, true, false, null);
        this.S = new org.telegram.ui.ActionBar.f5(0, false, false, null);
        this.K = i11;
        this.I = i10;
        this.f33450x = e6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.P = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(8.0f));
        setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20887i5, e6Var));
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
        textPaint.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.We, this.f33450x));
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
        StaticLayout d = mx0.d(b10, textPaint2, true, dp, 3);
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
            if (!this.H.getImageReceiver().getLottieAnimation().f25409k0) {
                this.H.getImageReceiver().getLottieAnimation().N(0, true, false);
                this.H.getImageReceiver().getLottieAnimation().start();
            }
            this.H.animate().scaleX(2.0f).scaleY(2.0f).setDuration(300L).setInterpolator(AndroidUtilities.overshootInterpolator).start();
            or0 or0Var = new or0(this, 16);
            this.J = or0Var;
            AndroidUtilities.runOnUIThread(or0Var, 2500L);
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
        y21 y21Var;
        y21 y21Var2;
        if (this.G == null) {
            super.dispatchDraw(canvas);
            return;
        }
        if (this.N != null) {
            canvas.save();
            canvas.clipPath(this.f33449w);
            this.N.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.N.draw(canvas);
            canvas.restore();
        }
        if (this.f33446n != 1.0f && (y21Var2 = this.h) != null) {
            y21Var2.b(canvas, 1.0f);
        }
        float f7 = this.f33446n;
        if (f7 != 0.0f) {
            this.f33445f.b(canvas, f7);
        }
        if (this.f33446n != 1.0f && (y21Var = this.h) != null) {
            y21Var.a(canvas, 1.0f);
        }
        float f10 = this.f33446n;
        if (f10 != 0.0f) {
            this.f33445f.a(canvas, f10);
        }
        float f11 = this.f33446n;
        if (f11 != 1.0f) {
            float f12 = f11 + 0.10666667f;
            this.f33446n = f12;
            if (f12 >= 1.0f) {
                this.f33446n = 1.0f;
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
        BitmapDrawable cd0Var;
        int i12;
        int i13;
        int i14;
        int i15;
        cd0 cd0Var2;
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
        int i17 = bqVar.f25084c;
        if (i16 != i17) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.V = i17;
        this.G = bqVar;
        TLRPC.Document f7 = bqVar.f25082a.f();
        org.telegram.ui.ActionBar.c4 c4Var2 = bqVar.f25082a;
        if (c4Var2.d instanceof TLRPC.TL_chatThemeUniqueGift) {
            j10 = ChatThemeController.getInstance(c4Var2.f20510g).getGiftThemeUser(((TLRPC.TL_chatThemeUniqueGift) c4Var2.d).gift.slug);
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
            or0 or0Var = this.J;
            if (or0Var != null) {
                AndroidUtilities.cancelRunOnUIThread(or0Var);
                this.J = null;
            }
            this.H.animate().cancel();
            this.H.setScaleX(1.0f);
            this.H.setScaleY(1.0f);
        }
        if (z11) {
            if (f7 != null) {
                drawable = DocumentObject.getSvgThumb(f7, org.telegram.ui.ActionBar.i6.f20781c7, 0.2f);
            } else {
                drawable = null;
            }
            if (drawable == null) {
                Emoji.preloadEmoji(bqVar.f25082a.f20508e);
                drawable = Emoji.getEmojiDrawable(bqVar.f25082a.f20508e);
            }
            this.H.h(ImageLocation.getForDocument(f7), "50_50", drawable, null);
            bqVar.f25082a.getClass();
            TLRPC.WallPaper wallPaper = this.T;
            if (wallPaper != null) {
                if (this.O && (coVar2 = this.N) != null) {
                    coVar2.g(this);
                }
                org.telegram.ui.co coVar3 = new org.telegram.ui.co(wallPaper, false, true);
                this.N = coVar3;
                coVar3.f36709b = this;
                cd0 cd0Var3 = coVar3.f36712f;
                if (cd0Var3 != null) {
                    cd0Var3.r(this);
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
        if (bqVar.f25082a.m() && this.T != null) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        y9Var.setVisibility(i10);
        if (z11 || z12) {
            if (z10) {
                this.f33446n = 0.0f;
                this.h = this.f33445f;
                this.f33445f = new y21(this);
                invalidate();
            } else {
                this.f33446n = 1.0f;
            }
            y21 y21Var = this.f33445f;
            bq bqVar2 = this.G;
            if (bqVar2 != null && (c4Var = bqVar2.f25082a) != null) {
                org.telegram.ui.ActionBar.b4 b4Var = (org.telegram.ui.ActionBar.b4) c4Var.f20509f.get(bqVar2.f25084c);
                int i18 = b4Var.h;
                if (this.U != 0) {
                    i18 = b4Var.f20455k;
                }
                Paint paint = y21Var.f33107c;
                Paint paint2 = y21Var.f33105a;
                Paint paint3 = y21Var.f33106b;
                paint.setColor(i18);
                paint3.setColor(b4Var.f20453i);
                if (this.G.f25082a.m()) {
                    i11 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Oh, this.f33450x);
                } else {
                    i11 = b4Var.f20454j;
                }
                int alpha = paint2.getAlpha();
                paint2.setColor(i11);
                paint2.setAlpha(alpha);
                bq bqVar3 = this.G;
                fg.a aVar = (fg.a) bqVar3.f25082a.f20509f.get(bqVar3.f25084c);
                if (aVar != null) {
                    org.telegram.ui.ActionBar.b4 b4Var2 = (org.telegram.ui.ActionBar.b4) aVar;
                    if (b4Var2.a() != 0) {
                        bq bqVar4 = this.G;
                        int i19 = ((org.telegram.ui.ActionBar.b4) bqVar4.f25082a.f20509f.get(bqVar4.f25084c)).d;
                        ArrayList<Integer> arrayList = b4Var2.b(i19).message_colors;
                        if (arrayList.size() > 1) {
                            int[] iArr = new int[arrayList.size()];
                            for (int i20 = 0; i20 != arrayList.size(); i20++) {
                                iArr[i20] = arrayList.get(i20).intValue() | (-16777216);
                            }
                            float dp = this.f33443c + AndroidUtilities.dp(8.0f);
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
                                cd0Var2 = new cd0(true, i12, i13, i14, i15);
                                this.L = cd0Var2.f();
                            } else {
                                int i24 = i12;
                                cd0 cd0Var4 = new cd0(true, i12, i24, i24, i12);
                                this.L = -16777216;
                                cd0Var2 = cd0Var4;
                            }
                            this.G.f25083b = cd0Var2;
                        }
                        y21Var.d = this.G.f25083b;
                        invalidate();
                    }
                }
                bq bqVar5 = this.G;
                org.telegram.ui.ActionBar.b4 b4Var3 = (org.telegram.ui.ActionBar.b4) bqVar5.f25082a.f20509f.get(bqVar5.f25084c);
                if (this.G != null) {
                    int i25 = b4Var3.f20455k;
                    int i26 = b4Var3.f20456l;
                    int i27 = b4Var3.f20457m;
                    int i28 = b4Var3.f20458n;
                    int i29 = b4Var3.f20459o;
                    if (b4Var3.f20447a.k(false) != null) {
                        if (i26 != 0) {
                            cd0 cd0Var5 = new cd0(i25, i26, i27, i28, true, i29, false);
                            this.L = cd0Var5.f();
                            cd0Var = cd0Var5;
                        } else {
                            Drawable cd0Var6 = new cd0(i25, i25, i25, i25, true, i29, false);
                            this.L = -16777216;
                            cd0Var = cd0Var6;
                        }
                    } else if (i25 != 0 && i26 != 0) {
                        cd0Var = new cd0(i25, i26, i27, i28, true, i29, false);
                    } else if (i25 != 0) {
                        cd0Var = new ColorDrawable(i25);
                    } else {
                        org.telegram.ui.ActionBar.h6 h6Var = b4Var3.f20447a;
                        if (h6Var != null && (h6Var.P > 0 || h6Var.f20707c != null)) {
                            org.telegram.ui.ActionBar.h6 h6Var2 = b4Var3.f20447a;
                            Bitmap scaledBitmap = AndroidUtilities.getScaledBitmap(AndroidUtilities.dp(112.0f), AndroidUtilities.dp(134.0f), h6Var2.f20707c, h6Var2.f20705b, h6Var2.P);
                            if (scaledBitmap != null) {
                                BitmapDrawable bitmapDrawable = new BitmapDrawable(scaledBitmap);
                                bitmapDrawable.setFilterBitmap(true);
                                cd0Var = bitmapDrawable;
                            }
                            cd0Var = null;
                        } else {
                            org.telegram.ui.ActionBar.c4 c4Var3 = this.G.f25082a;
                            if (c4Var3 == null || !c4Var3.m()) {
                                cd0Var = new cd0(true, -2368069, -9722489, -2762611, -7817084);
                            }
                            cd0Var = null;
                        }
                    }
                    this.G.f25083b = cd0Var;
                }
                y21Var.d = this.G.f25083b;
                invalidate();
            }
            long i30 = bqVar.f25082a.i(this.V);
            if (i30 != 0) {
                TLRPC.WallPaper k10 = bqVar.f25082a.k(this.V);
                if (k10 != null) {
                    bqVar.f25082a.p(this.V, new ei.u1(this, i30, bqVar, k10.settings.intensity));
                }
            } else {
                SparseArray sparseArray = bqVar.f25082a.j(this.V).f20704a0;
                if (sparseArray != null) {
                    g6Var = (org.telegram.ui.ActionBar.g6) sparseArray.get(((org.telegram.ui.ActionBar.b4) bqVar.f25082a.f20509f.get(this.V)).f20450e);
                } else {
                    g6Var = null;
                }
                if (g6Var != null && (tL_theme = g6Var.f20668r) != null && tL_theme.settings.size() > 0) {
                    TLRPC.WallPaper wallPaper2 = g6Var.f20668r.settings.get(0).wallpaper;
                    if (wallPaper2 != null && (document = wallPaper2.document) != null) {
                        ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 120), document);
                        ImageReceiver imageReceiver = new ImageReceiver();
                        imageReceiver.setAllowLoadingOnAttachedOnly(false);
                        imageReceiver.setImage(forDocument, "120_140", null, null, null, 1);
                        imageReceiver.setDelegate(new rz(this, bqVar, wallPaper2, 3));
                        ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver);
                    }
                } else if (g6Var != null && g6Var.f20668r == null) {
                    int i31 = (int) (g6Var.f20666p * 100.0f);
                    Drawable drawable2 = bqVar.f25083b;
                    if (drawable2 instanceof cd0) {
                        cd0 cd0Var7 = (cd0) drawable2;
                        cd0Var7.t(cd0Var7.f25351u, i31);
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
        org.telegram.ui.ActionBar.c4 c4Var4 = this.G.f25082a;
        if (c4Var4 != null && !c4Var4.m()) {
            fg.b bVar = this.G.f25082a.f20507c;
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
            ValueAnimator valueAnimator = this.f33451y;
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
            ValueAnimator valueAnimator2 = this.f33451y;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            if (z10) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f33451y = ofFloat;
            ofFloat.addUpdateListener(new j80(this, 28));
            this.f33451y.addListener(new fa(20, this, z10));
            this.f33451y.setDuration(250L);
            this.f33451y.start();
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
        float f7 = this.f33443c;
        RectF rectF = this.v;
        rectF.set(f7, f7, i10 - f7, i11 - f7);
        Path path = this.f33449w;
        path.reset();
        float f10 = this.f33442b;
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
    }

    @Override
    public void setBackgroundColor(int i10) {
        int i11 = org.telegram.ui.ActionBar.i6.f20887i5;
        org.telegram.ui.ActionBar.e6 e6Var = this.f33450x;
        this.f33448s.setColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
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
