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
    public zh.b8 F;
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
    public final dl0 f24416a;
    public final dl0 f24417b;
    public final dl0 f24418c;
    public final ImageReceiver d;
    public ah.i1 e;
    public sg.c1 f24419f;
    public float h;
    public boolean f24420n;
    public boolean f24421r;
    public boolean f24422s;
    public boolean v;
    public boolean f24423w;
    public boolean f24424x;
    public int f24425y;

    public el0(gl0 gl0Var, Context context) {
        super(context);
        this.P = gl0Var;
        this.d = new ImageReceiver();
        this.h = 1.0f;
        this.f24424x = true;
        this.G = new bl0(this, 0);
        this.I = 1.0f;
        this.K = new bl0(this, 1);
        this.O = true;
        dl0 dl0Var = new dl0(this, context, 0);
        this.f24416a = dl0Var;
        dl0 dl0Var2 = new dl0(this, context, 1);
        this.f24417b = dl0Var2;
        dl0Var.getImageReceiver().setAutoRepeat(0);
        dl0Var.getImageReceiver().setAllowStartLottieAnimation(false);
        dl0 dl0Var3 = new dl0(this, context, 2);
        this.f24418c = dl0Var3;
        addView(dl0Var, w7.z5.e(34, 34, 17));
        addView(dl0Var3, w7.z5.e(34, 34, 17));
        addView(dl0Var2, w7.z5.e(34, 34, 17));
        if (gl0Var.M0 == 4) {
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setDuration(100L);
            layoutTransition.enableTransitionType(4);
            setLayoutTransition(layoutTransition);
        }
        dl0Var.setLayerNum(Integer.MAX_VALUE);
        dl0Var2.setLayerNum(Integer.MAX_VALUE);
        dl0Var2.f31507a.setAutoRepeat(0);
        dl0Var2.f31507a.setAllowStartAnimation(false);
        dl0Var2.f31507a.setAllowStartLottieAnimation(false);
        dl0Var3.setLayerNum(Integer.MAX_VALUE);
    }

    public static void a(el0 el0Var, ah.i1 i1Var, int i10) {
        boolean z10;
        boolean z11;
        int i11;
        dl0 dl0Var = el0Var.f24418c;
        dl0 dl0Var2 = el0Var.f24416a;
        dl0 dl0Var3 = el0Var.f24417b;
        gl0 gl0Var = el0Var.P;
        el0Var.f(i1Var, false);
        ah.i1 i1Var2 = el0Var.e;
        if (i1Var2 != null && i1Var2.equals(i1Var)) {
            el0Var.f24425y = i10;
            el0Var.e(i1Var);
            return;
        }
        int i12 = gl0Var.J;
        org.telegram.ui.ActionBar.c6 c6Var = gl0Var.f25030k0;
        int i13 = gl0Var.M0;
        boolean isPremium = UserConfig.getInstance(i12).isPremium();
        if ((i13 == 3 && !isPremium) || (i13 == 5 && i1Var.d && !isPremium)) {
            z10 = true;
        } else {
            z10 = false;
        }
        el0Var.H = z10;
        if (z10 && el0Var.f24419f == null) {
            sg.c1 c1Var = new sg.c1(el0Var.getContext(), 1, null);
            el0Var.f24419f = c1Var;
            c1Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            el0Var.f24419f.setImageReceiver(dl0Var3.getImageReceiver());
            el0Var.addView(el0Var.f24419f, w7.z5.a(18.0f, 8.0f, 8.0f, 0.0f, 0.0f, 18, 17));
        }
        sg.c1 c1Var2 = el0Var.f24419f;
        if (c1Var2 != null) {
            if (el0Var.H) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            c1Var2.setVisibility(i11);
        }
        el0Var.d();
        el0Var.e = i1Var;
        if (!i1Var.f780a && (i1Var.f783f == null || ((!gl0Var.q() && !gl0Var.G0) || !LiteMode.isEnabled(8200)))) {
            z11 = false;
        } else {
            z11 = true;
        }
        el0Var.f24421r = z11;
        if (i13 == 4 || el0Var.e.f781b) {
            el0Var.f24421r = false;
        }
        ah.i1 i1Var3 = el0Var.e;
        if (!i1Var3.f780a && i1Var3.f783f == null) {
            dl0Var.getImageReceiver().clearImage();
            dl0Var3.getImageReceiver().clearImage();
            s5 s5Var = new s5(4, gl0Var.J, el0Var.e.f784g);
            s5 s5Var2 = new s5(3, gl0Var.J, el0Var.e.f784g);
            if (i13 != 1 && i13 != 2 && i13 != 4) {
                int i14 = org.telegram.ui.ActionBar.g6.f19933v6;
                int w02 = org.telegram.ui.ActionBar.g6.w0(i14, c6Var);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                s5Var.setColorFilter(new PorterDuffColorFilter(w02, mode));
                s5Var2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(i14, c6Var), mode));
            } else {
                PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
                s5Var.setColorFilter(new PorterDuffColorFilter(-1, mode2));
                s5Var2.setColorFilter(new PorterDuffColorFilter(-1, mode2));
            }
            dl0Var.setAnimatedEmojiDrawable(s5Var);
            dl0Var3.setAnimatedEmojiDrawable(s5Var2);
            sg.c1 c1Var3 = el0Var.f24419f;
            if (c1Var3 != null) {
                c1Var3.setAnimatedEmojiDrawable(s5Var2);
            }
        } else {
            el0Var.e(i1Var);
            dl0Var.setAnimatedEmojiDrawable(null);
            if (dl0Var2.getImageReceiver().getLottieAnimation() != null) {
                dl0Var2.getImageReceiver().getLottieAnimation().N(0, false, false);
            }
            sg.c1 c1Var4 = el0Var.f24419f;
            if (c1Var4 != null) {
                c1Var4.setAnimatedEmojiDrawable(null);
            }
        }
        el0Var.setFocusable(true);
        boolean z12 = el0Var.f24421r;
        el0Var.f24422s = z12;
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
        dl0 dl0Var = this.f24417b;
        s5 s5Var = dl0Var.e;
        if (s5Var != null) {
            imageReceiver = s5Var.f28739k;
        } else {
            imageReceiver = dl0Var.f31507a;
        }
        if (imageReceiver != null && imageReceiver.getLottieAnimation() != null) {
            gl0 gl0Var = this.P;
            if (gl0Var.f25047x0 == null && !this.N && gl0Var.G0) {
                if (imageReceiver.getLottieAnimation().f31285a0 <= 2) {
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
        if (!this.P.f25028j0) {
            d();
            this.f24420n = true;
            if (!this.f24421r) {
                this.f24417b.setVisibility(0);
                dl0 dl0Var = this.f24417b;
                float f12 = this.I;
                if (this.f24423w) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                dl0Var.setScaleY(f12 * f10);
                dl0 dl0Var2 = this.f24417b;
                float f13 = this.I;
                if (!this.f24423w) {
                    f11 = 1.0f;
                }
                dl0Var2.setScaleX(f13 * f11);
                return;
            }
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.G);
        if (this.f24421r) {
            if (this.f24416a.getImageReceiver().getLottieAnimation() != null && !this.f24416a.getImageReceiver().getLottieAnimation().y() && !this.f24420n) {
                this.f24420n = true;
                if (i10 == 0) {
                    this.E = false;
                    this.f24416a.getImageReceiver().getLottieAnimation().stop();
                    this.f24416a.getImageReceiver().getLottieAnimation().N(0, false, false);
                    this.G.run();
                    return;
                }
                this.E = true;
                this.f24416a.getImageReceiver().getLottieAnimation().stop();
                this.f24416a.getImageReceiver().getLottieAnimation().N(0, false, false);
                AndroidUtilities.runOnUIThread(this.G, i10);
                return;
            }
            if (this.f24416a.getImageReceiver().getLottieAnimation() != null && this.f24420n && !this.f24416a.getImageReceiver().getLottieAnimation().f31298k0 && !this.f24416a.getImageReceiver().getLottieAnimation().y()) {
                this.f24416a.getImageReceiver().getLottieAnimation().N(this.f24416a.getImageReceiver().getLottieAnimation().e[0] - 1, false, false);
            }
            dl0 dl0Var3 = this.f24417b;
            float f14 = this.I;
            if (this.f24423w) {
                f7 = 0.76f;
            } else {
                f7 = 1.0f;
            }
            dl0Var3.setScaleY(f14 * f7);
            dl0 dl0Var4 = this.f24417b;
            float f15 = this.I;
            if (!this.f24423w) {
                f11 = 1.0f;
            }
            dl0Var4.setScaleX(f15 * f11);
        } else if (!this.f24420n) {
            this.I = 0.0f;
            this.f24417b.setScaleX(0.0f);
            this.f24417b.setScaleY(0.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.J = ofFloat;
            ofFloat.addUpdateListener(new f80(this, 10));
            this.J.setDuration(150L);
            this.J.setInterpolator(es.h);
            this.J.setStartDelay(i10 * this.P.f25012c);
            this.J.start();
            this.f24420n = true;
        }
    }

    public final void d() {
        float f7;
        float f10;
        boolean z10 = this.f24421r;
        gl0 gl0Var = this.P;
        float f11 = 1.0f;
        dl0 dl0Var = this.f24417b;
        if (z10) {
            AndroidUtilities.cancelRunOnUIThread(this.G);
            dl0 dl0Var2 = this.f24416a;
            if (dl0Var2.getImageReceiver().getLottieAnimation() != null && !dl0Var2.getImageReceiver().getLottieAnimation().y()) {
                dl0Var2.getImageReceiver().getLottieAnimation().stop();
                if (gl0Var.f25028j0) {
                    dl0Var2.getImageReceiver().getLottieAnimation().N(0, false, true);
                } else {
                    dl0Var2.getImageReceiver().getLottieAnimation().N(dl0Var2.getImageReceiver().getLottieAnimation().e[0] - 1, false, true);
                }
            }
            dl0Var.setVisibility(4);
            dl0Var2.setVisibility(0);
            this.v = false;
            float f12 = this.I;
            if (this.f24423w) {
                f10 = 0.76f;
            } else {
                f10 = 1.0f;
            }
            dl0Var.setScaleY(f12 * f10);
            float f13 = this.I;
            if (this.f24423w) {
                f11 = 0.76f;
            }
            dl0Var.setScaleX(f13 * f11);
        } else {
            dl0Var.animate().cancel();
            if (gl0Var.N0) {
                float f14 = this.I;
                if (this.f24423w) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                dl0Var.setScaleY(f14 * f7);
                float f15 = this.I;
                if (this.f24423w) {
                    f11 = 0.76f;
                }
                dl0Var.setScaleX(f15 * f11);
            } else {
                dl0Var.setScaleY(0.0f);
                dl0Var.setScaleX(0.0f);
            }
        }
        this.f24420n = false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        int i10;
        bi.b4 b4Var;
        Paint paint;
        if (this.f24423w && this.f24424x) {
            float measuredWidth = getMeasuredWidth() >> 1;
            float measuredHeight = getMeasuredHeight() >> 1;
            float measuredWidth2 = (getMeasuredWidth() >> 1) - AndroidUtilities.dp(1.0f);
            ah.i1 i1Var = this.e;
            gl0 gl0Var = this.P;
            if (i1Var != null && i1Var.f780a) {
                paint = gl0Var.I0;
            } else {
                paint = gl0Var.H0;
            }
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth2, paint);
        }
        s5 s5Var = this.f24417b.e;
        if (s5Var != null && (b4Var = s5Var.f28739k) != null) {
            int i11 = 0;
            if (this.f24425y == 0) {
                b4Var.setRoundRadius(AndroidUtilities.dp(6.0f), 0, 0, AndroidUtilities.dp(6.0f));
            } else {
                if (this.f24423w) {
                    i11 = AndroidUtilities.dp(6.0f);
                }
                b4Var.setRoundRadius(i11);
            }
        }
        ah.i1 i1Var2 = this.e;
        if (i1Var2 != null && i1Var2.f780a && this.F != null && LiteMode.isEnabled(8200) && LiteMode.isEnabled(131072)) {
            RectF rectF = AndroidUtilities.rectTmp;
            float height = ((int) (getHeight() * 0.7f)) / 2.0f;
            rectF.set((getWidth() / 2.0f) - height, (getHeight() / 2.0f) - height, (getWidth() / 2.0f) + height, (getHeight() / 2.0f) + height);
            yj0 lottieAnimation = this.f24416a.getImageReceiver().getLottieAnimation();
            zh.b8 b8Var = this.F;
            if (lottieAnimation != null && (i10 = lottieAnimation.f31285a0) > 30) {
                f7 = Utilities.clamp01((i10 - 30) / 30.0f);
            } else {
                f7 = 0.0f;
            }
            b8Var.f50329j = (int) (b8Var.f50324b.size() * f7);
            this.F.g(rectF);
            this.F.d();
            this.F.a(canvas, -673522);
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void e(ah.i1 i1Var) {
        TLRPC.TL_availableReaction tL_availableReaction;
        SvgHelper.SvgDrawable svgDrawable;
        SvgHelper.SvgDrawable svgDrawable2;
        SvgHelper.SvgDrawable svgDrawable3;
        SvgHelper.SvgDrawable svgDrawable4;
        int i10;
        gl0 gl0Var = this.P;
        int i11 = gl0Var.M0;
        dl0 dl0Var = this.f24416a;
        dl0 dl0Var2 = this.f24417b;
        if (i1Var != null && i1Var.f780a) {
            dl0Var.getImageReceiver().setImageBitmap(new yj0(R.raw.star_reaction, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f)));
            dl0Var2.getImageReceiver().setImageBitmap(getContext().getResources().getDrawable(R.drawable.star_reaction));
            if (this.F == null) {
                if (SharedConfig.getDevicePerformanceClass() == 2) {
                    i10 = 45;
                } else {
                    i10 = 18;
                }
                this.F = new zh.b8(1, i10);
            }
        } else if (i11 == 4 && i1Var != null && i1Var.f783f != null) {
            dl0Var.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(i1Var.f783f));
            dl0Var2.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(i1Var.f783f));
        } else {
            ah.i1 i1Var2 = this.e;
            if (i1Var2.f781b) {
                TLRPC.Document effectDocument = MessagesController.getInstance(gl0Var.J).getEffectDocument(this.e.f784g);
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(effectDocument, org.telegram.ui.ActionBar.g6.f19764m6, 0.2f);
                ImageReceiver imageReceiver = dl0Var2.getImageReceiver();
                ImageLocation forDocument = ImageLocation.getForDocument(effectDocument);
                if (this.f24421r) {
                    svgDrawable4 = null;
                } else {
                    svgDrawable4 = svgThumb;
                }
                imageReceiver.setImage(forDocument, "60_60_firstframe", null, null, svgDrawable4, 0L, "tgs", this.e, 0);
            } else if (i1Var2.f783f != null) {
                TLRPC.TL_availableReaction tL_availableReaction2 = MediaDataController.getInstance(gl0Var.J).getReactionsMap().get(this.e.f783f);
                if (tL_availableReaction2 != null) {
                    SvgHelper.SvgDrawable svgThumb2 = DocumentObject.getSvgThumb(tL_availableReaction2.activate_animation, org.telegram.ui.ActionBar.g6.f19764m6, 0.2f);
                    if (!LiteMode.isEnabled(8200) || i11 == 4) {
                        tL_availableReaction = tL_availableReaction2;
                        if (SharedConfig.getDevicePerformanceClass() > 0 && i11 != 4) {
                            dl0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.appear_animation), "30_30_nolimit", null, null, svgThumb2, 0L, "tgs", i1Var, 0);
                            ImageReceiver imageReceiver2 = dl0Var2.getImageReceiver();
                            ImageLocation forDocument2 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                            if (this.f24421r) {
                                svgDrawable2 = null;
                            } else {
                                svgDrawable2 = svgThumb2;
                            }
                            imageReceiver2.setImage(forDocument2, "60_60_firstframe", null, null, svgDrawable2, 0L, "tgs", this.e, 0);
                        } else {
                            ImageReceiver imageReceiver3 = dl0Var2.getImageReceiver();
                            ImageLocation forDocument3 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                            if (this.f24421r) {
                                svgDrawable = null;
                            } else {
                                svgDrawable = svgThumb2;
                            }
                            imageReceiver3.setImage(forDocument3, "60_60_firstframe", null, null, svgDrawable, 0L, "tgs", this.e, 0);
                        }
                    } else {
                        tL_availableReaction = tL_availableReaction2;
                        dl0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction2.appear_animation), "30_30_nolimit", null, null, svgThumb2, 0L, "tgs", i1Var, 0);
                        ImageReceiver imageReceiver4 = dl0Var2.getImageReceiver();
                        ImageLocation forDocument4 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                        if (this.f24421r) {
                            svgDrawable3 = null;
                        } else {
                            svgDrawable3 = svgThumb2;
                        }
                        imageReceiver4.setImage(forDocument4, "60_60_pcache", null, null, svgDrawable3, 0L, "tgs", this.e, 0);
                    }
                    if (dl0Var.getImageReceiver().getLottieAnimation() != null) {
                        dl0Var.getImageReceiver().getLottieAnimation().N(0, false, true);
                    }
                    this.f24418c.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, svgThumb2, 0L, "tgs", i1Var, 0);
                    ImageReceiver imageReceiver5 = this.d;
                    imageReceiver5.setAllowStartLottieAnimation(false);
                    MediaDataController.getInstance(gl0Var.J).preloadImage(imageReceiver5, ImageLocation.getForDocument(tL_availableReaction.around_animation), ah.d1.a());
                }
                sg.c1 c1Var = this.f24419f;
                if (c1Var != null) {
                    c1Var.setImageReceiver(dl0Var2.getImageReceiver());
                }
            }
        }
    }

    public final void f(ah.i1 i1Var, boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        boolean z11 = this.f24423w;
        boolean contains = this.P.f25015d0.contains(i1Var);
        this.f24423w = contains;
        if (contains != z11) {
            dl0 dl0Var = this.f24416a;
            dl0 dl0Var2 = this.f24417b;
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
                if (this.f24423w) {
                    f13 = 0.76f;
                } else {
                    f13 = 1.0f;
                }
                dl0Var2.setScaleY(f17 * f13);
                float f18 = this.I;
                if (this.f24423w) {
                    f14 = 0.76f;
                } else {
                    f14 = 1.0f;
                }
                dl0Var.setScaleX(f18 * f14);
                float f19 = this.I;
                if (this.f24423w) {
                    f15 = 0.76f;
                }
                dl0Var.setScaleY(f19 * f15);
            } else {
                ViewPropertyAnimator animate = dl0Var2.animate();
                float f20 = this.I;
                if (this.f24423w) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f20 * f7);
                float f21 = this.I;
                if (this.f24423w) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator duration = scaleX.scaleY(f21 * f10).setDuration(240L);
                es esVar = es.h;
                duration.setInterpolator(esVar).start();
                ViewPropertyAnimator animate2 = dl0Var.animate();
                float f22 = this.I;
                if (this.f24423w) {
                    f11 = 0.76f;
                } else {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator scaleX2 = animate2.scaleX(f22 * f11);
                float f23 = this.I;
                if (this.f24423w) {
                    f15 = 0.76f;
                }
                scaleX2.scaleY(f23 * f15).setDuration(240L).setInterpolator(esVar).start();
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
        ah.i1 i1Var = this.e;
        if (i1Var != null) {
            String str = i1Var.f783f;
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
                    if (this.h == 1.0f && !this.H && (i10 = gl0Var.M0) != 3 && i10 != 4 && i10 != 5 && ((fl0Var = gl0Var.f25022g0) == null || fl0Var.j())) {
                        AndroidUtilities.runOnUIThread(bl0Var, ViewConfiguration.getLongPressTimeout());
                    }
                }
                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 2.0f;
                if ((motionEvent.getAction() != 2 || (Math.abs(this.L - motionEvent.getX()) <= scaledTouchSlop && Math.abs(this.M - motionEvent.getY()) <= scaledTouchSlop)) && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return true;
                }
                if (motionEvent.getAction() == 1 && this.N && ((gl0Var.f25031l0 == null || gl0Var.f25033n0 > 0.8f) && gl0Var.f25022g0 != null)) {
                    gl0Var.f25038r0 = true;
                    if (System.currentTimeMillis() - gl0Var.f25040s0 > 300) {
                        gl0Var.f25040s0 = System.currentTimeMillis();
                        fl0 fl0Var2 = gl0Var.f25022g0;
                        ah.i1 i1Var = this.e;
                        if (gl0Var.f25033n0 > 0.8f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        fl0Var2.n(this, i1Var, z10, false);
                    }
                }
                if (!gl0Var.f25038r0 && gl0Var.f25031l0 != null) {
                    gl0Var.f25034o0 = 0.0f;
                    float f7 = gl0Var.f25033n0;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    gl0Var.Q = ofFloat;
                    ofFloat.addUpdateListener(new uk0(gl0Var, f7));
                    gl0Var.Q.addListener(new di.t5(gl0Var, 2));
                    gl0Var.Q.setDuration(150L);
                    gl0Var.Q.setInterpolator(es.f24465f);
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
