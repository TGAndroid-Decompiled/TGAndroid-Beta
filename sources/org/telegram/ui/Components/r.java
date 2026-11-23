package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
public final class r implements TextWatcher {
    public final ImageView f39134a;
    public final int f39135b;
    public final int f39136c;
    public final LinearLayout d;
    public final ArrayList f39137e;
    public final TextView f39138f;
    public final ScrollView h;

    public r(ImageView imageView, int i7, int i10, LinearLayout linearLayout, ArrayList arrayList, TextView textView, ScrollView scrollView) {
        this.f39134a = imageView;
        this.f39135b = i7;
        this.f39136c = i10;
        this.d = linearLayout;
        this.f39137e = arrayList;
        this.f39138f = textView;
        this.h = scrollView;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i7;
        LinearLayout linearLayout;
        int i10;
        boolean z10;
        int i11;
        String str;
        int i12;
        String lowerCase = editable.toString().trim().toLowerCase();
        boolean isEmpty = lowerCase.isEmpty();
        int i13 = 8;
        if (editable.length() > 0) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        this.f39134a.setVisibility(i7);
        int i14 = this.f39135b;
        while (true) {
            linearLayout = this.d;
            i10 = this.f39136c;
            if (i14 >= i10) {
                break;
            }
            View childAt = linearLayout.getChildAt(i14);
            if (!isEmpty) {
                i12 = 8;
            } else {
                i12 = 0;
            }
            childAt.setVisibility(i12);
            i14++;
        }
        int i15 = 0;
        int i16 = 0;
        while (true) {
            ArrayList arrayList = this.f39137e;
            if (i15 >= arrayList.size() || i10 + i15 >= linearLayout.getChildCount()) {
                break;
            }
            org.telegram.messenger.r00 r00Var = (org.telegram.messenger.r00) arrayList.get(i15);
            String str2 = r00Var.d;
            if (str2 == null) {
                str2 = (r00Var.f26619b + " " + r00Var.f26620c).toLowerCase();
            }
            if (!isEmpty && !str2.contains(lowerCase) && ((str = r00Var.f26618a) == null || !str.toLowerCase().startsWith(lowerCase))) {
                z10 = false;
            } else {
                z10 = true;
            }
            View childAt2 = linearLayout.getChildAt(i10 + i15);
            if (z10) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            childAt2.setVisibility(i11);
            if (z10) {
                i16++;
            }
            i15++;
        }
        if (!isEmpty && i16 == 0) {
            i13 = 0;
        }
        this.f39138f.setVisibility(i13);
        this.h.scrollTo(0, 0);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
