package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bp;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.ri0;

public class f1 extends FrameLayout {
    public int A;
    public final c6 B;
    public Runnable C;
    public boolean D;
    public ValueAnimator E;
    public boolean F;
    public int G;

    public final org.telegram.ui.Components.s5 f22911a;

    public TextView f22912b;

    public final ri0 f22913c;
    public boolean d;

    public bp f22914e;

    public ImageView f22915f;
    public n9 h;

    public int f22916n;

    public int f22917r;

    public PorterDuff.Mode f22918s;
    public int v;

    public int f22919w;

    public boolean f22920x;

    public boolean f22921y;

    public f1(Context context, boolean z10, boolean z11) {
        this(0, context, null, z10, z11);
    }

    public final void a(int i10) {
        if (i10 > 0) {
            bp bpVar = new bp(getContext(), 26, this.B);
            this.f22914e = bpVar;
            bpVar.setDrawUnchecked(false);
            this.f22914e.b(-1, -1, g6.E8);
            this.f22914e.setDrawBackgroundAsArc(-1);
            org.telegram.ui.Components.s5 s5Var = this.f22911a;
            if (i10 != 1) {
                addView(this.f22914e, h7.z5.e(26, -1, (LocaleController.isRTL ? 3 : 5) | 16));
                s5Var.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(34.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(34.0f), 0);
            } else {
                boolean z10 = LocaleController.isRTL;
                this.d = !z10;
                addView(this.f22914e, h7.z5.e(26, -1, (z10 ? 5 : 3) | 16));
                s5Var.setPadding(!LocaleController.isRTL ? AndroidUtilities.dp(34.0f) : 0, 0, !LocaleController.isRTL ? 0 : AndroidUtilities.dp(34.0f), 0);
            }
        }
    }

    public final void b() {
        Runnable runnable = this.C;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(int i10, int i11) {
        setTextColor(i10);
        setIconColor(i11);
    }

    public final void d(boolean z10) {
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.F ? 1.0f : 0.0f, z10 ? 1.0f : 0.0f);
        this.E = valueAnimatorOfFloat;
        this.F = z10;
        valueAnimatorOfFloat.addUpdateListener(new w0(this, 1));
        this.E.addListener(new ag.x(19, this, z10));
        this.E.setInterpolator(er.h);
        this.E.start();
    }

    public final void e(int i10, PorterDuff.Mode mode) {
        if (this.f22917r == i10 && this.f22918s == mode) {
            return;
        }
        this.f22917r = i10;
        this.f22918s = mode;
        this.f22913c.setColorFilter(new PorterDuffColorFilter(i10, mode));
    }

    public final void f(int i10, CharSequence charSequence) {
        g(charSequence, i10, null);
    }

    public final void g(CharSequence charSequence, int i10, Drawable drawable) {
        int iDp;
        int iDp2;
        org.telegram.ui.Components.s5 s5Var = this.f22911a;
        s5Var.setText(charSequence);
        ri0 ri0Var = this.f22913c;
        if (i10 == 0 && drawable == null && this.f22914e == null) {
            this.G = 0;
            ri0Var.setVisibility(4);
            s5Var.setPadding(0, 0, 0, 0);
            return;
        }
        if (drawable != null) {
            this.G = 0;
            ri0Var.setImageDrawable(drawable);
        } else {
            this.G = i10;
            ri0Var.setImageResource(i10);
        }
        ri0Var.setVisibility(0);
        if (this.d) {
            iDp = this.f22914e != null ? AndroidUtilities.dp(43.0f) : 0;
        } else {
            iDp = AndroidUtilities.dp((i10 == 0 && drawable == null) ? 0.0f : 43.0f);
        }
        if (this.d) {
            iDp2 = AndroidUtilities.dp((i10 == 0 && drawable == null) ? 0.0f : 43.0f);
        } else {
            iDp2 = this.f22914e != null ? AndroidUtilities.dp(43.0f) : 0;
        }
        s5Var.setPadding(iDp, 0, iDp2, 0);
    }

    public bp getCheckView() {
        return this.f22914e;
    }

    public int getIconResId() {
        return this.G;
    }

    public ImageView getImageView() {
        return this.f22913c;
    }

    public ImageView getRightIcon() {
        return this.f22915f;
    }

    public org.telegram.ui.Components.s5 getTextView() {
        return this.f22911a;
    }

    public final void h(CharSequence charSequence, ImageLocation imageLocation, String str, SvgHelper.SvgDrawable svgDrawable, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        org.telegram.ui.Components.s5 s5Var = this.f22911a;
        s5Var.setText(charSequence);
        s5Var.setPadding((this.d && this.f22914e == null) ? 0 : AndroidUtilities.dp(43.0f), 0, (!this.d && this.f22914e == null) ? 0 : AndroidUtilities.dp(43.0f), 0);
        if (this.h == null) {
            n9 n9Var = new n9(getContext());
            this.h = n9Var;
            n9Var.setRoundRadius(AndroidUtilities.dp(5.0f));
            addView(this.h, h7.z5.e(28, 28, (LocaleController.isRTL ? 5 : 3) | 16));
        }
        this.f22913c.setVisibility(4);
        this.h.h(imageLocation, str, svgDrawable, tL_attachMenuBot);
    }

    public void i() {
        setBackground(g6.Y(this.v, this.f22920x ? this.f22919w : 0, this.f22921y ? this.f22919w : 0));
    }

    public final void j(boolean z10, boolean z11) {
        if (this.f22920x == z10 && this.f22921y == z11) {
            return;
        }
        this.f22920x = z10;
        this.f22921y = z11;
        i();
    }

    public final void k(boolean z10, boolean z11) {
        if (this.f22920x == z10 && this.f22921y == z11 && this.f22919w == 12) {
            return;
        }
        this.f22920x = z10;
        this.f22921y = z11;
        this.f22919w = 12;
        i();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(isEnabled());
        bp bpVar = this.f22914e;
        if (bpVar == null || !bpVar.f27188a.f26309q) {
            return;
        }
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.f22914e.f27188a.f26309q);
        accessibilityNodeInfo.setClassName("android.widget.CheckBox");
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.A), 1073741824));
        if (!this.D || this.f22911a.getLayout().getLineCount() <= 1) {
            return;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.A + 8), 1073741824));
    }

    public void setAnimatedIcon(int i10) {
        this.G = 0;
        this.f22913c.f(i10, 24, 24, null);
    }

    public void setCheckColor(int i10) {
        this.f22914e.b(-1, -1, i10);
    }

    public void setChecked(boolean z10) {
        bp bpVar = this.f22914e;
        if (bpVar == null) {
            return;
        }
        bpVar.a(z10, true);
    }

    public void setEmojiCacheType(int i10) {
        this.f22911a.setCacheType(i10);
    }

    public void setIcon(int i10) {
        this.G = i10;
        this.f22913c.setImageResource(i10);
    }

    public void setIconColor(int i10) {
        e(i10, PorterDuff.Mode.SRC_IN);
    }

    public void setIconColorImage(int i10) {
        n9 n9Var = this.h;
        if (n9Var != null) {
            n9Var.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
    }

    public void setItemHeight(int i10) {
        this.A = i10;
    }

    public void setMultiline(boolean z10) {
        org.telegram.ui.Components.s5 s5Var = this.f22911a;
        s5Var.setLines(2);
        if (z10) {
            s5Var.setTextSize(1, 14.0f);
        } else {
            this.D = true;
        }
        s5Var.setSingleLine(false);
        s5Var.setGravity(16);
    }

    public void setRightIcon(int i10) {
        if (this.f22915f == null) {
            ImageView imageView = new ImageView(getContext());
            this.f22915f = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f22915f.setColorFilter(this.f22917r, PorterDuff.Mode.MULTIPLY);
            if (LocaleController.isRTL) {
                this.f22915f.setScaleX(-1.0f);
            }
            addView(this.f22915f, h7.z5.e(24, -1, (LocaleController.isRTL ? 3 : 5) | 16));
        }
        org.telegram.ui.Components.s5 s5Var = this.f22911a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) s5Var.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.leftMargin = this.f22915f != null ? AndroidUtilities.dp(32.0f) : 0;
        } else {
            layoutParams.rightMargin = this.f22915f != null ? AndroidUtilities.dp(32.0f) : 0;
        }
        s5Var.setLayoutParams(layoutParams);
        setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : 18.0f), 0, AndroidUtilities.dp(LocaleController.isRTL ? 18.0f : 8.0f), 0);
        if (i10 == 0) {
            this.f22915f.setVisibility(8);
        } else {
            this.f22915f.setVisibility(0);
            this.f22915f.setImageResource(i10);
        }
    }

    public void setSelectorColor(int i10) {
        if (this.v != i10) {
            this.v = i10;
            i();
        }
    }

    public void setSubtext(CharSequence charSequence) {
        if (this.f22912b == null) {
            TextView textView = new TextView(getContext());
            this.f22912b = textView;
            textView.setLines(1);
            this.f22912b.setSingleLine(true);
            this.f22912b.setGravity(3);
            this.f22912b.setEllipsize(TextUtils.TruncateAt.END);
            this.f22912b.setTextColor(g6.v0(g6.ai, this.B));
            this.f22912b.setVisibility(8);
            this.f22912b.setTextSize(1, 13.0f);
            this.f22912b.setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(43.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(43.0f) : 0, 0);
            addView(this.f22912b, h7.z5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 16, 0.0f, 10.0f, 0.0f, 0.0f));
        }
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        if ((!zIsEmpty) != (this.f22912b.getVisibility() == 0)) {
            this.f22912b.setVisibility(zIsEmpty ? 8 : 0);
            org.telegram.ui.Components.s5 s5Var = this.f22911a;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) s5Var.getLayoutParams();
            layoutParams.bottomMargin = zIsEmpty ? 0 : AndroidUtilities.dp(10.0f);
            s5Var.setLayoutParams(layoutParams);
        }
        this.f22912b.setText(charSequence);
    }

    public void setSubtextColor(int i10) {
        TextView textView = this.f22912b;
        if (textView != null) {
            textView.setTextColor(i10);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f22911a.setText(charSequence);
    }

    public void setTextColor(int i10) {
        if (this.f22916n != i10) {
            this.f22916n = i10;
            this.f22911a.setTextColor(i10);
        }
    }

    public f1(Context context, c6 c6Var, boolean z10, boolean z11) {
        this(0, context, c6Var, z10, z11);
    }

    public void setIcon(Drawable drawable) {
        this.G = 0;
        this.f22913c.setImageDrawable(drawable);
    }

    public f1(int i10, Context context, c6 c6Var, boolean z10, boolean z11) {
        super(context);
        this.f22919w = 12;
        this.A = 48;
        this.B = c6Var;
        this.f22920x = z10;
        this.f22921y = z11;
        this.f22916n = g6.v0(g6.E8, c6Var);
        this.f22917r = g6.v0(g6.F8, c6Var);
        this.f22918s = PorterDuff.Mode.MULTIPLY;
        this.v = g6.v0(g6.I5, c6Var);
        i();
        setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        ri0 ri0Var = new ri0(context);
        this.f22913c = ri0Var;
        ri0Var.setScaleType(ImageView.ScaleType.CENTER);
        ri0Var.setColorFilter(new PorterDuffColorFilter(this.f22917r, PorterDuff.Mode.SRC_IN));
        addView(ri0Var, h7.z5.e(-2, 40, (LocaleController.isRTL ? 5 : 3) | 16));
        org.telegram.ui.Components.s5 s5Var = new org.telegram.ui.Components.s5(context);
        this.f22911a = s5Var;
        s5Var.setLines(1);
        s5Var.setSingleLine(true);
        s5Var.setGravity(3);
        s5Var.setEllipsize(TextUtils.TruncateAt.END);
        s5Var.setTextColor(this.f22916n);
        s5Var.setTextSize(1, 16.0f);
        addView(s5Var, h7.z5.e(-2, -2, (LocaleController.isRTL ? 5 : 3) | 16));
        this.d = LocaleController.isRTL;
        a(i10);
    }
}
