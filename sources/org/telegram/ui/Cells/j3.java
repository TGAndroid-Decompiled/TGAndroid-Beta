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
public final class j3 implements TextWatcher {
    public final int f29352a = 2;
    public boolean f29353b;
    public int f29354c;
    public Object d;

    public j3() {
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f29352a) {
            case 0:
                int i7 = this.f29354c;
                k3 k3Var = (k3) this.d;
                i3 i3Var = k3Var.d;
                if (!k3Var.f29411c) {
                    if (i7 > 0 && editable != null && editable.length() > i7) {
                        k3Var.f29411c = true;
                        i3Var.setText(editable.subSequence(0, i7));
                        i3Var.setSelection(i3Var.length());
                        k3Var.f29411c = false;
                    }
                    k3Var.b(editable);
                }
                if (this.f29353b) {
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
                org.telegram.ui.Components.u4 u4Var = (org.telegram.ui.Components.u4) this.d;
                if (!this.f29353b) {
                    int length = editable.length();
                    int i10 = this.f29354c;
                    if (length > i10) {
                        this.f29353b = true;
                        editable.delete(i10, editable.length());
                        org.telegram.messenger.g0.F3(u4Var);
                        try {
                            u4Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        this.f29353b = false;
                        return;
                    }
                    return;
                }
                return;
            case 2:
                return;
            default:
                ec0 ec0Var = (ec0) this.d;
                ah.i iVar = ec0Var.f45265c;
                if (!this.f29353b) {
                    boolean z9 = true;
                    ec0Var.p(true);
                    org.telegram.messenger.g0.r(ec0Var.V);
                    ec0Var.n(false);
                    if (TextUtils.isEmpty(editable)) {
                        ec0Var.D = false;
                    }
                    if (!ec0Var.o(editable.toString())) {
                        ec0Var.r(true);
                        this.f29353b = true;
                        if (iVar.getSelectionEnd() < iVar.getText().length()) {
                            z9 = false;
                        }
                        if (!ec0Var.D) {
                            String str = ec0Var.K;
                            iVar.setText(str.substring(0, Utilities.j(this.f29354c, str.length(), 0)));
                            if (z9) {
                                iVar.setSelection(iVar.getText().length());
                            }
                        }
                        this.f29353b = false;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        switch (this.f29352a) {
            case 0:
                k3 k3Var = (k3) this.d;
                if (!k3Var.f29411c) {
                    k3Var.f29415r = false;
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                if (!this.f29353b) {
                    HashMap hashMap = new HashMap();
                    boolean z9 = charSequence instanceof Spannable;
                    int i12 = 0;
                    if (z9) {
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
                    if (z9) {
                        i12 = ((SuggestionSpan[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), SuggestionSpan.class)).length;
                    }
                    this.f29354c = i12;
                    return;
                }
                return;
            default:
                if (!this.f29353b && charSequence != null && ((ec0) this.d).K != null) {
                    this.f29354c = ec0.s(charSequence.toString()).length();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12;
        switch (this.f29352a) {
            case 0:
            case 1:
                return;
            case 2:
                if (!this.f29353b) {
                    boolean z9 = charSequence instanceof Spannable;
                    if (z9) {
                        i12 = ((SuggestionSpan[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), SuggestionSpan.class)).length;
                    } else {
                        i12 = 0;
                    }
                    HashMap hashMap = (HashMap) this.d;
                    if (hashMap != null) {
                        if ((i12 > 0 || this.f29354c > 0) && i7 == 0 && i10 == i11) {
                            this.f29353b = true;
                            if (z9) {
                                Spannable spannable = (Spannable) charSequence;
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (spannable.getSpanStart(entry.getKey()) == -1) {
                                        spannable.setSpan(entry.getKey(), ((Integer) ((Pair) entry.getValue()).first).intValue(), ((Integer) ((Pair) entry.getValue()).second).intValue(), 33);
                                    }
                                }
                            }
                            this.f29353b = false;
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

    public j3(k3 k3Var, int i7, boolean z9) {
        this.d = k3Var;
        this.f29354c = i7;
        this.f29353b = z9;
    }

    public j3(int i7, org.telegram.ui.Components.u4 u4Var) {
        this.f29354c = i7;
        this.d = u4Var;
    }

    public j3(ec0 ec0Var) {
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
