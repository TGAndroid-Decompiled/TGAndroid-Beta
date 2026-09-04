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
public final class oy0 {
    public final org.telegram.ui.ActionBar.f6 f29236a;
    public StaticLayout f29237b;
    public final ArrayList f29238c = new ArrayList(2);
    public int d;
    public int f29239e;
    public int f29240f;
    public int f29241g;
    public int h;

    public oy0(org.telegram.ui.ActionBar.f6 f6Var) {
        this.f29236a = f6Var;
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
        return this.f29241g;
    }

    public final void b(MessageObject messageObject) {
        TLRPC.SuggestedPost suggestedPost;
        int i10;
        int i11;
        int i12;
        int i13;
        float f7;
        int i14;
        char c10;
        boolean z10;
        boolean z11;
        boolean z12;
        int i15;
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
        org.telegram.ui.ActionBar.f6 f6Var = this.f29236a;
        if (f6Var != null) {
            paint = f6Var.G("paintChatActionText3");
        }
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.j6.S0("paintChatActionText3");
        }
        TextPaint textPaint = (TextPaint) paint;
        this.f29241g = AndroidUtilities.dp(14.0f) * 2;
        ArrayList arrayList = this.f29238c;
        arrayList.clear();
        zf.a aVar = of2.amount;
        if (aVar != null && !aVar.k()) {
            arrayList.add(new ny0(new f01(LocaleController.getString(R.string.SuggestionOfferInfoPrice), textPaint), new f01(LocaleController.bold(of2.amount.f()), textPaint)));
        }
        if (suggestedPost.schedule_date > 0) {
            arrayList.add(new ny0(new f01(LocaleController.getString(R.string.SuggestionOfferInfoTime), textPaint), new f01(LocaleController.bold(LocaleController.formatDateTime(suggestedPost.schedule_date, true)), textPaint)));
        }
        int size = arrayList.size();
        float f10 = 0.0f;
        boolean z13 = false;
        float f11 = 0.0f;
        int i16 = 0;
        while (i16 < size) {
            Object obj = arrayList.get(i16);
            i16++;
            ny0 ny0Var = (ny0) obj;
            f10 = Math.max(f10, ny0Var.f28892a.l());
            f11 = Math.max(f11, ny0Var.f28893b.l());
            int j3 = ((int) ny0Var.f28892a.j()) + this.f29241g;
            this.f29241g = j3;
            this.f29241g = AndroidUtilities.dp(7.0f) + j3;
        }
        int dp = (int) (f11 + f10 + AndroidUtilities.dp(11.0f));
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
            f7 = 11.0f;
        } else {
            MessageObject messageObject2 = messageObject.replyMessageObject;
            if (messageObject2 != null) {
                DialogObject.getName(messageObject2.getFromChatId());
            }
            StringBuilder sb2 = new StringBuilder();
            int i17 = editedSuggestionFlags & 4;
            if (i17 != 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            int i18 = editedSuggestionFlags & 2;
            if (i18 != 0) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            int i19 = i10 + i11;
            int i20 = editedSuggestionFlags & 8;
            if (i20 != 0) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            int i21 = i19 + i12;
            int i22 = editedSuggestionFlags & 1;
            if (i22 != 0) {
                i13 = 1;
            } else {
                i13 = 0;
            }
            int i23 = i21 + i13;
            if (i22 != 0) {
                int i24 = R.string.SuggestionOfferInfoTitleEditedPrice;
                if (i23 == 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                f7 = 11.0f;
                c(sb2, i24, z12);
                i14 = 1;
            } else {
                f7 = 11.0f;
                i14 = 0;
            }
            if (i18 != 0) {
                int i25 = R.string.SuggestionOfferInfoTitleEditedTime;
                i14++;
                if (i23 == i14) {
                    z13 = true;
                }
                c10 = 0;
                c(sb2, i25, z13);
            } else {
                c10 = 0;
            }
            if (i17 != 0) {
                int i26 = R.string.SuggestionOfferInfoTitleEditedText;
                i14++;
                if (i23 == i14) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                c(sb2, i26, z11);
            }
            if (i20 != 0) {
                int i27 = R.string.SuggestionOfferInfoTitleEditedMedia;
                if (i23 == i14 + 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                c(sb2, i27, z10);
            }
            if (messageObject.isOutOwner()) {
                int i28 = R.string.SuggestionOfferInfoTitleEditedFromYou;
                Object[] objArr = new Object[1];
                objArr[c10] = sb2;
                spannableStringBuilder.append((CharSequence) LocaleController.formatString(i28, objArr));
            } else {
                int i29 = R.string.SuggestionOfferInfoTitleEditedFromX;
                Object[] objArr2 = new Object[2];
                objArr2[c10] = name;
                objArr2[1] = sb2;
                spannableStringBuilder.append((CharSequence) LocaleController.formatString(i29, objArr2));
            }
        }
        this.f29237b = new StaticLayout(AndroidUtilities.replaceTags(spannableStringBuilder), textPaint, max, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        int i30 = 0;
        for (int i31 = 0; i31 < this.f29237b.getLineCount(); i31++) {
            i30 = (int) Math.max(i30, this.f29237b.getLineWidth(i31));
        }
        int height = this.f29237b.getHeight() + this.f29241g;
        this.f29241g = height;
        this.f29241g = AndroidUtilities.dp(5.0f) + height;
        int D = org.telegram.messenger.w1.D(24.0f, 2, Math.max(dp, i30));
        this.h = D;
        this.d = (D - max) / 2;
        this.f29239e = (D - dp) / 2;
        this.f29240f = (int) (AndroidUtilities.dp(f7) + i15 + f10);
    }
}
