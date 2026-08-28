package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class kr extends ViewGroup {
    public static final int f30225s = 0;
    public final ir f30226a;
    public EditText f30227b;
    public final View[] f30228c;
    public View d;
    public boolean f30229e;
    public boolean f30230f;
    public final hr h;
    public boolean f30231n;
    public final hr f30232r;

    public kr(Context context) {
        super(context);
        String str;
        int i9;
        this.f30228c = new View[12];
        this.h = new hr(this, 0);
        this.f30232r = new hr(this, 1);
        int i10 = 0;
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
                    i9 = i11 + 1;
                } else {
                    i9 = 0;
                }
                String valueOf = String.valueOf(i9);
                this.f30228c[i11] = new jr(context, valueOf, str);
                this.f30228c[i11].setOnClickListener(new s2(14, this, valueOf));
                addView(this.f30228c[i11]);
            }
        }
        ir irVar = new ir(this, context, new m5.c0(context, new mh.d4(this, ViewConfiguration.get(context).getScaledTouchSlop(), 1)));
        this.f30226a = irVar;
        irVar.setImageResource(R.drawable.msg_clear_input);
        irVar.setColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
        int dp = AndroidUtilities.dp(11.0f);
        irVar.setPadding(dp, dp, dp, dp);
        irVar.setOnClickListener(new fh.n(13));
        this.f30228c[11] = irVar;
        addView(irVar);
        while (true) {
            View[] viewArr = this.f30228c;
            if (i10 < viewArr.length) {
                View view = viewArr[i10];
                if (view != null) {
                    g7.g6.b(view, 0.02f, 1.2f);
                    view.setBackground(a(i10));
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public static org.telegram.ui.Cells.z a(int i9) {
        boolean z10;
        boolean z11;
        boolean z12;
        float f10;
        float f11;
        float f12;
        boolean z13 = true;
        if (i9 < 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = i9 % 3;
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
        if (i9 <= 8) {
            z13 = false;
        }
        int i11 = org.telegram.ui.ActionBar.f6.f23092i6;
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, i11, false);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.f6.w0(null, i11, false), 30);
        float f13 = 12.0f;
        if (z11 && z10) {
            f10 = 24.0f;
        } else {
            f10 = 12.0f;
        }
        int dp = AndroidUtilities.dp(f10);
        if (z12 && z10) {
            f11 = 24.0f;
        } else {
            f11 = 12.0f;
        }
        int dp2 = AndroidUtilities.dp(f11);
        if (z12 && z13) {
            f12 = 24.0f;
        } else {
            f12 = 12.0f;
        }
        int dp3 = AndroidUtilities.dp(f12);
        if (z11 && z13) {
            f13 = 24.0f;
        }
        return org.telegram.ui.ActionBar.f6.i0(dp, dp2, dp3, AndroidUtilities.dp(f13), w02, k10, k10);
    }

    @Override
    public final boolean canScrollHorizontally(int i9) {
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int y10 = org.telegram.messenger.ll.y(32.0f, getWidth(), 3);
        int y11 = org.telegram.messenger.ll.y(42.0f, getHeight(), 4);
        int i13 = 0;
        while (true) {
            View[] viewArr = this.f30228c;
            if (i13 < viewArr.length) {
                int dp = AndroidUtilities.dp(6.0f) + y10;
                int dp2 = AndroidUtilities.dp(10.0f) + (dp * (i13 % 3));
                int dp3 = AndroidUtilities.dp(6.0f) + y11;
                int dp4 = AndroidUtilities.dp(10.0f) + (dp3 * (i13 / 3));
                View view = viewArr[i13];
                if (view != null) {
                    view.layout(dp2, dp4, dp2 + y10, dp4 + y11);
                }
                i13++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        View[] viewArr;
        setMeasuredDimension(View.MeasureSpec.getSize(i9), View.MeasureSpec.getSize(i10));
        int y10 = org.telegram.messenger.ll.y(32.0f, getWidth(), 3);
        int y11 = org.telegram.messenger.ll.y(42.0f, getHeight(), 4);
        for (View view : this.f30228c) {
            if (view != null) {
                view.measure(View.MeasureSpec.makeMeasureSpec(y10, 1073741824), View.MeasureSpec.makeMeasureSpec(y11, 1073741824));
            }
        }
    }

    public void setDispatchBackWhenEmpty(boolean z10) {
        this.f30229e = z10;
    }

    public void setEditText(EditText editText) {
        this.f30227b = editText;
        this.f30229e = false;
    }

    public void setViewToFindFocus(View view) {
        this.d = view;
    }
}
