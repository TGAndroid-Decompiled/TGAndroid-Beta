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
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Components.nz;
import org.telegram.ui.y01;
public class l5 extends View implements Drawable.Callback {
    public View.OnClickListener A0;
    public String B;
    public boolean B0;
    public int C;
    public float C0;
    public float D;
    public float D0;
    public float E;
    public org.telegram.ui.Components.q5 E0;
    public int F;
    public int F0;
    public int G;
    public PorterDuffColorFilter G0;
    public int H;
    public boolean H0;
    public boolean I;
    public Layout.Alignment I0;
    public float J;
    public boolean K;
    public Drawable L;
    public boolean M;
    public boolean N;
    public float O;
    public long P;
    public int Q;
    public Paint R;
    public Paint S;
    public Paint T;
    public int U;
    public int V;
    public int W;
    public float f22090a;
    public int f22091a0;
    public float f22092b;
    public int f22093b0;
    public StaticLayout f22094c;
    public int f22095c0;
    public StaticLayout d;
    public int f22096d0;
    public StaticLayout f22097e;
    public int f22098e0;
    public StaticLayout f22099f;
    public int f22100f0;
    public boolean f22101g0;
    public final TextPaint h;
    public boolean f22102h0;
    public boolean f22103i0;
    public boolean f22104j0;
    public boolean f22105k0;
    public boolean f22106l0;
    public Boolean m0;
    public int f22107n;
    public int f22108n0;
    public int f22109o0;
    public int f22110p0;
    public int f22111q0;
    public int f22112r;
    public int f22113r0;
    public CharSequence f22114s;
    public float f22115s0;
    public int f22116t0;
    public int f22117u0;
    public Drawable v;
    public final ArrayList f22118v0;
    public Drawable f22119w;
    public final Stack f22120w0;
    public Drawable f22121x;
    public final Path f22122x0;
    public Drawable f22123y;
    public boolean f22124y0;
    public boolean f22125z0;

    public l5(Context context) {
        super(context);
        this.f22107n = 51;
        this.f22112r = 1;
        this.E = 1.0f;
        this.F = AndroidUtilities.dp(4.0f);
        this.f22108n0 = 16;
        this.f22117u0 = 3;
        this.f22118v0 = new ArrayList();
        this.f22120w0 = new Stack();
        this.f22122x0 = new Path();
        this.F0 = 0;
        this.I0 = Layout.Alignment.ALIGN_NORMAL;
        this.h = new TextPaint(1);
        setImportantForAccessibility(1);
    }

    private Layout.Alignment getAlignment() {
        return this.I0;
    }

    public final void a(int i10) {
        int i11;
        StaticLayout staticLayout = this.f22094c;
        if (staticLayout == null) {
            return;
        }
        if (staticLayout.getLineCount() > 0) {
            this.f22093b0 = (int) Math.max(Math.ceil(this.f22094c.getLineWidth(0)), Math.ceil(this.f22094c.getLineRight(0) - this.f22094c.getLineLeft(0)));
            StaticLayout staticLayout2 = this.f22097e;
            boolean z4 = true;
            if (staticLayout2 != null) {
                this.f22096d0 = staticLayout2.getLineBottom(staticLayout2.getLineCount() - 1);
            } else if (this.f22112r > 1 && this.f22094c.getLineCount() > 0) {
                StaticLayout staticLayout3 = this.f22094c;
                this.f22096d0 = staticLayout3.getLineBottom(staticLayout3.getLineCount() - 1);
            } else {
                this.f22096d0 = this.f22094c.getLineBottom(0);
            }
            int i12 = this.f22107n & 7;
            if (i12 == 1) {
                this.W = ((i10 - this.f22093b0) / 2) - ((int) this.f22094c.getLineLeft(0));
            } else if (i12 == 3) {
                StaticLayout staticLayout4 = this.d;
                if (staticLayout4 != null) {
                    this.W = -((int) staticLayout4.getLineLeft(0));
                } else {
                    this.W = -((int) this.f22094c.getLineLeft(0));
                }
            } else if (this.f22094c.getLineLeft(0) == 0.0f) {
                StaticLayout staticLayout5 = this.d;
                if (staticLayout5 != null) {
                    this.W = (int) (i10 - staticLayout5.getLineWidth(0));
                } else {
                    this.W = i10 - this.f22093b0;
                }
            } else {
                this.W = -AndroidUtilities.dp(8.0f);
            }
            this.W = getPaddingLeft() + this.W;
            if (this.f22104j0) {
                Drawable drawable = this.f22119w;
                if (drawable != null && !this.f22103i0) {
                    i11 = (int) (drawable.getIntrinsicWidth() * this.E);
                } else {
                    i11 = 0;
                }
                Drawable drawable2 = this.f22121x;
                if (drawable2 != null && !this.f22103i0) {
                    i11 += (int) (drawable2.getIntrinsicWidth() * this.E);
                }
            } else {
                i11 = 0;
            }
            if (this.f22093b0 + i11 <= i10 - this.f22109o0) {
                z4 = false;
            }
            this.N = z4;
            b();
            StaticLayout staticLayout6 = this.f22097e;
            if (staticLayout6 != null && this.f22111q0 > 0) {
                this.f22115s0 = staticLayout6.getPrimaryHorizontal(0) - this.d.getPrimaryHorizontal(0);
            }
        }
        int i13 = this.C;
        if (i13 >= 0) {
            this.D = this.f22094c.getPrimaryHorizontal(i13);
        } else {
            this.D = 0.0f;
        }
    }

    public final void b() {
        int i10;
        if ((this.M && (this.N || this.O != 0.0f)) || this.f22105k0) {
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
        ArrayList arrayList = this.f22118v0;
        if (arrayList.isEmpty()) {
            return;
        }
        Path path = this.f22122x0;
        path.rewind();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            Rect bounds = ((jh.k) arrayList.get(i10)).getBounds();
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
        Stack stack = this.f22120w0;
        ArrayList arrayList = this.f22118v0;
        CharSequence charSequence4 = this.f22114s;
        this.C = -1;
        this.f22125z0 = false;
        if (charSequence4 != null) {
            try {
                Drawable drawable3 = this.v;
                if (drawable3 != null && !this.f22102h0) {
                    drawable3.getIntrinsicWidth();
                    i11 = (i10 - this.v.getIntrinsicWidth()) - this.F;
                } else {
                    i11 = i10;
                }
                if (!this.f22104j0) {
                    if (this.f22119w != null && !this.f22103i0) {
                        i12 = (int) (drawable.getIntrinsicWidth() * this.E);
                        i11 = (i11 - i12) - this.F;
                    } else {
                        i12 = 0;
                    }
                    if (this.f22121x != null && !this.f22103i0) {
                        i12 += (int) (drawable2.getIntrinsicWidth() * this.E);
                        i11 = (i11 - i12) - this.F;
                    }
                } else {
                    i12 = 0;
                }
                SpannableStringBuilder spannableStringBuilder = charSequence4;
                if (this.B != null) {
                    spannableStringBuilder = charSequence4;
                    if (this.f22123y != null) {
                        int indexOf = charSequence4.toString().indexOf(this.B);
                        this.C = indexOf;
                        if (indexOf >= 0) {
                            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence4);
                            org.telegram.ui.Cells.p2 p2Var = new org.telegram.ui.Cells.p2(this.f22123y.getIntrinsicWidth());
                            int i15 = this.C;
                            valueOf.setSpan(p2Var, i15, this.B.length() + i15, 0);
                            spannableStringBuilder = valueOf;
                        } else {
                            i11 = (i11 - this.f22123y.getIntrinsicWidth()) - this.F;
                            spannableStringBuilder = charSequence4;
                        }
                    }
                }
                CharSequence charSequence5 = spannableStringBuilder;
                boolean z4 = this.f22124y0;
                TextPaint textPaint = this.h;
                if (z4 && i12 != 0 && !this.f22103i0 && !charSequence5.equals(TextUtils.ellipsize(charSequence5, textPaint, i11, TextUtils.TruncateAt.END))) {
                    this.f22125z0 = true;
                    i11 = i11 + i12 + this.F;
                }
                int i16 = i11;
                if (this.I) {
                    if (!this.f22105k0) {
                        charSequence2 = TextUtils.ellipsize(charSequence5, textPaint, i16, TextUtils.TruncateAt.END);
                    } else {
                        charSequence2 = charSequence5;
                    }
                    if (!this.f22105k0 && !charSequence2.equals(charSequence5)) {
                        Layout.Alignment alignment = getAlignment();
                        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                        StaticLayout c3 = kw0.c(charSequence5, textPaint, i16, alignment, 0.0f, false, truncateAt, i16, this.f22117u0, false);
                        i14 = i16;
                        this.f22097e = c3;
                        if (c3 != null) {
                            int lineEnd = c3.getLineEnd(0);
                            int lineStart = this.f22097e.getLineStart(1);
                            CharSequence subSequence = charSequence5.subSequence(0, lineEnd);
                            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(charSequence5);
                            valueOf2.setSpan(new nz(false), 0, lineStart, 0);
                            if (lineEnd < charSequence2.length()) {
                                charSequence3 = charSequence2.subSequence(lineEnd, charSequence2.length());
                            } else {
                                charSequence3 = "…";
                            }
                            int length = charSequence2.length();
                            if (this.M) {
                                dp3 = AndroidUtilities.dp(2000.0f);
                            } else {
                                dp3 = i14 + AndroidUtilities.dp(8.0f);
                            }
                            this.d = new StaticLayout(charSequence2, 0, length, textPaint, dp3, getAlignment(), 1.0f, 0.0f, false);
                            int length2 = subSequence.length();
                            if (this.M) {
                                dp4 = AndroidUtilities.dp(2000.0f);
                            } else {
                                dp4 = i14 + AndroidUtilities.dp(8.0f);
                            }
                            StaticLayout staticLayout = new StaticLayout(subSequence, 0, length2, textPaint, dp4, getAlignment(), 1.0f, 0.0f, false);
                            this.f22094c = staticLayout;
                            String str = charSequence3;
                            if (staticLayout.getLineLeft(0) != 0.0f) {
                                str = "\u200f" + ((Object) charSequence3);
                            }
                            CharSequence charSequence6 = str;
                            int length3 = charSequence6.length();
                            if (this.M) {
                                dp5 = AndroidUtilities.dp(2000.0f);
                            } else {
                                dp5 = i14 + AndroidUtilities.dp(8.0f);
                            }
                            this.f22099f = new StaticLayout(charSequence6, 0, length3, textPaint, dp5, getAlignment(), 1.0f, 0.0f, false);
                            this.f22097e = kw0.c(valueOf2, textPaint, i14 + AndroidUtilities.dp(8.0f) + this.f22111q0, getAlignment(), 0.0f, false, truncateAt, i14 + this.f22111q0, this.f22117u0, false);
                        }
                    } else {
                        i14 = i16;
                        CharSequence charSequence7 = charSequence2;
                        int length4 = charSequence7.length();
                        if (!this.M && !this.f22105k0) {
                            dp2 = i14 + AndroidUtilities.dp(8.0f);
                            this.f22094c = new StaticLayout(charSequence7, 0, length4, textPaint, dp2, getAlignment(), 1.0f, 0.0f, false);
                            this.f22097e = null;
                            this.f22099f = null;
                            this.d = null;
                        }
                        dp2 = AndroidUtilities.dp(2000.0f);
                        this.f22094c = new StaticLayout(charSequence7, 0, length4, textPaint, dp2, getAlignment(), 1.0f, 0.0f, false);
                        this.f22097e = null;
                        this.f22099f = null;
                        this.d = null;
                    }
                    i13 = i14;
                } else if (this.f22112r > 1) {
                    StaticLayout c10 = kw0.c(charSequence5, textPaint, i16, getAlignment(), 0.0f, false, TextUtils.TruncateAt.END, i16, this.f22112r, false);
                    i13 = i16;
                    this.f22094c = c10;
                } else {
                    i13 = i16;
                    if (!this.M && !this.f22105k0) {
                        charSequence = TextUtils.ellipsize(charSequence5, textPaint, i13, TextUtils.TruncateAt.END);
                        int length5 = charSequence.length();
                        if (!this.M && !this.f22105k0) {
                            dp = AndroidUtilities.dp(8.0f) + i13;
                            this.f22094c = new StaticLayout(charSequence, 0, length5, textPaint, dp, getAlignment(), 1.0f, 0.0f, false);
                        }
                        dp = AndroidUtilities.dp(2000.0f);
                        this.f22094c = new StaticLayout(charSequence, 0, length5, textPaint, dp, getAlignment(), 1.0f, 0.0f, false);
                    }
                    charSequence = charSequence5;
                    int length52 = charSequence.length();
                    if (!this.M) {
                        dp = AndroidUtilities.dp(8.0f) + i13;
                        this.f22094c = new StaticLayout(charSequence, 0, length52, textPaint, dp, getAlignment(), 1.0f, 0.0f, false);
                    }
                    dp = AndroidUtilities.dp(2000.0f);
                    this.f22094c = new StaticLayout(charSequence, 0, length52, textPaint, dp, getAlignment(), 1.0f, 0.0f, false);
                }
                stack.addAll(arrayList);
                arrayList.clear();
                StaticLayout staticLayout2 = this.f22094c;
                if (staticLayout2 != null && (staticLayout2.getText() instanceof Spannable)) {
                    jh.k.b(this, this.f22094c, -2, -2, stack, arrayList);
                }
                a(i13);
            } catch (Exception unused) {
            }
        } else {
            this.f22094c = null;
            this.f22093b0 = 0;
            this.f22096d0 = 0;
        }
        org.telegram.ui.Components.u5.release(this, this.E0);
        if (this.H0) {
            this.E0 = org.telegram.ui.Components.u5.update(this.F0, this, this.E0, this.f22094c);
        }
        invalidate();
    }

    public final void e(Canvas canvas) {
        float f10 = this.J;
        int i10 = 0;
        ArrayList arrayList = this.f22118v0;
        if (f10 > 0.0f && this.f22113r0 != 0) {
            canvas.save();
            float f11 = this.J;
            canvas.translate((this.f22115s0 * f11) + ((-this.f22113r0) * f11), 0.0f);
            float f12 = this.f22090a;
            float f13 = this.J;
            this.f22090a = e2.c.A(this.f22115s0, f13, (-this.f22113r0) * f13, f12);
            canvas.save();
            c(canvas);
            org.telegram.ui.Components.q5 q5Var = this.E0;
            if (q5Var != null) {
                q5Var.a();
            }
            this.f22094c.draw(canvas);
            canvas.restore();
            org.telegram.ui.Components.u5.drawAnimatedEmojis(canvas, this.f22094c, this.E0, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.G0);
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((jh.k) obj).draw(canvas);
            }
            canvas.restore();
            return;
        }
        canvas.save();
        c(canvas);
        org.telegram.ui.Components.q5 q5Var2 = this.E0;
        if (q5Var2 != null) {
            q5Var2.a();
        }
        this.f22094c.draw(canvas);
        canvas.restore();
        org.telegram.ui.Components.u5.drawAnimatedEmojis(canvas, this.f22094c, this.E0, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.G0);
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            ((jh.k) obj2).draw(canvas);
        }
    }

    public final boolean f() {
        if (this.f22101g0 && getMeasuredHeight() != 0 && !this.I) {
            d(((getMaxTextWidth() - getPaddingLeft()) - getPaddingRight()) - this.f22116t0);
            if ((this.f22107n & 112) == 16) {
                this.f22091a0 = (getMeasuredHeight() - this.f22096d0) / 2;
                return true;
            }
            this.f22091a0 = getPaddingTop();
            return true;
        }
        requestLayout();
        return true;
    }

    public final void g(mw0 mw0Var, String str) {
        Drawable drawable = this.f22123y;
        if (drawable == mw0Var) {
            return;
        }
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f22123y = mw0Var;
        if (mw0Var != null) {
            mw0Var.setCallback(this);
        }
        f();
        this.B = str;
    }

    @Override
    public Drawable getBackground() {
        Drawable drawable = this.L;
        if (drawable != null) {
            return drawable;
        }
        return super.getBackground();
    }

    public float getExactWidth() {
        int i10;
        float measureText = getPaint().measureText(getText().toString()) + getSideDrawablesSize();
        if (this.v == null && this.f22119w == null && this.f22121x == null) {
            i10 = 0;
        } else {
            i10 = this.F;
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
        float f10 = exactWidth + i10;
        Drawable drawable2 = this.f22119w;
        if (drawable2 != null) {
            i11 = drawable2.getIntrinsicWidth();
        } else {
            i11 = 0;
        }
        float f11 = f10 + i11;
        Drawable drawable3 = this.f22121x;
        if (drawable3 != null) {
            i12 = drawable3.getIntrinsicWidth();
        }
        return f11 + i12;
    }

    public float getFullAlpha() {
        return this.J;
    }

    public Layout getLayout() {
        return this.f22094c;
    }

    public float getLayoutX() {
        return this.f22090a;
    }

    public float getLayoutY() {
        return this.f22092b;
    }

    public Drawable getLeftDrawable() {
        return this.v;
    }

    public int getLineCount() {
        int i10;
        StaticLayout staticLayout = this.f22094c;
        if (staticLayout != null) {
            i10 = staticLayout.getLineCount();
        } else {
            i10 = 0;
        }
        StaticLayout staticLayout2 = this.f22097e;
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
        if (this.f22103i0 && (drawable2 = this.f22119w) != null) {
            i10 = drawable2.getIntrinsicWidth() + this.F;
        } else {
            i10 = 0;
        }
        int i12 = measuredWidth - i10;
        if (this.f22103i0 && (drawable = this.f22121x) != null) {
            i11 = this.F + drawable.getIntrinsicWidth();
        }
        return i12 - i11;
    }

    public TextPaint getPaint() {
        return this.h;
    }

    public Drawable getRightDrawable() {
        return this.f22119w;
    }

    public Drawable getRightDrawable2() {
        return this.f22121x;
    }

    public boolean getRightDrawableOutside() {
        return this.f22103i0;
    }

    public int getRightDrawableWidth() {
        Drawable drawable = this.f22119w;
        if (drawable == null) {
            return 0;
        }
        return (int) ((drawable.getIntrinsicWidth() * this.E) + this.F);
    }

    public int getRightDrawableX() {
        return this.f22098e0;
    }

    public int getRightDrawableY() {
        return this.f22100f0;
    }

    public int getSideDrawablesSize() {
        int i10;
        Drawable drawable = this.v;
        if (drawable != null) {
            i10 = drawable.getIntrinsicWidth() + this.F;
        } else {
            i10 = 0;
        }
        Drawable drawable2 = this.f22119w;
        if (drawable2 != null) {
            i10 += ((int) (drawable2.getIntrinsicWidth() * this.E)) + this.F;
        }
        Drawable drawable3 = this.f22121x;
        if (drawable3 != null) {
            return ((int) (drawable3.getIntrinsicWidth() * this.E)) + this.F + i10;
        }
        return i10;
    }

    public CharSequence getText() {
        CharSequence charSequence = this.f22114s;
        if (charSequence == null) {
            return "";
        }
        return charSequence;
    }

    public int getTextColor() {
        return this.h.getColor();
    }

    public int getTextHeight() {
        return this.f22096d0;
    }

    public TextPaint getTextPaint() {
        return this.h;
    }

    public int getTextStartX() {
        int i10 = 0;
        if (this.f22094c == null) {
            return 0;
        }
        Drawable drawable = this.v;
        if (drawable != null && (this.f22107n & 7) == 3) {
            i10 = this.F + drawable.getIntrinsicWidth();
        }
        Drawable drawable2 = this.f22123y;
        if (drawable2 != null && this.C < 0 && (this.f22107n & 7) == 3) {
            i10 += drawable2.getIntrinsicWidth() + this.F;
        }
        return ((int) getX()) + this.W + i10;
    }

    public int getTextStartY() {
        if (this.f22094c == null) {
            return 0;
        }
        return (int) getY();
    }

    public int getTextWidth() {
        int i10;
        int i11 = this.f22093b0;
        int i12 = 0;
        if (this.f22104j0) {
            Drawable drawable = this.f22119w;
            if (drawable != null) {
                i10 = (int) (drawable.getIntrinsicWidth() * this.E);
            } else {
                i10 = 0;
            }
            Drawable drawable2 = this.f22121x;
            if (drawable2 != null) {
                i12 = (int) (drawable2.getIntrinsicWidth() * this.E);
            }
            i12 += i10;
        }
        return i11 + i12;
    }

    public final void h(int i10, int i11) {
        if (this.f22111q0 == i10 && this.f22113r0 == i11) {
            return;
        }
        this.f22111q0 = i10;
        this.f22113r0 = i11;
        d(((getMaxTextWidth() - getPaddingLeft()) - getPaddingRight()) - this.f22116t0);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final boolean i(Drawable drawable) {
        Drawable drawable2 = this.f22119w;
        if (drawable2 == drawable) {
            return false;
        }
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f22119w = drawable;
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
        Drawable drawable3 = this.f22119w;
        if (drawable == drawable3) {
            invalidate(drawable3.getBounds());
            return;
        }
        Drawable drawable4 = this.f22121x;
        if (drawable == drawable4) {
            invalidate(drawable4.getBounds());
            return;
        }
        Drawable drawable5 = this.f22123y;
        if (drawable == drawable5) {
            invalidate(drawable5.getBounds());
        }
    }

    public final boolean j(Drawable drawable) {
        Drawable drawable2 = this.f22121x;
        if (drawable2 == drawable) {
            return false;
        }
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f22121x = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        f();
        return true;
    }

    public boolean k(CharSequence charSequence) {
        return l(charSequence, false);
    }

    public boolean l(CharSequence charSequence, boolean z4) {
        CharSequence charSequence2 = this.f22114s;
        if (charSequence2 != null || charSequence != null) {
            if (!z4 && charSequence2 != null && charSequence2.equals(charSequence)) {
                return false;
            }
            this.f22114s = charSequence;
            this.Q = 500;
            f();
            return true;
        }
        return false;
    }

    public final void m() {
        boolean z4;
        if ((this.R == null || this.S == null) && this.M) {
            Paint paint = new Paint();
            this.R = paint;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(6.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, tileMode));
            Paint paint2 = this.R;
            PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
            paint2.setXfermode(new PorterDuffXfermode(mode));
            Paint paint3 = new Paint();
            this.S = paint3;
            paint3.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(6.0f), 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
            this.S.setXfermode(new PorterDuffXfermode(mode));
        }
        Boolean bool = this.m0;
        if (bool != null) {
            z4 = bool.booleanValue();
        } else {
            z4 = false;
        }
        if ((this.T == null || this.U != AndroidUtilities.dp(this.f22108n0) || this.f22106l0 != z4) && this.f22105k0) {
            if (this.T == null) {
                this.T = new Paint();
            }
            this.f22106l0 = z4;
            if (z4) {
                Paint paint4 = this.T;
                int dp = AndroidUtilities.dp(this.f22108n0);
                this.U = dp;
                paint4.setShader(new LinearGradient(0.0f, 0.0f, dp, 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            } else {
                Paint paint5 = this.T;
                int dp2 = AndroidUtilities.dp(this.f22108n0);
                this.U = dp2;
                paint5.setShader(new LinearGradient(0.0f, 0.0f, dp2, 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            }
            this.T.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.H0 = true;
        this.E0 = org.telegram.ui.Components.u5.update(this.F0, this, this.E0, this.f22094c);
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.H0 = false;
        org.telegram.ui.Components.u5.release(this, this.E0);
        this.f22101g0 = false;
    }

    @Override
    public void onDraw(Canvas canvas) {
        boolean z4;
        int i10;
        Drawable drawable;
        float f10;
        float f11;
        int i11;
        Drawable drawable2;
        int d;
        int i12;
        int i13;
        int d10;
        int i14;
        int d11;
        int i15;
        float f12;
        float f13;
        float f14;
        Drawable drawable3;
        float f15;
        boolean z10;
        float f16;
        Drawable drawable4;
        int d12;
        int i16;
        int d13;
        int i17;
        float f17;
        float f18;
        Drawable drawable5;
        Drawable drawable6;
        Drawable drawable7;
        int d14;
        int i18;
        int d15;
        int i19;
        int intrinsicHeight;
        Drawable drawable8;
        int d16;
        int i20;
        int d17;
        int i21;
        int intrinsicHeight2;
        int intrinsicHeight3;
        super.onDraw(canvas);
        this.f22090a = 0.0f;
        this.f22092b = 0.0f;
        if (this.M && (this.N || this.O != 0.0f)) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f22095c0 = this.f22093b0;
        Drawable drawable9 = this.v;
        if (drawable9 != null && !this.f22102h0) {
            int i22 = (int) (-this.O);
            int i23 = this.f22107n;
            if ((i23 & 7) == 1) {
                i22 += this.W;
            }
            if ((i23 & 112) == 16) {
                intrinsicHeight3 = ((getMeasuredHeight() - this.v.getIntrinsicHeight()) / 2) + this.G;
            } else {
                intrinsicHeight3 = this.G + ((this.f22096d0 - this.v.getIntrinsicHeight()) / 2) + getPaddingTop();
            }
            Drawable drawable10 = this.v;
            drawable10.setBounds(i22, intrinsicHeight3, drawable10.getIntrinsicWidth() + i22, this.v.getIntrinsicHeight() + intrinsicHeight3);
            this.v.draw(canvas);
            int i24 = this.f22107n & 7;
            if (i24 != 3 && i24 != 1) {
                i10 = 0;
            } else {
                i10 = this.v.getIntrinsicWidth() + this.F;
            }
            this.f22095c0 = this.v.getIntrinsicWidth() + this.F + this.f22095c0;
        } else if (this.f22102h0 && drawable9 != null) {
            i10 = this.F + drawable9.getIntrinsicWidth();
        } else {
            i10 = 0;
        }
        Drawable drawable11 = this.f22123y;
        if (drawable11 != null && this.B != null) {
            int i25 = (int) ((-this.O) + this.D);
            int i26 = this.f22107n;
            if ((i26 & 7) == 1) {
                i25 += this.W;
            }
            if ((i26 & 112) == 16) {
                intrinsicHeight2 = ((getMeasuredHeight() - this.f22123y.getIntrinsicHeight()) / 2) + this.G;
            } else {
                intrinsicHeight2 = this.G + ((this.f22096d0 - drawable11.getIntrinsicHeight()) / 2);
            }
            Drawable drawable12 = this.f22123y;
            drawable12.setBounds(i25, intrinsicHeight2, drawable12.getIntrinsicWidth() + i25, this.f22123y.getIntrinsicHeight() + intrinsicHeight2);
            this.f22123y.draw(canvas);
            if (this.C < 0) {
                int i27 = this.f22107n & 7;
                if (i27 == 3 || i27 == 1) {
                    i10 += this.f22123y.getIntrinsicWidth() + this.F;
                }
                this.f22095c0 = this.f22123y.getIntrinsicWidth() + this.F + this.f22095c0;
            }
        }
        int i28 = i10;
        if (this.f22119w != null && !this.f22125z0 && this.E > 0.0f && !this.f22103i0 && !this.f22104j0) {
            int i29 = this.f22093b0 + i28 + this.F + ((int) (-this.O));
            int i30 = this.f22107n & 7;
            if (i30 == 1 || i30 == 5) {
                i29 += this.W;
            }
            int intrinsicWidth = (int) (drawable.getIntrinsicWidth() * this.E);
            int intrinsicHeight4 = (int) (this.f22119w.getIntrinsicHeight() * this.E);
            if ((this.f22107n & 112) == 16) {
                d17 = (getMeasuredHeight() - intrinsicHeight4) / 2;
                i21 = this.H;
            } else {
                d17 = l.d.d(this.f22096d0, intrinsicHeight4, 2, getPaddingTop());
                i21 = this.H;
            }
            int i31 = d17 + i21;
            f10 = 0.0f;
            this.f22119w.setBounds(i29, i31, i29 + intrinsicWidth, i31 + intrinsicHeight4);
            this.f22098e0 = i29 + (intrinsicWidth >> 1);
            this.f22100f0 = i31 + (intrinsicHeight4 >> 1);
            this.f22119w.draw(canvas);
            this.f22095c0 = this.F + intrinsicWidth + this.f22095c0;
        } else {
            f10 = 0.0f;
        }
        if (this.f22121x != null && !this.f22125z0 && this.E > f10 && !this.f22103i0 && !this.f22104j0) {
            int i32 = this.f22093b0 + i28 + this.F + ((int) (-this.O));
            if (this.f22119w != null) {
                i32 += ((int) (drawable8.getIntrinsicWidth() * this.E)) + this.F;
            }
            int i33 = this.f22107n & 7;
            if (i33 == 1 || i33 == 5) {
                i32 += this.W;
            }
            int intrinsicWidth2 = (int) (this.f22121x.getIntrinsicWidth() * this.E);
            int intrinsicHeight5 = (int) (this.f22121x.getIntrinsicHeight() * this.E);
            if ((this.f22107n & 112) == 16) {
                d16 = (getMeasuredHeight() - intrinsicHeight5) / 2;
                i20 = this.H;
            } else {
                d16 = l.d.d(this.f22096d0, intrinsicHeight5, 2, getPaddingTop());
                i20 = this.H;
            }
            int i34 = d16 + i20;
            this.f22121x.setBounds(i32, i34, i32 + intrinsicWidth2, intrinsicHeight5 + i34);
            this.f22121x.draw(canvas);
            this.f22095c0 = this.F + intrinsicWidth2 + this.f22095c0;
        }
        int dp = AndroidUtilities.dp(16.0f) + this.f22095c0;
        float f19 = this.O;
        if (f19 != f10) {
            if (this.v != null && !this.f22102h0) {
                int i35 = ((int) (-f19)) + dp;
                if ((this.f22107n & 112) == 16) {
                    intrinsicHeight = ((getMeasuredHeight() - this.v.getIntrinsicHeight()) / 2) + this.G;
                } else {
                    intrinsicHeight = this.G + ((this.f22096d0 - this.v.getIntrinsicHeight()) / 2) + getPaddingTop();
                }
                Drawable drawable13 = this.v;
                drawable13.setBounds(i35, intrinsicHeight, drawable13.getIntrinsicWidth() + i35, this.v.getIntrinsicHeight() + intrinsicHeight);
                this.v.draw(canvas);
            }
            if (this.f22119w != null && !this.f22103i0) {
                int intrinsicWidth3 = (int) (drawable5.getIntrinsicWidth() * this.E);
                int intrinsicHeight6 = (int) (this.f22119w.getIntrinsicHeight() * this.E);
                int i36 = this.f22093b0 + i28 + this.F + ((int) (-this.O)) + dp;
                if ((this.f22107n & 112) == 16) {
                    d15 = (getMeasuredHeight() - intrinsicHeight6) / 2;
                    i19 = this.H;
                } else {
                    d15 = l.d.d(this.f22096d0, intrinsicHeight6, 2, getPaddingTop());
                    i19 = this.H;
                }
                int i37 = d15 + i19;
                f11 = 16.0f;
                this.f22119w.setBounds(i36, i37, i36 + intrinsicWidth3, i37 + intrinsicHeight6);
                this.f22098e0 = i36 + (intrinsicWidth3 >> 1);
                this.f22100f0 = i37 + (intrinsicHeight6 >> 1);
                this.f22119w.draw(canvas);
            } else {
                f11 = 16.0f;
            }
            if (this.f22121x != null && !this.f22103i0) {
                int intrinsicWidth4 = (int) (drawable6.getIntrinsicWidth() * this.E);
                int intrinsicHeight7 = (int) (this.f22121x.getIntrinsicHeight() * this.E);
                int i38 = this.f22093b0 + i28 + this.F + ((int) (-this.O)) + dp;
                if (this.f22119w != null) {
                    i38 += ((int) (drawable7.getIntrinsicWidth() * this.E)) + this.F;
                }
                if ((this.f22107n & 112) == 16) {
                    d14 = (getMeasuredHeight() - intrinsicHeight7) / 2;
                    i18 = this.H;
                } else {
                    d14 = l.d.d(this.f22096d0, intrinsicHeight7, 2, getPaddingTop());
                    i18 = this.H;
                }
                int i39 = d14 + i18;
                this.f22121x.setBounds(i38, i39, intrinsicWidth4 + i38, intrinsicHeight7 + i39);
                this.f22121x.draw(canvas);
            }
        } else {
            f11 = 16.0f;
        }
        if (this.f22094c != null) {
            if (this.f22102h0 || this.f22103i0 || this.f22105k0 || this.f22109o0 > 0) {
                canvas.save();
                int maxTextWidth = getMaxTextWidth() - this.f22109o0;
                Drawable drawable14 = this.f22119w;
                if (drawable14 != null && !(drawable14 instanceof org.telegram.ui.Components.j5) && this.f22103i0) {
                    f12 = 2.0f;
                } else {
                    f12 = 0.0f;
                }
                canvas.clipRect(i28, 0, maxTextWidth - AndroidUtilities.dp(f12), getMeasuredHeight());
            }
            Emoji.emojiDrawingUseAlpha = false;
            if (this.L != null) {
                int i40 = this.f22093b0;
                int i41 = (i40 / 2) + ((int) ((this.W + i28) - this.O));
                int max = Math.max(getPaddingRight() + getPaddingLeft() + i40, this.f22110p0);
                int i42 = i41 - (max / 2);
                this.L.setBounds(i42, 0, max + i42, getMeasuredHeight());
                this.L.draw(canvas);
            }
            if (this.W + i28 != 0 || this.f22091a0 != 0 || this.O != f10) {
                canvas.save();
                canvas.translate((this.W + i28) - this.O, this.f22091a0);
                this.f22090a = ((this.W + i28) - this.O) + this.f22090a;
                this.f22092b += this.f22091a0;
            }
            e(canvas);
            StaticLayout staticLayout = this.f22099f;
            TextPaint textPaint = this.h;
            if (staticLayout != null && this.J < 1.0f) {
                int alpha = textPaint.getAlpha();
                textPaint.setAlpha((int) ((1.0f - this.J) * 255.0f));
                canvas.save();
                if (this.f22099f.getText().length() == 1) {
                    if (this.f22117u0 == 1) {
                        f18 = 0.5f;
                    } else {
                        f18 = 4.0f;
                    }
                    f17 = AndroidUtilities.dp(f18);
                } else {
                    f17 = 0.0f;
                }
                if (this.f22094c.getLineLeft(0) != f10) {
                    canvas.translate((-this.f22094c.getLineWidth(0)) + f17, 0.0f);
                    f13 = 0.0f;
                } else {
                    f13 = 0.0f;
                    canvas.translate(this.f22094c.getLineWidth(0) - f17, 0.0f);
                }
                float f20 = this.J;
                canvas.translate((this.f22115s0 * f20) + ((-this.f22113r0) * f20), f13);
                this.f22099f.draw(canvas);
                canvas.restore();
                textPaint.setAlpha(alpha);
            } else {
                f13 = 0.0f;
            }
            if (this.f22097e != null && this.J > f13) {
                int alpha2 = textPaint.getAlpha();
                textPaint.setAlpha((int) (this.J * 255.0f));
                float f21 = this.J;
                float f22 = this.f22115s0;
                float f23 = ((f21 * f22) + ((-this.f22113r0) * f21)) - f22;
                f14 = 0.0f;
                canvas.translate(f23, 0.0f);
                this.f22097e.draw(canvas);
                textPaint.setAlpha(alpha2);
            } else {
                f14 = 0.0f;
            }
            if (this.O != f14) {
                canvas.translate(dp, f14);
                e(canvas);
            }
            if (this.W + i28 != 0 || this.f22091a0 != 0 || this.O != f14) {
                canvas.restore();
            }
            if (this.f22119w != null && !this.f22125z0 && this.E > 0.0f && !this.f22103i0 && this.f22104j0) {
                int i43 = this.f22093b0 + i28 + this.F + ((int) (-this.O));
                int i44 = this.f22107n & 7;
                if (i44 == 1 || i44 == 5) {
                    i43 += this.W;
                }
                int intrinsicWidth5 = (int) (drawable3.getIntrinsicWidth() * this.E);
                int intrinsicHeight8 = (int) (this.f22119w.getIntrinsicHeight() * this.E);
                if ((this.f22107n & 112) == 16) {
                    d13 = (getMeasuredHeight() - intrinsicHeight8) / 2;
                    i17 = this.H;
                } else {
                    d13 = l.d.d(this.f22096d0, intrinsicHeight8, 2, getPaddingTop());
                    i17 = this.H;
                }
                int i45 = d13 + i17;
                this.f22119w.setBounds(i43, i45, i43 + intrinsicWidth5, i45 + intrinsicHeight8);
                this.f22098e0 = i43 + (intrinsicWidth5 >> 1);
                this.f22100f0 = i45 + (intrinsicHeight8 >> 1);
                this.f22119w.draw(canvas);
                this.f22095c0 = this.F + intrinsicWidth5 + this.f22095c0;
            }
            if (this.f22121x != null && !this.f22125z0 && this.E > 0.0f && !this.f22103i0 && this.f22104j0) {
                int i46 = this.f22093b0 + i28 + this.F + ((int) (-this.O));
                if (this.f22119w != null) {
                    i46 += ((int) (drawable4.getIntrinsicWidth() * this.E)) + this.F;
                }
                int i47 = this.f22107n & 7;
                if (i47 == 1 || i47 == 5) {
                    i46 += this.W;
                }
                int intrinsicWidth6 = (int) (this.f22121x.getIntrinsicWidth() * this.E);
                int intrinsicHeight9 = (int) (this.f22121x.getIntrinsicHeight() * this.E);
                if ((this.f22107n & 112) == 16) {
                    d12 = (getMeasuredHeight() - intrinsicHeight9) / 2;
                    i16 = this.H;
                } else {
                    d12 = l.d.d(this.f22096d0, intrinsicHeight9, 2, getPaddingTop());
                    i16 = this.H;
                }
                int i48 = d12 + i16;
                this.f22121x.setBounds(i46, i48, i46 + intrinsicWidth6, intrinsicHeight9 + i48);
                this.f22121x.draw(canvas);
                this.f22095c0 = this.F + intrinsicWidth6 + this.f22095c0;
            }
            if (z4) {
                if (this.O < AndroidUtilities.dp(10.0f)) {
                    this.R.setAlpha((int) ((this.O / AndroidUtilities.dp(10.0f)) * 255.0f));
                } else {
                    if (this.O > (AndroidUtilities.dp(f11) + this.f22095c0) - AndroidUtilities.dp(10.0f)) {
                        this.R.setAlpha((int) org.telegram.ui.b.c(this.O - ((AndroidUtilities.dp(f11) + this.f22095c0) - AndroidUtilities.dp(10.0f)), AndroidUtilities.dp(10.0f), 1.0f, 255.0f));
                    } else {
                        this.R.setAlpha(255);
                    }
                }
                canvas.drawRect(i28, 0.0f, AndroidUtilities.dp(6.0f) + i28, getMeasuredHeight(), this.R);
                canvas.save();
                canvas.translate((getMaxTextWidth() - this.f22109o0) - AndroidUtilities.dp(6.0f), 0.0f);
                canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(6.0f), getMeasuredHeight(), this.S);
                canvas.restore();
            } else if (this.f22105k0 && this.N && this.T != null) {
                canvas.save();
                m();
                if (!this.f22106l0) {
                    int maxTextWidth2 = (getMaxTextWidth() - this.f22109o0) - this.U;
                    Drawable drawable15 = this.f22119w;
                    if (drawable15 != null && !(drawable15 instanceof org.telegram.ui.Components.j5) && this.f22103i0) {
                        f15 = 2.0f;
                    } else {
                        f15 = 0.0f;
                    }
                    canvas.translate(maxTextWidth2 - AndroidUtilities.dp(f15), 0.0f);
                }
                canvas.drawRect(i28, 0.0f, this.U, getMeasuredHeight(), this.T);
                canvas.restore();
            }
            if (!this.M || (!this.N && this.O == 0.0f)) {
                z10 = true;
            } else {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = elapsedRealtime - this.P;
                if (j10 > 17) {
                    j10 = 17;
                }
                int i49 = this.Q;
                if (i49 > 0) {
                    this.Q = (int) (i49 - j10);
                    z10 = true;
                } else {
                    int dp2 = AndroidUtilities.dp(f11) + this.f22095c0;
                    if (this.O < AndroidUtilities.dp(100.0f)) {
                        f16 = w.c.c(this.O, AndroidUtilities.dp(100.0f), 20.0f, 30.0f);
                        z10 = true;
                    } else {
                        z10 = true;
                        if (this.O >= dp2 - AndroidUtilities.dp(100.0f)) {
                            f16 = org.telegram.messenger.y3.A(this.O - (dp2 - AndroidUtilities.dp(100.0f)), AndroidUtilities.dp(100.0f), 20.0f, 50.0f);
                        } else {
                            f16 = 50.0f;
                        }
                    }
                    float dp3 = ((((float) j10) / 1000.0f) * AndroidUtilities.dp(f16)) + this.O;
                    this.O = dp3;
                    this.P = elapsedRealtime;
                    if (dp3 > dp2) {
                        this.O = 0.0f;
                        this.Q = 500;
                    }
                    b();
                }
                invalidate();
            }
            Emoji.emojiDrawingUseAlpha = z10;
            if (this.f22102h0 || this.f22103i0 || this.f22105k0 || this.f22109o0 > 0) {
                canvas.restore();
            }
        }
        Drawable drawable16 = this.v;
        if (drawable16 != null && this.f22102h0) {
            int intrinsicWidth7 = drawable16.getIntrinsicWidth();
            int intrinsicHeight10 = this.v.getIntrinsicHeight();
            if ((this.f22107n & 112) == 16) {
                d11 = (getMeasuredHeight() - intrinsicHeight10) / 2;
                i15 = this.G;
            } else {
                d11 = l.d.d(this.f22096d0, intrinsicHeight10, 2, getPaddingTop());
                i15 = this.G;
            }
            int i50 = d11 + i15;
            this.v.setBounds(0, i50, intrinsicWidth7, intrinsicHeight10 + i50);
            this.v.draw(canvas);
        }
        if (this.f22119w != null && this.f22103i0) {
            int i51 = this.f22093b0 + i28 + this.F;
            float f24 = this.O;
            if (f24 == 0.0f) {
                i13 = -dp;
            } else {
                i13 = (int) (-f24);
            }
            int min = Math.min(i51 + i13 + dp, (getMaxTextWidth() - this.f22109o0) + this.F);
            int intrinsicWidth8 = (int) (this.f22119w.getIntrinsicWidth() * this.E);
            int intrinsicHeight11 = (int) (this.f22119w.getIntrinsicHeight() * this.E);
            if ((this.f22107n & 112) == 16) {
                d10 = (getMeasuredHeight() - intrinsicHeight11) / 2;
                i14 = this.H;
            } else {
                d10 = l.d.d(this.f22096d0, intrinsicHeight11, 2, getPaddingTop());
                i14 = this.H;
            }
            int i52 = d10 + i14;
            this.f22119w.setBounds(min, i52, min + intrinsicWidth8, i52 + intrinsicHeight11);
            this.f22098e0 = min + (intrinsicWidth8 >> 1);
            this.f22100f0 = i52 + (intrinsicHeight11 >> 1);
            this.f22119w.draw(canvas);
        }
        if (this.f22121x != null && this.f22103i0) {
            int i53 = i28 + this.f22093b0 + this.F;
            float f25 = this.O;
            if (f25 == 0.0f) {
                i11 = -dp;
            } else {
                i11 = (int) (-f25);
            }
            int min2 = Math.min(i53 + i11 + dp, (getMaxTextWidth() - this.f22109o0) + this.F);
            if (this.f22119w != null) {
                min2 += ((int) (drawable2.getIntrinsicWidth() * this.E)) + this.F;
            }
            int intrinsicWidth9 = (int) (this.f22121x.getIntrinsicWidth() * this.E);
            int intrinsicHeight12 = (int) (this.f22121x.getIntrinsicHeight() * this.E);
            if ((this.f22107n & 112) == 16) {
                d = (getMeasuredHeight() - intrinsicHeight12) / 2;
                i12 = this.H;
            } else {
                d = l.d.d(this.f22096d0, intrinsicHeight12, 2, getPaddingTop());
                i12 = this.H;
            }
            int i54 = d + i12;
            this.f22121x.setBounds(min2, i54, intrinsicWidth9 + min2, intrinsicHeight12 + i54);
            this.f22121x.draw(canvas);
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setVisibleToUser(true);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setText(this.f22114s);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        this.f22101g0 = true;
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
        int i18 = this.V;
        int i19 = AndroidUtilities.displaySize.x;
        if (i18 != i19) {
            this.V = i19;
            this.O = 0.0f;
            this.Q = 500;
            b();
        }
        int paddingLeft = ((size - getPaddingLeft()) - getPaddingRight()) - this.f22116t0;
        if (this.f22102h0 && (drawable6 = this.v) != null) {
            i12 = drawable6.getIntrinsicWidth() + this.F;
        } else {
            i12 = 0;
        }
        int i20 = paddingLeft - i12;
        if (this.f22103i0 && (drawable5 = this.f22119w) != null) {
            i13 = drawable5.getIntrinsicWidth() + this.F;
        } else {
            i13 = 0;
        }
        int i21 = i20 - i13;
        if (this.f22103i0 && (drawable4 = this.f22121x) != null) {
            i14 = drawable4.getIntrinsicWidth() + this.F;
        } else {
            i14 = 0;
        }
        d(i21 - i14);
        if (View.MeasureSpec.getMode(i11) != 1073741824) {
            size2 = getPaddingBottom() + getPaddingTop() + this.f22096d0;
        }
        if (this.K) {
            int paddingRight = getPaddingRight() + getPaddingLeft() + this.f22093b0 + this.f22116t0;
            if (this.f22102h0 && (drawable3 = this.v) != null) {
                i15 = drawable3.getIntrinsicWidth() + this.F;
            } else {
                i15 = 0;
            }
            int i22 = paddingRight + i15;
            if (this.f22103i0 && (drawable2 = this.f22119w) != null) {
                i16 = drawable2.getIntrinsicWidth() + this.F;
            } else {
                i16 = 0;
            }
            int i23 = i22 + i16;
            if (this.f22103i0 && (drawable = this.f22121x) != null) {
                i17 = drawable.getIntrinsicWidth() + this.F;
            } else {
                i17 = 0;
            }
            size = Math.max(Math.min(size, i23 + i17), 0);
        }
        setMeasuredDimension(size, size2);
        if ((this.f22107n & 112) == 16) {
            this.f22091a0 = l.d.d((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), this.f22096d0, 2, getPaddingTop());
        } else {
            this.f22091a0 = getPaddingTop();
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.A0 != null && this.f22119w != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(this.f22098e0 - AndroidUtilities.dp(16.0f), this.f22100f0 - AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f) + this.f22098e0, AndroidUtilities.dp(16.0f) + this.f22100f0);
            if (motionEvent.getAction() == 0 && rectF.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                this.B0 = true;
                this.C0 = motionEvent.getX();
                this.D0 = motionEvent.getY();
                getParent().requestDisallowInterceptTouchEvent(true);
                Drawable drawable = this.f22119w;
                if (drawable instanceof k5) {
                    ((y01) ((k5) drawable)).f43502f.c(true);
                }
            } else if (motionEvent.getAction() == 2 && this.B0) {
                if (Math.abs(motionEvent.getX() - this.C0) >= AndroidUtilities.touchSlop || Math.abs(motionEvent.getY() - this.D0) >= AndroidUtilities.touchSlop) {
                    this.B0 = false;
                    getParent().requestDisallowInterceptTouchEvent(false);
                    Drawable drawable2 = this.f22119w;
                    if (drawable2 instanceof k5) {
                        ((y01) ((k5) drawable2)).f43502f.c(false);
                    }
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (this.B0 && motionEvent.getAction() == 1) {
                    this.A0.onClick(this);
                    Drawable drawable3 = this.f22119w;
                    if (drawable3 instanceof k5) {
                        ((y01) ((k5) drawable3)).f43502f.c(false);
                    }
                }
                this.B0 = false;
                getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        if (super.onTouchEvent(motionEvent) || this.B0) {
            return true;
        }
        return false;
    }

    public void setAlignment(Layout.Alignment alignment) {
        this.I0 = alignment;
        requestLayout();
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f22112r > 1) {
            super.setBackgroundDrawable(drawable);
        } else {
            this.L = drawable;
        }
    }

    public void setBuildFullLayout(boolean z4) {
        this.I = z4;
    }

    public void setCanHideRightDrawable(boolean z4) {
        this.f22124y0 = z4;
    }

    public void setDrawablePadding(int i10) {
        if (this.F == i10) {
            return;
        }
        this.F = i10;
        f();
    }

    public void setEllipsizeByGradient(int i10) {
        if (!this.M) {
            this.f22105k0 = true;
            this.m0 = null;
            m();
            b();
        }
        this.f22108n0 = i10;
        m();
    }

    public void setEmojiCacheType(int i10) {
        if (i10 != this.F0) {
            org.telegram.ui.Components.u5.release(this, this.E0);
            this.F0 = i10;
            if (this.H0) {
                this.E0 = org.telegram.ui.Components.u5.update(i10, this, this.E0, this.f22094c);
            }
        }
    }

    public void setEmojiColor(int i10) {
        this.G0 = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
    }

    public void setFullAlpha(float f10) {
        this.J = f10;
        invalidate();
    }

    public void setFullTextMaxLines(int i10) {
        this.f22117u0 = i10;
    }

    public void setGravity(int i10) {
        this.f22107n = i10;
    }

    public void setLeftDrawable(int i10) {
        setLeftDrawable(i10 == 0 ? null : getContext().getResources().getDrawable(i10));
    }

    public void setLeftDrawableOutside(boolean z4) {
        this.f22102h0 = z4;
    }

    public void setLeftDrawableTopPadding(int i10) {
        this.G = i10;
    }

    public void setLinkTextColor(int i10) {
        this.h.linkColor = i10;
        invalidate();
    }

    public void setMaxLines(int i10) {
        this.f22112r = i10;
    }

    public void setMinWidth(int i10) {
        this.f22110p0 = i10;
    }

    public void setMinusWidth(int i10) {
        if (i10 == this.f22116t0) {
            return;
        }
        this.f22116t0 = i10;
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

    public void setRightDrawableInside(boolean z4) {
        this.f22104j0 = z4;
    }

    public void setRightDrawableOnClick(View.OnClickListener onClickListener) {
        this.A0 = onClickListener;
    }

    public void setRightDrawableOutside(boolean z4) {
        this.f22103i0 = z4;
    }

    public void setRightDrawableScale(float f10) {
        this.E = f10;
    }

    public void setRightDrawableTopPadding(int i10) {
        this.H = i10;
    }

    public void setRightPadding(int i10) {
        if (this.f22109o0 != i10) {
            this.f22109o0 = i10;
            int maxTextWidth = ((getMaxTextWidth() - getPaddingLeft()) - getPaddingRight()) - this.f22116t0;
            Drawable drawable = this.v;
            if (drawable != null && !this.f22102h0) {
                maxTextWidth = (maxTextWidth - drawable.getIntrinsicWidth()) - this.F;
            }
            int i11 = 0;
            if (!this.f22104j0) {
                Drawable drawable2 = this.f22119w;
                if (drawable2 != null && !this.f22103i0) {
                    i11 = (int) (drawable2.getIntrinsicWidth() * this.E);
                    maxTextWidth = (maxTextWidth - i11) - this.F;
                }
                Drawable drawable3 = this.f22121x;
                if (drawable3 != null && !this.f22103i0) {
                    i11 = (int) (drawable3.getIntrinsicWidth() * this.E);
                    maxTextWidth = (maxTextWidth - i11) - this.F;
                }
            }
            if (this.B != null && this.f22123y != null) {
                int indexOf = this.f22114s.toString().indexOf(this.B);
                this.C = indexOf;
                if (indexOf < 0) {
                    maxTextWidth = (maxTextWidth - this.f22123y.getIntrinsicWidth()) - this.F;
                }
            }
            if (this.f22124y0 && i11 != 0 && !this.f22103i0) {
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                if (!this.f22114s.equals(TextUtils.ellipsize(this.f22114s, this.h, maxTextWidth, truncateAt))) {
                    this.f22125z0 = true;
                    maxTextWidth = maxTextWidth + i11 + this.F;
                }
            }
            a(maxTextWidth);
            invalidate();
        }
    }

    public void setScrollNonFitText(boolean z4) {
        if (this.M == z4) {
            return;
        }
        this.M = z4;
        m();
        requestLayout();
        b();
    }

    public void setSideDrawablesColor(int i10) {
        k6.w1(i10, this.f22119w);
        k6.w1(i10, this.v);
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

    public void setWidthWrapContent(boolean z4) {
        this.K = z4;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f22119w && drawable != this.f22121x && drawable != this.v && !super.verifyDrawable(drawable)) {
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

    public void setEllipsizeByGradient(boolean z4) {
        if (this.M == z4) {
            return;
        }
        this.f22105k0 = z4;
        this.m0 = null;
        m();
        b();
    }
}
