package org.telegram.ui.Components;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class hy implements View.OnClickListener {
    public final ky f24829a;

    public hy(ky kyVar) {
        this.f24829a = kyVar;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        boolean[] zArr = new boolean[1];
        ky kyVar = this.f24829a;
        lz lzVar = kyVar.F;
        org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(lzVar.getContext(), null);
        LinearLayout linearLayout = new LinearLayout(lzVar.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        ImageView imageView = new ImageView(lzVar.getContext());
        imageView.setImageResource(R.drawable.smiles_info);
        linearLayout.addView(imageView, w7.x5.t(-2, -2, 49, 0, 15, 0, 0));
        TextView textView = new TextView(lzVar.getContext());
        textView.setText(LocaleController.getString(R.string.EmojiSuggestions));
        textView.setTextSize(1, 15.0f);
        int i12 = org.telegram.ui.ActionBar.h6.f18972n5;
        int i13 = lz.O2;
        textView.setTextColor(lzVar.z(i12));
        int i14 = 3;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10);
        textView.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView, w7.x5.t(-2, -2, 51, 0, 24, 0, 0));
        TextView textView2 = new TextView(lzVar.getContext());
        textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.EmojiSuggestionsInfo)));
        textView2.setTextSize(1, 15.0f);
        textView2.setTextColor(lzVar.z(org.telegram.ui.ActionBar.h6.f18895j5));
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView2.setGravity(i11);
        linearLayout.addView(textView2, w7.x5.t(-2, -2, 51, 0, 11, 0, 0));
        TextView textView3 = new TextView(lzVar.getContext());
        int i15 = R.string.EmojiSuggestionsUrl;
        Object obj = kyVar.f25719w;
        if (obj == null) {
            obj = lzVar.W0;
        }
        textView3.setText(LocaleController.formatString("EmojiSuggestionsUrl", i15, obj));
        textView3.setTextSize(1, 15.0f);
        textView3.setTextColor(lzVar.z(org.telegram.ui.ActionBar.h6.f18915k5));
        if (LocaleController.isRTL) {
            i14 = 5;
        }
        textView3.setGravity(i14);
        linearLayout.addView(textView3, w7.x5.t(-2, -2, 51, 0, 18, 0, 16));
        textView3.setOnClickListener(new gy(this, zArr, a3Var));
        a3Var.b(linearLayout);
        a3Var.f18414a.show();
    }
}
