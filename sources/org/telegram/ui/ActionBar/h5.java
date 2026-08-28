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
import org.telegram.messenger.ll;
import org.telegram.ui.Components.rv0;
import org.telegram.ui.Components.tv0;
import org.telegram.ui.Components.xy;
import org.telegram.ui.g01;
public class h5 extends View implements Drawable.Callback {
    public String A;
    public boolean A0;
    public int B;
    public float B0;
    public float C;
    public float C0;
    public float D;
    public org.telegram.ui.Components.p5 D0;
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
    public float f23458a;
    public int f23459a0;
    public float f23460b;
    public int f23461b0;
    public StaticLayout f23462c;
    public int f23463c0;
    public StaticLayout d;
    public int f23464d0;
    public StaticLayout f23465e;
    public int f23466e0;
    public StaticLayout f23467f;
    public boolean f23468f0;
    public boolean f23469g0;
    public final TextPaint h;
    public boolean f23470h0;
    public boolean f23471i0;
    public boolean f23472j0;
    public boolean f23473k0;
    public Boolean f23474l0;
    public int m0;
    public int f23475n;
    public int f23476n0;
    public int f23477o0;
    public int f23478p0;
    public int f23479q0;
    public int f23480r;
    public float f23481r0;
    public CharSequence f23482s;
    public int f23483s0;
    public int f23484t0;
    public final ArrayList f23485u0;
    public Drawable v;
    public final Stack f23486v0;
    public Drawable f23487w;
    public final Path f23488w0;
    public Drawable f23489x;
    public boolean f23490x0;
    public Drawable f23491y;
    public boolean f23492y0;
    public View.OnClickListener f23493z0;

    public h5(Context context) {
        super(context);
        this.f23475n = 51;
        this.f23480r = 1;
        this.D = 1.0f;
        this.E = AndroidUtilities.dp(4.0f);
        this.m0 = 16;
        this.f23484t0 = 3;
        this.f23485u0 = new ArrayList();
        this.f23486v0 = new Stack();
        this.f23488w0 = new Path();
        this.E0 = 0;
        this.H0 = Layout.Alignment.ALIGN_NORMAL;
        this.h = new TextPaint(1);
        setImportantForAccessibility(1);
    }

    private Layout.Alignment getAlignment() {
        return this.H0;
    }

    public final void a(int i9) {
        int i10;
        StaticLayout staticLayout = this.f23462c;
        if (staticLayout == null) {
            return;
        }
        if (staticLayout.getLineCount() > 0) {
            this.f23459a0 = (int) Math.max(Math.ceil(this.f23462c.getLineWidth(0)), Math.ceil(this.f23462c.getLineRight(0) - this.f23462c.getLineLeft(0)));
            StaticLayout staticLayout2 = this.f23465e;
            boolean z10 = true;
            if (staticLayout2 != null) {
                this.f23463c0 = staticLayout2.getLineBottom(staticLayout2.getLineCount() - 1);
            } else if (this.f23480r > 1 && this.f23462c.getLineCount() > 0) {
                StaticLayout staticLayout3 = this.f23462c;
                this.f23463c0 = staticLayout3.getLineBottom(staticLayout3.getLineCount() - 1);
            } else {
                this.f23463c0 = this.f23462c.getLineBottom(0);
            }
            int i11 = this.f23475n & 7;
            if (i11 == 1) {
                this.V = ((i9 - this.f23459a0) / 2) - ((int) this.f23462c.getLineLeft(0));
            } else if (i11 == 3) {
                StaticLayout staticLayout4 = this.d;
                if (staticLayout4 != null) {
                    this.V = -((int) staticLayout4.getLineLeft(0));
                } else {
                    this.V = -((int) this.f23462c.getLineLeft(0));
                }
            } else if (this.f23462c.getLineLeft(0) == 0.0f) {
                StaticLayout staticLayout5 = this.d;
                if (staticLayout5 != null) {
                    this.V = (int) (i9 - staticLayout5.getLineWidth(0));
                } else {
                    this.V = i9 - this.f23459a0;
                }
            } else {
                this.V = -AndroidUtilities.dp(8.0f);
            }
            this.V = getPaddingLeft() + this.V;
            if (this.f23471i0) {
                Drawable drawable = this.f23487w;
                if (drawable != null && !this.f23470h0) {
                    i10 = (int) (drawable.getIntrinsicWidth() * this.D);
                } else {
                    i10 = 0;
                }
                Drawable drawable2 = this.f23489x;
                if (drawable2 != null && !this.f23470h0) {
                    i10 += (int) (drawable2.getIntrinsicWidth() * this.D);
                }
            } else {
                i10 = 0;
            }
            if (this.f23459a0 + i10 <= i9 - this.f23476n0) {
                z10 = false;
            }
            this.M = z10;
            b();
            StaticLayout staticLayout6 = this.f23465e;
            if (staticLayout6 != null && this.f23478p0 > 0) {
                this.f23481r0 = staticLayout6.getPrimaryHorizontal(0) - this.d.getPrimaryHorizontal(0);
            }
        }
        int i12 = this.B;
        if (i12 >= 0) {
            this.C = this.f23462c.getPrimaryHorizontal(i12);
        } else {
            this.C = 0.0f;
        }
    }

    public final void b() {
        int i9;
        if ((this.L && (this.M || this.N != 0.0f)) || this.f23472j0) {
            i9 = 2;
        } else {
            i9 = 0;
        }
        if (getLayerType() != i9) {
            setLayerType(i9, null);
            invalidate();
        }
    }

    public final void c(Canvas canvas) {
        ArrayList arrayList = this.f23485u0;
        if (arrayList.isEmpty()) {
            return;
        }
        Path path = this.f23488w0;
        path.rewind();
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            int i10 = i9 + 1;
            Rect bounds = ((dh.l) arrayList.get(i9)).getBounds();
            path.addRect(bounds.left, bounds.top, bounds.right, bounds.bottom, Path.Direction.CW);
            i9 = i10;
        }
        canvas.clipPath(path, Region.Op.DIFFERENCE);
    }

    public void d(int i9) {
        int i10;
        int i11;
        int i12;
        CharSequence charSequence;
        int dp;
        CharSequence charSequence2;
        int i13;
        int dp2;
        CharSequence charSequence3;
        int dp3;
        int dp4;
        int dp5;
        Drawable drawable;
        Drawable drawable2;
        Stack stack = this.f23486v0;
        ArrayList arrayList = this.f23485u0;
        CharSequence charSequence4 = this.f23482s;
        this.B = -1;
        this.f23492y0 = false;
        if (charSequence4 != null) {
            try {
                Drawable drawable3 = this.v;
                if (drawable3 != null && !this.f23469g0) {
                    drawable3.getIntrinsicWidth();
                    i10 = (i9 - this.v.getIntrinsicWidth()) - this.E;
                } else {
                    i10 = i9;
                }
                if (!this.f23471i0) {
                    if (this.f23487w != null && !this.f23470h0) {
                        i11 = (int) (drawable.getIntrinsicWidth() * this.D);
                        i10 = (i10 - i11) - this.E;
                    } else {
                        i11 = 0;
                    }
                    if (this.f23489x != null && !this.f23470h0) {
                        i11 += (int) (drawable2.getIntrinsicWidth() * this.D);
                        i10 = (i10 - i11) - this.E;
                    }
                } else {
                    i11 = 0;
                }
                SpannableStringBuilder spannableStringBuilder = charSequence4;
                if (this.A != null) {
                    spannableStringBuilder = charSequence4;
                    if (this.f23491y != null) {
                        int indexOf = charSequence4.toString().indexOf(this.A);
                        this.B = indexOf;
                        if (indexOf >= 0) {
                            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence4);
                            org.telegram.ui.Cells.p2 p2Var = new org.telegram.ui.Cells.p2(this.f23491y.getIntrinsicWidth());
                            int i14 = this.B;
                            valueOf.setSpan(p2Var, i14, this.A.length() + i14, 0);
                            spannableStringBuilder = valueOf;
                        } else {
                            i10 = (i10 - this.f23491y.getIntrinsicWidth()) - this.E;
                            spannableStringBuilder = charSequence4;
                        }
                    }
                }
                CharSequence charSequence5 = spannableStringBuilder;
                boolean z10 = this.f23490x0;
                TextPaint textPaint = this.h;
                if (z10 && i11 != 0 && !this.f23470h0 && !charSequence5.equals(TextUtils.ellipsize(charSequence5, textPaint, i10, TextUtils.TruncateAt.END))) {
                    this.f23492y0 = true;
                    i10 = i10 + i11 + this.E;
                }
                int i15 = i10;
                if (this.H) {
                    if (!this.f23472j0) {
                        charSequence2 = TextUtils.ellipsize(charSequence5, textPaint, i15, TextUtils.TruncateAt.END);
                    } else {
                        charSequence2 = charSequence5;
                    }
                    if (!this.f23472j0 && !charSequence2.equals(charSequence5)) {
                        Layout.Alignment alignment = getAlignment();
                        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                        StaticLayout c10 = rv0.c(charSequence5, textPaint, i15, alignment, 0.0f, false, truncateAt, i15, this.f23484t0, false);
                        i13 = i15;
                        this.f23465e = c10;
                        if (c10 != null) {
                            int lineEnd = c10.getLineEnd(0);
                            int lineStart = this.f23465e.getLineStart(1);
                            CharSequence subSequence = charSequence5.subSequence(0, lineEnd);
                            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(charSequence5);
                            valueOf2.setSpan(new xy(false), 0, lineStart, 0);
                            if (lineEnd < charSequence2.length()) {
                                charSequence3 = charSequence2.subSequence(lineEnd, charSequence2.length());
                            } else {
                                charSequence3 = "…";
                            }
                            int length = charSequence2.length();
                            if (this.L) {
                                dp3 = AndroidUtilities.dp(2000.0f);
                            } else {
                                dp3 = i13 + AndroidUtilities.dp(8.0f);
                            }
                            this.d = new StaticLayout(charSequence2, 0, length, textPaint, dp3, getAlignment(), 1.0f, 0.0f, false);
                            int length2 = subSequence.length();
                            if (this.L) {
                                dp4 = AndroidUtilities.dp(2000.0f);
                            } else {
                                dp4 = i13 + AndroidUtilities.dp(8.0f);
                            }
                            StaticLayout staticLayout = new StaticLayout(subSequence, 0, length2, textPaint, dp4, getAlignment(), 1.0f, 0.0f, false);
                            this.f23462c = staticLayout;
                            String str = charSequence3;
                            if (staticLayout.getLineLeft(0) != 0.0f) {
                                str = "\u200f" + ((Object) charSequence3);
                            }
                            CharSequence charSequence6 = str;
                            int length3 = charSequence6.length();
                            if (this.L) {
                                dp5 = AndroidUtilities.dp(2000.0f);
                            } else {
                                dp5 = i13 + AndroidUtilities.dp(8.0f);
                            }
                            this.f23467f = new StaticLayout(charSequence6, 0, length3, textPaint, dp5, getAlignment(), 1.0f, 0.0f, false);
                            this.f23465e = rv0.c(valueOf2, textPaint, i13 + AndroidUtilities.dp(8.0f) + this.f23478p0, getAlignment(), 0.0f, false, truncateAt, i13 + this.f23478p0, this.f23484t0, false);
                        }
                    } else {
                        i13 = i15;
                        CharSequence charSequence7 = charSequence2;
                        int length4 = charSequence7.length();
                        if (!this.L && !this.f23472j0) {
                            dp2 = i13 + AndroidUtilities.dp(8.0f);
                            this.f23462c = new StaticLayout(charSequence7, 0, length4, textPaint, dp2, getAlignment(), 1.0f, 0.0f, false);
                            this.f23465e = null;
                            this.f23467f = null;
                            this.d = null;
                        }
                        dp2 = AndroidUtilities.dp(2000.0f);
                        this.f23462c = new StaticLayout(charSequence7, 0, length4, textPaint, dp2, getAlignment(), 1.0f, 0.0f, false);
                        this.f23465e = null;
                        this.f23467f = null;
                        this.d = null;
                    }
                    i12 = i13;
                } else if (this.f23480r > 1) {
                    StaticLayout c11 = rv0.c(charSequence5, textPaint, i15, getAlignment(), 0.0f, false, TextUtils.TruncateAt.END, i15, this.f23480r, false);
                    i12 = i15;
                    this.f23462c = c11;
                } else {
                    i12 = i15;
                    if (!this.L && !this.f23472j0) {
                        charSequence = TextUtils.ellipsize(charSequence5, textPaint, i12, TextUtils.TruncateAt.END);
                        int length5 = charSequence.length();
                        if (!this.L && !this.f23472j0) {
                            dp = AndroidUtilities.dp(8.0f) + i12;
                            this.f23462c = new StaticLayout(charSequence, 0, length5, textPaint, dp, getAlignment(), 1.0f, 0.0f, false);
                        }
                        dp = AndroidUtilities.dp(2000.0f);
                        this.f23462c = new StaticLayout(charSequence, 0, length5, textPaint, dp, getAlignment(), 1.0f, 0.0f, false);
                    }
                    charSequence = charSequence5;
                    int length52 = charSequence.length();
                    if (!this.L) {
                        dp = AndroidUtilities.dp(8.0f) + i12;
                        this.f23462c = new StaticLayout(charSequence, 0, length52, textPaint, dp, getAlignment(), 1.0f, 0.0f, false);
                    }
                    dp = AndroidUtilities.dp(2000.0f);
                    this.f23462c = new StaticLayout(charSequence, 0, length52, textPaint, dp, getAlignment(), 1.0f, 0.0f, false);
                }
                stack.addAll(arrayList);
                arrayList.clear();
                StaticLayout staticLayout2 = this.f23462c;
                if (staticLayout2 != null && (staticLayout2.getText() instanceof Spannable)) {
                    dh.l.b(this, this.f23462c, -2, -2, stack, arrayList);
                }
                a(i12);
            } catch (Exception unused) {
            }
        } else {
            this.f23462c = null;
            this.f23459a0 = 0;
            this.f23463c0 = 0;
        }
        org.telegram.ui.Components.t5.release(this, this.D0);
        if (this.G0) {
            this.D0 = org.telegram.ui.Components.t5.update(this.E0, this, this.D0, this.f23462c);
        }
        invalidate();
    }

    public final void e(Canvas canvas) {
        float f10 = this.I;
        int i9 = 0;
        ArrayList arrayList = this.f23485u0;
        if (f10 > 0.0f && this.f23479q0 != 0) {
            canvas.save();
            float f11 = this.I;
            canvas.translate((this.f23481r0 * f11) + ((-this.f23479q0) * f11), 0.0f);
            float f12 = this.f23458a;
            float f13 = this.I;
            this.f23458a = aa.d.w(this.f23481r0, f13, (-this.f23479q0) * f13, f12);
            canvas.save();
            c(canvas);
            org.telegram.ui.Components.p5 p5Var = this.D0;
            if (p5Var != null) {
                p5Var.a();
            }
            this.f23462c.draw(canvas);
            canvas.restore();
            org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas, this.f23462c, this.D0, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.F0);
            int size = arrayList.size();
            while (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
                ((dh.l) obj).draw(canvas);
            }
            canvas.restore();
            return;
        }
        canvas.save();
        c(canvas);
        org.telegram.ui.Components.p5 p5Var2 = this.D0;
        if (p5Var2 != null) {
            p5Var2.a();
        }
        this.f23462c.draw(canvas);
        canvas.restore();
        org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas, this.f23462c, this.D0, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.F0);
        int size2 = arrayList.size();
        while (i9 < size2) {
            Object obj2 = arrayList.get(i9);
            i9++;
            ((dh.l) obj2).draw(canvas);
        }
    }

    public final boolean f() {
        if (this.f23468f0 && getMeasuredHeight() != 0 && !this.H) {
            d(((getMaxTextWidth() - getPaddingLeft()) - getPaddingRight()) - this.f23483s0);
            if ((this.f23475n & 112) == 16) {
                this.W = (getMeasuredHeight() - this.f23463c0) / 2;
                return true;
            }
            this.W = getPaddingTop();
            return true;
        }
        requestLayout();
        return true;
    }

    public final void g(tv0 tv0Var, String str) {
        Drawable drawable = this.f23491y;
        if (drawable == tv0Var) {
            return;
        }
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f23491y = tv0Var;
        if (tv0Var != null) {
            tv0Var.setCallback(this);
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
        int i9;
        float measureText = getPaint().measureText(getText().toString()) + getSideDrawablesSize();
        if (this.v == null && this.f23487w == null && this.f23489x == null) {
            i9 = 0;
        } else {
            i9 = this.E;
        }
        return measureText - i9;
    }

    public float getExactWidthIncludeDrawables() {
        int i9;
        int i10;
        float exactWidth = getExactWidth();
        Drawable drawable = this.v;
        int i11 = 0;
        if (drawable != null) {
            i9 = drawable.getIntrinsicWidth();
        } else {
            i9 = 0;
        }
        float f10 = exactWidth + i9;
        Drawable drawable2 = this.f23487w;
        if (drawable2 != null) {
            i10 = drawable2.getIntrinsicWidth();
        } else {
            i10 = 0;
        }
        float f11 = f10 + i10;
        Drawable drawable3 = this.f23489x;
        if (drawable3 != null) {
            i11 = drawable3.getIntrinsicWidth();
        }
        return f11 + i11;
    }

    public float getFullAlpha() {
        return this.I;
    }

    public Layout getLayout() {
        return this.f23462c;
    }

    public float getLayoutX() {
        return this.f23458a;
    }

    public float getLayoutY() {
        return this.f23460b;
    }

    public Drawable getLeftDrawable() {
        return this.v;
    }

    public int getLineCount() {
        int i9;
        StaticLayout staticLayout = this.f23462c;
        if (staticLayout != null) {
            i9 = staticLayout.getLineCount();
        } else {
            i9 = 0;
        }
        StaticLayout staticLayout2 = this.f23465e;
        if (staticLayout2 != null) {
            return staticLayout2.getLineCount() + i9;
        }
        return i9;
    }

    public int getMaxTextWidth() {
        int i9;
        Drawable drawable;
        Drawable drawable2;
        int measuredWidth = getMeasuredWidth();
        int i10 = 0;
        if (this.f23470h0 && (drawable2 = this.f23487w) != null) {
            i9 = drawable2.getIntrinsicWidth() + this.E;
        } else {
            i9 = 0;
        }
        int i11 = measuredWidth - i9;
        if (this.f23470h0 && (drawable = this.f23489x) != null) {
            i10 = this.E + drawable.getIntrinsicWidth();
        }
        return i11 - i10;
    }

    public TextPaint getPaint() {
        return this.h;
    }

    public Drawable getRightDrawable() {
        return this.f23487w;
    }

    public Drawable getRightDrawable2() {
        return this.f23489x;
    }

    public boolean getRightDrawableOutside() {
        return this.f23470h0;
    }

    public int getRightDrawableWidth() {
        Drawable drawable = this.f23487w;
        if (drawable == null) {
            return 0;
        }
        return (int) ((drawable.getIntrinsicWidth() * this.D) + this.E);
    }

    public int getRightDrawableX() {
        return this.f23464d0;
    }

    public int getRightDrawableY() {
        return this.f23466e0;
    }

    public int getSideDrawablesSize() {
        int i9;
        Drawable drawable = this.v;
        if (drawable != null) {
            i9 = drawable.getIntrinsicWidth() + this.E;
        } else {
            i9 = 0;
        }
        Drawable drawable2 = this.f23487w;
        if (drawable2 != null) {
            i9 += ((int) (drawable2.getIntrinsicWidth() * this.D)) + this.E;
        }
        Drawable drawable3 = this.f23489x;
        if (drawable3 != null) {
            return ((int) (drawable3.getIntrinsicWidth() * this.D)) + this.E + i9;
        }
        return i9;
    }

    public CharSequence getText() {
        CharSequence charSequence = this.f23482s;
        if (charSequence == null) {
            return "";
        }
        return charSequence;
    }

    public int getTextColor() {
        return this.h.getColor();
    }

    public int getTextHeight() {
        return this.f23463c0;
    }

    public TextPaint getTextPaint() {
        return this.h;
    }

    public int getTextStartX() {
        int i9 = 0;
        if (this.f23462c == null) {
            return 0;
        }
        Drawable drawable = this.v;
        if (drawable != null && (this.f23475n & 7) == 3) {
            i9 = this.E + drawable.getIntrinsicWidth();
        }
        Drawable drawable2 = this.f23491y;
        if (drawable2 != null && this.B < 0 && (this.f23475n & 7) == 3) {
            i9 += drawable2.getIntrinsicWidth() + this.E;
        }
        return ((int) getX()) + this.V + i9;
    }

    public int getTextStartY() {
        if (this.f23462c == null) {
            return 0;
        }
        return (int) getY();
    }

    public int getTextWidth() {
        int i9;
        int i10 = this.f23459a0;
        int i11 = 0;
        if (this.f23471i0) {
            Drawable drawable = this.f23487w;
            if (drawable != null) {
                i9 = (int) (drawable.getIntrinsicWidth() * this.D);
            } else {
                i9 = 0;
            }
            Drawable drawable2 = this.f23489x;
            if (drawable2 != null) {
                i11 = (int) (drawable2.getIntrinsicWidth() * this.D);
            }
            i11 += i9;
        }
        return i10 + i11;
    }

    public final void h(int i9, int i10) {
        if (this.f23478p0 == i9 && this.f23479q0 == i10) {
            return;
        }
        this.f23478p0 = i9;
        this.f23479q0 = i10;
        d(((getMaxTextWidth() - getPaddingLeft()) - getPaddingRight()) - this.f23483s0);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final boolean i(Drawable drawable) {
        Drawable drawable2 = this.f23487w;
        if (drawable2 == drawable) {
            return false;
        }
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f23487w = drawable;
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
        Drawable drawable3 = this.f23487w;
        if (drawable == drawable3) {
            invalidate(drawable3.getBounds());
            return;
        }
        Drawable drawable4 = this.f23489x;
        if (drawable == drawable4) {
            invalidate(drawable4.getBounds());
            return;
        }
        Drawable drawable5 = this.f23491y;
        if (drawable == drawable5) {
            invalidate(drawable5.getBounds());
        }
    }

    public final boolean j(Drawable drawable) {
        Drawable drawable2 = this.f23489x;
        if (drawable2 == drawable) {
            return false;
        }
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f23489x = drawable;
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
        CharSequence charSequence2 = this.f23482s;
        if (charSequence2 != null || charSequence != null) {
            if (!z10 && charSequence2 != null && charSequence2.equals(charSequence)) {
                return false;
            }
            this.f23482s = charSequence;
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
        Boolean bool = this.f23474l0;
        if (bool != null) {
            z10 = bool.booleanValue();
        } else {
            z10 = false;
        }
        if ((this.S == null || this.T != AndroidUtilities.dp(this.m0) || this.f23473k0 != z10) && this.f23472j0) {
            if (this.S == null) {
                this.S = new Paint();
            }
            this.f23473k0 = z10;
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
        this.D0 = org.telegram.ui.Components.t5.update(this.E0, this, this.D0, this.f23462c);
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.G0 = false;
        org.telegram.ui.Components.t5.release(this, this.D0);
        this.f23468f0 = false;
    }

    @Override
    public void onDraw(Canvas canvas) {
        boolean z10;
        int i9;
        Drawable drawable;
        float f10;
        float f11;
        int i10;
        Drawable drawable2;
        int d;
        int i11;
        int i12;
        int d9;
        int i13;
        int d10;
        int i14;
        float f12;
        float f13;
        float f14;
        Drawable drawable3;
        float f15;
        boolean z11;
        float f16;
        Drawable drawable4;
        int d11;
        int i15;
        int d12;
        int i16;
        float f17;
        float f18;
        Drawable drawable5;
        Drawable drawable6;
        Drawable drawable7;
        int d13;
        int i17;
        int d14;
        int i18;
        int intrinsicHeight;
        Drawable drawable8;
        int d15;
        int i19;
        int d16;
        int i20;
        int intrinsicHeight2;
        int intrinsicHeight3;
        super.onDraw(canvas);
        this.f23458a = 0.0f;
        this.f23460b = 0.0f;
        if (this.L && (this.M || this.N != 0.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f23461b0 = this.f23459a0;
        Drawable drawable9 = this.v;
        if (drawable9 != null && !this.f23469g0) {
            int i21 = (int) (-this.N);
            int i22 = this.f23475n;
            if ((i22 & 7) == 1) {
                i21 += this.V;
            }
            if ((i22 & 112) == 16) {
                intrinsicHeight3 = ((getMeasuredHeight() - this.v.getIntrinsicHeight()) / 2) + this.F;
            } else {
                intrinsicHeight3 = this.F + ((this.f23463c0 - this.v.getIntrinsicHeight()) / 2) + getPaddingTop();
            }
            Drawable drawable10 = this.v;
            drawable10.setBounds(i21, intrinsicHeight3, drawable10.getIntrinsicWidth() + i21, this.v.getIntrinsicHeight() + intrinsicHeight3);
            this.v.draw(canvas);
            int i23 = this.f23475n & 7;
            if (i23 != 3 && i23 != 1) {
                i9 = 0;
            } else {
                i9 = this.v.getIntrinsicWidth() + this.E;
            }
            this.f23461b0 = this.v.getIntrinsicWidth() + this.E + this.f23461b0;
        } else if (this.f23469g0 && drawable9 != null) {
            i9 = this.E + drawable9.getIntrinsicWidth();
        } else {
            i9 = 0;
        }
        Drawable drawable11 = this.f23491y;
        if (drawable11 != null && this.A != null) {
            int i24 = (int) ((-this.N) + this.C);
            int i25 = this.f23475n;
            if ((i25 & 7) == 1) {
                i24 += this.V;
            }
            if ((i25 & 112) == 16) {
                intrinsicHeight2 = ((getMeasuredHeight() - this.f23491y.getIntrinsicHeight()) / 2) + this.F;
            } else {
                intrinsicHeight2 = this.F + ((this.f23463c0 - drawable11.getIntrinsicHeight()) / 2);
            }
            Drawable drawable12 = this.f23491y;
            drawable12.setBounds(i24, intrinsicHeight2, drawable12.getIntrinsicWidth() + i24, this.f23491y.getIntrinsicHeight() + intrinsicHeight2);
            this.f23491y.draw(canvas);
            if (this.B < 0) {
                int i26 = this.f23475n & 7;
                if (i26 == 3 || i26 == 1) {
                    i9 += this.f23491y.getIntrinsicWidth() + this.E;
                }
                this.f23461b0 = this.f23491y.getIntrinsicWidth() + this.E + this.f23461b0;
            }
        }
        int i27 = i9;
        if (this.f23487w != null && !this.f23492y0 && this.D > 0.0f && !this.f23470h0 && !this.f23471i0) {
            int i28 = this.f23459a0 + i27 + this.E + ((int) (-this.N));
            int i29 = this.f23475n & 7;
            if (i29 == 1 || i29 == 5) {
                i28 += this.V;
            }
            int intrinsicWidth = (int) (drawable.getIntrinsicWidth() * this.D);
            int intrinsicHeight4 = (int) (this.f23487w.getIntrinsicHeight() * this.D);
            if ((this.f23475n & 112) == 16) {
                d16 = (getMeasuredHeight() - intrinsicHeight4) / 2;
                i20 = this.G;
            } else {
                d16 = j3.r0.d(this.f23463c0, intrinsicHeight4, 2, getPaddingTop());
                i20 = this.G;
            }
            int i30 = d16 + i20;
            f10 = 0.0f;
            this.f23487w.setBounds(i28, i30, i28 + intrinsicWidth, i30 + intrinsicHeight4);
            this.f23464d0 = i28 + (intrinsicWidth >> 1);
            this.f23466e0 = i30 + (intrinsicHeight4 >> 1);
            this.f23487w.draw(canvas);
            this.f23461b0 = this.E + intrinsicWidth + this.f23461b0;
        } else {
            f10 = 0.0f;
        }
        if (this.f23489x != null && !this.f23492y0 && this.D > f10 && !this.f23470h0 && !this.f23471i0) {
            int i31 = this.f23459a0 + i27 + this.E + ((int) (-this.N));
            if (this.f23487w != null) {
                i31 += ((int) (drawable8.getIntrinsicWidth() * this.D)) + this.E;
            }
            int i32 = this.f23475n & 7;
            if (i32 == 1 || i32 == 5) {
                i31 += this.V;
            }
            int intrinsicWidth2 = (int) (this.f23489x.getIntrinsicWidth() * this.D);
            int intrinsicHeight5 = (int) (this.f23489x.getIntrinsicHeight() * this.D);
            if ((this.f23475n & 112) == 16) {
                d15 = (getMeasuredHeight() - intrinsicHeight5) / 2;
                i19 = this.G;
            } else {
                d15 = j3.r0.d(this.f23463c0, intrinsicHeight5, 2, getPaddingTop());
                i19 = this.G;
            }
            int i33 = d15 + i19;
            this.f23489x.setBounds(i31, i33, i31 + intrinsicWidth2, intrinsicHeight5 + i33);
            this.f23489x.draw(canvas);
            this.f23461b0 = this.E + intrinsicWidth2 + this.f23461b0;
        }
        int dp = AndroidUtilities.dp(16.0f) + this.f23461b0;
        float f19 = this.N;
        if (f19 != f10) {
            if (this.v != null && !this.f23469g0) {
                int i34 = ((int) (-f19)) + dp;
                if ((this.f23475n & 112) == 16) {
                    intrinsicHeight = ((getMeasuredHeight() - this.v.getIntrinsicHeight()) / 2) + this.F;
                } else {
                    intrinsicHeight = this.F + ((this.f23463c0 - this.v.getIntrinsicHeight()) / 2) + getPaddingTop();
                }
                Drawable drawable13 = this.v;
                drawable13.setBounds(i34, intrinsicHeight, drawable13.getIntrinsicWidth() + i34, this.v.getIntrinsicHeight() + intrinsicHeight);
                this.v.draw(canvas);
            }
            if (this.f23487w != null && !this.f23470h0) {
                int intrinsicWidth3 = (int) (drawable5.getIntrinsicWidth() * this.D);
                int intrinsicHeight6 = (int) (this.f23487w.getIntrinsicHeight() * this.D);
                int i35 = this.f23459a0 + i27 + this.E + ((int) (-this.N)) + dp;
                if ((this.f23475n & 112) == 16) {
                    d14 = (getMeasuredHeight() - intrinsicHeight6) / 2;
                    i18 = this.G;
                } else {
                    d14 = j3.r0.d(this.f23463c0, intrinsicHeight6, 2, getPaddingTop());
                    i18 = this.G;
                }
                int i36 = d14 + i18;
                f11 = 16.0f;
                this.f23487w.setBounds(i35, i36, i35 + intrinsicWidth3, i36 + intrinsicHeight6);
                this.f23464d0 = i35 + (intrinsicWidth3 >> 1);
                this.f23466e0 = i36 + (intrinsicHeight6 >> 1);
                this.f23487w.draw(canvas);
            } else {
                f11 = 16.0f;
            }
            if (this.f23489x != null && !this.f23470h0) {
                int intrinsicWidth4 = (int) (drawable6.getIntrinsicWidth() * this.D);
                int intrinsicHeight7 = (int) (this.f23489x.getIntrinsicHeight() * this.D);
                int i37 = this.f23459a0 + i27 + this.E + ((int) (-this.N)) + dp;
                if (this.f23487w != null) {
                    i37 += ((int) (drawable7.getIntrinsicWidth() * this.D)) + this.E;
                }
                if ((this.f23475n & 112) == 16) {
                    d13 = (getMeasuredHeight() - intrinsicHeight7) / 2;
                    i17 = this.G;
                } else {
                    d13 = j3.r0.d(this.f23463c0, intrinsicHeight7, 2, getPaddingTop());
                    i17 = this.G;
                }
                int i38 = d13 + i17;
                this.f23489x.setBounds(i37, i38, intrinsicWidth4 + i37, intrinsicHeight7 + i38);
                this.f23489x.draw(canvas);
            }
        } else {
            f11 = 16.0f;
        }
        if (this.f23462c != null) {
            if (this.f23469g0 || this.f23470h0 || this.f23472j0 || this.f23476n0 > 0) {
                canvas.save();
                int maxTextWidth = getMaxTextWidth() - this.f23476n0;
                Drawable drawable14 = this.f23487w;
                if (drawable14 != null && !(drawable14 instanceof org.telegram.ui.Components.i5) && this.f23470h0) {
                    f12 = 2.0f;
                } else {
                    f12 = 0.0f;
                }
                canvas.clipRect(i27, 0, maxTextWidth - AndroidUtilities.dp(f12), getMeasuredHeight());
            }
            Emoji.emojiDrawingUseAlpha = false;
            if (this.K != null) {
                int i39 = this.f23459a0;
                int i40 = (i39 / 2) + ((int) ((this.V + i27) - this.N));
                int max = Math.max(getPaddingRight() + getPaddingLeft() + i39, this.f23477o0);
                int i41 = i40 - (max / 2);
                this.K.setBounds(i41, 0, max + i41, getMeasuredHeight());
                this.K.draw(canvas);
            }
            if (this.V + i27 != 0 || this.W != 0 || this.N != f10) {
                canvas.save();
                canvas.translate((this.V + i27) - this.N, this.W);
                this.f23458a = ((this.V + i27) - this.N) + this.f23458a;
                this.f23460b += this.W;
            }
            e(canvas);
            StaticLayout staticLayout = this.f23467f;
            TextPaint textPaint = this.h;
            if (staticLayout != null && this.I < 1.0f) {
                int alpha = textPaint.getAlpha();
                textPaint.setAlpha((int) ((1.0f - this.I) * 255.0f));
                canvas.save();
                if (this.f23467f.getText().length() == 1) {
                    if (this.f23484t0 == 1) {
                        f18 = 0.5f;
                    } else {
                        f18 = 4.0f;
                    }
                    f17 = AndroidUtilities.dp(f18);
                } else {
                    f17 = 0.0f;
                }
                if (this.f23462c.getLineLeft(0) != f10) {
                    canvas.translate((-this.f23462c.getLineWidth(0)) + f17, 0.0f);
                    f13 = 0.0f;
                } else {
                    f13 = 0.0f;
                    canvas.translate(this.f23462c.getLineWidth(0) - f17, 0.0f);
                }
                float f20 = this.I;
                canvas.translate((this.f23481r0 * f20) + ((-this.f23479q0) * f20), f13);
                this.f23467f.draw(canvas);
                canvas.restore();
                textPaint.setAlpha(alpha);
            } else {
                f13 = 0.0f;
            }
            if (this.f23465e != null && this.I > f13) {
                int alpha2 = textPaint.getAlpha();
                textPaint.setAlpha((int) (this.I * 255.0f));
                float f21 = this.I;
                float f22 = this.f23481r0;
                float f23 = ((f21 * f22) + ((-this.f23479q0) * f21)) - f22;
                f14 = 0.0f;
                canvas.translate(f23, 0.0f);
                this.f23465e.draw(canvas);
                textPaint.setAlpha(alpha2);
            } else {
                f14 = 0.0f;
            }
            if (this.N != f14) {
                canvas.translate(dp, f14);
                e(canvas);
            }
            if (this.V + i27 != 0 || this.W != 0 || this.N != f14) {
                canvas.restore();
            }
            if (this.f23487w != null && !this.f23492y0 && this.D > 0.0f && !this.f23470h0 && this.f23471i0) {
                int i42 = this.f23459a0 + i27 + this.E + ((int) (-this.N));
                int i43 = this.f23475n & 7;
                if (i43 == 1 || i43 == 5) {
                    i42 += this.V;
                }
                int intrinsicWidth5 = (int) (drawable3.getIntrinsicWidth() * this.D);
                int intrinsicHeight8 = (int) (this.f23487w.getIntrinsicHeight() * this.D);
                if ((this.f23475n & 112) == 16) {
                    d12 = (getMeasuredHeight() - intrinsicHeight8) / 2;
                    i16 = this.G;
                } else {
                    d12 = j3.r0.d(this.f23463c0, intrinsicHeight8, 2, getPaddingTop());
                    i16 = this.G;
                }
                int i44 = d12 + i16;
                this.f23487w.setBounds(i42, i44, i42 + intrinsicWidth5, i44 + intrinsicHeight8);
                this.f23464d0 = i42 + (intrinsicWidth5 >> 1);
                this.f23466e0 = i44 + (intrinsicHeight8 >> 1);
                this.f23487w.draw(canvas);
                this.f23461b0 = this.E + intrinsicWidth5 + this.f23461b0;
            }
            if (this.f23489x != null && !this.f23492y0 && this.D > 0.0f && !this.f23470h0 && this.f23471i0) {
                int i45 = this.f23459a0 + i27 + this.E + ((int) (-this.N));
                if (this.f23487w != null) {
                    i45 += ((int) (drawable4.getIntrinsicWidth() * this.D)) + this.E;
                }
                int i46 = this.f23475n & 7;
                if (i46 == 1 || i46 == 5) {
                    i45 += this.V;
                }
                int intrinsicWidth6 = (int) (this.f23489x.getIntrinsicWidth() * this.D);
                int intrinsicHeight9 = (int) (this.f23489x.getIntrinsicHeight() * this.D);
                if ((this.f23475n & 112) == 16) {
                    d11 = (getMeasuredHeight() - intrinsicHeight9) / 2;
                    i15 = this.G;
                } else {
                    d11 = j3.r0.d(this.f23463c0, intrinsicHeight9, 2, getPaddingTop());
                    i15 = this.G;
                }
                int i47 = d11 + i15;
                this.f23489x.setBounds(i45, i47, i45 + intrinsicWidth6, intrinsicHeight9 + i47);
                this.f23489x.draw(canvas);
                this.f23461b0 = this.E + intrinsicWidth6 + this.f23461b0;
            }
            if (z10) {
                if (this.N < AndroidUtilities.dp(10.0f)) {
                    this.Q.setAlpha((int) ((this.N / AndroidUtilities.dp(10.0f)) * 255.0f));
                } else {
                    if (this.N > (AndroidUtilities.dp(f11) + this.f23461b0) - AndroidUtilities.dp(10.0f)) {
                        this.Q.setAlpha((int) ll.v(this.N - ((AndroidUtilities.dp(f11) + this.f23461b0) - AndroidUtilities.dp(10.0f)), AndroidUtilities.dp(10.0f), 1.0f, 255.0f));
                    } else {
                        this.Q.setAlpha(255);
                    }
                }
                canvas.drawRect(i27, 0.0f, AndroidUtilities.dp(6.0f) + i27, getMeasuredHeight(), this.Q);
                canvas.save();
                canvas.translate((getMaxTextWidth() - this.f23476n0) - AndroidUtilities.dp(6.0f), 0.0f);
                canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(6.0f), getMeasuredHeight(), this.R);
                canvas.restore();
            } else if (this.f23472j0 && this.M && this.S != null) {
                canvas.save();
                m();
                if (!this.f23473k0) {
                    int maxTextWidth2 = (getMaxTextWidth() - this.f23476n0) - this.T;
                    Drawable drawable15 = this.f23487w;
                    if (drawable15 != null && !(drawable15 instanceof org.telegram.ui.Components.i5) && this.f23470h0) {
                        f15 = 2.0f;
                    } else {
                        f15 = 0.0f;
                    }
                    canvas.translate(maxTextWidth2 - AndroidUtilities.dp(f15), 0.0f);
                }
                canvas.drawRect(i27, 0.0f, this.T, getMeasuredHeight(), this.S);
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
                int i48 = this.P;
                if (i48 > 0) {
                    this.P = (int) (i48 - j10);
                    z11 = true;
                } else {
                    int dp2 = AndroidUtilities.dp(f11) + this.f23461b0;
                    if (this.N < AndroidUtilities.dp(100.0f)) {
                        f16 = org.telegram.ui.Cells.j2.b(this.N, AndroidUtilities.dp(100.0f), 20.0f, 30.0f);
                        z11 = true;
                    } else {
                        z11 = true;
                        if (this.N >= dp2 - AndroidUtilities.dp(100.0f)) {
                            f16 = ll.c(this.N - (dp2 - AndroidUtilities.dp(100.0f)), AndroidUtilities.dp(100.0f), 20.0f, 50.0f);
                        } else {
                            f16 = 50.0f;
                        }
                    }
                    float dp3 = ((((float) j10) / 1000.0f) * AndroidUtilities.dp(f16)) + this.N;
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
            if (this.f23469g0 || this.f23470h0 || this.f23472j0 || this.f23476n0 > 0) {
                canvas.restore();
            }
        }
        Drawable drawable16 = this.v;
        if (drawable16 != null && this.f23469g0) {
            int intrinsicWidth7 = drawable16.getIntrinsicWidth();
            int intrinsicHeight10 = this.v.getIntrinsicHeight();
            if ((this.f23475n & 112) == 16) {
                d10 = (getMeasuredHeight() - intrinsicHeight10) / 2;
                i14 = this.F;
            } else {
                d10 = j3.r0.d(this.f23463c0, intrinsicHeight10, 2, getPaddingTop());
                i14 = this.F;
            }
            int i49 = d10 + i14;
            this.v.setBounds(0, i49, intrinsicWidth7, intrinsicHeight10 + i49);
            this.v.draw(canvas);
        }
        if (this.f23487w != null && this.f23470h0) {
            int i50 = this.f23459a0 + i27 + this.E;
            float f24 = this.N;
            if (f24 == 0.0f) {
                i12 = -dp;
            } else {
                i12 = (int) (-f24);
            }
            int min = Math.min(i50 + i12 + dp, (getMaxTextWidth() - this.f23476n0) + this.E);
            int intrinsicWidth8 = (int) (this.f23487w.getIntrinsicWidth() * this.D);
            int intrinsicHeight11 = (int) (this.f23487w.getIntrinsicHeight() * this.D);
            if ((this.f23475n & 112) == 16) {
                d9 = (getMeasuredHeight() - intrinsicHeight11) / 2;
                i13 = this.G;
            } else {
                d9 = j3.r0.d(this.f23463c0, intrinsicHeight11, 2, getPaddingTop());
                i13 = this.G;
            }
            int i51 = d9 + i13;
            this.f23487w.setBounds(min, i51, min + intrinsicWidth8, i51 + intrinsicHeight11);
            this.f23464d0 = min + (intrinsicWidth8 >> 1);
            this.f23466e0 = i51 + (intrinsicHeight11 >> 1);
            this.f23487w.draw(canvas);
        }
        if (this.f23489x != null && this.f23470h0) {
            int i52 = i27 + this.f23459a0 + this.E;
            float f25 = this.N;
            if (f25 == 0.0f) {
                i10 = -dp;
            } else {
                i10 = (int) (-f25);
            }
            int min2 = Math.min(i52 + i10 + dp, (getMaxTextWidth() - this.f23476n0) + this.E);
            if (this.f23487w != null) {
                min2 += ((int) (drawable2.getIntrinsicWidth() * this.D)) + this.E;
            }
            int intrinsicWidth9 = (int) (this.f23489x.getIntrinsicWidth() * this.D);
            int intrinsicHeight12 = (int) (this.f23489x.getIntrinsicHeight() * this.D);
            if ((this.f23475n & 112) == 16) {
                d = (getMeasuredHeight() - intrinsicHeight12) / 2;
                i11 = this.G;
            } else {
                d = j3.r0.d(this.f23463c0, intrinsicHeight12, 2, getPaddingTop());
                i11 = this.G;
            }
            int i53 = d + i11;
            this.f23489x.setBounds(min2, i53, intrinsicWidth9 + min2, intrinsicHeight12 + i53);
            this.f23489x.draw(canvas);
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setVisibleToUser(true);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setText(this.f23482s);
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        this.f23468f0 = true;
    }

    @Override
    public void onMeasure(int i9, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        Drawable drawable5;
        Drawable drawable6;
        int size = View.MeasureSpec.getSize(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        int i17 = this.U;
        int i18 = AndroidUtilities.displaySize.x;
        if (i17 != i18) {
            this.U = i18;
            this.N = 0.0f;
            this.P = 500;
            b();
        }
        int paddingLeft = ((size - getPaddingLeft()) - getPaddingRight()) - this.f23483s0;
        if (this.f23469g0 && (drawable6 = this.v) != null) {
            i11 = drawable6.getIntrinsicWidth() + this.E;
        } else {
            i11 = 0;
        }
        int i19 = paddingLeft - i11;
        if (this.f23470h0 && (drawable5 = this.f23487w) != null) {
            i12 = drawable5.getIntrinsicWidth() + this.E;
        } else {
            i12 = 0;
        }
        int i20 = i19 - i12;
        if (this.f23470h0 && (drawable4 = this.f23489x) != null) {
            i13 = drawable4.getIntrinsicWidth() + this.E;
        } else {
            i13 = 0;
        }
        d(i20 - i13);
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            size2 = getPaddingBottom() + getPaddingTop() + this.f23463c0;
        }
        if (this.J) {
            int paddingRight = getPaddingRight() + getPaddingLeft() + this.f23459a0 + this.f23483s0;
            if (this.f23469g0 && (drawable3 = this.v) != null) {
                i14 = drawable3.getIntrinsicWidth() + this.E;
            } else {
                i14 = 0;
            }
            int i21 = paddingRight + i14;
            if (this.f23470h0 && (drawable2 = this.f23487w) != null) {
                i15 = drawable2.getIntrinsicWidth() + this.E;
            } else {
                i15 = 0;
            }
            int i22 = i21 + i15;
            if (this.f23470h0 && (drawable = this.f23489x) != null) {
                i16 = drawable.getIntrinsicWidth() + this.E;
            } else {
                i16 = 0;
            }
            size = Math.max(Math.min(size, i22 + i16), 0);
        }
        setMeasuredDimension(size, size2);
        if ((this.f23475n & 112) == 16) {
            this.W = j3.r0.d((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), this.f23463c0, 2, getPaddingTop());
        } else {
            this.W = getPaddingTop();
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f23493z0 != null && this.f23487w != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(this.f23464d0 - AndroidUtilities.dp(16.0f), this.f23466e0 - AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f) + this.f23464d0, AndroidUtilities.dp(16.0f) + this.f23466e0);
            if (motionEvent.getAction() == 0 && rectF.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                this.A0 = true;
                this.B0 = motionEvent.getX();
                this.C0 = motionEvent.getY();
                getParent().requestDisallowInterceptTouchEvent(true);
                Drawable drawable = this.f23487w;
                if (drawable instanceof g5) {
                    ((g01) ((g5) drawable)).f38406f.c(true);
                }
            } else if (motionEvent.getAction() == 2 && this.A0) {
                if (Math.abs(motionEvent.getX() - this.B0) >= AndroidUtilities.touchSlop || Math.abs(motionEvent.getY() - this.C0) >= AndroidUtilities.touchSlop) {
                    this.A0 = false;
                    getParent().requestDisallowInterceptTouchEvent(false);
                    Drawable drawable2 = this.f23487w;
                    if (drawable2 instanceof g5) {
                        ((g01) ((g5) drawable2)).f38406f.c(false);
                    }
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (this.A0 && motionEvent.getAction() == 1) {
                    this.f23493z0.onClick(this);
                    Drawable drawable3 = this.f23487w;
                    if (drawable3 instanceof g5) {
                        ((g01) ((g5) drawable3)).f38406f.c(false);
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
        if (this.f23480r > 1) {
            super.setBackgroundDrawable(drawable);
        } else {
            this.K = drawable;
        }
    }

    public void setBuildFullLayout(boolean z10) {
        this.H = z10;
    }

    public void setCanHideRightDrawable(boolean z10) {
        this.f23490x0 = z10;
    }

    public void setDrawablePadding(int i9) {
        if (this.E == i9) {
            return;
        }
        this.E = i9;
        f();
    }

    public void setEllipsizeByGradient(int i9) {
        if (!this.L) {
            this.f23472j0 = true;
            this.f23474l0 = null;
            m();
            b();
        }
        this.m0 = i9;
        m();
    }

    public void setEmojiCacheType(int i9) {
        if (i9 != this.E0) {
            org.telegram.ui.Components.t5.release(this, this.D0);
            this.E0 = i9;
            if (this.G0) {
                this.D0 = org.telegram.ui.Components.t5.update(i9, this, this.D0, this.f23462c);
            }
        }
    }

    public void setEmojiColor(int i9) {
        this.F0 = new PorterDuffColorFilter(i9, PorterDuff.Mode.SRC_IN);
    }

    public void setFullAlpha(float f10) {
        this.I = f10;
        invalidate();
    }

    public void setFullTextMaxLines(int i9) {
        this.f23484t0 = i9;
    }

    public void setGravity(int i9) {
        this.f23475n = i9;
    }

    public void setLeftDrawable(int i9) {
        setLeftDrawable(i9 == 0 ? null : getContext().getResources().getDrawable(i9));
    }

    public void setLeftDrawableOutside(boolean z10) {
        this.f23469g0 = z10;
    }

    public void setLeftDrawableTopPadding(int i9) {
        this.F = i9;
    }

    public void setLinkTextColor(int i9) {
        this.h.linkColor = i9;
        invalidate();
    }

    public void setMaxLines(int i9) {
        this.f23480r = i9;
    }

    public void setMinWidth(int i9) {
        this.f23477o0 = i9;
    }

    public void setMinusWidth(int i9) {
        if (i9 == this.f23483s0) {
            return;
        }
        this.f23483s0 = i9;
        f();
    }

    public void setRightDrawable(int i9) {
        Drawable drawable;
        if (i9 == 0) {
            drawable = null;
        } else {
            drawable = getContext().getResources().getDrawable(i9);
        }
        i(drawable);
    }

    public void setRightDrawableInside(boolean z10) {
        this.f23471i0 = z10;
    }

    public void setRightDrawableOnClick(View.OnClickListener onClickListener) {
        this.f23493z0 = onClickListener;
    }

    public void setRightDrawableOutside(boolean z10) {
        this.f23470h0 = z10;
    }

    public void setRightDrawableScale(float f10) {
        this.D = f10;
    }

    public void setRightDrawableTopPadding(int i9) {
        this.G = i9;
    }

    public void setRightPadding(int i9) {
        if (this.f23476n0 != i9) {
            this.f23476n0 = i9;
            int maxTextWidth = ((getMaxTextWidth() - getPaddingLeft()) - getPaddingRight()) - this.f23483s0;
            Drawable drawable = this.v;
            if (drawable != null && !this.f23469g0) {
                maxTextWidth = (maxTextWidth - drawable.getIntrinsicWidth()) - this.E;
            }
            int i10 = 0;
            if (!this.f23471i0) {
                Drawable drawable2 = this.f23487w;
                if (drawable2 != null && !this.f23470h0) {
                    i10 = (int) (drawable2.getIntrinsicWidth() * this.D);
                    maxTextWidth = (maxTextWidth - i10) - this.E;
                }
                Drawable drawable3 = this.f23489x;
                if (drawable3 != null && !this.f23470h0) {
                    i10 = (int) (drawable3.getIntrinsicWidth() * this.D);
                    maxTextWidth = (maxTextWidth - i10) - this.E;
                }
            }
            if (this.A != null && this.f23491y != null) {
                int indexOf = this.f23482s.toString().indexOf(this.A);
                this.B = indexOf;
                if (indexOf < 0) {
                    maxTextWidth = (maxTextWidth - this.f23491y.getIntrinsicWidth()) - this.E;
                }
            }
            if (this.f23490x0 && i10 != 0 && !this.f23470h0) {
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                if (!this.f23482s.equals(TextUtils.ellipsize(this.f23482s, this.h, maxTextWidth, truncateAt))) {
                    this.f23492y0 = true;
                    maxTextWidth = maxTextWidth + i10 + this.E;
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

    public void setSideDrawablesColor(int i9) {
        f6.w1(i9, this.f23487w);
        f6.w1(i9, this.v);
    }

    public void setTextColor(int i9) {
        this.h.setColor(i9);
        invalidate();
    }

    public void setTextSize(int i9) {
        setTextSizePx(AndroidUtilities.dp(i9));
    }

    public void setTextSizePx(int i9) {
        float f10 = i9;
        TextPaint textPaint = this.h;
        if (f10 == textPaint.getTextSize()) {
            return;
        }
        textPaint.setTextSize(f10);
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
        if (drawable != this.f23487w && drawable != this.f23489x && drawable != this.v && !super.verifyDrawable(drawable)) {
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
        this.f23472j0 = z10;
        this.f23474l0 = null;
        m();
        b();
    }
}
