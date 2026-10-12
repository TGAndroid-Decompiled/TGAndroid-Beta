package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class px0 extends LinearLayout {
    public final TextView f39300a;
    public final TextView f39301b;
    public final FrameLayout f39302c;
    public final lx0 d;
    public final mx0 e;
    public boolean f39303f;
    public boolean h;
    public final PremiumPreviewFragment f39304n;

    public px0(PremiumPreviewFragment premiumPreviewFragment, Context context) {
        super(context);
        int i10;
        int i11;
        int i12;
        this.f39304n = premiumPreviewFragment;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f39302c = frameLayout;
        int i13 = premiumPreviewFragment.f32455g0;
        if (i13 == 1) {
            i10 = 175;
        } else {
            i10 = 190;
        }
        addView(frameLayout, w7.a6.q(i10, i10, 1));
        boolean z10 = premiumPreviewFragment.f32456h0;
        if (i13 == 1) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        lx0 lx0Var = new lx0(this, context, z10 ? 1 : 0, i11, context);
        this.d = lx0Var;
        frameLayout.addView(lx0Var, w7.a6.d(-1.0f, -1));
        frameLayout.setClipChildren(false);
        setClipChildren(false);
        TextView textView = new TextView(context);
        this.f39300a = textView;
        textView.setTextSize(1, 22.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(1);
        if (i13 == 1) {
            i12 = 8;
        } else {
            i12 = 20;
        }
        addView(textView, w7.a6.p(-2, -2, 0.0f, 1, 16, i12, 16, 0));
        TextView textView2 = new TextView(context);
        this.f39301b = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView2.setGravity(1);
        addView(textView2, w7.a6.p(-1, -2, 0.0f, 1, 16, 7, 16, 0));
        mx0 mx0Var = new mx0(this, context);
        this.e = mx0Var;
        mx0Var.setOverScrollMode(2);
        mx0Var.setLayoutManager(new s4.b0());
        mx0Var.setAdapter(new ox0(this, context));
        mx0Var.setOnItemClickListener(new i(this, 26));
        final Path path = new Path();
        final float[] fArr = new float[8];
        mx0Var.setSelectorTransformer(new q0.a() {
            @Override
            public final void accept(Object obj) {
                int b10;
                Canvas canvas = (Canvas) obj;
                mx0 mx0Var2 = px0.this.e;
                View pressedChildView = mx0Var2.getPressedChildView();
                if (pressedChildView == null) {
                    b10 = -1;
                } else {
                    b10 = mx0Var2.T(pressedChildView).b();
                }
                Path path2 = path;
                path2.rewind();
                Rect selectorRect = mx0Var2.getSelectorRect();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(selectorRect.left, selectorRect.top, selectorRect.right, selectorRect.bottom);
                float[] fArr2 = fArr;
                Arrays.fill(fArr2, 0.0f);
                if (b10 == 0) {
                    Arrays.fill(fArr2, 0, 4, AndroidUtilities.dp(12.0f));
                }
                if (b10 == mx0Var2.getAdapter().h() - 1) {
                    Arrays.fill(fArr2, 4, 8, AndroidUtilities.dp(12.0f));
                }
                path2.addRoundRect(rectF, fArr2, Path.Direction.CW);
                canvas.clipPath(path2);
            }
        });
        setClipChildren(false);
        setClipToPadding(false);
        addView(mx0Var, w7.a6.k(12.0f, 16.0f, 12.0f, 4.0f, -1, -2));
        a();
        b();
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.px0.a():void");
    }

    public final void b() {
        int i10;
        int i11;
        boolean z10;
        int i12;
        int i13;
        PremiumPreviewFragment premiumPreviewFragment = this.f39304n;
        int i14 = premiumPreviewFragment.f32455g0;
        TextView textView = this.f39300a;
        TextView textView2 = this.f39301b;
        if (i14 == 0) {
            if (premiumPreviewFragment.f32464p0) {
                i12 = R.string.TelegramPremiumSubscribedTitle;
            } else {
                i12 = R.string.TelegramPremium;
            }
            textView.setText(LocaleController.getString(i12));
            if (!premiumPreviewFragment.getUserConfig().isPremium() && !premiumPreviewFragment.f32464p0) {
                i13 = R.string.TelegramPremiumSubtitle;
            } else {
                i13 = R.string.TelegramPremiumSubscribedSubtitle;
            }
            org.telegram.messenger.q.o(i13, textView2);
        } else if (i14 == 1) {
            if (premiumPreviewFragment.f32464p0) {
                i10 = R.string.TelegramPremiumSubscribedTitle;
            } else {
                i10 = R.string.TelegramBusiness;
            }
            textView.setText(LocaleController.getString(i10));
            if (!premiumPreviewFragment.getUserConfig().isPremium() && !premiumPreviewFragment.f32464p0) {
                i11 = R.string.TelegramBusinessSubtitleTemp;
            } else {
                i11 = R.string.TelegramBusinessSubscribedSubtitleTemp;
            }
            org.telegram.messenger.q.o(i11, textView2);
        }
        textView2.getLayoutParams().width = Math.min(AndroidUtilities.displaySize.x - AndroidUtilities.dp(42.0f), di.d4.a(textView2.getText(), textView2.getPaint()));
        int i15 = 0;
        if (!premiumPreviewFragment.f32464p0 && !BuildVars.IS_BILLING_UNAVAILABLE && premiumPreviewFragment.d.size() > 1) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean z11 = this.f39303f;
        mx0 mx0Var = this.e;
        if (z11 && z10) {
            if (mx0Var.getVisibility() == 0 && z10 && this.h == z10) {
                ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(250L);
                duration.addUpdateListener(new kx0(this, mx0Var, duration, 0));
                duration.addListener(new org.telegram.ui.Components.ql0(10, this, mx0Var));
                duration.setInterpolator(org.telegram.ui.Components.es.f24771f);
                duration.start();
            }
        } else {
            if (z10) {
                i15 = 8;
            }
            mx0Var.setVisibility(i15);
            this.f39303f = true;
        }
        this.h = !z10;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }
}
