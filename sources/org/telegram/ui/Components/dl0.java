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
public final class dl0 extends FrameLayout {
    public boolean E;
    public bi.td F;
    public final al0 G;
    public boolean H;
    public float I;
    public ValueAnimator J;
    public final al0 K;
    public float L;
    public float M;
    public boolean N;
    public boolean O;
    public final fl0 P;
    public final cl0 f27550a;
    public final cl0 f27551b;
    public final cl0 f27552c;
    public final ImageReceiver d;
    public bh.x0 e;
    public tg.c1 f27553f;
    public float h;
    public boolean f27554n;
    public boolean f27555r;
    public boolean f27556s;
    public boolean v;
    public boolean f27557w;
    public boolean f27558x;
    public int f27559y;

    public dl0(fl0 fl0Var, Context context) {
        super(context);
        this.P = fl0Var;
        this.d = new ImageReceiver();
        this.h = 1.0f;
        this.f27558x = true;
        this.G = new al0(this, 0);
        this.I = 1.0f;
        this.K = new al0(this, 1);
        this.O = true;
        cl0 cl0Var = new cl0(this, context, 0);
        this.f27550a = cl0Var;
        cl0 cl0Var2 = new cl0(this, context, 1);
        this.f27551b = cl0Var2;
        cl0Var.getImageReceiver().setAutoRepeat(0);
        cl0Var.getImageReceiver().setAllowStartLottieAnimation(false);
        cl0 cl0Var3 = new cl0(this, context, 2);
        this.f27552c = cl0Var3;
        addView(cl0Var, gb1.i(34, 34, 17));
        addView(cl0Var3, gb1.i(34, 34, 17));
        addView(cl0Var2, gb1.i(34, 34, 17));
        if (fl0Var.M0 == 4) {
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setDuration(100L);
            layoutTransition.enableTransitionType(4);
            setLayoutTransition(layoutTransition);
        }
        cl0Var.setLayerNum(Integer.MAX_VALUE);
        cl0Var2.setLayerNum(Integer.MAX_VALUE);
        cl0Var2.f34984a.setAutoRepeat(0);
        cl0Var2.f34984a.setAllowStartAnimation(false);
        cl0Var2.f34984a.setAllowStartLottieAnimation(false);
        cl0Var3.setLayerNum(Integer.MAX_VALUE);
    }

    public static void a(dl0 dl0Var, bh.x0 x0Var, int i10) {
        boolean z10;
        boolean z11;
        int i11;
        cl0 cl0Var = dl0Var.f27552c;
        cl0 cl0Var2 = dl0Var.f27550a;
        cl0 cl0Var3 = dl0Var.f27551b;
        fl0 fl0Var = dl0Var.P;
        dl0Var.f(x0Var, false);
        bh.x0 x0Var2 = dl0Var.e;
        if (x0Var2 != null && x0Var2.equals(x0Var)) {
            dl0Var.f27559y = i10;
            dl0Var.e(x0Var);
            return;
        }
        int i12 = fl0Var.J;
        org.telegram.ui.ActionBar.u6 u6Var = fl0Var.f28252k0;
        int i13 = fl0Var.M0;
        boolean isPremium = UserConfig.getInstance(i12).isPremium();
        if ((i13 == 3 && !isPremium) || (i13 == 5 && x0Var.d && !isPremium)) {
            z10 = true;
        } else {
            z10 = false;
        }
        dl0Var.H = z10;
        if (z10 && dl0Var.f27553f == null) {
            tg.c1 c1Var = new tg.c1(dl0Var.getContext(), 1, null);
            dl0Var.f27553f = c1Var;
            c1Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            dl0Var.f27553f.setImageReceiver(cl0Var3.getImageReceiver());
            dl0Var.addView(dl0Var.f27553f, gb1.h(18, 18.0f, 17, 8.0f, 8.0f, 0.0f, 0.0f));
        }
        tg.c1 c1Var2 = dl0Var.f27553f;
        if (c1Var2 != null) {
            if (dl0Var.H) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            c1Var2.setVisibility(i11);
        }
        dl0Var.d();
        dl0Var.e = x0Var;
        if (!x0Var.f4205a && (x0Var.f4208f == null || ((!fl0Var.q() && !fl0Var.G0) || !LiteMode.isEnabled(8200)))) {
            z11 = false;
        } else {
            z11 = true;
        }
        dl0Var.f27555r = z11;
        if (i13 == 4 || dl0Var.e.f4206b) {
            dl0Var.f27555r = false;
        }
        bh.x0 x0Var3 = dl0Var.e;
        if (!x0Var3.f4205a && x0Var3.f4208f == null) {
            cl0Var.getImageReceiver().clearImage();
            cl0Var3.getImageReceiver().clearImage();
            t5 t5Var = new t5(4, fl0Var.J, dl0Var.e.f4209g);
            t5 t5Var2 = new t5(3, fl0Var.J, dl0Var.e.f4209g);
            if (i13 != 1 && i13 != 2 && i13 != 4) {
                int i14 = org.telegram.ui.ActionBar.y6.f23692v6;
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                org.telegram.ui.ActionBar.f7.y(dl0Var, t5Var, i14, u6Var, mode);
                org.telegram.ui.ActionBar.f7.y(dl0Var, t5Var2, i14, u6Var, mode);
            } else {
                PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
                t5Var.setColorFilter(new PorterDuffColorFilter(-1, mode2));
                t5Var2.setColorFilter(new PorterDuffColorFilter(-1, mode2));
            }
            cl0Var.setAnimatedEmojiDrawable(t5Var);
            cl0Var3.setAnimatedEmojiDrawable(t5Var2);
            tg.c1 c1Var3 = dl0Var.f27553f;
            if (c1Var3 != null) {
                c1Var3.setAnimatedEmojiDrawable(t5Var2);
            }
        } else {
            dl0Var.e(x0Var);
            cl0Var.setAnimatedEmojiDrawable(null);
            if (cl0Var2.getImageReceiver().getLottieAnimation() != null) {
                cl0Var2.getImageReceiver().getLottieAnimation().N(0, false, false);
            }
            tg.c1 c1Var4 = dl0Var.f27553f;
            if (c1Var4 != null) {
                c1Var4.setAnimatedEmojiDrawable(null);
            }
        }
        dl0Var.setFocusable(true);
        boolean z12 = dl0Var.f27555r;
        dl0Var.f27556s = z12;
        if (!z12) {
            cl0Var2.setVisibility(8);
            cl0Var3.setVisibility(0);
            dl0Var.v = true;
        } else {
            dl0Var.v = false;
            cl0Var2.setVisibility(0);
            cl0Var3.setVisibility(8);
        }
        ViewGroup.LayoutParams layoutParams = cl0Var3.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = cl0Var3.getLayoutParams();
        int dp = AndroidUtilities.dp(34.0f);
        layoutParams2.height = dp;
        layoutParams.width = dp;
        ViewGroup.LayoutParams layoutParams3 = cl0Var2.getLayoutParams();
        ViewGroup.LayoutParams layoutParams4 = cl0Var2.getLayoutParams();
        int dp2 = AndroidUtilities.dp(34.0f);
        layoutParams4.height = dp2;
        layoutParams3.width = dp2;
    }

    public final void b() {
        ImageReceiver imageReceiver;
        cl0 cl0Var = this.f27551b;
        t5 t5Var = cl0Var.e;
        if (t5Var != null) {
            imageReceiver = t5Var.f32852k;
        } else {
            imageReceiver = cl0Var.f34984a;
        }
        if (imageReceiver != null && imageReceiver.getLottieAnimation() != null) {
            fl0 fl0Var = this.P;
            if (fl0Var.f28270x0 == null && !this.N && fl0Var.G0) {
                if (imageReceiver.getLottieAnimation().f34736a0 <= 2) {
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
        if (!this.P.f28250j0) {
            d();
            this.f27554n = true;
            if (!this.f27555r) {
                this.f27551b.setVisibility(0);
                cl0 cl0Var = this.f27551b;
                float f12 = this.I;
                if (this.f27557w) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                cl0Var.setScaleY(f12 * f10);
                cl0 cl0Var2 = this.f27551b;
                float f13 = this.I;
                if (!this.f27557w) {
                    f11 = 1.0f;
                }
                cl0Var2.setScaleX(f13 * f11);
                return;
            }
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.G);
        if (this.f27555r) {
            if (this.f27550a.getImageReceiver().getLottieAnimation() != null && !this.f27550a.getImageReceiver().getLottieAnimation().y() && !this.f27554n) {
                this.f27554n = true;
                if (i10 == 0) {
                    this.E = false;
                    this.f27550a.getImageReceiver().getLottieAnimation().stop();
                    this.f27550a.getImageReceiver().getLottieAnimation().N(0, false, false);
                    this.G.run();
                    return;
                }
                this.E = true;
                this.f27550a.getImageReceiver().getLottieAnimation().stop();
                this.f27550a.getImageReceiver().getLottieAnimation().N(0, false, false);
                AndroidUtilities.runOnUIThread(this.G, i10);
                return;
            }
            if (this.f27550a.getImageReceiver().getLottieAnimation() != null && this.f27554n && !this.f27550a.getImageReceiver().getLottieAnimation().f34749k0 && !this.f27550a.getImageReceiver().getLottieAnimation().y()) {
                this.f27550a.getImageReceiver().getLottieAnimation().N(this.f27550a.getImageReceiver().getLottieAnimation().e[0] - 1, false, false);
            }
            cl0 cl0Var3 = this.f27551b;
            float f14 = this.I;
            if (this.f27557w) {
                f7 = 0.76f;
            } else {
                f7 = 1.0f;
            }
            cl0Var3.setScaleY(f14 * f7);
            cl0 cl0Var4 = this.f27551b;
            float f15 = this.I;
            if (!this.f27557w) {
                f11 = 1.0f;
            }
            cl0Var4.setScaleX(f15 * f11);
        } else if (!this.f27554n) {
            this.I = 0.0f;
            this.f27551b.setScaleX(0.0f);
            this.f27551b.setScaleY(0.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.J = ofFloat;
            ofFloat.addUpdateListener(new e80(this, 10));
            this.J.setDuration(150L);
            this.J.setInterpolator(ds.h);
            this.J.setStartDelay(i10 * this.P.f28234c);
            this.J.start();
            this.f27554n = true;
        }
    }

    public final void d() {
        float f7;
        float f10;
        boolean z10 = this.f27555r;
        fl0 fl0Var = this.P;
        float f11 = 1.0f;
        cl0 cl0Var = this.f27551b;
        if (z10) {
            AndroidUtilities.cancelRunOnUIThread(this.G);
            cl0 cl0Var2 = this.f27550a;
            if (cl0Var2.getImageReceiver().getLottieAnimation() != null && !cl0Var2.getImageReceiver().getLottieAnimation().y()) {
                cl0Var2.getImageReceiver().getLottieAnimation().stop();
                if (fl0Var.f28250j0) {
                    cl0Var2.getImageReceiver().getLottieAnimation().N(0, false, true);
                } else {
                    cl0Var2.getImageReceiver().getLottieAnimation().N(cl0Var2.getImageReceiver().getLottieAnimation().e[0] - 1, false, true);
                }
            }
            cl0Var.setVisibility(4);
            cl0Var2.setVisibility(0);
            this.v = false;
            float f12 = this.I;
            if (this.f27557w) {
                f10 = 0.76f;
            } else {
                f10 = 1.0f;
            }
            cl0Var.setScaleY(f12 * f10);
            float f13 = this.I;
            if (this.f27557w) {
                f11 = 0.76f;
            }
            cl0Var.setScaleX(f13 * f11);
        } else {
            cl0Var.animate().cancel();
            if (fl0Var.N0) {
                float f14 = this.I;
                if (this.f27557w) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                cl0Var.setScaleY(f14 * f7);
                float f15 = this.I;
                if (this.f27557w) {
                    f11 = 0.76f;
                }
                cl0Var.setScaleX(f15 * f11);
            } else {
                cl0Var.setScaleY(0.0f);
                cl0Var.setScaleX(0.0f);
            }
        }
        this.f27554n = false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        int i10;
        di.f3 f3Var;
        Paint paint;
        if (this.f27557w && this.f27558x) {
            float measuredWidth = getMeasuredWidth() >> 1;
            float measuredHeight = getMeasuredHeight() >> 1;
            float measuredWidth2 = (getMeasuredWidth() >> 1) - AndroidUtilities.dp(1.0f);
            bh.x0 x0Var = this.e;
            fl0 fl0Var = this.P;
            if (x0Var != null && x0Var.f4205a) {
                paint = fl0Var.I0;
            } else {
                paint = fl0Var.H0;
            }
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth2, paint);
        }
        t5 t5Var = this.f27551b.e;
        if (t5Var != null && (f3Var = t5Var.f32852k) != null) {
            int i11 = 0;
            if (this.f27559y == 0) {
                f3Var.setRoundRadius(AndroidUtilities.dp(6.0f), 0, 0, AndroidUtilities.dp(6.0f));
            } else {
                if (this.f27557w) {
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
            xj0 lottieAnimation = this.f27550a.getImageReceiver().getLottieAnimation();
            bi.td tdVar = this.F;
            if (lottieAnimation != null && (i10 = lottieAnimation.f34736a0) > 30) {
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
        fl0 fl0Var = this.P;
        int i11 = fl0Var.M0;
        cl0 cl0Var = this.f27550a;
        cl0 cl0Var2 = this.f27551b;
        if (x0Var != null && x0Var.f4205a) {
            cl0Var.getImageReceiver().setImageBitmap(new xj0(R.raw.star_reaction, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f)));
            cl0Var2.getImageReceiver().setImageBitmap(getContext().getResources().getDrawable(R.drawable.star_reaction));
            if (this.F == null) {
                if (SharedConfig.getDevicePerformanceClass() == 2) {
                    i10 = 45;
                } else {
                    i10 = 18;
                }
                this.F = new bi.td(1, i10);
            }
        } else if (i11 == 4 && x0Var != null && x0Var.f4208f != null) {
            cl0Var.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(x0Var.f4208f));
            cl0Var2.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(x0Var.f4208f));
        } else {
            bh.x0 x0Var2 = this.e;
            if (x0Var2.f4206b) {
                TLRPC.Document effectDocument = MessagesController.getInstance(fl0Var.J).getEffectDocument(this.e.f4209g);
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(effectDocument, org.telegram.ui.ActionBar.y6.f23520m6, 0.2f);
                ImageReceiver imageReceiver = cl0Var2.getImageReceiver();
                ImageLocation forDocument = ImageLocation.getForDocument(effectDocument);
                if (this.f27555r) {
                    svgDrawable4 = null;
                } else {
                    svgDrawable4 = svgThumb;
                }
                imageReceiver.setImage(forDocument, "60_60_firstframe", null, null, svgDrawable4, 0L, "tgs", this.e, 0);
            } else if (x0Var2.f4208f != null) {
                TLRPC.TL_availableReaction tL_availableReaction2 = MediaDataController.getInstance(fl0Var.J).getReactionsMap().get(this.e.f4208f);
                if (tL_availableReaction2 != null) {
                    SvgHelper.SvgDrawable svgThumb2 = DocumentObject.getSvgThumb(tL_availableReaction2.activate_animation, org.telegram.ui.ActionBar.y6.f23520m6, 0.2f);
                    if (!LiteMode.isEnabled(8200) || i11 == 4) {
                        tL_availableReaction = tL_availableReaction2;
                        if (SharedConfig.getDevicePerformanceClass() > 0 && i11 != 4) {
                            cl0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.appear_animation), "30_30_nolimit", null, null, svgThumb2, 0L, "tgs", x0Var, 0);
                            ImageReceiver imageReceiver2 = cl0Var2.getImageReceiver();
                            ImageLocation forDocument2 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                            if (this.f27555r) {
                                svgDrawable2 = null;
                            } else {
                                svgDrawable2 = svgThumb2;
                            }
                            imageReceiver2.setImage(forDocument2, "60_60_firstframe", null, null, svgDrawable2, 0L, "tgs", this.e, 0);
                        } else {
                            ImageReceiver imageReceiver3 = cl0Var2.getImageReceiver();
                            ImageLocation forDocument3 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                            if (this.f27555r) {
                                svgDrawable = null;
                            } else {
                                svgDrawable = svgThumb2;
                            }
                            imageReceiver3.setImage(forDocument3, "60_60_firstframe", null, null, svgDrawable, 0L, "tgs", this.e, 0);
                        }
                    } else {
                        tL_availableReaction = tL_availableReaction2;
                        cl0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction2.appear_animation), "30_30_nolimit", null, null, svgThumb2, 0L, "tgs", x0Var, 0);
                        ImageReceiver imageReceiver4 = cl0Var2.getImageReceiver();
                        ImageLocation forDocument4 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                        if (this.f27555r) {
                            svgDrawable3 = null;
                        } else {
                            svgDrawable3 = svgThumb2;
                        }
                        imageReceiver4.setImage(forDocument4, "60_60_pcache", null, null, svgDrawable3, 0L, "tgs", this.e, 0);
                    }
                    if (cl0Var.getImageReceiver().getLottieAnimation() != null) {
                        cl0Var.getImageReceiver().getLottieAnimation().N(0, false, true);
                    }
                    this.f27552c.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, svgThumb2, 0L, "tgs", x0Var, 0);
                    ImageReceiver imageReceiver5 = this.d;
                    imageReceiver5.setAllowStartLottieAnimation(false);
                    MediaDataController.getInstance(fl0Var.J).preloadImage(imageReceiver5, ImageLocation.getForDocument(tL_availableReaction.around_animation), bh.s0.a());
                }
                tg.c1 c1Var = this.f27553f;
                if (c1Var != null) {
                    c1Var.setImageReceiver(cl0Var2.getImageReceiver());
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
        boolean z11 = this.f27557w;
        boolean contains = this.P.f28237d0.contains(x0Var);
        this.f27557w = contains;
        if (contains != z11) {
            cl0 cl0Var = this.f27550a;
            cl0 cl0Var2 = this.f27551b;
            float f15 = 1.0f;
            if (!z10) {
                float f16 = this.I;
                if (contains) {
                    f12 = 0.76f;
                } else {
                    f12 = 1.0f;
                }
                cl0Var2.setScaleX(f16 * f12);
                float f17 = this.I;
                if (this.f27557w) {
                    f13 = 0.76f;
                } else {
                    f13 = 1.0f;
                }
                cl0Var2.setScaleY(f17 * f13);
                float f18 = this.I;
                if (this.f27557w) {
                    f14 = 0.76f;
                } else {
                    f14 = 1.0f;
                }
                cl0Var.setScaleX(f18 * f14);
                float f19 = this.I;
                if (this.f27557w) {
                    f15 = 0.76f;
                }
                cl0Var.setScaleY(f19 * f15);
            } else {
                ViewPropertyAnimator animate = cl0Var2.animate();
                float f20 = this.I;
                if (this.f27557w) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f20 * f7);
                float f21 = this.I;
                if (this.f27557w) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator duration = scaleX.scaleY(f21 * f10).setDuration(240L);
                ds dsVar = ds.h;
                duration.setInterpolator(dsVar).start();
                ViewPropertyAnimator animate2 = cl0Var.animate();
                float f22 = this.I;
                if (this.f27557w) {
                    f11 = 0.76f;
                } else {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator scaleX2 = animate2.scaleX(f22 * f11);
                float f23 = this.I;
                if (this.f27557w) {
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
        el0 el0Var;
        if (this.O) {
            fl0 fl0Var = this.P;
            if (fl0Var.Q == null) {
                int action = motionEvent.getAction();
                al0 al0Var = this.K;
                if (action == 0) {
                    this.N = true;
                    this.L = motionEvent.getX();
                    this.M = motionEvent.getY();
                    if (this.h == 1.0f && !this.H && (i10 = fl0Var.M0) != 3 && i10 != 4 && i10 != 5 && ((el0Var = fl0Var.f28244g0) == null || el0Var.f())) {
                        AndroidUtilities.runOnUIThread(al0Var, ViewConfiguration.getLongPressTimeout());
                    }
                }
                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 2.0f;
                if ((motionEvent.getAction() != 2 || (Math.abs(this.L - motionEvent.getX()) <= scaledTouchSlop && Math.abs(this.M - motionEvent.getY()) <= scaledTouchSlop)) && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return true;
                }
                if (motionEvent.getAction() == 1 && this.N && ((fl0Var.f28254l0 == null || fl0Var.f28256n0 > 0.8f) && fl0Var.f28244g0 != null)) {
                    fl0Var.f28261r0 = true;
                    if (System.currentTimeMillis() - fl0Var.f28263s0 > 300) {
                        fl0Var.f28263s0 = System.currentTimeMillis();
                        el0 el0Var2 = fl0Var.f28244g0;
                        bh.x0 x0Var = this.e;
                        if (fl0Var.f28256n0 > 0.8f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        el0Var2.p(this, x0Var, z10, false);
                    }
                }
                if (!fl0Var.f28261r0 && fl0Var.f28254l0 != null) {
                    fl0Var.f28257o0 = 0.0f;
                    float f7 = fl0Var.f28256n0;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    fl0Var.Q = ofFloat;
                    ofFloat.addUpdateListener(new tk0(fl0Var, f7));
                    fl0Var.Q.addListener(new fi.j5(fl0Var, 2));
                    fl0Var.Q.setDuration(150L);
                    fl0Var.Q.setInterpolator(ds.f27586f);
                    fl0Var.Q.start();
                }
                AndroidUtilities.cancelRunOnUIThread(al0Var);
                this.N = false;
                return true;
            }
        }
        return false;
    }
}
