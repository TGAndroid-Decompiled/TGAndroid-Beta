package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class wr extends ViewGroup {
    public static final int f30189s = 0;
    public final ur f30190a;
    public EditText f30191b;
    public final View[] f30192c;
    public View d;
    public boolean e;
    public boolean f30193f;
    public final tr h;
    public boolean f30194n;
    public final tr f30195r;

    public wr(Context context) {
        super(context);
        String str;
        int i10;
        this.f30192c = new View[12];
        this.h = new tr(this, 0);
        this.f30195r = new tr(this, 1);
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
                this.f30192c[i12] = new vr(context, valueOf, str);
                this.f30192c[i12].setOnClickListener(new org.telegram.ui.pf(27, this, valueOf));
                addView(this.f30192c[i12]);
            }
        }
        ur urVar = new ur(this, context, new n2.e(context, new ei.n4(this, ViewConfiguration.get(context).getScaledTouchSlop(), 1)));
        this.f30190a = urVar;
        urVar.setImageResource(R.drawable.msg_clear_input);
        urVar.setColorFilter(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.G6, false));
        int dp = AndroidUtilities.dp(11.0f);
        urVar.setPadding(dp, dp, dp, dp);
        urVar.setOnClickListener(new ai.e2(10));
        this.f30192c[11] = urVar;
        addView(urVar);
        while (true) {
            View[] viewArr = this.f30192c;
            if (i11 < viewArr.length) {
                View view = viewArr[i11];
                if (view != null) {
                    w7.a6.b(view, 0.02f, 1.2f);
                    view.setBackground(a(i11));
                }
                i11++;
            } else {
                return;
            }
        }
    }

    public static org.telegram.ui.Cells.z a(int i10) {
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
        int i12 = org.telegram.ui.ActionBar.h6.f19148i6;
        int w02 = org.telegram.ui.ActionBar.h6.w0(null, i12, false);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.h6.w0(null, i12, false), 30);
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
        return org.telegram.ui.ActionBar.h6.i0(dp, dp2, dp3, AndroidUtilities.dp(f12), w02, k10, k10);
    }

    @Override
    public final boolean canScrollHorizontally(int i10) {
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int A = org.telegram.messenger.ok.A(32.0f, getWidth(), 3);
        int A2 = org.telegram.messenger.ok.A(42.0f, getHeight(), 4);
        int i14 = 0;
        while (true) {
            View[] viewArr = this.f30192c;
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
        int A = org.telegram.messenger.ok.A(32.0f, getWidth(), 3);
        int A2 = org.telegram.messenger.ok.A(42.0f, getHeight(), 4);
        for (View view : this.f30192c) {
            if (view != null) {
                view.measure(View.MeasureSpec.makeMeasureSpec(A, 1073741824), View.MeasureSpec.makeMeasureSpec(A2, 1073741824));
            }
        }
    }

    public void setDispatchBackWhenEmpty(boolean z10) {
        this.e = z10;
    }

    public void setEditText(EditText editText) {
        this.f30191b = editText;
        this.e = false;
    }

    public void setViewToFindFocus(View view) {
        this.d = view;
    }
}
