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
public final class f3 extends FrameLayout {
    public final LinearLayout f35447a;
    public boolean f35448b;
    public final org.telegram.ui.Components.z9 f35449c;
    public final TextView d;
    public final TextView e;
    public final TextView f35450f;
    public final di.d h;
    public ValueAnimator f35451n;
    public boolean f35452r;

    public f3(Context context) {
        super(context);
        this.f35452r = true;
        setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f35447a = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(32.0f), AndroidUtilities.dp(24.0f));
        linearLayout.setOrientation(1);
        linearLayout.setGravity(3);
        addView(linearLayout, w7.z5.e(-2, -2, 17));
        org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(context);
        this.f35449c = z9Var;
        linearLayout.addView(z9Var, w7.z5.n(100, 100));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 19.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextColor(-1);
        TextView i10 = com.google.android.gms.internal.play_billing.k3.i(linearLayout, textView, w7.z5.t(-2, -2, 3, 0, 4, 0, 2), context);
        this.e = i10;
        i10.setTextSize(1, 15.0f);
        i10.setTextColor(-1);
        i10.setSingleLine(false);
        i10.setMaxLines(3);
        TextView i11 = com.google.android.gms.internal.play_billing.k3.i(linearLayout, i10, w7.z5.t(-2, -2, 3, 0, 0, 0, 1), context);
        this.f35450f = i11;
        i11.setTextSize(1, 12.0f);
        i11.setTextColor(-1);
        i11.setAlpha(0.4f);
        linearLayout.addView(i11, w7.z5.q(-2, -2, 3));
        di.d dVar = new di.d(context, null, true);
        this.h = dVar;
        dVar.setMinWidth(AndroidUtilities.dp(140.0f));
        dVar.g(LocaleController.getString(R.string.Refresh), false, true);
        linearLayout.addView(dVar, w7.z5.t(-2, 40, 3, 0, 12, 0, 0));
    }

    public final void a(String str, String str2) {
        this.d.setText(LocaleController.getString(R.string.WebErrorTitle));
        org.telegram.messenger.sk.r(R.string.WebErrorInfoBot, new Object[]{str}, this.e);
        this.f35450f.setText(str2);
    }

    public final void b(boolean z10, boolean z11) {
        int i10;
        int i11;
        float f7;
        if (this.f35452r == z10) {
            return;
        }
        this.f35452r = z10;
        ValueAnimator valueAnimator = this.f35451n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z11) {
            float f10 = 1.0f;
            if (z10) {
                f7 = 0.0f;
            } else {
                f7 = 1.0f;
            }
            if (!z10) {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, f10);
            this.f35451n = ofFloat;
            ofFloat.addUpdateListener(new e3(this, 0));
            this.f35451n.start();
            return;
        }
        int i12 = -1;
        if (!z10) {
            i10 = -16777216;
        } else {
            i10 = -1;
        }
        this.d.setTextColor(i10);
        if (!z10) {
            i11 = -16777216;
        } else {
            i11 = -1;
        }
        this.e.setTextColor(i11);
        if (!z10) {
            i12 = -16777216;
        }
        this.f35450f.setTextColor(i12);
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 0 && !this.f35448b) {
            this.f35448b = true;
            MediaDataController.getInstance(UserConfig.selectedAccount).setPlaceholderImage(this.f35449c, "tg_placeholders_android", "🧐", "100_100");
        }
    }
}
