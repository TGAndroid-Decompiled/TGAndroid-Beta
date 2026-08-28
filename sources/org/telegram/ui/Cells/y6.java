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
import org.telegram.messenger.ll;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.vz0;
public abstract class y6 extends LinearLayout {
    public TextView f25995a;
    public l80 f25996b;
    public TextView f25997c;
    public TextView d;
    public int f25998e;
    public int f25999f;

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), i10);
    }

    public void setType(int i9) {
        int i10 = this.f25999f;
        TextView textView = this.f25997c;
        l80 l80Var = this.f25996b;
        TextView textView2 = this.f25995a;
        TextView textView3 = this.d;
        this.f25998e = i9;
        if (i9 == 0) {
            textView2.setText(LocaleController.formatString(R.string.CheckPhoneNumber, ll.g(new StringBuilder("+"), MessagesController.getInstance(i10).getUser(Long.valueOf(UserConfig.getInstance(i10).clientUserId)).phone, ne.b.c())));
            String string = LocaleController.getString(R.string.CheckPhoneNumberInfo);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            int indexOf = string.indexOf("**");
            int lastIndexOf = string.lastIndexOf("**");
            if (indexOf >= 0 && lastIndexOf >= 0 && indexOf != lastIndexOf) {
                spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 2, (CharSequence) "");
                spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) "");
                try {
                    spannableStringBuilder.setSpan(new p41(LocaleController.getString(R.string.CheckPhoneNumberLearnMoreUrl), (vz0) null), indexOf, lastIndexOf - 2, 33);
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            l80Var.setText(spannableStringBuilder);
            textView.setText(LocaleController.getString(R.string.CheckPhoneNumberYes));
            textView3.setVisibility(0);
            textView3.setText(LocaleController.getString(R.string.CheckPhoneNumberNo));
        } else if (i9 == 1) {
            textView2.setText(LocaleController.getString(R.string.YourPasswordHeader));
            l80Var.setText(LocaleController.getString(R.string.YourPasswordRemember));
            textView.setText(LocaleController.getString(R.string.YourPasswordRememberYes));
            textView3.setVisibility(0);
            textView3.setText(LocaleController.getString(R.string.YourPasswordRememberNo));
        } else if (i9 == 2) {
            textView2.setText(LocaleController.getString(R.string.GraceSuggestionTitle));
            l80Var.setText(LocaleController.getString(R.string.GraceSuggestionMessage));
            textView.setText(LocaleController.getString(R.string.GraceSuggestionButton));
            textView3.setVisibility(8);
        }
    }
}
