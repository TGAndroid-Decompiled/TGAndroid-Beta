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
public final class sj0 extends FrameLayout {
    public boolean A;
    public gh.bb B;
    public final pj0 C;
    public boolean D;
    public float E;
    public ValueAnimator F;
    public final pj0 G;
    public float H;
    public float I;
    public boolean J;
    public boolean K;
    public final uj0 L;
    public final rj0 f32474a;
    public final rj0 f32475b;
    public final rj0 f32476c;
    public final ImageReceiver d;
    public hg.r0 f32477e;
    public zf.b1 f32478f;
    public float h;
    public boolean f32479n;
    public boolean f32480r;
    public boolean f32481s;
    public boolean v;
    public boolean f32482w;
    public boolean f32483x;
    public int f32484y;

    public sj0(uj0 uj0Var, Context context) {
        super(context);
        this.L = uj0Var;
        this.d = new ImageReceiver();
        this.h = 1.0f;
        this.f32483x = true;
        this.C = new pj0(this, 0);
        this.E = 1.0f;
        this.G = new pj0(this, 1);
        this.K = true;
        rj0 rj0Var = new rj0(this, context, 0);
        this.f32474a = rj0Var;
        rj0 rj0Var2 = new rj0(this, context, 1);
        this.f32475b = rj0Var2;
        rj0Var.getImageReceiver().setAutoRepeat(0);
        rj0Var.getImageReceiver().setAllowStartLottieAnimation(false);
        rj0 rj0Var3 = new rj0(this, context, 2);
        this.f32476c = rj0Var3;
        addView(rj0Var, g7.e6.e(34, 34, 17));
        addView(rj0Var3, g7.e6.e(34, 34, 17));
        addView(rj0Var2, g7.e6.e(34, 34, 17));
        if (uj0Var.I0 == 4) {
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setDuration(100L);
            layoutTransition.enableTransitionType(4);
            setLayoutTransition(layoutTransition);
        }
        rj0Var.setLayerNum(Integer.MAX_VALUE);
        rj0Var2.setLayerNum(Integer.MAX_VALUE);
        rj0Var2.f31328a.setAutoRepeat(0);
        rj0Var2.f31328a.setAllowStartAnimation(false);
        rj0Var2.f31328a.setAllowStartLottieAnimation(false);
        rj0Var3.setLayerNum(Integer.MAX_VALUE);
    }

    public static void a(sj0 sj0Var, hg.r0 r0Var, int i9) {
        boolean z10;
        boolean z11;
        int i10;
        rj0 rj0Var = sj0Var.f32476c;
        rj0 rj0Var2 = sj0Var.f32474a;
        rj0 rj0Var3 = sj0Var.f32475b;
        uj0 uj0Var = sj0Var.L;
        sj0Var.f(r0Var, false);
        hg.r0 r0Var2 = sj0Var.f32477e;
        if (r0Var2 != null && r0Var2.equals(r0Var)) {
            sj0Var.f32484y = i9;
            sj0Var.e(r0Var);
            return;
        }
        int i11 = uj0Var.F;
        org.telegram.ui.ActionBar.b6 b6Var = uj0Var.f33059g0;
        int i12 = uj0Var.I0;
        boolean isPremium = UserConfig.getInstance(i11).isPremium();
        if ((i12 == 3 && !isPremium) || (i12 == 5 && r0Var.d && !isPremium)) {
            z10 = true;
        } else {
            z10 = false;
        }
        sj0Var.D = z10;
        if (z10 && sj0Var.f32478f == null) {
            zf.b1 b1Var = new zf.b1(sj0Var.getContext(), 1, null);
            sj0Var.f32478f = b1Var;
            b1Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            sj0Var.f32478f.setImageReceiver(rj0Var3.getImageReceiver());
            sj0Var.addView(sj0Var.f32478f, g7.e6.d(18, 18.0f, 17, 8.0f, 8.0f, 0.0f, 0.0f));
        }
        zf.b1 b1Var2 = sj0Var.f32478f;
        if (b1Var2 != null) {
            if (sj0Var.D) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            b1Var2.setVisibility(i10);
        }
        sj0Var.d();
        sj0Var.f32477e = r0Var;
        if (!r0Var.f10713a && (r0Var.f10717f == null || ((!uj0Var.q() && !uj0Var.C0) || !LiteMode.isEnabled(8200)))) {
            z11 = false;
        } else {
            z11 = true;
        }
        sj0Var.f32480r = z11;
        if (i12 == 4 || sj0Var.f32477e.f10714b) {
            sj0Var.f32480r = false;
        }
        hg.r0 r0Var3 = sj0Var.f32477e;
        if (!r0Var3.f10713a && r0Var3.f10717f == null) {
            rj0Var.getImageReceiver().clearImage();
            rj0Var3.getImageReceiver().clearImage();
            k5 k5Var = new k5(4, uj0Var.F, sj0Var.f32477e.f10718g);
            k5 k5Var2 = new k5(3, uj0Var.F, sj0Var.f32477e.f10718g);
            if (i12 != 1 && i12 != 2 && i12 != 4) {
                int i13 = org.telegram.ui.ActionBar.f6.f23319v6;
                int v02 = org.telegram.ui.ActionBar.f6.v0(i13, b6Var);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                k5Var.setColorFilter(new PorterDuffColorFilter(v02, mode));
                k5Var2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i13, b6Var), mode));
            } else {
                PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
                k5Var.setColorFilter(new PorterDuffColorFilter(-1, mode2));
                k5Var2.setColorFilter(new PorterDuffColorFilter(-1, mode2));
            }
            rj0Var.setAnimatedEmojiDrawable(k5Var);
            rj0Var3.setAnimatedEmojiDrawable(k5Var2);
            zf.b1 b1Var3 = sj0Var.f32478f;
            if (b1Var3 != null) {
                b1Var3.setAnimatedEmojiDrawable(k5Var2);
            }
        } else {
            sj0Var.e(r0Var);
            rj0Var.setAnimatedEmojiDrawable(null);
            if (rj0Var2.getImageReceiver().getLottieAnimation() != null) {
                rj0Var2.getImageReceiver().getLottieAnimation().L(0, false, false);
            }
            zf.b1 b1Var4 = sj0Var.f32478f;
            if (b1Var4 != null) {
                b1Var4.setAnimatedEmojiDrawable(null);
            }
        }
        sj0Var.setFocusable(true);
        boolean z12 = sj0Var.f32480r;
        sj0Var.f32481s = z12;
        if (!z12) {
            rj0Var2.setVisibility(8);
            rj0Var3.setVisibility(0);
            sj0Var.v = true;
        } else {
            sj0Var.v = false;
            rj0Var2.setVisibility(0);
            rj0Var3.setVisibility(8);
        }
        ViewGroup.LayoutParams layoutParams = rj0Var3.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = rj0Var3.getLayoutParams();
        int dp = AndroidUtilities.dp(34.0f);
        layoutParams2.height = dp;
        layoutParams.width = dp;
        ViewGroup.LayoutParams layoutParams3 = rj0Var2.getLayoutParams();
        ViewGroup.LayoutParams layoutParams4 = rj0Var2.getLayoutParams();
        int dp2 = AndroidUtilities.dp(34.0f);
        layoutParams4.height = dp2;
        layoutParams3.width = dp2;
    }

    public final void b() {
        ImageReceiver imageReceiver;
        rj0 rj0Var = this.f32475b;
        k5 k5Var = rj0Var.f31331e;
        if (k5Var != null) {
            imageReceiver = k5Var.f29951k;
        } else {
            imageReceiver = rj0Var.f31328a;
        }
        if (imageReceiver != null && imageReceiver.getLottieAnimation() != null) {
            uj0 uj0Var = this.L;
            if (uj0Var.f33074t0 == null && !this.J && uj0Var.C0) {
                if (imageReceiver.getLottieAnimation().X <= 2) {
                    imageReceiver.getLottieAnimation().stop();
                    return;
                }
                return;
            }
            imageReceiver.getLottieAnimation().start();
        }
    }

    public final void c(int i9) {
        float f10;
        float f11;
        float f12 = 0.76f;
        if (!this.L.f33057f0) {
            d();
            this.f32479n = true;
            if (!this.f32480r) {
                this.f32475b.setVisibility(0);
                rj0 rj0Var = this.f32475b;
                float f13 = this.E;
                if (this.f32482w) {
                    f11 = 0.76f;
                } else {
                    f11 = 1.0f;
                }
                rj0Var.setScaleY(f13 * f11);
                rj0 rj0Var2 = this.f32475b;
                float f14 = this.E;
                if (!this.f32482w) {
                    f12 = 1.0f;
                }
                rj0Var2.setScaleX(f14 * f12);
                return;
            }
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.C);
        if (this.f32480r) {
            if (this.f32474a.getImageReceiver().getLottieAnimation() != null && !this.f32474a.getImageReceiver().getLottieAnimation().w() && !this.f32479n) {
                this.f32479n = true;
                if (i9 == 0) {
                    this.A = false;
                    this.f32474a.getImageReceiver().getLottieAnimation().stop();
                    this.f32474a.getImageReceiver().getLottieAnimation().L(0, false, false);
                    this.C.run();
                    return;
                }
                this.A = true;
                this.f32474a.getImageReceiver().getLottieAnimation().stop();
                this.f32474a.getImageReceiver().getLottieAnimation().L(0, false, false);
                AndroidUtilities.runOnUIThread(this.C, i9);
                return;
            }
            if (this.f32474a.getImageReceiver().getLottieAnimation() != null && this.f32479n && !this.f32474a.getImageReceiver().getLottieAnimation().f30852h0 && !this.f32474a.getImageReceiver().getLottieAnimation().w()) {
                this.f32474a.getImageReceiver().getLottieAnimation().L(this.f32474a.getImageReceiver().getLottieAnimation().f30847e[0] - 1, false, false);
            }
            rj0 rj0Var3 = this.f32475b;
            float f15 = this.E;
            if (this.f32482w) {
                f10 = 0.76f;
            } else {
                f10 = 1.0f;
            }
            rj0Var3.setScaleY(f15 * f10);
            rj0 rj0Var4 = this.f32475b;
            float f16 = this.E;
            if (!this.f32482w) {
                f12 = 1.0f;
            }
            rj0Var4.setScaleX(f16 * f12);
        } else if (!this.f32479n) {
            this.E = 0.0f;
            this.f32475b.setScaleX(0.0f);
            this.f32475b.setScaleY(0.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.F = ofFloat;
            ofFloat.addUpdateListener(new q60(this, 9));
            this.F.setDuration(150L);
            this.F.setInterpolator(gr.h);
            this.F.setStartDelay(i9 * this.L.f33048c);
            this.F.start();
            this.f32479n = true;
        }
    }

    public final void d() {
        float f10;
        float f11;
        boolean z10 = this.f32480r;
        uj0 uj0Var = this.L;
        float f12 = 1.0f;
        rj0 rj0Var = this.f32475b;
        if (z10) {
            AndroidUtilities.cancelRunOnUIThread(this.C);
            rj0 rj0Var2 = this.f32474a;
            if (rj0Var2.getImageReceiver().getLottieAnimation() != null && !rj0Var2.getImageReceiver().getLottieAnimation().w()) {
                rj0Var2.getImageReceiver().getLottieAnimation().stop();
                if (uj0Var.f33057f0) {
                    rj0Var2.getImageReceiver().getLottieAnimation().L(0, false, true);
                } else {
                    rj0Var2.getImageReceiver().getLottieAnimation().L(rj0Var2.getImageReceiver().getLottieAnimation().f30847e[0] - 1, false, true);
                }
            }
            rj0Var.setVisibility(4);
            rj0Var2.setVisibility(0);
            this.v = false;
            float f13 = this.E;
            if (this.f32482w) {
                f11 = 0.76f;
            } else {
                f11 = 1.0f;
            }
            rj0Var.setScaleY(f13 * f11);
            float f14 = this.E;
            if (this.f32482w) {
                f12 = 0.76f;
            }
            rj0Var.setScaleX(f14 * f12);
        } else {
            rj0Var.animate().cancel();
            if (uj0Var.J0) {
                float f15 = this.E;
                if (this.f32482w) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                rj0Var.setScaleY(f15 * f10);
                float f16 = this.E;
                if (this.f32482w) {
                    f12 = 0.76f;
                }
                rj0Var.setScaleX(f16 * f12);
            } else {
                rj0Var.setScaleY(0.0f);
                rj0Var.setScaleX(0.0f);
            }
        }
        this.f32479n = false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        int i9;
        ih.z2 z2Var;
        Paint paint;
        if (this.f32482w && this.f32483x) {
            float measuredWidth = getMeasuredWidth() >> 1;
            float measuredHeight = getMeasuredHeight() >> 1;
            float measuredWidth2 = (getMeasuredWidth() >> 1) - AndroidUtilities.dp(1.0f);
            hg.r0 r0Var = this.f32477e;
            uj0 uj0Var = this.L;
            if (r0Var != null && r0Var.f10713a) {
                paint = uj0Var.E0;
            } else {
                paint = uj0Var.D0;
            }
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth2, paint);
        }
        k5 k5Var = this.f32475b.f31331e;
        if (k5Var != null && (z2Var = k5Var.f29951k) != null) {
            int i10 = 0;
            if (this.f32484y == 0) {
                z2Var.setRoundRadius(AndroidUtilities.dp(6.0f), 0, 0, AndroidUtilities.dp(6.0f));
            } else {
                if (this.f32482w) {
                    i10 = AndroidUtilities.dp(6.0f);
                }
                z2Var.setRoundRadius(i10);
            }
        }
        hg.r0 r0Var2 = this.f32477e;
        if (r0Var2 != null && r0Var2.f10713a && this.B != null && LiteMode.isEnabled(8200) && LiteMode.isEnabled(131072)) {
            RectF rectF = AndroidUtilities.rectTmp;
            float height = ((int) (getHeight() * 0.7f)) / 2.0f;
            rectF.set((getWidth() / 2.0f) - height, (getHeight() / 2.0f) - height, (getWidth() / 2.0f) + height, (getHeight() / 2.0f) + height);
            mi0 lottieAnimation = this.f32474a.getImageReceiver().getLottieAnimation();
            gh.bb bbVar = this.B;
            if (lottieAnimation != null && (i9 = lottieAnimation.X) > 30) {
                f10 = Utilities.clamp01((i9 - 30) / 30.0f);
            } else {
                f10 = 0.0f;
            }
            bbVar.f7884j = (int) (bbVar.f7878b.size() * f10);
            this.B.g(rectF);
            this.B.d();
            this.B.a(canvas, -673522);
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void e(hg.r0 r0Var) {
        TLRPC.TL_availableReaction tL_availableReaction;
        SvgHelper.SvgDrawable svgDrawable;
        SvgHelper.SvgDrawable svgDrawable2;
        SvgHelper.SvgDrawable svgDrawable3;
        SvgHelper.SvgDrawable svgDrawable4;
        int i9;
        uj0 uj0Var = this.L;
        int i10 = uj0Var.I0;
        rj0 rj0Var = this.f32474a;
        rj0 rj0Var2 = this.f32475b;
        if (r0Var != null && r0Var.f10713a) {
            rj0Var.getImageReceiver().setImageBitmap(new mi0(R.raw.star_reaction, AndroidUtilities.dp(30.0f), "star_reaction", AndroidUtilities.dp(30.0f)));
            rj0Var2.getImageReceiver().setImageBitmap(getContext().getResources().getDrawable(R.drawable.star_reaction));
            if (this.B == null) {
                if (SharedConfig.getDevicePerformanceClass() == 2) {
                    i9 = 45;
                } else {
                    i9 = 18;
                }
                this.B = new gh.bb(1, i9);
            }
        } else if (i10 == 4 && r0Var != null && r0Var.f10717f != null) {
            rj0Var.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(r0Var.f10717f));
            rj0Var2.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(r0Var.f10717f));
        } else {
            hg.r0 r0Var2 = this.f32477e;
            if (r0Var2.f10714b) {
                TLRPC.Document effectDocument = MessagesController.getInstance(uj0Var.F).getEffectDocument(this.f32477e.f10718g);
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(effectDocument, org.telegram.ui.ActionBar.f6.f23162m6, 0.2f);
                ImageReceiver imageReceiver = rj0Var2.getImageReceiver();
                ImageLocation forDocument = ImageLocation.getForDocument(effectDocument);
                if (this.f32480r) {
                    svgDrawable4 = null;
                } else {
                    svgDrawable4 = svgThumb;
                }
                imageReceiver.setImage(forDocument, "60_60_firstframe", null, null, svgDrawable4, 0L, "tgs", this.f32477e, 0);
            } else if (r0Var2.f10717f != null) {
                TLRPC.TL_availableReaction tL_availableReaction2 = MediaDataController.getInstance(uj0Var.F).getReactionsMap().get(this.f32477e.f10717f);
                if (tL_availableReaction2 != null) {
                    SvgHelper.SvgDrawable svgThumb2 = DocumentObject.getSvgThumb(tL_availableReaction2.activate_animation, org.telegram.ui.ActionBar.f6.f23162m6, 0.2f);
                    if (!LiteMode.isEnabled(8200) || i10 == 4) {
                        tL_availableReaction = tL_availableReaction2;
                        if (SharedConfig.getDevicePerformanceClass() > 0 && i10 != 4) {
                            rj0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.appear_animation), "30_30_nolimit", null, null, svgThumb2, 0L, "tgs", r0Var, 0);
                            ImageReceiver imageReceiver2 = rj0Var2.getImageReceiver();
                            ImageLocation forDocument2 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                            if (this.f32480r) {
                                svgDrawable2 = null;
                            } else {
                                svgDrawable2 = svgThumb2;
                            }
                            imageReceiver2.setImage(forDocument2, "60_60_firstframe", null, null, svgDrawable2, 0L, "tgs", this.f32477e, 0);
                        } else {
                            ImageReceiver imageReceiver3 = rj0Var2.getImageReceiver();
                            ImageLocation forDocument3 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                            if (this.f32480r) {
                                svgDrawable = null;
                            } else {
                                svgDrawable = svgThumb2;
                            }
                            imageReceiver3.setImage(forDocument3, "60_60_firstframe", null, null, svgDrawable, 0L, "tgs", this.f32477e, 0);
                        }
                    } else {
                        tL_availableReaction = tL_availableReaction2;
                        rj0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction2.appear_animation), "30_30_nolimit", null, null, svgThumb2, 0L, "tgs", r0Var, 0);
                        ImageReceiver imageReceiver4 = rj0Var2.getImageReceiver();
                        ImageLocation forDocument4 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                        if (this.f32480r) {
                            svgDrawable3 = null;
                        } else {
                            svgDrawable3 = svgThumb2;
                        }
                        imageReceiver4.setImage(forDocument4, "60_60_pcache", null, null, svgDrawable3, 0L, "tgs", this.f32477e, 0);
                    }
                    if (rj0Var.getImageReceiver().getLottieAnimation() != null) {
                        rj0Var.getImageReceiver().getLottieAnimation().L(0, false, true);
                    }
                    this.f32476c.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, svgThumb2, 0L, "tgs", r0Var, 0);
                    ImageReceiver imageReceiver5 = this.d;
                    imageReceiver5.setAllowStartLottieAnimation(false);
                    MediaDataController.getInstance(uj0Var.F).preloadImage(imageReceiver5, ImageLocation.getForDocument(tL_availableReaction.around_animation), hg.n0.a());
                }
                zf.b1 b1Var = this.f32478f;
                if (b1Var != null) {
                    b1Var.setImageReceiver(rj0Var2.getImageReceiver());
                }
            }
        }
    }

    public final void f(hg.r0 r0Var, boolean z10) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        boolean z11 = this.f32482w;
        boolean contains = this.L.W.contains(r0Var);
        this.f32482w = contains;
        if (contains != z11) {
            rj0 rj0Var = this.f32474a;
            rj0 rj0Var2 = this.f32475b;
            float f16 = 1.0f;
            if (!z10) {
                float f17 = this.E;
                if (contains) {
                    f13 = 0.76f;
                } else {
                    f13 = 1.0f;
                }
                rj0Var2.setScaleX(f17 * f13);
                float f18 = this.E;
                if (this.f32482w) {
                    f14 = 0.76f;
                } else {
                    f14 = 1.0f;
                }
                rj0Var2.setScaleY(f18 * f14);
                float f19 = this.E;
                if (this.f32482w) {
                    f15 = 0.76f;
                } else {
                    f15 = 1.0f;
                }
                rj0Var.setScaleX(f19 * f15);
                float f20 = this.E;
                if (this.f32482w) {
                    f16 = 0.76f;
                }
                rj0Var.setScaleY(f20 * f16);
            } else {
                ViewPropertyAnimator animate = rj0Var2.animate();
                float f21 = this.E;
                if (this.f32482w) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f21 * f10);
                float f22 = this.E;
                if (this.f32482w) {
                    f11 = 0.76f;
                } else {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator duration = scaleX.scaleY(f22 * f11).setDuration(240L);
                gr grVar = gr.h;
                duration.setInterpolator(grVar).start();
                ViewPropertyAnimator animate2 = rj0Var.animate();
                float f23 = this.E;
                if (this.f32482w) {
                    f12 = 0.76f;
                } else {
                    f12 = 1.0f;
                }
                ViewPropertyAnimator scaleX2 = animate2.scaleX(f23 * f12);
                float f24 = this.E;
                if (this.f32482w) {
                    f16 = 0.76f;
                }
                scaleX2.scaleY(f24 * f16).setDuration(240L).setInterpolator(grVar).start();
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
        hg.r0 r0Var = this.f32477e;
        if (r0Var != null) {
            String str = r0Var.f10717f;
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
        int i9;
        tj0 tj0Var;
        if (this.K) {
            uj0 uj0Var = this.L;
            if (uj0Var.M == null) {
                int action = motionEvent.getAction();
                pj0 pj0Var = this.G;
                if (action == 0) {
                    this.J = true;
                    this.H = motionEvent.getX();
                    this.I = motionEvent.getY();
                    if (this.h == 1.0f && !this.D && (i9 = uj0Var.I0) != 3 && i9 != 4 && i9 != 5 && ((tj0Var = uj0Var.f33049c0) == null || tj0Var.n())) {
                        AndroidUtilities.runOnUIThread(pj0Var, ViewConfiguration.getLongPressTimeout());
                    }
                }
                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 2.0f;
                if ((motionEvent.getAction() != 2 || (Math.abs(this.H - motionEvent.getX()) <= scaledTouchSlop && Math.abs(this.I - motionEvent.getY()) <= scaledTouchSlop)) && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return true;
                }
                if (motionEvent.getAction() == 1 && this.J && ((uj0Var.f33060h0 == null || uj0Var.f33062j0 > 0.8f) && uj0Var.f33049c0 != null)) {
                    uj0Var.f33066n0 = true;
                    if (System.currentTimeMillis() - uj0Var.f33067o0 > 300) {
                        uj0Var.f33067o0 = System.currentTimeMillis();
                        tj0 tj0Var2 = uj0Var.f33049c0;
                        hg.r0 r0Var = this.f32477e;
                        if (uj0Var.f33062j0 > 0.8f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        tj0Var2.d(this, r0Var, z10, false);
                    }
                }
                if (!uj0Var.f33066n0 && uj0Var.f33060h0 != null) {
                    uj0Var.f33063k0 = 0.0f;
                    float f10 = uj0Var.f33062j0;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    uj0Var.M = ofFloat;
                    ofFloat.addUpdateListener(new ij0(uj0Var, f10));
                    uj0Var.M.addListener(new kh.l5(uj0Var, 2));
                    uj0Var.M.setDuration(150L);
                    uj0Var.M.setInterpolator(gr.f28844f);
                    uj0Var.M.start();
                }
                AndroidUtilities.cancelRunOnUIThread(pj0Var);
                this.J = false;
                return true;
            }
        }
        return false;
    }
}
