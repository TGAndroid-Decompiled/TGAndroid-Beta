package org.telegram.ui;

import android.content.ContentProviderOperation;
import android.content.Context;
import android.content.OperationApplicationException;
import android.net.Uri;
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
public final class ik0 extends org.telegram.ui.ActionBar.e3 implements AdapterView.OnItemSelectedListener {
    public static final int f37151d0 = 0;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public String I;
    public boolean J;
    public String K;
    public String L;
    public final org.telegram.ui.ActionBar.m2 M;
    public final int N;
    public final gk0 O;
    public final View P;
    public final gk0 Q;
    public final ImageView R;
    public final org.telegram.ui.Components.aq S;
    public final TextView T;
    public final LinearLayout U;
    public int V;
    public final fk0 W;
    public final TextView X;
    public final RadialProgressView Y;
    public final FrameLayout Z;
    public final TextView f37152a0;
    public final LinearLayout f37153b;
    public String f37154b0;
    public final org.telegram.ui.Components.gr f37155c;
    public int f37156c0;
    public final org.telegram.ui.Components.xd0 d;
    public final org.telegram.ui.Components.xd0 e;
    public final FrameLayout f37157f;
    public final View h;
    public final di.d f37158n;
    public final org.telegram.ui.Components.xd0 f37159r;
    public final org.telegram.ui.Components.yd0 f37160s;
    public final org.telegram.ui.Components.da0 v;
    public final ArrayList f37161w;
    public final HashMap f37162x;
    public final HashMap f37163y;

    public ik0(android.content.Context r25, org.telegram.ui.ActionBar.m2 r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ik0.<init>(android.content.Context, org.telegram.ui.ActionBar.m2):void");
    }

    public static void n(ik0 ik0Var, TLObject tLObject, mt mtVar) {
        TLRPC.User user;
        if (tLObject instanceof TLRPC.TL_contacts_resolvedPeer) {
            TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
            MessagesController.getInstance(ik0Var.currentAccount).putUsers(tL_contacts_resolvedPeer.users, false);
            MessagesController.getInstance(ik0Var.currentAccount).putChats(tL_contacts_resolvedPeer.chats, false);
            long peerDialogId = DialogObject.getPeerDialogId(tL_contacts_resolvedPeer.peer);
            if (peerDialogId >= 0) {
                user = MessagesController.getInstance(ik0Var.currentAccount).getUser(Long.valueOf(peerDialogId));
                mtVar.run(user);
            }
        }
        user = null;
        mtVar.run(user);
    }

    public static void o(ik0 ik0Var, TLRPC.TL_contacts_importedContacts tL_contacts_importedContacts, TLRPC.TL_inputPhoneContact tL_inputPhoneContact, TLRPC.TL_error tL_error, TLRPC.TL_contacts_importContacts tL_contacts_importContacts) {
        org.telegram.ui.ActionBar.m2 m2Var = ik0Var.M;
        ik0Var.H = false;
        if (tL_contacts_importedContacts != null) {
            if (!tL_contacts_importedContacts.users.isEmpty()) {
                MessagesController.getInstance(ik0Var.currentAccount).putUsers(tL_contacts_importedContacts.users, false);
                MessagesController.getInstance(ik0Var.currentAccount).openChatOrProfileWith(tL_contacts_importedContacts.users.get(0), null, ik0Var.M, 1, false);
                ik0Var.dismiss();
                return;
            } else if (m2Var.getParentActivity() == null) {
                return;
            } else {
                AndroidUtilities.updateViewVisibilityAnimated(ik0Var.X, true, 0.5f, true);
                AndroidUtilities.updateViewVisibilityAnimated(ik0Var.Y, false, 0.5f, true);
                org.telegram.ui.Components.g5.u(m2Var, tL_inputPhoneContact.first_name, tL_inputPhoneContact.last_name, tL_inputPhoneContact.phone);
                return;
            }
        }
        AndroidUtilities.updateViewVisibilityAnimated(ik0Var.X, true, 0.5f, true);
        AndroidUtilities.updateViewVisibilityAnimated(ik0Var.Y, false, 0.5f, true);
        org.telegram.ui.Components.g5.e0(ik0Var.currentAccount, tL_error, m2Var, tL_contacts_importContacts, new Object[0]);
    }

    public static void s(ik0 ik0Var) {
        String replaceAll = (ik0Var.O.getText().toString() + ik0Var.Q.getText().toString()).replaceAll("[^\\d]+", "");
        boolean z10 = false;
        for (int min = Math.min(3, replaceAll.length()); min >= 0; min--) {
            String substring = replaceAll.substring(0, min);
            List list = (List) ik0Var.f37162x.get(substring);
            if (list != null && !list.isEmpty()) {
                List list2 = (List) ik0Var.f37163y.get(substring);
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
            if (!TextUtils.isEmpty(ik0Var.f37154b0)) {
                ik0Var.f37154b0 = null;
                ik0Var.A(null);
            }
        } else if (!TextUtils.equals(ik0Var.f37154b0, replaceAll)) {
            ik0Var.f37154b0 = replaceAll;
            ik0Var.A(replaceAll);
        }
    }

    public static String u(LaunchActivity launchActivity, TLRPC.User user, String str) {
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
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (!str.startsWith("+")) {
            if (user != null && !TextUtils.isEmpty(user.phone)) {
                String str2 = user.phone;
                for (int i10 = 4; i10 >= 1; i10--) {
                    String substring = str2.substring(0, i10);
                    if (((String) hashMap.get(substring)) != null) {
                        return a1.g.p("+", substring, str);
                    }
                }
            } else {
                return "+".concat(str);
            }
        }
        return str;
    }

    public final void A(String str) {
        if (this.f37156c0 >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f37156c0, true);
            this.f37156c0 = -1;
        }
        if (TextUtils.isEmpty(str)) {
            org.telegram.messenger.yh.s(this.R.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f), org.telegram.ui.Components.es.h, 420L);
            this.v.setText("");
            y(true);
            return;
        }
        org.telegram.messenger.yh.s(this.R.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f), org.telegram.ui.Components.es.h, 420L);
        this.R.setImageDrawable(new org.telegram.ui.Components.gq(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(3.0f), getThemedColor(org.telegram.ui.ActionBar.g6.f20063m5)));
        this.v.setText("");
        y(true);
        mt mtVar = new mt(8, this, str);
        TLRPC.TL_contact tL_contact = ContactsController.getInstance(this.currentAccount).contactsByPhone.get(jf.b.d(str, false));
        if (tL_contact != null) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_contact.user_id));
            if (user != null) {
                mtVar.run(user);
                return;
            } else {
                MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new uf0((Object) this, (Object) tL_contact, (Object) mtVar, 6));
                return;
            }
        }
        TLRPC.TL_contacts_resolvePhone tL_contacts_resolvePhone = new TLRPC.TL_contacts_resolvePhone();
        tL_contacts_resolvePhone.phone = jf.b.d(str, false);
        this.f37156c0 = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_resolvePhone, new fc0(6, this, mtVar));
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        AndroidUtilities.runOnUIThread(new bk0(this, 0), 50L);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 4, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.g6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 8388608, null, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.g6.f20028k6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 32, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.g6.f20045l6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 65568, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.e, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.e, 8388608, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.e, 32, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.e, 65568, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 32, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 65568, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 8388608, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 32, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 65568, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37155c, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.D7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37155c, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.E7));
        return arrayList;
    }

    @Override
    public final void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
        if (this.G) {
            this.G = false;
            return;
        }
        this.E = true;
        this.O.setText(((au) this.f37161w.get(i10)).f34341c);
        this.E = false;
    }

    @Override
    public final void show() {
        super.show();
        this.d.getEditText().requestFocus();
        this.d.getEditText().setSelection(this.d.getEditText().length());
        AndroidUtilities.runOnUIThread(new bk0(this, 1), 50L);
    }

    public final void t() {
        String str;
        this.H = true;
        AndroidUtilities.updateViewVisibilityAnimated(this.X, false, 0.5f, true);
        AndroidUtilities.updateViewVisibilityAnimated(this.Y, true, 0.5f, true);
        String str2 = "+" + this.O.getText().toString() + this.Q.getText().toString();
        String obj = this.d.getEditText().getText().toString();
        String obj2 = this.e.getEditText().getText().toString();
        if (this.f37159r.getVisibility() == 0) {
            str = this.f37159r.getEditText().getText().toString();
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
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_importContacts, new fa(this, tL_inputPhoneContact, tL_contacts_importContacts, 26), 2), this.N);
        if (this.S.f23604a.f23092q) {
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
            } catch (OperationApplicationException | RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    public final void v(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            ViewPropertyAnimator animate = this.W.animate();
            org.telegram.ui.Components.es esVar = org.telegram.ui.Components.es.f24771f;
            animate.setInterpolator(esVar).translationY(AndroidUtilities.dp(30.0f)).setDuration(150L);
            this.f37152a0.animate().setInterpolator(esVar).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
            this.O.animate().setInterpolator(esVar).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
            return;
        }
        this.W.animate().setInterpolator(AndroidUtilities.overshootInterpolator).translationY(0.0f).setDuration(350L).start();
        ViewPropertyAnimator animate2 = this.f37152a0.animate();
        org.telegram.ui.Components.es esVar2 = org.telegram.ui.Components.es.f24771f;
        animate2.setInterpolator(esVar2).translationX(0.0f).setDuration(150L);
        this.O.animate().setInterpolator(esVar2).translationX(0.0f).setDuration(150L);
        this.W.setText(charSequence);
    }

    public final void w(java.lang.String r12, org.telegram.ui.au r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ik0.w(java.lang.String, org.telegram.ui.au):void");
    }

    public final void x(String str, boolean z10) {
        String country;
        this.I = str;
        this.J = z10;
        if (!TextUtils.isEmpty(str)) {
            TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
            if (this.I.startsWith("+")) {
                this.O.setText(this.I.substring(1));
            } else if (!this.J && currentUser != null && !TextUtils.isEmpty(currentUser.phone)) {
                String str2 = currentUser.phone;
                int i10 = 4;
                while (true) {
                    if (i10 >= 1) {
                        List list = (List) this.f37162x.get(str2.substring(0, i10));
                        if (list != null && list.size() > 0) {
                            String str3 = ((au) list.get(0)).f34341c;
                            this.O.setText(str3);
                            if (str3.endsWith("0") && this.I.startsWith("0")) {
                                this.I = this.I.substring(1);
                            }
                        } else {
                            i10--;
                        }
                    } else {
                        Context context = ApplicationLoader.applicationContext;
                        if (context != null) {
                            country = ((TelephonyManager) context.getSystemService(TelephonyManager.class)).getSimCountryIso().toUpperCase(Locale.US);
                        } else {
                            country = Locale.getDefault().getCountry();
                        }
                        this.O.setText(country);
                        if (country.endsWith("0") && this.I.startsWith("0")) {
                            this.I = this.I.substring(1);
                        }
                    }
                }
                this.Q.setText(this.I);
            } else {
                this.O.setText(this.I);
            }
            this.I = null;
        }
    }

    public final void y(boolean z10) {
        float f7;
        ViewPropertyAnimator animate = this.U.animate();
        float f10 = 0.0f;
        if (z10) {
            f7 = -AndroidUtilities.dp(21.33f);
        } else {
            f7 = 0.0f;
        }
        ViewPropertyAnimator translationY = animate.translationY(f7);
        org.telegram.ui.Components.es esVar = org.telegram.ui.Components.es.h;
        org.telegram.messenger.yh.s(translationY, esVar, 420L);
        ViewPropertyAnimator animate2 = this.f37157f.animate();
        if (z10) {
            f10 = -AndroidUtilities.dp(10.665f);
        }
        animate2.translationY(f10).setInterpolator(esVar).setDuration(420L).start();
    }

    public final void z(boolean z10) {
        int i10;
        float f7;
        int i11;
        float f10;
        float f11;
        float f12;
        boolean z11 = this.S.f23604a.f23092q;
        final boolean z12 = !z11;
        float f13 = 0.0f;
        int i12 = 0;
        if (z10) {
            this.f37158n.setVisibility(0);
            ViewPropertyAnimator animate = this.f37158n.animate();
            if (!z11) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f11);
            org.telegram.ui.Components.es esVar = org.telegram.ui.Components.es.h;
            alpha.setInterpolator(esVar).setDuration(420L).withEndAction(new Runnable(this) {
                public final ik0 f35630b;

                {
                    this.f35630b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            boolean z13 = z12;
                            ik0 ik0Var = this.f35630b;
                            if (!z13) {
                                ik0Var.f37158n.setVisibility(4);
                                return;
                            } else {
                                ik0Var.getClass();
                                return;
                            }
                        case 1:
                            boolean z14 = z12;
                            ik0 ik0Var2 = this.f35630b;
                            if (!z14) {
                                ik0Var2.h.setVisibility(4);
                                return;
                            } else {
                                ik0Var2.getClass();
                                return;
                            }
                        default:
                            boolean z15 = z12;
                            ik0 ik0Var3 = this.f35630b;
                            if (z15) {
                                ik0Var3.f37159r.setVisibility(4);
                                return;
                            } else {
                                ik0Var3.getClass();
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
            animate2.alpha(f12).setInterpolator(esVar).setDuration(420L).withEndAction(new Runnable(this) {
                public final ik0 f35630b;

                {
                    this.f35630b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            boolean z13 = z12;
                            ik0 ik0Var = this.f35630b;
                            if (!z13) {
                                ik0Var.f37158n.setVisibility(4);
                                return;
                            } else {
                                ik0Var.getClass();
                                return;
                            }
                        case 1:
                            boolean z14 = z12;
                            ik0 ik0Var2 = this.f35630b;
                            if (!z14) {
                                ik0Var2.h.setVisibility(4);
                                return;
                            } else {
                                ik0Var2.getClass();
                                return;
                            }
                        default:
                            boolean z15 = z12;
                            ik0 ik0Var3 = this.f35630b;
                            if (z15) {
                                ik0Var3.f37159r.setVisibility(4);
                                return;
                            } else {
                                ik0Var3.getClass();
                                return;
                            }
                    }
                }
            }).start();
            this.f37159r.setVisibility(0);
            ViewPropertyAnimator animate3 = this.f37159r.animate();
            if (z11) {
                f13 = 1.0f;
            }
            animate3.alpha(f13).setInterpolator(esVar).setDuration(420L).withEndAction(new Runnable(this) {
                public final ik0 f35630b;

                {
                    this.f35630b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            boolean z13 = z12;
                            ik0 ik0Var = this.f35630b;
                            if (!z13) {
                                ik0Var.f37158n.setVisibility(4);
                                return;
                            } else {
                                ik0Var.getClass();
                                return;
                            }
                        case 1:
                            boolean z14 = z12;
                            ik0 ik0Var2 = this.f35630b;
                            if (!z14) {
                                ik0Var2.h.setVisibility(4);
                                return;
                            } else {
                                ik0Var2.getClass();
                                return;
                            }
                        default:
                            boolean z15 = z12;
                            ik0 ik0Var3 = this.f35630b;
                            if (z15) {
                                ik0Var3.f37159r.setVisibility(4);
                                return;
                            } else {
                                ik0Var3.getClass();
                                return;
                            }
                    }
                }
            }).start();
            return;
        }
        this.f37158n.animate().cancel();
        if (!z11) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        this.f37158n.setVisibility(i10);
        if (!z11) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f37158n.setAlpha(f7);
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
        this.f37159r.animate().cancel();
        if (!z11) {
            i12 = 4;
        }
        this.f37159r.setVisibility(i12);
        if (z11) {
            f13 = 1.0f;
        }
        this.f37159r.setAlpha(f13);
    }

    @Override
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
