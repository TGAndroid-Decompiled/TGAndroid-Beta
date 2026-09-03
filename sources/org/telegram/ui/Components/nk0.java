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
public final class nk0 extends FrameLayout {
    public boolean B;
    public lh.wa C;
    public final kk0 D;
    public boolean E;
    public float F;
    public ValueAnimator G;
    public final kk0 H;
    public float I;
    public float J;
    public boolean K;
    public boolean L;
    public final pk0 M;
    public final mk0 f27284a;
    public final mk0 f27285b;
    public final mk0 f27286c;
    public final ImageReceiver d;
    public mg.q0 e;
    public eg.s1 f27287f;
    public float h;
    public boolean f27288n;
    public boolean f27289r;
    public boolean f27290s;
    public boolean v;
    public boolean f27291w;
    public boolean f27292x;
    public int f27293y;

    public nk0(pk0 pk0Var, Context context) {
        super(context);
        this.M = pk0Var;
        this.d = new ImageReceiver();
        this.h = 1.0f;
        this.f27292x = true;
        this.D = new kk0(this, 0);
        this.F = 1.0f;
        this.H = new kk0(this, 1);
        this.L = true;
        mk0 mk0Var = new mk0(this, context, 0);
        this.f27284a = mk0Var;
        mk0 mk0Var2 = new mk0(this, context, 1);
        this.f27285b = mk0Var2;
        mk0Var.getImageReceiver().setAutoRepeat(0);
        mk0Var.getImageReceiver().setAllowStartLottieAnimation(false);
        mk0 mk0Var3 = new mk0(this, context, 2);
        this.f27286c = mk0Var3;
        addView(mk0Var, k7.b6.e(34, 34, 17));
        addView(mk0Var3, k7.b6.e(34, 34, 17));
        addView(mk0Var2, k7.b6.e(34, 34, 17));
        if (pk0Var.J0 == 4) {
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setDuration(100L);
            layoutTransition.enableTransitionType(4);
            setLayoutTransition(layoutTransition);
        }
        mk0Var.setLayerNum(Integer.MAX_VALUE);
        mk0Var2.setLayerNum(Integer.MAX_VALUE);
        mk0Var2.f27801a.setAutoRepeat(0);
        mk0Var2.f27801a.setAllowStartAnimation(false);
        mk0Var2.f27801a.setAllowStartLottieAnimation(false);
        mk0Var3.setLayerNum(Integer.MAX_VALUE);
    }

    public static void a(nk0 nk0Var, mg.q0 q0Var, int i10) {
        boolean z4;
        boolean z10;
        int i11;
        mk0 mk0Var = nk0Var.f27286c;
        mk0 mk0Var2 = nk0Var.f27284a;
        mk0 mk0Var3 = nk0Var.f27285b;
        pk0 pk0Var = nk0Var.M;
        nk0Var.f(q0Var, false);
        mg.q0 q0Var2 = nk0Var.e;
        if (q0Var2 != null && q0Var2.equals(q0Var)) {
            nk0Var.f27293y = i10;
            nk0Var.e(q0Var);
            return;
        }
        int i12 = pk0Var.G;
        org.telegram.ui.ActionBar.f6 f6Var = pk0Var.f27898h0;
        int i13 = pk0Var.J0;
        boolean isPremium = UserConfig.getInstance(i12).isPremium();
        if ((i13 == 3 && !isPremium) || (i13 == 5 && q0Var.d && !isPremium)) {
            z4 = true;
        } else {
            z4 = false;
        }
        nk0Var.E = z4;
        if (z4 && nk0Var.f27287f == null) {
            eg.s1 s1Var = new eg.s1(nk0Var.getContext(), 1, null);
            nk0Var.f27287f = s1Var;
            s1Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            nk0Var.f27287f.setImageReceiver(mk0Var3.getImageReceiver());
            nk0Var.addView(nk0Var.f27287f, k7.b6.d(18, 18.0f, 17, 8.0f, 8.0f, 0.0f, 0.0f));
        }
        eg.s1 s1Var2 = nk0Var.f27287f;
        if (s1Var2 != null) {
            if (nk0Var.E) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            s1Var2.setVisibility(i11);
        }
        nk0Var.d();
        nk0Var.e = q0Var;
        if (!q0Var.f14092a && (q0Var.f14095f == null || ((!pk0Var.q() && !pk0Var.D0) || !LiteMode.isEnabled(8200)))) {
            z10 = false;
        } else {
            z10 = true;
        }
        nk0Var.f27289r = z10;
        if (i13 == 4 || nk0Var.e.f14093b) {
            nk0Var.f27289r = false;
        }
        mg.q0 q0Var3 = nk0Var.e;
        if (!q0Var3.f14092a && q0Var3.f14095f == null) {
            mk0Var.getImageReceiver().clearImage();
            mk0Var3.getImageReceiver().clearImage();
            l5 l5Var = new l5(4, pk0Var.G, nk0Var.e.f14096g);
            l5 l5Var2 = new l5(3, pk0Var.G, nk0Var.e.f14096g);
            if (i13 != 1 && i13 != 2 && i13 != 4) {
                int i14 = org.telegram.ui.ActionBar.j6.f20200v6;
                int v02 = org.telegram.ui.ActionBar.j6.v0(i14, f6Var);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                l5Var.setColorFilter(new PorterDuffColorFilter(v02, mode));
                l5Var2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i14, f6Var), mode));
            } else {
                PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
                l5Var.setColorFilter(new PorterDuffColorFilter(-1, mode2));
                l5Var2.setColorFilter(new PorterDuffColorFilter(-1, mode2));
            }
            mk0Var.setAnimatedEmojiDrawable(l5Var);
            mk0Var3.setAnimatedEmojiDrawable(l5Var2);
            eg.s1 s1Var3 = nk0Var.f27287f;
            if (s1Var3 != null) {
                s1Var3.setAnimatedEmojiDrawable(l5Var2);
            }
        } else {
            nk0Var.e(q0Var);
            mk0Var.setAnimatedEmojiDrawable(null);
            if (mk0Var2.getImageReceiver().getLottieAnimation() != null) {
                mk0Var2.getImageReceiver().getLottieAnimation().L(0, false, false);
            }
            eg.s1 s1Var4 = nk0Var.f27287f;
            if (s1Var4 != null) {
                s1Var4.setAnimatedEmojiDrawable(null);
            }
        }
        nk0Var.setFocusable(true);
        boolean z11 = nk0Var.f27289r;
        nk0Var.f27290s = z11;
        if (!z11) {
            mk0Var2.setVisibility(8);
            mk0Var3.setVisibility(0);
            nk0Var.v = true;
        } else {
            nk0Var.v = false;
            mk0Var2.setVisibility(0);
            mk0Var3.setVisibility(8);
        }
        ViewGroup.LayoutParams layoutParams = mk0Var3.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = mk0Var3.getLayoutParams();
        int dp = AndroidUtilities.dp(34.0f);
        layoutParams2.height = dp;
        layoutParams.width = dp;
        ViewGroup.LayoutParams layoutParams3 = mk0Var2.getLayoutParams();
        ViewGroup.LayoutParams layoutParams4 = mk0Var2.getLayoutParams();
        int dp2 = AndroidUtilities.dp(34.0f);
        layoutParams4.height = dp2;
        layoutParams3.width = dp2;
    }

    public final void b() {
        ImageReceiver imageReceiver;
        mk0 mk0Var = this.f27285b;
        l5 l5Var = mk0Var.e;
        if (l5Var != null) {
            imageReceiver = l5Var.f26587k;
        } else {
            imageReceiver = mk0Var.f27801a;
        }
        if (imageReceiver != null && imageReceiver.getLottieAnimation() != null) {
            pk0 pk0Var = this.M;
            if (pk0Var.f27913u0 == null && !this.K && pk0Var.D0) {
                if (imageReceiver.getLottieAnimation().Y <= 2) {
                    imageReceiver.getLottieAnimation().stop();
                    return;
                }
                return;
            }
            imageReceiver.getLottieAnimation().start();
        }
    }

    public final void c(int i10) {
        float f10;
        float f11;
        float f12 = 0.76f;
        if (!this.M.f27896g0) {
            d();
            this.f27288n = true;
            if (!this.f27289r) {
                this.f27285b.setVisibility(0);
                mk0 mk0Var = this.f27285b;
                float f13 = this.F;
                if (this.f27291w) {
                    f11 = 0.76f;
                } else {
                    f11 = 1.0f;
                }
                mk0Var.setScaleY(f13 * f11);
                mk0 mk0Var2 = this.f27285b;
                float f14 = this.F;
                if (!this.f27291w) {
                    f12 = 1.0f;
                }
                mk0Var2.setScaleX(f14 * f12);
                return;
            }
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.D);
        if (this.f27289r) {
            if (this.f27284a.getImageReceiver().getLottieAnimation() != null && !this.f27284a.getImageReceiver().getLottieAnimation().w() && !this.f27288n) {
                this.f27288n = true;
                if (i10 == 0) {
                    this.B = false;
                    this.f27284a.getImageReceiver().getLottieAnimation().stop();
                    this.f27284a.getImageReceiver().getLottieAnimation().L(0, false, false);
                    this.D.run();
                    return;
                }
                this.B = true;
                this.f27284a.getImageReceiver().getLottieAnimation().stop();
                this.f27284a.getImageReceiver().getLottieAnimation().L(0, false, false);
                AndroidUtilities.runOnUIThread(this.D, i10);
                return;
            }
            if (this.f27284a.getImageReceiver().getLottieAnimation() != null && this.f27288n && !this.f27284a.getImageReceiver().getLottieAnimation().f25164i0 && !this.f27284a.getImageReceiver().getLottieAnimation().w()) {
                this.f27284a.getImageReceiver().getLottieAnimation().L(this.f27284a.getImageReceiver().getLottieAnimation().e[0] - 1, false, false);
            }
            mk0 mk0Var3 = this.f27285b;
            float f15 = this.F;
            if (this.f27291w) {
                f10 = 0.76f;
            } else {
                f10 = 1.0f;
            }
            mk0Var3.setScaleY(f15 * f10);
            mk0 mk0Var4 = this.f27285b;
            float f16 = this.F;
            if (!this.f27291w) {
                f12 = 1.0f;
            }
            mk0Var4.setScaleX(f16 * f12);
        } else if (!this.f27288n) {
            this.F = 0.0f;
            this.f27285b.setScaleX(0.0f);
            this.f27285b.setScaleY(0.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.G = ofFloat;
            ofFloat.addUpdateListener(new j70(this, 9));
            this.G.setDuration(150L);
            this.G.setInterpolator(mr.h);
            this.G.setStartDelay(i10 * this.M.f27886c);
            this.G.start();
            this.f27288n = true;
        }
    }

    public final void d() {
        float f10;
        float f11;
        boolean z4 = this.f27289r;
        pk0 pk0Var = this.M;
        float f12 = 1.0f;
        mk0 mk0Var = this.f27285b;
        if (z4) {
            AndroidUtilities.cancelRunOnUIThread(this.D);
            mk0 mk0Var2 = this.f27284a;
            if (mk0Var2.getImageReceiver().getLottieAnimation() != null && !mk0Var2.getImageReceiver().getLottieAnimation().w()) {
                mk0Var2.getImageReceiver().getLottieAnimation().stop();
                if (pk0Var.f27896g0) {
                    mk0Var2.getImageReceiver().getLottieAnimation().L(0, false, true);
                } else {
                    mk0Var2.getImageReceiver().getLottieAnimation().L(mk0Var2.getImageReceiver().getLottieAnimation().e[0] - 1, false, true);
                }
            }
            mk0Var.setVisibility(4);
            mk0Var2.setVisibility(0);
            this.v = false;
            float f13 = this.F;
            if (this.f27291w) {
                f11 = 0.76f;
            } else {
                f11 = 1.0f;
            }
            mk0Var.setScaleY(f13 * f11);
            float f14 = this.F;
            if (this.f27291w) {
                f12 = 0.76f;
            }
            mk0Var.setScaleX(f14 * f12);
        } else {
            mk0Var.animate().cancel();
            if (pk0Var.K0) {
                float f15 = this.F;
                if (this.f27291w) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                mk0Var.setScaleY(f15 * f10);
                float f16 = this.F;
                if (this.f27291w) {
                    f12 = 0.76f;
                }
                mk0Var.setScaleX(f16 * f12);
            } else {
                mk0Var.setScaleY(0.0f);
                mk0Var.setScaleX(0.0f);
            }
        }
        this.f27288n = false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        int i10;
        nh.y2 y2Var;
        Paint paint;
        if (this.f27291w && this.f27292x) {
            float measuredWidth = getMeasuredWidth() >> 1;
            float measuredHeight = getMeasuredHeight() >> 1;
            float measuredWidth2 = (getMeasuredWidth() >> 1) - AndroidUtilities.dp(1.0f);
            mg.q0 q0Var = this.e;
            pk0 pk0Var = this.M;
            if (q0Var != null && q0Var.f14092a) {
                paint = pk0Var.F0;
            } else {
                paint = pk0Var.E0;
            }
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth2, paint);
        }
        l5 l5Var = this.f27285b.e;
        if (l5Var != null && (y2Var = l5Var.f26587k) != null) {
            int i11 = 0;
            if (this.f27293y == 0) {
                y2Var.setRoundRadius(AndroidUtilities.dp(6.0f), 0, 0, AndroidUtilities.dp(6.0f));
            } else {
                if (this.f27291w) {
                    i11 = AndroidUtilities.dp(6.0f);
                }
                y2Var.setRoundRadius(i11);
            }
        }
        mg.q0 q0Var2 = this.e;
        if (q0Var2 != null && q0Var2.f14092a && this.C != null && LiteMode.isEnabled(8200) && LiteMode.isEnabled(131072)) {
            RectF rectF = AndroidUtilities.rectTmp;
            float height = ((int) (getHeight() * 0.7f)) / 2.0f;
            rectF.set((getWidth() / 2.0f) - height, (getHeight() / 2.0f) - height, (getWidth() / 2.0f) + height, (getHeight() / 2.0f) + height);
            gj0 lottieAnimation = this.f27284a.getImageReceiver().getLottieAnimation();
            lh.wa waVar = this.C;
            if (lottieAnimation != null && (i10 = lottieAnimation.Y) > 30) {
                f10 = Utilities.clamp01((i10 - 30) / 30.0f);
            } else {
                f10 = 0.0f;
            }
            waVar.f13302j = (int) (waVar.f13297b.size() * f10);
            this.C.g(rectF);
            this.C.d();
            this.C.a(canvas, -673522);
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void e(mg.q0 q0Var) {
        TLRPC.TL_availableReaction tL_availableReaction;
        SvgHelper.SvgDrawable svgDrawable;
        SvgHelper.SvgDrawable svgDrawable2;
        SvgHelper.SvgDrawable svgDrawable3;
        SvgHelper.SvgDrawable svgDrawable4;
        int i10;
        pk0 pk0Var = this.M;
        int i11 = pk0Var.J0;
        mk0 mk0Var = this.f27284a;
        mk0 mk0Var2 = this.f27285b;
        if (q0Var != null && q0Var.f14092a) {
            mk0Var.getImageReceiver().setImageBitmap(new gj0(R.raw.star_reaction, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f)));
            mk0Var2.getImageReceiver().setImageBitmap(getContext().getResources().getDrawable(R.drawable.star_reaction));
            if (this.C == null) {
                if (SharedConfig.getDevicePerformanceClass() == 2) {
                    i10 = 45;
                } else {
                    i10 = 18;
                }
                this.C = new lh.wa(1, i10);
            }
        } else if (i11 == 4 && q0Var != null && q0Var.f14095f != null) {
            mk0Var.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(q0Var.f14095f));
            mk0Var2.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(q0Var.f14095f));
        } else {
            mg.q0 q0Var2 = this.e;
            if (q0Var2.f14093b) {
                TLRPC.Document effectDocument = MessagesController.getInstance(pk0Var.G).getEffectDocument(this.e.f14096g);
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(effectDocument, org.telegram.ui.ActionBar.j6.f20042m6, 0.2f);
                ImageReceiver imageReceiver = mk0Var2.getImageReceiver();
                ImageLocation forDocument = ImageLocation.getForDocument(effectDocument);
                if (this.f27289r) {
                    svgDrawable4 = null;
                } else {
                    svgDrawable4 = svgThumb;
                }
                imageReceiver.setImage(forDocument, "60_60_firstframe", null, null, svgDrawable4, 0L, "tgs", this.e, 0);
            } else if (q0Var2.f14095f != null) {
                TLRPC.TL_availableReaction tL_availableReaction2 = MediaDataController.getInstance(pk0Var.G).getReactionsMap().get(this.e.f14095f);
                if (tL_availableReaction2 != null) {
                    SvgHelper.SvgDrawable svgThumb2 = DocumentObject.getSvgThumb(tL_availableReaction2.activate_animation, org.telegram.ui.ActionBar.j6.f20042m6, 0.2f);
                    if (!LiteMode.isEnabled(8200) || i11 == 4) {
                        tL_availableReaction = tL_availableReaction2;
                        if (SharedConfig.getDevicePerformanceClass() > 0 && i11 != 4) {
                            mk0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.appear_animation), "30_30_nolimit", null, null, svgThumb2, 0L, "tgs", q0Var, 0);
                            ImageReceiver imageReceiver2 = mk0Var2.getImageReceiver();
                            ImageLocation forDocument2 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                            if (this.f27289r) {
                                svgDrawable2 = null;
                            } else {
                                svgDrawable2 = svgThumb2;
                            }
                            imageReceiver2.setImage(forDocument2, "60_60_firstframe", null, null, svgDrawable2, 0L, "tgs", this.e, 0);
                        } else {
                            ImageReceiver imageReceiver3 = mk0Var2.getImageReceiver();
                            ImageLocation forDocument3 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                            if (this.f27289r) {
                                svgDrawable = null;
                            } else {
                                svgDrawable = svgThumb2;
                            }
                            imageReceiver3.setImage(forDocument3, "60_60_firstframe", null, null, svgDrawable, 0L, "tgs", this.e, 0);
                        }
                    } else {
                        tL_availableReaction = tL_availableReaction2;
                        mk0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction2.appear_animation), "30_30_nolimit", null, null, svgThumb2, 0L, "tgs", q0Var, 0);
                        ImageReceiver imageReceiver4 = mk0Var2.getImageReceiver();
                        ImageLocation forDocument4 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                        if (this.f27289r) {
                            svgDrawable3 = null;
                        } else {
                            svgDrawable3 = svgThumb2;
                        }
                        imageReceiver4.setImage(forDocument4, "60_60_pcache", null, null, svgDrawable3, 0L, "tgs", this.e, 0);
                    }
                    if (mk0Var.getImageReceiver().getLottieAnimation() != null) {
                        mk0Var.getImageReceiver().getLottieAnimation().L(0, false, true);
                    }
                    this.f27286c.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, svgThumb2, 0L, "tgs", q0Var, 0);
                    ImageReceiver imageReceiver5 = this.d;
                    imageReceiver5.setAllowStartLottieAnimation(false);
                    MediaDataController.getInstance(pk0Var.G).preloadImage(imageReceiver5, ImageLocation.getForDocument(tL_availableReaction.around_animation), mg.m0.a());
                }
                eg.s1 s1Var = this.f27287f;
                if (s1Var != null) {
                    s1Var.setImageReceiver(mk0Var2.getImageReceiver());
                }
            }
        }
    }

    public final void f(mg.q0 q0Var, boolean z4) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        boolean z10 = this.f27291w;
        boolean contains = this.M.f27881a0.contains(q0Var);
        this.f27291w = contains;
        if (contains != z10) {
            mk0 mk0Var = this.f27284a;
            mk0 mk0Var2 = this.f27285b;
            float f16 = 1.0f;
            if (!z4) {
                float f17 = this.F;
                if (contains) {
                    f13 = 0.76f;
                } else {
                    f13 = 1.0f;
                }
                mk0Var2.setScaleX(f17 * f13);
                float f18 = this.F;
                if (this.f27291w) {
                    f14 = 0.76f;
                } else {
                    f14 = 1.0f;
                }
                mk0Var2.setScaleY(f18 * f14);
                float f19 = this.F;
                if (this.f27291w) {
                    f15 = 0.76f;
                } else {
                    f15 = 1.0f;
                }
                mk0Var.setScaleX(f19 * f15);
                float f20 = this.F;
                if (this.f27291w) {
                    f16 = 0.76f;
                }
                mk0Var.setScaleY(f20 * f16);
            } else {
                ViewPropertyAnimator animate = mk0Var2.animate();
                float f21 = this.F;
                if (this.f27291w) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f21 * f10);
                float f22 = this.F;
                if (this.f27291w) {
                    f11 = 0.76f;
                } else {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator duration = scaleX.scaleY(f22 * f11).setDuration(240L);
                mr mrVar = mr.h;
                duration.setInterpolator(mrVar).start();
                ViewPropertyAnimator animate2 = mk0Var.animate();
                float f23 = this.F;
                if (this.f27291w) {
                    f12 = 0.76f;
                } else {
                    f12 = 1.0f;
                }
                ViewPropertyAnimator scaleX2 = animate2.scaleX(f23 * f12);
                float f24 = this.F;
                if (this.f27291w) {
                    f16 = 0.76f;
                }
                scaleX2.scaleY(f24 * f16).setDuration(240L).setInterpolator(mrVar).start();
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
        mg.q0 q0Var = this.e;
        if (q0Var != null) {
            String str = q0Var.f14095f;
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
        boolean z4;
        int i10;
        ok0 ok0Var;
        if (this.L) {
            pk0 pk0Var = this.M;
            if (pk0Var.N == null) {
                int action = motionEvent.getAction();
                kk0 kk0Var = this.H;
                if (action == 0) {
                    this.K = true;
                    this.I = motionEvent.getX();
                    this.J = motionEvent.getY();
                    if (this.h == 1.0f && !this.E && (i10 = pk0Var.J0) != 3 && i10 != 4 && i10 != 5 && ((ok0Var = pk0Var.f27889d0) == null || ok0Var.i())) {
                        AndroidUtilities.runOnUIThread(kk0Var, ViewConfiguration.getLongPressTimeout());
                    }
                }
                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 2.0f;
                if ((motionEvent.getAction() != 2 || (Math.abs(this.I - motionEvent.getX()) <= scaledTouchSlop && Math.abs(this.J - motionEvent.getY()) <= scaledTouchSlop)) && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return true;
                }
                if (motionEvent.getAction() == 1 && this.K && ((pk0Var.f27899i0 == null || pk0Var.f27901k0 > 0.8f) && pk0Var.f27889d0 != null)) {
                    pk0Var.f27905o0 = true;
                    if (System.currentTimeMillis() - pk0Var.f27906p0 > 300) {
                        pk0Var.f27906p0 = System.currentTimeMillis();
                        ok0 ok0Var2 = pk0Var.f27889d0;
                        mg.q0 q0Var = this.e;
                        if (pk0Var.f27901k0 > 0.8f) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        ok0Var2.j(this, q0Var, z4, false);
                    }
                }
                if (!pk0Var.f27905o0 && pk0Var.f27899i0 != null) {
                    pk0Var.f27902l0 = 0.0f;
                    float f10 = pk0Var.f27901k0;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    pk0Var.N = ofFloat;
                    ofFloat.addUpdateListener(new dk0(pk0Var, f10));
                    pk0Var.N.addListener(new ck0(pk0Var, 1));
                    pk0Var.N.setDuration(150L);
                    pk0Var.N.setInterpolator(mr.f27122f);
                    pk0Var.N.start();
                }
                AndroidUtilities.cancelRunOnUIThread(kk0Var);
                this.K = false;
                return true;
            }
        }
        return false;
    }
}
