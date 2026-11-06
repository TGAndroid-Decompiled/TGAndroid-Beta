package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.EditText;
public final class br extends ViewGroup {
    public static final int f32274x = 0;
    public final zq f32275a;
    public EditText f32276b;
    public final View[] f32277c;
    public View d;
    public boolean f32278e;
    public boolean f32279f;
    public final yq h;
    public boolean f32280n;
    public final yq f32281r;
    public int f32282s;
    public int f32283w;

    public br(Context context) {
        super(context);
        String str;
        int i7;
        this.f32277c = new View[12];
        int i10 = 0;
        this.h = new yq(this, 0);
        this.f32281r = new yq(this, 1);
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
                this.f32277c[i11] = new ar(context, valueOf, str);
                this.f32277c[i11].setOnClickListener(new lk(5, this, valueOf));
                addView(this.f32277c[i11]);
            }
        }
        zq zqVar = new zq(this, context, new uy(context, new hi.z3(this, ViewConfiguration.get(context).getScaledTouchSlop(), 1)));
        this.f32275a = zqVar;
        zqVar.setImageResource(2131232093);
        org.telegram.ui.ActionBar.r6.t(zqVar, org.telegram.ui.ActionBar.k6.G6, null, PorterDuff.Mode.SRC_ATOP);
        int L = org.telegram.messenger.g0.L(11.0f);
        zqVar.setPadding(L, L, L, L);
        zqVar.setOnClickListener(new bi.l1(11));
        this.f32277c[11] = zqVar;
        addView(zqVar);
        while (true) {
            View[] viewArr = this.f32277c;
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
        int i11 = org.telegram.ui.ActionBar.k6.f27940i6;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i11, false);
        int o4 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i11, false), 30);
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
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.k6.k0(L, L2, L3, org.telegram.messenger.g0.L(f13), x02, o4, o4);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
        org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i11, 30);
        view.setBackground(k02);
        org.telegram.ui.ActionBar.r6.k(view, k02, N, h, null);
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
            View[] viewArr = this.f32277c;
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
        for (View view : this.f32277c) {
            if (view != null) {
                view.measure(View.MeasureSpec.makeMeasureSpec(y10, 1073741824), View.MeasureSpec.makeMeasureSpec(y11, 1073741824));
            }
        }
    }

    public void setDispatchBackWhenEmpty(boolean z9) {
        this.f32278e = z9;
    }

    public void setEditText(EditText editText) {
        this.f32276b = editText;
        this.f32278e = false;
    }

    public void setViewToFindFocus(View view) {
        this.d = view;
    }
}
