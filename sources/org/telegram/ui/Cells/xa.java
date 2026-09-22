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
public final class xa extends FrameLayout {
    public static final int f21630f = 0;
    public final LinearLayout f21631a;
    public final TextView f21632b;
    public final TextView f21633c;
    public final wa d;
    public final wa e;

    public xa(Activity activity) {
        super(activity);
        setClickable(true);
        LinearLayout linearLayout = new LinearLayout(activity);
        this.f21631a = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(activity);
        this.f21632b = textView;
        textView.setGravity(17);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.UnconfirmedAuthTitle));
        linearLayout.addView(textView, w7.x5.p(-1, -2, 0.0f, 55, 28, 8, 28, 0));
        TextView textView2 = new TextView(activity);
        this.f21633c = textView2;
        textView2.setGravity(17);
        textView2.setTextSize(1, 13.0f);
        textView2.setLineSpacing(AndroidUtilities.dpf2(2.0f), 1.0f);
        linearLayout.addView(textView2, w7.x5.p(-1, -2, 0.0f, 55, 28, 2, 28, 0));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(17);
        linearLayout2.addView(new Space(activity), w7.x5.o(-2, 1, 17.0f, 1));
        wa waVar = new wa(activity);
        this.d = waVar;
        waVar.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f));
        waVar.setTypeface(AndroidUtilities.bold());
        waVar.setTextSize(1, 14.22f);
        waVar.setText(LocaleController.getString(R.string.UnconfirmedAuthConfirm));
        linearLayout2.addView(waVar, w7.x5.n(-2, 30));
        linearLayout2.addView(new Space(activity), w7.x5.o(-2, 1, 17.0f, 1));
        wa waVar2 = new wa(activity);
        this.e = waVar2;
        waVar2.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f));
        waVar2.setTypeface(AndroidUtilities.bold());
        waVar2.setTextSize(1, 14.22f);
        waVar2.setText(LocaleController.getString(R.string.UnconfirmedAuthDeny));
        linearLayout2.addView(waVar2, w7.x5.n(-2, 30));
        linearLayout2.addView(new Space(activity), w7.x5.o(-2, 1, 17.0f, 1));
        linearLayout.addView(linearLayout2, w7.x5.k(28.0f, 4.0f, 28.0f, 8.0f, -1, -2));
        addView(linearLayout, w7.x5.e(-1, -1, 119));
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
        StringBuilder v = a4.a.v(str);
        v.append(unconfirmedAuth.location);
        return v.toString();
    }

    public final void b() {
        float f7;
        this.f21632b.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.G6, false));
        this.f21633c.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19215y6, false));
        int i10 = org.telegram.ui.ActionBar.i6.I6;
        int w02 = org.telegram.ui.ActionBar.i6.w0(null, i10, false);
        wa waVar = this.d;
        waVar.setTextColor(w02);
        int w03 = org.telegram.ui.ActionBar.i6.w0(null, i10, false);
        float f10 = 0.15f;
        if (org.telegram.ui.ActionBar.i6.I.q()) {
            f7 = 0.3f;
        } else {
            f7 = 0.15f;
        }
        waVar.setBackground(org.telegram.ui.ActionBar.i6.f0(org.telegram.ui.ActionBar.i6.l1(f7, w03), 7, AndroidUtilities.dp(8.0f)));
        int i11 = org.telegram.ui.ActionBar.i6.f19071q7;
        int w04 = org.telegram.ui.ActionBar.i6.w0(null, i11, false);
        wa waVar2 = this.e;
        waVar2.setTextColor(w04);
        int w05 = org.telegram.ui.ActionBar.i6.w0(null, i11, false);
        if (org.telegram.ui.ActionBar.i6.I.q()) {
            f10 = 0.3f;
        }
        waVar2.setBackground(org.telegram.ui.ActionBar.i6.f0(org.telegram.ui.ActionBar.i6.l1(f10, w05), 7, AndroidUtilities.dp(8.0f)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        if (size <= 0) {
            size = AndroidUtilities.displaySize.x;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((size - getPaddingLeft()) - getPaddingRight(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE);
        LinearLayout linearLayout = this.f21631a;
        linearLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + linearLayout.getMeasuredHeight() + 1, 1073741824));
    }
}
