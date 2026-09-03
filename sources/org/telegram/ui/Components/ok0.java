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
    public boolean B;
    public mh.wa C;
    public final lk0 D;
    public boolean E;
    public float F;
    public ValueAnimator G;
    public final lk0 H;
    public float I;
    public float J;
    public boolean K;
    public boolean L;
    public final qk0 M;
    public final nk0 f29791a;
    public final nk0 f29792b;
    public final nk0 f29793c;
    public final ImageReceiver d;
    public ng.q0 f29794e;
    public fg.r1 f29795f;
    public float h;
    public boolean f29796n;
    public boolean f29797r;
    public boolean f29798s;
    public boolean v;
    public boolean f29799w;
    public boolean f29800x;
    public int f29801y;

    public ok0(qk0 qk0Var, Context context) {
        super(context);
        this.M = qk0Var;
        this.d = new ImageReceiver();
        this.h = 1.0f;
        this.f29800x = true;
        this.D = new lk0(this, 0);
        this.F = 1.0f;
        this.H = new lk0(this, 1);
        this.L = true;
        nk0 nk0Var = new nk0(this, context, 0);
        this.f29791a = nk0Var;
        nk0 nk0Var2 = new nk0(this, context, 1);
        this.f29792b = nk0Var2;
        nk0Var.getImageReceiver().setAutoRepeat(0);
        nk0Var.getImageReceiver().setAllowStartLottieAnimation(false);
        nk0 nk0Var3 = new nk0(this, context, 2);
        this.f29793c = nk0Var3;
        addView(nk0Var, k7.c6.e(34, 34, 17));
        addView(nk0Var3, k7.c6.e(34, 34, 17));
        addView(nk0Var2, k7.c6.e(34, 34, 17));
        if (qk0Var.J0 == 4) {
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setDuration(100L);
            layoutTransition.enableTransitionType(4);
            setLayoutTransition(layoutTransition);
        }
        nk0Var.setLayerNum(Integer.MAX_VALUE);
        nk0Var2.setLayerNum(Integer.MAX_VALUE);
        nk0Var2.f30011a.setAutoRepeat(0);
        nk0Var2.f30011a.setAllowStartAnimation(false);
        nk0Var2.f30011a.setAllowStartLottieAnimation(false);
        nk0Var3.setLayerNum(Integer.MAX_VALUE);
    }

    public static void a(ok0 ok0Var, ng.q0 q0Var, int i10) {
        boolean z4;
        boolean z10;
        int i11;
        nk0 nk0Var = ok0Var.f29793c;
        nk0 nk0Var2 = ok0Var.f29791a;
        nk0 nk0Var3 = ok0Var.f29792b;
        qk0 qk0Var = ok0Var.M;
        ok0Var.f(q0Var, false);
        ng.q0 q0Var2 = ok0Var.f29794e;
        if (q0Var2 != null && q0Var2.equals(q0Var)) {
            ok0Var.f29801y = i10;
            ok0Var.e(q0Var);
            return;
        }
        int i12 = qk0Var.G;
        org.telegram.ui.ActionBar.g6 g6Var = qk0Var.f30442h0;
        int i13 = qk0Var.J0;
        boolean isPremium = UserConfig.getInstance(i12).isPremium();
        if ((i13 == 3 && !isPremium) || (i13 == 5 && q0Var.d && !isPremium)) {
            z4 = true;
        } else {
            z4 = false;
        }
        ok0Var.E = z4;
        if (z4 && ok0Var.f29795f == null) {
            fg.r1 r1Var = new fg.r1(ok0Var.getContext(), 1, null);
            ok0Var.f29795f = r1Var;
            r1Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            ok0Var.f29795f.setImageReceiver(nk0Var3.getImageReceiver());
            ok0Var.addView(ok0Var.f29795f, k7.c6.d(18, 18.0f, 17, 8.0f, 8.0f, 0.0f, 0.0f));
        }
        fg.r1 r1Var2 = ok0Var.f29795f;
        if (r1Var2 != null) {
            if (ok0Var.E) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            r1Var2.setVisibility(i11);
        }
        ok0Var.d();
        ok0Var.f29794e = q0Var;
        if (!q0Var.f16176a && (q0Var.f16180f == null || ((!qk0Var.q() && !qk0Var.D0) || !LiteMode.isEnabled(8200)))) {
            z10 = false;
        } else {
            z10 = true;
        }
        ok0Var.f29797r = z10;
        if (i13 == 4 || ok0Var.f29794e.f16177b) {
            ok0Var.f29797r = false;
        }
        ng.q0 q0Var3 = ok0Var.f29794e;
        if (!q0Var3.f16176a && q0Var3.f16180f == null) {
            nk0Var.getImageReceiver().clearImage();
            nk0Var3.getImageReceiver().clearImage();
            l5 l5Var = new l5(4, qk0Var.G, ok0Var.f29794e.f16181g);
            l5 l5Var2 = new l5(3, qk0Var.G, ok0Var.f29794e.f16181g);
            if (i13 != 1 && i13 != 2 && i13 != 4) {
                int i14 = org.telegram.ui.ActionBar.k6.f21981v6;
                int v02 = org.telegram.ui.ActionBar.k6.v0(i14, g6Var);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                l5Var.setColorFilter(new PorterDuffColorFilter(v02, mode));
                l5Var2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(i14, g6Var), mode));
            } else {
                PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
                l5Var.setColorFilter(new PorterDuffColorFilter(-1, mode2));
                l5Var2.setColorFilter(new PorterDuffColorFilter(-1, mode2));
            }
            nk0Var.setAnimatedEmojiDrawable(l5Var);
            nk0Var3.setAnimatedEmojiDrawable(l5Var2);
            fg.r1 r1Var3 = ok0Var.f29795f;
            if (r1Var3 != null) {
                r1Var3.setAnimatedEmojiDrawable(l5Var2);
            }
        } else {
            ok0Var.e(q0Var);
            nk0Var.setAnimatedEmojiDrawable(null);
            if (nk0Var2.getImageReceiver().getLottieAnimation() != null) {
                nk0Var2.getImageReceiver().getLottieAnimation().L(0, false, false);
            }
            fg.r1 r1Var4 = ok0Var.f29795f;
            if (r1Var4 != null) {
                r1Var4.setAnimatedEmojiDrawable(null);
            }
        }
        ok0Var.setFocusable(true);
        boolean z11 = ok0Var.f29797r;
        ok0Var.f29798s = z11;
        if (!z11) {
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
        nk0 nk0Var = this.f29792b;
        l5 l5Var = nk0Var.f30014e;
        if (l5Var != null) {
            imageReceiver = l5Var.f28637k;
        } else {
            imageReceiver = nk0Var.f30011a;
        }
        if (imageReceiver != null && imageReceiver.getLottieAnimation() != null) {
            qk0 qk0Var = this.M;
            if (qk0Var.f30457u0 == null && !this.K && qk0Var.D0) {
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
        if (!this.M.f30440g0) {
            d();
            this.f29796n = true;
            if (!this.f29797r) {
                this.f29792b.setVisibility(0);
                nk0 nk0Var = this.f29792b;
                float f13 = this.F;
                if (this.f29799w) {
                    f11 = 0.76f;
                } else {
                    f11 = 1.0f;
                }
                nk0Var.setScaleY(f13 * f11);
                nk0 nk0Var2 = this.f29792b;
                float f14 = this.F;
                if (!this.f29799w) {
                    f12 = 1.0f;
                }
                nk0Var2.setScaleX(f14 * f12);
                return;
            }
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.D);
        if (this.f29797r) {
            if (this.f29791a.getImageReceiver().getLottieAnimation() != null && !this.f29791a.getImageReceiver().getLottieAnimation().w() && !this.f29796n) {
                this.f29796n = true;
                if (i10 == 0) {
                    this.B = false;
                    this.f29791a.getImageReceiver().getLottieAnimation().stop();
                    this.f29791a.getImageReceiver().getLottieAnimation().L(0, false, false);
                    this.D.run();
                    return;
                }
                this.B = true;
                this.f29791a.getImageReceiver().getLottieAnimation().stop();
                this.f29791a.getImageReceiver().getLottieAnimation().L(0, false, false);
                AndroidUtilities.runOnUIThread(this.D, i10);
                return;
            }
            if (this.f29791a.getImageReceiver().getLottieAnimation() != null && this.f29796n && !this.f29791a.getImageReceiver().getLottieAnimation().f27530i0 && !this.f29791a.getImageReceiver().getLottieAnimation().w()) {
                this.f29791a.getImageReceiver().getLottieAnimation().L(this.f29791a.getImageReceiver().getLottieAnimation().f27524e[0] - 1, false, false);
            }
            nk0 nk0Var3 = this.f29792b;
            float f15 = this.F;
            if (this.f29799w) {
                f10 = 0.76f;
            } else {
                f10 = 1.0f;
            }
            nk0Var3.setScaleY(f15 * f10);
            nk0 nk0Var4 = this.f29792b;
            float f16 = this.F;
            if (!this.f29799w) {
                f12 = 1.0f;
            }
            nk0Var4.setScaleX(f16 * f12);
        } else if (!this.f29796n) {
            this.F = 0.0f;
            this.f29792b.setScaleX(0.0f);
            this.f29792b.setScaleY(0.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.G = ofFloat;
            ofFloat.addUpdateListener(new k70(this, 9));
            this.G.setDuration(150L);
            this.G.setInterpolator(pr.h);
            this.G.setStartDelay(i10 * this.M.f30429c);
            this.G.start();
            this.f29796n = true;
        }
    }

    public final void d() {
        float f10;
        float f11;
        boolean z4 = this.f29797r;
        qk0 qk0Var = this.M;
        float f12 = 1.0f;
        nk0 nk0Var = this.f29792b;
        if (z4) {
            AndroidUtilities.cancelRunOnUIThread(this.D);
            nk0 nk0Var2 = this.f29791a;
            if (nk0Var2.getImageReceiver().getLottieAnimation() != null && !nk0Var2.getImageReceiver().getLottieAnimation().w()) {
                nk0Var2.getImageReceiver().getLottieAnimation().stop();
                if (qk0Var.f30440g0) {
                    nk0Var2.getImageReceiver().getLottieAnimation().L(0, false, true);
                } else {
                    nk0Var2.getImageReceiver().getLottieAnimation().L(nk0Var2.getImageReceiver().getLottieAnimation().f27524e[0] - 1, false, true);
                }
            }
            nk0Var.setVisibility(4);
            nk0Var2.setVisibility(0);
            this.v = false;
            float f13 = this.F;
            if (this.f29799w) {
                f11 = 0.76f;
            } else {
                f11 = 1.0f;
            }
            nk0Var.setScaleY(f13 * f11);
            float f14 = this.F;
            if (this.f29799w) {
                f12 = 0.76f;
            }
            nk0Var.setScaleX(f14 * f12);
        } else {
            nk0Var.animate().cancel();
            if (qk0Var.K0) {
                float f15 = this.F;
                if (this.f29799w) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                nk0Var.setScaleY(f15 * f10);
                float f16 = this.F;
                if (this.f29799w) {
                    f12 = 0.76f;
                }
                nk0Var.setScaleX(f16 * f12);
            } else {
                nk0Var.setScaleY(0.0f);
                nk0Var.setScaleX(0.0f);
            }
        }
        this.f29796n = false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        int i10;
        oh.z2 z2Var;
        Paint paint;
        if (this.f29799w && this.f29800x) {
            float measuredWidth = getMeasuredWidth() >> 1;
            float measuredHeight = getMeasuredHeight() >> 1;
            float measuredWidth2 = (getMeasuredWidth() >> 1) - AndroidUtilities.dp(1.0f);
            ng.q0 q0Var = this.f29794e;
            qk0 qk0Var = this.M;
            if (q0Var != null && q0Var.f16176a) {
                paint = qk0Var.F0;
            } else {
                paint = qk0Var.E0;
            }
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth2, paint);
        }
        l5 l5Var = this.f29792b.f30014e;
        if (l5Var != null && (z2Var = l5Var.f28637k) != null) {
            int i11 = 0;
            if (this.f29801y == 0) {
                z2Var.setRoundRadius(AndroidUtilities.dp(6.0f), 0, 0, AndroidUtilities.dp(6.0f));
            } else {
                if (this.f29799w) {
                    i11 = AndroidUtilities.dp(6.0f);
                }
                z2Var.setRoundRadius(i11);
            }
        }
        ng.q0 q0Var2 = this.f29794e;
        if (q0Var2 != null && q0Var2.f16176a && this.C != null && LiteMode.isEnabled(8200) && LiteMode.isEnabled(131072)) {
            RectF rectF = AndroidUtilities.rectTmp;
            float height = ((int) (getHeight() * 0.7f)) / 2.0f;
            rectF.set((getWidth() / 2.0f) - height, (getHeight() / 2.0f) - height, (getWidth() / 2.0f) + height, (getHeight() / 2.0f) + height);
            hj0 lottieAnimation = this.f29791a.getImageReceiver().getLottieAnimation();
            mh.wa waVar = this.C;
            if (lottieAnimation != null && (i10 = lottieAnimation.Y) > 30) {
                f10 = Utilities.clamp01((i10 - 30) / 30.0f);
            } else {
                f10 = 0.0f;
            }
            waVar.f15014j = (int) (waVar.f15008b.size() * f10);
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
        qk0 qk0Var = this.M;
        int i11 = qk0Var.J0;
        nk0 nk0Var = this.f29791a;
        nk0 nk0Var2 = this.f29792b;
        if (q0Var != null && q0Var.f16176a) {
            nk0Var.getImageReceiver().setImageBitmap(new hj0(R.raw.star_reaction, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f)));
            nk0Var2.getImageReceiver().setImageBitmap(getContext().getResources().getDrawable(R.drawable.star_reaction));
            if (this.C == null) {
                if (SharedConfig.getDevicePerformanceClass() == 2) {
                    i10 = 45;
                } else {
                    i10 = 18;
                }
                this.C = new mh.wa(1, i10);
            }
        } else if (i11 == 4 && q0Var != null && q0Var.f16180f != null) {
            nk0Var.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(q0Var.f16180f));
            nk0Var2.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(q0Var.f16180f));
        } else {
            ng.q0 q0Var2 = this.f29794e;
            if (q0Var2.f16177b) {
                TLRPC.Document effectDocument = MessagesController.getInstance(qk0Var.G).getEffectDocument(this.f29794e.f16181g);
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(effectDocument, org.telegram.ui.ActionBar.k6.f21823m6, 0.2f);
                ImageReceiver imageReceiver = nk0Var2.getImageReceiver();
                ImageLocation forDocument = ImageLocation.getForDocument(effectDocument);
                if (this.f29797r) {
                    svgDrawable4 = null;
                } else {
                    svgDrawable4 = svgThumb;
                }
                imageReceiver.setImage(forDocument, "60_60_firstframe", null, null, svgDrawable4, 0L, "tgs", this.f29794e, 0);
            } else if (q0Var2.f16180f != null) {
                TLRPC.TL_availableReaction tL_availableReaction2 = MediaDataController.getInstance(qk0Var.G).getReactionsMap().get(this.f29794e.f16180f);
                if (tL_availableReaction2 != null) {
                    SvgHelper.SvgDrawable svgThumb2 = DocumentObject.getSvgThumb(tL_availableReaction2.activate_animation, org.telegram.ui.ActionBar.k6.f21823m6, 0.2f);
                    if (!LiteMode.isEnabled(8200) || i11 == 4) {
                        tL_availableReaction = tL_availableReaction2;
                        if (SharedConfig.getDevicePerformanceClass() > 0 && i11 != 4) {
                            nk0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.appear_animation), "30_30_nolimit", null, null, svgThumb2, 0L, "tgs", q0Var, 0);
                            ImageReceiver imageReceiver2 = nk0Var2.getImageReceiver();
                            ImageLocation forDocument2 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                            if (this.f29797r) {
                                svgDrawable2 = null;
                            } else {
                                svgDrawable2 = svgThumb2;
                            }
                            imageReceiver2.setImage(forDocument2, "60_60_firstframe", null, null, svgDrawable2, 0L, "tgs", this.f29794e, 0);
                        } else {
                            ImageReceiver imageReceiver3 = nk0Var2.getImageReceiver();
                            ImageLocation forDocument3 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                            if (this.f29797r) {
                                svgDrawable = null;
                            } else {
                                svgDrawable = svgThumb2;
                            }
                            imageReceiver3.setImage(forDocument3, "60_60_firstframe", null, null, svgDrawable, 0L, "tgs", this.f29794e, 0);
                        }
                    } else {
                        tL_availableReaction = tL_availableReaction2;
                        nk0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction2.appear_animation), "30_30_nolimit", null, null, svgThumb2, 0L, "tgs", q0Var, 0);
                        ImageReceiver imageReceiver4 = nk0Var2.getImageReceiver();
                        ImageLocation forDocument4 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                        if (this.f29797r) {
                            svgDrawable3 = null;
                        } else {
                            svgDrawable3 = svgThumb2;
                        }
                        imageReceiver4.setImage(forDocument4, "60_60_pcache", null, null, svgDrawable3, 0L, "tgs", this.f29794e, 0);
                    }
                    if (nk0Var.getImageReceiver().getLottieAnimation() != null) {
                        nk0Var.getImageReceiver().getLottieAnimation().L(0, false, true);
                    }
                    this.f29793c.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, svgThumb2, 0L, "tgs", q0Var, 0);
                    ImageReceiver imageReceiver5 = this.d;
                    imageReceiver5.setAllowStartLottieAnimation(false);
                    MediaDataController.getInstance(qk0Var.G).preloadImage(imageReceiver5, ImageLocation.getForDocument(tL_availableReaction.around_animation), ng.m0.a());
                }
                fg.r1 r1Var = this.f29795f;
                if (r1Var != null) {
                    r1Var.setImageReceiver(nk0Var2.getImageReceiver());
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
        boolean z10 = this.f29799w;
        boolean contains = this.M.f30424a0.contains(q0Var);
        this.f29799w = contains;
        if (contains != z10) {
            nk0 nk0Var = this.f29791a;
            nk0 nk0Var2 = this.f29792b;
            float f16 = 1.0f;
            if (!z4) {
                float f17 = this.F;
                if (contains) {
                    f13 = 0.76f;
                } else {
                    f13 = 1.0f;
                }
                nk0Var2.setScaleX(f17 * f13);
                float f18 = this.F;
                if (this.f29799w) {
                    f14 = 0.76f;
                } else {
                    f14 = 1.0f;
                }
                nk0Var2.setScaleY(f18 * f14);
                float f19 = this.F;
                if (this.f29799w) {
                    f15 = 0.76f;
                } else {
                    f15 = 1.0f;
                }
                nk0Var.setScaleX(f19 * f15);
                float f20 = this.F;
                if (this.f29799w) {
                    f16 = 0.76f;
                }
                nk0Var.setScaleY(f20 * f16);
            } else {
                ViewPropertyAnimator animate = nk0Var2.animate();
                float f21 = this.F;
                if (this.f29799w) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f21 * f10);
                float f22 = this.F;
                if (this.f29799w) {
                    f11 = 0.76f;
                } else {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator duration = scaleX.scaleY(f22 * f11).setDuration(240L);
                pr prVar = pr.h;
                duration.setInterpolator(prVar).start();
                ViewPropertyAnimator animate2 = nk0Var.animate();
                float f23 = this.F;
                if (this.f29799w) {
                    f12 = 0.76f;
                } else {
                    f12 = 1.0f;
                }
                ViewPropertyAnimator scaleX2 = animate2.scaleX(f23 * f12);
                float f24 = this.F;
                if (this.f29799w) {
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
        ng.q0 q0Var = this.f29794e;
        if (q0Var != null) {
            String str = q0Var.f16180f;
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
        pk0 pk0Var;
        if (this.L) {
            qk0 qk0Var = this.M;
            if (qk0Var.N == null) {
                int action = motionEvent.getAction();
                lk0 lk0Var = this.H;
                if (action == 0) {
                    this.K = true;
                    this.I = motionEvent.getX();
                    this.J = motionEvent.getY();
                    if (this.h == 1.0f && !this.E && (i10 = qk0Var.J0) != 3 && i10 != 4 && i10 != 5 && ((pk0Var = qk0Var.f30432d0) == null || pk0Var.g())) {
                        AndroidUtilities.runOnUIThread(lk0Var, ViewConfiguration.getLongPressTimeout());
                    }
                }
                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 2.0f;
                if ((motionEvent.getAction() != 2 || (Math.abs(this.I - motionEvent.getX()) <= scaledTouchSlop && Math.abs(this.J - motionEvent.getY()) <= scaledTouchSlop)) && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return true;
                }
                if (motionEvent.getAction() == 1 && this.K && ((qk0Var.f30443i0 == null || qk0Var.f30445k0 > 0.8f) && qk0Var.f30432d0 != null)) {
                    qk0Var.f30449o0 = true;
                    if (System.currentTimeMillis() - qk0Var.f30450p0 > 300) {
                        qk0Var.f30450p0 = System.currentTimeMillis();
                        pk0 pk0Var2 = qk0Var.f30432d0;
                        ng.q0 q0Var = this.f29794e;
                        if (qk0Var.f30445k0 > 0.8f) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        pk0Var2.o(this, q0Var, z4, false);
                    }
                }
                if (!qk0Var.f30449o0 && qk0Var.f30443i0 != null) {
                    qk0Var.f30446l0 = 0.0f;
                    float f10 = qk0Var.f30445k0;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    qk0Var.N = ofFloat;
                    ofFloat.addUpdateListener(new ek0(qk0Var, f10));
                    qk0Var.N.addListener(new dk0(qk0Var, 1));
                    qk0Var.N.setDuration(150L);
                    qk0Var.N.setInterpolator(pr.f30168f);
                    qk0Var.N.start();
                }
                AndroidUtilities.cancelRunOnUIThread(lk0Var);
                this.K = false;
                return true;
            }
        }
        return false;
    }
}
