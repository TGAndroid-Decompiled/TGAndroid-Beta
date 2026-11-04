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
import b8.mf;
import ci.gb;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.xq;
public final class c2 extends FrameLayout {
    public final int E;
    public final int F;
    public boolean G;
    public boolean H;
    public final boolean I;
    public View J;
    public View K;
    public int f29032a;
    public final org.telegram.ui.ActionBar.e6 f29033b;
    public final b2 f29034c;
    public final a2 d;
    public final View f29035e;
    public final TextView f29036f;
    public final View h;
    public final CheckBoxSquare f29037n;
    public final wo f29038r;
    public View f29039s;
    public final gb f29040w;
    public final org.telegram.ui.Components.k9 f29041x;
    public final org.telegram.ui.Components.u8 f29042y;

    public c2(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        this(context, i3, 17, false, e6Var);
    }

    public final boolean a() {
        int i3 = this.E;
        if (i3 != 4 && i3 != 8 && i3 != 6 && i3 != 7) {
            return false;
        }
        return true;
    }

    public final boolean b() {
        wo woVar = this.f29038r;
        if (woVar != null) {
            return woVar.f40035a.f31334q;
        }
        return this.f29037n.h;
    }

    public final void c(boolean z10, boolean z11) {
        wo woVar = this.f29038r;
        if (woVar != null) {
            woVar.a(z10, z11);
        } else {
            this.f29037n.a(z10, z11);
        }
    }

    public final void d(org.telegram.ui.a aVar, org.telegram.messenger.video.g gVar) {
        int i3;
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
                int i10 = org.telegram.ui.ActionBar.k6.f27972i6;
                org.telegram.ui.ActionBar.e6 e6Var = this.f29033b;
                y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i10, e6Var), 2, -1);
                org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
                view2.setBackground(h02);
                org.telegram.ui.ActionBar.r6.k(view2, h02, null, N, e6Var);
                addView(this.J, mf.e(-1, -1, 119));
            }
            this.J.setOnClickListener(aVar);
        }
        if (gVar == null) {
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
            if (bd.f21784a0) {
                i3 = 5;
            } else {
                i3 = 3;
            }
            addView(view4, mf.e(56, -1, i3));
        }
        this.K.setOnClickListener(gVar);
    }

    public final void e(CharSequence charSequence, String str, boolean z10, boolean z11, boolean z12) {
        if (this.I) {
            a2 a2Var = this.d;
            a2Var.c(org.telegram.messenger.i6.m(charSequence, a2Var.getPaint().getFontMetricsInt(), false, null, 0), z12, true);
        } else {
            this.f29034c.setText(charSequence);
        }
        wo woVar = this.f29038r;
        if (woVar != null) {
            woVar.a(z10, z12);
        } else {
            this.f29037n.a(z10, z12);
        }
        this.f29036f.setText(str);
        this.G = z11;
        setWillNotDraw(!z11);
    }

    public final void f() {
        float f10;
        float left;
        View view = this.f29035e;
        if (this.f29039s == null) {
            return;
        }
        try {
            f10 = view.getMeasuredWidth();
        } catch (Exception unused) {
            f10 = 0.0f;
        }
        if (bd.f21784a0) {
            left = (view.getRight() - f10) - org.telegram.messenger.g0.L(20.0f);
        } else {
            left = view.getLeft() + f10 + org.telegram.messenger.g0.L(4.0f);
        }
        this.f29039s.setTranslationX(left);
    }

    public final void g() {
        int i3;
        int i10;
        int i11;
        int i12;
        boolean z10 = this.I;
        org.telegram.ui.ActionBar.e6 e6Var = this.f29033b;
        int i13 = this.E;
        if (z10) {
            if (i13 != 1 && i13 != 5) {
                i12 = org.telegram.ui.ActionBar.k6.G6;
            } else {
                i12 = org.telegram.ui.ActionBar.k6.f27988j5;
            }
            org.telegram.ui.ActionBar.r6.Z(this.d, i12, e6Var);
        } else {
            if (i13 != 1 && i13 != 5) {
                i3 = org.telegram.ui.ActionBar.k6.G6;
            } else {
                i3 = org.telegram.ui.ActionBar.k6.f27988j5;
            }
            b2 b2Var = this.f29034c;
            org.telegram.ui.ActionBar.r6.V(b2Var, i3, e6Var);
            if (i13 != 1 && i13 != 5) {
                i10 = org.telegram.ui.ActionBar.k6.J6;
            } else {
                i10 = org.telegram.ui.ActionBar.k6.f28006k5;
            }
            org.telegram.ui.ActionBar.r6.H(b2Var, i10, e6Var);
        }
        if (i13 != 1 && i13 != 5) {
            i11 = org.telegram.ui.ActionBar.k6.I6;
        } else {
            i11 = org.telegram.ui.ActionBar.k6.f28042m5;
        }
        org.telegram.ui.ActionBar.r6.V(this.f29036f, i11, e6Var);
    }

    public org.telegram.ui.Components.h6 getAnimatedTextView() {
        return this.d;
    }

    public wo getCheckBoxRound() {
        return this.f29038r;
    }

    public View getCheckBoxView() {
        return this.h;
    }

    public TextView getTextView() {
        return this.f29034c;
    }

    public TextView getValueTextView() {
        return this.f29036f;
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
            int L = org.telegram.messenger.g0.L(f10) + ((int) Math.abs(this.f29035e.getTranslationX()));
            if (this.E == 7) {
                L += org.telegram.messenger.g0.L(39.0f);
            }
            org.telegram.ui.ActionBar.e6 e6Var = this.f29033b;
            if (e6Var != null) {
                paint = e6Var.d("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.k6.f28002k0;
            }
            Paint paint2 = paint;
            if (bd.f21784a0) {
                f11 = 0.0f;
            } else {
                f11 = L;
            }
            float f12 = f11;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (!bd.f21784a0) {
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
            b2 b2Var = this.f29034c;
            if (b2Var != null) {
                accessibilityNodeInfo.setText(b2Var.getText());
            }
        }
        accessibilityNodeInfo.setChecked(b());
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        float f10;
        int size = View.MeasureSpec.getSize(i3);
        View view = this.h;
        int i11 = this.F;
        View view2 = this.f29035e;
        TextView textView = this.f29036f;
        int i12 = this.E;
        if (i12 == 3) {
            textView.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(10.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
            view2.measure(View.MeasureSpec.makeMeasureSpec(size - org.telegram.messenger.g0.L(34.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), Integer.MIN_VALUE));
            float f11 = i11;
            view.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f11), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f11), 1073741824));
            setMeasuredDimension(org.telegram.messenger.g0.L(29.0f) + view2.getMeasuredWidth(), org.telegram.messenger.g0.L(50.0f));
        } else if (this.H) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(i3), org.telegram.messenger.g0.L(50.0f) + (this.G ? 1 : 0));
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
            gb gbVar = this.f29040w;
            if (gbVar != null) {
                gbVar.measure(View.MeasureSpec.makeMeasureSpec(i13, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                measuredWidth2 = org.telegram.messenger.camera.q.D(11.0f, gbVar.getMeasuredWidth(), measuredWidth2);
            }
            if (view2.getLayoutParams().width == -1) {
                view2.measure(org.telegram.messenger.camera.q.c(8.0f, (L - ((int) Math.abs(view2.getTranslationX()))) - measuredWidth2, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
            } else {
                view2.measure(org.telegram.messenger.camera.q.c(8.0f, (L - ((int) Math.abs(view2.getTranslationX()))) - measuredWidth2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
            }
            org.telegram.ui.Components.k9 k9Var = this.f29041x;
            if (k9Var != null) {
                k9Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(34.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(34.0f), 1073741824));
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
        View view5 = this.f29039s;
        if (view5 != null) {
            view5.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(16.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(16.0f), 1073741824));
        }
    }

    public void setCollapsed(Boolean bool) {
        float f10;
        if (bool == null) {
            View view = this.f29039s;
            if (view != null) {
                removeView(view);
                this.f29039s = null;
                return;
            }
            return;
        }
        if (this.f29039s == null) {
            this.f29039s = new View(getContext());
            Drawable mutate = getContext().getResources().getDrawable(2131230871).mutate();
            org.telegram.ui.ActionBar.r6.y(this, mutate, org.telegram.ui.ActionBar.k6.G6, this.f29033b, PorterDuff.Mode.MULTIPLY);
            this.f29039s.setBackground(mutate);
            addView(this.f29039s, mf.e(16, 16, 16));
        }
        f();
        this.f29039s.animate().cancel();
        ViewPropertyAnimator animate = this.f29039s.animate();
        if (bool.booleanValue()) {
            f10 = 0.0f;
        } else {
            f10 = 180.0f;
        }
        animate.rotation(f10).setDuration(340L).setInterpolator(xq.h).start();
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
        this.f29035e.setAlpha(f10);
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.5f;
        }
        this.f29036f.setAlpha(f11);
        if (z10) {
            f12 = 1.0f;
        }
        this.h.setAlpha(f12);
    }

    public void setIcon(int i3) {
        this.f29038r.setIcon(i3);
    }

    public void setMultiline(boolean z10) {
        if (this.I) {
            return;
        }
        this.H = z10;
        View view = this.f29035e;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        View view2 = this.h;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view2.getLayoutParams();
        boolean z11 = this.H;
        b2 b2Var = this.f29034c;
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
            layoutParams2.topMargin = org.telegram.messenger.g0.L(15.0f);
        }
        view.setLayoutParams(layoutParams);
        view2.setLayoutParams(layoutParams2);
    }

    public void setNeedDivider(boolean z10) {
        this.G = z10;
    }

    public void setPad(int i3) {
        int i10;
        int i11 = i3 * 40;
        if (bd.f21784a0) {
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
        this.f29035e.setTranslationX(f10);
        org.telegram.ui.Components.k9 k9Var = this.f29041x;
        if (k9Var != null) {
            k9Var.setTranslationX(f10);
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

    public void setTextColor(int i3) {
        int i10;
        if (this.I) {
            a2 a2Var = this.d;
            org.telegram.ui.ActionBar.r6.r(a2Var);
            a2Var.setTextColor(i3);
            return;
        }
        b2 b2Var = this.f29034c;
        org.telegram.ui.ActionBar.r6.r(b2Var);
        b2Var.setTextColor(i3);
        int i11 = this.E;
        if (i11 != 1 && i11 != 5) {
            i10 = org.telegram.ui.ActionBar.k6.J6;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.f28006k5;
        }
        if (b2Var.getLinkTextColors() != null) {
            int defaultColor = b2Var.getLinkTextColors().getDefaultColor();
            org.telegram.ui.ActionBar.e6 e6Var = this.f29033b;
            if (defaultColor == org.telegram.ui.ActionBar.k6.w0(i10, e6Var)) {
                org.telegram.ui.ActionBar.r6.H(b2Var, i10, e6Var);
            }
        }
    }

    public void setUserOrChat(TLObject tLObject) {
        String o10;
        org.telegram.ui.Components.u8 u8Var = this.f29042y;
        u8Var.l(tLObject);
        this.f29041x.e(tLObject, u8Var);
        boolean z10 = tLObject instanceof TLRPC.User;
        if (z10) {
            o10 = l10.p((TLRPC.User) tLObject);
        } else {
            o10 = org.telegram.messenger.g5.o(tLObject);
        }
        if (z10 && ((TLRPC.User) tLObject).f27150id == hp.s1(h10.f22829t0).f22997e5) {
            o10 = bd.M0(2131752460, null);
        }
        if (this.I) {
            a2 a2Var = this.d;
            a2Var.setText(org.telegram.messenger.i6.m(o10, a2Var.getPaint().getFontMetricsInt(), false, null, 0));
            return;
        }
        this.f29034c.setText(o10);
    }

    public c2(Context context, int i3) {
        this(context, i3, 17, false, null);
    }

    public c2(Context context, int i3, int i10, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f29033b = e6Var;
        this.E = i3;
        this.I = z10;
        boolean z11 = true;
        if (z10) {
            a2 a2Var = new a2(this, context, 0);
            this.d = a2Var;
            hs.i(a2Var);
            a2Var.setEllipsizeByGradient(true);
            a2Var.setRightPadding(org.telegram.messenger.g0.L(8.0f));
            a2Var.getDrawable().r(true, false);
            a2Var.setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0((i3 == 1 || i3 == 5) ? org.telegram.ui.ActionBar.k6.f27988j5 : org.telegram.ui.ActionBar.k6.G6, e6Var)));
            a2Var.setTextSize(org.telegram.messenger.g0.L(16.0f));
            if (i3 == 7) {
                a2Var.setTypeface(org.telegram.messenger.g0.o());
            }
            if (i3 == 3) {
                a2Var.setGravity(19);
                addView(a2Var, mf.d(-1, -2.0f, 19, 29.0f, 0.0f, 0.0f, 0.0f));
                a2Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(3.0f));
            } else {
                a2Var.setRightPadding(org.telegram.messenger.g0.L(i10));
                a2Var.setGravity((bd.f21784a0 ? 5 : 3) | 16);
                if (i3 == 2) {
                    boolean z12 = bd.f21784a0;
                    addView(a2Var, mf.d(-1, -2.0f, (z12 ? 5 : 3) | 16, z12 ? 8 : 29, 0.0f, z12 ? 29 : 8, 0.0f));
                } else {
                    int i11 = a() ? 56 : 46;
                    i11 = i3 == 7 ? i11 + 39 : i11;
                    boolean z13 = bd.f21784a0;
                    addView(a2Var, mf.d(-1, -2.0f, (z13 ? 5 : 3) | 16, z13 ? i10 : (i10 - 17) + i11, 0.0f, z13 ? (i10 - 17) + i11 : i10, 0.0f));
                }
            }
            this.f29035e = a2Var;
        } else {
            b2 b2Var = new b2(0, context, this);
            this.f29034c = b2Var;
            hs.i(b2Var);
            b2Var.setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0((i3 == 1 || i3 == 5) ? org.telegram.ui.ActionBar.k6.f27988j5 : org.telegram.ui.ActionBar.k6.G6, e6Var)));
            b2Var.setTextSize(1, 16.0f);
            b2Var.setLines(1);
            b2Var.setMaxLines(1);
            b2Var.setSingleLine(true);
            b2Var.setEllipsize(TextUtils.TruncateAt.END);
            if (i3 == 7) {
                b2Var.setTypeface(org.telegram.messenger.g0.o());
            }
            if (i3 == 3) {
                b2Var.setGravity(19);
                addView(b2Var, mf.d(-1, -2.0f, 19, 29.0f, 0.0f, 0.0f, 0.0f));
                b2Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(3.0f));
            } else {
                b2Var.setGravity((bd.f21784a0 ? 5 : 3) | 16);
                if (i3 == 2) {
                    boolean z14 = bd.f21784a0;
                    addView(b2Var, mf.d(-1, -2.0f, (z14 ? 5 : 3) | 16, z14 ? 8 : 29, 0.0f, z14 ? 29 : 8, 0.0f));
                } else {
                    int i12 = a() ? 56 : 46;
                    i12 = i3 == 7 ? i12 + 39 : i12;
                    int i13 = a() ? -2 : -1;
                    boolean z15 = bd.f21784a0;
                    addView(b2Var, mf.d(i13, -2.0f, (z15 ? 5 : 3) | 16, z15 ? i10 : (i10 - 17) + i12, 0.0f, z15 ? (i10 - 17) + i12 : i10, 0.0f));
                }
            }
            this.f29035e = b2Var;
        }
        TextView textView = new TextView(context);
        this.f29036f = textView;
        textView.setTag(Integer.valueOf((i3 == 1 || i3 == 5) ? org.telegram.ui.ActionBar.k6.f28042m5 : org.telegram.ui.ActionBar.k6.I6));
        textView.setTextSize(1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((bd.f21784a0 ? 3 : 5) | 16);
        float f10 = i10;
        addView(textView, mf.d(-2, -1.0f, (bd.f21784a0 ? 3 : 5) | 48, f10, 0.0f, f10, 0.0f));
        if (a()) {
            wo woVar = new wo(21, context, e6Var);
            this.f29038r = woVar;
            this.h = woVar;
            woVar.setDrawUnchecked(true);
            woVar.a(true, false);
            woVar.setDrawBackgroundAsArc(10);
            this.F = 21;
            float f11 = 21;
            boolean z16 = bd.f21784a0;
            addView(woVar, mf.d(21, f11, (z16 ? 5 : 3) | 48, z16 ? 0 : i10, 16.0f, z16 ? i10 : 0, 0.0f));
        } else {
            if (i3 != 1 && i3 != 5) {
                z11 = false;
            }
            CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, e6Var, z11);
            this.f29037n = checkBoxSquare;
            this.h = checkBoxSquare;
            this.F = 18;
            if (i3 == 5) {
                float f12 = 18;
                boolean z17 = bd.f21784a0;
                addView(checkBoxSquare, mf.d(18, f12, (z17 ? 5 : 3) | 16, z17 ? 0 : i10, 0.0f, z17 ? i10 : 0, 0.0f));
            } else if (i3 == 3) {
                addView(checkBoxSquare, mf.d(18, 18, 51, 0.0f, 15.0f, 0.0f, 0.0f));
            } else if (i3 == 2) {
                addView(checkBoxSquare, mf.d(18, 18, (bd.f21784a0 ? 5 : 3) | 48, 0.0f, 15.0f, 0.0f, 0.0f));
            } else {
                float f13 = 18;
                boolean z18 = bd.f21784a0;
                addView(checkBoxSquare, mf.d(18, f13, (z18 ? 5 : 3) | 48, z18 ? 0 : i10, 16.0f, z18 ? i10 : 0, 0.0f));
            }
        }
        if (i3 == 6) {
            gb gbVar = new gb(this, context, 2131232160);
            this.f29040w = gbVar;
            addView(gbVar, mf.i(-2.0f, -2.0f, 8388629, f10, 0.0f, i10 - 11, 0.0f));
        } else if (i3 == 8) {
            gb gbVar2 = new gb(this, context, 0);
            this.f29040w = gbVar2;
            addView(gbVar2, mf.i(-2.0f, -2.0f, 8388629, f10, 0.0f, i10 - 11, 0.0f));
        } else if (i3 == 7) {
            this.f29042y = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
            org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
            this.f29041x = k9Var;
            k9Var.setRoundRadius(org.telegram.messenger.g0.L(17.0f));
            addView(k9Var, mf.i(34.0f, 34.0f, 8388627, 56.0f, 0.0f, 0.0f, 0.0f));
        }
        g();
    }
}
