package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class ds extends ViewGroup {
    public static final int f25820w = 0;
    public final bs f25821a;
    public EditText f25822b;
    public final View[] f25823c;
    public View d;
    public boolean e;
    public boolean f25824f;
    public final as h;
    public boolean f25825n;
    public final as f25826r;
    public int f25827s;
    public int v;

    public ds(Context context) {
        super(context);
        String str;
        int i10;
        this.f25823c = new View[12];
        this.h = new as(this, 0);
        this.f25826r = new as(this, 1);
        int i11 = 0;
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
                this.f25823c[i12] = new cs(context, valueOf, str);
                this.f25823c[i12].setOnClickListener(new aa(8, this, valueOf));
                addView(this.f25823c[i12]);
            }
        }
        bs bsVar = new bs(this, context, new le.b(context, new gi.c4(this, ViewConfiguration.get(context).getScaledTouchSlop(), 1)));
        this.f25821a = bsVar;
        bsVar.setImageResource(R.drawable.msg_clear_input);
        org.telegram.ui.ActionBar.r6.t(bsVar, org.telegram.ui.ActionBar.k6.G6, null, PorterDuff.Mode.SRC_ATOP);
        int dp = AndroidUtilities.dp(11.0f);
        bsVar.setPadding(dp, dp, dp, dp);
        bsVar.setOnClickListener(new ah.f(12));
        this.f25823c[11] = bsVar;
        addView(bsVar);
        while (true) {
            View[] viewArr = this.f25823c;
            if (i11 < viewArr.length) {
                View view = viewArr[i11];
                if (view != null) {
                    w7.b6.b(view, 0.02f, 1.2f);
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
        int i12 = org.telegram.ui.ActionBar.k6.f21273i6;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i12, false);
        int o10 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i12, false), 30);
        float f12 = 12.0f;
        if (z11 && z10) {
            f7 = 24.0f;
        } else {
            f7 = 12.0f;
        }
        int dp = AndroidUtilities.dp(f7);
        if (z12 && z10) {
            f10 = 24.0f;
        } else {
            f10 = 12.0f;
        }
        int dp2 = AndroidUtilities.dp(f10);
        if (z12 && z13) {
            f11 = 24.0f;
        } else {
            f11 = 12.0f;
        }
        int dp3 = AndroidUtilities.dp(f11);
        if (z11 && z13) {
            f12 = 24.0f;
        }
        org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.k6.j0(dp, dp2, dp3, AndroidUtilities.dp(f12), x02, o10, o10);
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i12);
        org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i12, 30);
        view.setBackground(j02);
        org.telegram.ui.ActionBar.r6.k(view, j02, O, h, null);
    }

    @Override
    public final boolean canScrollHorizontally(int i10) {
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int A = org.telegram.messenger.tl.A(32.0f, getWidth(), 3);
        int A2 = org.telegram.messenger.tl.A(42.0f, getHeight(), 4);
        int i14 = 0;
        while (true) {
            View[] viewArr = this.f25823c;
            if (i14 < viewArr.length) {
                int dp = AndroidUtilities.dp(6.0f) + A;
                int dp2 = AndroidUtilities.dp(10.0f) + (dp * (i14 % 3));
                int dp3 = AndroidUtilities.dp(6.0f) + A2;
                int dp4 = AndroidUtilities.dp(10.0f) + (dp3 * (i14 / 3));
                View view = viewArr[i14];
                if (view != null) {
                    view.layout(dp2, dp4, dp2 + A, dp4 + A2);
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
        int A = org.telegram.messenger.tl.A(32.0f, getWidth(), 3);
        int A2 = org.telegram.messenger.tl.A(42.0f, getHeight(), 4);
        for (View view : this.f25823c) {
            if (view != null) {
                view.measure(View.MeasureSpec.makeMeasureSpec(A, 1073741824), View.MeasureSpec.makeMeasureSpec(A2, 1073741824));
            }
        }
    }

    public void setDispatchBackWhenEmpty(boolean z10) {
        this.e = z10;
    }

    public void setEditText(EditText editText) {
        this.f25822b = editText;
        this.e = false;
    }

    public void setViewToFindFocus(View view) {
        this.d = view;
    }
}
