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
    public final LinearLayout f34556a;
    public boolean f34557b;
    public final org.telegram.ui.Components.p9 f34558c;
    public final TextView d;
    public final TextView e;
    public final TextView f34559f;
    public final ph.d h;
    public ValueAnimator f34560n;
    public boolean f34561r;

    public h3(Context context) {
        super(context);
        this.f34561r = true;
        setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f34556a = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(32.0f), AndroidUtilities.dp(24.0f));
        linearLayout.setOrientation(1);
        linearLayout.setGravity(3);
        addView(linearLayout, k7.b6.e(-2, -2, 17));
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.f34558c = p9Var;
        linearLayout.addView(p9Var, k7.b6.n(100, 100));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 19.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextColor(-1);
        TextView i10 = ai.i(linearLayout, textView, k7.b6.t(-2, -2, 3, 0, 4, 0, 2), context);
        this.e = i10;
        i10.setTextSize(1, 15.0f);
        i10.setTextColor(-1);
        i10.setSingleLine(false);
        i10.setMaxLines(3);
        TextView i11 = ai.i(linearLayout, i10, k7.b6.t(-2, -2, 3, 0, 0, 0, 1), context);
        this.f34559f = i11;
        i11.setTextSize(1, 12.0f);
        i11.setTextColor(-1);
        i11.setAlpha(0.4f);
        linearLayout.addView(i11, k7.b6.q(-2, -2, 3));
        ph.d dVar = new ph.d(context, null, true);
        this.h = dVar;
        dVar.setMinWidth(AndroidUtilities.dp(140.0f));
        dVar.g(LocaleController.getString(R.string.Refresh), false, true);
        linearLayout.addView(dVar, k7.b6.t(-2, 40, 3, 0, 12, 0, 0));
    }

    public final void a(String str, String str2) {
        this.d.setText(LocaleController.getString(R.string.WebErrorTitle));
        b.o(R.string.WebErrorInfoBot, new Object[]{str}, this.e);
        this.f34559f.setText(str2);
    }

    public final void b(boolean z4, boolean z10) {
        int i10;
        int i11;
        float f10;
        if (this.f34561r == z4) {
            return;
        }
        this.f34561r = z4;
        ValueAnimator valueAnimator = this.f34560n;
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
            this.f34560n = ofFloat;
            ofFloat.addUpdateListener(new g3(this, 0));
            this.f34560n.start();
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
        this.e.setTextColor(i11);
        if (!z4) {
            i12 = -16777216;
        }
        this.f34559f.setTextColor(i12);
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 0 && !this.f34557b) {
            this.f34557b = true;
            MediaDataController.getInstance(UserConfig.selectedAccount).setPlaceholderImage(this.f34558c, "tg_placeholders_android", "🧐", "100_100");
        }
    }
}
