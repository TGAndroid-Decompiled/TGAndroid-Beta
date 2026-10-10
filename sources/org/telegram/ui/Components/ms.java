package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class ms extends ViewGroup {
    public static final int f28883s = 0;
    public final ks f28884a;
    public EditText f28885b;
    public final View[] f28886c;
    public View d;
    public boolean f28887e;
    public boolean f28888f;
    public final js h;
    public boolean f28889n;
    public final js f28890r;

    public ms(Context context) {
        super(context);
        String str;
        int i10;
        this.f28886c = new View[12];
        this.h = new js(this, 0);
        this.f28890r = new js(this, 1);
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
                this.f28886c[i12] = new ls(context, valueOf, str);
                this.f28886c[i12].setOnClickListener(new org.telegram.ui.sf(27, this, valueOf));
                addView(this.f28886c[i12]);
            }
        }
        ks ksVar = new ks(this, context, new m.f3(context, new ei.m4(this, ViewConfiguration.get(context).getScaledTouchSlop(), 1)));
        this.f28884a = ksVar;
        ksVar.setImageResource(R.drawable.msg_clear_input);
        ksVar.setColorFilter(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.G6, false));
        int dp = AndroidUtilities.dp(11.0f);
        ksVar.setPadding(dp, dp, dp, dp);
        ksVar.setOnClickListener(new ai.e2(10));
        this.f28886c[11] = ksVar;
        addView(ksVar);
        while (true) {
            View[] viewArr = this.f28886c;
            if (i11 < viewArr.length) {
                View view = viewArr[i11];
                if (view != null) {
                    w7.z5.b(view, 0.02f, 1.2f);
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
        int i12 = org.telegram.ui.ActionBar.i6.f20892i6;
        int x02 = org.telegram.ui.ActionBar.i6.x0(null, i12, false);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.i6.x0(null, i12, false), 30);
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
        return org.telegram.ui.ActionBar.i6.j0(dp, dp2, dp3, AndroidUtilities.dp(f12), x02, k10, k10);
    }

    @Override
    public final boolean canScrollHorizontally(int i10) {
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int A = org.telegram.messenger.bi.A(32.0f, getWidth(), 3);
        int A2 = org.telegram.messenger.bi.A(42.0f, getHeight(), 4);
        int i14 = 0;
        while (true) {
            View[] viewArr = this.f28886c;
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
        int A = org.telegram.messenger.bi.A(32.0f, getWidth(), 3);
        int A2 = org.telegram.messenger.bi.A(42.0f, getHeight(), 4);
        for (View view : this.f28886c) {
            if (view != null) {
                view.measure(View.MeasureSpec.makeMeasureSpec(A, 1073741824), View.MeasureSpec.makeMeasureSpec(A2, 1073741824));
            }
        }
    }

    public void setDispatchBackWhenEmpty(boolean z10) {
        this.f28887e = z10;
    }

    public void setEditText(EditText editText) {
        this.f28885b = editText;
        this.f28887e = false;
    }

    public void setViewToFindFocus(View view) {
        this.d = view;
    }
}
