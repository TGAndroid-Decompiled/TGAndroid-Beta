package org.telegram.ui.Components;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class oy implements View.OnClickListener {
    public final ry f25939a;

    public oy(ry ryVar) {
        this.f25939a = ryVar;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        boolean[] zArr = new boolean[1];
        ry ryVar = this.f25939a;
        rz rzVar = ryVar.F;
        org.telegram.ui.ActionBar.c3 c3Var = new org.telegram.ui.ActionBar.c3(rzVar.getContext(), null);
        LinearLayout linearLayout = new LinearLayout(rzVar.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        ImageView imageView = new ImageView(rzVar.getContext());
        imageView.setImageResource(R.drawable.smiles_info);
        linearLayout.addView(imageView, w7.a6.t(-2, -2, 49, 0, 15, 0, 0));
        TextView textView = new TextView(rzVar.getContext());
        textView.setText(LocaleController.getString(R.string.EmojiSuggestions));
        textView.setTextSize(1, 15.0f);
        int i12 = org.telegram.ui.ActionBar.j6.f18109n5;
        int i13 = rz.O2;
        textView.setTextColor(rzVar.z(i12));
        int i14 = 3;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10);
        textView.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView, w7.a6.t(-2, -2, 51, 0, 24, 0, 0));
        TextView textView2 = new TextView(rzVar.getContext());
        textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.EmojiSuggestionsInfo)));
        textView2.setTextSize(1, 15.0f);
        textView2.setTextColor(rzVar.z(org.telegram.ui.ActionBar.j6.f18034j5));
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView2.setGravity(i11);
        linearLayout.addView(textView2, w7.a6.t(-2, -2, 51, 0, 11, 0, 0));
        TextView textView3 = new TextView(rzVar.getContext());
        int i15 = R.string.EmojiSuggestionsUrl;
        Object obj = ryVar.f26783w;
        if (obj == null) {
            obj = rzVar.W0;
        }
        textView3.setText(LocaleController.formatString("EmojiSuggestionsUrl", i15, obj));
        textView3.setTextSize(1, 15.0f);
        textView3.setTextColor(rzVar.z(org.telegram.ui.ActionBar.j6.f18054k5));
        if (LocaleController.isRTL) {
            i14 = 5;
        }
        textView3.setGravity(i14);
        linearLayout.addView(textView3, w7.a6.t(-2, -2, 51, 0, 18, 0, 16));
        textView3.setOnClickListener(new ny(this, zArr, c3Var));
        c3Var.b(linearLayout);
        c3Var.f17571a.show();
    }
}
