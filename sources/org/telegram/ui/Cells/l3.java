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
import org.telegram.ui.kd0;
public final class l3 implements TextWatcher {
    public final int f22229a = 2;
    public boolean f22230b;
    public int f22231c;
    public Object d;

    public l3() {
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f22229a) {
            case 0:
                int i10 = this.f22231c;
                m3 m3Var = (m3) this.d;
                k3 k3Var = m3Var.d;
                if (!m3Var.f22293c) {
                    if (i10 > 0 && editable != null && editable.length() > i10) {
                        m3Var.f22293c = true;
                        k3Var.setText(editable.subSequence(0, i10));
                        k3Var.setSelection(k3Var.length());
                        m3Var.f22293c = false;
                    }
                    m3Var.b(editable);
                }
                if (this.f22230b) {
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
                org.telegram.ui.Components.r4 r4Var = (org.telegram.ui.Components.r4) this.d;
                if (!this.f22230b) {
                    int length = editable.length();
                    int i11 = this.f22231c;
                    if (length > i11) {
                        this.f22230b = true;
                        editable.delete(i11, editable.length());
                        org.telegram.messenger.i0.E3(r4Var);
                        try {
                            r4Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        this.f22230b = false;
                        return;
                    }
                    return;
                }
                return;
            case 2:
                return;
            default:
                kd0 kd0Var = (kd0) this.d;
                org.telegram.ui.ActionBar.n0 n0Var = kd0Var.f38843c;
                if (!this.f22230b) {
                    boolean z10 = true;
                    kd0Var.p(true);
                    org.telegram.messenger.i0.r(kd0Var.V);
                    kd0Var.n(false);
                    if (TextUtils.isEmpty(editable)) {
                        kd0Var.D = false;
                    }
                    if (!kd0Var.o(editable.toString())) {
                        kd0Var.r(true);
                        this.f22230b = true;
                        if (n0Var.getSelectionEnd() < n0Var.getText().length()) {
                            z10 = false;
                        }
                        if (!kd0Var.D) {
                            String str = kd0Var.K;
                            n0Var.setText(str.substring(0, Utilities.j(this.f22231c, str.length(), 0)));
                            if (z10) {
                                n0Var.setSelection(n0Var.getText().length());
                            }
                        }
                        this.f22230b = false;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f22229a) {
            case 0:
                m3 m3Var = (m3) this.d;
                if (!m3Var.f22293c) {
                    m3Var.f22296r = false;
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                if (!this.f22230b) {
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
                    this.f22231c = i13;
                    return;
                }
                return;
            default:
                if (!this.f22230b && charSequence != null && ((kd0) this.d).K != null) {
                    this.f22231c = kd0.s(charSequence.toString()).length();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13;
        switch (this.f22229a) {
            case 0:
            case 1:
                return;
            case 2:
                if (!this.f22230b) {
                    boolean z10 = charSequence instanceof Spannable;
                    if (z10) {
                        i13 = ((SuggestionSpan[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), SuggestionSpan.class)).length;
                    } else {
                        i13 = 0;
                    }
                    HashMap hashMap = (HashMap) this.d;
                    if (hashMap != null) {
                        if ((i13 > 0 || this.f22231c > 0) && i10 == 0 && i11 == i12) {
                            this.f22230b = true;
                            if (z10) {
                                Spannable spannable = (Spannable) charSequence;
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (spannable.getSpanStart(entry.getKey()) == -1) {
                                        spannable.setSpan(entry.getKey(), ((Integer) ((Pair) entry.getValue()).first).intValue(), ((Integer) ((Pair) entry.getValue()).second).intValue(), 33);
                                    }
                                }
                            }
                            this.f22230b = false;
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

    public l3(m3 m3Var, int i10, boolean z10) {
        this.d = m3Var;
        this.f22231c = i10;
        this.f22230b = z10;
    }

    public l3(int i10, org.telegram.ui.Components.r4 r4Var) {
        this.f22231c = i10;
        this.d = r4Var;
    }

    public l3(kd0 kd0Var) {
        this.d = kd0Var;
    }

    private final void a(Editable editable) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void d(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void e(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
