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
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.h01;
import org.telegram.ui.Components.y80;
public abstract class w6 extends LinearLayout {
    public TextView f25870a;
    public y80 f25871b;
    public TextView f25872c;
    public TextView d;
    public int f25873e;
    public int f25874f;

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setType(int i10) {
        int i11 = this.f25874f;
        TextView textView = this.f25872c;
        y80 y80Var = this.f25871b;
        TextView textView2 = this.f25870a;
        TextView textView3 = this.d;
        this.f25873e = i10;
        if (i10 == 0) {
            textView2.setText(LocaleController.formatString(R.string.CheckPhoneNumber, org.telegram.messenger.x3.k(new StringBuilder("+"), MessagesController.getInstance(i11).getUser(Long.valueOf(UserConfig.getInstance(i11).clientUserId)).phone, qe.b.c())));
            String string = LocaleController.getString(R.string.CheckPhoneNumberInfo);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            int indexOf = string.indexOf("**");
            int lastIndexOf = string.lastIndexOf("**");
            if (indexOf >= 0 && lastIndexOf >= 0 && indexOf != lastIndexOf) {
                spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 2, (CharSequence) "");
                spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) "");
                try {
                    spannableStringBuilder.setSpan(new a51(LocaleController.getString(R.string.CheckPhoneNumberLearnMoreUrl), (h01) null), indexOf, lastIndexOf - 2, 33);
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            y80Var.setText(spannableStringBuilder);
            textView.setText(LocaleController.getString(R.string.CheckPhoneNumberYes));
            textView3.setVisibility(0);
            textView3.setText(LocaleController.getString(R.string.CheckPhoneNumberNo));
        } else if (i10 == 1) {
            textView2.setText(LocaleController.getString(R.string.YourPasswordHeader));
            y80Var.setText(LocaleController.getString(R.string.YourPasswordRemember));
            textView.setText(LocaleController.getString(R.string.YourPasswordRememberYes));
            textView3.setVisibility(0);
            textView3.setText(LocaleController.getString(R.string.YourPasswordRememberNo));
        } else if (i10 == 2) {
            textView2.setText(LocaleController.getString(R.string.GraceSuggestionTitle));
            y80Var.setText(LocaleController.getString(R.string.GraceSuggestionMessage));
            textView.setText(LocaleController.getString(R.string.GraceSuggestionButton));
            textView3.setVisibility(8);
        }
    }
}
