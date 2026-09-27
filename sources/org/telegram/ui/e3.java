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
    public final LinearLayout f33111a;
    public boolean f33112b;
    public final org.telegram.ui.Components.w9 f33113c;
    public final TextView d;
    public final TextView e;
    public final TextView f33114f;
    public final ci.d h;
    public ValueAnimator f33115n;
    public boolean f33116r;

    public e3(Context context) {
        super(context);
        this.f33116r = true;
        setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f33111a = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(32.0f), AndroidUtilities.dp(24.0f));
        linearLayout.setOrientation(1);
        linearLayout.setGravity(3);
        addView(linearLayout, w7.y5.e(-2, -2, 17));
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.f33113c = w9Var;
        linearLayout.addView(w9Var, w7.y5.n(100, 100));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 19.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextColor(-1);
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, w7.y5.t(-2, -2, 3, 0, 4, 0, 2), context);
        this.e = h;
        h.setTextSize(1, 15.0f);
        h.setTextColor(-1);
        h.setSingleLine(false);
        h.setMaxLines(3);
        TextView h10 = com.google.android.gms.internal.vision.e2.h(linearLayout, h, w7.y5.t(-2, -2, 3, 0, 0, 0, 1), context);
        this.f33114f = h10;
        h10.setTextSize(1, 12.0f);
        h10.setTextColor(-1);
        h10.setAlpha(0.4f);
        linearLayout.addView(h10, w7.y5.q(-2, -2, 3));
        ci.d dVar = new ci.d(context, null, true);
        this.h = dVar;
        dVar.setMinWidth(AndroidUtilities.dp(140.0f));
        dVar.g(LocaleController.getString(R.string.Refresh), false, true);
        linearLayout.addView(dVar, w7.y5.t(-2, 40, 3, 0, 12, 0, 0));
    }

    public final void a(String str, String str2) {
        this.d.setText(LocaleController.getString(R.string.WebErrorTitle));
        org.telegram.messenger.qk.q(R.string.WebErrorInfoBot, new Object[]{str}, this.e);
        this.f33114f.setText(str2);
    }

    public final void b(boolean z10, boolean z11) {
        int i10;
        int i11;
        float f7;
        if (this.f33116r == z10) {
            return;
        }
        this.f33116r = z10;
        ValueAnimator valueAnimator = this.f33115n;
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
            this.f33115n = ofFloat;
            ofFloat.addUpdateListener(new d3(this, 0));
            this.f33115n.start();
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
        this.f33114f.setTextColor(i12);
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 0 && !this.f33112b) {
            this.f33112b = true;
            MediaDataController.getInstance(UserConfig.selectedAccount).setPlaceholderImage(this.f33113c, "tg_placeholders_android", "🧐", "100_100");
        }
    }
}
