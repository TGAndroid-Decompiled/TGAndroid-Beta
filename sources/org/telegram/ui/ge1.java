package org.telegram.ui;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ge1 implements TextWatcher {
    public final he1 f36175a;

    public ge1(he1 he1Var) {
        this.f36175a = he1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        he1 he1Var = this.f36175a;
        if (he1Var.I) {
            return;
        }
        if (he1Var.f36527a.length() > 0) {
            String str = "https://" + he1Var.getMessagesController().linkPrefix + "/addtheme/" + ((Object) he1Var.f36527a.getText());
            String formatString = LocaleController.formatString("ThemeHelpLink", R.string.ThemeHelpLink, str);
            int indexOf = formatString.indexOf(str);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(str, he1Var, 8), indexOf, str.length() + indexOf, 33);
            }
            he1Var.d.setText(TextUtils.concat(he1Var.H, "\n\n", spannableStringBuilder));
            return;
        }
        he1Var.d.setText(he1Var.H);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        he1 he1Var = this.f36175a;
        if (he1Var.G) {
            return;
        }
        he1Var.Z(he1Var.f36527a.getText().toString(), false);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
