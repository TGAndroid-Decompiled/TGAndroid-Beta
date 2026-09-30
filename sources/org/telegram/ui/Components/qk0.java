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
public final class qk0 extends FrameLayout {
    public boolean E;
    public yh.i8 F;
    public final nk0 G;
    public boolean H;
    public float I;
    public ValueAnimator J;
    public final nk0 K;
    public float L;
    public float M;
    public boolean N;
    public boolean O;
    public final sk0 P;
    public final pk0 f27745a;
    public final pk0 f27746b;
    public final pk0 f27747c;
    public final ImageReceiver d;
    public zg.o0 e;
    public rg.b1 f27748f;
    public float h;
    public boolean f27749n;
    public boolean f27750r;
    public boolean f27751s;
    public boolean v;
    public boolean f27752w;
    public boolean f27753x;
    public int f27754y;

    public qk0(sk0 sk0Var, Context context) {
        super(context);
        this.P = sk0Var;
        this.d = new ImageReceiver();
        this.h = 1.0f;
        this.f27753x = true;
        this.G = new nk0(this, 0);
        this.I = 1.0f;
        this.K = new nk0(this, 1);
        this.O = true;
        pk0 pk0Var = new pk0(this, context, 0);
        this.f27745a = pk0Var;
        pk0 pk0Var2 = new pk0(this, context, 1);
        this.f27746b = pk0Var2;
        pk0Var.getImageReceiver().setAutoRepeat(0);
        pk0Var.getImageReceiver().setAllowStartLottieAnimation(false);
        pk0 pk0Var3 = new pk0(this, context, 2);
        this.f27747c = pk0Var3;
        addView(pk0Var, w7.y5.e(34, 34, 17));
        addView(pk0Var3, w7.y5.e(34, 34, 17));
        addView(pk0Var2, w7.y5.e(34, 34, 17));
        if (sk0Var.M0 == 4) {
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setDuration(100L);
            layoutTransition.enableTransitionType(4);
            setLayoutTransition(layoutTransition);
        }
        pk0Var.setLayerNum(Integer.MAX_VALUE);
        pk0Var2.setLayerNum(Integer.MAX_VALUE);
        pk0Var2.f29872a.setAutoRepeat(0);
        pk0Var2.f29872a.setAllowStartAnimation(false);
        pk0Var2.f29872a.setAllowStartLottieAnimation(false);
        pk0Var3.setLayerNum(Integer.MAX_VALUE);
    }

    public static void a(qk0 qk0Var, zg.o0 o0Var, int i10) {
        boolean z10;
        boolean z11;
        int i11;
        pk0 pk0Var = qk0Var.f27747c;
        pk0 pk0Var2 = qk0Var.f27745a;
        pk0 pk0Var3 = qk0Var.f27746b;
        sk0 sk0Var = qk0Var.P;
        qk0Var.f(o0Var, false);
        zg.o0 o0Var2 = qk0Var.e;
        if (o0Var2 != null && o0Var2.equals(o0Var)) {
            qk0Var.f27754y = i10;
            qk0Var.e(o0Var);
            return;
        }
        int i12 = sk0Var.J;
        org.telegram.ui.ActionBar.d6 d6Var = sk0Var.f28286k0;
        int i13 = sk0Var.M0;
        boolean isPremium = UserConfig.getInstance(i12).isPremium();
        if ((i13 == 3 && !isPremium) || (i13 == 5 && o0Var.d && !isPremium)) {
            z10 = true;
        } else {
            z10 = false;
        }
        qk0Var.H = z10;
        if (z10 && qk0Var.f27748f == null) {
            rg.b1 b1Var = new rg.b1(qk0Var.getContext(), 1, null);
            qk0Var.f27748f = b1Var;
            b1Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            qk0Var.f27748f.setImageReceiver(pk0Var3.getImageReceiver());
            qk0Var.addView(qk0Var.f27748f, w7.y5.d(18, 18.0f, 17, 8.0f, 8.0f, 0.0f, 0.0f));
        }
        rg.b1 b1Var2 = qk0Var.f27748f;
        if (b1Var2 != null) {
            if (qk0Var.H) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            b1Var2.setVisibility(i11);
        }
        qk0Var.d();
        qk0Var.e = o0Var;
        if (!o0Var.f49395a && (o0Var.f49398f == null || ((!sk0Var.q() && !sk0Var.G0) || !LiteMode.isEnabled(8200)))) {
            z11 = false;
        } else {
            z11 = true;
        }
        qk0Var.f27750r = z11;
        if (i13 == 4 || qk0Var.e.f49396b) {
            qk0Var.f27750r = false;
        }
        zg.o0 o0Var3 = qk0Var.e;
        if (!o0Var3.f49395a && o0Var3.f49398f == null) {
            pk0Var.getImageReceiver().clearImage();
            pk0Var3.getImageReceiver().clearImage();
            q5 q5Var = new q5(4, sk0Var.J, qk0Var.e.f49399g);
            q5 q5Var2 = new q5(3, sk0Var.J, qk0Var.e.f49399g);
            if (i13 != 1 && i13 != 2 && i13 != 4) {
                int i14 = org.telegram.ui.ActionBar.h6.f19392v6;
                int v02 = org.telegram.ui.ActionBar.h6.v0(i14, d6Var);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                q5Var.setColorFilter(new PorterDuffColorFilter(v02, mode));
                q5Var2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(i14, d6Var), mode));
            } else {
                PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
                q5Var.setColorFilter(new PorterDuffColorFilter(-1, mode2));
                q5Var2.setColorFilter(new PorterDuffColorFilter(-1, mode2));
            }
            pk0Var.setAnimatedEmojiDrawable(q5Var);
            pk0Var3.setAnimatedEmojiDrawable(q5Var2);
            rg.b1 b1Var3 = qk0Var.f27748f;
            if (b1Var3 != null) {
                b1Var3.setAnimatedEmojiDrawable(q5Var2);
            }
        } else {
            qk0Var.e(o0Var);
            pk0Var.setAnimatedEmojiDrawable(null);
            if (pk0Var2.getImageReceiver().getLottieAnimation() != null) {
                pk0Var2.getImageReceiver().getLottieAnimation().N(0, false, false);
            }
            rg.b1 b1Var4 = qk0Var.f27748f;
            if (b1Var4 != null) {
                b1Var4.setAnimatedEmojiDrawable(null);
            }
        }
        qk0Var.setFocusable(true);
        boolean z12 = qk0Var.f27750r;
        qk0Var.f27751s = z12;
        if (!z12) {
            pk0Var2.setVisibility(8);
            pk0Var3.setVisibility(0);
            qk0Var.v = true;
        } else {
            qk0Var.v = false;
            pk0Var2.setVisibility(0);
            pk0Var3.setVisibility(8);
        }
        ViewGroup.LayoutParams layoutParams = pk0Var3.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = pk0Var3.getLayoutParams();
        int dp = AndroidUtilities.dp(34.0f);
        layoutParams2.height = dp;
        layoutParams.width = dp;
        ViewGroup.LayoutParams layoutParams3 = pk0Var2.getLayoutParams();
        ViewGroup.LayoutParams layoutParams4 = pk0Var2.getLayoutParams();
        int dp2 = AndroidUtilities.dp(34.0f);
        layoutParams4.height = dp2;
        layoutParams3.width = dp2;
    }

    public final void b() {
        ImageReceiver imageReceiver;
        pk0 pk0Var = this.f27746b;
        q5 q5Var = pk0Var.e;
        if (q5Var != null) {
            imageReceiver = q5Var.f27544k;
        } else {
            imageReceiver = pk0Var.f29872a;
        }
        if (imageReceiver != null && imageReceiver.getLottieAnimation() != null) {
            sk0 sk0Var = this.P;
            if (sk0Var.f28303x0 == null && !this.N && sk0Var.G0) {
                if (imageReceiver.getLottieAnimation().f25716a0 <= 2) {
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
        if (!this.P.f28284j0) {
            d();
            this.f27749n = true;
            if (!this.f27750r) {
                this.f27746b.setVisibility(0);
                pk0 pk0Var = this.f27746b;
                float f12 = this.I;
                if (this.f27752w) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                pk0Var.setScaleY(f12 * f10);
                pk0 pk0Var2 = this.f27746b;
                float f13 = this.I;
                if (!this.f27752w) {
                    f11 = 1.0f;
                }
                pk0Var2.setScaleX(f13 * f11);
                return;
            }
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.G);
        if (this.f27750r) {
            if (this.f27745a.getImageReceiver().getLottieAnimation() != null && !this.f27745a.getImageReceiver().getLottieAnimation().y() && !this.f27749n) {
                this.f27749n = true;
                if (i10 == 0) {
                    this.E = false;
                    this.f27745a.getImageReceiver().getLottieAnimation().stop();
                    this.f27745a.getImageReceiver().getLottieAnimation().N(0, false, false);
                    this.G.run();
                    return;
                }
                this.E = true;
                this.f27745a.getImageReceiver().getLottieAnimation().stop();
                this.f27745a.getImageReceiver().getLottieAnimation().N(0, false, false);
                AndroidUtilities.runOnUIThread(this.G, i10);
                return;
            }
            if (this.f27745a.getImageReceiver().getLottieAnimation() != null && this.f27749n && !this.f27745a.getImageReceiver().getLottieAnimation().f25729k0 && !this.f27745a.getImageReceiver().getLottieAnimation().y()) {
                this.f27745a.getImageReceiver().getLottieAnimation().N(this.f27745a.getImageReceiver().getLottieAnimation().e[0] - 1, false, false);
            }
            pk0 pk0Var3 = this.f27746b;
            float f14 = this.I;
            if (this.f27752w) {
                f7 = 0.76f;
            } else {
                f7 = 1.0f;
            }
            pk0Var3.setScaleY(f14 * f7);
            pk0 pk0Var4 = this.f27746b;
            float f15 = this.I;
            if (!this.f27752w) {
                f11 = 1.0f;
            }
            pk0Var4.setScaleX(f15 * f11);
        } else if (!this.f27749n) {
            this.I = 0.0f;
            this.f27746b.setScaleX(0.0f);
            this.f27746b.setScaleY(0.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.J = ofFloat;
            ofFloat.addUpdateListener(new u70(this, 9));
            this.J.setDuration(150L);
            this.J.setInterpolator(sr.h);
            this.J.setStartDelay(i10 * this.P.f28268c);
            this.J.start();
            this.f27749n = true;
        }
    }

    public final void d() {
        float f7;
        float f10;
        boolean z10 = this.f27750r;
        sk0 sk0Var = this.P;
        float f11 = 1.0f;
        pk0 pk0Var = this.f27746b;
        if (z10) {
            AndroidUtilities.cancelRunOnUIThread(this.G);
            pk0 pk0Var2 = this.f27745a;
            if (pk0Var2.getImageReceiver().getLottieAnimation() != null && !pk0Var2.getImageReceiver().getLottieAnimation().y()) {
                pk0Var2.getImageReceiver().getLottieAnimation().stop();
                if (sk0Var.f28284j0) {
                    pk0Var2.getImageReceiver().getLottieAnimation().N(0, false, true);
                } else {
                    pk0Var2.getImageReceiver().getLottieAnimation().N(pk0Var2.getImageReceiver().getLottieAnimation().e[0] - 1, false, true);
                }
            }
            pk0Var.setVisibility(4);
            pk0Var2.setVisibility(0);
            this.v = false;
            float f12 = this.I;
            if (this.f27752w) {
                f10 = 0.76f;
            } else {
                f10 = 1.0f;
            }
            pk0Var.setScaleY(f12 * f10);
            float f13 = this.I;
            if (this.f27752w) {
                f11 = 0.76f;
            }
            pk0Var.setScaleX(f13 * f11);
        } else {
            pk0Var.animate().cancel();
            if (sk0Var.N0) {
                float f14 = this.I;
                if (this.f27752w) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                pk0Var.setScaleY(f14 * f7);
                float f15 = this.I;
                if (this.f27752w) {
                    f11 = 0.76f;
                }
                pk0Var.setScaleX(f15 * f11);
            } else {
                pk0Var.setScaleY(0.0f);
                pk0Var.setScaleX(0.0f);
            }
        }
        this.f27749n = false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        int i10;
        ai.l4 l4Var;
        Paint paint;
        if (this.f27752w && this.f27753x) {
            float measuredWidth = getMeasuredWidth() >> 1;
            float measuredHeight = getMeasuredHeight() >> 1;
            float measuredWidth2 = (getMeasuredWidth() >> 1) - AndroidUtilities.dp(1.0f);
            zg.o0 o0Var = this.e;
            sk0 sk0Var = this.P;
            if (o0Var != null && o0Var.f49395a) {
                paint = sk0Var.I0;
            } else {
                paint = sk0Var.H0;
            }
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth2, paint);
        }
        q5 q5Var = this.f27746b.e;
        if (q5Var != null && (l4Var = q5Var.f27544k) != null) {
            int i11 = 0;
            if (this.f27754y == 0) {
                l4Var.setRoundRadius(AndroidUtilities.dp(6.0f), 0, 0, AndroidUtilities.dp(6.0f));
            } else {
                if (this.f27752w) {
                    i11 = AndroidUtilities.dp(6.0f);
                }
                l4Var.setRoundRadius(i11);
            }
        }
        zg.o0 o0Var2 = this.e;
        if (o0Var2 != null && o0Var2.f49395a && this.F != null && LiteMode.isEnabled(8200) && LiteMode.isEnabled(131072)) {
            RectF rectF = AndroidUtilities.rectTmp;
            float height = ((int) (getHeight() * 0.7f)) / 2.0f;
            rectF.set((getWidth() / 2.0f) - height, (getHeight() / 2.0f) - height, (getWidth() / 2.0f) + height, (getHeight() / 2.0f) + height);
            kj0 lottieAnimation = this.f27745a.getImageReceiver().getLottieAnimation();
            yh.i8 i8Var = this.F;
            if (lottieAnimation != null && (i10 = lottieAnimation.f25716a0) > 30) {
                f7 = Utilities.clamp01((i10 - 30) / 30.0f);
            } else {
                f7 = 0.0f;
            }
            i8Var.f47533j = (int) (i8Var.f47528b.size() * f7);
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
        sk0 sk0Var = this.P;
        int i11 = sk0Var.M0;
        pk0 pk0Var = this.f27745a;
        pk0 pk0Var2 = this.f27746b;
        if (o0Var != null && o0Var.f49395a) {
            pk0Var.getImageReceiver().setImageBitmap(new kj0(R.raw.star_reaction, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f)));
            pk0Var2.getImageReceiver().setImageBitmap(getContext().getResources().getDrawable(R.drawable.star_reaction));
            if (this.F == null) {
                if (SharedConfig.getDevicePerformanceClass() == 2) {
                    i10 = 45;
                } else {
                    i10 = 18;
                }
                this.F = new yh.i8(1, i10);
            }
        } else if (i11 == 4 && o0Var != null && o0Var.f49398f != null) {
            pk0Var.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(o0Var.f49398f));
            pk0Var2.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(o0Var.f49398f));
        } else {
            zg.o0 o0Var2 = this.e;
            if (o0Var2.f49396b) {
                TLRPC.Document effectDocument = MessagesController.getInstance(sk0Var.J).getEffectDocument(this.e.f49399g);
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(effectDocument, org.telegram.ui.ActionBar.h6.f19225m6, 0.2f);
                ImageReceiver imageReceiver = pk0Var2.getImageReceiver();
                ImageLocation forDocument = ImageLocation.getForDocument(effectDocument);
                if (this.f27750r) {
                    svgDrawable4 = null;
                } else {
                    svgDrawable4 = svgThumb;
                }
                imageReceiver.setImage(forDocument, "60_60_firstframe", null, null, svgDrawable4, 0L, "tgs", this.e, 0);
            } else if (o0Var2.f49398f != null) {
                TLRPC.TL_availableReaction tL_availableReaction2 = MediaDataController.getInstance(sk0Var.J).getReactionsMap().get(this.e.f49398f);
                if (tL_availableReaction2 != null) {
                    SvgHelper.SvgDrawable svgThumb2 = DocumentObject.getSvgThumb(tL_availableReaction2.activate_animation, org.telegram.ui.ActionBar.h6.f19225m6, 0.2f);
                    if (!LiteMode.isEnabled(8200) || i11 == 4) {
                        tL_availableReaction = tL_availableReaction2;
                        if (SharedConfig.getDevicePerformanceClass() > 0 && i11 != 4) {
                            pk0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.appear_animation), "30_30_nolimit", null, null, svgThumb2, 0L, "tgs", o0Var, 0);
                            ImageReceiver imageReceiver2 = pk0Var2.getImageReceiver();
                            ImageLocation forDocument2 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                            if (this.f27750r) {
                                svgDrawable2 = null;
                            } else {
                                svgDrawable2 = svgThumb2;
                            }
                            imageReceiver2.setImage(forDocument2, "60_60_firstframe", null, null, svgDrawable2, 0L, "tgs", this.e, 0);
                        } else {
                            ImageReceiver imageReceiver3 = pk0Var2.getImageReceiver();
                            ImageLocation forDocument3 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                            if (this.f27750r) {
                                svgDrawable = null;
                            } else {
                                svgDrawable = svgThumb2;
                            }
                            imageReceiver3.setImage(forDocument3, "60_60_firstframe", null, null, svgDrawable, 0L, "tgs", this.e, 0);
                        }
                    } else {
                        tL_availableReaction = tL_availableReaction2;
                        pk0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction2.appear_animation), "30_30_nolimit", null, null, svgThumb2, 0L, "tgs", o0Var, 0);
                        ImageReceiver imageReceiver4 = pk0Var2.getImageReceiver();
                        ImageLocation forDocument4 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                        if (this.f27750r) {
                            svgDrawable3 = null;
                        } else {
                            svgDrawable3 = svgThumb2;
                        }
                        imageReceiver4.setImage(forDocument4, "60_60_pcache", null, null, svgDrawable3, 0L, "tgs", this.e, 0);
                    }
                    if (pk0Var.getImageReceiver().getLottieAnimation() != null) {
                        pk0Var.getImageReceiver().getLottieAnimation().N(0, false, true);
                    }
                    this.f27747c.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, svgThumb2, 0L, "tgs", o0Var, 0);
                    ImageReceiver imageReceiver5 = this.d;
                    imageReceiver5.setAllowStartLottieAnimation(false);
                    MediaDataController.getInstance(sk0Var.J).preloadImage(imageReceiver5, ImageLocation.getForDocument(tL_availableReaction.around_animation), zg.k0.a());
                }
                rg.b1 b1Var = this.f27748f;
                if (b1Var != null) {
                    b1Var.setImageReceiver(pk0Var2.getImageReceiver());
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
        boolean z11 = this.f27752w;
        boolean contains = this.P.f28271d0.contains(o0Var);
        this.f27752w = contains;
        if (contains != z11) {
            pk0 pk0Var = this.f27745a;
            pk0 pk0Var2 = this.f27746b;
            float f15 = 1.0f;
            if (!z10) {
                float f16 = this.I;
                if (contains) {
                    f12 = 0.76f;
                } else {
                    f12 = 1.0f;
                }
                pk0Var2.setScaleX(f16 * f12);
                float f17 = this.I;
                if (this.f27752w) {
                    f13 = 0.76f;
                } else {
                    f13 = 1.0f;
                }
                pk0Var2.setScaleY(f17 * f13);
                float f18 = this.I;
                if (this.f27752w) {
                    f14 = 0.76f;
                } else {
                    f14 = 1.0f;
                }
                pk0Var.setScaleX(f18 * f14);
                float f19 = this.I;
                if (this.f27752w) {
                    f15 = 0.76f;
                }
                pk0Var.setScaleY(f19 * f15);
            } else {
                ViewPropertyAnimator animate = pk0Var2.animate();
                float f20 = this.I;
                if (this.f27752w) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f20 * f7);
                float f21 = this.I;
                if (this.f27752w) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator duration = scaleX.scaleY(f21 * f10).setDuration(240L);
                sr srVar = sr.h;
                duration.setInterpolator(srVar).start();
                ViewPropertyAnimator animate2 = pk0Var.animate();
                float f22 = this.I;
                if (this.f27752w) {
                    f11 = 0.76f;
                } else {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator scaleX2 = animate2.scaleX(f22 * f11);
                float f23 = this.I;
                if (this.f27752w) {
                    f15 = 0.76f;
                }
                scaleX2.scaleY(f23 * f15).setDuration(240L).setInterpolator(srVar).start();
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
            String str = o0Var.f49398f;
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
        rk0 rk0Var;
        if (this.O) {
            sk0 sk0Var = this.P;
            if (sk0Var.Q == null) {
                int action = motionEvent.getAction();
                nk0 nk0Var = this.K;
                if (action == 0) {
                    this.N = true;
                    this.L = motionEvent.getX();
                    this.M = motionEvent.getY();
                    if (this.h == 1.0f && !this.H && (i10 = sk0Var.M0) != 3 && i10 != 4 && i10 != 5 && ((rk0Var = sk0Var.f28278g0) == null || rk0Var.j())) {
                        AndroidUtilities.runOnUIThread(nk0Var, ViewConfiguration.getLongPressTimeout());
                    }
                }
                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 2.0f;
                if ((motionEvent.getAction() != 2 || (Math.abs(this.L - motionEvent.getX()) <= scaledTouchSlop && Math.abs(this.M - motionEvent.getY()) <= scaledTouchSlop)) && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return true;
                }
                if (motionEvent.getAction() == 1 && this.N && ((sk0Var.f28287l0 == null || sk0Var.f28289n0 > 0.8f) && sk0Var.f28278g0 != null)) {
                    sk0Var.f28294r0 = true;
                    if (System.currentTimeMillis() - sk0Var.f28296s0 > 300) {
                        sk0Var.f28296s0 = System.currentTimeMillis();
                        rk0 rk0Var2 = sk0Var.f28278g0;
                        zg.o0 o0Var = this.e;
                        if (sk0Var.f28289n0 > 0.8f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        rk0Var2.h(this, o0Var, z10, false);
                    }
                }
                if (!sk0Var.f28294r0 && sk0Var.f28287l0 != null) {
                    sk0Var.f28290o0 = 0.0f;
                    float f7 = sk0Var.f28289n0;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    sk0Var.Q = ofFloat;
                    ofFloat.addUpdateListener(new gk0(sk0Var, f7));
                    sk0Var.Q.addListener(new ci.u5(sk0Var, 2));
                    sk0Var.Q.setDuration(150L);
                    sk0Var.Q.setInterpolator(sr.f28346f);
                    sk0Var.Q.start();
                }
                AndroidUtilities.cancelRunOnUIThread(nk0Var);
                this.N = false;
                return true;
            }
        }
        return false;
    }
}
