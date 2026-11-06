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
import bi.nc;
import org.telegram.messenger.hd;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.xq;
public final class c2 extends FrameLayout {
    public final int D;
    public final int E;
    public boolean F;
    public boolean G;
    public final boolean H;
    public View I;
    public View J;
    public int f28970a;
    public final org.telegram.ui.ActionBar.f6 f28971b;
    public final b2 f28972c;
    public final a2 d;
    public final View f28973e;
    public final TextView f28974f;
    public final View h;
    public final CheckBoxSquare f28975n;
    public final wo f28976r;
    public View f28977s;
    public final nc f28978w;
    public final org.telegram.ui.Components.l9 f28979x;
    public final org.telegram.ui.Components.w8 f28980y;

    public c2(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        this(context, i7, 17, false, f6Var);
    }

    public final boolean a() {
        int i7 = this.D;
        if (i7 != 4 && i7 != 8 && i7 != 6 && i7 != 7) {
            return false;
        }
        return true;
    }

    public final boolean b() {
        wo woVar = this.f28976r;
        if (woVar != null) {
            return woVar.f40050a.f31258q;
        }
        return this.f28975n.h;
    }

    public final void c(boolean z9, boolean z10) {
        wo woVar = this.f28976r;
        if (woVar != null) {
            woVar.a(z9, z10);
        } else {
            this.f28975n.a(z9, z10);
        }
    }

    public final void d(org.telegram.ui.a aVar, org.telegram.ui.ActionBar.l1 l1Var) {
        int i7;
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
                int i10 = org.telegram.ui.ActionBar.k6.f27940i6;
                org.telegram.ui.ActionBar.f6 f6Var = this.f28971b;
                y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i10, f6Var), 2, -1);
                org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
                view2.setBackground(h02);
                org.telegram.ui.ActionBar.r6.k(view2, h02, null, N, f6Var);
                addView(this.I, c8.ha.e(-1, -1, 119));
            }
            this.I.setOnClickListener(aVar);
        }
        if (l1Var == null) {
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
            if (hd.f22871a0) {
                i7 = 5;
            } else {
                i7 = 3;
            }
            addView(view4, c8.ha.e(56, -1, i7));
        }
        this.J.setOnClickListener(l1Var);
    }

    public final void e(CharSequence charSequence, String str, boolean z9, boolean z10, boolean z11) {
        if (this.H) {
            a2 a2Var = this.d;
            a2Var.c(org.telegram.messenger.i6.m(charSequence, a2Var.getPaint().getFontMetricsInt(), false, null, 0), z11, true);
        } else {
            this.f28972c.setText(charSequence);
        }
        wo woVar = this.f28976r;
        if (woVar != null) {
            woVar.a(z9, z11);
        } else {
            this.f28975n.a(z9, z11);
        }
        this.f28974f.setText(str);
        this.F = z10;
        setWillNotDraw(!z10);
    }

    public final void f() {
        float f10;
        float left;
        View view = this.f28973e;
        if (this.f28977s == null) {
            return;
        }
        try {
            f10 = view.getMeasuredWidth();
        } catch (Exception unused) {
            f10 = 0.0f;
        }
        if (hd.f22871a0) {
            left = (view.getRight() - f10) - org.telegram.messenger.g0.L(20.0f);
        } else {
            left = view.getLeft() + f10 + org.telegram.messenger.g0.L(4.0f);
        }
        this.f28977s.setTranslationX(left);
    }

    public final void g() {
        int i7;
        int i10;
        int i11;
        int i12;
        boolean z9 = this.H;
        org.telegram.ui.ActionBar.f6 f6Var = this.f28971b;
        int i13 = this.D;
        if (z9) {
            if (i13 != 1 && i13 != 5) {
                i12 = org.telegram.ui.ActionBar.k6.G6;
            } else {
                i12 = org.telegram.ui.ActionBar.k6.f27956j5;
            }
            org.telegram.ui.ActionBar.r6.Z(this.d, i12, f6Var);
        } else {
            if (i13 != 1 && i13 != 5) {
                i7 = org.telegram.ui.ActionBar.k6.G6;
            } else {
                i7 = org.telegram.ui.ActionBar.k6.f27956j5;
            }
            b2 b2Var = this.f28972c;
            org.telegram.ui.ActionBar.r6.V(b2Var, i7, f6Var);
            if (i13 != 1 && i13 != 5) {
                i10 = org.telegram.ui.ActionBar.k6.J6;
            } else {
                i10 = org.telegram.ui.ActionBar.k6.f27976k5;
            }
            org.telegram.ui.ActionBar.r6.H(b2Var, i10, f6Var);
        }
        if (i13 != 1 && i13 != 5) {
            i11 = org.telegram.ui.ActionBar.k6.I6;
        } else {
            i11 = org.telegram.ui.ActionBar.k6.f28012m5;
        }
        org.telegram.ui.ActionBar.r6.V(this.f28974f, i11, f6Var);
    }

    public org.telegram.ui.Components.j6 getAnimatedTextView() {
        return this.d;
    }

    public wo getCheckBoxRound() {
        return this.f28976r;
    }

    public View getCheckBoxView() {
        return this.h;
    }

    public TextView getTextView() {
        return this.f28972c;
    }

    public TextView getValueTextView() {
        return this.f28974f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        Paint paint;
        float f11;
        if (this.F) {
            if (a()) {
                f10 = 60.0f;
            } else {
                f10 = 20.0f;
            }
            int L = org.telegram.messenger.g0.L(f10) + ((int) Math.abs(this.f28973e.getTranslationX()));
            if (this.D == 7) {
                L += org.telegram.messenger.g0.L(39.0f);
            }
            org.telegram.ui.ActionBar.f6 f6Var = this.f28971b;
            if (f6Var != null) {
                paint = f6Var.d("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.k6.f27971k0;
            }
            Paint paint2 = paint;
            if (hd.f22871a0) {
                f11 = 0.0f;
            } else {
                f11 = L;
            }
            float f12 = f11;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (!hd.f22871a0) {
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
        a2 a2Var = this.d;
        if (a2Var != null) {
            accessibilityNodeInfo.setText(a2Var.getText());
        } else {
            b2 b2Var = this.f28972c;
            if (b2Var != null) {
                accessibilityNodeInfo.setText(b2Var.getText());
            }
        }
        accessibilityNodeInfo.setChecked(b());
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        int size = View.MeasureSpec.getSize(i7);
        View view = this.h;
        int i11 = this.E;
        View view2 = this.f28973e;
        TextView textView = this.f28974f;
        int i12 = this.D;
        if (i12 == 3) {
            textView.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(10.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
            view2.measure(View.MeasureSpec.makeMeasureSpec(size - org.telegram.messenger.g0.L(34.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), Integer.MIN_VALUE));
            float f11 = i11;
            view.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f11), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f11), 1073741824));
            setMeasuredDimension(org.telegram.messenger.g0.L(29.0f) + view2.getMeasuredWidth(), org.telegram.messenger.g0.L(50.0f));
        } else if (this.G) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(50.0f) + (this.F ? 1 : 0));
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            if (a()) {
                f10 = 60.0f;
            } else {
                f10 = 34.0f;
            }
            int L = measuredWidth - org.telegram.messenger.g0.L(f10);
            if (this.H) {
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
            nc ncVar = this.f28978w;
            if (ncVar != null) {
                ncVar.measure(View.MeasureSpec.makeMeasureSpec(i13, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                measuredWidth2 = org.telegram.messenger.camera.q.D(11.0f, ncVar.getMeasuredWidth(), measuredWidth2);
            }
            if (view2.getLayoutParams().width == -1) {
                view2.measure(org.telegram.messenger.camera.q.c(8.0f, (L - ((int) Math.abs(view2.getTranslationX()))) - measuredWidth2, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
            } else {
                view2.measure(org.telegram.messenger.camera.q.c(8.0f, (L - ((int) Math.abs(view2.getTranslationX()))) - measuredWidth2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
            }
            org.telegram.ui.Components.l9 l9Var = this.f28979x;
            if (l9Var != null) {
                l9Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(34.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(34.0f), 1073741824));
            }
            float f12 = i11;
            view.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f12), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f12), 1073741824));
        }
        View view3 = this.I;
        if (view3 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
            this.I.measure(View.MeasureSpec.makeMeasureSpec((size - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
        }
        View view4 = this.J;
        if (view4 != null) {
            view4.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
        }
        View view5 = this.f28977s;
        if (view5 != null) {
            view5.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(16.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(16.0f), 1073741824));
        }
    }

    public void setCollapsed(Boolean bool) {
        float f10;
        if (bool == null) {
            View view = this.f28977s;
            if (view != null) {
                removeView(view);
                this.f28977s = null;
                return;
            }
            return;
        }
        if (this.f28977s == null) {
            this.f28977s = new View(getContext());
            Drawable mutate = getContext().getResources().getDrawable(2131230871).mutate();
            org.telegram.ui.ActionBar.r6.y(this, mutate, org.telegram.ui.ActionBar.k6.G6, this.f28971b, PorterDuff.Mode.MULTIPLY);
            this.f28977s.setBackground(mutate);
            addView(this.f28977s, c8.ha.e(16, 16, 16));
        }
        f();
        this.f28977s.animate().cancel();
        ViewPropertyAnimator animate = this.f28977s.animate();
        if (bool.booleanValue()) {
            f10 = 0.0f;
        } else {
            f10 = 180.0f;
        }
        animate.rotation(f10).setDuration(340L).setInterpolator(xq.h).start();
    }

    @Override
    public void setEnabled(boolean z9) {
        float f10;
        float f11;
        super.setEnabled(z9);
        float f12 = 0.5f;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        this.f28973e.setAlpha(f10);
        if (z9) {
            f11 = 1.0f;
        } else {
            f11 = 0.5f;
        }
        this.f28974f.setAlpha(f11);
        if (z9) {
            f12 = 1.0f;
        }
        this.h.setAlpha(f12);
    }

    public void setIcon(int i7) {
        this.f28976r.setIcon(i7);
    }

    public void setMultiline(boolean z9) {
        if (this.H) {
            return;
        }
        this.G = z9;
        View view = this.f28973e;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        View view2 = this.h;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view2.getLayoutParams();
        boolean z10 = this.G;
        b2 b2Var = this.f28972c;
        if (z10) {
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
            layoutParams2.topMargin = org.telegram.messenger.g0.L(15.0f);
        }
        view.setLayoutParams(layoutParams);
        view2.setLayoutParams(layoutParams2);
    }

    public void setNeedDivider(boolean z9) {
        this.F = z9;
    }

    public void setPad(int i7) {
        int i10;
        int i11 = i7 * 40;
        if (hd.f22871a0) {
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
        this.f28973e.setTranslationX(f10);
        org.telegram.ui.Components.l9 l9Var = this.f28979x;
        if (l9Var != null) {
            l9Var.setTranslationX(f10);
        }
        View view2 = this.I;
        if (view2 != null) {
            view2.setTranslationX(f10);
        }
        View view3 = this.J;
        if (view3 != null) {
            view3.setTranslationX(f10);
        }
    }

    public void setTextColor(int i7) {
        int i10;
        if (this.H) {
            a2 a2Var = this.d;
            org.telegram.ui.ActionBar.r6.r(a2Var);
            a2Var.setTextColor(i7);
            return;
        }
        b2 b2Var = this.f28972c;
        org.telegram.ui.ActionBar.r6.r(b2Var);
        b2Var.setTextColor(i7);
        int i11 = this.D;
        if (i11 != 1 && i11 != 5) {
            i10 = org.telegram.ui.ActionBar.k6.J6;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.f27976k5;
        }
        if (b2Var.getLinkTextColors() != null) {
            int defaultColor = b2Var.getLinkTextColors().getDefaultColor();
            org.telegram.ui.ActionBar.f6 f6Var = this.f28971b;
            if (defaultColor == org.telegram.ui.ActionBar.k6.w0(i10, f6Var)) {
                org.telegram.ui.ActionBar.r6.H(b2Var, i10, f6Var);
            }
        }
    }

    public void setUserOrChat(TLObject tLObject) {
        String o4;
        org.telegram.ui.Components.w8 w8Var = this.f28980y;
        w8Var.l(tLObject);
        this.f28979x.e(tLObject, w8Var);
        boolean z9 = tLObject instanceof TLRPC.User;
        if (z9) {
            o4 = t10.p((TLRPC.User) tLObject);
        } else {
            o4 = org.telegram.messenger.g5.o(tLObject);
        }
        if (z9 && ((TLRPC.User) tLObject).f27101id == qp.s1(p10.f24459s0).f24757e5) {
            o4 = hd.M0(2131752460, null);
        }
        if (this.H) {
            a2 a2Var = this.d;
            a2Var.setText(org.telegram.messenger.i6.m(o4, a2Var.getPaint().getFontMetricsInt(), false, null, 0));
            return;
        }
        this.f28972c.setText(o4);
    }

    public c2(Context context, int i7) {
        this(context, i7, 17, false, null);
    }

    public c2(Context context, int i7, int i10, boolean z9, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f28971b = f6Var;
        this.D = i7;
        this.H = z9;
        boolean z10 = true;
        if (z9) {
            a2 a2Var = new a2(this, context, 0);
            this.d = a2Var;
            qs.i(a2Var);
            a2Var.setEllipsizeByGradient(true);
            a2Var.setRightPadding(org.telegram.messenger.g0.L(8.0f));
            a2Var.getDrawable().r(true, false);
            a2Var.setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0((i7 == 1 || i7 == 5) ? org.telegram.ui.ActionBar.k6.f27956j5 : org.telegram.ui.ActionBar.k6.G6, f6Var)));
            a2Var.setTextSize(org.telegram.messenger.g0.L(16.0f));
            if (i7 == 7) {
                a2Var.setTypeface(org.telegram.messenger.g0.o());
            }
            if (i7 == 3) {
                a2Var.setGravity(19);
                addView(a2Var, c8.ha.d(-1, -2.0f, 19, 29.0f, 0.0f, 0.0f, 0.0f));
                a2Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(3.0f));
            } else {
                a2Var.setRightPadding(org.telegram.messenger.g0.L(i10));
                a2Var.setGravity((hd.f22871a0 ? 5 : 3) | 16);
                if (i7 == 2) {
                    boolean z11 = hd.f22871a0;
                    addView(a2Var, c8.ha.d(-1, -2.0f, (z11 ? 5 : 3) | 16, z11 ? 8 : 29, 0.0f, z11 ? 29 : 8, 0.0f));
                } else {
                    int i11 = a() ? 56 : 46;
                    i11 = i7 == 7 ? i11 + 39 : i11;
                    boolean z12 = hd.f22871a0;
                    addView(a2Var, c8.ha.d(-1, -2.0f, (z12 ? 5 : 3) | 16, z12 ? i10 : (i10 - 17) + i11, 0.0f, z12 ? (i10 - 17) + i11 : i10, 0.0f));
                }
            }
            this.f28973e = a2Var;
        } else {
            b2 b2Var = new b2(0, context, this);
            this.f28972c = b2Var;
            qs.i(b2Var);
            b2Var.setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0((i7 == 1 || i7 == 5) ? org.telegram.ui.ActionBar.k6.f27956j5 : org.telegram.ui.ActionBar.k6.G6, f6Var)));
            b2Var.setTextSize(1, 16.0f);
            b2Var.setLines(1);
            b2Var.setMaxLines(1);
            b2Var.setSingleLine(true);
            b2Var.setEllipsize(TextUtils.TruncateAt.END);
            if (i7 == 7) {
                b2Var.setTypeface(org.telegram.messenger.g0.o());
            }
            if (i7 == 3) {
                b2Var.setGravity(19);
                addView(b2Var, c8.ha.d(-1, -2.0f, 19, 29.0f, 0.0f, 0.0f, 0.0f));
                b2Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(3.0f));
            } else {
                b2Var.setGravity((hd.f22871a0 ? 5 : 3) | 16);
                if (i7 == 2) {
                    boolean z13 = hd.f22871a0;
                    addView(b2Var, c8.ha.d(-1, -2.0f, (z13 ? 5 : 3) | 16, z13 ? 8 : 29, 0.0f, z13 ? 29 : 8, 0.0f));
                } else {
                    int i12 = a() ? 56 : 46;
                    i12 = i7 == 7 ? i12 + 39 : i12;
                    int i13 = a() ? -2 : -1;
                    boolean z14 = hd.f22871a0;
                    addView(b2Var, c8.ha.d(i13, -2.0f, (z14 ? 5 : 3) | 16, z14 ? i10 : (i10 - 17) + i12, 0.0f, z14 ? (i10 - 17) + i12 : i10, 0.0f));
                }
            }
            this.f28973e = b2Var;
        }
        TextView textView = new TextView(context);
        this.f28974f = textView;
        textView.setTag(Integer.valueOf((i7 == 1 || i7 == 5) ? org.telegram.ui.ActionBar.k6.f28012m5 : org.telegram.ui.ActionBar.k6.I6));
        textView.setTextSize(1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((hd.f22871a0 ? 3 : 5) | 16);
        float f10 = i10;
        addView(textView, c8.ha.d(-2, -1.0f, (hd.f22871a0 ? 3 : 5) | 48, f10, 0.0f, f10, 0.0f));
        if (a()) {
            wo woVar = new wo(21, context, f6Var);
            this.f28976r = woVar;
            this.h = woVar;
            woVar.setDrawUnchecked(true);
            woVar.a(true, false);
            woVar.setDrawBackgroundAsArc(10);
            this.E = 21;
            float f11 = 21;
            boolean z15 = hd.f22871a0;
            addView(woVar, c8.ha.d(21, f11, (z15 ? 5 : 3) | 48, z15 ? 0 : i10, 16.0f, z15 ? i10 : 0, 0.0f));
        } else {
            if (i7 != 1 && i7 != 5) {
                z10 = false;
            }
            CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, f6Var, z10);
            this.f28975n = checkBoxSquare;
            this.h = checkBoxSquare;
            this.E = 18;
            if (i7 == 5) {
                float f12 = 18;
                boolean z16 = hd.f22871a0;
                addView(checkBoxSquare, c8.ha.d(18, f12, (z16 ? 5 : 3) | 16, z16 ? 0 : i10, 0.0f, z16 ? i10 : 0, 0.0f));
            } else if (i7 == 3) {
                addView(checkBoxSquare, c8.ha.d(18, 18, 51, 0.0f, 15.0f, 0.0f, 0.0f));
            } else if (i7 == 2) {
                addView(checkBoxSquare, c8.ha.d(18, 18, (hd.f22871a0 ? 5 : 3) | 48, 0.0f, 15.0f, 0.0f, 0.0f));
            } else {
                float f13 = 18;
                boolean z17 = hd.f22871a0;
                addView(checkBoxSquare, c8.ha.d(18, f13, (z17 ? 5 : 3) | 48, z17 ? 0 : i10, 16.0f, z17 ? i10 : 0, 0.0f));
            }
        }
        if (i7 == 6) {
            nc ncVar = new nc(this, context, 2131232160);
            this.f28978w = ncVar;
            addView(ncVar, c8.ha.i(-2.0f, -2.0f, 8388629, f10, 0.0f, i10 - 11, 0.0f));
        } else if (i7 == 8) {
            nc ncVar2 = new nc(this, context, 0);
            this.f28978w = ncVar2;
            addView(ncVar2, c8.ha.i(-2.0f, -2.0f, 8388629, f10, 0.0f, i10 - 11, 0.0f));
        } else if (i7 == 7) {
            this.f28980y = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
            org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
            this.f28979x = l9Var;
            l9Var.setRoundRadius(org.telegram.messenger.g0.L(17.0f));
            addView(l9Var, c8.ha.i(34.0f, 34.0f, 8388627, 56.0f, 0.0f, 0.0f, 0.0f));
        }
        g();
    }
}
