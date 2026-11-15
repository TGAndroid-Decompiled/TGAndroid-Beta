package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.EditText;
public final class ir extends ViewGroup {
    public static final int f35687x = 0;
    public final gr f35688a;
    public EditText f35689b;
    public final View[] f35690c;
    public View d;
    public boolean f35691e;
    public boolean f35692f;
    public final fr h;
    public boolean f35693n;
    public final fr f35694r;
    public int f35695s;
    public int f35696w;

    public ir(Context context) {
        super(context);
        String str;
        int i7;
        this.f35690c = new View[12];
        int i10 = 0;
        this.h = new fr(this, 0);
        this.f35694r = new fr(this, 1);
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
                this.f35690c[i11] = new hr(context, valueOf, str);
                this.f35690c[i11].setOnClickListener(new n2(12, this, valueOf));
                addView(this.f35690c[i11]);
            }
        }
        gr grVar = new gr(this, context, new org.telegram.messenger.ou(context, new ki.v3(this, ViewConfiguration.get(context).getScaledTouchSlop(), 1)));
        this.f35688a = grVar;
        grVar.setImageResource(2131232094);
        org.telegram.ui.ActionBar.q6.s(grVar, org.telegram.ui.ActionBar.j6.G6, null, PorterDuff.Mode.SRC_ATOP);
        int L = org.telegram.messenger.g0.L(11.0f);
        grVar.setPadding(L, L, L, L);
        grVar.setOnClickListener(new bi.o(14));
        this.f35690c[11] = grVar;
        addView(grVar);
        while (true) {
            View[] viewArr = this.f35690c;
            if (i10 < viewArr.length) {
                View view = viewArr[i10];
                if (view != null) {
                    c8.na.b(view, 0.02f, 1.2f);
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
        int i11 = org.telegram.ui.ActionBar.j6.f28941i6;
        int x02 = org.telegram.ui.ActionBar.j6.x0(null, i11, false);
        int o4 = i0.a.o(org.telegram.ui.ActionBar.j6.x0(null, i11, false), 30);
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
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.j6.k0(L, L2, L3, org.telegram.messenger.g0.L(f13), x02, o4, o4);
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i11);
        org.telegram.ui.ActionBar.m6 g10 = org.telegram.ui.ActionBar.q6.g(i11, 30);
        view.setBackground(k02);
        org.telegram.ui.ActionBar.q6.j(view, k02, M, g10, null);
    }

    @Override
    public final boolean canScrollHorizontally(int i7) {
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int y10 = org.telegram.messenger.i20.y(32.0f, getWidth(), 3);
        int y11 = org.telegram.messenger.i20.y(42.0f, getHeight(), 4);
        int i13 = 0;
        while (true) {
            View[] viewArr = this.f35690c;
            if (i13 < viewArr.length) {
                int L = org.telegram.messenger.g0.L(6.0f) + y10;
                int L2 = org.telegram.messenger.g0.L(10.0f) + (L * (i13 % 3));
                int L3 = org.telegram.messenger.g0.L(6.0f) + y11;
                int L4 = org.telegram.messenger.g0.L(10.0f) + (L3 * (i13 / 3));
                View view = viewArr[i13];
                if (view != null) {
                    view.layout(L2, L4, L2 + y10, L4 + y11);
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
        int y10 = org.telegram.messenger.i20.y(32.0f, getWidth(), 3);
        int y11 = org.telegram.messenger.i20.y(42.0f, getHeight(), 4);
        for (View view : this.f35690c) {
            if (view != null) {
                view.measure(View.MeasureSpec.makeMeasureSpec(y10, 1073741824), View.MeasureSpec.makeMeasureSpec(y11, 1073741824));
            }
        }
    }

    public void setDispatchBackWhenEmpty(boolean z10) {
        this.f35691e = z10;
    }

    public void setEditText(EditText editText) {
        this.f35689b = editText;
        this.f35691e = false;
    }

    public void setViewToFindFocus(View view) {
        this.d = view;
    }
}
