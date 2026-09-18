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
public final class ek0 extends FrameLayout {
    public boolean E;
    public yh.k8 F;
    public final bk0 G;
    public boolean H;
    public float I;
    public ValueAnimator J;
    public final bk0 K;
    public float L;
    public float M;
    public boolean N;
    public boolean O;
    public final gk0 P;
    public final dk0 f23583a;
    public final dk0 f23584b;
    public final dk0 f23585c;
    public final ImageReceiver d;
    public zg.p0 e;
    public rg.b1 f23586f;
    public float h;
    public boolean f23587n;
    public boolean f23588r;
    public boolean f23589s;
    public boolean v;
    public boolean f23590w;
    public boolean f23591x;
    public int f23592y;

    public ek0(gk0 gk0Var, Context context) {
        super(context);
        this.P = gk0Var;
        this.d = new ImageReceiver();
        this.h = 1.0f;
        this.f23591x = true;
        this.G = new bk0(this, 0);
        this.I = 1.0f;
        this.K = new bk0(this, 1);
        this.O = true;
        dk0 dk0Var = new dk0(this, context, 0);
        this.f23583a = dk0Var;
        dk0 dk0Var2 = new dk0(this, context, 1);
        this.f23584b = dk0Var2;
        dk0Var.getImageReceiver().setAutoRepeat(0);
        dk0Var.getImageReceiver().setAllowStartLottieAnimation(false);
        dk0 dk0Var3 = new dk0(this, context, 2);
        this.f23585c = dk0Var3;
        addView(dk0Var, w7.x5.e(34, 34, 17));
        addView(dk0Var3, w7.x5.e(34, 34, 17));
        addView(dk0Var2, w7.x5.e(34, 34, 17));
        if (gk0Var.M0 == 4) {
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setDuration(100L);
            layoutTransition.enableTransitionType(4);
            setLayoutTransition(layoutTransition);
        }
        dk0Var.setLayerNum(Integer.MAX_VALUE);
        dk0Var2.setLayerNum(Integer.MAX_VALUE);
        dk0Var2.f28304a.setAutoRepeat(0);
        dk0Var2.f28304a.setAllowStartAnimation(false);
        dk0Var2.f28304a.setAllowStartLottieAnimation(false);
        dk0Var3.setLayerNum(Integer.MAX_VALUE);
    }

    public static void a(ek0 ek0Var, zg.p0 p0Var, int i10) {
        boolean z10;
        boolean z11;
        int i11;
        dk0 dk0Var = ek0Var.f23585c;
        dk0 dk0Var2 = ek0Var.f23583a;
        dk0 dk0Var3 = ek0Var.f23584b;
        gk0 gk0Var = ek0Var.P;
        ek0Var.f(p0Var, false);
        zg.p0 p0Var2 = ek0Var.e;
        if (p0Var2 != null && p0Var2.equals(p0Var)) {
            ek0Var.f23592y = i10;
            ek0Var.e(p0Var);
            return;
        }
        int i12 = gk0Var.J;
        org.telegram.ui.ActionBar.f6 f6Var = gk0Var.f24292k0;
        int i13 = gk0Var.M0;
        boolean isPremium = UserConfig.getInstance(i12).isPremium();
        if ((i13 == 3 && !isPremium) || (i13 == 5 && p0Var.d && !isPremium)) {
            z10 = true;
        } else {
            z10 = false;
        }
        ek0Var.H = z10;
        if (z10 && ek0Var.f23586f == null) {
            rg.b1 b1Var = new rg.b1(ek0Var.getContext(), 1, null);
            ek0Var.f23586f = b1Var;
            b1Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            ek0Var.f23586f.setImageReceiver(dk0Var3.getImageReceiver());
            ek0Var.addView(ek0Var.f23586f, w7.x5.d(18, 18.0f, 17, 8.0f, 8.0f, 0.0f, 0.0f));
        }
        rg.b1 b1Var2 = ek0Var.f23586f;
        if (b1Var2 != null) {
            if (ek0Var.H) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            b1Var2.setVisibility(i11);
        }
        ek0Var.d();
        ek0Var.e = p0Var;
        if (!p0Var.f49152a && (p0Var.f49155f == null || ((!gk0Var.q() && !gk0Var.G0) || !LiteMode.isEnabled(8200)))) {
            z11 = false;
        } else {
            z11 = true;
        }
        ek0Var.f23588r = z11;
        if (i13 == 4 || ek0Var.e.f49153b) {
            ek0Var.f23588r = false;
        }
        zg.p0 p0Var3 = ek0Var.e;
        if (!p0Var3.f49152a && p0Var3.f49155f == null) {
            dk0Var.getImageReceiver().clearImage();
            dk0Var3.getImageReceiver().clearImage();
            o5 o5Var = new o5(4, gk0Var.J, ek0Var.e.f49156g);
            o5 o5Var2 = new o5(3, gk0Var.J, ek0Var.e.f49156g);
            if (i13 != 1 && i13 != 2 && i13 != 4) {
                int i14 = org.telegram.ui.ActionBar.j6.f19193v6;
                int v02 = org.telegram.ui.ActionBar.j6.v0(i14, f6Var);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                o5Var.setColorFilter(new PorterDuffColorFilter(v02, mode));
                o5Var2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i14, f6Var), mode));
            } else {
                PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
                o5Var.setColorFilter(new PorterDuffColorFilter(-1, mode2));
                o5Var2.setColorFilter(new PorterDuffColorFilter(-1, mode2));
            }
            dk0Var.setAnimatedEmojiDrawable(o5Var);
            dk0Var3.setAnimatedEmojiDrawable(o5Var2);
            rg.b1 b1Var3 = ek0Var.f23586f;
            if (b1Var3 != null) {
                b1Var3.setAnimatedEmojiDrawable(o5Var2);
            }
        } else {
            ek0Var.e(p0Var);
            dk0Var.setAnimatedEmojiDrawable(null);
            if (dk0Var2.getImageReceiver().getLottieAnimation() != null) {
                dk0Var2.getImageReceiver().getLottieAnimation().N(0, false, false);
            }
            rg.b1 b1Var4 = ek0Var.f23586f;
            if (b1Var4 != null) {
                b1Var4.setAnimatedEmojiDrawable(null);
            }
        }
        ek0Var.setFocusable(true);
        boolean z12 = ek0Var.f23588r;
        ek0Var.f23589s = z12;
        if (!z12) {
            dk0Var2.setVisibility(8);
            dk0Var3.setVisibility(0);
            ek0Var.v = true;
        } else {
            ek0Var.v = false;
            dk0Var2.setVisibility(0);
            dk0Var3.setVisibility(8);
        }
        ViewGroup.LayoutParams layoutParams = dk0Var3.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = dk0Var3.getLayoutParams();
        int dp = AndroidUtilities.dp(34.0f);
        layoutParams2.height = dp;
        layoutParams.width = dp;
        ViewGroup.LayoutParams layoutParams3 = dk0Var2.getLayoutParams();
        ViewGroup.LayoutParams layoutParams4 = dk0Var2.getLayoutParams();
        int dp2 = AndroidUtilities.dp(34.0f);
        layoutParams4.height = dp2;
        layoutParams3.width = dp2;
    }

    public final void b() {
        ImageReceiver imageReceiver;
        dk0 dk0Var = this.f23584b;
        o5 o5Var = dk0Var.e;
        if (o5Var != null) {
            imageReceiver = o5Var.f26639k;
        } else {
            imageReceiver = dk0Var.f28304a;
        }
        if (imageReceiver != null && imageReceiver.getLottieAnimation() != null) {
            gk0 gk0Var = this.P;
            if (gk0Var.f24309x0 == null && !this.N && gk0Var.G0) {
                if (imageReceiver.getLottieAnimation().f30222a0 <= 2) {
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
        if (!this.P.f24290j0) {
            d();
            this.f23587n = true;
            if (!this.f23588r) {
                this.f23584b.setVisibility(0);
                dk0 dk0Var = this.f23584b;
                float f12 = this.I;
                if (this.f23590w) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                dk0Var.setScaleY(f12 * f10);
                dk0 dk0Var2 = this.f23584b;
                float f13 = this.I;
                if (!this.f23590w) {
                    f11 = 1.0f;
                }
                dk0Var2.setScaleX(f13 * f11);
                return;
            }
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.G);
        if (this.f23588r) {
            if (this.f23583a.getImageReceiver().getLottieAnimation() != null && !this.f23583a.getImageReceiver().getLottieAnimation().y() && !this.f23587n) {
                this.f23587n = true;
                if (i10 == 0) {
                    this.E = false;
                    this.f23583a.getImageReceiver().getLottieAnimation().stop();
                    this.f23583a.getImageReceiver().getLottieAnimation().N(0, false, false);
                    this.G.run();
                    return;
                }
                this.E = true;
                this.f23583a.getImageReceiver().getLottieAnimation().stop();
                this.f23583a.getImageReceiver().getLottieAnimation().N(0, false, false);
                AndroidUtilities.runOnUIThread(this.G, i10);
                return;
            }
            if (this.f23583a.getImageReceiver().getLottieAnimation() != null && this.f23587n && !this.f23583a.getImageReceiver().getLottieAnimation().f30235k0 && !this.f23583a.getImageReceiver().getLottieAnimation().y()) {
                this.f23583a.getImageReceiver().getLottieAnimation().N(this.f23583a.getImageReceiver().getLottieAnimation().e[0] - 1, false, false);
            }
            dk0 dk0Var3 = this.f23584b;
            float f14 = this.I;
            if (this.f23590w) {
                f7 = 0.76f;
            } else {
                f7 = 1.0f;
            }
            dk0Var3.setScaleY(f14 * f7);
            dk0 dk0Var4 = this.f23584b;
            float f15 = this.I;
            if (!this.f23590w) {
                f11 = 1.0f;
            }
            dk0Var4.setScaleX(f15 * f11);
        } else if (!this.f23587n) {
            this.I = 0.0f;
            this.f23584b.setScaleX(0.0f);
            this.f23584b.setScaleY(0.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.J = ofFloat;
            ofFloat.addUpdateListener(new h70(this, 9));
            this.J.setDuration(150L);
            this.J.setInterpolator(qr.h);
            this.J.setStartDelay(i10 * this.P.f24274c);
            this.J.start();
            this.f23587n = true;
        }
    }

    public final void d() {
        float f7;
        float f10;
        boolean z10 = this.f23588r;
        gk0 gk0Var = this.P;
        float f11 = 1.0f;
        dk0 dk0Var = this.f23584b;
        if (z10) {
            AndroidUtilities.cancelRunOnUIThread(this.G);
            dk0 dk0Var2 = this.f23583a;
            if (dk0Var2.getImageReceiver().getLottieAnimation() != null && !dk0Var2.getImageReceiver().getLottieAnimation().y()) {
                dk0Var2.getImageReceiver().getLottieAnimation().stop();
                if (gk0Var.f24290j0) {
                    dk0Var2.getImageReceiver().getLottieAnimation().N(0, false, true);
                } else {
                    dk0Var2.getImageReceiver().getLottieAnimation().N(dk0Var2.getImageReceiver().getLottieAnimation().e[0] - 1, false, true);
                }
            }
            dk0Var.setVisibility(4);
            dk0Var2.setVisibility(0);
            this.v = false;
            float f12 = this.I;
            if (this.f23590w) {
                f10 = 0.76f;
            } else {
                f10 = 1.0f;
            }
            dk0Var.setScaleY(f12 * f10);
            float f13 = this.I;
            if (this.f23590w) {
                f11 = 0.76f;
            }
            dk0Var.setScaleX(f13 * f11);
        } else {
            dk0Var.animate().cancel();
            if (gk0Var.N0) {
                float f14 = this.I;
                if (this.f23590w) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                dk0Var.setScaleY(f14 * f7);
                float f15 = this.I;
                if (this.f23590w) {
                    f11 = 0.76f;
                }
                dk0Var.setScaleX(f15 * f11);
            } else {
                dk0Var.setScaleY(0.0f);
                dk0Var.setScaleX(0.0f);
            }
        }
        this.f23587n = false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        int i10;
        ai.l4 l4Var;
        Paint paint;
        if (this.f23590w && this.f23591x) {
            float measuredWidth = getMeasuredWidth() >> 1;
            float measuredHeight = getMeasuredHeight() >> 1;
            float measuredWidth2 = (getMeasuredWidth() >> 1) - AndroidUtilities.dp(1.0f);
            zg.p0 p0Var = this.e;
            gk0 gk0Var = this.P;
            if (p0Var != null && p0Var.f49152a) {
                paint = gk0Var.I0;
            } else {
                paint = gk0Var.H0;
            }
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth2, paint);
        }
        o5 o5Var = this.f23584b.e;
        if (o5Var != null && (l4Var = o5Var.f26639k) != null) {
            int i11 = 0;
            if (this.f23592y == 0) {
                l4Var.setRoundRadius(AndroidUtilities.dp(6.0f), 0, 0, AndroidUtilities.dp(6.0f));
            } else {
                if (this.f23590w) {
                    i11 = AndroidUtilities.dp(6.0f);
                }
                l4Var.setRoundRadius(i11);
            }
        }
        zg.p0 p0Var2 = this.e;
        if (p0Var2 != null && p0Var2.f49152a && this.F != null && LiteMode.isEnabled(8200) && LiteMode.isEnabled(131072)) {
            RectF rectF = AndroidUtilities.rectTmp;
            float height = ((int) (getHeight() * 0.7f)) / 2.0f;
            rectF.set((getWidth() / 2.0f) - height, (getHeight() / 2.0f) - height, (getWidth() / 2.0f) + height, (getHeight() / 2.0f) + height);
            yi0 lottieAnimation = this.f23583a.getImageReceiver().getLottieAnimation();
            yh.k8 k8Var = this.F;
            if (lottieAnimation != null && (i10 = lottieAnimation.f30222a0) > 30) {
                f7 = Utilities.clamp01((i10 - 30) / 30.0f);
            } else {
                f7 = 0.0f;
            }
            k8Var.f47412j = (int) (k8Var.f47407b.size() * f7);
            this.F.g(rectF);
            this.F.d();
            this.F.a(canvas, -673522);
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void e(zg.p0 p0Var) {
        TLRPC.TL_availableReaction tL_availableReaction;
        SvgHelper.SvgDrawable svgDrawable;
        SvgHelper.SvgDrawable svgDrawable2;
        SvgHelper.SvgDrawable svgDrawable3;
        SvgHelper.SvgDrawable svgDrawable4;
        int i10;
        gk0 gk0Var = this.P;
        int i11 = gk0Var.M0;
        dk0 dk0Var = this.f23583a;
        dk0 dk0Var2 = this.f23584b;
        if (p0Var != null && p0Var.f49152a) {
            dk0Var.getImageReceiver().setImageBitmap(new yi0(R.raw.star_reaction, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f)));
            dk0Var2.getImageReceiver().setImageBitmap(getContext().getResources().getDrawable(R.drawable.star_reaction));
            if (this.F == null) {
                if (SharedConfig.getDevicePerformanceClass() == 2) {
                    i10 = 45;
                } else {
                    i10 = 18;
                }
                this.F = new yh.k8(1, i10);
            }
        } else if (i11 == 4 && p0Var != null && p0Var.f49155f != null) {
            dk0Var.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(p0Var.f49155f));
            dk0Var2.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(p0Var.f49155f));
        } else {
            zg.p0 p0Var2 = this.e;
            if (p0Var2.f49153b) {
                TLRPC.Document effectDocument = MessagesController.getInstance(gk0Var.J).getEffectDocument(this.e.f49156g);
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(effectDocument, org.telegram.ui.ActionBar.j6.f19028m6, 0.2f);
                ImageReceiver imageReceiver = dk0Var2.getImageReceiver();
                ImageLocation forDocument = ImageLocation.getForDocument(effectDocument);
                if (this.f23588r) {
                    svgDrawable4 = null;
                } else {
                    svgDrawable4 = svgThumb;
                }
                imageReceiver.setImage(forDocument, "60_60_firstframe", null, null, svgDrawable4, 0L, "tgs", this.e, 0);
            } else if (p0Var2.f49155f != null) {
                TLRPC.TL_availableReaction tL_availableReaction2 = MediaDataController.getInstance(gk0Var.J).getReactionsMap().get(this.e.f49155f);
                if (tL_availableReaction2 != null) {
                    SvgHelper.SvgDrawable svgThumb2 = DocumentObject.getSvgThumb(tL_availableReaction2.activate_animation, org.telegram.ui.ActionBar.j6.f19028m6, 0.2f);
                    if (!LiteMode.isEnabled(8200) || i11 == 4) {
                        tL_availableReaction = tL_availableReaction2;
                        if (SharedConfig.getDevicePerformanceClass() > 0 && i11 != 4) {
                            dk0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.appear_animation), "30_30_nolimit", null, null, svgThumb2, 0L, "tgs", p0Var, 0);
                            ImageReceiver imageReceiver2 = dk0Var2.getImageReceiver();
                            ImageLocation forDocument2 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                            if (this.f23588r) {
                                svgDrawable2 = null;
                            } else {
                                svgDrawable2 = svgThumb2;
                            }
                            imageReceiver2.setImage(forDocument2, "60_60_firstframe", null, null, svgDrawable2, 0L, "tgs", this.e, 0);
                        } else {
                            ImageReceiver imageReceiver3 = dk0Var2.getImageReceiver();
                            ImageLocation forDocument3 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                            if (this.f23588r) {
                                svgDrawable = null;
                            } else {
                                svgDrawable = svgThumb2;
                            }
                            imageReceiver3.setImage(forDocument3, "60_60_firstframe", null, null, svgDrawable, 0L, "tgs", this.e, 0);
                        }
                    } else {
                        tL_availableReaction = tL_availableReaction2;
                        dk0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction2.appear_animation), "30_30_nolimit", null, null, svgThumb2, 0L, "tgs", p0Var, 0);
                        ImageReceiver imageReceiver4 = dk0Var2.getImageReceiver();
                        ImageLocation forDocument4 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                        if (this.f23588r) {
                            svgDrawable3 = null;
                        } else {
                            svgDrawable3 = svgThumb2;
                        }
                        imageReceiver4.setImage(forDocument4, "60_60_pcache", null, null, svgDrawable3, 0L, "tgs", this.e, 0);
                    }
                    if (dk0Var.getImageReceiver().getLottieAnimation() != null) {
                        dk0Var.getImageReceiver().getLottieAnimation().N(0, false, true);
                    }
                    this.f23585c.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, svgThumb2, 0L, "tgs", p0Var, 0);
                    ImageReceiver imageReceiver5 = this.d;
                    imageReceiver5.setAllowStartLottieAnimation(false);
                    MediaDataController.getInstance(gk0Var.J).preloadImage(imageReceiver5, ImageLocation.getForDocument(tL_availableReaction.around_animation), zg.l0.a());
                }
                rg.b1 b1Var = this.f23586f;
                if (b1Var != null) {
                    b1Var.setImageReceiver(dk0Var2.getImageReceiver());
                }
            }
        }
    }

    public final void f(zg.p0 p0Var, boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        boolean z11 = this.f23590w;
        boolean contains = this.P.f24277d0.contains(p0Var);
        this.f23590w = contains;
        if (contains != z11) {
            dk0 dk0Var = this.f23583a;
            dk0 dk0Var2 = this.f23584b;
            float f15 = 1.0f;
            if (!z10) {
                float f16 = this.I;
                if (contains) {
                    f12 = 0.76f;
                } else {
                    f12 = 1.0f;
                }
                dk0Var2.setScaleX(f16 * f12);
                float f17 = this.I;
                if (this.f23590w) {
                    f13 = 0.76f;
                } else {
                    f13 = 1.0f;
                }
                dk0Var2.setScaleY(f17 * f13);
                float f18 = this.I;
                if (this.f23590w) {
                    f14 = 0.76f;
                } else {
                    f14 = 1.0f;
                }
                dk0Var.setScaleX(f18 * f14);
                float f19 = this.I;
                if (this.f23590w) {
                    f15 = 0.76f;
                }
                dk0Var.setScaleY(f19 * f15);
            } else {
                ViewPropertyAnimator animate = dk0Var2.animate();
                float f20 = this.I;
                if (this.f23590w) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f20 * f7);
                float f21 = this.I;
                if (this.f23590w) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator duration = scaleX.scaleY(f21 * f10).setDuration(240L);
                qr qrVar = qr.h;
                duration.setInterpolator(qrVar).start();
                ViewPropertyAnimator animate2 = dk0Var.animate();
                float f22 = this.I;
                if (this.f23590w) {
                    f11 = 0.76f;
                } else {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator scaleX2 = animate2.scaleX(f22 * f11);
                float f23 = this.I;
                if (this.f23590w) {
                    f15 = 0.76f;
                }
                scaleX2.scaleY(f23 * f15).setDuration(240L).setInterpolator(qrVar).start();
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
        zg.p0 p0Var = this.e;
        if (p0Var != null) {
            String str = p0Var.f49155f;
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
        fk0 fk0Var;
        if (this.O) {
            gk0 gk0Var = this.P;
            if (gk0Var.Q == null) {
                int action = motionEvent.getAction();
                bk0 bk0Var = this.K;
                if (action == 0) {
                    this.N = true;
                    this.L = motionEvent.getX();
                    this.M = motionEvent.getY();
                    if (this.h == 1.0f && !this.H && (i10 = gk0Var.M0) != 3 && i10 != 4 && i10 != 5 && ((fk0Var = gk0Var.f24284g0) == null || fk0Var.j())) {
                        AndroidUtilities.runOnUIThread(bk0Var, ViewConfiguration.getLongPressTimeout());
                    }
                }
                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 2.0f;
                if ((motionEvent.getAction() != 2 || (Math.abs(this.L - motionEvent.getX()) <= scaledTouchSlop && Math.abs(this.M - motionEvent.getY()) <= scaledTouchSlop)) && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return true;
                }
                if (motionEvent.getAction() == 1 && this.N && ((gk0Var.f24293l0 == null || gk0Var.f24295n0 > 0.8f) && gk0Var.f24284g0 != null)) {
                    gk0Var.f24300r0 = true;
                    if (System.currentTimeMillis() - gk0Var.f24302s0 > 300) {
                        gk0Var.f24302s0 = System.currentTimeMillis();
                        fk0 fk0Var2 = gk0Var.f24284g0;
                        zg.p0 p0Var = this.e;
                        if (gk0Var.f24295n0 > 0.8f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        fk0Var2.h(this, p0Var, z10, false);
                    }
                }
                if (!gk0Var.f24300r0 && gk0Var.f24293l0 != null) {
                    gk0Var.f24296o0 = 0.0f;
                    float f7 = gk0Var.f24295n0;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    gk0Var.Q = ofFloat;
                    ofFloat.addUpdateListener(new uj0(gk0Var, f7));
                    gk0Var.Q.addListener(new ci.v5(gk0Var, 2));
                    gk0Var.Q.setDuration(150L);
                    gk0Var.Q.setInterpolator(qr.f27383f);
                    gk0Var.Q.start();
                }
                AndroidUtilities.cancelRunOnUIThread(bk0Var);
                this.N = false;
                return true;
            }
        }
        return false;
    }
}
