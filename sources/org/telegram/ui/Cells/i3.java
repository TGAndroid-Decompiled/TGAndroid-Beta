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
public final class i3 implements TextWatcher {
    public final int f24500a = 1;
    public boolean f24501b;
    public int f24502c;
    public Object d;

    public i3() {
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f24500a) {
            case 0:
                int i9 = this.f24502c;
                j3 j3Var = (j3) this.d;
                h3 h3Var = j3Var.f24544b;
                if (!j3Var.f24543a) {
                    if (i9 > 0 && editable != null && editable.length() > i9) {
                        j3Var.f24543a = true;
                        h3Var.setText(editable.subSequence(0, i9));
                        h3Var.setSelection(h3Var.length());
                        j3Var.f24543a = false;
                    }
                    j3Var.b(editable);
                }
                if (this.f24501b) {
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
                fg.g gVar = ge0Var.f38520c;
                if (!this.f24501b) {
                    boolean z10 = true;
                    ge0Var.q(true);
                    AndroidUtilities.cancelRunOnUIThread(ge0Var.R);
                    ge0Var.o(false);
                    if (TextUtils.isEmpty(editable)) {
                        ge0Var.f38528y = false;
                    }
                    if (!ge0Var.p(editable.toString())) {
                        ge0Var.s(true);
                        this.f24501b = true;
                        if (gVar.getSelectionEnd() < gVar.getText().length()) {
                            z10 = false;
                        }
                        if (!ge0Var.f38528y) {
                            String str = ge0Var.G;
                            gVar.setText(str.substring(0, Utilities.clamp(this.f24502c, str.length(), 0)));
                            if (z10) {
                                gVar.setSelection(gVar.getText().length());
                            }
                        }
                        this.f24501b = false;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        switch (this.f24500a) {
            case 0:
                j3 j3Var = (j3) this.d;
                if (!j3Var.f24543a) {
                    j3Var.h = false;
                    return;
                }
                return;
            case 1:
                if (!this.f24501b) {
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
                    this.f24502c = i12;
                    return;
                }
                return;
            default:
                if (!this.f24501b && charSequence != null && ((ge0) this.d).G != null) {
                    this.f24502c = ge0.t(charSequence.toString()).length();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        int i12;
        switch (this.f24500a) {
            case 0:
                return;
            case 1:
                if (!this.f24501b) {
                    boolean z10 = charSequence instanceof Spannable;
                    if (z10) {
                        i12 = ((SuggestionSpan[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), SuggestionSpan.class)).length;
                    } else {
                        i12 = 0;
                    }
                    HashMap hashMap = (HashMap) this.d;
                    if (hashMap != null) {
                        if ((i12 > 0 || this.f24502c > 0) && i9 == 0 && i10 == i11) {
                            this.f24501b = true;
                            if (z10) {
                                Spannable spannable = (Spannable) charSequence;
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (spannable.getSpanStart(entry.getKey()) == -1) {
                                        spannable.setSpan(entry.getKey(), ((Integer) ((Pair) entry.getValue()).first).intValue(), ((Integer) ((Pair) entry.getValue()).second).intValue(), 33);
                                    }
                                }
                            }
                            this.f24501b = false;
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

    public i3(j3 j3Var, int i9, boolean z10) {
        this.d = j3Var;
        this.f24502c = i9;
        this.f24501b = z10;
    }

    public i3(ge0 ge0Var) {
        this.d = ge0Var;
    }

    private final void a(Editable editable) {
    }

    private final void b(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i9, int i10, int i11, CharSequence charSequence) {
    }
}
