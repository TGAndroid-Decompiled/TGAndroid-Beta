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
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.dw0;
import org.telegram.ui.Components.gz;
import org.telegram.ui.h01;
public class h5 extends View implements Drawable.Callback {
    public String A;
    public boolean A0;
    public int B;
    public float B0;
    public float C;
    public float C0;
    public float D;
    public org.telegram.ui.Components.u5 D0;
    public int E;
    public int E0;
    public int F;
    public PorterDuffColorFilter F0;
    public int G;
    public boolean G0;
    public boolean H;
    public Layout.Alignment H0;
    public float I;
    public boolean J;
    public Drawable K;
    public boolean L;
    public boolean M;
    public float N;
    public long O;
    public int P;
    public Paint Q;
    public Paint R;
    public Paint S;
    public int T;
    public int U;
    public int V;
    public int W;
    public float f23479a;
    public int f23480a0;
    public float f23481b;
    public int f23482b0;
    public StaticLayout f23483c;
    public int f23484c0;
    public StaticLayout d;
    public int f23485d0;
    public StaticLayout f23486e;
    public int f23487e0;
    public StaticLayout f23488f;
    public boolean f23489f0;
    public boolean f23490g0;
    public final TextPaint h;
    public boolean f23491h0;
    public boolean f23492i0;
    public boolean f23493j0;
    public boolean f23494k0;
    public Boolean f23495l0;
    public int m0;
    public int f23496n;
    public int f23497n0;
    public int f23498o0;
    public int f23499p0;
    public int f23500q0;
    public int f23501r;
    public float f23502r0;
    public CharSequence f23503s;
    public int f23504s0;
    public int f23505t0;
    public final ArrayList f23506u0;
    public Drawable v;
    public final Stack f23507v0;
    public Drawable f23508w;
    public final Path f23509w0;
    public Drawable f23510x;
    public boolean f23511x0;
    public Drawable f23512y;
    public boolean f23513y0;
    public View.OnClickListener f23514z0;

    public h5(Context context) {
        super(context);
        this.f23496n = 51;
        this.f23501r = 1;
        this.D = 1.0f;
        this.E = AndroidUtilities.dp(4.0f);
        this.m0 = 16;
        this.f23505t0 = 3;
        this.f23506u0 = new ArrayList();
        this.f23507v0 = new Stack();
        this.f23509w0 = new Path();
        this.E0 = 0;
        this.H0 = Layout.Alignment.ALIGN_NORMAL;
        this.h = new TextPaint(1);
        setImportantForAccessibility(1);
    }

    private Layout.Alignment getAlignment() {
        return this.H0;
    }

    public final void a(int i10) {
        int i11;
        StaticLayout staticLayout = this.f23483c;
        if (staticLayout == null) {
            return;
        }
        if (staticLayout.getLineCount() > 0) {
            this.f23480a0 = (int) Math.max(Math.ceil(this.f23483c.getLineWidth(0)), Math.ceil(this.f23483c.getLineRight(0) - this.f23483c.getLineLeft(0)));
            StaticLayout staticLayout2 = this.f23486e;
            boolean z10 = true;
            if (staticLayout2 != null) {
                this.f23484c0 = staticLayout2.getLineBottom(staticLayout2.getLineCount() - 1);
            } else if (this.f23501r > 1 && this.f23483c.getLineCount() > 0) {
                StaticLayout staticLayout3 = this.f23483c;
                this.f23484c0 = staticLayout3.getLineBottom(staticLayout3.getLineCount() - 1);
            } else {
                this.f23484c0 = this.f23483c.getLineBottom(0);
            }
            int i12 = this.f23496n & 7;
            if (i12 == 1) {
                this.V = ((i10 - this.f23480a0) / 2) - ((int) this.f23483c.getLineLeft(0));
            } else if (i12 == 3) {
                StaticLayout staticLayout4 = this.d;
                if (staticLayout4 != null) {
                    this.V = -((int) staticLayout4.getLineLeft(0));
                } else {
                    this.V = -((int) this.f23483c.getLineLeft(0));
                }
            } else if (this.f23483c.getLineLeft(0) == 0.0f) {
                StaticLayout staticLayout5 = this.d;
                if (staticLayout5 != null) {
                    this.V = (int) (i10 - staticLayout5.getLineWidth(0));
                } else {
                    this.V = i10 - this.f23480a0;
                }
            } else {
                this.V = -AndroidUtilities.dp(8.0f);
            }
            this.V = getPaddingLeft() + this.V;
            if (this.f23492i0) {
                Drawable drawable = this.f23508w;
                if (drawable != null && !this.f23491h0) {
                    i11 = (int) (drawable.getIntrinsicWidth() * this.D);
                } else {
                    i11 = 0;
                }
                Drawable drawable2 = this.f23510x;
                if (drawable2 != null && !this.f23491h0) {
                    i11 += (int) (drawable2.getIntrinsicWidth() * this.D);
                }
            } else {
                i11 = 0;
            }
            if (this.f23480a0 + i11 <= i10 - this.f23497n0) {
                z10 = false;
            }
            this.M = z10;
            b();
            StaticLayout staticLayout6 = this.f23486e;
            if (staticLayout6 != null && this.f23499p0 > 0) {
                this.f23502r0 = staticLayout6.getPrimaryHorizontal(0) - this.d.getPrimaryHorizontal(0);
            }
        }
        int i13 = this.B;
        if (i13 >= 0) {
            this.C = this.f23483c.getPrimaryHorizontal(i13);
        } else {
            this.C = 0.0f;
        }
    }

    public final void b() {
        int i10;
        if ((this.L && (this.M || this.N != 0.0f)) || this.f23493j0) {
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
        ArrayList arrayList = this.f23506u0;
        if (arrayList.isEmpty()) {
            return;
        }
        Path path = this.f23509w0;
        path.rewind();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            Rect bounds = ((gh.k) arrayList.get(i10)).getBounds();
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
        Stack stack = this.f23507v0;
        ArrayList arrayList = this.f23506u0;
        CharSequence charSequence4 = this.f23503s;
        this.B = -1;
        this.f23513y0 = false;
        if (charSequence4 != null) {
            try {
                Drawable drawable3 = this.v;
                if (drawable3 != null && !this.f23490g0) {
                    drawable3.getIntrinsicWidth();
                    i11 = (i10 - this.v.getIntrinsicWidth()) - this.E;
                } else {
                    i11 = i10;
                }
                if (!this.f23492i0) {
                    if (this.f23508w != null && !this.f23491h0) {
                        i12 = (int) (drawable.getIntrinsicWidth() * this.D);
                        i11 = (i11 - i12) - this.E;
                    } else {
                        i12 = 0;
                    }
                    if (this.f23510x != null && !this.f23491h0) {
                        i12 += (int) (drawable2.getIntrinsicWidth() * this.D);
                        i11 = (i11 - i12) - this.E;
                    }
                } else {
                    i12 = 0;
                }
                SpannableStringBuilder spannableStringBuilder = charSequence4;
                if (this.A != null) {
                    spannableStringBuilder = charSequence4;
                    if (this.f23512y != null) {
                        int indexOf = charSequence4.toString().indexOf(this.A);
                        this.B = indexOf;
                        if (indexOf >= 0) {
                            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence4);
                            org.telegram.ui.Cells.n2 n2Var = new org.telegram.ui.Cells.n2(this.f23512y.getIntrinsicWidth());
                            int i15 = this.B;
                            valueOf.setSpan(n2Var, i15, this.A.length() + i15, 0);
                            spannableStringBuilder = valueOf;
                        } else {
                            i11 = (i11 - this.f23512y.getIntrinsicWidth()) - this.E;
                            spannableStringBuilder = charSequence4;
                        }
                    }
                }
                CharSequence charSequence5 = spannableStringBuilder;
                boolean z10 = this.f23511x0;
                TextPaint textPaint = this.h;
                if (z10 && i12 != 0 && !this.f23491h0 && !charSequence5.equals(TextUtils.ellipsize(charSequence5, textPaint, i11, TextUtils.TruncateAt.END))) {
                    this.f23513y0 = true;
                    i11 = i11 + i12 + this.E;
                }
                int i16 = i11;
                if (this.H) {
                    if (!this.f23493j0) {
                        charSequence2 = TextUtils.ellipsize(charSequence5, textPaint, i16, TextUtils.TruncateAt.END);
                    } else {
                        charSequence2 = charSequence5;
                    }
                    if (!this.f23493j0 && !charSequence2.equals(charSequence5)) {
                        Layout.Alignment alignment = getAlignment();
                        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                        StaticLayout c3 = bw0.c(charSequence5, textPaint, i16, alignment, 0.0f, false, truncateAt, i16, this.f23505t0, false);
                        i14 = i16;
                        this.f23486e = c3;
                        if (c3 != null) {
                            int lineEnd = c3.getLineEnd(0);
                            int lineStart = this.f23486e.getLineStart(1);
                            CharSequence subSequence = charSequence5.subSequence(0, lineEnd);
                            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(charSequence5);
                            valueOf2.setSpan(new gz(false), 0, lineStart, 0);
                            if (lineEnd < charSequence2.length()) {
                                charSequence3 = charSequence2.subSequence(lineEnd, charSequence2.length());
                            } else {
                                charSequence3 = "…";
                            }
                            int length = charSequence2.length();
                            if (this.L) {
                                dp3 = AndroidUtilities.dp(2000.0f);
                            } else {
                                dp3 = i14 + AndroidUtilities.dp(8.0f);
                            }
                            this.d = new StaticLayout(charSequence2, 0, length, textPaint, dp3, getAlignment(), 1.0f, 0.0f, false);
                            int length2 = subSequence.length();
                            if (this.L) {
                                dp4 = AndroidUtilities.dp(2000.0f);
                            } else {
                                dp4 = i14 + AndroidUtilities.dp(8.0f);
                            }
                            StaticLayout staticLayout = new StaticLayout(subSequence, 0, length2, textPaint, dp4, getAlignment(), 1.0f, 0.0f, false);
                            this.f23483c = staticLayout;
                            String str = charSequence3;
                            if (staticLayout.getLineLeft(0) != 0.0f) {
                                str = "\u200f" + ((Object) charSequence3);
                            }
                            CharSequence charSequence6 = str;
                            int length3 = charSequence6.length();
                            if (this.L) {
                                dp5 = AndroidUtilities.dp(2000.0f);
                            } else {
                                dp5 = i14 + AndroidUtilities.dp(8.0f);
                            }
                            this.f23488f = new StaticLayout(charSequence6, 0, length3, textPaint, dp5, getAlignment(), 1.0f, 0.0f, false);
                            this.f23486e = bw0.c(valueOf2, textPaint, i14 + AndroidUtilities.dp(8.0f) + this.f23499p0, getAlignment(), 0.0f, false, truncateAt, i14 + this.f23499p0, this.f23505t0, false);
                        }
                    } else {
                        i14 = i16;
                        CharSequence charSequence7 = charSequence2;
                        int length4 = charSequence7.length();
                        if (!this.L && !this.f23493j0) {
                            dp2 = i14 + AndroidUtilities.dp(8.0f);
                            this.f23483c = new StaticLayout(charSequence7, 0, length4, textPaint, dp2, getAlignment(), 1.0f, 0.0f, false);
                            this.f23486e = null;
                            this.f23488f = null;
                            this.d = null;
                        }
                        dp2 = AndroidUtilities.dp(2000.0f);
                        this.f23483c = new StaticLayout(charSequence7, 0, length4, textPaint, dp2, getAlignment(), 1.0f, 0.0f, false);
                        this.f23486e = null;
                        this.f23488f = null;
                        this.d = null;
                    }
                    i13 = i14;
                } else if (this.f23501r > 1) {
                    StaticLayout c6 = bw0.c(charSequence5, textPaint, i16, getAlignment(), 0.0f, false, TextUtils.TruncateAt.END, i16, this.f23501r, false);
                    i13 = i16;
                    this.f23483c = c6;
                } else {
                    i13 = i16;
                    if (!this.L && !this.f23493j0) {
                        charSequence = TextUtils.ellipsize(charSequence5, textPaint, i13, TextUtils.TruncateAt.END);
                        int length5 = charSequence.length();
                        if (!this.L && !this.f23493j0) {
                            dp = AndroidUtilities.dp(8.0f) + i13;
                            this.f23483c = new StaticLayout(charSequence, 0, length5, textPaint, dp, getAlignment(), 1.0f, 0.0f, false);
                        }
                        dp = AndroidUtilities.dp(2000.0f);
                        this.f23483c = new StaticLayout(charSequence, 0, length5, textPaint, dp, getAlignment(), 1.0f, 0.0f, false);
                    }
                    charSequence = charSequence5;
                    int length52 = charSequence.length();
                    if (!this.L) {
                        dp = AndroidUtilities.dp(8.0f) + i13;
                        this.f23483c = new StaticLayout(charSequence, 0, length52, textPaint, dp, getAlignment(), 1.0f, 0.0f, false);
                    }
                    dp = AndroidUtilities.dp(2000.0f);
                    this.f23483c = new StaticLayout(charSequence, 0, length52, textPaint, dp, getAlignment(), 1.0f, 0.0f, false);
                }
                stack.addAll(arrayList);
                arrayList.clear();
                StaticLayout staticLayout2 = this.f23483c;
                if (staticLayout2 != null && (staticLayout2.getText() instanceof Spannable)) {
                    gh.k.b(this, this.f23483c, -2, -2, stack, arrayList);
                }
                a(i13);
            } catch (Exception unused) {
            }
        } else {
            this.f23483c = null;
            this.f23480a0 = 0;
            this.f23484c0 = 0;
        }
        org.telegram.ui.Components.y5.release(this, this.D0);
        if (this.G0) {
            this.D0 = org.telegram.ui.Components.y5.update(this.E0, this, this.D0, this.f23483c);
        }
        invalidate();
    }

    public final void e(Canvas canvas) {
        float f9 = this.I;
        int i10 = 0;
        ArrayList arrayList = this.f23506u0;
        if (f9 > 0.0f && this.f23500q0 != 0) {
            canvas.save();
            float f10 = this.I;
            canvas.translate((this.f23502r0 * f10) + ((-this.f23500q0) * f10), 0.0f);
            float f11 = this.f23479a;
            float f12 = this.I;
            this.f23479a = com.google.android.recaptcha.internal.a.d(this.f23502r0, f12, (-this.f23500q0) * f12, f11);
            canvas.save();
            c(canvas);
            org.telegram.ui.Components.u5 u5Var = this.D0;
            if (u5Var != null) {
                u5Var.a();
            }
            this.f23483c.draw(canvas);
            canvas.restore();
            org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas, this.f23483c, this.D0, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.F0);
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((gh.k) obj).draw(canvas);
            }
            canvas.restore();
            return;
        }
        canvas.save();
        c(canvas);
        org.telegram.ui.Components.u5 u5Var2 = this.D0;
        if (u5Var2 != null) {
            u5Var2.a();
        }
        this.f23483c.draw(canvas);
        canvas.restore();
        org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas, this.f23483c, this.D0, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.F0);
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            ((gh.k) obj2).draw(canvas);
        }
    }

    public final boolean f() {
        if (this.f23489f0 && getMeasuredHeight() != 0 && !this.H) {
            d(((getMaxTextWidth() - getPaddingLeft()) - getPaddingRight()) - this.f23504s0);
            if ((this.f23496n & 112) == 16) {
                this.W = (getMeasuredHeight() - this.f23484c0) / 2;
                return true;
            }
            this.W = getPaddingTop();
            return true;
        }
        requestLayout();
        return true;
    }

    public final void g(dw0 dw0Var, String str) {
        Drawable drawable = this.f23512y;
        if (drawable == dw0Var) {
            return;
        }
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f23512y = dw0Var;
        if (dw0Var != null) {
            dw0Var.setCallback(this);
        }
        f();
        this.A = str;
    }

    @Override
    public Drawable getBackground() {
        Drawable drawable = this.K;
        if (drawable != null) {
            return drawable;
        }
        return super.getBackground();
    }

    public float getExactWidth() {
        int i10;
        float measureText = getPaint().measureText(getText().toString()) + getSideDrawablesSize();
        if (this.v == null && this.f23508w == null && this.f23510x == null) {
            i10 = 0;
        } else {
            i10 = this.E;
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
        float f9 = exactWidth + i10;
        Drawable drawable2 = this.f23508w;
        if (drawable2 != null) {
            i11 = drawable2.getIntrinsicWidth();
        } else {
            i11 = 0;
        }
        float f10 = f9 + i11;
        Drawable drawable3 = this.f23510x;
        if (drawable3 != null) {
            i12 = drawable3.getIntrinsicWidth();
        }
        return f10 + i12;
    }

    public float getFullAlpha() {
        return this.I;
    }

    public Layout getLayout() {
        return this.f23483c;
    }

    public float getLayoutX() {
        return this.f23479a;
    }

    public float getLayoutY() {
        return this.f23481b;
    }

    public Drawable getLeftDrawable() {
        return this.v;
    }

    public int getLineCount() {
        int i10;
        StaticLayout staticLayout = this.f23483c;
        if (staticLayout != null) {
            i10 = staticLayout.getLineCount();
        } else {
            i10 = 0;
        }
        StaticLayout staticLayout2 = this.f23486e;
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
        if (this.f23491h0 && (drawable2 = this.f23508w) != null) {
            i10 = drawable2.getIntrinsicWidth() + this.E;
        } else {
            i10 = 0;
        }
        int i12 = measuredWidth - i10;
        if (this.f23491h0 && (drawable = this.f23510x) != null) {
            i11 = this.E + drawable.getIntrinsicWidth();
        }
        return i12 - i11;
    }

    public TextPaint getPaint() {
        return this.h;
    }

    public Drawable getRightDrawable() {
        return this.f23508w;
    }

    public Drawable getRightDrawable2() {
        return this.f23510x;
    }

    public boolean getRightDrawableOutside() {
        return this.f23491h0;
    }

    public int getRightDrawableWidth() {
        Drawable drawable = this.f23508w;
        if (drawable == null) {
            return 0;
        }
        return (int) ((drawable.getIntrinsicWidth() * this.D) + this.E);
    }

    public int getRightDrawableX() {
        return this.f23485d0;
    }

    public int getRightDrawableY() {
        return this.f23487e0;
    }

    public int getSideDrawablesSize() {
        int i10;
        Drawable drawable = this.v;
        if (drawable != null) {
            i10 = drawable.getIntrinsicWidth() + this.E;
        } else {
            i10 = 0;
        }
        Drawable drawable2 = this.f23508w;
        if (drawable2 != null) {
            i10 += ((int) (drawable2.getIntrinsicWidth() * this.D)) + this.E;
        }
        Drawable drawable3 = this.f23510x;
        if (drawable3 != null) {
            return ((int) (drawable3.getIntrinsicWidth() * this.D)) + this.E + i10;
        }
        return i10;
    }

    public CharSequence getText() {
        CharSequence charSequence = this.f23503s;
        if (charSequence == null) {
            return "";
        }
        return charSequence;
    }

    public int getTextColor() {
        return this.h.getColor();
    }

    public int getTextHeight() {
        return this.f23484c0;
    }

    public TextPaint getTextPaint() {
        return this.h;
    }

    public int getTextStartX() {
        int i10 = 0;
        if (this.f23483c == null) {
            return 0;
        }
        Drawable drawable = this.v;
        if (drawable != null && (this.f23496n & 7) == 3) {
            i10 = this.E + drawable.getIntrinsicWidth();
        }
        Drawable drawable2 = this.f23512y;
        if (drawable2 != null && this.B < 0 && (this.f23496n & 7) == 3) {
            i10 += drawable2.getIntrinsicWidth() + this.E;
        }
        return ((int) getX()) + this.V + i10;
    }

    public int getTextStartY() {
        if (this.f23483c == null) {
            return 0;
        }
        return (int) getY();
    }

    public int getTextWidth() {
        int i10;
        int i11 = this.f23480a0;
        int i12 = 0;
        if (this.f23492i0) {
            Drawable drawable = this.f23508w;
            if (drawable != null) {
                i10 = (int) (drawable.getIntrinsicWidth() * this.D);
            } else {
                i10 = 0;
            }
            Drawable drawable2 = this.f23510x;
            if (drawable2 != null) {
                i12 = (int) (drawable2.getIntrinsicWidth() * this.D);
            }
            i12 += i10;
        }
        return i11 + i12;
    }

    public final void h(int i10, int i11) {
        if (this.f23499p0 == i10 && this.f23500q0 == i11) {
            return;
        }
        this.f23499p0 = i10;
        this.f23500q0 = i11;
        d(((getMaxTextWidth() - getPaddingLeft()) - getPaddingRight()) - this.f23504s0);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final boolean i(Drawable drawable) {
        Drawable drawable2 = this.f23508w;
        if (drawable2 == drawable) {
            return false;
        }
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f23508w = drawable;
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
        Drawable drawable3 = this.f23508w;
        if (drawable == drawable3) {
            invalidate(drawable3.getBounds());
            return;
        }
        Drawable drawable4 = this.f23510x;
        if (drawable == drawable4) {
            invalidate(drawable4.getBounds());
            return;
        }
        Drawable drawable5 = this.f23512y;
        if (drawable == drawable5) {
            invalidate(drawable5.getBounds());
        }
    }

    public final boolean j(Drawable drawable) {
        Drawable drawable2 = this.f23510x;
        if (drawable2 == drawable) {
            return false;
        }
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f23510x = drawable;
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
        CharSequence charSequence2 = this.f23503s;
        if (charSequence2 != null || charSequence != null) {
            if (!z10 && charSequence2 != null && charSequence2.equals(charSequence)) {
                return false;
            }
            this.f23503s = charSequence;
            this.P = 500;
            f();
            return true;
        }
        return false;
    }

    public final void m() {
        boolean z10;
        if ((this.Q == null || this.R == null) && this.L) {
            Paint paint = new Paint();
            this.Q = paint;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(6.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, tileMode));
            Paint paint2 = this.Q;
            PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
            paint2.setXfermode(new PorterDuffXfermode(mode));
            Paint paint3 = new Paint();
            this.R = paint3;
            paint3.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(6.0f), 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
            this.R.setXfermode(new PorterDuffXfermode(mode));
        }
        Boolean bool = this.f23495l0;
        if (bool != null) {
            z10 = bool.booleanValue();
        } else {
            z10 = false;
        }
        if ((this.S == null || this.T != AndroidUtilities.dp(this.m0) || this.f23494k0 != z10) && this.f23493j0) {
            if (this.S == null) {
                this.S = new Paint();
            }
            this.f23494k0 = z10;
            if (z10) {
                Paint paint4 = this.S;
                int dp = AndroidUtilities.dp(this.m0);
                this.T = dp;
                paint4.setShader(new LinearGradient(0.0f, 0.0f, dp, 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            } else {
                Paint paint5 = this.S;
                int dp2 = AndroidUtilities.dp(this.m0);
                this.T = dp2;
                paint5.setShader(new LinearGradient(0.0f, 0.0f, dp2, 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            }
            this.S.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.G0 = true;
        this.D0 = org.telegram.ui.Components.y5.update(this.E0, this, this.D0, this.f23483c);
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.G0 = false;
        org.telegram.ui.Components.y5.release(this, this.D0);
        this.f23489f0 = false;
    }

    @Override
    public void onDraw(Canvas canvas) {
        boolean z10;
        int i10;
        Drawable drawable;
        float f9;
        float f10;
        int i11;
        Drawable drawable2;
        int e10;
        int i12;
        int i13;
        int e11;
        int i14;
        int e12;
        int i15;
        float f11;
        float f12;
        float f13;
        Drawable drawable3;
        float f14;
        boolean z11;
        float f15;
        Drawable drawable4;
        int e13;
        int i16;
        int e14;
        int i17;
        float f16;
        float f17;
        Drawable drawable5;
        Drawable drawable6;
        Drawable drawable7;
        int e15;
        int i18;
        int e16;
        int i19;
        int intrinsicHeight;
        Drawable drawable8;
        int e17;
        int i20;
        int e18;
        int i21;
        int intrinsicHeight2;
        int intrinsicHeight3;
        super.onDraw(canvas);
        this.f23479a = 0.0f;
        this.f23481b = 0.0f;
        if (this.L && (this.M || this.N != 0.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f23482b0 = this.f23480a0;
        Drawable drawable9 = this.v;
        if (drawable9 != null && !this.f23490g0) {
            int i22 = (int) (-this.N);
            int i23 = this.f23496n;
            if ((i23 & 7) == 1) {
                i22 += this.V;
            }
            if ((i23 & 112) == 16) {
                intrinsicHeight3 = ((getMeasuredHeight() - this.v.getIntrinsicHeight()) / 2) + this.F;
            } else {
                intrinsicHeight3 = this.F + ((this.f23484c0 - this.v.getIntrinsicHeight()) / 2) + getPaddingTop();
            }
            Drawable drawable10 = this.v;
            drawable10.setBounds(i22, intrinsicHeight3, drawable10.getIntrinsicWidth() + i22, this.v.getIntrinsicHeight() + intrinsicHeight3);
            this.v.draw(canvas);
            int i24 = this.f23496n & 7;
            if (i24 != 3 && i24 != 1) {
                i10 = 0;
            } else {
                i10 = this.v.getIntrinsicWidth() + this.E;
            }
            this.f23482b0 = this.v.getIntrinsicWidth() + this.E + this.f23482b0;
        } else if (this.f23490g0 && drawable9 != null) {
            i10 = this.E + drawable9.getIntrinsicWidth();
        } else {
            i10 = 0;
        }
        Drawable drawable11 = this.f23512y;
        if (drawable11 != null && this.A != null) {
            int i25 = (int) ((-this.N) + this.C);
            int i26 = this.f23496n;
            if ((i26 & 7) == 1) {
                i25 += this.V;
            }
            if ((i26 & 112) == 16) {
                intrinsicHeight2 = ((getMeasuredHeight() - this.f23512y.getIntrinsicHeight()) / 2) + this.F;
            } else {
                intrinsicHeight2 = this.F + ((this.f23484c0 - drawable11.getIntrinsicHeight()) / 2);
            }
            Drawable drawable12 = this.f23512y;
            drawable12.setBounds(i25, intrinsicHeight2, drawable12.getIntrinsicWidth() + i25, this.f23512y.getIntrinsicHeight() + intrinsicHeight2);
            this.f23512y.draw(canvas);
            if (this.B < 0) {
                int i27 = this.f23496n & 7;
                if (i27 == 3 || i27 == 1) {
                    i10 += this.f23512y.getIntrinsicWidth() + this.E;
                }
                this.f23482b0 = this.f23512y.getIntrinsicWidth() + this.E + this.f23482b0;
            }
        }
        int i28 = i10;
        if (this.f23508w != null && !this.f23513y0 && this.D > 0.0f && !this.f23491h0 && !this.f23492i0) {
            int i29 = this.f23480a0 + i28 + this.E + ((int) (-this.N));
            int i30 = this.f23496n & 7;
            if (i30 == 1 || i30 == 5) {
                i29 += this.V;
            }
            int intrinsicWidth = (int) (drawable.getIntrinsicWidth() * this.D);
            int intrinsicHeight4 = (int) (this.f23508w.getIntrinsicHeight() * this.D);
            if ((this.f23496n & 112) == 16) {
                e18 = (getMeasuredHeight() - intrinsicHeight4) / 2;
                i21 = this.G;
            } else {
                e18 = j7.l1.e(this.f23484c0, intrinsicHeight4, 2, getPaddingTop());
                i21 = this.G;
            }
            int i31 = e18 + i21;
            f9 = 0.0f;
            this.f23508w.setBounds(i29, i31, i29 + intrinsicWidth, i31 + intrinsicHeight4);
            this.f23485d0 = i29 + (intrinsicWidth >> 1);
            this.f23487e0 = i31 + (intrinsicHeight4 >> 1);
            this.f23508w.draw(canvas);
            this.f23482b0 = this.E + intrinsicWidth + this.f23482b0;
        } else {
            f9 = 0.0f;
        }
        if (this.f23510x != null && !this.f23513y0 && this.D > f9 && !this.f23491h0 && !this.f23492i0) {
            int i32 = this.f23480a0 + i28 + this.E + ((int) (-this.N));
            if (this.f23508w != null) {
                i32 += ((int) (drawable8.getIntrinsicWidth() * this.D)) + this.E;
            }
            int i33 = this.f23496n & 7;
            if (i33 == 1 || i33 == 5) {
                i32 += this.V;
            }
            int intrinsicWidth2 = (int) (this.f23510x.getIntrinsicWidth() * this.D);
            int intrinsicHeight5 = (int) (this.f23510x.getIntrinsicHeight() * this.D);
            if ((this.f23496n & 112) == 16) {
                e17 = (getMeasuredHeight() - intrinsicHeight5) / 2;
                i20 = this.G;
            } else {
                e17 = j7.l1.e(this.f23484c0, intrinsicHeight5, 2, getPaddingTop());
                i20 = this.G;
            }
            int i34 = e17 + i20;
            this.f23510x.setBounds(i32, i34, i32 + intrinsicWidth2, intrinsicHeight5 + i34);
            this.f23510x.draw(canvas);
            this.f23482b0 = this.E + intrinsicWidth2 + this.f23482b0;
        }
        int dp = AndroidUtilities.dp(16.0f) + this.f23482b0;
        float f18 = this.N;
        if (f18 != f9) {
            if (this.v != null && !this.f23490g0) {
                int i35 = ((int) (-f18)) + dp;
                if ((this.f23496n & 112) == 16) {
                    intrinsicHeight = ((getMeasuredHeight() - this.v.getIntrinsicHeight()) / 2) + this.F;
                } else {
                    intrinsicHeight = this.F + ((this.f23484c0 - this.v.getIntrinsicHeight()) / 2) + getPaddingTop();
                }
                Drawable drawable13 = this.v;
                drawable13.setBounds(i35, intrinsicHeight, drawable13.getIntrinsicWidth() + i35, this.v.getIntrinsicHeight() + intrinsicHeight);
                this.v.draw(canvas);
            }
            if (this.f23508w != null && !this.f23491h0) {
                int intrinsicWidth3 = (int) (drawable5.getIntrinsicWidth() * this.D);
                int intrinsicHeight6 = (int) (this.f23508w.getIntrinsicHeight() * this.D);
                int i36 = this.f23480a0 + i28 + this.E + ((int) (-this.N)) + dp;
                if ((this.f23496n & 112) == 16) {
                    e16 = (getMeasuredHeight() - intrinsicHeight6) / 2;
                    i19 = this.G;
                } else {
                    e16 = j7.l1.e(this.f23484c0, intrinsicHeight6, 2, getPaddingTop());
                    i19 = this.G;
                }
                int i37 = e16 + i19;
                f10 = 16.0f;
                this.f23508w.setBounds(i36, i37, i36 + intrinsicWidth3, i37 + intrinsicHeight6);
                this.f23485d0 = i36 + (intrinsicWidth3 >> 1);
                this.f23487e0 = i37 + (intrinsicHeight6 >> 1);
                this.f23508w.draw(canvas);
            } else {
                f10 = 16.0f;
            }
            if (this.f23510x != null && !this.f23491h0) {
                int intrinsicWidth4 = (int) (drawable6.getIntrinsicWidth() * this.D);
                int intrinsicHeight7 = (int) (this.f23510x.getIntrinsicHeight() * this.D);
                int i38 = this.f23480a0 + i28 + this.E + ((int) (-this.N)) + dp;
                if (this.f23508w != null) {
                    i38 += ((int) (drawable7.getIntrinsicWidth() * this.D)) + this.E;
                }
                if ((this.f23496n & 112) == 16) {
                    e15 = (getMeasuredHeight() - intrinsicHeight7) / 2;
                    i18 = this.G;
                } else {
                    e15 = j7.l1.e(this.f23484c0, intrinsicHeight7, 2, getPaddingTop());
                    i18 = this.G;
                }
                int i39 = e15 + i18;
                this.f23510x.setBounds(i38, i39, intrinsicWidth4 + i38, intrinsicHeight7 + i39);
                this.f23510x.draw(canvas);
            }
        } else {
            f10 = 16.0f;
        }
        if (this.f23483c != null) {
            if (this.f23490g0 || this.f23491h0 || this.f23493j0 || this.f23497n0 > 0) {
                canvas.save();
                int maxTextWidth = getMaxTextWidth() - this.f23497n0;
                Drawable drawable14 = this.f23508w;
                if (drawable14 != null && !(drawable14 instanceof org.telegram.ui.Components.n5) && this.f23491h0) {
                    f11 = 2.0f;
                } else {
                    f11 = 0.0f;
                }
                canvas.clipRect(i28, 0, maxTextWidth - AndroidUtilities.dp(f11), getMeasuredHeight());
            }
            Emoji.emojiDrawingUseAlpha = false;
            if (this.K != null) {
                int i40 = this.f23480a0;
                int i41 = (i40 / 2) + ((int) ((this.V + i28) - this.N));
                int max = Math.max(getPaddingRight() + getPaddingLeft() + i40, this.f23498o0);
                int i42 = i41 - (max / 2);
                this.K.setBounds(i42, 0, max + i42, getMeasuredHeight());
                this.K.draw(canvas);
            }
            if (this.V + i28 != 0 || this.W != 0 || this.N != f9) {
                canvas.save();
                canvas.translate((this.V + i28) - this.N, this.W);
                this.f23479a = ((this.V + i28) - this.N) + this.f23479a;
                this.f23481b += this.W;
            }
            e(canvas);
            StaticLayout staticLayout = this.f23488f;
            TextPaint textPaint = this.h;
            if (staticLayout != null && this.I < 1.0f) {
                int alpha = textPaint.getAlpha();
                textPaint.setAlpha((int) ((1.0f - this.I) * 255.0f));
                canvas.save();
                if (this.f23488f.getText().length() == 1) {
                    if (this.f23505t0 == 1) {
                        f17 = 0.5f;
                    } else {
                        f17 = 4.0f;
                    }
                    f16 = AndroidUtilities.dp(f17);
                } else {
                    f16 = 0.0f;
                }
                if (this.f23483c.getLineLeft(0) != f9) {
                    canvas.translate((-this.f23483c.getLineWidth(0)) + f16, 0.0f);
                    f12 = 0.0f;
                } else {
                    f12 = 0.0f;
                    canvas.translate(this.f23483c.getLineWidth(0) - f16, 0.0f);
                }
                float f19 = this.I;
                canvas.translate((this.f23502r0 * f19) + ((-this.f23500q0) * f19), f12);
                this.f23488f.draw(canvas);
                canvas.restore();
                textPaint.setAlpha(alpha);
            } else {
                f12 = 0.0f;
            }
            if (this.f23486e != null && this.I > f12) {
                int alpha2 = textPaint.getAlpha();
                textPaint.setAlpha((int) (this.I * 255.0f));
                float f20 = this.I;
                float f21 = this.f23502r0;
                float f22 = ((f20 * f21) + ((-this.f23500q0) * f20)) - f21;
                f13 = 0.0f;
                canvas.translate(f22, 0.0f);
                this.f23486e.draw(canvas);
                textPaint.setAlpha(alpha2);
            } else {
                f13 = 0.0f;
            }
            if (this.N != f13) {
                canvas.translate(dp, f13);
                e(canvas);
            }
            if (this.V + i28 != 0 || this.W != 0 || this.N != f13) {
                canvas.restore();
            }
            if (this.f23508w != null && !this.f23513y0 && this.D > 0.0f && !this.f23491h0 && this.f23492i0) {
                int i43 = this.f23480a0 + i28 + this.E + ((int) (-this.N));
                int i44 = this.f23496n & 7;
                if (i44 == 1 || i44 == 5) {
                    i43 += this.V;
                }
                int intrinsicWidth5 = (int) (drawable3.getIntrinsicWidth() * this.D);
                int intrinsicHeight8 = (int) (this.f23508w.getIntrinsicHeight() * this.D);
                if ((this.f23496n & 112) == 16) {
                    e14 = (getMeasuredHeight() - intrinsicHeight8) / 2;
                    i17 = this.G;
                } else {
                    e14 = j7.l1.e(this.f23484c0, intrinsicHeight8, 2, getPaddingTop());
                    i17 = this.G;
                }
                int i45 = e14 + i17;
                this.f23508w.setBounds(i43, i45, i43 + intrinsicWidth5, i45 + intrinsicHeight8);
                this.f23485d0 = i43 + (intrinsicWidth5 >> 1);
                this.f23487e0 = i45 + (intrinsicHeight8 >> 1);
                this.f23508w.draw(canvas);
                this.f23482b0 = this.E + intrinsicWidth5 + this.f23482b0;
            }
            if (this.f23510x != null && !this.f23513y0 && this.D > 0.0f && !this.f23491h0 && this.f23492i0) {
                int i46 = this.f23480a0 + i28 + this.E + ((int) (-this.N));
                if (this.f23508w != null) {
                    i46 += ((int) (drawable4.getIntrinsicWidth() * this.D)) + this.E;
                }
                int i47 = this.f23496n & 7;
                if (i47 == 1 || i47 == 5) {
                    i46 += this.V;
                }
                int intrinsicWidth6 = (int) (this.f23510x.getIntrinsicWidth() * this.D);
                int intrinsicHeight9 = (int) (this.f23510x.getIntrinsicHeight() * this.D);
                if ((this.f23496n & 112) == 16) {
                    e13 = (getMeasuredHeight() - intrinsicHeight9) / 2;
                    i16 = this.G;
                } else {
                    e13 = j7.l1.e(this.f23484c0, intrinsicHeight9, 2, getPaddingTop());
                    i16 = this.G;
                }
                int i48 = e13 + i16;
                this.f23510x.setBounds(i46, i48, i46 + intrinsicWidth6, intrinsicHeight9 + i48);
                this.f23510x.draw(canvas);
                this.f23482b0 = this.E + intrinsicWidth6 + this.f23482b0;
            }
            if (z10) {
                if (this.N < AndroidUtilities.dp(10.0f)) {
                    this.Q.setAlpha((int) ((this.N / AndroidUtilities.dp(10.0f)) * 255.0f));
                } else {
                    if (this.N > (AndroidUtilities.dp(f10) + this.f23482b0) - AndroidUtilities.dp(10.0f)) {
                        this.Q.setAlpha((int) org.telegram.ui.b.c(this.N - ((AndroidUtilities.dp(f10) + this.f23482b0) - AndroidUtilities.dp(10.0f)), AndroidUtilities.dp(10.0f), 1.0f, 255.0f));
                    } else {
                        this.Q.setAlpha(255);
                    }
                }
                canvas.drawRect(i28, 0.0f, AndroidUtilities.dp(6.0f) + i28, getMeasuredHeight(), this.Q);
                canvas.save();
                canvas.translate((getMaxTextWidth() - this.f23497n0) - AndroidUtilities.dp(6.0f), 0.0f);
                canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(6.0f), getMeasuredHeight(), this.R);
                canvas.restore();
            } else if (this.f23493j0 && this.M && this.S != null) {
                canvas.save();
                m();
                if (!this.f23494k0) {
                    int maxTextWidth2 = (getMaxTextWidth() - this.f23497n0) - this.T;
                    Drawable drawable15 = this.f23508w;
                    if (drawable15 != null && !(drawable15 instanceof org.telegram.ui.Components.n5) && this.f23491h0) {
                        f14 = 2.0f;
                    } else {
                        f14 = 0.0f;
                    }
                    canvas.translate(maxTextWidth2 - AndroidUtilities.dp(f14), 0.0f);
                }
                canvas.drawRect(i28, 0.0f, this.T, getMeasuredHeight(), this.S);
                canvas.restore();
            }
            if (!this.L || (!this.M && this.N == 0.0f)) {
                z11 = true;
            } else {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = elapsedRealtime - this.O;
                if (j10 > 17) {
                    j10 = 17;
                }
                int i49 = this.P;
                if (i49 > 0) {
                    this.P = (int) (i49 - j10);
                    z11 = true;
                } else {
                    int dp2 = AndroidUtilities.dp(f10) + this.f23482b0;
                    if (this.N < AndroidUtilities.dp(100.0f)) {
                        f15 = u3.c.c(this.N, AndroidUtilities.dp(100.0f), 20.0f, 30.0f);
                        z11 = true;
                    } else {
                        z11 = true;
                        if (this.N >= dp2 - AndroidUtilities.dp(100.0f)) {
                            f15 = org.telegram.messenger.x3.A(this.N - (dp2 - AndroidUtilities.dp(100.0f)), AndroidUtilities.dp(100.0f), 20.0f, 50.0f);
                        } else {
                            f15 = 50.0f;
                        }
                    }
                    float dp3 = ((((float) j10) / 1000.0f) * AndroidUtilities.dp(f15)) + this.N;
                    this.N = dp3;
                    this.O = elapsedRealtime;
                    if (dp3 > dp2) {
                        this.N = 0.0f;
                        this.P = 500;
                    }
                    b();
                }
                invalidate();
            }
            Emoji.emojiDrawingUseAlpha = z11;
            if (this.f23490g0 || this.f23491h0 || this.f23493j0 || this.f23497n0 > 0) {
                canvas.restore();
            }
        }
        Drawable drawable16 = this.v;
        if (drawable16 != null && this.f23490g0) {
            int intrinsicWidth7 = drawable16.getIntrinsicWidth();
            int intrinsicHeight10 = this.v.getIntrinsicHeight();
            if ((this.f23496n & 112) == 16) {
                e12 = (getMeasuredHeight() - intrinsicHeight10) / 2;
                i15 = this.F;
            } else {
                e12 = j7.l1.e(this.f23484c0, intrinsicHeight10, 2, getPaddingTop());
                i15 = this.F;
            }
            int i50 = e12 + i15;
            this.v.setBounds(0, i50, intrinsicWidth7, intrinsicHeight10 + i50);
            this.v.draw(canvas);
        }
        if (this.f23508w != null && this.f23491h0) {
            int i51 = this.f23480a0 + i28 + this.E;
            float f23 = this.N;
            if (f23 == 0.0f) {
                i13 = -dp;
            } else {
                i13 = (int) (-f23);
            }
            int min = Math.min(i51 + i13 + dp, (getMaxTextWidth() - this.f23497n0) + this.E);
            int intrinsicWidth8 = (int) (this.f23508w.getIntrinsicWidth() * this.D);
            int intrinsicHeight11 = (int) (this.f23508w.getIntrinsicHeight() * this.D);
            if ((this.f23496n & 112) == 16) {
                e11 = (getMeasuredHeight() - intrinsicHeight11) / 2;
                i14 = this.G;
            } else {
                e11 = j7.l1.e(this.f23484c0, intrinsicHeight11, 2, getPaddingTop());
                i14 = this.G;
            }
            int i52 = e11 + i14;
            this.f23508w.setBounds(min, i52, min + intrinsicWidth8, i52 + intrinsicHeight11);
            this.f23485d0 = min + (intrinsicWidth8 >> 1);
            this.f23487e0 = i52 + (intrinsicHeight11 >> 1);
            this.f23508w.draw(canvas);
        }
        if (this.f23510x != null && this.f23491h0) {
            int i53 = i28 + this.f23480a0 + this.E;
            float f24 = this.N;
            if (f24 == 0.0f) {
                i11 = -dp;
            } else {
                i11 = (int) (-f24);
            }
            int min2 = Math.min(i53 + i11 + dp, (getMaxTextWidth() - this.f23497n0) + this.E);
            if (this.f23508w != null) {
                min2 += ((int) (drawable2.getIntrinsicWidth() * this.D)) + this.E;
            }
            int intrinsicWidth9 = (int) (this.f23510x.getIntrinsicWidth() * this.D);
            int intrinsicHeight12 = (int) (this.f23510x.getIntrinsicHeight() * this.D);
            if ((this.f23496n & 112) == 16) {
                e10 = (getMeasuredHeight() - intrinsicHeight12) / 2;
                i12 = this.G;
            } else {
                e10 = j7.l1.e(this.f23484c0, intrinsicHeight12, 2, getPaddingTop());
                i12 = this.G;
            }
            int i54 = e10 + i12;
            this.f23510x.setBounds(min2, i54, intrinsicWidth9 + min2, intrinsicHeight12 + i54);
            this.f23510x.draw(canvas);
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setVisibleToUser(true);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setText(this.f23503s);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f23489f0 = true;
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
        int i18 = this.U;
        int i19 = AndroidUtilities.displaySize.x;
        if (i18 != i19) {
            this.U = i19;
            this.N = 0.0f;
            this.P = 500;
            b();
        }
        int paddingLeft = ((size - getPaddingLeft()) - getPaddingRight()) - this.f23504s0;
        if (this.f23490g0 && (drawable6 = this.v) != null) {
            i12 = drawable6.getIntrinsicWidth() + this.E;
        } else {
            i12 = 0;
        }
        int i20 = paddingLeft - i12;
        if (this.f23491h0 && (drawable5 = this.f23508w) != null) {
            i13 = drawable5.getIntrinsicWidth() + this.E;
        } else {
            i13 = 0;
        }
        int i21 = i20 - i13;
        if (this.f23491h0 && (drawable4 = this.f23510x) != null) {
            i14 = drawable4.getIntrinsicWidth() + this.E;
        } else {
            i14 = 0;
        }
        d(i21 - i14);
        if (View.MeasureSpec.getMode(i11) != 1073741824) {
            size2 = getPaddingBottom() + getPaddingTop() + this.f23484c0;
        }
        if (this.J) {
            int paddingRight = getPaddingRight() + getPaddingLeft() + this.f23480a0 + this.f23504s0;
            if (this.f23490g0 && (drawable3 = this.v) != null) {
                i15 = drawable3.getIntrinsicWidth() + this.E;
            } else {
                i15 = 0;
            }
            int i22 = paddingRight + i15;
            if (this.f23491h0 && (drawable2 = this.f23508w) != null) {
                i16 = drawable2.getIntrinsicWidth() + this.E;
            } else {
                i16 = 0;
            }
            int i23 = i22 + i16;
            if (this.f23491h0 && (drawable = this.f23510x) != null) {
                i17 = drawable.getIntrinsicWidth() + this.E;
            } else {
                i17 = 0;
            }
            size = Math.max(Math.min(size, i23 + i17), 0);
        }
        setMeasuredDimension(size, size2);
        if ((this.f23496n & 112) == 16) {
            this.W = j7.l1.e((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), this.f23484c0, 2, getPaddingTop());
        } else {
            this.W = getPaddingTop();
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f23514z0 != null && this.f23508w != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(this.f23485d0 - AndroidUtilities.dp(16.0f), this.f23487e0 - AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f) + this.f23485d0, AndroidUtilities.dp(16.0f) + this.f23487e0);
            if (motionEvent.getAction() == 0 && rectF.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                this.A0 = true;
                this.B0 = motionEvent.getX();
                this.C0 = motionEvent.getY();
                getParent().requestDisallowInterceptTouchEvent(true);
                Drawable drawable = this.f23508w;
                if (drawable instanceof g5) {
                    ((h01) ((g5) drawable)).f38715f.c(true);
                }
            } else if (motionEvent.getAction() == 2 && this.A0) {
                if (Math.abs(motionEvent.getX() - this.B0) >= AndroidUtilities.touchSlop || Math.abs(motionEvent.getY() - this.C0) >= AndroidUtilities.touchSlop) {
                    this.A0 = false;
                    getParent().requestDisallowInterceptTouchEvent(false);
                    Drawable drawable2 = this.f23508w;
                    if (drawable2 instanceof g5) {
                        ((h01) ((g5) drawable2)).f38715f.c(false);
                    }
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (this.A0 && motionEvent.getAction() == 1) {
                    this.f23514z0.onClick(this);
                    Drawable drawable3 = this.f23508w;
                    if (drawable3 instanceof g5) {
                        ((h01) ((g5) drawable3)).f38715f.c(false);
                    }
                }
                this.A0 = false;
                getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        if (super.onTouchEvent(motionEvent) || this.A0) {
            return true;
        }
        return false;
    }

    public void setAlignment(Layout.Alignment alignment) {
        this.H0 = alignment;
        requestLayout();
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f23501r > 1) {
            super.setBackgroundDrawable(drawable);
        } else {
            this.K = drawable;
        }
    }

    public void setBuildFullLayout(boolean z10) {
        this.H = z10;
    }

    public void setCanHideRightDrawable(boolean z10) {
        this.f23511x0 = z10;
    }

    public void setDrawablePadding(int i10) {
        if (this.E == i10) {
            return;
        }
        this.E = i10;
        f();
    }

    public void setEllipsizeByGradient(int i10) {
        if (!this.L) {
            this.f23493j0 = true;
            this.f23495l0 = null;
            m();
            b();
        }
        this.m0 = i10;
        m();
    }

    public void setEmojiCacheType(int i10) {
        if (i10 != this.E0) {
            org.telegram.ui.Components.y5.release(this, this.D0);
            this.E0 = i10;
            if (this.G0) {
                this.D0 = org.telegram.ui.Components.y5.update(i10, this, this.D0, this.f23483c);
            }
        }
    }

    public void setEmojiColor(int i10) {
        this.F0 = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
    }

    public void setFullAlpha(float f9) {
        this.I = f9;
        invalidate();
    }

    public void setFullTextMaxLines(int i10) {
        this.f23505t0 = i10;
    }

    public void setGravity(int i10) {
        this.f23496n = i10;
    }

    public void setLeftDrawable(int i10) {
        setLeftDrawable(i10 == 0 ? null : getContext().getResources().getDrawable(i10));
    }

    public void setLeftDrawableOutside(boolean z10) {
        this.f23490g0 = z10;
    }

    public void setLeftDrawableTopPadding(int i10) {
        this.F = i10;
    }

    public void setLinkTextColor(int i10) {
        this.h.linkColor = i10;
        invalidate();
    }

    public void setMaxLines(int i10) {
        this.f23501r = i10;
    }

    public void setMinWidth(int i10) {
        this.f23498o0 = i10;
    }

    public void setMinusWidth(int i10) {
        if (i10 == this.f23504s0) {
            return;
        }
        this.f23504s0 = i10;
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
        this.f23492i0 = z10;
    }

    public void setRightDrawableOnClick(View.OnClickListener onClickListener) {
        this.f23514z0 = onClickListener;
    }

    public void setRightDrawableOutside(boolean z10) {
        this.f23491h0 = z10;
    }

    public void setRightDrawableScale(float f9) {
        this.D = f9;
    }

    public void setRightDrawableTopPadding(int i10) {
        this.G = i10;
    }

    public void setRightPadding(int i10) {
        if (this.f23497n0 != i10) {
            this.f23497n0 = i10;
            int maxTextWidth = ((getMaxTextWidth() - getPaddingLeft()) - getPaddingRight()) - this.f23504s0;
            Drawable drawable = this.v;
            if (drawable != null && !this.f23490g0) {
                maxTextWidth = (maxTextWidth - drawable.getIntrinsicWidth()) - this.E;
            }
            int i11 = 0;
            if (!this.f23492i0) {
                Drawable drawable2 = this.f23508w;
                if (drawable2 != null && !this.f23491h0) {
                    i11 = (int) (drawable2.getIntrinsicWidth() * this.D);
                    maxTextWidth = (maxTextWidth - i11) - this.E;
                }
                Drawable drawable3 = this.f23510x;
                if (drawable3 != null && !this.f23491h0) {
                    i11 = (int) (drawable3.getIntrinsicWidth() * this.D);
                    maxTextWidth = (maxTextWidth - i11) - this.E;
                }
            }
            if (this.A != null && this.f23512y != null) {
                int indexOf = this.f23503s.toString().indexOf(this.A);
                this.B = indexOf;
                if (indexOf < 0) {
                    maxTextWidth = (maxTextWidth - this.f23512y.getIntrinsicWidth()) - this.E;
                }
            }
            if (this.f23511x0 && i11 != 0 && !this.f23491h0) {
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                if (!this.f23503s.equals(TextUtils.ellipsize(this.f23503s, this.h, maxTextWidth, truncateAt))) {
                    this.f23513y0 = true;
                    maxTextWidth = maxTextWidth + i11 + this.E;
                }
            }
            a(maxTextWidth);
            invalidate();
        }
    }

    public void setScrollNonFitText(boolean z10) {
        if (this.L == z10) {
            return;
        }
        this.L = z10;
        m();
        requestLayout();
        b();
    }

    public void setSideDrawablesColor(int i10) {
        g6.w1(i10, this.f23508w);
        g6.w1(i10, this.v);
    }

    public void setTextColor(int i10) {
        this.h.setColor(i10);
        invalidate();
    }

    public void setTextSize(int i10) {
        setTextSizePx(AndroidUtilities.dp(i10));
    }

    public void setTextSizePx(int i10) {
        float f9 = i10;
        TextPaint textPaint = this.h;
        if (f9 == textPaint.getTextSize()) {
            return;
        }
        textPaint.setTextSize(f9);
        f();
    }

    public void setTypeface(Typeface typeface) {
        this.h.setTypeface(typeface);
    }

    public void setWidthWrapContent(boolean z10) {
        this.J = z10;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f23508w && drawable != this.f23510x && drawable != this.v && !super.verifyDrawable(drawable)) {
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
        if (this.L == z10) {
            return;
        }
        this.f23493j0 = z10;
        this.f23495l0 = null;
        m();
        b();
    }
}
