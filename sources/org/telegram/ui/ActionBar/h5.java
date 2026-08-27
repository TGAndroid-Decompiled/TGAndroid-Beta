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
import org.telegram.messenger.rl;
import org.telegram.ui.Components.tv0;
import org.telegram.ui.Components.vv0;
import org.telegram.ui.Components.zy;
import org.telegram.ui.h01;

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

    public float f23462a;

    public int f23463a0;

    public float f23464b;

    public int f23465b0;

    public StaticLayout f23466c;

    public int f23467c0;
    public StaticLayout d;

    public int f23468d0;

    public StaticLayout f23469e;

    public int f23470e0;

    public StaticLayout f23471f;

    public boolean f23472f0;

    public boolean f23473g0;
    public final TextPaint h;

    public boolean f23474h0;

    public boolean f23475i0;

    public boolean f23476j0;

    public boolean f23477k0;

    public Boolean f23478l0;
    public int m0;

    public int f23479n;

    public int f23480n0;

    public int f23481o0;

    public int f23482p0;

    public int f23483q0;

    public int f23484r;

    public float f23485r0;

    public CharSequence f23486s;

    public int f23487s0;

    public int f23488t0;

    public final ArrayList f23489u0;
    public Drawable v;

    public final Stack f23490v0;

    public Drawable f23491w;

    public final Path f23492w0;

    public Drawable f23493x;

    public boolean f23494x0;

    public Drawable f23495y;

    public boolean f23496y0;

    public View.OnClickListener f23497z0;

    public h5(Context context) {
        super(context);
        this.f23479n = 51;
        this.f23484r = 1;
        this.D = 1.0f;
        this.E = AndroidUtilities.dp(4.0f);
        this.m0 = 16;
        this.f23488t0 = 3;
        this.f23489u0 = new ArrayList();
        this.f23490v0 = new Stack();
        this.f23492w0 = new Path();
        this.E0 = 0;
        this.H0 = Layout.Alignment.ALIGN_NORMAL;
        this.h = new TextPaint(1);
        setImportantForAccessibility(1);
    }

    private Layout.Alignment getAlignment() {
        return this.H0;
    }

    public final void a(int i10) {
        int intrinsicWidth;
        StaticLayout staticLayout = this.f23466c;
        if (staticLayout == null) {
            return;
        }
        if (staticLayout.getLineCount() > 0) {
            this.f23463a0 = (int) Math.max(Math.ceil(this.f23466c.getLineWidth(0)), Math.ceil(this.f23466c.getLineRight(0) - this.f23466c.getLineLeft(0)));
            StaticLayout staticLayout2 = this.f23469e;
            if (staticLayout2 != null) {
                this.f23467c0 = staticLayout2.getLineBottom(staticLayout2.getLineCount() - 1);
            } else if (this.f23484r <= 1 || this.f23466c.getLineCount() <= 0) {
                this.f23467c0 = this.f23466c.getLineBottom(0);
            } else {
                StaticLayout staticLayout3 = this.f23466c;
                this.f23467c0 = staticLayout3.getLineBottom(staticLayout3.getLineCount() - 1);
            }
            int i11 = this.f23479n & 7;
            if (i11 == 1) {
                this.V = ((i10 - this.f23463a0) / 2) - ((int) this.f23466c.getLineLeft(0));
            } else if (i11 == 3) {
                StaticLayout staticLayout4 = this.d;
                if (staticLayout4 != null) {
                    this.V = -((int) staticLayout4.getLineLeft(0));
                } else {
                    this.V = -((int) this.f23466c.getLineLeft(0));
                }
            } else if (this.f23466c.getLineLeft(0) == 0.0f) {
                StaticLayout staticLayout5 = this.d;
                if (staticLayout5 != null) {
                    this.V = (int) (i10 - staticLayout5.getLineWidth(0));
                } else {
                    this.V = i10 - this.f23463a0;
                }
            } else {
                this.V = -AndroidUtilities.dp(8.0f);
            }
            this.V = getPaddingLeft() + this.V;
            if (this.f23475i0) {
                Drawable drawable = this.f23491w;
                intrinsicWidth = (drawable == null || this.f23474h0) ? 0 : (int) (drawable.getIntrinsicWidth() * this.D);
                Drawable drawable2 = this.f23493x;
                if (drawable2 != null && !this.f23474h0) {
                    intrinsicWidth += (int) (drawable2.getIntrinsicWidth() * this.D);
                }
            } else {
                intrinsicWidth = 0;
            }
            this.M = this.f23463a0 + intrinsicWidth > i10 - this.f23480n0;
            b();
            StaticLayout staticLayout6 = this.f23469e;
            if (staticLayout6 != null && this.f23482p0 > 0) {
                this.f23485r0 = staticLayout6.getPrimaryHorizontal(0) - this.d.getPrimaryHorizontal(0);
            }
        }
        int i12 = this.B;
        if (i12 >= 0) {
            this.C = this.f23466c.getPrimaryHorizontal(i12);
        } else {
            this.C = 0.0f;
        }
    }

    public final void b() {
        int i10 = ((!this.L || (!this.M && this.N == 0.0f)) && !this.f23476j0) ? 0 : 2;
        if (getLayerType() != i10) {
            setLayerType(i10, null);
            invalidate();
        }
    }

    public final void c(Canvas canvas) {
        ArrayList arrayList = this.f23489u0;
        if (arrayList.isEmpty()) {
            return;
        }
        Path path = this.f23492w0;
        path.rewind();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            Rect bounds = ((eh.k) arrayList.get(i10)).getBounds();
            path.addRect(bounds.left, bounds.top, bounds.right, bounds.bottom, Path.Direction.CW);
            i10 = i11;
        }
        canvas.clipPath(path, Region.Op.DIFFERENCE);
    }

    public void d(int i10) {
        int intrinsicWidth;
        int intrinsicWidth2;
        int i11;
        int i12;
        Stack stack = this.f23490v0;
        ArrayList arrayList = this.f23489u0;
        CharSequence charSequence = this.f23486s;
        this.B = -1;
        boolean z10 = false;
        this.f23496y0 = false;
        if (charSequence != null) {
            try {
                Drawable drawable = this.v;
                if (drawable == null || this.f23473g0) {
                    intrinsicWidth = i10;
                } else {
                    drawable.getIntrinsicWidth();
                    intrinsicWidth = (i10 - this.v.getIntrinsicWidth()) - this.E;
                }
                if (this.f23475i0) {
                    intrinsicWidth2 = 0;
                } else {
                    Drawable drawable2 = this.f23491w;
                    if (drawable2 == null || this.f23474h0) {
                        intrinsicWidth2 = 0;
                    } else {
                        intrinsicWidth2 = (int) (drawable2.getIntrinsicWidth() * this.D);
                        intrinsicWidth = (intrinsicWidth - intrinsicWidth2) - this.E;
                    }
                    Drawable drawable3 = this.f23493x;
                    if (drawable3 != null && !this.f23474h0) {
                        intrinsicWidth2 += (int) (drawable3.getIntrinsicWidth() * this.D);
                        intrinsicWidth = (intrinsicWidth - intrinsicWidth2) - this.E;
                    }
                }
                CharSequence charSequence2 = charSequence;
                if (this.A != null && this.f23495y != null) {
                    int iIndexOf = charSequence.toString().indexOf(this.A);
                    this.B = iIndexOf;
                    if (iIndexOf >= 0) {
                        charSequence2 = charSequence;
                        SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(charSequence);
                        org.telegram.ui.Cells.n2 n2Var = new org.telegram.ui.Cells.n2(this.f23495y.getIntrinsicWidth());
                        int i13 = this.B;
                        spannableStringBuilderValueOf.setSpan(n2Var, i13, this.A.length() + i13, 0);
                        charSequence2 = spannableStringBuilderValueOf;
                    } else {
                        charSequence2 = charSequence;
                        intrinsicWidth = (intrinsicWidth - this.f23495y.getIntrinsicWidth()) - this.E;
                        charSequence2 = charSequence;
                    }
                }
                charSequence2 = charSequence;
                CharSequence charSequence3 = charSequence2;
                boolean z11 = this.f23494x0;
                TextPaint textPaint = this.h;
                if (z11 && intrinsicWidth2 != 0 && !this.f23474h0 && !charSequence3.equals(TextUtils.ellipsize(charSequence3, textPaint, intrinsicWidth, TextUtils.TruncateAt.END))) {
                    this.f23496y0 = true;
                    intrinsicWidth = intrinsicWidth + intrinsicWidth2 + this.E;
                }
                int i14 = intrinsicWidth;
                if (this.H) {
                    CharSequence charSequenceEllipsize = !this.f23476j0 ? TextUtils.ellipsize(charSequence3, textPaint, i14, TextUtils.TruncateAt.END) : charSequence3;
                    if (this.f23476j0 || charSequenceEllipsize.equals(charSequence3)) {
                        i12 = i14;
                        CharSequence charSequence4 = charSequenceEllipsize;
                        this.f23466c = new StaticLayout(charSequence4, 0, charSequence4.length(), textPaint, (this.L || this.f23476j0) ? AndroidUtilities.dp(2000.0f) : i12 + AndroidUtilities.dp(8.0f), getAlignment(), 1.0f, 0.0f, false);
                        this.f23469e = null;
                        this.f23471f = null;
                        this.d = null;
                    } else {
                        Layout.Alignment alignment = getAlignment();
                        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                        StaticLayout staticLayoutC = tv0.c(charSequence3, textPaint, i14, alignment, 0.0f, false, truncateAt, i14, this.f23488t0, false);
                        i12 = i14;
                        this.f23469e = staticLayoutC;
                        if (staticLayoutC != null) {
                            int lineEnd = staticLayoutC.getLineEnd(0);
                            int lineStart = this.f23469e.getLineStart(1);
                            CharSequence charSequenceSubSequence = charSequence3.subSequence(0, lineEnd);
                            SpannableStringBuilder spannableStringBuilderValueOf2 = SpannableStringBuilder.valueOf(charSequence3);
                            spannableStringBuilderValueOf2.setSpan(new zy(z10), 0, lineStart, 0);
                            CharSequence charSequenceSubSequence2 = lineEnd < charSequenceEllipsize.length() ? charSequenceEllipsize.subSequence(lineEnd, charSequenceEllipsize.length()) : "…";
                            this.d = new StaticLayout(charSequenceEllipsize, 0, charSequenceEllipsize.length(), textPaint, this.L ? AndroidUtilities.dp(2000.0f) : i12 + AndroidUtilities.dp(8.0f), getAlignment(), 1.0f, 0.0f, false);
                            StaticLayout staticLayout = new StaticLayout(charSequenceSubSequence, 0, charSequenceSubSequence.length(), textPaint, this.L ? AndroidUtilities.dp(2000.0f) : i12 + AndroidUtilities.dp(8.0f), getAlignment(), 1.0f, 0.0f, false);
                            this.f23466c = staticLayout;
                            if (staticLayout.getLineLeft(0) != 0.0f) {
                                charSequenceSubSequence2 = "\u200f" + ((Object) charSequenceSubSequence2);
                            }
                            CharSequence charSequence5 = charSequenceSubSequence2;
                            this.f23471f = new StaticLayout(charSequence5, 0, charSequence5.length(), textPaint, this.L ? AndroidUtilities.dp(2000.0f) : i12 + AndroidUtilities.dp(8.0f), getAlignment(), 1.0f, 0.0f, false);
                            this.f23469e = tv0.c(spannableStringBuilderValueOf2, textPaint, i12 + AndroidUtilities.dp(8.0f) + this.f23482p0, getAlignment(), 0.0f, false, truncateAt, i12 + this.f23482p0, this.f23488t0, false);
                        }
                    }
                    i11 = i12;
                } else if (this.f23484r > 1) {
                    StaticLayout staticLayoutC2 = tv0.c(charSequence3, textPaint, i14, getAlignment(), 0.0f, false, TextUtils.TruncateAt.END, i14, this.f23484r, false);
                    i11 = i14;
                    this.f23466c = staticLayoutC2;
                } else {
                    i11 = i14;
                    CharSequence charSequenceEllipsize2 = (this.L || this.f23476j0) ? charSequence3 : TextUtils.ellipsize(charSequence3, textPaint, i11, TextUtils.TruncateAt.END);
                    this.f23466c = new StaticLayout(charSequenceEllipsize2, 0, charSequenceEllipsize2.length(), textPaint, (this.L || this.f23476j0) ? AndroidUtilities.dp(2000.0f) : AndroidUtilities.dp(8.0f) + i11, getAlignment(), 1.0f, 0.0f, false);
                }
                stack.addAll(arrayList);
                arrayList.clear();
                StaticLayout staticLayout2 = this.f23466c;
                if (staticLayout2 != null && (staticLayout2.getText() instanceof Spannable)) {
                    eh.k.b(this, this.f23466c, -2, -2, stack, arrayList);
                }
                a(i11);
            } catch (Exception unused) {
            }
        } else {
            this.f23466c = null;
            this.f23463a0 = 0;
            this.f23467c0 = 0;
        }
        org.telegram.ui.Components.t5.release(this, this.D0);
        if (this.G0) {
            this.D0 = org.telegram.ui.Components.t5.update(this.E0, this, this.D0, this.f23466c);
        }
        invalidate();
    }

    public final void e(Canvas canvas) {
        float f10 = this.I;
        int i10 = 0;
        ArrayList arrayList = this.f23489u0;
        if (f10 <= 0.0f || this.f23483q0 == 0) {
            canvas.save();
            c(canvas);
            org.telegram.ui.Components.p5 p5Var = this.D0;
            if (p5Var != null) {
                p5Var.a();
            }
            this.f23466c.draw(canvas);
            canvas.restore();
            org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas, this.f23466c, this.D0, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.F0);
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((eh.k) obj).draw(canvas);
            }
            return;
        }
        canvas.save();
        float f11 = -this.f23483q0;
        float f12 = this.I;
        canvas.translate((this.f23485r0 * f12) + (f11 * f12), 0.0f);
        float f13 = this.f23462a;
        float f14 = -this.f23483q0;
        float f15 = this.I;
        this.f23462a = com.google.android.recaptcha.internal.a.d(this.f23485r0, f15, f14 * f15, f13);
        canvas.save();
        c(canvas);
        org.telegram.ui.Components.p5 p5Var2 = this.D0;
        if (p5Var2 != null) {
            p5Var2.a();
        }
        this.f23466c.draw(canvas);
        canvas.restore();
        org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas, this.f23466c, this.D0, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.F0);
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            ((eh.k) obj2).draw(canvas);
        }
        canvas.restore();
    }

    public final boolean f() {
        if (!this.f23472f0 || getMeasuredHeight() == 0 || this.H) {
            requestLayout();
            return true;
        }
        d(((getMaxTextWidth() - getPaddingLeft()) - getPaddingRight()) - this.f23487s0);
        if ((this.f23479n & 112) == 16) {
            this.W = (getMeasuredHeight() - this.f23467c0) / 2;
            return true;
        }
        this.W = getPaddingTop();
        return true;
    }

    public final void g(vv0 vv0Var, String str) {
        Drawable drawable = this.f23495y;
        if (drawable == vv0Var) {
            return;
        }
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f23495y = vv0Var;
        if (vv0Var != null) {
            vv0Var.setCallback(this);
        }
        f();
        this.A = str;
    }

    @Override
    public Drawable getBackground() {
        Drawable drawable = this.K;
        return drawable != null ? drawable : super.getBackground();
    }

    public float getExactWidth() {
        return (getPaint().measureText(getText().toString()) + getSideDrawablesSize()) - ((this.v == null && this.f23491w == null && this.f23493x == null) ? 0 : this.E);
    }

    public float getExactWidthIncludeDrawables() {
        float exactWidth = getExactWidth();
        Drawable drawable = this.v;
        float intrinsicWidth = exactWidth + (drawable != null ? drawable.getIntrinsicWidth() : 0);
        Drawable drawable2 = this.f23491w;
        float intrinsicWidth2 = intrinsicWidth + (drawable2 != null ? drawable2.getIntrinsicWidth() : 0);
        Drawable drawable3 = this.f23493x;
        return intrinsicWidth2 + (drawable3 != null ? drawable3.getIntrinsicWidth() : 0);
    }

    public float getFullAlpha() {
        return this.I;
    }

    public Layout getLayout() {
        return this.f23466c;
    }

    public float getLayoutX() {
        return this.f23462a;
    }

    public float getLayoutY() {
        return this.f23464b;
    }

    public Drawable getLeftDrawable() {
        return this.v;
    }

    public int getLineCount() {
        StaticLayout staticLayout = this.f23466c;
        int lineCount = staticLayout != null ? staticLayout.getLineCount() : 0;
        StaticLayout staticLayout2 = this.f23469e;
        return staticLayout2 != null ? staticLayout2.getLineCount() + lineCount : lineCount;
    }

    public int getMaxTextWidth() {
        Drawable drawable;
        Drawable drawable2;
        int intrinsicWidth = 0;
        int measuredWidth = getMeasuredWidth() - ((!this.f23474h0 || (drawable2 = this.f23491w) == null) ? 0 : drawable2.getIntrinsicWidth() + this.E);
        if (this.f23474h0 && (drawable = this.f23493x) != null) {
            intrinsicWidth = this.E + drawable.getIntrinsicWidth();
        }
        return measuredWidth - intrinsicWidth;
    }

    public TextPaint getPaint() {
        return this.h;
    }

    public Drawable getRightDrawable() {
        return this.f23491w;
    }

    public Drawable getRightDrawable2() {
        return this.f23493x;
    }

    public boolean getRightDrawableOutside() {
        return this.f23474h0;
    }

    public int getRightDrawableWidth() {
        Drawable drawable = this.f23491w;
        if (drawable == null) {
            return 0;
        }
        return (int) ((drawable.getIntrinsicWidth() * this.D) + this.E);
    }

    public int getRightDrawableX() {
        return this.f23468d0;
    }

    public int getRightDrawableY() {
        return this.f23470e0;
    }

    public int getSideDrawablesSize() {
        Drawable drawable = this.v;
        int intrinsicWidth = drawable != null ? drawable.getIntrinsicWidth() + this.E : 0;
        Drawable drawable2 = this.f23491w;
        if (drawable2 != null) {
            intrinsicWidth += ((int) (drawable2.getIntrinsicWidth() * this.D)) + this.E;
        }
        Drawable drawable3 = this.f23493x;
        return drawable3 != null ? ((int) (drawable3.getIntrinsicWidth() * this.D)) + this.E + intrinsicWidth : intrinsicWidth;
    }

    public CharSequence getText() {
        CharSequence charSequence = this.f23486s;
        return charSequence == null ? "" : charSequence;
    }

    public int getTextColor() {
        return this.h.getColor();
    }

    public int getTextHeight() {
        return this.f23467c0;
    }

    public TextPaint getTextPaint() {
        return this.h;
    }

    public int getTextStartX() {
        int intrinsicWidth = 0;
        if (this.f23466c == null) {
            return 0;
        }
        Drawable drawable = this.v;
        if (drawable != null && (this.f23479n & 7) == 3) {
            intrinsicWidth = this.E + drawable.getIntrinsicWidth();
        }
        Drawable drawable2 = this.f23495y;
        if (drawable2 != null && this.B < 0 && (this.f23479n & 7) == 3) {
            intrinsicWidth += drawable2.getIntrinsicWidth() + this.E;
        }
        return ((int) getX()) + this.V + intrinsicWidth;
    }

    public int getTextStartY() {
        if (this.f23466c == null) {
            return 0;
        }
        return (int) getY();
    }

    public int getTextWidth() {
        int i10 = this.f23463a0;
        int intrinsicWidth = 0;
        if (this.f23475i0) {
            Drawable drawable = this.f23491w;
            int intrinsicWidth2 = drawable != null ? (int) (drawable.getIntrinsicWidth() * this.D) : 0;
            Drawable drawable2 = this.f23493x;
            intrinsicWidth = (drawable2 != null ? (int) (drawable2.getIntrinsicWidth() * this.D) : 0) + intrinsicWidth2;
        }
        return i10 + intrinsicWidth;
    }

    public final void h(int i10, int i11) {
        if (this.f23482p0 == i10 && this.f23483q0 == i11) {
            return;
        }
        this.f23482p0 = i10;
        this.f23483q0 = i11;
        d(((getMaxTextWidth() - getPaddingLeft()) - getPaddingRight()) - this.f23487s0);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final boolean i(Drawable drawable) {
        Drawable drawable2 = this.f23491w;
        if (drawable2 == drawable) {
            return false;
        }
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f23491w = drawable;
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
        Drawable drawable3 = this.f23491w;
        if (drawable == drawable3) {
            invalidate(drawable3.getBounds());
            return;
        }
        Drawable drawable4 = this.f23493x;
        if (drawable == drawable4) {
            invalidate(drawable4.getBounds());
            return;
        }
        Drawable drawable5 = this.f23495y;
        if (drawable == drawable5) {
            invalidate(drawable5.getBounds());
        }
    }

    public final boolean j(Drawable drawable) {
        Drawable drawable2 = this.f23493x;
        if (drawable2 == drawable) {
            return false;
        }
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f23493x = drawable;
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
        CharSequence charSequence2 = this.f23486s;
        if (charSequence2 == null && charSequence == null) {
            return false;
        }
        if (!z10 && charSequence2 != null && charSequence2.equals(charSequence)) {
            return false;
        }
        this.f23486s = charSequence;
        this.P = 500;
        f();
        return true;
    }

    public final void m() {
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
        Boolean bool = this.f23478l0;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        if (!(this.S != null && this.T == AndroidUtilities.dp(this.m0) && this.f23477k0 == zBooleanValue) && this.f23476j0) {
            if (this.S == null) {
                this.S = new Paint();
            }
            this.f23477k0 = zBooleanValue;
            if (zBooleanValue) {
                Paint paint4 = this.S;
                int iDp = AndroidUtilities.dp(this.m0);
                this.T = iDp;
                paint4.setShader(new LinearGradient(0.0f, 0.0f, iDp, 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            } else {
                Paint paint5 = this.S;
                int iDp2 = AndroidUtilities.dp(this.m0);
                this.T = iDp2;
                paint5.setShader(new LinearGradient(0.0f, 0.0f, iDp2, 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            }
            this.S.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.G0 = true;
        this.D0 = org.telegram.ui.Components.t5.update(this.E0, this, this.D0, this.f23466c);
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.G0 = false;
        org.telegram.ui.Components.t5.release(this, this.D0);
        this.f23472f0 = false;
    }

    @Override
    public void onDraw(Canvas canvas) {
        int intrinsicWidth;
        float f10;
        float f11;
        int iB;
        int i10;
        int iB2;
        int i11;
        int iB3;
        int i12;
        float f12;
        float f13;
        boolean z10;
        float fC;
        int iB4;
        int i13;
        int iB5;
        int i14;
        float fDp;
        int iB6;
        int i15;
        int iB7;
        int i16;
        int intrinsicHeight;
        int iB8;
        int i17;
        int iB9;
        int i18;
        int intrinsicHeight2;
        int intrinsicHeight3;
        super.onDraw(canvas);
        this.f23462a = 0.0f;
        this.f23464b = 0.0f;
        boolean z11 = this.L && (this.M || this.N != 0.0f);
        this.f23465b0 = this.f23463a0;
        Drawable drawable = this.v;
        if (drawable == null || this.f23473g0) {
            intrinsicWidth = (!this.f23473g0 || drawable == null) ? 0 : this.E + drawable.getIntrinsicWidth();
        } else {
            int i19 = (int) (-this.N);
            int i20 = this.f23479n;
            if ((i20 & 7) == 1) {
                i19 += this.V;
            }
            if ((i20 & 112) == 16) {
                intrinsicHeight3 = ((getMeasuredHeight() - this.v.getIntrinsicHeight()) / 2) + this.F;
            } else {
                intrinsicHeight3 = this.F + ((this.f23467c0 - this.v.getIntrinsicHeight()) / 2) + getPaddingTop();
            }
            Drawable drawable2 = this.v;
            drawable2.setBounds(i19, intrinsicHeight3, drawable2.getIntrinsicWidth() + i19, this.v.getIntrinsicHeight() + intrinsicHeight3);
            this.v.draw(canvas);
            int i21 = this.f23479n & 7;
            if (i21 == 3 || i21 == 1) {
                intrinsicWidth = this.v.getIntrinsicWidth() + this.E;
            } else {
                intrinsicWidth = 0;
            }
            this.f23465b0 = this.v.getIntrinsicWidth() + this.E + this.f23465b0;
        }
        Drawable drawable3 = this.f23495y;
        if (drawable3 != null && this.A != null) {
            int i22 = (int) ((-this.N) + this.C);
            int i23 = this.f23479n;
            if ((i23 & 7) == 1) {
                i22 += this.V;
            }
            if ((i23 & 112) == 16) {
                intrinsicHeight2 = ((getMeasuredHeight() - this.f23495y.getIntrinsicHeight()) / 2) + this.F;
            } else {
                intrinsicHeight2 = this.F + ((this.f23467c0 - drawable3.getIntrinsicHeight()) / 2);
            }
            Drawable drawable4 = this.f23495y;
            drawable4.setBounds(i22, intrinsicHeight2, drawable4.getIntrinsicWidth() + i22, this.f23495y.getIntrinsicHeight() + intrinsicHeight2);
            this.f23495y.draw(canvas);
            if (this.B < 0) {
                int i24 = this.f23479n & 7;
                if (i24 == 3 || i24 == 1) {
                    intrinsicWidth += this.f23495y.getIntrinsicWidth() + this.E;
                }
                this.f23465b0 = this.f23495y.getIntrinsicWidth() + this.E + this.f23465b0;
            }
        }
        int i25 = intrinsicWidth;
        Drawable drawable5 = this.f23491w;
        if (drawable5 == null || this.f23496y0 || this.D <= 0.0f || this.f23474h0 || this.f23475i0) {
            f10 = 0.0f;
        } else {
            int i26 = this.f23463a0 + i25 + this.E + ((int) (-this.N));
            int i27 = this.f23479n & 7;
            if (i27 == 1 || i27 == 5) {
                i26 += this.V;
            }
            int intrinsicWidth2 = (int) (drawable5.getIntrinsicWidth() * this.D);
            int intrinsicHeight4 = (int) (this.f23491w.getIntrinsicHeight() * this.D);
            if ((this.f23479n & 112) == 16) {
                iB9 = (getMeasuredHeight() - intrinsicHeight4) / 2;
                i18 = this.G;
            } else {
                iB9 = i0.a.B(this.f23467c0, intrinsicHeight4, 2, getPaddingTop());
                i18 = this.G;
            }
            int i28 = iB9 + i18;
            f10 = 0.0f;
            this.f23491w.setBounds(i26, i28, i26 + intrinsicWidth2, i28 + intrinsicHeight4);
            this.f23468d0 = i26 + (intrinsicWidth2 >> 1);
            this.f23470e0 = i28 + (intrinsicHeight4 >> 1);
            this.f23491w.draw(canvas);
            this.f23465b0 = this.E + intrinsicWidth2 + this.f23465b0;
        }
        if (this.f23493x != null && !this.f23496y0 && this.D > f10 && !this.f23474h0 && !this.f23475i0) {
            int intrinsicWidth3 = this.f23463a0 + i25 + this.E + ((int) (-this.N));
            Drawable drawable6 = this.f23491w;
            if (drawable6 != null) {
                intrinsicWidth3 += ((int) (drawable6.getIntrinsicWidth() * this.D)) + this.E;
            }
            int i29 = this.f23479n & 7;
            if (i29 == 1 || i29 == 5) {
                intrinsicWidth3 += this.V;
            }
            int intrinsicWidth4 = (int) (this.f23493x.getIntrinsicWidth() * this.D);
            int intrinsicHeight5 = (int) (this.f23493x.getIntrinsicHeight() * this.D);
            if ((this.f23479n & 112) == 16) {
                iB8 = (getMeasuredHeight() - intrinsicHeight5) / 2;
                i17 = this.G;
            } else {
                iB8 = i0.a.B(this.f23467c0, intrinsicHeight5, 2, getPaddingTop());
                i17 = this.G;
            }
            int i30 = iB8 + i17;
            this.f23493x.setBounds(intrinsicWidth3, i30, intrinsicWidth3 + intrinsicWidth4, intrinsicHeight5 + i30);
            this.f23493x.draw(canvas);
            this.f23465b0 = this.E + intrinsicWidth4 + this.f23465b0;
        }
        int iDp = AndroidUtilities.dp(16.0f) + this.f23465b0;
        float f14 = this.N;
        if (f14 != f10) {
            if (this.v != null && !this.f23473g0) {
                int i31 = ((int) (-f14)) + iDp;
                if ((this.f23479n & 112) == 16) {
                    intrinsicHeight = ((getMeasuredHeight() - this.v.getIntrinsicHeight()) / 2) + this.F;
                } else {
                    intrinsicHeight = this.F + ((this.f23467c0 - this.v.getIntrinsicHeight()) / 2) + getPaddingTop();
                }
                Drawable drawable7 = this.v;
                drawable7.setBounds(i31, intrinsicHeight, drawable7.getIntrinsicWidth() + i31, this.v.getIntrinsicHeight() + intrinsicHeight);
                this.v.draw(canvas);
            }
            Drawable drawable8 = this.f23491w;
            if (drawable8 == null || this.f23474h0) {
                f11 = 16.0f;
            } else {
                int intrinsicWidth5 = (int) (drawable8.getIntrinsicWidth() * this.D);
                int intrinsicHeight6 = (int) (this.f23491w.getIntrinsicHeight() * this.D);
                int i32 = this.f23463a0 + i25 + this.E + ((int) (-this.N)) + iDp;
                if ((this.f23479n & 112) == 16) {
                    iB7 = (getMeasuredHeight() - intrinsicHeight6) / 2;
                    i16 = this.G;
                } else {
                    iB7 = i0.a.B(this.f23467c0, intrinsicHeight6, 2, getPaddingTop());
                    i16 = this.G;
                }
                int i33 = iB7 + i16;
                f11 = 16.0f;
                this.f23491w.setBounds(i32, i33, i32 + intrinsicWidth5, i33 + intrinsicHeight6);
                this.f23468d0 = i32 + (intrinsicWidth5 >> 1);
                this.f23470e0 = i33 + (intrinsicHeight6 >> 1);
                this.f23491w.draw(canvas);
            }
            Drawable drawable9 = this.f23493x;
            if (drawable9 != null && !this.f23474h0) {
                int intrinsicWidth6 = (int) (drawable9.getIntrinsicWidth() * this.D);
                int intrinsicHeight7 = (int) (this.f23493x.getIntrinsicHeight() * this.D);
                int intrinsicWidth7 = this.f23463a0 + i25 + this.E + ((int) (-this.N)) + iDp;
                Drawable drawable10 = this.f23491w;
                if (drawable10 != null) {
                    intrinsicWidth7 += ((int) (drawable10.getIntrinsicWidth() * this.D)) + this.E;
                }
                if ((this.f23479n & 112) == 16) {
                    iB6 = (getMeasuredHeight() - intrinsicHeight7) / 2;
                    i15 = this.G;
                } else {
                    iB6 = i0.a.B(this.f23467c0, intrinsicHeight7, 2, getPaddingTop());
                    i15 = this.G;
                }
                int i34 = iB6 + i15;
                this.f23493x.setBounds(intrinsicWidth7, i34, intrinsicWidth6 + intrinsicWidth7, intrinsicHeight7 + i34);
                this.f23493x.draw(canvas);
            }
        } else {
            f11 = 16.0f;
        }
        if (this.f23466c != null) {
            if (this.f23473g0 || this.f23474h0 || this.f23476j0 || this.f23480n0 > 0) {
                canvas.save();
                int maxTextWidth = getMaxTextWidth() - this.f23480n0;
                Drawable drawable11 = this.f23491w;
                canvas.clipRect(i25, 0, maxTextWidth - AndroidUtilities.dp((drawable11 == null || (drawable11 instanceof org.telegram.ui.Components.i5) || !this.f23474h0) ? 0.0f : 2.0f), getMeasuredHeight());
            }
            Emoji.emojiDrawingUseAlpha = false;
            if (this.K != null) {
                int i35 = (int) ((this.V + i25) - this.N);
                int i36 = this.f23463a0;
                int i37 = (i36 / 2) + i35;
                int iMax = Math.max(getPaddingRight() + getPaddingLeft() + i36, this.f23481o0);
                int i38 = i37 - (iMax / 2);
                this.K.setBounds(i38, 0, iMax + i38, getMeasuredHeight());
                this.K.draw(canvas);
            }
            if (this.V + i25 != 0 || this.W != 0 || this.N != f10) {
                canvas.save();
                canvas.translate((this.V + i25) - this.N, this.W);
                this.f23462a = ((this.V + i25) - this.N) + this.f23462a;
                this.f23464b += this.W;
            }
            e(canvas);
            StaticLayout staticLayout = this.f23471f;
            TextPaint textPaint = this.h;
            if (staticLayout == null || this.I >= 1.0f) {
                f12 = 0.0f;
            } else {
                int alpha = textPaint.getAlpha();
                textPaint.setAlpha((int) ((1.0f - this.I) * 255.0f));
                canvas.save();
                if (this.f23471f.getText().length() == 1) {
                    fDp = AndroidUtilities.dp(this.f23488t0 == 1 ? 0.5f : 4.0f);
                } else {
                    fDp = 0.0f;
                }
                if (this.f23466c.getLineLeft(0) != f10) {
                    canvas.translate((-this.f23466c.getLineWidth(0)) + fDp, 0.0f);
                    f12 = 0.0f;
                } else {
                    f12 = 0.0f;
                    canvas.translate(this.f23466c.getLineWidth(0) - fDp, 0.0f);
                }
                float f15 = -this.f23483q0;
                float f16 = this.I;
                canvas.translate((this.f23485r0 * f16) + (f15 * f16), f12);
                this.f23471f.draw(canvas);
                canvas.restore();
                textPaint.setAlpha(alpha);
            }
            if (this.f23469e == null || this.I <= f12) {
                f13 = 0.0f;
            } else {
                int alpha2 = textPaint.getAlpha();
                textPaint.setAlpha((int) (this.I * 255.0f));
                float f17 = -this.f23483q0;
                float f18 = this.I;
                float f19 = this.f23485r0;
                float f20 = ((f18 * f19) + (f17 * f18)) - f19;
                f13 = 0.0f;
                canvas.translate(f20, 0.0f);
                this.f23469e.draw(canvas);
                textPaint.setAlpha(alpha2);
            }
            if (this.N != f13) {
                canvas.translate(iDp, f13);
                e(canvas);
            }
            if (this.V + i25 != 0 || this.W != 0 || this.N != f13) {
                canvas.restore();
            }
            Drawable drawable12 = this.f23491w;
            if (drawable12 != null && !this.f23496y0 && this.D > 0.0f && !this.f23474h0 && this.f23475i0) {
                int i39 = this.f23463a0 + i25 + this.E + ((int) (-this.N));
                int i40 = this.f23479n & 7;
                if (i40 == 1 || i40 == 5) {
                    i39 += this.V;
                }
                int intrinsicWidth8 = (int) (drawable12.getIntrinsicWidth() * this.D);
                int intrinsicHeight8 = (int) (this.f23491w.getIntrinsicHeight() * this.D);
                if ((this.f23479n & 112) == 16) {
                    iB5 = (getMeasuredHeight() - intrinsicHeight8) / 2;
                    i14 = this.G;
                } else {
                    iB5 = i0.a.B(this.f23467c0, intrinsicHeight8, 2, getPaddingTop());
                    i14 = this.G;
                }
                int i41 = iB5 + i14;
                this.f23491w.setBounds(i39, i41, i39 + intrinsicWidth8, i41 + intrinsicHeight8);
                this.f23468d0 = i39 + (intrinsicWidth8 >> 1);
                this.f23470e0 = i41 + (intrinsicHeight8 >> 1);
                this.f23491w.draw(canvas);
                this.f23465b0 = this.E + intrinsicWidth8 + this.f23465b0;
            }
            if (this.f23493x != null && !this.f23496y0 && this.D > 0.0f && !this.f23474h0 && this.f23475i0) {
                int intrinsicWidth9 = this.f23463a0 + i25 + this.E + ((int) (-this.N));
                Drawable drawable13 = this.f23491w;
                if (drawable13 != null) {
                    intrinsicWidth9 += ((int) (drawable13.getIntrinsicWidth() * this.D)) + this.E;
                }
                int i42 = this.f23479n & 7;
                if (i42 == 1 || i42 == 5) {
                    intrinsicWidth9 += this.V;
                }
                int intrinsicWidth10 = (int) (this.f23493x.getIntrinsicWidth() * this.D);
                int intrinsicHeight9 = (int) (this.f23493x.getIntrinsicHeight() * this.D);
                if ((this.f23479n & 112) == 16) {
                    iB4 = (getMeasuredHeight() - intrinsicHeight9) / 2;
                    i13 = this.G;
                } else {
                    iB4 = i0.a.B(this.f23467c0, intrinsicHeight9, 2, getPaddingTop());
                    i13 = this.G;
                }
                int i43 = iB4 + i13;
                this.f23493x.setBounds(intrinsicWidth9, i43, intrinsicWidth9 + intrinsicWidth10, intrinsicHeight9 + i43);
                this.f23493x.draw(canvas);
                this.f23465b0 = this.E + intrinsicWidth10 + this.f23465b0;
            }
            if (z11) {
                if (this.N < AndroidUtilities.dp(10.0f)) {
                    this.Q.setAlpha((int) ((this.N / AndroidUtilities.dp(10.0f)) * 255.0f));
                } else {
                    if (this.N > (AndroidUtilities.dp(f11) + this.f23465b0) - AndroidUtilities.dp(10.0f)) {
                        this.Q.setAlpha((int) rl.t(this.N - ((AndroidUtilities.dp(f11) + this.f23465b0) - AndroidUtilities.dp(10.0f)), AndroidUtilities.dp(10.0f), 1.0f, 255.0f));
                    } else {
                        this.Q.setAlpha(255);
                    }
                }
                canvas.drawRect(i25, 0.0f, AndroidUtilities.dp(6.0f) + i25, getMeasuredHeight(), this.Q);
                canvas.save();
                canvas.translate((getMaxTextWidth() - this.f23480n0) - AndroidUtilities.dp(6.0f), 0.0f);
                canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(6.0f), getMeasuredHeight(), this.R);
                canvas.restore();
            } else if (this.f23476j0 && this.M && this.S != null) {
                canvas.save();
                m();
                if (!this.f23477k0) {
                    int maxTextWidth2 = (getMaxTextWidth() - this.f23480n0) - this.T;
                    Drawable drawable14 = this.f23491w;
                    canvas.translate(maxTextWidth2 - AndroidUtilities.dp((drawable14 == null || (drawable14 instanceof org.telegram.ui.Components.i5) || !this.f23474h0) ? 0.0f : 2.0f), 0.0f);
                }
                canvas.drawRect(i25, 0.0f, this.T, getMeasuredHeight(), this.S);
                canvas.restore();
            }
            if (!this.L || (!this.M && this.N == 0.0f)) {
                z10 = true;
            } else {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = jElapsedRealtime - this.O;
                if (j10 > 17) {
                    j10 = 17;
                }
                int i44 = this.P;
                if (i44 > 0) {
                    this.P = (int) (((long) i44) - j10);
                    z10 = true;
                } else {
                    int iDp2 = AndroidUtilities.dp(f11) + this.f23465b0;
                    if (this.N < AndroidUtilities.dp(100.0f)) {
                        fC = s3.c.c(this.N, AndroidUtilities.dp(100.0f), 20.0f, 30.0f);
                        z10 = true;
                    } else {
                        z10 = true;
                        fC = this.N >= ((float) (iDp2 - AndroidUtilities.dp(100.0f))) ? rl.c(this.N - (iDp2 - AndroidUtilities.dp(100.0f)), AndroidUtilities.dp(100.0f), 20.0f, 50.0f) : 50.0f;
                    }
                    float fDp2 = ((j10 / 1000.0f) * AndroidUtilities.dp(fC)) + this.N;
                    this.N = fDp2;
                    this.O = jElapsedRealtime;
                    if (fDp2 > iDp2) {
                        this.N = 0.0f;
                        this.P = 500;
                    }
                    b();
                }
                invalidate();
            }
            Emoji.emojiDrawingUseAlpha = z10;
            if (this.f23473g0 || this.f23474h0 || this.f23476j0 || this.f23480n0 > 0) {
                canvas.restore();
            }
        }
        Drawable drawable15 = this.v;
        if (drawable15 != null && this.f23473g0) {
            int intrinsicWidth11 = drawable15.getIntrinsicWidth();
            int intrinsicHeight10 = this.v.getIntrinsicHeight();
            if ((this.f23479n & 112) == 16) {
                iB3 = (getMeasuredHeight() - intrinsicHeight10) / 2;
                i12 = this.F;
            } else {
                iB3 = i0.a.B(this.f23467c0, intrinsicHeight10, 2, getPaddingTop());
                i12 = this.F;
            }
            int i45 = iB3 + i12;
            this.v.setBounds(0, i45, intrinsicWidth11, intrinsicHeight10 + i45);
            this.v.draw(canvas);
        }
        if (this.f23491w != null && this.f23474h0) {
            int i46 = this.f23463a0 + i25 + this.E;
            float f21 = this.N;
            int iMin = Math.min(i46 + (f21 == 0.0f ? -iDp : (int) (-f21)) + iDp, (getMaxTextWidth() - this.f23480n0) + this.E);
            int intrinsicWidth12 = (int) (this.f23491w.getIntrinsicWidth() * this.D);
            int intrinsicHeight11 = (int) (this.f23491w.getIntrinsicHeight() * this.D);
            if ((this.f23479n & 112) == 16) {
                iB2 = (getMeasuredHeight() - intrinsicHeight11) / 2;
                i11 = this.G;
            } else {
                iB2 = i0.a.B(this.f23467c0, intrinsicHeight11, 2, getPaddingTop());
                i11 = this.G;
            }
            int i47 = iB2 + i11;
            this.f23491w.setBounds(iMin, i47, iMin + intrinsicWidth12, i47 + intrinsicHeight11);
            this.f23468d0 = iMin + (intrinsicWidth12 >> 1);
            this.f23470e0 = i47 + (intrinsicHeight11 >> 1);
            this.f23491w.draw(canvas);
        }
        if (this.f23493x == null || !this.f23474h0) {
            return;
        }
        int i48 = i25 + this.f23463a0 + this.E;
        float f22 = this.N;
        int iMin2 = Math.min(i48 + (f22 == 0.0f ? -iDp : (int) (-f22)) + iDp, (getMaxTextWidth() - this.f23480n0) + this.E);
        Drawable drawable16 = this.f23491w;
        if (drawable16 != null) {
            iMin2 += ((int) (drawable16.getIntrinsicWidth() * this.D)) + this.E;
        }
        int intrinsicWidth13 = (int) (this.f23493x.getIntrinsicWidth() * this.D);
        int intrinsicHeight12 = (int) (this.f23493x.getIntrinsicHeight() * this.D);
        if ((this.f23479n & 112) == 16) {
            iB = (getMeasuredHeight() - intrinsicHeight12) / 2;
            i10 = this.G;
        } else {
            iB = i0.a.B(this.f23467c0, intrinsicHeight12, 2, getPaddingTop());
            i10 = this.G;
        }
        int i49 = iB + i10;
        this.f23493x.setBounds(iMin2, i49, intrinsicWidth13 + iMin2, intrinsicHeight12 + i49);
        this.f23493x.draw(canvas);
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setVisibleToUser(true);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setText(this.f23486s);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f23472f0 = true;
    }

    @Override
    public void onMeasure(int i10, int i11) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        Drawable drawable5;
        Drawable drawable6;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int i12 = this.U;
        int i13 = AndroidUtilities.displaySize.x;
        if (i12 != i13) {
            this.U = i13;
            this.N = 0.0f;
            this.P = 500;
            b();
        }
        d((((((size - getPaddingLeft()) - getPaddingRight()) - this.f23487s0) - ((!this.f23473g0 || (drawable6 = this.v) == null) ? 0 : drawable6.getIntrinsicWidth() + this.E)) - ((!this.f23474h0 || (drawable5 = this.f23491w) == null) ? 0 : drawable5.getIntrinsicWidth() + this.E)) - ((!this.f23474h0 || (drawable4 = this.f23493x) == null) ? 0 : drawable4.getIntrinsicWidth() + this.E));
        if (View.MeasureSpec.getMode(i11) != 1073741824) {
            size2 = getPaddingBottom() + getPaddingTop() + this.f23467c0;
        }
        if (this.J) {
            size = Math.max(Math.min(size, getPaddingRight() + getPaddingLeft() + this.f23463a0 + this.f23487s0 + ((!this.f23473g0 || (drawable3 = this.v) == null) ? 0 : drawable3.getIntrinsicWidth() + this.E) + ((!this.f23474h0 || (drawable2 = this.f23491w) == null) ? 0 : drawable2.getIntrinsicWidth() + this.E) + ((!this.f23474h0 || (drawable = this.f23493x) == null) ? 0 : drawable.getIntrinsicWidth() + this.E)), 0);
        }
        setMeasuredDimension(size, size2);
        if ((this.f23479n & 112) == 16) {
            this.W = i0.a.B((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), this.f23467c0, 2, getPaddingTop());
        } else {
            this.W = getPaddingTop();
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f23497z0 != null && this.f23491w != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(this.f23468d0 - AndroidUtilities.dp(16.0f), this.f23470e0 - AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f) + this.f23468d0, AndroidUtilities.dp(16.0f) + this.f23470e0);
            if (motionEvent.getAction() == 0 && rectF.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                this.A0 = true;
                this.B0 = motionEvent.getX();
                this.C0 = motionEvent.getY();
                getParent().requestDisallowInterceptTouchEvent(true);
                Object obj = this.f23491w;
                if (obj instanceof g5) {
                    ((h01) ((g5) obj)).f38656f.c(true);
                }
            } else if (motionEvent.getAction() == 2 && this.A0) {
                if (Math.abs(motionEvent.getX() - this.B0) >= AndroidUtilities.touchSlop || Math.abs(motionEvent.getY() - this.C0) >= AndroidUtilities.touchSlop) {
                    this.A0 = false;
                    getParent().requestDisallowInterceptTouchEvent(false);
                    Object obj2 = this.f23491w;
                    if (obj2 instanceof g5) {
                        ((h01) ((g5) obj2)).f38656f.c(false);
                    }
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (this.A0 && motionEvent.getAction() == 1) {
                    this.f23497z0.onClick(this);
                    Object obj3 = this.f23491w;
                    if (obj3 instanceof g5) {
                        ((h01) ((g5) obj3)).f38656f.c(false);
                    }
                }
                this.A0 = false;
                getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        return super.onTouchEvent(motionEvent) || this.A0;
    }

    public void setAlignment(Layout.Alignment alignment) {
        this.H0 = alignment;
        requestLayout();
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f23484r > 1) {
            super.setBackgroundDrawable(drawable);
        } else {
            this.K = drawable;
        }
    }

    public void setBuildFullLayout(boolean z10) {
        this.H = z10;
    }

    public void setCanHideRightDrawable(boolean z10) {
        this.f23494x0 = z10;
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
            this.f23476j0 = true;
            this.f23478l0 = null;
            m();
            b();
        }
        this.m0 = i10;
        m();
    }

    public void setEmojiCacheType(int i10) {
        if (i10 != this.E0) {
            org.telegram.ui.Components.t5.release(this, this.D0);
            this.E0 = i10;
            if (this.G0) {
                this.D0 = org.telegram.ui.Components.t5.update(i10, this, this.D0, this.f23466c);
            }
        }
    }

    public void setEmojiColor(int i10) {
        this.F0 = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
    }

    public void setFullAlpha(float f10) {
        this.I = f10;
        invalidate();
    }

    public void setFullTextMaxLines(int i10) {
        this.f23488t0 = i10;
    }

    public void setGravity(int i10) {
        this.f23479n = i10;
    }

    public void setLeftDrawable(int i10) {
        setLeftDrawable(i10 == 0 ? null : getContext().getResources().getDrawable(i10));
    }

    public void setLeftDrawableOutside(boolean z10) {
        this.f23473g0 = z10;
    }

    public void setLeftDrawableTopPadding(int i10) {
        this.F = i10;
    }

    public void setLinkTextColor(int i10) {
        this.h.linkColor = i10;
        invalidate();
    }

    public void setMaxLines(int i10) {
        this.f23484r = i10;
    }

    public void setMinWidth(int i10) {
        this.f23481o0 = i10;
    }

    public void setMinusWidth(int i10) {
        if (i10 == this.f23487s0) {
            return;
        }
        this.f23487s0 = i10;
        f();
    }

    public void setRightDrawable(int i10) {
        i(i10 == 0 ? null : getContext().getResources().getDrawable(i10));
    }

    public void setRightDrawableInside(boolean z10) {
        this.f23475i0 = z10;
    }

    public void setRightDrawableOnClick(View.OnClickListener onClickListener) {
        this.f23497z0 = onClickListener;
    }

    public void setRightDrawableOutside(boolean z10) {
        this.f23474h0 = z10;
    }

    public void setRightDrawableScale(float f10) {
        this.D = f10;
    }

    public void setRightDrawableTopPadding(int i10) {
        this.G = i10;
    }

    public void setRightPadding(int i10) {
        if (this.f23480n0 != i10) {
            this.f23480n0 = i10;
            int maxTextWidth = ((getMaxTextWidth() - getPaddingLeft()) - getPaddingRight()) - this.f23487s0;
            Drawable drawable = this.v;
            if (drawable != null && !this.f23473g0) {
                maxTextWidth = (maxTextWidth - drawable.getIntrinsicWidth()) - this.E;
            }
            int intrinsicWidth = 0;
            if (!this.f23475i0) {
                Drawable drawable2 = this.f23491w;
                if (drawable2 != null && !this.f23474h0) {
                    intrinsicWidth = (int) (drawable2.getIntrinsicWidth() * this.D);
                    maxTextWidth = (maxTextWidth - intrinsicWidth) - this.E;
                }
                Drawable drawable3 = this.f23493x;
                if (drawable3 != null && !this.f23474h0) {
                    intrinsicWidth = (int) (drawable3.getIntrinsicWidth() * this.D);
                    maxTextWidth = (maxTextWidth - intrinsicWidth) - this.E;
                }
            }
            if (this.A != null && this.f23495y != null) {
                int iIndexOf = this.f23486s.toString().indexOf(this.A);
                this.B = iIndexOf;
                if (iIndexOf < 0) {
                    maxTextWidth = (maxTextWidth - this.f23495y.getIntrinsicWidth()) - this.E;
                }
            }
            if (this.f23494x0 && intrinsicWidth != 0 && !this.f23474h0) {
                if (!this.f23486s.equals(TextUtils.ellipsize(this.f23486s, this.h, maxTextWidth, TextUtils.TruncateAt.END))) {
                    this.f23496y0 = true;
                    maxTextWidth = maxTextWidth + intrinsicWidth + this.E;
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
        g6.w1(i10, this.f23491w);
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
        float f10 = i10;
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
        return drawable == this.f23491w || drawable == this.f23493x || drawable == this.v || super.verifyDrawable(drawable);
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
        this.f23476j0 = z10;
        this.f23478l0 = null;
        m();
        b();
    }
}
