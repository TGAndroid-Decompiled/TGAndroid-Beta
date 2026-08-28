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
public final class sa extends FrameLayout {
    public static final int f25296f = 0;
    public final LinearLayout f25297a;
    public final TextView f25298b;
    public final TextView f25299c;
    public final ra d;
    public final ra f25300e;

    public sa(Activity activity) {
        super(activity);
        setClickable(true);
        LinearLayout linearLayout = new LinearLayout(activity);
        this.f25297a = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(activity);
        this.f25298b = textView;
        textView.setGravity(17);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.UnconfirmedAuthTitle));
        linearLayout.addView(textView, g7.e6.p(-1, -2, 0.0f, 55, 28, 8, 28, 0));
        TextView textView2 = new TextView(activity);
        this.f25299c = textView2;
        textView2.setGravity(17);
        textView2.setTextSize(1, 13.0f);
        textView2.setLineSpacing(AndroidUtilities.dpf2(2.0f), 1.0f);
        linearLayout.addView(textView2, g7.e6.p(-1, -2, 0.0f, 55, 28, 2, 28, 0));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(17);
        linearLayout2.addView(new Space(activity), g7.e6.o(-2, 1, 17.0f, 1));
        ra raVar = new ra(activity);
        this.d = raVar;
        raVar.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f));
        raVar.setTypeface(AndroidUtilities.bold());
        raVar.setTextSize(1, 14.22f);
        raVar.setText(LocaleController.getString(R.string.UnconfirmedAuthConfirm));
        linearLayout2.addView(raVar, g7.e6.n(-2, 30));
        linearLayout2.addView(new Space(activity), g7.e6.o(-2, 1, 17.0f, 1));
        ra raVar2 = new ra(activity);
        this.f25300e = raVar2;
        raVar2.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f));
        raVar2.setTypeface(AndroidUtilities.bold());
        raVar2.setTextSize(1, 14.22f);
        raVar2.setText(LocaleController.getString(R.string.UnconfirmedAuthDeny));
        linearLayout2.addView(raVar2, g7.e6.n(-2, 30));
        linearLayout2.addView(new Space(activity), g7.e6.o(-2, 1, 17.0f, 1));
        linearLayout.addView(linearLayout2, g7.e6.k(28.0f, 4.0f, 28.0f, 8.0f, -1, -2));
        addView(linearLayout, g7.e6.e(-1, -1, 119));
        b();
    }

    public static String a(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth) {
        if (unconfirmedAuth == null) {
            return "";
        }
        String str = "" + unconfirmedAuth.device;
        if (!TextUtils.isEmpty(unconfirmedAuth.location) && !str.isEmpty()) {
            str = str.concat(", ");
        }
        StringBuilder n10 = e2.c.n(str);
        n10.append(unconfirmedAuth.location);
        return n10.toString();
    }

    public final void b() {
        float f10;
        this.f25298b.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
        this.f25299c.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23369y6, false));
        int i9 = org.telegram.ui.ActionBar.f6.I6;
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, i9, false);
        ra raVar = this.d;
        raVar.setTextColor(w02);
        int w03 = org.telegram.ui.ActionBar.f6.w0(null, i9, false);
        float f11 = 0.15f;
        if (org.telegram.ui.ActionBar.f6.I.q()) {
            f10 = 0.3f;
        } else {
            f10 = 0.15f;
        }
        raVar.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.l1(f10, w03), 7, AndroidUtilities.dp(8.0f)));
        int i10 = org.telegram.ui.ActionBar.f6.f23230q7;
        int w04 = org.telegram.ui.ActionBar.f6.w0(null, i10, false);
        ra raVar2 = this.f25300e;
        raVar2.setTextColor(w04);
        int w05 = org.telegram.ui.ActionBar.f6.w0(null, i10, false);
        if (org.telegram.ui.ActionBar.f6.I.q()) {
            f11 = 0.3f;
        }
        raVar2.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.l1(f11, w05), 7, AndroidUtilities.dp(8.0f)));
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        if (size <= 0) {
            size = AndroidUtilities.displaySize.x;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((size - getPaddingLeft()) - getPaddingRight(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE);
        LinearLayout linearLayout = this.f25297a;
        linearLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + linearLayout.getMeasuredHeight() + 1, 1073741824));
    }
}
