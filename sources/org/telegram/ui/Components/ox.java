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
import android.widget.TextView;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

public final class ox extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final yy A;

    public final ri0 f31423a;

    public final org.telegram.ui.ActionBar.h5 f31424b;

    public final TextView f31425c;
    public final FrameLayout d;

    public final TextView f31426e;

    public final TextView f31427f;
    public final ag.s1 h;

    public TLRPC.TL_inputStickerSetID f31428n;

    public TLRPC.TL_inputStickerSetID f31429r;

    public kx f31430s;
    public boolean v;

    public Paint f31431w;

    public int f31432x;

    public AnimatorSet f31433y;

    public ox(yy yyVar, Context context) {
        super(context);
        this.A = yyVar;
        ri0 ri0Var = new ri0(context);
        this.f31423a = ri0Var;
        ri0Var.f(R.raw.unlock_icon, 24, 24, null);
        int i10 = org.telegram.ui.ActionBar.g6.Te;
        ri0Var.setColorFilter(yyVar.B(i10));
        addView(ri0Var, h7.z5.i(20.0f, 20.0f, 8388611, 10.0f, 15.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f31424b = h5Var;
        h5Var.setTextSize(15);
        h5Var.setTextColor(yyVar.B(i10));
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setOnClickListener(new nx(this, 0));
        TextView textView = new TextView(context);
        this.f31425c = textView;
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(yyVar.B(i10));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(8.0f), org.telegram.ui.ActionBar.g6.l1(0.12f, yyVar.B(org.telegram.ui.ActionBar.g6.Me))));
        textView.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.5f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.5f));
        textView.setText(LocaleController.getString(R.string.GroupEmoji));
        h5Var.setEllipsizeByGradient(true);
        addView(h5Var, h7.z5.i(-2.0f, -1.0f, 8388611, 15.0f, 15.0f, 0.0f, 0.0f));
        addView(textView, h7.z5.i(-2.0f, -2.0f, 8388611, 15.0f, 10.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), 0);
        frameLayout.setClipToPadding(false);
        frameLayout.setOnClickListener(new nx(this, 1));
        addView(frameLayout, h7.z5.h(-2.0f, -1.0f, 8388725));
        TextView textView2 = new TextView(context);
        this.f31426e = textView2;
        org.telegram.ui.Cells.pa.m(14.0f, 1, textView2);
        textView2.setText(LocaleController.getString(R.string.Add));
        textView2.setTextColor(yyVar.B(org.telegram.ui.ActionBar.g6.Sh));
        int i11 = org.telegram.ui.ActionBar.g6.Oh;
        textView2.setBackground(org.telegram.ui.ActionBar.w5.d(new float[]{16.0f}, yyVar.B(i11), yyVar.B(org.telegram.ui.ActionBar.g6.Qh)));
        textView2.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        textView2.setGravity(17);
        textView2.setOnClickListener(new nx(this, 2));
        frameLayout.addView(textView2, h7.z5.h(-2.0f, 26.0f, 8388661));
        TextView textView3 = new TextView(context);
        this.f31427f = textView3;
        org.telegram.ui.Cells.pa.m(14.0f, 1, textView3);
        textView3.setText(LocaleController.getString(R.string.StickersRemove));
        textView3.setTextColor(yyVar.B(org.telegram.ui.ActionBar.g6.Rh));
        textView3.setBackground(org.telegram.ui.ActionBar.w5.d(new float[]{16.0f}, 0, yyVar.B(i11) & 452984831));
        textView3.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        textView3.setGravity(17);
        textView3.setTranslationX(AndroidUtilities.dp(4.0f));
        textView3.setOnClickListener(new nx(this, 3));
        frameLayout.addView(textView3, h7.z5.h(-2.0f, 26.0f, 8388661));
        ag.s1 s1Var = new ag.s1(AndroidUtilities.dp(16.0f), context, yyVar.V1, false);
        this.h = s1Var;
        s1Var.setIcon(R.raw.unlock_icon);
        s1Var.a(LocaleController.getString(R.string.Unlock), new nx(this, 4), false);
        try {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) s1Var.getIconView().getLayoutParams();
            marginLayoutParams.leftMargin = AndroidUtilities.dp(1.0f);
            marginLayoutParams.topMargin = AndroidUtilities.dp(1.0f);
            int iDp = AndroidUtilities.dp(20.0f);
            marginLayoutParams.height = iDp;
            marginLayoutParams.width = iDp;
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) s1Var.getTextView().getLayoutParams();
            marginLayoutParams2.leftMargin = AndroidUtilities.dp(5.0f);
            marginLayoutParams2.topMargin = AndroidUtilities.dp(-0.5f);
            s1Var.getChildAt(0).setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        } catch (Exception unused) {
        }
        this.d.addView(this.h, h7.z5.h(-2.0f, 26.0f, 8388661));
        setWillNotDraw(false);
    }

    public final void a(boolean z10) {
        int i10;
        char c10;
        float f10;
        kx kxVar = this.f31430s;
        if (kxVar == null) {
            return;
        }
        boolean z11 = kxVar.f30208f;
        yy yyVar = this.A;
        boolean z12 = z11 || yyVar.l1.contains(Long.valueOf(kxVar.f30205b.f22407id));
        if (!this.f31430s.f30207e && !UserConfig.getInstance(yyVar.Y0).isPremium() && !yyVar.Q0) {
            i10 = 1;
        } else if (this.f31430s.f30209g) {
            i10 = z12 ? 3 : 2;
        } else {
            i10 = 0;
        }
        if ((i10 == 0) != (this.f31432x == 0)) {
            requestLayout();
        }
        this.f31432x = i10;
        AnimatorSet animatorSet = this.f31433y;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f31433y = null;
        }
        boolean z13 = i10 == 1;
        ag.s1 s1Var = this.h;
        s1Var.setEnabled(z13);
        boolean z14 = i10 == 2;
        TextView textView = this.f31426e;
        textView.setEnabled(z14);
        boolean z15 = i10 == 3;
        TextView textView2 = this.f31427f;
        textView2.setEnabled(z15);
        org.telegram.ui.ActionBar.h5 h5Var = this.f31424b;
        ri0 ri0Var = this.f31423a;
        if (!z10) {
            ri0Var.setAlpha(i10 == 1 ? 1.0f : 0.0f);
            ri0Var.setTranslationX(i10 == 1 ? 0.0f : -AndroidUtilities.dp(16.0f));
            h5Var.setTranslationX(i10 == 1 ? AndroidUtilities.dp(16.0f) : 0.0f);
            s1Var.setAlpha(i10 == 1 ? 1.0f : 0.0f);
            s1Var.setScaleX(i10 == 1 ? 1.0f : 0.6f);
            s1Var.setScaleY(i10 == 1 ? 1.0f : 0.6f);
            s1Var.setVisibility(i10 == 1 ? 0 : 8);
            textView.setAlpha(i10 == 2 ? 1.0f : 0.0f);
            textView.setScaleX(i10 == 2 ? 1.0f : 0.6f);
            textView.setScaleY(i10 == 2 ? 1.0f : 0.6f);
            textView.setVisibility(i10 == 2 ? 0 : 8);
            textView2.setAlpha(i10 == 3 ? 1.0f : 0.0f);
            textView2.setScaleX(i10 == 3 ? 1.0f : 0.6f);
            textView2.setScaleY(i10 == 3 ? 1.0f : 0.6f);
            textView2.setVisibility(i10 == 3 ? 0 : 8);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f31433y = animatorSet2;
        if (i10 == 1) {
            f10 = 0.0f;
            c10 = 0;
        } else {
            c10 = 0;
            f10 = -AndroidUtilities.dp(16.0f);
        }
        float[] fArr = new float[1];
        fArr[c10] = f10;
        Property property = FrameLayout.TRANSLATION_X;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(ri0Var, (Property<ri0, Float>) property, fArr);
        float[] fArr2 = new float[1];
        fArr2[c10] = i10 == 1 ? 1.0f : 0.0f;
        Property property2 = FrameLayout.ALPHA;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(ri0Var, (Property<ri0, Float>) property2, fArr2);
        float[] fArr3 = new float[1];
        fArr3[c10] = i10 == 1 ? AndroidUtilities.dp(16.0f) : 0.0f;
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(h5Var, (Property<org.telegram.ui.ActionBar.h5, Float>) property, fArr3);
        float[] fArr4 = new float[1];
        fArr4[c10] = i10 == 1 ? 1.0f : 0.0f;
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(s1Var, (Property<ag.s1, Float>) property2, fArr4);
        float[] fArr5 = new float[1];
        fArr5[c10] = i10 == 1 ? 1.0f : 0.6f;
        Property property3 = FrameLayout.SCALE_X;
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(s1Var, (Property<ag.s1, Float>) property3, fArr5);
        float[] fArr6 = new float[1];
        fArr6[c10] = i10 == 1 ? 1.0f : 0.6f;
        Property property4 = FrameLayout.SCALE_Y;
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(s1Var, (Property<ag.s1, Float>) property4, fArr6);
        float[] fArr7 = new float[1];
        fArr7[c10] = i10 == 2 ? 1.0f : 0.0f;
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, fArr7);
        float[] fArr8 = new float[1];
        fArr8[c10] = i10 == 2 ? 1.0f : 0.6f;
        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, fArr8);
        float[] fArr9 = new float[1];
        fArr9[c10] = i10 == 2 ? 1.0f : 0.6f;
        ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property4, fArr9);
        float[] fArr10 = new float[1];
        fArr10[c10] = i10 == 3 ? 1.0f : 0.0f;
        ObjectAnimator objectAnimatorOfFloat10 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, fArr10);
        float[] fArr11 = new float[1];
        fArr11[c10] = i10 == 3 ? 1.0f : 0.6f;
        ObjectAnimator objectAnimatorOfFloat11 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property3, fArr11);
        float[] fArr12 = new float[1];
        fArr12[c10] = i10 == 3 ? 1.0f : 0.6f;
        ObjectAnimator objectAnimatorOfFloat12 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property4, fArr12);
        Animator[] animatorArr = new Animator[12];
        animatorArr[c10] = objectAnimatorOfFloat;
        animatorArr[1] = objectAnimatorOfFloat2;
        animatorArr[2] = objectAnimatorOfFloat3;
        animatorArr[3] = objectAnimatorOfFloat4;
        animatorArr[4] = objectAnimatorOfFloat5;
        animatorArr[5] = objectAnimatorOfFloat6;
        animatorArr[6] = objectAnimatorOfFloat7;
        animatorArr[7] = objectAnimatorOfFloat8;
        animatorArr[8] = objectAnimatorOfFloat9;
        animatorArr[9] = objectAnimatorOfFloat10;
        animatorArr[10] = objectAnimatorOfFloat11;
        animatorArr[11] = objectAnimatorOfFloat12;
        animatorSet2.playTogether(animatorArr);
        this.f31433y.addListener(new nh.n2(this, i10, 6));
        this.f31433y.setDuration(250L);
        this.f31433y.setInterpolator(new OvershootInterpolator(1.02f));
        this.f31433y.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.TL_messages_stickerSet stickerSetById;
        TLRPC.TL_messages_stickerSet stickerSetById2;
        yy yyVar = this.A;
        int i12 = yyVar.Y0;
        if (i10 == NotificationCenter.groupStickersDidLoad) {
            if (this.f31428n != null && (stickerSetById2 = MediaDataController.getInstance(i12).getStickerSetById(this.f31428n.f22400id)) != null && stickerSetById2.set != null) {
                org.telegram.ui.ActionBar.n2 r2Var = yyVar.U1;
                if (r2Var == null) {
                    r2Var = new ag.r2(this, 10);
                }
                cv.W(r2Var, stickerSetById2, true, null, new lp(this, 14));
                this.f31428n = null;
            }
            if (this.f31429r == null || (stickerSetById = MediaDataController.getInstance(i12).getStickerSetById(this.f31429r.f22400id)) == null || stickerSetById.set == null) {
                return;
            }
            org.telegram.ui.ActionBar.n2 r2Var2 = yyVar.U1;
            if (r2Var2 == null) {
                r2Var2 = new ag.r2(this, 10);
            }
            org.telegram.ui.ActionBar.n2 n2Var = r2Var2;
            xq xqVar = new xq(9, this, stickerSetById);
            Pattern pattern = cv.R;
            if (n2Var.getFragmentView() != null) {
                MediaDataController.getInstance(n2Var.getCurrentAccount()).toggleStickerSet(n2Var.getFragmentView().getContext(), stickerSetById, 0, n2Var, true, true, xqVar, false);
            }
            this.f31429r = null;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.A.Y0).removeObserver(this, NotificationCenter.groupStickersDidLoad);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.v) {
            if (this.f31431w == null) {
                Paint paint = new Paint(1);
                this.f31431w = paint;
                paint.setStrokeWidth(1.0f);
                this.f31431w.setColor(this.A.B(org.telegram.ui.ActionBar.g6.f23054d7));
            }
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, this.f31431w);
        } else {
            canvas2 = canvas;
        }
        super.onDraw(canvas2);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int iDp = AndroidUtilities.dp(11.0f) + this.d.getWidth();
        TextView textView = this.f31425c;
        int measuredWidth = iDp + (textView.getVisibility() == 0 ? textView.getMeasuredWidth() : 0);
        org.telegram.ui.ActionBar.h5 h5Var = this.f31424b;
        h5Var.setRightPadding(measuredWidth);
        if (textView.getVisibility() == 0) {
            textView.setTranslationX(AndroidUtilities.dp(4.0f) + h5Var.getTextWidth());
            float fDp = AndroidUtilities.dp(4.0f) + (h5Var.getMaxTextWidth() - measuredWidth);
            if (textView.getTranslationX() > fDp) {
                textView.setTranslationX(fDp);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ((ViewGroup.MarginLayoutParams) this.f31424b.getLayoutParams()).topMargin = AndroidUtilities.dp(this.f31432x == 0 ? 10.0f : 15.0f);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f31432x == 0 ? 32.0f : 42.0f), 1073741824));
    }
}
