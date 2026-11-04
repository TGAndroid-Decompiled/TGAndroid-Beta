package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.EditText;
public final class br extends ViewGroup {
    public static final int f32366x = 0;
    public final zq f32367a;
    public EditText f32368b;
    public final View[] f32369c;
    public View d;
    public boolean f32370e;
    public boolean f32371f;
    public final yq h;
    public boolean f32372n;
    public final yq f32373r;
    public int f32374s;
    public int f32375w;

    public br(Context context) {
        super(context);
        String str;
        int i3;
        this.f32369c = new View[12];
        int i10 = 0;
        this.h = new yq(this, 0);
        this.f32373r = new yq(this, 1);
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
                    i3 = i11 + 1;
                } else {
                    i3 = 0;
                }
                String valueOf = String.valueOf(i3);
                this.f32369c[i11] = new ar(context, valueOf, str);
                this.f32369c[i11].setOnClickListener(new q2(11, this, valueOf));
                addView(this.f32369c[i11]);
            }
        }
        zq zqVar = new zq(this, context, new y00(context, new ii.a4(this, ViewConfiguration.get(context).getScaledTouchSlop(), 1)));
        this.f32367a = zqVar;
        zqVar.setImageResource(2131232093);
        org.telegram.ui.ActionBar.r6.t(zqVar, org.telegram.ui.ActionBar.k6.G6, null, PorterDuff.Mode.SRC_ATOP);
        int L = org.telegram.messenger.g0.L(11.0f);
        zqVar.setPadding(L, L, L, L);
        zqVar.setOnClickListener(new ai.t(15));
        this.f32369c[11] = zqVar;
        addView(zqVar);
        while (true) {
            View[] viewArr = this.f32369c;
            if (i10 < viewArr.length) {
                View view = viewArr[i10];
                if (view != null) {
                    b8.pf.b(view, 0.02f, 1.2f);
                    a(i10, view);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public static void a(int i3, View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        float f10;
        float f11;
        float f12;
        boolean z13 = true;
        if (i3 < 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = i3 % 3;
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
        if (i3 <= 8) {
            z13 = false;
        }
        int i11 = org.telegram.ui.ActionBar.k6.f27972i6;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i11, false);
        int o10 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i11, false), 30);
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
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.k6.k0(L, L2, L3, org.telegram.messenger.g0.L(f13), x02, o10, o10);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
        org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i11, 30);
        view.setBackground(k02);
        org.telegram.ui.ActionBar.r6.k(view, k02, N, h, null);
    }

    @Override
    public final boolean canScrollHorizontally(int i3) {
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int y9 = org.telegram.messenger.camera.q.y(32.0f, getWidth(), 3);
        int y10 = org.telegram.messenger.camera.q.y(42.0f, getHeight(), 4);
        int i13 = 0;
        while (true) {
            View[] viewArr = this.f32369c;
            if (i13 < viewArr.length) {
                int L = org.telegram.messenger.g0.L(6.0f) + y9;
                int L2 = org.telegram.messenger.g0.L(10.0f) + (L * (i13 % 3));
                int L3 = org.telegram.messenger.g0.L(6.0f) + y10;
                int L4 = org.telegram.messenger.g0.L(10.0f) + (L3 * (i13 / 3));
                View view = viewArr[i13];
                if (view != null) {
                    view.layout(L2, L4, L2 + y9, L4 + y10);
                }
                i13++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        View[] viewArr;
        setMeasuredDimension(View.MeasureSpec.getSize(i3), View.MeasureSpec.getSize(i10));
        int y9 = org.telegram.messenger.camera.q.y(32.0f, getWidth(), 3);
        int y10 = org.telegram.messenger.camera.q.y(42.0f, getHeight(), 4);
        for (View view : this.f32369c) {
            if (view != null) {
                view.measure(View.MeasureSpec.makeMeasureSpec(y9, 1073741824), View.MeasureSpec.makeMeasureSpec(y10, 1073741824));
            }
        }
    }

    public void setDispatchBackWhenEmpty(boolean z10) {
        this.f32370e = z10;
    }

    public void setEditText(EditText editText) {
        this.f32368b = editText;
        this.f32370e = false;
    }

    public void setViewToFindFocus(View view) {
        this.d = view;
    }
}
