package org.telegram.ui;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class nd1 implements TextWatcher {
    public final od1 f39329a;

    public nd1(od1 od1Var) {
        this.f39329a = od1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        od1 od1Var = this.f39329a;
        if (od1Var.F) {
            return;
        }
        if (od1Var.f39662a.length() > 0) {
            String str = "https://" + od1Var.getMessagesController().linkPrefix + "/addtheme/" + ((Object) od1Var.f39662a.getText());
            String formatString = LocaleController.formatString("ThemeHelpLink", R.string.ThemeHelpLink, str);
            int indexOf = formatString.indexOf(str);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(str, od1Var, 8), indexOf, str.length() + indexOf, 33);
            }
            od1Var.d.setText(TextUtils.concat(od1Var.E, "\n\n", spannableStringBuilder));
            return;
        }
        od1Var.d.setText(od1Var.E);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        od1 od1Var = this.f39329a;
        if (od1Var.D) {
            return;
        }
        od1Var.Z(od1Var.f39662a.getText().toString(), false);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
