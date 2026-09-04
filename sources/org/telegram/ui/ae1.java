package org.telegram.ui;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ae1 implements TextWatcher {
    public final be1 f34396a;

    public ae1(be1 be1Var) {
        this.f34396a = be1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        be1 be1Var = this.f34396a;
        if (be1Var.I) {
            return;
        }
        if (be1Var.f34773a.length() > 0) {
            String str = "https://" + be1Var.getMessagesController().linkPrefix + "/addtheme/" + ((Object) be1Var.f34773a.getText());
            String formatString = LocaleController.formatString("ThemeHelpLink", R.string.ThemeHelpLink, str);
            int indexOf = formatString.indexOf(str);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(str, be1Var, 8), indexOf, str.length() + indexOf, 33);
            }
            be1Var.d.setText(TextUtils.concat(be1Var.H, "\n\n", spannableStringBuilder));
            return;
        }
        be1Var.d.setText(be1Var.H);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        be1 be1Var = this.f34396a;
        if (be1Var.G) {
            return;
        }
        be1Var.Z(be1Var.f34773a.getText().toString(), false);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
