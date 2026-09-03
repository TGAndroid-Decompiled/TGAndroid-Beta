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
public final class g3 implements TextWatcher {
    public final int f21051a = 1;
    public boolean f21052b;
    public int f21053c;
    public Object d;

    public g3() {
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f21051a) {
            case 0:
                int i10 = this.f21053c;
                h3 h3Var = (h3) this.d;
                f3 f3Var = h3Var.f21132b;
                if (!h3Var.f21131a) {
                    if (i10 > 0 && editable != null && editable.length() > i10) {
                        h3Var.f21131a = true;
                        f3Var.setText(editable.subSequence(0, i10));
                        f3Var.setSelection(f3Var.length());
                        h3Var.f21131a = false;
                    }
                    h3Var.b(editable);
                }
                if (this.f21052b) {
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
                kg.f fVar = re0Var.f37811c;
                if (!this.f21052b) {
                    boolean z4 = true;
                    re0Var.q(true);
                    AndroidUtilities.cancelRunOnUIThread(re0Var.S);
                    re0Var.o(false);
                    if (TextUtils.isEmpty(editable)) {
                        re0Var.f37818y = false;
                    }
                    if (!re0Var.p(editable.toString())) {
                        re0Var.s(true);
                        this.f21052b = true;
                        if (fVar.getSelectionEnd() < fVar.getText().length()) {
                            z4 = false;
                        }
                        if (!re0Var.f37818y) {
                            String str = re0Var.H;
                            fVar.setText(str.substring(0, Utilities.clamp(this.f21053c, str.length(), 0)));
                            if (z4) {
                                fVar.setSelection(fVar.getText().length());
                            }
                        }
                        this.f21052b = false;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f21051a) {
            case 0:
                h3 h3Var = (h3) this.d;
                if (!h3Var.f21131a) {
                    h3Var.h = false;
                    return;
                }
                return;
            case 1:
                if (!this.f21052b) {
                    HashMap hashMap = new HashMap();
                    boolean z4 = charSequence instanceof Spannable;
                    int i13 = 0;
                    if (z4) {
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
                    if (z4) {
                        i13 = ((SuggestionSpan[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), SuggestionSpan.class)).length;
                    }
                    this.f21053c = i13;
                    return;
                }
                return;
            default:
                if (!this.f21052b && charSequence != null && ((re0) this.d).H != null) {
                    this.f21053c = re0.t(charSequence.toString()).length();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13;
        switch (this.f21051a) {
            case 0:
                return;
            case 1:
                if (!this.f21052b) {
                    boolean z4 = charSequence instanceof Spannable;
                    if (z4) {
                        i13 = ((SuggestionSpan[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), SuggestionSpan.class)).length;
                    } else {
                        i13 = 0;
                    }
                    HashMap hashMap = (HashMap) this.d;
                    if (hashMap != null) {
                        if ((i13 > 0 || this.f21053c > 0) && i10 == 0 && i11 == i12) {
                            this.f21052b = true;
                            if (z4) {
                                Spannable spannable = (Spannable) charSequence;
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (spannable.getSpanStart(entry.getKey()) == -1) {
                                        spannable.setSpan(entry.getKey(), ((Integer) ((Pair) entry.getValue()).first).intValue(), ((Integer) ((Pair) entry.getValue()).second).intValue(), 33);
                                    }
                                }
                            }
                            this.f21052b = false;
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

    public g3(h3 h3Var, int i10, boolean z4) {
        this.d = h3Var;
        this.f21053c = i10;
        this.f21052b = z4;
    }

    public g3(re0 re0Var) {
        this.d = re0Var;
    }

    private final void a(Editable editable) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
