package org.telegram.ui.Cells;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.ui.Components.kb1;
public final class xa extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public static final int f25730n = 0;
    public final LinearLayout f25731a;
    public final TextView f25732b;
    public final TextView f25733c;
    public final wa d;
    public final wa e;
    public int f25734f;
    public int h;

    public xa(Activity activity) {
        super(activity);
        setClickable(true);
        LinearLayout linearLayout = new LinearLayout(activity);
        this.f25731a = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(activity);
        this.f25732b = textView;
        textView.setGravity(17);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.UnconfirmedAuthTitle));
        linearLayout.addView(textView, kb1.t(-1, -2, 0.0f, 55, 28, 8, 28, 0));
        TextView textView2 = new TextView(activity);
        this.f25733c = textView2;
        textView2.setGravity(17);
        textView2.setTextSize(1, 13.0f);
        textView2.setLineSpacing(AndroidUtilities.dpf2(2.0f), 1.0f);
        linearLayout.addView(textView2, kb1.t(-1, -2, 0.0f, 55, 28, 2, 28, 0));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(17);
        linearLayout2.addView(new Space(activity), kb1.s(-2, 1, 17.0f, 1));
        wa waVar = new wa(activity);
        this.d = waVar;
        waVar.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f));
        waVar.setTypeface(AndroidUtilities.bold());
        waVar.setTextSize(1, 14.22f);
        waVar.setText(LocaleController.getString(R.string.UnconfirmedAuthConfirm));
        linearLayout2.addView(waVar, kb1.r(-2, 30));
        linearLayout2.addView(new Space(activity), kb1.s(-2, 1, 17.0f, 1));
        wa waVar2 = new wa(activity);
        this.e = waVar2;
        waVar2.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f));
        waVar2.setTypeface(AndroidUtilities.bold());
        waVar2.setTextSize(1, 14.22f);
        waVar2.setText(LocaleController.getString(R.string.UnconfirmedAuthDeny));
        linearLayout2.addView(waVar2, kb1.r(-2, 30));
        linearLayout2.addView(new Space(activity), kb1.s(-2, 1, 17.0f, 1));
        linearLayout.addView(linearLayout2, kb1.o(28.0f, 4.0f, 28.0f, 8.0f, -1, -2));
        addView(linearLayout, kb1.i(-1, -1, 119));
        updateColors();
    }

    public static String a(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth) {
        if (unconfirmedAuth == null) {
            return "";
        }
        String str = "" + unconfirmedAuth.device;
        if (!TextUtils.isEmpty(unconfirmedAuth.location) && !str.isEmpty()) {
            str = str.concat(", ");
        }
        StringBuilder u10 = a1.g.u(str);
        u10.append(unconfirmedAuth.location);
        return u10.toString();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        if (size <= 0) {
            size = AndroidUtilities.displaySize.x;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((size - getPaddingLeft()) - getPaddingRight(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE);
        LinearLayout linearLayout = this.f25731a;
        linearLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + linearLayout.getMeasuredHeight() + 1, 1073741824));
    }

    @Override
    public final void updateColors() {
        TextView textView;
        wa waVar;
        wa waVar2;
        float f7;
        TextView textView2 = this.f25732b;
        if (textView2 != null && (textView = this.f25733c) != null && (waVar = this.d) != null && (waVar2 = this.e) != null) {
            textView2.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.G6, false));
            textView.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23749y6, false));
            int i10 = org.telegram.ui.ActionBar.y6.I6;
            waVar.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, i10, false));
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, i10, false);
            float f10 = 0.15f;
            if (org.telegram.ui.ActionBar.y6.I.q()) {
                f7 = 0.3f;
            } else {
                f7 = 0.15f;
            }
            int o12 = org.telegram.ui.ActionBar.y6.o1(f7, x02);
            if (waVar.getBackground() != null) {
                if (o12 != this.f25734f) {
                    org.telegram.ui.ActionBar.y6.E1(waVar.getBackground(), o12, true);
                }
            } else {
                waVar.setBackground(org.telegram.ui.ActionBar.y6.g0(o12, 7, AndroidUtilities.dp(8.0f)));
            }
            int i11 = org.telegram.ui.ActionBar.y6.f23599q7;
            waVar2.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, i11, false));
            int x03 = org.telegram.ui.ActionBar.y6.x0(null, i11, false);
            if (org.telegram.ui.ActionBar.y6.I.q()) {
                f10 = 0.3f;
            }
            int o13 = org.telegram.ui.ActionBar.y6.o1(f10, x03);
            if (waVar2.getBackground() != null) {
                if (o13 != this.h) {
                    org.telegram.ui.ActionBar.y6.E1(waVar2.getBackground(), o13, true);
                }
            } else {
                waVar2.setBackground(org.telegram.ui.ActionBar.y6.g0(o13, 7, AndroidUtilities.dp(8.0f)));
            }
            this.f25734f = o12;
            this.h = o13;
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
