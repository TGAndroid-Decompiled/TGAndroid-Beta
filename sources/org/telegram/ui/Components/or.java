package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.EditText;
public final class or extends ViewGroup {
    public static final int f38250x = 0;
    public final mr f38251a;
    public EditText f38252b;
    public final View[] f38253c;
    public View d;
    public boolean f38254e;
    public boolean f38255f;
    public final lr h;
    public boolean f38256n;
    public final lr f38257r;
    public int f38258s;
    public int f38259w;

    public or(Context context) {
        super(context);
        String str;
        int i7;
        this.f38253c = new View[12];
        int i10 = 0;
        this.h = new lr(this, 0);
        this.f38257r = new lr(this, 1);
        for (int i11 = 0; i11 < 11; i11++) {
            if (i11 != 9) {
                switch (i11) {
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
                if (i11 != 10) {
                    i7 = i11 + 1;
                } else {
                    i7 = 0;
                }
                String valueOf = String.valueOf(i7);
                this.f38253c[i11] = new nr(context, valueOf, str);
                this.f38253c[i11].setOnClickListener(new l8(7, this, valueOf));
                addView(this.f38253c[i11]);
            }
        }
        mr mrVar = new mr(this, context, new nd0(context, new ki.q3(this, ViewConfiguration.get(context).getScaledTouchSlop(), 1)));
        this.f38251a = mrVar;
        mrVar.setImageResource(2131232098);
        org.telegram.ui.ActionBar.u6.s(mrVar, org.telegram.ui.ActionBar.n6.G6, null, PorterDuff.Mode.SRC_ATOP);
        int L = org.telegram.messenger.g0.L(11.0f);
        mrVar.setPadding(L, L, L, L);
        mrVar.setOnClickListener(new bi.o(16));
        this.f38253c[11] = mrVar;
        addView(mrVar);
        while (true) {
            View[] viewArr = this.f38253c;
            if (i10 < viewArr.length) {
                View view = viewArr[i10];
                if (view != null) {
                    c8.sa.b(view, 0.02f, 1.2f);
                    a(i10, view);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public static void a(int i7, View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        float f10;
        float f11;
        float f12;
        boolean z13 = true;
        if (i7 < 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = i7 % 3;
        if (i10 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i10 == 2) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (i7 <= 8) {
            z13 = false;
        }
        int i11 = org.telegram.ui.ActionBar.n6.f29543i6;
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, i11, false);
        int o4 = i0.a.o(org.telegram.ui.ActionBar.n6.x0(null, i11, false), 30);
        float f13 = 12.0f;
        if (z11 && z10) {
            f10 = 24.0f;
        } else {
            f10 = 12.0f;
        }
        int L = org.telegram.messenger.g0.L(f10);
        if (z12 && z10) {
            f11 = 24.0f;
        } else {
            f11 = 12.0f;
        }
        int L2 = org.telegram.messenger.g0.L(f11);
        if (z12 && z13) {
            f12 = 24.0f;
        } else {
            f12 = 12.0f;
        }
        int L3 = org.telegram.messenger.g0.L(f12);
        if (z11 && z13) {
            f13 = 24.0f;
        }
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.n6.k0(L, L2, L3, org.telegram.messenger.g0.L(f13), x02, o4, o4);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i11);
        org.telegram.ui.ActionBar.q6 g10 = org.telegram.ui.ActionBar.u6.g(i11, 30);
        view.setBackground(k02);
        org.telegram.ui.ActionBar.u6.j(view, k02, M, g10, null);
    }

    @Override
    public final boolean canScrollHorizontally(int i7) {
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int z11 = org.telegram.messenger.m10.z(32.0f, getWidth(), 3);
        int z12 = org.telegram.messenger.m10.z(42.0f, getHeight(), 4);
        int i13 = 0;
        while (true) {
            View[] viewArr = this.f38253c;
            if (i13 < viewArr.length) {
                int L = org.telegram.messenger.g0.L(6.0f) + z11;
                int L2 = org.telegram.messenger.g0.L(10.0f) + (L * (i13 % 3));
                int L3 = org.telegram.messenger.g0.L(6.0f) + z12;
                int L4 = org.telegram.messenger.g0.L(10.0f) + (L3 * (i13 / 3));
                View view = viewArr[i13];
                if (view != null) {
                    view.layout(L2, L4, L2 + z11, L4 + z12);
                }
                i13++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        View[] viewArr;
        setMeasuredDimension(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10));
        int z10 = org.telegram.messenger.m10.z(32.0f, getWidth(), 3);
        int z11 = org.telegram.messenger.m10.z(42.0f, getHeight(), 4);
        for (View view : this.f38253c) {
            if (view != null) {
                view.measure(View.MeasureSpec.makeMeasureSpec(z10, 1073741824), View.MeasureSpec.makeMeasureSpec(z11, 1073741824));
            }
        }
    }

    public void setDispatchBackWhenEmpty(boolean z10) {
        this.f38254e = z10;
    }

    public void setEditText(EditText editText) {
        this.f38252b = editText;
        this.f38254e = false;
    }

    public void setViewToFindFocus(View view) {
        this.d = view;
    }
}
