package org.telegram.ui.Components;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class oy implements View.OnClickListener {
    public final ty f29359a;

    public oy(ty tyVar) {
        this.f29359a = tyVar;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        boolean[] zArr = new boolean[1];
        ty tyVar = this.f29359a;
        tz tzVar = tyVar.F;
        org.telegram.ui.ActionBar.b3 b3Var = new org.telegram.ui.ActionBar.b3(tzVar.getContext(), null);
        LinearLayout linearLayout = new LinearLayout(tzVar.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        ImageView imageView = new ImageView(tzVar.getContext());
        imageView.setImageResource(R.drawable.smiles_info);
        linearLayout.addView(imageView, w7.z5.t(-2, -2, 49, 0, 15, 0, 0));
        TextView textView = new TextView(tzVar.getContext());
        org.telegram.messenger.sl.n(R.string.EmojiSuggestions, textView, 1, 15.0f);
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21365n5, tzVar.Z1);
        int i12 = 3;
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
        org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.f21289j5, tzVar.Z1);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView2.setGravity(i11);
        linearLayout.addView(textView2, w7.z5.t(-2, -2, 51, 0, 11, 0, 0));
        TextView textView3 = new TextView(tzVar.getContext());
        int i13 = R.string.EmojiSuggestionsUrl;
        Object obj = tyVar.f30923w;
        if (obj == null) {
            obj = tzVar.W0;
        }
        textView3.setText(LocaleController.formatString("EmojiSuggestionsUrl", i13, obj));
        textView3.setTextSize(1, 15.0f);
        org.telegram.ui.ActionBar.r6.W(textView3, org.telegram.ui.ActionBar.k6.f21309k5, tzVar.Z1);
        if (LocaleController.isRTL) {
            i12 = 5;
        }
        textView3.setGravity(i12);
        linearLayout.addView(textView3, w7.z5.t(-2, -2, 51, 0, 18, 0, 16));
        textView3.setOnClickListener(new ny(this, zArr, b3Var));
        b3Var.b(linearLayout);
        b3Var.f20728a.show();
    }
}
