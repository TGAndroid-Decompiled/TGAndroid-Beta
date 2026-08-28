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
public final class fw0 extends LinearLayout {
    public final TextView f38356a;
    public final TextView f38357b;
    public final FrameLayout f38358c;
    public final bw0 d;
    public final cw0 f38359e;
    public boolean f38360f;
    public boolean h;
    public final PremiumPreviewFragment f38361n;

    public fw0(PremiumPreviewFragment premiumPreviewFragment, Context context) {
        super(context);
        int i9;
        int i10;
        int i11;
        this.f38361n = premiumPreviewFragment;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f38358c = frameLayout;
        int i12 = premiumPreviewFragment.f35844c0;
        if (i12 == 1) {
            i9 = 175;
        } else {
            i9 = 190;
        }
        addView(frameLayout, g7.e6.q(i9, i9, 1));
        boolean z10 = premiumPreviewFragment.f35845d0;
        if (i12 == 1) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        bw0 bw0Var = new bw0(this, context, z10 ? 1 : 0, i10, context);
        this.d = bw0Var;
        frameLayout.addView(bw0Var, g7.e6.c(-1.0f, -1));
        frameLayout.setClipChildren(false);
        setClipChildren(false);
        TextView textView = new TextView(context);
        this.f38356a = textView;
        textView.setTextSize(1, 22.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(1);
        if (i12 == 1) {
            i11 = 8;
        } else {
            i11 = 20;
        }
        addView(textView, g7.e6.p(-2, -2, 0.0f, 1, 16, i11, 16, 0));
        TextView textView2 = new TextView(context);
        this.f38357b = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView2.setGravity(1);
        addView(textView2, g7.e6.p(-1, -2, 0.0f, 1, 16, 7, 16, 0));
        cw0 cw0Var = new cw0(this, context);
        this.f38359e = cw0Var;
        cw0Var.setOverScrollMode(2);
        cw0Var.setLayoutManager(new f2.m0());
        cw0Var.setAdapter(new ew0(this, context));
        cw0Var.setOnItemClickListener(new i(this, 24));
        final Path path = new Path();
        final float[] fArr = new float[8];
        cw0Var.setSelectorTransformer(new q0.a() {
            @Override
            public final void accept(Object obj) {
                int b10;
                Canvas canvas = (Canvas) obj;
                cw0 cw0Var2 = fw0.this.f38359e;
                View pressedChildView = cw0Var2.getPressedChildView();
                if (pressedChildView == null) {
                    b10 = -1;
                } else {
                    b10 = cw0Var2.T(pressedChildView).b();
                }
                Path path2 = path;
                path2.rewind();
                Rect selectorRect = cw0Var2.getSelectorRect();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(selectorRect.left, selectorRect.top, selectorRect.right, selectorRect.bottom);
                float[] fArr2 = fArr;
                Arrays.fill(fArr2, 0.0f);
                if (b10 == 0) {
                    Arrays.fill(fArr2, 0, 4, AndroidUtilities.dp(12.0f));
                }
                if (b10 == cw0Var2.getAdapter().h() - 1) {
                    Arrays.fill(fArr2, 4, 8, AndroidUtilities.dp(12.0f));
                }
                path2.addRoundRect(rectF, fArr2, Path.Direction.CW);
                canvas.clipPath(path2);
            }
        });
        setClipChildren(false);
        setClipToPadding(false);
        addView(cw0Var, g7.e6.k(12.0f, 16.0f, 12.0f, 4.0f, -1, -2));
        a();
        b();
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fw0.a():void");
    }

    public final void b() {
        int i9;
        int i10;
        boolean z10;
        int i11;
        int i12;
        PremiumPreviewFragment premiumPreviewFragment = this.f38361n;
        int i13 = premiumPreviewFragment.f35844c0;
        TextView textView = this.f38356a;
        TextView textView2 = this.f38357b;
        if (i13 == 0) {
            if (premiumPreviewFragment.f35855l0) {
                i11 = R.string.TelegramPremiumSubscribedTitle;
            } else {
                i11 = R.string.TelegramPremium;
            }
            textView.setText(LocaleController.getString(i11));
            if (!premiumPreviewFragment.getUserConfig().isPremium() && !premiumPreviewFragment.f35855l0) {
                i12 = R.string.TelegramPremiumSubtitle;
            } else {
                i12 = R.string.TelegramPremiumSubscribedSubtitle;
            }
            org.telegram.messenger.l0.m(i12, textView2);
        } else if (i13 == 1) {
            if (premiumPreviewFragment.f35855l0) {
                i9 = R.string.TelegramPremiumSubscribedTitle;
            } else {
                i9 = R.string.TelegramBusiness;
            }
            textView.setText(LocaleController.getString(i9));
            if (!premiumPreviewFragment.getUserConfig().isPremium() && !premiumPreviewFragment.f35855l0) {
                i10 = R.string.TelegramBusinessSubtitleTemp;
            } else {
                i10 = R.string.TelegramBusinessSubscribedSubtitleTemp;
            }
            org.telegram.messenger.l0.m(i10, textView2);
        }
        textView2.getLayoutParams().width = Math.min(AndroidUtilities.displaySize.x - AndroidUtilities.dp(42.0f), kh.x3.a(textView2.getText(), textView2.getPaint()));
        int i14 = 0;
        if (!premiumPreviewFragment.f35855l0 && !BuildVars.IS_BILLING_UNAVAILABLE && premiumPreviewFragment.d.size() > 1) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean z11 = this.f38360f;
        cw0 cw0Var = this.f38359e;
        if (z11 && z10) {
            if (cw0Var.getVisibility() == 0 && z10 && this.h == z10) {
                ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(250L);
                duration.addUpdateListener(new aw0(this, cw0Var, duration, 0));
                duration.addListener(new org.telegram.ui.Components.su0(8, this, cw0Var));
                duration.setInterpolator(org.telegram.ui.Components.gr.f28844f);
                duration.start();
            }
        } else {
            if (z10) {
                i14 = 8;
            }
            cw0Var.setVisibility(i14);
            this.f38360f = true;
        }
        this.h = !z10;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }
}
