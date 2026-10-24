package org.telegram.ui.Components;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class my implements View.OnClickListener {
    public final ry f28718a;

    public my(ry ryVar) {
        this.f28718a = ryVar;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        boolean[] zArr = new boolean[1];
        ry ryVar = this.f28718a;
        rz rzVar = ryVar.F;
        org.telegram.ui.ActionBar.b3 b3Var = new org.telegram.ui.ActionBar.b3(rzVar.getContext(), null);
        LinearLayout linearLayout = new LinearLayout(rzVar.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        ImageView imageView = new ImageView(rzVar.getContext());
        imageView.setImageResource(R.drawable.smiles_info);
        linearLayout.addView(imageView, w7.z5.t(-2, -2, 49, 0, 15, 0, 0));
        TextView textView = new TextView(rzVar.getContext());
        org.telegram.messenger.tl.n(R.string.EmojiSuggestions, textView, 1, 15.0f);
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21366n5, rzVar.Z1);
        int i12 = 3;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10);
        textView.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView, w7.z5.t(-2, -2, 51, 0, 24, 0, 0));
        TextView textView2 = new TextView(rzVar.getContext());
        textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.EmojiSuggestionsInfo)));
        textView2.setTextSize(1, 15.0f);
        org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.f21290j5, rzVar.Z1);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView2.setGravity(i11);
        linearLayout.addView(textView2, w7.z5.t(-2, -2, 51, 0, 11, 0, 0));
        TextView textView3 = new TextView(rzVar.getContext());
        int i13 = R.string.EmojiSuggestionsUrl;
        Object obj = ryVar.f30295w;
        if (obj == null) {
            obj = rzVar.W0;
        }
        textView3.setText(LocaleController.formatString("EmojiSuggestionsUrl", i13, obj));
        textView3.setTextSize(1, 15.0f);
        org.telegram.ui.ActionBar.r6.W(textView3, org.telegram.ui.ActionBar.k6.f21310k5, rzVar.Z1);
        if (LocaleController.isRTL) {
            i12 = 5;
        }
        textView3.setGravity(i12);
        linearLayout.addView(textView3, w7.z5.t(-2, -2, 51, 0, 18, 0, 16));
        textView3.setOnClickListener(new ly(this, zArr, b3Var));
        b3Var.b(linearLayout);
        b3Var.f20729a.show();
    }
}
