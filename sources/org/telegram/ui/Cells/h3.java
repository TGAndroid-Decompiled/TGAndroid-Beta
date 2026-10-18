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
import org.telegram.ui.fe0;
public final class h3 implements TextWatcher {
    public final int f22323a = 1;
    public boolean f22324b;
    public int f22325c;
    public Object d;

    public h3() {
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f22323a) {
            case 0:
                int i10 = this.f22325c;
                i3 i3Var = (i3) this.d;
                g3 g3Var = i3Var.f22398b;
                if (!i3Var.f22397a) {
                    if (i10 > 0 && editable != null && editable.length() > i10) {
                        i3Var.f22397a = true;
                        g3Var.setText(editable.subSequence(0, i10));
                        g3Var.setSelection(g3Var.length());
                        i3Var.f22397a = false;
                    }
                    i3Var.b(editable);
                }
                if (this.f22324b) {
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
                fe0 fe0Var = (fe0) this.d;
                ei.e2 e2Var = fe0Var.f36890c;
                if (!this.f22324b) {
                    boolean z10 = true;
                    fe0Var.q(true);
                    AndroidUtilities.cancelRunOnUIThread(fe0Var.V);
                    fe0Var.o(false);
                    if (TextUtils.isEmpty(editable)) {
                        fe0Var.f36897y = false;
                    }
                    if (!fe0Var.p(editable.toString())) {
                        fe0Var.s(true);
                        this.f22324b = true;
                        if (e2Var.getSelectionEnd() < e2Var.getText().length()) {
                            z10 = false;
                        }
                        if (!fe0Var.f36897y) {
                            String str = fe0Var.K;
                            e2Var.setText(str.substring(0, Utilities.clamp(this.f22325c, str.length(), 0)));
                            if (z10) {
                                e2Var.setSelection(e2Var.getText().length());
                            }
                        }
                        this.f22324b = false;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f22323a) {
            case 0:
                i3 i3Var = (i3) this.d;
                if (!i3Var.f22397a) {
                    i3Var.h = false;
                    return;
                }
                return;
            case 1:
                if (!this.f22324b) {
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
                    this.f22325c = i13;
                    return;
                }
                return;
            default:
                if (!this.f22324b && charSequence != null && ((fe0) this.d).K != null) {
                    this.f22325c = fe0.t(charSequence.toString()).length();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13;
        switch (this.f22323a) {
            case 0:
                return;
            case 1:
                if (!this.f22324b) {
                    boolean z10 = charSequence instanceof Spannable;
                    if (z10) {
                        i13 = ((SuggestionSpan[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), SuggestionSpan.class)).length;
                    } else {
                        i13 = 0;
                    }
                    HashMap hashMap = (HashMap) this.d;
                    if (hashMap != null) {
                        if ((i13 > 0 || this.f22325c > 0) && i10 == 0 && i11 == i12) {
                            this.f22324b = true;
                            if (z10) {
                                Spannable spannable = (Spannable) charSequence;
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (spannable.getSpanStart(entry.getKey()) == -1) {
                                        spannable.setSpan(entry.getKey(), ((Integer) ((Pair) entry.getValue()).first).intValue(), ((Integer) ((Pair) entry.getValue()).second).intValue(), 33);
                                    }
                                }
                            }
                            this.f22324b = false;
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
        this.f22325c = i10;
        this.f22324b = z10;
    }

    public h3(fe0 fe0Var) {
        this.d = fe0Var;
    }

    private final void a(Editable editable) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
