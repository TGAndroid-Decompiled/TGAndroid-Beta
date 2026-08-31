package org.telegram.ui.Components;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class iy implements View.OnClickListener {
    public final ly f27920a;

    public iy(ly lyVar) {
        this.f27920a = lyVar;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        boolean[] zArr = new boolean[1];
        ly lyVar = this.f27920a;
        mz mzVar = lyVar.C;
        org.telegram.ui.ActionBar.c3 c3Var = new org.telegram.ui.ActionBar.c3(mzVar.getContext(), null);
        LinearLayout linearLayout = new LinearLayout(mzVar.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        ImageView imageView = new ImageView(mzVar.getContext());
        imageView.setImageResource(R.drawable.smiles_info);
        linearLayout.addView(imageView, k7.c6.t(-2, -2, 49, 0, 15, 0, 0));
        TextView textView = new TextView(mzVar.getContext());
        textView.setText(LocaleController.getString(R.string.EmojiSuggestions));
        textView.setTextSize(1, 15.0f);
        int i12 = org.telegram.ui.ActionBar.k6.f21838n5;
        int i13 = mz.L2;
        textView.setTextColor(mzVar.A(i12));
        int i14 = 3;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10);
        textView.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView, k7.c6.t(-2, -2, 51, 0, 24, 0, 0));
        TextView textView2 = new TextView(mzVar.getContext());
        textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.EmojiSuggestionsInfo)));
        textView2.setTextSize(1, 15.0f);
        textView2.setTextColor(mzVar.A(org.telegram.ui.ActionBar.k6.f21766j5));
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView2.setGravity(i11);
        linearLayout.addView(textView2, k7.c6.t(-2, -2, 51, 0, 11, 0, 0));
        TextView textView3 = new TextView(mzVar.getContext());
        int i15 = R.string.EmojiSuggestionsUrl;
        Object obj = lyVar.f28848w;
        if (obj == null) {
            obj = mzVar.T0;
        }
        textView3.setText(LocaleController.formatString("EmojiSuggestionsUrl", i15, obj));
        textView3.setTextSize(1, 15.0f);
        textView3.setTextColor(mzVar.A(org.telegram.ui.ActionBar.k6.f21784k5));
        if (LocaleController.isRTL) {
            i14 = 5;
        }
        textView3.setGravity(i14);
        linearLayout.addView(textView3, k7.c6.t(-2, -2, 51, 0, 18, 0, 16));
        textView3.setOnClickListener(new hy(this, zArr, c3Var));
        c3Var.b(linearLayout);
        c3Var.f21207a.show();
    }
}
