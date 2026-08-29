package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class or extends ViewGroup {
    public static final int f31456s = 0;
    public final lr f31457a;
    public EditText f31458b;
    public final View[] f31459c;
    public View d;
    public boolean f31460e;
    public boolean f31461f;
    public final kr h;
    public boolean f31462n;
    public final kr f31463r;

    public or(Context context) {
        super(context);
        String str;
        int i10;
        this.f31459c = new View[12];
        this.h = new kr(this, 0);
        this.f31463r = new kr(this, 1);
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
                this.f31459c[i12] = new nr(context, valueOf, str);
                this.f31459c[i12].setOnClickListener(new t2(15, this, valueOf));
                addView(this.f31459c[i12]);
            }
        }
        lr lrVar = new lr(this, context, new o4.g(context, new mr(this, ViewConfiguration.get(context).getScaledTouchSlop(), 0)));
        this.f31457a = lrVar;
        lrVar.setImageResource(R.drawable.msg_clear_input);
        lrVar.setColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        int dp = AndroidUtilities.dp(11.0f);
        lrVar.setPadding(dp, dp, dp, dp);
        lrVar.setOnClickListener(new bg.n(14));
        this.f31459c[11] = lrVar;
        addView(lrVar);
        while (true) {
            View[] viewArr = this.f31459c;
            if (i11 < viewArr.length) {
                View view = viewArr[i11];
                if (view != null) {
                    i7.h6.b(view, 0.02f, 1.2f);
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
        float f9;
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
        int i12 = org.telegram.ui.ActionBar.g6.f23152i6;
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, i12, false);
        int k9 = i0.a.k(org.telegram.ui.ActionBar.g6.w0(null, i12, false), 30);
        float f12 = 12.0f;
        if (z11 && z10) {
            f9 = 24.0f;
        } else {
            f9 = 12.0f;
        }
        int dp = AndroidUtilities.dp(f9);
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
        return org.telegram.ui.ActionBar.g6.i0(dp, dp2, dp3, AndroidUtilities.dp(f12), w02, k9, k9);
    }

    @Override
    public final boolean canScrollHorizontally(int i10) {
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int x4 = org.telegram.ui.b.x(32.0f, getWidth(), 3);
        int x10 = org.telegram.ui.b.x(42.0f, getHeight(), 4);
        int i14 = 0;
        while (true) {
            View[] viewArr = this.f31459c;
            if (i14 < viewArr.length) {
                int dp = AndroidUtilities.dp(6.0f) + x4;
                int dp2 = AndroidUtilities.dp(10.0f) + (dp * (i14 % 3));
                int dp3 = AndroidUtilities.dp(6.0f) + x10;
                int dp4 = AndroidUtilities.dp(10.0f) + (dp3 * (i14 / 3));
                View view = viewArr[i14];
                if (view != null) {
                    view.layout(dp2, dp4, dp2 + x4, dp4 + x10);
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
        int x4 = org.telegram.ui.b.x(32.0f, getWidth(), 3);
        int x10 = org.telegram.ui.b.x(42.0f, getHeight(), 4);
        for (View view : this.f31459c) {
            if (view != null) {
                view.measure(View.MeasureSpec.makeMeasureSpec(x4, 1073741824), View.MeasureSpec.makeMeasureSpec(x10, 1073741824));
            }
        }
    }

    public void setDispatchBackWhenEmpty(boolean z10) {
        this.f31460e = z10;
    }

    public void setEditText(EditText editText) {
        this.f31458b = editText;
        this.f31460e = false;
    }

    public void setViewToFindFocus(View view) {
        this.d = view;
    }
}
