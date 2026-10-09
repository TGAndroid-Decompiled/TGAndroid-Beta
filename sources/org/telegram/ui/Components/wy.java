package org.telegram.ui.Components;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class wy implements View.OnClickListener {
    public final zy f32694a;

    public wy(zy zyVar) {
        this.f32694a = zyVar;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        boolean[] zArr = new boolean[1];
        zy zyVar = this.f32694a;
        a00 a00Var = zyVar.F;
        org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(a00Var.getContext(), null);
        LinearLayout linearLayout = new LinearLayout(a00Var.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        ImageView imageView = new ImageView(a00Var.getContext());
        imageView.setImageResource(R.drawable.smiles_info);
        linearLayout.addView(imageView, w7.x5.t(-2, -2, 49, 0, 15, 0, 0));
        TextView textView = new TextView(a00Var.getContext());
        org.telegram.messenger.bi.j(15.0f, R.string.EmojiSuggestions, 1, textView);
        int i12 = org.telegram.ui.ActionBar.i6.f20981n5;
        int i13 = a00.O2;
        textView.setTextColor(a00Var.B(i12));
        int i14 = 3;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10);
        textView.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView, w7.x5.t(-2, -2, 51, 0, 24, 0, 0));
        TextView textView2 = new TextView(a00Var.getContext());
        textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.EmojiSuggestionsInfo)));
        textView2.setTextSize(1, 15.0f);
        textView2.setTextColor(a00Var.B(org.telegram.ui.ActionBar.i6.f20905j5));
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView2.setGravity(i11);
        linearLayout.addView(textView2, w7.x5.t(-2, -2, 51, 0, 11, 0, 0));
        TextView textView3 = new TextView(a00Var.getContext());
        int i15 = R.string.EmojiSuggestionsUrl;
        Object obj = zyVar.f33680w;
        if (obj == null) {
            obj = a00Var.W0;
        }
        textView3.setText(LocaleController.formatString("EmojiSuggestionsUrl", i15, obj));
        textView3.setTextSize(1, 15.0f);
        textView3.setTextColor(a00Var.B(org.telegram.ui.ActionBar.i6.f20924k5));
        if (LocaleController.isRTL) {
            i14 = 5;
        }
        textView3.setGravity(i14);
        linearLayout.addView(textView3, w7.x5.t(-2, -2, 51, 0, 18, 0, 16));
        textView3.setOnClickListener(new vy(this, zArr, a3Var));
        a3Var.b(linearLayout);
        a3Var.f20380a.show();
    }
}
