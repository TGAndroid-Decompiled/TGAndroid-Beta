package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

public final class ir extends ViewGroup {

    public static final int f29468s = 0;

    public final gr f29469a;

    public EditText f29470b;

    public final View[] f29471c;
    public View d;

    public boolean f29472e;

    public boolean f29473f;
    public final fr h;

    public boolean f29474n;

    public final fr f29475r;

    public ir(Context context) {
        String str;
        super(context);
        this.f29471c = new View[12];
        this.h = new fr(this, 0);
        this.f29475r = new fr(this, 1);
        int i10 = 0;
        int i11 = 0;
        while (i11 < 11) {
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
                String strValueOf = String.valueOf(i11 != 10 ? i11 + 1 : 0);
                this.f29471c[i11] = new hr(context, strValueOf, str);
                this.f29471c[i11].setOnClickListener(new q2(15, this, strValueOf));
                addView(this.f29471c[i11]);
            }
            i11++;
        }
        gr grVar = new gr(this, context, new m5.o(context, new nh.b4(this, ViewConfiguration.get(context).getScaledTouchSlop(), 1)));
        this.f29469a = grVar;
        grVar.setImageResource(R.drawable.msg_clear_input);
        grVar.setColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        int iDp = AndroidUtilities.dp(11.0f);
        grVar.setPadding(iDp, iDp, iDp, iDp);
        grVar.setOnClickListener(new ag.l2(14));
        this.f29471c[11] = grVar;
        addView(grVar);
        while (true) {
            View[] viewArr = this.f29471c;
            if (i10 >= viewArr.length) {
                return;
            }
            View view = viewArr[i10];
            if (view != null) {
                h7.b6.b(view, 0.02f, 1.2f);
                view.setBackground(a(i10));
            }
            i10++;
        }
    }

    public static org.telegram.ui.Cells.z a(int i10) {
        boolean z10 = i10 < 3;
        int i11 = i10 % 3;
        boolean z11 = i11 == 0;
        boolean z12 = i11 == 2;
        boolean z13 = i10 > 8;
        int i12 = org.telegram.ui.ActionBar.g6.f23144i6;
        int iW0 = org.telegram.ui.ActionBar.g6.w0(null, i12, false);
        int iK = i0.b.k(org.telegram.ui.ActionBar.g6.w0(null, i12, false), 30);
        float f10 = 12.0f;
        int iDp = AndroidUtilities.dp((z11 && z10) ? 24.0f : 12.0f);
        int iDp2 = AndroidUtilities.dp((z12 && z10) ? 24.0f : 12.0f);
        int iDp3 = AndroidUtilities.dp((z12 && z13) ? 24.0f : 12.0f);
        if (z11 && z13) {
            f10 = 24.0f;
        }
        return org.telegram.ui.ActionBar.g6.i0(iDp, iDp2, iDp3, AndroidUtilities.dp(f10), iW0, iK, iK);
    }

    @Override
    public final boolean canScrollHorizontally(int i10) {
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int iX = org.telegram.messenger.rl.x(32.0f, getWidth(), 3);
        int iX2 = org.telegram.messenger.rl.x(42.0f, getHeight(), 4);
        int i14 = 0;
        while (true) {
            View[] viewArr = this.f29471c;
            if (i14 >= viewArr.length) {
                return;
            }
            int iDp = AndroidUtilities.dp(6.0f) + iX;
            int iDp2 = AndroidUtilities.dp(10.0f) + (iDp * (i14 % 3));
            int iDp3 = AndroidUtilities.dp(6.0f) + iX2;
            int iDp4 = AndroidUtilities.dp(10.0f) + (iDp3 * (i14 / 3));
            View view = viewArr[i14];
            if (view != null) {
                view.layout(iDp2, iDp4, iDp2 + iX, iDp4 + iX2);
            }
            i14++;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        int iX = org.telegram.messenger.rl.x(32.0f, getWidth(), 3);
        int iX2 = org.telegram.messenger.rl.x(42.0f, getHeight(), 4);
        for (View view : this.f29471c) {
            if (view != null) {
                view.measure(View.MeasureSpec.makeMeasureSpec(iX, 1073741824), View.MeasureSpec.makeMeasureSpec(iX2, 1073741824));
            }
        }
    }

    public void setDispatchBackWhenEmpty(boolean z10) {
        this.f29472e = z10;
    }

    public void setEditText(EditText editText) {
        this.f29470b = editText;
        this.f29472e = false;
    }

    public void setViewToFindFocus(View view) {
        this.d = view;
    }
}
