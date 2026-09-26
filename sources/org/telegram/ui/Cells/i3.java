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
import org.telegram.ui.re0;
public final class i3 implements TextWatcher {
    public final int f20420a = 1;
    public boolean f20421b;
    public int f20422c;
    public Object d;

    public i3() {
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f20420a) {
            case 0:
                int i10 = this.f20422c;
                j3 j3Var = (j3) this.d;
                h3 h3Var = j3Var.f20491b;
                if (!j3Var.f20490a) {
                    if (i10 > 0 && editable != null && editable.length() > i10) {
                        j3Var.f20490a = true;
                        h3Var.setText(editable.subSequence(0, i10));
                        h3Var.setSelection(h3Var.length());
                        j3Var.f20490a = false;
                    }
                    j3Var.b(editable);
                }
                if (this.f20421b) {
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
                re0 re0Var = (re0) this.d;
                ci.h2 h2Var = re0Var.f37313c;
                if (!this.f20421b) {
                    boolean z10 = true;
                    re0Var.q(true);
                    AndroidUtilities.cancelRunOnUIThread(re0Var.V);
                    re0Var.o(false);
                    if (TextUtils.isEmpty(editable)) {
                        re0Var.f37320y = false;
                    }
                    if (!re0Var.p(editable.toString())) {
                        re0Var.s(true);
                        this.f20421b = true;
                        if (h2Var.getSelectionEnd() < h2Var.getText().length()) {
                            z10 = false;
                        }
                        if (!re0Var.f37320y) {
                            String str = re0Var.K;
                            h2Var.setText(str.substring(0, Utilities.clamp(this.f20422c, str.length(), 0)));
                            if (z10) {
                                h2Var.setSelection(h2Var.getText().length());
                            }
                        }
                        this.f20421b = false;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f20420a) {
            case 0:
                j3 j3Var = (j3) this.d;
                if (!j3Var.f20490a) {
                    j3Var.h = false;
                    return;
                }
                return;
            case 1:
                if (!this.f20421b) {
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
                    this.f20422c = i13;
                    return;
                }
                return;
            default:
                if (!this.f20421b && charSequence != null && ((re0) this.d).K != null) {
                    this.f20422c = re0.u(charSequence.toString()).length();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13;
        switch (this.f20420a) {
            case 0:
                return;
            case 1:
                if (!this.f20421b) {
                    boolean z10 = charSequence instanceof Spannable;
                    if (z10) {
                        i13 = ((SuggestionSpan[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), SuggestionSpan.class)).length;
                    } else {
                        i13 = 0;
                    }
                    HashMap hashMap = (HashMap) this.d;
                    if (hashMap != null) {
                        if ((i13 > 0 || this.f20422c > 0) && i10 == 0 && i11 == i12) {
                            this.f20421b = true;
                            if (z10) {
                                Spannable spannable = (Spannable) charSequence;
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (spannable.getSpanStart(entry.getKey()) == -1) {
                                        spannable.setSpan(entry.getKey(), ((Integer) ((Pair) entry.getValue()).first).intValue(), ((Integer) ((Pair) entry.getValue()).second).intValue(), 33);
                                    }
                                }
                            }
                            this.f20421b = false;
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
        this.f20422c = i10;
        this.f20421b = z10;
    }

    public i3(re0 re0Var) {
        this.d = re0Var;
    }

    private final void a(Editable editable) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
