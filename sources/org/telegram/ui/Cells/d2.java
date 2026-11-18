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
import di.za;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.n10;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mp;
public final class d2 extends FrameLayout {
    public final int E;
    public final int F;
    public boolean G;
    public boolean H;
    public final boolean I;
    public View J;
    public View K;
    public int f30525a;
    public final org.telegram.ui.ActionBar.i6 f30526b;
    public final c2 f30527c;
    public final b2 d;
    public final View f30528e;
    public final TextView f30529f;
    public final View h;
    public final CheckBoxSquare f30530n;
    public final mp f30531r;
    public View f30532s;
    public final za f30533w;
    public final org.telegram.ui.Components.q9 f30534x;
    public final org.telegram.ui.Components.b9 f30535y;

    public d2(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        this(context, i7, 17, false, i6Var);
    }

    public final boolean a() {
        int i7 = this.E;
        if (i7 != 4 && i7 != 8 && i7 != 6 && i7 != 7) {
            return false;
        }
        return true;
    }

    public final boolean b() {
        mp mpVar = this.f30531r;
        if (mpVar != null) {
            return mpVar.f37598a.f32838q;
        }
        return this.f30530n.h;
    }

    public final void c(boolean z10, boolean z11) {
        mp mpVar = this.f30531r;
        if (mpVar != null) {
            mpVar.a(z10, z11);
        } else {
            this.f30530n.a(z10, z11);
        }
    }

    public final void d(org.telegram.ui.a aVar, ni.b bVar) {
        int i7;
        if (aVar == null) {
            View view = this.J;
            if (view != null) {
                removeView(view);
                this.J = null;
            }
        } else {
            if (this.J == null) {
                View view2 = new View(getContext());
                this.J = view2;
                int i10 = org.telegram.ui.ActionBar.n6.f29486i6;
                org.telegram.ui.ActionBar.i6 i6Var = this.f30526b;
                y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i10, i6Var), 2, -1);
                org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i10);
                view2.setBackground(h02);
                org.telegram.ui.ActionBar.u6.j(view2, h02, null, M, i6Var);
                addView(this.J, c8.ma.e(-1, -1, 119));
            }
            this.J.setOnClickListener(aVar);
        }
        if (bVar == null) {
            View view3 = this.K;
            if (view3 != null) {
                removeView(view3);
                this.K = null;
                return;
            }
            return;
        }
        if (this.K == null) {
            View view4 = new View(getContext());
            this.K = view4;
            if (gd.f24213a0) {
                i7 = 5;
            } else {
                i7 = 3;
            }
            addView(view4, c8.ma.e(56, -1, i7));
        }
        this.K.setOnClickListener(bVar);
    }

    public final void e(CharSequence charSequence, String str, boolean z10, boolean z11, boolean z12) {
        if (this.I) {
            b2 b2Var = this.d;
            b2Var.c(org.telegram.messenger.j6.m(charSequence, b2Var.getPaint().getFontMetricsInt(), false, null, 0), z12, true);
        } else {
            this.f30527c.setText(charSequence);
        }
        mp mpVar = this.f30531r;
        if (mpVar != null) {
            mpVar.a(z10, z12);
        } else {
            this.f30530n.a(z10, z12);
        }
        this.f30529f.setText(str);
        this.G = z11;
        setWillNotDraw(!z11);
    }

    public final void f() {
        float f10;
        float left;
        View view = this.f30528e;
        if (this.f30532s == null) {
            return;
        }
        try {
            f10 = view.getMeasuredWidth();
        } catch (Exception unused) {
            f10 = 0.0f;
        }
        if (gd.f24213a0) {
            left = (view.getRight() - f10) - org.telegram.messenger.g0.L(20.0f);
        } else {
            left = view.getLeft() + f10 + org.telegram.messenger.g0.L(4.0f);
        }
        this.f30532s.setTranslationX(left);
    }

    public final void g() {
        int i7;
        int i10;
        int i11;
        int i12;
        boolean z10 = this.I;
        org.telegram.ui.ActionBar.i6 i6Var = this.f30526b;
        int i13 = this.E;
        if (z10) {
            if (i13 != 1 && i13 != 5) {
                i12 = org.telegram.ui.ActionBar.n6.G6;
            } else {
                i12 = org.telegram.ui.ActionBar.n6.f29502j5;
            }
            org.telegram.ui.ActionBar.u6.Y(this.d, i12, i6Var);
        } else {
            if (i13 != 1 && i13 != 5) {
                i7 = org.telegram.ui.ActionBar.n6.G6;
            } else {
                i7 = org.telegram.ui.ActionBar.n6.f29502j5;
            }
            c2 c2Var = this.f30527c;
            org.telegram.ui.ActionBar.u6.U(c2Var, i7, i6Var);
            if (i13 != 1 && i13 != 5) {
                i10 = org.telegram.ui.ActionBar.n6.J6;
            } else {
                i10 = org.telegram.ui.ActionBar.n6.f29522k5;
            }
            org.telegram.ui.ActionBar.u6.G(c2Var, i10, i6Var);
        }
        if (i13 != 1 && i13 != 5) {
            i11 = org.telegram.ui.ActionBar.n6.I6;
        } else {
            i11 = org.telegram.ui.ActionBar.n6.f29558m5;
        }
        org.telegram.ui.ActionBar.u6.U(this.f30529f, i11, i6Var);
    }

    public org.telegram.ui.Components.n6 getAnimatedTextView() {
        return this.d;
    }

    public mp getCheckBoxRound() {
        return this.f30531r;
    }

    public View getCheckBoxView() {
        return this.h;
    }

    public TextView getTextView() {
        return this.f30527c;
    }

    public TextView getValueTextView() {
        return this.f30529f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        Paint paint;
        float f11;
        if (this.G) {
            if (a()) {
                f10 = 60.0f;
            } else {
                f10 = 20.0f;
            }
            int L = org.telegram.messenger.g0.L(f10) + ((int) Math.abs(this.f30528e.getTranslationX()));
            if (this.E == 7) {
                L += org.telegram.messenger.g0.L(39.0f);
            }
            org.telegram.ui.ActionBar.i6 i6Var = this.f30526b;
            if (i6Var != null) {
                paint = i6Var.g("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.n6.f29517k0;
            }
            Paint paint2 = paint;
            if (gd.f24213a0) {
                f11 = 0.0f;
            } else {
                f11 = L;
            }
            float f12 = f11;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (!gd.f24213a0) {
                L = 0;
            }
            canvas.drawLine(f12, measuredHeight, measuredWidth - L, getMeasuredHeight() - 1, paint2);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        accessibilityNodeInfo.setCheckable(true);
        b2 b2Var = this.d;
        if (b2Var != null) {
            accessibilityNodeInfo.setText(b2Var.getText());
        } else {
            c2 c2Var = this.f30527c;
            if (c2Var != null) {
                accessibilityNodeInfo.setText(c2Var.getText());
            }
        }
        accessibilityNodeInfo.setChecked(b());
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        int size = View.MeasureSpec.getSize(i7);
        View view = this.h;
        int i11 = this.F;
        View view2 = this.f30528e;
        TextView textView = this.f30529f;
        int i12 = this.E;
        if (i12 == 3) {
            textView.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(10.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
            view2.measure(View.MeasureSpec.makeMeasureSpec(size - org.telegram.messenger.g0.L(34.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), Integer.MIN_VALUE));
            float f11 = i11;
            view.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f11), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f11), 1073741824));
            setMeasuredDimension(org.telegram.messenger.g0.L(29.0f) + view2.getMeasuredWidth(), org.telegram.messenger.g0.L(50.0f));
        } else if (this.H) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(50.0f) + (this.G ? 1 : 0));
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            if (a()) {
                f10 = 60.0f;
            } else {
                f10 = 34.0f;
            }
            int L = measuredWidth - org.telegram.messenger.g0.L(f10);
            if (this.I) {
                L += (int) this.d.getRightPadding();
            }
            if (i12 == 7) {
                L -= org.telegram.messenger.g0.L(34.0f);
            }
            if (textView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                L -= ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin;
            }
            int i13 = L / 2;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i13, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            int measuredWidth2 = textView.getMeasuredWidth();
            za zaVar = this.f30533w;
            if (zaVar != null) {
                zaVar.measure(View.MeasureSpec.makeMeasureSpec(i13, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                measuredWidth2 = c0.i(11.0f, zaVar.getMeasuredWidth(), measuredWidth2);
            }
            if (view2.getLayoutParams().width == -1) {
                view2.measure(n10.c(8.0f, (L - ((int) Math.abs(view2.getTranslationX()))) - measuredWidth2, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
            } else {
                view2.measure(n10.c(8.0f, (L - ((int) Math.abs(view2.getTranslationX()))) - measuredWidth2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
            }
            org.telegram.ui.Components.q9 q9Var = this.f30534x;
            if (q9Var != null) {
                q9Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(34.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(34.0f), 1073741824));
            }
            float f12 = i11;
            view.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f12), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f12), 1073741824));
        }
        View view3 = this.J;
        if (view3 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
            this.J.measure(View.MeasureSpec.makeMeasureSpec((size - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
        }
        View view4 = this.K;
        if (view4 != null) {
            view4.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
        }
        View view5 = this.f30532s;
        if (view5 != null) {
            view5.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(16.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(16.0f), 1073741824));
        }
    }

    public void setCollapsed(Boolean bool) {
        float f10;
        if (bool == null) {
            View view = this.f30532s;
            if (view != null) {
                removeView(view);
                this.f30532s = null;
                return;
            }
            return;
        }
        if (this.f30532s == null) {
            this.f30532s = new View(getContext());
            Drawable mutate = getContext().getResources().getDrawable(2131230871).mutate();
            org.telegram.ui.ActionBar.u6.x(this, mutate, org.telegram.ui.ActionBar.n6.G6, this.f30526b, PorterDuff.Mode.MULTIPLY);
            this.f30532s.setBackground(mutate);
            addView(this.f30532s, c8.ma.e(16, 16, 16));
        }
        f();
        this.f30532s.animate().cancel();
        ViewPropertyAnimator animate = this.f30532s.animate();
        if (bool.booleanValue()) {
            f10 = 0.0f;
        } else {
            f10 = 180.0f;
        }
        animate.rotation(f10).setDuration(340L).setInterpolator(lr.h).start();
    }

    @Override
    public void setEnabled(boolean z10) {
        float f10;
        float f11;
        super.setEnabled(z10);
        float f12 = 0.5f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        this.f30528e.setAlpha(f10);
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.5f;
        }
        this.f30529f.setAlpha(f11);
        if (z10) {
            f12 = 1.0f;
        }
        this.h.setAlpha(f12);
    }

    public void setIcon(int i7) {
        this.f30531r.setIcon(i7);
    }

    public void setMultiline(boolean z10) {
        if (this.I) {
            return;
        }
        this.H = z10;
        View view = this.f30528e;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        View view2 = this.h;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view2.getLayoutParams();
        boolean z11 = this.H;
        c2 c2Var = this.f30527c;
        if (z11) {
            c2Var.setLines(0);
            c2Var.setMaxLines(0);
            c2Var.setSingleLine(false);
            c2Var.setEllipsize(null);
            layoutParams2.gravity = (layoutParams2.gravity & 7) | 16;
            layoutParams2.topMargin = 0;
        } else {
            c2Var.setLines(1);
            c2Var.setMaxLines(1);
            c2Var.setSingleLine(true);
            c2Var.setEllipsize(TextUtils.TruncateAt.END);
            view.setPadding(0, 0, 0, 0);
            layoutParams.height = -1;
            layoutParams.topMargin = 0;
            layoutParams2.gravity = (layoutParams2.gravity & 7) | 48;
            layoutParams2.topMargin = org.telegram.messenger.g0.L(15.0f);
        }
        view.setLayoutParams(layoutParams);
        view2.setLayoutParams(layoutParams2);
    }

    public void setNeedDivider(boolean z10) {
        this.G = z10;
    }

    public void setPad(int i7) {
        int i10;
        int i11 = i7 * 40;
        if (gd.f24213a0) {
            i10 = -1;
        } else {
            i10 = 1;
        }
        int L = org.telegram.messenger.g0.L(i11 * i10);
        View view = this.h;
        if (view != null) {
            view.setTranslationX(L);
        }
        float f10 = L;
        this.f30528e.setTranslationX(f10);
        org.telegram.ui.Components.q9 q9Var = this.f30534x;
        if (q9Var != null) {
            q9Var.setTranslationX(f10);
        }
        View view2 = this.J;
        if (view2 != null) {
            view2.setTranslationX(f10);
        }
        View view3 = this.K;
        if (view3 != null) {
            view3.setTranslationX(f10);
        }
    }

    public void setTextColor(int i7) {
        int i10;
        if (this.I) {
            b2 b2Var = this.d;
            org.telegram.ui.ActionBar.u6.q(b2Var);
            b2Var.setTextColor(i7);
            return;
        }
        c2 c2Var = this.f30527c;
        org.telegram.ui.ActionBar.u6.q(c2Var);
        c2Var.setTextColor(i7);
        int i11 = this.E;
        if (i11 != 1 && i11 != 5) {
            i10 = org.telegram.ui.ActionBar.n6.J6;
        } else {
            i10 = org.telegram.ui.ActionBar.n6.f29522k5;
        }
        if (c2Var.getLinkTextColors() != null) {
            int defaultColor = c2Var.getLinkTextColors().getDefaultColor();
            org.telegram.ui.ActionBar.i6 i6Var = this.f30526b;
            if (defaultColor == org.telegram.ui.ActionBar.n6.w0(i10, i6Var)) {
                org.telegram.ui.ActionBar.u6.G(c2Var, i10, i6Var);
            }
        }
    }

    public void setUserOrChat(TLObject tLObject) {
        String o4;
        org.telegram.ui.Components.b9 b9Var = this.f30535y;
        b9Var.l(tLObject);
        this.f30534x.f(tLObject, b9Var);
        boolean z10 = tLObject instanceof TLRPC.User;
        if (z10) {
            o4 = o10.q((TLRPC.User) tLObject);
        } else {
            o4 = org.telegram.messenger.i5.o(tLObject);
        }
        if (z10 && ((TLRPC.User) tLObject).f28552id == org.telegram.messenger.mp.u1(j10.f24770t0).f25665h5) {
            o4 = gd.M0(2131752449, null);
        }
        if (this.I) {
            b2 b2Var = this.d;
            b2Var.setText(org.telegram.messenger.j6.m(o4, b2Var.getPaint().getFontMetricsInt(), false, null, 0));
            return;
        }
        this.f30527c.setText(o4);
    }

    public d2(Context context, int i7) {
        this(context, i7, 17, false, null);
    }

    public d2(Context context, int i7, int i10, boolean z10, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f30526b = i6Var;
        this.E = i7;
        this.I = z10;
        boolean z11 = true;
        if (z10) {
            b2 b2Var = new b2(this, context, 0);
            this.d = b2Var;
            ks.i(b2Var);
            b2Var.setEllipsizeByGradient(true);
            b2Var.setRightPadding(org.telegram.messenger.g0.L(8.0f));
            b2Var.getDrawable().r(true, false);
            b2Var.setTag(Integer.valueOf(org.telegram.ui.ActionBar.n6.w0((i7 == 1 || i7 == 5) ? org.telegram.ui.ActionBar.n6.f29502j5 : org.telegram.ui.ActionBar.n6.G6, i6Var)));
            b2Var.setTextSize(org.telegram.messenger.g0.L(16.0f));
            if (i7 == 7) {
                b2Var.setTypeface(org.telegram.messenger.g0.o());
            }
            if (i7 == 3) {
                b2Var.setGravity(19);
                addView(b2Var, c8.ma.d(-1, -2.0f, 19, 29.0f, 0.0f, 0.0f, 0.0f));
                b2Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(3.0f));
            } else {
                b2Var.setRightPadding(org.telegram.messenger.g0.L(i10));
                b2Var.setGravity((gd.f24213a0 ? 5 : 3) | 16);
                if (i7 == 2) {
                    boolean z12 = gd.f24213a0;
                    addView(b2Var, c8.ma.d(-1, -2.0f, (z12 ? 5 : 3) | 16, z12 ? 8 : 29, 0.0f, z12 ? 29 : 8, 0.0f));
                } else {
                    int i11 = a() ? 56 : 46;
                    i11 = i7 == 7 ? i11 + 39 : i11;
                    boolean z13 = gd.f24213a0;
                    addView(b2Var, c8.ma.d(-1, -2.0f, (z13 ? 5 : 3) | 16, z13 ? i10 : (i10 - 17) + i11, 0.0f, z13 ? (i10 - 17) + i11 : i10, 0.0f));
                }
            }
            this.f30528e = b2Var;
        } else {
            c2 c2Var = new c2(0, context, this);
            this.f30527c = c2Var;
            ks.i(c2Var);
            c2Var.setTag(Integer.valueOf(org.telegram.ui.ActionBar.n6.w0((i7 == 1 || i7 == 5) ? org.telegram.ui.ActionBar.n6.f29502j5 : org.telegram.ui.ActionBar.n6.G6, i6Var)));
            c2Var.setTextSize(1, 16.0f);
            c2Var.setLines(1);
            c2Var.setMaxLines(1);
            c2Var.setSingleLine(true);
            c2Var.setEllipsize(TextUtils.TruncateAt.END);
            if (i7 == 7) {
                c2Var.setTypeface(org.telegram.messenger.g0.o());
            }
            if (i7 == 3) {
                c2Var.setGravity(19);
                addView(c2Var, c8.ma.d(-1, -2.0f, 19, 29.0f, 0.0f, 0.0f, 0.0f));
                c2Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(3.0f));
            } else {
                c2Var.setGravity((gd.f24213a0 ? 5 : 3) | 16);
                if (i7 == 2) {
                    boolean z14 = gd.f24213a0;
                    addView(c2Var, c8.ma.d(-1, -2.0f, (z14 ? 5 : 3) | 16, z14 ? 8 : 29, 0.0f, z14 ? 29 : 8, 0.0f));
                } else {
                    int i12 = a() ? 56 : 46;
                    i12 = i7 == 7 ? i12 + 39 : i12;
                    int i13 = a() ? -2 : -1;
                    boolean z15 = gd.f24213a0;
                    addView(c2Var, c8.ma.d(i13, -2.0f, (z15 ? 5 : 3) | 16, z15 ? i10 : (i10 - 17) + i12, 0.0f, z15 ? (i10 - 17) + i12 : i10, 0.0f));
                }
            }
            this.f30528e = c2Var;
        }
        TextView textView = new TextView(context);
        this.f30529f = textView;
        textView.setTag(Integer.valueOf((i7 == 1 || i7 == 5) ? org.telegram.ui.ActionBar.n6.f29558m5 : org.telegram.ui.ActionBar.n6.I6));
        textView.setTextSize(1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((gd.f24213a0 ? 3 : 5) | 16);
        float f10 = i10;
        addView(textView, c8.ma.d(-2, -1.0f, (gd.f24213a0 ? 3 : 5) | 48, f10, 0.0f, f10, 0.0f));
        if (a()) {
            mp mpVar = new mp(21, context, i6Var);
            this.f30531r = mpVar;
            this.h = mpVar;
            mpVar.setDrawUnchecked(true);
            mpVar.a(true, false);
            mpVar.setDrawBackgroundAsArc(10);
            this.F = 21;
            float f11 = 21;
            boolean z16 = gd.f24213a0;
            addView(mpVar, c8.ma.d(21, f11, (z16 ? 5 : 3) | 48, z16 ? 0 : i10, 16.0f, z16 ? i10 : 0, 0.0f));
        } else {
            if (i7 != 1 && i7 != 5) {
                z11 = false;
            }
            CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, i6Var, z11);
            this.f30530n = checkBoxSquare;
            this.h = checkBoxSquare;
            this.F = 18;
            if (i7 == 5) {
                float f12 = 18;
                boolean z17 = gd.f24213a0;
                addView(checkBoxSquare, c8.ma.d(18, f12, (z17 ? 5 : 3) | 16, z17 ? 0 : i10, 0.0f, z17 ? i10 : 0, 0.0f));
            } else if (i7 == 3) {
                addView(checkBoxSquare, c8.ma.d(18, 18, 51, 0.0f, 15.0f, 0.0f, 0.0f));
            } else if (i7 == 2) {
                addView(checkBoxSquare, c8.ma.d(18, 18, (gd.f24213a0 ? 5 : 3) | 48, 0.0f, 15.0f, 0.0f, 0.0f));
            } else {
                float f13 = 18;
                boolean z18 = gd.f24213a0;
                addView(checkBoxSquare, c8.ma.d(18, f13, (z18 ? 5 : 3) | 48, z18 ? 0 : i10, 16.0f, z18 ? i10 : 0, 0.0f));
            }
        }
        if (i7 == 6) {
            za zaVar = new za(this, context, 2131232162);
            this.f30533w = zaVar;
            addView(zaVar, c8.ma.i(-2.0f, -2.0f, 8388629, f10, 0.0f, i10 - 11, 0.0f));
        } else if (i7 == 8) {
            za zaVar2 = new za(this, context, 0);
            this.f30533w = zaVar2;
            addView(zaVar2, c8.ma.i(-2.0f, -2.0f, 8388629, f10, 0.0f, i10 - 11, 0.0f));
        } else if (i7 == 7) {
            this.f30535y = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
            org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
            this.f30534x = q9Var;
            q9Var.setRoundRadius(org.telegram.messenger.g0.L(17.0f));
            addView(q9Var, c8.ma.i(34.0f, 34.0f, 8388627, 56.0f, 0.0f, 0.0f, 0.0f));
        }
        g();
    }
}
