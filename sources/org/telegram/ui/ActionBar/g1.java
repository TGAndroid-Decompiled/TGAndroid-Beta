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
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.t9;
public class g1 extends FrameLayout {
    public int A;
    public final c6 B;
    public Runnable C;
    public boolean D;
    public ValueAnimator E;
    public boolean F;
    public int G;
    public final org.telegram.ui.Components.x5 f22963a;
    public TextView f22964b;
    public final aj0 f22965c;
    public boolean d;
    public hp f22966e;
    public ImageView f22967f;
    public t9 h;
    public int f22968n;
    public int f22969r;
    public PorterDuff.Mode f22970s;
    public int v;
    public int f22971w;
    public boolean f22972x;
    public boolean f22973y;

    public g1(Context context, boolean z10, boolean z11) {
        this(0, context, null, z10, z11);
    }

    public final void a(int i10) {
        int i11;
        int dp;
        int i12;
        int dp2;
        if (i10 > 0) {
            hp hpVar = new hp(getContext(), 26, this.B);
            this.f22966e = hpVar;
            hpVar.setDrawUnchecked(false);
            this.f22966e.b(-1, -1, g6.E8);
            this.f22966e.setDrawBackgroundAsArc(-1);
            org.telegram.ui.Components.x5 x5Var = this.f22963a;
            int i13 = 3;
            if (i10 == 1) {
                boolean z10 = LocaleController.isRTL;
                this.d = !z10;
                hp hpVar2 = this.f22966e;
                if (z10) {
                    i13 = 5;
                }
                addView(hpVar2, i7.f6.e(26, -1, i13 | 16));
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
                x5Var.setPadding(i12, 0, dp2, 0);
                return;
            }
            hp hpVar3 = this.f22966e;
            if (!LocaleController.isRTL) {
                i13 = 5;
            }
            addView(hpVar3, i7.f6.e(26, -1, i13 | 16));
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
            x5Var.setPadding(i11, 0, dp, 0);
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
        float f9;
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = 0.0f;
        if (this.F) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        if (z10) {
            f10 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f9, f10);
        this.E = ofFloat;
        this.F = z10;
        ofFloat.addUpdateListener(new x0(this, 1));
        this.E.addListener(new bg.z2(18, this, z10));
        this.E.setInterpolator(jr.h);
        this.E.start();
    }

    public final void e(int i10, PorterDuff.Mode mode) {
        if (this.f22969r == i10 && this.f22970s == mode) {
            return;
        }
        this.f22969r = i10;
        this.f22970s = mode;
        this.f22965c.setColorFilter(new PorterDuffColorFilter(i10, mode));
    }

    public final void f(int i10, CharSequence charSequence) {
        g(charSequence, i10, null);
    }

    public final void g(CharSequence charSequence, int i10, Drawable drawable) {
        float f9;
        int dp;
        int i11;
        org.telegram.ui.Components.x5 x5Var = this.f22963a;
        x5Var.setText(charSequence);
        aj0 aj0Var = this.f22965c;
        if (i10 == 0 && drawable == null && this.f22966e == null) {
            this.G = 0;
            aj0Var.setVisibility(4);
            x5Var.setPadding(0, 0, 0, 0);
            return;
        }
        if (drawable != null) {
            this.G = 0;
            aj0Var.setImageDrawable(drawable);
        } else {
            this.G = i10;
            aj0Var.setImageResource(i10);
        }
        aj0Var.setVisibility(0);
        float f10 = 0.0f;
        if (this.d) {
            if (this.f22966e != null) {
                dp = AndroidUtilities.dp(43.0f);
            } else {
                dp = 0;
            }
        } else {
            if (i10 == 0 && drawable == null) {
                f9 = 0.0f;
            } else {
                f9 = 43.0f;
            }
            dp = AndroidUtilities.dp(f9);
        }
        if (this.d) {
            i11 = AndroidUtilities.dp((i10 == 0 && drawable == null) ? 43.0f : 43.0f);
        } else if (this.f22966e != null) {
            i11 = AndroidUtilities.dp(43.0f);
        } else {
            i11 = 0;
        }
        x5Var.setPadding(dp, 0, i11, 0);
    }

    public hp getCheckView() {
        return this.f22966e;
    }

    public int getIconResId() {
        return this.G;
    }

    public ImageView getImageView() {
        return this.f22965c;
    }

    public ImageView getRightIcon() {
        return this.f22967f;
    }

    public org.telegram.ui.Components.x5 getTextView() {
        return this.f22963a;
    }

    public final void h(CharSequence charSequence, ImageLocation imageLocation, String str, SvgHelper.SvgDrawable svgDrawable, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        int dp;
        int i10;
        int i11;
        org.telegram.ui.Components.x5 x5Var = this.f22963a;
        x5Var.setText(charSequence);
        if (!this.d || this.f22966e != null) {
            dp = AndroidUtilities.dp(43.0f);
        } else {
            dp = 0;
        }
        if (this.d || this.f22966e != null) {
            i10 = AndroidUtilities.dp(43.0f);
        } else {
            i10 = 0;
        }
        x5Var.setPadding(dp, 0, i10, 0);
        if (this.h == null) {
            t9 t9Var = new t9(getContext());
            this.h = t9Var;
            t9Var.setRoundRadius(AndroidUtilities.dp(5.0f));
            t9 t9Var2 = this.h;
            if (LocaleController.isRTL) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            addView(t9Var2, i7.f6.e(28, 28, i11 | 16));
        }
        this.f22965c.setVisibility(4);
        this.h.h(imageLocation, str, svgDrawable, tL_attachMenuBot);
    }

    public void i() {
        int i10;
        int i11 = this.v;
        int i12 = 0;
        if (this.f22972x) {
            i10 = this.f22971w;
        } else {
            i10 = 0;
        }
        if (this.f22973y) {
            i12 = this.f22971w;
        }
        setBackground(g6.Y(i11, i10, i12));
    }

    public final void j(boolean z10, boolean z11) {
        if (this.f22972x == z10 && this.f22973y == z11) {
            return;
        }
        this.f22972x = z10;
        this.f22973y = z11;
        i();
    }

    public final void k(boolean z10, boolean z11) {
        if (this.f22972x == z10 && this.f22973y == z11 && this.f22971w == 12) {
            return;
        }
        this.f22972x = z10;
        this.f22973y = z11;
        this.f22971w = 12;
        i();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(isEnabled());
        hp hpVar = this.f22966e;
        if (hpVar != null && hpVar.f29211a.f26324q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(this.f22966e.f29211a.f26324q);
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.A), 1073741824));
        if (this.D && this.f22963a.getLayout().getLineCount() > 1) {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.A + 8), 1073741824));
        }
    }

    public void setAnimatedIcon(int i10) {
        this.G = 0;
        this.f22965c.f(i10, 24, 24, null);
    }

    public void setCheckColor(int i10) {
        this.f22966e.b(-1, -1, i10);
    }

    public void setChecked(boolean z10) {
        hp hpVar = this.f22966e;
        if (hpVar == null) {
            return;
        }
        hpVar.a(z10, true);
    }

    public void setEmojiCacheType(int i10) {
        this.f22963a.setCacheType(i10);
    }

    public void setIcon(int i10) {
        this.G = i10;
        this.f22965c.setImageResource(i10);
    }

    public void setIconColor(int i10) {
        e(i10, PorterDuff.Mode.SRC_IN);
    }

    public void setIconColorImage(int i10) {
        t9 t9Var = this.h;
        if (t9Var != null) {
            t9Var.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
    }

    public void setItemHeight(int i10) {
        this.A = i10;
    }

    public void setMultiline(boolean z10) {
        org.telegram.ui.Components.x5 x5Var = this.f22963a;
        x5Var.setLines(2);
        if (z10) {
            x5Var.setTextSize(1, 14.0f);
        } else {
            this.D = true;
        }
        x5Var.setSingleLine(false);
        x5Var.setGravity(16);
    }

    public void setRightIcon(int i10) {
        int i11;
        float f9;
        int i12;
        int i13;
        if (this.f22967f == null) {
            ImageView imageView = new ImageView(getContext());
            this.f22967f = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f22967f.setColorFilter(this.f22969r, PorterDuff.Mode.MULTIPLY);
            if (LocaleController.isRTL) {
                this.f22967f.setScaleX(-1.0f);
            }
            ImageView imageView2 = this.f22967f;
            if (LocaleController.isRTL) {
                i13 = 3;
            } else {
                i13 = 5;
            }
            addView(imageView2, i7.f6.e(24, -1, i13 | 16));
        }
        org.telegram.ui.Components.x5 x5Var = this.f22963a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) x5Var.getLayoutParams();
        if (LocaleController.isRTL) {
            if (this.f22967f != null) {
                i12 = AndroidUtilities.dp(32.0f);
            } else {
                i12 = 0;
            }
            layoutParams.leftMargin = i12;
        } else {
            if (this.f22967f != null) {
                i11 = AndroidUtilities.dp(32.0f);
            } else {
                i11 = 0;
            }
            layoutParams.rightMargin = i11;
        }
        x5Var.setLayoutParams(layoutParams);
        float f10 = 18.0f;
        if (LocaleController.isRTL) {
            f9 = 8.0f;
        } else {
            f9 = 18.0f;
        }
        int dp = AndroidUtilities.dp(f9);
        if (!LocaleController.isRTL) {
            f10 = 8.0f;
        }
        setPadding(dp, 0, AndroidUtilities.dp(f10), 0);
        if (i10 == 0) {
            this.f22967f.setVisibility(8);
            return;
        }
        this.f22967f.setVisibility(0);
        this.f22967f.setImageResource(i10);
    }

    public void setSelectorColor(int i10) {
        if (this.v != i10) {
            this.v = i10;
            i();
        }
    }

    public void setSubtext(CharSequence charSequence) {
        int dp;
        int i10;
        int i11 = 8;
        boolean z10 = true;
        int i12 = 0;
        if (this.f22964b == null) {
            TextView textView = new TextView(getContext());
            this.f22964b = textView;
            textView.setLines(1);
            this.f22964b.setSingleLine(true);
            int i13 = 3;
            this.f22964b.setGravity(3);
            this.f22964b.setEllipsize(TextUtils.TruncateAt.END);
            this.f22964b.setTextColor(g6.v0(g6.ai, this.B));
            this.f22964b.setVisibility(8);
            this.f22964b.setTextSize(1, 13.0f);
            TextView textView2 = this.f22964b;
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
            TextView textView3 = this.f22964b;
            if (LocaleController.isRTL) {
                i13 = 5;
            }
            addView(textView3, i7.f6.d(-2, -2.0f, i13 | 16, 0.0f, 10.0f, 0.0f, 0.0f));
        }
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z11 = !isEmpty;
        if (this.f22964b.getVisibility() != 0) {
            z10 = false;
        }
        if (z11 != z10) {
            TextView textView4 = this.f22964b;
            if (!isEmpty) {
                i11 = 0;
            }
            textView4.setVisibility(i11);
            org.telegram.ui.Components.x5 x5Var = this.f22963a;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) x5Var.getLayoutParams();
            if (!isEmpty) {
                i12 = AndroidUtilities.dp(10.0f);
            }
            layoutParams.bottomMargin = i12;
            x5Var.setLayoutParams(layoutParams);
        }
        this.f22964b.setText(charSequence);
    }

    public void setSubtextColor(int i10) {
        TextView textView = this.f22964b;
        if (textView != null) {
            textView.setTextColor(i10);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f22963a.setText(charSequence);
    }

    public void setTextColor(int i10) {
        if (this.f22968n != i10) {
            this.f22968n = i10;
            this.f22963a.setTextColor(i10);
        }
    }

    public g1(Context context, c6 c6Var, boolean z10, boolean z11) {
        this(0, context, c6Var, z10, z11);
    }

    public void setIcon(Drawable drawable) {
        this.G = 0;
        this.f22965c.setImageDrawable(drawable);
    }

    public g1(int i10, Context context, c6 c6Var, boolean z10, boolean z11) {
        super(context);
        this.f22971w = 12;
        this.A = 48;
        this.B = c6Var;
        this.f22972x = z10;
        this.f22973y = z11;
        this.f22968n = g6.v0(g6.E8, c6Var);
        this.f22969r = g6.v0(g6.F8, c6Var);
        this.f22970s = PorterDuff.Mode.MULTIPLY;
        this.v = g6.v0(g6.I5, c6Var);
        i();
        setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        ?? imageView = new ImageView(context);
        this.f22965c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(this.f22969r, PorterDuff.Mode.SRC_IN));
        addView((View) imageView, i7.f6.e(-2, 40, (LocaleController.isRTL ? 5 : 3) | 16));
        org.telegram.ui.Components.x5 x5Var = new org.telegram.ui.Components.x5(context);
        this.f22963a = x5Var;
        x5Var.setLines(1);
        x5Var.setSingleLine(true);
        x5Var.setGravity(3);
        x5Var.setEllipsize(TextUtils.TruncateAt.END);
        x5Var.setTextColor(this.f22968n);
        x5Var.setTextSize(1, 16.0f);
        addView(x5Var, i7.f6.e(-2, -2, (LocaleController.isRTL ? 5 : 3) | 16));
        this.d = LocaleController.isRTL;
        a(i10);
    }
}
