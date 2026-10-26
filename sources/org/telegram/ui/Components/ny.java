package org.telegram.ui.Components;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ny implements View.OnClickListener {
    public final sy f31090a;

    public ny(sy syVar) {
        this.f31090a = syVar;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        boolean[] zArr = new boolean[1];
        sy syVar = this.f31090a;
        sz szVar = syVar.F;
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(szVar.getContext(), null);
        LinearLayout linearLayout = new LinearLayout(szVar.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        ImageView imageView = new ImageView(szVar.getContext());
        imageView.setImageResource(R.drawable.smiles_info);
        linearLayout.addView(imageView, gb1.x(-2, -2, 49, 0, 15, 0, 0));
        TextView textView = new TextView(szVar.getContext());
        org.telegram.ui.d3.o(R.string.EmojiSuggestions, textView, 1, 15.0f);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23539n5, szVar.Z1);
        int i12 = 3;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10);
        textView.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView, gb1.x(-2, -2, 51, 0, 24, 0, 0));
        TextView textView2 = new TextView(szVar.getContext());
        textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.EmojiSuggestionsInfo)));
        textView2.setTextSize(1, 15.0f);
        org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.f23464j5, szVar.Z1);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView2.setGravity(i11);
        linearLayout.addView(textView2, gb1.x(-2, -2, 51, 0, 11, 0, 0));
        TextView textView3 = new TextView(szVar.getContext());
        int i13 = R.string.EmojiSuggestionsUrl;
        Object obj = syVar.f32707w;
        if (obj == null) {
            obj = szVar.W0;
        }
        textView3.setText(LocaleController.formatString("EmojiSuggestionsUrl", i13, obj));
        textView3.setTextSize(1, 15.0f);
        org.telegram.ui.ActionBar.f7.V(textView3, org.telegram.ui.ActionBar.y6.f23483k5, szVar.Z1);
        if (LocaleController.isRTL) {
            i12 = 5;
        }
        textView3.setGravity(i12);
        linearLayout.addView(textView3, gb1.x(-2, -2, 51, 0, 18, 0, 16));
        textView3.setOnClickListener(new my(this, zArr, e3Var));
        e3Var.b(linearLayout);
        e3Var.f22601a.show();
    }
}
