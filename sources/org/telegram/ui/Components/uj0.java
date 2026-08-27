package org.telegram.ui.Components;

import android.animation.LayoutTransition;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
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

public final class uj0 extends FrameLayout {
    public boolean A;
    public hh.bb B;
    public final rj0 C;
    public boolean D;
    public float E;
    public ValueAnimator F;
    public final rj0 G;
    public float H;
    public float I;
    public boolean J;
    public boolean K;
    public final wj0 L;

    public final tj0 f33099a;

    public final tj0 f33100b;

    public final tj0 f33101c;
    public final ImageReceiver d;

    public ig.q0 f33102e;

    public ag.k2 f33103f;
    public float h;

    public boolean f33104n;

    public boolean f33105r;

    public boolean f33106s;
    public boolean v;

    public boolean f33107w;

    public boolean f33108x;

    public int f33109y;

    public uj0(wj0 wj0Var, Context context) {
        super(context);
        this.L = wj0Var;
        this.d = new ImageReceiver();
        this.h = 1.0f;
        this.f33108x = true;
        this.C = new rj0(this, 0);
        this.E = 1.0f;
        int i10 = 1;
        this.G = new rj0(this, i10);
        this.K = true;
        tj0 tj0Var = new tj0(this, context, 0);
        this.f33099a = tj0Var;
        tj0 tj0Var2 = new tj0(this, context, i10);
        this.f33100b = tj0Var2;
        tj0Var.getImageReceiver().setAutoRepeat(0);
        tj0Var.getImageReceiver().setAllowStartLottieAnimation(false);
        tj0 tj0Var3 = new tj0(this, context, 2);
        this.f33101c = tj0Var3;
        addView(tj0Var, h7.z5.e(34, 34, 17));
        addView(tj0Var3, h7.z5.e(34, 34, 17));
        addView(tj0Var2, h7.z5.e(34, 34, 17));
        if (wj0Var.I0 == 4) {
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setDuration(100L);
            layoutTransition.enableTransitionType(4);
            setLayoutTransition(layoutTransition);
        }
        tj0Var.setLayerNum(Integer.MAX_VALUE);
        tj0Var2.setLayerNum(Integer.MAX_VALUE);
        tj0Var2.f30898a.setAutoRepeat(0);
        tj0Var2.f30898a.setAllowStartAnimation(false);
        tj0Var2.f30898a.setAllowStartLottieAnimation(false);
        tj0Var3.setLayerNum(Integer.MAX_VALUE);
    }

    public static void a(uj0 uj0Var, ig.q0 q0Var, int i10) {
        tj0 tj0Var = uj0Var.f33101c;
        tj0 tj0Var2 = uj0Var.f33099a;
        tj0 tj0Var3 = uj0Var.f33100b;
        wj0 wj0Var = uj0Var.L;
        uj0Var.f(q0Var, false);
        ig.q0 q0Var2 = uj0Var.f33102e;
        if (q0Var2 != null && q0Var2.equals(q0Var)) {
            uj0Var.f33109y = i10;
            uj0Var.e(q0Var);
            return;
        }
        int i11 = wj0Var.F;
        org.telegram.ui.ActionBar.c6 c6Var = wj0Var.f34250g0;
        int i12 = wj0Var.I0;
        boolean zIsPremium = UserConfig.getInstance(i11).isPremium();
        boolean z10 = (i12 == 3 && !zIsPremium) || (i12 == 5 && q0Var.d && !zIsPremium);
        uj0Var.D = z10;
        if (z10 && uj0Var.f33103f == null) {
            ag.k2 k2Var = new ag.k2(uj0Var.getContext(), 1, null);
            uj0Var.f33103f = k2Var;
            k2Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            uj0Var.f33103f.setImageReceiver(tj0Var3.getImageReceiver());
            uj0Var.addView(uj0Var.f33103f, h7.z5.d(18, 18.0f, 17, 8.0f, 8.0f, 0.0f, 0.0f));
        }
        ag.k2 k2Var2 = uj0Var.f33103f;
        if (k2Var2 != null) {
            k2Var2.setVisibility(uj0Var.D ? 0 : 8);
        }
        uj0Var.d();
        uj0Var.f33102e = q0Var;
        uj0Var.f33105r = q0Var.f11408a || (q0Var.f11412f != null && ((wj0Var.q() || wj0Var.C0) && LiteMode.isEnabled(8200)));
        if (i12 == 4 || uj0Var.f33102e.f11409b) {
            uj0Var.f33105r = false;
        }
        ig.q0 q0Var3 = uj0Var.f33102e;
        if (q0Var3.f11408a || q0Var3.f11412f != null) {
            uj0Var.e(q0Var);
            tj0Var.setAnimatedEmojiDrawable(null);
            if (tj0Var2.getImageReceiver().getLottieAnimation() != null) {
                tj0Var2.getImageReceiver().getLottieAnimation().L(0, false, false);
            }
            ag.k2 k2Var3 = uj0Var.f33103f;
            if (k2Var3 != null) {
                k2Var3.setAnimatedEmojiDrawable(null);
            }
        } else {
            tj0Var.getImageReceiver().clearImage();
            tj0Var3.getImageReceiver().clearImage();
            k5 k5Var = new k5(4, wj0Var.F, uj0Var.f33102e.f11413g);
            k5 k5Var2 = new k5(3, wj0Var.F, uj0Var.f33102e.f11413g);
            if (i12 == 1 || i12 == 2 || i12 == 4) {
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                k5Var.setColorFilter(new PorterDuffColorFilter(-1, mode));
                k5Var2.setColorFilter(new PorterDuffColorFilter(-1, mode));
            } else {
                int i13 = org.telegram.ui.ActionBar.g6.f23373v6;
                int iV0 = org.telegram.ui.ActionBar.g6.v0(i13, c6Var);
                PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
                k5Var.setColorFilter(new PorterDuffColorFilter(iV0, mode2));
                k5Var2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i13, c6Var), mode2));
            }
            tj0Var.setAnimatedEmojiDrawable(k5Var);
            tj0Var3.setAnimatedEmojiDrawable(k5Var2);
            ag.k2 k2Var4 = uj0Var.f33103f;
            if (k2Var4 != null) {
                k2Var4.setAnimatedEmojiDrawable(k5Var2);
            }
        }
        uj0Var.setFocusable(true);
        boolean z11 = uj0Var.f33105r;
        uj0Var.f33106s = z11;
        if (z11) {
            uj0Var.v = false;
            tj0Var2.setVisibility(0);
            tj0Var3.setVisibility(8);
        } else {
            tj0Var2.setVisibility(8);
            tj0Var3.setVisibility(0);
            uj0Var.v = true;
        }
        ViewGroup.LayoutParams layoutParams = tj0Var3.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = tj0Var3.getLayoutParams();
        int iDp = AndroidUtilities.dp(34.0f);
        layoutParams2.height = iDp;
        layoutParams.width = iDp;
        ViewGroup.LayoutParams layoutParams3 = tj0Var2.getLayoutParams();
        ViewGroup.LayoutParams layoutParams4 = tj0Var2.getLayoutParams();
        int iDp2 = AndroidUtilities.dp(34.0f);
        layoutParams4.height = iDp2;
        layoutParams3.width = iDp2;
    }

    public final void b() {
        tj0 tj0Var = this.f33100b;
        k5 k5Var = tj0Var.f30901e;
        ImageReceiver imageReceiver = k5Var != null ? k5Var.f29961k : tj0Var.f30898a;
        if (imageReceiver == null || imageReceiver.getLottieAnimation() == null) {
            return;
        }
        wj0 wj0Var = this.L;
        if (wj0Var.f34265t0 != null || this.J || !wj0Var.C0) {
            imageReceiver.getLottieAnimation().start();
        } else if (imageReceiver.getLottieAnimation().X <= 2) {
            imageReceiver.getLottieAnimation().stop();
        }
    }

    public final void c(int i10) {
        if (!this.L.f34248f0) {
            d();
            this.f33104n = true;
            if (this.f33105r) {
                return;
            }
            this.f33100b.setVisibility(0);
            this.f33100b.setScaleY(this.E * (this.f33107w ? 0.76f : 1.0f));
            this.f33100b.setScaleX(this.E * (this.f33107w ? 0.76f : 1.0f));
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.C);
        if (!this.f33105r) {
            if (this.f33104n) {
                return;
            }
            this.E = 0.0f;
            this.f33100b.setScaleX(0.0f);
            this.f33100b.setScaleY(0.0f);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.F = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new v60(this, 9));
            this.F.setDuration(150L);
            this.F.setInterpolator(er.h);
            this.F.setStartDelay((long) (i10 * this.L.f34239c));
            this.F.start();
            this.f33104n = true;
            return;
        }
        if (this.f33099a.getImageReceiver().getLottieAnimation() == null || this.f33099a.getImageReceiver().getLottieAnimation().w() || this.f33104n) {
            if (this.f33099a.getImageReceiver().getLottieAnimation() != null && this.f33104n && !this.f33099a.getImageReceiver().getLottieAnimation().f31317h0 && !this.f33099a.getImageReceiver().getLottieAnimation().w()) {
                this.f33099a.getImageReceiver().getLottieAnimation().L(this.f33099a.getImageReceiver().getLottieAnimation().f31312e[0] - 1, false, false);
            }
            this.f33100b.setScaleY(this.E * (this.f33107w ? 0.76f : 1.0f));
            this.f33100b.setScaleX(this.E * (this.f33107w ? 0.76f : 1.0f));
            return;
        }
        this.f33104n = true;
        if (i10 == 0) {
            this.A = false;
            this.f33099a.getImageReceiver().getLottieAnimation().stop();
            this.f33099a.getImageReceiver().getLottieAnimation().L(0, false, false);
            this.C.run();
            return;
        }
        this.A = true;
        this.f33099a.getImageReceiver().getLottieAnimation().stop();
        this.f33099a.getImageReceiver().getLottieAnimation().L(0, false, false);
        AndroidUtilities.runOnUIThread(this.C, i10);
    }

    public final void d() {
        boolean z10 = this.f33105r;
        wj0 wj0Var = this.L;
        tj0 tj0Var = this.f33100b;
        if (z10) {
            AndroidUtilities.cancelRunOnUIThread(this.C);
            tj0 tj0Var2 = this.f33099a;
            if (tj0Var2.getImageReceiver().getLottieAnimation() != null && !tj0Var2.getImageReceiver().getLottieAnimation().w()) {
                tj0Var2.getImageReceiver().getLottieAnimation().stop();
                if (wj0Var.f34248f0) {
                    tj0Var2.getImageReceiver().getLottieAnimation().L(0, false, true);
                } else {
                    tj0Var2.getImageReceiver().getLottieAnimation().L(tj0Var2.getImageReceiver().getLottieAnimation().f31312e[0] - 1, false, true);
                }
            }
            tj0Var.setVisibility(4);
            tj0Var2.setVisibility(0);
            this.v = false;
            tj0Var.setScaleY(this.E * (this.f33107w ? 0.76f : 1.0f));
            tj0Var.setScaleX(this.E * (this.f33107w ? 0.76f : 1.0f));
        } else {
            tj0Var.animate().cancel();
            if (wj0Var.J0) {
                tj0Var.setScaleY(this.E * (this.f33107w ? 0.76f : 1.0f));
                tj0Var.setScaleX(this.E * (this.f33107w ? 0.76f : 1.0f));
            } else {
                tj0Var.setScaleY(0.0f);
                tj0Var.setScaleX(0.0f);
            }
        }
        this.f33104n = false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        jh.y2 y2Var;
        if (this.f33107w && this.f33108x) {
            float measuredWidth = getMeasuredWidth() >> 1;
            float measuredHeight = getMeasuredHeight() >> 1;
            float measuredWidth2 = (getMeasuredWidth() >> 1) - AndroidUtilities.dp(1.0f);
            ig.q0 q0Var = this.f33102e;
            wj0 wj0Var = this.L;
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth2, (q0Var == null || !q0Var.f11408a) ? wj0Var.D0 : wj0Var.E0);
        }
        k5 k5Var = this.f33100b.f30901e;
        if (k5Var != null && (y2Var = k5Var.f29961k) != null) {
            if (this.f33109y == 0) {
                y2Var.setRoundRadius(AndroidUtilities.dp(6.0f), 0, 0, AndroidUtilities.dp(6.0f));
            } else {
                y2Var.setRoundRadius(this.f33107w ? AndroidUtilities.dp(6.0f) : 0);
            }
        }
        ig.q0 q0Var2 = this.f33102e;
        if (q0Var2 != null && q0Var2.f11408a && this.B != null && LiteMode.isEnabled(8200) && LiteMode.isEnabled(131072)) {
            int height = (int) (getHeight() * 0.7f);
            RectF rectF = AndroidUtilities.rectTmp;
            float f10 = height / 2.0f;
            rectF.set((getWidth() / 2.0f) - f10, (getHeight() / 2.0f) - f10, (getWidth() / 2.0f) + f10, (getHeight() / 2.0f) + f10);
            oi0 lottieAnimation = this.f33099a.getImageReceiver().getLottieAnimation();
            hh.bb bbVar = this.B;
            bbVar.f9039j = (int) (bbVar.f9033b.size() * ((lottieAnimation == null || (i10 = lottieAnimation.X) <= 30) ? 0.0f : Utilities.clamp01((i10 - 30) / 30.0f)));
            this.B.g(rectF);
            this.B.d();
            this.B.a(canvas, -673522);
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void e(ig.q0 q0Var) {
        TLRPC.TL_availableReaction tL_availableReaction;
        wj0 wj0Var = this.L;
        int i10 = wj0Var.I0;
        tj0 tj0Var = this.f33099a;
        tj0 tj0Var2 = this.f33100b;
        if (q0Var != null && q0Var.f11408a) {
            tj0Var.getImageReceiver().setImageBitmap(new oi0(R.raw.star_reaction, AndroidUtilities.dp(30.0f), "star_reaction", AndroidUtilities.dp(30.0f)));
            tj0Var2.getImageReceiver().setImageBitmap(getContext().getResources().getDrawable(R.drawable.star_reaction));
            if (this.B == null) {
                this.B = new hh.bb(1, SharedConfig.getDevicePerformanceClass() == 2 ? 45 : 18);
                return;
            }
            return;
        }
        if (i10 == 4 && q0Var != null && q0Var.f11412f != null) {
            tj0Var.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(q0Var.f11412f));
            tj0Var2.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(q0Var.f11412f));
            return;
        }
        ig.q0 q0Var2 = this.f33102e;
        if (q0Var2.f11409b) {
            TLRPC.Document effectDocument = MessagesController.getInstance(wj0Var.F).getEffectDocument(this.f33102e.f11413g);
            tj0Var2.getImageReceiver().setImage(ImageLocation.getForDocument(effectDocument), "60_60_firstframe", null, null, this.f33105r ? null : DocumentObject.getSvgThumb(effectDocument, org.telegram.ui.ActionBar.g6.f23215m6, 0.2f), 0L, "tgs", this.f33102e, 0);
            return;
        }
        if (q0Var2.f11412f != null) {
            TLRPC.TL_availableReaction tL_availableReaction2 = MediaDataController.getInstance(wj0Var.F).getReactionsMap().get(this.f33102e.f11412f);
            if (tL_availableReaction2 != null) {
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction2.activate_animation, org.telegram.ui.ActionBar.g6.f23215m6, 0.2f);
                if (!LiteMode.isEnabled(8200) || i10 == 4) {
                    tL_availableReaction = tL_availableReaction2;
                    if (SharedConfig.getDevicePerformanceClass() <= 0 || i10 == 4) {
                        tj0Var2.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, this.f33105r ? null : svgThumb, 0L, "tgs", this.f33102e, 0);
                    } else {
                        tj0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.appear_animation), "30_30_nolimit", null, null, svgThumb, 0L, "tgs", q0Var, 0);
                        tj0Var2.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, this.f33105r ? null : svgThumb, 0L, "tgs", this.f33102e, 0);
                    }
                } else {
                    tL_availableReaction = tL_availableReaction2;
                    tj0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction2.appear_animation), "30_30_nolimit", null, null, svgThumb, 0L, "tgs", q0Var, 0);
                    tj0Var2.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, this.f33105r ? null : svgThumb, 0L, "tgs", this.f33102e, 0);
                }
                if (tj0Var.getImageReceiver().getLottieAnimation() != null) {
                    tj0Var.getImageReceiver().getLottieAnimation().L(0, false, true);
                }
                this.f33101c.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, svgThumb, 0L, "tgs", q0Var, 0);
                ImageReceiver imageReceiver = this.d;
                imageReceiver.setAllowStartLottieAnimation(false);
                MediaDataController.getInstance(wj0Var.F).preloadImage(imageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), ig.m0.a());
            }
            ag.k2 k2Var = this.f33103f;
            if (k2Var != null) {
                k2Var.setImageReceiver(tj0Var2.getImageReceiver());
            }
        }
    }

    public final void f(ig.q0 q0Var, boolean z10) {
        boolean z11 = this.f33107w;
        boolean zContains = this.L.W.contains(q0Var);
        this.f33107w = zContains;
        if (zContains != z11) {
            tj0 tj0Var = this.f33099a;
            tj0 tj0Var2 = this.f33100b;
            if (z10) {
                ViewPropertyAnimator duration = tj0Var2.animate().scaleX(this.E * (this.f33107w ? 0.76f : 1.0f)).scaleY(this.E * (this.f33107w ? 0.76f : 1.0f)).setDuration(240L);
                er erVar = er.h;
                duration.setInterpolator(erVar).start();
                tj0Var.animate().scaleX(this.E * (this.f33107w ? 0.76f : 1.0f)).scaleY(this.E * (this.f33107w ? 0.76f : 1.0f)).setDuration(240L).setInterpolator(erVar).start();
            } else {
                tj0Var2.setScaleX(this.E * (zContains ? 0.76f : 1.0f));
                tj0Var2.setScaleY(this.E * (this.f33107w ? 0.76f : 1.0f));
                tj0Var.setScaleX(this.E * (this.f33107w ? 0.76f : 1.0f));
                tj0Var.setScaleY(this.E * (this.f33107w ? 0.76f : 1.0f));
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
        ig.q0 q0Var = this.f33102e;
        if (q0Var != null) {
            String str = q0Var.f11412f;
            if (str != null) {
                accessibilityNodeInfo.setText(str);
                accessibilityNodeInfo.setEnabled(true);
            } else {
                accessibilityNodeInfo.setText(LocaleController.getString(R.string.AccDescrCustomEmoji));
                accessibilityNodeInfo.setEnabled(true);
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        vj0 vj0Var;
        if (this.K) {
            wj0 wj0Var = this.L;
            if (wj0Var.M == null) {
                int action = motionEvent.getAction();
                rj0 rj0Var = this.G;
                if (action == 0) {
                    this.J = true;
                    this.H = motionEvent.getX();
                    this.I = motionEvent.getY();
                    if (this.h == 1.0f && !this.D && (i10 = wj0Var.I0) != 3 && i10 != 4 && i10 != 5 && ((vj0Var = wj0Var.f34240c0) == null || vj0Var.j())) {
                        AndroidUtilities.runOnUIThread(rj0Var, ViewConfiguration.getLongPressTimeout());
                    }
                }
                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 2.0f;
                int i11 = 2;
                if ((motionEvent.getAction() != 2 || (Math.abs(this.H - motionEvent.getX()) <= scaledTouchSlop && Math.abs(this.I - motionEvent.getY()) <= scaledTouchSlop)) && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return true;
                }
                if (motionEvent.getAction() == 1 && this.J && ((wj0Var.f34251h0 == null || wj0Var.f34253j0 > 0.8f) && wj0Var.f34240c0 != null)) {
                    wj0Var.f34257n0 = true;
                    if (System.currentTimeMillis() - wj0Var.f34258o0 > 300) {
                        wj0Var.f34258o0 = System.currentTimeMillis();
                        wj0Var.f34240c0.n(this, this.f33102e, wj0Var.f34253j0 > 0.8f, false);
                    }
                }
                if (!wj0Var.f34257n0 && wj0Var.f34251h0 != null) {
                    wj0Var.f34254k0 = 0.0f;
                    float f10 = wj0Var.f34253j0;
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    wj0Var.M = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(new kj0(wj0Var, f10));
                    wj0Var.M.addListener(new lh.k5(wj0Var, i11));
                    wj0Var.M.setDuration(150L);
                    wj0Var.M.setInterpolator(er.f28122f);
                    wj0Var.M.start();
                }
                AndroidUtilities.cancelRunOnUIThread(rj0Var);
                this.J = false;
                return true;
            }
        }
        return false;
    }
}
