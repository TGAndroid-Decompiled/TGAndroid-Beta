package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public abstract class q51 extends FrameLayout implements org.telegram.ui.ActionBar.w5 {
    public final FrameLayout f41682a;
    public final ImageView f41683b;
    public final ImageView f41684c;
    public final org.telegram.ui.Components.tf0 d;
    public final View f41685e;
    public final org.telegram.ui.Components.im0 f41686f;
    public final fh.s h;
    public p51 f41687n;
    public float f41688r;
    public ValueAnimator f41689s;
    public ky0 v;
    public boolean f41690w;
    public boolean f41691x;
    public final b61 f41692y;

    public q51(b61 b61Var, Context context, boolean z10) {
        super(context);
        org.telegram.ui.ActionBar.b6 b6Var = b61Var.V0;
        this.f41692y = b61Var;
        this.f41690w = false;
        setClickable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f41682a = frameLayout;
        if (z10) {
            setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G8, b6Var));
        }
        int dp = AndroidUtilities.dp(18.0f);
        int i9 = org.telegram.ui.ActionBar.f6.He;
        frameLayout.setBackground(org.telegram.ui.ActionBar.f6.b0(dp, org.telegram.ui.ActionBar.f6.v0(i9, b6Var)));
        frameLayout.setClipToOutline(true);
        bg.q1 q1Var = ff.r0.f6254a;
        frameLayout.setOutlineProvider(new ff.q0(0, AndroidUtilities.dp(18.0f)));
        addView(frameLayout, g7.e6.d(-1, 36.0f, 55, 8.0f, 12.0f, 8.0f, 8.0f));
        ImageView imageView = new ImageView(context);
        this.f41683b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.Components.im0 im0Var = new org.telegram.ui.Components.im0();
        this.f41686f = im0Var;
        im0Var.c(0, false, false);
        int i10 = org.telegram.ui.ActionBar.f6.Je;
        im0Var.a(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        imageView.setImageDrawable(im0Var);
        final s41 s41Var = (s41) this;
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        s41 s41Var2 = s41Var;
                        fh.s sVar = s41Var2.h;
                        if (s41Var2.f41686f.f29472k == 1) {
                            sVar.setText("");
                            s41Var2.f41692y.v(null, true, false);
                            p51 p51Var = s41Var2.f41687n;
                            if (p51Var != null) {
                                p51Var.F1(null);
                                s41Var2.f41687n.G1(true, true);
                                s41Var2.f41687n.D1();
                            }
                            sVar.clearAnimation();
                            sVar.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.gr.h).start();
                            s41Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        s41 s41Var3 = s41Var;
                        b61 b61Var2 = s41Var3.f41692y;
                        if (!b61Var2.u()) {
                            b61Var2.q();
                            s41Var3.h.requestFocus();
                            b61.a(b61Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        s41 s41Var4 = s41Var;
                        fh.s sVar2 = s41Var4.h;
                        sVar2.setText("");
                        s41Var4.f41692y.v(null, true, false);
                        p51 p51Var2 = s41Var4.f41687n;
                        if (p51Var2 != null) {
                            p51Var2.F1(null);
                            s41Var4.f41687n.G1(true, true);
                        }
                        sVar2.clearAnimation();
                        sVar2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.gr.h).start();
                        s41Var4.c(false);
                        return;
                }
            }
        });
        imageView.setClickable(false);
        imageView.setImportantForAccessibility(2);
        frameLayout.addView(imageView, g7.e6.e(36, 36, 51));
        org.telegram.ui.Components.tf0 tf0Var = new org.telegram.ui.Components.tf0(s41Var, context, z10);
        this.d = tf0Var;
        frameLayout.addView(tf0Var, g7.e6.d(-1, -1.0f, 119, 36.0f, 0.0f, 0.0f, 0.0f));
        fh.s sVar = new fh.s(s41Var, context, b6Var, 2);
        this.h = sVar;
        sVar.addTextChangedListener(new o0(s41Var, 15));
        sVar.setBackground(null);
        sVar.setPadding(0, 0, AndroidUtilities.dp(4.0f), 0);
        sVar.setTextSize(1, 16.0f);
        sVar.setHint(LocaleController.getString(R.string.Search));
        sVar.setHintTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        sVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var));
        sVar.setImeOptions(268435459);
        sVar.setCursorColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Mh, b6Var));
        sVar.setCursorSize(AndroidUtilities.dp(20.0f));
        sVar.setGravity(19);
        sVar.setCursorWidth(1.5f);
        sVar.setMaxLines(1);
        sVar.setSingleLine(true);
        sVar.setLines(1);
        sVar.setTranslationY(AndroidUtilities.dp(-1.0f));
        tf0Var.addView(sVar, g7.e6.d(-1, -1.0f, 119, 0.0f, 0.0f, 32.0f, 0.0f));
        if (z10) {
            View view = new View(context);
            this.f41685e = view;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i9, b6Var), PorterDuff.Mode.MULTIPLY));
            view.setBackground(mutate);
            view.setAlpha(0.0f);
            tf0Var.addView(view, g7.e6.e(18, -1, 3));
        }
        setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        s41 s41Var2 = s41Var;
                        fh.s sVar2 = s41Var2.h;
                        if (s41Var2.f41686f.f29472k == 1) {
                            sVar2.setText("");
                            s41Var2.f41692y.v(null, true, false);
                            p51 p51Var = s41Var2.f41687n;
                            if (p51Var != null) {
                                p51Var.F1(null);
                                s41Var2.f41687n.G1(true, true);
                                s41Var2.f41687n.D1();
                            }
                            sVar2.clearAnimation();
                            sVar2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.gr.h).start();
                            s41Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        s41 s41Var3 = s41Var;
                        b61 b61Var2 = s41Var3.f41692y;
                        if (!b61Var2.u()) {
                            b61Var2.q();
                            s41Var3.h.requestFocus();
                            b61.a(b61Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        s41 s41Var4 = s41Var;
                        fh.s sVar22 = s41Var4.h;
                        sVar22.setText("");
                        s41Var4.f41692y.v(null, true, false);
                        p51 p51Var2 = s41Var4.f41687n;
                        if (p51Var2 != null) {
                            p51Var2.F1(null);
                            s41Var4.f41687n.G1(true, true);
                        }
                        sVar22.clearAnimation();
                        sVar22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.gr.h).start();
                        s41Var4.c(false);
                        return;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.f41684c = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new kh.e2(s41Var));
        imageView2.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23092i6, b6Var), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        s41 s41Var2 = s41Var;
                        fh.s sVar2 = s41Var2.h;
                        if (s41Var2.f41686f.f29472k == 1) {
                            sVar2.setText("");
                            s41Var2.f41692y.v(null, true, false);
                            p51 p51Var = s41Var2.f41687n;
                            if (p51Var != null) {
                                p51Var.F1(null);
                                s41Var2.f41687n.G1(true, true);
                                s41Var2.f41687n.D1();
                            }
                            sVar2.clearAnimation();
                            sVar2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.gr.h).start();
                            s41Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        s41 s41Var3 = s41Var;
                        b61 b61Var2 = s41Var3.f41692y;
                        if (!b61Var2.u()) {
                            b61Var2.q();
                            s41Var3.h.requestFocus();
                            b61.a(b61Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        s41 s41Var4 = s41Var;
                        fh.s sVar22 = s41Var4.h;
                        sVar22.setText("");
                        s41Var4.f41692y.v(null, true, false);
                        p51 p51Var2 = s41Var4.f41687n;
                        if (p51Var2 != null) {
                            p51Var2.F1(null);
                            s41Var4.f41687n.G1(true, true);
                        }
                        sVar22.clearAnimation();
                        sVar22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.gr.h).start();
                        s41Var4.c(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView2, g7.e6.e(36, 36, 53));
        if (!hg.h0.d) {
            b();
        }
    }

    public static void a(s41 s41Var, boolean z10) {
        if (z10) {
            if (s41Var.v == null) {
                ky0 ky0Var = new ky0(s41Var, 16);
                s41Var.v = ky0Var;
                AndroidUtilities.runOnUIThread(ky0Var, 340L);
                return;
            }
            return;
        }
        ky0 ky0Var2 = s41Var.v;
        if (ky0Var2 != null) {
            AndroidUtilities.cancelRunOnUIThread(ky0Var2);
            s41Var.v = null;
        }
        AndroidUtilities.updateViewShow(s41Var.f41684c, false);
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.q51.b():void");
    }

    public final void c(boolean z10) {
        float f10;
        if (z10 == this.f41690w) {
            return;
        }
        this.f41690w = z10;
        ValueAnimator valueAnimator = this.f41689s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.f41688r;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f41689s = ofFloat;
        ofFloat.addUpdateListener(new v01(this, 9));
        this.f41689s.setDuration(120L);
        this.f41689s.setInterpolator(org.telegram.ui.Components.gr.h);
        this.f41689s.start();
    }

    @Override
    public final void d() {
        if (this.f41691x) {
            this.f41682a.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.f6.l1(0.06f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.E8, this.f41692y.V0))));
        }
    }

    public final void e(boolean z10) {
        ?? r62;
        String str;
        p51 p51Var;
        p51 p51Var2;
        org.telegram.ui.Components.im0 im0Var = this.f41686f;
        int i9 = im0Var.f29472k;
        fh.s sVar = this.h;
        int i10 = 2;
        if (i9 == 2 && ((sVar.length() != 0 || ((p51Var2 = this.f41687n) != null && p51Var2.getSelectedCategory() != null)) && !z10)) {
            return;
        }
        if (sVar.length() <= 0 && ((p51Var = this.f41687n) == null || p51Var.f28202k3 <= 0.5f || (!p51Var.f28197f3 && p51Var.getSelectedCategory() == null))) {
            r62 = 0;
        } else {
            r62 = 1;
        }
        im0Var.b(r62);
        ImageView imageView = this.f41683b;
        imageView.setClickable(r62);
        if (r62 != 0) {
            str = LocaleController.getString(R.string.AccDescrGoBack);
        } else {
            str = null;
        }
        imageView.setContentDescription(str);
        if (r62 != 0) {
            i10 = 1;
        }
        imageView.setImportantForAccessibility(i10);
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void invalidate() {
        if (hg.h0.b(this)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), 1073741824));
    }
}
