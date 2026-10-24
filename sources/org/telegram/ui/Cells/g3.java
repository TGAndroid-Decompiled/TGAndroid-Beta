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
import org.telegram.ui.ie0;
public final class g3 implements TextWatcher {
    public final int f22401a = 1;
    public boolean f22402b;
    public int f22403c;
    public Object d;

    public g3() {
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f22401a) {
            case 0:
                int i10 = this.f22403c;
                h3 h3Var = (h3) this.d;
                f3 f3Var = h3Var.d;
                if (!h3Var.f22453c) {
                    if (i10 > 0 && editable != null && editable.length() > i10) {
                        h3Var.f22453c = true;
                        f3Var.setText(editable.subSequence(0, i10));
                        f3Var.setSelection(f3Var.length());
                        h3Var.f22453c = false;
                    }
                    h3Var.b(editable);
                }
                if (this.f22402b) {
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
                ie0 ie0Var = (ie0) this.d;
                ei.e2 e2Var = ie0Var.f38268c;
                if (!this.f22402b) {
                    boolean z10 = true;
                    ie0Var.p(true);
                    AndroidUtilities.cancelRunOnUIThread(ie0Var.V);
                    ie0Var.n(false);
                    if (TextUtils.isEmpty(editable)) {
                        ie0Var.f38275y = false;
                    }
                    if (!ie0Var.o(editable.toString())) {
                        ie0Var.r(true);
                        this.f22402b = true;
                        if (e2Var.getSelectionEnd() < e2Var.getText().length()) {
                            z10 = false;
                        }
                        if (!ie0Var.f38275y) {
                            String str = ie0Var.K;
                            e2Var.setText(str.substring(0, Utilities.clamp(this.f22403c, str.length(), 0)));
                            if (z10) {
                                e2Var.setSelection(e2Var.getText().length());
                            }
                        }
                        this.f22402b = false;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f22401a) {
            case 0:
                h3 h3Var = (h3) this.d;
                if (!h3Var.f22453c) {
                    h3Var.f22456r = false;
                    return;
                }
                return;
            case 1:
                if (!this.f22402b) {
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
                    this.f22403c = i13;
                    return;
                }
                return;
            default:
                if (!this.f22402b && charSequence != null && ((ie0) this.d).K != null) {
                    this.f22403c = ie0.s(charSequence.toString()).length();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13;
        switch (this.f22401a) {
            case 0:
                return;
            case 1:
                if (!this.f22402b) {
                    boolean z10 = charSequence instanceof Spannable;
                    if (z10) {
                        i13 = ((SuggestionSpan[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), SuggestionSpan.class)).length;
                    } else {
                        i13 = 0;
                    }
                    HashMap hashMap = (HashMap) this.d;
                    if (hashMap != null) {
                        if ((i13 > 0 || this.f22403c > 0) && i10 == 0 && i11 == i12) {
                            this.f22402b = true;
                            if (z10) {
                                Spannable spannable = (Spannable) charSequence;
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (spannable.getSpanStart(entry.getKey()) == -1) {
                                        spannable.setSpan(entry.getKey(), ((Integer) ((Pair) entry.getValue()).first).intValue(), ((Integer) ((Pair) entry.getValue()).second).intValue(), 33);
                                    }
                                }
                            }
                            this.f22402b = false;
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

    public g3(h3 h3Var, int i10, boolean z10) {
        this.d = h3Var;
        this.f22403c = i10;
        this.f22402b = z10;
    }

    public g3(ie0 ie0Var) {
        this.d = ie0Var;
    }

    private final void a(Editable editable) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
