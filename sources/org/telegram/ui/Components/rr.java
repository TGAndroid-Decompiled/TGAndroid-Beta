package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.EditText;
public final class rr extends ViewGroup {
    public static final int f39276x = 0;
    public final pr f39277a;
    public EditText f39278b;
    public final View[] f39279c;
    public View d;
    public boolean f39280e;
    public boolean f39281f;
    public final or h;
    public boolean f39282n;
    public final or f39283r;
    public int f39284s;
    public int f39285w;

    public rr(Context context) {
        super(context);
        String str;
        int i7;
        this.f39279c = new View[12];
        int i10 = 0;
        this.h = new or(this, 0);
        this.f39283r = new or(this, 1);
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
                this.f39279c[i11] = new qr(context, valueOf, str);
                this.f39279c[i11].setOnClickListener(new m8(7, this, valueOf));
                addView(this.f39279c[i11]);
            }
        }
        pr prVar = new pr(this, context, new jn(context, new ki.p3(this, ViewConfiguration.get(context).getScaledTouchSlop(), 1)));
        this.f39277a = prVar;
        prVar.setImageResource(2131232095);
        org.telegram.ui.ActionBar.t6.s(prVar, org.telegram.ui.ActionBar.m6.G6, null, PorterDuff.Mode.SRC_ATOP);
        int L = org.telegram.messenger.g0.L(11.0f);
        prVar.setPadding(L, L, L, L);
        prVar.setOnClickListener(new bi.o(16));
        this.f39279c[11] = prVar;
        addView(prVar);
        while (true) {
            View[] viewArr = this.f39279c;
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
        int i11 = org.telegram.ui.ActionBar.m6.f29439i6;
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, i11, false);
        int o4 = i0.a.o(org.telegram.ui.ActionBar.m6.x0(null, i11, false), 30);
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
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.m6.k0(L, L2, L3, org.telegram.messenger.g0.L(f13), x02, o4, o4);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i11);
        org.telegram.ui.ActionBar.p6 g10 = org.telegram.ui.ActionBar.t6.g(i11, 30);
        view.setBackground(k02);
        org.telegram.ui.ActionBar.t6.j(view, k02, M, g10, null);
    }

    @Override
    public final boolean canScrollHorizontally(int i7) {
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int z11 = org.telegram.messenger.o10.z(32.0f, getWidth(), 3);
        int z12 = org.telegram.messenger.o10.z(42.0f, getHeight(), 4);
        int i13 = 0;
        while (true) {
            View[] viewArr = this.f39279c;
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
        int z10 = org.telegram.messenger.o10.z(32.0f, getWidth(), 3);
        int z11 = org.telegram.messenger.o10.z(42.0f, getHeight(), 4);
        for (View view : this.f39279c) {
            if (view != null) {
                view.measure(View.MeasureSpec.makeMeasureSpec(z10, 1073741824), View.MeasureSpec.makeMeasureSpec(z11, 1073741824));
            }
        }
    }

    public void setDispatchBackWhenEmpty(boolean z10) {
        this.f39280e = z10;
    }

    public void setEditText(EditText editText) {
        this.f39278b = editText;
        this.f39280e = false;
    }

    public void setViewToFindFocus(View view) {
        this.d = view;
    }
}
