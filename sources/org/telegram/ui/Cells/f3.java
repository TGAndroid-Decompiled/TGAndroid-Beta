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
import org.telegram.ui.ge0;
public final class f3 implements TextWatcher {
    public final int f24058a = 1;
    public boolean f24059b;
    public int f24060c;
    public Object d;

    public f3() {
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f24058a) {
            case 0:
                int i10 = this.f24060c;
                g3 g3Var = (g3) this.d;
                e3 e3Var = g3Var.d;
                if (!g3Var.f24145c) {
                    if (i10 > 0 && editable != null && editable.length() > i10) {
                        g3Var.f24145c = true;
                        e3Var.setText(editable.subSequence(0, i10));
                        e3Var.setSelection(e3Var.length());
                        g3Var.f24145c = false;
                    }
                    g3Var.b(editable);
                }
                if (this.f24059b) {
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
                ge0 ge0Var = (ge0) this.d;
                fi.c2 c2Var = ge0Var.f39627c;
                if (!this.f24059b) {
                    boolean z10 = true;
                    ge0Var.p(true);
                    AndroidUtilities.cancelRunOnUIThread(ge0Var.V);
                    ge0Var.n(false);
                    if (TextUtils.isEmpty(editable)) {
                        ge0Var.f39634y = false;
                    }
                    if (!ge0Var.o(editable.toString())) {
                        ge0Var.r(true);
                        this.f24059b = true;
                        if (c2Var.getSelectionEnd() < c2Var.getText().length()) {
                            z10 = false;
                        }
                        if (!ge0Var.f39634y) {
                            String str = ge0Var.K;
                            c2Var.setText(str.substring(0, Utilities.clamp(this.f24060c, str.length(), 0)));
                            if (z10) {
                                c2Var.setSelection(c2Var.getText().length());
                            }
                        }
                        this.f24059b = false;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f24058a) {
            case 0:
                g3 g3Var = (g3) this.d;
                if (!g3Var.f24145c) {
                    g3Var.f24148r = false;
                    return;
                }
                return;
            case 1:
                if (!this.f24059b) {
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
                    this.f24060c = i13;
                    return;
                }
                return;
            default:
                if (!this.f24059b && charSequence != null && ((ge0) this.d).K != null) {
                    this.f24060c = ge0.s(charSequence.toString()).length();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13;
        switch (this.f24058a) {
            case 0:
                return;
            case 1:
                if (!this.f24059b) {
                    boolean z10 = charSequence instanceof Spannable;
                    if (z10) {
                        i13 = ((SuggestionSpan[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), SuggestionSpan.class)).length;
                    } else {
                        i13 = 0;
                    }
                    HashMap hashMap = (HashMap) this.d;
                    if (hashMap != null) {
                        if ((i13 > 0 || this.f24060c > 0) && i10 == 0 && i11 == i12) {
                            this.f24059b = true;
                            if (z10) {
                                Spannable spannable = (Spannable) charSequence;
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (spannable.getSpanStart(entry.getKey()) == -1) {
                                        spannable.setSpan(entry.getKey(), ((Integer) ((Pair) entry.getValue()).first).intValue(), ((Integer) ((Pair) entry.getValue()).second).intValue(), 33);
                                    }
                                }
                            }
                            this.f24059b = false;
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

    public f3(g3 g3Var, int i10, boolean z10) {
        this.d = g3Var;
        this.f24060c = i10;
        this.f24059b = z10;
    }

    public f3(ge0 ge0Var) {
        this.d = ge0Var;
    }

    private final void a(Editable editable) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
