package org.telegram.ui.Components;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ky implements View.OnClickListener {
    public final ny f28206a;

    public ky(ny nyVar) {
        this.f28206a = nyVar;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        boolean[] zArr = new boolean[1];
        ny nyVar = this.f28206a;
        nz nzVar = nyVar.F;
        org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(nzVar.getContext(), null);
        LinearLayout linearLayout = new LinearLayout(nzVar.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        ImageView imageView = new ImageView(nzVar.getContext());
        imageView.setImageResource(R.drawable.smiles_info);
        linearLayout.addView(imageView, w7.z5.t(-2, -2, 49, 0, 15, 0, 0));
        TextView textView = new TextView(nzVar.getContext());
        textView.setText(LocaleController.getString(R.string.EmojiSuggestions));
        textView.setTextSize(1, 15.0f);
        int i12 = org.telegram.ui.ActionBar.i6.f21002n5;
        int i13 = nz.M2;
        textView.setTextColor(nzVar.z(i12));
        int i14 = 3;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10);
        textView.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView, w7.z5.t(-2, -2, 51, 0, 24, 0, 0));
        TextView textView2 = new TextView(nzVar.getContext());
        textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.EmojiSuggestionsInfo)));
        textView2.setTextSize(1, 15.0f);
        textView2.setTextColor(nzVar.z(org.telegram.ui.ActionBar.i6.f20925j5));
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView2.setGravity(i11);
        linearLayout.addView(textView2, w7.z5.t(-2, -2, 51, 0, 11, 0, 0));
        TextView textView3 = new TextView(nzVar.getContext());
        int i15 = R.string.EmojiSuggestionsUrl;
        Object obj = nyVar.f29079w;
        if (obj == null) {
            obj = nzVar.W0;
        }
        textView3.setText(LocaleController.formatString("EmojiSuggestionsUrl", i15, obj));
        textView3.setTextSize(1, 15.0f);
        textView3.setTextColor(nzVar.z(org.telegram.ui.ActionBar.i6.f20945k5));
        if (LocaleController.isRTL) {
            i14 = 5;
        }
        textView3.setGravity(i14);
        linearLayout.addView(textView3, w7.z5.t(-2, -2, 51, 0, 18, 0, 16));
        textView3.setOnClickListener(new jy(this, zArr, a3Var));
        a3Var.b(linearLayout);
        a3Var.f20373a.show();
    }
}
