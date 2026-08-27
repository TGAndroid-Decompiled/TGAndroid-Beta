package org.telegram.ui.Cells;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UnconfirmedAuthController;

public final class oa extends FrameLayout {

    public static final int f24826f = 0;

    public final LinearLayout f24827a;

    public final TextView f24828b;

    public final TextView f24829c;
    public final na d;

    public final na f24830e;

    public oa(Activity activity) {
        super(activity);
        setClickable(true);
        LinearLayout linearLayout = new LinearLayout(activity);
        this.f24827a = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(activity);
        this.f24828b = textView;
        textView.setGravity(17);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.UnconfirmedAuthTitle));
        linearLayout.addView(textView, h7.z5.p(-1, -2, 0.0f, 55, 28, 8, 28, 0));
        TextView textView2 = new TextView(activity);
        this.f24829c = textView2;
        textView2.setGravity(17);
        textView2.setTextSize(1, 13.0f);
        textView2.setLineSpacing(AndroidUtilities.dpf2(2.0f), 1.0f);
        linearLayout.addView(textView2, h7.z5.p(-1, -2, 0.0f, 55, 28, 2, 28, 0));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(17);
        linearLayout2.addView(new Space(activity), h7.z5.o(-2, 1, 17.0f, 1));
        na naVar = new na(activity);
        this.d = naVar;
        naVar.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f));
        naVar.setTypeface(AndroidUtilities.bold());
        naVar.setTextSize(1, 14.22f);
        naVar.setText(LocaleController.getString(R.string.UnconfirmedAuthConfirm));
        linearLayout2.addView(naVar, h7.z5.n(-2, 30));
        linearLayout2.addView(new Space(activity), h7.z5.o(-2, 1, 17.0f, 1));
        na naVar2 = new na(activity);
        this.f24830e = naVar2;
        naVar2.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f));
        naVar2.setTypeface(AndroidUtilities.bold());
        naVar2.setTextSize(1, 14.22f);
        naVar2.setText(LocaleController.getString(R.string.UnconfirmedAuthDeny));
        linearLayout2.addView(naVar2, h7.z5.n(-2, 30));
        linearLayout2.addView(new Space(activity), h7.z5.o(-2, 1, 17.0f, 1));
        linearLayout.addView(linearLayout2, h7.z5.k(28.0f, 4.0f, 28.0f, 8.0f, -1, -2));
        addView(linearLayout, h7.z5.e(-1, -1, 119));
        b();
    }

    public static String a(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth) {
        if (unconfirmedAuth == null) {
            return "";
        }
        String strConcat = "" + unconfirmedAuth.device;
        if (!TextUtils.isEmpty(unconfirmedAuth.location) && !strConcat.isEmpty()) {
            strConcat = strConcat.concat(", ");
        }
        StringBuilder sbO = com.google.android.recaptcha.internal.a.o(strConcat);
        sbO.append(unconfirmedAuth.location);
        return sbO.toString();
    }

    public final void b() {
        this.f24828b.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        this.f24829c.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23423y6, false));
        int i10 = org.telegram.ui.ActionBar.g6.I6;
        int iW0 = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        na naVar = this.d;
        naVar.setTextColor(iW0);
        naVar.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.l1(org.telegram.ui.ActionBar.g6.I.q() ? 0.3f : 0.15f, org.telegram.ui.ActionBar.g6.w0(null, i10, false)), 7, AndroidUtilities.dp(8.0f)));
        int i11 = org.telegram.ui.ActionBar.g6.f23284q7;
        int iW1 = org.telegram.ui.ActionBar.g6.w0(null, i11, false);
        na naVar2 = this.f24830e;
        naVar2.setTextColor(iW1);
        naVar2.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.l1(org.telegram.ui.ActionBar.g6.I.q() ? 0.3f : 0.15f, org.telegram.ui.ActionBar.g6.w0(null, i11, false)), 7, AndroidUtilities.dp(8.0f)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        if (size <= 0) {
            size = AndroidUtilities.displaySize.x;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((size - getPaddingLeft()) - getPaddingRight(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE);
        LinearLayout linearLayout = this.f24827a;
        linearLayout.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + linearLayout.getMeasuredHeight() + 1, 1073741824));
    }
}
