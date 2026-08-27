package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class l60 extends yk0 {

    public ArrayList f30302c = new ArrayList();
    public ArrayList d = new ArrayList();

    public final pf.j1 f30303e;

    public int f30304f;
    public Runnable h;

    public final p60 f30305n;

    public l60(p60 p60Var) {
        this.f30305n = p60Var;
        pf.j1 j1Var = new pf.j1(false);
        this.f30303e = j1Var;
        j1Var.f45836a = new vu(this, 7);
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return o1Var.f5793f == 1;
    }

    @Override
    public final int h() {
        int size = this.f30302c.size();
        pf.j1 j1Var = this.f30303e;
        int size2 = j1Var.d.size();
        int size3 = j1Var.f45839e.size();
        int i10 = size + size2;
        if (size3 != 0) {
            i10 += size3 + 1;
        }
        int i11 = i10 + 2;
        this.f30304f = i11;
        return i11;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 2;
        }
        if (i10 == this.f30304f - 1) {
            return 4;
        }
        return i10 + (-1) == this.f30303e.d.size() + this.f30302c.size() ? 0 : 1;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        TLObject tLObject;
        CharSequence charSequence;
        long j10;
        long j11;
        int i11 = o1Var.f5793f;
        View view = o1Var.f5789a;
        if (i11 == 0) {
            ((org.telegram.ui.Cells.c4) view).setText(LocaleController.getString(R.string.GlobalSearch));
            return;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            }
            view.requestLayout();
            return;
        }
        org.telegram.ui.Cells.d4 d4Var = (org.telegram.ui.Cells.d4) view;
        int size = this.f30302c.size();
        pf.j1 j1Var = this.f30303e;
        ArrayList arrayList = j1Var.f45839e;
        ArrayList arrayList2 = j1Var.d;
        int size2 = arrayList.size();
        int size3 = arrayList2.size();
        int i12 = i10 - 1;
        CharSequence charSequence2 = null;
        if (i12 >= 0 && i12 < size) {
            tLObject = (TLObject) this.f30302c.get(i12);
        } else if (i12 < size || i12 >= size3 + size) {
            tLObject = (i12 <= size + size3 || i12 > (size2 + size) + size3) ? null : (TLObject) j1Var.f45839e.get(((i12 - size) - size3) - 1);
        } else {
            tLObject = (TLObject) arrayList2.get(i12 - size);
        }
        if (tLObject == null) {
            charSequence = null;
        } else {
            String publicUsername = tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).username : ChatObject.getPublicUsername((TLRPC.Chat) tLObject);
            if (i12 < size) {
                charSequence = (CharSequence) this.d.get(i12);
                if (charSequence == null || TextUtils.isEmpty(publicUsername)) {
                    charSequence2 = charSequence;
                    charSequence = null;
                } else {
                    if (!charSequence.toString().startsWith("@" + publicUsername)) {
                        charSequence2 = charSequence;
                        charSequence = null;
                    }
                }
            } else if (i12 <= size || TextUtils.isEmpty(publicUsername)) {
                charSequence = null;
            } else {
                String strSubstring = j1Var.f45838c;
                if (strSubstring.startsWith("@")) {
                    strSubstring = strSubstring.substring(1);
                }
                try {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) "@");
                    spannableStringBuilder.append((CharSequence) publicUsername);
                    int iIndexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(publicUsername, strSubstring);
                    if (iIndexOfIgnoreCase != -1) {
                        int length = strSubstring.length();
                        if (iIndexOfIgnoreCase == 0) {
                            length++;
                        } else {
                            iIndexOfIgnoreCase++;
                        }
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q6, false)), iIndexOfIgnoreCase, length + iIndexOfIgnoreCase, 33);
                    }
                    charSequence = spannableStringBuilder;
                } catch (Exception unused) {
                    charSequence = publicUsername;
                }
            }
        }
        Object object = d4Var.getObject();
        if (object instanceof TLRPC.User) {
            j10 = ((TLRPC.User) object).f22527id;
        } else {
            j10 = object instanceof TLRPC.Chat ? -((TLRPC.Chat) object).f22380id : 0L;
        }
        d4Var.d(tLObject, charSequence2, charSequence);
        if (tLObject instanceof TLRPC.User) {
            j11 = ((TLRPC.User) tLObject).f22527id;
        } else {
            j11 = tLObject instanceof TLRPC.Chat ? -((TLRPC.Chat) tLObject).f22380id : 0L;
        }
        if (j11 != 0) {
            p60 p60Var = this.f30305n;
            a0.h hVar = p60Var.P;
            if (hVar == null || hVar.h(j11) < 0) {
                d4Var.c(p60Var.f31515b0.h(j11) >= 0, j10 == j11);
                d4Var.setCheckBoxEnabled(true);
            } else {
                d4Var.c(true, j10 == j11);
                d4Var.setCheckBoxEnabled(false);
            }
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View d4Var;
        Context context = viewGroup.getContext();
        if (i10 == 1) {
            d4Var = new org.telegram.ui.Cells.d4(context, 1, 0, false);
        } else if (i10 == 2) {
            d4Var = new ag.s0(this, context, 18);
        } else if (i10 != 4) {
            org.telegram.ui.Cells.c4 c4Var = new org.telegram.ui.Cells.c4(context);
            c4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23073e7, false));
            Drawable drawable = c4Var.getResources().getDrawable(R.drawable.shadowdown);
            c4Var.f24154a = drawable;
            drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Zh, false), PorterDuff.Mode.MULTIPLY));
            TextView textView = new TextView(c4Var.getContext());
            c4Var.f24155b = textView;
            org.telegram.ui.Cells.pa.m(14.0f, 1, textView);
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.ai, false));
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            c4Var.addView(textView, h7.z5.d(-1, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
            d4Var = c4Var;
        } else {
            d4Var = new View(context);
        }
        return new lk0(d4Var);
    }
}
