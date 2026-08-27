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
import org.telegram.ui.je0;

public final class f3 implements TextWatcher {

    public final int f24329a = 1;

    public boolean f24330b;

    public int f24331c;
    public Object d;

    public f3() {
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f24329a) {
            case 0:
                int i10 = this.f24331c;
                g3 g3Var = (g3) this.d;
                e3 e3Var = g3Var.f24370b;
                if (!g3Var.f24369a) {
                    if (i10 > 0 && editable != null && editable.length() > i10) {
                        g3Var.f24369a = true;
                        e3Var.setText(editable.subSequence(0, i10));
                        e3Var.setSelection(e3Var.length());
                        g3Var.f24369a = false;
                    }
                    g3Var.b(editable);
                }
                if (!this.f24330b) {
                    while (true) {
                        int iIndexOf = editable.toString().indexOf("\n");
                        if (iIndexOf >= 0) {
                            editable.delete(iIndexOf, iIndexOf + 1);
                        }
                    }
                }
                break;
            case 1:
                break;
            default:
                je0 je0Var = (je0) this.d;
                gg.g gVar = je0Var.f39352c;
                if (!this.f24330b) {
                    je0Var.q(true);
                    AndroidUtilities.cancelRunOnUIThread(je0Var.R);
                    je0Var.o(false);
                    if (TextUtils.isEmpty(editable)) {
                        je0Var.f39360y = false;
                    }
                    if (!je0Var.p(editable.toString())) {
                        je0Var.s(true);
                        this.f24330b = true;
                        boolean z10 = gVar.getSelectionEnd() >= gVar.getText().length();
                        if (!je0Var.f39360y) {
                            String str = je0Var.G;
                            gVar.setText(str.substring(0, Utilities.clamp(this.f24331c, str.length(), 0)));
                            if (z10) {
                                gVar.setSelection(gVar.getText().length());
                            }
                        }
                        this.f24330b = false;
                    }
                    break;
                }
                break;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f24329a) {
            case 0:
                g3 g3Var = (g3) this.d;
                if (!g3Var.f24369a) {
                    g3Var.h = false;
                }
                break;
            case 1:
                if (!this.f24330b) {
                    HashMap map = new HashMap();
                    boolean z10 = charSequence instanceof Spannable;
                    if (z10) {
                        Spannable spannable = (Spannable) charSequence;
                        CharacterStyle[] characterStyleArr = (CharacterStyle[]) spannable.getSpans(0, spannable.length(), CharacterStyle.class);
                        ParagraphStyle[] paragraphStyleArr = (ParagraphStyle[]) spannable.getSpans(0, spannable.length(), ParagraphStyle.class);
                        if (characterStyleArr != null && characterStyleArr.length > 0) {
                            for (CharacterStyle characterStyle : characterStyleArr) {
                                if (characterStyle != null && !(characterStyle instanceof SuggestionSpan)) {
                                    map.put(characterStyle, new Pair(Integer.valueOf(spannable.getSpanStart(characterStyle)), Integer.valueOf(spannable.getSpanEnd(characterStyle))));
                                }
                            }
                        }
                        if (paragraphStyleArr != null && paragraphStyleArr.length > 0) {
                            for (ParagraphStyle paragraphStyle : paragraphStyleArr) {
                                if (paragraphStyle != null && !(paragraphStyle instanceof SuggestionSpan)) {
                                    map.put(paragraphStyle, new Pair(Integer.valueOf(spannable.getSpanStart(paragraphStyle)), Integer.valueOf(spannable.getSpanEnd(paragraphStyle))));
                                }
                            }
                        }
                    }
                    this.d = map;
                    this.f24331c = z10 ? ((SuggestionSpan[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), SuggestionSpan.class)).length : 0;
                    break;
                }
                break;
            default:
                if (!this.f24330b && charSequence != null && ((je0) this.d).G != null) {
                    this.f24331c = je0.t(charSequence.toString()).length();
                }
                break;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f24329a) {
            case 1:
                if (!this.f24330b) {
                    boolean z10 = charSequence instanceof Spannable;
                    int length = z10 ? ((SuggestionSpan[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), SuggestionSpan.class)).length : 0;
                    HashMap map = (HashMap) this.d;
                    if (map != null) {
                        if ((length > 0 || this.f24331c > 0) && i10 == 0 && i11 == i12) {
                            this.f24330b = true;
                            if (z10) {
                                Spannable spannable = (Spannable) charSequence;
                                for (Map.Entry entry : map.entrySet()) {
                                    if (spannable.getSpanStart(entry.getKey()) == -1) {
                                        spannable.setSpan(entry.getKey(), ((Integer) ((Pair) entry.getValue()).first).intValue(), ((Integer) ((Pair) entry.getValue()).second).intValue(), 33);
                                    }
                                }
                            }
                            this.f24330b = false;
                        }
                    }
                    break;
                }
                break;
        }
    }

    public f3(g3 g3Var, int i10, boolean z10) {
        this.d = g3Var;
        this.f24331c = i10;
        this.f24330b = z10;
    }

    public f3(je0 je0Var) {
        this.d = je0Var;
    }

    private final void a(Editable editable) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
