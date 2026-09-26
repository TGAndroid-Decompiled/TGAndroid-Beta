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
public final class ok0 extends FrameLayout {
    public boolean E;
    public yh.i8 F;
    public final lk0 G;
    public boolean H;
    public float I;
    public ValueAnimator J;
    public final lk0 K;
    public float L;
    public float M;
    public boolean N;
    public boolean O;
    public final qk0 P;
    public final nk0 f27102a;
    public final nk0 f27103b;
    public final nk0 f27104c;
    public final ImageReceiver d;
    public zg.o0 e;
    public rg.b1 f27105f;
    public float h;
    public boolean f27106n;
    public boolean f27107r;
    public boolean f27108s;
    public boolean v;
    public boolean f27109w;
    public boolean f27110x;
    public int f27111y;

    public ok0(qk0 qk0Var, Context context) {
        super(context);
        this.P = qk0Var;
        this.d = new ImageReceiver();
        this.h = 1.0f;
        this.f27110x = true;
        this.G = new lk0(this, 0);
        this.I = 1.0f;
        this.K = new lk0(this, 1);
        this.O = true;
        nk0 nk0Var = new nk0(this, context, 0);
        this.f27102a = nk0Var;
        nk0 nk0Var2 = new nk0(this, context, 1);
        this.f27103b = nk0Var2;
        nk0Var.getImageReceiver().setAutoRepeat(0);
        nk0Var.getImageReceiver().setAllowStartLottieAnimation(false);
        nk0 nk0Var3 = new nk0(this, context, 2);
        this.f27104c = nk0Var3;
        addView(nk0Var, w7.y5.e(34, 34, 17));
        addView(nk0Var3, w7.y5.e(34, 34, 17));
        addView(nk0Var2, w7.y5.e(34, 34, 17));
        if (qk0Var.M0 == 4) {
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setDuration(100L);
            layoutTransition.enableTransitionType(4);
            setLayoutTransition(layoutTransition);
        }
        nk0Var.setLayerNum(Integer.MAX_VALUE);
        nk0Var2.setLayerNum(Integer.MAX_VALUE);
        nk0Var2.f29942a.setAutoRepeat(0);
        nk0Var2.f29942a.setAllowStartAnimation(false);
        nk0Var2.f29942a.setAllowStartLottieAnimation(false);
        nk0Var3.setLayerNum(Integer.MAX_VALUE);
    }

    public static void a(ok0 ok0Var, zg.o0 o0Var, int i10) {
        boolean z10;
        boolean z11;
        int i11;
        nk0 nk0Var = ok0Var.f27104c;
        nk0 nk0Var2 = ok0Var.f27102a;
        nk0 nk0Var3 = ok0Var.f27103b;
        qk0 qk0Var = ok0Var.P;
        ok0Var.f(o0Var, false);
        zg.o0 o0Var2 = ok0Var.e;
        if (o0Var2 != null && o0Var2.equals(o0Var)) {
            ok0Var.f27111y = i10;
            ok0Var.e(o0Var);
            return;
        }
        int i12 = qk0Var.J;
        org.telegram.ui.ActionBar.d6 d6Var = qk0Var.f27676k0;
        int i13 = qk0Var.M0;
        boolean isPremium = UserConfig.getInstance(i12).isPremium();
        if ((i13 == 3 && !isPremium) || (i13 == 5 && o0Var.d && !isPremium)) {
            z10 = true;
        } else {
            z10 = false;
        }
        ok0Var.H = z10;
        if (z10 && ok0Var.f27105f == null) {
            rg.b1 b1Var = new rg.b1(ok0Var.getContext(), 1, null);
            ok0Var.f27105f = b1Var;
            b1Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            ok0Var.f27105f.setImageReceiver(nk0Var3.getImageReceiver());
            ok0Var.addView(ok0Var.f27105f, w7.y5.d(18, 18.0f, 17, 8.0f, 8.0f, 0.0f, 0.0f));
        }
        rg.b1 b1Var2 = ok0Var.f27105f;
        if (b1Var2 != null) {
            if (ok0Var.H) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            b1Var2.setVisibility(i11);
        }
        ok0Var.d();
        ok0Var.e = o0Var;
        if (!o0Var.f49393a && (o0Var.f49396f == null || ((!qk0Var.q() && !qk0Var.G0) || !LiteMode.isEnabled(8200)))) {
            z11 = false;
        } else {
            z11 = true;
        }
        ok0Var.f27107r = z11;
        if (i13 == 4 || ok0Var.e.f49394b) {
            ok0Var.f27107r = false;
        }
        zg.o0 o0Var3 = ok0Var.e;
        if (!o0Var3.f49393a && o0Var3.f49396f == null) {
            nk0Var.getImageReceiver().clearImage();
            nk0Var3.getImageReceiver().clearImage();
            q5 q5Var = new q5(4, qk0Var.J, ok0Var.e.f49397g);
            q5 q5Var2 = new q5(3, qk0Var.J, ok0Var.e.f49397g);
            if (i13 != 1 && i13 != 2 && i13 != 4) {
                int i14 = org.telegram.ui.ActionBar.h6.f19390v6;
                int v02 = org.telegram.ui.ActionBar.h6.v0(i14, d6Var);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                q5Var.setColorFilter(new PorterDuffColorFilter(v02, mode));
                q5Var2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(i14, d6Var), mode));
            } else {
                PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
                q5Var.setColorFilter(new PorterDuffColorFilter(-1, mode2));
                q5Var2.setColorFilter(new PorterDuffColorFilter(-1, mode2));
            }
            nk0Var.setAnimatedEmojiDrawable(q5Var);
            nk0Var3.setAnimatedEmojiDrawable(q5Var2);
            rg.b1 b1Var3 = ok0Var.f27105f;
            if (b1Var3 != null) {
                b1Var3.setAnimatedEmojiDrawable(q5Var2);
            }
        } else {
            ok0Var.e(o0Var);
            nk0Var.setAnimatedEmojiDrawable(null);
            if (nk0Var2.getImageReceiver().getLottieAnimation() != null) {
                nk0Var2.getImageReceiver().getLottieAnimation().N(0, false, false);
            }
            rg.b1 b1Var4 = ok0Var.f27105f;
            if (b1Var4 != null) {
                b1Var4.setAnimatedEmojiDrawable(null);
            }
        }
        ok0Var.setFocusable(true);
        boolean z12 = ok0Var.f27107r;
        ok0Var.f27108s = z12;
        if (!z12) {
            nk0Var2.setVisibility(8);
            nk0Var3.setVisibility(0);
            ok0Var.v = true;
        } else {
            ok0Var.v = false;
            nk0Var2.setVisibility(0);
            nk0Var3.setVisibility(8);
        }
        ViewGroup.LayoutParams layoutParams = nk0Var3.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = nk0Var3.getLayoutParams();
        int dp = AndroidUtilities.dp(34.0f);
        layoutParams2.height = dp;
        layoutParams.width = dp;
        ViewGroup.LayoutParams layoutParams3 = nk0Var2.getLayoutParams();
        ViewGroup.LayoutParams layoutParams4 = nk0Var2.getLayoutParams();
        int dp2 = AndroidUtilities.dp(34.0f);
        layoutParams4.height = dp2;
        layoutParams3.width = dp2;
    }

    public final void b() {
        ImageReceiver imageReceiver;
        nk0 nk0Var = this.f27103b;
        q5 q5Var = nk0Var.e;
        if (q5Var != null) {
            imageReceiver = q5Var.f27504k;
        } else {
            imageReceiver = nk0Var.f29942a;
        }
        if (imageReceiver != null && imageReceiver.getLottieAnimation() != null) {
            qk0 qk0Var = this.P;
            if (qk0Var.f27693x0 == null && !this.N && qk0Var.G0) {
                if (imageReceiver.getLottieAnimation().f25068a0 <= 2) {
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
        if (!this.P.f27674j0) {
            d();
            this.f27106n = true;
            if (!this.f27107r) {
                this.f27103b.setVisibility(0);
                nk0 nk0Var = this.f27103b;
                float f12 = this.I;
                if (this.f27109w) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                nk0Var.setScaleY(f12 * f10);
                nk0 nk0Var2 = this.f27103b;
                float f13 = this.I;
                if (!this.f27109w) {
                    f11 = 1.0f;
                }
                nk0Var2.setScaleX(f13 * f11);
                return;
            }
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.G);
        if (this.f27107r) {
            if (this.f27102a.getImageReceiver().getLottieAnimation() != null && !this.f27102a.getImageReceiver().getLottieAnimation().y() && !this.f27106n) {
                this.f27106n = true;
                if (i10 == 0) {
                    this.E = false;
                    this.f27102a.getImageReceiver().getLottieAnimation().stop();
                    this.f27102a.getImageReceiver().getLottieAnimation().N(0, false, false);
                    this.G.run();
                    return;
                }
                this.E = true;
                this.f27102a.getImageReceiver().getLottieAnimation().stop();
                this.f27102a.getImageReceiver().getLottieAnimation().N(0, false, false);
                AndroidUtilities.runOnUIThread(this.G, i10);
                return;
            }
            if (this.f27102a.getImageReceiver().getLottieAnimation() != null && this.f27106n && !this.f27102a.getImageReceiver().getLottieAnimation().f25081k0 && !this.f27102a.getImageReceiver().getLottieAnimation().y()) {
                this.f27102a.getImageReceiver().getLottieAnimation().N(this.f27102a.getImageReceiver().getLottieAnimation().e[0] - 1, false, false);
            }
            nk0 nk0Var3 = this.f27103b;
            float f14 = this.I;
            if (this.f27109w) {
                f7 = 0.76f;
            } else {
                f7 = 1.0f;
            }
            nk0Var3.setScaleY(f14 * f7);
            nk0 nk0Var4 = this.f27103b;
            float f15 = this.I;
            if (!this.f27109w) {
                f11 = 1.0f;
            }
            nk0Var4.setScaleX(f15 * f11);
        } else if (!this.f27106n) {
            this.I = 0.0f;
            this.f27103b.setScaleX(0.0f);
            this.f27103b.setScaleY(0.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.J = ofFloat;
            ofFloat.addUpdateListener(new s70(this, 9));
            this.J.setDuration(150L);
            this.J.setInterpolator(rr.h);
            this.J.setStartDelay(i10 * this.P.f27658c);
            this.J.start();
            this.f27106n = true;
        }
    }

    public final void d() {
        float f7;
        float f10;
        boolean z10 = this.f27107r;
        qk0 qk0Var = this.P;
        float f11 = 1.0f;
        nk0 nk0Var = this.f27103b;
        if (z10) {
            AndroidUtilities.cancelRunOnUIThread(this.G);
            nk0 nk0Var2 = this.f27102a;
            if (nk0Var2.getImageReceiver().getLottieAnimation() != null && !nk0Var2.getImageReceiver().getLottieAnimation().y()) {
                nk0Var2.getImageReceiver().getLottieAnimation().stop();
                if (qk0Var.f27674j0) {
                    nk0Var2.getImageReceiver().getLottieAnimation().N(0, false, true);
                } else {
                    nk0Var2.getImageReceiver().getLottieAnimation().N(nk0Var2.getImageReceiver().getLottieAnimation().e[0] - 1, false, true);
                }
            }
            nk0Var.setVisibility(4);
            nk0Var2.setVisibility(0);
            this.v = false;
            float f12 = this.I;
            if (this.f27109w) {
                f10 = 0.76f;
            } else {
                f10 = 1.0f;
            }
            nk0Var.setScaleY(f12 * f10);
            float f13 = this.I;
            if (this.f27109w) {
                f11 = 0.76f;
            }
            nk0Var.setScaleX(f13 * f11);
        } else {
            nk0Var.animate().cancel();
            if (qk0Var.N0) {
                float f14 = this.I;
                if (this.f27109w) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                nk0Var.setScaleY(f14 * f7);
                float f15 = this.I;
                if (this.f27109w) {
                    f11 = 0.76f;
                }
                nk0Var.setScaleX(f15 * f11);
            } else {
                nk0Var.setScaleY(0.0f);
                nk0Var.setScaleX(0.0f);
            }
        }
        this.f27106n = false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        int i10;
        ai.l4 l4Var;
        Paint paint;
        if (this.f27109w && this.f27110x) {
            float measuredWidth = getMeasuredWidth() >> 1;
            float measuredHeight = getMeasuredHeight() >> 1;
            float measuredWidth2 = (getMeasuredWidth() >> 1) - AndroidUtilities.dp(1.0f);
            zg.o0 o0Var = this.e;
            qk0 qk0Var = this.P;
            if (o0Var != null && o0Var.f49393a) {
                paint = qk0Var.I0;
            } else {
                paint = qk0Var.H0;
            }
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth2, paint);
        }
        q5 q5Var = this.f27103b.e;
        if (q5Var != null && (l4Var = q5Var.f27504k) != null) {
            int i11 = 0;
            if (this.f27111y == 0) {
                l4Var.setRoundRadius(AndroidUtilities.dp(6.0f), 0, 0, AndroidUtilities.dp(6.0f));
            } else {
                if (this.f27109w) {
                    i11 = AndroidUtilities.dp(6.0f);
                }
                l4Var.setRoundRadius(i11);
            }
        }
        zg.o0 o0Var2 = this.e;
        if (o0Var2 != null && o0Var2.f49393a && this.F != null && LiteMode.isEnabled(8200) && LiteMode.isEnabled(131072)) {
            RectF rectF = AndroidUtilities.rectTmp;
            float height = ((int) (getHeight() * 0.7f)) / 2.0f;
            rectF.set((getWidth() / 2.0f) - height, (getHeight() / 2.0f) - height, (getWidth() / 2.0f) + height, (getHeight() / 2.0f) + height);
            ij0 lottieAnimation = this.f27102a.getImageReceiver().getLottieAnimation();
            yh.i8 i8Var = this.F;
            if (lottieAnimation != null && (i10 = lottieAnimation.f25068a0) > 30) {
                f7 = Utilities.clamp01((i10 - 30) / 30.0f);
            } else {
                f7 = 0.0f;
            }
            i8Var.f47531j = (int) (i8Var.f47526b.size() * f7);
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
        qk0 qk0Var = this.P;
        int i11 = qk0Var.M0;
        nk0 nk0Var = this.f27102a;
        nk0 nk0Var2 = this.f27103b;
        if (o0Var != null && o0Var.f49393a) {
            nk0Var.getImageReceiver().setImageBitmap(new ij0(R.raw.star_reaction, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f)));
            nk0Var2.getImageReceiver().setImageBitmap(getContext().getResources().getDrawable(R.drawable.star_reaction));
            if (this.F == null) {
                if (SharedConfig.getDevicePerformanceClass() == 2) {
                    i10 = 45;
                } else {
                    i10 = 18;
                }
                this.F = new yh.i8(1, i10);
            }
        } else if (i11 == 4 && o0Var != null && o0Var.f49396f != null) {
            nk0Var.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(o0Var.f49396f));
            nk0Var2.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(o0Var.f49396f));
        } else {
            zg.o0 o0Var2 = this.e;
            if (o0Var2.f49394b) {
                TLRPC.Document effectDocument = MessagesController.getInstance(qk0Var.J).getEffectDocument(this.e.f49397g);
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(effectDocument, org.telegram.ui.ActionBar.h6.f19223m6, 0.2f);
                ImageReceiver imageReceiver = nk0Var2.getImageReceiver();
                ImageLocation forDocument = ImageLocation.getForDocument(effectDocument);
                if (this.f27107r) {
                    svgDrawable4 = null;
                } else {
                    svgDrawable4 = svgThumb;
                }
                imageReceiver.setImage(forDocument, "60_60_firstframe", null, null, svgDrawable4, 0L, "tgs", this.e, 0);
            } else if (o0Var2.f49396f != null) {
                TLRPC.TL_availableReaction tL_availableReaction2 = MediaDataController.getInstance(qk0Var.J).getReactionsMap().get(this.e.f49396f);
                if (tL_availableReaction2 != null) {
                    SvgHelper.SvgDrawable svgThumb2 = DocumentObject.getSvgThumb(tL_availableReaction2.activate_animation, org.telegram.ui.ActionBar.h6.f19223m6, 0.2f);
                    if (!LiteMode.isEnabled(8200) || i11 == 4) {
                        tL_availableReaction = tL_availableReaction2;
                        if (SharedConfig.getDevicePerformanceClass() > 0 && i11 != 4) {
                            nk0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.appear_animation), "30_30_nolimit", null, null, svgThumb2, 0L, "tgs", o0Var, 0);
                            ImageReceiver imageReceiver2 = nk0Var2.getImageReceiver();
                            ImageLocation forDocument2 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                            if (this.f27107r) {
                                svgDrawable2 = null;
                            } else {
                                svgDrawable2 = svgThumb2;
                            }
                            imageReceiver2.setImage(forDocument2, "60_60_firstframe", null, null, svgDrawable2, 0L, "tgs", this.e, 0);
                        } else {
                            ImageReceiver imageReceiver3 = nk0Var2.getImageReceiver();
                            ImageLocation forDocument3 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                            if (this.f27107r) {
                                svgDrawable = null;
                            } else {
                                svgDrawable = svgThumb2;
                            }
                            imageReceiver3.setImage(forDocument3, "60_60_firstframe", null, null, svgDrawable, 0L, "tgs", this.e, 0);
                        }
                    } else {
                        tL_availableReaction = tL_availableReaction2;
                        nk0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction2.appear_animation), "30_30_nolimit", null, null, svgThumb2, 0L, "tgs", o0Var, 0);
                        ImageReceiver imageReceiver4 = nk0Var2.getImageReceiver();
                        ImageLocation forDocument4 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                        if (this.f27107r) {
                            svgDrawable3 = null;
                        } else {
                            svgDrawable3 = svgThumb2;
                        }
                        imageReceiver4.setImage(forDocument4, "60_60_pcache", null, null, svgDrawable3, 0L, "tgs", this.e, 0);
                    }
                    if (nk0Var.getImageReceiver().getLottieAnimation() != null) {
                        nk0Var.getImageReceiver().getLottieAnimation().N(0, false, true);
                    }
                    this.f27104c.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, svgThumb2, 0L, "tgs", o0Var, 0);
                    ImageReceiver imageReceiver5 = this.d;
                    imageReceiver5.setAllowStartLottieAnimation(false);
                    MediaDataController.getInstance(qk0Var.J).preloadImage(imageReceiver5, ImageLocation.getForDocument(tL_availableReaction.around_animation), zg.k0.a());
                }
                rg.b1 b1Var = this.f27105f;
                if (b1Var != null) {
                    b1Var.setImageReceiver(nk0Var2.getImageReceiver());
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
        boolean z11 = this.f27109w;
        boolean contains = this.P.f27661d0.contains(o0Var);
        this.f27109w = contains;
        if (contains != z11) {
            nk0 nk0Var = this.f27102a;
            nk0 nk0Var2 = this.f27103b;
            float f15 = 1.0f;
            if (!z10) {
                float f16 = this.I;
                if (contains) {
                    f12 = 0.76f;
                } else {
                    f12 = 1.0f;
                }
                nk0Var2.setScaleX(f16 * f12);
                float f17 = this.I;
                if (this.f27109w) {
                    f13 = 0.76f;
                } else {
                    f13 = 1.0f;
                }
                nk0Var2.setScaleY(f17 * f13);
                float f18 = this.I;
                if (this.f27109w) {
                    f14 = 0.76f;
                } else {
                    f14 = 1.0f;
                }
                nk0Var.setScaleX(f18 * f14);
                float f19 = this.I;
                if (this.f27109w) {
                    f15 = 0.76f;
                }
                nk0Var.setScaleY(f19 * f15);
            } else {
                ViewPropertyAnimator animate = nk0Var2.animate();
                float f20 = this.I;
                if (this.f27109w) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f20 * f7);
                float f21 = this.I;
                if (this.f27109w) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator duration = scaleX.scaleY(f21 * f10).setDuration(240L);
                rr rrVar = rr.h;
                duration.setInterpolator(rrVar).start();
                ViewPropertyAnimator animate2 = nk0Var.animate();
                float f22 = this.I;
                if (this.f27109w) {
                    f11 = 0.76f;
                } else {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator scaleX2 = animate2.scaleX(f22 * f11);
                float f23 = this.I;
                if (this.f27109w) {
                    f15 = 0.76f;
                }
                scaleX2.scaleY(f23 * f15).setDuration(240L).setInterpolator(rrVar).start();
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
            String str = o0Var.f49396f;
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
        pk0 pk0Var;
        if (this.O) {
            qk0 qk0Var = this.P;
            if (qk0Var.Q == null) {
                int action = motionEvent.getAction();
                lk0 lk0Var = this.K;
                if (action == 0) {
                    this.N = true;
                    this.L = motionEvent.getX();
                    this.M = motionEvent.getY();
                    if (this.h == 1.0f && !this.H && (i10 = qk0Var.M0) != 3 && i10 != 4 && i10 != 5 && ((pk0Var = qk0Var.f27668g0) == null || pk0Var.j())) {
                        AndroidUtilities.runOnUIThread(lk0Var, ViewConfiguration.getLongPressTimeout());
                    }
                }
                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 2.0f;
                if ((motionEvent.getAction() != 2 || (Math.abs(this.L - motionEvent.getX()) <= scaledTouchSlop && Math.abs(this.M - motionEvent.getY()) <= scaledTouchSlop)) && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return true;
                }
                if (motionEvent.getAction() == 1 && this.N && ((qk0Var.f27677l0 == null || qk0Var.f27679n0 > 0.8f) && qk0Var.f27668g0 != null)) {
                    qk0Var.f27684r0 = true;
                    if (System.currentTimeMillis() - qk0Var.f27686s0 > 300) {
                        qk0Var.f27686s0 = System.currentTimeMillis();
                        pk0 pk0Var2 = qk0Var.f27668g0;
                        zg.o0 o0Var = this.e;
                        if (qk0Var.f27679n0 > 0.8f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        pk0Var2.h(this, o0Var, z10, false);
                    }
                }
                if (!qk0Var.f27684r0 && qk0Var.f27677l0 != null) {
                    qk0Var.f27680o0 = 0.0f;
                    float f7 = qk0Var.f27679n0;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    qk0Var.Q = ofFloat;
                    ofFloat.addUpdateListener(new ek0(qk0Var, f7));
                    qk0Var.Q.addListener(new ci.u5(qk0Var, 2));
                    qk0Var.Q.setDuration(150L);
                    qk0Var.Q.setInterpolator(rr.f28030f);
                    qk0Var.Q.start();
                }
                AndroidUtilities.cancelRunOnUIThread(lk0Var);
                this.N = false;
                return true;
            }
        }
        return false;
    }
}
