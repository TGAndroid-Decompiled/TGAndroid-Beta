package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class j60 extends org.telegram.ui.Components.ql0 {
    public int E;
    public int F;
    public int G;
    public int H;
    public final l60 I;
    public final Context f38168c;
    public final hg.a2 f38169f;
    public Runnable h;
    public boolean f38170n;
    public int f38172s;
    public int v;
    public int f38173w;
    public int f38174x;
    public int f38175y;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public final ArrayList f38171r = new ArrayList();

    public j60(l60 l60Var, Context context) {
        TLRPC.Chat chat;
        String substring;
        String substring2;
        TLRPC.User user;
        this.I = l60Var;
        this.f38168c = context;
        HashSet hashSet = new HashSet();
        ContactsController contactsController = l60Var.getContactsController();
        boolean z10 = l60Var.Q;
        ArrayList<TLRPC.TL_contact> arrayList = contactsController.contacts;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.User user2 = l60Var.getMessagesController().getUser(Long.valueOf(arrayList.get(i10).user_id));
            if (user2 != null && !user2.self && !user2.deleted) {
                this.f38171r.add(user2);
                hashSet.add(Long.valueOf(user2.f20422id));
            }
        }
        if (l60Var.P || l60Var.O || z10) {
            ArrayList<TLRPC.Dialog> allDialogs = l60Var.getMessagesController().getAllDialogs();
            if (z10) {
                int size = allDialogs.size();
                for (int i11 = 0; i11 < size; i11++) {
                    TLRPC.Dialog dialog = allDialogs.get(i11);
                    if (DialogObject.isUserDialog(dialog.f20279id) && !hashSet.contains(Long.valueOf(dialog.f20279id)) && (user = l60Var.getMessagesController().getUser(Long.valueOf(dialog.f20279id))) != null && !UserObject.isDeleted(user) && !UserObject.isUserSelf(user) && !UserObject.isBot(user) && !UserObject.isService(dialog.f20279id) && !MessagesController.isSupportUser(user)) {
                        this.f38171r.add(user);
                        hashSet.add(Long.valueOf(user.f20422id));
                    }
                }
            } else {
                int size2 = allDialogs.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    TLRPC.Dialog dialog2 = allDialogs.get(i12);
                    if (DialogObject.isChatDialog(dialog2.f20279id) && (chat = l60Var.getMessagesController().getChat(Long.valueOf(-dialog2.f20279id))) != null && chat.migrated_to == null && (!ChatObject.isChannel(chat) || chat.megagroup)) {
                        this.f38171r.add(chat);
                    }
                }
            }
            Collections.sort(this.f38171r, new Object());
            TLObject tLObject = null;
            int i13 = 0;
            while (i13 < this.f38171r.size()) {
                TLObject tLObject2 = (TLObject) this.f38171r.get(i13);
                if (tLObject != null) {
                    String a2 = f60.a(tLObject);
                    if (TextUtils.isEmpty(a2)) {
                        substring = "";
                    } else {
                        substring = a2.substring(0, 1);
                    }
                    String a10 = f60.a(tLObject2);
                    if (TextUtils.isEmpty(a10)) {
                        substring2 = "";
                    } else {
                        substring2 = a10.substring(0, 1);
                    }
                    if (substring.equals(substring2)) {
                        i13++;
                        tLObject = tLObject2;
                    }
                }
                ArrayList arrayList2 = this.f38171r;
                String a11 = f60.a(tLObject2);
                arrayList2.add(i13, new k60(TextUtils.isEmpty(a11) ? "" : a11.substring(0, 1)));
                i13++;
                tLObject = tLObject2;
            }
        }
        hg.a2 a2Var = new hg.a2(false);
        this.f38169f = a2Var;
        a2Var.f11794a = new ut(this, 11);
    }

    @Override
    public final void A(s4.b1 b1Var) {
        View view = b1Var.f45910a;
        if (view instanceof org.telegram.ui.Cells.f4) {
            ((org.telegram.ui.Cells.f4) view).f22235a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f45913f != 0) {
            l60 l60Var = this.I;
            if (l60Var.J != null) {
                View view = b1Var.f45910a;
                if (view instanceof org.telegram.ui.Cells.f4) {
                    Object object = ((org.telegram.ui.Cells.f4) view).getObject();
                    if ((object instanceof TLRPC.User) && l60Var.J.h(((TLRPC.User) object).f20422id) >= 0) {
                        return false;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    @Override
    public final String F(int i10) {
        String str;
        String str2;
        if (!this.f38170n && i10 >= this.E) {
            ArrayList arrayList = this.f38171r;
            int size = arrayList.size();
            int i11 = this.E;
            if (i10 < size + i11) {
                TLObject tLObject = (TLObject) arrayList.get(i10 - i11);
                if (tLObject instanceof k60) {
                    return ((k60) tLObject).f38420a;
                }
                if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    str = user.first_name;
                    str2 = user.last_name;
                } else {
                    str = ((TLRPC.Chat) tLObject).title;
                    str2 = "";
                }
                if (LocaleController.nameDisplayOrder == 1) {
                    if (!TextUtils.isEmpty(str)) {
                        return str.substring(0, 1).toUpperCase();
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        return str2.substring(0, 1).toUpperCase();
                    }
                } else if (!TextUtils.isEmpty(str2)) {
                    return str2.substring(0, 1).toUpperCase();
                } else {
                    if (!TextUtils.isEmpty(str)) {
                        return str.substring(0, 1).toUpperCase();
                    }
                }
                return "";
            }
            return null;
        }
        return null;
    }

    @Override
    public final void G(org.telegram.ui.Components.im0 im0Var, float f7, int[] iArr) {
        iArr[0] = (int) (h() * f7);
        iArr[1] = 0;
    }

    public final void L(String str) {
        boolean z10;
        if (this.h != null) {
            Utilities.searchQueue.cancelRunnable(this.h);
            this.h = null;
        }
        this.d.clear();
        this.e.clear();
        this.f38169f.f(null, null);
        hg.a2 a2Var = this.f38169f;
        l60 l60Var = this.I;
        if (!l60Var.O && !l60Var.P) {
            z10 = false;
        } else {
            z10 = true;
        }
        a2Var.g(null, true, z10, false, false, 0L, false, 0, 0);
        l();
        if (!TextUtils.isEmpty(str)) {
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            i60 i60Var = new i60(this, str, 0);
            this.h = i60Var;
            dispatchQueue.postRunnable(i60Var, 300L);
        }
    }

    @Override
    public final int h() {
        int i10;
        int i11;
        l60 l60Var = this.I;
        long j10 = l60Var.H;
        long j11 = l60Var.G;
        this.G = -1;
        this.f38172s = -1;
        this.f38173w = -1;
        this.v = -1;
        this.f38174x = -1;
        this.f38175y = -1;
        if (this.f38170n) {
            int size = this.d.size();
            hg.a2 a2Var = this.f38169f;
            int size2 = a2Var.d.size();
            int size3 = a2Var.e.size();
            int i12 = size + size2;
            if (size3 != 0) {
                i12 += size3 + 1;
            }
            this.H = i12;
            return i12;
        }
        if (l60Var.Q) {
            this.f38173w = 0;
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (l60Var.V) {
            int i13 = i10 + 1;
            this.v = i10;
            this.f38172s = i10;
            i10 += 2;
            this.f38174x = i13;
        } else if (l60Var.W) {
            int i14 = i10 + 1;
            this.v = i10;
            this.f38172s = i10;
            i10 += 2;
            this.f38175y = i14;
        } else {
            this.v = i10;
        }
        this.E = i10;
        int size4 = this.f38171r.size() + i10;
        if (l60Var.R) {
            if (j11 != 0) {
                this.F = ChatObject.canUserDoAdminAction(l60Var.getMessagesController().getChat(Long.valueOf(j11)), 3) ? 1 : 0;
            } else if (j10 != 0) {
                TLRPC.Chat chat = l60Var.getMessagesController().getChat(Long.valueOf(j10));
                if (ChatObject.canUserDoAdminAction(chat, 3) && !ChatObject.isPublic(chat)) {
                    i11 = 2;
                } else {
                    i11 = 0;
                }
                this.F = i11;
            } else {
                this.F = 0;
            }
            if (this.F != 0) {
                this.E++;
                size4++;
            }
        }
        if (size4 == 0) {
            this.G = 0;
            size4++;
        }
        this.H = size4;
        return size4;
    }

    @Override
    public final int j(int i10) {
        if (this.f38170n) {
            if (i10 == this.f38169f.d.size() + this.d.size()) {
                return 0;
            }
            return 1;
        } else if (i10 != this.f38173w) {
            if (i10 != this.f38172s) {
                if (i10 != this.f38174x && i10 != this.f38175y) {
                    if (this.F != 0 && i10 == 0) {
                        return 2;
                    }
                    if (this.G == i10) {
                        return 3;
                    }
                    int i11 = i10 - this.E;
                    if (i11 >= 0) {
                        ArrayList arrayList = this.f38171r;
                        if (i11 < arrayList.size() && (arrayList.get(i10 - this.E) instanceof k60)) {
                            return 0;
                        }
                        return 1;
                    }
                    return 1;
                }
                return 1;
            }
            return 0;
        } else {
            return 2;
        }
    }

    @Override
    public final void l() {
        super.l();
        this.I.r0();
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        String string;
        TLObject tLObject;
        SpannableStringBuilder spannableStringBuilder;
        long j10;
        boolean z10;
        CharSequence charSequence;
        String publicUsername;
        int i11 = b1Var.f45913f;
        View view = b1Var.f45910a;
        ArrayList arrayList = this.f38171r;
        l60 l60Var = this.I;
        if (i11 != 0) {
            boolean z11 = true;
            if (i11 != 1) {
                if (i11 == 2) {
                    org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                    if (i10 == this.f38173w) {
                        q8Var.m(R.drawable.menu_link_create2, LocaleController.getString(R.string.GroupCallCreateLink), false);
                        q8Var.e(org.telegram.ui.ActionBar.h6.f21322v6, org.telegram.ui.ActionBar.h6.f21305u6);
                        return;
                    } else if (this.F == 2) {
                        q8Var.m(R.drawable.msg_link2, LocaleController.getString(R.string.ChannelInviteViaLink), false);
                        q8Var.e(org.telegram.ui.ActionBar.h6.f21152m6, org.telegram.ui.ActionBar.h6.G6);
                        return;
                    } else {
                        q8Var.m(R.drawable.msg_link2, LocaleController.getString(R.string.InviteToGroupByLink), false);
                        q8Var.e(org.telegram.ui.ActionBar.h6.f21152m6, org.telegram.ui.ActionBar.h6.G6);
                        return;
                    }
                }
                return;
            }
            org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
            SpannableStringBuilder spannableStringBuilder2 = null;
            if (this.f38170n) {
                int size = this.d.size();
                hg.a2 a2Var = this.f38169f;
                ArrayList arrayList2 = a2Var.e;
                ArrayList arrayList3 = a2Var.d;
                int size2 = arrayList2.size();
                int size3 = arrayList3.size();
                if (i10 >= 0 && i10 < size) {
                    tLObject = (TLObject) this.d.get(i10);
                } else if (i10 >= size && i10 < size3 + size) {
                    tLObject = (TLObject) arrayList3.get(i10 - size);
                } else if (i10 > size + size3 && i10 <= size2 + size + size3) {
                    tLObject = (TLObject) a2Var.e.get(((i10 - size) - size3) - 1);
                } else {
                    tLObject = null;
                }
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.User) {
                        publicUsername = ((TLRPC.User) tLObject).username;
                    } else if (tLObject instanceof TLRPC.Chat) {
                        publicUsername = ChatObject.getPublicUsername((TLRPC.Chat) tLObject);
                    } else {
                        return;
                    }
                    if (i10 < size) {
                        charSequence = (CharSequence) this.e.get(i10);
                        if (charSequence != null && !TextUtils.isEmpty(publicUsername)) {
                            if (charSequence.toString().startsWith("@" + publicUsername)) {
                                spannableStringBuilder2 = charSequence;
                                charSequence = null;
                            }
                        }
                    } else if (i10 > size && !TextUtils.isEmpty(publicUsername)) {
                        String str = a2Var.f11796c;
                        if (str.startsWith("@")) {
                            str = str.substring(1);
                        }
                        try {
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                            spannableStringBuilder3.append((CharSequence) "@");
                            spannableStringBuilder3.append((CharSequence) publicUsername);
                            int indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(publicUsername, str);
                            if (indexOfIgnoreCase != -1) {
                                int length = str.length();
                                if (indexOfIgnoreCase == 0) {
                                    length++;
                                } else {
                                    indexOfIgnoreCase++;
                                }
                                spannableStringBuilder3.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q6, false)), indexOfIgnoreCase, length + indexOfIgnoreCase, 33);
                            }
                            charSequence = null;
                            spannableStringBuilder2 = spannableStringBuilder3;
                        } catch (Exception unused) {
                            charSequence = null;
                            spannableStringBuilder2 = publicUsername;
                        }
                    }
                    SpannableStringBuilder spannableStringBuilder4 = spannableStringBuilder2;
                    spannableStringBuilder2 = charSequence;
                    spannableStringBuilder = spannableStringBuilder4;
                }
                charSequence = null;
                SpannableStringBuilder spannableStringBuilder42 = spannableStringBuilder2;
                spannableStringBuilder2 = charSequence;
                spannableStringBuilder = spannableStringBuilder42;
            } else if (i10 == this.f38174x) {
                f4Var.f22240r = true;
                f4Var.f22238f = "premium";
                f4Var.f22235a.setImageDrawable(org.telegram.ui.Cells.f4.b(f4Var.getContext(), false));
                f4Var.f22236b.l(LocaleController.getString(R.string.PrivacyPremium), false);
                org.telegram.ui.ActionBar.j5 j5Var = f4Var.f22237c;
                int i12 = org.telegram.ui.ActionBar.h6.f21377y6;
                j5Var.setTag(Integer.valueOf(i12));
                if (f4Var.K) {
                    i12 = org.telegram.ui.ActionBar.h6.f21200og;
                }
                j5Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i12, f4Var.M));
                j5Var.setEmojiColor(j5Var.getTextColor());
                j5Var.l(LocaleController.getString(R.string.PrivacyPremiumText), false);
                if (l60Var.X == null) {
                    z11 = false;
                }
                f4Var.c(z11, false);
                return;
            } else if (i10 == this.f38175y) {
                f4Var.f22241s = true;
                f4Var.f22238f = "miniapps";
                org.telegram.ui.Components.w9 w9Var = f4Var.f22235a;
                f4Var.getContext();
                w9Var.setImageDrawable(org.telegram.ui.Cells.f4.a(false));
                f4Var.f22236b.l(LocaleController.getString(R.string.PrivacyMiniapps), false);
                org.telegram.ui.ActionBar.j5 j5Var2 = f4Var.f22237c;
                int i13 = org.telegram.ui.ActionBar.h6.f21377y6;
                j5Var2.setTag(Integer.valueOf(i13));
                if (f4Var.K) {
                    i13 = org.telegram.ui.ActionBar.h6.f21200og;
                }
                j5Var2.setTextColor(org.telegram.ui.ActionBar.h6.w0(i13, f4Var.M));
                j5Var2.setEmojiColor(j5Var2.getTextColor());
                j5Var2.l(LocaleController.getString(R.string.PrivacyMiniappsText), false);
                if (l60Var.Y == null) {
                    z11 = false;
                }
                f4Var.c(z11, false);
                return;
            } else {
                tLObject = (TLObject) arrayList.get(i10 - this.E);
                spannableStringBuilder = null;
            }
            f4Var.d(tLObject, spannableStringBuilder2, spannableStringBuilder);
            if (tLObject instanceof TLRPC.User) {
                j10 = ((TLRPC.User) tLObject).f20422id;
            } else if (tLObject instanceof TLRPC.Chat) {
                j10 = -((TLRPC.Chat) tLObject).f20275id;
            } else {
                j10 = 0;
            }
            if (j10 != 0) {
                a0.h hVar = l60Var.J;
                if (hVar != null && hVar.h(j10) >= 0) {
                    f4Var.c(true, false);
                    f4Var.setCheckBoxEnabled(false);
                    return;
                }
                if (l60Var.Z.h(j10) >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                f4Var.c(z10, false);
                f4Var.setCheckBoxEnabled(true);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view;
        if (this.f38170n) {
            u3Var.setText(LocaleController.getString(R.string.GlobalSearch));
        } else if (i10 == this.f38172s) {
            u3Var.setText(LocaleController.getString(R.string.PrivacyUserTypes));
        } else {
            int i14 = i10 - this.E;
            if (i14 >= 0 && i14 < arrayList.size()) {
                TLObject tLObject2 = (TLObject) arrayList.get(i10 - this.E);
                if (tLObject2 instanceof k60) {
                    u3Var.setText(((k60) tLObject2).f38420a.toUpperCase());
                }
            }
        }
        if (i10 == this.v) {
            if (l60Var.X == null && l60Var.Z.i()) {
                string = "";
            } else {
                string = LocaleController.getString(R.string.DeselectAll);
            }
            u3Var.b(string, new s50(this, 2));
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View u3Var;
        Context context = this.f38168c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    u3Var = new org.telegram.ui.Cells.q8(context);
                } else {
                    org.telegram.ui.Components.o70 o70Var = new org.telegram.ui.Components.o70(context, null, 0, null, 1);
                    o70Var.setLayoutParams(new s4.o0(-1, -1));
                    o70Var.e.setVisibility(8);
                    o70Var.d.setText(LocaleController.getString(R.string.NoContacts));
                    o70Var.setAnimateLayoutChange(true);
                    u3Var = o70Var;
                }
            } else {
                u3Var = new org.telegram.ui.Cells.f4(context, 1, 0, false);
            }
        } else {
            u3Var = new org.telegram.ui.Cells.u3(context, null);
        }
        return new s4.b1(u3Var);
    }
}
