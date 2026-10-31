package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.EditText;
public final class lr extends ViewGroup {
    public static final int f28167x = 0;
    public final ir f28168a;
    public EditText f28169b;
    public final View[] f28170c;
    public View d;
    public boolean e;
    public boolean f28171f;
    public final hr h;
    public boolean f28172n;
    public final hr f28173r;
    public int f28174s;
    public int f28175w;

    public lr(Context context) {
        super(context);
        String str;
        int i10;
        this.f28170c = new View[12];
        int i11 = 0;
        this.h = new hr(this, 0);
        this.f28173r = new hr(this, 1);
        for (int i12 = 0; i12 < 11; i12++) {
            if (i12 != 9) {
                switch (i12) {
                    case 1:
                        str = "ABC";
                        break;
                    case 2:
                        str = "DEF";
                        break;
                    case 3:
                        str = "GHI";
                        break;
                    case 4:
                        str = "JKL";
                        break;
                    case 5:
                        str = "MNO";
                        break;
                    case 6:
                        str = "PQRS";
                        break;
                    case 7:
                        str = "TUV";
                        break;
                    case 8:
                        str = "WXYZ";
                        break;
                    case 9:
                    default:
                        str = "";
                        break;
                    case 10:
                        str = "+";
                        break;
                }
                if (i12 != 10) {
                    i10 = i12 + 1;
                } else {
                    i10 = 0;
                }
                String valueOf = String.valueOf(i10);
                this.f28170c[i12] = new kr(context, valueOf, str);
                this.f28170c[i12].setOnClickListener(new org.telegram.ui.ud(28, this, valueOf));
                addView(this.f28170c[i12]);
            }
        }
        ir irVar = new ir(this, context, new m2.t(context, new jr(this, ViewConfiguration.get(context).getScaledTouchSlop(), 0)));
        this.f28168a = irVar;
        irVar.setImageResource(2131232092);
        org.telegram.ui.ActionBar.a7.t(irVar, org.telegram.ui.ActionBar.t6.G6, null, PorterDuff.Mode.SRC_ATOP);
        int L = org.telegram.messenger.i0.L(11.0f);
        irVar.setPadding(L, L, L, L);
        irVar.setOnClickListener(new bh.c(7));
        this.f28170c[11] = irVar;
        addView(irVar);
        while (true) {
            View[] viewArr = this.f28170c;
            if (i11 < viewArr.length) {
                View view = viewArr[i11];
                if (view != null) {
                    w7.e6.b(view, 0.02f, 1.2f);
                    a(i11, view);
                }
                i11++;
            } else {
                return;
            }
        }
    }

    public static void a(int i10, View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        float f7;
        float f10;
        float f11;
        boolean z13 = true;
        if (i10 < 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = i10 % 3;
        if (i11 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i11 == 2) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (i10 <= 8) {
            z13 = false;
        }
        int i12 = org.telegram.ui.ActionBar.t6.f21020i6;
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, i12, false);
        int o10 = i0.b.o(org.telegram.ui.ActionBar.t6.x0(null, i12, false), 30);
        float f12 = 12.0f;
        if (z11 && z10) {
            f7 = 24.0f;
        } else {
            f7 = 12.0f;
        }
        int L = org.telegram.messenger.i0.L(f7);
        if (z12 && z10) {
            f10 = 24.0f;
        } else {
            f10 = 12.0f;
        }
        int L2 = org.telegram.messenger.i0.L(f10);
        if (z12 && z13) {
            f11 = 24.0f;
        } else {
            f11 = 12.0f;
        }
        int L3 = org.telegram.messenger.i0.L(f11);
        if (z11 && z13) {
            f12 = 24.0f;
        }
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.t6.k0(L, L2, L3, org.telegram.messenger.i0.L(f12), x02, o10, o10);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i12);
        org.telegram.ui.ActionBar.w6 h = org.telegram.ui.ActionBar.a7.h(i12, 30);
        view.setBackground(k02);
        org.telegram.ui.ActionBar.a7.k(view, k02, N, h, null);
    }

    @Override
    public final boolean canScrollHorizontally(int i10) {
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int y3 = org.telegram.messenger.z20.y(32.0f, getWidth(), 3);
        int y10 = org.telegram.messenger.z20.y(42.0f, getHeight(), 4);
        int i14 = 0;
        while (true) {
            View[] viewArr = this.f28170c;
            if (i14 < viewArr.length) {
                int L = org.telegram.messenger.i0.L(6.0f) + y3;
                int L2 = org.telegram.messenger.i0.L(10.0f) + (L * (i14 % 3));
                int L3 = org.telegram.messenger.i0.L(6.0f) + y10;
                int L4 = org.telegram.messenger.i0.L(10.0f) + (L3 * (i14 / 3));
                View view = viewArr[i14];
                if (view != null) {
                    view.layout(L2, L4, L2 + y3, L4 + y10);
                }
                i14++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        View[] viewArr;
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        int y3 = org.telegram.messenger.z20.y(32.0f, getWidth(), 3);
        int y10 = org.telegram.messenger.z20.y(42.0f, getHeight(), 4);
        for (View view : this.f28170c) {
            if (view != null) {
                view.measure(View.MeasureSpec.makeMeasureSpec(y3, 1073741824), View.MeasureSpec.makeMeasureSpec(y10, 1073741824));
            }
        }
    }

    public void setDispatchBackWhenEmpty(boolean z10) {
        this.e = z10;
    }

    public void setEditText(EditText editText) {
        this.f28169b = editText;
        this.e = false;
    }

    public void setViewToFindFocus(View view) {
        this.d = view;
    }
}
