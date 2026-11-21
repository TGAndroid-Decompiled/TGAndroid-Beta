package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
public final class s implements TextWatcher {
    public final ImageView f39419a;
    public final int f39420b;
    public final int f39421c;
    public final LinearLayout d;
    public final ArrayList f39422e;
    public final TextView f39423f;
    public final ScrollView h;

    public s(ImageView imageView, int i7, int i10, LinearLayout linearLayout, ArrayList arrayList, TextView textView, ScrollView scrollView) {
        this.f39419a = imageView;
        this.f39420b = i7;
        this.f39421c = i10;
        this.d = linearLayout;
        this.f39422e = arrayList;
        this.f39423f = textView;
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
        this.f39419a.setVisibility(i7);
        int i14 = this.f39420b;
        while (true) {
            linearLayout = this.d;
            i10 = this.f39421c;
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
            ArrayList arrayList = this.f39422e;
            if (i15 >= arrayList.size() || i10 + i15 >= linearLayout.getChildCount()) {
                break;
            }
            org.telegram.messenger.s00 s00Var = (org.telegram.messenger.s00) arrayList.get(i15);
            String str2 = s00Var.d;
            if (str2 == null) {
                str2 = (s00Var.f26745b + " " + s00Var.f26746c).toLowerCase();
            }
            if (!isEmpty && !str2.contains(lowerCase) && ((str = s00Var.f26744a) == null || !str.toLowerCase().startsWith(lowerCase))) {
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
        this.f39423f.setVisibility(i13);
        this.h.scrollTo(0, 0);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
