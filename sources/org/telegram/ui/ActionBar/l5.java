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
import org.telegram.ui.Components.iy;
import org.telegram.ui.Components.ou0;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.xw0;
public class l5 extends View implements Drawable.Callback {
    public final Path A0;
    public boolean B0;
    public boolean C0;
    public Drawable D;
    public View.OnClickListener D0;
    public String E;
    public boolean E0;
    public int F;
    public float F0;
    public float G;
    public float G0;
    public float H;
    public org.telegram.ui.Components.n5 H0;
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
    public float f27765a;
    public int f27766a0;
    public float f27767b;
    public int f27768b0;
    public StaticLayout f27769c;
    public int f27770c0;
    public StaticLayout d;
    public int f27771d0;
    public StaticLayout f27772e;
    public int f27773e0;
    public StaticLayout f27774f;
    public int f27775f0;
    public int f27776g0;
    public final TextPaint h;
    public int f27777h0;
    public int f27778i0;
    public boolean f27779j0;
    public boolean f27780k0;
    public boolean f27781l0;
    public boolean m0;
    public int f27782n;
    public boolean f27783n0;
    public boolean f27784o0;
    public Boolean f27785p0;
    public int f27786q0;
    public int f27787r;
    public int f27788r0;
    public CharSequence f27789s;
    public int f27790s0;
    public int f27791t0;
    public int f27792u0;
    public float f27793v0;
    public Drawable f27794w;
    public int f27795w0;
    public Drawable f27796x;
    public int f27797x0;
    public Drawable f27798y;
    public final ArrayList f27799y0;
    public final Stack f27800z0;

    public l5(Context context) {
        super(context);
        this.f27782n = 51;
        this.f27787r = 1;
        this.H = 1.0f;
        this.I = org.telegram.messenger.g0.L(4.0f);
        this.f27786q0 = 16;
        this.f27797x0 = 3;
        this.f27799y0 = new ArrayList();
        this.f27800z0 = new Stack();
        this.A0 = new Path();
        this.I0 = 0;
        this.L0 = Layout.Alignment.ALIGN_NORMAL;
        this.h = new TextPaint(1);
        setImportantForAccessibility(1);
    }

    private Layout.Alignment getAlignment() {
        return this.L0;
    }

    public void Y(int i7, float f10, float f11, te.c cVar) {
        invalidate();
    }

    public final void a(int i7) {
        int i10;
        Drawable drawable;
        Drawable drawable2;
        StaticLayout staticLayout = this.f27769c;
        if (staticLayout == null) {
            return;
        }
        if (staticLayout.getLineCount() > 0) {
            this.f27773e0 = (int) Math.max(Math.ceil(this.f27769c.getLineWidth(0)), Math.ceil(this.f27769c.getLineRight(0) - this.f27769c.getLineLeft(0)));
            StaticLayout staticLayout2 = this.f27772e;
            boolean z9 = true;
            if (staticLayout2 != null) {
                this.f27776g0 = staticLayout2.getLineBottom(staticLayout2.getLineCount() - 1);
            } else if (this.f27787r > 1 && this.f27769c.getLineCount() > 0) {
                StaticLayout staticLayout3 = this.f27769c;
                this.f27776g0 = staticLayout3.getLineBottom(staticLayout3.getLineCount() - 1);
            } else {
                this.f27776g0 = this.f27769c.getLineBottom(0);
            }
            int i11 = this.f27782n & 7;
            if (i11 == 1) {
                this.f27770c0 = ((i7 - this.f27773e0) / 2) - ((int) this.f27769c.getLineLeft(0));
            } else if (i11 == 3) {
                StaticLayout staticLayout4 = this.d;
                if (staticLayout4 != null) {
                    this.f27770c0 = -((int) staticLayout4.getLineLeft(0));
                } else {
                    this.f27770c0 = -((int) this.f27769c.getLineLeft(0));
                }
            } else if (this.f27769c.getLineLeft(0) == 0.0f) {
                StaticLayout staticLayout5 = this.d;
                if (staticLayout5 != null) {
                    this.f27770c0 = (int) (i7 - staticLayout5.getLineWidth(0));
                } else {
                    this.f27770c0 = i7 - this.f27773e0;
                }
            } else {
                this.f27770c0 = -org.telegram.messenger.g0.L(8.0f);
            }
            this.f27770c0 = getPaddingLeft() + this.f27770c0;
            if (this.m0) {
                if (this.f27796x != null && !this.f27781l0) {
                    i10 = (int) (drawable.getIntrinsicWidth() * this.H);
                } else {
                    i10 = 0;
                }
                if (this.f27798y != null && !this.f27781l0) {
                    i10 += (int) (drawable2.getIntrinsicWidth() * this.H);
                }
            } else {
                i10 = 0;
            }
            if (this.f27773e0 + i10 <= i7 - this.f27788r0) {
                z9 = false;
            }
            this.Q = z9;
            b();
            StaticLayout staticLayout6 = this.f27772e;
            if (staticLayout6 != null && this.f27791t0 > 0) {
                this.f27793v0 = staticLayout6.getPrimaryHorizontal(0) - this.d.getPrimaryHorizontal(0);
            }
        }
        int i12 = this.F;
        if (i12 >= 0) {
            this.G = this.f27769c.getPrimaryHorizontal(i12);
        } else {
            this.G = 0.0f;
        }
    }

    public final void b() {
        int i7;
        if ((this.P && (this.Q || this.R != 0.0f)) || this.f27783n0) {
            i7 = 2;
        } else {
            i7 = 0;
        }
        if (getLayerType() != i7) {
            setLayerType(i7, null);
            invalidate();
        }
    }

    public final void c(Canvas canvas) {
        ArrayList arrayList = this.f27799y0;
        if (arrayList.isEmpty()) {
            return;
        }
        Path path = this.A0;
        path.rewind();
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            int i10 = i7 + 1;
            Rect bounds = ((xh.f) arrayList.get(i7)).getBounds();
            path.addRect(bounds.left, bounds.top, bounds.right, bounds.bottom, Path.Direction.CW);
            i7 = i10;
        }
        canvas.clipPath(path, Region.Op.DIFFERENCE);
    }

    public void d(int i7) {
        int i10;
        int i11;
        int i12;
        CharSequence charSequence;
        int L;
        CharSequence charSequence2;
        int i13;
        int L2;
        CharSequence charSequence3;
        int L3;
        int L4;
        int L5;
        Drawable drawable;
        Drawable drawable2;
        Stack stack = this.f27800z0;
        ArrayList arrayList = this.f27799y0;
        CharSequence charSequence4 = this.f27789s;
        this.F = -1;
        this.C0 = false;
        if (charSequence4 != null) {
            try {
                Drawable drawable3 = this.f27794w;
                if (drawable3 != null && !this.f27780k0) {
                    drawable3.getIntrinsicWidth();
                    i10 = (i7 - this.f27794w.getIntrinsicWidth()) - this.I;
                } else {
                    i10 = i7;
                }
                if (!this.m0) {
                    if (this.f27796x != null && !this.f27781l0) {
                        i11 = (int) (drawable.getIntrinsicWidth() * this.H);
                        i10 = (i10 - i11) - this.I;
                    } else {
                        i11 = 0;
                    }
                    if (this.f27798y != null && !this.f27781l0) {
                        i11 += (int) (drawable2.getIntrinsicWidth() * this.H);
                        i10 = (i10 - i11) - this.I;
                    }
                } else {
                    i11 = 0;
                }
                SpannableStringBuilder spannableStringBuilder = charSequence4;
                if (this.E != null) {
                    spannableStringBuilder = charSequence4;
                    if (this.D != null) {
                        int indexOf = charSequence4.toString().indexOf(this.E);
                        this.F = indexOf;
                        if (indexOf >= 0) {
                            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence4);
                            org.telegram.ui.Cells.r2 r2Var = new org.telegram.ui.Cells.r2(this.D.getIntrinsicWidth());
                            int i14 = this.F;
                            valueOf.setSpan(r2Var, i14, this.E.length() + i14, 0);
                            spannableStringBuilder = valueOf;
                        } else {
                            i10 = (i10 - this.D.getIntrinsicWidth()) - this.I;
                            spannableStringBuilder = charSequence4;
                        }
                    }
                }
                CharSequence charSequence5 = spannableStringBuilder;
                boolean z9 = this.B0;
                TextPaint textPaint = this.h;
                if (z9 && i11 != 0 && !this.f27781l0 && !charSequence5.equals(TextUtils.ellipsize(charSequence5, textPaint, i10, TextUtils.TruncateAt.END))) {
                    this.C0 = true;
                    i10 = i10 + i11 + this.I;
                }
                int i15 = i10;
                if (this.L) {
                    if (!this.f27783n0) {
                        charSequence2 = TextUtils.ellipsize(charSequence5, textPaint, i15, TextUtils.TruncateAt.END);
                    } else {
                        charSequence2 = charSequence5;
                    }
                    if (!this.f27783n0 && !charSequence2.equals(charSequence5)) {
                        Layout.Alignment alignment = getAlignment();
                        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                        StaticLayout c10 = ou0.c(charSequence5, textPaint, i15, alignment, 0.0f, truncateAt, i15, this.f27797x0, false);
                        i13 = i15;
                        this.f27772e = c10;
                        if (c10 != null) {
                            int lineEnd = c10.getLineEnd(0);
                            int lineStart = this.f27772e.getLineStart(1);
                            CharSequence subSequence = charSequence5.subSequence(0, lineEnd);
                            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(charSequence5);
                            valueOf2.setSpan(new iy(false), 0, lineStart, 0);
                            if (lineEnd < charSequence2.length()) {
                                charSequence3 = charSequence2.subSequence(lineEnd, charSequence2.length());
                            } else {
                                charSequence3 = "…";
                            }
                            int length = charSequence2.length();
                            if (this.P) {
                                L3 = org.telegram.messenger.g0.L(2000.0f);
                            } else {
                                L3 = i13 + org.telegram.messenger.g0.L(8.0f);
                            }
                            this.d = new StaticLayout(charSequence2, 0, length, textPaint, L3, getAlignment(), 1.0f, 0.0f, false);
                            int length2 = subSequence.length();
                            if (this.P) {
                                L4 = org.telegram.messenger.g0.L(2000.0f);
                            } else {
                                L4 = i13 + org.telegram.messenger.g0.L(8.0f);
                            }
                            StaticLayout staticLayout = new StaticLayout(subSequence, 0, length2, textPaint, L4, getAlignment(), 1.0f, 0.0f, false);
                            this.f27769c = staticLayout;
                            String str = charSequence3;
                            if (staticLayout.getLineLeft(0) != 0.0f) {
                                str = "\u200f" + ((Object) charSequence3);
                            }
                            CharSequence charSequence6 = str;
                            int length3 = charSequence6.length();
                            if (this.P) {
                                L5 = org.telegram.messenger.g0.L(2000.0f);
                            } else {
                                L5 = i13 + org.telegram.messenger.g0.L(8.0f);
                            }
                            this.f27774f = new StaticLayout(charSequence6, 0, length3, textPaint, L5, getAlignment(), 1.0f, 0.0f, false);
                            this.f27772e = ou0.c(valueOf2, textPaint, i13 + org.telegram.messenger.g0.L(8.0f) + this.f27791t0, getAlignment(), 0.0f, truncateAt, i13 + this.f27791t0, this.f27797x0, false);
                        }
                    } else {
                        i13 = i15;
                        CharSequence charSequence7 = charSequence2;
                        int length4 = charSequence7.length();
                        if (!this.P && !this.f27783n0) {
                            L2 = i13 + org.telegram.messenger.g0.L(8.0f);
                            this.f27769c = new StaticLayout(charSequence7, 0, length4, textPaint, L2, getAlignment(), 1.0f, 0.0f, false);
                            this.f27772e = null;
                            this.f27774f = null;
                            this.d = null;
                        }
                        L2 = org.telegram.messenger.g0.L(2000.0f);
                        this.f27769c = new StaticLayout(charSequence7, 0, length4, textPaint, L2, getAlignment(), 1.0f, 0.0f, false);
                        this.f27772e = null;
                        this.f27774f = null;
                        this.d = null;
                    }
                    i12 = i13;
                } else if (this.f27787r > 1) {
                    StaticLayout c11 = ou0.c(charSequence5, textPaint, i15, getAlignment(), 0.0f, TextUtils.TruncateAt.END, i15, this.f27787r, false);
                    i12 = i15;
                    this.f27769c = c11;
                } else {
                    i12 = i15;
                    if (!this.P && !this.f27783n0) {
                        charSequence = TextUtils.ellipsize(charSequence5, textPaint, i12, TextUtils.TruncateAt.END);
                        int length5 = charSequence.length();
                        if (!this.P && !this.f27783n0) {
                            L = org.telegram.messenger.g0.L(8.0f) + i12;
                            this.f27769c = new StaticLayout(charSequence, 0, length5, textPaint, L, getAlignment(), 1.0f, 0.0f, false);
                        }
                        L = org.telegram.messenger.g0.L(2000.0f);
                        this.f27769c = new StaticLayout(charSequence, 0, length5, textPaint, L, getAlignment(), 1.0f, 0.0f, false);
                    }
                    charSequence = charSequence5;
                    int length52 = charSequence.length();
                    if (!this.P) {
                        L = org.telegram.messenger.g0.L(8.0f) + i12;
                        this.f27769c = new StaticLayout(charSequence, 0, length52, textPaint, L, getAlignment(), 1.0f, 0.0f, false);
                    }
                    L = org.telegram.messenger.g0.L(2000.0f);
                    this.f27769c = new StaticLayout(charSequence, 0, length52, textPaint, L, getAlignment(), 1.0f, 0.0f, false);
                }
                stack.addAll(arrayList);
                arrayList.clear();
                StaticLayout staticLayout2 = this.f27769c;
                if (staticLayout2 != null && (staticLayout2.getText() instanceof Spannable)) {
                    xh.f.b(this, this.f27769c, -2, -2, stack, arrayList);
                }
                a(i12);
            } catch (Exception unused) {
            }
        } else {
            this.f27769c = null;
            this.f27773e0 = 0;
            this.f27776g0 = 0;
        }
        org.telegram.ui.Components.r5.release(this, this.H0);
        if (this.K0) {
            this.H0 = org.telegram.ui.Components.r5.update(this.I0, this, this.H0, this.f27769c);
        }
        invalidate();
    }

    public final void e(Canvas canvas) {
        int i7 = (this.M > 0.0f ? 1 : (this.M == 0.0f ? 0 : -1));
        int i10 = 0;
        ArrayList arrayList = this.f27799y0;
        if (i7 > 0 && this.f27792u0 != 0) {
            canvas.save();
            float f10 = this.M;
            canvas.translate((this.f27793v0 * f10) + ((-this.f27792u0) * f10), 0.0f);
            float f11 = this.f27765a;
            float f12 = this.M;
            this.f27765a = rf.b.d(this.f27793v0, f12, (-this.f27792u0) * f12, f11);
            canvas.save();
            c(canvas);
            org.telegram.ui.Components.n5 n5Var = this.H0;
            if (n5Var != null) {
                n5Var.a();
            }
            this.f27769c.draw(canvas);
            canvas.restore();
            org.telegram.ui.Components.r5.drawAnimatedEmojis(canvas, this.f27769c, this.H0, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.J0);
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((xh.f) obj).draw(canvas);
            }
            canvas.restore();
            return;
        }
        canvas.save();
        c(canvas);
        org.telegram.ui.Components.n5 n5Var2 = this.H0;
        if (n5Var2 != null) {
            n5Var2.a();
        }
        this.f27769c.draw(canvas);
        canvas.restore();
        org.telegram.ui.Components.r5.drawAnimatedEmojis(canvas, this.f27769c, this.H0, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.J0);
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            ((xh.f) obj2).draw(canvas);
        }
    }

    public final boolean f() {
        if (this.f27779j0 && getMeasuredHeight() != 0 && !this.L) {
            d(((getMaxTextWidth() - getPaddingLeft()) - getPaddingRight()) - this.f27795w0);
            if ((this.f27782n & 112) == 16) {
                this.f27771d0 = (getMeasuredHeight() - this.f27776g0) / 2;
                return true;
            }
            this.f27771d0 = getPaddingTop();
            return true;
        }
        requestLayout();
        return true;
    }

    public final void g(qu0 qu0Var, String str) {
        Drawable drawable = this.D;
        if (drawable == qu0Var) {
            return;
        }
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.D = qu0Var;
        if (qu0Var != null) {
            qu0Var.setCallback(this);
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
        int i7;
        float measureText = getPaint().measureText(getText().toString()) + getSideDrawablesSize();
        if (this.f27794w == null && this.f27796x == null && this.f27798y == null) {
            i7 = 0;
        } else {
            i7 = this.I;
        }
        return measureText - i7;
    }

    public float getExactWidthIncludeDrawables() {
        int i7;
        int i10;
        float exactWidth = getExactWidth();
        Drawable drawable = this.f27794w;
        int i11 = 0;
        if (drawable != null) {
            i7 = drawable.getIntrinsicWidth();
        } else {
            i7 = 0;
        }
        float f10 = exactWidth + i7;
        Drawable drawable2 = this.f27796x;
        if (drawable2 != null) {
            i10 = drawable2.getIntrinsicWidth();
        } else {
            i10 = 0;
        }
        float f11 = f10 + i10;
        Drawable drawable3 = this.f27798y;
        if (drawable3 != null) {
            i11 = drawable3.getIntrinsicWidth();
        }
        return f11 + i11;
    }

    public float getFullAlpha() {
        return this.M;
    }

    public Layout getLayout() {
        return this.f27769c;
    }

    public float getLayoutX() {
        return this.f27765a;
    }

    public float getLayoutY() {
        return this.f27767b;
    }

    public Drawable getLeftDrawable() {
        return this.f27794w;
    }

    public int getLineCount() {
        int i7;
        StaticLayout staticLayout = this.f27769c;
        if (staticLayout != null) {
            i7 = staticLayout.getLineCount();
        } else {
            i7 = 0;
        }
        StaticLayout staticLayout2 = this.f27772e;
        if (staticLayout2 != null) {
            return staticLayout2.getLineCount() + i7;
        }
        return i7;
    }

    public int getMaxTextWidth() {
        int i7;
        Drawable drawable;
        Drawable drawable2;
        int measuredWidth = getMeasuredWidth();
        int i10 = 0;
        if (this.f27781l0 && (drawable2 = this.f27796x) != null) {
            i7 = drawable2.getIntrinsicWidth() + this.I;
        } else {
            i7 = 0;
        }
        int i11 = measuredWidth - i7;
        if (this.f27781l0 && (drawable = this.f27798y) != null) {
            i10 = this.I + drawable.getIntrinsicWidth();
        }
        return i11 - i10;
    }

    public TextPaint getPaint() {
        return this.h;
    }

    public Drawable getRightDrawable() {
        return this.f27796x;
    }

    public Drawable getRightDrawable2() {
        return this.f27798y;
    }

    public boolean getRightDrawableOutside() {
        return this.f27781l0;
    }

    public int getRightDrawableWidth() {
        Drawable drawable = this.f27796x;
        if (drawable == null) {
            return 0;
        }
        return (int) ((drawable.getIntrinsicWidth() * this.H) + this.I);
    }

    public int getRightDrawableX() {
        return this.f27777h0;
    }

    public int getRightDrawableY() {
        return this.f27778i0;
    }

    public int getSideDrawablesSize() {
        int i7;
        Drawable drawable = this.f27794w;
        if (drawable != null) {
            i7 = drawable.getIntrinsicWidth() + this.I;
        } else {
            i7 = 0;
        }
        Drawable drawable2 = this.f27796x;
        if (drawable2 != null) {
            i7 += ((int) (drawable2.getIntrinsicWidth() * this.H)) + this.I;
        }
        Drawable drawable3 = this.f27798y;
        if (drawable3 != null) {
            return ((int) (drawable3.getIntrinsicWidth() * this.H)) + this.I + i7;
        }
        return i7;
    }

    public CharSequence getText() {
        CharSequence charSequence = this.f27789s;
        if (charSequence == null) {
            return "";
        }
        return charSequence;
    }

    public int getTextColor() {
        return this.h.getColor();
    }

    public int getTextHeight() {
        return this.f27776g0;
    }

    public TextPaint getTextPaint() {
        return this.h;
    }

    public int getTextStartX() {
        int i7 = 0;
        if (this.f27769c == null) {
            return 0;
        }
        Drawable drawable = this.f27794w;
        if (drawable != null && (this.f27782n & 7) == 3) {
            i7 = this.I + drawable.getIntrinsicWidth();
        }
        Drawable drawable2 = this.D;
        if (drawable2 != null && this.F < 0 && (this.f27782n & 7) == 3) {
            i7 += drawable2.getIntrinsicWidth() + this.I;
        }
        return ((int) getX()) + this.f27770c0 + i7;
    }

    public int getTextStartY() {
        if (this.f27769c == null) {
            return 0;
        }
        return (int) getY();
    }

    public int getTextWidth() {
        Drawable drawable;
        int i7;
        Drawable drawable2;
        int i10 = this.f27773e0;
        int i11 = 0;
        if (this.m0) {
            if (this.f27796x != null) {
                i7 = (int) (drawable.getIntrinsicWidth() * this.H);
            } else {
                i7 = 0;
            }
            if (this.f27798y != null) {
                i11 = (int) (drawable2.getIntrinsicWidth() * this.H);
            }
            i11 += i7;
        }
        return i10 + i11;
    }

    public final void h(int i7, int i10) {
        if (this.f27791t0 == i7 && this.f27792u0 == i10) {
            return;
        }
        this.f27791t0 = i7;
        this.f27792u0 = i10;
        d(((getMaxTextWidth() - getPaddingLeft()) - getPaddingRight()) - this.f27795w0);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void i(Drawable drawable) {
        Drawable drawable2 = this.f27796x;
        if (drawable2 == drawable) {
            return;
        }
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f27796x = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        f();
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = this.f27794w;
        if (drawable == drawable2) {
            invalidate(drawable2.getBounds());
            return;
        }
        Drawable drawable3 = this.f27796x;
        if (drawable == drawable3) {
            invalidate(drawable3.getBounds());
            return;
        }
        Drawable drawable4 = this.f27798y;
        if (drawable == drawable4) {
            invalidate(drawable4.getBounds());
            return;
        }
        Drawable drawable5 = this.D;
        if (drawable == drawable5) {
            invalidate(drawable5.getBounds());
        }
    }

    public final void j(Drawable drawable) {
        Drawable drawable2 = this.f27798y;
        if (drawable2 == drawable) {
            return;
        }
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f27798y = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        f();
    }

    public boolean k(CharSequence charSequence) {
        return l(charSequence, false);
    }

    public boolean l(CharSequence charSequence, boolean z9) {
        CharSequence charSequence2 = this.f27789s;
        if (charSequence2 != null || charSequence != null) {
            if (!z9 && charSequence2 != null && charSequence2.equals(charSequence)) {
                return false;
            }
            this.f27789s = charSequence;
            this.T = 500;
            f();
            return true;
        }
        return false;
    }

    public final void m() {
        boolean z9;
        if ((this.U == null || this.V == null) && this.P) {
            Paint paint = new Paint();
            this.U = paint;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(6.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, tileMode));
            Paint paint2 = this.U;
            PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
            paint2.setXfermode(new PorterDuffXfermode(mode));
            Paint paint3 = new Paint();
            this.V = paint3;
            paint3.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(6.0f), 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
            this.V.setXfermode(new PorterDuffXfermode(mode));
        }
        Boolean bool = this.f27785p0;
        if (bool != null) {
            z9 = bool.booleanValue();
        } else {
            z9 = false;
        }
        if ((this.W == null || this.f27766a0 != org.telegram.messenger.g0.L(this.f27786q0) || this.f27784o0 != z9) && this.f27783n0) {
            if (this.W == null) {
                this.W = new Paint();
            }
            this.f27784o0 = z9;
            if (z9) {
                Paint paint4 = this.W;
                int L = org.telegram.messenger.g0.L(this.f27786q0);
                this.f27766a0 = L;
                paint4.setShader(new LinearGradient(0.0f, 0.0f, L, 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            } else {
                Paint paint5 = this.W;
                int L2 = org.telegram.messenger.g0.L(this.f27786q0);
                this.f27766a0 = L2;
                paint5.setShader(new LinearGradient(0.0f, 0.0f, L2, 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            }
            this.W.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.K0 = true;
        this.H0 = org.telegram.ui.Components.r5.update(this.I0, this, this.H0, this.f27769c);
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.K0 = false;
        org.telegram.ui.Components.r5.release(this, this.H0);
        this.f27779j0 = false;
    }

    @Override
    public void onDraw(Canvas canvas) {
        boolean z9;
        int i7;
        Drawable drawable;
        float f10;
        float f11;
        int i10;
        Drawable drawable2;
        int D;
        int i11;
        int i12;
        int D2;
        int i13;
        int D3;
        int i14;
        float f12;
        float f13;
        float f14;
        Drawable drawable3;
        float f15;
        boolean z10;
        float f16;
        Drawable drawable4;
        int D4;
        int i15;
        int D5;
        int i16;
        float f17;
        float f18;
        Drawable drawable5;
        Drawable drawable6;
        Drawable drawable7;
        int D6;
        int i17;
        int D7;
        int i18;
        int intrinsicHeight;
        Drawable drawable8;
        int D8;
        int i19;
        int D9;
        int i20;
        int intrinsicHeight2;
        int intrinsicHeight3;
        super.onDraw(canvas);
        this.f27765a = 0.0f;
        this.f27767b = 0.0f;
        if (this.P && (this.Q || this.R != 0.0f)) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f27775f0 = this.f27773e0;
        Drawable drawable9 = this.f27794w;
        if (drawable9 != null && !this.f27780k0) {
            int i21 = (int) (-this.R);
            int i22 = this.f27782n;
            if ((i22 & 7) == 1) {
                i21 += this.f27770c0;
            }
            if ((i22 & 112) == 16) {
                intrinsicHeight3 = ((getMeasuredHeight() - this.f27794w.getIntrinsicHeight()) / 2) + this.J;
            } else {
                intrinsicHeight3 = this.J + ((this.f27776g0 - this.f27794w.getIntrinsicHeight()) / 2) + getPaddingTop();
            }
            Drawable drawable10 = this.f27794w;
            drawable10.setBounds(i21, intrinsicHeight3, drawable10.getIntrinsicWidth() + i21, this.f27794w.getIntrinsicHeight() + intrinsicHeight3);
            this.f27794w.draw(canvas);
            int i23 = this.f27782n & 7;
            if (i23 != 3 && i23 != 1) {
                i7 = 0;
            } else {
                i7 = this.f27794w.getIntrinsicWidth() + this.I;
            }
            this.f27775f0 = this.f27794w.getIntrinsicWidth() + this.I + this.f27775f0;
        } else if (this.f27780k0 && drawable9 != null) {
            i7 = this.I + drawable9.getIntrinsicWidth();
        } else {
            i7 = 0;
        }
        Drawable drawable11 = this.D;
        if (drawable11 != null && this.E != null) {
            int i24 = (int) ((-this.R) + this.G);
            int i25 = this.f27782n;
            if ((i25 & 7) == 1) {
                i24 += this.f27770c0;
            }
            if ((i25 & 112) == 16) {
                intrinsicHeight2 = ((getMeasuredHeight() - this.D.getIntrinsicHeight()) / 2) + this.J;
            } else {
                intrinsicHeight2 = this.J + ((this.f27776g0 - drawable11.getIntrinsicHeight()) / 2);
            }
            Drawable drawable12 = this.D;
            drawable12.setBounds(i24, intrinsicHeight2, drawable12.getIntrinsicWidth() + i24, this.D.getIntrinsicHeight() + intrinsicHeight2);
            this.D.draw(canvas);
            if (this.F < 0) {
                int i26 = this.f27782n & 7;
                if (i26 == 3 || i26 == 1) {
                    i7 += this.D.getIntrinsicWidth() + this.I;
                }
                this.f27775f0 = this.D.getIntrinsicWidth() + this.I + this.f27775f0;
            }
        }
        int i27 = i7;
        if (this.f27796x != null && !this.C0 && this.H > 0.0f && !this.f27781l0 && !this.m0) {
            int i28 = this.f27773e0 + i27 + this.I + ((int) (-this.R));
            int i29 = this.f27782n & 7;
            if (i29 == 1 || i29 == 5) {
                i28 += this.f27770c0;
            }
            int intrinsicWidth = (int) (drawable.getIntrinsicWidth() * this.H);
            int intrinsicHeight4 = (int) (this.f27796x.getIntrinsicHeight() * this.H);
            if ((this.f27782n & 112) == 16) {
                D9 = (getMeasuredHeight() - intrinsicHeight4) / 2;
                i20 = this.K;
            } else {
                D9 = jg.g.D(this.f27776g0, intrinsicHeight4, 2, getPaddingTop());
                i20 = this.K;
            }
            int i30 = D9 + i20;
            f10 = 0.0f;
            this.f27796x.setBounds(i28, i30, i28 + intrinsicWidth, i30 + intrinsicHeight4);
            this.f27777h0 = i28 + (intrinsicWidth >> 1);
            this.f27778i0 = i30 + (intrinsicHeight4 >> 1);
            this.f27796x.draw(canvas);
            this.f27775f0 = this.I + intrinsicWidth + this.f27775f0;
        } else {
            f10 = 0.0f;
        }
        if (this.f27798y != null && !this.C0 && this.H > f10 && !this.f27781l0 && !this.m0) {
            int i31 = this.f27773e0 + i27 + this.I + ((int) (-this.R));
            if (this.f27796x != null) {
                i31 += ((int) (drawable8.getIntrinsicWidth() * this.H)) + this.I;
            }
            int i32 = this.f27782n & 7;
            if (i32 == 1 || i32 == 5) {
                i31 += this.f27770c0;
            }
            int intrinsicWidth2 = (int) (this.f27798y.getIntrinsicWidth() * this.H);
            int intrinsicHeight5 = (int) (this.f27798y.getIntrinsicHeight() * this.H);
            if ((this.f27782n & 112) == 16) {
                D8 = (getMeasuredHeight() - intrinsicHeight5) / 2;
                i19 = this.K;
            } else {
                D8 = jg.g.D(this.f27776g0, intrinsicHeight5, 2, getPaddingTop());
                i19 = this.K;
            }
            int i33 = D8 + i19;
            this.f27798y.setBounds(i31, i33, i31 + intrinsicWidth2, intrinsicHeight5 + i33);
            this.f27798y.draw(canvas);
            this.f27775f0 = this.I + intrinsicWidth2 + this.f27775f0;
        }
        int L = org.telegram.messenger.g0.L(16.0f) + this.f27775f0;
        float f19 = this.R;
        if (f19 != f10) {
            if (this.f27794w != null && !this.f27780k0) {
                int i34 = ((int) (-f19)) + L;
                if ((this.f27782n & 112) == 16) {
                    intrinsicHeight = ((getMeasuredHeight() - this.f27794w.getIntrinsicHeight()) / 2) + this.J;
                } else {
                    intrinsicHeight = this.J + ((this.f27776g0 - this.f27794w.getIntrinsicHeight()) / 2) + getPaddingTop();
                }
                Drawable drawable13 = this.f27794w;
                drawable13.setBounds(i34, intrinsicHeight, drawable13.getIntrinsicWidth() + i34, this.f27794w.getIntrinsicHeight() + intrinsicHeight);
                this.f27794w.draw(canvas);
            }
            if (this.f27796x != null && !this.f27781l0) {
                int intrinsicWidth3 = (int) (drawable5.getIntrinsicWidth() * this.H);
                int intrinsicHeight6 = (int) (this.f27796x.getIntrinsicHeight() * this.H);
                int i35 = this.f27773e0 + i27 + this.I + ((int) (-this.R)) + L;
                if ((this.f27782n & 112) == 16) {
                    D7 = (getMeasuredHeight() - intrinsicHeight6) / 2;
                    i18 = this.K;
                } else {
                    D7 = jg.g.D(this.f27776g0, intrinsicHeight6, 2, getPaddingTop());
                    i18 = this.K;
                }
                int i36 = D7 + i18;
                f11 = 16.0f;
                this.f27796x.setBounds(i35, i36, i35 + intrinsicWidth3, i36 + intrinsicHeight6);
                this.f27777h0 = i35 + (intrinsicWidth3 >> 1);
                this.f27778i0 = i36 + (intrinsicHeight6 >> 1);
                this.f27796x.draw(canvas);
            } else {
                f11 = 16.0f;
            }
            if (this.f27798y != null && !this.f27781l0) {
                int intrinsicWidth4 = (int) (drawable6.getIntrinsicWidth() * this.H);
                int intrinsicHeight7 = (int) (this.f27798y.getIntrinsicHeight() * this.H);
                int i37 = this.f27773e0 + i27 + this.I + ((int) (-this.R)) + L;
                if (this.f27796x != null) {
                    i37 += ((int) (drawable7.getIntrinsicWidth() * this.H)) + this.I;
                }
                if ((this.f27782n & 112) == 16) {
                    D6 = (getMeasuredHeight() - intrinsicHeight7) / 2;
                    i17 = this.K;
                } else {
                    D6 = jg.g.D(this.f27776g0, intrinsicHeight7, 2, getPaddingTop());
                    i17 = this.K;
                }
                int i38 = D6 + i17;
                this.f27798y.setBounds(i37, i38, intrinsicWidth4 + i37, intrinsicHeight7 + i38);
                this.f27798y.draw(canvas);
            }
        } else {
            f11 = 16.0f;
        }
        if (this.f27769c != null) {
            if (this.f27780k0 || this.f27781l0 || this.f27783n0 || this.f27788r0 > 0) {
                canvas.save();
                int maxTextWidth = getMaxTextWidth() - this.f27788r0;
                Drawable drawable14 = this.f27796x;
                if (drawable14 != null && !(drawable14 instanceof org.telegram.ui.Components.g5) && this.f27781l0) {
                    f12 = 2.0f;
                } else {
                    f12 = f10;
                }
                canvas.clipRect(i27, 0, maxTextWidth - org.telegram.messenger.g0.L(f12), getMeasuredHeight());
            }
            org.telegram.messenger.i6.f23063n = false;
            if (this.O != null) {
                int i39 = this.f27773e0;
                int i40 = (i39 / 2) + ((int) ((this.f27770c0 + i27) - this.R));
                int max = Math.max(getPaddingRight() + getPaddingLeft() + i39, this.f27790s0);
                int i41 = i40 - (max / 2);
                this.O.setBounds(i41, 0, max + i41, getMeasuredHeight());
                this.O.draw(canvas);
            }
            if (this.f27770c0 + i27 != 0 || this.f27771d0 != 0 || this.R != f10) {
                canvas.save();
                canvas.translate((this.f27770c0 + i27) - this.R, this.f27771d0);
                this.f27765a = ((this.f27770c0 + i27) - this.R) + this.f27765a;
                this.f27767b += this.f27771d0;
            }
            e(canvas);
            StaticLayout staticLayout = this.f27774f;
            TextPaint textPaint = this.h;
            if (staticLayout != null && this.M < 1.0f) {
                int alpha = textPaint.getAlpha();
                textPaint.setAlpha((int) ((1.0f - this.M) * 255.0f));
                canvas.save();
                if (this.f27774f.getText().length() == 1) {
                    if (this.f27797x0 == 1) {
                        f18 = 0.5f;
                    } else {
                        f18 = 4.0f;
                    }
                    f17 = org.telegram.messenger.g0.L(f18);
                } else {
                    f17 = f10;
                }
                if (this.f27769c.getLineLeft(0) != f10) {
                    float f20 = (-this.f27769c.getLineWidth(0)) + f17;
                    float f21 = f10;
                    canvas.translate(f20, f21);
                    f13 = f21;
                } else {
                    f13 = f10;
                    canvas.translate(this.f27769c.getLineWidth(0) - f17, f13);
                }
                float f22 = this.M;
                canvas.translate((this.f27793v0 * f22) + ((-this.f27792u0) * f22), f13);
                this.f27774f.draw(canvas);
                canvas.restore();
                textPaint.setAlpha(alpha);
            } else {
                f13 = f10;
            }
            if (this.f27772e != null) {
                if (this.M > f13) {
                    int alpha2 = textPaint.getAlpha();
                    textPaint.setAlpha((int) (this.M * 255.0f));
                    float f23 = this.M;
                    float f24 = this.f27793v0;
                    float f25 = ((f23 * f24) + ((-this.f27792u0) * f23)) - f24;
                    f14 = 0.0f;
                    canvas.translate(f25, 0.0f);
                    this.f27772e.draw(canvas);
                    textPaint.setAlpha(alpha2);
                } else {
                    f14 = 0.0f;
                }
            } else {
                f14 = f13;
            }
            if (this.R != f14) {
                canvas.translate(L, f14);
                e(canvas);
            }
            if (this.f27770c0 + i27 != 0 || this.f27771d0 != 0 || this.R != f14) {
                canvas.restore();
            }
            if (this.f27796x != null && !this.C0 && this.H > 0.0f && !this.f27781l0 && this.m0) {
                int i42 = this.f27773e0 + i27 + this.I + ((int) (-this.R));
                int i43 = this.f27782n & 7;
                if (i43 == 1 || i43 == 5) {
                    i42 += this.f27770c0;
                }
                int intrinsicWidth5 = (int) (drawable3.getIntrinsicWidth() * this.H);
                int intrinsicHeight8 = (int) (this.f27796x.getIntrinsicHeight() * this.H);
                if ((this.f27782n & 112) == 16) {
                    D5 = (getMeasuredHeight() - intrinsicHeight8) / 2;
                    i16 = this.K;
                } else {
                    D5 = jg.g.D(this.f27776g0, intrinsicHeight8, 2, getPaddingTop());
                    i16 = this.K;
                }
                int i44 = D5 + i16;
                this.f27796x.setBounds(i42, i44, i42 + intrinsicWidth5, i44 + intrinsicHeight8);
                this.f27777h0 = i42 + (intrinsicWidth5 >> 1);
                this.f27778i0 = i44 + (intrinsicHeight8 >> 1);
                this.f27796x.draw(canvas);
                this.f27775f0 = this.I + intrinsicWidth5 + this.f27775f0;
            }
            if (this.f27798y != null && !this.C0 && this.H > 0.0f && !this.f27781l0 && this.m0) {
                int i45 = this.f27773e0 + i27 + this.I + ((int) (-this.R));
                if (this.f27796x != null) {
                    i45 += ((int) (drawable4.getIntrinsicWidth() * this.H)) + this.I;
                }
                int i46 = this.f27782n & 7;
                if (i46 == 1 || i46 == 5) {
                    i45 += this.f27770c0;
                }
                int intrinsicWidth6 = (int) (this.f27798y.getIntrinsicWidth() * this.H);
                int intrinsicHeight9 = (int) (this.f27798y.getIntrinsicHeight() * this.H);
                if ((this.f27782n & 112) == 16) {
                    D4 = (getMeasuredHeight() - intrinsicHeight9) / 2;
                    i15 = this.K;
                } else {
                    D4 = jg.g.D(this.f27776g0, intrinsicHeight9, 2, getPaddingTop());
                    i15 = this.K;
                }
                int i47 = D4 + i15;
                this.f27798y.setBounds(i45, i47, i45 + intrinsicWidth6, intrinsicHeight9 + i47);
                this.f27798y.draw(canvas);
                this.f27775f0 = this.I + intrinsicWidth6 + this.f27775f0;
            }
            if (z9) {
                if (this.R < org.telegram.messenger.g0.L(10.0f)) {
                    this.U.setAlpha((int) ((this.R / org.telegram.messenger.g0.L(10.0f)) * 255.0f));
                } else {
                    if (this.R > (org.telegram.messenger.g0.L(f11) + this.f27775f0) - org.telegram.messenger.g0.L(10.0f)) {
                        this.U.setAlpha((int) org.telegram.messenger.camera.q.x(this.R - ((org.telegram.messenger.g0.L(f11) + this.f27775f0) - org.telegram.messenger.g0.L(10.0f)), org.telegram.messenger.g0.L(10.0f), 1.0f, 255.0f));
                    } else {
                        this.U.setAlpha(255);
                    }
                }
                canvas.drawRect(i27, 0.0f, org.telegram.messenger.g0.L(6.0f) + i27, getMeasuredHeight(), this.U);
                canvas.save();
                canvas.translate((getMaxTextWidth() - this.f27788r0) - org.telegram.messenger.g0.L(6.0f), 0.0f);
                canvas.drawRect(0.0f, 0.0f, org.telegram.messenger.g0.L(6.0f), getMeasuredHeight(), this.V);
                canvas.restore();
            } else if (this.f27783n0 && this.Q && this.W != null) {
                canvas.save();
                m();
                if (!this.f27784o0) {
                    int maxTextWidth2 = (getMaxTextWidth() - this.f27788r0) - this.f27766a0;
                    Drawable drawable15 = this.f27796x;
                    if (drawable15 != null && !(drawable15 instanceof org.telegram.ui.Components.g5) && this.f27781l0) {
                        f15 = 2.0f;
                    } else {
                        f15 = 0.0f;
                    }
                    canvas.translate(maxTextWidth2 - org.telegram.messenger.g0.L(f15), 0.0f);
                }
                canvas.drawRect(i27, 0.0f, this.f27766a0, getMeasuredHeight(), this.W);
                canvas.restore();
            }
            if (!this.P || (!this.Q && this.R == 0.0f)) {
                z10 = true;
            } else {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j3 = elapsedRealtime - this.S;
                if (j3 > 17) {
                    j3 = 17;
                }
                int i48 = this.T;
                if (i48 > 0) {
                    this.T = (int) (i48 - j3);
                    z10 = true;
                } else {
                    int L2 = org.telegram.messenger.g0.L(f11) + this.f27775f0;
                    if (this.R < org.telegram.messenger.g0.L(100.0f)) {
                        f16 = com.google.android.recaptcha.internal.a.c(this.R, org.telegram.messenger.g0.L(100.0f), 20.0f, 30.0f);
                        z10 = true;
                    } else if (this.R >= L2 - org.telegram.messenger.g0.L(100.0f)) {
                        z10 = true;
                        f16 = org.telegram.messenger.camera.q.v(this.R - (L2 - org.telegram.messenger.g0.L(100.0f)), org.telegram.messenger.g0.L(100.0f), 20.0f, 50.0f);
                    } else {
                        z10 = true;
                        f16 = 50.0f;
                    }
                    float L3 = ((((float) j3) / 1000.0f) * org.telegram.messenger.g0.L(f16)) + this.R;
                    this.R = L3;
                    this.S = elapsedRealtime;
                    if (L3 > L2) {
                        this.R = 0.0f;
                        this.T = 500;
                    }
                    b();
                }
                invalidate();
            }
            org.telegram.messenger.i6.f23063n = z10;
            if (this.f27780k0 || this.f27781l0 || this.f27783n0 || this.f27788r0 > 0) {
                canvas.restore();
            }
        }
        Drawable drawable16 = this.f27794w;
        if (drawable16 != null && this.f27780k0) {
            int intrinsicWidth7 = drawable16.getIntrinsicWidth();
            int intrinsicHeight10 = this.f27794w.getIntrinsicHeight();
            if ((this.f27782n & 112) == 16) {
                D3 = (getMeasuredHeight() - intrinsicHeight10) / 2;
                i14 = this.J;
            } else {
                D3 = jg.g.D(this.f27776g0, intrinsicHeight10, 2, getPaddingTop());
                i14 = this.J;
            }
            int i49 = D3 + i14;
            this.f27794w.setBounds(0, i49, intrinsicWidth7, intrinsicHeight10 + i49);
            this.f27794w.draw(canvas);
        }
        if (this.f27796x != null && this.f27781l0) {
            int i50 = this.f27773e0 + i27 + this.I;
            float f26 = this.R;
            if (f26 == 0.0f) {
                i12 = -L;
            } else {
                i12 = (int) (-f26);
            }
            int min = Math.min(i50 + i12 + L, (getMaxTextWidth() - this.f27788r0) + this.I);
            int intrinsicWidth8 = (int) (this.f27796x.getIntrinsicWidth() * this.H);
            int intrinsicHeight11 = (int) (this.f27796x.getIntrinsicHeight() * this.H);
            if ((this.f27782n & 112) == 16) {
                D2 = (getMeasuredHeight() - intrinsicHeight11) / 2;
                i13 = this.K;
            } else {
                D2 = jg.g.D(this.f27776g0, intrinsicHeight11, 2, getPaddingTop());
                i13 = this.K;
            }
            int i51 = D2 + i13;
            this.f27796x.setBounds(min, i51, min + intrinsicWidth8, i51 + intrinsicHeight11);
            this.f27777h0 = min + (intrinsicWidth8 >> 1);
            this.f27778i0 = i51 + (intrinsicHeight11 >> 1);
            this.f27796x.draw(canvas);
        }
        if (this.f27798y != null && this.f27781l0) {
            int i52 = i27 + this.f27773e0 + this.I;
            float f27 = this.R;
            if (f27 == 0.0f) {
                i10 = -L;
            } else {
                i10 = (int) (-f27);
            }
            int min2 = Math.min(i52 + i10 + L, (getMaxTextWidth() - this.f27788r0) + this.I);
            if (this.f27796x != null) {
                min2 += ((int) (drawable2.getIntrinsicWidth() * this.H)) + this.I;
            }
            int intrinsicWidth9 = (int) (this.f27798y.getIntrinsicWidth() * this.H);
            int intrinsicHeight12 = (int) (this.f27798y.getIntrinsicHeight() * this.H);
            if ((this.f27782n & 112) == 16) {
                D = (getMeasuredHeight() - intrinsicHeight12) / 2;
                i11 = this.K;
            } else {
                D = jg.g.D(this.f27776g0, intrinsicHeight12, 2, getPaddingTop());
                i11 = this.K;
            }
            int i53 = D + i11;
            this.f27798y.setBounds(min2, i53, intrinsicWidth9 + min2, intrinsicHeight12 + i53);
            this.f27798y.draw(canvas);
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setVisibleToUser(true);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setText(this.f27789s);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        this.f27779j0 = true;
    }

    @Override
    public void onMeasure(int i7, int i10) {
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
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        int i17 = this.f27768b0;
        int i18 = org.telegram.messenger.g0.f22563q.x;
        if (i17 != i18) {
            this.f27768b0 = i18;
            this.R = 0.0f;
            this.T = 500;
            b();
        }
        int paddingLeft = ((size - getPaddingLeft()) - getPaddingRight()) - this.f27795w0;
        if (this.f27780k0 && (drawable6 = this.f27794w) != null) {
            i11 = drawable6.getIntrinsicWidth() + this.I;
        } else {
            i11 = 0;
        }
        int i19 = paddingLeft - i11;
        if (this.f27781l0 && (drawable5 = this.f27796x) != null) {
            i12 = drawable5.getIntrinsicWidth() + this.I;
        } else {
            i12 = 0;
        }
        int i20 = i19 - i12;
        if (this.f27781l0 && (drawable4 = this.f27798y) != null) {
            i13 = drawable4.getIntrinsicWidth() + this.I;
        } else {
            i13 = 0;
        }
        d(i20 - i13);
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            size2 = getPaddingBottom() + getPaddingTop() + this.f27776g0;
        }
        if (this.N) {
            int paddingRight = getPaddingRight() + getPaddingLeft() + this.f27773e0 + this.f27795w0;
            if (this.f27780k0 && (drawable3 = this.f27794w) != null) {
                i14 = drawable3.getIntrinsicWidth() + this.I;
            } else {
                i14 = 0;
            }
            int i21 = paddingRight + i14;
            if (this.f27781l0 && (drawable2 = this.f27796x) != null) {
                i15 = drawable2.getIntrinsicWidth() + this.I;
            } else {
                i15 = 0;
            }
            int i22 = i21 + i15;
            if (this.f27781l0 && (drawable = this.f27798y) != null) {
                i16 = drawable.getIntrinsicWidth() + this.I;
            } else {
                i16 = 0;
            }
            size = Math.max(Math.min(size, i22 + i16), 0);
        }
        setMeasuredDimension(size, size2);
        if ((this.f27782n & 112) == 16) {
            this.f27771d0 = jg.g.D((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), this.f27776g0, 2, getPaddingTop());
        } else {
            this.f27771d0 = getPaddingTop();
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.D0 != null && this.f27796x != null) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(this.f27777h0 - org.telegram.messenger.g0.L(16.0f), this.f27778i0 - org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f) + this.f27777h0, org.telegram.messenger.g0.L(16.0f) + this.f27778i0);
            if (motionEvent.getAction() == 0 && rectF.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                this.E0 = true;
                this.F0 = motionEvent.getX();
                this.G0 = motionEvent.getY();
                getParent().requestDisallowInterceptTouchEvent(true);
                Drawable drawable = this.f27796x;
                if (drawable instanceof k5) {
                    ((xw0) ((k5) drawable)).f51787f.c(true);
                }
            } else if (motionEvent.getAction() == 2 && this.E0) {
                if (Math.abs(motionEvent.getX() - this.F0) >= org.telegram.messenger.g0.f22542e || Math.abs(motionEvent.getY() - this.G0) >= org.telegram.messenger.g0.f22542e) {
                    this.E0 = false;
                    getParent().requestDisallowInterceptTouchEvent(false);
                    Drawable drawable2 = this.f27796x;
                    if (drawable2 instanceof k5) {
                        ((xw0) ((k5) drawable2)).f51787f.c(false);
                    }
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (this.E0 && motionEvent.getAction() == 1) {
                    this.D0.onClick(this);
                    Drawable drawable3 = this.f27796x;
                    if (drawable3 instanceof k5) {
                        ((xw0) ((k5) drawable3)).f51787f.c(false);
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
        if (this.f27787r > 1) {
            super.setBackgroundDrawable(drawable);
        } else {
            this.O = drawable;
        }
    }

    public void setBuildFullLayout(boolean z9) {
        this.L = z9;
    }

    public void setCanHideRightDrawable(boolean z9) {
        this.B0 = z9;
    }

    public void setDrawablePadding(int i7) {
        if (this.I == i7) {
            return;
        }
        this.I = i7;
        f();
    }

    public void setEllipsizeByGradient(int i7) {
        if (!this.P) {
            this.f27783n0 = true;
            this.f27785p0 = null;
            m();
            b();
        }
        this.f27786q0 = i7;
        m();
    }

    public void setEmojiCacheType(int i7) {
        if (i7 != this.I0) {
            org.telegram.ui.Components.r5.release(this, this.H0);
            this.I0 = i7;
            if (this.K0) {
                this.H0 = org.telegram.ui.Components.r5.update(i7, this, this.H0, this.f27769c);
            }
        }
    }

    public void setEmojiColor(int i7) {
        this.J0 = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
    }

    public void setFullAlpha(float f10) {
        this.M = f10;
        invalidate();
    }

    public void setFullTextMaxLines(int i7) {
        this.f27797x0 = i7;
    }

    public void setGravity(int i7) {
        this.f27782n = i7;
    }

    public void setLeftDrawable(int i7) {
        setLeftDrawable(i7 == 0 ? null : getContext().getResources().getDrawable(i7));
    }

    public void setLeftDrawableOutside(boolean z9) {
        this.f27780k0 = z9;
    }

    public void setLeftDrawableTopPadding(int i7) {
        this.J = i7;
    }

    public void setLinkTextColor(int i7) {
        this.h.linkColor = i7;
        invalidate();
    }

    public void setMaxLines(int i7) {
        this.f27787r = i7;
    }

    public void setMinWidth(int i7) {
        this.f27790s0 = i7;
    }

    public void setMinusWidth(int i7) {
        if (i7 == this.f27795w0) {
            return;
        }
        this.f27795w0 = i7;
        f();
    }

    public void setRightDrawable(int i7) {
        Drawable drawable;
        if (i7 == 0) {
            drawable = null;
        } else {
            drawable = getContext().getResources().getDrawable(i7);
        }
        i(drawable);
    }

    public void setRightDrawableInside(boolean z9) {
        this.m0 = z9;
    }

    public void setRightDrawableOnClick(View.OnClickListener onClickListener) {
        this.D0 = onClickListener;
    }

    public void setRightDrawableOutside(boolean z9) {
        this.f27781l0 = z9;
    }

    public void setRightDrawableScale(float f10) {
        this.H = f10;
    }

    public void setRightDrawableTopPadding(int i7) {
        this.K = i7;
    }

    public void setRightPadding(int i7) {
        if (this.f27788r0 != i7) {
            this.f27788r0 = i7;
            int maxTextWidth = ((getMaxTextWidth() - getPaddingLeft()) - getPaddingRight()) - this.f27795w0;
            Drawable drawable = this.f27794w;
            if (drawable != null && !this.f27780k0) {
                maxTextWidth = (maxTextWidth - drawable.getIntrinsicWidth()) - this.I;
            }
            int i10 = 0;
            if (!this.m0) {
                Drawable drawable2 = this.f27796x;
                if (drawable2 != null && !this.f27781l0) {
                    i10 = (int) (drawable2.getIntrinsicWidth() * this.H);
                    maxTextWidth = (maxTextWidth - i10) - this.I;
                }
                Drawable drawable3 = this.f27798y;
                if (drawable3 != null && !this.f27781l0) {
                    i10 = (int) (drawable3.getIntrinsicWidth() * this.H);
                    maxTextWidth = (maxTextWidth - i10) - this.I;
                }
            }
            if (this.E != null && this.D != null) {
                int indexOf = this.f27789s.toString().indexOf(this.E);
                this.F = indexOf;
                if (indexOf < 0) {
                    maxTextWidth = (maxTextWidth - this.D.getIntrinsicWidth()) - this.I;
                }
            }
            if (this.B0 && i10 != 0 && !this.f27781l0) {
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                if (!this.f27789s.equals(TextUtils.ellipsize(this.f27789s, this.h, maxTextWidth, truncateAt))) {
                    this.C0 = true;
                    maxTextWidth = maxTextWidth + i10 + this.I;
                }
            }
            a(maxTextWidth);
            invalidate();
        }
    }

    public void setScrollNonFitText(boolean z9) {
        if (this.P == z9) {
            return;
        }
        this.P = z9;
        m();
        requestLayout();
        b();
    }

    public void setSideDrawablesColor(int i7) {
        l6.C1(i7, this.f27796x);
        l6.C1(i7, this.f27794w);
    }

    public void setTextColor(int i7) {
        this.h.setColor(i7);
        invalidate();
    }

    public void setTextSize(int i7) {
        setTextSizePx(org.telegram.messenger.g0.L(i7));
    }

    public void setTextSizePx(int i7) {
        float f10 = i7;
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

    public void setWidthWrapContent(boolean z9) {
        this.N = z9;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f27796x && drawable != this.f27798y && drawable != this.f27794w && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public void setLeftDrawable(Drawable drawable) {
        Drawable drawable2 = this.f27794w;
        if (drawable2 == drawable) {
            return;
        }
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f27794w = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        f();
    }

    public void setEllipsizeByGradient(boolean z9) {
        if (this.P == z9) {
            return;
        }
        this.f27783n0 = z9;
        this.f27785p0 = null;
        m();
        b();
    }
}
