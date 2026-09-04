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
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.l51;
import org.telegram.ui.Components.n01;
public abstract class z6 extends LinearLayout {
    public TextView f23614a;
    public d90 f23615b;
    public TextView f23616c;
    public TextView d;
    public int f23617e;
    public int f23618f;

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setType(int i10) {
        int i11 = this.f23618f;
        TextView textView = this.f23616c;
        d90 d90Var = this.f23615b;
        TextView textView2 = this.f23614a;
        TextView textView3 = this.d;
        this.f23617e = i10;
        if (i10 == 0) {
            textView2.setText(LocaleController.formatString(R.string.CheckPhoneNumber, org.telegram.messenger.w1.j(new StringBuilder("+"), MessagesController.getInstance(i11).getUser(Long.valueOf(UserConfig.getInstance(i11).clientUserId)).phone, gf.b.c())));
            String string = LocaleController.getString(R.string.CheckPhoneNumberInfo);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            int indexOf = string.indexOf("**");
            int lastIndexOf = string.lastIndexOf("**");
            if (indexOf >= 0 && lastIndexOf >= 0 && indexOf != lastIndexOf) {
                spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 2, (CharSequence) "");
                spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) "");
                try {
                    spannableStringBuilder.setSpan(new l51(LocaleController.getString(R.string.CheckPhoneNumberLearnMoreUrl), (n01) null), indexOf, lastIndexOf - 2, 33);
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
            d90Var.setText(spannableStringBuilder);
            textView.setText(LocaleController.getString(R.string.CheckPhoneNumberYes));
            textView3.setVisibility(0);
            textView3.setText(LocaleController.getString(R.string.CheckPhoneNumberNo));
        } else if (i10 == 1) {
            textView2.setText(LocaleController.getString(R.string.YourPasswordHeader));
            d90Var.setText(LocaleController.getString(R.string.YourPasswordRemember));
            textView.setText(LocaleController.getString(R.string.YourPasswordRememberYes));
            textView3.setVisibility(0);
            textView3.setText(LocaleController.getString(R.string.YourPasswordRememberNo));
        } else if (i10 == 2) {
            textView2.setText(LocaleController.getString(R.string.GraceSuggestionTitle));
            d90Var.setText(LocaleController.getString(R.string.GraceSuggestionMessage));
            textView.setText(LocaleController.getString(R.string.GraceSuggestionButton));
            textView3.setVisibility(8);
        }
    }
}
