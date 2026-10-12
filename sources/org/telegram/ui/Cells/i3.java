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
import org.telegram.ui.xe0;
public final class i3 implements TextWatcher {
    public final int f21994a = 1;
    public boolean f21995b;
    public int f21996c;
    public Object d;

    public i3() {
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f21994a) {
            case 0:
                int i10 = this.f21996c;
                j3 j3Var = (j3) this.d;
                h3 h3Var = j3Var.f22080b;
                if (!j3Var.f22079a) {
                    if (i10 > 0 && editable != null && editable.length() > i10) {
                        j3Var.f22079a = true;
                        h3Var.setText(editable.subSequence(0, i10));
                        h3Var.setSelection(h3Var.length());
                        j3Var.f22079a = false;
                    }
                    j3Var.b(editable);
                }
                if (this.f21995b) {
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
                xe0 xe0Var = (xe0) this.d;
                ci.g2 g2Var = xe0Var.f43910c;
                if (!this.f21995b) {
                    boolean z10 = true;
                    xe0Var.q(true);
                    AndroidUtilities.cancelRunOnUIThread(xe0Var.V);
                    xe0Var.o(false);
                    if (TextUtils.isEmpty(editable)) {
                        xe0Var.f43918y = false;
                    }
                    if (!xe0Var.p(editable.toString())) {
                        xe0Var.s(true);
                        this.f21995b = true;
                        if (g2Var.getSelectionEnd() < g2Var.getText().length()) {
                            z10 = false;
                        }
                        if (!xe0Var.f43918y) {
                            String str = xe0Var.K;
                            g2Var.setText(str.substring(0, Utilities.clamp(this.f21996c, str.length(), 0)));
                            if (z10) {
                                g2Var.setSelection(g2Var.getText().length());
                            }
                        }
                        this.f21995b = false;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f21994a) {
            case 0:
                j3 j3Var = (j3) this.d;
                if (!j3Var.f22079a) {
                    j3Var.h = false;
                    return;
                }
                return;
            case 1:
                if (!this.f21995b) {
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
                    this.f21996c = i13;
                    return;
                }
                return;
            default:
                if (!this.f21995b && charSequence != null && ((xe0) this.d).K != null) {
                    this.f21996c = xe0.t(charSequence.toString()).length();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13;
        switch (this.f21994a) {
            case 0:
                return;
            case 1:
                if (!this.f21995b) {
                    boolean z10 = charSequence instanceof Spannable;
                    if (z10) {
                        i13 = ((SuggestionSpan[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), SuggestionSpan.class)).length;
                    } else {
                        i13 = 0;
                    }
                    HashMap hashMap = (HashMap) this.d;
                    if (hashMap != null) {
                        if ((i13 > 0 || this.f21996c > 0) && i10 == 0 && i11 == i12) {
                            this.f21995b = true;
                            if (z10) {
                                Spannable spannable = (Spannable) charSequence;
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (spannable.getSpanStart(entry.getKey()) == -1) {
                                        spannable.setSpan(entry.getKey(), ((Integer) ((Pair) entry.getValue()).first).intValue(), ((Integer) ((Pair) entry.getValue()).second).intValue(), 33);
                                    }
                                }
                            }
                            this.f21995b = false;
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

    public i3(j3 j3Var, int i10, boolean z10) {
        this.d = j3Var;
        this.f21996c = i10;
        this.f21995b = z10;
    }

    public i3(xe0 xe0Var) {
        this.d = xe0Var;
    }

    private final void a(Editable editable) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
