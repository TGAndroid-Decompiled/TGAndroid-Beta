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
    public boolean E;
    public yh.j8 F;
    public final ak0 G;
    public boolean H;
    public float I;
    public ValueAnimator J;
    public final ak0 K;
    public float L;
    public float M;
    public boolean N;
    public boolean O;
    public final fk0 P;
    public final ck0 f23344a;
    public final ck0 f23345b;
    public final ck0 f23346c;
    public final ImageReceiver d;
    public zg.p0 e;
    public rg.b1 f23347f;
    public float h;
    public boolean f23348n;
    public boolean f23349r;
    public boolean f23350s;
    public boolean v;
    public boolean f23351w;
    public boolean f23352x;
    public int f23353y;

    public dk0(fk0 fk0Var, Context context) {
        super(context);
        this.P = fk0Var;
        this.d = new ImageReceiver();
        this.h = 1.0f;
        this.f23352x = true;
        this.G = new ak0(this, 0);
        this.I = 1.0f;
        this.K = new ak0(this, 1);
        this.O = true;
        ck0 ck0Var = new ck0(this, context, 0);
        this.f23344a = ck0Var;
        ck0 ck0Var2 = new ck0(this, context, 1);
        this.f23345b = ck0Var2;
        ck0Var.getImageReceiver().setAutoRepeat(0);
        ck0Var.getImageReceiver().setAllowStartLottieAnimation(false);
        ck0 ck0Var3 = new ck0(this, context, 2);
        this.f23346c = ck0Var3;
        addView(ck0Var, w7.x5.e(34, 34, 17));
        addView(ck0Var3, w7.x5.e(34, 34, 17));
        addView(ck0Var2, w7.x5.e(34, 34, 17));
        if (fk0Var.M0 == 4) {
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setDuration(100L);
            layoutTransition.enableTransitionType(4);
            setLayoutTransition(layoutTransition);
        }
        ck0Var.setLayerNum(Integer.MAX_VALUE);
        ck0Var2.setLayerNum(Integer.MAX_VALUE);
        ck0Var2.f28311a.setAutoRepeat(0);
        ck0Var2.f28311a.setAllowStartAnimation(false);
        ck0Var2.f28311a.setAllowStartLottieAnimation(false);
        ck0Var3.setLayerNum(Integer.MAX_VALUE);
    }

    public static void a(dk0 dk0Var, zg.p0 p0Var, int i10) {
        boolean z10;
        boolean z11;
        int i11;
        ck0 ck0Var = dk0Var.f23346c;
        ck0 ck0Var2 = dk0Var.f23344a;
        ck0 ck0Var3 = dk0Var.f23345b;
        fk0 fk0Var = dk0Var.P;
        dk0Var.f(p0Var, false);
        zg.p0 p0Var2 = dk0Var.e;
        if (p0Var2 != null && p0Var2.equals(p0Var)) {
            dk0Var.f23353y = i10;
            dk0Var.e(p0Var);
            return;
        }
        int i12 = fk0Var.J;
        org.telegram.ui.ActionBar.e6 e6Var = fk0Var.f23989k0;
        int i13 = fk0Var.M0;
        boolean isPremium = UserConfig.getInstance(i12).isPremium();
        if ((i13 == 3 && !isPremium) || (i13 == 5 && p0Var.d && !isPremium)) {
            z10 = true;
        } else {
            z10 = false;
        }
        dk0Var.H = z10;
        if (z10 && dk0Var.f23347f == null) {
            rg.b1 b1Var = new rg.b1(dk0Var.getContext(), 1, null);
            dk0Var.f23347f = b1Var;
            b1Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            dk0Var.f23347f.setImageReceiver(ck0Var3.getImageReceiver());
            dk0Var.addView(dk0Var.f23347f, w7.x5.d(18, 18.0f, 17, 8.0f, 8.0f, 0.0f, 0.0f));
        }
        rg.b1 b1Var2 = dk0Var.f23347f;
        if (b1Var2 != null) {
            if (dk0Var.H) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            b1Var2.setVisibility(i11);
        }
        dk0Var.d();
        dk0Var.e = p0Var;
        if (!p0Var.f49117a && (p0Var.f49120f == null || ((!fk0Var.q() && !fk0Var.G0) || !LiteMode.isEnabled(8200)))) {
            z11 = false;
        } else {
            z11 = true;
        }
        dk0Var.f23349r = z11;
        if (i13 == 4 || dk0Var.e.f49118b) {
            dk0Var.f23349r = false;
        }
        zg.p0 p0Var3 = dk0Var.e;
        if (!p0Var3.f49117a && p0Var3.f49120f == null) {
            ck0Var.getImageReceiver().clearImage();
            ck0Var3.getImageReceiver().clearImage();
            o5 o5Var = new o5(4, fk0Var.J, dk0Var.e.f49121g);
            o5 o5Var2 = new o5(3, fk0Var.J, dk0Var.e.f49121g);
            if (i13 != 1 && i13 != 2 && i13 != 4) {
                int i14 = org.telegram.ui.ActionBar.i6.f19163v6;
                int v02 = org.telegram.ui.ActionBar.i6.v0(i14, e6Var);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                o5Var.setColorFilter(new PorterDuffColorFilter(v02, mode));
                o5Var2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(i14, e6Var), mode));
            } else {
                PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
                o5Var.setColorFilter(new PorterDuffColorFilter(-1, mode2));
                o5Var2.setColorFilter(new PorterDuffColorFilter(-1, mode2));
            }
            ck0Var.setAnimatedEmojiDrawable(o5Var);
            ck0Var3.setAnimatedEmojiDrawable(o5Var2);
            rg.b1 b1Var3 = dk0Var.f23347f;
            if (b1Var3 != null) {
                b1Var3.setAnimatedEmojiDrawable(o5Var2);
            }
        } else {
            dk0Var.e(p0Var);
            ck0Var.setAnimatedEmojiDrawable(null);
            if (ck0Var2.getImageReceiver().getLottieAnimation() != null) {
                ck0Var2.getImageReceiver().getLottieAnimation().N(0, false, false);
            }
            rg.b1 b1Var4 = dk0Var.f23347f;
            if (b1Var4 != null) {
                b1Var4.setAnimatedEmojiDrawable(null);
            }
        }
        dk0Var.setFocusable(true);
        boolean z12 = dk0Var.f23349r;
        dk0Var.f23350s = z12;
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
        ck0 ck0Var = this.f23345b;
        o5 o5Var = ck0Var.e;
        if (o5Var != null) {
            imageReceiver = o5Var.f26689k;
        } else {
            imageReceiver = ck0Var.f28311a;
        }
        if (imageReceiver != null && imageReceiver.getLottieAnimation() != null) {
            fk0 fk0Var = this.P;
            if (fk0Var.f24006x0 == null && !this.N && fk0Var.G0) {
                if (imageReceiver.getLottieAnimation().f29943a0 <= 2) {
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
        if (!this.P.f23987j0) {
            d();
            this.f23348n = true;
            if (!this.f23349r) {
                this.f23345b.setVisibility(0);
                ck0 ck0Var = this.f23345b;
                float f12 = this.I;
                if (this.f23351w) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                ck0Var.setScaleY(f12 * f10);
                ck0 ck0Var2 = this.f23345b;
                float f13 = this.I;
                if (!this.f23351w) {
                    f11 = 1.0f;
                }
                ck0Var2.setScaleX(f13 * f11);
                return;
            }
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.G);
        if (this.f23349r) {
            if (this.f23344a.getImageReceiver().getLottieAnimation() != null && !this.f23344a.getImageReceiver().getLottieAnimation().y() && !this.f23348n) {
                this.f23348n = true;
                if (i10 == 0) {
                    this.E = false;
                    this.f23344a.getImageReceiver().getLottieAnimation().stop();
                    this.f23344a.getImageReceiver().getLottieAnimation().N(0, false, false);
                    this.G.run();
                    return;
                }
                this.E = true;
                this.f23344a.getImageReceiver().getLottieAnimation().stop();
                this.f23344a.getImageReceiver().getLottieAnimation().N(0, false, false);
                AndroidUtilities.runOnUIThread(this.G, i10);
                return;
            }
            if (this.f23344a.getImageReceiver().getLottieAnimation() != null && this.f23348n && !this.f23344a.getImageReceiver().getLottieAnimation().f29956k0 && !this.f23344a.getImageReceiver().getLottieAnimation().y()) {
                this.f23344a.getImageReceiver().getLottieAnimation().N(this.f23344a.getImageReceiver().getLottieAnimation().e[0] - 1, false, false);
            }
            ck0 ck0Var3 = this.f23345b;
            float f14 = this.I;
            if (this.f23351w) {
                f7 = 0.76f;
            } else {
                f7 = 1.0f;
            }
            ck0Var3.setScaleY(f14 * f7);
            ck0 ck0Var4 = this.f23345b;
            float f15 = this.I;
            if (!this.f23351w) {
                f11 = 1.0f;
            }
            ck0Var4.setScaleX(f15 * f11);
        } else if (!this.f23348n) {
            this.I = 0.0f;
            this.f23345b.setScaleX(0.0f);
            this.f23345b.setScaleY(0.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.J = ofFloat;
            ofFloat.addUpdateListener(new h70(this, 9));
            this.J.setDuration(150L);
            this.J.setInterpolator(qr.h);
            this.J.setStartDelay(i10 * this.P.f23971c);
            this.J.start();
            this.f23348n = true;
        }
    }

    public final void d() {
        float f7;
        float f10;
        boolean z10 = this.f23349r;
        fk0 fk0Var = this.P;
        float f11 = 1.0f;
        ck0 ck0Var = this.f23345b;
        if (z10) {
            AndroidUtilities.cancelRunOnUIThread(this.G);
            ck0 ck0Var2 = this.f23344a;
            if (ck0Var2.getImageReceiver().getLottieAnimation() != null && !ck0Var2.getImageReceiver().getLottieAnimation().y()) {
                ck0Var2.getImageReceiver().getLottieAnimation().stop();
                if (fk0Var.f23987j0) {
                    ck0Var2.getImageReceiver().getLottieAnimation().N(0, false, true);
                } else {
                    ck0Var2.getImageReceiver().getLottieAnimation().N(ck0Var2.getImageReceiver().getLottieAnimation().e[0] - 1, false, true);
                }
            }
            ck0Var.setVisibility(4);
            ck0Var2.setVisibility(0);
            this.v = false;
            float f12 = this.I;
            if (this.f23351w) {
                f10 = 0.76f;
            } else {
                f10 = 1.0f;
            }
            ck0Var.setScaleY(f12 * f10);
            float f13 = this.I;
            if (this.f23351w) {
                f11 = 0.76f;
            }
            ck0Var.setScaleX(f13 * f11);
        } else {
            ck0Var.animate().cancel();
            if (fk0Var.N0) {
                float f14 = this.I;
                if (this.f23351w) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                ck0Var.setScaleY(f14 * f7);
                float f15 = this.I;
                if (this.f23351w) {
                    f11 = 0.76f;
                }
                ck0Var.setScaleX(f15 * f11);
            } else {
                ck0Var.setScaleY(0.0f);
                ck0Var.setScaleX(0.0f);
            }
        }
        this.f23348n = false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        int i10;
        ai.l4 l4Var;
        Paint paint;
        if (this.f23351w && this.f23352x) {
            float measuredWidth = getMeasuredWidth() >> 1;
            float measuredHeight = getMeasuredHeight() >> 1;
            float measuredWidth2 = (getMeasuredWidth() >> 1) - AndroidUtilities.dp(1.0f);
            zg.p0 p0Var = this.e;
            fk0 fk0Var = this.P;
            if (p0Var != null && p0Var.f49117a) {
                paint = fk0Var.I0;
            } else {
                paint = fk0Var.H0;
            }
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth2, paint);
        }
        o5 o5Var = this.f23345b.e;
        if (o5Var != null && (l4Var = o5Var.f26689k) != null) {
            int i11 = 0;
            if (this.f23353y == 0) {
                l4Var.setRoundRadius(AndroidUtilities.dp(6.0f), 0, 0, AndroidUtilities.dp(6.0f));
            } else {
                if (this.f23351w) {
                    i11 = AndroidUtilities.dp(6.0f);
                }
                l4Var.setRoundRadius(i11);
            }
        }
        zg.p0 p0Var2 = this.e;
        if (p0Var2 != null && p0Var2.f49117a && this.F != null && LiteMode.isEnabled(8200) && LiteMode.isEnabled(131072)) {
            RectF rectF = AndroidUtilities.rectTmp;
            float height = ((int) (getHeight() * 0.7f)) / 2.0f;
            rectF.set((getWidth() / 2.0f) - height, (getHeight() / 2.0f) - height, (getWidth() / 2.0f) + height, (getHeight() / 2.0f) + height);
            xi0 lottieAnimation = this.f23344a.getImageReceiver().getLottieAnimation();
            yh.j8 j8Var = this.F;
            if (lottieAnimation != null && (i10 = lottieAnimation.f29943a0) > 30) {
                f7 = Utilities.clamp01((i10 - 30) / 30.0f);
            } else {
                f7 = 0.0f;
            }
            j8Var.f47290j = (int) (j8Var.f47285b.size() * f7);
            this.F.g(rectF);
            this.F.d();
            this.F.a(canvas, -673522);
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void e(zg.p0 p0Var) {
        TLRPC.TL_availableReaction tL_availableReaction;
        SvgHelper.SvgDrawable svgDrawable;
        SvgHelper.SvgDrawable svgDrawable2;
        SvgHelper.SvgDrawable svgDrawable3;
        SvgHelper.SvgDrawable svgDrawable4;
        int i10;
        fk0 fk0Var = this.P;
        int i11 = fk0Var.M0;
        ck0 ck0Var = this.f23344a;
        ck0 ck0Var2 = this.f23345b;
        if (p0Var != null && p0Var.f49117a) {
            ck0Var.getImageReceiver().setImageBitmap(new xi0(R.raw.star_reaction, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f)));
            ck0Var2.getImageReceiver().setImageBitmap(getContext().getResources().getDrawable(R.drawable.star_reaction));
            if (this.F == null) {
                if (SharedConfig.getDevicePerformanceClass() == 2) {
                    i10 = 45;
                } else {
                    i10 = 18;
                }
                this.F = new yh.j8(1, i10);
            }
        } else if (i11 == 4 && p0Var != null && p0Var.f49120f != null) {
            ck0Var.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(p0Var.f49120f));
            ck0Var2.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(p0Var.f49120f));
        } else {
            zg.p0 p0Var2 = this.e;
            if (p0Var2.f49118b) {
                TLRPC.Document effectDocument = MessagesController.getInstance(fk0Var.J).getEffectDocument(this.e.f49121g);
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(effectDocument, org.telegram.ui.ActionBar.i6.f18998m6, 0.2f);
                ImageReceiver imageReceiver = ck0Var2.getImageReceiver();
                ImageLocation forDocument = ImageLocation.getForDocument(effectDocument);
                if (this.f23349r) {
                    svgDrawable4 = null;
                } else {
                    svgDrawable4 = svgThumb;
                }
                imageReceiver.setImage(forDocument, "60_60_firstframe", null, null, svgDrawable4, 0L, "tgs", this.e, 0);
            } else if (p0Var2.f49120f != null) {
                TLRPC.TL_availableReaction tL_availableReaction2 = MediaDataController.getInstance(fk0Var.J).getReactionsMap().get(this.e.f49120f);
                if (tL_availableReaction2 != null) {
                    SvgHelper.SvgDrawable svgThumb2 = DocumentObject.getSvgThumb(tL_availableReaction2.activate_animation, org.telegram.ui.ActionBar.i6.f18998m6, 0.2f);
                    if (!LiteMode.isEnabled(8200) || i11 == 4) {
                        tL_availableReaction = tL_availableReaction2;
                        if (SharedConfig.getDevicePerformanceClass() > 0 && i11 != 4) {
                            ck0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.appear_animation), "30_30_nolimit", null, null, svgThumb2, 0L, "tgs", p0Var, 0);
                            ImageReceiver imageReceiver2 = ck0Var2.getImageReceiver();
                            ImageLocation forDocument2 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                            if (this.f23349r) {
                                svgDrawable2 = null;
                            } else {
                                svgDrawable2 = svgThumb2;
                            }
                            imageReceiver2.setImage(forDocument2, "60_60_firstframe", null, null, svgDrawable2, 0L, "tgs", this.e, 0);
                        } else {
                            ImageReceiver imageReceiver3 = ck0Var2.getImageReceiver();
                            ImageLocation forDocument3 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                            if (this.f23349r) {
                                svgDrawable = null;
                            } else {
                                svgDrawable = svgThumb2;
                            }
                            imageReceiver3.setImage(forDocument3, "60_60_firstframe", null, null, svgDrawable, 0L, "tgs", this.e, 0);
                        }
                    } else {
                        tL_availableReaction = tL_availableReaction2;
                        ck0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction2.appear_animation), "30_30_nolimit", null, null, svgThumb2, 0L, "tgs", p0Var, 0);
                        ImageReceiver imageReceiver4 = ck0Var2.getImageReceiver();
                        ImageLocation forDocument4 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                        if (this.f23349r) {
                            svgDrawable3 = null;
                        } else {
                            svgDrawable3 = svgThumb2;
                        }
                        imageReceiver4.setImage(forDocument4, "60_60_pcache", null, null, svgDrawable3, 0L, "tgs", this.e, 0);
                    }
                    if (ck0Var.getImageReceiver().getLottieAnimation() != null) {
                        ck0Var.getImageReceiver().getLottieAnimation().N(0, false, true);
                    }
                    this.f23346c.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, svgThumb2, 0L, "tgs", p0Var, 0);
                    ImageReceiver imageReceiver5 = this.d;
                    imageReceiver5.setAllowStartLottieAnimation(false);
                    MediaDataController.getInstance(fk0Var.J).preloadImage(imageReceiver5, ImageLocation.getForDocument(tL_availableReaction.around_animation), zg.l0.a());
                }
                rg.b1 b1Var = this.f23347f;
                if (b1Var != null) {
                    b1Var.setImageReceiver(ck0Var2.getImageReceiver());
                }
            }
        }
    }

    public final void f(zg.p0 p0Var, boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        boolean z11 = this.f23351w;
        boolean contains = this.P.f23974d0.contains(p0Var);
        this.f23351w = contains;
        if (contains != z11) {
            ck0 ck0Var = this.f23344a;
            ck0 ck0Var2 = this.f23345b;
            float f15 = 1.0f;
            if (!z10) {
                float f16 = this.I;
                if (contains) {
                    f12 = 0.76f;
                } else {
                    f12 = 1.0f;
                }
                ck0Var2.setScaleX(f16 * f12);
                float f17 = this.I;
                if (this.f23351w) {
                    f13 = 0.76f;
                } else {
                    f13 = 1.0f;
                }
                ck0Var2.setScaleY(f17 * f13);
                float f18 = this.I;
                if (this.f23351w) {
                    f14 = 0.76f;
                } else {
                    f14 = 1.0f;
                }
                ck0Var.setScaleX(f18 * f14);
                float f19 = this.I;
                if (this.f23351w) {
                    f15 = 0.76f;
                }
                ck0Var.setScaleY(f19 * f15);
            } else {
                ViewPropertyAnimator animate = ck0Var2.animate();
                float f20 = this.I;
                if (this.f23351w) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f20 * f7);
                float f21 = this.I;
                if (this.f23351w) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator duration = scaleX.scaleY(f21 * f10).setDuration(240L);
                qr qrVar = qr.h;
                duration.setInterpolator(qrVar).start();
                ViewPropertyAnimator animate2 = ck0Var.animate();
                float f22 = this.I;
                if (this.f23351w) {
                    f11 = 0.76f;
                } else {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator scaleX2 = animate2.scaleX(f22 * f11);
                float f23 = this.I;
                if (this.f23351w) {
                    f15 = 0.76f;
                }
                scaleX2.scaleY(f23 * f15).setDuration(240L).setInterpolator(qrVar).start();
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
        zg.p0 p0Var = this.e;
        if (p0Var != null) {
            String str = p0Var.f49120f;
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
        if (this.O) {
            fk0 fk0Var = this.P;
            if (fk0Var.Q == null) {
                int action = motionEvent.getAction();
                ak0 ak0Var = this.K;
                if (action == 0) {
                    this.N = true;
                    this.L = motionEvent.getX();
                    this.M = motionEvent.getY();
                    if (this.h == 1.0f && !this.H && (i10 = fk0Var.M0) != 3 && i10 != 4 && i10 != 5 && ((ek0Var = fk0Var.f23981g0) == null || ek0Var.j())) {
                        AndroidUtilities.runOnUIThread(ak0Var, ViewConfiguration.getLongPressTimeout());
                    }
                }
                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 2.0f;
                if ((motionEvent.getAction() != 2 || (Math.abs(this.L - motionEvent.getX()) <= scaledTouchSlop && Math.abs(this.M - motionEvent.getY()) <= scaledTouchSlop)) && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return true;
                }
                if (motionEvent.getAction() == 1 && this.N && ((fk0Var.f23990l0 == null || fk0Var.f23992n0 > 0.8f) && fk0Var.f23981g0 != null)) {
                    fk0Var.f23997r0 = true;
                    if (System.currentTimeMillis() - fk0Var.f23999s0 > 300) {
                        fk0Var.f23999s0 = System.currentTimeMillis();
                        ek0 ek0Var2 = fk0Var.f23981g0;
                        zg.p0 p0Var = this.e;
                        if (fk0Var.f23992n0 > 0.8f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        ek0Var2.h(this, p0Var, z10, false);
                    }
                }
                if (!fk0Var.f23997r0 && fk0Var.f23990l0 != null) {
                    fk0Var.f23993o0 = 0.0f;
                    float f7 = fk0Var.f23992n0;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    fk0Var.Q = ofFloat;
                    ofFloat.addUpdateListener(new tj0(fk0Var, f7));
                    fk0Var.Q.addListener(new ci.v5(fk0Var, 2));
                    fk0Var.Q.setDuration(150L);
                    fk0Var.Q.setInterpolator(qr.f27420f);
                    fk0Var.Q.start();
                }
                AndroidUtilities.cancelRunOnUIThread(ak0Var);
                this.N = false;
                return true;
            }
        }
        return false;
    }
}
