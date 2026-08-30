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
import org.telegram.ui.pe0;
public final class h3 implements TextWatcher {
    public final int f21126a = 1;
    public boolean f21127b;
    public int f21128c;
    public Object d;

    public h3() {
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f21126a) {
            case 0:
                int i10 = this.f21128c;
                i3 i3Var = (i3) this.d;
                g3 g3Var = i3Var.f21199b;
                if (!i3Var.f21198a) {
                    if (i10 > 0 && editable != null && editable.length() > i10) {
                        i3Var.f21198a = true;
                        g3Var.setText(editable.subSequence(0, i10));
                        g3Var.setSelection(g3Var.length());
                        i3Var.f21198a = false;
                    }
                    i3Var.b(editable);
                }
                if (this.f21127b) {
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
                pe0 pe0Var = (pe0) this.d;
                kg.f fVar = pe0Var.f37288c;
                if (!this.f21127b) {
                    boolean z4 = true;
                    pe0Var.q(true);
                    AndroidUtilities.cancelRunOnUIThread(pe0Var.S);
                    pe0Var.o(false);
                    if (TextUtils.isEmpty(editable)) {
                        pe0Var.f37295y = false;
                    }
                    if (!pe0Var.p(editable.toString())) {
                        pe0Var.s(true);
                        this.f21127b = true;
                        if (fVar.getSelectionEnd() < fVar.getText().length()) {
                            z4 = false;
                        }
                        if (!pe0Var.f37295y) {
                            String str = pe0Var.H;
                            fVar.setText(str.substring(0, Utilities.clamp(this.f21128c, str.length(), 0)));
                            if (z4) {
                                fVar.setSelection(fVar.getText().length());
                            }
                        }
                        this.f21127b = false;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f21126a) {
            case 0:
                i3 i3Var = (i3) this.d;
                if (!i3Var.f21198a) {
                    i3Var.h = false;
                    return;
                }
                return;
            case 1:
                if (!this.f21127b) {
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
                    this.f21128c = i13;
                    return;
                }
                return;
            default:
                if (!this.f21127b && charSequence != null && ((pe0) this.d).H != null) {
                    this.f21128c = pe0.t(charSequence.toString()).length();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13;
        switch (this.f21126a) {
            case 0:
                return;
            case 1:
                if (!this.f21127b) {
                    boolean z4 = charSequence instanceof Spannable;
                    if (z4) {
                        i13 = ((SuggestionSpan[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), SuggestionSpan.class)).length;
                    } else {
                        i13 = 0;
                    }
                    HashMap hashMap = (HashMap) this.d;
                    if (hashMap != null) {
                        if ((i13 > 0 || this.f21128c > 0) && i10 == 0 && i11 == i12) {
                            this.f21127b = true;
                            if (z4) {
                                Spannable spannable = (Spannable) charSequence;
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (spannable.getSpanStart(entry.getKey()) == -1) {
                                        spannable.setSpan(entry.getKey(), ((Integer) ((Pair) entry.getValue()).first).intValue(), ((Integer) ((Pair) entry.getValue()).second).intValue(), 33);
                                    }
                                }
                            }
                            this.f21127b = false;
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

    public h3(i3 i3Var, int i10, boolean z4) {
        this.d = i3Var;
        this.f21128c = i10;
        this.f21127b = z4;
    }

    public h3(pe0 pe0Var) {
        this.d = pe0Var;
    }

    private final void a(Editable editable) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
