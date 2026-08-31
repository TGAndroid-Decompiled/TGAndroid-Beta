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
public final class pk0 extends FrameLayout {
    public boolean B;
    public mh.wa C;
    public final mk0 D;
    public boolean E;
    public float F;
    public ValueAnimator G;
    public final mk0 H;
    public float I;
    public float J;
    public boolean K;
    public boolean L;
    public final rk0 M;
    public final ok0 f30098a;
    public final ok0 f30099b;
    public final ok0 f30100c;
    public final ImageReceiver d;
    public ng.q0 f30101e;
    public fg.r1 f30102f;
    public float h;
    public boolean f30103n;
    public boolean f30104r;
    public boolean f30105s;
    public boolean v;
    public boolean f30106w;
    public boolean f30107x;
    public int f30108y;

    public pk0(rk0 rk0Var, Context context) {
        super(context);
        this.M = rk0Var;
        this.d = new ImageReceiver();
        this.h = 1.0f;
        this.f30107x = true;
        this.D = new mk0(this, 0);
        this.F = 1.0f;
        this.H = new mk0(this, 1);
        this.L = true;
        ok0 ok0Var = new ok0(this, context, 0);
        this.f30098a = ok0Var;
        ok0 ok0Var2 = new ok0(this, context, 1);
        this.f30099b = ok0Var2;
        ok0Var.getImageReceiver().setAutoRepeat(0);
        ok0Var.getImageReceiver().setAllowStartLottieAnimation(false);
        ok0 ok0Var3 = new ok0(this, context, 2);
        this.f30100c = ok0Var3;
        addView(ok0Var, k7.c6.e(34, 34, 17));
        addView(ok0Var3, k7.c6.e(34, 34, 17));
        addView(ok0Var2, k7.c6.e(34, 34, 17));
        if (rk0Var.J0 == 4) {
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setDuration(100L);
            layoutTransition.enableTransitionType(4);
            setLayoutTransition(layoutTransition);
        }
        ok0Var.setLayerNum(Integer.MAX_VALUE);
        ok0Var2.setLayerNum(Integer.MAX_VALUE);
        ok0Var2.f29998a.setAutoRepeat(0);
        ok0Var2.f29998a.setAllowStartAnimation(false);
        ok0Var2.f29998a.setAllowStartLottieAnimation(false);
        ok0Var3.setLayerNum(Integer.MAX_VALUE);
    }

    public static void a(pk0 pk0Var, ng.q0 q0Var, int i10) {
        boolean z4;
        boolean z10;
        int i11;
        ok0 ok0Var = pk0Var.f30100c;
        ok0 ok0Var2 = pk0Var.f30098a;
        ok0 ok0Var3 = pk0Var.f30099b;
        rk0 rk0Var = pk0Var.M;
        pk0Var.f(q0Var, false);
        ng.q0 q0Var2 = pk0Var.f30101e;
        if (q0Var2 != null && q0Var2.equals(q0Var)) {
            pk0Var.f30108y = i10;
            pk0Var.e(q0Var);
            return;
        }
        int i12 = rk0Var.G;
        org.telegram.ui.ActionBar.g6 g6Var = rk0Var.f30771h0;
        int i13 = rk0Var.J0;
        boolean isPremium = UserConfig.getInstance(i12).isPremium();
        if ((i13 == 3 && !isPremium) || (i13 == 5 && q0Var.d && !isPremium)) {
            z4 = true;
        } else {
            z4 = false;
        }
        pk0Var.E = z4;
        if (z4 && pk0Var.f30102f == null) {
            fg.r1 r1Var = new fg.r1(pk0Var.getContext(), 1, null);
            pk0Var.f30102f = r1Var;
            r1Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            pk0Var.f30102f.setImageReceiver(ok0Var3.getImageReceiver());
            pk0Var.addView(pk0Var.f30102f, k7.c6.d(18, 18.0f, 17, 8.0f, 8.0f, 0.0f, 0.0f));
        }
        fg.r1 r1Var2 = pk0Var.f30102f;
        if (r1Var2 != null) {
            if (pk0Var.E) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            r1Var2.setVisibility(i11);
        }
        pk0Var.d();
        pk0Var.f30101e = q0Var;
        if (!q0Var.f16174a && (q0Var.f16178f == null || ((!rk0Var.q() && !rk0Var.D0) || !LiteMode.isEnabled(8200)))) {
            z10 = false;
        } else {
            z10 = true;
        }
        pk0Var.f30104r = z10;
        if (i13 == 4 || pk0Var.f30101e.f16175b) {
            pk0Var.f30104r = false;
        }
        ng.q0 q0Var3 = pk0Var.f30101e;
        if (!q0Var3.f16174a && q0Var3.f16178f == null) {
            ok0Var.getImageReceiver().clearImage();
            ok0Var3.getImageReceiver().clearImage();
            l5 l5Var = new l5(4, rk0Var.G, pk0Var.f30101e.f16179g);
            l5 l5Var2 = new l5(3, rk0Var.G, pk0Var.f30101e.f16179g);
            if (i13 != 1 && i13 != 2 && i13 != 4) {
                int i14 = org.telegram.ui.ActionBar.k6.f21979v6;
                int v02 = org.telegram.ui.ActionBar.k6.v0(i14, g6Var);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                l5Var.setColorFilter(new PorterDuffColorFilter(v02, mode));
                l5Var2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(i14, g6Var), mode));
            } else {
                PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
                l5Var.setColorFilter(new PorterDuffColorFilter(-1, mode2));
                l5Var2.setColorFilter(new PorterDuffColorFilter(-1, mode2));
            }
            ok0Var.setAnimatedEmojiDrawable(l5Var);
            ok0Var3.setAnimatedEmojiDrawable(l5Var2);
            fg.r1 r1Var3 = pk0Var.f30102f;
            if (r1Var3 != null) {
                r1Var3.setAnimatedEmojiDrawable(l5Var2);
            }
        } else {
            pk0Var.e(q0Var);
            ok0Var.setAnimatedEmojiDrawable(null);
            if (ok0Var2.getImageReceiver().getLottieAnimation() != null) {
                ok0Var2.getImageReceiver().getLottieAnimation().L(0, false, false);
            }
            fg.r1 r1Var4 = pk0Var.f30102f;
            if (r1Var4 != null) {
                r1Var4.setAnimatedEmojiDrawable(null);
            }
        }
        pk0Var.setFocusable(true);
        boolean z11 = pk0Var.f30104r;
        pk0Var.f30105s = z11;
        if (!z11) {
            ok0Var2.setVisibility(8);
            ok0Var3.setVisibility(0);
            pk0Var.v = true;
        } else {
            pk0Var.v = false;
            ok0Var2.setVisibility(0);
            ok0Var3.setVisibility(8);
        }
        ViewGroup.LayoutParams layoutParams = ok0Var3.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = ok0Var3.getLayoutParams();
        int dp = AndroidUtilities.dp(34.0f);
        layoutParams2.height = dp;
        layoutParams.width = dp;
        ViewGroup.LayoutParams layoutParams3 = ok0Var2.getLayoutParams();
        ViewGroup.LayoutParams layoutParams4 = ok0Var2.getLayoutParams();
        int dp2 = AndroidUtilities.dp(34.0f);
        layoutParams4.height = dp2;
        layoutParams3.width = dp2;
    }

    public final void b() {
        ImageReceiver imageReceiver;
        ok0 ok0Var = this.f30099b;
        l5 l5Var = ok0Var.f30001e;
        if (l5Var != null) {
            imageReceiver = l5Var.f28604k;
        } else {
            imageReceiver = ok0Var.f29998a;
        }
        if (imageReceiver != null && imageReceiver.getLottieAnimation() != null) {
            rk0 rk0Var = this.M;
            if (rk0Var.f30786u0 == null && !this.K && rk0Var.D0) {
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
        if (!this.M.f30769g0) {
            d();
            this.f30103n = true;
            if (!this.f30104r) {
                this.f30099b.setVisibility(0);
                ok0 ok0Var = this.f30099b;
                float f13 = this.F;
                if (this.f30106w) {
                    f11 = 0.76f;
                } else {
                    f11 = 1.0f;
                }
                ok0Var.setScaleY(f13 * f11);
                ok0 ok0Var2 = this.f30099b;
                float f14 = this.F;
                if (!this.f30106w) {
                    f12 = 1.0f;
                }
                ok0Var2.setScaleX(f14 * f12);
                return;
            }
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.D);
        if (this.f30104r) {
            if (this.f30098a.getImageReceiver().getLottieAnimation() != null && !this.f30098a.getImageReceiver().getLottieAnimation().w() && !this.f30103n) {
                this.f30103n = true;
                if (i10 == 0) {
                    this.B = false;
                    this.f30098a.getImageReceiver().getLottieAnimation().stop();
                    this.f30098a.getImageReceiver().getLottieAnimation().L(0, false, false);
                    this.D.run();
                    return;
                }
                this.B = true;
                this.f30098a.getImageReceiver().getLottieAnimation().stop();
                this.f30098a.getImageReceiver().getLottieAnimation().L(0, false, false);
                AndroidUtilities.runOnUIThread(this.D, i10);
                return;
            }
            if (this.f30098a.getImageReceiver().getLottieAnimation() != null && this.f30103n && !this.f30098a.getImageReceiver().getLottieAnimation().f27823i0 && !this.f30098a.getImageReceiver().getLottieAnimation().w()) {
                this.f30098a.getImageReceiver().getLottieAnimation().L(this.f30098a.getImageReceiver().getLottieAnimation().f27817e[0] - 1, false, false);
            }
            ok0 ok0Var3 = this.f30099b;
            float f15 = this.F;
            if (this.f30106w) {
                f10 = 0.76f;
            } else {
                f10 = 1.0f;
            }
            ok0Var3.setScaleY(f15 * f10);
            ok0 ok0Var4 = this.f30099b;
            float f16 = this.F;
            if (!this.f30106w) {
                f12 = 1.0f;
            }
            ok0Var4.setScaleX(f16 * f12);
        } else if (!this.f30103n) {
            this.F = 0.0f;
            this.f30099b.setScaleX(0.0f);
            this.f30099b.setScaleY(0.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.G = ofFloat;
            ofFloat.addUpdateListener(new k70(this, 9));
            this.G.setDuration(150L);
            this.G.setInterpolator(pr.h);
            this.G.setStartDelay(i10 * this.M.f30758c);
            this.G.start();
            this.f30103n = true;
        }
    }

    public final void d() {
        float f10;
        float f11;
        boolean z4 = this.f30104r;
        rk0 rk0Var = this.M;
        float f12 = 1.0f;
        ok0 ok0Var = this.f30099b;
        if (z4) {
            AndroidUtilities.cancelRunOnUIThread(this.D);
            ok0 ok0Var2 = this.f30098a;
            if (ok0Var2.getImageReceiver().getLottieAnimation() != null && !ok0Var2.getImageReceiver().getLottieAnimation().w()) {
                ok0Var2.getImageReceiver().getLottieAnimation().stop();
                if (rk0Var.f30769g0) {
                    ok0Var2.getImageReceiver().getLottieAnimation().L(0, false, true);
                } else {
                    ok0Var2.getImageReceiver().getLottieAnimation().L(ok0Var2.getImageReceiver().getLottieAnimation().f27817e[0] - 1, false, true);
                }
            }
            ok0Var.setVisibility(4);
            ok0Var2.setVisibility(0);
            this.v = false;
            float f13 = this.F;
            if (this.f30106w) {
                f11 = 0.76f;
            } else {
                f11 = 1.0f;
            }
            ok0Var.setScaleY(f13 * f11);
            float f14 = this.F;
            if (this.f30106w) {
                f12 = 0.76f;
            }
            ok0Var.setScaleX(f14 * f12);
        } else {
            ok0Var.animate().cancel();
            if (rk0Var.K0) {
                float f15 = this.F;
                if (this.f30106w) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                ok0Var.setScaleY(f15 * f10);
                float f16 = this.F;
                if (this.f30106w) {
                    f12 = 0.76f;
                }
                ok0Var.setScaleX(f16 * f12);
            } else {
                ok0Var.setScaleY(0.0f);
                ok0Var.setScaleX(0.0f);
            }
        }
        this.f30103n = false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        int i10;
        oh.z2 z2Var;
        Paint paint;
        if (this.f30106w && this.f30107x) {
            float measuredWidth = getMeasuredWidth() >> 1;
            float measuredHeight = getMeasuredHeight() >> 1;
            float measuredWidth2 = (getMeasuredWidth() >> 1) - AndroidUtilities.dp(1.0f);
            ng.q0 q0Var = this.f30101e;
            rk0 rk0Var = this.M;
            if (q0Var != null && q0Var.f16174a) {
                paint = rk0Var.F0;
            } else {
                paint = rk0Var.E0;
            }
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth2, paint);
        }
        l5 l5Var = this.f30099b.f30001e;
        if (l5Var != null && (z2Var = l5Var.f28604k) != null) {
            int i11 = 0;
            if (this.f30108y == 0) {
                z2Var.setRoundRadius(AndroidUtilities.dp(6.0f), 0, 0, AndroidUtilities.dp(6.0f));
            } else {
                if (this.f30106w) {
                    i11 = AndroidUtilities.dp(6.0f);
                }
                z2Var.setRoundRadius(i11);
            }
        }
        ng.q0 q0Var2 = this.f30101e;
        if (q0Var2 != null && q0Var2.f16174a && this.C != null && LiteMode.isEnabled(8200) && LiteMode.isEnabled(131072)) {
            RectF rectF = AndroidUtilities.rectTmp;
            float height = ((int) (getHeight() * 0.7f)) / 2.0f;
            rectF.set((getWidth() / 2.0f) - height, (getHeight() / 2.0f) - height, (getWidth() / 2.0f) + height, (getHeight() / 2.0f) + height);
            ij0 lottieAnimation = this.f30098a.getImageReceiver().getLottieAnimation();
            mh.wa waVar = this.C;
            if (lottieAnimation != null && (i10 = lottieAnimation.Y) > 30) {
                f10 = Utilities.clamp01((i10 - 30) / 30.0f);
            } else {
                f10 = 0.0f;
            }
            waVar.f15012j = (int) (waVar.f15006b.size() * f10);
            this.C.g(rectF);
            this.C.d();
            this.C.a(canvas, -673522);
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void e(ng.q0 q0Var) {
        TLRPC.TL_availableReaction tL_availableReaction;
        SvgHelper.SvgDrawable svgDrawable;
        SvgHelper.SvgDrawable svgDrawable2;
        SvgHelper.SvgDrawable svgDrawable3;
        SvgHelper.SvgDrawable svgDrawable4;
        int i10;
        rk0 rk0Var = this.M;
        int i11 = rk0Var.J0;
        ok0 ok0Var = this.f30098a;
        ok0 ok0Var2 = this.f30099b;
        if (q0Var != null && q0Var.f16174a) {
            ok0Var.getImageReceiver().setImageBitmap(new ij0(R.raw.star_reaction, AndroidUtilities.dp(30.0f), "star_reaction", AndroidUtilities.dp(30.0f)));
            ok0Var2.getImageReceiver().setImageBitmap(getContext().getResources().getDrawable(R.drawable.star_reaction));
            if (this.C == null) {
                if (SharedConfig.getDevicePerformanceClass() == 2) {
                    i10 = 45;
                } else {
                    i10 = 18;
                }
                this.C = new mh.wa(1, i10);
            }
        } else if (i11 == 4 && q0Var != null && q0Var.f16178f != null) {
            ok0Var.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(q0Var.f16178f));
            ok0Var2.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(q0Var.f16178f));
        } else {
            ng.q0 q0Var2 = this.f30101e;
            if (q0Var2.f16175b) {
                TLRPC.Document effectDocument = MessagesController.getInstance(rk0Var.G).getEffectDocument(this.f30101e.f16179g);
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(effectDocument, org.telegram.ui.ActionBar.k6.f21821m6, 0.2f);
                ImageReceiver imageReceiver = ok0Var2.getImageReceiver();
                ImageLocation forDocument = ImageLocation.getForDocument(effectDocument);
                if (this.f30104r) {
                    svgDrawable4 = null;
                } else {
                    svgDrawable4 = svgThumb;
                }
                imageReceiver.setImage(forDocument, "60_60_firstframe", null, null, svgDrawable4, 0L, "tgs", this.f30101e, 0);
            } else if (q0Var2.f16178f != null) {
                TLRPC.TL_availableReaction tL_availableReaction2 = MediaDataController.getInstance(rk0Var.G).getReactionsMap().get(this.f30101e.f16178f);
                if (tL_availableReaction2 != null) {
                    SvgHelper.SvgDrawable svgThumb2 = DocumentObject.getSvgThumb(tL_availableReaction2.activate_animation, org.telegram.ui.ActionBar.k6.f21821m6, 0.2f);
                    if (!LiteMode.isEnabled(8200) || i11 == 4) {
                        tL_availableReaction = tL_availableReaction2;
                        if (SharedConfig.getDevicePerformanceClass() > 0 && i11 != 4) {
                            ok0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.appear_animation), "30_30_nolimit", null, null, svgThumb2, 0L, "tgs", q0Var, 0);
                            ImageReceiver imageReceiver2 = ok0Var2.getImageReceiver();
                            ImageLocation forDocument2 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                            if (this.f30104r) {
                                svgDrawable2 = null;
                            } else {
                                svgDrawable2 = svgThumb2;
                            }
                            imageReceiver2.setImage(forDocument2, "60_60_firstframe", null, null, svgDrawable2, 0L, "tgs", this.f30101e, 0);
                        } else {
                            ImageReceiver imageReceiver3 = ok0Var2.getImageReceiver();
                            ImageLocation forDocument3 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                            if (this.f30104r) {
                                svgDrawable = null;
                            } else {
                                svgDrawable = svgThumb2;
                            }
                            imageReceiver3.setImage(forDocument3, "60_60_firstframe", null, null, svgDrawable, 0L, "tgs", this.f30101e, 0);
                        }
                    } else {
                        tL_availableReaction = tL_availableReaction2;
                        ok0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction2.appear_animation), "30_30_nolimit", null, null, svgThumb2, 0L, "tgs", q0Var, 0);
                        ImageReceiver imageReceiver4 = ok0Var2.getImageReceiver();
                        ImageLocation forDocument4 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                        if (this.f30104r) {
                            svgDrawable3 = null;
                        } else {
                            svgDrawable3 = svgThumb2;
                        }
                        imageReceiver4.setImage(forDocument4, "60_60_pcache", null, null, svgDrawable3, 0L, "tgs", this.f30101e, 0);
                    }
                    if (ok0Var.getImageReceiver().getLottieAnimation() != null) {
                        ok0Var.getImageReceiver().getLottieAnimation().L(0, false, true);
                    }
                    this.f30100c.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, svgThumb2, 0L, "tgs", q0Var, 0);
                    ImageReceiver imageReceiver5 = this.d;
                    imageReceiver5.setAllowStartLottieAnimation(false);
                    MediaDataController.getInstance(rk0Var.G).preloadImage(imageReceiver5, ImageLocation.getForDocument(tL_availableReaction.around_animation), ng.m0.a());
                }
                fg.r1 r1Var = this.f30102f;
                if (r1Var != null) {
                    r1Var.setImageReceiver(ok0Var2.getImageReceiver());
                }
            }
        }
    }

    public final void f(ng.q0 q0Var, boolean z4) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        boolean z10 = this.f30106w;
        boolean contains = this.M.f30753a0.contains(q0Var);
        this.f30106w = contains;
        if (contains != z10) {
            ok0 ok0Var = this.f30098a;
            ok0 ok0Var2 = this.f30099b;
            float f16 = 1.0f;
            if (!z4) {
                float f17 = this.F;
                if (contains) {
                    f13 = 0.76f;
                } else {
                    f13 = 1.0f;
                }
                ok0Var2.setScaleX(f17 * f13);
                float f18 = this.F;
                if (this.f30106w) {
                    f14 = 0.76f;
                } else {
                    f14 = 1.0f;
                }
                ok0Var2.setScaleY(f18 * f14);
                float f19 = this.F;
                if (this.f30106w) {
                    f15 = 0.76f;
                } else {
                    f15 = 1.0f;
                }
                ok0Var.setScaleX(f19 * f15);
                float f20 = this.F;
                if (this.f30106w) {
                    f16 = 0.76f;
                }
                ok0Var.setScaleY(f20 * f16);
            } else {
                ViewPropertyAnimator animate = ok0Var2.animate();
                float f21 = this.F;
                if (this.f30106w) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f21 * f10);
                float f22 = this.F;
                if (this.f30106w) {
                    f11 = 0.76f;
                } else {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator duration = scaleX.scaleY(f22 * f11).setDuration(240L);
                pr prVar = pr.h;
                duration.setInterpolator(prVar).start();
                ViewPropertyAnimator animate2 = ok0Var.animate();
                float f23 = this.F;
                if (this.f30106w) {
                    f12 = 0.76f;
                } else {
                    f12 = 1.0f;
                }
                ViewPropertyAnimator scaleX2 = animate2.scaleX(f23 * f12);
                float f24 = this.F;
                if (this.f30106w) {
                    f16 = 0.76f;
                }
                scaleX2.scaleY(f24 * f16).setDuration(240L).setInterpolator(prVar).start();
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
        ng.q0 q0Var = this.f30101e;
        if (q0Var != null) {
            String str = q0Var.f16178f;
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
        qk0 qk0Var;
        if (this.L) {
            rk0 rk0Var = this.M;
            if (rk0Var.N == null) {
                int action = motionEvent.getAction();
                mk0 mk0Var = this.H;
                if (action == 0) {
                    this.K = true;
                    this.I = motionEvent.getX();
                    this.J = motionEvent.getY();
                    if (this.h == 1.0f && !this.E && (i10 = rk0Var.J0) != 3 && i10 != 4 && i10 != 5 && ((qk0Var = rk0Var.f30761d0) == null || qk0Var.g())) {
                        AndroidUtilities.runOnUIThread(mk0Var, ViewConfiguration.getLongPressTimeout());
                    }
                }
                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 2.0f;
                if ((motionEvent.getAction() != 2 || (Math.abs(this.I - motionEvent.getX()) <= scaledTouchSlop && Math.abs(this.J - motionEvent.getY()) <= scaledTouchSlop)) && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return true;
                }
                if (motionEvent.getAction() == 1 && this.K && ((rk0Var.f30772i0 == null || rk0Var.f30774k0 > 0.8f) && rk0Var.f30761d0 != null)) {
                    rk0Var.f30778o0 = true;
                    if (System.currentTimeMillis() - rk0Var.f30779p0 > 300) {
                        rk0Var.f30779p0 = System.currentTimeMillis();
                        qk0 qk0Var2 = rk0Var.f30761d0;
                        ng.q0 q0Var = this.f30101e;
                        if (rk0Var.f30774k0 > 0.8f) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        qk0Var2.o(this, q0Var, z4, false);
                    }
                }
                if (!rk0Var.f30778o0 && rk0Var.f30772i0 != null) {
                    rk0Var.f30775l0 = 0.0f;
                    float f10 = rk0Var.f30774k0;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    rk0Var.N = ofFloat;
                    ofFloat.addUpdateListener(new fk0(rk0Var, f10));
                    rk0Var.N.addListener(new ek0(rk0Var, 1));
                    rk0Var.N.setDuration(150L);
                    rk0Var.N.setInterpolator(pr.f30183f);
                    rk0Var.N.start();
                }
                AndroidUtilities.cancelRunOnUIThread(mk0Var);
                this.K = false;
                return true;
            }
        }
        return false;
    }
}
