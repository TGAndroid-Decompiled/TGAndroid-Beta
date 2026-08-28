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
public final class wx0 {
    public final org.telegram.ui.ActionBar.b6 f34377a;
    public StaticLayout f34378b;
    public final ArrayList f34379c = new ArrayList(2);
    public int d;
    public int f34380e;
    public int f34381f;
    public int f34382g;
    public int h;

    public wx0(org.telegram.ui.ActionBar.b6 b6Var) {
        this.f34377a = b6Var;
    }

    public static void c(StringBuilder sb2, int i9, boolean z10) {
        if (sb2.length() > 0) {
            if (z10) {
                sb2.append(' ');
                sb2.append(LocaleController.getString(R.string.SuggestionOfferInfoTitleEditedAnd));
                sb2.append(' ');
            } else {
                sb2.append(", ");
            }
        }
        sb2.append(LocaleController.getString(i9));
    }

    public final int a() {
        return this.f34382g;
    }

    public final void b(MessageObject messageObject) {
        TLRPC.SuggestedPost suggestedPost;
        int i9;
        int i10;
        int i11;
        int i12;
        float f10;
        int i13;
        char c10;
        boolean z10;
        boolean z11;
        boolean z12;
        int i14;
        TLRPC.Message message;
        Paint paint = null;
        if (messageObject != null && (message = messageObject.messageOwner) != null) {
            suggestedPost = message.suggested_post;
        } else {
            suggestedPost = null;
        }
        if (suggestedPost == null) {
            return;
        }
        MessageSuggestionParams of2 = MessageSuggestionParams.of(suggestedPost);
        org.telegram.ui.ActionBar.b6 b6Var = this.f34377a;
        if (b6Var != null) {
            paint = b6Var.O("paintChatActionText3");
        }
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.f6.S0("paintChatActionText3");
        }
        TextPaint textPaint = (TextPaint) paint;
        this.f34382g = AndroidUtilities.dp(14.0f) * 2;
        ArrayList arrayList = this.f34379c;
        arrayList.clear();
        gf.a aVar = of2.amount;
        if (aVar != null && !aVar.k()) {
            arrayList.add(new vx0(new nz0(LocaleController.getString(R.string.SuggestionOfferInfoPrice), textPaint), new nz0(LocaleController.bold(of2.amount.f()), textPaint)));
        }
        if (suggestedPost.schedule_date > 0) {
            arrayList.add(new vx0(new nz0(LocaleController.getString(R.string.SuggestionOfferInfoTime), textPaint), new nz0(LocaleController.bold(LocaleController.formatDateTime(suggestedPost.schedule_date, true)), textPaint)));
        }
        int size = arrayList.size();
        float f11 = 0.0f;
        boolean z13 = false;
        float f12 = 0.0f;
        int i15 = 0;
        while (i15 < size) {
            Object obj = arrayList.get(i15);
            i15++;
            vx0 vx0Var = (vx0) obj;
            f11 = Math.max(f11, vx0Var.f34021a.l());
            f12 = Math.max(f12, vx0Var.f34022b.l());
            int j10 = ((int) vx0Var.f34021a.j()) + this.f34382g;
            this.f34382g = j10;
            this.f34382g = AndroidUtilities.dp(7.0f) + j10;
        }
        int dp = (int) (f12 + f11 + AndroidUtilities.dp(11.0f));
        int max = Math.max(dp, AndroidUtilities.dp(160.0f));
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
            int i16 = editedSuggestionFlags & 4;
            if (i16 != 0) {
                i9 = 1;
            } else {
                i9 = 0;
            }
            int i17 = editedSuggestionFlags & 2;
            if (i17 != 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            int i18 = i9 + i10;
            int i19 = editedSuggestionFlags & 8;
            if (i19 != 0) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            int i20 = i18 + i11;
            int i21 = editedSuggestionFlags & 1;
            if (i21 != 0) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            int i22 = i20 + i12;
            if (i21 != 0) {
                int i23 = R.string.SuggestionOfferInfoTitleEditedPrice;
                if (i22 == 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                f10 = 11.0f;
                c(sb2, i23, z12);
                i13 = 1;
            } else {
                f10 = 11.0f;
                i13 = 0;
            }
            if (i17 != 0) {
                int i24 = R.string.SuggestionOfferInfoTitleEditedTime;
                i13++;
                if (i22 == i13) {
                    z13 = true;
                }
                c10 = 0;
                c(sb2, i24, z13);
            } else {
                c10 = 0;
            }
            if (i16 != 0) {
                int i25 = R.string.SuggestionOfferInfoTitleEditedText;
                i13++;
                if (i22 == i13) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                c(sb2, i25, z11);
            }
            if (i19 != 0) {
                int i26 = R.string.SuggestionOfferInfoTitleEditedMedia;
                if (i22 == i13 + 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                c(sb2, i26, z10);
            }
            if (messageObject.isOutOwner()) {
                int i27 = R.string.SuggestionOfferInfoTitleEditedFromYou;
                Object[] objArr = new Object[1];
                objArr[c10] = sb2;
                spannableStringBuilder.append((CharSequence) LocaleController.formatString(i27, objArr));
            } else {
                int i28 = R.string.SuggestionOfferInfoTitleEditedFromX;
                Object[] objArr2 = new Object[2];
                objArr2[c10] = name;
                objArr2[1] = sb2;
                spannableStringBuilder.append((CharSequence) LocaleController.formatString(i28, objArr2));
            }
        }
        this.f34378b = new StaticLayout(AndroidUtilities.replaceTags(spannableStringBuilder), textPaint, max, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        int i29 = 0;
        for (int i30 = 0; i30 < this.f34378b.getLineCount(); i30++) {
            i29 = (int) Math.max(i29, this.f34378b.getLineWidth(i30));
        }
        int height = this.f34378b.getHeight() + this.f34382g;
        this.f34382g = height;
        this.f34382g = AndroidUtilities.dp(5.0f) + height;
        int D = org.telegram.messenger.l0.D(24.0f, 2, Math.max(dp, i29));
        this.h = D;
        this.d = (D - max) / 2;
        this.f34380e = (D - dp) / 2;
        this.f34381f = (int) (AndroidUtilities.dp(f10) + i14 + f11);
    }
}
