package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.EditText;
public final class ar extends ViewGroup {
    public static final int f31968x = 0;
    public final yq f31969a;
    public EditText f31970b;
    public final View[] f31971c;
    public View d;
    public boolean f31972e;
    public boolean f31973f;
    public final xq h;
    public boolean f31974n;
    public final xq f31975r;
    public int f31976s;
    public int f31977w;

    public ar(Context context) {
        super(context);
        String str;
        int i7;
        this.f31971c = new View[12];
        int i10 = 0;
        this.h = new xq(this, 0);
        this.f31975r = new xq(this, 1);
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
                this.f31971c[i11] = new zq(context, valueOf, str);
                this.f31971c[i11].setOnClickListener(new kk(5, this, valueOf));
                addView(this.f31971c[i11]);
            }
        }
        yq yqVar = new yq(this, context, new uy(context, new hi.z3(this, ViewConfiguration.get(context).getScaledTouchSlop(), 1)));
        this.f31969a = yqVar;
        yqVar.setImageResource(2131232093);
        org.telegram.ui.ActionBar.t6.s(yqVar, org.telegram.ui.ActionBar.m6.G6, null, PorterDuff.Mode.SRC_ATOP);
        int L = org.telegram.messenger.g0.L(11.0f);
        yqVar.setPadding(L, L, L, L);
        yqVar.setOnClickListener(new bi.l1(11));
        this.f31971c[11] = yqVar;
        addView(yqVar);
        while (true) {
            View[] viewArr = this.f31971c;
            if (i10 < viewArr.length) {
                View view = viewArr[i10];
                if (view != null) {
                    c8.ka.b(view, 0.02f, 1.2f);
                    a(i10, view);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public static void a(int i7, View view) {
        boolean z9;
        boolean z10;
        boolean z11;
        float f10;
        float f11;
        float f12;
        boolean z12 = true;
        if (i7 < 3) {
            z9 = true;
        } else {
            z9 = false;
        }
        int i10 = i7 % 3;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i7 <= 8) {
            z12 = false;
        }
        int i11 = org.telegram.ui.ActionBar.m6.f27982i6;
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, i11, false);
        int o4 = i0.a.o(org.telegram.ui.ActionBar.m6.x0(null, i11, false), 30);
        float f13 = 12.0f;
        if (z10 && z9) {
            f10 = 24.0f;
        } else {
            f10 = 12.0f;
        }
        int L = org.telegram.messenger.g0.L(f10);
        if (z11 && z9) {
            f11 = 24.0f;
        } else {
            f11 = 12.0f;
        }
        int L2 = org.telegram.messenger.g0.L(f11);
        if (z11 && z12) {
            f12 = 24.0f;
        } else {
            f12 = 12.0f;
        }
        int L3 = org.telegram.messenger.g0.L(f12);
        if (z10 && z12) {
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
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int y10 = org.telegram.messenger.camera.q.y(32.0f, getWidth(), 3);
        int y11 = org.telegram.messenger.camera.q.y(42.0f, getHeight(), 4);
        int i13 = 0;
        while (true) {
            View[] viewArr = this.f31971c;
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
        int y10 = org.telegram.messenger.camera.q.y(32.0f, getWidth(), 3);
        int y11 = org.telegram.messenger.camera.q.y(42.0f, getHeight(), 4);
        for (View view : this.f31971c) {
            if (view != null) {
                view.measure(View.MeasureSpec.makeMeasureSpec(y10, 1073741824), View.MeasureSpec.makeMeasureSpec(y11, 1073741824));
            }
        }
    }

    public void setDispatchBackWhenEmpty(boolean z9) {
        this.f31972e = z9;
    }

    public void setEditText(EditText editText) {
        this.f31970b = editText;
        this.f31972e = false;
    }

    public void setViewToFindFocus(View view) {
        this.d = view;
    }
}
