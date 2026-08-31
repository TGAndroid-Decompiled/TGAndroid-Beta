package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class ur extends ViewGroup {
    public static final int f31713s = 0;
    public final rr f31714a;
    public EditText f31715b;
    public final View[] f31716c;
    public View d;
    public boolean f31717e;
    public boolean f31718f;
    public final qr h;
    public boolean f31719n;
    public final qr f31720r;

    public ur(Context context) {
        super(context);
        String str;
        int i10;
        this.f31716c = new View[12];
        this.h = new qr(this, 0);
        this.f31720r = new qr(this, 1);
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
                this.f31716c[i12] = new tr(context, valueOf, str);
                this.f31716c[i12].setOnClickListener(new w2(12, this, valueOf));
                addView(this.f31716c[i12]);
            }
        }
        rr rrVar = new rr(this, context, new org.telegram.ui.Cells.f1(context, new sr(this, ViewConfiguration.get(context).getScaledTouchSlop(), 0)));
        this.f31714a = rrVar;
        rrVar.setImageResource(R.drawable.msg_clear_input);
        rrVar.setColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.G6, false));
        int dp = AndroidUtilities.dp(11.0f);
        rrVar.setPadding(dp, dp, dp, dp);
        rrVar.setOnClickListener(new eg.m(12));
        this.f31716c[11] = rrVar;
        addView(rrVar);
        while (true) {
            View[] viewArr = this.f31716c;
            if (i11 < viewArr.length) {
                View view = viewArr[i11];
                if (view != null) {
                    k7.e6.b(view, 0.02f, 1.2f);
                    view.setBackground(a(i11));
                }
                i11++;
            } else {
                return;
            }
        }
    }

    public static org.telegram.ui.Cells.z a(int i10) {
        boolean z4;
        boolean z10;
        boolean z11;
        float f10;
        float f11;
        float f12;
        boolean z12 = true;
        if (i10 < 3) {
            z4 = true;
        } else {
            z4 = false;
        }
        int i11 = i10 % 3;
        if (i11 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i11 == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i10 <= 8) {
            z12 = false;
        }
        int i12 = org.telegram.ui.ActionBar.k6.f21750i6;
        int w02 = org.telegram.ui.ActionBar.k6.w0(null, i12, false);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.k6.w0(null, i12, false), 30);
        float f13 = 12.0f;
        if (z10 && z4) {
            f10 = 24.0f;
        } else {
            f10 = 12.0f;
        }
        int dp = AndroidUtilities.dp(f10);
        if (z11 && z4) {
            f11 = 24.0f;
        } else {
            f11 = 12.0f;
        }
        int dp2 = AndroidUtilities.dp(f11);
        if (z11 && z12) {
            f12 = 24.0f;
        } else {
            f12 = 12.0f;
        }
        int dp3 = AndroidUtilities.dp(f12);
        if (z10 && z12) {
            f13 = 24.0f;
        }
        return org.telegram.ui.ActionBar.k6.i0(dp, dp2, dp3, AndroidUtilities.dp(f13), w02, k10, k10);
    }

    @Override
    public final boolean canScrollHorizontally(int i10) {
        return true;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int x10 = org.telegram.ui.b.x(32.0f, getWidth(), 3);
        int x11 = org.telegram.ui.b.x(42.0f, getHeight(), 4);
        int i14 = 0;
        while (true) {
            View[] viewArr = this.f31716c;
            if (i14 < viewArr.length) {
                int dp = AndroidUtilities.dp(6.0f) + x10;
                int dp2 = AndroidUtilities.dp(10.0f) + (dp * (i14 % 3));
                int dp3 = AndroidUtilities.dp(6.0f) + x11;
                int dp4 = AndroidUtilities.dp(10.0f) + (dp3 * (i14 / 3));
                View view = viewArr[i14];
                if (view != null) {
                    view.layout(dp2, dp4, dp2 + x10, dp4 + x11);
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
        int x10 = org.telegram.ui.b.x(32.0f, getWidth(), 3);
        int x11 = org.telegram.ui.b.x(42.0f, getHeight(), 4);
        for (View view : this.f31716c) {
            if (view != null) {
                view.measure(View.MeasureSpec.makeMeasureSpec(x10, 1073741824), View.MeasureSpec.makeMeasureSpec(x11, 1073741824));
            }
        }
    }

    public void setDispatchBackWhenEmpty(boolean z4) {
        this.f31717e = z4;
    }

    public void setEditText(EditText editText) {
        this.f31715b = editText;
        this.f31717e = false;
    }

    public void setViewToFindFocus(View view) {
        this.d = view;
    }
}
