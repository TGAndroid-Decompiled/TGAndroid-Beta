package org.telegram.ui.Components;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class oy implements View.OnClickListener {
    public final ty f29078a;

    public oy(ty tyVar) {
        this.f29078a = tyVar;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        boolean[] zArr = new boolean[1];
        ty tyVar = this.f29078a;
        tz tzVar = tyVar.F;
        org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(tzVar.getContext(), null);
        LinearLayout linearLayout = new LinearLayout(tzVar.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        ImageView imageView = new ImageView(tzVar.getContext());
        imageView.setImageResource(R.drawable.smiles_info);
        linearLayout.addView(imageView, w7.z5.t(-2, -2, 49, 0, 15, 0, 0));
        TextView textView = new TextView(tzVar.getContext());
        org.telegram.messenger.wh.j(15.0f, R.string.EmojiSuggestions, 1, textView);
        int i12 = org.telegram.ui.ActionBar.h6.f21168n5;
        int i13 = tz.O2;
        textView.setTextColor(tzVar.A(i12));
        int i14 = 3;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10);
        textView.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView, w7.z5.t(-2, -2, 51, 0, 24, 0, 0));
        TextView textView2 = new TextView(tzVar.getContext());
        textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.EmojiSuggestionsInfo)));
        textView2.setTextSize(1, 15.0f);
        textView2.setTextColor(tzVar.A(org.telegram.ui.ActionBar.h6.f21092j5));
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView2.setGravity(i11);
        linearLayout.addView(textView2, w7.z5.t(-2, -2, 51, 0, 11, 0, 0));
        TextView textView3 = new TextView(tzVar.getContext());
        int i15 = R.string.EmojiSuggestionsUrl;
        Object obj = tyVar.f30735w;
        if (obj == null) {
            obj = tzVar.W0;
        }
        textView3.setText(LocaleController.formatString("EmojiSuggestionsUrl", i15, obj));
        textView3.setTextSize(1, 15.0f);
        textView3.setTextColor(tzVar.A(org.telegram.ui.ActionBar.h6.f21112k5));
        if (LocaleController.isRTL) {
            i14 = 5;
        }
        textView3.setGravity(i14);
        linearLayout.addView(textView3, w7.z5.t(-2, -2, 51, 0, 18, 0, 16));
        textView3.setOnClickListener(new ny(this, zArr, a3Var));
        a3Var.b(linearLayout);
        a3Var.f20609a.show();
    }
}
