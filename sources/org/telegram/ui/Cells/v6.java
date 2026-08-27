package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.xz0;

public abstract class v6 extends LinearLayout {

    public TextView f25809a;

    public p80 f25810b;

    public TextView f25811c;
    public TextView d;

    public int f25812e;

    public int f25813f;

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setType(int i10) {
        int i11 = this.f25813f;
        TextView textView = this.f25811c;
        p80 p80Var = this.f25810b;
        TextView textView2 = this.f25809a;
        TextView textView3 = this.d;
        this.f25812e = i10;
        if (i10 != 0) {
            if (i10 == 1) {
                textView2.setText(LocaleController.getString(R.string.YourPasswordHeader));
                p80Var.setText(LocaleController.getString(R.string.YourPasswordRemember));
                textView.setText(LocaleController.getString(R.string.YourPasswordRememberYes));
                textView3.setVisibility(0);
                textView3.setText(LocaleController.getString(R.string.YourPasswordRememberNo));
                return;
            }
            if (i10 == 2) {
                textView2.setText(LocaleController.getString(R.string.GraceSuggestionTitle));
                p80Var.setText(LocaleController.getString(R.string.GraceSuggestionMessage));
                textView.setText(LocaleController.getString(R.string.GraceSuggestionButton));
                textView3.setVisibility(8);
                return;
            }
            return;
        }
        textView2.setText(LocaleController.formatString(R.string.CheckPhoneNumber, org.telegram.messenger.y1.k(new StringBuilder("+"), MessagesController.getInstance(i11).getUser(Long.valueOf(UserConfig.getInstance(i11).clientUserId)).phone, oe.b.c())));
        String string = LocaleController.getString(R.string.CheckPhoneNumberInfo);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        int iIndexOf = string.indexOf("**");
        int iLastIndexOf = string.lastIndexOf("**");
        if (iIndexOf >= 0 && iLastIndexOf >= 0 && iIndexOf != iLastIndexOf) {
            spannableStringBuilder.replace(iLastIndexOf, iLastIndexOf + 2, (CharSequence) "");
            spannableStringBuilder.replace(iIndexOf, iIndexOf + 2, (CharSequence) "");
            try {
                spannableStringBuilder.setSpan(new r41(LocaleController.getString(R.string.CheckPhoneNumberLearnMoreUrl), (xz0) null), iIndexOf, iLastIndexOf - 2, 33);
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }
        p80Var.setText(spannableStringBuilder);
        textView.setText(LocaleController.getString(R.string.CheckPhoneNumberYes));
        textView3.setVisibility(0);
        textView3.setText(LocaleController.getString(R.string.CheckPhoneNumberNo));
    }
}
