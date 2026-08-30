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
public final class sy0 {
    public final org.telegram.ui.ActionBar.f6 f28833a;
    public StaticLayout f28834b;
    public final ArrayList f28835c = new ArrayList(2);
    public int d;
    public int e;
    public int f28836f;
    public int f28837g;
    public int h;

    public sy0(org.telegram.ui.ActionBar.f6 f6Var) {
        this.f28833a = f6Var;
    }

    public static void c(StringBuilder sb, int i10, boolean z4) {
        if (sb.length() > 0) {
            if (z4) {
                sb.append(' ');
                sb.append(LocaleController.getString(R.string.SuggestionOfferInfoTitleEditedAnd));
                sb.append(' ');
            } else {
                sb.append(", ");
            }
        }
        sb.append(LocaleController.getString(i10));
    }

    public final int a() {
        return this.f28837g;
    }

    public final void b(MessageObject messageObject) {
        TLRPC.SuggestedPost suggestedPost;
        int i10;
        int i11;
        int i12;
        int i13;
        float f10;
        int i14;
        char c3;
        boolean z4;
        boolean z10;
        boolean z11;
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
        org.telegram.ui.ActionBar.f6 f6Var = this.f28833a;
        if (f6Var != null) {
            paint = f6Var.G("paintChatActionText3");
        }
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.j6.S0("paintChatActionText3");
        }
        TextPaint textPaint = (TextPaint) paint;
        this.f28837g = AndroidUtilities.dp(14.0f) * 2;
        ArrayList arrayList = this.f28835c;
        arrayList.clear();
        mf.a aVar = of2.amount;
        if (aVar != null && !aVar.k()) {
            arrayList.add(new ry0(new k01(LocaleController.getString(R.string.SuggestionOfferInfoPrice), textPaint), new k01(LocaleController.bold(of2.amount.f()), textPaint)));
        }
        if (suggestedPost.schedule_date > 0) {
            arrayList.add(new ry0(new k01(LocaleController.getString(R.string.SuggestionOfferInfoTime), textPaint), new k01(LocaleController.bold(LocaleController.formatDateTime(suggestedPost.schedule_date, true)), textPaint)));
        }
        int size = arrayList.size();
        float f11 = 0.0f;
        boolean z12 = false;
        float f12 = 0.0f;
        int i16 = 0;
        while (i16 < size) {
            Object obj = arrayList.get(i16);
            i16++;
            ry0 ry0Var = (ry0) obj;
            f11 = Math.max(f11, ry0Var.f28561a.l());
            f12 = Math.max(f12, ry0Var.f28562b.l());
            int j10 = ((int) ry0Var.f28561a.j()) + this.f28837g;
            this.f28837g = j10;
            this.f28837g = AndroidUtilities.dp(7.0f) + j10;
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
            StringBuilder sb = new StringBuilder();
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
                    z11 = true;
                } else {
                    z11 = false;
                }
                f10 = 11.0f;
                c(sb, i24, z11);
                i14 = 1;
            } else {
                f10 = 11.0f;
                i14 = 0;
            }
            if (i18 != 0) {
                int i25 = R.string.SuggestionOfferInfoTitleEditedTime;
                i14++;
                if (i23 == i14) {
                    z12 = true;
                }
                c3 = 0;
                c(sb, i25, z12);
            } else {
                c3 = 0;
            }
            if (i17 != 0) {
                int i26 = R.string.SuggestionOfferInfoTitleEditedText;
                i14++;
                if (i23 == i14) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                c(sb, i26, z10);
            }
            if (i20 != 0) {
                int i27 = R.string.SuggestionOfferInfoTitleEditedMedia;
                if (i23 == i14 + 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                c(sb, i27, z4);
            }
            if (messageObject.isOutOwner()) {
                int i28 = R.string.SuggestionOfferInfoTitleEditedFromYou;
                Object[] objArr = new Object[1];
                objArr[c3] = sb;
                spannableStringBuilder.append((CharSequence) LocaleController.formatString(i28, objArr));
            } else {
                int i29 = R.string.SuggestionOfferInfoTitleEditedFromX;
                Object[] objArr2 = new Object[2];
                objArr2[c3] = name;
                objArr2[1] = sb;
                spannableStringBuilder.append((CharSequence) LocaleController.formatString(i29, objArr2));
            }
        }
        this.f28834b = new StaticLayout(AndroidUtilities.replaceTags(spannableStringBuilder), textPaint, max, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        int i30 = 0;
        for (int i31 = 0; i31 < this.f28834b.getLineCount(); i31++) {
            i30 = (int) Math.max(i30, this.f28834b.getLineWidth(i31));
        }
        int height = this.f28834b.getHeight() + this.f28837g;
        this.f28837g = height;
        this.f28837g = AndroidUtilities.dp(5.0f) + height;
        int D = org.telegram.messenger.y3.D(24.0f, 2, Math.max(dp, i30));
        this.h = D;
        this.d = (D - max) / 2;
        this.e = (D - dp) / 2;
        this.f28836f = (int) (AndroidUtilities.dp(f10) + i15 + f11);
    }
}
