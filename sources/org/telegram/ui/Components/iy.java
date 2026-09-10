package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class iy extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final rz E;
    public final kj0 f24158a;
    public final org.telegram.ui.ActionBar.l5 f24159b;
    public final TextView f24160c;
    public final FrameLayout d;
    public final TextView e;
    public final TextView f24161f;
    public final qg.s0 h;
    public TLRPC.TL_inputStickerSetID f24162n;
    public TLRPC.TL_inputStickerSetID f24163r;
    public dy f24164s;
    public boolean v;
    public Paint f24165w;
    public int f24166x;
    public AnimatorSet f24167y;

    public iy(rz rzVar, Context context) {
        super(context);
        this.E = rzVar;
        ?? imageView = new ImageView(context);
        this.f24158a = imageView;
        imageView.f(R.raw.unlock_icon, 24, 24, null);
        int i10 = org.telegram.ui.ActionBar.j6.Te;
        imageView.setColorFilter(rzVar.z(i10));
        addView((View) imageView, w7.a6.i(20.0f, 20.0f, 8388611, 10.0f, 15.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.f24159b = l5Var;
        l5Var.setTextSize(15);
        l5Var.setTextColor(rzVar.z(i10));
        l5Var.setTypeface(AndroidUtilities.bold());
        l5Var.setOnClickListener(new gy(this, 0));
        TextView textView = new TextView(context);
        this.f24160c = textView;
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(rzVar.z(i10));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(8.0f), org.telegram.ui.ActionBar.j6.l1(0.12f, rzVar.z(org.telegram.ui.ActionBar.j6.Me))));
        textView.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.5f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.5f));
        textView.setText(LocaleController.getString(R.string.GroupEmoji));
        l5Var.setEllipsizeByGradient(true);
        addView(l5Var, w7.a6.i(-2.0f, -1.0f, 8388611, 15.0f, 15.0f, 0.0f, 0.0f));
        addView(textView, w7.a6.i(-2.0f, -2.0f, 8388611, 15.0f, 10.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), 0);
        frameLayout.setClipToPadding(false);
        frameLayout.setOnClickListener(new gy(this, 1));
        addView(frameLayout, w7.a6.h(-2.0f, -1.0f, 8388725));
        TextView textView2 = new TextView(context);
        this.e = textView2;
        com.google.android.gms.internal.vision.e2.k(14.0f, 1, textView2);
        textView2.setText(LocaleController.getString(R.string.Add));
        textView2.setTextColor(rzVar.z(org.telegram.ui.ActionBar.j6.Sh));
        int i11 = org.telegram.ui.ActionBar.j6.Oh;
        textView2.setBackground(org.telegram.ui.ActionBar.z5.d(new float[]{16.0f}, rzVar.z(i11), rzVar.z(org.telegram.ui.ActionBar.j6.Qh)));
        textView2.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        textView2.setGravity(17);
        textView2.setOnClickListener(new gy(this, 2));
        frameLayout.addView(textView2, w7.a6.h(-2.0f, 26.0f, 8388661));
        TextView textView3 = new TextView(context);
        this.f24161f = textView3;
        com.google.android.gms.internal.vision.e2.k(14.0f, 1, textView3);
        textView3.setText(LocaleController.getString(R.string.StickersRemove));
        textView3.setTextColor(rzVar.z(org.telegram.ui.ActionBar.j6.Rh));
        textView3.setBackground(org.telegram.ui.ActionBar.z5.d(new float[]{16.0f}, 0, rzVar.z(i11) & 452984831));
        textView3.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        textView3.setGravity(17);
        textView3.setTranslationX(AndroidUtilities.dp(4.0f));
        textView3.setOnClickListener(new gy(this, 3));
        frameLayout.addView(textView3, w7.a6.h(-2.0f, 26.0f, 8388661));
        qg.s0 s0Var = new qg.s0(AndroidUtilities.dp(16.0f), context, rzVar.Z1, false);
        this.h = s0Var;
        s0Var.setIcon(R.raw.unlock_icon);
        s0Var.a(LocaleController.getString(R.string.Unlock), new gy(this, 4), false);
        try {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) s0Var.getIconView().getLayoutParams();
            marginLayoutParams.leftMargin = AndroidUtilities.dp(1.0f);
            marginLayoutParams.topMargin = AndroidUtilities.dp(1.0f);
            int dp = AndroidUtilities.dp(20.0f);
            marginLayoutParams.height = dp;
            marginLayoutParams.width = dp;
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) s0Var.getTextView().getLayoutParams();
            marginLayoutParams2.leftMargin = AndroidUtilities.dp(5.0f);
            marginLayoutParams2.topMargin = AndroidUtilities.dp(-0.5f);
            s0Var.getChildAt(0).setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        } catch (Exception unused) {
        }
        this.d.addView(this.h, w7.a6.h(-2.0f, 26.0f, 8388661));
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
        dy dyVar = this.f24164s;
        if (dyVar == null) {
            return;
        }
        boolean z17 = dyVar.f22501f;
        rz rzVar = this.E;
        if (!z17 && !rzVar.f26844p1.contains(Long.valueOf(dyVar.f22499b.f17222id))) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!this.f24164s.e && !UserConfig.getInstance(rzVar.f26805c1).isPremium() && !rzVar.U0) {
            i10 = 1;
        } else if (this.f24164s.f22502g) {
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
        if (this.f24166x == 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z12 != z13) {
            requestLayout();
        }
        this.f24166x = i10;
        AnimatorSet animatorSet = this.f24167y;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f24167y = null;
        }
        if (i10 == 1) {
            z14 = true;
        } else {
            z14 = false;
        }
        qg.s0 s0Var = this.h;
        s0Var.setEnabled(z14);
        if (i10 == 2) {
            z15 = true;
        } else {
            z15 = false;
        }
        TextView textView = this.e;
        textView.setEnabled(z15);
        if (i10 == 3) {
            z16 = true;
        } else {
            z16 = false;
        }
        TextView textView2 = this.f24161f;
        textView2.setEnabled(z16);
        org.telegram.ui.ActionBar.l5 l5Var = this.f24159b;
        kj0 kj0Var = this.f24158a;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f24167y = animatorSet2;
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
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(kj0Var, property, fArr);
            if (i10 == 1) {
                f22 = 1.0f;
            } else {
                f22 = 0.0f;
            }
            float[] fArr2 = new float[1];
            fArr2[c10] = f22;
            Property property2 = FrameLayout.ALPHA;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(kj0Var, property2, fArr2);
            if (i10 == 1) {
                f23 = AndroidUtilities.dp(16.0f);
            } else {
                f23 = 0.0f;
            }
            float[] fArr3 = new float[1];
            fArr3[c10] = f23;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(l5Var, property, fArr3);
            if (i10 == 1) {
                f24 = 1.0f;
            } else {
                f24 = 0.0f;
            }
            float[] fArr4 = new float[1];
            fArr4[c10] = f24;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(s0Var, property2, fArr4);
            if (i10 == 1) {
                f25 = 1.0f;
            } else {
                f25 = 0.6f;
            }
            float[] fArr5 = new float[1];
            fArr5[c10] = f25;
            Property property3 = FrameLayout.SCALE_X;
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(s0Var, property3, fArr5);
            if (i10 == 1) {
                f26 = 1.0f;
            } else {
                f26 = 0.6f;
            }
            float[] fArr6 = new float[1];
            fArr6[c10] = f26;
            Property property4 = FrameLayout.SCALE_Y;
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(s0Var, property4, fArr6);
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
            this.f24167y.addListener(new di.y2(this, i10, 7));
            this.f24167y.setDuration(250L);
            this.f24167y.setInterpolator(new OvershootInterpolator(1.02f));
            this.f24167y.start();
            return;
        }
        if (i10 == 1) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        kj0Var.setAlpha(f7);
        if (i10 == 1) {
            f10 = 0.0f;
        } else {
            f10 = -AndroidUtilities.dp(16.0f);
        }
        kj0Var.setTranslationX(f10);
        if (i10 == 1) {
            f11 = AndroidUtilities.dp(16.0f);
        } else {
            f11 = 0.0f;
        }
        l5Var.setTranslationX(f11);
        if (i10 == 1) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        s0Var.setAlpha(f12);
        if (i10 == 1) {
            f13 = 1.0f;
        } else {
            f13 = 0.6f;
        }
        s0Var.setScaleX(f13);
        if (i10 == 1) {
            f14 = 1.0f;
        } else {
            f14 = 0.6f;
        }
        s0Var.setScaleY(f14);
        if (i10 == 1) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        s0Var.setVisibility(i11);
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
        rz rzVar = this.E;
        int i12 = rzVar.f26805c1;
        if (i10 == NotificationCenter.groupStickersDidLoad) {
            if (this.f24162n != null && (stickerSetById2 = MediaDataController.getInstance(i12).getStickerSetById(this.f24162n.f17215id)) != null && stickerSetById2.set != null) {
                org.telegram.ui.ActionBar.p2 p2Var = rzVar.Y1;
                if (p2Var == null) {
                    p2Var = new bi.o1(this, 4);
                }
                wv.W(p2Var, stickerSetById2, true, null, new dq(this, 14));
                this.f24162n = null;
            }
            if (this.f24163r != null && (stickerSetById = MediaDataController.getInstance(i12).getStickerSetById(this.f24163r.f17215id)) != null && stickerSetById.set != null) {
                org.telegram.ui.ActionBar.p2 p2Var2 = rzVar.Y1;
                if (p2Var2 == null) {
                    p2Var2 = new bi.o1(this, 4);
                }
                org.telegram.ui.ActionBar.p2 p2Var3 = p2Var2;
                hy hyVar = new hy(0, this, stickerSetById);
                Pattern pattern = wv.V;
                if (p2Var3.getFragmentView() != null) {
                    MediaDataController.getInstance(p2Var3.getCurrentAccount()).toggleStickerSet(p2Var3.getFragmentView().getContext(), stickerSetById, 0, p2Var3, true, true, hyVar, false);
                }
                this.f24163r = null;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.E.f26805c1).removeObserver(this, NotificationCenter.groupStickersDidLoad);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.v) {
            if (this.f24165w == null) {
                Paint paint = new Paint(1);
                this.f24165w = paint;
                paint.setStrokeWidth(1.0f);
                this.f24165w.setColor(this.E.z(org.telegram.ui.ActionBar.j6.f17929d7));
            }
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, this.f24165w);
        } else {
            canvas2 = canvas;
        }
        super.onDraw(canvas2);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(11.0f) + this.d.getWidth();
        TextView textView = this.f24160c;
        if (textView.getVisibility() == 0) {
            i14 = textView.getMeasuredWidth();
        } else {
            i14 = 0;
        }
        int i15 = dp + i14;
        org.telegram.ui.ActionBar.l5 l5Var = this.f24159b;
        l5Var.setRightPadding(i15);
        if (textView.getVisibility() == 0) {
            textView.setTranslationX(AndroidUtilities.dp(4.0f) + l5Var.getTextWidth());
            float dp2 = AndroidUtilities.dp(4.0f) + (l5Var.getMaxTextWidth() - i15);
            if (textView.getTranslationX() > dp2) {
                textView.setTranslationX(dp2);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        float f10;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f24159b.getLayoutParams();
        if (this.f24166x == 0) {
            f7 = 10.0f;
        } else {
            f7 = 15.0f;
        }
        marginLayoutParams.topMargin = AndroidUtilities.dp(f7);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.f24166x == 0) {
            f10 = 32.0f;
        } else {
            f10 = 42.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10), 1073741824));
    }
}
