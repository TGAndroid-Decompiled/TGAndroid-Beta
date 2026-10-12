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
import org.telegram.messenger.am;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.y61;
import org.telegram.ui.Components.z11;
public abstract class z6 extends LinearLayout {
    public TextView f23570a;
    public ia0 f23571b;
    public TextView f23572c;
    public TextView d;
    public int f23573e;
    public int f23574f;

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setType(int i10) {
        int i11 = this.f23574f;
        TextView textView = this.f23572c;
        ia0 ia0Var = this.f23571b;
        TextView textView2 = this.f23570a;
        TextView textView3 = this.d;
        this.f23573e = i10;
        if (i10 == 0) {
            textView2.setText(LocaleController.formatString(R.string.CheckPhoneNumber, am.g(new StringBuilder("+"), MessagesController.getInstance(i11).getUser(Long.valueOf(UserConfig.getInstance(i11).clientUserId)).phone, hf.b.c())));
            String string = LocaleController.getString(R.string.CheckPhoneNumberInfo);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            int indexOf = string.indexOf("**");
            int lastIndexOf = string.lastIndexOf("**");
            if (indexOf >= 0 && lastIndexOf >= 0 && indexOf != lastIndexOf) {
                spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 2, (CharSequence) "");
                spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) "");
                try {
                    spannableStringBuilder.setSpan(new y61(LocaleController.getString(R.string.CheckPhoneNumberLearnMoreUrl), (z11) null), indexOf, lastIndexOf - 2, 33);
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
            ia0Var.setText(spannableStringBuilder);
            textView.setText(LocaleController.getString(R.string.CheckPhoneNumberYes));
            textView3.setVisibility(0);
            textView3.setText(LocaleController.getString(R.string.CheckPhoneNumberNo));
        } else if (i10 == 1) {
            textView2.setText(LocaleController.getString(R.string.YourPasswordHeader));
            ia0Var.setText(LocaleController.getString(R.string.YourPasswordRemember));
            textView.setText(LocaleController.getString(R.string.YourPasswordRememberYes));
            textView3.setVisibility(0);
            textView3.setText(LocaleController.getString(R.string.YourPasswordRememberNo));
        } else if (i10 == 2) {
            textView2.setText(LocaleController.getString(R.string.GraceSuggestionTitle));
            ia0Var.setText(LocaleController.getString(R.string.GraceSuggestionMessage));
            textView.setText(LocaleController.getString(R.string.GraceSuggestionButton));
            textView3.setVisibility(8);
        }
    }
}
