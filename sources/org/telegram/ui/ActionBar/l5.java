package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.Stack;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.em;
import org.telegram.ui.Cells.r6;
import org.telegram.ui.Components.sz;
import org.telegram.ui.Components.uw0;
import org.telegram.ui.Components.ww0;
import org.telegram.ui.q11;
public class l5 extends View implements Drawable.Callback {
    public final Path A0;
    public boolean B0;
    public boolean C0;
    public View.OnClickListener D0;
    public String E;
    public boolean E0;
    public int F;
    public float F0;
    public float G;
    public float G0;
    public float H;
    public org.telegram.ui.Components.u5 H0;
    public int I;
    public int I0;
    public int J;
    public PorterDuffColorFilter J0;
    public int K;
    public boolean K0;
    public boolean L;
    public Layout.Alignment L0;
    public float M;
    public boolean N;
    public Drawable O;
    public boolean P;
    public boolean Q;
    public float R;
    public long S;
    public int T;
    public Paint U;
    public Paint V;
    public Paint W;
    public float f18419a;
    public int f18420a0;
    public float f18421b;
    public int f18422b0;
    public StaticLayout f18423c;
    public int f18424c0;
    public StaticLayout d;
    public int f18425d0;
    public StaticLayout e;
    public int f18426e0;
    public StaticLayout f18427f;
    public int f18428f0;
    public int f18429g0;
    public final TextPaint h;
    public int f18430h0;
    public int f18431i0;
    public boolean f18432j0;
    public boolean f18433k0;
    public boolean f18434l0;
    public boolean m0;
    public int f18435n;
    public boolean f18436n0;
    public boolean f18437o0;
    public Boolean f18438p0;
    public int f18439q0;
    public int f18440r;
    public int f18441r0;
    public CharSequence f18442s;
    public int f18443s0;
    public int f18444t0;
    public int f18445u0;
    public Drawable v;
    public float f18446v0;
    public Drawable f18447w;
    public int f18448w0;
    public Drawable f18449x;
    public int f18450x0;
    public Drawable f18451y;
    public final ArrayList f18452y0;
    public final Stack f18453z0;

    public l5(Context context) {
        super(context);
        this.f18435n = 51;
        this.f18440r = 1;
        this.H = 1.0f;
        this.I = AndroidUtilities.dp(4.0f);
        this.f18439q0 = 16;
        this.f18450x0 = 3;
        this.f18452y0 = new ArrayList();
        this.f18453z0 = new Stack();
        this.A0 = new Path();
        this.I0 = 0;
        this.L0 = Layout.Alignment.ALIGN_NORMAL;
        this.h = new TextPaint(1);
        setImportantForAccessibility(1);
    }

    private Layout.Alignment getAlignment() {
        return this.L0;
    }

    public final void a(int i10) {
        int i11;
        StaticLayout staticLayout = this.f18423c;
        if (staticLayout == null) {
            return;
        }
        if (staticLayout.getLineCount() > 0) {
            this.f18426e0 = (int) Math.max(Math.ceil(this.f18423c.getLineWidth(0)), Math.ceil(this.f18423c.getLineRight(0) - this.f18423c.getLineLeft(0)));
            StaticLayout staticLayout2 = this.e;
            boolean z10 = true;
            if (staticLayout2 != null) {
                this.f18429g0 = staticLayout2.getLineBottom(staticLayout2.getLineCount() - 1);
            } else if (this.f18440r > 1 && this.f18423c.getLineCount() > 0) {
                StaticLayout staticLayout3 = this.f18423c;
                this.f18429g0 = staticLayout3.getLineBottom(staticLayout3.getLineCount() - 1);
            } else {
                this.f18429g0 = this.f18423c.getLineBottom(0);
            }
            int i12 = this.f18435n & 7;
            if (i12 == 1) {
                this.f18424c0 = ((i10 - this.f18426e0) / 2) - ((int) this.f18423c.getLineLeft(0));
            } else if (i12 == 3) {
                StaticLayout staticLayout4 = this.d;
                if (staticLayout4 != null) {
                    this.f18424c0 = -((int) staticLayout4.getLineLeft(0));
                } else {
                    this.f18424c0 = -((int) this.f18423c.getLineLeft(0));
                }
            } else if (this.f18423c.getLineLeft(0) == 0.0f) {
                StaticLayout staticLayout5 = this.d;
                if (staticLayout5 != null) {
                    this.f18424c0 = (int) (i10 - staticLayout5.getLineWidth(0));
                } else {
                    this.f18424c0 = i10 - this.f18426e0;
                }
            } else {
                this.f18424c0 = -AndroidUtilities.dp(8.0f);
            }
            this.f18424c0 = getPaddingLeft() + this.f18424c0;
            if (this.m0) {
                Drawable drawable = this.f18447w;
                if (drawable != null && !this.f18434l0) {
                    i11 = (int) (drawable.getIntrinsicWidth() * this.H);
                } else {
                    i11 = 0;
                }
                Drawable drawable2 = this.f18449x;
                if (drawable2 != null && !this.f18434l0) {
                    i11 += (int) (drawable2.getIntrinsicWidth() * this.H);
                }
            } else {
                i11 = 0;
            }
            if (this.f18426e0 + i11 <= i10 - this.f18441r0) {
                z10 = false;
            }
            this.Q = z10;
            b();
            StaticLayout staticLayout6 = this.e;
            if (staticLayout6 != null && this.f18444t0 > 0) {
                this.f18446v0 = staticLayout6.getPrimaryHorizontal(0) - this.d.getPrimaryHorizontal(0);
            }
        }
        int i13 = this.F;
        if (i13 >= 0) {
            this.G = this.f18423c.getPrimaryHorizontal(i13);
        } else {
            this.G = 0.0f;
        }
    }

    public final void b() {
        int i10;
        if ((this.P && (this.Q || this.R != 0.0f)) || this.f18436n0) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        if (getLayerType() != i10) {
            setLayerType(i10, null);
            invalidate();
        }
    }

    public final void c(Canvas canvas) {
        ArrayList arrayList = this.f18452y0;
        if (arrayList.isEmpty()) {
            return;
        }
        Path path = this.A0;
        path.rewind();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            Rect bounds = ((uh.h) arrayList.get(i10)).getBounds();
            path.addRect(bounds.left, bounds.top, bounds.right, bounds.bottom, Path.Direction.CW);
            i10 = i11;
        }
        canvas.clipPath(path, Region.Op.DIFFERENCE);
    }

    public void d(int i10) {
        int i11;
        int i12;
        int i13;
        CharSequence charSequence;
        int dp;
        CharSequence charSequence2;
        int i14;
        int dp2;
        CharSequence charSequence3;
        int dp3;
        int dp4;
        int dp5;
        Drawable drawable;
        Drawable drawable2;
        Stack stack = this.f18453z0;
        ArrayList arrayList = this.f18452y0;
        CharSequence charSequence4 = this.f18442s;
        this.F = -1;
        this.C0 = false;
        if (charSequence4 != null) {
            try {
                Drawable drawable3 = this.v;
                if (drawable3 != null && !this.f18433k0) {
                    drawable3.getIntrinsicWidth();
                    i11 = (i10 - this.v.getIntrinsicWidth()) - this.I;
                } else {
                    i11 = i10;
                }
                if (!this.m0) {
                    if (this.f18447w != null && !this.f18434l0) {
                        i12 = (int) (drawable.getIntrinsicWidth() * this.H);
                        i11 = (i11 - i12) - this.I;
                    } else {
                        i12 = 0;
                    }
                    if (this.f18449x != null && !this.f18434l0) {
                        i12 += (int) (drawable2.getIntrinsicWidth() * this.H);
                        i11 = (i11 - i12) - this.I;
                    }
                } else {
                    i12 = 0;
                }
                SpannableStringBuilder spannableStringBuilder = charSequence4;
                if (this.E != null) {
                    spannableStringBuilder = charSequence4;
                    if (this.f18451y != null) {
                        int indexOf = charSequence4.toString().indexOf(this.E);
                        this.F = indexOf;
                        if (indexOf >= 0) {
                            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence4);
                            org.telegram.ui.Cells.p2 p2Var = new org.telegram.ui.Cells.p2(this.f18451y.getIntrinsicWidth());
                            int i15 = this.F;
                            valueOf.setSpan(p2Var, i15, this.E.length() + i15, 0);
                            spannableStringBuilder = valueOf;
                        } else {
                            i11 = (i11 - this.f18451y.getIntrinsicWidth()) - this.I;
                            spannableStringBuilder = charSequence4;
                        }
                    }
                }
                CharSequence charSequence5 = spannableStringBuilder;
                boolean z10 = this.B0;
                TextPaint textPaint = this.h;
                if (z10 && i12 != 0 && !this.f18434l0 && !charSequence5.equals(TextUtils.ellipsize(charSequence5, textPaint, i11, TextUtils.TruncateAt.END))) {
                    this.C0 = true;
                    i11 = i11 + i12 + this.I;
                }
                int i16 = i11;
                if (this.L) {
                    if (!this.f18436n0) {
                        charSequence2 = TextUtils.ellipsize(charSequence5, textPaint, i16, TextUtils.TruncateAt.END);
                    } else {
                        charSequence2 = charSequence5;
                    }
                    if (!this.f18436n0 && !charSequence2.equals(charSequence5)) {
                        Layout.Alignment alignment = getAlignment();
                        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                        StaticLayout c10 = uw0.c(charSequence5, textPaint, i16, alignment, 0.0f, false, truncateAt, i16, this.f18450x0, false);
                        i14 = i16;
                        this.e = c10;
                        if (c10 != null) {
                            int lineEnd = c10.getLineEnd(0);
                            int lineStart = this.e.getLineStart(1);
                            CharSequence subSequence = charSequence5.subSequence(0, lineEnd);
                            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(charSequence5);
                            valueOf2.setSpan(new sz(false), 0, lineStart, 0);
                            if (lineEnd < charSequence2.length()) {
                                charSequence3 = charSequence2.subSequence(lineEnd, charSequence2.length());
                            } else {
                                charSequence3 = "…";
                            }
                            int length = charSequence2.length();
                            if (this.P) {
                                dp3 = AndroidUtilities.dp(2000.0f);
                            } else {
                                dp3 = i14 + AndroidUtilities.dp(8.0f);
                            }
                            this.d = new StaticLayout(charSequence2, 0, length, textPaint, dp3, getAlignment(), 1.0f, 0.0f, false);
                            int length2 = subSequence.length();
                            if (this.P) {
                                dp4 = AndroidUtilities.dp(2000.0f);
                            } else {
                                dp4 = i14 + AndroidUtilities.dp(8.0f);
                            }
                            StaticLayout staticLayout = new StaticLayout(subSequence, 0, length2, textPaint, dp4, getAlignment(), 1.0f, 0.0f, false);
                            this.f18423c = staticLayout;
                            String str = charSequence3;
                            if (staticLayout.getLineLeft(0) != 0.0f) {
                                str = "\u200f" + ((Object) charSequence3);
                            }
                            CharSequence charSequence6 = str;
                            int length3 = charSequence6.length();
                            if (this.P) {
                                dp5 = AndroidUtilities.dp(2000.0f);
                            } else {
                                dp5 = i14 + AndroidUtilities.dp(8.0f);
                            }
                            this.f18427f = new StaticLayout(charSequence6, 0, length3, textPaint, dp5, getAlignment(), 1.0f, 0.0f, false);
                            this.e = uw0.c(valueOf2, textPaint, i14 + AndroidUtilities.dp(8.0f) + this.f18444t0, getAlignment(), 0.0f, false, truncateAt, i14 + this.f18444t0, this.f18450x0, false);
                        }
                    } else {
                        i14 = i16;
                        CharSequence charSequence7 = charSequence2;
                        int length4 = charSequence7.length();
                        if (!this.P && !this.f18436n0) {
                            dp2 = i14 + AndroidUtilities.dp(8.0f);
                            this.f18423c = new StaticLayout(charSequence7, 0, length4, textPaint, dp2, getAlignment(), 1.0f, 0.0f, false);
                            this.e = null;
                            this.f18427f = null;
                            this.d = null;
                        }
                        dp2 = AndroidUtilities.dp(2000.0f);
                        this.f18423c = new StaticLayout(charSequence7, 0, length4, textPaint, dp2, getAlignment(), 1.0f, 0.0f, false);
                        this.e = null;
                        this.f18427f = null;
                        this.d = null;
                    }
                    i13 = i14;
                } else if (this.f18440r > 1) {
                    StaticLayout c11 = uw0.c(charSequence5, textPaint, i16, getAlignment(), 0.0f, false, TextUtils.TruncateAt.END, i16, this.f18440r, false);
                    i13 = i16;
                    this.f18423c = c11;
                } else {
                    i13 = i16;
                    if (!this.P && !this.f18436n0) {
                        charSequence = TextUtils.ellipsize(charSequence5, textPaint, i13, TextUtils.TruncateAt.END);
                        int length5 = charSequence.length();
                        if (!this.P && !this.f18436n0) {
                            dp = AndroidUtilities.dp(8.0f) + i13;
                            this.f18423c = new StaticLayout(charSequence, 0, length5, textPaint, dp, getAlignment(), 1.0f, 0.0f, false);
                        }
                        dp = AndroidUtilities.dp(2000.0f);
                        this.f18423c = new StaticLayout(charSequence, 0, length5, textPaint, dp, getAlignment(), 1.0f, 0.0f, false);
                    }
                    charSequence = charSequence5;
                    int length52 = charSequence.length();
                    if (!this.P) {
                        dp = AndroidUtilities.dp(8.0f) + i13;
                        this.f18423c = new StaticLayout(charSequence, 0, length52, textPaint, dp, getAlignment(), 1.0f, 0.0f, false);
                    }
                    dp = AndroidUtilities.dp(2000.0f);
                    this.f18423c = new StaticLayout(charSequence, 0, length52, textPaint, dp, getAlignment(), 1.0f, 0.0f, false);
                }
                stack.addAll(arrayList);
                arrayList.clear();
                StaticLayout staticLayout2 = this.f18423c;
                if (staticLayout2 != null && (staticLayout2.getText() instanceof Spannable)) {
                    uh.h.b(this, this.f18423c, -2, -2, stack, arrayList);
                }
                a(i13);
            } catch (Exception unused) {
            }
        } else {
            this.f18423c = null;
            this.f18426e0 = 0;
            this.f18429g0 = 0;
        }
        org.telegram.ui.Components.y5.release(this, this.H0);
        if (this.K0) {
            this.H0 = org.telegram.ui.Components.y5.update(this.I0, this, this.H0, this.f18423c);
        }
        invalidate();
    }

    public final void e(Canvas canvas) {
        float f7 = this.M;
        int i10 = 0;
        ArrayList arrayList = this.f18452y0;
        if (f7 > 0.0f && this.f18445u0 != 0) {
            canvas.save();
            float f10 = this.M;
            canvas.translate((this.f18446v0 * f10) + ((-this.f18445u0) * f10), 0.0f);
            float f11 = this.f18419a;
            float f12 = this.M;
            this.f18419a = r6.a(this.f18446v0, f12, (-this.f18445u0) * f12, f11);
            canvas.save();
            c(canvas);
            org.telegram.ui.Components.u5 u5Var = this.H0;
            if (u5Var != null) {
                u5Var.a();
            }
            this.f18423c.draw(canvas);
            canvas.restore();
            org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas, this.f18423c, this.H0, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.J0);
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((uh.h) obj).draw(canvas);
            }
            canvas.restore();
            return;
        }
        canvas.save();
        c(canvas);
        org.telegram.ui.Components.u5 u5Var2 = this.H0;
        if (u5Var2 != null) {
            u5Var2.a();
        }
        this.f18423c.draw(canvas);
        canvas.restore();
        org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas, this.f18423c, this.H0, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.J0);
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            ((uh.h) obj2).draw(canvas);
        }
    }

    public final boolean f() {
        if (this.f18432j0 && getMeasuredHeight() != 0 && !this.L) {
            d(((getMaxTextWidth() - getPaddingLeft()) - getPaddingRight()) - this.f18448w0);
            if ((this.f18435n & 112) == 16) {
                this.f18425d0 = (getMeasuredHeight() - this.f18429g0) / 2;
                return true;
            }
            this.f18425d0 = getPaddingTop();
            return true;
        }
        requestLayout();
        return true;
    }

    public final void g(ww0 ww0Var, String str) {
        Drawable drawable = this.f18451y;
        if (drawable == ww0Var) {
            return;
        }
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f18451y = ww0Var;
        if (ww0Var != null) {
            ww0Var.setCallback(this);
        }
        f();
        this.E = str;
    }

    @Override
    public Drawable getBackground() {
        Drawable drawable = this.O;
        if (drawable != null) {
            return drawable;
        }
        return super.getBackground();
    }

    public float getExactWidth() {
        int i10;
        float measureText = getPaint().measureText(getText().toString()) + getSideDrawablesSize();
        if (this.v == null && this.f18447w == null && this.f18449x == null) {
            i10 = 0;
        } else {
            i10 = this.I;
        }
        return measureText - i10;
    }

    public float getExactWidthIncludeDrawables() {
        int i10;
        int i11;
        float exactWidth = getExactWidth();
        Drawable drawable = this.v;
        int i12 = 0;
        if (drawable != null) {
            i10 = drawable.getIntrinsicWidth();
        } else {
            i10 = 0;
        }
        float f7 = exactWidth + i10;
        Drawable drawable2 = this.f18447w;
        if (drawable2 != null) {
            i11 = drawable2.getIntrinsicWidth();
        } else {
            i11 = 0;
        }
        float f10 = f7 + i11;
        Drawable drawable3 = this.f18449x;
        if (drawable3 != null) {
            i12 = drawable3.getIntrinsicWidth();
        }
        return f10 + i12;
    }

    public float getFullAlpha() {
        return this.M;
    }

    public Layout getLayout() {
        return this.f18423c;
    }

    public float getLayoutX() {
        return this.f18419a;
    }

    public float getLayoutY() {
        return this.f18421b;
    }

    public Drawable getLeftDrawable() {
        return this.v;
    }

    public int getLineCount() {
        int i10;
        StaticLayout staticLayout = this.f18423c;
        if (staticLayout != null) {
            i10 = staticLayout.getLineCount();
        } else {
            i10 = 0;
        }
        StaticLayout staticLayout2 = this.e;
        if (staticLayout2 != null) {
            return staticLayout2.getLineCount() + i10;
        }
        return i10;
    }

    public int getMaxTextWidth() {
        int i10;
        Drawable drawable;
        Drawable drawable2;
        int measuredWidth = getMeasuredWidth();
        int i11 = 0;
        if (this.f18434l0 && (drawable2 = this.f18447w) != null) {
            i10 = drawable2.getIntrinsicWidth() + this.I;
        } else {
            i10 = 0;
        }
        int i12 = measuredWidth - i10;
        if (this.f18434l0 && (drawable = this.f18449x) != null) {
            i11 = this.I + drawable.getIntrinsicWidth();
        }
        return i12 - i11;
    }

    public TextPaint getPaint() {
        return this.h;
    }

    public Drawable getRightDrawable() {
        return this.f18447w;
    }

    public Drawable getRightDrawable2() {
        return this.f18449x;
    }

    public boolean getRightDrawableOutside() {
        return this.f18434l0;
    }

    public int getRightDrawableWidth() {
        Drawable drawable = this.f18447w;
        if (drawable == null) {
            return 0;
        }
        return (int) ((drawable.getIntrinsicWidth() * this.H) + this.I);
    }

    public int getRightDrawableX() {
        return this.f18430h0;
    }

    public int getRightDrawableY() {
        return this.f18431i0;
    }

    public int getSideDrawablesSize() {
        int i10;
        Drawable drawable = this.v;
        if (drawable != null) {
            i10 = drawable.getIntrinsicWidth() + this.I;
        } else {
            i10 = 0;
        }
        Drawable drawable2 = this.f18447w;
        if (drawable2 != null) {
            i10 += ((int) (drawable2.getIntrinsicWidth() * this.H)) + this.I;
        }
        Drawable drawable3 = this.f18449x;
        if (drawable3 != null) {
            return ((int) (drawable3.getIntrinsicWidth() * this.H)) + this.I + i10;
        }
        return i10;
    }

    public CharSequence getText() {
        CharSequence charSequence = this.f18442s;
        if (charSequence == null) {
            return "";
        }
        return charSequence;
    }

    public int getTextColor() {
        return this.h.getColor();
    }

    public int getTextHeight() {
        return this.f18429g0;
    }

    public TextPaint getTextPaint() {
        return this.h;
    }

    public int getTextStartX() {
        int i10 = 0;
        if (this.f18423c == null) {
            return 0;
        }
        Drawable drawable = this.v;
        if (drawable != null && (this.f18435n & 7) == 3) {
            i10 = this.I + drawable.getIntrinsicWidth();
        }
        Drawable drawable2 = this.f18451y;
        if (drawable2 != null && this.F < 0 && (this.f18435n & 7) == 3) {
            i10 += drawable2.getIntrinsicWidth() + this.I;
        }
        return ((int) getX()) + this.f18424c0 + i10;
    }

    public int getTextStartY() {
        if (this.f18423c == null) {
            return 0;
        }
        return (int) getY();
    }

    public int getTextWidth() {
        int i10;
        int i11 = this.f18426e0;
        int i12 = 0;
        if (this.m0) {
            Drawable drawable = this.f18447w;
            if (drawable != null) {
                i10 = (int) (drawable.getIntrinsicWidth() * this.H);
            } else {
                i10 = 0;
            }
            Drawable drawable2 = this.f18449x;
            if (drawable2 != null) {
                i12 = (int) (drawable2.getIntrinsicWidth() * this.H);
            }
            i12 += i10;
        }
        return i11 + i12;
    }

    public final void h(int i10, int i11) {
        if (this.f18444t0 == i10 && this.f18445u0 == i11) {
            return;
        }
        this.f18444t0 = i10;
        this.f18445u0 = i11;
        d(((getMaxTextWidth() - getPaddingLeft()) - getPaddingRight()) - this.f18448w0);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final boolean i(Drawable drawable) {
        Drawable drawable2 = this.f18447w;
        if (drawable2 == drawable) {
            return false;
        }
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f18447w = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        f();
        return true;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = this.v;
        if (drawable == drawable2) {
            invalidate(drawable2.getBounds());
            return;
        }
        Drawable drawable3 = this.f18447w;
        if (drawable == drawable3) {
            invalidate(drawable3.getBounds());
            return;
        }
        Drawable drawable4 = this.f18449x;
        if (drawable == drawable4) {
            invalidate(drawable4.getBounds());
            return;
        }
        Drawable drawable5 = this.f18451y;
        if (drawable == drawable5) {
            invalidate(drawable5.getBounds());
        }
    }

    public final boolean j(Drawable drawable) {
        Drawable drawable2 = this.f18449x;
        if (drawable2 == drawable) {
            return false;
        }
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f18449x = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        f();
        return true;
    }

    public boolean k(CharSequence charSequence) {
        return l(charSequence, false);
    }

    public boolean l(CharSequence charSequence, boolean z10) {
        CharSequence charSequence2 = this.f18442s;
        if (charSequence2 != null || charSequence != null) {
            if (!z10 && charSequence2 != null && charSequence2.equals(charSequence)) {
                return false;
            }
            this.f18442s = charSequence;
            this.T = 500;
            f();
            return true;
        }
        return false;
    }

    public final void m() {
        boolean z10;
        if ((this.U == null || this.V == null) && this.P) {
            Paint paint = new Paint();
            this.U = paint;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(6.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, tileMode));
            Paint paint2 = this.U;
            PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
            paint2.setXfermode(new PorterDuffXfermode(mode));
            Paint paint3 = new Paint();
            this.V = paint3;
            paint3.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(6.0f), 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
            this.V.setXfermode(new PorterDuffXfermode(mode));
        }
        Boolean bool = this.f18438p0;
        if (bool != null) {
            z10 = bool.booleanValue();
        } else {
            z10 = false;
        }
        if ((this.W == null || this.f18420a0 != AndroidUtilities.dp(this.f18439q0) || this.f18437o0 != z10) && this.f18436n0) {
            if (this.W == null) {
                this.W = new Paint();
            }
            this.f18437o0 = z10;
            if (z10) {
                Paint paint4 = this.W;
                int dp = AndroidUtilities.dp(this.f18439q0);
                this.f18420a0 = dp;
                paint4.setShader(new LinearGradient(0.0f, 0.0f, dp, 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            } else {
                Paint paint5 = this.W;
                int dp2 = AndroidUtilities.dp(this.f18439q0);
                this.f18420a0 = dp2;
                paint5.setShader(new LinearGradient(0.0f, 0.0f, dp2, 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            }
            this.W.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.K0 = true;
        this.H0 = org.telegram.ui.Components.y5.update(this.I0, this, this.H0, this.f18423c);
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.K0 = false;
        org.telegram.ui.Components.y5.release(this, this.H0);
        this.f18432j0 = false;
    }

    @Override
    public void onDraw(Canvas canvas) {
        boolean z10;
        int i10;
        Drawable drawable;
        float f7;
        float f10;
        int i11;
        Drawable drawable2;
        int C;
        int i12;
        int i13;
        int C2;
        int i14;
        int C3;
        int i15;
        float f11;
        float f12;
        float f13;
        Drawable drawable3;
        float f14;
        boolean z11;
        float f15;
        Drawable drawable4;
        int C4;
        int i16;
        int C5;
        int i17;
        float f16;
        float f17;
        Drawable drawable5;
        Drawable drawable6;
        Drawable drawable7;
        int C6;
        int i18;
        int C7;
        int i19;
        int intrinsicHeight;
        Drawable drawable8;
        int C8;
        int i20;
        int C9;
        int i21;
        int intrinsicHeight2;
        int intrinsicHeight3;
        super.onDraw(canvas);
        this.f18419a = 0.0f;
        this.f18421b = 0.0f;
        if (this.P && (this.Q || this.R != 0.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f18428f0 = this.f18426e0;
        Drawable drawable9 = this.v;
        if (drawable9 != null && !this.f18433k0) {
            int i22 = (int) (-this.R);
            int i23 = this.f18435n;
            if ((i23 & 7) == 1) {
                i22 += this.f18424c0;
            }
            if ((i23 & 112) == 16) {
                intrinsicHeight3 = ((getMeasuredHeight() - this.v.getIntrinsicHeight()) / 2) + this.J;
            } else {
                intrinsicHeight3 = this.J + ((this.f18429g0 - this.v.getIntrinsicHeight()) / 2) + getPaddingTop();
            }
            Drawable drawable10 = this.v;
            drawable10.setBounds(i22, intrinsicHeight3, drawable10.getIntrinsicWidth() + i22, this.v.getIntrinsicHeight() + intrinsicHeight3);
            this.v.draw(canvas);
            int i24 = this.f18435n & 7;
            if (i24 != 3 && i24 != 1) {
                i10 = 0;
            } else {
                i10 = this.v.getIntrinsicWidth() + this.I;
            }
            this.f18428f0 = this.v.getIntrinsicWidth() + this.I + this.f18428f0;
        } else if (this.f18433k0 && drawable9 != null) {
            i10 = this.I + drawable9.getIntrinsicWidth();
        } else {
            i10 = 0;
        }
        Drawable drawable11 = this.f18451y;
        if (drawable11 != null && this.E != null) {
            int i25 = (int) ((-this.R) + this.G);
            int i26 = this.f18435n;
            if ((i26 & 7) == 1) {
                i25 += this.f18424c0;
            }
            if ((i26 & 112) == 16) {
                intrinsicHeight2 = ((getMeasuredHeight() - this.f18451y.getIntrinsicHeight()) / 2) + this.J;
            } else {
                intrinsicHeight2 = this.J + ((this.f18429g0 - drawable11.getIntrinsicHeight()) / 2);
            }
            Drawable drawable12 = this.f18451y;
            drawable12.setBounds(i25, intrinsicHeight2, drawable12.getIntrinsicWidth() + i25, this.f18451y.getIntrinsicHeight() + intrinsicHeight2);
            this.f18451y.draw(canvas);
            if (this.F < 0) {
                int i27 = this.f18435n & 7;
                if (i27 == 3 || i27 == 1) {
                    i10 += this.f18451y.getIntrinsicWidth() + this.I;
                }
                this.f18428f0 = this.f18451y.getIntrinsicWidth() + this.I + this.f18428f0;
            }
        }
        int i28 = i10;
        if (this.f18447w != null && !this.C0 && this.H > 0.0f && !this.f18434l0 && !this.m0) {
            int i29 = this.f18426e0 + i28 + this.I + ((int) (-this.R));
            int i30 = this.f18435n & 7;
            if (i30 == 1 || i30 == 5) {
                i29 += this.f18424c0;
            }
            int intrinsicWidth = (int) (drawable.getIntrinsicWidth() * this.H);
            int intrinsicHeight4 = (int) (this.f18447w.getIntrinsicHeight() * this.H);
            if ((this.f18435n & 112) == 16) {
                C9 = (getMeasuredHeight() - intrinsicHeight4) / 2;
                i21 = this.K;
            } else {
                C9 = hc.b.C(this.f18429g0, intrinsicHeight4, 2, getPaddingTop());
                i21 = this.K;
            }
            int i31 = C9 + i21;
            f7 = 0.0f;
            this.f18447w.setBounds(i29, i31, i29 + intrinsicWidth, i31 + intrinsicHeight4);
            this.f18430h0 = i29 + (intrinsicWidth >> 1);
            this.f18431i0 = i31 + (intrinsicHeight4 >> 1);
            this.f18447w.draw(canvas);
            this.f18428f0 = this.I + intrinsicWidth + this.f18428f0;
        } else {
            f7 = 0.0f;
        }
        if (this.f18449x != null && !this.C0 && this.H > f7 && !this.f18434l0 && !this.m0) {
            int i32 = this.f18426e0 + i28 + this.I + ((int) (-this.R));
            if (this.f18447w != null) {
                i32 += ((int) (drawable8.getIntrinsicWidth() * this.H)) + this.I;
            }
            int i33 = this.f18435n & 7;
            if (i33 == 1 || i33 == 5) {
                i32 += this.f18424c0;
            }
            int intrinsicWidth2 = (int) (this.f18449x.getIntrinsicWidth() * this.H);
            int intrinsicHeight5 = (int) (this.f18449x.getIntrinsicHeight() * this.H);
            if ((this.f18435n & 112) == 16) {
                C8 = (getMeasuredHeight() - intrinsicHeight5) / 2;
                i20 = this.K;
            } else {
                C8 = hc.b.C(this.f18429g0, intrinsicHeight5, 2, getPaddingTop());
                i20 = this.K;
            }
            int i34 = C8 + i20;
            this.f18449x.setBounds(i32, i34, i32 + intrinsicWidth2, intrinsicHeight5 + i34);
            this.f18449x.draw(canvas);
            this.f18428f0 = this.I + intrinsicWidth2 + this.f18428f0;
        }
        int dp = AndroidUtilities.dp(16.0f) + this.f18428f0;
        float f18 = this.R;
        if (f18 != f7) {
            if (this.v != null && !this.f18433k0) {
                int i35 = ((int) (-f18)) + dp;
                if ((this.f18435n & 112) == 16) {
                    intrinsicHeight = ((getMeasuredHeight() - this.v.getIntrinsicHeight()) / 2) + this.J;
                } else {
                    intrinsicHeight = this.J + ((this.f18429g0 - this.v.getIntrinsicHeight()) / 2) + getPaddingTop();
                }
                Drawable drawable13 = this.v;
                drawable13.setBounds(i35, intrinsicHeight, drawable13.getIntrinsicWidth() + i35, this.v.getIntrinsicHeight() + intrinsicHeight);
                this.v.draw(canvas);
            }
            if (this.f18447w != null && !this.f18434l0) {
                int intrinsicWidth3 = (int) (drawable5.getIntrinsicWidth() * this.H);
                int intrinsicHeight6 = (int) (this.f18447w.getIntrinsicHeight() * this.H);
                int i36 = this.f18426e0 + i28 + this.I + ((int) (-this.R)) + dp;
                if ((this.f18435n & 112) == 16) {
                    C7 = (getMeasuredHeight() - intrinsicHeight6) / 2;
                    i19 = this.K;
                } else {
                    C7 = hc.b.C(this.f18429g0, intrinsicHeight6, 2, getPaddingTop());
                    i19 = this.K;
                }
                int i37 = C7 + i19;
                f10 = 16.0f;
                this.f18447w.setBounds(i36, i37, i36 + intrinsicWidth3, i37 + intrinsicHeight6);
                this.f18430h0 = i36 + (intrinsicWidth3 >> 1);
                this.f18431i0 = i37 + (intrinsicHeight6 >> 1);
                this.f18447w.draw(canvas);
            } else {
                f10 = 16.0f;
            }
            if (this.f18449x != null && !this.f18434l0) {
                int intrinsicWidth4 = (int) (drawable6.getIntrinsicWidth() * this.H);
                int intrinsicHeight7 = (int) (this.f18449x.getIntrinsicHeight() * this.H);
                int i38 = this.f18426e0 + i28 + this.I + ((int) (-this.R)) + dp;
                if (this.f18447w != null) {
                    i38 += ((int) (drawable7.getIntrinsicWidth() * this.H)) + this.I;
                }
                if ((this.f18435n & 112) == 16) {
                    C6 = (getMeasuredHeight() - intrinsicHeight7) / 2;
                    i18 = this.K;
                } else {
                    C6 = hc.b.C(this.f18429g0, intrinsicHeight7, 2, getPaddingTop());
                    i18 = this.K;
                }
                int i39 = C6 + i18;
                this.f18449x.setBounds(i38, i39, intrinsicWidth4 + i38, intrinsicHeight7 + i39);
                this.f18449x.draw(canvas);
            }
        } else {
            f10 = 16.0f;
        }
        if (this.f18423c != null) {
            if (this.f18433k0 || this.f18434l0 || this.f18436n0 || this.f18441r0 > 0) {
                canvas.save();
                int maxTextWidth = getMaxTextWidth() - this.f18441r0;
                Drawable drawable14 = this.f18447w;
                if (drawable14 != null && !(drawable14 instanceof org.telegram.ui.Components.n5) && this.f18434l0) {
                    f11 = 2.0f;
                } else {
                    f11 = 0.0f;
                }
                canvas.clipRect(i28, 0, maxTextWidth - AndroidUtilities.dp(f11), getMeasuredHeight());
            }
            Emoji.emojiDrawingUseAlpha = false;
            if (this.O != null) {
                int i40 = this.f18426e0;
                int i41 = (i40 / 2) + ((int) ((this.f18424c0 + i28) - this.R));
                int max = Math.max(getPaddingRight() + getPaddingLeft() + i40, this.f18443s0);
                int i42 = i41 - (max / 2);
                this.O.setBounds(i42, 0, max + i42, getMeasuredHeight());
                this.O.draw(canvas);
            }
            if (this.f18424c0 + i28 != 0 || this.f18425d0 != 0 || this.R != f7) {
                canvas.save();
                canvas.translate((this.f18424c0 + i28) - this.R, this.f18425d0);
                this.f18419a = ((this.f18424c0 + i28) - this.R) + this.f18419a;
                this.f18421b += this.f18425d0;
            }
            e(canvas);
            StaticLayout staticLayout = this.f18427f;
            TextPaint textPaint = this.h;
            if (staticLayout != null && this.M < 1.0f) {
                int alpha = textPaint.getAlpha();
                textPaint.setAlpha((int) ((1.0f - this.M) * 255.0f));
                canvas.save();
                if (this.f18427f.getText().length() == 1) {
                    if (this.f18450x0 == 1) {
                        f17 = 0.5f;
                    } else {
                        f17 = 4.0f;
                    }
                    f16 = AndroidUtilities.dp(f17);
                } else {
                    f16 = 0.0f;
                }
                if (this.f18423c.getLineLeft(0) != f7) {
                    canvas.translate((-this.f18423c.getLineWidth(0)) + f16, 0.0f);
                    f12 = 0.0f;
                } else {
                    f12 = 0.0f;
                    canvas.translate(this.f18423c.getLineWidth(0) - f16, 0.0f);
                }
                float f19 = this.M;
                canvas.translate((this.f18446v0 * f19) + ((-this.f18445u0) * f19), f12);
                this.f18427f.draw(canvas);
                canvas.restore();
                textPaint.setAlpha(alpha);
            } else {
                f12 = 0.0f;
            }
            if (this.e != null && this.M > f12) {
                int alpha2 = textPaint.getAlpha();
                textPaint.setAlpha((int) (this.M * 255.0f));
                float f20 = this.M;
                float f21 = this.f18446v0;
                float f22 = ((f20 * f21) + ((-this.f18445u0) * f20)) - f21;
                f13 = 0.0f;
                canvas.translate(f22, 0.0f);
                this.e.draw(canvas);
                textPaint.setAlpha(alpha2);
            } else {
                f13 = 0.0f;
            }
            if (this.R != f13) {
                canvas.translate(dp, f13);
                e(canvas);
            }
            if (this.f18424c0 + i28 != 0 || this.f18425d0 != 0 || this.R != f13) {
                canvas.restore();
            }
            if (this.f18447w != null && !this.C0 && this.H > 0.0f && !this.f18434l0 && this.m0) {
                int i43 = this.f18426e0 + i28 + this.I + ((int) (-this.R));
                int i44 = this.f18435n & 7;
                if (i44 == 1 || i44 == 5) {
                    i43 += this.f18424c0;
                }
                int intrinsicWidth5 = (int) (drawable3.getIntrinsicWidth() * this.H);
                int intrinsicHeight8 = (int) (this.f18447w.getIntrinsicHeight() * this.H);
                if ((this.f18435n & 112) == 16) {
                    C5 = (getMeasuredHeight() - intrinsicHeight8) / 2;
                    i17 = this.K;
                } else {
                    C5 = hc.b.C(this.f18429g0, intrinsicHeight8, 2, getPaddingTop());
                    i17 = this.K;
                }
                int i45 = C5 + i17;
                this.f18447w.setBounds(i43, i45, i43 + intrinsicWidth5, i45 + intrinsicHeight8);
                this.f18430h0 = i43 + (intrinsicWidth5 >> 1);
                this.f18431i0 = i45 + (intrinsicHeight8 >> 1);
                this.f18447w.draw(canvas);
                this.f18428f0 = this.I + intrinsicWidth5 + this.f18428f0;
            }
            if (this.f18449x != null && !this.C0 && this.H > 0.0f && !this.f18434l0 && this.m0) {
                int i46 = this.f18426e0 + i28 + this.I + ((int) (-this.R));
                if (this.f18447w != null) {
                    i46 += ((int) (drawable4.getIntrinsicWidth() * this.H)) + this.I;
                }
                int i47 = this.f18435n & 7;
                if (i47 == 1 || i47 == 5) {
                    i46 += this.f18424c0;
                }
                int intrinsicWidth6 = (int) (this.f18449x.getIntrinsicWidth() * this.H);
                int intrinsicHeight9 = (int) (this.f18449x.getIntrinsicHeight() * this.H);
                if ((this.f18435n & 112) == 16) {
                    C4 = (getMeasuredHeight() - intrinsicHeight9) / 2;
                    i16 = this.K;
                } else {
                    C4 = hc.b.C(this.f18429g0, intrinsicHeight9, 2, getPaddingTop());
                    i16 = this.K;
                }
                int i48 = C4 + i16;
                this.f18449x.setBounds(i46, i48, i46 + intrinsicWidth6, intrinsicHeight9 + i48);
                this.f18449x.draw(canvas);
                this.f18428f0 = this.I + intrinsicWidth6 + this.f18428f0;
            }
            if (z10) {
                if (this.R < AndroidUtilities.dp(10.0f)) {
                    this.U.setAlpha((int) ((this.R / AndroidUtilities.dp(10.0f)) * 255.0f));
                } else {
                    if (this.R > (AndroidUtilities.dp(f10) + this.f18428f0) - AndroidUtilities.dp(10.0f)) {
                        this.U.setAlpha((int) em.u(this.R - ((AndroidUtilities.dp(f10) + this.f18428f0) - AndroidUtilities.dp(10.0f)), AndroidUtilities.dp(10.0f), 1.0f, 255.0f));
                    } else {
                        this.U.setAlpha(255);
                    }
                }
                canvas.drawRect(i28, 0.0f, AndroidUtilities.dp(6.0f) + i28, getMeasuredHeight(), this.U);
                canvas.save();
                canvas.translate((getMaxTextWidth() - this.f18441r0) - AndroidUtilities.dp(6.0f), 0.0f);
                canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(6.0f), getMeasuredHeight(), this.V);
                canvas.restore();
            } else if (this.f18436n0 && this.Q && this.W != null) {
                canvas.save();
                m();
                if (!this.f18437o0) {
                    int maxTextWidth2 = (getMaxTextWidth() - this.f18441r0) - this.f18420a0;
                    Drawable drawable15 = this.f18447w;
                    if (drawable15 != null && !(drawable15 instanceof org.telegram.ui.Components.n5) && this.f18434l0) {
                        f14 = 2.0f;
                    } else {
                        f14 = 0.0f;
                    }
                    canvas.translate(maxTextWidth2 - AndroidUtilities.dp(f14), 0.0f);
                }
                canvas.drawRect(i28, 0.0f, this.f18420a0, getMeasuredHeight(), this.W);
                canvas.restore();
            }
            if (!this.P || (!this.Q && this.R == 0.0f)) {
                z11 = true;
            } else {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j3 = elapsedRealtime - this.S;
                if (j3 > 17) {
                    j3 = 17;
                }
                int i49 = this.T;
                if (i49 > 0) {
                    this.T = (int) (i49 - j3);
                    z11 = true;
                } else {
                    int dp2 = AndroidUtilities.dp(f10) + this.f18428f0;
                    if (this.R < AndroidUtilities.dp(100.0f)) {
                        f15 = a4.a.e(this.R, AndroidUtilities.dp(100.0f), 20.0f, 30.0f);
                        z11 = true;
                    } else {
                        z11 = true;
                        if (this.R >= dp2 - AndroidUtilities.dp(100.0f)) {
                            f15 = em.c(this.R - (dp2 - AndroidUtilities.dp(100.0f)), AndroidUtilities.dp(100.0f), 20.0f, 50.0f);
                        } else {
                            f15 = 50.0f;
                        }
                    }
                    float dp3 = ((((float) j3) / 1000.0f) * AndroidUtilities.dp(f15)) + this.R;
                    this.R = dp3;
                    this.S = elapsedRealtime;
                    if (dp3 > dp2) {
                        this.R = 0.0f;
                        this.T = 500;
                    }
                    b();
                }
                invalidate();
            }
            Emoji.emojiDrawingUseAlpha = z11;
            if (this.f18433k0 || this.f18434l0 || this.f18436n0 || this.f18441r0 > 0) {
                canvas.restore();
            }
        }
        Drawable drawable16 = this.v;
        if (drawable16 != null && this.f18433k0) {
            int intrinsicWidth7 = drawable16.getIntrinsicWidth();
            int intrinsicHeight10 = this.v.getIntrinsicHeight();
            if ((this.f18435n & 112) == 16) {
                C3 = (getMeasuredHeight() - intrinsicHeight10) / 2;
                i15 = this.J;
            } else {
                C3 = hc.b.C(this.f18429g0, intrinsicHeight10, 2, getPaddingTop());
                i15 = this.J;
            }
            int i50 = C3 + i15;
            this.v.setBounds(0, i50, intrinsicWidth7, intrinsicHeight10 + i50);
            this.v.draw(canvas);
        }
        if (this.f18447w != null && this.f18434l0) {
            int i51 = this.f18426e0 + i28 + this.I;
            float f23 = this.R;
            if (f23 == 0.0f) {
                i13 = -dp;
            } else {
                i13 = (int) (-f23);
            }
            int min = Math.min(i51 + i13 + dp, (getMaxTextWidth() - this.f18441r0) + this.I);
            int intrinsicWidth8 = (int) (this.f18447w.getIntrinsicWidth() * this.H);
            int intrinsicHeight11 = (int) (this.f18447w.getIntrinsicHeight() * this.H);
            if ((this.f18435n & 112) == 16) {
                C2 = (getMeasuredHeight() - intrinsicHeight11) / 2;
                i14 = this.K;
            } else {
                C2 = hc.b.C(this.f18429g0, intrinsicHeight11, 2, getPaddingTop());
                i14 = this.K;
            }
            int i52 = C2 + i14;
            this.f18447w.setBounds(min, i52, min + intrinsicWidth8, i52 + intrinsicHeight11);
            this.f18430h0 = min + (intrinsicWidth8 >> 1);
            this.f18431i0 = i52 + (intrinsicHeight11 >> 1);
            this.f18447w.draw(canvas);
        }
        if (this.f18449x != null && this.f18434l0) {
            int i53 = i28 + this.f18426e0 + this.I;
            float f24 = this.R;
            if (f24 == 0.0f) {
                i11 = -dp;
            } else {
                i11 = (int) (-f24);
            }
            int min2 = Math.min(i53 + i11 + dp, (getMaxTextWidth() - this.f18441r0) + this.I);
            if (this.f18447w != null) {
                min2 += ((int) (drawable2.getIntrinsicWidth() * this.H)) + this.I;
            }
            int intrinsicWidth9 = (int) (this.f18449x.getIntrinsicWidth() * this.H);
            int intrinsicHeight12 = (int) (this.f18449x.getIntrinsicHeight() * this.H);
            if ((this.f18435n & 112) == 16) {
                C = (getMeasuredHeight() - intrinsicHeight12) / 2;
                i12 = this.K;
            } else {
                C = hc.b.C(this.f18429g0, intrinsicHeight12, 2, getPaddingTop());
                i12 = this.K;
            }
            int i54 = C + i12;
            this.f18449x.setBounds(min2, i54, intrinsicWidth9 + min2, intrinsicHeight12 + i54);
            this.f18449x.draw(canvas);
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setVisibleToUser(true);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setText(this.f18442s);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f18432j0 = true;
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        Drawable drawable5;
        Drawable drawable6;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int i18 = this.f18422b0;
        int i19 = AndroidUtilities.displaySize.x;
        if (i18 != i19) {
            this.f18422b0 = i19;
            this.R = 0.0f;
            this.T = 500;
            b();
        }
        int paddingLeft = ((size - getPaddingLeft()) - getPaddingRight()) - this.f18448w0;
        if (this.f18433k0 && (drawable6 = this.v) != null) {
            i12 = drawable6.getIntrinsicWidth() + this.I;
        } else {
            i12 = 0;
        }
        int i20 = paddingLeft - i12;
        if (this.f18434l0 && (drawable5 = this.f18447w) != null) {
            i13 = drawable5.getIntrinsicWidth() + this.I;
        } else {
            i13 = 0;
        }
        int i21 = i20 - i13;
        if (this.f18434l0 && (drawable4 = this.f18449x) != null) {
            i14 = drawable4.getIntrinsicWidth() + this.I;
        } else {
            i14 = 0;
        }
        d(i21 - i14);
        if (View.MeasureSpec.getMode(i11) != 1073741824) {
            size2 = getPaddingBottom() + getPaddingTop() + this.f18429g0;
        }
        if (this.N) {
            int paddingRight = getPaddingRight() + getPaddingLeft() + this.f18426e0 + this.f18448w0;
            if (this.f18433k0 && (drawable3 = this.v) != null) {
                i15 = drawable3.getIntrinsicWidth() + this.I;
            } else {
                i15 = 0;
            }
            int i22 = paddingRight + i15;
            if (this.f18434l0 && (drawable2 = this.f18447w) != null) {
                i16 = drawable2.getIntrinsicWidth() + this.I;
            } else {
                i16 = 0;
            }
            int i23 = i22 + i16;
            if (this.f18434l0 && (drawable = this.f18449x) != null) {
                i17 = drawable.getIntrinsicWidth() + this.I;
            } else {
                i17 = 0;
            }
            size = Math.max(Math.min(size, i23 + i17), 0);
        }
        setMeasuredDimension(size, size2);
        if ((this.f18435n & 112) == 16) {
            this.f18425d0 = hc.b.C((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), this.f18429g0, 2, getPaddingTop());
        } else {
            this.f18425d0 = getPaddingTop();
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.D0 != null && this.f18447w != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(this.f18430h0 - AndroidUtilities.dp(16.0f), this.f18431i0 - AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f) + this.f18430h0, AndroidUtilities.dp(16.0f) + this.f18431i0);
            if (motionEvent.getAction() == 0 && rectF.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                this.E0 = true;
                this.F0 = motionEvent.getX();
                this.G0 = motionEvent.getY();
                getParent().requestDisallowInterceptTouchEvent(true);
                Drawable drawable = this.f18447w;
                if (drawable instanceof k5) {
                    ((q11) ((k5) drawable)).f35953f.c(true);
                }
            } else if (motionEvent.getAction() == 2 && this.E0) {
                if (Math.abs(motionEvent.getX() - this.F0) >= AndroidUtilities.touchSlop || Math.abs(motionEvent.getY() - this.G0) >= AndroidUtilities.touchSlop) {
                    this.E0 = false;
                    getParent().requestDisallowInterceptTouchEvent(false);
                    Drawable drawable2 = this.f18447w;
                    if (drawable2 instanceof k5) {
                        ((q11) ((k5) drawable2)).f35953f.c(false);
                    }
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (this.E0 && motionEvent.getAction() == 1) {
                    this.D0.onClick(this);
                    Drawable drawable3 = this.f18447w;
                    if (drawable3 instanceof k5) {
                        ((q11) ((k5) drawable3)).f35953f.c(false);
                    }
                }
                this.E0 = false;
                getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        if (super.onTouchEvent(motionEvent) || this.E0) {
            return true;
        }
        return false;
    }

    public void setAlignment(Layout.Alignment alignment) {
        this.L0 = alignment;
        requestLayout();
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f18440r > 1) {
            super.setBackgroundDrawable(drawable);
        } else {
            this.O = drawable;
        }
    }

    public void setBuildFullLayout(boolean z10) {
        this.L = z10;
    }

    public void setCanHideRightDrawable(boolean z10) {
        this.B0 = z10;
    }

    public void setDrawablePadding(int i10) {
        if (this.I == i10) {
            return;
        }
        this.I = i10;
        f();
    }

    public void setEllipsizeByGradient(int i10) {
        if (!this.P) {
            this.f18436n0 = true;
            this.f18438p0 = null;
            m();
            b();
        }
        this.f18439q0 = i10;
        m();
    }

    public void setEmojiCacheType(int i10) {
        if (i10 != this.I0) {
            org.telegram.ui.Components.y5.release(this, this.H0);
            this.I0 = i10;
            if (this.K0) {
                this.H0 = org.telegram.ui.Components.y5.update(i10, this, this.H0, this.f18423c);
            }
        }
    }

    public void setEmojiColor(int i10) {
        this.J0 = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
    }

    public void setFullAlpha(float f7) {
        this.M = f7;
        invalidate();
    }

    public void setFullTextMaxLines(int i10) {
        this.f18450x0 = i10;
    }

    public void setGravity(int i10) {
        this.f18435n = i10;
    }

    public void setLeftDrawable(int i10) {
        setLeftDrawable(i10 == 0 ? null : getContext().getResources().getDrawable(i10));
    }

    public void setLeftDrawableOutside(boolean z10) {
        this.f18433k0 = z10;
    }

    public void setLeftDrawableTopPadding(int i10) {
        this.J = i10;
    }

    public void setLinkTextColor(int i10) {
        this.h.linkColor = i10;
        invalidate();
    }

    public void setMaxLines(int i10) {
        this.f18440r = i10;
    }

    public void setMinWidth(int i10) {
        this.f18443s0 = i10;
    }

    public void setMinusWidth(int i10) {
        if (i10 == this.f18448w0) {
            return;
        }
        this.f18448w0 = i10;
        f();
    }

    public void setRightDrawable(int i10) {
        Drawable drawable;
        if (i10 == 0) {
            drawable = null;
        } else {
            drawable = getContext().getResources().getDrawable(i10);
        }
        i(drawable);
    }

    public void setRightDrawableInside(boolean z10) {
        this.m0 = z10;
    }

    public void setRightDrawableOnClick(View.OnClickListener onClickListener) {
        this.D0 = onClickListener;
    }

    public void setRightDrawableOutside(boolean z10) {
        this.f18434l0 = z10;
    }

    public void setRightDrawableScale(float f7) {
        this.H = f7;
    }

    public void setRightDrawableTopPadding(int i10) {
        this.K = i10;
    }

    public void setRightPadding(int i10) {
        if (this.f18441r0 != i10) {
            this.f18441r0 = i10;
            int maxTextWidth = ((getMaxTextWidth() - getPaddingLeft()) - getPaddingRight()) - this.f18448w0;
            Drawable drawable = this.v;
            if (drawable != null && !this.f18433k0) {
                maxTextWidth = (maxTextWidth - drawable.getIntrinsicWidth()) - this.I;
            }
            int i11 = 0;
            if (!this.m0) {
                Drawable drawable2 = this.f18447w;
                if (drawable2 != null && !this.f18434l0) {
                    i11 = (int) (drawable2.getIntrinsicWidth() * this.H);
                    maxTextWidth = (maxTextWidth - i11) - this.I;
                }
                Drawable drawable3 = this.f18449x;
                if (drawable3 != null && !this.f18434l0) {
                    i11 = (int) (drawable3.getIntrinsicWidth() * this.H);
                    maxTextWidth = (maxTextWidth - i11) - this.I;
                }
            }
            if (this.E != null && this.f18451y != null) {
                int indexOf = this.f18442s.toString().indexOf(this.E);
                this.F = indexOf;
                if (indexOf < 0) {
                    maxTextWidth = (maxTextWidth - this.f18451y.getIntrinsicWidth()) - this.I;
                }
            }
            if (this.B0 && i11 != 0 && !this.f18434l0) {
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                if (!this.f18442s.equals(TextUtils.ellipsize(this.f18442s, this.h, maxTextWidth, truncateAt))) {
                    this.C0 = true;
                    maxTextWidth = maxTextWidth + i11 + this.I;
                }
            }
            a(maxTextWidth);
            invalidate();
        }
    }

    public void setScrollNonFitText(boolean z10) {
        if (this.P == z10) {
            return;
        }
        this.P = z10;
        m();
        requestLayout();
        b();
    }

    public void setSideDrawablesColor(int i10) {
        j6.w1(i10, this.f18447w);
        j6.w1(i10, this.v);
    }

    public void setTextColor(int i10) {
        this.h.setColor(i10);
        invalidate();
    }

    public void setTextSize(int i10) {
        setTextSizePx(AndroidUtilities.dp(i10));
    }

    public void setTextSizePx(int i10) {
        float f7 = i10;
        TextPaint textPaint = this.h;
        if (f7 == textPaint.getTextSize()) {
            return;
        }
        textPaint.setTextSize(f7);
        f();
    }

    public void setTypeface(Typeface typeface) {
        this.h.setTypeface(typeface);
    }

    public void setWidthWrapContent(boolean z10) {
        this.N = z10;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f18447w && drawable != this.f18449x && drawable != this.v && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public void setLeftDrawable(Drawable drawable) {
        Drawable drawable2 = this.v;
        if (drawable2 == drawable) {
            return;
        }
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.v = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        f();
    }

    public void setEllipsizeByGradient(boolean z10) {
        if (this.P == z10) {
            return;
        }
        this.f18436n0 = z10;
        this.f18438p0 = null;
        m();
        b();
    }
}
