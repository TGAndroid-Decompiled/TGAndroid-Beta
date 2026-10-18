package org.telegram.ui;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class pc1 implements TextWatcher {
    public final qc1 f40052a;

    public pc1(qc1 qc1Var) {
        this.f40052a = qc1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        qc1 qc1Var = this.f40052a;
        if (qc1Var.I) {
            return;
        }
        if (qc1Var.f40338a.length() > 0) {
            String str = "https://" + qc1Var.getMessagesController().linkPrefix + "/addtheme/" + ((Object) qc1Var.f40338a.getText());
            String formatString = LocaleController.formatString("ThemeHelpLink", R.string.ThemeHelpLink, str);
            int indexOf = formatString.indexOf(str);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(str, qc1Var, 8), indexOf, str.length() + indexOf, 33);
            }
            qc1Var.d.setText(TextUtils.concat(qc1Var.H, "\n\n", spannableStringBuilder));
            return;
        }
        qc1Var.d.setText(qc1Var.H);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        qc1 qc1Var = this.f40052a;
        if (qc1Var.G) {
            return;
        }
        qc1Var.Z(qc1Var.f40338a.getText().toString(), false);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
