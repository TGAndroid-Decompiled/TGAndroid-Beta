package org.telegram.ui;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class nc1 implements TextWatcher {
    public final oc1 f39536a;

    public nc1(oc1 oc1Var) {
        this.f39536a = oc1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        oc1 oc1Var = this.f39536a;
        if (oc1Var.I) {
            return;
        }
        if (oc1Var.f39838a.length() > 0) {
            String str = "https://" + oc1Var.getMessagesController().linkPrefix + "/addtheme/" + ((Object) oc1Var.f39838a.getText());
            String formatString = LocaleController.formatString("ThemeHelpLink", R.string.ThemeHelpLink, str);
            int indexOf = formatString.indexOf(str);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(str, oc1Var, 8), indexOf, str.length() + indexOf, 33);
            }
            oc1Var.d.setText(TextUtils.concat(oc1Var.H, "\n\n", spannableStringBuilder));
            return;
        }
        oc1Var.d.setText(oc1Var.H);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        oc1 oc1Var = this.f39536a;
        if (oc1Var.G) {
            return;
        }
        oc1Var.Z(oc1Var.f39838a.getText().toString(), false);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
