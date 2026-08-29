package org.telegram.ui;

import android.content.ContentProviderOperation;
import android.content.Context;
import android.content.OperationApplicationException;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.provider.ContactsContract;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgressView;
public final class kj0 extends org.telegram.ui.ActionBar.f3 implements AdapterView.OnItemSelectedListener {
    public static final int Z = 0;
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public String E;
    public boolean F;
    public String G;
    public String H;
    public final org.telegram.ui.ActionBar.o2 I;
    public final int J;
    public final ij0 K;
    public final View L;
    public final ij0 M;
    public final ImageView N;
    public final org.telegram.ui.Components.hp O;
    public final TextView P;
    public final LinearLayout Q;
    public int R;
    public final hj0 S;
    public final TextView T;
    public final RadialProgressView U;
    public final FrameLayout V;
    public final TextView W;
    public String X;
    public int Y;
    public final LinearLayout f39906b;
    public final org.telegram.ui.Components.nq f39907c;
    public final org.telegram.ui.Components.tc0 d;
    public final org.telegram.ui.Components.tc0 f39908e;
    public final FrameLayout f39909f;
    public final View h;
    public final nh.d f39910n;
    public final org.telegram.ui.Components.tc0 f39911r;
    public final org.telegram.ui.Components.uc0 f39912s;
    public final org.telegram.ui.Components.y80 v;
    public final ArrayList f39913w;
    public final HashMap f39914x;
    public final HashMap f39915y;

    public kj0(android.content.Context r25, org.telegram.ui.ActionBar.o2 r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kj0.<init>(android.content.Context, org.telegram.ui.ActionBar.o2):void");
    }

    public static void m(kj0 kj0Var, TLObject tLObject, tm tmVar) {
        TLRPC.User user;
        if (tLObject instanceof TLRPC.TL_contacts_resolvedPeer) {
            TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
            MessagesController.getInstance(kj0Var.currentAccount).putUsers(tL_contacts_resolvedPeer.users, false);
            MessagesController.getInstance(kj0Var.currentAccount).putChats(tL_contacts_resolvedPeer.chats, false);
            long peerDialogId = DialogObject.getPeerDialogId(tL_contacts_resolvedPeer.peer);
            if (peerDialogId >= 0) {
                user = MessagesController.getInstance(kj0Var.currentAccount).getUser(Long.valueOf(peerDialogId));
                tmVar.run(user);
            }
        }
        user = null;
        tmVar.run(user);
    }

    public static void n(kj0 kj0Var, TLRPC.TL_contacts_importedContacts tL_contacts_importedContacts, TLRPC.TL_inputPhoneContact tL_inputPhoneContact, TLRPC.TL_error tL_error, TLRPC.TL_contacts_importContacts tL_contacts_importContacts) {
        org.telegram.ui.ActionBar.o2 o2Var = kj0Var.I;
        kj0Var.D = false;
        if (tL_contacts_importedContacts != null) {
            if (!tL_contacts_importedContacts.users.isEmpty()) {
                MessagesController.getInstance(kj0Var.currentAccount).putUsers(tL_contacts_importedContacts.users, false);
                MessagesController.getInstance(kj0Var.currentAccount).openChatOrProfileWith(tL_contacts_importedContacts.users.get(0), null, kj0Var.I, 1, false);
                kj0Var.dismiss();
                return;
            } else if (o2Var.getParentActivity() == null) {
                return;
            } else {
                AndroidUtilities.updateViewVisibilityAnimated(kj0Var.T, true, 0.5f, true);
                AndroidUtilities.updateViewVisibilityAnimated(kj0Var.U, false, 0.5f, true);
                org.telegram.ui.Components.c5.v(o2Var, tL_inputPhoneContact.first_name, tL_inputPhoneContact.last_name, tL_inputPhoneContact.phone);
                return;
            }
        }
        AndroidUtilities.updateViewVisibilityAnimated(kj0Var.T, true, 0.5f, true);
        AndroidUtilities.updateViewVisibilityAnimated(kj0Var.U, false, 0.5f, true);
        org.telegram.ui.Components.c5.f0(kj0Var.currentAccount, tL_error, o2Var, tL_contacts_importContacts, new Object[0]);
    }

    public static void q(kj0 kj0Var) {
        String replaceAll = (kj0Var.K.getText().toString() + kj0Var.M.getText().toString()).replaceAll("[^\\d]+", "");
        boolean z10 = false;
        for (int min = Math.min(3, replaceAll.length()); min >= 0; min--) {
            String substring = replaceAll.substring(0, min);
            List list = (List) kj0Var.f39914x.get(substring);
            if (list != null && !list.isEmpty()) {
                List list2 = (List) kj0Var.f39915y.get(substring);
                if (list2 != null && !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (replaceAll.length() - min >= ((String) it.next()).replace(" ", "").length()) {
                            z10 = true;
                            break;
                        }
                    }
                }
            }
            if (z10) {
                break;
            }
        }
        if (!z10) {
            if (!TextUtils.isEmpty(kj0Var.X)) {
                kj0Var.X = null;
                kj0Var.y(null);
            }
        } else if (!TextUtils.equals(kj0Var.X, replaceAll)) {
            kj0Var.X = replaceAll;
            kj0Var.y(replaceAll);
        }
    }

    public static String s(LaunchActivity launchActivity, TLRPC.User user, String str) {
        HashMap hashMap = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(launchActivity.getResources().getAssets().open("countries.txt")));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String[] split = readLine.split(";");
                hashMap.put(split[0], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        if (!str.startsWith("+")) {
            if (user != null && !TextUtils.isEmpty(user.phone)) {
                String str2 = user.phone;
                for (int i10 = 4; i10 >= 1; i10--) {
                    String substring = str2.substring(0, i10);
                    if (((String) hashMap.get(substring)) != null) {
                        return a4.w.n("+", substring, str);
                    }
                }
            } else {
                return "+".concat(str);
            }
        }
        return str;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        AndroidUtilities.runOnUIThread(new dj0(this, 0), 50L);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 4, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.g6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 8388608, null, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.g6.f23189k6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 32, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.g6.f23206l6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 65568, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39908e, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39908e, 8388608, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39908e, 32, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39908e, 65568, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.K, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.K, 32, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.K, 65568, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.M, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.M, 8388608, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.M, 32, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.M, 65568, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39907c, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.D7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39907c, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.E7));
        return arrayList;
    }

    @Override
    public final void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
        if (this.C) {
            this.C = false;
            return;
        }
        this.A = true;
        this.K.setText(((lt) this.f39913w.get(i10)).f40274c);
        this.A = false;
    }

    public final void r() {
        String str;
        this.D = true;
        AndroidUtilities.updateViewVisibilityAnimated(this.T, false, 0.5f, true);
        AndroidUtilities.updateViewVisibilityAnimated(this.U, true, 0.5f, true);
        String str2 = "+" + this.K.getText().toString() + this.M.getText().toString();
        String obj = this.d.getEditText().getText().toString();
        String obj2 = this.f39908e.getEditText().getText().toString();
        if (this.f39911r.getVisibility() == 0) {
            str = this.f39911r.getEditText().getText().toString();
        } else {
            str = "";
        }
        TLRPC.TL_contacts_importContacts tL_contacts_importContacts = new TLRPC.TL_contacts_importContacts();
        TLRPC.TL_inputPhoneContact tL_inputPhoneContact = new TLRPC.TL_inputPhoneContact();
        tL_inputPhoneContact.first_name = obj;
        tL_inputPhoneContact.last_name = obj2;
        tL_inputPhoneContact.phone = str2;
        if (!TextUtils.isEmpty(str)) {
            tL_inputPhoneContact.flags = 1 | tL_inputPhoneContact.flags;
            TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
            tL_inputPhoneContact.note = tL_textWithEntities;
            tL_textWithEntities.text = str;
        }
        tL_contacts_importContacts.contacts.add(tL_inputPhoneContact);
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_importContacts, new x9(this, tL_inputPhoneContact, tL_contacts_importContacts, 26), 2), this.J);
        if (this.O.f29211a.f26324q) {
            Context context = getContext();
            ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
            ContentProviderOperation.Builder newInsert = ContentProviderOperation.newInsert(ContactsContract.RawContacts.CONTENT_URI);
            newInsert.withValue("account_type", null);
            newInsert.withValue("account_name", null);
            arrayList.add(newInsert.build());
            Uri uri = ContactsContract.Data.CONTENT_URI;
            ContentProviderOperation.Builder withValue = ContentProviderOperation.newInsert(uri).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/name");
            if (!TextUtils.isEmpty(obj)) {
                withValue = withValue.withValue("data2", obj);
            }
            if (!TextUtils.isEmpty(obj2)) {
                withValue = withValue.withValue("data2", obj2);
            }
            arrayList.add(withValue.build());
            if (str2 != null && !str2.isEmpty()) {
                arrayList.add(ContentProviderOperation.newInsert(uri).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/phone_v2").withValue("data1", str2).withValue("data2", 2).build());
            }
            try {
                context.getContentResolver().applyBatch("com.android.contacts", arrayList);
            } catch (OperationApplicationException | RemoteException e10) {
                e10.printStackTrace();
            }
        }
    }

    @Override
    public final void show() {
        super.show();
        this.d.getEditText().requestFocus();
        this.d.getEditText().setSelection(this.d.getEditText().length());
        AndroidUtilities.runOnUIThread(new dj0(this, 1), 50L);
    }

    public final void t(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            ViewPropertyAnimator animate = this.S.animate();
            org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.f29800f;
            animate.setInterpolator(jrVar).translationY(AndroidUtilities.dp(30.0f)).setDuration(150L);
            this.W.animate().setInterpolator(jrVar).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
            this.K.animate().setInterpolator(jrVar).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
            return;
        }
        this.S.animate().setInterpolator(AndroidUtilities.overshootInterpolator).translationY(0.0f).setDuration(350L).start();
        ViewPropertyAnimator animate2 = this.W.animate();
        org.telegram.ui.Components.jr jrVar2 = org.telegram.ui.Components.jr.f29800f;
        animate2.setInterpolator(jrVar2).translationX(0.0f).setDuration(150L);
        this.K.animate().setInterpolator(jrVar2).translationX(0.0f).setDuration(150L);
        this.S.setText(charSequence);
    }

    public final void u(java.lang.String r12, org.telegram.ui.lt r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kj0.u(java.lang.String, org.telegram.ui.lt):void");
    }

    public final void v(String str, boolean z10) {
        String country;
        this.E = str;
        this.F = z10;
        if (!TextUtils.isEmpty(str)) {
            TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
            if (this.E.startsWith("+")) {
                this.K.setText(this.E.substring(1));
            } else if (!this.F && currentUser != null && !TextUtils.isEmpty(currentUser.phone)) {
                String str2 = currentUser.phone;
                int i10 = 4;
                while (true) {
                    if (i10 >= 1) {
                        List list = (List) this.f39914x.get(str2.substring(0, i10));
                        if (list != null && list.size() > 0) {
                            String str3 = ((lt) list.get(0)).f40274c;
                            this.K.setText(str3);
                            if (str3.endsWith("0") && this.E.startsWith("0")) {
                                this.E = this.E.substring(1);
                            }
                        } else {
                            i10--;
                        }
                    } else if (Build.VERSION.SDK_INT >= 23) {
                        Context context = ApplicationLoader.applicationContext;
                        if (context != null) {
                            country = ((TelephonyManager) context.getSystemService(TelephonyManager.class)).getSimCountryIso().toUpperCase(Locale.US);
                        } else {
                            country = Locale.getDefault().getCountry();
                        }
                        this.K.setText(country);
                        if (country.endsWith("0") && this.E.startsWith("0")) {
                            this.E = this.E.substring(1);
                        }
                    }
                }
                this.M.setText(this.E);
            } else {
                this.K.setText(this.E);
            }
            this.E = null;
        }
    }

    public final void w(boolean z10) {
        float f9;
        ViewPropertyAnimator animate = this.Q.animate();
        float f10 = 0.0f;
        if (z10) {
            f9 = -AndroidUtilities.dp(21.33f);
        } else {
            f9 = 0.0f;
        }
        ViewPropertyAnimator translationY = animate.translationY(f9);
        org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.h;
        b.q(translationY, jrVar, 420L);
        ViewPropertyAnimator animate2 = this.f39909f.animate();
        if (z10) {
            f10 = -AndroidUtilities.dp(10.665f);
        }
        animate2.translationY(f10).setInterpolator(jrVar).setDuration(420L).start();
    }

    public final void x(boolean z10) {
        int i10;
        float f9;
        int i11;
        float f10;
        float f11;
        float f12;
        boolean z11 = this.O.f29211a.f26324q;
        final boolean z12 = !z11;
        float f13 = 0.0f;
        int i12 = 0;
        if (z10) {
            this.f39910n.setVisibility(0);
            ViewPropertyAnimator animate = this.f39910n.animate();
            if (!z11) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f11);
            org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.h;
            alpha.setInterpolator(jrVar).setDuration(420L).withEndAction(new Runnable(this) {
                public final kj0 f38602b;

                {
                    this.f38602b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            boolean z13 = z12;
                            kj0 kj0Var = this.f38602b;
                            if (!z13) {
                                kj0Var.f39910n.setVisibility(4);
                                return;
                            } else {
                                kj0Var.getClass();
                                return;
                            }
                        case 1:
                            boolean z14 = z12;
                            kj0 kj0Var2 = this.f38602b;
                            if (!z14) {
                                kj0Var2.h.setVisibility(4);
                                return;
                            } else {
                                kj0Var2.getClass();
                                return;
                            }
                        default:
                            boolean z15 = z12;
                            kj0 kj0Var3 = this.f38602b;
                            if (z15) {
                                kj0Var3.f39911r.setVisibility(4);
                                return;
                            } else {
                                kj0Var3.getClass();
                                return;
                            }
                    }
                }
            }).start();
            this.h.setVisibility(0);
            ViewPropertyAnimator animate2 = this.h.animate();
            if (!z11) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            animate2.alpha(f12).setInterpolator(jrVar).setDuration(420L).withEndAction(new Runnable(this) {
                public final kj0 f38602b;

                {
                    this.f38602b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            boolean z13 = z12;
                            kj0 kj0Var = this.f38602b;
                            if (!z13) {
                                kj0Var.f39910n.setVisibility(4);
                                return;
                            } else {
                                kj0Var.getClass();
                                return;
                            }
                        case 1:
                            boolean z14 = z12;
                            kj0 kj0Var2 = this.f38602b;
                            if (!z14) {
                                kj0Var2.h.setVisibility(4);
                                return;
                            } else {
                                kj0Var2.getClass();
                                return;
                            }
                        default:
                            boolean z15 = z12;
                            kj0 kj0Var3 = this.f38602b;
                            if (z15) {
                                kj0Var3.f39911r.setVisibility(4);
                                return;
                            } else {
                                kj0Var3.getClass();
                                return;
                            }
                    }
                }
            }).start();
            this.f39911r.setVisibility(0);
            ViewPropertyAnimator animate3 = this.f39911r.animate();
            if (z11) {
                f13 = 1.0f;
            }
            animate3.alpha(f13).setInterpolator(jrVar).setDuration(420L).withEndAction(new Runnable(this) {
                public final kj0 f38602b;

                {
                    this.f38602b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            boolean z13 = z12;
                            kj0 kj0Var = this.f38602b;
                            if (!z13) {
                                kj0Var.f39910n.setVisibility(4);
                                return;
                            } else {
                                kj0Var.getClass();
                                return;
                            }
                        case 1:
                            boolean z14 = z12;
                            kj0 kj0Var2 = this.f38602b;
                            if (!z14) {
                                kj0Var2.h.setVisibility(4);
                                return;
                            } else {
                                kj0Var2.getClass();
                                return;
                            }
                        default:
                            boolean z15 = z12;
                            kj0 kj0Var3 = this.f38602b;
                            if (z15) {
                                kj0Var3.f39911r.setVisibility(4);
                                return;
                            } else {
                                kj0Var3.getClass();
                                return;
                            }
                    }
                }
            }).start();
            return;
        }
        this.f39910n.animate().cancel();
        if (!z11) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        this.f39910n.setVisibility(i10);
        if (!z11) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        this.f39910n.setAlpha(f9);
        this.h.animate().cancel();
        if (!z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        this.h.setVisibility(i11);
        if (!z11) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.h.setAlpha(f10);
        this.f39911r.animate().cancel();
        if (!z11) {
            i12 = 4;
        }
        this.f39911r.setVisibility(i12);
        if (z11) {
            f13 = 1.0f;
        }
        this.f39911r.setAlpha(f13);
    }

    public final void y(String str) {
        if (this.Y >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.Y, true);
            this.Y = -1;
        }
        if (TextUtils.isEmpty(str)) {
            b.q(this.N.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f), org.telegram.ui.Components.jr.h, 420L);
            this.v.setText("");
            w(true);
            return;
        }
        b.q(this.N.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f), org.telegram.ui.Components.jr.h, 420L);
        this.N.setImageDrawable(new org.telegram.ui.Components.np(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(3.0f), getThemedColor(org.telegram.ui.ActionBar.g6.f23222m5)));
        this.v.setText("");
        w(true);
        tm tmVar = new tm(26, this, str);
        TLRPC.TL_contact tL_contact = ContactsController.getInstance(this.currentAccount).contactsByPhone.get(qe.b.d(str, false));
        if (tL_contact != null) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_contact.user_id));
            if (user != null) {
                tmVar.run(user);
                return;
            } else {
                MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new xe0((Object) this, (Object) tL_contact, (Object) tmVar, 6));
                return;
            }
        }
        TLRPC.TL_contacts_resolvePhone tL_contacts_resolvePhone = new TLRPC.TL_contacts_resolvePhone();
        tL_contacts_resolvePhone.phone = qe.b.d(str, false);
        this.Y = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_resolvePhone, new u80(9, this, tmVar));
    }

    @Override
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
