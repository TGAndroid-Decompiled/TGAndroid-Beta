package org.telegram.ui.Components;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class gy implements View.OnClickListener {
    public final jy f25256a;

    public gy(jy jyVar) {
        this.f25256a = jyVar;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        boolean[] zArr = new boolean[1];
        jy jyVar = this.f25256a;
        kz kzVar = jyVar.C;
        org.telegram.ui.ActionBar.b3 b3Var = new org.telegram.ui.ActionBar.b3(kzVar.getContext(), null);
        LinearLayout linearLayout = new LinearLayout(kzVar.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        ImageView imageView = new ImageView(kzVar.getContext());
        imageView.setImageResource(R.drawable.smiles_info);
        linearLayout.addView(imageView, k7.b6.t(-2, -2, 49, 0, 15, 0, 0));
        TextView textView = new TextView(kzVar.getContext());
        textView.setText(LocaleController.getString(R.string.EmojiSuggestions));
        textView.setTextSize(1, 15.0f);
        int i12 = org.telegram.ui.ActionBar.j6.f20084n5;
        int i13 = kz.L2;
        textView.setTextColor(kzVar.A(i12));
        int i14 = 3;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10);
        textView.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView, k7.b6.t(-2, -2, 51, 0, 24, 0, 0));
        TextView textView2 = new TextView(kzVar.getContext());
        textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.EmojiSuggestionsInfo)));
        textView2.setTextSize(1, 15.0f);
        textView2.setTextColor(kzVar.A(org.telegram.ui.ActionBar.j6.f20012j5));
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView2.setGravity(i11);
        linearLayout.addView(textView2, k7.b6.t(-2, -2, 51, 0, 11, 0, 0));
        TextView textView3 = new TextView(kzVar.getContext());
        int i15 = R.string.EmojiSuggestionsUrl;
        Object obj = jyVar.f26064w;
        if (obj == null) {
            obj = kzVar.T0;
        }
        textView3.setText(LocaleController.formatString("EmojiSuggestionsUrl", i15, obj));
        textView3.setTextSize(1, 15.0f);
        textView3.setTextColor(kzVar.A(org.telegram.ui.ActionBar.j6.f20030k5));
        if (LocaleController.isRTL) {
            i14 = 5;
        }
        textView3.setGravity(i14);
        linearLayout.addView(textView3, k7.b6.t(-2, -2, 51, 0, 18, 0, 16));
        textView3.setOnClickListener(new fy(this, zArr, b3Var));
        b3Var.b(linearLayout);
        b3Var.f19525a.show();
    }
}
