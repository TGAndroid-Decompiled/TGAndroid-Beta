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
public final class jl0 extends FrameLayout {
    public boolean E;
    public yh.b8 F;
    public final gl0 G;
    public boolean H;
    public float I;
    public ValueAnimator J;
    public final gl0 K;
    public float L;
    public float M;
    public boolean N;
    public boolean O;
    public final ll0 P;
    public final il0 f27717a;
    public final il0 f27718b;
    public final il0 f27719c;
    public final ImageReceiver d;
    public zg.n0 f27720e;
    public rg.c1 f27721f;
    public float h;
    public boolean f27722n;
    public boolean f27723r;
    public boolean f27724s;
    public boolean v;
    public boolean f27725w;
    public boolean f27726x;
    public int f27727y;

    public jl0(ll0 ll0Var, Context context) {
        super(context);
        this.P = ll0Var;
        this.d = new ImageReceiver();
        this.h = 1.0f;
        this.f27726x = true;
        this.G = new gl0(this, 0);
        this.I = 1.0f;
        this.K = new gl0(this, 1);
        this.O = true;
        il0 il0Var = new il0(this, context, 0);
        this.f27717a = il0Var;
        il0 il0Var2 = new il0(this, context, 1);
        this.f27718b = il0Var2;
        il0Var.getImageReceiver().setAutoRepeat(0);
        il0Var.getImageReceiver().setAllowStartLottieAnimation(false);
        il0 il0Var3 = new il0(this, context, 2);
        this.f27719c = il0Var3;
        addView(il0Var, w7.x5.e(34, 34, 17));
        addView(il0Var3, w7.x5.e(34, 34, 17));
        addView(il0Var2, w7.x5.e(34, 34, 17));
        if (ll0Var.M0 == 4) {
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setDuration(100L);
            layoutTransition.enableTransitionType(4);
            setLayoutTransition(layoutTransition);
        }
        il0Var.setLayerNum(Integer.MAX_VALUE);
        il0Var2.setLayerNum(Integer.MAX_VALUE);
        il0Var2.f33135a.setAutoRepeat(0);
        il0Var2.f33135a.setAllowStartAnimation(false);
        il0Var2.f33135a.setAllowStartLottieAnimation(false);
        il0Var3.setLayerNum(Integer.MAX_VALUE);
    }

    public static void a(jl0 jl0Var, zg.n0 n0Var, int i10) {
        boolean z10;
        boolean z11;
        int i11;
        il0 il0Var = jl0Var.f27719c;
        il0 il0Var2 = jl0Var.f27717a;
        il0 il0Var3 = jl0Var.f27718b;
        ll0 ll0Var = jl0Var.P;
        jl0Var.f(n0Var, false);
        zg.n0 n0Var2 = jl0Var.f27720e;
        if (n0Var2 != null && n0Var2.equals(n0Var)) {
            jl0Var.f27727y = i10;
            jl0Var.e(n0Var);
            return;
        }
        int i12 = ll0Var.J;
        org.telegram.ui.ActionBar.e6 e6Var = ll0Var.f28404k0;
        int i13 = ll0Var.M0;
        boolean isPremium = UserConfig.getInstance(i12).isPremium();
        if ((i13 == 3 && !isPremium) || (i13 == 5 && n0Var.d && !isPremium)) {
            z10 = true;
        } else {
            z10 = false;
        }
        jl0Var.H = z10;
        if (z10 && jl0Var.f27721f == null) {
            rg.c1 c1Var = new rg.c1(jl0Var.getContext(), 1, null);
            jl0Var.f27721f = c1Var;
            c1Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            jl0Var.f27721f.setImageReceiver(il0Var3.getImageReceiver());
            jl0Var.addView(jl0Var.f27721f, w7.x5.a(18.0f, 8.0f, 8.0f, 0.0f, 0.0f, 18, 17));
        }
        rg.c1 c1Var2 = jl0Var.f27721f;
        if (c1Var2 != null) {
            if (jl0Var.H) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            c1Var2.setVisibility(i11);
        }
        jl0Var.d();
        jl0Var.f27720e = n0Var;
        if (!n0Var.f54657a && (n0Var.f54661f == null || ((!ll0Var.q() && !ll0Var.G0) || !LiteMode.isEnabled(8200)))) {
            z11 = false;
        } else {
            z11 = true;
        }
        jl0Var.f27723r = z11;
        if (i13 == 4 || jl0Var.f27720e.f54658b) {
            jl0Var.f27723r = false;
        }
        zg.n0 n0Var3 = jl0Var.f27720e;
        if (!n0Var3.f54657a && n0Var3.f54661f == null) {
            il0Var.getImageReceiver().clearImage();
            il0Var3.getImageReceiver().clearImage();
            s5 s5Var = new s5(4, ll0Var.J, jl0Var.f27720e.f54662g);
            s5 s5Var2 = new s5(3, ll0Var.J, jl0Var.f27720e.f54662g);
            if (i13 != 1 && i13 != 2 && i13 != 4) {
                int i14 = org.telegram.ui.ActionBar.i6.f21132v6;
                int w02 = org.telegram.ui.ActionBar.i6.w0(i14, e6Var);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                s5Var.setColorFilter(new PorterDuffColorFilter(w02, mode));
                s5Var2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(i14, e6Var), mode));
            } else {
                PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
                s5Var.setColorFilter(new PorterDuffColorFilter(-1, mode2));
                s5Var2.setColorFilter(new PorterDuffColorFilter(-1, mode2));
            }
            il0Var.setAnimatedEmojiDrawable(s5Var);
            il0Var3.setAnimatedEmojiDrawable(s5Var2);
            rg.c1 c1Var3 = jl0Var.f27721f;
            if (c1Var3 != null) {
                c1Var3.setAnimatedEmojiDrawable(s5Var2);
            }
        } else {
            jl0Var.e(n0Var);
            il0Var.setAnimatedEmojiDrawable(null);
            if (il0Var2.getImageReceiver().getLottieAnimation() != null) {
                il0Var2.getImageReceiver().getLottieAnimation().N(0, false, false);
            }
            rg.c1 c1Var4 = jl0Var.f27721f;
            if (c1Var4 != null) {
                c1Var4.setAnimatedEmojiDrawable(null);
            }
        }
        jl0Var.setFocusable(true);
        boolean z12 = jl0Var.f27723r;
        jl0Var.f27724s = z12;
        if (!z12) {
            il0Var2.setVisibility(8);
            il0Var3.setVisibility(0);
            jl0Var.v = true;
        } else {
            jl0Var.v = false;
            il0Var2.setVisibility(0);
            il0Var3.setVisibility(8);
        }
        ViewGroup.LayoutParams layoutParams = il0Var3.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = il0Var3.getLayoutParams();
        int dp = AndroidUtilities.dp(34.0f);
        layoutParams2.height = dp;
        layoutParams.width = dp;
        ViewGroup.LayoutParams layoutParams3 = il0Var2.getLayoutParams();
        ViewGroup.LayoutParams layoutParams4 = il0Var2.getLayoutParams();
        int dp2 = AndroidUtilities.dp(34.0f);
        layoutParams4.height = dp2;
        layoutParams3.width = dp2;
    }

    public final void b() {
        ImageReceiver imageReceiver;
        il0 il0Var = this.f27718b;
        s5 s5Var = il0Var.f33138e;
        if (s5Var != null) {
            imageReceiver = s5Var.f30680k;
        } else {
            imageReceiver = il0Var.f33135a;
        }
        if (imageReceiver != null && imageReceiver.getLottieAnimation() != null) {
            ll0 ll0Var = this.P;
            if (ll0Var.f28421x0 == null && !this.N && ll0Var.G0) {
                if (imageReceiver.getLottieAnimation().f25726a0 <= 2) {
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
        if (!this.P.f28402j0) {
            d();
            this.f27722n = true;
            if (!this.f27723r) {
                this.f27718b.setVisibility(0);
                il0 il0Var = this.f27718b;
                float f12 = this.I;
                if (this.f27725w) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                il0Var.setScaleY(f12 * f10);
                il0 il0Var2 = this.f27718b;
                float f13 = this.I;
                if (!this.f27725w) {
                    f11 = 1.0f;
                }
                il0Var2.setScaleX(f13 * f11);
                return;
            }
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.G);
        if (this.f27723r) {
            if (this.f27717a.getImageReceiver().getLottieAnimation() != null && !this.f27717a.getImageReceiver().getLottieAnimation().y() && !this.f27722n) {
                this.f27722n = true;
                if (i10 == 0) {
                    this.E = false;
                    this.f27717a.getImageReceiver().getLottieAnimation().stop();
                    this.f27717a.getImageReceiver().getLottieAnimation().N(0, false, false);
                    this.G.run();
                    return;
                }
                this.E = true;
                this.f27717a.getImageReceiver().getLottieAnimation().stop();
                this.f27717a.getImageReceiver().getLottieAnimation().N(0, false, false);
                AndroidUtilities.runOnUIThread(this.G, i10);
                return;
            }
            if (this.f27717a.getImageReceiver().getLottieAnimation() != null && this.f27722n && !this.f27717a.getImageReceiver().getLottieAnimation().f25740k0 && !this.f27717a.getImageReceiver().getLottieAnimation().y()) {
                this.f27717a.getImageReceiver().getLottieAnimation().N(this.f27717a.getImageReceiver().getLottieAnimation().f25732e[0] - 1, false, false);
            }
            il0 il0Var3 = this.f27718b;
            float f14 = this.I;
            if (this.f27725w) {
                f7 = 0.76f;
            } else {
                f7 = 1.0f;
            }
            il0Var3.setScaleY(f14 * f7);
            il0 il0Var4 = this.f27718b;
            float f15 = this.I;
            if (!this.f27725w) {
                f11 = 1.0f;
            }
            il0Var4.setScaleX(f15 * f11);
        } else if (!this.f27722n) {
            this.I = 0.0f;
            this.f27718b.setScaleX(0.0f);
            this.f27718b.setScaleY(0.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.J = ofFloat;
            ofFloat.addUpdateListener(new k80(this, 10));
            this.J.setDuration(150L);
            this.J.setInterpolator(is.h);
            this.J.setStartDelay(i10 * this.P.f28385c);
            this.J.start();
            this.f27722n = true;
        }
    }

    public final void d() {
        float f7;
        float f10;
        boolean z10 = this.f27723r;
        ll0 ll0Var = this.P;
        float f11 = 1.0f;
        il0 il0Var = this.f27718b;
        if (z10) {
            AndroidUtilities.cancelRunOnUIThread(this.G);
            il0 il0Var2 = this.f27717a;
            if (il0Var2.getImageReceiver().getLottieAnimation() != null && !il0Var2.getImageReceiver().getLottieAnimation().y()) {
                il0Var2.getImageReceiver().getLottieAnimation().stop();
                if (ll0Var.f28402j0) {
                    il0Var2.getImageReceiver().getLottieAnimation().N(0, false, true);
                } else {
                    il0Var2.getImageReceiver().getLottieAnimation().N(il0Var2.getImageReceiver().getLottieAnimation().f25732e[0] - 1, false, true);
                }
            }
            il0Var.setVisibility(4);
            il0Var2.setVisibility(0);
            this.v = false;
            float f12 = this.I;
            if (this.f27725w) {
                f10 = 0.76f;
            } else {
                f10 = 1.0f;
            }
            il0Var.setScaleY(f12 * f10);
            float f13 = this.I;
            if (this.f27725w) {
                f11 = 0.76f;
            }
            il0Var.setScaleX(f13 * f11);
        } else {
            il0Var.animate().cancel();
            if (ll0Var.N0) {
                float f14 = this.I;
                if (this.f27725w) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                il0Var.setScaleY(f14 * f7);
                float f15 = this.I;
                if (this.f27725w) {
                    f11 = 0.76f;
                }
                il0Var.setScaleX(f15 * f11);
            } else {
                il0Var.setScaleY(0.0f);
                il0Var.setScaleX(0.0f);
            }
        }
        this.f27722n = false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        int i10;
        ai.m4 m4Var;
        Paint paint;
        if (this.f27725w && this.f27726x) {
            float measuredWidth = getMeasuredWidth() >> 1;
            float measuredHeight = getMeasuredHeight() >> 1;
            float measuredWidth2 = (getMeasuredWidth() >> 1) - AndroidUtilities.dp(1.0f);
            zg.n0 n0Var = this.f27720e;
            ll0 ll0Var = this.P;
            if (n0Var != null && n0Var.f54657a) {
                paint = ll0Var.I0;
            } else {
                paint = ll0Var.H0;
            }
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth2, paint);
        }
        s5 s5Var = this.f27718b.f33138e;
        if (s5Var != null && (m4Var = s5Var.f30680k) != null) {
            int i11 = 0;
            if (this.f27727y == 0) {
                m4Var.setRoundRadius(AndroidUtilities.dp(6.0f), 0, 0, AndroidUtilities.dp(6.0f));
            } else {
                if (this.f27725w) {
                    i11 = AndroidUtilities.dp(6.0f);
                }
                m4Var.setRoundRadius(i11);
            }
        }
        zg.n0 n0Var2 = this.f27720e;
        if (n0Var2 != null && n0Var2.f54657a && this.F != null && LiteMode.isEnabled(8200) && LiteMode.isEnabled(131072)) {
            RectF rectF = AndroidUtilities.rectTmp;
            float height = ((int) (getHeight() * 0.7f)) / 2.0f;
            rectF.set((getWidth() / 2.0f) - height, (getHeight() / 2.0f) - height, (getWidth() / 2.0f) + height, (getHeight() / 2.0f) + height);
            dk0 lottieAnimation = this.f27717a.getImageReceiver().getLottieAnimation();
            yh.b8 b8Var = this.F;
            if (lottieAnimation != null && (i10 = lottieAnimation.f25726a0) > 30) {
                f7 = Utilities.clamp01((i10 - 30) / 30.0f);
            } else {
                f7 = 0.0f;
            }
            b8Var.f52359j = (int) (b8Var.f52353b.size() * f7);
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
        ll0 ll0Var = this.P;
        int i11 = ll0Var.M0;
        il0 il0Var = this.f27717a;
        il0 il0Var2 = this.f27718b;
        if (n0Var != null && n0Var.f54657a) {
            il0Var.getImageReceiver().setImageBitmap(new dk0(R.raw.star_reaction, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f)));
            il0Var2.getImageReceiver().setImageBitmap(getContext().getResources().getDrawable(R.drawable.star_reaction));
            if (this.F == null) {
                if (SharedConfig.getDevicePerformanceClass() == 2) {
                    i10 = 45;
                } else {
                    i10 = 18;
                }
                this.F = new yh.b8(1, i10);
            }
        } else if (i11 == 4 && n0Var != null && n0Var.f54661f != null) {
            il0Var.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(n0Var.f54661f));
            il0Var2.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(n0Var.f54661f));
        } else {
            zg.n0 n0Var2 = this.f27720e;
            if (n0Var2.f54658b) {
                TLRPC.Document effectDocument = MessagesController.getInstance(ll0Var.J).getEffectDocument(this.f27720e.f54662g);
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(effectDocument, org.telegram.ui.ActionBar.i6.f20966m6, 0.2f);
                ImageReceiver imageReceiver = il0Var2.getImageReceiver();
                ImageLocation forDocument = ImageLocation.getForDocument(effectDocument);
                if (this.f27723r) {
                    svgDrawable4 = null;
                } else {
                    svgDrawable4 = svgThumb;
                }
                imageReceiver.setImage(forDocument, "60_60_firstframe", null, null, svgDrawable4, 0L, "tgs", this.f27720e, 0);
            } else if (n0Var2.f54661f != null) {
                TLRPC.TL_availableReaction tL_availableReaction2 = MediaDataController.getInstance(ll0Var.J).getReactionsMap().get(this.f27720e.f54661f);
                if (tL_availableReaction2 != null) {
                    SvgHelper.SvgDrawable svgThumb2 = DocumentObject.getSvgThumb(tL_availableReaction2.activate_animation, org.telegram.ui.ActionBar.i6.f20966m6, 0.2f);
                    if (!LiteMode.isEnabled(8200) || i11 == 4) {
                        tL_availableReaction = tL_availableReaction2;
                        if (SharedConfig.getDevicePerformanceClass() > 0 && i11 != 4) {
                            il0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.appear_animation), "30_30_nolimit", null, null, svgThumb2, 0L, "tgs", n0Var, 0);
                            ImageReceiver imageReceiver2 = il0Var2.getImageReceiver();
                            ImageLocation forDocument2 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                            if (this.f27723r) {
                                svgDrawable2 = null;
                            } else {
                                svgDrawable2 = svgThumb2;
                            }
                            imageReceiver2.setImage(forDocument2, "60_60_firstframe", null, null, svgDrawable2, 0L, "tgs", this.f27720e, 0);
                        } else {
                            ImageReceiver imageReceiver3 = il0Var2.getImageReceiver();
                            ImageLocation forDocument3 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                            if (this.f27723r) {
                                svgDrawable = null;
                            } else {
                                svgDrawable = svgThumb2;
                            }
                            imageReceiver3.setImage(forDocument3, "60_60_firstframe", null, null, svgDrawable, 0L, "tgs", this.f27720e, 0);
                        }
                    } else {
                        tL_availableReaction = tL_availableReaction2;
                        il0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction2.appear_animation), "30_30_nolimit", null, null, svgThumb2, 0L, "tgs", n0Var, 0);
                        ImageReceiver imageReceiver4 = il0Var2.getImageReceiver();
                        ImageLocation forDocument4 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                        if (this.f27723r) {
                            svgDrawable3 = null;
                        } else {
                            svgDrawable3 = svgThumb2;
                        }
                        imageReceiver4.setImage(forDocument4, "60_60_pcache", null, null, svgDrawable3, 0L, "tgs", this.f27720e, 0);
                    }
                    if (il0Var.getImageReceiver().getLottieAnimation() != null) {
                        il0Var.getImageReceiver().getLottieAnimation().N(0, false, true);
                    }
                    this.f27719c.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, svgThumb2, 0L, "tgs", n0Var, 0);
                    ImageReceiver imageReceiver5 = this.d;
                    imageReceiver5.setAllowStartLottieAnimation(false);
                    MediaDataController.getInstance(ll0Var.J).preloadImage(imageReceiver5, ImageLocation.getForDocument(tL_availableReaction.around_animation), zg.j0.a());
                }
                rg.c1 c1Var = this.f27721f;
                if (c1Var != null) {
                    c1Var.setImageReceiver(il0Var2.getImageReceiver());
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
        boolean z11 = this.f27725w;
        boolean contains = this.P.f28388d0.contains(n0Var);
        this.f27725w = contains;
        if (contains != z11) {
            il0 il0Var = this.f27717a;
            il0 il0Var2 = this.f27718b;
            float f15 = 1.0f;
            if (!z10) {
                float f16 = this.I;
                if (contains) {
                    f12 = 0.76f;
                } else {
                    f12 = 1.0f;
                }
                il0Var2.setScaleX(f16 * f12);
                float f17 = this.I;
                if (this.f27725w) {
                    f13 = 0.76f;
                } else {
                    f13 = 1.0f;
                }
                il0Var2.setScaleY(f17 * f13);
                float f18 = this.I;
                if (this.f27725w) {
                    f14 = 0.76f;
                } else {
                    f14 = 1.0f;
                }
                il0Var.setScaleX(f18 * f14);
                float f19 = this.I;
                if (this.f27725w) {
                    f15 = 0.76f;
                }
                il0Var.setScaleY(f19 * f15);
            } else {
                ViewPropertyAnimator animate = il0Var2.animate();
                float f20 = this.I;
                if (this.f27725w) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f20 * f7);
                float f21 = this.I;
                if (this.f27725w) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator duration = scaleX.scaleY(f21 * f10).setDuration(240L);
                is isVar = is.h;
                duration.setInterpolator(isVar).start();
                ViewPropertyAnimator animate2 = il0Var.animate();
                float f22 = this.I;
                if (this.f27725w) {
                    f11 = 0.76f;
                } else {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator scaleX2 = animate2.scaleX(f22 * f11);
                float f23 = this.I;
                if (this.f27725w) {
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
        zg.n0 n0Var = this.f27720e;
        if (n0Var != null) {
            String str = n0Var.f54661f;
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
        kl0 kl0Var;
        if (this.O) {
            ll0 ll0Var = this.P;
            if (ll0Var.Q == null) {
                int action = motionEvent.getAction();
                gl0 gl0Var = this.K;
                if (action == 0) {
                    this.N = true;
                    this.L = motionEvent.getX();
                    this.M = motionEvent.getY();
                    if (this.h == 1.0f && !this.H && (i10 = ll0Var.M0) != 3 && i10 != 4 && i10 != 5 && ((kl0Var = ll0Var.f28396g0) == null || kl0Var.o())) {
                        AndroidUtilities.runOnUIThread(gl0Var, ViewConfiguration.getLongPressTimeout());
                    }
                }
                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 2.0f;
                if ((motionEvent.getAction() != 2 || (Math.abs(this.L - motionEvent.getX()) <= scaledTouchSlop && Math.abs(this.M - motionEvent.getY()) <= scaledTouchSlop)) && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return true;
                }
                if (motionEvent.getAction() == 1 && this.N && ((ll0Var.f28405l0 == null || ll0Var.f28407n0 > 0.8f) && ll0Var.f28396g0 != null)) {
                    ll0Var.f28412r0 = true;
                    if (System.currentTimeMillis() - ll0Var.f28414s0 > 300) {
                        ll0Var.f28414s0 = System.currentTimeMillis();
                        kl0 kl0Var2 = ll0Var.f28396g0;
                        zg.n0 n0Var = this.f27720e;
                        if (ll0Var.f28407n0 > 0.8f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        kl0Var2.m(this, n0Var, z10, false);
                    }
                }
                if (!ll0Var.f28412r0 && ll0Var.f28405l0 != null) {
                    ll0Var.f28408o0 = 0.0f;
                    float f7 = ll0Var.f28407n0;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ll0Var.Q = ofFloat;
                    ofFloat.addUpdateListener(new zk0(ll0Var, f7));
                    ll0Var.Q.addListener(new ci.t5(ll0Var, 2));
                    ll0Var.Q.setDuration(150L);
                    ll0Var.Q.setInterpolator(is.f27443f);
                    ll0Var.Q.start();
                }
                AndroidUtilities.cancelRunOnUIThread(gl0Var);
                this.N = false;
                return true;
            }
        }
        return false;
    }
}
