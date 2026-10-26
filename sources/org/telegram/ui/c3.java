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
public final class c3 extends FrameLayout {
    public final LinearLayout f38235a;
    public boolean f38236b;
    public final org.telegram.ui.Components.y9 f38237c;
    public final TextView d;
    public final TextView e;
    public final TextView f38238f;
    public final fi.d h;
    public ValueAnimator f38239n;
    public boolean f38240r;

    public c3(Context context) {
        super(context);
        this.f38240r = true;
        setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f38235a = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(32.0f), AndroidUtilities.dp(24.0f));
        linearLayout.setOrientation(1);
        linearLayout.setGravity(3);
        addView(linearLayout, org.telegram.ui.Components.gb1.i(-2, -2, 17));
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.f38237c = y9Var;
        linearLayout.addView(y9Var, org.telegram.ui.Components.gb1.r(100, 100));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 19.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextColor(-1);
        TextView e = org.telegram.messenger.vh.e(linearLayout, textView, org.telegram.ui.Components.gb1.x(-2, -2, 3, 0, 4, 0, 2), context);
        this.e = e;
        e.setTextSize(1, 15.0f);
        e.setTextColor(-1);
        e.setSingleLine(false);
        e.setMaxLines(3);
        TextView e10 = org.telegram.messenger.vh.e(linearLayout, e, org.telegram.ui.Components.gb1.x(-2, -2, 3, 0, 0, 0, 1), context);
        this.f38238f = e10;
        e10.setTextSize(1, 12.0f);
        e10.setTextColor(-1);
        e10.setAlpha(0.4f);
        linearLayout.addView(e10, org.telegram.ui.Components.gb1.u(-2, -2, 3));
        fi.d dVar = new fi.d(context, null, true);
        this.h = dVar;
        dVar.setMinWidth(AndroidUtilities.dp(140.0f));
        dVar.i(LocaleController.getString(R.string.Refresh), false, true);
        linearLayout.addView(dVar, org.telegram.ui.Components.gb1.x(-2, 40, 3, 0, 12, 0, 0));
    }

    public final void a(String str, String str2) {
        this.d.setText(LocaleController.getString(R.string.WebErrorTitle));
        org.telegram.messenger.vh.o(R.string.WebErrorInfoBot, new Object[]{str}, this.e);
        this.f38238f.setText(str2);
    }

    public final void b(boolean z10, boolean z11) {
        int i10;
        int i11;
        float f7;
        if (this.f38240r == z10) {
            return;
        }
        this.f38240r = z10;
        ValueAnimator valueAnimator = this.f38239n;
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
            this.f38239n = ofFloat;
            ofFloat.addUpdateListener(new b3(this, 0));
            this.f38239n.start();
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
        this.f38238f.setTextColor(i12);
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 0 && !this.f38236b) {
            this.f38236b = true;
            MediaDataController.getInstance(UserConfig.selectedAccount).setPlaceholderImage(this.f38237c, "tg_placeholders_android", "🧐", "100_100");
        }
    }
}
