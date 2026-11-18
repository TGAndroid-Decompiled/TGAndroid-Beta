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
import org.telegram.messenger.Utilities;
import org.telegram.ui.ec0;
public final class k3 implements TextWatcher {
    public final int f30915a = 2;
    public boolean f30916b;
    public int f30917c;
    public Object d;

    public k3() {
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f30915a) {
            case 0:
                int i7 = this.f30917c;
                l3 l3Var = (l3) this.d;
                j3 j3Var = l3Var.d;
                if (!l3Var.f30971c) {
                    if (i7 > 0 && editable != null && editable.length() > i7) {
                        l3Var.f30971c = true;
                        j3Var.setText(editable.subSequence(0, i7));
                        j3Var.setSelection(j3Var.length());
                        l3Var.f30971c = false;
                    }
                    l3Var.b(editable);
                }
                if (this.f30916b) {
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
                org.telegram.ui.Components.a5 a5Var = (org.telegram.ui.Components.a5) this.d;
                if (!this.f30916b) {
                    int length = editable.length();
                    int i10 = this.f30917c;
                    if (length > i10) {
                        this.f30916b = true;
                        editable.delete(i10, editable.length());
                        org.telegram.messenger.g0.D3(a5Var);
                        try {
                            a5Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        this.f30916b = false;
                        return;
                    }
                    return;
                }
                return;
            case 2:
                return;
            default:
                ec0 ec0Var = (ec0) this.d;
                ah.i iVar = ec0Var.f47163c;
                if (!this.f30916b) {
                    boolean z10 = true;
                    ec0Var.p(true);
                    org.telegram.messenger.g0.r(ec0Var.W);
                    ec0Var.n(false);
                    if (TextUtils.isEmpty(editable)) {
                        ec0Var.E = false;
                    }
                    if (!ec0Var.o(editable.toString())) {
                        ec0Var.r(true);
                        this.f30916b = true;
                        if (iVar.getSelectionEnd() < iVar.getText().length()) {
                            z10 = false;
                        }
                        if (!ec0Var.E) {
                            String str = ec0Var.L;
                            iVar.setText(str.substring(0, Utilities.j(this.f30917c, str.length(), 0)));
                            if (z10) {
                                iVar.setSelection(iVar.getText().length());
                            }
                        }
                        this.f30916b = false;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        switch (this.f30915a) {
            case 0:
                l3 l3Var = (l3) this.d;
                if (!l3Var.f30971c) {
                    l3Var.f30975r = false;
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                if (!this.f30916b) {
                    HashMap hashMap = new HashMap();
                    boolean z10 = charSequence instanceof Spannable;
                    int i12 = 0;
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
                        i12 = ((SuggestionSpan[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), SuggestionSpan.class)).length;
                    }
                    this.f30917c = i12;
                    return;
                }
                return;
            default:
                if (!this.f30916b && charSequence != null && ((ec0) this.d).L != null) {
                    this.f30917c = ec0.s(charSequence.toString()).length();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12;
        switch (this.f30915a) {
            case 0:
            case 1:
                return;
            case 2:
                if (!this.f30916b) {
                    boolean z10 = charSequence instanceof Spannable;
                    if (z10) {
                        i12 = ((SuggestionSpan[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), SuggestionSpan.class)).length;
                    } else {
                        i12 = 0;
                    }
                    HashMap hashMap = (HashMap) this.d;
                    if (hashMap != null) {
                        if ((i12 > 0 || this.f30917c > 0) && i7 == 0 && i10 == i11) {
                            this.f30916b = true;
                            if (z10) {
                                Spannable spannable = (Spannable) charSequence;
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (spannable.getSpanStart(entry.getKey()) == -1) {
                                        spannable.setSpan(entry.getKey(), ((Integer) ((Pair) entry.getValue()).first).intValue(), ((Integer) ((Pair) entry.getValue()).second).intValue(), 33);
                                    }
                                }
                            }
                            this.f30916b = false;
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

    public k3(l3 l3Var, int i7, boolean z10) {
        this.d = l3Var;
        this.f30917c = i7;
        this.f30916b = z10;
    }

    public k3(int i7, org.telegram.ui.Components.a5 a5Var) {
        this.f30917c = i7;
        this.d = a5Var;
    }

    public k3(ec0 ec0Var) {
        this.d = ec0Var;
    }

    private final void a(Editable editable) {
    }

    private final void b(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void e(int i7, int i10, int i11, CharSequence charSequence) {
    }
}
