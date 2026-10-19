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
import org.telegram.messenger.kk;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.m11;
import org.telegram.ui.Components.x90;
public abstract class y6 extends LinearLayout {
    public TextView f23838a;
    public x90 f23839b;
    public TextView f23840c;
    public TextView d;
    public int e;
    public int f23841f;

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setType(int i10) {
        int i11 = this.f23841f;
        TextView textView = this.f23840c;
        x90 x90Var = this.f23839b;
        TextView textView2 = this.f23838a;
        TextView textView3 = this.d;
        this.e = i10;
        if (i10 == 0) {
            textView2.setText(LocaleController.formatString(R.string.CheckPhoneNumber, kk.g(new StringBuilder("+"), MessagesController.getInstance(i11).getUser(Long.valueOf(UserConfig.getInstance(i11).clientUserId)).phone, jf.b.c())));
            String string = LocaleController.getString(R.string.CheckPhoneNumberInfo);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            int indexOf = string.indexOf("**");
            int lastIndexOf = string.lastIndexOf("**");
            if (indexOf >= 0 && lastIndexOf >= 0 && indexOf != lastIndexOf) {
                spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 2, (CharSequence) "");
                spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) "");
                try {
                    spannableStringBuilder.setSpan(new k61(LocaleController.getString(R.string.CheckPhoneNumberLearnMoreUrl), (m11) null), indexOf, lastIndexOf - 2, 33);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            x90Var.setText(spannableStringBuilder);
            textView.setText(LocaleController.getString(R.string.CheckPhoneNumberYes));
            textView3.setVisibility(0);
            textView3.setText(LocaleController.getString(R.string.CheckPhoneNumberNo));
        } else if (i10 == 1) {
            textView2.setText(LocaleController.getString(R.string.YourPasswordHeader));
            x90Var.setText(LocaleController.getString(R.string.YourPasswordRemember));
            textView.setText(LocaleController.getString(R.string.YourPasswordRememberYes));
            textView3.setVisibility(0);
            textView3.setText(LocaleController.getString(R.string.YourPasswordRememberNo));
        } else if (i10 == 2) {
            textView2.setText(LocaleController.getString(R.string.GraceSuggestionTitle));
            x90Var.setText(LocaleController.getString(R.string.GraceSuggestionMessage));
            textView.setText(LocaleController.getString(R.string.GraceSuggestionButton));
            textView3.setVisibility(8);
        }
    }
}
