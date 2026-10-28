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
public final class el0 extends FrameLayout {
    public boolean E;
    public bi.td F;
    public final bl0 G;
    public boolean H;
    public float I;
    public ValueAnimator J;
    public final bl0 K;
    public float L;
    public float M;
    public boolean N;
    public boolean O;
    public final gl0 P;
    public final dl0 f27876a;
    public final dl0 f27877b;
    public final dl0 f27878c;
    public final ImageReceiver d;
    public bh.x0 e;
    public tg.c1 f27879f;
    public float h;
    public boolean f27880n;
    public boolean f27881r;
    public boolean f27882s;
    public boolean v;
    public boolean f27883w;
    public boolean f27884x;
    public int f27885y;

    public el0(gl0 gl0Var, Context context) {
        super(context);
        this.P = gl0Var;
        this.d = new ImageReceiver();
        this.h = 1.0f;
        this.f27884x = true;
        this.G = new bl0(this, 0);
        this.I = 1.0f;
        this.K = new bl0(this, 1);
        this.O = true;
        dl0 dl0Var = new dl0(this, context, 0);
        this.f27876a = dl0Var;
        dl0 dl0Var2 = new dl0(this, context, 1);
        this.f27877b = dl0Var2;
        dl0Var.getImageReceiver().setAutoRepeat(0);
        dl0Var.getImageReceiver().setAllowStartLottieAnimation(false);
        dl0 dl0Var3 = new dl0(this, context, 2);
        this.f27878c = dl0Var3;
        addView(dl0Var, kb1.i(34, 34, 17));
        addView(dl0Var3, kb1.i(34, 34, 17));
        addView(dl0Var2, kb1.i(34, 34, 17));
        if (gl0Var.M0 == 4) {
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setDuration(100L);
            layoutTransition.enableTransitionType(4);
            setLayoutTransition(layoutTransition);
        }
        dl0Var.setLayerNum(Integer.MAX_VALUE);
        dl0Var2.setLayerNum(Integer.MAX_VALUE);
        dl0Var2.f35004a.setAutoRepeat(0);
        dl0Var2.f35004a.setAllowStartAnimation(false);
        dl0Var2.f35004a.setAllowStartLottieAnimation(false);
        dl0Var3.setLayerNum(Integer.MAX_VALUE);
    }

    public static void a(el0 el0Var, bh.x0 x0Var, int i10) {
        boolean z10;
        boolean z11;
        int i11;
        dl0 dl0Var = el0Var.f27878c;
        dl0 dl0Var2 = el0Var.f27876a;
        dl0 dl0Var3 = el0Var.f27877b;
        gl0 gl0Var = el0Var.P;
        el0Var.f(x0Var, false);
        bh.x0 x0Var2 = el0Var.e;
        if (x0Var2 != null && x0Var2.equals(x0Var)) {
            el0Var.f27885y = i10;
            el0Var.e(x0Var);
            return;
        }
        int i12 = gl0Var.J;
        org.telegram.ui.ActionBar.u6 u6Var = gl0Var.f28630k0;
        int i13 = gl0Var.M0;
        boolean isPremium = UserConfig.getInstance(i12).isPremium();
        if ((i13 == 3 && !isPremium) || (i13 == 5 && x0Var.d && !isPremium)) {
            z10 = true;
        } else {
            z10 = false;
        }
        el0Var.H = z10;
        if (z10 && el0Var.f27879f == null) {
            tg.c1 c1Var = new tg.c1(el0Var.getContext(), 1, null);
            el0Var.f27879f = c1Var;
            c1Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            el0Var.f27879f.setImageReceiver(dl0Var3.getImageReceiver());
            el0Var.addView(el0Var.f27879f, kb1.h(18, 18.0f, 17, 8.0f, 8.0f, 0.0f, 0.0f));
        }
        tg.c1 c1Var2 = el0Var.f27879f;
        if (c1Var2 != null) {
            if (el0Var.H) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            c1Var2.setVisibility(i11);
        }
        el0Var.d();
        el0Var.e = x0Var;
        if (!x0Var.f4205a && (x0Var.f4208f == null || ((!gl0Var.q() && !gl0Var.G0) || !LiteMode.isEnabled(8200)))) {
            z11 = false;
        } else {
            z11 = true;
        }
        el0Var.f27881r = z11;
        if (i13 == 4 || el0Var.e.f4206b) {
            el0Var.f27881r = false;
        }
        bh.x0 x0Var3 = el0Var.e;
        if (!x0Var3.f4205a && x0Var3.f4208f == null) {
            dl0Var.getImageReceiver().clearImage();
            dl0Var3.getImageReceiver().clearImage();
            t5 t5Var = new t5(4, gl0Var.J, el0Var.e.f4209g);
            t5 t5Var2 = new t5(3, gl0Var.J, el0Var.e.f4209g);
            if (i13 != 1 && i13 != 2 && i13 != 4) {
                int i14 = org.telegram.ui.ActionBar.y6.f23693v6;
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                org.telegram.ui.ActionBar.f7.y(el0Var, t5Var, i14, u6Var, mode);
                org.telegram.ui.ActionBar.f7.y(el0Var, t5Var2, i14, u6Var, mode);
            } else {
                PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
                t5Var.setColorFilter(new PorterDuffColorFilter(-1, mode2));
                t5Var2.setColorFilter(new PorterDuffColorFilter(-1, mode2));
            }
            dl0Var.setAnimatedEmojiDrawable(t5Var);
            dl0Var3.setAnimatedEmojiDrawable(t5Var2);
            tg.c1 c1Var3 = el0Var.f27879f;
            if (c1Var3 != null) {
                c1Var3.setAnimatedEmojiDrawable(t5Var2);
            }
        } else {
            el0Var.e(x0Var);
            dl0Var.setAnimatedEmojiDrawable(null);
            if (dl0Var2.getImageReceiver().getLottieAnimation() != null) {
                dl0Var2.getImageReceiver().getLottieAnimation().N(0, false, false);
            }
            tg.c1 c1Var4 = el0Var.f27879f;
            if (c1Var4 != null) {
                c1Var4.setAnimatedEmojiDrawable(null);
            }
        }
        el0Var.setFocusable(true);
        boolean z12 = el0Var.f27881r;
        el0Var.f27882s = z12;
        if (!z12) {
            dl0Var2.setVisibility(8);
            dl0Var3.setVisibility(0);
            el0Var.v = true;
        } else {
            el0Var.v = false;
            dl0Var2.setVisibility(0);
            dl0Var3.setVisibility(8);
        }
        ViewGroup.LayoutParams layoutParams = dl0Var3.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = dl0Var3.getLayoutParams();
        int dp = AndroidUtilities.dp(34.0f);
        layoutParams2.height = dp;
        layoutParams.width = dp;
        ViewGroup.LayoutParams layoutParams3 = dl0Var2.getLayoutParams();
        ViewGroup.LayoutParams layoutParams4 = dl0Var2.getLayoutParams();
        int dp2 = AndroidUtilities.dp(34.0f);
        layoutParams4.height = dp2;
        layoutParams3.width = dp2;
    }

    public final void b() {
        ImageReceiver imageReceiver;
        dl0 dl0Var = this.f27877b;
        t5 t5Var = dl0Var.e;
        if (t5Var != null) {
            imageReceiver = t5Var.f32860k;
        } else {
            imageReceiver = dl0Var.f35004a;
        }
        if (imageReceiver != null && imageReceiver.getLottieAnimation() != null) {
            gl0 gl0Var = this.P;
            if (gl0Var.f28648x0 == null && !this.N && gl0Var.G0) {
                if (imageReceiver.getLottieAnimation().f35067a0 <= 2) {
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
        if (!this.P.f28628j0) {
            d();
            this.f27880n = true;
            if (!this.f27881r) {
                this.f27877b.setVisibility(0);
                dl0 dl0Var = this.f27877b;
                float f12 = this.I;
                if (this.f27883w) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                dl0Var.setScaleY(f12 * f10);
                dl0 dl0Var2 = this.f27877b;
                float f13 = this.I;
                if (!this.f27883w) {
                    f11 = 1.0f;
                }
                dl0Var2.setScaleX(f13 * f11);
                return;
            }
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.G);
        if (this.f27881r) {
            if (this.f27876a.getImageReceiver().getLottieAnimation() != null && !this.f27876a.getImageReceiver().getLottieAnimation().y() && !this.f27880n) {
                this.f27880n = true;
                if (i10 == 0) {
                    this.E = false;
                    this.f27876a.getImageReceiver().getLottieAnimation().stop();
                    this.f27876a.getImageReceiver().getLottieAnimation().N(0, false, false);
                    this.G.run();
                    return;
                }
                this.E = true;
                this.f27876a.getImageReceiver().getLottieAnimation().stop();
                this.f27876a.getImageReceiver().getLottieAnimation().N(0, false, false);
                AndroidUtilities.runOnUIThread(this.G, i10);
                return;
            }
            if (this.f27876a.getImageReceiver().getLottieAnimation() != null && this.f27880n && !this.f27876a.getImageReceiver().getLottieAnimation().f35080k0 && !this.f27876a.getImageReceiver().getLottieAnimation().y()) {
                this.f27876a.getImageReceiver().getLottieAnimation().N(this.f27876a.getImageReceiver().getLottieAnimation().e[0] - 1, false, false);
            }
            dl0 dl0Var3 = this.f27877b;
            float f14 = this.I;
            if (this.f27883w) {
                f7 = 0.76f;
            } else {
                f7 = 1.0f;
            }
            dl0Var3.setScaleY(f14 * f7);
            dl0 dl0Var4 = this.f27877b;
            float f15 = this.I;
            if (!this.f27883w) {
                f11 = 1.0f;
            }
            dl0Var4.setScaleX(f15 * f11);
        } else if (!this.f27880n) {
            this.I = 0.0f;
            this.f27877b.setScaleX(0.0f);
            this.f27877b.setScaleY(0.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.J = ofFloat;
            ofFloat.addUpdateListener(new f80(this, 10));
            this.J.setDuration(150L);
            this.J.setInterpolator(ds.h);
            this.J.setStartDelay(i10 * this.P.f28612c);
            this.J.start();
            this.f27880n = true;
        }
    }

    public final void d() {
        float f7;
        float f10;
        boolean z10 = this.f27881r;
        gl0 gl0Var = this.P;
        float f11 = 1.0f;
        dl0 dl0Var = this.f27877b;
        if (z10) {
            AndroidUtilities.cancelRunOnUIThread(this.G);
            dl0 dl0Var2 = this.f27876a;
            if (dl0Var2.getImageReceiver().getLottieAnimation() != null && !dl0Var2.getImageReceiver().getLottieAnimation().y()) {
                dl0Var2.getImageReceiver().getLottieAnimation().stop();
                if (gl0Var.f28628j0) {
                    dl0Var2.getImageReceiver().getLottieAnimation().N(0, false, true);
                } else {
                    dl0Var2.getImageReceiver().getLottieAnimation().N(dl0Var2.getImageReceiver().getLottieAnimation().e[0] - 1, false, true);
                }
            }
            dl0Var.setVisibility(4);
            dl0Var2.setVisibility(0);
            this.v = false;
            float f12 = this.I;
            if (this.f27883w) {
                f10 = 0.76f;
            } else {
                f10 = 1.0f;
            }
            dl0Var.setScaleY(f12 * f10);
            float f13 = this.I;
            if (this.f27883w) {
                f11 = 0.76f;
            }
            dl0Var.setScaleX(f13 * f11);
        } else {
            dl0Var.animate().cancel();
            if (gl0Var.N0) {
                float f14 = this.I;
                if (this.f27883w) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                dl0Var.setScaleY(f14 * f7);
                float f15 = this.I;
                if (this.f27883w) {
                    f11 = 0.76f;
                }
                dl0Var.setScaleX(f15 * f11);
            } else {
                dl0Var.setScaleY(0.0f);
                dl0Var.setScaleX(0.0f);
            }
        }
        this.f27880n = false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        int i10;
        di.f3 f3Var;
        Paint paint;
        if (this.f27883w && this.f27884x) {
            float measuredWidth = getMeasuredWidth() >> 1;
            float measuredHeight = getMeasuredHeight() >> 1;
            float measuredWidth2 = (getMeasuredWidth() >> 1) - AndroidUtilities.dp(1.0f);
            bh.x0 x0Var = this.e;
            gl0 gl0Var = this.P;
            if (x0Var != null && x0Var.f4205a) {
                paint = gl0Var.I0;
            } else {
                paint = gl0Var.H0;
            }
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth2, paint);
        }
        t5 t5Var = this.f27877b.e;
        if (t5Var != null && (f3Var = t5Var.f32860k) != null) {
            int i11 = 0;
            if (this.f27885y == 0) {
                f3Var.setRoundRadius(AndroidUtilities.dp(6.0f), 0, 0, AndroidUtilities.dp(6.0f));
            } else {
                if (this.f27883w) {
                    i11 = AndroidUtilities.dp(6.0f);
                }
                f3Var.setRoundRadius(i11);
            }
        }
        bh.x0 x0Var2 = this.e;
        if (x0Var2 != null && x0Var2.f4205a && this.F != null && LiteMode.isEnabled(8200) && LiteMode.isEnabled(131072)) {
            RectF rectF = AndroidUtilities.rectTmp;
            float height = ((int) (getHeight() * 0.7f)) / 2.0f;
            rectF.set((getWidth() / 2.0f) - height, (getHeight() / 2.0f) - height, (getWidth() / 2.0f) + height, (getHeight() / 2.0f) + height);
            yj0 lottieAnimation = this.f27876a.getImageReceiver().getLottieAnimation();
            bi.td tdVar = this.F;
            if (lottieAnimation != null && (i10 = lottieAnimation.f35067a0) > 30) {
                f7 = Utilities.clamp01((i10 - 30) / 30.0f);
            } else {
                f7 = 0.0f;
            }
            tdVar.f5495j = (int) (tdVar.f5490b.size() * f7);
            this.F.g(rectF);
            this.F.d();
            this.F.a(canvas, -673522);
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void e(bh.x0 x0Var) {
        TLRPC.TL_availableReaction tL_availableReaction;
        SvgHelper.SvgDrawable svgDrawable;
        SvgHelper.SvgDrawable svgDrawable2;
        SvgHelper.SvgDrawable svgDrawable3;
        SvgHelper.SvgDrawable svgDrawable4;
        int i10;
        gl0 gl0Var = this.P;
        int i11 = gl0Var.M0;
        dl0 dl0Var = this.f27876a;
        dl0 dl0Var2 = this.f27877b;
        if (x0Var != null && x0Var.f4205a) {
            dl0Var.getImageReceiver().setImageBitmap(new yj0(R.raw.star_reaction, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f)));
            dl0Var2.getImageReceiver().setImageBitmap(getContext().getResources().getDrawable(R.drawable.star_reaction));
            if (this.F == null) {
                if (SharedConfig.getDevicePerformanceClass() == 2) {
                    i10 = 45;
                } else {
                    i10 = 18;
                }
                this.F = new bi.td(1, i10);
            }
        } else if (i11 == 4 && x0Var != null && x0Var.f4208f != null) {
            dl0Var.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(x0Var.f4208f));
            dl0Var2.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(x0Var.f4208f));
        } else {
            bh.x0 x0Var2 = this.e;
            if (x0Var2.f4206b) {
                TLRPC.Document effectDocument = MessagesController.getInstance(gl0Var.J).getEffectDocument(this.e.f4209g);
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(effectDocument, org.telegram.ui.ActionBar.y6.f23521m6, 0.2f);
                ImageReceiver imageReceiver = dl0Var2.getImageReceiver();
                ImageLocation forDocument = ImageLocation.getForDocument(effectDocument);
                if (this.f27881r) {
                    svgDrawable4 = null;
                } else {
                    svgDrawable4 = svgThumb;
                }
                imageReceiver.setImage(forDocument, "60_60_firstframe", null, null, svgDrawable4, 0L, "tgs", this.e, 0);
            } else if (x0Var2.f4208f != null) {
                TLRPC.TL_availableReaction tL_availableReaction2 = MediaDataController.getInstance(gl0Var.J).getReactionsMap().get(this.e.f4208f);
                if (tL_availableReaction2 != null) {
                    SvgHelper.SvgDrawable svgThumb2 = DocumentObject.getSvgThumb(tL_availableReaction2.activate_animation, org.telegram.ui.ActionBar.y6.f23521m6, 0.2f);
                    if (!LiteMode.isEnabled(8200) || i11 == 4) {
                        tL_availableReaction = tL_availableReaction2;
                        if (SharedConfig.getDevicePerformanceClass() > 0 && i11 != 4) {
                            dl0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.appear_animation), "30_30_nolimit", null, null, svgThumb2, 0L, "tgs", x0Var, 0);
                            ImageReceiver imageReceiver2 = dl0Var2.getImageReceiver();
                            ImageLocation forDocument2 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                            if (this.f27881r) {
                                svgDrawable2 = null;
                            } else {
                                svgDrawable2 = svgThumb2;
                            }
                            imageReceiver2.setImage(forDocument2, "60_60_firstframe", null, null, svgDrawable2, 0L, "tgs", this.e, 0);
                        } else {
                            ImageReceiver imageReceiver3 = dl0Var2.getImageReceiver();
                            ImageLocation forDocument3 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                            if (this.f27881r) {
                                svgDrawable = null;
                            } else {
                                svgDrawable = svgThumb2;
                            }
                            imageReceiver3.setImage(forDocument3, "60_60_firstframe", null, null, svgDrawable, 0L, "tgs", this.e, 0);
                        }
                    } else {
                        tL_availableReaction = tL_availableReaction2;
                        dl0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction2.appear_animation), "30_30_nolimit", null, null, svgThumb2, 0L, "tgs", x0Var, 0);
                        ImageReceiver imageReceiver4 = dl0Var2.getImageReceiver();
                        ImageLocation forDocument4 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                        if (this.f27881r) {
                            svgDrawable3 = null;
                        } else {
                            svgDrawable3 = svgThumb2;
                        }
                        imageReceiver4.setImage(forDocument4, "60_60_pcache", null, null, svgDrawable3, 0L, "tgs", this.e, 0);
                    }
                    if (dl0Var.getImageReceiver().getLottieAnimation() != null) {
                        dl0Var.getImageReceiver().getLottieAnimation().N(0, false, true);
                    }
                    this.f27878c.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, svgThumb2, 0L, "tgs", x0Var, 0);
                    ImageReceiver imageReceiver5 = this.d;
                    imageReceiver5.setAllowStartLottieAnimation(false);
                    MediaDataController.getInstance(gl0Var.J).preloadImage(imageReceiver5, ImageLocation.getForDocument(tL_availableReaction.around_animation), bh.s0.a());
                }
                tg.c1 c1Var = this.f27879f;
                if (c1Var != null) {
                    c1Var.setImageReceiver(dl0Var2.getImageReceiver());
                }
            }
        }
    }

    public final void f(bh.x0 x0Var, boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        boolean z11 = this.f27883w;
        boolean contains = this.P.f28615d0.contains(x0Var);
        this.f27883w = contains;
        if (contains != z11) {
            dl0 dl0Var = this.f27876a;
            dl0 dl0Var2 = this.f27877b;
            float f15 = 1.0f;
            if (!z10) {
                float f16 = this.I;
                if (contains) {
                    f12 = 0.76f;
                } else {
                    f12 = 1.0f;
                }
                dl0Var2.setScaleX(f16 * f12);
                float f17 = this.I;
                if (this.f27883w) {
                    f13 = 0.76f;
                } else {
                    f13 = 1.0f;
                }
                dl0Var2.setScaleY(f17 * f13);
                float f18 = this.I;
                if (this.f27883w) {
                    f14 = 0.76f;
                } else {
                    f14 = 1.0f;
                }
                dl0Var.setScaleX(f18 * f14);
                float f19 = this.I;
                if (this.f27883w) {
                    f15 = 0.76f;
                }
                dl0Var.setScaleY(f19 * f15);
            } else {
                ViewPropertyAnimator animate = dl0Var2.animate();
                float f20 = this.I;
                if (this.f27883w) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f20 * f7);
                float f21 = this.I;
                if (this.f27883w) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator duration = scaleX.scaleY(f21 * f10).setDuration(240L);
                ds dsVar = ds.h;
                duration.setInterpolator(dsVar).start();
                ViewPropertyAnimator animate2 = dl0Var.animate();
                float f22 = this.I;
                if (this.f27883w) {
                    f11 = 0.76f;
                } else {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator scaleX2 = animate2.scaleX(f22 * f11);
                float f23 = this.I;
                if (this.f27883w) {
                    f15 = 0.76f;
                }
                scaleX2.scaleY(f23 * f15).setDuration(240L).setInterpolator(dsVar).start();
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
        bh.x0 x0Var = this.e;
        if (x0Var != null) {
            String str = x0Var.f4208f;
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
        fl0 fl0Var;
        if (this.O) {
            gl0 gl0Var = this.P;
            if (gl0Var.Q == null) {
                int action = motionEvent.getAction();
                bl0 bl0Var = this.K;
                if (action == 0) {
                    this.N = true;
                    this.L = motionEvent.getX();
                    this.M = motionEvent.getY();
                    if (this.h == 1.0f && !this.H && (i10 = gl0Var.M0) != 3 && i10 != 4 && i10 != 5 && ((fl0Var = gl0Var.f28622g0) == null || fl0Var.f())) {
                        AndroidUtilities.runOnUIThread(bl0Var, ViewConfiguration.getLongPressTimeout());
                    }
                }
                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 2.0f;
                if ((motionEvent.getAction() != 2 || (Math.abs(this.L - motionEvent.getX()) <= scaledTouchSlop && Math.abs(this.M - motionEvent.getY()) <= scaledTouchSlop)) && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return true;
                }
                if (motionEvent.getAction() == 1 && this.N && ((gl0Var.f28632l0 == null || gl0Var.f28634n0 > 0.8f) && gl0Var.f28622g0 != null)) {
                    gl0Var.f28639r0 = true;
                    if (System.currentTimeMillis() - gl0Var.f28641s0 > 300) {
                        gl0Var.f28641s0 = System.currentTimeMillis();
                        fl0 fl0Var2 = gl0Var.f28622g0;
                        bh.x0 x0Var = this.e;
                        if (gl0Var.f28634n0 > 0.8f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        fl0Var2.p(this, x0Var, z10, false);
                    }
                }
                if (!gl0Var.f28639r0 && gl0Var.f28632l0 != null) {
                    gl0Var.f28635o0 = 0.0f;
                    float f7 = gl0Var.f28634n0;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    gl0Var.Q = ofFloat;
                    ofFloat.addUpdateListener(new uk0(gl0Var, f7));
                    gl0Var.Q.addListener(new fi.j5(gl0Var, 2));
                    gl0Var.Q.setDuration(150L);
                    gl0Var.Q.setInterpolator(ds.f27530f);
                    gl0Var.Q.start();
                }
                AndroidUtilities.cancelRunOnUIThread(bl0Var);
                this.N = false;
                return true;
            }
        }
        return false;
    }
}
