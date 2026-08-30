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
    public final LinearLayout f34146a;
    public boolean f34147b;
    public final org.telegram.ui.Components.p9 f34148c;
    public final TextView d;
    public final TextView e;
    public final TextView f34149f;
    public final ph.d h;
    public ValueAnimator f34150n;
    public boolean f34151r;

    public f3(Context context) {
        super(context);
        this.f34151r = true;
        setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f34146a = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(32.0f), AndroidUtilities.dp(24.0f));
        linearLayout.setOrientation(1);
        linearLayout.setGravity(3);
        addView(linearLayout, k7.b6.e(-2, -2, 17));
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.f34148c = p9Var;
        linearLayout.addView(p9Var, k7.b6.n(100, 100));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 19.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextColor(-1);
        TextView j10 = yh.j(linearLayout, textView, k7.b6.t(-2, -2, 3, 0, 4, 0, 2), context);
        this.e = j10;
        j10.setTextSize(1, 15.0f);
        j10.setTextColor(-1);
        j10.setSingleLine(false);
        j10.setMaxLines(3);
        TextView j11 = yh.j(linearLayout, j10, k7.b6.t(-2, -2, 3, 0, 0, 0, 1), context);
        this.f34149f = j11;
        j11.setTextSize(1, 12.0f);
        j11.setTextColor(-1);
        j11.setAlpha(0.4f);
        linearLayout.addView(j11, k7.b6.q(-2, -2, 3));
        ph.d dVar = new ph.d(context, null, true);
        this.h = dVar;
        dVar.setMinWidth(AndroidUtilities.dp(140.0f));
        dVar.g(LocaleController.getString(R.string.Refresh), false, true);
        linearLayout.addView(dVar, k7.b6.t(-2, 40, 3, 0, 12, 0, 0));
    }

    public final void a(String str, String str2) {
        this.d.setText(LocaleController.getString(R.string.WebErrorTitle));
        b.o(R.string.WebErrorInfoBot, new Object[]{str}, this.e);
        this.f34149f.setText(str2);
    }

    public final void b(boolean z4, boolean z10) {
        int i10;
        int i11;
        float f10;
        if (this.f34151r == z4) {
            return;
        }
        this.f34151r = z4;
        ValueAnimator valueAnimator = this.f34150n;
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
            this.f34150n = ofFloat;
            ofFloat.addUpdateListener(new e3(this, 0));
            this.f34150n.start();
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
        this.f34149f.setTextColor(i12);
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 0 && !this.f34147b) {
            this.f34147b = true;
            MediaDataController.getInstance(UserConfig.selectedAccount).setPlaceholderImage(this.f34148c, "tg_placeholders_android", "🧐", "100_100");
        }
    }
}
