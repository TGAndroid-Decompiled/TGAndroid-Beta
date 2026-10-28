package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.y9;
public class g1 extends FrameLayout implements p6 {
    public int E;
    public int F;
    public int G;
    public boolean H;
    public PorterDuffColorFilter I;
    public org.telegram.ui.Cells.y J;
    public int K;
    public boolean L;
    public boolean M;
    public int N;
    public final u6 O;
    public Runnable P;
    public boolean Q;
    public ValueAnimator R;
    public boolean S;
    public int T;
    public float U;
    public final org.telegram.ui.Components.b6 f22637a;
    public TextView f22638b;
    public final bk0 f22639c;
    public boolean d;
    public aq e;
    public ImageView f22640f;
    public y9 h;
    public int f22641n;
    public int f22642r;
    public PorterDuff.Mode f22643s;
    public int v;
    public int f22644w;
    public int f22645x;
    public int f22646y;

    public g1(Context context, boolean z10, boolean z11) {
        this(0, context, null, z10, z11);
    }

    public final void a(int i10) {
        int i11;
        int dp;
        int i12;
        int dp2;
        if (i10 > 0) {
            aq aqVar = new aq(getContext(), 26, this.O);
            this.e = aqVar;
            aqVar.setDrawUnchecked(false);
            this.e.b(-1, -1, y6.E8);
            this.e.setDrawBackgroundAsArc(-1);
            org.telegram.ui.Components.b6 b6Var = this.f22637a;
            int i13 = 3;
            if (i10 == 1) {
                boolean z10 = LocaleController.isRTL;
                this.d = !z10;
                aq aqVar2 = this.e;
                if (z10) {
                    i13 = 5;
                }
                addView(aqVar2, kb1.i(26, -1, i13 | 16));
                if (!LocaleController.isRTL) {
                    i12 = AndroidUtilities.dp(34.0f);
                } else {
                    i12 = 0;
                }
                if (!LocaleController.isRTL) {
                    dp2 = 0;
                } else {
                    dp2 = AndroidUtilities.dp(34.0f);
                }
                b6Var.setPadding(i12, 0, dp2, 0);
                return;
            }
            aq aqVar3 = this.e;
            if (!LocaleController.isRTL) {
                i13 = 5;
            }
            addView(aqVar3, kb1.i(26, -1, i13 | 16));
            if (LocaleController.isRTL) {
                i11 = AndroidUtilities.dp(34.0f);
            } else {
                i11 = 0;
            }
            if (LocaleController.isRTL) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(34.0f);
            }
            b6Var.setPadding(i11, 0, dp, 0);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        int i10 = this.f22644w;
        if (i10 >= 0) {
            hashSet.add(Integer.valueOf(i10));
        }
        int i11 = this.f22645x;
        if (i11 >= 0) {
            hashSet.add(Integer.valueOf(i11));
        }
        int i12 = this.f22646y;
        if (i12 >= 0) {
            hashSet.add(Integer.valueOf(i12));
        }
    }

    public final void b() {
        Runnable runnable = this.P;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(int i10, int i11) {
        u6 u6Var = this.O;
        d(y6.w0(i10, u6Var), y6.w0(i11, u6Var));
        this.f22644w = i10;
        this.f22645x = i11;
        this.E = this.f22641n;
        this.F = this.f22642r;
    }

    public final void d(int i10, int i11) {
        setTextColor(i10);
        setIconColor(i11);
    }

    public final void e(final int i10, final int i11, final int i12, boolean z10) {
        float f7;
        ValueAnimator valueAnimator = this.R;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = 0.0f;
        if (this.S) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        if (z10) {
            f10 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, f10);
        this.R = ofFloat;
        this.S = z10;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                g1 g1Var = g1.this;
                g1Var.getClass();
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                int i13 = i10;
                int i14 = i12;
                g1Var.setTextColor(i0.a.f(floatValue, i13, i14));
                g1Var.setIconColor(i0.a.f(floatValue, i11, i14));
            }
        });
        this.R.addListener(new f1(this, z10, i10, i12, i11));
        this.R.setInterpolator(ds.h);
        this.R.start();
    }

    public final void f(boolean z10) {
        float f7;
        ValueAnimator valueAnimator = this.R;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = 0.0f;
        if (this.S) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        if (z10) {
            f10 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, f10);
        this.R = ofFloat;
        this.S = z10;
        ofFloat.addUpdateListener(new x0(this, 1));
        this.R.addListener(new bh.f0(19, this, z10));
        this.R.setInterpolator(ds.h);
        this.R.start();
    }

    public final void g(int i10, PorterDuff.Mode mode) {
        if (this.f22642r == i10 && this.f22643s == mode) {
            return;
        }
        this.f22642r = i10;
        this.f22643s = mode;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, mode);
        this.I = porterDuffColorFilter;
        this.f22639c.setColorFilter(porterDuffColorFilter);
        this.H = true;
    }

    public aq getCheckView() {
        return this.e;
    }

    public int getIconResId() {
        return this.T;
    }

    public ImageView getImageView() {
        return this.f22639c;
    }

    public ImageView getRightIcon() {
        return this.f22640f;
    }

    public org.telegram.ui.Components.b6 getTextView() {
        return this.f22637a;
    }

    public final void h(float f7, int i10) {
        this.U = f7;
        setSelectorColor(y6.o1(f7, y6.w0(i10, this.O)));
        this.f22646y = i10;
        this.G = this.v;
    }

    public final void i(int i10, CharSequence charSequence) {
        j(charSequence, i10, null);
    }

    public final void j(CharSequence charSequence, int i10, Drawable drawable) {
        float f7;
        int dp;
        int i11;
        org.telegram.ui.Components.b6 b6Var = this.f22637a;
        b6Var.setText(charSequence);
        bk0 bk0Var = this.f22639c;
        if (i10 == 0 && drawable == null && this.e == null) {
            this.T = 0;
            bk0Var.setVisibility(4);
            b6Var.setPadding(0, 0, 0, 0);
            return;
        }
        if (drawable != null) {
            this.T = 0;
            bk0Var.setImageDrawable(drawable);
        } else {
            this.T = i10;
            bk0Var.setImageResource(i10);
        }
        bk0Var.setVisibility(0);
        float f10 = 0.0f;
        if (this.d) {
            if (this.e != null) {
                dp = AndroidUtilities.dp(43.0f);
            } else {
                dp = 0;
            }
        } else {
            if (i10 == 0 && drawable == null) {
                f7 = 0.0f;
            } else {
                f7 = 43.0f;
            }
            dp = AndroidUtilities.dp(f7);
        }
        if (this.d) {
            if (i10 != 0 || drawable != null) {
                f10 = 43.0f;
            }
            i11 = AndroidUtilities.dp(f10);
        } else if (this.e != null) {
            i11 = AndroidUtilities.dp(43.0f);
        } else {
            i11 = 0;
        }
        b6Var.setPadding(dp, 0, i11, 0);
    }

    public final void k(CharSequence charSequence, ImageLocation imageLocation, String str, SvgHelper.SvgDrawable svgDrawable, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        int dp;
        int i10;
        int i11;
        org.telegram.ui.Components.b6 b6Var = this.f22637a;
        b6Var.setText(charSequence);
        if (!this.d || this.e != null) {
            dp = AndroidUtilities.dp(43.0f);
        } else {
            dp = 0;
        }
        if (this.d || this.e != null) {
            i10 = AndroidUtilities.dp(43.0f);
        } else {
            i10 = 0;
        }
        b6Var.setPadding(dp, 0, i10, 0);
        if (this.h == null) {
            y9 y9Var = new y9(getContext());
            this.h = y9Var;
            y9Var.setRoundRadius(AndroidUtilities.dp(5.0f));
            y9 y9Var2 = this.h;
            if (LocaleController.isRTL) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            addView(y9Var2, kb1.i(28, 28, i11 | 16));
        }
        this.f22639c.setVisibility(4);
        this.h.h(imageLocation, str, svgDrawable, tL_attachMenuBot);
    }

    public void l() {
        int i10;
        int i11 = this.v;
        int i12 = 0;
        if (this.L) {
            i10 = this.K;
        } else {
            i10 = 0;
        }
        if (this.M) {
            i12 = this.K;
        }
        org.telegram.ui.Cells.y Z = y6.Z(i11, i10, i12);
        this.J = Z;
        setBackground(Z);
    }

    public final void m(boolean z10, boolean z11) {
        if (this.L == z10 && this.M == z11) {
            return;
        }
        this.L = z10;
        this.M = z11;
        l();
    }

    public final void n(boolean z10, boolean z11) {
        if (this.L == z10 && this.M == z11 && this.K == 12) {
            return;
        }
        this.L = z10;
        this.M = z11;
        this.K = 12;
        l();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(isEnabled());
        aq aqVar = this.e;
        if (aqVar != null && aqVar.f26634a.f26091q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(this.e.f26634a.f26091q);
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.N), 1073741824));
        if (this.Q && this.f22637a.getLayout().getLineCount() > 1) {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.N + 8), 1073741824));
        }
    }

    public void setAnimatedIcon(int i10) {
        this.T = 0;
        this.f22639c.f(i10, 24, 24, null);
    }

    public void setCheckColor(int i10) {
        this.e.b(-1, -1, i10);
    }

    public void setChecked(boolean z10) {
        aq aqVar = this.e;
        if (aqVar == null) {
            return;
        }
        aqVar.a(z10, true);
    }

    public void setEmojiCacheType(int i10) {
        this.f22637a.setCacheType(i10);
    }

    public void setIcon(int i10) {
        this.T = i10;
        this.f22639c.setImageResource(i10);
    }

    public void setIconColor(int i10) {
        g(i10, PorterDuff.Mode.SRC_IN);
    }

    public void setIconColorImage(int i10) {
        y9 y9Var = this.h;
        if (y9Var != null) {
            y9Var.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
    }

    public void setItemHeight(int i10) {
        this.N = i10;
    }

    public void setMultiline(boolean z10) {
        org.telegram.ui.Components.b6 b6Var = this.f22637a;
        b6Var.setLines(2);
        if (z10) {
            b6Var.setTextSize(1, 14.0f);
        } else {
            this.Q = true;
        }
        b6Var.setSingleLine(false);
        b6Var.setGravity(16);
    }

    public void setRightIcon(int i10) {
        int i11;
        float f7;
        int i12;
        int i13;
        if (this.f22640f == null) {
            ImageView imageView = new ImageView(getContext());
            this.f22640f = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f22640f.setColorFilter(this.f22642r, PorterDuff.Mode.MULTIPLY);
            if (LocaleController.isRTL) {
                this.f22640f.setScaleX(-1.0f);
            }
            ImageView imageView2 = this.f22640f;
            if (LocaleController.isRTL) {
                i13 = 3;
            } else {
                i13 = 5;
            }
            addView(imageView2, kb1.i(24, -1, i13 | 16));
        }
        org.telegram.ui.Components.b6 b6Var = this.f22637a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) b6Var.getLayoutParams();
        if (LocaleController.isRTL) {
            if (this.f22640f != null) {
                i12 = AndroidUtilities.dp(32.0f);
            } else {
                i12 = 0;
            }
            layoutParams.leftMargin = i12;
        } else {
            if (this.f22640f != null) {
                i11 = AndroidUtilities.dp(32.0f);
            } else {
                i11 = 0;
            }
            layoutParams.rightMargin = i11;
        }
        b6Var.setLayoutParams(layoutParams);
        float f10 = 18.0f;
        if (LocaleController.isRTL) {
            f7 = 8.0f;
        } else {
            f7 = 18.0f;
        }
        int dp = AndroidUtilities.dp(f7);
        if (!LocaleController.isRTL) {
            f10 = 8.0f;
        }
        setPadding(dp, 0, AndroidUtilities.dp(f10), 0);
        if (i10 == 0) {
            this.f22640f.setVisibility(8);
            return;
        }
        this.f22640f.setVisibility(0);
        this.f22640f.setImageResource(i10);
    }

    public void setSelectorColor(int i10) {
        if (this.v != i10) {
            this.v = i10;
            if (this.J != null) {
                Drawable background = getBackground();
                org.telegram.ui.Cells.y yVar = this.J;
                if (background == yVar) {
                    y6.E1(yVar, i10, true);
                    return;
                }
            }
            l();
        }
    }

    public void setSubtext(CharSequence charSequence) {
        int dp;
        int i10;
        int i11 = 8;
        boolean z10 = true;
        int i12 = 0;
        if (this.f22638b == null) {
            TextView textView = new TextView(getContext());
            this.f22638b = textView;
            textView.setLines(1);
            this.f22638b.setSingleLine(true);
            int i13 = 3;
            this.f22638b.setGravity(3);
            this.f22638b.setEllipsize(TextUtils.TruncateAt.END);
            f7.V(this.f22638b, y6.f23310ai, this.O);
            this.f22638b.setVisibility(8);
            this.f22638b.setTextSize(1, 13.0f);
            TextView textView2 = this.f22638b;
            if (LocaleController.isRTL) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(43.0f);
            }
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(43.0f);
            } else {
                i10 = 0;
            }
            textView2.setPadding(dp, 0, i10, 0);
            TextView textView3 = this.f22638b;
            if (LocaleController.isRTL) {
                i13 = 5;
            }
            addView(textView3, kb1.h(-2, -2.0f, i13 | 16, 0.0f, 10.0f, 0.0f, 0.0f));
        }
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z11 = !isEmpty;
        if (this.f22638b.getVisibility() != 0) {
            z10 = false;
        }
        if (z11 != z10) {
            TextView textView4 = this.f22638b;
            if (!isEmpty) {
                i11 = 0;
            }
            textView4.setVisibility(i11);
            org.telegram.ui.Components.b6 b6Var = this.f22637a;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) b6Var.getLayoutParams();
            if (!isEmpty) {
                i12 = AndroidUtilities.dp(10.0f);
            }
            layoutParams.bottomMargin = i12;
            b6Var.setLayoutParams(layoutParams);
        }
        this.f22638b.setText(charSequence);
    }

    public void setSubtextColor(int i10) {
        TextView textView = this.f22638b;
        if (textView != null) {
            f7.r(textView);
            this.f22638b.setTextColor(i10);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f22637a.setText(charSequence);
    }

    public void setTextColor(int i10) {
        if (this.f22641n != i10) {
            this.f22641n = i10;
            this.f22637a.setTextColor(i10);
        }
    }

    @Override
    public final void updateColors() {
        bk0 bk0Var;
        PorterDuff.Mode mode;
        org.telegram.ui.Components.b6 b6Var;
        try {
            int i10 = this.f22644w;
            u6 u6Var = this.O;
            if (i10 >= 0 && this.f22641n == this.E && (b6Var = this.f22637a) != null && b6Var.getCurrentTextColor() == this.f22641n) {
                int w02 = y6.w0(this.f22644w, u6Var);
                setTextColor(w02);
                this.E = w02;
            }
            if (this.f22645x >= 0 && this.f22642r == this.F && (bk0Var = this.f22639c) != null && bk0Var.getColorFilter() == this.I) {
                int w03 = y6.w0(this.f22645x, u6Var);
                if (w03 != this.f22642r) {
                    this.f22642r = w03;
                    if (!this.H || (mode = this.f22643s) == null) {
                        mode = PorterDuff.Mode.SRC_IN;
                    }
                    PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w03, mode);
                    this.I = porterDuffColorFilter;
                    bk0Var.setColorFilter(porterDuffColorFilter);
                    ImageView imageView = this.f22640f;
                    if (imageView != null) {
                        imageView.setColorFilter(w03, PorterDuff.Mode.MULTIPLY);
                    }
                }
                this.F = w03;
            }
            int i11 = this.f22646y;
            if (i11 >= 0 && this.v == this.G) {
                int o12 = y6.o1(this.U, y6.w0(i11, u6Var));
                if (o12 != this.v) {
                    this.v = o12;
                    Drawable background = getBackground();
                    if (background == this.J && (background instanceof RippleDrawable)) {
                        ((RippleDrawable) background).setColor(ColorStateList.valueOf(o12));
                    }
                }
                this.G = o12;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public g1(Context context, u6 u6Var, boolean z10, boolean z11) {
        this(0, context, u6Var, z10, z11);
    }

    public void setIcon(Drawable drawable) {
        this.T = 0;
        this.f22639c.setImageDrawable(drawable);
    }

    public g1(int i10, Context context, u6 u6Var, boolean z10, boolean z11) {
        super(context);
        int i11 = y6.E8;
        this.f22644w = i11;
        int i12 = y6.F8;
        this.f22645x = i12;
        int i13 = y6.I5;
        this.f22646y = i13;
        this.K = 12;
        this.N = 48;
        this.U = 1.0f;
        this.O = u6Var;
        this.L = z10;
        this.M = z11;
        this.f22641n = y6.w0(i11, u6Var);
        this.f22642r = y6.w0(i12, u6Var);
        this.f22643s = PorterDuff.Mode.MULTIPLY;
        int w02 = y6.w0(i13, u6Var);
        this.v = w02;
        this.E = this.f22641n;
        this.F = this.f22642r;
        this.G = w02;
        l();
        setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        ?? imageView = new ImageView(context);
        this.f22639c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(this.f22642r, PorterDuff.Mode.SRC_IN);
        this.I = porterDuffColorFilter;
        imageView.setColorFilter(porterDuffColorFilter);
        addView((View) imageView, kb1.i(-2, 40, (LocaleController.isRTL ? 5 : 3) | 16));
        org.telegram.ui.Components.b6 b6Var = new org.telegram.ui.Components.b6(context);
        this.f22637a = b6Var;
        b6Var.setLines(1);
        b6Var.setSingleLine(true);
        b6Var.setGravity(3);
        b6Var.setEllipsize(TextUtils.TruncateAt.END);
        b6Var.setTextColor(this.f22641n);
        b6Var.setTextSize(1, 16.0f);
        addView(b6Var, kb1.i(-2, -2, (LocaleController.isRTL ? 5 : 3) | 16));
        this.d = LocaleController.isRTL;
        a(i10);
    }
}
