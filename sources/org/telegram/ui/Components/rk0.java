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
public final class rk0 extends FrameLayout {
    public boolean E;
    public yh.i8 F;
    public final ok0 G;
    public boolean H;
    public float I;
    public ValueAnimator J;
    public final ok0 K;
    public float L;
    public float M;
    public boolean N;
    public boolean O;
    public final tk0 P;
    public final qk0 f28050a;
    public final qk0 f28051b;
    public final qk0 f28052c;
    public final ImageReceiver d;
    public zg.o0 e;
    public rg.b1 f28053f;
    public float h;
    public boolean f28054n;
    public boolean f28055r;
    public boolean f28056s;
    public boolean v;
    public boolean f28057w;
    public boolean f28058x;
    public int f28059y;

    public rk0(tk0 tk0Var, Context context) {
        super(context);
        this.P = tk0Var;
        this.d = new ImageReceiver();
        this.h = 1.0f;
        this.f28058x = true;
        this.G = new ok0(this, 0);
        this.I = 1.0f;
        this.K = new ok0(this, 1);
        this.O = true;
        qk0 qk0Var = new qk0(this, context, 0);
        this.f28050a = qk0Var;
        qk0 qk0Var2 = new qk0(this, context, 1);
        this.f28051b = qk0Var2;
        qk0Var.getImageReceiver().setAutoRepeat(0);
        qk0Var.getImageReceiver().setAllowStartLottieAnimation(false);
        qk0 qk0Var3 = new qk0(this, context, 2);
        this.f28052c = qk0Var3;
        addView(qk0Var, w7.y5.e(34, 34, 17));
        addView(qk0Var3, w7.y5.e(34, 34, 17));
        addView(qk0Var2, w7.y5.e(34, 34, 17));
        if (tk0Var.M0 == 4) {
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setDuration(100L);
            layoutTransition.enableTransitionType(4);
            setLayoutTransition(layoutTransition);
        }
        qk0Var.setLayerNum(Integer.MAX_VALUE);
        qk0Var2.setLayerNum(Integer.MAX_VALUE);
        qk0Var2.f29863a.setAutoRepeat(0);
        qk0Var2.f29863a.setAllowStartAnimation(false);
        qk0Var2.f29863a.setAllowStartLottieAnimation(false);
        qk0Var3.setLayerNum(Integer.MAX_VALUE);
    }

    public static void a(rk0 rk0Var, zg.o0 o0Var, int i10) {
        boolean z10;
        boolean z11;
        int i11;
        qk0 qk0Var = rk0Var.f28052c;
        qk0 qk0Var2 = rk0Var.f28050a;
        qk0 qk0Var3 = rk0Var.f28051b;
        tk0 tk0Var = rk0Var.P;
        rk0Var.f(o0Var, false);
        zg.o0 o0Var2 = rk0Var.e;
        if (o0Var2 != null && o0Var2.equals(o0Var)) {
            rk0Var.f28059y = i10;
            rk0Var.e(o0Var);
            return;
        }
        int i12 = tk0Var.J;
        org.telegram.ui.ActionBar.d6 d6Var = tk0Var.f28576k0;
        int i13 = tk0Var.M0;
        boolean isPremium = UserConfig.getInstance(i12).isPremium();
        if ((i13 == 3 && !isPremium) || (i13 == 5 && o0Var.d && !isPremium)) {
            z10 = true;
        } else {
            z10 = false;
        }
        rk0Var.H = z10;
        if (z10 && rk0Var.f28053f == null) {
            rg.b1 b1Var = new rg.b1(rk0Var.getContext(), 1, null);
            rk0Var.f28053f = b1Var;
            b1Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            rk0Var.f28053f.setImageReceiver(qk0Var3.getImageReceiver());
            rk0Var.addView(rk0Var.f28053f, w7.y5.d(18, 18.0f, 17, 8.0f, 8.0f, 0.0f, 0.0f));
        }
        rg.b1 b1Var2 = rk0Var.f28053f;
        if (b1Var2 != null) {
            if (rk0Var.H) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            b1Var2.setVisibility(i11);
        }
        rk0Var.d();
        rk0Var.e = o0Var;
        if (!o0Var.f49501a && (o0Var.f49504f == null || ((!tk0Var.q() && !tk0Var.G0) || !LiteMode.isEnabled(8200)))) {
            z11 = false;
        } else {
            z11 = true;
        }
        rk0Var.f28055r = z11;
        if (i13 == 4 || rk0Var.e.f49502b) {
            rk0Var.f28055r = false;
        }
        zg.o0 o0Var3 = rk0Var.e;
        if (!o0Var3.f49501a && o0Var3.f49504f == null) {
            qk0Var.getImageReceiver().clearImage();
            qk0Var3.getImageReceiver().clearImage();
            q5 q5Var = new q5(4, tk0Var.J, rk0Var.e.f49505g);
            q5 q5Var2 = new q5(3, tk0Var.J, rk0Var.e.f49505g);
            if (i13 != 1 && i13 != 2 && i13 != 4) {
                int i14 = org.telegram.ui.ActionBar.h6.f19407v6;
                int v02 = org.telegram.ui.ActionBar.h6.v0(i14, d6Var);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                q5Var.setColorFilter(new PorterDuffColorFilter(v02, mode));
                q5Var2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(i14, d6Var), mode));
            } else {
                PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
                q5Var.setColorFilter(new PorterDuffColorFilter(-1, mode2));
                q5Var2.setColorFilter(new PorterDuffColorFilter(-1, mode2));
            }
            qk0Var.setAnimatedEmojiDrawable(q5Var);
            qk0Var3.setAnimatedEmojiDrawable(q5Var2);
            rg.b1 b1Var3 = rk0Var.f28053f;
            if (b1Var3 != null) {
                b1Var3.setAnimatedEmojiDrawable(q5Var2);
            }
        } else {
            rk0Var.e(o0Var);
            qk0Var.setAnimatedEmojiDrawable(null);
            if (qk0Var2.getImageReceiver().getLottieAnimation() != null) {
                qk0Var2.getImageReceiver().getLottieAnimation().N(0, false, false);
            }
            rg.b1 b1Var4 = rk0Var.f28053f;
            if (b1Var4 != null) {
                b1Var4.setAnimatedEmojiDrawable(null);
            }
        }
        rk0Var.setFocusable(true);
        boolean z12 = rk0Var.f28055r;
        rk0Var.f28056s = z12;
        if (!z12) {
            qk0Var2.setVisibility(8);
            qk0Var3.setVisibility(0);
            rk0Var.v = true;
        } else {
            rk0Var.v = false;
            qk0Var2.setVisibility(0);
            qk0Var3.setVisibility(8);
        }
        ViewGroup.LayoutParams layoutParams = qk0Var3.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = qk0Var3.getLayoutParams();
        int dp = AndroidUtilities.dp(34.0f);
        layoutParams2.height = dp;
        layoutParams.width = dp;
        ViewGroup.LayoutParams layoutParams3 = qk0Var2.getLayoutParams();
        ViewGroup.LayoutParams layoutParams4 = qk0Var2.getLayoutParams();
        int dp2 = AndroidUtilities.dp(34.0f);
        layoutParams4.height = dp2;
        layoutParams3.width = dp2;
    }

    public final void b() {
        ImageReceiver imageReceiver;
        qk0 qk0Var = this.f28051b;
        q5 q5Var = qk0Var.e;
        if (q5Var != null) {
            imageReceiver = q5Var.f27555k;
        } else {
            imageReceiver = qk0Var.f29863a;
        }
        if (imageReceiver != null && imageReceiver.getLottieAnimation() != null) {
            tk0 tk0Var = this.P;
            if (tk0Var.f28593x0 == null && !this.N && tk0Var.G0) {
                if (imageReceiver.getLottieAnimation().f26008a0 <= 2) {
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
        if (!this.P.f28574j0) {
            d();
            this.f28054n = true;
            if (!this.f28055r) {
                this.f28051b.setVisibility(0);
                qk0 qk0Var = this.f28051b;
                float f12 = this.I;
                if (this.f28057w) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                qk0Var.setScaleY(f12 * f10);
                qk0 qk0Var2 = this.f28051b;
                float f13 = this.I;
                if (!this.f28057w) {
                    f11 = 1.0f;
                }
                qk0Var2.setScaleX(f13 * f11);
                return;
            }
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.G);
        if (this.f28055r) {
            if (this.f28050a.getImageReceiver().getLottieAnimation() != null && !this.f28050a.getImageReceiver().getLottieAnimation().y() && !this.f28054n) {
                this.f28054n = true;
                if (i10 == 0) {
                    this.E = false;
                    this.f28050a.getImageReceiver().getLottieAnimation().stop();
                    this.f28050a.getImageReceiver().getLottieAnimation().N(0, false, false);
                    this.G.run();
                    return;
                }
                this.E = true;
                this.f28050a.getImageReceiver().getLottieAnimation().stop();
                this.f28050a.getImageReceiver().getLottieAnimation().N(0, false, false);
                AndroidUtilities.runOnUIThread(this.G, i10);
                return;
            }
            if (this.f28050a.getImageReceiver().getLottieAnimation() != null && this.f28054n && !this.f28050a.getImageReceiver().getLottieAnimation().f26021k0 && !this.f28050a.getImageReceiver().getLottieAnimation().y()) {
                this.f28050a.getImageReceiver().getLottieAnimation().N(this.f28050a.getImageReceiver().getLottieAnimation().e[0] - 1, false, false);
            }
            qk0 qk0Var3 = this.f28051b;
            float f14 = this.I;
            if (this.f28057w) {
                f7 = 0.76f;
            } else {
                f7 = 1.0f;
            }
            qk0Var3.setScaleY(f14 * f7);
            qk0 qk0Var4 = this.f28051b;
            float f15 = this.I;
            if (!this.f28057w) {
                f11 = 1.0f;
            }
            qk0Var4.setScaleX(f15 * f11);
        } else if (!this.f28054n) {
            this.I = 0.0f;
            this.f28051b.setScaleX(0.0f);
            this.f28051b.setScaleY(0.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.J = ofFloat;
            ofFloat.addUpdateListener(new v70(this, 9));
            this.J.setDuration(150L);
            this.J.setInterpolator(tr.h);
            this.J.setStartDelay(i10 * this.P.f28558c);
            this.J.start();
            this.f28054n = true;
        }
    }

    public final void d() {
        float f7;
        float f10;
        boolean z10 = this.f28055r;
        tk0 tk0Var = this.P;
        float f11 = 1.0f;
        qk0 qk0Var = this.f28051b;
        if (z10) {
            AndroidUtilities.cancelRunOnUIThread(this.G);
            qk0 qk0Var2 = this.f28050a;
            if (qk0Var2.getImageReceiver().getLottieAnimation() != null && !qk0Var2.getImageReceiver().getLottieAnimation().y()) {
                qk0Var2.getImageReceiver().getLottieAnimation().stop();
                if (tk0Var.f28574j0) {
                    qk0Var2.getImageReceiver().getLottieAnimation().N(0, false, true);
                } else {
                    qk0Var2.getImageReceiver().getLottieAnimation().N(qk0Var2.getImageReceiver().getLottieAnimation().e[0] - 1, false, true);
                }
            }
            qk0Var.setVisibility(4);
            qk0Var2.setVisibility(0);
            this.v = false;
            float f12 = this.I;
            if (this.f28057w) {
                f10 = 0.76f;
            } else {
                f10 = 1.0f;
            }
            qk0Var.setScaleY(f12 * f10);
            float f13 = this.I;
            if (this.f28057w) {
                f11 = 0.76f;
            }
            qk0Var.setScaleX(f13 * f11);
        } else {
            qk0Var.animate().cancel();
            if (tk0Var.N0) {
                float f14 = this.I;
                if (this.f28057w) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                qk0Var.setScaleY(f14 * f7);
                float f15 = this.I;
                if (this.f28057w) {
                    f11 = 0.76f;
                }
                qk0Var.setScaleX(f15 * f11);
            } else {
                qk0Var.setScaleY(0.0f);
                qk0Var.setScaleX(0.0f);
            }
        }
        this.f28054n = false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        int i10;
        ai.l4 l4Var;
        Paint paint;
        if (this.f28057w && this.f28058x) {
            float measuredWidth = getMeasuredWidth() >> 1;
            float measuredHeight = getMeasuredHeight() >> 1;
            float measuredWidth2 = (getMeasuredWidth() >> 1) - AndroidUtilities.dp(1.0f);
            zg.o0 o0Var = this.e;
            tk0 tk0Var = this.P;
            if (o0Var != null && o0Var.f49501a) {
                paint = tk0Var.I0;
            } else {
                paint = tk0Var.H0;
            }
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth2, paint);
        }
        q5 q5Var = this.f28051b.e;
        if (q5Var != null && (l4Var = q5Var.f27555k) != null) {
            int i11 = 0;
            if (this.f28059y == 0) {
                l4Var.setRoundRadius(AndroidUtilities.dp(6.0f), 0, 0, AndroidUtilities.dp(6.0f));
            } else {
                if (this.f28057w) {
                    i11 = AndroidUtilities.dp(6.0f);
                }
                l4Var.setRoundRadius(i11);
            }
        }
        zg.o0 o0Var2 = this.e;
        if (o0Var2 != null && o0Var2.f49501a && this.F != null && LiteMode.isEnabled(8200) && LiteMode.isEnabled(131072)) {
            RectF rectF = AndroidUtilities.rectTmp;
            float height = ((int) (getHeight() * 0.7f)) / 2.0f;
            rectF.set((getWidth() / 2.0f) - height, (getHeight() / 2.0f) - height, (getWidth() / 2.0f) + height, (getHeight() / 2.0f) + height);
            lj0 lottieAnimation = this.f28050a.getImageReceiver().getLottieAnimation();
            yh.i8 i8Var = this.F;
            if (lottieAnimation != null && (i10 = lottieAnimation.f26008a0) > 30) {
                f7 = Utilities.clamp01((i10 - 30) / 30.0f);
            } else {
                f7 = 0.0f;
            }
            i8Var.f47639j = (int) (i8Var.f47634b.size() * f7);
            this.F.g(rectF);
            this.F.d();
            this.F.a(canvas, -673522);
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void e(zg.o0 o0Var) {
        TLRPC.TL_availableReaction tL_availableReaction;
        SvgHelper.SvgDrawable svgDrawable;
        SvgHelper.SvgDrawable svgDrawable2;
        SvgHelper.SvgDrawable svgDrawable3;
        SvgHelper.SvgDrawable svgDrawable4;
        int i10;
        tk0 tk0Var = this.P;
        int i11 = tk0Var.M0;
        qk0 qk0Var = this.f28050a;
        qk0 qk0Var2 = this.f28051b;
        if (o0Var != null && o0Var.f49501a) {
            qk0Var.getImageReceiver().setImageBitmap(new lj0(R.raw.star_reaction, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f)));
            qk0Var2.getImageReceiver().setImageBitmap(getContext().getResources().getDrawable(R.drawable.star_reaction));
            if (this.F == null) {
                if (SharedConfig.getDevicePerformanceClass() == 2) {
                    i10 = 45;
                } else {
                    i10 = 18;
                }
                this.F = new yh.i8(1, i10);
            }
        } else if (i11 == 4 && o0Var != null && o0Var.f49504f != null) {
            qk0Var.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(o0Var.f49504f));
            qk0Var2.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(o0Var.f49504f));
        } else {
            zg.o0 o0Var2 = this.e;
            if (o0Var2.f49502b) {
                TLRPC.Document effectDocument = MessagesController.getInstance(tk0Var.J).getEffectDocument(this.e.f49505g);
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(effectDocument, org.telegram.ui.ActionBar.h6.f19240m6, 0.2f);
                ImageReceiver imageReceiver = qk0Var2.getImageReceiver();
                ImageLocation forDocument = ImageLocation.getForDocument(effectDocument);
                if (this.f28055r) {
                    svgDrawable4 = null;
                } else {
                    svgDrawable4 = svgThumb;
                }
                imageReceiver.setImage(forDocument, "60_60_firstframe", null, null, svgDrawable4, 0L, "tgs", this.e, 0);
            } else if (o0Var2.f49504f != null) {
                TLRPC.TL_availableReaction tL_availableReaction2 = MediaDataController.getInstance(tk0Var.J).getReactionsMap().get(this.e.f49504f);
                if (tL_availableReaction2 != null) {
                    SvgHelper.SvgDrawable svgThumb2 = DocumentObject.getSvgThumb(tL_availableReaction2.activate_animation, org.telegram.ui.ActionBar.h6.f19240m6, 0.2f);
                    if (!LiteMode.isEnabled(8200) || i11 == 4) {
                        tL_availableReaction = tL_availableReaction2;
                        if (SharedConfig.getDevicePerformanceClass() > 0 && i11 != 4) {
                            qk0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.appear_animation), "30_30_nolimit", null, null, svgThumb2, 0L, "tgs", o0Var, 0);
                            ImageReceiver imageReceiver2 = qk0Var2.getImageReceiver();
                            ImageLocation forDocument2 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                            if (this.f28055r) {
                                svgDrawable2 = null;
                            } else {
                                svgDrawable2 = svgThumb2;
                            }
                            imageReceiver2.setImage(forDocument2, "60_60_firstframe", null, null, svgDrawable2, 0L, "tgs", this.e, 0);
                        } else {
                            ImageReceiver imageReceiver3 = qk0Var2.getImageReceiver();
                            ImageLocation forDocument3 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                            if (this.f28055r) {
                                svgDrawable = null;
                            } else {
                                svgDrawable = svgThumb2;
                            }
                            imageReceiver3.setImage(forDocument3, "60_60_firstframe", null, null, svgDrawable, 0L, "tgs", this.e, 0);
                        }
                    } else {
                        tL_availableReaction = tL_availableReaction2;
                        qk0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction2.appear_animation), "30_30_nolimit", null, null, svgThumb2, 0L, "tgs", o0Var, 0);
                        ImageReceiver imageReceiver4 = qk0Var2.getImageReceiver();
                        ImageLocation forDocument4 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                        if (this.f28055r) {
                            svgDrawable3 = null;
                        } else {
                            svgDrawable3 = svgThumb2;
                        }
                        imageReceiver4.setImage(forDocument4, "60_60_pcache", null, null, svgDrawable3, 0L, "tgs", this.e, 0);
                    }
                    if (qk0Var.getImageReceiver().getLottieAnimation() != null) {
                        qk0Var.getImageReceiver().getLottieAnimation().N(0, false, true);
                    }
                    this.f28052c.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, svgThumb2, 0L, "tgs", o0Var, 0);
                    ImageReceiver imageReceiver5 = this.d;
                    imageReceiver5.setAllowStartLottieAnimation(false);
                    MediaDataController.getInstance(tk0Var.J).preloadImage(imageReceiver5, ImageLocation.getForDocument(tL_availableReaction.around_animation), zg.k0.a());
                }
                rg.b1 b1Var = this.f28053f;
                if (b1Var != null) {
                    b1Var.setImageReceiver(qk0Var2.getImageReceiver());
                }
            }
        }
    }

    public final void f(zg.o0 o0Var, boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        boolean z11 = this.f28057w;
        boolean contains = this.P.f28561d0.contains(o0Var);
        this.f28057w = contains;
        if (contains != z11) {
            qk0 qk0Var = this.f28050a;
            qk0 qk0Var2 = this.f28051b;
            float f15 = 1.0f;
            if (!z10) {
                float f16 = this.I;
                if (contains) {
                    f12 = 0.76f;
                } else {
                    f12 = 1.0f;
                }
                qk0Var2.setScaleX(f16 * f12);
                float f17 = this.I;
                if (this.f28057w) {
                    f13 = 0.76f;
                } else {
                    f13 = 1.0f;
                }
                qk0Var2.setScaleY(f17 * f13);
                float f18 = this.I;
                if (this.f28057w) {
                    f14 = 0.76f;
                } else {
                    f14 = 1.0f;
                }
                qk0Var.setScaleX(f18 * f14);
                float f19 = this.I;
                if (this.f28057w) {
                    f15 = 0.76f;
                }
                qk0Var.setScaleY(f19 * f15);
            } else {
                ViewPropertyAnimator animate = qk0Var2.animate();
                float f20 = this.I;
                if (this.f28057w) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f20 * f7);
                float f21 = this.I;
                if (this.f28057w) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator duration = scaleX.scaleY(f21 * f10).setDuration(240L);
                tr trVar = tr.h;
                duration.setInterpolator(trVar).start();
                ViewPropertyAnimator animate2 = qk0Var.animate();
                float f22 = this.I;
                if (this.f28057w) {
                    f11 = 0.76f;
                } else {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator scaleX2 = animate2.scaleX(f22 * f11);
                float f23 = this.I;
                if (this.f28057w) {
                    f15 = 0.76f;
                }
                scaleX2.scaleY(f23 * f15).setDuration(240L).setInterpolator(trVar).start();
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
        zg.o0 o0Var = this.e;
        if (o0Var != null) {
            String str = o0Var.f49504f;
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
        sk0 sk0Var;
        if (this.O) {
            tk0 tk0Var = this.P;
            if (tk0Var.Q == null) {
                int action = motionEvent.getAction();
                ok0 ok0Var = this.K;
                if (action == 0) {
                    this.N = true;
                    this.L = motionEvent.getX();
                    this.M = motionEvent.getY();
                    if (this.h == 1.0f && !this.H && (i10 = tk0Var.M0) != 3 && i10 != 4 && i10 != 5 && ((sk0Var = tk0Var.f28568g0) == null || sk0Var.j())) {
                        AndroidUtilities.runOnUIThread(ok0Var, ViewConfiguration.getLongPressTimeout());
                    }
                }
                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 2.0f;
                if ((motionEvent.getAction() != 2 || (Math.abs(this.L - motionEvent.getX()) <= scaledTouchSlop && Math.abs(this.M - motionEvent.getY()) <= scaledTouchSlop)) && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return true;
                }
                if (motionEvent.getAction() == 1 && this.N && ((tk0Var.f28577l0 == null || tk0Var.f28579n0 > 0.8f) && tk0Var.f28568g0 != null)) {
                    tk0Var.f28584r0 = true;
                    if (System.currentTimeMillis() - tk0Var.f28586s0 > 300) {
                        tk0Var.f28586s0 = System.currentTimeMillis();
                        sk0 sk0Var2 = tk0Var.f28568g0;
                        zg.o0 o0Var = this.e;
                        if (tk0Var.f28579n0 > 0.8f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        sk0Var2.h(this, o0Var, z10, false);
                    }
                }
                if (!tk0Var.f28584r0 && tk0Var.f28577l0 != null) {
                    tk0Var.f28580o0 = 0.0f;
                    float f7 = tk0Var.f28579n0;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    tk0Var.Q = ofFloat;
                    ofFloat.addUpdateListener(new hk0(tk0Var, f7));
                    tk0Var.Q.addListener(new ci.u5(tk0Var, 2));
                    tk0Var.Q.setDuration(150L);
                    tk0Var.Q.setInterpolator(tr.f28636f);
                    tk0Var.Q.start();
                }
                AndroidUtilities.cancelRunOnUIThread(ok0Var);
                this.N = false;
                return true;
            }
        }
        return false;
    }
}
