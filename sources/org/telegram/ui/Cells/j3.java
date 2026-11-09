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
import org.telegram.ui.gc0;
public final class j3 implements TextWatcher {
    public final int f29356a = 2;
    public boolean f29357b;
    public int f29358c;
    public Object d;

    public j3() {
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f29356a) {
            case 0:
                int i7 = this.f29358c;
                k3 k3Var = (k3) this.d;
                i3 i3Var = k3Var.d;
                if (!k3Var.f29415c) {
                    if (i7 > 0 && editable != null && editable.length() > i7) {
                        k3Var.f29415c = true;
                        i3Var.setText(editable.subSequence(0, i7));
                        i3Var.setSelection(i3Var.length());
                        k3Var.f29415c = false;
                    }
                    k3Var.b(editable);
                }
                if (this.f29357b) {
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
                if (!this.f29357b) {
                    int length = editable.length();
                    int i10 = this.f29358c;
                    if (length > i10) {
                        this.f29357b = true;
                        editable.delete(i10, editable.length());
                        org.telegram.messenger.g0.F3(u4Var);
                        try {
                            u4Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        this.f29357b = false;
                        return;
                    }
                    return;
                }
                return;
            case 2:
                return;
            default:
                gc0 gc0Var = (gc0) this.d;
                ah.i iVar = gc0Var.f45965c;
                if (!this.f29357b) {
                    boolean z9 = true;
                    gc0Var.p(true);
                    org.telegram.messenger.g0.r(gc0Var.V);
                    gc0Var.n(false);
                    if (TextUtils.isEmpty(editable)) {
                        gc0Var.D = false;
                    }
                    if (!gc0Var.o(editable.toString())) {
                        gc0Var.r(true);
                        this.f29357b = true;
                        if (iVar.getSelectionEnd() < iVar.getText().length()) {
                            z9 = false;
                        }
                        if (!gc0Var.D) {
                            String str = gc0Var.K;
                            iVar.setText(str.substring(0, Utilities.j(this.f29358c, str.length(), 0)));
                            if (z9) {
                                iVar.setSelection(iVar.getText().length());
                            }
                        }
                        this.f29357b = false;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        switch (this.f29356a) {
            case 0:
                k3 k3Var = (k3) this.d;
                if (!k3Var.f29415c) {
                    k3Var.f29419r = false;
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                if (!this.f29357b) {
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
                    this.f29358c = i12;
                    return;
                }
                return;
            default:
                if (!this.f29357b && charSequence != null && ((gc0) this.d).K != null) {
                    this.f29358c = gc0.s(charSequence.toString()).length();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12;
        switch (this.f29356a) {
            case 0:
            case 1:
                return;
            case 2:
                if (!this.f29357b) {
                    boolean z9 = charSequence instanceof Spannable;
                    if (z9) {
                        i12 = ((SuggestionSpan[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), SuggestionSpan.class)).length;
                    } else {
                        i12 = 0;
                    }
                    HashMap hashMap = (HashMap) this.d;
                    if (hashMap != null) {
                        if ((i12 > 0 || this.f29358c > 0) && i7 == 0 && i10 == i11) {
                            this.f29357b = true;
                            if (z9) {
                                Spannable spannable = (Spannable) charSequence;
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (spannable.getSpanStart(entry.getKey()) == -1) {
                                        spannable.setSpan(entry.getKey(), ((Integer) ((Pair) entry.getValue()).first).intValue(), ((Integer) ((Pair) entry.getValue()).second).intValue(), 33);
                                    }
                                }
                            }
                            this.f29357b = false;
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
        this.f29358c = i7;
        this.f29357b = z9;
    }

    public j3(int i7, org.telegram.ui.Components.u4 u4Var) {
        this.f29358c = i7;
        this.d = u4Var;
    }

    public j3(gc0 gc0Var) {
        this.d = gc0Var;
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
