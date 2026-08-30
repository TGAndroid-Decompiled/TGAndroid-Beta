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
public final class zx extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final kz B;
    public final jj0 f31464a;
    public final org.telegram.ui.ActionBar.k5 f31465b;
    public final TextView f31466c;
    public final FrameLayout d;
    public final TextView e;
    public final TextView f31467f;
    public final eg.c1 h;
    public TLRPC.TL_inputStickerSetID f31468n;
    public TLRPC.TL_inputStickerSetID f31469r;
    public vx f31470s;
    public boolean v;
    public Paint f31471w;
    public int f31472x;
    public AnimatorSet f31473y;

    public zx(kz kzVar, Context context) {
        super(context);
        this.B = kzVar;
        ?? imageView = new ImageView(context);
        this.f31464a = imageView;
        imageView.f(R.raw.unlock_icon, 24, 24, null);
        int i10 = org.telegram.ui.ActionBar.j6.Te;
        imageView.setColorFilter(kzVar.A(i10));
        addView((View) imageView, k7.b6.i(20.0f, 20.0f, 8388611, 10.0f, 15.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.f31465b = k5Var;
        k5Var.setTextSize(15);
        k5Var.setTextColor(kzVar.A(i10));
        k5Var.setTypeface(AndroidUtilities.bold());
        k5Var.setOnClickListener(new yx(this, 0));
        TextView textView = new TextView(context);
        this.f31466c = textView;
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(kzVar.A(i10));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(8.0f), org.telegram.ui.ActionBar.j6.l1(0.12f, kzVar.A(org.telegram.ui.ActionBar.j6.Me))));
        textView.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.5f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.5f));
        textView.setText(LocaleController.getString(R.string.GroupEmoji));
        k5Var.setEllipsizeByGradient(true);
        addView(k5Var, k7.b6.i(-2.0f, -1.0f, 8388611, 15.0f, 15.0f, 0.0f, 0.0f));
        addView(textView, k7.b6.i(-2.0f, -2.0f, 8388611, 15.0f, 10.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), 0);
        frameLayout.setClipToPadding(false);
        frameLayout.setOnClickListener(new yx(this, 1));
        addView(frameLayout, k7.b6.h(-2.0f, -1.0f, 8388725));
        TextView textView2 = new TextView(context);
        this.e = textView2;
        org.telegram.ui.yh.p(14.0f, 1, textView2);
        textView2.setText(LocaleController.getString(R.string.Add));
        textView2.setTextColor(kzVar.A(org.telegram.ui.ActionBar.j6.Sh));
        int i11 = org.telegram.ui.ActionBar.j6.Oh;
        textView2.setBackground(org.telegram.ui.ActionBar.z5.d(new float[]{16.0f}, kzVar.A(i11), kzVar.A(org.telegram.ui.ActionBar.j6.Qh)));
        textView2.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        textView2.setGravity(17);
        textView2.setOnClickListener(new yx(this, 2));
        frameLayout.addView(textView2, k7.b6.h(-2.0f, 26.0f, 8388661));
        TextView textView3 = new TextView(context);
        this.f31467f = textView3;
        org.telegram.ui.yh.p(14.0f, 1, textView3);
        textView3.setText(LocaleController.getString(R.string.StickersRemove));
        textView3.setTextColor(kzVar.A(org.telegram.ui.ActionBar.j6.Rh));
        textView3.setBackground(org.telegram.ui.ActionBar.z5.d(new float[]{16.0f}, 0, kzVar.A(i11) & 452984831));
        textView3.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        textView3.setGravity(17);
        textView3.setTranslationX(AndroidUtilities.dp(4.0f));
        textView3.setOnClickListener(new yx(this, 3));
        frameLayout.addView(textView3, k7.b6.h(-2.0f, 26.0f, 8388661));
        eg.c1 c1Var = new eg.c1(AndroidUtilities.dp(16.0f), context, kzVar.W1, false);
        this.h = c1Var;
        c1Var.setIcon(R.raw.unlock_icon);
        c1Var.a(LocaleController.getString(R.string.Unlock), new yx(this, 4), false);
        try {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c1Var.getIconView().getLayoutParams();
            marginLayoutParams.leftMargin = AndroidUtilities.dp(1.0f);
            marginLayoutParams.topMargin = AndroidUtilities.dp(1.0f);
            int dp = AndroidUtilities.dp(20.0f);
            marginLayoutParams.height = dp;
            marginLayoutParams.width = dp;
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) c1Var.getTextView().getLayoutParams();
            marginLayoutParams2.leftMargin = AndroidUtilities.dp(5.0f);
            marginLayoutParams2.topMargin = AndroidUtilities.dp(-0.5f);
            c1Var.getChildAt(0).setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        } catch (Exception unused) {
        }
        this.d.addView(this.h, k7.b6.h(-2.0f, 26.0f, 8388661));
        setWillNotDraw(false);
    }

    public final void a(boolean z4) {
        boolean z10;
        int i10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        int i11;
        float f16;
        float f17;
        float f18;
        int i12;
        float f19;
        float f20;
        float f21;
        int i13;
        char c3;
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
        float f33;
        vx vxVar = this.f31470s;
        if (vxVar == null) {
            return;
        }
        boolean z16 = vxVar.f30102f;
        kz kzVar = this.B;
        if (!z16 && !kzVar.f26447m1.contains(Long.valueOf(vxVar.f30100b.f19211id))) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!this.f31470s.e && !UserConfig.getInstance(kzVar.Z0).isPremium() && !kzVar.R0) {
            i10 = 1;
        } else if (this.f31470s.f30103g) {
            if (z10) {
                i10 = 3;
            } else {
                i10 = 2;
            }
        } else {
            i10 = 0;
        }
        if (i10 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f31472x == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11 != z12) {
            requestLayout();
        }
        this.f31472x = i10;
        AnimatorSet animatorSet = this.f31473y;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f31473y = null;
        }
        if (i10 == 1) {
            z13 = true;
        } else {
            z13 = false;
        }
        eg.c1 c1Var = this.h;
        c1Var.setEnabled(z13);
        if (i10 == 2) {
            z14 = true;
        } else {
            z14 = false;
        }
        TextView textView = this.e;
        textView.setEnabled(z14);
        if (i10 == 3) {
            z15 = true;
        } else {
            z15 = false;
        }
        TextView textView2 = this.f31467f;
        textView2.setEnabled(z15);
        org.telegram.ui.ActionBar.k5 k5Var = this.f31465b;
        jj0 jj0Var = this.f31464a;
        if (z4) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f31473y = animatorSet2;
            if (i10 == 1) {
                f22 = 0.0f;
                c3 = 0;
            } else {
                c3 = 0;
                f22 = -AndroidUtilities.dp(16.0f);
            }
            float[] fArr = new float[1];
            fArr[c3] = f22;
            Property property = FrameLayout.TRANSLATION_X;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(jj0Var, property, fArr);
            if (i10 == 1) {
                f23 = 1.0f;
            } else {
                f23 = 0.0f;
            }
            float[] fArr2 = new float[1];
            fArr2[c3] = f23;
            Property property2 = FrameLayout.ALPHA;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(jj0Var, property2, fArr2);
            if (i10 == 1) {
                f24 = AndroidUtilities.dp(16.0f);
            } else {
                f24 = 0.0f;
            }
            float[] fArr3 = new float[1];
            fArr3[c3] = f24;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(k5Var, property, fArr3);
            if (i10 == 1) {
                f25 = 1.0f;
            } else {
                f25 = 0.0f;
            }
            float[] fArr4 = new float[1];
            fArr4[c3] = f25;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(c1Var, property2, fArr4);
            if (i10 == 1) {
                f26 = 1.0f;
            } else {
                f26 = 0.6f;
            }
            float[] fArr5 = new float[1];
            fArr5[c3] = f26;
            Property property3 = FrameLayout.SCALE_X;
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(c1Var, property3, fArr5);
            if (i10 == 1) {
                f27 = 1.0f;
            } else {
                f27 = 0.6f;
            }
            float[] fArr6 = new float[1];
            fArr6[c3] = f27;
            Property property4 = FrameLayout.SCALE_Y;
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(c1Var, property4, fArr6);
            if (i10 == 2) {
                f28 = 1.0f;
            } else {
                f28 = 0.0f;
            }
            float[] fArr7 = new float[1];
            fArr7[c3] = f28;
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(textView, property2, fArr7);
            if (i10 == 2) {
                f29 = 1.0f;
            } else {
                f29 = 0.6f;
            }
            float[] fArr8 = new float[1];
            fArr8[c3] = f29;
            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(textView, property3, fArr8);
            if (i10 == 2) {
                f30 = 1.0f;
            } else {
                f30 = 0.6f;
            }
            float[] fArr9 = new float[1];
            fArr9[c3] = f30;
            ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(textView, property4, fArr9);
            if (i10 == 3) {
                f31 = 1.0f;
            } else {
                f31 = 0.0f;
            }
            float[] fArr10 = new float[1];
            fArr10[c3] = f31;
            ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(textView2, property2, fArr10);
            if (i10 == 3) {
                f32 = 1.0f;
            } else {
                f32 = 0.6f;
            }
            float[] fArr11 = new float[1];
            fArr11[c3] = f32;
            ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(textView2, property3, fArr11);
            if (i10 == 3) {
                f33 = 1.0f;
            } else {
                f33 = 0.6f;
            }
            float[] fArr12 = new float[1];
            fArr12[c3] = f33;
            ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(textView2, property4, fArr12);
            Animator[] animatorArr = new Animator[12];
            animatorArr[c3] = ofFloat;
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
            this.f31473y.addListener(new org.telegram.ui.Cells.b4(this, i10, 4));
            this.f31473y.setDuration(250L);
            this.f31473y.setInterpolator(new OvershootInterpolator(1.02f));
            this.f31473y.start();
            return;
        }
        if (i10 == 1) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        jj0Var.setAlpha(f10);
        if (i10 == 1) {
            f11 = 0.0f;
        } else {
            f11 = -AndroidUtilities.dp(16.0f);
        }
        jj0Var.setTranslationX(f11);
        if (i10 == 1) {
            f12 = AndroidUtilities.dp(16.0f);
        } else {
            f12 = 0.0f;
        }
        k5Var.setTranslationX(f12);
        if (i10 == 1) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        c1Var.setAlpha(f13);
        if (i10 == 1) {
            f14 = 1.0f;
        } else {
            f14 = 0.6f;
        }
        c1Var.setScaleX(f14);
        if (i10 == 1) {
            f15 = 1.0f;
        } else {
            f15 = 0.6f;
        }
        c1Var.setScaleY(f15);
        if (i10 == 1) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        c1Var.setVisibility(i11);
        if (i10 == 2) {
            f16 = 1.0f;
        } else {
            f16 = 0.0f;
        }
        textView.setAlpha(f16);
        if (i10 == 2) {
            f17 = 1.0f;
        } else {
            f17 = 0.6f;
        }
        textView.setScaleX(f17);
        if (i10 == 2) {
            f18 = 1.0f;
        } else {
            f18 = 0.6f;
        }
        textView.setScaleY(f18);
        if (i10 == 2) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        textView.setVisibility(i12);
        if (i10 == 3) {
            f19 = 1.0f;
        } else {
            f19 = 0.0f;
        }
        textView2.setAlpha(f19);
        if (i10 == 3) {
            f20 = 1.0f;
        } else {
            f20 = 0.6f;
        }
        textView2.setScaleX(f20);
        if (i10 == 3) {
            f21 = 1.0f;
        } else {
            f21 = 0.6f;
        }
        textView2.setScaleY(f21);
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
        kz kzVar = this.B;
        int i12 = kzVar.Z0;
        if (i10 == NotificationCenter.groupStickersDidLoad) {
            if (this.f31468n != null && (stickerSetById2 = MediaDataController.getInstance(i12).getStickerSetById(this.f31468n.f19204id)) != null && stickerSetById2.set != null) {
                org.telegram.ui.ActionBar.p2 p2Var = kzVar.V1;
                if (p2Var == null) {
                    p2Var = new eg.y1(this, 8);
                }
                mv.W(p2Var, stickerSetById2, true, null, new vp(this, 14));
                this.f31468n = null;
            }
            if (this.f31469r != null && (stickerSetById = MediaDataController.getInstance(i12).getStickerSetById(this.f31469r.f19204id)) != null && stickerSetById.set != null) {
                org.telegram.ui.ActionBar.p2 p2Var2 = kzVar.V1;
                if (p2Var2 == null) {
                    p2Var2 = new eg.y1(this, 8);
                }
                org.telegram.ui.ActionBar.p2 p2Var3 = p2Var2;
                il ilVar = new il(15, this, stickerSetById);
                Pattern pattern = mv.S;
                if (p2Var3.getFragmentView() != null) {
                    MediaDataController.getInstance(p2Var3.getCurrentAccount()).toggleStickerSet(p2Var3.getFragmentView().getContext(), stickerSetById, 0, p2Var3, true, true, ilVar, false);
                }
                this.f31469r = null;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.B.Z0).removeObserver(this, NotificationCenter.groupStickersDidLoad);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.v) {
            if (this.f31471w == null) {
                Paint paint = new Paint(1);
                this.f31471w = paint;
                paint.setStrokeWidth(1.0f);
                this.f31471w.setColor(this.B.A(org.telegram.ui.ActionBar.j6.f19907d7));
            }
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, this.f31471w);
        } else {
            canvas2 = canvas;
        }
        super.onDraw(canvas2);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z4, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(11.0f) + this.d.getWidth();
        TextView textView = this.f31466c;
        if (textView.getVisibility() == 0) {
            i14 = textView.getMeasuredWidth();
        } else {
            i14 = 0;
        }
        int i15 = dp + i14;
        org.telegram.ui.ActionBar.k5 k5Var = this.f31465b;
        k5Var.setRightPadding(i15);
        if (textView.getVisibility() == 0) {
            textView.setTranslationX(AndroidUtilities.dp(4.0f) + k5Var.getTextWidth());
            float dp2 = AndroidUtilities.dp(4.0f) + (k5Var.getMaxTextWidth() - i15);
            if (textView.getTranslationX() > dp2) {
                textView.setTranslationX(dp2);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f10;
        float f11;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f31465b.getLayoutParams();
        if (this.f31472x == 0) {
            f10 = 10.0f;
        } else {
            f10 = 15.0f;
        }
        marginLayoutParams.topMargin = AndroidUtilities.dp(f10);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.f31472x == 0) {
            f11 = 32.0f;
        } else {
            f11 = 42.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f11), 1073741824));
    }
}
