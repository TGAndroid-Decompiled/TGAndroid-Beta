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
import org.telegram.messenger.ai;
import org.telegram.ui.Components.c00;
import org.telegram.ui.Components.ox0;
import org.telegram.ui.Components.qx0;
import org.telegram.ui.i11;
public class h5 extends View implements Drawable.Callback {
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
    public org.telegram.ui.Components.x5 H0;
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
    public float f20687a;
    public int f20688a0;
    public float f20689b;
    public int f20690b0;
    public StaticLayout f20691c;
    public int f20692c0;
    public StaticLayout d;
    public int f20693d0;
    public StaticLayout f20694e;
    public int f20695e0;
    public StaticLayout f20696f;
    public int f20697f0;
    public int f20698g0;
    public final TextPaint h;
    public int f20699h0;
    public int f20700i0;
    public boolean f20701j0;
    public boolean f20702k0;
    public boolean f20703l0;
    public boolean m0;
    public int f20704n;
    public boolean f20705n0;
    public boolean f20706o0;
    public Boolean f20707p0;
    public int f20708q0;
    public int f20709r;
    public int f20710r0;
    public CharSequence f20711s;
    public int f20712s0;
    public int f20713t0;
    public int f20714u0;
    public Drawable v;
    public float f20715v0;
    public Drawable f20716w;
    public int f20717w0;
    public Drawable f20718x;
    public int f20719x0;
    public Drawable f20720y;
    public final ArrayList f20721y0;
    public final Stack f20722z0;

    public h5(Context context) {
        super(context);
        this.f20704n = 51;
        this.f20709r = 1;
        this.H = 1.0f;
        this.I = AndroidUtilities.dp(4.0f);
        this.f20708q0 = 16;
        this.f20719x0 = 3;
        this.f20721y0 = new ArrayList();
        this.f20722z0 = new Stack();
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
        Drawable drawable;
        Drawable drawable2;
        StaticLayout staticLayout = this.f20691c;
        if (staticLayout == null) {
            return;
        }
        if (staticLayout.getLineCount() > 0) {
            this.f20695e0 = (int) Math.max(Math.ceil(this.f20691c.getLineWidth(0)), Math.ceil(this.f20691c.getLineRight(0) - this.f20691c.getLineLeft(0)));
            StaticLayout staticLayout2 = this.f20694e;
            boolean z10 = true;
            if (staticLayout2 != null) {
                this.f20698g0 = staticLayout2.getLineBottom(staticLayout2.getLineCount() - 1);
            } else if (this.f20709r > 1 && this.f20691c.getLineCount() > 0) {
                StaticLayout staticLayout3 = this.f20691c;
                this.f20698g0 = staticLayout3.getLineBottom(staticLayout3.getLineCount() - 1);
            } else {
                this.f20698g0 = this.f20691c.getLineBottom(0);
            }
            int i12 = this.f20704n & 7;
            if (i12 == 1) {
                this.f20692c0 = ((i10 - this.f20695e0) / 2) - ((int) this.f20691c.getLineLeft(0));
            } else if (i12 == 3) {
                StaticLayout staticLayout4 = this.d;
                if (staticLayout4 != null) {
                    this.f20692c0 = -((int) staticLayout4.getLineLeft(0));
                } else {
                    this.f20692c0 = -((int) this.f20691c.getLineLeft(0));
                }
            } else if (this.f20691c.getLineLeft(0) == 0.0f) {
                StaticLayout staticLayout5 = this.d;
                if (staticLayout5 != null) {
                    this.f20692c0 = (int) (i10 - staticLayout5.getLineWidth(0));
                } else {
                    this.f20692c0 = i10 - this.f20695e0;
                }
            } else {
                this.f20692c0 = -AndroidUtilities.dp(8.0f);
            }
            this.f20692c0 = getPaddingLeft() + this.f20692c0;
            if (this.m0) {
                if (this.f20716w != null && !this.f20703l0) {
                    i11 = (int) (drawable.getIntrinsicWidth() * this.H);
                } else {
                    i11 = 0;
                }
                if (this.f20718x != null && !this.f20703l0) {
                    i11 += (int) (drawable2.getIntrinsicWidth() * this.H);
                }
            } else {
                i11 = 0;
            }
            if (this.f20695e0 + i11 <= i10 - this.f20710r0) {
                z10 = false;
            }
            this.Q = z10;
            b();
            StaticLayout staticLayout6 = this.f20694e;
            if (staticLayout6 != null && this.f20713t0 > 0) {
                this.f20715v0 = staticLayout6.getPrimaryHorizontal(0) - this.d.getPrimaryHorizontal(0);
            }
        }
        int i13 = this.F;
        if (i13 >= 0) {
            this.G = this.f20691c.getPrimaryHorizontal(i13);
        } else {
            this.G = 0.0f;
        }
    }

    public final void b() {
        int i10;
        if ((this.P && (this.Q || this.R != 0.0f)) || this.f20705n0) {
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
        ArrayList arrayList = this.f20721y0;
        if (arrayList.isEmpty()) {
            return;
        }
        Path path = this.A0;
        path.rewind();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            Rect bounds = ((vh.g) arrayList.get(i10)).getBounds();
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
        Stack stack = this.f20722z0;
        ArrayList arrayList = this.f20721y0;
        CharSequence charSequence4 = this.f20711s;
        this.F = -1;
        this.C0 = false;
        if (charSequence4 != null) {
            try {
                Drawable drawable3 = this.v;
                if (drawable3 != null && !this.f20702k0) {
                    drawable3.getIntrinsicWidth();
                    i11 = (i10 - this.v.getIntrinsicWidth()) - this.I;
                } else {
                    i11 = i10;
                }
                if (!this.m0) {
                    if (this.f20716w != null && !this.f20703l0) {
                        i12 = (int) (drawable.getIntrinsicWidth() * this.H);
                        i11 = (i11 - i12) - this.I;
                    } else {
                        i12 = 0;
                    }
                    if (this.f20718x != null && !this.f20703l0) {
                        i12 += (int) (drawable2.getIntrinsicWidth() * this.H);
                        i11 = (i11 - i12) - this.I;
                    }
                } else {
                    i12 = 0;
                }
                SpannableStringBuilder spannableStringBuilder = charSequence4;
                if (this.E != null) {
                    spannableStringBuilder = charSequence4;
                    if (this.f20720y != null) {
                        int indexOf = charSequence4.toString().indexOf(this.E);
                        this.F = indexOf;
                        if (indexOf >= 0) {
                            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence4);
                            org.telegram.ui.Cells.q2 q2Var = new org.telegram.ui.Cells.q2(this.f20720y.getIntrinsicWidth());
                            int i15 = this.F;
                            valueOf.setSpan(q2Var, i15, this.E.length() + i15, 0);
                            spannableStringBuilder = valueOf;
                        } else {
                            i11 = (i11 - this.f20720y.getIntrinsicWidth()) - this.I;
                            spannableStringBuilder = charSequence4;
                        }
                    }
                }
                CharSequence charSequence5 = spannableStringBuilder;
                boolean z10 = this.B0;
                TextPaint textPaint = this.h;
                if (z10 && i12 != 0 && !this.f20703l0 && !charSequence5.equals(TextUtils.ellipsize(charSequence5, textPaint, i11, TextUtils.TruncateAt.END))) {
                    this.C0 = true;
                    i11 = i11 + i12 + this.I;
                }
                int i16 = i11;
                if (this.L) {
                    if (!this.f20705n0) {
                        charSequence2 = TextUtils.ellipsize(charSequence5, textPaint, i16, TextUtils.TruncateAt.END);
                    } else {
                        charSequence2 = charSequence5;
                    }
                    if (!this.f20705n0 && !charSequence2.equals(charSequence5)) {
                        Layout.Alignment alignment = getAlignment();
                        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                        StaticLayout c10 = ox0.c(charSequence5, textPaint, i16, alignment, 0.0f, truncateAt, i16, this.f20719x0, false);
                        i14 = i16;
                        this.f20694e = c10;
                        if (c10 != null) {
                            int lineEnd = c10.getLineEnd(0);
                            int lineStart = this.f20694e.getLineStart(1);
                            CharSequence subSequence = charSequence5.subSequence(0, lineEnd);
                            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(charSequence5);
                            valueOf2.setSpan(new c00(false), 0, lineStart, 0);
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
                            this.f20691c = staticLayout;
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
                            this.f20696f = new StaticLayout(charSequence6, 0, length3, textPaint, dp5, getAlignment(), 1.0f, 0.0f, false);
                            this.f20694e = ox0.c(valueOf2, textPaint, i14 + AndroidUtilities.dp(8.0f) + this.f20713t0, getAlignment(), 0.0f, truncateAt, i14 + this.f20713t0, this.f20719x0, false);
                        }
                    } else {
                        i14 = i16;
                        CharSequence charSequence7 = charSequence2;
                        int length4 = charSequence7.length();
                        if (!this.P && !this.f20705n0) {
                            dp2 = i14 + AndroidUtilities.dp(8.0f);
                            this.f20691c = new StaticLayout(charSequence7, 0, length4, textPaint, dp2, getAlignment(), 1.0f, 0.0f, false);
                            this.f20694e = null;
                            this.f20696f = null;
                            this.d = null;
                        }
                        dp2 = AndroidUtilities.dp(2000.0f);
                        this.f20691c = new StaticLayout(charSequence7, 0, length4, textPaint, dp2, getAlignment(), 1.0f, 0.0f, false);
                        this.f20694e = null;
                        this.f20696f = null;
                        this.d = null;
                    }
                    i13 = i14;
                } else if (this.f20709r > 1) {
                    StaticLayout c11 = ox0.c(charSequence5, textPaint, i16, getAlignment(), 0.0f, TextUtils.TruncateAt.END, i16, this.f20709r, false);
                    i13 = i16;
                    this.f20691c = c11;
                } else {
                    i13 = i16;
                    if (!this.P && !this.f20705n0) {
                        charSequence = TextUtils.ellipsize(charSequence5, textPaint, i13, TextUtils.TruncateAt.END);
                        int length5 = charSequence.length();
                        if (!this.P && !this.f20705n0) {
                            dp = AndroidUtilities.dp(8.0f) + i13;
                            this.f20691c = new StaticLayout(charSequence, 0, length5, textPaint, dp, getAlignment(), 1.0f, 0.0f, false);
                        }
                        dp = AndroidUtilities.dp(2000.0f);
                        this.f20691c = new StaticLayout(charSequence, 0, length5, textPaint, dp, getAlignment(), 1.0f, 0.0f, false);
                    }
                    charSequence = charSequence5;
                    int length52 = charSequence.length();
                    if (!this.P) {
                        dp = AndroidUtilities.dp(8.0f) + i13;
                        this.f20691c = new StaticLayout(charSequence, 0, length52, textPaint, dp, getAlignment(), 1.0f, 0.0f, false);
                    }
                    dp = AndroidUtilities.dp(2000.0f);
                    this.f20691c = new StaticLayout(charSequence, 0, length52, textPaint, dp, getAlignment(), 1.0f, 0.0f, false);
                }
                stack.addAll(arrayList);
                arrayList.clear();
                StaticLayout staticLayout2 = this.f20691c;
                if (staticLayout2 != null && (staticLayout2.getText() instanceof Spannable)) {
                    vh.g.b(this, this.f20691c, -2, -2, stack, arrayList);
                }
                a(i13);
            } catch (Exception unused) {
            }
        } else {
            this.f20691c = null;
            this.f20695e0 = 0;
            this.f20698g0 = 0;
        }
        org.telegram.ui.Components.b6.release(this, this.H0);
        if (this.K0) {
            this.H0 = org.telegram.ui.Components.b6.update(this.I0, this, this.H0, this.f20691c);
        }
        invalidate();
    }

    public final void e(Canvas canvas) {
        int i10 = (this.M > 0.0f ? 1 : (this.M == 0.0f ? 0 : -1));
        int i11 = 0;
        ArrayList arrayList = this.f20721y0;
        if (i10 > 0 && this.f20714u0 != 0) {
            canvas.save();
            float f7 = this.M;
            canvas.translate((this.f20715v0 * f7) + ((-this.f20714u0) * f7), 0.0f);
            float f10 = this.f20687a;
            float f11 = this.M;
            this.f20687a = sc.v.d(this.f20715v0, f11, (-this.f20714u0) * f11, f10);
            canvas.save();
            c(canvas);
            org.telegram.ui.Components.x5 x5Var = this.H0;
            if (x5Var != null) {
                x5Var.a();
            }
            this.f20691c.draw(canvas);
            canvas.restore();
            org.telegram.ui.Components.b6.drawAnimatedEmojis(canvas, this.f20691c, this.H0, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.J0);
            int size = arrayList.size();
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                ((vh.g) obj).draw(canvas);
            }
            canvas.restore();
            return;
        }
        canvas.save();
        c(canvas);
        org.telegram.ui.Components.x5 x5Var2 = this.H0;
        if (x5Var2 != null) {
            x5Var2.a();
        }
        this.f20691c.draw(canvas);
        canvas.restore();
        org.telegram.ui.Components.b6.drawAnimatedEmojis(canvas, this.f20691c, this.H0, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.J0);
        int size2 = arrayList.size();
        while (i11 < size2) {
            Object obj2 = arrayList.get(i11);
            i11++;
            ((vh.g) obj2).draw(canvas);
        }
    }

    public final boolean f() {
        if (this.f20701j0 && getMeasuredHeight() != 0 && !this.L) {
            d(((getMaxTextWidth() - getPaddingLeft()) - getPaddingRight()) - this.f20717w0);
            if ((this.f20704n & 112) == 16) {
                this.f20693d0 = (getMeasuredHeight() - this.f20698g0) / 2;
                return true;
            }
            this.f20693d0 = getPaddingTop();
            return true;
        }
        requestLayout();
        return true;
    }

    public final void g(qx0 qx0Var, String str) {
        Drawable drawable = this.f20720y;
        if (drawable == qx0Var) {
            return;
        }
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f20720y = qx0Var;
        if (qx0Var != null) {
            qx0Var.setCallback(this);
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
        if (this.v == null && this.f20716w == null && this.f20718x == null) {
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
        Drawable drawable2 = this.f20716w;
        if (drawable2 != null) {
            i11 = drawable2.getIntrinsicWidth();
        } else {
            i11 = 0;
        }
        float f10 = f7 + i11;
        Drawable drawable3 = this.f20718x;
        if (drawable3 != null) {
            i12 = drawable3.getIntrinsicWidth();
        }
        return f10 + i12;
    }

    public float getFullAlpha() {
        return this.M;
    }

    public Layout getLayout() {
        return this.f20691c;
    }

    public float getLayoutX() {
        return this.f20687a;
    }

    public float getLayoutY() {
        return this.f20689b;
    }

    public Drawable getLeftDrawable() {
        return this.v;
    }

    public int getLineCount() {
        int i10;
        StaticLayout staticLayout = this.f20691c;
        if (staticLayout != null) {
            i10 = staticLayout.getLineCount();
        } else {
            i10 = 0;
        }
        StaticLayout staticLayout2 = this.f20694e;
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
        if (this.f20703l0 && (drawable2 = this.f20716w) != null) {
            i10 = drawable2.getIntrinsicWidth() + this.I;
        } else {
            i10 = 0;
        }
        int i12 = measuredWidth - i10;
        if (this.f20703l0 && (drawable = this.f20718x) != null) {
            i11 = this.I + drawable.getIntrinsicWidth();
        }
        return i12 - i11;
    }

    public TextPaint getPaint() {
        return this.h;
    }

    public Drawable getRightDrawable() {
        return this.f20716w;
    }

    public Drawable getRightDrawable2() {
        return this.f20718x;
    }

    public boolean getRightDrawableOutside() {
        return this.f20703l0;
    }

    public int getRightDrawableWidth() {
        Drawable drawable = this.f20716w;
        if (drawable == null) {
            return 0;
        }
        return (int) ((drawable.getIntrinsicWidth() * this.H) + this.I);
    }

    public int getRightDrawableX() {
        return this.f20699h0;
    }

    public int getRightDrawableY() {
        return this.f20700i0;
    }

    public int getSideDrawablesSize() {
        int i10;
        Drawable drawable = this.v;
        if (drawable != null) {
            i10 = drawable.getIntrinsicWidth() + this.I;
        } else {
            i10 = 0;
        }
        Drawable drawable2 = this.f20716w;
        if (drawable2 != null) {
            i10 += ((int) (drawable2.getIntrinsicWidth() * this.H)) + this.I;
        }
        Drawable drawable3 = this.f20718x;
        if (drawable3 != null) {
            return ((int) (drawable3.getIntrinsicWidth() * this.H)) + this.I + i10;
        }
        return i10;
    }

    public CharSequence getText() {
        CharSequence charSequence = this.f20711s;
        if (charSequence == null) {
            return "";
        }
        return charSequence;
    }

    public int getTextColor() {
        return this.h.getColor();
    }

    public int getTextHeight() {
        return this.f20698g0;
    }

    public TextPaint getTextPaint() {
        return this.h;
    }

    public int getTextStartX() {
        int i10 = 0;
        if (this.f20691c == null) {
            return 0;
        }
        Drawable drawable = this.v;
        if (drawable != null && (this.f20704n & 7) == 3) {
            i10 = this.I + drawable.getIntrinsicWidth();
        }
        Drawable drawable2 = this.f20720y;
        if (drawable2 != null && this.F < 0 && (this.f20704n & 7) == 3) {
            i10 += drawable2.getIntrinsicWidth() + this.I;
        }
        return ((int) getX()) + this.f20692c0 + i10;
    }

    public int getTextStartY() {
        if (this.f20691c == null) {
            return 0;
        }
        return (int) getY();
    }

    public int getTextWidth() {
        Drawable drawable;
        int i10;
        Drawable drawable2;
        int i11 = this.f20695e0;
        int i12 = 0;
        if (this.m0) {
            if (this.f20716w != null) {
                i10 = (int) (drawable.getIntrinsicWidth() * this.H);
            } else {
                i10 = 0;
            }
            if (this.f20718x != null) {
                i12 = (int) (drawable2.getIntrinsicWidth() * this.H);
            }
            i12 += i10;
        }
        return i11 + i12;
    }

    public final void h(int i10, int i11) {
        if (this.f20713t0 == i10 && this.f20714u0 == i11) {
            return;
        }
        this.f20713t0 = i10;
        this.f20714u0 = i11;
        d(((getMaxTextWidth() - getPaddingLeft()) - getPaddingRight()) - this.f20717w0);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final boolean i(Drawable drawable) {
        Drawable drawable2 = this.f20716w;
        if (drawable2 == drawable) {
            return false;
        }
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f20716w = drawable;
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
        Drawable drawable3 = this.f20716w;
        if (drawable == drawable3) {
            invalidate(drawable3.getBounds());
            return;
        }
        Drawable drawable4 = this.f20718x;
        if (drawable == drawable4) {
            invalidate(drawable4.getBounds());
            return;
        }
        Drawable drawable5 = this.f20720y;
        if (drawable == drawable5) {
            invalidate(drawable5.getBounds());
        }
    }

    public final boolean j(Drawable drawable) {
        Drawable drawable2 = this.f20718x;
        if (drawable2 == drawable) {
            return false;
        }
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f20718x = drawable;
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
        CharSequence charSequence2 = this.f20711s;
        if (charSequence2 != null || charSequence != null) {
            if (!z10 && charSequence2 != null && charSequence2.equals(charSequence)) {
                return false;
            }
            this.f20711s = charSequence;
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
        Boolean bool = this.f20707p0;
        if (bool != null) {
            z10 = bool.booleanValue();
        } else {
            z10 = false;
        }
        if ((this.W == null || this.f20688a0 != AndroidUtilities.dp(this.f20708q0) || this.f20706o0 != z10) && this.f20705n0) {
            if (this.W == null) {
                this.W = new Paint();
            }
            this.f20706o0 = z10;
            if (z10) {
                Paint paint4 = this.W;
                int dp = AndroidUtilities.dp(this.f20708q0);
                this.f20688a0 = dp;
                paint4.setShader(new LinearGradient(0.0f, 0.0f, dp, 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            } else {
                Paint paint5 = this.W;
                int dp2 = AndroidUtilities.dp(this.f20708q0);
                this.f20688a0 = dp2;
                paint5.setShader(new LinearGradient(0.0f, 0.0f, dp2, 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            }
            this.W.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.K0 = true;
        this.H0 = org.telegram.ui.Components.b6.update(this.I0, this, this.H0, this.f20691c);
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.K0 = false;
        org.telegram.ui.Components.b6.release(this, this.H0);
        this.f20701j0 = false;
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
        int z11;
        int i12;
        int i13;
        int z12;
        int i14;
        int z13;
        int i15;
        float f11;
        float f12;
        float f13;
        Drawable drawable3;
        float f14;
        boolean z14;
        float f15;
        Drawable drawable4;
        int z15;
        int i16;
        int z16;
        int i17;
        float f16;
        float f17;
        Drawable drawable5;
        Drawable drawable6;
        Drawable drawable7;
        int z17;
        int i18;
        int z18;
        int i19;
        int intrinsicHeight;
        Drawable drawable8;
        int z19;
        int i20;
        int z20;
        int i21;
        int intrinsicHeight2;
        int intrinsicHeight3;
        super.onDraw(canvas);
        this.f20687a = 0.0f;
        this.f20689b = 0.0f;
        if (this.P && (this.Q || this.R != 0.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f20697f0 = this.f20695e0;
        Drawable drawable9 = this.v;
        if (drawable9 != null && !this.f20702k0) {
            int i22 = (int) (-this.R);
            int i23 = this.f20704n;
            if ((i23 & 7) == 1) {
                i22 += this.f20692c0;
            }
            if ((i23 & 112) == 16) {
                intrinsicHeight3 = ((getMeasuredHeight() - this.v.getIntrinsicHeight()) / 2) + this.J;
            } else {
                intrinsicHeight3 = this.J + ((this.f20698g0 - this.v.getIntrinsicHeight()) / 2) + getPaddingTop();
            }
            Drawable drawable10 = this.v;
            drawable10.setBounds(i22, intrinsicHeight3, drawable10.getIntrinsicWidth() + i22, this.v.getIntrinsicHeight() + intrinsicHeight3);
            this.v.draw(canvas);
            int i24 = this.f20704n & 7;
            if (i24 != 3 && i24 != 1) {
                i10 = 0;
            } else {
                i10 = this.v.getIntrinsicWidth() + this.I;
            }
            this.f20697f0 = this.v.getIntrinsicWidth() + this.I + this.f20697f0;
        } else if (this.f20702k0 && drawable9 != null) {
            i10 = this.I + drawable9.getIntrinsicWidth();
        } else {
            i10 = 0;
        }
        Drawable drawable11 = this.f20720y;
        if (drawable11 != null && this.E != null) {
            int i25 = (int) ((-this.R) + this.G);
            int i26 = this.f20704n;
            if ((i26 & 7) == 1) {
                i25 += this.f20692c0;
            }
            if ((i26 & 112) == 16) {
                intrinsicHeight2 = ((getMeasuredHeight() - this.f20720y.getIntrinsicHeight()) / 2) + this.J;
            } else {
                intrinsicHeight2 = this.J + ((this.f20698g0 - drawable11.getIntrinsicHeight()) / 2);
            }
            Drawable drawable12 = this.f20720y;
            drawable12.setBounds(i25, intrinsicHeight2, drawable12.getIntrinsicWidth() + i25, this.f20720y.getIntrinsicHeight() + intrinsicHeight2);
            this.f20720y.draw(canvas);
            if (this.F < 0) {
                int i27 = this.f20704n & 7;
                if (i27 == 3 || i27 == 1) {
                    i10 += this.f20720y.getIntrinsicWidth() + this.I;
                }
                this.f20697f0 = this.f20720y.getIntrinsicWidth() + this.I + this.f20697f0;
            }
        }
        int i28 = i10;
        if (this.f20716w != null && !this.C0 && this.H > 0.0f && !this.f20703l0 && !this.m0) {
            int i29 = this.f20695e0 + i28 + this.I + ((int) (-this.R));
            int i30 = this.f20704n & 7;
            if (i30 == 1 || i30 == 5) {
                i29 += this.f20692c0;
            }
            int intrinsicWidth = (int) (drawable.getIntrinsicWidth() * this.H);
            int intrinsicHeight4 = (int) (this.f20716w.getIntrinsicHeight() * this.H);
            if ((this.f20704n & 112) == 16) {
                z20 = (getMeasuredHeight() - intrinsicHeight4) / 2;
                i21 = this.K;
            } else {
                z20 = hg.c.z(this.f20698g0, intrinsicHeight4, 2, getPaddingTop());
                i21 = this.K;
            }
            int i31 = z20 + i21;
            f7 = 0.0f;
            this.f20716w.setBounds(i29, i31, i29 + intrinsicWidth, i31 + intrinsicHeight4);
            this.f20699h0 = i29 + (intrinsicWidth >> 1);
            this.f20700i0 = i31 + (intrinsicHeight4 >> 1);
            this.f20716w.draw(canvas);
            this.f20697f0 = this.I + intrinsicWidth + this.f20697f0;
        } else {
            f7 = 0.0f;
        }
        if (this.f20718x != null && !this.C0 && this.H > f7 && !this.f20703l0 && !this.m0) {
            int i32 = this.f20695e0 + i28 + this.I + ((int) (-this.R));
            if (this.f20716w != null) {
                i32 += ((int) (drawable8.getIntrinsicWidth() * this.H)) + this.I;
            }
            int i33 = this.f20704n & 7;
            if (i33 == 1 || i33 == 5) {
                i32 += this.f20692c0;
            }
            int intrinsicWidth2 = (int) (this.f20718x.getIntrinsicWidth() * this.H);
            int intrinsicHeight5 = (int) (this.f20718x.getIntrinsicHeight() * this.H);
            if ((this.f20704n & 112) == 16) {
                z19 = (getMeasuredHeight() - intrinsicHeight5) / 2;
                i20 = this.K;
            } else {
                z19 = hg.c.z(this.f20698g0, intrinsicHeight5, 2, getPaddingTop());
                i20 = this.K;
            }
            int i34 = z19 + i20;
            this.f20718x.setBounds(i32, i34, i32 + intrinsicWidth2, intrinsicHeight5 + i34);
            this.f20718x.draw(canvas);
            this.f20697f0 = this.I + intrinsicWidth2 + this.f20697f0;
        }
        int dp = AndroidUtilities.dp(16.0f) + this.f20697f0;
        float f18 = this.R;
        if (f18 != f7) {
            if (this.v != null && !this.f20702k0) {
                int i35 = ((int) (-f18)) + dp;
                if ((this.f20704n & 112) == 16) {
                    intrinsicHeight = ((getMeasuredHeight() - this.v.getIntrinsicHeight()) / 2) + this.J;
                } else {
                    intrinsicHeight = this.J + ((this.f20698g0 - this.v.getIntrinsicHeight()) / 2) + getPaddingTop();
                }
                Drawable drawable13 = this.v;
                drawable13.setBounds(i35, intrinsicHeight, drawable13.getIntrinsicWidth() + i35, this.v.getIntrinsicHeight() + intrinsicHeight);
                this.v.draw(canvas);
            }
            if (this.f20716w != null && !this.f20703l0) {
                int intrinsicWidth3 = (int) (drawable5.getIntrinsicWidth() * this.H);
                int intrinsicHeight6 = (int) (this.f20716w.getIntrinsicHeight() * this.H);
                int i36 = this.f20695e0 + i28 + this.I + ((int) (-this.R)) + dp;
                if ((this.f20704n & 112) == 16) {
                    z18 = (getMeasuredHeight() - intrinsicHeight6) / 2;
                    i19 = this.K;
                } else {
                    z18 = hg.c.z(this.f20698g0, intrinsicHeight6, 2, getPaddingTop());
                    i19 = this.K;
                }
                int i37 = z18 + i19;
                f10 = 16.0f;
                this.f20716w.setBounds(i36, i37, i36 + intrinsicWidth3, i37 + intrinsicHeight6);
                this.f20699h0 = i36 + (intrinsicWidth3 >> 1);
                this.f20700i0 = i37 + (intrinsicHeight6 >> 1);
                this.f20716w.draw(canvas);
            } else {
                f10 = 16.0f;
            }
            if (this.f20718x != null && !this.f20703l0) {
                int intrinsicWidth4 = (int) (drawable6.getIntrinsicWidth() * this.H);
                int intrinsicHeight7 = (int) (this.f20718x.getIntrinsicHeight() * this.H);
                int i38 = this.f20695e0 + i28 + this.I + ((int) (-this.R)) + dp;
                if (this.f20716w != null) {
                    i38 += ((int) (drawable7.getIntrinsicWidth() * this.H)) + this.I;
                }
                if ((this.f20704n & 112) == 16) {
                    z17 = (getMeasuredHeight() - intrinsicHeight7) / 2;
                    i18 = this.K;
                } else {
                    z17 = hg.c.z(this.f20698g0, intrinsicHeight7, 2, getPaddingTop());
                    i18 = this.K;
                }
                int i39 = z17 + i18;
                this.f20718x.setBounds(i38, i39, intrinsicWidth4 + i38, intrinsicHeight7 + i39);
                this.f20718x.draw(canvas);
            }
        } else {
            f10 = 16.0f;
        }
        if (this.f20691c != null) {
            if (this.f20702k0 || this.f20703l0 || this.f20705n0 || this.f20710r0 > 0) {
                canvas.save();
                int maxTextWidth = getMaxTextWidth() - this.f20710r0;
                Drawable drawable14 = this.f20716w;
                if (drawable14 != null && !(drawable14 instanceof org.telegram.ui.Components.q5) && this.f20703l0) {
                    f11 = 2.0f;
                } else {
                    f11 = f7;
                }
                canvas.clipRect(i28, 0, maxTextWidth - AndroidUtilities.dp(f11), getMeasuredHeight());
            }
            Emoji.emojiDrawingUseAlpha = false;
            if (this.O != null) {
                int i40 = this.f20695e0;
                int i41 = (i40 / 2) + ((int) ((this.f20692c0 + i28) - this.R));
                int max = Math.max(getPaddingRight() + getPaddingLeft() + i40, this.f20712s0);
                int i42 = i41 - (max / 2);
                this.O.setBounds(i42, 0, max + i42, getMeasuredHeight());
                this.O.draw(canvas);
            }
            if (this.f20692c0 + i28 != 0 || this.f20693d0 != 0 || this.R != f7) {
                canvas.save();
                canvas.translate((this.f20692c0 + i28) - this.R, this.f20693d0);
                this.f20687a = ((this.f20692c0 + i28) - this.R) + this.f20687a;
                this.f20689b += this.f20693d0;
            }
            e(canvas);
            StaticLayout staticLayout = this.f20696f;
            TextPaint textPaint = this.h;
            if (staticLayout != null && this.M < 1.0f) {
                int alpha = textPaint.getAlpha();
                textPaint.setAlpha((int) ((1.0f - this.M) * 255.0f));
                canvas.save();
                if (this.f20696f.getText().length() == 1) {
                    if (this.f20719x0 == 1) {
                        f17 = 0.5f;
                    } else {
                        f17 = 4.0f;
                    }
                    f16 = AndroidUtilities.dp(f17);
                } else {
                    f16 = f7;
                }
                if (this.f20691c.getLineLeft(0) != f7) {
                    float f19 = (-this.f20691c.getLineWidth(0)) + f16;
                    float f20 = f7;
                    canvas.translate(f19, f20);
                    f12 = f20;
                } else {
                    f12 = f7;
                    canvas.translate(this.f20691c.getLineWidth(0) - f16, f12);
                }
                float f21 = this.M;
                canvas.translate((this.f20715v0 * f21) + ((-this.f20714u0) * f21), f12);
                this.f20696f.draw(canvas);
                canvas.restore();
                textPaint.setAlpha(alpha);
            } else {
                f12 = f7;
            }
            if (this.f20694e != null) {
                if (this.M > f12) {
                    int alpha2 = textPaint.getAlpha();
                    textPaint.setAlpha((int) (this.M * 255.0f));
                    float f22 = this.M;
                    float f23 = this.f20715v0;
                    float f24 = ((f22 * f23) + ((-this.f20714u0) * f22)) - f23;
                    f13 = 0.0f;
                    canvas.translate(f24, 0.0f);
                    this.f20694e.draw(canvas);
                    textPaint.setAlpha(alpha2);
                } else {
                    f13 = 0.0f;
                }
            } else {
                f13 = f12;
            }
            if (this.R != f13) {
                canvas.translate(dp, f13);
                e(canvas);
            }
            if (this.f20692c0 + i28 != 0 || this.f20693d0 != 0 || this.R != f13) {
                canvas.restore();
            }
            if (this.f20716w != null && !this.C0 && this.H > 0.0f && !this.f20703l0 && this.m0) {
                int i43 = this.f20695e0 + i28 + this.I + ((int) (-this.R));
                int i44 = this.f20704n & 7;
                if (i44 == 1 || i44 == 5) {
                    i43 += this.f20692c0;
                }
                int intrinsicWidth5 = (int) (drawable3.getIntrinsicWidth() * this.H);
                int intrinsicHeight8 = (int) (this.f20716w.getIntrinsicHeight() * this.H);
                if ((this.f20704n & 112) == 16) {
                    z16 = (getMeasuredHeight() - intrinsicHeight8) / 2;
                    i17 = this.K;
                } else {
                    z16 = hg.c.z(this.f20698g0, intrinsicHeight8, 2, getPaddingTop());
                    i17 = this.K;
                }
                int i45 = z16 + i17;
                this.f20716w.setBounds(i43, i45, i43 + intrinsicWidth5, i45 + intrinsicHeight8);
                this.f20699h0 = i43 + (intrinsicWidth5 >> 1);
                this.f20700i0 = i45 + (intrinsicHeight8 >> 1);
                this.f20716w.draw(canvas);
                this.f20697f0 = this.I + intrinsicWidth5 + this.f20697f0;
            }
            if (this.f20718x != null && !this.C0 && this.H > 0.0f && !this.f20703l0 && this.m0) {
                int i46 = this.f20695e0 + i28 + this.I + ((int) (-this.R));
                if (this.f20716w != null) {
                    i46 += ((int) (drawable4.getIntrinsicWidth() * this.H)) + this.I;
                }
                int i47 = this.f20704n & 7;
                if (i47 == 1 || i47 == 5) {
                    i46 += this.f20692c0;
                }
                int intrinsicWidth6 = (int) (this.f20718x.getIntrinsicWidth() * this.H);
                int intrinsicHeight9 = (int) (this.f20718x.getIntrinsicHeight() * this.H);
                if ((this.f20704n & 112) == 16) {
                    z15 = (getMeasuredHeight() - intrinsicHeight9) / 2;
                    i16 = this.K;
                } else {
                    z15 = hg.c.z(this.f20698g0, intrinsicHeight9, 2, getPaddingTop());
                    i16 = this.K;
                }
                int i48 = z15 + i16;
                this.f20718x.setBounds(i46, i48, i46 + intrinsicWidth6, intrinsicHeight9 + i48);
                this.f20718x.draw(canvas);
                this.f20697f0 = this.I + intrinsicWidth6 + this.f20697f0;
            }
            if (z10) {
                if (this.R < AndroidUtilities.dp(10.0f)) {
                    this.U.setAlpha((int) ((this.R / AndroidUtilities.dp(10.0f)) * 255.0f));
                } else {
                    if (this.R > (AndroidUtilities.dp(f10) + this.f20697f0) - AndroidUtilities.dp(10.0f)) {
                        this.U.setAlpha((int) ai.y(this.R - ((AndroidUtilities.dp(f10) + this.f20697f0) - AndroidUtilities.dp(10.0f)), AndroidUtilities.dp(10.0f), 1.0f, 255.0f));
                    } else {
                        this.U.setAlpha(255);
                    }
                }
                canvas.drawRect(i28, 0.0f, AndroidUtilities.dp(6.0f) + i28, getMeasuredHeight(), this.U);
                canvas.save();
                canvas.translate((getMaxTextWidth() - this.f20710r0) - AndroidUtilities.dp(6.0f), 0.0f);
                canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(6.0f), getMeasuredHeight(), this.V);
                canvas.restore();
            } else if (this.f20705n0 && this.Q && this.W != null) {
                canvas.save();
                m();
                if (!this.f20706o0) {
                    int maxTextWidth2 = (getMaxTextWidth() - this.f20710r0) - this.f20688a0;
                    Drawable drawable15 = this.f20716w;
                    if (drawable15 != null && !(drawable15 instanceof org.telegram.ui.Components.q5) && this.f20703l0) {
                        f14 = 2.0f;
                    } else {
                        f14 = 0.0f;
                    }
                    canvas.translate(maxTextWidth2 - AndroidUtilities.dp(f14), 0.0f);
                }
                canvas.drawRect(i28, 0.0f, this.f20688a0, getMeasuredHeight(), this.W);
                canvas.restore();
            }
            if (!this.P || (!this.Q && this.R == 0.0f)) {
                z14 = true;
            } else {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j3 = elapsedRealtime - this.S;
                if (j3 > 17) {
                    j3 = 17;
                }
                int i49 = this.T;
                if (i49 > 0) {
                    this.T = (int) (i49 - j3);
                    z14 = true;
                } else {
                    int dp2 = AndroidUtilities.dp(f10) + this.f20697f0;
                    if (this.R < AndroidUtilities.dp(100.0f)) {
                        f15 = a1.g.e(this.R, AndroidUtilities.dp(100.0f), 20.0f, 30.0f);
                        z14 = true;
                    } else if (this.R >= dp2 - AndroidUtilities.dp(100.0f)) {
                        z14 = true;
                        f15 = ai.b(this.R - (dp2 - AndroidUtilities.dp(100.0f)), AndroidUtilities.dp(100.0f), 20.0f, 50.0f);
                    } else {
                        z14 = true;
                        f15 = 50.0f;
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
            Emoji.emojiDrawingUseAlpha = z14;
            if (this.f20702k0 || this.f20703l0 || this.f20705n0 || this.f20710r0 > 0) {
                canvas.restore();
            }
        }
        Drawable drawable16 = this.v;
        if (drawable16 != null && this.f20702k0) {
            int intrinsicWidth7 = drawable16.getIntrinsicWidth();
            int intrinsicHeight10 = this.v.getIntrinsicHeight();
            if ((this.f20704n & 112) == 16) {
                z13 = (getMeasuredHeight() - intrinsicHeight10) / 2;
                i15 = this.J;
            } else {
                z13 = hg.c.z(this.f20698g0, intrinsicHeight10, 2, getPaddingTop());
                i15 = this.J;
            }
            int i50 = z13 + i15;
            this.v.setBounds(0, i50, intrinsicWidth7, intrinsicHeight10 + i50);
            this.v.draw(canvas);
        }
        if (this.f20716w != null && this.f20703l0) {
            int i51 = this.f20695e0 + i28 + this.I;
            float f25 = this.R;
            if (f25 == 0.0f) {
                i13 = -dp;
            } else {
                i13 = (int) (-f25);
            }
            int min = Math.min(i51 + i13 + dp, (getMaxTextWidth() - this.f20710r0) + this.I);
            int intrinsicWidth8 = (int) (this.f20716w.getIntrinsicWidth() * this.H);
            int intrinsicHeight11 = (int) (this.f20716w.getIntrinsicHeight() * this.H);
            if ((this.f20704n & 112) == 16) {
                z12 = (getMeasuredHeight() - intrinsicHeight11) / 2;
                i14 = this.K;
            } else {
                z12 = hg.c.z(this.f20698g0, intrinsicHeight11, 2, getPaddingTop());
                i14 = this.K;
            }
            int i52 = z12 + i14;
            this.f20716w.setBounds(min, i52, min + intrinsicWidth8, i52 + intrinsicHeight11);
            this.f20699h0 = min + (intrinsicWidth8 >> 1);
            this.f20700i0 = i52 + (intrinsicHeight11 >> 1);
            this.f20716w.draw(canvas);
        }
        if (this.f20718x != null && this.f20703l0) {
            int i53 = i28 + this.f20695e0 + this.I;
            float f26 = this.R;
            if (f26 == 0.0f) {
                i11 = -dp;
            } else {
                i11 = (int) (-f26);
            }
            int min2 = Math.min(i53 + i11 + dp, (getMaxTextWidth() - this.f20710r0) + this.I);
            if (this.f20716w != null) {
                min2 += ((int) (drawable2.getIntrinsicWidth() * this.H)) + this.I;
            }
            int intrinsicWidth9 = (int) (this.f20718x.getIntrinsicWidth() * this.H);
            int intrinsicHeight12 = (int) (this.f20718x.getIntrinsicHeight() * this.H);
            if ((this.f20704n & 112) == 16) {
                z11 = (getMeasuredHeight() - intrinsicHeight12) / 2;
                i12 = this.K;
            } else {
                z11 = hg.c.z(this.f20698g0, intrinsicHeight12, 2, getPaddingTop());
                i12 = this.K;
            }
            int i54 = z11 + i12;
            this.f20718x.setBounds(min2, i54, intrinsicWidth9 + min2, intrinsicHeight12 + i54);
            this.f20718x.draw(canvas);
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setVisibleToUser(true);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setText(this.f20711s);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f20701j0 = true;
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
        int i18 = this.f20690b0;
        int i19 = AndroidUtilities.displaySize.x;
        if (i18 != i19) {
            this.f20690b0 = i19;
            this.R = 0.0f;
            this.T = 500;
            b();
        }
        int paddingLeft = ((size - getPaddingLeft()) - getPaddingRight()) - this.f20717w0;
        if (this.f20702k0 && (drawable6 = this.v) != null) {
            i12 = drawable6.getIntrinsicWidth() + this.I;
        } else {
            i12 = 0;
        }
        int i20 = paddingLeft - i12;
        if (this.f20703l0 && (drawable5 = this.f20716w) != null) {
            i13 = drawable5.getIntrinsicWidth() + this.I;
        } else {
            i13 = 0;
        }
        int i21 = i20 - i13;
        if (this.f20703l0 && (drawable4 = this.f20718x) != null) {
            i14 = drawable4.getIntrinsicWidth() + this.I;
        } else {
            i14 = 0;
        }
        d(i21 - i14);
        if (View.MeasureSpec.getMode(i11) != 1073741824) {
            size2 = getPaddingBottom() + getPaddingTop() + this.f20698g0;
        }
        if (this.N) {
            int paddingRight = getPaddingRight() + getPaddingLeft() + this.f20695e0 + this.f20717w0;
            if (this.f20702k0 && (drawable3 = this.v) != null) {
                i15 = drawable3.getIntrinsicWidth() + this.I;
            } else {
                i15 = 0;
            }
            int i22 = paddingRight + i15;
            if (this.f20703l0 && (drawable2 = this.f20716w) != null) {
                i16 = drawable2.getIntrinsicWidth() + this.I;
            } else {
                i16 = 0;
            }
            int i23 = i22 + i16;
            if (this.f20703l0 && (drawable = this.f20718x) != null) {
                i17 = drawable.getIntrinsicWidth() + this.I;
            } else {
                i17 = 0;
            }
            size = Math.max(Math.min(size, i23 + i17), 0);
        }
        setMeasuredDimension(size, size2);
        if ((this.f20704n & 112) == 16) {
            this.f20693d0 = hg.c.z((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), this.f20698g0, 2, getPaddingTop());
        } else {
            this.f20693d0 = getPaddingTop();
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.D0 != null && this.f20716w != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(this.f20699h0 - AndroidUtilities.dp(16.0f), this.f20700i0 - AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f) + this.f20699h0, AndroidUtilities.dp(16.0f) + this.f20700i0);
            if (motionEvent.getAction() == 0 && rectF.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                this.E0 = true;
                this.F0 = motionEvent.getX();
                this.G0 = motionEvent.getY();
                getParent().requestDisallowInterceptTouchEvent(true);
                Drawable drawable = this.f20716w;
                if (drawable instanceof g5) {
                    ((i11) ((g5) drawable)).f38558f.c(true);
                }
            } else if (motionEvent.getAction() == 2 && this.E0) {
                if (Math.abs(motionEvent.getX() - this.F0) >= AndroidUtilities.touchSlop || Math.abs(motionEvent.getY() - this.G0) >= AndroidUtilities.touchSlop) {
                    this.E0 = false;
                    getParent().requestDisallowInterceptTouchEvent(false);
                    Drawable drawable2 = this.f20716w;
                    if (drawable2 instanceof g5) {
                        ((i11) ((g5) drawable2)).f38558f.c(false);
                    }
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (this.E0 && motionEvent.getAction() == 1) {
                    this.D0.onClick(this);
                    Drawable drawable3 = this.f20716w;
                    if (drawable3 instanceof g5) {
                        ((i11) ((g5) drawable3)).f38558f.c(false);
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
        if (this.f20709r > 1) {
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
            this.f20705n0 = true;
            this.f20707p0 = null;
            m();
            b();
        }
        this.f20708q0 = i10;
        m();
    }

    public void setEmojiCacheType(int i10) {
        if (i10 != this.I0) {
            org.telegram.ui.Components.b6.release(this, this.H0);
            this.I0 = i10;
            if (this.K0) {
                this.H0 = org.telegram.ui.Components.b6.update(i10, this, this.H0, this.f20691c);
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
        this.f20719x0 = i10;
    }

    public void setGravity(int i10) {
        this.f20704n = i10;
    }

    public void setLeftDrawable(int i10) {
        setLeftDrawable(i10 == 0 ? null : getContext().getResources().getDrawable(i10));
    }

    public void setLeftDrawableOutside(boolean z10) {
        this.f20702k0 = z10;
    }

    public void setLeftDrawableTopPadding(int i10) {
        this.J = i10;
    }

    public void setLinkTextColor(int i10) {
        this.h.linkColor = i10;
        invalidate();
    }

    public void setMaxLines(int i10) {
        this.f20709r = i10;
    }

    public void setMinWidth(int i10) {
        this.f20712s0 = i10;
    }

    public void setMinusWidth(int i10) {
        if (i10 == this.f20717w0) {
            return;
        }
        this.f20717w0 = i10;
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
        this.f20703l0 = z10;
    }

    public void setRightDrawableScale(float f7) {
        this.H = f7;
    }

    public void setRightDrawableTopPadding(int i10) {
        this.K = i10;
    }

    public void setRightPadding(int i10) {
        if (this.f20710r0 != i10) {
            this.f20710r0 = i10;
            int maxTextWidth = ((getMaxTextWidth() - getPaddingLeft()) - getPaddingRight()) - this.f20717w0;
            Drawable drawable = this.v;
            if (drawable != null && !this.f20702k0) {
                maxTextWidth = (maxTextWidth - drawable.getIntrinsicWidth()) - this.I;
            }
            int i11 = 0;
            if (!this.m0) {
                Drawable drawable2 = this.f20716w;
                if (drawable2 != null && !this.f20703l0) {
                    i11 = (int) (drawable2.getIntrinsicWidth() * this.H);
                    maxTextWidth = (maxTextWidth - i11) - this.I;
                }
                Drawable drawable3 = this.f20718x;
                if (drawable3 != null && !this.f20703l0) {
                    i11 = (int) (drawable3.getIntrinsicWidth() * this.H);
                    maxTextWidth = (maxTextWidth - i11) - this.I;
                }
            }
            if (this.E != null && this.f20720y != null) {
                int indexOf = this.f20711s.toString().indexOf(this.E);
                this.F = indexOf;
                if (indexOf < 0) {
                    maxTextWidth = (maxTextWidth - this.f20720y.getIntrinsicWidth()) - this.I;
                }
            }
            if (this.B0 && i11 != 0 && !this.f20703l0) {
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                if (!this.f20711s.equals(TextUtils.ellipsize(this.f20711s, this.h, maxTextWidth, truncateAt))) {
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
        h6.x1(i10, this.f20716w);
        h6.x1(i10, this.v);
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
        if (drawable != this.f20716w && drawable != this.f20718x && drawable != this.v && !super.verifyDrawable(drawable)) {
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
        this.f20705n0 = z10;
        this.f20707p0 = null;
        m();
        b();
    }
}
