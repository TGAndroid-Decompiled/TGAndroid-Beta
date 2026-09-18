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
public final class h3 implements TextWatcher {
    public final int f20184a = 1;
    public boolean f20185b;
    public int f20186c;
    public Object d;

    public h3() {
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f20184a) {
            case 0:
                int i10 = this.f20186c;
                i3 i3Var = (i3) this.d;
                g3 g3Var = i3Var.f20240b;
                if (!i3Var.f20239a) {
                    if (i10 > 0 && editable != null && editable.length() > i10) {
                        i3Var.f20239a = true;
                        g3Var.setText(editable.subSequence(0, i10));
                        g3Var.setSelection(g3Var.length());
                        i3Var.f20239a = false;
                    }
                    i3Var.b(editable);
                }
                if (this.f20185b) {
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
                ci.h2 h2Var = ze0Var.f40235c;
                if (!this.f20185b) {
                    boolean z10 = true;
                    ze0Var.q(true);
                    AndroidUtilities.cancelRunOnUIThread(ze0Var.V);
                    ze0Var.o(false);
                    if (TextUtils.isEmpty(editable)) {
                        ze0Var.f40242y = false;
                    }
                    if (!ze0Var.p(editable.toString())) {
                        ze0Var.s(true);
                        this.f20185b = true;
                        if (h2Var.getSelectionEnd() < h2Var.getText().length()) {
                            z10 = false;
                        }
                        if (!ze0Var.f40242y) {
                            String str = ze0Var.K;
                            h2Var.setText(str.substring(0, Utilities.clamp(this.f20186c, str.length(), 0)));
                            if (z10) {
                                h2Var.setSelection(h2Var.getText().length());
                            }
                        }
                        this.f20185b = false;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f20184a) {
            case 0:
                i3 i3Var = (i3) this.d;
                if (!i3Var.f20239a) {
                    i3Var.h = false;
                    return;
                }
                return;
            case 1:
                if (!this.f20185b) {
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
                    this.f20186c = i13;
                    return;
                }
                return;
            default:
                if (!this.f20185b && charSequence != null && ((ze0) this.d).K != null) {
                    this.f20186c = ze0.u(charSequence.toString()).length();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13;
        switch (this.f20184a) {
            case 0:
                return;
            case 1:
                if (!this.f20185b) {
                    boolean z10 = charSequence instanceof Spannable;
                    if (z10) {
                        i13 = ((SuggestionSpan[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), SuggestionSpan.class)).length;
                    } else {
                        i13 = 0;
                    }
                    HashMap hashMap = (HashMap) this.d;
                    if (hashMap != null) {
                        if ((i13 > 0 || this.f20186c > 0) && i10 == 0 && i11 == i12) {
                            this.f20185b = true;
                            if (z10) {
                                Spannable spannable = (Spannable) charSequence;
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (spannable.getSpanStart(entry.getKey()) == -1) {
                                        spannable.setSpan(entry.getKey(), ((Integer) ((Pair) entry.getValue()).first).intValue(), ((Integer) ((Pair) entry.getValue()).second).intValue(), 33);
                                    }
                                }
                            }
                            this.f20185b = false;
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

    public h3(i3 i3Var, int i10, boolean z10) {
        this.d = i3Var;
        this.f20186c = i10;
        this.f20185b = z10;
    }

    public h3(ze0 ze0Var) {
        this.d = ze0Var;
    }

    private final void a(Editable editable) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
