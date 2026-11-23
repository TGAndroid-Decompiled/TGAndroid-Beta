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
    public final ImageView f39384a;
    public final int f39385b;
    public final int f39386c;
    public final LinearLayout d;
    public final ArrayList f39387e;
    public final TextView f39388f;
    public final ScrollView h;

    public s(ImageView imageView, int i7, int i10, LinearLayout linearLayout, ArrayList arrayList, TextView textView, ScrollView scrollView) {
        this.f39384a = imageView;
        this.f39385b = i7;
        this.f39386c = i10;
        this.d = linearLayout;
        this.f39387e = arrayList;
        this.f39388f = textView;
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
        this.f39384a.setVisibility(i7);
        int i14 = this.f39385b;
        while (true) {
            linearLayout = this.d;
            i10 = this.f39386c;
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
            ArrayList arrayList = this.f39387e;
            if (i15 >= arrayList.size() || i10 + i15 >= linearLayout.getChildCount()) {
                break;
            }
            org.telegram.messenger.t00 t00Var = (org.telegram.messenger.t00) arrayList.get(i15);
            String str2 = t00Var.d;
            if (str2 == null) {
                str2 = (t00Var.f26906b + " " + t00Var.f26907c).toLowerCase();
            }
            if (!isEmpty && !str2.contains(lowerCase) && ((str = t00Var.f26905a) == null || !str.toLowerCase().startsWith(lowerCase))) {
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
        this.f39388f.setVisibility(i13);
        this.h.scrollTo(0, 0);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
