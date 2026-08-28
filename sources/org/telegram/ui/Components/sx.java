package org.telegram.ui.Components;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class sx implements View.OnClickListener {
    public final vx f32564a;

    public sx(vx vxVar) {
        this.f32564a = vxVar;
    }

    @Override
    public final void onClick(View view) {
        int i9;
        int i10;
        boolean[] zArr = new boolean[1];
        vx vxVar = this.f32564a;
        wy wyVar = vxVar.B;
        org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(wyVar.getContext(), null);
        LinearLayout linearLayout = new LinearLayout(wyVar.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        ImageView imageView = new ImageView(wyVar.getContext());
        imageView.setImageResource(R.drawable.smiles_info);
        linearLayout.addView(imageView, g7.e6.t(-2, -2, 49, 0, 15, 0, 0));
        TextView textView = new TextView(wyVar.getContext());
        textView.setText(LocaleController.getString(R.string.EmojiSuggestions));
        textView.setTextSize(1, 15.0f);
        int i11 = org.telegram.ui.ActionBar.f6.f23178n5;
        int i12 = wy.K2;
        textView.setTextColor(wyVar.z(i11));
        int i13 = 3;
        if (LocaleController.isRTL) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        textView.setGravity(i9);
        textView.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView, g7.e6.t(-2, -2, 51, 0, 24, 0, 0));
        TextView textView2 = new TextView(wyVar.getContext());
        textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.EmojiSuggestionsInfo)));
        textView2.setTextSize(1, 15.0f);
        textView2.setTextColor(wyVar.z(org.telegram.ui.ActionBar.f6.f23108j5));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView2.setGravity(i10);
        linearLayout.addView(textView2, g7.e6.t(-2, -2, 51, 0, 11, 0, 0));
        TextView textView3 = new TextView(wyVar.getContext());
        int i14 = R.string.EmojiSuggestionsUrl;
        Object obj = vxVar.f34018w;
        if (obj == null) {
            obj = wyVar.S0;
        }
        textView3.setText(LocaleController.formatString("EmojiSuggestionsUrl", i14, obj));
        textView3.setTextSize(1, 15.0f);
        textView3.setTextColor(wyVar.z(org.telegram.ui.ActionBar.f6.f23126k5));
        if (LocaleController.isRTL) {
            i13 = 5;
        }
        textView3.setGravity(i13);
        linearLayout.addView(textView3, g7.e6.t(-2, -2, 51, 0, 18, 0, 16));
        textView3.setOnClickListener(new rx(this, zArr, a3Var));
        a3Var.b(linearLayout);
        a3Var.f22713a.show();
    }
}
