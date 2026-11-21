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
import org.telegram.messenger.n10;
import org.telegram.ui.Components.bv0;
import org.telegram.ui.Components.uy;
import org.telegram.ui.Components.zu0;
import org.telegram.ui.xw0;
public class m5 extends View implements Drawable.Callback {
    public final Stack A0;
    public final Path B0;
    public boolean C0;
    public boolean D0;
    public Drawable E;
    public View.OnClickListener E0;
    public String F;
    public boolean F0;
    public int G;
    public float G0;
    public float H;
    public float H0;
    public float I;
    public org.telegram.ui.Components.u5 I0;
    public int J;
    public int J0;
    public int K;
    public PorterDuffColorFilter K0;
    public int L;
    public boolean L0;
    public boolean M;
    public Layout.Alignment M0;
    public float N;
    public boolean O;
    public Drawable P;
    public boolean Q;
    public boolean R;
    public float S;
    public long T;
    public int U;
    public Paint V;
    public Paint W;
    public float f29277a;
    public Paint f29278a0;
    public float f29279b;
    public int f29280b0;
    public StaticLayout f29281c;
    public int f29282c0;
    public StaticLayout d;
    public int f29283d0;
    public StaticLayout f29284e;
    public int f29285e0;
    public StaticLayout f29286f;
    public int f29287f0;
    public int f29288g0;
    public final TextPaint h;
    public int f29289h0;
    public int f29290i0;
    public int f29291j0;
    public boolean f29292k0;
    public boolean f29293l0;
    public boolean m0;
    public int f29294n;
    public boolean f29295n0;
    public boolean f29296o0;
    public boolean f29297p0;
    public Boolean f29298q0;
    public int f29299r;
    public int f29300r0;
    public CharSequence f29301s;
    public int f29302s0;
    public int f29303t0;
    public int f29304u0;
    public int f29305v0;
    public Drawable f29306w;
    public float f29307w0;
    public Drawable f29308x;
    public int f29309x0;
    public Drawable f29310y;
    public int f29311y0;
    public final ArrayList f29312z0;

    public m5(Context context) {
        super(context);
        this.f29294n = 51;
        this.f29299r = 1;
        this.I = 1.0f;
        this.J = org.telegram.messenger.g0.L(4.0f);
        this.f29300r0 = 16;
        this.f29311y0 = 3;
        this.f29312z0 = new ArrayList();
        this.A0 = new Stack();
        this.B0 = new Path();
        this.J0 = 0;
        this.M0 = Layout.Alignment.ALIGN_NORMAL;
        this.h = new TextPaint(1);
        setImportantForAccessibility(1);
    }

    private Layout.Alignment getAlignment() {
        return this.M0;
    }

    public void H(int i7, float f10, float f11, te.c cVar) {
        invalidate();
    }

    public final void a(int i7) {
        int i10;
        Drawable drawable;
        Drawable drawable2;
        StaticLayout staticLayout = this.f29281c;
        if (staticLayout == null) {
            return;
        }
        if (staticLayout.getLineCount() > 0) {
            this.f29287f0 = (int) Math.max(Math.ceil(this.f29281c.getLineWidth(0)), Math.ceil(this.f29281c.getLineRight(0) - this.f29281c.getLineLeft(0)));
            StaticLayout staticLayout2 = this.f29284e;
            boolean z10 = true;
            if (staticLayout2 != null) {
                this.f29289h0 = staticLayout2.getLineBottom(staticLayout2.getLineCount() - 1);
            } else if (this.f29299r > 1 && this.f29281c.getLineCount() > 0) {
                StaticLayout staticLayout3 = this.f29281c;
                this.f29289h0 = staticLayout3.getLineBottom(staticLayout3.getLineCount() - 1);
            } else {
                this.f29289h0 = this.f29281c.getLineBottom(0);
            }
            int i11 = this.f29294n & 7;
            if (i11 == 1) {
                this.f29283d0 = ((i7 - this.f29287f0) / 2) - ((int) this.f29281c.getLineLeft(0));
            } else if (i11 == 3) {
                StaticLayout staticLayout4 = this.d;
                if (staticLayout4 != null) {
                    this.f29283d0 = -((int) staticLayout4.getLineLeft(0));
                } else {
                    this.f29283d0 = -((int) this.f29281c.getLineLeft(0));
                }
            } else if (this.f29281c.getLineLeft(0) == 0.0f) {
                StaticLayout staticLayout5 = this.d;
                if (staticLayout5 != null) {
                    this.f29283d0 = (int) (i7 - staticLayout5.getLineWidth(0));
                } else {
                    this.f29283d0 = i7 - this.f29287f0;
                }
            } else {
                this.f29283d0 = -org.telegram.messenger.g0.L(8.0f);
            }
            this.f29283d0 = getPaddingLeft() + this.f29283d0;
            if (this.f29295n0) {
                if (this.f29308x != null && !this.m0) {
                    i10 = (int) (drawable.getIntrinsicWidth() * this.I);
                } else {
                    i10 = 0;
                }
                if (this.f29310y != null && !this.m0) {
                    i10 += (int) (drawable2.getIntrinsicWidth() * this.I);
                }
            } else {
                i10 = 0;
            }
            if (this.f29287f0 + i10 <= i7 - this.f29302s0) {
                z10 = false;
            }
            this.R = z10;
            b();
            StaticLayout staticLayout6 = this.f29284e;
            if (staticLayout6 != null && this.f29304u0 > 0) {
                this.f29307w0 = staticLayout6.getPrimaryHorizontal(0) - this.d.getPrimaryHorizontal(0);
            }
        }
        int i12 = this.G;
        if (i12 >= 0) {
            this.H = this.f29281c.getPrimaryHorizontal(i12);
        } else {
            this.H = 0.0f;
        }
    }

    public final void b() {
        int i7;
        if ((this.Q && (this.R || this.S != 0.0f)) || this.f29296o0) {
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
        ArrayList arrayList = this.f29312z0;
        if (arrayList.isEmpty()) {
            return;
        }
        Path path = this.B0;
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
        Stack stack = this.A0;
        ArrayList arrayList = this.f29312z0;
        CharSequence charSequence4 = this.f29301s;
        this.G = -1;
        this.D0 = false;
        if (charSequence4 != null) {
            try {
                Drawable drawable3 = this.f29306w;
                if (drawable3 != null && !this.f29293l0) {
                    drawable3.getIntrinsicWidth();
                    i10 = (i7 - this.f29306w.getIntrinsicWidth()) - this.J;
                } else {
                    i10 = i7;
                }
                if (!this.f29295n0) {
                    if (this.f29308x != null && !this.m0) {
                        i11 = (int) (drawable.getIntrinsicWidth() * this.I);
                        i10 = (i10 - i11) - this.J;
                    } else {
                        i11 = 0;
                    }
                    if (this.f29310y != null && !this.m0) {
                        i11 += (int) (drawable2.getIntrinsicWidth() * this.I);
                        i10 = (i10 - i11) - this.J;
                    }
                } else {
                    i11 = 0;
                }
                SpannableStringBuilder spannableStringBuilder = charSequence4;
                if (this.F != null) {
                    spannableStringBuilder = charSequence4;
                    if (this.E != null) {
                        int indexOf = charSequence4.toString().indexOf(this.F);
                        this.G = indexOf;
                        if (indexOf >= 0) {
                            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence4);
                            org.telegram.ui.Cells.s2 s2Var = new org.telegram.ui.Cells.s2(this.E.getIntrinsicWidth());
                            int i14 = this.G;
                            valueOf.setSpan(s2Var, i14, this.F.length() + i14, 0);
                            spannableStringBuilder = valueOf;
                        } else {
                            i10 = (i10 - this.E.getIntrinsicWidth()) - this.J;
                            spannableStringBuilder = charSequence4;
                        }
                    }
                }
                CharSequence charSequence5 = spannableStringBuilder;
                boolean z10 = this.C0;
                TextPaint textPaint = this.h;
                if (z10 && i11 != 0 && !this.m0 && !charSequence5.equals(TextUtils.ellipsize(charSequence5, textPaint, i10, TextUtils.TruncateAt.END))) {
                    this.D0 = true;
                    i10 = i10 + i11 + this.J;
                }
                int i15 = i10;
                if (this.M) {
                    if (!this.f29296o0) {
                        charSequence2 = TextUtils.ellipsize(charSequence5, textPaint, i15, TextUtils.TruncateAt.END);
                    } else {
                        charSequence2 = charSequence5;
                    }
                    if (!this.f29296o0 && !charSequence2.equals(charSequence5)) {
                        Layout.Alignment alignment = getAlignment();
                        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                        StaticLayout c10 = zu0.c(charSequence5, textPaint, i15, alignment, 0.0f, truncateAt, i15, this.f29311y0, false);
                        i13 = i15;
                        this.f29284e = c10;
                        if (c10 != null) {
                            int lineEnd = c10.getLineEnd(0);
                            int lineStart = this.f29284e.getLineStart(1);
                            CharSequence subSequence = charSequence5.subSequence(0, lineEnd);
                            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(charSequence5);
                            valueOf2.setSpan(new uy(false), 0, lineStart, 0);
                            if (lineEnd < charSequence2.length()) {
                                charSequence3 = charSequence2.subSequence(lineEnd, charSequence2.length());
                            } else {
                                charSequence3 = "…";
                            }
                            int length = charSequence2.length();
                            if (this.Q) {
                                L3 = org.telegram.messenger.g0.L(2000.0f);
                            } else {
                                L3 = i13 + org.telegram.messenger.g0.L(8.0f);
                            }
                            this.d = new StaticLayout(charSequence2, 0, length, textPaint, L3, getAlignment(), 1.0f, 0.0f, false);
                            int length2 = subSequence.length();
                            if (this.Q) {
                                L4 = org.telegram.messenger.g0.L(2000.0f);
                            } else {
                                L4 = i13 + org.telegram.messenger.g0.L(8.0f);
                            }
                            StaticLayout staticLayout = new StaticLayout(subSequence, 0, length2, textPaint, L4, getAlignment(), 1.0f, 0.0f, false);
                            this.f29281c = staticLayout;
                            String str = charSequence3;
                            if (staticLayout.getLineLeft(0) != 0.0f) {
                                str = "\u200f" + ((Object) charSequence3);
                            }
                            CharSequence charSequence6 = str;
                            int length3 = charSequence6.length();
                            if (this.Q) {
                                L5 = org.telegram.messenger.g0.L(2000.0f);
                            } else {
                                L5 = i13 + org.telegram.messenger.g0.L(8.0f);
                            }
                            this.f29286f = new StaticLayout(charSequence6, 0, length3, textPaint, L5, getAlignment(), 1.0f, 0.0f, false);
                            this.f29284e = zu0.c(valueOf2, textPaint, i13 + org.telegram.messenger.g0.L(8.0f) + this.f29304u0, getAlignment(), 0.0f, truncateAt, i13 + this.f29304u0, this.f29311y0, false);
                        }
                    } else {
                        i13 = i15;
                        CharSequence charSequence7 = charSequence2;
                        int length4 = charSequence7.length();
                        if (!this.Q && !this.f29296o0) {
                            L2 = i13 + org.telegram.messenger.g0.L(8.0f);
                            this.f29281c = new StaticLayout(charSequence7, 0, length4, textPaint, L2, getAlignment(), 1.0f, 0.0f, false);
                            this.f29284e = null;
                            this.f29286f = null;
                            this.d = null;
                        }
                        L2 = org.telegram.messenger.g0.L(2000.0f);
                        this.f29281c = new StaticLayout(charSequence7, 0, length4, textPaint, L2, getAlignment(), 1.0f, 0.0f, false);
                        this.f29284e = null;
                        this.f29286f = null;
                        this.d = null;
                    }
                    i12 = i13;
                } else if (this.f29299r > 1) {
                    StaticLayout c11 = zu0.c(charSequence5, textPaint, i15, getAlignment(), 0.0f, TextUtils.TruncateAt.END, i15, this.f29299r, false);
                    i12 = i15;
                    this.f29281c = c11;
                } else {
                    i12 = i15;
                    if (!this.Q && !this.f29296o0) {
                        charSequence = TextUtils.ellipsize(charSequence5, textPaint, i12, TextUtils.TruncateAt.END);
                        int length5 = charSequence.length();
                        if (!this.Q && !this.f29296o0) {
                            L = org.telegram.messenger.g0.L(8.0f) + i12;
                            this.f29281c = new StaticLayout(charSequence, 0, length5, textPaint, L, getAlignment(), 1.0f, 0.0f, false);
                        }
                        L = org.telegram.messenger.g0.L(2000.0f);
                        this.f29281c = new StaticLayout(charSequence, 0, length5, textPaint, L, getAlignment(), 1.0f, 0.0f, false);
                    }
                    charSequence = charSequence5;
                    int length52 = charSequence.length();
                    if (!this.Q) {
                        L = org.telegram.messenger.g0.L(8.0f) + i12;
                        this.f29281c = new StaticLayout(charSequence, 0, length52, textPaint, L, getAlignment(), 1.0f, 0.0f, false);
                    }
                    L = org.telegram.messenger.g0.L(2000.0f);
                    this.f29281c = new StaticLayout(charSequence, 0, length52, textPaint, L, getAlignment(), 1.0f, 0.0f, false);
                }
                stack.addAll(arrayList);
                arrayList.clear();
                StaticLayout staticLayout2 = this.f29281c;
                if (staticLayout2 != null && (staticLayout2.getText() instanceof Spannable)) {
                    xh.f.b(this, this.f29281c, -2, -2, stack, arrayList);
                }
                a(i12);
            } catch (Exception unused) {
            }
        } else {
            this.f29281c = null;
            this.f29287f0 = 0;
            this.f29289h0 = 0;
        }
        org.telegram.ui.Components.y5.release(this, this.I0);
        if (this.L0) {
            this.I0 = org.telegram.ui.Components.y5.update(this.J0, this, this.I0, this.f29281c);
        }
        invalidate();
    }

    public final void e(Canvas canvas) {
        int i7 = (this.N > 0.0f ? 1 : (this.N == 0.0f ? 0 : -1));
        int i10 = 0;
        ArrayList arrayList = this.f29312z0;
        if (i7 > 0 && this.f29305v0 != 0) {
            canvas.save();
            float f10 = this.N;
            canvas.translate((this.f29307w0 * f10) + ((-this.f29305v0) * f10), 0.0f);
            float f11 = this.f29277a;
            float f12 = this.N;
            this.f29277a = p5.c.e(this.f29307w0, f12, (-this.f29305v0) * f12, f11);
            canvas.save();
            c(canvas);
            org.telegram.ui.Components.u5 u5Var = this.I0;
            if (u5Var != null) {
                u5Var.a();
            }
            this.f29281c.draw(canvas);
            canvas.restore();
            org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas, this.f29281c, this.I0, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.K0);
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
        org.telegram.ui.Components.u5 u5Var2 = this.I0;
        if (u5Var2 != null) {
            u5Var2.a();
        }
        this.f29281c.draw(canvas);
        canvas.restore();
        org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas, this.f29281c, this.I0, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.K0);
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            ((xh.f) obj2).draw(canvas);
        }
    }

    public final boolean f() {
        if (this.f29292k0 && getMeasuredHeight() != 0 && !this.M) {
            d(((getMaxTextWidth() - getPaddingLeft()) - getPaddingRight()) - this.f29309x0);
            if ((this.f29294n & 112) == 16) {
                this.f29285e0 = (getMeasuredHeight() - this.f29289h0) / 2;
                return true;
            }
            this.f29285e0 = getPaddingTop();
            return true;
        }
        requestLayout();
        return true;
    }

    public final void g(bv0 bv0Var, String str) {
        Drawable drawable = this.E;
        if (drawable == bv0Var) {
            return;
        }
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.E = bv0Var;
        if (bv0Var != null) {
            bv0Var.setCallback(this);
        }
        f();
        this.F = str;
    }

    @Override
    public Drawable getBackground() {
        Drawable drawable = this.P;
        if (drawable != null) {
            return drawable;
        }
        return super.getBackground();
    }

    public float getExactWidth() {
        int i7;
        float measureText = getPaint().measureText(getText().toString()) + getSideDrawablesSize();
        if (this.f29306w == null && this.f29308x == null && this.f29310y == null) {
            i7 = 0;
        } else {
            i7 = this.J;
        }
        return measureText - i7;
    }

    public float getExactWidthIncludeDrawables() {
        int i7;
        int i10;
        float exactWidth = getExactWidth();
        Drawable drawable = this.f29306w;
        int i11 = 0;
        if (drawable != null) {
            i7 = drawable.getIntrinsicWidth();
        } else {
            i7 = 0;
        }
        float f10 = exactWidth + i7;
        Drawable drawable2 = this.f29308x;
        if (drawable2 != null) {
            i10 = drawable2.getIntrinsicWidth();
        } else {
            i10 = 0;
        }
        float f11 = f10 + i10;
        Drawable drawable3 = this.f29310y;
        if (drawable3 != null) {
            i11 = drawable3.getIntrinsicWidth();
        }
        return f11 + i11;
    }

    public float getFullAlpha() {
        return this.N;
    }

    public Layout getLayout() {
        return this.f29281c;
    }

    public float getLayoutX() {
        return this.f29277a;
    }

    public float getLayoutY() {
        return this.f29279b;
    }

    public Drawable getLeftDrawable() {
        return this.f29306w;
    }

    public int getLineCount() {
        int i7;
        StaticLayout staticLayout = this.f29281c;
        if (staticLayout != null) {
            i7 = staticLayout.getLineCount();
        } else {
            i7 = 0;
        }
        StaticLayout staticLayout2 = this.f29284e;
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
        if (this.m0 && (drawable2 = this.f29308x) != null) {
            i7 = drawable2.getIntrinsicWidth() + this.J;
        } else {
            i7 = 0;
        }
        int i11 = measuredWidth - i7;
        if (this.m0 && (drawable = this.f29310y) != null) {
            i10 = this.J + drawable.getIntrinsicWidth();
        }
        return i11 - i10;
    }

    public TextPaint getPaint() {
        return this.h;
    }

    public Drawable getRightDrawable() {
        return this.f29308x;
    }

    public Drawable getRightDrawable2() {
        return this.f29310y;
    }

    public boolean getRightDrawableOutside() {
        return this.m0;
    }

    public int getRightDrawableWidth() {
        Drawable drawable = this.f29308x;
        if (drawable == null) {
            return 0;
        }
        return (int) ((drawable.getIntrinsicWidth() * this.I) + this.J);
    }

    public int getRightDrawableX() {
        return this.f29290i0;
    }

    public int getRightDrawableY() {
        return this.f29291j0;
    }

    public int getSideDrawablesSize() {
        int i7;
        Drawable drawable = this.f29306w;
        if (drawable != null) {
            i7 = drawable.getIntrinsicWidth() + this.J;
        } else {
            i7 = 0;
        }
        Drawable drawable2 = this.f29308x;
        if (drawable2 != null) {
            i7 += ((int) (drawable2.getIntrinsicWidth() * this.I)) + this.J;
        }
        Drawable drawable3 = this.f29310y;
        if (drawable3 != null) {
            return ((int) (drawable3.getIntrinsicWidth() * this.I)) + this.J + i7;
        }
        return i7;
    }

    public CharSequence getText() {
        CharSequence charSequence = this.f29301s;
        if (charSequence == null) {
            return "";
        }
        return charSequence;
    }

    public int getTextColor() {
        return this.h.getColor();
    }

    public int getTextHeight() {
        return this.f29289h0;
    }

    public TextPaint getTextPaint() {
        return this.h;
    }

    public int getTextStartX() {
        int i7 = 0;
        if (this.f29281c == null) {
            return 0;
        }
        Drawable drawable = this.f29306w;
        if (drawable != null && (this.f29294n & 7) == 3) {
            i7 = this.J + drawable.getIntrinsicWidth();
        }
        Drawable drawable2 = this.E;
        if (drawable2 != null && this.G < 0 && (this.f29294n & 7) == 3) {
            i7 += drawable2.getIntrinsicWidth() + this.J;
        }
        return ((int) getX()) + this.f29283d0 + i7;
    }

    public int getTextStartY() {
        if (this.f29281c == null) {
            return 0;
        }
        return (int) getY();
    }

    public int getTextWidth() {
        Drawable drawable;
        int i7;
        Drawable drawable2;
        int i10 = this.f29287f0;
        int i11 = 0;
        if (this.f29295n0) {
            if (this.f29308x != null) {
                i7 = (int) (drawable.getIntrinsicWidth() * this.I);
            } else {
                i7 = 0;
            }
            if (this.f29310y != null) {
                i11 = (int) (drawable2.getIntrinsicWidth() * this.I);
            }
            i11 += i7;
        }
        return i10 + i11;
    }

    public final void h(int i7, int i10) {
        if (this.f29304u0 == i7 && this.f29305v0 == i10) {
            return;
        }
        this.f29304u0 = i7;
        this.f29305v0 = i10;
        d(((getMaxTextWidth() - getPaddingLeft()) - getPaddingRight()) - this.f29309x0);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void i(Drawable drawable) {
        Drawable drawable2 = this.f29308x;
        if (drawable2 == drawable) {
            return;
        }
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f29308x = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        f();
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = this.f29306w;
        if (drawable == drawable2) {
            invalidate(drawable2.getBounds());
            return;
        }
        Drawable drawable3 = this.f29308x;
        if (drawable == drawable3) {
            invalidate(drawable3.getBounds());
            return;
        }
        Drawable drawable4 = this.f29310y;
        if (drawable == drawable4) {
            invalidate(drawable4.getBounds());
            return;
        }
        Drawable drawable5 = this.E;
        if (drawable == drawable5) {
            invalidate(drawable5.getBounds());
        }
    }

    public final void j(Drawable drawable) {
        Drawable drawable2 = this.f29310y;
        if (drawable2 == drawable) {
            return;
        }
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f29310y = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        f();
    }

    public boolean k(CharSequence charSequence) {
        return l(charSequence, false);
    }

    public boolean l(CharSequence charSequence, boolean z10) {
        CharSequence charSequence2 = this.f29301s;
        if (charSequence2 != null || charSequence != null) {
            if (!z10 && charSequence2 != null && charSequence2.equals(charSequence)) {
                return false;
            }
            this.f29301s = charSequence;
            this.U = 500;
            f();
            return true;
        }
        return false;
    }

    public final void m() {
        boolean z10;
        if ((this.V == null || this.W == null) && this.Q) {
            Paint paint = new Paint();
            this.V = paint;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(6.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, tileMode));
            Paint paint2 = this.V;
            PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
            paint2.setXfermode(new PorterDuffXfermode(mode));
            Paint paint3 = new Paint();
            this.W = paint3;
            paint3.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(6.0f), 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
            this.W.setXfermode(new PorterDuffXfermode(mode));
        }
        Boolean bool = this.f29298q0;
        if (bool != null) {
            z10 = bool.booleanValue();
        } else {
            z10 = false;
        }
        if ((this.f29278a0 == null || this.f29280b0 != org.telegram.messenger.g0.L(this.f29300r0) || this.f29297p0 != z10) && this.f29296o0) {
            if (this.f29278a0 == null) {
                this.f29278a0 = new Paint();
            }
            this.f29297p0 = z10;
            if (z10) {
                Paint paint4 = this.f29278a0;
                int L = org.telegram.messenger.g0.L(this.f29300r0);
                this.f29280b0 = L;
                paint4.setShader(new LinearGradient(0.0f, 0.0f, L, 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            } else {
                Paint paint5 = this.f29278a0;
                int L2 = org.telegram.messenger.g0.L(this.f29300r0);
                this.f29280b0 = L2;
                paint5.setShader(new LinearGradient(0.0f, 0.0f, L2, 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            }
            this.f29278a0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.L0 = true;
        this.I0 = org.telegram.ui.Components.y5.update(this.J0, this, this.I0, this.f29281c);
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.L0 = false;
        org.telegram.ui.Components.y5.release(this, this.I0);
        this.f29292k0 = false;
    }

    @Override
    public void onDraw(Canvas canvas) {
        boolean z10;
        int i7;
        Drawable drawable;
        float f10;
        float f11;
        int i10;
        Drawable drawable2;
        int e10;
        int i11;
        int i12;
        int e11;
        int i13;
        int e12;
        int i14;
        float f12;
        float f13;
        float f14;
        Drawable drawable3;
        float f15;
        boolean z11;
        float f16;
        Drawable drawable4;
        int e13;
        int i15;
        int e14;
        int i16;
        float f17;
        float f18;
        Drawable drawable5;
        Drawable drawable6;
        Drawable drawable7;
        int e15;
        int i17;
        int e16;
        int i18;
        int intrinsicHeight;
        Drawable drawable8;
        int e17;
        int i19;
        int e18;
        int i20;
        int intrinsicHeight2;
        int intrinsicHeight3;
        super.onDraw(canvas);
        this.f29277a = 0.0f;
        this.f29279b = 0.0f;
        if (this.Q && (this.R || this.S != 0.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f29288g0 = this.f29287f0;
        Drawable drawable9 = this.f29306w;
        if (drawable9 != null && !this.f29293l0) {
            int i21 = (int) (-this.S);
            int i22 = this.f29294n;
            if ((i22 & 7) == 1) {
                i21 += this.f29283d0;
            }
            if ((i22 & 112) == 16) {
                intrinsicHeight3 = ((getMeasuredHeight() - this.f29306w.getIntrinsicHeight()) / 2) + this.K;
            } else {
                intrinsicHeight3 = this.K + ((this.f29289h0 - this.f29306w.getIntrinsicHeight()) / 2) + getPaddingTop();
            }
            Drawable drawable10 = this.f29306w;
            drawable10.setBounds(i21, intrinsicHeight3, drawable10.getIntrinsicWidth() + i21, this.f29306w.getIntrinsicHeight() + intrinsicHeight3);
            this.f29306w.draw(canvas);
            int i23 = this.f29294n & 7;
            if (i23 != 3 && i23 != 1) {
                i7 = 0;
            } else {
                i7 = this.f29306w.getIntrinsicWidth() + this.J;
            }
            this.f29288g0 = this.f29306w.getIntrinsicWidth() + this.J + this.f29288g0;
        } else if (this.f29293l0 && drawable9 != null) {
            i7 = this.J + drawable9.getIntrinsicWidth();
        } else {
            i7 = 0;
        }
        Drawable drawable11 = this.E;
        if (drawable11 != null && this.F != null) {
            int i24 = (int) ((-this.S) + this.H);
            int i25 = this.f29294n;
            if ((i25 & 7) == 1) {
                i24 += this.f29283d0;
            }
            if ((i25 & 112) == 16) {
                intrinsicHeight2 = ((getMeasuredHeight() - this.E.getIntrinsicHeight()) / 2) + this.K;
            } else {
                intrinsicHeight2 = this.K + ((this.f29289h0 - drawable11.getIntrinsicHeight()) / 2);
            }
            Drawable drawable12 = this.E;
            drawable12.setBounds(i24, intrinsicHeight2, drawable12.getIntrinsicWidth() + i24, this.E.getIntrinsicHeight() + intrinsicHeight2);
            this.E.draw(canvas);
            if (this.G < 0) {
                int i26 = this.f29294n & 7;
                if (i26 == 3 || i26 == 1) {
                    i7 += this.E.getIntrinsicWidth() + this.J;
                }
                this.f29288g0 = this.E.getIntrinsicWidth() + this.J + this.f29288g0;
            }
        }
        int i27 = i7;
        if (this.f29308x != null && !this.D0 && this.I > 0.0f && !this.m0 && !this.f29295n0) {
            int i28 = this.f29287f0 + i27 + this.J + ((int) (-this.S));
            int i29 = this.f29294n & 7;
            if (i29 == 1 || i29 == 5) {
                i28 += this.f29283d0;
            }
            int intrinsicWidth = (int) (drawable.getIntrinsicWidth() * this.I);
            int intrinsicHeight4 = (int) (this.f29308x.getIntrinsicHeight() * this.I);
            if ((this.f29294n & 112) == 16) {
                e18 = (getMeasuredHeight() - intrinsicHeight4) / 2;
                i20 = this.L;
            } else {
                e18 = i5.c.e(this.f29289h0, intrinsicHeight4, 2, getPaddingTop());
                i20 = this.L;
            }
            int i30 = e18 + i20;
            f10 = 0.0f;
            this.f29308x.setBounds(i28, i30, i28 + intrinsicWidth, i30 + intrinsicHeight4);
            this.f29290i0 = i28 + (intrinsicWidth >> 1);
            this.f29291j0 = i30 + (intrinsicHeight4 >> 1);
            this.f29308x.draw(canvas);
            this.f29288g0 = this.J + intrinsicWidth + this.f29288g0;
        } else {
            f10 = 0.0f;
        }
        if (this.f29310y != null && !this.D0 && this.I > f10 && !this.m0 && !this.f29295n0) {
            int i31 = this.f29287f0 + i27 + this.J + ((int) (-this.S));
            if (this.f29308x != null) {
                i31 += ((int) (drawable8.getIntrinsicWidth() * this.I)) + this.J;
            }
            int i32 = this.f29294n & 7;
            if (i32 == 1 || i32 == 5) {
                i31 += this.f29283d0;
            }
            int intrinsicWidth2 = (int) (this.f29310y.getIntrinsicWidth() * this.I);
            int intrinsicHeight5 = (int) (this.f29310y.getIntrinsicHeight() * this.I);
            if ((this.f29294n & 112) == 16) {
                e17 = (getMeasuredHeight() - intrinsicHeight5) / 2;
                i19 = this.L;
            } else {
                e17 = i5.c.e(this.f29289h0, intrinsicHeight5, 2, getPaddingTop());
                i19 = this.L;
            }
            int i33 = e17 + i19;
            this.f29310y.setBounds(i31, i33, i31 + intrinsicWidth2, intrinsicHeight5 + i33);
            this.f29310y.draw(canvas);
            this.f29288g0 = this.J + intrinsicWidth2 + this.f29288g0;
        }
        int L = org.telegram.messenger.g0.L(16.0f) + this.f29288g0;
        float f19 = this.S;
        if (f19 != f10) {
            if (this.f29306w != null && !this.f29293l0) {
                int i34 = ((int) (-f19)) + L;
                if ((this.f29294n & 112) == 16) {
                    intrinsicHeight = ((getMeasuredHeight() - this.f29306w.getIntrinsicHeight()) / 2) + this.K;
                } else {
                    intrinsicHeight = this.K + ((this.f29289h0 - this.f29306w.getIntrinsicHeight()) / 2) + getPaddingTop();
                }
                Drawable drawable13 = this.f29306w;
                drawable13.setBounds(i34, intrinsicHeight, drawable13.getIntrinsicWidth() + i34, this.f29306w.getIntrinsicHeight() + intrinsicHeight);
                this.f29306w.draw(canvas);
            }
            if (this.f29308x != null && !this.m0) {
                int intrinsicWidth3 = (int) (drawable5.getIntrinsicWidth() * this.I);
                int intrinsicHeight6 = (int) (this.f29308x.getIntrinsicHeight() * this.I);
                int i35 = this.f29287f0 + i27 + this.J + ((int) (-this.S)) + L;
                if ((this.f29294n & 112) == 16) {
                    e16 = (getMeasuredHeight() - intrinsicHeight6) / 2;
                    i18 = this.L;
                } else {
                    e16 = i5.c.e(this.f29289h0, intrinsicHeight6, 2, getPaddingTop());
                    i18 = this.L;
                }
                int i36 = e16 + i18;
                f11 = 16.0f;
                this.f29308x.setBounds(i35, i36, i35 + intrinsicWidth3, i36 + intrinsicHeight6);
                this.f29290i0 = i35 + (intrinsicWidth3 >> 1);
                this.f29291j0 = i36 + (intrinsicHeight6 >> 1);
                this.f29308x.draw(canvas);
            } else {
                f11 = 16.0f;
            }
            if (this.f29310y != null && !this.m0) {
                int intrinsicWidth4 = (int) (drawable6.getIntrinsicWidth() * this.I);
                int intrinsicHeight7 = (int) (this.f29310y.getIntrinsicHeight() * this.I);
                int i37 = this.f29287f0 + i27 + this.J + ((int) (-this.S)) + L;
                if (this.f29308x != null) {
                    i37 += ((int) (drawable7.getIntrinsicWidth() * this.I)) + this.J;
                }
                if ((this.f29294n & 112) == 16) {
                    e15 = (getMeasuredHeight() - intrinsicHeight7) / 2;
                    i17 = this.L;
                } else {
                    e15 = i5.c.e(this.f29289h0, intrinsicHeight7, 2, getPaddingTop());
                    i17 = this.L;
                }
                int i38 = e15 + i17;
                this.f29310y.setBounds(i37, i38, intrinsicWidth4 + i37, intrinsicHeight7 + i38);
                this.f29310y.draw(canvas);
            }
        } else {
            f11 = 16.0f;
        }
        if (this.f29281c != null) {
            if (this.f29293l0 || this.m0 || this.f29296o0 || this.f29302s0 > 0) {
                canvas.save();
                int maxTextWidth = getMaxTextWidth() - this.f29302s0;
                Drawable drawable14 = this.f29308x;
                if (drawable14 != null && !(drawable14 instanceof org.telegram.ui.Components.n5) && this.m0) {
                    f12 = 2.0f;
                } else {
                    f12 = f10;
                }
                canvas.clipRect(i27, 0, maxTextWidth - org.telegram.messenger.g0.L(f12), getMeasuredHeight());
            }
            org.telegram.messenger.j6.f24849n = false;
            if (this.P != null) {
                int i39 = this.f29287f0;
                int i40 = (i39 / 2) + ((int) ((this.f29283d0 + i27) - this.S));
                int max = Math.max(getPaddingRight() + getPaddingLeft() + i39, this.f29303t0);
                int i41 = i40 - (max / 2);
                this.P.setBounds(i41, 0, max + i41, getMeasuredHeight());
                this.P.draw(canvas);
            }
            if (this.f29283d0 + i27 != 0 || this.f29285e0 != 0 || this.S != f10) {
                canvas.save();
                canvas.translate((this.f29283d0 + i27) - this.S, this.f29285e0);
                this.f29277a = ((this.f29283d0 + i27) - this.S) + this.f29277a;
                this.f29279b += this.f29285e0;
            }
            e(canvas);
            StaticLayout staticLayout = this.f29286f;
            TextPaint textPaint = this.h;
            if (staticLayout != null && this.N < 1.0f) {
                int alpha = textPaint.getAlpha();
                textPaint.setAlpha((int) ((1.0f - this.N) * 255.0f));
                canvas.save();
                if (this.f29286f.getText().length() == 1) {
                    if (this.f29311y0 == 1) {
                        f18 = 0.5f;
                    } else {
                        f18 = 4.0f;
                    }
                    f17 = org.telegram.messenger.g0.L(f18);
                } else {
                    f17 = f10;
                }
                if (this.f29281c.getLineLeft(0) != f10) {
                    float f20 = (-this.f29281c.getLineWidth(0)) + f17;
                    float f21 = f10;
                    canvas.translate(f20, f21);
                    f13 = f21;
                } else {
                    f13 = f10;
                    canvas.translate(this.f29281c.getLineWidth(0) - f17, f13);
                }
                float f22 = this.N;
                canvas.translate((this.f29307w0 * f22) + ((-this.f29305v0) * f22), f13);
                this.f29286f.draw(canvas);
                canvas.restore();
                textPaint.setAlpha(alpha);
            } else {
                f13 = f10;
            }
            if (this.f29284e != null) {
                if (this.N > f13) {
                    int alpha2 = textPaint.getAlpha();
                    textPaint.setAlpha((int) (this.N * 255.0f));
                    float f23 = this.N;
                    float f24 = this.f29307w0;
                    float f25 = ((f23 * f24) + ((-this.f29305v0) * f23)) - f24;
                    f14 = 0.0f;
                    canvas.translate(f25, 0.0f);
                    this.f29284e.draw(canvas);
                    textPaint.setAlpha(alpha2);
                } else {
                    f14 = 0.0f;
                }
            } else {
                f14 = f13;
            }
            if (this.S != f14) {
                canvas.translate(L, f14);
                e(canvas);
            }
            if (this.f29283d0 + i27 != 0 || this.f29285e0 != 0 || this.S != f14) {
                canvas.restore();
            }
            if (this.f29308x != null && !this.D0 && this.I > 0.0f && !this.m0 && this.f29295n0) {
                int i42 = this.f29287f0 + i27 + this.J + ((int) (-this.S));
                int i43 = this.f29294n & 7;
                if (i43 == 1 || i43 == 5) {
                    i42 += this.f29283d0;
                }
                int intrinsicWidth5 = (int) (drawable3.getIntrinsicWidth() * this.I);
                int intrinsicHeight8 = (int) (this.f29308x.getIntrinsicHeight() * this.I);
                if ((this.f29294n & 112) == 16) {
                    e14 = (getMeasuredHeight() - intrinsicHeight8) / 2;
                    i16 = this.L;
                } else {
                    e14 = i5.c.e(this.f29289h0, intrinsicHeight8, 2, getPaddingTop());
                    i16 = this.L;
                }
                int i44 = e14 + i16;
                this.f29308x.setBounds(i42, i44, i42 + intrinsicWidth5, i44 + intrinsicHeight8);
                this.f29290i0 = i42 + (intrinsicWidth5 >> 1);
                this.f29291j0 = i44 + (intrinsicHeight8 >> 1);
                this.f29308x.draw(canvas);
                this.f29288g0 = this.J + intrinsicWidth5 + this.f29288g0;
            }
            if (this.f29310y != null && !this.D0 && this.I > 0.0f && !this.m0 && this.f29295n0) {
                int i45 = this.f29287f0 + i27 + this.J + ((int) (-this.S));
                if (this.f29308x != null) {
                    i45 += ((int) (drawable4.getIntrinsicWidth() * this.I)) + this.J;
                }
                int i46 = this.f29294n & 7;
                if (i46 == 1 || i46 == 5) {
                    i45 += this.f29283d0;
                }
                int intrinsicWidth6 = (int) (this.f29310y.getIntrinsicWidth() * this.I);
                int intrinsicHeight9 = (int) (this.f29310y.getIntrinsicHeight() * this.I);
                if ((this.f29294n & 112) == 16) {
                    e13 = (getMeasuredHeight() - intrinsicHeight9) / 2;
                    i15 = this.L;
                } else {
                    e13 = i5.c.e(this.f29289h0, intrinsicHeight9, 2, getPaddingTop());
                    i15 = this.L;
                }
                int i47 = e13 + i15;
                this.f29310y.setBounds(i45, i47, i45 + intrinsicWidth6, intrinsicHeight9 + i47);
                this.f29310y.draw(canvas);
                this.f29288g0 = this.J + intrinsicWidth6 + this.f29288g0;
            }
            if (z10) {
                if (this.S < org.telegram.messenger.g0.L(10.0f)) {
                    this.V.setAlpha((int) ((this.S / org.telegram.messenger.g0.L(10.0f)) * 255.0f));
                } else {
                    if (this.S > (org.telegram.messenger.g0.L(f11) + this.f29288g0) - org.telegram.messenger.g0.L(10.0f)) {
                        this.V.setAlpha((int) n10.y(this.S - ((org.telegram.messenger.g0.L(f11) + this.f29288g0) - org.telegram.messenger.g0.L(10.0f)), org.telegram.messenger.g0.L(10.0f), 1.0f, 255.0f));
                    } else {
                        this.V.setAlpha(255);
                    }
                }
                canvas.drawRect(i27, 0.0f, org.telegram.messenger.g0.L(6.0f) + i27, getMeasuredHeight(), this.V);
                canvas.save();
                canvas.translate((getMaxTextWidth() - this.f29302s0) - org.telegram.messenger.g0.L(6.0f), 0.0f);
                canvas.drawRect(0.0f, 0.0f, org.telegram.messenger.g0.L(6.0f), getMeasuredHeight(), this.W);
                canvas.restore();
            } else if (this.f29296o0 && this.R && this.f29278a0 != null) {
                canvas.save();
                m();
                if (!this.f29297p0) {
                    int maxTextWidth2 = (getMaxTextWidth() - this.f29302s0) - this.f29280b0;
                    Drawable drawable15 = this.f29308x;
                    if (drawable15 != null && !(drawable15 instanceof org.telegram.ui.Components.n5) && this.m0) {
                        f15 = 2.0f;
                    } else {
                        f15 = 0.0f;
                    }
                    canvas.translate(maxTextWidth2 - org.telegram.messenger.g0.L(f15), 0.0f);
                }
                canvas.drawRect(i27, 0.0f, this.f29280b0, getMeasuredHeight(), this.f29278a0);
                canvas.restore();
            }
            if (!this.Q || (!this.R && this.S == 0.0f)) {
                z11 = true;
            } else {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j3 = elapsedRealtime - this.T;
                if (j3 > 17) {
                    j3 = 17;
                }
                int i48 = this.U;
                if (i48 > 0) {
                    this.U = (int) (i48 - j3);
                    z11 = true;
                } else {
                    int L2 = org.telegram.messenger.g0.L(f11) + this.f29288g0;
                    if (this.S < org.telegram.messenger.g0.L(100.0f)) {
                        f16 = com.google.android.gms.internal.vision.e2.c(this.S, org.telegram.messenger.g0.L(100.0f), 20.0f, 30.0f);
                        z11 = true;
                    } else if (this.S >= L2 - org.telegram.messenger.g0.L(100.0f)) {
                        z11 = true;
                        f16 = n10.w(this.S - (L2 - org.telegram.messenger.g0.L(100.0f)), org.telegram.messenger.g0.L(100.0f), 20.0f, 50.0f);
                    } else {
                        z11 = true;
                        f16 = 50.0f;
                    }
                    float L3 = ((((float) j3) / 1000.0f) * org.telegram.messenger.g0.L(f16)) + this.S;
                    this.S = L3;
                    this.T = elapsedRealtime;
                    if (L3 > L2) {
                        this.S = 0.0f;
                        this.U = 500;
                    }
                    b();
                }
                invalidate();
            }
            org.telegram.messenger.j6.f24849n = z11;
            if (this.f29293l0 || this.m0 || this.f29296o0 || this.f29302s0 > 0) {
                canvas.restore();
            }
        }
        Drawable drawable16 = this.f29306w;
        if (drawable16 != null && this.f29293l0) {
            int intrinsicWidth7 = drawable16.getIntrinsicWidth();
            int intrinsicHeight10 = this.f29306w.getIntrinsicHeight();
            if ((this.f29294n & 112) == 16) {
                e12 = (getMeasuredHeight() - intrinsicHeight10) / 2;
                i14 = this.K;
            } else {
                e12 = i5.c.e(this.f29289h0, intrinsicHeight10, 2, getPaddingTop());
                i14 = this.K;
            }
            int i49 = e12 + i14;
            this.f29306w.setBounds(0, i49, intrinsicWidth7, intrinsicHeight10 + i49);
            this.f29306w.draw(canvas);
        }
        if (this.f29308x != null && this.m0) {
            int i50 = this.f29287f0 + i27 + this.J;
            float f26 = this.S;
            if (f26 == 0.0f) {
                i12 = -L;
            } else {
                i12 = (int) (-f26);
            }
            int min = Math.min(i50 + i12 + L, (getMaxTextWidth() - this.f29302s0) + this.J);
            int intrinsicWidth8 = (int) (this.f29308x.getIntrinsicWidth() * this.I);
            int intrinsicHeight11 = (int) (this.f29308x.getIntrinsicHeight() * this.I);
            if ((this.f29294n & 112) == 16) {
                e11 = (getMeasuredHeight() - intrinsicHeight11) / 2;
                i13 = this.L;
            } else {
                e11 = i5.c.e(this.f29289h0, intrinsicHeight11, 2, getPaddingTop());
                i13 = this.L;
            }
            int i51 = e11 + i13;
            this.f29308x.setBounds(min, i51, min + intrinsicWidth8, i51 + intrinsicHeight11);
            this.f29290i0 = min + (intrinsicWidth8 >> 1);
            this.f29291j0 = i51 + (intrinsicHeight11 >> 1);
            this.f29308x.draw(canvas);
        }
        if (this.f29310y != null && this.m0) {
            int i52 = i27 + this.f29287f0 + this.J;
            float f27 = this.S;
            if (f27 == 0.0f) {
                i10 = -L;
            } else {
                i10 = (int) (-f27);
            }
            int min2 = Math.min(i52 + i10 + L, (getMaxTextWidth() - this.f29302s0) + this.J);
            if (this.f29308x != null) {
                min2 += ((int) (drawable2.getIntrinsicWidth() * this.I)) + this.J;
            }
            int intrinsicWidth9 = (int) (this.f29310y.getIntrinsicWidth() * this.I);
            int intrinsicHeight12 = (int) (this.f29310y.getIntrinsicHeight() * this.I);
            if ((this.f29294n & 112) == 16) {
                e10 = (getMeasuredHeight() - intrinsicHeight12) / 2;
                i11 = this.L;
            } else {
                e10 = i5.c.e(this.f29289h0, intrinsicHeight12, 2, getPaddingTop());
                i11 = this.L;
            }
            int i53 = e10 + i11;
            this.f29310y.setBounds(min2, i53, intrinsicWidth9 + min2, intrinsicHeight12 + i53);
            this.f29310y.draw(canvas);
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setVisibleToUser(true);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setText(this.f29301s);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        this.f29292k0 = true;
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
        int i17 = this.f29282c0;
        int i18 = org.telegram.messenger.g0.f24146q.x;
        if (i17 != i18) {
            this.f29282c0 = i18;
            this.S = 0.0f;
            this.U = 500;
            b();
        }
        int paddingLeft = ((size - getPaddingLeft()) - getPaddingRight()) - this.f29309x0;
        if (this.f29293l0 && (drawable6 = this.f29306w) != null) {
            i11 = drawable6.getIntrinsicWidth() + this.J;
        } else {
            i11 = 0;
        }
        int i19 = paddingLeft - i11;
        if (this.m0 && (drawable5 = this.f29308x) != null) {
            i12 = drawable5.getIntrinsicWidth() + this.J;
        } else {
            i12 = 0;
        }
        int i20 = i19 - i12;
        if (this.m0 && (drawable4 = this.f29310y) != null) {
            i13 = drawable4.getIntrinsicWidth() + this.J;
        } else {
            i13 = 0;
        }
        d(i20 - i13);
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            size2 = getPaddingBottom() + getPaddingTop() + this.f29289h0;
        }
        if (this.O) {
            int paddingRight = getPaddingRight() + getPaddingLeft() + this.f29287f0 + this.f29309x0;
            if (this.f29293l0 && (drawable3 = this.f29306w) != null) {
                i14 = drawable3.getIntrinsicWidth() + this.J;
            } else {
                i14 = 0;
            }
            int i21 = paddingRight + i14;
            if (this.m0 && (drawable2 = this.f29308x) != null) {
                i15 = drawable2.getIntrinsicWidth() + this.J;
            } else {
                i15 = 0;
            }
            int i22 = i21 + i15;
            if (this.m0 && (drawable = this.f29310y) != null) {
                i16 = drawable.getIntrinsicWidth() + this.J;
            } else {
                i16 = 0;
            }
            size = Math.max(Math.min(size, i22 + i16), 0);
        }
        setMeasuredDimension(size, size2);
        if ((this.f29294n & 112) == 16) {
            this.f29285e0 = i5.c.e((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), this.f29289h0, 2, getPaddingTop());
        } else {
            this.f29285e0 = getPaddingTop();
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.E0 != null && this.f29308x != null) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(this.f29290i0 - org.telegram.messenger.g0.L(16.0f), this.f29291j0 - org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f) + this.f29290i0, org.telegram.messenger.g0.L(16.0f) + this.f29291j0);
            if (motionEvent.getAction() == 0 && rectF.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                this.F0 = true;
                this.G0 = motionEvent.getX();
                this.H0 = motionEvent.getY();
                getParent().requestDisallowInterceptTouchEvent(true);
                Drawable drawable = this.f29308x;
                if (drawable instanceof l5) {
                    ((xw0) ((l5) drawable)).f53978f.c(true);
                }
            } else if (motionEvent.getAction() == 2 && this.F0) {
                if (Math.abs(motionEvent.getX() - this.G0) >= org.telegram.messenger.g0.f24125e || Math.abs(motionEvent.getY() - this.H0) >= org.telegram.messenger.g0.f24125e) {
                    this.F0 = false;
                    getParent().requestDisallowInterceptTouchEvent(false);
                    Drawable drawable2 = this.f29308x;
                    if (drawable2 instanceof l5) {
                        ((xw0) ((l5) drawable2)).f53978f.c(false);
                    }
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (this.F0 && motionEvent.getAction() == 1) {
                    this.E0.onClick(this);
                    Drawable drawable3 = this.f29308x;
                    if (drawable3 instanceof l5) {
                        ((xw0) ((l5) drawable3)).f53978f.c(false);
                    }
                }
                this.F0 = false;
                getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        if (super.onTouchEvent(motionEvent) || this.F0) {
            return true;
        }
        return false;
    }

    public void setAlignment(Layout.Alignment alignment) {
        this.M0 = alignment;
        requestLayout();
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f29299r > 1) {
            super.setBackgroundDrawable(drawable);
        } else {
            this.P = drawable;
        }
    }

    public void setBuildFullLayout(boolean z10) {
        this.M = z10;
    }

    public void setCanHideRightDrawable(boolean z10) {
        this.C0 = z10;
    }

    public void setDrawablePadding(int i7) {
        if (this.J == i7) {
            return;
        }
        this.J = i7;
        f();
    }

    public void setEllipsizeByGradient(int i7) {
        if (!this.Q) {
            this.f29296o0 = true;
            this.f29298q0 = null;
            m();
            b();
        }
        this.f29300r0 = i7;
        m();
    }

    public void setEmojiCacheType(int i7) {
        if (i7 != this.J0) {
            org.telegram.ui.Components.y5.release(this, this.I0);
            this.J0 = i7;
            if (this.L0) {
                this.I0 = org.telegram.ui.Components.y5.update(i7, this, this.I0, this.f29281c);
            }
        }
    }

    public void setEmojiColor(int i7) {
        this.K0 = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
    }

    public void setFullAlpha(float f10) {
        this.N = f10;
        invalidate();
    }

    public void setFullTextMaxLines(int i7) {
        this.f29311y0 = i7;
    }

    public void setGravity(int i7) {
        this.f29294n = i7;
    }

    public void setLeftDrawable(int i7) {
        setLeftDrawable(i7 == 0 ? null : getContext().getResources().getDrawable(i7));
    }

    public void setLeftDrawableOutside(boolean z10) {
        this.f29293l0 = z10;
    }

    public void setLeftDrawableTopPadding(int i7) {
        this.K = i7;
    }

    public void setLinkTextColor(int i7) {
        this.h.linkColor = i7;
        invalidate();
    }

    public void setMaxLines(int i7) {
        this.f29299r = i7;
    }

    public void setMinWidth(int i7) {
        this.f29303t0 = i7;
    }

    public void setMinusWidth(int i7) {
        if (i7 == this.f29309x0) {
            return;
        }
        this.f29309x0 = i7;
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

    public void setRightDrawableInside(boolean z10) {
        this.f29295n0 = z10;
    }

    public void setRightDrawableOnClick(View.OnClickListener onClickListener) {
        this.E0 = onClickListener;
    }

    public void setRightDrawableOutside(boolean z10) {
        this.m0 = z10;
    }

    public void setRightDrawableScale(float f10) {
        this.I = f10;
    }

    public void setRightDrawableTopPadding(int i7) {
        this.L = i7;
    }

    public void setRightPadding(int i7) {
        if (this.f29302s0 != i7) {
            this.f29302s0 = i7;
            int maxTextWidth = ((getMaxTextWidth() - getPaddingLeft()) - getPaddingRight()) - this.f29309x0;
            Drawable drawable = this.f29306w;
            if (drawable != null && !this.f29293l0) {
                maxTextWidth = (maxTextWidth - drawable.getIntrinsicWidth()) - this.J;
            }
            int i10 = 0;
            if (!this.f29295n0) {
                Drawable drawable2 = this.f29308x;
                if (drawable2 != null && !this.m0) {
                    i10 = (int) (drawable2.getIntrinsicWidth() * this.I);
                    maxTextWidth = (maxTextWidth - i10) - this.J;
                }
                Drawable drawable3 = this.f29310y;
                if (drawable3 != null && !this.m0) {
                    i10 = (int) (drawable3.getIntrinsicWidth() * this.I);
                    maxTextWidth = (maxTextWidth - i10) - this.J;
                }
            }
            if (this.F != null && this.E != null) {
                int indexOf = this.f29301s.toString().indexOf(this.F);
                this.G = indexOf;
                if (indexOf < 0) {
                    maxTextWidth = (maxTextWidth - this.E.getIntrinsicWidth()) - this.J;
                }
            }
            if (this.C0 && i10 != 0 && !this.m0) {
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                if (!this.f29301s.equals(TextUtils.ellipsize(this.f29301s, this.h, maxTextWidth, truncateAt))) {
                    this.D0 = true;
                    maxTextWidth = maxTextWidth + i10 + this.J;
                }
            }
            a(maxTextWidth);
            invalidate();
        }
    }

    public void setScrollNonFitText(boolean z10) {
        if (this.Q == z10) {
            return;
        }
        this.Q = z10;
        m();
        requestLayout();
        b();
    }

    public void setSideDrawablesColor(int i7) {
        m6.C1(i7, this.f29308x);
        m6.C1(i7, this.f29306w);
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

    public void setWidthWrapContent(boolean z10) {
        this.O = z10;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f29308x && drawable != this.f29310y && drawable != this.f29306w && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public void setLeftDrawable(Drawable drawable) {
        Drawable drawable2 = this.f29306w;
        if (drawable2 == drawable) {
            return;
        }
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f29306w = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        f();
    }

    public void setEllipsizeByGradient(boolean z10) {
        if (this.Q == z10) {
            return;
        }
        this.f29296o0 = z10;
        this.f29298q0 = null;
        m();
        b();
    }
}
