package org.telegram.ui.Components;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class tx implements View.OnClickListener {

    public final wx f32904a;

    public tx(wx wxVar) {
        this.f32904a = wxVar;
    }

    @Override
    public final void onClick(View view) {
        boolean[] zArr = new boolean[1];
        wx wxVar = this.f32904a;
        yy yyVar = wxVar.B;
        org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(yyVar.getContext(), null);
        LinearLayout linearLayout = new LinearLayout(yyVar.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        ImageView imageView = new ImageView(yyVar.getContext());
        imageView.setImageResource(R.drawable.smiles_info);
        linearLayout.addView(imageView, h7.z5.t(-2, -2, 49, 0, 15, 0, 0));
        TextView textView = new TextView(yyVar.getContext());
        textView.setText(LocaleController.getString(R.string.EmojiSuggestions));
        textView.setTextSize(1, 15.0f);
        int i10 = org.telegram.ui.ActionBar.g6.f23233n5;
        int i11 = yy.K2;
        textView.setTextColor(yyVar.B(i10));
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        textView.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView, h7.z5.t(-2, -2, 51, 0, 24, 0, 0));
        TextView textView2 = new TextView(yyVar.getContext());
        textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.EmojiSuggestionsInfo)));
        textView2.setTextSize(1, 15.0f);
        textView2.setTextColor(yyVar.B(org.telegram.ui.ActionBar.g6.f23161j5));
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        linearLayout.addView(textView2, h7.z5.t(-2, -2, 51, 0, 11, 0, 0));
        TextView textView3 = new TextView(yyVar.getContext());
        int i12 = R.string.EmojiSuggestionsUrl;
        Object obj = wxVar.f34360w;
        if (obj == null) {
            obj = yyVar.S0;
        }
        textView3.setText(LocaleController.formatString("EmojiSuggestionsUrl", i12, obj));
        textView3.setTextSize(1, 15.0f);
        textView3.setTextColor(yyVar.B(org.telegram.ui.ActionBar.g6.f23180k5));
        textView3.setGravity(LocaleController.isRTL ? 5 : 3);
        linearLayout.addView(textView3, h7.z5.t(-2, -2, 51, 0, 18, 0, 16));
        textView3.setOnClickListener(new sx(this, zArr, z2Var));
        z2Var.b(linearLayout);
        z2Var.f23994a.show();
    }
}
