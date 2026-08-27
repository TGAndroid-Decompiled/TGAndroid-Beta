package org.telegram.ui.Components;

import android.graphics.Paint;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

public final class yx0 {

    public final org.telegram.ui.ActionBar.c6 f34970a;

    public StaticLayout f34971b;

    public final ArrayList f34972c = new ArrayList(2);
    public int d;

    public int f34973e;

    public int f34974f;

    public int f34975g;
    public int h;

    public yx0(org.telegram.ui.ActionBar.c6 c6Var) {
        this.f34970a = c6Var;
    }

    public static void c(StringBuilder sb2, int i10, boolean z10) {
        if (sb2.length() > 0) {
            if (z10) {
                sb2.append(' ');
                sb2.append(LocaleController.getString(R.string.SuggestionOfferInfoTitleEditedAnd));
                sb2.append(' ');
            } else {
                sb2.append(", ");
            }
        }
        sb2.append(LocaleController.getString(i10));
    }

    public final int a() {
        return this.f34975g;
    }

    public final void b(MessageObject messageObject) {
        float f10;
        int i10;
        char c10;
        TLRPC.Message message;
        TLRPC.SuggestedPost suggestedPost = (messageObject == null || (message = messageObject.messageOwner) == null) ? null : message.suggested_post;
        if (suggestedPost == null) {
            return;
        }
        MessageSuggestionParams messageSuggestionParamsOf = MessageSuggestionParams.of(suggestedPost);
        org.telegram.ui.ActionBar.c6 c6Var = this.f34970a;
        Paint paintN = c6Var != null ? c6Var.N("paintChatActionText3") : null;
        if (paintN == null) {
            paintN = org.telegram.ui.ActionBar.g6.S0("paintChatActionText3");
        }
        TextPaint textPaint = (TextPaint) paintN;
        this.f34975g = AndroidUtilities.dp(14.0f) * 2;
        ArrayList arrayList = this.f34972c;
        arrayList.clear();
        hf.a aVar = messageSuggestionParamsOf.amount;
        if (aVar != null && !aVar.k()) {
            arrayList.add(new xx0(new pz0(LocaleController.getString(R.string.SuggestionOfferInfoPrice), textPaint), new pz0(LocaleController.bold(messageSuggestionParamsOf.amount.f()), textPaint)));
        }
        if (suggestedPost.schedule_date > 0) {
            arrayList.add(new xx0(new pz0(LocaleController.getString(R.string.SuggestionOfferInfoTime), textPaint), new pz0(LocaleController.bold(LocaleController.formatDateTime(suggestedPost.schedule_date, true)), textPaint)));
        }
        int size = arrayList.size();
        float fMax = 0.0f;
        float fMax2 = 0.0f;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            xx0 xx0Var = (xx0) obj;
            fMax = Math.max(fMax, xx0Var.f34725a.l());
            fMax2 = Math.max(fMax2, xx0Var.f34726b.l());
            int iJ = ((int) xx0Var.f34725a.j()) + this.f34975g;
            this.f34975g = iJ;
            this.f34975g = AndroidUtilities.dp(7.0f) + iJ;
        }
        int iDp = (int) (fMax2 + fMax + AndroidUtilities.dp(11.0f));
        int iMax = Math.max(iDp, AndroidUtilities.dp(160.0f));
        String name = DialogObject.getName(messageObject.getFromChatId());
        int editedSuggestionFlags = messageObject.getEditedSuggestionFlags();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (editedSuggestionFlags == 0) {
            if (messageObject.isOutOwner()) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.SuggestionOfferInfoTitleYou));
            } else {
                spannableStringBuilder.append((CharSequence) LocaleController.formatString(R.string.SuggestionOfferInfoTitle, name));
            }
            f10 = 11.0f;
        } else {
            MessageObject messageObject2 = messageObject.replyMessageObject;
            if (messageObject2 != null) {
                DialogObject.getName(messageObject2.getFromChatId());
            }
            StringBuilder sb2 = new StringBuilder();
            int i12 = editedSuggestionFlags & 4;
            int i13 = editedSuggestionFlags & 2;
            int i14 = editedSuggestionFlags & 8;
            int i15 = editedSuggestionFlags & 1;
            int i16 = (i12 != 0 ? 1 : 0) + (i13 != 0 ? 1 : 0) + (i14 != 0 ? 1 : 0) + (i15 != 0 ? 1 : 0);
            if (i15 != 0) {
                f10 = 11.0f;
                c(sb2, R.string.SuggestionOfferInfoTitleEditedPrice, i16 == 1);
                i10 = 1;
            } else {
                f10 = 11.0f;
                i10 = 0;
            }
            if (i13 != 0) {
                i10++;
                c10 = 0;
                c(sb2, R.string.SuggestionOfferInfoTitleEditedTime, i16 == i10);
            } else {
                c10 = 0;
            }
            if (i12 != 0) {
                i10++;
                c(sb2, R.string.SuggestionOfferInfoTitleEditedText, i16 == i10);
            }
            if (i14 != 0) {
                c(sb2, R.string.SuggestionOfferInfoTitleEditedMedia, i16 == i10 + 1);
            }
            if (messageObject.isOutOwner()) {
                int i17 = R.string.SuggestionOfferInfoTitleEditedFromYou;
                Object[] objArr = new Object[1];
                objArr[c10] = sb2;
                spannableStringBuilder.append((CharSequence) LocaleController.formatString(i17, objArr));
            } else {
                int i18 = R.string.SuggestionOfferInfoTitleEditedFromX;
                Object[] objArr2 = new Object[2];
                objArr2[c10] = name;
                objArr2[1] = sb2;
                spannableStringBuilder.append((CharSequence) LocaleController.formatString(i18, objArr2));
            }
        }
        this.f34971b = new StaticLayout(AndroidUtilities.replaceTags(spannableStringBuilder), textPaint, iMax, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        int iMax2 = 0;
        for (int i19 = 0; i19 < this.f34971b.getLineCount(); i19++) {
            iMax2 = (int) Math.max(iMax2, this.f34971b.getLineWidth(i19));
        }
        int height = this.f34971b.getHeight() + this.f34975g;
        this.f34975g = height;
        this.f34975g = AndroidUtilities.dp(5.0f) + height;
        int iD = org.telegram.messenger.y1.D(24.0f, 2, Math.max(iDp, iMax2));
        this.h = iD;
        this.d = (iD - iMax) / 2;
        int i20 = (iD - iDp) / 2;
        this.f34973e = i20;
        this.f34974f = (int) (AndroidUtilities.dp(f10) + i20 + fMax);
    }
}
