package org.telegram.ui.Components;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class hy implements View.OnClickListener {
    public final ky f26889a;

    public hy(ky kyVar) {
        this.f26889a = kyVar;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        boolean[] zArr = new boolean[1];
        ky kyVar = this.f26889a;
        kz kzVar = kyVar.F;
        org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(kzVar.getContext(), null);
        LinearLayout linearLayout = new LinearLayout(kzVar.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        ImageView imageView = new ImageView(kzVar.getContext());
        imageView.setImageResource(R.drawable.smiles_info);
        linearLayout.addView(imageView, w7.x5.t(-2, -2, 49, 0, 15, 0, 0));
        TextView textView = new TextView(kzVar.getContext());
        textView.setText(LocaleController.getString(R.string.EmojiSuggestions));
        textView.setTextSize(1, 15.0f);
        int i12 = org.telegram.ui.ActionBar.j6.f20845n5;
        int i13 = kz.O2;
        textView.setTextColor(kzVar.A(i12));
        int i14 = 3;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10);
        textView.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView, w7.x5.t(-2, -2, 51, 0, 24, 0, 0));
        TextView textView2 = new TextView(kzVar.getContext());
        textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.EmojiSuggestionsInfo)));
        textView2.setTextSize(1, 15.0f);
        textView2.setTextColor(kzVar.A(org.telegram.ui.ActionBar.j6.f20770j5));
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView2.setGravity(i11);
        linearLayout.addView(textView2, w7.x5.t(-2, -2, 51, 0, 11, 0, 0));
        TextView textView3 = new TextView(kzVar.getContext());
        int i15 = R.string.EmojiSuggestionsUrl;
        Object obj = kyVar.f27920w;
        if (obj == null) {
            obj = kzVar.W0;
        }
        textView3.setText(LocaleController.formatString("EmojiSuggestionsUrl", i15, obj));
        textView3.setTextSize(1, 15.0f);
        textView3.setTextColor(kzVar.A(org.telegram.ui.ActionBar.j6.f20790k5));
        if (LocaleController.isRTL) {
            i14 = 5;
        }
        textView3.setGravity(i14);
        linearLayout.addView(textView3, w7.x5.t(-2, -2, 51, 0, 18, 0, 16));
        textView3.setOnClickListener(new gy(this, zArr, a3Var));
        a3Var.b(linearLayout);
        a3Var.f20204a.show();
    }
}
