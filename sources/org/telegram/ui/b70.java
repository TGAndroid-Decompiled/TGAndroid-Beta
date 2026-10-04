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
public final class b70 extends org.telegram.ui.Components.gl0 {
    public int E;
    public int F;
    public int G;
    public int H;
    public final d70 I;
    public final Context f35013c;
    public final gg.c2 f35015f;
    public Runnable h;
    public boolean f35016n;
    public int f35018s;
    public int v;
    public int f35019w;
    public int f35020x;
    public int f35021y;
    public ArrayList d = new ArrayList();
    public ArrayList f35014e = new ArrayList();
    public final ArrayList f35017r = new ArrayList();

    public b70(d70 d70Var, Context context) {
        TLRPC.Chat chat;
        String substring;
        String substring2;
        TLRPC.User user;
        this.I = d70Var;
        this.f35013c = context;
        HashSet hashSet = new HashSet();
        ContactsController contactsController = d70Var.getContactsController();
        boolean z10 = d70Var.Q;
        ArrayList<TLRPC.TL_contact> arrayList = contactsController.contacts;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.User user2 = d70Var.getMessagesController().getUser(Long.valueOf(arrayList.get(i10).user_id));
            if (user2 != null && !user2.self && !user2.deleted) {
                this.f35017r.add(user2);
                hashSet.add(Long.valueOf(user2.f20185id));
            }
        }
        if (d70Var.P || d70Var.O || z10) {
            ArrayList<TLRPC.Dialog> allDialogs = d70Var.getMessagesController().getAllDialogs();
            if (z10) {
                int size = allDialogs.size();
                for (int i11 = 0; i11 < size; i11++) {
                    TLRPC.Dialog dialog = allDialogs.get(i11);
                    if (DialogObject.isUserDialog(dialog.f20042id) && !hashSet.contains(Long.valueOf(dialog.f20042id)) && (user = d70Var.getMessagesController().getUser(Long.valueOf(dialog.f20042id))) != null && !UserObject.isDeleted(user) && !UserObject.isUserSelf(user) && !UserObject.isBot(user) && !UserObject.isService(dialog.f20042id) && !MessagesController.isSupportUser(user)) {
                        this.f35017r.add(user);
                        hashSet.add(Long.valueOf(user.f20185id));
                    }
                }
            } else {
                int size2 = allDialogs.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    TLRPC.Dialog dialog2 = allDialogs.get(i12);
                    if (DialogObject.isChatDialog(dialog2.f20042id) && (chat = d70Var.getMessagesController().getChat(Long.valueOf(-dialog2.f20042id))) != null && chat.migrated_to == null && (!ChatObject.isChannel(chat) || chat.megagroup)) {
                        this.f35017r.add(chat);
                    }
                }
            }
            Collections.sort(this.f35017r, new Object());
            TLObject tLObject = null;
            int i13 = 0;
            while (i13 < this.f35017r.size()) {
                TLObject tLObject2 = (TLObject) this.f35017r.get(i13);
                if (tLObject != null) {
                    String a2 = x60.a(tLObject);
                    if (TextUtils.isEmpty(a2)) {
                        substring = "";
                    } else {
                        substring = a2.substring(0, 1);
                    }
                    String a10 = x60.a(tLObject2);
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
                ArrayList arrayList2 = this.f35017r;
                String a11 = x60.a(tLObject2);
                arrayList2.add(i13, new c70(TextUtils.isEmpty(a11) ? "" : a11.substring(0, 1)));
                i13++;
                tLObject = tLObject2;
            }
        }
        gg.c2 c2Var = new gg.c2(false);
        this.f35015f = c2Var;
        c2Var.f10531a = new bu(this, 12);
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f46524a;
        if (view instanceof org.telegram.ui.Cells.g4) {
            ((org.telegram.ui.Cells.g4) view).f22136a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f46528f != 0) {
            d70 d70Var = this.I;
            if (d70Var.J != null) {
                View view = c1Var.f46524a;
                if (view instanceof org.telegram.ui.Cells.g4) {
                    Object object = ((org.telegram.ui.Cells.g4) view).getObject();
                    if ((object instanceof TLRPC.User) && d70Var.J.h(((TLRPC.User) object).f20185id) >= 0) {
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
        if (!this.f35016n && i10 >= this.E) {
            ArrayList arrayList = this.f35017r;
            int size = arrayList.size();
            int i11 = this.E;
            if (i10 < size + i11) {
                TLObject tLObject = (TLObject) arrayList.get(i10 - i11);
                if (tLObject instanceof c70) {
                    return ((c70) tLObject).f35293a;
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
    public final void G(org.telegram.ui.Components.zl0 zl0Var, float f7, int[] iArr) {
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
        this.f35014e.clear();
        this.f35015f.f(null, null);
        gg.c2 c2Var = this.f35015f;
        d70 d70Var = this.I;
        if (!d70Var.O && !d70Var.P) {
            z10 = false;
        } else {
            z10 = true;
        }
        c2Var.g(null, true, z10, false, false, 0L, false, 0, 0);
        l();
        if (!TextUtils.isEmpty(str)) {
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            a70 a70Var = new a70(this, str, 0);
            this.h = a70Var;
            dispatchQueue.postRunnable(a70Var, 300L);
        }
    }

    @Override
    public final int h() {
        int i10;
        int i11;
        d70 d70Var = this.I;
        long j3 = d70Var.H;
        long j10 = d70Var.G;
        this.G = -1;
        this.f35018s = -1;
        this.f35019w = -1;
        this.v = -1;
        this.f35020x = -1;
        this.f35021y = -1;
        if (this.f35016n) {
            int size = this.d.size();
            gg.c2 c2Var = this.f35015f;
            int size2 = c2Var.d.size();
            int size3 = c2Var.f10534e.size();
            int i12 = size + size2;
            if (size3 != 0) {
                i12 += size3 + 1;
            }
            this.H = i12;
            return i12;
        }
        if (d70Var.Q) {
            this.f35019w = 0;
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (d70Var.V) {
            int i13 = i10 + 1;
            this.v = i10;
            this.f35018s = i10;
            i10 += 2;
            this.f35020x = i13;
        } else if (d70Var.W) {
            int i14 = i10 + 1;
            this.v = i10;
            this.f35018s = i10;
            i10 += 2;
            this.f35021y = i14;
        } else {
            this.v = i10;
        }
        this.E = i10;
        int size4 = this.f35017r.size() + i10;
        if (d70Var.R) {
            if (j10 != 0) {
                this.F = ChatObject.canUserDoAdminAction(d70Var.getMessagesController().getChat(Long.valueOf(j10)), 3) ? 1 : 0;
            } else if (j3 != 0) {
                TLRPC.Chat chat = d70Var.getMessagesController().getChat(Long.valueOf(j3));
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
        if (this.f35016n) {
            if (i10 == this.f35015f.d.size() + this.d.size()) {
                return 0;
            }
            return 1;
        } else if (i10 != this.f35019w) {
            if (i10 != this.f35018s) {
                if (i10 != this.f35020x && i10 != this.f35021y) {
                    if (this.F != 0 && i10 == 0) {
                        return 2;
                    }
                    if (this.G == i10) {
                        return 3;
                    }
                    int i11 = i10 - this.E;
                    if (i11 >= 0) {
                        ArrayList arrayList = this.f35017r;
                        if (i11 < arrayList.size() && (arrayList.get(i10 - this.E) instanceof c70)) {
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
    public final void v(s4.c1 c1Var, int i10) {
        String string;
        TLObject tLObject;
        SpannableStringBuilder spannableStringBuilder;
        long j3;
        boolean z10;
        CharSequence charSequence;
        String publicUsername;
        int i11 = c1Var.f46528f;
        View view = c1Var.f46524a;
        ArrayList arrayList = this.f35017r;
        d70 d70Var = this.I;
        if (i11 != 0) {
            boolean z11 = true;
            if (i11 != 1) {
                if (i11 == 2) {
                    org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                    if (i10 == this.f35019w) {
                        r8Var.m(R.drawable.menu_link_create2, LocaleController.getString(R.string.GroupCallCreateLink), false);
                        r8Var.e(org.telegram.ui.ActionBar.i6.f21153v6, org.telegram.ui.ActionBar.i6.f21135u6);
                        return;
                    } else if (this.F == 2) {
                        r8Var.m(R.drawable.msg_link2, LocaleController.getString(R.string.ChannelInviteViaLink), false);
                        r8Var.e(org.telegram.ui.ActionBar.i6.f20984m6, org.telegram.ui.ActionBar.i6.G6);
                        return;
                    } else {
                        r8Var.m(R.drawable.msg_link2, LocaleController.getString(R.string.InviteToGroupByLink), false);
                        r8Var.e(org.telegram.ui.ActionBar.i6.f20984m6, org.telegram.ui.ActionBar.i6.G6);
                        return;
                    }
                }
                return;
            }
            org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
            SpannableStringBuilder spannableStringBuilder2 = null;
            if (this.f35016n) {
                int size = this.d.size();
                gg.c2 c2Var = this.f35015f;
                ArrayList arrayList2 = c2Var.f10534e;
                ArrayList arrayList3 = c2Var.d;
                int size2 = arrayList2.size();
                int size3 = arrayList3.size();
                if (i10 >= 0 && i10 < size) {
                    tLObject = (TLObject) this.d.get(i10);
                } else if (i10 >= size && i10 < size3 + size) {
                    tLObject = (TLObject) arrayList3.get(i10 - size);
                } else if (i10 > size + size3 && i10 <= size2 + size + size3) {
                    tLObject = (TLObject) c2Var.f10534e.get(((i10 - size) - size3) - 1);
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
                        charSequence = (CharSequence) this.f35014e.get(i10);
                        if (charSequence != null && !TextUtils.isEmpty(publicUsername)) {
                            if (charSequence.toString().startsWith("@" + publicUsername)) {
                                spannableStringBuilder2 = charSequence;
                                charSequence = null;
                            }
                        }
                    } else if (i10 > size && !TextUtils.isEmpty(publicUsername)) {
                        String str = c2Var.f10533c;
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
                                spannableStringBuilder3.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.q6, false)), indexOfIgnoreCase, length + indexOfIgnoreCase, 33);
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
            } else if (i10 == this.f35020x) {
                g4Var.f22142r = true;
                g4Var.f22140f = "premium";
                g4Var.f22136a.setImageDrawable(org.telegram.ui.Cells.g4.b(g4Var.getContext(), false));
                g4Var.f22137b.l(LocaleController.getString(R.string.PrivacyPremium), false);
                org.telegram.ui.ActionBar.i5 i5Var = g4Var.f22138c;
                int i12 = org.telegram.ui.ActionBar.i6.f21205y6;
                i5Var.setTag(Integer.valueOf(i12));
                if (g4Var.K) {
                    i12 = org.telegram.ui.ActionBar.i6.f21030og;
                }
                i5Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(i12, g4Var.M));
                i5Var.setEmojiColor(i5Var.getTextColor());
                i5Var.l(LocaleController.getString(R.string.PrivacyPremiumText), false);
                if (d70Var.X == null) {
                    z11 = false;
                }
                g4Var.c(z11, false);
                return;
            } else if (i10 == this.f35021y) {
                g4Var.f22143s = true;
                g4Var.f22140f = "miniapps";
                org.telegram.ui.Components.w9 w9Var = g4Var.f22136a;
                g4Var.getContext();
                w9Var.setImageDrawable(org.telegram.ui.Cells.g4.a(false));
                g4Var.f22137b.l(LocaleController.getString(R.string.PrivacyMiniapps), false);
                org.telegram.ui.ActionBar.i5 i5Var2 = g4Var.f22138c;
                int i13 = org.telegram.ui.ActionBar.i6.f21205y6;
                i5Var2.setTag(Integer.valueOf(i13));
                if (g4Var.K) {
                    i13 = org.telegram.ui.ActionBar.i6.f21030og;
                }
                i5Var2.setTextColor(org.telegram.ui.ActionBar.i6.v0(i13, g4Var.M));
                i5Var2.setEmojiColor(i5Var2.getTextColor());
                i5Var2.l(LocaleController.getString(R.string.PrivacyMiniappsText), false);
                if (d70Var.Y == null) {
                    z11 = false;
                }
                g4Var.c(z11, false);
                return;
            } else {
                tLObject = (TLObject) arrayList.get(i10 - this.E);
                spannableStringBuilder = null;
            }
            g4Var.d(tLObject, spannableStringBuilder2, spannableStringBuilder);
            if (tLObject instanceof TLRPC.User) {
                j3 = ((TLRPC.User) tLObject).f20185id;
            } else if (tLObject instanceof TLRPC.Chat) {
                j3 = -((TLRPC.Chat) tLObject).f20038id;
            } else {
                j3 = 0;
            }
            if (j3 != 0) {
                a0.i iVar = d70Var.J;
                if (iVar != null && iVar.h(j3) >= 0) {
                    g4Var.c(true, false);
                    g4Var.setCheckBoxEnabled(false);
                    return;
                }
                if (d70Var.Z.h(j3) >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                g4Var.c(z10, false);
                g4Var.setCheckBoxEnabled(true);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view;
        if (this.f35016n) {
            v3Var.setText(LocaleController.getString(R.string.GlobalSearch));
        } else if (i10 == this.f35018s) {
            v3Var.setText(LocaleController.getString(R.string.PrivacyUserTypes));
        } else {
            int i14 = i10 - this.E;
            if (i14 >= 0 && i14 < arrayList.size()) {
                TLObject tLObject2 = (TLObject) arrayList.get(i10 - this.E);
                if (tLObject2 instanceof c70) {
                    v3Var.setText(((c70) tLObject2).f35293a.toUpperCase());
                }
            }
        }
        if (i10 == this.v) {
            if (d70Var.X == null && d70Var.Z.i()) {
                string = "";
            } else {
                string = LocaleController.getString(R.string.DeselectAll);
            }
            v3Var.b(string, new j60(this, 2));
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View v3Var;
        Context context = this.f35013c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    v3Var = new org.telegram.ui.Cells.r8(context);
                } else {
                    org.telegram.ui.Components.i70 i70Var = new org.telegram.ui.Components.i70(context, null, 0, null, 1);
                    i70Var.setLayoutParams(new s4.p0(-1, -1));
                    i70Var.f31195e.setVisibility(8);
                    i70Var.d.setText(LocaleController.getString(R.string.NoContacts));
                    i70Var.setAnimateLayoutChange(true);
                    v3Var = i70Var;
                }
            } else {
                v3Var = new org.telegram.ui.Cells.g4(context, 1, 0, false);
            }
        } else {
            v3Var = new org.telegram.ui.Cells.v3(context, null);
        }
        return new s4.c1(v3Var);
    }
}
