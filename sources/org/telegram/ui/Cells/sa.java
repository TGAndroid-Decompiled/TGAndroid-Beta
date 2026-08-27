package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.rl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.bp;
import org.telegram.ui.Components.n41;
import org.telegram.ui.fk0;

public class sa extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.x5 {
    public final org.telegram.ui.Components.y8 A;
    public boolean B;
    public Object C;
    public CharSequence D;
    public CharSequence E;
    public int F;
    public boolean G;
    public String H;
    public String I;
    public int J;
    public TLRPC.FileLocation K;
    public final int L;
    public final int M;
    public final int N;
    public boolean O;
    public final i6 P;
    public long Q;
    public boolean R;
    public boolean S;

    public final jh.z3 f25643a;

    public final org.telegram.ui.ActionBar.h5 f25644b;

    public final org.telegram.ui.ActionBar.h5 f25645c;
    public final ImageView d;

    public final bp f25646e;

    public final CheckBoxSquare f25647f;
    public final ImageView h;

    public final TextView f25648n;

    public final TextView f25649r;

    public Drawable f25650s;
    public final org.telegram.ui.Components.i5 v;

    public final org.telegram.ui.Components.i5 f25651w;

    public ImageView f25652x;

    public final org.telegram.ui.ActionBar.c6 f25653y;

    public sa(Context context, int i10, int i11, boolean z10) {
        this(i10, i11, context, null, z10, false);
    }

    public final void a(String str, boolean z10, boolean z11, boolean z12, View.OnClickListener onClickListener) {
        int iV0;
        TextView textView = this.f25648n;
        if (textView == null) {
            return;
        }
        org.telegram.ui.ActionBar.c6 c6Var = this.f25653y;
        if (z11) {
            iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Dh, c6Var);
        } else if (z10) {
            iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Ch, c6Var);
        } else {
            iV0 = (z12 && TextUtils.isEmpty(str)) ? org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var) : org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23204ld, c6Var);
        }
        textView.setTextColor(iV0);
        if (z10 || z11) {
            textView.setText(str);
            textView.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(0.66f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f));
            textView.setTranslationX(AndroidUtilities.dp(6.0f));
            textView.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(32.0f), org.telegram.ui.ActionBar.g6.l1(0.12f, iV0)));
            textView.setOnClickListener(onClickListener);
        } else if (z12 && TextUtils.isEmpty(str)) {
            textView.setPadding(pa.c(6.0f, R.string.AddTag, textView), AndroidUtilities.dp(0.66f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f));
            textView.setTranslationX(AndroidUtilities.dp(6.0f));
            textView.setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.l1(0.12f, iV0), AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f)));
            textView.setOnClickListener(onClickListener);
        } else {
            textView.setText(str);
            textView.setPadding(0, 0, 0, 0);
            textView.setTranslationX(0.0f);
            textView.setBackground(null);
            textView.setOnClickListener(onClickListener);
        }
        textView.setVisibility((str != null || z12) ? 0 : 8);
        if (str == null && !z12) {
            i(0, false);
        } else {
            CharSequence text = textView.getText();
            i((int) Math.ceil(textView.getPaint().measureText(text, 0, text.length())), false);
        }
    }

    public final void b(int i10, int i11) {
        int i12;
        float f10;
        jh.z3 z3Var = this.f25643a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) z3Var.getLayoutParams();
        layoutParams.leftMargin = AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : i10 + 7);
        layoutParams.rightMargin = AndroidUtilities.dp(LocaleController.isRTL ? i10 + 7 : 0.0f);
        z3Var.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f25644b.getLayoutParams();
        boolean z10 = LocaleController.isRTL;
        CheckBoxSquare checkBoxSquare = this.f25647f;
        if (z10) {
            i12 = (checkBoxSquare != null ? 18 : 0) + 28;
        } else {
            i12 = i10 + 64 + i11;
        }
        layoutParams2.leftMargin = AndroidUtilities.dp(i12);
        if (LocaleController.isRTL) {
            f10 = i10 + 64 + i11;
        } else {
            f10 = (checkBoxSquare != null ? 18 : 0) + 28;
        }
        layoutParams2.rightMargin = AndroidUtilities.dp(f10);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f25645c.getLayoutParams();
        layoutParams3.leftMargin = AndroidUtilities.dp(LocaleController.isRTL ? 28.0f : i10 + 64 + i11);
        layoutParams3.rightMargin = AndroidUtilities.dp(LocaleController.isRTL ? i10 + 64 + i11 : 28.0f);
        bp bpVar = this.f25646e;
        if (bpVar != null) {
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) bpVar.getLayoutParams();
            layoutParams4.leftMargin = AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : i10 + 32 + i11);
            layoutParams4.rightMargin = AndroidUtilities.dp(LocaleController.isRTL ? i10 + 32 + i11 : 0.0f);
        }
    }

    public final void c(boolean z10, boolean z11) {
        bp bpVar = this.f25646e;
        if (bpVar != null) {
            if (bpVar.getVisibility() != 0) {
                bpVar.setVisibility(0);
            }
            bpVar.a(z10, z11);
            return;
        }
        CheckBoxSquare checkBoxSquare = this.f25647f;
        if (checkBoxSquare != null) {
            if (checkBoxSquare.getVisibility() != 0) {
                checkBoxSquare.setVisibility(0);
            }
            checkBoxSquare.a(z10, z11);
        } else {
            ImageView imageView = this.h;
            if (imageView != null) {
                imageView.setVisibility(z10 ? 0 : 8);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            this.f25644b.invalidate();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (this.R && view == this.f25643a) {
            gf.s.a(canvas, org.telegram.ui.ActionBar.g6.S0, (view.getWidth() / 2.0f) + view.getX(), (view.getHeight() / 2.0f) + view.getY(), view.getHeight());
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e(Object obj, CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        org.telegram.ui.ActionBar.h5 h5Var = this.f25644b;
        if (obj == null && charSequence == null && charSequence2 == null) {
            this.E = null;
            this.D = null;
            this.B = false;
            this.C = null;
            h5Var.l("", false);
            this.f25645c.l("", false);
            this.f25643a.setImageDrawable(null);
            return;
        }
        this.E = charSequence2;
        if (charSequence != null && h5Var != null) {
            try {
                charSequence = Emoji.replaceEmoji(charSequence, h5Var.getPaint().getFontMetricsInt(), false);
            } catch (Exception unused) {
            }
        }
        this.D = charSequence;
        this.B = !(obj instanceof String);
        this.C = obj;
        this.O = z10;
        setWillNotDraw(!z10);
        j(0);
    }

    public final void f(TLRPC.User user, boolean z10) {
        e(user, null, null, z10);
    }

    public final void g(fk0 fk0Var, CharSequence charSequence, boolean z10) {
        String string;
        Object user;
        boolean z11 = fk0Var.f38154e;
        int i10 = this.L;
        if (z11) {
            int i11 = fk0Var.f38153c;
            if (i11 > 0 || !fk0Var.f38155f) {
                string = i11 <= 0 ? LocaleController.getString(R.string.NotificationEnabled) : LocaleController.getString(R.string.NotificationDisabled);
            } else {
                string = LocaleController.getString(R.string.NotificationEnabledAutomatically);
            }
        } else {
            boolean z12 = fk0Var.f38152b;
            int i12 = fk0Var.f38153c;
            int i13 = fk0Var.f38151a;
            boolean z13 = true;
            if (i12 != 3 || i13 == Integer.MAX_VALUE) {
                if (i12 != 0 && i12 != 1) {
                    z13 = false;
                }
                if (z13 && z12) {
                    string = LocaleController.getString(R.string.NotificationsCustom);
                } else {
                    string = LocaleController.getString(z13 ? R.string.NotificationsUnmuted : R.string.NotificationsMuted);
                }
            } else {
                int currentTime = i13 - ConnectionsManager.getInstance(i10).getCurrentTime();
                if (currentTime <= 0) {
                    string = z12 ? LocaleController.getString(R.string.NotificationsCustom) : LocaleController.getString(R.string.NotificationsUnmuted);
                } else if (currentTime < 3600) {
                    string = LocaleController.formatString("WillUnmuteIn", R.string.WillUnmuteIn, LocaleController.formatPluralString("Minutes", currentTime / 60, new Object[0]));
                } else if (currentTime < 86400) {
                    string = LocaleController.formatString("WillUnmuteIn", R.string.WillUnmuteIn, LocaleController.formatPluralString("Hours", (int) Math.ceil((currentTime / 60.0f) / 60.0f), new Object[0]));
                } else {
                    string = currentTime < 31536000 ? LocaleController.formatString("WillUnmuteIn", R.string.WillUnmuteIn, LocaleController.formatPluralString("Days", (int) Math.ceil(((currentTime / 60.0f) / 60.0f) / 24.0f), new Object[0])) : null;
                }
            }
            if (string == null) {
                string = LocaleController.getString(R.string.NotificationsOff);
            }
            if (fk0Var.f38155f) {
                string = s3.c.l(string, ", Auto");
            }
        }
        if (DialogObject.isEncryptedDialog(fk0Var.d)) {
            TLRPC.EncryptedChat encryptedChatN = org.telegram.messenger.y1.n(MessagesController.getInstance(i10), fk0Var.d);
            if (encryptedChatN == null || (user = MessagesController.getInstance(i10).getUser(Long.valueOf(encryptedChatN.user_id))) == null) {
                return;
            }
            e(user, charSequence, string, false);
            return;
        }
        if (DialogObject.isUserDialog(fk0Var.d)) {
            Object user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(fk0Var.d));
            if (user2 != null) {
                e(user2, charSequence, string, z10);
                return;
            }
            return;
        }
        Object chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-fk0Var.d));
        if (chat != null) {
            e(chat, charSequence, string, z10);
        }
    }

    public int[] getColorKeys() {
        return null;
    }

    public Object getCurrentObject() {
        return this.C;
    }

    public long getDialogId() {
        return this.Q;
    }

    public CharSequence getName() {
        return this.f25644b.getText();
    }

    public final void h(int i10, n41 n41Var, boolean z10) {
        CharSequence string;
        CharSequence string2;
        long j10 = n41Var.f30855x;
        if (j10 <= 0) {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
            if (chat != null) {
                if (chat.participants_count != 0) {
                    string = ChatObject.isChannelAndNotMegaGroup(chat) ? LocaleController.formatPluralStringComma("Subscribers", chat.participants_count) : LocaleController.formatPluralStringComma("Members", chat.participants_count);
                } else if (ChatObject.isPublic(chat)) {
                    string = (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.MegaPublic) : LocaleController.getString(R.string.ChannelPublic);
                } else {
                    string = (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.MegaPrivate) : LocaleController.getString(R.string.ChannelPrivate);
                }
                e(chat, null, string, z10);
                return;
            }
            return;
        }
        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
        String publicUsername = UserObject.getPublicUsername(user);
        if (user != null) {
            if (!TextUtils.isEmpty(publicUsername)) {
                string2 = s3.c.e("@", publicUsername);
            } else if (user.bot) {
                string2 = LocaleController.getString(R.string.Bot);
            } else {
                string2 = user.contact ? LocaleController.getString(R.string.FilterContact) : LocaleController.getString(R.string.FilterNonContact);
            }
            e(user, null, string2, z10);
        }
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void i(int i10, boolean z10) {
        if (i10 > 0) {
            i10 += AndroidUtilities.dp(6.0f);
        }
        boolean z11 = LocaleController.isRTL;
        this.f25644b.setPadding(z11 ? i10 : 0, 0, !z11 ? i10 : 0, 0);
        if (z10) {
            boolean z12 = LocaleController.isRTL;
            int i11 = z12 ? i10 : 0;
            if (z12) {
                i10 = 0;
            }
            this.f25645c.setPadding(i11, 0, i10, 0);
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        CheckBoxSquare checkBoxSquare = this.f25647f;
        if (checkBoxSquare != null) {
            checkBoxSquare.invalidate();
        }
    }

    public final void j(int i10) {
        TLRPC.User user;
        TLRPC.Chat chat;
        TLRPC.FileLocation fileLocation;
        String strRemoveRTL;
        String str;
        CharSequence charSequenceReplaceEmoji;
        org.telegram.ui.ActionBar.c6 c6Var;
        CharSequence charSequenceReplaceEmoji2;
        String str2;
        boolean z10;
        String strRemoveRTL2;
        long botVerificationIcon;
        org.telegram.ui.Components.i5 i5Var;
        CharSequence charSequence;
        int i11;
        int i12;
        TLRPC.UserStatus userStatus;
        TextView textView;
        ImageView imageView;
        int iDp;
        CharSequence charSequenceHighlightText;
        String str3;
        String str4;
        boolean z11;
        TLRPC.FileLocation fileLocation2;
        this.Q = 0L;
        this.R = false;
        Object obj = this.C;
        if (obj instanceof TLRPC.User) {
            user = (TLRPC.User) obj;
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            TLRPC.FileLocation fileLocation3 = userProfilePhoto != null ? userProfilePhoto.photo_small : null;
            this.Q = user.f22527id;
            fileLocation = fileLocation3;
            chat = null;
        } else if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat2 = (TLRPC.Chat) obj;
            TLRPC.ChatPhoto chatPhoto = chat2.photo;
            TLRPC.FileLocation fileLocation4 = chatPhoto != null ? chatPhoto.photo_small : null;
            this.Q = chat2.f22380id;
            this.R = ChatObject.isCommunity(chat2);
            fileLocation = fileLocation4;
            chat = chat2;
            user = null;
        } else {
            user = null;
            chat = null;
            fileLocation = null;
        }
        if (i10 != 0) {
            boolean z12 = (i10 & MessagesController.UPDATE_MASK_AVATAR) != 0 && (((fileLocation2 = this.K) != null && fileLocation == null) || ((fileLocation2 == null && fileLocation != null) || !(fileLocation2 == null || (fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.local_id == fileLocation.local_id))));
            if (user != null && !z12 && (i10 & MessagesController.UPDATE_MASK_STATUS) != 0) {
                TLRPC.UserStatus userStatus2 = user.status;
                if ((userStatus2 != null ? userStatus2.expires : 0) != this.J) {
                    z12 = true;
                }
            }
            if (z12 || this.D != null || this.I == null || (i10 & MessagesController.UPDATE_MASK_NAME) == 0) {
                strRemoveRTL = null;
            } else {
                if (user != null) {
                    strRemoveRTL = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getUserName(user)));
                } else {
                    strRemoveRTL = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat == null ? "" : chat.title));
                }
                if (!strRemoveRTL.equals(this.I)) {
                    z12 = true;
                }
            }
            if (!z12) {
                return;
            }
        } else {
            strRemoveRTL = null;
        }
        boolean z13 = this.C instanceof String;
        jh.z3 z3Var = this.f25643a;
        int i13 = this.L;
        org.telegram.ui.ActionBar.h5 h5Var = this.f25645c;
        org.telegram.ui.ActionBar.h5 h5Var2 = this.f25644b;
        org.telegram.ui.Components.y8 y8Var = this.A;
        if (z13) {
            ((FrameLayout.LayoutParams) h5Var2.getLayoutParams()).topMargin = AndroidUtilities.dp(19.0f);
            String str5 = (String) this.C;
            str5.getClass();
            switch (str5) {
                case "archived":
                    y8Var.g(11);
                    break;
                case "groups":
                    y8Var.g(6);
                    break;
                case "non_contacts":
                    y8Var.g(5);
                    break;
                case "contacts":
                    y8Var.g(4);
                    break;
                case "new_chats":
                    y8Var.g(24);
                    break;
                case "bots":
                    y8Var.g(8);
                    break;
                case "read":
                    y8Var.g(10);
                    break;
                case "muted":
                    y8Var.g(9);
                    break;
                case "existing_chats":
                    y8Var.g(23);
                    break;
                case "channels":
                    y8Var.g(7);
                    break;
            }
            z3Var.f(null, "50_50", y8Var);
            this.E = "";
        } else {
            ((FrameLayout.LayoutParams) h5Var2.getLayoutParams()).topMargin = AndroidUtilities.dp(10.0f);
            if (user == null) {
                if (chat != null) {
                    y8Var.k(i13, chat);
                } else {
                    CharSequence charSequence2 = this.D;
                    if (charSequence2 != null) {
                        str = null;
                        y8Var.n(this.F, charSequence2.toString(), null);
                    } else {
                        str = null;
                        y8Var.n(this.F, "#", null);
                    }
                }
                charSequenceReplaceEmoji = this.D;
                c6Var = this.f25653y;
                if (charSequenceReplaceEmoji != null) {
                    this.I = str;
                    str4 = this.H;
                    if (str4 != null) {
                        charSequenceReplaceEmoji = AndroidUtilities.highlightText(charSequenceReplaceEmoji, str4, c6Var);
                    }
                    if (charSequenceReplaceEmoji != null) {
                        try {
                            z11 = false;
                            try {
                                charSequenceReplaceEmoji = Emoji.replaceEmoji(charSequenceReplaceEmoji, h5Var2.getPaint().getFontMetricsInt(), false);
                            } catch (Exception unused) {
                            }
                        } catch (Exception unused2) {
                            z11 = false;
                        }
                    } else {
                        z11 = false;
                    }
                    h5Var2.l(charSequenceReplaceEmoji, z11);
                } else {
                    if (user != null) {
                        if (strRemoveRTL == null) {
                            strRemoveRTL2 = UserObject.getUserName(user);
                        } else {
                            strRemoveRTL2 = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(strRemoveRTL));
                        }
                        this.I = strRemoveRTL2;
                    } else if (chat != null) {
                        if (strRemoveRTL == null) {
                            strRemoveRTL = chat.title;
                        }
                        this.I = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(strRemoveRTL));
                    } else {
                        this.I = "";
                    }
                    charSequenceReplaceEmoji2 = this.I;
                    str2 = this.H;
                    if (str2 != null) {
                        charSequenceReplaceEmoji2 = AndroidUtilities.highlightText(charSequenceReplaceEmoji2, str2, c6Var);
                    }
                    if (charSequenceReplaceEmoji2 != null) {
                        try {
                            z10 = false;
                            try {
                                charSequenceReplaceEmoji2 = Emoji.replaceEmoji(charSequenceReplaceEmoji2, h5Var2.getPaint().getFontMetricsInt(), false);
                            } catch (Exception unused3) {
                            }
                        } catch (Exception unused4) {
                            z10 = false;
                        }
                    } else {
                        z10 = false;
                    }
                    h5Var2.l(charSequenceReplaceEmoji2, z10);
                }
                if (user != null) {
                    botVerificationIcon = DialogObject.getBotVerificationIcon(user);
                } else if (chat != null) {
                    botVerificationIcon = DialogObject.getBotVerificationIcon(chat);
                } else {
                    botVerificationIcon = 0;
                }
                i5Var = this.v;
                if (botVerificationIcon == 0) {
                    i5Var.g(null, false);
                    h5Var2.setLeftDrawable((Drawable) null);
                } else {
                    i5Var.j(botVerificationIcon, false);
                    i5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23444z9, c6Var)));
                    h5Var2.setLeftDrawable(i5Var);
                }
                if (user == null && MessagesController.getInstance(i13).isPremiumUser(user) && !MessagesController.getInstance(i13).premiumFeaturesBlocked()) {
                    if (DialogObject.getEmojiStatusDocumentId(user.emoji_status) != 0) {
                        long emojiStatusDocumentId = DialogObject.getEmojiStatusDocumentId(user.emoji_status);
                        org.telegram.ui.Components.i5 i5Var2 = this.f25651w;
                        i5Var2.j(emojiStatusDocumentId, false);
                        i5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23444z9, c6Var)));
                        h5Var2.i(i5Var2);
                    } else {
                        if (this.f25650s == null) {
                            this.f25650s = getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                            qa qaVar = new qa(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.f25650s);
                            this.f25650s = qaVar;
                            qaVar.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23444z9, c6Var), PorterDuff.Mode.MULTIPLY));
                        }
                        h5Var2.i(this.f25650s);
                    }
                    h5Var2.setRightDrawableTopPadding(-AndroidUtilities.dp(0.5f));
                } else {
                    h5Var2.i(null);
                    h5Var2.setRightDrawableTopPadding(0);
                }
                charSequence = this.E;
                i11 = this.M;
                if (charSequence != null) {
                    h5Var.setTextColor(i11);
                    charSequenceHighlightText = this.E;
                    str3 = this.H;
                    if (str3 != null) {
                        charSequenceHighlightText = AndroidUtilities.highlightText(charSequenceHighlightText, str3, c6Var);
                    }
                    i12 = 0;
                    h5Var.l(charSequenceHighlightText, false);
                } else if (user != null) {
                    i12 = 0;
                } else if (user.bot) {
                    h5Var.setTextColor(i11);
                    if (!user.bot_chat_history || ((textView = this.f25648n) != null && textView.getVisibility() == 0)) {
                        i12 = 0;
                        h5Var.l(LocaleController.getString(R.string.BotStatusRead), false);
                    } else {
                        i12 = 0;
                        h5Var.l(LocaleController.getString(R.string.BotStatusCantRead), false);
                    }
                } else if (user.f22527id != UserConfig.getInstance(i13).getClientUserId() || (((userStatus = user.status) != null && userStatus.expires > ConnectionsManager.getInstance(i13).getCurrentTime()) || MessagesController.getInstance(i13).onlinePrivacy.containsKey(Long.valueOf(user.f22527id)))) {
                    i12 = 0;
                    h5Var.setTextColor(this.N);
                    h5Var.l(LocaleController.getString(R.string.Online), false);
                } else {
                    h5Var.setTextColor(i11);
                    i12 = 0;
                    h5Var.l(LocaleController.formatUserStatus(i13, user), false);
                }
                imageView = this.d;
                if (imageView.getVisibility() == 0) {
                    imageView.setVisibility(8);
                    imageView.setImageResource(i12);
                } else {
                    imageView.getVisibility();
                }
                this.K = fileLocation;
                if (user != null) {
                    z3Var.e(user, y8Var);
                } else if (chat != null) {
                    z3Var.e(chat, y8Var);
                } else {
                    z3Var.setImageDrawable(y8Var);
                }
                if (this.R) {
                    iDp = AndroidUtilities.dp(12.777778f);
                } else if (chat == null && chat.forum) {
                    iDp = AndroidUtilities.dp(14.0f);
                } else {
                    iDp = AndroidUtilities.dp(24.0f);
                }
                z3Var.setRoundRadius(iDp);
                h5Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
            }
            if (this.G && UserObject.isUserSelf(user)) {
                h5Var2.l(LocaleController.getString(R.string.SavedMessages), true);
                h5Var.l(null, false);
                y8Var.g(1);
                z3Var.h(null, "50_50", y8Var, user);
                ((FrameLayout.LayoutParams) h5Var2.getLayoutParams()).topMargin = AndroidUtilities.dp(19.0f);
                return;
            }
            y8Var.m(i13, user);
            TLRPC.UserStatus userStatus3 = user.status;
            if (userStatus3 != null) {
                this.J = userStatus3.expires;
            } else {
                this.J = 0;
            }
        }
        str = null;
        charSequenceReplaceEmoji = this.D;
        c6Var = this.f25653y;
        if (charSequenceReplaceEmoji != null) {
            this.I = str;
            str4 = this.H;
            if (str4 != null) {
                charSequenceReplaceEmoji = AndroidUtilities.highlightText(charSequenceReplaceEmoji, str4, c6Var);
            }
            if (charSequenceReplaceEmoji != null) {
                z11 = false;
                charSequenceReplaceEmoji = Emoji.replaceEmoji(charSequenceReplaceEmoji, h5Var2.getPaint().getFontMetricsInt(), false);
            } else {
                z11 = false;
            }
            h5Var2.l(charSequenceReplaceEmoji, z11);
        } else {
            if (user != null) {
                if (strRemoveRTL == null) {
                    strRemoveRTL2 = UserObject.getUserName(user);
                } else {
                    strRemoveRTL2 = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(strRemoveRTL));
                }
                this.I = strRemoveRTL2;
            } else if (chat != null) {
                if (strRemoveRTL == null) {
                    strRemoveRTL = chat.title;
                }
                this.I = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(strRemoveRTL));
            } else {
                this.I = "";
            }
            charSequenceReplaceEmoji2 = this.I;
            str2 = this.H;
            if (str2 != null) {
                charSequenceReplaceEmoji2 = AndroidUtilities.highlightText(charSequenceReplaceEmoji2, str2, c6Var);
            }
            if (charSequenceReplaceEmoji2 != null) {
                z10 = false;
                charSequenceReplaceEmoji2 = Emoji.replaceEmoji(charSequenceReplaceEmoji2, h5Var2.getPaint().getFontMetricsInt(), false);
            } else {
                z10 = false;
            }
            h5Var2.l(charSequenceReplaceEmoji2, z10);
        }
        if (user != null) {
            botVerificationIcon = DialogObject.getBotVerificationIcon(user);
        } else if (chat != null) {
            botVerificationIcon = DialogObject.getBotVerificationIcon(chat);
        } else {
            botVerificationIcon = 0;
        }
        i5Var = this.v;
        if (botVerificationIcon == 0) {
            i5Var.g(null, false);
            h5Var2.setLeftDrawable((Drawable) null);
        } else {
            i5Var.j(botVerificationIcon, false);
            i5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23444z9, c6Var)));
            h5Var2.setLeftDrawable(i5Var);
        }
        if (user == null) {
            h5Var2.i(null);
            h5Var2.setRightDrawableTopPadding(0);
        } else {
            h5Var2.i(null);
            h5Var2.setRightDrawableTopPadding(0);
        }
        charSequence = this.E;
        i11 = this.M;
        if (charSequence != null) {
            h5Var.setTextColor(i11);
            charSequenceHighlightText = this.E;
            str3 = this.H;
            if (str3 != null) {
                charSequenceHighlightText = AndroidUtilities.highlightText(charSequenceHighlightText, str3, c6Var);
            }
            i12 = 0;
            h5Var.l(charSequenceHighlightText, false);
        } else if (user != null) {
            i12 = 0;
        } else if (user.bot) {
            h5Var.setTextColor(i11);
            if (user.bot_chat_history) {
                i12 = 0;
                h5Var.l(LocaleController.getString(R.string.BotStatusRead), false);
            } else {
                i12 = 0;
                h5Var.l(LocaleController.getString(R.string.BotStatusRead), false);
            }
        } else if (user.f22527id != UserConfig.getInstance(i13).getClientUserId()) {
            i12 = 0;
            h5Var.setTextColor(this.N);
            h5Var.l(LocaleController.getString(R.string.Online), false);
        } else {
            i12 = 0;
            h5Var.setTextColor(this.N);
            h5Var.l(LocaleController.getString(R.string.Online), false);
        }
        imageView = this.d;
        if (imageView.getVisibility() == 0) {
            imageView.setVisibility(8);
            imageView.setImageResource(i12);
        } else {
            imageView.getVisibility();
        }
        this.K = fileLocation;
        if (user != null) {
            z3Var.e(user, y8Var);
        } else if (chat != null) {
            z3Var.e(chat, y8Var);
        } else {
            z3Var.setImageDrawable(y8Var);
        }
        if (this.R) {
            iDp = AndroidUtilities.dp(12.777778f);
        } else if (chat == null) {
            iDp = AndroidUtilities.dp(24.0f);
        } else {
            iDp = AndroidUtilities.dp(24.0f);
        }
        z3Var.setRoundRadius(iDp);
        h5Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        this.f25651w.a();
        this.v.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        this.f25651w.b();
        this.v.b();
        this.P.g();
    }

    @Override
    public void onDraw(Canvas canvas) {
        if (this.O) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(68.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(68.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.f23175k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        CheckBoxSquare checkBoxSquare = this.f25647f;
        if (checkBoxSquare == null || checkBoxSquare.getVisibility() != 0) {
            bp bpVar = this.f25646e;
            if (bpVar != null && bpVar.getVisibility() == 0) {
                accessibilityNodeInfo.setCheckable(true);
                accessibilityNodeInfo.setChecked(bpVar.f27188a.f26309q);
                accessibilityNodeInfo.setClassName("android.widget.CheckBox");
            }
        } else {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(checkBoxSquare.h);
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        }
        StringBuilder sb2 = new StringBuilder();
        org.telegram.ui.ActionBar.h5 h5Var = this.f25644b;
        if (h5Var != null) {
            CharSequence text = h5Var.getText();
            if (!TextUtils.isEmpty(text)) {
                sb2.append(text);
            }
        }
        TextView textView = this.f25648n;
        if (textView != null && textView.getVisibility() == 0) {
            CharSequence text2 = textView.getText();
            if (!TextUtils.isEmpty(text2)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(text2);
            }
        }
        org.telegram.ui.ActionBar.h5 h5Var2 = this.f25645c;
        if (h5Var2 != null) {
            CharSequence text3 = h5Var2.getText();
            if (!TextUtils.isEmpty(text3)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(text3);
            }
        }
        if (sb2.length() > 0) {
            accessibilityNodeInfo.setContentDescription(sb2);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.S ? 56.0f : 58.0f) + (this.O ? 1 : 0), 1073741824));
    }

    public void setAddButtonVisible(boolean z10) {
        TextView textView = this.f25649r;
        if (textView == null) {
            return;
        }
        textView.setVisibility(z10 ? 0 : 8);
    }

    public void setAvatarPadding(int i10) {
        b(i10, 0);
    }

    public void setCallCellStyle(int i10) {
        this.S = true;
        org.telegram.ui.ActionBar.h5 h5Var = this.f25644b;
        h5Var.setTextSize(15);
        boolean z10 = LocaleController.isRTL;
        h5Var.setLayoutParams(h7.z5.d(-1, 20.0f, (z10 ? 5 : 3) | 48, z10 ? 30.0f : i10 + 66, 10.0f, z10 ? i10 + 66 : 30.0f, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var2 = this.f25645c;
        h5Var2.setTextSize(13);
        boolean z11 = LocaleController.isRTL;
        h5Var2.setLayoutParams(h7.z5.d(-1, 20.0f, (z11 ? 5 : 3) | 48, z11 ? 30.0f : i10 + 66, 32.0f, z11 ? i10 + 66 : 30.0f, 0.0f));
        int iDp = AndroidUtilities.dp(22.0f);
        jh.z3 z3Var = this.f25643a;
        z3Var.setRoundRadius(iDp);
        boolean z12 = LocaleController.isRTL;
        z3Var.setLayoutParams(h7.z5.d(44, 44.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : i10 + 8, 6.0f, z12 ? i10 + 8 : 0.0f, 0.0f));
        bp bpVar = this.f25646e;
        if (bpVar != null) {
            boolean z13 = LocaleController.isRTL;
            bpVar.setLayoutParams(h7.z5.d(24, 24.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : i10 + 37, 32.0f, z13 ? i10 + 37 : 0.0f, 0.0f));
        }
    }

    public void setCheckDisabled(boolean z10) {
        CheckBoxSquare checkBoxSquare = this.f25647f;
        if (checkBoxSquare != null) {
            checkBoxSquare.setDisabled(z10);
        }
    }

    public void setCloseIcon(View.OnClickListener onClickListener) {
        if (onClickListener == null) {
            ImageView imageView = this.f25652x;
            if (imageView != null) {
                removeView(imageView);
                this.f25652x = null;
                return;
            }
            return;
        }
        if (this.f25652x == null) {
            ImageView imageView2 = new ImageView(getContext());
            this.f25652x = imageView2;
            imageView2.setScaleType(ImageView.ScaleType.CENTER);
            h7.b6.a(this.f25652x);
            this.f25652x.setImageResource(R.drawable.ic_close_white);
            ImageView imageView3 = this.f25652x;
            int i10 = org.telegram.ui.ActionBar.g6.A6;
            org.telegram.ui.ActionBar.c6 c6Var = this.f25653y;
            imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), PorterDuff.Mode.SRC_IN));
            this.f25652x.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23144i6, c6Var), 5, -1));
            ImageView imageView4 = this.f25652x;
            boolean z10 = LocaleController.isRTL;
            addView(imageView4, h7.z5.d(30, 30.0f, (z10 ? 3 : 5) | 16, z10 ? 14.0f : 0.0f, 0.0f, z10 ? 0.0f : 14.0f, 0.0f));
        }
        this.f25652x.setOnClickListener(onClickListener);
    }

    public void setCurrentId(int i10) {
        this.F = i10;
    }

    public void setNameTypeface(Typeface typeface) {
        this.f25644b.setTypeface(typeface);
    }

    public void setQuery(String str) {
        this.H = str;
        j(0);
    }

    public void setSelfAsSavedMessages(boolean z10) {
        this.G = z10;
    }

    public sa(int i10, int i11, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, boolean z11) {
        int iCeil;
        int i12;
        int i13;
        super(context);
        this.L = UserConfig.selectedAccount;
        this.P = new i6(this);
        this.f25653y = c6Var;
        if (z11) {
            TextView textView = new TextView(context);
            this.f25649r = textView;
            textView.setGravity(17);
            rl.w(org.telegram.ui.ActionBar.g6.Sh, c6Var, textView, 1, 14.0f);
            textView.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{14.0f}, org.telegram.ui.ActionBar.g6.Oh));
            textView.setPadding(pa.c(17.0f, R.string.Add, textView), 0, AndroidUtilities.dp(17.0f), 0);
            boolean z12 = LocaleController.isRTL;
            addView(textView, h7.z5.d(-2, 28.0f, (z12 ? 3 : 5) | 48, z12 ? 14.0f : 0.0f, 15.0f, z12 ? 0.0f : 14.0f, 0.0f));
            iCeil = (int) Math.ceil((textView.getPaint().measureText(textView.getText().toString()) + AndroidUtilities.dp(48.0f)) / AndroidUtilities.density);
        } else {
            iCeil = 0;
        }
        this.M = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23423y6, c6Var);
        this.N = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.il, c6Var);
        this.A = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
        jh.z3 z3Var = new jh.z3(this, context, 2);
        this.f25643a = z3Var;
        z3Var.setRoundRadius(AndroidUtilities.dp(24.0f));
        boolean z13 = LocaleController.isRTL;
        addView(z3Var, h7.z5.d(46, 46.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : i10 + 7, 6.0f, z13 ? i10 + 7 : 0.0f, 0.0f));
        setClipChildren(false);
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f25644b = h5Var;
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setTextSize(16);
        h5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z14 = LocaleController.isRTL;
        int i14 = (z14 ? 5 : 3) | 48;
        if (z14) {
            i12 = (i11 == 2 ? 18 : 0) + 28 + iCeil;
        } else {
            i12 = i10 + 64;
        }
        float f10 = i12;
        if (z14) {
            i13 = i10 + 64;
        } else {
            i13 = (i11 != 2 ? 0 : 18) + 28 + iCeil;
        }
        addView(h5Var, h7.z5.d(-1, 20.0f, i14, f10, 10.0f, i13, 0.0f));
        this.v = new org.telegram.ui.Components.i5(AndroidUtilities.dp(20.0f), h5Var);
        this.f25651w = new org.telegram.ui.Components.i5(AndroidUtilities.dp(20.0f), h5Var);
        org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(context);
        this.f25645c = h5Var2;
        h5Var2.setTextSize(15);
        h5Var2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z15 = LocaleController.isRTL;
        addView(h5Var2, h7.z5.d(-1, 20.0f, (z15 ? 5 : 3) | 48, z15 ? iCeil + 28 : i10 + 64, 32.0f, z15 ? i10 + 64 : iCeil + 28, 0.0f));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23215m6, c6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(iV0, mode));
        imageView.setVisibility(8);
        boolean z16 = LocaleController.isRTL;
        addView(imageView, h7.z5.d(-2, -2.0f, (z16 ? 5 : 3) | 16, z16 ? 0.0f : 16.0f, 0.0f, z16 ? 16.0f : 0.0f, 0.0f));
        if (i11 == 2) {
            CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, null, false);
            this.f25647f = checkBoxSquare;
            boolean z17 = LocaleController.isRTL;
            addView(checkBoxSquare, h7.z5.d(18, 18.0f, (z17 ? 3 : 5) | 16, z17 ? 19.0f : 0.0f, 0.0f, z17 ? 0.0f : 19.0f, 0.0f));
        } else if (i11 == 1) {
            bp bpVar = new bp(context, 21, c6Var);
            this.f25646e = bpVar;
            bpVar.setDrawUnchecked(false);
            bpVar.setDrawBackgroundAsArc(3);
            bpVar.b(-1, org.telegram.ui.ActionBar.g6.f23053d6, org.telegram.ui.ActionBar.g6.f23182k7);
            boolean z18 = LocaleController.isRTL;
            addView(bpVar, h7.z5.d(24, 24.0f, (z18 ? 5 : 3) | 48, z18 ? 0.0f : i10 + 24, 36.0f, z18 ? i10 + 24 : 0.0f, 0.0f));
        } else if (i11 == 3) {
            ImageView imageView2 = new ImageView(context);
            this.h = imageView2;
            imageView2.setScaleType(scaleType);
            imageView2.setImageResource(R.drawable.account_check);
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var), mode));
            imageView2.setVisibility(8);
            boolean z19 = LocaleController.isRTL;
            addView(imageView2, h7.z5.d(24, 24.0f, (z19 ? 3 : 5) | 16, z19 ? i10 + 10 : 0.0f, 0.0f, z19 ? 0.0f : i10 + 10, 0.0f));
        }
        if (z10) {
            TextView textView2 = new TextView(context);
            this.f25648n = textView2;
            h7.b6.b(textView2, 0.05f, 1.2f);
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.uh, c6Var));
            textView2.setImportantForAccessibility(2);
            boolean z20 = LocaleController.isRTL;
            addView(textView2, h7.z5.d(-2, -2.0f, (z20 ? 3 : 5) | 48, z20 ? 23.0f : 0.0f, 10.0f, z20 ? 0.0f : 23.0f, 0.0f));
        }
        setFocusable(true);
    }

    @Override
    public final void d() {
    }
}
