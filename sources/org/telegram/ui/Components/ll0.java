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
public final class ll0 extends FrameLayout {
    public boolean E;
    public yh.b8 F;
    public final il0 G;
    public boolean H;
    public float I;
    public ValueAnimator J;
    public final il0 K;
    public float L;
    public float M;
    public boolean N;
    public boolean O;
    public final nl0 P;
    public final kl0 f28229a;
    public final kl0 f28230b;
    public final kl0 f28231c;
    public final ImageReceiver d;
    public zg.n0 f28232e;
    public rg.c1 f28233f;
    public float h;
    public boolean f28234n;
    public boolean f28235r;
    public boolean f28236s;
    public boolean v;
    public boolean f28237w;
    public boolean f28238x;
    public int f28239y;

    public ll0(nl0 nl0Var, Context context) {
        super(context);
        this.P = nl0Var;
        this.d = new ImageReceiver();
        this.h = 1.0f;
        this.f28238x = true;
        this.G = new il0(this, 0);
        this.I = 1.0f;
        this.K = new il0(this, 1);
        this.O = true;
        kl0 kl0Var = new kl0(this, context, 0);
        this.f28229a = kl0Var;
        kl0 kl0Var2 = new kl0(this, context, 1);
        this.f28230b = kl0Var2;
        kl0Var.getImageReceiver().setAutoRepeat(0);
        kl0Var.getImageReceiver().setAllowStartLottieAnimation(false);
        kl0 kl0Var3 = new kl0(this, context, 2);
        this.f28231c = kl0Var3;
        addView(kl0Var, w7.w5.e(34, 34, 17));
        addView(kl0Var3, w7.w5.e(34, 34, 17));
        addView(kl0Var2, w7.w5.e(34, 34, 17));
        if (nl0Var.M0 == 4) {
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setDuration(100L);
            layoutTransition.enableTransitionType(4);
            setLayoutTransition(layoutTransition);
        }
        kl0Var.setLayerNum(Integer.MAX_VALUE);
        kl0Var2.setLayerNum(Integer.MAX_VALUE);
        kl0Var2.f33001a.setAutoRepeat(0);
        kl0Var2.f33001a.setAllowStartAnimation(false);
        kl0Var2.f33001a.setAllowStartLottieAnimation(false);
        kl0Var3.setLayerNum(Integer.MAX_VALUE);
    }

    public static void a(ll0 ll0Var, zg.n0 n0Var, int i10) {
        boolean z10;
        boolean z11;
        int i11;
        kl0 kl0Var = ll0Var.f28231c;
        kl0 kl0Var2 = ll0Var.f28229a;
        kl0 kl0Var3 = ll0Var.f28230b;
        nl0 nl0Var = ll0Var.P;
        ll0Var.f(n0Var, false);
        zg.n0 n0Var2 = ll0Var.f28232e;
        if (n0Var2 != null && n0Var2.equals(n0Var)) {
            ll0Var.f28239y = i10;
            ll0Var.e(n0Var);
            return;
        }
        int i12 = nl0Var.J;
        org.telegram.ui.ActionBar.c6 c6Var = nl0Var.f28845k0;
        int i13 = nl0Var.M0;
        boolean isPremium = UserConfig.getInstance(i12).isPremium();
        if ((i13 == 3 && !isPremium) || (i13 == 5 && n0Var.d && !isPremium)) {
            z10 = true;
        } else {
            z10 = false;
        }
        ll0Var.H = z10;
        if (z10 && ll0Var.f28233f == null) {
            rg.c1 c1Var = new rg.c1(ll0Var.getContext(), 1, null);
            ll0Var.f28233f = c1Var;
            c1Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            ll0Var.f28233f.setImageReceiver(kl0Var3.getImageReceiver());
            ll0Var.addView(ll0Var.f28233f, w7.w5.a(18.0f, 8.0f, 8.0f, 0.0f, 0.0f, 18, 17));
        }
        rg.c1 c1Var2 = ll0Var.f28233f;
        if (c1Var2 != null) {
            if (ll0Var.H) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            c1Var2.setVisibility(i11);
        }
        ll0Var.d();
        ll0Var.f28232e = n0Var;
        if (!n0Var.f54837a && (n0Var.f54841f == null || ((!nl0Var.q() && !nl0Var.G0) || !LiteMode.isEnabled(8200)))) {
            z11 = false;
        } else {
            z11 = true;
        }
        ll0Var.f28235r = z11;
        if (i13 == 4 || ll0Var.f28232e.f54838b) {
            ll0Var.f28235r = false;
        }
        zg.n0 n0Var3 = ll0Var.f28232e;
        if (!n0Var3.f54837a && n0Var3.f54841f == null) {
            kl0Var.getImageReceiver().clearImage();
            kl0Var3.getImageReceiver().clearImage();
            s5 s5Var = new s5(4, nl0Var.J, ll0Var.f28232e.f54842g);
            s5 s5Var2 = new s5(3, nl0Var.J, ll0Var.f28232e.f54842g);
            if (i13 != 1 && i13 != 2 && i13 != 4) {
                int i14 = org.telegram.ui.ActionBar.h6.f20892v6;
                int w02 = org.telegram.ui.ActionBar.h6.w0(i14, c6Var);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                s5Var.setColorFilter(new PorterDuffColorFilter(w02, mode));
                s5Var2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i14, c6Var), mode));
            } else {
                PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
                s5Var.setColorFilter(new PorterDuffColorFilter(-1, mode2));
                s5Var2.setColorFilter(new PorterDuffColorFilter(-1, mode2));
            }
            kl0Var.setAnimatedEmojiDrawable(s5Var);
            kl0Var3.setAnimatedEmojiDrawable(s5Var2);
            rg.c1 c1Var3 = ll0Var.f28233f;
            if (c1Var3 != null) {
                c1Var3.setAnimatedEmojiDrawable(s5Var2);
            }
        } else {
            ll0Var.e(n0Var);
            kl0Var.setAnimatedEmojiDrawable(null);
            if (kl0Var2.getImageReceiver().getLottieAnimation() != null) {
                kl0Var2.getImageReceiver().getLottieAnimation().N(0, false, false);
            }
            rg.c1 c1Var4 = ll0Var.f28233f;
            if (c1Var4 != null) {
                c1Var4.setAnimatedEmojiDrawable(null);
            }
        }
        ll0Var.setFocusable(true);
        boolean z12 = ll0Var.f28235r;
        ll0Var.f28236s = z12;
        if (!z12) {
            kl0Var2.setVisibility(8);
            kl0Var3.setVisibility(0);
            ll0Var.v = true;
        } else {
            ll0Var.v = false;
            kl0Var2.setVisibility(0);
            kl0Var3.setVisibility(8);
        }
        ViewGroup.LayoutParams layoutParams = kl0Var3.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = kl0Var3.getLayoutParams();
        int dp = AndroidUtilities.dp(34.0f);
        layoutParams2.height = dp;
        layoutParams.width = dp;
        ViewGroup.LayoutParams layoutParams3 = kl0Var2.getLayoutParams();
        ViewGroup.LayoutParams layoutParams4 = kl0Var2.getLayoutParams();
        int dp2 = AndroidUtilities.dp(34.0f);
        layoutParams4.height = dp2;
        layoutParams3.width = dp2;
    }

    public final void b() {
        ImageReceiver imageReceiver;
        kl0 kl0Var = this.f28230b;
        s5 s5Var = kl0Var.f33004e;
        if (s5Var != null) {
            imageReceiver = s5Var.f30406k;
        } else {
            imageReceiver = kl0Var.f33001a;
        }
        if (imageReceiver != null && imageReceiver.getLottieAnimation() != null) {
            nl0 nl0Var = this.P;
            if (nl0Var.f28862x0 == null && !this.N && nl0Var.G0) {
                if (imageReceiver.getLottieAnimation().f26101a0 <= 2) {
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
        if (!this.P.f28843j0) {
            d();
            this.f28234n = true;
            if (!this.f28235r) {
                this.f28230b.setVisibility(0);
                kl0 kl0Var = this.f28230b;
                float f12 = this.I;
                if (this.f28237w) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                kl0Var.setScaleY(f12 * f10);
                kl0 kl0Var2 = this.f28230b;
                float f13 = this.I;
                if (!this.f28237w) {
                    f11 = 1.0f;
                }
                kl0Var2.setScaleX(f13 * f11);
                return;
            }
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.G);
        if (this.f28235r) {
            if (this.f28229a.getImageReceiver().getLottieAnimation() != null && !this.f28229a.getImageReceiver().getLottieAnimation().y() && !this.f28234n) {
                this.f28234n = true;
                if (i10 == 0) {
                    this.E = false;
                    this.f28229a.getImageReceiver().getLottieAnimation().stop();
                    this.f28229a.getImageReceiver().getLottieAnimation().N(0, false, false);
                    this.G.run();
                    return;
                }
                this.E = true;
                this.f28229a.getImageReceiver().getLottieAnimation().stop();
                this.f28229a.getImageReceiver().getLottieAnimation().N(0, false, false);
                AndroidUtilities.runOnUIThread(this.G, i10);
                return;
            }
            if (this.f28229a.getImageReceiver().getLottieAnimation() != null && this.f28234n && !this.f28229a.getImageReceiver().getLottieAnimation().f26115k0 && !this.f28229a.getImageReceiver().getLottieAnimation().y()) {
                this.f28229a.getImageReceiver().getLottieAnimation().N(this.f28229a.getImageReceiver().getLottieAnimation().f26107e[0] - 1, false, false);
            }
            kl0 kl0Var3 = this.f28230b;
            float f14 = this.I;
            if (this.f28237w) {
                f7 = 0.76f;
            } else {
                f7 = 1.0f;
            }
            kl0Var3.setScaleY(f14 * f7);
            kl0 kl0Var4 = this.f28230b;
            float f15 = this.I;
            if (!this.f28237w) {
                f11 = 1.0f;
            }
            kl0Var4.setScaleX(f15 * f11);
        } else if (!this.f28234n) {
            this.I = 0.0f;
            this.f28230b.setScaleX(0.0f);
            this.f28230b.setScaleY(0.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.J = ofFloat;
            ofFloat.addUpdateListener(new m80(this, 10));
            this.J.setDuration(150L);
            this.J.setInterpolator(js.h);
            this.J.setStartDelay(i10 * this.P.f28826c);
            this.J.start();
            this.f28234n = true;
        }
    }

    public final void d() {
        float f7;
        float f10;
        boolean z10 = this.f28235r;
        nl0 nl0Var = this.P;
        float f11 = 1.0f;
        kl0 kl0Var = this.f28230b;
        if (z10) {
            AndroidUtilities.cancelRunOnUIThread(this.G);
            kl0 kl0Var2 = this.f28229a;
            if (kl0Var2.getImageReceiver().getLottieAnimation() != null && !kl0Var2.getImageReceiver().getLottieAnimation().y()) {
                kl0Var2.getImageReceiver().getLottieAnimation().stop();
                if (nl0Var.f28843j0) {
                    kl0Var2.getImageReceiver().getLottieAnimation().N(0, false, true);
                } else {
                    kl0Var2.getImageReceiver().getLottieAnimation().N(kl0Var2.getImageReceiver().getLottieAnimation().f26107e[0] - 1, false, true);
                }
            }
            kl0Var.setVisibility(4);
            kl0Var2.setVisibility(0);
            this.v = false;
            float f12 = this.I;
            if (this.f28237w) {
                f10 = 0.76f;
            } else {
                f10 = 1.0f;
            }
            kl0Var.setScaleY(f12 * f10);
            float f13 = this.I;
            if (this.f28237w) {
                f11 = 0.76f;
            }
            kl0Var.setScaleX(f13 * f11);
        } else {
            kl0Var.animate().cancel();
            if (nl0Var.N0) {
                float f14 = this.I;
                if (this.f28237w) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                kl0Var.setScaleY(f14 * f7);
                float f15 = this.I;
                if (this.f28237w) {
                    f11 = 0.76f;
                }
                kl0Var.setScaleX(f15 * f11);
            } else {
                kl0Var.setScaleY(0.0f);
                kl0Var.setScaleX(0.0f);
            }
        }
        this.f28234n = false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        int i10;
        ai.m4 m4Var;
        Paint paint;
        if (this.f28237w && this.f28238x) {
            float measuredWidth = getMeasuredWidth() >> 1;
            float measuredHeight = getMeasuredHeight() >> 1;
            float measuredWidth2 = (getMeasuredWidth() >> 1) - AndroidUtilities.dp(1.0f);
            zg.n0 n0Var = this.f28232e;
            nl0 nl0Var = this.P;
            if (n0Var != null && n0Var.f54837a) {
                paint = nl0Var.I0;
            } else {
                paint = nl0Var.H0;
            }
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth2, paint);
        }
        s5 s5Var = this.f28230b.f33004e;
        if (s5Var != null && (m4Var = s5Var.f30406k) != null) {
            int i11 = 0;
            if (this.f28239y == 0) {
                m4Var.setRoundRadius(AndroidUtilities.dp(6.0f), 0, 0, AndroidUtilities.dp(6.0f));
            } else {
                if (this.f28237w) {
                    i11 = AndroidUtilities.dp(6.0f);
                }
                m4Var.setRoundRadius(i11);
            }
        }
        zg.n0 n0Var2 = this.f28232e;
        if (n0Var2 != null && n0Var2.f54837a && this.F != null && LiteMode.isEnabled(8200) && LiteMode.isEnabled(131072)) {
            RectF rectF = AndroidUtilities.rectTmp;
            float height = ((int) (getHeight() * 0.7f)) / 2.0f;
            rectF.set((getWidth() / 2.0f) - height, (getHeight() / 2.0f) - height, (getWidth() / 2.0f) + height, (getHeight() / 2.0f) + height);
            fk0 lottieAnimation = this.f28229a.getImageReceiver().getLottieAnimation();
            yh.b8 b8Var = this.F;
            if (lottieAnimation != null && (i10 = lottieAnimation.f26101a0) > 30) {
                f7 = Utilities.clamp01((i10 - 30) / 30.0f);
            } else {
                f7 = 0.0f;
            }
            b8Var.f52539j = (int) (b8Var.f52533b.size() * f7);
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
        nl0 nl0Var = this.P;
        int i11 = nl0Var.M0;
        kl0 kl0Var = this.f28229a;
        kl0 kl0Var2 = this.f28230b;
        if (n0Var != null && n0Var.f54837a) {
            kl0Var.getImageReceiver().setImageBitmap(new fk0(R.raw.star_reaction, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f)));
            kl0Var2.getImageReceiver().setImageBitmap(getContext().getResources().getDrawable(R.drawable.star_reaction));
            if (this.F == null) {
                if (SharedConfig.getDevicePerformanceClass() == 2) {
                    i10 = 45;
                } else {
                    i10 = 18;
                }
                this.F = new yh.b8(1, i10);
            }
        } else if (i11 == 4 && n0Var != null && n0Var.f54841f != null) {
            kl0Var.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(n0Var.f54841f));
            kl0Var2.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(n0Var.f54841f));
        } else {
            zg.n0 n0Var2 = this.f28232e;
            if (n0Var2.f54838b) {
                TLRPC.Document effectDocument = MessagesController.getInstance(nl0Var.J).getEffectDocument(this.f28232e.f54842g);
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(effectDocument, org.telegram.ui.ActionBar.h6.f20724m6, 0.2f);
                ImageReceiver imageReceiver = kl0Var2.getImageReceiver();
                ImageLocation forDocument = ImageLocation.getForDocument(effectDocument);
                if (this.f28235r) {
                    svgDrawable4 = null;
                } else {
                    svgDrawable4 = svgThumb;
                }
                imageReceiver.setImage(forDocument, "60_60_firstframe", null, null, svgDrawable4, 0L, "tgs", this.f28232e, 0);
            } else if (n0Var2.f54841f != null) {
                TLRPC.TL_availableReaction tL_availableReaction2 = MediaDataController.getInstance(nl0Var.J).getReactionsMap().get(this.f28232e.f54841f);
                if (tL_availableReaction2 != null) {
                    SvgHelper.SvgDrawable svgThumb2 = DocumentObject.getSvgThumb(tL_availableReaction2.activate_animation, org.telegram.ui.ActionBar.h6.f20724m6, 0.2f);
                    if (!LiteMode.isEnabled(8200) || i11 == 4) {
                        tL_availableReaction = tL_availableReaction2;
                        if (SharedConfig.getDevicePerformanceClass() > 0 && i11 != 4) {
                            kl0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.appear_animation), "30_30_nolimit", null, null, svgThumb2, 0L, "tgs", n0Var, 0);
                            ImageReceiver imageReceiver2 = kl0Var2.getImageReceiver();
                            ImageLocation forDocument2 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                            if (this.f28235r) {
                                svgDrawable2 = null;
                            } else {
                                svgDrawable2 = svgThumb2;
                            }
                            imageReceiver2.setImage(forDocument2, "60_60_firstframe", null, null, svgDrawable2, 0L, "tgs", this.f28232e, 0);
                        } else {
                            ImageReceiver imageReceiver3 = kl0Var2.getImageReceiver();
                            ImageLocation forDocument3 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                            if (this.f28235r) {
                                svgDrawable = null;
                            } else {
                                svgDrawable = svgThumb2;
                            }
                            imageReceiver3.setImage(forDocument3, "60_60_firstframe", null, null, svgDrawable, 0L, "tgs", this.f28232e, 0);
                        }
                    } else {
                        tL_availableReaction = tL_availableReaction2;
                        kl0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction2.appear_animation), "30_30_nolimit", null, null, svgThumb2, 0L, "tgs", n0Var, 0);
                        ImageReceiver imageReceiver4 = kl0Var2.getImageReceiver();
                        ImageLocation forDocument4 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                        if (this.f28235r) {
                            svgDrawable3 = null;
                        } else {
                            svgDrawable3 = svgThumb2;
                        }
                        imageReceiver4.setImage(forDocument4, "60_60_pcache", null, null, svgDrawable3, 0L, "tgs", this.f28232e, 0);
                    }
                    if (kl0Var.getImageReceiver().getLottieAnimation() != null) {
                        kl0Var.getImageReceiver().getLottieAnimation().N(0, false, true);
                    }
                    this.f28231c.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, svgThumb2, 0L, "tgs", n0Var, 0);
                    ImageReceiver imageReceiver5 = this.d;
                    imageReceiver5.setAllowStartLottieAnimation(false);
                    MediaDataController.getInstance(nl0Var.J).preloadImage(imageReceiver5, ImageLocation.getForDocument(tL_availableReaction.around_animation), zg.j0.a());
                }
                rg.c1 c1Var = this.f28233f;
                if (c1Var != null) {
                    c1Var.setImageReceiver(kl0Var2.getImageReceiver());
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
        boolean z11 = this.f28237w;
        boolean contains = this.P.f28829d0.contains(n0Var);
        this.f28237w = contains;
        if (contains != z11) {
            kl0 kl0Var = this.f28229a;
            kl0 kl0Var2 = this.f28230b;
            float f15 = 1.0f;
            if (!z10) {
                float f16 = this.I;
                if (contains) {
                    f12 = 0.76f;
                } else {
                    f12 = 1.0f;
                }
                kl0Var2.setScaleX(f16 * f12);
                float f17 = this.I;
                if (this.f28237w) {
                    f13 = 0.76f;
                } else {
                    f13 = 1.0f;
                }
                kl0Var2.setScaleY(f17 * f13);
                float f18 = this.I;
                if (this.f28237w) {
                    f14 = 0.76f;
                } else {
                    f14 = 1.0f;
                }
                kl0Var.setScaleX(f18 * f14);
                float f19 = this.I;
                if (this.f28237w) {
                    f15 = 0.76f;
                }
                kl0Var.setScaleY(f19 * f15);
            } else {
                ViewPropertyAnimator animate = kl0Var2.animate();
                float f20 = this.I;
                if (this.f28237w) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f20 * f7);
                float f21 = this.I;
                if (this.f28237w) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator duration = scaleX.scaleY(f21 * f10).setDuration(240L);
                js jsVar = js.h;
                duration.setInterpolator(jsVar).start();
                ViewPropertyAnimator animate2 = kl0Var.animate();
                float f22 = this.I;
                if (this.f28237w) {
                    f11 = 0.76f;
                } else {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator scaleX2 = animate2.scaleX(f22 * f11);
                float f23 = this.I;
                if (this.f28237w) {
                    f15 = 0.76f;
                }
                scaleX2.scaleY(f23 * f15).setDuration(240L).setInterpolator(jsVar).start();
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
        zg.n0 n0Var = this.f28232e;
        if (n0Var != null) {
            String str = n0Var.f54841f;
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
        ml0 ml0Var;
        if (this.O) {
            nl0 nl0Var = this.P;
            if (nl0Var.Q == null) {
                int action = motionEvent.getAction();
                il0 il0Var = this.K;
                if (action == 0) {
                    this.N = true;
                    this.L = motionEvent.getX();
                    this.M = motionEvent.getY();
                    if (this.h == 1.0f && !this.H && (i10 = nl0Var.M0) != 3 && i10 != 4 && i10 != 5 && ((ml0Var = nl0Var.f28837g0) == null || ml0Var.j())) {
                        AndroidUtilities.runOnUIThread(il0Var, ViewConfiguration.getLongPressTimeout());
                    }
                }
                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 2.0f;
                if ((motionEvent.getAction() != 2 || (Math.abs(this.L - motionEvent.getX()) <= scaledTouchSlop && Math.abs(this.M - motionEvent.getY()) <= scaledTouchSlop)) && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return true;
                }
                if (motionEvent.getAction() == 1 && this.N && ((nl0Var.f28846l0 == null || nl0Var.f28848n0 > 0.8f) && nl0Var.f28837g0 != null)) {
                    nl0Var.f28853r0 = true;
                    if (System.currentTimeMillis() - nl0Var.f28855s0 > 300) {
                        nl0Var.f28855s0 = System.currentTimeMillis();
                        ml0 ml0Var2 = nl0Var.f28837g0;
                        zg.n0 n0Var = this.f28232e;
                        if (nl0Var.f28848n0 > 0.8f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        ml0Var2.h(this, n0Var, z10, false);
                    }
                }
                if (!nl0Var.f28853r0 && nl0Var.f28846l0 != null) {
                    nl0Var.f28849o0 = 0.0f;
                    float f7 = nl0Var.f28848n0;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    nl0Var.Q = ofFloat;
                    ofFloat.addUpdateListener(new bl0(nl0Var, f7));
                    nl0Var.Q.addListener(new ci.t5(nl0Var, 2));
                    nl0Var.Q.setDuration(150L);
                    nl0Var.Q.setInterpolator(js.f27627f);
                    nl0Var.Q.start();
                }
                AndroidUtilities.cancelRunOnUIThread(il0Var);
                this.N = false;
                return true;
            }
        }
        return false;
    }
}
