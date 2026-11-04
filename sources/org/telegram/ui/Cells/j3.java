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
import org.telegram.ui.cc0;
public final class j3 implements TextWatcher {
    public final int f29420a = 2;
    public boolean f29421b;
    public int f29422c;
    public Object d;

    public j3() {
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f29420a) {
            case 0:
                int i3 = this.f29422c;
                k3 k3Var = (k3) this.d;
                i3 i3Var = k3Var.d;
                if (!k3Var.f29485c) {
                    if (i3 > 0 && editable != null && editable.length() > i3) {
                        k3Var.f29485c = true;
                        i3Var.setText(editable.subSequence(0, i3));
                        i3Var.setSelection(i3Var.length());
                        k3Var.f29485c = false;
                    }
                    k3Var.b(editable);
                }
                if (this.f29421b) {
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
                org.telegram.ui.Components.s4 s4Var = (org.telegram.ui.Components.s4) this.d;
                if (!this.f29421b) {
                    int length = editable.length();
                    int i10 = this.f29422c;
                    if (length > i10) {
                        this.f29421b = true;
                        editable.delete(i10, editable.length());
                        org.telegram.messenger.g0.F3(s4Var);
                        try {
                            s4Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        this.f29421b = false;
                        return;
                    }
                    return;
                }
                return;
            case 2:
                return;
            default:
                cc0 cc0Var = (cc0) this.d;
                bh.g gVar = cc0Var.f44299c;
                if (!this.f29421b) {
                    boolean z10 = true;
                    cc0Var.p(true);
                    org.telegram.messenger.g0.r(cc0Var.W);
                    cc0Var.n(false);
                    if (TextUtils.isEmpty(editable)) {
                        cc0Var.E = false;
                    }
                    if (!cc0Var.o(editable.toString())) {
                        cc0Var.r(true);
                        this.f29421b = true;
                        if (gVar.getSelectionEnd() < gVar.getText().length()) {
                            z10 = false;
                        }
                        if (!cc0Var.E) {
                            String str = cc0Var.L;
                            gVar.setText(str.substring(0, Utilities.j(this.f29422c, str.length(), 0)));
                            if (z10) {
                                gVar.setSelection(gVar.getText().length());
                            }
                        }
                        this.f29421b = false;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        switch (this.f29420a) {
            case 0:
                k3 k3Var = (k3) this.d;
                if (!k3Var.f29485c) {
                    k3Var.f29489r = false;
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                if (!this.f29421b) {
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
                    this.f29422c = i12;
                    return;
                }
                return;
            default:
                if (!this.f29421b && charSequence != null && ((cc0) this.d).L != null) {
                    this.f29422c = cc0.s(charSequence.toString()).length();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        int i12;
        switch (this.f29420a) {
            case 0:
            case 1:
                return;
            case 2:
                if (!this.f29421b) {
                    boolean z10 = charSequence instanceof Spannable;
                    if (z10) {
                        i12 = ((SuggestionSpan[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), SuggestionSpan.class)).length;
                    } else {
                        i12 = 0;
                    }
                    HashMap hashMap = (HashMap) this.d;
                    if (hashMap != null) {
                        if ((i12 > 0 || this.f29422c > 0) && i3 == 0 && i10 == i11) {
                            this.f29421b = true;
                            if (z10) {
                                Spannable spannable = (Spannable) charSequence;
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (spannable.getSpanStart(entry.getKey()) == -1) {
                                        spannable.setSpan(entry.getKey(), ((Integer) ((Pair) entry.getValue()).first).intValue(), ((Integer) ((Pair) entry.getValue()).second).intValue(), 33);
                                    }
                                }
                            }
                            this.f29421b = false;
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

    public j3(k3 k3Var, int i3, boolean z10) {
        this.d = k3Var;
        this.f29422c = i3;
        this.f29421b = z10;
    }

    public j3(int i3, org.telegram.ui.Components.s4 s4Var) {
        this.f29422c = i3;
        this.d = s4Var;
    }

    public j3(cc0 cc0Var) {
        this.d = cc0Var;
    }

    private final void a(Editable editable) {
    }

    private final void b(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void e(int i3, int i10, int i11, CharSequence charSequence) {
    }
}
