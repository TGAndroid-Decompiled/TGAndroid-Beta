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
public final class kl0 extends FrameLayout {
    public boolean E;
    public yh.b8 F;
    public final hl0 G;
    public boolean H;
    public float I;
    public ValueAnimator J;
    public final hl0 K;
    public float L;
    public float M;
    public boolean N;
    public boolean O;
    public final ml0 P;
    public final jl0 f28030a;
    public final jl0 f28031b;
    public final jl0 f28032c;
    public final ImageReceiver d;
    public zg.n0 f28033e;
    public rg.c1 f28034f;
    public float h;
    public boolean f28035n;
    public boolean f28036r;
    public boolean f28037s;
    public boolean v;
    public boolean f28038w;
    public boolean f28039x;
    public int f28040y;

    public kl0(ml0 ml0Var, Context context) {
        super(context);
        this.P = ml0Var;
        this.d = new ImageReceiver();
        this.h = 1.0f;
        this.f28039x = true;
        this.G = new hl0(this, 0);
        this.I = 1.0f;
        this.K = new hl0(this, 1);
        this.O = true;
        jl0 jl0Var = new jl0(this, context, 0);
        this.f28030a = jl0Var;
        jl0 jl0Var2 = new jl0(this, context, 1);
        this.f28031b = jl0Var2;
        jl0Var.getImageReceiver().setAutoRepeat(0);
        jl0Var.getImageReceiver().setAllowStartLottieAnimation(false);
        jl0 jl0Var3 = new jl0(this, context, 2);
        this.f28032c = jl0Var3;
        addView(jl0Var, w7.x5.e(34, 34, 17));
        addView(jl0Var3, w7.x5.e(34, 34, 17));
        addView(jl0Var2, w7.x5.e(34, 34, 17));
        if (ml0Var.M0 == 4) {
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setDuration(100L);
            layoutTransition.enableTransitionType(4);
            setLayoutTransition(layoutTransition);
        }
        jl0Var.setLayerNum(Integer.MAX_VALUE);
        jl0Var2.setLayerNum(Integer.MAX_VALUE);
        jl0Var2.f33130a.setAutoRepeat(0);
        jl0Var2.f33130a.setAllowStartAnimation(false);
        jl0Var2.f33130a.setAllowStartLottieAnimation(false);
        jl0Var3.setLayerNum(Integer.MAX_VALUE);
    }

    public static void a(kl0 kl0Var, zg.n0 n0Var, int i10) {
        boolean z10;
        boolean z11;
        int i11;
        jl0 jl0Var = kl0Var.f28032c;
        jl0 jl0Var2 = kl0Var.f28030a;
        jl0 jl0Var3 = kl0Var.f28031b;
        ml0 ml0Var = kl0Var.P;
        kl0Var.f(n0Var, false);
        zg.n0 n0Var2 = kl0Var.f28033e;
        if (n0Var2 != null && n0Var2.equals(n0Var)) {
            kl0Var.f28040y = i10;
            kl0Var.e(n0Var);
            return;
        }
        int i12 = ml0Var.J;
        org.telegram.ui.ActionBar.d6 d6Var = ml0Var.f28775k0;
        int i13 = ml0Var.M0;
        boolean isPremium = UserConfig.getInstance(i12).isPremium();
        if ((i13 == 3 && !isPremium) || (i13 == 5 && n0Var.d && !isPremium)) {
            z10 = true;
        } else {
            z10 = false;
        }
        kl0Var.H = z10;
        if (z10 && kl0Var.f28034f == null) {
            rg.c1 c1Var = new rg.c1(kl0Var.getContext(), 1, null);
            kl0Var.f28034f = c1Var;
            c1Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            kl0Var.f28034f.setImageReceiver(jl0Var3.getImageReceiver());
            kl0Var.addView(kl0Var.f28034f, w7.x5.a(18.0f, 8.0f, 8.0f, 0.0f, 0.0f, 18, 17));
        }
        rg.c1 c1Var2 = kl0Var.f28034f;
        if (c1Var2 != null) {
            if (kl0Var.H) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            c1Var2.setVisibility(i11);
        }
        kl0Var.d();
        kl0Var.f28033e = n0Var;
        if (!n0Var.f54700a && (n0Var.f54704f == null || ((!ml0Var.q() && !ml0Var.G0) || !LiteMode.isEnabled(8200)))) {
            z11 = false;
        } else {
            z11 = true;
        }
        kl0Var.f28036r = z11;
        if (i13 == 4 || kl0Var.f28033e.f54701b) {
            kl0Var.f28036r = false;
        }
        zg.n0 n0Var3 = kl0Var.f28033e;
        if (!n0Var3.f54700a && n0Var3.f54704f == null) {
            jl0Var.getImageReceiver().clearImage();
            jl0Var3.getImageReceiver().clearImage();
            s5 s5Var = new s5(4, ml0Var.J, kl0Var.f28033e.f54705g);
            s5 s5Var2 = new s5(3, ml0Var.J, kl0Var.f28033e.f54705g);
            if (i13 != 1 && i13 != 2 && i13 != 4) {
                int i14 = org.telegram.ui.ActionBar.h6.f21118v6;
                int w02 = org.telegram.ui.ActionBar.h6.w0(i14, d6Var);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                s5Var.setColorFilter(new PorterDuffColorFilter(w02, mode));
                s5Var2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i14, d6Var), mode));
            } else {
                PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
                s5Var.setColorFilter(new PorterDuffColorFilter(-1, mode2));
                s5Var2.setColorFilter(new PorterDuffColorFilter(-1, mode2));
            }
            jl0Var.setAnimatedEmojiDrawable(s5Var);
            jl0Var3.setAnimatedEmojiDrawable(s5Var2);
            rg.c1 c1Var3 = kl0Var.f28034f;
            if (c1Var3 != null) {
                c1Var3.setAnimatedEmojiDrawable(s5Var2);
            }
        } else {
            kl0Var.e(n0Var);
            jl0Var.setAnimatedEmojiDrawable(null);
            if (jl0Var2.getImageReceiver().getLottieAnimation() != null) {
                jl0Var2.getImageReceiver().getLottieAnimation().N(0, false, false);
            }
            rg.c1 c1Var4 = kl0Var.f28034f;
            if (c1Var4 != null) {
                c1Var4.setAnimatedEmojiDrawable(null);
            }
        }
        kl0Var.setFocusable(true);
        boolean z12 = kl0Var.f28036r;
        kl0Var.f28037s = z12;
        if (!z12) {
            jl0Var2.setVisibility(8);
            jl0Var3.setVisibility(0);
            kl0Var.v = true;
        } else {
            kl0Var.v = false;
            jl0Var2.setVisibility(0);
            jl0Var3.setVisibility(8);
        }
        ViewGroup.LayoutParams layoutParams = jl0Var3.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = jl0Var3.getLayoutParams();
        int dp = AndroidUtilities.dp(34.0f);
        layoutParams2.height = dp;
        layoutParams.width = dp;
        ViewGroup.LayoutParams layoutParams3 = jl0Var2.getLayoutParams();
        ViewGroup.LayoutParams layoutParams4 = jl0Var2.getLayoutParams();
        int dp2 = AndroidUtilities.dp(34.0f);
        layoutParams4.height = dp2;
        layoutParams3.width = dp2;
    }

    public final void b() {
        ImageReceiver imageReceiver;
        jl0 jl0Var = this.f28031b;
        s5 s5Var = jl0Var.f33133e;
        if (s5Var != null) {
            imageReceiver = s5Var.f30634k;
        } else {
            imageReceiver = jl0Var.f33130a;
        }
        if (imageReceiver != null && imageReceiver.getLottieAnimation() != null) {
            ml0 ml0Var = this.P;
            if (ml0Var.f28792x0 == null && !this.N && ml0Var.G0) {
                if (imageReceiver.getLottieAnimation().f26037a0 <= 2) {
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
        if (!this.P.f28773j0) {
            d();
            this.f28035n = true;
            if (!this.f28036r) {
                this.f28031b.setVisibility(0);
                jl0 jl0Var = this.f28031b;
                float f12 = this.I;
                if (this.f28038w) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                jl0Var.setScaleY(f12 * f10);
                jl0 jl0Var2 = this.f28031b;
                float f13 = this.I;
                if (!this.f28038w) {
                    f11 = 1.0f;
                }
                jl0Var2.setScaleX(f13 * f11);
                return;
            }
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.G);
        if (this.f28036r) {
            if (this.f28030a.getImageReceiver().getLottieAnimation() != null && !this.f28030a.getImageReceiver().getLottieAnimation().y() && !this.f28035n) {
                this.f28035n = true;
                if (i10 == 0) {
                    this.E = false;
                    this.f28030a.getImageReceiver().getLottieAnimation().stop();
                    this.f28030a.getImageReceiver().getLottieAnimation().N(0, false, false);
                    this.G.run();
                    return;
                }
                this.E = true;
                this.f28030a.getImageReceiver().getLottieAnimation().stop();
                this.f28030a.getImageReceiver().getLottieAnimation().N(0, false, false);
                AndroidUtilities.runOnUIThread(this.G, i10);
                return;
            }
            if (this.f28030a.getImageReceiver().getLottieAnimation() != null && this.f28035n && !this.f28030a.getImageReceiver().getLottieAnimation().f26051k0 && !this.f28030a.getImageReceiver().getLottieAnimation().y()) {
                this.f28030a.getImageReceiver().getLottieAnimation().N(this.f28030a.getImageReceiver().getLottieAnimation().f26043e[0] - 1, false, false);
            }
            jl0 jl0Var3 = this.f28031b;
            float f14 = this.I;
            if (this.f28038w) {
                f7 = 0.76f;
            } else {
                f7 = 1.0f;
            }
            jl0Var3.setScaleY(f14 * f7);
            jl0 jl0Var4 = this.f28031b;
            float f15 = this.I;
            if (!this.f28038w) {
                f11 = 1.0f;
            }
            jl0Var4.setScaleX(f15 * f11);
        } else if (!this.f28035n) {
            this.I = 0.0f;
            this.f28031b.setScaleX(0.0f);
            this.f28031b.setScaleY(0.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.J = ofFloat;
            ofFloat.addUpdateListener(new k80(this, 10));
            this.J.setDuration(150L);
            this.J.setInterpolator(is.h);
            this.J.setStartDelay(i10 * this.P.f28756c);
            this.J.start();
            this.f28035n = true;
        }
    }

    public final void d() {
        float f7;
        float f10;
        boolean z10 = this.f28036r;
        ml0 ml0Var = this.P;
        float f11 = 1.0f;
        jl0 jl0Var = this.f28031b;
        if (z10) {
            AndroidUtilities.cancelRunOnUIThread(this.G);
            jl0 jl0Var2 = this.f28030a;
            if (jl0Var2.getImageReceiver().getLottieAnimation() != null && !jl0Var2.getImageReceiver().getLottieAnimation().y()) {
                jl0Var2.getImageReceiver().getLottieAnimation().stop();
                if (ml0Var.f28773j0) {
                    jl0Var2.getImageReceiver().getLottieAnimation().N(0, false, true);
                } else {
                    jl0Var2.getImageReceiver().getLottieAnimation().N(jl0Var2.getImageReceiver().getLottieAnimation().f26043e[0] - 1, false, true);
                }
            }
            jl0Var.setVisibility(4);
            jl0Var2.setVisibility(0);
            this.v = false;
            float f12 = this.I;
            if (this.f28038w) {
                f10 = 0.76f;
            } else {
                f10 = 1.0f;
            }
            jl0Var.setScaleY(f12 * f10);
            float f13 = this.I;
            if (this.f28038w) {
                f11 = 0.76f;
            }
            jl0Var.setScaleX(f13 * f11);
        } else {
            jl0Var.animate().cancel();
            if (ml0Var.N0) {
                float f14 = this.I;
                if (this.f28038w) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                jl0Var.setScaleY(f14 * f7);
                float f15 = this.I;
                if (this.f28038w) {
                    f11 = 0.76f;
                }
                jl0Var.setScaleX(f15 * f11);
            } else {
                jl0Var.setScaleY(0.0f);
                jl0Var.setScaleX(0.0f);
            }
        }
        this.f28035n = false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        int i10;
        ai.m4 m4Var;
        Paint paint;
        if (this.f28038w && this.f28039x) {
            float measuredWidth = getMeasuredWidth() >> 1;
            float measuredHeight = getMeasuredHeight() >> 1;
            float measuredWidth2 = (getMeasuredWidth() >> 1) - AndroidUtilities.dp(1.0f);
            zg.n0 n0Var = this.f28033e;
            ml0 ml0Var = this.P;
            if (n0Var != null && n0Var.f54700a) {
                paint = ml0Var.I0;
            } else {
                paint = ml0Var.H0;
            }
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth2, paint);
        }
        s5 s5Var = this.f28031b.f33133e;
        if (s5Var != null && (m4Var = s5Var.f30634k) != null) {
            int i11 = 0;
            if (this.f28040y == 0) {
                m4Var.setRoundRadius(AndroidUtilities.dp(6.0f), 0, 0, AndroidUtilities.dp(6.0f));
            } else {
                if (this.f28038w) {
                    i11 = AndroidUtilities.dp(6.0f);
                }
                m4Var.setRoundRadius(i11);
            }
        }
        zg.n0 n0Var2 = this.f28033e;
        if (n0Var2 != null && n0Var2.f54700a && this.F != null && LiteMode.isEnabled(8200) && LiteMode.isEnabled(131072)) {
            RectF rectF = AndroidUtilities.rectTmp;
            float height = ((int) (getHeight() * 0.7f)) / 2.0f;
            rectF.set((getWidth() / 2.0f) - height, (getHeight() / 2.0f) - height, (getWidth() / 2.0f) + height, (getHeight() / 2.0f) + height);
            ek0 lottieAnimation = this.f28030a.getImageReceiver().getLottieAnimation();
            yh.b8 b8Var = this.F;
            if (lottieAnimation != null && (i10 = lottieAnimation.f26037a0) > 30) {
                f7 = Utilities.clamp01((i10 - 30) / 30.0f);
            } else {
                f7 = 0.0f;
            }
            b8Var.f52402j = (int) (b8Var.f52396b.size() * f7);
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
        ml0 ml0Var = this.P;
        int i11 = ml0Var.M0;
        jl0 jl0Var = this.f28030a;
        jl0 jl0Var2 = this.f28031b;
        if (n0Var != null && n0Var.f54700a) {
            jl0Var.getImageReceiver().setImageBitmap(new ek0(R.raw.star_reaction, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f)));
            jl0Var2.getImageReceiver().setImageBitmap(getContext().getResources().getDrawable(R.drawable.star_reaction));
            if (this.F == null) {
                if (SharedConfig.getDevicePerformanceClass() == 2) {
                    i10 = 45;
                } else {
                    i10 = 18;
                }
                this.F = new yh.b8(1, i10);
            }
        } else if (i11 == 4 && n0Var != null && n0Var.f54704f != null) {
            jl0Var.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(n0Var.f54704f));
            jl0Var2.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(n0Var.f54704f));
        } else {
            zg.n0 n0Var2 = this.f28033e;
            if (n0Var2.f54701b) {
                TLRPC.Document effectDocument = MessagesController.getInstance(ml0Var.J).getEffectDocument(this.f28033e.f54705g);
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(effectDocument, org.telegram.ui.ActionBar.h6.f20951m6, 0.2f);
                ImageReceiver imageReceiver = jl0Var2.getImageReceiver();
                ImageLocation forDocument = ImageLocation.getForDocument(effectDocument);
                if (this.f28036r) {
                    svgDrawable4 = null;
                } else {
                    svgDrawable4 = svgThumb;
                }
                imageReceiver.setImage(forDocument, "60_60_firstframe", null, null, svgDrawable4, 0L, "tgs", this.f28033e, 0);
            } else if (n0Var2.f54704f != null) {
                TLRPC.TL_availableReaction tL_availableReaction2 = MediaDataController.getInstance(ml0Var.J).getReactionsMap().get(this.f28033e.f54704f);
                if (tL_availableReaction2 != null) {
                    SvgHelper.SvgDrawable svgThumb2 = DocumentObject.getSvgThumb(tL_availableReaction2.activate_animation, org.telegram.ui.ActionBar.h6.f20951m6, 0.2f);
                    if (!LiteMode.isEnabled(8200) || i11 == 4) {
                        tL_availableReaction = tL_availableReaction2;
                        if (SharedConfig.getDevicePerformanceClass() > 0 && i11 != 4) {
                            jl0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.appear_animation), "30_30_nolimit", null, null, svgThumb2, 0L, "tgs", n0Var, 0);
                            ImageReceiver imageReceiver2 = jl0Var2.getImageReceiver();
                            ImageLocation forDocument2 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                            if (this.f28036r) {
                                svgDrawable2 = null;
                            } else {
                                svgDrawable2 = svgThumb2;
                            }
                            imageReceiver2.setImage(forDocument2, "60_60_firstframe", null, null, svgDrawable2, 0L, "tgs", this.f28033e, 0);
                        } else {
                            ImageReceiver imageReceiver3 = jl0Var2.getImageReceiver();
                            ImageLocation forDocument3 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                            if (this.f28036r) {
                                svgDrawable = null;
                            } else {
                                svgDrawable = svgThumb2;
                            }
                            imageReceiver3.setImage(forDocument3, "60_60_firstframe", null, null, svgDrawable, 0L, "tgs", this.f28033e, 0);
                        }
                    } else {
                        tL_availableReaction = tL_availableReaction2;
                        jl0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction2.appear_animation), "30_30_nolimit", null, null, svgThumb2, 0L, "tgs", n0Var, 0);
                        ImageReceiver imageReceiver4 = jl0Var2.getImageReceiver();
                        ImageLocation forDocument4 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                        if (this.f28036r) {
                            svgDrawable3 = null;
                        } else {
                            svgDrawable3 = svgThumb2;
                        }
                        imageReceiver4.setImage(forDocument4, "60_60_pcache", null, null, svgDrawable3, 0L, "tgs", this.f28033e, 0);
                    }
                    if (jl0Var.getImageReceiver().getLottieAnimation() != null) {
                        jl0Var.getImageReceiver().getLottieAnimation().N(0, false, true);
                    }
                    this.f28032c.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, svgThumb2, 0L, "tgs", n0Var, 0);
                    ImageReceiver imageReceiver5 = this.d;
                    imageReceiver5.setAllowStartLottieAnimation(false);
                    MediaDataController.getInstance(ml0Var.J).preloadImage(imageReceiver5, ImageLocation.getForDocument(tL_availableReaction.around_animation), zg.j0.a());
                }
                rg.c1 c1Var = this.f28034f;
                if (c1Var != null) {
                    c1Var.setImageReceiver(jl0Var2.getImageReceiver());
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
        boolean z11 = this.f28038w;
        boolean contains = this.P.f28759d0.contains(n0Var);
        this.f28038w = contains;
        if (contains != z11) {
            jl0 jl0Var = this.f28030a;
            jl0 jl0Var2 = this.f28031b;
            float f15 = 1.0f;
            if (!z10) {
                float f16 = this.I;
                if (contains) {
                    f12 = 0.76f;
                } else {
                    f12 = 1.0f;
                }
                jl0Var2.setScaleX(f16 * f12);
                float f17 = this.I;
                if (this.f28038w) {
                    f13 = 0.76f;
                } else {
                    f13 = 1.0f;
                }
                jl0Var2.setScaleY(f17 * f13);
                float f18 = this.I;
                if (this.f28038w) {
                    f14 = 0.76f;
                } else {
                    f14 = 1.0f;
                }
                jl0Var.setScaleX(f18 * f14);
                float f19 = this.I;
                if (this.f28038w) {
                    f15 = 0.76f;
                }
                jl0Var.setScaleY(f19 * f15);
            } else {
                ViewPropertyAnimator animate = jl0Var2.animate();
                float f20 = this.I;
                if (this.f28038w) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f20 * f7);
                float f21 = this.I;
                if (this.f28038w) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator duration = scaleX.scaleY(f21 * f10).setDuration(240L);
                is isVar = is.h;
                duration.setInterpolator(isVar).start();
                ViewPropertyAnimator animate2 = jl0Var.animate();
                float f22 = this.I;
                if (this.f28038w) {
                    f11 = 0.76f;
                } else {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator scaleX2 = animate2.scaleX(f22 * f11);
                float f23 = this.I;
                if (this.f28038w) {
                    f15 = 0.76f;
                }
                scaleX2.scaleY(f23 * f15).setDuration(240L).setInterpolator(isVar).start();
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
        zg.n0 n0Var = this.f28033e;
        if (n0Var != null) {
            String str = n0Var.f54704f;
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
        ll0 ll0Var;
        if (this.O) {
            ml0 ml0Var = this.P;
            if (ml0Var.Q == null) {
                int action = motionEvent.getAction();
                hl0 hl0Var = this.K;
                if (action == 0) {
                    this.N = true;
                    this.L = motionEvent.getX();
                    this.M = motionEvent.getY();
                    if (this.h == 1.0f && !this.H && (i10 = ml0Var.M0) != 3 && i10 != 4 && i10 != 5 && ((ll0Var = ml0Var.f28767g0) == null || ll0Var.o())) {
                        AndroidUtilities.runOnUIThread(hl0Var, ViewConfiguration.getLongPressTimeout());
                    }
                }
                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 2.0f;
                if ((motionEvent.getAction() != 2 || (Math.abs(this.L - motionEvent.getX()) <= scaledTouchSlop && Math.abs(this.M - motionEvent.getY()) <= scaledTouchSlop)) && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return true;
                }
                if (motionEvent.getAction() == 1 && this.N && ((ml0Var.f28776l0 == null || ml0Var.f28778n0 > 0.8f) && ml0Var.f28767g0 != null)) {
                    ml0Var.f28783r0 = true;
                    if (System.currentTimeMillis() - ml0Var.f28785s0 > 300) {
                        ml0Var.f28785s0 = System.currentTimeMillis();
                        ll0 ll0Var2 = ml0Var.f28767g0;
                        zg.n0 n0Var = this.f28033e;
                        if (ml0Var.f28778n0 > 0.8f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        ll0Var2.m(this, n0Var, z10, false);
                    }
                }
                if (!ml0Var.f28783r0 && ml0Var.f28776l0 != null) {
                    ml0Var.f28779o0 = 0.0f;
                    float f7 = ml0Var.f28778n0;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ml0Var.Q = ofFloat;
                    ofFloat.addUpdateListener(new al0(ml0Var, f7));
                    ml0Var.Q.addListener(new ci.t5(ml0Var, 2));
                    ml0Var.Q.setDuration(150L);
                    ml0Var.Q.setInterpolator(is.f27451f);
                    ml0Var.Q.start();
                }
                AndroidUtilities.cancelRunOnUIThread(hl0Var);
                this.N = false;
                return true;
            }
        }
        return false;
    }
}
