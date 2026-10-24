package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class hy extends FrameLayout implements org.telegram.ui.ActionBar.b6, NotificationCenter.NotificationCenterDelegate {
    public int E;
    public AnimatorSet F;
    public final rz G;
    public int f27194a;
    public int f27195b;
    public final ak0 f27196c;
    public final org.telegram.ui.ActionBar.n5 d;
    public final TextView e;
    public final FrameLayout f27197f;
    public final TextView h;
    public final TextView f27198n;
    public final sg.p0 f27199r;
    public TLRPC.TL_inputStickerSetID f27200s;
    public TLRPC.TL_inputStickerSetID v;
    public dy f27201w;
    public boolean f27202x;
    public Paint f27203y;

    public hy(rz rzVar, Context context) {
        super(context);
        this.G = rzVar;
        org.telegram.ui.ActionBar.q6 q6Var = org.telegram.ui.ActionBar.r6.f21817a;
        ?? imageView = new ImageView(context);
        this.f27196c = imageView;
        imageView.f(R.raw.unlock_icon, 24, 24, null);
        int i10 = org.telegram.ui.ActionBar.k6.Te;
        org.telegram.ui.ActionBar.g6 g6Var = rzVar.Z1;
        org.telegram.ui.ActionBar.r6.t(imageView, i10, g6Var, PorterDuff.Mode.SRC_ATOP);
        addView((View) imageView, w7.z5.i(20.0f, 20.0f, 8388611, 10.0f, 15.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.d = n5Var;
        n5Var.setTextSize(15);
        org.telegram.ui.ActionBar.r6.Z(n5Var, i10, g6Var);
        n5Var.setTypeface(AndroidUtilities.bold());
        n5Var.setOnClickListener(new gy(this, 0));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 11.0f);
        org.telegram.ui.ActionBar.r6.W(textView, i10, g6Var);
        textView.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(8.0f);
        int i11 = org.telegram.ui.ActionBar.k6.Me;
        ShapeDrawable c02 = org.telegram.ui.ActionBar.k6.c0(dp, org.telegram.ui.ActionBar.k6.o1(0.12f, rzVar.A(i11)));
        org.telegram.ui.ActionBar.n6 M = org.telegram.ui.ActionBar.r6.M(0.12f, i11);
        textView.setBackground(c02);
        org.telegram.ui.ActionBar.r6.k(textView, c02, M, null, g6Var);
        textView.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.5f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.5f));
        textView.setText(LocaleController.getString(R.string.GroupEmoji));
        n5Var.setEllipsizeByGradient(true);
        addView(n5Var, w7.z5.i(-2.0f, -1.0f, 8388611, 15.0f, 15.0f, 0.0f, 0.0f));
        addView(textView, w7.z5.i(-2.0f, -2.0f, 8388611, 15.0f, 10.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f27197f = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), 0);
        frameLayout.setClipToPadding(false);
        frameLayout.setOnClickListener(new gy(this, 1));
        addView(frameLayout, w7.z5.h(-2.0f, -1.0f, 8388725));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        com.google.android.gms.internal.play_billing.k3.m(14.0f, 1, textView2);
        textView2.setText(LocaleController.getString(R.string.Add));
        org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.Sh, g6Var);
        int i12 = org.telegram.ui.ActionBar.k6.Oh;
        textView2.setBackground(org.telegram.ui.ActionBar.a6.d(new float[]{16.0f}, rzVar.A(i12), rzVar.A(org.telegram.ui.ActionBar.k6.Qh)));
        textView2.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        textView2.setGravity(17);
        textView2.setOnClickListener(new gy(this, 2));
        frameLayout.addView(textView2, w7.z5.h(-2.0f, 26.0f, 8388661));
        TextView textView3 = new TextView(context);
        this.f27198n = textView3;
        com.google.android.gms.internal.play_billing.k3.m(14.0f, 1, textView3);
        textView3.setText(LocaleController.getString(R.string.StickersRemove));
        org.telegram.ui.ActionBar.r6.W(textView3, org.telegram.ui.ActionBar.k6.Rh, g6Var);
        textView3.setBackground(org.telegram.ui.ActionBar.a6.d(new float[]{16.0f}, 0, rzVar.A(i12) & 452984831));
        textView3.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        textView3.setGravity(17);
        textView3.setTranslationX(AndroidUtilities.dp(4.0f));
        textView3.setOnClickListener(new gy(this, 3));
        frameLayout.addView(textView3, w7.z5.h(-2.0f, 26.0f, 8388661));
        sg.p0 p0Var = new sg.p0(AndroidUtilities.dp(16.0f), context, g6Var, false);
        this.f27199r = p0Var;
        p0Var.setIcon(R.raw.unlock_icon);
        p0Var.a(LocaleController.getString(R.string.Unlock), new gy(this, 4), false);
        try {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) p0Var.getIconView().getLayoutParams();
            marginLayoutParams.leftMargin = AndroidUtilities.dp(1.0f);
            marginLayoutParams.topMargin = AndroidUtilities.dp(1.0f);
            int dp2 = AndroidUtilities.dp(20.0f);
            marginLayoutParams.height = dp2;
            marginLayoutParams.width = dp2;
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) p0Var.getTextView().getLayoutParams();
            marginLayoutParams2.leftMargin = AndroidUtilities.dp(5.0f);
            marginLayoutParams2.topMargin = AndroidUtilities.dp(-0.5f);
            p0Var.getChildAt(0).setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        } catch (Exception unused) {
        }
        this.f27197f.addView(this.f27199r, w7.z5.h(-2.0f, 26.0f, 8388661));
        setWillNotDraw(false);
    }

    public final void a(boolean z10) {
        boolean z11;
        int i10;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        int i11;
        float f15;
        float f16;
        float f17;
        int i12;
        float f18;
        float f19;
        float f20;
        int i13;
        char c10;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        float f27;
        float f28;
        float f29;
        float f30;
        float f31;
        float f32;
        dy dyVar = this.f27201w;
        if (dyVar == null) {
            return;
        }
        boolean z17 = dyVar.f25858f;
        rz rzVar = this.G;
        if (!z17 && !rzVar.f30349p1.contains(Long.valueOf(dyVar.f25856b.f20371id))) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!this.f27201w.e && !UserConfig.getInstance(rzVar.f30310c1).isPremium() && !rzVar.U0) {
            i10 = 1;
        } else if (this.f27201w.f25859g) {
            if (z11) {
                i10 = 3;
            } else {
                i10 = 2;
            }
        } else {
            i10 = 0;
        }
        if (i10 == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (this.E == 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z12 != z13) {
            requestLayout();
        }
        this.E = i10;
        AnimatorSet animatorSet = this.F;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.F = null;
        }
        if (i10 == 1) {
            z14 = true;
        } else {
            z14 = false;
        }
        sg.p0 p0Var = this.f27199r;
        p0Var.setEnabled(z14);
        if (i10 == 2) {
            z15 = true;
        } else {
            z15 = false;
        }
        TextView textView = this.h;
        textView.setEnabled(z15);
        if (i10 == 3) {
            z16 = true;
        } else {
            z16 = false;
        }
        TextView textView2 = this.f27198n;
        textView2.setEnabled(z16);
        org.telegram.ui.ActionBar.n5 n5Var = this.d;
        ak0 ak0Var = this.f27196c;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.F = animatorSet2;
            if (i10 == 1) {
                f21 = 0.0f;
                c10 = 0;
            } else {
                c10 = 0;
                f21 = -AndroidUtilities.dp(16.0f);
            }
            float[] fArr = new float[1];
            fArr[c10] = f21;
            Property property = FrameLayout.TRANSLATION_X;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ak0Var, property, fArr);
            if (i10 == 1) {
                f22 = 1.0f;
            } else {
                f22 = 0.0f;
            }
            float[] fArr2 = new float[1];
            fArr2[c10] = f22;
            Property property2 = FrameLayout.ALPHA;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ak0Var, property2, fArr2);
            if (i10 == 1) {
                f23 = AndroidUtilities.dp(16.0f);
            } else {
                f23 = 0.0f;
            }
            float[] fArr3 = new float[1];
            fArr3[c10] = f23;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(n5Var, property, fArr3);
            if (i10 == 1) {
                f24 = 1.0f;
            } else {
                f24 = 0.0f;
            }
            float[] fArr4 = new float[1];
            fArr4[c10] = f24;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(p0Var, property2, fArr4);
            if (i10 == 1) {
                f25 = 1.0f;
            } else {
                f25 = 0.6f;
            }
            float[] fArr5 = new float[1];
            fArr5[c10] = f25;
            Property property3 = FrameLayout.SCALE_X;
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(p0Var, property3, fArr5);
            if (i10 == 1) {
                f26 = 1.0f;
            } else {
                f26 = 0.6f;
            }
            float[] fArr6 = new float[1];
            fArr6[c10] = f26;
            Property property4 = FrameLayout.SCALE_Y;
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(p0Var, property4, fArr6);
            if (i10 == 2) {
                f27 = 1.0f;
            } else {
                f27 = 0.0f;
            }
            float[] fArr7 = new float[1];
            fArr7[c10] = f27;
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(textView, property2, fArr7);
            if (i10 == 2) {
                f28 = 1.0f;
            } else {
                f28 = 0.6f;
            }
            float[] fArr8 = new float[1];
            fArr8[c10] = f28;
            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(textView, property3, fArr8);
            if (i10 == 2) {
                f29 = 1.0f;
            } else {
                f29 = 0.6f;
            }
            float[] fArr9 = new float[1];
            fArr9[c10] = f29;
            ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(textView, property4, fArr9);
            if (i10 == 3) {
                f30 = 1.0f;
            } else {
                f30 = 0.0f;
            }
            float[] fArr10 = new float[1];
            fArr10[c10] = f30;
            ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(textView2, property2, fArr10);
            if (i10 == 3) {
                f31 = 1.0f;
            } else {
                f31 = 0.6f;
            }
            float[] fArr11 = new float[1];
            fArr11[c10] = f31;
            ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(textView2, property3, fArr11);
            if (i10 == 3) {
                f32 = 1.0f;
            } else {
                f32 = 0.6f;
            }
            float[] fArr12 = new float[1];
            fArr12[c10] = f32;
            ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(textView2, property4, fArr12);
            Animator[] animatorArr = new Animator[12];
            animatorArr[c10] = ofFloat;
            animatorArr[1] = ofFloat2;
            animatorArr[2] = ofFloat3;
            animatorArr[3] = ofFloat4;
            animatorArr[4] = ofFloat5;
            animatorArr[5] = ofFloat6;
            animatorArr[6] = ofFloat7;
            animatorArr[7] = ofFloat8;
            animatorArr[8] = ofFloat9;
            animatorArr[9] = ofFloat10;
            animatorArr[10] = ofFloat11;
            animatorArr[11] = ofFloat12;
            animatorSet2.playTogether(animatorArr);
            this.F.addListener(new gi.p2(this, i10, 7));
            this.F.setDuration(250L);
            this.F.setInterpolator(new OvershootInterpolator(1.02f));
            this.F.start();
            return;
        }
        if (i10 == 1) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ak0Var.setAlpha(f7);
        if (i10 == 1) {
            f10 = 0.0f;
        } else {
            f10 = -AndroidUtilities.dp(16.0f);
        }
        ak0Var.setTranslationX(f10);
        if (i10 == 1) {
            f11 = AndroidUtilities.dp(16.0f);
        } else {
            f11 = 0.0f;
        }
        n5Var.setTranslationX(f11);
        if (i10 == 1) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        p0Var.setAlpha(f12);
        if (i10 == 1) {
            f13 = 1.0f;
        } else {
            f13 = 0.6f;
        }
        p0Var.setScaleX(f13);
        if (i10 == 1) {
            f14 = 1.0f;
        } else {
            f14 = 0.6f;
        }
        p0Var.setScaleY(f14);
        if (i10 == 1) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        p0Var.setVisibility(i11);
        if (i10 == 2) {
            f15 = 1.0f;
        } else {
            f15 = 0.0f;
        }
        textView.setAlpha(f15);
        if (i10 == 2) {
            f16 = 1.0f;
        } else {
            f16 = 0.6f;
        }
        textView.setScaleX(f16);
        if (i10 == 2) {
            f17 = 1.0f;
        } else {
            f17 = 0.6f;
        }
        textView.setScaleY(f17);
        if (i10 == 2) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        textView.setVisibility(i12);
        if (i10 == 3) {
            f18 = 1.0f;
        } else {
            f18 = 0.0f;
        }
        textView2.setAlpha(f18);
        if (i10 == 3) {
            f19 = 1.0f;
        } else {
            f19 = 0.6f;
        }
        textView2.setScaleX(f19);
        if (i10 == 3) {
            f20 = 1.0f;
        } else {
            f20 = 0.6f;
        }
        textView2.setScaleY(f20);
        if (i10 == 3) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        textView2.setVisibility(i13);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.TL_messages_stickerSet stickerSetById;
        TLRPC.TL_messages_stickerSet stickerSetById2;
        rz rzVar = this.G;
        int i12 = rzVar.f30310c1;
        if (i10 == NotificationCenter.groupStickersDidLoad) {
            if (this.f27200s != null && (stickerSetById2 = MediaDataController.getInstance(i12).getStickerSetById(this.f27200s.f20364id)) != null && stickerSetById2.set != null) {
                org.telegram.ui.ActionBar.o2 o2Var = rzVar.Y1;
                if (o2Var == null) {
                    o2Var = new ai.a5(this, 7);
                }
                yv.g0(o2Var, stickerSetById2, true, null, new xp(this, 15));
                this.f27200s = null;
            }
            if (this.v != null && (stickerSetById = MediaDataController.getInstance(i12).getStickerSetById(this.v.f20364id)) != null && stickerSetById.set != null) {
                org.telegram.ui.ActionBar.o2 o2Var2 = rzVar.Y1;
                if (o2Var2 == null) {
                    o2Var2 = new ai.a5(this, 7);
                }
                org.telegram.ui.ActionBar.o2 o2Var3 = o2Var2;
                wt wtVar = new wt(4, this, stickerSetById);
                Pattern pattern = yv.V;
                if (o2Var3.getFragmentView() != null) {
                    MediaDataController.getInstance(o2Var3.getCurrentAccount()).toggleStickerSet(o2Var3.getFragmentView().getContext(), stickerSetById, 0, o2Var3, true, true, wtVar, false);
                }
                this.v = null;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.G.f30310c1).removeObserver(this, NotificationCenter.groupStickersDidLoad);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.f27202x) {
            if (this.f27203y == null) {
                Paint paint = new Paint(1);
                this.f27203y = paint;
                paint.setStrokeWidth(1.0f);
                this.f27203y.setColor(this.G.A(org.telegram.ui.ActionBar.k6.f21185d7));
            }
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, this.f27203y);
        } else {
            canvas2 = canvas;
        }
        super.onDraw(canvas2);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(11.0f) + this.f27197f.getWidth();
        TextView textView = this.e;
        if (textView.getVisibility() == 0) {
            i14 = textView.getMeasuredWidth();
        } else {
            i14 = 0;
        }
        int i15 = dp + i14;
        org.telegram.ui.ActionBar.n5 n5Var = this.d;
        n5Var.setRightPadding(i15);
        if (textView.getVisibility() == 0) {
            textView.setTranslationX(AndroidUtilities.dp(4.0f) + n5Var.getTextWidth());
            float dp2 = AndroidUtilities.dp(4.0f) + (n5Var.getMaxTextWidth() - i15);
            if (textView.getTranslationX() > dp2) {
                textView.setTranslationX(dp2);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        float f10;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.d.getLayoutParams();
        if (this.E == 0) {
            f7 = 10.0f;
        } else {
            f7 = 15.0f;
        }
        marginLayoutParams.topMargin = AndroidUtilities.dp(f7);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.E == 0) {
            f10 = 32.0f;
        } else {
            f10 = 42.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10), 1073741824));
    }

    @Override
    public final void updateColors() {
        rz rzVar = this.G;
        try {
            int A = rzVar.A(org.telegram.ui.ActionBar.k6.Oh);
            int A2 = rzVar.A(org.telegram.ui.ActionBar.k6.Qh);
            if (A == this.f27194a) {
                if (A2 != this.f27195b) {
                }
                invalidate();
            }
            this.f27194a = A;
            this.f27195b = A2;
            TextView textView = this.h;
            if (textView != null) {
                org.telegram.ui.ActionBar.k6.E1(textView.getBackground(), A, false);
                org.telegram.ui.ActionBar.k6.E1(textView.getBackground(), A2, true);
                textView.invalidate();
            }
            TextView textView2 = this.f27198n;
            if (textView2 != null) {
                org.telegram.ui.ActionBar.k6.E1(textView2.getBackground(), A & 452984831, true);
                textView2.invalidate();
            }
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
