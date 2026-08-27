package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;

public final class h3 extends FrameLayout {

    public final LinearLayout f38667a;

    public boolean f38668b;

    public final org.telegram.ui.Components.n9 f38669c;
    public final TextView d;

    public final TextView f38670e;

    public final TextView f38671f;
    public final lh.d h;

    public ValueAnimator f38672n;

    public boolean f38673r;

    public h3(Context context) {
        super(context);
        this.f38673r = true;
        setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f38667a = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(32.0f), AndroidUtilities.dp(24.0f));
        linearLayout.setOrientation(1);
        linearLayout.setGravity(3);
        addView(linearLayout, h7.z5.e(-2, -2, 17));
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
        this.f38669c = n9Var;
        linearLayout.addView(n9Var, h7.z5.n(100, 100));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 19.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextColor(-1);
        TextView textViewI = org.telegram.ui.Cells.pa.i(linearLayout, textView, h7.z5.t(-2, -2, 3, 0, 4, 0, 2), context);
        this.f38670e = textViewI;
        textViewI.setTextSize(1, 15.0f);
        textViewI.setTextColor(-1);
        textViewI.setSingleLine(false);
        textViewI.setMaxLines(3);
        TextView textViewI2 = org.telegram.ui.Cells.pa.i(linearLayout, textViewI, h7.z5.t(-2, -2, 3, 0, 0, 0, 1), context);
        this.f38671f = textViewI2;
        textViewI2.setTextSize(1, 12.0f);
        textViewI2.setTextColor(-1);
        textViewI2.setAlpha(0.4f);
        linearLayout.addView(textViewI2, h7.z5.q(-2, -2, 3));
        lh.d dVar = new lh.d(context, null, true);
        this.h = dVar;
        dVar.setMinWidth(AndroidUtilities.dp(140.0f));
        dVar.g(LocaleController.getString(R.string.Refresh), false, true);
        linearLayout.addView(dVar, h7.z5.t(-2, 40, 3, 0, 12, 0, 0));
    }

    public final void a(String str, String str2) {
        this.d.setText(LocaleController.getString(R.string.WebErrorTitle));
        org.telegram.messenger.rl.n(R.string.WebErrorInfoBot, new Object[]{str}, this.f38670e);
        this.f38671f.setText(str2);
    }

    public final void b(boolean z10, boolean z11) {
        if (this.f38673r == z10) {
            return;
        }
        this.f38673r = z10;
        ValueAnimator valueAnimator = this.f38672n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z11) {
            this.d.setTextColor(!z10 ? -16777216 : -1);
            this.f38670e.setTextColor(!z10 ? -16777216 : -1);
            this.f38671f.setTextColor(z10 ? -1 : -16777216);
        } else {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
            this.f38672n = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new g3(this, 0));
            this.f38672n.start();
        }
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 != 0 || this.f38668b) {
            return;
        }
        this.f38668b = true;
        MediaDataController.getInstance(UserConfig.selectedAccount).setPlaceholderImage(this.f38669c, "tg_placeholders_android", "🧐", "100_100");
    }
}
