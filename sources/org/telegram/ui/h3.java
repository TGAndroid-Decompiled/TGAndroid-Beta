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
    public final LinearLayout f38748a;
    public boolean f38749b;
    public final org.telegram.ui.Components.t9 f38750c;
    public final TextView d;
    public final TextView f38751e;
    public final TextView f38752f;
    public final nh.d h;
    public ValueAnimator f38753n;
    public boolean f38754r;

    public h3(Context context) {
        super(context);
        this.f38754r = true;
        setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f38748a = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(32.0f), AndroidUtilities.dp(24.0f));
        linearLayout.setOrientation(1);
        linearLayout.setGravity(3);
        addView(linearLayout, i7.f6.e(-2, -2, 17));
        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
        this.f38750c = t9Var;
        linearLayout.addView(t9Var, i7.f6.n(100, 100));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 19.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextColor(-1);
        TextView i10 = th.i(linearLayout, textView, i7.f6.t(-2, -2, 3, 0, 4, 0, 2), context);
        this.f38751e = i10;
        i10.setTextSize(1, 15.0f);
        i10.setTextColor(-1);
        i10.setSingleLine(false);
        i10.setMaxLines(3);
        TextView i11 = th.i(linearLayout, i10, i7.f6.t(-2, -2, 3, 0, 0, 0, 1), context);
        this.f38752f = i11;
        i11.setTextSize(1, 12.0f);
        i11.setTextColor(-1);
        i11.setAlpha(0.4f);
        linearLayout.addView(i11, i7.f6.q(-2, -2, 3));
        nh.d dVar = new nh.d(context, null, true);
        this.h = dVar;
        dVar.setMinWidth(AndroidUtilities.dp(140.0f));
        dVar.g(LocaleController.getString(R.string.Refresh), false, true);
        linearLayout.addView(dVar, i7.f6.t(-2, 40, 3, 0, 12, 0, 0));
    }

    public final void a(String str, String str2) {
        this.d.setText(LocaleController.getString(R.string.WebErrorTitle));
        b.p(R.string.WebErrorInfoBot, new Object[]{str}, this.f38751e);
        this.f38752f.setText(str2);
    }

    public final void b(boolean z10, boolean z11) {
        int i10;
        int i11;
        float f9;
        if (this.f38754r == z10) {
            return;
        }
        this.f38754r = z10;
        ValueAnimator valueAnimator = this.f38753n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z11) {
            float f10 = 1.0f;
            if (z10) {
                f9 = 0.0f;
            } else {
                f9 = 1.0f;
            }
            if (!z10) {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f9, f10);
            this.f38753n = ofFloat;
            ofFloat.addUpdateListener(new g3(this, 0));
            this.f38753n.start();
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
        this.f38751e.setTextColor(i11);
        if (!z10) {
            i12 = -16777216;
        }
        this.f38752f.setTextColor(i12);
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 0 && !this.f38749b) {
            this.f38749b = true;
            MediaDataController.getInstance(UserConfig.selectedAccount).setPlaceholderImage(this.f38750c, "tg_placeholders_android", "🧐", "100_100");
        }
    }
}
