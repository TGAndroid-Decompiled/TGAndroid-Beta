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
public final class ow0 extends LinearLayout {
    public final TextView f36990a;
    public final TextView f36991b;
    public final FrameLayout f36992c;
    public final kw0 d;
    public final lw0 e;
    public boolean f36993f;
    public boolean h;
    public final PremiumPreviewFragment f36994n;

    public ow0(PremiumPreviewFragment premiumPreviewFragment, Context context) {
        super(context);
        int i10;
        int i11;
        int i12;
        this.f36994n = premiumPreviewFragment;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f36992c = frameLayout;
        int i13 = premiumPreviewFragment.f31957d0;
        if (i13 == 1) {
            i10 = 175;
        } else {
            i10 = 190;
        }
        addView(frameLayout, k7.b6.q(i10, i10, 1));
        boolean z4 = premiumPreviewFragment.f31958e0;
        if (i13 == 1) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        kw0 kw0Var = new kw0(this, context, z4 ? 1 : 0, i11, context);
        this.d = kw0Var;
        frameLayout.addView(kw0Var, k7.b6.c(-1.0f, -1));
        frameLayout.setClipChildren(false);
        setClipChildren(false);
        TextView textView = new TextView(context);
        this.f36990a = textView;
        textView.setTextSize(1, 22.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(1);
        if (i13 == 1) {
            i12 = 8;
        } else {
            i12 = 20;
        }
        addView(textView, k7.b6.p(-2, -2, 0.0f, 1, 16, i12, 16, 0));
        TextView textView2 = new TextView(context);
        this.f36991b = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView2.setGravity(1);
        addView(textView2, k7.b6.p(-1, -2, 0.0f, 1, 16, 7, 16, 0));
        lw0 lw0Var = new lw0(this, context);
        this.e = lw0Var;
        lw0Var.setOverScrollMode(2);
        lw0Var.setLayoutManager(new f2.i0());
        lw0Var.setAdapter(new nw0(this, context));
        lw0Var.setOnItemClickListener(new j(this, 24));
        final Path path = new Path();
        final float[] fArr = new float[8];
        lw0Var.setSelectorTransformer(new q0.a() {
            @Override
            public final void accept(Object obj) {
                int b10;
                Canvas canvas = (Canvas) obj;
                lw0 lw0Var2 = ow0.this.e;
                View pressedChildView = lw0Var2.getPressedChildView();
                if (pressedChildView == null) {
                    b10 = -1;
                } else {
                    b10 = lw0Var2.T(pressedChildView).b();
                }
                Path path2 = path;
                path2.rewind();
                Rect selectorRect = lw0Var2.getSelectorRect();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(selectorRect.left, selectorRect.top, selectorRect.right, selectorRect.bottom);
                float[] fArr2 = fArr;
                Arrays.fill(fArr2, 0.0f);
                if (b10 == 0) {
                    Arrays.fill(fArr2, 0, 4, AndroidUtilities.dp(12.0f));
                }
                if (b10 == lw0Var2.getAdapter().h() - 1) {
                    Arrays.fill(fArr2, 4, 8, AndroidUtilities.dp(12.0f));
                }
                path2.addRoundRect(rectF, fArr2, Path.Direction.CW);
                canvas.clipPath(path2);
            }
        });
        setClipChildren(false);
        setClipToPadding(false);
        addView(lw0Var, k7.b6.k(12.0f, 16.0f, 12.0f, 4.0f, -1, -2));
        a();
        b();
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ow0.a():void");
    }

    public final void b() {
        int i10;
        int i11;
        boolean z4;
        int i12;
        int i13;
        PremiumPreviewFragment premiumPreviewFragment = this.f36994n;
        int i14 = premiumPreviewFragment.f31957d0;
        TextView textView = this.f36990a;
        TextView textView2 = this.f36991b;
        if (i14 == 0) {
            if (premiumPreviewFragment.m0) {
                i12 = R.string.TelegramPremiumSubscribedTitle;
            } else {
                i12 = R.string.TelegramPremium;
            }
            textView.setText(LocaleController.getString(i12));
            if (!premiumPreviewFragment.getUserConfig().isPremium() && !premiumPreviewFragment.m0) {
                i13 = R.string.TelegramPremiumSubtitle;
            } else {
                i13 = R.string.TelegramPremiumSubscribedSubtitle;
            }
            org.telegram.messenger.y3.q(i13, textView2);
        } else if (i14 == 1) {
            if (premiumPreviewFragment.m0) {
                i10 = R.string.TelegramPremiumSubscribedTitle;
            } else {
                i10 = R.string.TelegramBusiness;
            }
            textView.setText(LocaleController.getString(i10));
            if (!premiumPreviewFragment.getUserConfig().isPremium() && !premiumPreviewFragment.m0) {
                i11 = R.string.TelegramBusinessSubtitleTemp;
            } else {
                i11 = R.string.TelegramBusinessSubscribedSubtitleTemp;
            }
            org.telegram.messenger.y3.q(i11, textView2);
        }
        textView2.getLayoutParams().width = Math.min(AndroidUtilities.displaySize.x - AndroidUtilities.dp(42.0f), ph.f3.a(textView2.getText(), textView2.getPaint()));
        int i15 = 0;
        if (!premiumPreviewFragment.m0 && !BuildVars.IS_BILLING_UNAVAILABLE && premiumPreviewFragment.d.size() > 1) {
            z4 = false;
        } else {
            z4 = true;
        }
        boolean z10 = this.f36993f;
        lw0 lw0Var = this.e;
        if (z10 && z4) {
            if (lw0Var.getVisibility() == 0 && z4 && this.h == z4) {
                ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(250L);
                duration.addUpdateListener(new jw0(this, lw0Var, duration, 0));
                duration.addListener(new org.telegram.ui.Components.ex0(7, this, lw0Var));
                duration.setInterpolator(org.telegram.ui.Components.nr.f27346f);
                duration.start();
            }
        } else {
            if (z4) {
                i15 = 8;
            }
            lw0Var.setVisibility(i15);
            this.f36993f = true;
        }
        this.h = !z4;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }
}
