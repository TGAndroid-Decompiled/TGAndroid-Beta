package org.telegram.ui;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class be1 implements TextWatcher {
    public final ce1 f32110a;

    public be1(ce1 ce1Var) {
        this.f32110a = ce1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        ce1 ce1Var = this.f32110a;
        if (ce1Var.I) {
            return;
        }
        if (ce1Var.f32764a.length() > 0) {
            String str = "https://" + ce1Var.getMessagesController().linkPrefix + "/addtheme/" + ((Object) ce1Var.f32764a.getText());
            String formatString = LocaleController.formatString("ThemeHelpLink", R.string.ThemeHelpLink, str);
            int indexOf = formatString.indexOf(str);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(str, ce1Var, 8), indexOf, str.length() + indexOf, 33);
            }
            ce1Var.d.setText(TextUtils.concat(ce1Var.H, "\n\n", spannableStringBuilder));
            return;
        }
        ce1Var.d.setText(ce1Var.H);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        ce1 ce1Var = this.f32110a;
        if (ce1Var.G) {
            return;
        }
        ce1Var.Z(ce1Var.f32764a.getText().toString(), false);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
