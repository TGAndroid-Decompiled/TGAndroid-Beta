package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class hs extends ViewGroup {
    public static final int f29040w = 0;
    public final fs f29041a;
    public EditText f29042b;
    public final View[] f29043c;
    public View d;
    public boolean e;
    public boolean f29044f;
    public final es h;
    public boolean f29045n;
    public final es f29046r;
    public int f29047s;
    public int v;

    public hs(Context context) {
        super(context);
        String str;
        int i10;
        this.f29043c = new View[12];
        this.h = new es(this, 0);
        this.f29046r = new es(this, 1);
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
                this.f29043c[i12] = new gs(context, valueOf, str);
                this.f29043c[i12].setOnClickListener(new ga(9, this, valueOf));
                addView(this.f29043c[i12]);
            }
        }
        fs fsVar = new fs(this, context, new jg.s0(context, new hi.l4(this, ViewConfiguration.get(context).getScaledTouchSlop(), 1)));
        this.f29041a = fsVar;
        fsVar.setImageResource(R.drawable.msg_clear_input);
        org.telegram.ui.ActionBar.f7.t(fsVar, org.telegram.ui.ActionBar.y6.G6, null, PorterDuff.Mode.SRC_ATOP);
        int dp = AndroidUtilities.dp(11.0f);
        fsVar.setPadding(dp, dp, dp, dp);
        fsVar.setOnClickListener(new bh.f(12));
        this.f29043c[11] = fsVar;
        addView(fsVar);
        while (true) {
            View[] viewArr = this.f29043c;
            if (i11 < viewArr.length) {
                View view = viewArr[i11];
                if (view != null) {
                    gb1.c(view, 0.02f, 1.2f);
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
        int i12 = org.telegram.ui.ActionBar.y6.f23446i6;
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, i12, false);
        int o10 = i0.a.o(org.telegram.ui.ActionBar.y6.x0(null, i12, false), 30);
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
        org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.y6.j0(dp, dp2, dp3, AndroidUtilities.dp(f12), x02, o10, o10);
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i12);
        org.telegram.ui.ActionBar.b7 h = org.telegram.ui.ActionBar.f7.h(i12, 30);
        view.setBackground(j02);
        org.telegram.ui.ActionBar.f7.k(view, j02, N, h, null);
    }

    @Override
    public final boolean canScrollHorizontally(int i10) {
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int B = org.telegram.messenger.vh.B(32.0f, getWidth(), 3);
        int B2 = org.telegram.messenger.vh.B(42.0f, getHeight(), 4);
        int i14 = 0;
        while (true) {
            View[] viewArr = this.f29043c;
            if (i14 < viewArr.length) {
                int dp = AndroidUtilities.dp(6.0f) + B;
                int dp2 = AndroidUtilities.dp(10.0f) + (dp * (i14 % 3));
                int dp3 = AndroidUtilities.dp(6.0f) + B2;
                int dp4 = AndroidUtilities.dp(10.0f) + (dp3 * (i14 / 3));
                View view = viewArr[i14];
                if (view != null) {
                    view.layout(dp2, dp4, dp2 + B, dp4 + B2);
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
        int B = org.telegram.messenger.vh.B(32.0f, getWidth(), 3);
        int B2 = org.telegram.messenger.vh.B(42.0f, getHeight(), 4);
        for (View view : this.f29043c) {
            if (view != null) {
                view.measure(View.MeasureSpec.makeMeasureSpec(B, 1073741824), View.MeasureSpec.makeMeasureSpec(B2, 1073741824));
            }
        }
    }

    public void setDispatchBackWhenEmpty(boolean z10) {
        this.e = z10;
    }

    public void setEditText(EditText editText) {
        this.f29042b = editText;
        this.e = false;
    }

    public void setViewToFindFocus(View view) {
        this.d = view;
    }
}
