package org.telegram.ui.Components;

import android.animation.LayoutTransition;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class il0 extends FrameLayout {
    public boolean E;
    public yh.b8 F;
    public final fl0 G;
    public boolean H;
    public float I;
    public ValueAnimator J;
    public final fl0 K;
    public float L;
    public float M;
    public boolean N;
    public boolean O;
    public final kl0 P;
    public final hl0 f27420a;
    public final hl0 f27421b;
    public final hl0 f27422c;
    public final ImageReceiver d;
    public zg.n0 f27423e;
    public rg.c1 f27424f;
    public float h;
    public boolean f27425n;
    public boolean f27426r;
    public boolean f27427s;
    public boolean v;
    public boolean f27428w;
    public boolean f27429x;
    public int f27430y;

    public il0(kl0 kl0Var, Context context) {
        super(context);
        this.P = kl0Var;
        this.d = new ImageReceiver();
        this.h = 1.0f;
        this.f27429x = true;
        this.G = new fl0(this, 0);
        this.I = 1.0f;
        this.K = new fl0(this, 1);
        this.O = true;
        hl0 hl0Var = new hl0(this, context, 0);
        this.f27420a = hl0Var;
        hl0 hl0Var2 = new hl0(this, context, 1);
        this.f27421b = hl0Var2;
        hl0Var.getImageReceiver().setAutoRepeat(0);
        hl0Var.getImageReceiver().setAllowStartLottieAnimation(false);
        hl0 hl0Var3 = new hl0(this, context, 2);
        this.f27422c = hl0Var3;
        addView(hl0Var, w7.x5.e(34, 34, 17));
        addView(hl0Var3, w7.x5.e(34, 34, 17));
        addView(hl0Var2, w7.x5.e(34, 34, 17));
        if (kl0Var.M0 == 4) {
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setDuration(100L);
            layoutTransition.enableTransitionType(4);
            setLayoutTransition(layoutTransition);
        }
        hl0Var.setLayerNum(Integer.MAX_VALUE);
        hl0Var2.setLayerNum(Integer.MAX_VALUE);
        hl0Var2.f33156a.setAutoRepeat(0);
        hl0Var2.f33156a.setAllowStartAnimation(false);
        hl0Var2.f33156a.setAllowStartLottieAnimation(false);
        hl0Var3.setLayerNum(Integer.MAX_VALUE);
    }

    public static void a(il0 il0Var, zg.n0 n0Var, int i10) {
        boolean z10;
        boolean z11;
        int i11;
        hl0 hl0Var = il0Var.f27422c;
        hl0 hl0Var2 = il0Var.f27420a;
        hl0 hl0Var3 = il0Var.f27421b;
        kl0 kl0Var = il0Var.P;
        il0Var.f(n0Var, false);
        zg.n0 n0Var2 = il0Var.f27423e;
        if (n0Var2 != null && n0Var2.equals(n0Var)) {
            il0Var.f27430y = i10;
            il0Var.e(n0Var);
            return;
        }
        int i12 = kl0Var.J;
        org.telegram.ui.ActionBar.e6 e6Var = kl0Var.f28089k0;
        int i13 = kl0Var.M0;
        boolean isPremium = UserConfig.getInstance(i12).isPremium();
        if ((i13 == 3 && !isPremium) || (i13 == 5 && n0Var.d && !isPremium)) {
            z10 = true;
        } else {
            z10 = false;
        }
        il0Var.H = z10;
        if (z10 && il0Var.f27424f == null) {
            rg.c1 c1Var = new rg.c1(il0Var.getContext(), 1, null);
            il0Var.f27424f = c1Var;
            c1Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            il0Var.f27424f.setImageReceiver(hl0Var3.getImageReceiver());
            il0Var.addView(il0Var.f27424f, w7.x5.a(18.0f, 8.0f, 8.0f, 0.0f, 0.0f, 18, 17));
        }
        rg.c1 c1Var2 = il0Var.f27424f;
        if (c1Var2 != null) {
            if (il0Var.H) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            c1Var2.setVisibility(i11);
        }
        il0Var.d();
        il0Var.f27423e = n0Var;
        if (!n0Var.f54613a && (n0Var.f54617f == null || ((!kl0Var.q() && !kl0Var.G0) || !LiteMode.isEnabled(8200)))) {
            z11 = false;
        } else {
            z11 = true;
        }
        il0Var.f27426r = z11;
        if (i13 == 4 || il0Var.f27423e.f54614b) {
            il0Var.f27426r = false;
        }
        zg.n0 n0Var3 = il0Var.f27423e;
        if (!n0Var3.f54613a && n0Var3.f54617f == null) {
            hl0Var.getImageReceiver().clearImage();
            hl0Var3.getImageReceiver().clearImage();
            s5 s5Var = new s5(4, kl0Var.J, il0Var.f27423e.f54618g);
            s5 s5Var2 = new s5(3, kl0Var.J, il0Var.f27423e.f54618g);
            if (i13 != 1 && i13 != 2 && i13 != 4) {
                int i14 = org.telegram.ui.ActionBar.i6.f21128v6;
                int w02 = org.telegram.ui.ActionBar.i6.w0(i14, e6Var);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                s5Var.setColorFilter(new PorterDuffColorFilter(w02, mode));
                s5Var2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(i14, e6Var), mode));
            } else {
                PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
                s5Var.setColorFilter(new PorterDuffColorFilter(-1, mode2));
                s5Var2.setColorFilter(new PorterDuffColorFilter(-1, mode2));
            }
            hl0Var.setAnimatedEmojiDrawable(s5Var);
            hl0Var3.setAnimatedEmojiDrawable(s5Var2);
            rg.c1 c1Var3 = il0Var.f27424f;
            if (c1Var3 != null) {
                c1Var3.setAnimatedEmojiDrawable(s5Var2);
            }
        } else {
            il0Var.e(n0Var);
            hl0Var.setAnimatedEmojiDrawable(null);
            if (hl0Var2.getImageReceiver().getLottieAnimation() != null) {
                hl0Var2.getImageReceiver().getLottieAnimation().N(0, false, false);
            }
            rg.c1 c1Var4 = il0Var.f27424f;
            if (c1Var4 != null) {
                c1Var4.setAnimatedEmojiDrawable(null);
            }
        }
        il0Var.setFocusable(true);
        boolean z12 = il0Var.f27426r;
        il0Var.f27427s = z12;
        if (!z12) {
            hl0Var2.setVisibility(8);
            hl0Var3.setVisibility(0);
            il0Var.v = true;
        } else {
            il0Var.v = false;
            hl0Var2.setVisibility(0);
            hl0Var3.setVisibility(8);
        }
        ViewGroup.LayoutParams layoutParams = hl0Var3.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = hl0Var3.getLayoutParams();
        int dp = AndroidUtilities.dp(34.0f);
        layoutParams2.height = dp;
        layoutParams.width = dp;
        ViewGroup.LayoutParams layoutParams3 = hl0Var2.getLayoutParams();
        ViewGroup.LayoutParams layoutParams4 = hl0Var2.getLayoutParams();
        int dp2 = AndroidUtilities.dp(34.0f);
        layoutParams4.height = dp2;
        layoutParams3.width = dp2;
    }

    public final void b() {
        ImageReceiver imageReceiver;
        hl0 hl0Var = this.f27421b;
        s5 s5Var = hl0Var.f33159e;
        if (s5Var != null) {
            imageReceiver = s5Var.f30654k;
        } else {
            imageReceiver = hl0Var.f33156a;
        }
        if (imageReceiver != null && imageReceiver.getLottieAnimation() != null) {
            kl0 kl0Var = this.P;
            if (kl0Var.f28106x0 == null && !this.N && kl0Var.G0) {
                if (imageReceiver.getLottieAnimation().f25395a0 <= 2) {
                    imageReceiver.getLottieAnimation().stop();
                    return;
                }
                return;
            }
            imageReceiver.getLottieAnimation().start();
        }
    }

    public final void c(int i10) {
        float f7;
        float f10;
        float f11 = 0.76f;
        if (!this.P.f28087j0) {
            d();
            this.f27425n = true;
            if (!this.f27426r) {
                this.f27421b.setVisibility(0);
                hl0 hl0Var = this.f27421b;
                float f12 = this.I;
                if (this.f27428w) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                hl0Var.setScaleY(f12 * f10);
                hl0 hl0Var2 = this.f27421b;
                float f13 = this.I;
                if (!this.f27428w) {
                    f11 = 1.0f;
                }
                hl0Var2.setScaleX(f13 * f11);
                return;
            }
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.G);
        if (this.f27426r) {
            if (this.f27420a.getImageReceiver().getLottieAnimation() != null && !this.f27420a.getImageReceiver().getLottieAnimation().y() && !this.f27425n) {
                this.f27425n = true;
                if (i10 == 0) {
                    this.E = false;
                    this.f27420a.getImageReceiver().getLottieAnimation().stop();
                    this.f27420a.getImageReceiver().getLottieAnimation().N(0, false, false);
                    this.G.run();
                    return;
                }
                this.E = true;
                this.f27420a.getImageReceiver().getLottieAnimation().stop();
                this.f27420a.getImageReceiver().getLottieAnimation().N(0, false, false);
                AndroidUtilities.runOnUIThread(this.G, i10);
                return;
            }
            if (this.f27420a.getImageReceiver().getLottieAnimation() != null && this.f27425n && !this.f27420a.getImageReceiver().getLottieAnimation().f25409k0 && !this.f27420a.getImageReceiver().getLottieAnimation().y()) {
                this.f27420a.getImageReceiver().getLottieAnimation().N(this.f27420a.getImageReceiver().getLottieAnimation().f25401e[0] - 1, false, false);
            }
            hl0 hl0Var3 = this.f27421b;
            float f14 = this.I;
            if (this.f27428w) {
                f7 = 0.76f;
            } else {
                f7 = 1.0f;
            }
            hl0Var3.setScaleY(f14 * f7);
            hl0 hl0Var4 = this.f27421b;
            float f15 = this.I;
            if (!this.f27428w) {
                f11 = 1.0f;
            }
            hl0Var4.setScaleX(f15 * f11);
        } else if (!this.f27425n) {
            this.I = 0.0f;
            this.f27421b.setScaleX(0.0f);
            this.f27421b.setScaleY(0.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.J = ofFloat;
            ofFloat.addUpdateListener(new j80(this, 10));
            this.J.setDuration(150L);
            this.J.setInterpolator(hs.h);
            this.J.setStartDelay(i10 * this.P.f28070c);
            this.J.start();
            this.f27425n = true;
        }
    }

    public final void d() {
        float f7;
        float f10;
        boolean z10 = this.f27426r;
        kl0 kl0Var = this.P;
        float f11 = 1.0f;
        hl0 hl0Var = this.f27421b;
        if (z10) {
            AndroidUtilities.cancelRunOnUIThread(this.G);
            hl0 hl0Var2 = this.f27420a;
            if (hl0Var2.getImageReceiver().getLottieAnimation() != null && !hl0Var2.getImageReceiver().getLottieAnimation().y()) {
                hl0Var2.getImageReceiver().getLottieAnimation().stop();
                if (kl0Var.f28087j0) {
                    hl0Var2.getImageReceiver().getLottieAnimation().N(0, false, true);
                } else {
                    hl0Var2.getImageReceiver().getLottieAnimation().N(hl0Var2.getImageReceiver().getLottieAnimation().f25401e[0] - 1, false, true);
                }
            }
            hl0Var.setVisibility(4);
            hl0Var2.setVisibility(0);
            this.v = false;
            float f12 = this.I;
            if (this.f27428w) {
                f10 = 0.76f;
            } else {
                f10 = 1.0f;
            }
            hl0Var.setScaleY(f12 * f10);
            float f13 = this.I;
            if (this.f27428w) {
                f11 = 0.76f;
            }
            hl0Var.setScaleX(f13 * f11);
        } else {
            hl0Var.animate().cancel();
            if (kl0Var.N0) {
                float f14 = this.I;
                if (this.f27428w) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                hl0Var.setScaleY(f14 * f7);
                float f15 = this.I;
                if (this.f27428w) {
                    f11 = 0.76f;
                }
                hl0Var.setScaleX(f15 * f11);
            } else {
                hl0Var.setScaleY(0.0f);
                hl0Var.setScaleX(0.0f);
            }
        }
        this.f27425n = false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        int i10;
        ai.m4 m4Var;
        Paint paint;
        if (this.f27428w && this.f27429x) {
            float measuredWidth = getMeasuredWidth() >> 1;
            float measuredHeight = getMeasuredHeight() >> 1;
            float measuredWidth2 = (getMeasuredWidth() >> 1) - AndroidUtilities.dp(1.0f);
            zg.n0 n0Var = this.f27423e;
            kl0 kl0Var = this.P;
            if (n0Var != null && n0Var.f54613a) {
                paint = kl0Var.I0;
            } else {
                paint = kl0Var.H0;
            }
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth2, paint);
        }
        s5 s5Var = this.f27421b.f33159e;
        if (s5Var != null && (m4Var = s5Var.f30654k) != null) {
            int i11 = 0;
            if (this.f27430y == 0) {
                m4Var.setRoundRadius(AndroidUtilities.dp(6.0f), 0, 0, AndroidUtilities.dp(6.0f));
            } else {
                if (this.f27428w) {
                    i11 = AndroidUtilities.dp(6.0f);
                }
                m4Var.setRoundRadius(i11);
            }
        }
        zg.n0 n0Var2 = this.f27423e;
        if (n0Var2 != null && n0Var2.f54613a && this.F != null && LiteMode.isEnabled(8200) && LiteMode.isEnabled(131072)) {
            RectF rectF = AndroidUtilities.rectTmp;
            float height = ((int) (getHeight() * 0.7f)) / 2.0f;
            rectF.set((getWidth() / 2.0f) - height, (getHeight() / 2.0f) - height, (getWidth() / 2.0f) + height, (getHeight() / 2.0f) + height);
            ck0 lottieAnimation = this.f27420a.getImageReceiver().getLottieAnimation();
            yh.b8 b8Var = this.F;
            if (lottieAnimation != null && (i10 = lottieAnimation.f25395a0) > 30) {
                f7 = Utilities.clamp01((i10 - 30) / 30.0f);
            } else {
                f7 = 0.0f;
            }
            b8Var.f52315j = (int) (b8Var.f52309b.size() * f7);
            this.F.g(rectF);
            this.F.d();
            this.F.a(canvas, -673522);
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void e(zg.n0 n0Var) {
        TLRPC.TL_availableReaction tL_availableReaction;
        SvgHelper.SvgDrawable svgDrawable;
        SvgHelper.SvgDrawable svgDrawable2;
        SvgHelper.SvgDrawable svgDrawable3;
        SvgHelper.SvgDrawable svgDrawable4;
        int i10;
        kl0 kl0Var = this.P;
        int i11 = kl0Var.M0;
        hl0 hl0Var = this.f27420a;
        hl0 hl0Var2 = this.f27421b;
        if (n0Var != null && n0Var.f54613a) {
            hl0Var.getImageReceiver().setImageBitmap(new ck0(R.raw.star_reaction, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f)));
            hl0Var2.getImageReceiver().setImageBitmap(getContext().getResources().getDrawable(R.drawable.star_reaction));
            if (this.F == null) {
                if (SharedConfig.getDevicePerformanceClass() == 2) {
                    i10 = 45;
                } else {
                    i10 = 18;
                }
                this.F = new yh.b8(1, i10);
            }
        } else if (i11 == 4 && n0Var != null && n0Var.f54617f != null) {
            hl0Var.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(n0Var.f54617f));
            hl0Var2.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(n0Var.f54617f));
        } else {
            zg.n0 n0Var2 = this.f27423e;
            if (n0Var2.f54614b) {
                TLRPC.Document effectDocument = MessagesController.getInstance(kl0Var.J).getEffectDocument(this.f27423e.f54618g);
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(effectDocument, org.telegram.ui.ActionBar.i6.f20962m6, 0.2f);
                ImageReceiver imageReceiver = hl0Var2.getImageReceiver();
                ImageLocation forDocument = ImageLocation.getForDocument(effectDocument);
                if (this.f27426r) {
                    svgDrawable4 = null;
                } else {
                    svgDrawable4 = svgThumb;
                }
                imageReceiver.setImage(forDocument, "60_60_firstframe", null, null, svgDrawable4, 0L, "tgs", this.f27423e, 0);
            } else if (n0Var2.f54617f != null) {
                TLRPC.TL_availableReaction tL_availableReaction2 = MediaDataController.getInstance(kl0Var.J).getReactionsMap().get(this.f27423e.f54617f);
                if (tL_availableReaction2 != null) {
                    SvgHelper.SvgDrawable svgThumb2 = DocumentObject.getSvgThumb(tL_availableReaction2.activate_animation, org.telegram.ui.ActionBar.i6.f20962m6, 0.2f);
                    if (!LiteMode.isEnabled(8200) || i11 == 4) {
                        tL_availableReaction = tL_availableReaction2;
                        if (SharedConfig.getDevicePerformanceClass() > 0 && i11 != 4) {
                            hl0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.appear_animation), "30_30_nolimit", null, null, svgThumb2, 0L, "tgs", n0Var, 0);
                            ImageReceiver imageReceiver2 = hl0Var2.getImageReceiver();
                            ImageLocation forDocument2 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                            if (this.f27426r) {
                                svgDrawable2 = null;
                            } else {
                                svgDrawable2 = svgThumb2;
                            }
                            imageReceiver2.setImage(forDocument2, "60_60_firstframe", null, null, svgDrawable2, 0L, "tgs", this.f27423e, 0);
                        } else {
                            ImageReceiver imageReceiver3 = hl0Var2.getImageReceiver();
                            ImageLocation forDocument3 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                            if (this.f27426r) {
                                svgDrawable = null;
                            } else {
                                svgDrawable = svgThumb2;
                            }
                            imageReceiver3.setImage(forDocument3, "60_60_firstframe", null, null, svgDrawable, 0L, "tgs", this.f27423e, 0);
                        }
                    } else {
                        tL_availableReaction = tL_availableReaction2;
                        hl0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction2.appear_animation), "30_30_nolimit", null, null, svgThumb2, 0L, "tgs", n0Var, 0);
                        ImageReceiver imageReceiver4 = hl0Var2.getImageReceiver();
                        ImageLocation forDocument4 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                        if (this.f27426r) {
                            svgDrawable3 = null;
                        } else {
                            svgDrawable3 = svgThumb2;
                        }
                        imageReceiver4.setImage(forDocument4, "60_60_pcache", null, null, svgDrawable3, 0L, "tgs", this.f27423e, 0);
                    }
                    if (hl0Var.getImageReceiver().getLottieAnimation() != null) {
                        hl0Var.getImageReceiver().getLottieAnimation().N(0, false, true);
                    }
                    this.f27422c.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, svgThumb2, 0L, "tgs", n0Var, 0);
                    ImageReceiver imageReceiver5 = this.d;
                    imageReceiver5.setAllowStartLottieAnimation(false);
                    MediaDataController.getInstance(kl0Var.J).preloadImage(imageReceiver5, ImageLocation.getForDocument(tL_availableReaction.around_animation), zg.j0.a());
                }
                rg.c1 c1Var = this.f27424f;
                if (c1Var != null) {
                    c1Var.setImageReceiver(hl0Var2.getImageReceiver());
                }
            }
        }
    }

    public final void f(zg.n0 n0Var, boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        boolean z11 = this.f27428w;
        boolean contains = this.P.f28073d0.contains(n0Var);
        this.f27428w = contains;
        if (contains != z11) {
            hl0 hl0Var = this.f27420a;
            hl0 hl0Var2 = this.f27421b;
            float f15 = 1.0f;
            if (!z10) {
                float f16 = this.I;
                if (contains) {
                    f12 = 0.76f;
                } else {
                    f12 = 1.0f;
                }
                hl0Var2.setScaleX(f16 * f12);
                float f17 = this.I;
                if (this.f27428w) {
                    f13 = 0.76f;
                } else {
                    f13 = 1.0f;
                }
                hl0Var2.setScaleY(f17 * f13);
                float f18 = this.I;
                if (this.f27428w) {
                    f14 = 0.76f;
                } else {
                    f14 = 1.0f;
                }
                hl0Var.setScaleX(f18 * f14);
                float f19 = this.I;
                if (this.f27428w) {
                    f15 = 0.76f;
                }
                hl0Var.setScaleY(f19 * f15);
            } else {
                ViewPropertyAnimator animate = hl0Var2.animate();
                float f20 = this.I;
                if (this.f27428w) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f20 * f7);
                float f21 = this.I;
                if (this.f27428w) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator duration = scaleX.scaleY(f21 * f10).setDuration(240L);
                hs hsVar = hs.h;
                duration.setInterpolator(hsVar).start();
                ViewPropertyAnimator animate2 = hl0Var.animate();
                float f22 = this.I;
                if (this.f27428w) {
                    f11 = 0.76f;
                } else {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator scaleX2 = animate2.scaleX(f22 * f11);
                float f23 = this.I;
                if (this.f27428w) {
                    f15 = 0.76f;
                }
                scaleX2.scaleY(f23 * f15).setDuration(240L).setInterpolator(hsVar).start();
            }
            requestLayout();
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
        this.d.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.onDetachedFromWindow();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        zg.n0 n0Var = this.f27423e;
        if (n0Var != null) {
            String str = n0Var.f54617f;
            if (str != null) {
                accessibilityNodeInfo.setText(str);
                accessibilityNodeInfo.setEnabled(true);
                return;
            }
            accessibilityNodeInfo.setText(LocaleController.getString(R.string.AccDescrCustomEmoji));
            accessibilityNodeInfo.setEnabled(true);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int i10;
        jl0 jl0Var;
        if (this.O) {
            kl0 kl0Var = this.P;
            if (kl0Var.Q == null) {
                int action = motionEvent.getAction();
                fl0 fl0Var = this.K;
                if (action == 0) {
                    this.N = true;
                    this.L = motionEvent.getX();
                    this.M = motionEvent.getY();
                    if (this.h == 1.0f && !this.H && (i10 = kl0Var.M0) != 3 && i10 != 4 && i10 != 5 && ((jl0Var = kl0Var.f28081g0) == null || jl0Var.o())) {
                        AndroidUtilities.runOnUIThread(fl0Var, ViewConfiguration.getLongPressTimeout());
                    }
                }
                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 2.0f;
                if ((motionEvent.getAction() != 2 || (Math.abs(this.L - motionEvent.getX()) <= scaledTouchSlop && Math.abs(this.M - motionEvent.getY()) <= scaledTouchSlop)) && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return true;
                }
                if (motionEvent.getAction() == 1 && this.N && ((kl0Var.f28090l0 == null || kl0Var.f28092n0 > 0.8f) && kl0Var.f28081g0 != null)) {
                    kl0Var.f28097r0 = true;
                    if (System.currentTimeMillis() - kl0Var.f28099s0 > 300) {
                        kl0Var.f28099s0 = System.currentTimeMillis();
                        jl0 jl0Var2 = kl0Var.f28081g0;
                        zg.n0 n0Var = this.f27423e;
                        if (kl0Var.f28092n0 > 0.8f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        jl0Var2.m(this, n0Var, z10, false);
                    }
                }
                if (!kl0Var.f28097r0 && kl0Var.f28090l0 != null) {
                    kl0Var.f28093o0 = 0.0f;
                    float f7 = kl0Var.f28092n0;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    kl0Var.Q = ofFloat;
                    ofFloat.addUpdateListener(new yk0(kl0Var, f7));
                    kl0Var.Q.addListener(new ci.t5(kl0Var, 2));
                    kl0Var.Q.setDuration(150L);
                    kl0Var.Q.setInterpolator(hs.f27118f);
                    kl0Var.Q.start();
                }
                AndroidUtilities.cancelRunOnUIThread(fl0Var);
                this.N = false;
                return true;
            }
        }
        return false;
    }
}
