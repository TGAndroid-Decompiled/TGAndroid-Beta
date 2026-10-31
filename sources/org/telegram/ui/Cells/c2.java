package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.messenger.vp;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.gr;
public final class c2 extends FrameLayout {
    public final int D;
    public final int E;
    public boolean F;
    public boolean G;
    public final boolean H;
    public View I;
    public View J;
    public int f21774a;
    public final org.telegram.ui.ActionBar.p6 f21775b;
    public final b2 f21776c;
    public final a2 d;
    public final View e;
    public final TextView f21777f;
    public final View h;
    public final CheckBoxSquare f21778n;
    public final ep f21779r;
    public View f21780s;
    public final ai.b f21781w;
    public final org.telegram.ui.Components.g9 f21782x;
    public final org.telegram.ui.Components.r8 f21783y;

    public c2(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        this(i10, 17, context, p6Var, false);
    }

    public final boolean a() {
        int i10 = this.D;
        if (i10 != 4 && i10 != 8 && i10 != 6 && i10 != 7) {
            return false;
        }
        return true;
    }

    public final boolean b() {
        ep epVar = this.f21779r;
        if (epVar != null) {
            return epVar.f25836a.f23919q;
        }
        return this.f21778n.h;
    }

    public final void c(boolean z10, boolean z11) {
        ep epVar = this.f21779r;
        if (epVar != null) {
            epVar.a(z10, z11);
        } else {
            this.f21778n.a(z10, z11);
        }
    }

    public final void d(org.telegram.ui.a aVar, ag.t0 t0Var) {
        int i10;
        if (aVar == null) {
            View view = this.I;
            if (view != null) {
                removeView(view);
                this.I = null;
            }
        } else {
            if (this.I == null) {
                View view2 = new View(getContext());
                this.I = view2;
                int i11 = org.telegram.ui.ActionBar.t6.f21020i6;
                org.telegram.ui.ActionBar.p6 p6Var = this.f21775b;
                y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i11, p6Var), 2, -1);
                org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i11);
                view2.setBackground(h02);
                org.telegram.ui.ActionBar.a7.k(view2, h02, null, N, p6Var);
                addView(this.I, w7.b6.e(-1, -1, 119));
            }
            this.I.setOnClickListener(aVar);
        }
        if (t0Var == null) {
            View view3 = this.J;
            if (view3 != null) {
                removeView(view3);
                this.J = null;
                return;
            }
            return;
        }
        if (this.J == null) {
            View view4 = new View(getContext());
            this.J = view4;
            if (cd.X) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            addView(view4, w7.b6.e(56, -1, i10));
        }
        this.J.setOnClickListener(t0Var);
    }

    public final void e(CharSequence charSequence, String str, boolean z10, boolean z11, boolean z12) {
        if (this.H) {
            a2 a2Var = this.d;
            a2Var.c(org.telegram.messenger.k6.m(charSequence, a2Var.getPaint().getFontMetricsInt(), false, null, 0), z12, true);
        } else {
            this.f21776c.setText(charSequence);
        }
        ep epVar = this.f21779r;
        if (epVar != null) {
            epVar.a(z10, z12);
        } else {
            this.f21778n.a(z10, z12);
        }
        this.f21777f.setText(str);
        this.F = z11;
        setWillNotDraw(!z11);
    }

    public final void f() {
        float f7;
        float left;
        View view = this.e;
        if (this.f21780s == null) {
            return;
        }
        try {
            f7 = view.getMeasuredWidth();
        } catch (Exception unused) {
            f7 = 0.0f;
        }
        if (cd.X) {
            left = (view.getRight() - f7) - org.telegram.messenger.i0.L(20.0f);
        } else {
            left = view.getLeft() + f7 + org.telegram.messenger.i0.L(4.0f);
        }
        this.f21780s.setTranslationX(left);
    }

    public final void g() {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10 = this.H;
        org.telegram.ui.ActionBar.p6 p6Var = this.f21775b;
        int i14 = this.D;
        if (z10) {
            if (i14 != 1 && i14 != 5) {
                i13 = org.telegram.ui.ActionBar.t6.G6;
            } else {
                i13 = org.telegram.ui.ActionBar.t6.f21037j5;
            }
            org.telegram.ui.ActionBar.a7.Z(this.d, i13, p6Var);
        } else {
            if (i14 != 1 && i14 != 5) {
                i10 = org.telegram.ui.ActionBar.t6.G6;
            } else {
                i10 = org.telegram.ui.ActionBar.t6.f21037j5;
            }
            b2 b2Var = this.f21776c;
            org.telegram.ui.ActionBar.a7.V(b2Var, i10, p6Var);
            if (i14 != 1 && i14 != 5) {
                i11 = org.telegram.ui.ActionBar.t6.J6;
            } else {
                i11 = org.telegram.ui.ActionBar.t6.f21057k5;
            }
            org.telegram.ui.ActionBar.a7.H(b2Var, i11, p6Var);
        }
        if (i14 != 1 && i14 != 5) {
            i12 = org.telegram.ui.ActionBar.t6.I6;
        } else {
            i12 = org.telegram.ui.ActionBar.t6.f21094m5;
        }
        org.telegram.ui.ActionBar.a7.V(this.f21777f, i12, p6Var);
    }

    public org.telegram.ui.Components.f6 getAnimatedTextView() {
        return this.d;
    }

    public ep getCheckBoxRound() {
        return this.f21779r;
    }

    public View getCheckBoxView() {
        return this.h;
    }

    public TextView getTextView() {
        return this.f21776c;
    }

    public TextView getValueTextView() {
        return this.f21777f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        Paint paint;
        float f10;
        if (this.F) {
            if (a()) {
                f7 = 60.0f;
            } else {
                f7 = 20.0f;
            }
            int L = org.telegram.messenger.i0.L(f7) + ((int) Math.abs(this.e.getTranslationX()));
            if (this.D == 7) {
                L += org.telegram.messenger.i0.L(39.0f);
            }
            org.telegram.ui.ActionBar.p6 p6Var = this.f21775b;
            if (p6Var != null) {
                paint = p6Var.d("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.t6.f21052k0;
            }
            Paint paint2 = paint;
            if (cd.X) {
                f10 = 0.0f;
            } else {
                f10 = L;
            }
            float f11 = f10;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (!cd.X) {
                L = 0;
            }
            canvas.drawLine(f11, measuredHeight, measuredWidth - L, getMeasuredHeight() - 1, paint2);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        accessibilityNodeInfo.setCheckable(true);
        a2 a2Var = this.d;
        if (a2Var != null) {
            accessibilityNodeInfo.setText(a2Var.getText());
        } else {
            b2 b2Var = this.f21776c;
            if (b2Var != null) {
                accessibilityNodeInfo.setText(b2Var.getText());
            }
        }
        accessibilityNodeInfo.setChecked(b());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int size = View.MeasureSpec.getSize(i10);
        View view = this.h;
        int i12 = this.E;
        View view2 = this.e;
        TextView textView = this.f21777f;
        int i13 = this.D;
        if (i13 == 3) {
            textView.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(10.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(50.0f), 1073741824));
            view2.measure(View.MeasureSpec.makeMeasureSpec(size - org.telegram.messenger.i0.L(34.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(50.0f), Integer.MIN_VALUE));
            float f10 = i12;
            view.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(f10), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(f10), 1073741824));
            setMeasuredDimension(org.telegram.messenger.i0.L(29.0f) + view2.getMeasuredWidth(), org.telegram.messenger.i0.L(50.0f));
        } else if (this.G) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.i0.L(50.0f) + (this.F ? 1 : 0));
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            if (a()) {
                f7 = 60.0f;
            } else {
                f7 = 34.0f;
            }
            int L = measuredWidth - org.telegram.messenger.i0.L(f7);
            if (this.H) {
                L += (int) this.d.getRightPadding();
            }
            if (i13 == 7) {
                L -= org.telegram.messenger.i0.L(34.0f);
            }
            if (textView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                L -= ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin;
            }
            int i14 = L / 2;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            int measuredWidth2 = textView.getMeasuredWidth();
            ai.b bVar = this.f21781w;
            if (bVar != null) {
                bVar.measure(View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                measuredWidth2 = z20.D(11.0f, bVar.getMeasuredWidth(), measuredWidth2);
            }
            if (view2.getLayoutParams().width == -1) {
                view2.measure(z20.c(8.0f, (L - ((int) Math.abs(view2.getTranslationX()))) - measuredWidth2, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
            } else {
                view2.measure(z20.c(8.0f, (L - ((int) Math.abs(view2.getTranslationX()))) - measuredWidth2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
            }
            org.telegram.ui.Components.g9 g9Var = this.f21782x;
            if (g9Var != null) {
                g9Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(34.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(34.0f), 1073741824));
            }
            float f11 = i12;
            view.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(f11), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(f11), 1073741824));
        }
        View view3 = this.I;
        if (view3 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
            this.I.measure(View.MeasureSpec.makeMeasureSpec((size - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(50.0f), 1073741824));
        }
        View view4 = this.J;
        if (view4 != null) {
            view4.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(56.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(50.0f), 1073741824));
        }
        View view5 = this.f21780s;
        if (view5 != null) {
            view5.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(16.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(16.0f), 1073741824));
        }
    }

    public void setCollapsed(Boolean bool) {
        float f7;
        if (bool == null) {
            View view = this.f21780s;
            if (view != null) {
                removeView(view);
                this.f21780s = null;
                return;
            }
            return;
        }
        if (this.f21780s == null) {
            this.f21780s = new View(getContext());
            Drawable mutate = getContext().getResources().getDrawable(2131230871).mutate();
            org.telegram.ui.ActionBar.a7.y(this, mutate, org.telegram.ui.ActionBar.t6.G6, this.f21775b, PorterDuff.Mode.MULTIPLY);
            this.f21780s.setBackground(mutate);
            addView(this.f21780s, w7.b6.e(16, 16, 16));
        }
        f();
        this.f21780s.animate().cancel();
        ViewPropertyAnimator animate = this.f21780s.animate();
        if (bool.booleanValue()) {
            f7 = 0.0f;
        } else {
            f7 = 180.0f;
        }
        animate.rotation(f7).setDuration(340L).setInterpolator(gr.h).start();
    }

    @Override
    public void setEnabled(boolean z10) {
        float f7;
        float f10;
        super.setEnabled(z10);
        float f11 = 0.5f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.5f;
        }
        this.e.setAlpha(f7);
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        this.f21777f.setAlpha(f10);
        if (z10) {
            f11 = 1.0f;
        }
        this.h.setAlpha(f11);
    }

    public void setIcon(int i10) {
        this.f21779r.setIcon(i10);
    }

    public void setMultiline(boolean z10) {
        if (this.H) {
            return;
        }
        this.G = z10;
        View view = this.e;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        View view2 = this.h;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view2.getLayoutParams();
        boolean z11 = this.G;
        b2 b2Var = this.f21776c;
        if (z11) {
            b2Var.setLines(0);
            b2Var.setMaxLines(0);
            b2Var.setSingleLine(false);
            b2Var.setEllipsize(null);
            layoutParams2.gravity = (layoutParams2.gravity & 7) | 16;
            layoutParams2.topMargin = 0;
        } else {
            b2Var.setLines(1);
            b2Var.setMaxLines(1);
            b2Var.setSingleLine(true);
            b2Var.setEllipsize(TextUtils.TruncateAt.END);
            view.setPadding(0, 0, 0, 0);
            layoutParams.height = -1;
            layoutParams.topMargin = 0;
            layoutParams2.gravity = (layoutParams2.gravity & 7) | 48;
            layoutParams2.topMargin = org.telegram.messenger.i0.L(15.0f);
        }
        view.setLayoutParams(layoutParams);
        view2.setLayoutParams(layoutParams2);
    }

    public void setNeedDivider(boolean z10) {
        this.F = z10;
    }

    public void setPad(int i10) {
        int i11;
        int i12 = i10 * 40;
        if (cd.X) {
            i11 = -1;
        } else {
            i11 = 1;
        }
        int L = org.telegram.messenger.i0.L(i12 * i11);
        View view = this.h;
        if (view != null) {
            view.setTranslationX(L);
        }
        float f7 = L;
        this.e.setTranslationX(f7);
        org.telegram.ui.Components.g9 g9Var = this.f21782x;
        if (g9Var != null) {
            g9Var.setTranslationX(f7);
        }
        View view2 = this.I;
        if (view2 != null) {
            view2.setTranslationX(f7);
        }
        View view3 = this.J;
        if (view3 != null) {
            view3.setTranslationX(f7);
        }
    }

    public void setTextColor(int i10) {
        int i11;
        if (this.H) {
            a2 a2Var = this.d;
            org.telegram.ui.ActionBar.a7.r(a2Var);
            a2Var.setTextColor(i10);
            return;
        }
        b2 b2Var = this.f21776c;
        org.telegram.ui.ActionBar.a7.r(b2Var);
        b2Var.setTextColor(i10);
        int i12 = this.D;
        if (i12 != 1 && i12 != 5) {
            i11 = org.telegram.ui.ActionBar.t6.J6;
        } else {
            i11 = org.telegram.ui.ActionBar.t6.f21057k5;
        }
        if (b2Var.getLinkTextColors() != null) {
            int defaultColor = b2Var.getLinkTextColors().getDefaultColor();
            org.telegram.ui.ActionBar.p6 p6Var = this.f21775b;
            if (defaultColor == org.telegram.ui.ActionBar.t6.w0(i11, p6Var)) {
                org.telegram.ui.ActionBar.a7.H(b2Var, i11, p6Var);
            }
        }
    }

    public void setUserOrChat(TLObject tLObject) {
        String o10;
        org.telegram.ui.Components.r8 r8Var = this.f21783y;
        r8Var.l(tLObject);
        this.f21782x.e(tLObject, r8Var);
        boolean z10 = tLObject instanceof TLRPC.User;
        if (z10) {
            o10 = h20.p((TLRPC.User) tLObject);
        } else {
            o10 = org.telegram.messenger.i5.o(tLObject);
        }
        if (z10 && ((TLRPC.User) tLObject).f19942id == vp.r1(d20.f15147s0).f18785f5) {
            o10 = cd.L0(2131752460, null);
        }
        if (this.H) {
            a2 a2Var = this.d;
            a2Var.setText(org.telegram.messenger.k6.m(o10, a2Var.getPaint().getFontMetricsInt(), false, null, 0));
            return;
        }
        this.f21776c.setText(o10);
    }

    public c2(Context context, int i10) {
        this(i10, 17, context, null, false);
    }

    public c2(int i10, int i11, Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        super(context);
        this.f21775b = p6Var;
        this.D = i10;
        this.H = z10;
        boolean z11 = true;
        if (z10) {
            a2 a2Var = new a2(this, context, 0);
            this.d = a2Var;
            zs.i(a2Var);
            a2Var.setEllipsizeByGradient(true);
            a2Var.setRightPadding(org.telegram.messenger.i0.L(8.0f));
            a2Var.getDrawable().r(true, false);
            a2Var.setTag(Integer.valueOf(org.telegram.ui.ActionBar.t6.w0((i10 == 1 || i10 == 5) ? org.telegram.ui.ActionBar.t6.f21037j5 : org.telegram.ui.ActionBar.t6.G6, p6Var)));
            a2Var.setTextSize(org.telegram.messenger.i0.L(16.0f));
            if (i10 == 7) {
                a2Var.setTypeface(org.telegram.messenger.i0.o());
            }
            if (i10 == 3) {
                a2Var.setGravity(19);
                addView(a2Var, w7.b6.d(-1, -2.0f, 19, 29.0f, 0.0f, 0.0f, 0.0f));
                a2Var.setPadding(0, 0, 0, org.telegram.messenger.i0.L(3.0f));
            } else {
                a2Var.setRightPadding(org.telegram.messenger.i0.L(i11));
                a2Var.setGravity((cd.X ? 5 : 3) | 16);
                if (i10 == 2) {
                    boolean z12 = cd.X;
                    addView(a2Var, w7.b6.d(-1, -2.0f, (z12 ? 5 : 3) | 16, z12 ? 8 : 29, 0.0f, z12 ? 29 : 8, 0.0f));
                } else {
                    int i12 = a() ? 56 : 46;
                    i12 = i10 == 7 ? i12 + 39 : i12;
                    boolean z13 = cd.X;
                    addView(a2Var, w7.b6.d(-1, -2.0f, (z13 ? 5 : 3) | 16, z13 ? i11 : (i11 - 17) + i12, 0.0f, z13 ? (i11 - 17) + i12 : i11, 0.0f));
                }
            }
            this.e = a2Var;
        } else {
            b2 b2Var = new b2(this, context, 0);
            this.f21776c = b2Var;
            zs.i(b2Var);
            b2Var.setTag(Integer.valueOf(org.telegram.ui.ActionBar.t6.w0((i10 == 1 || i10 == 5) ? org.telegram.ui.ActionBar.t6.f21037j5 : org.telegram.ui.ActionBar.t6.G6, p6Var)));
            b2Var.setTextSize(1, 16.0f);
            b2Var.setLines(1);
            b2Var.setMaxLines(1);
            b2Var.setSingleLine(true);
            b2Var.setEllipsize(TextUtils.TruncateAt.END);
            if (i10 == 7) {
                b2Var.setTypeface(org.telegram.messenger.i0.o());
            }
            if (i10 == 3) {
                b2Var.setGravity(19);
                addView(b2Var, w7.b6.d(-1, -2.0f, 19, 29.0f, 0.0f, 0.0f, 0.0f));
                b2Var.setPadding(0, 0, 0, org.telegram.messenger.i0.L(3.0f));
            } else {
                b2Var.setGravity((cd.X ? 5 : 3) | 16);
                if (i10 == 2) {
                    boolean z14 = cd.X;
                    addView(b2Var, w7.b6.d(-1, -2.0f, (z14 ? 5 : 3) | 16, z14 ? 8 : 29, 0.0f, z14 ? 29 : 8, 0.0f));
                } else {
                    int i13 = a() ? 56 : 46;
                    i13 = i10 == 7 ? i13 + 39 : i13;
                    int i14 = a() ? -2 : -1;
                    boolean z15 = cd.X;
                    addView(b2Var, w7.b6.d(i14, -2.0f, (z15 ? 5 : 3) | 16, z15 ? i11 : (i11 - 17) + i13, 0.0f, z15 ? (i11 - 17) + i13 : i11, 0.0f));
                }
            }
            this.e = b2Var;
        }
        TextView textView = new TextView(context);
        this.f21777f = textView;
        textView.setTag(Integer.valueOf((i10 == 1 || i10 == 5) ? org.telegram.ui.ActionBar.t6.f21094m5 : org.telegram.ui.ActionBar.t6.I6));
        textView.setTextSize(1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((cd.X ? 3 : 5) | 16);
        float f7 = i11;
        addView(textView, w7.b6.d(-2, -1.0f, (cd.X ? 3 : 5) | 48, f7, 0.0f, f7, 0.0f));
        if (a()) {
            ep epVar = new ep(21, context, p6Var);
            this.f21779r = epVar;
            this.h = epVar;
            epVar.setDrawUnchecked(true);
            epVar.a(true, false);
            epVar.setDrawBackgroundAsArc(10);
            this.E = 21;
            float f10 = 21;
            boolean z16 = cd.X;
            addView(epVar, w7.b6.d(21, f10, (z16 ? 5 : 3) | 48, z16 ? 0 : i11, 16.0f, z16 ? i11 : 0, 0.0f));
        } else {
            if (i10 != 1 && i10 != 5) {
                z11 = false;
            }
            CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, p6Var, z11);
            this.f21778n = checkBoxSquare;
            this.h = checkBoxSquare;
            this.E = 18;
            if (i10 == 5) {
                float f11 = 18;
                boolean z17 = cd.X;
                addView(checkBoxSquare, w7.b6.d(18, f11, (z17 ? 5 : 3) | 16, z17 ? 0 : i11, 0.0f, z17 ? i11 : 0, 0.0f));
            } else if (i10 == 3) {
                addView(checkBoxSquare, w7.b6.d(18, 18, 51, 0.0f, 15.0f, 0.0f, 0.0f));
            } else if (i10 == 2) {
                addView(checkBoxSquare, w7.b6.d(18, 18, (cd.X ? 5 : 3) | 48, 0.0f, 15.0f, 0.0f, 0.0f));
            } else {
                float f12 = 18;
                boolean z18 = cd.X;
                addView(checkBoxSquare, w7.b6.d(18, f12, (z18 ? 5 : 3) | 48, z18 ? 0 : i11, 16.0f, z18 ? i11 : 0, 0.0f));
            }
        }
        if (i10 == 6) {
            ai.b bVar = new ai.b(this, context, 2131232159);
            this.f21781w = bVar;
            addView(bVar, w7.b6.i(-2.0f, -2.0f, 8388629, f7, 0.0f, i11 - 11, 0.0f));
        } else if (i10 == 8) {
            ai.b bVar2 = new ai.b(this, context, 0);
            this.f21781w = bVar2;
            addView(bVar2, w7.b6.i(-2.0f, -2.0f, 8388629, f7, 0.0f, i11 - 11, 0.0f));
        } else if (i10 == 7) {
            this.f21783y = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
            org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
            this.f21782x = g9Var;
            g9Var.setRoundRadius(org.telegram.messenger.i0.L(17.0f));
            addView(g9Var, w7.b6.i(34.0f, 34.0f, 8388627, 56.0f, 0.0f, 0.0f, 0.0f));
        }
        g();
    }
}
