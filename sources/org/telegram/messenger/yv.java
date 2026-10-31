package org.telegram.messenger;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
public final class yv {
    public final TL_iv.RichText f19436a;
    public final IdentityHashMap f19437b;
    public final int f19438c;
    public final int d;

    public yv(TL_iv.RichText richText, IdentityHashMap identityHashMap, int i10, int i11) {
        this.f19436a = richText;
        this.f19437b = identityHashMap;
        this.f19438c = i10;
        this.d = i11;
    }

    public static yv a(vv vvVar, e2.j0 j0Var) {
        IdentityHashMap identityHashMap = new IdentityHashMap();
        nu nuVar = (nu) j0Var.f6154c;
        SpannableStringBuilder o10 = vvVar.o(nuVar.f17175a, nuVar.f17176b, identityHashMap);
        Spanned spanned = (Spanned) j0Var.d;
        int spanEnd = spanned.getSpanEnd(nuVar);
        int i10 = j0Var.f6153b;
        int i11 = spanEnd - i10;
        if (o10.length() == i11 && TextUtils.regionMatches(o10, 0, spanned, i10, i11)) {
            return new yv(nuVar.f17175a, identityHashMap, o10.length(), nuVar.f17176b);
        }
        f8.d("RichQuote: laid out text doesn't match the formatted one");
        return null;
    }

    public final TL_iv.RichText b(int i10, int i11) {
        int max = Math.max(0, i10);
        int i12 = this.f19438c;
        int min = Math.min(i12, i11);
        if (max >= min) {
            return null;
        }
        TL_iv.RichText richText = this.f19436a;
        if (max == 0 && min == i12) {
            return richText;
        }
        return c(richText, max, min);
    }

    public final TL_iv.RichText c(TL_iv.RichText richText, int i10, int i11) {
        int[] iArr;
        int i12;
        int i13;
        if (richText != null && (iArr = (int[]) this.f19437b.get(richText)) != null && (i12 = iArr[0]) != (i13 = iArr[1]) && i13 > i10 && i12 < i11) {
            if (i10 > i12 || i13 > i11) {
                if (richText instanceof TL_iv.textPlain) {
                    String str = ((TL_iv.textPlain) richText).text;
                    if (str != null && str.length() == i13 - i12) {
                        int max = Math.max(i10, i12) - i12;
                        int min = Math.min(i11, i13) - i12;
                        if (max > 0 && max < str.length() && Character.isLowSurrogate(str.charAt(max))) {
                            max--;
                        }
                        if (min > 0 && min < str.length() && Character.isLowSurrogate(str.charAt(min))) {
                            min++;
                        }
                        TL_iv.textPlain textplain = new TL_iv.textPlain();
                        textplain.text = str.substring(max, min);
                        return textplain;
                    }
                } else if (richText instanceof TL_iv.textConcat) {
                    ArrayList<TL_iv.RichText> arrayList = new ArrayList<>();
                    ArrayList<TL_iv.RichText> arrayList2 = richText.texts;
                    int size = arrayList2.size();
                    int i14 = 0;
                    while (i14 < size) {
                        TL_iv.RichText richText2 = arrayList2.get(i14);
                        i14++;
                        TL_iv.RichText c10 = c(richText2, i10, i11);
                        if (c10 != null) {
                            arrayList.add(c10);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        if (arrayList.size() == 1) {
                            return arrayList.get(0);
                        }
                        TL_iv.textConcat textconcat = new TL_iv.textConcat();
                        textconcat.texts = arrayList;
                        return textconcat;
                    }
                } else {
                    if (!(richText instanceof TL_iv.textMath) && !(richText instanceof TL_iv.textCustomEmoji) && !(richText instanceof TL_iv.textDate) && !(richText instanceof TL_iv.textDiff) && !(richText instanceof TL_iv.textButton)) {
                        TL_iv.RichText richText3 = richText.text;
                        if (richText3 != null) {
                            TL_iv.RichText c11 = c(richText3, i10, i11);
                            if (c11 != null) {
                                try {
                                    richText = (TL_iv.RichText) TLObject.deepCopy(richText, new e9(23));
                                } catch (Exception e) {
                                    f8.g(e, true);
                                    richText = null;
                                }
                                if (richText != null) {
                                    richText.text = c11;
                                }
                            }
                        }
                    }
                    return richText;
                }
            }
            return richText;
        }
        return null;
    }
}
