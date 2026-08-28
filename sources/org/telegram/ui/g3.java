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
public final class g3 extends FrameLayout {
    public final LinearLayout f38416a;
    public boolean f38417b;
    public final org.telegram.ui.Components.o9 f38418c;
    public final TextView d;
    public final TextView f38419e;
    public final TextView f38420f;
    public final kh.d h;
    public ValueAnimator f38421n;
    public boolean f38422r;

    public g3(Context context) {
        super(context);
        this.f38422r = true;
        setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f38416a = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(32.0f), AndroidUtilities.dp(24.0f));
        linearLayout.setOrientation(1);
        linearLayout.setGravity(3);
        addView(linearLayout, g7.e6.e(-2, -2, 17));
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
        this.f38418c = o9Var;
        linearLayout.addView(o9Var, g7.e6.n(100, 100));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 19.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextColor(-1);
        TextView h = j3.r0.h(linearLayout, textView, g7.e6.t(-2, -2, 3, 0, 4, 0, 2), context);
        this.f38419e = h;
        h.setTextSize(1, 15.0f);
        h.setTextColor(-1);
        h.setSingleLine(false);
        h.setMaxLines(3);
        TextView h10 = j3.r0.h(linearLayout, h, g7.e6.t(-2, -2, 3, 0, 0, 0, 1), context);
        this.f38420f = h10;
        h10.setTextSize(1, 12.0f);
        h10.setTextColor(-1);
        h10.setAlpha(0.4f);
        linearLayout.addView(h10, g7.e6.q(-2, -2, 3));
        kh.d dVar = new kh.d(context, null, true);
        this.h = dVar;
        dVar.setMinWidth(AndroidUtilities.dp(140.0f));
        dVar.g(LocaleController.getString(R.string.Refresh), false, true);
        linearLayout.addView(dVar, g7.e6.t(-2, 40, 3, 0, 12, 0, 0));
    }

    public final void a(String str, String str2) {
        this.d.setText(LocaleController.getString(R.string.WebErrorTitle));
        org.telegram.messenger.ll.q(R.string.WebErrorInfoBot, new Object[]{str}, this.f38419e);
        this.f38420f.setText(str2);
    }

    public final void b(boolean z10, boolean z11) {
        int i9;
        int i10;
        float f10;
        if (this.f38422r == z10) {
            return;
        }
        this.f38422r = z10;
        ValueAnimator valueAnimator = this.f38421n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z11) {
            float f11 = 1.0f;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            if (!z10) {
                f11 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f11);
            this.f38421n = ofFloat;
            ofFloat.addUpdateListener(new f3(this, 0));
            this.f38421n.start();
            return;
        }
        int i11 = -1;
        if (!z10) {
            i9 = -16777216;
        } else {
            i9 = -1;
        }
        this.d.setTextColor(i9);
        if (!z10) {
            i10 = -16777216;
        } else {
            i10 = -1;
        }
        this.f38419e.setTextColor(i10);
        if (!z10) {
            i11 = -16777216;
        }
        this.f38420f.setTextColor(i11);
    }

    @Override
    public void setVisibility(int i9) {
        super.setVisibility(i9);
        if (i9 == 0 && !this.f38417b) {
            this.f38417b = true;
            MediaDataController.getInstance(UserConfig.selectedAccount).setPlaceholderImage(this.f38418c, "tg_placeholders_android", "🧐", "100_100");
        }
    }
}
