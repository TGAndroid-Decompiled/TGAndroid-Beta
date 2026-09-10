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
public final class e3 extends FrameLayout {
    public final LinearLayout f32039a;
    public boolean f32040b;
    public final org.telegram.ui.Components.w9 f32041c;
    public final TextView d;
    public final TextView e;
    public final TextView f32042f;
    public final bi.d h;
    public ValueAnimator f32043n;
    public boolean f32044r;

    public e3(Context context) {
        super(context);
        this.f32044r = true;
        setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f32039a = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(32.0f), AndroidUtilities.dp(24.0f));
        linearLayout.setOrientation(1);
        linearLayout.setGravity(3);
        addView(linearLayout, w7.a6.e(-2, -2, 17));
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.f32041c = w9Var;
        linearLayout.addView(w9Var, w7.a6.n(100, 100));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 19.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextColor(-1);
        TextView g10 = com.google.android.gms.internal.vision.e2.g(linearLayout, textView, w7.a6.t(-2, -2, 3, 0, 4, 0, 2), context);
        this.e = g10;
        g10.setTextSize(1, 15.0f);
        g10.setTextColor(-1);
        g10.setSingleLine(false);
        g10.setMaxLines(3);
        TextView g11 = com.google.android.gms.internal.vision.e2.g(linearLayout, g10, w7.a6.t(-2, -2, 3, 0, 0, 0, 1), context);
        this.f32042f = g11;
        g11.setTextSize(1, 12.0f);
        g11.setTextColor(-1);
        g11.setAlpha(0.4f);
        linearLayout.addView(g11, w7.a6.q(-2, -2, 3));
        bi.d dVar = new bi.d(context, null, true);
        this.h = dVar;
        dVar.setMinWidth(AndroidUtilities.dp(140.0f));
        dVar.g(LocaleController.getString(R.string.Refresh), false, true);
        linearLayout.addView(dVar, w7.a6.t(-2, 40, 3, 0, 12, 0, 0));
    }

    public final void a(String str, String str2) {
        this.d.setText(LocaleController.getString(R.string.WebErrorTitle));
        org.telegram.messenger.em.p(R.string.WebErrorInfoBot, new Object[]{str}, this.e);
        this.f32042f.setText(str2);
    }

    public final void b(boolean z10, boolean z11) {
        int i10;
        int i11;
        float f7;
        if (this.f32044r == z10) {
            return;
        }
        this.f32044r = z10;
        ValueAnimator valueAnimator = this.f32043n;
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
            this.f32043n = ofFloat;
            ofFloat.addUpdateListener(new d3(this, 0));
            this.f32043n.start();
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
        this.f32042f.setTextColor(i12);
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 0 && !this.f32040b) {
            this.f32040b = true;
            MediaDataController.getInstance(UserConfig.selectedAccount).setPlaceholderImage(this.f32041c, "tg_placeholders_android", "🧐", "100_100");
        }
    }
}
