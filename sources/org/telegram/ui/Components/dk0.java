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
public final class dk0 extends FrameLayout {
    public boolean A;
    public jh.va B;
    public final ak0 C;
    public boolean D;
    public float E;
    public ValueAnimator F;
    public final ak0 G;
    public float H;
    public float I;
    public boolean J;
    public boolean K;
    public final fk0 L;
    public final ck0 f27794a;
    public final ck0 f27795b;
    public final ck0 f27796c;
    public final ImageReceiver d;
    public kg.q0 f27797e;
    public cg.t1 f27798f;
    public float h;
    public boolean f27799n;
    public boolean f27800r;
    public boolean f27801s;
    public boolean v;
    public boolean f27802w;
    public boolean f27803x;
    public int f27804y;

    public dk0(fk0 fk0Var, Context context) {
        super(context);
        this.L = fk0Var;
        this.d = new ImageReceiver();
        this.h = 1.0f;
        this.f27803x = true;
        this.C = new ak0(this, 0);
        this.E = 1.0f;
        this.G = new ak0(this, 1);
        this.K = true;
        ck0 ck0Var = new ck0(this, context, 0);
        this.f27794a = ck0Var;
        ck0 ck0Var2 = new ck0(this, context, 1);
        this.f27795b = ck0Var2;
        ck0Var.getImageReceiver().setAutoRepeat(0);
        ck0Var.getImageReceiver().setAllowStartLottieAnimation(false);
        ck0 ck0Var3 = new ck0(this, context, 2);
        this.f27796c = ck0Var3;
        addView(ck0Var, i7.f6.e(34, 34, 17));
        addView(ck0Var3, i7.f6.e(34, 34, 17));
        addView(ck0Var2, i7.f6.e(34, 34, 17));
        if (fk0Var.I0 == 4) {
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setDuration(100L);
            layoutTransition.enableTransitionType(4);
            setLayoutTransition(layoutTransition);
        }
        ck0Var.setLayerNum(Integer.MAX_VALUE);
        ck0Var2.setLayerNum(Integer.MAX_VALUE);
        ck0Var2.f32903a.setAutoRepeat(0);
        ck0Var2.f32903a.setAllowStartAnimation(false);
        ck0Var2.f32903a.setAllowStartLottieAnimation(false);
        ck0Var3.setLayerNum(Integer.MAX_VALUE);
    }

    public static void a(dk0 dk0Var, kg.q0 q0Var, int i10) {
        boolean z10;
        boolean z11;
        int i11;
        ck0 ck0Var = dk0Var.f27796c;
        ck0 ck0Var2 = dk0Var.f27794a;
        ck0 ck0Var3 = dk0Var.f27795b;
        fk0 fk0Var = dk0Var.L;
        dk0Var.f(q0Var, false);
        kg.q0 q0Var2 = dk0Var.f27797e;
        if (q0Var2 != null && q0Var2.equals(q0Var)) {
            dk0Var.f27804y = i10;
            dk0Var.e(q0Var);
            return;
        }
        int i12 = fk0Var.F;
        org.telegram.ui.ActionBar.c6 c6Var = fk0Var.f28448g0;
        int i13 = fk0Var.I0;
        boolean isPremium = UserConfig.getInstance(i12).isPremium();
        if ((i13 == 3 && !isPremium) || (i13 == 5 && q0Var.d && !isPremium)) {
            z10 = true;
        } else {
            z10 = false;
        }
        dk0Var.D = z10;
        if (z10 && dk0Var.f27798f == null) {
            cg.t1 t1Var = new cg.t1(dk0Var.getContext(), 1, null);
            dk0Var.f27798f = t1Var;
            t1Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            dk0Var.f27798f.setImageReceiver(ck0Var3.getImageReceiver());
            dk0Var.addView(dk0Var.f27798f, i7.f6.d(18, 18.0f, 17, 8.0f, 8.0f, 0.0f, 0.0f));
        }
        cg.t1 t1Var2 = dk0Var.f27798f;
        if (t1Var2 != null) {
            if (dk0Var.D) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            t1Var2.setVisibility(i11);
        }
        dk0Var.d();
        dk0Var.f27797e = q0Var;
        if (!q0Var.f13821a && (q0Var.f13825f == null || ((!fk0Var.q() && !fk0Var.C0) || !LiteMode.isEnabled(8200)))) {
            z11 = false;
        } else {
            z11 = true;
        }
        dk0Var.f27800r = z11;
        if (i13 == 4 || dk0Var.f27797e.f13822b) {
            dk0Var.f27800r = false;
        }
        kg.q0 q0Var3 = dk0Var.f27797e;
        if (!q0Var3.f13821a && q0Var3.f13825f == null) {
            ck0Var.getImageReceiver().clearImage();
            ck0Var3.getImageReceiver().clearImage();
            p5 p5Var = new p5(4, fk0Var.F, dk0Var.f27797e.f13826g);
            p5 p5Var2 = new p5(3, fk0Var.F, dk0Var.f27797e.f13826g);
            if (i13 != 1 && i13 != 2 && i13 != 4) {
                int i14 = org.telegram.ui.ActionBar.g6.f23383v6;
                int v02 = org.telegram.ui.ActionBar.g6.v0(i14, c6Var);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                p5Var.setColorFilter(new PorterDuffColorFilter(v02, mode));
                p5Var2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i14, c6Var), mode));
            } else {
                PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
                p5Var.setColorFilter(new PorterDuffColorFilter(-1, mode2));
                p5Var2.setColorFilter(new PorterDuffColorFilter(-1, mode2));
            }
            ck0Var.setAnimatedEmojiDrawable(p5Var);
            ck0Var3.setAnimatedEmojiDrawable(p5Var2);
            cg.t1 t1Var3 = dk0Var.f27798f;
            if (t1Var3 != null) {
                t1Var3.setAnimatedEmojiDrawable(p5Var2);
            }
        } else {
            dk0Var.e(q0Var);
            ck0Var.setAnimatedEmojiDrawable(null);
            if (ck0Var2.getImageReceiver().getLottieAnimation() != null) {
                ck0Var2.getImageReceiver().getLottieAnimation().L(0, false, false);
            }
            cg.t1 t1Var4 = dk0Var.f27798f;
            if (t1Var4 != null) {
                t1Var4.setAnimatedEmojiDrawable(null);
            }
        }
        dk0Var.setFocusable(true);
        boolean z12 = dk0Var.f27800r;
        dk0Var.f27801s = z12;
        if (!z12) {
            ck0Var2.setVisibility(8);
            ck0Var3.setVisibility(0);
            dk0Var.v = true;
        } else {
            dk0Var.v = false;
            ck0Var2.setVisibility(0);
            ck0Var3.setVisibility(8);
        }
        ViewGroup.LayoutParams layoutParams = ck0Var3.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = ck0Var3.getLayoutParams();
        int dp = AndroidUtilities.dp(34.0f);
        layoutParams2.height = dp;
        layoutParams.width = dp;
        ViewGroup.LayoutParams layoutParams3 = ck0Var2.getLayoutParams();
        ViewGroup.LayoutParams layoutParams4 = ck0Var2.getLayoutParams();
        int dp2 = AndroidUtilities.dp(34.0f);
        layoutParams4.height = dp2;
        layoutParams3.width = dp2;
    }

    public final void b() {
        ImageReceiver imageReceiver;
        ck0 ck0Var = this.f27795b;
        p5 p5Var = ck0Var.f32906e;
        if (p5Var != null) {
            imageReceiver = p5Var.f31593k;
        } else {
            imageReceiver = ck0Var.f32903a;
        }
        if (imageReceiver != null && imageReceiver.getLottieAnimation() != null) {
            fk0 fk0Var = this.L;
            if (fk0Var.f28463t0 == null && !this.J && fk0Var.C0) {
                if (imageReceiver.getLottieAnimation().X <= 2) {
                    imageReceiver.getLottieAnimation().stop();
                    return;
                }
                return;
            }
            imageReceiver.getLottieAnimation().start();
        }
    }

    public final void c(int i10) {
        float f9;
        float f10;
        float f11 = 0.76f;
        if (!this.L.f28446f0) {
            d();
            this.f27799n = true;
            if (!this.f27800r) {
                this.f27795b.setVisibility(0);
                ck0 ck0Var = this.f27795b;
                float f12 = this.E;
                if (this.f27802w) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                ck0Var.setScaleY(f12 * f10);
                ck0 ck0Var2 = this.f27795b;
                float f13 = this.E;
                if (!this.f27802w) {
                    f11 = 1.0f;
                }
                ck0Var2.setScaleX(f13 * f11);
                return;
            }
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.C);
        if (this.f27800r) {
            if (this.f27794a.getImageReceiver().getLottieAnimation() != null && !this.f27794a.getImageReceiver().getLottieAnimation().w() && !this.f27799n) {
                this.f27799n = true;
                if (i10 == 0) {
                    this.A = false;
                    this.f27794a.getImageReceiver().getLottieAnimation().stop();
                    this.f27794a.getImageReceiver().getLottieAnimation().L(0, false, false);
                    this.C.run();
                    return;
                }
                this.A = true;
                this.f27794a.getImageReceiver().getLottieAnimation().stop();
                this.f27794a.getImageReceiver().getLottieAnimation().L(0, false, false);
                AndroidUtilities.runOnUIThread(this.C, i10);
                return;
            }
            if (this.f27794a.getImageReceiver().getLottieAnimation() != null && this.f27799n && !this.f27794a.getImageReceiver().getLottieAnimation().f34742h0 && !this.f27794a.getImageReceiver().getLottieAnimation().w()) {
                this.f27794a.getImageReceiver().getLottieAnimation().L(this.f27794a.getImageReceiver().getLottieAnimation().f34737e[0] - 1, false, false);
            }
            ck0 ck0Var3 = this.f27795b;
            float f14 = this.E;
            if (this.f27802w) {
                f9 = 0.76f;
            } else {
                f9 = 1.0f;
            }
            ck0Var3.setScaleY(f14 * f9);
            ck0 ck0Var4 = this.f27795b;
            float f15 = this.E;
            if (!this.f27802w) {
                f11 = 1.0f;
            }
            ck0Var4.setScaleX(f15 * f11);
        } else if (!this.f27799n) {
            this.E = 0.0f;
            this.f27795b.setScaleX(0.0f);
            this.f27795b.setScaleY(0.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.F = ofFloat;
            ofFloat.addUpdateListener(new d70(this, 9));
            this.F.setDuration(150L);
            this.F.setInterpolator(jr.h);
            this.F.setStartDelay(i10 * this.L.f28437c);
            this.F.start();
            this.f27799n = true;
        }
    }

    public final void d() {
        float f9;
        float f10;
        boolean z10 = this.f27800r;
        fk0 fk0Var = this.L;
        float f11 = 1.0f;
        ck0 ck0Var = this.f27795b;
        if (z10) {
            AndroidUtilities.cancelRunOnUIThread(this.C);
            ck0 ck0Var2 = this.f27794a;
            if (ck0Var2.getImageReceiver().getLottieAnimation() != null && !ck0Var2.getImageReceiver().getLottieAnimation().w()) {
                ck0Var2.getImageReceiver().getLottieAnimation().stop();
                if (fk0Var.f28446f0) {
                    ck0Var2.getImageReceiver().getLottieAnimation().L(0, false, true);
                } else {
                    ck0Var2.getImageReceiver().getLottieAnimation().L(ck0Var2.getImageReceiver().getLottieAnimation().f34737e[0] - 1, false, true);
                }
            }
            ck0Var.setVisibility(4);
            ck0Var2.setVisibility(0);
            this.v = false;
            float f12 = this.E;
            if (this.f27802w) {
                f10 = 0.76f;
            } else {
                f10 = 1.0f;
            }
            ck0Var.setScaleY(f12 * f10);
            float f13 = this.E;
            if (this.f27802w) {
                f11 = 0.76f;
            }
            ck0Var.setScaleX(f13 * f11);
        } else {
            ck0Var.animate().cancel();
            if (fk0Var.J0) {
                float f14 = this.E;
                if (this.f27802w) {
                    f9 = 0.76f;
                } else {
                    f9 = 1.0f;
                }
                ck0Var.setScaleY(f14 * f9);
                float f15 = this.E;
                if (this.f27802w) {
                    f11 = 0.76f;
                }
                ck0Var.setScaleX(f15 * f11);
            } else {
                ck0Var.setScaleY(0.0f);
                ck0Var.setScaleX(0.0f);
            }
        }
        this.f27799n = false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f9;
        int i10;
        lh.x2 x2Var;
        Paint paint;
        if (this.f27802w && this.f27803x) {
            float measuredWidth = getMeasuredWidth() >> 1;
            float measuredHeight = getMeasuredHeight() >> 1;
            float measuredWidth2 = (getMeasuredWidth() >> 1) - AndroidUtilities.dp(1.0f);
            kg.q0 q0Var = this.f27797e;
            fk0 fk0Var = this.L;
            if (q0Var != null && q0Var.f13821a) {
                paint = fk0Var.E0;
            } else {
                paint = fk0Var.D0;
            }
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth2, paint);
        }
        p5 p5Var = this.f27795b.f32906e;
        if (p5Var != null && (x2Var = p5Var.f31593k) != null) {
            int i11 = 0;
            if (this.f27804y == 0) {
                x2Var.setRoundRadius(AndroidUtilities.dp(6.0f), 0, 0, AndroidUtilities.dp(6.0f));
            } else {
                if (this.f27802w) {
                    i11 = AndroidUtilities.dp(6.0f);
                }
                x2Var.setRoundRadius(i11);
            }
        }
        kg.q0 q0Var2 = this.f27797e;
        if (q0Var2 != null && q0Var2.f13821a && this.B != null && LiteMode.isEnabled(8200) && LiteMode.isEnabled(131072)) {
            RectF rectF = AndroidUtilities.rectTmp;
            float height = ((int) (getHeight() * 0.7f)) / 2.0f;
            rectF.set((getWidth() / 2.0f) - height, (getHeight() / 2.0f) - height, (getWidth() / 2.0f) + height, (getHeight() / 2.0f) + height);
            xi0 lottieAnimation = this.f27794a.getImageReceiver().getLottieAnimation();
            jh.va vaVar = this.B;
            if (lottieAnimation != null && (i10 = lottieAnimation.X) > 30) {
                f9 = Utilities.clamp01((i10 - 30) / 30.0f);
            } else {
                f9 = 0.0f;
            }
            vaVar.f12993j = (int) (vaVar.f12987b.size() * f9);
            this.B.g(rectF);
            this.B.d();
            this.B.a(canvas, -673522);
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void e(kg.q0 q0Var) {
        TLRPC.TL_availableReaction tL_availableReaction;
        SvgHelper.SvgDrawable svgDrawable;
        SvgHelper.SvgDrawable svgDrawable2;
        SvgHelper.SvgDrawable svgDrawable3;
        SvgHelper.SvgDrawable svgDrawable4;
        int i10;
        fk0 fk0Var = this.L;
        int i11 = fk0Var.I0;
        ck0 ck0Var = this.f27794a;
        ck0 ck0Var2 = this.f27795b;
        if (q0Var != null && q0Var.f13821a) {
            ck0Var.getImageReceiver().setImageBitmap(new xi0(R.raw.star_reaction, AndroidUtilities.dp(30.0f), "star_reaction", AndroidUtilities.dp(30.0f)));
            ck0Var2.getImageReceiver().setImageBitmap(getContext().getResources().getDrawable(R.drawable.star_reaction));
            if (this.B == null) {
                if (SharedConfig.getDevicePerformanceClass() == 2) {
                    i10 = 45;
                } else {
                    i10 = 18;
                }
                this.B = new jh.va(1, i10);
            }
        } else if (i11 == 4 && q0Var != null && q0Var.f13825f != null) {
            ck0Var.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(q0Var.f13825f));
            ck0Var2.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(q0Var.f13825f));
        } else {
            kg.q0 q0Var2 = this.f27797e;
            if (q0Var2.f13822b) {
                TLRPC.Document effectDocument = MessagesController.getInstance(fk0Var.F).getEffectDocument(this.f27797e.f13826g);
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(effectDocument, org.telegram.ui.ActionBar.g6.f23223m6, 0.2f);
                ImageReceiver imageReceiver = ck0Var2.getImageReceiver();
                ImageLocation forDocument = ImageLocation.getForDocument(effectDocument);
                if (this.f27800r) {
                    svgDrawable4 = null;
                } else {
                    svgDrawable4 = svgThumb;
                }
                imageReceiver.setImage(forDocument, "60_60_firstframe", null, null, svgDrawable4, 0L, "tgs", this.f27797e, 0);
            } else if (q0Var2.f13825f != null) {
                TLRPC.TL_availableReaction tL_availableReaction2 = MediaDataController.getInstance(fk0Var.F).getReactionsMap().get(this.f27797e.f13825f);
                if (tL_availableReaction2 != null) {
                    SvgHelper.SvgDrawable svgThumb2 = DocumentObject.getSvgThumb(tL_availableReaction2.activate_animation, org.telegram.ui.ActionBar.g6.f23223m6, 0.2f);
                    if (!LiteMode.isEnabled(8200) || i11 == 4) {
                        tL_availableReaction = tL_availableReaction2;
                        if (SharedConfig.getDevicePerformanceClass() > 0 && i11 != 4) {
                            ck0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.appear_animation), "30_30_nolimit", null, null, svgThumb2, 0L, "tgs", q0Var, 0);
                            ImageReceiver imageReceiver2 = ck0Var2.getImageReceiver();
                            ImageLocation forDocument2 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                            if (this.f27800r) {
                                svgDrawable2 = null;
                            } else {
                                svgDrawable2 = svgThumb2;
                            }
                            imageReceiver2.setImage(forDocument2, "60_60_firstframe", null, null, svgDrawable2, 0L, "tgs", this.f27797e, 0);
                        } else {
                            ImageReceiver imageReceiver3 = ck0Var2.getImageReceiver();
                            ImageLocation forDocument3 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                            if (this.f27800r) {
                                svgDrawable = null;
                            } else {
                                svgDrawable = svgThumb2;
                            }
                            imageReceiver3.setImage(forDocument3, "60_60_firstframe", null, null, svgDrawable, 0L, "tgs", this.f27797e, 0);
                        }
                    } else {
                        tL_availableReaction = tL_availableReaction2;
                        ck0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction2.appear_animation), "30_30_nolimit", null, null, svgThumb2, 0L, "tgs", q0Var, 0);
                        ImageReceiver imageReceiver4 = ck0Var2.getImageReceiver();
                        ImageLocation forDocument4 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                        if (this.f27800r) {
                            svgDrawable3 = null;
                        } else {
                            svgDrawable3 = svgThumb2;
                        }
                        imageReceiver4.setImage(forDocument4, "60_60_pcache", null, null, svgDrawable3, 0L, "tgs", this.f27797e, 0);
                    }
                    if (ck0Var.getImageReceiver().getLottieAnimation() != null) {
                        ck0Var.getImageReceiver().getLottieAnimation().L(0, false, true);
                    }
                    this.f27796c.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, svgThumb2, 0L, "tgs", q0Var, 0);
                    ImageReceiver imageReceiver5 = this.d;
                    imageReceiver5.setAllowStartLottieAnimation(false);
                    MediaDataController.getInstance(fk0Var.F).preloadImage(imageReceiver5, ImageLocation.getForDocument(tL_availableReaction.around_animation), kg.m0.a());
                }
                cg.t1 t1Var = this.f27798f;
                if (t1Var != null) {
                    t1Var.setImageReceiver(ck0Var2.getImageReceiver());
                }
            }
        }
    }

    public final void f(kg.q0 q0Var, boolean z10) {
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        boolean z11 = this.f27802w;
        boolean contains = this.L.W.contains(q0Var);
        this.f27802w = contains;
        if (contains != z11) {
            ck0 ck0Var = this.f27794a;
            ck0 ck0Var2 = this.f27795b;
            float f15 = 1.0f;
            if (!z10) {
                float f16 = this.E;
                if (contains) {
                    f12 = 0.76f;
                } else {
                    f12 = 1.0f;
                }
                ck0Var2.setScaleX(f16 * f12);
                float f17 = this.E;
                if (this.f27802w) {
                    f13 = 0.76f;
                } else {
                    f13 = 1.0f;
                }
                ck0Var2.setScaleY(f17 * f13);
                float f18 = this.E;
                if (this.f27802w) {
                    f14 = 0.76f;
                } else {
                    f14 = 1.0f;
                }
                ck0Var.setScaleX(f18 * f14);
                float f19 = this.E;
                if (this.f27802w) {
                    f15 = 0.76f;
                }
                ck0Var.setScaleY(f19 * f15);
            } else {
                ViewPropertyAnimator animate = ck0Var2.animate();
                float f20 = this.E;
                if (this.f27802w) {
                    f9 = 0.76f;
                } else {
                    f9 = 1.0f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f20 * f9);
                float f21 = this.E;
                if (this.f27802w) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator duration = scaleX.scaleY(f21 * f10).setDuration(240L);
                jr jrVar = jr.h;
                duration.setInterpolator(jrVar).start();
                ViewPropertyAnimator animate2 = ck0Var.animate();
                float f22 = this.E;
                if (this.f27802w) {
                    f11 = 0.76f;
                } else {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator scaleX2 = animate2.scaleX(f22 * f11);
                float f23 = this.E;
                if (this.f27802w) {
                    f15 = 0.76f;
                }
                scaleX2.scaleY(f23 * f15).setDuration(240L).setInterpolator(jrVar).start();
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
        kg.q0 q0Var = this.f27797e;
        if (q0Var != null) {
            String str = q0Var.f13825f;
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
        ek0 ek0Var;
        if (this.K) {
            fk0 fk0Var = this.L;
            if (fk0Var.M == null) {
                int action = motionEvent.getAction();
                ak0 ak0Var = this.G;
                if (action == 0) {
                    this.J = true;
                    this.H = motionEvent.getX();
                    this.I = motionEvent.getY();
                    if (this.h == 1.0f && !this.D && (i10 = fk0Var.I0) != 3 && i10 != 4 && i10 != 5 && ((ek0Var = fk0Var.f28438c0) == null || ek0Var.j())) {
                        AndroidUtilities.runOnUIThread(ak0Var, ViewConfiguration.getLongPressTimeout());
                    }
                }
                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 2.0f;
                if ((motionEvent.getAction() != 2 || (Math.abs(this.H - motionEvent.getX()) <= scaledTouchSlop && Math.abs(this.I - motionEvent.getY()) <= scaledTouchSlop)) && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return true;
                }
                if (motionEvent.getAction() == 1 && this.J && ((fk0Var.f28449h0 == null || fk0Var.f28451j0 > 0.8f) && fk0Var.f28438c0 != null)) {
                    fk0Var.f28455n0 = true;
                    if (System.currentTimeMillis() - fk0Var.f28456o0 > 300) {
                        fk0Var.f28456o0 = System.currentTimeMillis();
                        ek0 ek0Var2 = fk0Var.f28438c0;
                        kg.q0 q0Var = this.f27797e;
                        if (fk0Var.f28451j0 > 0.8f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        ek0Var2.Q(this, q0Var, z10, false);
                    }
                }
                if (!fk0Var.f28455n0 && fk0Var.f28449h0 != null) {
                    fk0Var.f28452k0 = 0.0f;
                    float f9 = fk0Var.f28451j0;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    fk0Var.M = ofFloat;
                    ofFloat.addUpdateListener(new tj0(fk0Var, f9));
                    fk0Var.M.addListener(new nh.a5(fk0Var, 2));
                    fk0Var.M.setDuration(150L);
                    fk0Var.M.setInterpolator(jr.f29800f);
                    fk0Var.M.start();
                }
                AndroidUtilities.cancelRunOnUIThread(ak0Var);
                this.J = false;
                return true;
            }
        }
        return false;
    }
}
