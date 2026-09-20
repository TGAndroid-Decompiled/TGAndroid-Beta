package org.telegram.ui.Cells;

import android.text.Editable;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.CharacterStyle;
import android.text.style.ParagraphStyle;
import android.text.style.SuggestionSpan;
import android.util.Pair;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ze0;
public final class j3 implements TextWatcher {
    public final int f20462a = 1;
    public boolean f20463b;
    public int f20464c;
    public Object d;

    public j3() {
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f20462a) {
            case 0:
                int i10 = this.f20464c;
                k3 k3Var = (k3) this.d;
                i3 i3Var = k3Var.f20527b;
                if (!k3Var.f20526a) {
                    if (i10 > 0 && editable != null && editable.length() > i10) {
                        k3Var.f20526a = true;
                        i3Var.setText(editable.subSequence(0, i10));
                        i3Var.setSelection(i3Var.length());
                        k3Var.f20526a = false;
                    }
                    k3Var.b(editable);
                }
                if (this.f20463b) {
                    return;
                }
                while (true) {
                    int indexOf = editable.toString().indexOf("\n");
                    if (indexOf >= 0) {
                        editable.delete(indexOf, indexOf + 1);
                    } else {
                        return;
                    }
                }
            case 1:
                return;
            default:
                ze0 ze0Var = (ze0) this.d;
                ci.h2 h2Var = ze0Var.f40195c;
                if (!this.f20463b) {
                    boolean z10 = true;
                    ze0Var.q(true);
                    AndroidUtilities.cancelRunOnUIThread(ze0Var.V);
                    ze0Var.o(false);
                    if (TextUtils.isEmpty(editable)) {
                        ze0Var.f40202y = false;
                    }
                    if (!ze0Var.p(editable.toString())) {
                        ze0Var.s(true);
                        this.f20463b = true;
                        if (h2Var.getSelectionEnd() < h2Var.getText().length()) {
                            z10 = false;
                        }
                        if (!ze0Var.f40202y) {
                            String str = ze0Var.K;
                            h2Var.setText(str.substring(0, Utilities.clamp(this.f20464c, str.length(), 0)));
                            if (z10) {
                                h2Var.setSelection(h2Var.getText().length());
                            }
                        }
                        this.f20463b = false;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f20462a) {
            case 0:
                k3 k3Var = (k3) this.d;
                if (!k3Var.f20526a) {
                    k3Var.h = false;
                    return;
                }
                return;
            case 1:
                if (!this.f20463b) {
                    HashMap hashMap = new HashMap();
                    boolean z10 = charSequence instanceof Spannable;
                    int i13 = 0;
                    if (z10) {
                        Spannable spannable = (Spannable) charSequence;
                        CharacterStyle[] characterStyleArr = (CharacterStyle[]) spannable.getSpans(0, spannable.length(), CharacterStyle.class);
                        ParagraphStyle[] paragraphStyleArr = (ParagraphStyle[]) spannable.getSpans(0, spannable.length(), ParagraphStyle.class);
                        if (characterStyleArr != null && characterStyleArr.length > 0) {
                            for (CharacterStyle characterStyle : characterStyleArr) {
                                if (characterStyle != null && !(characterStyle instanceof SuggestionSpan)) {
                                    hashMap.put(characterStyle, new Pair(Integer.valueOf(spannable.getSpanStart(characterStyle)), Integer.valueOf(spannable.getSpanEnd(characterStyle))));
                                }
                            }
                        }
                        if (paragraphStyleArr != null && paragraphStyleArr.length > 0) {
                            for (ParagraphStyle paragraphStyle : paragraphStyleArr) {
                                if (paragraphStyle != null && !(paragraphStyle instanceof SuggestionSpan)) {
                                    hashMap.put(paragraphStyle, new Pair(Integer.valueOf(spannable.getSpanStart(paragraphStyle)), Integer.valueOf(spannable.getSpanEnd(paragraphStyle))));
                                }
                            }
                        }
                    }
                    this.d = hashMap;
                    if (z10) {
                        i13 = ((SuggestionSpan[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), SuggestionSpan.class)).length;
                    }
                    this.f20464c = i13;
                    return;
                }
                return;
            default:
                if (!this.f20463b && charSequence != null && ((ze0) this.d).K != null) {
                    this.f20464c = ze0.u(charSequence.toString()).length();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13;
        switch (this.f20462a) {
            case 0:
                return;
            case 1:
                if (!this.f20463b) {
                    boolean z10 = charSequence instanceof Spannable;
                    if (z10) {
                        i13 = ((SuggestionSpan[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), SuggestionSpan.class)).length;
                    } else {
                        i13 = 0;
                    }
                    HashMap hashMap = (HashMap) this.d;
                    if (hashMap != null) {
                        if ((i13 > 0 || this.f20464c > 0) && i10 == 0 && i11 == i12) {
                            this.f20463b = true;
                            if (z10) {
                                Spannable spannable = (Spannable) charSequence;
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (spannable.getSpanStart(entry.getKey()) == -1) {
                                        spannable.setSpan(entry.getKey(), ((Integer) ((Pair) entry.getValue()).first).intValue(), ((Integer) ((Pair) entry.getValue()).second).intValue(), 33);
                                    }
                                }
                            }
                            this.f20463b = false;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public j3(k3 k3Var, int i10, boolean z10) {
        this.d = k3Var;
        this.f20464c = i10;
        this.f20463b = z10;
    }

    public j3(ze0 ze0Var) {
        this.d = ze0Var;
    }

    private final void a(Editable editable) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
