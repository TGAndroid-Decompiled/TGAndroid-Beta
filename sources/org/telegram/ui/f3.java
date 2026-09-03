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
    public final LinearLayout f36639a;
    public boolean f36640b;
    public final org.telegram.ui.Components.p9 f36641c;
    public final TextView d;
    public final TextView f36642e;
    public final TextView f36643f;
    public final qh.d h;
    public ValueAnimator f36644n;
    public boolean f36645r;

    public f3(Context context) {
        super(context);
        this.f36645r = true;
        setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f36639a = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(32.0f), AndroidUtilities.dp(24.0f));
        linearLayout.setOrientation(1);
        linearLayout.setGravity(3);
        addView(linearLayout, k7.c6.e(-2, -2, 17));
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.f36641c = p9Var;
        linearLayout.addView(p9Var, k7.c6.n(100, 100));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 19.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextColor(-1);
        TextView i10 = yh.i(linearLayout, textView, k7.c6.t(-2, -2, 3, 0, 4, 0, 2), context);
        this.f36642e = i10;
        i10.setTextSize(1, 15.0f);
        i10.setTextColor(-1);
        i10.setSingleLine(false);
        i10.setMaxLines(3);
        TextView i11 = yh.i(linearLayout, i10, k7.c6.t(-2, -2, 3, 0, 0, 0, 1), context);
        this.f36643f = i11;
        i11.setTextSize(1, 12.0f);
        i11.setTextColor(-1);
        i11.setAlpha(0.4f);
        linearLayout.addView(i11, k7.c6.q(-2, -2, 3));
        qh.d dVar = new qh.d(context, null, true);
        this.h = dVar;
        dVar.setMinWidth(AndroidUtilities.dp(140.0f));
        dVar.g(LocaleController.getString(R.string.Refresh), false, true);
        linearLayout.addView(dVar, k7.c6.t(-2, 40, 3, 0, 12, 0, 0));
    }

    public final void a(String str, String str2) {
        this.d.setText(LocaleController.getString(R.string.WebErrorTitle));
        b.o(R.string.WebErrorInfoBot, new Object[]{str}, this.f36642e);
        this.f36643f.setText(str2);
    }

    public final void b(boolean z4, boolean z10) {
        int i10;
        int i11;
        float f10;
        if (this.f36645r == z4) {
            return;
        }
        this.f36645r = z4;
        ValueAnimator valueAnimator = this.f36644n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z10) {
            float f11 = 1.0f;
            if (z4) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            if (!z4) {
                f11 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f11);
            this.f36644n = ofFloat;
            ofFloat.addUpdateListener(new e3(this, 0));
            this.f36644n.start();
            return;
        }
        int i12 = -1;
        if (!z4) {
            i10 = -16777216;
        } else {
            i10 = -1;
        }
        this.d.setTextColor(i10);
        if (!z4) {
            i11 = -16777216;
        } else {
            i11 = -1;
        }
        this.f36642e.setTextColor(i11);
        if (!z4) {
            i12 = -16777216;
        }
        this.f36643f.setTextColor(i12);
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 0 && !this.f36640b) {
            this.f36640b = true;
            MediaDataController.getInstance(UserConfig.selectedAccount).setPlaceholderImage(this.f36641c, "tg_placeholders_android", "🧐", "100_100");
        }
    }
}
