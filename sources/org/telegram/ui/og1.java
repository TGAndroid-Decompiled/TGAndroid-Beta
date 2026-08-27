package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public final class og1 extends org.telegram.ui.Components.jk0 {

    public final Context f41092c;

    public final pf.j1 f41094f;
    public Runnable h;

    public boolean f41095n;

    public final int f41097s;
    public final UsersSelectActivity v;
    public ArrayList d = new ArrayList();

    public ArrayList f41093e = new ArrayList();

    public final ArrayList f41096r = new ArrayList();

    public og1(UsersSelectActivity usersSelectActivity, Context context) {
        this.v = usersSelectActivity;
        this.f41092c = context;
        if (usersSelectActivity.B) {
            this.f41097s = 0;
        } else {
            int i10 = usersSelectActivity.f36297x;
            if (i10 == 2) {
                this.f41097s = (!usersSelectActivity.D ? 1 : 0) + 5;
            } else if (i10 != 0) {
                this.f41097s = 0;
            } else if (usersSelectActivity.E) {
                this.f41097s = 7;
            } else {
                this.f41097s = 5;
            }
        }
        int i11 = usersSelectActivity.f36297x;
        boolean z10 = i11 != 2;
        boolean z11 = i11 != 2;
        ArrayList<TLRPC.Dialog> allDialogs = usersSelectActivity.getMessagesController().getAllDialogs();
        int size = allDialogs.size();
        boolean z12 = false;
        for (int i12 = 0; i12 < size; i12++) {
            TLRPC.Dialog dialog = allDialogs.get(i12);
            if (!DialogObject.isEncryptedDialog(dialog.f22384id)) {
                if (DialogObject.isUserDialog(dialog.f22384id)) {
                    TLRPC.User user = usersSelectActivity.getMessagesController().getUser(Long.valueOf(dialog.f22384id));
                    if (user != null && ((usersSelectActivity.C || !UserObject.isUserSelf(user)) && (!user.bot || z10))) {
                        this.f41096r.add(user);
                        if (UserObject.isUserSelf(user)) {
                            z12 = true;
                        }
                    }
                } else {
                    TLRPC.Chat chat = usersSelectActivity.getMessagesController().getChat(Long.valueOf(-dialog.f22384id));
                    if (z11 && chat != null) {
                        this.f41096r.add(chat);
                    }
                }
            }
        }
        if (!z12 && usersSelectActivity.C) {
            this.f41096r.add(0, usersSelectActivity.getMessagesController().getUser(Long.valueOf(usersSelectActivity.getUserConfig().clientUserId)));
        }
        pf.j1 j1Var = new pf.j1(false);
        this.f41094f = j1Var;
        j1Var.f45849p = false;
        j1Var.f45836a = new dl0(this, 25);
    }

    @Override
    public final void A(f2.o1 o1Var) {
        View view = o1Var.f5789a;
        if (view instanceof org.telegram.ui.Cells.d4) {
            ((org.telegram.ui.Cells.d4) view).f24204a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return o1Var.f5793f == 1;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(org.telegram.ui.Components.zk0 zk0Var, float f10, int[] iArr) {
        iArr[0] = (int) (h() * f10);
        iArr[1] = 0;
    }

    public final void L(String str) {
        if (this.h != null) {
            Utilities.searchQueue.cancelRunnable(this.h);
            this.h = null;
        }
        int i10 = this.v.f36297x;
        boolean z10 = i10 != 2;
        boolean z11 = i10 != 2;
        if (str != null) {
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            ng1 ng1Var = new ng1(this, str, z11, z10, 0);
            this.h = ng1Var;
            dispatchQueue.postRunnable(ng1Var, 300L);
            return;
        }
        this.d.clear();
        this.f41093e.clear();
        this.f41094f.f(null, null);
        this.f41094f.g(null, true, false, false, false, 0L, false, 0, 0);
        l();
    }

    @Override
    public final int h() {
        if (this.f41095n) {
            int size = this.d.size();
            pf.j1 j1Var = this.f41094f;
            return j1Var.f45839e.size() + j1Var.d.size() + size;
        }
        UsersSelectActivity usersSelectActivity = this.v;
        int i10 = 0;
        if (!usersSelectActivity.B) {
            int i11 = usersSelectActivity.f36297x;
            if (i11 == 2) {
                i10 = (!usersSelectActivity.D ? 1 : 0) + 3;
            } else if (i11 == 0) {
                i10 = usersSelectActivity.E ? 7 : 5;
            }
        }
        return this.f41096r.size() + i10;
    }

    @Override
    public final int j(int i10) {
        int i11;
        if (!this.f41095n) {
            UsersSelectActivity usersSelectActivity = this.v;
            if (!usersSelectActivity.B ? !((i11 = usersSelectActivity.f36297x) != 2 ? i11 != 0 || (!usersSelectActivity.E ? !(i10 == 0 || i10 == 4) : !(i10 == 0 || i10 == 6)) : i10 != 0 && i10 != (!usersSelectActivity.D ? 1 : 0) + 4) : i10 == 0) {
                return 2;
            }
        }
        return 1;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        Object obj;
        String string;
        CharSequence charSequence;
        ?? spannableStringBuilder;
        long j10;
        int i11;
        long j11;
        int i12;
        SpannableStringBuilder spannableStringBuilder2;
        boolean z10;
        boolean z11;
        boolean zCanUserDoAdminAction;
        Paint.FontMetricsInt fontMetricsInt;
        ArrayList<MessagesController.DialogFilter> arrayList;
        int size;
        int i13;
        MessagesController.DialogFilter dialogFilter;
        ?? r11;
        int i14;
        boolean z12;
        ?? r12;
        Object obj2;
        int i15 = o1Var.f5793f;
        View view = o1Var.f5789a;
        UsersSelectActivity usersSelectActivity = this.v;
        int i16 = 2;
        if (i15 != 1) {
            if (i15 != 2) {
                return;
            }
            org.telegram.ui.Cells.s3 s3Var = (org.telegram.ui.Cells.s3) view;
            if (i10 != 0 || usersSelectActivity.B) {
                s3Var.setText(LocaleController.getString(R.string.FilterChats));
                return;
            } else {
                s3Var.setText(LocaleController.getString(R.string.FilterChatTypes));
                return;
            }
        }
        ?? r10 = (org.telegram.ui.Cells.d4) view;
        if (this.f41095n) {
            int size2 = this.d.size();
            pf.j1 j1Var = this.f41094f;
            ArrayList arrayList2 = j1Var.f45839e;
            ArrayList arrayList3 = j1Var.d;
            int size3 = arrayList2.size();
            int size4 = arrayList3.size();
            if (i10 >= 0 && i10 < size2) {
                obj = this.d.get(i10);
            } else if (i10 < size2 || i10 >= size4 + size2) {
                obj = (i10 <= size2 + size4 || i10 >= (size3 + size2) + size4) ? null : j1Var.f45839e.get((i10 - size2) - size4);
            } else {
                obj = arrayList3.get(i10 - size2);
            }
            if (obj != null) {
                String publicUsername = obj instanceof TLRPC.User ? ((TLRPC.User) obj).username : ChatObject.getPublicUsername((TLRPC.Chat) obj);
                if (i10 < size2) {
                    charSequence = (CharSequence) this.f41093e.get(i10);
                    if (charSequence != null && !TextUtils.isEmpty(publicUsername)) {
                        if (charSequence.toString().startsWith("@" + publicUsername)) {
                            obj2 = charSequence;
                        }
                    }
                    spannableStringBuilder = 0;
                } else if (i10 > size2 && !TextUtils.isEmpty(publicUsername)) {
                    String strSubstring = j1Var.f45838c;
                    if (strSubstring.startsWith("@")) {
                        strSubstring = strSubstring.substring(1);
                    }
                    try {
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                        spannableStringBuilder3.append((CharSequence) "@");
                        spannableStringBuilder3.append((CharSequence) publicUsername);
                        int iIndexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(publicUsername, strSubstring);
                        if (iIndexOfIgnoreCase != -1) {
                            int length = strSubstring.length();
                            if (iIndexOfIgnoreCase == 0) {
                                length++;
                            } else {
                                iIndexOfIgnoreCase++;
                            }
                            spannableStringBuilder3.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q6, false)), iIndexOfIgnoreCase, length + iIndexOfIgnoreCase, 33);
                        }
                        obj2 = spannableStringBuilder3;
                    } catch (Exception unused) {
                        obj2 = publicUsername;
                    }
                }
                charSequence = null;
                spannableStringBuilder = obj2;
            }
            if (obj instanceof TLRPC.User) {
                j10 = ((TLRPC.User) obj).f22527id;
            } else if (obj instanceof TLRPC.Chat) {
                j10 = -((TLRPC.Chat) obj).f22380id;
            } else {
                j10 = 0;
            }
            i11 = usersSelectActivity.f36297x;
            if (i11 != 2) {
                j11 = 0;
                z11 = false;
                r12 = spannableStringBuilder;
                zCanUserDoAdminAction = true;
                r11 = r12;
            } else if (i11 == 0) {
                if (this.f41095n) {
                    j11 = 0;
                } else {
                    fontMetricsInt = r10.getStatusTextView().getPaint().getFontMetricsInt();
                    spannableStringBuilder = new SpannableStringBuilder();
                    arrayList = usersSelectActivity.getMessagesController().dialogFilters;
                    size = arrayList.size();
                    j11 = 0;
                    for (i13 = 0; i13 < size; i13++) {
                        dialogFilter = arrayList.get(i13);
                        if (!dialogFilter.includesDialog(usersSelectActivity.getAccountInstance(), j10)) {
                            if (spannableStringBuilder.length() > 0) {
                                spannableStringBuilder.append(", ");
                            }
                            spannableStringBuilder.append(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(new SpannableStringBuilder(dialogFilter.name), fontMetricsInt, false), dialogFilter.entities, fontMetricsInt));
                        }
                    }
                }
                z11 = false;
                r12 = spannableStringBuilder;
                zCanUserDoAdminAction = true;
                r11 = r12;
            } else {
                j11 = 0;
                if (usersSelectActivity.getMessagesController().dialogs_dict.f(j10) != null) {
                    i12 = ((TLRPC.Dialog) usersSelectActivity.getMessagesController().dialogs_dict.f(j10)).ttl_period;
                } else {
                    i12 = 0;
                }
                if (i12 > 0) {
                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                    spannableStringBuilder4.append((CharSequence) "d");
                    spannableStringBuilder4.setSpan(new org.telegram.ui.Components.cq(R.drawable.msg_mini_fireon, 0), 0, 1, 0);
                    spannableStringBuilder4.append((CharSequence) LocaleController.formatString(R.string.AutoDeleteAfter, LocaleController.formatTTLString(i12)).toLowerCase());
                    spannableStringBuilder2 = spannableStringBuilder4;
                    z10 = true;
                } else {
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                    spannableStringBuilder5.append((CharSequence) "d");
                    spannableStringBuilder5.setSpan(new org.telegram.ui.Components.cq(R.drawable.msg_mini_fireoff, 0), 0, 1, 0);
                    spannableStringBuilder5.append((CharSequence) LocaleController.getString(R.string.AutoDeleteDisabled));
                    spannableStringBuilder2 = spannableStringBuilder5;
                    z10 = false;
                }
                if (obj instanceof TLRPC.Chat) {
                    boolean z13 = z10;
                    zCanUserDoAdminAction = ChatObject.canUserDoAdminAction((TLRPC.Chat) obj, 13);
                    z11 = z13;
                } else {
                    z11 = z10;
                    r12 = spannableStringBuilder2;
                    zCanUserDoAdminAction = true;
                    r11 = r12;
                }
            }
            if (zCanUserDoAdminAction) {
                r11 = spannableStringBuilder2;
                r10.setAlpha(1.0f);
            } else {
                r11 = spannableStringBuilder2;
                r10.setAlpha(0.5f);
            }
            r10.d(obj, charSequence, r11);
            org.telegram.ui.ActionBar.h5 statusTextView = r10.getStatusTextView();
            if (z11) {
                i14 = org.telegram.ui.ActionBar.g6.f23234n6;
            } else {
                i14 = org.telegram.ui.ActionBar.g6.f23423y6;
            }
            statusTextView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
            if (j10 != j11) {
                if (usersSelectActivity.J.h(j10) >= 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                r10.c(z12, false);
                r10.setCheckBoxEnabled(true);
            }
        }
        int i17 = this.f41097s;
        if (i10 < i17) {
            String str = "non_contacts";
            if (usersSelectActivity.f36297x == 2) {
                if (i10 == 1) {
                    string = LocaleController.getString(R.string.FilterExistingChats);
                    str = "existing_chats";
                    i16 = 1;
                } else if (i10 == 2 && !usersSelectActivity.D) {
                    string = LocaleController.getString(R.string.FilterNewChats);
                    str = "new_chats";
                } else if (i10 == (!usersSelectActivity.D ? 1 : 0) + 2) {
                    string = LocaleController.getString(R.string.FilterContacts);
                    str = "contacts";
                    i16 = 4;
                } else {
                    string = LocaleController.getString(R.string.FilterNonContacts);
                    i16 = 8;
                }
            } else if (usersSelectActivity.E) {
                if (i10 == 1) {
                    string = LocaleController.getString(R.string.FilterContacts);
                    i16 = MessagesController.DIALOG_FILTER_FLAG_CONTACTS;
                    str = "contacts";
                } else if (i10 == 2) {
                    string = LocaleController.getString(R.string.FilterNonContacts);
                    i16 = MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS;
                } else if (i10 == 3) {
                    string = LocaleController.getString(R.string.FilterGroups);
                    i16 = MessagesController.DIALOG_FILTER_FLAG_GROUPS;
                    str = "groups";
                } else if (i10 == 4) {
                    string = LocaleController.getString(R.string.FilterChannels);
                    i16 = MessagesController.DIALOG_FILTER_FLAG_CHANNELS;
                    str = "channels";
                } else {
                    string = LocaleController.getString(R.string.FilterBots);
                    i16 = MessagesController.DIALOG_FILTER_FLAG_BOTS;
                    str = "bots";
                }
            } else if (i10 == 1) {
                string = LocaleController.getString(R.string.FilterMuted);
                i16 = MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED;
                str = "muted";
            } else if (i10 == 2) {
                string = LocaleController.getString(R.string.FilterRead);
                i16 = MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ;
                str = "read";
            } else {
                string = LocaleController.getString(R.string.FilterArchived);
                i16 = MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED;
                str = "archived";
            }
            r10.d(str, string, null);
            r10.c((usersSelectActivity.F & i16) == i16, false);
            r10.setCheckBoxEnabled(true);
            return;
        }
        obj = this.f41096r.get(i10 - i17);
        charSequence = null;
        spannableStringBuilder = 0;
        if (obj instanceof TLRPC.User) {
            j10 = ((TLRPC.User) obj).f22527id;
        } else if (obj instanceof TLRPC.Chat) {
            j10 = -((TLRPC.Chat) obj).f22380id;
        } else {
            j10 = 0;
        }
        i11 = usersSelectActivity.f36297x;
        if (i11 != 2) {
            j11 = 0;
            z11 = false;
            r12 = spannableStringBuilder;
            zCanUserDoAdminAction = true;
            r11 = r12;
        } else if (i11 == 0) {
            if (this.f41095n) {
                fontMetricsInt = r10.getStatusTextView().getPaint().getFontMetricsInt();
                spannableStringBuilder = new SpannableStringBuilder();
                arrayList = usersSelectActivity.getMessagesController().dialogFilters;
                size = arrayList.size();
                j11 = 0;
                while (i13 < size) {
                    dialogFilter = arrayList.get(i13);
                    if (!dialogFilter.includesDialog(usersSelectActivity.getAccountInstance(), j10)) {
                        if (spannableStringBuilder.length() > 0) {
                            spannableStringBuilder.append(", ");
                        }
                        spannableStringBuilder.append(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(new SpannableStringBuilder(dialogFilter.name), fontMetricsInt, false), dialogFilter.entities, fontMetricsInt));
                    }
                }
            } else {
                j11 = 0;
            }
            z11 = false;
            r12 = spannableStringBuilder;
            zCanUserDoAdminAction = true;
            r11 = r12;
        } else {
            j11 = 0;
            if (usersSelectActivity.getMessagesController().dialogs_dict.f(j10) != null) {
                i12 = ((TLRPC.Dialog) usersSelectActivity.getMessagesController().dialogs_dict.f(j10)).ttl_period;
            } else {
                i12 = 0;
            }
            if (i12 > 0) {
                SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder();
                spannableStringBuilder6.append((CharSequence) "d");
                spannableStringBuilder6.setSpan(new org.telegram.ui.Components.cq(R.drawable.msg_mini_fireon, 0), 0, 1, 0);
                spannableStringBuilder6.append((CharSequence) LocaleController.formatString(R.string.AutoDeleteAfter, LocaleController.formatTTLString(i12)).toLowerCase());
                spannableStringBuilder2 = spannableStringBuilder6;
                z10 = true;
            } else {
                SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder();
                spannableStringBuilder7.append((CharSequence) "d");
                spannableStringBuilder7.setSpan(new org.telegram.ui.Components.cq(R.drawable.msg_mini_fireoff, 0), 0, 1, 0);
                spannableStringBuilder7.append((CharSequence) LocaleController.getString(R.string.AutoDeleteDisabled));
                spannableStringBuilder2 = spannableStringBuilder7;
                z10 = false;
            }
            if (obj instanceof TLRPC.Chat) {
                boolean z14 = z10;
                zCanUserDoAdminAction = ChatObject.canUserDoAdminAction((TLRPC.Chat) obj, 13);
                z11 = z14;
            } else {
                z11 = z10;
                r12 = spannableStringBuilder2;
                zCanUserDoAdminAction = true;
                r11 = r12;
            }
        }
        if (zCanUserDoAdminAction) {
            r11 = spannableStringBuilder2;
            r10.setAlpha(1.0f);
        } else {
            r11 = spannableStringBuilder2;
            r10.setAlpha(0.5f);
        }
        r10.d(obj, charSequence, r11);
        org.telegram.ui.ActionBar.h5 statusTextView2 = r10.getStatusTextView();
        if (z11) {
            i14 = org.telegram.ui.ActionBar.g6.f23234n6;
        } else {
            i14 = org.telegram.ui.ActionBar.g6.f23423y6;
        }
        statusTextView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
        if (j10 != j11) {
            if (usersSelectActivity.J.h(j10) >= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            r10.c(z12, false);
            r10.setCheckBoxEnabled(true);
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        Context context = this.f41092c;
        return new org.telegram.ui.Components.lk0(i10 != 1 ? new org.telegram.ui.Cells.s3(context, null) : new org.telegram.ui.Cells.d4(context, 1, 0, true));
    }
}
